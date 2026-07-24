\encoding UTF-8

CREATE OR REPLACE VIEW mam_cur_lcl(
	cur_cd,
	cur_nm,
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
	mam_cur_lcl_mam_cur_lcl_all_org.cur_cd,
	mam_cur_lcl_mam_cur_lcl_all_org.cur_nm,
	mam_cur_lcl_mam_cur_lcl_all_org.memo1,
	mam_cur_lcl_mam_cur_lcl_all_org.memo2,
	mam_cur_lcl_mam_cur_lcl_all_org.memo3,
	mam_cur_lcl_mam_cur_lcl_all_org.ins_usr_id,
	mam_cur_lcl_mam_cur_lcl_all_org.ins_usr_nm,
	mam_cur_lcl_mam_cur_lcl_all_org.ins_ts,
	mam_cur_lcl_mam_cur_lcl_all_org.ins_func_id,
	mam_cur_lcl_mam_cur_lcl_all_org.upd_cntr,
	mam_cur_lcl_mam_cur_lcl_all_org.upd_usr_id,
	mam_cur_lcl_mam_cur_lcl_all_org.upd_usr_nm,
	mam_cur_lcl_mam_cur_lcl_all_org.upd_ts,
	mam_cur_lcl_mam_cur_lcl_all_org.upd_func_id,
	mam_cur_lcl_mam_cur_lcl_all_org.upd_srv_req_no,
	mam_cur_lcl_mam_cur_lcl_all_org.lcl_cd
FROM
	mam_cur_lcl_all mam_cur_lcl_mam_cur_lcl_all_org
WHERE
	0 = 0
	AND mam_cur_lcl_mam_cur_lcl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_cur_lcl_fct_context WHERE pid = pg_backend_pid())
;

