CREATE OR REPLACE PACKAGE MGPA_PRE_RATE
/**************************************************************************
<SYNOPSIS>
	一次配賦比率作成処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_MAIN (
	I_SA_TYP		IN MAPA_META.SA_TYP%TYPE,
	I_YM			IN MAPA_META.YM%TYPE,
	I_YM_FROM		IN MAPA_META.YM%TYPE,
	I_YM_TO			IN MAPA_META.YM%TYPE,
	I_WG_CD			IN MAPA_META.WG_CD%TYPE,
	I_CALC_CTG_CD		IN MAPA_META.CALC_CTG_CD%TYPE,
	I_PRE_ALC_RATE_CD	IN MAPA_META.PRE_ALC_RATE_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	一次配賦比率作成メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_SA_TYP
		予実区分
<IN>	I_YM
		作成対象年月
<IN>	I_YM_FROM
		取得先年月ＦＲＯＭ
<IN>	I_YM_TO
		取得先年月ＴＯ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_PRE_ALC_RATE_CD
		一次配賦基準ＣＤ
<HISTORY>
**************************************************************************/

END MGPA_PRE_RATE ;
/
