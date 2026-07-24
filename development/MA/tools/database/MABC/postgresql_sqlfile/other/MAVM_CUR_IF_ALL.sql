\encoding UTF-8

CREATE OR REPLACE VIEW mavm_cur_if_all(
co_cd,
cur_cd,
cur_nm,
cur_nm_lcl1,
cur_nm_lcl2,
cur_nm_lcl3,
cur_nm_lcl4,
cur_nm_lcl5,
memo1,
memo2,
memo3
)
AS
SELECT
	--会社ＣＤ
	mavm_cur_if_all_mavm_cur_mst_t1.co_cd,
	--通貨ＣＤ
	mavm_cur_if_all_mavm_cur_mst_t1.cur_cd,
	--通貨名
	mavm_cur_if_all_mavm_cur_mst_t1.cur_nm,
	--通貨名（ロケール１）
	mavm_cur_if_all_mavm_cur_mst_t1.cur_nm_lcl1,
	--通貨名（ロケール２）
	mavm_cur_if_all_mavm_cur_mst_t1.cur_nm_lcl2,
	--通貨名（ロケール３）
	mavm_cur_if_all_mavm_cur_mst_t1.cur_nm_lcl3,
	--通貨名（ロケール４）
	mavm_cur_if_all_mavm_cur_mst_t1.cur_nm_lcl4,
	--通貨名（ロケール５）
	mavm_cur_if_all_mavm_cur_mst_t1.cur_nm_lcl5,
	mavm_cur_if_all_mavm_cur_mst_t1.memo1,
	mavm_cur_if_all_mavm_cur_mst_t1.memo2,
	mavm_cur_if_all_mavm_cur_mst_t1.memo3
FROM mavm_cur_mst mavm_cur_if_all_mavm_cur_mst_t1
;;

