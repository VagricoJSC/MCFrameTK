CREATE OR REPLACE PACKAGE MGPA_COST_IO
/**************************************************************************
<SYNOPSIS>
	原価個別受払表（MGT_COST_IO*）に対するデータを作成する
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_MAIN (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_COST_IO_ID	IN MAPA_META.COST_IO_ID%TYPE,
	I_LOCK_FLG 	IN MAPA_META.FLG%TYPE DEFAULT '1'
) ;
/*********************************************************
<SYNOPSIS>
	原価個別受払表作成処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_COST_IO_ID
		受払表ＩＤ
<IN>	I_LOCK_FLG
		ロックＦＬＧ
<HISTORY>
**********************************************************/

END MGPA_COST_IO ;
/
