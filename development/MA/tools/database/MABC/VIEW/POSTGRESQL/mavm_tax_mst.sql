SELECT
	mavm_tax_mst_mam_tax_all_t1.tax_cd,
	mavm_tax_mst_mam_tax_all_t1.tax_nm,
	mavm_tax_mst_mam_tax_all_t1.tax_typ,
	mavm_tax_mst_mam_tax_all_t1.inc_tax_flg,
	mavm_tax_mst_mam_tax_all_t1.tax_rate,
	mavm_tax_mst_mam_tax_all_t1.sls_flg,
	mavm_tax_mst_mam_tax_all_t1.purc_flg,
	mavm_tax_mst_mam_tax_all_t1.prov_flg,
	mavm_tax_mst_mam_tax_all_t1.memo1,
	mavm_tax_mst_mam_tax_all_t1.memo2,
	mavm_tax_mst_mam_tax_all_t1.memo3,
	mavm_tax_mst_mam_tax_all_t1.del_flg,
	mavm_tax_mst_mam_tax_all_t1.del_usr_id,
	mavm_tax_mst_mam_tax_all_t1.del_usr_nm,
	mavm_tax_mst_mam_tax_all_t1.del_ts,
	mavm_tax_mst_mam_tax_all_t1.ins_usr_id,
	mavm_tax_mst_mam_tax_all_t1.ins_usr_nm,
	mavm_tax_mst_mam_tax_all_t1.ins_ts,
	mavm_tax_mst_mam_tax_all_t1.ins_func_id,
	mavm_tax_mst_mam_tax_all_t1.upd_cntr,
	mavm_tax_mst_mam_tax_all_t1.upd_usr_id,
	mavm_tax_mst_mam_tax_all_t1.upd_usr_nm,
	mavm_tax_mst_mam_tax_all_t1.upd_ts,
	mavm_tax_mst_mam_tax_all_t1.upd_func_id,
	mavm_tax_mst_mam_tax_all_t1.upd_srv_req_no,
	mavm_tax_mst_mam_tax_all_t1.co_cd,
	--税名（ロケール１）
	(SELECT mavm_tax_mst_mam_tax_lcl_all_t.tax_nm
		FROM mam_tax_lcl_all mavm_tax_mst_mam_tax_lcl_all_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_all_t.tax_cd = mavm_tax_mst_mam_tax_all_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.co_cd = mavm_tax_mst_mam_tax_all_t1.co_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.lcl_cd = 'ja_JP'
	)	tax_nm_lcl1,
	--税名（ロケール２）
	(SELECT mavm_tax_mst_mam_tax_lcl_all_t.tax_nm
		FROM mam_tax_lcl_all mavm_tax_mst_mam_tax_lcl_all_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_all_t.tax_cd = mavm_tax_mst_mam_tax_all_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.co_cd = mavm_tax_mst_mam_tax_all_t1.co_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.lcl_cd = 'en_US'
	)	tax_nm_lcl2,
	--税名（ロケール３）
	(SELECT mavm_tax_mst_mam_tax_lcl_all_t.tax_nm
		FROM mam_tax_lcl_all mavm_tax_mst_mam_tax_lcl_all_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_all_t.tax_cd = mavm_tax_mst_mam_tax_all_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.co_cd = mavm_tax_mst_mam_tax_all_t1.co_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.lcl_cd = 'TBD3'
	)	tax_nm_lcl3,
	--税名（ロケール４）
	(SELECT mavm_tax_mst_mam_tax_lcl_all_t.tax_nm
		FROM mam_tax_lcl_all mavm_tax_mst_mam_tax_lcl_all_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_all_t.tax_cd = mavm_tax_mst_mam_tax_all_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.co_cd = mavm_tax_mst_mam_tax_all_t1.co_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.lcl_cd = 'TBD4'
	)	tax_nm_lcl4,
	--税名（ロケール５）
	(SELECT mavm_tax_mst_mam_tax_lcl_all_t.tax_nm
		FROM mam_tax_lcl_all mavm_tax_mst_mam_tax_lcl_all_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_all_t.tax_cd = mavm_tax_mst_mam_tax_all_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.co_cd = mavm_tax_mst_mam_tax_all_t1.co_cd
		AND mavm_tax_mst_mam_tax_lcl_all_t.lcl_cd = 'TBD5'
	)	tax_nm_lcl5
	FROM mam_tax_all mavm_tax_mst_mam_tax_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_tax_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_tax_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_TAX')
			AND	mavm_tax_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_tax_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_tax_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_TAX')
			)
		)
	)
