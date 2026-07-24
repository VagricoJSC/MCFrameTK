\encoding UTF-8

CREATE OR REPLACE VIEW msvt_litemes_inpt_pro(
	co_cd,
	inpt_schd_no,
	mfg_inst_no,
	sa,
	sa_lcl,
	qty_typ,
	qty_typ_lcl,
	qty
	)
AS
-- 予定の投入
SELECT
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd,
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no, -- 投入予定NO
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'予定'::text AS sa,
	'SCHD'::text AS sa_lcl,
	'投入'::text AS qty_typ,
	'INPT'::text AS qty_typ_lcl,
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.base_unit_inpt_qty AS qty -- 基準単位投入数量[予定投入数量]
FROM
	mst_inpt_schd_all msvt_litemes_inpt_pro_mst_inpt_schd_all_t1 -- 投入予定
WHERE 0=0
AND msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.can_flg = '0'::bpchar
-- 予定のロス
UNION ALL
SELECT
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd,
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no, -- 投入予定NO
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'予定'::text AS sa,
	'SCHD'::text AS sa_lcl,
	'ロス'::text AS qty_typ,
	'LOSS'::text AS qty_typ_lcl,
	(msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.base_unit_rqmt_qty - msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.base_unit_inpt_qty) AS qty -- 基準単位必要数量 - 基準単位投入数量[予定ロス数量]
FROM
	mst_inpt_schd_all msvt_litemes_inpt_pro_mst_inpt_schd_all_t1 -- 投入予定
WHERE 0=0
AND msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.can_flg = '0'::bpchar
-- 予定の固定ロス
UNION ALL
SELECT
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd,
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no, -- 投入予定NO
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'予定'::text AS sa,
	'SCHD'::text AS sa_lcl,
	'固定ロス'::text AS qty_typ,
	'FXD_LOSS'::text AS qty_typ_lcl,
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.base_unit_fxd_rqmt_qty AS qty -- 基準単位固定必要数量[予定固定ロス数量]
FROM
	mst_inpt_schd_all msvt_litemes_inpt_pro_mst_inpt_schd_all_t1 -- 投入予定
WHERE 0=0
AND msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.can_flg = '0'::bpchar
-- 実績の投入
UNION ALL
SELECT
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd,
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no, -- 投入予定NO
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'実績'::text AS sa,
	'ACT'::text AS sa_lcl,
	'投入'::text AS qty_typ,
	'INPT'::text AS qty_typ_lcl,
	COALESCE(t3.base_unit_inpt_act_qty, (0)::numeric) AS qty -- 基準単位投入数量[投入数量]
FROM
	mst_inpt_schd_all msvt_litemes_inpt_pro_mst_inpt_schd_all_t1 -- 投入予定
	LEFT OUTER JOIN (SELECT 
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.inpt_schd_no,
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.co_cd,
						sum(msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.base_unit_inpt_qty) base_unit_inpt_act_qty -- 基準単位投入数量
					FROM
						mst_inpt_act_all msvt_litemes_inpt_pro_mst_inpt_act_all_ta2
					GROUP BY
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.inpt_schd_no,
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.co_cd
	) t3 ON (((msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no)::text = (t3.inpt_schd_no)::text) AND ((msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd)::text = (t3.co_cd)::text)) -- 投入実績
WHERE 0=0
AND msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.can_flg = '0'::bpchar
-- 実績のロス
UNION ALL
SELECT
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd,
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no, -- 投入予定NO
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'実績'::text AS sa,
	'ACT'::text AS sa_lcl,
	'ロス'::text AS qty_typ,
	'LOSS'::text AS qty_typ_lcl,
	COALESCE(t3.base_unit_loss_act_qty, (0)::numeric) AS qty -- 基準単位ロス数量[ロス数量]
FROM
	mst_inpt_schd_all msvt_litemes_inpt_pro_mst_inpt_schd_all_t1 -- 投入予定
	LEFT OUTER JOIN (SELECT 
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.inpt_schd_no,
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.co_cd,
						sum(msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.base_unit_loss_qty) base_unit_loss_act_qty -- 基準単位ロス数量
					FROM
						mst_inpt_act_all msvt_litemes_inpt_pro_mst_inpt_act_all_ta2
					GROUP BY
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.inpt_schd_no,
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.co_cd
	) t3 ON (((msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no)::text = (t3.inpt_schd_no)::text) AND ((msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd)::text = (t3.co_cd)::text)) -- 投入実績
WHERE 0=0
AND msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.can_flg = '0'::bpchar
-- 実績の固定ロス
UNION ALL
SELECT
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd,
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no, -- 投入予定NO
	msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.mfg_inst_no, -- 製造指図NO
	'実績'::text AS sa,
	'ACT'::text AS sa_lcl,
	'固定ロス'::text AS qty_typ,
	'FXD_LOSS'::text AS qty_typ_lcl,
	COALESCE(t3.base_unit_fxd_loss_qty, (0)::numeric) AS qty -- 基準単位固定ロス数量[固定ロス数量]
FROM
	mst_inpt_schd_all msvt_litemes_inpt_pro_mst_inpt_schd_all_t1 -- 投入予定
	LEFT OUTER JOIN (SELECT 
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.inpt_schd_no,
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.co_cd,
						sum(msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.base_unit_fxd_loss_qty) base_unit_fxd_loss_qty -- 基準単位固定ロス数量
					FROM
						mst_inpt_act_all msvt_litemes_inpt_pro_mst_inpt_act_all_ta2
					GROUP BY
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.inpt_schd_no,
						msvt_litemes_inpt_pro_mst_inpt_act_all_ta2.co_cd
	) t3 ON (((msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.inpt_schd_no)::text = (t3.inpt_schd_no)::text) AND ((msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.co_cd)::text = (t3.co_cd)::text)) -- 投入実績
WHERE 0=0
AND msvt_litemes_inpt_pro_mst_inpt_schd_all_t1.can_flg = '0'::bpchar
;


