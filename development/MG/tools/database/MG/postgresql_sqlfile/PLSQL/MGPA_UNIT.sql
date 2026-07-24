\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_unit$f_get_conv_qty(
	 IN i_qty NUMERIC,
	 IN i_conv_base_qty NUMERIC,
	 IN i_conv_qty NUMERIC,
	 IN i_dec_place NUMERIC,
	 IN i_rnd_typ VARCHAR)
RETURNS NUMERIC
AS
$BODY$
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
DECLARE
	l_qty NUMERIC;
	l_msg VARCHAR[];
BEGIN
	IF i_qty IS NULL
		OR i_conv_qty IS NULL
		OR i_conv_base_qty IS NULL
		OR i_conv_base_qty = 0 THEN

		RETURN NULL;
	END IF;

	IF i_qty = 0
		OR i_conv_qty = 0
		OR i_conv_base_qty = 0 THEN

		RETURN 0;
	ELSE
		l_qty := mapa_calc$f_rnd(
			i_qty * i_conv_qty / i_conv_base_qty,
			i_dec_place,
			i_rnd_typ
		);
	END IF;
	
	RETURN l_qty;

EXCEPTION
	WHEN data_exception THEN
		l_msg := fcpa_err$msg_binder(
			i_qty::VARCHAR,
			i_conv_base_qty::VARCHAR,
			i_conv_qty::VARCHAR,
			i_dec_place::VARCHAR,
			i_rnd_typ);
		CALL fcpa_err$raise_app_err('MGBXD0039', l_msg);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_unit$f_get_conv_qty_ne(
	 IN i_qty NUMERIC,
	 IN i_conv_base_qty NUMERIC,
	 IN i_conv_qty NUMERIC,
	 IN i_dec_place NUMERIC,
	 IN i_rnd_typ VARCHAR)
RETURNS NUMERIC
AS
$BODY$
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
DECLARE
	l_qty NUMERIC;
BEGIN
	l_qty := mgpa_unit$f_get_conv_qty(i_qty, i_conv_base_qty, i_conv_qty, i_dec_place, i_rnd_typ);
	RETURN l_qty;
EXCEPTION
	WHEN others THEN
		RETURN NULL;
END;
$BODY$
LANGUAGE plpgsql
;

