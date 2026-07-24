\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_oper_key()
RETURNS TABLE (
	oper_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_oper_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_oper_key$temp(
				oper_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_oper_key_pk_ie ON maw_oper_key$temp
				USING BTREE (oper_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_oper_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_oper_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_oper_key
AS
SELECT *
FROM maw_oper_key();

CREATE OR REPLACE FUNCTION maw_oper_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_oper_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_oper_key$temp(
				oper_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_oper_key_pk_ie ON maw_oper_key$temp
				USING BTREE (oper_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_oper_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_oper_key$temp(
			oper_cd
		)VALUES (
			NEW.oper_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_oper_key$temp
		SET 
			oper_cd = NEW.oper_cd
		WHERE 0=0
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_oper_key$temp
		WHERE 0=0
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_oper_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_oper_key
FOR EACH ROW
EXECUTE PROCEDURE maw_oper_key$func();
;

