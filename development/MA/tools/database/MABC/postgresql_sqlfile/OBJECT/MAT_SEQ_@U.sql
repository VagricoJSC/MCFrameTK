\encoding UTF-8

CREATE OR REPLACE VIEW mat_seq_$u(
	num_biz_typ,
	num_ptn_cd,
	key_elm,
	seq_typ,
	ora_seq_nm,
	min_val,
	max_val,
	increment_by,
	cycl_flg,
	last_val,
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
	mat_seq_$u_mat_seq_all_org.num_biz_typ,
	mat_seq_$u_mat_seq_all_org.num_ptn_cd,
	mat_seq_$u_mat_seq_all_org.key_elm,
	mat_seq_$u_mat_seq_all_org.seq_typ,
	mat_seq_$u_mat_seq_all_org.ora_seq_nm,
	mat_seq_$u_mat_seq_all_org.min_val,
	mat_seq_$u_mat_seq_all_org.max_val,
	mat_seq_$u_mat_seq_all_org.increment_by,
	mat_seq_$u_mat_seq_all_org.cycl_flg,
	mat_seq_$u_mat_seq_all_org.last_val,
	mat_seq_$u_mat_seq_all_org.ins_usr_id,
	mat_seq_$u_mat_seq_all_org.ins_usr_nm,
	mat_seq_$u_mat_seq_all_org.ins_ts,
	mat_seq_$u_mat_seq_all_org.ins_func_id,
	mat_seq_$u_mat_seq_all_org.upd_cntr,
	mat_seq_$u_mat_seq_all_org.upd_usr_id,
	mat_seq_$u_mat_seq_all_org.upd_usr_nm,
	mat_seq_$u_mat_seq_all_org.upd_ts,
	mat_seq_$u_mat_seq_all_org.upd_func_id,
	mat_seq_$u_mat_seq_all_org.upd_srv_req_no
FROM
	mat_seq_all mat_seq_$u_mat_seq_all_org
WHERE
	0 = 0
	AND mat_seq_$u_mat_seq_all_org.co_cd = fcpa_context$f_get_co_cd()
;

