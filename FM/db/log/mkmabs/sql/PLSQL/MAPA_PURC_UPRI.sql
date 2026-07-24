SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MAPA_PURC_UPRI
/*********************************************************
<Synopsis>
		購買単価取得ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	PROCEDURE P_SET_PURC_UPRI_WK ;
	/*********************************************************
	<SYNOPSIS>
		購買単価を取得してMAW_PURC_UPRI_SRVにセットする
	<REMARKS>
		購買単価を取得する対象は呼び出し前にMAW_PURC_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

END MAPA_PURC_UPRI ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_PURC_UPRI
IS
	G_NULL_VAL	CONSTANT VARCHAR2(1) := MAC_STR.NULL_VAL ;

	TYPE CNF_LIST IS TABLE OF MAW_UPRI_CNF%ROWTYPE INDEX BY BINARY_INTEGER ;
	G_CNF	CNF_LIST ;
	cnf_cnt	BINARY_INTEGER ;

	CURSOR PURC_UPRI (
		I_ITM_CD 	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_MAKER_CD	IN MAPA_META.BP_CD%TYPE,
		I_UNIT_CD	IN MAPA_META.UNIT_CD%TYPE,
		I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
		I_LOC_CD	IN MAPA_META.LOC_CD%TYPE,
		I_DLV_CD	IN MAPA_META.BP_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_DT		IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	m.MAKER_CD,
			m.LOC_CD,
			m.DLV_CD,
			m.LOT_QTY,
			m.UPRI,
			m.INTERIM_FLG,
			m.ST_DT,
			m.END_DT,
			m.ROW_ID,
			m.ORG_WG_CD
		FROM	MAM_PURC_UPRI m
		WHERE	0=0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.SPPL_CD = I_SPPL_CD
		AND	(m.MAKER_CD = I_MAKER_CD OR m.MAKER_CD = G_NULL_VAL)
		AND	m.UNIT_CD = I_UNIT_CD
		AND	m.CUR_CD = I_CUR_CD
		AND	(m.LOC_CD = I_LOC_CD OR m.LOC_CD = G_NULL_VAL)
		AND	(m.DLV_CD = I_DLV_CD OR m.DLV_CD = G_NULL_VAL)
		AND	m.WG_CD = I_WG_CD
		AND	m.ST_DT  <= I_DT
		AND  	m.END_DT >= I_DT
		ORDER BY DECODE(m.MAKER_CD, G_NULL_VAL, '1', '0') || DECODE(m.LOC_CD, G_NULL_VAL, '1', '0') || DECODE(m.DLV_CD, G_NULL_VAL, '1', '0'),
			m.LOT_QTY DESC
	;

	PROCEDURE P_SET_PURC_UPRI_WK
	/*********************************************************
	<SYNOPSIS>
		購買単価を取得してMAW_PURC_UPRI_SRVにセットする
	<REMARKS>
		購買単価を取得する対象は呼び出し前にMAW_PURC_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_QTY	MAPA_META.QTY%TYPE ;

		TYPE DTL_LIST IS TABLE OF MAW_PURC_UPRI_SRV%ROWTYPE INDEX BY BINARY_INTEGER ;
		L_DTL	DTL_LIST ;
		i	BINARY_INTEGER ;

		TYPE IDX_LIST IS TABLE OF INTEGER INDEX BY BINARY_INTEGER ;
		L_IDX	IDX_LIST ;
		idx	INTEGER ;

	BEGIN
		cnf_cnt := 0 ;
		G_CNF.DELETE ;
		FOR x1 IN (
			SELECT	DISTINCT
				w.ITM_CD,
				w.ITM_SUB1,
				w.ITM_SUB2,
				w.ITM_SUB3,
				w.SPPL_CD,
				w.MAKER_CD,
				w.UNIT_CD,
				w.CUR_CD,
				w.GRP_NO
			FROM	MAW_PURC_UPRI_SRV w
			WHERE	0=0
			AND	w.UPRI IS NULL
			)
		LOOP
			i := 0 ;
			L_DTL.DELETE ;
			FOR x2 IN (
				SELECT	w.*
				FROM	MAW_PURC_UPRI_SRV w
					LEFT OUTER JOIN MAM_PURC_UPRI m ON 0=0
						AND	m.ITM_CD = w.ITM_CD AND m.ITM_SUB1 = w.ITM_SUB1 AND m.ITM_SUB2 = w.ITM_SUB2 AND m.ITM_SUB3 = w.ITM_SUB3
						AND	m.SPPL_CD = w.SPPL_CD
						AND	(m.MAKER_CD = w.MAKER_CD OR m.MAKER_CD = G_NULL_VAL)
						AND	m.UNIT_CD = w.UNIT_CD
						AND	m.CUR_CD = w.CUR_CD
						AND	(m.LOC_CD = w.LOC_CD OR m.LOC_CD = G_NULL_VAL)
						AND	(m.DLV_CD = w.DLV_CD OR m.DLV_CD = G_NULL_VAL)
						AND	m.WG_CD = w.WG_CD
						AND	m.ST_DT  <= w.DT
						AND  	m.END_DT >= w.DT
						AND	m.LOT_QTY <= w.QTY
				WHERE	0=0
				AND	w.ITM_CD = x1.ITM_CD
				AND	w.ITM_SUB1 = x1.ITM_SUB1
				AND	w.ITM_SUB2 = x1.ITM_SUB2
				AND	w.ITM_SUB3 = x1.ITM_SUB3
				AND	w.SPPL_CD = x1.SPPL_CD
				AND	w.MAKER_CD = x1.MAKER_CD
				AND	w.UNIT_CD = x1.UNIT_CD
				AND	w.CUR_CD = x1.CUR_CD
				AND	(w.GRP_NO = x1.GRP_NO OR w.GRP_NO IS NULL AND x1.GRP_NO IS NULL)
				AND	w.UPRI IS NULL
				ORDER BY DECODE(NVL(m.MAKER_CD, G_NULL_VAL), G_NULL_VAL, '1', '0') || DECODE(NVL(m.LOC_CD, G_NULL_VAL), G_NULL_VAL, '1', '0') || DECODE(NVL(m.DLV_CD, G_NULL_VAL), G_NULL_VAL, '1', '0'),
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
				IF L_DTL(t1).UPRI IS NOT NULL THEN
					GOTO NEXT_T1 ;
				END IF ;

				FOR x3 IN PURC_UPRI(L_DTL(t1).ITM_CD, L_DTL(t1).ITM_SUB1, L_DTL(t1).ITM_SUB2, L_DTL(t1).ITM_SUB3, 
							L_DTL(t1).SPPL_CD, L_DTL(t1).MAKER_CD, L_DTL(t1).UNIT_CD, 
							L_DTL(t1).CUR_CD, L_DTL(t1).LOC_CD, L_DTL(t1).DLV_CD, 
							L_DTL(t1).WG_CD, L_DTL(t1).DT
							)
				LOOP
					L_QTY := L_DTL(t1).QTY ;
					IF t1 = L_DTL.LAST THEN
						IF x3.LOT_QTY <= L_QTY THEN
							L_DTL(t1).UPRI := x3.UPRI ;
							L_DTL(t1).INTERIM_FLG := x3.INTERIM_FLG ;

							cnf_cnt := cnf_cnt + 1 ;
							G_CNF(cnf_cnt).PEG_NO := L_DTL(t1).PEG_NO ;
							G_CNF(cnf_cnt).MST_NM := 'MAM_PURC_UPRI' ;
							G_CNF(cnf_cnt).ROW_ID := x3.ROW_ID ;
							GOTO NEXT_T1 ;
						END IF ;
					ELSE
						L_IDX.DELETE ;
						FOR t2 IN t1 + 1..L_DTL.LAST LOOP
							IF L_DTL(t2).UPRI IS NULL
							AND (x3.MAKER_CD = L_DTL(t2).MAKER_CD OR x3.MAKER_CD = G_NULL_VAL)
							AND (x3.LOC_CD = L_DTL(t2).LOC_CD OR x3.LOC_CD = G_NULL_VAL)
							AND (x3.DLV_CD = L_DTL(t2).DLV_CD OR x3.DLV_CD = G_NULL_VAL)
							AND x3.ST_DT  <=  L_DTL(t2).DT
							AND x3.END_DT >=  L_DTL(t2).DT
							AND (x3.ORG_WG_CD = G_NULL_VAL OR x3.ORG_WG_CD = L_DTL(t2).WG_CD)
							THEN
								L_QTY := L_QTY + L_DTL(t2).QTY ;
								L_IDX(L_IDX.COUNT + 1) := t2 ;
							END IF ;
						END LOOP ;

						IF x3.LOT_QTY <= L_QTY THEN
							L_DTL(t1).UPRI := x3.UPRI ;
							L_DTL(t1).INTERIM_FLG := x3.INTERIM_FLG ;

							cnf_cnt := cnf_cnt + 1 ;
							G_CNF(cnf_cnt).PEG_NO := L_DTL(t1).PEG_NO ;
							G_CNF(cnf_cnt).MST_NM := 'MAM_PURC_UPRI' ;
							G_CNF(cnf_cnt).ROW_ID := x3.ROW_ID ;

							IF L_IDX.COUNT > 0 THEN
								FOR t3 IN L_IDX.FIRST..L_IDX.LAST LOOP
									idx := L_IDX(t3) ;
									L_DTL(idx).UPRI := x3.UPRI ;
									L_DTL(idx).INTERIM_FLG := x3.INTERIM_FLG ;

									cnf_cnt := cnf_cnt + 1 ;
									G_CNF(cnf_cnt).PEG_NO := L_DTL(idx).PEG_NO ;
									G_CNF(cnf_cnt).MST_NM := 'MAM_PURC_UPRI' ;
									G_CNF(cnf_cnt).ROW_ID := x3.ROW_ID ;
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
					UPDATE	MAW_PURC_UPRI_SRV w
					SET	w.UPRI = L_DTL(p).UPRI,
						w.INTERIM_FLG = L_DTL(p).INTERIM_FLG
					WHERE	0=0
					AND	w.PEG_NO = L_DTL(p).PEG_NO
					AND	w.UPRI IS NULL
					;
			END IF ;

		END LOOP ;

		IF cnf_cnt > 0 THEN
			DELETE MAW_UPRI_CNF ;
			FORALL t IN 1..cnf_cnt
				INSERT INTO MAW_UPRI_CNF VALUES G_CNF(t) ;
		END IF ;

		G_CNF.DELETE ;
		L_DTL.DELETE ;
		L_IDX.DELETE ;

	END P_SET_PURC_UPRI_WK ;

END MAPA_PURC_UPRI ;

/
show errors;


