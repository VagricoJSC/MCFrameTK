\encoding UTF-8

CREATE OR REPLACE VIEW mam_pre_alc_ptn(
	pre_alc_ptn_cd,
	pre_alc_ptn_nm,
	base_pre_alc_ptn_nm,
	dpt_alc_typ,
	loc_alc_typ,
	oper_alc_typ,
	bp_alc_typ,
	ctg_alc_typ,
	itm_alc_typ,
	lot_alc_typ,
	sublot_alc_typ,
	sno1_alc_typ,
	sno2_alc_typ,
	sno3_alc_typ,
	sno4_alc_typ,
	inst_alc_typ,
	iv_alc_typ,
	po_alc_typ,
	slo_alc_typ,
	alc_ac_alc_typ,
	wg_alc_typ,
	memo1,
	memo2,
	memo3,
	del_flg,
	del_usr_id,
	del_usr_nm,
	del_ts,
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
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.pre_alc_ptn_cd,
	mam_pre_alc_ptn_mam_pre_alc_ptn_lcl_all_lcl.pre_alc_ptn_nm,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.pre_alc_ptn_nm AS base_pre_alc_ptn_nm,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.dpt_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.loc_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.oper_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.bp_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.ctg_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.itm_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.lot_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.sublot_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.sno1_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.sno2_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.sno3_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.sno4_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.inst_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.iv_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.po_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.slo_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.alc_ac_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.wg_alc_typ,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.memo1,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.memo2,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.memo3,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.del_flg,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.del_usr_id,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.del_usr_nm,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.del_ts,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.ins_usr_id,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.ins_usr_nm,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.ins_ts,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.ins_func_id,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.upd_cntr,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.upd_usr_id,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.upd_usr_nm,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.upd_ts,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.upd_func_id,
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.upd_srv_req_no
FROM
	mam_pre_alc_ptn_all mam_pre_alc_ptn_mam_pre_alc_ptn_all_org
LEFT OUTER JOIN
	mam_pre_alc_ptn_lcl_all mam_pre_alc_ptn_mam_pre_alc_ptn_lcl_all_lcl
ON
	mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.pre_alc_ptn_cd = mam_pre_alc_ptn_mam_pre_alc_ptn_lcl_all_lcl.pre_alc_ptn_cd
	AND mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.co_cd = mam_pre_alc_ptn_mam_pre_alc_ptn_lcl_all_lcl.co_cd
	AND mam_pre_alc_ptn_mam_pre_alc_ptn_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_pre_alc_ptn_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.co_cd = (SELECT co_cd FROM fct_context mam_pre_alc_ptn_fct_context WHERE pid = pg_backend_pid())
	AND (mam_pre_alc_ptn_mam_pre_alc_ptn_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_pre_alc_ptn_maw_del_flg_ctl_W WHERE lower(mam_pre_alc_ptn_maw_del_flg_ctl_W.tbl_nm) = 'mam_pre_alc_ptn'))
;

