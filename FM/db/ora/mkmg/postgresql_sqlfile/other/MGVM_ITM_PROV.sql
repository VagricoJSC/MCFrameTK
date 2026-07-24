\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_itm_prov(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
prsppl_cd,
wg_cd,
prov_typ,
base_qty,
cur_cd,
upri,
base_cur_upri
)
AS
SELECT	mgvm_itm_prov_mgt_calc_itm_prov_t1.itm_cd,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.itm_sub1,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.itm_sub2,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.itm_sub3,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.prsppl_cd,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.wg_cd,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.prov_typ,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.base_qty,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.cur_cd,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.upri,
	mgvm_itm_prov_mgt_calc_itm_prov_t1.base_cur_upri
FROM	mgw_arg mgvm_itm_prov_mgw_arg_w1, mgt_calc_itm_prov mgvm_itm_prov_mgt_calc_itm_prov_t1
WHERE	0=0
AND	mgvm_itm_prov_mgw_arg_w1.calc_no = mgvm_itm_prov_mgt_calc_itm_prov_t1.calc_no
AND	mgvm_itm_prov_mgw_arg_w1.calc_grp_cd = mgvm_itm_prov_mgt_calc_itm_prov_t1.calc_grp_cd
;;

