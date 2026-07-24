CREATE OR REPLACE PACKAGE BODY MGPA_COST_IF
IS
	C_OFF		CONSTANT MAPA_META.FLG%TYPE := '0' ;
	C_ON		CONSTANT MAPA_META.FLG%TYPE := '1' ;

	TYPE LIST_LOC IS TABLE OF MAPA_META.COST_DPT_CD%TYPE INDEX BY MAPA_META.LOC_CD%TYPE ;
	REC_LOC		LIST_LOC ;

FUNCTION F_GET_DPT (
	I_DPT		IN 	MAPA_META.DPT_CD%TYPE,
	I_FIX_DPT	IN	MAPA_META.COST_DPT_CD%TYPE,
	I_DT		IN	MAPA_META.DT%TYPE,
	I_NOT_FLG	IN	MAPA_META.FLG%TYPE
)
RETURN MAPA_META.COST_DPT_CD%TYPE
/************************************************************************
<SYNOPSIS>
	部門ＣＤを原価部門ＣＤに変換する
<REMARKS>

<ARGUMENTS>
<IN>	I_DPT
		対象部門ＣＤ
<IN>	I_FIX_DPT
		固定部門ＣＤ
<IN>	I_DT
		対象日
<IN>	I_NOT_FLG
		変換無効フラグ
<RETURNVALUE>
		変換した原価部門ＣＤ
<HISTORY>
*************************************************************************/
AS
	L_DPT_R	MAM_DPT%ROWTYPE ;
	L_DT		MAPA_META.DT%TYPE ;
BEGIN
	IF I_DPT IS NULL THEN
		RETURN NULL ;
	END IF ;

	IF I_FIX_DPT IS NOT NULL THEN
		RETURN I_FIX_DPT ;
	END IF ;

	IF I_NOT_FLG = C_ON THEN
		RETURN I_DPT ;
	END IF ;

	L_DT := TRUNC(I_DT, 'DD') ;

	SELECT	m.*
	INTO	L_DPT_R
	FROM	MAM_DPT m
	WHERE	0=0
	AND	m.DPT_CD = I_DPT
	AND	m.ST_DT	<= L_DT
	AND	m.END_DT >= L_DT
	;

	RETURN L_DPT_R.COST_DPT_CD ;

EXCEPTION
WHEN OTHERS THEN
	RETURN NULL ;
END F_GET_DPT ;

PROCEDURE P_GET_DPT (
	I_DPT		IN 	MAPA_META.DPT_CD%TYPE,
	I_FIX_DPT	IN	MAPA_META.COST_DPT_CD%TYPE,
	I_DT		IN	MAPA_META.DT%TYPE,
	IO_REC_DPT	IN OUT NOCOPY LIST_DPT,
	O_COST_DPT	OUT	MAPA_META.COST_DPT_CD%TYPE,
	I_DPT_WARN	IN	MAPA_META.FLG%TYPE
	)
/************************************************************************
<SYNOPSIS>
	部門マスタから原価部門を取得する。
<REMARKS>

<ARGUMENTS>
<IN>	I_DPT
		対象部門ＣＤ
<IN>	I_FIX_DPT
		固定部門ＣＤ
<IN>	I_DT
		対象日
<IN>	IO_REC_DPT
		部門ＣＤから原価部門ＣＤへの変換対応キャッシュデータ
<OUT>	O_COST_DPT
		変換した原価部門ＣＤ
<IN>	I_DPT_WARN
		部門が取得できない場合にログを出力するか
<HISTORY>
*************************************************************************/
AS
	L_DPT_WARN	MAPA_META.FLG%TYPE ;

	L_LOG_NO	MAPA_META.BATCH_LOG_NO%TYPE ;
	L_LOG_SUB_KEY1	MAPA_META.BATCH_LOG_SUB_KEY1%TYPE ;
	L_LOG_SUB_KEY2	MAPA_META.BATCH_LOG_SUB_KEY2%TYPE ;
BEGIN
	IF I_DPT IS NULL THEN
		O_COST_DPT := I_DPT ;
		RETURN ;
	END IF ;

	--デフォルト値はC_ONとする
	IF I_DPT_WARN IS NULL THEN
		L_DPT_WARN := C_ON ;
	ELSE
		L_DPT_WARN := I_DPT_WARN ;
	END IF ;

	IF IO_REC_DPT.EXISTS(I_DPT) THEN
		O_COST_DPT := IO_REC_DPT(I_DPT) ;	--部門マスタの原価部門
		RETURN ;
	ELSE
		O_COST_DPT := F_GET_DPT(I_DPT, I_FIX_DPT, I_DT, C_OFF) ;

		IO_REC_DPT(I_DPT) := O_COST_DPT ;

		IF L_DPT_WARN = C_ON AND O_COST_DPT IS NULL THEN
			--対象の部門を原価部門に変換できませんでした。部門：{1}
			FCPA_BATCH_LOG.P_DATA_LOG('MGUCD0001', L_LOG_NO, L_LOG_SUB_KEY1, L_LOG_SUB_KEY2, I_DPT) ;
		END IF ;
	END IF ;
END P_GET_DPT ;

PROCEDURE P_LOC_INIT
/************************************************************************
<SYNOPSIS>
	キャッシュをクリアする
<REMARKS>

<ARGUMENTS>
<HISTORY>
*************************************************************************/
AS
BEGIN
	REC_LOC.DELETE ;
END P_LOC_INIT ;

PROCEDURE P_LOC_CACHE (
	I_LOC		IN 	MAPA_META.LOC_CD%TYPE,
	I_COST_DPT	IN 	MAPA_META.COST_DPT_CD%TYPE
	)
/************************************************************************
<SYNOPSIS>
	場所ＣＤと原価部門ＣＤの組み合わせをキャッシュする
<REMARKS>

<ARGUMENTS>
<IN>	I_LOC
		対象場所ＣＤ
<IN>	I_COST_DPT
		変換した原価部門ＣＤ
<HISTORY>
*************************************************************************/
AS
BEGIN
	REC_LOC(I_LOC) := I_COST_DPT ;
END P_LOC_CACHE ;

FUNCTION F_GET_LOC_TO_DPT (
	I_LOC		IN 	MAPA_META.LOC_CD%TYPE
)
RETURN MAPA_META.COST_DPT_CD%TYPE
/************************************************************************
<SYNOPSIS>
	場所ＣＤを原価部門ＣＤに変換する
<REMARKS>

<ARGUMENTS>
<IN>	I_LOC
		対象場所ＣＤ
<RETURNVALUE>
		変換した原価部門ＣＤ
<HISTORY>
*************************************************************************/
AS
BEGIN
	IF I_LOC IS NULL THEN
		RETURN NULL ;
	END IF ;

	RETURN REC_LOC(I_LOC) ;

END F_GET_LOC_TO_DPT ;

END MGPA_COST_IF ;
/
