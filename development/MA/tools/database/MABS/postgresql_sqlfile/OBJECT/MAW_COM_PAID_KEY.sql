\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_com_paid_key()
RETURNS TABLE (
	cur_cd varchar,
	min_amt numeric,
	max_amt numeric,
	rcst_cd varchar,
	com_paid numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_com_paid_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_com_paid_key$temp(
				cur_cd varchar (3) NULL,
				min_amt numeric (21,8) NULL,
				max_amt numeric (21,8) NULL,
				rcst_cd varchar (20) NULL,
				com_paid numeric (21,8) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_com_paid_key_pk_ie ON maw_com_paid_key$temp
				USING BTREE (cur_cd,min_amt,max_amt,rcst_cd,com_paid);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_com_paid_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_com_paid_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_com_paid_key
AS
SELECT *
FROM maw_com_paid_key();

CREATE OR REPLACE FUNCTION maw_com_paid_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_com_paid_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_com_paid_key$temp(
				cur_cd varchar (3) NULL,
				min_amt numeric (21,8) NULL,
				max_amt numeric (21,8) NULL,
				rcst_cd varchar (20) NULL,
				com_paid numeric (21,8) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_com_paid_key_pk_ie ON maw_com_paid_key$temp
				USING BTREE (cur_cd,min_amt,max_amt,rcst_cd,com_paid);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_com_paid_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_com_paid_key$temp(
			cur_cd,
			min_amt,
			max_amt,
			rcst_cd,
			com_paid
		)VALUES (
			NEW.cur_cd,
			NEW.min_amt,
			NEW.max_amt,
			NEW.rcst_cd,
			NEW.com_paid
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_com_paid_key$temp
		SET 
			cur_cd = NEW.cur_cd,
			min_amt = NEW.min_amt,
			max_amt = NEW.max_amt,
			rcst_cd = NEW.rcst_cd,
			com_paid = NEW.com_paid
		WHERE 0=0
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (min_amt = OLD.min_amt OR min_amt IS NULL AND OLD.min_amt IS NULL)
		AND (max_amt = OLD.max_amt OR max_amt IS NULL AND OLD.max_amt IS NULL)
		AND (rcst_cd = OLD.rcst_cd OR rcst_cd IS NULL AND OLD.rcst_cd IS NULL)
		AND (com_paid = OLD.com_paid OR com_paid IS NULL AND OLD.com_paid IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_com_paid_key$temp
		WHERE 0=0
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (min_amt = OLD.min_amt OR min_amt IS NULL AND OLD.min_amt IS NULL)
		AND (max_amt = OLD.max_amt OR max_amt IS NULL AND OLD.max_amt IS NULL)
		AND (rcst_cd = OLD.rcst_cd OR rcst_cd IS NULL AND OLD.rcst_cd IS NULL)
		AND (com_paid = OLD.com_paid OR com_paid IS NULL AND OLD.com_paid IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_com_paid_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_com_paid_key
FOR EACH ROW
EXECUTE PROCEDURE maw_com_paid_key$func();
;

