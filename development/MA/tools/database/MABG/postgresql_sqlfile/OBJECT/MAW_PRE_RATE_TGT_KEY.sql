\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_pre_rate_tgt_key()
RETURNS TABLE (
	pre_alc_rate_cd varchar,
	data_calc_ctg_cd varchar,
	data_wg_cd varchar,
	sa_typ varchar,
	calc_ctg_cd varchar,
	wg_cd varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_pre_rate_tgt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_pre_rate_tgt_key$temp(
				pre_alc_rate_cd varchar (20) NULL,
				data_calc_ctg_cd varchar (10) NULL,
				data_wg_cd varchar (10) NULL,
				sa_typ varchar (1) NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_pre_rate_tgt_key_pk_ie ON maw_pre_rate_tgt_key$temp
				USING BTREE (pre_alc_rate_cd,data_calc_ctg_cd,data_wg_cd,sa_typ,calc_ctg_cd,wg_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_pre_rate_tgt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_pre_rate_tgt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_pre_rate_tgt_key
AS
SELECT *
FROM maw_pre_rate_tgt_key();

CREATE OR REPLACE FUNCTION maw_pre_rate_tgt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_pre_rate_tgt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_pre_rate_tgt_key$temp(
				pre_alc_rate_cd varchar (20) NULL,
				data_calc_ctg_cd varchar (10) NULL,
				data_wg_cd varchar (10) NULL,
				sa_typ varchar (1) NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_pre_rate_tgt_key_pk_ie ON maw_pre_rate_tgt_key$temp
				USING BTREE (pre_alc_rate_cd,data_calc_ctg_cd,data_wg_cd,sa_typ,calc_ctg_cd,wg_cd,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_pre_rate_tgt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_pre_rate_tgt_key$temp(
			pre_alc_rate_cd,
			data_calc_ctg_cd,
			data_wg_cd,
			sa_typ,
			calc_ctg_cd,
			wg_cd,
			term
		)VALUES (
			NEW.pre_alc_rate_cd,
			NEW.data_calc_ctg_cd,
			NEW.data_wg_cd,
			NEW.sa_typ,
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_pre_rate_tgt_key$temp
		SET 
			pre_alc_rate_cd = NEW.pre_alc_rate_cd,
			data_calc_ctg_cd = NEW.data_calc_ctg_cd,
			data_wg_cd = NEW.data_wg_cd,
			sa_typ = NEW.sa_typ,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			term = NEW.term
		WHERE 0=0
		AND (pre_alc_rate_cd = OLD.pre_alc_rate_cd OR pre_alc_rate_cd IS NULL AND OLD.pre_alc_rate_cd IS NULL)
		AND (data_calc_ctg_cd = OLD.data_calc_ctg_cd OR data_calc_ctg_cd IS NULL AND OLD.data_calc_ctg_cd IS NULL)
		AND (data_wg_cd = OLD.data_wg_cd OR data_wg_cd IS NULL AND OLD.data_wg_cd IS NULL)
		AND (sa_typ = OLD.sa_typ OR sa_typ IS NULL AND OLD.sa_typ IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_pre_rate_tgt_key$temp
		WHERE 0=0
		AND (pre_alc_rate_cd = OLD.pre_alc_rate_cd OR pre_alc_rate_cd IS NULL AND OLD.pre_alc_rate_cd IS NULL)
		AND (data_calc_ctg_cd = OLD.data_calc_ctg_cd OR data_calc_ctg_cd IS NULL AND OLD.data_calc_ctg_cd IS NULL)
		AND (data_wg_cd = OLD.data_wg_cd OR data_wg_cd IS NULL AND OLD.data_wg_cd IS NULL)
		AND (sa_typ = OLD.sa_typ OR sa_typ IS NULL AND OLD.sa_typ IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_pre_rate_tgt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_pre_rate_tgt_key
FOR EACH ROW
EXECUTE PROCEDURE maw_pre_rate_tgt_key$func();
;

