SET SQLBLANKLINES ON

CREATE OR REPLACE VIEW MSVT_LITEMES_WK_PRO(
	CO_CD,
	WK_SCHD_NO,
	MFG_INST_NO,
	SA,
	SA_LCL,
	WK_COST_TYP,
	WK_COST_TYP_LCL,
	WK_COST
	)
AS
-- 予定の工数(数量依存)
SELECT
	T1.CO_CD,
	T1.WK_SCHD_NO, -- 工数予定NO
	T1.MFG_INST_NO, -- 製造指図NO
	'予定' AS SA,
	'SCHD' AS SA_LCL,
	'予定工数(数量依存)' AS WK_COST_TYP,
	'SCHD (Qty.-dependent)' AS WK_COST_TYP_LCL,
	T1.WK_COST AS WK_COST -- 予定工数（数量依存）
FROM
	MST_WK_SCHD_ALL T1 -- 工数予定
WHERE 0=0
AND T1.CAN_FLG = '0'
UNION ALL
-- 予定の工数(固定)
SELECT
	T1.CO_CD,
	T1.WK_SCHD_NO, -- 工数予定NO
	T1.MFG_INST_NO, -- 製造指図NO
	'予定' AS SA,
	'SCHD' AS SA_LCL,
	'予定工数(固定)' AS WK_COST_TYP,
	'SCHD (Constant)' AS WK_COST_TYP_LCL,
	T1.FXD_WK_COST AS WK_COST -- 予定工数（固定）
FROM
	MST_WK_SCHD_ALL T1 -- 工数予定
WHERE 0=0
AND T1.CAN_FLG = '0'
UNION ALL
-- 実績の工数
SELECT
	T1.CO_CD,
	T1.WK_SCHD_NO, -- 工数予定NO
	T1.MFG_INST_NO, -- 製造指図NO
	'実績' AS SA,
	'ACT' AS SA_LCL,
	'実績工数' AS WK_COST_TYP,
	'RSLT' AS WK_COST_TYP_LCL,
	NVL(T3.WK_ACT_COST, 0) AS WK_COST -- 工数実績
FROM
	MST_WK_SCHD_ALL T1 -- 工数予定
	LEFT OUTER JOIN (SELECT
						TA2.WK_SCHD_NO,
						TA2.CO_CD,
						SUM(TA2.WK_COST) WK_ACT_COST -- 工数実績
					FROM
						MST_WK_ACT_ALL TA2 -- 工数実績
					GROUP BY
						TA2.WK_SCHD_NO,
						TA2.CO_CD
	) T3 ON (T1.WK_SCHD_NO = T3.WK_SCHD_NO AND T1.CO_CD = T3.CO_CD)
WHERE 0=0
AND T1.CAN_FLG = '0'

/
show errors;


