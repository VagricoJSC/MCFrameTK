\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alloc_ctl_key()
RETURNS TABLE (
	to_loc_cd varchar,
	fr_loc_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alloc_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alloc_ctl_key$temp(
				to_loc_cd varchar (20) NULL,
				fr_loc_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alloc_ctl_key_pk_ie ON maw_alloc_ctl_key$temp
				USING BTREE (to_loc_cd,fr_loc_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alloc_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alloc_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alloc_ctl_key
AS
SELECT *
FROM maw_alloc_ctl_key();

CREATE OR REPLACE FUNCTION maw_alloc_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alloc_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alloc_ctl_key$temp(
				to_loc_cd varchar (20) NULL,
				fr_loc_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alloc_ctl_key_pk_ie ON maw_alloc_ctl_key$temp
				USING BTREE (to_loc_cd,fr_loc_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alloc_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alloc_ctl_key$temp(
			to_loc_cd,
			fr_loc_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.to_loc_cd,
			NEW.fr_loc_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alloc_ctl_key$temp
		SET 
			to_loc_cd = NEW.to_loc_cd,
			fr_loc_cd = NEW.fr_loc_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND (to_loc_cd = OLD.to_loc_cd OR to_loc_cd IS NULL AND OLD.to_loc_cd IS NULL)
		AND (fr_loc_cd = OLD.fr_loc_cd OR fr_loc_cd IS NULL AND OLD.fr_loc_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alloc_ctl_key$temp
		WHERE 0=0
		AND (to_loc_cd = OLD.to_loc_cd OR to_loc_cd IS NULL AND OLD.to_loc_cd IS NULL)
		AND (fr_loc_cd = OLD.fr_loc_cd OR fr_loc_cd IS NULL AND OLD.fr_loc_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alloc_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alloc_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alloc_ctl_key$func();
;

