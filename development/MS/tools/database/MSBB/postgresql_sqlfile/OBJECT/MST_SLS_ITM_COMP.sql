\encoding UTF-8

CREATE OR REPLACE VIEW mst_sls_itm_comp(
	sls_itm_comp_no,
	sls_itm_no,
	sls_itm_comp_lno,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_nm,
	sundry_itm_flg,
	core_itm_flg,
	trd_unit_cd,
	trd_unit_qty,
	base_unit_cd,
	base_unit_qty,
	cost_upri,
	cost_amt,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
	mst_flg,
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
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.sls_itm_comp_no,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.sls_itm_no,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.sls_itm_comp_lno,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.itm_cd,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.itm_sub1,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.itm_sub2,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.itm_sub3,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.itm_nm,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.sundry_itm_flg,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.core_itm_flg,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.trd_unit_cd,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.trd_unit_qty,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.base_unit_cd,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.base_unit_qty,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.cost_upri,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.cost_amt,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.rmrks,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.sub_char1,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.sub_char2,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.sub_char3,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.mst_flg,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.ins_usr_id,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.ins_usr_nm,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.ins_ts,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.ins_func_id,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.upd_cntr,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.upd_usr_id,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.upd_usr_nm,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.upd_ts,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.upd_func_id,
	mst_sls_itm_comp_mst_sls_itm_comp_all_org.upd_srv_req_no
FROM
	mst_sls_itm_comp_all mst_sls_itm_comp_mst_sls_itm_comp_all_org
WHERE
	0 = 0
	AND mst_sls_itm_comp_mst_sls_itm_comp_all_org.co_cd = (SELECT co_cd FROM fct_context mst_sls_itm_comp_fct_context WHERE pid = pg_backend_pid())
;

