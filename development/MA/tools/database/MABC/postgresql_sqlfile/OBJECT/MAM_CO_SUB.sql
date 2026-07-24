\encoding UTF-8

CREATE OR REPLACE VIEW mam_co_sub(
	co_cd,
	st_dt,
	end_dt,
	sls_tax_cd,
	purc_tax_cd,
	prov_tax_cd,
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
	mam_co_sub_mam_co_sub_all_org.co_cd,
	mam_co_sub_mam_co_sub_all_org.st_dt,
	mam_co_sub_mam_co_sub_all_org.end_dt,
	mam_co_sub_mam_co_sub_all_org.sls_tax_cd,
	mam_co_sub_mam_co_sub_all_org.purc_tax_cd,
	mam_co_sub_mam_co_sub_all_org.prov_tax_cd,
	mam_co_sub_mam_co_sub_all_org.memo1,
	mam_co_sub_mam_co_sub_all_org.memo2,
	mam_co_sub_mam_co_sub_all_org.memo3,
	mam_co_sub_mam_co_sub_all_org.ins_usr_id,
	mam_co_sub_mam_co_sub_all_org.ins_usr_nm,
	mam_co_sub_mam_co_sub_all_org.ins_ts,
	mam_co_sub_mam_co_sub_all_org.ins_func_id,
	mam_co_sub_mam_co_sub_all_org.upd_cntr,
	mam_co_sub_mam_co_sub_all_org.upd_usr_id,
	mam_co_sub_mam_co_sub_all_org.upd_usr_nm,
	mam_co_sub_mam_co_sub_all_org.upd_ts,
	mam_co_sub_mam_co_sub_all_org.upd_func_id,
	mam_co_sub_mam_co_sub_all_org.upd_srv_req_no
FROM
	mam_co_sub_all mam_co_sub_mam_co_sub_all_org
WHERE
	0 = 0
	AND mam_co_sub_mam_co_sub_all_org.co_cd = (SELECT co_cd FROM fct_context mam_co_sub_fct_context WHERE pid = pg_backend_pid())
;

