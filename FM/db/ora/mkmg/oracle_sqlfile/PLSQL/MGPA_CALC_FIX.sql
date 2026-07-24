SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MGPA_CALC_FIX
/**************************************************************************
<SYNOPSIS>
	原価計算ＮＯ確定処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

FUNCTION F_GET_CALC_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) RETURN MGT_CALC_FIX%ROWTYPE ;
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_FIXのレコードを返す
<REMARKS>
	存在しないときはエラーとなる
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	対象となるMGT_CALC_FIXのレコード
<HISTORY>
**************************************************************************/

FUNCTION F_CHK_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE ;
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	確定済みのときは１、未確定のときは０を返す
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
**************************************************************************/

PROCEDURE P_CHK_FIX_CALC_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	計算グループＣＤ・年月に対して確定されており、
	確定対象の原価計算ＮＯが入力値の原価計算ＮＯと異なるときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<IN>	I_CALC_NO
		原価計算ＮＯ
**************************************************************************/

PROCEDURE P_LOCK (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定情報(MGT_CALC_FIX)に対するロック処理
<REMARKS>
	NOWAITでロックする
	対象となるデータが存在しないときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_INS_YM_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	年月別原価計算ＮＯデータを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/

PROCEDURE P_REMAKE_YM_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	削除されるデータをもとに年月別原価計算ＮＯデータを再作成する
<REMARKS>
	作成対象の年月で確定されている原価計算ＮＯで再作成する
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		削除対象となる原価計算ＮＯ
<IN>	I_YM
		作成対象となる年月
<HISTORY>
**************************************************************************/

PROCEDURE P_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_CANCEL (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	確定取消処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX_ACT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_MFG		IN MAPA_META.FLG%TYPE,
	I_PURC		IN MAPA_META.FLG%TYPE,
	I_INPT		IN MAPA_META.FLG%TYPE,
	I_INST_WK	IN MAPA_META.FLG%TYPE,
	I_OTHER_WK	IN MAPA_META.FLG%TYPE,
	I_INST_WIP	IN MAPA_META.FLG%TYPE,
	I_IO		IN MAPA_META.FLG%TYPE,
	I_SLS		IN MAPA_META.FLG%TYPE,
	I_STK		IN MAPA_META.FLG%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	実績データに対する確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_MFG
		製造実績 0:実行しない 1:実行する
<IN>	I_PURC
		購買実績 0:実行しない 1:実行する
<IN>	I_INPT
		投入実績 0:実行しない 1:実行する
<IN>	I_INST_WK
		指図工数実績 0:実行しない 1:実行する
<IN>	I_OTHER_WK
		指図外工数実績 0:実行しない 1:実行する
<IN>	I_INST_WIP
		指図仕掛実績 0:実行しない 1:実行する
<IN>	I_IO
		入出庫実績 0:実行しない 1:実行する
<IN>	I_SLS
		売上実績 0:実行しない 1:実行する
<IN>	I_STK
		在庫実績 0:実行しない 1:実行する
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX_ACT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_MFG		IN MAPA_META.FLG%TYPE,
	I_TRAN		IN MAPA_META.FLG%TYPE,
	I_STK		IN MAPA_META.FLG%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	実績データに対する確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_MFG
		製造実績関連(製造、購買、投入、工数、品目製造指図、指図工程) 0:実行しない 1:実行する
<IN>	I_TRAN
		入出庫関連(入出庫、売上) 0:実行しない 1:実行する
<IN>	I_STK
		在庫情報 0:実行しない 1:実行する
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX_ACT_AMT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	配賦費用実績データに対する確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/

PROCEDURE P_CHK_FIX_PRE_ALC (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE
) ;
/**************************************************************************
<SYNOPSIS>
	一次配賦結果反映時の確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<HISTORY>
**************************************************************************/

END MGPA_CALC_FIX ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MGPA_CALC_FIX
IS
	G_MSG	FCPA_ERR.MSG_BINDER ;

	G_LOG_NO	MAPA_META.BATCH_LOG_NO%TYPE ;
	G_LOG_SUB_KEY1	MAPA_META.BATCH_LOG_SUB_KEY1%TYPE ;
	G_LOG_SUB_KEY2	MAPA_META.BATCH_LOG_SUB_KEY2%TYPE ;

FUNCTION F_GET_CALC_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) RETURN MGT_CALC_FIX%ROWTYPE
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_FIXのレコードを返す
<REMARKS>
	存在しないときはエラーとなる
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	対象となるMGT_CALC_FIXのレコード
<HISTORY>
**************************************************************************/
AS
	L_REC	MGT_CALC_FIX%ROWTYPE ;
BEGIN
	BEGIN
		SELECT	t.*
		INTO	L_REC
		FROM	MGT_CALC_FIX t
		WHERE	0=0
		AND	t.CALC_GRP_CD = I_CALC_GRP_CD
		AND	t.YM = I_YM
		;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			FCPA_ERR.RAISE_APP_ERR('MGBXD0011', G_MSG) ;
	END ;

	RETURN L_REC ;

END F_GET_CALC_FIX ;

FUNCTION F_CHK_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
) RETURN MAPA_META.FLG%TYPE
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	確定済みのときは１、未確定のときは０を返す
<HISTORY>
**************************************************************************/
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	;

	IF L_CNT > 0 THEN
		RETURN '1' ;
	END IF ;

	RETURN '0' ;

