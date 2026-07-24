\encoding UTF-8

CREATE OR REPLACE VIEW mgt_ym_no(
	calc_grp_cd,
	ym,
	calc_no,
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
	mgt_ym_no_mgt_ym_no_all_org.calc_grp_cd,
	mgt_ym_no_mgt_ym_no_all_org.ym,
	mgt_ym_no_mgt_ym_no_all_org.calc_no,
	mgt_ym_no_mgt_ym_no_all_org.ins_usr_id,
	mgt_ym_no_mgt_ym_no_all_org.ins_usr_nm,
	mgt_ym_no_mgt_ym_no_all_org.ins_ts,
	mgt_ym_no_mgt_ym_no_all_org.ins_func_id,
	mgt_ym_no_mgt_ym_no_all_org.upd_cntr,
	mgt_ym_no_mgt_ym_no_all_org.upd_usr_id,
	mgt_ym_no_mgt_ym_no_all_org.upd_usr_nm,
	mgt_ym_no_mgt_ym_no_all_org.upd_ts,
	mgt_ym_no_mgt_ym_no_all_org.upd_func_id,
	mgt_ym_no_mgt_ym_no_all_org.upd_srv_req_no
FROM
	mgt_ym_no_all mgt_ym_no_mgt_ym_no_all_org
WHERE
	0 = 0
	AND mgt_ym_no_mgt_ym_no_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_ym_no_fct_context WHERE pid = pg_backend_pid())
;

