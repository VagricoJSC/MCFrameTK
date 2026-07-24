CREATE OR REPLACE PACKAGE MGPA_INS_MGTIF2MGT
/************************************************************************
<SYNOPSIS>
	MGT_ACT_XXX_IFからMGT_ACT_XXXへ実績を取り込む
<REMARKS>

<ARGUMENTS>
<HISTORY>
*************************************************************************/
IS
PROCEDURE P_IF (
	I_CALC_CTG	IN	MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN	MAPA_META.WG_CD%TYPE,
	I_YM		IN	MAPA_META.YM%TYPE,
	I_MFG		IN	MAPA_META.FLG%TYPE,
	I_TRAN		IN	MAPA_META.FLG%TYPE,
	I_STK		IN	MAPA_META.FLG%TYPE,
	I_DEL		IN	MAPA_META.FLG%TYPE
) ;
/************************************************************************
<SYNOPSIS>
	MGT_ACT_XXX_IFからMGT_ACT_XXXへ実績を取り込む
	I_DELが設定されているときは対象データの削除処理を行う
<REMARKS>
	原価品目情報は必須 原価品目情報にないと取り込めない
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		対象年月
<IN>	I_MFG
		製造実績関連(製造、購買、投入、工数) 0:実行しない 1:実行する
<IN>	I_TRAN
		入出庫関連(入出庫、売上) 0:実行しない 1:実行する
<IN>	I_STK
		在庫情報 0:実行しない 1:実行する
<IN>	I_DEL
		削除 0:取込処理を実行 1:削除処理を実行
<HISTORY>
*************************************************************************/

END MGPA_INS_MGTIF2MGT ;
/
