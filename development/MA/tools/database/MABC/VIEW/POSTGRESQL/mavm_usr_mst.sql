SELECT	mavm_usr_mst_mam_usr_all_m.usr_cd,
	mavm_usr_mst_mam_usr_all_m.usr_nm,
	mavm_usr_mst_mam_usr_all_m.usr_alt_nm1,
	mavm_usr_mst_mam_usr_all_m.usr_alt_nm2,
	mavm_usr_mst_mam_usr_all_m.usr_alt_nm3,
	mavm_usr_mst_mam_usr_all_m.usr_alt_nm4,
	mavm_usr_mst_mam_usr_all_m.full_da_flg,
	mavm_usr_mst_mam_usr_all_m.email1,
	mavm_usr_mst_mam_usr_all_m.email2,
	mavm_usr_mst_mam_usr_all_m.email3,
	mavm_usr_mst_mam_usr_all_m.tel1,
	mavm_usr_mst_mam_usr_all_m.tel2,
	mavm_usr_mst_mam_usr_all_m.tel3,
	mavm_usr_mst_mam_usr_all_m.th_image,
	mavm_usr_mst_mam_usr_all_m.usr_com_typ,
	mavm_usr_mst_mam_usr_all_m.usr_com,
	mavm_usr_mst_mam_usr_all_m.wk_cost_cd,
	mavm_usr_mst_mam_usr_all_m.usr_info1,
	mavm_usr_mst_mam_usr_all_m.usr_info2,
	mavm_usr_mst_mam_usr_all_m.usr_info3,
	mavm_usr_mst_mam_usr_all_m.usr_info4,
	mavm_usr_mst_mam_usr_all_m.usr_info5,
	mavm_usr_mst_mam_usr_all_m.usr_info6,
	mavm_usr_mst_mam_usr_all_m.usr_info7,
	mavm_usr_mst_mam_usr_all_m.usr_info8,
	mavm_usr_mst_mam_usr_all_m.usr_info9,
	mavm_usr_mst_mam_usr_all_m.usr_info10,
	mavm_usr_mst_mam_usr_all_m.usr_info11,
	mavm_usr_mst_mam_usr_all_m.usr_info12,
	mavm_usr_mst_mam_usr_all_m.usr_info13,
	mavm_usr_mst_mam_usr_all_m.usr_info14,
	mavm_usr_mst_mam_usr_all_m.usr_info15,
	mavm_usr_mst_mam_usr_all_m.usr_info16,
	mavm_usr_mst_mam_usr_all_m.usr_info17,
	mavm_usr_mst_mam_usr_all_m.usr_info18,
	mavm_usr_mst_mam_usr_all_m.usr_info19,
	mavm_usr_mst_mam_usr_all_m.usr_info20,
	mavm_usr_mst_mam_usr_all_m.memo1,
	mavm_usr_mst_mam_usr_all_m.memo2,
	mavm_usr_mst_mam_usr_all_m.memo3,
	mavm_usr_mst_mam_usr_all_m.del_flg,
	mavm_usr_mst_mam_usr_all_m.del_usr_id,
	mavm_usr_mst_mam_usr_all_m.del_usr_nm,
	mavm_usr_mst_mam_usr_all_m.del_ts,
	mavm_usr_mst_mam_usr_all_m.ins_usr_id,
	mavm_usr_mst_mam_usr_all_m.ins_usr_nm,
	mavm_usr_mst_mam_usr_all_m.ins_ts,
	mavm_usr_mst_mam_usr_all_m.ins_func_id,
	mavm_usr_mst_mam_usr_all_m.upd_cntr,
	mavm_usr_mst_mam_usr_all_m.upd_usr_id,
	mavm_usr_mst_mam_usr_all_m.upd_usr_nm,
	mavm_usr_mst_mam_usr_all_m.upd_ts,
	mavm_usr_mst_mam_usr_all_m.upd_func_id,
	mavm_usr_mst_mam_usr_all_m.upd_srv_req_no,
	mavm_usr_mst_mam_usr_all_m.co_cd
FROM	mam_usr_all mavm_usr_mst_mam_usr_all_m
WHERE	0=0
AND	(
	EXISTS (
		SELECT 'X'
		FROM	mam_mst_ctl mavm_usr_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_usr_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_USR') 
		AND	mavm_usr_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
	) 
	OR 
	NOT EXISTS (
		SELECT 'X'
		FROM	mam_mst_ctl mavm_usr_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_usr_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_USR')
		)
	)
