WITH mavm_expns_grp_mst_w AS (
	SELECT * FROM mavm_expns_grp_mst
)
SELECT
	--会社ＣＤ
	t.co_cd,
	--費目ＣＤ
	t.expns_cd,
	--費目名
	t.expns_nm,
	--費目名（ロケール１）
	t.expns_nm_lcl1,
	--費目名（ロケール２） 
	t.expns_nm_lcl2,
	--費目名（ロケール３） 
	t.expns_nm_lcl3,
	--費目名（ロケール４） 
	t.expns_nm_lcl4,
	--費目名（ロケール５） 
	t.expns_nm_lcl5,
	--費目グループ名
	t.expns_grp_nm,
	--費目グループ名（ロケール１）
	t.expns_grp_nm_lcl1,
	--費目グループ名（ロケール２）
	t.expns_grp_nm_lcl2,
	--費目グループ名（ロケール３）
	t.expns_grp_nm_lcl3,
	--費目グループ名（ロケール４）
	t.expns_grp_nm_lcl4,
	--費目グループ名（ロケール５）
	t.expns_grp_nm_lcl5,
	--表示順（費目グループ）
	t.expns_grp_seq,
	--費目区分
	t.expns_typ,
	--費目区分名
	t.expns_typ_nm,
	--費目区分名（ロケール１）
	t.expns_typ_nm_lcl1,
	--費目区分名（ロケール２）
	t.expns_typ_nm_lcl2,
	--費目区分名（ロケール３）
	t.expns_typ_nm_lcl3,
	--費目区分名（ロケール４）
	t.expns_typ_nm_lcl4,
	--費目区分名（ロケール５）
	t.expns_typ_nm_lcl5,
	--直間区分
	t.direct_typ,
	--直間区分名
	t.direct_typ_nm,
	--直間区分名（ロケール１）
	t.direct_typ_nm_lcl1,
	--直間区分名（ロケール２）
	t.direct_typ_nm_lcl2,
	--直間区分名（ロケール３）
	t.direct_typ_nm_lcl3,
	--直間区分名（ロケール４）
	t.direct_typ_nm_lcl4,
	--直間区分名（ロケール５）
	t.direct_typ_nm_lcl5,
	--固変区分
	t.var_typ,
	--固変区分名
	t.var_typ_nm,
	--固変区分名（ロケール１）
	t.var_typ_nm_lcl1,
	--固変区分名（ロケール２）
	t.var_typ_nm_lcl2,
	--固変区分名（ロケール３）
	t.var_typ_nm_lcl3,
	--固変区分名（ロケール４）
	t.var_typ_nm_lcl4,
	--固変区分名（ロケール５）
	t.var_typ_nm_lcl5,
	--表示順（費目）
	t.expns_seq,
	RANK() OVER(PARTITION BY t.co_cd ORDER BY t.expns_grp_seq, t.expns_grp_cd, t.expns_seq, t.expns_cd) AS seq,
	t.memo1,
	t.memo2,
	t.memo3
