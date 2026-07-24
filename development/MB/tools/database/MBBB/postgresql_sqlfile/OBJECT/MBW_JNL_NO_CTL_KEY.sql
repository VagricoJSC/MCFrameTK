\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_jnl_no_ctl_key()
RETURNS TABLE (
	ac_ym timestamp(0),
	ac_if_typ varchar,
	slip_cnt_id varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_jnl_no_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_jnl_no_ctl_key$temp(
				ac_ym timestamp(0)  NULL,
				ac_if_typ varchar (1) NULL,
				slip_cnt_id varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_jnl_no_ctl_key_pk_ie ON mbw_jnl_no_ctl_key$temp
				USING BTREE (ac_ym,ac_if_typ,slip_cnt_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_jnl_no_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_jnl_no_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_jnl_no_ctl_key
AS
SELECT *
FROM mbw_jnl_no_ctl_key();

CREATE OR REPLACE FUNCTION mbw_jnl_no_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_jnl_no_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_jnl_no_ctl_key$temp(
				ac_ym timestamp(0)  NULL,
				ac_if_typ varchar (1) NULL,
				slip_cnt_id varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_jnl_no_ctl_key_pk_ie ON mbw_jnl_no_ctl_key$temp
				USING BTREE (ac_ym,ac_if_typ,slip_cnt_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_jnl_no_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_jnl_no_ctl_key$temp(
			ac_ym,
			ac_if_typ,
			slip_cnt_id
		)VALUES (
			NEW.ac_ym,
			NEW.ac_if_typ,
			NEW.slip_cnt_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_jnl_no_ctl_key$temp
		SET 
			ac_ym = NEW.ac_ym,
			ac_if_typ = NEW.ac_if_typ,
			slip_cnt_id = NEW.slip_cnt_id
		WHERE 0=0
		AND (ac_ym = OLD.ac_ym OR ac_ym IS NULL AND OLD.ac_ym IS NULL)
		AND (ac_if_typ = OLD.ac_if_typ OR ac_if_typ IS NULL AND OLD.ac_if_typ IS NULL)
		AND (slip_cnt_id = OLD.slip_cnt_id OR slip_cnt_id IS NULL AND OLD.slip_cnt_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_jnl_no_ctl_key$temp
		WHERE 0=0
		AND (ac_ym = OLD.ac_ym OR ac_ym IS NULL AND OLD.ac_ym IS NULL)
		AND (ac_if_typ = OLD.ac_if_typ OR ac_if_typ IS NULL AND OLD.ac_if_typ IS NULL)
		AND (slip_cnt_id = OLD.slip_cnt_id OR slip_cnt_id IS NULL AND OLD.slip_cnt_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_jnl_no_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_jnl_no_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_jnl_no_ctl_key$func();
;

