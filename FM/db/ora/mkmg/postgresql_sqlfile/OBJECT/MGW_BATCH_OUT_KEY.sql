\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_batch_out_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	batch_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_batch_out_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_batch_out_key$temp(
				calc_grp_cd varchar (10) NULL,
				batch_typ varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_batch_out_key_pk_ie ON mgw_batch_out_key$temp
				USING BTREE (calc_grp_cd,batch_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_batch_out_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_batch_out_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_batch_out_key
AS
SELECT *
FROM mgw_batch_out_key();

CREATE OR REPLACE FUNCTION mgw_batch_out_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_batch_out_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_batch_out_key$temp(
				calc_grp_cd varchar (10) NULL,
				batch_typ varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_batch_out_key_pk_ie ON mgw_batch_out_key$temp
				USING BTREE (calc_grp_cd,batch_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_batch_out_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_batch_out_key$temp(
			calc_grp_cd,
			batch_typ
		)VALUES (
			NEW.calc_grp_cd,
			NEW.batch_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_batch_out_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			batch_typ = NEW.batch_typ
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (batch_typ = OLD.batch_typ OR batch_typ IS NULL AND OLD.batch_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_batch_out_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (batch_typ = OLD.batch_typ OR batch_typ IS NULL AND OLD.batch_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_batch_out_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_batch_out_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_batch_out_key$func();
;

