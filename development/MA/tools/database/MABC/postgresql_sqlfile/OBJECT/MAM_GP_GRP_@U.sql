\encoding UTF-8

CREATE OR REPLACE VIEW mam_gp_grp_$u(
	gp_grp_cd,
	gp_grp_nm,
	auth_str_srch,
	auth_str_upd,
	auth_str_del,
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
	mam_gp_grp_$u_mam_gp_grp_all_org.gp_grp_cd,
	mam_gp_grp_$u_mam_gp_grp_all_org.gp_grp_nm,
	mam_gp_grp_$u_mam_gp_grp_all_org.auth_str_srch,
	mam_gp_grp_$u_mam_gp_grp_all_org.auth_str_upd,
	mam_gp_grp_$u_mam_gp_grp_all_org.auth_str_del,
	mam_gp_grp_$u_mam_gp_grp_all_org.memo1,
	mam_gp_grp_$u_mam_gp_grp_all_org.memo2,
	mam_gp_grp_$u_mam_gp_grp_all_org.memo3,
	mam_gp_grp_$u_mam_gp_grp_all_org.del_flg,
	mam_gp_grp_$u_mam_gp_grp_all_org.del_usr_id,
	mam_gp_grp_$u_mam_gp_grp_all_org.del_usr_nm,
	mam_gp_grp_$u_mam_gp_grp_all_org.del_ts,
	mam_gp_grp_$u_mam_gp_grp_all_org.ins_usr_id,
	mam_gp_grp_$u_mam_gp_grp_all_org.ins_usr_nm,
	mam_gp_grp_$u_mam_gp_grp_all_org.ins_ts,
	mam_gp_grp_$u_mam_gp_grp_all_org.ins_func_id,
	mam_gp_grp_$u_mam_gp_grp_all_org.upd_cntr,
	mam_gp_grp_$u_mam_gp_grp_all_org.upd_usr_id,
	mam_gp_grp_$u_mam_gp_grp_all_org.upd_usr_nm,
	mam_gp_grp_$u_mam_gp_grp_all_org.upd_ts,
	mam_gp_grp_$u_mam_gp_grp_all_org.upd_func_id,
	mam_gp_grp_$u_mam_gp_grp_all_org.upd_srv_req_no
FROM
	mam_gp_grp_all mam_gp_grp_$u_mam_gp_grp_all_org
WHERE
	0 = 0
	AND mam_gp_grp_$u_mam_gp_grp_all_org.co_cd = fcpa_context$f_get_co_cd()
;

