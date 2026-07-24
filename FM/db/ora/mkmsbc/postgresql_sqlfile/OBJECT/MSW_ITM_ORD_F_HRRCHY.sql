\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_itm_ord_f_hrrchy()
RETURNS TABLE (
	root_id varchar,
	sort_no numeric,
	hrrchy numeric,
	itm_ord_no varchar,
	chd_itm_cd varchar,
	chd_itm_sub1 varchar,
	chd_itm_sub2 varchar,
	chd_itm_sub3 varchar,
	ver_no varchar,
	chd_loc_cd varchar,
	chd_io_schd_pr_no varchar,
	chd_lot_no varchar,
	chd_sublot_no varchar,
	chd_schd_alloc_qty numeric,
	chd_gi_schd_dt timestamp(0),
	chd_sno1 varchar,
	chd_sno2 varchar,
	chd_sno3 varchar,
	chd_sno4 varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_itm_ord_f_hrrchy$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_itm_ord_f_hrrchy$temp(
				root_id varchar (15) NULL,
				sort_no numeric (9,0) NULL,
				hrrchy numeric (3) NULL,
				itm_ord_no varchar (15) NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) NULL,
				chd_itm_sub2 varchar (5) NULL,
				chd_itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				chd_loc_cd varchar (20) NULL,
				chd_io_schd_pr_no varchar (15) NULL,
				chd_lot_no varchar (15) NULL,
				chd_sublot_no varchar (15) NULL,
				chd_schd_alloc_qty numeric (21,8) NULL,
				chd_gi_schd_dt timestamp(0)  NULL,
				chd_sno1 varchar (15) NULL,
				chd_sno2 varchar (15) NULL,
				chd_sno3 varchar (15) NULL,
				chd_sno4 varchar (15) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_itm_ord_f_hrrchy$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_itm_ord_f_hrrchy$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_itm_ord_f_hrrchy
AS
SELECT *
FROM msw_itm_ord_f_hrrchy();

CREATE OR REPLACE FUNCTION msw_itm_ord_f_hrrchy$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_itm_ord_f_hrrchy$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_itm_ord_f_hrrchy$temp(
				root_id varchar (15) NULL,
				sort_no numeric (9,0) NULL,
				hrrchy numeric (3) NULL,
				itm_ord_no varchar (15) NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) NULL,
				chd_itm_sub2 varchar (5) NULL,
				chd_itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				chd_loc_cd varchar (20) NULL,
				chd_io_schd_pr_no varchar (15) NULL,
				chd_lot_no varchar (15) NULL,
				chd_sublot_no varchar (15) NULL,
				chd_schd_alloc_qty numeric (21,8) NULL,
				chd_gi_schd_dt timestamp(0)  NULL,
				chd_sno1 varchar (15) NULL,
				chd_sno2 varchar (15) NULL,
				chd_sno3 varchar (15) NULL,
				chd_sno4 varchar (15) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_itm_ord_f_hrrchy$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_itm_ord_f_hrrchy$temp(
			root_id,
			sort_no,
			hrrchy,
			itm_ord_no,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			ver_no,
			chd_loc_cd,
			chd_io_schd_pr_no,
			chd_lot_no,
			chd_sublot_no,
			chd_schd_alloc_qty,
			chd_gi_schd_dt,
			chd_sno1,
			chd_sno2,
			chd_sno3,
			chd_sno4,
			wg_cd
		)VALUES (
			NEW.root_id,
			NEW.sort_no,
			NEW.hrrchy,
			NEW.itm_ord_no,
			NEW.chd_itm_cd,
			NEW.chd_itm_sub1,
			NEW.chd_itm_sub2,
			NEW.chd_itm_sub3,
			NEW.ver_no,
			NEW.chd_loc_cd,
			NEW.chd_io_schd_pr_no,
			NEW.chd_lot_no,
			NEW.chd_sublot_no,
			NEW.chd_schd_alloc_qty,
			NEW.chd_gi_schd_dt,
			NEW.chd_sno1,
			NEW.chd_sno2,
			NEW.chd_sno3,
			NEW.chd_sno4,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_itm_ord_f_hrrchy$temp
		SET 
			root_id = NEW.root_id,
			sort_no = NEW.sort_no,
			hrrchy = NEW.hrrchy,
			itm_ord_no = NEW.itm_ord_no,
			chd_itm_cd = NEW.chd_itm_cd,
			chd_itm_sub1 = NEW.chd_itm_sub1,
			chd_itm_sub2 = NEW.chd_itm_sub2,
			chd_itm_sub3 = NEW.chd_itm_sub3,
			ver_no = NEW.ver_no,
			chd_loc_cd = NEW.chd_loc_cd,
			chd_io_schd_pr_no = NEW.chd_io_schd_pr_no,
			chd_lot_no = NEW.chd_lot_no,
			chd_sublot_no = NEW.chd_sublot_no,
			chd_schd_alloc_qty = NEW.chd_schd_alloc_qty,
			chd_gi_schd_dt = NEW.chd_gi_schd_dt,
			chd_sno1 = NEW.chd_sno1,
			chd_sno2 = NEW.chd_sno2,
			chd_sno3 = NEW.chd_sno3,
			chd_sno4 = NEW.chd_sno4,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (root_id = OLD.root_id OR root_id IS NULL AND OLD.root_id IS NULL)
		AND (sort_no = OLD.sort_no OR sort_no IS NULL AND OLD.sort_no IS NULL)
		AND (hrrchy = OLD.hrrchy OR hrrchy IS NULL AND OLD.hrrchy IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (chd_loc_cd = OLD.chd_loc_cd OR chd_loc_cd IS NULL AND OLD.chd_loc_cd IS NULL)
		AND (chd_io_schd_pr_no = OLD.chd_io_schd_pr_no OR chd_io_schd_pr_no IS NULL AND OLD.chd_io_schd_pr_no IS NULL)
		AND (chd_lot_no = OLD.chd_lot_no OR chd_lot_no IS NULL AND OLD.chd_lot_no IS NULL)
		AND (chd_sublot_no = OLD.chd_sublot_no OR chd_sublot_no IS NULL AND OLD.chd_sublot_no IS NULL)
		AND (chd_schd_alloc_qty = OLD.chd_schd_alloc_qty OR chd_schd_alloc_qty IS NULL AND OLD.chd_schd_alloc_qty IS NULL)
		AND (chd_gi_schd_dt = OLD.chd_gi_schd_dt OR chd_gi_schd_dt IS NULL AND OLD.chd_gi_schd_dt IS NULL)
		AND (chd_sno1 = OLD.chd_sno1 OR chd_sno1 IS NULL AND OLD.chd_sno1 IS NULL)
		AND (chd_sno2 = OLD.chd_sno2 OR chd_sno2 IS NULL AND OLD.chd_sno2 IS NULL)
		AND (chd_sno3 = OLD.chd_sno3 OR chd_sno3 IS NULL AND OLD.chd_sno3 IS NULL)
		AND (chd_sno4 = OLD.chd_sno4 OR chd_sno4 IS NULL AND OLD.chd_sno4 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_itm_ord_f_hrrchy$temp
		WHERE 0=0
		AND (root_id = OLD.root_id OR root_id IS NULL AND OLD.root_id IS NULL)
		AND (sort_no = OLD.sort_no OR sort_no IS NULL AND OLD.sort_no IS NULL)
		AND (hrrchy = OLD.hrrchy OR hrrchy IS NULL AND OLD.hrrchy IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (chd_loc_cd = OLD.chd_loc_cd OR chd_loc_cd IS NULL AND OLD.chd_loc_cd IS NULL)
		AND (chd_io_schd_pr_no = OLD.chd_io_schd_pr_no OR chd_io_schd_pr_no IS NULL AND OLD.chd_io_schd_pr_no IS NULL)
		AND (chd_lot_no = OLD.chd_lot_no OR chd_lot_no IS NULL AND OLD.chd_lot_no IS NULL)
		AND (chd_sublot_no = OLD.chd_sublot_no OR chd_sublot_no IS NULL AND OLD.chd_sublot_no IS NULL)
		AND (chd_schd_alloc_qty = OLD.chd_schd_alloc_qty OR chd_schd_alloc_qty IS NULL AND OLD.chd_schd_alloc_qty IS NULL)
		AND (chd_gi_schd_dt = OLD.chd_gi_schd_dt OR chd_gi_schd_dt IS NULL AND OLD.chd_gi_schd_dt IS NULL)
		AND (chd_sno1 = OLD.chd_sno1 OR chd_sno1 IS NULL AND OLD.chd_sno1 IS NULL)
		AND (chd_sno2 = OLD.chd_sno2 OR chd_sno2 IS NULL AND OLD.chd_sno2 IS NULL)
		AND (chd_sno3 = OLD.chd_sno3 OR chd_sno3 IS NULL AND OLD.chd_sno3 IS NULL)
		AND (chd_sno4 = OLD.chd_sno4 OR chd_sno4 IS NULL AND OLD.chd_sno4 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_itm_ord_f_hrrchy$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_itm_ord_f_hrrchy
FOR EACH ROW
EXECUTE PROCEDURE msw_itm_ord_f_hrrchy$func();
;

