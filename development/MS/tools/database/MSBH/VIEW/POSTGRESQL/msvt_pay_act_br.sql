SELECT
	msvt_pay_act_br_mst_pay_act_br_t1.batch_data_no,
	msvt_pay_act_br_mst_pay_act_br_t1.pay_chk_no,
	msvt_pay_act_br_mst_pay_act_br_t1.pay_schd_no,
	msvt_pay_act_br_mst_pay_act_br_t1.psppl_cd,
	msvt_pay_act_br_mst_pay_act_br_t1.bsppl_cd,
	msvt_pay_act_br_mst_pay_act_br_t1.bsppl_dpt_cd,
	msvt_pay_act_br_mam_dpt_m1.dpt_nm AS bsppl_dpt_nm,
	msvt_pay_act_br_mst_pay_act_br_t1.ap_sttl_cd,
	msvt_pay_act_br_mst_pay_act_br_t1.ap_sttl_typ,
	msvt_pay_act_br_mst_pay_act_br_t1.pay_schd_dt,
	msvt_pay_act_br_mst_pay_act_br_t1.reg_dt,
	msvt_pay_act_br_mst_pay_act_br_t1.bsppl_cl_dt,
	msvt_pay_act_br_mst_pay_act_br_t1.exe_sts_typ,
	msvt_pay_act_br_mst_pay_act_br_t1.batch_log_no,
	msvt_pay_act_br_mst_pay_act_br_t1.log_sub_key1,
	msvt_pay_act_br_mst_pay_act_br_t1.log_sub_key2,
	msvt_pay_act_br_mst_pay_act_br_t1.ins_usr_id,
	msvt_pay_act_br_mst_pay_act_br_t1.ins_usr_nm,
	msvt_pay_act_br_mst_pay_act_br_t1.ins_ts,
	msvt_pay_act_br_mst_pay_act_br_t1.ins_func_id,
	msvt_pay_act_br_mst_pay_act_br_t1.upd_cntr,
	msvt_pay_act_br_mst_pay_act_br_t1.upd_usr_id,
	msvt_pay_act_br_mst_pay_act_br_t1.upd_usr_nm,
	msvt_pay_act_br_mst_pay_act_br_t1.upd_ts,
	msvt_pay_act_br_mst_pay_act_br_t1.upd_func_id,
	msvt_pay_act_br_mst_pay_act_br_t1.upd_srv_req_no
FROM
	mst_pay_act_br msvt_pay_act_br_mst_pay_act_br_t1
	LEFT OUTER JOIN mam_dpt msvt_pay_act_br_mam_dpt_m1 ON (msvt_pay_act_br_mst_pay_act_br_t1.bsppl_dpt_cd = msvt_pay_act_br_mam_dpt_m1.dpt_cd AND COALESCE(msvt_pay_act_br_mst_pay_act_br_t1.bsppl_cl_dt, msvt_pay_act_br_mst_pay_act_br_t1.reg_dt) BETWEEN msvt_pay_act_br_mam_dpt_m1.st_dt AND msvt_pay_act_br_mam_dpt_m1.end_dt)
WHERE 
	0=0
;
