\encoding UTF-8

CREATE OR REPLACE VIEW mam_site(
	site_cd,
	site_nm,
	base_site_nm,
	arr_flg,
	zip_cd,
	base_zip_cd,
	addr1,
	base_addr1,
	addr2,
	base_addr2,
	addr3,
	base_addr3,
	addr4,
	base_addr4,
	tel,
	base_tel,
	fax,
	base_fax,
	def_loc_grp_cd,
	def_alloc_grp_cd,
	def_lg_grp_cd,
	def_cal_cd,
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
	mam_site_mam_site_all_org.site_cd,
	mam_site_mam_site_lcl_all_lcl.site_nm,
	mam_site_mam_site_all_org.site_nm AS base_site_nm,
	mam_site_mam_site_all_org.arr_flg,
	mam_site_mam_site_lcl_all_lcl.zip_cd,
	mam_site_mam_site_all_org.zip_cd AS base_zip_cd,
	mam_site_mam_site_lcl_all_lcl.addr1,
	mam_site_mam_site_all_org.addr1 AS base_addr1,
	mam_site_mam_site_lcl_all_lcl.addr2,
	mam_site_mam_site_all_org.addr2 AS base_addr2,
	mam_site_mam_site_lcl_all_lcl.addr3,
	mam_site_mam_site_all_org.addr3 AS base_addr3,
	mam_site_mam_site_lcl_all_lcl.addr4,
	mam_site_mam_site_all_org.addr4 AS base_addr4,
	mam_site_mam_site_lcl_all_lcl.tel,
	mam_site_mam_site_all_org.tel AS base_tel,
	mam_site_mam_site_lcl_all_lcl.fax,
	mam_site_mam_site_all_org.fax AS base_fax,
	mam_site_mam_site_all_org.def_loc_grp_cd,
	mam_site_mam_site_all_org.def_alloc_grp_cd,
	mam_site_mam_site_all_org.def_lg_grp_cd,
	mam_site_mam_site_all_org.def_cal_cd,
	mam_site_mam_site_all_org.memo1,
	mam_site_mam_site_all_org.memo2,
	mam_site_mam_site_all_org.memo3,
	mam_site_mam_site_all_org.del_flg,
	mam_site_mam_site_all_org.del_usr_id,
	mam_site_mam_site_all_org.del_usr_nm,
	mam_site_mam_site_all_org.del_ts,
	mam_site_mam_site_all_org.ins_usr_id,
	mam_site_mam_site_all_org.ins_usr_nm,
	mam_site_mam_site_all_org.ins_ts,
	mam_site_mam_site_all_org.ins_func_id,
	mam_site_mam_site_all_org.upd_cntr,
	mam_site_mam_site_all_org.upd_usr_id,
	mam_site_mam_site_all_org.upd_usr_nm,
	mam_site_mam_site_all_org.upd_ts,
	mam_site_mam_site_all_org.upd_func_id,
	mam_site_mam_site_all_org.upd_srv_req_no
FROM
	mam_site_all mam_site_mam_site_all_org
LEFT OUTER JOIN
	mam_site_lcl_all mam_site_mam_site_lcl_all_lcl
ON
	mam_site_mam_site_all_org.site_cd = mam_site_mam_site_lcl_all_lcl.site_cd
	AND mam_site_mam_site_all_org.co_cd = mam_site_mam_site_lcl_all_lcl.co_cd
	AND mam_site_mam_site_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_site_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_site_mam_site_all_org.co_cd = (SELECT co_cd FROM fct_context mam_site_fct_context WHERE pid = pg_backend_pid())
	AND (mam_site_mam_site_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_site_maw_del_flg_ctl_W WHERE lower(mam_site_maw_del_flg_ctl_W.tbl_nm) = 'mam_site'))
;

