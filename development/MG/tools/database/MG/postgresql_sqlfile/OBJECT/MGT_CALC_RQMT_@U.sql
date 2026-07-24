\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_rqmt_$u(
	calc_no,
	calc_grp_cd,
	wg_cd,
	ym,
	mng_dpt_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	lot_no,
	sublot_no,
	sno1,
	sno2,
	sno3,
	sno4,
	asst_typ,
	qty
	)
AS
SELECT
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.calc_no,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.calc_grp_cd,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.wg_cd,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.ym,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.mng_dpt_cd,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.itm_cd,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.itm_sub1,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.itm_sub2,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.itm_sub3,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.lot_no,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.sublot_no,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.sno1,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.sno2,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.sno3,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.sno4,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.asst_typ,
	mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.qty
FROM
	mgt_calc_rqmt_all mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org
WHERE
	0 = 0
	AND mgt_calc_rqmt_$u_mgt_calc_rqmt_all_org.co_cd = fcpa_context$f_get_co_cd()
;

