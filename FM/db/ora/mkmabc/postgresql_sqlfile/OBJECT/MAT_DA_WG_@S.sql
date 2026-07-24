\encoding UTF-8

CREATE OR REPLACE VIEW mat_da_wg_$s(
	login_seq,
	wg_cd,
	rd_flg,
	wr_flg,
	usr_id,
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
	mat_da_wg_$s_mat_da_wg_all_org.login_seq,
	mat_da_wg_$s_mat_da_wg_all_org.wg_cd,
	mat_da_wg_$s_mat_da_wg_all_org.rd_flg,
	mat_da_wg_$s_mat_da_wg_all_org.wr_flg,
	mat_da_wg_$s_mat_da_wg_all_org.usr_id,
	mat_da_wg_$s_mat_da_wg_all_org.ins_usr_id,
	mat_da_wg_$s_mat_da_wg_all_org.ins_usr_nm,
	mat_da_wg_$s_mat_da_wg_all_org.ins_ts,
	mat_da_wg_$s_mat_da_wg_all_org.ins_func_id,
	mat_da_wg_$s_mat_da_wg_all_org.upd_cntr,
	mat_da_wg_$s_mat_da_wg_all_org.upd_usr_id,
	mat_da_wg_$s_mat_da_wg_all_org.upd_usr_nm,
	mat_da_wg_$s_mat_da_wg_all_org.upd_ts,
	mat_da_wg_$s_mat_da_wg_all_org.upd_func_id,
	mat_da_wg_$s_mat_da_wg_all_org.upd_srv_req_no
FROM
	mat_da_wg_all mat_da_wg_$s_mat_da_wg_all_org
WHERE
	0 = 0
	AND mat_da_wg_$s_mat_da_wg_all_org.co_cd = (SELECT co_cd FROM fct_context mat_da_wg_$s_fct_context WHERE pid = pg_backend_pid())
;

