WITH RECURSIVE t1 AS (
	SELECT m1.co_cd, m1.term, m1.par_dpt_cd, m1.dpt_cd, m1.memo1, m1.memo2, m1.memo3
	FROM mam_dpt_config_all m1
	WHERE 0=0
	AND m1.del_flg = '0'
	AND m1.dpt_cd IS NOT NULL
	AND (
		EXISTS (
			SELECT 'X'
			FROM mam_mst_ctl x
			WHERE 0=0
			AND x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_CONFIG')
			AND x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'COM')
		)
		OR
		NOT EXISTS (
			SELECT 'X'
			FROM mam_mst_ctl x
			WHERE 0=0
			AND x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_CONFIG')
		)
	)
-- 1番上の階層についてレコード追加
	UNION ALL
	SELECT DISTINCT m2.co_cd, m2.term, NULL AS par_dpt_cd, m2.par_dpt_cd AS dpt_cd, m2.memo1, m2.memo2, m2.memo3
	FROM mam_dpt_config_all m2
	WHERE 0=0
	AND m2.del_flg = '0'
	AND NOT EXISTS (
		SELECT *
		FROM mam_dpt_config_all m3
		WHERE 0=0
		AND m2.par_dpt_cd = m3.dpt_cd
		AND m2.term = m3.term
		AND m2.co_cd = m3.co_cd
		AND m3.del_flg = '0'
	)
	AND m2.dpt_cd IS NOT NULL
	AND (
		EXISTS (
			SELECT 'X'
			FROM mam_mst_ctl x
			WHERE 0=0
			AND x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_CONFIG')
			AND x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'COM')
		)
		OR
		NOT EXISTS (
			SELECT 'X'
			FROM mam_mst_ctl x
			WHERE 0=0
			AND x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_CONFIG')
		)
	)
--cmnの結合
	UNION ALL
	SELECT m5.co_cd, m4.term, m4.par_dpt_cd, m4.dpt_cd, m4.memo1, m4.memo2, m4.memo3
	FROM mam_dpt_config_cmn m4, mam_co_all m5
	WHERE 0=0
	AND m4.del_flg = '0'
	AND m4.dpt_cd IS NOT NULL
	AND (
		EXISTS (
			SELECT 'X'
			FROM mam_mst_ctl x
			WHERE 0=0
			AND x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_CONFIG')
			AND x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM')
		)
	)
-- 1番上の階層についてレコード追加
	UNION ALL
	SELECT DISTINCT m7.co_cd, m6.term, NULL AS par_dpt_cd, m6.par_dpt_cd AS dpt_cd, m6.memo1, m6.memo2, m6.memo3
	FROM mam_dpt_config_cmn m6, mam_co_all m7
	WHERE 0=0
	AND m6.del_flg = '0'
	AND NOT EXISTS (
		SELECT *
		FROM mam_dpt_config_cmn m8
		WHERE 0=0
		AND m6.par_dpt_cd = m8.dpt_cd
		AND m6.term = m8.term
		AND m8.del_flg = '0'
	)
	AND m6.dpt_cd IS NOT NULL
	AND (
		EXISTS (
			SELECT 'X'
			FROM mam_mst_ctl x
			WHERE 0=0
			AND x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_DPT_CONFIG')
			AND x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM')
		)
	)
), rec(co_cd, dpt_cd, term, par_dpt_cd, path, memo1, memo2, memo3) AS (
	SELECT t1.co_cd, t1.dpt_cd, t1.term, t1.par_dpt_cd, ARRAY[t1.dpt_cd]::varchar[], t1.memo1, t1.memo2, t1.memo3
	FROM t1
	WHERE 0=0
	AND t1.par_dpt_cd IS NULL
	UNION ALL
	SELECT t1.co_cd, t1.dpt_cd, t1.term, t1.par_dpt_cd, array_append(path, t1.dpt_cd), t1.memo1, t1.memo2, t1.memo3
	FROM rec JOIN t1 ON rec.dpt_cd = t1.par_dpt_cd
		AND rec.co_cd = t1.co_cd
		AND rec.term = t1.term
	WHERE NOT (t1.dpt_cd = ANY(rec.path))
)
SELECT co_cd, dpt_cd, term, path[1] AS lv01_dpt_cd, path[2] AS lv02_dpt_cd, 
	path[3] AS lv03_dpt_cd, path[4] AS lv04_dpt_cd, path[5] AS lv05_dpt_cd,
	path[6] AS lv06_dpt_cd, path[7] AS lv07_dpt_cd, path[8] AS lv08_dpt_cd,
	path[9] AS lv09_dpt_cd, path[10] AS lv10_dpt_cd, memo1, memo2, memo3
FROM rec 
;
