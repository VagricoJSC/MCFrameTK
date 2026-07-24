\encoding UTF-8

CREATE OR REPLACE VIEW mavm_unit_if_all(
co_cd,
unit_cd,
unit_nm,
unit_nm_lcl1,
unit_nm_lcl2,
unit_nm_lcl3,
unit_nm_lcl4,
unit_nm_lcl5,
dec_place,
rnd_typ,
memo1,
memo2,
memo3
)
AS
SELECT
	--会社ＣＤ
	mavm_unit_if_all_mavm_unit_mst_t1.co_cd,
	--単位ＣＤ
	mavm_unit_if_all_mavm_unit_mst_t1.unit_cd,
	--単位名
	mavm_unit_if_all_mavm_unit_mst_t1.unit_nm,
	--単位名（ロケール１）
	mavm_unit_if_all_mavm_unit_mst_t1.unit_nm_lcl1,
	--単位名（ロケール２）
	mavm_unit_if_all_mavm_unit_mst_t1.unit_nm_lcl2,
	--単位名（ロケール３）
	mavm_unit_if_all_mavm_unit_mst_t1.unit_nm_lcl3,
	--単位名（ロケール４）
	mavm_unit_if_all_mavm_unit_mst_t1.unit_nm_lcl4,
	--単位名（ロケール５）h
	mavm_unit_if_all_mavm_unit_mst_t1.unit_nm_lcl5,
	mavm_unit_if_all_mavm_unit_mst_t1.dec_place,
	mavm_unit_if_all_mavm_unit_mst_t1.rnd_typ,
	mavm_unit_if_all_mavm_unit_mst_t1.memo1,
	mavm_unit_if_all_mavm_unit_mst_t1.memo2,
	mavm_unit_if_all_mavm_unit_mst_t1.memo3
FROM mavm_unit_mst mavm_unit_if_all_mavm_unit_mst_t1 
;;

