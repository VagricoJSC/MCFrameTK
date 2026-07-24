\encoding UTF-8

CREATE OR REPLACE VIEW mat_blnk_bat_cntl_$s(
	if_proc_typ,
	bat_exec_flg,
	exec_co_cd,
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
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.if_proc_typ,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.bat_exec_flg,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.exec_co_cd,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.ins_usr_id,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.ins_usr_nm,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.ins_ts,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.ins_func_id,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.upd_cntr,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.upd_usr_id,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.upd_usr_nm,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.upd_ts,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.upd_func_id,
	mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.upd_srv_req_no
FROM
	mat_blnk_bat_cntl_all mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org
WHERE
	0 = 0
	AND mat_blnk_bat_cntl_$s_mat_blnk_bat_cntl_all_org.co_cd = (SELECT co_cd FROM fct_context mat_blnk_bat_cntl_$s_fct_context WHERE pid = pg_backend_pid())
;

