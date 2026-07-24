\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mly_rqmt_key()
RETURNS TABLE (
	ym timestamp(0),
	prod_ym timestamp(0),
	mps_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mly_rqmt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mly_rqmt_key$temp(
				ym timestamp(0)  NULL,
				prod_ym timestamp(0)  NULL,
				mps_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mly_rqmt_key_pk_ie ON msw_mly_rqmt_key$temp
				USING BTREE (ym,prod_ym,mps_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mly_rqmt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mly_rqmt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mly_rqmt_key
AS
SELECT *
FROM msw_mly_rqmt_key();
ALTER VIEW msw_mly_rqmt_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_mly_rqmt_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_mly_rqmt_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_mly_rqmt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mly_rqmt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mly_rqmt_key$temp(
				ym timestamp(0)  NULL,
				prod_ym timestamp(0)  NULL,
				mps_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mly_rqmt_key_pk_ie ON msw_mly_rqmt_key$temp
				USING BTREE (ym,prod_ym,mps_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mly_rqmt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mly_rqmt_key$temp(
			ym,
			prod_ym,
			mps_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.ym,
			NEW.prod_ym,
			NEW.mps_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mly_rqmt_key$temp
		SET 
			ym = NEW.ym,
			prod_ym = NEW.prod_ym,
			mps_grp_cd = NEW.mps_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (prod_ym = OLD.prod_ym OR prod_ym IS NULL AND OLD.prod_ym IS NULL)
		AND (mps_grp_cd = OLD.mps_grp_cd OR mps_grp_cd IS NULL AND OLD.mps_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mly_rqmt_key$temp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (prod_ym = OLD.prod_ym OR prod_ym IS NULL AND OLD.prod_ym IS NULL)
		AND (mps_grp_cd = OLD.mps_grp_cd OR mps_grp_cd IS NULL AND OLD.mps_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mly_rqmt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mly_rqmt_key
FOR EACH ROW
EXECUTE PROCEDURE msw_mly_rqmt_key$func();
;

