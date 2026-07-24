\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_std_inpt()
RETURNS TABLE (
	lvl numeric,
	wg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	mfg_purc_typ varchar,
	inpt_rec_no numeric,
	std_qty numeric,
	the_qty numeric,
	expns_cd varchar,
	std_cost numeric,
	the_cost numeric,
	sml_inpt_rec_no numeric,
	bottom_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_std_inpt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_std_inpt$temp(
				lvl numeric (3,0) NOT NULL,
				wg_cd varchar (10) NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				mfg_purc_typ varchar (1) NOT NULL,
				inpt_rec_no numeric (9,0) NOT NULL,
				std_qty numeric (21,8) NOT NULL,
				the_qty numeric (21,8) NOT NULL,
				expns_cd varchar (20) NULL,
				std_cost numeric (21,8) NULL,
				the_cost numeric (21,8) NULL,
				sml_inpt_rec_no numeric (9,0) NOT NULL,
				bottom_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_std_inpt_ie01 ON mgw_std_inpt$temp
				USING BTREE (sml_inpt_rec_no);
			CREATE INDEX mgw_std_inpt_ie02 ON mgw_std_inpt$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			CREATE INDEX mgw_std_inpt_ie03 ON mgw_std_inpt$temp
				USING BTREE (lvl);
			ALTER TABLE mgw_std_inpt$temp
				ADD CONSTRAINT mgw_std_inpt_ck01 CHECK (bottom_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_std_inpt$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_std_inpt$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_std_inpt
AS
SELECT *
FROM mgw_std_inpt();
ALTER VIEW mgw_std_inpt ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_std_inpt ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_std_inpt ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_std_inpt ALTER COLUMN bottom_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_std_inpt$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_std_inpt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_std_inpt$temp(
				lvl numeric (3,0) NOT NULL,
				wg_cd varchar (10) NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				mfg_purc_typ varchar (1) NOT NULL,
				inpt_rec_no numeric (9,0) NOT NULL,
				std_qty numeric (21,8) NOT NULL,
				the_qty numeric (21,8) NOT NULL,
				expns_cd varchar (20) NULL,
				std_cost numeric (21,8) NULL,
				the_cost numeric (21,8) NULL,
				sml_inpt_rec_no numeric (9,0) NOT NULL,
				bottom_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_std_inpt_ie01 ON mgw_std_inpt$temp
				USING BTREE (sml_inpt_rec_no);
			CREATE INDEX mgw_std_inpt_ie02 ON mgw_std_inpt$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			CREATE INDEX mgw_std_inpt_ie03 ON mgw_std_inpt$temp
				USING BTREE (lvl);
			ALTER TABLE mgw_std_inpt$temp
			ADD CONSTRAINT mgw_std_inpt_ck01 CHECK (bottom_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_std_inpt$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_std_inpt$temp(
			lvl,
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			mfg_purc_typ,
			inpt_rec_no,
			std_qty,
			the_qty,
			expns_cd,
			std_cost,
			the_cost,
			sml_inpt_rec_no,
			bottom_flg
		)VALUES (
			NEW.lvl,
			NEW.wg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.mfg_purc_typ,
			NEW.inpt_rec_no,
			NEW.std_qty,
			NEW.the_qty,
			NEW.expns_cd,
			NEW.std_cost,
			NEW.the_cost,
			NEW.sml_inpt_rec_no,
			NEW.bottom_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_std_inpt$temp
		SET 
			lvl = NEW.lvl,
			wg_cd = NEW.wg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			mfg_purc_typ = NEW.mfg_purc_typ,
			inpt_rec_no = NEW.inpt_rec_no,
			std_qty = NEW.std_qty,
			the_qty = NEW.the_qty,
			expns_cd = NEW.expns_cd,
			std_cost = NEW.std_cost,
			the_cost = NEW.the_cost,
			sml_inpt_rec_no = NEW.sml_inpt_rec_no,
			bottom_flg = NEW.bottom_flg
		WHERE 0=0
		AND lvl = OLD.lvl
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND mfg_purc_typ = OLD.mfg_purc_typ
		AND inpt_rec_no = OLD.inpt_rec_no
		AND std_qty = OLD.std_qty
		AND the_qty = OLD.the_qty
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND (std_cost = OLD.std_cost OR std_cost IS NULL AND OLD.std_cost IS NULL)
		AND (the_cost = OLD.the_cost OR the_cost IS NULL AND OLD.the_cost IS NULL)
		AND sml_inpt_rec_no = OLD.sml_inpt_rec_no
		AND bottom_flg = OLD.bottom_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_std_inpt$temp
		WHERE 0=0
		AND lvl = OLD.lvl
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND mfg_purc_typ = OLD.mfg_purc_typ
		AND inpt_rec_no = OLD.inpt_rec_no
		AND std_qty = OLD.std_qty
		AND the_qty = OLD.the_qty
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND (std_cost = OLD.std_cost OR std_cost IS NULL AND OLD.std_cost IS NULL)
		AND (the_cost = OLD.the_cost OR the_cost IS NULL AND OLD.the_cost IS NULL)
		AND sml_inpt_rec_no = OLD.sml_inpt_rec_no
		AND bottom_flg = OLD.bottom_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_std_inpt$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_std_inpt
FOR EACH ROW
EXECUTE PROCEDURE mgw_std_inpt$func();
;

