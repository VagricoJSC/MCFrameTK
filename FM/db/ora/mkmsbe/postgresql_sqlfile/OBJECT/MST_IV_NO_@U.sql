\encoding UTF-8

CREATE OR REPLACE VIEW mst_iv_no_$u(
	iv_no,
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
	mst_iv_no_$u_mst_iv_no_all_org.iv_no,
	mst_iv_no_$u_mst_iv_no_all_org.sub_char1,
	mst_iv_no_$u_mst_iv_no_all_org.sub_char2,
	mst_iv_no_$u_mst_iv_no_all_org.sub_char3,
	mst_iv_no_$u_mst_iv_no_all_org.ins_usr_id,
	mst_iv_no_$u_mst_iv_no_all_org.ins_usr_nm,
	mst_iv_no_$u_mst_iv_no_all_org.ins_ts,
	mst_iv_no_$u_mst_iv_no_all_org.ins_func_id,
	mst_iv_no_$u_mst_iv_no_all_org.upd_cntr,
	mst_iv_no_$u_mst_iv_no_all_org.upd_usr_id,
	mst_iv_no_$u_mst_iv_no_all_org.upd_usr_nm,
	mst_iv_no_$u_mst_iv_no_all_org.upd_ts,
	mst_iv_no_$u_mst_iv_no_all_org.upd_func_id,
	mst_iv_no_$u_mst_iv_no_all_org.upd_srv_req_no
FROM
	mst_iv_no_all mst_iv_no_$u_mst_iv_no_all_org
WHERE
	0 = 0
	AND mst_iv_no_$u_mst_iv_no_all_org.co_cd = fcpa_context$f_get_co_cd()
;

