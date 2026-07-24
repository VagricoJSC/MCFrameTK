CREATE OR REPLACE PACKAGE MAPA_AMT
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
	);
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

	FUNCTION F_GET_EXC_TAX_AMT (
		I_UPRI			IN	MAPA_META.MONEY%TYPE,
		I_QTY			IN	MAPA_META.QTY%TYPE,
		I_AMT_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_TAX_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_AMT_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
		I_INC_TAX_FLG	IN	MAPA_META.FLG%TYPE,
		I_TAX_RATE		IN	MAPA_META.TAX_RATE%TYPE,
		I_DSCNT_AMT		IN	MAPA_META.MONEY%TYPE DEFAULT 0
	) RETURN MAPA_META.MONEY%TYPE;
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

	FUNCTION F_GET_INC_TAX_AMT (
		I_UPRI			IN	MAPA_META.MONEY%TYPE,
		I_QTY			IN	MAPA_META.QTY%TYPE,
		I_AMT_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_TAX_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		I_AMT_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
		I_INC_TAX_FLG	IN	MAPA_META.FLG%TYPE,
		I_TAX_RATE		IN	MAPA_META.TAX_RATE%TYPE,
		I_DSCNT_AMT		IN	MAPA_META.MONEY%TYPE DEFAULT 0
	) RETURN MAPA_META.MONEY%TYPE;
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
	);
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
	) RETURN MAPA_META.MONEY%TYPE;
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
	) RETURN MAPA_META.MONEY%TYPE;
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

END;
/
