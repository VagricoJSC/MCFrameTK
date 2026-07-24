SELECT
	msvt_oper_inst_pr_mst_oper_act_rem_t1.oper_inst_no,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.mfg_sts_typ,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.mfg_inst_no,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.itm_mfg_inst_no,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.base_unit_qty,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.base_unit_rem_qty,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.base_unit_abort_qty,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.sub_char1,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.sub_char2,
	msvt_oper_inst_pr_mst_oper_act_rem_t1.sub_char3
FROM
	mst_oper_act_rem msvt_oper_inst_pr_mst_oper_act_rem_t1
WHERE 0=0
AND	msvt_oper_inst_pr_mst_oper_act_rem_t1.div_seq = 0
;
