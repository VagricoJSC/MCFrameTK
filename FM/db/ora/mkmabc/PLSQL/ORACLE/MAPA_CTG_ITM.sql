CREATE OR REPLACE PACKAGE MAPA_CTG_ITM
/**************************************************************************
<SYNOPSIS>
	原価品群品目ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_SET_CTG_ITM (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品目ＣＤをMAW_CTG_ITMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_CD
		原価品群ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_CTG_GRP_ITM (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_GRP_CD	IN MAPA_META.CTG_GRP_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_ITMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_GRP_CD
		品群グループＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_CTG_CTG (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品群ＣＤをMAW_CTG_CTGに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_CD
		原価品群ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_CTG_GRP_CTG (
	I_TERM		IN MAPA_META.YM%TYPE,
	I_CTG_GRP_CD	IN MAPA_META.CTG_GRP_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_CTGを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_TERM
		期
<IN>
	I_CTG_GRP_CD
		品群グループＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_CTG_ITM_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群ＣＤに属する品目ＣＤをMAW_CTG_ITM_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_CTG_CD
		原価品群ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_CTG_GRP_ITM_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CTG_GRP_CD	IN MAPA_META.CTG_GRP_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_ITM_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_CTG_GRP_CD
		品群グループＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_CTG_CTG_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CTG_CD	IN MAPA_META.COST_CTG_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群ＣＤに属する品群ＣＤをMAW_CTG_CTG_YMに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_CTG_CD
		原価品群ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_CTG_GRP_CTG_YM (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CTG_GRP_CD	IN MAPA_META.CTG_GRP_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_CTG_YMを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	I_YM_FROM
		作成年月Ｆｒｏｍ
<IN>
	I_YM_TO
		作成年月Ｔｏ
<IN>
	I_CTG_GRP_CD
		品群グループＣＤ
<HISTORY>
**************************************************************************/

END MAPA_CTG_ITM ;
/
