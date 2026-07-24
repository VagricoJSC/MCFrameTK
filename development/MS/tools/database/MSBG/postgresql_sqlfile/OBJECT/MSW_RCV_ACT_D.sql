\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_rcv_act_d()
RETURNS TABLE (
	rcv_act_d_no varchar,
	rcv_act_d_seq numeric,
	rcv_act_no varchar,
	rcv_act_seq numeric,
	bill_mng_no varchar,
	dat_cntr numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_rcv_act_d$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_rcv_act_d$temp(
				rcv_act_d_no varchar (15) NOT NULL,
				rcv_act_d_seq numeric (4,0) NOT NULL,
				rcv_act_no varchar (15) NOT NULL,
				rcv_act_seq numeric (4,0) NOT NULL,
				bill_mng_no varchar (15) NOT NULL,
				dat_cntr numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_rcv_act_d$temp
			ADD CONSTRAINT msw_rcv_act_d_pk PRIMARY KEY(rcv_act_d_no,rcv_act_d_seq);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_rcv_act_d$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_rcv_act_d$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_rcv_act_d
AS
SELECT *
FROM msw_rcv_act_d();

CREATE OR REPLACE FUNCTION msw_rcv_act_d$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_rcv_act_d$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_rcv_act_d$temp(
				rcv_act_d_no varchar (15) NOT NULL,
				rcv_act_d_seq numeric (4,0) NOT NULL,
				rcv_act_no varchar (15) NOT NULL,
				rcv_act_seq numeric (4,0) NOT NULL,
				bill_mng_no varchar (15) NOT NULL,
				dat_cntr numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_rcv_act_d$temp
			ADD CONSTRAINT msw_rcv_act_d_pk PRIMARY KEY(rcv_act_d_no,rcv_act_d_seq);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_rcv_act_d$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_rcv_act_d$temp(
			rcv_act_d_no,
			rcv_act_d_seq,
			rcv_act_no,
			rcv_act_seq,
			bill_mng_no,
			dat_cntr
		)VALUES (
			NEW.rcv_act_d_no,
			NEW.rcv_act_d_seq,
			NEW.rcv_act_no,
			NEW.rcv_act_seq,
			NEW.bill_mng_no,
			NEW.dat_cntr
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_rcv_act_d$temp
		SET 
			rcv_act_d_no = NEW.rcv_act_d_no,
			rcv_act_d_seq = NEW.rcv_act_d_seq,
			rcv_act_no = NEW.rcv_act_no,
			rcv_act_seq = NEW.rcv_act_seq,
			bill_mng_no = NEW.bill_mng_no,
			dat_cntr = NEW.dat_cntr
		WHERE 0=0
		AND rcv_act_d_no = OLD.rcv_act_d_no
		AND rcv_act_d_seq = OLD.rcv_act_d_seq
		AND rcv_act_no = OLD.rcv_act_no
		AND rcv_act_seq = OLD.rcv_act_seq
		AND bill_mng_no = OLD.bill_mng_no
		AND (dat_cntr = OLD.dat_cntr OR dat_cntr IS NULL AND OLD.dat_cntr IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_rcv_act_d$temp
		WHERE 0=0
		AND rcv_act_d_no = OLD.rcv_act_d_no
		AND rcv_act_d_seq = OLD.rcv_act_d_seq
		AND rcv_act_no = OLD.rcv_act_no
		AND rcv_act_seq = OLD.rcv_act_seq
		AND bill_mng_no = OLD.bill_mng_no
		AND (dat_cntr = OLD.dat_cntr OR dat_cntr IS NULL AND OLD.dat_cntr IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_rcv_act_d$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_rcv_act_d
FOR EACH ROW
EXECUTE PROCEDURE msw_rcv_act_d$func();
;

