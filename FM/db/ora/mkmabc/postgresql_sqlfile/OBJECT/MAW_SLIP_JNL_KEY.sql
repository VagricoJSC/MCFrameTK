\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_slip_jnl_key()
RETURNS TABLE (
	ac_slip_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_slip_jnl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_slip_jnl_key$temp(
				ac_slip_typ varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_slip_jnl_key_pk_ie ON maw_slip_jnl_key$temp
				USING BTREE (ac_slip_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_slip_jnl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_slip_jnl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_slip_jnl_key
AS
SELECT *
FROM maw_slip_jnl_key();

CREATE OR REPLACE FUNCTION maw_slip_jnl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_slip_jnl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_slip_jnl_key$temp(
				ac_slip_typ varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_slip_jnl_key_pk_ie ON maw_slip_jnl_key$temp
				USING BTREE (ac_slip_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_slip_jnl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_slip_jnl_key$temp(
			ac_slip_typ
		)VALUES (
			NEW.ac_slip_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_slip_jnl_key$temp
		SET 
			ac_slip_typ = NEW.ac_slip_typ
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_slip_jnl_key$temp
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_slip_jnl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_slip_jnl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_slip_jnl_key$func();
;

