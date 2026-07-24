\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_inst_wip_$s(
	calc_no,
	calc_grp_cd,
	wg_cd,
	ym,
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
	ac_rsn_cd,
	wip_qty,
	wip_per
	)
AS
SELECT
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.calc_no,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.calc_grp_cd,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.wg_cd,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.ym,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.itm_cd,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.itm_sub1,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.itm_sub2,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.itm_sub3,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.itm_ext,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.itm_mfg_inst_no,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.mfg_act_no,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.oper_act_no,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.oper_cd,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.oper_seq,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.loc_cd,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.str_ln_cd,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.ac_rsn_cd,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.wip_qty,
	mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.wip_per
FROM
	mgt_calc_inst_wip_all mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org
WHERE
	0 = 0
	AND mgt_calc_inst_wip_$s_mgt_calc_inst_wip_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_inst_wip_$s_fct_context WHERE pid = pg_backend_pid())
;

