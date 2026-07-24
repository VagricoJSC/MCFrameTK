CREATE OR REPLACE PACKAGE MGPA_BOM_EX
/*********************************************************
<SYNOPSIS>
		原価ＢＯＭ展開ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	PROCEDURE P_BOM_EX1 (
		I_CALC_GRP_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BOM_PTN	IN MAPA_META.BOM_PTN%TYPE,
		I_BOM_PTN_FLG	IN MAPA_META.FLG%TYPE,
		I_MAX_HRRCHY	IN MAPA_META.BOM_LVL%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		原価ＢＯＭを正展開する際に必要なデータを
		原価ＢＯＭ展開ワーク（MGW_BOM_EX）に作成する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BOM_PTN
			構成パタン
	<IN>	I_BOM_PTN_FLG
			構成パタン引継ぎＦＬＧ
	<IN>	I_MAX_HRRCHY
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_BOM_EX2 (
		I_CALC_GRP_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BOM_PTN	IN MAPA_META.BOM_PTN%TYPE,
		I_BOM_PTN_FLG	IN MAPA_META.FLG%TYPE,
		I_MAX_HRRCHY	IN MAPA_META.BOM_LVL%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		原価ＢＯＭを逆展開する際に必要なデータを
		原価ＢＯＭ展開ワーク（MGW_BOM_EX）に作成する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BOM_PTN
			構成パタン
	<IN>	I_BOM_PTN_FLG
			構成パタン引継ぎＦＬＧ
	<IN>	I_MAX_HRRCHY
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_SET_OPER_WK (
		I_CALC_GRP_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_TERM		IN MAPA_META.YM%TYPE,
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		入力データに対する原価品目工程・原価品目工数情報を
		ワークテーブルに作成する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<HISTORY>
	**********************************************************/

END MGPA_BOM_EX ;
/
