CREATE OR REPLACE PACKAGE MGPA_SCA_PREP
/**************************************************************************
<SYNOPSIS>
	原価計算前処理
<REMARKS>
	バッチファイルが実行される前での処理

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_MAIN (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価計算前処理のメイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/

END MGPA_SCA_PREP ;
/
