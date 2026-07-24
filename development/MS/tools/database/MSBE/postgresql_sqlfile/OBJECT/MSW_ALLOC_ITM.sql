\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_alloc_itm()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	gd_cd varchar,
	in_xfr_typ varchar,
	quality_typ varchar,
	stk_insp_typ varchar,
	stk_id_typ varchar,
	stk_bp_cd varchar,
	stk_alloc_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_alloc_itm$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_alloc_itm$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				gd_cd varchar (2) NULL,
				in_xfr_typ varchar (1) NOT NULL,
				quality_typ varchar (1) NULL,
				stk_insp_typ varchar (1) NOT NULL,
				stk_id_typ varchar (1) NULL,
				stk_bp_cd varchar (20) NULL,
				stk_alloc_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_alloc_itm$temp
				ADD CONSTRAINT msw_alloc_itm_ck01 CHECK (stk_alloc_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_alloc_itm$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_alloc_itm$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_alloc_itm
AS
SELECT *
FROM msw_alloc_itm();
ALTER VIEW msw_alloc_itm ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_alloc_itm ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_alloc_itm ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_alloc_itm ALTER COLUMN stk_alloc_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_alloc_itm$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_alloc_itm$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_alloc_itm$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				gd_cd varchar (2) NULL,
				in_xfr_typ varchar (1) NOT NULL,
				quality_typ varchar (1) NULL,
				stk_insp_typ varchar (1) NOT NULL,
				stk_id_typ varchar (1) NULL,
				stk_bp_cd varchar (20) NULL,
				stk_alloc_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_alloc_itm$temp
			ADD CONSTRAINT msw_alloc_itm_ck01 CHECK (stk_alloc_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_alloc_itm$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_alloc_itm$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sno1,
			sno2,
			sno3,
			sno4,
			gd_cd,
			in_xfr_typ,
			quality_typ,
			stk_insp_typ,
			stk_id_typ,
			stk_bp_cd,
			stk_alloc_flg
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.gd_cd,
			NEW.in_xfr_typ,
			NEW.quality_typ,
			NEW.stk_insp_typ,
			NEW.stk_id_typ,
			NEW.stk_bp_cd,
			NEW.stk_alloc_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_alloc_itm$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			gd_cd = NEW.gd_cd,
			in_xfr_typ = NEW.in_xfr_typ,
			quality_typ = NEW.quality_typ,
			stk_insp_typ = NEW.stk_insp_typ,
			stk_id_typ = NEW.stk_id_typ,
			stk_bp_cd = NEW.stk_bp_cd,
			stk_alloc_flg = NEW.stk_alloc_flg
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL)
		AND in_xfr_typ = OLD.in_xfr_typ
		AND (quality_typ = OLD.quality_typ OR quality_typ IS NULL AND OLD.quality_typ IS NULL)
		AND stk_insp_typ = OLD.stk_insp_typ
		AND (stk_id_typ = OLD.stk_id_typ OR stk_id_typ IS NULL AND OLD.stk_id_typ IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND stk_alloc_flg = OLD.stk_alloc_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_alloc_itm$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL)
		AND in_xfr_typ = OLD.in_xfr_typ
		AND (quality_typ = OLD.quality_typ OR quality_typ IS NULL AND OLD.quality_typ IS NULL)
		AND stk_insp_typ = OLD.stk_insp_typ
		AND (stk_id_typ = OLD.stk_id_typ OR stk_id_typ IS NULL AND OLD.stk_id_typ IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND stk_alloc_flg = OLD.stk_alloc_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_alloc_itm$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_alloc_itm
FOR EACH ROW
EXECUTE PROCEDURE msw_alloc_itm$func();
;

