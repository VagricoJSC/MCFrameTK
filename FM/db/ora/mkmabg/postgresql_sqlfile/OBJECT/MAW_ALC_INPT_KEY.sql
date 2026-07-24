\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alc_inpt_key()
RETURNS TABLE (
	alc_ptn_cd varchar,
	ctg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_inpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_inpt_key$temp(
				alc_ptn_cd varchar (10) NULL,
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
			CREATE INDEX maw_alc_inpt_key_pk_ie ON maw_alc_inpt_key$temp
				USING BTREE (alc_ptn_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_inpt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alc_inpt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alc_inpt_key
AS
SELECT *
FROM maw_alc_inpt_key();

CREATE OR REPLACE FUNCTION maw_alc_inpt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_inpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_inpt_key$temp(
				alc_ptn_cd varchar (10) NULL,
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
			CREATE INDEX maw_alc_inpt_key_pk_ie ON maw_alc_inpt_key$temp
				USING BTREE (alc_ptn_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_inpt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alc_inpt_key$temp(
			alc_ptn_cd,
			ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			term
		)VALUES (
			NEW.alc_ptn_cd,
			NEW.ctg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alc_inpt_key$temp
		SET 
			alc_ptn_cd = NEW.alc_ptn_cd,
			ctg_cd = NEW.ctg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			term = NEW.term
		WHERE 0=0
		AND (alc_ptn_cd = OLD.alc_ptn_cd OR alc_ptn_cd IS NULL AND OLD.alc_ptn_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alc_inpt_key$temp
		WHERE 0=0
		AND (alc_ptn_cd = OLD.alc_ptn_cd OR alc_ptn_cd IS NULL AND OLD.alc_ptn_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alc_inpt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alc_inpt_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alc_inpt_key$func();
;

