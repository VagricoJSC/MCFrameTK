\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_std_cost_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	inpt_rec_no numeric,
	oper_rec_no numeric,
	wk_rec_no numeric,
	expns_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_std_cost_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_std_cost_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				inpt_rec_no numeric (9,0) NULL,
				oper_rec_no numeric (9,0) NULL,
				wk_rec_no numeric (9,0) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_std_cost_key_pk_ie ON mgw_std_cost_key$temp
				USING BTREE (calc_no,calc_grp_cd,inpt_rec_no,oper_rec_no,wk_rec_no,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_std_cost_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_std_cost_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_std_cost_key
AS
SELECT *
FROM mgw_std_cost_key();

CREATE OR REPLACE FUNCTION mgw_std_cost_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_std_cost_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_std_cost_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				inpt_rec_no numeric (9,0) NULL,
				oper_rec_no numeric (9,0) NULL,
				wk_rec_no numeric (9,0) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_std_cost_key_pk_ie ON mgw_std_cost_key$temp
				USING BTREE (calc_no,calc_grp_cd,inpt_rec_no,oper_rec_no,wk_rec_no,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_std_cost_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_std_cost_key$temp(
			calc_no,
			calc_grp_cd,
			inpt_rec_no,
			oper_rec_no,
			wk_rec_no,
			expns_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.inpt_rec_no,
			NEW.oper_rec_no,
			NEW.wk_rec_no,
			NEW.expns_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_std_cost_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			inpt_rec_no = NEW.inpt_rec_no,
			oper_rec_no = NEW.oper_rec_no,
			wk_rec_no = NEW.wk_rec_no,
			expns_cd = NEW.expns_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (inpt_rec_no = OLD.inpt_rec_no OR inpt_rec_no IS NULL AND OLD.inpt_rec_no IS NULL)
		AND (oper_rec_no = OLD.oper_rec_no OR oper_rec_no IS NULL AND OLD.oper_rec_no IS NULL)
		AND (wk_rec_no = OLD.wk_rec_no OR wk_rec_no IS NULL AND OLD.wk_rec_no IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_std_cost_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (inpt_rec_no = OLD.inpt_rec_no OR inpt_rec_no IS NULL AND OLD.inpt_rec_no IS NULL)
		AND (oper_rec_no = OLD.oper_rec_no OR oper_rec_no IS NULL AND OLD.oper_rec_no IS NULL)
		AND (wk_rec_no = OLD.wk_rec_no OR wk_rec_no IS NULL AND OLD.wk_rec_no IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_std_cost_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_std_cost_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_std_cost_key$func();
;

