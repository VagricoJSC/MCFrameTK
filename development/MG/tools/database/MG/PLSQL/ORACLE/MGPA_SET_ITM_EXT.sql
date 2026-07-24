CREATE OR REPLACE PACKAGE MGPA_SET_ITM_EXT
/**************************************************************************
<SYNOPSIS>
	ロットＮＯ、サブロットＮＯ、手配ＮＯ１ -> 手配ＮＯ４を拡張項目として扱い、
	品目拡張別に計算させるための処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_SET_ITM_EXT (
	I_ARG		MGT_ARG%ROWTYPE
) ;
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_ITMに品目拡張ごとの情報を追加する
	ロットＮＯ、サブロットＮＯ、手配ＮＯ１ -> 手配ＮＯ４を
	品目拡張に設定する
<REMARKS>
<ARGUMENTS>
<IN>	I_ARG
		対象となる原価計算設定情報のレコード
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_EXT_NULL (
	I_ARG		MGT_ARG%ROWTYPE
	, I_SQL_NO	IN	NUMBER DEFAULT NULL
) ;
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_ITMに追加したレコードを削除する
	品目拡張にロットＮＯ、サブロットＮＯ、手配ＮＯ１ -> 手配ＮＯ４を
	設定した箇所をNULL文字に変換する
<REMARKS>
<ARGUMENTS>
<IN>	I_ARG
		対象となる原価計算設定情報のレコード
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_EXT_NULL (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	I_ST_YM	IN	MAPA_META.YM%TYPE,
	I_SQL_NO	IN	NUMBER
) ;
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_ITMに追加したレコードを削除する
	品目拡張にロットＮＯ、サブロットＮＯ、手配ＮＯ１ -> 手配ＮＯ４を
	設定した箇所をNULL文字に変換する
<REMARKS>
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		対象となる計算グループＣＤ
<IN>	I_CALC_NO
		対象となる原価計算ＮＯ
<IN>	I_ST_YM
		対象となる対象期間先頭年月
<HISTORY>
**************************************************************************/
END MGPA_SET_ITM_EXT ;
/
