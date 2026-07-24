\encoding UTF-8

CREATE OR REPLACE VIEW mat_biz_dat_dl_hst_$u(
	biz_dat_dl_hst_no,
	biz_dat_dl_sts_typ,
	proc_st_tm,
	proc_end_tm,
	biz_dat_id,
	biz_dat_dl_cond,
	usr_cd,
	file_bin,
	file_size,
	data_cnt,
	dl_tm,
	dl_file_path,
	dl_file_nm,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no,
	biz_dat_file_typ
	)
AS
SELECT
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.biz_dat_dl_hst_no,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.biz_dat_dl_sts_typ,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.proc_st_tm,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.proc_end_tm,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.biz_dat_id,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.biz_dat_dl_cond,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.usr_cd,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.file_bin,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.file_size,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.data_cnt,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.dl_tm,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.dl_file_path,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.dl_file_nm,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.ins_usr_id,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.ins_usr_nm,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.ins_ts,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.ins_func_id,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.upd_cntr,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.upd_usr_id,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.upd_usr_nm,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.upd_ts,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.upd_func_id,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.upd_srv_req_no,
	mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.biz_dat_file_typ
FROM
	mat_biz_dat_dl_hst_all mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org
WHERE
	0 = 0
	AND mat_biz_dat_dl_hst_$u_mat_biz_dat_dl_hst_all_org.co_cd = fcpa_context$f_get_co_cd()
;

