\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alc_wk_key()
RETURNS TABLE (
	alc_ptn_cd varchar,
	wk_cost_cd varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_wk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_wk_key$temp(
				alc_ptn_cd varchar (10) NULL,
				wk_cost_cd varchar (10) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_wk_key_pk_ie ON maw_alc_wk_key$temp
				USING BTREE (alc_ptn_cd,wk_cost_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_wk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alc_wk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alc_wk_key
AS
SELECT *
FROM maw_alc_wk_key();

CREATE OR REPLACE FUNCTION maw_alc_wk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_wk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_wk_key$temp(
				alc_ptn_cd varchar (10) NULL,
				wk_cost_cd varchar (10) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_wk_key_pk_ie ON maw_alc_wk_key$temp
				USING BTREE (alc_ptn_cd,wk_cost_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_wk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alc_wk_key$temp(
			alc_ptn_cd,
			wk_cost_cd,
			term
		)VALUES (
			NEW.alc_ptn_cd,
			NEW.wk_cost_cd,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alc_wk_key$temp
		SET 
			alc_ptn_cd = NEW.alc_ptn_cd,
			wk_cost_cd = NEW.wk_cost_cd,
			term = NEW.term
		WHERE 0=0
		AND (alc_ptn_cd = OLD.alc_ptn_cd OR alc_ptn_cd IS NULL AND OLD.alc_ptn_cd IS NULL)
		AND (wk_cost_cd = OLD.wk_cost_cd OR wk_cost_cd IS NULL AND OLD.wk_cost_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alc_wk_key$temp
		WHERE 0=0
		AND (alc_ptn_cd = OLD.alc_ptn_cd OR alc_ptn_cd IS NULL AND OLD.alc_ptn_cd IS NULL)
		AND (wk_cost_cd = OLD.wk_cost_cd OR wk_cost_cd IS NULL AND OLD.wk_cost_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alc_wk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alc_wk_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alc_wk_key$func();
;

