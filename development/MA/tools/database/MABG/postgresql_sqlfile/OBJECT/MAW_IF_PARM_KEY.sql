\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_if_parm_key()
RETURNS TABLE (
	cost_table_typ varchar,
	tgt_col_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_if_parm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_if_parm_key$temp(
				cost_table_typ varchar (30) NULL,
				tgt_col_typ varchar (30) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_if_parm_key_pk_ie ON maw_if_parm_key$temp
				USING BTREE (cost_table_typ,tgt_col_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_if_parm_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_if_parm_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_if_parm_key
AS
SELECT *
FROM maw_if_parm_key();

CREATE OR REPLACE FUNCTION maw_if_parm_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_if_parm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_if_parm_key$temp(
				cost_table_typ varchar (30) NULL,
				tgt_col_typ varchar (30) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_if_parm_key_pk_ie ON maw_if_parm_key$temp
				USING BTREE (cost_table_typ,tgt_col_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_if_parm_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_if_parm_key$temp(
			cost_table_typ,
			tgt_col_typ
		)VALUES (
			NEW.cost_table_typ,
			NEW.tgt_col_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_if_parm_key$temp
		SET 
			cost_table_typ = NEW.cost_table_typ,
			tgt_col_typ = NEW.tgt_col_typ
		WHERE 0=0
		AND (cost_table_typ = OLD.cost_table_typ OR cost_table_typ IS NULL AND OLD.cost_table_typ IS NULL)
		AND (tgt_col_typ = OLD.tgt_col_typ OR tgt_col_typ IS NULL AND OLD.tgt_col_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_if_parm_key$temp
		WHERE 0=0
		AND (cost_table_typ = OLD.cost_table_typ OR cost_table_typ IS NULL AND OLD.cost_table_typ IS NULL)
		AND (tgt_col_typ = OLD.tgt_col_typ OR tgt_col_typ IS NULL AND OLD.tgt_col_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_if_parm_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_if_parm_key
FOR EACH ROW
EXECUTE PROCEDURE maw_if_parm_key$func();
;

