\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_no_$u(
	calc_grp_cd,
	calc_no,
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
	mgt_calc_no_$u_mgt_calc_no_all_org.calc_grp_cd,
	mgt_calc_no_$u_mgt_calc_no_all_org.calc_no,
	mgt_calc_no_$u_mgt_calc_no_all_org.ins_usr_id,
	mgt_calc_no_$u_mgt_calc_no_all_org.ins_usr_nm,
	mgt_calc_no_$u_mgt_calc_no_all_org.ins_ts,
	mgt_calc_no_$u_mgt_calc_no_all_org.ins_func_id,
	mgt_calc_no_$u_mgt_calc_no_all_org.upd_cntr,
	mgt_calc_no_$u_mgt_calc_no_all_org.upd_usr_id,
	mgt_calc_no_$u_mgt_calc_no_all_org.upd_usr_nm,
	mgt_calc_no_$u_mgt_calc_no_all_org.upd_ts,
	mgt_calc_no_$u_mgt_calc_no_all_org.upd_func_id,
	mgt_calc_no_$u_mgt_calc_no_all_org.upd_srv_req_no
FROM
	mgt_calc_no_all mgt_calc_no_$u_mgt_calc_no_all_org
WHERE
	0 = 0
	AND mgt_calc_no_$u_mgt_calc_no_all_org.co_cd = fcpa_context$f_get_co_cd()
;

