\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_slip_form_key()
RETURNS TABLE (
	slip_form_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_slip_form_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_slip_form_key$temp(
				slip_form_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_slip_form_key_pk_ie ON maw_slip_form_key$temp
				USING BTREE (slip_form_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_slip_form_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_slip_form_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_slip_form_key
AS
SELECT *
FROM maw_slip_form_key();

CREATE OR REPLACE FUNCTION maw_slip_form_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_slip_form_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_slip_form_key$temp(
				slip_form_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_slip_form_key_pk_ie ON maw_slip_form_key$temp
				USING BTREE (slip_form_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_slip_form_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_slip_form_key$temp(
			slip_form_cd
		)VALUES (
			NEW.slip_form_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_slip_form_key$temp
		SET 
			slip_form_cd = NEW.slip_form_cd
		WHERE 0=0
		AND (slip_form_cd = OLD.slip_form_cd OR slip_form_cd IS NULL AND OLD.slip_form_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_slip_form_key$temp
		WHERE 0=0
		AND (slip_form_cd = OLD.slip_form_cd OR slip_form_cd IS NULL AND OLD.slip_form_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_slip_form_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_slip_form_key
FOR EACH ROW
EXECUTE PROCEDURE maw_slip_form_key$func();
;

