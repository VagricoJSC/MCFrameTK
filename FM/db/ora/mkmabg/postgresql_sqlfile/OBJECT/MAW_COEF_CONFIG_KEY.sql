\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_coef_config_key()
RETURNS TABLE (
	alc_coef_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	lot_no varchar,
	sublot_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	loc_cd varchar,
	oper_cd varchar,
	bp_cd varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_coef_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_coef_config_key$temp(
				alc_coef_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_coef_config_key_pk_ie ON maw_coef_config_key$temp
				USING BTREE (alc_coef_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,loc_cd,oper_cd,bp_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_coef_config_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_coef_config_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_coef_config_key
AS
SELECT *
FROM maw_coef_config_key();
ALTER VIEW maw_coef_config_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_coef_config_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_coef_config_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_coef_config_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_coef_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_coef_config_key$temp(
				alc_coef_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_coef_config_key_pk_ie ON maw_coef_config_key$temp
				USING BTREE (alc_coef_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,loc_cd,oper_cd,bp_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_coef_config_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_coef_config_key$temp(
			alc_coef_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			loc_cd,
			oper_cd,
			bp_cd,
			term
		)VALUES (
			NEW.alc_coef_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.loc_cd,
			NEW.oper_cd,
			NEW.bp_cd,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_coef_config_key$temp
		SET 
			alc_coef_cd = NEW.alc_coef_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			loc_cd = NEW.loc_cd,
			oper_cd = NEW.oper_cd,
			bp_cd = NEW.bp_cd,
			term = NEW.term
		WHERE 0=0
		AND (alc_coef_cd = OLD.alc_coef_cd OR alc_coef_cd IS NULL AND OLD.alc_coef_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_coef_config_key$temp
		WHERE 0=0
		AND (alc_coef_cd = OLD.alc_coef_cd OR alc_coef_cd IS NULL AND OLD.alc_coef_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_coef_config_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_coef_config_key
FOR EACH ROW
EXECUTE PROCEDURE maw_coef_config_key$func();
;

