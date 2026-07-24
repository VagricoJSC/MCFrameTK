\encoding UTF-8

CREATE OR REPLACE VIEW mam_aprv_role(
	aprv_role_cd,
	aprv_role_nm,
	base_aprv_role_nm,
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
	mam_aprv_role_mam_aprv_role_all_org.aprv_role_cd,
	mam_aprv_role_mam_aprv_role_lcl_all_lcl.aprv_role_nm,
	mam_aprv_role_mam_aprv_role_all_org.aprv_role_nm AS base_aprv_role_nm,
	mam_aprv_role_mam_aprv_role_all_org.memo1,
	mam_aprv_role_mam_aprv_role_all_org.memo2,
	mam_aprv_role_mam_aprv_role_all_org.memo3,
	mam_aprv_role_mam_aprv_role_all_org.del_flg,
	mam_aprv_role_mam_aprv_role_all_org.del_usr_id,
	mam_aprv_role_mam_aprv_role_all_org.del_usr_nm,
	mam_aprv_role_mam_aprv_role_all_org.del_ts,
	mam_aprv_role_mam_aprv_role_all_org.ins_usr_id,
	mam_aprv_role_mam_aprv_role_all_org.ins_usr_nm,
	mam_aprv_role_mam_aprv_role_all_org.ins_ts,
	mam_aprv_role_mam_aprv_role_all_org.ins_func_id,
	mam_aprv_role_mam_aprv_role_all_org.upd_cntr,
	mam_aprv_role_mam_aprv_role_all_org.upd_usr_id,
	mam_aprv_role_mam_aprv_role_all_org.upd_usr_nm,
	mam_aprv_role_mam_aprv_role_all_org.upd_ts,
	mam_aprv_role_mam_aprv_role_all_org.upd_func_id,
	mam_aprv_role_mam_aprv_role_all_org.upd_srv_req_no
FROM
	mam_aprv_role_all mam_aprv_role_mam_aprv_role_all_org
LEFT OUTER JOIN
	mam_aprv_role_lcl_all mam_aprv_role_mam_aprv_role_lcl_all_lcl
ON
	mam_aprv_role_mam_aprv_role_all_org.aprv_role_cd = mam_aprv_role_mam_aprv_role_lcl_all_lcl.aprv_role_cd
	AND mam_aprv_role_mam_aprv_role_all_org.co_cd = mam_aprv_role_mam_aprv_role_lcl_all_lcl.co_cd
	AND mam_aprv_role_mam_aprv_role_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_aprv_role_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_aprv_role_mam_aprv_role_all_org.co_cd = (SELECT co_cd FROM fct_context mam_aprv_role_fct_context WHERE pid = pg_backend_pid())
	AND (mam_aprv_role_mam_aprv_role_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_aprv_role_maw_del_flg_ctl_W WHERE lower(mam_aprv_role_maw_del_flg_ctl_W.tbl_nm) = 'mam_aprv_role'))
;

