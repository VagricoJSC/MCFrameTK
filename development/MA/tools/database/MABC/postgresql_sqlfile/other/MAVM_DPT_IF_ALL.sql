\encoding UTF-8

CREATE OR REPLACE VIEW mavm_dpt_if_all(
co_cd,
dpt_cd,
st_dt,
end_dt,
dpt_nm,
dpt_nm_lcl1,
dpt_nm_lcl2,
dpt_nm_lcl3,
dpt_nm_lcl4,
dpt_nm_lcl5,
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
WITH mavm_wg_mst_w AS (
	SELECT * FROM mavm_wg_mst
)
SELECT
	--会社ＣＤ
	mavm_dpt_if_all_mavm_dpt_mst_t1.co_cd,
	--部門ＣＤ
	mavm_dpt_if_all_mavm_dpt_mst_t1.dpt_cd,
	--適用開始日
	mavm_dpt_if_all_mavm_dpt_mst_t1.st_dt,
	--適用終了日
	mavm_dpt_if_all_mavm_dpt_mst_t1.end_dt,
	--部門名
	mavm_dpt_if_all_mavm_dpt_mst_t1.dpt_nm,
	--部門名（ロケール１）
	mavm_dpt_if_all_mavm_dpt_mst_t1.dpt_nm_lcl1,
	--部門名（ロケール２）
	mavm_dpt_if_all_mavm_dpt_mst_t1.dpt_nm_lcl2,
	--部門名（ロケール３）
	mavm_dpt_if_all_mavm_dpt_mst_t1.dpt_nm_lcl3,
	--部門名（ロケール４）
	mavm_dpt_if_all_mavm_dpt_mst_t1.dpt_nm_lcl4,
	--部門名（ロケール５）
	mavm_dpt_if_all_mavm_dpt_mst_t1.dpt_nm_lcl5,
	--ワーキンググループ名
	(SELECT mavm_dpt_if_all_mavm_wg_mst_w_t.wg_nm
		FROM mavm_wg_mst_w mavm_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.wg_cd
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.co_cd
	)	wg_nm,
	--ワーキンググループ名（ロケール１）
	(SELECT mavm_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl1
		FROM mavm_wg_mst_w mavm_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.wg_cd
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.co_cd
	)	wg_nm_lcl1,
	--ワーキンググループ名（ロケール２）
	(SELECT mavm_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl2
		FROM mavm_wg_mst_w mavm_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.wg_cd
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.co_cd
	)	wg_nm_lcl2,
	--ワーキンググループ名（ロケール３）
	(SELECT mavm_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl3
		FROM mavm_wg_mst_w mavm_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.wg_cd
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.co_cd
	)	wg_nm_lcl3,
	--ワーキンググループ名（ロケール４）
	(SELECT mavm_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl4
		FROM mavm_wg_mst_w mavm_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.wg_cd
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.co_cd
	)	wg_nm_lcl4,
	--ワーキンググループ名（ロケール５）
	(SELECT mavm_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl5
		FROM mavm_wg_mst_w mavm_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.wg_cd
		AND mavm_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_dpt_if_all_mavm_dpt_mst_t1.co_cd
	)	wg_nm_lcl5,
	mavm_dpt_if_all_mavm_dpt_mst_t1.memo1,
	mavm_dpt_if_all_mavm_dpt_mst_t1.memo2,
	mavm_dpt_if_all_mavm_dpt_mst_t1.memo3
FROM mavm_dpt_mst mavm_dpt_if_all_mavm_dpt_mst_t1
;;

