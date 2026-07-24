\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_push_ntc_usr_key()
RETURNS TABLE (
	push_ntc_no varchar,
	usr_cd varchar,
	msg_imp_typ varchar,
	push_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc_usr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc_usr_key$temp(
				push_ntc_no varchar (15) NULL,
				usr_cd varchar (500) NULL,
				msg_imp_typ varchar (1) NULL,
				push_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_push_ntc_usr_key_pk_ie ON maw_push_ntc_usr_key$temp
				USING BTREE (push_ntc_no,usr_cd,msg_imp_typ,push_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc_usr_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_push_ntc_usr_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_push_ntc_usr_key
AS
SELECT *
FROM maw_push_ntc_usr_key();

CREATE OR REPLACE FUNCTION maw_push_ntc_usr_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc_usr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc_usr_key$temp(
				push_ntc_no varchar (15) NULL,
				usr_cd varchar (500) NULL,
				msg_imp_typ varchar (1) NULL,
				push_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_push_ntc_usr_key_pk_ie ON maw_push_ntc_usr_key$temp
				USING BTREE (push_ntc_no,usr_cd,msg_imp_typ,push_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc_usr_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_push_ntc_usr_key$temp(
			push_ntc_no,
			usr_cd,
			msg_imp_typ,
			push_typ
		)VALUES (
			NEW.push_ntc_no,
			NEW.usr_cd,
			NEW.msg_imp_typ,
			NEW.push_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_push_ntc_usr_key$temp
		SET 
			push_ntc_no = NEW.push_ntc_no,
			usr_cd = NEW.usr_cd,
			msg_imp_typ = NEW.msg_imp_typ,
			push_typ = NEW.push_typ
		WHERE 0=0
		AND (push_ntc_no = OLD.push_ntc_no OR push_ntc_no IS NULL AND OLD.push_ntc_no IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (msg_imp_typ = OLD.msg_imp_typ OR msg_imp_typ IS NULL AND OLD.msg_imp_typ IS NULL)
		AND (push_typ = OLD.push_typ OR push_typ IS NULL AND OLD.push_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_push_ntc_usr_key$temp
		WHERE 0=0
		AND (push_ntc_no = OLD.push_ntc_no OR push_ntc_no IS NULL AND OLD.push_ntc_no IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (msg_imp_typ = OLD.msg_imp_typ OR msg_imp_typ IS NULL AND OLD.msg_imp_typ IS NULL)
		AND (push_typ = OLD.push_typ OR push_typ IS NULL AND OLD.push_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_push_ntc_usr_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_push_ntc_usr_key
FOR EACH ROW
EXECUTE PROCEDURE maw_push_ntc_usr_key$func();
;

