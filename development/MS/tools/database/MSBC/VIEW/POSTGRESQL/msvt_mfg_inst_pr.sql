SELECT
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.mfg_inst_no,
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.mfg_sts_typ,
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.itm_mfg_inst_no,
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.base_unit_mfg_qty,
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.base_unit_mfg_rem_qty,
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.base_unit_mfg_abort_qty,
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.sub_char1,
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.sub_char2,
	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.sub_char3
FROM
	mst_mfg_act_rem msvt_mfg_inst_pr_mst_mfg_act_rem_t1
WHERE 0=0
AND	msvt_mfg_inst_pr_mst_mfg_act_rem_t1.div_seq = 0
;
