\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_pre_alc_rate_sel_key()
RETURNS TABLE (
	alc_ac_cd varchar,
	dpt_cd varchar,
	calc_ctg_cd varchar,
	wg_cd varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_pre_alc_rate_sel_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_pre_alc_rate_sel_key$temp(
				alc_ac_cd varchar (20) NULL,
				dpt_cd varchar (20) NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_pre_alc_rate_sel_key_pk_ie ON maw_pre_alc_rate_sel_key$temp
				USING BTREE (alc_ac_cd,dpt_cd,calc_ctg_cd,wg_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_pre_alc_rate_sel_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_pre_alc_rate_sel_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_pre_alc_rate_sel_key
AS
SELECT *
FROM maw_pre_alc_rate_sel_key();

CREATE OR REPLACE FUNCTION maw_pre_alc_rate_sel_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_pre_alc_rate_sel_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_pre_alc_rate_sel_key$temp(
				alc_ac_cd varchar (20) NULL,
				dpt_cd varchar (20) NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_pre_alc_rate_sel_key_pk_ie ON maw_pre_alc_rate_sel_key$temp
				USING BTREE (alc_ac_cd,dpt_cd,calc_ctg_cd,wg_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_pre_alc_rate_sel_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_pre_alc_rate_sel_key$temp(
			alc_ac_cd,
			dpt_cd,
			calc_ctg_cd,
			wg_cd,
			term
		)VALUES (
			NEW.alc_ac_cd,
			NEW.dpt_cd,
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_pre_alc_rate_sel_key$temp
		SET 
			alc_ac_cd = NEW.alc_ac_cd,
			dpt_cd = NEW.dpt_cd,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			term = NEW.term
		WHERE 0=0
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_pre_alc_rate_sel_key$temp
		WHERE 0=0
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_pre_alc_rate_sel_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_pre_alc_rate_sel_key
FOR EACH ROW
EXECUTE PROCEDURE maw_pre_alc_rate_sel_key$func();
;

