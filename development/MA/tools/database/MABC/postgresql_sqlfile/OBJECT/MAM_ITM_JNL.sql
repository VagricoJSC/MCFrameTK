\encoding UTF-8

CREATE OR REPLACE VIEW mam_itm_jnl(
	itm_jnl_cd,
	itm_jnl_nm,
	base_itm_jnl_nm,
	ar_typ,
	ap_typ,
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
	mam_itm_jnl_mam_itm_jnl_all_org.itm_jnl_cd,
	mam_itm_jnl_mam_itm_jnl_lcl_all_lcl.itm_jnl_nm,
	mam_itm_jnl_mam_itm_jnl_all_org.itm_jnl_nm AS base_itm_jnl_nm,
	mam_itm_jnl_mam_itm_jnl_all_org.ar_typ,
	mam_itm_jnl_mam_itm_jnl_all_org.ap_typ,
	mam_itm_jnl_mam_itm_jnl_all_org.memo1,
	mam_itm_jnl_mam_itm_jnl_all_org.memo2,
	mam_itm_jnl_mam_itm_jnl_all_org.memo3,
	mam_itm_jnl_mam_itm_jnl_all_org.del_flg,
	mam_itm_jnl_mam_itm_jnl_all_org.del_usr_id,
	mam_itm_jnl_mam_itm_jnl_all_org.del_usr_nm,
	mam_itm_jnl_mam_itm_jnl_all_org.del_ts,
	mam_itm_jnl_mam_itm_jnl_all_org.ins_usr_id,
	mam_itm_jnl_mam_itm_jnl_all_org.ins_usr_nm,
	mam_itm_jnl_mam_itm_jnl_all_org.ins_ts,
	mam_itm_jnl_mam_itm_jnl_all_org.ins_func_id,
	mam_itm_jnl_mam_itm_jnl_all_org.upd_cntr,
	mam_itm_jnl_mam_itm_jnl_all_org.upd_usr_id,
	mam_itm_jnl_mam_itm_jnl_all_org.upd_usr_nm,
	mam_itm_jnl_mam_itm_jnl_all_org.upd_ts,
	mam_itm_jnl_mam_itm_jnl_all_org.upd_func_id,
	mam_itm_jnl_mam_itm_jnl_all_org.upd_srv_req_no
FROM
	mam_itm_jnl_all mam_itm_jnl_mam_itm_jnl_all_org
LEFT OUTER JOIN
	mam_itm_jnl_lcl_all mam_itm_jnl_mam_itm_jnl_lcl_all_lcl
ON
	mam_itm_jnl_mam_itm_jnl_all_org.itm_jnl_cd = mam_itm_jnl_mam_itm_jnl_lcl_all_lcl.itm_jnl_cd
	AND mam_itm_jnl_mam_itm_jnl_all_org.co_cd = mam_itm_jnl_mam_itm_jnl_lcl_all_lcl.co_cd
	AND mam_itm_jnl_mam_itm_jnl_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_itm_jnl_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_itm_jnl_mam_itm_jnl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_itm_jnl_fct_context WHERE pid = pg_backend_pid())
	AND (mam_itm_jnl_mam_itm_jnl_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_itm_jnl_maw_del_flg_ctl_W WHERE lower(mam_itm_jnl_maw_del_flg_ctl_W.tbl_nm) = 'mam_itm_jnl'))
;

