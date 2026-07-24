\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_itm_jnl_key()
RETURNS TABLE (
	itm_jnl_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_jnl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_jnl_key$temp(
				itm_jnl_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_jnl_key_pk_ie ON maw_itm_jnl_key$temp
				USING BTREE (itm_jnl_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_jnl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_itm_jnl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_itm_jnl_key
AS
SELECT *
FROM maw_itm_jnl_key();

CREATE OR REPLACE FUNCTION maw_itm_jnl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_jnl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_jnl_key$temp(
				itm_jnl_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_jnl_key_pk_ie ON maw_itm_jnl_key$temp
				USING BTREE (itm_jnl_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_jnl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_itm_jnl_key$temp(
			itm_jnl_cd
		)VALUES (
			NEW.itm_jnl_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_itm_jnl_key$temp
		SET 
			itm_jnl_cd = NEW.itm_jnl_cd
		WHERE 0=0
		AND (itm_jnl_cd = OLD.itm_jnl_cd OR itm_jnl_cd IS NULL AND OLD.itm_jnl_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_itm_jnl_key$temp
		WHERE 0=0
		AND (itm_jnl_cd = OLD.itm_jnl_cd OR itm_jnl_cd IS NULL AND OLD.itm_jnl_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_itm_jnl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_itm_jnl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_itm_jnl_key$func();
;

