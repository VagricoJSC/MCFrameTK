\encoding UTF-8

CREATE OR REPLACE VIEW mst_purc_frcst_d(
	purc_frcst_d_no,
	purc_frcst_no,
	purc_frcst_fix_no,
	pf_period_typ,
	pf_period_st_dt,
	pf_period_end_dt,
	fix_period_flg,
	trd_unit_pf_qty,
	base_unit_pf_qty,
	trd_unit_schd_qty,
	base_unit_schd_qty,
	trd_unit_prms_qty,
	base_unit_prms_qty,
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
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.purc_frcst_d_no,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.purc_frcst_no,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.purc_frcst_fix_no,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.pf_period_typ,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.pf_period_st_dt,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.pf_period_end_dt,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.fix_period_flg,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.trd_unit_pf_qty,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.base_unit_pf_qty,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.trd_unit_schd_qty,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.base_unit_schd_qty,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.trd_unit_prms_qty,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.base_unit_prms_qty,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.ins_usr_id,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.ins_usr_nm,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.ins_ts,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.ins_func_id,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.upd_cntr,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.upd_usr_id,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.upd_usr_nm,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.upd_ts,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.upd_func_id,
	mst_purc_frcst_d_mst_purc_frcst_d_all_org.upd_srv_req_no
FROM
	mst_purc_frcst_d_all mst_purc_frcst_d_mst_purc_frcst_d_all_org
WHERE
	0 = 0
	AND mst_purc_frcst_d_mst_purc_frcst_d_all_org.co_cd = (SELECT co_cd FROM fct_context mst_purc_frcst_d_fct_context WHERE pid = pg_backend_pid())
;

