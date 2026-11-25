\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_mrkt_key()
RETURNS TABLE (
	wg_cd varchar,
	mrkt_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_mrkt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_mrkt_key$temp(
				wg_cd varchar (10) NULL,
				mrkt_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_mrkt_key_pk_ie ON maw_mrkt_key$temp
				USING BTREE (wg_cd,mrkt_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_mrkt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_mrkt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_mrkt_key
AS
SELECT *
FROM maw_mrkt_key();

CREATE OR REPLACE FUNCTION maw_mrkt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_mrkt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_mrkt_key$temp(
				wg_cd varchar (10) NULL,
				mrkt_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_mrkt_key_pk_ie ON maw_mrkt_key$temp
				USING BTREE (wg_cd,mrkt_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_mrkt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_mrkt_key$temp(
			wg_cd,
			mrkt_cd
		)VALUES (
			NEW.wg_cd,
			NEW.mrkt_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_mrkt_key$temp
		SET 
			wg_cd = NEW.wg_cd,
			mrkt_cd = NEW.mrkt_cd
		WHERE 0=0
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (mrkt_cd = OLD.mrkt_cd OR mrkt_cd IS NULL AND OLD.mrkt_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_mrkt_key$temp
		WHERE 0=0
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (mrkt_cd = OLD.mrkt_cd OR mrkt_cd IS NULL AND OLD.mrkt_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_mrkt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_mrkt_key
FOR EACH ROW
EXECUTE PROCEDURE maw_mrkt_key$func();
;

