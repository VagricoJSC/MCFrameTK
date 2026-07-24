\encoding UTF-8

CREATE OR REPLACE VIEW mat_push_ntc_trans(
	push_ntc_no,
	column_seq,
	data_val,
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
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.push_ntc_no,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.column_seq,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.data_val,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.ins_usr_id,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.ins_usr_nm,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.ins_ts,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.ins_func_id,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.upd_cntr,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.upd_usr_id,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.upd_usr_nm,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.upd_ts,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.upd_func_id,
	mat_push_ntc_trans_mat_push_ntc_trans_all_org.upd_srv_req_no
FROM
	mat_push_ntc_trans_all mat_push_ntc_trans_mat_push_ntc_trans_all_org
WHERE
	0 = 0
	AND mat_push_ntc_trans_mat_push_ntc_trans_all_org.co_cd = (SELECT co_cd FROM fct_context mat_push_ntc_trans_fct_context WHERE pid = pg_backend_pid())
;

