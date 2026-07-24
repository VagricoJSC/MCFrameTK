\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_pre_alc_rate_sel()
RETURNS TABLE (
	wg_cd varchar,
	alc_ac_cd varchar,
	dpt_cd varchar,
	pre_alc_rate_cd varchar,
	trd_alc_ac_cd varchar,
	trd_wg_cd varchar,
	pre_alc_dpt_ptn varchar,
	fin_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_alc_rate_sel$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_alc_rate_sel$temp(
				wg_cd varchar (10) NOT NULL,
				alc_ac_cd varchar (20) DEFAULT '*' NOT NULL,
				dpt_cd varchar (20) DEFAULT '*' NOT NULL,
				pre_alc_rate_cd varchar (20) NOT NULL,
				trd_alc_ac_cd varchar (20) NULL,
				trd_wg_cd varchar (10) NULL,
				pre_alc_dpt_ptn varchar (10) NULL,
				fin_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_pre_alc_rate_sel$temp
			ADD CONSTRAINT mgw_pre_alc_rate_sel_pk PRIMARY KEY(wg_cd,alc_ac_cd,dpt_cd);
			
			ALTER TABLE mgw_pre_alc_rate_sel$temp
				ADD CONSTRAINT mgw_pre_alc_rate_sel_ck01 CHECK (fin_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_alc_rate_sel$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_pre_alc_rate_sel$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_pre_alc_rate_sel
AS
SELECT *
FROM mgw_pre_alc_rate_sel();
ALTER VIEW mgw_pre_alc_rate_sel ALTER COLUMN alc_ac_cd SET DEFAULT '*';
ALTER VIEW mgw_pre_alc_rate_sel ALTER COLUMN dpt_cd SET DEFAULT '*';
ALTER VIEW mgw_pre_alc_rate_sel ALTER COLUMN fin_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_pre_alc_rate_sel$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_alc_rate_sel$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_alc_rate_sel$temp(
				wg_cd varchar (10) NOT NULL,
				alc_ac_cd varchar (20) DEFAULT '*' NOT NULL,
				dpt_cd varchar (20) DEFAULT '*' NOT NULL,
				pre_alc_rate_cd varchar (20) NOT NULL,
				trd_alc_ac_cd varchar (20) NULL,
				trd_wg_cd varchar (10) NULL,
				pre_alc_dpt_ptn varchar (10) NULL,
				fin_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_pre_alc_rate_sel$temp
			ADD CONSTRAINT mgw_pre_alc_rate_sel_pk PRIMARY KEY(wg_cd,alc_ac_cd,dpt_cd);
			
			ALTER TABLE mgw_pre_alc_rate_sel$temp
			ADD CONSTRAINT mgw_pre_alc_rate_sel_ck01 CHECK (fin_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_alc_rate_sel$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_pre_alc_rate_sel$temp(
			wg_cd,
			alc_ac_cd,
			dpt_cd,
			pre_alc_rate_cd,
			trd_alc_ac_cd,
			trd_wg_cd,
			pre_alc_dpt_ptn,
			fin_flg
		)VALUES (
			NEW.wg_cd,
			NEW.alc_ac_cd,
			NEW.dpt_cd,
			NEW.pre_alc_rate_cd,
			NEW.trd_alc_ac_cd,
			NEW.trd_wg_cd,
			NEW.pre_alc_dpt_ptn,
			NEW.fin_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_pre_alc_rate_sel$temp
		SET 
			wg_cd = NEW.wg_cd,
			alc_ac_cd = NEW.alc_ac_cd,
			dpt_cd = NEW.dpt_cd,
			pre_alc_rate_cd = NEW.pre_alc_rate_cd,
			trd_alc_ac_cd = NEW.trd_alc_ac_cd,
			trd_wg_cd = NEW.trd_wg_cd,
			pre_alc_dpt_ptn = NEW.pre_alc_dpt_ptn,
			fin_flg = NEW.fin_flg
		WHERE 0=0
		AND wg_cd = OLD.wg_cd
		AND alc_ac_cd = OLD.alc_ac_cd
		AND dpt_cd = OLD.dpt_cd
		AND pre_alc_rate_cd = OLD.pre_alc_rate_cd
		AND (trd_alc_ac_cd = OLD.trd_alc_ac_cd OR trd_alc_ac_cd IS NULL AND OLD.trd_alc_ac_cd IS NULL)
		AND (trd_wg_cd = OLD.trd_wg_cd OR trd_wg_cd IS NULL AND OLD.trd_wg_cd IS NULL)
		AND (pre_alc_dpt_ptn = OLD.pre_alc_dpt_ptn OR pre_alc_dpt_ptn IS NULL AND OLD.pre_alc_dpt_ptn IS NULL)
		AND fin_flg = OLD.fin_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_pre_alc_rate_sel$temp
		WHERE 0=0
		AND wg_cd = OLD.wg_cd
		AND alc_ac_cd = OLD.alc_ac_cd
		AND dpt_cd = OLD.dpt_cd
		AND pre_alc_rate_cd = OLD.pre_alc_rate_cd
		AND (trd_alc_ac_cd = OLD.trd_alc_ac_cd OR trd_alc_ac_cd IS NULL AND OLD.trd_alc_ac_cd IS NULL)
		AND (trd_wg_cd = OLD.trd_wg_cd OR trd_wg_cd IS NULL AND OLD.trd_wg_cd IS NULL)
		AND (pre_alc_dpt_ptn = OLD.pre_alc_dpt_ptn OR pre_alc_dpt_ptn IS NULL AND OLD.pre_alc_dpt_ptn IS NULL)
		AND fin_flg = OLD.fin_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_pre_alc_rate_sel$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_pre_alc_rate_sel
FOR EACH ROW
EXECUTE PROCEDURE mgw_pre_alc_rate_sel$func();
;

