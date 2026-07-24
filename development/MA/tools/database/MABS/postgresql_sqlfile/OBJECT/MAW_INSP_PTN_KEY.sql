\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_insp_ptn_key()
RETURNS TABLE (
	insp_ptn_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_insp_ptn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_insp_ptn_key$temp(
				insp_ptn_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_insp_ptn_key_pk_ie ON maw_insp_ptn_key$temp
				USING BTREE (insp_ptn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_insp_ptn_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_insp_ptn_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_insp_ptn_key
AS
SELECT *
FROM maw_insp_ptn_key();

CREATE OR REPLACE FUNCTION maw_insp_ptn_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_insp_ptn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_insp_ptn_key$temp(
				insp_ptn_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_insp_ptn_key_pk_ie ON maw_insp_ptn_key$temp
				USING BTREE (insp_ptn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_insp_ptn_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_insp_ptn_key$temp(
			insp_ptn_cd
		)VALUES (
			NEW.insp_ptn_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_insp_ptn_key$temp
		SET 
			insp_ptn_cd = NEW.insp_ptn_cd
		WHERE 0=0
		AND (insp_ptn_cd = OLD.insp_ptn_cd OR insp_ptn_cd IS NULL AND OLD.insp_ptn_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_insp_ptn_key$temp
		WHERE 0=0
		AND (insp_ptn_cd = OLD.insp_ptn_cd OR insp_ptn_cd IS NULL AND OLD.insp_ptn_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_insp_ptn_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_insp_ptn_key
FOR EACH ROW
EXECUTE PROCEDURE maw_insp_ptn_key$func();
;

