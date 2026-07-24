\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_rpt_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	ym timestamp(0),
	rpt_ptn_cd varchar,
	rpt_key_cd varchar,
	rpt_row_cd varchar,
	wg_cd varchar,
	dpt_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_jnl_cd varchar,
	itm_grp_typ varchar,
	itm_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_rpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_rpt_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				rpt_ptn_cd varchar (10) NULL,
				rpt_key_cd varchar (5) NULL,
				rpt_row_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				dpt_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				itm_jnl_cd varchar (5) NULL,
				itm_grp_typ varchar (2) NULL,
				itm_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_rpt_key_pk_ie ON mgw_rpt_key$temp
				USING BTREE (calc_no,calc_grp_cd,ym,rpt_ptn_cd,rpt_key_cd,rpt_row_cd,wg_cd,dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_jnl_cd,itm_grp_typ,itm_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_rpt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_rpt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_rpt_key
AS
SELECT *
FROM mgw_rpt_key();

CREATE OR REPLACE FUNCTION mgw_rpt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_rpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_rpt_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				rpt_ptn_cd varchar (10) NULL,
				rpt_key_cd varchar (5) NULL,
				rpt_row_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				dpt_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				itm_jnl_cd varchar (5) NULL,
				itm_grp_typ varchar (2) NULL,
				itm_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_rpt_key_pk_ie ON mgw_rpt_key$temp
				USING BTREE (calc_no,calc_grp_cd,ym,rpt_ptn_cd,rpt_key_cd,rpt_row_cd,wg_cd,dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_jnl_cd,itm_grp_typ,itm_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_rpt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_rpt_key$temp(
			calc_no,
			calc_grp_cd,
			ym,
			rpt_ptn_cd,
			rpt_key_cd,
			rpt_row_cd,
			wg_cd,
			dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_jnl_cd,
			itm_grp_typ,
			itm_grp_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.ym,
			NEW.rpt_ptn_cd,
			NEW.rpt_key_cd,
			NEW.rpt_row_cd,
			NEW.wg_cd,
			NEW.dpt_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_jnl_cd,
			NEW.itm_grp_typ,
			NEW.itm_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_rpt_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			ym = NEW.ym,
			rpt_ptn_cd = NEW.rpt_ptn_cd,
			rpt_key_cd = NEW.rpt_key_cd,
			rpt_row_cd = NEW.rpt_row_cd,
			wg_cd = NEW.wg_cd,
			dpt_cd = NEW.dpt_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_jnl_cd = NEW.itm_jnl_cd,
			itm_grp_typ = NEW.itm_grp_typ,
			itm_grp_cd = NEW.itm_grp_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (rpt_ptn_cd = OLD.rpt_ptn_cd OR rpt_ptn_cd IS NULL AND OLD.rpt_ptn_cd IS NULL)
		AND (rpt_key_cd = OLD.rpt_key_cd OR rpt_key_cd IS NULL AND OLD.rpt_key_cd IS NULL)
		AND (rpt_row_cd = OLD.rpt_row_cd OR rpt_row_cd IS NULL AND OLD.rpt_row_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_jnl_cd = OLD.itm_jnl_cd OR itm_jnl_cd IS NULL AND OLD.itm_jnl_cd IS NULL)
		AND (itm_grp_typ = OLD.itm_grp_typ OR itm_grp_typ IS NULL AND OLD.itm_grp_typ IS NULL)
		AND (itm_grp_cd = OLD.itm_grp_cd OR itm_grp_cd IS NULL AND OLD.itm_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_rpt_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (rpt_ptn_cd = OLD.rpt_ptn_cd OR rpt_ptn_cd IS NULL AND OLD.rpt_ptn_cd IS NULL)
		AND (rpt_key_cd = OLD.rpt_key_cd OR rpt_key_cd IS NULL AND OLD.rpt_key_cd IS NULL)
		AND (rpt_row_cd = OLD.rpt_row_cd OR rpt_row_cd IS NULL AND OLD.rpt_row_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_jnl_cd = OLD.itm_jnl_cd OR itm_jnl_cd IS NULL AND OLD.itm_jnl_cd IS NULL)
		AND (itm_grp_typ = OLD.itm_grp_typ OR itm_grp_typ IS NULL AND OLD.itm_grp_typ IS NULL)
		AND (itm_grp_cd = OLD.itm_grp_cd OR itm_grp_cd IS NULL AND OLD.itm_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_rpt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_rpt_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_rpt_key$func();
;

