\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_del_flg_ctl()
RETURNS TABLE (
	tbl_nm varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_del_flg_ctl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_del_flg_ctl$temp(
				tbl_nm varchar (100) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE maw_del_flg_ctl$temp
			ADD CONSTRAINT maw_del_flg_ctl_pk PRIMARY KEY(tbl_nm);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_del_flg_ctl$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_del_flg_ctl$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_del_flg_ctl
AS
SELECT *
FROM maw_del_flg_ctl();

CREATE OR REPLACE FUNCTION maw_del_flg_ctl$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_del_flg_ctl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_del_flg_ctl$temp(
				tbl_nm varchar (100) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE maw_del_flg_ctl$temp
			ADD CONSTRAINT maw_del_flg_ctl_pk PRIMARY KEY(tbl_nm);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_del_flg_ctl$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_del_flg_ctl$temp(
			tbl_nm
		)VALUES (
			NEW.tbl_nm
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_del_flg_ctl$temp
		SET 
			tbl_nm = NEW.tbl_nm
		WHERE 0=0
		AND tbl_nm = OLD.tbl_nm;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_del_flg_ctl$temp
		WHERE 0=0
		AND tbl_nm = OLD.tbl_nm;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_del_flg_ctl$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_del_flg_ctl
FOR EACH ROW
EXECUTE PROCEDURE maw_del_flg_ctl$func();
;

