\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_calc_menu_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	menu_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_calc_menu_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_calc_menu_key$temp(
				calc_grp_cd varchar (10) NULL,
				menu_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_calc_menu_key_pk_ie ON maw_calc_menu_key$temp
				USING BTREE (calc_grp_cd,menu_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_calc_menu_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_calc_menu_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_calc_menu_key
AS
SELECT *
FROM maw_calc_menu_key();

CREATE OR REPLACE FUNCTION maw_calc_menu_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_calc_menu_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_calc_menu_key$temp(
				calc_grp_cd varchar (10) NULL,
				menu_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_calc_menu_key_pk_ie ON maw_calc_menu_key$temp
				USING BTREE (calc_grp_cd,menu_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_calc_menu_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_calc_menu_key$temp(
			calc_grp_cd,
			menu_cd
		)VALUES (
			NEW.calc_grp_cd,
			NEW.menu_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_calc_menu_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			menu_cd = NEW.menu_cd
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (menu_cd = OLD.menu_cd OR menu_cd IS NULL AND OLD.menu_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_calc_menu_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (menu_cd = OLD.menu_cd OR menu_cd IS NULL AND OLD.menu_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_calc_menu_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_calc_menu_key
FOR EACH ROW
EXECUTE PROCEDURE maw_calc_menu_key$func();
;

