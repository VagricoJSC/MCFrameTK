\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_inst_wip_key()
RETURNS TABLE (
	calc_ctg_cd varchar,
	wg_cd varchar,
	ym timestamp(0),
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_mfg_inst_no varchar,
	mfg_act_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_inst_wip_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_inst_wip_key$temp(
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				itm_mfg_inst_no varchar (15) NULL,
				mfg_act_no varchar (15) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_inst_wip_key_pk_ie ON mgw_act_inst_wip_key$temp
				USING BTREE (calc_ctg_cd,wg_cd,ym,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_inst_wip_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_inst_wip_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_inst_wip_key
AS
SELECT *
FROM mgw_act_inst_wip_key();
ALTER VIEW mgw_act_inst_wip_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_act_inst_wip_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_act_inst_wip_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_act_inst_wip_key ALTER COLUMN mfg_act_no SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_act_inst_wip_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_inst_wip_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_inst_wip_key$temp(
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				itm_mfg_inst_no varchar (15) NULL,
				mfg_act_no varchar (15) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_inst_wip_key_pk_ie ON mgw_act_inst_wip_key$temp
				USING BTREE (calc_ctg_cd,wg_cd,ym,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_inst_wip_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_inst_wip_key$temp(
			calc_ctg_cd,
			wg_cd,
			ym,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no
		)VALUES (
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.ym,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_mfg_inst_no,
			NEW.mfg_act_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_inst_wip_key$temp
		SET 
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			ym = NEW.ym,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_mfg_inst_no = NEW.itm_mfg_inst_no,
			mfg_act_no = NEW.mfg_act_no
		WHERE 0=0
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (mfg_act_no = OLD.mfg_act_no OR mfg_act_no IS NULL AND OLD.mfg_act_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_inst_wip_key$temp
		WHERE 0=0
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (mfg_act_no = OLD.mfg_act_no OR mfg_act_no IS NULL AND OLD.mfg_act_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_inst_wip_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_inst_wip_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_inst_wip_key$func();
;

