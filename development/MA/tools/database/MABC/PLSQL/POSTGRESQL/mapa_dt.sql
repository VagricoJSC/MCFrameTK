CREATE OR REPLACE FUNCTION mapa_dt$f_to_day_week_typ (
	IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		日付を曜日区分に変換する
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		日付
<RETURNVALUE>
		曜日区分
<HISTORY>
**********************************************************/
DECLARE
	lt_tmp NUMERIC;
BEGIN
	lt_tmp := fcpa_date_util$f_get_week_of_day(i_dt);

	IF (lt_tmp = 1) THEN
		RETURN fcpa_const$get_const_val('MAC_DAY_WEEK_TYP','SUN');
	ELSIF (lt_tmp = 2) THEN
		RETURN fcpa_const$get_const_val('MAC_DAY_WEEK_TYP','MON');
	ELSIF (lt_tmp = 3) THEN
		RETURN fcpa_const$get_const_val('MAC_DAY_WEEK_TYP','TUE');
	ELSIF (lt_tmp = 4) THEN
		RETURN fcpa_const$get_const_val('MAC_DAY_WEEK_TYP','WED');
	ELSIF (lt_tmp = 5) THEN
		RETURN fcpa_const$get_const_val('MAC_DAY_WEEK_TYP','THU');
	ELSIF (lt_tmp = 6) THEN
		RETURN fcpa_const$get_const_val('MAC_DAY_WEEK_TYP','FRI');
	ELSIF (lt_tmp = 7) THEN
		RETURN fcpa_const$get_const_val('MAC_DAY_WEEK_TYP','SAT');
	END IF;
	
	RETURN NULL;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_dt$f_get_period_st_dt_ne(
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_cl_day NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日から、対象日付の属する期間の開始日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		対象日付
<IN>	i_period_typ
		期間区分
<IN>	i_cl_day
		会計締日
<RETURNVALUE>
		対象日付の属する期間の開始日
<HISTORY>
**********************************************************/
DECLARE
	l_base_ym	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_last_day	mam_co.ac_cl_day%TYPE ;
	l_cl_day	mam_co.ac_cl_day%TYPE ;
	l_cl_dt_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_cl_dt_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_i			NUMERIC ;
BEGIN
	IF i_dt IS NULL OR
		i_period_typ IS NULL OR
		i_cl_day IS NULL THEN
		RETURN NULL ;
	END IF ;

	-- 対象日付が対象範囲に入るように、対象月を前月からにする。
	l_base_ym := fcpa_postgres_util$add_months(DATE_TRUNC('MONTH', i_dt), -1) ;
	l_cl_day := i_cl_day ;
	l_last_day := EXTRACT(DAY FROM fcpa_postgres_util$last_day(l_base_ym))::NUMERIC ;
	IF l_cl_day > l_last_day THEN
		l_cl_day := l_last_day ;
	END IF ;
	l_cl_dt_fr := TO_TIMESTAMP(TO_CHAR(l_base_ym, 'YYYYMM') || '/' || LPAD(l_cl_day::VARCHAR, 2, '0'), 'YYYYMM/DD') + '1 day'::INTERVAL ;

	BEGIN
		IF i_cl_day = 99 THEN
			l_cl_dt_to := fcpa_postgres_util$last_day(fcpa_postgres_util$add_months(l_base_ym, 1)) ;
		ELSE
			l_cl_dt_to := TO_TIMESTAMP(TO_CHAR(fcpa_postgres_util$add_months(l_base_ym, 1), 'YYYYMM') || '/' || LPAD(i_cl_day::VARCHAR, 2, '0'), 'YYYYMM/DD') ;
		END IF ;
	EXCEPTION
		-- 存在しない日付でエラーになった場合、末日を設定
		WHEN OTHERS THEN
			l_cl_dt_to := fcpa_postgres_util$last_day(fcpa_postgres_util$add_months(l_base_ym, 1)) ;
	END ;

	IF i_dt > l_cl_dt_to THEN
		l_cl_dt_fr := l_cl_dt_to + '1 day'::INTERVAL ;
		IF i_cl_day = 99 THEN
			l_cl_dt_to := fcpa_postgres_util$last_day(fcpa_postgres_util$add_months(l_cl_dt_to, 1)) ;
		ELSE
			l_cl_dt_to := fcpa_postgres_util$add_months(l_cl_dt_to, 1) ;
		END IF ;
	END IF ;

	-- 日次
	IF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'DAILY') = i_period_typ THEN

		RETURN i_dt ;
	-- 週次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'WEEKLY') = i_period_typ THEN

		-- 対象日付以前の日曜日を返却（対象日付が日曜日であれば、対象日付を返却）
		RETURN fcpa_date_util$f_next_day(i_dt - '7 days'::INTERVAL, 1) ;
	-- 旬次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'TENDAYS') = i_period_typ THEN
		-- 対象日付が属する旬の開始日の年月日取得
		l_i := 1 ;
		l_ten_d_fr := l_cl_dt_fr ;
		l_ten_d_to := l_cl_dt_fr + '9 days'::INTERVAL ;
		WHILE (l_i <= 3) LOOP
			IF i_dt < l_ten_d_fr OR i_dt > l_ten_d_to THEN
				l_ten_d_fr := l_ten_d_to + '1 day'::INTERVAL ;

				IF l_i = 1 THEN
					l_ten_d_to := l_ten_d_fr + '9 days'::INTERVAL ;
				ELSE
					l_ten_d_to := l_cl_dt_to ;
				END IF ;
				l_i := l_i + 1 ;
			ELSE
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN l_ten_d_fr ;
	-- 月次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY') = i_period_typ THEN

		RETURN l_cl_dt_fr ;
	ELSE
		RETURN NULL ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_get_period_end_dt_ne(
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_cl_day NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日から、対象日付の属する期間の終了日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		対象日付
<IN>	i_period_typ
		期間区分
<IN>	i_cl_day
		会計締日
<RETURNVALUE>
		対象日付の属する期間の終了日
<HISTORY>
**********************************************************/
DECLARE
	l_base_ym	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_last_day	mam_co.ac_cl_day%TYPE ;
	l_cl_day	mam_co.ac_cl_day%TYPE ;
	l_cl_dt_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_cl_dt_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_i			NUMERIC ;
BEGIN
	IF i_dt IS NULL OR
		i_period_typ IS NULL OR
		i_cl_day IS NULL THEN
		RETURN NULL ;
	END IF ;

	-- 対象日付が対象範囲に入るように、対象月を前月からにする。
	l_base_ym := fcpa_postgres_util$add_months(DATE_TRUNC('MONTH', i_dt), -1) ;
	l_cl_day := i_cl_day ;
	l_last_day := EXTRACT(DAY FROM fcpa_postgres_util$last_day(l_base_ym))::NUMERIC ;
	IF l_cl_day > l_last_day THEN
		l_cl_day := l_last_day ;
	END IF ;
	l_cl_dt_fr := TO_TIMESTAMP(TO_CHAR(l_base_ym, 'YYYYMM') || '/' || LPAD(l_cl_day::VARCHAR, 2, '0'), 'YYYYMM/DD') + '1 day'::INTERVAL ;

	BEGIN
		IF i_cl_day = 99 THEN
			l_cl_dt_to := fcpa_postgres_util$last_day(fcpa_postgres_util$add_months(l_base_ym, 1)) ;
		ELSE
			l_cl_dt_to := TO_TIMESTAMP(TO_CHAR(fcpa_postgres_util$add_months(l_base_ym, 1), 'YYYYMM') || '/' || LPAD(i_cl_day::VARCHAR, 2, '0'), 'YYYYMM/DD') ;
		END IF ;
	EXCEPTION
		-- 存在しない日付でエラーになった場合、末日を設定
		WHEN OTHERS THEN
			l_cl_dt_to := fcpa_postgres_util$last_day(fcpa_postgres_util$add_months(l_base_ym, 1)) ;
	END ;

	IF i_dt > l_cl_dt_to THEN
		l_cl_dt_fr := l_cl_dt_to + '1 day'::INTERVAL ;
		IF i_cl_day = 99 THEN
			l_cl_dt_to := fcpa_postgres_util$last_day(fcpa_postgres_util$add_months(l_base_ym, 1)) ;
		ELSE
			l_cl_dt_to := fcpa_postgres_util$add_months(l_cl_dt_to, 1) ;
		END IF ;
	END IF ;

	-- 日次
	IF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'DAILY') = i_period_typ THEN

		RETURN i_dt ;
	-- 週次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'WEEKLY') = i_period_typ THEN

		-- 対象日付以降の土曜日を返却（対象日付が土曜日であれば、対象日付を返却）
		RETURN fcpa_date_util$f_next_day(i_dt - '1 days'::INTERVAL, 7) ;
	-- 旬次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'TENDAYS') = i_period_typ THEN
		-- 対象日付が属する旬の終了日の年月日取得
		l_i := 1 ;
		l_ten_d_fr := l_cl_dt_fr ;
		l_ten_d_to := l_cl_dt_fr + '9 days'::INTERVAL ;
		WHILE (l_i <= 3) LOOP
			IF i_dt < l_ten_d_fr OR i_dt > l_ten_d_to THEN
				l_ten_d_fr := l_ten_d_to + '1 day'::INTERVAL ;

				IF l_i = 1 THEN
					l_ten_d_to := l_ten_d_fr + '9 days'::INTERVAL ;
				ELSE
					l_ten_d_to := l_cl_dt_to ;
				END IF ;
				l_i := l_i + 1 ;
			ELSE
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN l_ten_d_to ;
	-- 月次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY') = i_period_typ THEN

		RETURN l_cl_dt_to ;
	ELSE
		RETURN NULL ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_add_period_st_dt_ne(
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_add NUMERIC,
	 IN i_cl_day NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日から、対象日付の属する期間の開始日から加算期間先の開始日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		対象日付
<IN>	i_period_typ
		期間区分
<IN>	i_add
		加算期間
<IN>	i_cl_day
		会計締日
<RETURNVALUE>
		対象日付の属する期間の開始日から加算期間先の開始日
<HISTORY>
**********************************************************/
DECLARE
	l_dt		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dt_fr		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_week_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_i			NUMERIC ;
BEGIN
	IF i_dt IS NULL OR
		i_period_typ IS NULL OR
		i_add IS NULL OR
		i_cl_day IS NULL THEN
		RETURN NULL ;
	END IF ;

	-- 日次
	IF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'DAILY') = i_period_typ THEN
		RETURN i_dt + (i_add || ' days')::INTERVAL ;
	-- 週次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'WEEKLY') = i_period_typ THEN
		l_dt := i_dt + (i_add * 7 || ' days')::INTERVAL ;
		l_week_fr := mapa_dt$f_get_period_st_dt_ne(l_dt, i_period_typ, i_cl_day) ;
		RETURN l_week_fr ;
	-- 旬次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'TENDAYS') = i_period_typ THEN
		l_i := 0 ;
		l_dt := i_dt ;
		IF i_add >= 0 THEN
			WHILE (l_i <= i_add) LOOP
				l_ten_d_fr := mapa_dt$f_get_period_st_dt_ne(l_dt, i_period_typ, i_cl_day) ;
				l_ten_d_to := mapa_dt$f_get_period_end_dt_ne(l_dt, i_period_typ, i_cl_day) ;
				l_dt := l_ten_d_to + '1 day'::INTERVAL ;
				l_i := l_i + 1 ;
			END LOOP ;
		ELSE
			WHILE (l_i >= i_add) LOOP
				l_ten_d_fr := mapa_dt$f_get_period_st_dt_ne(l_dt, i_period_typ, i_cl_day) ;
				l_dt := l_ten_d_fr + '-1 day'::INTERVAL ;
				l_i := l_i - 1 ;
			END LOOP ;
		END IF ;
		RETURN l_ten_d_fr ;
	-- 月次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY') = i_period_typ THEN
		l_dt_fr := i_dt ;
		l_dt_fr := mapa_dt$f_get_period_st_dt_ne(l_dt_fr, i_period_typ, i_cl_day) ;
		l_dt_fr := fcpa_postgres_util$add_months(l_dt_fr, i_add) ;
		RETURN l_dt_fr ;
	ELSE
		RETURN NULL ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_add_period_end_dt_ne(
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_add NUMERIC,
	 IN i_cl_day NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日から、対象日付の属する期間の開始日から加算期間先の終了日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		対象日付
<IN>	i_period_typ
		期間区分
<IN>	i_add
		加算期間
<IN>	i_cl_day
		会計締日
<RETURNVALUE>
		対象日付の属する期間の終了日から加算期間先の終了日
<HISTORY>
**********************************************************/
DECLARE
	l_dt		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dt_to		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_week_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_i			NUMERIC ;
BEGIN
	IF i_dt IS NULL OR
		i_period_typ IS NULL OR
		i_add IS NULL OR
		i_cl_day IS NULL THEN
		RETURN NULL ;
	END IF ;

	-- 日次
	IF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'DAILY') = i_period_typ THEN

		RETURN i_dt + (i_add || ' days')::INTERVAL ;
	-- 週次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'WEEKLY') = i_period_typ THEN
		l_dt := i_dt + (i_add * 7 || ' days')::INTERVAL ;
		l_week_to := mapa_dt$f_get_period_end_dt_ne(l_dt, i_period_typ, i_cl_day) ;

		RETURN l_week_to ;
	-- 旬次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'TENDAYS') = i_period_typ THEN
		l_i := 0 ;
		l_dt := i_dt ;
		IF i_add >= 0 THEN
			WHILE (l_i <= i_add) LOOP
				l_ten_d_to := mapa_dt$f_get_period_end_dt_ne(l_dt, i_period_typ, i_cl_day) ;
				l_dt := l_ten_d_to + '1 day'::INTERVAL ;
				l_i := l_i + 1 ;
			END LOOP ;
		ELSE
			WHILE (l_i >= i_add) LOOP
				l_ten_d_fr := mapa_dt$f_get_period_st_dt_ne(l_dt, i_period_typ, i_cl_day) ;
				l_ten_d_to := mapa_dt$f_get_period_end_dt_ne(l_dt, i_period_typ, i_cl_day) ;
				l_dt := l_ten_d_fr + '-1 day'::INTERVAL ;
				l_i := l_i - 1 ;
			END LOOP ;
		END IF ;

		RETURN l_ten_d_to ;
	-- 月次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY') = i_period_typ THEN
		l_dt_to := i_dt ;
		l_dt_to := mapa_dt$f_get_period_end_dt_ne(l_dt_to, i_period_typ, i_cl_day) ;
		l_dt_to := fcpa_postgres_util$add_months(l_dt_to, i_add) ;

		RETURN l_dt_to ;
	ELSE
		RETURN NULL ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_get_ym_st_dt_ne(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_cl_day NUMERIC,
	 IN i_cl_mon_base NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日と会計月度基準から、年月の属する期間の開始日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_ym
		対象年月
<IN>	i_period_typ
		期間区分
<IN>	i_cl_day
		会計締日
<IN>	i_cl_mon_base
		会計月度基準
<RETURNVALUE>
		年月の属する期間の開始日
<HISTORY>
**********************************************************/
DECLARE
	l_pre_cl_dt_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_cl_dt_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_week_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_base_ym	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_last_day	mam_co.ac_cl_day%TYPE ;
	l_cl_day	mam_co.ac_cl_day%TYPE ;
BEGIN
	IF i_ym IS NULL OR
		i_period_typ IS NULL OR
		i_cl_day IS NULL OR
		i_cl_mon_base IS NULL THEN
		RETURN NULL ;
	END IF ;

	l_base_ym := i_ym ;
	IF i_cl_mon_base = 0 THEN
		l_base_ym := fcpa_postgres_util$add_months(l_base_ym, -1) ;
	END IF ;

	l_cl_day := i_cl_day ;
	l_last_day := EXTRACT(DAY FROM fcpa_postgres_util$last_day(l_base_ym))::NUMERIC ;
	IF i_cl_day > l_last_day THEN
		l_cl_day := l_last_day ;
	END IF ;

	-- 先月度末日
	l_pre_cl_dt_to := TO_TIMESTAMP(TO_CHAR(l_base_ym, 'YYYYMM') || '/' || LPAD(l_cl_day::VARCHAR, 2, '0'), 'YYYYMM/DD') ; 

	-- 日次
	IF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'DAILY') = i_period_typ THEN

		RETURN i_ym ;
	-- 週次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'WEEKLY') = i_period_typ THEN
		l_week_fr := fcpa_date_util$f_next_day(l_pre_cl_dt_to, 1) ;

		RETURN l_week_fr ;
	-- 旬次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'TENDAYS') = i_period_typ THEN
		l_ten_d_fr := l_pre_cl_dt_to + '1 day'::INTERVAL ;

		RETURN l_ten_d_fr ;
	-- 月次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY') = i_period_typ THEN
		l_cl_dt_fr := l_pre_cl_dt_to + '1 day'::INTERVAL ;

		RETURN l_cl_dt_fr ;
	ELSE
		RETURN NULL ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_get_ym_end_dt_ne(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_cl_day NUMERIC,
	 IN i_cl_mon_base NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日と会計月度基準から、年月の属する期間の終了日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_ym
		対象年月
<IN>	i_period_typ
		期間区分
<IN>	i_cl_day
		会計締日
<IN>	i_cl_mon_base
		会計月度基準
<RETURNVALUE>
		年月の属する期間の終了日
<HISTORY>
**********************************************************/
DECLARE
	l_find		NUMERIC ;
	l_pre_cl_dt_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_cl_dt_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_cl_dt_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_week_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_week_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_ten_d_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_base_ym	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_last_day	mam_co.ac_cl_day%TYPE ;
	l_cl_day	mam_co.ac_cl_day%TYPE ;
BEGIN
	IF i_ym IS NULL OR
		i_period_typ IS NULL OR
		i_cl_day IS NULL OR
		i_cl_mon_base IS NULL THEN
		RETURN NULL ;
	END IF ;

	l_base_ym := i_ym ;
	IF i_cl_mon_base = 0 THEN
		l_base_ym := fcpa_postgres_util$add_months(l_base_ym, -1) ;
	END IF ;

	l_cl_day := i_cl_day ;
	l_last_day := EXTRACT(DAY FROM fcpa_postgres_util$last_day(l_base_ym))::NUMERIC ;
	IF i_cl_day > l_last_day THEN
		l_cl_day := l_last_day ;
	END IF ;

	-- 先月度末日
	l_pre_cl_dt_to := TO_TIMESTAMP(TO_CHAR(l_base_ym, 'YYYYMM') || '/' || LPAD(l_cl_day::VARCHAR, 2, '0'), 'YYYYMM/DD') ;
	-- 当月度末日
	BEGIN
		IF i_cl_day = 99 THEN
			l_cl_dt_to := fcpa_postgres_util$last_day(fcpa_postgres_util$add_months(l_base_ym, 1)) ;
		ELSE
			l_cl_dt_to := TO_TIMESTAMP(TO_CHAR(fcpa_postgres_util$add_months(l_base_ym, 1), 'YYYYMM') || '/' || LPAD(i_cl_day::VARCHAR, 2, '0'), 'YYYYMM/DD') ;
		END IF ;
		-- 存在しない日付でエラーになった場合、末日を設定
		EXCEPTION
			WHEN OTHERS THEN
				l_cl_dt_to := fcpa_postgres_util$last_day(fcpa_postgres_util$add_months(l_base_ym, 1)) ;
	END ;

	-- 日次
	IF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'DAILY') = i_period_typ THEN

		RETURN i_ym ;
	-- 週次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'WEEKLY') = i_period_typ THEN
		l_find := 0 ;
		l_week_to := l_pre_cl_dt_to ;
		WHILE (l_find = 0) LOOP
			l_week_fr := fcpa_date_util$f_next_day(l_week_to, 1) ;
			l_week_to := l_week_fr + '6 days'::INTERVAL ;

			IF l_cl_dt_to >= l_week_fr AND l_cl_dt_to <= l_week_to THEN
				l_find := 1 ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN l_week_to ;
	-- 旬次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'TENDAYS') = i_period_typ THEN
		l_ten_d_to := l_cl_dt_to ;

		RETURN l_ten_d_to ;
	-- 月次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY') = i_period_typ THEN

		RETURN l_cl_dt_to ;
	ELSE
		RETURN NULL ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_get_ym_st_dt_ne(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_cl_day NUMERIC,
	 IN i_cl_mon_base NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日と会計月度基準から、年月の月度の開始日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_ym
		対象年月
<IN>	i_cl_day
		会計締日
<IN>	i_cl_mon_base
		会計月度基準
<RETURNVALUE>
		年月の月度の開始日
<HISTORY>
**********************************************************/
BEGIN
	IF i_ym IS NULL OR
		i_cl_day IS NULL OR
		i_cl_mon_base IS NULL THEN
		RETURN NULL ;
	END IF ;

	RETURN mapa_dt$f_get_ym_st_dt_ne(i_ym, fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY'), i_cl_day, i_cl_mon_base) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_get_ym_end_dt_ne(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_cl_day NUMERIC,
	 IN i_cl_mon_base NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日と会計月度基準から、年月の月度の終了日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_ym
		対象年月
<IN>	i_cl_day
		会計締日
<IN>	i_cl_mon_base
		会計月度基準
<RETURNVALUE>
		年月の月度の終了日
<HISTORY>
**********************************************************/
BEGIN
	IF i_ym IS NULL OR
		i_cl_day IS NULL OR
		i_cl_mon_base IS NULL THEN
		RETURN NULL ;
	END IF ;

	RETURN mapa_dt$f_get_ym_end_dt_ne(i_ym, fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY'), i_cl_day, i_cl_mon_base) ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_dt$f_get_ym_st_dt_ne(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_pos NUMERIC,
	 IN i_cl_day NUMERIC,
	 IN i_cl_mon_base NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日と会計月度基準から、年月の属する期間の開始位置の開始日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_ym
		対象年月
<IN>	i_period_typ
		期間区分
<IN>	i_pos
		開始位置
<IN>	i_cl_day
		会計締日
<IN>	i_cl_mon_base
		会計月度基準
<RETURNVALUE>
		年月の属する期間の開始位置の開始日
<HISTORY>
**********************************************************/
DECLARE
	l_i			NUMERIC ;
	l_cl_dt_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_cl_dt_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dt_fr		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dt_to		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_base_ym	TIMESTAMP(0) WITHOUT TIME ZONE ;
BEGIN
	IF i_ym IS NULL OR
		i_period_typ IS NULL OR
		i_pos IS NULL OR
		i_cl_day IS NULL OR
		i_cl_mon_base IS NULL THEN
		RETURN NULL ;
	END IF ;

	l_cl_dt_fr := mapa_dt$f_get_ym_st_dt_ne(i_ym, i_period_typ, i_cl_day, i_cl_mon_base) ;
	l_cl_dt_to := mapa_dt$f_get_ym_end_dt_ne(i_ym, i_period_typ, i_cl_day, i_cl_mon_base) ;

	-- 週次
	IF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'WEEKLY') = i_period_typ THEN
		IF i_pos < 1 OR i_pos > 5 THEN
			RETURN NULL ;
		END IF ;

		l_i := 1 ;
		l_dt_to := l_cl_dt_fr + '-1 day'::INTERVAL ;
		WHILE (l_i <= i_pos) LOOP
			l_dt_fr := fcpa_date_util$f_next_day(l_dt_to, 1) ;
			l_dt_to := l_dt_fr + '6 days'::INTERVAL ;

			IF l_dt_fr <= l_cl_dt_to AND l_cl_dt_to <= l_dt_to THEN
				EXIT ;
			END IF ;
			l_i := l_i + 1 ;
		END LOOP ;

		IF i_pos > l_i THEN
			RETURN NULL ;
		ELSE
			RETURN l_dt_fr ;
		END IF ;
	-- 旬次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'TENDAYS') = i_period_typ THEN
		IF i_pos < 1 OR i_pos > 3 THEN
			RETURN NULL ;
		END IF ;

		l_i := 1 ;
		l_dt_to := l_cl_dt_fr + '-1 day'::INTERVAL ;
		WHILE (l_i <= i_pos) LOOP
			l_dt_fr := l_dt_to + '1 day'::INTERVAL ;
			l_dt_to := l_dt_fr + '9 days'::INTERVAL ;

			IF l_dt_to > l_cl_dt_to THEN
				l_dt_to := l_cl_dt_to ;
			END IF ;
			l_i := l_i + 1 ;
		END LOOP ;

		RETURN l_dt_fr ;
	-- 月次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY') = i_period_typ THEN
		IF i_pos = 1 THEN
			RETURN mapa_dt$f_get_ym_st_dt_ne(i_ym, i_period_typ, i_cl_day, i_cl_mon_base) ;
		ELSE
			RETURN NULL ;
		END IF ;
	ELSE
		RETURN NULL ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;



CREATE OR REPLACE FUNCTION mapa_dt$f_get_ym_end_dt_ne(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_period_typ VARCHAR,
	 IN i_pos NUMERIC,
	 IN i_cl_day NUMERIC,
	 IN i_cl_mon_base NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		会計締日と会計月度基準から、年月の属する期間の開始位置の終了日となる年月日を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_ym
		対象年月
<IN>	i_period_typ
		期間区分
<IN>	i_pos
		開始位置
<IN>	i_cl_day
		会計締日
<IN>	i_cl_mon_base
		会計月度基準
<RETURNVALUE>
		年月の属する期間の開始位置の終了日
<HISTORY>
**********************************************************/
DECLARE
	l_i			NUMERIC ;
	l_cl_dt_fr	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_cl_dt_to	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dt_fr		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dt_to		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_base_ym	TIMESTAMP(0) WITHOUT TIME ZONE ;
BEGIN
	IF i_ym IS NULL OR
		i_period_typ IS NULL OR
		i_pos IS NULL OR
		i_cl_day IS NULL OR
		i_cl_mon_base IS NULL THEN
		RETURN NULL ;
	END IF ;

	l_cl_dt_fr := mapa_dt$f_get_ym_st_dt_ne(i_ym, i_period_typ, i_cl_day, i_cl_mon_base) ;
	l_cl_dt_to := mapa_dt$f_get_ym_end_dt_ne(i_ym, i_period_typ, i_cl_day, i_cl_mon_base) ;

	-- 週次
	IF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'WEEKLY') = i_period_typ THEN
		IF i_pos < 1 OR i_pos > 5 THEN
			RETURN NULL ;
		END IF ;

		l_i := 1 ;
		l_dt_to := l_cl_dt_fr + '-1 day'::INTERVAL ;
		WHILE (l_i <= i_pos) LOOP
			l_dt_fr := fcpa_date_util$f_next_day(l_dt_to, 1) ;
			l_dt_to := l_dt_fr + '6 days'::INTERVAL ;

			IF l_dt_fr <= l_cl_dt_to AND l_cl_dt_to <= l_dt_to THEN
				EXIT ;
			END IF ;
			l_i := l_i + 1 ;
		END LOOP ;

		IF i_pos > l_i THEN
			RETURN NULL ;
		ELSE
			RETURN l_dt_to ;
		END IF ;
	-- 旬次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'TENDAYS') = i_period_typ THEN
		IF i_pos < 1 OR i_pos > 3 THEN
			RETURN NULL ;
		END IF ;

		l_i := 1 ;
		l_dt_to := l_cl_dt_fr + '-1 day'::INTERVAL ;
		WHILE (l_i <= i_pos) LOOP
			l_dt_fr := l_dt_to + '1 day'::INTERVAL ;
			l_dt_to := l_dt_fr + '9 days'::INTERVAL ;

			IF l_i = 3 THEN
				l_dt_to := l_cl_dt_to ;
			END IF ;
			l_i := l_i + 1 ;
		END LOOP ;

		RETURN l_dt_to ;
	-- 月次
	ELSIF fcpa_const$get_const_val('MAC_PERIOD_TYP', 'MONTHLY') = i_period_typ THEN
		IF i_pos = 1 THEN
			RETURN mapa_dt$f_get_ym_end_dt_ne(i_ym, i_period_typ, i_cl_day, i_cl_mon_base) ;
		ELSE
			RETURN NULL ;
		END IF ;
	ELSE
		RETURN NULL ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_get_ac_ym(
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		日付に対応する計上月度を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	I_DT
		対象日付
<RETURNVALUE>
		計上月度
<HISTORY>
**********************************************************/
DECLARE
	l_base_ym		TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_cl_day		mam_co.ac_cl_day%TYPE ;
	l_dt_day		mam_co.ac_cl_day%TYPE ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE ;
BEGIN
	IF i_dt IS NULL THEN
		RETURN NULL ;
	END IF ;

	-- 会社マスタより会計締日、会計月度基準を取得
	SELECT
		ac_cl_day, ac_cl_mon_base
	INTO
		STRICT l_cl_day, l_cl_mon_base
	FROM
		mam_co
	;

	RETURN mapa_dt$f_get_ac_ym(i_dt, l_cl_day, l_cl_mon_base) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_get_ac_ym(
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_cl_day NUMERIC,
	 IN i_cl_mon_base NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		日付に対応する計上月度を取得する。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		対象日付
<IN>	i_cl_day
		会社マスタの会計締日
<IN>	i_cl_mon_base
		会社マスタの会計月度基準
<RETURNVALUE>
		計上月度
<HISTORY>
**********************************************************/
DECLARE
	l_base_ym	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dt_day	mam_co.ac_cl_day%TYPE ;
BEGIN
	IF i_dt IS NULL THEN
		RETURN NULL ;
	END IF ;

	IF i_cl_day IS NULL THEN
		RETURN NULL ;
	END IF ;

	-- 基準月度(L_BASE_YM)を求める
	l_dt_day := EXTRACT(DAY FROM i_dt)::NUMERIC ;
	IF i_cl_day < l_dt_day THEN
		l_base_ym := fcpa_postgres_util$add_months(DATE_TRUNC('MONTH', i_dt), 1) ;
	ELSE
		l_base_ym := DATE_TRUNC('MONTH', i_dt) ;
	END IF ;

	RETURN fcpa_postgres_util$add_months(l_base_ym, i_cl_mon_base) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_cal_days (
	 IN i_fr_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_to_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_cal_cd VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		指定期間に含まれるカレンダの稼働日の日数を求める
<REMARKS>
<ARGUMENTS>
<IN>	i_fr_dt
		指定期間の開始日付
<IN>	i_to_dt
		指定期間の終了日付
<IN>	i_cal_cd
		カレンダコード
<RETURNVALUE>
		稼働日の日数
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_day_week_typ_sun CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'SUN') ;
	c_day_week_typ_mon CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'MON') ;
	c_day_week_typ_tue CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'TUE') ;
	c_day_week_typ_wed CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'WED') ;
	c_day_week_typ_thu CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'THU') ;
	c_day_week_typ_fri CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'FRI') ;
	c_day_week_typ_sat CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'SAT') ;

	l_sum NUMERIC ;
	w_cal RECORD ;
