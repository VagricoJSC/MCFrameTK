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
