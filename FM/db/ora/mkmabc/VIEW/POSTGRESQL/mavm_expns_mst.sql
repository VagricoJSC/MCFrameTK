SELECT
	mavm_expns_mst_mam_expns_all_t1.expns_cd,
	mavm_expns_mst_mam_expns_all_t1.expns_nm,
	mavm_expns_mst_mam_expns_all_t1.expns_grp_cd,
	mavm_expns_mst_mam_expns_all_t1.expns_typ,
	mavm_expns_mst_mam_expns_all_t1.direct_typ,
	mavm_expns_mst_mam_expns_all_t1.var_typ,
	mavm_expns_mst_mam_expns_all_t1.expns_seq,
	mavm_expns_mst_mam_expns_all_t1.memo1,
	mavm_expns_mst_mam_expns_all_t1.memo2,
	mavm_expns_mst_mam_expns_all_t1.memo3,
	mavm_expns_mst_mam_expns_all_t1.del_flg,
	mavm_expns_mst_mam_expns_all_t1.del_usr_id,
	mavm_expns_mst_mam_expns_all_t1.del_usr_nm,
	mavm_expns_mst_mam_expns_all_t1.del_ts,
	mavm_expns_mst_mam_expns_all_t1.ins_usr_id,
	mavm_expns_mst_mam_expns_all_t1.ins_usr_nm,
	mavm_expns_mst_mam_expns_all_t1.ins_ts,
	mavm_expns_mst_mam_expns_all_t1.ins_func_id,
	mavm_expns_mst_mam_expns_all_t1.upd_cntr,
	mavm_expns_mst_mam_expns_all_t1.upd_usr_id,
	mavm_expns_mst_mam_expns_all_t1.upd_usr_nm,
	mavm_expns_mst_mam_expns_all_t1.upd_ts,
	mavm_expns_mst_mam_expns_all_t1.upd_func_id,
	mavm_expns_mst_mam_expns_all_t1.upd_srv_req_no,
	mavm_expns_mst_mam_expns_all_t1.co_cd,
	--費目名（ロケール１）
	(SELECT mavm_expns_mst_mam_expns_lcl_all_t.expns_nm
		FROM mam_expns_lcl_all mavm_expns_mst_mam_expns_lcl_all_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_all_t.expns_cd = mavm_expns_mst_mam_expns_all_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.co_cd = mavm_expns_mst_mam_expns_all_t1.co_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.lcl_cd = 'ja_JP'
	)	expns_nm_lcl1,
	--費目名（ロケール２）
	(SELECT mavm_expns_mst_mam_expns_lcl_all_t.expns_nm
		FROM mam_expns_lcl_all mavm_expns_mst_mam_expns_lcl_all_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_all_t.expns_cd = mavm_expns_mst_mam_expns_all_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.co_cd = mavm_expns_mst_mam_expns_all_t1.co_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.lcl_cd = 'en_US'
	)	expns_nm_lcl2,
	--費目名（ロケール３）
	(SELECT mavm_expns_mst_mam_expns_lcl_all_t.expns_nm
		FROM mam_expns_lcl_all mavm_expns_mst_mam_expns_lcl_all_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_all_t.expns_cd = mavm_expns_mst_mam_expns_all_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.co_cd = mavm_expns_mst_mam_expns_all_t1.co_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.lcl_cd = 'TBD3'
	)	expns_nm_lcl3,
	--費目名（ロケール４）
	(SELECT mavm_expns_mst_mam_expns_lcl_all_t.expns_nm
		FROM mam_expns_lcl_all mavm_expns_mst_mam_expns_lcl_all_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_all_t.expns_cd = mavm_expns_mst_mam_expns_all_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.co_cd = mavm_expns_mst_mam_expns_all_t1.co_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.lcl_cd = 'TBD4'
	)	expns_nm_lcl4,
	--費目名（ロケール５）
	(SELECT mavm_expns_mst_mam_expns_lcl_all_t.expns_nm
		FROM mam_expns_lcl_all mavm_expns_mst_mam_expns_lcl_all_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_all_t.expns_cd = mavm_expns_mst_mam_expns_all_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.co_cd = mavm_expns_mst_mam_expns_all_t1.co_cd
		AND mavm_expns_mst_mam_expns_lcl_all_t.lcl_cd = 'TBD5'
	)	expns_nm_lcl5
	FROM mam_expns_all mavm_expns_mst_mam_expns_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_expns_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_expns_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS')
			AND	mavm_expns_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_expns_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_expns_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS')
			)
		)
	)
