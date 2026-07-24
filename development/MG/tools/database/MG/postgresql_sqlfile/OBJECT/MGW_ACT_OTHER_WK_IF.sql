\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_other_wk_if()
RETURNS TABLE (
	data_lno numeric,
	calc_ctg_cd varchar,
	wg_cd varchar,
	ym timestamp(0),
	ac_dt timestamp(0),
	dpt_cd varchar,
	ctg_cd varchar,
	loc_cd varchar,
	oper_cd varchar,
	lot_no varchar,
	sublot_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	wk_cost_cd varchar,
	wk_rsn_cd varchar,
	wk_cost numeric,
	mfg_act_grp varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_other_wk_if$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_other_wk_if$temp(
				data_lno numeric (15,0) NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ym timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				dpt_cd varchar (20) NULL,
				ctg_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				wk_cost_cd varchar (10) NOT NULL,
				wk_rsn_cd varchar (10) NULL,
				wk_cost numeric (21,8) NOT NULL,
				mfg_act_grp varchar (100) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_other_wk_if$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_other_wk_if$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_other_wk_if
AS
SELECT *
FROM mgw_act_other_wk_if();

CREATE OR REPLACE FUNCTION mgw_act_other_wk_if$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_other_wk_if$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_other_wk_if$temp(
				data_lno numeric (15,0) NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ym timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				dpt_cd varchar (20) NULL,
				ctg_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				wk_cost_cd varchar (10) NOT NULL,
				wk_rsn_cd varchar (10) NULL,
				wk_cost numeric (21,8) NOT NULL,
				mfg_act_grp varchar (100) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_other_wk_if$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_other_wk_if$temp(
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			dpt_cd,
			ctg_cd,
			loc_cd,
			oper_cd,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			mfg_act_grp
		)VALUES (
			NEW.data_lno,
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.ym,
			NEW.ac_dt,
			NEW.dpt_cd,
			NEW.ctg_cd,
			NEW.loc_cd,
			NEW.oper_cd,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.wk_cost_cd,
			NEW.wk_rsn_cd,
			NEW.wk_cost,
			NEW.mfg_act_grp
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_other_wk_if$temp
		SET 
			data_lno = NEW.data_lno,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			ym = NEW.ym,
			ac_dt = NEW.ac_dt,
			dpt_cd = NEW.dpt_cd,
			ctg_cd = NEW.ctg_cd,
			loc_cd = NEW.loc_cd,
			oper_cd = NEW.oper_cd,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			wk_cost_cd = NEW.wk_cost_cd,
			wk_rsn_cd = NEW.wk_rsn_cd,
			wk_cost = NEW.wk_cost,
			mfg_act_grp = NEW.mfg_act_grp
		WHERE 0=0
		AND data_lno = OLD.data_lno
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND ym = OLD.ym
		AND ac_dt = OLD.ac_dt
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND wk_cost_cd = OLD.wk_cost_cd
		AND (wk_rsn_cd = OLD.wk_rsn_cd OR wk_rsn_cd IS NULL AND OLD.wk_rsn_cd IS NULL)
		AND wk_cost = OLD.wk_cost
		AND (mfg_act_grp = OLD.mfg_act_grp OR mfg_act_grp IS NULL AND OLD.mfg_act_grp IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_other_wk_if$temp
		WHERE 0=0
		AND data_lno = OLD.data_lno
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND ym = OLD.ym
		AND ac_dt = OLD.ac_dt
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND wk_cost_cd = OLD.wk_cost_cd
		AND (wk_rsn_cd = OLD.wk_rsn_cd OR wk_rsn_cd IS NULL AND OLD.wk_rsn_cd IS NULL)
		AND wk_cost = OLD.wk_cost
		AND (mfg_act_grp = OLD.mfg_act_grp OR mfg_act_grp IS NULL AND OLD.mfg_act_grp IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_other_wk_if$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_other_wk_if
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_other_wk_if$func();
;

