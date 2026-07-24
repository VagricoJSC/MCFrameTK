\encoding UTF-8

CREATE OR REPLACE VIEW mam_wg_rqst_ctl(
	to_wg_cd,
	fr_wg_cd,
	wg_rqst_typ,
	fr_dpt_cd,
	cst_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	auto_prms_flg,
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
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.to_wg_cd,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.fr_wg_cd,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.wg_rqst_typ,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.fr_dpt_cd,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.cst_cd,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.itm_cd,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.itm_sub1,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.itm_sub2,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.itm_sub3,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.auto_prms_flg,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.memo1,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.memo2,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.memo3,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.del_flg,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.del_usr_id,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.del_usr_nm,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.del_ts,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.ins_usr_id,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.ins_usr_nm,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.ins_ts,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.ins_func_id,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.upd_cntr,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.upd_usr_id,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.upd_usr_nm,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.upd_ts,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.upd_func_id,
	mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.upd_srv_req_no
FROM
	mam_wg_rqst_ctl_all mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org
WHERE
	0 = 0
	AND mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_wg_rqst_ctl_fct_context WHERE pid = pg_backend_pid())
	AND (mam_wg_rqst_ctl_mam_wg_rqst_ctl_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_wg_rqst_ctl_maw_del_flg_ctl_W WHERE lower(mam_wg_rqst_ctl_maw_del_flg_ctl_W.tbl_nm) = 'mam_wg_rqst_ctl'))
;

