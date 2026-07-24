\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_onr_prov_bal_key()
RETURNS TABLE (
	asppl_cd varchar,
	ap_dpt_cd varchar,
	ac_ym timestamp(0),
	trd_cur_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_onr_prov_bal_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_onr_prov_bal_key$temp(
				asppl_cd varchar (20) NULL,
				ap_dpt_cd varchar (20) NULL,
				ac_ym timestamp(0)  NULL,
				trd_cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_onr_prov_bal_key_pk_ie ON msw_onr_prov_bal_key$temp
				USING BTREE (asppl_cd,ap_dpt_cd,ac_ym,trd_cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_onr_prov_bal_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_onr_prov_bal_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_onr_prov_bal_key
AS
SELECT *
FROM msw_onr_prov_bal_key();

CREATE OR REPLACE FUNCTION msw_onr_prov_bal_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_onr_prov_bal_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_onr_prov_bal_key$temp(
				asppl_cd varchar (20) NULL,
				ap_dpt_cd varchar (20) NULL,
				ac_ym timestamp(0)  NULL,
				trd_cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_onr_prov_bal_key_pk_ie ON msw_onr_prov_bal_key$temp
				USING BTREE (asppl_cd,ap_dpt_cd,ac_ym,trd_cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_onr_prov_bal_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_onr_prov_bal_key$temp(
			asppl_cd,
			ap_dpt_cd,
			ac_ym,
			trd_cur_cd
		)VALUES (
			NEW.asppl_cd,
			NEW.ap_dpt_cd,
			NEW.ac_ym,
			NEW.trd_cur_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_onr_prov_bal_key$temp
		SET 
			asppl_cd = NEW.asppl_cd,
			ap_dpt_cd = NEW.ap_dpt_cd,
			ac_ym = NEW.ac_ym,
			trd_cur_cd = NEW.trd_cur_cd
		WHERE 0=0
		AND (asppl_cd = OLD.asppl_cd OR asppl_cd IS NULL AND OLD.asppl_cd IS NULL)
		AND (ap_dpt_cd = OLD.ap_dpt_cd OR ap_dpt_cd IS NULL AND OLD.ap_dpt_cd IS NULL)
		AND (ac_ym = OLD.ac_ym OR ac_ym IS NULL AND OLD.ac_ym IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_onr_prov_bal_key$temp
		WHERE 0=0
		AND (asppl_cd = OLD.asppl_cd OR asppl_cd IS NULL AND OLD.asppl_cd IS NULL)
		AND (ap_dpt_cd = OLD.ap_dpt_cd OR ap_dpt_cd IS NULL AND OLD.ap_dpt_cd IS NULL)
		AND (ac_ym = OLD.ac_ym OR ac_ym IS NULL AND OLD.ac_ym IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_onr_prov_bal_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_onr_prov_bal_key
FOR EACH ROW
EXECUTE PROCEDURE msw_onr_prov_bal_key$func();
;

