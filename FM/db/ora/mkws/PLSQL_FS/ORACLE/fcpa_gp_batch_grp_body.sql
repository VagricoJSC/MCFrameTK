CREATE OR REPLACE PACKAGE BODY FCPA_GP_BATCH_GRP
-- ==============================================================================
-- 機能      汎用バッチ処理グループ管理
-- 作成者    S.SUZUKI
-- 作成日付  2016-07-27
-- 改版履歴  2016-07-27 S.SUZUKI 初版作成
----
-- バージョン:6.4.0
-- ==============================================================================
IS
	-- ===============================================================================
	-- ログインロケール名称を取得する
	-- ===============================================================================
	FUNCTION F_GET_GP_BATCH_GRP_NM(
		GP_BATCH_GRP IN VARCHAR2
	)
	RETURN VARCHAR2 IS
	BEGIN
  		RETURN F_GET_GP_BATCH_GRP_NM(GP_BATCH_GRP, FCPA_CONTEXT.F_GET_LOCALE);
	END;
	-- ===============================================================================
	-- ロケール別名称を取得する
	-- ===============================================================================
	FUNCTION F_GET_GP_BATCH_GRP_NM(
		GP_BATCH_GRP IN VARCHAR2 ,
		LCL IN VARCHAR2
	)
	RETURN VARCHAR2 IS
		RTN VARCHAR2(100 CHAR);
	BEGIN
		SELECT
			M.GP_BATCH_GRP_NM
		INTO
			RTN
		FROM
			FCM_GP_BATCH_GRP_LCL_ALL M
		WHERE
			M.GP_BATCH_GRP_CD = GP_BATCH_GRP
			AND M.LCL_CD = LCL
			AND M.CO_CD = FCPA_CONTEXT.F_GET_CO_CD;
  		RETURN RTN;
	END;
	-- ===============================================================================
	-- 汎用バッチ処理グループを登録する
	-- ===============================================================================
	PROCEDURE ADD_GP_BATCH_GRP(
		GP_BATCH_GRP_CD IN VARCHAR2 ,
		GP_BATCH_GRP_NM IN VARCHAR2 ,
		MODULE_ID IN VARCHAR2,
		LOGIC_ID IN VARCHAR2,
		FUNC_TYP IN VARCHAR2
	)IS
	BEGIN
		INSERT INTO FCM_GP_BATCH_GRP_ALL (GP_BATCH_GRP_CD, CO_CD, GP_BATCH_GRP_NM, MODULE_ID, LOGIC_ID, FUNC_TYP)
		VALUES (GP_BATCH_GRP_CD, FCPA_CONTEXT.F_GET_CO_CD, GP_BATCH_GRP_NM, MODULE_ID, LOGIC_ID, FUNC_TYP);
	END ;
END;
/

