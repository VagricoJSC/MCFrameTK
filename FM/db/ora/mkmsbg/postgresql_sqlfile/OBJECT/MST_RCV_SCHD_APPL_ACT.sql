\encoding UTF-8

CREATE OR REPLACE VIEW mst_rcv_schd_appl_act(
	rcv_schd_appl_act_no,
	bill_mng_no,
	rcv_act_dt,
	rcv_mtd_cd,
	rcv_typ,
	rcv_act_amt,
	sub_char1,
	sub_char2,
	sub_char3,
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
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.rcv_schd_appl_act_no,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.bill_mng_no,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.rcv_act_dt,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.rcv_mtd_cd,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.rcv_typ,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.rcv_act_amt,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.sub_char1,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.sub_char2,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.sub_char3,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.ins_usr_id,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.ins_usr_nm,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.ins_ts,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.ins_func_id,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.upd_cntr,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.upd_usr_id,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.upd_usr_nm,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.upd_ts,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.upd_func_id,
	mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.upd_srv_req_no
FROM
	mst_rcv_schd_appl_act_all mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org
WHERE
	0 = 0
	AND mst_rcv_schd_appl_act_mst_rcv_schd_appl_act_all_org.co_cd = (SELECT co_cd FROM fct_context mst_rcv_schd_appl_act_fct_context WHERE pid = pg_backend_pid())
;

