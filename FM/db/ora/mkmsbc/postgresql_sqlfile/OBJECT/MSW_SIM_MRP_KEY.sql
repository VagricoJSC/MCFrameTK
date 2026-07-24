\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sim_mrp_key()
RETURNS TABLE (
	sim_mrp_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sim_mrp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sim_mrp_key$temp(
				sim_mrp_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sim_mrp_key_pk_ie ON msw_sim_mrp_key$temp
				USING BTREE (sim_mrp_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sim_mrp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sim_mrp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sim_mrp_key
AS
SELECT *
FROM msw_sim_mrp_key();

CREATE OR REPLACE FUNCTION msw_sim_mrp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sim_mrp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sim_mrp_key$temp(
				sim_mrp_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sim_mrp_key_pk_ie ON msw_sim_mrp_key$temp
				USING BTREE (sim_mrp_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sim_mrp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sim_mrp_key$temp(
			sim_mrp_no
		)VALUES (
			NEW.sim_mrp_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sim_mrp_key$temp
		SET 
			sim_mrp_no = NEW.sim_mrp_no
		WHERE 0=0
		AND (sim_mrp_no = OLD.sim_mrp_no OR sim_mrp_no IS NULL AND OLD.sim_mrp_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sim_mrp_key$temp
		WHERE 0=0
		AND (sim_mrp_no = OLD.sim_mrp_no OR sim_mrp_no IS NULL AND OLD.sim_mrp_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sim_mrp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sim_mrp_key
FOR EACH ROW
EXECUTE PROCEDURE msw_sim_mrp_key$func();
;

