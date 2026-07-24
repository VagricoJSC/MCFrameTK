\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_itm_oper_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	loc_cd varchar,
	oper_ptn varchar,
	oper_cd varchar,
	oper_seq numeric,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_itm_oper_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_itm_oper_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				loc_cd varchar (20) DEFAULT '*' NULL,
				oper_ptn varchar (40) DEFAULT '*' NULL,
				oper_cd varchar (10) DEFAULT '*' NULL,
				oper_seq numeric (9,0) DEFAULT 1 NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_itm_oper_key_pk_ie ON mgw_calc_itm_oper_key$temp
				USING BTREE (calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,oper_ptn,oper_cd,oper_seq,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_itm_oper_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_itm_oper_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_itm_oper_key
AS
SELECT *
FROM mgw_calc_itm_oper_key();
ALTER VIEW mgw_calc_itm_oper_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_oper_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_oper_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_oper_key ALTER COLUMN loc_cd SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_oper_key ALTER COLUMN oper_ptn SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_oper_key ALTER COLUMN oper_cd SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_oper_key ALTER COLUMN oper_seq SET DEFAULT 1;
ALTER VIEW mgw_calc_itm_oper_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_calc_itm_oper_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_itm_oper_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_itm_oper_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				loc_cd varchar (20) DEFAULT '*' NULL,
				oper_ptn varchar (40) DEFAULT '*' NULL,
				oper_cd varchar (10) DEFAULT '*' NULL,
				oper_seq numeric (9,0) DEFAULT 1 NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_itm_oper_key_pk_ie ON mgw_calc_itm_oper_key$temp
				USING BTREE (calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,oper_ptn,oper_cd,oper_seq,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_itm_oper_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_itm_oper_key$temp(
			calc_no,
			calc_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			oper_ptn,
			oper_cd,
			oper_seq,
			wg_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.loc_cd,
			NEW.oper_ptn,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_itm_oper_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			loc_cd = NEW.loc_cd,
			oper_ptn = NEW.oper_ptn,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_itm_oper_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_itm_oper_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_itm_oper_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_itm_oper_key$func();
;

