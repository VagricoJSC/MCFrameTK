\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ctg_itm_ym()
RETURNS TABLE (
	ym timestamp(0),
	ctg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ctg_itm_ym$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ctg_itm_ym$temp(
				ym timestamp(0)  NOT NULL,
				ctg_cd varchar (20) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ctg_itm_ym_ie01 ON maw_ctg_itm_ym$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3);
			ALTER TABLE maw_ctg_itm_ym$temp
			ADD CONSTRAINT maw_ctg_itm_ym_pk PRIMARY KEY(ym,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ctg_itm_ym$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ctg_itm_ym$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ctg_itm_ym
AS
SELECT *
FROM maw_ctg_itm_ym();
ALTER VIEW maw_ctg_itm_ym ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_ctg_itm_ym ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_ctg_itm_ym ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_ctg_itm_ym$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ctg_itm_ym$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ctg_itm_ym$temp(
				ym timestamp(0)  NOT NULL,
				ctg_cd varchar (20) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ctg_itm_ym_ie01 ON maw_ctg_itm_ym$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3);
			ALTER TABLE maw_ctg_itm_ym$temp
			ADD CONSTRAINT maw_ctg_itm_ym_pk PRIMARY KEY(ym,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ctg_itm_ym$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ctg_itm_ym$temp(
			ym,
			ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.ym,
			NEW.ctg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ctg_itm_ym$temp
		SET 
			ym = NEW.ym,
			ctg_cd = NEW.ctg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND ym = OLD.ym
		AND ctg_cd = OLD.ctg_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ctg_itm_ym$temp
		WHERE 0=0
		AND ym = OLD.ym
		AND ctg_cd = OLD.ctg_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ctg_itm_ym$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ctg_itm_ym
FOR EACH ROW
EXECUTE PROCEDURE maw_ctg_itm_ym$func();
;

