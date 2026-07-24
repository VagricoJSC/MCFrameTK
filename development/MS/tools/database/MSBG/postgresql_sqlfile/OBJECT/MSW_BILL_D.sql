\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_bill_d()
RETURNS TABLE (
	bill_d_no varchar,
	bill_mng_no varchar,
	cl_flg char,
	dat_cntr numeric,
	bill_mtd_typ varchar,
	amt numeric,
	tax_amt numeric,
	bill_prnt_tgt_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_d$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_d$temp(
				bill_d_no varchar (15) NOT NULL,
				bill_mng_no varchar (15) NOT NULL,
				cl_flg char (1) NOT NULL,
				dat_cntr numeric (9,0) NULL,
				bill_mtd_typ varchar (1) NULL,
				amt numeric (21,8) NULL,
				tax_amt numeric (21,8) NULL,
				bill_prnt_tgt_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_bill_d$temp
			ADD CONSTRAINT msw_bill_d_pk PRIMARY KEY(bill_d_no);
			
			ALTER TABLE msw_bill_d$temp
				ADD CONSTRAINT msw_bill_d_ck01 CHECK (cl_flg IN ('0', '1'));
			ALTER TABLE msw_bill_d$temp
				ADD CONSTRAINT msw_bill_d_ck02 CHECK (bill_prnt_tgt_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_d$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_bill_d$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_bill_d
AS
SELECT *
FROM msw_bill_d();
ALTER VIEW msw_bill_d ALTER COLUMN bill_prnt_tgt_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_bill_d$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_d$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_d$temp(
				bill_d_no varchar (15) NOT NULL,
				bill_mng_no varchar (15) NOT NULL,
				cl_flg char (1) NOT NULL,
				dat_cntr numeric (9,0) NULL,
				bill_mtd_typ varchar (1) NULL,
				amt numeric (21,8) NULL,
				tax_amt numeric (21,8) NULL,
				bill_prnt_tgt_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_bill_d$temp
			ADD CONSTRAINT msw_bill_d_pk PRIMARY KEY(bill_d_no);
			
			ALTER TABLE msw_bill_d$temp
			ADD CONSTRAINT msw_bill_d_ck01 CHECK (cl_flg IN ('0', '1'));
			ALTER TABLE msw_bill_d$temp
			ADD CONSTRAINT msw_bill_d_ck02 CHECK (bill_prnt_tgt_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_d$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_bill_d$temp(
			bill_d_no,
			bill_mng_no,
			cl_flg,
			dat_cntr,
			bill_mtd_typ,
			amt,
			tax_amt,
			bill_prnt_tgt_flg
		)VALUES (
			NEW.bill_d_no,
			NEW.bill_mng_no,
			NEW.cl_flg,
			NEW.dat_cntr,
			NEW.bill_mtd_typ,
			NEW.amt,
			NEW.tax_amt,
			NEW.bill_prnt_tgt_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_bill_d$temp
		SET 
			bill_d_no = NEW.bill_d_no,
			bill_mng_no = NEW.bill_mng_no,
			cl_flg = NEW.cl_flg,
			dat_cntr = NEW.dat_cntr,
			bill_mtd_typ = NEW.bill_mtd_typ,
			amt = NEW.amt,
			tax_amt = NEW.tax_amt,
			bill_prnt_tgt_flg = NEW.bill_prnt_tgt_flg
		WHERE 0=0
		AND bill_d_no = OLD.bill_d_no
		AND bill_mng_no = OLD.bill_mng_no
		AND cl_flg = OLD.cl_flg
		AND (dat_cntr = OLD.dat_cntr OR dat_cntr IS NULL AND OLD.dat_cntr IS NULL)
		AND (bill_mtd_typ = OLD.bill_mtd_typ OR bill_mtd_typ IS NULL AND OLD.bill_mtd_typ IS NULL)
		AND (amt = OLD.amt OR amt IS NULL AND OLD.amt IS NULL)
		AND (tax_amt = OLD.tax_amt OR tax_amt IS NULL AND OLD.tax_amt IS NULL)
		AND bill_prnt_tgt_flg = OLD.bill_prnt_tgt_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_bill_d$temp
		WHERE 0=0
		AND bill_d_no = OLD.bill_d_no
		AND bill_mng_no = OLD.bill_mng_no
		AND cl_flg = OLD.cl_flg
		AND (dat_cntr = OLD.dat_cntr OR dat_cntr IS NULL AND OLD.dat_cntr IS NULL)
		AND (bill_mtd_typ = OLD.bill_mtd_typ OR bill_mtd_typ IS NULL AND OLD.bill_mtd_typ IS NULL)
		AND (amt = OLD.amt OR amt IS NULL AND OLD.amt IS NULL)
		AND (tax_amt = OLD.tax_amt OR tax_amt IS NULL AND OLD.tax_amt IS NULL)
		AND bill_prnt_tgt_flg = OLD.bill_prnt_tgt_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_bill_d$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_bill_d
FOR EACH ROW
EXECUTE PROCEDURE msw_bill_d$func();
;

