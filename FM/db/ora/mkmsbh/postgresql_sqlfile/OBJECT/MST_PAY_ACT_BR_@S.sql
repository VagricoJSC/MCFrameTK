\encoding UTF-8

CREATE OR REPLACE VIEW mst_pay_act_br_$s(
	batch_data_no,
	pay_chk_no,
	pay_schd_no,
	psppl_cd,
	bsppl_cd,
	bsppl_dpt_cd,
	ap_sttl_cd,
	ap_sttl_typ,
	pay_schd_dt,
	reg_dt,
	bsppl_cl_dt,
	exe_sts_typ,
	batch_log_no,
	log_sub_key1,
	log_sub_key2,
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
	mst_pay_act_br_$s_mst_pay_act_br_all_org.batch_data_no,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.pay_chk_no,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.pay_schd_no,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.psppl_cd,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.bsppl_cd,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.bsppl_dpt_cd,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.ap_sttl_cd,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.ap_sttl_typ,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.pay_schd_dt,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.reg_dt,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.bsppl_cl_dt,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.exe_sts_typ,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.batch_log_no,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.log_sub_key1,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.log_sub_key2,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.ins_usr_id,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.ins_usr_nm,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.ins_ts,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.ins_func_id,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.upd_cntr,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.upd_usr_id,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.upd_usr_nm,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.upd_ts,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.upd_func_id,
	mst_pay_act_br_$s_mst_pay_act_br_all_org.upd_srv_req_no
FROM
	mst_pay_act_br_all mst_pay_act_br_$s_mst_pay_act_br_all_org
WHERE
	0 = 0
	AND mst_pay_act_br_$s_mst_pay_act_br_all_org.co_cd = (SELECT co_cd FROM fct_context mst_pay_act_br_$s_fct_context WHERE pid = pg_backend_pid())
;

