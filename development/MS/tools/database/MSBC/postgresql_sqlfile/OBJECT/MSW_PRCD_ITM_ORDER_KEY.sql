\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_prcd_itm_order_key()
RETURNS TABLE (
	itm_ord_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_prcd_itm_order_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_prcd_itm_order_key$temp(
				itm_ord_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_prcd_itm_order_key_pk_ie ON msw_prcd_itm_order_key$temp
				USING BTREE (itm_ord_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_prcd_itm_order_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_prcd_itm_order_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_prcd_itm_order_key
AS
SELECT *
FROM msw_prcd_itm_order_key();

CREATE OR REPLACE FUNCTION msw_prcd_itm_order_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_prcd_itm_order_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_prcd_itm_order_key$temp(
				itm_ord_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_prcd_itm_order_key_pk_ie ON msw_prcd_itm_order_key$temp
				USING BTREE (itm_ord_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_prcd_itm_order_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_prcd_itm_order_key$temp(
			itm_ord_no
		)VALUES (
			NEW.itm_ord_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_prcd_itm_order_key$temp
		SET 
			itm_ord_no = NEW.itm_ord_no
		WHERE 0=0
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_prcd_itm_order_key$temp
		WHERE 0=0
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_prcd_itm_order_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_prcd_itm_order_key
FOR EACH ROW
EXECUTE PROCEDURE msw_prcd_itm_order_key$func();
;

