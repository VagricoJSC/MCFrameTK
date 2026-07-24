\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_iv_map_key()
RETURNS TABLE (
	iv_d_no varchar,
	ship_schd_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_iv_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_iv_map_key$temp(
				iv_d_no varchar (15) NULL,
				ship_schd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_iv_map_key_pk_ie ON msw_iv_map_key$temp
				USING BTREE (iv_d_no,ship_schd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_iv_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_iv_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_iv_map_key
AS
SELECT *
FROM msw_iv_map_key();

CREATE OR REPLACE FUNCTION msw_iv_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_iv_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_iv_map_key$temp(
				iv_d_no varchar (15) NULL,
				ship_schd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_iv_map_key_pk_ie ON msw_iv_map_key$temp
				USING BTREE (iv_d_no,ship_schd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_iv_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_iv_map_key$temp(
			iv_d_no,
			ship_schd_no
		)VALUES (
			NEW.iv_d_no,
			NEW.ship_schd_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_iv_map_key$temp
		SET 
			iv_d_no = NEW.iv_d_no,
			ship_schd_no = NEW.ship_schd_no
		WHERE 0=0
		AND (iv_d_no = OLD.iv_d_no OR iv_d_no IS NULL AND OLD.iv_d_no IS NULL)
		AND (ship_schd_no = OLD.ship_schd_no OR ship_schd_no IS NULL AND OLD.ship_schd_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_iv_map_key$temp
		WHERE 0=0
		AND (iv_d_no = OLD.iv_d_no OR iv_d_no IS NULL AND OLD.iv_d_no IS NULL)
		AND (ship_schd_no = OLD.ship_schd_no OR ship_schd_no IS NULL AND OLD.ship_schd_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_iv_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_iv_map_key
FOR EACH ROW
EXECUTE PROCEDURE msw_iv_map_key$func();
;

