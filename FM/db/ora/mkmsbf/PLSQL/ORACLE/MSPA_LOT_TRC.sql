CREATE OR REPLACE PACKAGE MSPA_LOT_TRC
/**************************************************************************
<SYNOPSIS>
		ロットトレース用パッケージ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS
	TYPE F_H_TYPE IS TABLE OF MSW_LOT_TRACE_F_HRRCHY%ROWTYPE;
    TYPE L_T_TYPE IS TABLE OF MSW_LOT_TRACE_MULTI_INPUT%ROWTYPE;

	PROCEDURE P_INS_LOT_TRC_HRRCHY(
		I_HRRCHY IN NUMBER,
		I_ITM_CD IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1 IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2 IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3 IN MAPA_META.ITM_SUB3%TYPE,
		I_LOT_NO IN MAPA_META.LOT_NO%TYPE,
		I_SUBLOT_NO IN MAPA_META.SUBLOT_NO%TYPE,
		I_SNO1 IN MAPA_META.SNO1%TYPE,
		I_SNO2 IN MAPA_META.SNO2%TYPE,
		I_SNO3 IN MAPA_META.SNO3%TYPE,
		I_SNO4 IN MAPA_META.SNO4%TYPE,
		I_LOT_NOT_MNG IN NUMBER,
		I_LOT_DUPL_ABL IN NUMBER,
		I_MODE IN NUMBER DEFAULT 0
	) ;
	/*********************************************************
	<SYNOPSIS>
		ロットトレース正展開
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_HRRCHY
				階層
	<IN>	I_ITM_CD
				品目ＣＤ
	<IN>	I_ITM_SUB1
				枝番１
	<IN>	I_ITM_SUB2
				枝番２
	<IN>	I_ITM_SUB3
				枝番３
	<IN>	I_LOT_NO
				ロットＮＯ
	<IN>	I_SUBLOT_NO
				サブロットＮＯ
	<IN>	I_SNO1
				手配ＮＯ１
	<IN>	I_SNO2
				手配ＮＯ２
	<IN>	I_SNO3
				手配ＮＯ３
	<IN>	I_SNO4
				手配ＮＯ４
	<IN>	I_LOT_NOT_MNG
				ロット管理しない
	<IN>	I_LOT_DUPL_ABL
				同一ロット許可
	<IN>	I_MODE
				呼び出し元（0は画面から）
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_LOT_TRC_HRRCHY_BKWD(
		I_HRRCHY IN NUMBER,
		I_ITM_CD IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1 IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2 IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3 IN MAPA_META.ITM_SUB3%TYPE,
		I_LOT_NO IN MAPA_META.LOT_NO%TYPE,
		I_SUBLOT_NO IN MAPA_META.SUBLOT_NO%TYPE,
		I_SNO1 IN MAPA_META.SNO1%TYPE,
		I_SNO2 IN MAPA_META.SNO2%TYPE,
		I_SNO3 IN MAPA_META.SNO3%TYPE,
		I_SNO4 IN MAPA_META.SNO4%TYPE,
		I_BP_LOT_NO IN MAPA_META.BP_LOT_NO%TYPE,
		I_VER_NO IN MAPA_META.VER_NO%TYPE,
		I_LOT_NOT_MNG IN NUMBER,
		I_LOT_DUPL_ABL IN NUMBER
	);
	/*********************************************************
	<SYNOPSIS>
		ロットトレース逆展開
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_HRRCHY
				階層
	<IN>	I_ITM_CD
				品目ＣＤ
	<IN>	I_ITM_SUB1
				枝番１
	<IN>	I_ITM_SUB2
				枝番２
	<IN>	I_ITM_SUB3
				枝番３
	<IN>	I_LOT_NO
				ロットＮＯ
	<IN>	I_SUBLOT_NO
				サブロットＮＯ
	<IN>	I_SNO1
				手配ＮＯ１
	<IN>	I_SNO2
				手配ＮＯ２
	<IN>	I_SNO3
				手配ＮＯ３
	<IN>	I_SNO4
				手配ＮＯ４
	<IN>	I_BP_LOT_NO
				業者ロットＮＯ
	<IN>	I_VER_NO
				版ＮＯ
	<IN>	I_LOT_NOT_MNG
				ロット管理しない
	<IN>	I_LOT_DUPL_ABL
				同一ロット許可
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_LOT_TRC_HRRCHY_MULTI_INPUT;
	/*********************************************************
	<SYNOPSIS>
		複数在庫のロットトレース正展開
	<REMARKS>
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
END MSPA_LOT_TRC;
/
