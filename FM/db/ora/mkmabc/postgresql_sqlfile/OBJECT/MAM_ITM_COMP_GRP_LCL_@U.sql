\encoding UTF-8

CREATE OR REPLACE VIEW mam_itm_comp_grp_lcl_$u(
	itm_comp_grp_cd,
	itm_comp_grp_nm,
	memo1,
	memo2,
	memo3,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no,
	lcl_cd
	)
AS
SELECT
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.itm_comp_grp_cd,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.itm_comp_grp_nm,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.memo1,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.memo2,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.memo3,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.ins_usr_id,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.ins_usr_nm,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.ins_ts,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.ins_func_id,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.upd_cntr,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.upd_usr_id,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.upd_usr_nm,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.upd_ts,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.upd_func_id,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.upd_srv_req_no,
	mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.lcl_cd
FROM
	mam_itm_comp_grp_lcl_all mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org
WHERE
	0 = 0
	AND mam_itm_comp_grp_lcl_$u_mam_itm_comp_grp_lcl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

