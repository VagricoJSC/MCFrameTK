\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_purc_act_d_key()
RETURNS TABLE (
	purc_act_d_no varchar,
	purc_act_d_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_purc_act_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_purc_act_d_key$temp(
				purc_act_d_no varchar (15) NULL,
				purc_act_d_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_purc_act_d_key_pk_ie ON msw_purc_act_d_key$temp
				USING BTREE (purc_act_d_no,purc_act_d_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_purc_act_d_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_purc_act_d_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_purc_act_d_key
AS
SELECT *
FROM msw_purc_act_d_key();

CREATE OR REPLACE FUNCTION msw_purc_act_d_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_purc_act_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_purc_act_d_key$temp(
				purc_act_d_no varchar (15) NULL,
				purc_act_d_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_purc_act_d_key_pk_ie ON msw_purc_act_d_key$temp
				USING BTREE (purc_act_d_no,purc_act_d_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_purc_act_d_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_purc_act_d_key$temp(
			purc_act_d_no,
			purc_act_d_seq
		)VALUES (
			NEW.purc_act_d_no,
			NEW.purc_act_d_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_purc_act_d_key$temp
		SET 
			purc_act_d_no = NEW.purc_act_d_no,
			purc_act_d_seq = NEW.purc_act_d_seq
		WHERE 0=0
		AND (purc_act_d_no = OLD.purc_act_d_no OR purc_act_d_no IS NULL AND OLD.purc_act_d_no IS NULL)
		AND (purc_act_d_seq = OLD.purc_act_d_seq OR purc_act_d_seq IS NULL AND OLD.purc_act_d_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_purc_act_d_key$temp
		WHERE 0=0
		AND (purc_act_d_no = OLD.purc_act_d_no OR purc_act_d_no IS NULL AND OLD.purc_act_d_no IS NULL)
		AND (purc_act_d_seq = OLD.purc_act_d_seq OR purc_act_d_seq IS NULL AND OLD.purc_act_d_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_purc_act_d_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_purc_act_d_key
FOR EACH ROW
EXECUTE PROCEDURE msw_purc_act_d_key$func();
;

