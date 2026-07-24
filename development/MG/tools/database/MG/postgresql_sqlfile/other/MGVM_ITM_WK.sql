\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_itm_wk(
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
batch_wk_cost
)
AS
SELECT	mgvm_itm_wk_mgt_calc_itm_wk_t1.itm_cd,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.itm_sub1,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.itm_sub2,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.itm_sub3,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.loc_cd,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.oper_ptn,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.oper_cd,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.oper_seq,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.wk_cost_cd,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.wg_cd,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.base_qty,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.fxd_wk_cost,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.wk_cost,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.min_wk_cost,
	mgvm_itm_wk_mgt_calc_itm_wk_t1.batch_wk_cost
FROM	mgw_arg mgvm_itm_wk_mgw_arg_w1, mgt_calc_itm_wk mgvm_itm_wk_mgt_calc_itm_wk_t1
WHERE	0=0
AND	mgvm_itm_wk_mgw_arg_w1.calc_no = mgvm_itm_wk_mgt_calc_itm_wk_t1.calc_no
AND	mgvm_itm_wk_mgw_arg_w1.calc_grp_cd = mgvm_itm_wk_mgt_calc_itm_wk_t1.calc_grp_cd
;;

