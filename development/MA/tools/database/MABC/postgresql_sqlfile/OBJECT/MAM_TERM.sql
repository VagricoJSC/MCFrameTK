\encoding UTF-8

CREATE OR REPLACE VIEW mam_term(
	term,
	term_end_ym,
	term_nm,
	base_term_nm,
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
	mam_term_mam_term_all_org.term,
	mam_term_mam_term_all_org.term_end_ym,
	mam_term_mam_term_lcl_all_lcl.term_nm,
	mam_term_mam_term_all_org.term_nm AS base_term_nm,
	mam_term_mam_term_all_org.memo1,
	mam_term_mam_term_all_org.memo2,
	mam_term_mam_term_all_org.memo3,
	mam_term_mam_term_all_org.del_flg,
	mam_term_mam_term_all_org.del_usr_id,
	mam_term_mam_term_all_org.del_usr_nm,
	mam_term_mam_term_all_org.del_ts,
	mam_term_mam_term_all_org.ins_usr_id,
	mam_term_mam_term_all_org.ins_usr_nm,
	mam_term_mam_term_all_org.ins_ts,
	mam_term_mam_term_all_org.ins_func_id,
	mam_term_mam_term_all_org.upd_cntr,
	mam_term_mam_term_all_org.upd_usr_id,
	mam_term_mam_term_all_org.upd_usr_nm,
	mam_term_mam_term_all_org.upd_ts,
	mam_term_mam_term_all_org.upd_func_id,
	mam_term_mam_term_all_org.upd_srv_req_no
FROM
	mam_term_all mam_term_mam_term_all_org
LEFT OUTER JOIN
	mam_term_lcl_all mam_term_mam_term_lcl_all_lcl
ON
	mam_term_mam_term_all_org.term = mam_term_mam_term_lcl_all_lcl.term
	AND mam_term_mam_term_all_org.co_cd = mam_term_mam_term_lcl_all_lcl.co_cd
	AND mam_term_mam_term_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_term_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_term_mam_term_all_org.co_cd = (SELECT co_cd FROM fct_context mam_term_fct_context WHERE pid = pg_backend_pid())
	AND (mam_term_mam_term_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_term_maw_del_flg_ctl_W WHERE lower(mam_term_maw_del_flg_ctl_W.tbl_nm) = 'mam_term'))
;

