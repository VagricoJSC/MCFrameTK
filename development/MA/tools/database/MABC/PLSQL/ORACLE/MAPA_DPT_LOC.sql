CREATE OR REPLACE PACKAGE MAPA_DPT_LOC
/**************************************************************************
<SYNOPSIS>
	原価部門工程ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_SET_DPT_LOC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する場所・工程ＣＤをMAW_DPT_LOCに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LVL_LOC (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_LOCを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_DPT (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する部門ＣＤをMAW_DPT_DPTに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LVL_DPT (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_DPTを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LOC_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門ＣＤに属する場所・工程ＣＤをMAW_DPT_LOC_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LVL_LOC_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_LOC_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_DPT_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_CD	IN MAPA_META.COST_DPT_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門ＣＤに属する部門ＣＤをMAW_DPT_DPT_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_CD
		原価部門ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_DPT_LVL_DPT_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_DPT_LVL_CD	IN MAPA_META.DPT_LVL_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門階層ＣＤに属する部門ＣＤに対してMAW_DPT_DPT_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_DPT_LVL_CD
		部門階層ＣＤ
<HISTORY>
**************************************************************************/

END MAPA_DPT_LOC ;
/
