\encoding UTF-8

CREATE OR REPLACE PROCEDURE mapa_num$p_counter_init ()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
		このパッケージを初期化します
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
BEGIN
    /* 今は何もない */
    NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_seq_list (
	IN i_ora_seq_nm	VARCHAR, 
	IN i_cnt	NUMERIC
	)
RETURNS TABLE (
	seq NUMERIC(22)
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定されたシーケンスを指定された数分発番する
<REMARKS>
	テーブル・ファンクション
<ARGUMENTS>
<IN>	i_ora_seq_nm
		シーケンス名
<IN>	i_cnt
		シーケンスを発番する数
<RETURNVALUE>
	発番した番号（数値）のコレクション
<HISTORY>
**************************************************************************/
BEGIN
	FOR I IN 1..i_cnt LOOP
		seq := mapa_num$f_get_seq(i_ora_seq_nm) ;
		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_new_ora_seq_nm ()
RETURNS VARCHAR
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	シーケンスに使う名称を新規作成する
<REMARKS>
<ARGUMENTS>
<RETURNVALUE>
	シーケンス名
<HISTORY>
**************************************************************************/
DECLARE
	c_seq_prefix	CONSTANT VARCHAR := 'MAS_ORA_SEQ_' ;
	l_seq_name_num	NUMERIC(19) ; /* 桁数は、30 - LENGTH(c_seq_prefix))::INTEGER */
BEGIN
	l_seq_name_num := NEXTVAL('mas_seq_nm') ;

	RETURN c_seq_prefix || LPAD(l_seq_name_num::VARCHAR, (30 - LENGTH(c_seq_prefix))::INTEGER, '0') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_to_num_number_const (
	IN i_src_str	VARCHAR,
	IN i_src_origin	VARCHAR,
	INOUT o_dest_num NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	文字列を数値に変換する（定数用）
<REMARKS>
	エラー処理を統一することが目的のファンクション
<ARGUMENTS>
<IN>	i_src_str
		変換対象（数値を表す文字列）
<IN>	i_src_origin
		変換対象の発生元（例外処理で使用する）
<OUT>	o_dest_num
		変換後の数値
**************************************************************************/
DECLARE
	l_bind	VARCHAR[] ;
BEGIN
	o_dest_num := i_src_str::NUMERIC ;
EXCEPTION
	WHEN invalid_text_representation THEN
		/* MAC_NUM_PROC.LAST_VAL_DEFの設定エラー（数値にできない文字列） */
		l_bind := fcpa_err$msg_binder(i_src_origin, i_src_str) ;
		CALL fcpa_err$raise_app_err('MAUCD0001', l_bind) ;
	WHEN string_data_right_truncation OR numeric_value_out_of_range THEN
		/* 文字列の桁数が数値の精度（桁数）以上の場合 */
		l_bind := fcpa_err$msg_binder(i_src_origin, i_src_str) ;
		CALL fcpa_err$raise_app_err('MAUCD0003', l_bind) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_append (
	IN i_append_str	VARCHAR,
	IN i_undisp_flg	CHARACTER,
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_col_nm	VARCHAR,
	INOUT io_dest_undisp_str VARCHAR,
	INOUT io_dest_disp_str	VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	現在の非表示文字列、表示文字列それぞれに、文字列を追加します。
<REMARKS>
	エラー処理を統一することが主目的の処理
<ARGUMENTS>
<IN>	i_appnd_str
		結合対象の文字列
<IN>	i_undisp_flg
		非表示フラグ
<IN>	i_biz_typ
		例外が発生した発番業務区分（例外処理で使用する）
<IN>	i_ptn_cd
		例外が発生した発番パタンＣＤ（例外処理で使用する）
<IN>	i_col_nm
		例外が発生した要素区分のカラム名（例外処理で使用する）
<INOUT>	io_dest_undisp_str
		非表示文字列
<INOUT>	io_dest_disp_str
		表示文字列
**************************************************************************/
DECLARE
	l_bind	VARCHAR[] ;
BEGIN
	BEGIN
		io_dest_undisp_str := CONCAT_WS('', io_dest_undisp_str, i_append_str) ;
	EXCEPTION
		WHEN data_exception THEN
		/* 文字列の桁数が数値の精度（桁数）以上の場合 */
		l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_col_nm, io_dest_undisp_str, i_append_str) ;
		CALL fcpa_err$raise_app_err('MAUCD0013', l_bind) ;
	END ;

	BEGIN
		IF i_undisp_flg <> '1' THEN
			io_dest_disp_str := CONCAT_WS('', io_dest_disp_str, i_append_str) ;
		END IF ;
	EXCEPTION
		WHEN data_exception THEN
		/* 文字列の桁数が数値の精度（桁数）以上の場合 */
		l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_col_nm, io_dest_disp_str, i_append_str) ;
		CALL fcpa_err$raise_app_err('MAUCD0022', l_bind) ;
	END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_seq_length (
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	連番の桁数を取得する。
<REMARKS>
	発番パタンマスタの要素に定義された連番（SEQ）の項目を特定し、
	対応する項目の桁数を返す。
<ARGUMENTS>
<IN>	i_biz_typ
		作成対象の発番業務区分
<IN>	i_ptn_cd
		作成対象の発番パタンＣＤ
**************************************************************************/
DECLARE
	c_seq	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ELM_TYP','SEQ') ;
	x	RECORD ;
BEGIN
	FOR x IN
		SELECT	m.*
		FROM	mam_num_ptn m
		WHERE	0=0
		AND 	m.num_biz_typ = i_biz_typ
		AND	m.num_ptn_cd = i_ptn_cd
	LOOP
		IF x.elm_typ1 = c_seq THEN
			RETURN x.elm_dgt1 ;

		ELSIF x.elm_typ2 = c_seq THEN
			RETURN x.elm_dgt2 ;

		ELSIF x.elm_typ3 = c_seq THEN
			RETURN x.elm_dgt3 ;

		ELSIF x.elm_typ4 = c_seq THEN
			RETURN x.elm_dgt4 ;

		ELSIF x.elm_typ5 = c_seq THEN
			RETURN x.elm_dgt5 ;

		ELSIF x.elm_typ6 = c_seq THEN
			RETURN x.elm_dgt6 ;

		ELSIF x.elm_typ7 = c_seq THEN
			RETURN x.elm_dgt7 ;

		ELSIF x.elm_typ8 = c_seq THEN
			RETURN x.elm_dgt8 ;

		ELSIF x.elm_typ9 = c_seq THEN
			RETURN x.elm_dgt9 ;

		ELSIF x.elm_typ10 = c_seq THEN
			RETURN x.elm_dgt10 ;
		END IF ;
	END LOOP ;

	RETURN 0 ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_create_ora_sequence (
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_ora_seq_nm	VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定された名称のシーケンスを作成する。
<REMARKS>
	(以下はORACLEの場合)
	このプロシージャ内でDDL文を発行するため、COMMITが発行される。
	P_CREATE_SEQから本プロシージャを呼ぶ場合は問題がないが、
	直接呼ぶ場合は、別セッションにするなどの対策が必要になる。
<ARGUMENTS>
<IN>	i_biz_typ
		作成対象の発番業務区分
<IN>	i_ptn_cd
		作成対象の発番パタンＣＤ
<IN>	i_ora_seq_nm
		作成対象のシーケンス名
**************************************************************************/
DECLARE
	c_seq_cycl_flg_def 	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_PROC', 'SEQ_CYCL_FLG_DEF') ;
	c_seq_inc_def		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_PROC', 'SEQ_INC_DEF') ;
	c_seq_min_val_def	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_PROC', 'SEQ_MIN_VAL_DEF') ;
	c_seq_max_val_def	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_PROC', 'SEQ_MAX_VAL_DEF') ;
	c_last_val_def		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_PROC', 'LAST_VAL_DEF') ;
	c_max_val_postgres	CONSTANT BIGINT := 999999999999999999 ; /* PostgresSQLはBIGINTの幅（最大：9223372036854775807）のみ指定可能 */

	/* ローカル変数 */
	l_start_val	NUMERIC ;
	l_temp_val	NUMERIC ;
	l_max_val	NUMERIC ;
	l_dgt		NUMERIC ;
	l_cycle_str	VARCHAR(20) ;
	l_sql	VARCHAR ;

	l_bind	VARCHAR[] ;

BEGIN
	IF c_seq_cycl_flg_def = '1' THEN
		l_cycle_str := 'CYCLE' ;
	ELSE
		l_cycle_str := 'NO CYCLE' ;
	END IF ;

	CALL mapa_num$p_to_num_number_const(c_last_val_def, 'MAC_NUM_PROC.LAST_VAL_DEF', l_start_val) ;

	/* 文字列が数値として妥当かどうかチェック（戻り値は使用しない） */
	CALL mapa_num$p_to_num_number_const(c_seq_inc_def, 'MAC_NUM_PROC.SEQ_INC_DEF', l_temp_val) ;
	CALL mapa_num$p_to_num_number_const(c_seq_min_val_def, 'MAC_NUM_PROC.SEQ_MIN_VAL_DEF', l_temp_val) ;
	CALL mapa_num$p_to_num_number_const(c_seq_max_val_def, 'MAC_NUM_PROC.SEQ_MAX_VAL_DEF', l_temp_val) ;

	/* 最大値を要素が指定する連番の桁数に抑える */
	IF i_biz_typ IS NOT NULL AND i_ptn_cd IS NOT NULL THEN
		l_dgt := mapa_num$f_get_seq_length(i_biz_typ, i_ptn_cd) ;
		l_max_val := COALESCE(fcpa_postgres_util$substr(c_seq_max_val_def, 1, l_dgt), '0') ;
	ELSE
		l_max_val := c_seq_max_val_def ;
	END IF ;

	/* PostgreSQL独自のチェック */
	IF l_max_val > c_max_val_postgres THEN
		l_max_val := c_max_val_postgres ; 
	END IF ;

	/* ORA_SEQ_OPT の指定はなし */
   	l_sql := 'CREATE SEQUENCE ' || i_ora_seq_nm 
			|| ' INCREMENT BY ' ||  c_seq_inc_def::BIGINT
			|| ' START WITH ' || (l_start_val + 1)::BIGINT
			|| ' MAXVALUE ' || l_max_val::BIGINT
			|| ' MINVALUE ' || c_seq_min_val_def::BIGINT
			|| ' ' || l_cycle_str
			;

	EXECUTE l_sql ;

EXCEPTION
	WHEN duplicate_table THEN /* 「オラクルのエラー番号：00955 既に使用されているオブジェクト名です」 のエラー*/
		l_bind := fcpa_err$msg_binder(i_ora_seq_nm) ;
		CALL fcpa_err$raise_app_err('MAUCD0002', l_bind) ;

	WHEN invalid_parameter_value THEN /* 「オラクルのエラー番号：04004 最小値は最大値より小さい必要があります。」 のエラー*/
		l_bind := fcpa_err$msg_binder(c_seq_min_val_def, c_seq_max_val_def) ;
		CALL fcpa_err$raise_app_err('MAUCD0017', l_bind) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_create_ora_sequence (
	IN i_ora_seq_nm VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定された名称のシーケンスを作成する。
<REMARKS>
	(以下はORACLEの場合)
	このプロシージャ内でDDL文を発行するため、COMMITが発行される。
	P_CREATE_SEQから本プロシージャを呼ぶ場合は問題がないが、
	直接呼ぶ場合は、別セッションにするなどの対策が必要になる。
<ARGUMENTS>
<IN>	i_ora_seq_nm
		作成対象のシーケンス名
**************************************************************************/
BEGIN
	CALL mapa_num$p_create_ora_sequence(NULL, NULL, i_ora_seq_nm) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_create_seq (
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_key_elm	VARCHAR,
	INOUT io_seq_typ VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定されたコードで MAT_SEQ に新規レコードを作成する。
<REMARKS>
	通常発生しないが排他の関係で指定された引数の中で
	属性項目のもの（IO_SEQ_TYPE）は、引数と異なる物になる可能性がある。
	呼び出し元とは別セッションで実行し、このセッション内でCOMMITされる必要がある。
	※p_get_seq_procではMAT_SEQが別セッションでロックされるため
<ARGUMENTS>
<IN>	i_biz_typ
		作成対象の発番業務区分
<IN>	i_ptn_cd
		作成対象の発番パタンＣＤ
<IN>	i_key_elm
		作成対象のキー要素
<INOUT>	io_seq_typ
		（引数）作成対象のシーケンス区分。（戻り値）キーに対応するシーケンス区分
**************************************************************************/
DECLARE
	c_seq_min_val_def	CONSTANT NUMERIC := fcpa_const$get_const_val('MAC_NUM_PROC', 'SEQ_MIN_VAL_DEF')::NUMERIC ;
	c_seq_max_val_def	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_PROC', 'SEQ_MAX_VAL_DEF') ;
	c_seq_inc_def	CONSTANT NUMERIC := fcpa_const$get_const_val('MAC_NUM_PROC', 'SEQ_INC_DEF')::NUMERIC ;
	c_seq_cycl_flg_def	CONSTANT CHAR(1) := fcpa_const$get_const_val('MAC_NUM_PROC', 'SEQ_CYCL_FLG_DEF') ;
	c_last_val_def	CONSTANT NUMERIC := fcpa_const$get_const_val('MAC_NUM_PROC', 'LAST_VAL_DEF')::NUMERIC ;

	l_ora_seq_nm	mat_seq.ora_seq_nm%TYPE ;
	l_bind		VARCHAR[] ;
	l_dgt		NUMERIC ;
	l_max_val	NUMERIC ;
BEGIN
	IF fcpa_const$get_const_val('MAC_SEQ_TYP', 'ORA_SEQ') = io_seq_typ THEN
		l_ora_seq_nm := mapa_num$f_get_new_ora_seq_nm() ;
		CALL mapa_num$p_create_ora_sequence(i_biz_typ, i_ptn_cd, l_ora_seq_nm) ;

		INSERT INTO mat_seq (
			num_biz_typ, num_ptn_cd, key_elm,
			seq_typ, ora_seq_nm,
			min_val,
			max_val,
			increment_by,
			cycl_flg,
			last_val
			)
		VALUES (
			i_biz_typ, i_ptn_cd, i_key_elm, 
			io_seq_typ, l_ora_seq_nm,
			NULL,
			NULL,
			NULL, 
			'0',
			NULL
			) ;

	ELSIF mac_seq_typ$is_tbl_seq(io_seq_typ) = '1' THEN
		l_ora_seq_nm := NULL ;
		l_dgt := mapa_num$f_get_seq_length(i_biz_typ, i_ptn_cd) ;
		l_max_val := COALESCE(fcpa_postgres_util$substr(c_seq_max_val_def, 1, l_dgt), '0')::NUMERIC ;

		INSERT INTO mat_seq (
			num_biz_typ, num_ptn_cd, key_elm,
			seq_typ, ora_seq_nm,
			min_val,
			max_val,
			increment_by,
			cycl_flg,
			last_val
			)
		VALUES (
			i_biz_typ, i_ptn_cd, i_key_elm,
			io_seq_typ, l_ora_seq_nm,
			c_seq_min_val_def,
			l_max_val,
			c_seq_inc_def,
			c_seq_cycl_flg_def,
			c_last_val_def
			) ;
	ELSE
		/* シーケンス区分が予期せぬ値だった場合 */
		l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_key_elm, io_seq_typ) ;
		CALL fcpa_err$raise_app_err('MAUCD0012', l_bind) ;
	END IF ;

EXCEPTION
	WHEN unique_violation THEN
		SELECT	t.seq_typ
		INTO STRICT io_seq_typ
		FROM	mat_seq t
		WHERE	0=0
		AND	t.num_biz_typ = i_biz_typ
		AND	t.num_ptn_cd = i_ptn_cd
		AND	t.key_elm = i_key_elm
		;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_get_seq_proc (
	IN i_rec	mat_seq, 
	INOUT o_val	NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定された値からカウンタマスタを検索し、次の番号を発番して返します。
<REMARKS>
<ARGUMENTS>
<IN>	i_rec
		発番対象のMAT_SEQのROW
<OUT>	o_val
		発番した値
**************************************************************************/
DECLARE
	l_rec	mat_seq%ROWTYPE ;
	l_ret_num_val	NUMERIC ; /* 戻り値を数値にしたもの */
	l_min_val	NUMERIC ;
	l_max_val	NUMERIC ;
 	l_bind	VARCHAR[] ;
BEGIN
	BEGIN
		SELECT	t.*
		INTO STRICT l_rec
		FROM	mat_seq t
		WHERE	0=0
		AND	t.num_biz_typ = i_rec.num_biz_typ
		AND	t.num_ptn_cd = i_rec.num_ptn_cd
		AND	t.key_elm = i_rec.key_elm
		FOR UPDATE ;

		IF i_rec.seq_typ <> l_rec.seq_typ THEN
			/* 別セッションにする／しないの判断とSEQ_TYPが変更されていた場合、 */
			/* 排他エラーと判断する */
			RAISE lock_not_available ;
		END IF ;
	EXCEPTION
		WHEN lock_not_available THEN
			l_bind := fcpa_err$msg_binder(SQLSTATE, i_rec.num_biz_typ, i_rec.num_ptn_cd, i_rec.key_elm, i_rec.seq_typ, l_rec.seq_typ) ;
			CALL fcpa_err$raise_app_err('MAUCD0009', l_bind) ;
		WHEN others THEN
			l_bind := fcpa_err$msg_binder(SQLSTATE, i_rec.num_biz_typ, i_rec.num_ptn_cd, i_rec.key_elm) ;
			CALL fcpa_err$raise_app_err('MAUCD0005', l_bind) ;
		END ;

	/* 以後、i_recを使わない（l_recを使う） */
	IF mac_seq_typ$is_tbl_seq(l_rec.seq_typ) = '1' THEN
		l_ret_num_val := l_rec.last_val ;
		l_ret_num_val := l_ret_num_val + l_rec.increment_by ;

		l_min_val := l_rec.min_val ;
		l_max_val := l_rec.max_val ;
		IF l_ret_num_val < l_min_val THEN
			l_ret_num_val := l_min_val ;
		END IF ;

		IF l_ret_num_val > l_max_val THEN
			IF l_rec.cycl_flg <> '1' THEN
				/* 自動セット許可ではないのにのカウンタが最大値を超えた */
				l_bind := fcpa_err$msg_binder(i_rec.num_biz_typ, i_rec.num_ptn_cd, i_rec.key_elm) ;
				CALL fcpa_err$raise_app_err('MAUCD0007', l_bind) ;
			ELSE
				l_ret_num_val := l_min_val ;
				IF l_ret_num_val > l_max_val THEN
					/* 最小値が最大値より大きい場合（＝設定が不正） */
					l_bind := fcpa_err$msg_binder(i_rec.num_biz_typ, i_rec.num_ptn_cd, i_rec.key_elm) ;
					CALL fcpa_err$raise_app_err('MAUCD0014', l_bind) ;
				END IF ;
			END IF ;
		END IF ;

		o_val := l_ret_num_val ;
		/* カウンタの保存 */
		UPDATE	mat_seq t
		SET 	last_val = o_val
		WHERE	0=0
		AND	t.num_biz_typ = l_rec.num_biz_typ
		AND	t.num_ptn_cd = l_rec.num_ptn_cd
		AND	t.key_elm = l_rec.key_elm
		;
	ELSE
		/* 要素区分が予期せぬ値だった場合 */
		l_bind := fcpa_err$msg_binder(l_rec.num_biz_typ, l_rec.num_ptn_cd, l_rec.key_elm, l_rec.seq_typ) ;
		CALL fcpa_err$raise_app_err('MAUCD0012', l_bind) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_get_seq_proc_sub (
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
 	IN i_key_elm	VARCHAR,
	IN i_seq_typ	VARCHAR,
	INOUT o_val	NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	MAT_SEQの要素をもとにカウンタ発番処理を起動する
<REMARKS>
<ARGUMENTS>
<IN>	i_biz_typ
		作成対象の発番業務区分
<IN>	i_ptn_cd
		作成対象の発番パタンＣＤ
<IN>	i_key_elm
		作成対象のキー要素
<IN>	i_seq_typ
		作成対象のシーケンス区分
<OUT>	o_val
		発番した値
**************************************************************************/
DECLARE
	l_rec	mat_seq%ROWTYPE ;
BEGIN
	l_rec.num_biz_typ := i_biz_typ ;
	l_rec.num_ptn_cd := i_ptn_cd ;
	l_rec.key_elm := i_key_elm ;
	l_rec.seq_typ := i_seq_typ ;

	CALL mapa_num$p_get_seq_proc(l_rec, o_val) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_num$p_get_seq_atnms (
	IN i_rec	mat_seq,
	INOUT o_val	NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	別セッションでカウンタ発番処理を起動し発番後コミットします。
<REMARKS>
<ARGUMENTS>
<IN>	i_rec
		発番対象のMAT_SEQのROW
<OUT>	o_val
		発番した値
**************************************************************************/
DECLARE
	l_sql	VARCHAR ;
BEGIN
	l_sql := format(
			'CALL mapa_num$p_get_seq_proc_sub(%L, %L, %L, %L, 0::NUMERIC)',
			i_rec.num_biz_typ, i_rec.num_ptn_cd, i_rec.key_elm, i_rec.seq_typ
			) ;

	o_val := fcpa_postgres_util$exec_autonomous_function(l_sql)::NUMERIC ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_get_seq (
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_key_elm	VARCHAR,
	IN i_def_seq_typ VARCHAR,
	INOUT o_val	NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	引数に対応したシーケンス区分を検索して、それに応じた発番処理を呼び出し、
	発番結果を返します。
<REMARKS>
	この処理では、どの方式で発番するかを決定するだけで、
	ロックは別処理で行う（別セッションを実現するため）
<ARGUMENTS>
<IN>	i_biz_typ
		発番対象の発番業務区分
<IN>	i_ptn_cd
		発番対象の発番パタンＣＤ
<IN>	i_key_elm
		発番対象のキー要素
<IN>	i_def_seq_typ
		新規にMAT_SEQを作成する場合に使用するSEQ_TYP
<OUT>	o_val
		発番した番号
**************************************************************************/
DECLARE
	l_sql		VARCHAR ;
	l_rec		mat_seq%ROWTYPE ;
	l_seq_typ	mat_seq.seq_typ%TYPE ;
	l_ora_val	NUMERIC ; /* シーケンスから取得した値 */

	l_bind	VARCHAR[] ;
BEGIN
	BEGIN
		SELECT	t.*
		INTO STRICT l_rec
		FROM	mat_seq t
		WHERE	0=0
		AND	t.num_biz_typ = i_biz_typ
		AND	t.num_ptn_cd = i_ptn_cd
		AND	t.key_elm = i_key_elm
		;
	EXCEPTION
		WHEN no_data_found THEN
			l_sql := format('CALL mapa_num$p_create_seq(%L, %L, %L, %L)',
					i_biz_typ, i_ptn_cd, i_key_elm, i_def_seq_typ
					) ;
			l_seq_typ := fcpa_postgres_util$exec_autonomous_function(l_sql)::VARCHAR ;

			SELECT	t.*
			INTO STRICT l_rec
			FROM	mat_seq t
			WHERE	0=0
			AND	t.num_biz_typ = i_biz_typ
			AND	t.num_ptn_cd = i_ptn_cd
			AND	t.key_elm = i_key_elm
			;
	END ;

	IF fcpa_const$get_const_val('MAC_SEQ_TYP', 'ORA_SEQ') = l_rec.seq_typ THEN
		BEGIN
			l_ora_val := NEXTVAL(l_rec.ora_seq_nm) ;

		EXCEPTION
			WHEN undefined_table THEN /* 「オラクルのエラー番号：02289 順序が存在しません」 のエラー*/
				/* 順序が存在しない場合 */
				l_bind := fcpa_err$msg_binder(SQLSTATE, l_rec.num_biz_typ, l_rec.num_ptn_cd, l_rec.key_elm, l_rec.ora_seq_nm) ;
				CALL fcpa_err$raise_app_err('MAUCD0006', l_bind) ;
			WHEN others THEN /* 現状は意味がないけど条件分岐を分けておく */
				l_bind := fcpa_err$msg_binder(SQLSTATE, l_rec.num_biz_typ, l_rec.num_ptn_cd, l_rec.key_elm, l_rec.ora_seq_nm) ;
				CALL fcpa_err$raise_app_err('MAUCD0006', l_bind) ;
		END ;

		o_val := l_ora_val ;

	ELSIF fcpa_const$get_const_val('MAC_SEQ_TYP', 'ATNMS_TRAN') = l_rec.seq_typ THEN
		CALL mapa_num$p_get_seq_atnms(l_rec, o_val) ;
	ELSE
		CALL mapa_num$p_get_seq_proc(l_rec, o_val) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_raise_elm_null_err (
	IN i_elm_label_nm	VARCHAR,
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_elm_typ	VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	mapa_num$f_get_counter_elmのサブプロシージャとして定義されている機能
	エラーの共通処理
<REMARKS>
<ARGUMENTS>
<IN>	i_elm_label_nm
		項目のラベル名
<IN>	i_biz_typ
		発番業務区分
<IN>	i_ptn_cd
		発番パタンＣＤ
<IN>	i_elm_typ
		要素区分
**************************************************************************/
DECLARE
	l_bind	VARCHAR[] ;
BEGIN
	l_bind := fcpa_err$msg_binder(i_elm_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ) ;
	CALL fcpa_err$raise_app_err('MAUCD0032', l_bind) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_edit_str (
	IN i_str	VARCHAR,
	IN i_pad	VARCHAR,
	IN i_elm_dgt	INTEGER
)
RETURNS VARCHAR
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	mapa_num$f_get_counter_elmのサブファンクションとして定義されている機能
	発番のパディング処理
<REMARKS>
<ARGUMENTS>
<IN>	i_str
		元の文字列
<IN>	i_pad
		パディング文字
<IN>	i_elm_dgt
		要素桁数
<RETURNVALUE>
	I_ELM_DGTの桁までパディング文字で右埋めした文字列
**************************************************************************/
BEGIN
	IF i_pad IS NULL THEN
		RETURN fcpa_postgres_util$substr(i_str, 1, i_elm_dgt) ;
	END IF ;

	RETURN fcpa_postgres_util$substr(RPAD(COALESCE(i_str, i_pad), i_elm_dgt, i_pad), 1, i_elm_dgt) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_loc_num_id (
	IN i_loc_cd	VARCHAR
)
RETURNS VARCHAR
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	mapa_num$f_get_counter_elmのサブファンクションとして定義されている機能
	場所に対する発番ＩＤを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_loc_cd
		場所ＣＤ
<RETURNVALUE>
	場所ＣＤに対する発番ＩＤ
	場所マスタが取得できない場合は入力値の場所ＣＤ
**************************************************************************/
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN
		SELECT	m.num_id
		FROM	mam_loc m
		WHERE 	0=0
		AND	m.loc_cd = i_loc_cd
		AND	m.num_id IS NOT NULL
	LOOP
		RETURN x.num_id ;
	END LOOP ;

	RETURN i_loc_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_itm_grp_num_id (
	IN i_itm_cd	VARCHAR,
	IN i_itm_sub1	VARCHAR,
	IN i_itm_sub2	VARCHAR,
	IN i_itm_sub3	VARCHAR,
	IN i_itm_grp_typ	VARCHAR,
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_elm_typ	VARCHAR,
	IN i_parm	VARCHAR
)
RETURNS VARCHAR
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	mapa_num$f_get_counter_elmのサブファンクションとして定義されている機能
	品目に対する発番ＩＤを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_sub1
		枝番１
<IN>	i_sub2
		枝番２
<IN>	i_sub3
		枝番３
<IN>	i_itm_grp_typ
		品目分類区分
<IN>	i_biz_typ
		発番業務区分
<IN>	i_ptn_cd
		発番パタンＣＤ
<IN>	i_elm_typ
		要素区分
<IN>	i_parm
		ITM_SUB_TYPのパラメータ値
<RETURNVALUE>
	品目（品目分類ＣＤ）に対する発番ＩＤ
	発番ＩＤが設定されていない場合は品目分類ＣＤ
	品目マスタが取得できない場合はエラー
**************************************************************************/
DECLARE
	c_itm_grp_typ_grp1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP1') ;
	c_itm_grp_typ_grp2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP2') ;
	c_itm_grp_typ_grp3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP3') ;
	c_itm_grp_typ_grp4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP4') ;
	c_itm_grp_typ_grp5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP5') ;
	c_itm_grp_typ_grp6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP6') ;
	c_itm_grp_typ_grp7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP7') ;
	c_itm_grp_typ_grp8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP8') ;
	c_itm_grp_typ_grp9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP9') ;
	c_itm_grp_typ_grp10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP10') ;

	x	RECORD ;
	y	RECORD ;
	l_bind	VARCHAR[] ;
BEGIN
	FOR x IN
		SELECT	CASE
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp1 THEN m.itm_grp_cd1
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp2 THEN m.itm_grp_cd2
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp3 THEN m.itm_grp_cd3
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp4 THEN m.itm_grp_cd4
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp5 THEN m.itm_grp_cd5
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp6 THEN m.itm_grp_cd6
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp7 THEN m.itm_grp_cd7
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp8 THEN m.itm_grp_cd8
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp9 THEN m.itm_grp_cd9
			WHEN i_itm_grp_typ = c_itm_grp_typ_grp10 THEN m.itm_grp_cd10
			ELSE NULL
			END  itm_grp_cd
		FROM	mam_itm m
		WHERE	0=0
		AND	m.itm_cd = i_itm_cd
		AND	m.itm_sub1 = i_itm_sub1
		AND	m.itm_sub2 = i_itm_sub2
		AND	m.itm_sub3 = i_itm_sub3
	LOOP
		IF x.itm_grp_cd IS NOT NULL THEN
			FOR y IN
				SELECT	m.num_id
				FROM	mam_itm_grp m
				WHERE	0=0
				AND	m.itm_grp_typ = i_itm_grp_typ
				AND	m.itm_grp_cd = x.itm_grp_cd
				AND	m.num_id IS NOT NULL
			LOOP
				RETURN y.num_id ;
			END LOOP ;
		END IF ;

		RETURN x.itm_grp_cd ;
	END LOOP ;

	l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ,
			mapa_comm$f_to_disp_itm(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_parm)
			) ;
	CALL fcpa_err$raise_app_err('MAUCD0034', l_bind) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_itm_site_num_id (
	IN i_itm_cd	VARCHAR,
	IN i_itm_sub1	VARCHAR,
	IN i_itm_sub2	VARCHAR,
	IN i_itm_sub3	VARCHAR,
	IN i_site_cd	VARCHAR,
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_elm_typ	VARCHAR,
	IN i_parm	VARCHAR
)
RETURNS VARCHAR
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	mapa_num$f_get_counter_elmのサブファンクションとして定義されている機能
	品目マスタ（工場・物流倉庫）に対する発番ＩＤを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_sub1
		枝番１
<IN>	i_sub2
		枝番２
<IN>	i_sub3
		枝番３
<IN>	i_site_cd
		工場・物流倉庫ＣＤ
<IN>	i_biz_typ
		発番業務区分
<IN>	i_ptn_cd
		発番パタンＣＤ
<IN>	i_elm_typ
		要素区分
<IN>	i_parm
		ITM_SUB_TYPのパラメータ値
<RETURNVALUE>
	品目マスタ（工場・物流倉庫）の発番ＩＤ
	品目マスタ（工場・物流倉庫）が取得できない場合はエラー
**************************************************************************/
DECLARE
	x	RECORD ;
	l_bind	VARCHAR[] ;
BEGIN
	FOR x IN
		SELECT	m.num_id
		FROM	mam_itm_site m
		WHERE	0=0
		AND	m.itm_cd = i_itm_cd
		AND	m.itm_sub1 = i_itm_sub1
		AND	m.itm_sub2 = i_itm_sub2
		AND	m.itm_sub3 = i_itm_sub3
		AND	m.site_cd = i_site_cd
		AND	m.del_flg = '0'
	LOOP
		RETURN x.num_id ;
	END LOOP ;

	l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ,
			mapa_comm$f_to_disp_itm(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_parm),
			i_site_cd
			) ;
	CALL fcpa_err$raise_app_err('MAUCD0033', l_bind) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_bp_grp_num_id (
	IN i_bp_cd	VARCHAR,
	IN i_bp_grp_typ	VARCHAR,
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_elm_typ	VARCHAR
)
RETURNS VARCHAR
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	mapa_num$f_get_counter_elmのサブファンクションとして定義されている機能
	取引先に対する発番ＩＤを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_bp_grp_typ
		取引先分類区分
<IN>	i_biz_typ
		発番業務区分
<IN>	i_ptn_cd
		発番パタンＣＤ
<IN>	i_elm_typ
		要素区分
<RETURNVALUE>
	取引先ＣＤ（取引先分類ＣＤ）に対する発番ＩＤ
	発番ＩＤが設定されていない場合は取引先分類ＣＤ
	取引先マスタが取得できない場合はエラー
**************************************************************************/
DECLARE
	c_bp_grp_typ_grp1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP1') ;
	c_bp_grp_typ_grp2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP2') ;
	c_bp_grp_typ_grp3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP3') ;
	c_bp_grp_typ_grp4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP4') ;
	c_bp_grp_typ_grp5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP5') ;
	c_bp_grp_typ_grp6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP6') ;
	c_bp_grp_typ_grp7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP7') ;
	c_bp_grp_typ_grp8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP8') ;
	c_bp_grp_typ_grp9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP9') ;
	c_bp_grp_typ_grp10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP10') ;

	x	RECORD ;
	y	RECORD ;
	l_bind	VARCHAR[] ;
BEGIN
	FOR x IN
		SELECT	CASE
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp1 THEN m.bp_grp_cd1
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp2 THEN m.bp_grp_cd2
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp3 THEN m.bp_grp_cd3
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp4 THEN m.bp_grp_cd4
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp5 THEN m.bp_grp_cd5
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp6 THEN m.bp_grp_cd6
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp7 THEN m.bp_grp_cd7
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp8 THEN m.bp_grp_cd8
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp9 THEN m.bp_grp_cd9
			WHEN i_bp_grp_typ = c_bp_grp_typ_grp10 THEN m.bp_grp_cd10
			ELSE NULL
			END bp_grp_cd
		FROM	mam_bp m
		WHERE	0=0
		AND	m.bp_cd = i_bp_cd
	LOOP
		IF x.bp_grp_cd IS NOT NULL THEN
			FOR y IN
				SELECT	m.num_id
				FROM	mam_bp_grp m
				WHERE	0=0
				AND	m.bp_grp_typ = i_bp_grp_typ
				AND	m.bp_grp_cd = x.bp_grp_cd
				AND	m.num_id IS NOT NULL
			LOOP
				RETURN y.num_id ;
			END LOOP ;
		END IF ;

		RETURN x.bp_grp_cd ;
	END LOOP ;

	l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ, i_bp_cd) ;
	CALL fcpa_err$raise_app_err('MAUCD0035', l_bind) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_counter_elm (
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_key_elm	VARCHAR,
	IN i_rec_num_arg maw_num_arg,
	IN i_elm_typ	VARCHAR,
	IN i_elm_dgt	INTEGER,
	IN i_fix	VARCHAR,
	IN i_num_pad_str VARCHAR,
	IN i_def_seq_typ VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	引数に対応した要素文字列を返します。
<REMARKS>
<ARGUMENTS>
<IN>	i_biz_typ
		発番業務区分
<IN>	i_ptn_cd
		発番パタンＣＤ
<IN>	i_key_elm
		キー要素
<IN>	i_rec_num_arg
		発番用引数の値
<IN>	i_elm_typ
		要素区分
<IN>	i_elm_dgt
		要素桁数
<IN>	i_fix
		固定値の値
<IN>	i_num_pad_str
		桁埋め文字
<IN>	i_def_seq_typ
		デフォルトシーケンス区分
<RETURNVALUE>
	発番した番号（文字列）
**************************************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL') ;
	c_pad_str	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_PROC', 'PAD_STR') ;
	c_pad_num	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_PROC', 'PAD_NUM') ;

	l_rec_num_ptn	mam_num_ptn%ROWTYPE ;
	l_num		NUMERIC(2) ;
	l_ans		VARCHAR ;
	l_ans_seq	mat_seq.last_val%TYPE ;
	l_bind		VARCHAR[] ;
	l_parm		mam_sys_parm.parm_val%TYPE ;

	month_indx_m	CONSTANT VARCHAR := '123456789ABC' ;
	month_indx_ma	CONSTANT VARCHAR := 'ABCDEFGHIJKL' ;

BEGIN
	SELECT	MAX(m.parm_val)
	INTO STRICT l_parm
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = 'ITM_SUB_TYP'
	AND	m.del_flg = '0'
	;

	l_ans := NULL ;
	IF fcpa_const$get_const_val('MAC_ELM_TYP', 'FIX') = i_elm_typ THEN
		l_ans := i_fix ;

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'SP') = i_elm_typ THEN
		l_ans := ' ';

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'YYYY') = i_elm_typ THEN
		IF i_rec_num_arg.dt IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.dt_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := TO_CHAR(i_rec_num_arg.dt, 'YYYY');

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'YY') = i_elm_typ THEN
		IF i_rec_num_arg.dt IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.dt_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := TO_CHAR(i_rec_num_arg.dt, 'YY');

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'Y') = i_elm_typ THEN
		IF i_rec_num_arg.dt IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.dt_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := TO_CHAR(i_rec_num_arg.dt, 'Y');

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'M') = i_elm_typ THEN
		IF i_rec_num_arg.dt IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.dt_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_num := TO_NUMBER(TO_CHAR(i_rec_num_arg.dt, 'MM'), '99');
		l_ans := fcpa_postgres_util$substr(month_indx_m, l_num, 1);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'MA') = i_elm_typ THEN
		IF i_rec_num_arg.dt IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.dt_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_num := TO_NUMBER(TO_CHAR(i_rec_num_arg.dt, 'MM'), '99');
		l_ans := fcpa_postgres_util$substr(month_indx_ma, l_num, 1);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'MM') = i_elm_typ THEN
		IF i_rec_num_arg.dt IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.dt_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := TO_CHAR(i_rec_num_arg.dt, 'MM');

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'DD') = i_elm_typ THEN
		IF i_rec_num_arg.dt IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.dt_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := TO_CHAR(i_rec_num_arg.dt, 'DD');

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'STR') = i_elm_typ THEN
		IF i_rec_num_arg.str IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.str_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.str, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'STR2') = i_elm_typ THEN
		IF i_rec_num_arg.str2 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.str2_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;
		l_ans := mapa_num$f_edit_str(i_rec_num_arg.str2, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'STR3') = i_elm_typ THEN
		IF i_rec_num_arg.str3 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.str3_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.str3, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'NUM') = i_elm_typ THEN
		IF i_rec_num_arg.num IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.num_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := fcpa_postgres_util$substr(LPAD(i_rec_num_arg.num::VARCHAR, i_elm_dgt, c_pad_num), 1, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'SEQ') = i_elm_typ THEN
		CALL mapa_num$p_get_seq(i_biz_typ, i_ptn_cd, i_key_elm, i_def_seq_typ, l_ans_seq);

		IF i_elm_dgt < LENGTH(l_ans_seq::VARCHAR) THEN
			l_ans := fcpa_postgres_util$substr(l_ans_seq::VARCHAR, LENGTH(l_ans_seq::VARCHAR) - i_elm_dgt + 1, i_elm_dgt);
		ELSE
			l_ans := fcpa_postgres_util$substr(LPAD(l_ans_seq::VARCHAR, i_elm_dgt, c_pad_num), 1, i_elm_dgt);
		END IF;

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM') = i_elm_typ THEN
		IF i_rec_num_arg.itm_cd IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.itm_cd_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.itm_cd, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_SUB1') = i_elm_typ THEN
		IF i_rec_num_arg.itm_sub1 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.itm_sub1_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.itm_sub1, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_SUB2') = i_elm_typ THEN
		IF i_rec_num_arg.itm_sub2 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.itm_sub2_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;
		l_ans := mapa_num$f_edit_str(i_rec_num_arg.itm_sub2, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_SUB3') = i_elm_typ THEN
		IF i_rec_num_arg.itm_sub3 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.itm_sub3_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.itm_sub3, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'LOC') = i_elm_typ THEN
		IF i_rec_num_arg.loc_cd IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.loc_cd_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(mapa_num$f_get_loc_num_id(i_rec_num_arg.loc_cd), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'DPT') = i_elm_typ THEN
		IF i_rec_num_arg.dpt_cd IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.dpt_cd_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.dpt_cd, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'CO') = i_elm_typ THEN
		IF i_rec_num_arg.co_cd IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.co_cd_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.co_cd, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP') = i_elm_typ THEN
		IF i_rec_num_arg.bp_cd IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.bp_cd_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.bp_cd, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'WG') = i_elm_typ THEN
		IF i_rec_num_arg.wg_cd IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.wg_cd_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.wg_cd, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'TRD') = i_elm_typ THEN
		IF i_rec_num_arg.trd_cd IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.trd_cd_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.trd_cd, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'SITE') = i_elm_typ THEN
		IF i_rec_num_arg.site_cd IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.site_cd_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.site_cd, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'LOT') = i_elm_typ THEN
		IF i_rec_num_arg.lot_no IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.lot_no_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		IF c_null_val = i_rec_num_arg.lot_no THEN
			l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ) ;
			CALL fcpa_err$raise_app_err('MAUCD0026', l_bind) ;
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.lot_no, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'CHD_LOT') = i_elm_typ THEN
		IF i_rec_num_arg.chd_lot_no IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.chd_lot_no_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.chd_lot_no, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'CHD_SUBLOT') = i_elm_typ THEN
		IF i_rec_num_arg.chd_sublot_no IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.chd_sublot_no_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.chd_sublot_no, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_LOT') = i_elm_typ THEN
		IF i_rec_num_arg.bp_lot_no IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.bp_lot_no_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.bp_lot_no, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'SNO1') = i_elm_typ THEN
		IF i_rec_num_arg.sno1 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.sno1_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		IF c_null_val = i_rec_num_arg.sno1 THEN
			l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ) ;
			CALL fcpa_err$raise_app_err('MAUCD0027', l_bind) ;
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.sno1, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'SNO2') = i_elm_typ THEN
		IF i_rec_num_arg.sno2 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.sno2_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		IF c_null_val = i_rec_num_arg.sno2 THEN
			l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ) ;
			CALL fcpa_err$raise_app_err('MAUCD0028', l_bind) ;
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.sno2, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'SNO3') = i_elm_typ THEN
		IF i_rec_num_arg.sno3 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.sno3_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		IF c_null_val = i_rec_num_arg.sno3 THEN
			l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ) ;
			CALL fcpa_err$raise_app_err('MAUCD0029', l_bind) ;
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.sno3, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'SNO4') = i_elm_typ THEN
		IF i_rec_num_arg.sno4 IS NULL THEN
			CALL mapa_num$p_raise_elm_null_err(i_rec_num_arg.sno4_label_nm, i_biz_typ, i_ptn_cd, i_elm_typ);
		END IF;

		IF c_null_val = i_rec_num_arg.sno4 THEN
			l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ) ;
			CALL fcpa_err$raise_app_err('MAUCD0030', l_bind) ;
		END IF;

		l_ans := mapa_num$f_edit_str(i_rec_num_arg.sno4, i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_SITE') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_site_num_id(
						i_rec_num_arg.itm_cd,
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						i_rec_num_arg.site_cd,
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						),
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP01') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP1'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP02') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP2'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP03') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP3'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP04') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP4'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP05') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP5'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP06') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP6'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP07') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP7'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP08') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP8'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP09') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP9'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'ITM_GRP10') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_itm_grp_num_id(
						i_rec_num_arg.itm_cd, 
						i_rec_num_arg.itm_sub1,
						i_rec_num_arg.itm_sub2,
						i_rec_num_arg.itm_sub3,
						fcpa_const$get_const_val('MAC_ITM_GRP_TYP', 'GRP10'),
						i_biz_typ,
						i_ptn_cd,
						i_elm_typ,
						l_parm
						), 
				i_num_pad_str,
				i_elm_dgt
				);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP01') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP1'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP02') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP2'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP03') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP3'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP04') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP4'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP05') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP5'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP06') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP6'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP07') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP7'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP08') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP8'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP09') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP9'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSIF fcpa_const$get_const_val('MAC_ELM_TYP', 'BP_GRP10') = i_elm_typ THEN
		l_ans := mapa_num$f_edit_str(mapa_num$f_get_bp_grp_num_id(i_rec_num_arg.bp_cd, fcpa_const$get_const_val('MAC_BP_GRP_TYP', 'GRP10'), i_biz_typ, i_ptn_cd, i_elm_typ), i_num_pad_str, i_elm_dgt);

	ELSE
        	/* 要素区分が予期せぬ値だった場合 */
		l_bind := fcpa_err$msg_binder(i_biz_typ, i_ptn_cd, i_elm_typ) ;
		CALL fcpa_err$raise_app_err('MAUCD0010', l_bind) ;
	END IF ;

    RETURN l_ans ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_get_main (
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_rec_num_arg	maw_num_arg,
	INOUT o_ret	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	発番マスタの設定に従った番号（文字列）を返します（パターンコードを使う発番業務区分の場合）。
<REMARKS>
	アプリ設計上、発番パタンを使わない場合は、P_GETを使用してください。
<ARGUMENTS>
<IN>	i_biz_typ
		発番業務区分
<IN>	i_ptn_cd
		発番パタンＣＤ
<IN>	i_rec_num_arg
		発番用引数
<OUT>	o_ret
		発番結果
**************************************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL') ;

	l_rec_num_ptn	mam_num_ptn%ROWTYPE ;
	l_ptn_cd	mam_num_ptn.num_ptn_cd%TYPE ;
	l_ans		VARCHAR ;
	l_dispcnt	VARCHAR ;	/* 表示用の発番 */
	l_fullcnt	VARCHAR ;	/* 非表示も含めた発番 */
	l_bind		VARCHAR[] ;
BEGIN
	/* メモ１：L_FULLCNT := L_FULLCNT || L_ANS; の所で桁あふれが発生する可能性がある。 */
	/* メモ２：引数の発番パタンＣＤがNULLの場合、既定値に変換している */
	/* メモ３：定数の属性「IS_USING_PTN_CD」が'1'のとき、発番パタンＣＤがNULLの場合はエラー */
	IF i_ptn_cd IS NULL AND mac_num_biz_typ$is_using_ptn_cd(i_biz_typ) = '1' THEN
		l_bind := fcpa_err$msg_binder(i_biz_typ) ;
		CALL fcpa_err$raise_app_err('MAUCD0031', l_bind) ;
	END IF ;

	l_ptn_cd := COALESCE(i_ptn_cd, fcpa_const$get_const_val('MAC_STR', 'DEF_NUM_PTN_CD')) ;
	BEGIN
		SELECT	m.*
		INTO STRICT l_rec_num_ptn
		FROM	mam_num_ptn m
		WHERE	0=0
		AND	m.num_biz_typ = i_biz_typ
		AND	m.num_ptn_cd = l_ptn_cd
		;
	EXCEPTION
		WHEN no_data_found THEN
			l_bind := fcpa_err$msg_binder(i_biz_typ, l_ptn_cd) ;
			CALL fcpa_err$raise_app_err('MAUCD0011', l_bind) ;
	END ;

	l_dispcnt := NULL ;
	l_fullcnt := NULL ;
	IF l_rec_num_ptn.elm_typ1 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ1,
				l_rec_num_ptn.elm_dgt1::INTEGER,
				l_rec_num_ptn.fix1,
				l_rec_num_ptn.num_pad_str1,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg1,
			i_biz_typ, l_ptn_cd, 'ELM_TYP1', l_fullcnt, l_dispcnt) ;
	END IF ;

	IF l_rec_num_ptn.elm_typ2 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ2,
				l_rec_num_ptn.elm_dgt2::INTEGER,
				l_rec_num_ptn.fix2,
				l_rec_num_ptn.num_pad_str2,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg2,
			i_biz_typ, l_ptn_cd, 'ELM_TYP2', l_fullcnt, l_dispcnt) ;
	END IF ;

	IF l_rec_num_ptn.elm_typ3 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ3,
				l_rec_num_ptn.elm_dgt3::INTEGER, 
				l_rec_num_ptn.fix3,
				l_rec_num_ptn.num_pad_str3,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg3,
			i_biz_typ, l_ptn_cd, 'ELM_TYP3', l_fullcnt, l_dispcnt) ;
	END IF ;

	IF l_rec_num_ptn.elm_typ4 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ4,
				l_rec_num_ptn.elm_dgt4::INTEGER,
				l_rec_num_ptn.fix4,
				l_rec_num_ptn.num_pad_str4,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg4,
			i_biz_typ, l_ptn_cd, 'ELM_TYP4', l_fullcnt, l_dispcnt) ;
	END IF;

	IF l_rec_num_ptn.elm_typ5 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ5,
				l_rec_num_ptn.elm_dgt5::INTEGER,
				l_rec_num_ptn.fix5,
				l_rec_num_ptn.num_pad_str5,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg5,
			i_biz_typ, l_ptn_cd, 'ELM_TYP5', l_fullcnt, l_dispcnt) ;
	END IF ;

	IF l_rec_num_ptn.elm_typ6 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ6,
				l_rec_num_ptn.elm_dgt6::INTEGER,
				l_rec_num_ptn.fix6,
				l_rec_num_ptn.num_pad_str6,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg6,
			i_biz_typ, l_ptn_cd, 'ELM_TYP6', l_fullcnt, l_dispcnt) ;
	END IF ;

	IF l_rec_num_ptn.elm_typ7 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ7,
				l_rec_num_ptn.elm_dgt7::INTEGER,
				l_rec_num_ptn.fix7,
				l_rec_num_ptn.num_pad_str7,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg7,
			i_biz_typ, l_ptn_cd, 'ELM_TYP7', l_fullcnt, l_dispcnt) ;
	END IF ;

	IF l_rec_num_ptn.elm_typ8 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ8,
				l_rec_num_ptn.elm_dgt8::INTEGER,
				l_rec_num_ptn.fix8,
				l_rec_num_ptn.num_pad_str8,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg8,
			i_biz_typ, l_ptn_cd, 'ELM_TYP8', l_fullcnt, l_dispcnt) ;
	END IF ;

	IF l_rec_num_ptn.elm_typ9 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ9,
				l_rec_num_ptn.elm_dgt9::INTEGER,
				l_rec_num_ptn.fix9,
				l_rec_num_ptn.num_pad_str9,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg9,
			i_biz_typ, l_ptn_cd, 'ELM_TYP9', l_fullcnt, l_dispcnt) ;
	END IF ;

	IF l_rec_num_ptn.elm_typ10 IS NOT NULL THEN
		l_ans := mapa_num$f_get_counter_elm(
				i_biz_typ,
				l_ptn_cd,
				COALESCE(fcpa_postgres_util$substr(l_fullcnt, 1, COALESCE(l_rec_num_ptn.key_dgt, 0)), c_null_val),
				i_rec_num_arg,
				l_rec_num_ptn.elm_typ10,
				l_rec_num_ptn.elm_dgt10::INTEGER,
				l_rec_num_ptn.fix10,
				l_rec_num_ptn.num_pad_str10,
				l_rec_num_ptn.def_seq_typ
				) ;
		CALL mapa_num$p_append(l_ans, l_rec_num_ptn.undisp_flg10,
			i_biz_typ, l_ptn_cd, 'ELM_TYP10', l_fullcnt, l_dispcnt) ;
	END IF ;

	/* メモ３：発番結果（O_RET）がNULLの可能性もある。 */
	o_ret := l_dispcnt ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_get_by_ptn (
	IN i_biz_typ	VARCHAR,
	IN i_ptn_cd	VARCHAR,
	IN i_rec_num_arg	maw_num_arg,
	INOUT o_ret	VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	発番マスタの設定に従った番号（文字列）を返します（パターンコードを使う発番業務区分の場合）。
<REMARKS>
	アプリ設計上、発番パタンを使わない場合は、P_GETを使用してください。
<ARGUMENTS>
<IN>	i_biz_typ
		発番業務区分
<IN>	i_ptn_cd
		発番パタンＣＤ
<IN>	i_rec_num_arg
		発番用引数
<OUT>	o_ret
		発番結果
**************************************************************************/
BEGIN
	CALL mapa_num$p_get_main(i_biz_typ, i_ptn_cd, i_rec_num_arg, o_ret) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_set_by_ptn (
	IN i_biz_typ VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	発番パタンＣＤに対応した発番パタンマスタの設定に従った番号（文字列）を取得する。
	一括発番用。
<REMARKS>
	ワークテーブル（MAW_NUM_ARG）を参照してpeg_no順に発番し、
	発番した番号をnew_noに格納する。
<ARGUMENTS>
<IN>	i_biz_typ
		発番業務区分
**************************************************************************/
DECLARE
	l_num	VARCHAR ;
	idx	INTEGER ;
	x	maw_num_arg%ROWTYPE ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mapa_num$p_set_by_ptn$l_num_list', 'maw_num_arg', 'INTEGER') ;
	idx := 0 ;
	FOR x IN
		SELECT	w.*
		FROM	maw_num_arg w
		WHERE	0=0
		ORDER BY w.peg_no
	LOOP
		CALL mapa_num$p_get_main(i_biz_typ, x.num_ptn_cd, x, l_num) ;

		idx := idx + 1 ;
		INSERT INTO mapa_num$p_set_by_ptn$l_num_list (peg_no, new_no, _index_) VALUES (x.peg_no, l_num, idx) ;
	END LOOP ;

	UPDATE	maw_num_arg m
	SET	new_no = i.new_no
	FROM	(SELECT list.new_no, list.peg_no FROM mapa_num$p_set_by_ptn$l_num_list list) i
	WHERE	m.peg_no = i.peg_no
	;

	TRUNCATE TABLE mapa_num$p_set_by_ptn$l_num_list ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_get (
	IN i_biz_typ	VARCHAR, 
	IN i_rec_num_arg	maw_num_arg, 
	INOUT o_ret	VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	発番マスタの設定に従った番号（文字列）を返します（発番パタンＣＤを使う発番業務区分の場合）。
<REMARKS>
	アプリ設計上、発番パタンを使わない場合は、P_GETを使用してください。
<ARGUMENTS>
<IN>	i_biz_typ
		発番業務区分
<IN>	i_rec_num_arg
		発番用引数
<OUT>	o_ret
		発番結果
**************************************************************************/
BEGIN
	CALL mapa_num$p_get_main(i_biz_typ, NULL, i_rec_num_arg, o_ret) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_num$f_get_seq (
	IN i_ora_seq_nm VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定されたシーケンスのNEXTVALを返します。
<REMARKS>
	NUMBERING系の発番処理とは異なり、直接シーケンスの値を返す処理。
	よって、NUMBERING系の処理とは、この処理は共有しない。
	シーケンスが無かったら作るなどのカスタマイズを入れる事ができる。
<ARGUMENTS>
<IN>	i_ora_seq_nm
		シーケンス名
<RETURNVALUE>
	発番した番号（数値）
**************************************************************************/
DECLARE
	l_bind	VARCHAR[] ;
BEGIN
	RETURN  NEXTVAL(i_ora_seq_nm) ;
EXCEPTION WHEN OTHERS THEN
	l_bind := fcpa_err$msg_binder(SQLSTATE, i_ora_seq_nm) ;
	CALL fcpa_err$raise_app_err('MAUCD0015', l_bind) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_del_num_ptn (
	IN i_co_cd VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	MAM_NUM_PTN_ALL、MAM_NUM_PTN_LCL_ALLから引数の会社ＣＤに対応するデータを削除する。
<REMARKS>
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**************************************************************************/
BEGIN
	DELETE FROM mam_num_ptn_all m WHERE m.co_cd = i_co_cd ;
	DELETE FROM mam_num_ptn_lcl_all m WHERE m.co_cd = i_co_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_init_num_ptn (
	IN i_co_cd VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	MAM_NUM_PTN_ALL、MAM_NUM_PTN_LCL_ALLに引数の会社ＣＤの初期データを作成する。
<REMARKS>
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**************************************************************************/
BEGIN
	CALL mapa_num$p_del_num_ptn(i_co_cd) ;

	INSERT INTO mam_num_ptn_all (
		co_cd, 
		num_biz_typ, num_ptn_cd, num_ptn_nm, 
		elm_typ1, elm_typ2, elm_typ3, elm_typ4, elm_typ5, 
		elm_typ6, elm_typ7, elm_typ8, elm_typ9, elm_typ10, 
		elm_dgt1, elm_dgt2, elm_dgt3, elm_dgt4, elm_dgt5, 
		elm_dgt6, elm_dgt7, elm_dgt8, elm_dgt9, elm_dgt10, 
		fix1, fix2, fix3, fix4, fix5, 
		fix6, fix7, fix8, fix9, fix10, 
		undisp_flg1, undisp_flg2, undisp_flg3, undisp_flg4, undisp_flg5, 
		undisp_flg6, undisp_flg7, undisp_flg8, undisp_flg9, undisp_flg10, 
		num_pad_str1, num_pad_str2, num_pad_str3, num_pad_str4, num_pad_str5, 
		num_pad_str6, num_pad_str7, num_pad_str8, num_pad_str9, num_pad_str10, 
		key_dgt, def_seq_typ, 
		memo1, memo2, memo3
		)
	SELECT	i_co_cd, 
		m.num_biz_typ, m.num_ptn_cd, m.num_ptn_nm, 
		m.elm_typ1, m.elm_typ2, m.elm_typ3, m.elm_typ4, m.elm_typ5, 
		m.elm_typ6, m.elm_typ7, m.elm_typ8, m.elm_typ9, m.elm_typ10, 
		m.elm_dgt1, m.elm_dgt2, m.elm_dgt3, m.elm_dgt4, m.elm_dgt5, 
		m.elm_dgt6, m.elm_dgt7, m.elm_dgt8, m.elm_dgt9, m.elm_dgt10, 
		m.fix1, m.fix2, m.fix3, m.fix4, m.fix5, 
		m.fix6, m.fix7, m.fix8, m.fix9, m.fix10, 
		m.undisp_flg1, m.undisp_flg2, m.undisp_flg3, m.undisp_flg4, m.undisp_flg5, 
		m.undisp_flg6, m.undisp_flg7, m.undisp_flg8, m.undisp_flg9, m.undisp_flg10, 
		m.num_pad_str1, m.num_pad_str2, m.num_pad_str3, m.num_pad_str4, m.num_pad_str5, 
		m.num_pad_str6, m.num_pad_str7, m.num_pad_str8, m.num_pad_str9, m.num_pad_str10, 
		m.key_dgt, m.def_seq_typ, 
		m.memo1, m.memo2, m.memo3
	FROM	mam_num_ptn_def m
	WHERE	0=0
	AND	m.del_flg = '0'
	;

	INSERT INTO mam_num_ptn_lcl_all (
		co_cd, lcl_cd, 
		num_biz_typ, num_ptn_cd, num_ptn_nm, 
		memo1, memo2, memo3
		)
	SELECT	i_co_cd, m.lcl_cd, 
		m.num_biz_typ, m.num_ptn_cd, m.num_ptn_nm, 
		m.memo1, m.memo2, m.memo3
	FROM	mam_num_ptn_lcl_def m
	WHERE	0=0
	AND	m.del_flg = '0'
	AND	NOT EXISTS (
			SELECT 'X'
			FROM	mam_num_ptn_lcl_all x
			WHERE	0=0
			AND	x.num_biz_typ = m.num_biz_typ
			AND	x.num_ptn_cd = m.num_ptn_cd
			AND	x.lcl_cd = m.lcl_cd
			AND	x.co_cd = i_co_cd
			)
	;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_num$p_ins_num_ptn (
	IN i_co_cd VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MAM_NUM_PTN_ALL、MAM_NUM_PTN_LCL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
<REMARKS>
<ARGUMENTS>
<ITEM>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	INSERT INTO mam_num_ptn_all (
		co_cd, 
		num_biz_typ, num_ptn_cd, num_ptn_nm, 
		elm_typ1, elm_typ2, elm_typ3, elm_typ4, elm_typ5, 
		elm_typ6, elm_typ7, elm_typ8, elm_typ9, elm_typ10, 
		elm_dgt1, elm_dgt2, elm_dgt3, elm_dgt4, elm_dgt5, 
		elm_dgt6, elm_dgt7, elm_dgt8, elm_dgt9, elm_dgt10, 
		fix1, fix2, fix3, fix4, fix5, 
		fix6, fix7, fix8, fix9, fix10, 
		undisp_flg1, undisp_flg2, undisp_flg3, undisp_flg4, undisp_flg5, 
		undisp_flg6, undisp_flg7, undisp_flg8, undisp_flg9, undisp_flg10, 
		num_pad_str1, num_pad_str2, num_pad_str3, num_pad_str4, num_pad_str5, 
		num_pad_str6, num_pad_str7, num_pad_str8, num_pad_str9, num_pad_str10, 
		key_dgt, def_seq_typ, 
		memo1, memo2, memo3
		)
	SELECT	i_co_cd, 
		m.num_biz_typ, m.num_ptn_cd, m.num_ptn_nm, 
		m.elm_typ1, m.elm_typ2, m.elm_typ3, m.elm_typ4, m.elm_typ5, 
		m.elm_typ6, m.elm_typ7, m.elm_typ8, m.elm_typ9, m.elm_typ10, 
		m.elm_dgt1, m.elm_dgt2, m.elm_dgt3, m.elm_dgt4, m.elm_dgt5, 
		m.elm_dgt6, m.elm_dgt7, m.elm_dgt8, m.elm_dgt9, m.elm_dgt10, 
		m.fix1, m.fix2, m.fix3, m.fix4, m.fix5, 
		m.fix6, m.fix7, m.fix8, m.fix9, m.fix10, 
		m.undisp_flg1, m.undisp_flg2, m.undisp_flg3, m.undisp_flg4, m.undisp_flg5, 
		m.undisp_flg6, m.undisp_flg7, m.undisp_flg8, m.undisp_flg9, m.undisp_flg10, 
		m.num_pad_str1, m.num_pad_str2, m.num_pad_str3, m.num_pad_str4, m.num_pad_str5, 
		m.num_pad_str6, m.num_pad_str7, m.num_pad_str8, m.num_pad_str9, m.num_pad_str10, 
		m.key_dgt, m.def_seq_typ, 
		m.memo1, m.memo2, m.memo3
	FROM	mam_num_ptn_def m
	WHERE	0=0
	AND	m.del_flg = '0'
	AND NOT EXISTS (
			SELECT 'X'
			FROM	mam_num_ptn_all x
			WHERE	0=0
			AND	x.num_biz_typ = m.num_biz_typ
			AND	x.num_ptn_cd = m.num_ptn_cd
			AND	x.co_cd = i_co_cd
		)
	;

	INSERT INTO mam_num_ptn_lcl_all (
		co_cd, lcl_cd, 
		num_biz_typ, num_ptn_cd, num_ptn_nm, 
		memo1, memo2, memo3
		)
	SELECT	i_co_cd, m.lcl_cd, 
		m.num_biz_typ, m.num_ptn_cd, m.num_ptn_nm, 
		m.memo1, m.memo2, m.memo3
	FROM	mam_num_ptn_lcl_def m
	WHERE	0=0
	AND	m.del_flg = '0'
	AND	NOT EXISTS (
			SELECT 'X'
			FROM	mam_num_ptn_lcl_all x
			WHERE	0=0
			AND	x.num_biz_typ = m.num_biz_typ
			AND	x.num_ptn_cd = m.num_ptn_cd
			AND	x.lcl_cd = m.lcl_cd
			AND	x.co_cd = i_co_cd
		)
	;
END ;
$BODY$
LANGUAGE plpgsql
;

