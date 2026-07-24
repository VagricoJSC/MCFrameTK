CREATE OR REPLACE PACKAGE BODY MGPA_CARRY_OVER
IS
	G_MSG	FCPA_ERR.MSG_BINDER ;
	G_ARG	MGT_ARG%ROWTYPE ;
	G_YM	MAPA_META.YM%TYPE ;

	G_MAX_CNT	CONSTANT INTEGER := 20000 ; --バルクインサートでの最大レコード数
	G_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

PROCEDURE P_CHK_FIX_CALC_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	計算グループＣＤ・年月に対して確定されており、
	確定対象の原価計算ＮＯが入力値の原価計算ＮＯと異なるときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<IN>	I_CALC_NO
		原価計算ＮＯ
**************************************************************************/
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	AND	t.CALC_NO != I_CALC_NO
	;

	IF L_CNT > 0 THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0014', G_MSG) ;
	END IF ;

END P_CHK_FIX_CALC_NO ;

FUNCTION F_CHK_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	確定済みのときは１、未確定のときは０を返す
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	;

	IF L_CNT > 0 THEN
		RETURN '1' ;
	END IF ;

	RETURN '0' ;

END F_CHK_FIX ;

PROCEDURE P_CHK_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
AS
	L_FLG	MAPA_META.FLG%TYPE ;
BEGIN
	L_FLG := F_CHK_FIX(I_CALC_GRP_CD, I_YM) ;

	IF L_FLG = '1' THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0014', G_MSG) ;
	END IF ;

END P_CHK_FIX ;

PROCEDURE P_STK
/**************************************************************************
<SYNOPSIS>
	月初在庫データの作成
<REMARKS>

<ARGUMENTS>

<HISTORY>
**************************************************************************/
AS
	C_CALC_REC_END_STK	CONSTANT MGPA_META.CALC_REC_TYP%TYPE := MGC_CALC_REC_TYP.END_STK ;

	C_STK_SEQ_NM		CONSTANT MAPA_META.ORA_OBJ_NM%TYPE := MGC_NUM_SYS_TYP.ST_STK_KEY ;

	CURSOR LOCK_STK
	IS
		SELECT	t.ST_STK_KEY
		FROM	MGT_ST_STK t
		WHERE	0=0
		AND	t.CALC_GRP_CD = G_ARG.CALC_GRP_CD
		AND	t.YM = G_YM
		FOR UPDATE NOWAIT
	;

	TYPE LIST_STK IS TABLE OF MGT_ST_STK%ROWTYPE INDEX BY BINARY_INTEGER ;
	reci	LIST_STK ;
	i	INTEGER ;

	TYPE LIST_STK_EXPNS IS TABLE OF MGT_ST_STK_EXPNS%ROWTYPE INDEX BY BINARY_INTEGER ;
	recj	LIST_STK_EXPNS ;
	j	INTEGER ;

	L_ROW_ID	MAPA_META.ROW_ID%TYPE ;
/*************************************************************************/
PROCEDURE P_STK_INSERT
AS
BEGIN
	IF i > 0 THEN
		FORALL t IN 1..i
			INSERT INTO MGT_ST_STK VALUES reci(t) ;
		reci.DELETE ;
		i := 0 ;
	END IF ;

	IF j > 0 THEN
		FORALL t IN 1..j
			INSERT INTO MGT_ST_STK_EXPNS VALUES recj(t) ;
		recj.DELETE ;
		j := 0 ;
	END IF ;
