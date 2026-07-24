\encoding UTF-8

CREATE OR REPLACE VIEW msvt_mrp_sim_rqmt_prms(
rqmt_no,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
strg_loc_cd,
mfg_loc_cd,
sppl_cd,
rqst_loc_cd,
due_dt,
rqmt_qty,
sno1,
sno1_typ,
sno2,
sno2_typ,
sno3,
sno3_typ,
sno4,
sno4_typ,
wg_cd,
rqmt_typ,
sim_mrp_no
)
AS
SELECT
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.rqmt_no,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.itm_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.itm_sub1,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.itm_sub2,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.itm_sub3,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.strg_loc_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.mfg_loc_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sppl_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.rqst_loc_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.due_dt,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.rqmt_qty,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sno1,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sno1_typ,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sno2,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sno2_typ,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sno3,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sno3_typ,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sno4,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.sno4_typ,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.wg_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1.rqmt_typ,
	NULL::TEXT AS sim_mrp_no
FROM
	msvt_mrp_wg_rqst_prms msvt_mrp_sim_rqmt_prms_msvt_mrp_wg_rqst_prms_t1
UNION ALL
SELECT
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.rqmt_no,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.itm_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.itm_sub1,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.itm_sub2,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.itm_sub3,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.strg_loc_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.mfg_loc_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sppl_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.rqst_loc_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.due_dt,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.rqmt_qty,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sno1,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sno1_typ,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sno2,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sno2_typ,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sno3,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sno3_typ,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sno4,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.sno4_typ,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.wg_cd,
	msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1.rqmt_typ,
	NULL::TEXT AS sim_mrp_no
FROM
	msvt_mrp_rqmt msvt_mrp_sim_rqmt_prms_msvt_mrp_rqmt_t1
;;