UNION ALL
SELECT
	mavm_expns_mst_mam_expns_cmn_t1.expns_cd,
	mavm_expns_mst_mam_expns_cmn_t1.expns_nm,
	mavm_expns_mst_mam_expns_cmn_t1.expns_grp_cd,
	mavm_expns_mst_mam_expns_cmn_t1.expns_typ,
	mavm_expns_mst_mam_expns_cmn_t1.direct_typ,
	mavm_expns_mst_mam_expns_cmn_t1.var_typ,
	mavm_expns_mst_mam_expns_cmn_t1.expns_seq,
	mavm_expns_mst_mam_expns_cmn_t1.memo1,
	mavm_expns_mst_mam_expns_cmn_t1.memo2,
	mavm_expns_mst_mam_expns_cmn_t1.memo3,
	mavm_expns_mst_mam_expns_cmn_t1.del_flg,
	mavm_expns_mst_mam_expns_cmn_t1.del_usr_id,
	mavm_expns_mst_mam_expns_cmn_t1.del_usr_nm,
	mavm_expns_mst_mam_expns_cmn_t1.del_ts,
	mavm_expns_mst_mam_expns_cmn_t1.ins_usr_id,
	mavm_expns_mst_mam_expns_cmn_t1.ins_usr_nm,
	mavm_expns_mst_mam_expns_cmn_t1.ins_ts,
	mavm_expns_mst_mam_expns_cmn_t1.ins_func_id,
	mavm_expns_mst_mam_expns_cmn_t1.upd_cntr,
	mavm_expns_mst_mam_expns_cmn_t1.upd_usr_id,
	mavm_expns_mst_mam_expns_cmn_t1.upd_usr_nm,
	mavm_expns_mst_mam_expns_cmn_t1.upd_ts,
	mavm_expns_mst_mam_expns_cmn_t1.upd_func_id,
	mavm_expns_mst_mam_expns_cmn_t1.upd_srv_req_no,
	mavm_expns_mst_mam_co_all_t2.co_cd,
	--費目名（ロケール１）
	(SELECT mavm_expns_mst_mam_expns_lcl_cmn_t.expns_nm
		FROM mam_expns_lcl_cmn mavm_expns_mst_mam_expns_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.expns_cd = mavm_expns_mst_mam_expns_cmn_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	expns_nm_lcl1,
	--費目名（ロケール２）
	(SELECT mavm_expns_mst_mam_expns_lcl_cmn_t.expns_nm
		FROM mam_expns_lcl_cmn mavm_expns_mst_mam_expns_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.expns_cd = mavm_expns_mst_mam_expns_cmn_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.lcl_cd = 'en_US'
	)	expns_nm_lcl2,
	--費目名（ロケール３）
	(SELECT mavm_expns_mst_mam_expns_lcl_cmn_t.expns_nm
		FROM mam_expns_lcl_cmn mavm_expns_mst_mam_expns_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.expns_cd = mavm_expns_mst_mam_expns_cmn_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.lcl_cd = 'TBD3'
	)	expns_nm_lcl3,
	--費目名（ロケール４）
	(SELECT mavm_expns_mst_mam_expns_lcl_cmn_t.expns_nm
		FROM mam_expns_lcl_cmn mavm_expns_mst_mam_expns_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.expns_cd = mavm_expns_mst_mam_expns_cmn_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.lcl_cd = 'TBD4'
	)	expns_nm_lcl4,
	--費目名（ロケール５）
	(SELECT mavm_expns_mst_mam_expns_lcl_cmn_t.expns_nm
		FROM mam_expns_lcl_cmn mavm_expns_mst_mam_expns_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.expns_cd = mavm_expns_mst_mam_expns_cmn_t1.expns_cd
		AND mavm_expns_mst_mam_expns_lcl_cmn_t.lcl_cd = 'TBD5'
	)	expns_nm_lcl5
	FROM mam_expns_cmn mavm_expns_mst_mam_expns_cmn_t1, mam_co_all mavm_expns_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_expns_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_expns_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS')
		AND	mavm_expns_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
