SELECT 
	mam_itm_unit__mam_itm_unit_all_org.itm_cd,
	mam_itm_unit__mam_itm_unit_all_org.itm_sub1,
	mam_itm_unit__mam_itm_unit_all_org.itm_sub2,
	mam_itm_unit__mam_itm_unit_all_org.itm_sub3,
	mam_itm_unit__mam_itm_unit_all_org.unit_cd,
	mam_itm_unit__mam_itm_unit_all_org.conv_base_qty,
	mam_itm_unit__mam_itm_unit_all_org.conv_qty,
	mam_itm_unit__mam_itm_unit_all_org.dec_place,
	mam_itm_unit__mam_itm_unit_all_org.rnd_typ,
	mam_itm_unit__mam_itm_unit_all_org.pack_flg,
	mam_itm_unit__mam_itm_unit_all_org.pckg_flg,
	mam_itm_unit__mam_itm_unit_all_org.unit_dim,
	mam_itm_unit__mam_itm_unit_all_org.unit_wt,
	mam_itm_unit__mam_itm_unit_all_org.memo1,
	mam_itm_unit__mam_itm_unit_all_org.memo2,
	mam_itm_unit__mam_itm_unit_all_org.memo3,
	mam_itm_unit__mam_itm_unit_all_org.del_flg,
	mam_itm_unit__mam_itm_unit_all_org.del_usr_id,
	mam_itm_unit__mam_itm_unit_all_org.del_usr_nm,
	mam_itm_unit__mam_itm_unit_all_org.del_ts,
	mam_itm_unit__mam_itm_unit_all_org.ins_usr_id,
	mam_itm_unit__mam_itm_unit_all_org.ins_usr_nm,
	mam_itm_unit__mam_itm_unit_all_org.ins_ts,
	mam_itm_unit__mam_itm_unit_all_org.ins_func_id,
	mam_itm_unit__mam_itm_unit_all_org.upd_cntr,
	mam_itm_unit__mam_itm_unit_all_org.upd_usr_id,
	mam_itm_unit__mam_itm_unit_all_org.upd_usr_nm,
	mam_itm_unit__mam_itm_unit_all_org.upd_ts,
	mam_itm_unit__mam_itm_unit_all_org.upd_func_id,
	mam_itm_unit__mam_itm_unit_all_org.upd_srv_req_no
FROM 
	mam_itm_unit_all mam_itm_unit__mam_itm_unit_all_org
WHERE 
	0 = 0
	AND mam_itm_unit__mam_itm_unit_all_org.co_cd = fcpa_context$f_get_co_cd()
;
