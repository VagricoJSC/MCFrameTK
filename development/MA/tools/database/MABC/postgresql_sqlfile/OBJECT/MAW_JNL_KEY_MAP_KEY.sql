\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_jnl_key_map_key()
RETURNS TABLE (
	ac_slip_typ varchar,
	cost_flg char,
	jnl_key_col_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_jnl_key_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_jnl_key_map_key$temp(
				ac_slip_typ varchar (5) NULL,
				cost_flg char (1) DEFAULT '0' NULL,
				jnl_key_col_typ varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_jnl_key_map_key_pk_ie ON maw_jnl_key_map_key$temp
				USING BTREE (ac_slip_typ,cost_flg,jnl_key_col_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_jnl_key_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_jnl_key_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_jnl_key_map_key
AS
SELECT *
FROM maw_jnl_key_map_key();
ALTER VIEW maw_jnl_key_map_key ALTER COLUMN cost_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION maw_jnl_key_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_jnl_key_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_jnl_key_map_key$temp(
				ac_slip_typ varchar (5) NULL,
				cost_flg char (1) DEFAULT '0' NULL,
				jnl_key_col_typ varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_jnl_key_map_key_pk_ie ON maw_jnl_key_map_key$temp
				USING BTREE (ac_slip_typ,cost_flg,jnl_key_col_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_jnl_key_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_jnl_key_map_key$temp(
			ac_slip_typ,
			cost_flg,
			jnl_key_col_typ
		)VALUES (
			NEW.ac_slip_typ,
			NEW.cost_flg,
			NEW.jnl_key_col_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_jnl_key_map_key$temp
		SET 
			ac_slip_typ = NEW.ac_slip_typ,
			cost_flg = NEW.cost_flg,
			jnl_key_col_typ = NEW.jnl_key_col_typ
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (cost_flg = OLD.cost_flg OR cost_flg IS NULL AND OLD.cost_flg IS NULL)
		AND (jnl_key_col_typ = OLD.jnl_key_col_typ OR jnl_key_col_typ IS NULL AND OLD.jnl_key_col_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_jnl_key_map_key$temp
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (cost_flg = OLD.cost_flg OR cost_flg IS NULL AND OLD.cost_flg IS NULL)
		AND (jnl_key_col_typ = OLD.jnl_key_col_typ OR jnl_key_col_typ IS NULL AND OLD.jnl_key_col_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_jnl_key_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_jnl_key_map_key
FOR EACH ROW
EXECUTE PROCEDURE maw_jnl_key_map_key$func();
;

