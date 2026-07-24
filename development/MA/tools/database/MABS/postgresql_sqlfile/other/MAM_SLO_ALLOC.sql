\encoding UTF-8

CREATE OR REPLACE VIEW mam_slo_alloc (
	to_lg_grp_cd,
	itm_ship_grp_cd,
	wg_cd,
	loc_cd,
	lg_grp_cd,
	alloc_grp_cd,
	alloc_scope_typ,
	alloc_typ,
	ship_loc_cd,
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
	mam_slo_alloc_mam_slo_alloc_all_org.to_lg_grp_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.itm_ship_grp_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.wg_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.loc_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.lg_grp_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.alloc_grp_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.alloc_scope_typ,
	mam_slo_alloc_mam_slo_alloc_all_org.alloc_typ,
	mam_slo_alloc_mam_slo_alloc_all_org.ship_loc_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.def_flg,
	mam_slo_alloc_mam_slo_alloc_all_org.memo1,
	mam_slo_alloc_mam_slo_alloc_all_org.memo2,
	mam_slo_alloc_mam_slo_alloc_all_org.memo3,
	mam_slo_alloc_mam_slo_alloc_all_org.del_flg,
	mam_slo_alloc_mam_slo_alloc_all_org.del_usr_id,
	mam_slo_alloc_mam_slo_alloc_all_org.del_usr_nm,
	mam_slo_alloc_mam_slo_alloc_all_org.del_ts,
	mam_slo_alloc_mam_slo_alloc_all_org.ins_usr_id,
	mam_slo_alloc_mam_slo_alloc_all_org.ins_usr_nm,
	mam_slo_alloc_mam_slo_alloc_all_org.ins_ts,
	mam_slo_alloc_mam_slo_alloc_all_org.ins_func_id,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_cntr,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_usr_id,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_usr_nm,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_ts,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_func_id,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_srv_req_no
FROM 
	mam_slo_alloc_all mam_slo_alloc_mam_slo_alloc_all_org
WHERE 
	0 = 0
AND mam_slo_alloc_mam_slo_alloc_all_org.del_flg = '0' 
	AND mam_slo_alloc_mam_slo_alloc_all_org.co_cd = fcpa_context$f_get_co_cd() 
	AND mam_slo_alloc_mam_slo_alloc_all_org.wg_cd <> fcpa_const$get_const_val('MAC_STR','NULL_VAL')
UNION ALL
SELECT
	mam_slo_alloc_mam_slo_alloc_all_org.to_lg_grp_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.itm_ship_grp_cd,
	mam_slo_alloc_mam_wg_wg.wg_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.loc_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.lg_grp_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.alloc_grp_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.alloc_scope_typ,
	mam_slo_alloc_mam_slo_alloc_all_org.alloc_typ,
	mam_slo_alloc_mam_slo_alloc_all_org.ship_loc_cd,
	mam_slo_alloc_mam_slo_alloc_all_org.def_flg,
	mam_slo_alloc_mam_slo_alloc_all_org.memo1,
	mam_slo_alloc_mam_slo_alloc_all_org.memo2,
	mam_slo_alloc_mam_slo_alloc_all_org.memo3,
	mam_slo_alloc_mam_slo_alloc_all_org.del_flg,
	mam_slo_alloc_mam_slo_alloc_all_org.del_usr_id,
	mam_slo_alloc_mam_slo_alloc_all_org.del_usr_nm,
	mam_slo_alloc_mam_slo_alloc_all_org.del_ts,
	mam_slo_alloc_mam_slo_alloc_all_org.ins_usr_id,
	mam_slo_alloc_mam_slo_alloc_all_org.ins_usr_nm,
	mam_slo_alloc_mam_slo_alloc_all_org.ins_ts,
	mam_slo_alloc_mam_slo_alloc_all_org.ins_func_id,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_cntr,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_usr_id,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_usr_nm,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_ts,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_func_id,
	mam_slo_alloc_mam_slo_alloc_all_org.upd_srv_req_no
FROM 
	mam_wg mam_slo_alloc_mam_wg_wg,
	mam_slo_alloc_all mam_slo_alloc_mam_slo_alloc_all_org
WHERE 
	0 = 0
AND mam_slo_alloc_mam_slo_alloc_all_org.del_flg = '0' 
	AND mam_slo_alloc_mam_slo_alloc_all_org.co_cd = fcpa_context$f_get_co_cd() 
	AND mam_slo_alloc_mam_slo_alloc_all_org.wg_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL') 
	AND mam_slo_alloc_mam_wg_wg.sls_flg = '1' 
	AND NOT EXISTS (
		SELECT	'X'
		FROM	mam_slo_alloc_all mam_slo_alloc_mam_slo_alloc_all_x
		WHERE	0 = 0
		AND	mam_slo_alloc_mam_slo_alloc_all_x.co_cd = mam_slo_alloc_mam_slo_alloc_all_org.co_cd 
		AND	mam_slo_alloc_mam_slo_alloc_all_x.wg_cd = mam_slo_alloc_mam_wg_wg.wg_cd 
		AND	mam_slo_alloc_mam_slo_alloc_all_x.del_flg = '0'
		)
;
CREATE OR REPLACE VIEW mam_slo_alloc_$s (
	to_lg_grp_cd,
	itm_ship_grp_cd,
	wg_cd,
	loc_cd,
	lg_grp_cd,
	alloc_grp_cd,
	alloc_scope_typ,
	alloc_typ,
	ship_loc_cd,
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
	mam_slo_alloc_mam_slo_alloc_org.to_lg_grp_cd,
	mam_slo_alloc_mam_slo_alloc_org.itm_ship_grp_cd,
	mam_slo_alloc_mam_slo_alloc_org.wg_cd,
	mam_slo_alloc_mam_slo_alloc_org.loc_cd,
	mam_slo_alloc_mam_slo_alloc_org.lg_grp_cd,
	mam_slo_alloc_mam_slo_alloc_org.alloc_grp_cd,
	mam_slo_alloc_mam_slo_alloc_org.alloc_scope_typ,
	mam_slo_alloc_mam_slo_alloc_org.alloc_typ,
	mam_slo_alloc_mam_slo_alloc_org.ship_loc_cd,
	mam_slo_alloc_mam_slo_alloc_org.def_flg,
	mam_slo_alloc_mam_slo_alloc_org.memo1,
	mam_slo_alloc_mam_slo_alloc_org.memo2,
	mam_slo_alloc_mam_slo_alloc_org.memo3,
	mam_slo_alloc_mam_slo_alloc_org.del_flg,
	mam_slo_alloc_mam_slo_alloc_org.del_usr_id,
	mam_slo_alloc_mam_slo_alloc_org.del_usr_nm,
	mam_slo_alloc_mam_slo_alloc_org.del_ts,
	mam_slo_alloc_mam_slo_alloc_org.ins_usr_id,
	mam_slo_alloc_mam_slo_alloc_org.ins_usr_nm,
	mam_slo_alloc_mam_slo_alloc_org.ins_ts,
	mam_slo_alloc_mam_slo_alloc_org.ins_func_id,
	mam_slo_alloc_mam_slo_alloc_org.upd_cntr,
	mam_slo_alloc_mam_slo_alloc_org.upd_usr_id,
	mam_slo_alloc_mam_slo_alloc_org.upd_usr_nm,
	mam_slo_alloc_mam_slo_alloc_org.upd_ts,
	mam_slo_alloc_mam_slo_alloc_org.upd_func_id,
	mam_slo_alloc_mam_slo_alloc_org.upd_srv_req_no
FROM 
	mam_slo_alloc mam_slo_alloc_mam_slo_alloc_org
;


