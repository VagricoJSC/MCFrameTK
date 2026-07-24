\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_wg_rqst_ctl_key()
RETURNS TABLE (
	to_wg_cd varchar,
	fr_wg_cd varchar,
	wg_rqst_typ varchar,
	fr_dpt_cd varchar,
	cst_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_wg_rqst_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_wg_rqst_ctl_key$temp(
				to_wg_cd varchar (10) NULL,
				fr_wg_cd varchar (10) NULL,
				wg_rqst_typ varchar (1) NULL,
				fr_dpt_cd varchar (20) DEFAULT '*' NULL,
				cst_cd varchar (20) DEFAULT '*' NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_wg_rqst_ctl_key_pk_ie ON maw_wg_rqst_ctl_key$temp
				USING BTREE (to_wg_cd,fr_wg_cd,wg_rqst_typ,fr_dpt_cd,cst_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_wg_rqst_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_wg_rqst_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_wg_rqst_ctl_key
AS
SELECT *
FROM maw_wg_rqst_ctl_key();
ALTER VIEW maw_wg_rqst_ctl_key ALTER COLUMN fr_dpt_cd SET DEFAULT '*';
ALTER VIEW maw_wg_rqst_ctl_key ALTER COLUMN cst_cd SET DEFAULT '*';
ALTER VIEW maw_wg_rqst_ctl_key ALTER COLUMN itm_cd SET DEFAULT '*';
ALTER VIEW maw_wg_rqst_ctl_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_wg_rqst_ctl_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_wg_rqst_ctl_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_wg_rqst_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_wg_rqst_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_wg_rqst_ctl_key$temp(
				to_wg_cd varchar (10) NULL,
				fr_wg_cd varchar (10) NULL,
				wg_rqst_typ varchar (1) NULL,
				fr_dpt_cd varchar (20) DEFAULT '*' NULL,
				cst_cd varchar (20) DEFAULT '*' NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_wg_rqst_ctl_key_pk_ie ON maw_wg_rqst_ctl_key$temp
				USING BTREE (to_wg_cd,fr_wg_cd,wg_rqst_typ,fr_dpt_cd,cst_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_wg_rqst_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_wg_rqst_ctl_key$temp(
			to_wg_cd,
			fr_wg_cd,
			wg_rqst_typ,
			fr_dpt_cd,
			cst_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.to_wg_cd,
			NEW.fr_wg_cd,
			NEW.wg_rqst_typ,
			NEW.fr_dpt_cd,
			NEW.cst_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_wg_rqst_ctl_key$temp
		SET 
			to_wg_cd = NEW.to_wg_cd,
			fr_wg_cd = NEW.fr_wg_cd,
			wg_rqst_typ = NEW.wg_rqst_typ,
			fr_dpt_cd = NEW.fr_dpt_cd,
			cst_cd = NEW.cst_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND (to_wg_cd = OLD.to_wg_cd OR to_wg_cd IS NULL AND OLD.to_wg_cd IS NULL)
		AND (fr_wg_cd = OLD.fr_wg_cd OR fr_wg_cd IS NULL AND OLD.fr_wg_cd IS NULL)
		AND (wg_rqst_typ = OLD.wg_rqst_typ OR wg_rqst_typ IS NULL AND OLD.wg_rqst_typ IS NULL)
		AND (fr_dpt_cd = OLD.fr_dpt_cd OR fr_dpt_cd IS NULL AND OLD.fr_dpt_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_wg_rqst_ctl_key$temp
		WHERE 0=0
		AND (to_wg_cd = OLD.to_wg_cd OR to_wg_cd IS NULL AND OLD.to_wg_cd IS NULL)
		AND (fr_wg_cd = OLD.fr_wg_cd OR fr_wg_cd IS NULL AND OLD.fr_wg_cd IS NULL)
		AND (wg_rqst_typ = OLD.wg_rqst_typ OR wg_rqst_typ IS NULL AND OLD.wg_rqst_typ IS NULL)
		AND (fr_dpt_cd = OLD.fr_dpt_cd OR fr_dpt_cd IS NULL AND OLD.fr_dpt_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_wg_rqst_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_wg_rqst_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_wg_rqst_ctl_key$func();
;

