\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_itm_proc(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
sppl_cd,
wg_cd,
base_qty,
cur_cd,
outsrc_upri_typ,
upri,
base_cur_upri,
cost_ratio
)
AS
SELECT	mgvm_itm_proc_mgt_calc_itm_proc_t1.itm_cd,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.itm_sub1,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.itm_sub2,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.itm_sub3,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.sppl_cd,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.wg_cd,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.base_qty,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.cur_cd,
	CASE mgvm_itm_proc_mam_bp_$s_m1.onr_prsppl_flg
		WHEN '0' THEN fcpa_const$get_const_val('MAC_OUTSRC_UPRI_TYP','PROC')
		ELSE COALESCE(mgvm_itm_proc_mam_bp_$s_m1.outsrc_upri_typ, mgvm_itm_proc_mam_co_m2.outsrc_upri_typ)
	END AS outsrc_upri_typ,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.upri,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.base_cur_upri,
	mgvm_itm_proc_mgt_calc_itm_proc_t1.cost_ratio
FROM	mgw_arg mgvm_itm_proc_mgw_arg_w1,
	mam_co mgvm_itm_proc_mam_co_m2,
	mgt_calc_itm_proc mgvm_itm_proc_mgt_calc_itm_proc_t1
	LEFT OUTER JOIN mam_bp_$s mgvm_itm_proc_mam_bp_$s_m1 ON (mgvm_itm_proc_mgt_calc_itm_proc_t1.sppl_cd = mgvm_itm_proc_mam_bp_$s_m1.bp_cd)
WHERE	0=0
AND	mgvm_itm_proc_mgw_arg_w1.calc_no = mgvm_itm_proc_mgt_calc_itm_proc_t1.calc_no
AND	mgvm_itm_proc_mgw_arg_w1.calc_grp_cd = mgvm_itm_proc_mgt_calc_itm_proc_t1.calc_grp_cd
;;

