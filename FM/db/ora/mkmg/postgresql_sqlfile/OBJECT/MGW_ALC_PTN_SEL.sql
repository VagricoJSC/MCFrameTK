\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_alc_ptn_sel()
RETURNS TABLE (
	alc_ac_cd varchar,
	dpt_alc_grp varchar,
	loc_alc_grp varchar,
	oper_alc_grp varchar,
	bp_alc_grp varchar,
	ctg_alc_grp varchar,
	itm_alc_grp varchar,
	wg_cd varchar,
	alc_ptn_cd varchar,
	expns_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_alc_ptn_sel$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_alc_ptn_sel$temp(
				alc_ac_cd varchar (20) NOT NULL,
				dpt_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				loc_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				oper_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				bp_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				ctg_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				itm_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				alc_ptn_cd varchar (10) NOT NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_alc_ptn_sel$temp
			ADD CONSTRAINT mgw_alc_ptn_sel_pk PRIMARY KEY(alc_ac_cd,dpt_alc_grp,loc_alc_grp,oper_alc_grp,bp_alc_grp,ctg_alc_grp,itm_alc_grp,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_alc_ptn_sel$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_alc_ptn_sel$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_alc_ptn_sel
AS
SELECT *
FROM mgw_alc_ptn_sel();
ALTER VIEW mgw_alc_ptn_sel ALTER COLUMN dpt_alc_grp SET DEFAULT '*';
ALTER VIEW mgw_alc_ptn_sel ALTER COLUMN loc_alc_grp SET DEFAULT '*';
ALTER VIEW mgw_alc_ptn_sel ALTER COLUMN oper_alc_grp SET DEFAULT '*';
ALTER VIEW mgw_alc_ptn_sel ALTER COLUMN bp_alc_grp SET DEFAULT '*';
ALTER VIEW mgw_alc_ptn_sel ALTER COLUMN ctg_alc_grp SET DEFAULT '*';
ALTER VIEW mgw_alc_ptn_sel ALTER COLUMN itm_alc_grp SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_alc_ptn_sel$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_alc_ptn_sel$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_alc_ptn_sel$temp(
				alc_ac_cd varchar (20) NOT NULL,
				dpt_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				loc_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				oper_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				bp_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				ctg_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				itm_alc_grp varchar (10) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				alc_ptn_cd varchar (10) NOT NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_alc_ptn_sel$temp
			ADD CONSTRAINT mgw_alc_ptn_sel_pk PRIMARY KEY(alc_ac_cd,dpt_alc_grp,loc_alc_grp,oper_alc_grp,bp_alc_grp,ctg_alc_grp,itm_alc_grp,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_alc_ptn_sel$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_alc_ptn_sel$temp(
			alc_ac_cd,
			dpt_alc_grp,
			loc_alc_grp,
			oper_alc_grp,
			bp_alc_grp,
			ctg_alc_grp,
			itm_alc_grp,
			wg_cd,
			alc_ptn_cd,
			expns_cd
		)VALUES (
			NEW.alc_ac_cd,
			NEW.dpt_alc_grp,
			NEW.loc_alc_grp,
			NEW.oper_alc_grp,
			NEW.bp_alc_grp,
			NEW.ctg_alc_grp,
			NEW.itm_alc_grp,
			NEW.wg_cd,
			NEW.alc_ptn_cd,
			NEW.expns_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_alc_ptn_sel$temp
		SET 
			alc_ac_cd = NEW.alc_ac_cd,
			dpt_alc_grp = NEW.dpt_alc_grp,
			loc_alc_grp = NEW.loc_alc_grp,
			oper_alc_grp = NEW.oper_alc_grp,
			bp_alc_grp = NEW.bp_alc_grp,
			ctg_alc_grp = NEW.ctg_alc_grp,
			itm_alc_grp = NEW.itm_alc_grp,
			wg_cd = NEW.wg_cd,
			alc_ptn_cd = NEW.alc_ptn_cd,
			expns_cd = NEW.expns_cd
		WHERE 0=0
		AND alc_ac_cd = OLD.alc_ac_cd
		AND dpt_alc_grp = OLD.dpt_alc_grp
		AND loc_alc_grp = OLD.loc_alc_grp
		AND oper_alc_grp = OLD.oper_alc_grp
		AND bp_alc_grp = OLD.bp_alc_grp
		AND ctg_alc_grp = OLD.ctg_alc_grp
		AND itm_alc_grp = OLD.itm_alc_grp
		AND wg_cd = OLD.wg_cd
		AND alc_ptn_cd = OLD.alc_ptn_cd
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_alc_ptn_sel$temp
		WHERE 0=0
		AND alc_ac_cd = OLD.alc_ac_cd
		AND dpt_alc_grp = OLD.dpt_alc_grp
		AND loc_alc_grp = OLD.loc_alc_grp
		AND oper_alc_grp = OLD.oper_alc_grp
		AND bp_alc_grp = OLD.bp_alc_grp
		AND ctg_alc_grp = OLD.ctg_alc_grp
		AND itm_alc_grp = OLD.itm_alc_grp
		AND wg_cd = OLD.wg_cd
		AND alc_ptn_cd = OLD.alc_ptn_cd
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_alc_ptn_sel$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_alc_ptn_sel
FOR EACH ROW
EXECUTE PROCEDURE mgw_alc_ptn_sel$func();
;

