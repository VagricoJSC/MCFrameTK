\encoding UTF-8

CREATE OR REPLACE VIEW mavm_tax_if_all(
co_cd,
tax_cd,
tax_nm,
tax_nm_lcl1,
tax_nm_lcl2,
tax_nm_lcl3,
tax_nm_lcl4,
tax_nm_lcl5,
tax_typ,
inc_tax_flg,
tax_rate,
sls_flg,
purc_flg,
prov_flg,
memo1,
memo2,
memo3
)
AS
SELECT
	--会社ＣＤ
	mavm_tax_if_all_mavm_tax_mst_t1.co_cd,
	--税ＣＤ
	mavm_tax_if_all_mavm_tax_mst_t1.tax_cd,
	--税名
	mavm_tax_if_all_mavm_tax_mst_t1.tax_nm,
	--税名（ロケール１）
	mavm_tax_if_all_mavm_tax_mst_t1.tax_nm_lcl1,
	--税名（ロケール２）
	mavm_tax_if_all_mavm_tax_mst_t1.tax_nm_lcl2,
	--税名（ロケール３）
	mavm_tax_if_all_mavm_tax_mst_t1.tax_nm_lcl3,
	--税名（ロケール４）
	mavm_tax_if_all_mavm_tax_mst_t1.tax_nm_lcl4,
	--税名（ロケール５）
	mavm_tax_if_all_mavm_tax_mst_t1.tax_nm_lcl5,
	mavm_tax_if_all_mavm_tax_mst_t1.tax_typ,
	mavm_tax_if_all_mavm_tax_mst_t1.inc_tax_flg,
	mavm_tax_if_all_mavm_tax_mst_t1.tax_rate,
	mavm_tax_if_all_mavm_tax_mst_t1.sls_flg,
	mavm_tax_if_all_mavm_tax_mst_t1.purc_flg,
	mavm_tax_if_all_mavm_tax_mst_t1.prov_flg,
	mavm_tax_if_all_mavm_tax_mst_t1.memo1,
	mavm_tax_if_all_mavm_tax_mst_t1.memo2,
	mavm_tax_if_all_mavm_tax_mst_t1.memo3
FROM mavm_tax_mst mavm_tax_if_all_mavm_tax_mst_t1 
;;

