\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_pre_alc_amt_$u(
	calc_no,
	calc_grp_cd,
	alc_amt_key,
	wg_cd,
	ym,
	alc_ac_cd,
	dpt_cd,
	loc_cd,
	oper_cd,
	bp_cd,
	ctg_cd,
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
	itm_mfg_inst_no,
	iv_no,
	po_no,
	slo_no,
	amt
	)
AS
SELECT
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.calc_no,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.calc_grp_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.alc_amt_key,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.wg_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.ym,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.alc_ac_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.dpt_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.loc_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.oper_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.bp_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.ctg_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.itm_cd,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.itm_sub1,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.itm_sub2,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.itm_sub3,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.lot_no,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.sublot_no,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.sno1,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.sno2,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.sno3,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.sno4,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.itm_mfg_inst_no,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.iv_no,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.po_no,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.slo_no,
	mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.amt
FROM
	mgt_calc_pre_alc_amt_all mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org
WHERE
	0 = 0
	AND mgt_calc_pre_alc_amt_$u_mgt_calc_pre_alc_amt_all_org.co_cd = fcpa_context$f_get_co_cd()
;

