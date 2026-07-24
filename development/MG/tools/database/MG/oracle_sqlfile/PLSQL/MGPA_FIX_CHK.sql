SET SQLBLANKLINES ON

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
show errors;


CREATE OR REPLACE PACKAGE BODY MGPA_FIX_CHK
IS
	G_OK	CONSTANT MAPA_META.FLG%TYPE := '0' ;
	G_NG	CONSTANT MAPA_META.FLG%TYPE := '1' ;

	G_OFF	CONSTANT MAPA_META.FLG%TYPE := '0' ;
	G_ON	CONSTANT MAPA_META.FLG%TYPE := '1' ;

	G_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

FUNCTION F_DTL (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.ITM_CD = I_ITM_CD
	AND	t.ITM_SUB1 = I_ITM_SUB1
	AND	t.ITM_SUB2 = I_ITM_SUB2
	AND	t.ITM_SUB3 = I_ITM_SUB3
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
	    WHERE	0=0
	    AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
	    AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
	    AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
	    AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
	    AND	m2.CALC_CTG_CD = I_CALC_CTG_CD
	    AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_DTL
	    )
	AND	ROWNUM = 1
	;

	IF I_WG_CD = G_NULL_VAL AND L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_STD_FIX t
		WHERE	0=0
		AND	t.ITM_CD = I_ITM_CD
		AND	t.ITM_SUB1 = I_ITM_SUB1
		AND	t.ITM_SUB2 = I_ITM_SUB2
		AND	t.ITM_SUB3 = I_ITM_SUB3
		AND	t.TERM = I_TERM
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MGT_CALC_ITM_DTL x
				WHERE	0=0
				AND	x.CALC_NO = t.CALC_NO
				AND	x.CALC_GRP_CD = t.CALC_GRP_CD
				AND	x.ITM_CD = t.ITM_CD
				AND	x.ITM_SUB1 = t.ITM_SUB1
				AND	x.ITM_SUB2 = t.ITM_SUB2
				AND	x.ITM_SUB3 = t.ITM_SUB3
				AND	x.WG_CD = t.WG_CD
				AND	x.CALC_CTG_CD = I_CALC_CTG_CD
		)
		;
	END IF ;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_DTL ;

FUNCTION F_BOM (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.ITM_CD = I_ITM_CD
	AND	t.ITM_SUB1 = I_ITM_SUB1
	AND	t.ITM_SUB2 = I_ITM_SUB2
	AND	t.ITM_SUB3 = I_ITM_SUB3
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
			WHERE	0=0
			AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
			AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
			AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
			AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
			AND	m2.CALC_CTG_CD = I_CALC_CTG_CD
			AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.BOM
		)
	AND	ROWNUM = 1
	;

	IF I_WG_CD = G_NULL_VAL AND L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_STD_FIX t
		WHERE	0=0
		AND	t.ITM_CD = I_ITM_CD
		AND	t.ITM_SUB1 = I_ITM_SUB1
		AND	t.ITM_SUB2 = I_ITM_SUB2
		AND	t.ITM_SUB3 = I_ITM_SUB3
		AND	t.TERM = I_TERM
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MGT_CALC_BOM x
				WHERE	0=0
				AND	x.CALC_NO = t.CALC_NO
				AND	x.CALC_GRP_CD = t.CALC_GRP_CD
				AND	x.PAR_ITM_CD = t.ITM_CD
				AND	x.PAR_ITM_SUB1 = t.ITM_SUB1
				AND	x.PAR_ITM_SUB2 = t.ITM_SUB2
				AND	x.PAR_ITM_SUB3 = t.ITM_SUB3
				AND	x.WG_CD = t.WG_CD
				AND	x.CALC_CTG_CD = I_CALC_CTG_CD
			)
		;
	END IF ;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_BOM ;

