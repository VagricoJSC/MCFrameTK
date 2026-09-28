\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_item_ship_comp_key()
RETURNS TABLE (
	prod_itm_cd varchar,
	prod_itm_sub1 varchar,
	prod_itm_sub2 varchar,
	prod_itm_sub3 varchar,
	surv_line_qty varchar,
	diameter varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_item_ship_comp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_item_ship_comp_key$temp(
				prod_itm_cd varchar (40) NULL,
				prod_itm_sub1 varchar (5) DEFAULT '*' NULL,
				prod_itm_sub2 varchar (5) DEFAULT '*' NULL,
				prod_itm_sub3 varchar (5) DEFAULT '*' NULL,
				surv_line_qty varchar (2) DEFAULT '*' NULL,
				diameter varchar (4) DEFAULT '*' NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_item_ship_comp_key_pk_ie ON maw_item_ship_comp_key$temp
				USING BTREE (prod_itm_cd,prod_itm_sub1,prod_itm_sub2,prod_itm_sub3,surv_line_qty,diameter,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_item_ship_comp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_item_ship_comp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_item_ship_comp_key
AS
SELECT *
FROM maw_item_ship_comp_key();
ALTER VIEW maw_item_ship_comp_key ALTER COLUMN prod_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_item_ship_comp_key ALTER COLUMN prod_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_item_ship_comp_key ALTER COLUMN prod_itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_item_ship_comp_key ALTER COLUMN surv_line_qty SET DEFAULT '*';
ALTER VIEW maw_item_ship_comp_key ALTER COLUMN diameter SET DEFAULT '*';
ALTER VIEW maw_item_ship_comp_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_item_ship_comp_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_item_ship_comp_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_item_ship_comp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_item_ship_comp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_item_ship_comp_key$temp(
				prod_itm_cd varchar (40) NULL,
				prod_itm_sub1 varchar (5) DEFAULT '*' NULL,
				prod_itm_sub2 varchar (5) DEFAULT '*' NULL,
				prod_itm_sub3 varchar (5) DEFAULT '*' NULL,
				surv_line_qty varchar (2) DEFAULT '*' NULL,
				diameter varchar (4) DEFAULT '*' NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_item_ship_comp_key_pk_ie ON maw_item_ship_comp_key$temp
				USING BTREE (prod_itm_cd,prod_itm_sub1,prod_itm_sub2,prod_itm_sub3,surv_line_qty,diameter,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_item_ship_comp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_item_ship_comp_key$temp(
			prod_itm_cd,
			prod_itm_sub1,
			prod_itm_sub2,
			prod_itm_sub3,
			surv_line_qty,
			diameter,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.prod_itm_cd,
			NEW.prod_itm_sub1,
			NEW.prod_itm_sub2,
			NEW.prod_itm_sub3,
			NEW.surv_line_qty,
			NEW.diameter,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_item_ship_comp_key$temp
		SET 
			prod_itm_cd = NEW.prod_itm_cd,
			prod_itm_sub1 = NEW.prod_itm_sub1,
			prod_itm_sub2 = NEW.prod_itm_sub2,
			prod_itm_sub3 = NEW.prod_itm_sub3,
			surv_line_qty = NEW.surv_line_qty,
			diameter = NEW.diameter,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND (prod_itm_cd = OLD.prod_itm_cd OR prod_itm_cd IS NULL AND OLD.prod_itm_cd IS NULL)
		AND (prod_itm_sub1 = OLD.prod_itm_sub1 OR prod_itm_sub1 IS NULL AND OLD.prod_itm_sub1 IS NULL)
		AND (prod_itm_sub2 = OLD.prod_itm_sub2 OR prod_itm_sub2 IS NULL AND OLD.prod_itm_sub2 IS NULL)
		AND (prod_itm_sub3 = OLD.prod_itm_sub3 OR prod_itm_sub3 IS NULL AND OLD.prod_itm_sub3 IS NULL)
		AND (surv_line_qty = OLD.surv_line_qty OR surv_line_qty IS NULL AND OLD.surv_line_qty IS NULL)
		AND (diameter = OLD.diameter OR diameter IS NULL AND OLD.diameter IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_item_ship_comp_key$temp
		WHERE 0=0
		AND (prod_itm_cd = OLD.prod_itm_cd OR prod_itm_cd IS NULL AND OLD.prod_itm_cd IS NULL)
		AND (prod_itm_sub1 = OLD.prod_itm_sub1 OR prod_itm_sub1 IS NULL AND OLD.prod_itm_sub1 IS NULL)
		AND (prod_itm_sub2 = OLD.prod_itm_sub2 OR prod_itm_sub2 IS NULL AND OLD.prod_itm_sub2 IS NULL)
		AND (prod_itm_sub3 = OLD.prod_itm_sub3 OR prod_itm_sub3 IS NULL AND OLD.prod_itm_sub3 IS NULL)
		AND (surv_line_qty = OLD.surv_line_qty OR surv_line_qty IS NULL AND OLD.surv_line_qty IS NULL)
		AND (diameter = OLD.diameter OR diameter IS NULL AND OLD.diameter IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_item_ship_comp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_item_ship_comp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_item_ship_comp_key$func();
;