BEGIN
	-- 指定期間にNULLが含まれる場合NULLをリターン
	IF i_fr_dt IS NULL OR i_to_dt IS NULL THEN
		RETURN NULL ;
	END IF ;

	IF i_fr_dt > i_to_dt THEN
		RETURN NULL ;
	END IF ;

	-- テンポラリ勤休カレンダの初期化
	CALL fcpa_postgres_util$p_truncate_work('maw_cal_ext_key') ;

	FOR w_cal IN
		SELECT
			fcpa_postgres_util$greatest(t1.st_dt, i_fr_dt) st_dt,
			fcpa_postgres_util$least(t1.end_dt, i_to_dt) end_dt,
			t1.sun_off_flg sun,
			t1.mon_off_flg mon,
			t1.tue_off_flg tue,
			t1.wed_off_flg wed,
			t1.thu_off_flg thu,
			t1.fri_off_flg fri,
			t1.sat_off_flg sat
		FROM
			mam_cal t1
		WHERE 0=0
		AND t1.cal_cd = i_cal_cd
		AND t1.st_dt <= i_to_dt
		AND t1.end_dt >= i_fr_dt
		AND t1.del_flg = '0'
		ORDER BY t1.st_dt
	LOOP
		INSERT INTO maw_cal_ext_key (cal_cd, dt)
		SELECT
			CASE mapa_dt$f_to_day_week_typ(dt)
				WHEN c_day_week_typ_sun THEN (CASE w_cal.sun WHEN '0' THEN i_cal_cd ELSE NULL END)
				WHEN c_day_week_typ_mon THEN (CASE w_cal.mon WHEN '0' THEN i_cal_cd ELSE NULL END)
				WHEN c_day_week_typ_tue THEN (CASE w_cal.tue WHEN '0' THEN i_cal_cd ELSE NULL END)
				WHEN c_day_week_typ_wed THEN (CASE w_cal.wed WHEN '0' THEN i_cal_cd ELSE NULL END)
				WHEN c_day_week_typ_thu THEN (CASE w_cal.thu WHEN '0' THEN i_cal_cd ELSE NULL END)
				WHEN c_day_week_typ_fri THEN (CASE w_cal.fri WHEN '0' THEN i_cal_cd ELSE NULL END)
				WHEN c_day_week_typ_sat THEN (CASE w_cal.sat WHEN '0' THEN i_cal_cd ELSE NULL END)
			END AS cal_cd,
			dt
		FROM generate_series(w_cal.st_dt, w_cal.end_dt, '1 day') dt
		WHERE 0=0
		AND NOT EXISTS (SELECT 1 FROM maw_cal_ext_key w WHERE w.dt = dt)
		;
	END LOOP ;

	-- 臨時カレンダの勤休取得
	UPDATE maw_cal_ext_key t1
	SET
		cal_cd = CASE w.off_flg WHEN '0' THEN i_cal_cd ELSE NULL END
	FROM (
		SELECT w.dt, w.off_flg
		FROM mam_cal_ext w
		WHERE 0=0
		AND w.cal_cd = i_cal_cd
		AND w.dt >= DATE_TRUNC('DAY', i_fr_dt)
		AND w.dt <= DATE_TRUNC('DAY', i_to_dt)
		AND w.del_flg = '0'
	) w
	WHERE 0=0
	AND DATE_TRUNC('DAY', t1.dt) = w.dt
	;

	INSERT INTO maw_cal_ext_key (cal_cd, dt)
	SELECT 
		CASE t1.off_flg WHEN '0' THEN i_cal_cd ELSE NULL END AS cal_cd,
		t1.dt
	FROM mam_cal_ext t1
	WHERE 0=0
	AND t1.cal_cd = i_cal_cd
	AND t1.dt >= i_fr_dt
	AND t1.dt <= i_to_dt
	AND t1.del_flg = '0'
	AND NOT EXISTS (SELECT 1 FROM maw_cal_ext_key w WHERE w.dt = t1.dt)
	;

	-- カレンダが存在しないときは稼働扱い
	INSERT INTO maw_cal_ext_key (cal_cd, dt)
	SELECT COALESCE(i_cal_cd, c_null_val), dt
	FROM generate_series(i_fr_dt, i_to_dt, '1 day') dt
	WHERE NOT EXISTS (SELECT 1 FROM maw_cal_ext_key w where w.dt = dt) ;


	-- テンポラリ勤休カレンダの勤務日合計値を取得
	SELECT COUNT(t1.cal_cd)
	INTO STRICT l_sum
	FROM maw_cal_ext_key t1
	WHERE 0=0
	AND t1.dt >= i_fr_dt
	AND t1.dt <= i_to_dt
	AND t1.cal_cd IS NOT NULL
	;

	-- テンポラリ勤休カレンダの初期化
	CALL fcpa_postgres_util$p_truncate_work('maw_cal_ext_key') ;

	RETURN l_sum ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_cal_date_lt(
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_lt NUMERIC,
	 IN i_fwd_flg CHAR DEFAULT '1',
	 IN i_cal_cd VARCHAR DEFAULT NULL
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		カレンダの休日を考慮してリードタイム計算を行う
<REMARKS>
<ARGUMENTS>
<IN>	i_base_dt
		計算元の基準日付
<IN>	i_lt
		リードタイム日数
<IN>	i_fwd_flg
		リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
		I_FWD_FLG='1'：直後の稼働日
		I_FWD_FLG='0'：直前の稼働日
<IN>	i_cal_cd
		カレンダコード
<RETURNVALUE>
		リードタイム計算後の日付
<HISTORY>
**********************************************************/
DECLARE
	c_day_week_typ_sun CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'SUN') ;
	c_day_week_typ_mon CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'MON') ;
	c_day_week_typ_tue CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'TUE') ;
	c_day_week_typ_wed CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'WED') ;
	c_day_week_typ_thu CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'THU') ;
	c_day_week_typ_fri CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'FRI') ;
	c_day_week_typ_sat CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'SAT') ;

	l_sum NUMERIC := 0 ;				/* 勤務日合計のテンポラリ変数 */
	l_tmp_dt TIMESTAMP(0) WITHOUT TIME ZONE ;	/* 日付ループ用テンポラリ変数 */
	l_tmp_num NUMERIC ;				/* 曜日算出用テンポラリ変数 */
	l_tmp_dt1 TIMESTAMP(0) WITHOUT TIME ZONE ;	/* リードタイム＝０における稼働日算出用テンポラリ変数１ */
	l_true CHAR(1) := '1' ;
	l_ret_dt TIMESTAMP(0) WITHOUT TIME ZONE ;	/* リターン日付用テンポラリ変数 */
	l_tmp_num2 NUMERIC ;				/* 臨時カレンダの休日チェック用テンポラリ変数 */
	w_cal RECORD ;
