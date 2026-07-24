\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ship_stk_rpl_lock_key()
RETURNS TABLE (
	loc_cd varchar,
	str_ln_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_stk_rpl_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_stk_rpl_lock_key$temp(
				loc_cd varchar (20) NULL,
				str_ln_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ship_stk_rpl_lock_key_pk_ie ON msw_ship_stk_rpl_lock_key$temp
				USING BTREE (loc_cd,str_ln_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_stk_rpl_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ship_stk_rpl_lock_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ship_stk_rpl_lock_key
AS
SELECT *
FROM msw_ship_stk_rpl_lock_key();

CREATE OR REPLACE FUNCTION msw_ship_stk_rpl_lock_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_stk_rpl_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_stk_rpl_lock_key$temp(
				loc_cd varchar (20) NULL,
				str_ln_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ship_stk_rpl_lock_key_pk_ie ON msw_ship_stk_rpl_lock_key$temp
				USING BTREE (loc_cd,str_ln_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_stk_rpl_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ship_stk_rpl_lock_key$temp(
			loc_cd,
			str_ln_cd
		)VALUES (
			NEW.loc_cd,
			NEW.str_ln_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ship_stk_rpl_lock_key$temp
		SET 
			loc_cd = NEW.loc_cd,
			str_ln_cd = NEW.str_ln_cd
		WHERE 0=0
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ship_stk_rpl_lock_key$temp
		WHERE 0=0
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ship_stk_rpl_lock_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ship_stk_rpl_lock_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ship_stk_rpl_lock_key$func();
;

