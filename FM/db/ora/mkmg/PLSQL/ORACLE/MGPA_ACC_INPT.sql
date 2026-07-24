CREATE OR REPLACE PACKAGE MGPA_ACC_INPT
/**************************************************************************
<SYNOPSIS>
	原価内訳照会作成処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

	PROCEDURE P_MAIN (
		I_CALC_GRP_CD		IN MAPA_META.CALC_GRP_CD%TYPE,
		I_CALC_NO		IN MAPA_META.CALC_NO%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE,
		I_YM_FROM		IN MAPA_META.YM%TYPE,
		I_YM_TO			IN MAPA_META.YM%TYPE,
		I_ITM_CD		IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1		IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2		IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3		IN MAPA_META.ITM_SUB3%TYPE,
		I_ITM_MFG_INST_NO	IN MAPA_META.ITM_MFG_INST_NO%TYPE,
		I_MFG_ACT_NO	IN MAPA_META.MFG_ACT_NO%TYPE,
		I_MNG_DPT_CD		IN MAPA_META.COST_DPT_CD%TYPE,
		I_LOT_NO		IN MAPA_META.LOT_NO%TYPE,
		I_SUBLOT_NO		IN MAPA_META.SUBLOT_NO%TYPE,
		I_SNO1			IN MAPA_META.SNO1%TYPE,
		I_SNO2			IN MAPA_META.SNO2%TYPE,
		I_SNO3			IN MAPA_META.SNO3%TYPE,
		I_SNO4			IN MAPA_META.SNO4%TYPE,
		I_LOC_CD		IN MAPA_META.LOC_CD%TYPE,
		I_STR_LN_CD		IN MAPA_META.STR_LN_CD%TYPE,
		I_PO_NO			IN MAPA_META.PO_NO%TYPE,
		I_NO_PO_NO_FLG		IN MAPA_META.FLG%TYPE,
		I_SLO_NO		IN MAPA_META.SLO_NO%TYPE,
		I_NO_SLO_NO_FLG		IN MAPA_META.FLG%TYPE,
		I_IV_NO			IN MAPA_META.IV_NO%TYPE,
		I_NO_IV_NO_FLG		IN MAPA_META.FLG%TYPE,
		I_WIP_FLG		IN MAPA_META.FLG%TYPE DEFAULT '0'
	) ;
	/**************************************************************************
	<SYNOPSIS>
		原価内訳照会作成メイン処理
	<REMARKS>
		原価計算ＮＯが設定されていないときは、対象となる品目・品目製造指図ＮＯ
		・製造実績ＮＯに対して、指定された年月までの累計情報を作成する。
		※確定されている原価計算結果（MGT_YM_NO）をもとにデータを作成する。
		原価計算ＮＯが設定されているときは、対象となる原価計算ＮＯに対する結果
		からのみデータを作成する。
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CALC_NO
			原価計算ＮＯ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_YM_FROM
			年月ＦＲＯＭ
	<IN>	I_YM_TO
			年月ＴＯ
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_ITM_MFG_INST_NO
			品目製造指図ＮＯ
	<IN>	I_MFG_ACT_NO
			製造実績ＮＯ
	<IN>	I_MNG_DPT_CD
			管理部門ＣＤ
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
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_STR_LN_CD
			ラインＣＤ
	<IN>	I_PO_NO
			発注ＮＯ
	<IN>	I_NO_PO_NO_FLG
			発注ＮＯ無ＦＬＧ
	<IN>	I_SLO_NO
			受注ＮＯ
	<IN>	I_NO_SLO_NO_FLG
			受注ＮＯ無ＦＬＧ
	<IN>	I_IV_NO
			Ｉ／Ｖ ＮＯ
	<IN>	I_NO_IV_NO_FLG
			Ｉ／Ｖ ＮＯ無ＦＬＧ
	<IN>	I_WIP_FLG
			月初仕掛ＦＬＧ
	<HISTORY>
	**************************************************************************/

END MGPA_ACC_INPT ;
/
