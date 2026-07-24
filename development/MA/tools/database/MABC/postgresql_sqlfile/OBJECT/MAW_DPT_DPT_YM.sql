\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_dpt_dpt_ym()
RETURNS TABLE (
	ym timestamp(0),
	par_dpt_cd varchar,
	dpt_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_dpt_ym$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_dpt_ym$temp(
				ym timestamp(0)  NOT NULL,
				par_dpt_cd varchar (20) NOT NULL,
				dpt_cd varchar (20) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_dpt_ym_ie01 ON maw_dpt_dpt_ym$temp
				USING BTREE (dpt_cd);
			ALTER TABLE maw_dpt_dpt_ym$temp
			ADD CONSTRAINT maw_dpt_dpt_ym_pk PRIMARY KEY(ym,par_dpt_cd,dpt_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_dpt_ym$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_dpt_dpt_ym$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_dpt_dpt_ym
AS
SELECT *
FROM maw_dpt_dpt_ym();

CREATE OR REPLACE FUNCTION maw_dpt_dpt_ym$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_dpt_ym$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_dpt_ym$temp(
				ym timestamp(0)  NOT NULL,
				par_dpt_cd varchar (20) NOT NULL,
				dpt_cd varchar (20) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_dpt_ym_ie01 ON maw_dpt_dpt_ym$temp
				USING BTREE (dpt_cd);
			ALTER TABLE maw_dpt_dpt_ym$temp
			ADD CONSTRAINT maw_dpt_dpt_ym_pk PRIMARY KEY(ym,par_dpt_cd,dpt_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_dpt_ym$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_dpt_dpt_ym$temp(
			ym,
			par_dpt_cd,
			dpt_cd
		)VALUES (
			NEW.ym,
			NEW.par_dpt_cd,
			NEW.dpt_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_dpt_dpt_ym$temp
		SET 
			ym = NEW.ym,
			par_dpt_cd = NEW.par_dpt_cd,
			dpt_cd = NEW.dpt_cd
		WHERE 0=0
		AND ym = OLD.ym
		AND par_dpt_cd = OLD.par_dpt_cd
		AND dpt_cd = OLD.dpt_cd;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_dpt_dpt_ym$temp
		WHERE 0=0
		AND ym = OLD.ym
		AND par_dpt_cd = OLD.par_dpt_cd
		AND dpt_cd = OLD.dpt_cd;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_dpt_dpt_ym$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_dpt_dpt_ym
FOR EACH ROW
EXECUTE PROCEDURE maw_dpt_dpt_ym$func();
;

