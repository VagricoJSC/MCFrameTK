\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_itm_sls_upri_key()
RETURNS TABLE (
	sls_upri_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	sls_upri_rank_cd varchar,
	unit_cd varchar,
	lot_qty numeric,
	cur_cd varchar,
	wg_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_sls_upri_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_sls_upri_key$temp(
				sls_upri_grp_cd varchar (5) DEFAULT '*' NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				sls_upri_rank_cd varchar (5) DEFAULT '*' NULL,
				unit_cd varchar (5) NULL,
				lot_qty numeric (21,8) NULL,
				cur_cd varchar (3) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_sls_upri_key_pk_ie ON maw_itm_sls_upri_key$temp
				USING BTREE (sls_upri_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,sls_upri_rank_cd,unit_cd,lot_qty,cur_cd,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_sls_upri_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_itm_sls_upri_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_itm_sls_upri_key
AS
SELECT *
FROM maw_itm_sls_upri_key();
ALTER VIEW maw_itm_sls_upri_key ALTER COLUMN sls_upri_grp_cd SET DEFAULT '*';
ALTER VIEW maw_itm_sls_upri_key ALTER COLUMN itm_cd SET DEFAULT '*';
ALTER VIEW maw_itm_sls_upri_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_itm_sls_upri_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_itm_sls_upri_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_itm_sls_upri_key ALTER COLUMN sls_upri_rank_cd SET DEFAULT '*';
ALTER VIEW maw_itm_sls_upri_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_itm_sls_upri_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_sls_upri_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_sls_upri_key$temp(
				sls_upri_grp_cd varchar (5) DEFAULT '*' NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				sls_upri_rank_cd varchar (5) DEFAULT '*' NULL,
				unit_cd varchar (5) NULL,
				lot_qty numeric (21,8) NULL,
				cur_cd varchar (3) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_sls_upri_key_pk_ie ON maw_itm_sls_upri_key$temp
				USING BTREE (sls_upri_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,sls_upri_rank_cd,unit_cd,lot_qty,cur_cd,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_sls_upri_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_itm_sls_upri_key$temp(
			sls_upri_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_upri_rank_cd,
			unit_cd,
			lot_qty,
			cur_cd,
			wg_cd,
			st_dt
		)VALUES (
			NEW.sls_upri_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.sls_upri_rank_cd,
			NEW.unit_cd,
			NEW.lot_qty,
			NEW.cur_cd,
			NEW.wg_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_itm_sls_upri_key$temp
		SET 
			sls_upri_grp_cd = NEW.sls_upri_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			sls_upri_rank_cd = NEW.sls_upri_rank_cd,
			unit_cd = NEW.unit_cd,
			lot_qty = NEW.lot_qty,
			cur_cd = NEW.cur_cd,
			wg_cd = NEW.wg_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (sls_upri_grp_cd = OLD.sls_upri_grp_cd OR sls_upri_grp_cd IS NULL AND OLD.sls_upri_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (sls_upri_rank_cd = OLD.sls_upri_rank_cd OR sls_upri_rank_cd IS NULL AND OLD.sls_upri_rank_cd IS NULL)
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (lot_qty = OLD.lot_qty OR lot_qty IS NULL AND OLD.lot_qty IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_itm_sls_upri_key$temp
		WHERE 0=0
		AND (sls_upri_grp_cd = OLD.sls_upri_grp_cd OR sls_upri_grp_cd IS NULL AND OLD.sls_upri_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (sls_upri_rank_cd = OLD.sls_upri_rank_cd OR sls_upri_rank_cd IS NULL AND OLD.sls_upri_rank_cd IS NULL)
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (lot_qty = OLD.lot_qty OR lot_qty IS NULL AND OLD.lot_qty IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_itm_sls_upri_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_itm_sls_upri_key
FOR EACH ROW
EXECUTE PROCEDURE maw_itm_sls_upri_key$func();
;

