\encoding UTF-8

CREATE OR REPLACE VIEW mam_itm_wg(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	wg_cd,
	mfg_inst_unit_typ,
	mrp_proc_typ,
	rqmt_typ,
	prod_pln_typ,
	dmnd_date_div_mons,
	alloc_margin_days,
	mrp_alloc_margin_days,
	mrp_opn_xfr_days,
	rqmt_rstr_qty,
	inpt_itm_add_typ,
	inpt_itm_del_typ,
	sch_tgt_typ,
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
	mam_itm_wg_mam_itm_wg_all_org.itm_cd,
	mam_itm_wg_mam_itm_wg_all_org.itm_sub1,
	mam_itm_wg_mam_itm_wg_all_org.itm_sub2,
	mam_itm_wg_mam_itm_wg_all_org.itm_sub3,
	mam_itm_wg_mam_itm_wg_all_org.wg_cd,
	mam_itm_wg_mam_itm_wg_all_org.mfg_inst_unit_typ,
	mam_itm_wg_mam_itm_wg_all_org.mrp_proc_typ,
	mam_itm_wg_mam_itm_wg_all_org.rqmt_typ,
	mam_itm_wg_mam_itm_wg_all_org.prod_pln_typ,
	mam_itm_wg_mam_itm_wg_all_org.dmnd_date_div_mons,
	mam_itm_wg_mam_itm_wg_all_org.alloc_margin_days,
	mam_itm_wg_mam_itm_wg_all_org.mrp_alloc_margin_days,
	mam_itm_wg_mam_itm_wg_all_org.mrp_opn_xfr_days,
	mam_itm_wg_mam_itm_wg_all_org.rqmt_rstr_qty,
	mam_itm_wg_mam_itm_wg_all_org.inpt_itm_add_typ,
	mam_itm_wg_mam_itm_wg_all_org.inpt_itm_del_typ,
	mam_itm_wg_mam_itm_wg_all_org.sch_tgt_typ,
	mam_itm_wg_mam_itm_wg_all_org.memo1,
	mam_itm_wg_mam_itm_wg_all_org.memo2,
	mam_itm_wg_mam_itm_wg_all_org.memo3,
	mam_itm_wg_mam_itm_wg_all_org.del_flg,
	mam_itm_wg_mam_itm_wg_all_org.del_usr_id,
	mam_itm_wg_mam_itm_wg_all_org.del_usr_nm,
	mam_itm_wg_mam_itm_wg_all_org.del_ts,
	mam_itm_wg_mam_itm_wg_all_org.ins_usr_id,
	mam_itm_wg_mam_itm_wg_all_org.ins_usr_nm,
	mam_itm_wg_mam_itm_wg_all_org.ins_ts,
	mam_itm_wg_mam_itm_wg_all_org.ins_func_id,
	mam_itm_wg_mam_itm_wg_all_org.upd_cntr,
	mam_itm_wg_mam_itm_wg_all_org.upd_usr_id,
	mam_itm_wg_mam_itm_wg_all_org.upd_usr_nm,
	mam_itm_wg_mam_itm_wg_all_org.upd_ts,
	mam_itm_wg_mam_itm_wg_all_org.upd_func_id,
	mam_itm_wg_mam_itm_wg_all_org.upd_srv_req_no
FROM
	mam_itm_wg_all mam_itm_wg_mam_itm_wg_all_org
WHERE
	0 = 0
	AND mam_itm_wg_mam_itm_wg_all_org.co_cd = (SELECT co_cd FROM fct_context mam_itm_wg_fct_context WHERE pid = pg_backend_pid())
	AND (mam_itm_wg_mam_itm_wg_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_itm_wg_maw_del_flg_ctl_W WHERE lower(mam_itm_wg_maw_del_flg_ctl_W.tbl_nm) = 'mam_itm_wg'))
	AND (1=MAPA_CONTEXT$F_ITM_WG()) --MAVM_ITM_WGを使用する;

