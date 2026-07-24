CREATE OR REPLACE FUNCTION mapa_std_cost$f_get_std_upri (
	 IN i_itm_cd	VARCHAR,
	 IN i_itm_sub1	VARCHAR,
	 IN i_itm_sub2	VARCHAR,
	 IN i_itm_sub3	VARCHAR,
	 IN i_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_wg_cd	VARCHAR,
	 IN i_std_upri_sel_typ	VARCHAR DEFAULT '1'
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	標準単価の取得
<REMARKS>
	標準単価マスタから標準単価を取得する
	１単位あたりの標準単価を取得し、端数処理は行なわない
	i_std_upri_sel_typが設定されていない場合は1(標準単価)とみなす
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_dt
		日付
<IN>	i_wg_cd
		ＷＧコード
<IN>	i_std_upri_sel_typ
		標準単価取得区分
<RETURN VALUE>
		標準単価
<HISTORY>
**********************************************************/
DECLARE
	c_sub_upri1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STD_UPRI_SEL_TYP','SUB_UPRI1') ;
	c_sub_upri2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STD_UPRI_SEL_TYP','SUB_UPRI2') ;
	c_sub_upri3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STD_UPRI_SEL_TYP','SUB_UPRI3') ;

	l_term		mam_term.term%TYPE ;
	l_std_upri	mam_stdcost.std_upri%TYPE ;
	l_std_qty	mam_stdcost.std_qty%TYPE ;
	l_acym		mam_term.term%TYPE ;
BEGIN
	l_std_upri := 0 ;
	l_acym := mapa_dt$f_get_ac_ym(i_dt) ;

	/* 指定日付に対応した期を対象期間マスタから取得 */
	SELECT	MAX(m.term)
	INTO	STRICT l_term
	FROM	mam_term m
	WHERE	0=0
	AND	m.term <= l_acym
	AND	l_acym < m.term_end_ym
	;

	IF l_term IS NULL THEN
		RETURN l_std_upri ;
	END IF ;

	/* 標準単価マスタから標準単価取得 */
	SELECT	COALESCE(MIN(
			CASE i_std_upri_sel_typ
				WHEN c_sub_upri1 THEN COALESCE(m.sub_upri1, m.std_upri)
				WHEN c_sub_upri2 THEN COALESCE(m.sub_upri2, m.std_upri)
				WHEN c_sub_upri3 THEN COALESCE(m.sub_upri3, m.std_upri)
				ELSE m.std_upri
			END)
		, 0),
		COALESCE(MIN(m.std_qty), 0)
	INTO	STRICT l_std_upri, l_std_qty
	FROM	mam_stdcost m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.term = l_term
	AND	m.wg_cd = i_wg_cd
	;

	IF l_std_qty = 0 THEN
		l_std_upri := 0 ;
	ELSE
		l_std_upri := l_std_upri / l_std_qty ;
	END IF ;

	RETURN l_std_upri ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_std_cost$f_get_std_amt (
	 IN i_itm_cd	VARCHAR,
	 IN i_itm_sub1	VARCHAR,
	 IN i_itm_sub2	VARCHAR,
	 IN i_itm_sub3	VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_wg_cd	VARCHAR,
	 IN i_qty	NUMERIC,
	 IN i_std_upri_sel_typ	VARCHAR DEFAULT '1'
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	標準金額の取得
<REMARKS>
	標準単価マスタから取得した標準単価に数量を掛け金額を算出する
	会社マスタの在庫金額端数処理区分、在庫金額小数部有効桁数に従って
	端数処理を行なう
	i_std_upri_sel_typが設定されていない場合は1(標準単価)とみなす
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_dt
		日付
<IN>	i_wg_cd
		ＷＧコード
<IN>	i_qty
		数量
<IN>	i_std_upri_sel_typ
		標準単価取得区分
<RETURN VALUE>
		標準金額
<HISTORY>
**********************************************************/
DECLARE
	c_sub_upri1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STD_UPRI_SEL_TYP','SUB_UPRI1') ;
	c_sub_upri2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STD_UPRI_SEL_TYP','SUB_UPRI2') ;
	c_sub_upri3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STD_UPRI_SEL_TYP','SUB_UPRI3') ;

	l_term		mam_term.term%TYPE ;
	l_std_upri	mam_stdcost.std_upri%TYPE ;
	l_std_qty	mam_stdcost.std_qty%TYPE ;
	l_std_amt	mam_stdcost.std_upri%TYPE ;
	l_acym		mam_term.term%TYPE ;

	l_co		mam_co%ROWTYPE ;
BEGIN
	l_std_amt := 0 ;
	l_acym := mapa_dt$f_get_ac_ym(i_dt) ;

	/* 指定日付に対応した期を対象期間マスタから取得 */
	SELECT	MAX(m.term)
	INTO	STRICT l_term
	FROM	mam_term m
	WHERE	0=0
	AND	m.term <= l_acym
	AND	l_acym < m.term_end_ym
	;

	IF l_term IS NULL THEN
		RETURN l_std_amt ;
	END IF ;

	/* 標準単価マスタから標準単価取得 */
	SELECT	COALESCE(MIN(
			CASE i_std_upri_sel_typ
				WHEN c_sub_upri1 THEN COALESCE(m.sub_upri1, m.std_upri)
				WHEN c_sub_upri2 THEN COALESCE(m.sub_upri2, m.std_upri)
				WHEN c_sub_upri3 THEN COALESCE(m.sub_upri3, m.std_upri)
				ELSE m.std_upri
			END)
		, 0),
		COALESCE(MIN(m.std_qty), 0)
	INTO	STRICT l_std_upri, l_std_qty
	FROM	mam_stdcost m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.term = l_term
	AND	m.wg_cd = i_wg_cd
	;

	IF l_std_qty = 0 THEN
		l_std_amt := 0 ;
	ELSE
		/* 会社情報の取得 */
		l_co := mapa_co$f_get_co_rec() ;

		BEGIN
			l_std_amt := mapa_calc$f_rnd(l_std_upri * i_qty / l_std_qty, l_co.stk_amt_dec_place, l_co.stk_amt_rnd_typ) ;
		EXCEPTION
			WHEN others THEN
				l_std_amt := 0 ;
		END ;
	END IF ;

	RETURN l_std_amt ;
END ;
$BODY$
LANGUAGE plpgsql
;
