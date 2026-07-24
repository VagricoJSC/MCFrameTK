CREATE OR REPLACE PACKAGE BODY MAPA_TERM
IS

	FUNCTION F_GET_TERM_REC
	(
		I_DT IN MAPA_META.DT%TYPE
	)
	RETURN MAM_TERM%ROWTYPE
	/*********************************************************
	<SYNOPSIS>
			対象の対象期間マスタのレコードを返す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<RETURNVALUE>
			対象の対象期間マスタのレコード
	<HISTORY>
	**********************************************************/
	IS
		L_MSG FCPA_ERR.MSG_BINDER;
		L_REC MAM_TERM%ROWTYPE;
	BEGIN
		SELECT
			* INTO L_REC
		FROM
			MAM_TERM
		WHERE
			0 = 0
			AND TERM <= I_DT
			AND TERM_END_YM > I_DT;
		
		RETURN L_REC;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			L_MSG := FCPA_ERR.MSG_BINDER(FCPA_DATE_UTIL.F_TO_CHAR(I_DT, FCPA_DATE_UTIL.Y4MD));
			FCPA_ERR.RAISE_APP_ERR('MABCD0003', L_MSG);
	END F_GET_TERM_REC;
	
	FUNCTION F_GET_TERM
	(
		I_DT IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			対象の対象期間マスタの期開始年月を返す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<RETURNVALUE>
			対象の対象期間マスタの期開始年月
	<HISTORY>
	**********************************************************/
	IS
		L_REC MAM_TERM%ROWTYPE;
	BEGIN
		L_REC := F_GET_TERM_REC(I_DT);
		RETURN L_REC.TERM;
	END F_GET_TERM;
	
	FUNCTION F_GET_TERM_NE
	(
		I_DT IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
			対象の対象期間マスタの期開始年月を返す。
			対象のレコードが見つからない場合はNULLを返す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<RETURNVALUE>
			対象の対象期間マスタの期開始年月
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		RETURN F_GET_TERM(I_DT);
	EXCEPTION
		WHEN OTHERS THEN
			RETURN NULL;
	END F_GET_TERM_NE;

END MAPA_TERM;
/
