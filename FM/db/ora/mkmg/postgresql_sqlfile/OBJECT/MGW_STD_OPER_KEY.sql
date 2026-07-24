\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_std_oper_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	oper_rec_no numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_std_oper_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_std_oper_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				oper_rec_no numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_std_oper_key_pk_ie ON mgw_std_oper_key$temp
				USING BTREE (calc_no,calc_grp_cd,oper_rec_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_std_oper_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_std_oper_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_std_oper_key
AS
SELECT *
FROM mgw_std_oper_key();

CREATE OR REPLACE FUNCTION mgw_std_oper_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_std_oper_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_std_oper_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				oper_rec_no numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_std_oper_key_pk_ie ON mgw_std_oper_key$temp
				USING BTREE (calc_no,calc_grp_cd,oper_rec_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_std_oper_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_std_oper_key$temp(
			calc_no,
			calc_grp_cd,
			oper_rec_no
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.oper_rec_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_std_oper_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			oper_rec_no = NEW.oper_rec_no
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (oper_rec_no = OLD.oper_rec_no OR oper_rec_no IS NULL AND OLD.oper_rec_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_std_oper_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (oper_rec_no = OLD.oper_rec_no OR oper_rec_no IS NULL AND OLD.oper_rec_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_std_oper_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_std_oper_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_std_oper_key$func();
;

