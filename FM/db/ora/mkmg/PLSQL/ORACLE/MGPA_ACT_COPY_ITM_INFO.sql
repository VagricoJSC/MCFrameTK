CREATE OR REPLACE PACKAGE MGPA_ACT_COPY_ITM_INFO
/************************************************************************
<SYNOPSIS>
	原価実績品目情報コピー処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
*************************************************************************/
IS
PROCEDURE P_MAIN (
	I_YM_FROM	IN MAPA_META.YM%TYPE,
	I_YM_TO		IN MAPA_META.YM%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE,
	I_ITM		IN MAPA_META.FLG%TYPE,
	I_DTL		IN MAPA_META.FLG%TYPE,
	I_OPER		IN MAPA_META.FLG%TYPE,
	I_BOM		IN MAPA_META.FLG%TYPE,
	I_WK		IN MAPA_META.FLG%TYPE,
	I_PURC		IN MAPA_META.FLG%TYPE,
	I_PROC		IN MAPA_META.FLG%TYPE,
	I_PROV		IN MAPA_META.FLG%TYPE,
	I_SLS		IN MAPA_META.FLG%TYPE,
	I_PTN_SET_TYP	IN MGPA_META.PTN_SET_TYP%TYPE
) ;
/*********************************************************
<SYNOPSIS>
	原価実績品目情報コピー処理
<REMARKS>
	事前にMGW_CALC_CTG、MGW_WGを作成しておく必要がある
<ARGUMENTS>
<IN>	I_YM_FROM
		コピー元年月Ｆｒｏｍ
<IN>	I_YM_TO
		コピー元年月Ｔｏ
<IN>	I_CALC_CTG_CD
		コピー先計算カテゴリＣＤ
<IN>	I_TERM
		コピー先期
<IN>	I_ITM
		原価品目情報ＦＬＧ
<IN>	I_DTL
		原価品目詳細ＦＬＧ
<IN>	I_OPER
		原価品目工程ＦＬＧ
<IN>	I_BOM
		原価ＢＯＭＦＬＧ
<IN>	I_WK
		原価品目工数ＦＬＧ
<IN>	I_PURC
		原価品目購買単価ＦＬＧ
<IN>	I_PROC
		原価品目加工単価ＦＬＧ
<IN>	I_PROV
		原価品目支給単価ＦＬＧ
<IN>	I_SLS
		原価品目販売単価ＦＬＧ
<IN>	I_PTN_SET_TYP
		構成/工程パタン設定区分
<HISTORY>
**********************************************************/

END MGPA_ACT_COPY_ITM_INFO ;
/
