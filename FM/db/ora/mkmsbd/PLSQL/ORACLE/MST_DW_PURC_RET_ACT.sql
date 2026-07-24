CREATE OR REPLACE PACKAGE MST_DW_PURC_RET_ACT
IS
	-- =========================================================================
	-- カラム定義
	-- =========================================================================
	TYPE BASE_ROW IS RECORD (
		PURC_RET_ACT_NO VARCHAR2(15 CHAR),
		CO_CD VARCHAR2(10 CHAR),
		PURC_RET_ACT_REV NUMBER(4,0),
		DS1_HST_ID NUMBER(24,0),
		DS1_HST_TYPE VARCHAR2(2 CHAR),
		DS1_DATA_STATUS NUMBER(2),
		DS2_HST_ID NUMBER(24,0),
		DS2_HST_TYPE VARCHAR2(2 CHAR),
		DS2_DATA_STATUS NUMBER(2),
		DS3_HST_ID NUMBER(24,0),
		DS3_HST_TYPE VARCHAR2(2 CHAR),
		DS3_DATA_STATUS NUMBER(2)
	);
	TYPE BASE_LIST IS TABLE OF BASE_ROW;

	-- =========================================================================
	-- 実態明細カラム定義
	-- =========================================================================
	TYPE INSTANCE_COL IS RECORD (
		PURC_RET_ACT_NO VARCHAR2(15 CHAR),
		CO_CD VARCHAR2(10 CHAR),
		REV_NO NUMBER(15),
		DS1_HST_ID NUMBER(24,0),
		DS1_HST_TYPE VARCHAR2(2 CHAR),
		DS1_SURROGATE VARCHAR2(32 CHAR),
		DS2_HST_ID NUMBER(24,0),
		DS2_HST_TYPE VARCHAR2(2 CHAR),
		DS2_SURROGATE VARCHAR2(32 CHAR),
		DS3_HST_ID NUMBER(24,0),
		DS3_HST_TYPE VARCHAR2(2 CHAR),
		DS3_SURROGATE VARCHAR2(32 CHAR)
	);
	TYPE INSTANCE_COL_LIST IS TABLE OF INSTANCE_COL;

	-- =========================================================================
	-- キーカラム定義
	-- =========================================================================
	TYPE KEY_COL IS RECORD (
		PURC_RET_ACT_NO VARCHAR2(15 CHAR),
		CO_CD VARCHAR2(10 CHAR)
	);
	TYPE KEY_LIST IS TABLE OF KEY_COL;

	-- =========================================================================
	-- HST_IDを基準にしてそのHST_ID時点の全データを取得する。
	-- =========================================================================
	FUNCTION GET_DATA_BY_HST_ID (
		I_HST_ID NUMBER
	)
	RETURN INSTANCE_COL_LIST PIPELINED;

	-- =========================================================================
	-- トランザクションで更新された実態IDを求める
	-- =========================================================================
	FUNCTION GET_UPDATED_KEY(
		I_HST_ID NUMBER
	)
	RETURN KEY_LIST PIPELINED;

	-- =========================================================================
	-- トランザクションで更新された実態明細を取得する
	-- =========================================================================
	PROCEDURE P_UPDATED_DATA(
		I_HST_ID IN NUMBER
	);

	-- =========================================================================
	-- 指定されたインスタンスID・リビジョンのデータを取得する
	-- =========================================================================
	FUNCTION GET_DATA (
		I_INSTANCE_ID VARCHAR2,
		I_REV_NO NUMBER
	)
	RETURN BASE_LIST PIPELINED;

	-- =========================================================================
	-- データソースの情報を取得する
	-- =========================================================================
	PROCEDURE GET_DATA_SOURCE_INFO;
END;
/
