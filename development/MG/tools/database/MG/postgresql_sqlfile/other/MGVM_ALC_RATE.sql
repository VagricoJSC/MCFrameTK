\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_alc_rate(
alc_ac_cd,
dpt_cd,
loc_cd,
oper_cd,
bp_cd,
ctg_cd,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
wg_cd,
alc_ptn_cd,
expns_cd,
alc_rate
)
AS
SELECT	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.alc_ac_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.dpt_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.loc_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.oper_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.bp_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.ctg_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.itm_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.itm_sub1,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.itm_sub2,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.itm_sub3,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.wg_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.alc_ptn_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.expns_cd,
	mgvm_alc_rate_mgt_calc_std_alc_rate_t1.alc_rate
FROM	mgw_arg mgvm_alc_rate_mgw_arg_w1, mgt_calc_std_alc_rate mgvm_alc_rate_mgt_calc_std_alc_rate_t1
WHERE	0=0
AND	mgvm_alc_rate_mgw_arg_w1.calc_no = mgvm_alc_rate_mgt_calc_std_alc_rate_t1.calc_no
AND	mgvm_alc_rate_mgw_arg_w1.calc_grp_cd = mgvm_alc_rate_mgt_calc_std_alc_rate_t1.calc_grp_cd
;;

