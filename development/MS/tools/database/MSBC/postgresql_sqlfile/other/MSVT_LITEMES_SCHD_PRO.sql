\encoding UTF-8

CREATE OR REPLACE VIEW msvt_litemes_schd_pro(
	co_cd,
	sa,
	sa_lcl,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	qty,
	tm,
	lot_no,
	sublot_no,
	sno1,
	sno2,
	sno3,
	sno4,
	mfg_loc_cd,
	mfg_str_ln_cd,
	inst_abort_flg,
	mfg_inst_no,
	mfg_inst_rev,
	itm_mfg_inst_no
	)
AS
-- 目標の始点
SELECT
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd,
	'目標' AS sa,
	'GOAL' AS sa_lcl,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub3,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.base_unit_inst_qty - t13.base_unit_mfg_abort_qty AS qty,
	LEAST(msvt_litemes_schd_pro_mst_mfg_inst_all_t11.st_schd_tm, COALESCE(t14.min_st_act_tm, msvt_litemes_schd_pro_mst_mfg_inst_all_t11.st_schd_tm))::TIMESTAMP WITHOUT TIME ZONE AS tm,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.lot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sublot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno3,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno4,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_loc_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_str_ln_cd AS mfg_str_ln_cd,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.abort_flg AS inst_abort_flg,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_rev,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no
FROM
	mst_mfg_inst_all msvt_litemes_schd_pro_mst_mfg_inst_all_t11
	JOIN mst_itm_mfg_inst_all msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd)
	JOIN (SELECT
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_inst_no,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_sts_typ,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.itm_mfg_inst_no,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.base_unit_mfg_abort_qty,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.co_cd
		FROM
			mst_mfg_act_rem_all msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1
		WHERE 0=0
		AND	msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.div_seq = 0
		AND msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_sts_typ IN (fcpa_const$get_const_val('MSC_MFG_STS_TYP','ORD'), fcpa_const$get_const_val('MSC_MFG_STS_TYP','STT'), fcpa_const$get_const_val('MSC_MFG_STS_TYP','CMPL'))
		) t13 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no = t13.mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = t13.co_cd)
	LEFT OUTER JOIN (SELECT
						min(msvt_litemes_schd_pro_mst_oper_act_all_ta1.st_act_tm) min_st_act_tm,
						msvt_litemes_schd_pro_mst_oper_act_all_ta1.itm_mfg_inst_no,
						msvt_litemes_schd_pro_mst_oper_act_all_ta1.co_cd
					FROM
						mst_oper_act_all msvt_litemes_schd_pro_mst_oper_act_all_ta1
					GROUP BY
						msvt_litemes_schd_pro_mst_oper_act_all_ta1.itm_mfg_inst_no,
						msvt_litemes_schd_pro_mst_oper_act_all_ta1.co_cd
		) t14 ON (msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no = t14.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd = t14.co_cd)
WHERE 0=0
AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.can_flg = '0'
-- 目標の終点
UNION ALL
SELECT
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd,
	'目標' AS sa,
	'GOAL' AS sa_lcl,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub3,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.base_unit_inst_qty - t13.base_unit_mfg_abort_qty AS qty,
	CASE GREATEST(msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm, COALESCE(t14.max_end_act_tm, msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm), COALESCE(t15.max_act_tm, msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm))
		WHEN msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm THEN TO_TIMESTAMP(REPLACE(TO_CHAR(GREATEST(msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm, COALESCE(t14.max_end_act_tm, msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm), COALESCE(t15.max_act_tm, msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm)),'YYYY/MM/DD HH24:MI:SS'), '00:00:00', '23:59:00'),'YYYY/MM/DD HH24:MI:SS')
		ELSE GREATEST(msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm, COALESCE(t14.max_end_act_tm, msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm), COALESCE(t15.max_act_tm, msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm))
	END::TIMESTAMP WITHOUT TIME ZONE AS tm,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.lot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sublot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno3,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno4,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_loc_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_str_ln_cd AS mfg_str_ln_cd,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.abort_flg AS inst_abort_flg,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_rev,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no
