\encoding UTF-8

CREATE OR REPLACE VIEW mst_ship_lot_ex_$u(
	cst_cd,
	dlv_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
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
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.cst_cd,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.dlv_cd,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.itm_cd,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.itm_sub1,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.itm_sub2,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.itm_sub3,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.ins_usr_id,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.ins_usr_nm,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.ins_ts,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.ins_func_id,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.upd_cntr,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.upd_usr_id,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.upd_usr_nm,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.upd_ts,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.upd_func_id,
	mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.upd_srv_req_no
FROM
	mst_ship_lot_ex_all mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org
WHERE
	0 = 0
	AND mst_ship_lot_ex_$u_mst_ship_lot_ex_all_org.co_cd = fcpa_context$f_get_co_cd()
;

