\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cst_sls_upri_apl_key()
RETURNS TABLE (
	cst_cd varchar,
	dlv_cd varchar,
	dest_cd1 varchar,
	dest_cd2 varchar,
	dest_cd3 varchar,
	sls_upri_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	unit_cd varchar,
	lot_qty numeric,
	cur_cd varchar,
	wg_cd varchar,
	st_dt timestamp(0),
	apl_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cst_sls_upri_apl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cst_sls_upri_apl_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				dest_cd1 varchar (20) DEFAULT '*' NULL,
				dest_cd2 varchar (20) DEFAULT '*' NULL,
				dest_cd3 varchar (20) DEFAULT '*' NULL,
				sls_upri_grp_cd varchar (5) DEFAULT '*' NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				unit_cd varchar (5) NULL,
				lot_qty numeric (21,8) NULL,
				cur_cd varchar (3) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL,
				apl_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cst_sls_upri_apl_key_pk_ie ON maw_cst_sls_upri_apl_key$temp
				USING BTREE (cst_cd,dlv_cd,dest_cd1,dest_cd2,dest_cd3,sls_upri_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,unit_cd,lot_qty,cur_cd,wg_cd,st_dt,apl_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cst_sls_upri_apl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cst_sls_upri_apl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cst_sls_upri_apl_key
AS
SELECT *
FROM maw_cst_sls_upri_apl_key();
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN dlv_cd SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN dest_cd1 SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN dest_cd2 SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN dest_cd3 SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN sls_upri_grp_cd SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN itm_cd SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_cst_sls_upri_apl_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_cst_sls_upri_apl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cst_sls_upri_apl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cst_sls_upri_apl_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				dest_cd1 varchar (20) DEFAULT '*' NULL,
				dest_cd2 varchar (20) DEFAULT '*' NULL,
				dest_cd3 varchar (20) DEFAULT '*' NULL,
				sls_upri_grp_cd varchar (5) DEFAULT '*' NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				unit_cd varchar (5) NULL,
				lot_qty numeric (21,8) NULL,
				cur_cd varchar (3) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL,
				apl_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cst_sls_upri_apl_key_pk_ie ON maw_cst_sls_upri_apl_key$temp
				USING BTREE (cst_cd,dlv_cd,dest_cd1,dest_cd2,dest_cd3,sls_upri_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,unit_cd,lot_qty,cur_cd,wg_cd,st_dt,apl_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cst_sls_upri_apl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cst_sls_upri_apl_key$temp(
			cst_cd,
			dlv_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			sls_upri_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			unit_cd,
			lot_qty,
			cur_cd,
			wg_cd,
			st_dt,
			apl_no
		)VALUES (
			NEW.cst_cd,
			NEW.dlv_cd,
			NEW.dest_cd1,
			NEW.dest_cd2,
			NEW.dest_cd3,
			NEW.sls_upri_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.unit_cd,
			NEW.lot_qty,
			NEW.cur_cd,
			NEW.wg_cd,
			NEW.st_dt,
			NEW.apl_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cst_sls_upri_apl_key$temp
		SET 
			cst_cd = NEW.cst_cd,
			dlv_cd = NEW.dlv_cd,
			dest_cd1 = NEW.dest_cd1,
			dest_cd2 = NEW.dest_cd2,
			dest_cd3 = NEW.dest_cd3,
			sls_upri_grp_cd = NEW.sls_upri_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			unit_cd = NEW.unit_cd,
			lot_qty = NEW.lot_qty,
			cur_cd = NEW.cur_cd,
			wg_cd = NEW.wg_cd,
			st_dt = NEW.st_dt,
			apl_no = NEW.apl_no
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (dest_cd1 = OLD.dest_cd1 OR dest_cd1 IS NULL AND OLD.dest_cd1 IS NULL)
		AND (dest_cd2 = OLD.dest_cd2 OR dest_cd2 IS NULL AND OLD.dest_cd2 IS NULL)
		AND (dest_cd3 = OLD.dest_cd3 OR dest_cd3 IS NULL AND OLD.dest_cd3 IS NULL)
		AND (sls_upri_grp_cd = OLD.sls_upri_grp_cd OR sls_upri_grp_cd IS NULL AND OLD.sls_upri_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (lot_qty = OLD.lot_qty OR lot_qty IS NULL AND OLD.lot_qty IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL)
		AND (apl_no = OLD.apl_no OR apl_no IS NULL AND OLD.apl_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cst_sls_upri_apl_key$temp
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (dest_cd1 = OLD.dest_cd1 OR dest_cd1 IS NULL AND OLD.dest_cd1 IS NULL)
		AND (dest_cd2 = OLD.dest_cd2 OR dest_cd2 IS NULL AND OLD.dest_cd2 IS NULL)
		AND (dest_cd3 = OLD.dest_cd3 OR dest_cd3 IS NULL AND OLD.dest_cd3 IS NULL)
		AND (sls_upri_grp_cd = OLD.sls_upri_grp_cd OR sls_upri_grp_cd IS NULL AND OLD.sls_upri_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (lot_qty = OLD.lot_qty OR lot_qty IS NULL AND OLD.lot_qty IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL)
		AND (apl_no = OLD.apl_no OR apl_no IS NULL AND OLD.apl_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cst_sls_upri_apl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cst_sls_upri_apl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cst_sls_upri_apl_key$func();
;

