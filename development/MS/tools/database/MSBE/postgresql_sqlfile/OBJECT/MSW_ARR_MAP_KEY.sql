\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_arr_map_key()
RETURNS TABLE (
	arr_act_no varchar,
	ship_act_d_no varchar,
	iv_ship_act_d_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_arr_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_arr_map_key$temp(
				arr_act_no varchar (15) NULL,
				ship_act_d_no varchar (15) NULL,
				iv_ship_act_d_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_arr_map_key_pk_ie ON msw_arr_map_key$temp
				USING BTREE (arr_act_no,ship_act_d_no,iv_ship_act_d_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_arr_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_arr_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_arr_map_key
AS
SELECT *
FROM msw_arr_map_key();

CREATE OR REPLACE FUNCTION msw_arr_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_arr_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_arr_map_key$temp(
				arr_act_no varchar (15) NULL,
				ship_act_d_no varchar (15) NULL,
				iv_ship_act_d_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_arr_map_key_pk_ie ON msw_arr_map_key$temp
				USING BTREE (arr_act_no,ship_act_d_no,iv_ship_act_d_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_arr_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_arr_map_key$temp(
			arr_act_no,
			ship_act_d_no,
			iv_ship_act_d_no
		)VALUES (
			NEW.arr_act_no,
			NEW.ship_act_d_no,
			NEW.iv_ship_act_d_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_arr_map_key$temp
		SET 
			arr_act_no = NEW.arr_act_no,
			ship_act_d_no = NEW.ship_act_d_no,
			iv_ship_act_d_no = NEW.iv_ship_act_d_no
		WHERE 0=0
		AND (arr_act_no = OLD.arr_act_no OR arr_act_no IS NULL AND OLD.arr_act_no IS NULL)
		AND (ship_act_d_no = OLD.ship_act_d_no OR ship_act_d_no IS NULL AND OLD.ship_act_d_no IS NULL)
		AND (iv_ship_act_d_no = OLD.iv_ship_act_d_no OR iv_ship_act_d_no IS NULL AND OLD.iv_ship_act_d_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_arr_map_key$temp
		WHERE 0=0
		AND (arr_act_no = OLD.arr_act_no OR arr_act_no IS NULL AND OLD.arr_act_no IS NULL)
		AND (ship_act_d_no = OLD.ship_act_d_no OR ship_act_d_no IS NULL AND OLD.ship_act_d_no IS NULL)
		AND (iv_ship_act_d_no = OLD.iv_ship_act_d_no OR iv_ship_act_d_no IS NULL AND OLD.iv_ship_act_d_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_arr_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_arr_map_key
FOR EACH ROW
EXECUTE PROCEDURE msw_arr_map_key$func();
;

