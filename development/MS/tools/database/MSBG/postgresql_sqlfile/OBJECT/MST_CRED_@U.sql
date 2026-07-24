\encoding UTF-8

CREATE OR REPLACE VIEW mst_cred_$u(
	cred_cd,
	trd_cur_cd,
	cred_amt,
	ap_cred_amt,
	ar_cred_amt,
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
	mst_cred_$u_mst_cred_all_org.cred_cd,
	mst_cred_$u_mst_cred_all_org.trd_cur_cd,
	mst_cred_$u_mst_cred_all_org.cred_amt,
	mst_cred_$u_mst_cred_all_org.ap_cred_amt,
	mst_cred_$u_mst_cred_all_org.ar_cred_amt,
	mst_cred_$u_mst_cred_all_org.sub_char1,
	mst_cred_$u_mst_cred_all_org.sub_char2,
	mst_cred_$u_mst_cred_all_org.sub_char3,
	mst_cred_$u_mst_cred_all_org.ins_usr_id,
	mst_cred_$u_mst_cred_all_org.ins_usr_nm,
	mst_cred_$u_mst_cred_all_org.ins_ts,
	mst_cred_$u_mst_cred_all_org.ins_func_id,
	mst_cred_$u_mst_cred_all_org.upd_cntr,
	mst_cred_$u_mst_cred_all_org.upd_usr_id,
	mst_cred_$u_mst_cred_all_org.upd_usr_nm,
	mst_cred_$u_mst_cred_all_org.upd_ts,
	mst_cred_$u_mst_cred_all_org.upd_func_id,
	mst_cred_$u_mst_cred_all_org.upd_srv_req_no
FROM
	mst_cred_all mst_cred_$u_mst_cred_all_org
WHERE
	0 = 0
	AND mst_cred_$u_mst_cred_all_org.co_cd = fcpa_context$f_get_co_cd()
;

