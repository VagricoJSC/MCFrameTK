\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_other_wk(
wg_cd,
ym,
ac_dt,
dpt_cd,
ctg_cd,
loc_cd,
oper_cd,
lot_no,
sublot_no,
sno1,
sno2,
sno3,
sno4,
wk_cost_cd,
wk_rsn_cd,
wk_cost,
alc_ptn_cd
)
AS
SELECT	mgvt_other_wk_mgt_calc_other_wk_t1.wg_cd,
	mgvt_other_wk_mgt_calc_other_wk_t1.ym,
	mgvt_other_wk_mgt_calc_other_wk_t1.ac_dt,
	mgvt_other_wk_mgt_calc_other_wk_t1.dpt_cd,
	mgvt_other_wk_mgt_calc_other_wk_t1.ctg_cd,
	mgvt_other_wk_mgt_calc_other_wk_t1.loc_cd,
	mgvt_other_wk_mgt_calc_other_wk_t1.oper_cd,
	mgvt_other_wk_mgt_calc_other_wk_t1.lot_no,
	mgvt_other_wk_mgt_calc_other_wk_t1.sublot_no,
	mgvt_other_wk_mgt_calc_other_wk_t1.sno1,
	mgvt_other_wk_mgt_calc_other_wk_t1.sno2,
	mgvt_other_wk_mgt_calc_other_wk_t1.sno3,
	mgvt_other_wk_mgt_calc_other_wk_t1.sno4,
	mgvt_other_wk_mgt_calc_other_wk_t1.wk_cost_cd,
	mgvt_other_wk_mgt_calc_other_wk_t1.wk_rsn_cd,
	mgvt_other_wk_mgt_calc_other_wk_t1.wk_cost,
	NULL::VARCHAR AS alc_ptn_cd
FROM	mgw_arg mgvt_other_wk_mgw_arg_w1, mgt_calc_other_wk mgvt_other_wk_mgt_calc_other_wk_t1
WHERE	0=0
AND	mgvt_other_wk_mgw_arg_w1.calc_no = mgvt_other_wk_mgt_calc_other_wk_t1.calc_no
AND	mgvt_other_wk_mgw_arg_w1.calc_grp_cd = mgvt_other_wk_mgt_calc_other_wk_t1.calc_grp_cd
;;

