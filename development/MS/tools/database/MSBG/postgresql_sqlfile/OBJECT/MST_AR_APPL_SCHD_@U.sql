\encoding UTF-8

CREATE OR REPLACE VIEW mst_ar_appl_schd_$u(
	ar_appl_schd_no,
	bill_acst_no,
	iv_no,
	ar_typ,
	rcv_mtd_cd,
	rcv_schd_dt,
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
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.ar_appl_schd_no,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.bill_acst_no,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.iv_no,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.ar_typ,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.rcv_mtd_cd,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.rcv_schd_dt,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.appl_tgt_amt,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.appl_amt,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.not_appl_bal,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.sub_char1,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.sub_char2,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.sub_char3,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.ins_usr_id,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.ins_usr_nm,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.ins_ts,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.ins_func_id,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.upd_cntr,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.upd_usr_id,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.upd_usr_nm,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.upd_ts,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.upd_func_id,
	mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.upd_srv_req_no
FROM
	mst_ar_appl_schd_all mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org
WHERE
	0 = 0
	AND mst_ar_appl_schd_$u_mst_ar_appl_schd_all_org.co_cd = fcpa_context$f_get_co_cd()
;

