SET SQLBLANKLINES ON

CREATE OR REPLACE VIEW MAVM_STR_LN_IF_ALL(
	CO_CD,
	LOC_CD,
	STR_LN_CD,
	STR_LN_NM,
	STR_LN_NM_LCL1,
	STR_LN_NM_LCL2,
	STR_LN_NM_LCL3,
	STR_LN_NM_LCL4,
	STR_LN_NM_LCL5,
	LN_FLG,
	MEMO1,
	MEMO2,
	MEMO3
)
AS
SELECT
	--会社ＣＤ
	T1.CO_CD,
	--場所ＣＤ
	T1.LOC_CD,
	--棚・ラインＣＤ
	T1.STR_LN_CD,
	--棚・ライン名
	T1.STR_LN_NM,
	--棚・ライン名（ロケール１）
	T1.STR_LN_NM_LCL1,
	--棚・ライン名（ロケール２）
	T1.STR_LN_NM_LCL2,
	--棚・ライン名（ロケール３）
	T1.STR_LN_NM_LCL3,
	--棚・ライン名（ロケール４）
	T1.STR_LN_NM_LCL4,
	--棚・ライン名（ロケール５）
	T1.STR_LN_NM_LCL5,
	--ラインＦＬＧ
	T1.LN_FLG,
	T1.MEMO1,
	T1.MEMO2,
	T1.MEMO3
FROM MAVM_STR_LN_MST T1
;

