\encoding UTF-8

CREATE OR REPLACE VIEW mgt_parm_$u(
	calc_grp_cd,
	parm_key,
	parm_val,
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
	mgt_parm_$u_mgt_parm_all_org.calc_grp_cd,
	mgt_parm_$u_mgt_parm_all_org.parm_key,
	mgt_parm_$u_mgt_parm_all_org.parm_val,
	mgt_parm_$u_mgt_parm_all_org.rmrks,
	mgt_parm_$u_mgt_parm_all_org.sub_char1,
	mgt_parm_$u_mgt_parm_all_org.sub_char2,
	mgt_parm_$u_mgt_parm_all_org.sub_char3,
	mgt_parm_$u_mgt_parm_all_org.ins_usr_id,
	mgt_parm_$u_mgt_parm_all_org.ins_usr_nm,
	mgt_parm_$u_mgt_parm_all_org.ins_ts,
	mgt_parm_$u_mgt_parm_all_org.ins_func_id,
	mgt_parm_$u_mgt_parm_all_org.upd_cntr,
	mgt_parm_$u_mgt_parm_all_org.upd_usr_id,
	mgt_parm_$u_mgt_parm_all_org.upd_usr_nm,
	mgt_parm_$u_mgt_parm_all_org.upd_ts,
	mgt_parm_$u_mgt_parm_all_org.upd_func_id,
	mgt_parm_$u_mgt_parm_all_org.upd_srv_req_no
FROM
	mgt_parm_all mgt_parm_$u_mgt_parm_all_org
WHERE
	0 = 0
	AND mgt_parm_$u_mgt_parm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

