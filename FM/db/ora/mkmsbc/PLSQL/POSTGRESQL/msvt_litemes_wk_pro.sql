CREATE OR REPLACE VIEW msvt_litemes_wk_pro(
	co_cd,
	wk_schd_no,
	mfg_inst_no,
	sa,
	sa_lcl,
	wk_cost_typ,
	wk_cost_typ_lcl,
	wk_cost
	)
AS
-- 予定の工数(数量依存)
SELECT
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.co_cd,
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.wk_schd_no, -- 工数予定NO
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'予定'::text AS sa,
	'SCHD'::text  AS sa_lcl,
	'予定工数(数量依存)'::text  AS wk_cost_typ,
	'SCHD (Qty.-dependent)'::text  AS wk_cost_typ_lcl,
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.wk_cost AS wk_cost -- 予定工数（数量依存）
FROM
	mst_wk_schd_all msvt_litemes_wk_pro_mst_wk_schd_all_t1 -- 工数予定
WHERE 0=0
AND msvt_litemes_wk_pro_mst_wk_schd_all_t1.can_flg = '0'::bpchar
UNION ALL
-- 予定の工数(固定)
SELECT
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.co_cd,
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.wk_schd_no, -- 工数予定NO
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'予定'::text AS sa,
	'SCHD'::text  AS sa_lcl,
	'予定工数(固定)'::text AS wk_cost_typ,
	'SCHD (Constant)'::text AS wk_cost_typ_lcl,
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.fxd_wk_cost AS wk_cost -- 予定工数（固定）
FROM
	mst_wk_schd_all msvt_litemes_wk_pro_mst_wk_schd_all_t1 -- 工数予定
WHERE 0=0
AND msvt_litemes_wk_pro_mst_wk_schd_all_t1.can_flg = '0'::bpchar
UNION ALL
-- 実績の工数
SELECT
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.co_cd,
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.wk_schd_no, -- 工数予定NO
	msvt_litemes_wk_pro_mst_wk_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'実績'::text AS sa,
	'ACT'::text AS sa_lcl,
	'実績工数'::text AS wk_cost_typ,
	'RSLT'::text AS wk_cost_typ_lcl,
	COALESCE(t3.wk_act_cost, (0)::numeric) AS wk_cost -- 工数実績
FROM
	mst_wk_schd_all msvt_litemes_wk_pro_mst_wk_schd_all_t1 -- 工数予定
	LEFT OUTER JOIN (SELECT
						msvt_litemes_wk_pro_mst_wk_act_all_ta2.wk_schd_no,
						msvt_litemes_wk_pro_mst_wk_act_all_ta2.co_cd,
						sum(msvt_litemes_wk_pro_mst_wk_act_all_ta2.wk_cost) wk_act_cost -- 工数実績
					FROM
						mst_wk_act_all msvt_litemes_wk_pro_mst_wk_act_all_ta2 -- 工数実績
					GROUP BY
						msvt_litemes_wk_pro_mst_wk_act_all_ta2.wk_schd_no,
						msvt_litemes_wk_pro_mst_wk_act_all_ta2.co_cd
	) t3 ON (((msvt_litemes_wk_pro_mst_wk_schd_all_t1.wk_schd_no)::text = (t3.wk_schd_no)::text) AND ((msvt_litemes_wk_pro_mst_wk_schd_all_t1.co_cd)::text = (t3.co_cd)::text))
WHERE 0=0
AND msvt_litemes_wk_pro_mst_wk_schd_all_t1.can_flg = '0'::bpchar
;
