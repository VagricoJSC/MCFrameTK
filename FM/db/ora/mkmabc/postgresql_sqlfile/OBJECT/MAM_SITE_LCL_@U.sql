\encoding UTF-8

CREATE OR REPLACE VIEW mam_site_lcl_$u(
	site_cd,
	site_nm,
	zip_cd,
	addr1,
	addr2,
	addr3,
	addr4,
	tel,
	fax,
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
	mam_site_lcl_$u_mam_site_lcl_all_org.site_cd,
	mam_site_lcl_$u_mam_site_lcl_all_org.site_nm,
	mam_site_lcl_$u_mam_site_lcl_all_org.zip_cd,
	mam_site_lcl_$u_mam_site_lcl_all_org.addr1,
	mam_site_lcl_$u_mam_site_lcl_all_org.addr2,
	mam_site_lcl_$u_mam_site_lcl_all_org.addr3,
	mam_site_lcl_$u_mam_site_lcl_all_org.addr4,
	mam_site_lcl_$u_mam_site_lcl_all_org.tel,
	mam_site_lcl_$u_mam_site_lcl_all_org.fax,
	mam_site_lcl_$u_mam_site_lcl_all_org.memo1,
	mam_site_lcl_$u_mam_site_lcl_all_org.memo2,
	mam_site_lcl_$u_mam_site_lcl_all_org.memo3,
	mam_site_lcl_$u_mam_site_lcl_all_org.ins_usr_id,
	mam_site_lcl_$u_mam_site_lcl_all_org.ins_usr_nm,
	mam_site_lcl_$u_mam_site_lcl_all_org.ins_ts,
	mam_site_lcl_$u_mam_site_lcl_all_org.ins_func_id,
	mam_site_lcl_$u_mam_site_lcl_all_org.upd_cntr,
	mam_site_lcl_$u_mam_site_lcl_all_org.upd_usr_id,
	mam_site_lcl_$u_mam_site_lcl_all_org.upd_usr_nm,
	mam_site_lcl_$u_mam_site_lcl_all_org.upd_ts,
	mam_site_lcl_$u_mam_site_lcl_all_org.upd_func_id,
	mam_site_lcl_$u_mam_site_lcl_all_org.upd_srv_req_no,
	mam_site_lcl_$u_mam_site_lcl_all_org.lcl_cd
FROM
	mam_site_lcl_all mam_site_lcl_$u_mam_site_lcl_all_org
WHERE
	0 = 0
	AND mam_site_lcl_$u_mam_site_lcl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

