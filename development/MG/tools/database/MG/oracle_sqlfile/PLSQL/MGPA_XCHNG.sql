SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MGPA_XCHNG
/**************************************************************************
<SYNOPSIS>
	原価管理用のレート変換ユーティリティ
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

FUNCTION F_GET_CUR (
	I_CUR_CD	IN MAPA_META.CUR_CD%TYPE
)
RETURN MAM_CUR%ROWTYPE ;
/*********************************************************
<SYNOPSIS>
	通貨情報のレコードを返す
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CUR_CD
		通貨ＣＤ
<RETURNVALUE>
	対象となるMAM_CURのレコード
<HISTORY>
**********************************************************/

PROCEDURE P_INI (
	I_TERM	IN MAPA_META.YM%TYPE,
	I_XRATE_CD IN MAPA_META.XRATE_CD%TYPE
) ;
/*********************************************************
<SYNOPSIS>
	F_XCHNGを利用する前の初期化処理
<REMARKS>
	MGW_CALC_XRATEのデータを作成する
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_XRATE_CD
		為替レートＣＤ
<HISTORY>
**********************************************************/

PROCEDURE P_INI (
	I_ARG	IN MGT_ARG%ROWTYPE
) ;
/*********************************************************
<SYNOPSIS>
	F_XCHNGを利用する前の初期化処理
<REMARKS>
	MGW_CALC_XRATE, MGT_CALC_XRATEのデータを作成する
<ARGUMENTS>
<IN>	I_ARG
		原価計算情報
<HISTORY>
**********************************************************/

FUNCTION F_XCHNG (
	I_FR_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_TO_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
	I_XRATE_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
	I_AMT		IN	MAPA_META.MONEY%TYPE,
	I_TGT		IN	MAPA_META.ORA_OBJ_NM%TYPE DEFAULT NULL
)
RETURN MAPA_META.MONEY%TYPE ;
/************************************************************************
<SYNOPSIS>
	為替情報を元に指定した通貨コードへの換算金額を返す
<REMARKS>
	入力された金額がＮＵＬＬのときはＮＵＬＬを返す。
	変換前通貨コードがＮＵＬＬのときは入力値を返す。
	変換できない場合はエラーとする。
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	I_FR_CUR_CD
		通貨ＣＤ
<IN>	I_TO_CUR_CD
		基準通貨ＣＤ
<IN>	I_DEC_PLACE
		小数部有効桁数
<IN>	I_XRATE_RND_TYP
		為替レート換算端数処理区分
<IN>	I_AMT
		金額
<IN>	I_TGT
		対象テーブル
<RETURNVALUE>
		為替レート換算後の金額
<HISTORY>
*************************************************************************/

FUNCTION F_XCHNG2 (
	I_FR_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_TO_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_XRATE		IN	MAPA_META.MONEY%TYPE,
	I_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
	I_XRATE_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
	I_AMT		IN	MAPA_META.MONEY%TYPE,
	I_TGT		IN	MAPA_META.ORA_OBJ_NM%TYPE DEFAULT NULL
)
RETURN MAPA_META.MONEY%TYPE ;
/************************************************************************
<SYNOPSIS>
	為替レートを元に指定した通貨コードへの換算金額を返す
<REMARKS>
	入力された金額がＮＵＬＬのときはＮＵＬＬを返す。
	変換前通貨コードがＮＵＬＬのときは入力値を返す。
	為替レートがＮＵＬＬで変換できない場合はエラーとする。
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	I_FR_CUR_CD
		通貨ＣＤ
<IN>	I_TO_CUR_CD
		基準通貨ＣＤ
<IN>	I_XRATE
		為替レート
<IN>	I_DEC_PLACE
		小数部有効桁数
<IN>	I_XRATE_RND_TYP
		為替レート換算端数処理区分
<IN>	I_AMT
		金額
<IN>	I_TGT
		対象テーブル
<RETURNVALUE>
		為替レート換算後の金額
<HISTORY>
*************************************************************************/

FUNCTION F_GET_RATE (
	I_FR_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_TO_CUR_CD	IN	MAPA_META.CUR_CD%TYPE
)
RETURN MAPA_META.MONEY%TYPE ;
/************************************************************************
<SYNOPSIS>
	為替情報を元に指定した通貨コードへの為替レートを返す
<REMARKS>
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	I_FR_CUR_CD
		通貨ＣＤ
<IN>	I_TO_CUR_CD
		基準通貨ＣＤ
<RETURNVALUE>
		為替レート
<HISTORY>
*************************************************************************/

END MGPA_XCHNG ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MGPA_XCHNG
IS
	G_ARG	MGT_ARG%ROWTYPE ;
	G_MSG	FCPA_ERR.MSG_BINDER ;

