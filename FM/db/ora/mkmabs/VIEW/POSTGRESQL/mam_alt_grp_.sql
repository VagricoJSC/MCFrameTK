SELECT 
	mam_alt_grp__mam_alt_grp_all_org.alt_grp_cd,
	mam_alt_grp__mam_alt_grp_all_org.wg_cd,
	mam_alt_grp__mam_alt_grp_all_org.alt_grp_nm,
	mam_alt_grp__mam_alt_grp_all_org.alt_itm_typ,
	mam_alt_grp__mam_alt_grp_all_org.memo1,
	mam_alt_grp__mam_alt_grp_all_org.memo2,
	mam_alt_grp__mam_alt_grp_all_org.memo3,
	mam_alt_grp__mam_alt_grp_all_org.del_flg,
	mam_alt_grp__mam_alt_grp_all_org.del_usr_id,
	mam_alt_grp__mam_alt_grp_all_org.del_usr_nm,
	mam_alt_grp__mam_alt_grp_all_org.del_ts,
	mam_alt_grp__mam_alt_grp_all_org.ins_usr_id,
	mam_alt_grp__mam_alt_grp_all_org.ins_usr_nm,
	mam_alt_grp__mam_alt_grp_all_org.ins_ts,
	mam_alt_grp__mam_alt_grp_all_org.ins_func_id,
	mam_alt_grp__mam_alt_grp_all_org.upd_cntr,
	mam_alt_grp__mam_alt_grp_all_org.upd_usr_id,
	mam_alt_grp__mam_alt_grp_all_org.upd_usr_nm,
	mam_alt_grp__mam_alt_grp_all_org.upd_ts,
	mam_alt_grp__mam_alt_grp_all_org.upd_func_id,
	mam_alt_grp__mam_alt_grp_all_org.upd_srv_req_no
FROM 
	mam_alt_grp_all mam_alt_grp__mam_alt_grp_all_org
WHERE 
	0 = 0
	AND mam_alt_grp__mam_alt_grp_all_org.co_cd = fcpa_context$f_get_co_cd()
;
