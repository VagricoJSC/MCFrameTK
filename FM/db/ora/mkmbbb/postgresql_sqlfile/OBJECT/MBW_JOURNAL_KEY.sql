\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_journal_key()
RETURNS TABLE (
	jnl_grp_no varchar,
	ac_ym timestamp(0),
	ac_if_typ varchar,
	slip_cnt_id varchar,
	jnl_no varchar,
	jnl_no_seq numeric,
	dc_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_journal_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_journal_key$temp(
				jnl_grp_no varchar (10) NULL,
				ac_ym timestamp(0)  NULL,
				ac_if_typ varchar (1) NULL,
				slip_cnt_id varchar (3) NULL,
				jnl_no varchar (20) NULL,
				jnl_no_seq numeric (9,0) NULL,
				dc_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_journal_key_pk_ie ON mbw_journal_key$temp
				USING BTREE (jnl_grp_no,ac_ym,ac_if_typ,slip_cnt_id,jnl_no,jnl_no_seq,dc_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_journal_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_journal_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_journal_key
AS
SELECT *
FROM mbw_journal_key();

CREATE OR REPLACE FUNCTION mbw_journal_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_journal_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_journal_key$temp(
				jnl_grp_no varchar (10) NULL,
				ac_ym timestamp(0)  NULL,
				ac_if_typ varchar (1) NULL,
				slip_cnt_id varchar (3) NULL,
				jnl_no varchar (20) NULL,
				jnl_no_seq numeric (9,0) NULL,
				dc_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_journal_key_pk_ie ON mbw_journal_key$temp
				USING BTREE (jnl_grp_no,ac_ym,ac_if_typ,slip_cnt_id,jnl_no,jnl_no_seq,dc_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_journal_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_journal_key$temp(
			jnl_grp_no,
			ac_ym,
			ac_if_typ,
			slip_cnt_id,
			jnl_no,
			jnl_no_seq,
			dc_typ
		)VALUES (
			NEW.jnl_grp_no,
			NEW.ac_ym,
			NEW.ac_if_typ,
			NEW.slip_cnt_id,
			NEW.jnl_no,
			NEW.jnl_no_seq,
			NEW.dc_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_journal_key$temp
		SET 
			jnl_grp_no = NEW.jnl_grp_no,
			ac_ym = NEW.ac_ym,
			ac_if_typ = NEW.ac_if_typ,
			slip_cnt_id = NEW.slip_cnt_id,
			jnl_no = NEW.jnl_no,
			jnl_no_seq = NEW.jnl_no_seq,
			dc_typ = NEW.dc_typ
		WHERE 0=0
		AND (jnl_grp_no = OLD.jnl_grp_no OR jnl_grp_no IS NULL AND OLD.jnl_grp_no IS NULL)
		AND (ac_ym = OLD.ac_ym OR ac_ym IS NULL AND OLD.ac_ym IS NULL)
		AND (ac_if_typ = OLD.ac_if_typ OR ac_if_typ IS NULL AND OLD.ac_if_typ IS NULL)
		AND (slip_cnt_id = OLD.slip_cnt_id OR slip_cnt_id IS NULL AND OLD.slip_cnt_id IS NULL)
		AND (jnl_no = OLD.jnl_no OR jnl_no IS NULL AND OLD.jnl_no IS NULL)
		AND (jnl_no_seq = OLD.jnl_no_seq OR jnl_no_seq IS NULL AND OLD.jnl_no_seq IS NULL)
		AND (dc_typ = OLD.dc_typ OR dc_typ IS NULL AND OLD.dc_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_journal_key$temp
		WHERE 0=0
		AND (jnl_grp_no = OLD.jnl_grp_no OR jnl_grp_no IS NULL AND OLD.jnl_grp_no IS NULL)
		AND (ac_ym = OLD.ac_ym OR ac_ym IS NULL AND OLD.ac_ym IS NULL)
		AND (ac_if_typ = OLD.ac_if_typ OR ac_if_typ IS NULL AND OLD.ac_if_typ IS NULL)
		AND (slip_cnt_id = OLD.slip_cnt_id OR slip_cnt_id IS NULL AND OLD.slip_cnt_id IS NULL)
		AND (jnl_no = OLD.jnl_no OR jnl_no IS NULL AND OLD.jnl_no IS NULL)
		AND (jnl_no_seq = OLD.jnl_no_seq OR jnl_no_seq IS NULL AND OLD.jnl_no_seq IS NULL)
		AND (dc_typ = OLD.dc_typ OR dc_typ IS NULL AND OLD.dc_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_journal_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_journal_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_journal_key$func();
;

