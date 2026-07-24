\encoding UTF-8

CREATE OR REPLACE VIEW mavm_ac_rsn_if_all(
co_cd,
ac_rsn_cd,
ac_rsn_nm,
ac_rsn_nm_lcl1,
ac_rsn_nm_lcl2,
ac_rsn_nm_lcl3,
ac_rsn_nm_lcl4,
ac_rsn_nm_lcl5,
ar_typ,
ap_typ,
ac_invalid_flg,
cost_invalid_flg,
memo1,
memo2,
memo3
)
AS
SELECT
	--会社ＣＤ
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.co_cd,
	--会計理由ＣＤ
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ac_rsn_cd,
	--会計理由名
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ac_rsn_nm,
	--会計理由名（ロケール１）
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ac_rsn_nm_lcl1,
	--会計理由名（ロケール２） 
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ac_rsn_nm_lcl2,
	--会計理由名（ロケール３） 
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ac_rsn_nm_lcl3,	
	--会計理由名（ロケール４） 
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ac_rsn_nm_lcl4,	
	--会計理由名（ロケール５） 
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ac_rsn_nm_lcl5,
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ar_typ,
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ap_typ,
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.ac_invalid_flg,
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.cost_invalid_flg,
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.memo1,
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.memo2,
	mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1.memo3
FROM mavm_ac_rsn_mst mavm_ac_rsn_if_all_mavm_ac_rsn_mst_t1 
;;

