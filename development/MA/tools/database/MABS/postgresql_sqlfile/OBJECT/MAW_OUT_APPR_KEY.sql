\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_out_appr_key()
RETURNS TABLE (
	appr_acnt_id8 varchar,
	acnt_id8 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_out_appr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_out_appr_key$temp(
				appr_acnt_id8 varchar (500) NULL,
				acnt_id8 varchar (500) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_out_appr_key_pk_ie ON maw_out_appr_key$temp
				USING BTREE (appr_acnt_id8,acnt_id8);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_out_appr_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_out_appr_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_out_appr_key
AS
SELECT *
FROM maw_out_appr_key();

CREATE OR REPLACE FUNCTION maw_out_appr_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_out_appr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_out_appr_key$temp(
				appr_acnt_id8 varchar (500) NULL,
				acnt_id8 varchar (500) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_out_appr_key_pk_ie ON maw_out_appr_key$temp
				USING BTREE (appr_acnt_id8,acnt_id8);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_out_appr_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_out_appr_key$temp(
			appr_acnt_id8,
			acnt_id8
		)VALUES (
			NEW.appr_acnt_id8,
			NEW.acnt_id8
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_out_appr_key$temp
		SET 
			appr_acnt_id8 = NEW.appr_acnt_id8,
			acnt_id8 = NEW.acnt_id8
		WHERE 0=0
		AND (appr_acnt_id8 = OLD.appr_acnt_id8 OR appr_acnt_id8 IS NULL AND OLD.appr_acnt_id8 IS NULL)
		AND (acnt_id8 = OLD.acnt_id8 OR acnt_id8 IS NULL AND OLD.acnt_id8 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_out_appr_key$temp
		WHERE 0=0
		AND (appr_acnt_id8 = OLD.appr_acnt_id8 OR appr_acnt_id8 IS NULL AND OLD.appr_acnt_id8 IS NULL)
		AND (acnt_id8 = OLD.acnt_id8 OR acnt_id8 IS NULL AND OLD.acnt_id8 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_out_appr_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_out_appr_key
FOR EACH ROW
EXECUTE PROCEDURE maw_out_appr_key$func();
;

