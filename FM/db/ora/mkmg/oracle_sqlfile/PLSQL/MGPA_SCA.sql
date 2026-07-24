SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MGPA_SCA
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_SCA0 (
	I_CO_CD		IN	MAPA_META.CO_CD%TYPE,
	I_USR_CD	IN	MAPA_META.USR_CD%TYPE,
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
) ;
/**************************************************************************
<SYNOPSIS>
	原価計算セッション設定処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CO_CD
		会社コード
<IN>	I_USR_CD
		ユーザコード
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/

PROCEDURE P_SCA1 (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
) ;
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン前処理
<REMARKS>
	マルチスレッドで実行されることもあるためセッションに関する情報のみ設定する。
	一時表を使用するためcommitは行ってはならない。
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/

PROCEDURE P_SCA2 (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
) ;
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン後処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/

END MGPA_SCA ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MGPA_SCA
IS

PROCEDURE P_SCA0 (
	I_CO_CD		IN	MAPA_META.CO_CD%TYPE,
	I_USR_CD	IN	MAPA_META.USR_CD%TYPE,
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
)
/**************************************************************************
<SYNOPSIS>
	原価計算セッション設定処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CO_CD
		会社コード
<IN>	I_USR_CD
		ユーザコード
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/
AS
BEGIN
	FCPA_CONTEXT.SET_USERID(I_USR_CD) ;
	FCPA_CONTEXT.SET_CO_CD(I_CO_CD) ;

	FOR x IN (
		SELECT	t.*
		FROM	MGVT_ARG_USR t
		WHERE	0=0
		AND	t.CALC_NO = I_CALC_NO
		AND	t.CALC_GRP_CD = I_CALC_GRP_CD
		)
	LOOP
		FCPA_CONTEXT.SET_CALL_PG_ID(x.INS_FUNC_ID) ;
		FCPA_CONTEXT.SET_PROCESSID(x.UPD_SRV_REQ_NO) ;
		FCPA_CONTEXT.SET_USERNM(x.INS_USR_NM) ;

		EXIT ;
	END LOOP ;

	O_RC := 0 ;

EXCEPTION
WHEN OTHERS THEN
	O_RC := 1 ;
END P_SCA0 ;

PROCEDURE P_SCA1 (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
)
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン前処理
<REMARKS>
	マルチスレッドで実行されることもあるためセッションに関する情報のみ設定する。
	一時表を使用するためcommitを行ってはいけない。
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/
AS
	L_USR	MAPA_META.FCM_USR_ID%TYPE ;
BEGIN
	L_USR := FCPA_CONTEXT.F_GET_USERID ;

	MGPA_ARG.P_SET_WORK(I_CALC_GRP_CD, I_CALC_NO) ;

	--部門・品群構成用
	DELETE MAW_TERM ;
	INSERT INTO MAW_TERM (TERM) SELECT w.TERM FROM MGW_ARG w ;

	DELETE MGW_USR_ITM ;
	INSERT INTO MGW_USR_ITM (
		ITM_CD,
		ITM_SUB1,
		ITM_SUB2,
		ITM_SUB3
		)
	SELECT	t.ITM_CD,
		t.ITM_SUB1,
		t.ITM_SUB2,
		t.ITM_SUB3
	FROM	MGT_USR_ITM t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.USR_CD = L_USR
	;

	O_RC := 0 ;
EXCEPTION
WHEN OTHERS THEN
	O_RC := 1 ;
END P_SCA1 ;

PROCEDURE P_SCA2 (
	I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN	MAPA_META.CALC_NO%TYPE,
	O_RC		OUT	NUMBER
)
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン後処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<OUT>	O_RC
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/
AS
BEGIN
	O_RC := 0 ;
EXCEPTION
WHEN OTHERS THEN
	O_RC := 1 ;
END P_SCA2 ;

END MGPA_SCA ;

/
show errors;


