CREATE OR REPLACE FUNCTION mgpa_calc_itm_rnd$f_rnd_base_unit(
	 IN i_itm VARCHAR,
	 IN i_qty NUMERIC
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	指定した品目に対して基準単位の端数処理区分、
	小数部有効桁数を使用して入力した数値の端数処理を行う
<REMARKS>
	エラーの場合は入力値(I_QTY)を返す
<ARGUMENTS>
<IN>	I_ITM
		品目ＣＤ
<IN>	I_QTY
		端数処理をする対象の数値
<RETURNVALUE>
		端数処理をした数値
<HISTORY>
**********************************************************/
DECLARE
	l_itm mam_itm%ROWTYPE;
	l_qty NUMERIC;
BEGIN
	<<FUNC_END>>
	BEGIN
		/* 入力値がNULLもしくは0の場合は0を返す */
		IF i_qty IS NULL OR i_qty = 0 THEN
			l_qty := 0;
			EXIT FUNC_END;
		END IF;
		/* 品目ＣＤがNULLのときは入力値を返す */
		IF i_itm IS NULL THEN
			l_qty := i_qty;
			EXIT FUNC_END;
		END IF;
		/* 基準単位の情報を取得して端数処理を行う */
		SELECT
			m.*
			INTO	STRICT l_itm
			FROM	mam_itm m
			WHERE	0=0 AND m.itm_cd = i_itm;
		l_qty := mapa_calc$f_rnd(i_qty, l_itm.dec_place, l_itm.rnd_typ);
	END;
	NULL;
	RETURN l_qty;
EXCEPTION
	WHEN others THEN
		/* エラーの場合は入力値を返す */
		RETURN i_qty;
END;
$BODY$
LANGUAGE  plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_calc_itm_rnd$f_rnd_amt(
	 IN i_amt NUMERIC
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	金額端数処理区分、金額小数部有効桁数を使用して
	入力した数値の端数処理を行う
<REMARKS>
	エラーの場合は入力値(I_AMT)を返す
<ARGUMENTS>
<IN>	I_AMT
		端数処理をする対象の金額
<RETURNVALUE>
		端数処理をした金額
<HISTORY>
**********************************************************/
DECLARE
	l_amt NUMERIC;
	l_rnd_typ mam_co_parm.amt_rnd_typ%TYPE;
	l_dec_place mam_co_parm.amt_dec_place%TYPE;
/*************************************************************************/
BEGIN

	<<FUNC_END>>
	BEGIN
		IF i_amt IS NULL OR i_amt = 0 THEN
			l_amt := 0;
			EXIT FUNC_END;
		END IF;

		IF l_rnd_typ IS NULL THEN
			SELECT
				m.amt_rnd_typ, m.amt_dec_place
				INTO	STRICT l_rnd_typ, l_dec_place
				FROM	mam_co_parm m
				WHERE	0=0
				LIMIT 1;
		END IF;
		l_amt := mapa_calc$f_rnd(i_amt, l_dec_place, l_rnd_typ);
	END;
	NULL;
	RETURN l_amt;
EXCEPTION
	WHEN others THEN
		/* エラーの場合は入力値を返す */
		RETURN i_amt;
END;
$BODY$
LANGUAGE  plpgsql
;
