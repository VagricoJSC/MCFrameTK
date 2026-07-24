CREATE OR REPLACE PACKAGE MAPA_TERM
/*********************************************************
<SYNOPSIS>
		期関連ユーティリティ
<REMARKS>
<ARGUMENTS>
*********************************************************/
IS

	FUNCTION F_GET_TERM
	(
		I_DT IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			対象期間マスタの期開始年月を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<RETURNVALUE>
			対象の対象期間マスタの期開始年月
	<HISTORY>
	**********************************************************/
	
	FUNCTION F_GET_TERM_NE
	(
		I_DT IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			対象期間マスタの期開始年月を取得する。
			対象のレコードが見つからない場合はNULLを返す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<RETURNVALUE>
			対象の対象期間マスタの期開始年月
	<HISTORY>
	**********************************************************/

END MAPA_TERM;
/
