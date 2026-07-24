\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ex_cntnr_key()
RETURNS TABLE (
	cntnr_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ex_cntnr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ex_cntnr_key$temp(
				cntnr_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ex_cntnr_key_pk_ie ON maw_ex_cntnr_key$temp
				USING BTREE (cntnr_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ex_cntnr_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ex_cntnr_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ex_cntnr_key
AS
SELECT *
FROM maw_ex_cntnr_key();

CREATE OR REPLACE FUNCTION maw_ex_cntnr_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ex_cntnr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ex_cntnr_key$temp(
				cntnr_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ex_cntnr_key_pk_ie ON maw_ex_cntnr_key$temp
				USING BTREE (cntnr_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ex_cntnr_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ex_cntnr_key$temp(
			cntnr_cd
		)VALUES (
			NEW.cntnr_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ex_cntnr_key$temp
		SET 
			cntnr_cd = NEW.cntnr_cd
		WHERE 0=0
		AND (cntnr_cd = OLD.cntnr_cd OR cntnr_cd IS NULL AND OLD.cntnr_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ex_cntnr_key$temp
		WHERE 0=0
		AND (cntnr_cd = OLD.cntnr_cd OR cntnr_cd IS NULL AND OLD.cntnr_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ex_cntnr_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ex_cntnr_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ex_cntnr_key$func();
;

