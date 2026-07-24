SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MGPA_FIX_DEL
/**************************************************************************
<SYNOPSIS>
	原価情報取込対象から確定品目を削除する。
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

PROCEDURE P_ITM_DTL (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目詳細取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_BOM (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価ＢＯＭ取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_OPER (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目工程取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_WK (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目工数取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_PURC (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目購買単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_PROC (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目加工単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

PROCEDURE P_ITM_PROV (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	原価品目支給単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/

END MGPA_FIX_DEL ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MGPA_FIX_DEL
IS
	C_OFF		CONSTANT MAPA_META.FLG%TYPE := '0' ;
	C_ON		CONSTANT MAPA_META.FLG%TYPE := '1' ;

	G_NULL_VAL	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.NULL_VAL ;

	G_LOG_NO	MAPA_META.BATCH_LOG_NO%TYPE ;
	G_LOG_SUB_KEY1	MAPA_META.BATCH_LOG_SUB_KEY1%TYPE ;
	G_LOG_SUB_KEY2	MAPA_META.BATCH_LOG_SUB_KEY2%TYPE ;

PROCEDURE P_ITM_DTL (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	原価品目詳細取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
	L_FLG	BOOLEAN ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	ROWNUM = 1
	;

	IF L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_DTL w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD <> G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT = 0 THEN
			GOTO NEXT_DELETE ;
		END IF ;
		DELETE	MGW_IMP_ITM_DTL w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	EXISTS (
			SELECT	'X'
			FROM	MGT_STD_FIX t
			WHERE	0=0
			AND	t.ITM_CD = w.ITM_CD
			AND	t.ITM_SUB1 = w.ITM_SUB1
			AND	t.ITM_SUB2 = w.ITM_SUB2
			AND	t.ITM_SUB3 = w.ITM_SUB3
			AND	t.TERM = w.TERM
			AND	t.WG_CD = w.WG_CD
			AND	EXISTS (
				SELECT	'X'
				FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
				WHERE	0=0
				AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
				AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
				AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
				AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
				AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_DTL
				AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
			)
		)
		;
		L_FLG := SQL%ROWCOUNT > 0 ;

		<<NEXT_DELETE>>
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_DTL w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD = G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT > 0 THEN
			DELETE	MGW_IMP_ITM_DTL w
			WHERE	0=0
			AND	w.TERM = I_TERM
			AND	w.IMP_FLG = C_ON
			AND	w.UPD_USR_ID = I_USR
			AND	w.WG_CD = G_NULL_VAL
			AND	EXISTS (
				SELECT	'X'
				FROM	MGT_STD_FIX t
				WHERE	0=0
				AND	t.ITM_CD = w.ITM_CD
				AND	t.ITM_SUB1 = w.ITM_SUB1
				AND	t.ITM_SUB2 = w.ITM_SUB2
				AND	t.ITM_SUB3 = w.ITM_SUB3
				AND	t.TERM = w.TERM
				AND	EXISTS (
					SELECT	'X'
					FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
					WHERE	0=0
					AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
					AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
					AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
					AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
					AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_DTL
					AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGT_CALC_ITM_DTL x
					WHERE	0=0
					AND	x.CALC_NO = t.CALC_NO
					AND	x.CALC_GRP_CD = t.CALC_GRP_CD
					AND	x.ITM_CD = t.ITM_CD
					AND	x.ITM_SUB1 = t.ITM_SUB1
					AND	x.ITM_SUB2 = t.ITM_SUB2
					AND	x.ITM_SUB3 = t.ITM_SUB3
					AND	x.WG_CD = t.WG_CD
					AND	x.CALC_CTG_CD = w.CALC_CTG_CD
				)
			)
			;
			L_FLG := L_FLG OR SQL%ROWCOUNT > 0 ;
		END IF ;
		
		IF L_FLG THEN
			FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0022', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2) ;
		END IF ;
	END IF ;
END P_ITM_DTL ;

PROCEDURE P_BOM (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	原価ＢＯＭ取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
	L_FLG	BOOLEAN ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	ROWNUM = 1
	;

	IF L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_BOM w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD <> G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT = 0 THEN
			GOTO NEXT_DELETE ;
		END IF ;
		DELETE 	MGW_IMP_BOM w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	EXISTS (
			SELECT	'X'
			FROM	MGT_STD_FIX t
			WHERE	0=0
			AND	t.ITM_CD = w.PAR_ITM_CD
			AND	t.ITM_SUB1 = w.PAR_ITM_SUB1
			AND	t.ITM_SUB2 = w.PAR_ITM_SUB2
			AND	t.ITM_SUB3 = w.PAR_ITM_SUB3
			AND	t.TERM = w.TERM
			AND	t.WG_CD = w.WG_CD
			AND	EXISTS (
				SELECT	'X'
				FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
				WHERE	0=0
				AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
				AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
				AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
				AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
				AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.BOM
				AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
			)
		)
		;
		L_FLG := SQL%ROWCOUNT > 0 ;

		<<NEXT_DELETE>>
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_BOM w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD = G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT > 0 THEN
			DELETE	MGW_IMP_BOM w
			WHERE	0=0
			AND	w.TERM = I_TERM
			AND	w.IMP_FLG = C_ON
			AND	w.UPD_USR_ID = I_USR
			AND	w.WG_CD = G_NULL_VAL
			AND	EXISTS (
				SELECT	'X'
				FROM	MGT_STD_FIX t
				WHERE	0=0
				AND	t.ITM_CD = w.PAR_ITM_CD
				AND	t.ITM_SUB1 = w.PAR_ITM_SUB1
				AND	t.ITM_SUB2 = w.PAR_ITM_SUB2
				AND	t.ITM_SUB3 = w.PAR_ITM_SUB3
				AND	t.TERM = w.TERM
				AND	EXISTS (
					SELECT	'X'
					FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
					WHERE	0=0
					AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
					AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
					AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
					AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
					AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.BOM
					AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGT_CALC_BOM x
					WHERE	0=0
					AND	x.CALC_NO = t.CALC_NO
					AND	x.CALC_GRP_CD = t.CALC_GRP_CD
					AND	x.PAR_ITM_CD = t.ITM_CD
					AND	x.PAR_ITM_SUB1 = t.ITM_SUB1
					AND	x.PAR_ITM_SUB2 = t.ITM_SUB2
					AND	x.PAR_ITM_SUB3 = t.ITM_SUB3
					AND	x.WG_CD = t.WG_CD
					AND	x.CALC_CTG_CD = w.CALC_CTG_CD
				)
			)
			;
			L_FLG := L_FLG OR SQL%ROWCOUNT > 0 ;
		END IF ;
		
		IF L_FLG THEN
			FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0022', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2) ;
		END IF ;
	END IF ;
END P_BOM ;

PROCEDURE P_ITM_OPER (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	原価品目工程取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
	L_FLG	BOOLEAN ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	ROWNUM = 1
	;

	IF L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_OPER w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD <> G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT = 0 THEN
			GOTO NEXT_DELETE ;
		END IF ;
		DELETE	MGW_IMP_ITM_OPER w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	EXISTS (
			SELECT	'X'
			FROM	MGT_STD_FIX t
			WHERE	0=0
			AND	t.ITM_CD = w.ITM_CD
			AND	t.ITM_SUB1 = w.ITM_SUB1
			AND	t.ITM_SUB2 = w.ITM_SUB2
			AND	t.ITM_SUB3 = w.ITM_SUB3
			AND	t.TERM = w.TERM
			AND	t.WG_CD = w.WG_CD
			AND	EXISTS (
				SELECT	'X'
				FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
				WHERE	0=0
				AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
				AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
				AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
				AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
				AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_OPER
				AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
			)
		)
		;
		L_FLG := SQL%ROWCOUNT > 0 ;

		<<NEXT_DELETE>>
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_OPER w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD = G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT > 0 THEN
			DELETE	MGW_IMP_ITM_OPER w
			WHERE	0=0
			AND	w.TERM = I_TERM
			AND	w.IMP_FLG = C_ON
			AND	w.UPD_USR_ID = I_USR
			AND	w.WG_CD = G_NULL_VAL
			AND	EXISTS (
				SELECT	'X'
				FROM	MGT_STD_FIX t
				WHERE	0=0
				AND	t.ITM_CD = w.ITM_CD
				AND	t.ITM_SUB1 = w.ITM_SUB1
				AND	t.ITM_SUB2 = w.ITM_SUB2
				AND	t.ITM_SUB3 = w.ITM_SUB3
				AND	t.TERM = w.TERM
				AND	EXISTS (
					SELECT	'X'
					FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
					WHERE	0=0
					AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
					AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
					AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
					AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
					AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_OPER
					AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGT_CALC_ITM_OPER x
					WHERE	0=0
					AND	x.CALC_NO = t.CALC_NO
					AND	x.CALC_GRP_CD = t.CALC_GRP_CD
					AND	x.ITM_CD = t.ITM_CD
					AND	x.ITM_SUB1 = t.ITM_SUB1
					AND	x.ITM_SUB2 = t.ITM_SUB2
					AND	x.ITM_SUB3 = t.ITM_SUB3
					AND	x.WG_CD = t.WG_CD
					AND	x.CALC_CTG_CD = w.CALC_CTG_CD
				)
			)
			;
			L_FLG := L_FLG OR SQL%ROWCOUNT > 0 ;
		END IF ;
		
		IF L_FLG THEN
			FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0022', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2) ;
		END IF ;
	END IF ;
END P_ITM_OPER ;

PROCEDURE P_ITM_WK (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	原価品目工数取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
	L_FLG	BOOLEAN ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	ROWNUM = 1
	;

	IF L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_WK w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD <> G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT = 0 THEN
			GOTO NEXT_DELETE ;
		END IF ;
		DELETE	MGW_IMP_ITM_WK w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	EXISTS (
			SELECT	'X'
			FROM	MGT_STD_FIX t
			WHERE	0=0
			AND	t.ITM_CD = w.ITM_CD
			AND	t.ITM_SUB1 = w.ITM_SUB1
			AND	t.ITM_SUB2 = w.ITM_SUB2
			AND	t.ITM_SUB3 = w.ITM_SUB3
			AND	t.TERM = w.TERM
			AND	t.WG_CD = w.WG_CD
			AND	EXISTS (
				SELECT	'X'
				FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
				WHERE	0=0
				AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
				AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
				AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
				AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
				AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_WK
				AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
			)
		)
		;
		L_FLG := SQL%ROWCOUNT > 0 ;

		<<NEXT_DELETE>>
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_WK w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD = G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT > 0 THEN
			DELETE	MGW_IMP_ITM_WK w
			WHERE	0=0
			AND	w.TERM = I_TERM
			AND	w.IMP_FLG = C_ON
			AND	w.UPD_USR_ID = I_USR
			AND	w.WG_CD = G_NULL_VAL
			AND	EXISTS (
				SELECT	'X'
				FROM	MGT_STD_FIX t
				WHERE	0=0
				AND	t.ITM_CD = w.ITM_CD
				AND	t.ITM_SUB1 = w.ITM_SUB1
				AND	t.ITM_SUB2 = w.ITM_SUB2
				AND	t.ITM_SUB3 = w.ITM_SUB3
				AND	t.TERM = w.TERM
				AND	EXISTS (
					SELECT	'X'
					FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
					WHERE	0=0
					AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
					AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
					AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
					AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
					AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_WK
					AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGT_CALC_ITM_WK x
					WHERE	0=0
					AND	x.CALC_NO = t.CALC_NO
					AND	x.CALC_GRP_CD = t.CALC_GRP_CD
					AND	x.ITM_CD = t.ITM_CD
					AND	x.ITM_SUB1 = t.ITM_SUB1
					AND	x.ITM_SUB2 = t.ITM_SUB2
					AND	x.ITM_SUB3 = t.ITM_SUB3
					AND	x.WG_CD = t.WG_CD
					AND	x.CALC_CTG_CD = w.CALC_CTG_CD
				)
			)
			;
			L_FLG := L_FLG OR SQL%ROWCOUNT > 0 ;
		END IF ;
		
		IF L_FLG THEN
			FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0022', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2) ;
		END IF ;
	END IF ;
END P_ITM_WK ;

PROCEDURE P_ITM_PURC (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	原価品目購買単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
	L_FLG	BOOLEAN ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	ROWNUM = 1
	;

	IF L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_PURC w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD <> G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT = 0 THEN
			GOTO NEXT_DELETE ;
		END IF ;
		DELETE	MGW_IMP_ITM_PURC w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	EXISTS (
			SELECT	'X'
			FROM	MGT_STD_FIX t
			WHERE	0=0
			AND	t.ITM_CD = w.ITM_CD
			AND	t.ITM_SUB1 = w.ITM_SUB1
			AND	t.ITM_SUB2 = w.ITM_SUB2
			AND	t.ITM_SUB3 = w.ITM_SUB3
			AND	t.TERM = w.TERM
			AND	t.WG_CD = w.WG_CD
			AND	EXISTS (
				SELECT	'X'
				FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
				WHERE	0=0
				AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
				AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
				AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
				AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
				AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PURC
				AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
			)
		)
		;
		L_FLG := SQL%ROWCOUNT > 0 ;

		<<NEXT_DELETE>>
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_PURC w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD = G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT > 0 THEN
			DELETE	MGW_IMP_ITM_PURC w
			WHERE	0=0
			AND	w.TERM = I_TERM
			AND	w.IMP_FLG = C_ON
			AND	w.UPD_USR_ID = I_USR
			AND	w.WG_CD = G_NULL_VAL
			AND	EXISTS (
				SELECT	'X'
				FROM	MGT_STD_FIX t
				WHERE	0=0
				AND	t.ITM_CD = w.ITM_CD
				AND	t.ITM_SUB1 = w.ITM_SUB1
				AND	t.ITM_SUB2 = w.ITM_SUB2
				AND	t.ITM_SUB3 = w.ITM_SUB3
				AND	t.TERM = w.TERM
				AND	EXISTS (
					SELECT	'X'
					FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
					WHERE	0=0
					AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
					AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
					AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
					AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
					AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PURC
					AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGT_CALC_ITM_PURC x
					WHERE	0=0
					AND	x.CALC_NO = t.CALC_NO
					AND	x.CALC_GRP_CD = t.CALC_GRP_CD
					AND	x.ITM_CD = t.ITM_CD
					AND	x.ITM_SUB1 = t.ITM_SUB1
					AND	x.ITM_SUB2 = t.ITM_SUB2
					AND	x.ITM_SUB3 = t.ITM_SUB3
					AND	x.WG_CD = t.WG_CD
					AND	x.CALC_CTG_CD = w.CALC_CTG_CD
				)
			)
			;
			L_FLG := L_FLG OR SQL%ROWCOUNT > 0 ;
		END IF ;
		
		IF L_FLG THEN
			FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0022', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2) ;
		END IF ;
	END IF ;
END P_ITM_PURC ;

PROCEDURE P_ITM_PROC (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	原価品目加工単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
	L_FLG	BOOLEAN ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	ROWNUM = 1
	;

	IF L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_PROC w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD <> G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT = 0 THEN
			GOTO NEXT_DELETE ;
		END IF ;
		DELETE	MGW_IMP_ITM_PROC w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	EXISTS (
			SELECT	'X'
			FROM	MGT_STD_FIX t
			WHERE	0=0
			AND	t.ITM_CD = w.ITM_CD
			AND	t.ITM_SUB1 = w.ITM_SUB1
			AND	t.ITM_SUB2 = w.ITM_SUB2
			AND	t.ITM_SUB3 = w.ITM_SUB3
			AND	t.TERM = w.TERM
			AND	t.WG_CD = w.WG_CD
			AND	EXISTS (
				SELECT	'X'
				FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
				WHERE	0=0
				AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
				AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
				AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
				AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
				AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PROC
				AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
			)
		)
		;
		L_FLG := SQL%ROWCOUNT > 0 ;

		<<NEXT_DELETE>>
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_PROC w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD = G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT > 0 THEN
			DELETE	MGW_IMP_ITM_PROC w
			WHERE	0=0
			AND	w.TERM = I_TERM
			AND	w.IMP_FLG = C_ON
			AND	w.UPD_USR_ID = I_USR
			AND	w.WG_CD = G_NULL_VAL
			AND	EXISTS (
				SELECT	'X'
				FROM	MGT_STD_FIX t
				WHERE	0=0
				AND	t.ITM_CD = w.ITM_CD
				AND	t.ITM_SUB1 = w.ITM_SUB1
				AND	t.ITM_SUB2 = w.ITM_SUB2
				AND	t.ITM_SUB3 = w.ITM_SUB3
				AND	t.TERM = w.TERM
				AND	EXISTS (
					SELECT	'X'
					FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
					WHERE	0=0
					AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
					AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
					AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
					AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
					AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PROC
					AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGT_CALC_ITM_PROC x
					WHERE	0=0
					AND	x.CALC_NO = t.CALC_NO
					AND	x.CALC_GRP_CD = t.CALC_GRP_CD
					AND	x.ITM_CD = t.ITM_CD
					AND	x.ITM_SUB1 = t.ITM_SUB1
					AND	x.ITM_SUB2 = t.ITM_SUB2
					AND	x.ITM_SUB3 = t.ITM_SUB3
					AND	x.WG_CD = t.WG_CD
					AND	x.CALC_CTG_CD = w.CALC_CTG_CD
				)
			)
			;
			L_FLG := L_FLG OR SQL%ROWCOUNT > 0 ;
		END IF ;
		
		IF L_FLG THEN
			FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0022', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2) ;
		END IF ;
	END IF ;
END P_ITM_PROC ;

PROCEDURE P_ITM_PROV (
	I_USR		IN MAPA_META.FCM_USR_ID%TYPE,
	I_TERM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	原価品目支給単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
	L_FLG	BOOLEAN ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_STD_FIX t
	WHERE	0=0
	AND	t.TERM = I_TERM
	AND	ROWNUM = 1
	;

	IF L_CNT > 0 THEN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_PROV w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD <> G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT = 0 THEN
			GOTO NEXT_DELETE ;
		END IF ;
		DELETE	MGW_IMP_ITM_PROV w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	EXISTS (
			SELECT	'X'
			FROM	MGT_STD_FIX t
			WHERE	0=0
			AND	t.ITM_CD = w.ITM_CD
			AND	t.ITM_SUB1 = w.ITM_SUB1
			AND	t.ITM_SUB2 = w.ITM_SUB2
			AND	t.ITM_SUB3 = w.ITM_SUB3
			AND	t.TERM = w.TERM
			AND	t.WG_CD = w.WG_CD
			AND	EXISTS (
				SELECT	'X'
				FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
				WHERE	0=0
				AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
				AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
				AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
				AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
				AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PROV
				AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
			)
		)
		;
		L_FLG := SQL%ROWCOUNT > 0 ;

		<<NEXT_DELETE>>
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGW_IMP_ITM_PROV w
		WHERE	0=0
		AND	w.TERM = I_TERM
		AND	w.IMP_FLG = C_ON
		AND	w.UPD_USR_ID = I_USR
		AND	w.WG_CD = G_NULL_VAL
		AND	ROWNUM = 1
		;
		IF L_CNT > 0 THEN
			DELETE	MGW_IMP_ITM_PROV w
			WHERE	0=0
			AND	w.TERM = I_TERM
			AND	w.IMP_FLG = C_ON
			AND	w.UPD_USR_ID = I_USR
			AND	w.WG_CD = G_NULL_VAL
			AND	EXISTS (
				SELECT	'X'
				FROM	MGT_STD_FIX t
				WHERE	0=0
				AND	t.ITM_CD = w.ITM_CD
				AND	t.ITM_SUB1 = w.ITM_SUB1
				AND	t.ITM_SUB2 = w.ITM_SUB2
				AND	t.ITM_SUB3 = w.ITM_SUB3
				AND	t.TERM = w.TERM
				AND	EXISTS (
					SELECT	'X'
					FROM	MAM_GRP_CTG m1, MAM_GRP_CTG m2
					WHERE	0=0
					AND	m1.CALC_CTG_TYP = MAC_CALC_CTG_TYP.CALC_ITM
					AND	m1.CALC_CTG_CD = t.CALC_CTG_CD
					AND	m1.CALC_GRP_CD = t.CALC_GRP_CD
					AND	m1.CALC_GRP_CD = m2.CALC_GRP_CD
					AND	m2.CALC_CTG_TYP = MAC_CALC_CTG_TYP.ITM_PROV
					AND	m2.CALC_CTG_CD = w.CALC_CTG_CD
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	MGT_CALC_ITM_PROV x
					WHERE	0=0
					AND	x.CALC_NO = t.CALC_NO
					AND	x.CALC_GRP_CD = t.CALC_GRP_CD
					AND	x.ITM_CD = t.ITM_CD
					AND	x.ITM_SUB1 = t.ITM_SUB1
					AND	x.ITM_SUB2 = t.ITM_SUB2
					AND	x.ITM_SUB3 = t.ITM_SUB3
					AND	x.WG_CD = t.WG_CD
					AND	x.CALC_CTG_CD = w.CALC_CTG_CD
				)
			)
			;
			L_FLG := L_FLG OR SQL%ROWCOUNT > 0 ;
		END IF ;
		
		IF L_FLG THEN
			FCPA_BATCH_LOG.P_DATA_LOG('MGBDD0022', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2) ;
		END IF ;
	END IF ;
END P_ITM_PROV ;

END MGPA_FIX_DEL ;

/
show errors;


