\encoding UTF-8

CREATE OR REPLACE VIEW mst_mrkt_judg_d_$u(
	mrkt_judg_d_no,
	mrkt_judg_no,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	lot_no,
	sublot_no,
	base_unit_qty,
	base_unit_cd,
	mrkt_judg_src_typ,
	mrkt_judg_src_no,
	vld_dt,
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
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.mrkt_judg_d_no,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.mrkt_judg_no,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.itm_cd,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.itm_sub1,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.itm_sub2,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.itm_sub3,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.lot_no,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.sublot_no,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.base_unit_qty,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.base_unit_cd,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.mrkt_judg_src_typ,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.mrkt_judg_src_no,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.vld_dt,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.sub_char1,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.sub_char2,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.sub_char3,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.ins_usr_id,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.ins_usr_nm,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.ins_ts,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.ins_func_id,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.upd_cntr,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.upd_usr_id,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.upd_usr_nm,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.upd_ts,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.upd_func_id,
	mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.upd_srv_req_no
FROM
	mst_mrkt_judg_d_all mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org
WHERE
	0 = 0
	AND mst_mrkt_judg_d_$u_mst_mrkt_judg_d_all_org.co_cd = fcpa_context$f_get_co_cd()
;

