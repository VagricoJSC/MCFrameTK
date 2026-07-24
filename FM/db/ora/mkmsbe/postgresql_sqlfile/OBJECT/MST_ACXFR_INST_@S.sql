\encoding UTF-8

CREATE OR REPLACE VIEW mst_acxfr_inst_$s(
	acxfr_inst_no,
	trd_cd,
	trd_ptn_typ,
	loc_cd,
	wg_cd,
	acxfr_inst_dt,
	inst_dpt_cd,
	inst_usr_cd,
	intr_rmrks,
	trd_rmrks,
	inst_rmrks,
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
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.acxfr_inst_no,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.trd_cd,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.trd_ptn_typ,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.loc_cd,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.wg_cd,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.acxfr_inst_dt,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.inst_dpt_cd,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.inst_usr_cd,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.intr_rmrks,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.trd_rmrks,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.inst_rmrks,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.sub_char1,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.sub_char2,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.sub_char3,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.ins_usr_id,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.ins_usr_nm,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.ins_ts,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.ins_func_id,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.upd_cntr,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.upd_usr_id,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.upd_usr_nm,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.upd_ts,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.upd_func_id,
	mst_acxfr_inst_$s_mst_acxfr_inst_all_org.upd_srv_req_no
FROM
	mst_acxfr_inst_all mst_acxfr_inst_$s_mst_acxfr_inst_all_org
WHERE
	0 = 0
	AND mst_acxfr_inst_$s_mst_acxfr_inst_all_org.co_cd = (SELECT co_cd FROM fct_context mst_acxfr_inst_$s_fct_context WHERE pid = pg_backend_pid())
;

