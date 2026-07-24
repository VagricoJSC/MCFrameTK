CREATE OR REPLACE PACKAGE MGPA_COPY_ST
/**************************************************************************
<SYNOPSIS>
	月初データのコピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_MAIN (
	I_CALC_GRP_CD_FROM	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM_FROM		IN MAPA_META.YM%TYPE,
	I_CALC_GRP_CD_TO	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM_TO			IN MAPA_META.YM%TYPE,
	I_STK_FLG		IN MAPA_META.FLG%TYPE,
	I_WIP_FLG		IN MAPA_META.FLG%TYPE,
	I_LOT_NO_FLG		IN MAPA_META.FLG%TYPE,
	I_SUBLOT_NO_FLG		IN MAPA_META.FLG%TYPE,
	I_SNO1_FLG		IN MAPA_META.FLG%TYPE,
	I_SNO2_FLG		IN MAPA_META.FLG%TYPE,
	I_SNO3_FLG		IN MAPA_META.FLG%TYPE,
	I_SNO4_FLG		IN MAPA_META.FLG%TYPE,
	I_BP_FLG		IN MAPA_META.FLG%TYPE,
	I_ASST_FLG		IN MAPA_META.FLG%TYPE,
	I_DEL_FLG		IN MAPA_META.FLG%TYPE
) ;
/*********************************************************
<SYNOPSIS>
	月初データコピーメイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD_FROM
		コピー元計算グループＣＤ
<IN>	I_YM_FROM
		コピー元年月
<IN>	I_CALC_GRP_CD_TO
		コピー先計算グループＣＤ
<IN>	I_YM_TO
		コピー先年月
<IN>	I_STK_FLG
		月初在庫作成ＦＬＧ
<IN>	I_WIP_FLG
		月初仕掛作成ＦＬＧ
<IN>	I_LOT_NO_FLG
		ロットＮＯ引継ＦＬＧ
<IN>	I_SUBLOT_NO_FLG
		サブロットＮＯ引継ＦＬＧ
<IN>	I_SNO1_FLG
		手配ＮＯ１引継ＦＬＧ
<IN>	I_SNO2_FLG
		手配ＮＯ２引継ＦＬＧ
<IN>	I_SNO3_FLG
		手配ＮＯ３引継ＦＬＧ
<IN>	I_SNO4_FLG
		手配ＮＯ４引継ＦＬＧ
<IN>	I_BP_FLG
		取引先引継ＦＬＧ
<IN>	I_ASST_FLG
		資産区分引継ＦＬＧ
<IN>	I_DEL_FLG
		削除後再作成ＦＬＧ
<HISTORY>
**********************************************************/

END MGPA_COPY_ST ;
/
