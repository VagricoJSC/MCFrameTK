CREATE OR REPLACE PACKAGE MGPA_IMP_PLN
/************************************************************************
<SYNOPSIS>
	計画データを取込む
<REMARKS>

<ARGUMENTS>
<HISTORY>
*************************************************************************/
IS
PROCEDURE P_SLS (
	I_CALC_CTG_CD	IN	MAPA_META.CALC_CTG_CD%TYPE,
	I_YM_FR			IN	MAPA_META.YM%TYPE,
	I_YM_TO			IN	MAPA_META.YM%TYPE,
	I_PLN_IMP_TYP	IN	MAPA_META.SLS_PLN_IMP_TYP%TYPE
);
/*********************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		売上計画用
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<HISTORY>
**********************************************************/

PROCEDURE P_RQMT (
	I_CALC_CTG_CD	IN	MAPA_META.CALC_CTG_CD%TYPE,
	I_YM_FR			IN	MAPA_META.YM%TYPE,
	I_YM_TO			IN	MAPA_META.YM%TYPE,
	I_PLN_IMP_TYP	IN	MAPA_META.RQMT_PLN_IMP_TYP%TYPE,
	I_SIM_MRP_NO	IN	MAPA_META.SIM_MRP_NO%TYPE
);
/*********************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		月次計画用
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**********************************************************/

PROCEDURE P_MFG (
	I_CALC_CTG_CD	IN	MAPA_META.CALC_CTG_CD%TYPE,
	I_YM_FR			IN	MAPA_META.YM%TYPE,
	I_YM_TO			IN	MAPA_META.YM%TYPE,
	I_PLN_IMP_TYP	IN	MAPA_META.MFG_PLN_IMP_TYP%TYPE,
	I_SIM_MRP_NO	IN	MAPA_META.SIM_MRP_NO%TYPE
);
/*********************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		製造計画用
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**********************************************************/

PROCEDURE P_PURC (
	I_CALC_CTG_CD	IN	MAPA_META.CALC_CTG_CD%TYPE,
	I_YM_FR			IN	MAPA_META.YM%TYPE,
	I_YM_TO			IN	MAPA_META.YM%TYPE,
	I_PLN_IMP_TYP	IN	MAPA_META.PURC_PLN_IMP_TYP%TYPE,
	I_SIM_MRP_NO	IN	MAPA_META.SIM_MRP_NO%TYPE
);
/*********************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		購入計画用
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**********************************************************/

END MGPA_IMP_PLN;
/
