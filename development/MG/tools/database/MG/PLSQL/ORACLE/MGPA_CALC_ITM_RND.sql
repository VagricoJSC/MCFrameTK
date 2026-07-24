CREATE OR REPLACE PACKAGE MGPA_CALC_ITM_RND
/************************************************************************
<SYNOPSIS>
	指定した品目に対して端数処理を行う
<REMARKS>

<ARGUMENTS>
<HISTORY>
*************************************************************************/
IS
FUNCTION F_RND_BASE_UNIT (
	I_ITM	IN	MAPA_META.ITM_CD%TYPE,
	I_QTY	IN	MAPA_META.QTY%TYPE
) RETURN MAPA_META.QTY%TYPE ;
/*********************************************************
<SYNOPSIS>
	指定した品目に対して基準単位の端数処理区分、
	小数部有効桁数を使用して入力した数値の端数処理を行う
<REMARKS>
	エラーの場合は入力値(I_QTY)を返す
<ARGUMENTS>
<IN>	I_ITM
		品目ＣＤ
<IN>	I_QTY
		端数処理をする対象の数値
<RETURNVALUE>
		端数処理をした数値
<HISTORY>
**********************************************************/

FUNCTION F_RND_AMT (
	I_AMT	IN	MAPA_META.MONEY%TYPE
) RETURN MAPA_META.MONEY%TYPE ;
/*********************************************************
<SYNOPSIS>
	指定した品目に対して金額端数処理区分、金額小数部
	有効桁数を使用して入力した数値の端数処理を行う
<REMARKS>
	エラーの場合は入力値(I_AMT)を返す
<ARGUMENTS>
<IN>	I_AMT
		端数処理をする対象の金額
<RETURNVALUE>
		端数処理をした金額
<HISTORY>
**********************************************************/

END MGPA_CALC_ITM_RND ;
/
