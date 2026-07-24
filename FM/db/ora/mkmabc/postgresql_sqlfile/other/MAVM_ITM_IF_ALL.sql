\encoding UTF-8

CREATE OR REPLACE VIEW mavm_itm_if_all(
co_cd,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
itm_nm,
itm_nm_lcl1,
itm_nm_lcl2,
itm_nm_lcl3,
itm_nm_lcl4,
itm_nm_lcl5,
unit_nm,
unit_nm_lcl1,
unit_nm_lcl2,
unit_nm_lcl3,
unit_nm_lcl4,
unit_nm_lcl5,
itm_typ_nm,
itm_typ_nm_lcl1,
itm_typ_nm_lcl2,
itm_typ_nm_lcl3,
itm_typ_nm_lcl4,
itm_typ_nm_lcl5,
itm_typ_d_nm,
itm_typ_d_nm_lcl1,
itm_typ_d_nm_lcl2,
itm_typ_d_nm_lcl3,
itm_typ_d_nm_lcl4,
itm_typ_d_nm_lcl5,
itm_jnl_nm,
itm_jnl_nm_lcl1,
itm_jnl_nm_lcl2,
itm_jnl_nm_lcl3,
itm_jnl_nm_lcl4,
itm_jnl_nm_lcl5,
ac_itm_grp_nm,
ac_itm_grp_nm_lcl1,
ac_itm_grp_nm_lcl2,
ac_itm_grp_nm_lcl3,
ac_itm_grp_nm_lcl4,
ac_itm_grp_nm_lcl5,
itm_grp_cd1,
itm_grp_nm1,
itm_grp_nm1_lcl1,
itm_grp_nm1_lcl2,
itm_grp_nm1_lcl3,
itm_grp_nm1_lcl4,
itm_grp_nm1_lcl5,
itm_grp_cd2,
itm_grp_nm2,
itm_grp_nm2_lcl1,
itm_grp_nm2_lcl2,
itm_grp_nm2_lcl3,
itm_grp_nm2_lcl4,
itm_grp_nm2_lcl5,
itm_grp_cd3,
itm_grp_nm3,
itm_grp_nm3_lcl1,
itm_grp_nm3_lcl2,
itm_grp_nm3_lcl3,
itm_grp_nm3_lcl4,
itm_grp_nm3_lcl5,
itm_grp_cd4,
itm_grp_nm4,
itm_grp_nm4_lcl1,
itm_grp_nm4_lcl2,
itm_grp_nm4_lcl3,
itm_grp_nm4_lcl4,
itm_grp_nm4_lcl5,
itm_grp_cd5,
itm_grp_nm5,
itm_grp_nm5_lcl1,
itm_grp_nm5_lcl2,
itm_grp_nm5_lcl3,
itm_grp_nm5_lcl4,
itm_grp_nm5_lcl5,
itm_grp_cd6,
itm_grp_nm6,
itm_grp_nm6_lcl1,
itm_grp_nm6_lcl2,
itm_grp_nm6_lcl3,
itm_grp_nm6_lcl4,
itm_grp_nm6_lcl5,
itm_grp_cd7,
itm_grp_nm7,
itm_grp_nm7_lcl1,
itm_grp_nm7_lcl2,
itm_grp_nm7_lcl3,
itm_grp_nm7_lcl4,
itm_grp_nm7_lcl5,
itm_grp_cd8,
itm_grp_nm8,
itm_grp_nm8_lcl1,
itm_grp_nm8_lcl2,
itm_grp_nm8_lcl3,
itm_grp_nm8_lcl4,
itm_grp_nm8_lcl5,
itm_grp_cd9,
itm_grp_nm9,
itm_grp_nm9_lcl1,
itm_grp_nm9_lcl2,
itm_grp_nm9_lcl3,
itm_grp_nm9_lcl4,
itm_grp_nm9_lcl5,
itm_grp_cd10,
itm_grp_nm10,
itm_grp_nm10_lcl1,
itm_grp_nm10_lcl2,
itm_grp_nm10_lcl3,
itm_grp_nm10_lcl4,
itm_grp_nm10_lcl5,
memo1,
memo2,
memo3
)
AS
WITH mavm_itm_typ_d_mst_w AS (
	SELECT * FROM mavm_itm_typ_d_mst
),
mavm_itm_jnl_mst_w AS (
	SELECT * FROM mavm_itm_jnl_mst
),
mavm_ac_itm_grp_mst_w AS (
	SELECT * FROM mavm_ac_itm_grp_mst
),
mavm_itm_grp_mst_w AS (
	SELECT * FROM mavm_itm_grp_mst
),
mavm_unit_mst_w AS (
	SELECT * FROM mavm_unit_mst
)
SELECT
	--会社ＣＤ
	mavm_itm_if_all_mavm_itm_mst_t1.co_cd,
	--品目ＣＤ
	mavm_itm_if_all_mavm_itm_mst_t1.itm_cd,
	--枝番１
	mavm_itm_if_all_mavm_itm_mst_t1.itm_sub1,
	--枝番２
	mavm_itm_if_all_mavm_itm_mst_t1.itm_sub2,
	--枝番３
	mavm_itm_if_all_mavm_itm_mst_t1.itm_sub3,
	--品目名
	mavm_itm_if_all_mavm_itm_mst_t1.itm_nm,
	--品目名（ロケール１）
	mavm_itm_if_all_mavm_itm_mst_t1.itm_nm_lcl1,
	--品目名（ロケール２） 
	mavm_itm_if_all_mavm_itm_mst_t1.itm_nm_lcl2,
	--品目名（ロケール３） 
	mavm_itm_if_all_mavm_itm_mst_t1.itm_nm_lcl3,	
	--品目名（ロケール４） 
	mavm_itm_if_all_mavm_itm_mst_t1.itm_nm_lcl4,	
	--品目名（ロケール５） 
	mavm_itm_if_all_mavm_itm_mst_t1.itm_nm_lcl5,
	--単位名
	(SELECT mavm_itm_if_all_mavm_unit_mst_w_t.unit_nm
		FROM mavm_unit_mst_w mavm_itm_if_all_mavm_unit_mst_w_t
		WHERE 0 =0
		AND mavm_itm_if_all_mavm_unit_mst_w_t.unit_cd = mavm_itm_if_all_mavm_itm_mst_t1.unit_cd
		AND mavm_itm_if_all_mavm_unit_mst_w_t.co_cd =  mavm_itm_if_all_mavm_itm_mst_t1.co_cd
	)	unit_nm,
	--単位名（ロケール１）
	(SELECT mavm_itm_if_all_mavm_unit_mst_w_t.unit_nm_lcl1
		FROM mavm_unit_mst_w mavm_itm_if_all_mavm_unit_mst_w_t
		WHERE 0 =0
		AND mavm_itm_if_all_mavm_unit_mst_w_t.unit_cd = mavm_itm_if_all_mavm_itm_mst_t1.unit_cd
		AND mavm_itm_if_all_mavm_unit_mst_w_t.co_cd =  mavm_itm_if_all_mavm_itm_mst_t1.co_cd
	)	unit_nm_lcl1,
	--単位名（ロケール２）
	(SELECT mavm_itm_if_all_mavm_unit_mst_w_t.unit_nm_lcl2
		FROM mavm_unit_mst_w mavm_itm_if_all_mavm_unit_mst_w_t
		WHERE 0 =0
		AND mavm_itm_if_all_mavm_unit_mst_w_t.unit_cd = mavm_itm_if_all_mavm_itm_mst_t1.unit_cd
		AND mavm_itm_if_all_mavm_unit_mst_w_t.co_cd =  mavm_itm_if_all_mavm_itm_mst_t1.co_cd
	)	unit_nm_lcl2,
	--単位名（ロケール３）
	(SELECT mavm_itm_if_all_mavm_unit_mst_w_t.unit_nm_lcl3
		FROM mavm_unit_mst_w mavm_itm_if_all_mavm_unit_mst_w_t
		WHERE 0 =0
		AND mavm_itm_if_all_mavm_unit_mst_w_t.unit_cd = mavm_itm_if_all_mavm_itm_mst_t1.unit_cd
		AND mavm_itm_if_all_mavm_unit_mst_w_t.co_cd =  mavm_itm_if_all_mavm_itm_mst_t1.co_cd
	)	unit_nm_lcl3,
	--単位名（ロケール４）
	(SELECT mavm_itm_if_all_mavm_unit_mst_w_t.unit_nm_lcl4
		FROM mavm_unit_mst_w mavm_itm_if_all_mavm_unit_mst_w_t
		WHERE 0 =0
		AND mavm_itm_if_all_mavm_unit_mst_w_t.unit_cd = mavm_itm_if_all_mavm_itm_mst_t1.unit_cd
		AND mavm_itm_if_all_mavm_unit_mst_w_t.co_cd =  mavm_itm_if_all_mavm_itm_mst_t1.co_cd
	)	unit_nm_lcl4,
	--単位名（ロケール５）
	(SELECT mavm_itm_if_all_mavm_unit_mst_w_t.unit_nm_lcl5
		FROM mavm_unit_mst_w mavm_itm_if_all_mavm_unit_mst_w_t
		WHERE 0 =0
		AND mavm_itm_if_all_mavm_unit_mst_w_t.unit_cd = mavm_itm_if_all_mavm_itm_mst_t1.unit_cd
		AND mavm_itm_if_all_mavm_unit_mst_w_t.co_cd =  mavm_itm_if_all_mavm_itm_mst_t1.co_cd
	)	unit_nm_lcl5,
	--品目区分名
	fcpa_const$str2name('MAC_ITM_TYP', mavm_itm_if_all_mavm_itm_mst_t1.itm_typ, NULL) itm_typ_nm,
	--品目区分名（ロケール１）
	fcpa_const$str2name('MAC_ITM_TYP', mavm_itm_if_all_mavm_itm_mst_t1.itm_typ, 'ja_JP') itm_typ_nm_lcl1,
	--品目区分名（ロケール２）
	fcpa_const$str2name('MAC_ITM_TYP', mavm_itm_if_all_mavm_itm_mst_t1.itm_typ, 'en_US') itm_typ_nm_lcl2,
	--品目区分名（ロケール３）
	fcpa_const$str2name('MAC_ITM_TYP', mavm_itm_if_all_mavm_itm_mst_t1.itm_typ, 'TBD3') itm_typ_nm_lcl3,
	--品目区分名（ロケール４）
	fcpa_const$str2name('MAC_ITM_TYP', mavm_itm_if_all_mavm_itm_mst_t1.itm_typ, 'TBD4') itm_typ_nm_lcl4,
	--品目区分名（ロケール５）
	fcpa_const$str2name('MAC_ITM_TYP', mavm_itm_if_all_mavm_itm_mst_t1.itm_typ, 'TBD5') itm_typ_nm_lcl5,
	--品目区分詳細名
	(SELECT mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_nm
		FROM mavm_itm_typ_d_mst_w mavm_itm_if_all_mavm_itm_typ_d_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ_d_cd
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_TYP_D')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_typ_d_nm,
	--品目区分詳細名（ロケール１）
	(SELECT mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_nm_lcl1
		FROM mavm_itm_typ_d_mst_w mavm_itm_if_all_mavm_itm_typ_d_mst_w_t
		WHERE  0=0
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ_d_cd
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_TYP_D')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_typ_d_nm_lcl1,
	--品目区分詳細名（ロケール２）
	(SELECT mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_nm_lcl2
		FROM mavm_itm_typ_d_mst_w mavm_itm_if_all_mavm_itm_typ_d_mst_w_t
		WHERE  0=0
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ_d_cd
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_TYP_D')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_typ_d_nm_lcl2,
	--品目区分詳細名（ロケール３）
	(SELECT mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_nm_lcl3
		FROM mavm_itm_typ_d_mst_w mavm_itm_if_all_mavm_itm_typ_d_mst_w_t
		WHERE  0=0
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ_d_cd
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_TYP_D')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_typ_d_nm_lcl3,
	--品目区分詳細名（ロケール４）
	(SELECT mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_nm_lcl4
		FROM mavm_itm_typ_d_mst_w mavm_itm_if_all_mavm_itm_typ_d_mst_w_t
		WHERE  0=0
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ_d_cd
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_TYP_D')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_typ_d_nm_lcl4,
	--品目区分詳細名（ロケール５）
	(SELECT mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_nm_lcl5
		FROM mavm_itm_typ_d_mst_w mavm_itm_if_all_mavm_itm_typ_d_mst_w_t
		WHERE  0=0
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.itm_typ_d_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_typ_d_cd
		AND mavm_itm_if_all_mavm_itm_typ_d_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_TYP_D')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_typ_d_nm_lcl5,
	--品目仕訳名
	(SELECT mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_nm
		FROM mavm_itm_jnl_mst_w mavm_itm_if_all_mavm_itm_jnl_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_jnl_cd
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_jnl_nm,
	--品目仕訳名（ロケール１）
	(SELECT mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_nm_lcl1
		FROM mavm_itm_jnl_mst_w mavm_itm_if_all_mavm_itm_jnl_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_jnl_cd
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_jnl_nm_lcl1,
	--品目仕訳名（ロケール２）
	(SELECT mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_nm_lcl2
		FROM mavm_itm_jnl_mst_w mavm_itm_if_all_mavm_itm_jnl_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_jnl_cd
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_jnl_nm_lcl2,
	--品目仕訳名（ロケール３）
	(SELECT mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_nm_lcl3
		FROM mavm_itm_jnl_mst_w mavm_itm_if_all_mavm_itm_jnl_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_jnl_cd
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_jnl_nm_lcl3,
	--品目仕訳名（ロケール４）
	(SELECT mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_nm_lcl4
		FROM mavm_itm_jnl_mst_w mavm_itm_if_all_mavm_itm_jnl_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_jnl_cd
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_jnl_nm_lcl4,
	--品目仕訳名（ロケール５）
	(SELECT mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_nm_lcl5
		FROM mavm_itm_jnl_mst_w mavm_itm_if_all_mavm_itm_jnl_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.itm_jnl_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_jnl_cd
		AND mavm_itm_if_all_mavm_itm_jnl_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_JNL')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_jnl_nm_lcl5,
	--会計品目分類名
	(SELECT mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_nm
		FROM mavm_ac_itm_grp_mst_w mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.ac_itm_grp_cd
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	ac_itm_grp_nm,
	--会計品目分類名（ロケール１）
	(SELECT mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_nm_lcl1
		FROM mavm_ac_itm_grp_mst_w mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.ac_itm_grp_cd
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	ac_itm_grp_nm_lcl1,
	--会計品目分類名（ロケール２）
	(SELECT mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_nm_lcl2
		FROM mavm_ac_itm_grp_mst_w mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.ac_itm_grp_cd
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	ac_itm_grp_nm_lcl2,
	--会計品目分類名（ロケール３）
	(SELECT mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_nm_lcl3
		FROM mavm_ac_itm_grp_mst_w mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.ac_itm_grp_cd
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	ac_itm_grp_nm_lcl3,
	--会計品目分類名（ロケール４）
	(SELECT mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_nm_lcl4
		FROM mavm_ac_itm_grp_mst_w mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.ac_itm_grp_cd
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	ac_itm_grp_nm_lcl4,
	--会計品目分類名（ロケール５）
	(SELECT mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_nm_lcl5
		FROM mavm_ac_itm_grp_mst_w mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.ac_itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.ac_itm_grp_cd
		AND mavm_itm_if_all_mavm_ac_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	ac_itm_grp_nm_lcl5,
	--品目分類ＣＤ１
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd1,
	--品目分類名１
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd1
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm1,
	--品目分類名１（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd1
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm1_lcl1,
	--品目分類名１（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd1
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm1_lcl2,
	--品目分類名１（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd1
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm1_lcl3,
	--品目分類名１（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd1
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm1_lcl4,
	--品目分類名１（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd1
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm1_lcl5,
	--品目分類ＣＤ２
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd2,
	--品目分類名２
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd2
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm2,
	--品目分類名２（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd2
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm2_lcl1,
	--品目分類名２（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd2
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm2_lcl2,
	--品目分類名２（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd2
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm2_lcl3,
	--品目分類名２（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd2
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm2_lcl4,
	--品目分類名２（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd2
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm2_lcl5,
	--品目分類ＣＤ３
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd3,
	--品目分類名３
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd3
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm3,
	--品目分類名３（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd3
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm3_lcl1,
	--品目分類名３（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd3
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm3_lcl2,
	--品目分類名３（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd3
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm3_lcl3,
	--品目分類名３（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd3
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm3_lcl4,
	--品目分類名３（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd3
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm3_lcl5,
	--品目分類ＣＤ４
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd4,
	--品目分類名４
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd4
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm4,
	--品目分類名４（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd4
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm4_lcl1,
	--品目分類名４（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd4
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm4_lcl2,
	--品目分類名４（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd4
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm4_lcl3,
	--品目分類名４（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd4
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm4_lcl4,
	--品目分類名４（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd4
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm4_lcl5,
	--品目分類ＣＤ５
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd5,
	--品目分類名５
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd5
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm5,
	--品目分類名５（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd5
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm5_lcl1,
	--品目分類名５（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd5
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm5_lcl2,
	--品目分類名５（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd5
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm5_lcl3,
	--品目分類名５（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd5
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm5_lcl4,
	--品目分類名５（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd5
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm5_lcl5,
	--品目分類ＣＤ６
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd6,
	--品目分類名６
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd6
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm6,
	--品目分類名６（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd6
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm6_lcl1,
	--品目分類名６（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd6
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm6_lcl2,
	--品目分類名６（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd6
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm6_lcl3,
	--品目分類名６（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd6
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm6_lcl4,
	--品目分類名６（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd6
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm6_lcl5,
-- 	--品目分類ＣＤ７
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd7,
	--品目分類名７
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd7
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm7,
	--品目分類名７（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd7
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm7_lcl1,
	--品目分類名７（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd7
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm7_lcl2,
	--品目分類名７（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd7
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm7_lcl3,
-- 	品目分類名７（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd7
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm7_lcl4,
	--品目分類名７（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd7
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm7_lcl5,
	--品目分類ＣＤ８
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd8,
	--品目分類名８
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd8
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm8,
	--品目分類名８（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd8
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm8_lcl1,
	--品目分類名８（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd8
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm8_lcl2,
	--品目分類名８（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd8
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm8_lcl3,
	--品目分類名８（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd8
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm8_lcl4,
	--品目分類名８（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd8
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm8_lcl5,
	--品目分類ＣＤ９
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd9,
	--品目分類名９
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd9
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm9,
	--品目分類名９（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd9
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm9_lcl1,
	--品目分類名９（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd9
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm9_lcl2,
	--品目分類名９（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd9
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm9_lcl3,
	--品目分類名９（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd9
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm9_lcl4,
	--品目分類名９（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd9
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm9_lcl5,
	--品目分類ＣＤ１０
	mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd10,
	--品目分類名１０
	(SELECT itm_grp_nm 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd10
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm10,
	--品目分類名１０（ロケール１）
	(SELECT itm_grp_nm_lcl1 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd10
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm10_lcl1,
	--品目分類名１０（ロケール２）
	(SELECT itm_grp_nm_lcl2 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd10
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm10_lcl2,
	--品目分類名１０（ロケール３）
	(SELECT itm_grp_nm_lcl3 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd10
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm10_lcl3,
	--品目分類名１０（ロケール４）
	(SELECT itm_grp_nm_lcl4 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd10
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm10_lcl4,
	--品目分類名１０（ロケール５）
	(SELECT itm_grp_nm_lcl5 
		FROM mavm_itm_grp_mst_w mavm_itm_if_all_mavm_itm_grp_mst_w_t
		WHERE 0=0
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10')
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.itm_grp_cd = mavm_itm_if_all_mavm_itm_mst_t1.itm_grp_cd10
		AND mavm_itm_if_all_mavm_itm_grp_mst_w_t.co_cd = 
			CASE (SELECT mavm_itm_if_all_mam_mst_ctl_t.mst_set_typ
					FROM mam_mst_ctl mavm_itm_if_all_mam_mst_ctl_t
					WHERE 0=0
					AND	mavm_itm_if_all_mam_mst_ctl_t.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM_GRP')
				)
			WHEN fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') THEN fcpa_const$get_const_val('MAC_STR','NULL_VAL')
			ELSE mavm_itm_if_all_mavm_itm_mst_t1.co_cd
			END
	)	itm_grp_nm10_lcl5,
	mavm_itm_if_all_mavm_itm_mst_t1.memo1,
	mavm_itm_if_all_mavm_itm_mst_t1.memo2,
	mavm_itm_if_all_mavm_itm_mst_t1.memo3
FROM mavm_itm_mst mavm_itm_if_all_mavm_itm_mst_t1 
;;

