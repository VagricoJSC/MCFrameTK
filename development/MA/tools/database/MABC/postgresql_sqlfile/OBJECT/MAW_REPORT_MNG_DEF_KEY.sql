\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_report_mng_def_key()
RETURNS TABLE (
	biz_typ varchar,
	rpt_attr_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_report_mng_def_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_report_mng_def_key$temp(
				biz_typ varchar (2) NULL,
				rpt_attr_typ varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_report_mng_def_key_pk_ie ON maw_report_mng_def_key$temp
				USING BTREE (biz_typ,rpt_attr_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_report_mng_def_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_report_mng_def_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_report_mng_def_key
AS
SELECT *
FROM maw_report_mng_def_key();

CREATE OR REPLACE FUNCTION maw_report_mng_def_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_report_mng_def_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_report_mng_def_key$temp(
				biz_typ varchar (2) NULL,
				rpt_attr_typ varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_report_mng_def_key_pk_ie ON maw_report_mng_def_key$temp
				USING BTREE (biz_typ,rpt_attr_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_report_mng_def_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_report_mng_def_key$temp(
			biz_typ,
			rpt_attr_typ
		)VALUES (
			NEW.biz_typ,
			NEW.rpt_attr_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_report_mng_def_key$temp
		SET 
			biz_typ = NEW.biz_typ,
			rpt_attr_typ = NEW.rpt_attr_typ
		WHERE 0=0
		AND (biz_typ = OLD.biz_typ OR biz_typ IS NULL AND OLD.biz_typ IS NULL)
		AND (rpt_attr_typ = OLD.rpt_attr_typ OR rpt_attr_typ IS NULL AND OLD.rpt_attr_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_report_mng_def_key$temp
		WHERE 0=0
		AND (biz_typ = OLD.biz_typ OR biz_typ IS NULL AND OLD.biz_typ IS NULL)
		AND (rpt_attr_typ = OLD.rpt_attr_typ OR rpt_attr_typ IS NULL AND OLD.rpt_attr_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_report_mng_def_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_report_mng_def_key
FOR EACH ROW
EXECUTE PROCEDURE maw_report_mng_def_key$func();
;

