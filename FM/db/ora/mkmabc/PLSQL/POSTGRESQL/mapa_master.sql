CREATE OR REPLACE FUNCTION mapa_master$f_get_col (
	 IN i_view_nm VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	指定されたビューに対するカラム情報を返す
<REMARKS>
<ARGUMENTS>
<IN>	i_view_nm
		ビュー名
<RETURN VALUE>
	カラム情報
<HISTORY>
**********************************************************/
DECLARE
	l_tmp	VARCHAR ;
	x	RECORD ;
BEGIN
	l_tmp := '(' ;

	FOR x IN
		SELECT	t.column_name
		FROM	information_schema.columns t
		WHERE	0=0
		AND	t.table_name = LOWER(i_view_nm)
		ORDER BY t.ordinal_position
	LOOP
		l_tmp := l_tmp || x.column_name || ',' ;
	END LOOP;
	l_tmp := l_tmp || ')' ;
	l_tmp := REPLACE(l_tmp, ',)', ')') ;

	RETURN l_tmp ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_master$f_get_body (
	 IN i_view_nm VARCHAR,
	 IN i_mst_nm VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	指定されたビューに対する定義情報を返す
<REMARKS>
	mam_view_definitionに定義情報がない場合は、定義情報を登録する
<ARGUMENTS>
<IN>	i_view_nm
		ビュー名
<IN>	i_mst_nm
		マスタ名
<RETURN VALUE>
	ビューの定義情報
<HISTORY>
**********************************************************/
DECLARE
	l_tmp VARCHAR ;
BEGIN
	SELECT	m.view_definition
	INTO	 l_tmp
	FROM	mam_view_definition m
	WHERE	0=0
	AND	m.table_name = LOWER(i_view_nm)
	;
	IF l_tmp IS NULL THEN
		SELECT	MIN(t.view_definition)
		INTO	STRICT l_tmp
		FROM	information_schema.views t
		WHERE	0=0
		AND	t.table_name = LOWER(i_view_nm)
		;

		INSERT INTO mam_view_definition(table_name,view_definition, mst_nm) VALUES (LOWER(i_view_nm), l_tmp, i_mst_nm);
	END IF;

	l_tmp := REPLACE(l_tmp, '"', '') ;
	
	RETURN l_tmp ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_regexp_rep (
	INOUT io_view_body VARCHAR,
	IN i_before VARCHAR,
	IN i_after VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	文字列置換処理
<REMARKS>
	SQL文に使用される文字列をエスケープ処理してから置換する
<ARGUMENTS>
<INOUT>	io_view_body
		ビュー定義
<IN>	i_before
		変更前
<IN>	i_after
		変更後
<HISTORY>
**********************************************************/
DECLARE
	l_before VARCHAR(200) ;
BEGIN
	l_before := REPLACE(i_before, '.', '\.') ;
	l_before := REPLACE(l_before, '(', '\(') ;
	l_before := REPLACE(l_before, ')', '\)') ;
	l_before := REPLACE(l_before, '*', '\*') ;
	l_before := REPLACE(l_before, '$', '\$') ;
	io_view_body := REGEXP_REPLACE(io_view_body, l_before, i_after, 'ig') ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_rep_all_cmn_ref_tbl (
	INOUT io_view_body VARCHAR,
	IN i_mst VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_db_link_nm VARCHAR,
	IN i_lcl_str VARCHAR,
	IN i_co_view_base_nm VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	マスタ設定区分に応じて、参照先テーブルを置換する
<REMARKS>
	FROM句のうち、I_LCL_STRで指定したもののみを置換する
	例）MAM_BP[I_LCL_STR]_ALL
	ロケールテーブルを参照しないビューに対する置換を想定している
<ARGUMENTS>
<INOUT>	io_view_body
		ビュー定義
<IN>	i_mst
		マスタ名(MAM_XXX)
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<IN>	i_lcl_str
		マスタ名に追加する文字列（'' または '_LCL'）
<IN>	i_co_view_base_nm
		View名称
<HISTORY>
**********************************************************/
DECLARE
	c_all		CONSTANT VARCHAR := '_all' ;
	c_cmn		CONSTANT VARCHAR := '_cmn' ;

	v_org_co_pred VARCHAR ;
	v_lcl_co_pred VARCHAR ;

	-- ViewのORGテーブル名
	v_table_from  VARCHAR ;
	v_table_to VARCHAR ;

	-- ViewのORGテーブルの別名
	v_alias_org  VARCHAR ;

BEGIN
	
	v_alias_org := LOWER(i_co_view_base_nm || '_' || i_mst || i_lcl_str || c_all || '_org');
	
	v_table_from :=  LOWER(i_mst || i_lcl_str || c_all);
	v_table_to :=  LOWER( i_mst || i_lcl_str || c_cmn);

	IF i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM') THEN
		--共通マスタを参照させる
		
		-- co_cd の条件を除去
		-- LCLテーブルではない場合の例）
		-- (mam_bac_ac_$s_mam_bac_ac_all_org.co_cd)::text = (( SELECT mam_bac_ac_$s_fct_context.co_cd
		-- FROM fct_context mam_bac_ac_$s_fct_context
		-- WHERE (mam_bac_ac_$s_fct_context.pid = (pg_backend_pid())::numeric)))::text
		v_org_co_pred :=  '\(' 
			|| '(' || replace(v_alias_org, '$', '\$') || '\.)?co_cd\)::text[\s\r\n]+=[\s\r\n]+\(\([\s\r\n]+SELECT[\s\r\n]+.+[\s\r\n]+WHERE[\s\r\n]*\(' 
			|| replace(i_co_view_base_nm, '$', '\$') ||'_fct_context\.pid[\s\r\n]+=[\s\r\n]+\(pg_backend_pid\(\)\)::numeric\)\)\)::text';
		io_view_body := REGEXP_REPLACE(io_view_body, v_org_co_pred, '0 = 0', 'ig') ;
		
		-- LCLテーブルの場合の例）
		-- (mam_itm_lcl_$u_mam_itm_lcl_all_org.co_cd)::text = (fcpa_context$f_get_co_cd())::text
		v_lcl_co_pred :=  '\(' 
			|| '(' ||  replace(v_alias_org, '$', '\$') || '\.)?co_cd\)::text[\s\r\n]+=[\s\r\n]+\(fcpa_context\$f_get_co_cd\(\)\)::text';
		io_view_body := REGEXP_REPLACE(io_view_body, v_lcl_co_pred, '0 = 0', 'ig') ;
		
		-- テーブル名変更
		CALL mapa_master$p_regexp_rep(io_view_body, v_table_from || '[\s\r\n]+', v_table_to || ' ') ;

	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_rep_all_cmn (
	INOUT io_view_body VARCHAR,
	IN i_mst VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_db_link_nm VARCHAR,
	IN i_co_view_base_nm VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	マスタ設定区分に応じて、参照先テーブルを切り替える
<REMARKS>
<ARGUMENTS>
<INOUT>	io_view_body
		ビュー定義
<IN>	i_mst
		マスタ名(MAM_XXX)
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<IN>	i_co_view_base_nm
		View名
<HISTORY>
**********************************************************/
DECLARE
BEGIN
	CALL mapa_master$p_rep_all_cmn_ref_tbl(io_view_body, i_mst, i_mst_set_typ, i_db_link_nm, '', i_co_view_base_nm) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_rep_all_cmn_bp (
	INOUT io_view_body VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_co_view_nm VARCHAR,
	IN i_mst VARCHAR,
	IN i_mst_nm VARCHAR,
	IN i_lcl_flg CHARACTER
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先マスタ専用のマスタ設定区分に応じた切り替え処理
<REMARKS>
<ARGUMENTS>
<INOUT>	io_view_body
		ビュー定義
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_co_view_nm
		View名称
<IN>	i_mst
		マスタ名(MAM_XXX)
<IN>	i_mst_nm
		マスタ名(XXX)
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
	l_view_alias	VARCHAR ;
	l_where_bp_com_cmn	VARCHAR ;
BEGIN

	IF i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM') THEN
		l_view_alias := i_co_view_nm || '_' || LOWER(i_mst) || '_all_org';
		l_where_bp_com_cmn := l_view_alias || '.all_com_flg = ''1'' and not exists (select ''x'' from mam_bp_com com where '
			|| l_view_alias || '.bp_cd = com.bp_cd and com.ex_flg = ''1'') or exists (select ''x'' from mam_bp_com com where '
			|| l_view_alias || '.bp_cd = com.bp_cd and com.ex_flg = ''0'')' ;
		CALL mapa_master$p_regexp_rep(io_view_body,  '0 = 0', l_where_bp_com_cmn) ;		
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;
CREATE OR REPLACE PROCEDURE mapa_master$p_rep_mam_bp_com_all (
	INOUT io_view_body VARCHAR,
	IN i_mst VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_db_link_nm VARCHAR,
	IN i_co_view_nm VARCHAR,
	IN i_lcl_flg CHARACTER
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先マスタの参照先テーブル（参照先テーブルのLCLテーブルを含む）を切り替える
<REMARKS>
<ARGUMENTS>
<INOUT>	io_view_body
		ビュー定義
<IN>	i_mst
		マスタ名(MAM_XXX)
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名(@[DBLINK_NAME])
<IN>	i_co_view_nm
		View名称
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
	c_all			CONSTANT VARCHAR := '_all' ;
	c_cmn			CONSTANT VARCHAR := '_cmn' ;
	c_lcl			CONSTANT VARCHAR := '_lcl' ;
	c_org			CONSTANT VARCHAR := '_org' ;
	l_view_alias	VARCHAR ;
	v_table_from	VARCHAR ;
	v_table_to		VARCHAR ;
	v_org_co_pred	VARCHAR ;
	l_prnt_lcl_all	VARCHAR ;
	l_prnt_lcl_cmn	VARCHAR ;
	l_lcl_alias		VARCHAR ;
	l_lcl_co_pred	VARCHAR ;
BEGIN

	IF i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM_COM') THEN
		v_table_from :=  LOWER(i_mst || c_all);
		l_view_alias := i_co_view_nm || '_' || LOWER(i_mst) || '_all_org';
		l_lcl_alias  := i_co_view_nm || '_' || LOWER(i_mst) || c_lcl || c_all || c_lcl;
		l_prnt_lcl_all := l_view_alias || '.prnt_lcl_cd' ;
		l_prnt_lcl_cmn := 'COALESCE(' || l_view_alias || '.prnt_lcl_cd, (select def_locale_cd from fcm_co ' 
			|| 'where co_cd = (SELECT co_cd FROM fct_context fcm_co_fct_context WHERE pid = pg_backend_pid()))::character varying(7)) AS prnt_lcl_cd' ;
		l_lcl_co_pred := '(' || l_view_alias || '.co_cd)::text = (' || l_lcl_alias || '.co_cd)::text';
		IF i_co_view_nm = 'mavm_bp' THEN
			v_table_to :=  LOWER('mavm_bp_cmn_srch');
			v_org_co_pred :=  '\(' 
				|| replace(l_view_alias, '$', '\$') || '\.co_cd\)::text[\s\r\n]+=[\s\r\n]+\(\([\s\r\n]+SELECT[\s\r\n]+.+[\s\r\n]+WHERE[\s\r\n]*\(' 
				|| replace(i_co_view_nm, '$', '\$') ||'_fct_context\.pid[\s\r\n]+=[\s\r\n]+\(pg_backend_pid\(\)\)::numeric\)\)\)::text';
			
			-- 参照テーブルの切替
			CALL mapa_master$p_regexp_rep(io_view_body, v_table_from || '[\s\r\n]+', v_table_to || ' ') ;
			-- 会社CD条件の切替
			io_view_body := REGEXP_REPLACE(io_view_body, v_org_co_pred, '0 = 0', 'ig') ;
			IF i_lcl_flg = '1' THEN
				-- ロケールの切替
				CALL mapa_master$p_regexp_rep(io_view_body, i_mst || c_lcl || c_all || '[\s\r\n]+', i_mst || c_lcl || c_cmn|| ' ') ;
				CALL mapa_master$p_regexp_rep(io_view_body, l_prnt_lcl_all, l_prnt_lcl_cmn) ;
				CALL mapa_master$p_regexp_rep(io_view_body, l_lcl_co_pred, '0 = 0') ;
			END IF;
		ELSE
			v_table_to :=  LOWER('mavm_bp_cmn');
			v_org_co_pred :=  '\(' 
				|| replace(l_view_alias, '$', '\$') || '\.co_cd\)::text[\s\r\n]+=[\s\r\n]+\(\([\s\r\n]+SELECT[\s\r\n]+.+[\s\r\n]+WHERE[\s\r\n]*\(' 
				|| replace(i_mst, '$', '\$') ||'_fct_context\.pid[\s\r\n]+=[\s\r\n]+\(pg_backend_pid\(\)\)::numeric\)\)\)::text';
			
			-- 参照テーブルの切替
			CALL mapa_master$p_regexp_rep(io_view_body, v_table_from || '[\s\r\n]+', v_table_to || ' ') ;
			-- 会社CD条件の切替
			io_view_body := REGEXP_REPLACE(io_view_body, v_org_co_pred, '0 = 0', 'ig') ;
			IF i_lcl_flg = '1' THEN
				-- ロケールの切替
				CALL mapa_master$p_regexp_rep(io_view_body, i_mst || c_lcl || c_all || '[\s\r\n]+', i_mst || c_lcl || c_cmn|| ' ') ;
				CALL mapa_master$p_regexp_rep(io_view_body, l_prnt_lcl_all, l_prnt_lcl_cmn) ;
				CALL mapa_master$p_regexp_rep(io_view_body, l_lcl_co_pred, '0 = 0') ;
			END IF;
		END IF;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_rep_all_cmn_prnt_lcl (
	INOUT io_view_body VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_co_view_nm VARCHAR,
	IN i_mst VARCHAR,
	IN i_mst_nm VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	PRNT_LCL_CDの参照方法を切り替える
<REMARKS>
	MAM_BPまたはMAM_LOCの時に呼び出される想定
<ARGUMENTS>
<INOUT>	io_view_body
		ビュー定義
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_co_view_nm
		View名称
<IN>	i_mst
		マスタ名(MAM_XXX)
<IN>	i_mst_nm
		マスタ名(XXX)
<HISTORY>
**********************************************************/
DECLARE
	v_prnt_lcl_all VARCHAR;
	
	v_prnt_lcl_cmn VARCHAR;
	l_view_alias	VARCHAR;
BEGIN

	IF i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM')  THEN
		l_view_alias := i_co_view_nm || '_' || LOWER(i_mst) || '_all_org';
		v_prnt_lcl_all := l_view_alias || '.prnt_lcl_cd' ;
		v_prnt_lcl_cmn := 'COALESCE(' || l_view_alias || '.prnt_lcl_cd, (select def_locale_cd from fcm_co '
			|| 'where co_cd = (SELECT co_cd FROM fct_context fcm_co_fct_context WHERE pid = pg_backend_pid()))::character varying(7)) AS prnt_lcl_cd' ;
		CALL mapa_master$p_regexp_rep(io_view_body, v_prnt_lcl_all, v_prnt_lcl_cmn) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_rep_ref_lcl (
	INOUT io_view_body VARCHAR,
	IN i_mst VARCHAR,
	IN i_lcl_flg CHARACTER,
	IN i_co_view_nm VARCHAR,
	IN i_mst_set_typ VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	LCL_FLGに応じて、LCLテーブルを利用するかどうかを切り替える
<REMARKS>
<ARGUMENTS>
<INOUT>	io_view_body
		ビュー定義
<IN>	i_mst
		マスタ名(MAM_XXX)
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<IN>	i_co_view_nm
		ビュー名
<IN>	i_mst_set_typ
		マスタ設定区分
<HISTORY>
**********************************************************/
DECLARE
	c_all		CONSTANT VARCHAR := '_all' ;
	c_cmn		CONSTANT VARCHAR := '_cmn' ;
	c_lcl		CONSTANT VARCHAR := '_lcl' ;
	c_org		CONSTANT VARCHAR := '_org' ;
	l_lcl_join	VARCHAR ;
	l_lcl_co_pred	VARCHAR ;
	l_view_alias	VARCHAR ;
	l_lcl_alias	VARCHAR ;
BEGIN

	l_view_alias := i_co_view_nm || '_' || LOWER(i_mst) || c_all || c_org;
	l_lcl_alias  := i_co_view_nm || '_' || LOWER(i_mst) || c_lcl || c_all || c_lcl;
	IF i_lcl_flg = '0' THEN
		-- 結合を除去
		
		-- mam_itm_cmn_用
		l_lcl_join := 'left join[\s\r\n]+.*_lcl_all[\s\r\n]+.*\(fcpa_context\$f_get_locale\(\)\)::text\)\)\)';
		io_view_body := REGEXP_REPLACE(io_view_body, l_lcl_join, '', 'ig') ;
		-- 
		l_lcl_join := 'left join[\s\r\n]+.*_lcl_all[\s\r\n]+.*_fct_context\.pid[\s\r\n]+=[\s\r\n]+\(pg_backend_pid\(\)\)::numeric\)\)\)::text\)\)\)';
		io_view_body := REGEXP_REPLACE(io_view_body, l_lcl_join, '', 'ig') ;
		
		-- 別名を切り替える
		CALL mapa_master$p_regexp_rep(io_view_body, l_lcl_alias || '.', l_view_alias || '.') ;
		-- FROM (xxxx aa) の括弧を外す
		-- FROM (mam_itm_cmn mam_itm_cmn__mam_itm_all_org
		--     )
		io_view_body := regexp_replace(io_view_body,  'FROM[\s\r\n]*\([\s\r\n]*(.+)[\s\r\n]+' || replace(l_view_alias, '$', '\$') || '[\s\r\n]*\)', 'FROM \1 ' || l_view_alias);
		
	ELSE
		IF i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM') THEN
			-- co_cd 結合削除
			-- 例）
			-- (mam_itm_cmn__mam_itm_all_org.co_cd)::text = (mam_itm_cmn__mam_itm_lcl_all_lcl.co_cd)::text
			l_lcl_co_pred := '(' || l_view_alias || '.co_cd)::text = (' || l_lcl_alias || '.co_cd)::text';
			CALL mapa_master$p_regexp_rep(io_view_body, l_lcl_co_pred, '0 = 0') ;
			
			-- テーブル名変更
			CALL mapa_master$p_regexp_rep(io_view_body, 
				'[\s\r\n]+' || LOWER(i_mst) || c_lcl || c_all || '[\s\r\n]+' , 
				' ' || LOWER(i_mst) || c_lcl || c_cmn || ' ') ;
		END IF; 
	
	END IF;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_rep_ref_lcl_mavm_bp_nm (
	INOUT io_view_body VARCHAR,
	IN i_lcl_flg CHARACTER
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	LCL_FLGに応じて、LCLテーブルを利用するかどうかを切り替える(MAVM_BP_NM用)
<REMARKS>
<ARGUMENTS>
<INOUT>	io_view_body
		ビュー定義
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
	c_from_lcl_on	CONSTANT VARCHAR := 'mam_bp_lcl' ;
	c_from_lcl_off	CONSTANT VARCHAR := 'mam_bp' ;

	c_where_lcl_on	CONSTANT VARCHAR := ' \(\(fcpa_context\$f_get_locale\(\)\)::text[\s\r\n]+=[\s\r\n]+\((mavm_bp_nm_mam_bp_m\.)?lcl_cd\)::text\)\)' ;
	c_where_lcl_off	CONSTANT VARCHAR := ' (0 = 0))' ;
BEGIN
	IF I_LCL_FLG = '0' THEN
		CALL mapa_master$p_regexp_rep(io_view_body, c_from_lcl_on, c_from_lcl_off) ;
		io_view_body := REGEXP_REPLACE(io_view_body, c_where_lcl_on, c_where_lcl_off, 'ig') ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_mst_ctl_mavm_bp_nm (
	IN i_mst_set_typ VARCHAR,
	IN i_lcl_flg CHARACTER,
	IN i_mst_nm VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	MAVM_BP_NMのビューを再定義する
<REMARKS>
<ARGUMENTS>
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<IN>	i_mst_nm
		マスタ名
<HISTORY>
**********************************************************/
DECLARE
	c_view_def	CONSTANT VARCHAR := 'CREATE OR REPLACE VIEW ' ;

	l_view_col	VARCHAR ;
	l_view_body	VARCHAR ;
	l_co_view_nm	VARCHAR ;
BEGIN
	l_co_view_nm := 'mavm_bp_nm' ;

	--カラム情報とビュー本体の取得
	l_view_col := mapa_master$f_get_col(l_co_view_nm) ;
	l_view_body := mapa_master$f_get_body(l_co_view_nm, i_mst_nm) ;

	-- 置換処理
	CALL mapa_master$p_rep_ref_lcl_mavm_bp_nm(l_view_body, i_lcl_flg) ;


	--ビュー情報の定義
	EXECUTE c_view_def || l_co_view_nm || l_view_col || ' AS ' || l_view_body ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_mst_ctl_ref_tbl (
	IN i_co_view_base_nm VARCHAR,
	IN i_mst VARCHAR,
	IN i_mst_nm VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_lcl_flg CHARACTER,
	IN i_db_link_nm VARCHAR,
	IN i_lcl_str VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	インプット情報に従ってマスタのビューを再定義する
<REMARKS>
	FROM句のうち、i_lcl_strで指定したもののみを切り替える
	例）MAM_BP[i_lcl_str]_ALL
<ARGUMENTS>
<IN>	i_co_view_base_nm
		ビュー名
<IN>	i_mst
		マスタ名(MAM_XXX)
<IN>	i_mst_nm
		マスタ名(XXX)
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<IN>	i_lcl_str
		マスタ名に追加する文字列（'' または '_LCL'）
<HISTORY>
**********************************************************/
DECLARE
	c_view_def	CONSTANT VARCHAR := 'CREATE OR REPLACE VIEW ' ;

	l_view_col	VARCHAR ;
	l_view_body	VARCHAR ;
BEGIN
	IF mac_mst_nm$is_com(i_mst_nm) = '0' OR i_co_view_base_nm IS NULL THEN
		RETURN ;
	END IF ;

	--カラム情報とビュー本体の取得
	l_view_col := mapa_master$f_get_col(i_co_view_base_nm) ;
	l_view_body := mapa_master$f_get_body(i_co_view_base_nm, i_mst_nm) ;

	IF l_view_body IS NULL THEN
		RETURN ;
	END IF;

	-- 置換処理
	CALL mapa_master$p_rep_all_cmn_ref_tbl(l_view_body, i_mst, i_mst_set_typ, i_db_link_nm, i_lcl_str, i_co_view_base_nm) ;


	--ビュー情報の定義
	EXECUTE c_view_def || i_co_view_base_nm || l_view_col || ' AS ' || l_view_body ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_mst_ctl_ref_all (
	IN i_co_view_nm VARCHAR,
	IN i_mst VARCHAR,
	IN i_mst_nm VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_lcl_flg CHARACTER,
	IN i_db_link_nm VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	インプット情報に従ってマスタのビューを再定義する
<REMARKS>
<ARGUMENTS>
<IN>	i_co_view_nm
		ビュー名
<IN>	i_mst
		マスタ名(MAM_XXX)
<IN>	i_mst_nm
		マスタ名(XXX)
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<HISTORY>
**********************************************************/
DECLARE
	c_view_def	CONSTANT VARCHAR := 'CREATE OR REPLACE VIEW ' ;

	l_view_col	VARCHAR ;
	l_view_body	VARCHAR ;
BEGIN
	IF i_co_view_nm IS NULL THEN
		RETURN ;
	END IF;

	/***CO_VIEW***/
	--カラム情報とビュー本体の取得
	l_view_col := mapa_master$f_get_col(i_co_view_nm) ;
	l_view_body := mapa_master$f_get_body(i_co_view_nm, i_mst_nm) ;

	IF l_view_body IS NULL THEN
		RETURN ;
	END IF;

	IF mac_mst_nm$is_com(i_mst_nm) = '1' THEN
		-- 共通/会社別の切り替え
		IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP') THEN
			CALL mapa_master$p_rep_mam_bp_com_all(l_view_body, i_mst, i_mst_set_typ, i_db_link_nm, i_co_view_nm, i_lcl_flg);
		END IF;
		CALL mapa_master$p_rep_all_cmn(l_view_body, i_mst, i_mst_set_typ, i_db_link_nm, i_co_view_nm) ;
		
		
		-- 共通/会社別の切り替え：取引先、場所専用
		IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP') THEN
			IF i_co_view_nm != 'mavm_bp' THEN
				CALL mapa_master$p_rep_all_cmn_bp(l_view_body, i_mst_set_typ,i_co_view_nm, i_mst,i_mst_nm,i_lcl_flg) ;
			END IF ;
			IF i_mst_set_typ != fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM_COM') THEN
				CALL mapa_master$p_rep_all_cmn_prnt_lcl(l_view_body, i_mst_set_typ, i_co_view_nm, i_mst,i_mst_nm) ;
			END IF;
		END IF ;

		IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_LOC') THEN
			CALL mapa_master$p_rep_all_cmn_prnt_lcl(l_view_body, i_mst_set_typ, i_co_view_nm, i_mst,i_mst_nm) ;
		END IF ;
	END IF ;

	IF mac_mst_nm$is_lcl(i_mst_nm) = '1' THEN
		-- LCLテーブル利用の切り替え
		CALL mapa_master$p_rep_ref_lcl(l_view_body, i_mst, i_lcl_flg,i_co_view_nm,i_mst_set_typ) ;
		
		-- LCLテーブル利用の切り替え：取引先専用
		IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP') AND i_co_view_nm != 'mavm_bp' THEN
			CALL mapa_master$p_mst_ctl_mavm_bp_nm(i_mst_set_typ, i_lcl_flg, i_mst_nm) ;
		END IF;
	END IF ;


	--ビュー情報の定義
	EXECUTE c_view_def || i_co_view_nm || l_view_col || ' AS ' || l_view_body ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_rep_all_cmn_bin_seq (
	IN i_mst_nm VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_db_link_nm VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	マスタ設定区分に応じて、バイナリID用シーケンスの参照を切り替える
<REMARKS>
<ARGUMENTS>
<IN>	i_mst_nm
		マスタ名(XXX)
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<HISTORY>
**********************************************************/
DECLARE
BEGIN
	NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_master$p_upd_mst_ctl (
	IN i_mst_nm VARCHAR,
	IN i_mst_set_typ VARCHAR,
	IN i_lcl_flg CHARACTER
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	MAM_MST_CTL を更新する
<REMARKS>
<ARGUMENTS>
<IN>	i_mst_nm
		マスタ名(XXX)
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
BEGIN
	IF mac_mst_nm$is_com(i_mst_nm) = '0' AND i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM') THEN
		UPDATE	mam_mst_ctl m
		SET	mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'COM')
		WHERE	0=0
		AND	m.mst_nm ILIKE i_mst_nm
		;
	END IF ;

	IF mac_mst_nm$is_lcl(i_mst_nm) = '0' AND i_lcl_flg = '1' THEN
		UPDATE	mam_mst_ctl m
		SET	lcl_flg = '0'
		WHERE	0=0
		AND	m.mst_nm ILIKE i_mst_nm
		;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_mst_ctl (
	 IN i_mst_nm VARCHAR,
	 IN i_mst_set_typ VARCHAR,
	 IN i_lcl_flg CHARACTER,
	 IN i_db_link_nm VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	インプット情報に従ってマスタのビューを再定義する
<REMARKS>
	品目マスタの対応
	co_view：mam_itm_cmn_
	co_view_base：mam_itm_cmn_upd
	取引先マスタの対応
	マスタ制御：共通・会社別の場合
	CO_VIEW_BASE：MAM_BP_CMN_
<ARGUMENTS>
<IN>	i_mst_nm
		マスタ名
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_lcl_flg
		ロケール管理ＦＬＧ
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<HISTORY>
**********************************************************/
DECLARE
	c_mst_pre	CONSTANT VARCHAR := 'mam_' ;
	c_lcl		CONSTANT VARCHAR := '_lcl' ;

	l_view_col	VARCHAR ;
	l_view_body	VARCHAR ;

	l_dblink	VARCHAR(100) ;

	l_co_view_base_nm	VARCHAR ;
	l_co_view_nm		VARCHAR ;
	l_co_view_s_nm		VARCHAR ;
	l_co_view_u_nm		VARCHAR ;
	l_co_view_lcl_nm	VARCHAR ;
	l_co_view_lcl_s_nm	VARCHAR ;
	l_co_view_lcl_u_nm	VARCHAR ;
	l_mst			VARCHAR ;

	l_cnt		INTEGER ;
BEGIN
	-- 処理対象
	l_mst := c_mst_pre || LOWER(i_mst_nm) ;
	IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM') THEN
		l_co_view_nm := 'mam_itm_cmn_' ;
		l_co_view_s_nm := NULL ;
		l_co_view_u_nm := NULL ;
		l_co_view_base_nm := 'mam_itm_cmn_upd' ;
	ELSE
		IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP') AND i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM_COM') THEN
			l_co_view_nm := l_mst ;
			l_co_view_s_nm := l_mst || '_$s' ;
			l_co_view_u_nm := l_mst || '_$u' ;
			l_co_view_base_nm := 'mavm_bp_cmn' ;
		ELSE
			l_co_view_nm := l_mst ;
			l_co_view_s_nm := l_mst || '_$s' ;
			l_co_view_u_nm := l_mst || '_$u' ;
			l_co_view_base_nm := l_mst || '_' ;
		END IF;
	END IF ;
	l_co_view_lcl_nm := l_mst || c_lcl ;
	l_co_view_lcl_s_nm := l_mst || c_lcl || '_$s' ;
	l_co_view_lcl_u_nm := l_mst || c_lcl || '_$u' ;

	-- 未対応
	l_dblink := NULL ;

	-- CO_VIEW_BASE
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.views t
	WHERE	0=0
	AND	t.table_name = LOWER(l_co_view_base_nm)
	;

	IF l_cnt > 0 AND mac_mst_nm$is_com(i_mst_nm) = '1' AND (mac_mst_nm$is_mam_bp(i_mst_nm) != '1' AND i_mst_set_typ != fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM_COM'))THEN
		CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_base_nm, l_mst, i_mst_nm, i_mst_set_typ, i_lcl_flg, l_dblink, '') ;
	END IF ;

	-- CO_VIEW
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.views t
	WHERE	0=0
	AND	t.table_name = l_co_view_nm
	;

	IF l_cnt > 0 AND (mac_mst_nm$is_com(i_mst_nm) = '1' OR mac_mst_nm$is_lcl(i_mst_nm) = '1') THEN
		CALL mapa_master$p_mst_ctl_ref_all(l_co_view_nm, l_mst, i_mst_nm, i_mst_set_typ, i_lcl_flg, l_dblink) ;
		CALL mapa_master$p_mst_ctl_ref_all(l_co_view_s_nm, l_mst, i_mst_nm, i_mst_set_typ, i_lcl_flg, l_dblink) ;
		IF mac_mst_nm$is_mam_bp(i_mst_nm) = '1' AND i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM_COM') THEN
			--  取引先マスタが「共通・会社別」の場合は、取引先マスタの更新Viewを会社別の定義にする
			CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_u_nm, l_mst, i_mst_nm, fcpa_const$get_const_val('MAC_MST_SET_TYP', 'COM'), i_lcl_flg, l_dblink, '') ;
		ELSE
			CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_u_nm, l_mst, i_mst_nm, i_mst_set_typ, i_lcl_flg, l_dblink, '') ;
		END IF;

		IF mac_mst_nm$is_com(i_mst_nm) = '1' AND mac_mst_nm$is_lcl(i_mst_nm) = '1' THEN
			IF  i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP') AND i_mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM_COM') THEN
				-- 取引先マスタが「共通・会社別」の場合は、ロケールテーブルを共通の定義にする
				CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_lcl_nm, l_mst, i_mst_nm, fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM'), i_lcl_flg, l_dblink, c_lcl) ;
				CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_lcl_s_nm, l_mst, i_mst_nm, fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM'), i_lcl_flg, l_dblink, c_lcl) ;
				CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_lcl_u_nm, l_mst, i_mst_nm, fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM'), i_lcl_flg, l_dblink, c_lcl) ;
			ELSE
				CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_lcl_nm, l_mst, i_mst_nm, i_mst_set_typ, i_lcl_flg, l_dblink, c_lcl) ;
				CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_lcl_s_nm, l_mst, i_mst_nm, i_mst_set_typ, i_lcl_flg, l_dblink, c_lcl) ;
				CALL mapa_master$p_mst_ctl_ref_tbl(l_co_view_lcl_u_nm, l_mst, i_mst_nm, i_mst_set_typ, i_lcl_flg, l_dblink, c_lcl) ;
			END IF;
		END IF ;

		-- バイナリシーケンスの参照切り替え
		IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_USR')
		OR i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM')
		THEN
			CALL mapa_master$p_rep_all_cmn_bin_seq(i_mst_nm, i_mst_set_typ, l_dblink) ;
		END IF ;
	END IF ;

	-- MAM_MST_CTL の更新
	CALL mapa_master$p_upd_mst_ctl(i_mst_nm, i_mst_set_typ, i_lcl_flg) ;

	-- 部門の場合の追加処理
	IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT') THEN
		CALL mapa_master$p_mst_ctl(fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_HIS'), i_mst_set_typ, '0', i_db_link_nm) ;
		CALL mapa_master$p_mst_ctl(fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_MAP'), i_mst_set_typ, '0', i_db_link_nm) ;
	END IF ;
	-- 取引先の場合の追加処理
	IF i_mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP') THEN
		l_co_view_base_nm := 'mavm_bp' ;
		CALL mapa_master$p_mst_ctl_ref_all(l_co_view_base_nm, l_mst, i_mst_nm, i_mst_set_typ, i_lcl_flg, l_dblink) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_mst_check (
	IN i_mst_set_typ VARCHAR,
	IN i_db_link_nm VARCHAR,
	IN i_list_mst_main VARCHAR[],
	IN i_list_mst_sub VARCHAR[]
)
AS
$BODY$
/*
********************************************************
<SYNOPSIS>
	マスタ間の整合性を保つための処理を行なう
<REMARKS>
<ARGUMENTS>
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<IN>	i_list_mst_main
		マスタ名の配列（主）
<IN>	i_list_mst_sub
		マスタ名の配列（従）
<HISTORY>
**********************************************************/
DECLARE
	l_mst_set_typ	mam_mst_ctl.mst_set_typ%TYPE ;
	l_tmp_ts	mam_mst_ctl.upd_ts%TYPE ;
	l_max_ts	mam_mst_ctl.upd_ts%TYPE ;
	l_chk		INTEGER ;

	x	RECORD ;
	y	RECORD ;
BEGIN
	IF COALESCE(array_length(i_list_mst_main, 1), 0) = 0 THEN
		RETURN ;
	END IF ;

	l_chk := 0 ;
	l_mst_set_typ := NULL ;
	l_max_ts := NULL ;

	FOR i IN 1..array_length(i_list_mst_main, 1) LOOP
		FOR x IN 
			SELECT	m.mst_set_typ,
				m.upd_ts
			FROM	mam_mst_ctl m
			WHERE	0=0
			AND	m.mst_nm = i_list_mst_main[i]
		LOOP
			IF l_max_ts IS NULL OR l_max_ts < x.upd_ts THEN
				l_max_ts := x.upd_ts ;
				l_mst_set_typ := x.mst_set_typ ;
			END IF ;
		END LOOP ;
	END LOOP ;

	IF i_mst_set_typ IS NOT NULL AND i_mst_set_typ <> l_mst_set_typ THEN
		RETURN ;
	END IF ;

	IF COALESCE(array_length(i_list_mst_sub, 1), 0) = 0 THEN
		RETURN ;
	END IF ;

	FOR i IN 1..array_length(i_list_mst_sub, 1) LOOP
		SELECT	COUNT(*)
		INTO STRICT l_chk
		FROM	mam_mst_ctl m
		WHERE	0=0
		AND	m.mst_nm = i_list_mst_sub[i]
		AND	m.mst_set_typ != l_mst_set_typ
		;

		IF l_chk > 0 THEN
			EXIT ;
		END IF ;
	END LOOP ;

	IF l_chk = 0 THEN
		RETURN ;
	END IF ;

	FOR i IN 1..array_length(i_list_mst_sub, 1) LOOP
		FOR x IN (
			SELECT	m.mst_nm,
				m.mst_set_typ,
				m.lcl_flg
			FROM	mam_mst_ctl m
			WHERE	0=0
			AND	m.mst_nm = i_list_mst_sub[i]
			AND	m.mst_set_typ != l_mst_set_typ
			)
		LOOP
			CALL mapa_master$p_mst_ctl(x.mst_nm, l_mst_set_typ, x.lcl_flg, i_db_link_nm) ;

			UPDATE	mam_mst_ctl m
			SET	mst_set_typ = l_mst_set_typ
			WHERE	0=0
			AND	m.mst_nm = x.mst_nm
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;
CREATE OR REPLACE PROCEDURE mapa_master$p_mst_chk_bp_cmn_all (
	IN i_mst_set_typ VARCHAR,
	IN i_db_link_nm VARCHAR,
	IN i_list_mst_main VARCHAR[],
	IN i_list_mst_sub VARCHAR[]
)
AS
$BODY$
/*
********************************************************
<SYNOPSIS>
	取引先マスタに関連するマスタの整合性を保つための処理を行なう
<REMARKS>
<ARGUMENTS>
<IN>	i_mst_set_typ
		マスタ設定区分
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<IN>	i_list_mst_main
		マスタ名の配列（主）
<IN>	i_list_mst_sub
		マスタ名の配列（従）
<HISTORY>
**********************************************************/
DECLARE
	l_mst_set_typ	mam_mst_ctl.mst_set_typ%TYPE ;
	l_tmp_ts	mam_mst_ctl.upd_ts%TYPE ;
	l_max_ts	mam_mst_ctl.upd_ts%TYPE ;
	l_chk		INTEGER ;

	x	RECORD ;
	y	RECORD ;
BEGIN
	IF COALESCE(array_length(i_list_mst_main, 1), 0) = 0 THEN
		RETURN ;
	END IF ;

	l_chk := 0 ;
	l_mst_set_typ := NULL ;
	l_max_ts := NULL ;

	FOR i IN 1..array_length(i_list_mst_main, 1) LOOP
		FOR x IN 
			SELECT	m.mst_set_typ,
				m.upd_ts
			FROM	mam_mst_ctl m
			WHERE	0=0
			AND	m.mst_nm = i_list_mst_main[i]
		LOOP
			IF l_max_ts IS NULL OR l_max_ts < x.upd_ts THEN
				l_max_ts := x.upd_ts ;
				l_mst_set_typ := x.mst_set_typ ;
			END IF ;
		END LOOP ;
	END LOOP ;

	IF i_mst_set_typ IS NOT NULL AND l_mst_set_typ <> fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM_COM') THEN
		RETURN ;
	END IF ;

	IF COALESCE(array_length(i_list_mst_sub, 1), 0) = 0 THEN
		RETURN ;
	END IF ;

	FOR i IN 1..array_length(i_list_mst_sub, 1) LOOP
		SELECT	COUNT(*)
		INTO STRICT l_chk
		FROM	mam_mst_ctl m
		WHERE	0=0
		AND	m.mst_nm = i_list_mst_sub[i]
		AND	m.mst_set_typ != i_mst_set_typ
		;

		IF l_chk > 0 THEN
			EXIT ;
		END IF ;
	END LOOP ;

	IF l_chk = 0 THEN
		RETURN ;
	END IF ;

	FOR i IN 1..array_length(i_list_mst_sub, 1) LOOP
		FOR x IN (
			SELECT	m.mst_nm,
				m.mst_set_typ,
				m.lcl_flg
			FROM	mam_mst_ctl m
			WHERE	0=0
			AND	m.mst_nm = i_list_mst_sub[i]
			AND	m.mst_set_typ != i_mst_set_typ
			)
		LOOP
			CALL mapa_master$p_mst_ctl(x.mst_nm, i_mst_set_typ, x.lcl_flg, i_db_link_nm) ;

			UPDATE	mam_mst_ctl m
			SET	mst_set_typ = i_mst_set_typ
			WHERE	0=0
			AND	m.mst_nm = x.mst_nm
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_mst_ctl_check (
	IN i_db_link_nm VARCHAR
)
AS
$BODY$
/*
********************************************************
<SYNOPSIS>
	マスタ間の整合性を保つための処理を行なう
<REMARKS>
<ARGUMENTS>
<IN>	i_db_link_nm
		共通マスタを参照するＤＢＬＩＮＫ名
<HISTORY>
**********************************************************/
DECLARE
	c_all_com	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') ;
	c_com		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_SET_TYP','COM') ;
	c_mam_account	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ACCOUNT') ;
	c_mam_sub_account	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SUB_ACCOUNT') ;
	c_mam_bank	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BANK') ;
	c_mam_bank_branch	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BANK_BRANCH') ;
	c_mam_auto_jnl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AUTO_JNL') ;
	c_mam_jnl_ptn	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_JNL_PTN') ;
	c_mam_cal_base	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CAL_BASE') ;
	c_mam_cal	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CAL') ;
	c_mam_cal_ext	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CAL_EXT') ;
	c_mam_hs_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_HS_GRP') ;
	c_mam_hs	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_HS') ;
	c_mam_spec	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SPEC') ;
	c_mam_spec_desc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SPEC_DESC') ;
	c_mam_expns_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_EXPNS_GRP') ;
	c_mam_expns	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_EXPNS') ;
	c_mam_cost_menu	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_COST_MENU') ;
	c_mam_menu_config	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_MENU_CONFIG') ;
	c_mam_alc_ac_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ALC_AC_GRP') ;
	c_mam_alc_ac	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ALC_AC') ;
	c_mam_cost_io	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_COST_IO') ;
	c_mam_cost_io_conf	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_COST_IO_CONF') ;
	c_mam_cost_io_col	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_COST_IO_COL') ;
	c_mam_rpt_ptn	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_RPT_PTN') ;
	c_mam_rpt_conf	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_RPT_CONF') ;
	c_mam_rpt_row_sml	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_RPT_ROW_SML') ;
	c_mam_ext_sys	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_EXT_SYS') ;
	c_mam_if_protocol	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_IF_PROTOCOL') ;
	c_mam_if_adapter	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_IF_ADAPTER') ;
	c_mam_http_header	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_HTTP_HEADER') ;
	c_mam_ext_sys_usr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_EXT_SYS_USR') ;
	c_mam_bp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP') ;
	c_mam_bp_sub	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP_SUB') ;
	c_mam_bp_stop	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP_STOP') ;
	c_mam_cred_ctrl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CRED_CTRL') ;
	c_mam_loc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_LOC') ;
	c_mam_if_cd_rule	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_IF_CD_RULE') ;
	c_mam_if_x	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_IF_X') ;
	c_mam_jnl_ac	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_JNL_AC') ;
	c_mam_bac_ac	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BAC_AC') ;
	c_mam_rsn_ac	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_RSN_AC') ;
	c_mam_itm	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM') ;
	c_mam_itm_sub	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM_SUB') ;
	c_mam_itm_unit	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM_UNIT') ;
	c_mam_attach_info	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ATTACH_INFO') ;
	c_mam_itm_stop	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM_STOP') ;
	c_mam_ctg_config	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CTG_CONFIG') ;
	c_mam_loc_sub	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_LOC_SUB') ;
	c_mam_str_ln	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_STR_LN') ;
	c_mam_da_ctl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DA_CTL') ;
	c_mam_dpt_config	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_CONFIG') ;
	c_mam_itm_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM_GRP') ;
	c_mam_unit	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_UNIT') ;
	c_mam_sls_itm_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SLS_ITM_GRP') ;
	c_mam_cntry	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CNTRY') ;
	c_mam_area	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AREA') ;
	c_mam_cur	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CUR') ;
	c_mam_bp_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BP_GRP') ;
	c_mam_dpt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT') ;
	c_mam_slip_form	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SLIP_FORM') ;
	c_mam_tax	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_TAX') ;
	c_mam_tterm	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_TTERM') ;
	c_mam_sls_anly	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SLS_ANLY') ;
	c_mam_setoff_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SETOFF_GRP') ;
	c_mam_po_print	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_PO_PRINT') ;
	c_mam_bank_ac	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BANK_AC') ;
	c_mam_lg_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_LG_GRP') ;
	c_mam_wg	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_WG') ;
	c_mam_site	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SITE') ;
	c_mam_loc_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_LOC_GRP') ;
	c_mam_alloc_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ALLOC_GRP') ;
	c_mam_rsrc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_RSRC') ;
	c_mam_aprv	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_APRV') ;
	c_mam_aprv_rt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_APRV_RT') ;
	c_mam_dpt_base	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_BASE') ;
	c_mam_aprv_role	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_APRV_ROLE') ;
	c_mam_ac_dpt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AC_DPT') ;
	c_mam_jnl_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_JNL_GRP') ;
	c_mam_ac_tax	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AC_TAX') ;
	c_mam_itm_jnl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM_JNL') ;
	c_mam_ac_rsn	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AC_RSN') ;
	c_mam_da	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DA') ;
	c_mam_jnl_ptn_base	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_JNL_PTN_BASE') ;
	c_mam_itm_typ_d	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM_TYP_D') ;
	c_mam_ac_itm_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AC_ITM_GRP') ;
	c_mam_itm_spec_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM_SPEC_GRP') ;
	c_mam_sls_upri_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SLS_UPRI_GRP') ;
	c_mam_itm_ship_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ITM_SHIP_GRP') ;
	c_mam_ship_valid	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SHIP_VALID') ;
	c_mam_ship_term	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SHIP_TERM') ;
	c_mam_calc_ptn	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CALC_PTN') ;
	c_mam_dpt_lvl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_LVL') ;
	c_mam_cost_dpt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_COST_DPT') ;
	c_mam_usr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_USR') ;
	c_mam_wk_cost	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_WK_COST') ;
	c_mam_cur_xrate	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CUR_XRATE') ;
	c_mam_xrate	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_XRATE') ;
	c_mam_unit_conv	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_UNIT_CONV') ;
	c_mam_ex_ctrl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_EX_CTRL') ;
	c_mam_biz_rsn	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_BIZ_RSN') ;
	c_mam_exim_port	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_EXIM_PORT') ;
	c_mam_alc_ptn	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ALC_PTN') ;
	c_mam_cost_ctg	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_COST_CTG') ;
	c_mam_ctg_grp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_CTG_GRP') ;
	c_mam_term	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_TERM') ;
	c_mam_oper	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_OPER') ;
	c_mam_ac_tax_map	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AC_TAX_MAP') ;
	c_mam_trd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_TRD') ;
	c_mam_auto_jnl_key	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AUTO_JNL_KEY') ;
	c_mam_note_rsn	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_NOTE_RSN') ;
	c_mam_slip_jnl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SLIP_JNL') ;
	c_mam_jnl_act	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_JNL_ACT') ;
	c_mam_ac_subtypem	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_AC_SUBTYPEM') ;
	c_mam_site_co	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SITE_CO') ;
	c_mam_spln_itm	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_SPLN_ITM') ;
	c_mam_sttl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM', 'MAM_STTL') ;

	l_list_mst_main	VARCHAR[] ;
	l_list_mst_sub	VARCHAR[] ;

	cnt	INTEGER ;

BEGIN
	l_list_mst_sub := '{}' ;

/*常に連動するマスタ*/
	-- 勘定科目マスタ、補助勘定科目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_account ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_sub_account ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sub_account ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 銀行マスタ、銀行支店マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_bank ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_bank_branch ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_bank ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bank_branch ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 自動仕訳マスタ、自動仕訳パタンマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_auto_jnl ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_jnl_ptn ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_auto_jnl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_ptn ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- カレンダ基本マスタ、カレンダマスタ、臨時カレンダマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cal_base ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_cal ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_cal_ext ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_cal_base ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cal ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cal_ext ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- ＨＳ分類マスタ、ＨＳマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_hs_grp ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_hs ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_hs_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_hs ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 仕様マスタ、仕様項目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_spec ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_spec_desc ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_spec ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_spec_desc ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 原価費目グループマスタ、原価費目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_expns_grp ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_expns ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_expns_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_expns ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 原価メニューマスタ、原価メニュー構成マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cost_menu ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_menu_config ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_cost_menu ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_menu_config ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 配賦科目グループマスタ、配賦科目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_alc_ac_grp ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_alc_ac ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_alc_ac_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_alc_ac ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 原価個別受払表マスタ、原価個別受払表構成マスタ、原価個別受払表項目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cost_io ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_cost_io_conf ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_cost_io_col ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cost_io ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_cost_io_conf ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_cost_io_col ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 原価レポートパタンマスタ、原価レポート構成マスタ、原価レポート行集計マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_rpt_ptn ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_rpt_conf ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_rpt_row_sml ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_rpt_ptn ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_rpt_conf ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_rpt_row_sml ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 外部システムマスタ、ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_ext_sys ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_if_protocol ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_if_adapter ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_http_header ;
	cnt := cnt + 1 ;
	l_list_mst_main[cnt] := c_mam_ext_sys_usr ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ext_sys ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_if_protocol ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_if_adapter ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_http_header ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ext_sys_usr ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;
/*主が会社・共通管理の場合は、従を会社管理もしくは共通管理にできない*/
	-- （主）取引先マスタ
	-- （従）（共通管理）国マスタ、地域マスタ、通貨マスタ、取引先分類マスタ
		--   （会社管理）取引先補助マスタ、取引先禁止マスタ、与信限度額マスタ、場所マスタ、自動仕訳パタンマスタ、ＩＦコードルールマスタ、ＩＦコード変換マスタ、
		--    品目仕訳科目設定マスタ、口座科目設定マスタ、会計理由科目設定マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] :=  c_mam_bp ;
	-- 共通管理するマスタの制御
	l_list_mst_sub := '{}' ;
	cnt := 1 ;

	l_list_mst_sub[cnt] := c_mam_cntry ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_area;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cur ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bp_grp ;
	CALL mapa_master$p_mst_chk_bp_cmn_all(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- 会社管理するマスタの制御
	l_list_mst_sub := '{}' ;
	cnt := 1 ;

	l_list_mst_sub[cnt] := c_mam_bp_sub ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bp_stop ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cred_ctrl ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_loc ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_ptn ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_if_cd_rule ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_if_x ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_ac ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bac_ac ;
	cnt :=  cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_rsn_ac ;
	CALL mapa_master$p_mst_chk_bp_cmn_all(c_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

/*主が会社管理の場合は、従を共通管理にできない*/
	-- （主）取引先マスタ
	-- （従）取引先補助マスタ、取引先禁止マスタ、与信限度額マスタ、場所マスタ、自動仕訳パタンマスタ、ＩＦコードルールマスタ、ＩＦコード変換マスタ、
	-- 　　　品目仕訳科目設定マスタ、口座科目設定マスタ、会計理由科目設定マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_bp ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_bp_sub ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bp_stop ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cred_ctrl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_loc ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_ptn ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_if_cd_rule ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_if_x ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_ac ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bac_ac ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_rsn_ac ;
	CALL mapa_master$p_mst_check(c_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）品目マスタ
	-- （従）品目補助マスタ、品目単位マスタ、品目付加情報マスタ、品目禁止マスタ、原価品群構成マスタ、
	-- 　　　自動仕訳パタンマスタ、ＩＦコード変換マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_itm ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_sub ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_unit ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_attach_info ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_stop ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ctg_config ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_ptn ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_if_x ;
	CALL mapa_master$p_mst_check(c_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）場所マスタ
	-- （従）場所補助マスタ、棚・ラインマスタ、データアクセス制御マスタ、原価部門構成マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_loc ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_loc_sub ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_str_ln ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_da_ctl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt_config ;
	CALL mapa_master$p_mst_check(c_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

/*主が共通管理の場合は、従を会社管理にできない*/
	-- （主）品目マスタ
	-- （従）品目分類マスタ、単位マスタ、ＨＳマスタ、販売品目体系マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_itm ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_unit ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_hs ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sls_itm_grp ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）取引先マスタ
	-- （従）国マスタ、地域マスタ、通貨マスタ、取引先分類マスタ、部門マスタ、伝票帳票マスタ、税マスタ、取引条件マスタ、
	-- 　　　販売分析マスタ、カレンダ基本マスタ、相殺グループマスタ、注文書表示マスタ、口座マスタ、物流グループマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_bp ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_cntry ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_area ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cur ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bp_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_slip_form ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_tax ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_tterm ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sls_anly ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cal_base ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_setoff_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_po_print ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bank_ac ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_lg_grp ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）場所マスタ
	-- （従）棚・ラインマスタ、部門マスタ、ワーキンググループマスタ、工場・物流倉庫マスタ、物流グループマスタ、製造場所グループマスタ、総量引当場所グループマスタ、
	-- 　　　カレンダ基本マスタ、国マスタ、資源マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_loc ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_str_ln ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_wg ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_site ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_lg_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_loc_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_alloc_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cal_base ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cntry ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_rsrc ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）品目補助マスタ
	-- （従）税マスタ、販売品目体系マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_itm_sub ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_tax ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sls_itm_grp ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）取引先補助マスタ
	-- （従）部門マスタ、税マスタ、販売分析マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_bp_sub ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_tax ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sls_anly ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）場所補助マスタ
	-- （従）部門マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_loc_sub ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）承認情報マスタ
	-- （従）承認ルートマスタ、部門基本マスタ、通貨マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_aprv ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_aprv_rt ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt_base ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cur ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）承認ルートマスタ
	-- （従）承認役割マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_aprv_rt ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_aprv_role ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）データアクセス制御マスタ
	-- （従）データアクセス基本マスタ、ワーキンググループマスタ、部門マスタ、物流グループマスタ、総量引当グループマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_da_ctl ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_da ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_wg ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_lg_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_alloc_grp ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）自動仕訳パタンマスタ
	-- （従）自動仕訳パタン基本マスタ、会計部門マスタ、仕訳グループマスタ、勘定科目マスタ、補助勘定科目マスタ、会計税マスタ、品目仕訳マスタ、会計理由マスタ、通貨マスタ、自動仕訳マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_jnl_ptn ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_ptn_base ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_dpt ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sub_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_tax ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_jnl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_rsn ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cur ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_auto_jnl ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）品目仕訳科目設定マスタ
	-- （従）品目仕訳マスタ、仕訳グループマスタ、勘定科目マスタ、補助勘定科目マスタ、会計税マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_jnl_ac ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_jnl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sub_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_tax ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）口座科目設定マスタ
	-- （従）口座マスタ、仕訳グループマスタ、勘定科目マスタ、補助勘定科目マスタ、会計税マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_bac_ac ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_bank_ac ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sub_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_tax ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）会計理由科目設定マスタ
	-- （従）会計理由マスタ、仕訳グループマスタ、勘定科目マスタ、補助勘定科目マスタ、会計税マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_rsn_ac ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_rsn ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sub_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_tax ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）品目区分詳細マスタ
	-- （従）品目仕訳マスタ、会計品目分類マスタ、品目仕様分類マスタ、販売単価分類マスタ、品目出荷グループマスタ、
	-- 　　　出荷有効期限グループマスタ、出荷条件マスタ、承認役割マスタ、計算パタンマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_itm_typ_d ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_jnl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_itm_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_spec_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sls_upri_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_ship_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ship_valid ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ship_term ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_aprv_role ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_calc_ptn ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）部門マスタ
	-- （従）部門基本マスタ、部門変更対応マスタ、ワーキンググループマスタ、原価部門マスタ、会計部門マスタ、口座マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_dpt ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt_base ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt_lvl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_wg ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cost_dpt ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_dpt ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bank_ac ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）担当者マスタ
	-- （従）工数管理マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_usr ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_wk_cost ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）口座マスタ
	-- （従）銀行マスタ、銀行支店マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_bank_ac ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_bank ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bank_branch ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）銀行マスタ
	-- （従）カレンダ基本マスタ、銀行支店マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_bank ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_cal_base ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_bank_branch ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）為替レートマスタ
	-- （従）為替レート基本マスタ、通貨マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cur_xrate ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_xrate ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cur ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）単位換算マスタ
	-- （従）単位マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_unit_conv ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_unit ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）輸出規制マスタ
	-- （従）ＨＳマスタ、国マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_ex_ctrl ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_hs ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cntry ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）業務理由マスタ
	-- （従）会計理由マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_biz_rsn ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_rsn ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）港マスタ
	-- （従）国マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_exim_port ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_cntry ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）取引マスタ
	-- （従）会計理由マスタ、伝票帳票マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_trd ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_rsn ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_slip_form ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）ＩＦコードルールマスタ
	-- （従）外部システムマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_if_cd_rule ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ext_sys ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）ＩＦコード変換マスタ
	-- （従）外部システムマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_if_x ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ext_sys ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）計算パタンマスタ
	-- （従）費目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_calc_ptn ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_expns ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価個別受払表マスタ
	-- （従）品目仕訳マスタ、品目分類マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cost_io ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_jnl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_grp ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価個別受払表項目マスタ
	-- （従）会計理由マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cost_io_col ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_rsn ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価レポート構成マスタ
	-- （従）配賦科目グループマスタ、配賦科目マスタ、会計理由マスタ、品目仕訳マスタ、品目分類マスタ、費目グループマスタ、費目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_rpt_conf ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_alc_ac_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_alc_ac ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_rsn ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_jnl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_expns_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_expns ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）配賦科目マスタ
	-- （従）配賦パタンマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_alc_ac ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_alc_ptn ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価品群マスタ
	-- （従）原価品群グループマスタ、品目仕訳マスタ、品目分類マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cost_ctg ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ctg_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_jnl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_grp ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価品群構成マスタ
	-- （従）対象期間マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_ctg_config ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_term ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価部門マスタ
	-- （従）対象期間マスタ、部門階層マスタ、物流グループマスタ、製造場所グループマスタ、ワーキンググループマスタ、工場・物流倉庫マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cost_dpt ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_term ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_dpt_lvl ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_lg_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_loc_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_wg ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_site ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価部門構成マスタ
	-- （従）工程マスタ、対象期間マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_dpt_config ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_oper ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_term ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）会計税対応マスタ
	-- （従）会計税マスタ、税マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_ac_tax_map ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_tax ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_tax ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）会計税マスタ
	-- （従）勘定科目マスタ、補助勘定科目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_ac_tax ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sub_account ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）自動仕訳マスタ
	-- （従）自動仕訳キーマスタ、自動仕訳パタン基本マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_auto_jnl ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_auto_jnl_key ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_ptn_base ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）手形理由マスタ
	-- （従）勘定科目マスタ、補助勘定科目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_note_rsn ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_account ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sub_account ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）会計伝票区分仕訳マスタ
	-- （従）仕訳実行マスタ、自動仕訳キーマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_slip_jnl ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_jnl_act ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_auto_jnl_key ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）勘定科目マスタ
	-- （従）会計税マスタ、予備科目区分マスタ、補助勘定科目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_account ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_tax ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_subtypem ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_sub_account ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）与信限度額マスタ
	-- （従）通貨マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cred_ctrl ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_cur ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）工場・物流倉庫マスタ
	-- （従）製造場所グループマスタ、総量引当場所グループマスタ、物流グループマスタ、カレンダ基本マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_site ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_loc_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_alloc_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_lg_grp ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cal_base ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）製造場所グループマスタ
	-- （従）ワーキンググループマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_loc_grp ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_wg ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）物流グループマスタ
	-- （従）ワーキンググループマスタ、カレンダ基本マスタ、倉庫事業者マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_lg_grp ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_wg ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cal_base ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_site_co ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）品目付加情報マスタ
	-- （従）ワーキンググループマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_attach_info ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_wg ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）販売計画品目マスタ
	-- （従）品目分類マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_spln_itm ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_itm_grp ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）決済方法マスタ
	-- （従）会計理由マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_sttl ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_ac_rsn ;
	CALL mapa_master$p_mst_check(c_all_com, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）カレンダ基本マスタ、
	-- （従）カレンダマスタ、臨時カレンダマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cal_base ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_cal ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_cal_ext ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）ＨＳマスタ
	-- （従）ＨＳ分類マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_hs ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_hs_grp ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）仕様マスタ
	-- （従）仕様項目マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_spec ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_spec_desc ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価費目マスタ
	-- （従）原価費目グループマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_expns ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_expns_grp ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）原価メニューマスタ
	-- （従）原価メニュー構成マスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_cost_menu ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_menu_config ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）配賦科目マスタ
	-- （従）配賦科目グループマスタ、
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_alc_ac ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_alc_ac_grp ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	-- （主）外部システムマスタ
	-- （従）ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタ
	l_list_mst_main := '{}' ;
	cnt := 1 ;
	l_list_mst_main[cnt] := c_mam_ext_sys ;

	l_list_mst_sub := '{}' ;
	cnt := 1 ;
	l_list_mst_sub[cnt] := c_mam_if_protocol ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_if_adapter ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_http_header ;
	cnt := cnt + 1 ;
	l_list_mst_sub[cnt] := c_mam_ext_sys_usr ;
	CALL mapa_master$p_mst_check(NULL::VARCHAR, i_db_link_nm, l_list_mst_main, l_list_mst_sub) ;

	l_list_mst_main := '{}' ;
	l_list_mst_sub := '{}' ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_master$p_mst_ctl_init ()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	mam_view_definition（初期状態のview定義を保持するビュー） を更新対象にする。
<REMARKS>
	ビュー定義テンプレートは、mam_view_definitionで保持している。
	mam_view_definition の保持するSELECT文は、スキーマ新規構築時に、本プロシージャを実行する前のビュー定義の状態である。
	本プロシージャでは、ロケール管理や会社管理の状態において、view定義が初期状態と同等の場合、
	そのビューはmam_view_definitionへの再登録対象となる。
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	l_tmp	VARCHAR;
	x		RECORD;
	l_$pos	INTEGER;
	l_has_lcl	INTEGER;
	l_has_cmn	INTEGER;
	l_is_com	INTEGER;
	l_is_lcl	INTEGER;
	l_is_rep	BOOLEAN;
	c_reg_lcl CONSTANT VARCHAR := '(join|from)[\s\r\n]+.*(_lcl_all|_lcl_cmn|_lcl)[\s\r\n]+';
	c_reg_cmn CONSTANT VARCHAR := '(join|from)[\s\r\n]+.*_cmn[\s\r\n]+';
BEGIN
	FOR x IN
		SELECT	
			m.table_name,
			m.view_definition,
			m.mst_nm
		FROM mam_view_definition m
	LOOP
		SELECT	MIN(t.view_definition)
		INTO	STRICT l_tmp
		FROM	information_schema.views t
		WHERE	0=0
		AND	t.table_name = LOWER(x.table_name);
		
		IF LOWER(l_tmp) = LOWER(x.view_definition) THEN
			-- 何もしない
			NULL;
		ELSE
			IF position('_lcl' in x.table_name) > 0 THEN
				-- 'ロケールView'
				IF position('_cmn' in l_tmp) = 0 THEN
					-- 会社別の場合、再設定対象とする	
					l_is_rep := TRUE ;
				END IF;
			ELSE
				-- '通常View'
				
				-- 更新用ビュー相当かどうかを評価
				IF ('mam_itm_cmn_upd' = x.table_name 
					OR '_' = substring(x.table_name from char_length(x.table_name))
					OR '$u' = substring(x.table_name from (char_length(x.table_name) - 1))
					)
					AND 'mam_itm_cmn_' <> x.table_name 
				THEN
					-- 更新用ビュー
					l_has_cmn := array_length(regexp_matches(l_tmp, c_reg_cmn, 'i'), 1);

					-- 会社別の場合、再設定対象とする	
					l_is_rep := l_has_cmn IS NULL;
					
				ELSE
					-- 参照用ビュー
					
					-- 定数判定
					l_is_com := mac_mst_nm$is_com(x.mst_nm);
					l_is_lcl := mac_mst_nm$is_lcl(x.mst_nm);
					
					-- ビューの状態を評価
					l_has_lcl := array_length(regexp_matches(l_tmp, c_reg_lcl, 'i'),1);
					l_has_cmn := array_length(regexp_matches(l_tmp, c_reg_cmn, 'i'),1);
					
					IF l_is_lcl > '0' THEN
						IF l_is_com > '0' THEN
							-- ロケール別、会社別の場合、再設定対象とする(mavm_bp もこのパターン)
							l_is_rep := l_has_lcl IS NOT NULL AND l_has_cmn IS NULL ;
						ELSE
							-- ロケール別の場合、再設定対象とする	
							l_is_rep := l_has_lcl IS NOT NULL ;
						END IF;
					ELSE
						IF l_is_com > '0' THEN
							-- 会社別の場合、再設定対象とする	
							l_is_rep :=  l_has_cmn IS NULL ;
						ELSE
							-- 切り替え対象外のマスタは常に削除
							l_is_rep := TRUE ;
						END IF;
					END IF;
				END IF;
			END IF;
					
			IF l_is_rep THEN
				delete from mam_view_definition where table_name = x.table_name;
			END IF;
		
		END IF;
	END LOOP ;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_mst_ctl_batch ()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	マスタ制御情報に従ってマスタのビューを再定義する
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	l_dblink_nm	VARCHAR ;
	x		RECORD ;
BEGIN

	CALL mapa_master$p_mst_ctl_init ();

	SELECT	MIN(m.dblink_nm)
	INTO	STRICT l_dblink_nm
	FROM	mam_mst_dblink m
	WHERE	0=0
	;

	FOR x IN
		SELECT	m.mst_nm,
			m.mst_set_typ,
			m.lcl_flg
		FROM	mam_mst_ctl m
	LOOP
		CALL mapa_master$p_mst_ctl(x.mst_nm, x.mst_set_typ, x.lcl_flg, l_dblink_nm) ;
	END LOOP ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_master$p_ins_binary (
	 IN i_bin NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	バイナリデータを同期する
<REMARKS>
<ARGUMENTS>
<IN>	i_bin
		バイナリＩＤ
<HISTORY>
**********************************************************/
DECLARE
	l_sql_ins_bin	VARCHAR(10000) ;
	l_cnt		INTEGER ;
BEGIN
	NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_master$p_get_binary ()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	バイナリデータを取得する
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	l_sql_get_bin	VARCHAR(10000) ;
	l_cnt		INTEGER;
BEGIN

	NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;
