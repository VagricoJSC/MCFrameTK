\encoding UTF-8

CREATE OR REPLACE VIEW mavm_lg_grp_if_all(
co_cd,
lg_grp_cd,
lg_grp_nm,
lg_grp_nm_lcl1,
lg_grp_nm_lcl2,
lg_grp_nm_lcl3,
lg_grp_nm_lcl4,
lg_grp_nm_lcl5,
memo1,
memo2,
memo3
)
AS
SELECT
	--会社ＣＤ
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.co_cd,
	--物流グループＣＤ
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.lg_grp_cd,
	--物流グループ名
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.lg_grp_nm,
	--物流グループ名（ロケール１）
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.lg_grp_nm_lcl1,
	--物流グループ名（ロケール２）
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.lg_grp_nm_lcl2,
	--物流グループ名（ロケール３）
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.lg_grp_nm_lcl3,
	--物流グループ名（ロケール４）
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.lg_grp_nm_lcl4,
	--物流グループ名（ロケール５）
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.lg_grp_nm_lcl5,
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.memo1,
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.memo2,
	mavm_lg_grp_if_all_mavm_lg_grp_mst_t1.memo3
FROM mavm_lg_grp_mst mavm_lg_grp_if_all_mavm_lg_grp_mst_t1 
;;

