CREATE OR REPLACE PACKAGE BODY MGPA_BOM_EX
IS
	G_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

	G_MAX_LVL	CONSTANT MAPA_META.BOM_LVL%TYPE := 500 ;
	G_MAX_ITM	CONSTANT INTEGER := 6 ;
	G_MAX_ITM_NUM	CONSTANT INTEGER := 999999 ; --G_MAX_ITMの桁に対する最大数
	G_SEQ_DIGIT	CONSTANT INTEGER := MAPA_META.BOM_EX_SORT_L() ;
	G_MAX_CNT	CONSTANT INTEGER := 5000 ; --バルクインサートでの最大レコード数

	TYPE BOM_LIST IS TABLE OF MGW_BOM_EX%ROWTYPE INDEX BY BINARY_INTEGER ;
	G_BOM	BOM_LIST ;
	i	INTEGER ;

	L_CNT INTEGER ;

	CURSOR CTG_LIST (
		L_CALC_CTG_TYP	IN MAPA_META.CALC_CTG_TYP%TYPE
		)
	IS
		SELECT	w.CALC_CTG_CD
		FROM	MGW_CALC_GRP_CTG w
		WHERE	0=0
		AND	w.CALC_CTG_TYP = L_CALC_CTG_TYP
		ORDER BY w.CTG_PRIO, w.CALC_CTG_CD
	;

	PROCEDURE P_INS_BOM_EX
	/*********************************************************
	<SYNOPSIS>
		MGW_BOM_EXにレコードを作成する
	<REMARKS>
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF i = 0 THEN
			RETURN ;
		END IF ;

		FORALL t IN 1..i
			INSERT INTO MGW_BOM_EX VALUES G_BOM(t) ;

		G_BOM.DELETE ;
		i := 0 ;

	END P_INS_BOM_EX ;

	PROCEDURE P_UPD_LOOP (
		I_LVL	IN MAPA_META.BOM_LVL%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MGW_BOM_EXのLOOP_FLGを更新する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_LVL
			チェック対象のレベル
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		NULL ;

		FOR x IN (
			SELECT	t.ROWID	row_id
			FROM	MGW_BOM_EX t
			WHERE	0=0
			AND	t.BOM_LVL = I_LVL
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX w
					WHERE	0=0
					AND	w.BOM_LVL < t.BOM_LVL
					AND	w.ITM_CD = t.ITM_CD
					AND	w.ITM_SUB1 = t.ITM_SUB1
					AND	w.ITM_SUB2 = t.ITM_SUB2
					AND	w.ITM_SUB3 = t.ITM_SUB3
					AND	(w.WG_CD = G_NULL_VAL OR w.WG_CD = t.WG_CD)
					AND	SUBSTR(w.SORT_NO, 1, (w.BOM_LVL + 1) * G_MAX_ITM) = SUBSTR(t.SORT_NO, 1, (w.BOM_LVL + 1) * G_MAX_ITM)
				)
			)
		LOOP
			UPDATE	MGW_BOM_EX t
			SET	t.LOOP_FLG = '1'
			WHERE	0=0
			AND	t.ROWID = x.row_id
			;
		END LOOP ;

	END P_UPD_LOOP ;

	PROCEDURE P_SET_TGT_DATA (
		I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_BOM_PTN	IN MAPA_META.BOM_PTN%TYPE,
		I_REV_FLG	IN MAPA_META.FLG%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MGW_BOM_EX_TMPに設定されているデータに対して必要な
		マスタデータをワークテーブルに作成する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_BOM_PTN
			構成パタン
	<IN>	I_REV_FLG
			逆展開ＦＬＧ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN

		DELETE MGW_BOM_EX_ITM w ;
		FOR L1 IN CTG_LIST(MAC_CALC_CTG_TYP.CALC_ITM) LOOP
			INSERT INTO MGW_BOM_EX_ITM (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.CALC_CTG_CD = L1.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	EXISTS (
					SELECT	'X'
					FROM	MAM_GRP_WG x
					WHERE	0=0
					AND	x.CALC_GRP_CD = I_CALC_GRP_CD
					AND	x.WG_CD = m.WG_CD
				)
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_TMP x
					WHERE	0=0
					AND	x.ITM_CD = m.ITM_CD
					AND	x.ITM_SUB1 = m.ITM_SUB1
					AND	x.ITM_SUB2 = m.ITM_SUB2
					AND	x.ITM_SUB3 = m.ITM_SUB3
					AND	(I_REV_FLG = '1' OR x.WG_CD = G_NULL_VAL OR x.WG_CD = m.WG_CD)
				)
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_ITM w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = m.WG_CD
				)
			;
		END LOOP ;

		DELETE MGW_BOM_EX_DTL w ;
		FOR L2 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_DTL) LOOP
			INSERT INTO MGW_BOM_EX_DTL (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				BOM_PTN,
				WG_CD,
				RQST_WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.BOM_PTN,
				m.WG_CD,
				DECODE(m.RQST_WG_CD, G_NULL_VAL, m.WG_CD, m.RQST_WG_CD),
				m.CALC_CTG_CD
			FROM	MGT_ITM_DTL m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.CALC_CTG_CD = L2.CALC_CTG_CD
			AND (I_WG_CD <> G_NULL_VAL OR m.RQST_WG_CD = G_NULL_VAL)
			AND	(
				I_BOM_PTN IS NOT NULL AND m.BOM_PTN = I_BOM_PTN
				OR
				I_BOM_PTN IS NULL
				OR
				m.BOM_PTN IS NULL
				OR
				m.BOM_PTN = MAC_STR.NULL_VAL
				)
			AND	m.NON_CALC_FLG = '0'
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_ITM t
					WHERE	0=0
					AND	t.ITM_CD = m.ITM_CD
					AND	t.ITM_SUB1 = m.ITM_SUB1
					AND	t.ITM_SUB2 = m.ITM_SUB2
					AND	t.ITM_SUB3 = m.ITM_SUB3
					AND	t.WG_CD = m.WG_CD
				)
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_DTL w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = m.WG_CD
					AND	w.RQST_WG_CD = DECODE(m.RQST_WG_CD, G_NULL_VAL, m.WG_CD, m.RQST_WG_CD)
				)
			;

			INSERT INTO MGW_BOM_EX_DTL (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				BOM_PTN,
				WG_CD,
				RQST_WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.BOM_PTN,
				t.WG_CD,
				DECODE(m.RQST_WG_CD, G_NULL_VAL, t.WG_CD, m.RQST_WG_CD),
				m.CALC_CTG_CD
			FROM	MGT_ITM_DTL m, MGW_BOM_EX_TMP t
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = G_NULL_VAL
			AND	m.CALC_CTG_CD = L2.CALC_CTG_CD
			AND (I_WG_CD <> G_NULL_VAL OR m.RQST_WG_CD = G_NULL_VAL)
			AND	(
				I_BOM_PTN IS NOT NULL AND m.BOM_PTN = I_BOM_PTN
				OR
				I_BOM_PTN IS NULL
				OR
				m.BOM_PTN IS NULL
				OR
				m.BOM_PTN = MAC_STR.NULL_VAL
				)
			AND	m.NON_CALC_FLG = '0'
			AND	m.ITM_CD = t.ITM_CD
			AND	m.ITM_SUB1 = t.ITM_SUB1
			AND	m.ITM_SUB2 = t.ITM_SUB2
			AND	m.ITM_SUB3 = t.ITM_SUB3
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_DTL w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = t.WG_CD
				)
			;
		END LOOP ;

		LOOP
			L_CNT := 0 ;
			FOR L2 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_DTL) LOOP
				-- 依頼先ＷＧデータ
				INSERT INTO MGW_BOM_EX_DTL (
					ITM_CD,
					ITM_SUB1,
					ITM_SUB2,
					ITM_SUB3,
					BOM_PTN,
					WG_CD,
					RQST_WG_CD,
					CALC_CTG_CD
					)
				SELECT	DISTINCT
					m.ITM_CD,
					m.ITM_SUB1,
					m.ITM_SUB2,
					m.ITM_SUB3,
					m.BOM_PTN,
					DECODE(m.RQST_WG_CD, G_NULL_VAL, m.WG_CD, t.WG_CD),
					DECODE(m.RQST_WG_CD, G_NULL_VAL, t.WG_CD, m.RQST_WG_CD),
					m.CALC_CTG_CD
				FROM	MGW_BOM_EX_DTL t, MGT_ITM_DTL m
				WHERE	0=0
				AND	t.RQST_WG_CD <> t.WG_CD
				AND	(t.BOM_PTN IS NULL OR t.BOM_PTN = MAC_STR.NULL_VAL)
				AND	t.ITM_CD = m.ITM_CD
				AND	t.ITM_SUB1 = m.ITM_SUB1
				AND	t.ITM_SUB2 = m.ITM_SUB2
				AND	t.ITM_SUB3 = m.ITM_SUB3
				AND	t.RQST_WG_CD = m.WG_CD
				AND	t.WG_CD <> m.RQST_WG_CD
				AND	m.TERM = I_TERM
				AND	m.CALC_CTG_CD = L2.CALC_CTG_CD
				AND	(
					I_BOM_PTN IS NOT NULL AND m.BOM_PTN = I_BOM_PTN
					OR
					I_BOM_PTN IS NULL
					OR
					m.BOM_PTN IS NULL
					OR
					m.BOM_PTN = MAC_STR.NULL_VAL
				)
				AND	m.NON_CALC_FLG = '0'
				AND	NOT EXISTS (
						SELECT	'X'
						FROM	MGW_BOM_EX_DTL w
						WHERE	0=0
						AND	w.ITM_CD = m.ITM_CD
						AND	w.ITM_SUB1 = m.ITM_SUB1
						AND	w.ITM_SUB2 = m.ITM_SUB2
						AND	w.ITM_SUB3 = m.ITM_SUB3
						AND	w.WG_CD = DECODE(m.RQST_WG_CD, G_NULL_VAL, m.WG_CD, t.WG_CD)
						AND	w.RQST_WG_CD = DECODE(m.RQST_WG_CD, G_NULL_VAL, t.WG_CD, m.RQST_WG_CD)
					)
				;
				L_CNT := L_CNT + SQL%ROWCOUNT ;
			END LOOP ;
			IF L_CNT = 0 THEN
				EXIT ;
			END IF ;
		END LOOP ;

		DELETE MGW_BOM_EX_PURC w ;
		FOR L3 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_PURC) LOOP
			INSERT INTO MGW_BOM_EX_PURC (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_PURC m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.CALC_CTG_CD = L3.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_ITM t
					WHERE	0=0
					AND	t.ITM_CD = m.ITM_CD
					AND	t.ITM_SUB1 = m.ITM_SUB1
					AND	t.ITM_SUB2 = m.ITM_SUB2
					AND	t.ITM_SUB3 = m.ITM_SUB3
					AND	t.WG_CD = m.WG_CD
				)
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_PURC w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = m.WG_CD
				)
			;

			INSERT INTO MGW_BOM_EX_PURC (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				t.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_PURC m, MGW_BOM_EX_ITM t
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = G_NULL_VAL
			AND	m.CALC_CTG_CD = L3.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	m.ITM_CD = t.ITM_CD
			AND	m.ITM_SUB1 = t.ITM_SUB1
			AND	m.ITM_SUB2 = t.ITM_SUB2
			AND	m.ITM_SUB3 = t.ITM_SUB3
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_PURC w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = t.WG_CD
				)
			;
		END LOOP ;

		DELETE MGW_BOM_EX_PROC w ;
		FOR L8 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_PROC) LOOP
			INSERT INTO MGW_BOM_EX_PROC (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_PROC m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.CALC_CTG_CD = L8.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_PROC w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = m.WG_CD
				)
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_ITM t
					WHERE	0=0
					AND	t.ITM_CD = m.ITM_CD
					AND	t.ITM_SUB1 = m.ITM_SUB1
					AND	t.ITM_SUB2 = m.ITM_SUB2
					AND	t.ITM_SUB3 = m.ITM_SUB3
					AND	t.WG_CD = m.WG_CD
				)
			;

			INSERT INTO MGW_BOM_EX_PROC (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				t.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_PROC m, MGW_BOM_EX_ITM t
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = G_NULL_VAL
			AND	m.CALC_CTG_CD = L8.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	m.ITM_CD = t.ITM_CD
			AND	m.ITM_SUB1 = t.ITM_SUB1
			AND	m.ITM_SUB2 = t.ITM_SUB2
			AND	m.ITM_SUB3 = t.ITM_SUB3
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_PROC w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = t.WG_CD
				)
			;
		END LOOP ;

		DELETE MGW_BOM_EX_PROV w ;
		FOR L4 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_PROV) LOOP
			INSERT INTO MGW_BOM_EX_PROV (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_PROV m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.CALC_CTG_CD = L4.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_PROV w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = m.WG_CD
				)
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_ITM t
					WHERE	0=0
					AND	t.ITM_CD = m.ITM_CD
					AND	t.ITM_SUB1 = m.ITM_SUB1
					AND	t.ITM_SUB2 = m.ITM_SUB2
					AND	t.ITM_SUB3 = m.ITM_SUB3
					AND	t.WG_CD = m.WG_CD
				)
			;

			INSERT INTO MGW_BOM_EX_PROV (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				t.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_PROV m, MGW_BOM_EX_ITM t
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = G_NULL_VAL
			AND	m.CALC_CTG_CD = L4.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	m.ITM_CD = t.ITM_CD
			AND	m.ITM_SUB1 = t.ITM_SUB1
			AND	m.ITM_SUB2 = t.ITM_SUB2
			AND	m.ITM_SUB3 = t.ITM_SUB3
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_PROV w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = t.WG_CD
				)
			;
		END LOOP ;

		DELETE MGW_BOM_EX_SLS w ;
		FOR L5 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_SLS) LOOP
			INSERT INTO MGW_BOM_EX_SLS (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_SLS m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.CALC_CTG_CD = L5.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_SLS w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = m.WG_CD
				)
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_ITM t
					WHERE	0=0
					AND	t.ITM_CD = m.ITM_CD
					AND	t.ITM_SUB1 = m.ITM_SUB1
					AND	t.ITM_SUB2 = m.ITM_SUB2
					AND	t.ITM_SUB3 = m.ITM_SUB3
					AND	t.WG_CD = m.WG_CD
				)
			;

			INSERT INTO MGW_BOM_EX_SLS (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				t.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_SLS m, MGW_BOM_EX_ITM t
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = G_NULL_VAL
			AND	m.CALC_CTG_CD = L5.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	m.ITM_CD = t.ITM_CD
			AND	m.ITM_SUB1 = t.ITM_SUB1
			AND	m.ITM_SUB2 = t.ITM_SUB2
			AND	m.ITM_SUB3 = t.ITM_SUB3
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_SLS w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = t.WG_CD
				)
			;
		END LOOP ;

		DELETE MGW_BOM_EX_FIX w ;
		FOR L6 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_FIX) LOOP
			INSERT INTO MGW_BOM_EX_FIX (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_FIX m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.CALC_CTG_CD = L6.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_FIX w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = m.WG_CD
				)
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_ITM t
					WHERE	0=0
					AND	t.ITM_CD = m.ITM_CD
					AND	t.ITM_SUB1 = m.ITM_SUB1
					AND	t.ITM_SUB2 = m.ITM_SUB2
					AND	t.ITM_SUB3 = m.ITM_SUB3
					AND	t.WG_CD = m.WG_CD
				)
			;

			INSERT INTO MGW_BOM_EX_FIX (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				t.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_FIX m, MGW_BOM_EX_ITM t
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = G_NULL_VAL
			AND	m.CALC_CTG_CD = L6.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	m.ITM_CD = t.ITM_CD
			AND	m.ITM_SUB1 = t.ITM_SUB1
			AND	m.ITM_SUB2 = t.ITM_SUB2
			AND	m.ITM_SUB3 = t.ITM_SUB3
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_FIX w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
					AND	w.WG_CD = t.WG_CD
				)
			;
		END LOOP ;

		UPDATE	MGW_BOM_EX_ITM t
		SET	t.DTL_CALC_CTG_CD =
				(
				SELECT	MIN(w.CALC_CTG_CD)
				FROM	MGW_BOM_EX_DTL w
				WHERE	0=0
				AND	w.ITM_CD = t.ITM_CD
				AND	w.ITM_SUB1 = t.ITM_SUB1
				AND	w.ITM_SUB2 = t.ITM_SUB2
				AND	w.ITM_SUB3 = t.ITM_SUB3
				AND	(w.WG_CD = G_NULL_VAL OR w.WG_CD = t.WG_CD)
				),
			t.PURC_CALC_CTG_CD =
				(
				SELECT	MIN(w.CALC_CTG_CD)
				FROM	MGW_BOM_EX_PURC w
				WHERE	0=0
				AND	w.ITM_CD = t.ITM_CD
				AND	w.ITM_SUB1 = t.ITM_SUB1
				AND	w.ITM_SUB2 = t.ITM_SUB2
				AND	w.ITM_SUB3 = t.ITM_SUB3
				AND	w.WG_CD = t.WG_CD
				),
			t.PROC_CALC_CTG_CD =
				(
				SELECT	MIN(w.CALC_CTG_CD)
				FROM	MGW_BOM_EX_PROC w
				WHERE	0=0
				AND	w.ITM_CD = t.ITM_CD
				AND	w.ITM_SUB1 = t.ITM_SUB1
				AND	w.ITM_SUB2 = t.ITM_SUB2
				AND	w.ITM_SUB3 = t.ITM_SUB3
				AND	w.WG_CD = t.WG_CD
				),
			t.PROV_CALC_CTG_CD =
				(
				SELECT	MIN(w.CALC_CTG_CD)
				FROM	MGW_BOM_EX_PROV w
				WHERE	0=0
				AND	w.ITM_CD = t.ITM_CD
				AND	w.ITM_SUB1 = t.ITM_SUB1
				AND	w.ITM_SUB2 = t.ITM_SUB2
				AND	w.ITM_SUB3 = t.ITM_SUB3
				AND	w.WG_CD = t.WG_CD
				),
			t.SLS_CALC_CTG_CD =
				(
				SELECT	MIN(w.CALC_CTG_CD)
				FROM	MGW_BOM_EX_SLS w
				WHERE	0=0
				AND	w.ITM_CD = t.ITM_CD
				AND	w.ITM_SUB1 = t.ITM_SUB1
				AND	w.ITM_SUB2 = t.ITM_SUB2
				AND	w.ITM_SUB3 = t.ITM_SUB3
				AND	w.WG_CD = t.WG_CD
				),
			t.FIX_CALC_CTG_CD =
				(
				SELECT	MIN(w.CALC_CTG_CD)
				FROM	MGW_BOM_EX_FIX w
				WHERE	0=0
				AND	w.ITM_CD = t.ITM_CD
				AND	w.ITM_SUB1 = t.ITM_SUB1
				AND	w.ITM_SUB2 = t.ITM_SUB2
				AND	w.ITM_SUB3 = t.ITM_SUB3
				AND	w.WG_CD = t.WG_CD
				)
		WHERE	0=0
		;

		IF I_WG_CD = G_NULL_VAL THEN
			-- WG未指定の場合はWG違いのレコードを集約する
			INSERT INTO MGW_BOM_EX_ITM (
				ITM_CD, ITM_SUB1, ITM_SUB2, ITM_SUB3, WG_CD,
				CALC_CTG_CD, DTL_CALC_CTG_CD, PURC_CALC_CTG_CD, PROC_CALC_CTG_CD,
				PROV_CALC_CTG_CD, SLS_CALC_CTG_CD, FIX_CALC_CTG_CD, BOM_WG_CD
				)
			SELECT	t.ITM_CD, t.ITM_SUB1, t.ITM_SUB2, t.ITM_SUB3, G_NULL_VAL,
				MIN(t.CALC_CTG_CD), MIN(t.DTL_CALC_CTG_CD), MIN(t.PURC_CALC_CTG_CD), MIN(t.PROC_CALC_CTG_CD),
				MIN(t.PROV_CALC_CTG_CD), MIN(t.SLS_CALC_CTG_CD), MIN(t.FIX_CALC_CTG_CD), MIN(t.BOM_WG_CD)
			FROM	MGW_BOM_EX_ITM t
			WHERE	0=0
			GROUP BY	t.ITM_CD, t.ITM_SUB1, t.ITM_SUB2, t.ITM_SUB3
			;

			INSERT INTO MGW_BOM_EX_DTL (
				ITM_CD, ITM_SUB1, ITM_SUB2, ITM_SUB3, BOM_PTN, WG_CD, RQST_WG_CD,
				CALC_CTG_CD, BOM_CALC_CTG_CD
				)
			SELECT	t.ITM_CD, t.ITM_SUB1, t.ITM_SUB2, t.ITM_SUB3, t.BOM_PTN, G_NULL_VAL, G_NULL_VAL,
				MIN(t.CALC_CTG_CD), MIN(t.BOM_CALC_CTG_CD)
			FROM	MGW_BOM_EX_DTL t
			WHERE	0=0
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_DTL w
					WHERE	0=0
					AND	w.ITM_CD = t.ITM_CD
					AND	w.ITM_SUB1 = t.ITM_SUB1
					AND	w.ITM_SUB2 = t.ITM_SUB2
					AND	w.ITM_SUB3 = t.ITM_SUB3
					AND	w.BOM_PTN = t.BOM_PTN
					AND	w.WG_CD = G_NULL_VAL
					AND	w.RQST_WG_CD = G_NULL_VAL
				)
			GROUP BY	t.ITM_CD, t.ITM_SUB1, t.ITM_SUB2, t.ITM_SUB3, t.BOM_PTN
			;

			DELETE MGW_BOM_EX_ITM w WHERE w.WG_CD <> G_NULL_VAL ;
			DELETE MGW_BOM_EX_DTL w WHERE w.WG_CD <> G_NULL_VAL ;

		END IF ;

		DELETE MGW_BOM_EX_BOM w ;
		IF I_REV_FLG = '0' THEN
			DELETE	MGW_BOM_EX_DTL w
			WHERE	0=0
			AND	(
				I_BOM_PTN IS NOT NULL AND w.BOM_PTN <> I_BOM_PTN
				OR
				w.BOM_PTN IS NULL
				OR
				w.BOM_PTN = G_NULL_VAL
				)
			;

			FOR L7 IN CTG_LIST(MAC_CALC_CTG_TYP.BOM) LOOP
				INSERT INTO MGW_BOM_EX_BOM (
					PAR_ITM_CD,
					PAR_ITM_SUB1,
					PAR_ITM_SUB2,
					PAR_ITM_SUB3,
					BOM_PTN,
					OPER_CD, OPER_SEQ,
					CHD_ITM_CD,
					CHD_ITM_SUB1,
					CHD_ITM_SUB2,
					CHD_ITM_SUB3,
					ALT_GRP_CD, EXPNS_CD,
					DISP_SEQ,
					PAR_RQMT_QTY,
					CHD_RQMT_QTY,  CHD_BASE_QTY, FXD_CHD_RQMT_QTY,
					CHD_MIN_QTY,
					CHD_BATCH_QTY,
					ALT_ITM_RATIO,
					WG_CD,
					CALC_CTG_CD
					)
				SELECT	m.PAR_ITM_CD,
					m.PAR_ITM_SUB1,
					m.PAR_ITM_SUB2,
					m.PAR_ITM_SUB3,
					m.BOM_PTN,
					m.OPER_CD, m.OPER_SEQ,
					m.CHD_ITM_CD,
					m.CHD_ITM_SUB1,
					m.CHD_ITM_SUB2,
					m.CHD_ITM_SUB3,
					m.ALT_GRP_CD, m.EXPNS_CD,
					m.DISP_SEQ,
					m.PAR_RQMT_QTY,
					m.CHD_RQMT_QTY,  m.CHD_BASE_QTY, m.FXD_CHD_RQMT_QTY,
					m.CHD_MIN_QTY,
					m.CHD_BATCH_QTY,
					m.ALT_ITM_RATIO,
					m.WG_CD,
					m.CALC_CTG_CD
				FROM	MGT_BOM m
				WHERE	0=0
				AND	m.TERM = I_TERM
				AND	m.CALC_CTG_CD = L7.CALC_CTG_CD
				AND	m.NON_CALC_FLG = '0'
				AND	m.WG_CD <> G_NULL_VAL
				AND	NOT EXISTS (
						SELECT	'X'
						FROM	MGW_BOM_EX_BOM w
						WHERE	0=0
						AND	w.PAR_ITM_CD = m.PAR_ITM_CD
						AND	w.PAR_ITM_SUB1 = m.PAR_ITM_SUB1
						AND	w.PAR_ITM_SUB2 = m.PAR_ITM_SUB2
						AND	w.PAR_ITM_SUB3 = m.PAR_ITM_SUB3
						AND	w.BOM_PTN = m.BOM_PTN
						AND	w.WG_CD = m.WG_CD
					)
				AND	EXISTS (
						SELECT	'X'
						FROM	MGW_BOM_EX_DTL t
						WHERE	0=0
						AND	t.ITM_CD = m.PAR_ITM_CD
						AND	t.ITM_SUB1 = m.PAR_ITM_SUB1
						AND	t.ITM_SUB2 = m.PAR_ITM_SUB2
						AND	t.ITM_SUB3 = m.PAR_ITM_SUB3
						AND	t.BOM_PTN = m.BOM_PTN
						AND	t.WG_CD = m.WG_CD
					)
				;

				INSERT INTO MGW_BOM_EX_BOM (
					PAR_ITM_CD,
					PAR_ITM_SUB1,
					PAR_ITM_SUB2,
					PAR_ITM_SUB3,
					BOM_PTN,
					OPER_CD, OPER_SEQ,
					CHD_ITM_CD,
					CHD_ITM_SUB1,
					CHD_ITM_SUB2,
					CHD_ITM_SUB3,
					ALT_GRP_CD, EXPNS_CD,
					DISP_SEQ,
					PAR_RQMT_QTY,
					CHD_RQMT_QTY,  CHD_BASE_QTY, FXD_CHD_RQMT_QTY,
					CHD_MIN_QTY,
					CHD_BATCH_QTY,
					ALT_ITM_RATIO,
					WG_CD,
					CALC_CTG_CD
					)
				SELECT DISTINCT
					m.PAR_ITM_CD,
					m.PAR_ITM_SUB1,
					m.PAR_ITM_SUB2,
					m.PAR_ITM_SUB3,
					m.BOM_PTN,
					m.OPER_CD, m.OPER_SEQ,
					m.CHD_ITM_CD,
					m.CHD_ITM_SUB1,
					m.CHD_ITM_SUB2,
					m.CHD_ITM_SUB3,
					m.ALT_GRP_CD, m.EXPNS_CD,
					m.DISP_SEQ,
					m.PAR_RQMT_QTY,
					m.CHD_RQMT_QTY,  m.CHD_BASE_QTY, m.FXD_CHD_RQMT_QTY,
					m.CHD_MIN_QTY,
					m.CHD_BATCH_QTY,
					m.ALT_ITM_RATIO,
					t.WG_CD,
					m.CALC_CTG_CD
				FROM	MGT_BOM m, MGW_BOM_EX_DTL t
				WHERE	0=0
				AND	m.TERM = I_TERM
				AND	m.WG_CD = G_NULL_VAL
				AND	m.CALC_CTG_CD = L7.CALC_CTG_CD
				AND	m.NON_CALC_FLG = '0'
				AND	m.PAR_ITM_CD = t.ITM_CD
				AND	m.PAR_ITM_SUB1 = t.ITM_SUB1
				AND	m.PAR_ITM_SUB2 = t.ITM_SUB2
				AND	m.PAR_ITM_SUB3 = t.ITM_SUB3
				AND	m.BOM_PTN = t.BOM_PTN
				AND	NOT EXISTS (
						SELECT	'X'
						FROM	MGW_BOM_EX_BOM w
						WHERE	0=0
						AND	w.PAR_ITM_CD = m.PAR_ITM_CD
						AND	w.PAR_ITM_SUB1 = m.PAR_ITM_SUB1
						AND	w.PAR_ITM_SUB2 = m.PAR_ITM_SUB2
						AND	w.PAR_ITM_SUB3 = m.PAR_ITM_SUB3
						AND	w.BOM_PTN = m.BOM_PTN
						AND	w.WG_CD = t.WG_CD
					)
				;
			END LOOP ;

			UPDATE	MGW_BOM_EX_DTL w
			SET	w.BOM_CALC_CTG_CD = (
					SELECT	MIN(t.CALC_CTG_CD)
					FROM	MGW_BOM_EX_BOM t
					WHERE	0=0
					AND	t.PAR_ITM_CD = w.ITM_CD
					AND	t.PAR_ITM_SUB1 = w.ITM_SUB1
					AND	t.PAR_ITM_SUB2 = w.ITM_SUB2
					AND	t.PAR_ITM_SUB3 = w.ITM_SUB3
					AND	t.BOM_PTN = w.BOM_PTN
					AND	(t.WG_CD = w.WG_CD OR I_WG_CD = G_NULL_VAL)
					)
			WHERE	0=0
			;

		ELSE
			FOR L7 IN CTG_LIST(MAC_CALC_CTG_TYP.BOM) LOOP
				INSERT INTO MGW_BOM_EX_BOM (
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
					DISP_SEQ,
					PAR_RQMT_QTY,
					CHD_RQMT_QTY,
					CHD_BASE_QTY,
					FXD_CHD_RQMT_QTY,
					CHD_MIN_QTY,
					CHD_BATCH_QTY,
					ALT_ITM_RATIO,
					WG_CD,
					CALC_CTG_CD
					)
				SELECT	m.PAR_ITM_CD,
					m.PAR_ITM_SUB1,
					m.PAR_ITM_SUB2,
					m.PAR_ITM_SUB3,
					m.BOM_PTN,
					m.OPER_CD,
					m.OPER_SEQ,
					m.CHD_ITM_CD,
					m.CHD_ITM_SUB1,
					m.CHD_ITM_SUB2,
					m.CHD_ITM_SUB3,
					m.ALT_GRP_CD,
					m.EXPNS_CD,
					m.DISP_SEQ,
					m.PAR_RQMT_QTY,
					m.CHD_RQMT_QTY,
					m.CHD_BASE_QTY,
					m.FXD_CHD_RQMT_QTY,
					m.CHD_MIN_QTY,
					m.CHD_BATCH_QTY,
					m.ALT_ITM_RATIO,
					m.WG_CD,
					m.CALC_CTG_CD
				FROM	MGT_BOM m
				WHERE	0=0
				AND	m.TERM = I_TERM
				AND	m.CALC_CTG_CD = L7.CALC_CTG_CD
				AND	m.NON_CALC_FLG = '0'
				AND	m.WG_CD <> G_NULL_VAL
				AND	(I_BOM_PTN IS NULL OR m.BOM_PTN = I_BOM_PTN)
				AND	NOT EXISTS (
						SELECT	'X'
						FROM	MGW_BOM_EX_BOM w
						WHERE	0=0
						AND	w.PAR_ITM_CD = m.PAR_ITM_CD
						AND	w.PAR_ITM_SUB1 = m.PAR_ITM_SUB1
						AND	w.PAR_ITM_SUB2 = m.PAR_ITM_SUB2
						AND	w.PAR_ITM_SUB3 = m.PAR_ITM_SUB3
						AND	w.BOM_PTN = m.BOM_PTN
						AND	w.WG_CD = m.WG_CD
					)
				AND	EXISTS (
						SELECT	'X'
						FROM	MGW_BOM_EX_ITM t
						WHERE	0=0
						AND	t.ITM_CD = m.CHD_ITM_CD
						AND	t.ITM_SUB1 = m.CHD_ITM_SUB1
						AND	t.ITM_SUB2 = m.CHD_ITM_SUB2
						AND	t.ITM_SUB3 = m.CHD_ITM_SUB3
					)
				AND	EXISTS (
						SELECT	'X'
						FROM	MGW_BOM_EX_TMP w1,
							MGW_BOM_EX_DTL w2
						WHERE	0=0
						AND	w1.ITM_CD = w2.ITM_CD
						AND	w1.ITM_SUB1 = w2.ITM_SUB1
						AND	w1.ITM_SUB2 = w2.ITM_SUB2
						AND	w1.ITM_SUB3 = w2.ITM_SUB3
						AND	w1.WG_CD = w2.WG_CD
						AND	w2.RQST_WG_CD = m.WG_CD
						AND	w2.ITM_CD = m.CHD_ITM_CD
						AND	w2.ITM_SUB1 = m.CHD_ITM_SUB1
						AND	w2.ITM_SUB2 = m.CHD_ITM_SUB2
						AND	w2.ITM_SUB3 = m.CHD_ITM_SUB3
					)
				;

				INSERT INTO MGW_BOM_EX_BOM (
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
					DISP_SEQ,
					PAR_RQMT_QTY,
					CHD_RQMT_QTY,
					CHD_BASE_QTY,
					FXD_CHD_RQMT_QTY,
					CHD_MIN_QTY,
					CHD_BATCH_QTY,
					ALT_ITM_RATIO,
					WG_CD,
					CALC_CTG_CD
					)
				SELECT	m.PAR_ITM_CD,
					m.PAR_ITM_SUB1,
					m.PAR_ITM_SUB2,
					m.PAR_ITM_SUB3,
					m.BOM_PTN,
					m.OPER_CD,
					m.OPER_SEQ,
					m.CHD_ITM_CD,
					m.CHD_ITM_SUB1,
					m.CHD_ITM_SUB2,
					m.CHD_ITM_SUB3,
					m.ALT_GRP_CD,
					m.EXPNS_CD,
					m.DISP_SEQ,
					m.PAR_RQMT_QTY,
					m.CHD_RQMT_QTY,
					m.CHD_BASE_QTY,
					m.FXD_CHD_RQMT_QTY,
					m.CHD_MIN_QTY,
					m.CHD_BATCH_QTY,
					m.ALT_ITM_RATIO,
					t.WG_CD,
					m.CALC_CTG_CD
				FROM	MGT_BOM m, MGW_BOM_EX_TMP t
				WHERE	0=0
				AND	m.TERM = I_TERM
				AND	m.WG_CD = G_NULL_VAL
				AND	m.CALC_CTG_CD = L7.CALC_CTG_CD
				AND	m.NON_CALC_FLG = '0'
				AND	m.CHD_ITM_CD = t.ITM_CD
				AND	m.CHD_ITM_SUB1 = t.ITM_SUB1
				AND	m.CHD_ITM_SUB2 = t.ITM_SUB2
				AND	m.CHD_ITM_SUB3 = t.ITM_SUB3
				AND	(I_BOM_PTN IS NULL OR m.BOM_PTN = I_BOM_PTN)
				AND	NOT EXISTS (
						SELECT	'X'
						FROM	MGW_BOM_EX_BOM w
						WHERE	0=0
						AND	w.PAR_ITM_CD = m.PAR_ITM_CD
						AND	w.PAR_ITM_SUB1 = m.PAR_ITM_SUB1
						AND	w.PAR_ITM_SUB2 = m.PAR_ITM_SUB2
						AND	w.PAR_ITM_SUB3 = m.PAR_ITM_SUB3
						AND	w.BOM_PTN = m.BOM_PTN
						AND	w.WG_CD = t.WG_CD
					)
				;
			END LOOP ;
		END IF ;

	END P_SET_TGT_DATA ;

	PROCEDURE P_BOM_EX1 (
		I_CALC_GRP_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BOM_PTN	IN MAPA_META.BOM_PTN%TYPE,
		I_BOM_PTN_FLG	IN MAPA_META.FLG%TYPE,
		I_MAX_HRRCHY	IN MAPA_META.BOM_LVL%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		原価ＢＯＭマスタを正展開する際に必要なデータを
		原価ＢＯＭ展開ワークに作成する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BOM_PTN
			構成パタン
	<IN>	I_BOM_PTN_FLG
			構成パタン引継ぎＦＬＧ
	<IN>	I_MAX_HRRCHY
			最大階層
	<HISTORY>
	**********************************************************/
	IS
		L_SEQ		INTEGER ;
		L_LVL		MAPA_META.BOM_LVL%TYPE ;
		L_STOP_FLG	MAPA_META.FLG%TYPE ;
		L_WG_CD 	MAPA_META.WG_CD%TYPE ;
	BEGIN

		IF I_WG_CD IS NULL THEN
			L_WG_CD := G_NULL_VAL ;
		ELSE
			L_WG_CD := I_WG_CD ;
		END IF ;

		DELETE MGW_BOM_EX_TMP ;
		INSERT INTO MGW_BOM_EX_TMP (
			BOM_LVL, SORT_NO,
			WG_CD,
			ITM_CD,
			ITM_SUB1,
			ITM_SUB2,
			ITM_SUB3
			)
		VALUES	(
			0, 0,
			L_WG_CD,
			I_ITM_CD,
			I_ITM_SUB1,
			I_ITM_SUB2,
			I_ITM_SUB3
			)
		;

		MGPA_CALC_CTG.P_SET_WORK_ALL(I_CALC_GRP_CD) ;

		P_SET_TGT_DATA(I_CALC_GRP_CD, L_WG_CD, I_TERM, I_BOM_PTN, '0') ;

		L_SEQ := 0 ;
		L_LVL := 0 ;
		L_STOP_FLG := '0' ;
		DELETE MGW_BOM_EX ;
		INSERT INTO MGW_BOM_EX (
			BOM_LVL, SORT_NO, WG_CD,
			ITM_CD, ITM_SUB1, ITM_SUB2, ITM_SUB3, BOM_PTN, CALC_CTG_CD,
			ITM_CALC_CTG_CD, DTL_CALC_CTG_CD, PURC_CALC_CTG_CD, PROC_CALC_CTG_CD,
			PROV_CALC_CTG_CD, SLS_CALC_CTG_CD, FIX_CALC_CTG_CD,
			BOTTOM_FLG
			)
		SELECT	L_LVL, LPAD(TO_CHAR(L_SEQ), G_SEQ_DIGIT, '0'), m1.WG_CD,
			m1.ITM_CD, m1.ITM_SUB1, m1.ITM_SUB2, m1.ITM_SUB3, m2.BOM_PTN, m2.BOM_CALC_CTG_CD,
			m1.CALC_CTG_CD, m1.DTL_CALC_CTG_CD, m1.PURC_CALC_CTG_CD, m1.PROC_CALC_CTG_CD,
			m1.PROV_CALC_CTG_CD, m1.SLS_CALC_CTG_CD, m1.FIX_CALC_CTG_CD,
			'1'
		FROM	MGW_BOM_EX_ITM m1, MGW_BOM_EX_DTL m2
		WHERE	0=0
		AND	m1.ITM_CD = m2.ITM_CD
		AND	m1.ITM_SUB1 = m2.ITM_SUB1
		AND	m1.ITM_SUB2 = m2.ITM_SUB2
		AND	m1.ITM_SUB3 = m2.ITM_SUB3
		AND	m1.DTL_CALC_CTG_CD = m2.CALC_CTG_CD
		AND	m2.BOM_PTN = I_BOM_PTN
		AND	(L_WG_CD = G_NULL_VAL OR m1.WG_CD = L_WG_CD AND m2.WG_CD = L_WG_CD)
		;

		LOOP
			L_LVL := L_LVL + 1 ;
			IF I_MAX_HRRCHY IS NOT NULL AND I_MAX_HRRCHY < L_LVL THEN
				L_STOP_FLG := '1' ;
				EXIT ;
			END IF ;

			DELETE MGW_BOM_EX_TMP ;
			INSERT INTO MGW_BOM_EX_TMP (
				BOM_LVL, SORT_NO,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				BOM_PTN,
				OPER_CD,
				OPER_SEQ,
				ALT_GRP_CD, EXPNS_CD,
				DISP_SEQ,
				PAR_RQMT_QTY,
				CHD_RQMT_QTY, CHD_BASE_QTY, FXD_CHD_RQMT_QTY,
				CHD_MIN_QTY, CHD_BATCH_QTY,
				ALT_ITM_RATIO,
				CALC_CTG_CD,
				PAR_ITM_CD,
				PAR_ITM_SUB1,
				PAR_ITM_SUB2,
				PAR_ITM_SUB3,
				PAR_SORT_NO,
				WG_CD,
				BOM_WG_CD
				)
			SELECT	L_LVL, ROWNUM,
				t3.CHD_ITM_CD,
				t3.CHD_ITM_SUB1,
				t3.CHD_ITM_SUB2,
				t3.CHD_ITM_SUB3,
				t3.BOM_PTN,
				t3.OPER_CD,
				t3.OPER_SEQ,
				t3.ALT_GRP_CD, t3.EXPNS_CD,
				t3.DISP_SEQ,
				t3.PAR_RQMT_QTY,
				t3.CHD_RQMT_QTY, t3.CHD_BASE_QTY, t3.FXD_CHD_RQMT_QTY,
				t3.CHD_MIN_QTY, t3.CHD_BATCH_QTY,
				t3.ALT_ITM_RATIO,
				t3.CALC_CTG_CD,
				t3.PAR_ITM_CD,
				t3.PAR_ITM_SUB1,
				t3.PAR_ITM_SUB2,
				t3.PAR_ITM_SUB3,
				t1.SORT_NO,
				t3.WG_CD,
				t3.WG_CD
			FROM	MGW_BOM_EX t1,
				MGW_BOM_EX_DTL t2,
				MGW_BOM_EX_BOM t3
			WHERE	0=0
			AND	t1.BOM_LVL = L_LVL - 1
			AND	t1.LOOP_FLG = '0'
			AND	t1.ITM_CD = t2.ITM_CD
			AND	t1.ITM_SUB1 = t2.ITM_SUB1
			AND	t1.ITM_SUB2 = t2.ITM_SUB2
			AND	t1.ITM_SUB3 = t2.ITM_SUB3
			AND	t1.BOM_PTN = t2.BOM_PTN
			AND	(t1.WG_CD = t2.RQST_WG_CD OR L_WG_CD = G_NULL_VAL)
			AND	t2.ITM_CD = t3.PAR_ITM_CD
			AND	t2.ITM_SUB1 = t3.PAR_ITM_SUB1
			AND	t2.ITM_SUB2 = t3.PAR_ITM_SUB2
			AND	t2.ITM_SUB3 = t3.PAR_ITM_SUB3
			AND	t2.BOM_PTN = t3.BOM_PTN
			AND	t2.WG_CD = t3.WG_CD
			;

			IF I_BOM_PTN_FLG = '0' THEN
				P_SET_TGT_DATA(I_CALC_GRP_CD, L_WG_CD, I_TERM, NULL, '0') ;
			ELSE
				P_SET_TGT_DATA(I_CALC_GRP_CD, L_WG_CD, I_TERM, I_BOM_PTN, '0') ;
			END IF ;

			L_SEQ := 0 ;
			i := 0 ;
			G_BOM.DELETE ;
			FOR x IN (
				SELECT	t1.BOM_LVL,
					t1.PAR_SORT_NO	SORT_NO,
					t1.ITM_CD,
					t1.ITM_SUB1,
					t1.ITM_SUB2,
					t1.ITM_SUB3,
					m2.BOM_PTN,
					t1.OPER_CD,
					t1.OPER_SEQ,
					t1.ALT_GRP_CD,
					t1.EXPNS_CD,
					t1.DISP_SEQ,
					t1.PAR_RQMT_QTY,
					t1.CHD_RQMT_QTY,
					t1.CHD_BASE_QTY,
					t1.FXD_CHD_RQMT_QTY,
					t1.CHD_MIN_QTY,
					t1.CHD_BATCH_QTY,
					t1.ALT_ITM_RATIO,
					m2.BOM_CALC_CTG_CD	CALC_CTG_CD,
					t1.PAR_ITM_CD,
					t1.PAR_ITM_SUB1,
					t1.PAR_ITM_SUB2,
					t1.PAR_ITM_SUB3,
					m1.CALC_CTG_CD	ITM_CALC_CTG_CD,
					m1.DTL_CALC_CTG_CD,
					m1.PURC_CALC_CTG_CD,
					m1.PROC_CALC_CTG_CD,
					m1.PROV_CALC_CTG_CD,
					m1.SLS_CALC_CTG_CD,
					m1.FIX_CALC_CTG_CD,
					NVL(m1.WG_CD, t1.WG_CD)	WG_CD
				FROM	MGW_BOM_EX_TMP t1,
					MGW_BOM_EX_ITM m1,
					MGW_BOM_EX_DTL m2
				WHERE	0=0
				AND	t1.ITM_CD = m1.ITM_CD(+)
				AND	t1.ITM_SUB1 = m1.ITM_SUB1(+)
				AND	t1.ITM_SUB2 = m1.ITM_SUB2(+)
				AND	t1.ITM_SUB3 = m1.ITM_SUB3(+)
				AND	t1.WG_CD = m1.WG_CD(+)
				AND	t1.ITM_CD = m2.ITM_CD(+)
				AND	t1.ITM_SUB1 = m2.ITM_SUB1(+)
				AND	t1.ITM_SUB2 = m2.ITM_SUB2(+)
				AND	t1.ITM_SUB3 = m2.ITM_SUB3(+)
				AND	t1.WG_CD = m2.RQST_WG_CD(+)
				ORDER BY t1.PAR_SORT_NO,
					t1.OPER_CD, t1.OPER_SEQ, t1.DISP_SEQ,
					t1.ALT_GRP_CD, t1.ITM_CD, t1.ITM_SUB1, t1.ITM_SUB2, t1.ITM_SUB3
				)
			LOOP
				L_SEQ := L_SEQ + 1 ;
				IF L_SEQ > G_MAX_ITM_NUM THEN
					EXIT ;
				END IF ;

				i := i + 1 ;
				G_BOM(i).BOM_LVL	:= x.BOM_LVL ;
				G_BOM(i).SORT_NO	:= RPAD(SUBSTR(x.SORT_NO, 1, L_LVL * G_MAX_ITM) || LPAD(TO_CHAR(L_SEQ), G_MAX_ITM, '0'),
								G_SEQ_DIGIT, '0') ;
				G_BOM(i).WG_CD		:= x.WG_CD ;
				G_BOM(i).ITM_CD		:= x.ITM_CD ;
				G_BOM(i).ITM_SUB1	:= x.ITM_SUB1 ;
				G_BOM(i).ITM_SUB2	:= x.ITM_SUB2 ;
				G_BOM(i).ITM_SUB3	:= x.ITM_SUB3 ;
				G_BOM(i).BOM_PTN	:= x.BOM_PTN ;
				G_BOM(i).OPER_CD	:= x.OPER_CD ;
				G_BOM(i).OPER_SEQ	:= x.OPER_SEQ ;
				G_BOM(i).ALT_GRP_CD	:= x.ALT_GRP_CD ;
				G_BOM(i).EXPNS_CD	:= x.EXPNS_CD ;
				G_BOM(i).DISP_SEQ	:= x.DISP_SEQ ;
				G_BOM(i).PAR_RQMT_QTY	:= x.PAR_RQMT_QTY ;
				G_BOM(i).CHD_RQMT_QTY	:= x.CHD_RQMT_QTY ;
				G_BOM(i).CHD_BASE_QTY	:= x.CHD_BASE_QTY ;
				G_BOM(i).FXD_CHD_RQMT_QTY := x.FXD_CHD_RQMT_QTY ;
				G_BOM(i).CHD_MIN_QTY	:= x.CHD_MIN_QTY ;
				G_BOM(i).CHD_BATCH_QTY	:= x.CHD_BATCH_QTY ;
				G_BOM(i).ALT_ITM_RATIO	:= x.ALT_ITM_RATIO ;
				G_BOM(i).CALC_CTG_CD	:= x.CALC_CTG_CD ;
				G_BOM(i).ITM_CALC_CTG_CD	:= x.ITM_CALC_CTG_CD ;
				G_BOM(i).DTL_CALC_CTG_CD	:= x.DTL_CALC_CTG_CD ;
				G_BOM(i).PURC_CALC_CTG_CD	:= x.PURC_CALC_CTG_CD ;
				G_BOM(i).PROC_CALC_CTG_CD	:= x.PROC_CALC_CTG_CD ;
				G_BOM(i).PROV_CALC_CTG_CD	:= x.PROV_CALC_CTG_CD ;
				G_BOM(i).SLS_CALC_CTG_CD	:= x.SLS_CALC_CTG_CD ;
				G_BOM(i).FIX_CALC_CTG_CD	:= x.FIX_CALC_CTG_CD ;
				G_BOM(i).BOTTOM_FLG	:= '1' ;
				G_BOM(i).PAR_SORT_NO	:= x.SORT_NO ;
				G_BOM(i).PAR_ITM_CD	:= x.PAR_ITM_CD ;
				G_BOM(i).PAR_ITM_SUB1	:= x.PAR_ITM_SUB1 ;
				G_BOM(i).PAR_ITM_SUB2	:= x.PAR_ITM_SUB2 ;
				G_BOM(i).PAR_ITM_SUB3	:= x.PAR_ITM_SUB3 ;
				G_BOM(i).LOOP_FLG	:= '0' ;

				IF i > G_MAX_CNT THEN
					P_INS_BOM_EX() ;
				END IF ;
			END LOOP ;

			IF L_LVL >= G_MAX_LVL OR L_SEQ = 0 THEN
				IF L_LVL >= G_MAX_LVL THEN
					L_STOP_FLG := '1' ;
				END IF ;

				EXIT ;
			END IF ;

			P_INS_BOM_EX() ;

			P_UPD_LOOP(L_LVL) ;

		END LOOP ;

		UPDATE	MGW_BOM_EX w
		SET	w.BOTTOM_FLG = '0'
		WHERE	0=0
		AND	(
			L_STOP_FLG = '1' AND w.BOM_LVL = I_MAX_HRRCHY
			OR
			EXISTS (
				SELECT	'X'
				FROM	MGW_BOM_EX x
				WHERE	0=0
				AND	x.PAR_SORT_NO = w.SORT_NO
				)
			)
		;

		<<PROC_END>>
			NULL ;

		G_BOM.DELETE ;

	END P_BOM_EX1 ;

	PROCEDURE P_BOM_EX2 (
		I_CALC_GRP_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BOM_PTN	IN MAPA_META.BOM_PTN%TYPE,
		I_BOM_PTN_FLG	IN MAPA_META.FLG%TYPE,
		I_MAX_HRRCHY	IN MAPA_META.BOM_LVL%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		原価ＢＯＭマスタを逆展開する際に必要なデータを
		原価ＢＯＭ展開ワークに作成する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BOM_PTN
			構成パタン
	<IN>	I_BOM_PTN_FLG
			構成パタン引継ぎＦＬＧ
	<IN>	I_MAX_HRRCHY
			最大階層
	<HISTORY>
	**********************************************************/
	IS
		L_SEQ		INTEGER ;
		L_LVL		MAPA_META.BOM_LVL%TYPE ;
		L_WG_CD 	MAPA_META.WG_CD%TYPE ;
		L_STOP_FLG	MAPA_META.FLG%TYPE ;
	BEGIN
		IF I_WG_CD IS NULL THEN
			L_WG_CD := G_NULL_VAL ;
		ELSE
			L_WG_CD := I_WG_CD ;
		END IF ;

		DELETE MGW_BOM_EX_TMP ;
		INSERT INTO MGW_BOM_EX_TMP (
			BOM_LVL, SORT_NO,
			WG_CD,
			ITM_CD,
			ITM_SUB1,
			ITM_SUB2,
			ITM_SUB3
			)
		VALUES	(
			0, 0,
			L_WG_CD,
			I_ITM_CD,
			I_ITM_SUB1,
			I_ITM_SUB2,
			I_ITM_SUB3
			)
		;

		MGPA_CALC_CTG.P_SET_WORK_ALL(I_CALC_GRP_CD) ;

		P_SET_TGT_DATA(I_CALC_GRP_CD, L_WG_CD, I_TERM, I_BOM_PTN, '1') ;

		L_SEQ := 0 ;
		L_LVL := 0 ;
		L_STOP_FLG := '0' ;
		DELETE MGW_BOM_EX ;
		INSERT INTO MGW_BOM_EX (
			BOM_LVL, SORT_NO, WG_CD,
			ITM_CD, ITM_SUB1, ITM_SUB2, ITM_SUB3,
			ITM_CALC_CTG_CD, DTL_CALC_CTG_CD, PURC_CALC_CTG_CD, PROC_CALC_CTG_CD,
			PROV_CALC_CTG_CD, SLS_CALC_CTG_CD, FIX_CALC_CTG_CD,
			BOM_WG_CD,
			BOTTOM_FLG
			)
		SELECT	L_LVL, LPAD(TO_CHAR(L_SEQ), G_SEQ_DIGIT, '0'), m1.WG_CD,
			m1.ITM_CD, m1.ITM_SUB1, m1.ITM_SUB2, m1.ITM_SUB3,
			m1.CALC_CTG_CD, m1.DTL_CALC_CTG_CD, m1.PURC_CALC_CTG_CD, m1.PROC_CALC_CTG_CD,
			m1.PROV_CALC_CTG_CD, m1.SLS_CALC_CTG_CD, m1.FIX_CALC_CTG_CD,
			L_WG_CD,
			'1'
		FROM	MGW_BOM_EX_ITM m1
		WHERE	0=0
		AND	(L_WG_CD = G_NULL_VAL OR m1.WG_CD = L_WG_CD)
		;

		LOOP
			L_LVL := L_LVL + 1 ;
			IF I_MAX_HRRCHY IS NOT NULL AND I_MAX_HRRCHY < L_LVL THEN
				L_STOP_FLG := '1' ;
				EXIT ;
			END IF ;

			DELETE MGW_BOM_EX_TMP ;
			INSERT INTO MGW_BOM_EX_TMP (
				BOM_LVL, SORT_NO,
				WG_CD,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3
			)
			SELECT
				0, 0,
				m.WG_CD,
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3
			FROM	MGT_ITM m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.NON_CALC_FLG = '0'
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_CALC_GRP_CTG w
					WHERE	0=0
					AND	w.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
					AND	w.CALC_CTG_CD = m.CALC_CTG_CD
				)
			AND	EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX w1,
						MGW_BOM_EX_BOM w2
					WHERE	0=0
					AND	w1.BOM_LVL = L_LVL - 1
					AND	w1.LOOP_FLG = '0'
					AND	w1.ITM_CD = w2.CHD_ITM_CD
					AND	w1.ITM_SUB1 = w2.CHD_ITM_SUB1
					AND	w1.ITM_SUB2 = w2.CHD_ITM_SUB2
					AND	w1.ITM_SUB3 = w2.CHD_ITM_SUB3
					AND	w2.WG_CD = m.WG_CD
					AND	w2.PAR_ITM_CD = m.ITM_CD
					AND	w2.PAR_ITM_SUB1 = m.ITM_SUB1
					AND	w2.PAR_ITM_SUB2 = m.ITM_SUB2
					AND	w2.PAR_ITM_SUB3 = m.ITM_SUB3
				)
			;

			DELETE MGW_BOM_EX_BOM_TMP1 ;
			INSERT INTO MGW_BOM_EX_BOM_TMP1 (
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
				DISP_SEQ,
				PAR_RQMT_QTY,
				CHD_RQMT_QTY,
				CHD_BASE_QTY,
				FXD_CHD_RQMT_QTY,
				CHD_MIN_QTY,
				CHD_BATCH_QTY,
				ALT_ITM_RATIO,
				WG_CD,
				BOM_WG_CD,
				CALC_CTG_CD
				)
			SELECT DISTINCT
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
				m1.EXPNS_CD,
				m1.DISP_SEQ,
				m1.PAR_RQMT_QTY,
				m1.CHD_RQMT_QTY,
				m1.CHD_BASE_QTY,
				m1.FXD_CHD_RQMT_QTY,
				m1.CHD_MIN_QTY,
				m1.CHD_BATCH_QTY,
				m1.ALT_ITM_RATIO,
				m1.WG_CD,
				m2.WG_CD,
				m1.CALC_CTG_CD
			FROM	MGW_BOM_EX_BOM m1, MGW_BOM_EX_DTL m2
			WHERE	0=0
			AND m1.CHD_ITM_CD = m2.ITM_CD
			AND m1.CHD_ITM_SUB1 = m2.ITM_SUB1
			AND m1.CHD_ITM_SUB2 = m2.ITM_SUB2
			AND m1.CHD_ITM_SUB3 = m2.ITM_SUB3
			AND m1.WG_CD = m2.RQST_WG_CD
			AND (m2.BOM_PTN <> G_NULL_VAL OR m2.WG_CD = m2.RQST_WG_CD)
			;

			IF I_BOM_PTN_FLG = '0' THEN
				P_SET_TGT_DATA(I_CALC_GRP_CD, L_WG_CD, I_TERM, NULL, '1') ;
			ELSE
				P_SET_TGT_DATA(I_CALC_GRP_CD, L_WG_CD, I_TERM, I_BOM_PTN, '1') ;
			END IF ;

			L_SEQ := 0 ;
			i := 0 ;
			G_BOM.DELETE ;
			FOR x IN (
				SELECT	L_LVL		LVL,
					t1.SORT_NO,
					t1.ITM_CD	PAR_ITM_CD,
					t1.ITM_SUB1	PAR_ITM_SUB1,
					t1.ITM_SUB2	PAR_ITM_SUB2,
					t1.ITM_SUB3	PAR_ITM_SUB3,
					m2.ITM_CD,
					m2.ITM_SUB1,
					m2.ITM_SUB2,
					m2.ITM_SUB3,
					m1.BOM_PTN,
					m1.OPER_CD,
					m1.OPER_SEQ,
					m1.ALT_GRP_CD,
					m1.EXPNS_CD,
					m1.DISP_SEQ,
					m1.PAR_RQMT_QTY,
					m1.CHD_RQMT_QTY,
					m1.CHD_BASE_QTY,
					m1.FXD_CHD_RQMT_QTY,
					m1.CHD_MIN_QTY,
					m1.CHD_BATCH_QTY,
					m1.ALT_ITM_RATIO,
					m1.CALC_CTG_CD,
					m2.CALC_CTG_CD	ITM_CALC_CTG_CD,
					m2.DTL_CALC_CTG_CD,
					m2.PURC_CALC_CTG_CD,
					m2.PROC_CALC_CTG_CD,
					m2.PROV_CALC_CTG_CD,
					m2.SLS_CALC_CTG_CD,
					m2.FIX_CALC_CTG_CD,
					m2.WG_CD
				FROM	MGW_BOM_EX t1,
					MGW_BOM_EX_BOM_TMP1 m1,
					MGW_BOM_EX_ITM m2
				WHERE	0=0
				AND	t1.BOM_LVL = L_LVL - 1
				AND	t1.LOOP_FLG = '0'
				AND t1.ITM_CD = m1.CHD_ITM_CD
				AND	t1.ITM_SUB1 = m1.CHD_ITM_SUB1
				AND	t1.ITM_SUB2 = m1.CHD_ITM_SUB2
				AND	t1.ITM_SUB3 = m1.CHD_ITM_SUB3
				AND	t1.WG_CD = m1.BOM_WG_CD
				AND	m1.PAR_ITM_CD = m2.ITM_CD
				AND	m1.PAR_ITM_SUB1 = m2.ITM_SUB1
				AND	m1.PAR_ITM_SUB2 = m2.ITM_SUB2
				AND	m1.PAR_ITM_SUB3 = m2.ITM_SUB3
				AND	m1.WG_CD = m2.WG_CD
				ORDER BY t1.SORT_NO, m1.BOM_PTN, m1.OPER_CD, m1.OPER_SEQ,
					m1.ALT_GRP_CD, m2.ITM_CD, m2.ITM_SUB1, m2.ITM_SUB2, m2.ITM_SUB3, m1.DISP_SEQ
				)
			LOOP
				L_SEQ := L_SEQ + 1 ;
				IF L_SEQ > G_MAX_ITM_NUM THEN
					EXIT ;
				END IF ;

				i := i + 1 ;
				G_BOM(i).BOM_LVL	:= x.LVL ;
				G_BOM(i).SORT_NO	:= RPAD(SUBSTR(x.SORT_NO, 1, L_LVL * G_MAX_ITM) || LPAD(TO_CHAR(L_SEQ), G_MAX_ITM, '0'),
								G_SEQ_DIGIT, '0') ;
				G_BOM(i).WG_CD		:= x.WG_CD ;
				G_BOM(i).ITM_CD		:= x.ITM_CD ;
				G_BOM(i).ITM_SUB1	:= x.ITM_SUB1 ;
				G_BOM(i).ITM_SUB2	:= x.ITM_SUB2 ;
				G_BOM(i).ITM_SUB3	:= x.ITM_SUB3 ;
				G_BOM(i).BOM_PTN	:= x.BOM_PTN ;
				G_BOM(i).OPER_CD	:= x.OPER_CD ;
				G_BOM(i).OPER_SEQ	:= x.OPER_SEQ ;
				G_BOM(i).ALT_GRP_CD	:= x.ALT_GRP_CD ;
				G_BOM(i).EXPNS_CD	:= x.EXPNS_CD ;
				G_BOM(i).DISP_SEQ	:= x.DISP_SEQ ;
				G_BOM(i).PAR_RQMT_QTY	:= x.PAR_RQMT_QTY ;
				G_BOM(i).CHD_RQMT_QTY	:= x.CHD_RQMT_QTY ;
				G_BOM(i).CHD_BASE_QTY	:= x.CHD_BASE_QTY ;
				G_BOM(i).FXD_CHD_RQMT_QTY := x.FXD_CHD_RQMT_QTY ;
				G_BOM(i).CHD_MIN_QTY	:= x.CHD_MIN_QTY ;
				G_BOM(i).CHD_BATCH_QTY	:= x.CHD_BATCH_QTY ;
				G_BOM(i).ALT_ITM_RATIO	:= x.ALT_ITM_RATIO ;
				G_BOM(i).CALC_CTG_CD	:= x.CALC_CTG_CD ;
				G_BOM(i).ITM_CALC_CTG_CD	:= x.ITM_CALC_CTG_CD ;
				G_BOM(i).DTL_CALC_CTG_CD	:= x.DTL_CALC_CTG_CD ;
				G_BOM(i).PURC_CALC_CTG_CD	:= x.PURC_CALC_CTG_CD ;
				G_BOM(i).PROC_CALC_CTG_CD	:= x.PROC_CALC_CTG_CD ;
				G_BOM(i).PROV_CALC_CTG_CD	:= x.PROV_CALC_CTG_CD ;
				G_BOM(i).SLS_CALC_CTG_CD	:= x.SLS_CALC_CTG_CD ;
				G_BOM(i).FIX_CALC_CTG_CD	:= x.FIX_CALC_CTG_CD ;
				G_BOM(i).BOTTOM_FLG	:= '1' ;
				G_BOM(i).PAR_SORT_NO	:= x.SORT_NO ;
				G_BOM(i).PAR_ITM_CD	:= x.PAR_ITM_CD ;
				G_BOM(i).PAR_ITM_SUB1	:= x.PAR_ITM_SUB1 ;
				G_BOM(i).PAR_ITM_SUB2	:= x.PAR_ITM_SUB2 ;
				G_BOM(i).PAR_ITM_SUB3	:= x.PAR_ITM_SUB3 ;
				G_BOM(i).LOOP_FLG	:= '0' ;

				IF i > G_MAX_CNT THEN
					P_INS_BOM_EX() ;
				END IF ;

			END LOOP ;

			IF L_LVL >= G_MAX_LVL OR L_SEQ = 0 THEN
				IF L_LVL >= G_MAX_LVL THEN
					L_STOP_FLG := '1' ;
				END IF ;

				EXIT ;
			END IF ;

			P_INS_BOM_EX() ;

			P_UPD_LOOP(L_LVL) ;
		END LOOP ;

		UPDATE	MGW_BOM_EX w
		SET	w.BOTTOM_FLG = '0'
		WHERE	0=0
		AND	(
			L_STOP_FLG = '1' AND w.BOM_LVL = I_MAX_HRRCHY
			OR
			EXISTS (
				SELECT	'X'
				FROM	MGW_BOM_EX x
				WHERE	0=0
				AND	x.PAR_SORT_NO = w.SORT_NO
				)
			)
		;

		<<PROC_END>>
			NULL ;

		G_BOM.DELETE ;

	END P_BOM_EX2 ;

	PROCEDURE P_SET_OPER_WK (
		I_CALC_GRP_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		入力データに対する原価品目工程マスタ・原価品目工数マスタ情報を
		ワークテーブルに作成する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		MGPA_CALC_CTG.P_SET_WORK_ALL(I_CALC_GRP_CD) ;

		DELETE MGW_BOM_EX_OPER w ;
		FOR L1 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_OPER) LOOP
			INSERT INTO MGW_BOM_EX_OPER (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_OPER m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = I_WG_CD
			AND	m.ITM_CD = I_ITM_CD
			AND	m.ITM_SUB1 = I_ITM_SUB1
			AND	m.ITM_SUB2 = I_ITM_SUB2
			AND	m.ITM_SUB3 = I_ITM_SUB3
			AND	m.CALC_CTG_CD = L1.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_OPER w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
				)
			;

			INSERT INTO MGW_BOM_EX_OPER (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_OPER m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = G_NULL_VAL
			AND	m.ITM_CD = I_ITM_CD
			AND	m.ITM_SUB1 = I_ITM_SUB1
			AND	m.ITM_SUB2 = I_ITM_SUB2
			AND	m.ITM_SUB3 = I_ITM_SUB3
			AND	m.CALC_CTG_CD = L1.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_OPER w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
				)
			;
		END LOOP ;

		DELETE MGW_BOM_EX_WK w ;
		FOR L2 IN CTG_LIST(MAC_CALC_CTG_TYP.ITM_WK) LOOP
			INSERT INTO MGW_BOM_EX_WK (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_WK m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = I_WG_CD
			AND	m.ITM_CD = I_ITM_CD
			AND	m.ITM_SUB1 = I_ITM_SUB1
			AND	m.ITM_SUB2 = I_ITM_SUB2
			AND	m.ITM_SUB3 = I_ITM_SUB3
			AND	m.CALC_CTG_CD = L2.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_WK w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
				)
			;

			INSERT INTO MGW_BOM_EX_WK (
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3,
				WG_CD,
				CALC_CTG_CD
				)
			SELECT	DISTINCT
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.WG_CD,
				m.CALC_CTG_CD
			FROM	MGT_ITM_WK m
			WHERE	0=0
			AND	m.TERM = I_TERM
			AND	m.WG_CD = G_NULL_VAL
			AND	m.ITM_CD = I_ITM_CD
			AND	m.ITM_SUB1 = I_ITM_SUB1
			AND	m.ITM_SUB2 = I_ITM_SUB2
			AND	m.ITM_SUB3 = I_ITM_SUB3
			AND	m.CALC_CTG_CD = L2.CALC_CTG_CD
			AND	m.NON_CALC_FLG = '0'
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGW_BOM_EX_WK w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
				)
			;
		END LOOP ;

	END P_SET_OPER_WK ;

END MGPA_BOM_EX ;
/
