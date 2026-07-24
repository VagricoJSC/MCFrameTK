\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_pln_alc_amt_rcv_key()
RETURNS TABLE (
	data_lno numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pln_alc_amt_rcv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pln_alc_amt_rcv_key$temp(
				data_lno numeric (15,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_pln_alc_amt_rcv_key_pk_ie ON mgw_pln_alc_amt_rcv_key$temp
				USING BTREE (data_lno);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pln_alc_amt_rcv_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_pln_alc_amt_rcv_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_pln_alc_amt_rcv_key
AS
SELECT *
FROM mgw_pln_alc_amt_rcv_key();

CREATE OR REPLACE FUNCTION mgw_pln_alc_amt_rcv_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pln_alc_amt_rcv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pln_alc_amt_rcv_key$temp(
				data_lno numeric (15,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_pln_alc_amt_rcv_key_pk_ie ON mgw_pln_alc_amt_rcv_key$temp
				USING BTREE (data_lno);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pln_alc_amt_rcv_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_pln_alc_amt_rcv_key$temp(
			data_lno
		)VALUES (
			NEW.data_lno
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_pln_alc_amt_rcv_key$temp
		SET 
			data_lno = NEW.data_lno
		WHERE 0=0
		AND (data_lno = OLD.data_lno OR data_lno IS NULL AND OLD.data_lno IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_pln_alc_amt_rcv_key$temp
		WHERE 0=0
		AND (data_lno = OLD.data_lno OR data_lno IS NULL AND OLD.data_lno IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_pln_alc_amt_rcv_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_pln_alc_amt_rcv_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_pln_alc_amt_rcv_key$func();
;

