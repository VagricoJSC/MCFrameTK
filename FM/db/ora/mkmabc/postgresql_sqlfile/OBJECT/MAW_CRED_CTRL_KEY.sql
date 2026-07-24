\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cred_ctrl_key()
RETURNS TABLE (
	cred_cd varchar,
	cur_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cred_ctrl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cred_ctrl_key$temp(
				cred_cd varchar (20) NULL,
				cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cred_ctrl_key_pk_ie ON maw_cred_ctrl_key$temp
				USING BTREE (cred_cd,cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cred_ctrl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cred_ctrl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cred_ctrl_key
AS
SELECT *
FROM maw_cred_ctrl_key();

CREATE OR REPLACE FUNCTION maw_cred_ctrl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cred_ctrl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cred_ctrl_key$temp(
				cred_cd varchar (20) NULL,
				cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cred_ctrl_key_pk_ie ON maw_cred_ctrl_key$temp
				USING BTREE (cred_cd,cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cred_ctrl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cred_ctrl_key$temp(
			cred_cd,
			cur_cd
		)VALUES (
			NEW.cred_cd,
			NEW.cur_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cred_ctrl_key$temp
		SET 
			cred_cd = NEW.cred_cd,
			cur_cd = NEW.cur_cd
		WHERE 0=0
		AND (cred_cd = OLD.cred_cd OR cred_cd IS NULL AND OLD.cred_cd IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cred_ctrl_key$temp
		WHERE 0=0
		AND (cred_cd = OLD.cred_cd OR cred_cd IS NULL AND OLD.cred_cd IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cred_ctrl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cred_ctrl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cred_ctrl_key$func();
;

