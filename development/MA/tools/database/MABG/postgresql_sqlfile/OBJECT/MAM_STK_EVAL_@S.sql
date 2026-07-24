\encoding UTF-8

CREATE OR REPLACE VIEW mam_stk_eval_$s(
	stk_eval_cd,
	stk_eval_nm,
	base_stk_eval_nm,
	ac_rsn_cd,
	cut_flg,
	expns_cd,
	lump_rate_flg,
	eval_rate,
	upri_set_typ,
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
	mam_stk_eval_$s_mam_stk_eval_all_org.stk_eval_cd,
	mam_stk_eval_$s_mam_stk_eval_lcl_all_lcl.stk_eval_nm,
	mam_stk_eval_$s_mam_stk_eval_all_org.stk_eval_nm AS base_stk_eval_nm,
	mam_stk_eval_$s_mam_stk_eval_all_org.ac_rsn_cd,
	mam_stk_eval_$s_mam_stk_eval_all_org.cut_flg,
	mam_stk_eval_$s_mam_stk_eval_all_org.expns_cd,
	mam_stk_eval_$s_mam_stk_eval_all_org.lump_rate_flg,
	mam_stk_eval_$s_mam_stk_eval_all_org.eval_rate,
	mam_stk_eval_$s_mam_stk_eval_all_org.upri_set_typ,
	mam_stk_eval_$s_mam_stk_eval_all_org.memo1,
	mam_stk_eval_$s_mam_stk_eval_all_org.memo2,
	mam_stk_eval_$s_mam_stk_eval_all_org.memo3,
	mam_stk_eval_$s_mam_stk_eval_all_org.del_flg,
	mam_stk_eval_$s_mam_stk_eval_all_org.del_usr_id,
	mam_stk_eval_$s_mam_stk_eval_all_org.del_usr_nm,
	mam_stk_eval_$s_mam_stk_eval_all_org.del_ts,
	mam_stk_eval_$s_mam_stk_eval_all_org.ins_usr_id,
	mam_stk_eval_$s_mam_stk_eval_all_org.ins_usr_nm,
	mam_stk_eval_$s_mam_stk_eval_all_org.ins_ts,
	mam_stk_eval_$s_mam_stk_eval_all_org.ins_func_id,
	mam_stk_eval_$s_mam_stk_eval_all_org.upd_cntr,
	mam_stk_eval_$s_mam_stk_eval_all_org.upd_usr_id,
	mam_stk_eval_$s_mam_stk_eval_all_org.upd_usr_nm,
	mam_stk_eval_$s_mam_stk_eval_all_org.upd_ts,
	mam_stk_eval_$s_mam_stk_eval_all_org.upd_func_id,
	mam_stk_eval_$s_mam_stk_eval_all_org.upd_srv_req_no
FROM
	mam_stk_eval_all mam_stk_eval_$s_mam_stk_eval_all_org
LEFT OUTER JOIN
	mam_stk_eval_lcl_all mam_stk_eval_$s_mam_stk_eval_lcl_all_lcl
ON
	mam_stk_eval_$s_mam_stk_eval_all_org.stk_eval_cd = mam_stk_eval_$s_mam_stk_eval_lcl_all_lcl.stk_eval_cd
	AND mam_stk_eval_$s_mam_stk_eval_all_org.co_cd = mam_stk_eval_$s_mam_stk_eval_lcl_all_lcl.co_cd
	AND mam_stk_eval_$s_mam_stk_eval_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_stk_eval_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_stk_eval_$s_mam_stk_eval_all_org.co_cd = (SELECT co_cd FROM fct_context mam_stk_eval_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_stk_eval_$s_mam_stk_eval_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_stk_eval_$s_maw_del_flg_ctl_W WHERE lower(mam_stk_eval_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_stk_eval'))
;

