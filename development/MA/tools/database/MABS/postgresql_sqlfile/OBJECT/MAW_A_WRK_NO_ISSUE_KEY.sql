\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_a_wrk_no_issue_key()
RETURNS TABLE (
	issue_typ varchar,
	dept_cd varchar,
	prod_cd varchar,
	ym varchar,
	ope_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_a_wrk_no_issue_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_a_wrk_no_issue_key$temp(
				issue_typ varchar (1) NULL,
				dept_cd varchar (1) NULL,
				prod_cd varchar (2) NULL,
				ym varchar (4) NULL,
				ope_typ varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_a_wrk_no_issue_key_pk_ie ON maw_a_wrk_no_issue_key$temp
				USING BTREE (issue_typ,dept_cd,prod_cd,ym,ope_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_a_wrk_no_issue_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_a_wrk_no_issue_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_a_wrk_no_issue_key
AS
SELECT *
FROM maw_a_wrk_no_issue_key();

CREATE OR REPLACE FUNCTION maw_a_wrk_no_issue_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_a_wrk_no_issue_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_a_wrk_no_issue_key$temp(
				issue_typ varchar (1) NULL,
				dept_cd varchar (1) NULL,
				prod_cd varchar (2) NULL,
				ym varchar (4) NULL,
				ope_typ varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_a_wrk_no_issue_key_pk_ie ON maw_a_wrk_no_issue_key$temp
				USING BTREE (issue_typ,dept_cd,prod_cd,ym,ope_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_a_wrk_no_issue_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_a_wrk_no_issue_key$temp(
			issue_typ,
			dept_cd,
			prod_cd,
			ym,
			ope_typ
		)VALUES (
			NEW.issue_typ,
			NEW.dept_cd,
			NEW.prod_cd,
			NEW.ym,
			NEW.ope_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_a_wrk_no_issue_key$temp
		SET 
			issue_typ = NEW.issue_typ,
			dept_cd = NEW.dept_cd,
			prod_cd = NEW.prod_cd,
			ym = NEW.ym,
			ope_typ = NEW.ope_typ
		WHERE 0=0
		AND (issue_typ = OLD.issue_typ OR issue_typ IS NULL AND OLD.issue_typ IS NULL)
		AND (dept_cd = OLD.dept_cd OR dept_cd IS NULL AND OLD.dept_cd IS NULL)
		AND (prod_cd = OLD.prod_cd OR prod_cd IS NULL AND OLD.prod_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (ope_typ = OLD.ope_typ OR ope_typ IS NULL AND OLD.ope_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_a_wrk_no_issue_key$temp
		WHERE 0=0
		AND (issue_typ = OLD.issue_typ OR issue_typ IS NULL AND OLD.issue_typ IS NULL)
		AND (dept_cd = OLD.dept_cd OR dept_cd IS NULL AND OLD.dept_cd IS NULL)
		AND (prod_cd = OLD.prod_cd OR prod_cd IS NULL AND OLD.prod_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (ope_typ = OLD.ope_typ OR ope_typ IS NULL AND OLD.ope_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_a_wrk_no_issue_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_a_wrk_no_issue_key
FOR EACH ROW
EXECUTE PROCEDURE maw_a_wrk_no_issue_key$func();
;

