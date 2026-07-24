\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cost_io_conf_key()
RETURNS TABLE (
	cost_io_id numeric,
	io_col_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_io_conf_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_io_conf_key$temp(
				cost_io_id numeric (2,0) NULL,
				io_col_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_io_conf_key_pk_ie ON maw_cost_io_conf_key$temp
				USING BTREE (cost_io_id,io_col_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_io_conf_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cost_io_conf_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cost_io_conf_key
AS
SELECT *
FROM maw_cost_io_conf_key();

CREATE OR REPLACE FUNCTION maw_cost_io_conf_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cost_io_conf_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cost_io_conf_key$temp(
				cost_io_id numeric (2,0) NULL,
				io_col_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cost_io_conf_key_pk_ie ON maw_cost_io_conf_key$temp
				USING BTREE (cost_io_id,io_col_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cost_io_conf_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cost_io_conf_key$temp(
			cost_io_id,
			io_col_cd
		)VALUES (
			NEW.cost_io_id,
			NEW.io_col_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cost_io_conf_key$temp
		SET 
			cost_io_id = NEW.cost_io_id,
			io_col_cd = NEW.io_col_cd
		WHERE 0=0
		AND (cost_io_id = OLD.cost_io_id OR cost_io_id IS NULL AND OLD.cost_io_id IS NULL)
		AND (io_col_cd = OLD.io_col_cd OR io_col_cd IS NULL AND OLD.io_col_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cost_io_conf_key$temp
		WHERE 0=0
		AND (cost_io_id = OLD.cost_io_id OR cost_io_id IS NULL AND OLD.cost_io_id IS NULL)
		AND (io_col_cd = OLD.io_col_cd OR io_col_cd IS NULL AND OLD.io_col_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cost_io_conf_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cost_io_conf_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cost_io_conf_key$func();
;

