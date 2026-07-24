CREATE OR REPLACE PACKAGE MAPA_STD_COST
/*********************************************************
<Synopsis>
		標準単価関連ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_GET_STD_UPRI (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_DT		IN	MAPA_META.DT%TYPE,
		I_WG_CD		IN	MAPA_META.WG_CD%TYPE,
		I_STD_UPRI_SEL_TYP IN	MAPA_META.STD_UPRI_SEL_TYP%TYPE DEFAULT '1'
	) RETURN MAPA_META.MONEY%TYPE;
	/*********************************************************
	<SYNOPSIS>
		標準単価の取得
	<REMARKS>
		標準単価マスタから標準単価を取得する
		１単位あたりの標準単価を取得し、端数処理は行なわない
		I_STD_UPRI_SEL_TYPが設定されていない場合は1(標準単価)とみなす
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_DT
			日付
	<IN>	I_WG_CD
			ＷＧコード
	<IN>	I_STD_UPRI_SEL_TYP
			標準単価取得区分
	<RETURN VALUE>
			標準単価
	<HISTORY>
	**********************************************************/
	
	FUNCTION F_GET_STD_AMT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_DT		IN	MAPA_META.DT%TYPE,
		I_WG_CD		IN	MAPA_META.WG_CD%TYPE,
		I_QTY		IN	MAPA_META.QTY%TYPE,
		I_STD_UPRI_SEL_TYP IN	MAPA_META.STD_UPRI_SEL_TYP%TYPE DEFAULT '1'
	) RETURN MAPA_META.MONEY%TYPE;
	/*********************************************************
	<SYNOPSIS>
		標準金額の取得
	<REMARKS>
		標準単価マスタから取得した標準単価に数量を掛け金額を算出する
		会社マスタの在庫金額端数処理区分、在庫金額小数部有効桁数に従って
		端数処理を行なう
		I_STD_UPRI_SEL_TYPが設定されていない場合は1(標準単価)とみなす
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_DT
			日付
	<IN>	I_WG_CD
			ＷＧコード
	<IN>	I_QTY
			数量
	<IN>	I_STD_UPRI_SEL_TYP
			標準単価取得区分
	<RETURN VALUE>
			標準金額
	<HISTORY>
	**********************************************************/

END MAPA_STD_COST;
/