FUNCTION F_OPER (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.ITM_CD = I_ITM_CD
	AND	t.ITM_SUB1 = I_ITM_SUB1
	AND	t.ITM_SUB2 = I_ITM_SUB2
	AND	t.ITM_SUB3 = I_ITM_SUB3
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
			WHERE	0=0
			AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
			AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
			AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
			AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
			AND	m2.CALC_CTG_CD = I_CALC_CTG_CD
			AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_OPER
		)
	AND	ROWNUM = 1
	;

	IF I_WG_CD = G_NULL_VAL AND L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_STD_FIX t
		WHERE	0=0
		AND	t.ITM_CD = I_ITM_CD
		AND	t.ITM_SUB1 = I_ITM_SUB1
		AND	t.ITM_SUB2 = I_ITM_SUB2
		AND	t.ITM_SUB3 = I_ITM_SUB3
		AND	t.TERM = I_TERM
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MGT_CALC_ITM_OPER x
				WHERE	0=0
				AND	x.CALC_NO = t.CALC_NO
				AND	x.CALC_GRP_CD = t.CALC_GRP_CD
				AND	x.ITM_CD = t.ITM_CD
				AND	x.ITM_SUB1 = t.ITM_SUB1
				AND	x.ITM_SUB2 = t.ITM_SUB2
				AND	x.ITM_SUB3 = t.ITM_SUB3
				AND	x.WG_CD = t.WG_CD
				AND	x.CALC_CTG_CD = I_CALC_CTG_CD
			)
		;
	END IF ;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_OPER ;

FUNCTION F_WK (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.ITM_CD = I_ITM_CD
	AND	t.ITM_SUB1 = I_ITM_SUB1
	AND	t.ITM_SUB2 = I_ITM_SUB2
	AND	t.ITM_SUB3 = I_ITM_SUB3
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
			WHERE	0=0
			AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
			AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
			AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
			AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
			AND	m2.CALC_CTG_CD = I_CALC_CTG_CD
			AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_WK
		)
	AND	ROWNUM = 1
	;

	IF I_WG_CD = G_NULL_VAL AND L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_STD_FIX t
		WHERE	0=0
		AND	t.ITM_CD = I_ITM_CD
		AND	t.ITM_SUB1 = I_ITM_SUB1
		AND	t.ITM_SUB2 = I_ITM_SUB2
		AND	t.ITM_SUB3 = I_ITM_SUB3
		AND	t.TERM = I_TERM
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MGT_CALC_ITM_WK x
				WHERE	0=0
				AND	x.CALC_NO = t.CALC_NO
				AND	x.CALC_GRP_CD = t.CALC_GRP_CD
				AND	x.ITM_CD = t.ITM_CD
				AND	x.ITM_SUB1 = t.ITM_SUB1
				AND	x.ITM_SUB2 = t.ITM_SUB2
				AND	x.ITM_SUB3 = t.ITM_SUB3
				AND	x.WG_CD = t.WG_CD
				AND	x.CALC_CTG_CD = I_CALC_CTG_CD
			)
		;
	END IF ;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_WK ;

FUNCTION F_PURC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.ITM_CD = I_ITM_CD
	AND	t.ITM_SUB1 = I_ITM_SUB1
	AND	t.ITM_SUB2 = I_ITM_SUB2
	AND	t.ITM_SUB3 = I_ITM_SUB3
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
			WHERE	0=0
			AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
			AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
			AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
			AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
			AND	m2.CALC_CTG_CD = I_CALC_CTG_CD
			AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PURC
		)
	AND	ROWNUM = 1
	;

	IF I_WG_CD = G_NULL_VAL AND L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_STD_FIX t
		WHERE	0=0
		AND	t.ITM_CD = I_ITM_CD
		AND	t.ITM_SUB1 = I_ITM_SUB1
		AND	t.ITM_SUB2 = I_ITM_SUB2
		AND	t.ITM_SUB3 = I_ITM_SUB3
		AND	t.TERM = I_TERM
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MGT_CALC_ITM_PURC x
				WHERE	0=0
				AND	x.CALC_NO = t.CALC_NO
				AND	x.CALC_GRP_CD = t.CALC_GRP_CD
				AND	x.ITM_CD = t.ITM_CD
				AND	x.ITM_SUB1 = t.ITM_SUB1
				AND	x.ITM_SUB2 = t.ITM_SUB2
				AND	x.ITM_SUB3 = t.ITM_SUB3
				AND	x.WG_CD = t.WG_CD
				AND	x.CALC_CTG_CD = I_CALC_CTG_CD
			)
		;
	END IF ;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_PURC ;

