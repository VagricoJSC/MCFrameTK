\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_schd_pay_key()
RETURNS TABLE (
	pay_ap_typ varchar,
	seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_schd_pay_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_schd_pay_key$temp(
				pay_ap_typ varchar (1) NULL,
				seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_schd_pay_key_pk_ie ON maw_schd_pay_key$temp
				USING BTREE (pay_ap_typ,seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_schd_pay_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_schd_pay_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_schd_pay_key
AS
SELECT *
FROM maw_schd_pay_key();

CREATE OR REPLACE FUNCTION maw_schd_pay_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_schd_pay_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_schd_pay_key$temp(
				pay_ap_typ varchar (1) NULL,
				seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_schd_pay_key_pk_ie ON maw_schd_pay_key$temp
				USING BTREE (pay_ap_typ,seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_schd_pay_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_schd_pay_key$temp(
			pay_ap_typ,
			seq
		)VALUES (
			NEW.pay_ap_typ,
			NEW.seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_schd_pay_key$temp
		SET 
			pay_ap_typ = NEW.pay_ap_typ,
			seq = NEW.seq
		WHERE 0=0
		AND (pay_ap_typ = OLD.pay_ap_typ OR pay_ap_typ IS NULL AND OLD.pay_ap_typ IS NULL)
		AND (seq = OLD.seq OR seq IS NULL AND OLD.seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_schd_pay_key$temp
		WHERE 0=0
		AND (pay_ap_typ = OLD.pay_ap_typ OR pay_ap_typ IS NULL AND OLD.pay_ap_typ IS NULL)
		AND (seq = OLD.seq OR seq IS NULL AND OLD.seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_schd_pay_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_schd_pay_key
FOR EACH ROW
EXECUTE PROCEDURE maw_schd_pay_key$func();
;

