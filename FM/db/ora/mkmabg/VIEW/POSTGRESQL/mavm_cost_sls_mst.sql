SELECT
	mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_typ,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_cd,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_nm,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.memo1,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.memo2,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.memo3,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.del_flg,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.del_usr_id,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.del_usr_nm,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.del_ts,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.ins_usr_id,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.ins_usr_nm,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.ins_ts,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.ins_func_id,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.upd_cntr,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.upd_usr_id,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.upd_usr_nm,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.upd_ts,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.upd_func_id,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.upd_srv_req_no,
	mavm_cost_sls_mst_mam_cost_sls_all_t1.co_cd,
	--売上分類名（ロケール１）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_nm
		FROM mam_cost_sls_lcl_all mavm_cost_sls_mst_mam_cost_sls_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.co_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.co_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.lcl_cd = 'ja_JP'
	)	cost_sls_nm_lcl1,
	--売上分類名（ロケール２）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_nm
		FROM mam_cost_sls_lcl_all mavm_cost_sls_mst_mam_cost_sls_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.co_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.co_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.lcl_cd = 'en_US'
	)	cost_sls_nm_lcl2,
	--売上分類名（ロケール３）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_nm
		FROM mam_cost_sls_lcl_all mavm_cost_sls_mst_mam_cost_sls_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.co_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.co_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.lcl_cd = 'TBD3'
	)	cost_sls_nm_lcl3,
	--売上分類名（ロケール４）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_nm
		FROM mam_cost_sls_lcl_all mavm_cost_sls_mst_mam_cost_sls_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.co_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.co_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.lcl_cd = 'TBD4'
	)	cost_sls_nm_lcl4,
	--売上分類名（ロケール５）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_nm
		FROM mam_cost_sls_lcl_all mavm_cost_sls_mst_mam_cost_sls_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.co_cd = mavm_cost_sls_mst_mam_cost_sls_all_t1.co_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_all_t.lcl_cd = 'TBD5'
	)	cost_sls_nm_lcl5
	FROM mam_cost_sls_all mavm_cost_sls_mst_mam_cost_sls_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_cost_sls_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_cost_sls_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_COST_SLS')
			AND	mavm_cost_sls_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_cost_sls_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_cost_sls_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_COST_SLS')
			)
		)
	)
UNION ALL
SELECT
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_typ,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_cd,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_nm,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.memo1,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.memo2,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.memo3,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.del_flg,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.del_usr_id,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.del_usr_nm,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.del_ts,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.ins_usr_id,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.ins_usr_nm,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.ins_ts,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.ins_func_id,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.upd_cntr,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.upd_usr_id,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.upd_usr_nm,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.upd_ts,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.upd_func_id,
	mavm_cost_sls_mst_mam_cost_sls_cmn_t1.upd_srv_req_no,
	mavm_cost_sls_mst_mam_co_all_t2.co_cd,
	--売上分類名（ロケール１）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_nm
		FROM mam_cost_sls_lcl_cmn mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	cost_sls_nm_lcl1,
	--売上分類名（ロケール２）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_nm
		FROM mam_cost_sls_lcl_cmn mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.lcl_cd = 'en_US'
	)	cost_sls_nm_lcl2,
	--売上分類名（ロケール３）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_nm
		FROM mam_cost_sls_lcl_cmn mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.lcl_cd = 'TBD3'
	)	cost_sls_nm_lcl3,
	--売上分類名（ロケール４）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_nm
		FROM mam_cost_sls_lcl_cmn mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.lcl_cd = 'TBD4'
	)	cost_sls_nm_lcl4,
	--売上分類名（ロケール５）
	(SELECT mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_nm
		FROM mam_cost_sls_lcl_cmn mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_typ = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_typ
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.cost_sls_cd = mavm_cost_sls_mst_mam_cost_sls_cmn_t1.cost_sls_cd
		AND mavm_cost_sls_mst_mam_cost_sls_lcl_cmn_t.lcl_cd = 'TBD5'
	)	cost_sls_nm_lcl5
	FROM mam_cost_sls_cmn mavm_cost_sls_mst_mam_cost_sls_cmn_t1, mam_co_all mavm_cost_sls_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_cost_sls_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_cost_sls_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_COST_SLS')
		AND	mavm_cost_sls_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
