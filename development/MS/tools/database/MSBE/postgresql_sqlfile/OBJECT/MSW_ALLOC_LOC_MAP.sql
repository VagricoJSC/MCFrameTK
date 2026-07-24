\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_alloc_loc_map()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	ship_term_cd varchar,
	inpt_loc_cd varchar,
	inpt_str_ln_cd varchar,
	dlv_lg_grp_cd varchar,
	alloc_grp_cd varchar,
	gi_lg_grp_cd varchar,
	gi_loc_cd varchar,
	gi_str_ln_cd varchar,
	gi_stk_arrv_bp_cd varchar,
	gr_loc_cd varchar,
	gr_str_ln_cd varchar,
	alloc_scope_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_alloc_loc_map$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_alloc_loc_map$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				ship_term_cd varchar (5) NULL,
				inpt_loc_cd varchar (20) NULL,
				inpt_str_ln_cd varchar (10) NULL,
				dlv_lg_grp_cd varchar (10) NULL,
				alloc_grp_cd varchar (10) NULL,
				gi_lg_grp_cd varchar (10) NULL,
				gi_loc_cd varchar (20) NULL,
				gi_str_ln_cd varchar (10) NULL,
				gi_stk_arrv_bp_cd varchar (20) NULL,
				gr_loc_cd varchar (20) NULL,
				gr_str_ln_cd varchar (10) NULL,
				alloc_scope_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_alloc_loc_map$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_alloc_loc_map$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_alloc_loc_map
