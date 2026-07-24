\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ctg_ctg_ym()
RETURNS TABLE (
	ym timestamp(0),
	par_ctg_cd varchar,
	ctg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ctg_ctg_ym$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ctg_ctg_ym$temp(
				ym timestamp(0)  NOT NULL,
				par_ctg_cd varchar (20) NOT NULL,
				ctg_cd varchar (20) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ctg_ctg_ym_ie01 ON maw_ctg_ctg_ym$temp
				USING BTREE (ctg_cd);
			ALTER TABLE maw_ctg_ctg_ym$temp
			ADD CONSTRAINT maw_ctg_ctg_ym_pk PRIMARY KEY(ym,par_ctg_cd,ctg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ctg_ctg_ym$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ctg_ctg_ym$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ctg_ctg_ym
AS
SELECT *
FROM maw_ctg_ctg_ym();

CREATE OR REPLACE FUNCTION maw_ctg_ctg_ym$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ctg_ctg_ym$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ctg_ctg_ym$temp(
				ym timestamp(0)  NOT NULL,
				par_ctg_cd varchar (20) NOT NULL,
				ctg_cd varchar (20) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ctg_ctg_ym_ie01 ON maw_ctg_ctg_ym$temp
				USING BTREE (ctg_cd);
			ALTER TABLE maw_ctg_ctg_ym$temp
			ADD CONSTRAINT maw_ctg_ctg_ym_pk PRIMARY KEY(ym,par_ctg_cd,ctg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ctg_ctg_ym$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ctg_ctg_ym$temp(
			ym,
			par_ctg_cd,
			ctg_cd
		)VALUES (
			NEW.ym,
			NEW.par_ctg_cd,
			NEW.ctg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ctg_ctg_ym$temp
		SET 
			ym = NEW.ym,
			par_ctg_cd = NEW.par_ctg_cd,
			ctg_cd = NEW.ctg_cd
		WHERE 0=0
		AND ym = OLD.ym
		AND par_ctg_cd = OLD.par_ctg_cd
		AND ctg_cd = OLD.ctg_cd;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ctg_ctg_ym$temp
		WHERE 0=0
		AND ym = OLD.ym
		AND par_ctg_cd = OLD.par_ctg_cd
		AND ctg_cd = OLD.ctg_cd;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ctg_ctg_ym$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ctg_ctg_ym
FOR EACH ROW
EXECUTE PROCEDURE maw_ctg_ctg_ym$func();
;

