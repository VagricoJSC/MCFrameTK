\encoding UTF-8

CREATE OR REPLACE VIEW mst_comp_spec_desc_$u(
	comp_spec_desc_no,
	sls_itm_spec_no,
	sls_itm_comp_no,
	sls_itm_comp_spec_lno,
	spec_cd,
	spec_desc_cd,
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
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.comp_spec_desc_no,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.sls_itm_spec_no,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.sls_itm_comp_no,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.sls_itm_comp_spec_lno,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.spec_cd,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.spec_desc_cd,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.rmrks,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.sub_char1,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.sub_char2,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.sub_char3,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.ins_usr_id,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.ins_usr_nm,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.ins_ts,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.ins_func_id,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.upd_cntr,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.upd_usr_id,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.upd_usr_nm,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.upd_ts,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.upd_func_id,
	mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.upd_srv_req_no
FROM
	mst_comp_spec_desc_all mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org
WHERE
	0 = 0
	AND mst_comp_spec_desc_$u_mst_comp_spec_desc_all_org.co_cd = fcpa_context$f_get_co_cd()
;

