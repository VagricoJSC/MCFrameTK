\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_imp_itm_prov_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	prsppl_cd varchar,
	term timestamp(0),
	calc_ctg_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_imp_itm_prov_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_imp_itm_prov_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				prsppl_cd varchar (20) NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_imp_itm_prov_key_pk_ie ON mgw_imp_itm_prov_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,prsppl_cd,term,calc_ctg_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_imp_itm_prov_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_imp_itm_prov_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_imp_itm_prov_key
AS
SELECT *
FROM mgw_imp_itm_prov_key();
ALTER VIEW mgw_imp_itm_prov_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_imp_itm_prov_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_imp_itm_prov_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_imp_itm_prov_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_imp_itm_prov_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_imp_itm_prov_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_imp_itm_prov_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				prsppl_cd varchar (20) NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_imp_itm_prov_key_pk_ie ON mgw_imp_itm_prov_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,prsppl_cd,term,calc_ctg_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_imp_itm_prov_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_imp_itm_prov_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			prsppl_cd,
			term,
			calc_ctg_cd,
			wg_cd
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.prsppl_cd,
			NEW.term,
			NEW.calc_ctg_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_imp_itm_prov_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			prsppl_cd = NEW.prsppl_cd,
			term = NEW.term,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (prsppl_cd = OLD.prsppl_cd OR prsppl_cd IS NULL AND OLD.prsppl_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_imp_itm_prov_key$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (prsppl_cd = OLD.prsppl_cd OR prsppl_cd IS NULL AND OLD.prsppl_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_imp_itm_prov_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_imp_itm_prov_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_imp_itm_prov_key$func();
;