AS
SELECT *
FROM msw_alloc_loc_map();
ALTER VIEW msw_alloc_loc_map ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_alloc_loc_map ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_alloc_loc_map ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_alloc_loc_map$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_alloc_loc_map$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_alloc_loc_map$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				ship_term_cd varchar (5) NULL,
				inpt_loc_cd varchar (20) NULL,
				inpt_str_ln_cd varchar (10) NULL,
				dlv_lg_grp_cd varchar (10) NULL,
				alloc_grp_cd varchar (10) NULL,
				gi_lg_grp_cd varchar (10) NULL,
				gi_loc_cd varchar (20) NULL,
				gi_str_ln_cd varchar (10) NULL,
				gi_stk_arrv_bp_cd varchar (20) NULL,
				gr_loc_cd varchar (20) NULL,
				gr_str_ln_cd varchar (10) NULL,
				alloc_scope_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_alloc_loc_map$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_alloc_loc_map$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			ship_term_cd,
			inpt_loc_cd,
			inpt_str_ln_cd,
			dlv_lg_grp_cd,
			alloc_grp_cd,
			gi_lg_grp_cd,
			gi_loc_cd,
			gi_str_ln_cd,
			gi_stk_arrv_bp_cd,
			gr_loc_cd,
			gr_str_ln_cd,
			alloc_scope_typ
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.ship_term_cd,
			NEW.inpt_loc_cd,
			NEW.inpt_str_ln_cd,
			NEW.dlv_lg_grp_cd,
			NEW.alloc_grp_cd,
			NEW.gi_lg_grp_cd,
			NEW.gi_loc_cd,
			NEW.gi_str_ln_cd,
			NEW.gi_stk_arrv_bp_cd,
			NEW.gr_loc_cd,
			NEW.gr_str_ln_cd,
			NEW.alloc_scope_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_alloc_loc_map$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			ship_term_cd = NEW.ship_term_cd,
			inpt_loc_cd = NEW.inpt_loc_cd,
			inpt_str_ln_cd = NEW.inpt_str_ln_cd,
			dlv_lg_grp_cd = NEW.dlv_lg_grp_cd,
			alloc_grp_cd = NEW.alloc_grp_cd,
			gi_lg_grp_cd = NEW.gi_lg_grp_cd,
			gi_loc_cd = NEW.gi_loc_cd,
			gi_str_ln_cd = NEW.gi_str_ln_cd,
			gi_stk_arrv_bp_cd = NEW.gi_stk_arrv_bp_cd,
			gr_loc_cd = NEW.gr_loc_cd,
			gr_str_ln_cd = NEW.gr_str_ln_cd,
			alloc_scope_typ = NEW.alloc_scope_typ
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (ship_term_cd = OLD.ship_term_cd OR ship_term_cd IS NULL AND OLD.ship_term_cd IS NULL)
		AND (inpt_loc_cd = OLD.inpt_loc_cd OR inpt_loc_cd IS NULL AND OLD.inpt_loc_cd IS NULL)
		AND (inpt_str_ln_cd = OLD.inpt_str_ln_cd OR inpt_str_ln_cd IS NULL AND OLD.inpt_str_ln_cd IS NULL)
		AND (dlv_lg_grp_cd = OLD.dlv_lg_grp_cd OR dlv_lg_grp_cd IS NULL AND OLD.dlv_lg_grp_cd IS NULL)
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL)
		AND (gi_lg_grp_cd = OLD.gi_lg_grp_cd OR gi_lg_grp_cd IS NULL AND OLD.gi_lg_grp_cd IS NULL)
		AND (gi_loc_cd = OLD.gi_loc_cd OR gi_loc_cd IS NULL AND OLD.gi_loc_cd IS NULL)
		AND (gi_str_ln_cd = OLD.gi_str_ln_cd OR gi_str_ln_cd IS NULL AND OLD.gi_str_ln_cd IS NULL)
		AND (gi_stk_arrv_bp_cd = OLD.gi_stk_arrv_bp_cd OR gi_stk_arrv_bp_cd IS NULL AND OLD.gi_stk_arrv_bp_cd IS NULL)
		AND (gr_loc_cd = OLD.gr_loc_cd OR gr_loc_cd IS NULL AND OLD.gr_loc_cd IS NULL)
		AND (gr_str_ln_cd = OLD.gr_str_ln_cd OR gr_str_ln_cd IS NULL AND OLD.gr_str_ln_cd IS NULL)
		AND (alloc_scope_typ = OLD.alloc_scope_typ OR alloc_scope_typ IS NULL AND OLD.alloc_scope_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_alloc_loc_map$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (ship_term_cd = OLD.ship_term_cd OR ship_term_cd IS NULL AND OLD.ship_term_cd IS NULL)
		AND (inpt_loc_cd = OLD.inpt_loc_cd OR inpt_loc_cd IS NULL AND OLD.inpt_loc_cd IS NULL)
		AND (inpt_str_ln_cd = OLD.inpt_str_ln_cd OR inpt_str_ln_cd IS NULL AND OLD.inpt_str_ln_cd IS NULL)
		AND (dlv_lg_grp_cd = OLD.dlv_lg_grp_cd OR dlv_lg_grp_cd IS NULL AND OLD.dlv_lg_grp_cd IS NULL)
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL)
		AND (gi_lg_grp_cd = OLD.gi_lg_grp_cd OR gi_lg_grp_cd IS NULL AND OLD.gi_lg_grp_cd IS NULL)
		AND (gi_loc_cd = OLD.gi_loc_cd OR gi_loc_cd IS NULL AND OLD.gi_loc_cd IS NULL)
		AND (gi_str_ln_cd = OLD.gi_str_ln_cd OR gi_str_ln_cd IS NULL AND OLD.gi_str_ln_cd IS NULL)
		AND (gi_stk_arrv_bp_cd = OLD.gi_stk_arrv_bp_cd OR gi_stk_arrv_bp_cd IS NULL AND OLD.gi_stk_arrv_bp_cd IS NULL)
		AND (gr_loc_cd = OLD.gr_loc_cd OR gr_loc_cd IS NULL AND OLD.gr_loc_cd IS NULL)
		AND (gr_str_ln_cd = OLD.gr_str_ln_cd OR gr_str_ln_cd IS NULL AND OLD.gr_str_ln_cd IS NULL)
		AND (alloc_scope_typ = OLD.alloc_scope_typ OR alloc_scope_typ IS NULL AND OLD.alloc_scope_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_alloc_loc_map$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_alloc_loc_map
FOR EACH ROW
EXECUTE PROCEDURE msw_alloc_loc_map$func();
;

