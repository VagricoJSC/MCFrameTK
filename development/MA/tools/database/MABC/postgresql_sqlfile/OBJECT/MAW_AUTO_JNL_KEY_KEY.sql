\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_auto_jnl_key_key()
RETURNS TABLE (
	auto_jnl_key_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_auto_jnl_key_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_auto_jnl_key_key$temp(
				auto_jnl_key_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_auto_jnl_key_key_pk_ie ON maw_auto_jnl_key_key$temp
				USING BTREE (auto_jnl_key_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_auto_jnl_key_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_auto_jnl_key_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_auto_jnl_key_key
AS
SELECT *
FROM maw_auto_jnl_key_key();

CREATE OR REPLACE FUNCTION maw_auto_jnl_key_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_auto_jnl_key_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_auto_jnl_key_key$temp(
				auto_jnl_key_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_auto_jnl_key_key_pk_ie ON maw_auto_jnl_key_key$temp
				USING BTREE (auto_jnl_key_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_auto_jnl_key_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_auto_jnl_key_key$temp(
			auto_jnl_key_cd
		)VALUES (
			NEW.auto_jnl_key_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_auto_jnl_key_key$temp
		SET 
			auto_jnl_key_cd = NEW.auto_jnl_key_cd
		WHERE 0=0
		AND (auto_jnl_key_cd = OLD.auto_jnl_key_cd OR auto_jnl_key_cd IS NULL AND OLD.auto_jnl_key_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_auto_jnl_key_key$temp
		WHERE 0=0
		AND (auto_jnl_key_cd = OLD.auto_jnl_key_cd OR auto_jnl_key_cd IS NULL AND OLD.auto_jnl_key_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_auto_jnl_key_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_auto_jnl_key_key
FOR EACH ROW
EXECUTE PROCEDURE maw_auto_jnl_key_key$func();
;

