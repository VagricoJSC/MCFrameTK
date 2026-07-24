CREATE OR REPLACE PACKAGE MGPA_SET_EXPNS
/************************************************************************
<SYNOPSIS>
	投入/入出庫/売上実績費目別原価に金額をセットする
<REMARKS>
<ARGUMENTS>
<HISTORY>
*************************************************************************/
IS
PROCEDURE P_INPT (
	I_ERR_FLG IN MAPA_META.FLG%TYPE DEFAULT '1'
	)
;
/************************************************************************
<SYNOPSIS>
	投入実績費目別原価に金額をセットする
<REMARKS>
	事前にMGW_EXPNS_INPTを作成しておく必要がある
<ARGUMENTS>
<IN>	I_ERR_FLG
		エラーＦＬＧ
<HISTORY>
*************************************************************************/

PROCEDURE P_IO (
	I_ERR_FLG IN MAPA_META.FLG%TYPE DEFAULT '1'
	)
;
/************************************************************************
<SYNOPSIS>
	入出庫実績費目別原価に金額をセットする
<REMARKS>
	事前にMGW_EXPNS_IOを作成しておく必要がある
<ARGUMENTS>
<IN>	I_ERR_FLG
		エラーＦＬＧ
<HISTORY>
*************************************************************************/

PROCEDURE P_SLS (
	I_ERR_FLG IN MAPA_META.FLG%TYPE DEFAULT '1'
	)
;
/************************************************************************
<SYNOPSIS>
	売上実績費目別原価に金額をセットする
<REMARKS>
	事前にMGW_EXPNS_SLSを作成しておく必要がある
<ARGUMENTS>
<IN>	I_ERR_FLG
		エラーＦＬＧ
<HISTORY>
*************************************************************************/

END MGPA_SET_EXPNS ;
/
