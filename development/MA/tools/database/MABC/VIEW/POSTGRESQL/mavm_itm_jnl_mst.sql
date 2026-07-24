SELECT
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.itm_jnl_cd,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.itm_jnl_nm,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.ar_typ,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.ap_typ,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.memo1,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.memo2,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.memo3,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.del_flg,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.del_usr_id,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.del_usr_nm,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.del_ts,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.ins_usr_id,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.ins_usr_nm,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.ins_ts,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.ins_func_id,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.upd_cntr,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.upd_usr_id,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.upd_usr_nm,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.upd_ts,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.upd_func_id,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.upd_srv_req_no,
	mavm_itm_jnl_mst_mam_itm_jnl_all_t1.co_cd,
	--品目仕訳名（ロケール１）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_all mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.co_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.co_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.lcl_cd = 'ja_JP'
	)	itm_jnl_nm_lcl1,
	--品目仕訳名（ロケール２）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_all mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.co_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.co_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.lcl_cd = 'en_US'
	)	itm_jnl_nm_lcl2,
	--品目仕訳名（ロケール３）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_all mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.co_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.co_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.lcl_cd = 'TBD3'
	)	itm_jnl_nm_lcl3,
	--品目仕訳名（ロケール４）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_all mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.co_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.co_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.lcl_cd = 'TBD4'
	)	itm_jnl_nm_lcl4,
	--品目仕訳名（ロケール５）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_all mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.co_cd = mavm_itm_jnl_mst_mam_itm_jnl_all_t1.co_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_all_t.lcl_cd = 'TBD5'
	)	itm_jnl_nm_lcl5
	FROM mam_itm_jnl_all mavm_itm_jnl_mst_mam_itm_jnl_all_t1
	WHERE 0=0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_itm_jnl_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_itm_jnl_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
			AND	mavm_itm_jnl_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_itm_jnl_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_itm_jnl_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
			)
		)
	)
UNION ALL
SELECT
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.itm_jnl_cd,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.itm_jnl_nm,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.ar_typ,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.ap_typ,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.memo1,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.memo2,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.memo3,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.del_flg,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.del_usr_id,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.del_usr_nm,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.del_ts,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.ins_usr_id,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.ins_usr_nm,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.ins_ts,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.ins_func_id,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.upd_cntr,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.upd_usr_id,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.upd_usr_nm,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.upd_ts,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.upd_func_id,
	mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.upd_srv_req_no,
	fcpa_const$get_const_val('MAC_STR','NULL_VAL') co_cd,
	--品目仕訳名（ロケール１）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_cmn mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	itm_jnl_nm_lcl1,
	--品目仕訳名（ロケール２）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_cmn mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.lcl_cd = 'en_US'
	)	itm_jnl_nm_lcl2,
	--品目仕訳名（ロケール３）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_cmn mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.lcl_cd = 'TBD3'
	)	itm_jnl_nm_lcl3,
	--品目仕訳名（ロケール４）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_cmn mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.lcl_cd = 'TBD4'
	)	itm_jnl_nm_lcl4,
	--品目仕訳名（ロケール５）
	(SELECT mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_nm
		FROM mam_itm_jnl_lcl_cmn mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t
		WHERE 0=0
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.itm_jnl_cd = mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1.itm_jnl_cd
		AND mavm_itm_jnl_mst_mam_itm_jnl_lcl_cmn_t.lcl_cd = 'TBD5'
	)	itm_jnl_nm_lcl5
	FROM mam_itm_jnl_cmn mavm_itm_jnl_mst_mam_itm_jnl_cmn_t1
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_itm_jnl_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_itm_jnl_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
		AND	mavm_itm_jnl_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
