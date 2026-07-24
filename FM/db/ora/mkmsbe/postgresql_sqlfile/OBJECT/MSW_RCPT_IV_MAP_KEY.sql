\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_rcpt_iv_map_key()
RETURNS TABLE (
	rcpt_iv_d_no varchar,
	rcpt_iv_no varchar,
	arr_schd_no varchar,
	arr_act_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_rcpt_iv_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_rcpt_iv_map_key$temp(
				rcpt_iv_d_no varchar (15) DEFAULT '*' NULL,
				rcpt_iv_no varchar (15) DEFAULT '*' NULL,
				arr_schd_no varchar (15) DEFAULT '*' NULL,
				arr_act_no varchar (15) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_rcpt_iv_map_key_pk_ie ON msw_rcpt_iv_map_key$temp
				USING BTREE (rcpt_iv_d_no,rcpt_iv_no,arr_schd_no,arr_act_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_rcpt_iv_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_rcpt_iv_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_rcpt_iv_map_key
AS
SELECT *
FROM msw_rcpt_iv_map_key();
ALTER VIEW msw_rcpt_iv_map_key ALTER COLUMN rcpt_iv_d_no SET DEFAULT '*';
ALTER VIEW msw_rcpt_iv_map_key ALTER COLUMN rcpt_iv_no SET DEFAULT '*';
ALTER VIEW msw_rcpt_iv_map_key ALTER COLUMN arr_schd_no SET DEFAULT '*';
ALTER VIEW msw_rcpt_iv_map_key ALTER COLUMN arr_act_no SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_rcpt_iv_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_rcpt_iv_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_rcpt_iv_map_key$temp(
				rcpt_iv_d_no varchar (15) DEFAULT '*' NULL,
				rcpt_iv_no varchar (15) DEFAULT '*' NULL,
				arr_schd_no varchar (15) DEFAULT '*' NULL,
				arr_act_no varchar (15) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_rcpt_iv_map_key_pk_ie ON msw_rcpt_iv_map_key$temp
				USING BTREE (rcpt_iv_d_no,rcpt_iv_no,arr_schd_no,arr_act_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_rcpt_iv_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_rcpt_iv_map_key$temp(
			rcpt_iv_d_no,
			rcpt_iv_no,
			arr_schd_no,
			arr_act_no
		)VALUES (
			NEW.rcpt_iv_d_no,
			NEW.rcpt_iv_no,
			NEW.arr_schd_no,
			NEW.arr_act_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_rcpt_iv_map_key$temp
		SET 
			rcpt_iv_d_no = NEW.rcpt_iv_d_no,
			rcpt_iv_no = NEW.rcpt_iv_no,
			arr_schd_no = NEW.arr_schd_no,
			arr_act_no = NEW.arr_act_no
		WHERE 0=0
		AND (rcpt_iv_d_no = OLD.rcpt_iv_d_no OR rcpt_iv_d_no IS NULL AND OLD.rcpt_iv_d_no IS NULL)
		AND (rcpt_iv_no = OLD.rcpt_iv_no OR rcpt_iv_no IS NULL AND OLD.rcpt_iv_no IS NULL)
		AND (arr_schd_no = OLD.arr_schd_no OR arr_schd_no IS NULL AND OLD.arr_schd_no IS NULL)
		AND (arr_act_no = OLD.arr_act_no OR arr_act_no IS NULL AND OLD.arr_act_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_rcpt_iv_map_key$temp
		WHERE 0=0
		AND (rcpt_iv_d_no = OLD.rcpt_iv_d_no OR rcpt_iv_d_no IS NULL AND OLD.rcpt_iv_d_no IS NULL)
		AND (rcpt_iv_no = OLD.rcpt_iv_no OR rcpt_iv_no IS NULL AND OLD.rcpt_iv_no IS NULL)
		AND (arr_schd_no = OLD.arr_schd_no OR arr_schd_no IS NULL AND OLD.arr_schd_no IS NULL)
		AND (arr_act_no = OLD.arr_act_no OR arr_act_no IS NULL AND OLD.arr_act_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_rcpt_iv_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_rcpt_iv_map_key
FOR EACH ROW
EXECUTE PROCEDURE msw_rcpt_iv_map_key$func();
;

