\encoding UTF-8

CREATE OR REPLACE FUNCTION fcpa_postgres_util$is_proc_ini (
	IN i_proc_nm NAME
)
RETURNS BOOLEAN
AS
$BODY$
-- ===============================================================================
-- パッケージ変数の初期化処理が行われている場合はTRUE、行われていない場合はFALSE
-- ===============================================================================
BEGIN
	RETURN current_setting(format('%s.ini_check', i_proc_nm)) = '1' ;
EXCEPTION
	WHEN undefined_object THEN
		RETURN FALSE ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$set_proc_ini (
	IN i_proc_nm NAME
)
RETURNS void
AS
$BODY$
-- ===============================================================================
-- パッケージ変数の初期化処理が行わている場合は'1'を設定する
-- ===============================================================================
BEGIN
	PERFORM set_config(format('%s.ini_check', i_proc_nm), '1', FALSE) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$set_var (
	IN i_proc_nm NAME,
	IN i_var_nm NAME,
	IN i_var_val ANYELEMENT
)
RETURNS void
AS $BODY$
-- ===============================================================================
-- パッケージ変数の設定
-- VARCHARの型で設定する
-- ===============================================================================
BEGIN
	PERFORM set_config(format('%s.%s', i_proc_nm, i_var_nm), i_var_val::VARCHAR, FALSE) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_postgres_util$get_var (
	IN i_proc_nm NAME,
	IN i_var_nm NAME
)
RETURNS VARCHAR
AS $BODY$
-- ===============================================================================
-- パッケージ変数の取得
-- VARCHARの型で返す 空文字の場合はNULLを返す
-- キーが取得できない場合（エラーが発生する場合はNULLを返す）
-- ===============================================================================
BEGIN
	RETURN NULLIF(current_setting(format('%s.%s', i_proc_nm, i_var_nm)), '') ;
EXCEPTION
	WHEN OTHERS THEN
		RETURN NULL::VARCHAR ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_postgres_util$greatest (
	VARIADIC i_array ANYARRAY
)
RETURNS ANYELEMENT
AS
$BODY$
-- ===============================================================================
-- Oracle：greatest
-- ===============================================================================
DECLARE
	l_val	ALIAS FOR $0 ;
BEGIN
	SELECT	unnest(i_array)
	INTO STRICT l_val
	ORDER BY 1 DESC NULLS FIRST
	LIMIT 1
	;

	RETURN l_val ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_postgres_util$least (
	VARIADIC i_array ANYARRAY
)
RETURNS ANYELEMENT
AS
$BODY$
-- ===============================================================================
-- Oracle：least
-- ===============================================================================
DECLARE
	l_val	ALIAS FOR $0 ;
BEGIN
	SELECT	unnest(i_array)
	INTO STRICT l_val
	ORDER BY 1 ASC NULLS FIRST
	LIMIT 1
	;

	RETURN l_val ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$get_col_length (
	IN i_table_nm NAME,
	IN i_col_nm NAME
)
RETURNS INTEGER
AS $BODY$
-- ===============================================================================
-- 項目の桁数を返す（MAPA_METAで桁数を取得する場合と同じ意味）
-- 数値の場合は全体の桁数を返す（21,8の場合は21）
-- ===============================================================================
DECLARE
	l_length BIGINT ;
BEGIN
	SELECT	COALESCE(col.character_maximum_length, col.numeric_precision)
	INTO STRICT l_length
	FROM	information_schema.columns col
	WHERE	0=0
	AND	col.table_name ILIKE i_table_nm
	AND	col.column_name ILIKE i_col_nm
	LIMIT 1
	;

	RETURN l_length ;
EXCEPTION
	WHEN no_data_found THEN
		RETURN NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$systimestamp ()
RETURNS timestamp without time zone
AS $BODY$
-- ===============================================================================
-- Oracle：systimestamps
-- ===============================================================================
BEGIN
	RETURN clock_timestamp()::TIMESTAMP(3) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$sysdate ()
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS $BODY$
-- ===============================================================================
-- Oracle：sysdate
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$systimestamp()::TIMESTAMP(0) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$instr (
	IN i_str VARCHAR,
	IN i_substr VARCHAR,
	IN i_pos INTEGER DEFAULT 1,
	IN i_occur INTEGER DEFAULT 1
)
RETURNS INTEGER
AS $BODY$
-- ===============================================================================
-- Oracle：instr
-- ===============================================================================
DECLARE
	pos	INTEGER NOT NULL DEFAULT 0 ;
	occur	INTEGER NOT NULL DEFAULT 0 ;
	temp_str VARCHAR ;
	idx	INTEGER ;
	i	INTEGER ;
	len_str INTEGER ;
	len_substr INTEGER ;
