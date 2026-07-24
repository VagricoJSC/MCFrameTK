\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_itm_dtl(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
mfg_loc_cd,
sppl_cd,
maker_cd,
rqst_loc_cd,
wg_cd,
bom_ptn,
st_dt,
sppl_cal_cd,
rqst_sppl_cd,
rqst_site_cd,
rqst_lg_grp_cd,
rqst_lg_cal_cd,
rqst_wg_cd,
end_dt,
oper_ptn,
order_ratio,
mfg_lt,
mfg_lt_add_qty,
purc_lt,
purc_lt_add_qty,
accpt_insp_lt,
buf_lt,
sz_day_week_typ,
sz_week,
lot_sz_pd,
min_lot_qty,
batch_lot_qty,
max_lot_qty,
yield_schd_qty,
mfg_inst_qty,
fxd_rqmt_qty,
sno1,
sno2,
sno3,
sno4,
prio,
max_order,
ord_fix_pd,
order_stop_dt
)
AS
SELECT
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.itm_cd,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.itm_sub1,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.itm_sub2,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.itm_sub3,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.mfg_loc_cd,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.sppl_cd,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.maker_cd,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.rqst_loc_cd,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.wg_cd,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.bom_ptn,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.st_dt,
	msvm_mrp_itm_dtl_mam_bp_t3.sppl_cal_cd,
	msvm_mrp_itm_dtl_mam_loc_t4.sppl_cd AS rqst_sppl_cd,
	msvm_mrp_itm_dtl_mam_loc_t4.site_cd AS rqst_site_cd,
	msvm_mrp_itm_dtl_mam_loc_t4.lg_grp_cd AS rqst_lg_grp_cd,
	CASE
		WHEN msvm_mrp_itm_dtl_mam_lg_grp_t7.lg_grp_cd IS NULL THEN NULL
		ELSE COALESCE(msvm_mrp_itm_dtl_mam_lg_grp_t7.cal_cd, msvm_mrp_itm_dtl_mam_co_t8.std_cal_cd)
	END AS rqst_lg_cal_cd,
	COALESCE(msvm_mrp_itm_dtl_mam_loc_t4.wg_cd, msvm_mrp_itm_dtl_mam_itm_dtl_t1.rqst_wg_cd) AS rqst_wg_cd,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.end_dt,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.oper_ptn,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.order_ratio,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.mfg_lt,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.mfg_lt_add_qty,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.purc_lt,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.purc_lt_add_qty,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.accpt_insp_lt,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.buf_lt,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.sz_day_week_typ,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.sz_week,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.lot_sz_pd,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.min_lot_qty,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.batch_lot_qty,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.max_lot_qty,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.yield_schd_qty,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.mfg_inst_qty,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.fxd_rqmt_qty,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.sno1,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.sno2,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.sno3,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.sno4,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.prio,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.max_order,
	msvm_mrp_itm_dtl_mam_itm_dtl_t1.ord_fix_pd,
	COALESCE(msvm_mrp_itm_dtl_mam_bp_stop_t5.order_stop_dt, msvm_mrp_itm_dtl_mam_bp_stop_t6.order_stop_dt) AS order_stop_dt
FROM mam_co msvm_mrp_itm_dtl_mam_co_t8,
	mam_itm_dtl msvm_mrp_itm_dtl_mam_itm_dtl_t1
	LEFT OUTER JOIN mam_loc msvm_mrp_itm_dtl_mam_loc_t2 ON (msvm_mrp_itm_dtl_mam_itm_dtl_t1.mfg_loc_cd = msvm_mrp_itm_dtl_mam_loc_t2.loc_cd)
	LEFT OUTER JOIN mam_bp msvm_mrp_itm_dtl_mam_bp_t3 ON (msvm_mrp_itm_dtl_mam_itm_dtl_t1.sppl_cd = msvm_mrp_itm_dtl_mam_bp_t3.bp_cd)
	LEFT OUTER JOIN mam_loc msvm_mrp_itm_dtl_mam_loc_t4 ON (msvm_mrp_itm_dtl_mam_itm_dtl_t1.rqst_loc_cd = msvm_mrp_itm_dtl_mam_loc_t4.loc_cd)
	LEFT OUTER JOIN mam_bp_stop msvm_mrp_itm_dtl_mam_bp_stop_t5 ON (msvm_mrp_itm_dtl_mam_itm_dtl_t1.sppl_cd = msvm_mrp_itm_dtl_mam_bp_stop_t5.bp_cd AND msvm_mrp_itm_dtl_mam_bp_stop_t5.del_flg = '0')
	LEFT OUTER JOIN mam_bp_stop msvm_mrp_itm_dtl_mam_bp_stop_t6 ON (msvm_mrp_itm_dtl_mam_loc_t2.sppl_cd = msvm_mrp_itm_dtl_mam_bp_stop_t6.bp_cd AND msvm_mrp_itm_dtl_mam_bp_stop_t6.del_flg = '0')
	LEFT OUTER JOIN mam_lg_grp msvm_mrp_itm_dtl_mam_lg_grp_t7 ON (msvm_mrp_itm_dtl_mam_loc_t4.lg_grp_cd = msvm_mrp_itm_dtl_mam_lg_grp_t7.lg_grp_cd)
WHERE 0=0
AND msvm_mrp_itm_dtl_mam_itm_dtl_t1.not_mrp_flg = '0'
;;

