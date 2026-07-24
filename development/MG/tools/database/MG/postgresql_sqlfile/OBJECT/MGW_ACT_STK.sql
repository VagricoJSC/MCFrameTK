\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_stk()
RETURNS TABLE (
	wg_cd varchar,
	mng_dpt_cd varchar,
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
	bp_cd varchar,
	asst_typ varchar,
	qty numeric,
	first_gr_dt timestamp(0),
	vld_dt timestamp(0),
	lmt_dt timestamp(0),
	non_mov_base_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_stk$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_stk$temp(
				wg_cd varchar (10) NOT NULL,
				mng_dpt_cd varchar (20) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				lot_no varchar (15) DEFAULT '*' NOT NULL,
				sublot_no varchar (15) DEFAULT '*' NOT NULL,
				sno1 varchar (15) DEFAULT '*' NOT NULL,
				sno2 varchar (15) DEFAULT '*' NOT NULL,
				sno3 varchar (15) DEFAULT '*' NOT NULL,
				sno4 varchar (15) DEFAULT '*' NOT NULL,
				bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				first_gr_dt timestamp(0)  NULL,
				vld_dt timestamp(0)  NULL,
				lmt_dt timestamp(0)  NULL,
				non_mov_base_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_stk_ie01 ON mgw_act_stk$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			ALTER TABLE mgw_act_stk$temp
			ADD CONSTRAINT mgw_act_stk_pk UNIQUE(wg_cd,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,bp_cd,asst_typ);
			CREATE UNIQUE INDEX MGW_ACT_STK_pk_ie ON mgw_act_stk$temp (wg_cd,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,COALESCE(bp_cd,''),asst_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_stk$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_stk$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_stk
AS
SELECT *
FROM mgw_act_stk();
ALTER VIEW mgw_act_stk ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_act_stk ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_act_stk ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_act_stk ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_act_stk ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_act_stk ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_act_stk ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_act_stk ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_act_stk ALTER COLUMN sno4 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_act_stk$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_stk$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_stk$temp(
				wg_cd varchar (10) NOT NULL,
				mng_dpt_cd varchar (20) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				lot_no varchar (15) DEFAULT '*' NOT NULL,
				sublot_no varchar (15) DEFAULT '*' NOT NULL,
				sno1 varchar (15) DEFAULT '*' NOT NULL,
				sno2 varchar (15) DEFAULT '*' NOT NULL,
				sno3 varchar (15) DEFAULT '*' NOT NULL,
				sno4 varchar (15) DEFAULT '*' NOT NULL,
				bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				first_gr_dt timestamp(0)  NULL,
				vld_dt timestamp(0)  NULL,
				lmt_dt timestamp(0)  NULL,
				non_mov_base_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_stk_ie01 ON mgw_act_stk$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			ALTER TABLE mgw_act_stk$temp
			ADD CONSTRAINT mgw_act_stk_pk UNIQUE(wg_cd,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,bp_cd,asst_typ);
			CREATE UNIQUE INDEX MGW_ACT_STK_pk_ie ON mgw_act_stk$temp (wg_cd,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,COALESCE(bp_cd,''),asst_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_stk$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_stk$temp(
			wg_cd,
			mng_dpt_cd,
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
			bp_cd,
			asst_typ,
			qty,
			first_gr_dt,
			vld_dt,
			lmt_dt,
			non_mov_base_dt
		)VALUES (
			NEW.wg_cd,
			NEW.mng_dpt_cd,
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
			NEW.bp_cd,
			NEW.asst_typ,
			NEW.qty,
			NEW.first_gr_dt,
			NEW.vld_dt,
			NEW.lmt_dt,
			NEW.non_mov_base_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_stk$temp
		SET 
			wg_cd = NEW.wg_cd,
			mng_dpt_cd = NEW.mng_dpt_cd,
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
			bp_cd = NEW.bp_cd,
			asst_typ = NEW.asst_typ,
			qty = NEW.qty,
			first_gr_dt = NEW.first_gr_dt,
			vld_dt = NEW.vld_dt,
			lmt_dt = NEW.lmt_dt,
			non_mov_base_dt = NEW.non_mov_base_dt
		WHERE 0=0
		AND wg_cd = OLD.wg_cd
		AND mng_dpt_cd = OLD.mng_dpt_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND lot_no = OLD.lot_no
		AND sublot_no = OLD.sublot_no
		AND sno1 = OLD.sno1
		AND sno2 = OLD.sno2
		AND sno3 = OLD.sno3
		AND sno4 = OLD.sno4
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND (first_gr_dt = OLD.first_gr_dt OR first_gr_dt IS NULL AND OLD.first_gr_dt IS NULL)
		AND (vld_dt = OLD.vld_dt OR vld_dt IS NULL AND OLD.vld_dt IS NULL)
		AND (lmt_dt = OLD.lmt_dt OR lmt_dt IS NULL AND OLD.lmt_dt IS NULL)
		AND (non_mov_base_dt = OLD.non_mov_base_dt OR non_mov_base_dt IS NULL AND OLD.non_mov_base_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_stk$temp
		WHERE 0=0
		AND wg_cd = OLD.wg_cd
		AND mng_dpt_cd = OLD.mng_dpt_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND lot_no = OLD.lot_no
		AND sublot_no = OLD.sublot_no
		AND sno1 = OLD.sno1
		AND sno2 = OLD.sno2
		AND sno3 = OLD.sno3
		AND sno4 = OLD.sno4
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND (first_gr_dt = OLD.first_gr_dt OR first_gr_dt IS NULL AND OLD.first_gr_dt IS NULL)
		AND (vld_dt = OLD.vld_dt OR vld_dt IS NULL AND OLD.vld_dt IS NULL)
		AND (lmt_dt = OLD.lmt_dt OR lmt_dt IS NULL AND OLD.lmt_dt IS NULL)
		AND (non_mov_base_dt = OLD.non_mov_base_dt OR non_mov_base_dt IS NULL AND OLD.non_mov_base_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_stk$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_stk
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_stk$func();
;

