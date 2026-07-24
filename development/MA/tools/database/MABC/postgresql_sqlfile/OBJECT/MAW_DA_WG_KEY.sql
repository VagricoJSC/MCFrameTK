\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_da_wg_key()
RETURNS TABLE (
	login_seq varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_da_wg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_da_wg_key$temp(
				login_seq varchar (50) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_da_wg_key_pk_ie ON maw_da_wg_key$temp
				USING BTREE (login_seq,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_da_wg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_da_wg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_da_wg_key
AS
SELECT *
FROM maw_da_wg_key();

CREATE OR REPLACE FUNCTION maw_da_wg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_da_wg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_da_wg_key$temp(
				login_seq varchar (50) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_da_wg_key_pk_ie ON maw_da_wg_key$temp
				USING BTREE (login_seq,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_da_wg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_da_wg_key$temp(
			login_seq,
			wg_cd
		)VALUES (
			NEW.login_seq,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_da_wg_key$temp
		SET 
			login_seq = NEW.login_seq,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (login_seq = OLD.login_seq OR login_seq IS NULL AND OLD.login_seq IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_da_wg_key$temp
		WHERE 0=0
		AND (login_seq = OLD.login_seq OR login_seq IS NULL AND OLD.login_seq IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_da_wg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_da_wg_key
FOR EACH ROW
EXECUTE PROCEDURE maw_da_wg_key$func();
;

