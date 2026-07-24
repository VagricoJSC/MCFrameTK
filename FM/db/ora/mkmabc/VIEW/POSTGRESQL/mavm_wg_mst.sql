SELECT
	mavm_wg_mst_mam_wg_all_t1.wg_cd,
	mavm_wg_mst_mam_wg_all_t1.wg_nm,
	mavm_wg_mst_mam_wg_all_t1.sls_flg,
	mavm_wg_mst_mam_wg_all_t1.lg_flg,
	mavm_wg_mst_mam_wg_all_t1.mfg_flg,
	mavm_wg_mst_mam_wg_all_t1.purc_flg,
	mavm_wg_mst_mam_wg_all_t1.ar_flg,
	mavm_wg_mst_mam_wg_all_t1.ap_flg,
	mavm_wg_mst_mam_wg_all_t1.sd_flg,
	mavm_wg_mst_mam_wg_all_t1.mrp_prefix,
	mavm_wg_mst_mam_wg_all_t1.mfg_inst_unit_typ,
	mavm_wg_mst_mam_wg_all_t1.mrp_proc_typ,
	mavm_wg_mst_mam_wg_all_t1.alloc_margin_days,
	mavm_wg_mst_mam_wg_all_t1.not_xfr_flg,
	mavm_wg_mst_mam_wg_all_t1.mrp_alloc_margin_days,
	mavm_wg_mst_mam_wg_all_t1.mrp_opn_xfr_days,
	mavm_wg_mst_mam_wg_all_t1.rqmt_typ,
	mavm_wg_mst_mam_wg_all_t1.prod_pln_typ,
	mavm_wg_mst_mam_wg_all_t1.dmnd_date_div_mons,
	mavm_wg_mst_mam_wg_all_t1.plm_flg,
	mavm_wg_mst_mam_wg_all_t1.calc_seq,
	mavm_wg_mst_mam_wg_all_t1.cmn_upri_flg,
	mavm_wg_mst_mam_wg_all_t1.memo1,
	mavm_wg_mst_mam_wg_all_t1.memo2,
	mavm_wg_mst_mam_wg_all_t1.memo3,
	mavm_wg_mst_mam_wg_all_t1.del_flg,
	mavm_wg_mst_mam_wg_all_t1.del_usr_id,
	mavm_wg_mst_mam_wg_all_t1.del_usr_nm,
	mavm_wg_mst_mam_wg_all_t1.del_ts,
	mavm_wg_mst_mam_wg_all_t1.ins_usr_id,
	mavm_wg_mst_mam_wg_all_t1.ins_usr_nm,
	mavm_wg_mst_mam_wg_all_t1.ins_ts,
	mavm_wg_mst_mam_wg_all_t1.ins_func_id,
	mavm_wg_mst_mam_wg_all_t1.upd_cntr,
	mavm_wg_mst_mam_wg_all_t1.upd_usr_id,
	mavm_wg_mst_mam_wg_all_t1.upd_usr_nm,
	mavm_wg_mst_mam_wg_all_t1.upd_ts,
	mavm_wg_mst_mam_wg_all_t1.upd_func_id,
	mavm_wg_mst_mam_wg_all_t1.upd_srv_req_no,
	mavm_wg_mst_mam_wg_all_t1.co_cd,
	--ワーキンググループ名（ロケール１）
	(SELECT mavm_wg_mst_mam_wg_lcl_all_t.wg_nm
		FROM mam_wg_lcl_all mavm_wg_mst_mam_wg_lcl_all_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_all_t.wg_cd = mavm_wg_mst_mam_wg_all_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.co_cd = mavm_wg_mst_mam_wg_all_t1.co_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.lcl_cd = 'ja_JP'
	)	wg_nm_lcl1,
	--ワーキンググループ名（ロケール２）
	(SELECT mavm_wg_mst_mam_wg_lcl_all_t.wg_nm
		FROM mam_wg_lcl_all mavm_wg_mst_mam_wg_lcl_all_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_all_t.wg_cd = mavm_wg_mst_mam_wg_all_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.co_cd = mavm_wg_mst_mam_wg_all_t1.co_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.lcl_cd = 'en_US'
	)	wg_nm_lcl2,
	--ワーキンググループ名（ロケール３）
	(SELECT mavm_wg_mst_mam_wg_lcl_all_t.wg_nm
		FROM mam_wg_lcl_all mavm_wg_mst_mam_wg_lcl_all_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_all_t.wg_cd = mavm_wg_mst_mam_wg_all_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.co_cd = mavm_wg_mst_mam_wg_all_t1.co_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.lcl_cd = 'TBD3'
	)	wg_nm_lcl3,
	--ワーキンググループ名（ロケール４）
	(SELECT mavm_wg_mst_mam_wg_lcl_all_t.wg_nm
		FROM mam_wg_lcl_all mavm_wg_mst_mam_wg_lcl_all_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_all_t.wg_cd = mavm_wg_mst_mam_wg_all_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.co_cd = mavm_wg_mst_mam_wg_all_t1.co_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.lcl_cd = 'TBD4'
	)	wg_nm_lcl4,
	--ワーキンググループ名（ロケール５）
	(SELECT mavm_wg_mst_mam_wg_lcl_all_t.wg_nm
		FROM mam_wg_lcl_all mavm_wg_mst_mam_wg_lcl_all_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_all_t.wg_cd = mavm_wg_mst_mam_wg_all_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.co_cd = mavm_wg_mst_mam_wg_all_t1.co_cd
		AND mavm_wg_mst_mam_wg_lcl_all_t.lcl_cd = 'TBD5'
	)	wg_nm_lcl5
	FROM mam_wg_all mavm_wg_mst_mam_wg_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_wg_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_wg_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_WG')
			AND	mavm_wg_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_wg_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_wg_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_WG')
			)
		)
	)
