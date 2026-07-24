\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_st_stk_diff()
RETURNS TABLE (
	st_stk_key numeric,
	expns_cd varchar,
	diff_amt numeric,
	bf_amt numeric,
	af_amt numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_st_stk_diff$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_st_stk_diff$temp(
				st_stk_key numeric (15) NOT NULL,
				expns_cd varchar (20) NOT NULL,
				diff_amt numeric (21,8) NOT NULL,
				bf_amt numeric (21,8) NOT NULL,
				af_amt numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_st_stk_diff$temp
			ADD CONSTRAINT mgw_st_stk_diff_pk PRIMARY KEY(st_stk_key,expns_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_st_stk_diff$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_st_stk_diff$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_st_stk_diff
AS
SELECT *
FROM mgw_st_stk_diff();

CREATE OR REPLACE FUNCTION mgw_st_stk_diff$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_st_stk_diff$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_st_stk_diff$temp(
				st_stk_key numeric (15) NOT NULL,
				expns_cd varchar (20) NOT NULL,
				diff_amt numeric (21,8) NOT NULL,
				bf_amt numeric (21,8) NOT NULL,
				af_amt numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_st_stk_diff$temp
			ADD CONSTRAINT mgw_st_stk_diff_pk PRIMARY KEY(st_stk_key,expns_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_st_stk_diff$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_st_stk_diff$temp(
			st_stk_key,
			expns_cd,
			diff_amt,
			bf_amt,
			af_amt
		)VALUES (
			NEW.st_stk_key,
			NEW.expns_cd,
			NEW.diff_amt,
			NEW.bf_amt,
			NEW.af_amt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_st_stk_diff$temp
		SET 
			st_stk_key = NEW.st_stk_key,
			expns_cd = NEW.expns_cd,
			diff_amt = NEW.diff_amt,
			bf_amt = NEW.bf_amt,
			af_amt = NEW.af_amt
		WHERE 0=0
		AND st_stk_key = OLD.st_stk_key
		AND expns_cd = OLD.expns_cd
		AND diff_amt = OLD.diff_amt
		AND bf_amt = OLD.bf_amt
		AND af_amt = OLD.af_amt;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_st_stk_diff$temp
		WHERE 0=0
		AND st_stk_key = OLD.st_stk_key
		AND expns_cd = OLD.expns_cd
		AND diff_amt = OLD.diff_amt
		AND bf_amt = OLD.bf_amt
		AND af_amt = OLD.af_amt;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_st_stk_diff$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_st_stk_diff
FOR EACH ROW
EXECUTE PROCEDURE mgw_st_stk_diff$func();
;

