\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_acxfr_act_p_key()
RETURNS TABLE (
	acxfr_act_no varchar,
	acxfr_act_rev numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_acxfr_act_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_acxfr_act_p_key$temp(
				acxfr_act_no varchar (15) NULL,
				acxfr_act_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_acxfr_act_p_key_pk_ie ON msw_acxfr_act_p_key$temp
				USING BTREE (acxfr_act_no,acxfr_act_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_acxfr_act_p_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_acxfr_act_p_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_acxfr_act_p_key
AS
SELECT *
FROM msw_acxfr_act_p_key();

CREATE OR REPLACE FUNCTION msw_acxfr_act_p_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_acxfr_act_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_acxfr_act_p_key$temp(
				acxfr_act_no varchar (15) NULL,
				acxfr_act_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_acxfr_act_p_key_pk_ie ON msw_acxfr_act_p_key$temp
				USING BTREE (acxfr_act_no,acxfr_act_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_acxfr_act_p_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_acxfr_act_p_key$temp(
			acxfr_act_no,
			acxfr_act_rev
		)VALUES (
			NEW.acxfr_act_no,
			NEW.acxfr_act_rev
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_acxfr_act_p_key$temp
		SET 
			acxfr_act_no = NEW.acxfr_act_no,
			acxfr_act_rev = NEW.acxfr_act_rev
		WHERE 0=0
		AND (acxfr_act_no = OLD.acxfr_act_no OR acxfr_act_no IS NULL AND OLD.acxfr_act_no IS NULL)
		AND (acxfr_act_rev = OLD.acxfr_act_rev OR acxfr_act_rev IS NULL AND OLD.acxfr_act_rev IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_acxfr_act_p_key$temp
		WHERE 0=0
		AND (acxfr_act_no = OLD.acxfr_act_no OR acxfr_act_no IS NULL AND OLD.acxfr_act_no IS NULL)
		AND (acxfr_act_rev = OLD.acxfr_act_rev OR acxfr_act_rev IS NULL AND OLD.acxfr_act_rev IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_acxfr_act_p_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_acxfr_act_p_key
FOR EACH ROW
EXECUTE PROCEDURE msw_acxfr_act_p_key$func();
;

