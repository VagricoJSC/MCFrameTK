CREATE OR REPLACE PACKAGE MGPA_FIX_CHK
/**************************************************************************
<SYNOPSIS>
	標準単価確定チェック処理
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

FUNCTION F_DTL (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目詳細に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_BOM (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	ＢＯＭに関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_OPER (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目工程に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_WK (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目工数に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_PURC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目購買単価に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_PROC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目加工単価に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_PROV (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目支給単価に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_FIX (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目指値に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_ITM_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ITM_CD
		品目ＣＤ
<IN>	I_ITM_SUB1
		枝番１
<IN>	I_ITM_SUB2
		枝番２
<IN>	I_ITM_SUB3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_DTL_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目詳細情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_BOM_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	ＢＯＭ情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_OPER_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目工程情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_WK_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目工数情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_PURC_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目購買単価情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_PROC_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目加工単価情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_PROV_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目支給単価情報にあり標準単価が確定済みかチェックする。
<<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_FIX_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目指値情報にあり標準単価が確定済みかチェックする。
REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_ALC_RATE_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤで
	標準配賦率が確定済みのレコードが存在するかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_ALC_RULE_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	配賦方法マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_ALC_WK_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	工数配賦マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_ALC_EXPNS_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	費目配賦マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_ALC_INPT_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	投入配賦マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

FUNCTION F_ALC_OTHER_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	任意基準値配賦マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_TERM
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/

END MGPA_FIX_CHK ;
/
