\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_aprv_d_key()
RETURNS TABLE (
	aprv_no varchar,
	aprv_no_seq numeric,
	aprv_role_cd varchar,
	aprv_usr_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_aprv_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_aprv_d_key$temp(
				aprv_no varchar (15) NULL,
				aprv_no_seq numeric (9,0) NULL,
				aprv_role_cd varchar (10) NULL,
				aprv_usr_cd varchar (500) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_aprv_d_key_pk_ie ON mbw_aprv_d_key$temp
				USING BTREE (aprv_no,aprv_no_seq,aprv_role_cd,aprv_usr_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_aprv_d_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_aprv_d_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_aprv_d_key
AS
SELECT *
FROM mbw_aprv_d_key();

CREATE OR REPLACE FUNCTION mbw_aprv_d_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_aprv_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_aprv_d_key$temp(
				aprv_no varchar (15) NULL,
				aprv_no_seq numeric (9,0) NULL,
				aprv_role_cd varchar (10) NULL,
				aprv_usr_cd varchar (500) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_aprv_d_key_pk_ie ON mbw_aprv_d_key$temp
				USING BTREE (aprv_no,aprv_no_seq,aprv_role_cd,aprv_usr_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_aprv_d_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_aprv_d_key$temp(
			aprv_no,
			aprv_no_seq,
			aprv_role_cd,
			aprv_usr_cd
		)VALUES (
			NEW.aprv_no,
			NEW.aprv_no_seq,
			NEW.aprv_role_cd,
			NEW.aprv_usr_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_aprv_d_key$temp
		SET 
			aprv_no = NEW.aprv_no,
			aprv_no_seq = NEW.aprv_no_seq,
			aprv_role_cd = NEW.aprv_role_cd,
			aprv_usr_cd = NEW.aprv_usr_cd
		WHERE 0=0
		AND (aprv_no = OLD.aprv_no OR aprv_no IS NULL AND OLD.aprv_no IS NULL)
		AND (aprv_no_seq = OLD.aprv_no_seq OR aprv_no_seq IS NULL AND OLD.aprv_no_seq IS NULL)
		AND (aprv_role_cd = OLD.aprv_role_cd OR aprv_role_cd IS NULL AND OLD.aprv_role_cd IS NULL)
		AND (aprv_usr_cd = OLD.aprv_usr_cd OR aprv_usr_cd IS NULL AND OLD.aprv_usr_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_aprv_d_key$temp
		WHERE 0=0
		AND (aprv_no = OLD.aprv_no OR aprv_no IS NULL AND OLD.aprv_no IS NULL)
		AND (aprv_no_seq = OLD.aprv_no_seq OR aprv_no_seq IS NULL AND OLD.aprv_no_seq IS NULL)
		AND (aprv_role_cd = OLD.aprv_role_cd OR aprv_role_cd IS NULL AND OLD.aprv_role_cd IS NULL)
		AND (aprv_usr_cd = OLD.aprv_usr_cd OR aprv_usr_cd IS NULL AND OLD.aprv_usr_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_aprv_d_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_aprv_d_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_aprv_d_key$func();
;

