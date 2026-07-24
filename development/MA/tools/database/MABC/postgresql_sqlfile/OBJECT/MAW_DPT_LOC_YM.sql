\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_dpt_loc_ym()
RETURNS TABLE (
	ym timestamp(0),
	dpt_cd varchar,
	loc_cd varchar,
	oper_cd varchar,
	oper_null_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_loc_ym$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_loc_ym$temp(
				ym timestamp(0)  NOT NULL,
				dpt_cd varchar (20) NOT NULL,
				loc_cd varchar (20) NOT NULL,
				oper_cd varchar (10) NULL,
				oper_null_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_loc_ym_ie01 ON maw_dpt_loc_ym$temp
				USING BTREE (loc_cd);
			ALTER TABLE maw_dpt_loc_ym$temp
			ADD CONSTRAINT maw_dpt_loc_ym_pk UNIQUE(ym,dpt_cd,loc_cd,oper_cd,oper_null_flg);
			CREATE UNIQUE INDEX MAW_DPT_LOC_YM_pk_ie ON maw_dpt_loc_ym$temp (ym,dpt_cd,loc_cd,COALESCE(oper_cd,''),oper_null_flg);
			ALTER TABLE maw_dpt_loc_ym$temp
				ADD CONSTRAINT maw_dpt_loc_ym_ck01 CHECK (oper_null_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_loc_ym$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_dpt_loc_ym$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_dpt_loc_ym
AS
SELECT *
FROM maw_dpt_loc_ym();
ALTER VIEW maw_dpt_loc_ym ALTER COLUMN oper_null_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION maw_dpt_loc_ym$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_loc_ym$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_loc_ym$temp(
				ym timestamp(0)  NOT NULL,
				dpt_cd varchar (20) NOT NULL,
				loc_cd varchar (20) NOT NULL,
				oper_cd varchar (10) NULL,
				oper_null_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_loc_ym_ie01 ON maw_dpt_loc_ym$temp
				USING BTREE (loc_cd);
			ALTER TABLE maw_dpt_loc_ym$temp
			ADD CONSTRAINT maw_dpt_loc_ym_pk UNIQUE(ym,dpt_cd,loc_cd,oper_cd,oper_null_flg);
			CREATE UNIQUE INDEX MAW_DPT_LOC_YM_pk_ie ON maw_dpt_loc_ym$temp (ym,dpt_cd,loc_cd,COALESCE(oper_cd,''),oper_null_flg);
			ALTER TABLE maw_dpt_loc_ym$temp
			ADD CONSTRAINT maw_dpt_loc_ym_ck01 CHECK (oper_null_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_loc_ym$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_dpt_loc_ym$temp(
			ym,
			dpt_cd,
			loc_cd,
			oper_cd,
			oper_null_flg
		)VALUES (
			NEW.ym,
			NEW.dpt_cd,
			NEW.loc_cd,
			NEW.oper_cd,
			NEW.oper_null_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_dpt_loc_ym$temp
		SET 
			ym = NEW.ym,
			dpt_cd = NEW.dpt_cd,
			loc_cd = NEW.loc_cd,
			oper_cd = NEW.oper_cd,
			oper_null_flg = NEW.oper_null_flg
		WHERE 0=0
		AND ym = OLD.ym
		AND dpt_cd = OLD.dpt_cd
		AND loc_cd = OLD.loc_cd
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND oper_null_flg = OLD.oper_null_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_dpt_loc_ym$temp
		WHERE 0=0
		AND ym = OLD.ym
		AND dpt_cd = OLD.dpt_cd
		AND loc_cd = OLD.loc_cd
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND oper_null_flg = OLD.oper_null_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_dpt_loc_ym$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_dpt_loc_ym
FOR EACH ROW
EXECUTE PROCEDURE maw_dpt_loc_ym$func();
;

