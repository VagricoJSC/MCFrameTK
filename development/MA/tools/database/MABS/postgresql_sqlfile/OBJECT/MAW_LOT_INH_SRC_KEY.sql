\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_lot_inh_src_key()
RETURNS TABLE (
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	bom_ptn varchar,
	chd_itm_cd varchar,
	chd_itm_sub1 varchar,
	chd_itm_sub2 varchar,
	chd_itm_sub3 varchar,
	lot_inh_col_typ varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_lot_inh_src_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_lot_inh_src_key$temp(
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NULL,
				bom_ptn varchar (40) NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
				lot_inh_col_typ varchar (30) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_lot_inh_src_key_pk_ie ON maw_lot_inh_src_key$temp
				USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,lot_inh_col_typ,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_lot_inh_src_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_lot_inh_src_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_lot_inh_src_key
AS
SELECT *
FROM maw_lot_inh_src_key();
ALTER VIEW maw_lot_inh_src_key ALTER COLUMN par_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_lot_inh_src_key ALTER COLUMN par_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_lot_inh_src_key ALTER COLUMN par_itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_lot_inh_src_key ALTER COLUMN chd_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_lot_inh_src_key ALTER COLUMN chd_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_lot_inh_src_key ALTER COLUMN chd_itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_lot_inh_src_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_lot_inh_src_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_lot_inh_src_key$temp(
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NULL,
				bom_ptn varchar (40) NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
				lot_inh_col_typ varchar (30) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_lot_inh_src_key_pk_ie ON maw_lot_inh_src_key$temp
				USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,lot_inh_col_typ,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_lot_inh_src_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_lot_inh_src_key$temp(
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			bom_ptn,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			lot_inh_col_typ,
			wg_cd
		)VALUES (
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.bom_ptn,
			NEW.chd_itm_cd,
			NEW.chd_itm_sub1,
			NEW.chd_itm_sub2,
			NEW.chd_itm_sub3,
			NEW.lot_inh_col_typ,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_lot_inh_src_key$temp
		SET 
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			bom_ptn = NEW.bom_ptn,
			chd_itm_cd = NEW.chd_itm_cd,
			chd_itm_sub1 = NEW.chd_itm_sub1,
			chd_itm_sub2 = NEW.chd_itm_sub2,
			chd_itm_sub3 = NEW.chd_itm_sub3,
			lot_inh_col_typ = NEW.lot_inh_col_typ,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (lot_inh_col_typ = OLD.lot_inh_col_typ OR lot_inh_col_typ IS NULL AND OLD.lot_inh_col_typ IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_lot_inh_src_key$temp
		WHERE 0=0
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (lot_inh_col_typ = OLD.lot_inh_col_typ OR lot_inh_col_typ IS NULL AND OLD.lot_inh_col_typ IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_lot_inh_src_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_lot_inh_src_key
FOR EACH ROW
EXECUTE PROCEDURE maw_lot_inh_src_key$func();
;