FROM(
	SELECT
		--会社ＣＤ
		mavm_expns_if_all_mavm_expns_mst_t1.co_cd,
		--費目ＣＤ
		mavm_expns_if_all_mavm_expns_mst_t1.expns_cd,
		--費目名
		mavm_expns_if_all_mavm_expns_mst_t1.expns_nm,
		--費目名（ロケール１）
		mavm_expns_if_all_mavm_expns_mst_t1.expns_nm_lcl1,
		--費目名（ロケール２） 
		mavm_expns_if_all_mavm_expns_mst_t1.expns_nm_lcl2,
		--費目名（ロケール３） 
		mavm_expns_if_all_mavm_expns_mst_t1.expns_nm_lcl3,
		--費目名（ロケール４） 
		mavm_expns_if_all_mavm_expns_mst_t1.expns_nm_lcl4,
		--費目名（ロケール５） 
		mavm_expns_if_all_mavm_expns_mst_t1.expns_nm_lcl5,
		--費目グループＣＤ
		(SELECT mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd
			FROM mavm_expns_grp_mst_w mavm_expns_if_all_mavm_expns_grp_mst_w_t
			WHERE 0 =0
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd = mavm_expns_if_all_mavm_expns_mst_t1.expns_grp_cd
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.co_cd = 
				CASE (SELECT mavm_expns_if_all_mam_mst_ctl_t.mst_set_typ
						FROM mam_mst_ctl mavm_expns_if_all_mam_mst_ctl_t
						WHERE 0=0
						AND	mavm_expns_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS_GRP')
					)
				WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
				ELSE mavm_expns_if_all_mavm_expns_mst_t1.co_cd
				END
		)	expns_grp_cd,
		--費目グループ名
		(SELECT mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_nm
			FROM mavm_expns_grp_mst_w mavm_expns_if_all_mavm_expns_grp_mst_w_t
			WHERE 0 =0
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd = mavm_expns_if_all_mavm_expns_mst_t1.expns_grp_cd
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.co_cd = 
				CASE (SELECT mavm_expns_if_all_mam_mst_ctl_t.mst_set_typ
						FROM mam_mst_ctl mavm_expns_if_all_mam_mst_ctl_t
						WHERE 0=0
						AND	mavm_expns_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS_GRP')
					)
				WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
				ELSE mavm_expns_if_all_mavm_expns_mst_t1.co_cd
				END
		)	expns_grp_nm,
		--費目グループ名（ロケール１）
		(SELECT mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_nm_lcl1
			FROM mavm_expns_grp_mst_w mavm_expns_if_all_mavm_expns_grp_mst_w_t
			WHERE 0 =0
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd = mavm_expns_if_all_mavm_expns_mst_t1.expns_grp_cd
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.co_cd = 
				CASE (SELECT mavm_expns_if_all_mam_mst_ctl_t.mst_set_typ
						FROM mam_mst_ctl mavm_expns_if_all_mam_mst_ctl_t
						WHERE 0=0
						AND	mavm_expns_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS_GRP')
					)
				WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
				ELSE mavm_expns_if_all_mavm_expns_mst_t1.co_cd
				END
		)	expns_grp_nm_lcl1,
		--費目グループ名（ロケール２）
		(SELECT mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_nm_lcl2
			FROM mavm_expns_grp_mst_w mavm_expns_if_all_mavm_expns_grp_mst_w_t
			WHERE 0 =0
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd = mavm_expns_if_all_mavm_expns_mst_t1.expns_grp_cd
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.co_cd = 
				CASE (SELECT mavm_expns_if_all_mam_mst_ctl_t.mst_set_typ
						FROM mam_mst_ctl mavm_expns_if_all_mam_mst_ctl_t
						WHERE 0=0
						AND	mavm_expns_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS_GRP')
					)
				WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
				ELSE mavm_expns_if_all_mavm_expns_mst_t1.co_cd
				END
		)	expns_grp_nm_lcl2,
		--費目グループ名（ロケール３）
		(SELECT mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_nm_lcl3
			FROM mavm_expns_grp_mst_w mavm_expns_if_all_mavm_expns_grp_mst_w_t
			WHERE 0 =0
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd = mavm_expns_if_all_mavm_expns_mst_t1.expns_grp_cd
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.co_cd = 
				CASE (SELECT mavm_expns_if_all_mam_mst_ctl_t.mst_set_typ
						FROM mam_mst_ctl mavm_expns_if_all_mam_mst_ctl_t
						WHERE 0=0
						AND	mavm_expns_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS_GRP')
					)
				WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
				ELSE mavm_expns_if_all_mavm_expns_mst_t1.co_cd
				END
		)	expns_grp_nm_lcl3,
		--費目グループ名（ロケール４）
		(SELECT mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_nm_lcl4
			FROM mavm_expns_grp_mst_w mavm_expns_if_all_mavm_expns_grp_mst_w_t
			WHERE 0 =0
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd = mavm_expns_if_all_mavm_expns_mst_t1.expns_grp_cd
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.co_cd = 
				CASE (SELECT mavm_expns_if_all_mam_mst_ctl_t.mst_set_typ
						FROM mam_mst_ctl mavm_expns_if_all_mam_mst_ctl_t
						WHERE 0=0
						AND	mavm_expns_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS_GRP')
					)
				WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
				ELSE mavm_expns_if_all_mavm_expns_mst_t1.co_cd
				END
		)	expns_grp_nm_lcl4,
		--費目グループ名（ロケール５）
		(SELECT mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_nm_lcl5
			FROM mavm_expns_grp_mst_w mavm_expns_if_all_mavm_expns_grp_mst_w_t
			WHERE 0 =0
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd = mavm_expns_if_all_mavm_expns_mst_t1.expns_grp_cd
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.co_cd = 
				CASE (SELECT mavm_expns_if_all_mam_mst_ctl_t.mst_set_typ
						FROM mam_mst_ctl mavm_expns_if_all_mam_mst_ctl_t
						WHERE 0=0
						AND	mavm_expns_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS_GRP')
					)
				WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
				ELSE mavm_expns_if_all_mavm_expns_mst_t1.co_cd
				END
		)	expns_grp_nm_lcl5,
		--表示順（費目グループ）
		(SELECT mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_seq
			FROM mavm_expns_grp_mst_w mavm_expns_if_all_mavm_expns_grp_mst_w_t
			WHERE 0 =0
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.expns_grp_cd = mavm_expns_if_all_mavm_expns_mst_t1.expns_grp_cd
			AND mavm_expns_if_all_mavm_expns_grp_mst_w_t.co_cd = 
				CASE (SELECT mavm_expns_if_all_mam_mst_ctl_t.mst_set_typ
						FROM mam_mst_ctl mavm_expns_if_all_mam_mst_ctl_t
						WHERE 0=0
						AND	mavm_expns_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_EXPNS_GRP')
					)
				WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
				ELSE mavm_expns_if_all_mavm_expns_mst_t1.co_cd
				END
		)	expns_grp_seq,
		--費目区分
		mavm_expns_if_all_mavm_expns_mst_t1.expns_typ,
		--費目区分名
		fcpa_const$str2name('MAC_EXPNS_TYP', mavm_expns_if_all_mavm_expns_mst_t1.expns_typ, NULL) expns_typ_nm,
		--費目区分名（ロケール１）
		fcpa_const$str2name('MAC_EXPNS_TYP', mavm_expns_if_all_mavm_expns_mst_t1.expns_typ, 'ja_JP') expns_typ_nm_lcl1,
		--費目区分名（ロケール２）
		fcpa_const$str2name('MAC_EXPNS_TYP', mavm_expns_if_all_mavm_expns_mst_t1.expns_typ, 'en_US') expns_typ_nm_lcl2,
		--費目区分名（ロケール３）
		fcpa_const$str2name('MAC_EXPNS_TYP', mavm_expns_if_all_mavm_expns_mst_t1.expns_typ, 'TBD3') expns_typ_nm_lcl3,
		--費目区分名（ロケール４）
		fcpa_const$str2name('MAC_EXPNS_TYP', mavm_expns_if_all_mavm_expns_mst_t1.expns_typ, 'TBD4') expns_typ_nm_lcl4,
		--費目区分名（ロケール５）
		fcpa_const$str2name('MAC_EXPNS_TYP', mavm_expns_if_all_mavm_expns_mst_t1.expns_typ, 'TBD5') expns_typ_nm_lcl5,
		--直間区分
		mavm_expns_if_all_mavm_expns_mst_t1.direct_typ,
		--直間区分名
		fcpa_const$str2name('MAC_DIRECT_TYP', mavm_expns_if_all_mavm_expns_mst_t1.direct_typ, NULL) direct_typ_nm,
		--直間区分名（ロケール１）
		fcpa_const$str2name('MAC_DIRECT_TYP', mavm_expns_if_all_mavm_expns_mst_t1.direct_typ, 'ja_JP') direct_typ_nm_lcl1,
		--直間区分名（ロケール２）
		fcpa_const$str2name('MAC_DIRECT_TYP', mavm_expns_if_all_mavm_expns_mst_t1.direct_typ, 'en_US') direct_typ_nm_lcl2,
		--直間区分名（ロケール３）
		fcpa_const$str2name('MAC_DIRECT_TYP', mavm_expns_if_all_mavm_expns_mst_t1.direct_typ, 'TBD3') direct_typ_nm_lcl3,
		--直間区分名（ロケール４）
		fcpa_const$str2name('MAC_DIRECT_TYP', mavm_expns_if_all_mavm_expns_mst_t1.direct_typ, 'TBD4') direct_typ_nm_lcl4,
		--直間区分名（ロケール５）
		fcpa_const$str2name('MAC_DIRECT_TYP', mavm_expns_if_all_mavm_expns_mst_t1.direct_typ, 'TBD5') direct_typ_nm_lcl5,
		--固変区分
		mavm_expns_if_all_mavm_expns_mst_t1.var_typ,
		--固変区分名
		fcpa_const$str2name('MAC_VAR_TYP', mavm_expns_if_all_mavm_expns_mst_t1.var_typ, NULL) var_typ_nm,
		--固変区分名（ロケール１）
		fcpa_const$str2name('MAC_VAR_TYP', mavm_expns_if_all_mavm_expns_mst_t1.var_typ, 'ja_JP') var_typ_nm_lcl1,
		--固変区分名（ロケール２）
		fcpa_const$str2name('MAC_VAR_TYP', mavm_expns_if_all_mavm_expns_mst_t1.var_typ, 'en_US') var_typ_nm_lcl2,
		--固変区分名（ロケール３）
		fcpa_const$str2name('MAC_VAR_TYP', mavm_expns_if_all_mavm_expns_mst_t1.var_typ, 'TBD3') var_typ_nm_lcl3,
		--固変区分名（ロケール４）
		fcpa_const$str2name('MAC_VAR_TYP', mavm_expns_if_all_mavm_expns_mst_t1.var_typ, 'TBD4') var_typ_nm_lcl4,
		--固変区分名（ロケール５）
		fcpa_const$str2name('MAC_VAR_TYP', mavm_expns_if_all_mavm_expns_mst_t1.var_typ, 'TBD5') var_typ_nm_lcl5,
		--表示順（費目）
		mavm_expns_if_all_mavm_expns_mst_t1.expns_seq,
		mavm_expns_if_all_mavm_expns_mst_t1.memo1,
		mavm_expns_if_all_mavm_expns_mst_t1.memo2,
		mavm_expns_if_all_mavm_expns_mst_t1.memo3
	FROM mavm_expns_mst mavm_expns_if_all_mavm_expns_mst_t1 
) t
;
