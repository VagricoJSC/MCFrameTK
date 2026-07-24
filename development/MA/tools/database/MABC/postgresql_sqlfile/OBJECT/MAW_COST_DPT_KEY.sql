\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cost_dpt_key()
RETURNS TABLE (
	dpt_cd varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_dpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_dpt_key$temp(
				dpt_cd varchar (20) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_dpt_key_pk_ie ON maw_cost_dpt_key$temp
				USING BTREE (dpt_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_dpt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cost_dpt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cost_dpt_key
AS
SELECT *
FROM maw_cost_dpt_key();

CREATE OR REPLACE FUNCTION maw_cost_dpt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_dpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_dpt_key$temp(
				dpt_cd varchar (20) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_dpt_key_pk_ie ON maw_cost_dpt_key$temp
				USING BTREE (dpt_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_dpt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cost_dpt_key$temp(
			dpt_cd,
			term
		)VALUES (
			NEW.dpt_cd,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cost_dpt_key$temp
		SET 
			dpt_cd = NEW.dpt_cd,
			term = NEW.term
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cost_dpt_key$temp
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cost_dpt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cost_dpt_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cost_dpt_key$func();
;

