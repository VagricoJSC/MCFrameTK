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
)
SELECT
	--会社ＣＤ
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd,
	--部門ＣＤ
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.dpt_cd,
	--期
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.term,
	--部門名
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.dpt_nm,
	--部門名（ロケール１）
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.dpt_nm_lcl1,
	--部門名（ロケール２）
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.dpt_nm_lcl2,
	--部門名（ロケール３）
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.dpt_nm_lcl3,
	--部門名（ロケール４）
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.dpt_nm_lcl4,
	--部門名（ロケール５）
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.dpt_nm_lcl5,
	--物流グループ名
	(SELECT mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm
		FROM mavm_lg_grp_mst_w mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.lg_grp_cd
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	lg_grp_nm,
	--物流グループ名（ロケール１）
	(SELECT mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl1
		FROM mavm_lg_grp_mst_w mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.lg_grp_cd
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	lg_grp_nm_lcl1,
	--物流グループ名（ロケール２）
	(SELECT mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl2
		FROM mavm_lg_grp_mst_w mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.lg_grp_cd
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	lg_grp_nm_lcl2,
	--物流グループ名（ロケール３）
	(SELECT mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl3
		FROM mavm_lg_grp_mst_w mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.lg_grp_cd
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	lg_grp_nm_lcl3,
	--物流グループ名（ロケール４）
	(SELECT mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl4
		FROM mavm_lg_grp_mst_w mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.lg_grp_cd
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	lg_grp_nm_lcl4,
	--物流グループ名（ロケール５）
	(SELECT mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_nm_lcl5
		FROM mavm_lg_grp_mst_w mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.lg_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.lg_grp_cd
		AND mavm_cost_dpt_if_all_mavm_lg_grp_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	lg_grp_nm_lcl5,
	--製造場所グループ名
	(SELECT mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm
		FROM mavm_loc_grp_mst_w mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.loc_grp_cd
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	loc_grp_nm,
	--製造場所グループ名（ロケール１）
	(SELECT mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl1
		FROM mavm_loc_grp_mst_w mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.loc_grp_cd
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl1,
	--製造場所グループ名（ロケール２）
	(SELECT mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl2
		FROM mavm_loc_grp_mst_w mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.loc_grp_cd
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl2,
	--製造場所グループ名（ロケール３）
	(SELECT mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl3
		FROM mavm_loc_grp_mst_w mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.loc_grp_cd
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl3,
	--製造場所グループ名（ロケール４）
	(SELECT mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl4
		FROM mavm_loc_grp_mst_w mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.loc_grp_cd
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl4,
	--製造場所グループ名（ロケール５）
	(SELECT mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_nm_lcl5
		FROM mavm_loc_grp_mst_w mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.loc_grp_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.loc_grp_cd
		AND mavm_cost_dpt_if_all_mavm_loc_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	loc_grp_nm_lcl5,
	--ワーキンググループ名
	(SELECT mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_nm
		FROM mavm_wg_mst_w mavm_cost_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.wg_cd
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	wg_nm,
	--ワーキンググループ名（ロケール１）
	(SELECT mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl1
		FROM mavm_wg_mst_w mavm_cost_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.wg_cd
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	wg_nm_lcl1,
	--ワーキンググループ名（ロケール２）
	(SELECT mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl2
		FROM mavm_wg_mst_w mavm_cost_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.wg_cd
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	wg_nm_lcl2,
	--ワーキンググループ名（ロケール３）
	(SELECT mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl3
		FROM mavm_wg_mst_w mavm_cost_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.wg_cd
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	wg_nm_lcl3,
	--ワーキンググループ名（ロケール４）
	(SELECT mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl4
		FROM mavm_wg_mst_w mavm_cost_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.wg_cd
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	wg_nm_lcl4,
	--ワーキンググループ名（ロケール５）
	(SELECT mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_nm_lcl5
		FROM mavm_wg_mst_w mavm_cost_dpt_if_all_mavm_wg_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.wg_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.wg_cd
		AND mavm_cost_dpt_if_all_mavm_wg_mst_w_t.co_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
	)	wg_nm_lcl5,
	--工場・物流倉庫名
	(SELECT mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_nm
		FROM mavm_site_mst_w mavm_cost_dpt_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.site_cd
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	site_nm,
	--工場・物流倉庫名（ロケール１）
	(SELECT mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_nm_lcl1
		FROM mavm_site_mst_w mavm_cost_dpt_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.site_cd
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	site_nm_lcl1,
	--工場・物流倉庫名（ロケール２）
	(SELECT mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_nm_lcl2
		FROM mavm_site_mst_w mavm_cost_dpt_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.site_cd
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	site_nm_lcl2,
	--工場・物流倉庫名（ロケール３）
	(SELECT mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_nm_lcl3
		FROM mavm_site_mst_w mavm_cost_dpt_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.site_cd
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	site_nm_lcl3,
	--工場・物流倉庫名（ロケール４）
	(SELECT mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_nm_lcl4
		FROM mavm_site_mst_w mavm_cost_dpt_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.site_cd
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	site_nm_lcl4,
	--工場・物流倉庫名（ロケール５）
	(SELECT mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_nm_lcl5
		FROM mavm_site_mst_w mavm_cost_dpt_if_all_mavm_site_mst_w_t
		WHERE 0 = 0
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.site_cd = mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.site_cd
		AND mavm_cost_dpt_if_all_mavm_site_mst_w_t.co_cd =
			CASE (SELECT mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_cost_dpt_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND mavm_cost_dpt_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.co_cd
			END
	)	site_nm_lcl5,
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.memo1,
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.memo2,
	mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1.memo3
FROM mavm_cost_dpt_mst mavm_cost_dpt_if_all_mavm_cost_dpt_mst_t1
;
