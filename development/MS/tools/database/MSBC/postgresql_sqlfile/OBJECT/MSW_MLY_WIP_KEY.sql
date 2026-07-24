\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mly_wip_key()
RETURNS TABLE (
	ym timestamp(0),
	itm_mfg_inst_no varchar,
	mfg_act_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mly_wip_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mly_wip_key$temp(
				ym timestamp(0)  NULL,
				itm_mfg_inst_no varchar (15) NULL,
				mfg_act_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mly_wip_key_pk_ie ON msw_mly_wip_key$temp
				USING BTREE (ym,itm_mfg_inst_no,mfg_act_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mly_wip_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mly_wip_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mly_wip_key
AS
SELECT *
FROM msw_mly_wip_key();

CREATE OR REPLACE FUNCTION msw_mly_wip_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mly_wip_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mly_wip_key$temp(
				ym timestamp(0)  NULL,
				itm_mfg_inst_no varchar (15) NULL,
				mfg_act_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mly_wip_key_pk_ie ON msw_mly_wip_key$temp
				USING BTREE (ym,itm_mfg_inst_no,mfg_act_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mly_wip_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mly_wip_key$temp(
			ym,
			itm_mfg_inst_no,
			mfg_act_no
		)VALUES (
			NEW.ym,
			NEW.itm_mfg_inst_no,
			NEW.mfg_act_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mly_wip_key$temp
		SET 
			ym = NEW.ym,
			itm_mfg_inst_no = NEW.itm_mfg_inst_no,
			mfg_act_no = NEW.mfg_act_no
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (mfg_act_no = OLD.mfg_act_no OR mfg_act_no IS NULL AND OLD.mfg_act_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mly_wip_key$temp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (mfg_act_no = OLD.mfg_act_no OR mfg_act_no IS NULL AND OLD.mfg_act_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mly_wip_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mly_wip_key
FOR EACH ROW
EXECUTE PROCEDURE msw_mly_wip_key$func();
;

