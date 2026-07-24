WITH mavm_bp_grp_mst_w AS (
	SELECT * FROM mavm_bp_grp_mst
),
mavm_cntry_mst_w AS (
	SELECT * FROM mavm_cntry_mst
),
mavm_area_mst_w AS (
	SELECT * FROM mavm_area_mst
)
SELECT
	--会社ＣＤ
	mavm_bp_if_all_mavm_bp_mst_t1.co_cd,
	--取引先ＣＤ
	mavm_bp_if_all_mavm_bp_mst_t1.bp_cd,
	--取引先名
	mavm_bp_if_all_mavm_bp_mst_t1.bp_nm,
	--取引先名（ロケール１）
	mavm_bp_if_all_mavm_bp_mst_t1.bp_nm_lcl1,
	--取引先名（ロケール２）
	mavm_bp_if_all_mavm_bp_mst_t1.bp_nm_lcl2,
	--取引先名（ロケール３）
	mavm_bp_if_all_mavm_bp_mst_t1.bp_nm_lcl3,
	--取引先名（ロケール４）
	mavm_bp_if_all_mavm_bp_mst_t1.bp_nm_lcl4,
	--取引先名（ロケール５）
	mavm_bp_if_all_mavm_bp_mst_t1.bp_nm_lcl5,
	--取引先分類名１
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP1')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd1
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm1,
	--取引先分類名１（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP1')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd1
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm1_lcl1,
	--取引先分類名１（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP1')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd1
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm1_lcl2,
	--取引先分類名１（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP1')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd1
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm1_lcl3,
	--取引先分類名１（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP1')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd1
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm1_lcl4,
	--取引先分類名１（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP1')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd1
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm1_lcl5,
	--取引先分類名２
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP2')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd2
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm2,
	--取引先分類名２（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP2')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd2
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm2_lcl1,
	--取引先分類名２（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP2')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd2
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm2_lcl2,
	--取引先分類名２（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP2')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd2
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm2_lcl3,
	--取引先分類名２（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP2')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd2
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm2_lcl4,
	--取引先分類名２（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP2')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd2
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm2_lcl5,
	--取引先分類名３
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP3')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd3
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm3,
	--取引先分類名３（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP3')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd3
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm3_lcl1,
	--取引先分類名３（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP3')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd3
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm3_lcl2,
	--取引先分類名３（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP3')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd3
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm3_lcl3,
	--取引先分類名３（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP3')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd3
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm3_lcl4,
	--取引先分類名３（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP3')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd3
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm3_lcl5,
	--取引先分類名４
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP4')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd4
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm4,
	--取引先分類名４（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP4')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd4
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm4_lcl1,
	--取引先分類名４（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP4')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd4
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm4_lcl2,
	--取引先分類名４（ロケール３）,
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP4')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd4
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm4_lcl3,
	--取引先分類名４（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP4')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd4
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm4_lcl4,
	--取引先分類名４（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP4')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd4
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm4_lcl5,
	--取引先分類名５
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP5')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd5
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm5,
	--取引先分類名５（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP5')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd5
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm5_lcl1,
	--取引先分類名５（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP5')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd5
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm5_lcl2,
	--取引先分類名５（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP5')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd5
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm5_lcl3,
	--取引先分類名５（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP5')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd5
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm5_lcl4,
	--取引先分類名５（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP5')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd5
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm5_lcl5,
	--取引先分類名６
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP6')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd6
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm6,
	--取引先分類名６（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP6')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd6
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm6_lcl1,
	--取引先分類名６（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP6')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd6
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm6_lcl2,
	--取引先分類名６（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP6')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd6
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm6_lcl3,
	--取引先分類名６（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP6')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd6
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm6_lcl4,
	--取引先分類名６（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP6')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd6
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm6_lcl5,
	--取引先分類名７
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP7')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd7
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm7,
	--取引先分類名７（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP7')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd7
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm7_lcl1,
	--取引先分類名７（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP7')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd7
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm7_lcl2,
	--取引先分類名７（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP7')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd7
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm7_lcl3,
	--取引先分類名７（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP7')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd7
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm7_lcl4,
	--取引先分類名７（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP7')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd7
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm7_lcl5,
	--取引先分類名８
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP8')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd8
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm8,
	--取引先分類名８（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP8')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd8
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm8_lcl1,
	--取引先分類名８（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP8')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd8
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm8_lcl2,
	--取引先分類名８（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP8')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd8
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm8_lcl3,
	--取引先分類名８（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP8')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd8
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm8_lcl4,
	--取引先分類名８（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP8')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd8
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm8_lcl5,
	--取引先分類名９
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP9')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd9
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm9,
	--取引先分類名９（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP9')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd9
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm9_lcl1,
	--取引先分類名９（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP9')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd9
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm9_lcl2,
	--取引先分類名９（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP9')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd9
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm9_lcl3,
	--取引先分類名９（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP9')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd9
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm9_lcl4,
	--取引先分類名９（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP9')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd9
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm9_lcl5,
	--取引先分類名１０
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP10')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd10
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm10,
	--取引先分類名１０（ロケール１）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl1
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP10')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd10
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm10_lcl1,
	--取引先分類名１０（ロケール２）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl2
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP10')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd10
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm10_lcl2,
	--取引先分類名１０（ロケール３）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl3
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP10')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd10
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm10_lcl3,
	--取引先分類名１０（ロケール４）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl4
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP10')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd10
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm10_lcl4,
	--取引先分類名１０（ロケール５）
	(SELECT mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_nm_lcl5
		FROM mavm_bp_grp_mst_w mavm_bp_if_all_mavm_bp_grp_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_typ = fcpa_const$get_const_val('MAC_BP_GRP_TYP','GRP10')
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.bp_grp_cd = mavm_bp_if_all_mavm_bp_mst_t1.bp_grp_cd10
		AND mavm_bp_if_all_mavm_bp_grp_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	bp_grp_nm10_lcl5,
	--国名
	(SELECT mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_nm
		FROM mavm_cntry_mst_w mavm_bp_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_bp_if_all_mavm_bp_mst_t1.cntry_cd
		AND mavm_bp_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	cntry_nm,
	--国名（ロケール１）
	(SELECT mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl1
		FROM mavm_cntry_mst_w mavm_bp_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_bp_if_all_mavm_bp_mst_t1.cntry_cd
		AND mavm_bp_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	cntry_nm_lcl1,
	--国名（ロケール２）
	(SELECT mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl2
		FROM mavm_cntry_mst_w mavm_bp_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_bp_if_all_mavm_bp_mst_t1.cntry_cd
		AND mavm_bp_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	cntry_nm_lcl2,
	--国名（ロケール３）
	(SELECT mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl3
		FROM mavm_cntry_mst_w mavm_bp_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_bp_if_all_mavm_bp_mst_t1.cntry_cd
		AND mavm_bp_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	cntry_nm_lcl3,
	--国名（ロケール４）
	(SELECT mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl4
		FROM mavm_cntry_mst_w mavm_bp_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_bp_if_all_mavm_bp_mst_t1.cntry_cd
		AND mavm_bp_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	cntry_nm_lcl4,
	--国名（ロケール５）
	(SELECT mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_nm_lcl5
		FROM mavm_cntry_mst_w mavm_bp_if_all_mavm_cntry_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_cntry_mst_w_t.cntry_cd = mavm_bp_if_all_mavm_bp_mst_t1.cntry_cd
		AND mavm_bp_if_all_mavm_cntry_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	cntry_nm_lcl5,
	--地域名
	(SELECT mavm_bp_if_all_mavm_area_mst_w_t.area_nm
		FROM mavm_area_mst_w mavm_bp_if_all_mavm_area_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_area_mst_w_t.area_cd = mavm_bp_if_all_mavm_bp_mst_t1.area_cd
		AND mavm_bp_if_all_mavm_area_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	area_nm,
	--地域名（ロケール１）
	(SELECT mavm_bp_if_all_mavm_area_mst_w_t.area_nm_lcl1
		FROM mavm_area_mst_w mavm_bp_if_all_mavm_area_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_area_mst_w_t.area_cd = mavm_bp_if_all_mavm_bp_mst_t1.area_cd
		AND mavm_bp_if_all_mavm_area_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	area_nm_lcl1,
	--地域名（ロケール２）
	(SELECT mavm_bp_if_all_mavm_area_mst_w_t.area_nm_lcl2
		FROM mavm_area_mst_w mavm_bp_if_all_mavm_area_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_area_mst_w_t.area_cd = mavm_bp_if_all_mavm_bp_mst_t1.area_cd
		AND mavm_bp_if_all_mavm_area_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	area_nm_lcl2,
	--地域名（ロケール３）
	(SELECT mavm_bp_if_all_mavm_area_mst_w_t.area_nm_lcl3
		FROM mavm_area_mst_w mavm_bp_if_all_mavm_area_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_area_mst_w_t.area_cd = mavm_bp_if_all_mavm_bp_mst_t1.area_cd
		AND mavm_bp_if_all_mavm_area_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	area_nm_lcl3,
	--地域名（ロケール４）
	(SELECT mavm_bp_if_all_mavm_area_mst_w_t.area_nm_lcl4
		FROM mavm_area_mst_w mavm_bp_if_all_mavm_area_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_area_mst_w_t.area_cd = mavm_bp_if_all_mavm_bp_mst_t1.area_cd
		AND mavm_bp_if_all_mavm_area_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	area_nm_lcl4,
	--地域名（ロケール５）
	(SELECT mavm_bp_if_all_mavm_area_mst_w_t.area_nm_lcl5
		FROM mavm_area_mst_w mavm_bp_if_all_mavm_area_mst_w_t
		WHERE 0 = 0
		AND	mavm_bp_if_all_mavm_area_mst_w_t.area_cd = mavm_bp_if_all_mavm_bp_mst_t1.area_cd
		AND mavm_bp_if_all_mavm_area_mst_w_t.co_cd =
			CASE (SELECT mavm_bp_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_bp_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_bp_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_bp_if_all_mavm_bp_mst_t1.co_cd
			END
	)	area_nm_lcl5,
	mavm_bp_if_all_mavm_bp_mst_t1.memo1,
	mavm_bp_if_all_mavm_bp_mst_t1.memo2,
	mavm_bp_if_all_mavm_bp_mst_t1.memo3,
	mavm_bp_if_all_mavm_bp_mst_t1.memo4,
	mavm_bp_if_all_mavm_bp_mst_t1.memo5,
	mavm_bp_if_all_mavm_bp_mst_t1.memo6,
	mavm_bp_if_all_mavm_bp_mst_t1.memo7,
	mavm_bp_if_all_mavm_bp_mst_t1.memo8,
	mavm_bp_if_all_mavm_bp_mst_t1.memo9,
	mavm_bp_if_all_mavm_bp_mst_t1.memo10,
	mavm_bp_if_all_mavm_bp_mst_t1.memo11,
	mavm_bp_if_all_mavm_bp_mst_t1.memo12,
	mavm_bp_if_all_mavm_bp_mst_t1.memo13,
	mavm_bp_if_all_mavm_bp_mst_t1.memo14,
	mavm_bp_if_all_mavm_bp_mst_t1.memo15,
	mavm_bp_if_all_mavm_bp_mst_t1.memo16,
	mavm_bp_if_all_mavm_bp_mst_t1.memo17,
	mavm_bp_if_all_mavm_bp_mst_t1.memo18,
	mavm_bp_if_all_mavm_bp_mst_t1.memo19,
	mavm_bp_if_all_mavm_bp_mst_t1.memo20
FROM mavm_bp_mst mavm_bp_if_all_mavm_bp_mst_t1
;
