\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cost_sls_key()
RETURNS TABLE (
	cost_sls_typ varchar,
	cost_sls_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_sls_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_sls_key$temp(
				cost_sls_typ varchar (1) NULL,
				cost_sls_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_sls_key_pk_ie ON maw_cost_sls_key$temp
				USING BTREE (cost_sls_typ,cost_sls_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_sls_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cost_sls_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cost_sls_key
AS
SELECT *
FROM maw_cost_sls_key();

CREATE OR REPLACE FUNCTION maw_cost_sls_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_sls_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_sls_key$temp(
				cost_sls_typ varchar (1) NULL,
				cost_sls_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_sls_key_pk_ie ON maw_cost_sls_key$temp
				USING BTREE (cost_sls_typ,cost_sls_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_sls_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cost_sls_key$temp(
			cost_sls_typ,
			cost_sls_cd
		)VALUES (
			NEW.cost_sls_typ,
			NEW.cost_sls_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cost_sls_key$temp
		SET 
			cost_sls_typ = NEW.cost_sls_typ,
			cost_sls_cd = NEW.cost_sls_cd
		WHERE 0=0
		AND (cost_sls_typ = OLD.cost_sls_typ OR cost_sls_typ IS NULL AND OLD.cost_sls_typ IS NULL)
		AND (cost_sls_cd = OLD.cost_sls_cd OR cost_sls_cd IS NULL AND OLD.cost_sls_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cost_sls_key$temp
		WHERE 0=0
		AND (cost_sls_typ = OLD.cost_sls_typ OR cost_sls_typ IS NULL AND OLD.cost_sls_typ IS NULL)
		AND (cost_sls_cd = OLD.cost_sls_cd OR cost_sls_cd IS NULL AND OLD.cost_sls_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cost_sls_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cost_sls_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cost_sls_key$func();
;

