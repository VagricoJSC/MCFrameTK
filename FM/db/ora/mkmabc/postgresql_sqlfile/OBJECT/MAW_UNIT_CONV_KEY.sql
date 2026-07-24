\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_unit_conv_key()
RETURNS TABLE (
	unit_cd varchar,
	base_unit_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_unit_conv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_unit_conv_key$temp(
				unit_cd varchar (5) NULL,
				base_unit_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_unit_conv_key_pk_ie ON maw_unit_conv_key$temp
				USING BTREE (unit_cd,base_unit_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_unit_conv_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_unit_conv_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_unit_conv_key
AS
SELECT *
FROM maw_unit_conv_key();

CREATE OR REPLACE FUNCTION maw_unit_conv_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_unit_conv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_unit_conv_key$temp(
				unit_cd varchar (5) NULL,
				base_unit_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_unit_conv_key_pk_ie ON maw_unit_conv_key$temp
				USING BTREE (unit_cd,base_unit_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_unit_conv_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_unit_conv_key$temp(
			unit_cd,
			base_unit_cd
		)VALUES (
			NEW.unit_cd,
			NEW.base_unit_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_unit_conv_key$temp
		SET 
			unit_cd = NEW.unit_cd,
			base_unit_cd = NEW.base_unit_cd
		WHERE 0=0
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_unit_conv_key$temp
		WHERE 0=0
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_unit_conv_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_unit_conv_key
FOR EACH ROW
EXECUTE PROCEDURE maw_unit_conv_key$func();
;

