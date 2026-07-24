CREATE OR REPLACE PACKAGE MGPA_SCA
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_SCA0 (
	I_CO_CD		IN	MAPA_META.CO_CD%TYPE,
	I_USR_CD	IN	MAPA_META.USR_CD%TYPE,
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
) ;
/**************************************************************************
<SYNOPSIS>
	原価計算セッション設定処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CO_CD
		会社コード
<IN>	I_USR_CD
		ユーザコード
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/

PROCEDURE P_SCA1 (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
) ;
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン前処理
<REMARKS>
	マルチスレッドで実行されることもあるためセッションに関する情報のみ設定する。
	一時表を使用するためcommitは行ってはならない。
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/

PROCEDURE P_SCA2 (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
) ;
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン後処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/

END MGPA_SCA ;
/
