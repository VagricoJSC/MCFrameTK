\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_xrate_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	fr_cur_cd varchar,
	to_cur_cd varchar,
	xrate_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_xrate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_xrate_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				fr_cur_cd varchar (3) NULL,
				to_cur_cd varchar (3) NULL,
				xrate_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_xrate_key_pk_ie ON mgw_calc_xrate_key$temp
				USING BTREE (calc_no,calc_grp_cd,fr_cur_cd,to_cur_cd,xrate_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_xrate_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_xrate_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_xrate_key
AS
SELECT *
FROM mgw_calc_xrate_key();

CREATE OR REPLACE FUNCTION mgw_calc_xrate_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_xrate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_xrate_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				fr_cur_cd varchar (3) NULL,
				to_cur_cd varchar (3) NULL,
				xrate_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_xrate_key_pk_ie ON mgw_calc_xrate_key$temp
				USING BTREE (calc_no,calc_grp_cd,fr_cur_cd,to_cur_cd,xrate_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_xrate_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_xrate_key$temp(
			calc_no,
			calc_grp_cd,
			fr_cur_cd,
			to_cur_cd,
			xrate_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.fr_cur_cd,
			NEW.to_cur_cd,
			NEW.xrate_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_xrate_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			fr_cur_cd = NEW.fr_cur_cd,
			to_cur_cd = NEW.to_cur_cd,
			xrate_cd = NEW.xrate_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (fr_cur_cd = OLD.fr_cur_cd OR fr_cur_cd IS NULL AND OLD.fr_cur_cd IS NULL)
		AND (to_cur_cd = OLD.to_cur_cd OR to_cur_cd IS NULL AND OLD.to_cur_cd IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_xrate_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (fr_cur_cd = OLD.fr_cur_cd OR fr_cur_cd IS NULL AND OLD.fr_cur_cd IS NULL)
		AND (to_cur_cd = OLD.to_cur_cd OR to_cur_cd IS NULL AND OLD.to_cur_cd IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_xrate_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_xrate_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_xrate_key$func();
;