BEGIN
	-- 基準日付がNULLの場合NULLをリターン
	IF i_base_dt IS NULL THEN
		RETURN NULL ;
	END IF ;

	-- リードタイムがNULLの場合NULLをリターン
	IF i_lt IS NULL THEN
		RETURN NULL ;
	END IF ;

	-- リードタイムが正の場合
	IF i_lt > 0 THEN
		SELECT mapa_dt$f_cal_days(i_base_dt + '1 day'::INTERVAL, i_base_dt + (i_lt || ' days')::INTERVAL, i_cal_cd) INTO STRICT l_sum ;

		-- リードタイムと勤務日合計値が一致すれば日付を返す
		IF l_sum = i_lt THEN
			RETURN i_base_dt + (i_lt || ' days')::INTERVAL ;
		ELSE
			-- リードタイムと勤務日合計値が一致しなければ休日分をリードタイムとして再計算
			RETURN mapa_dt$f_cal_date_lt(i_base_dt + (i_lt || ' days')::INTERVAL, i_lt - l_sum, i_fwd_flg, i_cal_cd) ;
		END IF ;
	-- リードタイムが負の場合
	ELSIF i_lt < 0 THEN
		SELECT mapa_dt$f_cal_days(i_base_dt + (i_lt || ' days')::INTERVAL, i_base_dt + '-1 day'::INTERVAL, i_cal_cd) INTO STRICT l_sum ;

		/* リードタイムと勤務日合計値が一致すれば日付を返す */
		IF l_sum = - i_lt THEN
			RETURN i_base_dt + (i_lt || ' days')::INTERVAL ;
		ELSE
			/* リードタイムと勤務日合計値が一致しなければ休日分をリードタイムとして再計算 */
			RETURN mapa_dt$f_cal_date_lt(i_base_dt + (i_lt || ' days')::INTERVAL, i_lt + l_sum, i_fwd_flg, i_cal_cd) ;
		END IF ;
	-- リードタイムが0の場合
	ELSE
		/* 基準日補正区分が未来方向の場合 */
		IF i_fwd_flg = l_true THEN

			/* 臨時カレンダで基準日から直近の稼働日 */
			SELECT	MIN(dt)
			INTO	STRICT l_tmp_dt1
			FROM	mam_cal_ext
			WHERE 0=0
			AND cal_cd = i_cal_cd
			AND dt >= DATE_TRUNC('DAY', i_base_dt)
			AND (CASE off_flg WHEN '1' THEN 0 ELSE 1 END) = 1
			AND del_flg = '0'
			;

			IF l_tmp_dt1 = i_base_dt THEN
				RETURN i_base_dt ;
			END IF ;

			/* 通常カレンダで基準日から直近の稼働日 */
			l_tmp_dt := i_base_dt ;
			FOR w_cal IN
				SELECT
					fcpa_postgres_util$greatest(t1.st_dt, i_base_dt) AS st_dt,
					t1.end_dt AS end_dt,
					CASE t1.sun_off_flg WHEN '1' THEN 0 ELSE 1 END AS sun,
					CASE t1.mon_off_flg WHEN '1' THEN 0 ELSE 1 END AS mon,
					CASE t1.tue_off_flg WHEN '1' THEN 0 ELSE 1 END AS tue,
					CASE t1.wed_off_flg WHEN '1' THEN 0 ELSE 1 END AS wed,
					CASE t1.thu_off_flg WHEN '1' THEN 0 ELSE 1 END AS thu,
					CASE t1.fri_off_flg WHEN '1' THEN 0 ELSE 1 END AS fri,
					CASE t1.sat_off_flg WHEN '1' THEN 0 ELSE 1 END AS sat
				FROM mam_cal t1
				WHERE 0=0
				AND t1.cal_cd = i_cal_cd
				AND t1.end_dt >= i_base_dt
				AND t1.del_flg = '0'
				ORDER BY t1.st_dt
			LOOP
				IF l_tmp_dt <> w_cal.st_dt THEN
					l_tmp_num := 1 ;
					EXIT ;
				END IF ;

				WHILE (l_tmp_dt <= w_cal.end_dt) LOOP
					CASE mapa_dt$f_to_day_week_typ(l_tmp_dt)
						WHEN c_day_week_typ_sun THEN l_tmp_num := w_cal.sun ;
						WHEN c_day_week_typ_mon THEN l_tmp_num := w_cal.mon ;
						WHEN c_day_week_typ_tue THEN l_tmp_num := w_cal.tue ;
						WHEN c_day_week_typ_wed THEN l_tmp_num := w_cal.wed ;
						WHEN c_day_week_typ_thu THEN l_tmp_num := w_cal.thu ;
						WHEN c_day_week_typ_fri THEN l_tmp_num := w_cal.fri ;
						WHEN c_day_week_typ_sat THEN l_tmp_num := w_cal.sat ;
					END CASE ;
					EXIT WHEN l_tmp_num = 1 ;
					l_tmp_dt := l_tmp_dt + '1 day'::INTERVAL ;
				END LOOP ;
				EXIT WHEN l_tmp_num = 1 ;
			END LOOP ;

			IF (l_tmp_dt1 IS NULL) AND (l_tmp_dt IS NULL) THEN
				l_ret_dt := i_base_dt ;
			ELSIF (l_tmp_dt1 IS NULL) OR (l_tmp_dt1 > l_tmp_dt) THEN
				l_ret_dt := l_tmp_dt ;
			ELSE
				RETURN l_tmp_dt1 ;
			END IF ;

			-- 臨時カレンダで休日の場合、再計算が必要
			SELECT COUNT(cal_cd)
			INTO STRICT l_tmp_num2
			FROM mam_cal_ext
			WHERE 0=0
			AND cal_cd = i_cal_cd
			AND dt = DATE_TRUNC('DAY', l_ret_dt)
			AND (CASE off_flg WHEN '1' THEN 0 ELSE 1 END) = 0
			AND del_flg = '0'
			;

			IF l_tmp_num2 = 0 THEN
				RETURN l_ret_dt ;
			ELSE
				RETURN mapa_dt$f_cal_date_lt(l_ret_dt + '1 day'::INTERVAL, 0, i_fwd_flg, i_cal_cd) ;
			END IF ;

		-- 基準日補正区分が過去方向の場合
		ELSE
			-- 臨時カレンダで基準日から直後の稼働日
			SELECT	MAX(dt)
			INTO	STRICT l_tmp_dt1
			FROM	mam_cal_ext
			WHERE	0=0
			AND cal_cd = i_cal_cd
			AND dt <= DATE_TRUNC('DAY', i_base_dt)
			AND (CASE off_flg WHEN '1' THEN 0 ELSE 1 END) = 1
			AND del_flg = '0'
			;

			-- 通常カレンダで基準日から直後の稼働日
			l_tmp_dt := i_base_dt ;

			FOR w_cal IN
				SELECT
					t1.st_dt AS st_dt,
					fcpa_postgres_util$least(t1.end_dt, i_base_dt) AS end_dt,
					CASE t1.sun_off_flg WHEN '1' THEN 0 ELSE 1 END AS sun,
					CASE t1.mon_off_flg WHEN '1' THEN 0 ELSE 1 END AS mon,
					CASE t1.tue_off_flg WHEN '1' THEN 0 ELSE 1 END AS tue,
					CASE t1.wed_off_flg WHEN '1' THEN 0 ELSE 1 END AS wed,
					CASE t1.thu_off_flg WHEN '1' THEN 0 ELSE 1 END AS thu,
					CASE t1.fri_off_flg WHEN '1' THEN 0 ELSE 1 END AS fri,
					CASE t1.sat_off_flg WHEN '1' THEN 0 ELSE 1 END AS sat
				FROM mam_cal t1
				WHERE 0=0
				AND t1.cal_cd = i_cal_cd
				AND t1.st_dt <= i_base_dt
				AND t1.del_flg = '0'
				ORDER BY t1.st_dt DESC
			LOOP
				IF l_tmp_dt <> w_cal.end_dt THEN
					l_tmp_num := 1 ;
					EXIT ;
				END IF ;

				WHILE (l_tmp_dt >= w_cal.st_dt) LOOP
					CASE mapa_dt$f_to_day_week_typ(l_tmp_dt)
						WHEN c_day_week_typ_sun THEN l_tmp_num := w_cal.sun ;
						WHEN c_day_week_typ_mon THEN l_tmp_num := w_cal.mon ;
						WHEN c_day_week_typ_tue THEN l_tmp_num := w_cal.tue ;
						WHEN c_day_week_typ_wed THEN l_tmp_num := w_cal.wed ;
						WHEN c_day_week_typ_thu THEN l_tmp_num := w_cal.thu ;
						WHEN c_day_week_typ_fri THEN l_tmp_num := w_cal.fri ;
						WHEN c_day_week_typ_sat THEN l_tmp_num := w_cal.sat ;
					END CASE ;
					EXIT WHEN l_tmp_num = 1 ;
					l_tmp_dt := l_tmp_dt - '1 day'::INTERVAL ;
				END LOOP ;
				EXIT WHEN l_tmp_num = 1 ;
			END LOOP ;

			IF (l_tmp_dt1 IS NULL) AND (l_tmp_dt IS NULL) THEN
				l_ret_dt := i_base_dt ;
			ELSIF (l_tmp_dt1 IS NULL) OR (l_tmp_dt1 < l_tmp_dt) THEN
				l_ret_dt := l_tmp_dt ;
			ELSE
				l_ret_dt := l_tmp_dt1 ;
			END IF ;

			-- 臨時カレンダで休日の場合、再計算が必要
			SELECT COUNT(cal_cd)
			INTO STRICT l_tmp_num2
			FROM mam_cal_ext
			WHERE 0=0
			AND cal_cd = i_cal_cd
			AND dt = DATE_TRUNC('DAY', l_ret_dt)
			AND (CASE off_flg WHEN '1' THEN 0 ELSE 1 END) = 0
			AND del_flg = '0'
			;

			IF l_tmp_num2 = 0 THEN
				RETURN l_ret_dt ;
			ELSE
				RETURN mapa_dt$f_cal_date_lt(l_ret_dt - '1 day'::INTERVAL, 0, i_fwd_flg, i_cal_cd) ;
			END IF ;
		END IF ;

	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_cal_date (
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_lt NUMERIC,
	 IN i_fwd_flg CHAR DEFAULT '1',
	 IN i_cal_cd VARCHAR DEFAULT NULL,
	 IN i_xfr_flg CHAR DEFAULT NULL
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		カレンダの休日を考慮してリードタイム計算を行う
<REMARKS>
		休日をリードタイムに含める（全期間考慮）ケースでは計算元の基準日付
		から与えられたカレンダの稼働日を元としてリードタイム計算を行う。
		休日をリードタイムに含めない（完了日のみ）ケースでは与えられた基準日付
		を元としてリードタイム計算を行う。（常に移動元の稼働日を基準にする場合は
		f_cal_date_moveを用いる）
<ARGUMENTS>
<IN>	i_base_dt
		計算元の基準日付
<IN>	i_lt
		リードタイム日数
<IN>	i_fwd_flg
		リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
		i_fwd_flg='1'：直後の稼働日
		i_fwd_flg='0'：直前の稼働日
<IN>	i_cal_cd
		カレンダコード
<IN>	i_xfr_flg
		移動用ＦＬＧ
		i_xfr_flg='1'：休日をリードタイムに含めない（移動用）
		i_xfr_flg='0'：休日をリードタイムに含める（製造用）
<RETURNVALUE>
		リードタイム計算後の日付
<HISTORY>
**********************************************************/
DECLARE
	l_true		CHAR(1) := '1' ;
	l_false		CHAR(1) := '0' ;
	f_base_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
BEGIN
	IF i_xfr_flg = l_false THEN
		-- 休日をリードタイムに含める（全期間考慮）場合
		-- 基準日付が休日であった場合、直近稼働日を基準日付にする
		IF i_lt = 0 THEN
			f_base_dt := mapa_dt$f_cal_date_lt(i_base_dt, 0, i_fwd_flg, i_cal_cd) ;
		ELSIF i_lt > 0 THEN
			f_base_dt := mapa_dt$f_cal_date_lt(i_base_dt, 0, l_true, i_cal_cd) ;
		ELSE
			f_base_dt := mapa_dt$f_cal_date_lt(i_base_dt, 0, l_false, i_cal_cd) ;
		END IF ;

		RETURN mapa_dt$f_cal_date_lt(f_base_dt, i_lt, i_fwd_flg, i_cal_cd) ;
	ELSE
		-- 休日をリードタイムに含めない（完了日のみ）場合
		-- 基準日付そのままで計算する
		f_base_dt := i_base_dt ;

		IF i_lt = 0 THEN
			RETURN mapa_dt$f_cal_date_lt(f_base_dt + (i_lt || ' days')::INTERVAL, 0, i_fwd_flg, i_cal_cd) ;
		ELSIF i_lt > 0 THEN
			RETURN mapa_dt$f_cal_date_lt(f_base_dt + (i_lt || ' days')::INTERVAL, 0, l_true, i_cal_cd) ;
		ELSE
			RETURN mapa_dt$f_cal_date_lt(f_base_dt + (i_lt || ' days')::INTERVAL, 0, l_false, i_cal_cd) ;
		END IF ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_cal_date_loc (
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_lt NUMERIC,
	 IN i_fwd_flg CHAR DEFAULT '1',
	 IN i_loc_cd VARCHAR DEFAULT NULL,
	 IN i_xfr_flg CHAR DEFAULT NULL
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		場所コードからカレンダを取得し、カレンダの休日を考慮してリードタイム計算を行う
<REMARKS>
<ARGUMENTS>
<IN>	i_base_dt
		計算元の基準日付
<IN>	i_lt
		リードタイム日数
<IN>	i_fwd_flg
		リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
		i_fwd_flg='1'：直後の稼働日
		i_fwd_flg='0'：直前の稼働日
<IN>	i_loc_cd
		場所コード
<IN>	i_xfr_flg
		移動用ＦＬＧ
		i_xfr_flg='1'：休日をリードタイムに含めない（移動用）
		i_xfr_flg='0'：休日をリードタイムに含める（製造用）
<RETURNVALUE>
		リードタイム計算後の日付
<HISTORY>
**********************************************************/
DECLARE
	l_cal_cd	mam_loc.cal_cd%TYPE ;
	l_msg		VARCHAR[] ;
BEGIN
	BEGIN
		SELECT cal_cd INTO STRICT l_cal_cd FROM mam_loc t1 WHERE loc_cd = i_loc_cd ;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			l_msg := fcpa_err$msg_binder(i_loc_cd) ;
			CALL fcpa_err$raise_app_err('MAUCD0008', l_msg) ;
	END ;

	IF l_cal_cd IS NULL THEN
		l_cal_cd := (mapa_co$f_get_co_rec()).std_cal_cd ;
	END IF ;

	RETURN mapa_dt$f_cal_date(i_base_dt, i_lt, i_fwd_flg, l_cal_cd, i_xfr_flg) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_cal_date_move(
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_lt NUMERIC,
	 IN i_fwd_flg CHAR DEFAULT '1',
	 IN i_f_cal_cd VARCHAR DEFAULT NULL,
	 IN i_f_loc_cd VARCHAR DEFAULT NULL,
	 IN i_t_cal_cd VARCHAR DEFAULT NULL,
	 IN i_t_loc_cd VARCHAR DEFAULT NULL
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		移動のリードタイム計算を求める。
<REMARKS>
		移動専用のリードタイム計算となり、基準日付に対して移動元カレンダ（もしくは移動元場所）
		の稼働日を移動元の日付として、リードタイム計算を行い格納予定日を求める
<ARGUMENTS>
<IN>	I_BASE_DT
		計算元の基準日付
<IN>	I_LT
		リードタイム日数
<IN>	I_FWD_FLG
		リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
		I_FWD_FLG='1'：直後の稼働日
		I_FWD_FLG='0'：直前の稼働日
<IN>	I_F_CAL_CD
		移動元カレンダコード（NULLの場合、移動元場所コードが必須）
<IN>	I_F_LOC_CD
		移動元場所コード
<IN>	I_T_CAL_CD
		移動先カレンダコード（NULLの場合、移動先場所コードが必須）
<IN>	I_T_LOC_CD
		移動先場所コード
<RETURNVALUE>
		リードタイム計算後の日付
<HISTORY>
**********************************************************/
DECLARE
	l_f_cal_cd	mam_loc.cal_cd%TYPE ;
	l_t_cal_cd	mam_loc.cal_cd%TYPE ;
	l_msg		VARCHAR[] ;
	l_true		CHAR(1) := '1' ;
	f_base_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
BEGIN
	-- 移動元カレンダを取得
	IF i_f_cal_cd IS NULL THEN
		BEGIN
			SELECT cal_cd INTO STRICT l_f_cal_cd FROM mam_loc t1 WHERE loc_cd = i_f_loc_cd ;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				l_f_cal_cd := NULL ;
		END ;
	ELSE
		l_f_cal_cd := i_f_cal_cd ;
	END IF ;

	IF l_f_cal_cd IS NULL THEN
		l_f_cal_cd := (mapa_co$f_get_co_rec()).std_cal_cd ;
	END IF ;

	-- 移動先カレンダを取得
	IF i_t_cal_cd IS NULL THEN
		BEGIN
			SELECT cal_cd INTO STRICT l_t_cal_cd FROM mam_loc t1 WHERE loc_cd = i_t_loc_cd ;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				l_t_cal_cd := NULL ;
		END ;
	ELSE
		l_t_cal_cd := i_t_cal_cd ;
	END IF ;

	IF l_t_cal_cd IS NULL THEN
		l_t_cal_cd := (mapa_co$f_get_co_rec()).std_cal_cd ;
	END IF ;

	-- 移動元カレンダにおける基準日付の直近稼働日を算出
	IF i_lt = 0 THEN
		f_base_dt := mapa_dt$f_cal_date_lt(i_base_dt, 0, i_fwd_flg, l_f_cal_cd) ;
	ELSIF i_lt > 0 THEN
		f_base_dt := mapa_dt$f_cal_date_lt(i_base_dt, 0, '1'::CHAR, l_f_cal_cd) ;
	ELSE
		f_base_dt := mapa_dt$f_cal_date_lt(i_base_dt, 0, '0'::CHAR, l_f_cal_cd) ;
	END IF ;

	-- リードタイム計算
	IF i_lt = 0 THEN
		RETURN mapa_dt$f_cal_date_lt(f_base_dt + (i_lt || ' days')::INTERVAL, 0, i_fwd_flg, l_t_cal_cd) ;
	ELSIF i_lt > 0 THEN
		RETURN mapa_dt$f_cal_date_lt(f_base_dt + (i_lt || ' days')::INTERVAL, 0, '1'::CHAR, l_t_cal_cd) ;
	ELSE
		RETURN mapa_dt$f_cal_date_lt(f_base_dt + (i_lt || ' days')::INTERVAL, 0, '0'::CHAR, l_t_cal_cd) ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_to_ym(
	 IN i_date TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		日付の「日」以降を切り捨てて、年月を返します。
<REMARKS>
<ARGUMENTS>
<IN>	I_DATE
		日付
<RETURNVALUE>
		年月
<HISTORY>
**********************************************************/
BEGIN
	RETURN DATE_TRUNC('MONTH', i_date) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_to_date(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_days NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		年月と日にちを合わせて日付にして返します。
<REMARKS>
		引数の何れかがNULL、日にちが０以下、
		年月の最終日より大きい場合はNULLを返します。
<ARGUMENTS>
<IN>	i_ym
		年月
<IN>	i_days
		日にち
<RETURNVALUE>
		日付
<HISTORY>
**********************************************************/
BEGIN
	IF i_ym IS NULL OR i_days IS NULL THEN
		RETURN TO_TIMESTAMP(NULL) ;
	END IF ;

	IF i_days <= 0 OR EXTRACT(DAY FROM fcpa_postgres_util$last_day(i_ym)) < i_days THEN
		RETURN TO_TIMESTAMP(NULL) ;
	END IF ;

	RETURN DATE_TRUNC('MONTH', i_ym) + (i_days - 1 || ' days')::INTERVAL ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_is_wrkday(
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_cal_cd VARCHAR
)
RETURNS CHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		日付とカレンダＣＤから稼働日かどうかを判断する。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		日付
<IN>	i_cal_cd
		カレンダＣＤ
<RETURNVALUE>
		'1'：稼働日、'0'：非稼動日（休日）
<HISTORY>
**********************************************************/
DECLARE
	cnt			NUMERIC ;
	ret			CHAR(1) ;
	r_sun		CHAR(1) ;
	r_mon		CHAR(1) ;
	r_tue		CHAR(1) ;
	r_wed		CHAR(1) ;
	r_thu		CHAR(1) ;
	r_fri		CHAR(1) ;
	r_sat		CHAR(1) ;
	week_typ	VARCHAR(1) ;
	l_true		CHAR(1) := '1' ;
BEGIN
	-- 臨時カレンダで休日かどうかを判断
	SELECT	COUNT(cal_cd) INTO STRICT cnt
	FROM	mam_cal_ext
	WHERE	cal_cd = i_cal_cd
	AND	dt = DATE_TRUNC('DAY', i_dt)
	AND	del_flg = '0'
	;

	IF cnt > 0 THEN
		-- 臨時カレンダで基準日からカレンダー勤休区分取得
		SELECT CASE off_flg WHEN l_true THEN '0' ELSE '1' END INTO STRICT ret
		FROM	mam_cal_ext
		WHERE	cal_cd = i_cal_cd
		AND	dt = DATE_TRUNC('DAY', i_dt)
		AND	del_flg = '0'
		;

		RETURN ret ;
	-- カレンダマスタで休日かどうかを判断
	ELSE
		BEGIN
			SELECT
				CASE sun_off_flg WHEN l_true THEN '0' ELSE '1' END AS sun,
				CASE mon_off_flg WHEN l_true THEN '0' ELSE '1' END AS mon,
				CASE tue_off_flg WHEN l_true THEN '0' ELSE '1' END AS tue,
				CASE wed_off_flg WHEN l_true THEN '0' ELSE '1' END AS wed,
				CASE thu_off_flg WHEN l_true THEN '0' ELSE '1' END AS thu,
				CASE fri_off_flg WHEN l_true THEN '0' ELSE '1' END AS fri,
				CASE sat_off_flg WHEN l_true THEN '0' ELSE '1' END AS sat
			INTO	STRICT r_sun, r_mon, r_tue, r_wed, r_thu, r_fri, r_sat
			FROM	mam_cal
			WHERE cal_cd = i_cal_cd
			AND st_dt <= i_dt
			AND end_dt >= i_dt
			AND del_flg = '0'
			;

			week_typ := mapa_dt$f_to_day_week_typ(i_dt) ;

			IF (fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'SUN') = week_typ) THEN
				RETURN r_sun ;
			ELSIF (fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'MON') = week_typ) THEN
				RETURN r_mon ;
			ELSIF (fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'TUE') = week_typ) THEN
				RETURN r_tue ;
			ELSIF (fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'WED') = week_typ) THEN
				RETURN r_wed ;
			ELSIF (fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'THU') = week_typ) THEN
				RETURN r_thu ;
			ELSIF (fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'FRI') = week_typ) THEN
				RETURN r_fri ;
			ELSIF (fcpa_const$get_const_val('MAC_DAY_WEEK_TYP', 'SAT') = week_typ) THEN
				RETURN r_sat ;
			END IF ;

		EXCEPTION
			-- カレンダマスタに存在しない場合は稼働日扱い
			WHEN NO_DATA_FOUND THEN
				RETURN '1' ;
		END ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dt$f_is_before_after (
	 IN i_dt1 TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt2 TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		日時比較、対象日時のどちらかの時刻が00:00ならば、日付で比較。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt1
		本来小さい日時
<IN>	i_dt2
		本来大きい日時
<RETURNVALUE>
		'1'：正常、'0'：異常
<HISTORY>
**********************************************************/
DECLARE
	l_true	CHAR(1) := '1' ;
	l_false	CHAR(1) := '0' ;
	l_dt1	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dt2	TIMESTAMP(0) WITHOUT TIME ZONE ;
BEGIN
	IF i_dt1 IS NULL OR i_dt2 IS NULL THEN
		RETURN l_true ;
	END IF ;

	l_dt1 := i_dt1 ;
	l_dt2 := i_dt2 ;

	IF l_dt1 = DATE_TRUNC('DAY', l_dt1) OR l_dt2 = DATE_TRUNC('DAY', l_dt2) THEN
		l_dt1 := DATE_TRUNC('DAY', l_dt1) ;
		l_dt2 := DATE_TRUNC('DAY', l_dt2) ;
	END IF ;

	IF l_dt2 < l_dt1 THEN
		RETURN l_false ;
	END IF ;

	RETURN l_true ;
END ;
$BODY$
LANGUAGE plpgsql
;
