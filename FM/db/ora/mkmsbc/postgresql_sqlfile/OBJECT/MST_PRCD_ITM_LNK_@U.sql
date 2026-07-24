\encoding UTF-8

CREATE OR REPLACE VIEW mst_prcd_itm_lnk_$u(
	itm_ord_no,
	par_itm_ord_no,
	par_oper_ord_no,
	sim_mrp_no,
	oper_ptn,
	oper_cd,
	oper_seq,
	wg_cd,
	intr_rmrks,
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
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.itm_ord_no,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.par_itm_ord_no,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.par_oper_ord_no,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.sim_mrp_no,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.oper_ptn,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.oper_cd,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.oper_seq,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.wg_cd,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.intr_rmrks,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.sub_char1,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.sub_char2,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.sub_char3,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.ins_usr_id,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.ins_usr_nm,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.ins_ts,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.ins_func_id,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.upd_cntr,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.upd_usr_id,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.upd_usr_nm,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.upd_ts,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.upd_func_id,
	mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.upd_srv_req_no
FROM
	mst_prcd_itm_lnk_all mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org
WHERE
	0 = 0
	AND mst_prcd_itm_lnk_$u_mst_prcd_itm_lnk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

