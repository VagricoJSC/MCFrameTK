\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_wip_loc_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	wg_cd varchar,
	ym timestamp(0),
	mng_dpt_cd varchar,
	loc_cd varchar,
	str_ln_cd varchar,
	oper_cd varchar,
	oper_seq numeric,
	expns_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_wip_loc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_wip_loc_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				mng_dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				str_ln_cd varchar (10) DEFAULT '*' NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_wip_loc_key_pk_ie ON mgw_wip_loc_key$temp
				USING BTREE (calc_no,calc_grp_cd,wg_cd,ym,mng_dpt_cd,loc_cd,str_ln_cd,oper_cd,oper_seq,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_wip_loc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_wip_loc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_wip_loc_key
AS
SELECT *
FROM mgw_wip_loc_key();
ALTER VIEW mgw_wip_loc_key ALTER COLUMN str_ln_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_wip_loc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_wip_loc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_wip_loc_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				mng_dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				str_ln_cd varchar (10) DEFAULT '*' NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_wip_loc_key_pk_ie ON mgw_wip_loc_key$temp
				USING BTREE (calc_no,calc_grp_cd,wg_cd,ym,mng_dpt_cd,loc_cd,str_ln_cd,oper_cd,oper_seq,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_wip_loc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_wip_loc_key$temp(
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
			loc_cd,
			str_ln_cd,
			oper_cd,
			oper_seq,
			expns_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.wg_cd,
			NEW.ym,
			NEW.mng_dpt_cd,
			NEW.loc_cd,
			NEW.str_ln_cd,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.expns_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_wip_loc_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			wg_cd = NEW.wg_cd,
			ym = NEW.ym,
			mng_dpt_cd = NEW.mng_dpt_cd,
			loc_cd = NEW.loc_cd,
			str_ln_cd = NEW.str_ln_cd,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			expns_cd = NEW.expns_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_wip_loc_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_wip_loc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_wip_loc_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_wip_loc_key$func();
;

