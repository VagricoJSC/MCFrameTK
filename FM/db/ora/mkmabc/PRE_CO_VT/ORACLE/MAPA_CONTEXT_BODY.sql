CREATE OR REPLACE PACKAGE BODY MAPA_CONTEXT
IS

FUNCTION DEL_FLG_CTL_KEY
RETURN VARCHAR2
/*********************************************************
<SYNOPSIS>
	論理削除ＦＬＧ制御の値を取得するためのキーを取得する
<REMARKS>
<ARGUMENTS>
<IN>
<RETURNVALUE>
	論理削除ＦＬＧ制御の値を取得するためのキー
<HISTORY>
**********************************************************/
IS
BEGIN
	RETURN C_DEL_FLG_CTL;
END;

FUNCTION F_GET_DEL_FLG_CTL
RETURN VARCHAR2
/*********************************************************
<SYNOPSIS>
	論理削除ＦＬＧ制御の値を取得する
<REMARKS>
<ARGUMENTS>
<IN>
<RETURNVALUE>
	論理削除ＦＬＧ制御の値
<HISTORY>
**********************************************************/
IS
BEGIN
	RETURN V_DEL_FLG_CTL;
END;

PROCEDURE SET_DEL_FLG_CTL(I_DEL_FLG_CTL IN VARCHAR2)
/*********************************************************
<SYNOPSIS>
	論理削除ＦＬＧ制御の値を設定する
<REMARKS>
<ARGUMENTS>
<IN>	I_DEL_FLG_CTL
		論理削除ＦＬＧ制御の値
<HISTORY>
**********************************************************/
IS
BEGIN
	V_DEL_FLG_CTL := I_DEL_FLG_CTL;
END;

FUNCTION RELEASE_FLG_CTL_KEY
RETURN VARCHAR2
/*********************************************************
<SYNOPSIS>
	リリースＦＬＧ制御の値を取得するためのキーを取得する
<REMARKS>
<ARGUMENTS>
<IN>
<RETURNVALUE>
	リリースＦＬＧ制御の値を取得するためのキー
<HISTORY>
**********************************************************/
IS
BEGIN
	RETURN C_RELEASE_FLG_CTL;
END;

FUNCTION F_GET_RELEASE_FLG_CTL
RETURN VARCHAR2
/*********************************************************
<SYNOPSIS>
	リリースＦＬＧ制御の値を取得する
<REMARKS>
<ARGUMENTS>
<IN>
<RETURNVALUE>
	リリースＦＬＧ制御の値
<HISTORY>
**********************************************************/
IS
BEGIN
	RETURN V_RELEASE_FLG_CTL;
END;

PROCEDURE SET_RELEASE_FLG_CTL(I_RELEASE_FLG_CTL IN VARCHAR2)
/*********************************************************
<SYNOPSIS>
	リリースＦＬＧ制御の値を設定する
<REMARKS>
<ARGUMENTS>
<IN>	I_DEL_FLG_CTL
		リリースＦＬＧ制御の値
<HISTORY>
**********************************************************/
IS
BEGIN
	V_RELEASE_FLG_CTL := I_RELEASE_FLG_CTL;
END;

FUNCTION F_ITM_UNIT
RETURN INTEGER
/*********************************************************
<SYNOPSIS>
	品目単位マスタ(MAM_ITM_UNIT)使用チェック
<REMARKS>
	MAM_ITM_UNITを利用することは想定していない
	MAVM_ITM_UNITを利用する
<ARGUMENTS>
<IN>
<RETURNVALUE>
<HISTORY>
**********************************************************/
IS
BEGIN
	FCPA_ERR.RAISE_APP_ERR('MAUDD0001') ;
	RETURN 999 ;
END ;

FUNCTION F_ITM_WG
RETURN INTEGER
/*********************************************************
<SYNOPSIS>
	品目マスタ（ＷＧ）(MAM_ITM_WG)使用チェック
<REMARKS>
	MAM_ITM_WGを利用することは想定していない
	MAVM_ITM_WGを利用する
<ARGUMENTS>
<IN>
<RETURNVALUE>
<HISTORY>
**********************************************************/
IS
BEGIN
	FCPA_ERR.RAISE_APP_ERR('MAUDD0002') ;
	RETURN 999 ;
END ;

END;
/
