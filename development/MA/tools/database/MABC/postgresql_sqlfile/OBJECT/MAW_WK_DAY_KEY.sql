\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_wk_day_key()
RETURNS TABLE (
	wk_day_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_wk_day_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_wk_day_key$temp(
				wk_day_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_wk_day_key_pk_ie ON maw_wk_day_key$temp
				USING BTREE (wk_day_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_wk_day_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_wk_day_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_wk_day_key
AS
SELECT *
FROM maw_wk_day_key();

CREATE OR REPLACE FUNCTION maw_wk_day_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_wk_day_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_wk_day_key$temp(
				wk_day_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_wk_day_key_pk_ie ON maw_wk_day_key$temp
				USING BTREE (wk_day_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_wk_day_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_wk_day_key$temp(
			wk_day_cd
		)VALUES (
			NEW.wk_day_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_wk_day_key$temp
		SET 
			wk_day_cd = NEW.wk_day_cd
		WHERE 0=0
		AND (wk_day_cd = OLD.wk_day_cd OR wk_day_cd IS NULL AND OLD.wk_day_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_wk_day_key$temp
		WHERE 0=0
		AND (wk_day_cd = OLD.wk_day_cd OR wk_day_cd IS NULL AND OLD.wk_day_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_wk_day_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_wk_day_key
FOR EACH ROW
EXECUTE PROCEDURE maw_wk_day_key$func();
;

