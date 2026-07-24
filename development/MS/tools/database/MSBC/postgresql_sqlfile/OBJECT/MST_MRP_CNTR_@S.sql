\encoding UTF-8

CREATE OR REPLACE VIEW mst_mrp_cntr_$s(
	wg_cd,
	mrp_cntr_typ,
	prefix,
	cntr,
	max_val,
	min_val,
	intr_rmrks,
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
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.wg_cd,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.mrp_cntr_typ,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.prefix,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.cntr,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.max_val,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.min_val,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.intr_rmrks,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.sub_char1,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.sub_char2,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.sub_char3,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.ins_usr_id,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.ins_usr_nm,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.ins_ts,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.ins_func_id,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.upd_cntr,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.upd_usr_id,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.upd_usr_nm,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.upd_ts,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.upd_func_id,
	mst_mrp_cntr_$s_mst_mrp_cntr_all_org.upd_srv_req_no
FROM
	mst_mrp_cntr_all mst_mrp_cntr_$s_mst_mrp_cntr_all_org
WHERE
	0 = 0
	AND mst_mrp_cntr_$s_mst_mrp_cntr_all_org.co_cd = (SELECT co_cd FROM fct_context mst_mrp_cntr_$s_fct_context WHERE pid = pg_backend_pid())
;

