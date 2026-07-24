\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_biz_dat_dl_hst_key()
RETURNS TABLE (
	biz_dat_dl_hst_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_biz_dat_dl_hst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_biz_dat_dl_hst_key$temp(
				biz_dat_dl_hst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_biz_dat_dl_hst_key_pk_ie ON maw_biz_dat_dl_hst_key$temp
				USING BTREE (biz_dat_dl_hst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_biz_dat_dl_hst_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_biz_dat_dl_hst_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_biz_dat_dl_hst_key
AS
SELECT *
FROM maw_biz_dat_dl_hst_key();

CREATE OR REPLACE FUNCTION maw_biz_dat_dl_hst_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_biz_dat_dl_hst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_biz_dat_dl_hst_key$temp(
				biz_dat_dl_hst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_biz_dat_dl_hst_key_pk_ie ON maw_biz_dat_dl_hst_key$temp
				USING BTREE (biz_dat_dl_hst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_biz_dat_dl_hst_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_biz_dat_dl_hst_key$temp(
			biz_dat_dl_hst_no
		)VALUES (
			NEW.biz_dat_dl_hst_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_biz_dat_dl_hst_key$temp
		SET 
			biz_dat_dl_hst_no = NEW.biz_dat_dl_hst_no
		WHERE 0=0
		AND (biz_dat_dl_hst_no = OLD.biz_dat_dl_hst_no OR biz_dat_dl_hst_no IS NULL AND OLD.biz_dat_dl_hst_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_biz_dat_dl_hst_key$temp
		WHERE 0=0
		AND (biz_dat_dl_hst_no = OLD.biz_dat_dl_hst_no OR biz_dat_dl_hst_no IS NULL AND OLD.biz_dat_dl_hst_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_biz_dat_dl_hst_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_biz_dat_dl_hst_key
FOR EACH ROW
EXECUTE PROCEDURE maw_biz_dat_dl_hst_key$func();
;

