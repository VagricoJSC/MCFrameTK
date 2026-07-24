\encoding UTF-8

CREATE OR REPLACE VIEW mam_calc_rpt_ptn_$u(
	calc_grp_cd,
	rpt_ptn_cd,
	rpt_key_cd,
	auto_flg,
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
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.calc_grp_cd,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.rpt_ptn_cd,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.rpt_key_cd,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.auto_flg,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.memo1,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.memo2,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.memo3,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.del_flg,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.del_usr_id,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.del_usr_nm,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.del_ts,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.ins_usr_id,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.ins_usr_nm,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.ins_ts,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.ins_func_id,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.upd_cntr,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.upd_usr_id,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.upd_usr_nm,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.upd_ts,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.upd_func_id,
	mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.upd_srv_req_no
FROM
	mam_calc_rpt_ptn_all mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org
WHERE
	0 = 0
	AND mam_calc_rpt_ptn_$u_mam_calc_rpt_ptn_all_org.co_cd = fcpa_context$f_get_co_cd()
;