FUNCTION F_GET_CUR (
	I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE
) RETURN MAM_CUR%ROWTYPE
/*********************************************************
<SYNOPSIS>
	通貨情報のレコードを返す
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CUR_CD
		通貨ＣＤ
<RETURNVALUE>
	対象となるMAM_CURのレコード
<HISTORY>
**********************************************************/
IS
	L_CUR	MAM_CUR%ROWTYPE ;
	L_MSG	FCPA_ERR.MSG_BINDER ;
BEGIN
	BEGIN
		SELECT	m.*
		INTO	L_CUR
		FROM	MAM_CUR m
		WHERE	0=0
		AND	m.CUR_CD = I_CUR_CD
		;
	EXCEPTION
	WHEN NO_DATA_FOUND THEN
		L_MSG := FCPA_ERR.MSG_BINDER(I_CUR_CD) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0044', L_MSG) ;
	END ;

	RETURN L_CUR ;
END F_GET_CUR ;

PROCEDURE P_INI (
	I_TERM	IN MAPA_META.YM%TYPE,
	I_XRATE_CD IN MAPA_META.XRATE_CD%TYPE
)
/*********************************************************
<SYNOPSIS>
	F_XCHNGを利用する前の初期化処理
<REMARKS>
	MGW_CALC_XRATEのデータを作成する
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_XRATE_CD
		為替レートＣＤ
<HISTORY>
**********************************************************/
AS
BEGIN
	DELETE MGW_CALC_XRATE ;
	INSERT INTO MGW_CALC_XRATE (
		FR_CUR_CD,
		TO_CUR_CD,
		XRATE
		)
	SELECT	m.FR_CUR_CD,
		m.TO_CUR_CD,
		m.XRATE
	FROM	MGT_CUR_XRATE m
	WHERE	0=0
	AND	m.XRATE_CD = I_XRATE_CD
	AND	m.TERM = I_TERM
	;

END P_INI ;

PROCEDURE P_INI (
	I_ARG	IN MGT_ARG%ROWTYPE
)
/*********************************************************
<SYNOPSIS>
	F_XCHNGを利用する前の初期化処理
<REMARKS>
	MGW_CALC_XRATE, MGT_CALC_XRATEのデータを作成する
<ARGUMENTS>
<IN>	I_ARG
		原価計算情報
<HISTORY>
**********************************************************/
AS
	L_CNT	NUMBER ;
BEGIN
	G_ARG := I_ARG ;

	P_INI(G_ARG.TERM, G_ARG.XRATE_CD) ;

	DELETE MGT_CALC_XRATE t WHERE t.CALC_NO = G_ARG.CALC_NO AND t.CALC_GRP_CD = G_ARG.CALC_GRP_CD ;
	INSERT INTO MGT_CALC_XRATE (
		CALC_NO, CALC_GRP_CD,
		FR_CUR_CD,
		TO_CUR_CD,
		XRATE_CD,
		XRATE
		)
	SELECT	G_ARG.CALC_NO, G_ARG.CALC_GRP_CD,
		m.FR_CUR_CD,
		m.TO_CUR_CD,
		m.XRATE_CD,
		m.XRATE
	FROM	MGT_CUR_XRATE m
	WHERE	0=0
	AND	m.XRATE_CD = G_ARG.XRATE_CD
	AND	m.TERM = G_ARG.TERM
	;
	L_CNT := SQL%ROWCOUNT ;
	FCPA_BATCH_LOG.P_PROC_LOG('MGBDD0008', 'MGT_CALC_XRATE', L_CNT) ;
END P_INI ;

FUNCTION F_XCHNG (
	I_FR_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_TO_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
	I_XRATE_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
	I_AMT		IN	MAPA_META.MONEY%TYPE,
	I_TGT		IN	MAPA_META.ORA_OBJ_NM%TYPE DEFAULT NULL
)
RETURN MAPA_META.MONEY%TYPE
/************************************************************************
<SYNOPSIS>
	為替情報を元に指定した通貨コードへの換算金額を返す
<REMARKS>
	入力された金額がＮＵＬＬのときはＮＵＬＬを返す。
	変換前通貨コードがＮＵＬＬのときは入力値を返す。
	為替レートがＮＵＬＬで変換できない場合はエラーとする。
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	I_FR_CUR_CD
		通貨ＣＤ
<IN>	I_TO_CUR_CD
		基準通貨ＣＤ
<IN>	I_DEC_PLACE
		小数部有効桁数
<IN>	I_XRATE_RND_TYP
		為替レート換算端数処理区分
<IN>	I_AMT
		金額
<IN>	I_TGT
		対象テーブル
<RETURNVALUE>
		為替レート換算後の金額
<HISTORY>
*************************************************************************/
IS
	L_RATE	MAPA_META.MONEY%TYPE ;
