CREATE OR REPLACE PACKAGE MGPA_AC_IF
/**************************************************************************
<SYNOPSIS>
	会計ＩＦ処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_SEND (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	会計ＩＦの送信処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_CANCEL (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	会計ＩＦの送信取消処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
END MGPA_AC_IF ;
/
