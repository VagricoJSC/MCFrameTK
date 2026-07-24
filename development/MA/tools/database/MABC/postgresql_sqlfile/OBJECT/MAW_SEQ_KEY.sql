\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_seq_key()
RETURNS TABLE (
	num_biz_typ varchar,
	num_ptn_cd varchar,
	key_elm varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_seq_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_seq_key$temp(
				num_biz_typ varchar (50) NULL,
				num_ptn_cd varchar (10) NULL,
				key_elm varchar (45) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_seq_key_pk_ie ON maw_seq_key$temp
				USING BTREE (num_biz_typ,num_ptn_cd,key_elm);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_seq_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_seq_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_seq_key
AS
SELECT *
FROM maw_seq_key();

CREATE OR REPLACE FUNCTION maw_seq_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_seq_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_seq_key$temp(
				num_biz_typ varchar (50) NULL,
				num_ptn_cd varchar (10) NULL,
				key_elm varchar (45) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_seq_key_pk_ie ON maw_seq_key$temp
				USING BTREE (num_biz_typ,num_ptn_cd,key_elm);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_seq_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_seq_key$temp(
			num_biz_typ,
			num_ptn_cd,
			key_elm
		)VALUES (
			NEW.num_biz_typ,
			NEW.num_ptn_cd,
			NEW.key_elm
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_seq_key$temp
		SET 
			num_biz_typ = NEW.num_biz_typ,
			num_ptn_cd = NEW.num_ptn_cd,
			key_elm = NEW.key_elm
		WHERE 0=0
		AND (num_biz_typ = OLD.num_biz_typ OR num_biz_typ IS NULL AND OLD.num_biz_typ IS NULL)
		AND (num_ptn_cd = OLD.num_ptn_cd OR num_ptn_cd IS NULL AND OLD.num_ptn_cd IS NULL)
		AND (key_elm = OLD.key_elm OR key_elm IS NULL AND OLD.key_elm IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_seq_key$temp
		WHERE 0=0
		AND (num_biz_typ = OLD.num_biz_typ OR num_biz_typ IS NULL AND OLD.num_biz_typ IS NULL)
		AND (num_ptn_cd = OLD.num_ptn_cd OR num_ptn_cd IS NULL AND OLD.num_ptn_cd IS NULL)
		AND (key_elm = OLD.key_elm OR key_elm IS NULL AND OLD.key_elm IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_seq_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_seq_key
FOR EACH ROW
EXECUTE PROCEDURE maw_seq_key$func();
;