FUNCTION F_PROC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.ITM_CD = I_ITM_CD
	AND	t.ITM_SUB1 = I_ITM_SUB1
	AND	t.ITM_SUB2 = I_ITM_SUB2
	AND	t.ITM_SUB3 = I_ITM_SUB3
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
			WHERE	0=0
			AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
			AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
			AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
			AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
			AND	m2.CALC_CTG_CD = I_CALC_CTG_CD
			AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PROC
		)
	AND	ROWNUM = 1
	;

	IF I_WG_CD = G_NULL_VAL AND L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_STD_FIX t
		WHERE	0=0
		AND	t.ITM_CD = I_ITM_CD
		AND	t.ITM_SUB1 = I_ITM_SUB1
		AND	t.ITM_SUB2 = I_ITM_SUB2
		AND	t.ITM_SUB3 = I_ITM_SUB3
		AND	t.TERM = I_TERM
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MGT_CALC_ITM_PROC x
				WHERE	0=0
				AND	x.CALC_NO = t.CALC_NO
				AND	x.CALC_GRP_CD = t.CALC_GRP_CD
				AND	x.ITM_CD = t.ITM_CD
				AND	x.ITM_SUB1 = t.ITM_SUB1
				AND	x.ITM_SUB2 = t.ITM_SUB2
				AND	x.ITM_SUB3 = t.ITM_SUB3
				AND	x.WG_CD = t.WG_CD
				AND	x.CALC_CTG_CD = I_CALC_CTG_CD
			)
		;
	END IF ;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_PROC ;

FUNCTION F_PROV (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.ITM_CD = I_ITM_CD
	AND	t.ITM_SUB1 = I_ITM_SUB1
	AND	t.ITM_SUB2 = I_ITM_SUB2
	AND	t.ITM_SUB3 = I_ITM_SUB3
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
			WHERE	0=0
			AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
			AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
			AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
			AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
			AND	m2.CALC_CTG_CD = I_CALC_CTG_CD
			AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PROV
		)
	AND	ROWNUM = 1
	;

	IF I_WG_CD = G_NULL_VAL AND L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_STD_FIX t
		WHERE	0=0
		AND	t.ITM_CD = I_ITM_CD
		AND	t.ITM_SUB1 = I_ITM_SUB1
		AND	t.ITM_SUB2 = I_ITM_SUB2
		AND	t.ITM_SUB3 = I_ITM_SUB3
		AND	t.TERM = I_TERM
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MGT_CALC_ITM_PROV x
				WHERE	0=0
				AND	x.CALC_NO = t.CALC_NO
				AND	x.CALC_GRP_CD = t.CALC_GRP_CD
				AND	x.ITM_CD = t.ITM_CD
				AND	x.ITM_SUB1 = t.ITM_SUB1
				AND	x.ITM_SUB2 = t.ITM_SUB2
				AND	x.ITM_SUB3 = t.ITM_SUB3
				AND	x.WG_CD = t.WG_CD
				AND	x.CALC_CTG_CD = I_CALC_CTG_CD
			)
		;
	END IF ;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_PROV ;

