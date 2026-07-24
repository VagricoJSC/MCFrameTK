CREATE OR REPLACE FUNCTION mapa_calc$f_rndup (
	 IN i_num NUMERIC,
	 IN i_dec_place NUMERIC
) RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	切り上げ関数
<REMARKS>
<ARGUMENTS>
<IN>	i_num
		数値
<IN>	i_dec_place
		小数部有効桁数
<RETURNVALUE>
		切り上げた数値
<HISTORY>
**********************************************************/
DECLARE
	l_num	NUMERIC ;
	l_power	NUMERIC := 1 ;
BEGIN

	-- 負
	IF i_num < 0 THEN
		l_power := POWER(10, i_dec_place) ;
		l_num := FLOOR(i_num * l_power) ;
		l_num := l_num / l_power ;
	-- 正
	ELSE
		l_power := POWER(10, i_dec_place) ;
		l_num := CEIL(i_num * l_power) ;
		l_num := l_num / l_power ;
	END IF ;

	RETURN TRUNC(l_num, i_dec_place::INTEGER) ; --小数部が0埋めされた値が返されてしまうためTRUNCする

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_calc$f_rnd (
	 IN i_num NUMERIC,
	 IN i_dec_place NUMERIC,
	 IN i_rnd_typ VARCHAR,
	 IN i_ne_flg BOOLEAN DEFAULT FALSE
) RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	端数処理関数
<REMARKS>
<ARGUMENTS>
<IN>	i_num
		数値
<IN>	i_dec_place
		小数部有効桁数
<IN>	i_rnd_typ
		端数処理区分
<IN>	i_ne_flg
		Not Exception版を表すフラグ（省略時FALSE）
<RETURNVALUE>
		端数処理をした数値
<HISTORY>
**********************************************************/
DECLARE
	l_msg VARCHAR[] ;
BEGIN
	-- 切捨て
	IF i_rnd_typ = fcpa_const$get_const_val('MAC_RND_TYP','CUTOFF') THEN
		RETURN TRUNC(i_num, i_dec_place::INTEGER) ;
	-- 四捨五入
	ELSIF i_rnd_typ = fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') THEN
		RETURN ROUND(i_num, i_dec_place::INTEGER) ;
	-- 切り上げ
	ELSIF i_rnd_typ = fcpa_const$get_const_val('MAC_RND_TYP','RNDUP') THEN
		RETURN mapa_calc$f_rndup(i_num, i_dec_place) ;
	-- F_RND_NEではログを出力しない
	ELSIF i_ne_flg THEN
		NULL ;
	-- 上記以外 */
	ELSE
		l_msg := fcpa_err$msg_binder(i_rnd_typ) ;
		CALL fcpa_err$raise_app_err('MAUCD0018', l_msg) ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_calc$f_rnd_ne (
	 IN i_num NUMERIC,
	 IN i_dec_place NUMERIC,
	 IN i_rnd_typ VARCHAR
) RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	端数処理関数(Not Exception版)
<REMARKS>
<ARGUMENTS>
<IN>	i_num
		数値
<IN>	i_dec_place
		小数部有効桁数
<IN>	i_rnd_typ
		端数処理区分
<RETURNVALUE>
		端数処理をした数値
<HISTORY>
**********************************************************/
BEGIN

	RETURN mapa_calc$f_rnd(i_num, i_dec_place, i_rnd_typ, TRUE) ;

EXCEPTION
	WHEN others THEN
		RETURN NULL ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_calc$f_calc_per (
	 IN i_schd_num NUMERIC,
	 IN i_act_num NUMERIC
) RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	進捗率の演算
<REMARKS>
<ARGUMENTS>

<IN>	i_schd_num
		予定数量
<IN>	i_act_num
		実績数量
<RETURNVALUE>
		進捗率の演算（進捗率のメタの有効桁数で四捨五入）
<HISTORY>
**********************************************************/
DECLARE
	num	NUMERIC ;
BEGIN

	IF i_schd_num IS NULL OR i_schd_num = 0 THEN
		RETURN NULL ;
	END IF;
	IF i_act_num IS NULL THEN
		RETURN NULL ;
	END IF ;

	num := (i_act_num * 100) / i_schd_num ;
	RETURN mapa_calc$f_rnd_ne(num, 2, fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF')) ;

END ;
$BODY$
LANGUAGE plpgsql
;
