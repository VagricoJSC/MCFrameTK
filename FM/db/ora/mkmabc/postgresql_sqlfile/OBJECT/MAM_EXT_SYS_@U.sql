\encoding UTF-8

CREATE OR REPLACE VIEW mam_ext_sys_$u(
	ext_sys_cd,
	ext_sys_nm,
	ext_sys_typ,
	web_api_flg,
	cmd_exec_flg,
	real_imp_flg,
	not_send_upd_flg,
	not_dup_imp_flg,
	if_upd_typ,
	dlv_slip_split_flg,
	null_val_if_flg,
	upri_not_chk_flg,
	amt_not_chk_flg,
	tax_not_chk_flg,
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
	mam_ext_sys_$u_mam_ext_sys_all_org.ext_sys_cd,
	mam_ext_sys_$u_mam_ext_sys_all_org.ext_sys_nm,
	mam_ext_sys_$u_mam_ext_sys_all_org.ext_sys_typ,
	mam_ext_sys_$u_mam_ext_sys_all_org.web_api_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.cmd_exec_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.real_imp_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.not_send_upd_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.not_dup_imp_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.if_upd_typ,
	mam_ext_sys_$u_mam_ext_sys_all_org.dlv_slip_split_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.null_val_if_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.upri_not_chk_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.amt_not_chk_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.tax_not_chk_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.memo1,
	mam_ext_sys_$u_mam_ext_sys_all_org.memo2,
	mam_ext_sys_$u_mam_ext_sys_all_org.memo3,
	mam_ext_sys_$u_mam_ext_sys_all_org.del_flg,
	mam_ext_sys_$u_mam_ext_sys_all_org.del_usr_id,
	mam_ext_sys_$u_mam_ext_sys_all_org.del_usr_nm,
	mam_ext_sys_$u_mam_ext_sys_all_org.del_ts,
	mam_ext_sys_$u_mam_ext_sys_all_org.ins_usr_id,
	mam_ext_sys_$u_mam_ext_sys_all_org.ins_usr_nm,
	mam_ext_sys_$u_mam_ext_sys_all_org.ins_ts,
	mam_ext_sys_$u_mam_ext_sys_all_org.ins_func_id,
	mam_ext_sys_$u_mam_ext_sys_all_org.upd_cntr,
	mam_ext_sys_$u_mam_ext_sys_all_org.upd_usr_id,
	mam_ext_sys_$u_mam_ext_sys_all_org.upd_usr_nm,
	mam_ext_sys_$u_mam_ext_sys_all_org.upd_ts,
	mam_ext_sys_$u_mam_ext_sys_all_org.upd_func_id,
	mam_ext_sys_$u_mam_ext_sys_all_org.upd_srv_req_no
FROM
	mam_ext_sys_all mam_ext_sys_$u_mam_ext_sys_all_org
WHERE
	0 = 0
	AND mam_ext_sys_$u_mam_ext_sys_all_org.co_cd = fcpa_context$f_get_co_cd()
;

