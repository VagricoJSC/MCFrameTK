CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_last_bill_mng_no(
	 IN i_bcst_cd VARCHAR,
	 IN i_bill_dpt_cd VARCHAR,
	 IN i_iv_no VARCHAR,
	 IN i_cur_cd VARCHAR,
	 IN i_wrk_no VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		最終請求管理ＮＯを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_bill_dpt_cd
		請求部門ＣＤ
<IN>	i_iv_no
		インボイスＮＯ
<IN>	i_cur_cd
		通貨ＣＤ
<IN>	i_wrk_cd
		案件ＣＤ
<ReturnValue>
		請求ＩＤ
**********************************************************/
DECLARE
	c_bill_cl_sts_typ_not_bill CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_BILL_CL_STS_TYP','NOT_BILL');

	l_last_bill_mng_no mst_bill.bill_mng_no%TYPE;
BEGIN
	SELECT	MAX(bill_mng_no)
	INTO	STRICT l_last_bill_mng_no
	FROM	mst_bill t1
	WHERE	0=0
	AND	t1.bcst_cd = i_bcst_cd
	AND	t1.bill_dpt_cd = i_bill_dpt_cd
	AND	t1.iv_no = i_iv_no
	AND	t1.trd_cur_cd = i_cur_cd
	AND	(t1.wrk_no = i_wrk_no OR t1.wrk_no IS NULL AND i_wrk_no IS NULL)
	AND	c_bill_cl_sts_typ_not_bill != t1.bill_cl_sts_typ
	;

	IF l_last_bill_mng_no IS NULL THEN
		SELECT	MIN(bill_mng_no)
		INTO	STRICT l_last_bill_mng_no
		FROM	mst_bill t1
		WHERE	0=0
		AND	t1.bcst_cd = i_bcst_cd
		AND	t1.bill_dpt_cd = i_bill_dpt_cd
		AND	t1.iv_no = i_iv_no
		AND	t1.trd_cur_cd = i_cur_cd
		AND	(t1.wrk_no = i_wrk_no OR t1.wrk_no IS NULL AND i_wrk_no IS NULL)
		AND	c_bill_cl_sts_typ_not_bill = t1.bill_cl_sts_typ
		;
	END IF;

	RETURN l_last_bill_mng_no;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_cl_day_list(
	 IN i_bcst_cd VARCHAR
)
RETURNS NUMERIC[]
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求先の締日のリストを返す
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<ReturnValue>
		締日のリスト
**********************************************************/
DECLARE
	l_days NUMERIC[];

	cur_cl_day CURSOR FOR
		SELECT DISTINCT bill_cl_day FROM
		(
			SELECT bill_cl_day1 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day1 > 0
			UNION ALL
			SELECT bill_cl_day2 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day2 > 0
			UNION ALL
			SELECT bill_cl_day3 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day3 > 0
			UNION ALL
			SELECT bill_cl_day4 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day4 > 0
			UNION ALL
			SELECT bill_cl_day5 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day5 > 0
		) var_sbq
		ORDER BY bill_cl_day
		;
BEGIN

	FOR rec_cl_day IN cur_cl_day LOOP
		l_days := array_append(l_days, rec_cl_day.bill_cl_day);
	END LOOP;

	RETURN l_days;

END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_max_cl_day(
	 IN i_bcst_cd VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求先の最大（月で最後）の締日を返す
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<ReturnValue>
		最大の締日
**********************************************************/
DECLARE
	l_max_cl_day mam_bp.bill_cl_day1%TYPE;
BEGIN

	SELECT MAX(bill_cl_day) INTO STRICT l_max_cl_day FROM
		(
			SELECT bill_cl_day1 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day1 > 0
			UNION ALL
			SELECT bill_cl_day2 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day2 > 0
			UNION ALL
			SELECT bill_cl_day3 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day3 > 0
			UNION ALL
			SELECT bill_cl_day4 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day4 > 0
			UNION ALL
			SELECT bill_cl_day5 AS bill_cl_day FROM mam_bp WHERE bp_cd = i_bcst_cd AND bill_cl_day5 > 0
		) var_sbq;

	RETURN l_max_cl_day;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_schd_bill_dt(
	 IN i_bcst_cd VARCHAR,
	 IN i_bill_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_bill_crryovr_times NUMERIC,
	 IN i_get_not_bill_day_flg CHARACTER DEFAULT '0'
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求先、基準日に対応した請求予定日を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_bill_base_dt
		請求予定日算出の基準日
<IN>	i_bill_crryovr_times
		請求サイト
<IN>	i_get_not_bill_day_flg
		'0':取得した請求予定日をそのまま返す
		'1':取得した請求予定日が過去日であった場合、
		未来の直近の請求予定日を再取得して返す
<ReturnValue>
		請求予定日
**********************************************************/
DECLARE
	c_bill_cl_typ_sel CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BILL_CL_TYP','SEL');

	l_bill_cl_day mam_bp.bill_cl_day1%TYPE;
	l_bill_cl_typ mam_bp.bill_cl_typ%TYPE;
	l_bill_dt TIMESTAMP WITHOUT TIME ZONE;
	l_sys_dt TIMESTAMP WITHOUT TIME ZONE;
	l_base_dt TIMESTAMP WITHOUT TIME ZONE;
	l_cl_day_list NUMERIC[];
	l_list_cnt INTEGER;
	l_crryovr_cnt NUMERIC(3);
	l_last_day TIMESTAMP WITHOUT TIME ZONE;
BEGIN

	/* 引数チェック */
	IF i_bill_base_dt IS NULL THEN
		RETURN NULL;
	END IF;

	/* 基準情報の設定 */
	l_sys_dt := fcpa_date_util$f_get_today();
	l_base_dt := i_bill_base_dt;

	/* 請求予定日基本情報の取得 */
	SELECT	bill_cl_typ
	INTO	STRICT l_bill_cl_typ
	FROM	mam_bp
	WHERE	0=0
	AND	bp_cd = i_bcst_cd
	;

	/* マニュアル選択請求の場合はNULLを返す */
	IF (c_bill_cl_typ_sel = l_bill_cl_typ) THEN
		RETURN NULL;
	END IF;

	/* 締日のリストを取得 */
	l_cl_day_list := mspa_ar_util$f_get_cl_day_list(i_bcst_cd);

	IF COALESCE(array_length(l_cl_day_list, 1), 0) = 0 THEN
		RETURN NULL;
	END IF;

	/* 締日ごとの処理 */
	l_list_cnt := 1;
	l_crryovr_cnt := COALESCE(i_bill_crryovr_times, 0) + 1;
	WHILE TRUE LOOP

		/* リストのサイズを超えたら翌月の１日を基準としてリストの最初から処理 */
		IF array_length(l_cl_day_list, 1) < l_list_cnt THEN
			l_list_cnt := 1;
			l_base_dt := fcpa_postgres_util$add_months(DATE_TRUNC('MONTH', l_base_dt), 1);
		END IF;
		l_bill_cl_day := l_cl_day_list[l_list_cnt];
		l_last_day := fcpa_postgres_util$last_day(l_base_dt);

		/* 請求締日が月末の場合、無条件で月末が請求日 */
		IF (TO_CHAR(l_last_day, 'DD') <= LPAD(l_bill_cl_day::VARCHAR, 2, '0')) THEN
			l_bill_dt := l_last_day;
			l_crryovr_cnt := l_crryovr_cnt - 1;
		/* 基準日が締まっていない場合、基準日の月の請求締日が請求日 */
		ELSIF (TO_CHAR(l_base_dt, 'DD') <= LPAD(l_bill_cl_day::VARCHAR, 2, '0')) THEN
			l_bill_dt := TO_DATE(CONCAT(TO_CHAR(l_base_dt, 'YYYYMM'), LPAD(l_bill_cl_day::VARCHAR, 2, '0')), 'YYYYMMDD');
			l_crryovr_cnt := l_crryovr_cnt - 1;
		END IF;

		/* 請求サイトがゼロとなった場合はEXITする */
		EXIT WHEN l_crryovr_cnt = 0;

		l_list_cnt := l_list_cnt + 1;

	END LOOP;

	/* 求まった請求日が過去の場合、運用日付を基準として次回の請求日を求める */
	/* （運用日付を基準日として自分自身を呼び出す） */
	IF (i_get_not_bill_day_flg = '1'
				AND l_bill_dt < l_sys_dt) THEN
		l_base_dt := l_sys_dt;
		l_bill_dt := mspa_ar_util$f_get_schd_bill_dt(i_bcst_cd, l_base_dt, 0, i_get_not_bill_day_flg);
	END IF;

	RETURN l_bill_dt;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_ar_not_appl_bal(
	 IN i_acst_cd VARCHAR,
	 IN i_iv_no VARCHAR,
	 IN i_cur_cd VARCHAR,
	 IN i_wrk_no VARCHAR,
	 IN i_dpt_cd VARCHAR,
	 IN i_ar_typ VARCHAR,
	 IN i_ar_cl_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_mon NUMERIC,
	 IN i_bef_flg CHARACTER
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		指定した月の売掛金消込残高を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_acst_cd
		売掛先ＣＤ
<IN>	i_iv_no
		インボイスＮＯ
<IN>	i_cur_cd
		通貨ＣＤ
<IN>	i_wrk_no
		案件ＮＯ
<IN>	i_dpt_cd
		債権部門ＣＤ
<IN>	i_ar_typ
		債権区分
<IN>	i_ar_cl_ym
		売掛締年月
<IN>	i_mon
		締月の翌月 - 指定月の売掛金残高を求める（Oは当月）
<IN>	i_bef_flg
		TRUEの場合、指定月以前の売掛金残高合計を求める
<RETURNVALUE>
		売掛金消込残高
**********************************************************/
DECLARE
	l_tgt_mon TIMESTAMP WITHOUT TIME ZONE;
	l_ar_not_appl_bal mst_mly_ar_bal.ar_not_appl_bal%TYPE;
	l_ar_cl_ym TIMESTAMP WITHOUT TIME ZONE;
BEGIN

	/* 売掛締年月を取得 */
	l_ar_cl_ym := i_ar_cl_ym;

	/* 対象月の算出 */
	l_tgt_mon := fcpa_postgres_util$add_months(l_ar_cl_ym, i_mon * (- 1) + 1);

	/* 指定月以前ＦＬＧがTRUEの場合 */
	IF (i_bef_flg = '1') THEN
		SELECT	COALESCE(SUM(ta1.ar_not_appl_bal), 0)
		INTO	STRICT l_ar_not_appl_bal
		FROM	mst_mly_ar_bal ta1
		WHERE	0=0
		AND	ta1.acst_cd = i_acst_cd
		AND	ta1.iv_no = i_iv_no
		AND	ta1.trd_cur_cd = i_cur_cd
		AND	(ta1.wrk_no = i_wrk_no OR ta1.wrk_no IS NULL AND i_wrk_no IS NULL)
		AND	ta1.ar_dpt_cd = i_dpt_cd
		AND	ta1.ar_typ = i_ar_typ
		AND	ta1.ac_ym <= l_tgt_mon
		;
	/* 指定月以前ＦＬＧがFALSEの場合 */
	ELSIF (i_bef_flg = '0') THEN
		SELECT	COALESCE(SUM(ta1.ar_not_appl_bal), 0)
		INTO	STRICT l_ar_not_appl_bal
		FROM	mst_mly_ar_bal ta1
		WHERE	0=0
		AND	ta1.acst_cd = i_acst_cd
		AND	iv_no = i_iv_no
		AND	ta1.trd_cur_cd = i_cur_cd
		AND	(ta1.wrk_no = i_wrk_no OR ta1.wrk_no IS NULL
		AND	i_wrk_no IS NULL)
		AND	ta1.ar_dpt_cd = i_dpt_cd
		AND	ta1.ar_typ = i_ar_typ
		AND	ta1.ac_ym = l_tgt_mon
		;
	END IF;

	RETURN l_ar_not_appl_bal;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_bill_cl_day(
	 IN i_bill_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_bill_cl_typ VARCHAR,
	 IN i_bill_each_sls_flg CHARACTER
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求締日取得ファンクション
<REMARKS>
		請求年月を加工して請求締日を取得する
<ARGUMENTS>
	<IN>	i_bill_ym
			請求年月
	<IN>	i_bill_cl_typ
			請求締区分
	<IN>	i_bill_each_sls_flg
			都度請求フラグ
<RETURNVALUE>
		bill_cl_
		請求予定日
**********************************************************/
DECLARE
	c_bill_cl_typ_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BILL_CL_TYP','BATCH');
	c_bill_cl_typ_manual CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BILL_CL_TYP','MANUAL');
BEGIN
	IF (i_bill_each_sls_flg = '1') THEN
		RETURN NULL;
	END IF;

	IF (c_bill_cl_typ_batch = i_bill_cl_typ
		OR c_bill_cl_typ_manual = i_bill_cl_typ) THEN

		RETURN TO_CHAR(i_bill_ym, 'DD');
	ELSE
		RETURN NULL;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_last_bill_rec(
	 IN i_bcst_cd VARCHAR,
	 IN i_bill_dpt_cd VARCHAR,
	 IN i_iv_no VARCHAR,
	 IN i_cur_cd VARCHAR,
	 IN i_wrk_no VARCHAR
)
RETURNS mst_bill
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		最後の請求書の請求レコードを取得する
<REMARKS>
		画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先CD
<IN>	i_bill_dpt_cd
		請求部門ＣＤ
<IN>	i_iv_no
		インボイスNO
<IN>	i_cur_cd
		通貨CD
<IN>	i_wrk_no
		案件NO
**********************************************************/
DECLARE
	c_bill_cl_sts_typ_cl_scrn CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_BILL_CL_STS_TYP','CL_SCRN');
	c_bill_cl_sts_typ_cl_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_BILL_CL_STS_TYP','CL_BATCH');

	l_last_bill mst_bill%ROWTYPE;
BEGIN
	SELECT	t1.*
	INTO	STRICT l_last_bill
	FROM	mst_bill t1,
		(
		SELECT	MAX(bill_mng_no) AS bill_mng_no
		FROM	mst_bill
		WHERE	0=0
		AND	bcst_cd = i_bcst_cd
		AND	bill_dpt_cd = i_bill_dpt_cd
		AND	iv_no = i_iv_no
		AND	trd_cur_cd = i_cur_cd
		AND	(wrk_no = i_wrk_no OR wrk_no IS NULL AND i_wrk_no IS NULL)
		AND	(c_bill_cl_sts_typ_cl_scrn = bill_cl_sts_typ OR c_bill_cl_sts_typ_cl_batch = bill_cl_sts_typ)
		) v
	WHERE	0=0
	AND	v.bill_mng_no = t1.bill_mng_no
	;

	RETURN l_last_bill;
EXCEPTION
	WHEN no_data_found THEN
		/* 無い場合はNULLで返す */
		l_last_bill := NULL;
		RETURN l_last_bill;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_last_bill_amt(
	 IN i_bcst_cd VARCHAR,
	 IN i_bill_dpt_cd VARCHAR,
	 IN i_iv_no VARCHAR,
	 IN i_cur_cd VARCHAR,
	 IN i_wrk_no VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		最後の請求書の請求額を取得する
<REMARKS>
		画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先CD
<IN>	i_bill_dpt_cd
		請求部門ＣＤ
<IN>	i_iv_no
		インボイスNO
<IN>	i_cur_cd
		通貨CD
<IN>	i_wrk_no
		案件NO
**********************************************************/
DECLARE
	l_last_bill_amt mst_bill.bill_amt%TYPE;
	l_last_bill mst_bill%ROWTYPE;
BEGIN
	l_last_bill := mspa_ar_util$f_get_last_bill_rec(i_bcst_cd, i_bill_dpt_cd, i_iv_no, i_cur_cd, i_wrk_no);
	IF l_last_bill.bill_amt IS NULL THEN
		l_last_bill_amt := NULL;
	ELSE
		/* 該当のレコードの今回請求額を前回請求額として返す */
		l_last_bill_amt := l_last_bill.bill_amt;
	END IF;

	RETURN l_last_bill_amt;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_last_bill_cl_dt(
	 IN i_bcst_cd VARCHAR,
	 IN i_bill_dpt_cd VARCHAR,
	 IN i_iv_no VARCHAR,
	 IN i_cur_cd VARCHAR,
	 IN i_wrk_no VARCHAR
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		最後の請求書の請求締年月日を取得する
<REMARKS>
		画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先CD
<IN>	i_bill_dpt_cd
		請求部門ＣＤ
<IN>	i_iv_no
		インボイスNO
<IN>	i_cur_cd
		通貨CD
<IN>	i_wrk_no
		案件NO
**********************************************************/
DECLARE
	c_bill_cl_sts_typ_cl_scrn CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_BILL_CL_STS_TYP','CL_SCRN');
	c_bill_cl_sts_typ_cl_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_BILL_CL_STS_TYP','CL_BATCH');

	l_last_bill_cl_dt mst_bill.bill_cl_dt%TYPE;
BEGIN
	SELECT	t1.bill_cl_dt
	INTO	STRICT l_last_bill_cl_dt
	FROM	mst_bill t1,
		(
		SELECT	MAX(bill_mng_no) bill_mng_no
		FROM	mst_bill
		WHERE	0=0
		AND	bcst_cd = i_bcst_cd
		AND	iv_no = i_iv_no
		AND	bill_dpt_cd = i_bill_dpt_cd
		AND	trd_cur_cd = i_cur_cd
		AND	(wrk_no = i_wrk_no OR wrk_no IS NULL AND i_wrk_no IS NULL)
		AND	(c_bill_cl_sts_typ_cl_scrn = bill_cl_sts_typ OR c_bill_cl_sts_typ_cl_batch = bill_cl_sts_typ)
		) v
	WHERE	0=0
	AND	v.BILL_MNG_NO = t1.bill_mng_no
	;

	RETURN l_last_bill_cl_dt;
EXCEPTION
	WHEN no_data_found THEN
		l_last_bill_cl_dt := NULL;
		RETURN l_last_bill_cl_dt;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_combine_dt(
	 IN i_basedate TIMESTAMP WITHOUT TIME ZONE,
	 IN i_day NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		日付算出処理
<REMARKS>
		基準となる日付に対して入金サイトの加算や日にち指定を行い、
		入金予定日や締日を算出する
<ARGUMENTS>
<IN>	i_basedate
		基準日付
<IN>	i_day
		指定の日付('DD'、0:締日なし/99:末日)
<RETURNVALUE>	算出した日付
**********************************************************/
DECLARE
	l_date TIMESTAMP WITHOUT TIME ZONE;
	l_last_day TIMESTAMP WITHOUT TIME ZONE;
/* 戻り値 */
BEGIN
	/* -------------------------------------------------------- */
	/* 指定の日にち = 0 の場合、NULL を返す */
	/* -------------------------------------------------------- */
	IF i_basedate IS NULL OR i_day IS NULL OR i_day = 0 THEN
		RETURN NULL;
	END IF;
	l_date := i_basedate;
	l_last_day := fcpa_postgres_util$last_day(l_date);
	/* -------------------------------------------------------- */
	/* 月の最大日指定ではない場合 */
	/* -------------------------------------------------------- */
	IF i_day != 99 THEN
		/* 月の最大日が基準日付より大きい場合 */
		IF TO_CHAR(l_last_day, 'DD')::NUMERIC > i_day THEN
			/* (例) L_DATE = 2002/05/01 + (15 - 1) = 2002/05/15 */
			l_date := mapa_dt$f_to_ym(l_date) + ((i_day - 1) || ' days')::INTERVAL;
		ELSE
			/* 月の最大日が基準日付以下の場合 */
			l_date := l_last_day;
		END IF;
	/* -------------------------------------------------------- */
	/* 月の最大日指定の場合 */
	/* -------------------------------------------------------- */
	ELSE
		l_date := l_last_day;
	END IF;

	RETURN l_date;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_bill_cl_flg(
	 IN i_bcst_cd VARCHAR,
	 IN i_bill_basis_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_bill_crryovr_times NUMERIC,
	 IN i_bill_cl_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求明細締フラグ取得処理
		請求明細が請求締対象かを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_bill_basis_dt
		請求起算日
<IN>	i_bill_crryovr_times
		請求サイト
<IN>	i_bill_cl_dt
		請求締日
<RETURNVALUE>
		'0':締対象外 / '1':締対象
<HISTORY>
**********************************************************/
DECLARE
	l_base_dt TIMESTAMP WITHOUT TIME ZONE;		/* 発行判定基準日 */
BEGIN
	/* 請求起算日がNULLの場合は必ず締対象とする。 */
	/* （消費税差額調整の請求起算日はNULLなので、バッチでの対象選択と、 */
	/* 画面でのデフォルトから外れてしまうため） */
	IF i_bill_basis_dt IS NULL THEN
		RETURN '1';
	END IF;
	IF i_bill_crryovr_times = 0 THEN
		l_base_dt := i_bill_basis_dt;
	ELSE
		l_base_dt := mspa_ar_util$f_get_schd_bill_dt(i_bcst_cd, i_bill_basis_dt, i_bill_crryovr_times, '0');
	END IF;

	IF l_base_dt <= i_bill_cl_dt THEN
		RETURN '1';
	END IF;

	RETURN '0';

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_bill_cl_flg(
	 IN i_bcst_cd VARCHAR,
	 IN i_bill_basis_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_bill_crryovr_times NUMERIC,
	 IN i_bill_cl_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_bill_cl_day NUMERIC
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求明細締フラグ取得処理
		請求明細が請求締対象かを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_bill_basis_dt
		請求起算日
<IN>	i_bill_crryovr_times
		請求サイト
<IN>	i_bill_cl_ym
		請求締年月
<IN>	i_bill_cl_day
		請求締日
<RETURNVALUE>
		'0':締対象外 / '1':締対象
<HISTORY>
**********************************************************/
DECLARE
	l_cl_dt TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	l_cl_dt := mspa_ar_util$f_combine_dt(i_bill_cl_ym, i_bill_cl_day);
	RETURN mspa_ar_util$f_get_bill_cl_flg(i_bcst_cd, i_bill_basis_dt, i_bill_crryovr_times, l_cl_dt);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_rcv_schd_dt(
	 IN i_bill_mng_no VARCHAR
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		入金予定日を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bill_mng_no
		請求管理ＮＯ
<RETURNVALUE>
		入金予定日
**********************************************************/
DECLARE
	l_rcv_schd_dt TIMESTAMP WITHOUT TIME ZONE;
	l_cnt_tl NUMERIC(3);
	l_cnt_ft NUMERIC(3);
	l_sys_dt TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	/* 引数チェック */
	IF i_bill_mng_no IS NULL THEN
		RETURN NULL;
	END IF;

	l_sys_dt := fcpa_date_util$f_get_today();

	SELECT	COUNT(t1.rcv_schd_dt)
	INTO	STRICT l_cnt_tl
	FROM	mst_rcv_schd t1
	WHERE	0=0
	AND	t1.bill_mng_no = i_bill_mng_no
	;

	IF l_cnt_tl = 0 THEN
		RETURN NULL;
	ELSIF l_cnt_tl = 1 THEN
		SELECT	t1.rcv_schd_dt
		INTO	STRICT l_rcv_schd_dt
		FROM	mst_rcv_schd t1
		WHERE	0=0
		AND	t1.bill_mng_no = i_bill_mng_no
		;
	ELSIF l_cnt_tl > 0 THEN
		SELECT	COUNT(t1.rcv_schd_dt)
		INTO	STRICT l_cnt_ft
		FROM	mst_rcv_schd t1
		WHERE	0=0
		AND	t1.bill_mng_no = i_bill_mng_no
		AND	t1.rcv_schd_dt > l_sys_dt
		;

		IF l_cnt_ft > 0 THEN
			SELECT	MIN(t1.rcv_schd_dt)
			INTO	STRICT l_rcv_schd_dt
			FROM	mst_rcv_schd t1
			WHERE	0=0
			AND	t1.bill_mng_no = i_bill_mng_no
			AND	t1.rcv_schd_dt > l_sys_dt
			;
		ELSE
			SELECT	MAX(t1.rcv_schd_dt)
			INTO	STRICT l_rcv_schd_dt
			FROM	mst_rcv_schd t1
			WHERE	0=0
			AND	t1.bill_mng_no = i_bill_mng_no
			;
		END IF;
	END IF;

	RETURN l_rcv_schd_dt;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_bcst_dpt(
	 IN i_bcst_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sls_dpt_cd VARCHAR,
	 IN i_ar_dpt_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求先、基準日から請求先担当部門を取得する。
		請求先ＣＤをもとに取引先マスタの請求部門区分を取得する。
		請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却
		請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却
		請求部門区分が「3：請求部門」の場合、
		請求先ＣＤ、基準日付をもとに取引先補助マスタの請求先担当部門ＣＤを取得して返却する。
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_sls_dpt_cd
		売上部門ＣＤ
<IN>	i_ar_dpt_cd
		債権部門ＣＤ
<RETURNVALUE>
		基準日時点での請求先担当部門
<HISTORY>
**********************************************************/
DECLARE
	c_bill_dpt_typ_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BILL_DPT_TYP','SLS');
	c_bill_dpt_typ_ar CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BILL_DPT_TYP','AR');

	l_bill_dpt_typ mam_bp.bill_dpt_typ%TYPE;
	l_base_dt TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	l_base_dt := i_base_dt;

	SELECT	bill_dpt_typ
	INTO	STRICT l_bill_dpt_typ
	FROM	mam_bp
	WHERE	0=0
	AND	bp_cd = i_bcst_cd;

	/* 「1：売上部門」 */
	IF c_bill_dpt_typ_sls = l_bill_dpt_typ THEN
		RETURN i_sls_dpt_cd;
	/* 「2：債権部門」 */
	ELSIF c_bill_dpt_typ_ar = l_bill_dpt_typ THEN
		RETURN i_ar_dpt_cd;
	/* 「3：請求部門」 */
	ELSE
		RETURN mapa_bp$f_get_bcst_dpt_cd(i_bcst_cd, l_base_dt);
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_bcst_dpt_ne(
	 IN i_bcst_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sls_dpt_cd VARCHAR,
	 IN i_ar_dpt_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求先、基準日から請求先担当部門を取得する。
		請求先ＣＤをもとに取引先マスタの請求部門区分を取得する。
		請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却
		請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却
		請求部門区分が「3：請求部門」の場合、
		請求先ＣＤ、基準日付をもとに取引先補助マスタの請求先担当部門ＣＤを取得して返却する。
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_sls_dpt_cd
		売上部門ＣＤ
<IN>	i_ar_dpt_cd
		債権部門ＣＤ
<RETURNVALUE>
		基準日時点での請求先担当部門
<HISTORY>
**********************************************************/
DECLARE
	c_bill_dpt_typ_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BILL_DPT_TYP','SLS');
	c_bill_dpt_typ_ar CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BILL_DPT_TYP','AR');

	l_bill_dpt_typ mam_bp.bill_dpt_typ%TYPE;
	l_base_dt TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	l_base_dt := i_base_dt;

	SELECT	bill_dpt_typ
	INTO	STRICT l_bill_dpt_typ
	FROM	mam_bp
	WHERE	0=0
	AND	bp_cd = i_bcst_cd
	;

	/* 「1：売上部門」 */
	IF c_bill_dpt_typ_sls = l_bill_dpt_typ THEN
		RETURN i_sls_dpt_cd;
	/* 「2：債権部門」 */
	ELSIF c_bill_dpt_typ_ar = l_bill_dpt_typ THEN
		RETURN i_ar_dpt_cd;
	/* 「3：請求部門」 */
	ELSE
		RETURN mapa_bp$f_get_bcst_dpt_cd_ne(i_bcst_cd, l_base_dt);
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_max_rcv_crryovr_mons(
	 IN i_bcst_cd VARCHAR,
	 IN i_cur_cd VARCHAR,
	 IN i_amt NUMERIC,
	 IN i_wg_cd VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求先の最大の締日に対応した入金サイトを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_cur_cd
		通貨ＣＤ
<IN>	i_amt
		金額
<IN>	i_wg_cd
		ワーキンググループＣＤ
<ReturnValue>
		最大の締日に対応した入金サイト
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	/* 入金サイト１取得用 */
	rcv_crryovr_mons1 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT p.rcv_crryovr_mons1
		FROM	(
			SELECT	rcv_crryovr_mons1, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons1, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons1, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons1, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons1 DESC, sttl_cd
		;

	/* 入金サイト２取得用 */
	rcv_crryovr_mons2 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_crryovr_mons2
		FROM	(
			SELECT	rcv_crryovr_mons2, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons2, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons2, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons2, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons2 DESC, sttl_cd
		;

	/* 入金サイト３取得用 */
	rcv_crryovr_mons3 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_crryovr_mons3
		FROM	(
			SELECT	rcv_crryovr_mons3, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons3, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons3, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons3, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons3 DESC, sttl_cd
		;

	/* 入金サイト４取得用 */
	rcv_crryovr_mons4 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_crryovr_mons4
		FROM	(
			SELECT	rcv_crryovr_mons4, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons4, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons4, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons4, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons4 DESC, sttl_cd
		;

	/* 入金サイト５取得用 */
	rcv_crryovr_mons5 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_crryovr_mons5
		FROM	(
			SELECT	rcv_crryovr_mons5, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons5, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons5, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_crryovr_mons5, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons5 DESC, sttl_cd
		;

	l_rec_bcst mam_bp%ROWTYPE;
	l_max_cl_day mam_bp.bill_cl_day1%TYPE;
	l_max_crryovr_mons mam_rcv_schd_ctl.rcv_crryovr_mons1%TYPE;
BEGIN
	/* 入金予定日基本情報の取得 */
	SELECT	*
	INTO	STRICT l_rec_bcst
	FROM	mam_bp
	WHERE	0=0
	AND	bp_cd = i_bcst_cd
	;

	/* 最大の締日を取得 */
	l_max_cl_day := mspa_ar_util$f_get_max_cl_day(i_bcst_cd);
	l_max_crryovr_mons := NULL;

	/* 締日の指定が無い場合は固定で入金サイト１を設定する */
	IF l_max_cl_day IS NULL THEN
		FOR x IN rcv_crryovr_mons1 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
			l_max_crryovr_mons := x.rcv_crryovr_mons1;
			EXIT;
		END LOOP;
	ELSE
		IF (l_rec_bcst.bill_cl_day1 = l_max_cl_day) THEN
			/* 入金サイト１ */
			FOR x IN rcv_crryovr_mons1 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_crryovr_mons := x.rcv_crryovr_mons1;
				EXIT;
			END LOOP;

		ELSIF (l_rec_bcst.bill_cl_day2 = l_max_cl_day) THEN
			/* 入金サイト２ */
			FOR x IN rcv_crryovr_mons2 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_crryovr_mons := x.rcv_crryovr_mons2;
				EXIT;
			END LOOP;

		ELSIF (l_rec_bcst.bill_cl_day3 = l_max_cl_day) THEN
			/* 入金サイト３ */
			FOR x IN rcv_crryovr_mons3 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_crryovr_mons := x.rcv_crryovr_mons3;
				EXIT;
			END LOOP;

		ELSIF (l_rec_bcst.bill_cl_day4 = l_max_cl_day) THEN
			/* 入金サイト４ */
			FOR x IN rcv_crryovr_mons4 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_crryovr_mons := x.rcv_crryovr_mons4;
				EXIT;
			END LOOP;

		ELSIF (l_rec_bcst.bill_cl_day5 = l_max_cl_day) THEN
			/* 入金サイト５ */
			FOR x IN rcv_crryovr_mons5 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_crryovr_mons := x.rcv_crryovr_mons5;
				EXIT;
			END LOOP;
		END IF;
	END IF;

	RETURN l_max_crryovr_mons;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_max_rcv_day(
	 IN i_bcst_cd VARCHAR,
	 IN i_cur_cd VARCHAR,
	 IN i_amt NUMERIC,
	 IN i_wg_cd VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求先の最大の締日に対応した入金日を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_cur_cd
		通貨ＣＤ
<IN>	i_amt
		金額
<IN>	i_wg_cd
		ワーキンググループＣＤ
<ReturnValue>
		最大の締日に対応した入金日
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	/* 入金予定日１取得用 */
	rcv_day1 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_day1
		FROM	(
			SELECT	rcv_day1, rcv_crryovr_mons1, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day1, rcv_crryovr_mons1, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day1, rcv_crryovr_mons1, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day1, rcv_crryovr_mons1, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons1 DESC, sttl_cd
		;

	/* 入金予定日２取得用 */
	rcv_day2 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_day2
		FROM	(
			SELECT	rcv_day2, rcv_crryovr_mons2, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day2, rcv_crryovr_mons2, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day2, rcv_crryovr_mons2, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day2, rcv_crryovr_mons2, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons2 DESC, sttl_cd
		;

	/* 入金予定日３取得用 */
	rcv_day3 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_day3
		FROM	(
			SELECT	rcv_day3, rcv_crryovr_mons3, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day3, rcv_crryovr_mons3, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day3, rcv_crryovr_mons3, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day3, rcv_crryovr_mons3, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons3 DESC, sttl_cd
		;

	/* 入金予定日４取得用 */
	rcv_day4 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_day4
		FROM	(
			SELECT	rcv_day4, rcv_crryovr_mons4, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day4, rcv_crryovr_mons4, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day4, rcv_crryovr_mons4, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day4, rcv_crryovr_mons4, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons4 DESC, sttl_cd
		;

	/* 入金予定日５取得用 */
	rcv_day5 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.rcv_day5
		FROM	(
			SELECT	rcv_day5, rcv_crryovr_mons5, crryovr_mons_typ, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day5, rcv_crryovr_mons5, crryovr_mons_typ, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day5, rcv_crryovr_mons5, crryovr_mons_typ, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	rcv_day5, rcv_crryovr_mons5, crryovr_mons_typ, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons5 DESC, sttl_cd
		;

	l_rec_bcst mam_bp%ROWTYPE;
	l_max_cl_day mam_bp.bill_cl_day1%TYPE;
	l_max_rcv_day mam_rcv_schd_ctl.rcv_day1%TYPE;
BEGIN
	/* 入金予定日基本情報の取得 */
	SELECT	*
	INTO	STRICT l_rec_bcst
	FROM	mam_bp
	WHERE	0=0
	AND	bp_cd = i_bcst_cd
	;

	/* 最大の締日を取得 */
	l_max_cl_day := mspa_ar_util$f_get_max_cl_day(i_bcst_cd);
	l_max_rcv_day := NULL;

	/* 締日の指定が無い場合は固定で入金予定日１を設定する */
	IF l_max_cl_day IS NULL THEN
		FOR x IN rcv_day1 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
			l_max_rcv_day := x.rcv_day1;
			EXIT;
		END LOOP;

	/* 請求締日に対応した入金予定日を設定する */
	ELSE
		IF (l_rec_bcst.bill_cl_day1 = l_max_cl_day) THEN
			/* 入金予定日１ */
			FOR x IN rcv_day1 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_rcv_day := x.rcv_day1;
				EXIT;
			END LOOP;
		ELSIF (l_rec_bcst.bill_cl_day2 = l_max_cl_day) THEN
			/* 入金予定日２ */
			FOR x IN rcv_day2 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_rcv_day := x.rcv_day2;
				EXIT;
			END LOOP;
		ELSIF (l_rec_bcst.bill_cl_day3 = l_max_cl_day) THEN
			/* 入金予定日３ */
			FOR x IN rcv_day3 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_rcv_day := x.rcv_day3;
				EXIT;
			END LOOP;
		ELSIF (l_rec_bcst.bill_cl_day4 = l_max_cl_day) THEN
			/* 入金予定日４ */
			FOR x IN rcv_day4 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_rcv_day := x.rcv_day4;
				EXIT;
			END LOOP;
		ELSIF (l_rec_bcst.bill_cl_day5 = l_max_cl_day) THEN
			/* 入金予定日５ */
			FOR x IN rcv_day5 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_max_rcv_day := x.rcv_day5;
				EXIT;
			END LOOP;
		END IF;
	END IF;

	RETURN l_max_rcv_day;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_crryovr_mons_typ(
	 IN i_bcst_cd VARCHAR,
	 IN i_cur_cd VARCHAR,
	 IN i_amt NUMERIC,
	 IN i_wg_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		請求先のサイト区分を返す
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_cur_cd
		通貨ＣＤ
<IN>	i_amt
		金額
<IN>	i_wg_cd
		ワーキンググループＣＤ
<ReturnValue>
		請求先のサイト区分
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	/* サイト区分取得用１ */
	crryovr_mons_typ1 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.crryovr_mons_typ
		FROM	(
			SELECT	crryovr_mons_typ, rcv_crryovr_mons1, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons1, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons1, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons1, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons1 DESC, sttl_cd
		;

	/* サイト区分取得用２ */
	crryovr_mons_typ2 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.crryovr_mons_typ
		FROM	(
			SELECT	crryovr_mons_typ, rcv_crryovr_mons2, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons2, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons2, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons2, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons2 DESC, sttl_cd
		;

	/* サイト区分取得用３ */
	crryovr_mons_typ3 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.crryovr_mons_typ
		FROM	(
			SELECT	crryovr_mons_typ, rcv_crryovr_mons3, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons3, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons3, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons3, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons3 DESC, sttl_cd
		;

	/* サイト区分取得用４ */
	crryovr_mons_typ4 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.crryovr_mons_typ
		FROM	(
			SELECT	crryovr_mons_typ, rcv_crryovr_mons4, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons4, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons4, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons4, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons4 DESC, sttl_cd
		;

	/* サイト区分取得用５ */
	crryovr_mons_typ5 CURSOR (i_bcst_cd VARCHAR, i_cur_cd VARCHAR, i_wg_cd VARCHAR, i_amt NUMERIC) FOR
		SELECT	p.crryovr_mons_typ
		FROM	(
			SELECT	crryovr_mons_typ, rcv_crryovr_mons5, sttl_cd, 1 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons5, sttl_cd, 2 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = i_bcst_cd
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = i_bcst_cd
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons5, sttl_cd, 3 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MAX(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	min_amt <= i_amt
				AND	del_flg = '0')
			UNION ALL
			SELECT	crryovr_mons_typ, rcv_crryovr_mons5, sttl_cd, 4 AS prio
			FROM	mam_rcv_schd_ctl
			WHERE	0=0
			AND	bcst_cd = c_null_val
			AND	cur_cd = i_cur_cd
			AND	wg_cd = i_wg_cd
			AND	del_flg = '0'
			AND	min_amt = (
				SELECT	MIN(min_amt)
				FROM	mam_rcv_schd_ctl
				WHERE	0=0
				AND	bcst_cd = c_null_val
				AND	cur_cd = i_cur_cd
				AND	wg_cd = i_wg_cd
				AND	del_flg = '0')
			) p
		WHERE	0=0
		ORDER BY p.prio, p.crryovr_mons_typ, p.rcv_crryovr_mons5 DESC, sttl_cd
		;

	l_rec_bcst mam_bp%ROWTYPE;
	l_max_cl_day mam_bp.bill_cl_day1%TYPE;
	l_crryovr_mons_typ mam_rcv_schd_ctl.crryovr_mons_typ%TYPE;
BEGIN
	/* 入金予定日基本情報の取得 */
	SELECT	*
	INTO	STRICT l_rec_bcst
	FROM	mam_bp
	WHERE	0=0
	AND	bp_cd = i_bcst_cd
	;

	/* 最大の締日を取得 */
	l_max_cl_day := mspa_ar_util$f_get_max_cl_day(i_bcst_cd);
	l_crryovr_mons_typ := NULL;

	/* 締日の指定が無い場合は入金サイト１が最大のサイト区分を設定する */
	IF l_max_cl_day IS NULL THEN
		FOR x IN crryovr_mons_typ1 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
			l_crryovr_mons_typ := x.crryovr_mons_typ;
			EXIT;
		END LOOP;

	/* 請求締日に対応したサイト区分を設定する */
	ELSE
		IF (l_rec_bcst.bill_cl_day1 = l_max_cl_day) THEN
			/* 入金サイト１が最大のサイト区分 */
			FOR x IN crryovr_mons_typ1 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_crryovr_mons_typ := x.crryovr_mons_typ;
				EXIT;
			END LOOP;
		ELSIF (l_rec_bcst.bill_cl_day2 = l_max_cl_day) THEN
			/* 入金サイト２が最大のサイト区分 */
			FOR x IN crryovr_mons_typ2 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_crryovr_mons_typ := x.crryovr_mons_typ;
				EXIT;
			END LOOP;
		ELSIF (l_rec_bcst.bill_cl_day3 = l_max_cl_day) THEN
			/* 入金サイト３が最大のサイト区分 */
			FOR x IN crryovr_mons_typ3 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_crryovr_mons_typ := x.crryovr_mons_typ;
				EXIT;
			END LOOP;
		ELSIF (l_rec_bcst.bill_cl_day4 = l_max_cl_day) THEN
			/* 入金サイト４が最大のサイト区分 */
			FOR x IN crryovr_mons_typ4 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_crryovr_mons_typ := x.crryovr_mons_typ;
				EXIT;
			END LOOP;
		ELSIF (l_rec_bcst.bill_cl_day5 = l_max_cl_day) THEN
			/* 入金サイト５が最大のサイト区分 */
			FOR x IN crryovr_mons_typ5 (i_bcst_cd, i_cur_cd, i_wg_cd, i_amt) LOOP
				l_crryovr_mons_typ := x.crryovr_mons_typ;
				EXIT;
			END LOOP;
		END IF;
	END IF;

	RETURN l_crryovr_mons_typ;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_org_bill_d_no(
	 IN i_bill_d_no VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		引数の請求明細ＮＯをもとにオリジナルの
		請求明細ＮＯを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bill_d_no
			請求明細ＮＯ
<ReturnValue>
		オリジナルの請求明細ＮＯ
**********************************************************/
DECLARE
	l_src_bill_d_no mst_bill_d.crryovr_src_bill_d_no%TYPE;
	l_bill_d_no mst_bill_d.bill_d_no%TYPE;
BEGIN
	l_bill_d_no := i_bill_d_no;

	LOOP
		/* 繰越元請求明細ＮＯが設定されていない請求明細を探す */
		BEGIN
			SELECT	crryovr_src_bill_d_no
			INTO	STRICT l_src_bill_d_no
			FROM	mst_bill_d
			WHERE	bill_d_no = l_bill_d_no
			;
		EXCEPTION
			WHEN no_data_found THEN
				l_src_bill_d_no := NULL;
		END;

		IF l_src_bill_d_no IS NULL THEN
			EXIT;
		ELSE
			l_bill_d_no := l_src_bill_d_no;
		END IF;
	END LOOP;

	RETURN l_bill_d_no;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_ac_ym(
	 IN i_ac_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_cl_day NUMERIC,
	 IN i_cl_mon_base NUMERIC
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		計上年月を取得する
<REMARKS>
<IN>	i_ac_dt
		計上日
<IN>	i_cl_day
		締日
<IN>	i_cl_mon_base
		締月度基準
<RETURNVALUE>
		計上年月
<HISTORY>
**********************************************************/
DECLARE
	l_act_ym TIMESTAMP WITHOUT TIME ZONE;
	l_tmp_ym TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	/* 1. 締月度基準を考慮しないで仮の締年月を求める */

	/* 締日よりも後の日付の場合は翌月 */
	IF LPAD(i_cl_day::VARCHAR, 2, '0') < TO_CHAR(i_ac_dt, 'DD') THEN
		l_tmp_ym := fcpa_postgres_util$add_months(DATE_TRUNC('MONTH', i_ac_dt), 1);

	/* 締日よりも以前の日付の場合は当月 */
	ELSE
		l_tmp_ym := DATE_TRUNC('MONTH', i_ac_dt);
	END IF;

	/* 2. 求めた締年月を締月度基準を加味した実際の締年月に変換する */
	l_act_ym := fcpa_postgres_util$add_months(l_tmp_ym, i_cl_mon_base);

	RETURN l_act_ym;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_ac_ym_ne(
	 IN i_ac_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		引数の計上日が本来属する計上年月を取得する
		計上年月が締まっていてもエラーにならない
<REMARKS>
<IN>	i_ac_dt
		計上日
<RETURNVALUE>
		計上年月
<HISTORY>
**********************************************************/
DECLARE
	l_rec_co mam_co%ROWTYPE;
BEGIN
	/* 自社情報の取得 */
	l_rec_co := mapa_co$f_get_co_rec();

	/* 計上日が属する計上年月の取得 */
	RETURN mspa_ar_util$f_get_ac_ym(i_ac_dt, l_rec_co.ac_cl_day, l_rec_co.ac_cl_mon_base);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ar_util$f_get_amt_disp_pm(
	 IN i_trd_ptn_typ VARCHAR,
	 IN i_dscnt_itm_flg CHARACTER
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		mac_trd_ptn_typ$amt_disp_pmに加えて、値引品目を加味した結果を取得します。
<REMARKS>
<IN>	i_trd_ptn_typ
		取引区分
<IN>	i_dscnt_itm_flg
		値引品フラグ
<RETURNVALUE>
		1（符号反転しない場合） 、-1（符号反転する場合）、NULL（単価が関係ない取引の場合）
<HISTORY>
**********************************************************/
DECLARE
	l_pm NUMERIC(3) := null;
	typ VARCHAR;
BEGIN

	l_pm := mac_trd_ptn_typ$amt_disp_pm(i_trd_ptn_typ);

	IF (i_dscnt_itm_flg = '1' AND 
	(fcpa_const$get_const_val('MAC_TRD_PTN_TYP','SLS') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','SLS_CNSGN') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','SLS_RTN') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','PURC') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','PURC_VMI') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','PURC_XPNS') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','PURC_RTN') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','PURC_RTN_XPNS') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','SHIP') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','SHIP_RTN') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','PROV') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','PROV_RTN') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','ARR') = i_trd_ptn_typ
	 OR fcpa_const$get_const_val('MAC_TRD_PTN_TYP','ARR_RTN') = i_trd_ptn_typ)) THEN
		l_pm := l_pm * (- 1);
	END IF;

	RETURN l_pm;

END;
$BODY$
LANGUAGE plpgsql
;
