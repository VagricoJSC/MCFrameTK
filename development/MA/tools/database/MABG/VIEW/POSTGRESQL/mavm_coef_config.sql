SELECT
	mavm_coef_config_mam_coef_config_m1.alc_coef_cd,
	mavm_coef_config_mam_coef_config_m1.itm_cd,
	mavm_coef_config_mam_coef_config_m1.itm_sub1,
	mavm_coef_config_mam_coef_config_m1.itm_sub2,
	mavm_coef_config_mam_coef_config_m1.itm_sub3,
	mavm_coef_config_mam_coef_config_m1.lot_no,
	mavm_coef_config_mam_coef_config_m1.sublot_no,
	mavm_coef_config_mam_coef_config_m1.sno1,
	mavm_coef_config_mam_coef_config_m1.sno2,
	mavm_coef_config_mam_coef_config_m1.sno3,
	mavm_coef_config_mam_coef_config_m1.sno4,
	mavm_coef_config_mam_coef_config_m1.loc_cd,
	mavm_coef_config_mam_coef_config_m1.oper_cd,
	mavm_coef_config_mam_coef_config_m1.bp_cd,
	mavm_coef_config_mam_coef_config_m1.term,
	mavm_coef_config_mam_coef_config_m1.coef_val,
	mavm_coef_config_mam_coef_config_m1.memo1,
	mavm_coef_config_mam_coef_config_m1.memo2,
	mavm_coef_config_mam_coef_config_m1.memo3,
	mavm_coef_config_mam_coef_config_m1.del_flg,
	mavm_coef_config_mam_coef_config_m1.del_usr_id,
	mavm_coef_config_mam_coef_config_m1.del_usr_nm,
	mavm_coef_config_mam_coef_config_m1.del_ts,
	mavm_coef_config_mam_coef_config_m1.ins_usr_id,
	mavm_coef_config_mam_coef_config_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_config_m1.ins_ts,
	mavm_coef_config_mam_coef_config_m1.ins_func_id,
	mavm_coef_config_mam_coef_config_m1.upd_cntr,
	mavm_coef_config_mam_coef_config_m1.upd_usr_id,
	mavm_coef_config_mam_coef_config_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_config_m1.upd_ts,
	mavm_coef_config_mam_coef_config_m1.upd_func_id,
	mavm_coef_config_mam_coef_config_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_config mavm_coef_config_mam_coef_config_m1
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','CONFIG')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_config_m1.alc_coef_cd
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_JNL')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_jnl_cd = mavm_coef_config_mam_itm__m2.itm_jnl_cd
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP10')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd10
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP1')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd1
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP2')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd2
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP3')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd3
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP4')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd4
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP5')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd5
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP6')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd6
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP7')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd7
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP8')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd8
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','ITM_GRP9')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9')
AND	mavm_coef_config_mam_coef_auto_m1.itm_grp_cd = mavm_coef_config_mam_itm__m2.itm_grp_cd9
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ IS NULL AND mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
UNION ALL
SELECT
	mavm_coef_config_mam_coef_auto_m1.alc_coef_cd,
	mavm_coef_config_mam_itm__m2.itm_cd,
	mavm_coef_config_mam_itm__m2.itm_sub1,
	mavm_coef_config_mam_itm__m2.itm_sub2,
	mavm_coef_config_mam_itm__m2.itm_sub3,
	mavm_coef_config_mam_coef_auto_m1.lot_no,
	mavm_coef_config_mam_coef_auto_m1.sublot_no,
	mavm_coef_config_mam_coef_auto_m1.sno1,
	mavm_coef_config_mam_coef_auto_m1.sno2,
	mavm_coef_config_mam_coef_auto_m1.sno3,
	mavm_coef_config_mam_coef_auto_m1.sno4,
	mavm_coef_config_mam_coef_auto_m1.loc_cd,
	mavm_coef_config_mam_coef_auto_m1.oper_cd,
	mavm_coef_config_mam_coef_auto_m1.bp_cd,
	mavm_coef_config_mam_coef_auto_m1.term,
	mavm_coef_config_mam_coef_auto_m1.coef_val *
		COALESCE(
			CASE mavm_coef_config_mam_alc_coef_x.qty_unit_typ
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') THEN mavm_coef_config_mam_itm__m2.dim
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') THEN mavm_coef_config_mam_itm__m2.wt
				WHEN fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') THEN mavm_coef_config_mam_itm__m2.conts_qty
				ELSE 1
			END, 1) AS coef_val,
	mavm_coef_config_mam_coef_auto_m1.memo1,
	mavm_coef_config_mam_coef_auto_m1.memo2,
	mavm_coef_config_mam_coef_auto_m1.memo3,
	CASE mavm_coef_config_mam_coef_auto_m1.del_flg WHEN '1' THEN '1' ELSE mavm_coef_config_mam_itm__m2.del_flg END AS del_flg,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_id, mavm_coef_config_mam_itm__m2.del_usr_id) AS del_usr_id,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_usr_nm, mavm_coef_config_mam_itm__m2.del_usr_nm) AS del_usr_nm,
	COALESCE(mavm_coef_config_mam_coef_auto_m1.del_ts, mavm_coef_config_mam_itm__m2.del_ts) AS del_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_id,
	mavm_coef_config_mam_coef_auto_m1.ins_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.ins_ts,
	mavm_coef_config_mam_coef_auto_m1.ins_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_cntr,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_id,
	mavm_coef_config_mam_coef_auto_m1.upd_usr_nm,
	mavm_coef_config_mam_coef_auto_m1.upd_ts,
	mavm_coef_config_mam_coef_auto_m1.upd_func_id,
	mavm_coef_config_mam_coef_auto_m1.upd_srv_req_no
FROM	mam_alc_coef mavm_coef_config_mam_alc_coef_x, mam_coef_auto mavm_coef_config_mam_coef_auto_m1, mam_itm_ mavm_coef_config_mam_itm__m2
WHERE	0=0
AND	mavm_coef_config_mam_alc_coef_x.coef_config_typ = fcpa_const$get_const_val('MAC_COEF_CONFIG_TYP','NON')
AND	mavm_coef_config_mam_alc_coef_x.alc_coef_cd = mavm_coef_config_mam_coef_auto_m1.alc_coef_cd
AND	(
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','DIM') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.dim_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.dim_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','WT') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.wt_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.wt_unit_cd IS NULL)
	OR
	mavm_coef_config_mam_alc_coef_x.qty_unit_typ = fcpa_const$get_const_val('MAC_QTY_UNIT_TYP','CONTS') AND (mavm_coef_config_mam_coef_auto_m1.unit_cd = mavm_coef_config_mam_itm__m2.conts_unit_cd OR mavm_coef_config_mam_coef_auto_m1.unit_cd IS NULL AND mavm_coef_config_mam_itm__m2.conts_unit_cd IS NULL)
	)
;
