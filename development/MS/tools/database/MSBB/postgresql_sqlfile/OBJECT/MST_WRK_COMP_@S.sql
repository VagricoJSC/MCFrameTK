\encoding UTF-8

CREATE OR REPLACE VIEW mst_wrk_comp_$s(
	wrk_no,
	comp_no,
	comp_dt,
	comp_info,
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
	mst_wrk_comp_$s_mst_wrk_comp_all_org.wrk_no,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.comp_no,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.comp_dt,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.comp_info,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.sub_char1,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.sub_char2,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.sub_char3,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.ins_usr_id,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.ins_usr_nm,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.ins_ts,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.ins_func_id,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.upd_cntr,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.upd_usr_id,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.upd_usr_nm,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.upd_ts,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.upd_func_id,
	mst_wrk_comp_$s_mst_wrk_comp_all_org.upd_srv_req_no
FROM
	mst_wrk_comp_all mst_wrk_comp_$s_mst_wrk_comp_all_org
WHERE
	0 = 0
	AND mst_wrk_comp_$s_mst_wrk_comp_all_org.co_cd = (SELECT co_cd FROM fct_context mst_wrk_comp_$s_fct_context WHERE pid = pg_backend_pid())
;

