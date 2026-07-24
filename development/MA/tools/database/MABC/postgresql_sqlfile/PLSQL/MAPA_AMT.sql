\encoding UTF-8

CREATE OR REPLACE PROCEDURE mapa_amt$p_get_amt_and_tax (
	 IN i_upri NUMERIC,
	 IN i_qty NUMERIC,
	 IN i_amt_rnd_typ VARCHAR,
	 IN i_tax_rnd_typ VARCHAR,
	 IN i_amt_dec_place NUMERIC,
	 IN i_inc_tax_flg CHARACTER,
	 IN i_tax_rate NUMERIC,
	 IN i_dscnt_amt NUMERIC DEFAULT 0,
	 INOUT o_amt NUMERIC DEFAULT NULL,
	 INOUT o_tax_amt NUMERIC DEFAULT NULL
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	金額と消費税額を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_upri
		単価
<IN>	i_qty
		数量
<IN>	i_amt_rnd_typ
		金額端数処理区分
<IN>	i_tax_rnd_typ
		消費税端数処理区分
<IN>	i_amt_dec_place
		金額小数部有効桁数
<IN>	i_inc_tax_flg
		内税ＦＬＧ
<IN>	i_tax_rate
		消費税率
<IN>	i_dscnt_amt
		値引額
<OUT>	o_amt
		金額
<OUT>	o_tax_amt
		消費税額
<RETURN VALUE>
<HISTORY>
**********************************************************/
DECLARE
	l_tmp_amt NUMERIC ;
BEGIN
	l_tmp_amt := mapa_calc$f_rnd_ne(i_upri * i_qty, i_amt_dec_place, i_amt_rnd_typ) - COALESCE(i_dscnt_amt, 0) ;

	IF i_inc_tax_flg = '1' THEN
		o_tax_amt := mapa_calc$f_rnd_ne(l_tmp_amt * (i_tax_rate / (100 + i_tax_rate)), i_amt_dec_place, i_tax_rnd_typ) ;
		o_amt := l_tmp_amt - o_tax_amt ;
	ELSIF i_inc_tax_flg = '0' THEN
		o_tax_amt := mapa_calc$f_rnd_ne(l_tmp_amt * i_tax_rate / 100, i_amt_dec_place, i_tax_rnd_typ) ;
		o_amt := l_tmp_amt ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_amt$f_get_exc_tax_amt (
	 IN i_upri NUMERIC,
	 IN i_qty NUMERIC,
	 IN i_amt_rnd_typ VARCHAR,
	 IN i_tax_rnd_typ VARCHAR,
	 IN i_amt_dec_place NUMERIC,
	 IN i_inc_tax_flg CHARACTER,
	 IN i_tax_rate NUMERIC,
	 IN i_dscnt_amt NUMERIC DEFAULT 0
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	税抜金額を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_upri
		単価
<IN>	i_qty
		数量
<IN>	i_amt_rnd_typ
		金額端数処理区分
<IN>	i_tax_rnd_typ
		消費税端数処理区分
<IN>	i_amt_dec_place
		金額小数部有効桁数
<IN>	i_inc_tax_flg
		内税ＦＬＧ
<IN>	i_tax_rate
		消費税率
<IN>	i_dscnt_amt
		値引額
<RETURN VALUE>
		税抜金額
<HISTORY>
**********************************************************/
DECLARE
	l_amt NUMERIC ;
	l_tax_amt NUMERIC ;
BEGIN
	CALL mapa_amt$p_get_amt_and_tax(
		i_upri,
		i_qty,
		i_amt_rnd_typ,
		i_tax_rnd_typ,
		i_amt_dec_place,
		i_inc_tax_flg,
		i_tax_rate,
		i_dscnt_amt,
		l_amt,
		l_tax_amt
	) ;

	RETURN l_amt ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_amt$f_get_inc_tax_amt (
	 IN i_upri NUMERIC,
	 IN i_qty NUMERIC,
	 IN i_amt_rnd_typ VARCHAR,
	 IN i_tax_rnd_typ VARCHAR,
	 IN i_amt_dec_place NUMERIC,
	 IN i_inc_tax_flg CHARACTER,
	 IN i_tax_rate NUMERIC,
	 IN i_dscnt_amt NUMERIC DEFAULT 0
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	税込金額を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_upri
		単価
<IN>	i_qty
		数量
<IN>	i_amt_rnd_typ
		金額端数処理区分
<IN>	i_tax_rnd_typ
		消費税端数処理区分
<IN>	i_amt_dec_place
		金額小数部有効桁数
<IN>	i_inc_tax_flg
		内税ＦＬＧ
<IN>	i_tax_rate
		消費税率
<IN>	i_dscnt_amt
		値引額
<RETURN VALUE>
		税込金額
<HISTORY>
**********************************************************/
DECLARE
	l_amt NUMERIC ;
	l_tax_amt NUMERIC ;
BEGIN
	CALL mapa_amt$p_get_amt_and_tax(
		i_upri,
		i_qty,
		i_amt_rnd_typ,
		i_tax_rnd_typ,
		i_amt_dec_place,
		i_inc_tax_flg,
		i_tax_rate,
		i_dscnt_amt,
		l_amt,
		l_tax_amt
	);

	RETURN l_amt + l_tax_amt ;

END ;
$BODY$
LANGUAGE plpgsql
;
CREATE OR REPLACE PROCEDURE mapa_amt$p_get_purc_amt_and_tax (
	 IN i_upri NUMERIC,
	 IN i_proc_upri NUMERIC DEFAULT 0,
	 IN i_qty NUMERIC DEFAULT NULL,
	 IN i_amt_rnd_typ VARCHAR DEFAULT NULL,
	 IN i_tax_rnd_typ VARCHAR DEFAULT NULL,
	 IN i_amt_dec_place NUMERIC DEFAULT NULL,
	 IN i_inc_tax_flg CHARACTER DEFAULT NULL,
	 IN i_tax_rate NUMERIC DEFAULT NULL,
	 IN i_dscnt_amt NUMERIC DEFAULT 0,
	 IN i_outsrc_flg CHARACTER DEFAULT NULL,
	 IN i_repurc_obli_flg CHARACTER DEFAULT NULL,
	 INOUT o_amt NUMERIC DEFAULT NULL,
	 INOUT o_tax_amt NUMERIC DEFAULT NULL
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	仕入の金額と消費税額を取得する。
	外注がオンかつ買戻義務がオンの場合は、消費税額は加工金額をもとに計算する。
<REMARKS>
<ARGUMENTS>
<IN>	i_upri
		単価
<IN>	i_proc_upri
		加工単価
<IN>	i_qty
		数量
<IN>	i_amt_rnd_typ
		金額端数処理区分
<IN>	i_tax_rnd_typ
		消費税端数処理区分
<IN>	i_amt_dec_place
		金額小数部有効桁数
<IN>	i_inc_tax_flg
		内税ＦＬＧ
<IN>	i_tax_rate
		消費税率
<IN>	i_dscnt_amt
		値引額
<IN>	i_outsrc_flg
		外注ＦＬＧ
<IN>	i_repurc_obli_flg
		買戻義務ＦＬＧ
<OUT>	o_amt
		金額
<OUT>	o_tax_amt
		消費税額
<RETURN VALUE>
<HISTORY>
**********************************************************/
DECLARE
	l_tmp_amt NUMERIC ;
	l_tmp_proc_amt NUMERIC ;
	l_tmp_tax_abl_amt NUMERIC ;
BEGIN
	l_tmp_amt := mapa_calc$f_rnd_ne(i_upri * i_qty, i_amt_dec_place, i_amt_rnd_typ) - COALESCE(i_dscnt_amt, 0) ;
	l_tmp_proc_amt := mapa_calc$f_rnd_ne(i_proc_upri * i_qty, i_amt_dec_place, i_amt_rnd_typ) - COALESCE(i_dscnt_amt, 0) ;
	IF i_outsrc_flg = '1' AND i_repurc_obli_flg = '1' THEN
		l_tmp_tax_abl_amt := l_tmp_proc_amt;
	ELSE
		l_tmp_tax_abl_amt := l_tmp_amt;
	END IF;
	
	IF i_inc_tax_flg = '1' THEN
		o_tax_amt := mapa_calc$f_rnd_ne(l_tmp_tax_abl_amt * (i_tax_rate / (100 + i_tax_rate)), i_amt_dec_place, i_tax_rnd_typ) ;
		o_amt := l_tmp_amt - o_tax_amt ;
	ELSIF i_inc_tax_flg = '0' THEN
		o_tax_amt := mapa_calc$f_rnd_ne(l_tmp_tax_abl_amt * i_tax_rate / 100, i_amt_dec_place, i_tax_rnd_typ) ;
		o_amt := l_tmp_amt ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_amt$f_get_purc_exc_tax_amt (
	 IN i_upri NUMERIC,
	 IN i_proc_upri NUMERIC DEFAULT 0,
	 IN i_qty NUMERIC DEFAULT NULL,
	 IN i_amt_rnd_typ VARCHAR DEFAULT NULL,
	 IN i_tax_rnd_typ VARCHAR DEFAULT NULL,
	 IN i_amt_dec_place NUMERIC DEFAULT NULL,
	 IN i_inc_tax_flg CHARACTER DEFAULT NULL,
	 IN i_tax_rate NUMERIC DEFAULT NULL,
	 IN i_dscnt_amt NUMERIC DEFAULT 0,
	 IN i_outsrc_flg CHARACTER DEFAULT NULL,
	 IN i_repurc_obli_flg CHARACTER DEFAULT NULL
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	仕入税抜金額を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_upri
		単価
<IN>	i_proc_upri
		加工単価
<IN>	i_qty
		数量
<IN>	i_amt_rnd_typ
		金額端数処理区分
<IN>	i_tax_rnd_typ
		消費税端数処理区分
<IN>	i_amt_dec_place
		金額小数部有効桁数
<IN>	i_inc_tax_flg
		内税ＦＬＧ
<IN>	i_tax_rate
		消費税率
<IN>	i_dscnt_amt
		値引額
<IN>	i_outsrc_flg
		外注ＦＬＧ
<IN>	i_repurc_obli_flg
		買戻義務ＦＬＧ
<RETURN VALUE>
		税抜金額
<HISTORY>
**********************************************************/
DECLARE
	l_amt NUMERIC ;
	l_tax_amt NUMERIC ;
BEGIN
	CALL mapa_amt$p_get_purc_amt_and_tax(
		i_upri,
		i_proc_upri,
		i_qty,
		i_amt_rnd_typ,
		i_tax_rnd_typ,
		i_amt_dec_place,
		i_inc_tax_flg,
		i_tax_rate,
		i_dscnt_amt,
		i_outsrc_flg,
		i_repurc_obli_flg,
		l_amt,
		l_tax_amt
	) ;

	RETURN l_amt ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_amt$f_get_purc_inc_tax_amt (
	 IN i_upri NUMERIC,
	 IN i_proc_upri NUMERIC DEFAULT 0,
	 IN i_qty NUMERIC DEFAULT NULL,
	 IN i_amt_rnd_typ VARCHAR DEFAULT NULL,
	 IN i_tax_rnd_typ VARCHAR DEFAULT NULL,
	 IN i_amt_dec_place NUMERIC DEFAULT NULL,
	 IN i_inc_tax_flg CHARACTER DEFAULT NULL,
	 IN i_tax_rate NUMERIC DEFAULT NULL,
	 IN i_dscnt_amt NUMERIC DEFAULT 0,
	 IN i_outsrc_flg CHARACTER DEFAULT NULL,
	 IN i_repurc_obli_flg CHARACTER DEFAULT NULL
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	仕入税込金額を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_upri
		単価
<IN>	i_proc_upri
		加工単価
<IN>	i_qty
		数量
<IN>	i_amt_rnd_typ
		金額端数処理区分
<IN>	i_tax_rnd_typ
		消費税端数処理区分
<IN>	i_amt_dec_place
		金額小数部有効桁数
<IN>	i_inc_tax_flg
		内税ＦＬＧ
<IN>	i_tax_rate
		消費税率
<IN>	i_dscnt_amt
		値引額
<IN>	i_outsrc_flg
		外注ＦＬＧ
<IN>	i_repurc_obli_flg
		買戻義務ＦＬＧ
<RETURN VALUE>
		税込金額
<HISTORY>
**********************************************************/
DECLARE
	l_amt NUMERIC ;
	l_tax_amt NUMERIC ;
BEGIN
	CALL mapa_amt$p_get_purc_amt_and_tax(
		i_upri,
		i_proc_upri,
		i_qty,
		i_amt_rnd_typ,
		i_tax_rnd_typ,
		i_amt_dec_place,
		i_inc_tax_flg,
		i_tax_rate,
		i_dscnt_amt,
		i_outsrc_flg,
		i_repurc_obli_flg,
		l_amt,
		l_tax_amt
	) ;

	RETURN l_amt + l_tax_amt ;

END ;
$BODY$
LANGUAGE plpgsql
;

