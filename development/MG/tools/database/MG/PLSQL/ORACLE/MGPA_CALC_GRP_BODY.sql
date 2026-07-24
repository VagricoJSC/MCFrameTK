CREATE OR REPLACE PACKAGE BODY MGPA_CALC_GRP
IS

FUNCTION F_GET_REC (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE
) RETURN MAM_CALC_GRP%ROWTYPE
/*********************************************************
<SYNOPSIS>
	計算グループマスタのレコードを返す
<REMARKS>
	
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<RETURNVALUE>
	対象となるMAM_CALC_GRPのレコード
<HISTORY>
**********************************************************/
AS
	L_REC	MAM_CALC_GRP%ROWTYPE ;
	L_MSG	FCPA_ERR.MSG_BINDER ;
BEGIN
	BEGIN
		SELECT	m.*
		INTO	L_REC
		FROM	MAM_CALC_GRP m
		WHERE	0=0
		AND	m.CALC_GRP_CD = I_CALC_GRP_CD
		;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			L_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD) ;
			FCPA_ERR.RAISE_APP_ERR('MGBXD0042', L_MSG) ;
	END ;

	RETURN L_REC ;

END F_GET_REC ;

FUNCTION F_CHK_MAX_MONS (
	I_ARG	IN MGT_ARG%ROWTYPE
) RETURN MAPA_META.FLG%TYPE
/*********************************************************
<SYNOPSIS>
	最大計算年月のときは１を返す
<REMARKS>
	対象となる期の最終月のほうが小さければ、
	対象となる期の最終月と比較する。
<ARGUMENTS>
<IN>	I_ARG
		原価計算情報
<RETURNVALUE>
	最大計算年月のときは１それ以外のときは０
<HISTORY>
**********************************************************/
AS
	L_REC		MAM_CALC_GRP%ROWTYPE ;
	L_END_YM	MAPA_META.YM%TYPE ;
BEGIN
	L_REC := F_GET_REC(I_ARG.CALC_GRP_CD) ;

	L_END_YM := ADD_MONTHS(I_ARG.ST_YM, L_REC.MAX_MONS - 1) ;

	FOR x IN (
		SELECT	ADD_MONTHS(m.TERM_END_YM, -1) END_YM
		FROM	MAM_TERM m
		WHERE	0=0
		AND	m.TERM <= I_ARG.ST_YM
		AND	m.TERM_END_YM > I_ARG.ST_YM
		AND	m.TERM_END_YM <= L_END_YM
		)
	LOOP
		IF x.END_YM < L_END_YM THEN
			L_END_YM := x.END_YM ;
		END IF ;
	END LOOP ;

	IF I_ARG.END_YM = L_END_YM THEN
		RETURN '1' ;
	END IF ;

	RETURN '0' ;

END F_CHK_MAX_MONS ;

END MGPA_CALC_GRP ;
/
