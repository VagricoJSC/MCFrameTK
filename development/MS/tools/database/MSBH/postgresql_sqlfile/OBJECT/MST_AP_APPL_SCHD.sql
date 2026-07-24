\encoding UTF-8

CREATE OR REPLACE VIEW mst_ap_appl_schd(
	ap_appl_schd_no,
	pay_schd_no,
	purc_act_no,
	rcpt_iv_mng_no,
	rcpt_iv_no,
	trd_cur_amt,
	trd_cur_com_paid_tax_amt,
	trd_cur_exc_com_paid,
	trd_cur_appl_amt,
	pay_sts_typ,
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
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.ap_appl_schd_no,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.pay_schd_no,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.purc_act_no,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.rcpt_iv_mng_no,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.rcpt_iv_no,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.trd_cur_amt,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.trd_cur_com_paid_tax_amt,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.trd_cur_exc_com_paid,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.trd_cur_appl_amt,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.pay_sts_typ,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.sub_char1,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.sub_char2,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.sub_char3,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.ins_usr_id,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.ins_usr_nm,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.ins_ts,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.ins_func_id,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.upd_cntr,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.upd_usr_id,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.upd_usr_nm,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.upd_ts,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.upd_func_id,
	mst_ap_appl_schd_mst_ap_appl_schd_all_org.upd_srv_req_no
FROM
	mst_ap_appl_schd_all mst_ap_appl_schd_mst_ap_appl_schd_all_org
WHERE
	0 = 0
	AND mst_ap_appl_schd_mst_ap_appl_schd_all_org.co_cd = (SELECT co_cd FROM fct_context mst_ap_appl_schd_fct_context WHERE pid = pg_backend_pid())
;

