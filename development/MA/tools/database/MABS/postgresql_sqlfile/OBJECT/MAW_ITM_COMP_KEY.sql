\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_itm_comp_key()
RETURNS TABLE (
	core_itm_cd varchar,
	core_itm_sub1 varchar,
	core_itm_sub2 varchar,
	core_itm_sub3 varchar,
	comp_itm_cd varchar,
	comp_itm_sub1 varchar,
	comp_itm_sub2 varchar,
	comp_itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_comp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_comp_key$temp(
				core_itm_cd varchar (40) NULL,
				core_itm_sub1 varchar (5) DEFAULT '*' NULL,
				core_itm_sub2 varchar (5) DEFAULT '*' NULL,
				core_itm_sub3 varchar (5) DEFAULT '*' NULL,
				comp_itm_cd varchar (40) NULL,
				comp_itm_sub1 varchar (5) DEFAULT '*' NULL,
				comp_itm_sub2 varchar (5) DEFAULT '*' NULL,
				comp_itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_comp_key_pk_ie ON maw_itm_comp_key$temp
				USING BTREE (core_itm_cd,core_itm_sub1,core_itm_sub2,core_itm_sub3,comp_itm_cd,comp_itm_sub1,comp_itm_sub2,comp_itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_comp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_itm_comp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_itm_comp_key
AS
SELECT *
FROM maw_itm_comp_key();
ALTER VIEW maw_itm_comp_key ALTER COLUMN core_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_itm_comp_key ALTER COLUMN core_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_itm_comp_key ALTER COLUMN core_itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_itm_comp_key ALTER COLUMN comp_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_itm_comp_key ALTER COLUMN comp_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_itm_comp_key ALTER COLUMN comp_itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_itm_comp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_comp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_comp_key$temp(
				core_itm_cd varchar (40) NULL,
				core_itm_sub1 varchar (5) DEFAULT '*' NULL,
				core_itm_sub2 varchar (5) DEFAULT '*' NULL,
				core_itm_sub3 varchar (5) DEFAULT '*' NULL,
				comp_itm_cd varchar (40) NULL,
				comp_itm_sub1 varchar (5) DEFAULT '*' NULL,
				comp_itm_sub2 varchar (5) DEFAULT '*' NULL,
				comp_itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_comp_key_pk_ie ON maw_itm_comp_key$temp
				USING BTREE (core_itm_cd,core_itm_sub1,core_itm_sub2,core_itm_sub3,comp_itm_cd,comp_itm_sub1,comp_itm_sub2,comp_itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_comp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_itm_comp_key$temp(
			core_itm_cd,
			core_itm_sub1,
			core_itm_sub2,
			core_itm_sub3,
			comp_itm_cd,
			comp_itm_sub1,
			comp_itm_sub2,
			comp_itm_sub3
		)VALUES (
			NEW.core_itm_cd,
			NEW.core_itm_sub1,
			NEW.core_itm_sub2,
			NEW.core_itm_sub3,
			NEW.comp_itm_cd,
			NEW.comp_itm_sub1,
			NEW.comp_itm_sub2,
			NEW.comp_itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_itm_comp_key$temp
		SET 
			core_itm_cd = NEW.core_itm_cd,
			core_itm_sub1 = NEW.core_itm_sub1,
			core_itm_sub2 = NEW.core_itm_sub2,
			core_itm_sub3 = NEW.core_itm_sub3,
			comp_itm_cd = NEW.comp_itm_cd,
			comp_itm_sub1 = NEW.comp_itm_sub1,
			comp_itm_sub2 = NEW.comp_itm_sub2,
			comp_itm_sub3 = NEW.comp_itm_sub3
		WHERE 0=0
		AND (core_itm_cd = OLD.core_itm_cd OR core_itm_cd IS NULL AND OLD.core_itm_cd IS NULL)
		AND (core_itm_sub1 = OLD.core_itm_sub1 OR core_itm_sub1 IS NULL AND OLD.core_itm_sub1 IS NULL)
		AND (core_itm_sub2 = OLD.core_itm_sub2 OR core_itm_sub2 IS NULL AND OLD.core_itm_sub2 IS NULL)
		AND (core_itm_sub3 = OLD.core_itm_sub3 OR core_itm_sub3 IS NULL AND OLD.core_itm_sub3 IS NULL)
		AND (comp_itm_cd = OLD.comp_itm_cd OR comp_itm_cd IS NULL AND OLD.comp_itm_cd IS NULL)
		AND (comp_itm_sub1 = OLD.comp_itm_sub1 OR comp_itm_sub1 IS NULL AND OLD.comp_itm_sub1 IS NULL)
		AND (comp_itm_sub2 = OLD.comp_itm_sub2 OR comp_itm_sub2 IS NULL AND OLD.comp_itm_sub2 IS NULL)
		AND (comp_itm_sub3 = OLD.comp_itm_sub3 OR comp_itm_sub3 IS NULL AND OLD.comp_itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_itm_comp_key$temp
		WHERE 0=0
		AND (core_itm_cd = OLD.core_itm_cd OR core_itm_cd IS NULL AND OLD.core_itm_cd IS NULL)
		AND (core_itm_sub1 = OLD.core_itm_sub1 OR core_itm_sub1 IS NULL AND OLD.core_itm_sub1 IS NULL)
		AND (core_itm_sub2 = OLD.core_itm_sub2 OR core_itm_sub2 IS NULL AND OLD.core_itm_sub2 IS NULL)
		AND (core_itm_sub3 = OLD.core_itm_sub3 OR core_itm_sub3 IS NULL AND OLD.core_itm_sub3 IS NULL)
		AND (comp_itm_cd = OLD.comp_itm_cd OR comp_itm_cd IS NULL AND OLD.comp_itm_cd IS NULL)
		AND (comp_itm_sub1 = OLD.comp_itm_sub1 OR comp_itm_sub1 IS NULL AND OLD.comp_itm_sub1 IS NULL)
		AND (comp_itm_sub2 = OLD.comp_itm_sub2 OR comp_itm_sub2 IS NULL AND OLD.comp_itm_sub2 IS NULL)
		AND (comp_itm_sub3 = OLD.comp_itm_sub3 OR comp_itm_sub3 IS NULL AND OLD.comp_itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_itm_comp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_itm_comp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_itm_comp_key$func();
;

