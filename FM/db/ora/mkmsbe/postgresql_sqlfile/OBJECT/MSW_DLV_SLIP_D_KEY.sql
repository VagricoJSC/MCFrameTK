\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_dlv_slip_d_key()
RETURNS TABLE (
	dlv_slip_d_no varchar,
	dlv_slip_d_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dlv_slip_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dlv_slip_d_key$temp(
				dlv_slip_d_no varchar (15) NULL,
				dlv_slip_d_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_dlv_slip_d_key_pk_ie ON msw_dlv_slip_d_key$temp
				USING BTREE (dlv_slip_d_no,dlv_slip_d_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dlv_slip_d_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_dlv_slip_d_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_dlv_slip_d_key
AS
SELECT *
FROM msw_dlv_slip_d_key();

CREATE OR REPLACE FUNCTION msw_dlv_slip_d_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dlv_slip_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dlv_slip_d_key$temp(
				dlv_slip_d_no varchar (15) NULL,
				dlv_slip_d_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_dlv_slip_d_key_pk_ie ON msw_dlv_slip_d_key$temp
				USING BTREE (dlv_slip_d_no,dlv_slip_d_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dlv_slip_d_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_dlv_slip_d_key$temp(
			dlv_slip_d_no,
			dlv_slip_d_seq
		)VALUES (
			NEW.dlv_slip_d_no,
			NEW.dlv_slip_d_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_dlv_slip_d_key$temp
		SET 
			dlv_slip_d_no = NEW.dlv_slip_d_no,
			dlv_slip_d_seq = NEW.dlv_slip_d_seq
		WHERE 0=0
		AND (dlv_slip_d_no = OLD.dlv_slip_d_no OR dlv_slip_d_no IS NULL AND OLD.dlv_slip_d_no IS NULL)
		AND (dlv_slip_d_seq = OLD.dlv_slip_d_seq OR dlv_slip_d_seq IS NULL AND OLD.dlv_slip_d_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_dlv_slip_d_key$temp
		WHERE 0=0
		AND (dlv_slip_d_no = OLD.dlv_slip_d_no OR dlv_slip_d_no IS NULL AND OLD.dlv_slip_d_no IS NULL)
		AND (dlv_slip_d_seq = OLD.dlv_slip_d_seq OR dlv_slip_d_seq IS NULL AND OLD.dlv_slip_d_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_dlv_slip_d_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_dlv_slip_d_key
FOR EACH ROW
EXECUTE PROCEDURE msw_dlv_slip_d_key$func();
;

