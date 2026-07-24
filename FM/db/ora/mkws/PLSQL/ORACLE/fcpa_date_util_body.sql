CREATE OR REPLACE PACKAGE BODY FCPA_DATE_UTIL
-- ==============================================================================
-- 機能      ユーティリティパッケージ
-- 作成者    H.Katayama
-- 作成日付  2007-07-27
-- 改版履歴  2007-07-27 H.Katayama 初版作成
--           2009-08-25 H.Katayama F_MCSYSDATE、F_MCSYSTIMESATMP を追加
--           2009-09-18 H.Katayama F_NEXT_DAY を追加
--           2011-09-02 H.Katayama F_MCSYSDATE、F_MCSYSTIMESATMP を修正
--           2011-12-20 H.Katayama F_MCSYSTIMESTAMPを修正
--           2014-11-18 A.Shimao F_GET_WEEK_OF_DAY、F_NEXT_DAYにRESULT_CACHEの指定を追加
--
-- バージョン:6.3.0
-- =============================================================================
IS
	USE_MCFDT BOOLEAN;	--MCFシステム時刻の調整機能の利用有無
	VAL VARCHAR2(50);

	-- ===============================================================================
	--  Dateより、曜日の値を返します。
	--  返す値は、Javaの仕様にあわせています。
	--  日 = 1
	--  月 = 2
	--  火 = 3
	--  水 = 4
	--  木 = 5
	--  金 = 6
	--  土 = 7
	-- ===============================================================================
	FUNCTION F_GET_WEEK_OF_DAY(
		PD IN DATE
	) RETURN NUMBER RESULT_CACHE IS
		RTN NUMBER(1);
		TBK VARCHAR2(10);
	BEGIN
		SELECT
			NLS_SESSION_PARAMETERS.VALUE,
			FCM_WEEK_OF_DAY_MAP.MC_DAY
		INTO
			TBK,
			RTN
		FROM NLS_SESSION_PARAMETERS
			LEFT OUTER JOIN FCM_WEEK_OF_DAY_MAP ON (FCM_WEEK_OF_DAY_MAP.TERRITORY = NLS_SESSION_PARAMETERS.VALUE)
		WHERE NLS_SESSION_PARAMETERS.PARAMETER = 'NLS_TERRITORY'
			AND FCM_WEEK_OF_DAY_MAP.DB_DAY = TO_CHAR(PD,'D');

		RETURN RTN;
	END F_GET_WEEK_OF_DAY;


	-- ===============================================================================
	--  指定された曜日で、引数の日付より後の最初の日付をを返します。
	--  日 = 1
	--  月 = 2
	--  火 = 3
	--  水 = 4
	--  木 = 5
	--  金 = 6
	--  土 = 7
	-- ===============================================================================
	FUNCTION F_NEXT_DAY(
		PD IN DATE,
		ND IN NUMBER
	) RETURN DATE RESULT_CACHE IS
		RTN DATE;
		NEXT_D NUMBER(1);
		NOW_D NUMBER(1);
		TBK VARCHAR2(10);
	BEGIN
		SELECT
			FCM_WEEK_OF_DAY_MAP.DB_DAY
		INTO
			NEXT_D
		FROM NLS_SESSION_PARAMETERS
			LEFT OUTER JOIN FCM_WEEK_OF_DAY_MAP ON (FCM_WEEK_OF_DAY_MAP.TERRITORY = NLS_SESSION_PARAMETERS.VALUE)
		WHERE NLS_SESSION_PARAMETERS.PARAMETER = 'NLS_TERRITORY'
			AND FCM_WEEK_OF_DAY_MAP.MC_DAY = ND;

		NOW_D := TO_CHAR(PD, 'D');

		IF NOW_D = 7 THEN
			RTN := PD + NEXT_D;
		ELSIF NEXT_D > NOW_D THEN
			RTN := PD + (NEXT_D - NOW_D);
		ELSE
			RTN := PD + (7 - (NOW_D - NEXT_D));
		END IF;
		RETURN RTN;
	END F_NEXT_DAY;


	-- ===============================================================================
	-- 年月日時分秒を示す定数を返します。
	-- ===============================================================================
	FUNCTION Y4MDHMS
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_Y4MDHMS;
	END;

	-- ===============================================================================
	-- 年月日を示す定数を返します。
	-- ===============================================================================
	FUNCTION Y4MD
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_Y4MD;
	END;

	-- ===============================================================================
	-- 年月日を示す定数を返します。
	-- ===============================================================================
	FUNCTION Y4M
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_Y4M;
	END;

	-- ===============================================================================
	-- 年月日時分秒を示す定数を返します。
	-- ===============================================================================
	FUNCTION Y2MDHMS
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_Y2MDHMS;
	END;

	-- ===============================================================================
	-- 年月日を示す定数を返します。
	-- ===============================================================================
	FUNCTION Y2MD
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_Y2MD;
	END;

	-- ===============================================================================
	-- 時分秒を示す定数を返します。
	-- ===============================================================================
	FUNCTION HMS
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_HMS;
	END;

	-- ===============================================================================
	-- 年月日時分秒(0.001秒まで）を示す定数を返します。
	-- ===============================================================================
	FUNCTION Y4MDHMSF
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_Y4MDHMSF;
	END;

	-- ===============================================================================
	-- 年月日時分秒(0.001秒まで）を示す定数を返します。
	-- ===============================================================================
	FUNCTION Y2MDHMSF
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_Y2MDHMSF;
	END;

	-- ===============================================================================
	-- 時分秒(0.001秒まで）を示す定数を返します。
	-- ===============================================================================
	FUNCTION HMSF
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_HMSF;
	END;

	-- ===============================================================================
	-- 「ja」のフォーマット文字列を返します。
	--
	--
	--  書式    ：Y2MD,Y2MDHMS,Y4MD,Y4MDHMS,Y2MDHMSF,Y4MDHMSF,HMS,HMSF
	--  第二引数は、DATEを変換する場合は、'D'を指定し、
	--  それ以外の文字はTIMESATMPのフォーマットとして変換します。
	-- ===============================================================================
	FUNCTION F_GET_FORMAT_JA(
		FM IN VARCHAR2,
		TY IN VARCHAR2
	) RETURN VARCHAR2 IS
		L$TERRITORY VARCHAR2(2);
	BEGIN
		IF FM = Y4MD THEN
			RETURN 'YYYY/MM/DD';
		END IF;
		IF FM = Y4M THEN
			RETURN 'YYYY/MM';
		END IF;
		IF FM = Y2MD THEN
			RETURN 'RR/MM/DD';
		END IF;

		IF FM = Y4MDHMS THEN
			RETURN 'YYYY/MM/DD HH24:MI:SS';
		END IF;
		IF FM = Y2MDHMS THEN
			RETURN 'RR/MM/DD HH24:MI:SS';
		END IF;

		IF FM = Y4MDHMSF THEN
			IF TY = 'D' THEN
				RETURN 'YYYY/MM/DD HH24:MI:SS';
			ELSE
				RETURN 'YYYY/MM/DD HH24:MI:SS.FF3';
			END IF;
		END IF;
		IF FM = Y2MDHMSF THEN
			IF TY = 'D' THEN
				RETURN 'RR/MM/DD HH24:MI:SS';
			ELSE
				RETURN 'RR/MM/DD HH24:MI:SS.FF3';
			END IF;
		END IF;

		IF FM = HMS THEN
			RETURN 'HH24:MI:SS';
		END IF;
		IF FM = HMSF THEN
			IF TY = 'D' THEN
				RETURN 'HH24:MI:SS';
			ELSE
				RETURN 'HH24:MI:SS.FF3';
			END IF;
		END IF;

		RETURN NULL;
	END F_GET_FORMAT_JA;


	-- ===============================================================================
	-- 「en」のフォーマット文字列を返します。
	--
	--  書式    ：Y2MD,Y2MDHMS,Y4MD,Y4MDHMS,Y2MDHMSF,Y4MDHMSF,HMS,HMSF
	--  第二引数は、DATEを変換する場合は、'D'を指定し、
	--  それ以外の文字はTIMESATMPのフォーマットとして変換します。
	-- ===============================================================================
	FUNCTION F_GET_FORMAT_EN(
		FM IN VARCHAR2,
		TY IN VARCHAR2
	) RETURN VARCHAR2 IS
		L$TERRITORY VARCHAR2(2);
	BEGIN
		IF FM = Y4MD THEN
			RETURN 'MM-DD-YYYY';
		END IF;
		IF FM = Y4M THEN
			RETURN 'MM-YYYY';
		END IF;
		IF FM = Y2MD THEN
			RETURN 'MM-DD-RR';
		END IF;

		IF FM = Y4MDHMS THEN
			RETURN 'MM-DD-YYYY HH24:MI:SS';
		END IF;
		IF FM = Y2MDHMS THEN
			RETURN 'MM-DD-RR HH24:MI:SS';
		END IF;

		IF FM = Y4MDHMSF THEN
			IF TY = 'D' THEN
				RETURN 'MM-DD-YYYY HH24:MI:SS';
			ELSE
				RETURN 'MM-DD-YYYY HH24:MI:SS.FF3';
			END IF;
		END IF;
		IF FM = Y2MDHMSF THEN
			IF TY = 'D' THEN
				RETURN 'MM-DD-RR HH24:MI:SS';
			ELSE
				RETURN 'MM-DD-RR HH24:MI:SS.FF3';
			END IF;
		END IF;

		IF FM = HMS THEN
			RETURN 'HH24:MI:SS';
		END IF;
		IF FM = HMSF THEN
			IF TY = 'D' THEN
				RETURN 'HH24:MI:SS';
			ELSE
				RETURN 'HH24:MI:SS.FF3';
			END IF;
		END IF;

		RETURN NULL;
	END F_GET_FORMAT_EN;

	-- ===============================================================================
	-- 「zh」のフォーマット文字列を返します。
	--
	--  書式    ：Y2MD,Y2MDHMS,Y4MD,Y4MDHMS,Y2MDHMSF,Y4MDHMSF,HMS,HMSF
	--  第二引数は、DATEを変換する場合は、'D'を指定し、
	--  それ以外の文字はTIMESATMPのフォーマットとして変換します。
	-- ===============================================================================
	FUNCTION F_GET_FORMAT_ZH(
		FM IN VARCHAR2,
		TY IN VARCHAR2
	) RETURN VARCHAR2 IS
		L$TERRITORY VARCHAR2(2);
	BEGIN
		IF FM = Y4MD THEN
			RETURN 'YYYY-MM-DD';
		END IF;
		IF FM = Y4M THEN
			RETURN 'YYYY-MM';
		END IF;
		IF FM = Y2MD THEN
			RETURN 'RR-MM-DD';
		END IF;

		IF FM = Y4MDHMS THEN
			RETURN 'YYYY-MM-DD HH24:MI:SS';
		END IF;
		IF FM = Y2MDHMS THEN
			RETURN 'RR-MM-DD HH24:MI:SS';
		END IF;

		IF FM = Y4MDHMSF THEN
			IF TY = 'D' THEN
				RETURN 'YYYY-MM-DD HH24:MI:SS';
			ELSE
				RETURN 'YYYY-MM-DD HH24:MI:SS.FF3';
			END IF;
		END IF;
		IF FM = Y2MDHMSF THEN
			IF TY = 'D' THEN
				RETURN 'RR-MM-DD HH24:MI:SS';
			ELSE
				RETURN 'RR-MM-DD HH24:MI:SS.FF3';
			END IF;
		END IF;

		IF FM = HMS THEN
			RETURN 'HH24:MI:SS';
		END IF;
		IF FM = HMSF THEN
			IF TY = 'D' THEN
				RETURN 'HH24:MI:SS';
			ELSE
				RETURN 'HH24:MI:SS.FF3';
			END IF;
		END IF;

		RETURN NULL;
	END F_GET_FORMAT_ZH;


	-- ===============================================================================
	-- 引数のロケール情報に合わせた書式で、日付データを文字列化します。
	-- 現在のところ、下記のロケール、書式に対応している。
	-- ただし、セッション自体のロケールは変更していないので、
	-- Oracleのセッション情報の影響を受けるフォーマット（曜日など）は対応していません。
	--
	--  ロケール：ja_JP, ja, en_US, en, zh_CN. zh,
	--  書式    ：Y2MD,Y2MDHMS,Y4MD,Y4MDHMS,Y2MDHMSF,Y4MDHMSF,HMS,HMSF
	--
	-- 該当するロケール、書式がない場合は、
	-- セッションのNLS_DATA_FORMATにて文字列化します。
	-- ===============================================================================
	FUNCTION F_TO_CHAR(
		PD IN DATE,
		FM IN VARCHAR2,
		LOCALE IN VARCHAR2
	) RETURN VARCHAR2 IS
		L$TERRITORY VARCHAR2(2);
		L$FM_TEMP VARCHAR2(30);
	BEGIN
		IF LENGTH(LOCALE) > 1 THEN
			L$TERRITORY := SUBSTR(LOCALE, 1, 2);
		ELSE
			L$TERRITORY := LOCALE;
		END IF;

		IF LOCALE = 'ja_JP' OR L$TERRITORY = 'ja' THEN
			L$FM_TEMP := F_GET_FORMAT_JA(FM, 'D');
		END IF;

		IF LOCALE = 'en_US' OR L$TERRITORY  = 'en' THEN
			L$FM_TEMP := F_GET_FORMAT_EN(FM, 'D');
		END IF;

		IF LOCALE = 'zh_CN' OR L$TERRITORY = 'zh' THEN
			L$FM_TEMP := F_GET_FORMAT_ZH(FM, 'D');
		END IF;

		IF LENGTH(L$FM_TEMP) > 1 THEN
			RETURN TO_CHAR(PD, L$FM_TEMP);
		ELSE
			RETURN TO_CHAR(PD);
		END IF;
	END F_TO_CHAR;


	-- ===============================================================================
	-- セッションのロケール情報に合わせた書式で、日付データを文字列化します。
	-- ただし、セッション自体のロケールは変更していないので、
	-- Oracleのセッション情報の影響を受けるフォーマット（曜日など）は対応していません。
	-- ===============================================================================
	FUNCTION F_TO_CHAR(
		PD IN DATE,
		FM IN VARCHAR2
	) RETURN VARCHAR2 IS

	BEGIN

		RETURN F_TO_CHAR(PD, FM, FCPA_CONTEXT.F_GET_LOCALE);

	END F_TO_CHAR;


	-- ===============================================================================
	-- 引数のロケール情報に合わせた書式で、日付データを文字列化します。
	-- ただし、セッション自体のロケールは変更していないので、
	-- Oracleのセッション情報の影響を受けるフォーマット（曜日など）は対応していません。
	-- ===============================================================================
	FUNCTION F_TO_CHAR_T(
		PT IN TIMESTAMP,
		FM IN VARCHAR2,
		LOCALE IN VARCHAR2
	) RETURN VARCHAR2 IS
		L$TERRITORY VARCHAR2(2);
		L$FM_TEMP VARCHAR2(30);
	BEGIN
		IF LENGTH(LOCALE) > 1 THEN
			L$TERRITORY := SUBSTR(LOCALE, 1, 2);
		ELSE
			L$TERRITORY := LOCALE;
		END IF;

		IF LOCALE = 'ja_JP' OR L$TERRITORY = 'ja' THEN
			L$FM_TEMP := F_GET_FORMAT_JA(FM, 'T');
		END IF;

		IF LOCALE = 'en_US' OR L$TERRITORY  = 'en' THEN
			L$FM_TEMP := F_GET_FORMAT_EN(FM, 'T');
		END IF;

		IF LOCALE = 'zh_CN' OR L$TERRITORY = 'zh' THEN
			L$FM_TEMP := F_GET_FORMAT_ZH(FM, 'T');
		END IF;

		IF LENGTH(L$FM_TEMP) > 1 THEN
			RETURN TO_CHAR(PT, L$FM_TEMP);
		ELSE
			RETURN TO_CHAR(PT);
		END IF;
	END F_TO_CHAR_T;

	-- ===============================================================================
	-- セッションのロケール情報に合わせた書式で、日付データを文字列化します。
	-- ただし、セッション自体のロケールは変更していないので、
	-- Oracleのセッション情報の影響を受けるフォーマット（曜日など）は対応していません。
	-- ===============================================================================
	FUNCTION F_TO_CHAR_T(
		PT IN TIMESTAMP,
		FM IN VARCHAR2
	) RETURN VARCHAR2 IS

	BEGIN

		RETURN F_TO_CHAR_T(PT, FM, FCPA_CONTEXT.F_GET_LOCALE);

	END F_TO_CHAR_T;

	-- ===============================================================================
	-- システム日付をDATE型で返します。
	-- ===============================================================================
	FUNCTION F_MCSYSDATE
	RETURN DATE IS
	BEGIN
		RETURN CAST(F_MCSYSTIMESTAMP() AS DATE);
	END;

	-- ===============================================================================
	-- 会社別システム日付をDATE型で返します。
	-- ===============================================================================
	FUNCTION F_MCSYSDATE_CO(
		I$CO_CD IN VARCHAR
	)
	RETURN DATE IS
	BEGIN
		RETURN CAST(F_MCSYSTIMESTAMP_CO(I$CO_CD) AS DATE);
	END;

	-- ===============================================================================
	-- システム日付を、FCM_SYSTSのデータの差分を反映して、TIMESATMP型で返します。
	-- ===============================================================================
	FUNCTION F_MCSYSTIMESTAMP_FR_FCM_SYSTS
	RETURN TIMESTAMP IS
		VAL VARCHAR2(50);
		DSI INTERVAL DAY(9) TO SECOND;
	BEGIN
		SELECT
			DIFF
		INTO
			VAL
		FROM
			(SELECT DIFF, UPD_TS FROM FCM_SYSTS ORDER BY UPD_TS DESC) T
		WHERE
			ROWNUM = 1
		ORDER BY
			UPD_TS DESC
		;

		DSI := TO_DSINTERVAL(VAL);
		RETURN SYSTIMESTAMP + DSI;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			RETURN SYSTIMESTAMP;
	END;

	-- ===============================================================================
	-- 会社別システム日付を、FCM_SYSTS_COのデータの差分を反映して、TIMESATMP型で返します。
	-- ===============================================================================
	FUNCTION F_MCSYSTIMESTAMP_CO_FR_SYSTS(
		I$CO_CD IN VARCHAR
	)
	RETURN TIMESTAMP IS
		VAL VARCHAR2(50);
		DSI INTERVAL DAY(9) TO SECOND;
	BEGIN
		SELECT
			DIFF
		INTO
			VAL
		FROM
			FCM_SYSTS_CO
		WHERE
			CO_CD = I$CO_CD
		;

		DSI := TO_DSINTERVAL(VAL);
		RETURN SYSTIMESTAMP + DSI;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			RETURN F_MCSYSTIMESTAMP;
	END;

	-- ===============================================================================
	-- 会社別システム日付をTIMESATMP型で返します。
	-- ===============================================================================
	FUNCTION F_MCSYSTIMESTAMP_CO(
		I$CO_CD IN VARCHAR
	)
	RETURN TIMESTAMP IS
	BEGIN
		IF USE_MCFDT AND I$CO_CD IS NOT NULL THEN
			RETURN F_MCSYSTIMESTAMP_CO_FR_SYSTS(I$CO_CD);
		ELSE
			RETURN F_MCSYSTIMESTAMP;
		END IF;
	END;

	-- ===============================================================================
	-- システム日付をTIMESATMP型で返します。
	-- ===============================================================================
	FUNCTION F_MCSYSTIMESTAMP
	RETURN TIMESTAMP IS
	BEGIN
		IF USE_MCFDT THEN
			RETURN F_MCSYSTIMESTAMP_FR_FCM_SYSTS;
		ELSE
			RETURN SYSTIMESTAMP;
		END IF;
	END;

	-- ===============================================================================
	-- mcframe7のシステム日付を設定します。
	-- ===============================================================================
	PROCEDURE SET_MCSYSTIMESTAMP(
		I$TS   IN  TIMESTAMP
	) IS
		VAL VARCHAR2(50);
		DSI INTERVAL DAY(9) TO SECOND;
	BEGIN
		DELETE FROM FCM_SYSTS;
		DELETE FROM FCC_COMMONPARAM WHERE CLASS_ID = 'DT' AND CODE = 'USE';
		USE_MCFDT := FALSE;
		IF I$TS IS NOT NULL THEN
			DSI := I$TS - SYSTIMESTAMP;
			VAL := TO_CHAR(DSI);
			INSERT INTO FCM_SYSTS (DIFF) VALUES (VAL);
			INSERT INTO FCC_COMMONPARAM (CLASS_ID, CODE, STR_VAL, NUM_VAL) VALUES ('DT', 'USE', 'TRUE', 0);
			USE_MCFDT := TRUE;
		END IF;
	END;

	-- ===============================================================================
	-- 会社別システム日付を設定します。
	-- ===============================================================================
	PROCEDURE SET_MCSYSTIMESTAMP_CO(
		I$CO_CD IN VARCHAR,
		I$TS   IN  TIMESTAMP
	) IS
		VAL VARCHAR2(50);
		DSI INTERVAL DAY(9) TO SECOND;
	BEGIN
		DELETE FROM FCM_SYSTS_CO WHERE CO_CD = I$CO_CD;
		DELETE FROM FCC_COMMONPARAM WHERE CLASS_ID = 'DT' AND CODE = 'USE';
		USE_MCFDT := FALSE;
		IF I$TS IS NOT NULL THEN
			DSI := I$TS - SYSTIMESTAMP;
			VAL := TO_CHAR(DSI);
			INSERT INTO FCM_SYSTS_CO (CO_CD, DIFF) VALUES (I$CO_CD, VAL);
			INSERT INTO FCC_COMMONPARAM (CLASS_ID, CODE, STR_VAL, NUM_VAL) VALUES ('DT', 'USE', 'TRUE', 0);
			USE_MCFDT := TRUE;
		END IF;
	END;

	-- ===============================================================================
	-- 運用日付を取得します。
	-- ===============================================================================
	FUNCTION F_GET_TODAY
	RETURN DATE
	IS
	BEGIN
		RETURN F_GET_TODAY(FCPA_CONTEXT.F_GET_CO_CD);
	END;

	-- ===============================================================================
	-- 会社ＣＤを指定して運用日付を取得します。
	-- ===============================================================================
	FUNCTION F_GET_TODAY (
		I$CO_CD IN VARCHAR
	)
	RETURN DATE
	IS
		W_TODAY DATE;
		W_SYSTS TIMESTAMP;
	BEGIN
		BEGIN
			SELECT TODAY INTO W_TODAY FROM FCM_TODAY_ALL WHERE CO_CD = I$CO_CD;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				W_SYSTS := F_MCSYSDATE_CO(I$CO_CD);
				W_TODAY := TO_DATE(TO_CHAR(W_SYSTS, 'YYYYMMDD'), 'YYYYMMDD');
		END;
		RETURN W_TODAY;
	END;

	-- ===============================================================================
	-- 運用日付を1日更新します。
	-- 本プロシージャではコミットしません。
	-- ===============================================================================
	PROCEDURE P_INCREMENT_TODAY (
		O_RET OUT NUMBER,
		O_TODAY_OLD OUT DATE,
		O_TODAY_NEW OUT DATE
	)
	IS
	BEGIN
		SELECT
			TODAY INTO O_TODAY_OLD
		FROM
			FCM_TODAY_ALL
		WHERE
			CO_CD = FCPA_CONTEXT.F_GET_CO_CD
		FOR UPDATE NOWAIT
		;

		O_TODAY_NEW := O_TODAY_OLD + 1;

		UPDATE FCM_TODAY_ALL SET TODAY = O_TODAY_NEW WHERE CO_CD = FCPA_CONTEXT.F_GET_CO_CD;
		O_RET := 0;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			O_RET := 1;
	END;

BEGIN
	BEGIN
		SELECT STR_VAL INTO VAL
		FROM FCC_COMMONPARAM
		WHERE
			CLASS_ID = 'DT' AND CODE = 'USE';
		IF VAL = 'TRUE' THEN
			USE_MCFDT := TRUE;
		ELSE
			USE_MCFDT := FALSE;
		END IF;
		RETURN;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			USE_MCFDT := FALSE;
	END;

END FCPA_DATE_UTIL;
/
