\encoding UTF-8

CREATE OR REPLACE VIEW mam_ext_sys_usr_$s(
	ext_sys_cd,
	usr_cd,
	ext_sys_usr_cd,
	ext_sys_pass,
	ext_sys_str1,
	ext_sys_str2,
	ext_sys_str3,
	ext_sys_str4,
	ext_sys_str5,
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
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ext_sys_cd,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.usr_cd,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ext_sys_usr_cd,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ext_sys_pass,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ext_sys_str1,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ext_sys_str2,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ext_sys_str3,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ext_sys_str4,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ext_sys_str5,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.memo1,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.memo2,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.memo3,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.del_flg,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.del_usr_id,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.del_usr_nm,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.del_ts,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ins_usr_id,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ins_usr_nm,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ins_ts,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.ins_func_id,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.upd_cntr,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.upd_usr_id,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.upd_usr_nm,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.upd_ts,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.upd_func_id,
	mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.upd_srv_req_no
FROM
	mam_ext_sys_usr_all mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org
WHERE
	0 = 0
	AND mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.co_cd = (SELECT co_cd FROM fct_context mam_ext_sys_usr_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_ext_sys_usr_$s_mam_ext_sys_usr_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_ext_sys_usr_$s_maw_del_flg_ctl_W WHERE lower(mam_ext_sys_usr_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_ext_sys_usr'))
;

