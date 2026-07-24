\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_spln_sum_vers_key()
RETURNS TABLE (
	dpt_cd varchar,
	cst_cd varchar,
	wrk_no varchar,
	ym timestamp(0),
	spln_vers varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_sum_vers_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_sum_vers_key$temp(
				dpt_cd varchar (20) NULL,
				cst_cd varchar (20) DEFAULT '*' NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				ym timestamp(0)  NULL,
				spln_vers varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_sum_vers_key_pk_ie ON msw_spln_sum_vers_key$temp
				USING BTREE (dpt_cd,cst_cd,wrk_no,ym,spln_vers);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_sum_vers_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_spln_sum_vers_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_spln_sum_vers_key
AS
SELECT *
FROM msw_spln_sum_vers_key();
ALTER VIEW msw_spln_sum_vers_key ALTER COLUMN cst_cd SET DEFAULT '*';
ALTER VIEW msw_spln_sum_vers_key ALTER COLUMN wrk_no SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_spln_sum_vers_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_sum_vers_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_sum_vers_key$temp(
				dpt_cd varchar (20) NULL,
				cst_cd varchar (20) DEFAULT '*' NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				ym timestamp(0)  NULL,
				spln_vers varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_sum_vers_key_pk_ie ON msw_spln_sum_vers_key$temp
				USING BTREE (dpt_cd,cst_cd,wrk_no,ym,spln_vers);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_sum_vers_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_spln_sum_vers_key$temp(
			dpt_cd,
			cst_cd,
			wrk_no,
			ym,
			spln_vers
		)VALUES (
			NEW.dpt_cd,
			NEW.cst_cd,
			NEW.wrk_no,
			NEW.ym,
			NEW.spln_vers
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_spln_sum_vers_key$temp
		SET 
			dpt_cd = NEW.dpt_cd,
			cst_cd = NEW.cst_cd,
			wrk_no = NEW.wrk_no,
			ym = NEW.ym,
			spln_vers = NEW.spln_vers
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (spln_vers = OLD.spln_vers OR spln_vers IS NULL AND OLD.spln_vers IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_spln_sum_vers_key$temp
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (spln_vers = OLD.spln_vers OR spln_vers IS NULL AND OLD.spln_vers IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_spln_sum_vers_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_spln_sum_vers_key
FOR EACH ROW
EXECUTE PROCEDURE msw_spln_sum_vers_key$func();
;

