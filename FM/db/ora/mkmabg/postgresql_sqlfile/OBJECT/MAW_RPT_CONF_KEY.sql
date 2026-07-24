\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_rpt_conf_key()
RETURNS TABLE (
	rpt_ptn_cd varchar,
	rpt_row_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rpt_conf_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rpt_conf_key$temp(
				rpt_ptn_cd varchar (10) NULL,
				rpt_row_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rpt_conf_key_pk_ie ON maw_rpt_conf_key$temp
				USING BTREE (rpt_ptn_cd,rpt_row_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rpt_conf_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_rpt_conf_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_rpt_conf_key
AS
SELECT *
FROM maw_rpt_conf_key();

CREATE OR REPLACE FUNCTION maw_rpt_conf_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rpt_conf_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rpt_conf_key$temp(
				rpt_ptn_cd varchar (10) NULL,
				rpt_row_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rpt_conf_key_pk_ie ON maw_rpt_conf_key$temp
				USING BTREE (rpt_ptn_cd,rpt_row_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rpt_conf_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_rpt_conf_key$temp(
			rpt_ptn_cd,
			rpt_row_cd
		)VALUES (
			NEW.rpt_ptn_cd,
			NEW.rpt_row_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_rpt_conf_key$temp
		SET 
			rpt_ptn_cd = NEW.rpt_ptn_cd,
			rpt_row_cd = NEW.rpt_row_cd
		WHERE 0=0
		AND (rpt_ptn_cd = OLD.rpt_ptn_cd OR rpt_ptn_cd IS NULL AND OLD.rpt_ptn_cd IS NULL)
		AND (rpt_row_cd = OLD.rpt_row_cd OR rpt_row_cd IS NULL AND OLD.rpt_row_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_rpt_conf_key$temp
		WHERE 0=0
		AND (rpt_ptn_cd = OLD.rpt_ptn_cd OR rpt_ptn_cd IS NULL AND OLD.rpt_ptn_cd IS NULL)
		AND (rpt_row_cd = OLD.rpt_row_cd OR rpt_row_cd IS NULL AND OLD.rpt_row_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_rpt_conf_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_rpt_conf_key
FOR EACH ROW
EXECUTE PROCEDURE maw_rpt_conf_key$func();
;

