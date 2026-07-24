SPOOL &1;

SET SERVEROUTPUT ON FORMAT WRAPPED;
SET FEEDBACK OFF;
DECLARE
-- ==============================================================================
-- 機能      シーケンス移行ユーティリティパッケージ
--           33～34行目のコメントをはずすと、現在値は加算されるが、
--           現在値に最も近い値が必ず取れます。
--
-- 作成者    H.Katayama
-- 作成日付  2009-12-10
-- 改版履歴  2009-12-10 H.Katayama 初版作成
--
-- バージョン:6.1.1
-- =============================================================================
	L_SQL VARCHAR2(2000) ;
	CURSOR CUR_SQL IS
	SELECT
		*
	FROM USER_SEQUENCES
	ORDER BY SEQUENCE_NAME ;
	LV NUMBER;
BEGIN
	L_SQL := 'NULL' ;
	FOR ROW_SQL IN CUR_SQL LOOP
		DBMS_OUTPUT.PUT_LINE('-- ' || ROW_SQL.SEQUENCE_NAME || '  ##########################################') ;
		DBMS_OUTPUT.PUT_LINE('');
		DBMS_OUTPUT.PUT_LINE('DROP SEQUENCE ' || ROW_SQL.SEQUENCE_NAME || ';') ;
		DBMS_OUTPUT.PUT_LINE('');
		BEGIN
			/**
			 * 下記の2行を有効にすると、現在値は加算されるが、現在値に最も近い値が必ず取れる
			L_SQL := 'SELECT ' || ROW_SQL.SEQUENCE_NAME || '.NEXTVAL FROM DUAL';
			EXECUTE IMMEDIATE L_SQL INTO lv ;
			**/
			L_SQL := 'SELECT ' || ROW_SQL.SEQUENCE_NAME || '.CURRVAL FROM DUAL';
			EXECUTE IMMEDIATE L_SQL INTO lv ;
		EXCEPTION
			WHEN OTHERS THEN
				lv := ROW_SQL.LAST_NUMBER;
		END;
		DBMS_OUTPUT.PUT_LINE('CREATE SEQUENCE ' || ROW_SQL.SEQUENCE_NAME);
		DBMS_OUTPUT.PUT_LINE('INCREMENT BY ' || TO_CHAR(ROW_SQL.INCREMENT_BY));
		DBMS_OUTPUT.PUT_LINE('START WITH ' || TO_CHAR(lv));
		DBMS_OUTPUT.PUT_LINE('MAXVALUE ' || TO_CHAR(ROW_SQL.MAX_VALUE));
		DBMS_OUTPUT.PUT_LINE('MINVALUE ' || TO_CHAR(ROW_SQL.MIN_VALUE));
		DBMS_OUTPUT.PUT_LINE('CACHE ' || TO_CHAR(ROW_SQL.CACHE_SIZE));
		IF ROW_SQL.CYCLE_FLAG = 'Y' THEN
			DBMS_OUTPUT.PUT('CYCLE ');
		ELSE
			DBMS_OUTPUT.PUT('NOCYCLE ');
		END IF;

		IF ROW_SQL.ORDER_FLAG = 'Y' THEN
			DBMS_OUTPUT.PUT_LINE('ORDER;');
		ELSE
			DBMS_OUTPUT.PUT_LINE('NOORDER;');
		END IF;
		DBMS_OUTPUT.PUT_LINE('');
		DBMS_OUTPUT.PUT_LINE('');
	END LOOP ;
EXCEPTION
	WHEN OTHERS THEN
		DBMS_OUTPUT.PUT_LINE('ERROR AT OUT OF LOOP !!'||SQLCODE);
		DBMS_OUTPUT.PUT_LINE(SQLERRM);
		DBMS_OUTPUT.PUT_LINE(L_SQL);
END;
/
SPOOL OFF