FROM
	mst_mfg_inst_all msvt_litemes_schd_pro_mst_mfg_inst_all_t11
	JOIN mst_itm_mfg_inst_all msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd)
	JOIN (SELECT
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_inst_no,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_sts_typ,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.itm_mfg_inst_no,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.base_unit_mfg_abort_qty,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.co_cd
		FROM
			mst_mfg_act_rem_all msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1
		WHERE 0=0
		AND	msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.div_seq = 0
		AND msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_sts_typ IN (fcpa_const$get_const_val('MSC_MFG_STS_TYP','ORD'), fcpa_const$get_const_val('MSC_MFG_STS_TYP','STT'), fcpa_const$get_const_val('MSC_MFG_STS_TYP','CMPL'))
		) t13 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no = t13.mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = t13.co_cd)
	LEFT OUTER JOIN (SELECT
						MAX(msvt_litemes_schd_pro_mst_oper_act_all_ta1.end_act_tm) max_end_act_tm,
						msvt_litemes_schd_pro_mst_oper_act_all_ta1.itm_mfg_inst_no,
						msvt_litemes_schd_pro_mst_oper_act_all_ta1.co_cd
					FROM
						mst_oper_act_all msvt_litemes_schd_pro_mst_oper_act_all_ta1
					GROUP BY
						msvt_litemes_schd_pro_mst_oper_act_all_ta1.itm_mfg_inst_no,
						msvt_litemes_schd_pro_mst_oper_act_all_ta1.co_cd
		) t14 ON (msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no = t14.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd = t14.co_cd)
	LEFT OUTER JOIN (SELECT
						MAX(msvt_litemes_schd_pro_mst_yield_act_all_ta2.act_tm) max_act_tm,
						msvt_litemes_schd_pro_mst_yield_act_all_ta2.itm_mfg_inst_no,
						msvt_litemes_schd_pro_mst_yield_act_all_ta2.co_cd
					FROM
						mst_yield_act_all msvt_litemes_schd_pro_mst_yield_act_all_ta2
					GROUP BY
						msvt_litemes_schd_pro_mst_yield_act_all_ta2.itm_mfg_inst_no,
						msvt_litemes_schd_pro_mst_yield_act_all_ta2.co_cd
		) t15 ON (msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no = t15.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd = t15.co_cd)
WHERE 0=0
AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.can_flg = '0'
-- 予定の始点
UNION ALL
SELECT
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd,
	'予定' AS sa,
	'SCHD' AS sa_lcl,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub3,
	0 AS qty,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.st_schd_tm::TIMESTAMP WITHOUT TIME ZONE AS tm,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.lot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sublot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno3,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno4,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_loc_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_str_ln_cd AS mfg_str_ln_cd,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.abort_flg AS inst_abort_flg,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_rev,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no
FROM
	mst_mfg_inst_all msvt_litemes_schd_pro_mst_mfg_inst_all_t11
	JOIN mst_itm_mfg_inst_all msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd)
WHERE 0=0
AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.can_flg = '0'
-- 予定の終点
UNION ALL
SELECT
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd,
	'予定' AS sa,
	'SCHD' AS sa_lcl,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub3,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.base_unit_inst_qty - t13.base_unit_mfg_abort_qty AS qty,
	TO_TIMESTAMP(REPLACE(TO_CHAR(msvt_litemes_schd_pro_mst_mfg_inst_all_t11.end_schd_tm,'YYYY/MM/DD HH24:MI:SS'), '00:00:00', '23:59:00'),'YYYY/MM/DD HH24:MI:SS')::TIMESTAMP WITHOUT TIME ZONE AS tm,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.lot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sublot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno3,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno4,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_loc_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_str_ln_cd AS mfg_str_ln_cd,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.abort_flg AS inst_abort_flg,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_rev,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no
FROM
	mst_mfg_inst_all msvt_litemes_schd_pro_mst_mfg_inst_all_t11
	JOIN mst_itm_mfg_inst_all msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd)
	JOIN (SELECT
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_inst_no,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_sts_typ,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.itm_mfg_inst_no,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.base_unit_mfg_abort_qty,
			msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.co_cd
		FROM
			mst_mfg_act_rem_all msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1
		WHERE 0=0
		AND	msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.div_seq = 0
		AND msvt_litemes_schd_pro_mst_mfg_act_rem_all_t1.mfg_sts_typ IN (fcpa_const$get_const_val('MSC_MFG_STS_TYP','ORD'), fcpa_const$get_const_val('MSC_MFG_STS_TYP','STT'), fcpa_const$get_const_val('MSC_MFG_STS_TYP','CMPL'))
		) t13 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no = t13.mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = t13.co_cd)
WHERE 0=0
AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.can_flg = '0'
-- 実績の始点
UNION ALL
SELECT
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd,
	'実績' AS sa,
	'ACT' AS sa_lcl,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub3,
	0 AS qty,
	t14.min_st_act_tm::TIMESTAMP WITHOUT TIME ZONE AS tm,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.lot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sublot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno3,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno4,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_loc_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_str_ln_cd AS mfg_str_ln_cd,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.abort_flg AS inst_abort_flg,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_rev,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no
