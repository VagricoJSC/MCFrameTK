\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_bill_d_sw_act_key()
RETURNS TABLE (
	rcv_act_d_no varchar,
	rcv_act_d_seq numeric,
	sw_bill_d_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_d_sw_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_d_sw_act_key$temp(
				rcv_act_d_no varchar (15) NULL,
				rcv_act_d_seq numeric (4,0) NULL,
				sw_bill_d_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_bill_d_sw_act_key_pk_ie ON msw_bill_d_sw_act_key$temp
				USING BTREE (rcv_act_d_no,rcv_act_d_seq,sw_bill_d_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_d_sw_act_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_bill_d_sw_act_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_bill_d_sw_act_key
AS
SELECT *
FROM msw_bill_d_sw_act_key();

CREATE OR REPLACE FUNCTION msw_bill_d_sw_act_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_d_sw_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_d_sw_act_key$temp(
				rcv_act_d_no varchar (15) NULL,
				rcv_act_d_seq numeric (4,0) NULL,
				sw_bill_d_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_bill_d_sw_act_key_pk_ie ON msw_bill_d_sw_act_key$temp
				USING BTREE (rcv_act_d_no,rcv_act_d_seq,sw_bill_d_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_d_sw_act_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_bill_d_sw_act_key$temp(
			rcv_act_d_no,
			rcv_act_d_seq,
			sw_bill_d_no
		)VALUES (
			NEW.rcv_act_d_no,
			NEW.rcv_act_d_seq,
			NEW.sw_bill_d_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_bill_d_sw_act_key$temp
		SET 
			rcv_act_d_no = NEW.rcv_act_d_no,
			rcv_act_d_seq = NEW.rcv_act_d_seq,
			sw_bill_d_no = NEW.sw_bill_d_no
		WHERE 0=0
		AND (rcv_act_d_no = OLD.rcv_act_d_no OR rcv_act_d_no IS NULL AND OLD.rcv_act_d_no IS NULL)
		AND (rcv_act_d_seq = OLD.rcv_act_d_seq OR rcv_act_d_seq IS NULL AND OLD.rcv_act_d_seq IS NULL)
		AND (sw_bill_d_no = OLD.sw_bill_d_no OR sw_bill_d_no IS NULL AND OLD.sw_bill_d_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_bill_d_sw_act_key$temp
		WHERE 0=0
		AND (rcv_act_d_no = OLD.rcv_act_d_no OR rcv_act_d_no IS NULL AND OLD.rcv_act_d_no IS NULL)
		AND (rcv_act_d_seq = OLD.rcv_act_d_seq OR rcv_act_d_seq IS NULL AND OLD.rcv_act_d_seq IS NULL)
		AND (sw_bill_d_no = OLD.sw_bill_d_no OR sw_bill_d_no IS NULL AND OLD.sw_bill_d_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_bill_d_sw_act_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_bill_d_sw_act_key
FOR EACH ROW
EXECUTE PROCEDURE msw_bill_d_sw_act_key$func();
;

