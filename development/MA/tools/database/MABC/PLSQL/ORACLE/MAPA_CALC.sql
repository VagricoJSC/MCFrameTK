CREATE OR REPLACE PACKAGE MAPA_CALC
/*********************************************************
<SYNOPSIS>
		端数処理
<REMARKS>
<ARGUMENTS>
*********************************************************/
IS

	FUNCTION F_RND (
		I_NUM			IN	NUMBER,
		I_DEC_PLACE		IN	NUMBER,
		I_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_NE_FLG		IN	BOOLEAN default FALSE
	) RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			端数処理関数
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_NUM
			数値
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<IN>	I_RND_TYP
			端数処理区分
	<IN>	I_NE_FLG
			Not Exception版を表すフラグ（省略時FALSE）
	<RETURNVALUE>
			端数処理をした数値
	<HISTORY>
	**********************************************************/

	FUNCTION F_RND_NE (
		I_NUM			IN	NUMBER,
		I_DEC_PLACE		IN	NUMBER,
		I_RND_TYP		IN	MAPA_META.RND_TYP%TYPE
	) RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			端数処理関数(Not Exception版)
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_NUM
			数値
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<IN>	I_RND_TYP
			端数処理区分
	<RETURNVALUE>
			端数処理をした数値
	<HISTORY>
	**********************************************************/

	FUNCTION F_CALC_PER (
		I_SCHD_NUM	IN	NUMBER,
		I_ACT_NUM	IN	NUMBER
	) RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			進捗率の演算
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_SCHD_NUM
			予定数量
	<IN>	I_ACT_NUM
			実績数量
	<RETURNVALUE>
			進捗率の演算（進捗率のメタの有効桁数で四捨五入）
	<HISTORY>
	**********************************************************/

END MAPA_CALC;
/
