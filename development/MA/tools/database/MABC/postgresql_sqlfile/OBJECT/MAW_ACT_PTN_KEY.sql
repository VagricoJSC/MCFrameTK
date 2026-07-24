\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_act_ptn_key()
RETURNS TABLE (
	act_ptn_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_act_ptn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_act_ptn_key$temp(
				act_ptn_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_act_ptn_key_pk_ie ON maw_act_ptn_key$temp
				USING BTREE (act_ptn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_act_ptn_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_act_ptn_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_act_ptn_key
AS
SELECT *
FROM maw_act_ptn_key();

CREATE OR REPLACE FUNCTION maw_act_ptn_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_act_ptn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_act_ptn_key$temp(
				act_ptn_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_act_ptn_key_pk_ie ON maw_act_ptn_key$temp
				USING BTREE (act_ptn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_act_ptn_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_act_ptn_key$temp(
			act_ptn_cd
		)VALUES (
			NEW.act_ptn_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_act_ptn_key$temp
		SET 
			act_ptn_cd = NEW.act_ptn_cd
		WHERE 0=0
		AND (act_ptn_cd = OLD.act_ptn_cd OR act_ptn_cd IS NULL AND OLD.act_ptn_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_act_ptn_key$temp
		WHERE 0=0
		AND (act_ptn_cd = OLD.act_ptn_cd OR act_ptn_cd IS NULL AND OLD.act_ptn_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_act_ptn_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_act_ptn_key
FOR EACH ROW
EXECUTE PROCEDURE maw_act_ptn_key$func();
;

