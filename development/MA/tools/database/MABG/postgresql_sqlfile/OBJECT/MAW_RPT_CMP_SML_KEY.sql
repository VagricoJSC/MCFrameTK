\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_rpt_cmp_sml_key()
RETURNS TABLE (
	cmp_ptn_cd varchar,
	sml_col_cd varchar,
	tgt_col_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rpt_cmp_sml_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rpt_cmp_sml_key$temp(
				cmp_ptn_cd varchar (20) NULL,
				sml_col_cd varchar (10) NULL,
				tgt_col_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rpt_cmp_sml_key_pk_ie ON maw_rpt_cmp_sml_key$temp
				USING BTREE (cmp_ptn_cd,sml_col_cd,tgt_col_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rpt_cmp_sml_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_rpt_cmp_sml_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_rpt_cmp_sml_key
AS
SELECT *
FROM maw_rpt_cmp_sml_key();

CREATE OR REPLACE FUNCTION maw_rpt_cmp_sml_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rpt_cmp_sml_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rpt_cmp_sml_key$temp(
				cmp_ptn_cd varchar (20) NULL,
				sml_col_cd varchar (10) NULL,
				tgt_col_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rpt_cmp_sml_key_pk_ie ON maw_rpt_cmp_sml_key$temp
				USING BTREE (cmp_ptn_cd,sml_col_cd,tgt_col_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rpt_cmp_sml_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_rpt_cmp_sml_key$temp(
			cmp_ptn_cd,
			sml_col_cd,
			tgt_col_cd
		)VALUES (
			NEW.cmp_ptn_cd,
			NEW.sml_col_cd,
			NEW.tgt_col_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_rpt_cmp_sml_key$temp
		SET 
			cmp_ptn_cd = NEW.cmp_ptn_cd,
			sml_col_cd = NEW.sml_col_cd,
			tgt_col_cd = NEW.tgt_col_cd
		WHERE 0=0
		AND (cmp_ptn_cd = OLD.cmp_ptn_cd OR cmp_ptn_cd IS NULL AND OLD.cmp_ptn_cd IS NULL)
		AND (sml_col_cd = OLD.sml_col_cd OR sml_col_cd IS NULL AND OLD.sml_col_cd IS NULL)
		AND (tgt_col_cd = OLD.tgt_col_cd OR tgt_col_cd IS NULL AND OLD.tgt_col_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_rpt_cmp_sml_key$temp
		WHERE 0=0
		AND (cmp_ptn_cd = OLD.cmp_ptn_cd OR cmp_ptn_cd IS NULL AND OLD.cmp_ptn_cd IS NULL)
		AND (sml_col_cd = OLD.sml_col_cd OR sml_col_cd IS NULL AND OLD.sml_col_cd IS NULL)
		AND (tgt_col_cd = OLD.tgt_col_cd OR tgt_col_cd IS NULL AND OLD.tgt_col_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_rpt_cmp_sml_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_rpt_cmp_sml_key
FOR EACH ROW
EXECUTE PROCEDURE maw_rpt_cmp_sml_key$func();
;

