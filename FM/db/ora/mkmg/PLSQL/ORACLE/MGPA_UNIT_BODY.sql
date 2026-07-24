CREATE OR REPLACE PACKAGE BODY MGPA_UNIT
IS
	FUNCTION F_GET_CONV_QTY (
		I_QTY				IN	MAPA_META.QTY%TYPE,
		I_CONV_BASE_QTY				IN	MAPA_META.QTY%TYPE,
		I_CONV_QTY				IN	MAPA_META.QTY%TYPE,
		I_DEC_PLACE				IN	MAPA_META.DEC_PLACE%TYPE,
		I_RND_TYP				IN	MAPA_META.RND_TYP%TYPE
	) RETURN MAPA_META.QTY%TYPE
	/*********************************************************
	<SYNOPSIS>
			基準単位に換算した数量の取得
	<REMARKS>
			数量 × 換算数量 ÷ 換算基準数量に端数処理を施した数量を返す
	<ARGUMENTS>
	<IN>	I_QTY
			数量
	<IN>	I_CONV_BASE_QTY
			換算元単位の換算基準数量
	<IN>	I_CONV_QTY
			換算元単位の換算数量
	<IN>	I_DEC_PLACE
			基準単位の小数部有効桁数
	<IN>	I_RND_TYP
			基準単位の端数処理区分
	<RETURNVALUE>
			基準単位換算後数量
	<HISTORY>
	**********************************************************/
	IS
		L_QTY				MAPA_META.QTY%TYPE;
		L_MSG				FCPA_ERR.MSG_BINDER;

	BEGIN
	
		IF I_QTY IS NULL
			OR I_CONV_QTY IS NULL
			OR I_CONV_BASE_QTY IS NULL
			OR I_CONV_BASE_QTY = 0 THEN

			RETURN NULL;
		END IF;
		
		IF I_QTY = 0
			OR I_CONV_QTY = 0
			OR I_CONV_BASE_QTY = 0 THEN

			RETURN 0;
		ELSE
			L_QTY := MAPA_CALC.F_RND (
				I_QTY * I_CONV_QTY / I_CONV_BASE_QTY,
				I_DEC_PLACE,
				I_RND_TYP
			);
		END IF;
		
		RETURN L_QTY;

	EXCEPTION
		WHEN VALUE_ERROR THEN
			L_MSG := FCPA_ERR.MSG_BINDER (I_QTY, I_CONV_BASE_QTY, I_CONV_QTY, I_DEC_PLACE, I_RND_TYP);
			FCPA_ERR.RAISE_APP_ERR ('MGBXD0039', L_MSG);
	END F_GET_CONV_QTY;

	FUNCTION F_GET_CONV_QTY_NE (
		I_QTY				IN	MAPA_META.QTY%TYPE,
		I_CONV_BASE_QTY				IN	MAPA_META.QTY%TYPE,
		I_CONV_QTY				IN	MAPA_META.QTY%TYPE,
		I_DEC_PLACE				IN	MAPA_META.DEC_PLACE%TYPE,
		I_RND_TYP				IN	MAPA_META.RND_TYP%TYPE
	) RETURN MAPA_META.QTY%TYPE
	/*********************************************************
	<SYNOPSIS>
			基準単位換算数量の取得(No Exception版)
	<REMARKS>
			数量 × 換算数量 ÷ 換算基準数量に端数処理を施した数量を返す
	<ARGUMENTS>
	<IN>	I_QTY
			数量
	<IN>	I_CONV_BASE_QTY
			換算元単位の換算基準数量
	<IN>	I_CONV_QTY
			換算元単位の換算数量
	<IN>	I_DEC_PLACE
			基準単位の小数部有効桁数
	<IN>	I_RND_TYP
			基準単位の端数処理区分
	<RETURNVALUE>
			基準単位換算数量
	<HISTORY>
	**********************************************************/
	IS
		L_QTY				MAPA_META.QTY%TYPE;
	BEGIN
		L_QTY := F_GET_CONV_QTY (I_QTY, I_CONV_BASE_QTY, I_CONV_QTY, I_DEC_PLACE, I_RND_TYP);
		RETURN L_QTY;

	EXCEPTION
		WHEN OTHERS THEN
			RETURN NULL;
	END F_GET_CONV_QTY_NE;

END MGPA_UNIT;
/
