\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_cred_key()
RETURNS TABLE (
	cred_cd varchar,
	trd_cur_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_cred_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_cred_key$temp(
				cred_cd varchar (20) NULL,
				trd_cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_cred_key_pk_ie ON msw_cred_key$temp
				USING BTREE (cred_cd,trd_cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_cred_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_cred_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_cred_key
AS
SELECT *
FROM msw_cred_key();

CREATE OR REPLACE FUNCTION msw_cred_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_cred_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_cred_key$temp(
				cred_cd varchar (20) NULL,
				trd_cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_cred_key_pk_ie ON msw_cred_key$temp
				USING BTREE (cred_cd,trd_cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_cred_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_cred_key$temp(
			cred_cd,
			trd_cur_cd
		)VALUES (
			NEW.cred_cd,
			NEW.trd_cur_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_cred_key$temp
		SET 
			cred_cd = NEW.cred_cd,
			trd_cur_cd = NEW.trd_cur_cd
		WHERE 0=0
		AND (cred_cd = OLD.cred_cd OR cred_cd IS NULL AND OLD.cred_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_cred_key$temp
		WHERE 0=0
		AND (cred_cd = OLD.cred_cd OR cred_cd IS NULL AND OLD.cred_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_cred_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_cred_key
FOR EACH ROW
EXECUTE PROCEDURE msw_cred_key$func();
;

