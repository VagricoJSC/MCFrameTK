CREATE OR REPLACE PACKAGE BODY MGPA_IMP_BOM
IS
	C_OFF		CONSTANT MAPA_META.FLG%TYPE := '0' ;
	C_ON		CONSTANT MAPA_META.FLG%TYPE := '1' ;

	C_MAX_CNT	CONSTANT INTEGER := 50000 ; --バルクインサートでの最大レコード数
	C_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

	G_ERR_FLG	MAPA_META.FLG%TYPE ;
	G_USR		MAPA_META.USR_ID%TYPE ;

	G_LOG_NO	MAPA_META.BATCH_LOG_NO%TYPE ;
	G_LOG_SUB_KEY1	MAPA_META.BATCH_LOG_SUB_KEY1%TYPE ;
	G_LOG_SUB_KEY2	MAPA_META.BATCH_LOG_SUB_KEY2%TYPE ;

	TYPE BOM_LIST IS TABLE OF MGW_IMP_BOM_EX%ROWTYPE INDEX BY BINARY_INTEGER ;
	G_BOM	BOM_LIST ;
	i	INTEGER ;

	PROCEDURE P_EX_PH (
		I_PH_BOM 	IN MGW_IMP_BOM_EX%ROWTYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_DT		IN MAPA_META.DT%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		ファントム品の展開処理（正展開）
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_PH_BOM

	<IN>	I_TERM
			期
	<IN>	I_DT
			対象日
	<IN>	I_WG_CD
			ワーキンググループＣＤ

	<HISTORY>
	**********************************************************/
	IS
		L_TMP_BOM	MGW_IMP_BOM_EX%ROWTYPE ;
	BEGIN
		FOR x IN (
			SELECT
				m0.*
			FROM	(
				SELECT
					m1.OPER_CD,
					m1.OPER_SEQ,
					m1.CHD_ITM_CD,
					m1.CHD_ITM_SUB1,
					m1.CHD_ITM_SUB2,
					m1.CHD_ITM_SUB3,
					m1.BOM_PTN,
					m1.PH_FLG,
					m1.PH_BOM_PTN,
					m1.ALT_GRP_CD,
					m1.ALT_ITM_RATIO,
					m1.PAR_INST_QTY,
					m1.CHD_RQMT_QTY,
					m1.CHD_INPT_QTY,
					m1.FXD_CHD_RQMT_QTY,
					m1.BYPROD_FLG,
					m1.INPT_CTL_TYP,
					m1.DISP_SEQ,
					m1.NOT_COST_FLG,
					m1.ST_DT,
					m1.END_DT,
					m1.BOM_KEY,
					RANK() OVER (
						PARTITION BY
							m1.PAR_ITM_CD,
							m1.PAR_ITM_SUB1,
							m1.PAR_ITM_SUB2,
							m1.PAR_ITM_SUB3,
							m1.BOM_PTN,
							m1.OPER_CD,
							m1.OPER_SEQ,
							m1.CHD_ITM_CD,
							m1.CHD_ITM_SUB1,
							m1.CHD_ITM_SUB2,
							m1.CHD_ITM_SUB3,
							m1.ALT_GRP_CD,
							m1.WG_CD,
							CASE WHEN I_DT IS NULL THEN NULL ELSE m1.BOM_KEY END
						ORDER BY
							m1.ST_DT
					) AS ST_DT_RK,
					RANK() OVER (
						PARTITION BY
							m1.PAR_ITM_CD,
							m1.PAR_ITM_SUB1,
							m1.PAR_ITM_SUB2,
							m1.PAR_ITM_SUB3,
							m1.BOM_PTN
						ORDER BY
							CASE m1.WG_CD WHEN C_NULL_VAL THEN NULL ELSE m1.WG_CD END
					) AS WG_RK
				FROM	MAVM_BOM m1
					JOIN MAM_ITM_SRCH m2 ON
						(0=0
						AND	m1.CHD_ITM_CD = m2.ITM_CD
						AND	m1.CHD_ITM_SUB1 = m2.ITM_SUB1
						AND	m1.CHD_ITM_SUB2 = m2.ITM_SUB2
						AND	m1.CHD_ITM_SUB3 = m2.ITM_SUB3
						AND	m2.DEL_FLG = C_OFF
						)
					JOIN MAM_TERM m3 ON (m3.TERM = I_TERM)
				WHERE	0=0
				AND	m1.NOT_COST_FLG = C_OFF
				AND	m1.WG_CD IN (C_NULL_VAL, I_WG_CD)
				AND	m1.PAR_ITM_CD = I_PH_BOM.ITM_CD
				AND	m1.PAR_ITM_SUB1 = I_PH_BOM.ITM_SUB1
				AND	m1.PAR_ITM_SUB2 = I_PH_BOM.ITM_SUB2
				AND	m1.PAR_ITM_SUB3 = I_PH_BOM.ITM_SUB3
				AND	m1.BOM_PTN = I_PH_BOM.BOM_PTN
				AND	(
					I_DT IS NOT NULL AND m1.ST_DT <= I_DT AND m1.END_DT >= I_DT
					OR
					I_DT IS NULL AND m1.ST_DT < m3.TERM_END_YM AND m1.END_DT >= m3.TERM
					)
				AND	(
					I_PH_BOM.OPER_CD IS NOT NULL AND m1.OPER_CD = I_PH_BOM.OPER_CD AND m1.OPER_SEQ = I_PH_BOM.OPER_SEQ
					OR
					I_PH_BOM.OPER_CD IS NULL
					OR
					m1.OPER_CD IS NULL
					)
				) m0
			WHERE	0=0
			AND	ST_DT_RK = 1
			AND	WG_RK = 1
			)
		LOOP

			L_TMP_BOM.BOM_LVL := I_PH_BOM.BOM_LVL ;
			L_TMP_BOM.WG_CD := I_WG_CD ;
			L_TMP_BOM.ITM_CD := x.CHD_ITM_CD ;
			L_TMP_BOM.ITM_SUB1 := x.CHD_ITM_SUB1 ;
			L_TMP_BOM.ITM_SUB2 := x.CHD_ITM_SUB2 ;
			L_TMP_BOM.ITM_SUB3 := x.CHD_ITM_SUB3 ;
			IF x.PH_FLG = '1' THEN
				L_TMP_BOM.BOM_PTN := x.PH_BOM_PTN ;
			ELSE
				L_TMP_BOM.BOM_PTN := x.BOM_PTN ;
			END IF ;
			IF I_PH_BOM.OPER_CD IS NOT NULL THEN
				L_TMP_BOM.OPER_CD := I_PH_BOM.OPER_CD ;
				L_TMP_BOM.OPER_SEQ := I_PH_BOM.OPER_SEQ ;
			ELSE
				L_TMP_BOM.OPER_CD := x.OPER_CD ;
				L_TMP_BOM.OPER_SEQ := x.OPER_SEQ ;
			END IF ;
			L_TMP_BOM.PH_FLG := x.PH_FLG ;
			L_TMP_BOM.PH_BOM_PTN := I_PH_BOM.PH_BOM_PTN ;
			L_TMP_BOM.ALT_GRP_CD := x.ALT_GRP_CD ;
			L_TMP_BOM.ALT_ITM_RATIO := x.ALT_ITM_RATIO ;
			L_TMP_BOM.PAR_INST_QTY := I_PH_BOM.PAR_INST_QTY ;
			IF x.PAR_INST_QTY = 0 THEN
				L_TMP_BOM.CHD_RQMT_QTY := 0 ;
				L_TMP_BOM.CHD_INPT_QTY := 0 ;
				L_TMP_BOM.FXD_CHD_RQMT_QTY := x.FXD_CHD_RQMT_QTY ;
			ELSE
				L_TMP_BOM.CHD_RQMT_QTY := I_PH_BOM.CHD_RQMT_QTY * x.CHD_RQMT_QTY / x.PAR_INST_QTY ;
				L_TMP_BOM.CHD_INPT_QTY := I_PH_BOM.CHD_INPT_QTY * x.CHD_INPT_QTY / x.PAR_INST_QTY ;
				L_TMP_BOM.FXD_CHD_RQMT_QTY := I_PH_BOM.FXD_CHD_RQMT_QTY * x.CHD_RQMT_QTY / x.PAR_INST_QTY + x.FXD_CHD_RQMT_QTY ; --MRPにあわせる
			END IF ;
			L_TMP_BOM.BYPROD_FLG := x.BYPROD_FLG ;
			L_TMP_BOM.INPT_CTL_TYP := x.INPT_CTL_TYP ;
			L_TMP_BOM.DISP_SEQ := x.DISP_SEQ ;
			L_TMP_BOM.NOT_COST_FLG := x.NOT_COST_FLG ;
			L_TMP_BOM.ST_DT := x.ST_DT ;
			L_TMP_BOM.END_DT := x.END_DT ;
			L_TMP_BOM.PAR_ITM_CD := I_PH_BOM.PAR_ITM_CD ;
			L_TMP_BOM.PAR_ITM_SUB1 := I_PH_BOM.PAR_ITM_SUB1 ;
			L_TMP_BOM.PAR_ITM_SUB2 := I_PH_BOM.PAR_ITM_SUB2 ;
			L_TMP_BOM.PAR_ITM_SUB3 := I_PH_BOM.PAR_ITM_SUB3 ;

			IF x.PH_FLG = '1' AND x.PH_BOM_PTN IS NOT NULL THEN
				P_EX_PH(L_TMP_BOM, I_TERM, I_DT, I_WG_CD) ;
			ELSE
				i := i + 1 ;
				G_BOM(i) := L_TMP_BOM ;
			END IF ;

		END LOOP ;
	END P_EX_PH ;

	PROCEDURE P_INS_BOM_EX (
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_DT		IN MAPA_META.DT%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		ＢＯＭ正展開結果を一時表（MGW_IMP_BOM_EX）に格納する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_DT
			対象日
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/
	IS
		L_TMP_BOM	MGW_IMP_BOM_EX%ROWTYPE ;
	BEGIN
		DELETE MGW_IMP_BOM_EX ;

		-- 展開の起点として子品目が架空品のレコードを取得する
		IF I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH THEN
			INSERT INTO MGW_IMP_BOM_EX (
				BOM_LVL,
				WG_CD,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				BOM_PTN
				)
			SELECT DISTINCT
				0,
				I_WG_CD, -- NULLでなくかつNULL文字でないWG_CDから始める
				T.CHD_ITM_CD,
				T.CHD_ITM_SUB1,
				T.CHD_ITM_SUB2,
				T.CHD_ITM_SUB3,
				T.PH_BOM_PTN
			FROM (
					SELECT
						m1.CHD_ITM_CD,
						m1.CHD_ITM_SUB1,
						m1.CHD_ITM_SUB2,
						m1.CHD_ITM_SUB3,
						m1.PH_BOM_PTN,
						RANK() OVER (
							PARTITION BY
								m1.PAR_ITM_CD,
								m1.PAR_ITM_SUB1,
								m1.PAR_ITM_SUB2,
								m1.PAR_ITM_SUB3,
								m1.BOM_PTN
							ORDER BY
								CASE m1.WG_CD WHEN C_NULL_VAL THEN NULL ELSE m1.WG_CD END
						) AS RK
					FROM
						MAVM_BOM	m1,
						MAM_ITM_SRCH	m2,
						MAM_ITM_SRCH	m3,
						MAM_TERM	m4
					WHERE 0=0
					AND m2.ITM_CD = m1.PAR_ITM_CD
					AND m2.ITM_SUB1 = m1.PAR_ITM_SUB1
					AND m2.ITM_SUB2 = m1.PAR_ITM_SUB2
					AND m2.ITM_SUB3 = m1.PAR_ITM_SUB3
					AND m2.DEL_FLG = C_OFF
					AND m2.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.MNG
					AND m3.ITM_CD = m1.CHD_ITM_CD
					AND m3.ITM_SUB1 = m1.CHD_ITM_SUB1
					AND m3.ITM_SUB2 = m1.CHD_ITM_SUB2
					AND m3.ITM_SUB3 = m1.CHD_ITM_SUB3
					AND m3.DEL_FLG = C_OFF
					AND m4.TERM = I_TERM
					AND (
						I_DT IS NOT NULL AND m1.ST_DT <= I_DT AND m1.END_DT >= I_DT
						OR
						I_DT IS NULL AND m4.TERM <= m1.END_DT AND m4.TERM_END_YM > m1.ST_DT
						)
					AND m1.NOT_COST_FLG = C_OFF
					AND m1.PH_FLG = C_ON
					AND m1.INPT_CTL_TYP <> MAC_INPT_CTL_TYP.NO_MRP_INST
					AND (m1.CHD_RQMT_QTY > 0 OR m1.CHD_INPT_QTY > 0 OR m1.FXD_CHD_RQMT_QTY > 0)
					AND m1.WG_CD = I_WG_CD
				) T
			WHERE T.RK = 1
			;
		ELSE
			INSERT INTO MGW_IMP_BOM_EX (
				BOM_LVL,
				WG_CD,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				BOM_PTN
				)
			SELECT	DISTINCT
				0,
				T.WG_CD,
				T.CHD_ITM_CD,
				T.CHD_ITM_SUB1,
				T.CHD_ITM_SUB2,
				T.CHD_ITM_SUB3,
				T.PH_BOM_PTN
			FROM (
					SELECT
						m1.WG_CD,
						m1.CHD_ITM_CD,
						m1.CHD_ITM_SUB1,
						m1.CHD_ITM_SUB2,
						m1.CHD_ITM_SUB3,
						m1.PH_BOM_PTN,
						RANK() OVER (
							PARTITION BY
								m1.PAR_ITM_CD,
								m1.PAR_ITM_SUB1,
								m1.PAR_ITM_SUB2,
								m1.PAR_ITM_SUB3,
								m1.BOM_PTN,
								wk.WG_CD
							ORDER BY
								CASE m1.WG_CD WHEN C_NULL_VAL THEN NULL ELSE m1.WG_CD END
						) AS RK
					FROM
						MAVM_BOM		m1,
						MAM_ITM_SRCH		m2,
						MAM_ITM_SRCH		m3,
						MAM_TERM		m4,
						MGW_IMP_INTERACTIVE_KEY	wk
					WHERE 0=0
					AND m2.ITM_CD = m1.PAR_ITM_CD
					AND m2.ITM_SUB1 = m1.PAR_ITM_SUB1
					AND m2.ITM_SUB2 = m1.PAR_ITM_SUB2
					AND m2.ITM_SUB3 = m1.PAR_ITM_SUB3
					AND m2.DEL_FLG = C_OFF
					AND m2.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.MNG
					AND m3.ITM_CD = m1.CHD_ITM_CD
					AND m3.ITM_SUB1 = m1.CHD_ITM_SUB1
					AND m3.ITM_SUB2 = m1.CHD_ITM_SUB2
					AND m3.ITM_SUB3 = m1.CHD_ITM_SUB3
					AND m3.DEL_FLG = C_OFF
					AND m4.TERM = I_TERM
					AND (
						I_DT IS NOT NULL AND m1.ST_DT <= I_DT AND m1.END_DT >= I_DT
						OR
						I_DT IS NULL AND m4.TERM <= m1.END_DT AND m4.TERM_END_YM > m1.ST_DT
						)
					AND wk.ITM_CD = m1.PAR_ITM_CD
					AND wk.ITM_SUB1 = m1.PAR_ITM_SUB1
					AND wk.ITM_SUB2 = m1.PAR_ITM_SUB2
					AND wk.ITM_SUB3 = m1.PAR_ITM_SUB3
					AND m1.WG_CD IN (C_NULL_VAL, wk.WG_CD)
					AND m1.NOT_COST_FLG = C_OFF
					AND m1.PH_FLG = C_ON
					AND m1.INPT_CTL_TYP <> MAC_INPT_CTL_TYP.NO_MRP_INST
					AND (m1.CHD_RQMT_QTY > 0 OR m1.CHD_INPT_QTY > 0 OR m1.FXD_CHD_RQMT_QTY > 0)
				) T
			WHERE T.RK = 1
			;
		END IF ;

		G_BOM.DELETE ;
		i :=0 ;

		FOR x IN (
			SELECT
				m0.*
			FROM	(
				SELECT
					m1.OPER_CD,
					m1.OPER_SEQ,
					m1.CHD_ITM_CD,
					m1.CHD_ITM_SUB1,
					m1.CHD_ITM_SUB2,
					m1.CHD_ITM_SUB3,
					m1.BOM_PTN,
					m1.PH_FLG,
					m1.PH_BOM_PTN,
					m1.ALT_GRP_CD,
					m1.ALT_ITM_RATIO,
					m1.PAR_INST_QTY,
					m1.CHD_RQMT_QTY,
					m1.CHD_INPT_QTY,
					m1.FXD_CHD_RQMT_QTY,
					m1.BYPROD_FLG,
					m1.INPT_CTL_TYP,
					m1.DISP_SEQ,
					m1.NOT_COST_FLG,
					m1.ST_DT,
					m1.END_DT,
					m1.PAR_ITM_CD,
					m1.PAR_ITM_SUB1,
					m1.PAR_ITM_SUB2,
					m1.PAR_ITM_SUB3,
					w.WG_CD,
					RANK() OVER (
						PARTITION BY
							m1.PAR_ITM_CD,
							m1.PAR_ITM_SUB1,
							m1.PAR_ITM_SUB2,
							m1.PAR_ITM_SUB3,
							m1.BOM_PTN,
							m1.OPER_CD,
							m1.OPER_SEQ,
							m1.CHD_ITM_CD,
							m1.CHD_ITM_SUB1,
							m1.CHD_ITM_SUB2,
							m1.CHD_ITM_SUB3,
							m1.ALT_GRP_CD,
							m1.WG_CD,
							CASE WHEN I_DT IS NULL THEN NULL ELSE m1.BOM_KEY END
						ORDER BY
							m1.ST_DT
					) AS ST_DT_RK,
					RANK() OVER (
						PARTITION BY
							m1.PAR_ITM_CD,
							m1.PAR_ITM_SUB1,
							m1.PAR_ITM_SUB2,
							m1.PAR_ITM_SUB3,
							m1.BOM_PTN,
							w.WG_CD
						ORDER BY
							CASE m1.WG_CD WHEN C_NULL_VAL THEN NULL ELSE m1.WG_CD END
					) AS WG_RK
				FROM	MGW_IMP_BOM_EX w
					JOIN MAVM_BOM m1 ON
						(0=0
						AND	m1.WG_CD IN (C_NULL_VAL, w.WG_CD)
						AND	w.BOM_PTN = m1.BOM_PTN
						AND	w.ITM_CD = m1.PAR_ITM_CD
						AND	w.ITM_SUB1 = m1.PAR_ITM_SUB1
						AND	w.ITM_SUB2 = m1.PAR_ITM_SUB2
						AND	w.ITM_SUB3 = m1.PAR_ITM_SUB3
						AND	m1.NOT_COST_FLG = C_OFF
						)
					JOIN MAM_ITM_SRCH m2 ON
						(0=0
						AND	m1.CHD_ITM_CD = m2.ITM_CD
						AND	m1.CHD_ITM_SUB1 = m2.ITM_SUB1
						AND	m1.CHD_ITM_SUB2 = m2.ITM_SUB2
						AND	m1.CHD_ITM_SUB3 = m2.ITM_SUB3
						AND	m2.DEL_FLG = C_OFF
						)
					JOIN MAM_TERM m3 ON (m3.TERM = I_TERM)
				WHERE 0=0
				AND (
					I_DT IS NOT NULL AND m1.ST_DT <= I_DT AND m1.END_DT >= I_DT
					OR
					I_DT IS NULL AND m1.ST_DT < m3.TERM_END_YM AND m1.END_DT >= m3.TERM
					)
				) m0
			WHERE 0=0
			AND ST_DT_RK = 1
			AND WG_RK = 1
			)
		LOOP

			L_TMP_BOM.BOM_LVL := 1 ;
			L_TMP_BOM.WG_CD := x.WG_CD ;
			L_TMP_BOM.ITM_CD := x.CHD_ITM_CD ;
			L_TMP_BOM.ITM_SUB1 := x.CHD_ITM_SUB1 ;
			L_TMP_BOM.ITM_SUB2 := x.CHD_ITM_SUB2 ;
			L_TMP_BOM.ITM_SUB3 := x.CHD_ITM_SUB3 ;
			IF x.PH_FLG = '1' THEN
				L_TMP_BOM.BOM_PTN := x.PH_BOM_PTN ;
			ELSE
				L_TMP_BOM.BOM_PTN := x.BOM_PTN ;
			END IF ;
			L_TMP_BOM.OPER_CD := x.OPER_CD ;
			L_TMP_BOM.OPER_SEQ := x.OPER_SEQ ;
			L_TMP_BOM.PH_FLG := x.PH_FLG ;
			L_TMP_BOM.PH_BOM_PTN := x.BOM_PTN ;
			L_TMP_BOM.ALT_GRP_CD := x.ALT_GRP_CD ;
			L_TMP_BOM.ALT_ITM_RATIO := x.ALT_ITM_RATIO ;
			L_TMP_BOM.PAR_INST_QTY := x.PAR_INST_QTY ;
			L_TMP_BOM.CHD_RQMT_QTY := x.CHD_RQMT_QTY ;
			L_TMP_BOM.CHD_INPT_QTY := x.CHD_INPT_QTY ;
			L_TMP_BOM.FXD_CHD_RQMT_QTY := x.FXD_CHD_RQMT_QTY ;
			L_TMP_BOM.BYPROD_FLG := x.BYPROD_FLG ;
			L_TMP_BOM.INPT_CTL_TYP := x.INPT_CTL_TYP ;
			L_TMP_BOM.DISP_SEQ := x.DISP_SEQ ;
			L_TMP_BOM.NOT_COST_FLG := x.NOT_COST_FLG ;
			L_TMP_BOM.ST_DT := x.ST_DT ;
			L_TMP_BOM.END_DT := x.END_DT ;
			L_TMP_BOM.PAR_ITM_CD := x.PAR_ITM_CD ;
			L_TMP_BOM.PAR_ITM_SUB1 := x.PAR_ITM_SUB1 ;
			L_TMP_BOM.PAR_ITM_SUB2 := x.PAR_ITM_SUB2 ;
			L_TMP_BOM.PAR_ITM_SUB3 := x.PAR_ITM_SUB3 ;

			IF x.PH_FLG = '1' AND x.PH_BOM_PTN IS NOT NULL THEN
				P_EX_PH(L_TMP_BOM, I_TERM, I_DT, x.WG_CD) ;
			ELSE
				i := i + 1 ;
				G_BOM(i) := L_TMP_BOM ;
			END IF ;

			IF i > C_MAX_CNT THEN
				FORALL j IN 1..i
					INSERT INTO MGW_IMP_BOM_EX VALUES G_BOM(j) ;
				G_BOM.DELETE ;
				i := 0 ;
			END IF ;

		END LOOP ;

		FORALL j IN 1..i
			INSERT INTO MGW_IMP_BOM_EX VALUES G_BOM(j) ;
		G_BOM.DELETE ;
		i :=0 ;

	END P_INS_BOM_EX ;

	PROCEDURE P_INS_MGW_MAIN (
		I_CALC_CTG		IN	MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD			IN	MAPA_META.WG_CD%TYPE,
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_DT			IN	MAPA_META.DT%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			ＢＯＭマスタ用のデータをコピー用ワークテーブルに作成する
	<REMARKS>
			ワークテーブル作成メイン処理用プロシージャ
	<ARGUMENTS>
	<IN>	I_CALC_CTG
			計算カテゴリＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_DT
			対象日
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/
	IS
		L_CALC_CTG_CD		MAPA_META.CALC_CTG_CD%TYPE ;
		L_WG_CD			MAPA_META.WG_CD%TYPE ;
	BEGIN
		IF I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.INTERACTIVE THEN
			-- デフォルトの計算カテゴリＣＤを使い、ワーキンググループＣＤは無視する
			L_CALC_CTG_CD := MGPA_CO_PARM.F_GET_CALC_CTG_CD(NULL) ;
			L_WG_CD := NULL ;
		ELSE
			L_CALC_CTG_CD := I_CALC_CTG;
			L_WG_CD := I_WG_CD ;
		END IF;

		DELETE	MGW_IMP_BOM w
		WHERE	0=0
		AND	w.CALC_CTG_CD = L_CALC_CTG_CD
		AND	w.TERM = I_TERM
		AND	(L_WG_CD IS NULL OR w.WG_CD = L_WG_CD)
		AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
				OR EXISTS (
					SELECT	'X'
					FROM	MGW_IMP_INTERACTIVE_KEY wk
					WHERE	0=0
					AND	wk.ITM_CD = w.PAR_ITM_CD
					AND	wk.ITM_SUB1 = w.PAR_ITM_SUB1
					AND	wk.ITM_SUB2 = w.PAR_ITM_SUB2
					AND	wk.ITM_SUB3 = w.PAR_ITM_SUB3
					AND	wk.WG_CD = w.WG_CD
				)
			)
		;

		-- 架空品を展開した一時表を作成する
		P_INS_BOM_EX(L_WG_CD, I_TERM, I_DT, I_IMP_OPE_TYP) ;

		/*** ＳＣＭのマスタからコピーする ***/
		INSERT INTO MGW_IMP_BOM (
			PAR_ITM_CD,
			PAR_ITM_SUB1,
			PAR_ITM_SUB2,
			PAR_ITM_SUB3,
			BOM_PTN,
			OPER_CD,
			OPER_SEQ,
			CHD_ITM_CD,
			CHD_ITM_SUB1,
			CHD_ITM_SUB2,
			CHD_ITM_SUB3,
			ALT_GRP_CD,
			EXPNS_CD,
			TERM,
			CALC_CTG_CD,
			WG_CD,
			DISP_SEQ,
			PAR_RQMT_QTY,
			CHD_RQMT_QTY,
			CHD_BASE_QTY,
			FXD_CHD_RQMT_QTY,
			CHD_MIN_QTY,
			CHD_BATCH_QTY,
			ALT_ITM_RATIO,
			RMRKS,
			SUB_CHAR1,
			SUB_CHAR2,
			SUB_CHAR3,
			NON_CALC_FLG,
			IMP_ERR_FLG,
			IMP_FLG
			)
		SELECT
			m01.PAR_ITM_CD,
			m01.PAR_ITM_SUB1,
			m01.PAR_ITM_SUB2,
			m01.PAR_ITM_SUB3,
			m01.BOM_PTN,
			m01.OPER_CD,
			m01.OPER_SEQ,
			m01.CHD_ITM_CD,
			m01.CHD_ITM_SUB1,
			m01.CHD_ITM_SUB2,
			m01.CHD_ITM_SUB3,
			m01.ALT_GRP_CD,
			NULL AS EXPNS_CD,
			m01.TERM,
			L_CALC_CTG_CD AS CALC_CTG_CD,
			m01.WG_CD,
			m01.DISP_SEQ,
			m01.MAX_PAR_INST_QTY AS PAR_RQMT_QTY,
			MAPA_CALC.F_RND_NE(SUM(m01.CHD_RQMT_QTY * m01.MAX_PAR_INST_QTY / m01.PAR_INST_QTY),m01.DEC_PLACE,m01.RND_TYP) AS CHD_RQMT_QTY,
			MAPA_CALC.F_RND_NE(SUM(m01.CHD_INPT_QTY * m01.MAX_PAR_INST_QTY / m01.PAR_INST_QTY),m01.DEC_PLACE,m01.RND_TYP) AS CHD_BASE_QTY,
			MAPA_CALC.F_RND_NE(SUM(m01.FXD_CHD_RQMT_QTY),m01.DEC_PLACE,m01.RND_TYP) AS FXD_CHD_RQMT_QTY,
			0 AS CHD_MIN_QTY,
			0 AS CHD_BATCH_QTY,
			SUM(m01.ALT_ITM_RATIO) AS ALT_ITM_RATIO,
			NULL AS RMRKS,
			NULL AS SUB_CHAR1,
			NULL AS SUB_CHAR2,
			NULL AS SUB_CHAR3,
			C_OFF AS NON_CALC_FLG,
			C_OFF AS IMP_ERR_FLG,
			CASE I_IMP_OPE_TYP
				WHEN MGC_IMP_OPE_TYP.INTERACTIVE THEN C_ON
				ELSE C_OFF
			END AS IMP_FLG
		FROM	(
			SELECT
				m11.PAR_ITM_CD,
				m11.PAR_ITM_SUB1,
				m11.PAR_ITM_SUB2,
				m11.PAR_ITM_SUB3,
				m11.BOM_PTN,
				m11.OPER_CD,
				m11.OPER_SEQ,
				m11.CHD_ITM_CD,
				m11.CHD_ITM_SUB1,
				m11.CHD_ITM_SUB2,
				m11.CHD_ITM_SUB3,
				m11.ALT_GRP_CD,
				m11.TERM,
				m11.WG_CD,
				m11.DEC_PLACE,
				m11.RND_TYP,
				MIN(m11.DISP_SEQ) OVER (
					PARTITION BY
						m11.PAR_ITM_CD,
						m11.PAR_ITM_SUB1,
						m11.PAR_ITM_SUB2,
						m11.PAR_ITM_SUB3,
						m11.BOM_PTN,
						m11.OPER_CD,
						m11.OPER_SEQ,
						m11.CHD_ITM_CD,
						m11.CHD_ITM_SUB1,
						m11.CHD_ITM_SUB2,
						m11.CHD_ITM_SUB3,
						m11.ALT_GRP_CD,
						m11.TERM,
						m11.WG_CD
				) AS DISP_SEQ,
				m11.PAR_INST_QTY,
				m11.CHD_RQMT_QTY,
				m11.CHD_INPT_QTY,
				m11.FXD_CHD_RQMT_QTY,
				m11.ALT_ITM_RATIO,
				MAX(m11.PAR_INST_QTY) OVER (
					PARTITION BY
						m11.PAR_ITM_CD,
						m11.PAR_ITM_SUB1,
						m11.PAR_ITM_SUB2,
						m11.PAR_ITM_SUB3,
						m11.BOM_PTN,
						m11.OPER_CD,
						m11.OPER_SEQ,
						m11.CHD_ITM_CD,
						m11.CHD_ITM_SUB1,
						m11.CHD_ITM_SUB2,
						m11.CHD_ITM_SUB3,
						m11.ALT_GRP_CD,
						m11.TERM,
						m11.WG_CD
				) AS MAX_PAR_INST_QTY
			FROM	(
				-- 通常品(架空品フラグオフ)
				SELECT
					m21.PAR_ITM_CD,
					m21.PAR_ITM_SUB1,
					m21.PAR_ITM_SUB2,
					m21.PAR_ITM_SUB3,
					m21.BOM_PTN,
					m21.OPER_CD,
					m21.OPER_SEQ,
					m21.CHD_ITM_CD,
					m21.CHD_ITM_SUB1,
					m21.CHD_ITM_SUB2,
					m21.CHD_ITM_SUB3,
					m21.ALT_GRP_CD,
					m21.TERM,
					m21.WG_CD,
					m21.DISP_SEQ,
					m21.PAR_INST_QTY,
					m21.CHD_RQMT_QTY * (CASE m21.BYPROD_FLG WHEN C_ON THEN -1 ELSE 1 END) AS CHD_RQMT_QTY,
					m21.CHD_INPT_QTY * (CASE m21.BYPROD_FLG WHEN C_ON THEN -1 ELSE 1 END) AS CHD_INPT_QTY,
					m21.FXD_CHD_RQMT_QTY * (CASE m21.BYPROD_FLG WHEN C_ON THEN -1 ELSE 1 END) AS FXD_CHD_RQMT_QTY,
					m21.ALT_ITM_RATIO,
					m21.PH_BOM_PTN,
					m21.DEC_PLACE,
					m21.RND_TYP
				FROM	(
					SELECT
						m31.PAR_ITM_CD,
						m31.PAR_ITM_SUB1,
						m31.PAR_ITM_SUB2,
						m31.PAR_ITM_SUB3,
						m31.BOM_PTN,
						m31.OPER_CD,
						m31.OPER_SEQ,
						m31.CHD_ITM_CD,
						m31.CHD_ITM_SUB1,
						m31.CHD_ITM_SUB2,
						m31.CHD_ITM_SUB3,
						m31.ALT_GRP_CD,
						m33.TERM,
						m31.WG_CD,
						m31.DISP_SEQ,
						m31.PAR_INST_QTY,
						m31.CHD_RQMT_QTY,
						m31.CHD_INPT_QTY,
						m31.FXD_CHD_RQMT_QTY,
						m31.ALT_ITM_RATIO,
						m31.PH_BOM_PTN,
						m31.BYPROD_FLG,
						m34.DEC_PLACE,
						m34.RND_TYP,
						RANK() OVER (
							PARTITION BY
								m31.PAR_ITM_CD,
								m31.PAR_ITM_SUB1,
								m31.PAR_ITM_SUB2,
								m31.PAR_ITM_SUB3,
								m31.BOM_PTN,
								m31.OPER_CD,
								m31.OPER_SEQ,
								m31.CHD_ITM_CD,
								m31.CHD_ITM_SUB1,
								m31.CHD_ITM_SUB2,
								m31.CHD_ITM_SUB3,
								m31.ALT_GRP_CD,
								m31.WG_CD,
								CASE WHEN I_DT IS NULL THEN NULL ELSE m31.BOM_KEY END
							ORDER BY
								m31.ST_DT
                        ) AS ST_DT_RK
					FROM	MAVM_BOM m31, MAM_ITM_SRCH m32, MAM_TERM m33, MAM_ITM_SRCH m34
					WHERE	0=0
					AND	m31.PAR_ITM_CD = m32.ITM_CD
					AND	m31.PAR_ITM_SUB1 = m32.ITM_SUB1
					AND	m31.PAR_ITM_SUB2 = m32.ITM_SUB2
					AND	m31.PAR_ITM_SUB3 = m32.ITM_SUB3
					AND	m32.DEL_FLG = C_OFF
					AND (
						I_DT IS NOT NULL AND m31.ST_DT <= I_DT AND m31.END_DT >= I_DT
						OR
						I_DT IS NULL AND m31.ST_DT < m33.TERM_END_YM AND m31.END_DT >= m33.TERM
						)
					AND	m31.DEL_FLG = C_OFF
					AND	m31.PH_FLG = C_OFF
					AND	m31.NOT_COST_FLG = C_OFF
					AND	m32.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.MNG
					AND	m33.TERM = I_TERM
					AND	m31.CHD_ITM_CD = m34.ITM_CD
					AND	m31.CHD_ITM_SUB1 = m34.ITM_SUB1
					AND	m31.CHD_ITM_SUB2 = m34.ITM_SUB2
					AND	m31.CHD_ITM_SUB3 = m34.ITM_SUB3
					AND	m34.DEL_FLG = C_OFF
					AND	(
						m34.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.MNG
						OR
						m31.BYPROD_FLG = C_OFF AND m34.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.NOT_MNG
						)
					AND	m31.INPT_CTL_TYP <> MAC_INPT_CTL_TYP.NO_MRP_INST
					AND	(m31.CHD_RQMT_QTY > 0 OR m31.CHD_INPT_QTY > 0 OR m31.FXD_CHD_RQMT_QTY > 0)
					AND	(L_WG_CD IS NULL OR m31.WG_CD = L_WG_CD)
					AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
							OR EXISTS (
								SELECT	'X'
								FROM	MGW_IMP_INTERACTIVE_KEY wk
								WHERE	0=0
								AND	wk.ITM_CD = m31.PAR_ITM_CD
								AND	wk.ITM_SUB1 = m31.PAR_ITM_SUB1
								AND	wk.ITM_SUB2 = m31.PAR_ITM_SUB2
								AND	wk.ITM_SUB3 = m31.PAR_ITM_SUB3
								AND	wk.WG_CD = m31.WG_CD
							)
						)
					) m21
				WHERE	0=0
				AND	m21.ST_DT_RK = 1
				UNION ALL
				-- 架空品(架空品フラグオン)
				SELECT
					m21.PAR_ITM_CD,
					m21.PAR_ITM_SUB1,
					m21.PAR_ITM_SUB2,
					m21.PAR_ITM_SUB3,
					m21.BOM_PTN,
					m21.OPER_CD,
					m21.OPER_SEQ,
					m21.ITM_CD,
					m21.ITM_SUB1,
					m21.ITM_SUB2,
					m21.ITM_SUB3,
					m21.ALT_GRP_CD,
					m21.TERM,
					m21.WG_CD,
					m21.DISP_SEQ,
					m21.PAR_INST_QTY,
					m21.CHD_RQMT_QTY,
					m21.CHD_INPT_QTY,
					m21.FXD_CHD_RQMT_QTY,
					m21.ALT_ITM_RATIO,
					m21.PH_BOM_PTN,
					m21.DEC_PLACE,
					m21.RND_TYP
				FROM	(
					SELECT
						m31.PAR_ITM_CD,
						m31.PAR_ITM_SUB1,
						m31.PAR_ITM_SUB2,
						m31.PAR_ITM_SUB3,
						m31.BOM_PTN,
						CASE WHEN w31.OPER_CD IS NULL THEN m31.OPER_CD ELSE w31.OPER_CD END AS OPER_CD,
						CASE WHEN w31.OPER_CD IS NULL THEN m31.OPER_SEQ ELSE w31.OPER_SEQ END AS OPER_SEQ,
						w31.ITM_CD,
						w31.ITM_SUB1,
						w31.ITM_SUB2,
						w31.ITM_SUB3,
						w31.ALT_GRP_CD,
						m33.TERM,
						w31.WG_CD,
						w31.DISP_SEQ,
						m31.PAR_INST_QTY,
						CASE m31.PAR_INST_QTY WHEN 0 THEN 0
							ELSE (m31.CHD_RQMT_QTY * w31.CHD_RQMT_QTY / w31.PAR_INST_QTY) * (CASE w31.BYPROD_FLG WHEN C_ON THEN -1 ELSE 1 END) END AS CHD_RQMT_QTY,
						CASE m31.PAR_INST_QTY WHEN 0 THEN 0
							ELSE (m31.CHD_INPT_QTY * w31.CHD_INPT_QTY / w31.PAR_INST_QTY) * (CASE w31.BYPROD_FLG WHEN C_ON THEN -1 ELSE 1 END) END AS CHD_INPT_QTY,
						CASE m31.PAR_INST_QTY WHEN 0 THEN 0
							ELSE (m31.FXD_CHD_RQMT_QTY * w31.CHD_RQMT_QTY / w31.PAR_INST_QTY + w31.FXD_CHD_RQMT_QTY) * (CASE w31.BYPROD_FLG WHEN C_ON THEN -1 ELSE 1 END) END AS FXD_CHD_RQMT_QTY, --MRPにあわせる
						w31.ALT_ITM_RATIO,
						w31.PH_BOM_PTN,
						w31.BYPROD_FLG,
						m34.DEC_PLACE,
						m34.RND_TYP,
						RANK() OVER (
							PARTITION BY
								m31.PAR_ITM_CD,
								m31.PAR_ITM_SUB1,
								m31.PAR_ITM_SUB2,
								m31.PAR_ITM_SUB3,
								m31.BOM_PTN,
								m31.OPER_CD,
								m31.OPER_SEQ,
								m31.CHD_ITM_CD,
								m31.CHD_ITM_SUB1,
								m31.CHD_ITM_SUB2,
								m31.CHD_ITM_SUB3,
								m31.ALT_GRP_CD,
								w31.WG_CD,
								CASE WHEN I_DT IS NULL THEN NULL ELSE m31.BOM_KEY END
							ORDER BY
								m31.ST_DT
						) AS ST_DT_RK,
						RANK() OVER (
							PARTITION BY
								m31.PAR_ITM_CD,
								m31.PAR_ITM_SUB1,
								m31.PAR_ITM_SUB2,
								m31.PAR_ITM_SUB3,
								m31.BOM_PTN,
								w31.WG_CD
							ORDER BY
								CASE m31.WG_CD WHEN C_NULL_VAL THEN NULL ELSE m31.WG_CD END
						) AS WG_RK
					FROM	MAVM_BOM m31, MAM_ITM_SRCH m32, MAM_TERM m33, MAM_ITM_SRCH m34, MGW_IMP_BOM_EX w31
					WHERE	0=0
					AND	m31.PAR_ITM_CD = m32.ITM_CD
					AND	m31.PAR_ITM_SUB1 = m32.ITM_SUB1
					AND	m31.PAR_ITM_SUB2 = m32.ITM_SUB2
					AND	m31.PAR_ITM_SUB3 = m32.ITM_SUB3
					AND	m32.DEL_FLG = C_OFF
					AND (
						I_DT IS NOT NULL AND m31.ST_DT <= I_DT AND m31.END_DT >= I_DT
						OR
						I_DT IS NULL AND m31.ST_DT < m33.TERM_END_YM AND m31.END_DT >= m33.TERM
						)
					AND	m31.CHD_ITM_CD = w31.PAR_ITM_CD
					AND	m31.CHD_ITM_SUB1 = w31.PAR_ITM_SUB1
					AND	m31.CHD_ITM_SUB2 = w31.PAR_ITM_SUB2
					AND	m31.CHD_ITM_SUB3 = w31.PAR_ITM_SUB3
					AND	m31.PH_BOM_PTN = w31.PH_BOM_PTN
					AND	m31.WG_CD = w31.WG_CD
					AND	w31.ITM_CD = m34.ITM_CD
					AND	w31.ITM_SUB1 = m34.ITM_SUB1
					AND	w31.ITM_SUB2 = m34.ITM_SUB2
					AND	w31.ITM_SUB3 = m34.ITM_SUB3
					AND	m34.DEL_FLG = C_OFF
					AND	(
						m34.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.MNG
						OR
						w31.BYPROD_FLG = C_OFF AND m34.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.NOT_MNG
						)
					AND	w31.BOM_LVL = 1
					AND	m31.DEL_FLG = C_OFF
					AND	m31.PH_FLG = C_ON
					AND	m31.NOT_COST_FLG = C_OFF
					AND	m32.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.MNG
					AND	m33.TERM = I_TERM
					AND	(L_WG_CD IS NULL OR m31.WG_CD IN (C_NULL_VAL, L_WG_CD))
					AND	(
						w31.OPER_CD IS NOT NULL AND w31.OPER_CD = m31.OPER_CD AND w31.OPER_SEQ = m31.OPER_SEQ
						OR
						m31.OPER_CD IS NULL
						OR
						w31.OPER_CD IS NULL
						)
					AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
							OR EXISTS (
								SELECT	'X'
								FROM	MGW_IMP_INTERACTIVE_KEY wk
								WHERE	0=0
								AND	wk.ITM_CD = m31.PAR_ITM_CD
								AND	wk.ITM_SUB1 = m31.PAR_ITM_SUB1
								AND	wk.ITM_SUB2 = m31.PAR_ITM_SUB2
								AND	wk.ITM_SUB3 = m31.PAR_ITM_SUB3
								AND	m31.WG_CD IN (C_NULL_VAL, wk.WG_CD)
							)
						)
					) m21
				WHERE	0=0
				AND	m21.ST_DT_RK = 1
				AND	m21.WG_RK = 1
				) m11
			WHERE	0=0
			) m01
		WHERE	0=0
		GROUP BY
			m01.PAR_ITM_CD,
			m01.PAR_ITM_SUB1,
			m01.PAR_ITM_SUB2,
			m01.PAR_ITM_SUB3,
			m01.BOM_PTN,
			m01.OPER_CD,
			m01.OPER_SEQ,
			m01.CHD_ITM_CD,
			m01.CHD_ITM_SUB1,
			m01.CHD_ITM_SUB2,
			m01.CHD_ITM_SUB3,
			m01.ALT_GRP_CD,
			m01.TERM,
			m01.WG_CD,
			m01.MAX_PAR_INST_QTY,
			m01.DISP_SEQ,
			m01.DEC_PLACE,
			m01.RND_TYP
		ORDER BY
			m01.PAR_ITM_CD,
			m01.PAR_ITM_SUB1,
			m01.PAR_ITM_SUB2,
			m01.PAR_ITM_SUB3,
			m01.BOM_PTN,
			m01.OPER_CD,
			m01.OPER_SEQ,
			m01.CHD_ITM_CD,
			m01.CHD_ITM_SUB1,
			m01.CHD_ITM_SUB2,
			m01.CHD_ITM_SUB3,
			m01.ALT_GRP_CD,
			m01.TERM,
			m01.WG_CD
		;

	END P_INS_MGW_MAIN ;

	PROCEDURE P_IMP_MGT_MAIN (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			原価マスタ取込(ＢＯＭ)
	<REMARKS>
			取込メイン処理用プロシージャ
	<ARGUMENTS>
	<IN>	I_TERM
			期
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/
	IS
		TYPE IMP_LIST IS TABLE OF MGT_BOM%ROWTYPE INDEX BY BINARY_INTEGER ;
		L_IMP		IMP_LIST ;
		L_IMP_TMP	IMP_LIST ;

		i		INTEGER := 0 ;
		k		INTEGER := 0 ;

		L_DEL	IMP_LIST ;
		d		INTEGER := 0 ;

		L_CHK_FLG	MAPA_META.FLG%TYPE ;
		L_PARM		MAPA_META.PARM_VAL%TYPE ;
		L_CALC_CTG_CD	MAPA_META.CALC_CTG_CD%TYPE ;
	BEGIN
		--確定品目は削除
		MGPA_FIX_DEL.P_BOM(G_USR, I_TERM) ;

		L_PARM := MAPA_COMM.F_GET_PARM('ITM_SUB_TYP') ;

		-- 個別取込ならデフォルトの計算カテゴリＣＤを使う
		-- 通常取込なら無視する
		IF I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.INTERACTIVE THEN
			L_CALC_CTG_CD := MGPA_CO_PARM.F_GET_CALC_CTG_CD(NULL) ;
		ELSE
			L_CALC_CTG_CD := NULL;
		END IF;

		FOR z IN (
			SELECT	t.*,
				m.ASSET_MNG_TYP ASSET_MNG_TYP
			FROM	(
				SELECT	DISTINCT
					w.PAR_ITM_CD,
					w.PAR_ITM_SUB1,
					w.PAR_ITM_SUB2,
					w.PAR_ITM_SUB3
				FROM	MGW_IMP_BOM w
				WHERE	0=0
				AND	w.IMP_FLG = C_ON
				AND	w.UPD_USR_ID = G_USR
				AND	w.TERM = I_TERM
				AND	(L_CALC_CTG_CD IS NULL OR w.CALC_CTG_CD = L_CALC_CTG_CD)
				AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
							AND w.UPD_SRV_REQ_NO = FCPA_CONTEXT.F_GET_PROCESSID
						OR EXISTS (
							SELECT	'X'
							FROM	MGW_IMP_INTERACTIVE_KEY wk
							WHERE	0=0
							AND	wk.ITM_CD = w.PAR_ITM_CD
							AND	wk.ITM_SUB1 = w.PAR_ITM_SUB1
							AND	wk.ITM_SUB2 = w.PAR_ITM_SUB2
							AND	wk.ITM_SUB3 = w.PAR_ITM_SUB3
							AND	wk.WG_CD = w.WG_CD
						)
					)
				) t,
				MAM_ITM_SRCH m
			WHERE	0=0
			AND	t.PAR_ITM_CD = m.ITM_CD(+)
			AND	t.PAR_ITM_SUB1 = m.ITM_SUB1(+)
			AND	t.PAR_ITM_SUB2 = m.ITM_SUB2(+)
			AND	t.PAR_ITM_SUB3 = m.ITM_SUB3(+)
			AND	m.DEL_FLG(+) = C_OFF
			)
		LOOP
			/*** 品目チェック処理、エラーとなった品目と同じ品目のワークのデータは全件をエラーとして、取り込まない ***/
			IF z.ASSET_MNG_TYP IS NULL OR z.ASSET_MNG_TYP <> MAC_ASSET_MNG_TYP.MNG THEN
				IF z.ASSET_MNG_TYP IS NULL THEN
					-- 品目マスタに有効な品目として登録されていません。親品目：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0045', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(z.PAR_ITM_CD, z.PAR_ITM_SUB1, z.PAR_ITM_SUB2, z.PAR_ITM_SUB3, L_PARM)) ;
				ELSIF z.ASSET_MNG_TYP <> MAC_ASSET_MNG_TYP.MNG THEN
					-- 品目マスタに資産管理可能な品目として登録されていません。親品目の対象にはなりません。親品目：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0044', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(z.PAR_ITM_CD, z.PAR_ITM_SUB1, z.PAR_ITM_SUB2, z.PAR_ITM_SUB3, L_PARM)) ;
				END IF ;

				UPDATE	MGW_IMP_BOM w
				SET	w.IMP_ERR_FLG = C_ON
				WHERE	0=0
				AND	w.PAR_ITM_CD = z.PAR_ITM_CD
				AND	w.PAR_ITM_SUB1 = z.PAR_ITM_SUB1
				AND	w.PAR_ITM_SUB2 = z.PAR_ITM_SUB2
				AND	w.PAR_ITM_SUB3 = z.PAR_ITM_SUB3
				AND	w.IMP_FLG = C_ON
				AND	w.UPD_USR_ID = G_USR
				AND	w.TERM = I_TERM
				;

				G_ERR_FLG := C_ON ;

			END IF ;
		END LOOP ;

		FOR x IN (
			SELECT	DISTINCT
				w.PAR_ITM_CD,
				w.PAR_ITM_SUB1,
				w.PAR_ITM_SUB2,
				w.PAR_ITM_SUB3,
				w.WG_CD,
				w.TERM,
				w.CALC_CTG_CD
			FROM	MGW_IMP_BOM w
			WHERE	0=0
			AND	w.IMP_FLG = C_ON
			AND	w.IMP_ERR_FLG = C_OFF
			AND	w.UPD_USR_ID = G_USR
			AND	w.TERM = I_TERM
			AND	(L_CALC_CTG_CD IS NULL OR w.CALC_CTG_CD = L_CALC_CTG_CD)
			AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
						AND w.UPD_SRV_REQ_NO = FCPA_CONTEXT.F_GET_PROCESSID
					OR EXISTS (
						SELECT	'X'
						FROM	MGW_IMP_INTERACTIVE_KEY wk
						WHERE	0=0
						AND	wk.ITM_CD = w.PAR_ITM_CD
						AND	wk.ITM_SUB1 = w.PAR_ITM_SUB1
						AND	wk.ITM_SUB2 = w.PAR_ITM_SUB2
						AND	wk.ITM_SUB3 = w.PAR_ITM_SUB3
						AND	wk.WG_CD = w.WG_CD
					)
				)
			)
		LOOP
			k := 0 ;
			FOR y IN (
				SELECT /*+INDEX(w MGW_IMP_BOM_ALL_IE03)*/
					w.PAR_ITM_CD,
					w.PAR_ITM_SUB1,
					w.PAR_ITM_SUB2,
					w.PAR_ITM_SUB3,
					w.BOM_PTN,
					w.OPER_CD,
					w.OPER_SEQ,
					w.CHD_ITM_CD,
					w.CHD_ITM_SUB1,
					w.CHD_ITM_SUB2,
					w.CHD_ITM_SUB3,
					w.ALT_GRP_CD,
					w.EXPNS_CD,
					w.TERM,
					w.CALC_CTG_CD,
					w.WG_CD,
					w.DISP_SEQ,
					w.PAR_RQMT_QTY,
					w.CHD_RQMT_QTY,
					w.CHD_BASE_QTY,
					w.FXD_CHD_RQMT_QTY,
					w.CHD_MIN_QTY,
					w.CHD_BATCH_QTY,
					CASE
						WHEN w.ALT_GRP_CD IS NULL THEN NULL
						ELSE w.ALT_ITM_RATIO
					END AS ALT_ITM_RATIO,
					w.RMRKS,
					w.SUB_CHAR1,
					w.SUB_CHAR2,
					w.SUB_CHAR3,
					w.NON_CALC_FLG,
					m1.ITM_CD AS MAM_CHD_ITM_CD
				FROM	MGW_IMP_BOM w, MAM_ITM_SRCH m1
				WHERE	0=0
				AND	w.CHD_ITM_CD = m1.ITM_CD(+)
				AND	w.CHD_ITM_SUB1 = m1.ITM_SUB1(+)
				AND	w.CHD_ITM_SUB2 = m1.ITM_SUB2(+)
				AND	w.CHD_ITM_SUB3 = m1.ITM_SUB3(+)
				AND	m1.DEL_FLG(+) = C_OFF
				AND	w.PAR_ITM_CD = x.PAR_ITM_CD
				AND	w.PAR_ITM_SUB1 = x.PAR_ITM_SUB1
				AND	w.PAR_ITM_SUB2 = x.PAR_ITM_SUB2
				AND	w.PAR_ITM_SUB3 = x.PAR_ITM_SUB3
				AND	w.WG_CD = x.WG_CD
				AND	w.TERM = x.TERM
				AND	w.CALC_CTG_CD = x.CALC_CTG_CD
				AND	w.UPD_USR_ID = G_USR
				AND	w.IMP_FLG = C_ON
				)
			LOOP
				L_CHK_FLG := C_OFF ;

				IF x.PAR_ITM_CD = y.CHD_ITM_CD
					AND x.PAR_ITM_SUB1 = y.CHD_ITM_SUB1
					AND x.PAR_ITM_SUB2 = y.CHD_ITM_SUB2
					AND x.PAR_ITM_SUB3 = y.CHD_ITM_SUB3 THEN
					--親品目と子品目は異なる品目を指定してください。品目：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0033', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(x.PAR_ITM_CD, x.PAR_ITM_SUB1, x.PAR_ITM_SUB2, x.PAR_ITM_SUB3, L_PARM)) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF y.ALT_GRP_CD IS NOT NULL AND y.ALT_ITM_RATIO IS NULL THEN
					--代替Ｇを設定する場合は、代替品目比率を設定してください。
					--親品目：{1} 構成パタン：{2} 期：{3} 計算カテゴリ：{4} 代替Ｇ：{5}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0034', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(x.PAR_ITM_CD, x.PAR_ITM_SUB1, x.PAR_ITM_SUB2, x.PAR_ITM_SUB3, L_PARM),
						y.BOM_PTN,
						FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M),
						y.CALC_CTG_CD,
						y.ALT_GRP_CD) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF y.PAR_RQMT_QTY <= 0 THEN
					--親必要数には正の数字を設定してください。
					--親品目：{1} 構成パタン：{2} 期：{3} 計算カテゴリ：{4} 子品目：{5} 親必要数：{6}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0039', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(x.PAR_ITM_CD, x.PAR_ITM_SUB1, x.PAR_ITM_SUB2, x.PAR_ITM_SUB3, L_PARM),
						y.BOM_PTN,
						FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M),
						y.CALC_CTG_CD,
						MAPA_COMM.F_TO_DISP_ITM(y.CHD_ITM_CD, y.CHD_ITM_SUB1, y.CHD_ITM_SUB2, y.CHD_ITM_SUB3, L_PARM),
						y.PAR_RQMT_QTY) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF y.MAM_CHD_ITM_CD IS NULL THEN
					--品目マスタに有効な品目として登録されていません。子品目：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0046', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(y.CHD_ITM_CD, y.CHD_ITM_SUB1, y.CHD_ITM_SUB2, y.CHD_ITM_SUB3, L_PARM)) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF L_CHK_FLG = C_ON THEN
					UPDATE	MGW_IMP_BOM w
					SET	w.IMP_ERR_FLG = C_ON
					WHERE	0=0
					AND	w.PAR_ITM_CD = x.PAR_ITM_CD
					AND	w.PAR_ITM_SUB1 = x.PAR_ITM_SUB1
					AND	w.PAR_ITM_SUB2 = x.PAR_ITM_SUB2
					AND	w.PAR_ITM_SUB3 = x.PAR_ITM_SUB3
					AND	w.WG_CD = x.WG_CD
					AND	w.TERM = x.TERM
					AND	w.CALC_CTG_CD = x.CALC_CTG_CD
					AND	w.UPD_USR_ID = G_USR
					;

					G_ERR_FLG := C_ON ;

					GOTO NEXT_LOOP ;
				END IF ;

				k := k + 1 ;

				L_IMP_TMP(k).PAR_ITM_CD := y.PAR_ITM_CD ;
				L_IMP_TMP(k).PAR_ITM_SUB1 := y.PAR_ITM_SUB1 ;
				L_IMP_TMP(k).PAR_ITM_SUB2 := y.PAR_ITM_SUB2 ;
				L_IMP_TMP(k).PAR_ITM_SUB3 := y.PAR_ITM_SUB3 ;
				L_IMP_TMP(k).BOM_PTN := y.BOM_PTN ;
				L_IMP_TMP(k).OPER_CD := y.OPER_CD ;
				L_IMP_TMP(k).OPER_SEQ := y.OPER_SEQ ;
				L_IMP_TMP(k).CHD_ITM_CD := y.CHD_ITM_CD ;
				L_IMP_TMP(k).CHD_ITM_SUB1 := y.CHD_ITM_SUB1 ;
				L_IMP_TMP(k).CHD_ITM_SUB2 := y.CHD_ITM_SUB2 ;
				L_IMP_TMP(k).CHD_ITM_SUB3 := y.CHD_ITM_SUB3 ;
				L_IMP_TMP(k).ALT_GRP_CD := y.ALT_GRP_CD ;
				L_IMP_TMP(k).EXPNS_CD := y.EXPNS_CD ;
				L_IMP_TMP(k).TERM := y.TERM ;
				L_IMP_TMP(k).CALC_CTG_CD := y.CALC_CTG_CD ;
				L_IMP_TMP(k).WG_CD := y.WG_CD ;
				L_IMP_TMP(k).DISP_SEQ := y.DISP_SEQ ;
				L_IMP_TMP(k).PAR_RQMT_QTY := y.PAR_RQMT_QTY ;
				L_IMP_TMP(k).CHD_RQMT_QTY := y.CHD_RQMT_QTY ;
				L_IMP_TMP(k).CHD_BASE_QTY := y.CHD_BASE_QTY ;
				L_IMP_TMP(k).FXD_CHD_RQMT_QTY := y.FXD_CHD_RQMT_QTY ;
				L_IMP_TMP(k).CHD_MIN_QTY := y.CHD_MIN_QTY ;
				L_IMP_TMP(k).CHD_BATCH_QTY := y.CHD_BATCH_QTY ;
				L_IMP_TMP(k).ALT_ITM_RATIO := y.ALT_ITM_RATIO ;
				L_IMP_TMP(k).RMRKS := y.RMRKS ;
				L_IMP_TMP(k).SUB_CHAR1 := y.SUB_CHAR1 ;
				L_IMP_TMP(k).SUB_CHAR2 := y.SUB_CHAR2 ;
				L_IMP_TMP(k).SUB_CHAR3 := y.SUB_CHAR3 ;
				L_IMP_TMP(k).NON_CALC_FLG := y.NON_CALC_FLG ;
			END LOOP ;

			d := d + 1 ;
			L_DEL(d).PAR_ITM_CD := x.PAR_ITM_CD ;
			L_DEL(d).PAR_ITM_SUB1 := x.PAR_ITM_SUB1 ;
			L_DEL(d).PAR_ITM_SUB2 := x.PAR_ITM_SUB2 ;
			L_DEL(d).PAR_ITM_SUB3 := x.PAR_ITM_SUB3 ;
			L_DEL(d).TERM := x.TERM ;
			L_DEL(d).CALC_CTG_CD := x.CALC_CTG_CD ;
			L_DEL(d).WG_CD := x.WG_CD ;

			FOR l IN 1..k LOOP
				i := i + 1 ;
				L_IMP(i) := L_IMP_TMP(l) ;
			END LOOP ;

			IF i > C_MAX_CNT THEN
				FORALL j IN 1..d
					DELETE /*+INDEX(m MGT_BOM_ALL_PK)*/ MGT_BOM m
					WHERE	0=0
					AND	m.PAR_ITM_CD = L_DEL(j).PAR_ITM_CD
					AND	m.PAR_ITM_SUB1 = L_DEL(j).PAR_ITM_SUB1
					AND	m.PAR_ITM_SUB2 = L_DEL(j).PAR_ITM_SUB2
					AND	m.PAR_ITM_SUB3 = L_DEL(j).PAR_ITM_SUB3
					AND	m.TERM = L_DEL(j).TERM
					AND	m.CALC_CTG_CD = L_DEL(j).CALC_CTG_CD
					AND	m.WG_CD = L_DEL(j).WG_CD
					;
				L_DEL.DELETE ;
				d := 0 ;
				FORALL j IN 1..i
					INSERT INTO MGT_BOM VALUES L_IMP(j) ;
				L_IMP.DELETE ;
				i := 0 ;
			END IF ;

			<<NEXT_LOOP>>
				L_IMP_TMP.DELETE ;
		END LOOP ;

		IF i > 0 THEN
			FORALL j IN 1..d
				DELETE /*+INDEX(m MGT_BOM_ALL_PK)*/ MGT_BOM m
				WHERE	0=0
				AND	m.PAR_ITM_CD = L_DEL(j).PAR_ITM_CD
				AND	m.PAR_ITM_SUB1 = L_DEL(j).PAR_ITM_SUB1
				AND	m.PAR_ITM_SUB2 = L_DEL(j).PAR_ITM_SUB2
				AND	m.PAR_ITM_SUB3 = L_DEL(j).PAR_ITM_SUB3
				AND	m.TERM = L_DEL(j).TERM
				AND	m.CALC_CTG_CD = L_DEL(j).CALC_CTG_CD
				AND	m.WG_CD = L_DEL(j).WG_CD
				;
			L_DEL.DELETE ;
			d := 0 ;
			FORALL j IN 1..i
				INSERT INTO MGT_BOM VALUES L_IMP(j) ;
			L_IMP.DELETE ;
		END IF ;

		L_IMP_TMP.DELETE ;
		L_IMP.DELETE ;

	END P_IMP_MGT_MAIN ;

	PROCEDURE P_INS_MGW (
		I_CALC_CTG		IN	MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD			IN	MAPA_META.WG_CD%TYPE,
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_DT			IN	MAPA_META.DT%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	)
	/*********************************************************
	<SYNOPSIS>
			ＢＯＭマスタ用のデータをコピー用ワークテーブルに作成する
	<REMARKS>
			メイン処理を起動するプロシージャ
	<ARGUMENTS>
	<IN>	I_CALC_CTG
			計算カテゴリＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_DT
			対象日
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/
	IS
		L_CALC_CTG	MAPA_META.CALC_CTG_CD%TYPE ;
	BEGIN
		--処理を開始しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_IMP_BOM.P_INS_MGW') ;

		L_CALC_CTG := MGPA_CO_PARM.F_GET_CALC_CTG_CD(I_CALC_CTG) ;

		--メイン処理の起動
		P_INS_MGW_MAIN(L_CALC_CTG, I_WG_CD, I_TERM, I_DT, I_IMP_OPE_TYP) ;

		--処理が終了しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_IMP_BOM.P_INS_MGW') ;

	END P_INS_MGW ;

	PROCEDURE P_IMP_MGT (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	)
	/*********************************************************
	<SYNOPSIS>
			原価マスタ取込(ＢＯＭ)
	<REMARKS>
			メイン処理を起動するプロシージャ
	<ARGUMENTS>
	<IN>	I_TERM
			期
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		--処理を開始しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_IMP_BOM.P_IMP_MGT') ;

		G_USR := FCPA_CONTEXT.F_GET_USERID ;

		G_ERR_FLG := C_OFF ;

		--メイン処理の起動
		P_IMP_MGT_MAIN(I_TERM, I_IMP_OPE_TYP) ;

		--エラーデータ以外は削除
		DELETE	MGW_IMP_BOM w
		WHERE	0=0
		AND	w.IMP_FLG = C_ON
		AND	w.IMP_ERR_FLG = C_OFF
		AND	w.UPD_USR_ID = G_USR
		AND	w.TERM = I_TERM
		AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
				AND w.UPD_SRV_REQ_NO = FCPA_CONTEXT.F_GET_PROCESSID
			OR EXISTS (
				SELECT	'X'
				FROM	MGW_IMP_INTERACTIVE_KEY wk
				WHERE	0=0
				AND	wk.ITM_CD = w.PAR_ITM_CD
				AND	wk.ITM_SUB1 = w.PAR_ITM_SUB1
				AND	wk.ITM_SUB2 = w.PAR_ITM_SUB2
				AND	wk.ITM_SUB3 = w.PAR_ITM_SUB3
				AND	wk.WG_CD = w.WG_CD
				)
			)
		;

		IF G_ERR_FLG = C_ON THEN
			UPDATE	MGW_IMP_BOM w
			SET	IMP_FLG = C_OFF
			WHERE	0=0
			AND	w.IMP_FLG = C_ON
			AND	w.IMP_ERR_FLG = C_ON
			AND	w.UPD_USR_ID = G_USR
			AND	w.TERM = I_TERM
			AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
					AND w.UPD_SRV_REQ_NO = FCPA_CONTEXT.F_GET_PROCESSID
				OR EXISTS (
					SELECT	'X'
					FROM	MGW_IMP_INTERACTIVE_KEY wk
					WHERE	0=0
					AND	wk.ITM_CD = w.PAR_ITM_CD
					AND	wk.ITM_SUB1 = w.PAR_ITM_SUB1
					AND	wk.ITM_SUB2 = w.PAR_ITM_SUB2
					AND	wk.ITM_SUB3 = w.PAR_ITM_SUB3
					AND	wk.WG_CD = w.WG_CD
					)
				)
			;

			COMMIT ;
			FCPA_ERR.RAISE_APP_ERR('MGBDD0057') ;
		END IF ;

		--処理が終了しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_IMP_BOM.P_IMP_MGT') ;

	END P_IMP_MGT ;

	PROCEDURE P_SET_KEY (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_DT			IN	MAPA_META.DT%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			取り込み処理を実行するためのワークテーブルを作成する
	<REMARKS>
			MAW_IMP_ITMをもとにMGW_IMP_INTERACTIVE_KEYを作成する
	<ARGUMENTS>
	<IN>	I_TERM
			期
	<IN>	I_DT
			対象日
	<HISTORY>
	**********************************************************/
	IS
		L_TERM_END_YM	MAPA_META.YM%TYPE ;
	BEGIN
		SELECT	MAX(m.TERM_END_YM)
		INTO	L_TERM_END_YM
		FROM	MAM_TERM m
		WHERE	0=0
		AND	m.TERM = I_TERM
		;

		DELETE MGW_IMP_INTERACTIVE_KEY ;
		INSERT INTO MGW_IMP_INTERACTIVE_KEY (
			ITM_CD,
			ITM_SUB1,
			ITM_SUB2,
			ITM_SUB3,
			WG_CD
			)
		SELECT	/*+ORDERED*/
			DISTINCT
			x.PAR_ITM_CD,
			x.PAR_ITM_SUB1,
			x.PAR_ITM_SUB2,
			x.PAR_ITM_SUB3,
			x.WG_CD
		FROM	MAW_IMP_ITM w, MAM_BOM x
		WHERE	0=0
		AND	w.ITM_CD = x.PAR_ITM_CD
		AND	w.ITM_SUB1 = x.PAR_ITM_SUB1
		AND	w.ITM_SUB2 = x.PAR_ITM_SUB2
		AND	w.ITM_SUB3 = x.PAR_ITM_SUB3
		AND	(
			I_DT IS NOT NULL AND x.ST_DT <= I_DT AND x.END_DT >= I_DT
			OR
			I_DT IS NULL AND x.ST_DT < L_TERM_END_YM AND x.END_DT >= I_TERM
			)
		AND	x.DEL_FLG = C_OFF
		AND	x.NOT_COST_FLG = C_OFF
		;

	END P_SET_KEY ;

END MGPA_IMP_BOM ;
/
