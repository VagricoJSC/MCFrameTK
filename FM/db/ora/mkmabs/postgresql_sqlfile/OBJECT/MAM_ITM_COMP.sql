\encoding UTF-8

CREATE OR REPLACE VIEW mam_itm_comp(
	core_itm_cd,
	core_itm_sub1,
	core_itm_sub2,
	core_itm_sub3,
	comp_itm_cd,
	comp_itm_sub1,
	comp_itm_sub2,
	comp_itm_sub3,
	core_itm_qty,
	comp_itm_unit_cd,
	comp_itm_qty,
	itm_comp_grp_cd,
	def_flg,
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
	mam_itm_comp_mam_itm_comp_all_org.core_itm_cd,
	mam_itm_comp_mam_itm_comp_all_org.core_itm_sub1,
	mam_itm_comp_mam_itm_comp_all_org.core_itm_sub2,
	mam_itm_comp_mam_itm_comp_all_org.core_itm_sub3,
	mam_itm_comp_mam_itm_comp_all_org.comp_itm_cd,
	mam_itm_comp_mam_itm_comp_all_org.comp_itm_sub1,
	mam_itm_comp_mam_itm_comp_all_org.comp_itm_sub2,
	mam_itm_comp_mam_itm_comp_all_org.comp_itm_sub3,
	mam_itm_comp_mam_itm_comp_all_org.core_itm_qty,
	mam_itm_comp_mam_itm_comp_all_org.comp_itm_unit_cd,
	mam_itm_comp_mam_itm_comp_all_org.comp_itm_qty,
	mam_itm_comp_mam_itm_comp_all_org.itm_comp_grp_cd,
	mam_itm_comp_mam_itm_comp_all_org.def_flg,
	mam_itm_comp_mam_itm_comp_all_org.memo1,
	mam_itm_comp_mam_itm_comp_all_org.memo2,
	mam_itm_comp_mam_itm_comp_all_org.memo3,
	mam_itm_comp_mam_itm_comp_all_org.del_flg,
	mam_itm_comp_mam_itm_comp_all_org.del_usr_id,
	mam_itm_comp_mam_itm_comp_all_org.del_usr_nm,
	mam_itm_comp_mam_itm_comp_all_org.del_ts,
	mam_itm_comp_mam_itm_comp_all_org.ins_usr_id,
	mam_itm_comp_mam_itm_comp_all_org.ins_usr_nm,
	mam_itm_comp_mam_itm_comp_all_org.ins_ts,
	mam_itm_comp_mam_itm_comp_all_org.ins_func_id,
	mam_itm_comp_mam_itm_comp_all_org.upd_cntr,
	mam_itm_comp_mam_itm_comp_all_org.upd_usr_id,
	mam_itm_comp_mam_itm_comp_all_org.upd_usr_nm,
	mam_itm_comp_mam_itm_comp_all_org.upd_ts,
	mam_itm_comp_mam_itm_comp_all_org.upd_func_id,
	mam_itm_comp_mam_itm_comp_all_org.upd_srv_req_no
FROM
	mam_itm_comp_all mam_itm_comp_mam_itm_comp_all_org
WHERE
	0 = 0
	AND mam_itm_comp_mam_itm_comp_all_org.co_cd = (SELECT co_cd FROM fct_context mam_itm_comp_fct_context WHERE pid = pg_backend_pid())
	AND (mam_itm_comp_mam_itm_comp_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_itm_comp_maw_del_flg_ctl_W WHERE lower(mam_itm_comp_maw_del_flg_ctl_W.tbl_nm) = 'mam_itm_comp'))
;

