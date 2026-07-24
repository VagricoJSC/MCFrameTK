CREATE OR REPLACE PACKAGE BODY MST_DW_PO
IS
	-- =========================================================================
	-- HST_IDを基準にしてそのHST_ID時点の全データを取得する。
	-- =========================================================================
	FUNCTION GET_DATA_BY_HST_ID (
		I_HST_ID NUMBER
	)
	RETURN INSTANCE_COL_LIST PIPELINED
	IS
		-- 対象データを取得するカーソル。
		CURSOR cur IS
			SELECT
				DS1.PO_NO PO_NO,
				DS1.CO_CD CO_CD,
				DS1.PO_REV REV_NO,
				DS1.HST_ID DS1_HST_ID,
				DS1.HST_TYPE DS1_HST_TYPE,
				FCPA_DEFW.F_MAKE_INSTANCE_ID(
					FCPA_DEFW.F_DEFW_STR_TO_CHAR(DS1.PO_NO),
					FCPA_DEFW.F_DEFW_STR_TO_CHAR(DS1.CO_CD)
				) DS1_SURROGATE,
				DS2.HST_ID DS2_HST_ID,
				DS2.HST_TYPE DS2_HST_TYPE,
				FCPA_DEFW.F_MAKE_INSTANCE_ID(
					FCPA_DEFW.F_DEFW_STR_TO_CHAR(DS2.PO_D_NO),
					FCPA_DEFW.F_DEFW_STR_TO_CHAR(DS2.CO_CD)
				) DS2_SURROGATE
			FROM
				TABLE(MST_PO_ALL_R_PA.GET_BY_HST_ID(I_HST_ID)) DS1,
				TABLE(MST_PO_D_ALL_R_PA.GET_BY_HST_ID(I_HST_ID)) DS2
			WHERE
				DS1.PO_NO = DS2.PO_NO(+) AND
				DS1.CO_CD = DS2.CO_CD(+)
			;
		W_REC INSTANCE_COL;
	BEGIN
		OPEN cur;
		LOOP
			FETCH cur INTO W_REC;
			EXIT WHEN cur%NOTFOUND;
			PIPE ROW(W_REC);
		END LOOP;
		CLOSE cur;
		RETURN;
	END;

	-- =========================================================================
	-- トランザクションで更新された実態IDを求める
	-- =========================================================================
	FUNCTION GET_UPDATED_KEY(
		I_HST_ID NUMBER
	)
	RETURN KEY_LIST PIPELINED
	IS
		CURSOR cur IS
			SELECT
				DISTINCT
				PO_NO,
				CO_CD
			FROM
				TABLE(FCPA_DEFW.GET_HST_ID_BY_TRANSACTION()) HSTIDS,
				TABLE(GET_DATA_BY_HST_ID(I_HST_ID)) DATA
			WHERE
				HSTIDS.HST_ID = DATA.DS1_HST_ID OR
				HSTIDS.HST_ID = DATA.DS2_HST_ID
			;
		W_REC KEY_COL;
	BEGIN
		OPEN cur;
		LOOP
			FETCH cur INTO W_REC;
			EXIT WHEN cur%NOTFOUND;
			PIPE ROW(W_REC);
		END LOOP;
		CLOSE cur;
		RETURN;
	END;

	-- =========================================================================
	-- トランザクションで更新された実態明細を取得する
	-- =========================================================================
	PROCEDURE P_UPDATED_DATA(
		I_HST_ID IN NUMBER
	)
	IS
		CURSOR cur IS
			SELECT
				FCPA_DEFW.F_MAKE_INSTANCE_ID(
					FCPA_DEFW.F_DEFW_STR_TO_CHAR(DATA.PO_NO),
					FCPA_DEFW.F_DEFW_STR_TO_CHAR(DATA.CO_CD)
				) INSTANCE_ID,
				DATA.REV_NO,
				DATA.DS1_HST_ID DS01_HST_ID,
				DATA.DS1_HST_TYPE DS01_HST_TYPE,
				DATA.DS1_SURROGATE DS01_SURROGATE,
				DATA.DS2_HST_ID DS02_HST_ID,
				DATA.DS2_HST_TYPE DS02_HST_TYPE,
				DATA.DS2_SURROGATE DS02_SURROGATE,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null,
				0,
				null,
				null
			FROM
				TABLE(GET_DATA_BY_HST_ID(I_HST_ID)) DATA,
				TABLE(GET_UPDATED_KEY(I_HST_ID)) KEYS
			WHERE
				DATA.PO_NO = KEYS.PO_NO AND
				DATA.CO_CD = KEYS.CO_CD
			ORDER BY
				INSTANCE_ID
			;
		W_REC FCPA_DEFW.DEFW_UPDATED_DATA;
		I NUMBER := 1;
	BEGIN
		OPEN cur;
		LOOP
			FETCH cur INTO W_REC;
			EXIT WHEN cur%NOTFOUND;
			FCPA_DEFW.V_DEFW_UPDATED_DATA_LIST(I) := W_REC;
			I := I + 1;
		END LOOP;
		CLOSE cur;
	END;

	-- =========================================================================
	-- 指定されたインスタンスID・リビジョンのデータを取得する
	-- =========================================================================
	FUNCTION GET_DATA (
		I_INSTANCE_ID VARCHAR2,
		I_REV_NO NUMBER
	)
	RETURN BASE_LIST PIPELINED
	IS
		CURSOR cur IS
			SELECT
				DS1.PO_NO PO_NO,
				DS1.CO_CD CO_CD,
				DS1.PO_REV PO_REV,
				DS1.HST_ID DS1_HST_ID,
				DS1.HST_TYPE DS1_HST_TYPE,
				DS1.DATA_STATUS DS1_DATA_STATUS,
				DS2.HST_ID DS2_HST_ID,
				DS2.HST_TYPE DS2_HST_TYPE,
				DS2.DATA_STATUS DS2_DATA_STATUS
			FROM
				(SELECT * FROM TABLE(MST_PO_ALL_R_PA.GET_BY_DEFW_REV(I_INSTANCE_ID, I_REV_NO, FCPA_DEFW.GET_INSTANCE_DETAIL_TABLE_NAME('MST_DW_PO')))) DS1,
				(SELECT * FROM TABLE(MST_PO_D_ALL_R_PA.GET_BY_DEFW_REV(I_INSTANCE_ID, I_REV_NO, FCPA_DEFW.GET_INSTANCE_DETAIL_TABLE_NAME('MST_DW_PO')))) DS2
			WHERE
				DS1.PO_NO = DS2.PO_NO(+) AND
				DS1.CO_CD = DS2.CO_CD(+)
			;
		W_REC BASE_ROW;
	BEGIN
		OPEN cur;
		LOOP
			FETCH cur INTO W_REC;
			EXIT WHEN cur%NOTFOUND;
			PIPE ROW(W_REC);
		END LOOP;
		CLOSE cur;
		RETURN;
	END;

	-- =========================================================================
	-- データソースの情報を取得する
	-- =========================================================================
	PROCEDURE GET_DATA_SOURCE_INFO
	IS
	BEGIN
		FCPA_DEFW.V_DEFW_DATA_SOURCE_INFO.DATASOURCE_COUNT := 2;
		FCPA_DEFW.V_DEFW_DATA_SOURCE_INFO.DS01_TABLE_NAME := 'MST_PO_ALL';
		FCPA_DEFW.V_DEFW_DATA_SOURCE_INFO.DS01_HST_TABLE_NAME := 'MST_PO_ALL_R';
		FCPA_DEFW.V_DEFW_DATA_SOURCE_INFO.DS01_ALIASE_NAME := 'DS1';
		FCPA_DEFW.V_DEFW_DATA_SOURCE_INFO.DS02_TABLE_NAME := 'MST_PO_D_ALL';
		FCPA_DEFW.V_DEFW_DATA_SOURCE_INFO.DS02_HST_TABLE_NAME := 'MST_PO_D_ALL_R';
		FCPA_DEFW.V_DEFW_DATA_SOURCE_INFO.DS02_ALIASE_NAME := 'DS2';
	END;
END;
/
