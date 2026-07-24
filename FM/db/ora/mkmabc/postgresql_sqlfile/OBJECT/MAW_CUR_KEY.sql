\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cur_key()
RETURNS TABLE (
	cur_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cur_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cur_key$temp(
				cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cur_key_pk_ie ON maw_cur_key$temp
				USING BTREE (cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cur_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cur_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cur_key
AS
SELECT *
FROM maw_cur_key();

CREATE OR REPLACE FUNCTION maw_cur_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cur_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cur_key$temp(
				cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cur_key_pk_ie ON maw_cur_key$temp
				USING BTREE (cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cur_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cur_key$temp(
			cur_cd
		)VALUES (
			NEW.cur_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cur_key$temp
		SET 
			cur_cd = NEW.cur_cd
		WHERE 0=0
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cur_key$temp
		WHERE 0=0
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cur_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cur_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cur_key$func();
;

