SELECT
	mavm_rsrc_mst_mam_rsrc_all_t1.rsrc_cd,
	mavm_rsrc_mst_mam_rsrc_all_t1.rsrc_nm,
	mavm_rsrc_mst_mam_rsrc_all_t1.rsrc_unit_nm,
	mavm_rsrc_mst_mam_rsrc_all_t1.dec_place,
	mavm_rsrc_mst_mam_rsrc_all_t1.rnd_typ,
	mavm_rsrc_mst_mam_rsrc_all_t1.memo1,
	mavm_rsrc_mst_mam_rsrc_all_t1.memo2,
	mavm_rsrc_mst_mam_rsrc_all_t1.memo3,
	mavm_rsrc_mst_mam_rsrc_all_t1.del_flg,
	mavm_rsrc_mst_mam_rsrc_all_t1.del_usr_id,
	mavm_rsrc_mst_mam_rsrc_all_t1.del_usr_nm,
	mavm_rsrc_mst_mam_rsrc_all_t1.del_ts,
	mavm_rsrc_mst_mam_rsrc_all_t1.ins_usr_id,
	mavm_rsrc_mst_mam_rsrc_all_t1.ins_usr_nm,
	mavm_rsrc_mst_mam_rsrc_all_t1.ins_ts,
	mavm_rsrc_mst_mam_rsrc_all_t1.ins_func_id,
	mavm_rsrc_mst_mam_rsrc_all_t1.upd_cntr,
	mavm_rsrc_mst_mam_rsrc_all_t1.upd_usr_id,
	mavm_rsrc_mst_mam_rsrc_all_t1.upd_usr_nm,
	mavm_rsrc_mst_mam_rsrc_all_t1.upd_ts,
	mavm_rsrc_mst_mam_rsrc_all_t1.upd_func_id,
	mavm_rsrc_mst_mam_rsrc_all_t1.upd_srv_req_no,
	mavm_rsrc_mst_mam_rsrc_all_t1.co_cd,
	--資源名（ロケール１）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_nm
		FROM mam_rsrc_lcl_all mavm_rsrc_mst_mam_rsrc_lcl_all_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_all_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.co_cd = mavm_rsrc_mst_mam_rsrc_all_t1.co_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.lcl_cd = 'ja_JP'
	)	rsrc_nm_lcl1,
	--資源名（ロケール２）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_nm
		FROM mam_rsrc_lcl_all mavm_rsrc_mst_mam_rsrc_lcl_all_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_all_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.co_cd = mavm_rsrc_mst_mam_rsrc_all_t1.co_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.lcl_cd = 'en_US'
	)	rsrc_nm_lcl2,
	--資源名（ロケール３）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_nm
		FROM mam_rsrc_lcl_all mavm_rsrc_mst_mam_rsrc_lcl_all_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_all_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.co_cd = mavm_rsrc_mst_mam_rsrc_all_t1.co_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.lcl_cd = 'TBD3'
	)	rsrc_nm_lcl3,
	--資源名（ロケール４）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_nm
		FROM mam_rsrc_lcl_all mavm_rsrc_mst_mam_rsrc_lcl_all_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_all_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.co_cd = mavm_rsrc_mst_mam_rsrc_all_t1.co_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.lcl_cd = 'TBD4'
	)	rsrc_nm_lcl4,
	--資源名（ロケール５）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_nm
		FROM mam_rsrc_lcl_all mavm_rsrc_mst_mam_rsrc_lcl_all_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_all_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.co_cd = mavm_rsrc_mst_mam_rsrc_all_t1.co_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_all_t.lcl_cd = 'TBD5'
	)	rsrc_nm_lcl5
	FROM mam_rsrc_all mavm_rsrc_mst_mam_rsrc_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_rsrc_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_rsrc_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
			AND	mavm_rsrc_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_rsrc_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_rsrc_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
			)
		)
	)
UNION ALL
SELECT
	mavm_rsrc_mst_mam_rsrc_cmn_t1.rsrc_cd,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.rsrc_nm,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.rsrc_unit_nm,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.dec_place,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.rnd_typ,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.memo1,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.memo2,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.memo3,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.del_flg,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.del_usr_id,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.del_usr_nm,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.del_ts,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.ins_usr_id,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.ins_usr_nm,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.ins_ts,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.ins_func_id,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.upd_cntr,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.upd_usr_id,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.upd_usr_nm,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.upd_ts,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.upd_func_id,
	mavm_rsrc_mst_mam_rsrc_cmn_t1.upd_srv_req_no,
	fcpa_const$get_const_val('MAC_STR','NULL_VAL') co_cd,
	--資源名（ロケール１）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_nm
		FROM mam_rsrc_lcl_cmn mavm_rsrc_mst_mam_rsrc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_cmn_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	rsrc_nm_lcl1,
	--資源名（ロケール２）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_nm
		FROM mam_rsrc_lcl_cmn mavm_rsrc_mst_mam_rsrc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_cmn_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.lcl_cd = 'en_US'
	)	rsrc_nm_lcl2,
	--資源名（ロケール３）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_nm
		FROM mam_rsrc_lcl_cmn mavm_rsrc_mst_mam_rsrc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_cmn_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.lcl_cd = 'TBD3'
	)	rsrc_nm_lcl3,
	--資源名（ロケール４）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_nm
		FROM mam_rsrc_lcl_cmn mavm_rsrc_mst_mam_rsrc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_cmn_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.lcl_cd = 'TBD4'
	)	rsrc_nm_lcl4,
	--資源名（ロケール５）
	(SELECT mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_nm
		FROM mam_rsrc_lcl_cmn mavm_rsrc_mst_mam_rsrc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.rsrc_cd = mavm_rsrc_mst_mam_rsrc_cmn_t1.rsrc_cd
		AND mavm_rsrc_mst_mam_rsrc_lcl_cmn_t.lcl_cd = 'TBD5'
	)	rsrc_nm_lcl5
	FROM mam_rsrc_cmn mavm_rsrc_mst_mam_rsrc_cmn_t1
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_rsrc_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_rsrc_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
		AND	mavm_rsrc_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
