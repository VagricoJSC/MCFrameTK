\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_jnl_ptn_key()
RETURNS TABLE (
	jnl_ptn_cd varchar,
	jnl_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_jnl_ptn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_jnl_ptn_key$temp(
				jnl_ptn_cd varchar (20) NULL,
				jnl_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_jnl_ptn_key_pk_ie ON maw_jnl_ptn_key$temp
				USING BTREE (jnl_ptn_cd,jnl_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_jnl_ptn_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_jnl_ptn_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_jnl_ptn_key
AS
SELECT *
FROM maw_jnl_ptn_key();

CREATE OR REPLACE FUNCTION maw_jnl_ptn_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_jnl_ptn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_jnl_ptn_key$temp(
				jnl_ptn_cd varchar (20) NULL,
				jnl_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_jnl_ptn_key_pk_ie ON maw_jnl_ptn_key$temp
				USING BTREE (jnl_ptn_cd,jnl_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_jnl_ptn_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_jnl_ptn_key$temp(
			jnl_ptn_cd,
			jnl_seq
		)VALUES (
			NEW.jnl_ptn_cd,
			NEW.jnl_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_jnl_ptn_key$temp
		SET 
			jnl_ptn_cd = NEW.jnl_ptn_cd,
			jnl_seq = NEW.jnl_seq
		WHERE 0=0
		AND (jnl_ptn_cd = OLD.jnl_ptn_cd OR jnl_ptn_cd IS NULL AND OLD.jnl_ptn_cd IS NULL)
		AND (jnl_seq = OLD.jnl_seq OR jnl_seq IS NULL AND OLD.jnl_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_jnl_ptn_key$temp
		WHERE 0=0
		AND (jnl_ptn_cd = OLD.jnl_ptn_cd OR jnl_ptn_cd IS NULL AND OLD.jnl_ptn_cd IS NULL)
		AND (jnl_seq = OLD.jnl_seq OR jnl_seq IS NULL AND OLD.jnl_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_jnl_ptn_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_jnl_ptn_key
FOR EACH ROW
EXECUTE PROCEDURE maw_jnl_ptn_key$func();
;

