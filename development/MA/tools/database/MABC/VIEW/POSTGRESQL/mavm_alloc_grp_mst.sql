SELECT
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.alloc_grp_cd,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.alloc_grp_nm,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.memo1,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.memo2,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.memo3,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.del_flg,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.del_usr_id,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.del_usr_nm,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.del_ts,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.ins_usr_id,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.ins_usr_nm,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.ins_ts,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.ins_func_id,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.upd_cntr,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.upd_usr_id,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.upd_usr_nm,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.upd_ts,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.upd_func_id,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.upd_srv_req_no,
	mavm_alloc_grp_mst_mam_alloc_grp_all_t1.co_cd,
	--総量引当場所グループ名（ロケール１）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_nm
		FROM mam_alloc_grp_lcl_all mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.co_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.co_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.lcl_cd = 'ja_JP'
	)	alloc_grp_nm_lcl1,
	--総量引当場所グループ名（ロケール２）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_nm
		FROM mam_alloc_grp_lcl_all mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.co_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.co_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.lcl_cd = 'en_US'
	)	alloc_grp_nm_lcl2,
	--総量引当場所グループ名（ロケール３）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_nm
		FROM mam_alloc_grp_lcl_all mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.co_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.CO_CD
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.lcl_cd = 'TBD3'
	)	alloc_grp_nm_lcl3,
	--総量引当場所グループ名（ロケール４）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_nm
		FROM mam_alloc_grp_lcl_all mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.co_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.co_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.lcl_cd = 'TBD4'
	)	alloc_grp_nm_lcl4,
	--総量引当場所グループ名（ロケール５）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_NM
		FROM mam_alloc_grp_lcl_all mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.co_cd = mavm_alloc_grp_mst_mam_alloc_grp_all_t1.co_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_all_t.lcl_cd = 'TBD5'
	)	alloc_grp_nm_lcl5
	FROM mam_alloc_grp_all mavm_alloc_grp_mst_mam_alloc_grp_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_alloc_grp_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_alloc_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
			AND	mavm_alloc_grp_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_alloc_grp_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_alloc_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
			)
		)
	)
UNION ALL
SELECT
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.alloc_grp_cd,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.alloc_grp_nm,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.memo1,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.memo2,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.memo3,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.del_flg,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.del_usr_id,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.del_usr_nm,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.del_ts,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.ins_usr_id,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.ins_usr_nm,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.ins_ts,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.ins_func_id,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.upd_cntr,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.upd_usr_id,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.upd_usr_nm,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.upd_ts,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.upd_func_id,
	mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.upd_srv_req_no,
	fcpa_const$get_const_val('MAC_STR','NULL_VAL') co_cd,
	--総量引当場所グループ名（ロケール１）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_nm
		FROM mam_alloc_grp_lcl_cmn mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	alloc_grp_nm_lcl1,
	--総量引当場所グループ名（ロケール２）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_nm
		FROM mam_alloc_grp_lcl_cmn mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.lcl_cd = 'en_US'
	)	alloc_grp_nm_lcl2,
	--総量引当場所グループ名（ロケール３）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_nm
		FROM mam_alloc_grp_lcl_cmn mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.lcl_cd = 'TBD3'
	)	alloc_grp_nm_lcl3,
	--総量引当場所グループ名（ロケール４）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_NM
		FROM mam_alloc_grp_lcl_cmn mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.lcl_cd = 'TBD4'
	)	alloc_grp_nm_lcl4,
	--総量引当場所グループ名（ロケール５）
	(SELECT mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_nm
		FROM mam_alloc_grp_lcl_cmn mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.alloc_grp_cd = mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1.alloc_grp_cd
		AND mavm_alloc_grp_mst_mam_alloc_grp_lcl_cmn_t.lcl_cd = 'TBD5'
	)	alloc_grp_nm_lcl5
	FROM mam_alloc_grp_cmn mavm_alloc_grp_mst_mam_alloc_grp_cmn_t1
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_alloc_grp_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_alloc_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
		AND	mavm_alloc_grp_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
