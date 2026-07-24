\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_stk_lst()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	loc_cd varchar,
	str_ln_cd varchar,
	stk_arrv_bp_cd varchar,
	lot_no varchar,
	sublot_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	fix_no_typ varchar,
	fix_no varchar,
	pack_unit_cd varchar,
	gd_cd varchar,
	in_xfr_typ varchar,
	quality_typ varchar,
	asst_typ varchar,
	stk_insp_typ varchar,
	stk_id_typ varchar,
	stk_bp_cd varchar,
	pack_unit_qty numeric,
	base_unit_qty numeric,
	disp_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_stk_lst$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_stk_lst$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
				stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
				lot_no varchar (15) DEFAULT '*' NOT NULL,
				sublot_no varchar (15) DEFAULT '*' NOT NULL,
				sno1 varchar (15) DEFAULT '*' NOT NULL,
				sno2 varchar (15) DEFAULT '*' NOT NULL,
				sno3 varchar (15) DEFAULT '*' NOT NULL,
				sno4 varchar (15) DEFAULT '*' NOT NULL,
				fix_no_typ varchar (1) NOT NULL,
				fix_no varchar (15) DEFAULT '*' NOT NULL,
				pack_unit_cd varchar (5) NOT NULL,
				gd_cd varchar (2) NOT NULL,
				in_xfr_typ varchar (1) NOT NULL,
				quality_typ varchar (1) NOT NULL,
				asst_typ varchar (1) NOT NULL,
				stk_insp_typ varchar (1) NOT NULL,
				stk_id_typ varchar (1) NOT NULL,
				stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
				pack_unit_qty numeric (21,8) NULL,
				base_unit_qty numeric (21,8) NULL,
				disp_seq numeric (5,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_stk_lst$temp
			ADD CONSTRAINT msw_stk_lst_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,str_ln_cd,stk_arrv_bp_cd,lot_no,sublot_no,sno1,sno2,sno3,sno4,fix_no_typ,fix_no,pack_unit_cd,gd_cd,in_xfr_typ,quality_typ,asst_typ,stk_insp_typ,stk_id_typ,stk_bp_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_stk_lst$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_stk_lst$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_stk_lst
AS
SELECT *
FROM msw_stk_lst();
ALTER VIEW msw_stk_lst ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN str_ln_cd SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN stk_arrv_bp_cd SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN sno4 SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN fix_no SET DEFAULT '*';
ALTER VIEW msw_stk_lst ALTER COLUMN stk_bp_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_stk_lst$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_stk_lst$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_stk_lst$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
				stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
				lot_no varchar (15) DEFAULT '*' NOT NULL,
				sublot_no varchar (15) DEFAULT '*' NOT NULL,
				sno1 varchar (15) DEFAULT '*' NOT NULL,
				sno2 varchar (15) DEFAULT '*' NOT NULL,
				sno3 varchar (15) DEFAULT '*' NOT NULL,
				sno4 varchar (15) DEFAULT '*' NOT NULL,
				fix_no_typ varchar (1) NOT NULL,
				fix_no varchar (15) DEFAULT '*' NOT NULL,
				pack_unit_cd varchar (5) NOT NULL,
				gd_cd varchar (2) NOT NULL,
				in_xfr_typ varchar (1) NOT NULL,
				quality_typ varchar (1) NOT NULL,
				asst_typ varchar (1) NOT NULL,
				stk_insp_typ varchar (1) NOT NULL,
				stk_id_typ varchar (1) NOT NULL,
				stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
				pack_unit_qty numeric (21,8) NULL,
				base_unit_qty numeric (21,8) NULL,
				disp_seq numeric (5,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_stk_lst$temp
			ADD CONSTRAINT msw_stk_lst_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,str_ln_cd,stk_arrv_bp_cd,lot_no,sublot_no,sno1,sno2,sno3,sno4,fix_no_typ,fix_no,pack_unit_cd,gd_cd,in_xfr_typ,quality_typ,asst_typ,stk_insp_typ,stk_id_typ,stk_bp_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_stk_lst$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_stk_lst$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			str_ln_cd,
			stk_arrv_bp_cd,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			fix_no_typ,
			fix_no,
			pack_unit_cd,
			gd_cd,
			in_xfr_typ,
			quality_typ,
			asst_typ,
			stk_insp_typ,
			stk_id_typ,
			stk_bp_cd,
			pack_unit_qty,
			base_unit_qty,
			disp_seq
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.loc_cd,
			NEW.str_ln_cd,
			NEW.stk_arrv_bp_cd,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.fix_no_typ,
			NEW.fix_no,
			NEW.pack_unit_cd,
			NEW.gd_cd,
			NEW.in_xfr_typ,
			NEW.quality_typ,
			NEW.asst_typ,
			NEW.stk_insp_typ,
			NEW.stk_id_typ,
			NEW.stk_bp_cd,
			NEW.pack_unit_qty,
			NEW.base_unit_qty,
			NEW.disp_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_stk_lst$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			loc_cd = NEW.loc_cd,
			str_ln_cd = NEW.str_ln_cd,
			stk_arrv_bp_cd = NEW.stk_arrv_bp_cd,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			fix_no_typ = NEW.fix_no_typ,
			fix_no = NEW.fix_no,
			pack_unit_cd = NEW.pack_unit_cd,
			gd_cd = NEW.gd_cd,
			in_xfr_typ = NEW.in_xfr_typ,
			quality_typ = NEW.quality_typ,
			asst_typ = NEW.asst_typ,
			stk_insp_typ = NEW.stk_insp_typ,
			stk_id_typ = NEW.stk_id_typ,
			stk_bp_cd = NEW.stk_bp_cd,
			pack_unit_qty = NEW.pack_unit_qty,
			base_unit_qty = NEW.base_unit_qty,
			disp_seq = NEW.disp_seq
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND loc_cd = OLD.loc_cd
		AND str_ln_cd = OLD.str_ln_cd
		AND stk_arrv_bp_cd = OLD.stk_arrv_bp_cd
		AND lot_no = OLD.lot_no
		AND sublot_no = OLD.sublot_no
		AND sno1 = OLD.sno1
		AND sno2 = OLD.sno2
		AND sno3 = OLD.sno3
		AND sno4 = OLD.sno4
		AND fix_no_typ = OLD.fix_no_typ
		AND fix_no = OLD.fix_no
		AND pack_unit_cd = OLD.pack_unit_cd
		AND gd_cd = OLD.gd_cd
		AND in_xfr_typ = OLD.in_xfr_typ
		AND quality_typ = OLD.quality_typ
		AND asst_typ = OLD.asst_typ
		AND stk_insp_typ = OLD.stk_insp_typ
		AND stk_id_typ = OLD.stk_id_typ
		AND stk_bp_cd = OLD.stk_bp_cd
		AND (pack_unit_qty = OLD.pack_unit_qty OR pack_unit_qty IS NULL AND OLD.pack_unit_qty IS NULL)
		AND (base_unit_qty = OLD.base_unit_qty OR base_unit_qty IS NULL AND OLD.base_unit_qty IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_stk_lst$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND loc_cd = OLD.loc_cd
		AND str_ln_cd = OLD.str_ln_cd
		AND stk_arrv_bp_cd = OLD.stk_arrv_bp_cd
		AND lot_no = OLD.lot_no
		AND sublot_no = OLD.sublot_no
		AND sno1 = OLD.sno1
		AND sno2 = OLD.sno2
		AND sno3 = OLD.sno3
		AND sno4 = OLD.sno4
		AND fix_no_typ = OLD.fix_no_typ
		AND fix_no = OLD.fix_no
		AND pack_unit_cd = OLD.pack_unit_cd
		AND gd_cd = OLD.gd_cd
		AND in_xfr_typ = OLD.in_xfr_typ
		AND quality_typ = OLD.quality_typ
		AND asst_typ = OLD.asst_typ
		AND stk_insp_typ = OLD.stk_insp_typ
		AND stk_id_typ = OLD.stk_id_typ
		AND stk_bp_cd = OLD.stk_bp_cd
		AND (pack_unit_qty = OLD.pack_unit_qty OR pack_unit_qty IS NULL AND OLD.pack_unit_qty IS NULL)
		AND (base_unit_qty = OLD.base_unit_qty OR base_unit_qty IS NULL AND OLD.base_unit_qty IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_stk_lst$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_stk_lst
FOR EACH ROW
EXECUTE PROCEDURE msw_stk_lst$func();
;