END ;
/*************************************************************************/
BEGIN
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_CARRY_OVER.P_STK') ;

	OPEN LOCK_STK ;
	CLOSE LOCK_STK ;

	DELETE	MGT_ST_STK_EXPNS t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_ST_STK x
			WHERE	0=0
			AND	x.ST_STK_KEY = t.ST_STK_KEY
			AND	x.CALC_GRP_CD = G_ARG.CALC_GRP_CD
			AND	x.YM = G_YM
		)
	;

	DELETE	MGT_ST_STK_DIFF t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_ST_STK x
			WHERE	0=0
			AND	x.ST_STK_KEY = t.ST_STK_KEY
			AND	x.CALC_GRP_CD = G_ARG.CALC_GRP_CD
			AND	x.YM = G_YM
		)
	;

	DELETE	MGT_ST_STK t
	WHERE	0=0
	AND	t.CALC_GRP_CD = G_ARG.CALC_GRP_CD
	AND	t.YM = G_YM
	;

	i := 0 ;
	j := 0 ;
	FOR x IN (
		SELECT	t.TOP_REC_NO,
			t.WG_CD,
			t.MNG_DPT_CD,
			t.ITM_CD,
			t.ITM_SUB1,
			t.ITM_SUB2,
			t.ITM_SUB3,
			t.LOT_NO,
			t.SUBLOT_NO,
			t.SNO1,
			t.SNO2,
			t.SNO3,
			t.SNO4,
			t.BP_CD,
			t.ASST_TYP,
			t.REPURC_OBLI_FLG,
			t.QTY
		FROM	MGT_ACC_TOP t
		WHERE	0=0
		AND	t.CALC_NO = G_ARG.CALC_NO
		AND	t.CALC_GRP_CD = G_ARG.CALC_GRP_CD
		AND	t.YM = G_ARG.END_YM
		AND	t.CALC_REC_TYP = C_CALC_REC_END_STK
		)
	LOOP
		L_ROW_ID := MAPA_NUM.F_GET_SEQ(C_STK_SEQ_NM) ;

		i := i + 1 ;

		reci(i).ST_STK_KEY  := L_ROW_ID ;
		reci(i).CALC_GRP_CD := G_ARG.CALC_GRP_CD ;
		reci(i).WG_CD := x.WG_CD ;
		reci(i).YM	:= G_YM ;
		reci(i).MNG_DPT_CD := x.MNG_DPT_CD ;
		reci(i).ITM_CD	:= x.ITM_CD ;
		reci(i).ITM_SUB1	:= x.ITM_SUB1 ;
		reci(i).ITM_SUB2	:= x.ITM_SUB2 ;
		reci(i).ITM_SUB3	:= x.ITM_SUB3 ;
		reci(i).ITM_EXT	:= G_NULL_VAL ;
		reci(i).LOT_NO	:= x.LOT_NO ;
		reci(i).SUBLOT_NO	:= x.SUBLOT_NO ;
		reci(i).SNO1	:= x.SNO1 ;
		reci(i).SNO2	:= x.SNO2 ;
		reci(i).SNO3	:= x.SNO3 ;
		reci(i).SNO4	:= x.SNO4 ;
		reci(i).BP_CD	:= x.BP_CD ;
		reci(i).ASST_TYP := x.ASST_TYP ;
		reci(i).REPURC_OBLI_FLG := x.REPURC_OBLI_FLG ;
		reci(i).QTY	:= x.QTY ;
		reci(i).STD_FLG := '0' ;

		FOR y IN (
			SELECT	t.EXPNS_CD,
				SUM(t.AMT)	AMT
			FROM	(
				SELECT	t1.EXPNS_CD,
					t1.ACT_COST	AMT
				FROM	MGT_ACC_SML_COST t1
				WHERE	0=0
				AND	t1.CALC_NO = G_ARG.CALC_NO
				AND	t1.CALC_GRP_CD = G_ARG.CALC_GRP_CD
				AND	t1.TOP_REC_NO = x.TOP_REC_NO
				UNION ALL
				SELECT	m1.EXPNS_CD,
					(-1) * t2.AMT	AMT
				FROM	MGT_STK_LOSS t2, MAM_STK_EVAL m1
				WHERE	0=0
				AND	t2.CALC_NO = G_ARG.CALC_NO
				AND	t2.CALC_GRP_CD = G_ARG.CALC_GRP_CD
				AND	t2.WG_CD = x.WG_CD
				AND	t2.YM = G_ARG.END_YM
				AND	t2.MNG_DPT_CD = x.MNG_DPT_CD
				AND	t2.ITM_CD = x.ITM_CD
				AND	t2.ITM_SUB1 = x.ITM_SUB1
				AND	t2.ITM_SUB2 = x.ITM_SUB2
				AND	t2.ITM_SUB3 = x.ITM_SUB3
				AND	t2.LOT_NO = x.LOT_NO
				AND	t2.SUBLOT_NO = x.SUBLOT_NO
				AND	t2.SNO1 = x.SNO1
				AND	t2.SNO2 = x.SNO2
				AND	t2.SNO3 = x.SNO3
				AND	t2.SNO4 = x.SNO4
				AND	NVL(t2.SPPL_CD, G_NULL_VAL) = NVL(x.BP_CD, G_NULL_VAL)
				AND	t2.ASST_TYP = x.ASST_TYP
				AND	t2.STK_EVAL_CD = m1.STK_EVAL_CD
				AND	m1.CUT_FLG = '1'
				AND	m1.EXPNS_CD IS NOT NULL
				) t
			WHERE	0=0
			GROUP BY t.EXPNS_CD
			)
		LOOP
			IF y.AMT = 0 THEN
				GOTO NEXT_LOOP ;
			END IF ;

			j := j + 1 ;

			recj(j).ST_STK_KEY := L_ROW_ID ;
			recj(j).EXPNS_CD := y.EXPNS_CD ;
			recj(j).AMT := y.AMT ;

			<<NEXT_LOOP>>
				NULL ;
		END LOOP ;

		IF i + j > G_MAX_CNT THEN
			P_STK_INSERT() ;
		END IF ;
	END LOOP ;

	P_STK_INSERT() ;

	DELETE	MGT_ST_STK t
	WHERE	0=0
	AND	t.CALC_GRP_CD = G_ARG.CALC_GRP_CD
	AND	t.YM = G_YM
	AND	t.QTY = 0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	MGT_ST_STK_EXPNS w
			WHERE	0=0
			AND	w.ST_STK_KEY = t.ST_STK_KEY
		)
	;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_CARRY_OVER.P_STK') ;

