CREATE OR REPLACE PACKAGE MGPA_ARG
/**************************************************************************
<SYNOPSIS>
	原価計算設定情報関連ユーティリティ
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_SET_ARG (
	I_TERM		IN	MAPA_META.YM%TYPE,
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_ST_YM	IN	MAPA_META.YM%TYPE,
	I_END_YM	IN	MAPA_META.YM%TYPE,
	I_XRATE_CD	IN	MAPA_META.XRATE_CD%TYPE,
	I_ITM_LIMIT_FLG	IN	MAPA_META.FLG%TYPE,
	I_CHECK_FLG	IN	MAPA_META.FLG%TYPE,
	I_CARRY_FLG	IN	MAPA_META.FLG%TYPE,
	I_RMRKS	IN	MGPA_META.CALC_ARG_RMRKS%TYPE,
	I_SUB_CHAR1	IN	MGPA_META.CALC_ARG_SUB_CHAR1%TYPE,
	I_SUB_CHAR2	IN	MGPA_META.CALC_ARG_SUB_CHAR2%TYPE,
	I_SUB_CHAR3	IN	MGPA_META.CALC_ARG_SUB_CHAR3%TYPE,
	O_CALC_NO	OUT	MAPA_META.CALC_NO%TYPE,
	O_CALC_CNT	OUT	MGPA_META.CALC_CNT%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	MGT_ARG_USRに対するデータ作成を行う
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		対象期
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_ST_YM
		対象期間先頭月
<IN>	I_END_YM
		対象期間末尾月
<IN>	I_XRATE_CD
		為替レートＣＤ
<IN>	I_ITM_LIMIT_FLG
		品目指定ＦＬＧ
<IN>	I_CHECK_FLG
		データ確認計算ＦＬＧ
<IN>	I_CARRY_FLG
		繰越ＦＬＧ
<IN>	I_RMRKS
		備考
<IN>	I_SUB_CHAR1
		予備１
<IN>	I_SUB_CHAR2
		予備２
<IN>	I_SUB_CHAR3
		予備３
<OUT>	O_CALC_NO
		原価計算ＮＯ
<OUT>	O_CALC_CNT
		計算回数
<HISTORY>
**************************************************************************/

FUNCTION F_GET_ARG (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) RETURN MGT_ARG%ROWTYPE ;
/*********************************************************
<SYNOPSIS>
	MGT_ARGのレコードを返す
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<RETURNVALUE>
	対象となるMGT_ARGのレコード
<HISTORY>
**********************************************************/

PROCEDURE P_CALC_FIN (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	I_CALC_ERR_FLG	IN	MAPA_META.FLG%TYPE
) ;
/*********************************************************
<SYNOPSIS>
	計算終了処理
<REMARKS>
	MGT_ARG_USRからMGT_ARGにデータを作成する
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_CALC_ERR_FLG
		エラーＦＬＧ
<HISTORY>
**********************************************************/

PROCEDURE P_CALC_ERR (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/*********************************************************
<SYNOPSIS>
	計算エラー処理
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ

<HISTORY>
**********************************************************/

PROCEDURE P_CNT_UP (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/*********************************************************
<SYNOPSIS>
	計算回数のカウントアップ処理
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**********************************************************/

PROCEDURE P_SET_WORK (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	MGW_ARGに対するデータ作成を行う
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/

PROCEDURE P_LOCK (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	I_ERR_FLG	IN	MAPA_META.FLG%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	ロック処理
<REMARKS>
	NOWAITでロックする
	I_ERR_FLGが1となるときは対象となるデータが存在しないときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_ERR_FLG
		存在チェックＦＬＧ
<HISTORY>
**************************************************************************/

END MGPA_ARG ;
/
