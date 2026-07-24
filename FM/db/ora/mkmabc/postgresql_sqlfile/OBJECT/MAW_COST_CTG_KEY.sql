\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cost_ctg_key()
RETURNS TABLE (
	ctg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_ctg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_ctg_key$temp(
				ctg_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_ctg_key_pk_ie ON maw_cost_ctg_key$temp
				USING BTREE (ctg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_ctg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cost_ctg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cost_ctg_key
AS
SELECT *
FROM maw_cost_ctg_key();

CREATE OR REPLACE FUNCTION maw_cost_ctg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_ctg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_ctg_key$temp(
				ctg_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_ctg_key_pk_ie ON maw_cost_ctg_key$temp
				USING BTREE (ctg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_ctg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cost_ctg_key$temp(
			ctg_cd
		)VALUES (
			NEW.ctg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cost_ctg_key$temp
		SET 
			ctg_cd = NEW.ctg_cd
		WHERE 0=0
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cost_ctg_key$temp
		WHERE 0=0
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cost_ctg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cost_ctg_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cost_ctg_key$func();
;