END P_STK ;

PROCEDURE P_WIP
/**************************************************************************
<SYNOPSIS>
	月初仕掛データの作成
<REMARKS>

<ARGUMENTS>

<HISTORY>
**************************************************************************/
AS
	C_CALC_REC_END_WIP	CONSTANT MGPA_META.CALC_REC_TYP%TYPE := MGC_CALC_REC_TYP.END_WIP ;

	C_WIP_SEQ_NM		CONSTANT MAPA_META.ORA_OBJ_NM%TYPE := MGC_NUM_SYS_TYP.ST_WIP_KEY ;

	CURSOR LOCK_WIP
	IS
		SELECT	t.ST_WIP_KEY
		FROM	MGT_ST_WIP t
		WHERE	0=0
		AND	t.CALC_GRP_CD = G_ARG.CALC_GRP_CD
		AND	t.YM = G_YM
		FOR UPDATE NOWAIT
	;

	TYPE LIST_WIP IS TABLE OF MGT_ST_WIP%ROWTYPE INDEX BY BINARY_INTEGER ;
	reci	LIST_WIP ;
	i	INTEGER ;

	TYPE LIST_WIP_EXPNS IS TABLE OF MGT_ST_WIP_EXPNS%ROWTYPE INDEX BY BINARY_INTEGER ;
	recj	LIST_WIP_EXPNS ;
	j	INTEGER ;

	L_ROW_ID	MAPA_META.ROW_ID%TYPE ;
/*************************************************************************/
PROCEDURE P_WIP_INSERT
AS
BEGIN
	IF i > 0 THEN
		FORALL t IN 1..i
			INSERT INTO MGT_ST_WIP VALUES reci(t) ;
		reci.DELETE ;
		i := 0 ;
	END IF ;

	IF j > 0 THEN
		FORALL t IN 1..j
			INSERT INTO MGT_ST_WIP_EXPNS VALUES recj(t) ;
		recj.DELETE ;
		j := 0 ;
	END IF ;
