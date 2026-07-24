\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_inpt_chk_key()
RETURNS TABLE (
	func_typ varchar,
	itm_grp_typ varchar,
	itm_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_inpt_chk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_inpt_chk_key$temp(
				func_typ varchar (2) NULL,
				itm_grp_typ varchar (2) NULL,
				itm_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_inpt_chk_key_pk_ie ON maw_inpt_chk_key$temp
				USING BTREE (func_typ,itm_grp_typ,itm_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_inpt_chk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_inpt_chk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_inpt_chk_key
AS
SELECT *
FROM maw_inpt_chk_key();

CREATE OR REPLACE FUNCTION maw_inpt_chk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_inpt_chk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_inpt_chk_key$temp(
				func_typ varchar (2) NULL,
				itm_grp_typ varchar (2) NULL,
				itm_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_inpt_chk_key_pk_ie ON maw_inpt_chk_key$temp
				USING BTREE (func_typ,itm_grp_typ,itm_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_inpt_chk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_inpt_chk_key$temp(
			func_typ,
			itm_grp_typ,
			itm_grp_cd
		)VALUES (
			NEW.func_typ,
			NEW.itm_grp_typ,
			NEW.itm_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_inpt_chk_key$temp
		SET 
			func_typ = NEW.func_typ,
			itm_grp_typ = NEW.itm_grp_typ,
			itm_grp_cd = NEW.itm_grp_cd
		WHERE 0=0
		AND (func_typ = OLD.func_typ OR func_typ IS NULL AND OLD.func_typ IS NULL)
		AND (itm_grp_typ = OLD.itm_grp_typ OR itm_grp_typ IS NULL AND OLD.itm_grp_typ IS NULL)
		AND (itm_grp_cd = OLD.itm_grp_cd OR itm_grp_cd IS NULL AND OLD.itm_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_inpt_chk_key$temp
		WHERE 0=0
		AND (func_typ = OLD.func_typ OR func_typ IS NULL AND OLD.func_typ IS NULL)
		AND (itm_grp_typ = OLD.itm_grp_typ OR itm_grp_typ IS NULL AND OLD.itm_grp_typ IS NULL)
		AND (itm_grp_cd = OLD.itm_grp_cd OR itm_grp_cd IS NULL AND OLD.itm_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_inpt_chk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_inpt_chk_key
FOR EACH ROW
EXECUTE PROCEDURE maw_inpt_chk_key$func();
;

