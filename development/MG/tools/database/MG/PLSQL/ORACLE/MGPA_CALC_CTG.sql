CREATE OR REPLACE PACKAGE MGPA_CALC_CTG
/*********************************************************
<SYNOPSIS>
		計算カテゴリワーク作成
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	PROCEDURE P_SET_WORK (
		I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
		I_CALC_CTG_TYP	IN MAPA_META.CALC_CTG_TYP%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		対象となる計算カテゴリＣＤをMGW_CALC_CTGに作成する。
	<REMARKS>
		MAM_GRP_CTGのデータはCTG_PRIO, CALC_CTG_CDで
		ソートした順で優先度を１から順に設定する。
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CALC_CTG_TYP
			計算カテゴリ区分
	<HISTORY>
	**********************************************************/

	PROCEDURE P_SET_WORK_ALL (
		I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		計算グループＣＤに対して対象となる計算カテゴリ区分ごとに
		計算カテゴリＣＤをMGW_CALC_GRP_CTGに作成する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<HISTORY>
	**********************************************************/

END MGPA_CALC_CTG ;
/
