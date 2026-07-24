\encoding UTF-8

CREATE OR REPLACE VIEW mam_alc_ptn_lcl_$u(
	alc_ptn_cd,
	alc_ptn_nm,
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
	upd_srv_req_no,
	lcl_cd
	)
AS
SELECT
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.alc_ptn_cd,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.alc_ptn_nm,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.memo1,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.memo2,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.memo3,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.ins_usr_id,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.ins_usr_nm,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.ins_ts,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.ins_func_id,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.upd_cntr,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.upd_usr_id,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.upd_usr_nm,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.upd_ts,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.upd_func_id,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.upd_srv_req_no,
	mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.lcl_cd
FROM
	mam_alc_ptn_lcl_all mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org
WHERE
	0 = 0
	AND mam_alc_ptn_lcl_$u_mam_alc_ptn_lcl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

