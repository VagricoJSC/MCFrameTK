\encoding UTF-8

CREATE OR REPLACE VIEW mam_cost_dpt_$s(
	dpt_cd,
	term,
	dpt_nm,
	base_dpt_nm,
	dpt_lvl_cd,
	dpt_alc_grp,
	dpt_config_typ,
	lg_grp_cd,
	loc_grp_cd,
	wg_cd,
	site_cd,
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
	mam_cost_dpt_$s_mam_cost_dpt_all_org.dpt_cd,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.term,
	mam_cost_dpt_$s_mam_cost_dpt_lcl_all_lcl.dpt_nm,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.dpt_nm AS base_dpt_nm,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.dpt_lvl_cd,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.dpt_alc_grp,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.dpt_config_typ,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.lg_grp_cd,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.loc_grp_cd,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.wg_cd,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.site_cd,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.memo1,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.memo2,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.memo3,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.del_flg,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.del_usr_id,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.del_usr_nm,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.del_ts,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.ins_usr_id,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.ins_usr_nm,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.ins_ts,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.ins_func_id,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.upd_cntr,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.upd_usr_id,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.upd_usr_nm,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.upd_ts,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.upd_func_id,
	mam_cost_dpt_$s_mam_cost_dpt_all_org.upd_srv_req_no
FROM
	mam_cost_dpt_all mam_cost_dpt_$s_mam_cost_dpt_all_org
LEFT OUTER JOIN
	mam_cost_dpt_lcl_all mam_cost_dpt_$s_mam_cost_dpt_lcl_all_lcl
ON
	mam_cost_dpt_$s_mam_cost_dpt_all_org.dpt_cd = mam_cost_dpt_$s_mam_cost_dpt_lcl_all_lcl.dpt_cd
	AND mam_cost_dpt_$s_mam_cost_dpt_all_org.term = mam_cost_dpt_$s_mam_cost_dpt_lcl_all_lcl.term
	AND mam_cost_dpt_$s_mam_cost_dpt_all_org.co_cd = mam_cost_dpt_$s_mam_cost_dpt_lcl_all_lcl.co_cd
	AND mam_cost_dpt_$s_mam_cost_dpt_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_cost_dpt_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_cost_dpt_$s_mam_cost_dpt_all_org.co_cd = (SELECT co_cd FROM fct_context mam_cost_dpt_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_cost_dpt_$s_mam_cost_dpt_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_cost_dpt_$s_maw_del_flg_ctl_W WHERE lower(mam_cost_dpt_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_cost_dpt'))
;

