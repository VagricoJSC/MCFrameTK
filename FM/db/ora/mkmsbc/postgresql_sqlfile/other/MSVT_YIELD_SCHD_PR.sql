\encoding UTF-8

CREATE OR REPLACE VIEW msvt_yield_schd_pr(
yield_schd_no,
mfg_sts_typ,
mfg_inst_no,
itm_mfg_inst_no,
oper_inst_no,
yield_typ,
trd_unit_yield_qty,
trd_unit_yield_rem_qty,
trd_unit_yield_abort_qty,
base_unit_yield_qty,
base_unit_yield_rem_qty,
base_unit_yield_abort_qty,
stk_lst_prnt_flg,
sub_char1,
sub_char2,
sub_char3
)
AS
SELECT
	msvt_yield_schd_pr_mst_yield_act_rem_t1.yield_schd_no,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.mfg_sts_typ,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.mfg_inst_no,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.itm_mfg_inst_no,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.oper_inst_no,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.yield_typ,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.trd_unit_yield_qty,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.trd_unit_yield_rem_qty,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.trd_unit_yield_abort_qty,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.base_unit_yield_qty,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.base_unit_yield_rem_qty,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.base_unit_yield_abort_qty,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.stk_lst_prnt_flg,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.sub_char1,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.sub_char2,
	msvt_yield_schd_pr_mst_yield_act_rem_t1.sub_char3
FROM 
	mst_yield_act_rem msvt_yield_schd_pr_mst_yield_act_rem_t1
WHERE 0=0
AND	msvt_yield_schd_pr_mst_yield_act_rem_t1.div_seq = 0
;;

