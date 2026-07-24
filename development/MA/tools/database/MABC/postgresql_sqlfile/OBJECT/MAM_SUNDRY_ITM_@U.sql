\encoding UTF-8

CREATE OR REPLACE VIEW mam_sundry_itm_$u(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	sno1,
	sno2,
	sno3,
	sno4,
	itm_nm,
	memo1,
	memo2,
	memo3,
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
	mam_sundry_itm_$u_mam_sundry_itm_all_org.itm_cd,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.itm_sub1,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.itm_sub2,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.itm_sub3,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.sno1,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.sno2,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.sno3,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.sno4,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.itm_nm,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.memo1,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.memo2,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.memo3,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.ins_usr_id,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.ins_usr_nm,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.ins_ts,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.ins_func_id,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.upd_cntr,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.upd_usr_id,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.upd_usr_nm,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.upd_ts,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.upd_func_id,
	mam_sundry_itm_$u_mam_sundry_itm_all_org.upd_srv_req_no
FROM
	mam_sundry_itm_all mam_sundry_itm_$u_mam_sundry_itm_all_org
WHERE
	0 = 0
	AND mam_sundry_itm_$u_mam_sundry_itm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

