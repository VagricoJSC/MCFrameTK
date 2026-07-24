\encoding UTF-8

CREATE OR REPLACE VIEW mbt_aprv_d_$s(
	aprv_no,
	aprv_no_seq,
	aprv_role_cd,
	aprv_usr_cd,
	aprv_seq,
	aprv_d_sts_typ,
	aprv_d_tm,
	deputy_flg,
	deputy_usr_cd,
	aprv_d_rmrks,
	not_upd_flg,
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
	mbt_aprv_d_$s_mbt_aprv_d_all_org.aprv_no,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.aprv_no_seq,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.aprv_role_cd,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.aprv_usr_cd,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.aprv_seq,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.aprv_d_sts_typ,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.aprv_d_tm,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.deputy_flg,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.deputy_usr_cd,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.aprv_d_rmrks,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.not_upd_flg,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.sub_char1,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.sub_char2,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.sub_char3,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.ins_usr_id,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.ins_usr_nm,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.ins_ts,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.ins_func_id,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.upd_cntr,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.upd_usr_id,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.upd_usr_nm,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.upd_ts,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.upd_func_id,
	mbt_aprv_d_$s_mbt_aprv_d_all_org.upd_srv_req_no
FROM
	mbt_aprv_d_all mbt_aprv_d_$s_mbt_aprv_d_all_org
WHERE
	0 = 0
	AND mbt_aprv_d_$s_mbt_aprv_d_all_org.co_cd = (SELECT co_cd FROM fct_context mbt_aprv_d_$s_fct_context WHERE pid = pg_backend_pid())
;

