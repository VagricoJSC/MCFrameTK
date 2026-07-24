\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_calc_cost_io_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	cost_io_id numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_calc_cost_io_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_calc_cost_io_key$temp(
				calc_grp_cd varchar (10) NULL,
				cost_io_id numeric (2,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_calc_cost_io_key_pk_ie ON maw_calc_cost_io_key$temp
				USING BTREE (calc_grp_cd,cost_io_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_calc_cost_io_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_calc_cost_io_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_calc_cost_io_key
AS
SELECT *
FROM maw_calc_cost_io_key();

CREATE OR REPLACE FUNCTION maw_calc_cost_io_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_calc_cost_io_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_calc_cost_io_key$temp(
				calc_grp_cd varchar (10) NULL,
				cost_io_id numeric (2,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_calc_cost_io_key_pk_ie ON maw_calc_cost_io_key$temp
				USING BTREE (calc_grp_cd,cost_io_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_calc_cost_io_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_calc_cost_io_key$temp(
			calc_grp_cd,
			cost_io_id
		)VALUES (
			NEW.calc_grp_cd,
			NEW.cost_io_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_calc_cost_io_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			cost_io_id = NEW.cost_io_id
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (cost_io_id = OLD.cost_io_id OR cost_io_id IS NULL AND OLD.cost_io_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_calc_cost_io_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (cost_io_id = OLD.cost_io_id OR cost_io_id IS NULL AND OLD.cost_io_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_calc_cost_io_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_calc_cost_io_key
FOR EACH ROW
EXECUTE PROCEDURE maw_calc_cost_io_key$func();
;