BEGIN
	len_str := char_length(i_str) ;
	len_substr := char_length(i_substr) ;

	IF len_str = 0 OR len_str IS NULL OR len_substr = 0 OR len_substr IS NULL THEN
		RETURN NULL::integer ;
	END IF ;

	IF i_occur <= 0 OR i_pos = 0 THEN
		RETURN 0 ;
	END IF ;

	IF i_pos > 0 THEN
		idx := i_pos - 1 ;
		FOR i IN 1..i_occur LOOP
			temp_str := substring(i_str FROM idx + 1) ;
			pos := position(i_substr IN temp_str) ;
			IF pos = 0 THEN
				RETURN 0 ;
			END IF ;
			idx := idx + pos ;
		END LOOP ;

		RETURN idx ;
	ELSE -- i_pos < 0
		idx := len_str + 1 + i_pos ;
		WHILE idx > 0 LOOP
			temp_str := substring(i_str FROM idx FOR len_substr) ;
			IF i_substr = temp_str THEN
				occur := occur + 1 ;
				IF occur = i_occur THEN
					RETURN idx ;
				END IF ;
			END IF ;
			idx := idx - 1 ;
		END LOOP ;

		RETURN 0 ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql STRICT IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$substr (
	IN i_str	VARCHAR,
	IN i_pos	NUMERIC,
	IN i_len	NUMERIC
)
RETURNS VARCHAR
AS $BODY$
-- ===============================================================================
-- Oracle：substr (string, position, length)
-- ===============================================================================
BEGIN
	IF TRUNC(i_len)::INTEGER <= 0 OR ABS(TRUNC(i_pos)::INTEGER) > LENGTH(i_str) THEN
		RETURN NULL::VARCHAR ;
	END IF ;

	IF i_pos < 0 THEN
		RETURN NULLIF(SUBSTR(i_str, LENGTH(i_str) + TRUNC(i_pos)::INTEGER + 1, TRUNC(i_len)::INTEGER), '') ;
	END IF ;

	RETURN NULLIF(SUBSTR(i_str, CASE WHEN TRUNC(i_pos)::INTEGER = 0 THEN 1 ELSE TRUNC(i_pos)::INTEGER END, TRUNC(i_len)::INTEGER), '') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$substr (
	IN i_str	VARCHAR,
	IN i_pos	NUMERIC
)
RETURNS VARCHAR
AS $BODY$
-- ===============================================================================
-- Oracle：substr (string, position, LENGTH(string))
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$substr(i_str, i_pos, LENGTH(i_str)) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_postgres_util$last_day (
	IN i_dt	TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- Oracle：last_day
-- ===============================================================================
BEGIN
	RETURN MAKE_TIMESTAMP(
		EXTRACT('YEAR' FROM i_dt)::INTEGER,
		EXTRACT('MONTH' FROM i_dt)::INTEGER,
		EXTRACT('DAY' FROM (DATE_TRUNC('MONTH', i_dt) + '1 month'::INTERVAL - '1 day'::INTERVAL))::INTEGER,
		EXTRACT('HOUR' FROM i_dt)::INTEGER,
		EXTRACT('MIN' FROM i_dt)::INTEGER,
		EXTRACT('SEC' FROM i_dt)
	) ;
END ;
$BODY$
LANGUAGE plpgsql STRICT IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_postgres_util$add_months (
	IN i_dt		TIMESTAMP WITHOUT TIME ZONE,
	IN i_num	NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- Oracle：add_months
-- ===============================================================================
BEGIN
	IF i_dt <> fcpa_postgres_util$last_day(i_dt) THEN
		RETURN i_dt + (TRUNC(i_num, 0) || ' months')::INTERVAL ;
	ELSE
		RETURN fcpa_postgres_util$last_day(i_dt + (TRUNC(i_num, 0) || ' months')::INTERVAL) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql STRICT IMMUTABLE
;

CREATE OR REPLACE PROCEDURE fcpa_postgres_util$type_is_table_row (
	IN i_nm		VARCHAR,
	IN i_rowtype	VARCHAR,
	IN i_indextype	VARCHAR
)
AS
$BODY$
-- ===============================================================================
-- パッケージの配列定義の代替（テーブル%ROWTYPE版)
-- ===============================================================================
DECLARE
	l_sql	VARCHAR ;
BEGIN
	l_sql := 'CREATE TEMPORARY TABLE ' || i_nm || ' ON COMMIT DELETE ROWS AS SELECT * FROM ' || i_rowtype || ' where 1 = 0';
	EXECUTE l_sql ;

	l_sql := 'ALTER TABLE ' || i_nm || ' ADD _index_ ' || i_indextype ;
	EXECUTE l_sql ;

	l_sql := 'CREATE UNIQUE INDEX ON ' || i_nm || '(_index_)' ;
	EXECUTE l_sql ;
EXCEPTION 
	WHEN OTHERS THEN
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_postgres_util$type_is_table_col (
	IN i_nm		VARCHAR,
	IN i_coltype	VARCHAR,
	IN i_indextype	VARCHAR
)
AS
$BODY$
-- ===============================================================================
-- パッケージの配列定義の代替（%TYPE版)
-- ===============================================================================
DECLARE
	l_sql	VARCHAR ;
