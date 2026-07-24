CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_start_log (
	IN i_msgid VARCHAR,
	IN i_msg_binder VARCHAR[]
)
AS
$BODY$
-- ==============================================================================
-- 開始ログ出力
-- ==============================================================================
DECLARE
	w_log_no VARCHAR(15) ;
	w_log_sub_key1 NUMERIC(9) ;
	w_log_sub_key2 NUMERIC(9) ;
BEGIN
	CALL fcpa_batch_log$p_log(
		fcpa_const$get_const_val('FSC_BATCH_LOG_TYP','START_LOG'),
		i_msgid,
		i_msg_binder,
		w_log_no,
		w_log_sub_key1,
		w_log_sub_key2
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_start_log (
	IN i_msgid VARCHAR,
	IN i_01 VARCHAR DEFAULT NULL,
	IN i_02 VARCHAR DEFAULT NULL,
	IN i_03 VARCHAR DEFAULT NULL,
	IN i_04 VARCHAR DEFAULT NULL,
	IN i_05 VARCHAR DEFAULT NULL,
	IN i_06 VARCHAR DEFAULT NULL,
	IN i_07 VARCHAR DEFAULT NULL,
	IN i_08 VARCHAR DEFAULT NULL,
	IN i_09 VARCHAR DEFAULT NULL,
	IN i_10 VARCHAR DEFAULT NULL,
	IN i_11 VARCHAR DEFAULT NULL,
	IN i_12 VARCHAR DEFAULT NULL,
	IN i_13 VARCHAR DEFAULT NULL,
	IN i_14 VARCHAR DEFAULT NULL,
	IN i_15 VARCHAR DEFAULT NULL,
	IN i_16 VARCHAR DEFAULT NULL,
	IN i_17 VARCHAR DEFAULT NULL,
	IN i_18 VARCHAR DEFAULT NULL,
	IN i_19 VARCHAR DEFAULT NULL,
	IN i_20 VARCHAR DEFAULT NULL,
	IN i_21 VARCHAR DEFAULT NULL,
	IN i_22 VARCHAR DEFAULT NULL,
	IN i_23 VARCHAR DEFAULT NULL,
	IN i_24 VARCHAR DEFAULT NULL,
	IN i_25 VARCHAR DEFAULT NULL,
	IN i_26 VARCHAR DEFAULT NULL,
	IN i_27 VARCHAR DEFAULT NULL,
	IN i_28 VARCHAR DEFAULT NULL,
	IN i_29 VARCHAR DEFAULT NULL,
	IN i_30 VARCHAR DEFAULT NULL,
	IN i_31 VARCHAR DEFAULT NULL,
	IN i_32 VARCHAR DEFAULT NULL,
	IN i_33 VARCHAR DEFAULT NULL,
	IN i_34 VARCHAR DEFAULT NULL,
	IN i_35 VARCHAR DEFAULT NULL,
	IN i_36 VARCHAR DEFAULT NULL,
	IN i_37 VARCHAR DEFAULT NULL,
	IN i_38 VARCHAR DEFAULT NULL,
	IN i_39 VARCHAR DEFAULT NULL,
	IN i_40 VARCHAR DEFAULT NULL
)
AS
$BODY$
-- ==============================================================================
-- 開始ログ出力
-- ==============================================================================
BEGIN
	CALL fcpa_batch_log$p_start_log(
		i_msgid,
		fcpa_msg$msg_binder(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40)
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_proc_log (
	IN i_msgid VARCHAR,
	IN i_msg_binder VARCHAR[]
)
AS
$BODY$
-- ==============================================================================
-- 処理経過ログ出力
-- ==============================================================================
DECLARE
	w_log_no VARCHAR(15) ;
	w_log_sub_key1 NUMERIC(9) ;
	w_log_sub_key2 NUMERIC(9) ;
BEGIN
	CALL fcpa_batch_log$p_log(
		fcpa_const$get_const_val('FSC_BATCH_LOG_TYP','PROC_LOG'),
		i_msgid,
		i_msg_binder,
		w_log_no,
		w_log_sub_key1,
		w_log_sub_key2
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_proc_log (
	IN i_msgid VARCHAR,
	IN i_01 VARCHAR DEFAULT NULL,
	IN i_02 VARCHAR DEFAULT NULL,
	IN i_03 VARCHAR DEFAULT NULL,
	IN i_04 VARCHAR DEFAULT NULL,
	IN i_05 VARCHAR DEFAULT NULL,
	IN i_06 VARCHAR DEFAULT NULL,
	IN i_07 VARCHAR DEFAULT NULL,
	IN i_08 VARCHAR DEFAULT NULL,
	IN i_09 VARCHAR DEFAULT NULL,
	IN i_10 VARCHAR DEFAULT NULL,
	IN i_11 VARCHAR DEFAULT NULL,
	IN i_12 VARCHAR DEFAULT NULL,
	IN i_13 VARCHAR DEFAULT NULL,
	IN i_14 VARCHAR DEFAULT NULL,
	IN i_15 VARCHAR DEFAULT NULL,
	IN i_16 VARCHAR DEFAULT NULL,
	IN i_17 VARCHAR DEFAULT NULL,
	IN i_18 VARCHAR DEFAULT NULL,
	IN i_19 VARCHAR DEFAULT NULL,
	IN i_20 VARCHAR DEFAULT NULL,
	IN i_21 VARCHAR DEFAULT NULL,
	IN i_22 VARCHAR DEFAULT NULL,
	IN i_23 VARCHAR DEFAULT NULL,
	IN i_24 VARCHAR DEFAULT NULL,
	IN i_25 VARCHAR DEFAULT NULL,
	IN i_26 VARCHAR DEFAULT NULL,
	IN i_27 VARCHAR DEFAULT NULL,
	IN i_28 VARCHAR DEFAULT NULL,
	IN i_29 VARCHAR DEFAULT NULL,
	IN i_30 VARCHAR DEFAULT NULL,
	IN i_31 VARCHAR DEFAULT NULL,
	IN i_32 VARCHAR DEFAULT NULL,
	IN i_33 VARCHAR DEFAULT NULL,
	IN i_34 VARCHAR DEFAULT NULL,
	IN i_35 VARCHAR DEFAULT NULL,
	IN i_36 VARCHAR DEFAULT NULL,
	IN i_37 VARCHAR DEFAULT NULL,
	IN i_38 VARCHAR DEFAULT NULL,
	IN i_39 VARCHAR DEFAULT NULL,
	IN i_40 VARCHAR DEFAULT NULL
)
AS
$BODY$
-- ==============================================================================
-- 処理経過ログ出力
-- ==============================================================================
BEGIN
	CALL fcpa_batch_log$p_proc_log(
		i_msgid,
		fcpa_msg$msg_binder(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40)
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_data_log (
	IN i_msgid VARCHAR,
	IN i_msg_binder VARCHAR[],
	INOUT o_log_no VARCHAR,
	INOUT o_log_sub_key1 NUMERIC,
	INOUT o_log_sub_key2 NUMERIC
)
AS
$BODY$
-- ==============================================================================
-- データログ出力
-- ==============================================================================
BEGIN
	CALL fcpa_batch_log$p_log(
		fcpa_const$get_const_val('FSC_BATCH_LOG_TYP','DATA_LOG'),
		i_msgid,
		i_msg_binder,
		o_log_no,
		o_log_sub_key1,
		o_log_sub_key2
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_data_log (
	IN i_msgid VARCHAR,
	INOUT o_log_no VARCHAR,
	INOUT o_log_sub_key1 NUMERIC,
	INOUT o_log_sub_key2 NUMERIC,
	IN i_01 VARCHAR DEFAULT NULL,
	IN i_02 VARCHAR DEFAULT NULL,
	IN i_03 VARCHAR DEFAULT NULL,
	IN i_04 VARCHAR DEFAULT NULL,
	IN i_05 VARCHAR DEFAULT NULL,
	IN i_06 VARCHAR DEFAULT NULL,
	IN i_07 VARCHAR DEFAULT NULL,
	IN i_08 VARCHAR DEFAULT NULL,
	IN i_09 VARCHAR DEFAULT NULL,
	IN i_10 VARCHAR DEFAULT NULL,
	IN i_11 VARCHAR DEFAULT NULL,
	IN i_12 VARCHAR DEFAULT NULL,
	IN i_13 VARCHAR DEFAULT NULL,
	IN i_14 VARCHAR DEFAULT NULL,
	IN i_15 VARCHAR DEFAULT NULL,
	IN i_16 VARCHAR DEFAULT NULL,
	IN i_17 VARCHAR DEFAULT NULL,
	IN i_18 VARCHAR DEFAULT NULL,
	IN i_19 VARCHAR DEFAULT NULL,
	IN i_20 VARCHAR DEFAULT NULL,
	IN i_21 VARCHAR DEFAULT NULL,
	IN i_22 VARCHAR DEFAULT NULL,
	IN i_23 VARCHAR DEFAULT NULL,
	IN i_24 VARCHAR DEFAULT NULL,
	IN i_25 VARCHAR DEFAULT NULL,
	IN i_26 VARCHAR DEFAULT NULL,
	IN i_27 VARCHAR DEFAULT NULL,
	IN i_28 VARCHAR DEFAULT NULL,
	IN i_29 VARCHAR DEFAULT NULL,
	IN i_30 VARCHAR DEFAULT NULL,
	IN i_31 VARCHAR DEFAULT NULL,
	IN i_32 VARCHAR DEFAULT NULL,
	IN i_33 VARCHAR DEFAULT NULL,
	IN i_34 VARCHAR DEFAULT NULL,
	IN i_35 VARCHAR DEFAULT NULL,
	IN i_36 VARCHAR DEFAULT NULL,
	IN i_37 VARCHAR DEFAULT NULL,
	IN i_38 VARCHAR DEFAULT NULL,
	IN i_39 VARCHAR DEFAULT NULL,
	IN i_40 VARCHAR DEFAULT NULL
)
AS
$BODY$
-- ==============================================================================
-- データログ出力
-- ==============================================================================
BEGIN
	CALL fcpa_batch_log$p_data_log(
		i_msgid,
		fcpa_msg$msg_binder(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40),
		o_log_no,
		o_log_sub_key1,
		o_log_sub_key2
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_end_log (
	IN i_msgid VARCHAR,
	IN i_msg_binder VARCHAR[]
)
AS
$BODY$
-- ==============================================================================
-- 終了ログ出力
-- ==============================================================================
DECLARE
	w_log_no VARCHAR(15) ;
	w_log_sub_key1 NUMERIC(9) ;
	w_log_sub_key2 NUMERIC(9) ;
BEGIN
	CALL fcpa_batch_log$p_log(
		fcpa_const$get_const_val('FSC_BATCH_LOG_TYP','END_LOG'),
		i_msgid,
		i_msg_binder,
		w_log_no,
		w_log_sub_key1,
		w_log_sub_key2
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_end_log (
	IN i_msgid VARCHAR,
	IN i_01 VARCHAR DEFAULT NULL,
	IN i_02 VARCHAR DEFAULT NULL,
	IN i_03 VARCHAR DEFAULT NULL,
	IN i_04 VARCHAR DEFAULT NULL,
	IN i_05 VARCHAR DEFAULT NULL,
	IN i_06 VARCHAR DEFAULT NULL,
	IN i_07 VARCHAR DEFAULT NULL,
	IN i_08 VARCHAR DEFAULT NULL,
	IN i_09 VARCHAR DEFAULT NULL,
	IN i_10 VARCHAR DEFAULT NULL,
	IN i_11 VARCHAR DEFAULT NULL,
	IN i_12 VARCHAR DEFAULT NULL,
	IN i_13 VARCHAR DEFAULT NULL,
	IN i_14 VARCHAR DEFAULT NULL,
	IN i_15 VARCHAR DEFAULT NULL,
	IN i_16 VARCHAR DEFAULT NULL,
	IN i_17 VARCHAR DEFAULT NULL,
	IN i_18 VARCHAR DEFAULT NULL,
	IN i_19 VARCHAR DEFAULT NULL,
	IN i_20 VARCHAR DEFAULT NULL,
	IN i_21 VARCHAR DEFAULT NULL,
	IN i_22 VARCHAR DEFAULT NULL,
	IN i_23 VARCHAR DEFAULT NULL,
	IN i_24 VARCHAR DEFAULT NULL,
	IN i_25 VARCHAR DEFAULT NULL,
	IN i_26 VARCHAR DEFAULT NULL,
	IN i_27 VARCHAR DEFAULT NULL,
	IN i_28 VARCHAR DEFAULT NULL,
	IN i_29 VARCHAR DEFAULT NULL,
	IN i_30 VARCHAR DEFAULT NULL,
	IN i_31 VARCHAR DEFAULT NULL,
	IN i_32 VARCHAR DEFAULT NULL,
	IN i_33 VARCHAR DEFAULT NULL,
	IN i_34 VARCHAR DEFAULT NULL,
	IN i_35 VARCHAR DEFAULT NULL,
	IN i_36 VARCHAR DEFAULT NULL,
	IN i_37 VARCHAR DEFAULT NULL,
	IN i_38 VARCHAR DEFAULT NULL,
	IN i_39 VARCHAR DEFAULT NULL,
	IN i_40 VARCHAR DEFAULT NULL
)
AS
$BODY$
-- ==============================================================================
-- 終了ログ出力
-- ==============================================================================
BEGIN
	CALL fcpa_batch_log$p_end_log(
		i_msgid,
		fcpa_msg$msg_binder(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40)
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_init (
	IN i_procedure_name VARCHAR DEFAULT NULL
)
AS
$BODY$
-- ==============================================================================
-- 初期処理
-- ==============================================================================
BEGIN
	-- 引継ぎ情報の取得・ログNoの採番
	IF COALESCE(fcpa_postgres_util$get_var('fcpa_batch_log', 'v_inherit_flg')::NUMERIC(1), 0) = 0 THEN
		PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_log_no', fcpa_batch_log$f_make_log_no()) ;
		PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_log_sub_key1', 9999998) ;
		PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_log_sub_key2', 0) ;
		PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_data_ref_ctl', NULL::VARCHAR(50)) ;
		CALL fcpa_batch_log$p_write_log_header(i_procedure_name) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_batch_log$f_make_log_no ()
RETURNS VARCHAR
AS
$BODY$
-- ==============================================================================
-- ログNo生成
-- ==============================================================================
DECLARE
	w_logno VARCHAR(15) ;
BEGIN
	w_logno := TO_CHAR(NEXTVAL('fcs_batch_logno'), 'FM000000000000000') ;

	RETURN w_logno ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_batch_log$f_get_log_no ()
RETURNS VARCHAR
AS
$BODY$
-- ==============================================================================
-- ログNoを取得する
-- ==============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_batch_log', 'v_log_no')::VARCHAR(15) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_inherit (
	IN i_log_no VARCHAR,
	IN i_log_sub_key1 NUMERIC,
	IN i_log_sub_key2 NUMERIC,
	IN i_data_ref_ctl VARCHAR
)
AS
$BODY$
-- ==============================================================================
-- 引継ぎ情報作成
-- 予めJavaから実行することでJavaからログNoの情報を引き継ぐ。
-- ==============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_log_no', i_log_no) ;
	PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_log_sub_key1', i_log_sub_key1) ;
	PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_log_sub_key2', i_log_sub_key2) ;
	PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_data_ref_ctl', i_data_ref_ctl) ;
	PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_inherit_flg', 1) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_release_inherit ()
AS
$BODY$
-- ==============================================================================
-- 引継ぎ情報解除
-- ==============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_inherit_flg', 0) ;
	PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_log_no', NULL::VARCHAR(15)) ;
	PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_data_ref_ctl', NULL::VARCHAR(50)) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_log (
	IN i_batch_log_typ VARCHAR,
	IN i_msgid VARCHAR,
	IN i_msg_binder VARCHAR[],
	INOUT o_log_no VARCHAR,
	INOUT o_log_sub_key1 NUMERIC,
	INOUT o_log_sub_key2 NUMERIC
)
AS
$BODY$
-- ==============================================================================
-- ログを書き込む
-- ==============================================================================
DECLARE
	w_log_lvl VARCHAR(1) ;
BEGIN
	w_log_lvl := fcpa_msg$f_get_message_level(i_msgid) ;
	IF fcpa_batch_log$f_is_available(w_log_lvl) = 0 THEN
		RETURN ;
	END IF ;

	IF fsc_batch_log_typ$contains(i_batch_log_typ) = '0' THEN
		RETURN ;
	END IF ;

	CALL fcpa_batch_log$p_write_log_msg(
		i_batch_log_typ,
		i_msgid,
		w_log_lvl,
		i_msg_binder,
		o_log_no,
		o_log_sub_key1,
		o_log_sub_key2
	) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_batch_log$f_is_available (
	IN i_msg_lvl VARCHAR
) RETURNS NUMERIC
AS
$BODY$
-- ==============================================================================
-- ログレベルが出力対象であるか判定する
-- 戻り値
-- 1：出力対象である。0:出力対象ではない。
-- ==============================================================================
DECLARE
	w_log_lvl_s VARCHAR(1) ;
	w_log_lvl NUMERIC(1) ;
	w_msg_lvl NUMERIC(1) ;
	w_ret NUMERIC(1) ;
BEGIN
	-- 有効ログレベルの取得（システム設定）
	w_log_lvl_s := fcpa_const$f_getstrval_cache('LOG', 'LVL', 'D') ;
	w_log_lvl := fcpa_batch_log$f_lvl_to_no(w_log_lvl_s) ;

	w_msg_lvl := fcpa_batch_log$f_lvl_to_no(i_msg_lvl) ;
	IF w_log_lvl > w_msg_lvl THEN
		w_ret := 0 ;
	ELSE
		w_ret := 1 ;
	END IF ;

	RETURN w_ret ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_batch_log$f_lvl_to_no (
	IN i_msg_lvl VARCHAR
) RETURNS NUMERIC
AS
$BODY$
-- ==============================================================================
-- メッセージのレベルを数値にします。
-- ==============================================================================
BEGIN
	RETURN TRANSLATE(i_msg_lvl, 'TDIWPEF', '1234567') ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_write_log_header (
	IN i_procedure_name VARCHAR
)
AS
$BODY$
-- ==============================================================================
-- ログヘッダをテーブルに書き込む
-- ORACLE:PRAGMA AUTONOMOUS_TRANSACTION
-- ==============================================================================
DECLARE
	w_sql	VARCHAR ;
BEGIN
	w_sql := format('
		INSERT INTO fct_batch_log_h_all (
			batch_log_no,
			co_cd,
			req_no,
			data_ref_ctl,
			start_ts,
			last_ts,
			login_seq,
			emsg_seq,
			ext_attr1,
			ext_attr2,
			ext_attr3,
			usr_cd,
			gp_batch_grp_cd,
			call_module_id,
			call_logic_id,
			call_operation_id,
			call_pg_id,
			call_clt_id,
			call_plsql_id,
			lcl_cd,
			end_flg,
			warn_flg,
			rmrks1,
			rmrks2,
			rmrks3,
			rmrks4,
			rmrks5,
			rmrks6,
			rmrks7,
			rmrks8,
			rmrks9,
			rmrks10
			)
		VALUES (
			%L, --1 batch_log_no
			fcpa_context$f_get_co_cd(),
			fcpa_context$f_get_processid(),
			%L, --2 data_ref_ctl
			fcpa_date_util$f_mcsystimestamp_co(fcpa_context$f_get_co_cd()),
			fcpa_date_util$f_mcsystimestamp_co(fcpa_context$f_get_co_cd()),
			fcpa_context$f_get_login_seq(),
			0, -- ヘッダ作成時の終了ログ連番はデフォルト値で登録しておく
			fcpa_context$f_get_ext_attr1(),
			fcpa_context$f_get_ext_attr2(),
			fcpa_context$f_get_ext_attr3(),
			fcpa_context$f_get_userid(),
			fcpa_context$f_get_gp_batch_grp_cd(),
			NULL, -- モジュールIDもCONTEXTに持たせてよかろう。。。
			NULL, -- Javaから引き継がないということはロジックIDは未設定になる。
			NULL, -- Javaから引き継がないということはオペレーションIDは未設定になる。
			NULL, -- Javaから引き継がないということは呼出元プログラムＩＤは未設定になる。
			NULL, -- Javaから引き継がないということは呼出元クライアントは未設定になる。
			%L, --3 call_plsql_id
			fcpa_context$f_get_locale(),
			0,
			0,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL
		)
		',
		fcpa_postgres_util$get_var('fcpa_batch_log', 'v_log_no')::VARCHAR(15), --1 batch_log_no
		fcpa_postgres_util$get_var('fcpa_batch_log', 'v_data_ref_ctl')::VARCHAR(50), --2 data_ref_ctl
		i_procedure_name --3 call_plsql_id
		)
		;

	CALL fcpa_postgres_util$exec_autonomous_sql(w_sql) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_write_log_msg (
	IN i_batch_log_typ VARCHAR,
	IN i_msgid VARCHAR,
	IN i_msglvl VARCHAR,
	IN i_msg_binder VARCHAR[],
	INOUT o_log_no VARCHAR,
	INOUT o_log_sub_key1 NUMERIC,
	INOUT o_log_sub_key2 NUMERIC
)
AS
$BODY$
-- ==============================================================================
-- ログメッセージをテーブルに書き込む
-- ORACLE:PRAGMA AUTONOMOUS_TRANSACTION
-- ==============================================================================
DECLARE
	w_msg 	VARCHAR(1000) ;
	w_msg_binder VARCHAR[] ;
	w_seq	NUMERIC(22) ;

	w_sql	VARCHAR ;
BEGIN
	-- 変数初期化
	o_log_no := fcpa_postgres_util$get_var('fcpa_batch_log', 'v_log_no')::VARCHAR(15) ;
	CALL fcpa_batch_log$p_numbering_log_sub_key1(i_batch_log_typ, o_log_sub_key1) ;
	CALL fcpa_batch_log$p_numbering_log_sub_key2(i_batch_log_typ, o_log_sub_key2) ;
	w_seq := NEXTVAL('fcs_batch_logseq') ;

	-- ログヘッダの更新
	PERFORM fcpa_postgres_util$set_var_link('fcpa_batch_log', 'v_log_no', o_log_no) ;
	w_sql := format('CALL fcpa_batch_log$p_update_log_header(%L, %L, %L)', i_batch_log_typ, i_msglvl, w_seq) ;
	CALL fcpa_postgres_util$exec_autonomous_sql(w_sql) ;

	-- メッセージ文言
	CALL fcpa_msg$p_inlay(i_msgid, i_msg_binder, w_msg) ;

	-- メッセージ埋め込み文字列の初期化
	w_msg_binder := fcpa_msg$msg_binder(
		NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
		NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
		NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
		NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL
	) ;
	FOR i IN 1..COALESCE(ARRAY_LENGTH(i_msg_binder, 1), 0) LOOP
		w_msg_binder[i] := i_msg_binder[i] ;
	END LOOP ;

	-- ログ出力
	w_sql := format('
		INSERT INTO fct_batch_log_msg_all(
			batch_log_no,
			seq,
			co_cd,
			log_sub_key1,
			log_sub_key2,
			batch_log_typ,
			msg_id,
			msg_lvl,
			msg_txt,
			log_ts,
			prm01,
			prm02,
			prm03,
			prm04,
			prm05,
			prm06,
			prm07,
			prm08,
			prm09,
			prm10,
			prm11,
			prm12,
			prm13,
			prm14,
			prm15,
			prm16,
			prm17,
			prm18,
			prm19,
			prm20,
			prm21,
			prm22,
			prm23,
			prm24,
			prm25,
			prm26,
			prm27,
			prm28,
			prm29,
			prm30,
			prm31,
			prm32,
			prm33,
			prm34,
			prm35,
			prm36,
			prm37,
			prm38,
			prm39,
			prm40
			)
		VALUES (
			%L, --1 o_log_no
			%L, --2 seq
			fcpa_context$f_get_co_cd(),
			%L, --3 log_sub_key1 o_log_sub_key1,
			%L, --4 log_sub_key2 o_log_sub_key2,
			%L, --5 batch_log_typ,
			%L, --6 msg_id,
			%L, --7 msg_lvl,
			%L, --8 msg_txt,
			fcpa_date_util$f_mcsystimestamp_co(fcpa_context$f_get_co_cd()),
			%L, -- prm01
			%L, -- prm02
			%L, -- prm03
			%L, -- prm04
			%L, -- prm05
			%L, -- prm06
			%L, -- prm07
			%L, -- prm08
			%L, -- prm09
			%L, -- prm10
			%L, -- prm11
			%L, -- prm12
			%L, -- prm13
			%L, -- prm14
			%L, -- prm15
			%L, -- prm16
			%L, -- prm17
			%L, -- prm18
			%L, -- prm19
			%L, -- prm20
			%L, -- prm21
			%L, -- prm22
			%L, -- prm23
			%L, -- prm24
			%L, -- prm25
			%L, -- prm26
			%L, -- prm27
			%L, -- prm28
			%L, -- prm29
			%L, -- prm30
			%L, -- prm31
			%L, -- prm32
			%L, -- prm33
			%L, -- prm34
			%L, -- prm35
			%L, -- prm36
			%L, -- prm37
			%L, -- prm38
			%L, -- prm39
			%L  -- prm40
		)
		',
		o_log_no,	--1 o_log_no
		w_seq,		--2 seq
		o_log_sub_key1, --3 log_sub_key1 o_log_sub_key1,
		o_log_sub_key2, --4 log_sub_key2 o_log_sub_key2,
		i_batch_log_typ,--5 batch_log_typ,
		i_msgid,	--6 msg_id,
		i_msglvl,	--7 msg_lvl,
		w_msg,		--8 msg_txt,
		w_msg_binder[1],
		w_msg_binder[2],
		w_msg_binder[3],
		w_msg_binder[4],
		w_msg_binder[5],
		w_msg_binder[6],
		w_msg_binder[7],
		w_msg_binder[8],
		w_msg_binder[9],
		w_msg_binder[10],
		w_msg_binder[11],
		w_msg_binder[12],
		w_msg_binder[13],
		w_msg_binder[14],
		w_msg_binder[15],
		w_msg_binder[16],
		w_msg_binder[17],
		w_msg_binder[18],
		w_msg_binder[19],
		w_msg_binder[20],
		w_msg_binder[21],
		w_msg_binder[22],
		w_msg_binder[23],
		w_msg_binder[24],
		w_msg_binder[25],
		w_msg_binder[26],
		w_msg_binder[27],
		w_msg_binder[28],
		w_msg_binder[29],
		w_msg_binder[30],
		w_msg_binder[31],
		w_msg_binder[32],
		w_msg_binder[33],
		w_msg_binder[34],
		w_msg_binder[35],
		w_msg_binder[36],
		w_msg_binder[37],
		w_msg_binder[38],
		w_msg_binder[39],
		w_msg_binder[40]
		)
		;

	CALL fcpa_postgres_util$exec_autonomous_sql(w_sql) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_numbering_log_sub_key1 (
	IN i_batch_log_typ VARCHAR,
	INOUT o_log_sub_key1 NUMERIC
)
AS
$BODY$
-- ==============================================================================
-- ログサブキー1を採番する
-- ==============================================================================
BEGIN
	IF i_batch_log_typ = fcpa_const$get_const_val('FSC_BATCH_LOG_TYP','DATA_LOG') THEN
		o_log_sub_key1 := fcpa_postgres_util$get_var('fcpa_batch_log', 'v_log_sub_key1')::NUMERIC(9) ;
	ELSE
		o_log_sub_key1 := -100 ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_numbering_log_sub_key2 (
	IN i_batch_log_typ text,
	INOUT o_log_sub_key2 NUMERIC
)
AS
$BODY$
-- ==============================================================================
-- ログサブキー2を採番する
-- ==============================================================================
BEGIN
	IF i_batch_log_typ = fcpa_const$get_const_val('FSC_BATCH_LOG_TYP','DATA_LOG') THEN
		o_log_sub_key2 := COALESCE(fcpa_postgres_util$get_var('fcpa_batch_log', 'v_log_sub_key2')::NUMERIC(9), 0) + 1 ;
		PERFORM fcpa_postgres_util$set_var('fcpa_batch_log', 'v_log_sub_key2', o_log_sub_key2) ;
	ELSE
		o_log_sub_key2 := -100 ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_batch_log$p_update_log_header (
	IN i_batch_log_typ VARCHAR,
	IN i_msglvl VARCHAR,
	IN i_log_seq NUMERIC
)
AS
$BODY$
-- ==============================================================================
-- ログ出力時にログヘッダを更新する
-- ==============================================================================
DECLARE
	w_log_no VARCHAR(15) ;
BEGIN
	w_log_no := fcpa_postgres_util$get_var('fcpa_batch_log', 'v_log_no')::VARCHAR(15) ;

	IF i_batch_log_typ = fcpa_const$get_const_val('FSC_BATCH_LOG_TYP','END_LOG') THEN
		UPDATE
			fct_batch_log_h_all
		SET
			emsg_seq = i_log_seq,
			end_flg = '1'
		WHERE
			batch_log_no = w_log_no AND
			co_cd = fcpa_context$f_get_co_cd()
		;
	END IF ;

	IF fcpa_batch_log$f_is_warn_msglvl(i_msglvl) = 1 THEN
		UPDATE
			fct_batch_log_h_all
		SET
			warn_flg = '1'
		WHERE
			batch_log_no = w_log_no AND
			co_cd = fcpa_context$f_get_co_cd()
		;
	END IF ;

	UPDATE
		fct_batch_log_h_all
	SET
		last_ts = fcpa_date_util$f_mcsystimestamp_co(fcpa_context$f_get_co_cd())
	WHERE
		batch_log_no = w_log_no AND
		co_cd = fcpa_context$f_get_co_cd()
	;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_batch_log$f_is_warn_msglvl (
	IN i_msglvl VARCHAR
) RETURNS NUMERIC
AS
$BODY$
-- ==============================================================================
-- ログレベルが警告以上であるか否か判定する
-- ==============================================================================
DECLARE
	w_ret NUMERIC := 0 ;
BEGIN
	IF fcpa_batch_log$f_lvl_to_no(i_msglvl) >= 4 THEN
		w_ret := 1 ;
	END IF ;

	RETURN w_ret ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_batch_log$f_numbering_logseq (
	IN i_cnt NUMERIC
)
RETURNS TABLE (
	seq NUMERIC(22)
)
AS
$BODY$
-- ==============================================================================
-- ログメッセージ連番を発番する
-- ==============================================================================
BEGIN
	FOR i IN 1..i_cnt LOOP
		seq := NEXTVAL('fcs_batch_logseq') ;
		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;
