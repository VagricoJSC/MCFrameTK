CREATE OR REPLACE PACKAGE MGPA_FIX_DEL
/**************************************************************************
<SYNOPSIS>
	原価情報取込対象から確定品目を削除する。
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_ITM_DTL (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目詳細取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_BOM (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価ＢＯＭ取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_OPER (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目工程取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_WK (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目工数取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_PURC (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目購買単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_PROC (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目加工単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_PROV (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目支給単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

END MGPA_FIX_DEL ;
/
