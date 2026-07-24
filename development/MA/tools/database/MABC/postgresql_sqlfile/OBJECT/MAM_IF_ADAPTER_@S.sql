\encoding UTF-8

CREATE OR REPLACE VIEW mam_if_adapter_$s(
	ext_sys_cd,
	if_proc_typ,
	st_dt,
	end_dt,
	conv_ope,
	file_io_ope,
	web_api_ope,
	cmd_exec_ope,
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
	mam_if_adapter_$s_mam_if_adapter_all_org.ext_sys_cd,
	mam_if_adapter_$s_mam_if_adapter_all_org.if_proc_typ,
	mam_if_adapter_$s_mam_if_adapter_all_org.st_dt,
	mam_if_adapter_$s_mam_if_adapter_all_org.end_dt,
	mam_if_adapter_$s_mam_if_adapter_all_org.conv_ope,
	mam_if_adapter_$s_mam_if_adapter_all_org.file_io_ope,
	mam_if_adapter_$s_mam_if_adapter_all_org.web_api_ope,
	mam_if_adapter_$s_mam_if_adapter_all_org.cmd_exec_ope,
	mam_if_adapter_$s_mam_if_adapter_all_org.memo1,
	mam_if_adapter_$s_mam_if_adapter_all_org.memo2,
	mam_if_adapter_$s_mam_if_adapter_all_org.memo3,
	mam_if_adapter_$s_mam_if_adapter_all_org.del_flg,
	mam_if_adapter_$s_mam_if_adapter_all_org.del_usr_id,
	mam_if_adapter_$s_mam_if_adapter_all_org.del_usr_nm,
	mam_if_adapter_$s_mam_if_adapter_all_org.del_ts,
	mam_if_adapter_$s_mam_if_adapter_all_org.ins_usr_id,
	mam_if_adapter_$s_mam_if_adapter_all_org.ins_usr_nm,
	mam_if_adapter_$s_mam_if_adapter_all_org.ins_ts,
	mam_if_adapter_$s_mam_if_adapter_all_org.ins_func_id,
	mam_if_adapter_$s_mam_if_adapter_all_org.upd_cntr,
	mam_if_adapter_$s_mam_if_adapter_all_org.upd_usr_id,
	mam_if_adapter_$s_mam_if_adapter_all_org.upd_usr_nm,
	mam_if_adapter_$s_mam_if_adapter_all_org.upd_ts,
	mam_if_adapter_$s_mam_if_adapter_all_org.upd_func_id,
	mam_if_adapter_$s_mam_if_adapter_all_org.upd_srv_req_no
FROM
	mam_if_adapter_all mam_if_adapter_$s_mam_if_adapter_all_org
WHERE
	0 = 0
	AND mam_if_adapter_$s_mam_if_adapter_all_org.co_cd = (SELECT co_cd FROM fct_context mam_if_adapter_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_if_adapter_$s_mam_if_adapter_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_if_adapter_$s_maw_del_flg_ctl_W WHERE lower(mam_if_adapter_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_if_adapter'))
;

