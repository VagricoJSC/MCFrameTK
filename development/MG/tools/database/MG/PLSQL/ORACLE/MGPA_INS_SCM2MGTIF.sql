CREATE OR REPLACE PACKAGE MGPA_INS_SCM2MGTIF
/************************************************************************
<SYNOPSIS>
	ＳＣＭのテーブルからMGT_ACT_XXX_IFへ実績を取り込む
<REMARKS>

<ARGUMENTS>
<HISTORY>
*************************************************************************/
IS
PROCEDURE P_IF (
	I_YM		IN	MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN	MAPA_META.CALC_CTG_CD%TYPE,
	I_IO		IN	MAPA_META.FLG%TYPE,
	I_WK		IN	MAPA_META.FLG%TYPE,
	I_WIP		IN	MAPA_META.FLG%TYPE,
	I_STK		IN	MAPA_META.FLG%TYPE,
	I_RERUN		IN	MAPA_META.FLG%TYPE,
	I_NON_MOV	IN	MAPA_META.FLG%TYPE DEFAULT '0'
) ;
/************************************************************************
<SYNOPSIS>
		ＳＣＭのテーブルからMGT_ACT_XXX_IFへ実績を取り込む
<REMARKS>
		ＳＣＭのテーブルからMGT_ACT_XXX_IFへ実績を取り込む
<ARGUMENTS>
<IN>	I_YM
		対象年月
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_IO
		受払実績 0:実行しない 1:実行する
<IN>	I_WK
		作業実績 0:実行しない 1:実行する
<IN>	I_WIP
		仕掛実績 0:実行しない 1:実行する
<IN>	I_STK
		在庫情報 0:実行しない 1:実行する
<IN>	I_RERUN
		0:追加処理 1:再取込
<HISTORY>
*************************************************************************/

FUNCTION F_GET_MSC_IO_ACT_TYP_IO_TYP (
	I_IO_ACT_TYP IN VARCHAR2
)
RETURN VARCHAR2 ;
/************************************************************************
<SYNOPSIS>
	ＭＳモジュールの受払区分の属性値IO_TYPを取得する
<REMARKS>
	ＭＳモジュールが存在しているときのみ取得される
<ARGUMENTS>
<IN>	I_IO_ACT_TYP
		受払区分
<RETURN VALUE>
		MSC_IO_ACT_TYP.IO_TYPの結果
<HISTORY>
*************************************************************************/

END MGPA_INS_SCM2MGTIF ;
/
