\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sls_act_key()
RETURNS TABLE (
	sls_act_no varchar,
	sls_act_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_act_key$temp(
				sls_act_no varchar (15) NULL,
				sls_act_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sls_act_key_pk_ie ON msw_sls_act_key$temp
				USING BTREE (sls_act_no,sls_act_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_act_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sls_act_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sls_act_key
AS
SELECT *
FROM msw_sls_act_key();

CREATE OR REPLACE FUNCTION msw_sls_act_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_act_key$temp(
				sls_act_no varchar (15) NULL,
				sls_act_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sls_act_key_pk_ie ON msw_sls_act_key$temp
				USING BTREE (sls_act_no,sls_act_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_act_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sls_act_key$temp(
			sls_act_no,
			sls_act_seq
		)VALUES (
			NEW.sls_act_no,
			NEW.sls_act_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sls_act_key$temp
		SET 
			sls_act_no = NEW.sls_act_no,
			sls_act_seq = NEW.sls_act_seq
		WHERE 0=0
		AND (sls_act_no = OLD.sls_act_no OR sls_act_no IS NULL AND OLD.sls_act_no IS NULL)
		AND (sls_act_seq = OLD.sls_act_seq OR sls_act_seq IS NULL AND OLD.sls_act_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sls_act_key$temp
		WHERE 0=0
		AND (sls_act_no = OLD.sls_act_no OR sls_act_no IS NULL AND OLD.sls_act_no IS NULL)
		AND (sls_act_seq = OLD.sls_act_seq OR sls_act_seq IS NULL AND OLD.sls_act_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sls_act_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sls_act_key
FOR EACH ROW
EXECUTE PROCEDURE msw_sls_act_key$func();
;

