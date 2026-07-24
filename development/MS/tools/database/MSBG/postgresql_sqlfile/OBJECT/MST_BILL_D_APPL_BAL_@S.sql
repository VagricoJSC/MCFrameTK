\encoding UTF-8

CREATE OR REPLACE VIEW mst_bill_d_appl_bal_$s(
	bill_d_no,
	parent_bill_d_no,
	last_appl_dt,
	appl_tgt_amt,
	appl_amt,
	not_appl_bal,
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
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.bill_d_no,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.parent_bill_d_no,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.last_appl_dt,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.appl_tgt_amt,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.appl_amt,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.not_appl_bal,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.sub_char1,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.sub_char2,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.sub_char3,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.ins_usr_id,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.ins_usr_nm,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.ins_ts,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.ins_func_id,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.upd_cntr,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.upd_usr_id,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.upd_usr_nm,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.upd_ts,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.upd_func_id,
	mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.upd_srv_req_no
FROM
	mst_bill_d_appl_bal_all mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org
WHERE
	0 = 0
	AND mst_bill_d_appl_bal_$s_mst_bill_d_appl_bal_all_org.co_cd = (SELECT co_cd FROM fct_context mst_bill_d_appl_bal_$s_fct_context WHERE pid = pg_backend_pid())
;

