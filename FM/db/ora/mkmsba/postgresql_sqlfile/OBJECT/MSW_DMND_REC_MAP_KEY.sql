\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_dmnd_rec_map_key()
RETURNS TABLE (
	fr_dmnd_no varchar,
	to_dmnd_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dmnd_rec_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dmnd_rec_map_key$temp(
				fr_dmnd_no varchar (15) NULL,
				to_dmnd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_dmnd_rec_map_key_pk_ie ON msw_dmnd_rec_map_key$temp
				USING BTREE (fr_dmnd_no,to_dmnd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dmnd_rec_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_dmnd_rec_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_dmnd_rec_map_key
AS
SELECT *
FROM msw_dmnd_rec_map_key();

CREATE OR REPLACE FUNCTION msw_dmnd_rec_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dmnd_rec_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dmnd_rec_map_key$temp(
				fr_dmnd_no varchar (15) NULL,
				to_dmnd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_dmnd_rec_map_key_pk_ie ON msw_dmnd_rec_map_key$temp
				USING BTREE (fr_dmnd_no,to_dmnd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dmnd_rec_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_dmnd_rec_map_key$temp(
			fr_dmnd_no,
			to_dmnd_no
		)VALUES (
			NEW.fr_dmnd_no,
			NEW.to_dmnd_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_dmnd_rec_map_key$temp
		SET 
			fr_dmnd_no = NEW.fr_dmnd_no,
			to_dmnd_no = NEW.to_dmnd_no
		WHERE 0=0
		AND (fr_dmnd_no = OLD.fr_dmnd_no OR fr_dmnd_no IS NULL AND OLD.fr_dmnd_no IS NULL)
		AND (to_dmnd_no = OLD.to_dmnd_no OR to_dmnd_no IS NULL AND OLD.to_dmnd_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_dmnd_rec_map_key$temp
		WHERE 0=0
		AND (fr_dmnd_no = OLD.fr_dmnd_no OR fr_dmnd_no IS NULL AND OLD.fr_dmnd_no IS NULL)
		AND (to_dmnd_no = OLD.to_dmnd_no OR to_dmnd_no IS NULL AND OLD.to_dmnd_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_dmnd_rec_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_dmnd_rec_map_key
FOR EACH ROW
EXECUTE PROCEDURE msw_dmnd_rec_map_key$func();
;

