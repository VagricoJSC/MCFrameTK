\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_non_mov_ctl_key()
RETURNS TABLE (
	io_act_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_non_mov_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_non_mov_ctl_key$temp(
				io_act_typ varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_non_mov_ctl_key_pk_ie ON mgw_non_mov_ctl_key$temp
				USING BTREE (io_act_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_non_mov_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_non_mov_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_non_mov_ctl_key
AS
SELECT *
FROM mgw_non_mov_ctl_key();

CREATE OR REPLACE FUNCTION mgw_non_mov_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_non_mov_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_non_mov_ctl_key$temp(
				io_act_typ varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_non_mov_ctl_key_pk_ie ON mgw_non_mov_ctl_key$temp
				USING BTREE (io_act_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_non_mov_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_non_mov_ctl_key$temp(
			io_act_typ
		)VALUES (
			NEW.io_act_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_non_mov_ctl_key$temp
		SET 
			io_act_typ = NEW.io_act_typ
		WHERE 0=0
		AND (io_act_typ = OLD.io_act_typ OR io_act_typ IS NULL AND OLD.io_act_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_non_mov_ctl_key$temp
		WHERE 0=0
		AND (io_act_typ = OLD.io_act_typ OR io_act_typ IS NULL AND OLD.io_act_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_non_mov_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_non_mov_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_non_mov_ctl_key$func();
;

