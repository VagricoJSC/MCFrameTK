\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_pre_alc_dpt_key()
RETURNS TABLE (
	pre_alc_dpt_ptn varchar,
	src_dpt_cd varchar,
	dst_dpt_cd varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_pre_alc_dpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_pre_alc_dpt_key$temp(
				pre_alc_dpt_ptn varchar (10) NULL,
				src_dpt_cd varchar (20) NULL,
				dst_dpt_cd varchar (20) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_pre_alc_dpt_key_pk_ie ON maw_pre_alc_dpt_key$temp
				USING BTREE (pre_alc_dpt_ptn,src_dpt_cd,dst_dpt_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_pre_alc_dpt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_pre_alc_dpt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_pre_alc_dpt_key
AS
SELECT *
FROM maw_pre_alc_dpt_key();

CREATE OR REPLACE FUNCTION maw_pre_alc_dpt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_pre_alc_dpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_pre_alc_dpt_key$temp(
				pre_alc_dpt_ptn varchar (10) NULL,
				src_dpt_cd varchar (20) NULL,
				dst_dpt_cd varchar (20) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_pre_alc_dpt_key_pk_ie ON maw_pre_alc_dpt_key$temp
				USING BTREE (pre_alc_dpt_ptn,src_dpt_cd,dst_dpt_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_pre_alc_dpt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_pre_alc_dpt_key$temp(
			pre_alc_dpt_ptn,
			src_dpt_cd,
			dst_dpt_cd,
			term
		)VALUES (
			NEW.pre_alc_dpt_ptn,
			NEW.src_dpt_cd,
			NEW.dst_dpt_cd,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_pre_alc_dpt_key$temp
		SET 
			pre_alc_dpt_ptn = NEW.pre_alc_dpt_ptn,
			src_dpt_cd = NEW.src_dpt_cd,
			dst_dpt_cd = NEW.dst_dpt_cd,
			term = NEW.term
		WHERE 0=0
		AND (pre_alc_dpt_ptn = OLD.pre_alc_dpt_ptn OR pre_alc_dpt_ptn IS NULL AND OLD.pre_alc_dpt_ptn IS NULL)
		AND (src_dpt_cd = OLD.src_dpt_cd OR src_dpt_cd IS NULL AND OLD.src_dpt_cd IS NULL)
		AND (dst_dpt_cd = OLD.dst_dpt_cd OR dst_dpt_cd IS NULL AND OLD.dst_dpt_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_pre_alc_dpt_key$temp
		WHERE 0=0
		AND (pre_alc_dpt_ptn = OLD.pre_alc_dpt_ptn OR pre_alc_dpt_ptn IS NULL AND OLD.pre_alc_dpt_ptn IS NULL)
		AND (src_dpt_cd = OLD.src_dpt_cd OR src_dpt_cd IS NULL AND OLD.src_dpt_cd IS NULL)
		AND (dst_dpt_cd = OLD.dst_dpt_cd OR dst_dpt_cd IS NULL AND OLD.dst_dpt_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_pre_alc_dpt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_pre_alc_dpt_key
FOR EACH ROW
EXECUTE PROCEDURE maw_pre_alc_dpt_key$func();
;

