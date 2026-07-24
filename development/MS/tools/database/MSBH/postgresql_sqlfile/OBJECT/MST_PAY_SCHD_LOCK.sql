\encoding UTF-8

CREATE OR REPLACE VIEW mst_pay_schd_lock(
	bsppl_cd,
	bsppl_dpt_cd,
	purc_act_no,
	rcpt_iv_mng_no,
	rcpt_iv_no,
	wrk_no,
	trd_cur_cd,
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
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.bsppl_cd,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.bsppl_dpt_cd,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.purc_act_no,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.rcpt_iv_mng_no,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.rcpt_iv_no,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.wrk_no,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.trd_cur_cd,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.ins_usr_id,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.ins_usr_nm,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.ins_ts,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.ins_func_id,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.upd_cntr,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.upd_usr_id,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.upd_usr_nm,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.upd_ts,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.upd_func_id,
	mst_pay_schd_lock_mst_pay_schd_lock_all_org.upd_srv_req_no
FROM
	mst_pay_schd_lock_all mst_pay_schd_lock_mst_pay_schd_lock_all_org
WHERE
	0 = 0
	AND mst_pay_schd_lock_mst_pay_schd_lock_all_org.co_cd = (SELECT co_cd FROM fct_context mst_pay_schd_lock_fct_context WHERE pid = pg_backend_pid())
;

