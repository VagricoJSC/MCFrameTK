\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_term()
RETURNS TABLE (
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_term$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_term$temp(
				term timestamp(0)  NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE maw_term$temp
			ADD CONSTRAINT maw_term_pk PRIMARY KEY(term);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_term$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_term$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_term
AS
SELECT *
FROM maw_term();

CREATE OR REPLACE FUNCTION maw_term$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_term$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_term$temp(
				term timestamp(0)  NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE maw_term$temp
			ADD CONSTRAINT maw_term_pk PRIMARY KEY(term);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_term$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_term$temp(
			term
		)VALUES (
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_term$temp
		SET 
			term = NEW.term
		WHERE 0=0
		AND term = OLD.term;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_term$temp
		WHERE 0=0
		AND term = OLD.term;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_term$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_term
FOR EACH ROW
EXECUTE PROCEDURE maw_term$func();
;

