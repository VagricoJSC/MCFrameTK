\encoding UTF-8

CREATE OR REPLACE VIEW mavm_wg_if_all(
co_cd,
wg_cd,
wg_nm,
wg_nm_lcl1,
wg_nm_lcl2,
wg_nm_lcl3,
wg_nm_lcl4,
wg_nm_lcl5,
memo1,
memo2,
memo3
)
AS
SELECT
	--会社ＣＤ
	mavm_wg_if_all_mavm_wg_mst_t1.co_cd,
	--ワーキンググループＣＤ
	mavm_wg_if_all_mavm_wg_mst_t1.wg_cd,
	--ワーキンググループ名
	mavm_wg_if_all_mavm_wg_mst_t1.wg_nm,
	--ワーキンググループ名（ロケール１）
	mavm_wg_if_all_mavm_wg_mst_t1.wg_nm_lcl1,
	--ワーキンググループ名（ロケール２）
	mavm_wg_if_all_mavm_wg_mst_t1.wg_nm_lcl2,
	--ワーキンググループ名（ロケール３）
	mavm_wg_if_all_mavm_wg_mst_t1.wg_nm_lcl3,
	--ワーキンググループ名（ロケール４）
	mavm_wg_if_all_mavm_wg_mst_t1.wg_nm_lcl4,
	--ワーキンググループ名（ロケール５）
	mavm_wg_if_all_mavm_wg_mst_t1.wg_nm_lcl5,
	mavm_wg_if_all_mavm_wg_mst_t1.memo1,
	mavm_wg_if_all_mavm_wg_mst_t1.memo2,
	mavm_wg_if_all_mavm_wg_mst_t1.memo3
FROM mavm_wg_mst mavm_wg_if_all_mavm_wg_mst_t1
;;

