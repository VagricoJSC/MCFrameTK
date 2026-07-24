\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alc_ptn_sel_key()
RETURNS TABLE (
	alc_ac_cd varchar,
	dpt_alc_grp varchar,
	loc_alc_grp varchar,
	oper_alc_grp varchar,
	bp_alc_grp varchar,
	ctg_alc_grp varchar,
	itm_alc_grp varchar,
	term timestamp(0),
	calc_ctg_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_ptn_sel_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_ptn_sel_key$temp(
				alc_ac_cd varchar (20) NULL,
				dpt_alc_grp varchar (10) NULL,
				loc_alc_grp varchar (10) NULL,
				oper_alc_grp varchar (10) NULL,
				bp_alc_grp varchar (10) NULL,
				ctg_alc_grp varchar (10) NULL,
				itm_alc_grp varchar (10) NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_ptn_sel_key_pk_ie ON maw_alc_ptn_sel_key$temp
				USING BTREE (alc_ac_cd,dpt_alc_grp,loc_alc_grp,oper_alc_grp,bp_alc_grp,ctg_alc_grp,itm_alc_grp,term,calc_ctg_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_ptn_sel_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alc_ptn_sel_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alc_ptn_sel_key
AS
SELECT *
FROM maw_alc_ptn_sel_key();

CREATE OR REPLACE FUNCTION maw_alc_ptn_sel_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_ptn_sel_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_ptn_sel_key$temp(
				alc_ac_cd varchar (20) NULL,
				dpt_alc_grp varchar (10) NULL,
				loc_alc_grp varchar (10) NULL,
				oper_alc_grp varchar (10) NULL,
				bp_alc_grp varchar (10) NULL,
				ctg_alc_grp varchar (10) NULL,
				itm_alc_grp varchar (10) NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_ptn_sel_key_pk_ie ON maw_alc_ptn_sel_key$temp
				USING BTREE (alc_ac_cd,dpt_alc_grp,loc_alc_grp,oper_alc_grp,bp_alc_grp,ctg_alc_grp,itm_alc_grp,term,calc_ctg_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_ptn_sel_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alc_ptn_sel_key$temp(
			alc_ac_cd,
			dpt_alc_grp,
			loc_alc_grp,
			oper_alc_grp,
			bp_alc_grp,
			ctg_alc_grp,
			itm_alc_grp,
			term,
			calc_ctg_cd,
			wg_cd
		)VALUES (
			NEW.alc_ac_cd,
			NEW.dpt_alc_grp,
			NEW.loc_alc_grp,
			NEW.oper_alc_grp,
			NEW.bp_alc_grp,
			NEW.ctg_alc_grp,
			NEW.itm_alc_grp,
			NEW.term,
			NEW.calc_ctg_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alc_ptn_sel_key$temp
		SET 
			alc_ac_cd = NEW.alc_ac_cd,
			dpt_alc_grp = NEW.dpt_alc_grp,
			loc_alc_grp = NEW.loc_alc_grp,
			oper_alc_grp = NEW.oper_alc_grp,
			bp_alc_grp = NEW.bp_alc_grp,
			ctg_alc_grp = NEW.ctg_alc_grp,
			itm_alc_grp = NEW.itm_alc_grp,
			term = NEW.term,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (dpt_alc_grp = OLD.dpt_alc_grp OR dpt_alc_grp IS NULL AND OLD.dpt_alc_grp IS NULL)
		AND (loc_alc_grp = OLD.loc_alc_grp OR loc_alc_grp IS NULL AND OLD.loc_alc_grp IS NULL)
		AND (oper_alc_grp = OLD.oper_alc_grp OR oper_alc_grp IS NULL AND OLD.oper_alc_grp IS NULL)
		AND (bp_alc_grp = OLD.bp_alc_grp OR bp_alc_grp IS NULL AND OLD.bp_alc_grp IS NULL)
		AND (ctg_alc_grp = OLD.ctg_alc_grp OR ctg_alc_grp IS NULL AND OLD.ctg_alc_grp IS NULL)
		AND (itm_alc_grp = OLD.itm_alc_grp OR itm_alc_grp IS NULL AND OLD.itm_alc_grp IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alc_ptn_sel_key$temp
		WHERE 0=0
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (dpt_alc_grp = OLD.dpt_alc_grp OR dpt_alc_grp IS NULL AND OLD.dpt_alc_grp IS NULL)
		AND (loc_alc_grp = OLD.loc_alc_grp OR loc_alc_grp IS NULL AND OLD.loc_alc_grp IS NULL)
		AND (oper_alc_grp = OLD.oper_alc_grp OR oper_alc_grp IS NULL AND OLD.oper_alc_grp IS NULL)
		AND (bp_alc_grp = OLD.bp_alc_grp OR bp_alc_grp IS NULL AND OLD.bp_alc_grp IS NULL)
		AND (ctg_alc_grp = OLD.ctg_alc_grp OR ctg_alc_grp IS NULL AND OLD.ctg_alc_grp IS NULL)
		AND (itm_alc_grp = OLD.itm_alc_grp OR itm_alc_grp IS NULL AND OLD.itm_alc_grp IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alc_ptn_sel_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alc_ptn_sel_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alc_ptn_sel_key$func();
;

