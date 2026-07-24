\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_itm_spec_desc_key()
RETURNS TABLE (
	itm_spec_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	spec_cd varchar,
	spec_desc_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_spec_desc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_spec_desc_key$temp(
				itm_spec_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				spec_cd varchar (10) NULL,
				spec_desc_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_spec_desc_key_pk_ie ON maw_itm_spec_desc_key$temp
				USING BTREE (itm_spec_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,spec_cd,spec_desc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_spec_desc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_itm_spec_desc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_itm_spec_desc_key
AS
SELECT *
FROM maw_itm_spec_desc_key();

CREATE OR REPLACE FUNCTION maw_itm_spec_desc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_spec_desc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_spec_desc_key$temp(
				itm_spec_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				spec_cd varchar (10) NULL,
				spec_desc_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_spec_desc_key_pk_ie ON maw_itm_spec_desc_key$temp
				USING BTREE (itm_spec_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,spec_cd,spec_desc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_spec_desc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_itm_spec_desc_key$temp(
			itm_spec_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			spec_cd,
			spec_desc_cd
		)VALUES (
			NEW.itm_spec_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.spec_cd,
			NEW.spec_desc_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_itm_spec_desc_key$temp
		SET 
			itm_spec_grp_cd = NEW.itm_spec_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			spec_cd = NEW.spec_cd,
			spec_desc_cd = NEW.spec_desc_cd
		WHERE 0=0
		AND (itm_spec_grp_cd = OLD.itm_spec_grp_cd OR itm_spec_grp_cd IS NULL AND OLD.itm_spec_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (spec_cd = OLD.spec_cd OR spec_cd IS NULL AND OLD.spec_cd IS NULL)
		AND (spec_desc_cd = OLD.spec_desc_cd OR spec_desc_cd IS NULL AND OLD.spec_desc_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_itm_spec_desc_key$temp
		WHERE 0=0
		AND (itm_spec_grp_cd = OLD.itm_spec_grp_cd OR itm_spec_grp_cd IS NULL AND OLD.itm_spec_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (spec_cd = OLD.spec_cd OR spec_cd IS NULL AND OLD.spec_cd IS NULL)
		AND (spec_desc_cd = OLD.spec_desc_cd OR spec_desc_cd IS NULL AND OLD.spec_desc_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_itm_spec_desc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_itm_spec_desc_key
FOR EACH ROW
EXECUTE PROCEDURE maw_itm_spec_desc_key$func();
;

