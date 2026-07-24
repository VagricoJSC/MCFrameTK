\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ship_stk_rpl_itm_loc()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	loc_cd varchar,
	str_ln_cd varchar,
	ins_usr_id varchar,
	ins_usr_nm varchar,
	ins_ts timestamp(3),
	ins_func_id varchar,
	upd_cntr numeric,
	upd_usr_id varchar,
	upd_usr_nm varchar,
	upd_ts timestamp(3),
	upd_func_id varchar,
	upd_srv_req_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_stk_rpl_itm_loc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_stk_rpl_itm_loc$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				str_ln_cd varchar (10) NOT NULL,
				ins_usr_id varchar (500) NULL,
				ins_usr_nm varchar (100) NULL,
				ins_ts timestamp(3)  NULL,
				ins_func_id varchar (50) NULL,
				upd_cntr numeric (9,0) DEFAULT 0 NULL,
				upd_usr_id varchar (500) NULL,
				upd_usr_nm varchar (100) NULL,
				upd_ts timestamp(3)  NULL,
				upd_func_id varchar (50) NULL,
				upd_srv_req_no varchar (50) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_ship_stk_rpl_itm_loc$temp
			ADD CONSTRAINT msw_ship_stk_rpl_itm_loc_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,str_ln_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_stk_rpl_itm_loc$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ship_stk_rpl_itm_loc$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ship_stk_rpl_itm_loc
AS
SELECT *
FROM msw_ship_stk_rpl_itm_loc();
ALTER VIEW msw_ship_stk_rpl_itm_loc ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_ship_stk_rpl_itm_loc ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_ship_stk_rpl_itm_loc ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_ship_stk_rpl_itm_loc ALTER COLUMN upd_cntr SET DEFAULT 0;

CREATE OR REPLACE FUNCTION msw_ship_stk_rpl_itm_loc$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_stk_rpl_itm_loc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_stk_rpl_itm_loc$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				str_ln_cd varchar (10) NOT NULL,
				ins_usr_id varchar (500) NULL,
				ins_usr_nm varchar (100) NULL,
				ins_ts timestamp(3)  NULL,
				ins_func_id varchar (50) NULL,
				upd_cntr numeric (9,0) DEFAULT 0 NULL,
				upd_usr_id varchar (500) NULL,
				upd_usr_nm varchar (100) NULL,
				upd_ts timestamp(3)  NULL,
				upd_func_id varchar (50) NULL,
				upd_srv_req_no varchar (50) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_ship_stk_rpl_itm_loc$temp
			ADD CONSTRAINT msw_ship_stk_rpl_itm_loc_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,str_ln_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_stk_rpl_itm_loc$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ship_stk_rpl_itm_loc$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			str_ln_cd,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.loc_cd,
			NEW.str_ln_cd,
			NEW.ins_usr_id,
			NEW.ins_usr_nm,
			NEW.ins_ts,
			NEW.ins_func_id,
			NEW.upd_cntr,
			NEW.upd_usr_id,
			NEW.upd_usr_nm,
			NEW.upd_ts,
			NEW.upd_func_id,
			NEW.upd_srv_req_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ship_stk_rpl_itm_loc$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			loc_cd = NEW.loc_cd,
			str_ln_cd = NEW.str_ln_cd,
			ins_usr_id = NEW.ins_usr_id,
			ins_usr_nm = NEW.ins_usr_nm,
			ins_ts = NEW.ins_ts,
			ins_func_id = NEW.ins_func_id,
			upd_cntr = NEW.upd_cntr,
			upd_usr_id = NEW.upd_usr_id,
			upd_usr_nm = NEW.upd_usr_nm,
			upd_ts = NEW.upd_ts,
			upd_func_id = NEW.upd_func_id,
			upd_srv_req_no = NEW.upd_srv_req_no
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND loc_cd = OLD.loc_cd
		AND str_ln_cd = OLD.str_ln_cd
		AND (ins_usr_id = OLD.ins_usr_id OR ins_usr_id IS NULL AND OLD.ins_usr_id IS NULL)
		AND (ins_usr_nm = OLD.ins_usr_nm OR ins_usr_nm IS NULL AND OLD.ins_usr_nm IS NULL)
		AND (ins_ts = OLD.ins_ts OR ins_ts IS NULL AND OLD.ins_ts IS NULL)
		AND (ins_func_id = OLD.ins_func_id OR ins_func_id IS NULL AND OLD.ins_func_id IS NULL)
		AND (upd_cntr = OLD.upd_cntr OR upd_cntr IS NULL AND OLD.upd_cntr IS NULL)
		AND (upd_usr_id = OLD.upd_usr_id OR upd_usr_id IS NULL AND OLD.upd_usr_id IS NULL)
		AND (upd_usr_nm = OLD.upd_usr_nm OR upd_usr_nm IS NULL AND OLD.upd_usr_nm IS NULL)
		AND (upd_ts = OLD.upd_ts OR upd_ts IS NULL AND OLD.upd_ts IS NULL)
		AND (upd_func_id = OLD.upd_func_id OR upd_func_id IS NULL AND OLD.upd_func_id IS NULL)
		AND (upd_srv_req_no = OLD.upd_srv_req_no OR upd_srv_req_no IS NULL AND OLD.upd_srv_req_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ship_stk_rpl_itm_loc$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND loc_cd = OLD.loc_cd
		AND str_ln_cd = OLD.str_ln_cd
		AND (ins_usr_id = OLD.ins_usr_id OR ins_usr_id IS NULL AND OLD.ins_usr_id IS NULL)
		AND (ins_usr_nm = OLD.ins_usr_nm OR ins_usr_nm IS NULL AND OLD.ins_usr_nm IS NULL)
		AND (ins_ts = OLD.ins_ts OR ins_ts IS NULL AND OLD.ins_ts IS NULL)
		AND (ins_func_id = OLD.ins_func_id OR ins_func_id IS NULL AND OLD.ins_func_id IS NULL)
		AND (upd_cntr = OLD.upd_cntr OR upd_cntr IS NULL AND OLD.upd_cntr IS NULL)
		AND (upd_usr_id = OLD.upd_usr_id OR upd_usr_id IS NULL AND OLD.upd_usr_id IS NULL)
		AND (upd_usr_nm = OLD.upd_usr_nm OR upd_usr_nm IS NULL AND OLD.upd_usr_nm IS NULL)
		AND (upd_ts = OLD.upd_ts OR upd_ts IS NULL AND OLD.upd_ts IS NULL)
		AND (upd_func_id = OLD.upd_func_id OR upd_func_id IS NULL AND OLD.upd_func_id IS NULL)
		AND (upd_srv_req_no = OLD.upd_srv_req_no OR upd_srv_req_no IS NULL AND OLD.upd_srv_req_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ship_stk_rpl_itm_loc$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ship_stk_rpl_itm_loc
FOR EACH ROW
EXECUTE PROCEDURE msw_ship_stk_rpl_itm_loc$func();
;

