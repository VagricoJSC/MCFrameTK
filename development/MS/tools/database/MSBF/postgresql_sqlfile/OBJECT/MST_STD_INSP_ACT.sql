\encoding UTF-8

CREATE OR REPLACE VIEW mst_std_insp_act(
	std_insp_act_no,
	std_insp_inst_no,
	insp_no,
	qn_insp_val,
	ql_insp_val,
	st_tm,
	end_tm,
	dpt_cd,
	usr_cd,
	std_insp_rslt_typ,
	cnf_flg,
	cnf_dt,
	cnf_dpt_cd,
	cnf_usr_cd,
	act_intr_rmrks,
	cnf_intr_rmrks,
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
	mst_std_insp_act_mst_std_insp_act_all_org.std_insp_act_no,
	mst_std_insp_act_mst_std_insp_act_all_org.std_insp_inst_no,
	mst_std_insp_act_mst_std_insp_act_all_org.insp_no,
	mst_std_insp_act_mst_std_insp_act_all_org.qn_insp_val,
	mst_std_insp_act_mst_std_insp_act_all_org.ql_insp_val,
	mst_std_insp_act_mst_std_insp_act_all_org.st_tm,
	mst_std_insp_act_mst_std_insp_act_all_org.end_tm,
	mst_std_insp_act_mst_std_insp_act_all_org.dpt_cd,
	mst_std_insp_act_mst_std_insp_act_all_org.usr_cd,
	mst_std_insp_act_mst_std_insp_act_all_org.std_insp_rslt_typ,
	mst_std_insp_act_mst_std_insp_act_all_org.cnf_flg,
	mst_std_insp_act_mst_std_insp_act_all_org.cnf_dt,
	mst_std_insp_act_mst_std_insp_act_all_org.cnf_dpt_cd,
	mst_std_insp_act_mst_std_insp_act_all_org.cnf_usr_cd,
	mst_std_insp_act_mst_std_insp_act_all_org.act_intr_rmrks,
	mst_std_insp_act_mst_std_insp_act_all_org.cnf_intr_rmrks,
	mst_std_insp_act_mst_std_insp_act_all_org.sub_char1,
	mst_std_insp_act_mst_std_insp_act_all_org.sub_char2,
	mst_std_insp_act_mst_std_insp_act_all_org.sub_char3,
	mst_std_insp_act_mst_std_insp_act_all_org.ins_usr_id,
	mst_std_insp_act_mst_std_insp_act_all_org.ins_usr_nm,
	mst_std_insp_act_mst_std_insp_act_all_org.ins_ts,
	mst_std_insp_act_mst_std_insp_act_all_org.ins_func_id,
	mst_std_insp_act_mst_std_insp_act_all_org.upd_cntr,
	mst_std_insp_act_mst_std_insp_act_all_org.upd_usr_id,
	mst_std_insp_act_mst_std_insp_act_all_org.upd_usr_nm,
	mst_std_insp_act_mst_std_insp_act_all_org.upd_ts,
	mst_std_insp_act_mst_std_insp_act_all_org.upd_func_id,
	mst_std_insp_act_mst_std_insp_act_all_org.upd_srv_req_no
FROM
	mst_std_insp_act_all mst_std_insp_act_mst_std_insp_act_all_org
WHERE
	0 = 0
	AND mst_std_insp_act_mst_std_insp_act_all_org.co_cd = (SELECT co_cd FROM fct_context mst_std_insp_act_fct_context WHERE pid = pg_backend_pid())
;

