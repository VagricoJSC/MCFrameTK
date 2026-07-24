\encoding UTF-8

CREATE OR REPLACE VIEW mgt_std_fix(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	term,
	calc_ctg_cd,
	wg_cd,
	std_qty,
	std_upri,
	calc_no,
	calc_grp_cd,
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
	mgt_std_fix_mgt_std_fix_all_org.itm_cd,
	mgt_std_fix_mgt_std_fix_all_org.itm_sub1,
	mgt_std_fix_mgt_std_fix_all_org.itm_sub2,
	mgt_std_fix_mgt_std_fix_all_org.itm_sub3,
	mgt_std_fix_mgt_std_fix_all_org.term,
	mgt_std_fix_mgt_std_fix_all_org.calc_ctg_cd,
	mgt_std_fix_mgt_std_fix_all_org.wg_cd,
	mgt_std_fix_mgt_std_fix_all_org.std_qty,
	mgt_std_fix_mgt_std_fix_all_org.std_upri,
	mgt_std_fix_mgt_std_fix_all_org.calc_no,
	mgt_std_fix_mgt_std_fix_all_org.calc_grp_cd,
	mgt_std_fix_mgt_std_fix_all_org.ins_usr_id,
	mgt_std_fix_mgt_std_fix_all_org.ins_usr_nm,
	mgt_std_fix_mgt_std_fix_all_org.ins_ts,
	mgt_std_fix_mgt_std_fix_all_org.ins_func_id,
	mgt_std_fix_mgt_std_fix_all_org.upd_cntr,
	mgt_std_fix_mgt_std_fix_all_org.upd_usr_id,
	mgt_std_fix_mgt_std_fix_all_org.upd_usr_nm,
	mgt_std_fix_mgt_std_fix_all_org.upd_ts,
	mgt_std_fix_mgt_std_fix_all_org.upd_func_id,
	mgt_std_fix_mgt_std_fix_all_org.upd_srv_req_no
FROM
	mgt_std_fix_all mgt_std_fix_mgt_std_fix_all_org
WHERE
	0 = 0
	AND mgt_std_fix_mgt_std_fix_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_std_fix_fct_context WHERE pid = pg_backend_pid())
;