BEGIN
	IF I_AMT IS NULL 
	OR I_AMT = 0
	OR I_FR_CUR_CD IS NULL 
	OR I_FR_CUR_CD = I_TO_CUR_CD 
	THEN
		RETURN I_AMT ;
	END IF ;

	SELECT	MIN(t.XRATE)
	INTO	L_RATE
	FROM	MGW_CALC_XRATE t
	WHERE	0=0
	AND	t.FR_CUR_CD = I_FR_CUR_CD
	AND	t.TO_CUR_CD = I_TO_CUR_CD
	;

	IF L_RATE IS NULL THEN
		G_MSG := FCPA_ERR.MSG_BINDER(
				I_FR_CUR_CD, I_TO_CUR_CD, G_ARG.XRATE_CD, 
				FCPA_DATE_UTIL.F_TO_CHAR(G_ARG.TERM, FCPA_DATE_UTIL.Y4M),
				I_TGT) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0008', G_MSG) ;
	END IF ;

	RETURN MAPA_CALC.F_RND(I_AMT * L_RATE, I_DEC_PLACE, I_XRATE_RND_TYP) ;

END F_XCHNG ;

FUNCTION F_XCHNG2 (
	I_FR_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_TO_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_XRATE		IN	MAPA_META.MONEY%TYPE,
	I_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
	I_XRATE_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
	I_AMT		IN	MAPA_META.MONEY%TYPE,
	I_TGT		IN	MAPA_META.ORA_OBJ_NM%TYPE DEFAULT NULL
)
RETURN MAPA_META.MONEY%TYPE
/************************************************************************
<SYNOPSIS>
	為替レートを元に指定した通貨コードへの換算金額を返す
<REMARKS>
	入力された金額がＮＵＬＬのときはＮＵＬＬを返す。
	変換前通貨コードがＮＵＬＬのときは入力値を返す。
	変換できない場合はエラーとする。
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	I_FR_CUR_CD
		通貨ＣＤ
<IN>	I_TO_CUR_CD
		基準通貨ＣＤ
<IN>	I_XRATE
		為替レート
<IN>	I_DEC_PLACE
		小数部有効桁数
<IN>	I_XRATE_RND_TYP
		為替レート換算端数処理区分
<IN>	I_AMT
		金額
<IN>	I_TGT
		対象テーブル
<RETURNVALUE>
		為替レート換算後の金額
<HISTORY>
*************************************************************************/
IS
BEGIN
	IF I_AMT IS NULL 
	OR I_AMT = 0
	OR I_FR_CUR_CD IS NULL 
	OR I_FR_CUR_CD = I_TO_CUR_CD 
	OR I_XRATE = 1
	THEN
		RETURN I_AMT ;
	END IF ;

	IF I_XRATE IS NULL THEN
		G_MSG := FCPA_ERR.MSG_BINDER(
				I_FR_CUR_CD, I_TO_CUR_CD, G_ARG.XRATE_CD, 
				FCPA_DATE_UTIL.F_TO_CHAR(G_ARG.TERM, FCPA_DATE_UTIL.Y4M),
				I_TGT) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0008', G_MSG) ;
	END IF ;

	RETURN MAPA_CALC.F_RND(I_AMT * I_XRATE, I_DEC_PLACE, I_XRATE_RND_TYP) ;

END F_XCHNG2 ;

FUNCTION F_GET_RATE (
	I_FR_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
	I_TO_CUR_CD	IN	MAPA_META.CUR_CD%TYPE
)
RETURN MAPA_META.MONEY%TYPE
/************************************************************************
<SYNOPSIS>
	為替情報を元に指定した通貨コードへの為替レートを返す
<REMARKS>
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	I_FR_CUR_CD
		通貨ＣＤ
<IN>	I_TO_CUR_CD
		基準通貨ＣＤ
<RETURNVALUE>
		為替レート
<HISTORY>
*************************************************************************/
IS
	L_RATE	MAPA_META.MONEY%TYPE ;
BEGIN
	IF I_FR_CUR_CD IS NULL THEN
		RETURN NULL ;
	ELSIF I_FR_CUR_CD = I_TO_CUR_CD THEN
		RETURN 1 ;
	END IF ;

	SELECT	MIN(t.XRATE)
	INTO	L_RATE
	FROM	MGW_CALC_XRATE t
	WHERE	0=0
	AND	t.FR_CUR_CD = I_FR_CUR_CD
	AND	t.TO_CUR_CD = I_TO_CUR_CD
	;

	RETURN L_RATE ;

END F_GET_RATE ;

END MGPA_XCHNG ;

/
show errors;


