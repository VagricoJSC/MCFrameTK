\encoding UTF-8

CREATE OR REPLACE VIEW mam_set_itm_$u(
	set_grp_cd,
	main_itm_cd,
	main_itm_sub1,
	main_itm_sub2,
	main_itm_sub3,
	main_itm_unit_cd,
	set_itm_cd,
	set_itm_sub1,
	set_itm_sub2,
	set_itm_sub3,
	set_itm_unit_cd,
	main_itm_qty,
	set_itm_qty,
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
	mam_set_itm_$u_mam_set_itm_all_org.set_grp_cd,
	mam_set_itm_$u_mam_set_itm_all_org.main_itm_cd,
	mam_set_itm_$u_mam_set_itm_all_org.main_itm_sub1,
	mam_set_itm_$u_mam_set_itm_all_org.main_itm_sub2,
	mam_set_itm_$u_mam_set_itm_all_org.main_itm_sub3,
	mam_set_itm_$u_mam_set_itm_all_org.main_itm_unit_cd,
	mam_set_itm_$u_mam_set_itm_all_org.set_itm_cd,
	mam_set_itm_$u_mam_set_itm_all_org.set_itm_sub1,
	mam_set_itm_$u_mam_set_itm_all_org.set_itm_sub2,
	mam_set_itm_$u_mam_set_itm_all_org.set_itm_sub3,
	mam_set_itm_$u_mam_set_itm_all_org.set_itm_unit_cd,
	mam_set_itm_$u_mam_set_itm_all_org.main_itm_qty,
	mam_set_itm_$u_mam_set_itm_all_org.set_itm_qty,
	mam_set_itm_$u_mam_set_itm_all_org.memo1,
	mam_set_itm_$u_mam_set_itm_all_org.memo2,
	mam_set_itm_$u_mam_set_itm_all_org.memo3,
	mam_set_itm_$u_mam_set_itm_all_org.del_flg,
	mam_set_itm_$u_mam_set_itm_all_org.del_usr_id,
	mam_set_itm_$u_mam_set_itm_all_org.del_usr_nm,
	mam_set_itm_$u_mam_set_itm_all_org.del_ts,
	mam_set_itm_$u_mam_set_itm_all_org.ins_usr_id,
	mam_set_itm_$u_mam_set_itm_all_org.ins_usr_nm,
	mam_set_itm_$u_mam_set_itm_all_org.ins_ts,
	mam_set_itm_$u_mam_set_itm_all_org.ins_func_id,
	mam_set_itm_$u_mam_set_itm_all_org.upd_cntr,
	mam_set_itm_$u_mam_set_itm_all_org.upd_usr_id,
	mam_set_itm_$u_mam_set_itm_all_org.upd_usr_nm,
	mam_set_itm_$u_mam_set_itm_all_org.upd_ts,
	mam_set_itm_$u_mam_set_itm_all_org.upd_func_id,
	mam_set_itm_$u_mam_set_itm_all_org.upd_srv_req_no
FROM
	mam_set_itm_all mam_set_itm_$u_mam_set_itm_all_org
WHERE
	0 = 0
	AND mam_set_itm_$u_mam_set_itm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

