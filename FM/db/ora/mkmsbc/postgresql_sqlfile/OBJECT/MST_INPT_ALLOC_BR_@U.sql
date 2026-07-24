\encoding UTF-8

CREATE OR REPLACE VIEW mst_inpt_alloc_br_$u(
	batch_data_no,
	batch_log_no,
	log_sub_key1,
	log_sub_key2,
	exe_sts_typ,
	mfg_inst_no,
	par_itm_cd,
	par_itm_sub1,
	par_itm_sub2,
	par_itm_sub3,
	mfg_loc_cd,
	st_schd_tm,
	end_schd_tm,
	alloc_tgt_cnt,
	alloc_success_cnt,
	alloc_failure_cnt,
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
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.batch_data_no,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.batch_log_no,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.log_sub_key1,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.log_sub_key2,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.exe_sts_typ,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.mfg_inst_no,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.par_itm_cd,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.par_itm_sub1,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.par_itm_sub2,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.par_itm_sub3,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.mfg_loc_cd,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.st_schd_tm,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.end_schd_tm,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.alloc_tgt_cnt,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.alloc_success_cnt,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.alloc_failure_cnt,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.ins_usr_id,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.ins_usr_nm,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.ins_ts,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.ins_func_id,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.upd_cntr,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.upd_usr_id,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.upd_usr_nm,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.upd_ts,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.upd_func_id,
	mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.upd_srv_req_no
FROM
	mst_inpt_alloc_br_all mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org
WHERE
	0 = 0
	AND mst_inpt_alloc_br_$u_mst_inpt_alloc_br_all_org.co_cd = fcpa_context$f_get_co_cd()
;

