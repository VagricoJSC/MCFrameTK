\encoding UTF-8

CREATE OR REPLACE VIEW mam_calc_grp_$s(
	calc_grp_cd,
	calc_grp_nm,
	base_calc_grp_nm,
	cost_calc_typ,
	eval_typ,
	max_mons,
	calc_cnt,
	sa_typ,
	exp_calc_typ,
	pre_alc_calc_typ,
	alc_calc_typ,
	inpt_calc_flg,
	wk_calc_flg,
	prov_calc_flg,
	xfr_calc_flg,
	xrate_cd,
	calc_seq_grp,
	calc_seq,
	runtime_wg_cd,
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
	mam_calc_grp_$s_mam_calc_grp_all_org.calc_grp_cd,
	mam_calc_grp_$s_mam_calc_grp_lcl_all_lcl.calc_grp_nm,
	mam_calc_grp_$s_mam_calc_grp_all_org.calc_grp_nm AS base_calc_grp_nm,
	mam_calc_grp_$s_mam_calc_grp_all_org.cost_calc_typ,
	mam_calc_grp_$s_mam_calc_grp_all_org.eval_typ,
	mam_calc_grp_$s_mam_calc_grp_all_org.max_mons,
	mam_calc_grp_$s_mam_calc_grp_all_org.calc_cnt,
	mam_calc_grp_$s_mam_calc_grp_all_org.sa_typ,
	mam_calc_grp_$s_mam_calc_grp_all_org.exp_calc_typ,
	mam_calc_grp_$s_mam_calc_grp_all_org.pre_alc_calc_typ,
	mam_calc_grp_$s_mam_calc_grp_all_org.alc_calc_typ,
	mam_calc_grp_$s_mam_calc_grp_all_org.inpt_calc_flg,
	mam_calc_grp_$s_mam_calc_grp_all_org.wk_calc_flg,
	mam_calc_grp_$s_mam_calc_grp_all_org.prov_calc_flg,
	mam_calc_grp_$s_mam_calc_grp_all_org.xfr_calc_flg,
	mam_calc_grp_$s_mam_calc_grp_all_org.xrate_cd,
	mam_calc_grp_$s_mam_calc_grp_all_org.calc_seq_grp,
	mam_calc_grp_$s_mam_calc_grp_all_org.calc_seq,
	mam_calc_grp_$s_mam_calc_grp_all_org.runtime_wg_cd,
	mam_calc_grp_$s_mam_calc_grp_all_org.memo1,
	mam_calc_grp_$s_mam_calc_grp_all_org.memo2,
	mam_calc_grp_$s_mam_calc_grp_all_org.memo3,
	mam_calc_grp_$s_mam_calc_grp_all_org.del_flg,
	mam_calc_grp_$s_mam_calc_grp_all_org.del_usr_id,
	mam_calc_grp_$s_mam_calc_grp_all_org.del_usr_nm,
	mam_calc_grp_$s_mam_calc_grp_all_org.del_ts,
	mam_calc_grp_$s_mam_calc_grp_all_org.ins_usr_id,
	mam_calc_grp_$s_mam_calc_grp_all_org.ins_usr_nm,
	mam_calc_grp_$s_mam_calc_grp_all_org.ins_ts,
	mam_calc_grp_$s_mam_calc_grp_all_org.ins_func_id,
	mam_calc_grp_$s_mam_calc_grp_all_org.upd_cntr,
	mam_calc_grp_$s_mam_calc_grp_all_org.upd_usr_id,
	mam_calc_grp_$s_mam_calc_grp_all_org.upd_usr_nm,
	mam_calc_grp_$s_mam_calc_grp_all_org.upd_ts,
	mam_calc_grp_$s_mam_calc_grp_all_org.upd_func_id,
	mam_calc_grp_$s_mam_calc_grp_all_org.upd_srv_req_no
FROM
	mam_calc_grp_all mam_calc_grp_$s_mam_calc_grp_all_org
LEFT OUTER JOIN
	mam_calc_grp_lcl_all mam_calc_grp_$s_mam_calc_grp_lcl_all_lcl
ON
	mam_calc_grp_$s_mam_calc_grp_all_org.calc_grp_cd = mam_calc_grp_$s_mam_calc_grp_lcl_all_lcl.calc_grp_cd
	AND mam_calc_grp_$s_mam_calc_grp_all_org.co_cd = mam_calc_grp_$s_mam_calc_grp_lcl_all_lcl.co_cd
	AND mam_calc_grp_$s_mam_calc_grp_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_calc_grp_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_calc_grp_$s_mam_calc_grp_all_org.co_cd = (SELECT co_cd FROM fct_context mam_calc_grp_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_calc_grp_$s_mam_calc_grp_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_calc_grp_$s_maw_del_flg_ctl_W WHERE lower(mam_calc_grp_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_calc_grp'))
;

