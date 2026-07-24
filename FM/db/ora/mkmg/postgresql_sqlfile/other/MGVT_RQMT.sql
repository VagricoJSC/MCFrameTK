\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_rqmt(
wg_cd,
ym,
mng_dpt_cd,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
lot_no,
sublot_no,
sno1,
sno2,
sno3,
sno4,
asst_typ,
qty
)
AS
SELECT	mgvt_rqmt_mgt_calc_rqmt_t1.wg_cd,
	mgvt_rqmt_mgt_calc_rqmt_t1.ym,
	mgvt_rqmt_mgt_calc_rqmt_t1.mng_dpt_cd,
	mgvt_rqmt_mgt_calc_rqmt_t1.itm_cd,
	mgvt_rqmt_mgt_calc_rqmt_t1.itm_sub1,
	mgvt_rqmt_mgt_calc_rqmt_t1.itm_sub2,
	mgvt_rqmt_mgt_calc_rqmt_t1.itm_sub3,
	mgvt_rqmt_mgt_calc_rqmt_t1.lot_no,
	mgvt_rqmt_mgt_calc_rqmt_t1.sublot_no,
	mgvt_rqmt_mgt_calc_rqmt_t1.sno1,
	mgvt_rqmt_mgt_calc_rqmt_t1.sno2,
	mgvt_rqmt_mgt_calc_rqmt_t1.sno3,
	mgvt_rqmt_mgt_calc_rqmt_t1.sno4,
	mgvt_rqmt_mgt_calc_rqmt_t1.asst_typ,
	mgvt_rqmt_mgt_calc_rqmt_t1.qty
FROM	mgw_arg mgvt_rqmt_mgw_arg_w1, mgt_calc_rqmt mgvt_rqmt_mgt_calc_rqmt_t1
WHERE	0=0
AND	mgvt_rqmt_mgw_arg_w1.calc_no = mgvt_rqmt_mgt_calc_rqmt_t1.calc_no
AND	mgvt_rqmt_mgw_arg_w1.calc_grp_cd = mgvt_rqmt_mgt_calc_rqmt_t1.calc_grp_cd
;;

