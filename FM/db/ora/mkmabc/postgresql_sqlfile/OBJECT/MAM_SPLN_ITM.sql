\encoding UTF-8

CREATE OR REPLACE VIEW mam_spln_itm(
	spln_itm_cd,
	spln_itm_nm,
	base_spln_itm_nm,
	spln_set_typ,
	itm_grp_cd1,
	itm_grp_cd2,
	itm_grp_cd3,
	itm_grp_cd4,
	itm_grp_cd5,
	itm_grp_cd6,
	itm_grp_cd7,
	itm_grp_cd8,
	itm_grp_cd9,
	itm_grp_cd10,
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
	mam_spln_itm_mam_spln_itm_all_org.spln_itm_cd,
	mam_spln_itm_mam_spln_itm_lcl_all_lcl.spln_itm_nm,
	mam_spln_itm_mam_spln_itm_all_org.spln_itm_nm AS base_spln_itm_nm,
	mam_spln_itm_mam_spln_itm_all_org.spln_set_typ,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd1,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd2,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd3,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd4,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd5,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd6,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd7,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd8,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd9,
	mam_spln_itm_mam_spln_itm_all_org.itm_grp_cd10,
	mam_spln_itm_mam_spln_itm_all_org.memo1,
	mam_spln_itm_mam_spln_itm_all_org.memo2,
	mam_spln_itm_mam_spln_itm_all_org.memo3,
	mam_spln_itm_mam_spln_itm_all_org.del_flg,
	mam_spln_itm_mam_spln_itm_all_org.del_usr_id,
	mam_spln_itm_mam_spln_itm_all_org.del_usr_nm,
	mam_spln_itm_mam_spln_itm_all_org.del_ts,
	mam_spln_itm_mam_spln_itm_all_org.ins_usr_id,
	mam_spln_itm_mam_spln_itm_all_org.ins_usr_nm,
	mam_spln_itm_mam_spln_itm_all_org.ins_ts,
	mam_spln_itm_mam_spln_itm_all_org.ins_func_id,
	mam_spln_itm_mam_spln_itm_all_org.upd_cntr,
	mam_spln_itm_mam_spln_itm_all_org.upd_usr_id,
	mam_spln_itm_mam_spln_itm_all_org.upd_usr_nm,
	mam_spln_itm_mam_spln_itm_all_org.upd_ts,
	mam_spln_itm_mam_spln_itm_all_org.upd_func_id,
	mam_spln_itm_mam_spln_itm_all_org.upd_srv_req_no
FROM
	mam_spln_itm_all mam_spln_itm_mam_spln_itm_all_org
LEFT OUTER JOIN
	mam_spln_itm_lcl_all mam_spln_itm_mam_spln_itm_lcl_all_lcl
ON
	mam_spln_itm_mam_spln_itm_all_org.spln_itm_cd = mam_spln_itm_mam_spln_itm_lcl_all_lcl.spln_itm_cd
	AND mam_spln_itm_mam_spln_itm_all_org.co_cd = mam_spln_itm_mam_spln_itm_lcl_all_lcl.co_cd
	AND mam_spln_itm_mam_spln_itm_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_spln_itm_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_spln_itm_mam_spln_itm_all_org.co_cd = (SELECT co_cd FROM fct_context mam_spln_itm_fct_context WHERE pid = pg_backend_pid())
	AND (mam_spln_itm_mam_spln_itm_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_spln_itm_maw_del_flg_ctl_W WHERE lower(mam_spln_itm_maw_del_flg_ctl_W.tbl_nm) = 'mam_spln_itm'))
;

