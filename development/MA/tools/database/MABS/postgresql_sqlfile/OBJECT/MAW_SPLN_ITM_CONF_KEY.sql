\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_spln_itm_conf_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	spln_itm_cd varchar,
	dpt_cd varchar,
	st_ym timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_spln_itm_conf_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_spln_itm_conf_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				spln_itm_cd varchar (40) DEFAULT '*' NULL,
				dpt_cd varchar (20) DEFAULT '*' NULL,
				st_ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_spln_itm_conf_key_pk_ie ON maw_spln_itm_conf_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,spln_itm_cd,dpt_cd,st_ym);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_spln_itm_conf_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_spln_itm_conf_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_spln_itm_conf_key
AS
SELECT *
FROM maw_spln_itm_conf_key();
ALTER VIEW maw_spln_itm_conf_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_spln_itm_conf_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_spln_itm_conf_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_spln_itm_conf_key ALTER COLUMN spln_itm_cd SET DEFAULT '*';
ALTER VIEW maw_spln_itm_conf_key ALTER COLUMN dpt_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_spln_itm_conf_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_spln_itm_conf_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_spln_itm_conf_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				spln_itm_cd varchar (40) DEFAULT '*' NULL,
				dpt_cd varchar (20) DEFAULT '*' NULL,
				st_ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_spln_itm_conf_key_pk_ie ON maw_spln_itm_conf_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,spln_itm_cd,dpt_cd,st_ym);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_spln_itm_conf_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_spln_itm_conf_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			spln_itm_cd,
			dpt_cd,
			st_ym
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.spln_itm_cd,
			NEW.dpt_cd,
			NEW.st_ym
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_spln_itm_conf_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			spln_itm_cd = NEW.spln_itm_cd,
			dpt_cd = NEW.dpt_cd,
			st_ym = NEW.st_ym
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (spln_itm_cd = OLD.spln_itm_cd OR spln_itm_cd IS NULL AND OLD.spln_itm_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (st_ym = OLD.st_ym OR st_ym IS NULL AND OLD.st_ym IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_spln_itm_conf_key$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (spln_itm_cd = OLD.spln_itm_cd OR spln_itm_cd IS NULL AND OLD.spln_itm_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (st_ym = OLD.st_ym OR st_ym IS NULL AND OLD.st_ym IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_spln_itm_conf_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_spln_itm_conf_key
FOR EACH ROW
EXECUTE PROCEDURE maw_spln_itm_conf_key$func();
;

