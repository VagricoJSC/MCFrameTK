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