BEGIN
	l_sql := 'CREATE TEMPORARY TABLE ' || i_nm || '(_elem_ ' || i_coltype || ')' ;
	EXECUTE l_sql ;

	l_sql := 'ALTER TABLE ' || i_nm || ' ADD _index_ ' || i_indextype ;
	EXECUTE l_sql ;

	l_sql := 'CREATE UNIQUE INDEX ON ' || i_nm || '(_index_)' ;
	EXECUTE l_sql ;
EXCEPTION 
	WHEN OTHERS THEN
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_postgres_util$get_dblink_nm ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 自律トランザクション用のＤＢリンク名の取得
-- ===============================================================================
BEGIN
	RETURN 'autonomous_transaction' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE PROCEDURE fcpa_postgres_util$begin_autonomous_transaction ()
AS
$BODY$
-- ===============================================================================
-- 自律トランザクションの開始（dblinkの接続）
-- ===============================================================================
DECLARE
	c_server_nm	CONSTANT VARCHAR := 'auto_tran_dblink' ;
	l_cnt		INTEGER ;
	l_dblink_nm	VARCHAR ;
BEGIN
	l_dblink_nm := fcpa_postgres_util$get_dblink_nm() ;

	SELECT	COUNT(*) INTO l_cnt
	FROM	unnest(dblink_get_connections()) AS t(db_link_nm) 
	WHERE	t.db_link_nm = l_dblink_nm
	;

	IF l_cnt = 0 THEN
		PERFORM dblink_connect(l_dblink_nm, c_server_nm) ;
	END IF ;

	PERFORM dblink_exec(
			l_dblink_nm,
			format('CALL fcpa_context$set_co_cd_dblink(%L)', 
				fcpa_context$f_get_co_cd() -- co_cd
				)
			)
			;

	PERFORM dblink_exec(
			l_dblink_nm,
			format('CALL fcpa_context$set_context_all(
				%L, --1 processid
				%L, --2 userid
				%L, --3 usernm
				%L, --4 login_seq
				%L, --5 co_cd
				%L, --6 ext_attr1
				%L, --7 ext_attr2
				%L, --8 ext_attr3
				%L, --9 action_id
				%L, --10 language
				%L, --11 arc_cd
				%L, --12 clt_id
				%L, --13 locale
				%L, --14 call_pg_id
				%L  --15 gp_batch_grp_cd
				)', 
				fcpa_context$f_get_processid(), --1 processid
				fcpa_context$f_get_userid(), --2 userid
				fcpa_context$f_get_usernm(), --3 usernm
				fcpa_context$f_get_login_seq(), --4 login_seq
				fcpa_context$f_get_co_cd(), --5 co_cd
				fcpa_context$f_get_ext_attr1(), --6 ext_attr1
				fcpa_context$f_get_ext_attr2(), --7 ext_attr2
				fcpa_context$f_get_ext_attr3(), --8 ext_attr3
				fcpa_context$f_get_action_id(), --9 action_id
				fcpa_context$f_get_language(), --10 language
				fcpa_context$f_get_arc_cd(), --11 arc_cd
				fcpa_context$f_get_clt_id(), --12 clt_id
				fcpa_context$f_get_locale(), --13 locale
				fcpa_context$f_get_call_pg_id(), --14 call_pg_id
				fcpa_context$f_get_gp_batch_grp_cd()  --15 gp_batch_grp_cd
				)
			)
			;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_postgres_util$begin_autonomous_transaction_nosession ()
AS
$BODY$
-- ===============================================================================
-- 自律トランザクションの開始（dblinkの接続）
-- セッションの初期化は行いません
-- dblink先でセッション情報を参照しない場合のみ利用可
-- セッション情報を参照する場合は必ずfcpa_postgres_util$begin_autonomous_transactionを使用してください。
-- ===============================================================================
DECLARE
	c_server_nm	CONSTANT VARCHAR := 'auto_tran_dblink' ;
	l_cnt		INTEGER ;
	l_dblink_nm	VARCHAR ;
