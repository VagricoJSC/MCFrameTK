CREATE OR REPLACE PACKAGE MGPA_ITM_FIX
/**************************************************************************
<SYNOPSIS>
	標準単価確定・解除処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_FIX (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	標準単価確定処理
<REMARKS>

<ARGUMENTS>
<IN> I_CALC_GRP_CD
	計算グループＣＤ
<IN> I_CALC_NO
	原価計算ＮＯ
<HISTORY>
**************************************************************************/

PROCEDURE P_BULK_FIX (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	I_WG_CD		IN	MAPA_META.WG_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	標準単価一括確定処理
<REMARKS>

<ARGUMENTS>
<IN> I_CALC_GRP_CD
	計算グループＣＤ
<IN> I_CALC_NO
	原価計算ＮＯ
<IN> I_WG_CD
	ワーキンググループＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_CANCEL (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	標準単価解除処理
<REMARKS>

<ARGUMENTS>
<IN> I_CALC_GRP_CD
	計算グループＣＤ
<IN> I_CALC_NO
	原価計算ＮＯ
<HISTORY>
**************************************************************************/

PROCEDURE P_BULK_CANCEL (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	I_WG_CD		IN	MAPA_META.WG_CD%TYPE,
	I_TERM		IN	MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	標準単価一括解除処理
<REMARKS>
	原価計算ＮＯもしくは期のいずれかは必須
<ARGUMENTS>
<IN> I_CALC_GRP_CD
	計算グループＣＤ
<IN> I_CALC_NO
	原価計算ＮＯ
<IN> I_WG_CD
	ワーキンググループＣＤ
<IN> I_TERM
	期
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_RATE_CANCEL (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	標準配賦率の確定解除チェック
<REMARKS>

<ARGUMENTS>
<IN> I_CALC_GRP_CD
	計算グループＣＤ
<IN> I_CALC_NO
	原価計算ＮＯ
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_RATE_FIX (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	標準配賦率の確定チェック
<REMARKS>

<ARGUMENTS>
<IN> I_CALC_GRP_CD
	計算グループＣＤ
<IN> I_CALC_NO
	原価計算ＮＯ
<HISTORY>
**************************************************************************/

END MGPA_ITM_FIX ;
/
