CREATE OR REPLACE PACKAGE MGPA_ALC_PTN
/**************************************************************************
<SYNOPSIS>
	配賦パタン取得ユーティリティ
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_INI
;
/**************************************************************************
<SYNOPSIS>
	初期化処理
<REMARKS>
	メモリ内のワークデータをクリアする
<ARGUMENTS>
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_WORK (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる配賦パタン選択マスタのデータを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_GET_ALC_PTN_EXPNS (
	I_ALC_AC_CD	IN MAPA_META.ALC_AC_CD%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE,
	I_LOC_CD	IN MAPA_META.LOC_CD%TYPE,
	I_OPER_CD	IN MAPA_META.OPER_CD%TYPE,
	I_BP_CD		IN MAPA_META.BP_CD%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	O_ALC_PTN_CD	OUT MAPA_META.ALC_PTN_CD%TYPE,
	O_EXPNS_CD		OUT MAPA_META.EXPNS_CD%TYPE
) ;
/*********************************************************
<SYNOPSIS>
	使用する配賦パタンＣＤと費目ＣＤを取得する
<REMARKS>

<ARGUMENTS>
<IN>	I_ALC_AC_CD
		配賦科目ＣＤ
<IN>	I_DPT_CD
		部門ＣＤ
<IN>	I_LOC_CD
		場所ＣＤ
<IN>	I_OPER_CD
		工程ＣＤ
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	I_CTG_CD
		品群ＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<IN>	I_WG_CD
		ワーキンググループＣＤ
<OUT>	O_ALC_PTN_CD
		対象となる配賦パタンＣＤ
<OUT>	O_EXPNS_CD
		対象となる費目ＣＤ
<HISTORY>
**********************************************************/

END MGPA_ALC_PTN ;
/
