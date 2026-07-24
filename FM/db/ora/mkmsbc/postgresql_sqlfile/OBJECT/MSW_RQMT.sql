\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_rqmt()
RETURNS TABLE (
	peg_no numeric,
	rqmt_no varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	strg_loc_cd varchar,
	due_dt timestamp(0),
	rqmt_qty numeric,
	mfg_loc_cd varchar,
	sppl_cd varchar,
	rqst_loc_cd varchar,
	fix_flg char,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	wg_cd varchar,
	rqmt_gnrt_typ varchar,
	rqmt_typ varchar,
	intr_rmrks varchar,
	sub_char1 varchar,
	sub_char2 varchar,
	sub_char3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_rqmt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_rqmt$temp(
				peg_no numeric (9,0) NULL,
				rqmt_no varchar (15) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				strg_loc_cd varchar (20) NULL,
				due_dt timestamp(0)  NULL,
				rqmt_qty numeric (21,8) NULL,
				mfg_loc_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				rqst_loc_cd varchar (20) NULL,
				fix_flg char (1) DEFAULT '0' NOT NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				wg_cd varchar (10) NULL,
				rqmt_gnrt_typ varchar (1) NULL,
				rqmt_typ varchar (1) NULL,
				intr_rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_rqmt$temp
				ADD CONSTRAINT msw_rqmt_ck01 CHECK (fix_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_rqmt$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_rqmt$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_rqmt
AS
SELECT *
FROM msw_rqmt();
ALTER VIEW msw_rqmt ALTER COLUMN fix_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_rqmt$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_rqmt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_rqmt$temp(
				peg_no numeric (9,0) NULL,
				rqmt_no varchar (15) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				strg_loc_cd varchar (20) NULL,
				due_dt timestamp(0)  NULL,
				rqmt_qty numeric (21,8) NULL,
				mfg_loc_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				rqst_loc_cd varchar (20) NULL,
				fix_flg char (1) DEFAULT '0' NOT NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				wg_cd varchar (10) NULL,
				rqmt_gnrt_typ varchar (1) NULL,
				rqmt_typ varchar (1) NULL,
				intr_rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_rqmt$temp
			ADD CONSTRAINT msw_rqmt_ck01 CHECK (fix_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_rqmt$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_rqmt$temp(
			peg_no,
			rqmt_no,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			strg_loc_cd,
			due_dt,
			rqmt_qty,
			mfg_loc_cd,
			sppl_cd,
			rqst_loc_cd,
			fix_flg,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd,
			rqmt_gnrt_typ,
			rqmt_typ,
			intr_rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		)VALUES (
			NEW.peg_no,
			NEW.rqmt_no,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.strg_loc_cd,
			NEW.due_dt,
			NEW.rqmt_qty,
			NEW.mfg_loc_cd,
			NEW.sppl_cd,
			NEW.rqst_loc_cd,
			NEW.fix_flg,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.wg_cd,
			NEW.rqmt_gnrt_typ,
			NEW.rqmt_typ,
			NEW.intr_rmrks,
			NEW.sub_char1,
			NEW.sub_char2,
			NEW.sub_char3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_rqmt$temp
		SET 
			peg_no = NEW.peg_no,
			rqmt_no = NEW.rqmt_no,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			strg_loc_cd = NEW.strg_loc_cd,
			due_dt = NEW.due_dt,
			rqmt_qty = NEW.rqmt_qty,
			mfg_loc_cd = NEW.mfg_loc_cd,
			sppl_cd = NEW.sppl_cd,
			rqst_loc_cd = NEW.rqst_loc_cd,
			fix_flg = NEW.fix_flg,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			wg_cd = NEW.wg_cd,
			rqmt_gnrt_typ = NEW.rqmt_gnrt_typ,
			rqmt_typ = NEW.rqmt_typ,
			intr_rmrks = NEW.intr_rmrks,
			sub_char1 = NEW.sub_char1,
			sub_char2 = NEW.sub_char2,
			sub_char3 = NEW.sub_char3
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (strg_loc_cd = OLD.strg_loc_cd OR strg_loc_cd IS NULL AND OLD.strg_loc_cd IS NULL)
		AND (due_dt = OLD.due_dt OR due_dt IS NULL AND OLD.due_dt IS NULL)
		AND (rqmt_qty = OLD.rqmt_qty OR rqmt_qty IS NULL AND OLD.rqmt_qty IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (rqst_loc_cd = OLD.rqst_loc_cd OR rqst_loc_cd IS NULL AND OLD.rqst_loc_cd IS NULL)
		AND fix_flg = OLD.fix_flg
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (rqmt_gnrt_typ = OLD.rqmt_gnrt_typ OR rqmt_gnrt_typ IS NULL AND OLD.rqmt_gnrt_typ IS NULL)
		AND (rqmt_typ = OLD.rqmt_typ OR rqmt_typ IS NULL AND OLD.rqmt_typ IS NULL)
		AND (intr_rmrks = OLD.intr_rmrks OR intr_rmrks IS NULL AND OLD.intr_rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_rqmt$temp
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (strg_loc_cd = OLD.strg_loc_cd OR strg_loc_cd IS NULL AND OLD.strg_loc_cd IS NULL)
		AND (due_dt = OLD.due_dt OR due_dt IS NULL AND OLD.due_dt IS NULL)
		AND (rqmt_qty = OLD.rqmt_qty OR rqmt_qty IS NULL AND OLD.rqmt_qty IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (rqst_loc_cd = OLD.rqst_loc_cd OR rqst_loc_cd IS NULL AND OLD.rqst_loc_cd IS NULL)
		AND fix_flg = OLD.fix_flg
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (rqmt_gnrt_typ = OLD.rqmt_gnrt_typ OR rqmt_gnrt_typ IS NULL AND OLD.rqmt_gnrt_typ IS NULL)
		AND (rqmt_typ = OLD.rqmt_typ OR rqmt_typ IS NULL AND OLD.rqmt_typ IS NULL)
		AND (intr_rmrks = OLD.intr_rmrks OR intr_rmrks IS NULL AND OLD.intr_rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_rqmt$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_rqmt
FOR EACH ROW
EXECUTE PROCEDURE msw_rqmt$func();
;

