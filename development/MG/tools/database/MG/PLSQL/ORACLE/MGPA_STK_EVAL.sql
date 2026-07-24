CREATE OR REPLACE PACKAGE MGPA_STK_EVAL
/**************************************************************************
<SYNOPSIS>
	月末在庫評価データ作成処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_MAIN (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_STK_EVAL_CD	IN MAPA_META.STK_EVAL_CD%TYPE,
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	月末在庫評価データ作成メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_STK_EVAL_CD
		在庫評価ＣＤ
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM_FROM
		取得先年月ＦＲＯＭ
<IN>	I_YM_TO
		取得先年月ＴＯ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_WORK (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_STK_EVAL_CD	IN MAPA_META.STK_EVAL_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	評価損登録時に使用するワークテーブルを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_STK_EVAL_CD
		在庫評価ＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

END MGPA_STK_EVAL ;
/
