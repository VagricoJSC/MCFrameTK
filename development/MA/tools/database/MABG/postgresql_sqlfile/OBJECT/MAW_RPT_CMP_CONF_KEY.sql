\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_rpt_cmp_conf_key()
RETURNS TABLE (
	cmp_ptn_cd varchar,
	col_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rpt_cmp_conf_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rpt_cmp_conf_key$temp(
				cmp_ptn_cd varchar (20) NULL,
				col_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rpt_cmp_conf_key_pk_ie ON maw_rpt_cmp_conf_key$temp
				USING BTREE (cmp_ptn_cd,col_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rpt_cmp_conf_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_rpt_cmp_conf_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_rpt_cmp_conf_key
AS
SELECT *
FROM maw_rpt_cmp_conf_key();

CREATE OR REPLACE FUNCTION maw_rpt_cmp_conf_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rpt_cmp_conf_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rpt_cmp_conf_key$temp(
				cmp_ptn_cd varchar (20) NULL,
				col_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rpt_cmp_conf_key_pk_ie ON maw_rpt_cmp_conf_key$temp
				USING BTREE (cmp_ptn_cd,col_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rpt_cmp_conf_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_rpt_cmp_conf_key$temp(
			cmp_ptn_cd,
			col_cd
		)VALUES (
			NEW.cmp_ptn_cd,
			NEW.col_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_rpt_cmp_conf_key$temp
		SET 
			cmp_ptn_cd = NEW.cmp_ptn_cd,
			col_cd = NEW.col_cd
		WHERE 0=0
		AND (cmp_ptn_cd = OLD.cmp_ptn_cd OR cmp_ptn_cd IS NULL AND OLD.cmp_ptn_cd IS NULL)
		AND (col_cd = OLD.col_cd OR col_cd IS NULL AND OLD.col_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_rpt_cmp_conf_key$temp
		WHERE 0=0
		AND (cmp_ptn_cd = OLD.cmp_ptn_cd OR cmp_ptn_cd IS NULL AND OLD.cmp_ptn_cd IS NULL)
		AND (col_cd = OLD.col_cd OR col_cd IS NULL AND OLD.col_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_rpt_cmp_conf_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_rpt_cmp_conf_key
FOR EACH ROW
EXECUTE PROCEDURE maw_rpt_cmp_conf_key$func();
;

