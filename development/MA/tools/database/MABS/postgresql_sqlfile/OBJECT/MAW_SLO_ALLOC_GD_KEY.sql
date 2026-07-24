\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_slo_alloc_gd_key()
RETURNS TABLE (
	cst_cd varchar,
	dlv_cd varchar,
	gd_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_slo_alloc_gd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_slo_alloc_gd_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				gd_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_slo_alloc_gd_key_pk_ie ON maw_slo_alloc_gd_key$temp
				USING BTREE (cst_cd,dlv_cd,gd_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_slo_alloc_gd_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_slo_alloc_gd_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_slo_alloc_gd_key
AS
SELECT *
FROM maw_slo_alloc_gd_key();
ALTER VIEW maw_slo_alloc_gd_key ALTER COLUMN dlv_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_slo_alloc_gd_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_slo_alloc_gd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_slo_alloc_gd_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				gd_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_slo_alloc_gd_key_pk_ie ON maw_slo_alloc_gd_key$temp
				USING BTREE (cst_cd,dlv_cd,gd_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_slo_alloc_gd_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_slo_alloc_gd_key$temp(
			cst_cd,
			dlv_cd,
			gd_cd
		)VALUES (
			NEW.cst_cd,
			NEW.dlv_cd,
			NEW.gd_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_slo_alloc_gd_key$temp
		SET 
			cst_cd = NEW.cst_cd,
			dlv_cd = NEW.dlv_cd,
			gd_cd = NEW.gd_cd
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_slo_alloc_gd_key$temp
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_slo_alloc_gd_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_slo_alloc_gd_key
FOR EACH ROW
EXECUTE PROCEDURE maw_slo_alloc_gd_key$func();
;

