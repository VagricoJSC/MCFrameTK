\encoding UTF-8

CREATE OR REPLACE FUNCTION fcpa_date_util$init() 
RETURNS VOID
AS
$BODY$
DECLARE
	val VARCHAR(50);
BEGIN
	IF fcpa_postgres_util$is_proc_ini('fcpa_date_util') THEN
		RETURN;
	END IF;

	PERFORM fcpa_postgres_util$set_proc_ini('fcpa_date_util');

	BEGIN
		SELECT m.str_val INTO STRICT val
		FROM fcc_commonparam m
		WHERE
			m.class_id = 'DT' AND m.code = 'USE';

		IF val = 'TRUE' THEN
			PERFORM fcpa_postgres_util$set_var('fcpa_date_util', 'use_mcfdt', TRUE);
		ELSE
			PERFORM fcpa_postgres_util$set_var('fcpa_date_util', 'use_mcfdt', FALSE);
		END IF;

	EXCEPTION 
		WHEN NO_DATA_FOUND THEN
			PERFORM fcpa_postgres_util$set_var('fcpa_date_util', 'use_mcfdt', FALSE);
	END;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_get_week_of_day(
	IN pd TIMESTAMP WITHOUT TIME ZONE
) RETURNS NUMERIC
AS
$BODY$
-- ===============================================================================
-- Dateより、曜日の値を返します。
-- 返す値は、Javaの仕様にあわせています。
-- 日 = 1
-- 月 = 2
-- 火 = 3
-- 水 = 4
-- 木 = 5
-- 金 = 6
-- 土 = 7
-- ===============================================================================
DECLARE
	rtn numeric(1);
BEGIN
	SELECT TO_CHAR(pd, 'D')::NUMERIC INTO STRICT rtn;

	RETURN rtn;
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_next_day(
	iN pd TIMESTAMP WITHOUT TIME ZONE,
	IN nd NUMERIC
) RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- 指定された曜日で、引数の日付より後の最初の日付をを返します。
-- 日 = 1
-- 月 = 2
-- 火 = 3
-- 水 = 4
-- 木 = 5
-- 金 = 6
-- 土 = 7
-- ===============================================================================
DECLARE
	rtn TIMESTAMP(0) WITHOUT TIME ZONE;
	now_d NUMERIC(1);
BEGIN
	now_d := TO_CHAR(pd, 'D')::NUMERIC;

	IF now_d = 7 THEN
		rtn := pd + (nd || ' days')::INTERVAL;
	ELSIF nd > now_d THEN
		rtn := pd + ((nd - now_d)::NUMERIC || ' days')::INTERVAL;
	ELSE
		rtn := pd + ((7 - (now_d - nd))::NUMERIC || ' days')::INTERVAL;
	END IF;

	RETURN rtn;
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$y4mdhms() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 年月日時分秒を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'Y4MDHMS';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$y4md() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 年月日を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'Y4MD';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$y4m() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 年月日を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'Y4M';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$y2mdhms() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 年月日時分秒を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'Y2MDHMS';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$y2md() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 年月日を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'Y2MD';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$hms() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 時分秒を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'HMS';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;



