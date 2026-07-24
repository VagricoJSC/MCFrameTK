\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mrkt_judg_d_key()
RETURNS TABLE (
	mrkt_judg_d_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mrkt_judg_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mrkt_judg_d_key$temp(
				mrkt_judg_d_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mrkt_judg_d_key_pk_ie ON msw_mrkt_judg_d_key$temp
				USING BTREE (mrkt_judg_d_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mrkt_judg_d_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mrkt_judg_d_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mrkt_judg_d_key
AS
SELECT *
FROM msw_mrkt_judg_d_key();

CREATE OR REPLACE FUNCTION msw_mrkt_judg_d_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mrkt_judg_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mrkt_judg_d_key$temp(
				mrkt_judg_d_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mrkt_judg_d_key_pk_ie ON msw_mrkt_judg_d_key$temp
				USING BTREE (mrkt_judg_d_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mrkt_judg_d_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mrkt_judg_d_key$temp(
			mrkt_judg_d_no
		)VALUES (
			NEW.mrkt_judg_d_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mrkt_judg_d_key$temp
		SET 
			mrkt_judg_d_no = NEW.mrkt_judg_d_no
		WHERE 0=0
		AND (mrkt_judg_d_no = OLD.mrkt_judg_d_no OR mrkt_judg_d_no IS NULL AND OLD.mrkt_judg_d_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mrkt_judg_d_key$temp
		WHERE 0=0
		AND (mrkt_judg_d_no = OLD.mrkt_judg_d_no OR mrkt_judg_d_no IS NULL AND OLD.mrkt_judg_d_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mrkt_judg_d_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mrkt_judg_d_key
FOR EACH ROW
EXECUTE PROCEDURE msw_mrkt_judg_d_key$func();
;

