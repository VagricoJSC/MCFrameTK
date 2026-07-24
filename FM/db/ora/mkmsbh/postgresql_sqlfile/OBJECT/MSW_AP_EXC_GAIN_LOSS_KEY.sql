\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ap_exc_gain_loss_key()
RETURNS TABLE (
	pay_act_d_no varchar,
	pay_act_d_seq numeric,
	ap_xrate_rev_his_no varchar,
	ref_ap_xrate_rev_his_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ap_exc_gain_loss_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ap_exc_gain_loss_key$temp(
				pay_act_d_no varchar (15) NULL,
				pay_act_d_seq numeric (4,0) NULL,
				ap_xrate_rev_his_no varchar (15) NULL,
				ref_ap_xrate_rev_his_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ap_exc_gain_loss_key_pk_ie ON msw_ap_exc_gain_loss_key$temp
				USING BTREE (pay_act_d_no,pay_act_d_seq,ap_xrate_rev_his_no,ref_ap_xrate_rev_his_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ap_exc_gain_loss_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ap_exc_gain_loss_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ap_exc_gain_loss_key
AS
SELECT *
FROM msw_ap_exc_gain_loss_key();

CREATE OR REPLACE FUNCTION msw_ap_exc_gain_loss_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ap_exc_gain_loss_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ap_exc_gain_loss_key$temp(
				pay_act_d_no varchar (15) NULL,
				pay_act_d_seq numeric (4,0) NULL,
				ap_xrate_rev_his_no varchar (15) NULL,
				ref_ap_xrate_rev_his_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ap_exc_gain_loss_key_pk_ie ON msw_ap_exc_gain_loss_key$temp
				USING BTREE (pay_act_d_no,pay_act_d_seq,ap_xrate_rev_his_no,ref_ap_xrate_rev_his_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ap_exc_gain_loss_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ap_exc_gain_loss_key$temp(
			pay_act_d_no,
			pay_act_d_seq,
			ap_xrate_rev_his_no,
			ref_ap_xrate_rev_his_no
		)VALUES (
			NEW.pay_act_d_no,
			NEW.pay_act_d_seq,
			NEW.ap_xrate_rev_his_no,
			NEW.ref_ap_xrate_rev_his_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ap_exc_gain_loss_key$temp
		SET 
			pay_act_d_no = NEW.pay_act_d_no,
			pay_act_d_seq = NEW.pay_act_d_seq,
			ap_xrate_rev_his_no = NEW.ap_xrate_rev_his_no,
			ref_ap_xrate_rev_his_no = NEW.ref_ap_xrate_rev_his_no
		WHERE 0=0
		AND (pay_act_d_no = OLD.pay_act_d_no OR pay_act_d_no IS NULL AND OLD.pay_act_d_no IS NULL)
		AND (pay_act_d_seq = OLD.pay_act_d_seq OR pay_act_d_seq IS NULL AND OLD.pay_act_d_seq IS NULL)
		AND (ap_xrate_rev_his_no = OLD.ap_xrate_rev_his_no OR ap_xrate_rev_his_no IS NULL AND OLD.ap_xrate_rev_his_no IS NULL)
		AND (ref_ap_xrate_rev_his_no = OLD.ref_ap_xrate_rev_his_no OR ref_ap_xrate_rev_his_no IS NULL AND OLD.ref_ap_xrate_rev_his_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ap_exc_gain_loss_key$temp
		WHERE 0=0
		AND (pay_act_d_no = OLD.pay_act_d_no OR pay_act_d_no IS NULL AND OLD.pay_act_d_no IS NULL)
		AND (pay_act_d_seq = OLD.pay_act_d_seq OR pay_act_d_seq IS NULL AND OLD.pay_act_d_seq IS NULL)
		AND (ap_xrate_rev_his_no = OLD.ap_xrate_rev_his_no OR ap_xrate_rev_his_no IS NULL AND OLD.ap_xrate_rev_his_no IS NULL)
		AND (ref_ap_xrate_rev_his_no = OLD.ref_ap_xrate_rev_his_no OR ref_ap_xrate_rev_his_no IS NULL AND OLD.ref_ap_xrate_rev_his_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ap_exc_gain_loss_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ap_exc_gain_loss_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ap_exc_gain_loss_key$func();
;

