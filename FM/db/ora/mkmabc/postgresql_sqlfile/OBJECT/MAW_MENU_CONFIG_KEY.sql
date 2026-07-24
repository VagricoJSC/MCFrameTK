\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_menu_config_key()
RETURNS TABLE (
	menu_cd varchar,
	menu_no numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_menu_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_menu_config_key$temp(
				menu_cd varchar (10) NULL,
				menu_no numeric (2,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_menu_config_key_pk_ie ON maw_menu_config_key$temp
				USING BTREE (menu_cd,menu_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_menu_config_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_menu_config_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_menu_config_key
AS
SELECT *
FROM maw_menu_config_key();

CREATE OR REPLACE FUNCTION maw_menu_config_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_menu_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_menu_config_key$temp(
				menu_cd varchar (10) NULL,
				menu_no numeric (2,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_menu_config_key_pk_ie ON maw_menu_config_key$temp
				USING BTREE (menu_cd,menu_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_menu_config_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_menu_config_key$temp(
			menu_cd,
			menu_no
		)VALUES (
			NEW.menu_cd,
			NEW.menu_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_menu_config_key$temp
		SET 
			menu_cd = NEW.menu_cd,
			menu_no = NEW.menu_no
		WHERE 0=0
		AND (menu_cd = OLD.menu_cd OR menu_cd IS NULL AND OLD.menu_cd IS NULL)
		AND (menu_no = OLD.menu_no OR menu_no IS NULL AND OLD.menu_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_menu_config_key$temp
		WHERE 0=0
		AND (menu_cd = OLD.menu_cd OR menu_cd IS NULL AND OLD.menu_cd IS NULL)
		AND (menu_no = OLD.menu_no OR menu_no IS NULL AND OLD.menu_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_menu_config_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_menu_config_key
FOR EACH ROW
EXECUTE PROCEDURE maw_menu_config_key$func();
;

