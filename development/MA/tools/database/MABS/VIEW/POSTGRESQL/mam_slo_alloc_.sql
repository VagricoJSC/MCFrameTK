SELECT 
	mam_slo_alloc__mam_slo_alloc_all_org.to_lg_grp_cd,
	mam_slo_alloc__mam_slo_alloc_all_org.itm_ship_grp_cd,
	mam_slo_alloc__mam_slo_alloc_all_org.wg_cd,
	mam_slo_alloc__mam_slo_alloc_all_org.loc_cd,
	mam_slo_alloc__mam_slo_alloc_all_org.lg_grp_cd,
	mam_slo_alloc__mam_slo_alloc_all_org.alloc_grp_cd,
	mam_slo_alloc__mam_slo_alloc_all_org.alloc_scope_typ,
	mam_slo_alloc__mam_slo_alloc_all_org.alloc_typ,
	mam_slo_alloc__mam_slo_alloc_all_org.ship_loc_cd,
	mam_slo_alloc__mam_slo_alloc_all_org.def_flg,
	mam_slo_alloc__mam_slo_alloc_all_org.memo1,
	mam_slo_alloc__mam_slo_alloc_all_org.memo2,
	mam_slo_alloc__mam_slo_alloc_all_org.memo3,
	mam_slo_alloc__mam_slo_alloc_all_org.del_flg,
	mam_slo_alloc__mam_slo_alloc_all_org.del_usr_id,
	mam_slo_alloc__mam_slo_alloc_all_org.del_usr_nm,
	mam_slo_alloc__mam_slo_alloc_all_org.del_ts,
	mam_slo_alloc__mam_slo_alloc_all_org.ins_usr_id,
	mam_slo_alloc__mam_slo_alloc_all_org.ins_usr_nm,
	mam_slo_alloc__mam_slo_alloc_all_org.ins_ts,
	mam_slo_alloc__mam_slo_alloc_all_org.ins_func_id,
	mam_slo_alloc__mam_slo_alloc_all_org.upd_cntr,
	mam_slo_alloc__mam_slo_alloc_all_org.upd_usr_id,
	mam_slo_alloc__mam_slo_alloc_all_org.upd_usr_nm,
	mam_slo_alloc__mam_slo_alloc_all_org.upd_ts,
	mam_slo_alloc__mam_slo_alloc_all_org.upd_func_id,
	mam_slo_alloc__mam_slo_alloc_all_org.upd_srv_req_no
FROM 
	mam_slo_alloc_all mam_slo_alloc__mam_slo_alloc_all_org
WHERE 
	0 = 0
	AND mam_slo_alloc__mam_slo_alloc_all_org.co_cd = fcpa_context$f_get_co_cd()
;
