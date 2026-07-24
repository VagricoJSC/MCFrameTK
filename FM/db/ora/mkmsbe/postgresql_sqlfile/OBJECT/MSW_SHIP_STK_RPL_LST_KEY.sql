\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ship_stk_rpl_lst_key()
RETURNS TABLE (
	batch_data_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_stk_rpl_lst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_stk_rpl_lst_key$temp(
				batch_data_no varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ship_stk_rpl_lst_key_pk_ie ON msw_ship_stk_rpl_lst_key$temp
				USING BTREE (batch_data_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_stk_rpl_lst_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ship_stk_rpl_lst_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ship_stk_rpl_lst_key
AS
SELECT *
FROM msw_ship_stk_rpl_lst_key();

CREATE OR REPLACE FUNCTION msw_ship_stk_rpl_lst_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_stk_rpl_lst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_stk_rpl_lst_key$temp(
				batch_data_no varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ship_stk_rpl_lst_key_pk_ie ON msw_ship_stk_rpl_lst_key$temp
				USING BTREE (batch_data_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_stk_rpl_lst_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ship_stk_rpl_lst_key$temp(
			batch_data_no
		)VALUES (
			NEW.batch_data_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ship_stk_rpl_lst_key$temp
		SET 
			batch_data_no = NEW.batch_data_no
		WHERE 0=0
		AND (batch_data_no = OLD.batch_data_no OR batch_data_no IS NULL AND OLD.batch_data_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ship_stk_rpl_lst_key$temp
		WHERE 0=0
		AND (batch_data_no = OLD.batch_data_no OR batch_data_no IS NULL AND OLD.batch_data_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ship_stk_rpl_lst_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ship_stk_rpl_lst_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ship_stk_rpl_lst_key$func();
;

