\encoding UTF-8

CREATE OR REPLACE VIEW mst_lot_list_$u(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	lot_no,
	sublot_no,
	lot_tbl_sublot_no,
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
	mst_lot_list_$u_mst_lot_list_all_org.itm_cd,
	mst_lot_list_$u_mst_lot_list_all_org.itm_sub1,
	mst_lot_list_$u_mst_lot_list_all_org.itm_sub2,
	mst_lot_list_$u_mst_lot_list_all_org.itm_sub3,
	mst_lot_list_$u_mst_lot_list_all_org.lot_no,
	mst_lot_list_$u_mst_lot_list_all_org.sublot_no,
	mst_lot_list_$u_mst_lot_list_all_org.lot_tbl_sublot_no,
	mst_lot_list_$u_mst_lot_list_all_org.ins_usr_id,
	mst_lot_list_$u_mst_lot_list_all_org.ins_usr_nm,
	mst_lot_list_$u_mst_lot_list_all_org.ins_ts,
	mst_lot_list_$u_mst_lot_list_all_org.ins_func_id,
	mst_lot_list_$u_mst_lot_list_all_org.upd_cntr,
	mst_lot_list_$u_mst_lot_list_all_org.upd_usr_id,
	mst_lot_list_$u_mst_lot_list_all_org.upd_usr_nm,
	mst_lot_list_$u_mst_lot_list_all_org.upd_ts,
	mst_lot_list_$u_mst_lot_list_all_org.upd_func_id,
	mst_lot_list_$u_mst_lot_list_all_org.upd_srv_req_no
FROM
	mst_lot_list_all mst_lot_list_$u_mst_lot_list_all_org
WHERE
	0 = 0
	AND mst_lot_list_$u_mst_lot_list_all_org.co_cd = fcpa_context$f_get_co_cd()
;

