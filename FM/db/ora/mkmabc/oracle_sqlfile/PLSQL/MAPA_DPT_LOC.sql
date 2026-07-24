SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MAPA_DPT_LOC
/**************************************************************************
<SYNOPSIS>
	原価部門工程ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_SET_DPT_LOC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する場所・工程ＣＤをMAW_DPT_LOCに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LVL_LOC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_LOCを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_DPT (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する部門ＣＤをMAW_DPT_DPTに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LVL_DPT (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_DPTを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LOC_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門ＣＤに属する場所・工程ＣＤをMAW_DPT_LOC_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LVL_LOC_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_LOC_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_DPT_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門ＣＤに属する部門ＣＤをMAW_DPT_DPT_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LVL_DPT_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_DPT_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/

END MAPA_DPT_LOC ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_DPT_LOC
IS
	C_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

	TYPE LIST_DPT IS TABLE OF MAPA_META.FLG%TYPE INDEX BY MAPA_META.COST_DPT_CD%TYPE ;
	DPT_LOOP	LIST_DPT ;

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

PROCEDURE P_SET_WORK_LOC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE,
	I_PAR_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる部門ＣＤに属する場所・工程ＣＤをMAW_DPT_LOCに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_CD
		作成対象の部門ＣＤ
<IN>
	I_PAR_DPT_CD
		場所取得対象の部門ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	IF DPT_LOOP.EXISTS(I_PAR_DPT_CD) THEN
		RETURN ;
	ELSE
		DPT_LOOP(I_PAR_DPT_CD) := '1' ;
	END IF ;

	INSERT INTO MAW_DPT_LOC (
		DPT_CD,
		LOC_CD,
		OPER_CD,
		OPER_NULL_FLG
		)
	SELECT	I_DPT_CD,
		m.LOC_CD,
		m.OPER_CD,
		m.OPER_NULL_FLG
	FROM	MAVM_DPT_CONFIG m
	WHERE	0=0
	AND	m.PAR_DPT_CD = I_PAR_DPT_CD
	AND	m.TERM = I_TERM
	AND	m.LOC_CD IS NOT NULL
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	MAW_DPT_LOC x
			WHERE	0=0
			AND	x.DPT_CD = I_DPT_CD
			AND	x.LOC_CD = m.LOC_CD
			AND	NVL(x.OPER_CD, C_NULL_VAL) = NVL(m.OPER_CD, C_NULL_VAL)
			AND	x.OPER_NULL_FLG = m.OPER_NULL_FLG
			)
	;

	FOR x IN (
		SELECT	m.DPT_CD
		FROM	MAVM_DPT_CONFIG m
		WHERE	0=0
		AND	m.TERM = I_TERM
		AND	m.PAR_DPT_CD = I_PAR_DPT_CD
		AND	m.DPT_CD IS NOT NULL
		AND	m.PAR_DPT_CD != m.DPT_CD
		)
	LOOP
		P_SET_WORK_LOC(I_TERM, I_DPT_CD, x.DPT_CD) ;
	END LOOP ;

END P_SET_WORK_LOC ;

PROCEDURE P_SET_DPT_LOC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する場所・工程ＣＤをMAW_DPT_LOCに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_DPT_LOC w ;

	DPT_LOOP.DELETE ;
	P_SET_WORK_LOC(I_TERM, I_DPT_CD, I_DPT_CD) ;
	DPT_LOOP.DELETE ;

	DELETE	MAW_DPT_LOC w
	WHERE	0=0
	AND	(w.OPER_CD IS NOT NULL OR w.OPER_NULL_FLG = '1')
	AND	EXISTS (
			SELECT	'X'
			FROM	MAW_DPT_LOC x
			WHERE	0=0
			AND	x.DPT_CD = w.DPT_CD
			AND	x.LOC_CD = w.LOC_CD
			AND	x.OPER_CD IS NULL
			AND	x.OPER_NULL_FLG = '0'
		)
	;

END P_SET_DPT_LOC ;

PROCEDURE P_SET_DPT_LVL_LOC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_LOCを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_DPT_LOC w ;

	FOR x IN (
		SELECT	m.DPT_CD
		FROM	MAM_COST_DPT m
		WHERE	0=0
		AND	m.TERM = I_TERM
		AND	m.DPT_LVL_CD = I_DPT_LVL_CD
		)
	LOOP
		DPT_LOOP.DELETE ;
		P_SET_WORK_LOC(I_TERM, x.DPT_CD, x.DPT_CD) ;
	END LOOP ;

	DPT_LOOP.DELETE ;

	DELETE	MAW_DPT_LOC w
	WHERE	0=0
	AND	(w.OPER_CD IS NOT NULL OR w.OPER_NULL_FLG = '1')
	AND	EXISTS (
			SELECT	'X'
			FROM	MAW_DPT_LOC x
			WHERE	0=0
			AND	x.DPT_CD = w.DPT_CD
			AND	x.LOC_CD = w.LOC_CD
			AND	x.OPER_CD IS NULL
			AND	x.OPER_NULL_FLG = '0'
		)
	;

END P_SET_DPT_LVL_LOC ;

PROCEDURE P_SET_DPT_WORK (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE,
	I_PAR_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する部門ＣＤをMAW_DPT_DPTに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_CD
		作成対象の部門ＣＤ
<IN>
	I_PAR_DPT_CD
		部門取得対象の部門ＣＤ
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
BEGIN
	IF DPT_LOOP.EXISTS(I_PAR_DPT_CD) THEN
		RETURN ;
	ELSE
		DPT_LOOP(I_PAR_DPT_CD) := '1' ;
	END IF ;

	IF I_DPT_CD = I_PAR_DPT_CD THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAW_DPT_DPT w
		WHERE	0=0
		AND	w.PAR_DPT_CD = I_DPT_CD
		;

		IF L_CNT = 0 THEN
			INSERT INTO MAW_DPT_DPT (
				PAR_DPT_CD,
				DPT_CD
				)
			VALUES	(
				I_DPT_CD,
				I_PAR_DPT_CD
				)
			;
		END IF ;
	END IF ;

	INSERT INTO MAW_DPT_DPT (
		PAR_DPT_CD,
		DPT_CD
		)
	SELECT	I_DPT_CD,
		m.DPT_CD
	FROM	MAVM_DPT_CONFIG m
	WHERE	0=0
	AND	m.PAR_DPT_CD = I_PAR_DPT_CD
	AND	m.TERM = I_TERM
	AND	m.DPT_CD IS NOT NULL
	AND	m.PAR_DPT_CD != m.DPT_CD
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	MAW_DPT_DPT x
			WHERE	0=0
			AND	x.PAR_DPT_CD = I_DPT_CD
			AND	x.DPT_CD = m.DPT_CD
			)
	;

	FOR x IN (
		SELECT	m.DPT_CD
		FROM	MAVM_DPT_CONFIG m
		WHERE	0=0
		AND	m.TERM = I_TERM
		AND	m.PAR_DPT_CD = I_PAR_DPT_CD
		AND	m.DPT_CD IS NOT NULL
		AND	m.PAR_DPT_CD != m.DPT_CD
		)
	LOOP
		P_SET_DPT_WORK(I_TERM, I_DPT_CD, x.DPT_CD) ;
	END LOOP ;

END P_SET_DPT_WORK ;

PROCEDURE P_SET_DPT_DPT (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する部門ＣＤをMAW_DPT_DPTに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_DPT_DPT w ;

	DPT_LOOP.DELETE ;
	P_SET_DPT_WORK(I_TERM, I_DPT_CD, I_DPT_CD) ;
	DPT_LOOP.DELETE ;

END ;

PROCEDURE P_SET_DPT_LVL_DPT (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_DPTを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_DPT_DPT w ;

	FOR x IN (
		SELECT	m.DPT_CD
		FROM	MAM_COST_DPT m
		WHERE	0=0
		AND	m.TERM = I_TERM
		AND	m.DPT_LVL_CD = I_DPT_LVL_CD
		)
	LOOP
		DPT_LOOP.DELETE ;
		P_SET_DPT_WORK(I_TERM, x.DPT_CD, x.DPT_CD) ;
	END LOOP ;

	DPT_LOOP.DELETE ;

END P_SET_DPT_LVL_DPT ;

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

PROCEDURE P_SET_DPT_LOC_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門ＣＤに属する場所・工程ＣＤをMAW_DPT_LOC_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_DPT_LOC_YM ;

	FOR x IN CUR_TERM(I_YM_FROM, I_YM_TO)
	LOOP
		REC_YM.DELETE ;
		DELETE MAW_DPT_LOC ;

		P_SET_DPT_LOC(x.TERM, I_DPT_CD) ;

		P_SET_YM_LIST(x, I_YM_FROM, I_YM_TO) ;

		FORALL i IN 1..REC_YM.COUNT
			INSERT INTO MAW_DPT_LOC_YM (
				YM,
				DPT_CD,
				LOC_CD,
				OPER_CD,
				OPER_NULL_FLG)
			SELECT
				REC_YM(i),
				w.DPT_CD,
				w.LOC_CD,
				w.OPER_CD,
				w.OPER_NULL_FLG
			FROM	MAW_DPT_LOC w
			WHERE	0=0
			;
	END LOOP ;

END P_SET_DPT_LOC_YM ;

PROCEDURE P_SET_DPT_LVL_LOC_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_LOC_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_DPT_LOC_YM ;

	FOR x IN CUR_TERM(I_YM_FROM, I_YM_TO)
	LOOP
		REC_YM.DELETE ;
		DELETE MAW_DPT_LOC ;

		P_SET_DPT_LVL_LOC(x.TERM, I_DPT_LVL_CD) ;

		P_SET_YM_LIST(x, I_YM_FROM, I_YM_TO) ;

		FORALL i IN 1..REC_YM.COUNT
			INSERT INTO MAW_DPT_LOC_YM (
				YM,
				DPT_CD,
				LOC_CD,
				OPER_CD,
				OPER_NULL_FLG)
			SELECT
				REC_YM(i),
				w.DPT_CD,
				w.LOC_CD,
				w.OPER_CD,
				w.OPER_NULL_FLG
			FROM	MAW_DPT_LOC w
			WHERE	0=0
			;
	END LOOP ;

END P_SET_DPT_LVL_LOC_YM ;

PROCEDURE P_SET_DPT_DPT_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門ＣＤに属する部門ＣＤをMAW_DPT_DPT_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_DPT_DPT_YM ;

	FOR x IN CUR_TERM(I_YM_FROM, I_YM_TO)
	LOOP
		REC_YM.DELETE ;
		DELETE MAW_DPT_DPT ;

		P_SET_DPT_DPT(x.TERM, I_DPT_CD) ;

		P_SET_YM_LIST(x, I_YM_FROM, I_YM_TO) ;

		FORALL i IN 1..REC_YM.COUNT
			INSERT INTO MAW_DPT_DPT_YM (
				YM,
				PAR_DPT_CD,
				DPT_CD)
			SELECT
				REC_YM(i),
				w.PAR_DPT_CD,
				w.DPT_CD
			FROM	MAW_DPT_DPT w
			WHERE	0=0
			;
	END LOOP ;

END P_SET_DPT_DPT_YM ;

PROCEDURE P_SET_DPT_LVL_DPT_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_DPT_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE MAW_DPT_DPT_YM ;

	FOR x IN CUR_TERM(I_YM_FROM, I_YM_TO)
	LOOP
		REC_YM.DELETE ;
		DELETE MAW_DPT_DPT ;

		P_SET_DPT_LVL_DPT(x.TERM, I_DPT_LVL_CD) ;

		P_SET_YM_LIST(x, I_YM_FROM, I_YM_TO) ;

		FORALL i IN 1..REC_YM.COUNT
			INSERT INTO MAW_DPT_DPT_YM (
				YM,
				PAR_DPT_CD,
				DPT_CD)
			SELECT
				REC_YM(i),
				w.PAR_DPT_CD,
				w.DPT_CD
			FROM	MAW_DPT_DPT w
			WHERE	0=0
			;
	END LOOP ;

END P_SET_DPT_LVL_DPT_YM ;

END MAPA_DPT_LOC ;

/
show errors;


