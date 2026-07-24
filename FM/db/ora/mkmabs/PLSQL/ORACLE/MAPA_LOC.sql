CREATE OR REPLACE PACKAGE MAPA_LOC
/*********************************************************
<SYNOPSIS>
		場所関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	FUNCTION F_GET_IN_LOC (
		I_ITM_CD IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1 IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2 IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3 IN MAPA_META.ITM_SUB3%TYPE,
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE
	) RETURN MAPA_META.LOC_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			投入指定場所ＣＤを取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOC_CD
			製造場所ＣＤ
	<RETURNVALUE>
		品目ＣＤ、枝番１～３、製造場所ＣＤより取得した投入指定場所ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_ASST_DPT_CD_NE (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから資産管理部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<IN>	I_NO_CHK_FLG
			部門有効確認不要ＦＬＧ
	<RETURNVALUE>
		場所ＣＤ、マスタ適用日から取得した資産管理部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_ASST_DPT_CD (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから資産管理部門ＣＤを取得する
	<REMARKS>
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		場所ＣＤ、マスタ適用日から取得した資産管理部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_DPT_CD_NE (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<IN>	I_NO_CHK_FLG
			部門有効確認不要ＦＬＧ
	<RETURNVALUE>
		場所ＣＤ、マスタ適用日から取得した売上部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_DPT_CD (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤを取得する
	<REMARKS>
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		場所ＣＤ、マスタ適用日から取得した売上部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_DPT_LOC_CD_NE (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.LOC_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤに対する
		場所ＣＤを取得する(Not Exception版)
	<REMARKS>
		場所が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		部門ＣＤ、マスタ適用日から取得した場所ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_DPT_LOC_CD (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.LOC_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤに対する
		場所ＣＤを取得する
	<REMARKS>
		場所が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		部門ＣＤ、マスタ適用日から取得した場所ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_LOC_ADDR (
		I_LOC_CD	IN	MAPA_META.LOC_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE,
		I_LOC_ADDR_TYP	IN	MAPA_META.LOC_ADDR_TYP%TYPE
		,I_LCL_CD	IN	MAPA_META.LCL_CD%TYPE DEFAULT NULL
	)
	RETURN VARCHAR2 ;
	/*********************************************************
	<SYNOPSIS>
		場所に対する住所などを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_LOC_ADDR_TYP
			場所宛先区分
	<IN>	I_LCL_CD
			ロケールＣＤ
	<ReturnValue>
		場所宛先区分に対応した値
	**********************************************************/

END MAPA_LOC ;
/
