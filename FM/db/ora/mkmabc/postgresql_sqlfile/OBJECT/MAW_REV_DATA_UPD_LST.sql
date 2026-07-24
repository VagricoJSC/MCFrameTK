\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_rev_data_upd_lst()
RETURNS TABLE (
	rev_data_src_no varchar,
	rev_no numeric,
	rev_data_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rev_data_upd_lst$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rev_data_upd_lst$temp(
				rev_data_src_no varchar (15) NOT NULL,
				rev_no numeric (4,0) NOT NULL,
				rev_data_typ varchar (6) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rev_data_upd_lst$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_rev_data_upd_lst$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_rev_data_upd_lst
AS
SELECT *
FROM maw_rev_data_upd_lst();

CREATE OR REPLACE FUNCTION maw_rev_data_upd_lst$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rev_data_upd_lst$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rev_data_upd_lst$temp(
				rev_data_src_no varchar (15) NOT NULL,
				rev_no numeric (4,0) NOT NULL,
				rev_data_typ varchar (6) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rev_data_upd_lst$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_rev_data_upd_lst$temp(
			rev_data_src_no,
			rev_no,
			rev_data_typ
		)VALUES (
			NEW.rev_data_src_no,
			NEW.rev_no,
			NEW.rev_data_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_rev_data_upd_lst$temp
		SET 
			rev_data_src_no = NEW.rev_data_src_no,
			rev_no = NEW.rev_no,
			rev_data_typ = NEW.rev_data_typ
		WHERE 0=0
		AND rev_data_src_no = OLD.rev_data_src_no
		AND rev_no = OLD.rev_no
		AND rev_data_typ = OLD.rev_data_typ;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_rev_data_upd_lst$temp
		WHERE 0=0
		AND rev_data_src_no = OLD.rev_data_src_no
		AND rev_no = OLD.rev_no
		AND rev_data_typ = OLD.rev_data_typ;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_rev_data_upd_lst$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_rev_data_upd_lst
FOR EACH ROW
EXECUTE PROCEDURE maw_rev_data_upd_lst$func();
;

