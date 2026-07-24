\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_stk_eval()
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
	asst_typ varchar,
	base_qty numeric,
	upri numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_stk_eval$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_stk_eval$temp(
				wg_cd varchar (10) NOT NULL,
				mng_dpt_cd varchar (20) DEFAULT '*' NOT NULL,
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
				asst_typ varchar (1) DEFAULT '*' NOT NULL,
				base_qty numeric (21,8) NOT NULL,
				upri numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_stk_eval_ie01 ON mgw_stk_eval$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			ALTER TABLE mgw_stk_eval$temp
			ADD CONSTRAINT mgw_stk_eval_pk PRIMARY KEY(wg_cd,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,asst_typ);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_stk_eval$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_stk_eval$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_stk_eval
AS
SELECT *
FROM mgw_stk_eval();
ALTER VIEW mgw_stk_eval ALTER COLUMN mng_dpt_cd SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN sno4 SET DEFAULT '*';
ALTER VIEW mgw_stk_eval ALTER COLUMN asst_typ SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_stk_eval$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_stk_eval$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_stk_eval$temp(
				wg_cd varchar (10) NOT NULL,
				mng_dpt_cd varchar (20) DEFAULT '*' NOT NULL,
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
				asst_typ varchar (1) DEFAULT '*' NOT NULL,
				base_qty numeric (21,8) NOT NULL,
				upri numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_stk_eval_ie01 ON mgw_stk_eval$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			ALTER TABLE mgw_stk_eval$temp
			ADD CONSTRAINT mgw_stk_eval_pk PRIMARY KEY(wg_cd,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,asst_typ);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_stk_eval$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_stk_eval$temp(
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
			asst_typ,
			base_qty,
			upri
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
			NEW.asst_typ,
			NEW.base_qty,
			NEW.upri
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_stk_eval$temp
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
			asst_typ = NEW.asst_typ,
			base_qty = NEW.base_qty,
			upri = NEW.upri
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
		AND asst_typ = OLD.asst_typ
		AND base_qty = OLD.base_qty
		AND upri = OLD.upri;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_stk_eval$temp
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
		AND asst_typ = OLD.asst_typ
		AND base_qty = OLD.base_qty
		AND upri = OLD.upri;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_stk_eval$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_stk_eval
FOR EACH ROW
EXECUTE PROCEDURE mgw_stk_eval$func();
;

