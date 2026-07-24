CREATE OR REPLACE PACKAGE MGPA_CALC_GRP
/**************************************************************************
<SYNOPSIS>
	計算グループマスタ関連ユーティリティ
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

FUNCTION F_GET_REC (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE
) RETURN MAM_CALC_GRP%ROWTYPE ;
/*********************************************************
<SYNOPSIS>
	計算グループマスタのレコードを返す
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<RETURNVALUE>
	対象となるMAM_CALC_GRPのレコード
<HISTORY>
**********************************************************/

FUNCTION F_CHK_MAX_MONS (
	I_ARG	IN MGT_ARG%ROWTYPE
) RETURN MAPA_META.FLG%TYPE ;
/*********************************************************
<SYNOPSIS>
	最大計算年月のときは１を返す
<REMARKS>
	
<ARGUMENTS>
<IN>	I_ARG
		原価計算情報
<RETURNVALUE>
	最大計算年月のときは１それ以外のときは０
<HISTORY>
**********************************************************/

END MGPA_CALC_GRP ;
/
