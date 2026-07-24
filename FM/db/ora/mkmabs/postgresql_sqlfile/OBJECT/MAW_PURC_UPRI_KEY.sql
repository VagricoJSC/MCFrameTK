\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_purc_upri_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	sppl_cd varchar,
	maker_cd varchar,
	unit_cd varchar,
	lot_qty numeric,
	cur_cd varchar,
	loc_cd varchar,
	dlv_cd varchar,
	wg_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_purc_upri_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_purc_upri_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				sppl_cd varchar (20) NULL,
				maker_cd varchar (20) DEFAULT '*' NULL,
				unit_cd varchar (5) NULL,
				lot_qty numeric (21,8) NULL,
				cur_cd varchar (3) NULL,
				loc_cd varchar (20) DEFAULT '*' NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_purc_upri_key_pk_ie ON maw_purc_upri_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,sppl_cd,maker_cd,unit_cd,lot_qty,cur_cd,loc_cd,dlv_cd,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_purc_upri_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_purc_upri_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_purc_upri_key
AS
SELECT *
FROM maw_purc_upri_key();
ALTER VIEW maw_purc_upri_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_purc_upri_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_purc_upri_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_purc_upri_key ALTER COLUMN maker_cd SET DEFAULT '*';
ALTER VIEW maw_purc_upri_key ALTER COLUMN loc_cd SET DEFAULT '*';
ALTER VIEW maw_purc_upri_key ALTER COLUMN dlv_cd SET DEFAULT '*';
ALTER VIEW maw_purc_upri_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_purc_upri_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_purc_upri_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_purc_upri_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				sppl_cd varchar (20) NULL,
				maker_cd varchar (20) DEFAULT '*' NULL,
				unit_cd varchar (5) NULL,
				lot_qty numeric (21,8) NULL,
				cur_cd varchar (3) NULL,
				loc_cd varchar (20) DEFAULT '*' NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_purc_upri_key_pk_ie ON maw_purc_upri_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,sppl_cd,maker_cd,unit_cd,lot_qty,cur_cd,loc_cd,dlv_cd,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_purc_upri_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_purc_upri_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sppl_cd,
			maker_cd,
			unit_cd,
			lot_qty,
			cur_cd,
			loc_cd,
			dlv_cd,
			wg_cd,
			st_dt
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.sppl_cd,
			NEW.maker_cd,
			NEW.unit_cd,
			NEW.lot_qty,
			NEW.cur_cd,
			NEW.loc_cd,
			NEW.dlv_cd,
			NEW.wg_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_purc_upri_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			sppl_cd = NEW.sppl_cd,
			maker_cd = NEW.maker_cd,
			unit_cd = NEW.unit_cd,
			lot_qty = NEW.lot_qty,
			cur_cd = NEW.cur_cd,
			loc_cd = NEW.loc_cd,
			dlv_cd = NEW.dlv_cd,
			wg_cd = NEW.wg_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (lot_qty = OLD.lot_qty OR lot_qty IS NULL AND OLD.lot_qty IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_purc_upri_key$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (lot_qty = OLD.lot_qty OR lot_qty IS NULL AND OLD.lot_qty IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_purc_upri_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_purc_upri_key
FOR EACH ROW
EXECUTE PROCEDURE maw_purc_upri_key$func();
;

