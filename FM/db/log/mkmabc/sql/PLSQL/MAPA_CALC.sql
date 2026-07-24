SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MAPA_CALC
/*********************************************************
<SYNOPSIS>
		端数処理
<REMARKS>
<ARGUMENTS>
*********************************************************/
IS

	FUNCTION F_RND (
		I_NUM			IN	NUMBER,
		I_DEC_PLACE		IN	NUMBER,
		I_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_NE_FLG		IN	BOOLEAN default FALSE
	) RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			端数処理関数
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_NUM
			数値
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<IN>	I_RND_TYP
			端数処理区分
	<IN>	I_NE_FLG
			Not Exception版を表すフラグ（省略時FALSE）
	<RETURNVALUE>
			端数処理をした数値
	<HISTORY>
	**********************************************************/

	FUNCTION F_RND_NE (
		I_NUM			IN	NUMBER,
		I_DEC_PLACE		IN	NUMBER,
		I_RND_TYP		IN	MAPA_META.RND_TYP%TYPE
	) RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			端数処理関数(Not Exception版)
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_NUM
			数値
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<IN>	I_RND_TYP
			端数処理区分
	<RETURNVALUE>
			端数処理をした数値
	<HISTORY>
	**********************************************************/

	FUNCTION F_CALC_PER (
		I_SCHD_NUM	IN	NUMBER,
		I_ACT_NUM	IN	NUMBER
	) RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			進捗率の演算
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_SCHD_NUM
			予定数量
	<IN>	I_ACT_NUM
			実績数量
	<RETURNVALUE>
			進捗率の演算（進捗率のメタの有効桁数で四捨五入）
	<HISTORY>
	**********************************************************/

END MAPA_CALC;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_CALC
IS

	FUNCTION F_RNDUP (
		I_NUM			IN	NUMBER,
		I_DEC_PLACE 	IN	NUMBER
	) RETURN NUMBER
	/*********************************************************
	<SYNOPSIS>
			切り上げ関数
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_NUM
			数値
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<RETURNVALUE>
			切り上げた数値
	<HISTORY>
	**********************************************************/
	IS
		L_NUM			NUMBER;
		L_POWER			NUMBER DEFAULT 1;
	BEGIN

		-- 負
		IF I_NUM < 0 THEN
			L_POWER		:= POWER(10, I_DEC_PLACE);
			L_NUM		:= FLOOR(I_NUM * L_POWER);
			L_NUM		:= L_NUM / L_POWER;
		-- 正
		ELSE
			L_POWER		:= POWER(10, I_DEC_PLACE);
			L_NUM		:= CEIL(I_NUM * L_POWER);
			L_NUM		:= L_NUM / L_POWER;
		END IF;

		RETURN L_NUM;

	END F_RNDUP;

	FUNCTION F_RND (
		I_NUM			IN	NUMBER,
		I_DEC_PLACE		IN	NUMBER,
		I_RND_TYP		IN	MAPA_META.RND_TYP%TYPE,
		I_NE_FLG		IN	BOOLEAN default FALSE
	) RETURN NUMBER
	/*********************************************************
	<SYNOPSIS>
			端数処理関数
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_NUM
			数値
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<IN>	I_RND_TYP
			端数処理区分
	<IN>	I_NE_FLG
			Not Exception版を表すフラグ（省略時FALSE）
	<RETURNVALUE>
			端数処理をした数値
	<HISTORY>
	**********************************************************/
	IS
		L_MSG		FCPA_ERR.MSG_BINDER;
	BEGIN

		-- 切捨て
		IF MAC_RND_TYP.IS_CUTOFF(I_RND_TYP) = '1' THEN
			RETURN TRUNC(I_NUM, I_DEC_PLACE);
		-- 四捨五入
		ELSIF MAC_RND_TYP.IS_RNDOFF(I_RND_TYP) = '1' THEN
			RETURN ROUND(I_NUM, I_DEC_PLACE);
		-- 切り上げ
		ELSIF MAC_RND_TYP.IS_RNDUP(I_RND_TYP) = '1' THEN
			RETURN F_RNDUP(I_NUM, I_DEC_PLACE);
		-- F_RND_NEではログを出力しない
		ELSIF I_NE_FLG THEN
			NULL;
		-- 上記以外
		ELSE
			L_MSG := FCPA_ERR.MSG_BINDER(I_RND_TYP);
			FCPA_ERR.RAISE_APP_ERR('MAUCD0018', L_MSG);
		END IF;

	END F_RND;

	FUNCTION F_RND_NE (
		I_NUM			IN	NUMBER,
		I_DEC_PLACE		IN	NUMBER,
		I_RND_TYP		IN	MAPA_META.RND_TYP%TYPE
	) RETURN NUMBER
	/*********************************************************
	<SYNOPSIS>
			端数処理関数(Not Exception版)
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_NUM
			数値
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<IN>	I_RND_TYP
			端数処理区分
	<RETURNVALUE>
			端数処理をした数値
	<HISTORY>
	**********************************************************/
	IS
	BEGIN

		RETURN F_RND (I_NUM, I_DEC_PLACE, I_RND_TYP, TRUE);

	EXCEPTION
		WHEN OTHERS THEN
			RETURN NULL;

	END F_RND_NE;

	FUNCTION F_CALC_PER (
		I_SCHD_NUM	IN	NUMBER,
		I_ACT_NUM	IN	NUMBER
	) RETURN NUMBER
	/*********************************************************
	<SYNOPSIS>
			進捗率の演算
	<REMARKS>
	<ARGUMENTS>

	<IN>	I_SCHD_NUM
			予定数量
	<IN>	I_ACT_NUM
			実績数量
	<RETURNVALUE>
			進捗率の演算（進捗率のメタの有効桁数で四捨五入）
	<HISTORY>
	**********************************************************/
	IS
		NUM NUMBER;
	BEGIN

		IF I_SCHD_NUM IS NULL OR I_SCHD_NUM = 0 THEN
			RETURN NULL;
		END IF;
		IF I_ACT_NUM IS NULL THEN
			RETURN NULL;
		END IF;

		NUM := (I_ACT_NUM / I_SCHD_NUM) * 100;
		RETURN F_RND_NE (NUM, 2, MAC_RND_TYP.RNDOFF);

	END F_CALC_PER;

END MAPA_CALC;

/
show errors;