FUNCTION F_FIX (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.ITM_CD = I_ITM_CD
	AND	t.ITM_SUB1 = I_ITM_SUB1
	AND	t.ITM_SUB2 = I_ITM_SUB2
	AND	t.ITM_SUB3 = I_ITM_SUB3
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
			WHERE	0=0
			AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
			AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
			AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
			AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
			AND	m2.CALC_CTG_CD = I_CALC_CTG_CD
			AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_FIX
		)
	AND	ROWNUM = 1
	;

	IF I_WG_CD = G_NULL_VAL AND L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_STD_FIX t
		WHERE	0=0
		AND	t.ITM_CD = I_ITM_CD
		AND	t.ITM_SUB1 = I_ITM_SUB1
		AND	t.ITM_SUB2 = I_ITM_SUB2
		AND	t.ITM_SUB3 = I_ITM_SUB3
		AND	t.TERM = I_TERM
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MGT_CALC_ITM_FIX x
				WHERE	0=0
				AND	x.CALC_NO = t.CALC_NO
				AND	x.CALC_GRP_CD = t.CALC_GRP_CD
				AND	x.ITM_CD = t.ITM_CD
				AND	x.ITM_SUB1 = t.ITM_SUB1
				AND	x.ITM_SUB2 = t.ITM_SUB2
				AND	x.ITM_SUB3 = t.ITM_SUB3
				AND	x.WG_CD = t.WG_CD
				AND	x.CALC_CTG_CD = I_CALC_CTG_CD
			)
		;
	END IF ;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_FIX ;

FUNCTION F_ITM_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE,
	I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
	I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
	I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
	I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_ITM m
	WHERE	0=0
	AND	(m.ITM_CD = I_ITM_CD OR I_ITM_CD IS NULL)
	AND	(m.ITM_SUB1 = I_ITM_SUB1 OR I_ITM_SUB1 IS NULL)
	AND	(m.ITM_SUB2 = I_ITM_SUB2 OR I_ITM_SUB2 IS NULL)
	AND	(m.ITM_SUB3 = I_ITM_SUB3 OR I_ITM_SUB3 IS NULL)
	AND	m.TERM = I_TERM
	AND	m.CALC_CTG_CD = I_CALC_CTG_CD
	AND	m.WG_CD = I_WG_CD
	AND	m.FIX_FLG = G_ON
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_ITM_M ;

FUNCTION F_DTL_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_CALC_ITM_DTL x
			WHERE	0=0
			AND	x.CALC_NO = t.CALC_NO
			AND	x.CALC_GRP_CD = t.CALC_GRP_CD
			AND	x.ITM_CD = t.ITM_CD
			AND	x.ITM_SUB1 = t.ITM_SUB1
			AND	x.ITM_SUB2 = t.ITM_SUB2
			AND	x.ITM_SUB3 = t.ITM_SUB3
			AND	x.WG_CD = I_WG_CD
			AND	EXISTS (
					SELECT	'X'
					FROM	MGT_ITM_DTL m
					WHERE	0=0
					AND	m.ITM_CD = x.ITM_CD
					AND	m.ITM_SUB1 = x.ITM_SUB1
					AND	m.ITM_SUB2 = x.ITM_SUB2
					AND	m.ITM_SUB3 = x.ITM_SUB3
					AND	m.LOC_CD = x.LOC_CD
					AND	m.SPPL_CD = x.SPPL_CD
					AND	m.RQST_WG_CD = x.RQST_WG_CD
					AND	m.CALC_CTG_CD = x.CALC_CTG_CD
					AND	m.WG_CD = I_WG_CD
					AND	m.TERM = I_TERM
					AND	m.CALC_CTG_CD = I_CALC_CTG_CD
				)
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_DTL_M ;

