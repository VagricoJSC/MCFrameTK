CREATE OR REPLACE PACKAGE MGPA_UNIT
/*********************************************************
<SYNOPSIS>
		単位関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS

	FUNCTION F_GET_CONV_QTY (
		I_QTY				IN	MAPA_META.QTY%TYPE,
		I_CONV_BASE_QTY				IN	MAPA_META.QTY%TYPE,
		I_CONV_QTY				IN	MAPA_META.QTY%TYPE,
		I_DEC_PLACE				IN	MAPA_META.DEC_PLACE%TYPE,
		I_RND_TYP				IN	MAPA_META.RND_TYP%TYPE
	) RETURN MAPA_META.QTY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			基準単位に換算した数量を取得する。
	<REMARKS>
			数量 × 換算数量 ÷ 換算基準数量に端数処理を施した数量を返す
	<ARGUMENTS>
	<IN>	I_QTY
			数量
	<IN>	I_CONV_BASE_QTY
			換算元単位の換算基準数量
	<IN>	I_CONV_QTY
			換算元単位の換算数量
	<IN>	I_DEC_PLACE
			基準単位の小数部有効桁数
	<IN>	I_RND_TYP
			基準単位の端数処理区分
	<RETURNVALUE>
			基準単位換算後数量
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_CONV_QTY_NE (
		I_QTY				IN	MAPA_META.QTY%TYPE,
		I_CONV_BASE_QTY				IN	MAPA_META.QTY%TYPE,
		I_CONV_QTY				IN	MAPA_META.QTY%TYPE,
		I_DEC_PLACE				IN	MAPA_META.DEC_PLACE%TYPE,
		I_RND_TYP				IN	MAPA_META.RND_TYP%TYPE
	) RETURN MAPA_META.QTY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			基準単位に換算した数量を取得する。取得できない場合はNULLを返す。
	<REMARKS>
			数量 × 換算数量 ÷ 換算基準数量に端数処理を施した数量を返す
	<ARGUMENTS>
	<IN>	I_QTY
			数量
	<IN>	I_CONV_BASE_QTY
			換算元単位の換算基準数量
	<IN>	I_CONV_QTY
			換算元単位の換算数量
	<IN>	I_DEC_PLACE
			基準単位の小数部有効桁数
	<IN>	I_RND_TYP
			基準単位の端数処理区分
	<RETURNVALUE>
			基準単位換算後数量
	<HISTORY>
	**********************************************************/

END MGPA_UNIT;
/
