\encoding UTF-8

CREATE OR REPLACE VIEW mam_alloc_ctl_$u(
	to_loc_cd,
	fr_loc_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	prio,
	xfr_lot_unit_qty,
	in_loc_flg,
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
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.to_loc_cd,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.fr_loc_cd,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.itm_cd,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.itm_sub1,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.itm_sub2,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.itm_sub3,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.prio,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.xfr_lot_unit_qty,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.in_loc_flg,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.memo1,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.memo2,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.memo3,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.del_flg,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.del_usr_id,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.del_usr_nm,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.del_ts,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.ins_usr_id,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.ins_usr_nm,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.ins_ts,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.ins_func_id,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.upd_cntr,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.upd_usr_id,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.upd_usr_nm,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.upd_ts,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.upd_func_id,
	mam_alloc_ctl_$u_mam_alloc_ctl_all_org.upd_srv_req_no
FROM
	mam_alloc_ctl_all mam_alloc_ctl_$u_mam_alloc_ctl_all_org
WHERE
	0 = 0
	AND mam_alloc_ctl_$u_mam_alloc_ctl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

