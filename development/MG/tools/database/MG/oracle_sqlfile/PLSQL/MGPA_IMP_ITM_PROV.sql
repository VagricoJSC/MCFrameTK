SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MGPA_IMP_ITM_PROV
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目支給)
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	PROCEDURE P_INS_MGW (
		I_CALC_CTG		IN	MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD			IN	MAPA_META.WG_CD%TYPE,
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_DT			IN	MAPA_META.DT%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	);
	/*********************************************************
	<SYNOPSIS>
			品目支給マスタ用のデータをコピー用ワークテーブルに作成する。
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

	PROCEDURE P_IMP_MGT (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	);
	/*********************************************************
	<SYNOPSIS>
			原価マスタ(品目支給)を取り込む。
	<REMARKS>
			メイン処理を起動するプロシージャ
	<ARGUMENTS>
	<IN>	I_TERM
			期
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/

	PROCEDURE P_SET_KEY (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_DT			IN	MAPA_META.DT%TYPE
	);
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

END MGPA_IMP_ITM_PROV;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MGPA_IMP_ITM_PROV
IS
	C_OFF		CONSTANT MAPA_META.FLG%TYPE := '0' ;
	C_ON		CONSTANT MAPA_META.FLG%TYPE := '1' ;

	C_PROV_ONR	CONSTANT MAPA_META.PROV_TYP%TYPE := MAC_PROV_TYP.ONR_PROV ;
	C_PROV_SS	CONSTANT MAPA_META.PROV_TYP%TYPE := MAC_PROV_TYP.SS ;

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
			品目支給マスタ用のデータをコピー用ワークテーブルに作成する
	<REMARKS>
			ワークテーブル作成メイン処理用プロシージャ

			1.基準通貨の情報
			2.単価の高い順
			3.通貨ＣＤの小さい順
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
		TYPE INS_LIST IS TABLE OF MGW_IMP_ITM_PROV%ROWTYPE INDEX BY BINARY_INTEGER ;
		L_INS	INS_LIST ;
		i	INTEGER := 0 ;

		C_MYCUR	CONSTANT MAPA_META.CUR_CD%TYPE := MAPA_XCHNG.F_GET_BASE_CUR_CD ;

		L_CALC_CTG_CD	MAPA_META.CALC_CTG_CD%TYPE ;
		L_WG_CD		MAPA_META.WG_CD%TYPE ;
		L_CO		MAM_CO%ROWTYPE := MAPA_CO.F_GET_CO_REC() ;
	BEGIN

		IF I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.INTERACTIVE THEN
			-- デフォルトの計算カテゴリＣＤを使い、ワーキンググループＣＤは無視する
			L_CALC_CTG_CD := MGPA_CO_PARM.F_GET_CALC_CTG_CD(NULL) ;
			L_WG_CD := NULL ;
		ELSE
			L_CALC_CTG_CD := I_CALC_CTG;
			L_WG_CD := I_WG_CD ;
		END IF;

		DELETE	MGW_IMP_ITM_PROV w
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
		FOR x IN (
			SELECT
				m01.ITM_CD,
				m01.ITM_SUB1,
				m01.ITM_SUB2,
				m01.ITM_SUB3,
				m01.PRSPPL_CD,
				m01.TERM,
				L_CALC_CTG_CD AS CALC_CTG_CD,
				m01.WG_CD,
				m01.PROV_TYP,
				1 AS BASE_QTY,
				m01.CUR_CD,
				m01.UPRI,
				m01.MEMO1 AS RMRKS,
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
					m11.ITM_CD,
					m11.ITM_SUB1,
					m11.ITM_SUB2,
					m11.ITM_SUB3,
					m11.PRSPPL_CD,
					m11.TERM,
					m11.WG_CD,
					m11.PROV_TYP,
					m11.CUR_CD,
					m11.UPRI,
					m11.MEMO1,
					ROW_NUMBER() OVER (
						PARTITION BY
							m11.ITM_CD,
							m11.ITM_SUB1,
							m11.ITM_SUB2,
							m11.ITM_SUB3,
							m11.PRSPPL_CD,
							m11.WG_CD
						ORDER BY
							m11.UNIT_CUR_PRIO,
							m11.BASE_CUR_UPRI DESC NULLS LAST,
							m11.CUR_CD) AS RN
				FROM	(
					SELECT
						m21.ITM_CD,
						m21.ITM_SUB1,
						m21.ITM_SUB2,
						m21.ITM_SUB3,
						m21.PRSPPL_CD,
						m23.TERM,
						m21.WG_CD,
						m21.PROV_TYP,
						m21.CUR_CD,
						m21.UPRI,
						m21.MEMO1,
						CASE
							WHEN m21.CUR_CD = C_MYCUR THEN 1
							ELSE 2
						END UNIT_CUR_PRIO,
						MAPA_XCHNG.F_XCHNG(
							m21.UPRI,
							MAPA_XCHNG.F_GET_PROV_XRATE_NE(m21.CUR_CD, NVL(I_DT, GREATEST(m23.TERM, m21.ST_DT))),
							m25.UPRI_DEC_PLACE,
							L_CO.XRATE_RND_TYP) AS BASE_CUR_UPRI,
						ROW_NUMBER() OVER (PARTITION BY
							m21.ITM_CD,
							m21.ITM_SUB1,
							m21.ITM_SUB2,
							m21.ITM_SUB3,
							m21.PRSPPL_CD,
							m21.CUR_CD,
							m21.WG_CD ORDER BY m21.ST_DT) AS ST_DT_RN
					FROM	MAM_PROV_UPRI_ m21, MAM_ITM_SRCH m22, MAM_TERM m23, MAM_CUR m25
					WHERE	0=0
					AND	m21.ITM_CD = m22.ITM_CD
					AND	m21.ITM_SUB1 = m22.ITM_SUB1
					AND	m21.ITM_SUB2 = m22.ITM_SUB2
					AND	m21.ITM_SUB3 = m22.ITM_SUB3
					AND	m22.DEL_FLG = C_OFF
					AND (
						I_DT IS NOT NULL AND m21.ST_DT <= I_DT AND m21.END_DT >= I_DT
						OR
						I_DT IS NULL AND m21.ST_DT < m23.TERM_END_YM AND m21.END_DT >= m23.TERM
						)
					AND	m21.CUR_CD = m25.CUR_CD
					AND	m21.PROV_TYP IN (C_PROV_SS, C_PROV_ONR)
					AND	m21.DEL_FLG = C_OFF
					AND	m23.TERM = I_TERM
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
					) m11
				WHERE	0=0
				AND	m11.ST_DT_RN = 1
				) m01
			WHERE	0=0
			AND	m01.RN = 1
			ORDER BY
				m01.ITM_CD, m01.ITM_SUB1, m01.ITM_SUB2, m01.ITM_SUB3, m01.PRSPPL_CD
			)
		LOOP
			i := i + 1 ;

			L_INS(i).ITM_CD := x.ITM_CD ;
			L_INS(i).ITM_SUB1 := x.ITM_SUB1 ;
			L_INS(i).ITM_SUB2 := x.ITM_SUB2 ;
			L_INS(i).ITM_SUB3 := x.ITM_SUB3 ;
			L_INS(i).PRSPPL_CD := x.PRSPPL_CD ;
			L_INS(i).TERM := x.TERM ;
			L_INS(i).CALC_CTG_CD := x.CALC_CTG_CD ;
			L_INS(i).WG_CD := x.WG_CD ;
			L_INS(i).PROV_TYP := x.PROV_TYP ;
			L_INS(i).BASE_QTY := x.BASE_QTY ;
			L_INS(i).CUR_CD := x.CUR_CD ;
			L_INS(i).UPRI := x.UPRI ;
			L_INS(i).RMRKS := x.RMRKS ;
			L_INS(i).SUB_CHAR1 := x.SUB_CHAR1 ;
			L_INS(i).SUB_CHAR2 := x.SUB_CHAR2 ;
			L_INS(i).SUB_CHAR3 := x.SUB_CHAR3 ;
			L_INS(i).NON_CALC_FLG := x.NON_CALC_FLG ;
			L_INS(i).IMP_ERR_FLG := x.IMP_ERR_FLG ;
			L_INS(i).IMP_FLG := x.IMP_FLG ;

			IF i > C_MAX_CNT THEN
				FORALL j IN 1..i
					INSERT INTO MGW_IMP_ITM_PROV VALUES L_INS(j) ;
				L_INS.DELETE ;
				i := 0 ;
			END IF ;
		END LOOP ;

		IF i > 0 THEN
			FORALL j IN 1..i
				INSERT INTO MGW_IMP_ITM_PROV VALUES L_INS(j) ;
			L_INS.DELETE ;
		END IF ;

		L_INS.DELETE ;

	END P_INS_MGW_MAIN ;

	PROCEDURE P_IMP_MGT_MAIN (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			原価マスタ取込(品目支給)
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
		TYPE IMP_LIST IS TABLE OF MGT_ITM_PROV%ROWTYPE INDEX BY BINARY_INTEGER ;
		L_IMP		IMP_LIST ;
		L_IMP_TMP	IMP_LIST ;

		i		INTEGER := 0 ;
		k		INTEGER := 0 ;

		L_CHK_FLG	MAPA_META.FLG%TYPE ;
		L_PARM		MAPA_META.PARM_VAL%TYPE ;
		L_CALC_CTG_CD	MAPA_META.CALC_CTG_CD%TYPE ;
	BEGIN
		--確定品目は削除
		MGPA_FIX_DEL.P_ITM_PROV(G_USR, I_TERM) ;

		L_PARM := MAPA_COMM.F_GET_PARM('ITM_SUB_TYP') ;

		-- 個別取込ならデフォルトの計算カテゴリＣＤを使う
		-- 通常取込なら無視する
		IF I_IMP_OPE_TYP = MGC_IMP_OPE_TYP.INTERACTIVE THEN
			L_CALC_CTG_CD := MGPA_CO_PARM.F_GET_CALC_CTG_CD(NULL) ;
		ELSE
			L_CALC_CTG_CD := NULL;
		END IF;

		FOR x IN (
			SELECT	t.*,
				m.ASSET_MNG_TYP AS ASSET_MNG_TYP
			FROM	(
				SELECT	DISTINCT
					w.ITM_CD,
					w.ITM_SUB1,
					w.ITM_SUB2,
					w.ITM_SUB3,
					w.WG_CD,
					w.TERM,
					w.CALC_CTG_CD
				FROM	MGW_IMP_ITM_PROV w
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

				UPDATE	MGW_IMP_ITM_PROV w
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
				SELECT /*+INDEX(w MGW_IMP_ITM_PROV_ALL_IE03)*/
					w.ITM_CD,
					w.ITM_SUB1,
					w.ITM_SUB2,
					w.ITM_SUB3,
					w.PRSPPL_CD,
					w.TERM,
					w.CALC_CTG_CD,
					w.WG_CD,
					CASE x.ASSET_MNG_TYP
						WHEN MAC_ASSET_MNG_TYP.MNG THEN w.PROV_TYP
						ELSE C_PROV_SS
					END AS PROV_TYP,
					w.BASE_QTY,
					w.CUR_CD,
					w.UPRI,
					w.RMRKS,
					w.SUB_CHAR1,
					w.SUB_CHAR2,
					w.SUB_CHAR3,
					w.NON_CALC_FLG,
					w.IMP_ERR_FLG,
					w.IMP_FLG,
					m.BP_CD AS MAM_BP_CD
				FROM	MGW_IMP_ITM_PROV w, MAM_BP m
				WHERE	0=0
				AND	w.PRSPPL_CD = m.BP_CD(+)
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
				IF y.PROV_TYP NOT IN (C_PROV_ONR, C_PROV_SS) THEN
					--支給区分には 2：有償支給ないしは 3：自給を設定してください。
					--品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 支給区分：{5}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0035', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
						x.WG_CD,
						FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M),
						x.CALC_CTG_CD,
						y.PROV_TYP
						) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF y.BASE_QTY <= 0 THEN
					--基準数には正の数字を設定してください。
					--品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 基準数：{5}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0037', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						MAPA_COMM.F_TO_DISP_ITM(x.ITM_CD, x.ITM_SUB1, x.ITM_SUB2, x.ITM_SUB3, L_PARM),
						x.WG_CD,
						FCPA_DATE_UTIL.F_TO_CHAR(x.TERM, FCPA_DATE_UTIL.Y4M),
						x.CALC_CTG_CD,
						y.BASE_QTY
						) ;
					L_CHK_FLG := C_ON ;
				END IF ;


				IF y.PRSPPL_CD <> C_NULL_VAL AND y.MAM_BP_CD IS NULL THEN
					--取引先マスタに有効な取引先として登録されていません。支給先：{1}
					FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0060', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2,
						y.PRSPPL_CD) ;
					L_CHK_FLG := C_ON ;
				END IF ;

				IF L_CHK_FLG = C_ON THEN
					UPDATE	MGW_IMP_ITM_PROV w
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
				L_IMP_TMP(k).PRSPPL_CD := y.PRSPPL_CD ;
				L_IMP_TMP(k).TERM := y.TERM ;
				L_IMP_TMP(k).CALC_CTG_CD := y.CALC_CTG_CD ;
				L_IMP_TMP(k).WG_CD := y.WG_CD ;
				L_IMP_TMP(k).PROV_TYP := y.PROV_TYP ;
				L_IMP_TMP(k).BASE_QTY := y.BASE_QTY ;
				L_IMP_TMP(k).CUR_CD := y.CUR_CD ;
				L_IMP_TMP(k).UPRI := y.UPRI ;
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
					DELETE /*+INDEX(m MGT_ITM_PROV_ALL_PK)*/ MGT_ITM_PROV m
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
					INSERT INTO MGT_ITM_PROV VALUES L_IMP(j) ;
				L_IMP.DELETE ;
				i := 0 ;
			END IF ;

			<<NEXT_LOOP>>
				L_IMP_TMP.DELETE ;
		END LOOP ;

		IF i > 0 THEN
			FORALL j IN 1..i
				DELETE /*+INDEX(m MGT_ITM_PROV_ALL_PK)*/ MGT_ITM_PROV m
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
				INSERT INTO MGT_ITM_PROV VALUES L_IMP(j) ;
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
			品目支給マスタ用のデータをコピー用ワークテーブルに作成する
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
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_IMP_ITM_PROV.P_INS_MGW') ;

		L_CALC_CTG := MGPA_CO_PARM.F_GET_CALC_CTG_CD(I_CALC_CTG) ;

		--メイン処理の起動
		P_INS_MGW_MAIN(L_CALC_CTG, I_WG_CD, I_TERM, I_DT, I_IMP_OPE_TYP) ;

		--処理が終了しました。
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_IMP_ITM_PROV.P_INS_MGW') ;

	END P_INS_MGW ;

	PROCEDURE P_IMP_MGT (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	)
	/*********************************************************
	<SYNOPSIS>
			原価マスタ取込(品目支給)
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
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_IMP_ITM_PROV.P_IMP_MGT') ;

		G_USR := FCPA_CONTEXT.F_GET_USERID ;

		G_ERR_FLG := C_OFF ;

		--メイン処理の起動
		P_IMP_MGT_MAIN(I_TERM, I_IMP_OPE_TYP) ;

		--エラーデータ以外は削除
		DELETE	MGW_IMP_ITM_PROV w
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
			UPDATE	MGW_IMP_ITM_PROV w
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
		FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_IMP_ITM_PROV.P_IMP_MGT') ;

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
		FROM	MAW_IMP_ITM w, MAM_PROV_UPRI_ x
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

END MGPA_IMP_ITM_PROV ;

/
show errors;


