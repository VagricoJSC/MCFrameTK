CREATE OR REPLACE PACKAGE BODY MGPA_STD_INPT
IS

	TYPE PLIST IS TABLE OF MGPA_META.INPT_REC_NO%TYPE INDEX BY BINARY_INTEGER ;
	G_NO		MGPA_META.INPT_REC_NO%TYPE ;

	G_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

	PROCEDURE P_EX (
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_LVL		IN MGPA_META.CALC_LVL%TYPE,
		I_TGT_NO	IN PLIST
	)
	/**************************************************************************
	<SYNOPSIS>
		再帰的展開処理
	<REMARKS>

	<ARGUMENTS>
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LVL
			階層レベル
	<IN>	I_TGT_NO
			対象となる投入レコードＮＯのリスト
	<HISTORY>
	**************************************************************************/
	AS
		L_TGT_NO	PLIST ;
		L_BOTTOM_FLG	MAPA_META.FLG%TYPE ;
	BEGIN
		IF I_TGT_NO.COUNT = 0 THEN
			RETURN ;
		END IF ;

		G_NO := G_NO + 1 ;

		FORALL i IN 1..I_TGT_NO.COUNT
			UPDATE	MGW_STD_INPT w1
			SET	w1.SML_INPT_REC_NO = G_NO
			WHERE	0=0
			AND	w1.WG_CD = I_WG_CD
			AND	w1.ITM_CD = I_ITM_CD
			AND	w1.ITM_SUB1 = I_ITM_SUB1
			AND	w1.ITM_SUB2 = I_ITM_SUB2
			AND	w1.ITM_SUB3 = I_ITM_SUB3
			AND	w1.LVL = I_LVL
			AND	w1.SML_INPT_REC_NO = I_TGT_NO(i)
			;

		FOR p IN (
			SELECT	DISTINCT
				w1.INPT_REC_NO
			FROM	MGW_STD_INPT w1
			WHERE	0=0
			AND	w1.WG_CD = I_WG_CD
			AND	w1.ITM_CD = I_ITM_CD
			AND	w1.ITM_SUB1 = I_ITM_SUB1
			AND	w1.ITM_SUB2 = I_ITM_SUB2
			AND	w1.ITM_SUB3 = I_ITM_SUB3
			AND	w1.LVL = I_LVL
			AND	w1.SML_INPT_REC_NO = G_NO
			)
		LOOP
			L_TGT_NO(L_TGT_NO.COUNT + 1) := p.INPT_REC_NO ;
		END LOOP ;

		L_BOTTOM_FLG := '1' ;
		FOR w IN (
			SELECT	c.WG_CD,
				c.ITM_CD,
				c.ITM_SUB1,
				c.ITM_SUB2,
				c.ITM_SUB3,
				c.LVL
			FROM	MGW_STD_INPT p, MGW_STD_INPT c
			WHERE	0=0
			AND	p.SML_INPT_REC_NO = G_NO
			AND	p.WG_CD = I_WG_CD
			AND	p.ITM_CD = I_ITM_CD
			AND	p.ITM_SUB1 = I_ITM_SUB1
			AND	p.ITM_SUB2 = I_ITM_SUB2
			AND	p.ITM_SUB3 = I_ITM_SUB3
			AND	p.LVL = I_LVL
			AND	c.SML_INPT_REC_NO = p.INPT_REC_NO
			AND	c.LVL = I_LVL + 1
			GROUP BY c.WG_CD, c.ITM_CD, c.ITM_SUB1, c.ITM_SUB2, c.ITM_SUB3, c.LVL
			ORDER BY MIN(c.INPT_REC_NO)
			)
		LOOP
			L_BOTTOM_FLG := '0' ;
			P_EX(w.WG_CD, w.ITM_CD, w.ITM_SUB1, w.ITM_SUB2, w.ITM_SUB3, w.LVL, L_TGT_NO) ;
		END LOOP ;

		IF L_BOTTOM_FLG = '1' THEN
			UPDATE	MGW_STD_INPT w
			SET	w.BOTTOM_FLG = '1'
			WHERE	0=0
			AND	w.SML_INPT_REC_NO = G_NO
			AND	w.WG_CD = I_WG_CD
			AND	w.ITM_CD = I_ITM_CD
			AND	w.ITM_SUB1 = I_ITM_SUB1
			AND	w.ITM_SUB2 = I_ITM_SUB2
			AND	w.ITM_SUB3 = I_ITM_SUB3
			AND	w.LVL = I_LVL
			;
		END IF ;

		L_TGT_NO.DELETE ;

	END P_EX ;


	PROCEDURE P_MAIN (
		I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
		I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_ITM_CD 	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_LOC_CD	IN MAPA_META.LOC_CD%TYPE,
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE
	)
	/**************************************************************************
	<SYNOPSIS>
		標準内訳照会作成メイン処理
	<REMARKS>

	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CALC_NO
			原価計算ＮＯ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_SPPL_CD
			取引先ＣＤ
	<HISTORY>
	**************************************************************************/
	IS
		C_ENPNS_PRD	CONSTANT MAPA_META.EXPNS_TYP%TYPE := MAC_EXPNS_TYP.PROD ;

		L_TGT_NO	PLIST ;
		L_CNT		NUMBER ;
		L_BOTTOM_FLG	MAPA_META.FLG%TYPE ;
	BEGIN
		G_NO := 0 ;

		DELETE MGW_STD_INPT ;

		FOR x IN (
			SELECT	t1.LVL,
				t1.WG_CD,
				t1.ITM_CD,
				t1.ITM_SUB1,
				t1.ITM_SUB2,
				t1.ITM_SUB3,
				t1.MFG_PURC_TYP,
				t1.INPT_REC_NO,
				t1.TOP_REC_NO,
				t1.STD_QTY,
				t1.THE_QTY
			FROM	MGT_STD_TOP t0, MGT_STD_INPT t1
			WHERE	0=0
			AND	t1.CALC_NO	= t0.CALC_NO
			AND	t1.CALC_GRP_CD	= t0.CALC_GRP_CD
			AND	t1.TOP_REC_NO	= t0.TOP_REC_NO
			AND	t0.CALC_NO = I_CALC_NO
			AND	t0.CALC_GRP_CD = I_CALC_GRP_CD
			AND	t0.WG_CD = I_WG_CD
			AND	t0.ITM_CD = I_ITM_CD
			AND	t0.ITM_SUB1 = I_ITM_SUB1
			AND	t0.ITM_SUB2 = I_ITM_SUB2
			AND	t0.ITM_SUB3 = I_ITM_SUB3
			AND	t0.SLS_FLG	= '0'
			AND	(I_LOC_CD IS NULL OR t0.LOC_CD LIKE I_LOC_CD)
			AND	(I_SPPL_CD IS NULL OR t0.SPPL_CD LIKE I_SPPL_CD)
			)
		LOOP
			SELECT	COUNT(t1.CALC_NO) 
			INTO	L_CNT
			FROM	MGT_STD_COST t1
			WHERE	0=0
			AND	t1.CALC_NO = I_CALC_NO
			AND	t1.CALC_GRP_CD = I_CALC_GRP_CD
			AND	t1.INPT_REC_NO = x.INPT_REC_NO
			AND	t1.EXPNS_TYP = C_ENPNS_PRD
			;

			INSERT INTO MGW_STD_INPT (
				LVL,
				WG_CD,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				MFG_PURC_TYP,
				INPT_REC_NO,
				STD_QTY,
				THE_QTY,
				EXPNS_CD,
				STD_COST,
				THE_COST,
				SML_INPT_REC_NO
				)
			SELECT	x.LVL,
				x.WG_CD,
				x.ITM_CD,
				x.ITM_SUB1,
				x.ITM_SUB2,
				x.ITM_SUB3,
				x.MFG_PURC_TYP,
				x.INPT_REC_NO,
				DECODE(ROWNUM, 1, x.STD_QTY, 0),
				DECODE(ROWNUM, 1, x.THE_QTY, 0),
				y.EXPNS_CD,
				y.STD_COST,
				y.THE_COST,
				z.SML_INPT_REC_NO
			FROM	(
				SELECT	t1.EXPNS_CD,
					SUM(t1.STD_COST)	STD_COST,
					SUM(t1.THE_COST)	THE_COST
				FROM	MGT_STD_COST t1
				WHERE	0=0
				AND	t1.CALC_NO = I_CALC_NO
				AND	t1.CALC_GRP_CD = I_CALC_GRP_CD
				AND	t1.INPT_REC_NO = x.INPT_REC_NO
				AND	t1.EXPNS_TYP = C_ENPNS_PRD
				AND	L_CNT > 0
				GROUP BY
					t1.EXPNS_CD
				UNION ALL
				SELECT	NULL	EXPNS_CD,
					0	STD_COST,
					0	THE_COST
				FROM	DUAL
				WHERE	0=0
				AND	L_CNT = 0
				) y,
				(
				SELECT	NVL(MAX(t1.INPT_REC_NO), 0) SML_INPT_REC_NO
				FROM	MGT_STD_INPT t1
				WHERE	0=0
				AND	t1.CALC_NO = I_CALC_NO
				AND	t1.CALC_GRP_CD = I_CALC_GRP_CD
				AND	t1.TOP_REC_NO = x.TOP_REC_NO
				AND	t1.LVL = x.LVL - 1
				AND	t1.INPT_REC_NO <= x.INPT_REC_NO
				) z
			WHERE	0=0
			;
		END LOOP ;

		FOR p IN (
			SELECT	DISTINCT
				w1.INPT_REC_NO
			FROM	MGW_STD_INPT w1
			WHERE	0=0
			AND	w1.LVL = 0
			)
		LOOP
			L_TGT_NO(L_TGT_NO.COUNT + 1) := p.INPT_REC_NO ;
		END LOOP ;

		L_BOTTOM_FLG := '1' ;
		FOR z IN (
			SELECT	w1.WG_CD,
				w1.ITM_CD,
				w1.ITM_SUB1,
				w1.ITM_SUB2,
				w1.ITM_SUB3
			FROM	MGW_STD_INPT w1
			WHERE	0=0
			AND	w1.LVL = 1
			GROUP BY w1.WG_CD, w1.ITM_CD, w1.ITM_SUB1, w1.ITM_SUB2, w1.ITM_SUB3
			ORDER BY MIN(w1.INPT_REC_NO)
			)
		LOOP
			L_BOTTOM_FLG := '0' ;
			P_EX(z.WG_CD, z.ITM_CD, z.ITM_SUB1, z.ITM_SUB2, z.ITM_SUB3, 1, L_TGT_NO) ;
		END LOOP ;

		IF L_BOTTOM_FLG = '1' THEN
			UPDATE	MGW_STD_INPT w
			SET	w.BOTTOM_FLG = '1'
			WHERE	0=0
			AND	w.LVL = 0
			;
		END IF ;

		L_TGT_NO.DELETE ;

	END P_MAIN ;

END MGPA_STD_INPT ;
/
