\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_upri_cnf()
RETURNS TABLE (
	peg_no numeric,
	mst_nm varchar,
	row_id varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_upri_cnf$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_upri_cnf$temp(
				peg_no numeric (9,0) NOT NULL,
				mst_nm varchar (30) NOT NULL,
				row_id varchar (20) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_upri_cnf$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_upri_cnf$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_upri_cnf
AS
SELECT *
FROM maw_upri_cnf();

CREATE OR REPLACE FUNCTION maw_upri_cnf$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_upri_cnf$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_upri_cnf$temp(
				peg_no numeric (9,0) NOT NULL,
				mst_nm varchar (30) NOT NULL,
				row_id varchar (20) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_upri_cnf$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_upri_cnf$temp(
			peg_no,
			mst_nm,
			row_id
		)VALUES (
			NEW.peg_no,
			NEW.mst_nm,
			NEW.row_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_upri_cnf$temp
		SET 
			peg_no = NEW.peg_no,
			mst_nm = NEW.mst_nm,
			row_id = NEW.row_id
		WHERE 0=0
		AND peg_no = OLD.peg_no
		AND mst_nm = OLD.mst_nm
		AND row_id = OLD.row_id;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_upri_cnf$temp
		WHERE 0=0
		AND peg_no = OLD.peg_no
		AND mst_nm = OLD.mst_nm
		AND row_id = OLD.row_id;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_upri_cnf$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_upri_cnf
FOR EACH ROW
EXECUTE PROCEDURE maw_upri_cnf$func();
;

