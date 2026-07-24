\encoding UTF-8

CREATE OR REPLACE VIEW mam_dpt_his_$u(
	st_dt,
	end_dt,
	dpt_his_rmrks,
	memo1,
	memo2,
	memo3,
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
	mam_dpt_his_$u_mam_dpt_his_all_org.st_dt,
	mam_dpt_his_$u_mam_dpt_his_all_org.end_dt,
	mam_dpt_his_$u_mam_dpt_his_all_org.dpt_his_rmrks,
	mam_dpt_his_$u_mam_dpt_his_all_org.memo1,
	mam_dpt_his_$u_mam_dpt_his_all_org.memo2,
	mam_dpt_his_$u_mam_dpt_his_all_org.memo3,
	mam_dpt_his_$u_mam_dpt_his_all_org.ins_usr_id,
	mam_dpt_his_$u_mam_dpt_his_all_org.ins_usr_nm,
	mam_dpt_his_$u_mam_dpt_his_all_org.ins_ts,
	mam_dpt_his_$u_mam_dpt_his_all_org.ins_func_id,
	mam_dpt_his_$u_mam_dpt_his_all_org.upd_cntr,
	mam_dpt_his_$u_mam_dpt_his_all_org.upd_usr_id,
	mam_dpt_his_$u_mam_dpt_his_all_org.upd_usr_nm,
	mam_dpt_his_$u_mam_dpt_his_all_org.upd_ts,
	mam_dpt_his_$u_mam_dpt_his_all_org.upd_func_id,
	mam_dpt_his_$u_mam_dpt_his_all_org.upd_srv_req_no
FROM
	mam_dpt_his_all mam_dpt_his_$u_mam_dpt_his_all_org
WHERE
	0 = 0
	AND mam_dpt_his_$u_mam_dpt_his_all_org.co_cd = fcpa_context$f_get_co_cd()
;