END F_CHK_FIX ;

PROCEDURE P_CHK_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
AS
	L_FLG	MAPA_META.FLG%TYPE ;
BEGIN
	L_FLG := F_CHK_FIX(I_CALC_GRP_CD, I_YM) ;

	IF L_FLG = '1' THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0014', G_MSG) ;
	END IF ;

END P_CHK_FIX ;

PROCEDURE P_CHK_FIX_CALC_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	計算グループＣＤ・年月に対して確定されており、
	確定対象の原価計算ＮＯが入力値の原価計算ＮＯと異なるときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<IN>	I_CALC_NO
		原価計算ＮＯ
**************************************************************************/
AS
	L_CNT	NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	AND	t.CALC_NO != I_CALC_NO
	;

	IF L_CNT > 0 THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0014', G_MSG) ;
	END IF ;

END P_CHK_FIX_CALC_NO ;

PROCEDURE P_LOCK (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定情報(MGT_CALC_FIX)に対するロック処理
<REMARKS>
	NOWAITでロックする
	対象となるデータが存在しないときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
AS
	LOCK_ERROR     EXCEPTION ;
	PRAGMA EXCEPTION_INIT(LOCK_ERROR, -54) ;

	CURSOR LOCK_CALC_FIX
	IS
		SELECT	t.CALC_GRP_CD
		FROM	MGT_CALC_FIX t
		WHERE	0=0
		AND	t.CALC_GRP_CD = I_CALC_GRP_CD
		AND	t.YM = I_YM
		FOR UPDATE NOWAIT
	;

	L_REC	MGT_CALC_FIX%ROWTYPE ;
BEGIN
	L_REC := F_GET_CALC_FIX(I_CALC_GRP_CD, I_YM) ;

	OPEN LOCK_CALC_FIX ;
	CLOSE LOCK_CALC_FIX ;

EXCEPTION
WHEN LOCK_ERROR THEN
	G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
	FCPA_ERR.RAISE_APP_ERR('MGBXD0010', G_MSG) ;
END P_LOCK ;

PROCEDURE P_DEL_AVE_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定総平均単価データを削除する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
AS
BEGIN
	DELETE	MGT_AVE_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.CALC_NO = I_CALC_NO
	AND	t.YM = I_YM
	;
END P_DEL_AVE_FIX ;

PROCEDURE P_INS_AVE_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定総平均単価データを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
AS
	C_CALC_REC_AVE	CONSTANT MGPA_META.CALC_REC_TYP%TYPE := MGC_CALC_REC_TYP.AVE ;
BEGIN
	P_DEL_AVE_FIX(I_CALC_GRP_CD, I_CALC_NO, I_YM) ;

	INSERT INTO MGT_AVE_FIX (
		CALC_GRP_CD,
		WG_CD,
		YM,
		MNG_DPT_CD,
		ITM_CD,
		ITM_SUB1,
		ITM_SUB2,
		ITM_SUB3,
		LOT_NO,
		SUBLOT_NO,
		SNO1,
		SNO2,
		SNO3,
		SNO4,
		SPPL_CD,
		ASST_TYP,
		STD_QTY,
		AVE_UPRI,
		STD_UPRI,
		CALC_NO,
		TOP_REC_NO
		)
	SELECT	t1.CALC_GRP_CD,
		t1.WG_CD,
		t1.YM,
		t1.MNG_DPT_CD,
		t1.ITM_CD,
		t1.ITM_SUB1,
		t1.ITM_SUB2,
		t1.ITM_SUB3,
		t1.LOT_NO,
		t1.SUBLOT_NO,
		t1.SNO1,
		t1.SNO2,
		t1.SNO3,
		t1.SNO4,
		t1.BP_CD,
		t1.ASST_TYP,
		t1.QTY,
		NVL(SUM(t2.ACT_COST), 0),
		NVL(SUM(t2.STD_COST), 0),
		t1.CALC_NO,
		MAX(t1.TOP_REC_NO)
	FROM	MGT_ACC_TOP t1, MGT_ACC_SML_COST t2
	WHERE	0=0
	AND	t1.CALC_NO = I_CALC_NO
	AND	t1.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t1.CALC_REC_TYP = C_CALC_REC_AVE
	AND	t1.YM = I_YM
	AND	t1.CALC_NO = t2.CALC_NO(+)
	AND	t1.CALC_GRP_CD = t2.CALC_GRP_CD(+)
	AND	t1.TOP_REC_NO = t2.TOP_REC_NO(+)
	GROUP BY t1.CALC_GRP_CD,
		t1.WG_CD,
		t1.YM,
		t1.MNG_DPT_CD,
		t1.ITM_CD,
		t1.ITM_SUB1,
		t1.ITM_SUB2,
		t1.ITM_SUB3,
		t1.LOT_NO,
		t1.SUBLOT_NO,
		t1.SNO1,
		t1.SNO2,
		t1.SNO3,
		t1.SNO4,
		t1.BP_CD,
		t1.ASST_TYP,
		t1.QTY,
		t1.CALC_NO
	;

END P_INS_AVE_FIX ;

PROCEDURE P_INS_YM_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE
)
/**************************************************************************
<SYNOPSIS>
	年月別原価計算ＮＯデータを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
AS
	L_CALC_GRP	MAM_CALC_GRP%ROWTYPE ;
	L_ARG		MGT_ARG%ROWTYPE ;
	L_YM		MAPA_META.YM%TYPE ;

	L_ARG2		MGT_ARG%ROWTYPE ;
	L_CALC_NO2	MAPA_META.CALC_NO%TYPE ;

	TYPE LIST_YM IS TABLE OF MAPA_META.YM%TYPE INDEX BY BINARY_INTEGER ;
	rec_ym	LIST_YM ;
BEGIN
	IF I_CALC_GRP_CD IS NULL OR I_CALC_NO IS NULL THEN
		RETURN ;
	END IF ;

	L_CALC_GRP := MGPA_CALC_GRP.F_GET_REC(I_CALC_GRP_CD) ;

	IF L_CALC_GRP.MAX_MONS = 0 THEN
		RETURN ;
	END IF ;

	L_ARG := MGPA_ARG.F_GET_ARG(I_CALC_GRP_CD, I_CALC_NO) ;

	L_YM := L_ARG.ST_YM ;
	L_CALC_NO2 := NULL ;
	rec_ym.DELETE ;
	LOOP
		SELECT	MIN(t.CALC_NO)
		INTO	L_CALC_NO2
		FROM	MGT_YM_NO t
		WHERE	0=0
		AND	t.CALC_GRP_CD = I_CALC_GRP_CD
		AND	t.YM = L_YM
		;

		IF L_CALC_NO2 IS NOT NULL THEN
			IF I_CALC_NO <> L_CALC_NO2 THEN
				L_ARG2 := MGPA_ARG.F_GET_ARG(I_CALC_GRP_CD, L_CALC_NO2) ;
				IF L_ARG.ST_YM <> L_ARG2.ST_YM OR L_ARG.END_YM >= L_ARG2.END_YM THEN
					rec_ym(rec_ym.COUNT + 1) := L_YM ;
				END IF ;
			END IF ;
		ELSE
			rec_ym(rec_ym.COUNT + 1) := L_YM ;
		END IF ;

		IF L_YM >= L_ARG.END_YM THEN
			EXIT ;
		END IF ;

		L_YM := ADD_MONTHS(L_YM, 1) ;

	END LOOP ;

	IF rec_ym.COUNT = 0 THEN
		RETURN ;
	END IF ;

	FOR i IN 1..rec_ym.COUNT LOOP
		MERGE INTO MGT_YM_NO t
		USING	(
			SELECT	rec_ym(i)	YM
			FROM	DUAL
			) x
		ON	(0=0
			AND	t.CALC_GRP_CD = I_CALC_GRP_CD
			AND	t.YM = x.YM
			)
		WHEN MATCHED THEN
			UPDATE SET t.CALC_NO = I_CALC_NO
		WHEN NOT MATCHED THEN
			INSERT	(
				CALC_GRP_CD, YM, CALC_NO
				)
			VALUES	(
				I_CALC_GRP_CD, x.YM, I_CALC_NO
				)
		;
	END LOOP ;

	rec_ym.DELETE ;

END P_INS_YM_NO ;

PROCEDURE P_REMAKE_YM_NO (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	削除されるデータをもとに年月別原価計算ＮＯデータを再作成する
<REMARKS>
	作成対象の年月で確定されている原価計算ＮＯで再作成する
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		削除対象となる原価計算ＮＯ
<IN>	I_YM
		作成対象となる年月
<HISTORY>
**************************************************************************/
AS
	L_CALC_NO	MAPA_META.CALC_NO%TYPE ;
	L_CNT		NUMBER ;
