\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_biz_dat_dl_key()
RETURNS TABLE (
	biz_dat_id varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_biz_dat_dl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_biz_dat_dl_key$temp(
				biz_dat_id varchar (50) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_biz_dat_dl_key_pk_ie ON mbw_biz_dat_dl_key$temp
				USING BTREE (biz_dat_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_biz_dat_dl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_biz_dat_dl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_biz_dat_dl_key
AS
SELECT *
FROM mbw_biz_dat_dl_key();

CREATE OR REPLACE FUNCTION mbw_biz_dat_dl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_biz_dat_dl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_biz_dat_dl_key$temp(
				biz_dat_id varchar (50) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_biz_dat_dl_key_pk_ie ON mbw_biz_dat_dl_key$temp
				USING BTREE (biz_dat_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_biz_dat_dl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_biz_dat_dl_key$temp(
			biz_dat_id
		)VALUES (
			NEW.biz_dat_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_biz_dat_dl_key$temp
		SET 
			biz_dat_id = NEW.biz_dat_id
		WHERE 0=0
		AND (biz_dat_id = OLD.biz_dat_id OR biz_dat_id IS NULL AND OLD.biz_dat_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_biz_dat_dl_key$temp
		WHERE 0=0
		AND (biz_dat_id = OLD.biz_dat_id OR biz_dat_id IS NULL AND OLD.biz_dat_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_biz_dat_dl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_biz_dat_dl_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_biz_dat_dl_key$func();
;

