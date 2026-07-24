\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_wk(
wg_cd,
ym,
ac_dt,
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
wk_cost_cd,
wk_rsn_cd,
wk_cost
)
AS
SELECT	mgvt_wk_mgt_calc_wk_t1.wg_cd,
	mgvt_wk_mgt_calc_wk_t1.ym,
	mgvt_wk_mgt_calc_wk_t1.ac_dt,
	mgvt_wk_mgt_calc_wk_t1.itm_cd,
	mgvt_wk_mgt_calc_wk_t1.itm_sub1,
	mgvt_wk_mgt_calc_wk_t1.itm_sub2,
	mgvt_wk_mgt_calc_wk_t1.itm_sub3,
	mgvt_wk_mgt_calc_wk_t1.itm_ext,
	mgvt_wk_mgt_calc_wk_t1.itm_mfg_inst_no,
	mgvt_wk_mgt_calc_wk_t1.mfg_act_no,
	mgvt_wk_mgt_calc_wk_t1.oper_act_no,
	mgvt_wk_mgt_calc_wk_t1.oper_cd,
	mgvt_wk_mgt_calc_wk_t1.oper_seq,
	mgvt_wk_mgt_calc_wk_t1.loc_cd,
	mgvt_wk_mgt_calc_wk_t1.str_ln_cd,
	mgvt_wk_mgt_calc_wk_t1.wk_cost_cd,
	mgvt_wk_mgt_calc_wk_t1.wk_rsn_cd,
	mgvt_wk_mgt_calc_wk_t1.wk_cost
FROM	mgw_arg mgvt_wk_mgw_arg_w1, mgt_calc_wk mgvt_wk_mgt_calc_wk_t1
WHERE	0=0
AND	mgvt_wk_mgw_arg_w1.calc_no = mgvt_wk_mgt_calc_wk_t1.calc_no
AND	mgvt_wk_mgw_arg_w1.calc_grp_cd = mgvt_wk_mgt_calc_wk_t1.calc_grp_cd
;;

