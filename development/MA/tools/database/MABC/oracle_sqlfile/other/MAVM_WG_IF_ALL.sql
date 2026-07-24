SET SQLBLANKLINES ON

CREATE OR REPLACE VIEW MAVM_WG_IF_ALL(
	CO_CD,
	WG_CD,
	WG_NM,
	WG_NM_LCL1,
	WG_NM_LCL2,
	WG_NM_LCL3,
	WG_NM_LCL4,
	WG_NM_LCL5,
	MEMO1,
	MEMO2,
	MEMO3
)
AS
SELECT
	--会社ＣＤ
	T1.CO_CD,
	--ワーキンググループＣＤ
	T1.WG_CD,
	--ワーキンググループ名
	T1.WG_NM,
	--ワーキンググループ名（ロケール１）
	T1.WG_NM_LCL1,
	--ワーキンググループ名（ロケール２）
	T1.WG_NM_LCL2,
	--ワーキンググループ名（ロケール３）
	T1.WG_NM_LCL3,
	--ワーキンググループ名（ロケール４）
	T1.WG_NM_LCL4,
	--ワーキンググループ名（ロケール５）
	T1.WG_NM_LCL5,
	T1.MEMO1,
	T1.MEMO2,
	T1.MEMO3
FROM MAVM_WG_MST T1
;

