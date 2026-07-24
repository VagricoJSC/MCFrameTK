\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_set_itm_key()
RETURNS TABLE (
	set_grp_cd varchar,
	main_itm_cd varchar,
	main_itm_sub1 varchar,
	main_itm_sub2 varchar,
	main_itm_sub3 varchar,
	main_itm_unit_cd varchar,
	set_itm_cd varchar,
	set_itm_sub1 varchar,
	set_itm_sub2 varchar,
	set_itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_set_itm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_set_itm_key$temp(
				set_grp_cd varchar (10) NULL,
				main_itm_cd varchar (40) NULL,
				main_itm_sub1 varchar (5) DEFAULT '*' NULL,
				main_itm_sub2 varchar (5) DEFAULT '*' NULL,
				main_itm_sub3 varchar (5) DEFAULT '*' NULL,
				main_itm_unit_cd varchar (5) NULL,
				set_itm_cd varchar (40) NULL,
				set_itm_sub1 varchar (5) DEFAULT '*' NULL,
				set_itm_sub2 varchar (5) DEFAULT '*' NULL,
				set_itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_set_itm_key_pk_ie ON maw_set_itm_key$temp
				USING BTREE (set_grp_cd,main_itm_cd,main_itm_sub1,main_itm_sub2,main_itm_sub3,main_itm_unit_cd,set_itm_cd,set_itm_sub1,set_itm_sub2,set_itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_set_itm_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_set_itm_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_set_itm_key
AS
SELECT *
FROM maw_set_itm_key();
ALTER VIEW maw_set_itm_key ALTER COLUMN main_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_set_itm_key ALTER COLUMN main_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_set_itm_key ALTER COLUMN main_itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_set_itm_key ALTER COLUMN set_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_set_itm_key ALTER COLUMN set_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_set_itm_key ALTER COLUMN set_itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_set_itm_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_set_itm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_set_itm_key$temp(
				set_grp_cd varchar (10) NULL,
				main_itm_cd varchar (40) NULL,
				main_itm_sub1 varchar (5) DEFAULT '*' NULL,
				main_itm_sub2 varchar (5) DEFAULT '*' NULL,
				main_itm_sub3 varchar (5) DEFAULT '*' NULL,
				main_itm_unit_cd varchar (5) NULL,
				set_itm_cd varchar (40) NULL,
				set_itm_sub1 varchar (5) DEFAULT '*' NULL,
				set_itm_sub2 varchar (5) DEFAULT '*' NULL,
				set_itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_set_itm_key_pk_ie ON maw_set_itm_key$temp
				USING BTREE (set_grp_cd,main_itm_cd,main_itm_sub1,main_itm_sub2,main_itm_sub3,main_itm_unit_cd,set_itm_cd,set_itm_sub1,set_itm_sub2,set_itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_set_itm_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_set_itm_key$temp(
			set_grp_cd,
			main_itm_cd,
			main_itm_sub1,
			main_itm_sub2,
			main_itm_sub3,
			main_itm_unit_cd,
			set_itm_cd,
			set_itm_sub1,
			set_itm_sub2,
			set_itm_sub3
		)VALUES (
			NEW.set_grp_cd,
			NEW.main_itm_cd,
			NEW.main_itm_sub1,
			NEW.main_itm_sub2,
			NEW.main_itm_sub3,
			NEW.main_itm_unit_cd,
			NEW.set_itm_cd,
			NEW.set_itm_sub1,
			NEW.set_itm_sub2,
			NEW.set_itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_set_itm_key$temp
		SET 
			set_grp_cd = NEW.set_grp_cd,
			main_itm_cd = NEW.main_itm_cd,
			main_itm_sub1 = NEW.main_itm_sub1,
			main_itm_sub2 = NEW.main_itm_sub2,
			main_itm_sub3 = NEW.main_itm_sub3,
			main_itm_unit_cd = NEW.main_itm_unit_cd,
			set_itm_cd = NEW.set_itm_cd,
			set_itm_sub1 = NEW.set_itm_sub1,
			set_itm_sub2 = NEW.set_itm_sub2,
			set_itm_sub3 = NEW.set_itm_sub3
		WHERE 0=0
		AND (set_grp_cd = OLD.set_grp_cd OR set_grp_cd IS NULL AND OLD.set_grp_cd IS NULL)
		AND (main_itm_cd = OLD.main_itm_cd OR main_itm_cd IS NULL AND OLD.main_itm_cd IS NULL)
		AND (main_itm_sub1 = OLD.main_itm_sub1 OR main_itm_sub1 IS NULL AND OLD.main_itm_sub1 IS NULL)
		AND (main_itm_sub2 = OLD.main_itm_sub2 OR main_itm_sub2 IS NULL AND OLD.main_itm_sub2 IS NULL)
		AND (main_itm_sub3 = OLD.main_itm_sub3 OR main_itm_sub3 IS NULL AND OLD.main_itm_sub3 IS NULL)
		AND (main_itm_unit_cd = OLD.main_itm_unit_cd OR main_itm_unit_cd IS NULL AND OLD.main_itm_unit_cd IS NULL)
		AND (set_itm_cd = OLD.set_itm_cd OR set_itm_cd IS NULL AND OLD.set_itm_cd IS NULL)
		AND (set_itm_sub1 = OLD.set_itm_sub1 OR set_itm_sub1 IS NULL AND OLD.set_itm_sub1 IS NULL)
		AND (set_itm_sub2 = OLD.set_itm_sub2 OR set_itm_sub2 IS NULL AND OLD.set_itm_sub2 IS NULL)
		AND (set_itm_sub3 = OLD.set_itm_sub3 OR set_itm_sub3 IS NULL AND OLD.set_itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_set_itm_key$temp
		WHERE 0=0
		AND (set_grp_cd = OLD.set_grp_cd OR set_grp_cd IS NULL AND OLD.set_grp_cd IS NULL)
		AND (main_itm_cd = OLD.main_itm_cd OR main_itm_cd IS NULL AND OLD.main_itm_cd IS NULL)
		AND (main_itm_sub1 = OLD.main_itm_sub1 OR main_itm_sub1 IS NULL AND OLD.main_itm_sub1 IS NULL)
		AND (main_itm_sub2 = OLD.main_itm_sub2 OR main_itm_sub2 IS NULL AND OLD.main_itm_sub2 IS NULL)
		AND (main_itm_sub3 = OLD.main_itm_sub3 OR main_itm_sub3 IS NULL AND OLD.main_itm_sub3 IS NULL)
		AND (main_itm_unit_cd = OLD.main_itm_unit_cd OR main_itm_unit_cd IS NULL AND OLD.main_itm_unit_cd IS NULL)
		AND (set_itm_cd = OLD.set_itm_cd OR set_itm_cd IS NULL AND OLD.set_itm_cd IS NULL)
		AND (set_itm_sub1 = OLD.set_itm_sub1 OR set_itm_sub1 IS NULL AND OLD.set_itm_sub1 IS NULL)
		AND (set_itm_sub2 = OLD.set_itm_sub2 OR set_itm_sub2 IS NULL AND OLD.set_itm_sub2 IS NULL)
		AND (set_itm_sub3 = OLD.set_itm_sub3 OR set_itm_sub3 IS NULL AND OLD.set_itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_set_itm_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_set_itm_key
FOR EACH ROW
EXECUTE PROCEDURE maw_set_itm_key$func();
;