FROM
	mst_mfg_inst_all msvt_litemes_schd_pro_mst_mfg_inst_all_t11
	JOIN mst_itm_mfg_inst_all msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd)
	JOIN (SELECT
			min(msvt_litemes_schd_pro_mst_oper_act_all_ta1.st_act_tm) min_st_act_tm,
			msvt_litemes_schd_pro_mst_oper_act_all_ta1.itm_mfg_inst_no,
			msvt_litemes_schd_pro_mst_oper_act_all_ta1.co_cd
		FROM
			mst_oper_act_all msvt_litemes_schd_pro_mst_oper_act_all_ta1
		GROUP BY
			msvt_litemes_schd_pro_mst_oper_act_all_ta1.itm_mfg_inst_no,
			msvt_litemes_schd_pro_mst_oper_act_all_ta1.co_cd
		) t14 ON (msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no = t14.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd = t14.co_cd)
WHERE 0=0
AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.can_flg = '0'
-- 実績データ
UNION ALL
SELECT
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd,
	'実績' AS sa,
	'ACT' AS sa_lcl,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_sub3,
	COALESCE(t15.total_qty,0) AS qty,
	t15.act_tm::TIMESTAMP WITHOUT TIME ZONE AS tm,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.lot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sublot_no,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno1,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno2,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno3,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.sno4,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_loc_cd,
	msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.mfg_str_ln_cd AS mfg_str_ln_cd,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.abort_flg AS inst_abort_flg,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_no,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.mfg_inst_rev,
	msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no
FROM
	mst_mfg_inst_all msvt_litemes_schd_pro_mst_mfg_inst_all_t11
	JOIN mst_itm_mfg_inst_all msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12 ON (msvt_litemes_schd_pro_mst_mfg_inst_all_t11.itm_mfg_inst_no = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.co_cd = msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd)
	JOIN (SELECT
			ta1.itm_mfg_inst_no,
			ta1.co_cd,
			ta1.act_tm,
			ta1.base_unit_qty,
			sum(ta2.base_unit_qty) AS total_qty
		FROM
			(SELECT
				msvt_litemes_schd_pro_mst_yield_act_all_x1.itm_mfg_inst_no,
				msvt_litemes_schd_pro_mst_yield_act_all_x1.co_cd,
				msvt_litemes_schd_pro_mst_yield_act_all_x1.act_tm,
				sum(msvt_litemes_schd_pro_mst_yield_act_all_x1.base_unit_qty) AS base_unit_qty
			FROM
				mst_yield_act_all msvt_litemes_schd_pro_mst_yield_act_all_x1
			GROUP BY
				msvt_litemes_schd_pro_mst_yield_act_all_x1.itm_mfg_inst_no,
				msvt_litemes_schd_pro_mst_yield_act_all_x1.co_cd,
				msvt_litemes_schd_pro_mst_yield_act_all_x1.act_tm) ta1 
			JOIN 
			(SELECT
				msvt_litemes_schd_pro_mst_yield_act_all_x2.itm_mfg_inst_no,
				msvt_litemes_schd_pro_mst_yield_act_all_x2.co_cd,
				msvt_litemes_schd_pro_mst_yield_act_all_x2.act_tm,
				sum(msvt_litemes_schd_pro_mst_yield_act_all_x2.base_unit_qty) AS base_unit_qty
			FROM
				mst_yield_act_all msvt_litemes_schd_pro_mst_yield_act_all_x2
			GROUP BY
				msvt_litemes_schd_pro_mst_yield_act_all_x2.itm_mfg_inst_no,
				msvt_litemes_schd_pro_mst_yield_act_all_x2.co_cd,
				msvt_litemes_schd_pro_mst_yield_act_all_x2.act_tm) ta2 ON (ta1.act_tm >= ta2.act_tm AND ta1.itm_mfg_inst_no = ta2.itm_mfg_inst_no AND ta1.co_cd = ta2.co_cd)
		GROUP BY
			ta1.itm_mfg_inst_no,
			ta1.co_cd,
			ta1.act_tm,
			ta1.base_unit_qty
		ORDER BY
			ta1.act_tm
		) t15 ON (msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.itm_mfg_inst_no = t15.itm_mfg_inst_no AND msvt_litemes_schd_pro_mst_itm_mfg_inst_all_t12.co_cd = t15.co_cd)
WHERE 0=0
AND msvt_litemes_schd_pro_mst_mfg_inst_all_t11.can_flg = '0'
;


