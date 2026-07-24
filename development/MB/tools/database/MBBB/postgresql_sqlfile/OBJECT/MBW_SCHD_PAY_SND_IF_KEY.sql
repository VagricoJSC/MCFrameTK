\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_schd_pay_snd_if_key()
RETURNS TABLE (
	data_lno numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_schd_pay_snd_if_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_schd_pay_snd_if_key$temp(
				data_lno numeric (15,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_schd_pay_snd_if_key_pk_ie ON mbw_schd_pay_snd_if_key$temp
				USING BTREE (data_lno);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_schd_pay_snd_if_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_schd_pay_snd_if_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_schd_pay_snd_if_key
AS
SELECT *
FROM mbw_schd_pay_snd_if_key();

CREATE OR REPLACE FUNCTION mbw_schd_pay_snd_if_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_schd_pay_snd_if_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_schd_pay_snd_if_key$temp(
				data_lno numeric (15,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_schd_pay_snd_if_key_pk_ie ON mbw_schd_pay_snd_if_key$temp
				USING BTREE (data_lno);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_schd_pay_snd_if_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_schd_pay_snd_if_key$temp(
			data_lno
		)VALUES (
			NEW.data_lno
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_schd_pay_snd_if_key$temp
		SET 
			data_lno = NEW.data_lno
		WHERE 0=0
		AND (data_lno = OLD.data_lno OR data_lno IS NULL AND OLD.data_lno IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_schd_pay_snd_if_key$temp
		WHERE 0=0
		AND (data_lno = OLD.data_lno OR data_lno IS NULL AND OLD.data_lno IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_schd_pay_snd_if_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_schd_pay_snd_if_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_schd_pay_snd_if_key$func();
;