UNION ALL
SELECT	mavm_usr_mst_mam_usr_cmn_m.usr_cd,
	mavm_usr_mst_mam_usr_cmn_m.usr_nm,
	mavm_usr_mst_mam_usr_cmn_m.usr_alt_nm1,
	mavm_usr_mst_mam_usr_cmn_m.usr_alt_nm2,
	mavm_usr_mst_mam_usr_cmn_m.usr_alt_nm3,
	mavm_usr_mst_mam_usr_cmn_m.usr_alt_nm4,
	mavm_usr_mst_mam_usr_cmn_m.full_da_flg,
	mavm_usr_mst_mam_usr_cmn_m.email1,
	mavm_usr_mst_mam_usr_cmn_m.email2,
	mavm_usr_mst_mam_usr_cmn_m.email3,
	mavm_usr_mst_mam_usr_cmn_m.tel1,
	mavm_usr_mst_mam_usr_cmn_m.tel2,
	mavm_usr_mst_mam_usr_cmn_m.tel3,
	mavm_usr_mst_mam_usr_cmn_m.th_image,
	mavm_usr_mst_mam_usr_cmn_m.usr_com_typ,
	mavm_usr_mst_mam_usr_cmn_m.usr_com,
	mavm_usr_mst_mam_usr_cmn_m.wk_cost_cd,
	mavm_usr_mst_mam_usr_cmn_m.usr_info1,
	mavm_usr_mst_mam_usr_cmn_m.usr_info2,
	mavm_usr_mst_mam_usr_cmn_m.usr_info3,
	mavm_usr_mst_mam_usr_cmn_m.usr_info4,
	mavm_usr_mst_mam_usr_cmn_m.usr_info5,
	mavm_usr_mst_mam_usr_cmn_m.usr_info6,
	mavm_usr_mst_mam_usr_cmn_m.usr_info7,
	mavm_usr_mst_mam_usr_cmn_m.usr_info8,
	mavm_usr_mst_mam_usr_cmn_m.usr_info9,
	mavm_usr_mst_mam_usr_cmn_m.usr_info10,
	mavm_usr_mst_mam_usr_cmn_m.usr_info11,
	mavm_usr_mst_mam_usr_cmn_m.usr_info12,
	mavm_usr_mst_mam_usr_cmn_m.usr_info13,
	mavm_usr_mst_mam_usr_cmn_m.usr_info14,
	mavm_usr_mst_mam_usr_cmn_m.usr_info15,
	mavm_usr_mst_mam_usr_cmn_m.usr_info16,
	mavm_usr_mst_mam_usr_cmn_m.usr_info17,
	mavm_usr_mst_mam_usr_cmn_m.usr_info18,
	mavm_usr_mst_mam_usr_cmn_m.usr_info19,
	mavm_usr_mst_mam_usr_cmn_m.usr_info20,
	mavm_usr_mst_mam_usr_cmn_m.memo1,
	mavm_usr_mst_mam_usr_cmn_m.memo2,
	mavm_usr_mst_mam_usr_cmn_m.memo3,
	mavm_usr_mst_mam_usr_cmn_m.del_flg,
	mavm_usr_mst_mam_usr_cmn_m.del_usr_id,
	mavm_usr_mst_mam_usr_cmn_m.del_usr_nm,
	mavm_usr_mst_mam_usr_cmn_m.del_ts,
	mavm_usr_mst_mam_usr_cmn_m.ins_usr_id,
	mavm_usr_mst_mam_usr_cmn_m.ins_usr_nm,
	mavm_usr_mst_mam_usr_cmn_m.ins_ts,
	mavm_usr_mst_mam_usr_cmn_m.ins_func_id,
	mavm_usr_mst_mam_usr_cmn_m.upd_cntr,
	mavm_usr_mst_mam_usr_cmn_m.upd_usr_id,
	mavm_usr_mst_mam_usr_cmn_m.upd_usr_nm,
	mavm_usr_mst_mam_usr_cmn_m.upd_ts,
	mavm_usr_mst_mam_usr_cmn_m.upd_func_id,
	mavm_usr_mst_mam_usr_cmn_m.upd_srv_req_no,
	NULL AS co_cd
FROM	mam_usr_cmn mavm_usr_mst_mam_usr_cmn_m
WHERE	0=0
AND	EXISTS (
		SELECT 'X'
		FROM	mam_mst_ctl mavm_usr_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_usr_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_USR') 
		AND	mavm_usr_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
