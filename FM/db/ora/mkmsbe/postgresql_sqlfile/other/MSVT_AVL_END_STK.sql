\encoding UTF-8

CREATE OR REPLACE VIEW msvt_avl_end_stk(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
loc_cd,
str_ln_cd,
stk_arrv_bp_cd,
lot_no,
sublot_no,
sno1,
sno2,
sno3,
sno4,
fix_no_typ,
fix_no,
pack_unit_cd,
gd_cd,
in_xfr_typ,
quality_typ,
asst_typ,
stk_insp_typ,
stk_id_typ,
stk_bp_cd,
io_act_typ,
ac_ym,
pack_unit_qty,
base_unit_qty,
sub_char1,
sub_char2,
sub_char3,
ins_usr_id,
ins_usr_nm,
ins_ts,
ins_func_id,
upd_cntr,
upd_usr_id,
upd_usr_nm,
upd_ts,
upd_func_id,
upd_srv_req_no
)
AS
SELECT
	msvt_avl_end_stk_mst_mly_stk_dtl_t1.*
FROM
	mst_mly_stk_dtl msvt_avl_end_stk_mst_mly_stk_dtl_t1
WHERE 0=0
AND msvt_avl_end_stk_mst_mly_stk_dtl_t1.in_xfr_typ = fcpa_const$get_const_val('MSC_IN_XFR_TYP','IN_LOC')
AND msvt_avl_end_stk_mst_mly_stk_dtl_t1.stk_insp_typ = fcpa_const$get_const_val('MSC_STK_INSP_TYP','FIN')
AND msvt_avl_end_stk_mst_mly_stk_dtl_t1.stk_id_typ IN (
	fcpa_const$get_const_val('MSC_STK_ID_TYP','COSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','CSTSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','RNT_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ACCPT_DFCT'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','NCV_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ONR_PROV')
	)
AND (msvt_avl_end_stk_mst_mly_stk_dtl_t1.stk_arrv_bp_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL')
	OR EXISTS (
		SELECT 'X'
		FROM mam_loc msvt_avl_end_stk_mam_loc_m1
		WHERE 0=0
		AND msvt_avl_end_stk_mam_loc_m1.loc_cd = msvt_avl_end_stk_mst_mly_stk_dtl_t1.loc_cd
		AND msvt_avl_end_stk_mam_loc_m1.sppl_cd IS NOT NULL)
		)
AND msvt_avl_end_stk_mst_mly_stk_dtl_t1.io_act_typ = fcpa_const$get_const_val('MSC_IO_ACT_TYP','END_STK')
;;

