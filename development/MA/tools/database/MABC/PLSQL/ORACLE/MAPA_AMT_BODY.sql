CREATE OR REPLACE PACKAGE BODY MAPA_AMT
/*********************************************************
<SYNOPSIS>
		金額取得ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS

	PROCEDURE P_GET_AMT_AND_TAX (
		I_UPRI			IN	MAPA_META.MONEY%TYPE,
		I_QTY			IN	MAPA_META.QTY%TYPE,
		I_AMT_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_TAX_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_AMT_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
		I_INC_TAX_FLG	IN	MAPA_META.FLG%TYPE,
		I_TAX_RATE		IN	MAPA_META.TAX_RATE%TYPE,
		I_DSCNT_AMT		IN	MAPA_META.MONEY%TYPE DEFAULT 0,
		O_AMT			OUT	MAPA_META.MONEY%TYPE,
		O_TAX_AMT		OUT	MAPA_META.MONEY%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		金額と消費税額を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_UPRI
			単価
	<IN>	I_QTY
			数量
	<IN>	I_AMT_RND_TYP
			金額端数処理区分
	<IN>	I_TAX_RND_TYP
			消費税端数処理区分
	<IN>	I_AMT_DEC_PLACE
			金額小数部有効桁数
	<IN>	I_INC_TAX_FLG
			内税ＦＬＧ
	<IN>	I_TAX_RATE
			消費税率
	<IN>	I_DSCNT_AMT
			値引額
	<OUT>	O_AMT
			金額
	<OUT>	O_TAX_AMT
			消費税額
	<RETURN VALUE>
	<HISTORY>
	**********************************************************/
	IS
		L_TMP_AMT NUMBER;
	BEGIN

		L_TMP_AMT := MAPA_CALC.F_RND_NE(I_UPRI * I_QTY, I_AMT_DEC_PLACE, I_AMT_RND_TYP) - NVL(I_DSCNT_AMT, 0);

		IF I_INC_TAX_FLG = '1' THEN
			O_TAX_AMT := MAPA_CALC.F_RND_NE(L_TMP_AMT * (I_TAX_RATE / (100 + I_TAX_RATE)), I_AMT_DEC_PLACE, I_TAX_RND_TYP);
			O_AMT := L_TMP_AMT - O_TAX_AMT;
		ELSIF I_INC_TAX_FLG = '0' THEN
			O_TAX_AMT := MAPA_CALC.F_RND_NE(L_TMP_AMT * I_TAX_RATE / 100, I_AMT_DEC_PLACE, I_TAX_RND_TYP);
			O_AMT := L_TMP_AMT;
		END IF;
	
	END P_GET_AMT_AND_TAX;
	
	FUNCTION F_GET_EXC_TAX_AMT (
		I_UPRI			IN	MAPA_META.MONEY%TYPE,
		I_QTY			IN	MAPA_META.QTY%TYPE,
		I_AMT_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_TAX_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_AMT_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
		I_INC_TAX_FLG	IN	MAPA_META.FLG%TYPE,
		I_TAX_RATE		IN	MAPA_META.TAX_RATE%TYPE,
		I_DSCNT_AMT		IN	MAPA_META.MONEY%TYPE DEFAULT 0
	) RETURN MAPA_META.MONEY%TYPE
	/*********************************************************
	<SYNOPSIS>
		税抜金額を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_UPRI
			単価
	<IN>	I_QTY
			数量
	<IN>	I_AMT_RND_TYP
			金額端数処理区分
	<IN>	I_TAX_RND_TYP
			消費税端数処理区分
	<IN>	I_AMT_DEC_PLACE
			金額小数部有効桁数
	<IN>	I_INC_TAX_FLG
			内税ＦＬＧ
	<IN>	I_TAX_RATE
			消費税率
	<IN>	I_DSCNT_AMT
			値引額
	<RETURN VALUE>
			税抜金額
	<HISTORY>
	**********************************************************/
	IS
		L_AMT			NUMBER;
		L_TAX_AMT		NUMBER;
	BEGIN

		P_GET_AMT_AND_TAX (
			I_UPRI,
			I_QTY,
			I_AMT_RND_TYP,
			I_TAX_RND_TYP,
			I_AMT_DEC_PLACE,
			I_INC_TAX_FLG,
			I_TAX_RATE,
			I_DSCNT_AMT,
			L_AMT,
			L_TAX_AMT
		);

		RETURN L_AMT;

	END F_GET_EXC_TAX_AMT;

	FUNCTION F_GET_INC_TAX_AMT (
		I_UPRI			IN	MAPA_META.MONEY%TYPE,
		I_QTY			IN	MAPA_META.QTY%TYPE,
		I_AMT_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_TAX_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_AMT_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
		I_INC_TAX_FLG	IN	MAPA_META.FLG%TYPE,
		I_TAX_RATE		IN	MAPA_META.TAX_RATE%TYPE,
		I_DSCNT_AMT		IN	MAPA_META.MONEY%TYPE DEFAULT 0
	) RETURN MAPA_META.MONEY%TYPE
	/*********************************************************
	<SYNOPSIS>
		税込金額を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_UPRI
			単価
	<IN>	I_QTY
			数量
	<IN>	I_AMT_RND_TYP
			金額端数処理区分
	<IN>	I_TAX_RND_TYP
			消費税端数処理区分
	<IN>	I_AMT_DEC_PLACE
			金額小数部有効桁数
	<IN>	I_INC_TAX_FLG
			内税ＦＬＧ
	<IN>	I_TAX_RATE
			消費税率
	<IN>	I_DSCNT_AMT
			値引額
	<RETURN VALUE>
			税込金額
	<HISTORY>
	**********************************************************/
	IS
		L_AMT			NUMBER;
		L_TAX_AMT		NUMBER;
	BEGIN

		P_GET_AMT_AND_TAX (
			I_UPRI,
			I_QTY,
			I_AMT_RND_TYP,
			I_TAX_RND_TYP,
			I_AMT_DEC_PLACE,
			I_INC_TAX_FLG,
			I_TAX_RATE,
			I_DSCNT_AMT,
			L_AMT,
			L_TAX_AMT
		);

		RETURN L_AMT + L_TAX_AMT;

	END F_GET_INC_TAX_AMT;

	PROCEDURE P_GET_PURC_AMT_AND_TAX (
		I_UPRI				IN	MAPA_META.MONEY%TYPE,
		I_PROC_UPRI			IN	MAPA_META.MONEY%TYPE DEFAULT 0,
		I_QTY				IN	MAPA_META.QTY%TYPE,
		I_AMT_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_TAX_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_AMT_DEC_PLACE		IN	MAPA_META.DEC_PLACE%TYPE,
		I_INC_TAX_FLG		IN	MAPA_META.FLG%TYPE,
		I_TAX_RATE			IN	MAPA_META.TAX_RATE%TYPE,
		I_DSCNT_AMT			IN	MAPA_META.MONEY%TYPE DEFAULT 0,
		I_OUTSRC_FLG		IN	MAPA_META.FLG%TYPE,
		I_REPURC_OBLI_FLG	IN	MAPA_META.FLG%TYPE,
		O_AMT				OUT	MAPA_META.MONEY%TYPE,
		O_TAX_AMT			OUT	MAPA_META.MONEY%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		仕入の金額と消費税額を取得する。
		外注がオンかつ買戻義務がオンの場合は、消費税額は加工金額をもとに計算する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_UPRI
			単価
	<IN>	I_PROC_UPRI
			加工単価
	<IN>	I_QTY
			数量
	<IN>	I_AMT_RND_TYP
			金額端数処理区分
	<IN>	I_TAX_RND_TYP
			消費税端数処理区分
	<IN>	I_AMT_DEC_PLACE
			金額小数部有効桁数
	<IN>	I_INC_TAX_FLG
			内税ＦＬＧ
	<IN>	I_TAX_RATE
			消費税率
	<IN>	I_DSCNT_AMT
			値引額
	<IN>	I_OUTSRC_FLG
			外注ＦＬＧ
	<IN>	I_REPURC_OBLI_FLG
			買戻義務ＦＬＧ
	<OUT>	O_AMT
			仕入金額
	<OUT>	O_TAX_AMT
			仕入消費税額
	<RETURN VALUE>
	<HISTORY>
	**********************************************************/
	IS
		L_TMP_AMT NUMBER;
		L_TMP_PROC_AMT NUMBER;
		L_TMP_TAX_ABL_AMT NUMBER;
	BEGIN

		L_TMP_AMT := MAPA_CALC.F_RND_NE(I_UPRI * I_QTY, I_AMT_DEC_PLACE, I_AMT_RND_TYP) - NVL(I_DSCNT_AMT, 0);
		L_TMP_PROC_AMT := MAPA_CALC.F_RND_NE(I_PROC_UPRI * I_QTY, I_AMT_DEC_PLACE, I_AMT_RND_TYP) - NVL(I_DSCNT_AMT, 0);
		IF I_OUTSRC_FLG = '1' AND I_REPURC_OBLI_FLG = '1' THEN
			L_TMP_TAX_ABL_AMT := L_TMP_PROC_AMT;
		ELSE
			L_TMP_TAX_ABL_AMT := L_TMP_AMT;
		END IF;

		IF I_INC_TAX_FLG = '1' THEN
			O_TAX_AMT := MAPA_CALC.F_RND_NE(L_TMP_TAX_ABL_AMT * (I_TAX_RATE / (100 + I_TAX_RATE)), I_AMT_DEC_PLACE, I_TAX_RND_TYP);
			O_AMT := L_TMP_AMT - O_TAX_AMT;
		ELSIF I_INC_TAX_FLG = '0' THEN
			O_TAX_AMT := MAPA_CALC.F_RND_NE(L_TMP_TAX_ABL_AMT * I_TAX_RATE / 100, I_AMT_DEC_PLACE, I_TAX_RND_TYP);
			O_AMT := L_TMP_AMT;
		END IF;
	
	END P_GET_PURC_AMT_AND_TAX;

	FUNCTION F_GET_PURC_EXC_TAX_AMT (
		I_UPRI				IN	MAPA_META.MONEY%TYPE,
		I_PROC_UPRI			IN	MAPA_META.MONEY%TYPE DEFAULT 0,
		I_QTY				IN	MAPA_META.QTY%TYPE,
		I_AMT_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_TAX_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_AMT_DEC_PLACE		IN	MAPA_META.DEC_PLACE%TYPE,
		I_INC_TAX_FLG		IN	MAPA_META.FLG%TYPE,
		I_TAX_RATE			IN	MAPA_META.TAX_RATE%TYPE,
		I_DSCNT_AMT			IN	MAPA_META.MONEY%TYPE DEFAULT 0,
		I_OUTSRC_FLG		IN	MAPA_META.FLG%TYPE,
		I_REPURC_OBLI_FLG	IN	MAPA_META.FLG%TYPE
	) RETURN MAPA_META.MONEY%TYPE
	/*********************************************************
	<SYNOPSIS>
		仕入税抜金額を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_UPRI
			単価
	<IN>	I_PROC_UPRI
			加工単価
	<IN>	I_QTY
			数量
	<IN>	I_AMT_RND_TYP
			金額端数処理区分
	<IN>	I_TAX_RND_TYP
			消費税端数処理区分
	<IN>	I_AMT_DEC_PLACE
			金額小数部有効桁数
	<IN>	I_INC_TAX_FLG
			内税ＦＬＧ
	<IN>	I_TAX_RATE
			消費税率
	<IN>	I_DSCNT_AMT
			値引額
	<IN>	I_OUTSRC_FLG
			外注ＦＬＧ
	<IN>	I_REPURC_OBLI_FLG
			買戻義務ＦＬＧ
	<RETURN VALUE>
			仕入税抜金額
	<HISTORY>
	**********************************************************/
	IS
		L_AMT			NUMBER;
		L_TAX_AMT		NUMBER;
	BEGIN

		P_GET_PURC_AMT_AND_TAX (
			I_UPRI,
			I_PROC_UPRI,
			I_QTY,
			I_AMT_RND_TYP,
			I_TAX_RND_TYP,
			I_AMT_DEC_PLACE,
			I_INC_TAX_FLG,
			I_TAX_RATE,
			I_DSCNT_AMT,
			I_OUTSRC_FLG,
			I_REPURC_OBLI_FLG,
			L_AMT,
			L_TAX_AMT
		);

		RETURN L_AMT;

	END F_GET_PURC_EXC_TAX_AMT;

	FUNCTION F_GET_PURC_INC_TAX_AMT (
		I_UPRI				IN	MAPA_META.MONEY%TYPE,
		I_PROC_UPRI			IN	MAPA_META.MONEY%TYPE DEFAULT 0,
		I_QTY				IN	MAPA_META.QTY%TYPE,
		I_AMT_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_TAX_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_AMT_DEC_PLACE		IN	MAPA_META.DEC_PLACE%TYPE,
		I_INC_TAX_FLG		IN	MAPA_META.FLG%TYPE,
		I_TAX_RATE			IN	MAPA_META.TAX_RATE%TYPE,
		I_DSCNT_AMT			IN	MAPA_META.MONEY%TYPE DEFAULT 0,
		I_OUTSRC_FLG		IN	MAPA_META.FLG%TYPE,
		I_REPURC_OBLI_FLG	IN	MAPA_META.FLG%TYPE
	) RETURN MAPA_META.MONEY%TYPE
	/*********************************************************
	<SYNOPSIS>
		仕入税込金額を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_UPRI
			単価
	<IN>	I_PROC_UPRI
			加工単価
	<IN>	I_QTY
			数量
	<IN>	I_AMT_RND_TYP
			金額端数処理区分
	<IN>	I_TAX_RND_TYP
			消費税端数処理区分
	<IN>	I_AMT_DEC_PLACE
			金額小数部有効桁数
	<IN>	I_INC_TAX_FLG
			内税ＦＬＧ
	<IN>	I_TAX_RATE
			消費税率
	<IN>	I_DSCNT_AMT
			値引額
	<IN>	I_OUTSRC_FLG
			外注ＦＬＧ
	<IN>	I_REPURC_OBLI_FLG
			買戻義務ＦＬＧ
	<RETURN VALUE>
			仕入税込金額
	<HISTORY>
	**********************************************************/
	IS
		L_AMT			NUMBER;
		L_TAX_AMT		NUMBER;
	BEGIN

		P_GET_PURC_AMT_AND_TAX (
			I_UPRI,
			I_PROC_UPRI,
			I_QTY,
			I_AMT_RND_TYP,
			I_TAX_RND_TYP,
			I_AMT_DEC_PLACE,
			I_INC_TAX_FLG,
			I_TAX_RATE,
			I_DSCNT_AMT,
			I_OUTSRC_FLG,
			I_REPURC_OBLI_FLG,
			L_AMT,
			L_TAX_AMT
		);

		RETURN L_AMT + L_TAX_AMT;

	END F_GET_PURC_INC_TAX_AMT;

END;
/