END ;
/*************************************************************************/
BEGIN
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0001', 'MGPA_CARRY_OVER.P_WIP') ;

	OPEN LOCK_WIP ;
	CLOSE LOCK_WIP ;

	DELETE	MGT_ST_WIP_EXPNS t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_ST_WIP x
			WHERE	0=0
			AND	x.ST_WIP_KEY = t.ST_WIP_KEY
			AND	x.CALC_GRP_CD = G_ARG.CALC_GRP_CD
			AND	x.YM = G_YM
		)
	;

	DELETE	MGT_ST_WIP t
	WHERE	0=0
	AND	t.CALC_GRP_CD = G_ARG.CALC_GRP_CD
	AND	t.YM = G_YM
	;

	i := 0 ;
	j := 0 ;
	FOR x IN (
		SELECT	t.TOP_REC_NO,
			t.WG_CD,
			t.ITM_CD,
			t.ITM_SUB1,
			t.ITM_SUB2,
			t.ITM_SUB3,
			t.ITM_MFG_INST_NO,
			t.MFG_ACT_NO,
			NVL(t.OPER_ACT_NO, G_NULL_VAL)	OPER_ACT_NO,
			t.LOC_CD,
			t.STR_LN_CD,
			t.OPER_CD,
			t.OPER_SEQ,
			t.QTY,
			NVL(t.PER, 50) PER
		FROM	MGT_ACC_TOP t
		WHERE	0=0
		AND	t.CALC_NO = G_ARG.CALC_NO
		AND	t.CALC_GRP_CD = G_ARG.CALC_GRP_CD
		AND	t.YM = G_ARG.END_YM
		AND	t.CALC_REC_TYP = C_CALC_REC_END_WIP
		)
	LOOP
		L_ROW_ID := MAPA_NUM.F_GET_SEQ(C_WIP_SEQ_NM) ;

		i := i + 1 ;

		reci(i).ST_WIP_KEY	:= L_ROW_ID ;
		reci(i).CALC_GRP_CD	:= G_ARG.CALC_GRP_CD ;
		reci(i).WG_CD		:= x.WG_CD ;
		reci(i).YM		:= G_YM ;
		reci(i).ITM_CD		:= x.ITM_CD ;
		reci(i).ITM_SUB1		:= x.ITM_SUB1 ;
		reci(i).ITM_SUB2		:= x.ITM_SUB2 ;
		reci(i).ITM_SUB3		:= x.ITM_SUB3 ;
		reci(i).ITM_EXT		:= G_NULL_VAL ;
		reci(i).ITM_MFG_INST_NO := x.ITM_MFG_INST_NO ;
		reci(i).MFG_ACT_NO	:= x.MFG_ACT_NO ;
		reci(i).OPER_ACT_NO	:= x.OPER_ACT_NO ;
		reci(i).LOC_CD		:= x.LOC_CD ;
		reci(i).STR_LN_CD	:= x.STR_LN_CD ;
		reci(i).OPER_CD		:= x.OPER_CD ;
		reci(i).OPER_SEQ	:= x.OPER_SEQ ;
		reci(i).WIP_QTY		:= x.QTY ;
		reci(i).WIP_PER		:= x.PER ;

		FOR y IN (
			SELECT	w.EXPNS_CD,
				SUM(w.WIP_AMT)	WIP_AMT,
				SUM(w.INPT_AMT)	INPT_AMT
			FROM	(
				SELECT	t2.EXPNS_CD,
					SUM(t2.ACT_COST)	WIP_AMT,
					0			INPT_AMT
				FROM	MGT_ACC_INPT t1, MGT_ACC_COST t2
				WHERE	0=0
				AND	t1.CALC_NO = G_ARG.CALC_NO
				AND	t1.CALC_GRP_CD = G_ARG.CALC_GRP_CD
				AND	t1.TOP_REC_NO = x.TOP_REC_NO
				AND	t1.LVL = 0
				AND	t1.CALC_NO = t2.CALC_NO
				AND	t1.CALC_GRP_CD = t2.CALC_GRP_CD
				AND	t1.INPT_REC_NO = t2.SML_INPT_REC_NO
				GROUP BY t2.EXPNS_CD
				UNION ALL
				SELECT	t2.EXPNS_CD,
					0			WIP_AMT,
					SUM(t2.ACT_COST)	INPT_AMT
				FROM	MGT_ACC_INPT t1, MGT_ACC_COST t2
				WHERE	0=0
				AND	t1.CALC_NO = G_ARG.CALC_NO
				AND	t1.CALC_GRP_CD = G_ARG.CALC_GRP_CD
				AND	t1.TOP_REC_NO = x.TOP_REC_NO
				AND	t1.LVL = 1
				AND	t1.CALC_NO = t2.CALC_NO
				AND	t1.CALC_GRP_CD = t2.CALC_GRP_CD
				AND	t1.INPT_REC_NO = t2.SML_INPT_REC_NO
				GROUP BY t2.EXPNS_CD
				) w
			WHERE	0=0
			GROUP BY w.EXPNS_CD
			)
		LOOP
			IF y.WIP_AMT = 0 AND y.INPT_AMT = 0 THEN
				GOTO NEXT_LOOP ;
			END IF ;

			j := j + 1 ;

			recj(j).ST_WIP_KEY := L_ROW_ID ;
			recj(j).EXPNS_CD := y.EXPNS_CD ;
			recj(j).WIP_AMT	 := y.WIP_AMT ;
			recj(j).INPT_AMT := y.INPT_AMT ;

			<<NEXT_LOOP>>
				NULL ;
		END LOOP ;

		IF i + j > G_MAX_CNT THEN
			P_WIP_INSERT() ;
		END IF ;
	END LOOP ;

	P_WIP_INSERT() ;

	DELETE	MGT_ST_WIP t
	WHERE	0=0
	AND	t.CALC_GRP_CD = G_ARG.CALC_GRP_CD
	AND	t.YM = G_YM
	AND	t.WIP_QTY = 0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	MGT_ST_WIP_EXPNS w
			WHERE	0=0
			AND	w.ST_WIP_KEY = t.ST_WIP_KEY
		)
	;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_CARRY_OVER.P_WIP') ;
