SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MAPA_STD_COST
/*********************************************************
<Synopsis>
		標準単価関連ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_GET_STD_UPRI (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_DT		IN	MAPA_META.DT%TYPE,
		I_WG_CD		IN	MAPA_META.WG_CD%TYPE,
		I_STD_UPRI_SEL_TYP IN	MAPA_META.STD_UPRI_SEL_TYP%TYPE DEFAULT '1'
	) RETURN MAPA_META.MONEY%TYPE;
	/*********************************************************
	<SYNOPSIS>
		標準単価の取得
	<REMARKS>
		標準単価マスタから標準単価を取得する
		１単位あたりの標準単価を取得し、端数処理は行なわない
		I_STD_UPRI_SEL_TYPが設定されていない場合は1(標準単価)とみなす
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_DT
			日付
	<IN>	I_WG_CD
			ＷＧコード
	<IN>	I_STD_UPRI_SEL_TYP
			標準単価取得区分
	<RETURN VALUE>
			標準単価
	<HISTORY>
	**********************************************************/
	
	FUNCTION F_GET_STD_AMT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_DT		IN	MAPA_META.DT%TYPE,
		I_WG_CD		IN	MAPA_META.WG_CD%TYPE,
		I_QTY		IN	MAPA_META.QTY%TYPE,
		I_STD_UPRI_SEL_TYP IN	MAPA_META.STD_UPRI_SEL_TYP%TYPE DEFAULT '1'
	) RETURN MAPA_META.MONEY%TYPE;
	/*********************************************************
	<SYNOPSIS>
		標準金額の取得
	<REMARKS>
		標準単価マスタから取得した標準単価に数量を掛け金額を算出する
		会社マスタの在庫金額端数処理区分、在庫金額小数部有効桁数に従って
		端数処理を行なう
		I_STD_UPRI_SEL_TYPが設定されていない場合は1(標準単価)とみなす
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_DT
			日付
	<IN>	I_WG_CD
			ＷＧコード
	<IN>	I_QTY
			数量
	<IN>	I_STD_UPRI_SEL_TYP
			標準単価取得区分
	<RETURN VALUE>
			標準金額
	<HISTORY>
	**********************************************************/

