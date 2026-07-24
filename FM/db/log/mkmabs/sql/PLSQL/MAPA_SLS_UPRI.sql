SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MAPA_SLS_UPRI
/*********************************************************
<Synopsis>
		販売単価取得ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	PROCEDURE P_SET_SLS_UPRI_WK ;
	/*********************************************************
	<SYNOPSIS>
		販売単価・標準販売単価・標準単価を取得してMAW_SLS_UPRI_SRV
		にセットする
	<REMARKS>
		販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_UPRI_RANK (
		I_CST_CD 	IN MAPA_META.BP_CD%TYPE,
		I_DLV_CD	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD1	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD2	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD3	IN MAPA_META.BP_CD%TYPE,
		I_DT		IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.SLS_UPRI_RANK_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		販売単価ランクＣＤを取得する
	<REMARKS>
		得意先販売単価ランクマスタが存在しない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_CST_CD
			得意先ＣＤ
	<IN>	I_DLV_CD
			納品先ＣＤ
	<IN>	I_DEST_CD1
			仕向先ＣＤ１
	<IN>	I_DEST_CD2
			仕向先ＣＤ２
	<IN>	I_DEST_CD3
			仕向先ＣＤ３
	<IN>	I_DT
			基準日
	<RETURNVALUE>
		販売単価ランクＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_SET_SLS_UPRI_WK_NE ;
	/*********************************************************
	<SYNOPSIS>
		販売単価・標準販売単価・標準単価を取得してMAW_SLS_UPRI_SRV
		にセットする
	<REMARKS>
		販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
		P_SET_SLS_UPRI_WK：標準販売単価マスタが存在しない場合はエラー
		P_SET_SLS_UPRI_WK_NE：標準販売単価マスタが存在しない場合は単価がNULL
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

END MAPA_SLS_UPRI ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_SLS_UPRI
IS
	G_BIND		FCPA_ERR.MSG_BINDER ;
	G_NULL_VAL	CONSTANT VARCHAR2(1) := MAC_STR.NULL_VAL ;

	TYPE CNF_LIST IS TABLE OF MAW_UPRI_CNF%ROWTYPE INDEX BY BINARY_INTEGER ;
	TYPE DTL_LIST IS TABLE OF MAW_SLS_UPRI_SRV%ROWTYPE INDEX BY BINARY_INTEGER ;
	TYPE IDX_LIST IS TABLE OF INTEGER INDEX BY BINARY_INTEGER ;

	G_CNF	CNF_LIST ;
	cnf_cnt	BINARY_INTEGER ;

	CURSOR CST_SLS_UPRI (
		I_ITM_CD 	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_SLS_UPRI_GRP_CD IN MAPA_META.SLS_UPRI_GRP_CD%TYPE,
		I_CST_CD	IN MAPA_META.BP_CD%TYPE,
		I_DLV_CD	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD1	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD2	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD3	IN MAPA_META.BP_CD%TYPE,
		I_UNIT_CD	IN MAPA_META.UNIT_CD%TYPE,
		I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_DT		IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	m.DLV_CD,
			m.DEST_CD1,
			m.DEST_CD2,
			m.DEST_CD3,
			m.LOT_QTY,
			m.ST_DT,
			m.END_DT,
			m.UPRI,
			m.UPRI_RATE,
			m.INTERIM_FLG,
			m.ROW_ID
		FROM	(
			SELECT	m1.*
			FROM	MAM_CST_SLS_UPRI m1
			WHERE	0=0
			AND	m1.ITM_CD = I_ITM_CD AND m1.ITM_SUB1 = I_ITM_SUB1 AND m1.ITM_SUB2 = I_ITM_SUB2 AND m1.ITM_SUB3 = I_ITM_SUB3
			AND	m1.CST_CD = I_CST_CD
			UNION ALL
			SELECT	m2.*
			FROM	MAM_CST_SLS_UPRI m2
			WHERE	0=0
			AND	m2.SLS_UPRI_GRP_CD = I_SLS_UPRI_GRP_CD
			AND	m2.CST_CD = I_CST_CD
			) m
		WHERE	0=0
		AND	(m.DLV_CD = I_DLV_CD OR m.DLV_CD = G_NULL_VAL)
		AND	(m.DEST_CD1 = I_DEST_CD1 OR m.DEST_CD1 = G_NULL_VAL)
		AND	(m.DEST_CD2 = I_DEST_CD2 OR m.DEST_CD2 = G_NULL_VAL)
		AND	(m.DEST_CD3 = I_DEST_CD3 OR m.DEST_CD3 = G_NULL_VAL)
		AND	m.UNIT_CD = I_UNIT_CD
		AND	m.CUR_CD = I_CUR_CD
		AND	m.WG_CD = I_WG_CD
		AND	m.ST_DT  <= I_DT
		AND	m.END_DT >= I_DT
		AND	(m.UPRI IS NOT NULL OR m.UPRI_RATE IS NOT NULL)
		ORDER BY  DECODE(m.DLV_CD, G_NULL_VAL, '1', '0') 
			|| DECODE(m.DEST_CD1, G_NULL_VAL, '1', '0')
			|| DECODE(m.DEST_CD2, G_NULL_VAL, '1', '0')
			|| DECODE(m.DEST_CD3, G_NULL_VAL, '1', '0'),
			DECODE(m.ITM_CD, G_NULL_VAL, '1', '0') || DECODE(m.SLS_UPRI_GRP_CD, G_NULL_VAL, '1', '0'),
			m.LOT_QTY DESC
	;

	CURSOR ITM_SLS_UPRI (
		I_ITM_CD 	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_SLS_UPRI_GRP_CD IN MAPA_META.SLS_UPRI_GRP_CD%TYPE,
		I_SLS_UPRI_RANK_CD IN MAPA_META.SLS_UPRI_RANK_CD%TYPE,
		I_UNIT_CD	IN MAPA_META.UNIT_CD%TYPE,
		I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_DT		IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	m.SLS_UPRI_RANK_CD,
			m.LOT_QTY,
			m.ST_DT,
			m.END_DT,
			m.UPRI,
			m.UPRI_RATE,
			m.INTERIM_FLG,
			m.ROW_ID
		FROM	(
			SELECT	m1.*
			FROM	MAM_ITM_SLS_UPRI m1
			WHERE	0=0
			AND	m1.ITM_CD = I_ITM_CD AND m1.ITM_SUB1 = I_ITM_SUB1 AND m1.ITM_SUB2 = I_ITM_SUB2 AND m1.ITM_SUB3 = I_ITM_SUB3
			UNION ALL
			SELECT	m2.*
			FROM	MAM_ITM_SLS_UPRI m2
			WHERE	0=0
			AND	m2.SLS_UPRI_GRP_CD = I_SLS_UPRI_GRP_CD
			) m
		WHERE	0=0
		AND	(m.SLS_UPRI_RANK_CD = I_SLS_UPRI_RANK_CD OR m.SLS_UPRI_RANK_CD = G_NULL_VAL)
		AND	m.UNIT_CD = I_UNIT_CD
		AND	m.CUR_CD = I_CUR_CD
		AND	m.WG_CD = I_WG_CD
		AND	m.ST_DT  <= I_DT
		AND	m.END_DT >= I_DT
		AND	(m.UPRI IS NOT NULL OR m.UPRI_RATE IS NOT NULL)
		ORDER BY  DECODE(m.SLS_UPRI_RANK_CD, G_NULL_VAL, '1', '0'),
			DECODE(m.ITM_CD, G_NULL_VAL, '1', '0') || DECODE(m.SLS_UPRI_GRP_CD, G_NULL_VAL, '1', '0'),
			m.LOT_QTY DESC
	;

	FUNCTION F_CALC_SLS_UPRI (
		I_ITM_CD 	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_UNIT_CD	IN MAPA_META.UNIT_CD%TYPE,
		I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_DT		IN MAPA_META.DT%TYPE,
		I_QTY		IN MAPA_META.QTY%TYPE,
		I_UPRI_RATE	IN MAPA_META.MONEY%TYPE,
		I_DEC_PLACE	IN MAPA_META.DEC_PLACE%TYPE,
		I_RND_TYP	IN MAPA_META.RND_TYP%TYPE,
		I_PEG_NO	IN MAPA_META.INT%TYPE,
		I_NOT_ERR_FLG 	IN MAPA_META.FLG%TYPE
	) RETURN MAPA_META.MONEY%TYPE
	/*********************************************************
	<SYNOPSIS>
		掛率から販売単価を計算する
	<REMARKS>
		標準販売単価マスタが存在しない場合
		I_NOT_ERR_FLG：0　エラーを返す
		I_NOT_ERR_FLG：1　NULLを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_UNIT_CD
			単位ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_DT
			基準日
	<IN>	I_QTY
			数量
	<IN>	I_UPRI_RATE
			掛率
	<IN>	I_DEC_PLACE
			単価小数部有効桁
	<IN>	I_RND_TYP
			端数処理区分
	<IN>	I_PEG_NO
			紐付きＮＯ
	<RETURNVALUE>
		掛率と標準販売単価マスタから計算される販売単価
	<HISTORY>
	**********************************************************/
	IS
		L_UPRI	MAPA_META.MONEY%TYPE ;
		L_PARM	MAPA_META.PARM_VAL%TYPE ;
	BEGIN
		L_UPRI := NULL ;
		FOR x IN (
			SELECT	m.UPRI,
				m.ROW_ID
			FROM	MAM_STD_SLS_UPRI m
			WHERE	0=0
			AND	m.ITM_CD = I_ITM_CD
			AND	m.ITM_SUB1 = I_ITM_SUB1
			AND	m.ITM_SUB2 = I_ITM_SUB2
			AND	m.ITM_SUB3 = I_ITM_SUB3
			AND	m.UNIT_CD = I_UNIT_CD
			AND	m.CUR_CD = I_CUR_CD
			AND	m.WG_CD = I_WG_CD
			AND	m.ST_DT  <= I_DT
			AND	m.END_DT >= I_DT
			AND	m.LOT_QTY <= I_QTY
			ORDER BY m.LOT_QTY DESC
			)
		LOOP
			L_UPRI := MAPA_CALC.F_RND(I_UPRI_RATE / 100 * x.UPRI, I_DEC_PLACE, I_RND_TYP) ;

			cnf_cnt := cnf_cnt + 1 ;
			G_CNF(cnf_cnt).PEG_NO := I_PEG_NO ;
			G_CNF(cnf_cnt).MST_NM := 'MAM_STD_SLS_UPRI' ;
			G_CNF(cnf_cnt).ROW_ID := x.ROW_ID ;
			EXIT ;
		END LOOP ;

		IF L_UPRI IS NULL THEN
			IF I_NOT_ERR_FLG = '1' THEN
				RETURN L_UPRI ;
			END IF ;

			SELECT	MAX(m.PARM_VAL)
			INTO	L_PARM
			FROM	MAM_SYS_PARM m
			WHERE	0=0
			AND	m.PARM_KEY = 'ITM_SUB_TYP'
			AND	m.DEL_FLG = '0'
			;

			G_BIND := FCPA_ERR.MSG_BINDER (
					MAPA_COMM.F_TO_DISP_ITM(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, L_PARM), 
					I_UNIT_CD, I_CUR_CD, I_WG_CD, 
					FCPA_DATE_UTIL.F_TO_CHAR(I_DT, FCPA_DATE_UTIL.Y4MD), 
					I_QTY
					) ;
			FCPA_ERR.RAISE_APP_ERR ('MABSD0001', G_BIND) ;
		END IF ;

		RETURN L_UPRI ;

	END F_CALC_SLS_UPRI ;

	FUNCTION F_GET_SLS_UPRI_RANK (
		I_CST_CD 	IN MAPA_META.BP_CD%TYPE,
		I_DLV_CD	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD1	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD2	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD3	IN MAPA_META.BP_CD%TYPE,
		I_DT		IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.SLS_UPRI_RANK_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		販売単価ランクＣＤを取得する
	<REMARKS>
		得意先販売単価ランクマスタが存在しない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_CST_CD
			得意先ＣＤ
	<IN>	I_DLV_CD
			納品先ＣＤ
	<IN>	I_DEST_CD1
			仕向先ＣＤ１
	<IN>	I_DEST_CD2
			仕向先ＣＤ２
	<IN>	I_DEST_CD3
			仕向先ＣＤ３
	<IN>	I_DT
			基準日
	<RETURNVALUE>
		販売単価ランクＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_SLS_UPRI_RANK_CD	MAPA_META.SLS_UPRI_RANK_CD%TYPE ;
	BEGIN
		L_SLS_UPRI_RANK_CD := NULL ;
		FOR x IN (
			SELECT	m.SLS_UPRI_RANK_CD
			FROM	MAM_CST_SLS_UPRI_RANK m
			WHERE	0=0
			AND	m.CST_CD = I_CST_CD
			AND	(m.DLV_CD = I_DLV_CD OR m.DLV_CD = G_NULL_VAL)
			AND	(m.DEST_CD1 = I_DEST_CD1 OR m.DEST_CD1 = G_NULL_VAL)
			AND	(m.DEST_CD2 = I_DEST_CD2 OR m.DEST_CD2 = G_NULL_VAL)
			AND	(m.DEST_CD3 = I_DEST_CD3 OR m.DEST_CD3 = G_NULL_VAL)
			AND	m.ST_DT  <= I_DT
			AND	m.END_DT >= I_DT
			AND m.DEL_FLG = '0'
			ORDER BY DECODE(m.DLV_CD, G_NULL_VAL, '1', '0') 
				|| DECODE(m.DEST_CD1, G_NULL_VAL, '1', '0')
				|| DECODE(m.DEST_CD2, G_NULL_VAL, '1', '0')
				|| DECODE(m.DEST_CD3, G_NULL_VAL, '1', '0')
			)
		LOOP
			L_SLS_UPRI_RANK_CD := x.SLS_UPRI_RANK_CD ;
			EXIT ;
		END LOOP ;

		RETURN L_SLS_UPRI_RANK_CD ;

	END F_GET_SLS_UPRI_RANK ;

	PROCEDURE P_SET_SLS_UPRI(
		I_NOT_ERR_FLG 	IN MAPA_META.FLG%TYPE DEFAULT '0'
	)
	/*********************************************************
	<SYNOPSIS>
		販売単価を取得してMAW_SLS_UPRI_SRVにセットする
	<REMARKS>
		販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_QTY	MAPA_META.QTY%TYPE ;

		L_DTL	DTL_LIST ;
		i	BINARY_INTEGER ;

		L_IDX	IDX_LIST ;
		idx	INTEGER ;

		L_CNT	INTEGER ;
		L_TMP_CNT	BINARY_INTEGER ;
		L_CO_CD	MAPA_META.CO_CD%TYPE ;
	BEGIN
		cnf_cnt := 0 ;
		G_CNF.DELETE ;
		L_CO_CD := FCPA_CONTEXT.F_GET_CO_CD ;
		FOR x1 IN (
			SELECT	DISTINCT
				w.ITM_CD,
				w.ITM_SUB1,
				w.ITM_SUB2,
				w.ITM_SUB3,
				w.CST_CD,
				w.UNIT_CD,
				w.CUR_CD,
				w.GRP_NO,
				w.WG_CD,
				m1.UPRI_DEC_PLACE,
				NVL(m2.SLS_UPRI_RND_TYP, MAC_RND_TYP.RNDOFF)	SLS_UPRI_RND_TYP,
				m3.SLS_UPRI_GRP_CD
			FROM	MAW_SLS_UPRI_SRV w
				LEFT OUTER JOIN MAM_CUR m1 ON m1.CUR_CD = w.CUR_CD
				LEFT OUTER JOIN MAM_BP m2 ON m2.BP_CD = w.CST_CD
				LEFT OUTER JOIN MAM_ITM_COM m3 ON m3.DEL_FLG = '0' AND m3.CO_CD = L_CO_CD AND
					m3.ITM_CD = w.ITM_CD AND m3.ITM_SUB1 = w.ITM_SUB1 AND m3.ITM_SUB2 = w.ITM_SUB2 AND m3.ITM_SUB3 = w.ITM_SUB3
			WHERE	0=0
			AND	w.SLS_UPRI_FLG = '1'
			AND	w.SLS_UPRI IS NULL
			)
		LOOP

			--得意先販売単価マスタの存在チェック
			SELECT	COUNT(*)
			INTO	L_CNT
			FROM	(
				SELECT	m1.*
				FROM	MAM_CST_SLS_UPRI m1
				WHERE	0=0
				AND	m1.ITM_CD = x1.ITM_CD AND m1.ITM_SUB1 = x1.ITM_SUB1 AND m1.ITM_SUB2 = x1.ITM_SUB2 AND m1.ITM_SUB3 = x1.ITM_SUB3
				AND	m1.CST_CD = x1.CST_CD
				UNION ALL
				SELECT	m2.*
				FROM	MAM_CST_SLS_UPRI m2
				WHERE	0=0
				AND	m2.SLS_UPRI_GRP_CD = x1.SLS_UPRI_GRP_CD
				AND	m2.CST_CD = x1.CST_CD
				) m
			WHERE	0=0
			AND	m.UNIT_CD = x1.UNIT_CD
			AND	m.CUR_CD = x1.CUR_CD
			AND	m.WG_CD = x1.WG_CD
			AND	(m.UPRI IS NOT NULL OR m.UPRI_RATE IS NOT NULL)
			;

			IF L_CNT = 0 THEN
				GOTO SKIP_CST_SLS_UPRI ;
			END IF ;

			--得意先販売単価マスタからの取得
			i := 0 ;
			L_DTL.DELETE ;
			FOR x2 IN (
				SELECT	w.*
				FROM	MAW_SLS_UPRI_SRV w
					LEFT OUTER JOIN MAM_CST_SLS_UPRI m ON 0=0
						AND	(
							m.ITM_CD = x1.ITM_CD AND m.ITM_SUB1 = x1.ITM_SUB1 AND m.ITM_SUB2 = x1.ITM_SUB2 AND m.ITM_SUB3 = x1.ITM_SUB3
							OR
							m.SLS_UPRI_GRP_CD = x1.SLS_UPRI_GRP_CD
							)
						AND	m.CST_CD = x1.CST_CD
						AND	(m.DLV_CD = w.DLV_CD OR m.DLV_CD = G_NULL_VAL)
						AND	(m.DEST_CD1 = w.DEST_CD1 OR m.DEST_CD1 = G_NULL_VAL)
						AND	(m.DEST_CD2 = w.DEST_CD2 OR m.DEST_CD2 = G_NULL_VAL)
						AND	(m.DEST_CD3 = w.DEST_CD3 OR m.DEST_CD3 = G_NULL_VAL)
						AND	m.UNIT_CD = x1.UNIT_CD
						AND	m.CUR_CD = x1.CUR_CD
						AND	m.WG_CD = x1.WG_CD
						AND	m.ST_DT  <= w.DT
						AND	m.END_DT >= w.DT
						AND	m.LOT_QTY <= w.QTY
						AND	(m.UPRI IS NOT NULL OR m.UPRI_RATE IS NOT NULL)
				WHERE	0=0
				AND	w.ITM_CD = x1.ITM_CD
				AND	w.ITM_SUB1 = x1.ITM_SUB1
				AND	w.ITM_SUB2 = x1.ITM_SUB2
				AND	w.ITM_SUB3 = x1.ITM_SUB3
				AND	w.CST_CD = x1.CST_CD
				AND	w.UNIT_CD = x1.UNIT_CD
				AND	w.CUR_CD = x1.CUR_CD
				AND	(w.GRP_NO = x1.GRP_NO OR w.GRP_NO IS NULL AND x1.GRP_NO IS NULL)
				AND	w.WG_CD = x1.WG_CD
				AND	w.SLS_UPRI_FLG = '1'
				AND	w.SLS_UPRI IS NULL
				ORDER BY DECODE(NVL(m.DLV_CD, G_NULL_VAL), G_NULL_VAL, '1', '0') 
					|| DECODE(NVL(m.DEST_CD1, G_NULL_VAL), G_NULL_VAL, '1', '0')
					|| DECODE(NVL(m.DEST_CD2, G_NULL_VAL), G_NULL_VAL, '1', '0')
					|| DECODE(NVL(m.DEST_CD3, G_NULL_VAL), G_NULL_VAL, '1', '0'),
					w.PEG_NO
				)
			LOOP
				IF i > 0 THEN
					FOR m IN L_DTL.FIRST..L_DTL.LAST LOOP
						IF L_DTL(m).PEG_NO = x2.PEG_NO THEN
							GOTO NEXT_X2 ;
						END IF ;
					END LOOP ;
				END IF ;

				i := i + 1 ;
				L_DTL(i) := x2 ;

				<<NEXT_X2>>
					NULL ;
			END LOOP ;

			FOR t1 IN L_DTL.FIRST..L_DTL.LAST LOOP
				IF L_DTL(t1).SLS_UPRI IS NOT NULL THEN
					GOTO NEXT_T1 ;
				END IF ;

				FOR x3 IN CST_SLS_UPRI(L_DTL(t1).ITM_CD, L_DTL(t1).ITM_SUB1, L_DTL(t1).ITM_SUB2, L_DTL(t1).ITM_SUB3, x1.SLS_UPRI_GRP_CD,
							L_DTL(t1).CST_CD, L_DTL(t1).DLV_CD, 
							L_DTL(t1).DEST_CD1, L_DTL(t1).DEST_CD2, L_DTL(t1).DEST_CD3, 
							L_DTL(t1).UNIT_CD, L_DTL(t1).CUR_CD,
							L_DTL(t1).WG_CD, L_DTL(t1).DT
							)
				LOOP
					L_QTY := L_DTL(t1).QTY ;
					IF t1 = L_DTL.LAST THEN
						IF x3.LOT_QTY <= L_QTY THEN
							IF x3.UPRI IS NOT NULL THEN
								L_DTL(t1).SLS_UPRI := x3.UPRI ;
							ELSE
								L_DTL(t1).SLS_UPRI := 
									F_CALC_SLS_UPRI(L_DTL(t1).ITM_CD, L_DTL(t1).ITM_SUB1, L_DTL(t1).ITM_SUB2, L_DTL(t1).ITM_SUB3,
											L_DTL(t1).UNIT_CD, L_DTL(t1).CUR_CD, L_DTL(t1).WG_CD, L_DTL(t1).DT,
											L_QTY, x3.UPRI_RATE, x1.UPRI_DEC_PLACE, x1.SLS_UPRI_RND_TYP, L_DTL(t1).PEG_NO, I_NOT_ERR_FLG) ;
							END IF ;
							L_DTL(t1).INTERIM_FLG := x3.INTERIM_FLG ;

							cnf_cnt := cnf_cnt + 1 ;
							G_CNF(cnf_cnt).PEG_NO := L_DTL(t1).PEG_NO ;
							G_CNF(cnf_cnt).MST_NM := 'MAM_CST_SLS_UPRI' ;
							G_CNF(cnf_cnt).ROW_ID := x3.ROW_ID ;
							GOTO NEXT_T1 ;
						END IF ;
					ELSE
						L_IDX.DELETE ;
						FOR t2 IN t1 + 1..L_DTL.LAST LOOP
							IF L_DTL(t2).SLS_UPRI IS NULL
							AND (x3.DLV_CD = L_DTL(t2).DLV_CD OR x3.DLV_CD = G_NULL_VAL)
							AND (x3.DEST_CD1 = L_DTL(t2).DEST_CD1 OR x3.DEST_CD1 = G_NULL_VAL)
							AND (x3.DEST_CD2 = L_DTL(t2).DEST_CD2 OR x3.DEST_CD2 = G_NULL_VAL)
							AND (x3.DEST_CD3 = L_DTL(t2).DEST_CD3 OR x3.DEST_CD3 = G_NULL_VAL)
							AND x3.ST_DT  <=  L_DTL(t2).DT
							AND x3.END_DT >=  L_DTL(t2).DT
							THEN
								L_QTY := L_QTY + L_DTL(t2).QTY ;
								L_IDX(L_IDX.COUNT + 1) := t2 ;
							END IF ;
						END LOOP ;

						IF x3.LOT_QTY <= L_QTY THEN
							IF x3.UPRI IS NOT NULL THEN
								L_DTL(t1).SLS_UPRI := x3.UPRI ;
							ELSE
								L_DTL(t1).SLS_UPRI := 
									F_CALC_SLS_UPRI(L_DTL(t1).ITM_CD, L_DTL(t1).ITM_SUB1, L_DTL(t1).ITM_SUB2, L_DTL(t1).ITM_SUB3,
											L_DTL(t1).UNIT_CD, L_DTL(t1).CUR_CD, L_DTL(t1).WG_CD, L_DTL(t1).DT,
											L_QTY, x3.UPRI_RATE, x1.UPRI_DEC_PLACE, x1.SLS_UPRI_RND_TYP, L_DTL(t1).PEG_NO, I_NOT_ERR_FLG) ;
							END IF ;
							L_DTL(t1).INTERIM_FLG := x3.INTERIM_FLG ;

							cnf_cnt := cnf_cnt + 1 ;
							G_CNF(cnf_cnt).PEG_NO := L_DTL(t1).PEG_NO ;
							G_CNF(cnf_cnt).MST_NM := 'MAM_CST_SLS_UPRI' ;
							G_CNF(cnf_cnt).ROW_ID := x3.ROW_ID ;

							IF L_IDX.COUNT > 0 THEN
								FOR t3 IN L_IDX.FIRST..L_IDX.LAST LOOP
									idx := L_IDX(t3) ;
									L_DTL(idx).SLS_UPRI := L_DTL(t1).SLS_UPRI ;
									L_DTL(idx).INTERIM_FLG := L_DTL(t1).INTERIM_FLG ;

									L_TMP_CNT := cnf_cnt ;
									FOR t4 IN 1..L_TMP_CNT LOOP
										IF G_CNF(t4).PEG_NO = L_DTL(t1).PEG_NO THEN
											cnf_cnt := cnf_cnt + 1 ;
											G_CNF(cnf_cnt).PEG_NO := L_DTL(idx).PEG_NO ;
											G_CNF(cnf_cnt).MST_NM := G_CNF(t4).MST_NM ;
											G_CNF(cnf_cnt).ROW_ID := G_CNF(t4).ROW_ID ;
										END IF ;
									END LOOP ;
								END LOOP ;
							END IF ;

							GOTO NEXT_T1 ;
						END IF ;

					END IF ;

				END LOOP ;

				<<NEXT_T1>>
					NULL ;

			END LOOP ;

			IF i > 0 THEN
				FORALL p IN 1..i
					UPDATE	MAW_SLS_UPRI_SRV w
					SET	w.SLS_UPRI = L_DTL(p).SLS_UPRI,
						w.INTERIM_FLG = L_DTL(p).INTERIM_FLG
					WHERE	0=0
					AND	w.PEG_NO = L_DTL(p).PEG_NO
					AND	w.SLS_UPRI_FLG = '1'
					AND	w.SLS_UPRI IS NULL
					;
			END IF ;

			<<SKIP_CST_SLS_UPRI>>
				NULL ;

			--品目販売単価マスタの存在チェック
			SELECT	COUNT(*)
			INTO	L_CNT
			FROM	(
				SELECT	m1.*
				FROM	MAM_ITM_SLS_UPRI m1
				WHERE	0=0
				AND	m1.ITM_CD = x1.ITM_CD AND m1.ITM_SUB1 = x1.ITM_SUB1 AND m1.ITM_SUB2 = x1.ITM_SUB2 AND m1.ITM_SUB3 = x1.ITM_SUB3
				UNION ALL
				SELECT	m2.*
				FROM	MAM_ITM_SLS_UPRI m2
				WHERE	0=0
				AND	m2.SLS_UPRI_GRP_CD = x1.SLS_UPRI_GRP_CD
				) m
			WHERE	0=0
			AND	m.UNIT_CD = x1.UNIT_CD
			AND	m.CUR_CD = x1.CUR_CD
			AND	m.WG_CD = x1.WG_CD
			AND	(m.UPRI IS NOT NULL OR m.UPRI_RATE IS NOT NULL)
			;

			IF L_CNT = 0 THEN
				GOTO NEXT_X1 ;
			END IF ;

			--品目販売単価マスタからの取得
			i := 0 ;
			L_DTL.DELETE ;
			FOR y2 IN (
				SELECT	w.*
				FROM	MAW_SLS_UPRI_SRV w
					LEFT OUTER JOIN MAM_ITM_SLS_UPRI m ON 0=0
						AND	(
							m.ITM_CD = x1.ITM_CD AND m.ITM_SUB1 = x1.ITM_SUB1 AND m.ITM_SUB2 = x1.ITM_SUB2 AND m.ITM_SUB3 = x1.ITM_SUB3
							OR
							m.SLS_UPRI_GRP_CD = x1.SLS_UPRI_GRP_CD
							)
						AND	(
							m.SLS_UPRI_RANK_CD = G_NULL_VAL
							OR
							m.SLS_UPRI_RANK_CD = F_GET_SLS_UPRI_RANK(w.CST_CD, w.DLV_CD, w.DEST_CD1, w.DEST_CD2, w.DEST_CD3, w.DT) 
							)
						AND	m.UNIT_CD = x1.UNIT_CD
						AND	m.CUR_CD = x1.CUR_CD
						AND	m.WG_CD = x1.WG_CD
						AND	m.ST_DT  <= w.DT
						AND	m.END_DT >= w.DT
						AND	m.LOT_QTY <= w.QTY
						AND	(m.UPRI IS NOT NULL OR m.UPRI_RATE IS NOT NULL)
				WHERE	0=0
				AND	w.ITM_CD = x1.ITM_CD
				AND	w.ITM_SUB1 = x1.ITM_SUB1
				AND	w.ITM_SUB2 = x1.ITM_SUB2
				AND	w.ITM_SUB3 = x1.ITM_SUB3
				AND	w.CST_CD = x1.CST_CD
				AND	w.UNIT_CD = x1.UNIT_CD
				AND	w.CUR_CD = x1.CUR_CD
				AND	(w.GRP_NO = x1.GRP_NO OR w.GRP_NO IS NULL AND x1.GRP_NO IS NULL)
				AND	w.WG_CD = x1.WG_CD
				AND	w.SLS_UPRI_FLG = '1'
				AND	w.SLS_UPRI IS NULL
				ORDER BY DECODE(m.SLS_UPRI_RANK_CD, G_NULL_VAL, '1', '0'),
					w.PEG_NO
				)
			LOOP
				IF i > 0 THEN
					FOR m IN L_DTL.FIRST..L_DTL.LAST LOOP
						IF L_DTL(m).PEG_NO = y2.PEG_NO THEN
							GOTO NEXT_Y2 ;
						END IF ;
					END LOOP ;
				END IF ;

				i := i + 1 ;
				L_DTL(i) := y2 ;

				<<NEXT_Y2>>
					NULL ;
			END LOOP ;

			IF i = 0 THEN
				GOTO NEXT_X1 ;
			END IF ;

			FOR s1 IN L_DTL.FIRST..L_DTL.LAST LOOP
				IF L_DTL(s1).SLS_UPRI IS NOT NULL THEN
					GOTO NEXT_S1 ;
				END IF ;

				FOR y3 IN ITM_SLS_UPRI(L_DTL(s1).ITM_CD, L_DTL(s1).ITM_SUB1, L_DTL(s1).ITM_SUB2, L_DTL(s1).ITM_SUB3, x1.SLS_UPRI_GRP_CD,
							F_GET_SLS_UPRI_RANK(L_DTL(s1).CST_CD, L_DTL(s1).DLV_CD, L_DTL(s1).DEST_CD1, L_DTL(s1).DEST_CD2, L_DTL(s1).DEST_CD3, L_DTL(s1).DT),
							L_DTL(s1).UNIT_CD, L_DTL(s1).CUR_CD,
							L_DTL(s1).WG_CD, L_DTL(s1).DT
							)
				LOOP
					L_QTY := L_DTL(s1).QTY ;
					IF s1 = L_DTL.LAST THEN
						IF y3.LOT_QTY <= L_QTY THEN
							IF y3.UPRI IS NOT NULL THEN
								L_DTL(s1).SLS_UPRI := y3.UPRI ;
							ELSE
								L_DTL(s1).SLS_UPRI := 
									F_CALC_SLS_UPRI(L_DTL(s1).ITM_CD, L_DTL(s1).ITM_SUB1, L_DTL(s1).ITM_SUB2, L_DTL(s1).ITM_SUB3,
											L_DTL(s1).UNIT_CD, L_DTL(s1).CUR_CD, L_DTL(s1).WG_CD, L_DTL(s1).DT,
											L_QTY, y3.UPRI_RATE, x1.UPRI_DEC_PLACE, x1.SLS_UPRI_RND_TYP, L_DTL(s1).PEG_NO, I_NOT_ERR_FLG) ;
							END IF ;
							L_DTL(s1).INTERIM_FLG := y3.INTERIM_FLG ;

							cnf_cnt := cnf_cnt + 1 ;
							G_CNF(cnf_cnt).PEG_NO := L_DTL(s1).PEG_NO ;
							G_CNF(cnf_cnt).MST_NM := 'MAM_ITM_SLS_UPRI' ;
							G_CNF(cnf_cnt).ROW_ID := y3.ROW_ID ;

							GOTO NEXT_S1 ;
						END IF ;
					ELSE
						L_IDX.DELETE ;
						FOR t2 IN s1 + 1..L_DTL.LAST LOOP
							IF L_DTL(t2).SLS_UPRI IS NULL
							AND (y3.SLS_UPRI_RANK_CD = G_NULL_VAL 
								OR y3.SLS_UPRI_RANK_CD = F_GET_SLS_UPRI_RANK(L_DTL(t2).CST_CD, L_DTL(t2).DLV_CD, 
												L_DTL(t2).DEST_CD1, L_DTL(t2).DEST_CD2, L_DTL(t2).DEST_CD3, L_DTL(t2).DT)
								)
							AND y3.ST_DT  <=  L_DTL(t2).DT
							AND y3.END_DT >=  L_DTL(t2).DT
							THEN
								L_QTY := L_QTY + L_DTL(t2).QTY ;
								L_IDX(L_IDX.COUNT + 1) := t2 ;
							END IF ;
						END LOOP ;

						IF y3.LOT_QTY <= L_QTY THEN
							IF y3.UPRI IS NOT NULL THEN
								L_DTL(s1).SLS_UPRI := y3.UPRI ;
							ELSE
								L_DTL(s1).SLS_UPRI := 
									F_CALC_SLS_UPRI(L_DTL(s1).ITM_CD, L_DTL(s1).ITM_SUB1, L_DTL(s1).ITM_SUB2, L_DTL(s1).ITM_SUB3,
											L_DTL(s1).UNIT_CD, L_DTL(s1).CUR_CD, L_DTL(s1).WG_CD, L_DTL(s1).DT,
											L_QTY, y3.UPRI_RATE, x1.UPRI_DEC_PLACE, x1.SLS_UPRI_RND_TYP, L_DTL(s1).PEG_NO, I_NOT_ERR_FLG) ;
							END IF ;
							L_DTL(s1).INTERIM_FLG := y3.INTERIM_FLG ;

							cnf_cnt := cnf_cnt + 1 ;
							G_CNF(cnf_cnt).PEG_NO := L_DTL(s1).PEG_NO ;
							G_CNF(cnf_cnt).MST_NM := 'MAM_ITM_SLS_UPRI' ;
							G_CNF(cnf_cnt).ROW_ID := y3.ROW_ID ;

							IF L_IDX.COUNT > 0 THEN
								FOR t3 IN L_IDX.FIRST..L_IDX.LAST LOOP
									idx := L_IDX(t3) ;
									L_DTL(idx).SLS_UPRI := L_DTL(s1).SLS_UPRI ;
									L_DTL(idx).INTERIM_FLG := L_DTL(s1).INTERIM_FLG ;

									L_TMP_CNT := cnf_cnt ;
									FOR t4 IN 1..L_TMP_CNT LOOP
										IF G_CNF(t4).PEG_NO = L_DTL(s1).PEG_NO THEN
											cnf_cnt := cnf_cnt + 1 ;
											G_CNF(cnf_cnt).PEG_NO := L_DTL(idx).PEG_NO ;
											G_CNF(cnf_cnt).MST_NM := G_CNF(t4).MST_NM ;
											G_CNF(cnf_cnt).ROW_ID := G_CNF(t4).ROW_ID ;
										END IF ;
									END LOOP ;
								END LOOP ;
							END IF ;

							GOTO NEXT_S1 ;
						END IF ;

					END IF ;

				END LOOP ;

				<<NEXT_S1>>
					NULL ;
			END LOOP ;

			IF i > 0 THEN
				FORALL q IN 1..i
					UPDATE	MAW_SLS_UPRI_SRV w
					SET	w.SLS_UPRI = L_DTL(q).SLS_UPRI,
						w.INTERIM_FLG = L_DTL(q).INTERIM_FLG
					WHERE	0=0
					AND	w.PEG_NO = L_DTL(q).PEG_NO
					AND	w.SLS_UPRI_FLG = '1'
					AND	w.SLS_UPRI IS NULL
					;
			END IF ;

			<<NEXT_X1>>
				NULL ;

		END LOOP ;

		IF cnf_cnt > 0 THEN
			DELETE MAW_UPRI_CNF ;
			FORALL t IN 1..cnf_cnt
				INSERT INTO MAW_UPRI_CNF VALUES G_CNF(t) ;
		END IF ;

		G_CNF.DELETE ;
		L_DTL.DELETE ;
		L_IDX.DELETE ;

	END P_SET_SLS_UPRI ;

	PROCEDURE P_SET_SLS_STD_UPRI
	/*********************************************************
	<SYNOPSIS>
		標準販売単価を取得してMAW_SLS_UPRI_SRVにセットする
	<REMARKS>
		標準販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_QTY	MAPA_META.QTY%TYPE ;

		L_DTL	DTL_LIST ;
		i	BINARY_INTEGER ;

		L_IDX	IDX_LIST ;
		idx	INTEGER ;
	BEGIN
		FOR x1 IN (
			SELECT	DISTINCT
				w.ITM_CD,
				w.ITM_SUB1,
				w.ITM_SUB2,
				w.ITM_SUB3,
				w.UNIT_CD,
				w.CUR_CD,
				w.GRP_NO,
				w.WG_CD
			FROM	MAW_SLS_UPRI_SRV w
			WHERE	0=0
			AND	w.STD_SLS_UPRI_FLG = '1'
			)
		LOOP
			i := 0 ;
			L_DTL.DELETE ;
			FOR x2 IN (
				SELECT	w.*
				FROM	MAW_SLS_UPRI_SRV w
				WHERE	0=0
				AND	w.ITM_CD = x1.ITM_CD
				AND	w.ITM_SUB1 = x1.ITM_SUB1
				AND	w.ITM_SUB2 = x1.ITM_SUB2
				AND	w.ITM_SUB3 = x1.ITM_SUB3
				AND	w.UNIT_CD = x1.UNIT_CD
				AND	w.CUR_CD = x1.CUR_CD
				AND	(w.GRP_NO = x1.GRP_NO OR w.GRP_NO IS NULL AND x1.GRP_NO IS NULL)
				AND	w.WG_CD = x1.WG_CD
				AND	w.STD_SLS_UPRI_FLG = '1'
				ORDER BY w.PEG_NO
				)
			LOOP
				i := i + 1 ;
				L_DTL(i) := x2 ;
			END LOOP ;

			FOR t1 IN L_DTL.FIRST..L_DTL.LAST LOOP
				IF L_DTL(t1).STD_SLS_UPRI IS NOT NULL THEN
					GOTO NEXT_T1 ;
				END IF ;

				FOR x3 IN (
					SELECT	m.LOT_QTY,
						m.UPRI,
						m.ST_DT,
						m.END_DT
					FROM	MAM_STD_SLS_UPRI m
					WHERE	0=0
					AND	m.ITM_CD = L_DTL(t1).ITM_CD
					AND	m.ITM_SUB1 = L_DTL(t1).ITM_SUB1
					AND	m.ITM_SUB2 = L_DTL(t1).ITM_SUB2
					AND	m.ITM_SUB3 = L_DTL(t1).ITM_SUB3
					AND	m.UNIT_CD = L_DTL(t1).UNIT_CD
					AND	m.CUR_CD = L_DTL(t1).CUR_CD
					AND	m.WG_CD = L_DTL(t1).WG_CD
					AND	m.ST_DT  <= L_DTL(t1).DT
					AND	m.END_DT >= L_DTL(t1).DT
					ORDER BY m.LOT_QTY DESC
					)
				LOOP
					L_QTY := L_DTL(t1).QTY ;
					IF t1 = L_DTL.LAST THEN
						IF x3.LOT_QTY <= L_QTY THEN
							L_DTL(t1).STD_SLS_UPRI := x3.UPRI ;
							GOTO NEXT_T1 ;
						END IF ;
					ELSE
						L_IDX.DELETE ;
						FOR t2 IN t1 + 1..L_DTL.LAST LOOP
							IF L_DTL(t1).STD_SLS_UPRI IS NULL
							AND x3.ST_DT  <=  L_DTL(t2).DT
							AND x3.END_DT >=  L_DTL(t2).DT
							THEN
								L_QTY := L_QTY + L_DTL(t2).QTY ;
								L_IDX(L_IDX.COUNT + 1) := t2 ;
							END IF ;
						END LOOP ;


						IF x3.LOT_QTY <= L_QTY THEN
							L_DTL(t1).STD_SLS_UPRI := x3.UPRI ;
							IF L_IDX.COUNT > 0 THEN
								FOR t3 IN L_IDX.FIRST..L_IDX.LAST LOOP
									idx := L_IDX(t3) ;
									L_DTL(idx).STD_SLS_UPRI := x3.UPRI ;
								END LOOP ;
							END IF ;

							GOTO NEXT_T1 ;
						END IF ;
					END IF ;
				END LOOP ;

				<<NEXT_T1>>
					NULL ;

			END LOOP ;

			IF i > 0 THEN
				FORALL p IN 1..i
					UPDATE	MAW_SLS_UPRI_SRV t
					SET	t.STD_SLS_UPRI = L_DTL(p).STD_SLS_UPRI
					WHERE	0=0
					AND	t.PEG_NO = L_DTL(p).PEG_NO
					AND	t.STD_SLS_UPRI_FLG = '1'
					;
			END IF ;

		END LOOP ;

		L_DTL.DELETE ;
		L_IDX.DELETE ;

	END P_SET_SLS_STD_UPRI ;

	PROCEDURE P_SET_STD_UPRI
	/*********************************************************
	<SYNOPSIS>
		標準単価を取得してMAW_SLS_UPRI_SRVにセットする
	<REMARKS>
		標準単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_STD_UPRI_TYP	MAPA_META.STD_UPRI_SEL_TYP%TYPE ;
	BEGIN
		L_STD_UPRI_TYP := MAPA_CO.F_GET_CO_REC().GM_STD_UPRI_TYP ;
		UPDATE	MAW_SLS_UPRI_SRV t
		SET	t.STD_UPRI 
				= MAPA_STD_COST.F_GET_STD_UPRI(t.ITM_CD, t.ITM_SUB1, t.ITM_SUB2, t.ITM_SUB3, t.DT, t.STD_UPRI_WG_CD, L_STD_UPRI_TYP)
		WHERE	0=0
		AND	t.STD_UPRI_FLG = '1'
		AND	t.STD_UPRI_WG_CD IS NOT NULL
		;
	END P_SET_STD_UPRI ;

	PROCEDURE P_SET_SLS_UPRI_WK
	/*********************************************************
	<SYNOPSIS>
		販売単価・標準販売単価・標準単価を取得してMAW_SLS_UPRI_SRV
		にセットする
	<REMARKS>
		販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
	BEGIN

		P_SET_SLS_UPRI() ;

		P_SET_SLS_STD_UPRI() ;

		P_SET_STD_UPRI() ;

	END P_SET_SLS_UPRI_WK ;

	PROCEDURE P_SET_SLS_UPRI_WK_NE
	/*********************************************************
	<SYNOPSIS>
		販売単価・標準販売単価・標準単価を取得してMAW_SLS_UPRI_SRV
		にセットする
	<REMARKS>
		販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
		P_SET_SLS_UPRI_WK：標準販売単価マスタが存在しない場合はエラー
		P_SET_SLS_UPRI_WK_NE：標準販売単価マスタが存在しない場合は単価がNULL
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
	BEGIN

		P_SET_SLS_UPRI('1') ;

		P_SET_SLS_STD_UPRI() ;

		P_SET_STD_UPRI() ;

	END P_SET_SLS_UPRI_WK_NE ;

END MAPA_SLS_UPRI ;

/
show errors;


