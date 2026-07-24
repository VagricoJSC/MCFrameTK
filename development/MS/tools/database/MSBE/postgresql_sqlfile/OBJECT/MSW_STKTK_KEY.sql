\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_stktk_key()
RETURNS TABLE (
	ctrl_tgt_dt timestamp(0),
	loc_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	stktk_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_stktk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_stktk_key$temp(
				ctrl_tgt_dt timestamp(0)  NULL,
				loc_cd varchar (20) NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				stktk_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_stktk_key_pk_ie ON msw_stktk_key$temp
				USING BTREE (ctrl_tgt_dt,loc_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,stktk_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_stktk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_stktk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_stktk_key
AS
SELECT *
FROM msw_stktk_key();
ALTER VIEW msw_stktk_key ALTER COLUMN itm_cd SET DEFAULT '*';
ALTER VIEW msw_stktk_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_stktk_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_stktk_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_stktk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_stktk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_stktk_key$temp(
				ctrl_tgt_dt timestamp(0)  NULL,
				loc_cd varchar (20) NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				stktk_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_stktk_key_pk_ie ON msw_stktk_key$temp
				USING BTREE (ctrl_tgt_dt,loc_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,stktk_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_stktk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_stktk_key$temp(
			ctrl_tgt_dt,
			loc_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			stktk_typ
		)VALUES (
			NEW.ctrl_tgt_dt,
			NEW.loc_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.stktk_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_stktk_key$temp
		SET 
			ctrl_tgt_dt = NEW.ctrl_tgt_dt,
			loc_cd = NEW.loc_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			stktk_typ = NEW.stktk_typ
		WHERE 0=0
		AND (ctrl_tgt_dt = OLD.ctrl_tgt_dt OR ctrl_tgt_dt IS NULL AND OLD.ctrl_tgt_dt IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (stktk_typ = OLD.stktk_typ OR stktk_typ IS NULL AND OLD.stktk_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_stktk_key$temp
		WHERE 0=0
		AND (ctrl_tgt_dt = OLD.ctrl_tgt_dt OR ctrl_tgt_dt IS NULL AND OLD.ctrl_tgt_dt IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (stktk_typ = OLD.stktk_typ OR stktk_typ IS NULL AND OLD.stktk_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_stktk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_stktk_key
FOR EACH ROW
EXECUTE PROCEDURE msw_stktk_key$func();
;

