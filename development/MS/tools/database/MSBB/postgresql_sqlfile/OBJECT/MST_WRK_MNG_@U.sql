\encoding UTF-8

CREATE OR REPLACE VIEW mst_wrk_mng_$u(
	wrk_mng_typ,
	wrk_mng_cd,
	wrk_mng_nm,
	str1,
	str2,
	str3,
	num1,
	num2,
	num3,
	flg1,
	flg2,
	flg3,
	memo1,
	memo2,
	memo3,
	del_flg,
	del_usr_id,
	del_usr_nm,
	del_ts,
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
	mst_wrk_mng_$u_mst_wrk_mng_all_org.wrk_mng_typ,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.wrk_mng_cd,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.wrk_mng_nm,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.str1,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.str2,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.str3,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.num1,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.num2,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.num3,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.flg1,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.flg2,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.flg3,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.memo1,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.memo2,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.memo3,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.del_flg,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.del_usr_id,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.del_usr_nm,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.del_ts,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.ins_usr_id,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.ins_usr_nm,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.ins_ts,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.ins_func_id,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.upd_cntr,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.upd_usr_id,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.upd_usr_nm,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.upd_ts,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.upd_func_id,
	mst_wrk_mng_$u_mst_wrk_mng_all_org.upd_srv_req_no
FROM
	mst_wrk_mng_all mst_wrk_mng_$u_mst_wrk_mng_all_org
WHERE
	0 = 0
	AND mst_wrk_mng_$u_mst_wrk_mng_all_org.co_cd = fcpa_context$f_get_co_cd()
;