UNION ALL
SELECT
	mavm_tax_mst_mam_tax_cmn_t1.tax_cd,
	mavm_tax_mst_mam_tax_cmn_t1.tax_nm,
	mavm_tax_mst_mam_tax_cmn_t1.tax_typ,
	mavm_tax_mst_mam_tax_cmn_t1.inc_tax_flg,
	mavm_tax_mst_mam_tax_cmn_t1.tax_rate,
	mavm_tax_mst_mam_tax_cmn_t1.sls_flg,
	mavm_tax_mst_mam_tax_cmn_t1.purc_flg,
	mavm_tax_mst_mam_tax_cmn_t1.prov_flg,
	mavm_tax_mst_mam_tax_cmn_t1.memo1,
	mavm_tax_mst_mam_tax_cmn_t1.memo2,
	mavm_tax_mst_mam_tax_cmn_t1.memo3,
	mavm_tax_mst_mam_tax_cmn_t1.del_flg,
	mavm_tax_mst_mam_tax_cmn_t1.del_usr_id,
	mavm_tax_mst_mam_tax_cmn_t1.del_usr_nm,
	mavm_tax_mst_mam_tax_cmn_t1.del_ts,
	mavm_tax_mst_mam_tax_cmn_t1.ins_usr_id,
	mavm_tax_mst_mam_tax_cmn_t1.ins_usr_nm,
	mavm_tax_mst_mam_tax_cmn_t1.ins_ts,
	mavm_tax_mst_mam_tax_cmn_t1.ins_func_id,
	mavm_tax_mst_mam_tax_cmn_t1.upd_cntr,
	mavm_tax_mst_mam_tax_cmn_t1.upd_usr_id,
	mavm_tax_mst_mam_tax_cmn_t1.upd_usr_nm,
	mavm_tax_mst_mam_tax_cmn_t1.upd_ts,
	mavm_tax_mst_mam_tax_cmn_t1.upd_func_id,
	mavm_tax_mst_mam_tax_cmn_t1.upd_srv_req_no,
	mavm_tax_mst_mam_co_all_t2.co_cd,
	--税名（ロケール１）
	(SELECT mavm_tax_mst_mam_tax_lcl_cmn_t.tax_nm
		FROM mam_tax_lcl_cmn mavm_tax_mst_mam_tax_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.tax_cd = mavm_tax_mst_mam_tax_cmn_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	tax_nm_lcl1,
	--税名（ロケール２）
	(SELECT mavm_tax_mst_mam_tax_lcl_cmn_t.tax_nm
		FROM mam_tax_lcl_cmn mavm_tax_mst_mam_tax_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.tax_cd = mavm_tax_mst_mam_tax_cmn_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.lcl_cd = 'en_US'
	)	tax_nm_lcl2,
	--税名（ロケール３）
	(SELECT mavm_tax_mst_mam_tax_lcl_cmn_t.tax_nm
		FROM mam_tax_lcl_cmn mavm_tax_mst_mam_tax_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.tax_cd = mavm_tax_mst_mam_tax_cmn_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.lcl_cd = 'TBD3'
	)	tax_nm_lcl3,
	--税名（ロケール４）
	(SELECT mavm_tax_mst_mam_tax_lcl_cmn_t.tax_nm
		FROM mam_tax_lcl_cmn mavm_tax_mst_mam_tax_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.tax_cd = mavm_tax_mst_mam_tax_cmn_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.lcl_cd = 'TBD4'
	)	tax_nm_lcl4,
	--税名（ロケール５）
	(SELECT mavm_tax_mst_mam_tax_lcl_cmn_t.tax_nm
		FROM mam_tax_lcl_cmn mavm_tax_mst_mam_tax_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.tax_cd = mavm_tax_mst_mam_tax_cmn_t1.tax_cd
		AND mavm_tax_mst_mam_tax_lcl_cmn_t.lcl_cd = 'TBD5'
	)	tax_nm_lcl5
	FROM mam_tax_cmn mavm_tax_mst_mam_tax_cmn_t1, mam_co_all mavm_tax_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_tax_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_tax_mst_mam_mst_ctl_x.mst_nm =  fcpa_const$get_const_val('MAC_MST_NM','MAM_TAX')
		AND	mavm_tax_mst_mam_mst_ctl_x.mst_set_typ =  fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
/
