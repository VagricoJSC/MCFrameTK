SET SQLBLANKLINES ON

CREATE OR REPLACE VIEW MAVM_LG_GRP_IF_ALL(
	CO_CD,
	LG_GRP_CD,
	LG_GRP_NM,
	LG_GRP_NM_LCL1,
	LG_GRP_NM_LCL2,
	LG_GRP_NM_LCL3,
	LG_GRP_NM_LCL4,
	LG_GRP_NM_LCL5,
	MEMO1,
	MEMO2,
	MEMO3
)
AS
SELECT
	--会社ＣＤ
	T1.CO_CD,
	--物流グループＣＤ
	T1.LG_GRP_CD,
	--物流グループ名
	T1.LG_GRP_NM,
	--物流グループ名（ロケール１）
	T1.LG_GRP_NM_LCL1,
	--物流グループ名（ロケール２）
	T1.LG_GRP_NM_LCL2,
	--物流グループ名（ロケール３）
	T1.LG_GRP_NM_LCL3,
	--物流グループ名（ロケール４）
	T1.LG_GRP_NM_LCL4,
	--物流グループ名（ロケール５）
	T1.LG_GRP_NM_LCL5,
	T1.MEMO1,
	T1.MEMO2,
	T1.MEMO3
FROM MAVM_LG_GRP_MST T1
;

