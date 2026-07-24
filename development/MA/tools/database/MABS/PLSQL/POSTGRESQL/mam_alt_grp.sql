CREATE OR REPLACE VIEW mam_alt_grp (
	alt_grp_cd,
	wg_cd,
	alt_grp_nm,
	alt_itm_typ,
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
	mam_alt_grp_mam_alt_grp_all_org.alt_grp_cd,
	mam_alt_grp_mam_alt_grp_all_org.wg_cd,
	mam_alt_grp_mam_alt_grp_all_org.alt_grp_nm,
	mam_alt_grp_mam_alt_grp_all_org.alt_itm_typ,
	mam_alt_grp_mam_alt_grp_all_org.memo1,
	mam_alt_grp_mam_alt_grp_all_org.memo2,
	mam_alt_grp_mam_alt_grp_all_org.memo3,
	mam_alt_grp_mam_alt_grp_all_org.del_flg,
	mam_alt_grp_mam_alt_grp_all_org.del_usr_id,
	mam_alt_grp_mam_alt_grp_all_org.del_usr_nm,
	mam_alt_grp_mam_alt_grp_all_org.del_ts,
	mam_alt_grp_mam_alt_grp_all_org.ins_usr_id,
	mam_alt_grp_mam_alt_grp_all_org.ins_usr_nm,
	mam_alt_grp_mam_alt_grp_all_org.ins_ts,
	mam_alt_grp_mam_alt_grp_all_org.ins_func_id,
	mam_alt_grp_mam_alt_grp_all_org.upd_cntr,
	mam_alt_grp_mam_alt_grp_all_org.upd_usr_id,
	mam_alt_grp_mam_alt_grp_all_org.upd_usr_nm,
	mam_alt_grp_mam_alt_grp_all_org.upd_ts,
	mam_alt_grp_mam_alt_grp_all_org.upd_func_id,
	mam_alt_grp_mam_alt_grp_all_org.upd_srv_req_no
FROM mam_alt_grp_all mam_alt_grp_mam_alt_grp_all_org
WHERE 
	0 = 0
AND (mam_alt_grp_mam_alt_grp_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0')
	AND mam_alt_grp_mam_alt_grp_all_org.co_cd = fcpa_context$f_get_co_cd()
	AND mam_alt_grp_mam_alt_grp_all_org.wg_cd <> fcpa_const$get_const_val('MAC_STR','NULL_VAL')
UNION ALL
SELECT
	mam_alt_grp_mam_alt_grp_all_org.alt_grp_cd,
	mam_alt_grp_mam_wg_wg.wg_cd,
	mam_alt_grp_mam_alt_grp_all_org.alt_grp_nm,
	mam_alt_grp_mam_alt_grp_all_org.alt_itm_typ,
	mam_alt_grp_mam_alt_grp_all_org.memo1,
	mam_alt_grp_mam_alt_grp_all_org.memo2,
	mam_alt_grp_mam_alt_grp_all_org.memo3,
	mam_alt_grp_mam_alt_grp_all_org.del_flg,
	mam_alt_grp_mam_alt_grp_all_org.del_usr_id,
	mam_alt_grp_mam_alt_grp_all_org.del_usr_nm,
	mam_alt_grp_mam_alt_grp_all_org.del_ts,
	mam_alt_grp_mam_alt_grp_all_org.ins_usr_id,
	mam_alt_grp_mam_alt_grp_all_org.ins_usr_nm,
	mam_alt_grp_mam_alt_grp_all_org.ins_ts,
	mam_alt_grp_mam_alt_grp_all_org.ins_func_id,
	mam_alt_grp_mam_alt_grp_all_org.upd_cntr,
	mam_alt_grp_mam_alt_grp_all_org.upd_usr_id,
	mam_alt_grp_mam_alt_grp_all_org.upd_usr_nm,
	mam_alt_grp_mam_alt_grp_all_org.upd_ts,
	mam_alt_grp_mam_alt_grp_all_org.upd_func_id,
	mam_alt_grp_mam_alt_grp_all_org.upd_srv_req_no
FROM mam_wg mam_alt_grp_mam_wg_wg,
	mam_alt_grp_all mam_alt_grp_mam_alt_grp_all_org
WHERE 
	0 = 0
AND (mam_alt_grp_mam_alt_grp_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0')
	AND mam_alt_grp_mam_alt_grp_all_org.co_cd = fcpa_context$f_get_co_cd()
	AND mam_alt_grp_mam_alt_grp_all_org.wg_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL')
	AND (mam_alt_grp_mam_wg_wg.lg_flg = '1' OR mam_alt_grp_mam_wg_wg.mfg_flg = '1')
	AND NOT EXISTS (
		SELECT	'X'
		FROM mam_alt_grp_all mam_alt_grp_mam_alt_grp_all_x
		WHERE 0 = 0
		AND mam_alt_grp_mam_alt_grp_all_x.co_cd = mam_alt_grp_mam_alt_grp_all_org.co_cd
		AND mam_alt_grp_mam_alt_grp_all_x.alt_grp_cd = mam_alt_grp_mam_alt_grp_all_org.alt_grp_cd
		AND mam_alt_grp_mam_alt_grp_all_x.wg_cd = mam_alt_grp_mam_wg_wg.wg_cd
		AND (mam_alt_grp_mam_alt_grp_all_x.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0')
		)
;
CREATE OR REPLACE VIEW mam_alt_grp_$s (
	alt_grp_cd,
	wg_cd,
	alt_grp_nm,
	alt_itm_typ,
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
	mam_alt_grp_mam_alt_grp_org.alt_grp_cd,
	mam_alt_grp_mam_alt_grp_org.wg_cd,
	mam_alt_grp_mam_alt_grp_org.alt_grp_nm,
	mam_alt_grp_mam_alt_grp_org.alt_itm_typ,
	mam_alt_grp_mam_alt_grp_org.memo1,
	mam_alt_grp_mam_alt_grp_org.memo2,
	mam_alt_grp_mam_alt_grp_org.memo3,
	mam_alt_grp_mam_alt_grp_org.del_flg,
	mam_alt_grp_mam_alt_grp_org.del_usr_id,
	mam_alt_grp_mam_alt_grp_org.del_usr_nm,
	mam_alt_grp_mam_alt_grp_org.del_ts,
	mam_alt_grp_mam_alt_grp_org.ins_usr_id,
	mam_alt_grp_mam_alt_grp_org.ins_usr_nm,
	mam_alt_grp_mam_alt_grp_org.ins_ts,
	mam_alt_grp_mam_alt_grp_org.ins_func_id,
	mam_alt_grp_mam_alt_grp_org.upd_cntr,
	mam_alt_grp_mam_alt_grp_org.upd_usr_id,
	mam_alt_grp_mam_alt_grp_org.upd_usr_nm,
	mam_alt_grp_mam_alt_grp_org.upd_ts,
	mam_alt_grp_mam_alt_grp_org.upd_func_id,
	mam_alt_grp_mam_alt_grp_org.upd_srv_req_no
FROM 
	mam_alt_grp mam_alt_grp_mam_alt_grp_org
;
