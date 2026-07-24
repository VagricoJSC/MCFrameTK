CREATE OR REPLACE FUNCTION mspa_ld_calc$f_get_st_dt_ne (
	 IN i_st_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_end_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_ac_cl_day	NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	負荷計算における集計期間開始日
<REMARKS>
	1つの集計期間に属する場合は、集計期間の開始日
	複数の集計期間に属する場合は、引数の開始日
<ARGUMENTS>
<IN>	i_st_dt
		開始日
<IN>	i_end_dt
		終了日
<IN>	i_period_typ
		集計期間区分
<IN>	i_ac_cl_day
		会計締日
<HISTORY>
**************************************************************************/
DECLARE
	l_st_dt		mst_itm_order.mfg_st_schd_dt%TYPE ;
	l_end_dt	mst_itm_order.mfg_end_schd_dt%TYPE ;
BEGIN
	l_st_dt := mapa_dt$f_get_period_st_dt_ne(i_st_dt, i_period_typ, i_ac_cl_day) ;
	l_end_dt := mapa_dt$f_get_period_st_dt_ne(i_end_dt, i_period_typ, i_ac_cl_day) ;

	IF l_st_dt = l_end_dt THEN
		RETURN l_st_dt ;
	ELSE
		RETURN i_st_dt ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ld_calc$f_get_end_dt_ne (
	 IN i_st_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_end_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ	VARCHAR,
	 IN i_ac_cl_day	NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	負荷計算における集計期間終了日
<REMARKS>
	1つの集計期間に属する場合は、集計期間の終了日
	複数の集計期間に属する場合は、引数の終了日
<ARGUMENTS>
<IN>	i_st_dt
		開始日
<IN>	i_end_dt
		終了日
<IN>	i_period_typ
		集計期間区分
<IN>	i_ac_cl_day
		会計締日
<HISTORY>
**************************************************************************/
DECLARE
	l_st_dt		mst_itm_order.mfg_st_schd_dt%TYPE ;
	l_end_dt	mst_itm_order.mfg_end_schd_dt%TYPE ;
BEGIN
	l_st_dt := mapa_dt$f_get_period_st_dt_ne(i_st_dt, i_period_typ, i_ac_cl_day) ;
	l_end_dt := mapa_dt$f_get_period_st_dt_ne(i_end_dt, i_period_typ, i_ac_cl_day) ;

	IF l_st_dt = l_end_dt THEN
		RETURN mapa_dt$f_get_period_end_dt_ne(i_end_dt, i_period_typ, i_ac_cl_day) ;
	ELSE
		RETURN i_end_dt ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ld_calc$f_get_grp_by_key_ne (
	 IN i_key	VARCHAR,
	 IN i_st_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_end_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_cal_fr	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_cal_to	TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	負荷計算における集計キー
<REMARKS>
	複数の集計期間に属する場合、かつ、稼働日案分が必要な場合、KEY
	それ以外はNULL
<ARGUMENTS>
<IN>	key	
		レコードを識別するＮＯ
<IN>	i_st_dt
		開始日
<IN>	i_end_dt
		終了日
<IN>	i_st_dt
		集計期間の開始日
<IN>	i_end_dt
		集計期間の終了日
<HISTORY>
**************************************************************************/
BEGIN
	IF (i_st_dt = i_end_dt) THEN
		RETURN NULL ;
	END IF ;

	IF (i_st_dt >= i_cal_fr AND i_end_dt <= i_cal_to) THEN
		RETURN NULL ;
	END IF ;
	RETURN i_key ;

END ;
$BODY$
LANGUAGE plpgsql
;
