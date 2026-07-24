SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE FCPA_HISTORYBACKUP
-- ==============================================================================
-- 機能      History Backup機能
-- 作成者    magarifuchi
-- 作成日付  2021-05-10
-- 改版履歴  2021-05-10	magarifuchi	初版作成
--
-- バージョン:7.0.2
-- ==============================================================================
IS
	-- ==============================================================================
	-- バックアップ対象の開始日時を取得します
	-- ==============================================================================
	FUNCTION F_HST_DUMP_TS(
		I_TABLE_NAME IN VARCHAR2
	)
	RETURN TIMESTAMP;

	-- ===============================================================================
	-- 履歴データを削除します
	-- ===============================================================================
	PROCEDURE P_HST_DELETE (
		P_TNAME IN VARCHAR2
	);

END;

/
show errors;


CREATE OR REPLACE PACKAGE BODY FCPA_HISTORYBACKUP
-- ==============================================================================
-- 機能      History Backup機能
-- 作成者    magarifuchi
-- 作成日付  2021-05-10
-- 改版履歴  2021-05-10	magarifuchi	初版作成
--
-- バージョン:7.0.2
-- ==============================================================================
IS
	-- ==============================================================================
	-- バックアップ対象の開始日時を取得します。
	-- FCM_HST_DUMPに登録されている指定期間を、MCシステム日時から引いた翌月初日の日付を返します。
	-- 指定テーブルのレコードが無い場合は'DEFAULT'レコードを参照します。
	-- 'DEFAULT'レコードも無い場合は12ヶ月前の日付を返します。
	-- ==============================================================================
	FUNCTION F_HST_DUMP_TS
	(
		I_TABLE_NAME IN VARCHAR2  -- バックアップ対象テーブル名
	)
		RETURN TIMESTAMP
	IS
		RTN TIMESTAMP;
		FT VARCHAR2(10);
		VAL NUMBER(10);
	BEGIN
		BEGIN
			--テーブル毎の設定
			SELECT FTYPE, NUM_VAL INTO FT, VAL FROM FCM_HST_DUMP
			WHERE TABLE_NAME = I_TABLE_NAME;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				BEGIN
					--デフォルト('DEFAULT')レコードの設定
					SELECT FTYPE, NUM_VAL INTO FT, VAL FROM FCM_HST_DUMP
					WHERE TABLE_NAME = 'DEFAULT';
				EXCEPTION
					WHEN NO_DATA_FOUND THEN
						--'DEFAULT'レコードも無い場合は12ヶ月前とする
						RTN := ADD_MONTHS(FCPA_DATE_UTIL.F_MCSYSTIMESTAMP, -12);
						RETURN TRUNC(RTN, 'DD');
				END;
		END;

		IF FT = 'Y' THEN
			RTN := ADD_MONTHS(FCPA_DATE_UTIL.F_MCSYSTIMESTAMP, VAL * -12);
		ELSIF FT = 'M' THEN
			RTN := ADD_MONTHS(FCPA_DATE_UTIL.F_MCSYSTIMESTAMP, VAL * -1);
		ELSIF FT = 'D' THEN
			RTN := FCPA_DATE_UTIL.F_MCSYSTIMESTAMP - VAL;
		END IF;
		RETURN TRUNC(RTN, 'DD');

	END;

	-- ===============================================================================
	-- 履歴データを削除します。
	-- 指定されたテーブルの履歴データと、そのデータに紐づくFCT_HST_HEADERのデータを削除します。
	-- 削除対象データはF_HST_DUMP_TSで取得した日付を基に抽出します。
	-- ===============================================================================
	PROCEDURE P_HST_DELETE
	(
		P_TNAME VARCHAR2
	)
	IS
		V_QUERY_STR VARCHAR2(2000 CHAR);
	BEGIN
		BEGIN
			IF P_TNAME = 'FCT_HST_LOGIN' THEN
				DELETE FROM FCT_HST_LOGIN WHERE HST_TM < FCPA_HISTORYBACKUP.F_HST_DUMP_TS('FCT_HST_LOGIN');
			ELSIF P_TNAME = 'FCT_OPRHISTORY' THEN
				DELETE FROM FCT_OPRHISTORY WHERE ACCESS_TS < FCPA_HISTORYBACKUP.F_HST_DUMP_TS('FCT_OPRHISTORY');
			ELSE 
				V_QUERY_STR := 'INSERT INTO FCW_HST_ID SELECT T.HST_ID FROM FCT_HST_HEADER T JOIN ' || P_TNAME || ' R ON (T.HST_ID = R.HST_ID) ' ||
				               'WHERE T.HST_TIME < FCPA_HISTORYBACKUP.F_HST_DUMP_TS(:H_TBALE)' ;
				EXECUTE IMMEDIATE V_QUERY_STR USING P_TNAME;

				EXECUTE IMMEDIATE 'DELETE FROM ' || P_TNAME || ' H WHERE H.HST_ID IN (SELECT W.HST_ID FROM FCW_HST_ID W)';
			
				DELETE FROM FCT_HST_HEADER H WHERE H.HST_ID IN (SELECT W.HST_ID FROM FCW_HST_ID W);
			END IF;

			COMMIT;
		EXCEPTION
			WHEN OTHERS THEN
				ROLLBACK;
		END;
	END;

END;

/
show errors;


