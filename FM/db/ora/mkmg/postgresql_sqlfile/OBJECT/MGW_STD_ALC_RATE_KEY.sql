\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_std_alc_rate_key()
RETURNS TABLE (
	alc_ac_cd varchar,
	dpt_cd varchar,
	loc_cd varchar,
	oper_cd varchar,
	bp_cd varchar,
	ctg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	term timestamp(0),
	calc_ctg_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_std_alc_rate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_std_alc_rate_key$temp(
				alc_ac_cd varchar (20) NULL,
				dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				ctg_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_std_alc_rate_key_pk_ie ON mgw_std_alc_rate_key$temp
				USING BTREE (alc_ac_cd,dpt_cd,loc_cd,oper_cd,bp_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,term,calc_ctg_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_std_alc_rate_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_std_alc_rate_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_std_alc_rate_key
AS
SELECT *
FROM mgw_std_alc_rate_key();

CREATE OR REPLACE FUNCTION mgw_std_alc_rate_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_std_alc_rate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_std_alc_rate_key$temp(
				alc_ac_cd varchar (20) NULL,
				dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				ctg_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_std_alc_rate_key_pk_ie ON mgw_std_alc_rate_key$temp
				USING BTREE (alc_ac_cd,dpt_cd,loc_cd,oper_cd,bp_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,term,calc_ctg_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_std_alc_rate_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_std_alc_rate_key$temp(
			alc_ac_cd,
			dpt_cd,
			loc_cd,
			oper_cd,
			bp_cd,
			ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			term,
			calc_ctg_cd,
			wg_cd
		)VALUES (
			NEW.alc_ac_cd,
			NEW.dpt_cd,
			NEW.loc_cd,
			NEW.oper_cd,
			NEW.bp_cd,
			NEW.ctg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.term,
			NEW.calc_ctg_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_std_alc_rate_key$temp
		SET 
			alc_ac_cd = NEW.alc_ac_cd,
			dpt_cd = NEW.dpt_cd,
			loc_cd = NEW.loc_cd,
			oper_cd = NEW.oper_cd,
			bp_cd = NEW.bp_cd,
			ctg_cd = NEW.ctg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			term = NEW.term,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_std_alc_rate_key$temp
		WHERE 0=0
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_std_alc_rate_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_std_alc_rate_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_std_alc_rate_key$func();
;

