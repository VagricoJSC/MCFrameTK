\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_stktk_act_key()
RETURNS TABLE (
	stktk_base_dt timestamp(0),
	loc_cd varchar,
	str_ln_cd varchar,
	stk_arrv_bp_cd varchar,
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
	fix_no_flg char,
	trd_unit_cd varchar,
	gd_cd varchar,
	in_xfr_typ varchar,
	quality_typ varchar,
	stk_insp_typ varchar,
	stk_id_typ varchar,
	stk_bp_cd varchar,
	keep_data_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_stktk_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_stktk_act_key$temp(
				stktk_base_dt timestamp(0)  NULL,
				loc_cd varchar (20) NULL,
				str_ln_cd varchar (10) DEFAULT '*' NULL,
				stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
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
				fix_no_flg char (1) DEFAULT '0' NULL,
				trd_unit_cd varchar (5) NULL,
				gd_cd varchar (2) NULL,
				in_xfr_typ varchar (1) NULL,
				quality_typ varchar (1) NULL,
				stk_insp_typ varchar (1) NULL,
				stk_id_typ varchar (1) NULL,
				stk_bp_cd varchar (20) DEFAULT '*' NULL,
				keep_data_flg char (1) DEFAULT '0' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_stktk_act_key_pk_ie ON msw_stktk_act_key$temp
				USING BTREE (stktk_base_dt,loc_cd,str_ln_cd,stk_arrv_bp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,fix_no_flg,trd_unit_cd,gd_cd,in_xfr_typ,quality_typ,stk_insp_typ,stk_id_typ,stk_bp_cd,keep_data_flg);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_stktk_act_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_stktk_act_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_stktk_act_key
AS
SELECT *
FROM msw_stktk_act_key();
ALTER VIEW msw_stktk_act_key ALTER COLUMN str_ln_cd SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN stk_arrv_bp_cd SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN sno4 SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN fix_no_flg SET DEFAULT '0';
ALTER VIEW msw_stktk_act_key ALTER COLUMN stk_bp_cd SET DEFAULT '*';
ALTER VIEW msw_stktk_act_key ALTER COLUMN keep_data_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_stktk_act_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_stktk_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_stktk_act_key$temp(
				stktk_base_dt timestamp(0)  NULL,
				loc_cd varchar (20) NULL,
				str_ln_cd varchar (10) DEFAULT '*' NULL,
				stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
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
				fix_no_flg char (1) DEFAULT '0' NULL,
				trd_unit_cd varchar (5) NULL,
				gd_cd varchar (2) NULL,
				in_xfr_typ varchar (1) NULL,
				quality_typ varchar (1) NULL,
				stk_insp_typ varchar (1) NULL,
				stk_id_typ varchar (1) NULL,
				stk_bp_cd varchar (20) DEFAULT '*' NULL,
				keep_data_flg char (1) DEFAULT '0' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_stktk_act_key_pk_ie ON msw_stktk_act_key$temp
				USING BTREE (stktk_base_dt,loc_cd,str_ln_cd,stk_arrv_bp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,fix_no_flg,trd_unit_cd,gd_cd,in_xfr_typ,quality_typ,stk_insp_typ,stk_id_typ,stk_bp_cd,keep_data_flg);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_stktk_act_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_stktk_act_key$temp(
			stktk_base_dt,
			loc_cd,
			str_ln_cd,
			stk_arrv_bp_cd,
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
			fix_no_flg,
			trd_unit_cd,
			gd_cd,
			in_xfr_typ,
			quality_typ,
			stk_insp_typ,
			stk_id_typ,
			stk_bp_cd,
			keep_data_flg
		)VALUES (
			NEW.stktk_base_dt,
			NEW.loc_cd,
			NEW.str_ln_cd,
			NEW.stk_arrv_bp_cd,
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
			NEW.fix_no_flg,
			NEW.trd_unit_cd,
			NEW.gd_cd,
			NEW.in_xfr_typ,
			NEW.quality_typ,
			NEW.stk_insp_typ,
			NEW.stk_id_typ,
			NEW.stk_bp_cd,
			NEW.keep_data_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_stktk_act_key$temp
		SET 
			stktk_base_dt = NEW.stktk_base_dt,
			loc_cd = NEW.loc_cd,
			str_ln_cd = NEW.str_ln_cd,
			stk_arrv_bp_cd = NEW.stk_arrv_bp_cd,
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
			fix_no_flg = NEW.fix_no_flg,
			trd_unit_cd = NEW.trd_unit_cd,
			gd_cd = NEW.gd_cd,
			in_xfr_typ = NEW.in_xfr_typ,
			quality_typ = NEW.quality_typ,
			stk_insp_typ = NEW.stk_insp_typ,
			stk_id_typ = NEW.stk_id_typ,
			stk_bp_cd = NEW.stk_bp_cd,
			keep_data_flg = NEW.keep_data_flg
		WHERE 0=0
		AND (stktk_base_dt = OLD.stktk_base_dt OR stktk_base_dt IS NULL AND OLD.stktk_base_dt IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL)
		AND (stk_arrv_bp_cd = OLD.stk_arrv_bp_cd OR stk_arrv_bp_cd IS NULL AND OLD.stk_arrv_bp_cd IS NULL)
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
		AND (fix_no_flg = OLD.fix_no_flg OR fix_no_flg IS NULL AND OLD.fix_no_flg IS NULL)
		AND (trd_unit_cd = OLD.trd_unit_cd OR trd_unit_cd IS NULL AND OLD.trd_unit_cd IS NULL)
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL)
		AND (in_xfr_typ = OLD.in_xfr_typ OR in_xfr_typ IS NULL AND OLD.in_xfr_typ IS NULL)
		AND (quality_typ = OLD.quality_typ OR quality_typ IS NULL AND OLD.quality_typ IS NULL)
		AND (stk_insp_typ = OLD.stk_insp_typ OR stk_insp_typ IS NULL AND OLD.stk_insp_typ IS NULL)
		AND (stk_id_typ = OLD.stk_id_typ OR stk_id_typ IS NULL AND OLD.stk_id_typ IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND (keep_data_flg = OLD.keep_data_flg OR keep_data_flg IS NULL AND OLD.keep_data_flg IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_stktk_act_key$temp
		WHERE 0=0
		AND (stktk_base_dt = OLD.stktk_base_dt OR stktk_base_dt IS NULL AND OLD.stktk_base_dt IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL)
		AND (stk_arrv_bp_cd = OLD.stk_arrv_bp_cd OR stk_arrv_bp_cd IS NULL AND OLD.stk_arrv_bp_cd IS NULL)
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
		AND (fix_no_flg = OLD.fix_no_flg OR fix_no_flg IS NULL AND OLD.fix_no_flg IS NULL)
		AND (trd_unit_cd = OLD.trd_unit_cd OR trd_unit_cd IS NULL AND OLD.trd_unit_cd IS NULL)
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL)
		AND (in_xfr_typ = OLD.in_xfr_typ OR in_xfr_typ IS NULL AND OLD.in_xfr_typ IS NULL)
		AND (quality_typ = OLD.quality_typ OR quality_typ IS NULL AND OLD.quality_typ IS NULL)
		AND (stk_insp_typ = OLD.stk_insp_typ OR stk_insp_typ IS NULL AND OLD.stk_insp_typ IS NULL)
		AND (stk_id_typ = OLD.stk_id_typ OR stk_id_typ IS NULL AND OLD.stk_id_typ IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND (keep_data_flg = OLD.keep_data_flg OR keep_data_flg IS NULL AND OLD.keep_data_flg IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_stktk_act_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_stktk_act_key
FOR EACH ROW
EXECUTE PROCEDURE msw_stktk_act_key$func();
;

