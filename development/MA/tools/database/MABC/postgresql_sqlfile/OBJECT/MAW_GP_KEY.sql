\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_gp_key()
RETURNS TABLE (
	gp_grp_cd varchar,
	key1 varchar,
	key2 varchar,
	key3 varchar,
	key4 varchar,
	key5 varchar,
	key6 varchar,
	key7 varchar,
	key8 varchar,
	key9 varchar,
	key10 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_gp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_gp_key$temp(
				gp_grp_cd varchar (5) NULL,
				key1 varchar (20) DEFAULT '*' NULL,
				key2 varchar (20) DEFAULT '*' NULL,
				key3 varchar (20) DEFAULT '*' NULL,
				key4 varchar (20) DEFAULT '*' NULL,
				key5 varchar (20) DEFAULT '*' NULL,
				key6 varchar (20) DEFAULT '*' NULL,
				key7 varchar (20) DEFAULT '*' NULL,
				key8 varchar (20) DEFAULT '*' NULL,
				key9 varchar (20) DEFAULT '*' NULL,
				key10 varchar (20) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_gp_key_pk_ie ON maw_gp_key$temp
				USING BTREE (gp_grp_cd,key1,key2,key3,key4,key5,key6,key7,key8,key9,key10);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_gp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_gp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_gp_key
AS
SELECT *
FROM maw_gp_key();
ALTER VIEW maw_gp_key ALTER COLUMN key1 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key2 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key3 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key4 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key5 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key6 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key7 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key8 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key9 SET DEFAULT '*';
ALTER VIEW maw_gp_key ALTER COLUMN key10 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_gp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_gp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_gp_key$temp(
				gp_grp_cd varchar (5) NULL,
				key1 varchar (20) DEFAULT '*' NULL,
				key2 varchar (20) DEFAULT '*' NULL,
				key3 varchar (20) DEFAULT '*' NULL,
				key4 varchar (20) DEFAULT '*' NULL,
				key5 varchar (20) DEFAULT '*' NULL,
				key6 varchar (20) DEFAULT '*' NULL,
				key7 varchar (20) DEFAULT '*' NULL,
				key8 varchar (20) DEFAULT '*' NULL,
				key9 varchar (20) DEFAULT '*' NULL,
				key10 varchar (20) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_gp_key_pk_ie ON maw_gp_key$temp
				USING BTREE (gp_grp_cd,key1,key2,key3,key4,key5,key6,key7,key8,key9,key10);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_gp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_gp_key$temp(
			gp_grp_cd,
			key1,
			key2,
			key3,
			key4,
			key5,
			key6,
			key7,
			key8,
			key9,
			key10
		)VALUES (
			NEW.gp_grp_cd,
			NEW.key1,
			NEW.key2,
			NEW.key3,
			NEW.key4,
			NEW.key5,
			NEW.key6,
			NEW.key7,
			NEW.key8,
			NEW.key9,
			NEW.key10
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_gp_key$temp
		SET 
			gp_grp_cd = NEW.gp_grp_cd,
			key1 = NEW.key1,
			key2 = NEW.key2,
			key3 = NEW.key3,
			key4 = NEW.key4,
			key5 = NEW.key5,
			key6 = NEW.key6,
			key7 = NEW.key7,
			key8 = NEW.key8,
			key9 = NEW.key9,
			key10 = NEW.key10
		WHERE 0=0
		AND (gp_grp_cd = OLD.gp_grp_cd OR gp_grp_cd IS NULL AND OLD.gp_grp_cd IS NULL)
		AND (key1 = OLD.key1 OR key1 IS NULL AND OLD.key1 IS NULL)
		AND (key2 = OLD.key2 OR key2 IS NULL AND OLD.key2 IS NULL)
		AND (key3 = OLD.key3 OR key3 IS NULL AND OLD.key3 IS NULL)
		AND (key4 = OLD.key4 OR key4 IS NULL AND OLD.key4 IS NULL)
		AND (key5 = OLD.key5 OR key5 IS NULL AND OLD.key5 IS NULL)
		AND (key6 = OLD.key6 OR key6 IS NULL AND OLD.key6 IS NULL)
		AND (key7 = OLD.key7 OR key7 IS NULL AND OLD.key7 IS NULL)
		AND (key8 = OLD.key8 OR key8 IS NULL AND OLD.key8 IS NULL)
		AND (key9 = OLD.key9 OR key9 IS NULL AND OLD.key9 IS NULL)
		AND (key10 = OLD.key10 OR key10 IS NULL AND OLD.key10 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_gp_key$temp
		WHERE 0=0
		AND (gp_grp_cd = OLD.gp_grp_cd OR gp_grp_cd IS NULL AND OLD.gp_grp_cd IS NULL)
		AND (key1 = OLD.key1 OR key1 IS NULL AND OLD.key1 IS NULL)
		AND (key2 = OLD.key2 OR key2 IS NULL AND OLD.key2 IS NULL)
		AND (key3 = OLD.key3 OR key3 IS NULL AND OLD.key3 IS NULL)
		AND (key4 = OLD.key4 OR key4 IS NULL AND OLD.key4 IS NULL)
		AND (key5 = OLD.key5 OR key5 IS NULL AND OLD.key5 IS NULL)
		AND (key6 = OLD.key6 OR key6 IS NULL AND OLD.key6 IS NULL)
		AND (key7 = OLD.key7 OR key7 IS NULL AND OLD.key7 IS NULL)
		AND (key8 = OLD.key8 OR key8 IS NULL AND OLD.key8 IS NULL)
		AND (key9 = OLD.key9 OR key9 IS NULL AND OLD.key9 IS NULL)
		AND (key10 = OLD.key10 OR key10 IS NULL AND OLD.key10 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_gp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_gp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_gp_key$func();
;

