\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_wk_$u(
	calc_no,
	calc_grp_cd,
	wg_cd,
	ym,
	ac_dt,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_ext,
	itm_mfg_inst_no,
	mfg_act_no,
	oper_act_no,
	oper_cd,
	oper_seq,
	loc_cd,
	str_ln_cd,
	wk_cost_cd,
	wk_rsn_cd,
	wk_cost
	)
AS
SELECT
	mgt_calc_wk_$u_mgt_calc_wk_all_org.calc_no,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.calc_grp_cd,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.wg_cd,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.ym,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.ac_dt,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.itm_cd,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.itm_sub1,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.itm_sub2,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.itm_sub3,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.itm_ext,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.itm_mfg_inst_no,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.mfg_act_no,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.oper_act_no,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.oper_cd,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.oper_seq,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.loc_cd,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.str_ln_cd,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.wk_cost_cd,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.wk_rsn_cd,
	mgt_calc_wk_$u_mgt_calc_wk_all_org.wk_cost
FROM
	mgt_calc_wk_all mgt_calc_wk_$u_mgt_calc_wk_all_org
WHERE
	0 = 0
	AND mgt_calc_wk_$u_mgt_calc_wk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