FUNCTION F_BOM_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_CALC_BOM x
			WHERE	0=0
			AND	x.CALC_NO = t.CALC_NO
			AND	x.CALC_GRP_CD = t.CALC_GRP_CD
			AND	x.PAR_ITM_CD = t.ITM_CD
			AND	x.PAR_ITM_SUB1 = t.ITM_SUB1
			AND	x.PAR_ITM_SUB2 = t.ITM_SUB2
			AND	x.PAR_ITM_SUB3 = t.ITM_SUB3
			AND	x.WG_CD = I_WG_CD
			AND	EXISTS (
					SELECT	'X'
					FROM	MGT_BOM m
					WHERE	0=0
					AND	m.PAR_ITM_CD = x.PAR_ITM_CD
					AND	m.PAR_ITM_SUB1 = x.PAR_ITM_SUB1
					AND	m.PAR_ITM_SUB2 = x.PAR_ITM_SUB2
					AND	m.PAR_ITM_SUB3 = x.PAR_ITM_SUB3
					AND	m.BOM_PTN = x.BOM_PTN
					AND	(m.OPER_CD = x.OPER_CD OR m.OPER_CD IS NULL AND x.OPER_CD IS NULL)
					AND	(m.OPER_SEQ = x.OPER_SEQ OR m.OPER_SEQ IS NULL AND x.OPER_SEQ IS NULL)
					AND	m.CHD_ITM_CD = x.CHD_ITM_CD
					AND	m.CHD_ITM_SUB1 = x.CHD_ITM_SUB1
					AND	m.CHD_ITM_SUB2 = x.CHD_ITM_SUB2
					AND	m.CHD_ITM_SUB3 = x.CHD_ITM_SUB3
					AND	(m.ALT_GRP_CD = x.ALT_GRP_CD OR m.ALT_GRP_CD IS NULL AND x.ALT_GRP_CD IS NULL)
					AND	(m.EXPNS_CD = x.EXPNS_CD OR m.EXPNS_CD IS NULL AND x.EXPNS_CD IS NULL)
					AND	m.CALC_CTG_CD = x.CALC_CTG_CD
					AND	m.WG_CD = I_WG_CD
					AND	m.TERM = I_TERM
					AND	m.CALC_CTG_CD = I_CALC_CTG_CD
				)
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_BOM_M ;

FUNCTION F_OPER_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_CALC_ITM_OPER x
			WHERE	0=0
			AND	x.CALC_NO = t.CALC_NO
			AND	x.CALC_GRP_CD = t.CALC_GRP_CD
			AND	x.ITM_CD = t.ITM_CD
			AND	x.ITM_SUB1 = t.ITM_SUB1
			AND	x.ITM_SUB2 = t.ITM_SUB2
			AND	x.ITM_SUB3 = t.ITM_SUB3
			AND	x.WG_CD = I_WG_CD
			AND	EXISTS (
					SELECT	'X'
					FROM	MGT_ITM_OPER m
					WHERE	0=0
					AND	m.ITM_CD = x.ITM_CD
					AND	m.ITM_SUB1 = x.ITM_SUB1
					AND	m.ITM_SUB2 = x.ITM_SUB2
					AND	m.ITM_SUB3 = x.ITM_SUB3
					AND	m.LOC_CD = x.LOC_CD
					AND	m.OPER_PTN = x.OPER_PTN
					AND	m.OPER_CD = x.OPER_CD
					AND	m.OPER_SEQ = x.OPER_SEQ
					AND	m.CALC_CTG_CD = x.CALC_CTG_CD
					AND	m.WG_CD = I_WG_CD
					AND	m.TERM = I_TERM
					AND	m.CALC_CTG_CD = I_CALC_CTG_CD
				)
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_OPER_M ;

FUNCTION F_WK_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_CALC_ITM_WK x
			WHERE	0=0
			AND	x.CALC_NO = t.CALC_NO
			AND	x.CALC_GRP_CD = t.CALC_GRP_CD
			AND	x.ITM_CD = t.ITM_CD
			AND	x.ITM_SUB1 = t.ITM_SUB1
			AND	x.ITM_SUB2 = t.ITM_SUB2
			AND	x.ITM_SUB3 = t.ITM_SUB3
			AND	x.WG_CD = I_WG_CD
			AND	EXISTS (
					SELECT	'X'
					FROM	MGT_ITM_WK m
					WHERE	0=0
					AND	m.ITM_CD = x.ITM_CD
					AND	m.ITM_SUB1 = x.ITM_SUB1
					AND	m.ITM_SUB2 = x.ITM_SUB2
					AND	m.ITM_SUB3 = x.ITM_SUB3
					AND	m.LOC_CD = x.LOC_CD
					AND	m.OPER_PTN = x.OPER_PTN
					AND	m.OPER_CD = x.OPER_CD
					AND	m.OPER_SEQ = x.OPER_SEQ
					AND	m.WK_COST_CD = x.WK_COST_CD
					AND	m.CALC_CTG_CD = x.CALC_CTG_CD
					AND	m.WG_CD = I_WG_CD
					AND	m.TERM = I_TERM
					AND	m.CALC_CTG_CD = I_CALC_CTG_CD
				)
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_WK_M ;

