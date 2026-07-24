\encoding UTF-8

CREATE OR REPLACE VIEW mgt_batch_out_$s(
	calc_grp_cd,
	batch_typ,
	rmrks,
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
	mgt_batch_out_$s_mgt_batch_out_all_org.calc_grp_cd,
	mgt_batch_out_$s_mgt_batch_out_all_org.batch_typ,
	mgt_batch_out_$s_mgt_batch_out_all_org.rmrks,
	mgt_batch_out_$s_mgt_batch_out_all_org.sub_char1,
	mgt_batch_out_$s_mgt_batch_out_all_org.sub_char2,
	mgt_batch_out_$s_mgt_batch_out_all_org.sub_char3,
	mgt_batch_out_$s_mgt_batch_out_all_org.ins_usr_id,
	mgt_batch_out_$s_mgt_batch_out_all_org.ins_usr_nm,
	mgt_batch_out_$s_mgt_batch_out_all_org.ins_ts,
	mgt_batch_out_$s_mgt_batch_out_all_org.ins_func_id,
	mgt_batch_out_$s_mgt_batch_out_all_org.upd_cntr,
	mgt_batch_out_$s_mgt_batch_out_all_org.upd_usr_id,
	mgt_batch_out_$s_mgt_batch_out_all_org.upd_usr_nm,
	mgt_batch_out_$s_mgt_batch_out_all_org.upd_ts,
	mgt_batch_out_$s_mgt_batch_out_all_org.upd_func_id,
	mgt_batch_out_$s_mgt_batch_out_all_org.upd_srv_req_no
FROM
	mgt_batch_out_all mgt_batch_out_$s_mgt_batch_out_all_org
WHERE
	0 = 0
	AND mgt_batch_out_$s_mgt_batch_out_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_batch_out_$s_fct_context WHERE pid = pg_backend_pid())
;

