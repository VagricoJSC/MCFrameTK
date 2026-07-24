\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_jnl_historyd_key()
RETURNS TABLE (
	data_no varchar,
	jnl_grp_no varchar,
	table_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_jnl_historyd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_jnl_historyd_key$temp(
				data_no varchar (15) NULL,
				jnl_grp_no varchar (10) NULL,
				table_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_jnl_historyd_key_pk_ie ON mbw_jnl_historyd_key$temp
				USING BTREE (data_no,jnl_grp_no,table_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_jnl_historyd_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_jnl_historyd_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_jnl_historyd_key
AS
SELECT *
FROM mbw_jnl_historyd_key();

CREATE OR REPLACE FUNCTION mbw_jnl_historyd_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_jnl_historyd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_jnl_historyd_key$temp(
				data_no varchar (15) NULL,
				jnl_grp_no varchar (10) NULL,
				table_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_jnl_historyd_key_pk_ie ON mbw_jnl_historyd_key$temp
				USING BTREE (data_no,jnl_grp_no,table_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_jnl_historyd_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_jnl_historyd_key$temp(
			data_no,
			jnl_grp_no,
			table_typ
		)VALUES (
			NEW.data_no,
			NEW.jnl_grp_no,
			NEW.table_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_jnl_historyd_key$temp
		SET 
			data_no = NEW.data_no,
			jnl_grp_no = NEW.jnl_grp_no,
			table_typ = NEW.table_typ
		WHERE 0=0
		AND (data_no = OLD.data_no OR data_no IS NULL AND OLD.data_no IS NULL)
		AND (jnl_grp_no = OLD.jnl_grp_no OR jnl_grp_no IS NULL AND OLD.jnl_grp_no IS NULL)
		AND (table_typ = OLD.table_typ OR table_typ IS NULL AND OLD.table_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_jnl_historyd_key$temp
		WHERE 0=0
		AND (data_no = OLD.data_no OR data_no IS NULL AND OLD.data_no IS NULL)
		AND (jnl_grp_no = OLD.jnl_grp_no OR jnl_grp_no IS NULL AND OLD.jnl_grp_no IS NULL)
		AND (table_typ = OLD.table_typ OR table_typ IS NULL AND OLD.table_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_jnl_historyd_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_jnl_historyd_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_jnl_historyd_key$func();
;