BEGIN
	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_YM_NO t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	AND	t.CALC_NO != I_CALC_NO
	;

	IF L_CNT > 0 THEN
		RETURN ;
	END IF ;

	SELECT	MAX(t.CALC_NO)
	INTO	L_CALC_NO
	FROM	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	;

	IF L_CALC_NO IS NULL THEN
		RETURN ;
	END IF ;

	P_INS_YM_NO(I_CALC_GRP_CD, L_CALC_NO) ;

END P_REMAKE_YM_NO ;

PROCEDURE P_FIX (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
AS
	L_CALC_GRP	MAM_CALC_GRP%ROWTYPE ;
	L_CALC_NO	MAPA_META.CALC_NO%TYPE ;
	L_CNT		NUMBER ;
BEGIN
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0030', I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M), I_CALC_NO) ;

	L_CALC_GRP := MGPA_CALC_GRP.F_GET_REC(I_CALC_GRP_CD) ;

	IF L_CALC_GRP.MAX_MONS <= 0 THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0020', G_MSG) ;
	END IF ;

	-- 原価計算情報のロック
	MGPA_ARG.P_LOCK(I_CALC_GRP_CD, I_CALC_NO, '1') ;

	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	;

	IF L_CNT > 0 THEN
		RETURN ;
	END IF ;

	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MAM_GRP_WG m
	WHERE	0=0
	AND	m.CALC_GRP_CD = I_CALC_GRP_CD
	AND	NOT EXISTS (
				SELECT	'X'
				FROM	MAVM_WR_WG w
				WHERE	0=0
				AND	m.WG_CD = w.WG_CD
				)
	;

	IF L_CNT > 0 THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0047', G_MSG) ;
	END IF ;

	SELECT	MIN(t.CALC_NO)
	INTO	L_CALC_NO
	FROM	MGT_STK_LOSS t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	AND	t.CALC_NO != I_CALC_NO
	;

	IF L_CALC_NO IS NOT NULL THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M), L_CALC_NO) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0027', G_MSG) ;
	END IF ;

	FOR x IN (
		SELECT	t.TRD_CALC_NO,
			t.TRD_CALC_GRP_CD
		FROM	MGT_CALC_TRD_CALC_NO t
		WHERE	0=0
		AND	t.CALC_NO = I_CALC_NO
		AND	t.CALC_GRP_CD = I_CALC_GRP_CD
		)
	LOOP
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_ARG t
		WHERE	0=0
		AND	t.CALC_NO = x.TRD_CALC_NO
		AND	t.CALC_GRP_CD = x.TRD_CALC_GRP_CD
		AND	t.FIX_FLG = '1'
		;

		IF L_CNT = 0 THEN
			G_MSG := FCPA_ERR.MSG_BINDER(x.TRD_CALC_GRP_CD, x.TRD_CALC_NO) ;
			FCPA_ERR.RAISE_APP_ERR('MGBDD0018', G_MSG) ;
		END IF ;
	END LOOP ;

	INSERT INTO MGT_CALC_FIX (
		CALC_GRP_CD, YM, CALC_NO, AC_IF_FLG
		)
	VALUES	(
		I_CALC_GRP_CD, I_YM, I_CALC_NO, '0'
		)
	;

	INSERT INTO MGT_CTG_FIX (
		CALC_GRP_CD,
		YM,
		CALC_CTG_TYP,
		CALC_CTG_CD
		)
	SELECT	DISTINCT
		I_CALC_GRP_CD,
		I_YM,
		x.CALC_CTG_TYP,
		x.CALC_CTG_CD
	FROM	MAM_GRP_CTG x
	WHERE	0=0
	AND	x.CALC_GRP_CD = I_CALC_GRP_CD
	;

	INSERT INTO MGT_WG_FIX (
		CALC_GRP_CD,
		YM,
		WG_CD
		)
	SELECT	I_CALC_GRP_CD,
		I_YM,
		x.WG_CD
	FROM	MAM_GRP_WG x
	WHERE	0=0
	AND	x.CALC_GRP_CD = I_CALC_GRP_CD
	;

	-- 確定総平均単価作成処理
	P_INS_AVE_FIX(I_CALC_GRP_CD, I_CALC_NO, I_YM) ;

	-- 年月別原価計算ＮＯ情報作成処理
	P_INS_YM_NO(I_CALC_GRP_CD, I_CALC_NO) ;

	-- 繰越処理
	IF MGPA_CALC_GRP.F_CHK_MAX_MONS(MGPA_ARG.F_GET_ARG(I_CALC_GRP_CD, I_CALC_NO)) = '1' THEN
		MGPA_CARRY_OVER.P_MAIN(I_CALC_GRP_CD, I_CALC_NO) ;
	END IF ;

	UPDATE	MGT_ARG t
	SET	t.FIX_FLG = '1'
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.CALC_NO = I_CALC_NO
	;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_CALC_FIX.P_FIX') ;

