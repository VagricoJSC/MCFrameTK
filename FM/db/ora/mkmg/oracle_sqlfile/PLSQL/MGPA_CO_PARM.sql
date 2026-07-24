SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MGPA_CO_PARM
/**************************************************************************
<SYNOPSIS>
	原価会社パラメータマスタ関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

FUNCTION F_GET_REC
RETURN MAM_CO_PARM%ROWTYPE ;
/*********************************************************
<SYNOPSIS>
	原価会社パラメータマスタのレコードを取得する。
<REMARKS>

<ARGUMENTS>

<RETURNVALUE>
	対象となるMAM_CO_PARMのレコード
<HISTORY>
**********************************************************/

FUNCTION F_GET_CALC_CTG_CD (
	I_CALC_CTG_CD		IN	MAPA_META.CALC_CTG_CD%TYPE
)
RETURN MAPA_META.CALC_CTG_CD%TYPE ;
/*********************************************************
<SYNOPSIS>
	I_CALC_CTG_CDがNULLなら原価会社パラメータマスタの
	デフォルト計算カテゴリＣＤを返す
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<HISTORY>
**********************************************************/

END MGPA_CO_PARM ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MGPA_CO_PARM
IS

FUNCTION F_GET_REC
RETURN MAM_CO_PARM%ROWTYPE
/*********************************************************
<SYNOPSIS>
	原価会社パラメータマスタのレコードを返す
<REMARKS>

<ARGUMENTS>

<RETURNVALUE>
	対象となるMAM_CO_PARMのレコード
<HISTORY>
**********************************************************/
AS
	L_REC	MAM_CO_PARM%ROWTYPE ;
BEGIN
	BEGIN
		SELECT	m.*
		INTO	L_REC
		FROM	MAM_CO_PARM m
		WHERE	0=0
		;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			FCPA_ERR.RAISE_APP_ERR('MGBXD0038') ;
	END ;

	RETURN L_REC ;

END F_GET_REC ;

FUNCTION F_GET_CALC_CTG_CD (
	I_CALC_CTG_CD		IN	MAPA_META.CALC_CTG_CD%TYPE
)
RETURN MAPA_META.CALC_CTG_CD%TYPE
/*********************************************************
<SYNOPSIS>
	I_CALC_CTG_CDがNULLなら原価会社パラメータマスタの
	デフォルト計算カテゴリＣＤを返す
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<HISTORY>
**********************************************************/
AS
	L_CO_PARM	MAM_CO_PARM%ROWTYPE ;
	L_CALC_CTG_CD	MAPA_META.CALC_CTG_CD%TYPE ;
BEGIN
	L_CALC_CTG_CD := I_CALC_CTG_CD ;

	IF L_CALC_CTG_CD IS NULL THEN
		L_CO_PARM := MGPA_CO_PARM.F_GET_REC() ;

		IF L_CO_PARM.DEF_CALC_CTG_CD IS NULL THEN
			--計算カテゴリが取得できませんでした。画面から指定するか、
			--原価会社パラメータマスタのデフォルト計算カテゴリＣＤを設定してください。
			FCPA_ERR.RAISE_APP_ERR('MGBDD0056') ;
		ELSE
			L_CALC_CTG_CD := L_CO_PARM.DEF_CALC_CTG_CD ;
		END IF ;

	END IF ;

	RETURN L_CALC_CTG_CD ;

END F_GET_CALC_CTG_CD ;

END MGPA_CO_PARM ;

/
show errors;