END P_WIP ;

PROCEDURE P_MAIN (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
	, I_PROC_NO	IN	NUMBER DEFAULT NULL
)
/**************************************************************************
<SYNOPSIS>
	繰越データの作成
<REMARKS>
	引数の原価計算情報に設定されている計算対象末尾月＋１の
	年月データを作成する
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
AS
	LOCK_ERROR	EXCEPTION ;
	PRAGMA EXCEPTION_INIT(LOCK_ERROR, -54) ;
BEGIN
	G_ARG := MGPA_ARG.F_GET_ARG(I_CALC_GRP_CD, I_CALC_NO) ;

	-- 繰越元の確定チェック
	P_CHK_FIX_CALC_NO(I_CALC_GRP_CD, G_ARG.END_YM, I_CALC_NO) ;

	G_YM := ADD_MONTHS(G_ARG.END_YM, 1) ;

	-- 繰越先の確定チェック
	P_CHK_FIX(I_CALC_GRP_CD, G_YM) ;

	IF I_PROC_NO IS NULL OR I_PROC_NO = 1 THEN
		P_STK() ;
	END IF ;
	IF I_PROC_NO IS NULL OR I_PROC_NO = 2 THEN
		P_WIP() ;
	END IF ;

EXCEPTION
WHEN LOCK_ERROR THEN
	G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(G_YM, FCPA_DATE_UTIL.Y4M)) ;
	FCPA_ERR.RAISE_APP_ERR('MGBXD0010', G_MSG) ;
END P_MAIN ;

END MGPA_CARRY_OVER ;
/
