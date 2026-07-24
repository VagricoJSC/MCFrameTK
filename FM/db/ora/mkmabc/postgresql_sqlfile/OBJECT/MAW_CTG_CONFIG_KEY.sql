\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ctg_config_key()
RETURNS TABLE (
	par_ctg_cd varchar,
	ctg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ctg_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ctg_config_key$temp(
				par_ctg_cd varchar (20) NULL,
				ctg_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ctg_config_key_pk_ie ON maw_ctg_config_key$temp
				USING BTREE (par_ctg_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ctg_config_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ctg_config_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ctg_config_key
AS
SELECT *
FROM maw_ctg_config_key();

CREATE OR REPLACE FUNCTION maw_ctg_config_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ctg_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ctg_config_key$temp(
				par_ctg_cd varchar (20) NULL,
				ctg_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ctg_config_key_pk_ie ON maw_ctg_config_key$temp
				USING BTREE (par_ctg_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ctg_config_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ctg_config_key$temp(
			par_ctg_cd,
			ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			term
		)VALUES (
			NEW.par_ctg_cd,
			NEW.ctg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ctg_config_key$temp
		SET 
			par_ctg_cd = NEW.par_ctg_cd,
			ctg_cd = NEW.ctg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			term = NEW.term
		WHERE 0=0
		AND (par_ctg_cd = OLD.par_ctg_cd OR par_ctg_cd IS NULL AND OLD.par_ctg_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ctg_config_key$temp
		WHERE 0=0
		AND (par_ctg_cd = OLD.par_ctg_cd OR par_ctg_cd IS NULL AND OLD.par_ctg_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ctg_config_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ctg_config_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ctg_config_key$func();
;

