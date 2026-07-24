\encoding UTF-8

CREATE OR REPLACE VIEW mst_bf_br_$u(
	batch_data_no,
	batch_log_no,
	log_sub_key1,
	log_sub_key2,
	exe_sts_typ,
	mfg_inst_no,
	div_seq,
	mfg_act_no,
	oper_act_no,
	par_itm_cd,
	par_itm_sub1,
	par_itm_sub2,
	par_itm_sub3,
	mfg_loc_cd,
	oper_cd,
	st_act_tm,
	end_act_tm,
	bf_tgt_cnt,
	bf_success_cnt,
	bf_failure_cnt,
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
	mst_bf_br_$u_mst_bf_br_all_org.batch_data_no,
	mst_bf_br_$u_mst_bf_br_all_org.batch_log_no,
	mst_bf_br_$u_mst_bf_br_all_org.log_sub_key1,
	mst_bf_br_$u_mst_bf_br_all_org.log_sub_key2,
	mst_bf_br_$u_mst_bf_br_all_org.exe_sts_typ,
	mst_bf_br_$u_mst_bf_br_all_org.mfg_inst_no,
	mst_bf_br_$u_mst_bf_br_all_org.div_seq,
	mst_bf_br_$u_mst_bf_br_all_org.mfg_act_no,
	mst_bf_br_$u_mst_bf_br_all_org.oper_act_no,
	mst_bf_br_$u_mst_bf_br_all_org.par_itm_cd,
	mst_bf_br_$u_mst_bf_br_all_org.par_itm_sub1,
	mst_bf_br_$u_mst_bf_br_all_org.par_itm_sub2,
	mst_bf_br_$u_mst_bf_br_all_org.par_itm_sub3,
	mst_bf_br_$u_mst_bf_br_all_org.mfg_loc_cd,
	mst_bf_br_$u_mst_bf_br_all_org.oper_cd,
	mst_bf_br_$u_mst_bf_br_all_org.st_act_tm,
	mst_bf_br_$u_mst_bf_br_all_org.end_act_tm,
	mst_bf_br_$u_mst_bf_br_all_org.bf_tgt_cnt,
	mst_bf_br_$u_mst_bf_br_all_org.bf_success_cnt,
	mst_bf_br_$u_mst_bf_br_all_org.bf_failure_cnt,
	mst_bf_br_$u_mst_bf_br_all_org.ins_usr_id,
	mst_bf_br_$u_mst_bf_br_all_org.ins_usr_nm,
	mst_bf_br_$u_mst_bf_br_all_org.ins_ts,
	mst_bf_br_$u_mst_bf_br_all_org.ins_func_id,
	mst_bf_br_$u_mst_bf_br_all_org.upd_cntr,
	mst_bf_br_$u_mst_bf_br_all_org.upd_usr_id,
	mst_bf_br_$u_mst_bf_br_all_org.upd_usr_nm,
	mst_bf_br_$u_mst_bf_br_all_org.upd_ts,
	mst_bf_br_$u_mst_bf_br_all_org.upd_func_id,
	mst_bf_br_$u_mst_bf_br_all_org.upd_srv_req_no
FROM
	mst_bf_br_all mst_bf_br_$u_mst_bf_br_all_org
WHERE
	0 = 0
	AND mst_bf_br_$u_mst_bf_br_all_org.co_cd = fcpa_context$f_get_co_cd()
;

