\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_insp_point_key()
RETURNS TABLE (
	insp_point_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_insp_point_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_insp_point_key$temp(
				insp_point_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_insp_point_key_pk_ie ON maw_insp_point_key$temp
				USING BTREE (insp_point_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_insp_point_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_insp_point_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_insp_point_key
AS
SELECT *
FROM maw_insp_point_key();

CREATE OR REPLACE FUNCTION maw_insp_point_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_insp_point_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_insp_point_key$temp(
				insp_point_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_insp_point_key_pk_ie ON maw_insp_point_key$temp
				USING BTREE (insp_point_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_insp_point_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_insp_point_key$temp(
			insp_point_cd
		)VALUES (
			NEW.insp_point_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_insp_point_key$temp
		SET 
			insp_point_cd = NEW.insp_point_cd
		WHERE 0=0
		AND (insp_point_cd = OLD.insp_point_cd OR insp_point_cd IS NULL AND OLD.insp_point_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_insp_point_key$temp
		WHERE 0=0
		AND (insp_point_cd = OLD.insp_point_cd OR insp_point_cd IS NULL AND OLD.insp_point_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_insp_point_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_insp_point_key
FOR EACH ROW
EXECUTE PROCEDURE maw_insp_point_key$func();
;

