\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_wk_cost_key()
RETURNS TABLE (
	wk_cost_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_wk_cost_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_wk_cost_key$temp(
				wk_cost_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_wk_cost_key_pk_ie ON maw_wk_cost_key$temp
				USING BTREE (wk_cost_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_wk_cost_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_wk_cost_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_wk_cost_key
AS
SELECT *
FROM maw_wk_cost_key();

CREATE OR REPLACE FUNCTION maw_wk_cost_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_wk_cost_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_wk_cost_key$temp(
				wk_cost_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_wk_cost_key_pk_ie ON maw_wk_cost_key$temp
				USING BTREE (wk_cost_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_wk_cost_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_wk_cost_key$temp(
			wk_cost_cd
		)VALUES (
			NEW.wk_cost_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_wk_cost_key$temp
		SET 
			wk_cost_cd = NEW.wk_cost_cd
		WHERE 0=0
		AND (wk_cost_cd = OLD.wk_cost_cd OR wk_cost_cd IS NULL AND OLD.wk_cost_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_wk_cost_key$temp
		WHERE 0=0
		AND (wk_cost_cd = OLD.wk_cost_cd OR wk_cost_cd IS NULL AND OLD.wk_cost_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_wk_cost_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_wk_cost_key
FOR EACH ROW
EXECUTE PROCEDURE maw_wk_cost_key$func();
;

