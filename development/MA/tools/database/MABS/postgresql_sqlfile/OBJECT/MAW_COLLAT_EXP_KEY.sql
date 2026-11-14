\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_collat_exp_key()
RETURNS TABLE (
	match_key varchar,
	sub numeric,
	typ numeric,
	itm_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_collat_exp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_collat_exp_key$temp(
				match_key varchar (30) NULL,
				sub numeric (3) NULL,
				typ numeric (1) NULL,
				itm_cd varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_collat_exp_key_pk_ie ON maw_collat_exp_key$temp
				USING BTREE (match_key,sub,typ,itm_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_collat_exp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_collat_exp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_collat_exp_key
AS
SELECT *
FROM maw_collat_exp_key();

CREATE OR REPLACE FUNCTION maw_collat_exp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_collat_exp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_collat_exp_key$temp(
				match_key varchar (30) NULL,
				sub numeric (3) NULL,
				typ numeric (1) NULL,
				itm_cd varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_collat_exp_key_pk_ie ON maw_collat_exp_key$temp
				USING BTREE (match_key,sub,typ,itm_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_collat_exp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_collat_exp_key$temp(
			match_key,
			sub,
			typ,
			itm_cd
		)VALUES (
			NEW.match_key,
			NEW.sub,
			NEW.typ,
			NEW.itm_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_collat_exp_key$temp
		SET 
			match_key = NEW.match_key,
			sub = NEW.sub,
			typ = NEW.typ,
			itm_cd = NEW.itm_cd
		WHERE 0=0
		AND (match_key = OLD.match_key OR match_key IS NULL AND OLD.match_key IS NULL)
		AND (sub = OLD.sub OR sub IS NULL AND OLD.sub IS NULL)
		AND (typ = OLD.typ OR typ IS NULL AND OLD.typ IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_collat_exp_key$temp
		WHERE 0=0
		AND (match_key = OLD.match_key OR match_key IS NULL AND OLD.match_key IS NULL)
		AND (sub = OLD.sub OR sub IS NULL AND OLD.sub IS NULL)
		AND (typ = OLD.typ OR typ IS NULL AND OLD.typ IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_collat_exp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_collat_exp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_collat_exp_key$func();
;

