\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_alloc_ext()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	lot_no varchar,
	sublot_no varchar,
	ver_no varchar,
	stk_loc_cd varchar,
	stk_str_ln_cd varchar,
	stk_arrv_bp_cd varchar,
	pack_unit_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_alloc_ext$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_alloc_ext$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				ver_no varchar (10) NULL,
				stk_loc_cd varchar (20) NULL,
				stk_str_ln_cd varchar (10) NULL,
				stk_arrv_bp_cd varchar (20) NULL,
				pack_unit_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_alloc_ext$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_alloc_ext$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_alloc_ext
AS
SELECT *
FROM msw_alloc_ext();
ALTER VIEW msw_alloc_ext ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_alloc_ext ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_alloc_ext ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_alloc_ext$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_alloc_ext$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_alloc_ext$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				ver_no varchar (10) NULL,
				stk_loc_cd varchar (20) NULL,
				stk_str_ln_cd varchar (10) NULL,
				stk_arrv_bp_cd varchar (20) NULL,
				pack_unit_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_alloc_ext$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_alloc_ext$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			ver_no,
			stk_loc_cd,
			stk_str_ln_cd,
			stk_arrv_bp_cd,
			pack_unit_cd
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.ver_no,
			NEW.stk_loc_cd,
			NEW.stk_str_ln_cd,
			NEW.stk_arrv_bp_cd,
			NEW.pack_unit_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_alloc_ext$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			ver_no = NEW.ver_no,
			stk_loc_cd = NEW.stk_loc_cd,
			stk_str_ln_cd = NEW.stk_str_ln_cd,
			stk_arrv_bp_cd = NEW.stk_arrv_bp_cd,
			pack_unit_cd = NEW.pack_unit_cd
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (stk_loc_cd = OLD.stk_loc_cd OR stk_loc_cd IS NULL AND OLD.stk_loc_cd IS NULL)
		AND (stk_str_ln_cd = OLD.stk_str_ln_cd OR stk_str_ln_cd IS NULL AND OLD.stk_str_ln_cd IS NULL)
		AND (stk_arrv_bp_cd = OLD.stk_arrv_bp_cd OR stk_arrv_bp_cd IS NULL AND OLD.stk_arrv_bp_cd IS NULL)
		AND (pack_unit_cd = OLD.pack_unit_cd OR pack_unit_cd IS NULL AND OLD.pack_unit_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_alloc_ext$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (stk_loc_cd = OLD.stk_loc_cd OR stk_loc_cd IS NULL AND OLD.stk_loc_cd IS NULL)
		AND (stk_str_ln_cd = OLD.stk_str_ln_cd OR stk_str_ln_cd IS NULL AND OLD.stk_str_ln_cd IS NULL)
		AND (stk_arrv_bp_cd = OLD.stk_arrv_bp_cd OR stk_arrv_bp_cd IS NULL AND OLD.stk_arrv_bp_cd IS NULL)
		AND (pack_unit_cd = OLD.pack_unit_cd OR pack_unit_cd IS NULL AND OLD.pack_unit_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_alloc_ext$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_alloc_ext
FOR EACH ROW
EXECUTE PROCEDURE msw_alloc_ext$func();
;

