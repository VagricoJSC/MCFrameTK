CREATE OR REPLACE PACKAGE MAPA_BOM
/*********************************************************
<SYNOPSIS>
		ＢＯＭ関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	PROCEDURE P_INS_BOM_EX (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BOM_PTN	IN MAPA_META.BOM_PTN%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_PH_EX_FLG	IN MAPA_META.FLG%TYPE,
		I_BOM_PTN_FLG	IN MAPA_META.FLG%TYPE,
		I_MAX_HRRCHY	IN MAPA_META.BOM_LVL%TYPE DEFAULT NULL,
		I_SNO1		IN MAPA_META.SNO1%TYPE DEFAULT NULL,
		I_SNO2		IN MAPA_META.SNO2%TYPE DEFAULT NULL,
		I_SNO3		IN MAPA_META.SNO3%TYPE DEFAULT NULL,
		I_SNO4		IN MAPA_META.SNO4%TYPE DEFAULT NULL,
		I_MFG_FLG	IN MAPA_META.FLG%TYPE DEFAULT NULL,
		I_BASE_UNIT_QTY	IN MAPA_META.QTY%TYPE DEFAULT NULL,
		I_ALL_SNO_FLG	IN MAPA_META.FLG%TYPE DEFAULT NULL
	) ;
	/*********************************************************
	<SYNOPSIS>
		ＢＯＭ正展開結果を一時表（MAW_BOM_EX）に格納する
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
	<IN>	I_BOM_PTN
			構成パタン
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_BASE_DT
			マスタ適用日
	<IN>	I_PH_EX_FLG
			架空展開ＦＬＧ
	<IN>	I_BOM_PTN_FLG
			構成パタン引継ぎＦＬＧ
	<IN>	I_MAX_HRRCHY
			最大階層
	<IN>	I_SNO1
			手配ＮＯ１
	<IN>	I_SNO2
			手配ＮＯ２
	<IN>	I_SNO3
			手配ＮＯ３
	<IN>	I_SNO4
			手配ＮＯ４
	<IN>	I_MFG_FLG
			製造ＦＬＧ
	<IN>	I_BASE_UNIT_QTY
			基準単位数量
	<IN>	I_ALL_SNO_FLG
			全手配ＮＯＦＬＧ
	<RETURNVALUE>
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_BOM_EX_REV (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BOM_PTN	IN MAPA_META.BOM_PTN%TYPE,
		I_WG_CD		IN MAPA_META.WG_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_PH_EX_FLG	IN MAPA_META.FLG%TYPE,
		I_BOM_PTN_FLG	IN MAPA_META.FLG%TYPE,
		I_MAX_HRRCHY	IN MAPA_META.BOM_LVL%TYPE DEFAULT NULL,
		I_VER_NO	IN MAPA_META.VER_NO%TYPE DEFAULT NULL,
		I_SNO1		IN MAPA_META.SNO1%TYPE DEFAULT NULL,
		I_SNO2		IN MAPA_META.SNO2%TYPE DEFAULT NULL,
		I_SNO3		IN MAPA_META.SNO3%TYPE DEFAULT NULL,
		I_SNO4		IN MAPA_META.SNO4%TYPE DEFAULT NULL
	) ;
	/*********************************************************
	<SYNOPSIS>
		ＢＯＭ逆展開結果を一時表（MAW_BOM_EX）に格納する
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
	<IN>	I_BOM_PTN
			構成パタン
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_BASE_DT
			マスタ適用日
	<IN>	I_PH_EX_FLG
			架空展開ＦＬＧ
	<IN>	I_BOM_PTN_FLG
			構成パタン引継ぎＦＬＧ
	<IN>	I_MAX_HRRCHY
			最大階層
	<IN>	I_VAR_NO
			版ＮＯ
	<IN>	I_SNO1
			手配ＮＯ１
	<IN>	I_SNO2
			手配ＮＯ２
	<IN>	I_SNO3
			手配ＮＯ３
	<IN>	I_SNO4
			手配ＮＯ４
	<RETURNVALUE>
	<HISTORY>
	**********************************************************/



END MAPA_BOM ;
/
