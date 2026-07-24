\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_io_expns_amt()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_ext varchar,
	wg_cd varchar,
	act_io_id varchar,
	act_io_id_sub varchar,
	expns_cd varchar,
	amt numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_io_expns_amt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_io_expns_amt$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				itm_ext varchar (100) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				act_io_id varchar (20) NOT NULL,
				act_io_id_sub varchar (3) NOT NULL,
				expns_cd varchar (20) NOT NULL,
				amt numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_io_expns_amt$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_io_expns_amt$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_io_expns_amt
AS
SELECT *
FROM mgw_calc_io_expns_amt();
ALTER VIEW mgw_calc_io_expns_amt ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_calc_io_expns_amt ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_calc_io_expns_amt ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_calc_io_expns_amt ALTER COLUMN itm_ext SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_calc_io_expns_amt$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_io_expns_amt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_io_expns_amt$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				itm_ext varchar (100) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				act_io_id varchar (20) NOT NULL,
				act_io_id_sub varchar (3) NOT NULL,
				expns_cd varchar (20) NOT NULL,
				amt numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_io_expns_amt$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_io_expns_amt$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_ext,
			wg_cd,
			act_io_id,
			act_io_id_sub,
			expns_cd,
			amt
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_ext,
			NEW.wg_cd,
			NEW.act_io_id,
			NEW.act_io_id_sub,
			NEW.expns_cd,
			NEW.amt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_io_expns_amt$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_ext = NEW.itm_ext,
			wg_cd = NEW.wg_cd,
			act_io_id = NEW.act_io_id,
			act_io_id_sub = NEW.act_io_id_sub,
			expns_cd = NEW.expns_cd,
			amt = NEW.amt
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND itm_ext = OLD.itm_ext
		AND wg_cd = OLD.wg_cd
		AND act_io_id = OLD.act_io_id
		AND act_io_id_sub = OLD.act_io_id_sub
		AND expns_cd = OLD.expns_cd
		AND amt = OLD.amt;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_io_expns_amt$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND itm_ext = OLD.itm_ext
		AND wg_cd = OLD.wg_cd
		AND act_io_id = OLD.act_io_id
		AND act_io_id_sub = OLD.act_io_id_sub
		AND expns_cd = OLD.expns_cd
		AND amt = OLD.amt;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_io_expns_amt$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_io_expns_amt
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_io_expns_amt$func();
;

