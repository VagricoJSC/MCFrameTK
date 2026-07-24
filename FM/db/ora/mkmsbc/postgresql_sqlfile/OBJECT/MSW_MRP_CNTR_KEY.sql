\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mrp_cntr_key()
RETURNS TABLE (
	wg_cd varchar,
	mrp_cntr_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mrp_cntr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mrp_cntr_key$temp(
				wg_cd varchar (10) NULL,
				mrp_cntr_typ varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mrp_cntr_key_pk_ie ON msw_mrp_cntr_key$temp
				USING BTREE (wg_cd,mrp_cntr_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mrp_cntr_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mrp_cntr_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mrp_cntr_key
AS
SELECT *
FROM msw_mrp_cntr_key();

CREATE OR REPLACE FUNCTION msw_mrp_cntr_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mrp_cntr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mrp_cntr_key$temp(
				wg_cd varchar (10) NULL,
				mrp_cntr_typ varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mrp_cntr_key_pk_ie ON msw_mrp_cntr_key$temp
				USING BTREE (wg_cd,mrp_cntr_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mrp_cntr_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mrp_cntr_key$temp(
			wg_cd,
			mrp_cntr_typ
		)VALUES (
			NEW.wg_cd,
			NEW.mrp_cntr_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mrp_cntr_key$temp
		SET 
			wg_cd = NEW.wg_cd,
			mrp_cntr_typ = NEW.mrp_cntr_typ
		WHERE 0=0
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (mrp_cntr_typ = OLD.mrp_cntr_typ OR mrp_cntr_typ IS NULL AND OLD.mrp_cntr_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mrp_cntr_key$temp
		WHERE 0=0
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (mrp_cntr_typ = OLD.mrp_cntr_typ OR mrp_cntr_typ IS NULL AND OLD.mrp_cntr_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mrp_cntr_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mrp_cntr_key
FOR EACH ROW
EXECUTE PROCEDURE msw_mrp_cntr_key$func();
;