END P_FIX ;

PROCEDURE P_CANCEL (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	確定取消処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
AS
	L_CALC_NO	MAPA_META.CALC_NO%TYPE ;
	L_CNT		NUMBER ;
BEGIN
	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0030', I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M), NULL) ;

	-- 確定情報のロック
	P_LOCK(I_CALC_GRP_CD, I_YM) ;

	SELECT	MAX(t.CALC_NO)
	INTO	L_CALC_NO
	FROM	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	AND	t.AC_IF_FLG = '0'
	;

	IF L_CALC_NO IS NULL THEN
		RETURN ;
	END IF ;

	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MAM_GRP_WG m
	WHERE	0=0
	AND	m.CALC_GRP_CD = I_CALC_GRP_CD
	AND	NOT EXISTS (
				SELECT	'X'
				FROM	MAVM_WR_WG w
				WHERE	0=0
				AND	m.WG_CD = w.WG_CD
				)
	;

	IF L_CNT > 0 THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0047', G_MSG) ;
	END IF ;

	SELECT	COUNT(*)
	INTO	L_CNT
	FROM	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM > I_YM
	;

	IF L_CNT > 0 THEN
		G_MSG := FCPA_ERR.MSG_BINDER(I_CALC_GRP_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0019', G_MSG) ;
	END IF ;

	-- 原価計算情報のロック
	MGPA_ARG.P_LOCK(I_CALC_GRP_CD, L_CALC_NO, '1') ;

	FOR x IN (
		SELECT	t.CALC_NO,
			t.CALC_GRP_CD
		FROM	MGT_CALC_TRD_CALC_NO t
		WHERE	0=0
		AND	t.TRD_CALC_NO = L_CALC_NO
		AND	t.TRD_CALC_GRP_CD = I_CALC_GRP_CD
		)
	LOOP
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MGT_ARG t
		WHERE	0=0
		AND	t.CALC_NO = x.CALC_NO
		AND	t.CALC_GRP_CD = x.CALC_GRP_CD
		AND	t.FIX_FLG = '1'
		;

		IF L_CNT > 0 THEN
			G_MSG := FCPA_ERR.MSG_BINDER(x.CALC_GRP_CD, x.CALC_NO) ;
			FCPA_ERR.RAISE_APP_ERR('MGBDD0019', G_MSG) ;
		END IF ;
	END LOOP ;

	-- 確定総平均単価削除処理
	P_DEL_AVE_FIX(I_CALC_GRP_CD, L_CALC_NO, I_YM) ;

	DELETE	MGT_WG_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	;

	DELETE	MGT_CTG_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	;

	DELETE	MGT_CALC_FIX t
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.YM = I_YM
	AND	t.AC_IF_FLG = '0'
	;

	UPDATE	MGT_ARG t
	SET	t.FIX_FLG = '0'
	WHERE	0=0
	AND	t.CALC_GRP_CD = I_CALC_GRP_CD
	AND	t.CALC_NO = L_CALC_NO
	;

	FCPA_BATCH_LOG.P_PROC_LOG('MGBXD0002', 'MGPA_CALC_FIX.P_CANCEL') ;

END P_CANCEL ;

PROCEDURE P_CHK_FIX_ACT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_MFG		IN MAPA_META.FLG%TYPE,
	I_PURC		IN MAPA_META.FLG%TYPE,
	I_INPT		IN MAPA_META.FLG%TYPE,
	I_INST_WK	IN MAPA_META.FLG%TYPE,
	I_OTHER_WK	IN MAPA_META.FLG%TYPE,
	I_INST_WIP	IN MAPA_META.FLG%TYPE,
	I_IO		IN MAPA_META.FLG%TYPE,
	I_SLS		IN MAPA_META.FLG%TYPE,
	I_STK		IN MAPA_META.FLG%TYPE
)
/**************************************************************************
<SYNOPSIS>
	実績データに対する確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_MFG
		製造実績 0:実行しない 1:実行する
<IN>	I_PURC
		購買実績 0:実行しない 1:実行する
<IN>	I_INPT
		投入実績 0:実行しない 1:実行する
<IN>	I_INST_WK
		指図工数実績 0:実行しない 1:実行する
<IN>	I_OTHER_WK
		指図外工数実績 0:実行しない 1:実行する
<IN>	I_INST_WIP
		指図仕掛実績 0:実行しない 1:実行する
<IN>	I_IO
		入出庫実績 0:実行しない 1:実行する
<IN>	I_SLS
		売上実績 0:実行しない 1:実行する
<IN>	I_STK
		在庫実績 0:実行しない 1:実行する
<HISTORY>
**************************************************************************/
AS
	C_SA_ACT	CONSTANT MAPA_META.SA_TYP%TYPE := MAC_SA_TYP.ACT ;

	C_CTG_MFG	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.MFG ;
	C_CTG_PURC	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.PURC ;
	C_CTG_INPT	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.INPT ;
	C_CTG_WK	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.WK ;
	C_CTG_OTHER_WK	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.OTHER_WK ;
	C_CTG_INST_WIP	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.INST_WIP ;
	C_CTG_IO	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.IO ;
	C_CTG_SLS	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.SLS ;
	C_CTG_END_STK	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.END_STK ;

	L_ERR_FLG	MAPA_META.FLG%TYPE := '0' ;

	L_CNT	NUMBER := 0 ;
BEGIN
	IF I_MFG = '0'
	AND I_PURC = '0'
	AND I_INPT = '0'
	AND I_INST_WK = '0'
	AND I_OTHER_WK = '0'
	AND I_INST_WIP = '0'
	AND I_IO = '0'
	AND I_SLS = '0'
	AND I_STK = '0'
	THEN
		RETURN ;
	END IF ;

	FOR x IN (
		SELECT	t1.CALC_GRP_CD
		FROM	MGT_CALC_FIX t1, MGT_ARG t2
		WHERE	0=0
		AND	t1.YM = I_YM
		AND	t1.CALC_NO = t2.CALC_NO
		AND	t1.CALC_GRP_CD = t2.CALC_GRP_CD
		AND	t2.SA_TYP = C_SA_ACT
		)
	LOOP
		SELECT	COUNT(t.WG_CD)
		INTO	L_CNT
		FROM	MGT_WG_FIX t
		WHERE	0=0
		AND	t.CALC_GRP_CD = x.CALC_GRP_CD
		AND	t.YM = I_YM
		AND	t.WG_CD = I_WG_CD
		;

		IF L_CNT = 0 THEN
			CONTINUE ;
		END IF ;

		IF I_MFG = '1' THEN
			--製造実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_MFG
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_MFG', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;

		IF I_PURC = '1' THEN
			--購買実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_PURC
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_PURC', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;

		IF I_INPT = '1' THEN
			--投入実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_INPT
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_INPT', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;

		IF I_INST_WK = '1' THEN
			--指図工数実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_WK
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_INST_WK', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;

		IF I_OTHER_WK = '1' THEN
			--指図外工数実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_OTHER_WK
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_OTHER_WK', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;

		IF I_INST_WIP = '1' THEN
			--指図仕掛実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_INST_WIP
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_INST_WIP', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;

		IF I_IO = '1' THEN
			--入出庫実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_IO
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_IO', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;

		IF I_SLS = '1' THEN
			--売上実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_SLS
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_SLS', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;

		IF I_STK = '1' THEN
			--在庫実績
			SELECT	COUNT(t.CALC_CTG_CD)
			INTO	L_CNT
			FROM	MGT_CTG_FIX t
			WHERE	0=0
			AND	t.CALC_GRP_CD = x.CALC_GRP_CD
			AND	t.YM = I_YM
			AND	t.CALC_CTG_TYP = C_CTG_END_STK
			AND	t.CALC_CTG_CD = I_CALC_CTG_CD
			;

			IF L_CNT > 0 THEN
				L_ERR_FLG := '1' ;
				FCPA_BATCH_LOG.P_DATA_LOG('MGBXD0016', G_LOG_NO, G_LOG_SUB_KEY1, G_LOG_SUB_KEY2, 'MGT_ACT_STK', x.CALC_GRP_CD, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
			END IF ;
		END IF ;
	END LOOP ;

	IF L_ERR_FLG = '1' THEN
		FCPA_ERR.RAISE_APP_ERR('MGBXD0005') ;
	END IF ;

END P_CHK_FIX_ACT ;

PROCEDURE P_CHK_FIX_ACT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE,
	I_MFG		IN MAPA_META.FLG%TYPE,
	I_TRAN		IN MAPA_META.FLG%TYPE,
	I_STK		IN MAPA_META.FLG%TYPE
)
/**************************************************************************
<SYNOPSIS>
	実績データに対する確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_MFG
		製造実績関連(製造、購買、投入、工数、品目製造指図、指図工程) 0:実行しない 1:実行する
<IN>	I_TRAN
		入出庫関連(入出庫、売上) 0:実行しない 1:実行する
<IN>	I_STK
		在庫情報 0:実行しない 1:実行する
<HISTORY>
**************************************************************************/
AS
	L_MFG		MAPA_META.FLG%TYPE := '0' ;
	L_PURC		MAPA_META.FLG%TYPE := '0' ;
	L_INPT		MAPA_META.FLG%TYPE := '0' ;
	L_INST_WK	MAPA_META.FLG%TYPE := '0' ;
	L_OTHER_WK	MAPA_META.FLG%TYPE := '0' ;
	L_INST_WIP	MAPA_META.FLG%TYPE := '0' ;
	L_IO		MAPA_META.FLG%TYPE := '0' ;
	L_SLS		MAPA_META.FLG%TYPE := '0' ;
	L_STK		MAPA_META.FLG%TYPE := '0' ;
BEGIN
	IF I_MFG = '1' THEN
		L_MFG := '1' ;
		L_PURC := '1' ;
		L_INPT := '1' ;
		L_INST_WK := '1' ;
		L_OTHER_WK := '1' ;
		L_INST_WIP := '1' ;
	END IF ;

	IF I_TRAN = '1' THEN
		L_IO := '1' ;
		L_SLS := '1' ;
	END IF ;

	IF I_STK = '1' THEN
		L_STK := '1' ;
	END IF ;

	P_CHK_FIX_ACT(I_CALC_CTG_CD, I_WG_CD, I_YM, L_MFG, L_PURC, L_INPT, L_INST_WK, L_OTHER_WK, L_INST_WIP, L_IO, L_SLS, L_STK) ;
END P_CHK_FIX_ACT ;

PROCEDURE P_CHK_FIX_ACT_AMT (
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE,
	I_WG_CD		IN MAPA_META.WG_CD%TYPE,
	I_YM		IN MAPA_META.YM%TYPE
)
/**************************************************************************
<SYNOPSIS>
	配賦費用実績データに対する確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
AS
	C_SA_ACT	CONSTANT MAPA_META.SA_TYP%TYPE := MAC_SA_TYP.ACT ;

	C_CTG_ALC_AMT	CONSTANT MAPA_META.CALC_CTG_TYP%TYPE := MAC_CALC_CTG_TYP.ALC_AMT ;

	L_CALC_GRP	MAPA_META.CALC_GRP_CD%TYPE ;
BEGIN
	SELECT	MIN(t1.CALC_GRP_CD)
	INTO	L_CALC_GRP
	FROM	MGT_CTG_FIX t1, MGT_WG_FIX t2, MGT_ARG t3
	WHERE	0=0
	AND	t1.CALC_CTG_TYP = C_CTG_ALC_AMT
	AND	t1.CALC_CTG_CD = I_CALC_CTG_CD
	AND	t1.YM = I_YM
	AND	t2.WG_CD = I_WG_CD
	AND	t2.YM = I_YM
	AND	t1.CALC_GRP_CD = t2.CALC_GRP_CD
	AND	t2.CALC_GRP_CD = t3.CALC_GRP_CD
	AND	t2.YM = t3.END_YM
	AND	t3.SA_TYP = C_SA_ACT
	;

	IF L_CALC_GRP IS NOT NULL THEN
		G_MSG := FCPA_ERR.MSG_BINDER(L_CALC_GRP, I_CALC_CTG_CD, I_WG_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_YM, FCPA_DATE_UTIL.Y4M)) ;
		FCPA_ERR.RAISE_APP_ERR('MGBXD0026', G_MSG) ;
	END IF ;

END P_CHK_FIX_ACT_AMT ;

PROCEDURE P_CHK_FIX_PRE_ALC (
	I_CALC_GRP_CD	IN MAPA_META.CALC_GRP_CD%TYPE,
	I_CALC_NO	IN MAPA_META.CALC_NO%TYPE,
	I_CALC_CTG_CD	IN MAPA_META.CALC_CTG_CD%TYPE
)
/**************************************************************************
<SYNOPSIS>
	一次配賦結果反映時の確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<HISTORY>
**************************************************************************/
AS
BEGIN
	FOR x IN (
		SELECT	DISTINCT
			t.WG_CD,
			t.YM
		FROM	MGT_PRE_ALC t
		WHERE	0=0
		AND	t.CALC_NO = I_CALC_NO
		AND	t.CALC_GRP_CD = I_CALC_GRP_CD
		)
	LOOP
		P_CHK_FIX_ACT_AMT(I_CALC_CTG_CD, x.WG_CD, x.YM) ;
	END LOOP ;

END P_CHK_FIX_PRE_ALC ;

END MGPA_CALC_FIX ;

/
show errors;


