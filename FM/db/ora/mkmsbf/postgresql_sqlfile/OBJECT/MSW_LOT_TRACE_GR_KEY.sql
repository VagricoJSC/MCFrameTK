\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_lot_trace_gr_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	lot_no varchar,
	sublot_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	slip_no varchar,
	slip_schd_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_lot_trace_gr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_lot_trace_gr_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				lot_no varchar (15) DEFAULT '*' NULL,
				sublot_no varchar (15) DEFAULT '*' NULL,
				sno1 varchar (15) DEFAULT '*' NULL,
				sno2 varchar (15) DEFAULT '*' NULL,
				sno3 varchar (15) DEFAULT '*' NULL,
				sno4 varchar (15) DEFAULT '*' NULL,
				slip_no varchar (15) NULL,
				slip_schd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_lot_trace_gr_key_pk_ie ON msw_lot_trace_gr_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,slip_no,slip_schd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_lot_trace_gr_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_lot_trace_gr_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_lot_trace_gr_key
AS
SELECT *
FROM msw_lot_trace_gr_key();
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW msw_lot_trace_gr_key ALTER COLUMN sno4 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_lot_trace_gr_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_lot_trace_gr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_lot_trace_gr_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				lot_no varchar (15) DEFAULT '*' NULL,
				sublot_no varchar (15) DEFAULT '*' NULL,
				sno1 varchar (15) DEFAULT '*' NULL,
				sno2 varchar (15) DEFAULT '*' NULL,
				sno3 varchar (15) DEFAULT '*' NULL,
				sno4 varchar (15) DEFAULT '*' NULL,
				slip_no varchar (15) NULL,
				slip_schd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_lot_trace_gr_key_pk_ie ON msw_lot_trace_gr_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,slip_no,slip_schd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_lot_trace_gr_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_lot_trace_gr_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			slip_no,
			slip_schd_no
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.slip_no,
			NEW.slip_schd_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_lot_trace_gr_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			slip_no = NEW.slip_no,
			slip_schd_no = NEW.slip_schd_no
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_schd_no = OLD.slip_schd_no OR slip_schd_no IS NULL AND OLD.slip_schd_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_lot_trace_gr_key$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_schd_no = OLD.slip_schd_no OR slip_schd_no IS NULL AND OLD.slip_schd_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_lot_trace_gr_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_lot_trace_gr_key
FOR EACH ROW
EXECUTE PROCEDURE msw_lot_trace_gr_key$func();
;

