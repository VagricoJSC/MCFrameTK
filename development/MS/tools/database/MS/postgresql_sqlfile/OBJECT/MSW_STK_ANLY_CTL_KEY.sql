\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_stk_anly_ctl_key()
RETURNS TABLE (
	io_act_typ varchar,
	ctl_tgt_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_stk_anly_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_stk_anly_ctl_key$temp(
				io_act_typ varchar (5) NULL,
				ctl_tgt_typ varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_stk_anly_ctl_key_pk_ie ON msw_stk_anly_ctl_key$temp
				USING BTREE (io_act_typ,ctl_tgt_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_stk_anly_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_stk_anly_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_stk_anly_ctl_key
AS
SELECT *
FROM msw_stk_anly_ctl_key();

CREATE OR REPLACE FUNCTION msw_stk_anly_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_stk_anly_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_stk_anly_ctl_key$temp(
				io_act_typ varchar (5) NULL,
				ctl_tgt_typ varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_stk_anly_ctl_key_pk_ie ON msw_stk_anly_ctl_key$temp
				USING BTREE (io_act_typ,ctl_tgt_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_stk_anly_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_stk_anly_ctl_key$temp(
			io_act_typ,
			ctl_tgt_typ
		)VALUES (
			NEW.io_act_typ,
			NEW.ctl_tgt_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_stk_anly_ctl_key$temp
		SET 
			io_act_typ = NEW.io_act_typ,
			ctl_tgt_typ = NEW.ctl_tgt_typ
		WHERE 0=0
		AND (io_act_typ = OLD.io_act_typ OR io_act_typ IS NULL AND OLD.io_act_typ IS NULL)
		AND (ctl_tgt_typ = OLD.ctl_tgt_typ OR ctl_tgt_typ IS NULL AND OLD.ctl_tgt_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_stk_anly_ctl_key$temp
		WHERE 0=0
		AND (io_act_typ = OLD.io_act_typ OR io_act_typ IS NULL AND OLD.io_act_typ IS NULL)
		AND (ctl_tgt_typ = OLD.ctl_tgt_typ OR ctl_tgt_typ IS NULL AND OLD.ctl_tgt_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_stk_anly_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_stk_anly_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE msw_stk_anly_ctl_key$func();
;

