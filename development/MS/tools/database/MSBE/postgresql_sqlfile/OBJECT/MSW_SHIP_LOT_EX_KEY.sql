\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ship_lot_ex_key()
RETURNS TABLE (
	cst_cd varchar,
	dlv_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_lot_ex_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_lot_ex_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ship_lot_ex_key_pk_ie ON msw_ship_lot_ex_key$temp
				USING BTREE (cst_cd,dlv_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_lot_ex_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ship_lot_ex_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ship_lot_ex_key
AS
SELECT *
FROM msw_ship_lot_ex_key();
ALTER VIEW msw_ship_lot_ex_key ALTER COLUMN dlv_cd SET DEFAULT '*';
ALTER VIEW msw_ship_lot_ex_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_ship_lot_ex_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_ship_lot_ex_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_ship_lot_ex_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_lot_ex_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_lot_ex_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ship_lot_ex_key_pk_ie ON msw_ship_lot_ex_key$temp
				USING BTREE (cst_cd,dlv_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_lot_ex_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ship_lot_ex_key$temp(
			cst_cd,
			dlv_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.cst_cd,
			NEW.dlv_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ship_lot_ex_key$temp
		SET 
			cst_cd = NEW.cst_cd,
			dlv_cd = NEW.dlv_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ship_lot_ex_key$temp
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ship_lot_ex_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ship_lot_ex_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ship_lot_ex_key$func();
;

