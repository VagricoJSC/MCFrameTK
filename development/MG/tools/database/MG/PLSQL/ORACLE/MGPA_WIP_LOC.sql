CREATE OR REPLACE PACKAGE MGPA_WIP_LOC
/**************************************************************************
<SYNOPSIS>
	場所別仕掛原価データ作成処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_MAIN (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_WG_CD	IN	MAPA_META.WG_CD%TYPE DEFAULT NULL
) ;
/**************************************************************************
<SYNOPSIS>
	場所別仕掛原価データの作成メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/

END MGPA_WIP_LOC ;
/
