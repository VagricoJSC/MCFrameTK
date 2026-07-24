\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sim_itm_lnk_key()
RETURNS TABLE (
	itm_ord_no varchar,
	par_itm_ord_no varchar,
	par_oper_ord_no varchar,
	sim_mrp_no varchar,
	oper_ptn varchar,
	oper_cd varchar,
	oper_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sim_itm_lnk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sim_itm_lnk_key$temp(
				itm_ord_no varchar (15) NULL,
				par_itm_ord_no varchar (15) NULL,
				par_oper_ord_no varchar (15) NULL,
				sim_mrp_no varchar (15) NULL,
				oper_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sim_itm_lnk_key_pk_ie ON msw_sim_itm_lnk_key$temp
				USING BTREE (itm_ord_no,par_itm_ord_no,par_oper_ord_no,sim_mrp_no,oper_ptn,oper_cd,oper_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sim_itm_lnk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sim_itm_lnk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sim_itm_lnk_key
AS
SELECT *
FROM msw_sim_itm_lnk_key();

CREATE OR REPLACE FUNCTION msw_sim_itm_lnk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sim_itm_lnk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sim_itm_lnk_key$temp(
				itm_ord_no varchar (15) NULL,
				par_itm_ord_no varchar (15) NULL,
				par_oper_ord_no varchar (15) NULL,
				sim_mrp_no varchar (15) NULL,
				oper_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sim_itm_lnk_key_pk_ie ON msw_sim_itm_lnk_key$temp
				USING BTREE (itm_ord_no,par_itm_ord_no,par_oper_ord_no,sim_mrp_no,oper_ptn,oper_cd,oper_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sim_itm_lnk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sim_itm_lnk_key$temp(
			itm_ord_no,
			par_itm_ord_no,
			par_oper_ord_no,
			sim_mrp_no,
			oper_ptn,
			oper_cd,
			oper_seq
		)VALUES (
			NEW.itm_ord_no,
			NEW.par_itm_ord_no,
			NEW.par_oper_ord_no,
			NEW.sim_mrp_no,
			NEW.oper_ptn,
			NEW.oper_cd,
			NEW.oper_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sim_itm_lnk_key$temp
		SET 
			itm_ord_no = NEW.itm_ord_no,
			par_itm_ord_no = NEW.par_itm_ord_no,
			par_oper_ord_no = NEW.par_oper_ord_no,
			sim_mrp_no = NEW.sim_mrp_no,
			oper_ptn = NEW.oper_ptn,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq
		WHERE 0=0
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (par_itm_ord_no = OLD.par_itm_ord_no OR par_itm_ord_no IS NULL AND OLD.par_itm_ord_no IS NULL)
		AND (par_oper_ord_no = OLD.par_oper_ord_no OR par_oper_ord_no IS NULL AND OLD.par_oper_ord_no IS NULL)
		AND (sim_mrp_no = OLD.sim_mrp_no OR sim_mrp_no IS NULL AND OLD.sim_mrp_no IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sim_itm_lnk_key$temp
		WHERE 0=0
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (par_itm_ord_no = OLD.par_itm_ord_no OR par_itm_ord_no IS NULL AND OLD.par_itm_ord_no IS NULL)
		AND (par_oper_ord_no = OLD.par_oper_ord_no OR par_oper_ord_no IS NULL AND OLD.par_oper_ord_no IS NULL)
		AND (sim_mrp_no = OLD.sim_mrp_no OR sim_mrp_no IS NULL AND OLD.sim_mrp_no IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sim_itm_lnk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sim_itm_lnk_key
FOR EACH ROW
EXECUTE PROCEDURE msw_sim_itm_lnk_key$func();
;

