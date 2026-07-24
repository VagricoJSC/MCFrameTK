\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cost_ac_out_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	ac_slip_typ varchar,
	itm_jnl_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_ac_out_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_ac_out_key$temp(
				calc_grp_cd varchar (10) NULL,
				ac_slip_typ varchar (5) NULL,
				itm_jnl_cd varchar (5) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_ac_out_key_pk_ie ON maw_cost_ac_out_key$temp
				USING BTREE (calc_grp_cd,ac_slip_typ,itm_jnl_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_ac_out_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cost_ac_out_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cost_ac_out_key
AS
SELECT *
FROM maw_cost_ac_out_key();

CREATE OR REPLACE FUNCTION maw_cost_ac_out_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_ac_out_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_ac_out_key$temp(
				calc_grp_cd varchar (10) NULL,
				ac_slip_typ varchar (5) NULL,
				itm_jnl_cd varchar (5) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_ac_out_key_pk_ie ON maw_cost_ac_out_key$temp
				USING BTREE (calc_grp_cd,ac_slip_typ,itm_jnl_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_ac_out_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cost_ac_out_key$temp(
			calc_grp_cd,
			ac_slip_typ,
			itm_jnl_cd,
			st_dt
		)VALUES (
			NEW.calc_grp_cd,
			NEW.ac_slip_typ,
			NEW.itm_jnl_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cost_ac_out_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			ac_slip_typ = NEW.ac_slip_typ,
			itm_jnl_cd = NEW.itm_jnl_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (itm_jnl_cd = OLD.itm_jnl_cd OR itm_jnl_cd IS NULL AND OLD.itm_jnl_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cost_ac_out_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (itm_jnl_cd = OLD.itm_jnl_cd OR itm_jnl_cd IS NULL AND OLD.itm_jnl_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cost_ac_out_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cost_ac_out_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cost_ac_out_key$func();
;