FUNCTION F_PURC_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_CALC_ITM_PURC x
			WHERE	0=0
			AND	x.CALC_NO = t.CALC_NO
			AND	x.CALC_GRP_CD = t.CALC_GRP_CD
			AND	x.ITM_CD = t.ITM_CD
			AND	x.ITM_SUB1 = t.ITM_SUB1
			AND	x.ITM_SUB2 = t.ITM_SUB2
			AND	x.ITM_SUB3 = t.ITM_SUB3
			AND	x.WG_CD = I_WG_CD
			AND	EXISTS (
					SELECT	'X'
					FROM	MGT_ITM_PURC m
					WHERE	0=0
					AND	m.ITM_CD = x.ITM_CD
					AND	m.ITM_SUB1 = x.ITM_SUB1
					AND	m.ITM_SUB2 = x.ITM_SUB2
					AND	m.ITM_SUB3 = x.ITM_SUB3
					AND	m.SPPL_CD = x.SPPL_CD
					AND	m.CALC_CTG_CD = x.CALC_CTG_CD
					AND	m.WG_CD = I_WG_CD
					AND	m.TERM = I_TERM
					AND	m.CALC_CTG_CD = I_CALC_CTG_CD
				)
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_PURC_M ;

FUNCTION F_PROC_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_CALC_ITM_PROC x
			WHERE	0=0
			AND	x.CALC_NO = t.CALC_NO
			AND	x.CALC_GRP_CD = t.CALC_GRP_CD
			AND	x.ITM_CD = t.ITM_CD
			AND	x.ITM_SUB1 = t.ITM_SUB1
			AND	x.ITM_SUB2 = t.ITM_SUB2
			AND	x.ITM_SUB3 = t.ITM_SUB3
			AND	x.WG_CD = I_WG_CD
			AND	EXISTS (
					SELECT	'X'
					FROM	MGT_ITM_PROC m
					WHERE	0=0
					AND	m.ITM_CD = x.ITM_CD
					AND	m.ITM_SUB1 = x.ITM_SUB1
					AND	m.ITM_SUB2 = x.ITM_SUB2
					AND	m.ITM_SUB3 = x.ITM_SUB3
					AND	m.SPPL_CD = x.SPPL_CD
					AND	m.CALC_CTG_CD = x.CALC_CTG_CD
					AND	m.WG_CD = I_WG_CD
					AND	m.TERM = I_TERM
					AND	m.CALC_CTG_CD = I_CALC_CTG_CD
				)
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_PROC_M ;

FUNCTION F_PROV_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目支給単価情報にあり標準単価が確定済みかチェックする。
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_CALC_ITM_PROV x
			WHERE	0=0
			AND	x.CALC_NO = t.CALC_NO
			AND	x.CALC_GRP_CD = t.CALC_GRP_CD
			AND	x.ITM_CD = t.ITM_CD
			AND	x.ITM_SUB1 = t.ITM_SUB1
			AND	x.ITM_SUB2 = t.ITM_SUB2
			AND	x.ITM_SUB3 = t.ITM_SUB3
			AND	x.WG_CD = I_WG_CD
			AND	EXISTS (
					SELECT	'X'
					FROM	MGT_ITM_PROV m
					WHERE	0=0
					AND	m.ITM_CD = x.ITM_CD
					AND	m.ITM_SUB1 = x.ITM_SUB1
					AND	m.ITM_SUB2 = x.ITM_SUB2
					AND	m.ITM_SUB3 = x.ITM_SUB3
					AND	m.PRSPPL_CD = x.PRSPPL_CD
					AND	m.CALC_CTG_CD = x.CALC_CTG_CD
					AND	m.WG_CD = I_WG_CD
					AND	m.TERM = I_TERM
					AND	m.CALC_CTG_CD = I_CALC_CTG_CD
				)
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_PROV_M ;

