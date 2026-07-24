\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_itm_wk_$u(
	calc_no,
	calc_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	loc_cd,
	oper_ptn,
	oper_cd,
	oper_seq,
	wk_cost_cd,
	wg_cd,
	base_qty,
	fxd_wk_cost,
	wk_cost,
	min_wk_cost,
	batch_wk_cost,
	calc_ctg_cd,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3
	)
AS
SELECT
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.calc_no,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.calc_grp_cd,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.itm_cd,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.itm_sub1,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.itm_sub2,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.itm_sub3,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.loc_cd,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.oper_ptn,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.oper_cd,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.oper_seq,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.wk_cost_cd,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.wg_cd,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.base_qty,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.fxd_wk_cost,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.wk_cost,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.min_wk_cost,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.batch_wk_cost,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.calc_ctg_cd,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.rmrks,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.sub_char1,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.sub_char2,
	mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.sub_char3
FROM
	mgt_calc_itm_wk_all mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org
WHERE
	0 = 0
	AND mgt_calc_itm_wk_$u_mgt_calc_itm_wk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

