CREATE OR REPLACE PACKAGE MGPA_CARRY_OVER
/**************************************************************************
<SYNOPSIS>
	繰越処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_MAIN (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
	, I_PROC_NO	IN	NUMBER DEFAULT NULL
) ;
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

END MGPA_CARRY_OVER ;
/
