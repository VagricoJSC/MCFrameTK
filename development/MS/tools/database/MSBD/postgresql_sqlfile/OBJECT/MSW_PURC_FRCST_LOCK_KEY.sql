\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_purc_frcst_lock_key()
RETURNS TABLE (
	sppl_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_purc_frcst_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_purc_frcst_lock_key$temp(
				sppl_cd varchar (20) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_purc_frcst_lock_key_pk_ie ON msw_purc_frcst_lock_key$temp
				USING BTREE (sppl_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_purc_frcst_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_purc_frcst_lock_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_purc_frcst_lock_key
AS
SELECT *
FROM msw_purc_frcst_lock_key();

CREATE OR REPLACE FUNCTION msw_purc_frcst_lock_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_purc_frcst_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_purc_frcst_lock_key$temp(
				sppl_cd varchar (20) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_purc_frcst_lock_key_pk_ie ON msw_purc_frcst_lock_key$temp
				USING BTREE (sppl_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_purc_frcst_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_purc_frcst_lock_key$temp(
			sppl_cd,
			wg_cd
		)VALUES (
			NEW.sppl_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_purc_frcst_lock_key$temp
		SET 
			sppl_cd = NEW.sppl_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_purc_frcst_lock_key$temp
		WHERE 0=0
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_purc_frcst_lock_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_purc_frcst_lock_key
FOR EACH ROW
EXECUTE PROCEDURE msw_purc_frcst_lock_key$func();
;

