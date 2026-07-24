SELECT 
	mam_stdcost__mam_stdcost_all_org.itm_cd,
	mam_stdcost__mam_stdcost_all_org.itm_sub1,
	mam_stdcost__mam_stdcost_all_org.itm_sub2,
	mam_stdcost__mam_stdcost_all_org.itm_sub3,
	mam_stdcost__mam_stdcost_all_org.term,
	mam_stdcost__mam_stdcost_all_org.wg_cd,
	mam_stdcost__mam_stdcost_all_org.std_qty,
	mam_stdcost__mam_stdcost_all_org.std_upri,
	mam_stdcost__mam_stdcost_all_org.sub_upri1,
	mam_stdcost__mam_stdcost_all_org.sub_upri2,
	mam_stdcost__mam_stdcost_all_org.sub_upri3,
	mam_stdcost__mam_stdcost_all_org.memo1,
	mam_stdcost__mam_stdcost_all_org.memo2,
	mam_stdcost__mam_stdcost_all_org.memo3,
	mam_stdcost__mam_stdcost_all_org.del_flg,
	mam_stdcost__mam_stdcost_all_org.del_usr_id,
	mam_stdcost__mam_stdcost_all_org.del_usr_nm,
	mam_stdcost__mam_stdcost_all_org.del_ts,
	mam_stdcost__mam_stdcost_all_org.ins_usr_id,
	mam_stdcost__mam_stdcost_all_org.ins_usr_nm,
	mam_stdcost__mam_stdcost_all_org.ins_ts,
	mam_stdcost__mam_stdcost_all_org.ins_func_id,
	mam_stdcost__mam_stdcost_all_org.upd_cntr,
	mam_stdcost__mam_stdcost_all_org.upd_usr_id,
	mam_stdcost__mam_stdcost_all_org.upd_usr_nm,
	mam_stdcost__mam_stdcost_all_org.upd_ts,
	mam_stdcost__mam_stdcost_all_org.upd_func_id,
	mam_stdcost__mam_stdcost_all_org.upd_srv_req_no
FROM 
	mam_stdcost_all mam_stdcost__mam_stdcost_all_org
WHERE 
	0 = 0
	AND mam_stdcost__mam_stdcost_all_org.co_cd = fcpa_context$f_get_co_cd()
;
