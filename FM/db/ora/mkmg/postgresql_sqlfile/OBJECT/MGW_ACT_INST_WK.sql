\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_inst_wk()
RETURNS TABLE (
	calc_ctg_cd varchar,
	wg_cd varchar,
	ym timestamp(0),
	ac_dt timestamp(0),
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_mfg_inst_no varchar,
	mfg_act_no varchar,
	oper_act_no varchar,
	loc_cd varchar,
	str_ln_cd varchar,
	wk_cost_cd varchar,
	wk_rsn_cd varchar,
	wk_cost numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_inst_wk$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_inst_wk$temp(
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ym timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				itm_mfg_inst_no varchar (15) NOT NULL,
				mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
				oper_act_no varchar (15) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
				wk_cost_cd varchar (10) NOT NULL,
				wk_rsn_cd varchar (10) NULL,
				wk_cost numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_inst_wk$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_inst_wk$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_inst_wk
AS
SELECT *
FROM mgw_act_inst_wk();
ALTER VIEW mgw_act_inst_wk ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_act_inst_wk ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_act_inst_wk ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_act_inst_wk ALTER COLUMN mfg_act_no SET DEFAULT '*';
ALTER VIEW mgw_act_inst_wk ALTER COLUMN oper_act_no SET DEFAULT '*';
ALTER VIEW mgw_act_inst_wk ALTER COLUMN str_ln_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_act_inst_wk$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_inst_wk$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_inst_wk$temp(
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ym timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				itm_mfg_inst_no varchar (15) NOT NULL,
				mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
				oper_act_no varchar (15) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
				wk_cost_cd varchar (10) NOT NULL,
				wk_rsn_cd varchar (10) NULL,
				wk_cost numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_inst_wk$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_inst_wk$temp(
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost
		)VALUES (
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.ym,
			NEW.ac_dt,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_mfg_inst_no,
			NEW.mfg_act_no,
			NEW.oper_act_no,
			NEW.loc_cd,
			NEW.str_ln_cd,
			NEW.wk_cost_cd,
			NEW.wk_rsn_cd,
			NEW.wk_cost
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_inst_wk$temp
		SET 
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			ym = NEW.ym,
			ac_dt = NEW.ac_dt,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_mfg_inst_no = NEW.itm_mfg_inst_no,
			mfg_act_no = NEW.mfg_act_no,
			oper_act_no = NEW.oper_act_no,
			loc_cd = NEW.loc_cd,
			str_ln_cd = NEW.str_ln_cd,
			wk_cost_cd = NEW.wk_cost_cd,
			wk_rsn_cd = NEW.wk_rsn_cd,
			wk_cost = NEW.wk_cost
		WHERE 0=0
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND ym = OLD.ym
		AND ac_dt = OLD.ac_dt
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND itm_mfg_inst_no = OLD.itm_mfg_inst_no
		AND mfg_act_no = OLD.mfg_act_no
		AND oper_act_no = OLD.oper_act_no
		AND loc_cd = OLD.loc_cd
		AND str_ln_cd = OLD.str_ln_cd
		AND wk_cost_cd = OLD.wk_cost_cd
		AND (wk_rsn_cd = OLD.wk_rsn_cd OR wk_rsn_cd IS NULL AND OLD.wk_rsn_cd IS NULL)
		AND wk_cost = OLD.wk_cost;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_inst_wk$temp
		WHERE 0=0
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND ym = OLD.ym
		AND ac_dt = OLD.ac_dt
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND itm_mfg_inst_no = OLD.itm_mfg_inst_no
		AND mfg_act_no = OLD.mfg_act_no
		AND oper_act_no = OLD.oper_act_no
		AND loc_cd = OLD.loc_cd
		AND str_ln_cd = OLD.str_ln_cd
		AND wk_cost_cd = OLD.wk_cost_cd
		AND (wk_rsn_cd = OLD.wk_rsn_cd OR wk_rsn_cd IS NULL AND OLD.wk_rsn_cd IS NULL)
		AND wk_cost = OLD.wk_cost;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_inst_wk$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_inst_wk
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_inst_wk$func();
;

