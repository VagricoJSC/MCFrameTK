\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_tterm_key()
RETURNS TABLE (
	tterm_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_tterm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_tterm_key$temp(
				tterm_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_tterm_key_pk_ie ON maw_tterm_key$temp
				USING BTREE (tterm_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_tterm_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_tterm_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_tterm_key
AS
SELECT *
FROM maw_tterm_key();

CREATE OR REPLACE FUNCTION maw_tterm_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_tterm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_tterm_key$temp(
				tterm_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_tterm_key_pk_ie ON maw_tterm_key$temp
				USING BTREE (tterm_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_tterm_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_tterm_key$temp(
			tterm_cd
		)VALUES (
			NEW.tterm_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_tterm_key$temp
		SET 
			tterm_cd = NEW.tterm_cd
		WHERE 0=0
		AND (tterm_cd = OLD.tterm_cd OR tterm_cd IS NULL AND OLD.tterm_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_tterm_key$temp
		WHERE 0=0
		AND (tterm_cd = OLD.tterm_cd OR tterm_cd IS NULL AND OLD.tterm_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_tterm_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_tterm_key
FOR EACH ROW
EXECUTE PROCEDURE maw_tterm_key$func();
;