BEGIN

	l_dblink_nm := fcpa_postgres_util$get_dblink_nm() ;

	SELECT	COUNT(*) INTO l_cnt
	FROM	unnest(dblink_get_connections()) AS t(db_link_nm) 
	WHERE	t.db_link_nm = l_dblink_nm
	;

	IF l_cnt = 0 THEN
		PERFORM dblink_connect(l_dblink_nm, c_server_nm) ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_postgres_util$end_autonomous_transaction ()
AS
$BODY$
-- ===============================================================================
-- 自律トランザクションの終了（dblinkの切断）
-- ===============================================================================
DECLARE
BEGIN
	PERFORM dblink_disconnect(fcpa_postgres_util$get_dblink_nm()) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_postgres_util$post_autonomous_transaction ()
AS
$BODY$
-- ===============================================================================
-- 自律トランザクションの後処理
-- ===============================================================================
DECLARE
BEGIN
	PERFORM dblink_exec(fcpa_postgres_util$get_dblink_nm(), 'CALL fcpa_context$del_context_dblink()');
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_postgres_util$exec_autonomous_function (
	IN i_sql VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 自律トランザクションに対するファンクション、もしくはout引数を１つのみ持つプロシージャの実行
-- VARCHARの型で返す
-- ===============================================================================
DECLARE
	l_val	VARCHAR ;
BEGIN
	CALL fcpa_postgres_util$begin_autonomous_transaction() ;

	SELECT	t.val
	INTO	l_val
	FROM	dblink(fcpa_postgres_util$get_dblink_nm(), i_sql) AS t(val varchar)
	;

	CALL fcpa_postgres_util$post_autonomous_transaction() ;

	RETURN l_val ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_postgres_util$exec_autonomous_sql (
	IN i_sql VARCHAR
)
AS
$BODY$
-- ===============================================================================
-- 自律トランザクションに対するプロシージャ（out引数を持たないプロシージャ）の実行
-- ===============================================================================
BEGIN
	CALL fcpa_postgres_util$begin_autonomous_transaction() ;

	PERFORM dblink_exec(fcpa_postgres_util$get_dblink_nm(), i_sql);

	CALL fcpa_postgres_util$post_autonomous_transaction() ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_postgres_util$exec_autonomous_sql_nosession (
	IN i_sql VARCHAR
)
AS
$BODY$
-- ===============================================================================
-- 自律トランザクションに対するプロシージャ（out引数を持たないプロシージャ）の実行
-- dblink先でのセッションの初期化は行いません
-- dblink先でセッション情報を参照しない場合のみ利用可
-- セッション情報を参照する場合は必ずfcpa_postgres_util$exec_autonomous_sqlを使用してください
-- ===============================================================================
BEGIN
	CALL fcpa_postgres_util$begin_autonomous_transaction_nosession() ;

	PERFORM dblink_exec(fcpa_postgres_util$get_dblink_nm(), i_sql);

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_postgres_util$set_var_link (
	IN i_proc_nm NAME,
	IN i_var_nm NAME,
	IN i_var_val ANYELEMENT
)
RETURNS void
AS $BODY$
-- ===============================================================================
-- パッケージ変数の設定（別トランザクション）
-- VARCHARの型で設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$exec_autonomous_function (
			format('select fcpa_postgres_util$set_var(%L, %L, %L::VARCHAR)', i_proc_nm, i_var_nm, i_var_val::VARCHAR)
			) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_postgres_util$get_var_link (
	IN i_proc_nm NAME,
	IN i_var_nm NAME
)
RETURNS VARCHAR
AS $BODY$
-- ===============================================================================
-- パッケージ変数の取得（別トランザクション）
-- VARCHARの型で返す 空文字の場合はNULLを返す
-- キーが取得できない場合（エラーが発生する場合はNULLを返す）
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$exec_autonomous_function (
			format('select fcpa_postgres_util$get_var(%L, %L)', i_proc_nm, i_var_nm)
			) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_postgres_util$p_truncate_work (
	IN i_table_nm	VARCHAR
)
AS
$BODY$
-- ===============================================================================
-- ワークテーブルをtruncateする
-- ===============================================================================
DECLARE
	l_table_nm	VARCHAR ;
	l_tmp_nm	VARCHAR ;
	l_sql		VARCHAR ;
BEGIN
	l_table_nm := LOWER(i_table_nm) ;
	-- 一時表が存在しないことがあるので検索処理を実行する
	-- 存在しないワークが指定されたときはエラー
	EXECUTE 'SELECT 1 FROM ' || l_table_nm || ' LIMIT 1' ;

	l_tmp_nm := l_table_nm || '$temp' ;

	l_sql := 'TRUNCATE ' || l_tmp_nm ;
	EXECUTE l_sql ;

END ;
$BODY$
LANGUAGE plpgsql
;

