\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_itm_ord_r_hrrchy()
RETURNS TABLE (
	root_id varchar,
	sort_no numeric,
	hrrchy numeric,
	rqmt_no varchar,
	chd_rqmt_no varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	ver_no varchar,
	lot_no varchar,
	sublot_no varchar,
	loc_cd varchar,
	itm_ord_no varchar,
	io_schd_typ varchar,
	io_schd_pr_no varchar,
	schd_alloc_qty numeric,
	gi_schd_dt timestamp(0),
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_itm_ord_r_hrrchy$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_itm_ord_r_hrrchy$temp(
				root_id varchar (15) NULL,
				sort_no numeric (9,0) NULL,
				hrrchy numeric (3) NULL,
				rqmt_no varchar (15) NULL,
				chd_rqmt_no varchar (15) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				loc_cd varchar (20) NULL,
				itm_ord_no varchar (15) NULL,
				io_schd_typ varchar (5) NULL,
				io_schd_pr_no varchar (15) NULL,
				schd_alloc_qty numeric (21,8) NULL,
				gi_schd_dt timestamp(0)  NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_itm_ord_r_hrrchy$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_itm_ord_r_hrrchy$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_itm_ord_r_hrrchy
AS
SELECT *
FROM msw_itm_ord_r_hrrchy();

CREATE OR REPLACE FUNCTION msw_itm_ord_r_hrrchy$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_itm_ord_r_hrrchy$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_itm_ord_r_hrrchy$temp(
				root_id varchar (15) NULL,
				sort_no numeric (9,0) NULL,
				hrrchy numeric (3) NULL,
				rqmt_no varchar (15) NULL,
				chd_rqmt_no varchar (15) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				loc_cd varchar (20) NULL,
				itm_ord_no varchar (15) NULL,
				io_schd_typ varchar (5) NULL,
				io_schd_pr_no varchar (15) NULL,
				schd_alloc_qty numeric (21,8) NULL,
				gi_schd_dt timestamp(0)  NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_itm_ord_r_hrrchy$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_itm_ord_r_hrrchy$temp(
			root_id,
			sort_no,
			hrrchy,
			rqmt_no,
			chd_rqmt_no,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			ver_no,
			lot_no,
			sublot_no,
			loc_cd,
			itm_ord_no,
			io_schd_typ,
			io_schd_pr_no,
			schd_alloc_qty,
			gi_schd_dt,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd
		)VALUES (
			NEW.root_id,
			NEW.sort_no,
			NEW.hrrchy,
			NEW.rqmt_no,
			NEW.chd_rqmt_no,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.ver_no,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.loc_cd,
			NEW.itm_ord_no,
			NEW.io_schd_typ,
			NEW.io_schd_pr_no,
			NEW.schd_alloc_qty,
			NEW.gi_schd_dt,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_itm_ord_r_hrrchy$temp
		SET 
			root_id = NEW.root_id,
			sort_no = NEW.sort_no,
			hrrchy = NEW.hrrchy,
			rqmt_no = NEW.rqmt_no,
			chd_rqmt_no = NEW.chd_rqmt_no,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			ver_no = NEW.ver_no,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			loc_cd = NEW.loc_cd,
			itm_ord_no = NEW.itm_ord_no,
			io_schd_typ = NEW.io_schd_typ,
			io_schd_pr_no = NEW.io_schd_pr_no,
			schd_alloc_qty = NEW.schd_alloc_qty,
			gi_schd_dt = NEW.gi_schd_dt,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (root_id = OLD.root_id OR root_id IS NULL AND OLD.root_id IS NULL)
		AND (sort_no = OLD.sort_no OR sort_no IS NULL AND OLD.sort_no IS NULL)
		AND (hrrchy = OLD.hrrchy OR hrrchy IS NULL AND OLD.hrrchy IS NULL)
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL)
		AND (chd_rqmt_no = OLD.chd_rqmt_no OR chd_rqmt_no IS NULL AND OLD.chd_rqmt_no IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL)
		AND (io_schd_pr_no = OLD.io_schd_pr_no OR io_schd_pr_no IS NULL AND OLD.io_schd_pr_no IS NULL)
		AND (schd_alloc_qty = OLD.schd_alloc_qty OR schd_alloc_qty IS NULL AND OLD.schd_alloc_qty IS NULL)
		AND (gi_schd_dt = OLD.gi_schd_dt OR gi_schd_dt IS NULL AND OLD.gi_schd_dt IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_itm_ord_r_hrrchy$temp
		WHERE 0=0
		AND (root_id = OLD.root_id OR root_id IS NULL AND OLD.root_id IS NULL)
		AND (sort_no = OLD.sort_no OR sort_no IS NULL AND OLD.sort_no IS NULL)
		AND (hrrchy = OLD.hrrchy OR hrrchy IS NULL AND OLD.hrrchy IS NULL)
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL)
		AND (chd_rqmt_no = OLD.chd_rqmt_no OR chd_rqmt_no IS NULL AND OLD.chd_rqmt_no IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL)
		AND (io_schd_pr_no = OLD.io_schd_pr_no OR io_schd_pr_no IS NULL AND OLD.io_schd_pr_no IS NULL)
		AND (schd_alloc_qty = OLD.schd_alloc_qty OR schd_alloc_qty IS NULL AND OLD.schd_alloc_qty IS NULL)
		AND (gi_schd_dt = OLD.gi_schd_dt OR gi_schd_dt IS NULL AND OLD.gi_schd_dt IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_itm_ord_r_hrrchy$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_itm_ord_r_hrrchy
FOR EACH ROW
EXECUTE PROCEDURE msw_itm_ord_r_hrrchy$func();
;

