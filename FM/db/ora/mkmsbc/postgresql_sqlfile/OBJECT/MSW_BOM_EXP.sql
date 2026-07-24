\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_bom_exp()
RETURNS TABLE (
	peg_no numeric,
	itm_ord_no varchar,
	oper_ord_no varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	oper_loc_cd varchar,
	bom_ptn varchar,
	mst_wg_cd varchar,
	oper_cd varchar,
	oper_seq numeric,
	oper_schd_qty numeric,
	mfg_st_schd_dt timestamp(0),
	st_schd_dt timestamp(0),
	end_schd_dt timestamp(0),
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	cur_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bom_exp$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bom_exp$temp(
				peg_no numeric (9,0) NULL,
				itm_ord_no varchar (15) NULL,
				oper_ord_no varchar (15) NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) NOT NULL,
				itm_sub2 varchar (5) NOT NULL,
				itm_sub3 varchar (5) NOT NULL,
				oper_loc_cd varchar (20) NOT NULL,
				bom_ptn varchar (40) NOT NULL,
				mst_wg_cd varchar (10) NOT NULL,
				oper_cd varchar (10) NOT NULL,
				oper_seq numeric (9,0) NOT NULL,
				oper_schd_qty numeric (21,8) NOT NULL,
				mfg_st_schd_dt timestamp(0)  NOT NULL,
				st_schd_dt timestamp(0)  NOT NULL,
				end_schd_dt timestamp(0)  NOT NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bom_exp$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_bom_exp$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_bom_exp
AS
SELECT *
FROM msw_bom_exp();

CREATE OR REPLACE FUNCTION msw_bom_exp$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bom_exp$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bom_exp$temp(
				peg_no numeric (9,0) NULL,
				itm_ord_no varchar (15) NULL,
				oper_ord_no varchar (15) NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) NOT NULL,
				itm_sub2 varchar (5) NOT NULL,
				itm_sub3 varchar (5) NOT NULL,
				oper_loc_cd varchar (20) NOT NULL,
				bom_ptn varchar (40) NOT NULL,
				mst_wg_cd varchar (10) NOT NULL,
				oper_cd varchar (10) NOT NULL,
				oper_seq numeric (9,0) NOT NULL,
				oper_schd_qty numeric (21,8) NOT NULL,
				mfg_st_schd_dt timestamp(0)  NOT NULL,
				st_schd_dt timestamp(0)  NOT NULL,
				end_schd_dt timestamp(0)  NOT NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bom_exp$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_bom_exp$temp(
			peg_no,
			itm_ord_no,
			oper_ord_no,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			oper_loc_cd,
			bom_ptn,
			mst_wg_cd,
			oper_cd,
			oper_seq,
			oper_schd_qty,
			mfg_st_schd_dt,
			st_schd_dt,
			end_schd_dt,
			sno1,
			sno2,
			sno3,
			sno4,
			cur_cd
		)VALUES (
			NEW.peg_no,
			NEW.itm_ord_no,
			NEW.oper_ord_no,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.oper_loc_cd,
			NEW.bom_ptn,
			NEW.mst_wg_cd,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.oper_schd_qty,
			NEW.mfg_st_schd_dt,
			NEW.st_schd_dt,
			NEW.end_schd_dt,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.cur_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_bom_exp$temp
		SET 
			peg_no = NEW.peg_no,
			itm_ord_no = NEW.itm_ord_no,
			oper_ord_no = NEW.oper_ord_no,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			oper_loc_cd = NEW.oper_loc_cd,
			bom_ptn = NEW.bom_ptn,
			mst_wg_cd = NEW.mst_wg_cd,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			oper_schd_qty = NEW.oper_schd_qty,
			mfg_st_schd_dt = NEW.mfg_st_schd_dt,
			st_schd_dt = NEW.st_schd_dt,
			end_schd_dt = NEW.end_schd_dt,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			cur_cd = NEW.cur_cd
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (oper_ord_no = OLD.oper_ord_no OR oper_ord_no IS NULL AND OLD.oper_ord_no IS NULL)
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND oper_loc_cd = OLD.oper_loc_cd
		AND bom_ptn = OLD.bom_ptn
		AND mst_wg_cd = OLD.mst_wg_cd
		AND oper_cd = OLD.oper_cd
		AND oper_seq = OLD.oper_seq
		AND oper_schd_qty = OLD.oper_schd_qty
		AND mfg_st_schd_dt = OLD.mfg_st_schd_dt
		AND st_schd_dt = OLD.st_schd_dt
		AND end_schd_dt = OLD.end_schd_dt
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_bom_exp$temp
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (oper_ord_no = OLD.oper_ord_no OR oper_ord_no IS NULL AND OLD.oper_ord_no IS NULL)
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND oper_loc_cd = OLD.oper_loc_cd
		AND bom_ptn = OLD.bom_ptn
		AND mst_wg_cd = OLD.mst_wg_cd
		AND oper_cd = OLD.oper_cd
		AND oper_seq = OLD.oper_seq
		AND oper_schd_qty = OLD.oper_schd_qty
		AND mfg_st_schd_dt = OLD.mfg_st_schd_dt
		AND st_schd_dt = OLD.st_schd_dt
		AND end_schd_dt = OLD.end_schd_dt
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_bom_exp$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_bom_exp
FOR EACH ROW
EXECUTE PROCEDURE msw_bom_exp$func();
;

