\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_alc_amt(
inpt_alc_typ,
wg_cd,
ym,
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
lot_no,
sublot_no,
sno1,
sno2,
sno3,
sno4,
itm_mfg_inst_no,
iv_no,
po_no,
slo_no,
amt,
alc_rate,
alc_ptn_cd,
expns_cd
)
AS
SELECT	mgvt_alc_amt_mgt_calc_alc_amt_t1.inpt_alc_typ,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.wg_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.ym,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.alc_ac_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.dpt_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.loc_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.oper_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.bp_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.ctg_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.itm_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.itm_sub1,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.itm_sub2,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.itm_sub3,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.lot_no,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.sublot_no,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.sno1,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.sno2,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.sno3,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.sno4,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.itm_mfg_inst_no,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.iv_no,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.po_no,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.slo_no,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.amt,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.alc_rate,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.alc_ptn_cd,
	mgvt_alc_amt_mgt_calc_alc_amt_t1.expns_cd
FROM	mgw_arg mgvt_alc_amt_mgw_arg_w1, mgt_calc_alc_amt mgvt_alc_amt_mgt_calc_alc_amt_t1
WHERE	0=0
AND	mgvt_alc_amt_mgw_arg_w1.calc_no = mgvt_alc_amt_mgt_calc_alc_amt_t1.calc_no
AND	mgvt_alc_amt_mgw_arg_w1.calc_grp_cd = mgvt_alc_amt_mgt_calc_alc_amt_t1.calc_grp_cd
AND	mgvt_alc_amt_mgt_calc_alc_amt_t1.ym BETWEEN mgvt_alc_amt_mgw_arg_w1.st_ym AND mgvt_alc_amt_mgw_arg_w1.end_ym
;;

