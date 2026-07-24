\encoding UTF-8

CREATE OR REPLACE VIEW mam_rpt_cmp_$s(
	cmp_ptn_cd,
	cmp_ptn_nm,
	base_cmp_ptn_nm,
	rpt_ptn_cd,
	rpt_key_cd,
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
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.cmp_ptn_cd,
	mam_rpt_cmp_$s_mam_rpt_cmp_lcl_all_lcl.cmp_ptn_nm,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.cmp_ptn_nm AS base_cmp_ptn_nm,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.rpt_ptn_cd,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.rpt_key_cd,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.memo1,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.memo2,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.memo3,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.del_flg,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.del_usr_id,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.del_usr_nm,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.del_ts,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.ins_usr_id,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.ins_usr_nm,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.ins_ts,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.ins_func_id,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.upd_cntr,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.upd_usr_id,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.upd_usr_nm,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.upd_ts,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.upd_func_id,
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.upd_srv_req_no
FROM
	mam_rpt_cmp_all mam_rpt_cmp_$s_mam_rpt_cmp_all_org
LEFT OUTER JOIN
	mam_rpt_cmp_lcl_all mam_rpt_cmp_$s_mam_rpt_cmp_lcl_all_lcl
ON
	mam_rpt_cmp_$s_mam_rpt_cmp_all_org.cmp_ptn_cd = mam_rpt_cmp_$s_mam_rpt_cmp_lcl_all_lcl.cmp_ptn_cd
	AND mam_rpt_cmp_$s_mam_rpt_cmp_all_org.co_cd = mam_rpt_cmp_$s_mam_rpt_cmp_lcl_all_lcl.co_cd
	AND mam_rpt_cmp_$s_mam_rpt_cmp_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_rpt_cmp_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_rpt_cmp_$s_mam_rpt_cmp_all_org.co_cd = (SELECT co_cd FROM fct_context mam_rpt_cmp_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_rpt_cmp_$s_mam_rpt_cmp_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_rpt_cmp_$s_maw_del_flg_ctl_W WHERE lower(mam_rpt_cmp_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_rpt_cmp'))
;