CREATE OR REPLACE FUNCTION fcpa_date_util$y4mdhmsf() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 年月日時分秒(0.001秒まで）を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'Y4MDHMSF';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;



CREATE OR REPLACE FUNCTION fcpa_date_util$y2mdhmsf() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 年月日時分秒(0.001秒まで）を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'Y2MDHMSF';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$hmsf() 
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 時分秒(0.001秒まで）を示す定数を返します。
-- ===============================================================================
BEGIN
	RETURN 'HMSF';
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_get_format_ja(
	IN fm VARCHAR,
	IN ty VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 「ja」のフォーマット文字列を返します。
--
--
-- 書式	：Y2MD,Y2MDHMS,Y4MD,Y4MDHMS,Y2MDHMSF,Y4MDHMSF,HMS,HMSF
-- 第二引数は、DATEを変換する場合は、'D'を指定し、
-- それ以外の文字はTIMESATMPのフォーマットとして変換します。
-- ===============================================================================
BEGIN
	IF fm = fcpa_date_util$y4md() THEN
		RETURN 'YYYY/MM/DD';
	END IF;

	IF fm = fcpa_date_util$y4m() THEN
		RETURN 'YYYY/MM';
	END IF;

	IF fm = fcpa_date_util$y2md() THEN
		RETURN 'YY/MM/DD';
	END IF;

	IF fm = fcpa_date_util$y4mdhms() THEN
		RETURN 'YYYY/MM/DD HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$y2mdhms() THEN
		RETURN 'YY/MM/DD HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$y4mdhmsf() THEN
		IF ty = 'D' THEN
			RETURN 'YYYY/MM/DD HH24:MI:SS';
		ELSE
			RETURN 'YYYY/MM/DD HH24:MI:SS.MS';
		END IF;
	END IF;

	IF fm = fcpa_date_util$y2mdhmsf() THEN
		IF ty = 'D' THEN
			RETURN 'YY/MM/DD HH24:MI:SS';
		ELSE
			RETURN 'YY/MM/DD HH24:MI:SS.MS';
		END IF;
	END IF;

	IF fm = fcpa_date_util$hms() THEN
		RETURN 'HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$hmsf() THEN
		IF ty = 'D' THEN
			RETURN 'HH24:MI:SS';
		ELSE
			RETURN 'HH24:MI:SS.MS';
		END IF;
	END IF;

	RETURN NULL::VARCHAR;
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_get_format_en(
	IN fm VARCHAR,
	IN ty VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 「en」のフォーマット文字列を返します。
--
-- 書式	：Y2MD,Y2MDHMS,Y4MD,Y4MDHMS,Y2MDHMSF,Y4MDHMSF,HMS,HMSF
-- 第二引数は、DATEを変換する場合は、'D'を指定し、
-- それ以外の文字はTIMESATMPのフォーマットとして変換します。
-- ===============================================================================
BEGIN
	IF fm = fcpa_date_util$y4md() THEN
		RETURN 'MM-DD-YYYY';
	END IF;

	IF fm = fcpa_date_util$y4m() THEN
		RETURN 'MM-YYYY';
	END IF;

	IF fm = fcpa_date_util$y2md() THEN
		RETURN 'MM-DD-YY';
	END IF;

	IF fm = fcpa_date_util$y4mdhms() THEN
		RETURN 'MM-DD-YYYY HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$y2mdhms() THEN
		RETURN 'MM-DD-YY HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$y4mdhmsf() THEN
		IF ty = 'D' THEN
			RETURN 'MM-DD-YYYY HH24:MI:SS';
		ELSE
			RETURN 'MM-DD-YYYY HH24:MI:SS.MS';
		END IF;
	END IF;

	IF fm = fcpa_date_util$y2mdhmsf() THEN
		IF ty = 'D' THEN
			RETURN 'MM-DD-YY HH24:MI:SS';
		ELSE
			RETURN 'MM-DD-YY HH24:MI:SS.MS';
		END IF;
	END IF;

	IF fm = fcpa_date_util$hms() THEN
		RETURN 'HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$hmsf() THEN
		IF ty = 'D' THEN
			RETURN 'HH24:MI:SS';
		ELSE
			RETURN 'HH24:MI:SS.MS';
		END IF;
	END IF;

	RETURN NULL::VARCHAR;
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_get_format_zh(
	IN fm VARCHAR,
	IN ty VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 「zh」のフォーマット文字列を返します。
--
-- 書式	：Y2MD,Y2MDHMS,Y4MD,Y4MDHMS,Y2MDHMSF,Y4MDHMSF,HMS,HMSF
-- 第二引数は、DATEを変換する場合は、'D'を指定し、
-- それ以外の文字はTIMESATMPのフォーマットとして変換します。
-- ===============================================================================
BEGIN
	IF fm = fcpa_date_util$y4md() THEN
		RETURN 'YYYY-MM-DD';
	END IF;

	IF fm = fcpa_date_util$y4m() THEN
		RETURN 'YYYY-MM';
	END IF;

	IF fm = fcpa_date_util$y2md() THEN
		RETURN 'YY-MM-DD';
	END IF;

	IF fm = fcpa_date_util$y4mdhms() THEN
		RETURN 'YYYY-MM-DD HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$y2mdhms() THEN
		RETURN 'YY-MM-DD HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$y4mdhmsf() THEN
		IF ty = 'D' THEN
			RETURN 'YYYY-MM-DD HH24:MI:SS';
		ELSE
			RETURN 'YYYY-MM-DD HH24:MI:SS.MS';
		END IF;
	END IF;

	IF fm = fcpa_date_util$y2mdhmsf() THEN
		IF ty = 'D' THEN
			RETURN 'YY-MM-DD HH24:MI:SS';
		ELSE
			RETURN 'YY-MM-DD HH24:MI:SS.MS';
		END IF;
	END IF;

	IF fm = fcpa_date_util$hms() THEN
		RETURN 'HH24:MI:SS';
	END IF;

	IF fm = fcpa_date_util$hmsf() THEN
		IF ty = 'D' THEN
			RETURN 'HH24:MI:SS';
		ELSE
			RETURN 'HH24:MI:SS.MS';
		END IF;
	END IF;

	RETURN NULL::VARCHAR;
END;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_to_char(
	IN pd TIMESTAMP WITHOUT TIME ZONE,
	IN fm VARCHAR,
	IN locale VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 引数のロケール情報に合わせた書式で、日付データを文字列化します。
-- 現在のところ、下記のロケール、書式に対応している。
-- ただし、セッション自体のロケールは変更していないので、
-- セッション情報の影響を受けるフォーマット（曜日など）は対応していません。
--
-- ロケール：ja_JP, ja, en_US, en, zh_CN. zh,
-- 書式	：Y2MD,Y2MDHMS,Y4MD,Y4MDHMS,Y2MDHMSF,Y4MDHMSF,HMS,HMSF
--
-- 該当するロケール、書式がない場合は、
-- 'YYYY/MM/DD HH24:MI:SS'のFORMATにて文字列化します。
-- ===============================================================================
DECLARE
	l$territory VARCHAR(2);
	l$fm_temp VARCHAR(30);
BEGIN
	IF length(locale) > 1 THEN
		l$territory := SUBSTR(locale, 1, 2);
	ELSE
		l$territory := locale;
	END IF;

	IF locale = 'ja_JP' OR l$territory = 'ja' THEN
		l$fm_temp := fcpa_date_util$f_get_format_ja(fm, 'D');
	END IF;

	IF locale = 'en_US' OR l$territory = 'en' THEN
		l$fm_temp := fcpa_date_util$f_get_format_en(fm, 'D');
	END IF;

	IF locale = 'zh_CN' OR l$territory = 'zh' THEN
		l$fm_temp := fcpa_date_util$f_get_format_zh(fm, 'D');
	END IF;

	IF length(l$fm_temp) > 1 THEN
		RETURN TO_CHAR(pd, l$fm_temp);
	ELSE
		RETURN TO_CHAR(pd, 'YYYY/MM/DD HH24:MI:SS');
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_to_char(
	IN pd TIMESTAMP WITHOUT TIME ZONE,
	IN fm VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- セッションのロケール情報に合わせた書式で、日付データを文字列化します。
-- ただし、セッション自体のロケールは変更していないので、
-- セッション情報の影響を受けるフォーマット（曜日など）は対応していません。
-- ===============================================================================
BEGIN
	RETURN fcpa_date_util$f_to_char(pd, fm, fcpa_context$f_get_locale());
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_to_char_t(
	IN pt TIMESTAMP WITHOUT TIME ZONE,
	IN fm VARCHAR,
	IN locale VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 引数のロケール情報に合わせた書式で、日付データを文字列化します。
-- ただし、セッション自体のロケールは変更していないので、
-- セッション情報の影響を受けるフォーマット（曜日など）は対応していません。
-- ===============================================================================
DECLARE
	l$territory VARCHAR(2);
	l$fm_temp VARCHAR(30);
BEGIN
	IF length(locale) > 1 THEN
		l$territory := SUBSTR(locale, 1, 2);
	ELSE
		l$territory := locale;
	END IF;

	IF locale = 'ja_JP' OR l$territory = 'ja' THEN
		l$fm_temp := fcpa_date_util$f_get_format_ja(fm, 'T');
	END IF;

	IF locale = 'en_US' OR l$territory = 'en' THEN
		l$fm_temp := fcpa_date_util$f_get_format_en(fm, 'T');
	END IF;

	IF locale = 'zh_CN' OR l$territory = 'zh' THEN
		l$fm_temp := fcpa_date_util$f_get_format_zh(fm, 'T');
	END IF;

	IF length(l$fm_temp) > 1 THEN
		RETURN TO_CHAR(pt, l$fm_temp);
	ELSE
		RETURN TO_CHAR(pt, 'YYYY-MM-DD HH24:MI:SS');
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_to_char_t(
	IN pt TIMESTAMP WITHOUT TIME ZONE,
	IN fm VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- セッションのロケール情報に合わせた書式で、日付データを文字列化します。
-- ただし、セッション自体のロケールは変更していないので、
-- セッション情報の影響を受けるフォーマット（曜日など）は対応していません。
-- ===============================================================================
BEGIN
	RETURN fcpa_date_util$f_to_char_t(pt, fm, fcpa_context$f_get_locale());
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_mcsysdate() 
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- システム日付をDATE型で返します。
-- ===============================================================================
BEGIN
	RETURN CAST (fcpa_date_util$f_mcsystimestamp() AS TIMESTAMP(0) WITHOUT TIME ZONE);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_mcsysdate_co(
	IN i$co_cd VARCHAR
) RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- 会社別システム日付をDATE型で返します。
-- ===============================================================================
BEGIN
	RETURN CAST (fcpa_date_util$f_mcsystimestamp_co(i$co_cd) AS TIMESTAMP(0) WITHOUT TIME ZONE);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_mcsystimestamp_fr_fcm_systs() 
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- システム日付を、FCM_SYSTSのデータの差分を反映して、TIMESATMP型で返します。
-- ===============================================================================
DECLARE
	val VARCHAR(50);
	dsi INTERVAL DAY TO SECOND;
BEGIN
	SELECT
		diff
	INTO STRICT
		val
	FROM
		fcm_systs
	ORDER BY
		upd_ts DESC
	LIMIT 1
	;

	dsi := CAST(val AS INTERVAL DAY TO SECOND);
	RETURN fcpa_postgres_util$systimestamp() + dsi;

EXCEPTION
	WHEN no_data_found THEN
		RETURN fcpa_postgres_util$systimestamp();

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_mcsystimestamp_co_fr_systs(
	IN i$co_cd VARCHAR
) RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- 会社別システム日付を、FCM_SYSTS_COのデータの差分を反映して、TIMESATMP型で返します。
-- ===============================================================================
DECLARE
	val VARCHAR(50);
	dsi INTERVAL DAY TO SECOND;
BEGIN
	SELECT
		diff
	INTO STRICT
		val
	FROM
		fcm_systs_co
	WHERE
		co_cd = i$co_cd
	;

	dsi := CAST(val AS INTERVAL DAY TO SECOND);
	RETURN fcpa_postgres_util$systimestamp() + dsi;

EXCEPTION
	WHEN no_data_found THEN
		RETURN fcpa_date_util$f_mcsystimestamp();

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_mcsystimestamp_co(
	IN i$co_cd VARCHAR
) RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- 会社別システム日付をTIMESATMP型で返します。
-- ===============================================================================
BEGIN
	PERFORM fcpa_date_util$init();
	IF fcpa_postgres_util$get_var('fcpa_date_util', 'use_mcfdt')::BOOLEAN AND i$co_cd IS NOT NULL THEN
		RETURN fcpa_date_util$f_mcsystimestamp_co_fr_systs(i$co_cd);
	ELSE
		RETURN fcpa_date_util$f_mcsystimestamp();
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_mcsystimestamp() 
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- システム日付をTIMESATMP型で返します。
-- ===============================================================================
BEGIN
	PERFORM fcpa_date_util$init();
	IF fcpa_postgres_util$get_var('fcpa_date_util', 'use_mcfdt')::BOOLEAN THEN
		RETURN fcpa_date_util$f_mcsystimestamp_fr_fcm_systs();
	ELSE
		RETURN fcpa_postgres_util$systimestamp();
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_date_util$set_mcsystimestamp(
	IN i$ts TIMESTAMP WITHOUT TIME ZONE
) AS
$BODY$
-- ===============================================================================
-- mcframe7のシステム日付を設定します。
-- ===============================================================================
DECLARE
	val VARCHAR(50);
	dsi INTERVAL DAY TO SECOND;
BEGIN
	DELETE FROM fcm_systs;
	DELETE FROM fcc_commonparam WHERE class_id = 'DT' AND code = 'USE';
	PERFORM fcpa_postgres_util$set_var('fcpa_date_util', 'use_mcfdt', FALSE);

	IF i$ts IS NOT NULL THEN
		dsi := i$ts - fcpa_postgres_util$systimestamp();
		val := CAST(dsi AS INTERVAL DAY TO SECOND);
		INSERT INTO fcm_systs (diff) VALUES (val);
		INSERT INTO fcc_commonparam (class_id, code, str_val, num_val) VALUES ('DT', 'USE', 'TRUE', 0);
		PERFORM fcpa_postgres_util$set_var('fcpa_date_util', 'use_mcfdt', TRUE);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_date_util$set_mcsystimestamp_co(
	IN i$co_cd VARCHAR,
	IN i$ts TIMESTAMP WITHOUT TIME ZONE
) AS
$BODY$
-- ===============================================================================
-- 会社別システム日付を設定します。
-- ===============================================================================
DECLARE
	val VARCHAR(50);
	dsi INTERVAL DAY TO SECOND;
BEGIN
	DELETE FROM fcm_systs_co WHERE co_cd = i$co_cd;
	DELETE FROM fcc_commonparam WHERE class_id = 'DT' AND code = 'USE';
	PERFORM fcpa_postgres_util$set_var('fcpa_date_util', 'use_mcfdt', FALSE);

	IF i$ts IS NOT NULL THEN
		dsi := i$ts - fcpa_postgres_util$systimestamp();
		val := CAST(dsi AS INTERVAL DAY TO SECOND);
		INSERT INTO fcm_systs_co (co_cd, diff) VALUES (i$co_cd, val);
		INSERT INTO fcc_commonparam (class_id, code, str_val, num_val) VALUES ('DT', 'USE', 'TRUE', 0);
		PERFORM fcpa_postgres_util$set_var('fcpa_date_util', 'use_mcfdt', TRUE);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_get_today() 
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- 運用日付を取得します。
-- ===============================================================================
BEGIN
	RETURN fcpa_date_util$f_get_today(fcpa_context$f_get_co_cd());
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_date_util$f_get_today(
	IN i$co_cd VARCHAR
) RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
-- ===============================================================================
-- 会社ＣＤを指定して運用日付を取得します。
-- ===============================================================================
DECLARE
	w_today fcm_today_all.today%TYPE;
	w_systs TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	BEGIN
		SELECT today INTO STRICT w_today FROM fcm_today_all WHERE co_cd = i$co_cd;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			w_systs := fcpa_date_util$f_mcsysdate_co(i$co_cd);
			w_today := TO_TIMESTAMP(TO_CHAR(w_systs, 'YYYYMMDD'), 'YYYYMMDD');
	END;

	RETURN w_today;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_date_util$p_increment_today(
	INOUT o_ret numeric,
	INOUT o_today_old TIMESTAMP WITHOUT TIME ZONE,
	INOUT o_today_new TIMESTAMP WITHOUT TIME ZONE
) AS
$BODY$
-- ===============================================================================
-- 運用日付を1日更新します。
-- 本プロシージャではコミットしません。
-- ===============================================================================
BEGIN
	SELECT
		today INTO STRICT o_today_old
	FROM
		fcm_today_all
	WHERE
		co_cd = fcpa_context$f_get_co_cd()
	FOR UPDATE NOWAIT
	;

	o_today_new := o_today_old + (1::NUMERIC || ' days')::INTERVAL;

	UPDATE fcm_today_all SET today = o_today_new WHERE co_cd = fcpa_context$f_get_co_cd();
	o_ret := 0;

EXCEPTION
	WHEN NO_DATA_FOUND THEN
		o_ret := 1;

END;
$BODY$
LANGUAGE plpgsql
;

