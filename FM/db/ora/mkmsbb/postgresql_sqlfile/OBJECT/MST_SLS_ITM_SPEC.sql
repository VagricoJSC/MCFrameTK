\encoding UTF-8

CREATE OR REPLACE VIEW mst_sls_itm_spec(
	sls_itm_spec_no,
	sls_itm_no,
	sno1,
	sno2,
	sno3,
	sno4,
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
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sls_itm_spec_no,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sls_itm_no,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sno1,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sno2,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sno3,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sno4,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.rmrks,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sub_char1,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sub_char2,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.sub_char3,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.ins_usr_id,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.ins_usr_nm,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.ins_ts,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.ins_func_id,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.upd_cntr,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.upd_usr_id,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.upd_usr_nm,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.upd_ts,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.upd_func_id,
	mst_sls_itm_spec_mst_sls_itm_spec_all_org.upd_srv_req_no
FROM
	mst_sls_itm_spec_all mst_sls_itm_spec_mst_sls_itm_spec_all_org
WHERE
	0 = 0
	AND mst_sls_itm_spec_mst_sls_itm_spec_all_org.co_cd = (SELECT co_cd FROM fct_context mst_sls_itm_spec_fct_context WHERE pid = pg_backend_pid())
;

