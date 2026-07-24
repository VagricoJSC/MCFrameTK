\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ar_exc_gain_loss_key()
RETURNS TABLE (
	rcv_act_d_no varchar,
	rcv_act_d_seq numeric,
	ar_xrate_rev_his_no varchar,
	ref_ar_xrate_rev_his_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ar_exc_gain_loss_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ar_exc_gain_loss_key$temp(
				rcv_act_d_no varchar (15) NULL,
				rcv_act_d_seq numeric (4,0) NULL,
				ar_xrate_rev_his_no varchar (15) NULL,
				ref_ar_xrate_rev_his_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ar_exc_gain_loss_key_pk_ie ON msw_ar_exc_gain_loss_key$temp
				USING BTREE (rcv_act_d_no,rcv_act_d_seq,ar_xrate_rev_his_no,ref_ar_xrate_rev_his_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ar_exc_gain_loss_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ar_exc_gain_loss_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ar_exc_gain_loss_key
AS
SELECT *
FROM msw_ar_exc_gain_loss_key();

CREATE OR REPLACE FUNCTION msw_ar_exc_gain_loss_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ar_exc_gain_loss_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ar_exc_gain_loss_key$temp(
				rcv_act_d_no varchar (15) NULL,
				rcv_act_d_seq numeric (4,0) NULL,
				ar_xrate_rev_his_no varchar (15) NULL,
				ref_ar_xrate_rev_his_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ar_exc_gain_loss_key_pk_ie ON msw_ar_exc_gain_loss_key$temp
				USING BTREE (rcv_act_d_no,rcv_act_d_seq,ar_xrate_rev_his_no,ref_ar_xrate_rev_his_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ar_exc_gain_loss_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ar_exc_gain_loss_key$temp(
			rcv_act_d_no,
			rcv_act_d_seq,
			ar_xrate_rev_his_no,
			ref_ar_xrate_rev_his_no
		)VALUES (
			NEW.rcv_act_d_no,
			NEW.rcv_act_d_seq,
			NEW.ar_xrate_rev_his_no,
			NEW.ref_ar_xrate_rev_his_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ar_exc_gain_loss_key$temp
		SET 
			rcv_act_d_no = NEW.rcv_act_d_no,
			rcv_act_d_seq = NEW.rcv_act_d_seq,
			ar_xrate_rev_his_no = NEW.ar_xrate_rev_his_no,
			ref_ar_xrate_rev_his_no = NEW.ref_ar_xrate_rev_his_no
		WHERE 0=0
		AND (rcv_act_d_no = OLD.rcv_act_d_no OR rcv_act_d_no IS NULL AND OLD.rcv_act_d_no IS NULL)
		AND (rcv_act_d_seq = OLD.rcv_act_d_seq OR rcv_act_d_seq IS NULL AND OLD.rcv_act_d_seq IS NULL)
		AND (ar_xrate_rev_his_no = OLD.ar_xrate_rev_his_no OR ar_xrate_rev_his_no IS NULL AND OLD.ar_xrate_rev_his_no IS NULL)
		AND (ref_ar_xrate_rev_his_no = OLD.ref_ar_xrate_rev_his_no OR ref_ar_xrate_rev_his_no IS NULL AND OLD.ref_ar_xrate_rev_his_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ar_exc_gain_loss_key$temp
		WHERE 0=0
		AND (rcv_act_d_no = OLD.rcv_act_d_no OR rcv_act_d_no IS NULL AND OLD.rcv_act_d_no IS NULL)
		AND (rcv_act_d_seq = OLD.rcv_act_d_seq OR rcv_act_d_seq IS NULL AND OLD.rcv_act_d_seq IS NULL)
		AND (ar_xrate_rev_his_no = OLD.ar_xrate_rev_his_no OR ar_xrate_rev_his_no IS NULL AND OLD.ar_xrate_rev_his_no IS NULL)
		AND (ref_ar_xrate_rev_his_no = OLD.ref_ar_xrate_rev_his_no OR ref_ar_xrate_rev_his_no IS NULL AND OLD.ref_ar_xrate_rev_his_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ar_exc_gain_loss_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ar_exc_gain_loss_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ar_exc_gain_loss_key$func();
;

