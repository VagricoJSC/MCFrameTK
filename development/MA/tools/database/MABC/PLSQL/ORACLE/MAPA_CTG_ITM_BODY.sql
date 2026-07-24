CREATE OR REPLACE PACKAGE BODY MAPA_CTG_ITM
IS
	C_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

	TYPE LIST_CTG IS TABLE OF MAPA_META.FLG%TYPE INDEX BY MAPA_META.COST_CTG_CD%TYPE ;
	CTG_LOOP	LIST_CTG ;

	TYPE LIST_YM IS TABLE OF MAPA_META.YM%TYPE INDEX BY BINARY_INTEGER ;
	REC_YM	LIST_YM ;

	CURSOR CUR_TERM (
		I_YM_FROM IN MAPA_META.YM%TYPE,
		I_YM_TO IN MAPA_META.YM%TYPE
		)
	IS
		SELECT	m.TERM,
			m.TERM_END_YM
		FROM	MAM_TERM m
		WHERE	0=0
		AND	m.TERM >= MAPA_TERM.F_GET_TERM(I_YM_FROM)
		AND	m.TERM <= MAPA_TERM.F_GET_TERM(I_YM_TO)
		AND	m.DEL_FLG = '0'
		;

PROCEDURE P_SET_ITM_WORK (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE,
	I_PAR_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品目ＣＤをMAW_CTG_ITMに作成する
<REMARKS>
	対象となる期はMAW_TERMに作成しておく必要がある
<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_CD
		作成対象の品群ＣＤ
<IN>
	I_PAR_CTG_CD
		品目取得対象の品群ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	IF CTG_LOOP.EXISTS(I_PAR_CTG_CD) THEN
		RETURN ;
	ELSE
		CTG_LOOP(I_PAR_CTG_CD) := '1' ;
	END IF ;

	INSERT INTO MAW_CTG_ITM (
		CTG_CD,
		ITM_CD,
		ITM_SUB1,
		ITM_SUB2,
		ITM_SUB3
		)
	SELECT	I_CTG_CD,
		m.ITM_CD,
		m.ITM_SUB1,
		m.ITM_SUB2,
		m.ITM_SUB3
	FROM	MAVM_CTG_CONFIG m
	WHERE	0=0
	AND	m.PAR_CTG_CD = I_PAR_CTG_CD
	AND	m.TERM = I_TERM
	AND	m.ITM_CD IS NOT NULL
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	MAW_CTG_ITM x
			WHERE	0=0
			AND	x.CTG_CD = I_CTG_CD
			AND	x.ITM_CD = m.ITM_CD
			AND	x.ITM_SUB1 = m.ITM_SUB1
			AND	x.ITM_SUB2 = m.ITM_SUB2
			AND	x.ITM_SUB3 = m.ITM_SUB3
			)
	;

	FOR x IN (
		SELECT	m.CTG_CD
		FROM	MAVM_CTG_CONFIG m
		WHERE	0=0
		AND	m.TERM = I_TERM
		AND	m.PAR_CTG_CD = I_PAR_CTG_CD
		AND	m.CTG_CD IS NOT NULL
		AND	m.PAR_CTG_CD != m.CTG_CD
		)
	LOOP
		P_SET_ITM_WORK(I_TERM, I_CTG_CD, x.CTG_CD) ;
	END LOOP ;

END P_SET_ITM_WORK ;

