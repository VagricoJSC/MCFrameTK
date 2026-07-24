\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cost_report_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	report_id varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_report_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_report_key$temp(
				calc_grp_cd varchar (10) NULL,
				report_id varchar (100) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_report_key_pk_ie ON maw_cost_report_key$temp
				USING BTREE (calc_grp_cd,report_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_report_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cost_report_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cost_report_key
AS
SELECT *
FROM maw_cost_report_key();

CREATE OR REPLACE FUNCTION maw_cost_report_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_report_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_report_key$temp(
				calc_grp_cd varchar (10) NULL,
				report_id varchar (100) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_report_key_pk_ie ON maw_cost_report_key$temp
				USING BTREE (calc_grp_cd,report_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_report_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cost_report_key$temp(
			calc_grp_cd,
			report_id
		)VALUES (
			NEW.calc_grp_cd,
			NEW.report_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cost_report_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			report_id = NEW.report_id
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (report_id = OLD.report_id OR report_id IS NULL AND OLD.report_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cost_report_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (report_id = OLD.report_id OR report_id IS NULL AND OLD.report_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cost_report_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cost_report_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cost_report_key$func();
;

