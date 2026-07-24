\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_bac_ac_key()
RETURNS TABLE (
	jnl_grp_cd varchar,
	bank_ac_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bac_ac_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bac_ac_key$temp(
				jnl_grp_cd varchar (5) NULL,
				bank_ac_cd varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bac_ac_key_pk_ie ON maw_bac_ac_key$temp
				USING BTREE (jnl_grp_cd,bank_ac_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bac_ac_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_bac_ac_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_bac_ac_key
AS
SELECT *
FROM maw_bac_ac_key();

CREATE OR REPLACE FUNCTION maw_bac_ac_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bac_ac_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bac_ac_key$temp(
				jnl_grp_cd varchar (5) NULL,
				bank_ac_cd varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bac_ac_key_pk_ie ON maw_bac_ac_key$temp
				USING BTREE (jnl_grp_cd,bank_ac_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bac_ac_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_bac_ac_key$temp(
			jnl_grp_cd,
			bank_ac_cd
		)VALUES (
			NEW.jnl_grp_cd,
			NEW.bank_ac_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_bac_ac_key$temp
		SET 
			jnl_grp_cd = NEW.jnl_grp_cd,
			bank_ac_cd = NEW.bank_ac_cd
		WHERE 0=0
		AND (jnl_grp_cd = OLD.jnl_grp_cd OR jnl_grp_cd IS NULL AND OLD.jnl_grp_cd IS NULL)
		AND (bank_ac_cd = OLD.bank_ac_cd OR bank_ac_cd IS NULL AND OLD.bank_ac_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_bac_ac_key$temp
		WHERE 0=0
		AND (jnl_grp_cd = OLD.jnl_grp_cd OR jnl_grp_cd IS NULL AND OLD.jnl_grp_cd IS NULL)
		AND (bank_ac_cd = OLD.bank_ac_cd OR bank_ac_cd IS NULL AND OLD.bank_ac_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_bac_ac_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_bac_ac_key
FOR EACH ROW
EXECUTE PROCEDURE maw_bac_ac_key$func();
;

