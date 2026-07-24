\encoding UTF-8

CREATE OR REPLACE VIEW mst_cst_wrk_$u(
	wrk_no,
	cst_cd,
	cst_sundry_flg,
	cst_nm,
	cst_cntct_dpt,
	cst_cntct_psn,
	zip_cd,
	addr1,
	addr2,
	addr3,
	addr4,
	tel,
	fax,
	capital,
	emp_num,
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
	mst_cst_wrk_$u_mst_cst_wrk_all_org.wrk_no,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.cst_cd,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.cst_sundry_flg,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.cst_nm,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.cst_cntct_dpt,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.cst_cntct_psn,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.zip_cd,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.addr1,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.addr2,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.addr3,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.addr4,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.tel,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.fax,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.capital,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.emp_num,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.sub_char1,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.sub_char2,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.sub_char3,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.ins_usr_id,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.ins_usr_nm,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.ins_ts,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.ins_func_id,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.upd_cntr,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.upd_usr_id,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.upd_usr_nm,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.upd_ts,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.upd_func_id,
	mst_cst_wrk_$u_mst_cst_wrk_all_org.upd_srv_req_no
FROM
	mst_cst_wrk_all mst_cst_wrk_$u_mst_cst_wrk_all_org
WHERE
	0 = 0
	AND mst_cst_wrk_$u_mst_cst_wrk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

