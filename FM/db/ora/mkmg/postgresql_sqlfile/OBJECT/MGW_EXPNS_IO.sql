\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_expns_io()
RETURNS TABLE (
	act_io_id varchar,
	act_io_id_sub varchar,
	ym timestamp(0),
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
	stk_bp_cd varchar,
	asst_typ varchar,
	qty numeric,
	amt_set_typ varchar,
	calc_grp_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_expns_io$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_expns_io$temp(
				act_io_id varchar (20) NOT NULL,
				act_io_id_sub varchar (3) NOT NULL,
				ym timestamp(0)  NOT NULL,
				mng_dpt_cd varchar (20) NULL,
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
				stk_bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				amt_set_typ varchar (1) NOT NULL,
				calc_grp_cd varchar (10) NULL,
				wg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			CREATE INDEX mgw_expns_io_ie01 ON mgw_expns_io$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			ALTER TABLE mgw_expns_io$temp
			ADD CONSTRAINT mgw_expns_io_pk PRIMARY KEY(act_io_id,act_io_id_sub);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_expns_io$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_expns_io$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_expns_io
AS
SELECT *
FROM mgw_expns_io();
ALTER VIEW mgw_expns_io ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_expns_io ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_expns_io ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_expns_io ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_expns_io ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_expns_io ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_expns_io ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_expns_io ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_expns_io ALTER COLUMN sno4 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_expns_io$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_expns_io$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_expns_io$temp(
				act_io_id varchar (20) NOT NULL,
				act_io_id_sub varchar (3) NOT NULL,
				ym timestamp(0)  NOT NULL,
				mng_dpt_cd varchar (20) NULL,
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
				stk_bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				amt_set_typ varchar (1) NOT NULL,
				calc_grp_cd varchar (10) NULL,
				wg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			CREATE INDEX mgw_expns_io_ie01 ON mgw_expns_io$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			ALTER TABLE mgw_expns_io$temp
			ADD CONSTRAINT mgw_expns_io_pk PRIMARY KEY(act_io_id,act_io_id_sub);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_expns_io$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_expns_io$temp(
			act_io_id,
			act_io_id_sub,
			ym,
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
			stk_bp_cd,
			asst_typ,
			qty,
			amt_set_typ,
			calc_grp_cd,
			wg_cd
		)VALUES (
			NEW.act_io_id,
			NEW.act_io_id_sub,
			NEW.ym,
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
			NEW.stk_bp_cd,
			NEW.asst_typ,
			NEW.qty,
			NEW.amt_set_typ,
			NEW.calc_grp_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_expns_io$temp
		SET 
			act_io_id = NEW.act_io_id,
			act_io_id_sub = NEW.act_io_id_sub,
			ym = NEW.ym,
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
			stk_bp_cd = NEW.stk_bp_cd,
			asst_typ = NEW.asst_typ,
			qty = NEW.qty,
			amt_set_typ = NEW.amt_set_typ,
			calc_grp_cd = NEW.calc_grp_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND act_io_id = OLD.act_io_id
		AND act_io_id_sub = OLD.act_io_id_sub
		AND ym = OLD.ym
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
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
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND amt_set_typ = OLD.amt_set_typ
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND wg_cd = OLD.wg_cd;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_expns_io$temp
		WHERE 0=0
		AND act_io_id = OLD.act_io_id
		AND act_io_id_sub = OLD.act_io_id_sub
		AND ym = OLD.ym
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
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
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND amt_set_typ = OLD.amt_set_typ
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND wg_cd = OLD.wg_cd;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_expns_io$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_expns_io
FOR EACH ROW
EXECUTE PROCEDURE mgw_expns_io$func();
;

