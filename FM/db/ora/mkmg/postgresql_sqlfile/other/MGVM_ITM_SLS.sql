\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_itm_sls(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
dpt_cd,
cst_cd,
dlv_cd,
dest_cd1,
dest_cd2,
dest_cd3,
wg_cd,
base_qty,
cur_cd,
upri,
base_cur_upri,
prio,
alc_val1,
alc_val2,
alc_val3,
alc_val4,
alc_val5
)
AS
SELECT	mgvm_itm_sls_mgt_calc_itm_sls_t1.itm_cd,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.itm_sub1,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.itm_sub2,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.itm_sub3,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.dpt_cd,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.cst_cd,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.dlv_cd,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.dest_cd1,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.dest_cd2,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.dest_cd3,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.wg_cd,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.base_qty,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.cur_cd,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.upri,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.base_cur_upri,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.prio,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.alc_val1,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.alc_val2,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.alc_val3,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.alc_val4,
	mgvm_itm_sls_mgt_calc_itm_sls_t1.alc_val5
FROM	mgw_arg mgvm_itm_sls_mgw_arg_w1, mgt_calc_itm_sls mgvm_itm_sls_mgt_calc_itm_sls_t1
WHERE	0=0
AND	mgvm_itm_sls_mgw_arg_w1.calc_no = mgvm_itm_sls_mgt_calc_itm_sls_t1.calc_no
AND	mgvm_itm_sls_mgw_arg_w1.calc_grp_cd = mgvm_itm_sls_mgt_calc_itm_sls_t1.calc_grp_cd
;;

