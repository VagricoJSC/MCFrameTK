\encoding UTF-8

CREATE OR REPLACE FUNCTION fcpa_historybackup$f_hst_dump_ts (
	IN i_table_name VARCHAR
) RETURNS TIMESTAMP
AS $BODY$
-- ==============================================================================
-- バックアップ対象の開始日時を取得します。
-- FCM_HST_DUMPに登録されている指定期間を、MCシステム日時から引いた翌月初日の日付を返します。
-- 指定テーブルのレコードが無い場合は'DEFAULT'レコードを参照します。
-- 'DEFAULT'レコードも無い場合は12ヶ月前の日付を返します。
-- ==============================================================================
DECLARE
	rtn TIMESTAMP WITHOUT TIME ZONE;
	ft VARCHAR;
	val NUMERIC;
BEGIN
	BEGIN
		--テーブル毎の設定
		SELECT FTYPE, NUM_VAL INTO STRICT ft, val FROM FCM_HST_DUMP
		WHERE TABLE_NAME = i_table_name;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			BEGIN
				--デフォルト('DEFAULT')レコードの設定
				SELECT FTYPE, NUM_VAL INTO STRICT ft, val FROM FCM_HST_DUMP
				WHERE TABLE_NAME = 'DEFAULT';
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					--'DEFAULT'レコードも無い場合は12ヶ月前とする
					rtn := fcpa_postgres_util$add_months(fcpa_date_util$f_mcsystimestamp(), -12);
					RETURN DATE_TRUNC('DAY', rtn);
			END;
	END;

	IF ft = 'Y' THEN
		rtn := fcpa_postgres_util$add_months(fcpa_date_util$f_mcsystimestamp(), val * -12);
	ELSIF ft = 'M' THEN
		rtn := fcpa_postgres_util$add_months(fcpa_date_util$f_mcsystimestamp(), val * -1);
	ELSIF ft = 'D' THEN
		rtn := fcpa_date_util$f_mcsystimestamp() - (TRUNC(val, 0) || ' days')::INTERVAL;
	END IF;
	RETURN DATE_TRUNC('DAY', rtn);

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE fcpa_historybackup$p_hst_delete (
	IN p_tname VARCHAR
)
AS $BODY$
-- ===============================================================================
-- 履歴データを削除します。
-- 指定されたテーブルの履歴データと、そのデータに紐づくFCT_HST_HEADERのデータを削除します。
-- 削除対象データはF_HST_DUMP_TSで取得した日付を基に抽出します。
-- ===============================================================================
DECLARE
	v_query_str VARCHAR;
BEGIN
	BEGIN
		IF p_tname = 'FCT_HST_LOGIN' THEN
			DELETE FROM FCT_HST_LOGIN WHERE HST_TM < fcpa_historybackup$f_hst_dump_ts('FCT_HST_LOGIN');
		ELSIF p_tname = 'FCT_OPRHISTORY' THEN
			DELETE FROM FCT_OPRHISTORY WHERE ACCESS_TS < fcpa_historybackup$f_hst_dump_ts('FCT_OPRHISTORY');
		ELSE 
			v_query_str := 'INSERT INTO FCW_HST_ID SELECT T.HST_ID FROM FCT_HST_HEADER T JOIN ' || p_tname || ' R ON (T.HST_ID = R.HST_ID) ' ||
			               'WHERE T.HST_TIME < fcpa_historybackup$f_hst_dump_ts($1)' ;
			EXECUTE v_query_str USING p_tname;

			EXECUTE 'DELETE FROM ' || p_tname || ' H WHERE H.HST_ID IN (SELECT W.HST_ID FROM FCW_HST_ID W)';
		
			DELETE FROM FCT_HST_HEADER H WHERE H.HST_ID IN (SELECT W.HST_ID FROM FCW_HST_ID W);
		END IF;

	EXCEPTION
		WHEN OTHERS THEN
			ROLLBACK;
			RETURN;
	END;

	COMMIT;

END ;
$BODY$
LANGUAGE plpgsql
;

