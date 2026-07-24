\encoding UTF-8

CREATE OR REPLACE VIEW mgt_acc_trd_$u(
	calc_no,
	calc_grp_cd,
	trd_grp,
	ym,
	expns_cd,
	amt,
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
	mgt_acc_trd_$u_mgt_acc_trd_all_org.calc_no,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.calc_grp_cd,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.trd_grp,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.ym,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.expns_cd,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.amt,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.ins_usr_id,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.ins_usr_nm,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.ins_ts,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.ins_func_id,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.upd_cntr,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.upd_usr_id,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.upd_usr_nm,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.upd_ts,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.upd_func_id,
	mgt_acc_trd_$u_mgt_acc_trd_all_org.upd_srv_req_no
FROM
	mgt_acc_trd_all mgt_acc_trd_$u_mgt_acc_trd_all_org
WHERE
	0 = 0
	AND mgt_acc_trd_$u_mgt_acc_trd_all_org.co_cd = fcpa_context$f_get_co_cd()
;