END MAPA_STD_COST;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_STD_COST
IS
	FUNCTION F_GET_STD_UPRI (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_DT		IN	MAPA_META.DT%TYPE,
		I_WG_CD		IN	MAPA_META.WG_CD%TYPE,
		I_STD_UPRI_SEL_TYP IN	MAPA_META.STD_UPRI_SEL_TYP%TYPE DEFAULT '1'
	) RETURN MAPA_META.MONEY%TYPE
	/*********************************************************
	<SYNOPSIS>
		標準単価の取得
	<REMARKS>
		標準単価マスタから標準単価を取得する
		１単位あたりの標準単価を取得し、端数処理は行なわない
		I_STD_UPRI_SEL_TYPが設定されていない場合は1(標準単価)とみなす
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_DT
			日付
	<IN>	I_WG_CD
			ＷＧコード
	<IN>	I_STD_UPRI_SEL_TYP
			標準単価取得区分
	<RETURN VALUE>
			標準単価
	<HISTORY>
	**********************************************************/
	IS
		L_TERM		MAPA_META.YM%TYPE ;
		L_STD_UPRI	MAPA_META.MONEY%TYPE ;
		L_STD_QTY	MAPA_META.QTY%TYPE ;
		L_ACYM		MAPA_META.YM%TYPE ;
	BEGIN
		L_STD_UPRI := 0 ;
		L_ACYM := MAPA_DT.F_GET_AC_YM(I_DT);

		-- 指定日付に対応した期を対象期間マスタから取得
		SELECT	MAX(m.TERM)
		INTO	L_TERM
		FROM	MAM_TERM m
		WHERE	0=0
		AND	m.TERM <= L_ACYM
		AND	L_ACYM < m.TERM_END_YM
		;

		IF L_TERM IS NULL THEN
			RETURN L_STD_UPRI ;
		END IF;

		-- 標準単価マスタから標準単価取得
		SELECT	NVL(MIN(
				DECODE(I_STD_UPRI_SEL_TYP, 
					MAC_STD_UPRI_SEL_TYP.SUB_UPRI1, NVL(m.SUB_UPRI1, m.STD_UPRI),
					MAC_STD_UPRI_SEL_TYP.SUB_UPRI2, NVL(m.SUB_UPRI2, m.STD_UPRI),
					MAC_STD_UPRI_SEL_TYP.SUB_UPRI3, NVL(m.SUB_UPRI3, m.STD_UPRI),
					m.STD_UPRI)
				)
			, 0),
			NVL(MIN(m.STD_QTY), 0)
		INTO	L_STD_UPRI,
			L_STD_QTY
		FROM	MAM_STDCOST m
		WHERE	0=0
		AND	m.ITM_CD   = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.TERM     = L_TERM
		AND	m.WG_CD    = I_WG_CD
		;

		IF L_STD_QTY = 0 THEN
			L_STD_UPRI := 0 ;
		ELSE
			L_STD_UPRI := L_STD_UPRI / L_STD_QTY ;
		END IF ;

		RETURN L_STD_UPRI ;

	END F_GET_STD_UPRI ;

	FUNCTION F_GET_STD_AMT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_DT		IN	MAPA_META.DT%TYPE,
		I_WG_CD		IN	MAPA_META.WG_CD%TYPE,
		I_QTY		IN	MAPA_META.QTY%TYPE,
		I_STD_UPRI_SEL_TYP IN	MAPA_META.STD_UPRI_SEL_TYP%TYPE DEFAULT '1'
	) RETURN MAPA_META.MONEY%TYPE
	/*********************************************************
	<SYNOPSIS>
		標準金額の取得
	<REMARKS>
		標準単価マスタから取得した標準単価に数量を掛け金額を算出する
		会社マスタの在庫金額端数処理区分、在庫金額小数部有効桁数に従って
		端数処理を行なう
		I_STD_UPRI_SEL_TYPが設定されていない場合は1(標準単価)とみなす
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_DT
			日付
	<IN>	I_WG_CD
			ＷＧコード
	<IN>	I_QTY
			数量
	<IN>	I_STD_UPRI_SEL_TYP
			標準単価取得区分
	<RETURN VALUE>
			標準金額
	<HISTORY>
	**********************************************************/
	IS
		L_TERM		MAPA_META.YM%TYPE ;
		L_STD_UPRI	MAPA_META.MONEY%TYPE ;
		L_STD_QTY	MAPA_META.QTY%TYPE ;
		L_STD_AMT	MAPA_META.MONEY%TYPE ;
		L_ACYM		MAPA_META.YM%TYPE ;

		L_CO		MAM_CO%ROWTYPE ;
	BEGIN
		L_STD_AMT := 0 ;
		L_ACYM := MAPA_DT.F_GET_AC_YM(I_DT);

		-- 指定日付に対応した期を対象期間マスタから取得
		SELECT	MAX(m.TERM)
		INTO	L_TERM
		FROM	MAM_TERM m
		WHERE	0=0
		AND	m.TERM <= L_ACYM
		AND	L_ACYM < m.TERM_END_YM
		;

		IF L_TERM IS NULL THEN
			RETURN L_STD_AMT ;
		END IF;

		-- 標準単価マスタから標準単価取得
		SELECT	NVL(MIN(
				DECODE(I_STD_UPRI_SEL_TYP, 
					MAC_STD_UPRI_SEL_TYP.SUB_UPRI1, NVL(m.SUB_UPRI1, m.STD_UPRI),
					MAC_STD_UPRI_SEL_TYP.SUB_UPRI2, NVL(m.SUB_UPRI2, m.STD_UPRI),
					MAC_STD_UPRI_SEL_TYP.SUB_UPRI3, NVL(m.SUB_UPRI3, m.STD_UPRI),
					m.STD_UPRI)
				)
			, 0),
			NVL(MIN(m.STD_QTY), 0)
		INTO	L_STD_UPRI,
			L_STD_QTY
		FROM	MAM_STDCOST m
		WHERE	0=0
		AND	m.ITM_CD   = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.TERM     = L_TERM
		AND	m.WG_CD    = I_WG_CD
		;

		IF L_STD_QTY = 0 THEN
			L_STD_AMT := 0 ;
		ELSE
			-- 会社情報の取得
			L_CO := MAPA_CO.F_GET_CO_REC() ;

			BEGIN
				L_STD_AMT := 
					MAPA_CALC.F_RND (
						L_STD_UPRI * I_QTY / L_STD_QTY, 
						L_CO.STK_AMT_DEC_PLACE, 
						L_CO.STK_AMT_RND_TYP
						) ;
			EXCEPTION
				WHEN OTHERS THEN
					L_STD_AMT := 0 ;
			END ;
		END IF ;

		RETURN L_STD_AMT ;
	END F_GET_STD_AMT ;

END MAPA_STD_COST ;

/
show errors;


