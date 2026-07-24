\encoding UTF-8

CREATE OR REPLACE VIEW mam_grs_alloc_ctl_$u(
	alloc_grp_cd,
	itm_ship_grp_cd,
	lg_grp_cd,
	loc_cd,
	alloc_scope_typ,
	prio,
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
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.alloc_grp_cd,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.itm_ship_grp_cd,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.lg_grp_cd,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.loc_cd,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.alloc_scope_typ,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.prio,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.memo1,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.memo2,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.memo3,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.del_flg,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.del_usr_id,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.del_usr_nm,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.del_ts,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.ins_usr_id,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.ins_usr_nm,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.ins_ts,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.ins_func_id,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.upd_cntr,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.upd_usr_id,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.upd_usr_nm,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.upd_ts,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.upd_func_id,
	mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.upd_srv_req_no
FROM
	mam_grs_alloc_ctl_all mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org
WHERE
	0 = 0
	AND mam_grs_alloc_ctl_$u_mam_grs_alloc_ctl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

