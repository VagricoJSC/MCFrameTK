\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_itm_purc_$u(
	calc_no,
	calc_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	sppl_cd,
	wg_cd,
	base_qty,
	cur_cd,
	upri,
	base_cur_upri,
	cost_ratio,
	calc_ctg_cd,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3
	)
AS
SELECT
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.calc_no,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.calc_grp_cd,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.itm_cd,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.itm_sub1,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.itm_sub2,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.itm_sub3,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.sppl_cd,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.wg_cd,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.base_qty,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.cur_cd,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.upri,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.base_cur_upri,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.cost_ratio,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.calc_ctg_cd,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.rmrks,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.sub_char1,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.sub_char2,
	mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.sub_char3
FROM
	mgt_calc_itm_purc_all mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org
WHERE
	0 = 0
	AND mgt_calc_itm_purc_$u_mgt_calc_itm_purc_all_org.co_cd = fcpa_context$f_get_co_cd()
;

