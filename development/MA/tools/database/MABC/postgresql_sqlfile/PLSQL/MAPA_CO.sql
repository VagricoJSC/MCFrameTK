\encoding UTF-8

CREATE OR REPLACE FUNCTION mapa_co$f_get_co_rec()
RETURNS mam_co
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	会社マスタのレコードを返す
<REMARKS>
<ARGUMENTS>
<RETURN VALUE>
	会社マスタのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_co mam_co%ROWTYPE ;
BEGIN
	BEGIN
		SELECT	m.*
		INTO	STRICT l_co
		FROM	mam_co m
		WHERE	0=0
		;
	EXCEPTION
		WHEN no_data_found THEN
			CALL fcpa_err$raise_app_err('MAUCD0016') ;
	END;

	RETURN l_co ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_del_sys_parm(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	mam_sys_parm_allから引数の会社ＣＤに対応するデータを削除する。
<REMARKS>
<ARGUMENTS>
<ITEM>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	DELETE FROM	mam_sys_parm_all m WHERE	m.co_cd = i_co_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_init_sys_parm(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	mam_sys_parm_allに引数の会社ＣＤの初期データを作成する。
<REMARKS>
	mam_sys_parm_defをもとに作成する
<ARGUMENTS>
<ITEM>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	CALL mapa_co$p_del_sys_parm(i_co_cd);
	INSERT INTO mam_sys_parm_all (
		parm_key,
		parm_val,
		memo1,
		memo2,
		memo3,
		del_flg,
		co_cd
		)
	SELECT	m.parm_key,
		m.parm_val,
		m.memo1,
		m.memo2,
		m.memo3,
		m.del_flg,
		i_co_cd
	FROM	mam_sys_parm_def m
	WHERE	0=0
	;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_del_gp_batch_grp(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	fcm_gp_batch_grp_all、fcm_gp_batch_grp_lcl_allから引数の会社ＣＤに対応するデータを削除する。
<REMARKS>
<ARGUMENTS>
<ITEM>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	DELETE FROM	fcm_gp_batch_grp_all m WHERE	m.co_cd = i_co_cd;
	DELETE FROM	fcm_gp_batch_grp_lcl_all m WHERE	m.co_cd = i_co_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_init_gp_batch_grp(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	fcm_gp_batch_grp_all、fcm_gp_batch_grp_lcl_allに引数の会社ＣＤの初期データを作成する。
<REMARKS>
	mam_gp_batch_grp_defをもとに作成する
<ARGUMENTS>
<ITEM>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	CALL mapa_co$p_del_gp_batch_grp(i_co_cd);
	INSERT INTO fcm_gp_batch_grp_all (
		gp_batch_grp_cd,
		gp_batch_grp_nm,
		co_cd
		)
	SELECT	m.gp_batch_grp_cd,
		m.gp_batch_grp_nm,
		i_co_cd
	FROM	mam_gp_batch_grp_def m
	WHERE	0=0
	AND	m.del_flg = '0'
	AND	m.lcl_cd = (SELECT COALESCE(MIN(w.def_locale_cd), 'ja_JP') FROM fcm_co_all w WHERE w.co_cd = i_co_cd)
	;

	INSERT INTO fcm_gp_batch_grp_lcl_all (
		gp_batch_grp_cd,
		gp_batch_grp_nm,
		lcl_cd,
		co_cd
		)
	SELECT	m.gp_batch_grp_cd,
		m.gp_batch_grp_nm,
		m.lcl_cd,
		i_co_cd
	FROM	mam_gp_batch_grp_def m
	WHERE	0=0
	AND	m.del_flg = '0'
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	fcm_gp_batch_grp_lcl_all x
			WHERE	0=0
			AND	x.gp_batch_grp_cd = m.gp_batch_grp_cd
			AND	x.lcl_cd = m.lcl_cd
			AND	x.co_cd = i_co_cd
		)
	;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_ins_sys_parm(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	mam_sys_parm_allに引数の会社ＣＤで登録されていないデータを追加する。
<REMARKS>
	mam_sys_parm_defをもとに作成する
<ARGUMENTS>
<ITEM>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	INSERT INTO mam_sys_parm_all (
		parm_key,
		parm_val,
		memo1,
		memo2,
		memo3,
		del_flg,
		co_cd)
	SELECT	m.parm_key,
		m.parm_val,
		m.memo1,
		m.memo2,
		m.memo3,
		m.del_flg,
		i_co_cd
	FROM	mam_sys_parm_def m
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mam_sys_parm_all x
			WHERE	0=0
			AND	x.parm_key = m.parm_key
			AND	x.co_cd = i_co_cd
		)
	;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_ins_gp_batch_grp(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	fcm_gp_batch_grp_all、fcm_gp_batch_grp_lcl_allに引数の会社ＣＤで登録されていないデータを追加する。
<REMARKS>
	mam_gp_batch_grp_defをもとに作成する
<ARGUMENTS>
<ITEM>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	INSERT INTO fcm_gp_batch_grp_all (
		gp_batch_grp_cd,
		gp_batch_grp_nm,
		co_cd
		)
	SELECT	m.gp_batch_grp_cd,
		m.gp_batch_grp_nm,
		i_co_cd
	FROM	mam_gp_batch_grp_def m
	WHERE	0=0
	AND	m.del_flg = '0'
	AND	m.lcl_cd = (SELECT COALESCE(MIN(w.def_locale_cd), 'ja_JP') FROM fcm_co_all w WHERE w.co_cd = i_co_cd)
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	fcm_gp_batch_grp_all x
			WHERE	0=0
			AND	x.gp_batch_grp_cd = m.gp_batch_grp_cd
			AND	x.co_cd = i_co_cd
		)
	;

	INSERT INTO fcm_gp_batch_grp_lcl_all (
		gp_batch_grp_cd,
		gp_batch_grp_nm,
		lcl_cd,
		co_cd
		)
	SELECT	m.gp_batch_grp_cd,
		m.gp_batch_grp_nm,
		m.lcl_cd,
		i_co_cd
	FROM	mam_gp_batch_grp_def m
	WHERE	0=0
	AND	m.del_flg = '0'
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	fcm_gp_batch_grp_lcl_all x
			WHERE	0=0
			AND	x.gp_batch_grp_cd = m.gp_batch_grp_cd
			AND	x.lcl_cd = m.lcl_cd
			AND	x.co_cd = i_co_cd
		)
	;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_ins_def_all()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	すべての会社にバッチ処理グループ、システムパラメータ、滞留制御情報、発番パタン、在庫分析制御情報、滞留予定制御情報の差分追加を行う。
<REMARKS>
	以下の処理を実行する
	mapa_co$p_ins_sys_parm
	mapa_co$p_ins_gp_batch_grp
	mapa_cost_sys$p_ins_non_mov_ctl
	mapa_num$p_ins_num_ptn
	mapa_co$p_ins_stk_anly_ctl
	mapa_co$p_ins_non_mov_schd_ctl
<ARGUMENTS>
<ITEM>
<HISTORY>
**********************************************************/
DECLARE
	l_sql1 CONSTANT VARCHAR := 
				'
				CALL mapa_co$p_ins_sys_parm($1) ;
				';
	l_sql2 CONSTANT VARCHAR := 
				'
				CALL mapa_co$p_ins_gp_batch_grp($1) ;
				';
	l_sql3 CONSTANT VARCHAR := 
				'
				CALL mapa_cost_sys$p_ins_non_mov_ctl($1) ;
				';
	l_sql4 CONSTANT VARCHAR := 
				'
				CALL mapa_num$p_ins_num_ptn($1) ;
				';
	l_sql5 CONSTANT VARCHAR := 
				'
				CALL mapa_co$p_ins_stk_anly_ctl($1) ;
				';
	l_sql6 CONSTANT VARCHAR := 
				'
				CALL mapa_co$p_ins_non_mov_schd_ctl($1) ;
				';
	x RECORD;
BEGIN
	FOR x IN
	SELECT	m.co_cd
		FROM	mam_co_all m
		WHERE	0=0
	LOOP
		CALL fcpa_context$set_co_cd(x.co_cd);
		EXECUTE l_sql1 USING x.co_cd;
		EXECUTE l_sql2 USING x.co_cd;
		EXECUTE l_sql3 USING x.co_cd;
		EXECUTE l_sql4 USING x.co_cd;
		EXECUTE l_sql5 USING x.co_cd;
		EXECUTE l_sql6 USING x.co_cd;
	END LOOP;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_clear_push_ntc(
	 IN i_co_cd VARCHAR DEFAULT NULL, 
	 IN i_ts TIMESTAMP WITHOUT TIME ZONE DEFAULT NULL)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	プッシュ通知関連のデータを削除する。
	会社を指定しない場合はすべての会社のデータを削除する。
	日時を指定した場合は指定した日時以前に登録されたデータを削除する。
	日時を指定しない場合はすべての日時のデータを削除する。
<REMARKS>
	以下のテーブルを削除する
	mat_push_ntc_h_all
	mat_push_ntc_msg_all
	mat_push_ntc_trans_all
	mat_push_ntc_usr_all
<ARGUMENTS>
<ITEM>	i_co_cd
		会社ＣＤ
<ITEM>	i_ts
		日時
<HISTORY>
**********************************************************/
BEGIN
	DELETE FROM	mat_push_ntc_h_all t
	WHERE	0=0
	AND	(i_co_cd IS NULL OR t.co_cd = i_co_cd)
	AND	(i_ts IS NULL OR t.ins_ts <= i_ts)
	;

	DELETE FROM	mat_push_ntc_msg_all t
	WHERE	0=0
	AND	(i_co_cd IS NULL OR t.co_cd = i_co_cd)
	AND	(i_ts IS NULL OR t.ins_ts <= i_ts)
	;

	DELETE FROM	mat_push_ntc_trans_all t
	WHERE	0=0
	AND	(i_co_cd IS NULL OR t.co_cd = i_co_cd)
	AND	(i_ts IS NULL OR t.ins_ts <= i_ts)
	;

	DELETE FROM	mat_push_ntc_usr_all t
	WHERE	0=0
	AND	(i_co_cd IS NULL OR t.co_cd = i_co_cd)
	AND	(i_ts IS NULL OR t.ins_ts <= i_ts)
	;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_init_stk_anly_ctl(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	在庫分析制御情報を初期化する。
<REMARKS>
	msc_stk_anly_ctl_all、msc_stk_anly_ctl_defが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					INSERT INTO msc_stk_anly_ctl_all (
						io_act_typ,
						ctl_tgt_typ,
						co_cd,
						memo1,
						memo2,
						memo3
					) SELECT
						m.io_act_typ,
						m.ctl_tgt_typ,
						$1,
						m.memo1,
						m.memo2,
						m.memo3
					FROM
						msc_stk_anly_ctl_def m
					';
BEGIN
	CALL mapa_co$p_del_stk_anly_ctl(i_co_cd);

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	(t.table_name ILIKE 'msc_stk_anly_ctl_all' OR t.table_name ILIKE 'msc_stk_anly_ctl_def')
	;

	IF l_cnt = 2 THEN
		EXECUTE l_sql USING i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_del_stk_anly_ctl(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	在庫分析制御情報を削除する。
<REMARKS>
	msc_stk_anly_ctl_allが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					DELETE FROM	MSC_STK_ANLY_CTL_ALL t
					WHERE	0=0
					AND	t.CO_CD = $1
					';
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	t.table_name ILIKE 'msc_stk_anly_ctl_all'
	;

	IF l_cnt = 1 THEN
		EXECUTE l_sql USING i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_ins_stk_anly_ctl(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	msc_stk_anly_ctl_allに引数の会社ＣＤで登録されていないデータを追加する。
<REMARKS>
	msc_stk_anly_ctl_all、msc_stk_anly_ctl_defが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					INSERT INTO msc_stk_anly_ctl_all (
						io_act_typ,
						ctl_tgt_typ,
						co_cd,
						memo1,
						memo2,
						memo3
					) SELECT
						m.io_act_typ,
						m.ctl_tgt_typ,
						$1,
						m.memo1,
						m.memo2,
						m.memo3
					FROM
						msc_stk_anly_ctl_def m
					WHERE	0=0
					AND	NOT EXISTS (
							SELECT	m.io_act_typ,
									m.ctl_tgt_typ
							FROM	msc_stk_anly_ctl_all x
							WHERE	0=0
							AND	x.io_act_typ = m.io_act_typ
							AND	x.ctl_tgt_typ = m.ctl_tgt_typ
							AND	x.co_cd = $2
						)
					';
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	(t.table_name ILIKE 'msc_stk_anly_ctl_all' OR t.table_name ILIKE 'msc_stk_anly_ctl_def')
	;

	IF l_cnt = 2 THEN
		EXECUTE l_sql USING i_co_cd, i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_init_non_mov_schd_ctl(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	滞留予定制御情報を初期化する。
<REMARKS>
	msc_non_mov_schd_ctl_all、msc_non_mov_schd_ctl_defが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					INSERT INTO msc_non_mov_schd_ctl_all (
						io_schd_typ,
						co_cd,
						memo1,
						memo2,
						memo3
					) SELECT
						m.io_schd_typ,
						$1,
						m.memo1,
						m.memo2,
						m.memo3
					FROM
						msc_non_mov_schd_ctl_def m
					';
BEGIN
	CALL mapa_co$p_del_non_mov_schd_ctl(i_co_cd);
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	(t.table_name ILIKE 'msc_non_mov_schd_ctl_all' OR t.table_name ILIKE 'msc_non_mov_schd_ctl_def')
	;

	IF l_cnt = 2 THEN
		EXECUTE l_sql USING i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_del_non_mov_schd_ctl(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	滞留予定情報を削除する。
<REMARKS>
	msc_non_mov_schd_ctl_allが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					DELETE FROM msc_non_mov_schd_ctl_all t
					WHERE	0=0
					AND	t.co_cd = $1
					';
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	t.table_name ILIKE 'msc_non_mov_schd_ctl_all'
	;

	IF l_cnt = 1 THEN
		EXECUTE l_sql USING i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_co$p_ins_non_mov_schd_ctl(
	 IN i_co_cd VARCHAR)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	msc_non_mov_schd_ctl_allに引数の会社ＣＤで登録されていないデータを追加する。
<REMARKS>
	msc_non_mov_schd_ctl_all、msc_non_mov_schd_ctl_defが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					INSERT INTO msc_non_mov_schd_ctl_all (
						io_schd_typ,
						co_cd,
						memo1,
						memo2,
						memo3
					) SELECT
						m.io_schd_typ,
						$1,
						m.memo1,
						m.memo2,
						m.memo3
					FROM
						msc_non_mov_schd_ctl_def m
					WHERE	0=0
					AND	NOT EXISTS (
							SELECT	m.io_schd_typ
							FROM	msc_non_mov_schd_ctl_all x
							WHERE	0=0
							AND	x.io_schd_typ = m.io_schd_typ
							AND	x.co_cd = $2
						)
					';
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	(t.table_name ILIKE 'msc_non_mov_schd_ctl_all' OR t.table_name ILIKE 'msc_non_mov_schd_ctl_def')
	;

	IF l_cnt = 2 THEN
		EXECUTE l_sql USING i_co_cd, i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;

