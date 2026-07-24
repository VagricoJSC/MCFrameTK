\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_spln_fmt()
RETURNS TABLE (
	dpt_cd varchar,
	cst_cd varchar,
	wrk_no varchar,
	spln_itm_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	cur_cd varchar,
	st_ym timestamp(0),
	end_ym timestamp(0),
	fix_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_fmt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_fmt$temp(
				dpt_cd varchar (20) NOT NULL,
				cst_cd varchar (20) DEFAULT '*' NOT NULL,
				wrk_no varchar (15) DEFAULT '*' NOT NULL,
				spln_itm_cd varchar (40) DEFAULT '*' NOT NULL,
				itm_cd varchar (40) DEFAULT '*' NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				cur_cd varchar (3) NOT NULL,
				st_ym timestamp(0)  NULL,
				end_ym timestamp(0)  NULL,
				fix_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_spln_fmt$temp
				ADD CONSTRAINT msw_spln_fmt_ck01 CHECK (fix_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_fmt$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_spln_fmt$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_spln_fmt
AS
SELECT *
FROM msw_spln_fmt();
ALTER VIEW msw_spln_fmt ALTER COLUMN cst_cd SET DEFAULT '*';
ALTER VIEW msw_spln_fmt ALTER COLUMN wrk_no SET DEFAULT '*';
ALTER VIEW msw_spln_fmt ALTER COLUMN spln_itm_cd SET DEFAULT '*';
ALTER VIEW msw_spln_fmt ALTER COLUMN itm_cd SET DEFAULT '*';
ALTER VIEW msw_spln_fmt ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_spln_fmt ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_spln_fmt ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_spln_fmt ALTER COLUMN fix_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_spln_fmt$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_fmt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_fmt$temp(
				dpt_cd varchar (20) NOT NULL,
				cst_cd varchar (20) DEFAULT '*' NOT NULL,
				wrk_no varchar (15) DEFAULT '*' NOT NULL,
				spln_itm_cd varchar (40) DEFAULT '*' NOT NULL,
				itm_cd varchar (40) DEFAULT '*' NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				cur_cd varchar (3) NOT NULL,
				st_ym timestamp(0)  NULL,
				end_ym timestamp(0)  NULL,
				fix_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_spln_fmt$temp
			ADD CONSTRAINT msw_spln_fmt_ck01 CHECK (fix_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_fmt$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_spln_fmt$temp(
			dpt_cd,
			cst_cd,
			wrk_no,
			spln_itm_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			cur_cd,
			st_ym,
			end_ym,
			fix_flg
		)VALUES (
			NEW.dpt_cd,
			NEW.cst_cd,
			NEW.wrk_no,
			NEW.spln_itm_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.cur_cd,
			NEW.st_ym,
			NEW.end_ym,
			NEW.fix_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_spln_fmt$temp
		SET 
			dpt_cd = NEW.dpt_cd,
			cst_cd = NEW.cst_cd,
			wrk_no = NEW.wrk_no,
			spln_itm_cd = NEW.spln_itm_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			cur_cd = NEW.cur_cd,
			st_ym = NEW.st_ym,
			end_ym = NEW.end_ym,
			fix_flg = NEW.fix_flg
		WHERE 0=0
		AND dpt_cd = OLD.dpt_cd
		AND cst_cd = OLD.cst_cd
		AND wrk_no = OLD.wrk_no
		AND spln_itm_cd = OLD.spln_itm_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND cur_cd = OLD.cur_cd
		AND (st_ym = OLD.st_ym OR st_ym IS NULL AND OLD.st_ym IS NULL)
		AND (end_ym = OLD.end_ym OR end_ym IS NULL AND OLD.end_ym IS NULL)
		AND fix_flg = OLD.fix_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_spln_fmt$temp
		WHERE 0=0
		AND dpt_cd = OLD.dpt_cd
		AND cst_cd = OLD.cst_cd
		AND wrk_no = OLD.wrk_no
		AND spln_itm_cd = OLD.spln_itm_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND cur_cd = OLD.cur_cd
		AND (st_ym = OLD.st_ym OR st_ym IS NULL AND OLD.st_ym IS NULL)
		AND (end_ym = OLD.end_ym OR end_ym IS NULL AND OLD.end_ym IS NULL)
		AND fix_flg = OLD.fix_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_spln_fmt$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_spln_fmt
FOR EACH ROW
EXECUTE PROCEDURE msw_spln_fmt$func();
;

