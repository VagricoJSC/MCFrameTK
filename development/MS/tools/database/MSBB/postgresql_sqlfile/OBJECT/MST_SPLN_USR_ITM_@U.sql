\encoding UTF-8

CREATE OR REPLACE VIEW mst_spln_usr_itm_$u(
	usr_cd,
	ym,
	dpt_cd,
	cst_cd,
	wrk_no,
	spln_itm_cd,
	cur_cd,
	spln_ym,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	spln_qty,
	spln_amt,
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
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.usr_cd,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.ym,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.dpt_cd,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.cst_cd,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.wrk_no,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.spln_itm_cd,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.cur_cd,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.spln_ym,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.itm_cd,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.itm_sub1,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.itm_sub2,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.itm_sub3,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.spln_qty,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.spln_amt,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.ins_usr_id,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.ins_usr_nm,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.ins_ts,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.ins_func_id,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.upd_cntr,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.upd_usr_id,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.upd_usr_nm,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.upd_ts,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.upd_func_id,
	mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.upd_srv_req_no
FROM
	mst_spln_usr_itm_all mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org
WHERE
	0 = 0
	AND mst_spln_usr_itm_$u_mst_spln_usr_itm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

