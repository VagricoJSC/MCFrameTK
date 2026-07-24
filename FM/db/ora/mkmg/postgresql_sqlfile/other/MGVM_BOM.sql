\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_bom(
par_itm_cd,
par_itm_sub1,
par_itm_sub2,
par_itm_sub3,
bom_ptn,
oper_cd,
oper_seq,
chd_itm_cd,
chd_itm_sub1,
chd_itm_sub2,
chd_itm_sub3,
alt_grp_cd,
expns_cd,
wg_cd,
disp_seq,
par_rqmt_qty,
chd_rqmt_qty,
chd_base_qty,
fxd_chd_rqmt_qty,
chd_min_qty,
chd_batch_qty,
alt_itm_ratio
)
AS
SELECT	mgvm_bom_mgt_calc_bom_t1.par_itm_cd,
	mgvm_bom_mgt_calc_bom_t1.par_itm_sub1,
	mgvm_bom_mgt_calc_bom_t1.par_itm_sub2,
	mgvm_bom_mgt_calc_bom_t1.par_itm_sub3,
	mgvm_bom_mgt_calc_bom_t1.bom_ptn,
	mgvm_bom_mgt_calc_bom_t1.oper_cd,
	mgvm_bom_mgt_calc_bom_t1.oper_seq,
	mgvm_bom_mgt_calc_bom_t1.chd_itm_cd,
	mgvm_bom_mgt_calc_bom_t1.chd_itm_sub1,
	mgvm_bom_mgt_calc_bom_t1.chd_itm_sub2,
	mgvm_bom_mgt_calc_bom_t1.chd_itm_sub3,
	mgvm_bom_mgt_calc_bom_t1.alt_grp_cd,
	mgvm_bom_mgt_calc_bom_t1.expns_cd,
	mgvm_bom_mgt_calc_bom_t1.wg_cd,
	mgvm_bom_mgt_calc_bom_t1.disp_seq,
	mgvm_bom_mgt_calc_bom_t1.par_rqmt_qty,
	mgvm_bom_mgt_calc_bom_t1.chd_rqmt_qty,
	mgvm_bom_mgt_calc_bom_t1.chd_base_qty,
	mgvm_bom_mgt_calc_bom_t1.fxd_chd_rqmt_qty,
	mgvm_bom_mgt_calc_bom_t1.chd_min_qty,
	mgvm_bom_mgt_calc_bom_t1.chd_batch_qty,
	mgvm_bom_mgt_calc_bom_t1.alt_itm_ratio
FROM	mgw_arg mgvm_bom_mgw_arg_w1, mgt_calc_bom mgvm_bom_mgt_calc_bom_t1
WHERE	0=0
AND	mgvm_bom_mgw_arg_w1.calc_no = mgvm_bom_mgt_calc_bom_t1.calc_no
AND	mgvm_bom_mgw_arg_w1.calc_grp_cd = mgvm_bom_mgt_calc_bom_t1.calc_grp_cd
;;

