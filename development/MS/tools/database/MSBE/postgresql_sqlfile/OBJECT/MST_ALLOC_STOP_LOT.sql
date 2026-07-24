\encoding UTF-8

CREATE OR REPLACE VIEW mst_alloc_stop_lot(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	lot_no,
	sublot_no,
	stop_dt,
	stop_usr_cd,
	stop_rmrks,
	rel_dt,
	rel_usr_cd,
	rel_rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no
	)
AS
SELECT
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.itm_cd,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.itm_sub1,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.itm_sub2,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.itm_sub3,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.lot_no,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.sublot_no,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.stop_dt,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.stop_usr_cd,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.stop_rmrks,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.rel_dt,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.rel_usr_cd,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.rel_rmrks,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.sub_char1,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.sub_char2,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.sub_char3,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.ins_usr_id,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.ins_usr_nm,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.ins_ts,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.ins_func_id,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.upd_cntr,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.upd_usr_id,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.upd_usr_nm,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.upd_ts,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.upd_func_id,
	mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.upd_srv_req_no
FROM
	mst_alloc_stop_lot_all mst_alloc_stop_lot_mst_alloc_stop_lot_all_org
WHERE
	0 = 0
	AND mst_alloc_stop_lot_mst_alloc_stop_lot_all_org.co_cd = (SELECT co_cd FROM fct_context mst_alloc_stop_lot_fct_context WHERE pid = pg_backend_pid())
;

