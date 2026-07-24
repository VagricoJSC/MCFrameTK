\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_dpt_config_key()
RETURNS TABLE (
	par_dpt_cd varchar,
	dpt_cd varchar,
	loc_cd varchar,
	oper_cd varchar,
	oper_null_flg char,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_config_key$temp(
				par_dpt_cd varchar (20) NULL,
				dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				oper_null_flg char (1) DEFAULT '0' NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_config_key_pk_ie ON maw_dpt_config_key$temp
				USING BTREE (par_dpt_cd,dpt_cd,loc_cd,oper_cd,oper_null_flg,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_config_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_dpt_config_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_dpt_config_key
AS
SELECT *
FROM maw_dpt_config_key();
ALTER VIEW maw_dpt_config_key ALTER COLUMN oper_null_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION maw_dpt_config_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_config_key$temp(
				par_dpt_cd varchar (20) NULL,
				dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				oper_null_flg char (1) DEFAULT '0' NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_config_key_pk_ie ON maw_dpt_config_key$temp
				USING BTREE (par_dpt_cd,dpt_cd,loc_cd,oper_cd,oper_null_flg,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_config_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_dpt_config_key$temp(
			par_dpt_cd,
			dpt_cd,
			loc_cd,
			oper_cd,
			oper_null_flg,
			term
		)VALUES (
			NEW.par_dpt_cd,
			NEW.dpt_cd,
			NEW.loc_cd,
			NEW.oper_cd,
			NEW.oper_null_flg,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_dpt_config_key$temp
		SET 
			par_dpt_cd = NEW.par_dpt_cd,
			dpt_cd = NEW.dpt_cd,
			loc_cd = NEW.loc_cd,
			oper_cd = NEW.oper_cd,
			oper_null_flg = NEW.oper_null_flg,
			term = NEW.term
		WHERE 0=0
		AND (par_dpt_cd = OLD.par_dpt_cd OR par_dpt_cd IS NULL AND OLD.par_dpt_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_null_flg = OLD.oper_null_flg OR oper_null_flg IS NULL AND OLD.oper_null_flg IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_dpt_config_key$temp
		WHERE 0=0
		AND (par_dpt_cd = OLD.par_dpt_cd OR par_dpt_cd IS NULL AND OLD.par_dpt_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_null_flg = OLD.oper_null_flg OR oper_null_flg IS NULL AND OLD.oper_null_flg IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_dpt_config_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_dpt_config_key
FOR EACH ROW
EXECUTE PROCEDURE maw_dpt_config_key$func();
;

