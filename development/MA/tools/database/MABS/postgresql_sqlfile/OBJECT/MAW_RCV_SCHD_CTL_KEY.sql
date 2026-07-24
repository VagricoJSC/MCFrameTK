\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_rcv_schd_ctl_key()
RETURNS TABLE (
	bcst_cd varchar,
	cur_cd varchar,
	min_amt numeric,
	sttl_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rcv_schd_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rcv_schd_ctl_key$temp(
				bcst_cd varchar (20) DEFAULT '*' NULL,
				cur_cd varchar (3) NULL,
				min_amt numeric (21,8) NULL,
				sttl_cd varchar (10) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rcv_schd_ctl_key_pk_ie ON maw_rcv_schd_ctl_key$temp
				USING BTREE (bcst_cd,cur_cd,min_amt,sttl_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rcv_schd_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_rcv_schd_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_rcv_schd_ctl_key
AS
SELECT *
FROM maw_rcv_schd_ctl_key();
ALTER VIEW maw_rcv_schd_ctl_key ALTER COLUMN bcst_cd SET DEFAULT '*';
ALTER VIEW maw_rcv_schd_ctl_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_rcv_schd_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rcv_schd_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rcv_schd_ctl_key$temp(
				bcst_cd varchar (20) DEFAULT '*' NULL,
				cur_cd varchar (3) NULL,
				min_amt numeric (21,8) NULL,
				sttl_cd varchar (10) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rcv_schd_ctl_key_pk_ie ON maw_rcv_schd_ctl_key$temp
				USING BTREE (bcst_cd,cur_cd,min_amt,sttl_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rcv_schd_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_rcv_schd_ctl_key$temp(
			bcst_cd,
			cur_cd,
			min_amt,
			sttl_cd,
			wg_cd
		)VALUES (
			NEW.bcst_cd,
			NEW.cur_cd,
			NEW.min_amt,
			NEW.sttl_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_rcv_schd_ctl_key$temp
		SET 
			bcst_cd = NEW.bcst_cd,
			cur_cd = NEW.cur_cd,
			min_amt = NEW.min_amt,
			sttl_cd = NEW.sttl_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (bcst_cd = OLD.bcst_cd OR bcst_cd IS NULL AND OLD.bcst_cd IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (min_amt = OLD.min_amt OR min_amt IS NULL AND OLD.min_amt IS NULL)
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_rcv_schd_ctl_key$temp
		WHERE 0=0
		AND (bcst_cd = OLD.bcst_cd OR bcst_cd IS NULL AND OLD.bcst_cd IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (min_amt = OLD.min_amt OR min_amt IS NULL AND OLD.min_amt IS NULL)
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_rcv_schd_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_rcv_schd_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_rcv_schd_ctl_key$func();
;

