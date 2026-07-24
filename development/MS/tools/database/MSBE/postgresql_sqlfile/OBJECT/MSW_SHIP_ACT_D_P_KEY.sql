\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ship_act_d_p_key()
RETURNS TABLE (
	ship_act_d_no varchar,
	ship_act_rev numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_act_d_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_act_d_p_key$temp(
				ship_act_d_no varchar (15) NULL,
				ship_act_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ship_act_d_p_key_pk_ie ON msw_ship_act_d_p_key$temp
				USING BTREE (ship_act_d_no,ship_act_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_act_d_p_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ship_act_d_p_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ship_act_d_p_key
AS
SELECT *
FROM msw_ship_act_d_p_key();

CREATE OR REPLACE FUNCTION msw_ship_act_d_p_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_act_d_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_act_d_p_key$temp(
				ship_act_d_no varchar (15) NULL,
				ship_act_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ship_act_d_p_key_pk_ie ON msw_ship_act_d_p_key$temp
				USING BTREE (ship_act_d_no,ship_act_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_act_d_p_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ship_act_d_p_key$temp(
			ship_act_d_no,
			ship_act_rev
		)VALUES (
			NEW.ship_act_d_no,
			NEW.ship_act_rev
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ship_act_d_p_key$temp
		SET 
			ship_act_d_no = NEW.ship_act_d_no,
			ship_act_rev = NEW.ship_act_rev
		WHERE 0=0
		AND (ship_act_d_no = OLD.ship_act_d_no OR ship_act_d_no IS NULL AND OLD.ship_act_d_no IS NULL)
		AND (ship_act_rev = OLD.ship_act_rev OR ship_act_rev IS NULL AND OLD.ship_act_rev IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ship_act_d_p_key$temp
		WHERE 0=0
		AND (ship_act_d_no = OLD.ship_act_d_no OR ship_act_d_no IS NULL AND OLD.ship_act_d_no IS NULL)
		AND (ship_act_rev = OLD.ship_act_rev OR ship_act_rev IS NULL AND OLD.ship_act_rev IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ship_act_d_p_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ship_act_d_p_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ship_act_d_p_key$func();
;

