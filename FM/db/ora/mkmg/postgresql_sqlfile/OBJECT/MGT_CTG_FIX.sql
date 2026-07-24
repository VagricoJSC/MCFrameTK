\encoding UTF-8

CREATE OR REPLACE VIEW mgt_ctg_fix(
	calc_grp_cd,
	ym,
	calc_ctg_typ,
	calc_ctg_cd,
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
	mgt_ctg_fix_mgt_ctg_fix_all_org.calc_grp_cd,
	mgt_ctg_fix_mgt_ctg_fix_all_org.ym,
	mgt_ctg_fix_mgt_ctg_fix_all_org.calc_ctg_typ,
	mgt_ctg_fix_mgt_ctg_fix_all_org.calc_ctg_cd,
	mgt_ctg_fix_mgt_ctg_fix_all_org.ins_usr_id,
	mgt_ctg_fix_mgt_ctg_fix_all_org.ins_usr_nm,
	mgt_ctg_fix_mgt_ctg_fix_all_org.ins_ts,
	mgt_ctg_fix_mgt_ctg_fix_all_org.ins_func_id,
	mgt_ctg_fix_mgt_ctg_fix_all_org.upd_cntr,
	mgt_ctg_fix_mgt_ctg_fix_all_org.upd_usr_id,
	mgt_ctg_fix_mgt_ctg_fix_all_org.upd_usr_nm,
	mgt_ctg_fix_mgt_ctg_fix_all_org.upd_ts,
	mgt_ctg_fix_mgt_ctg_fix_all_org.upd_func_id,
	mgt_ctg_fix_mgt_ctg_fix_all_org.upd_srv_req_no
FROM
	mgt_ctg_fix_all mgt_ctg_fix_mgt_ctg_fix_all_org
WHERE
	0 = 0
	AND mgt_ctg_fix_mgt_ctg_fix_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_ctg_fix_fct_context WHERE pid = pg_backend_pid())
;

