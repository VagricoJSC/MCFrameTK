\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_prov_act_key()
RETURNS TABLE (
	prov_act_no varchar,
	prov_act_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_prov_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_prov_act_key$temp(
				prov_act_no varchar (15) NULL,
				prov_act_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_prov_act_key_pk_ie ON msw_prov_act_key$temp
				USING BTREE (prov_act_no,prov_act_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_prov_act_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_prov_act_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_prov_act_key
AS
SELECT *
FROM msw_prov_act_key();

CREATE OR REPLACE FUNCTION msw_prov_act_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_prov_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_prov_act_key$temp(
				prov_act_no varchar (15) NULL,
				prov_act_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_prov_act_key_pk_ie ON msw_prov_act_key$temp
				USING BTREE (prov_act_no,prov_act_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_prov_act_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_prov_act_key$temp(
			prov_act_no,
			prov_act_seq
		)VALUES (
			NEW.prov_act_no,
			NEW.prov_act_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_prov_act_key$temp
		SET 
			prov_act_no = NEW.prov_act_no,
			prov_act_seq = NEW.prov_act_seq
		WHERE 0=0
		AND (prov_act_no = OLD.prov_act_no OR prov_act_no IS NULL AND OLD.prov_act_no IS NULL)
		AND (prov_act_seq = OLD.prov_act_seq OR prov_act_seq IS NULL AND OLD.prov_act_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_prov_act_key$temp
		WHERE 0=0
		AND (prov_act_no = OLD.prov_act_no OR prov_act_no IS NULL AND OLD.prov_act_no IS NULL)
		AND (prov_act_seq = OLD.prov_act_seq OR prov_act_seq IS NULL AND OLD.prov_act_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_prov_act_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_prov_act_key
FOR EACH ROW
EXECUTE PROCEDURE msw_prov_act_key$func();
;

