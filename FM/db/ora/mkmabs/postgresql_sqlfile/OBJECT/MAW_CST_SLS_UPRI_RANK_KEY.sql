\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cst_sls_upri_rank_key()
RETURNS TABLE (
	cst_cd varchar,
	dlv_cd varchar,
	dest_cd1 varchar,
	dest_cd2 varchar,
	dest_cd3 varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cst_sls_upri_rank_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cst_sls_upri_rank_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				dest_cd1 varchar (20) DEFAULT '*' NULL,
				dest_cd2 varchar (20) DEFAULT '*' NULL,
				dest_cd3 varchar (20) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cst_sls_upri_rank_key_pk_ie ON maw_cst_sls_upri_rank_key$temp
				USING BTREE (cst_cd,dlv_cd,dest_cd1,dest_cd2,dest_cd3,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cst_sls_upri_rank_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cst_sls_upri_rank_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cst_sls_upri_rank_key
AS
SELECT *
FROM maw_cst_sls_upri_rank_key();
ALTER VIEW maw_cst_sls_upri_rank_key ALTER COLUMN dlv_cd SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_rank_key ALTER COLUMN dest_cd1 SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_rank_key ALTER COLUMN dest_cd2 SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_rank_key ALTER COLUMN dest_cd3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_cst_sls_upri_rank_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cst_sls_upri_rank_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cst_sls_upri_rank_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				dest_cd1 varchar (20) DEFAULT '*' NULL,
				dest_cd2 varchar (20) DEFAULT '*' NULL,
				dest_cd3 varchar (20) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cst_sls_upri_rank_key_pk_ie ON maw_cst_sls_upri_rank_key$temp
				USING BTREE (cst_cd,dlv_cd,dest_cd1,dest_cd2,dest_cd3,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cst_sls_upri_rank_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cst_sls_upri_rank_key$temp(
			cst_cd,
			dlv_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			st_dt
		)VALUES (
			NEW.cst_cd,
			NEW.dlv_cd,
			NEW.dest_cd1,
			NEW.dest_cd2,
			NEW.dest_cd3,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cst_sls_upri_rank_key$temp
		SET 
			cst_cd = NEW.cst_cd,
			dlv_cd = NEW.dlv_cd,
			dest_cd1 = NEW.dest_cd1,
			dest_cd2 = NEW.dest_cd2,
			dest_cd3 = NEW.dest_cd3,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (dest_cd1 = OLD.dest_cd1 OR dest_cd1 IS NULL AND OLD.dest_cd1 IS NULL)
		AND (dest_cd2 = OLD.dest_cd2 OR dest_cd2 IS NULL AND OLD.dest_cd2 IS NULL)
		AND (dest_cd3 = OLD.dest_cd3 OR dest_cd3 IS NULL AND OLD.dest_cd3 IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cst_sls_upri_rank_key$temp
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (dest_cd1 = OLD.dest_cd1 OR dest_cd1 IS NULL AND OLD.dest_cd1 IS NULL)
		AND (dest_cd2 = OLD.dest_cd2 OR dest_cd2 IS NULL AND OLD.dest_cd2 IS NULL)
		AND (dest_cd3 = OLD.dest_cd3 OR dest_cd3 IS NULL AND OLD.dest_cd3 IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cst_sls_upri_rank_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cst_sls_upri_rank_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cst_sls_upri_rank_key$func();
;

