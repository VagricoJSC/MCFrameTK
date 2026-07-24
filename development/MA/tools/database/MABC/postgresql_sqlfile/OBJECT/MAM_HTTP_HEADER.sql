\encoding UTF-8

CREATE OR REPLACE VIEW mam_http_header(
	ext_sys_cd,
	if_proc_typ,
	http_header_nm,
	http_header_val,
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
	mam_http_header_mam_http_header_all_org.ext_sys_cd,
	mam_http_header_mam_http_header_all_org.if_proc_typ,
	mam_http_header_mam_http_header_all_org.http_header_nm,
	mam_http_header_mam_http_header_all_org.http_header_val,
	mam_http_header_mam_http_header_all_org.memo1,
	mam_http_header_mam_http_header_all_org.memo2,
	mam_http_header_mam_http_header_all_org.memo3,
	mam_http_header_mam_http_header_all_org.del_flg,
	mam_http_header_mam_http_header_all_org.del_usr_id,
	mam_http_header_mam_http_header_all_org.del_usr_nm,
	mam_http_header_mam_http_header_all_org.del_ts,
	mam_http_header_mam_http_header_all_org.ins_usr_id,
	mam_http_header_mam_http_header_all_org.ins_usr_nm,
	mam_http_header_mam_http_header_all_org.ins_ts,
	mam_http_header_mam_http_header_all_org.ins_func_id,
	mam_http_header_mam_http_header_all_org.upd_cntr,
	mam_http_header_mam_http_header_all_org.upd_usr_id,
	mam_http_header_mam_http_header_all_org.upd_usr_nm,
	mam_http_header_mam_http_header_all_org.upd_ts,
	mam_http_header_mam_http_header_all_org.upd_func_id,
	mam_http_header_mam_http_header_all_org.upd_srv_req_no
FROM
	mam_http_header_all mam_http_header_mam_http_header_all_org
WHERE
	0 = 0
	AND mam_http_header_mam_http_header_all_org.co_cd = (SELECT co_cd FROM fct_context mam_http_header_fct_context WHERE pid = pg_backend_pid())
	AND (mam_http_header_mam_http_header_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_http_header_maw_del_flg_ctl_W WHERE lower(mam_http_header_maw_del_flg_ctl_W.tbl_nm) = 'mam_http_header'))
;

