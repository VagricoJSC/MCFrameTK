\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_aprv()
RETURNS TABLE (
	peg_no numeric,
	master_dt timestamp(0),
	aprv_func_typ varchar,
	aprv_rt_ptn varchar,
	src_itm_cd varchar,
	src_itm_sub1 varchar,
	src_itm_sub2 varchar,
	src_itm_sub3 varchar,
	src_dpt_cd varchar,
	src_bp_cd varchar,
	src_cur_cd1 varchar,
	src_cur_cd2 varchar,
	src_cur_cd3 varchar,
	src_ext_key1 varchar,
	src_ext_key2 varchar,
	src_ext_key3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_aprv$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_aprv$temp(
				peg_no numeric (9,0) NULL,
				master_dt timestamp(0)  NULL,
				aprv_func_typ varchar (2) NULL,
				aprv_rt_ptn varchar (10) NULL,
				src_itm_cd varchar (40) NULL,
				src_itm_sub1 varchar (5) NULL,
				src_itm_sub2 varchar (5) NULL,
				src_itm_sub3 varchar (5) NULL,
				src_dpt_cd varchar (20) NULL,
				src_bp_cd varchar (20) NULL,
				src_cur_cd1 varchar (3) NULL,
				src_cur_cd2 varchar (3) NULL,
				src_cur_cd3 varchar (3) NULL,
				src_ext_key1 varchar (20) NULL,
				src_ext_key2 varchar (20) NULL,
				src_ext_key3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_aprv$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_aprv$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_aprv
AS
SELECT *
FROM mbw_aprv();

CREATE OR REPLACE FUNCTION mbw_aprv$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_aprv$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_aprv$temp(
				peg_no numeric (9,0) NULL,
				master_dt timestamp(0)  NULL,
				aprv_func_typ varchar (2) NULL,
				aprv_rt_ptn varchar (10) NULL,
				src_itm_cd varchar (40) NULL,
				src_itm_sub1 varchar (5) NULL,
				src_itm_sub2 varchar (5) NULL,
				src_itm_sub3 varchar (5) NULL,
				src_dpt_cd varchar (20) NULL,
				src_bp_cd varchar (20) NULL,
				src_cur_cd1 varchar (3) NULL,
				src_cur_cd2 varchar (3) NULL,
				src_cur_cd3 varchar (3) NULL,
				src_ext_key1 varchar (20) NULL,
				src_ext_key2 varchar (20) NULL,
				src_ext_key3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_aprv$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_aprv$temp(
			peg_no,
			master_dt,
			aprv_func_typ,
			aprv_rt_ptn,
			src_itm_cd,
			src_itm_sub1,
			src_itm_sub2,
			src_itm_sub3,
			src_dpt_cd,
			src_bp_cd,
			src_cur_cd1,
			src_cur_cd2,
			src_cur_cd3,
			src_ext_key1,
			src_ext_key2,
			src_ext_key3
		)VALUES (
			NEW.peg_no,
			NEW.master_dt,
			NEW.aprv_func_typ,
			NEW.aprv_rt_ptn,
			NEW.src_itm_cd,
			NEW.src_itm_sub1,
			NEW.src_itm_sub2,
			NEW.src_itm_sub3,
			NEW.src_dpt_cd,
			NEW.src_bp_cd,
			NEW.src_cur_cd1,
			NEW.src_cur_cd2,
			NEW.src_cur_cd3,
			NEW.src_ext_key1,
			NEW.src_ext_key2,
			NEW.src_ext_key3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_aprv$temp
		SET 
			peg_no = NEW.peg_no,
			master_dt = NEW.master_dt,
			aprv_func_typ = NEW.aprv_func_typ,
			aprv_rt_ptn = NEW.aprv_rt_ptn,
			src_itm_cd = NEW.src_itm_cd,
			src_itm_sub1 = NEW.src_itm_sub1,
			src_itm_sub2 = NEW.src_itm_sub2,
			src_itm_sub3 = NEW.src_itm_sub3,
			src_dpt_cd = NEW.src_dpt_cd,
			src_bp_cd = NEW.src_bp_cd,
			src_cur_cd1 = NEW.src_cur_cd1,
			src_cur_cd2 = NEW.src_cur_cd2,
			src_cur_cd3 = NEW.src_cur_cd3,
			src_ext_key1 = NEW.src_ext_key1,
			src_ext_key2 = NEW.src_ext_key2,
			src_ext_key3 = NEW.src_ext_key3
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (master_dt = OLD.master_dt OR master_dt IS NULL AND OLD.master_dt IS NULL)
		AND (aprv_func_typ = OLD.aprv_func_typ OR aprv_func_typ IS NULL AND OLD.aprv_func_typ IS NULL)
		AND (aprv_rt_ptn = OLD.aprv_rt_ptn OR aprv_rt_ptn IS NULL AND OLD.aprv_rt_ptn IS NULL)
		AND (src_itm_cd = OLD.src_itm_cd OR src_itm_cd IS NULL AND OLD.src_itm_cd IS NULL)
		AND (src_itm_sub1 = OLD.src_itm_sub1 OR src_itm_sub1 IS NULL AND OLD.src_itm_sub1 IS NULL)
		AND (src_itm_sub2 = OLD.src_itm_sub2 OR src_itm_sub2 IS NULL AND OLD.src_itm_sub2 IS NULL)
		AND (src_itm_sub3 = OLD.src_itm_sub3 OR src_itm_sub3 IS NULL AND OLD.src_itm_sub3 IS NULL)
		AND (src_dpt_cd = OLD.src_dpt_cd OR src_dpt_cd IS NULL AND OLD.src_dpt_cd IS NULL)
		AND (src_bp_cd = OLD.src_bp_cd OR src_bp_cd IS NULL AND OLD.src_bp_cd IS NULL)
		AND (src_cur_cd1 = OLD.src_cur_cd1 OR src_cur_cd1 IS NULL AND OLD.src_cur_cd1 IS NULL)
		AND (src_cur_cd2 = OLD.src_cur_cd2 OR src_cur_cd2 IS NULL AND OLD.src_cur_cd2 IS NULL)
		AND (src_cur_cd3 = OLD.src_cur_cd3 OR src_cur_cd3 IS NULL AND OLD.src_cur_cd3 IS NULL)
		AND (src_ext_key1 = OLD.src_ext_key1 OR src_ext_key1 IS NULL AND OLD.src_ext_key1 IS NULL)
		AND (src_ext_key2 = OLD.src_ext_key2 OR src_ext_key2 IS NULL AND OLD.src_ext_key2 IS NULL)
		AND (src_ext_key3 = OLD.src_ext_key3 OR src_ext_key3 IS NULL AND OLD.src_ext_key3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_aprv$temp
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (master_dt = OLD.master_dt OR master_dt IS NULL AND OLD.master_dt IS NULL)
		AND (aprv_func_typ = OLD.aprv_func_typ OR aprv_func_typ IS NULL AND OLD.aprv_func_typ IS NULL)
		AND (aprv_rt_ptn = OLD.aprv_rt_ptn OR aprv_rt_ptn IS NULL AND OLD.aprv_rt_ptn IS NULL)
		AND (src_itm_cd = OLD.src_itm_cd OR src_itm_cd IS NULL AND OLD.src_itm_cd IS NULL)
		AND (src_itm_sub1 = OLD.src_itm_sub1 OR src_itm_sub1 IS NULL AND OLD.src_itm_sub1 IS NULL)
		AND (src_itm_sub2 = OLD.src_itm_sub2 OR src_itm_sub2 IS NULL AND OLD.src_itm_sub2 IS NULL)
		AND (src_itm_sub3 = OLD.src_itm_sub3 OR src_itm_sub3 IS NULL AND OLD.src_itm_sub3 IS NULL)
		AND (src_dpt_cd = OLD.src_dpt_cd OR src_dpt_cd IS NULL AND OLD.src_dpt_cd IS NULL)
		AND (src_bp_cd = OLD.src_bp_cd OR src_bp_cd IS NULL AND OLD.src_bp_cd IS NULL)
		AND (src_cur_cd1 = OLD.src_cur_cd1 OR src_cur_cd1 IS NULL AND OLD.src_cur_cd1 IS NULL)
		AND (src_cur_cd2 = OLD.src_cur_cd2 OR src_cur_cd2 IS NULL AND OLD.src_cur_cd2 IS NULL)
		AND (src_cur_cd3 = OLD.src_cur_cd3 OR src_cur_cd3 IS NULL AND OLD.src_cur_cd3 IS NULL)
		AND (src_ext_key1 = OLD.src_ext_key1 OR src_ext_key1 IS NULL AND OLD.src_ext_key1 IS NULL)
		AND (src_ext_key2 = OLD.src_ext_key2 OR src_ext_key2 IS NULL AND OLD.src_ext_key2 IS NULL)
		AND (src_ext_key3 = OLD.src_ext_key3 OR src_ext_key3 IS NULL AND OLD.src_ext_key3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_aprv$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_aprv
FOR EACH ROW
EXECUTE PROCEDURE mbw_aprv$func();
;

