\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_bill()
RETURNS TABLE (
	bill_mng_no varchar,
	bcst_cd varchar,
	bill_dpt_cd varchar,
	bill_cl_dt timestamp(0),
	iv_no varchar,
	trd_cur_cd varchar,
	bill_xrate numeric,
	wrk_no varchar,
	inpt_bill_cl_dt timestamp(0),
	inpt_rcv_schd_dt timestamp(0),
	dat_cntr numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill$temp(
				bill_mng_no varchar (15) NOT NULL,
				bcst_cd varchar (20) NOT NULL,
				bill_dpt_cd varchar (20) NOT NULL,
				bill_cl_dt timestamp(0)  NOT NULL,
				iv_no varchar (15) NOT NULL,
				trd_cur_cd varchar (3) NOT NULL,
				bill_xrate numeric (21,8) NULL,
				wrk_no varchar (15) NULL,
				inpt_bill_cl_dt timestamp(0)  NULL,
				inpt_rcv_schd_dt timestamp(0)  NULL,
				dat_cntr numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_bill$temp
			ADD CONSTRAINT msw_bill_pk PRIMARY KEY(bill_mng_no);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_bill$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_bill
AS
SELECT *
FROM msw_bill();

CREATE OR REPLACE FUNCTION msw_bill$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill$temp(
				bill_mng_no varchar (15) NOT NULL,
				bcst_cd varchar (20) NOT NULL,
				bill_dpt_cd varchar (20) NOT NULL,
				bill_cl_dt timestamp(0)  NOT NULL,
				iv_no varchar (15) NOT NULL,
				trd_cur_cd varchar (3) NOT NULL,
				bill_xrate numeric (21,8) NULL,
				wrk_no varchar (15) NULL,
				inpt_bill_cl_dt timestamp(0)  NULL,
				inpt_rcv_schd_dt timestamp(0)  NULL,
				dat_cntr numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_bill$temp
			ADD CONSTRAINT msw_bill_pk PRIMARY KEY(bill_mng_no);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_bill$temp(
			bill_mng_no,
			bcst_cd,
			bill_dpt_cd,
			bill_cl_dt,
			iv_no,
			trd_cur_cd,
			bill_xrate,
			wrk_no,
			inpt_bill_cl_dt,
			inpt_rcv_schd_dt,
			dat_cntr
		)VALUES (
			NEW.bill_mng_no,
			NEW.bcst_cd,
			NEW.bill_dpt_cd,
			NEW.bill_cl_dt,
			NEW.iv_no,
			NEW.trd_cur_cd,
			NEW.bill_xrate,
			NEW.wrk_no,
			NEW.inpt_bill_cl_dt,
			NEW.inpt_rcv_schd_dt,
			NEW.dat_cntr
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_bill$temp
		SET 
			bill_mng_no = NEW.bill_mng_no,
			bcst_cd = NEW.bcst_cd,
			bill_dpt_cd = NEW.bill_dpt_cd,
			bill_cl_dt = NEW.bill_cl_dt,
			iv_no = NEW.iv_no,
			trd_cur_cd = NEW.trd_cur_cd,
			bill_xrate = NEW.bill_xrate,
			wrk_no = NEW.wrk_no,
			inpt_bill_cl_dt = NEW.inpt_bill_cl_dt,
			inpt_rcv_schd_dt = NEW.inpt_rcv_schd_dt,
			dat_cntr = NEW.dat_cntr
		WHERE 0=0
		AND bill_mng_no = OLD.bill_mng_no
		AND bcst_cd = OLD.bcst_cd
		AND bill_dpt_cd = OLD.bill_dpt_cd
		AND bill_cl_dt = OLD.bill_cl_dt
		AND iv_no = OLD.iv_no
		AND trd_cur_cd = OLD.trd_cur_cd
		AND (bill_xrate = OLD.bill_xrate OR bill_xrate IS NULL AND OLD.bill_xrate IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (inpt_bill_cl_dt = OLD.inpt_bill_cl_dt OR inpt_bill_cl_dt IS NULL AND OLD.inpt_bill_cl_dt IS NULL)
		AND (inpt_rcv_schd_dt = OLD.inpt_rcv_schd_dt OR inpt_rcv_schd_dt IS NULL AND OLD.inpt_rcv_schd_dt IS NULL)
		AND (dat_cntr = OLD.dat_cntr OR dat_cntr IS NULL AND OLD.dat_cntr IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_bill$temp
		WHERE 0=0
		AND bill_mng_no = OLD.bill_mng_no
		AND bcst_cd = OLD.bcst_cd
		AND bill_dpt_cd = OLD.bill_dpt_cd
		AND bill_cl_dt = OLD.bill_cl_dt
		AND iv_no = OLD.iv_no
		AND trd_cur_cd = OLD.trd_cur_cd
		AND (bill_xrate = OLD.bill_xrate OR bill_xrate IS NULL AND OLD.bill_xrate IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (inpt_bill_cl_dt = OLD.inpt_bill_cl_dt OR inpt_bill_cl_dt IS NULL AND OLD.inpt_bill_cl_dt IS NULL)
		AND (inpt_rcv_schd_dt = OLD.inpt_rcv_schd_dt OR inpt_rcv_schd_dt IS NULL AND OLD.inpt_rcv_schd_dt IS NULL)
		AND (dat_cntr = OLD.dat_cntr OR dat_cntr IS NULL AND OLD.dat_cntr IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_bill$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_bill
FOR EACH ROW
EXECUTE PROCEDURE msw_bill$func();
;

