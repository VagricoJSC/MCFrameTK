CREATE OR REPLACE FUNCTION fcpa_context$process_id_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのプロセスＩＤを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'PROCESS_ID' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$user_id_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのユーザＩＤを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'USER_ID' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$user_nm_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのユーザ名を取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'USER_NM' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$login_seq_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのログインシーケンスを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'LOGIN_SEQ' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$co_cd_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの会社ＣＤを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'CO_CD' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$ext_attr1_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性１を取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'EXT_ATTR1';
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$ext_attr2_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性２を取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'EXT_ATTR2' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$ext_attr3_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性３を取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'EXT_ATTR3' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$action_id_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのアクションＩＤを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'ACTION_ID' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$language_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの言語情報を取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'LANGUAGE' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$arc_cd_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのアーキテクチャCDを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'ARC_CD' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$clt_id_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのクライアントIDを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'CLT_ID' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$locale_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのロケールを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'LOCALE' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$c_call_pg_id_key ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 呼び出し元プログラムＩＤを取得するためのキー値
-- ===============================================================================
BEGIN
	RETURN 'CALL_PG_ID' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_processid ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのプロセスＩＤを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_process_id') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_processid (
	IN i$prosessid VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションのプロセスＩＤを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_process_id', i$prosessid) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_userid ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのユーザＩＤを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_user_id') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_userid (
	IN i$user_id VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションのユーザＩＤを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_user_id', i$user_id) ;

	UPDATE	fct_context t
	SET 	user_id = i$user_id
	WHERE	0=0
	AND	t.pid = pg_backend_pid()
	;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_usernm ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのユーザ名を取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_user_nm') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_usernm (
	IN i$user_nm VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションのユーザ名を設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_user_nm', i$user_nm) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_login_seq ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのログインシーケンスを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_login_seq') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_login_seq (
	IN i$seq VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションのログインシーケンスを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_login_seq', i$seq) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_action_id ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのアクションＩＤを取得する
-- ===============================================================================
BEGIN
	RETURN COALESCE(fcpa_postgres_util$get_var('fcpa_context', 'v_action_id'), '0') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_action_id (
	IN i$action_id VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションのアクションＩＤを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_action_id', i$action_id) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_co_cd ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの会社ＣＤを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_co_cd') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_def_locale_cd ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの会社ＣＤの標準ロケールを取得する
-- ===============================================================================
DECLARE
	v_def_locale_cd VARCHAR ;
	v_co_cd	VARCHAR ;
BEGIN
	v_co_cd := fcpa_context$f_get_co_cd() ;
	v_def_locale_cd := fcpa_postgres_util$get_var('fcpa_context', 'v_def_locale_cd') ;
	IF v_def_locale_cd IS NULL THEN
		IF v_co_cd IS NULL THEN
			PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_def_locale_cd', fcpa_const$f_getstrval('LCL', 'AdminLclCd', 'ja_JP')) ;
		ELSE
			SELECT	m.def_locale_cd
			INTO STRICT v_def_locale_cd
			FROM	fcm_co_all m
			WHERE	0=0
			AND	m.co_cd = v_co_cd
			;

			PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_def_locale_cd', v_def_locale_cd) ;
		END IF ;
	END IF ;

	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_def_locale_cd') ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_co_cd (
	IN i$co_cd VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションの会社ＣＤを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_co_cd', i$co_cd) ;
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_def_locale_cd', NULL::VARCHAR) ;

	UPDATE	fct_context t
	SET 	co_cd = i$co_cd
	WHERE	0=0
	AND	t.pid = pg_backend_pid()
	;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_co_cd_ext (
	IN i$co_cd VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションの会社ＣＤを設定する（外部接続用）
-- ===============================================================================
DECLARE
	cnt	INTEGER ;
BEGIN
	SELECT	COUNT(*) INTO cnt
	FROM	fct_context t
	WHERE	t.pid = pg_backend_pid()
	;

	IF cnt = 0 THEN
		INSERT INTO fct_context (pid) VALUES (pg_backend_pid()) ;
	END IF ;

	CALL fcpa_context$set_co_cd (i$co_cd) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_co_cd_dblink (
	IN i$co_cd VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションの会社ＣＤを設定する（dblink用）
-- ===============================================================================
BEGIN

	DELETE FROM fct_context t WHERE t.pid = pg_backend_pid() ;

	INSERT INTO fct_context (pid, co_cd) VALUES (pg_backend_pid(), i$co_cd) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_context$del_context_dblink ()
AS 
$BODY$
-- ===============================================================================
-- dblink先で作成したfct_contextを削除する
-- ===============================================================================
BEGIN
	DELETE FROM fct_context t WHERE t.pid = pg_backend_pid() ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_context$f_get_ext_attr1 ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性１を取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_ext_attr1') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_ext_attr1 (
	IN i$attr1 VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性１を設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_ext_attr1', i$attr1) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_ext_attr2 ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性２を取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_ext_attr2') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_ext_attr2 (
	IN i$attr2 VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性２を設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_ext_attr2', i$attr2) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_ext_attr3 ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性３を取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_ext_attr3') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_ext_attr3 (
	IN i$attr3 VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションの属性３を設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_ext_attr3', i$attr3) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_language ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションの言語情報を取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_language') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_language (
	IN i$lang VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションの言語情報を設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_language', i$lang) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_arc_cd ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのアーキテクチャCDを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_arc_cd') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_arc_cd (
	IN i$arc_cd VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションのアーキテクチャCDを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_arc_cd', i$arc_cd) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_clt_id ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのクライアントIDを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_ctl_id') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_clt_id (
	IN i$clt_id VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションのクライアントIDを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_ctl_id', i$clt_id) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_locale ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ＤＢコネクションのロケールを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_locale') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_locale (
	IN i$locale VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ＤＢコネクションのロケールを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_locale', i$locale) ;

	UPDATE	fct_context t
	SET 	lcl_cd = i$locale
	WHERE	0=0
	AND	t.pid = pg_backend_pid()
	;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_call_pg_id ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 呼び出し元プログラムＩＤを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_call_pg_id') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_call_pg_id (
	IN i$call_pg_id VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- 呼び出し元プログラムＩＤを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_call_pg_id', i$call_pg_id) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_gp_batch_grp_cd ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 汎用バッチ処理グループＣＤを取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_postgres_util$get_var('fcpa_context', 'v_gp_batch_grp_cd') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_gp_batch_grp_cd (
	IN i$gp_batch_grp_cd VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- 汎用バッチ処理グループＣＤを設定する
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_context', 'v_gp_batch_grp_cd', i$gp_batch_grp_cd) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_context (
	IN p$attribute VARCHAR,
	IN p$avalue VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- MCFRAME標準のネームスペースへの属性設定
-- ===============================================================================
BEGIN
	IF p$attribute = fcpa_context$process_id_key() THEN
		CALL fcpa_context$set_processid(p$avalue) ;
	ELSIF p$attribute = fcpa_context$user_id_key() THEN
		CALL fcpa_context$set_userid(p$avalue) ;
	ELSIF p$attribute = fcpa_context$user_nm_key() THEN
		CALL fcpa_context$set_usernm(p$avalue) ;
	ELSIF p$attribute = fcpa_context$login_seq_key() THEN
		CALL fcpa_context$set_login_seq(p$avalue) ;
	ELSIF p$attribute = fcpa_context$co_cd_key() THEN
		CALL fcpa_context$set_co_cd(p$avalue) ;
	ELSIF p$attribute = fcpa_context$ext_attr1_key() THEN
		CALL fcpa_context$set_ext_attr1(p$avalue) ;
	ELSIF p$attribute = fcpa_context$ext_attr2_key() THEN
		CALL fcpa_context$set_ext_attr2(p$avalue) ;
	ELSIF p$attribute = fcpa_context$ext_attr3_key() THEN
		CALL fcpa_context$set_ext_attr3(p$avalue) ;
	ELSIF p$attribute = fcpa_context$action_id_key() THEN
		CALL fcpa_context$set_action_id(p$avalue) ;
	ELSIF p$attribute = fcpa_context$language_key() THEN
		CALL fcpa_context$set_language(p$avalue) ;
	ELSIF p$attribute = fcpa_context$arc_cd_key() THEN
		CALL fcpa_context$set_arc_cd(p$avalue) ;
	ELSIF p$attribute = fcpa_context$clt_id_key() THEN
		CALL fcpa_context$set_clt_id(p$avalue) ;
	ELSIF p$attribute = fcpa_context$locale_key() THEN
		CALL fcpa_context$set_locale(p$avalue) ;
	ELSIF p$attribute = fcpa_context$c_call_pg_id_key() THEN
		CALL fcpa_context$set_call_pg_id(p$avalue) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$get_context (
	IN p$attribute VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- MCFRAME標準のネームスペースへの属性取得
-- ===============================================================================
BEGIN
	IF p$attribute = fcpa_context$process_id_key() THEN
		RETURN fcpa_context$f_get_processid() ;
	ELSIF p$attribute = fcpa_context$user_id_key() THEN
		RETURN fcpa_context$f_get_userid() ;
	ELSIF p$attribute = fcpa_context$user_nm_key() THEN
		RETURN fcpa_context$f_get_usernm() ;
	ELSIF p$attribute = fcpa_context$login_seq_key() THEN
		RETURN fcpa_context$f_get_login_seq() ;
	ELSIF p$attribute = fcpa_context$co_cd_key() THEN
		RETURN fcpa_context$f_get_co_cd() ;
	ELSIF p$attribute = fcpa_context$ext_attr1_key() THEN
		RETURN fcpa_context$f_get_ext_attr1() ;
	ELSIF p$attribute = fcpa_context$ext_attr2_key() THEN
		RETURN fcpa_context$f_get_ext_attr2() ;
	ELSIF p$attribute = fcpa_context$ext_attr3_key() THEN
		RETURN fcpa_context$f_get_ext_attr3() ;
	ELSIF p$attribute = fcpa_context$action_id_key() THEN
		RETURN fcpa_context$f_get_action_id() ;
	ELSIF p$attribute = fcpa_context$language_key() THEN
		RETURN fcpa_context$f_get_language() ;
	ELSIF p$attribute = fcpa_context$arc_cd_key() THEN
		RETURN fcpa_context$f_get_arc_cd() ;
	ELSIF p$attribute = fcpa_context$clt_id_key() THEN
		RETURN fcpa_context$f_get_clt_id() ;
	ELSIF p$attribute = fcpa_context$locale_key() THEN
		RETURN fcpa_context$f_get_locale() ;
	ELSIF p$attribute = fcpa_context$c_call_pg_id_key() THEN
		RETURN fcpa_context$f_get_call_pg_id() ;
	END IF ;
	RETURN NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$get_context_all (
	INOUT o$processid VARCHAR,
	INOUT o$userid VARCHAR,
	INOUT o$usernm VARCHAR,
	INOUT o$login_seq VARCHAR,
	INOUT o$co_cd VARCHAR,
	INOUT o$ext_attr1 VARCHAR,
	INOUT o$ext_attr2 VARCHAR,
	INOUT o$ext_attr3 VARCHAR,
	INOUT o$action_id VARCHAR,
	INOUT o$language VARCHAR,
	INOUT o$arc_cd VARCHAR,
	INOUT o$clt_id VARCHAR,
	INOUT o$locale VARCHAR,
	INOUT o$call_pg_id VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- すべての属性取得
-- ===============================================================================
BEGIN
	o$processid := fcpa_context$f_get_processid() ;
	o$userid := fcpa_context$f_get_userid() ;
	o$usernm := fcpa_context$f_get_usernm() ;
	o$login_seq := fcpa_context$f_get_login_seq() ;
	o$co_cd := fcpa_context$f_get_co_cd() ;
	o$ext_attr1 := fcpa_context$f_get_ext_attr1() ;
	o$ext_attr2 := fcpa_context$f_get_ext_attr2() ;
	o$ext_attr3 := fcpa_context$f_get_ext_attr3() ;
	o$action_id := fcpa_context$f_get_action_id() ;
	o$language := fcpa_context$f_get_language() ;
	o$arc_cd := fcpa_context$f_get_arc_cd() ;
	o$clt_id := fcpa_context$f_get_clt_id() ;
	o$locale := fcpa_context$f_get_locale() ;
	o$call_pg_id := fcpa_context$f_get_call_pg_id() ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_context_all (
	IN i$processid VARCHAR,
	IN i$userid VARCHAR,
	IN i$usernm VARCHAR,
	IN i$login_seq VARCHAR,
	IN i$co_cd VARCHAR,
	IN i$ext_attr1 VARCHAR,
	IN i$ext_attr2 VARCHAR,
	IN i$ext_attr3 VARCHAR,
	IN i$action_id VARCHAR,
	IN i$language VARCHAR,
	IN i$arc_cd VARCHAR,
	IN i$clt_id VARCHAR,
	IN i$locale VARCHAR,
	IN i$call_pg_id VARCHAR,
	IN i$gp_batch_grp_cd VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- すべての属性設定
-- ===============================================================================
BEGIN
	CALL fcpa_context$set_processid(i$processid) ;
	CALL fcpa_context$set_userid(i$userid) ;
	CALL fcpa_context$set_usernm(i$usernm) ;
	CALL fcpa_context$set_login_seq(i$login_seq) ;
	CALL fcpa_context$set_co_cd(i$co_cd) ;
	CALL fcpa_context$set_ext_attr1(i$ext_attr1) ;
	CALL fcpa_context$set_ext_attr2(i$ext_attr2) ;
	CALL fcpa_context$set_ext_attr3(i$ext_attr3) ;
	CALL fcpa_context$set_action_id(i$action_id) ;
	CALL fcpa_context$set_language(i$language) ;
	CALL fcpa_context$set_arc_cd(i$arc_cd) ;
	CALL fcpa_context$set_clt_id(i$clt_id) ;
	CALL fcpa_context$set_locale(i$locale) ;
	CALL fcpa_context$set_call_pg_id(i$call_pg_id) ;
	CALL fcpa_context$set_gp_batch_grp_cd(i$gp_batch_grp_cd) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$clear_context (
	IN p$attribute VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- MCFRAME標準のネームスペースへの属性クリア
-- ===============================================================================
BEGIN
	IF p$attribute = fcpa_context$process_id_key() THEN
		CALL fcpa_context$set_processid(NULL) ;
	ELSIF p$attribute = fcpa_context$user_id_key() THEN
		CALL fcpa_context$set_userid(NULL) ;
	ELSIF p$attribute = fcpa_context$user_nm_key() THEN
		CALL fcpa_context$set_usernm(NULL) ;
	ELSIF p$attribute = fcpa_context$login_seq_key() THEN
		CALL fcpa_context$set_login_seq(NULL) ;
	ELSIF p$attribute = fcpa_context$co_cd_key() THEN
		CALL fcpa_context$set_co_cd(NULL) ;
	ELSIF p$attribute = fcpa_context$ext_attr1_key() THEN
		CALL fcpa_context$set_ext_attr1(NULL) ;
	ELSIF p$attribute = fcpa_context$ext_attr2_key() THEN
		CALL fcpa_context$set_ext_attr2(NULL) ;
	ELSIF p$attribute = fcpa_context$ext_attr3_key() THEN
		CALL fcpa_context$set_ext_attr3(NULL) ;
	ELSIF p$attribute = fcpa_context$action_id_key() THEN
		CALL fcpa_context$set_action_id(NULL) ;
	ELSIF p$attribute = fcpa_context$language_key() THEN
		CALL fcpa_context$set_language(NULL) ;
	ELSIF p$attribute = fcpa_context$arc_cd_key() THEN
		CALL fcpa_context$set_arc_cd(NULL) ;
	ELSIF p$attribute = fcpa_context$clt_id_key() THEN
		CALL fcpa_context$set_clt_id(NULL) ;
	ELSIF p$attribute = fcpa_context$locale_key() THEN
		CALL fcpa_context$set_locale(NULL) ;
	ELSIF p$attribute = fcpa_context$c_call_pg_id_key() THEN
		CALL fcpa_context$set_call_pg_id(NULL) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$clear_all_context ()
AS 
$BODY$
-- ===============================================================================
-- すべてのアプリケーションコンテキストの削除
-- ===============================================================================
BEGIN
	CALL fcpa_context$set_processid(NULL) ;
	CALL fcpa_context$set_userid(NULL) ;
	CALL fcpa_context$set_usernm(NULL) ;
	CALL fcpa_context$set_login_seq(NULL) ;
	CALL fcpa_context$set_action_id(NULL) ;
	CALL fcpa_context$set_co_cd(NULL) ;
	CALL fcpa_context$set_ext_attr1(NULL) ;
	CALL fcpa_context$set_ext_attr2(NULL) ;
	CALL fcpa_context$set_ext_attr3(NULL) ;
	CALL fcpa_context$set_language(NULL) ;
	CALL fcpa_context$set_arc_cd(NULL) ;
	CALL fcpa_context$set_clt_id(NULL) ;
	CALL fcpa_context$set_locale(NULL) ;
	CALL fcpa_context$set_call_pg_id(NULL) ;
	CALL fcpa_context$set_gp_batch_grp_cd(NULL) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_context_user (
	IN i$prosessid VARCHAR,
	IN i$user_id VARCHAR,
	IN i$user_nm VARCHAR,
	IN i$seq VARCHAR,
	IN i$action_id VARCHAR,
	IN i$locale VARCHAR,
	IN i$call_id VARCHAR,
	INOUT o$returncd VARCHAR,
	INOUT o$msg VARCHAR,
	IN i$co_cd VARCHAR,
	IN i$ext_attr1 VARCHAR,
	IN i$ext_attr2 VARCHAR,
	IN i$ext_attr3 VARCHAR,
	INOUT o$language VARCHAR,
	INOUT o$clt_id VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ユーザ情報をアプリケーションコンテキストに設定します。
-- 戻り値(O$RETURNCD)：	0=正常
--			1=S_LOGINに情報がない
--			9=異常終了
-- ===============================================================================
DECLARE
	loginr fct_login%ROWTYPE ;
BEGIN
	BEGIN
		SELECT	t.*
		INTO STRICT loginr
		FROM	fct_login t
		WHERE	0=0
		AND	t.user_id = i$user_id
		AND	t.login_seq = i$seq
		;
	EXCEPTION
		WHEN no_data_found THEN
			o$returncd := '1' ;
			RETURN ;
		WHEN OTHERS THEN
			o$returncd := '9' ;
			o$msg := SQLERRM ;
			RETURN ;
	END ;

	BEGIN
		CALL fcpa_context$set_processid(i$prosessid) ;
		CALL fcpa_context$set_userid(loginr.user_id) ;
		CALL fcpa_context$set_usernm(i$user_nm) ;
		CALL fcpa_context$set_login_seq(i$seq) ;
		CALL fcpa_context$set_action_id(i$action_id) ;
		CALL fcpa_context$set_co_cd(i$co_cd) ;
		CALL fcpa_context$set_ext_attr1(i$ext_attr1) ;
		CALL fcpa_context$set_ext_attr2(i$ext_attr2) ;
		CALL fcpa_context$set_ext_attr3(i$ext_attr3) ;
		CALL fcpa_context$set_arc_cd(loginr.arc_cd) ;
		CALL fcpa_context$set_clt_id(loginr.clt_id) ;
		CALL fcpa_context$set_locale(i$locale) ;
		CALL fcpa_context$set_language(i$locale) ; /* ロケールと同じ内容を設定 */
		CALL fcpa_context$set_call_pg_id(i$call_id) ;
	EXCEPTION
		WHEN OTHERS THEN
			o$returncd := '9' ;
			o$msg := SQLERRM ;
		RETURN ;
	END ;

	o$returncd := '0' ;
	o$msg := NULL ;
	o$language := fcpa_context$f_get_language() ;
	o$clt_id := fcpa_context$f_get_clt_id() ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_context_user (
	IN i$co_cd VARCHAR,
	IN i$ext_attr1 VARCHAR,
	IN i$ext_attr2 VARCHAR,
	IN i$ext_attr3 VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- ユーザ情報をアプリケーションコンテキストに設定します。
-- ===============================================================================
BEGIN
	CALL fcpa_context$set_co_cd(i$co_cd) ;
	CALL fcpa_context$set_ext_attr1(i$ext_attr1) ;
	CALL fcpa_context$set_ext_attr2(i$ext_attr2) ;
	CALL fcpa_context$set_ext_attr3(i$ext_attr3) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_context$set_context_coview (
	IN i$co_cd VARCHAR,
	IN i$locale VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- CO_VIEW参照のための情報をアプリケーションコンテキストに設定します。
-- ===============================================================================
BEGIN
	CALL fcpa_context$set_co_cd(i$co_cd) ;
	CALL fcpa_context$set_locale(i$locale) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_context$f_get_os_usr ()
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- Oracle：接続中のOSユーザを返す 
--		 RETURN '?' || SUBSTR(SYS_CONTEXT('USERENV', 'OS_USER'), INSTR(SYS_CONTEXT('USERENV', 'OS_USER'), '\') + 1, FCPA_META.USR_ID_L - 1) ;
-- PostgresSQL：データベースのログインユーザを返す
-- ===============================================================================
BEGIN
	RETURN '?' || SUBSTR(user, 1,  fcpa_postgres_util$get_col_length('fcm_user', 'user_id') - 1) ;
END ;
$BODY$
LANGUAGE plpgsql
;

