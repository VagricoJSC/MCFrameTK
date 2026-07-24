CREATE OR REPLACE PACKAGE MGPA_CALC_FIX
/**************************************************************************
<SYNOPSIS>
	原価計算ＮＯ確定処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

FUNCTION F_GET_CALC_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) RETURN MGT_CALC_FIX%ROWTYPE ;
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_FIXのレコードを返す
<REMARKS>
	存在しないときはエラーとなる
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	対象となるMGT_CALC_FIXのレコード
<HISTORY>
**************************************************************************/

FUNCTION F_CHK_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	確定済みのときは１、未確定のときは０を返す
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
**************************************************************************/

PROCEDURE P_CHK_FIX_CALC_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	計算グループＣＤ・年月に対して確定されており、
	確定対象の原価計算ＮＯが入力値の原価計算ＮＯと異なるときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<IN>	I_CALC_NO
		原価計算ＮＯ
**************************************************************************/

PROCEDURE P_LOCK (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定情報(MGT_CALC_FIX)に対するロック処理
<REMARKS>
	NOWAITでロックする
	対象となるデータが存在しないときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_INS_YM_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	年月別原価計算ＮＯデータを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/

PROCEDURE P_REMAKE_YM_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	削除されるデータをもとに年月別原価計算ＮＯデータを再作成する
<REMARKS>
	作成対象の年月で確定されている原価計算ＮＯで再作成する
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		削除対象となる原価計算ＮＯ
<IN>	I_YM
		作成対象となる年月
<HISTORY>
**************************************************************************/

PROCEDURE P_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_CANCEL (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定取消処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX_ACT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_MFG		IN MAPA_META.FLG%TYPE,
	I_PURC		IN MAPA_META.FLG%TYPE,
	I_INPT		IN MAPA_META.FLG%TYPE,
	I_INST_WK	IN MAPA_META.FLG%TYPE,
	I_OTHER_WK	IN MAPA_META.FLG%TYPE,
	I_INST_WIP	IN MAPA_META.FLG%TYPE,
	I_IO		IN MAPA_META.FLG%TYPE,
	I_SLS		IN MAPA_META.FLG%TYPE,
	I_STK		IN MAPA_META.FLG%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	実績データに対する確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_MFG
		製造実績 0:実行しない 1:実行する
<IN>	I_PURC
		購買実績 0:実行しない 1:実行する
<IN>	I_INPT
		投入実績 0:実行しない 1:実行する
<IN>	I_INST_WK
		指図工数実績 0:実行しない 1:実行する
<IN>	I_OTHER_WK
		指図外工数実績 0:実行しない 1:実行する
<IN>	I_INST_WIP
		指図仕掛実績 0:実行しない 1:実行する
<IN>	I_IO
		入出庫実績 0:実行しない 1:実行する
<IN>	I_SLS
		売上実績 0:実行しない 1:実行する
<IN>	I_STK
		在庫実績 0:実行しない 1:実行する
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX_ACT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_MFG		IN MAPA_META.FLG%TYPE,
	I_TRAN		IN MAPA_META.FLG%TYPE,
	I_STK		IN MAPA_META.FLG%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	実績データに対する確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_MFG
		製造実績関連(製造、購買、投入、工数、品目製造指図、指図工程) 0:実行しない 1:実行する
<IN>	I_TRAN
		入出庫関連(入出庫、売上) 0:実行しない 1:実行する
<IN>	I_STK
		在庫情報 0:実行しない 1:実行する
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX_ACT_AMT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	配賦費用実績データに対する確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX_PRE_ALC (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	一次配賦結果反映時の確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<HISTORY>
**************************************************************************/

END MGPA_CALC_FIX ;
/
