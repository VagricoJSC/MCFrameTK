\encoding UTF-8

CREATE OR REPLACE VIEW mst_bill_d_appl_act_$u(
	rcv_act_d_no,
	bill_d_no,
	parent_bill_d_no,
	appl_dt,
	appl_amt,
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
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.rcv_act_d_no,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.bill_d_no,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.parent_bill_d_no,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.appl_dt,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.appl_amt,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.sub_char1,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.sub_char2,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.sub_char3,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.ins_usr_id,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.ins_usr_nm,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.ins_ts,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.ins_func_id,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.upd_cntr,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.upd_usr_id,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.upd_usr_nm,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.upd_ts,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.upd_func_id,
	mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.upd_srv_req_no
FROM
	mst_bill_d_appl_act_all mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org
WHERE
	0 = 0
	AND mst_bill_d_appl_act_$u_mst_bill_d_appl_act_all_org.co_cd = fcpa_context$f_get_co_cd()
;

