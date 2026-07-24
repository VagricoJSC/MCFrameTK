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