UNION ALL
SELECT
	mavm_wg_mst_mam_wg_cmn_t1.wg_cd,
	mavm_wg_mst_mam_wg_cmn_t1.wg_nm,
	mavm_wg_mst_mam_wg_cmn_t1.sls_flg,
	mavm_wg_mst_mam_wg_cmn_t1.lg_flg,
	mavm_wg_mst_mam_wg_cmn_t1.mfg_flg,
	mavm_wg_mst_mam_wg_cmn_t1.purc_flg,
	mavm_wg_mst_mam_wg_cmn_t1.ar_flg,
	mavm_wg_mst_mam_wg_cmn_t1.ap_flg,
	mavm_wg_mst_mam_wg_cmn_t1.sd_flg,
	mavm_wg_mst_mam_wg_cmn_t1.mrp_prefix,
	mavm_wg_mst_mam_wg_cmn_t1.mfg_inst_unit_typ,
	mavm_wg_mst_mam_wg_cmn_t1.mrp_proc_typ,
	mavm_wg_mst_mam_wg_cmn_t1.alloc_margin_days,
	mavm_wg_mst_mam_wg_cmn_t1.not_xfr_flg,
	mavm_wg_mst_mam_wg_cmn_t1.mrp_alloc_margin_days,
	mavm_wg_mst_mam_wg_cmn_t1.mrp_opn_xfr_days,
	mavm_wg_mst_mam_wg_cmn_t1.rqmt_typ,
	mavm_wg_mst_mam_wg_cmn_t1.prod_pln_typ,
	mavm_wg_mst_mam_wg_cmn_t1.dmnd_date_div_mons,
	mavm_wg_mst_mam_wg_cmn_t1.plm_flg,
	mavm_wg_mst_mam_wg_cmn_t1.calc_seq,
	mavm_wg_mst_mam_wg_cmn_t1.cmn_upri_flg,
	mavm_wg_mst_mam_wg_cmn_t1.memo1,
	mavm_wg_mst_mam_wg_cmn_t1.memo2,
	mavm_wg_mst_mam_wg_cmn_t1.memo3,
	mavm_wg_mst_mam_wg_cmn_t1.del_flg,
	mavm_wg_mst_mam_wg_cmn_t1.del_usr_id,
	mavm_wg_mst_mam_wg_cmn_t1.del_usr_nm,
	mavm_wg_mst_mam_wg_cmn_t1.del_ts,
	mavm_wg_mst_mam_wg_cmn_t1.ins_usr_id,
	mavm_wg_mst_mam_wg_cmn_t1.ins_usr_nm,
	mavm_wg_mst_mam_wg_cmn_t1.ins_ts,
	mavm_wg_mst_mam_wg_cmn_t1.ins_func_id,
	mavm_wg_mst_mam_wg_cmn_t1.upd_cntr,
	mavm_wg_mst_mam_wg_cmn_t1.upd_usr_id,
	mavm_wg_mst_mam_wg_cmn_t1.upd_usr_nm,
	mavm_wg_mst_mam_wg_cmn_t1.upd_ts,
	mavm_wg_mst_mam_wg_cmn_t1.upd_func_id,
	mavm_wg_mst_mam_wg_cmn_t1.upd_srv_req_no,
	mavm_wg_mst_mam_co_all_t2.co_cd,
	--ワーキンググループ名（ロケール１）
	(SELECT mavm_wg_mst_mam_wg_lcl_cmn_t.wg_nm
		FROM mam_wg_lcl_cmn mavm_wg_mst_mam_wg_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.wg_cd = mavm_wg_mst_mam_wg_cmn_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	wg_nm_lcl1,
	--ワーキンググループ名（ロケール２）
	(SELECT mavm_wg_mst_mam_wg_lcl_cmn_t.wg_nm
		FROM mam_wg_lcl_cmn mavm_wg_mst_mam_wg_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.wg_cd = mavm_wg_mst_mam_wg_cmn_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.lcl_cd = 'en_US'
	)	wg_nm_lcl2,
	--ワーキンググループ名（ロケール３）
	(SELECT mavm_wg_mst_mam_wg_lcl_cmn_t.wg_nm
		FROM mam_wg_lcl_cmn mavm_wg_mst_mam_wg_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.wg_cd = mavm_wg_mst_mam_wg_cmn_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.lcl_cd = 'TBD3'
	)	wg_nm_lcl3,
	--ワーキンググループ名（ロケール４）
	(SELECT mavm_wg_mst_mam_wg_lcl_cmn_t.wg_nm
		FROM mam_wg_lcl_cmn mavm_wg_mst_mam_wg_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.wg_cd = mavm_wg_mst_mam_wg_cmn_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.lcl_cd = 'TBD4'
	)	wg_nm_lcl4,
	--ワーキンググループ名（ロケール５）
	(SELECT mavm_wg_mst_mam_wg_lcl_cmn_t.wg_nm
		FROM mam_wg_lcl_cmn mavm_wg_mst_mam_wg_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.wg_cd = mavm_wg_mst_mam_wg_cmn_t1.wg_cd
		AND mavm_wg_mst_mam_wg_lcl_cmn_t.lcl_cd = 'TBD5'
	)	wg_nm_lcl5
	FROM mam_wg_cmn mavm_wg_mst_mam_wg_cmn_t1, mam_co_all mavm_wg_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_wg_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_wg_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_WG')
		AND	mavm_wg_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
