CREATE OR REPLACE PACKAGE MGPA_STD_INPT
/**************************************************************************
<SYNOPSIS>
	標準内訳照会作成処理
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS
	PROCEDURE P_MAIN (
		I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
		I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_LOC_CD	IN MAPA_META.LOC_CD%TYPE,
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		標準内訳照会作成メイン処理
	<REMARKS>
		メイン処理を起動するプロシージャ
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CALC_NO
			原価計算ＮＯ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_SPPL_CD
			発注先ＣＤ
	<HISTORY>
	**************************************************************************/

END MGPA_STD_INPT ;
/
