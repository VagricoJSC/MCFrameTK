\encoding UTF-8

CREATE OR REPLACE FUNCTION fcpa_const$f_getnumval (
	IN p$class_id		VARCHAR,
	IN p$code		VARCHAR,
	IN p$defaultvalue	NUMERIC
)
RETURNS NUMERIC
AS
$BODY$
-- ===============================================================================
-- CLASS_ID、CODEに対するNUM_VALの値を取得
-- 該当するレコードがない場合は、p$defaultValue を返します。
-- ===============================================================================
DECLARE
	l$returncd	NUMERIC ;
BEGIN
	SELECT	m.num_val
	INTO STRICT l$returncd
	FROM	fcc_commonparam m
	WHERE	m.class_id = p$class_id AND m.code = p$code
	;

	RETURN l$returncd ;
EXCEPTION
	WHEN no_data_found THEN
		RETURN p$defaultvalue ;
	WHEN OTHERS THEN
		RETURN p$defaultvalue ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$f_getnumval_cache (
	IN p$class_id		VARCHAR,
	IN p$code		VARCHAR,
	IN p$defaultvalue	NUMERIC
)
RETURNS NUMERIC
AS
$BODY$
-- ===============================================================================
-- CLASS_ID、CODEに対するNUM_VALの値を取得
-- 該当するレコードがない場合は、p$defaultValue を返します。
-- IMMUTABLEを指定するため同一値を取得する場合はキャッシュが有効になります。
-- ===============================================================================
DECLARE
	l$returncd	NUMERIC ;
BEGIN
	SELECT	m.num_val
	INTO STRICT l$returncd
	FROM	fcc_commonparam m
	WHERE	m.class_id = p$class_id AND m.code = p$code
	;

	RETURN l$returncd ;
