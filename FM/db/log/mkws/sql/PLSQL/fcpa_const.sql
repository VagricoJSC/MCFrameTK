SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE FCPA_CONST 
-- ==============================================================================
-- 機能      定数関連の関数
-- 作成者    H.Katayama
-- 作成日付  2007-07-27
-- 改版履歴  2016-10-24 S.SUZUKI KEY2RMRKS、STR2RMRKS、NUM2RMRKS、DT2RMRKS、TS2RMRKS、FLG2RMRKS、GRP_NAME、GRP_RMRKSを追加
-- 改版履歴  2014-11-17 A.SHIMAO F_GETSTRVAL_CACHE、F_GETNUMVAL_CACHEを追加
-- 改版履歴  2013-01-11 takaiwa    名称取得関数追加
-- 改版履歴  2007-07-27 H.Katayama 初版作成
--
-- バージョン:6.3.1
-- ==============================================================================
IS
	-- ===============================================================================
	-- CLASS_ID、CODEに対するSTR_VALの値を取得
	-- 該当するレコードがない場合は、p$defaultValue を返します。
	-- ===============================================================================
	function f_getStrVal (
		p$class_id in varchar2,
		p$code  in varchar2,
		p$defaultValue in varchar2
	) return varchar2 ;
	-- ===============================================================================
	-- CLASS_ID、CODEに対するNUM_VALの値を取得
	-- 該当するレコードがない場合は、p$defaultValue を返します。
	-- ===============================================================================
	function f_getNumVal (
		p$class_id in varchar2,
		p$code  in varchar2,
		p$defaultValue in number
	) return number ;
	-- ===============================================================================
	-- CLASS_ID、CODEに対するSTR_VALの値を取得
	-- 該当するレコードがない場合は、p$defaultValue を返します。
	-- RESULT_CACHEを指定するため同一値を取得する場合はキャッシュが有効になります。
	-- ===============================================================================
	function F_GETSTRVAL_CACHE (
		p$class_id in varchar2,
		p$code  in varchar2,
		p$defaultValue in varchar2
	) return varchar2 RESULT_CACHE;
	-- ===============================================================================
	-- CLASS_ID、CODEに対するNUM_VALの値を取得
	-- 該当するレコードがない場合は、p$defaultValue を返します。
	-- RESULT_CACHEを指定するため同一値を取得する場合はキャッシュが有効になります。
	-- ===============================================================================
	function F_GETNUMVAL_CACHE (
		p$class_id in varchar2,
		p$code  in varchar2,
		p$defaultValue in number
	) return number RESULT_CACHE;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりキーを条件に定数名を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION KEY2NAME(
	    I_GRP_CD IN VARCHAR2,
	    I_KEY IN VARCHAR2, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）より文字列型定数値を条件に定数名を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION STR2NAME(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN VARCHAR2, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）より数値型定数値を条件に定数名を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION NUM2NAME(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN NUMBER, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりDATE型定数値を条件に定数名を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION DT2NAME(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN DATE, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりTIMESTAMP型定数値を条件に定数名を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION TS2NAME(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN TIMESTAMP, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりフラグ型定数値を条件に定数名を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION FLG2NAME(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN CHAR, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりキーを条件に定数備考を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION KEY2RMRKS(
	    I_GRP_CD IN VARCHAR2,
	    I_KEY IN VARCHAR2, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）より文字列型定数値を条件に定数備考を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION STR2RMRKS(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN VARCHAR2, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）より数値型定数値を条件に定数備考を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION NUM2RMRKS(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN NUMBER, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりDATE型定数値を条件に定数備考を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION DT2RMRKS(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN DATE, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりTIMESTAMP型定数値を条件に定数備考を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION TS2RMRKS(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN TIMESTAMP, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりフラグ型定数値を条件に定数備考を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION FLG2RMRKS(
	    I_GRP_CD IN VARCHAR2,
	    I_V IN CHAR, 
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数グループ名テーブル（FCM_CONST_GRP_NM）より定数グループ名を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION GRP_NAME(
	    I_GRP_CD IN VARCHAR2,
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
	-- ===============================================================================
	-- 定数グループ名テーブル（FCM_CONST_GRP_NM）より定数グループ備考を検索します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION GRP_RMRKS(
	    I_GRP_CD IN VARCHAR2,
	    I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2;
end;

/
show errors;


CREATE OR REPLACE PACKAGE BODY FCPA_CONST 
-- ==============================================================================
-- 機能		 定数関連の関数
-- 作成者	 H.Katayama
-- 作成日付	 2007-07-27
-- 改版履歴	 2016-10-24 S.SUZUKI KEY2RMRKS、STR2RMRKS、NUM2RMRKS、DT2RMRKS、TS2RMRKS、FLG2RMRKSを追加
-- 改版履歴	 2014-11-17 A.SHIMAO F_GETSTRVAL_CACHE、F_GETNUMVAL_CACHEを追加
-- 改版履歴	 2014-10-03 shimao		 F_GETSTRVALの戻り値用変数の桁数を修正
-- 改版履歴	 2013-01-11 takaiwa		 名称取得関数追加
-- 改版履歴	 2007-07-27 H.Katayama 初版作成
--
-- バージョン:6.3.1
-- ==============================================================================
IS
	-- ===============================================================================
	-- CLASS_ID、CODEに対するSTR_VALの値を取得
	-- 該当するレコードがない場合は、p$defaultValue を返します。
	-- ===============================================================================
	FUNCTION F_GETSTRVAL (
		p$class_id in varchar2,
		p$code	in varchar2,
		p$defaultValue in varchar2
	) return varchar2
	is
		l$returncd	varchar2(100 char);
	begin
		SELECT STR_VAL INTO l$returncd FROM FCC_COMMONPARAM
		WHERE CLASS_ID = p$class_id AND CODE = p$code;

		RETURN l$returncd;

	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			RETURN p$defaultValue;

		WHEN OTHERS THEN
			RETURN p$defaultValue;
	end;
	-- ===============================================================================
	-- CLASS_ID、CODEに対するNUM_VALの値を取得
	-- 該当するレコードがない場合は、p$defaultValue を返します。
	-- ===============================================================================
	function f_getNumVal (
		p$class_id in varchar2,
		p$code	in varchar2,
		p$defaultValue in number
	) return number
	is
		l$returncd	number;
	begin
		SELECT NUM_VAL INTO l$returncd FROM FCC_COMMONPARAM
		WHERE CLASS_ID = p$class_id AND CODE = p$code;

		RETURN l$returncd;

	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			RETURN p$defaultValue;

		WHEN OTHERS THEN
			RETURN p$defaultValue;
	end;
	-- ===============================================================================
	-- CLASS_ID、CODEに対するSTR_VALの値を取得
	-- 該当するレコードがない場合は、p$defaultValue を返します。
	-- RESULT_CACHEを指定するため同一値を取得する場合はキャッシュが有効になります。
	-- ===============================================================================
	FUNCTION F_GETSTRVAL_CACHE (
		p$class_id in varchar2,
		p$code	in varchar2,
		p$defaultValue in varchar2
	) return varchar2 RESULT_CACHE
	is
		l$returncd	varchar2(100 char);
	begin
		SELECT STR_VAL INTO l$returncd FROM FCC_COMMONPARAM
		WHERE CLASS_ID = p$class_id AND CODE = p$code;

		RETURN l$returncd;

	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			RETURN p$defaultValue;

		WHEN OTHERS THEN
			RETURN p$defaultValue;
	end;
	-- ===============================================================================
	-- CLASS_ID、CODEに対するNUM_VALの値を取得
	-- 該当するレコードがない場合は、p$defaultValue を返します。
	-- RESULT_CACHEを指定するため同一値を取得する場合はキャッシュが有効になります。
	-- ===============================================================================
	function F_GETNUMVAL_CACHE (
		p$class_id in varchar2,
		p$code	in varchar2,
		p$defaultValue in number
	) return number RESULT_CACHE
	is
		l$returncd	number;
	begin
		SELECT NUM_VAL INTO l$returncd FROM FCC_COMMONPARAM
		WHERE CLASS_ID = p$class_id AND CODE = p$code;

		RETURN l$returncd;

	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			RETURN p$defaultValue;

		WHEN OTHERS THEN
			RETURN p$defaultValue;
	end;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりキーを条件に定数名を検索します。
	-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION KEY2NAME(
		I_GRP_CD IN VARCHAR2,
		I_KEY IN VARCHAR2,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND C_KEY = I_KEY AND LOCALE_CD IS NULL;
		ELSE
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND C_KEY = I_KEY AND LOCALE_CD = I_LCL_CD;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND C_KEY = I_KEY AND LOCALE_CD IS NULL;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END KEY2NAME;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）より文字列型定数値を条件に定数名を検索します。
	-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION STR2NAME(
		I_GRP_CD IN VARCHAR2,
		I_V IN VARCHAR2,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_S = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_S = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_S = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END STR2NAME;

	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）より数値型定数値を条件に定数名を検索します。
	-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION NUM2NAME(
		I_GRP_CD IN VARCHAR2,
		I_V IN NUMBER,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_N = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_N = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_N = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END NUM2NAME;

	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりDATE型定数値を条件に定数名を検索します。
	-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION DT2NAME(
		I_GRP_CD IN VARCHAR2,
		I_V IN DATE,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_D = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_D = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_D = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END DT2NAME;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりTIMESTAMP型定数値を条件に定数名を検索します。
	-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION TS2NAME(
		I_GRP_CD IN VARCHAR2,
		I_V IN TIMESTAMP,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_TS = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_TS = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_TS = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END TS2NAME;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりフラグ型定数値を条件に定数名を検索します。
	-- I_LCL_CDに対応する定数名がない場合はロケールなしの名称を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION FLG2NAME(
		I_GRP_CD IN VARCHAR2,
		I_V IN CHAR,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_F = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_F = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_NAME INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_F = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END FLG2NAME;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりキーを条件に定数備考を検索します。
	-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION KEY2RMRKS(
		I_GRP_CD IN VARCHAR2,
		I_KEY IN VARCHAR2,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND C_KEY = I_KEY AND LOCALE_CD IS NULL;
		ELSE
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND C_KEY = I_KEY AND LOCALE_CD = I_LCL_CD;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND C_KEY = I_KEY AND LOCALE_CD IS NULL;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END KEY2RMRKS;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）より文字列型定数値を条件に定数備考を検索します。
	-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION STR2RMRKS(
		I_GRP_CD IN VARCHAR2,
		I_V IN VARCHAR2,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_S = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_S = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_S = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END STR2RMRKS;

	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）より数値型定数値を条件に定数備考を検索します。
	-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION NUM2RMRKS(
		I_GRP_CD IN VARCHAR2,
		I_V IN NUMBER,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_N = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_N = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_N = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END NUM2RMRKS;

	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりDATE型定数値を条件に定数備考を検索します。
	-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION DT2RMRKS(
		I_GRP_CD IN VARCHAR2,
		I_V IN DATE,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_D = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_D = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_D = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END DT2RMRKS;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりTIMESTAMP型定数値を条件に定数備考を検索します。
	-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION TS2RMRKS(
		I_GRP_CD IN VARCHAR2,
		I_V IN TIMESTAMP,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_TS = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_TS = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_TS = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END TS2RMRKS;
	-- ===============================================================================
	-- 定数名テーブル（FCM_CONST_NM）よりフラグ型定数値を条件に定数備考を検索します。
	-- I_LCL_CDに対応する定数備考がない場合はロケールなしの備考を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION FLG2RMRKS(
		I_GRP_CD IN VARCHAR2,
		I_V IN CHAR,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_F = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
			WHERE C_GRP_CD = I_GRP_CD AND V_F = I_V AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_RMRKS INTO L_NM FROM FCM_CONST_NM
				WHERE C_GRP_CD = I_GRP_CD AND V_F = I_V AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END FLG2RMRKS;
	-- ===============================================================================
	-- 定数グループ名テーブル（FCM_CONST_GRP_NM）より定数グループ名を検索します。
	-- I_LCL_CDに対応する定数グループ名がない場合はロケールなしの名称を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの名称を返します。
	-- ===============================================================================
	FUNCTION GRP_NAME(
		I_GRP_CD IN VARCHAR2,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_GRP_NM INTO L_NM FROM FCM_CONST_GRP_NM
			WHERE C_GRP_CD = I_GRP_CD AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_GRP_NM INTO L_NM FROM FCM_CONST_GRP_NM
			WHERE C_GRP_CD = I_GRP_CD AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_GRP_NM INTO L_NM FROM FCM_CONST_GRP_NM
				WHERE C_GRP_CD = I_GRP_CD AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END GRP_NAME;
	-- ===============================================================================
	-- 定数グループ名テーブル（FCM_CONST_GRP_NM）より定数グループ備考を検索します。
	-- I_LCL_CDに対応する定数グループ備考がない場合はロケールなしの備考を返します。
	-- I_LCL_CDがNULLの場合はロケールなしの備考を返します。
	-- ===============================================================================
	FUNCTION GRP_RMRKS(
		I_GRP_CD IN VARCHAR2,
		I_LCL_CD IN VARCHAR2 DEFAULT NULL
	) RETURN VARCHAR2
	IS
		L_NM VARCHAR2(1000 char);
	BEGIN
		IF I_LCL_CD IS NULL THEN
			SELECT C_GRP_RMRKS INTO L_NM FROM FCM_CONST_GRP_NM
			WHERE C_GRP_CD = I_GRP_CD AND LOCALE_CD IS NULL AND ROWNUM <= 1;
		ELSE
			SELECT C_GRP_RMRKS INTO L_NM FROM FCM_CONST_GRP_NM
			WHERE C_GRP_CD = I_GRP_CD AND LOCALE_CD = I_LCL_CD AND ROWNUM <= 1;
		END IF;
		RETURN L_NM;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			IF I_LCL_CD IS NULL THEN
				RETURN NULL;
			END IF;
			BEGIN
				SELECT C_GRP_RMRKS INTO L_NM FROM FCM_CONST_GRP_NM
				WHERE C_GRP_CD = I_GRP_CD AND LOCALE_CD IS NULL AND ROWNUM <= 1;
				RETURN L_NM;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					RETURN NULL;
			END;
	END GRP_RMRKS;
END;

/
show errors;