FUNCTION F_FIX_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目指値情報にあり標準単価が確定済みかチェックする。
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	(I_WG_CD = G_NULL_VAL OR t.WG_CD = I_WG_CD)
	AND	EXISTS (
			SELECT	'X'
			FROM	MGT_CALC_ITM_FIX x
			WHERE	0=0
			AND	x.CALC_NO = t.CALC_NO
			AND	x.CALC_GRP_CD = t.CALC_GRP_CD
			AND	x.ITM_CD = t.ITM_CD
			AND	x.ITM_SUB1 = t.ITM_SUB1
			AND	x.ITM_SUB2 = t.ITM_SUB2
			AND	x.ITM_SUB3 = t.ITM_SUB3
			AND	x.WG_CD = I_WG_CD
			AND	EXISTS (
					SELECT	'X'
					FROM	MGT_ITM_FIX m
					WHERE	0=0
					AND	m.ITM_CD = x.ITM_CD
					AND	m.ITM_SUB1 = x.ITM_SUB1
					AND	m.ITM_SUB2 = x.ITM_SUB2
					AND	m.ITM_SUB3 = x.ITM_SUB3
					AND	m.EXPNS_CD = x.EXPNS_CD
					AND	m.CALC_CTG_CD = x.CALC_CTG_CD
					AND	m.WG_CD = I_WG_CD
					AND	m.TERM = I_TERM
					AND	m.CALC_CTG_CD = I_CALC_CTG_CD
				)
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_FIX_M ;

FUNCTION F_ALC_RATE_M (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD	IN MAPA_META.WG_CD%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_ALC_RATE m
	WHERE	0=0
	AND	m.TERM = I_TERM
	AND	m.CALC_CTG_CD = I_CALC_CTG_CD
	AND	m.WG_CD = I_WG_CD
	AND	m.FIX_FLG = G_ON
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_ALC_RATE_M ;

FUNCTION F_ALC_RULE_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_ALC_RATE m
	WHERE	0=0
	AND	m.TERM = I_TERM
	AND	m.FIX_FLG = G_ON
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_ALC_RULE x
			WHERE	0=0
			AND	x.ALC_PTN_CD = m.FIX_ALC_PTN_CD
			AND	x.TERM = m.TERM
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_ALC_RULE_M ;

FUNCTION F_ALC_WK_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_ALC_RATE m
	WHERE	0=0
	AND	m.TERM = I_TERM
	AND	m.FIX_FLG = G_ON
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_ALC_WK x
			WHERE	0=0
			AND	x.ALC_PTN_CD = m.FIX_ALC_PTN_CD
			AND	x.TERM = m.TERM
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_ALC_WK_M ;

FUNCTION F_ALC_EXPNS_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_ALC_RATE m
	WHERE	0=0
	AND	m.TERM = I_TERM
	AND	m.FIX_FLG = G_ON
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_ALC_EXPNS x
			WHERE	0=0
			AND	x.ALC_PTN_CD = m.FIX_ALC_PTN_CD
			AND	x.TERM = m.TERM
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_ALC_EXPNS_M ;

FUNCTION F_ALC_INPT_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_ALC_RATE m
	WHERE	0=0
	AND	m.TERM = I_TERM
	AND	m.FIX_FLG = G_ON
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_ALC_INPT x
			WHERE	0=0
			AND	x.ALC_PTN_CD = m.FIX_ALC_PTN_CD
			AND	x.TERM = m.TERM
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_ALC_INPT_M ;

FUNCTION F_ALC_OTHER_M (
	I_TERM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE
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
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_ALC_RATE m
	WHERE	0=0
	AND	m.TERM = I_TERM
	AND	m.FIX_FLG = G_ON
	AND	EXISTS (
			SELECT	'X'
			FROM	MAM_ALC_OTHER x
			WHERE	0=0
			AND	x.ALC_PTN_CD = m.FIX_ALC_PTN_CD
			AND	x.TERM = m.TERM
		)
	AND	ROWNUM = 1
	;

	IF L_CNT = 0 THEN
		RETURN G_OK ;
	ELSE
		RETURN G_NG ;
	END IF ;
END F_ALC_OTHER_M ;

END MGPA_FIX_CHK ;

/
show errors;


