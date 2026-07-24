SELECT
	msvt_wk_schd_pr_mst_wk_act_rem_t1.wk_schd_no,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.mfg_sts_typ,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.mfg_inst_no,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.itm_mfg_inst_no,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.oper_inst_no,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.fxd_wk_cost,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.wk_cost,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.rem_wk_cost,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.abort_wk_cost,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.sub_char1,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.sub_char2,
	msvt_wk_schd_pr_mst_wk_act_rem_t1.sub_char3
FROM
	mst_wk_act_rem msvt_wk_schd_pr_mst_wk_act_rem_t1
WHERE 0=0
AND	msvt_wk_schd_pr_mst_wk_act_rem_t1.div_seq = 0
;
