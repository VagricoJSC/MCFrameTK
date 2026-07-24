CREATE OR REPLACE FUNCTION fcpa_err$msg_binder(
	VARIADIC i_array VARCHAR[]
) RETURNS VARCHAR[]
AS $BODY$
BEGIN
	RETURN $1::VARCHAR(4000)[];
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_err$clear_err()
AS
$BODY$
-- ===============================================================================
-- エラー情報のクリア
-- ===============================================================================
BEGIN
	-- 呼出し先でセッション情報を参照しないため"_nosession"を使用する
	CALL fcpa_postgres_util$exec_autonomous_sql_nosession('CALL fcpa_err$clear_err_dblink()') ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_err$clear_err_dblink()
AS
$BODY$
-- ===============================================================================
-- エラー情報のクリア(dblink用)
-- ===============================================================================
BEGIN
	PERFORM fcpa_postgres_util$set_var('fcpa_err', 'v_err_bind_0', NULL::INTEGER);
	FOR i in 1..20 LOOP
		PERFORM fcpa_postgres_util$set_var('fcpa_err', 'v_err_bind_' || TO_CHAR(i,'FM00'), NULL::VARCHAR);
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_err$raise_app_err(
	IN e_id VARCHAR,
	IN e_bind VARCHAR[] DEFAULT NULL::VARCHAR[]
)
AS
$BODY$
-- ===============================================================================
-- アプリケーションエラーを RAISE する
-- ===============================================================================
BEGIN
	-- エラーバインドのクリア
	CALL fcpa_err$clear_err();

	PERFORM fcpa_postgres_util$set_var_link('fcpa_err', 'v_err_bind_0', COALESCE(ARRAY_LENGTH(e_bind, 1), 0));
	FOR i IN 1..COALESCE(ARRAY_LENGTH(e_bind, 1), 0) LOOP
		PERFORM fcpa_postgres_util$set_var_link('fcpa_err', 'v_err_bind_'|| TO_CHAR(i,'FM00'), e_bind[i]);
	END LOOP;

	RAISE EXCEPTION USING ERRCODE = '99999', MESSAGE = e_id;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_err$get_err_bind(
	INOUT err01 VARCHAR,
	INOUT err02 VARCHAR,
	INOUT err03 VARCHAR,
	INOUT err04 VARCHAR,
	INOUT err05 VARCHAR,
	INOUT err06 VARCHAR,
	INOUT err07 VARCHAR,
	INOUT err08 VARCHAR,
	INOUT err09 VARCHAR,
	INOUT err10 VARCHAR,
	INOUT err11 VARCHAR,
	INOUT err12 VARCHAR,
	INOUT err13 VARCHAR,
	INOUT err14 VARCHAR,
	INOUT err15 VARCHAR,
	INOUT err16 VARCHAR,
	INOUT err17 VARCHAR,
	INOUT err18 VARCHAR,
	INOUT err19 VARCHAR,
	INOUT err20 VARCHAR
)
AS
$BODY$
-- ===============================================================================
-- 前回に出力されたメッセージバインドを取得する
-- ===============================================================================
DECLARE
	last INTEGER;
	c_max_bind_length INTEGER := 1000; 
BEGIN
	last := fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_0')::INTEGER;

	IF last IS NOT NULL THEN
		IF last > 0 THEN
			err01 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_01'), 1, c_max_bind_length);
		END IF;
		IF last > 1 THEN
			err02 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_02'), 1, c_max_bind_length);
		END IF;
		IF last > 2 THEN
			err03 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_03'), 1, c_max_bind_length);
		END IF;
		IF last > 3 THEN
			err04 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_04'), 1, c_max_bind_length);
		END IF;
		IF last > 4 THEN
			err05 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_05'), 1, c_max_bind_length);
		END IF;
		IF last > 5 THEN
			err06 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_06'), 1, c_max_bind_length);
		END IF;
		IF last > 6 THEN
			err07 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_07'), 1, c_max_bind_length);
		END IF;
		IF last > 7 THEN
			err08 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_08'), 1, c_max_bind_length);
		END IF;
		IF last > 8 THEN
			err09 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_09'), 1, c_max_bind_length);
		END IF;
		IF last > 9 THEN
			err10 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_10'), 1, c_max_bind_length);
		END IF;
		IF last > 10 THEN
			err11 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_11'), 1, c_max_bind_length);
		END IF;
		IF last > 11 THEN
			err12 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_12'), 1, c_max_bind_length);
		END IF;
		IF last > 12 THEN
			err13 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_13'), 1, c_max_bind_length);
		END IF;
		IF last > 13 THEN
			err14 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_14'), 1, c_max_bind_length);
		END IF;
		IF last > 14 THEN
			err15 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_15'), 1, c_max_bind_length);
		END IF;
		IF last > 15 THEN
			err16 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_16'), 1, c_max_bind_length);
		END IF;
		IF last > 16 THEN
			err17 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_17'), 1, c_max_bind_length);
		END IF;
		IF last > 17 THEN
			err18 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_18'), 1, c_max_bind_length);
		END IF;
		IF last > 18 THEN
			err19 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_19'), 1, c_max_bind_length);
		END IF;
		IF last > 19 THEN
			err20 := SUBSTR(fcpa_postgres_util$get_var_link('fcpa_err', 'v_err_bind_20'), 1, c_max_bind_length);
		END IF;

	END IF;

END;
$BODY$
LANGUAGE plpgsql
;
