\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_num_arg()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	loc_cd varchar,
	dpt_cd varchar,
	co_cd varchar,
	bp_cd varchar,
	wg_cd varchar,
	site_cd varchar,
	lot_no varchar,
	chd_lot_no varchar,
	chd_sublot_no varchar,
	bp_lot_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	trd_cd varchar,
	dt timestamp(0),
	str varchar,
	str2 varchar,
	str3 varchar,
	num numeric,
	num_ptn_cd varchar,
	peg_no numeric,
	new_no varchar,
	itm_cd_label_nm varchar,
	itm_sub1_label_nm varchar,
	itm_sub2_label_nm varchar,
	itm_sub3_label_nm varchar,
	loc_cd_label_nm varchar,
	dpt_cd_label_nm varchar,
	co_cd_label_nm varchar,
	bp_cd_label_nm varchar,
	wg_cd_label_nm varchar,
	site_cd_label_nm varchar,
	lot_no_label_nm varchar,
	chd_lot_no_label_nm varchar,
	chd_sublot_no_label_nm varchar,
	bp_lot_no_label_nm varchar,
	sno1_label_nm varchar,
	sno2_label_nm varchar,
	sno3_label_nm varchar,
	sno4_label_nm varchar,
	trd_cd_label_nm varchar,
	dt_label_nm varchar,
	str_label_nm varchar,
	str2_label_nm varchar,
	str3_label_nm varchar,
	num_label_nm varchar,
	err_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_num_arg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_num_arg$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				loc_cd varchar (20) NULL,
				dpt_cd varchar (20) NULL,
				co_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				wg_cd varchar (10) NULL,
				site_cd varchar (10) NULL,
				lot_no varchar (15) NULL,
				chd_lot_no varchar (15) NULL,
				chd_sublot_no varchar (15) NULL,
				bp_lot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				trd_cd varchar (4) NULL,
				dt timestamp(0)  NULL,
				str varchar (20) NULL,
				str2 varchar (20) NULL,
				str3 varchar (20) NULL,
				num numeric (22,0) NULL,
				num_ptn_cd varchar (10) NULL,
				peg_no numeric (9,0) NULL,
				new_no varchar (20) NULL,
				itm_cd_label_nm varchar (500) NULL,
				itm_sub1_label_nm varchar (500) NULL,
				itm_sub2_label_nm varchar (500) NULL,
				itm_sub3_label_nm varchar (500) NULL,
				loc_cd_label_nm varchar (500) NULL,
				dpt_cd_label_nm varchar (500) NULL,
				co_cd_label_nm varchar (500) NULL,
				bp_cd_label_nm varchar (500) NULL,
				wg_cd_label_nm varchar (500) NULL,
				site_cd_label_nm varchar (500) NULL,
				lot_no_label_nm varchar (500) NULL,
				chd_lot_no_label_nm varchar (500) NULL,
				chd_sublot_no_label_nm varchar (500) NULL,
				bp_lot_no_label_nm varchar (500) NULL,
				sno1_label_nm varchar (500) NULL,
				sno2_label_nm varchar (500) NULL,
				sno3_label_nm varchar (500) NULL,
				sno4_label_nm varchar (500) NULL,
				trd_cd_label_nm varchar (500) NULL,
				dt_label_nm varchar (500) NULL,
				str_label_nm varchar (500) NULL,
				str2_label_nm varchar (500) NULL,
				str3_label_nm varchar (500) NULL,
				num_label_nm varchar (500) NULL,
				err_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE maw_num_arg$temp
				ADD CONSTRAINT maw_num_arg_ck01 CHECK (err_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_num_arg$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_num_arg$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_num_arg
AS
SELECT *
FROM maw_num_arg();
ALTER VIEW maw_num_arg ALTER COLUMN err_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION maw_num_arg$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_num_arg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_num_arg$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				loc_cd varchar (20) NULL,
				dpt_cd varchar (20) NULL,
				co_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				wg_cd varchar (10) NULL,
				site_cd varchar (10) NULL,
				lot_no varchar (15) NULL,
				chd_lot_no varchar (15) NULL,
				chd_sublot_no varchar (15) NULL,
				bp_lot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				trd_cd varchar (4) NULL,
				dt timestamp(0)  NULL,
				str varchar (20) NULL,
				str2 varchar (20) NULL,
				str3 varchar (20) NULL,
				num numeric (22,0) NULL,
				num_ptn_cd varchar (10) NULL,
				peg_no numeric (9,0) NULL,
				new_no varchar (20) NULL,
				itm_cd_label_nm varchar (500) NULL,
				itm_sub1_label_nm varchar (500) NULL,
				itm_sub2_label_nm varchar (500) NULL,
				itm_sub3_label_nm varchar (500) NULL,
				loc_cd_label_nm varchar (500) NULL,
				dpt_cd_label_nm varchar (500) NULL,
				co_cd_label_nm varchar (500) NULL,
				bp_cd_label_nm varchar (500) NULL,
				wg_cd_label_nm varchar (500) NULL,
				site_cd_label_nm varchar (500) NULL,
				lot_no_label_nm varchar (500) NULL,
				chd_lot_no_label_nm varchar (500) NULL,
				chd_sublot_no_label_nm varchar (500) NULL,
				bp_lot_no_label_nm varchar (500) NULL,
				sno1_label_nm varchar (500) NULL,
				sno2_label_nm varchar (500) NULL,
				sno3_label_nm varchar (500) NULL,
				sno4_label_nm varchar (500) NULL,
				trd_cd_label_nm varchar (500) NULL,
				dt_label_nm varchar (500) NULL,
				str_label_nm varchar (500) NULL,
				str2_label_nm varchar (500) NULL,
				str3_label_nm varchar (500) NULL,
				num_label_nm varchar (500) NULL,
				err_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE maw_num_arg$temp
			ADD CONSTRAINT maw_num_arg_ck01 CHECK (err_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_num_arg$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_num_arg$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			dpt_cd,
			co_cd,
			bp_cd,
			wg_cd,
			site_cd,
			lot_no,
			chd_lot_no,
			chd_sublot_no,
			bp_lot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			trd_cd,
			dt,
			str,
			str2,
			str3,
			num,
			num_ptn_cd,
			peg_no,
			new_no,
			itm_cd_label_nm,
			itm_sub1_label_nm,
			itm_sub2_label_nm,
			itm_sub3_label_nm,
			loc_cd_label_nm,
			dpt_cd_label_nm,
			co_cd_label_nm,
			bp_cd_label_nm,
			wg_cd_label_nm,
			site_cd_label_nm,
			lot_no_label_nm,
			chd_lot_no_label_nm,
			chd_sublot_no_label_nm,
			bp_lot_no_label_nm,
			sno1_label_nm,
			sno2_label_nm,
			sno3_label_nm,
			sno4_label_nm,
			trd_cd_label_nm,
			dt_label_nm,
			str_label_nm,
			str2_label_nm,
			str3_label_nm,
			num_label_nm,
			err_flg
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.loc_cd,
			NEW.dpt_cd,
			NEW.co_cd,
			NEW.bp_cd,
			NEW.wg_cd,
			NEW.site_cd,
			NEW.lot_no,
			NEW.chd_lot_no,
			NEW.chd_sublot_no,
			NEW.bp_lot_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.trd_cd,
			NEW.dt,
			NEW.str,
			NEW.str2,
			NEW.str3,
			NEW.num,
			NEW.num_ptn_cd,
			NEW.peg_no,
			NEW.new_no,
			NEW.itm_cd_label_nm,
			NEW.itm_sub1_label_nm,
			NEW.itm_sub2_label_nm,
			NEW.itm_sub3_label_nm,
			NEW.loc_cd_label_nm,
			NEW.dpt_cd_label_nm,
			NEW.co_cd_label_nm,
			NEW.bp_cd_label_nm,
			NEW.wg_cd_label_nm,
			NEW.site_cd_label_nm,
			NEW.lot_no_label_nm,
			NEW.chd_lot_no_label_nm,
			NEW.chd_sublot_no_label_nm,
			NEW.bp_lot_no_label_nm,
			NEW.sno1_label_nm,
			NEW.sno2_label_nm,
			NEW.sno3_label_nm,
			NEW.sno4_label_nm,
			NEW.trd_cd_label_nm,
			NEW.dt_label_nm,
			NEW.str_label_nm,
			NEW.str2_label_nm,
			NEW.str3_label_nm,
			NEW.num_label_nm,
			NEW.err_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_num_arg$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			loc_cd = NEW.loc_cd,
			dpt_cd = NEW.dpt_cd,
			co_cd = NEW.co_cd,
			bp_cd = NEW.bp_cd,
			wg_cd = NEW.wg_cd,
			site_cd = NEW.site_cd,
			lot_no = NEW.lot_no,
			chd_lot_no = NEW.chd_lot_no,
			chd_sublot_no = NEW.chd_sublot_no,
			bp_lot_no = NEW.bp_lot_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			trd_cd = NEW.trd_cd,
			dt = NEW.dt,
			str = NEW.str,
			str2 = NEW.str2,
			str3 = NEW.str3,
			num = NEW.num,
			num_ptn_cd = NEW.num_ptn_cd,
			peg_no = NEW.peg_no,
			new_no = NEW.new_no,
			itm_cd_label_nm = NEW.itm_cd_label_nm,
			itm_sub1_label_nm = NEW.itm_sub1_label_nm,
			itm_sub2_label_nm = NEW.itm_sub2_label_nm,
			itm_sub3_label_nm = NEW.itm_sub3_label_nm,
			loc_cd_label_nm = NEW.loc_cd_label_nm,
			dpt_cd_label_nm = NEW.dpt_cd_label_nm,
			co_cd_label_nm = NEW.co_cd_label_nm,
			bp_cd_label_nm = NEW.bp_cd_label_nm,
			wg_cd_label_nm = NEW.wg_cd_label_nm,
			site_cd_label_nm = NEW.site_cd_label_nm,
			lot_no_label_nm = NEW.lot_no_label_nm,
			chd_lot_no_label_nm = NEW.chd_lot_no_label_nm,
			chd_sublot_no_label_nm = NEW.chd_sublot_no_label_nm,
			bp_lot_no_label_nm = NEW.bp_lot_no_label_nm,
			sno1_label_nm = NEW.sno1_label_nm,
			sno2_label_nm = NEW.sno2_label_nm,
			sno3_label_nm = NEW.sno3_label_nm,
			sno4_label_nm = NEW.sno4_label_nm,
			trd_cd_label_nm = NEW.trd_cd_label_nm,
			dt_label_nm = NEW.dt_label_nm,
			str_label_nm = NEW.str_label_nm,
			str2_label_nm = NEW.str2_label_nm,
			str3_label_nm = NEW.str3_label_nm,
			num_label_nm = NEW.num_label_nm,
			err_flg = NEW.err_flg
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (co_cd = OLD.co_cd OR co_cd IS NULL AND OLD.co_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (site_cd = OLD.site_cd OR site_cd IS NULL AND OLD.site_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (chd_lot_no = OLD.chd_lot_no OR chd_lot_no IS NULL AND OLD.chd_lot_no IS NULL)
		AND (chd_sublot_no = OLD.chd_sublot_no OR chd_sublot_no IS NULL AND OLD.chd_sublot_no IS NULL)
		AND (bp_lot_no = OLD.bp_lot_no OR bp_lot_no IS NULL AND OLD.bp_lot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (trd_cd = OLD.trd_cd OR trd_cd IS NULL AND OLD.trd_cd IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (str = OLD.str OR str IS NULL AND OLD.str IS NULL)
		AND (str2 = OLD.str2 OR str2 IS NULL AND OLD.str2 IS NULL)
		AND (str3 = OLD.str3 OR str3 IS NULL AND OLD.str3 IS NULL)
		AND (num = OLD.num OR num IS NULL AND OLD.num IS NULL)
		AND (num_ptn_cd = OLD.num_ptn_cd OR num_ptn_cd IS NULL AND OLD.num_ptn_cd IS NULL)
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (new_no = OLD.new_no OR new_no IS NULL AND OLD.new_no IS NULL)
		AND (itm_cd_label_nm = OLD.itm_cd_label_nm OR itm_cd_label_nm IS NULL AND OLD.itm_cd_label_nm IS NULL)
		AND (itm_sub1_label_nm = OLD.itm_sub1_label_nm OR itm_sub1_label_nm IS NULL AND OLD.itm_sub1_label_nm IS NULL)
		AND (itm_sub2_label_nm = OLD.itm_sub2_label_nm OR itm_sub2_label_nm IS NULL AND OLD.itm_sub2_label_nm IS NULL)
		AND (itm_sub3_label_nm = OLD.itm_sub3_label_nm OR itm_sub3_label_nm IS NULL AND OLD.itm_sub3_label_nm IS NULL)
		AND (loc_cd_label_nm = OLD.loc_cd_label_nm OR loc_cd_label_nm IS NULL AND OLD.loc_cd_label_nm IS NULL)
		AND (dpt_cd_label_nm = OLD.dpt_cd_label_nm OR dpt_cd_label_nm IS NULL AND OLD.dpt_cd_label_nm IS NULL)
		AND (co_cd_label_nm = OLD.co_cd_label_nm OR co_cd_label_nm IS NULL AND OLD.co_cd_label_nm IS NULL)
		AND (bp_cd_label_nm = OLD.bp_cd_label_nm OR bp_cd_label_nm IS NULL AND OLD.bp_cd_label_nm IS NULL)
		AND (wg_cd_label_nm = OLD.wg_cd_label_nm OR wg_cd_label_nm IS NULL AND OLD.wg_cd_label_nm IS NULL)
		AND (site_cd_label_nm = OLD.site_cd_label_nm OR site_cd_label_nm IS NULL AND OLD.site_cd_label_nm IS NULL)
		AND (lot_no_label_nm = OLD.lot_no_label_nm OR lot_no_label_nm IS NULL AND OLD.lot_no_label_nm IS NULL)
		AND (chd_lot_no_label_nm = OLD.chd_lot_no_label_nm OR chd_lot_no_label_nm IS NULL AND OLD.chd_lot_no_label_nm IS NULL)
		AND (chd_sublot_no_label_nm = OLD.chd_sublot_no_label_nm OR chd_sublot_no_label_nm IS NULL AND OLD.chd_sublot_no_label_nm IS NULL)
		AND (bp_lot_no_label_nm = OLD.bp_lot_no_label_nm OR bp_lot_no_label_nm IS NULL AND OLD.bp_lot_no_label_nm IS NULL)
		AND (sno1_label_nm = OLD.sno1_label_nm OR sno1_label_nm IS NULL AND OLD.sno1_label_nm IS NULL)
		AND (sno2_label_nm = OLD.sno2_label_nm OR sno2_label_nm IS NULL AND OLD.sno2_label_nm IS NULL)
		AND (sno3_label_nm = OLD.sno3_label_nm OR sno3_label_nm IS NULL AND OLD.sno3_label_nm IS NULL)
		AND (sno4_label_nm = OLD.sno4_label_nm OR sno4_label_nm IS NULL AND OLD.sno4_label_nm IS NULL)
		AND (trd_cd_label_nm = OLD.trd_cd_label_nm OR trd_cd_label_nm IS NULL AND OLD.trd_cd_label_nm IS NULL)
		AND (dt_label_nm = OLD.dt_label_nm OR dt_label_nm IS NULL AND OLD.dt_label_nm IS NULL)
		AND (str_label_nm = OLD.str_label_nm OR str_label_nm IS NULL AND OLD.str_label_nm IS NULL)
		AND (str2_label_nm = OLD.str2_label_nm OR str2_label_nm IS NULL AND OLD.str2_label_nm IS NULL)
		AND (str3_label_nm = OLD.str3_label_nm OR str3_label_nm IS NULL AND OLD.str3_label_nm IS NULL)
		AND (num_label_nm = OLD.num_label_nm OR num_label_nm IS NULL AND OLD.num_label_nm IS NULL)
		AND err_flg = OLD.err_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_num_arg$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (co_cd = OLD.co_cd OR co_cd IS NULL AND OLD.co_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (site_cd = OLD.site_cd OR site_cd IS NULL AND OLD.site_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (chd_lot_no = OLD.chd_lot_no OR chd_lot_no IS NULL AND OLD.chd_lot_no IS NULL)
		AND (chd_sublot_no = OLD.chd_sublot_no OR chd_sublot_no IS NULL AND OLD.chd_sublot_no IS NULL)
		AND (bp_lot_no = OLD.bp_lot_no OR bp_lot_no IS NULL AND OLD.bp_lot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (trd_cd = OLD.trd_cd OR trd_cd IS NULL AND OLD.trd_cd IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (str = OLD.str OR str IS NULL AND OLD.str IS NULL)
		AND (str2 = OLD.str2 OR str2 IS NULL AND OLD.str2 IS NULL)
		AND (str3 = OLD.str3 OR str3 IS NULL AND OLD.str3 IS NULL)
		AND (num = OLD.num OR num IS NULL AND OLD.num IS NULL)
		AND (num_ptn_cd = OLD.num_ptn_cd OR num_ptn_cd IS NULL AND OLD.num_ptn_cd IS NULL)
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (new_no = OLD.new_no OR new_no IS NULL AND OLD.new_no IS NULL)
		AND (itm_cd_label_nm = OLD.itm_cd_label_nm OR itm_cd_label_nm IS NULL AND OLD.itm_cd_label_nm IS NULL)
		AND (itm_sub1_label_nm = OLD.itm_sub1_label_nm OR itm_sub1_label_nm IS NULL AND OLD.itm_sub1_label_nm IS NULL)
		AND (itm_sub2_label_nm = OLD.itm_sub2_label_nm OR itm_sub2_label_nm IS NULL AND OLD.itm_sub2_label_nm IS NULL)
		AND (itm_sub3_label_nm = OLD.itm_sub3_label_nm OR itm_sub3_label_nm IS NULL AND OLD.itm_sub3_label_nm IS NULL)
		AND (loc_cd_label_nm = OLD.loc_cd_label_nm OR loc_cd_label_nm IS NULL AND OLD.loc_cd_label_nm IS NULL)
		AND (dpt_cd_label_nm = OLD.dpt_cd_label_nm OR dpt_cd_label_nm IS NULL AND OLD.dpt_cd_label_nm IS NULL)
		AND (co_cd_label_nm = OLD.co_cd_label_nm OR co_cd_label_nm IS NULL AND OLD.co_cd_label_nm IS NULL)
		AND (bp_cd_label_nm = OLD.bp_cd_label_nm OR bp_cd_label_nm IS NULL AND OLD.bp_cd_label_nm IS NULL)
		AND (wg_cd_label_nm = OLD.wg_cd_label_nm OR wg_cd_label_nm IS NULL AND OLD.wg_cd_label_nm IS NULL)
		AND (site_cd_label_nm = OLD.site_cd_label_nm OR site_cd_label_nm IS NULL AND OLD.site_cd_label_nm IS NULL)
		AND (lot_no_label_nm = OLD.lot_no_label_nm OR lot_no_label_nm IS NULL AND OLD.lot_no_label_nm IS NULL)
		AND (chd_lot_no_label_nm = OLD.chd_lot_no_label_nm OR chd_lot_no_label_nm IS NULL AND OLD.chd_lot_no_label_nm IS NULL)
		AND (chd_sublot_no_label_nm = OLD.chd_sublot_no_label_nm OR chd_sublot_no_label_nm IS NULL AND OLD.chd_sublot_no_label_nm IS NULL)
		AND (bp_lot_no_label_nm = OLD.bp_lot_no_label_nm OR bp_lot_no_label_nm IS NULL AND OLD.bp_lot_no_label_nm IS NULL)
		AND (sno1_label_nm = OLD.sno1_label_nm OR sno1_label_nm IS NULL AND OLD.sno1_label_nm IS NULL)
		AND (sno2_label_nm = OLD.sno2_label_nm OR sno2_label_nm IS NULL AND OLD.sno2_label_nm IS NULL)
		AND (sno3_label_nm = OLD.sno3_label_nm OR sno3_label_nm IS NULL AND OLD.sno3_label_nm IS NULL)
		AND (sno4_label_nm = OLD.sno4_label_nm OR sno4_label_nm IS NULL AND OLD.sno4_label_nm IS NULL)
		AND (trd_cd_label_nm = OLD.trd_cd_label_nm OR trd_cd_label_nm IS NULL AND OLD.trd_cd_label_nm IS NULL)
		AND (dt_label_nm = OLD.dt_label_nm OR dt_label_nm IS NULL AND OLD.dt_label_nm IS NULL)
		AND (str_label_nm = OLD.str_label_nm OR str_label_nm IS NULL AND OLD.str_label_nm IS NULL)
		AND (str2_label_nm = OLD.str2_label_nm OR str2_label_nm IS NULL AND OLD.str2_label_nm IS NULL)
		AND (str3_label_nm = OLD.str3_label_nm OR str3_label_nm IS NULL AND OLD.str3_label_nm IS NULL)
		AND (num_label_nm = OLD.num_label_nm OR num_label_nm IS NULL AND OLD.num_label_nm IS NULL)
		AND err_flg = OLD.err_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_num_arg$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_num_arg
FOR EACH ROW
EXECUTE PROCEDURE maw_num_arg$func();
;

