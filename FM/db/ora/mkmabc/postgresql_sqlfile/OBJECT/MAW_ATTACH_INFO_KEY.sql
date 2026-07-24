\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_attach_info_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	wg_cd varchar,
	attach_info_key1 varchar,
	attach_info_key2 varchar,
	attach_info_key3 varchar,
	attach_info_key4 varchar,
	attach_info_key5 varchar,
	attach_info_id varchar,
	attach_info_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_attach_info_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_attach_info_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				sno1 varchar (15) DEFAULT '*' NULL,
				sno2 varchar (15) DEFAULT '*' NULL,
				sno3 varchar (15) DEFAULT '*' NULL,
				sno4 varchar (15) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				attach_info_key1 varchar (50) NULL,
				attach_info_key2 varchar (50) NULL,
				attach_info_key3 varchar (50) NULL,
				attach_info_key4 varchar (50) NULL,
				attach_info_key5 varchar (50) NULL,
				attach_info_id varchar (20) NULL,
				attach_info_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_attach_info_key_pk_ie ON maw_attach_info_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,sno1,sno2,sno3,sno4,wg_cd,attach_info_key1,attach_info_key2,attach_info_key3,attach_info_key4,attach_info_key5,attach_info_id,attach_info_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_attach_info_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_attach_info_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_attach_info_key
AS
SELECT *
FROM maw_attach_info_key();
ALTER VIEW maw_attach_info_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_attach_info_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_attach_info_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_attach_info_key ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW maw_attach_info_key ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW maw_attach_info_key ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW maw_attach_info_key ALTER COLUMN sno4 SET DEFAULT '*';
ALTER VIEW maw_attach_info_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_attach_info_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_attach_info_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_attach_info_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				sno1 varchar (15) DEFAULT '*' NULL,
				sno2 varchar (15) DEFAULT '*' NULL,
				sno3 varchar (15) DEFAULT '*' NULL,
				sno4 varchar (15) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				attach_info_key1 varchar (50) NULL,
				attach_info_key2 varchar (50) NULL,
				attach_info_key3 varchar (50) NULL,
				attach_info_key4 varchar (50) NULL,
				attach_info_key5 varchar (50) NULL,
				attach_info_id varchar (20) NULL,
				attach_info_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_attach_info_key_pk_ie ON maw_attach_info_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,sno1,sno2,sno3,sno4,wg_cd,attach_info_key1,attach_info_key2,attach_info_key3,attach_info_key4,attach_info_key5,attach_info_id,attach_info_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_attach_info_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_attach_info_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd,
			attach_info_key1,
			attach_info_key2,
			attach_info_key3,
			attach_info_key4,
			attach_info_key5,
			attach_info_id,
			attach_info_typ
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.wg_cd,
			NEW.attach_info_key1,
			NEW.attach_info_key2,
			NEW.attach_info_key3,
			NEW.attach_info_key4,
			NEW.attach_info_key5,
			NEW.attach_info_id,
			NEW.attach_info_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_attach_info_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			wg_cd = NEW.wg_cd,
			attach_info_key1 = NEW.attach_info_key1,
			attach_info_key2 = NEW.attach_info_key2,
			attach_info_key3 = NEW.attach_info_key3,
			attach_info_key4 = NEW.attach_info_key4,
			attach_info_key5 = NEW.attach_info_key5,
			attach_info_id = NEW.attach_info_id,
			attach_info_typ = NEW.attach_info_typ
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (attach_info_key1 = OLD.attach_info_key1 OR attach_info_key1 IS NULL AND OLD.attach_info_key1 IS NULL)
		AND (attach_info_key2 = OLD.attach_info_key2 OR attach_info_key2 IS NULL AND OLD.attach_info_key2 IS NULL)
		AND (attach_info_key3 = OLD.attach_info_key3 OR attach_info_key3 IS NULL AND OLD.attach_info_key3 IS NULL)
		AND (attach_info_key4 = OLD.attach_info_key4 OR attach_info_key4 IS NULL AND OLD.attach_info_key4 IS NULL)
		AND (attach_info_key5 = OLD.attach_info_key5 OR attach_info_key5 IS NULL AND OLD.attach_info_key5 IS NULL)
		AND (attach_info_id = OLD.attach_info_id OR attach_info_id IS NULL AND OLD.attach_info_id IS NULL)
		AND (attach_info_typ = OLD.attach_info_typ OR attach_info_typ IS NULL AND OLD.attach_info_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_attach_info_key$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (attach_info_key1 = OLD.attach_info_key1 OR attach_info_key1 IS NULL AND OLD.attach_info_key1 IS NULL)
		AND (attach_info_key2 = OLD.attach_info_key2 OR attach_info_key2 IS NULL AND OLD.attach_info_key2 IS NULL)
		AND (attach_info_key3 = OLD.attach_info_key3 OR attach_info_key3 IS NULL AND OLD.attach_info_key3 IS NULL)
		AND (attach_info_key4 = OLD.attach_info_key4 OR attach_info_key4 IS NULL AND OLD.attach_info_key4 IS NULL)
		AND (attach_info_key5 = OLD.attach_info_key5 OR attach_info_key5 IS NULL AND OLD.attach_info_key5 IS NULL)
		AND (attach_info_id = OLD.attach_info_id OR attach_info_id IS NULL AND OLD.attach_info_id IS NULL)
		AND (attach_info_typ = OLD.attach_info_typ OR attach_info_typ IS NULL AND OLD.attach_info_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_attach_info_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_attach_info_key
FOR EACH ROW
EXECUTE PROCEDURE maw_attach_info_key$func();
;

