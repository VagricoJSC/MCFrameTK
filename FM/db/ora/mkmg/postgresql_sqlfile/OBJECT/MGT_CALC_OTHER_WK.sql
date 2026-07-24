\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_other_wk(
	calc_no,
	calc_grp_cd,
	wg_cd,
	ym,
	ac_dt,
	dpt_cd,
	ctg_cd,
	loc_cd,
	oper_cd,
	lot_no,
	sublot_no,
	sno1,
	sno2,
	sno3,
	sno4,
	wk_cost_cd,
	wk_rsn_cd,
	wk_cost
	)
AS
SELECT
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.calc_no,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.calc_grp_cd,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.wg_cd,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.ym,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.ac_dt,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.dpt_cd,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.ctg_cd,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.loc_cd,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.oper_cd,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.lot_no,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.sublot_no,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.sno1,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.sno2,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.sno3,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.sno4,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.wk_cost_cd,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.wk_rsn_cd,
	mgt_calc_other_wk_mgt_calc_other_wk_all_org.wk_cost
FROM
	mgt_calc_other_wk_all mgt_calc_other_wk_mgt_calc_other_wk_all_org
WHERE
	0 = 0
	AND mgt_calc_other_wk_mgt_calc_other_wk_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_other_wk_fct_context WHERE pid = pg_backend_pid())
;

