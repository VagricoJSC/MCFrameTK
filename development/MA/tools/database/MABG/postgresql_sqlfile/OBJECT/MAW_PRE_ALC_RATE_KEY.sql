\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_pre_alc_rate_key()
RETURNS TABLE (
	pre_alc_rate_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_pre_alc_rate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_pre_alc_rate_key$temp(
				pre_alc_rate_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_pre_alc_rate_key_pk_ie ON maw_pre_alc_rate_key$temp
				USING BTREE (pre_alc_rate_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_pre_alc_rate_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_pre_alc_rate_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_pre_alc_rate_key
AS
SELECT *
FROM maw_pre_alc_rate_key();

CREATE OR REPLACE FUNCTION maw_pre_alc_rate_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_pre_alc_rate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_pre_alc_rate_key$temp(
				pre_alc_rate_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_pre_alc_rate_key_pk_ie ON maw_pre_alc_rate_key$temp
				USING BTREE (pre_alc_rate_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_pre_alc_rate_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_pre_alc_rate_key$temp(
			pre_alc_rate_cd
		)VALUES (
			NEW.pre_alc_rate_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_pre_alc_rate_key$temp
		SET 
			pre_alc_rate_cd = NEW.pre_alc_rate_cd
		WHERE 0=0
		AND (pre_alc_rate_cd = OLD.pre_alc_rate_cd OR pre_alc_rate_cd IS NULL AND OLD.pre_alc_rate_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_pre_alc_rate_key$temp
		WHERE 0=0
		AND (pre_alc_rate_cd = OLD.pre_alc_rate_cd OR pre_alc_rate_cd IS NULL AND OLD.pre_alc_rate_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_pre_alc_rate_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_pre_alc_rate_key
FOR EACH ROW
EXECUTE PROCEDURE maw_pre_alc_rate_key$func();
;

