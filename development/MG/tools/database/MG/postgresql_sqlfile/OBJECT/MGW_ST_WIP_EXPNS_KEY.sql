\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_st_wip_expns_key()
RETURNS TABLE (
	st_wip_key numeric,
	expns_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_st_wip_expns_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_st_wip_expns_key$temp(
				st_wip_key numeric (15) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_st_wip_expns_key_pk_ie ON mgw_st_wip_expns_key$temp
				USING BTREE (st_wip_key,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_st_wip_expns_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_st_wip_expns_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_st_wip_expns_key
AS
SELECT *
FROM mgw_st_wip_expns_key();

CREATE OR REPLACE FUNCTION mgw_st_wip_expns_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_st_wip_expns_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_st_wip_expns_key$temp(
				st_wip_key numeric (15) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_st_wip_expns_key_pk_ie ON mgw_st_wip_expns_key$temp
				USING BTREE (st_wip_key,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_st_wip_expns_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_st_wip_expns_key$temp(
			st_wip_key,
			expns_cd
		)VALUES (
			NEW.st_wip_key,
			NEW.expns_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_st_wip_expns_key$temp
		SET 
			st_wip_key = NEW.st_wip_key,
			expns_cd = NEW.expns_cd
		WHERE 0=0
		AND (st_wip_key = OLD.st_wip_key OR st_wip_key IS NULL AND OLD.st_wip_key IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_st_wip_expns_key$temp
		WHERE 0=0
		AND (st_wip_key = OLD.st_wip_key OR st_wip_key IS NULL AND OLD.st_wip_key IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_st_wip_expns_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_st_wip_expns_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_st_wip_expns_key$func();
;

