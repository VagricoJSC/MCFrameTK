CREATE OR REPLACE PACKAGE MGPA_SCA_POST
/**************************************************************************
<SYNOPSIS>
	原価計算後処理
<REMARKS>
	バッチファイルが実行された後での処理
	
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS
PROCEDURE P_SET_ST_DATA (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO		IN MAPA_META.CALC_NO%TYPE,
	I_ST_YM			IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	月初情報を前月データの計算結果として作成する
<REMARKS>

<ARGUMENTS>

<HISTORY>
**************************************************************************/

PROCEDURE P_MAIN (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価計算後処理のメイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/

END MGPA_SCA_POST ;
/
