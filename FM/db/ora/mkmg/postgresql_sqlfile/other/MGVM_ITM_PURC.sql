\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_itm_purc(
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
cost_ratio
)
AS
SELECT	mgvm_itm_purc_mgt_calc_itm_purc_t1.itm_cd,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.itm_sub1,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.itm_sub2,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.itm_sub3,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.sppl_cd,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.wg_cd,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.base_qty,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.cur_cd,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.upri,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.base_cur_upri,
	mgvm_itm_purc_mgt_calc_itm_purc_t1.cost_ratio
FROM	mgw_arg mgvm_itm_purc_mgw_arg_w1, mgt_calc_itm_purc mgvm_itm_purc_mgt_calc_itm_purc_t1
WHERE	0=0
AND	mgvm_itm_purc_mgw_arg_w1.calc_no = mgvm_itm_purc_mgt_calc_itm_purc_t1.calc_no
AND	mgvm_itm_purc_mgw_arg_w1.calc_grp_cd = mgvm_itm_purc_mgt_calc_itm_purc_t1.calc_grp_cd
;;

