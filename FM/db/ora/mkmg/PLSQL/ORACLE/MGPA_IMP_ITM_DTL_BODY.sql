CREATE OR REPLACE PACKAGE BODY MGPA_IMP_ITM_DTL
IS
	C_OFF		CONSTANT MAPA_META.FLG%TYPE := '0' ;
	C_ON		CONSTANT MAPA_META.FLG%TYPE := '1' ;

	C_MAX_CNT	CONSTANT INTEGER := 50000 ; --バルクインサートでの最大レコード数
	C_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

	G_ERR_FLG	MAPA_META.FLG%TYPE ;
	G_USR		MAPA_META.USR_CD%TYPE ;

	G_LOG_NO	MAPA_META.BATCH_LOG_NO%TYPE ;
	G_LOG_SUB_KEY1	MAPA_META.BATCH_LOG_SUB_KEY1%TYPE ;
	G_LOG_SUB_KEY2	MAPA_META.BATCH_LOG_SUB_KEY2%TYPE ;

	PROCEDURE P_INS_MGW_MAIN (
		I_CALC_CTG		IN	MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD			IN	MAPA_META.WG_CD%TYPE,
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_DT			IN	MAPA_META.DT%TYPE,
		I_IMP_CMN_MFG_FLG	IN	MAPA_META.FLG%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			品目詳細マスタ用のデータをコピー用ワークテーブルに作成する
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
	<IN>	I_IMP_CMN_MFG_FLG
			共通製造データ取込ＦＬＧ
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/
	IS
		L_CALC_CTG_CD		MAPA_META.CALC_CTG_CD%TYPE ;
		L_WG_CD			MAPA_META.WG_CD%TYPE ;
		L_CNT	INTEGER ;
	BEGIN
		-- 個別取込ならデフォルトの計算カテゴリＣＤを使いその他の引数は無視する
		IF I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.INTERACTIVE THEN
			L_CALC_CTG_CD := MGPA_CO_PARM.F_GET_CALC_CTG_CD(NULL) ;
			L_WG_CD := NULL ;
		ELSE
			L_CALC_CTG_CD := I_CALC_CTG;
			L_WG_CD := I_WG_CD ;
		END IF;

		DELETE	MGW_IMP_ITM_DTL w
		WHERE	0=0
		AND	w.CALC_CTG_CD = L_CALC_CTG_CD
		AND	w.TERM = I_TERM
		AND	(L_WG_CD IS NULL OR w.WG_CD = L_WG_CD)
		AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
				OR EXISTS (
					SELECT	'X'
					FROM	MGW_IMP_INTERACTIVE_KEY wk
					WHERE	0=0
					AND	wk.ITM_CD = w.ITM_CD
					AND	wk.ITM_SUB1 = w.ITM_SUB1
					AND	wk.ITM_SUB2 = w.ITM_SUB2
					AND	wk.ITM_SUB3 = w.ITM_SUB3
					AND	wk.WG_CD = w.WG_CD
				)
			)
		;

		SELECT COUNT(*) INTO L_CNT FROM MGW_WG ;

		/*** ＳＣＭのマスタからコピーする ***/
		INSERT INTO MGW_IMP_ITM_DTL (
			ITM_CD,
			ITM_SUB1,
			ITM_SUB2,
			ITM_SUB3,
			LOC_CD,
			SPPL_CD,
			RQST_WG_CD,
			TERM,
			CALC_CTG_CD,
			WG_CD,
			COST_RATIO,
			OPER_PTN,
			BOM_PTN,
			MIN_LOT_QTY,
			BATCH_LOT_QTY,
			FXD_LOT_QTY,
			FXD_YIELD_QTY,
			NMR_QTY,
			DNM_QTY,
			ALC_DPT_CD,
			EXP_DPT_CD,
			EXP_PRIO,
			MAX_QTY,
			ALC_VAL1,
			ALC_VAL2,
			ALC_VAL3,
			ALC_VAL4,
			ALC_VAL5,
			RMRKS,
			SUB_CHAR1,
			SUB_CHAR2,
			SUB_CHAR3,
			NON_CALC_FLG,
			IMP_ERR_FLG,
			IMP_FLG
			)
		SELECT
			m01.ITM_CD,
			m01.ITM_SUB1,
			m01.ITM_SUB2,
			m01.ITM_SUB3,
			m01.MFG_LOC_CD,
			m01.SPPL_CD,
			m01.RQST_WG_CD,
			m01.TERM,
			L_CALC_CTG_CD,
			m01.WG_CD,
			m01.COST_RATIO,
			m01.OPER_PTN,
			m01.BOM_PTN,
			m01.MIN_LOT_QTY,
			m01.BATCH_LOT_QTY,
			m01.MAX_LOT_QTY,
			m01.FXD_RQMT_QTY,
			m01.YIELD_SCHD_QTY,
			m01.MFG_INST_QTY,
			m01.ALC_DPT_CD,
			m01.EXP_DPT_CD,
			m01.PRIO,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			m01.MEMO1,
			NULL,
			NULL,
			NULL,
			C_OFF,
			C_OFF,
			CASE I_IMP_OPE_TYP
				WHEN MGC_IMP_OPE_TYP.INTERACTIVE THEN C_ON
				ELSE C_OFF
			END
		FROM	(
			-- 製造品
			SELECT
				m21.ITM_CD,
				m21.ITM_SUB1,
				m21.ITM_SUB2,
				m21.ITM_SUB3,
				m21.MFG_LOC_CD,
				m21.SPPL_CD,
				C_NULL_VAL AS RQST_WG_CD,
				m23.TERM,
				DECODE(I_IMP_CMN_MFG_FLG, C_ON, C_NULL_VAL, m21.WG_CD) WG_CD,
				m21.BOM_PTN,
				NVL(m21.COST_RATIO, m21.ORDER_RATIO) AS COST_RATIO,
				DECODE(m21.OPER_PTN, MAC_STR.NULL_VAL, NULL, m21.OPER_PTN) AS OPER_PTN,
				m21.MIN_LOT_QTY,
				m21.BATCH_LOT_QTY,
				m21.MAX_LOT_QTY,
				NVL(m21.FXD_RQMT_QTY, 0) AS FXD_RQMT_QTY,
				m21.YIELD_SCHD_QTY,
				m21.MFG_INST_QTY,
				NULL AS ALC_DPT_CD,
				MGPA_COST_IF.F_GET_DPT(
					MAPA_DPT.F_GET_DPT_CD_NE(
						MAPA_LOC.F_GET_ASST_DPT_CD_NE(m21.MFG_LOC_CD, NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT)), C_ON),
						NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT))),
					NULL,
					NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT)),
					C_OFF) AS EXP_DPT_CD,
				m21.PRIO,
				m21.MEMO1,
				ROW_NUMBER() OVER (PARTITION BY
					m21.ITM_CD,
					m21.ITM_SUB1,
					m21.ITM_SUB2,
					m21.ITM_SUB3,
					m21.MFG_LOC_CD,
					DECODE(I_IMP_CMN_MFG_FLG, C_ON, C_NULL_VAL, m21.WG_CD) ORDER BY m21.BOM_PTN, m21.ST_DT) AS RN
			FROM	MAM_ITM_DTL_ m21, MAM_ITM_SRCH m22, MAM_TERM m23
			WHERE	0=0
			AND	m21.ITM_CD = m22.ITM_CD
			AND	m21.ITM_SUB1 = m22.ITM_SUB1
			AND	m21.ITM_SUB2 = m22.ITM_SUB2
			AND	m21.ITM_SUB3 = m22.ITM_SUB3
			AND (
				I_DT IS NOT NULL AND m21.ST_DT <= I_DT AND m21.END_DT >= I_DT
				OR
				I_DT IS NULL AND m21.ST_DT < m23.TERM_END_YM AND m21.END_DT >= m23.TERM
				)
			AND	m21.DEL_FLG = C_OFF
			AND	(I_IMP_CMN_MFG_FLG = C_ON OR m21.WG_CD <> C_NULL_VAL) -- 共通製造データ取込ＦＬＧ＝オンのときのみ製造品の共通データを作成可能
			AND	m21.MFG_LOC_CD <> C_NULL_VAL
			AND	m21.SPPL_CD = C_NULL_VAL
			AND	m21.MAKER_CD = C_NULL_VAL
			AND	m21.RQST_LOC_CD = C_NULL_VAL
			AND	m22.DEL_FLG = C_OFF
			AND	m23.TERM = I_TERM
			AND	NVL(m21.COST_RATIO, m21.ORDER_RATIO) > 0
			AND	(I_IMP_CMN_MFG_FLG = C_OFF AND (L_WG_CD IS NULL OR m21.WG_CD = L_WG_CD)
				OR I_IMP_CMN_MFG_FLG = C_ON AND (L_CNT = 0 OR EXISTS (SELECT 'X' FROM MGW_WG w WHERE w.WG_CD = m21.WG_CD)))
			AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
					OR EXISTS (
						SELECT	'X'
						FROM	MGW_IMP_INTERACTIVE_KEY wk
						WHERE	0=0
						AND	wk.ITM_CD = m21.ITM_CD
						AND	wk.ITM_SUB1 = m21.ITM_SUB1
						AND	wk.ITM_SUB2 = m21.ITM_SUB2
						AND	wk.ITM_SUB3 = m21.ITM_SUB3
						AND	wk.WG_CD = m21.WG_CD
					)
				)
			UNION ALL
			-- 購買品
			SELECT
				m21.ITM_CD,
				m21.ITM_SUB1,
				m21.ITM_SUB2,
				m21.ITM_SUB3,
				m21.MFG_LOC_CD,
				m21.SPPL_CD,
				C_NULL_VAL AS RQST_WG_CD,
				m23.TERM,
				m21.WG_CD,
				C_NULL_VAL AS BOM_PTN,
				NVL(m21.COST_RATIO, m21.ORDER_RATIO) AS COST_RATIO,
				m21.OPER_PTN,
				m21.MIN_LOT_QTY,
				m21.BATCH_LOT_QTY,
				m21.MAX_LOT_QTY,
				NVL(m21.FXD_RQMT_QTY, 0) AS FXD_RQMT_QTY,
				m21.YIELD_SCHD_QTY,
				m21.MFG_INST_QTY,
				MGPA_COST_IF.F_GET_DPT(
					MAPA_DPT.F_GET_DPT_CD_NE(NVL(m24.PURC_DPT_CD, m25.DPT_CD), NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT))),
					NULL,
					NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT)),
					C_OFF) AS ALC_DPT_CD,
				NULL AS EXP_DPT_CD,
				m21.PRIO,
				m21.MEMO1,
				ROW_NUMBER() OVER (
					PARTITION BY
						m21.ITM_CD,
						m21.ITM_SUB1,
						m21.ITM_SUB2,
						m21.ITM_SUB3,
						m21.SPPL_CD,
						m21.WG_CD
					ORDER BY
						CASE m21.MAKER_CD WHEN C_NULL_VAL THEN NULL ELSE m21.MAKER_CD END NULLS FIRST,
						m21.ST_DT
					) AS RN
			FROM	MAM_ITM_DTL_ m21, MAM_ITM_SRCH m22, MAM_TERM m23, MAM_SPPL_USR m24
					, MAM_USR_ACL m25
			WHERE	0=0
			AND	m21.ITM_CD = m22.ITM_CD
			AND	m21.ITM_SUB1 = m22.ITM_SUB1
			AND	m21.ITM_SUB2 = m22.ITM_SUB2
			AND	m21.ITM_SUB3 = m22.ITM_SUB3
			AND (
				I_DT IS NOT NULL AND m21.ST_DT <= I_DT AND m21.END_DT >= I_DT
				OR
				I_DT IS NULL AND m21.ST_DT < m23.TERM_END_YM AND m21.END_DT >= m23.TERM
				)
			AND	m21.SPPL_CD = m24.SPPL_CD(+)
			AND	GREATEST(I_TERM, m21.ST_DT) BETWEEN m24.ST_DT(+) AND m24.END_DT(+)
			AND	m24.PURC_USR_CD = m25.USR_CD(+)
			AND	GREATEST(I_TERM, m24.ST_DT) BETWEEN m25.ST_DT(+) AND m25.END_DT(+)
			AND	m21.DEL_FLG = C_OFF
			AND	m21.MFG_LOC_CD = C_NULL_VAL
			AND	m21.SPPL_CD <> C_NULL_VAL
			AND	m21.RQST_LOC_CD = C_NULL_VAL
			AND	m21.BOM_PTN = C_NULL_VAL
			AND	m22.DEL_FLG = C_OFF
			AND	m23.TERM = I_TERM
			AND	m21.PURC_ID_TYP IN (MAC_PURC_ID_TYP.PURC, MAC_PURC_ID_TYP.ONR_RCV, MAC_PURC_ID_TYP.VMI)
			AND	NVL(m21.COST_RATIO, m21.ORDER_RATIO) > 0
			AND	(L_WG_CD IS NULL OR m21.WG_CD = L_WG_CD)
			AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
					OR EXISTS (
						SELECT	'X'
						FROM	MGW_IMP_INTERACTIVE_KEY wk
						WHERE	0=0
						AND	wk.ITM_CD = m21.ITM_CD
						AND	wk.ITM_SUB1 = m21.ITM_SUB1
						AND	wk.ITM_SUB2 = m21.ITM_SUB2
						AND	wk.ITM_SUB3 = m21.ITM_SUB3
						AND	wk.WG_CD = m21.WG_CD
					)
				)
			UNION ALL
			-- 依頼品
			SELECT
				m21.ITM_CD,
				m21.ITM_SUB1,
				m21.ITM_SUB2,
				m21.ITM_SUB3,
				m21.MFG_LOC_CD,
				m21.SPPL_CD,
				m24.WG_CD AS RQST_WG_CD,
				m23.TERM,
				m21.WG_CD,
				C_NULL_VAL AS BOM_PTN,
				NVL(m21.COST_RATIO, m21.ORDER_RATIO) AS COST_RATIO,
				m21.OPER_PTN,
				m21.MIN_LOT_QTY,
				m21.BATCH_LOT_QTY,
				m21.MAX_LOT_QTY,
				NVL(m21.FXD_RQMT_QTY, 0) AS FXD_RQMT_QTY,
				m21.YIELD_SCHD_QTY,
				m21.MFG_INST_QTY,
				NULL AS ALC_DPT_CD,
				MGPA_COST_IF.F_GET_DPT(
					MAPA_DPT.F_GET_DPT_CD_NE(
						MAPA_LOC.F_GET_ASST_DPT_CD_NE(m21.RQST_LOC_CD, NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT)), C_ON),
						NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT))),
					NULL,
					NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT)),
					C_OFF) AS EXP_DPT_CD,
				m21.PRIO,
				m21.MEMO1,
				ROW_NUMBER() OVER (
					PARTITION BY
						m21.ITM_CD,
						m21.ITM_SUB1,
						m21.ITM_SUB2,
						m21.ITM_SUB3,
						m24.WG_CD,
						m21.WG_CD
					ORDER BY
						m21.ST_DT
					) AS RN
			FROM	MAM_ITM_DTL_ m21, MAM_ITM_SRCH m22, MAM_TERM m23, MAM_LOC m24
			WHERE	0=0
			AND	m21.ITM_CD = m22.ITM_CD
			AND	m21.ITM_SUB1 = m22.ITM_SUB1
			AND	m21.ITM_SUB2 = m22.ITM_SUB2
			AND	m21.ITM_SUB3 = m22.ITM_SUB3
			AND (
				I_DT IS NOT NULL AND m21.ST_DT <= I_DT AND m21.END_DT >= I_DT
				OR
				I_DT IS NULL AND m21.ST_DT < m23.TERM_END_YM AND m21.END_DT >= m23.TERM
				)
			AND	m21.RQST_LOC_CD = m24.LOC_CD(+)
			AND	m21.DEL_FLG = C_OFF
			AND	m21.MFG_LOC_CD = C_NULL_VAL
			AND	m21.SPPL_CD = C_NULL_VAL
			AND	m21.MAKER_CD = C_NULL_VAL
			AND	m21.RQST_LOC_CD <> C_NULL_VAL
			AND	m21.BOM_PTN = C_NULL_VAL
			AND	m22.DEL_FLG = C_OFF
			AND	m23.TERM = I_TERM
			AND	m24.DEL_FLG = C_OFF
			AND	NVL(m21.COST_RATIO, m21.ORDER_RATIO) > 0
			AND	(L_WG_CD IS NULL OR m21.WG_CD = L_WG_CD)
			AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
					OR EXISTS (
						SELECT	'X'
						FROM	MGW_IMP_INTERACTIVE_KEY wk
						WHERE	0=0
						AND	wk.ITM_CD = m21.ITM_CD
						AND	wk.ITM_SUB1 = m21.ITM_SUB1
						AND	wk.ITM_SUB2 = m21.ITM_SUB2
						AND	wk.ITM_SUB3 = m21.ITM_SUB3
						AND	wk.WG_CD = m21.WG_CD
					)
				)
			) m01
		WHERE	0=0
		AND	m01.RN = 1
		ORDER BY
			m01.ITM_CD, m01.ITM_SUB1, m01.ITM_SUB2, m01.ITM_SUB3, m01.MFG_LOC_CD, m01.SPPL_CD, m01.RQST_WG_CD
		;

	END P_INS_MGW_MAIN ;

	PROCEDURE P_IMP_MGT_MAIN (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			原価マスタ取込(品目詳細)
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
		TYPE IMP_LIST IS TABLE OF MGT_ITM_DTL%ROWTYPE INDEX BY BINARY_INTEGER ;
		L_IMP		IMP_LIST ;
		L_IMP_TMP	IMP_LIST ;

		i		INTEGER := 0 ;
		k		INTEGER := 0 ;

		L_CHK_FLG	MAPA_META.FLG%TYPE ;
		L_PARM		MAPA_META.PARM_VAL%TYPE ;
		L_CALC_CTG_CD	MAPA_META.CALC_CTG_CD%TYPE ;
	BEGIN
		--確定品目は削除
		MGPA_FIX_DEL.P_ITM_DTL(G_USR, I_TERM) ;

		L_PARM := MAPA_COMM.F_GET_PARM('ITM_SUB_TYP') ;

		-- 個別取込ならデフォルトの計算カテゴリＣＤを使う
		IF I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.INTERACTIVE THEN
			L_CALC_CTG_CD := MGPA_CO_PARM.F_GET_CALC_CTG_CD(NULL);
		ELSE
			L_CALC_CTG_CD := NULL;
		END IF;

		FOR x IN (
			SELECT	t.*,
				m.ASSET_MNG_TYP ASSET_MNG_TYP
			FROM	(
				SELECT	DISTINCT
					w.ITM_CD,
					w.ITM_SUB1,
					w.ITM_SUB2,
					w.ITM_SUB3,
					w.WG_CD,
					w.TERM,
					w.CALC_CTG_CD
				FROM	MGW_IMP_ITM_DTL w
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
							AND	wk.ITM_CD = w.ITM_CD
							AND	wk.ITM_SUB1 = w.ITM_SUB1
							AND	wk.ITM_SUB2 = w.ITM_SUB2
							AND	wk.ITM_SUB3 = w.ITM_SUB3
							AND	wk.WG_CD = w.WG_CD
						)
					)
				) t,
				MAM_ITM_SRCH m
			WHERE	0=0
			AND	t.ITM_CD = m.ITM_CD(+)
			AND	t.ITM_SUB1 = m.ITM_SUB1(+)
			AND	t.ITM_SUB2 = m.ITM_SUB2(+)
			AND	t.ITM_SUB3 = m.ITM_SUB3(+)
			AND	m.DEL_FLG(+) = C_OFF
			)
		LOOP
			/*** 品目チェック処理、エラーとなった品目と同じ品目のワークのデータは全件をエラーとして、取り込まない ***/
			IF x.ASSET_MNG_TYP IS NULL THEN
				-- 品目マスタに有効な品目として登録されていません。品目：{1}
				FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0023', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
					MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM)) ;

				UPDATE	MGW_IMP_ITM_DTL w
				SET	w.IMP_ERR_FLG = C_ON
				WHERE	0=0
				AND	w.ITM_CD = x.ITM_CD
				AND	w.ITM_SUB1 = x.ITM_SUB1
				AND	w.ITM_SUB2 = x.ITM_SUB2
				AND	w.ITM_SUB3 = x.ITM_SUB3
				AND	w.WG_CD = x.WG_CD
				AND	w.CALC_CTG_CD = x.CALC_CTG_CD
				AND	w.IMP_FLG = C_ON
				AND	w.TERM = I_TERM
				AND	w.UPD_USR_ID = G_USR
				;

				G_ERR_FLG := C_ON ;

				GOTO NEXT_LOOP ;
			END IF ;

			k := 0 ;
			FOR y IN (
				SELECT /*+INDEX(w MGW_IMP_ITM_DTL_ALL_IE03)*/
					w.ITM_CD,
					w.ITM_SUB1,
					w.ITM_SUB2,
					w.ITM_SUB3,
					w.LOC_CD,
					w.SPPL_CD,
					w.RQST_WG_CD,
					w.TERM,
					w.CALC_CTG_CD,
					w.WG_CD,
					w.COST_RATIO,
					w.OPER_PTN,
					w.BOM_PTN,
					w.MIN_LOT_QTY,
					w.BATCH_LOT_QTY,
					w.FXD_LOT_QTY,
					w.FXD_YIELD_QTY,
					w.NMR_QTY,
					w.DNM_QTY,
					w.ALC_DPT_CD,
					w.EXP_DPT_CD,
					w.EXP_PRIO,
					w.MAX_QTY,
					w.ALC_VAL1,
					w.ALC_VAL2,
					w.ALC_VAL3,
					w.ALC_VAL4,
					w.ALC_VAL5,
					w.RMRKS,
					w.SUB_CHAR1,
					w.SUB_CHAR2,
					w.SUB_CHAR3,
					w.NON_CALC_FLG,
					m1.BP_CD	MAM_BP_CD,
					m2.DPT_CD	MAM_ALC_DPT_CD,
					m3.DPT_CD	MAM_EXP_DPT_CD,
					m4.LOC_CD	MAM_LOC_CD,
					m5.WG_CD	MAM_WG_CD,
					DECODE(w.LOC_CD, C_NULL_VAL, 0, 1)+DECODE(w.SPPL_CD, C_NULL_VAL, 0, 1)+DECODE(w.RQST_WG_CD, C_NULL_VAL, 0, 1)	CNT
				FROM	MGW_IMP_ITM_DTL w,
					MAM_BP m1, MAM_COST_DPT m2, MAM_COST_DPT m3, MAM_LOC m4, MAM_WG m5
				WHERE	0=0
				AND	w.SPPL_CD = m1.BP_CD(+)
				AND	w.ALC_DPT_CD = m2.DPT_CD(+)
				AND	w.TERM = m2.TERM(+)
				AND	w.EXP_DPT_CD = m3.DPT_CD(+)
				AND	w.TERM = m3.TERM(+)
				AND	w.LOC_CD = m4.LOC_CD(+)
				AND	w.RQST_WG_CD = m5.WG_CD(+)
				AND	w.ITM_CD = x.ITM_CD
				AND	w.ITM_SUB1 = x.ITM_SUB1
				AND	w.ITM_SUB2 = x.ITM_SUB2
				AND	w.ITM_SUB3 = x.ITM_SUB3
				AND	w.WG_CD = x.WG_CD
				AND	w.TERM = x.TERM
				AND	w.CALC_CTG_CD = x.CALC_CTG_CD
				AND	w.UPD_USR_ID = G_USR
				AND	w.IMP_FLG = C_ON
				)
			LOOP
				L_CHK_FLG := C_OFF ;

				/*** 取込対象データのチェック、品目、ワーキンググループ、期、計算カテゴリ、ユーザ単位でチェックする ***/
				IF MAC_ASSET_MNG_TYP.IS_MNG(x.ASSET_MNG_TYP) = C_OFF AND y.LOC_CD <> C_NULL_VAL THEN
					--資産管理しない品目に対して場所を設定することはできません。品目：{1} 場所：{2}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0027', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
						y.LOC_CD) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF y.CNT = 0 THEN
					--場所と発注先と依頼先ワーキンググループがいずれも設定されていません。品目：{1} ワーキンググループ：{2}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0048', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
						x.WG_CD) ;
					L_CHK_FLG := C_ON ;
				ELSIF y.CNT > 1 THEN
					--場所と発注先と依頼先ワーキンググループのうち、いずれか1つのみを指定してください。品目：{1} 場所：{2} 発注先：{3} 依頼先ワーキンググループ：{4}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0028', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
						y.LOC_CD,
						y.SPPL_CD,
						y.RQST_WG_CD) ;
					L_CHK_FLG := C_ON ;
				ELSIF y.LOC_CD <> C_NULL_VAL AND y.MAM_LOC_CD IS NULL THEN
					--場所マスタに有効な場所として登録されていません。場所：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0025', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						y.LOC_CD) ;
					L_CHK_FLG := C_ON ;
				ELSIF y.SPPL_CD <> C_NULL_VAL AND y.MAM_BP_CD IS NULL THEN
					--取引先マスタに有効な取引先として登録されていません。発注先：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0059', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						y.SPPL_CD) ;
					L_CHK_FLG := C_ON ;
				ELSIF y.RQST_WG_CD <> C_NULL_VAL AND y.MAM_WG_CD IS NULL THEN
					--ワーキンググループマスタに有効なワーキンググループとして登録されていません。依頼先ワーキンググループ：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0066', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						y.RQST_WG_CD) ;
					L_CHK_FLG := C_ON ;
				ELSIF y.WG_CD <> C_NULL_VAL AND y.RQST_WG_CD = y.WG_CD THEN
					--依頼先ワーキンググループにワーキンググループと同じ値を指定できません。依頼先ワーキンググループ：{1} ワーキンググループ：{2}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0067', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						y.RQST_WG_CD,
						y.WG_CD) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF y.ALC_DPT_CD IS NOT NULL AND y.MAM_ALC_DPT_CD IS NULL THEN
					--原価部門マスタに登録されていません。部門：{1} 期：{2}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0041', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						y.ALC_DPT_CD,
						FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M)) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF y.EXP_DPT_CD IS NOT NULL AND y.MAM_EXP_DPT_CD IS NULL THEN
					--原価部門マスタに登録されていません。部門：{1} 期：{2}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0041', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						y.EXP_DPT_CD,
						FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M)) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF L_CHK_FLG = C_ON THEN
					UPDATE	MGW_IMP_ITM_DTL w
					SET	w.IMP_ERR_FLG = C_ON
					WHERE	0=0
					AND	w.ITM_CD = x.ITM_CD
					AND	w.ITM_SUB1 = x.ITM_SUB1
					AND	w.ITM_SUB2 = x.ITM_SUB2
					AND	w.ITM_SUB3 = x.ITM_SUB3
					AND	w.WG_CD = x.WG_CD
					AND	w.TERM = x.TERM
					AND	w.CALC_CTG_CD = x.CALC_CTG_CD
					AND	w.UPD_USR_ID = G_USR
					;

					G_ERR_FLG := C_ON ;

					GOTO NEXT_LOOP ;
				END IF ;

				k := k + 1 ;

				L_IMP_TMP(k).ITM_CD := y.ITM_CD ;
				L_IMP_TMP(k).ITM_SUB1 := y.ITM_SUB1 ;
				L_IMP_TMP(k).ITM_SUB2 := y.ITM_SUB2 ;
				L_IMP_TMP(k).ITM_SUB3 := y.ITM_SUB3 ;
				L_IMP_TMP(k).LOC_CD := y.LOC_CD ;
				L_IMP_TMP(k).SPPL_CD := y.SPPL_CD ;
				L_IMP_TMP(k).RQST_WG_CD := y.RQST_WG_CD ;
				L_IMP_TMP(k).TERM := y.TERM ;
				L_IMP_TMP(k).CALC_CTG_CD := y.CALC_CTG_CD ;
				L_IMP_TMP(k).WG_CD := y.WG_CD ;
				L_IMP_TMP(k).COST_RATIO := y.COST_RATIO ;
				L_IMP_TMP(k).OPER_PTN := y.OPER_PTN ;
				L_IMP_TMP(k).BOM_PTN := y.BOM_PTN ;
				L_IMP_TMP(k).MIN_LOT_QTY := y.MIN_LOT_QTY ;
				L_IMP_TMP(k).BATCH_LOT_QTY := y.BATCH_LOT_QTY ;
				L_IMP_TMP(k).FXD_LOT_QTY := y.FXD_LOT_QTY ;
				L_IMP_TMP(k).FXD_YIELD_QTY := y.FXD_YIELD_QTY ;
				L_IMP_TMP(k).NMR_QTY := y.NMR_QTY ;
				L_IMP_TMP(k).DNM_QTY := y.DNM_QTY ;
				L_IMP_TMP(k).ALC_DPT_CD := y.ALC_DPT_CD ;
				L_IMP_TMP(k).EXP_DPT_CD := y.EXP_DPT_CD ;
				L_IMP_TMP(k).EXP_PRIO := y.EXP_PRIO ;
				L_IMP_TMP(k).MAX_QTY := y.MAX_QTY ;
				L_IMP_TMP(k).ALC_VAL1 := y.ALC_VAL1 ;
				L_IMP_TMP(k).ALC_VAL2 := y.ALC_VAL2 ;
				L_IMP_TMP(k).ALC_VAL3 := y.ALC_VAL3 ;
				L_IMP_TMP(k).ALC_VAL4 := y.ALC_VAL4 ;
				L_IMP_TMP(k).ALC_VAL5 := y.ALC_VAL5 ;
				L_IMP_TMP(k).RMRKS := y.RMRKS ;
				L_IMP_TMP(k).SUB_CHAR1 := y.SUB_CHAR1 ;
				L_IMP_TMP(k).SUB_CHAR2 := y.SUB_CHAR2 ;
				L_IMP_TMP(k).SUB_CHAR3 := y.SUB_CHAR3 ;
				L_IMP_TMP(k).NON_CALC_FLG := y.NON_CALC_FLG ;
			END LOOP ;

			FOR l IN 1..k LOOP
				i := i + 1 ;
				L_IMP(i) := L_IMP_TMP(l) ;
			END LOOP ;

			IF i > C_MAX_CNT THEN
				FORALL j IN 1..i
					DELETE /*+INDEX(m MGT_ITM_DTL_ALL_PK)*/ MGT_ITM_DTL m
					WHERE	0=0
					AND	m.ITM_CD = L_IMP(j).ITM_CD
					AND	m.ITM_SUB1 = L_IMP(j).ITM_SUB1
					AND	m.ITM_SUB2 = L_IMP(j).ITM_SUB2
					AND	m.ITM_SUB3 = L_IMP(j).ITM_SUB3
					AND	m.TERM = L_IMP(j).TERM
					AND	m.CALC_CTG_CD = L_IMP(j).CALC_CTG_CD
					AND	m.WG_CD = L_IMP(j).WG_CD
					;
				FORALL j IN 1..i
					INSERT INTO MGT_ITM_DTL VALUES L_IMP(j) ;
				L_IMP.DELETE ;
				i := 0 ;
			END IF ;

			<<NEXT_LOOP>>
				L_IMP_TMP.DELETE ;
		END LOOP ;

		IF i > 0 THEN
			FORALL j IN 1..i
				DELETE /*+INDEX(m MGT_ITM_DTL_ALL_PK)*/ MGT_ITM_DTL m
				WHERE	0=0
				AND	m.ITM_CD = L_IMP(j).ITM_CD
				AND	m.ITM_SUB1 = L_IMP(j).ITM_SUB1
				AND	m.ITM_SUB2 = L_IMP(j).ITM_SUB2
				AND	m.ITM_SUB3 = L_IMP(j).ITM_SUB3
				AND	m.TERM = L_IMP(j).TERM
				AND	m.CALC_CTG_CD = L_IMP(j).CALC_CTG_CD
				AND	m.WG_CD = L_IMP(j).WG_CD
				;
			FORALL j IN 1..i
				INSERT INTO MGT_ITM_DTL VALUES L_IMP(j) ;
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
		I_IMP_CMN_MFG_FLG	IN	MAPA_META.FLG%TYPE DEFAULT '0',
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	)
	/*********************************************************
	<SYNOPSIS>
			品目詳細マスタ用のデータをコピー用ワークテーブルに作成する
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
	<IN>	I_IMP_CMN_MFG_FLG
			共通製造データ取込ＦＬＧ
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/
	IS
		L_CALC_CTG	MAPA_META.CALC_CTG_CD%TYPE ;
	BEGIN
		--処理を開始しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_IMP_ITM_DTL.P_INS_MGW') ;

		L_CALC_CTG := MGPA_CO_PARM.F_GET_CALC_CTG_CD(I_CALC_CTG);

		--メイン処理の起動
		P_INS_MGW_MAIN(L_CALC_CTG, I_WG_CD, I_TERM, I_DT, I_IMP_CMN_MFG_FLG, I_IMP_OPE_TYP) ;

		--処理が終了しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_IMP_ITM_DTL.P_INS_MGW') ;

	END P_INS_MGW ;

	PROCEDURE P_IMP_MGT (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	)
	/*********************************************************
	<SYNOPSIS>
			原価マスタ取込(品目詳細)
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
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_IMP_ITM_DTL.P_IMP_MGT') ;

		G_USR := FCPA_CONTEXT.F_GET_USERID ;

		G_ERR_FLG := C_OFF ;

		--メイン処理の起動
		P_IMP_MGT_MAIN(I_TERM, I_IMP_OPE_TYP) ;

		--エラーデータ以外は削除
		DELETE	MGW_IMP_ITM_DTL w
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
				AND	wk.ITM_CD = w.ITM_CD
				AND	wk.ITM_SUB1 = w.ITM_SUB1
				AND	wk.ITM_SUB2 = w.ITM_SUB2
				AND	wk.ITM_SUB3 = w.ITM_SUB3
				AND	wk.WG_CD = w.WG_CD
				)
			)
		;

		IF G_ERR_FLG = C_ON THEN
			UPDATE	MGW_IMP_ITM_DTL w
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
					AND	wk.ITM_CD = w.ITM_CD
					AND	wk.ITM_SUB1 = w.ITM_SUB1
					AND	wk.ITM_SUB2 = w.ITM_SUB2
					AND	wk.ITM_SUB3 = w.ITM_SUB3
					AND	wk.WG_CD = w.WG_CD
					)
				)
			;

			COMMIT ;
			FCPA_ERR.RAISE_APP_ERR('MGBDD0057') ;
		END IF ;

		--処理が終了しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_IMP_ITM_DTL.P_IMP_MGT') ;

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
			x.ITM_CD,
			x.ITM_SUB1,
			x.ITM_SUB2,
			x.ITM_SUB3,
			x.WG_CD
		FROM	MAW_IMP_ITM w, MAM_ITM_DTL_ x
		WHERE	0=0
		AND	w.ITM_CD = x.ITM_CD
		AND	w.ITM_SUB1 = x.ITM_SUB1
		AND	w.ITM_SUB2 = x.ITM_SUB2
		AND	w.ITM_SUB3 = x.ITM_SUB3
		AND	(
			I_DT IS NOT NULL AND x.ST_DT <= I_DT AND x.END_DT >= I_DT
			OR
			I_DT IS NULL AND x.ST_DT < L_TERM_END_YM AND x.END_DT >= I_TERM
			)
		AND	x.DEL_FLG = C_OFF
		;

	END P_SET_KEY ;

END MGPA_IMP_ITM_DTL ;
/
