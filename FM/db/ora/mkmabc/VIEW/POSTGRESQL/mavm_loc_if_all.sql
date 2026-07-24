WITH mavm_wg_mst_w AS (
	SELECT * FROM mavm_wg_mst
),
mavm_site_mst_w AS (
	SELECT * FROM mavm_site_mst
),
mavm_lg_grp_mst_w AS (
	SELECT * FROM mavm_lg_grp_mst
),
mavm_loc_grp_mst_w AS (
	SELECT * FROM mavm_loc_grp_mst
),
mavm_alloc_grp_mst_w AS (
	SELECT * FROM mavm_alloc_grp_mst
),
mavm_bp_mst_w AS (
	SELECT * FROM mavm_bp_mst
),
mavm_cntry_mst_w AS (
	SELECT * FROM mavm_cntry_mst
),
mavm_rsrc_mst_w AS (
	SELECT * FROM mavm_rsrc_mst
)
SELECT
	--会社ＣＤ
	mavm_loc_if_all_mavm_loc_mst_t1.co_cd,
	--場所ＣＤ
	mavm_loc_if_all_mavm_loc_mst_t1.loc_cd,
	--場所名
	mavm_loc_if_all_mavm_loc_mst_t1.loc_nm,
	--場所名（ロケール１）
	mavm_loc_if_all_mavm_loc_mst_t1.loc_nm_lcl1,
	--場所名（ロケール２）
	mavm_loc_if_all_mavm_loc_mst_t1.loc_nm_lcl2,
	--場所名（ロケール３）
	mavm_loc_if_all_mavm_loc_mst_t1.loc_nm_lcl3,
	--場所名（ロケール４）
	mavm_loc_if_all_mavm_loc_mst_t1.loc_nm_lcl4,
	--場所名（ロケール５）
	mavm_loc_if_all_mavm_loc_mst_t1.loc_nm_lcl5,
	--ワーキンググループ名
	(SELECT mavm_loc_if_all_mavm_wg_mst_w_t.wg_nm
		FROM mavm_wg_mst_w mavm_loc_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_wg_mst_w_t.wg_cd = mavm_loc_if_all_mavm_loc_mst_t1.wg_cd
		AND mavm_loc_if_all_mavm_wg_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	wg_nm,
	--ワーキンググループ名（ロケール１）
	(SELECT mavm_loc_if_all_mavm_wg_mst_w_t.wg_nm_lcl1
		FROM mavm_wg_mst_w mavm_loc_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_wg_mst_w_t.wg_cd = mavm_loc_if_all_mavm_loc_mst_t1.wg_cd
		AND mavm_loc_if_all_mavm_wg_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	wg_nm_lcl1,
	--ワーキンググループ名（ロケール２）
	(SELECT mavm_loc_if_all_mavm_wg_mst_w_t.wg_nm_lcl2
		FROM mavm_wg_mst_w mavm_loc_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_wg_mst_w_t.wg_cd = mavm_loc_if_all_mavm_loc_mst_t1.wg_cd
		AND mavm_loc_if_all_mavm_wg_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	wg_nm_lcl2,
	--ワーキンググループ名（ロケール３）
	(SELECT mavm_loc_if_all_mavm_wg_mst_w_t.wg_nm_lcl3
		FROM mavm_wg_mst_w mavm_loc_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_wg_mst_w_t.wg_cd = mavm_loc_if_all_mavm_loc_mst_t1.wg_cd
		AND mavm_loc_if_all_mavm_wg_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	wg_nm_lcl3,
	--ワーキンググループ名（ロケール４）
	(SELECT mavm_loc_if_all_mavm_wg_mst_w_t.wg_nm_lcl4
		FROM mavm_wg_mst_w mavm_loc_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_wg_mst_w_t.wg_cd = mavm_loc_if_all_mavm_loc_mst_t1.wg_cd
		AND mavm_loc_if_all_mavm_wg_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	wg_nm_lcl4,
	--ワーキンググループ名（ロケール５）
	(SELECT mavm_loc_if_all_mavm_wg_mst_w_t.wg_nm_lcl5
		FROM mavm_wg_mst_w mavm_loc_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_wg_mst_w_t.wg_cd = mavm_loc_if_all_mavm_loc_mst_t1.wg_cd
		AND mavm_loc_if_all_mavm_wg_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	wg_nm_lcl5,
	--工場・物流倉庫名
	(SELECT mavm_loc_if_all_mavm_site_mst_w_t.site_nm
		FROM mavm_site_mst_w mavm_loc_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_site_mst_w_t.site_cd = mavm_loc_if_all_mavm_loc_mst_t1.site_cd
		AND mavm_loc_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	site_nm,
	--工場・物流倉庫名（ロケール１）
	(SELECT mavm_loc_if_all_mavm_site_mst_w_t.site_nm_lcl1
		FROM mavm_site_mst_w mavm_loc_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_site_mst_w_t.site_cd = mavm_loc_if_all_mavm_loc_mst_t1.site_cd
		AND mavm_loc_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	site_nm_lcl1,
	--工場・物流倉庫名（ロケール２）
	(SELECT mavm_loc_if_all_mavm_site_mst_w_t.site_nm_lcl2
		FROM mavm_site_mst_w mavm_loc_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_site_mst_w_t.site_cd = mavm_loc_if_all_mavm_loc_mst_t1.site_cd
		AND mavm_loc_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	site_nm_lcl2,
	--工場・物流倉庫名（ロケール３）
	(SELECT mavm_loc_if_all_mavm_site_mst_w_t.site_nm_lcl3
		FROM mavm_site_mst_w mavm_loc_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_site_mst_w_t.site_cd = mavm_loc_if_all_mavm_loc_mst_t1.site_cd
		AND mavm_loc_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	site_nm_lcl3,
	--工場・物流倉庫名（ロケール４）
	(SELECT mavm_loc_if_all_mavm_site_mst_w_t.site_nm_lcl4
		FROM mavm_site_mst_w mavm_loc_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_site_mst_w_t.site_cd = mavm_loc_if_all_mavm_loc_mst_t1.site_cd
		AND mavm_loc_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	site_nm_lcl4,
	--工場・物流倉庫名（ロケール５）
	(SELECT mavm_loc_if_all_mavm_site_mst_w_t.site_nm_lcl5
		FROM mavm_site_mst_w mavm_loc_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_site_mst_w_t.site_cd = mavm_loc_if_all_mavm_loc_mst_t1.site_cd
		AND mavm_loc_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	site_nm_lcl5,
	--物流グループ名
	(SELECT mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm
		FROM mavm_lg_grp_mst_w mavm_loc_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.lg_grp_cd
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	lg_grp_nm,
	--物流グループ名（ロケール１）
	(SELECT mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl1
		FROM mavm_lg_grp_mst_w mavm_loc_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.lg_grp_cd
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	lg_grp_nm_lcl1,
	--物流グループ名（ロケール２）
	(SELECT mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl2
		FROM mavm_lg_grp_mst_w mavm_loc_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.lg_grp_cd
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	lg_grp_nm_lcl2,
	--物流グループ名（ロケール３）
	(SELECT mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl3
		FROM mavm_lg_grp_mst_w mavm_loc_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.lg_grp_cd
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	lg_grp_nm_lcl3,
	--物流グループ名（ロケール４）
	(SELECT mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl4
		FROM mavm_lg_grp_mst_w mavm_loc_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.lg_grp_cd
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	lg_grp_nm_lcl4,
	--物流グループ名（ロケール５）
	(SELECT mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl5
		FROM mavm_lg_grp_mst_w mavm_loc_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.lg_grp_cd
		AND mavm_loc_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	lg_grp_nm_lcl5,
	--製造場所グループ名
	(SELECT mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm
		FROM mavm_loc_grp_mst_w mavm_loc_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.loc_grp_cd
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	loc_grp_nm,
	--製造場所グループ名（ロケール１）
	(SELECT mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl1
		FROM mavm_loc_grp_mst_w mavm_loc_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.loc_grp_cd
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl1,
	--製造場所グループ名（ロケール２）
	(SELECT mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl2
		FROM mavm_loc_grp_mst_w mavm_loc_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.loc_grp_cd
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl2,
	--製造場所グループ名（ロケール３）
	(SELECT mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl3
		FROM mavm_loc_grp_mst_w mavm_loc_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.loc_grp_cd
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl3,
	--製造場所グループ名（ロケール４）
	(SELECT mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl4
		FROM mavm_loc_grp_mst_w mavm_loc_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.loc_grp_cd
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl4,
	--製造場所グループ名（ロケール５）
	(SELECT mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl5
		FROM mavm_loc_grp_mst_w mavm_loc_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.loc_grp_cd
		AND mavm_loc_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl5,
	--総量引当場所グループ名
	(SELECT mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_nm
		FROM mavm_alloc_grp_mst_w mavm_loc_if_all_mavm_alloc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.alloc_grp_cd
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	alloc_grp_nm,
	--総量引当場所グループ名（ロケール１）
	(SELECT mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_nm_lcl1
		FROM mavm_alloc_grp_mst_w mavm_loc_if_all_mavm_alloc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.alloc_grp_cd
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	alloc_grp_nm_lcl1,
	--総量引当場所グループ名（ロケール２）
	(SELECT mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_nm_lcl2
		FROM mavm_alloc_grp_mst_w mavm_loc_if_all_mavm_alloc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.alloc_grp_cd
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	alloc_grp_nm_lcl2,
	--総量引当場所グループ名（ロケール３）
	(SELECT mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_nm_lcl3
		FROM mavm_alloc_grp_mst_w mavm_loc_if_all_mavm_alloc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.alloc_grp_cd
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	alloc_grp_nm_lcl3,
	--総量引当場所グループ名（ロケール４）
	(SELECT mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_nm_lcl4
		FROM mavm_alloc_grp_mst_w mavm_loc_if_all_mavm_alloc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.alloc_grp_cd
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	alloc_grp_nm_lcl4,
	--総量引当場所グループ名（ロケール５）
	(SELECT mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_nm_lcl5
		FROM mavm_alloc_grp_mst_w mavm_loc_if_all_mavm_alloc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.alloc_grp_cd = mavm_loc_if_all_mavm_loc_mst_t1.alloc_grp_cd
		AND mavm_loc_if_all_mavm_alloc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ALLOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	alloc_grp_nm_lcl5,
		--発注先名
	(SELECT mavm_loc_if_all_mavm_bp_mst_w_t.bp_nm
		FROM mavm_bp_mst_w mavm_loc_if_all_mavm_bp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_bp_mst_w_t.bp_cd = mavm_loc_if_all_mavm_loc_mst_t1.sppl_cd
		AND mavm_loc_if_all_mavm_bp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	sppl_nm,
	--発注先名（ロケール１）
	(SELECT mavm_loc_if_all_mavm_bp_mst_w_t.bp_nm_lcl1
		FROM mavm_bp_mst_w mavm_loc_if_all_mavm_bp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_bp_mst_w_t.bp_cd = mavm_loc_if_all_mavm_loc_mst_t1.sppl_cd
		AND mavm_loc_if_all_mavm_bp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	sppl_nm_lcl1,
	--発注先名（ロケール２）
	(SELECT mavm_loc_if_all_mavm_bp_mst_w_t.bp_nm_lcl2
		FROM mavm_bp_mst_w mavm_loc_if_all_mavm_bp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_bp_mst_w_t.bp_cd = mavm_loc_if_all_mavm_loc_mst_t1.sppl_cd
		AND mavm_loc_if_all_mavm_bp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	sppl_nm_lcl2,
	--発注先名（ロケール３）
	(SELECT mavm_loc_if_all_mavm_bp_mst_w_t.bp_nm_lcl3
		FROM mavm_bp_mst_w mavm_loc_if_all_mavm_bp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_bp_mst_w_t.bp_cd = mavm_loc_if_all_mavm_loc_mst_t1.sppl_cd
		AND mavm_loc_if_all_mavm_bp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	sppl_nm_lcl3,
	--発注先名（ロケール４）
	(SELECT mavm_loc_if_all_mavm_bp_mst_w_t.bp_nm_lcl4
		FROM mavm_bp_mst_w mavm_loc_if_all_mavm_bp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_bp_mst_w_t.bp_cd = mavm_loc_if_all_mavm_loc_mst_t1.sppl_cd
		AND mavm_loc_if_all_mavm_bp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	sppl_nm_lcl4,
	--発注先名（ロケール５）
	(SELECT mavm_loc_if_all_mavm_bp_mst_w_t.bp_nm_lcl5
		FROM mavm_bp_mst_w mavm_loc_if_all_mavm_bp_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_bp_mst_w_t.bp_cd = mavm_loc_if_all_mavm_loc_mst_t1.sppl_cd
		AND mavm_loc_if_all_mavm_bp_mst_w_t.co_cd = mavm_loc_if_all_mavm_loc_mst_t1.co_cd
	)	sppl_nm_lcl5,
	--国名
	(SELECT mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_nm
		FROM mavm_cntry_mst_w mavm_loc_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_loc_if_all_mavm_loc_mst_t1.cntry_cd
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	cntry_nm,
	--国名（ロケール１）
	(SELECT mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl1
		FROM mavm_cntry_mst_w mavm_loc_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_loc_if_all_mavm_loc_mst_t1.cntry_cd
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	cntry_nm_lcl1,
	--国名（ロケール２）
	(SELECT mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl2
		FROM mavm_cntry_mst_w mavm_loc_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_loc_if_all_mavm_loc_mst_t1.cntry_cd
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	cntry_nm_lcl2,
	--国名（ロケール３）
	(SELECT mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl3
		FROM mavm_cntry_mst_w mavm_loc_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_loc_if_all_mavm_loc_mst_t1.cntry_cd
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	cntry_nm_lcl3,
	--国名（ロケール４）
	(SELECT mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl4
		FROM mavm_cntry_mst_w mavm_loc_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_loc_if_all_mavm_loc_mst_t1.cntry_cd
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	cntry_nm_lcl4,
	--国名（ロケール５）
	(SELECT mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl5
		FROM mavm_cntry_mst_w mavm_loc_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_loc_if_all_mavm_loc_mst_t1.cntry_cd
		AND mavm_loc_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	cntry_nm_lcl5,
	--資源名１
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd1
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm1,
	--資源名１（ロケール１）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl1
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd1
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm1_lcl1,
	--資源名１（ロケール２）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl2
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd1
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm1_lcl2,
	--資源名１（ロケール３）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl3
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd1
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm1_lcl3,
	--資源名１（ロケール４）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl4
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd1
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm1_lcl4,
	--資源名１（ロケール５）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl5
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd1
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm1_lcl5,
	--資源名２
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd2
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm2,
	--資源名２（ロケール１）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl1
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd2
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm2_lcl1,
	--資源名２（ロケール２）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl2
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd2
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm2_lcl2,
	--資源名２（ロケール３）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl3
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd2
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm2_lcl3,
	--資源名２（ロケール４）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl4
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd2
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm2_lcl4,
	--資源名２（ロケール５）
	(SELECT mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_nm_lcl5
		FROM mavm_rsrc_mst_w mavm_loc_if_all_mavm_rsrc_mst_w_t
		WHERE 0 = 0
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.rsrc_cd = mavm_loc_if_all_mavm_loc_mst_t1.rsrc_cd2
		AND mavm_loc_if_all_mavm_rsrc_mst_w_t.co_cd =
			CASE (SELECT mavm_loc_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_loc_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_loc_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_RSRC')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_loc_if_all_mavm_loc_mst_t1.co_cd
			END
	)	rsrc_nm2_lcl5,
	mavm_loc_if_all_mavm_loc_mst_t1.memo1,
	mavm_loc_if_all_mavm_loc_mst_t1.memo2,
	mavm_loc_if_all_mavm_loc_mst_t1.memo3
FROM mavm_loc_mst mavm_loc_if_all_mavm_loc_mst_t1
;
