\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_acc_trd_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	trd_grp varchar,
	ym timestamp(0),
	expns_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_acc_trd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_acc_trd_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				trd_grp varchar (50) NULL,
				ym timestamp(0)  NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_acc_trd_key_pk_ie ON mgw_acc_trd_key$temp
				USING BTREE (calc_no,calc_grp_cd,trd_grp,ym,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_acc_trd_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_acc_trd_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_acc_trd_key
AS
SELECT *
FROM mgw_acc_trd_key();

CREATE OR REPLACE FUNCTION mgw_acc_trd_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_acc_trd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_acc_trd_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				trd_grp varchar (50) NULL,
				ym timestamp(0)  NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_acc_trd_key_pk_ie ON mgw_acc_trd_key$temp
				USING BTREE (calc_no,calc_grp_cd,trd_grp,ym,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_acc_trd_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_acc_trd_key$temp(
			calc_no,
			calc_grp_cd,
			trd_grp,
			ym,
			expns_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.trd_grp,
			NEW.ym,
			NEW.expns_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_acc_trd_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			trd_grp = NEW.trd_grp,
			ym = NEW.ym,
			expns_cd = NEW.expns_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (trd_grp = OLD.trd_grp OR trd_grp IS NULL AND OLD.trd_grp IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_acc_trd_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (trd_grp = OLD.trd_grp OR trd_grp IS NULL AND OLD.trd_grp IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_acc_trd_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_acc_trd_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_acc_trd_key$func();
;