PROCEDURE P_SET_CTG_ITM (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品目ＣＤをMAW_CTG_ITMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_CD
		原価品群ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_TERM ;
	INSERT INTO MAW_TERM (TERM) VALUES (I_TERM) ;

	DELETE MAW_CTG_ITM w ;

	CTG_LOOP.DELETE ;
	P_SET_ITM_WORK(I_TERM, I_CTG_CD, I_CTG_CD) ;
	CTG_LOOP.DELETE ;

END P_SET_CTG_ITM ;

PROCEDURE P_SET_CTG_GRP_ITM (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_GRP_CD	IN MAPA_META.CTG_GRP_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_ITMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_GRP_CD
		品群グループＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_TERM ;
	INSERT INTO MAW_TERM (TERM) VALUES (I_TERM) ;

	DELETE MAW_CTG_ITM w ;

	FOR x IN (
		SELECT	m.CTG_CD
		FROM	MAM_COST_CTG m
		WHERE	0=0
		AND	m.CTG_GRP_CD = I_CTG_GRP_CD
		)
	LOOP
		CTG_LOOP.DELETE ;
		P_SET_ITM_WORK(I_TERM, x.CTG_CD, x.CTG_CD) ;
	END LOOP ;

	CTG_LOOP.DELETE ;

END P_SET_CTG_GRP_ITM ;

PROCEDURE P_SET_CTG_WORK (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE,
	I_PAR_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品群ＣＤをMAW_CTG_CTGに作成する
<REMARKS>
	対象となる期はMAW_TERMに作成しておく必要がある
<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_CD
		作成対象の品群ＣＤ
<IN>
	I_PAR_CTG_CD
		品群取得対象の品群ＣＤ
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
BEGIN
	IF CTG_LOOP.EXISTS(I_PAR_CTG_CD) THEN
		RETURN ;
	ELSE
		CTG_LOOP(I_PAR_CTG_CD) := '1' ;
	END IF ;

	IF I_CTG_CD = I_PAR_CTG_CD THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAW_CTG_CTG w
		WHERE	0=0
		AND	w.PAR_CTG_CD = I_CTG_CD
		;

		IF L_CNT = 0 THEN
			INSERT INTO MAW_CTG_CTG (
				PAR_CTG_CD,
				CTG_CD
				)
			VALUES	(
				I_CTG_CD,
				I_PAR_CTG_CD
				)
			;
		END IF ;
	END IF ;

	INSERT INTO MAW_CTG_CTG (
		PAR_CTG_CD,
		CTG_CD
		)
	SELECT	I_CTG_CD,
		m.CTG_CD
	FROM	MAVM_CTG_CONFIG m
	WHERE	0=0
	AND	m.PAR_CTG_CD = I_PAR_CTG_CD
	AND	m.TERM = I_TERM
	AND	m.CTG_CD IS NOT NULL
	AND	m.PAR_CTG_CD != m.CTG_CD
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	MAW_CTG_CTG x
			WHERE	0=0
			AND	x.PAR_CTG_CD = I_CTG_CD
			AND	x.CTG_CD = m.CTG_CD
			)
	;

	FOR x IN (
		SELECT	m.CTG_CD
		FROM	MAVM_CTG_CONFIG m
		WHERE	0=0
		AND	m.TERM = I_TERM
		AND	m.PAR_CTG_CD = I_PAR_CTG_CD
		AND	m.CTG_CD IS NOT NULL
		AND	m.PAR_CTG_CD != m.CTG_CD
		)
	LOOP
		P_SET_CTG_WORK(I_TERM, I_CTG_CD, x.CTG_CD) ;
	END LOOP ;

END P_SET_CTG_WORK ;

PROCEDURE P_SET_CTG_CTG (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品群ＣＤをMAW_CTG_CTGに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_CD
		原価品群ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_TERM ;
	INSERT INTO MAW_TERM (TERM) VALUES (I_TERM) ;

	DELETE MAW_CTG_CTG w ;

	CTG_LOOP.DELETE ;
	P_SET_CTG_WORK(I_TERM, I_CTG_CD, I_CTG_CD) ;
	CTG_LOOP.DELETE ;

END ;

PROCEDURE P_SET_CTG_GRP_CTG (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_GRP_CD	IN MAPA_META.CTG_GRP_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_CTGを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_GRP_CD
		品群グループＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_TERM ;
	INSERT INTO MAW_TERM (TERM) VALUES (I_TERM) ;

	DELETE MAW_CTG_CTG w ;

	FOR x IN (
		SELECT	m.CTG_CD
		FROM	MAM_COST_CTG m
		WHERE	0=0
		AND	m.CTG_GRP_CD = I_CTG_GRP_CD
		)
	LOOP
		CTG_LOOP.DELETE ;
		P_SET_CTG_WORK(I_TERM, x.CTG_CD, x.CTG_CD) ;
	END LOOP ;

	CTG_LOOP.DELETE ;

END P_SET_CTG_GRP_CTG ;

PROCEDURE P_SET_YM_LIST (
	I_CUR_TERM	IN CUR_TERM%ROWTYPE,
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	月別ワークテーブルに作成する年月のリストを作成する
<REMARKS>
<ARGUMENTS>
<IN>
	I_CUR_TERM
		対象期間マスタの検索結果
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<HISTORY>
**************************************************************************/
AS
	YM_FR	MAPA_META.YM%TYPE ;
	YM_TO	MAPA_META.YM%TYPE ;
	YM_TMP	MAPA_META.YM%TYPE ;

	L_CNT	BINARY_INTEGER ;
BEGIN
	YM_FR := NULL ;
	YM_TO := NULL ;
	YM_TMP := NULL ;

	IF I_CUR_TERM.TERM <= I_YM_FROM THEN
		YM_FR := I_YM_FROM ;
	ELSE
		YM_FR := I_CUR_TERM.TERM ;
	END IF ;

	YM_TMP := ADD_MONTHS(I_CUR_TERM.TERM_END_YM, -1) ;
	IF YM_TMP <= I_YM_TO THEN
		YM_TO := YM_TMP ;
	ELSE
		YM_TO := I_YM_TO ;
	END IF ;

	L_CNT := 0 ;
	YM_TMP := YM_FR ;
	LOOP
		L_CNT := L_CNT + 1 ;
		REC_YM(L_CNT) := YM_TMP ;

		YM_TMP := ADD_MONTHS(YM_TMP, 1) ;
		EXIT WHEN YM_TMP > YM_TO ;
	END LOOP ;

END P_SET_YM_LIST ;

PROCEDURE P_SET_CTG_ITM_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群ＣＤに属する品目ＣＤをMAW_CTG_ITM_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_CTG_CD
		原価品群ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_CTG_ITM_YM ;

	FOR x IN CUR_TERM(I_YM_FROM, I_YM_TO)
	LOOP
		REC_YM.DELETE ;
		DELETE MAW_CTG_ITM ;

		P_SET_CTG_ITM(x.TERM, I_CTG_CD) ;

		P_SET_YM_LIST(x, I_YM_FROM, I_YM_TO) ;

		FORALL i IN 1..REC_YM.COUNT
			INSERT INTO MAW_CTG_ITM_YM (
				YM,
				CTG_CD,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3
				)
			SELECT
				REC_YM(i),
				w.CTG_CD,
				w.ITM_CD,
				w.ITM_SUB1,
				w.ITM_SUB2,
				w.ITM_SUB3
			FROM	MAW_CTG_ITM w
			WHERE	0=0
			;
	END LOOP ;

END P_SET_CTG_ITM_YM ;

PROCEDURE P_SET_CTG_GRP_ITM_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CTG_GRP_CD	IN MAPA_META.CTG_GRP_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_ITM_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_CTG_GRP_CD
		品群グループＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_CTG_ITM_YM ;

	FOR x IN CUR_TERM(I_YM_FROM, I_YM_TO)
	LOOP
		REC_YM.DELETE ;
		DELETE MAW_CTG_ITM ;

		P_SET_CTG_GRP_ITM(x.TERM, I_CTG_GRP_CD) ;

		P_SET_YM_LIST(x, I_YM_FROM, I_YM_TO) ;

		FORALL i IN 1..REC_YM.COUNT
			INSERT INTO MAW_CTG_ITM_YM (
				YM,
				CTG_CD,
				ITM_CD,
				ITM_SUB1,
				ITM_SUB2,
				ITM_SUB3
				)
			SELECT
				REC_YM(i),
				w.CTG_CD,
				w.ITM_CD,
				w.ITM_SUB1,
				w.ITM_SUB2,
				w.ITM_SUB3
			FROM	MAW_CTG_ITM w
			WHERE	0=0
			;
	END LOOP ;

END P_SET_CTG_GRP_ITM_YM ;

PROCEDURE P_SET_CTG_CTG_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群ＣＤに属する品群ＣＤをMAW_CTG_CTG_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_CTG_CD
		原価品群ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_CTG_CTG_YM ;

	FOR x IN CUR_TERM(I_YM_FROM, I_YM_TO)
	LOOP
		REC_YM.DELETE ;
		DELETE MAW_CTG_CTG ;

		P_SET_CTG_CTG(x.TERM, I_CTG_CD) ;

		P_SET_YM_LIST(x, I_YM_FROM, I_YM_TO) ;

		FORALL i IN 1..REC_YM.COUNT
			INSERT INTO MAW_CTG_CTG_YM (
				YM,
				PAR_CTG_CD,
				CTG_CD)
			SELECT
				REC_YM(i),
				w.PAR_CTG_CD,
				w.CTG_CD
			FROM	MAW_CTG_CTG w
			WHERE	0=0
			;
	END LOOP ;

END P_SET_CTG_CTG_YM ;

PROCEDURE P_SET_CTG_GRP_CTG_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CTG_GRP_CD	IN MAPA_META.CTG_GRP_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_CTG_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_CTG_GRP_CD
		品群グループＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_CTG_CTG_YM ;

	FOR x IN CUR_TERM(I_YM_FROM, I_YM_TO)
	LOOP
		REC_YM.DELETE ;
		DELETE MAW_CTG_CTG ;

		P_SET_CTG_GRP_CTG(x.TERM, I_CTG_GRP_CD) ;

		P_SET_YM_LIST(x, I_YM_FROM, I_YM_TO) ;

		FORALL i IN 1..REC_YM.COUNT
			INSERT INTO MAW_CTG_CTG_YM (
				YM,
				PAR_CTG_CD,
				CTG_CD)
			SELECT
				REC_YM(i),
				w.PAR_CTG_CD,
				w.CTG_CD
			FROM	MAW_CTG_CTG w
			WHERE	0=0
			;
	END LOOP ;

END P_SET_CTG_GRP_CTG_YM ;

END MAPA_CTG_ITM ;
/