EXCEPTION
	WHEN no_data_found THEN
		RETURN p$defaultvalue ;
	WHEN OTHERS THEN
		RETURN p$defaultvalue ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_const$f_getstrval (
	IN p$class_id		VARCHAR,
	IN p$code		VARCHAR,
	IN p$defaultvalue	VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- CLASS_ID、CODEに対するSTR_VALの値を取得
-- 該当するレコードがない場合は、p$defaultValue を返します。
-- ===============================================================================
DECLARE
	l$returncd	VARCHAR(100) ;
BEGIN
	SELECT	m.str_val
	INTO STRICT l$returncd
	FROM	fcc_commonparam m
	WHERE	m.class_id = p$class_id AND m.code = p$code
	;

	RETURN l$returncd ;

EXCEPTION
	WHEN no_data_found THEN
		RETURN p$defaultvalue ;
	WHEN OTHERS THEN
		RETURN p$defaultvalue ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$f_getstrval_cache (
	IN p$class_id		VARCHAR,
	IN p$code		VARCHAR,
	IN p$defaultvalue	VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- CLASS_ID、CODEに対するSTR_VALの値を取得
-- 該当するレコードがない場合は、p$defaultValue を返します。
-- IMMUTABLEを指定するため同一値を取得する場合はキャッシュが有効になります。
-- ===============================================================================
DECLARE
	l$returncd	VARCHAR(100) ;
BEGIN
	SELECT	m.str_val
	INTO STRICT l$returncd
	FROM	fcc_commonparam m
	WHERE	m.class_id = p$class_id AND m.code = p$code
	;

	RETURN l$returncd ;

EXCEPTION
	WHEN no_data_found THEN
		RETURN p$defaultvalue ;
	WHEN OTHERS THEN
		RETURN p$defaultvalue ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION fcpa_const$dt2name (
	IN i_grp_cd	VARCHAR,
	IN i_v		TIMESTAMP WITHOUT TIME ZONE,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）よりDATE型定数値を条件に定数名を検索します。
-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_name%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_d = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_d = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_name
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_d = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$dt2rmrks (
	IN i_grp_cd	VARCHAR,
	IN i_v		TIMESTAMP WITHOUT TIME ZONE,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）よりDATE型定数値を条件に定数備考を検索します。
-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_rmrks%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_d = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_d = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_rmrks
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_d = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$flg2name (
	IN i_grp_cd	VARCHAR,
	IN i_v		CHAR,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）よりフラグ型定数値を条件に定数名を検索します。
-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_name%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_f = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_f = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_name
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_f = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$flg2rmrks (
	IN i_grp_cd	VARCHAR,
	IN i_v		CHAR,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）よりフラグ型定数値を条件に定数備考を検索します。
-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_rmrks%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_f = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_f = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_rmrks
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_f = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$key2name (
	IN i_grp_cd	VARCHAR,
	IN i_key	VARCHAR,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）よりキーを条件に定数名を検索します。
-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_name%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.c_key = i_key AND m.locale_cd IS NULL
		;
	ELSE
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.c_key = i_key AND m.locale_cd = i_lcl_cd
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_name
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.c_key = i_key AND m.locale_cd IS NULL
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$key2rmrks (
	IN i_grp_cd	VARCHAR,
	IN i_key	VARCHAR,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）よりキーを条件に定数備考を検索します。
-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_rmrks%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.c_key = i_key AND m.locale_cd IS NULL
		;
	ELSE
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.c_key = i_key AND m.locale_cd = i_lcl_cd
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_rmrks
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.c_key = i_key AND m.locale_cd IS NULL
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$num2name (
	IN i_grp_cd	VARCHAR,
	IN i_v		NUMERIC,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）より数値型定数値を条件に定数名を検索します。
-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_name%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_n = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_n = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_name
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_n = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$num2rmrks (
	IN i_grp_cd	VARCHAR,
	IN i_v		NUMERIC,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）より数値型定数値を条件に定数備考を検索します。
-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_rmrks%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_n = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_n = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_rmrks
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_n = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$str2name (
	IN i_grp_cd	VARCHAR,
	IN i_v		VARCHAR,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）より文字列型定数値を条件に定数名を検索します。
-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_name%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_s = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_s = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_name
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_s = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$str2rmrks (
	IN i_grp_cd	VARCHAR,
	IN i_v		VARCHAR,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）より文字列型定数値を条件に定数備考を検索します。
-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_rmrks%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_s = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_s = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_rmrks
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_s = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$ts2name (
	IN i_grp_cd	VARCHAR,
	IN i_v		TIMESTAMP WITHOUT TIME ZONE,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）よりTIMESTAMP型定数値を条件に定数名を検索します。
-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_name%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_ts = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_name
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_ts = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_name
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_ts = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$ts2rmrks (
	IN i_grp_cd	VARCHAR,
	IN i_v		TIMESTAMP WITHOUT TIME ZONE,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数名テーブル（FCM_CONST_NM）よりTIMESTAMP型定数値を条件に定数備考を検索します。
-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_nm.c_rmrks%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_ts = i_v AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.v_ts = i_v AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;
EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_rmrks
			INTO STRICT l_nm
			FROM	fcm_const_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.v_ts = i_v AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$grp_name (
	IN i_grp_cd	VARCHAR,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数グループ名テーブル（FCM_CONST_GRP_NM）より定数グループ名を検索します。
-- I_LCL_CDに対応する定数グループ名がない場合はロケールなしの名称を返します。
-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_grp_nm.c_grp_nm%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_grp_nm
		INTO STRICT l_nm
		FROM	fcm_const_grp_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_grp_nm
		INTO STRICT l_nm
		FROM	fcm_const_grp_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;

EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_grp_nm
			INTO STRICT l_nm
			FROM	fcm_const_grp_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_const$grp_rmrks (
	IN i_grp_cd	VARCHAR,
	IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数グループ名テーブル（FCM_CONST_GRP_NM）より定数グループ備考を検索します。
-- I_LCL_CDに対応する定数グループ備考がない場合はロケールなしの備考を返します。
-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
-- ===============================================================================
DECLARE
	l_nm	fcm_const_grp_nm.c_grp_rmrks%TYPE ;
BEGIN
	IF i_lcl_cd IS NULL THEN
		SELECT	m.c_grp_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_grp_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.locale_cd IS NULL
		LIMIT 1
		;
	ELSE
		SELECT	m.c_grp_rmrks
		INTO STRICT l_nm
		FROM	fcm_const_grp_nm m
		WHERE	m.c_grp_cd = i_grp_cd AND m.locale_cd = i_lcl_cd
		LIMIT 1
		;
	END IF ;

	RETURN l_nm ;

EXCEPTION
	WHEN no_data_found THEN
		IF i_lcl_cd IS NULL THEN
			RETURN NULL ;
		END IF ;

		BEGIN
			SELECT	m.c_grp_rmrks
			INTO STRICT l_nm
			FROM	fcm_const_grp_nm m
			WHERE	m.c_grp_cd = i_grp_cd AND m.locale_cd IS NULL
			LIMIT 1
			;

			RETURN l_nm ;
		EXCEPTION
			WHEN no_data_found THEN
				RETURN NULL ;
		END ;
END ;
$BODY$
LANGUAGE plpgsql
;

--追加
CREATE OR REPLACE FUNCTION fcpa_const$get_const_val (
	IN i_grp_cd	VARCHAR,
	IN i_key	VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 定数キーに対する定数値を取得する
-- 取得できない場合はエラー
-- ===============================================================================
DECLARE
	l_v_s	fcm_const_nm.v_s%TYPE ;
BEGIN
	SELECT	m.v_s
	INTO STRICT l_v_s
	FROM	fcm_const_nm m
	WHERE	m.c_grp_cd = i_grp_cd AND m.c_key = i_key AND m.locale_cd IS NULL
	LIMIT 1
	;

	RETURN l_v_s ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

