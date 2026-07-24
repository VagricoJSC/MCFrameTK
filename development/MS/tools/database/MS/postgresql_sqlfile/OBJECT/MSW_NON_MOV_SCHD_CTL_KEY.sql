\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_non_mov_schd_ctl_key()
RETURNS TABLE (
	io_schd_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_non_mov_schd_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_non_mov_schd_ctl_key$temp(
				io_schd_typ varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_non_mov_schd_ctl_key_pk_ie ON msw_non_mov_schd_ctl_key$temp
				USING BTREE (io_schd_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_non_mov_schd_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_non_mov_schd_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_non_mov_schd_ctl_key
AS
SELECT *
FROM msw_non_mov_schd_ctl_key();

CREATE OR REPLACE FUNCTION msw_non_mov_schd_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_non_mov_schd_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_non_mov_schd_ctl_key$temp(
				io_schd_typ varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_non_mov_schd_ctl_key_pk_ie ON msw_non_mov_schd_ctl_key$temp
				USING BTREE (io_schd_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_non_mov_schd_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_non_mov_schd_ctl_key$temp(
			io_schd_typ
		)VALUES (
			NEW.io_schd_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_non_mov_schd_ctl_key$temp
		SET 
			io_schd_typ = NEW.io_schd_typ
		WHERE 0=0
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_non_mov_schd_ctl_key$temp
		WHERE 0=0
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_non_mov_schd_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_non_mov_schd_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE msw_non_mov_schd_ctl_key$func();
;

