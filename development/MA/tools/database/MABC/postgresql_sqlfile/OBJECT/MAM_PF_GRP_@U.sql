\encoding UTF-8

CREATE OR REPLACE VIEW mam_pf_grp_$u(
	pf_grp_cd,
	pf_grp_nm,
	weekly_period_num,
	weekly_period_st,
	tendays_period_num,
	tendays_period_st,
	monthly_period_num,
	monthly_period_st,
	fix_period_num,
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
	mam_pf_grp_$u_mam_pf_grp_all_org.pf_grp_cd,
	mam_pf_grp_$u_mam_pf_grp_all_org.pf_grp_nm,
	mam_pf_grp_$u_mam_pf_grp_all_org.weekly_period_num,
	mam_pf_grp_$u_mam_pf_grp_all_org.weekly_period_st,
	mam_pf_grp_$u_mam_pf_grp_all_org.tendays_period_num,
	mam_pf_grp_$u_mam_pf_grp_all_org.tendays_period_st,
	mam_pf_grp_$u_mam_pf_grp_all_org.monthly_period_num,
	mam_pf_grp_$u_mam_pf_grp_all_org.monthly_period_st,
	mam_pf_grp_$u_mam_pf_grp_all_org.fix_period_num,
	mam_pf_grp_$u_mam_pf_grp_all_org.memo1,
	mam_pf_grp_$u_mam_pf_grp_all_org.memo2,
	mam_pf_grp_$u_mam_pf_grp_all_org.memo3,
	mam_pf_grp_$u_mam_pf_grp_all_org.del_flg,
	mam_pf_grp_$u_mam_pf_grp_all_org.del_usr_id,
	mam_pf_grp_$u_mam_pf_grp_all_org.del_usr_nm,
	mam_pf_grp_$u_mam_pf_grp_all_org.del_ts,
	mam_pf_grp_$u_mam_pf_grp_all_org.ins_usr_id,
	mam_pf_grp_$u_mam_pf_grp_all_org.ins_usr_nm,
	mam_pf_grp_$u_mam_pf_grp_all_org.ins_ts,
	mam_pf_grp_$u_mam_pf_grp_all_org.ins_func_id,
	mam_pf_grp_$u_mam_pf_grp_all_org.upd_cntr,
	mam_pf_grp_$u_mam_pf_grp_all_org.upd_usr_id,
	mam_pf_grp_$u_mam_pf_grp_all_org.upd_usr_nm,
	mam_pf_grp_$u_mam_pf_grp_all_org.upd_ts,
	mam_pf_grp_$u_mam_pf_grp_all_org.upd_func_id,
	mam_pf_grp_$u_mam_pf_grp_all_org.upd_srv_req_no
FROM
	mam_pf_grp_all mam_pf_grp_$u_mam_pf_grp_all_org
WHERE
	0 = 0
	AND mam_pf_grp_$u_mam_pf_grp_all_org.co_cd = fcpa_context$f_get_co_cd()
;

