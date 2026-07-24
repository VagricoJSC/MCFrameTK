SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MGPA_CALC_ITM_RND
/************************************************************************
<SYNOPSIS>
	指定した品目に対して端数処理を行う
<REMARKS>

<ARGUMENTS>
<HISTORY>
*************************************************************************/
IS
FUNCTION F_RND_BASE_UNIT (
	I_ITM	IN	MAPA_META.ITM_CD%TYPE,
	I_QTY	IN	MAPA_META.QTY%TYPE
) RETURN MAPA_META.QTY%TYPE ;
/*********************************************************
<SYNOPSIS>
	指定した品目に対して基準単位の端数処理区分、
	小数部有効桁数を使用して入力した数値の端数処理を行う
<REMARKS>
	エラーの場合は入力値(I_QTY)を返す
<ARGUMENTS>
<IN>	I_ITM
		品目ＣＤ
<IN>	I_QTY
		端数処理をする対象の数値
<RETURNVALUE>
		端数処理をした数値
<HISTORY>
**********************************************************/

FUNCTION F_RND_AMT (
	I_AMT	IN	MAPA_META.MONEY%TYPE
) RETURN MAPA_META.MONEY%TYPE ;
/*********************************************************
<SYNOPSIS>
	指定した品目に対して金額端数処理区分、金額小数部
	有効桁数を使用して入力した数値の端数処理を行う
<REMARKS>
	エラーの場合は入力値(I_AMT)を返す
<ARGUMENTS>
<IN>	I_AMT
		端数処理をする対象の金額
<RETURNVALUE>
		端数処理をした金額
<HISTORY>
**********************************************************/

END MGPA_CALC_ITM_RND ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MGPA_CALC_ITM_RND
IS
	G_RND_TYP	MAPA_META.RND_TYP%TYPE := NULL ;
	G_DEC_PLACE	MAPA_META.DEC_PLACE%TYPE := NULL ;

FUNCTION F_RND_BASE_UNIT (
	I_ITM	IN	MAPA_META.ITM_CD%TYPE,
	I_QTY	IN	MAPA_META.QTY%TYPE
) RETURN MAPA_META.QTY%TYPE
/*********************************************************
<SYNOPSIS>
	指定した品目に対して基準単位の端数処理区分、
	小数部有効桁数を使用して入力した数値の端数処理を行う
<REMARKS>
	エラーの場合は入力値(I_QTY)を返す
<ARGUMENTS>
<IN>	I_ITM
		品目ＣＤ
<IN>	I_QTY
		端数処理をする対象の数値
<RETURNVALUE>
		端数処理をした数値
<HISTORY>
**********************************************************/
IS
	L_ITM	MAM_ITM%ROWTYPE ;
	L_QTY		MAPA_META.QTY%TYPE ;
/*************************************************************************/
BEGIN
	--入力値がNULLもしくは0の場合は0を返す
	IF I_QTY IS NULL OR I_QTY = 0 THEN
		L_QTY := 0 ;
		GOTO FUNC_END ;
	END IF ;

	--品目ＣＤがNULLのときは入力値を返す
	IF I_ITM IS NULL THEN
		L_QTY := I_QTY ;
		GOTO FUNC_END ;
	END IF ;

	--基準単位の情報を取得して端数処理を行う
	SELECT	m.*
	INTO	L_ITM
	FROM	MAM_ITM m
	WHERE	0=0
	AND	m.ITM_CD = I_ITM
	;

	L_QTY := MAPA_CALC.F_RND(I_QTY, L_ITM.DEC_PLACE, L_ITM.RND_TYP) ;

	<<FUNC_END>>
		NULL ;

	RETURN L_QTY ;

EXCEPTION
WHEN OTHERS THEN
	-- エラーの場合は入力値を返す
	RETURN I_QTY ;
END F_RND_BASE_UNIT ;

FUNCTION F_RND_AMT (
	I_AMT	IN	MAPA_META.MONEY%TYPE
) RETURN MAPA_META.MONEY%TYPE
/*********************************************************
<SYNOPSIS>
	金額端数処理区分、金額小数部有効桁数を使用して
	入力した数値の端数処理を行う
<REMARKS>
	エラーの場合は入力値(I_AMT)を返す
<ARGUMENTS>
<IN>	I_AMT
		端数処理をする対象の金額
<RETURNVALUE>
		端数処理をした金額
<HISTORY>
**********************************************************/
IS
	L_AMT		MAPA_META.MONEY%TYPE ;
/*************************************************************************/
BEGIN
	--入力値がNULLもしくは0の場合は0を返す
	IF I_AMT IS NULL OR I_AMT = 0 THEN
		L_AMT := 0 ;
		GOTO FUNC_END ;
	END IF ;

	IF G_RND_TYP IS NULL THEN
		SELECT	m.AMT_RND_TYP, m.AMT_DEC_PLACE
		INTO	G_RND_TYP, G_DEC_PLACE
		FROM	MAM_CO_PARM m
		WHERE	0=0
		AND	ROWNUM = 1
		;
	END IF ;

	L_AMT := MAPA_CALC.F_RND(I_AMT, G_DEC_PLACE, G_RND_TYP) ;

	<<FUNC_END>>
		NULL ;

	RETURN L_AMT ;

EXCEPTION
WHEN OTHERS THEN
	-- エラーの場合は入力値を返す
	RETURN I_AMT ;
END F_RND_AMT ;

END MGPA_CALC_ITM_RND ;

/
show errors;


