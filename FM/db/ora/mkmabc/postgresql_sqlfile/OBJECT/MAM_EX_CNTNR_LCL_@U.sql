\encoding UTF-8

CREATE OR REPLACE VIEW mam_ex_cntnr_lcl_$u(
	cntnr_cd,
	cntnr_nm,
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
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.cntnr_cd,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.cntnr_nm,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.memo1,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.memo2,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.memo3,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.ins_usr_id,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.ins_usr_nm,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.ins_ts,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.ins_func_id,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.upd_cntr,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.upd_usr_id,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.upd_usr_nm,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.upd_ts,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.upd_func_id,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.upd_srv_req_no,
	mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.lcl_cd
FROM
	mam_ex_cntnr_lcl_all mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org
WHERE
	0 = 0
	AND mam_ex_cntnr_lcl_$u_mam_ex_cntnr_lcl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

