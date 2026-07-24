\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_lot_trace_f_hrrchy()
RETURNS TABLE (
	hrrchy numeric,
	sort_no numeric,
	loop_flg char,
	itm_cd varchar,
	lot_no varchar,
	sublot_no varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	par_itm_cd varchar,
	par_lot_no varchar,
	par_sublot_no varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	par_sno1 varchar,
	par_sno2 varchar,
	par_sno3 varchar,
	par_sno4 varchar,
	itm_nm varchar,
	lot_mng_typ varchar,
	sublot_mng_typ varchar,
	peg_no numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_lot_trace_f_hrrchy$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_lot_trace_f_hrrchy$temp(
				hrrchy numeric (9,0) NULL,
				sort_no numeric (9,0) NULL,
				loop_flg char (1) DEFAULT '0' NOT NULL,
				itm_cd varchar (40) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				par_itm_cd varchar (40) NULL,
				par_lot_no varchar (15) NULL,
				par_sublot_no varchar (15) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_sno1 varchar (15) NULL,
				par_sno2 varchar (15) NULL,
				par_sno3 varchar (15) NULL,
				par_sno4 varchar (15) NULL,
				itm_nm varchar (100) NULL,
				lot_mng_typ varchar (1) NULL,
				sublot_mng_typ varchar (1) NULL,
				peg_no numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_lot_trace_f_hrrchy$temp
				ADD CONSTRAINT msw_lot_trace_f_hrrchy_ck01 CHECK (loop_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_lot_trace_f_hrrchy$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_lot_trace_f_hrrchy$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_lot_trace_f_hrrchy
AS
SELECT *
FROM msw_lot_trace_f_hrrchy();
ALTER VIEW msw_lot_trace_f_hrrchy ALTER COLUMN loop_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_lot_trace_f_hrrchy$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_lot_trace_f_hrrchy$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_lot_trace_f_hrrchy$temp(
				hrrchy numeric (9,0) NULL,
				sort_no numeric (9,0) NULL,
				loop_flg char (1) DEFAULT '0' NOT NULL,
				itm_cd varchar (40) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				par_itm_cd varchar (40) NULL,
				par_lot_no varchar (15) NULL,
				par_sublot_no varchar (15) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_sno1 varchar (15) NULL,
				par_sno2 varchar (15) NULL,
				par_sno3 varchar (15) NULL,
				par_sno4 varchar (15) NULL,
				itm_nm varchar (100) NULL,
				lot_mng_typ varchar (1) NULL,
				sublot_mng_typ varchar (1) NULL,
				peg_no numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_lot_trace_f_hrrchy$temp
			ADD CONSTRAINT msw_lot_trace_f_hrrchy_ck01 CHECK (loop_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_lot_trace_f_hrrchy$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_lot_trace_f_hrrchy$temp(
			hrrchy,
			sort_no,
			loop_flg,
			itm_cd,
			lot_no,
			sublot_no,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sno1,
			sno2,
			sno3,
			sno4,
			par_itm_cd,
			par_lot_no,
			par_sublot_no,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_sno1,
			par_sno2,
			par_sno3,
			par_sno4,
			itm_nm,
			lot_mng_typ,
			sublot_mng_typ,
			peg_no
		)VALUES (
			NEW.hrrchy,
			NEW.sort_no,
			NEW.loop_flg,
			NEW.itm_cd,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.par_itm_cd,
			NEW.par_lot_no,
			NEW.par_sublot_no,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.par_sno1,
			NEW.par_sno2,
			NEW.par_sno3,
			NEW.par_sno4,
			NEW.itm_nm,
			NEW.lot_mng_typ,
			NEW.sublot_mng_typ,
			NEW.peg_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_lot_trace_f_hrrchy$temp
		SET 
			hrrchy = NEW.hrrchy,
			sort_no = NEW.sort_no,
			loop_flg = NEW.loop_flg,
			itm_cd = NEW.itm_cd,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			par_itm_cd = NEW.par_itm_cd,
			par_lot_no = NEW.par_lot_no,
			par_sublot_no = NEW.par_sublot_no,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			par_sno1 = NEW.par_sno1,
			par_sno2 = NEW.par_sno2,
			par_sno3 = NEW.par_sno3,
			par_sno4 = NEW.par_sno4,
			itm_nm = NEW.itm_nm,
			lot_mng_typ = NEW.lot_mng_typ,
			sublot_mng_typ = NEW.sublot_mng_typ,
			peg_no = NEW.peg_no
		WHERE 0=0
		AND (hrrchy = OLD.hrrchy OR hrrchy IS NULL AND OLD.hrrchy IS NULL)
		AND (sort_no = OLD.sort_no OR sort_no IS NULL AND OLD.sort_no IS NULL)
		AND loop_flg = OLD.loop_flg
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_lot_no = OLD.par_lot_no OR par_lot_no IS NULL AND OLD.par_lot_no IS NULL)
		AND (par_sublot_no = OLD.par_sublot_no OR par_sublot_no IS NULL AND OLD.par_sublot_no IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_sno1 = OLD.par_sno1 OR par_sno1 IS NULL AND OLD.par_sno1 IS NULL)
		AND (par_sno2 = OLD.par_sno2 OR par_sno2 IS NULL AND OLD.par_sno2 IS NULL)
		AND (par_sno3 = OLD.par_sno3 OR par_sno3 IS NULL AND OLD.par_sno3 IS NULL)
		AND (par_sno4 = OLD.par_sno4 OR par_sno4 IS NULL AND OLD.par_sno4 IS NULL)
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND (lot_mng_typ = OLD.lot_mng_typ OR lot_mng_typ IS NULL AND OLD.lot_mng_typ IS NULL)
		AND (sublot_mng_typ = OLD.sublot_mng_typ OR sublot_mng_typ IS NULL AND OLD.sublot_mng_typ IS NULL)
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_lot_trace_f_hrrchy$temp
		WHERE 0=0
		AND (hrrchy = OLD.hrrchy OR hrrchy IS NULL AND OLD.hrrchy IS NULL)
		AND (sort_no = OLD.sort_no OR sort_no IS NULL AND OLD.sort_no IS NULL)
		AND loop_flg = OLD.loop_flg
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_lot_no = OLD.par_lot_no OR par_lot_no IS NULL AND OLD.par_lot_no IS NULL)
		AND (par_sublot_no = OLD.par_sublot_no OR par_sublot_no IS NULL AND OLD.par_sublot_no IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_sno1 = OLD.par_sno1 OR par_sno1 IS NULL AND OLD.par_sno1 IS NULL)
		AND (par_sno2 = OLD.par_sno2 OR par_sno2 IS NULL AND OLD.par_sno2 IS NULL)
		AND (par_sno3 = OLD.par_sno3 OR par_sno3 IS NULL AND OLD.par_sno3 IS NULL)
		AND (par_sno4 = OLD.par_sno4 OR par_sno4 IS NULL AND OLD.par_sno4 IS NULL)
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND (lot_mng_typ = OLD.lot_mng_typ OR lot_mng_typ IS NULL AND OLD.lot_mng_typ IS NULL)
		AND (sublot_mng_typ = OLD.sublot_mng_typ OR sublot_mng_typ IS NULL AND OLD.sublot_mng_typ IS NULL)
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_lot_trace_f_hrrchy$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_lot_trace_f_hrrchy
FOR EACH ROW
EXECUTE PROCEDURE msw_lot_trace_f_hrrchy$func();
;

