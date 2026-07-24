CREATE OR REPLACE PACKAGE BODY MGPA_IMP_ITM_OPER
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
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			品目工程マスタ用のデータをコピー用ワークテーブルに作成する
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

		DELETE	MGW_IMP_ITM_OPER w
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

		/*** ＳＣＭのマスタからコピーする ***/
		INSERT INTO MGW_IMP_ITM_OPER (
			ITM_CD,
			ITM_SUB1,
			ITM_SUB2,
			ITM_SUB3,
			LOC_CD,
			OPER_PTN,
			OPER_CD,
			OPER_SEQ,
			TERM,
			CALC_CTG_CD,
			WG_CD,
			DISP_SEQ,
			NMR_QTY,
			DNM_QTY,
			YIELD_OPER_FLG,
			OPER_UNIT_CD,
			OPER_STD_QTY,
			OPER_CONV_QTY,
			DEC_PLACE,
			UNIT_CONV_RND_TYP,
			RMRKS,
			SUB_CHAR1,
			SUB_CHAR2,
			SUB_CHAR3,
			NON_CALC_FLG,
			IMP_ERR_FLG,
			IMP_FLG
			)
		SELECT
			m.ITM_CD,
			m.ITM_SUB1,
			m.ITM_SUB2,
			m.ITM_SUB3,
			m.LOC_CD,
			m.OPER_PTN,
			m.OPER_CD,
			m.OPER_SEQ,
			m.TERM,
			L_CALC_CTG_CD,
			m.WG_CD,
			m.DISP_SEQ,
			1,
			1,
			m.YIELD_OPER_FLG,
			m.OPER_UNIT_CD,
			m.OPER_STD_QTY,
			m.OPER_CONV_QTY,
			m.DEC_PLACE,
			m.UNIT_CONV_RND_TYP,
			m.MEMO1,
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
			SELECT
				m1.ITM_CD,
				m1.ITM_SUB1,
				m1.ITM_SUB2,
				m1.ITM_SUB3,
				m1.LOC_CD,
				m1.OPER_PTN,
				m1.OPER_CD,
				m1.OPER_SEQ,
				m3.TERM,
				NVL(m4.WG_CD, C_NULL_VAL) AS WG_CD,
				m1.DISP_SEQ,
				m1.YIELD_OPER_FLG,
				m1.OPER_UNIT_CD,
				m1.OPER_STD_QTY,
				m1.OPER_CONV_QTY,
				m1.DEC_PLACE,
				m1.UNIT_CONV_RND_TYP,
				m1.MEMO1,
				ROW_NUMBER() OVER (PARTITION BY
					m1.ITM_CD,
					m1.ITM_SUB1,
					m1.ITM_SUB2,
					m1.ITM_SUB3,
					m1.LOC_CD,
					m1.OPER_PTN,
					m1.OPER_CD,
					m1.OPER_SEQ ORDER BY m1.ST_DT) rn
			FROM	MAM_ITM_OPER m1, MAM_ITM_SRCH m2, MAM_TERM m3, MAM_LOC m4
			WHERE	0=0
			AND	m1.ITM_CD = m2.ITM_CD
			AND	m1.ITM_SUB1 = m2.ITM_SUB1
			AND	m1.ITM_SUB2 = m2.ITM_SUB2
			AND	m1.ITM_SUB3 = m2.ITM_SUB3
			AND	m2.DEL_FLG = C_OFF
			AND (
				I_DT IS NOT NULL AND m1.ST_DT <= I_DT AND m1.END_DT >= I_DT
				OR
				I_DT IS NULL AND m1.ST_DT < m3.TERM_END_YM AND m1.END_DT >= m3.TERM
				)
			AND	m1.LOC_CD = m4.LOC_CD(+)
			AND	m1.NOT_COST_FLG = C_OFF
			AND	m2.ASSET_MNG_TYP = MAC_ASSET_MNG_TYP.MNG
			AND	m3.TERM = I_TERM
			AND	(L_WG_CD IS NULL OR NVL(m4.WG_CD, C_NULL_VAL) = L_WG_CD)
			AND	(I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.BATCH
					OR EXISTS (
						SELECT	'X'
						FROM	MGW_IMP_INTERACTIVE_KEY wk
						WHERE	0=0
						AND	wk.ITM_CD = m1.ITM_CD
						AND	wk.ITM_SUB1 = m1.ITM_SUB1
						AND	wk.ITM_SUB2 = m1.ITM_SUB2
						AND	wk.ITM_SUB3 = m1.ITM_SUB3
						AND	wk.WG_CD = NVL(m4.WG_CD, C_NULL_VAL)
					)
				)
			) m
		WHERE	0=0
		AND	m.rn = 1
		ORDER BY
			m.ITM_CD, m.ITM_SUB1, m.ITM_SUB2, m.ITM_SUB3,
			m.LOC_CD, m.OPER_PTN, m.OPER_CD, m.OPER_SEQ
		;

	END P_INS_MGW_MAIN ;

	PROCEDURE P_IMP_MGT_MAIN (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			原価マスタ取込(品目工程)
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
		TYPE IMP_LIST IS TABLE OF MGT_ITM_OPER%ROWTYPE INDEX BY BINARY_INTEGER ;
		L_IMP		IMP_LIST ;
		L_IMP_TMP	IMP_LIST ;

		i		INTEGER := 0 ;
		k		INTEGER := 0 ;

		L_CHK_FLG	MAPA_META.FLG%TYPE ;
		L_PARM		MAPA_META.PARM_VAL%TYPE ;
		L_CALC_CTG_CD	MAPA_META.CALC_CTG_CD%TYPE ;
	BEGIN
		--確定品目は削除
		MGPA_FIX_DEL.P_ITM_OPER(G_USR, I_TERM) ;

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
					w.ITM_CD,
					w.ITM_SUB1,
					w.ITM_SUB2,
					w.ITM_SUB3
				FROM	MGW_IMP_ITM_OPER w
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
			IF z.ASSET_MNG_TYP IS NULL OR z.ASSET_MNG_TYP <> MAC_ASSET_MNG_TYP.MNG THEN
				IF z.ASSET_MNG_TYP IS NULL THEN
					-- 品目マスタに有効な品目として登録されていません。品目：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0023', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(z.ITM_CD, z.ITM_SUB1, z.ITM_SUB2, z.ITM_SUB3, L_PARM)) ;
				ELSIF z.ASSET_MNG_TYP <> MAC_ASSET_MNG_TYP.MNG THEN
					-- 品目マスタに資産管理可能な品目として登録されていません。取込の対象にはなりません。品目：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0024', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(z.ITM_CD, z.ITM_SUB1, z.ITM_SUB2, z.ITM_SUB3, L_PARM)) ;
				END IF ;

				UPDATE	MGW_IMP_ITM_OPER w
				SET	w.IMP_ERR_FLG = C_ON
				WHERE	0=0
				AND	w.ITM_CD = z.ITM_CD
				AND	w.ITM_SUB1 = z.ITM_SUB1
				AND	w.ITM_SUB2 = z.ITM_SUB2
				AND	w.ITM_SUB3 = z.ITM_SUB3
				AND	w.IMP_FLG = C_ON
				AND	w.UPD_USR_ID = G_USR
				AND	w.TERM = I_TERM
				;

				G_ERR_FLG := C_ON ;

			END IF ;
		END LOOP ;

		FOR x IN (
			SELECT	DISTINCT
				w.ITM_CD,
				w.ITM_SUB1,
				w.ITM_SUB2,
				w.ITM_SUB3,
				w.WG_CD,
				w.TERM,
				w.CALC_CTG_CD
			FROM	MGW_IMP_ITM_OPER w
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
						AND	wk.ITM_CD = w.ITM_CD
						AND	wk.ITM_SUB1 = w.ITM_SUB1
						AND	wk.ITM_SUB2 = w.ITM_SUB2
						AND	wk.ITM_SUB3 = w.ITM_SUB3
						AND	wk.WG_CD = w.WG_CD
					)
				)
			)
		LOOP
			k := 0 ;
			FOR y IN (
				SELECT /*+INDEX(w MGW_IMP_ITM_OPER_ALL_IE03)*/
					w.ITM_CD,
					w.ITM_SUB1,
					w.ITM_SUB2,
					w.ITM_SUB3,
					w.LOC_CD,
					w.OPER_PTN,
					w.OPER_CD,
					w.OPER_SEQ,
					w.TERM,
					w.CALC_CTG_CD,
					w.WG_CD,
					w.DISP_SEQ,
					w.NMR_QTY,
					w.DNM_QTY,
					w.YIELD_OPER_FLG,
					w.OPER_UNIT_CD,
					w.OPER_STD_QTY,
					w.OPER_CONV_QTY,
					w.DEC_PLACE,
					w.UNIT_CONV_RND_TYP,
					w.RMRKS,
					w.SUB_CHAR1,
					w.SUB_CHAR2,
					w.SUB_CHAR3,
					w.NON_CALC_FLG
				FROM	MGW_IMP_ITM_OPER w
				WHERE	0=0
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
				IF y.OPER_UNIT_CD IS NOT NULL THEN
					IF y.OPER_STD_QTY IS NULL
					OR y.OPER_CONV_QTY IS NULL
					OR y.DEC_PLACE IS NULL
					OR y.UNIT_CONV_RND_TYP IS NULL
					THEN
						--工程管理単位を設定する場合、次の項目は必須です。
						--工程管理単位、工程基準単位数量、工程換算単位数量、小数部有効桁数、換算端数処理区分
						--品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 工程管理単位：{5}
						FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0029', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
							MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
							x.WG_CD,
							FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M),
							x.CALC_CTG_CD,
							y.OPER_UNIT_CD) ;
						L_CHK_FLG := C_ON ;
					ELSE
						IF y.OPER_STD_QTY <= 0 THEN
							--工程基準単位数量には正の数字を設定してください。
							--品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 工程管理単位：{5} 工程基準単位数量：{6}
							FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0030', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
								MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
								x.WG_CD,
								FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M),
								x.CALC_CTG_CD,
								y.OPER_UNIT_CD,
								y.OPER_STD_QTY) ;
							L_CHK_FLG := C_ON ;
						END IF ;
						IF y.OPER_CONV_QTY < 0 THEN
							--工程換算単位数量には0以上の数字を設定してください。
							--品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 工程管理単位：{5} 工程換算単位数量：{6}
							FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0031', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
								MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
								x.WG_CD,
								FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M),
								x.CALC_CTG_CD,
								y.OPER_UNIT_CD,
								y.OPER_CONV_QTY) ;
							L_CHK_FLG := C_ON ;
						END IF ;
						IF y.DEC_PLACE < 0 OR y.DEC_PLACE > 8 THEN
							--小数部有効桁数には0～8の整数を設定してください。
							--品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 工程管理単位：{5} 小数部有効桁数：{6}
							FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0032', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
								MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
								x.WG_CD,
								FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M),
								x.CALC_CTG_CD,
								y.OPER_UNIT_CD,
								y.DEC_PLACE) ;
							L_CHK_FLG := C_ON ;
						END IF ;
					END IF ;
				END IF ;

				IF L_CHK_FLG = C_ON THEN
					UPDATE	MGW_IMP_ITM_OPER w
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
				L_IMP_TMP(k).OPER_PTN := y.OPER_PTN ;
				L_IMP_TMP(k).OPER_CD := y.OPER_CD ;
				L_IMP_TMP(k).OPER_SEQ := y.OPER_SEQ ;
				L_IMP_TMP(k).TERM := y.TERM ;
				L_IMP_TMP(k).CALC_CTG_CD := y.CALC_CTG_CD ;
				L_IMP_TMP(k).WG_CD := y.WG_CD ;
				L_IMP_TMP(k).DISP_SEQ := y.DISP_SEQ ;
				L_IMP_TMP(k).NMR_QTY := y.NMR_QTY ;
				L_IMP_TMP(k).DNM_QTY := y.DNM_QTY ;
				L_IMP_TMP(k).YIELD_OPER_FLG := y.YIELD_OPER_FLG ;
				L_IMP_TMP(k).OPER_UNIT_CD := y.OPER_UNIT_CD ;
				L_IMP_TMP(k).OPER_STD_QTY := y.OPER_STD_QTY ;
				L_IMP_TMP(k).OPER_CONV_QTY := y.OPER_CONV_QTY ;
				L_IMP_TMP(k).DEC_PLACE := y.DEC_PLACE ;
				L_IMP_TMP(k).UNIT_CONV_RND_TYP := y.UNIT_CONV_RND_TYP ;
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
					DELETE /*+INDEX(m MGT_ITM_OPER_ALL_PK)*/ MGT_ITM_OPER m
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
					INSERT INTO MGT_ITM_OPER VALUES L_IMP(j) ;
				L_IMP.DELETE ;
				i := 0 ;
			END IF ;

			<<NEXT_LOOP>>
				L_IMP_TMP.DELETE ;
		END LOOP ;

		IF i > 0 THEN
			FORALL j IN 1..i
				DELETE /*+INDEX(m MGT_ITM_OPER_ALL_PK)*/ MGT_ITM_OPER m
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
				INSERT INTO MGT_ITM_OPER VALUES L_IMP(j) ;
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
			品目工程マスタ用のデータをコピー用ワークテーブルに作成する
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
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_IMP_ITM_OPER.P_INS_MGW') ;

		L_CALC_CTG := MGPA_CO_PARM.F_GET_CALC_CTG_CD(I_CALC_CTG) ;

		--メイン処理の起動
		P_INS_MGW_MAIN(L_CALC_CTG, I_WG_CD, I_TERM, I_DT, I_IMP_OPE_TYP) ;

		--処理が終了しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_IMP_ITM_OPER.P_INS_MGW') ;

	END P_INS_MGW ;

	PROCEDURE P_IMP_MGT (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	)
	/*********************************************************
	<SYNOPSIS>
			原価マスタ取込(品目工程)
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
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_IMP_ITM_OPER.P_IMP_MGT') ;

		G_USR := FCPA_CONTEXT.F_GET_USERID ;

		G_ERR_FLG := C_OFF ;

		--メイン処理の起動
		P_IMP_MGT_MAIN(I_TERM, I_IMP_OPE_TYP) ;

		--エラーデータ以外は削除
		DELETE	MGW_IMP_ITM_OPER w
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
			UPDATE	MGW_IMP_ITM_OPER w
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
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_IMP_ITM_OPER.P_IMP_MGT') ;

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
			DECODE(x.LOC_CD, MAC_STR.NULL_VAL, MAC_STR.NULL_VAL, NVL(m.WG_CD, MAC_STR.NULL_VAL))
		FROM	MAW_IMP_ITM w, MAM_ITM_OPER x, MAM_LOC m
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
		AND	x.LOC_CD = m.LOC_CD(+)
		;

	END P_SET_KEY ;

END MGPA_IMP_ITM_OPER ;
/
