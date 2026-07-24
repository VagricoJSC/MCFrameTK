\encoding UTF-8

CREATE OR REPLACE VIEW mam_wg(
	wg_cd,
	wg_nm,
	base_wg_nm,
	sls_flg,
	lg_flg,
	mfg_flg,
	purc_flg,
	ar_flg,
	ap_flg,
	sd_flg,
	mrp_prefix,
	mfg_inst_unit_typ,
	mrp_proc_typ,
	alloc_margin_days,
	not_xfr_flg,
	mrp_alloc_margin_days,
	mrp_opn_xfr_days,
	rqmt_typ,
	prod_pln_typ,
	dmnd_date_div_mons,
	plm_flg,
	calc_seq,
	cmn_upri_flg,
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
	mam_wg_mam_wg_all_org.wg_cd,
	mam_wg_mam_wg_lcl_all_lcl.wg_nm,
	mam_wg_mam_wg_all_org.wg_nm AS base_wg_nm,
	mam_wg_mam_wg_all_org.sls_flg,
	mam_wg_mam_wg_all_org.lg_flg,
	mam_wg_mam_wg_all_org.mfg_flg,
	mam_wg_mam_wg_all_org.purc_flg,
	mam_wg_mam_wg_all_org.ar_flg,
	mam_wg_mam_wg_all_org.ap_flg,
	mam_wg_mam_wg_all_org.sd_flg,
	mam_wg_mam_wg_all_org.mrp_prefix,
	mam_wg_mam_wg_all_org.mfg_inst_unit_typ,
	mam_wg_mam_wg_all_org.mrp_proc_typ,
	mam_wg_mam_wg_all_org.alloc_margin_days,
	mam_wg_mam_wg_all_org.not_xfr_flg,
	mam_wg_mam_wg_all_org.mrp_alloc_margin_days,
	mam_wg_mam_wg_all_org.mrp_opn_xfr_days,
	mam_wg_mam_wg_all_org.rqmt_typ,
	mam_wg_mam_wg_all_org.prod_pln_typ,
	mam_wg_mam_wg_all_org.dmnd_date_div_mons,
	mam_wg_mam_wg_all_org.plm_flg,
	mam_wg_mam_wg_all_org.calc_seq,
	mam_wg_mam_wg_all_org.cmn_upri_flg,
	mam_wg_mam_wg_all_org.memo1,
	mam_wg_mam_wg_all_org.memo2,
	mam_wg_mam_wg_all_org.memo3,
	mam_wg_mam_wg_all_org.del_flg,
	mam_wg_mam_wg_all_org.del_usr_id,
	mam_wg_mam_wg_all_org.del_usr_nm,
	mam_wg_mam_wg_all_org.del_ts,
	mam_wg_mam_wg_all_org.ins_usr_id,
	mam_wg_mam_wg_all_org.ins_usr_nm,
	mam_wg_mam_wg_all_org.ins_ts,
	mam_wg_mam_wg_all_org.ins_func_id,
	mam_wg_mam_wg_all_org.upd_cntr,
	mam_wg_mam_wg_all_org.upd_usr_id,
	mam_wg_mam_wg_all_org.upd_usr_nm,
	mam_wg_mam_wg_all_org.upd_ts,
	mam_wg_mam_wg_all_org.upd_func_id,
	mam_wg_mam_wg_all_org.upd_srv_req_no
FROM
	mam_wg_all mam_wg_mam_wg_all_org
LEFT OUTER JOIN
	mam_wg_lcl_all mam_wg_mam_wg_lcl_all_lcl
ON
	mam_wg_mam_wg_all_org.wg_cd = mam_wg_mam_wg_lcl_all_lcl.wg_cd
	AND mam_wg_mam_wg_all_org.co_cd = mam_wg_mam_wg_lcl_all_lcl.co_cd
	AND mam_wg_mam_wg_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_wg_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_wg_mam_wg_all_org.co_cd = (SELECT co_cd FROM fct_context mam_wg_fct_context WHERE pid = pg_backend_pid())
	AND (mam_wg_mam_wg_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_wg_maw_del_flg_ctl_W WHERE lower(mam_wg_maw_del_flg_ctl_W.tbl_nm) = 'mam_wg'))
;

