\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_act_io_key()
RETURNS TABLE (
	ac_slip_typ varchar,
	prio numeric,
	calc_ctg_cd varchar,
	wg_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_act_io_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_act_io_key$temp(
				ac_slip_typ varchar (5) NULL,
				prio numeric (4,0) NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_act_io_key_pk_ie ON maw_act_io_key$temp
				USING BTREE (ac_slip_typ,prio,calc_ctg_cd,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_act_io_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_act_io_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_act_io_key
AS
SELECT *
FROM maw_act_io_key();

CREATE OR REPLACE FUNCTION maw_act_io_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_act_io_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_act_io_key$temp(
				ac_slip_typ varchar (5) NULL,
				prio numeric (4,0) NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_act_io_key_pk_ie ON maw_act_io_key$temp
				USING BTREE (ac_slip_typ,prio,calc_ctg_cd,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_act_io_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_act_io_key$temp(
			ac_slip_typ,
			prio,
			calc_ctg_cd,
			wg_cd,
			st_dt
		)VALUES (
			NEW.ac_slip_typ,
			NEW.prio,
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_act_io_key$temp
		SET 
			ac_slip_typ = NEW.ac_slip_typ,
			prio = NEW.prio,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (prio = OLD.prio OR prio IS NULL AND OLD.prio IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_act_io_key$temp
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (prio = OLD.prio OR prio IS NULL AND OLD.prio IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_act_io_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_act_io_key
FOR EACH ROW
EXECUTE PROCEDURE maw_act_io_key$func();
;

