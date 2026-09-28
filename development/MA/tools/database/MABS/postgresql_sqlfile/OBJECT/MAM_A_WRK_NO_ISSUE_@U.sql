\encoding UTF-8

CREATE OR REPLACE VIEW mam_a_wrk_no_issue_$u(
	issue_typ,
	dept_cd,
	prod_cd,
	ym,
	ope_typ,
	wrk_seq,
	wrk_sub_seq,
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
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.issue_typ,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.dept_cd,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.prod_cd,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.ym,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.ope_typ,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.wrk_seq,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.wrk_sub_seq,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.ins_usr_id,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.ins_usr_nm,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.ins_ts,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.ins_func_id,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.upd_cntr,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.upd_usr_id,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.upd_usr_nm,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.upd_ts,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.upd_func_id,
	mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.upd_srv_req_no
FROM
	mam_a_wrk_no_issue_all mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org
WHERE
	0 = 0
	AND mam_a_wrk_no_issue_$u_mam_a_wrk_no_issue_all_org.co_cd = fcpa_context$f_get_co_cd()
;

