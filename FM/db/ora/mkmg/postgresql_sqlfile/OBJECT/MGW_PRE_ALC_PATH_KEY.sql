\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_pre_alc_path_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	pre_alc_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_alc_path_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_alc_path_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				pre_alc_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_pre_alc_path_key_pk_ie ON mgw_pre_alc_path_key$temp
				USING BTREE (calc_no,calc_grp_cd,pre_alc_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_alc_path_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_pre_alc_path_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_pre_alc_path_key
AS
SELECT *
FROM mgw_pre_alc_path_key();

CREATE OR REPLACE FUNCTION mgw_pre_alc_path_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_alc_path_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_alc_path_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				pre_alc_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_pre_alc_path_key_pk_ie ON mgw_pre_alc_path_key$temp
				USING BTREE (calc_no,calc_grp_cd,pre_alc_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_alc_path_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_pre_alc_path_key$temp(
			calc_no,
			calc_grp_cd,
			pre_alc_seq
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.pre_alc_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_pre_alc_path_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			pre_alc_seq = NEW.pre_alc_seq
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (pre_alc_seq = OLD.pre_alc_seq OR pre_alc_seq IS NULL AND OLD.pre_alc_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_pre_alc_path_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (pre_alc_seq = OLD.pre_alc_seq OR pre_alc_seq IS NULL AND OLD.pre_alc_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_pre_alc_path_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_pre_alc_path_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_pre_alc_path_key$func();
;

