\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_grp_ctg_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	calc_ctg_typ varchar,
	calc_ctg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_grp_ctg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_grp_ctg_key$temp(
				calc_grp_cd varchar (10) NULL,
				calc_ctg_typ varchar (2) NULL,
				calc_ctg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_grp_ctg_key_pk_ie ON maw_grp_ctg_key$temp
				USING BTREE (calc_grp_cd,calc_ctg_typ,calc_ctg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_grp_ctg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_grp_ctg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_grp_ctg_key
AS
SELECT *
FROM maw_grp_ctg_key();

CREATE OR REPLACE FUNCTION maw_grp_ctg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_grp_ctg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_grp_ctg_key$temp(
				calc_grp_cd varchar (10) NULL,
				calc_ctg_typ varchar (2) NULL,
				calc_ctg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_grp_ctg_key_pk_ie ON maw_grp_ctg_key$temp
				USING BTREE (calc_grp_cd,calc_ctg_typ,calc_ctg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_grp_ctg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_grp_ctg_key$temp(
			calc_grp_cd,
			calc_ctg_typ,
			calc_ctg_cd
		)VALUES (
			NEW.calc_grp_cd,
			NEW.calc_ctg_typ,
			NEW.calc_ctg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_grp_ctg_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			calc_ctg_typ = NEW.calc_ctg_typ,
			calc_ctg_cd = NEW.calc_ctg_cd
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (calc_ctg_typ = OLD.calc_ctg_typ OR calc_ctg_typ IS NULL AND OLD.calc_ctg_typ IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_grp_ctg_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (calc_ctg_typ = OLD.calc_ctg_typ OR calc_ctg_typ IS NULL AND OLD.calc_ctg_typ IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_grp_ctg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_grp_ctg_key
FOR EACH ROW
EXECUTE PROCEDURE maw_grp_ctg_key$func();
;

