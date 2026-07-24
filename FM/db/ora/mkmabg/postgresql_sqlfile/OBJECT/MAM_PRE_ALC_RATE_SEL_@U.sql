\encoding UTF-8

CREATE OR REPLACE VIEW mam_pre_alc_rate_sel_$u(
	alc_ac_cd,
	dpt_cd,
	calc_ctg_cd,
	wg_cd,
	term,
	pre_alc_rate_cd,
	trd_alc_ac_cd,
	trd_wg_cd,
	pre_alc_dpt_ptn,
	fin_flg,
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
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.alc_ac_cd,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.dpt_cd,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.calc_ctg_cd,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.wg_cd,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.term,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.pre_alc_rate_cd,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.trd_alc_ac_cd,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.trd_wg_cd,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.pre_alc_dpt_ptn,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.fin_flg,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.memo1,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.memo2,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.memo3,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.del_flg,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.del_usr_id,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.del_usr_nm,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.del_ts,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.ins_usr_id,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.ins_usr_nm,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.ins_ts,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.ins_func_id,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.upd_cntr,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.upd_usr_id,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.upd_usr_nm,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.upd_ts,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.upd_func_id,
	mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.upd_srv_req_no
FROM
	mam_pre_alc_rate_sel_all mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org
WHERE
	0 = 0
	AND mam_pre_alc_rate_sel_$u_mam_pre_alc_rate_sel_all_org.co_cd = fcpa_context$f_get_co_cd()
;

