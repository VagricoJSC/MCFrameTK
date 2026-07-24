\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_oper_order()
RETURNS TABLE (
	peg_no numeric,
	oper_ord_no varchar,
	st_schd_tm timestamp(0),
	inst_st_schd_tm timestamp(0),
	act_st_tm timestamp(0),
	end_schd_tm timestamp(0),
	inst_end_schd_tm timestamp(0),
	act_end_tm timestamp(0),
	oper_lt numeric,
	act_oper_lt numeric,
	oper_offst_typ varchar,
	oper_offst numeric,
	oper_schd_qty numeric,
	not_oper_schd_qty numeric,
	itm_ord_no varchar,
	disp_seq numeric,
	oper_ptn varchar,
	oper_cd varchar,
	oper_seq numeric,
	loc_cd varchar,
	oper_ord_sts_typ varchar,
	itm_ord_sts_typ varchar,
	wg_cd varchar,
	yield_oper_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_oper_order$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_oper_order$temp(
				peg_no numeric (9,0) NULL,
				oper_ord_no varchar (15) NULL,
				st_schd_tm timestamp(0)  NULL,
				inst_st_schd_tm timestamp(0)  NULL,
				act_st_tm timestamp(0)  NULL,
				end_schd_tm timestamp(0)  NULL,
				inst_end_schd_tm timestamp(0)  NULL,
				act_end_tm timestamp(0)  NULL,
				oper_lt numeric (9,0) NULL,
				act_oper_lt numeric (9,0) NULL,
				oper_offst_typ varchar (1) NULL,
				oper_offst numeric (9,0) NULL,
				oper_schd_qty numeric (21,8) NULL,
				not_oper_schd_qty numeric (21,8) NULL,
				itm_ord_no varchar (15) NULL,
				disp_seq numeric (9,0) NULL,
				oper_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				loc_cd varchar (20) NULL,
				oper_ord_sts_typ varchar (1) NULL,
				itm_ord_sts_typ varchar (1) NULL,
				wg_cd varchar (10) NULL,
				yield_oper_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_oper_order$temp
				ADD CONSTRAINT msw_oper_order_ck01 CHECK (yield_oper_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_oper_order$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_oper_order$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_oper_order
AS
SELECT *
FROM msw_oper_order();
ALTER VIEW msw_oper_order ALTER COLUMN yield_oper_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_oper_order$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_oper_order$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_oper_order$temp(
				peg_no numeric (9,0) NULL,
				oper_ord_no varchar (15) NULL,
				st_schd_tm timestamp(0)  NULL,
				inst_st_schd_tm timestamp(0)  NULL,
				act_st_tm timestamp(0)  NULL,
				end_schd_tm timestamp(0)  NULL,
				inst_end_schd_tm timestamp(0)  NULL,
				act_end_tm timestamp(0)  NULL,
				oper_lt numeric (9,0) NULL,
				act_oper_lt numeric (9,0) NULL,
				oper_offst_typ varchar (1) NULL,
				oper_offst numeric (9,0) NULL,
				oper_schd_qty numeric (21,8) NULL,
				not_oper_schd_qty numeric (21,8) NULL,
				itm_ord_no varchar (15) NULL,
				disp_seq numeric (9,0) NULL,
				oper_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				loc_cd varchar (20) NULL,
				oper_ord_sts_typ varchar (1) NULL,
				itm_ord_sts_typ varchar (1) NULL,
				wg_cd varchar (10) NULL,
				yield_oper_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_oper_order$temp
			ADD CONSTRAINT msw_oper_order_ck01 CHECK (yield_oper_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_oper_order$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_oper_order$temp(
			peg_no,
			oper_ord_no,
			st_schd_tm,
			inst_st_schd_tm,
			act_st_tm,
			end_schd_tm,
			inst_end_schd_tm,
			act_end_tm,
			oper_lt,
			act_oper_lt,
			oper_offst_typ,
			oper_offst,
			oper_schd_qty,
			not_oper_schd_qty,
			itm_ord_no,
			disp_seq,
			oper_ptn,
			oper_cd,
			oper_seq,
			loc_cd,
			oper_ord_sts_typ,
			itm_ord_sts_typ,
			wg_cd,
			yield_oper_flg
		)VALUES (
			NEW.peg_no,
			NEW.oper_ord_no,
			NEW.st_schd_tm,
			NEW.inst_st_schd_tm,
			NEW.act_st_tm,
			NEW.end_schd_tm,
			NEW.inst_end_schd_tm,
			NEW.act_end_tm,
			NEW.oper_lt,
			NEW.act_oper_lt,
			NEW.oper_offst_typ,
			NEW.oper_offst,
			NEW.oper_schd_qty,
			NEW.not_oper_schd_qty,
			NEW.itm_ord_no,
			NEW.disp_seq,
			NEW.oper_ptn,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.loc_cd,
			NEW.oper_ord_sts_typ,
			NEW.itm_ord_sts_typ,
			NEW.wg_cd,
			NEW.yield_oper_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_oper_order$temp
		SET 
			peg_no = NEW.peg_no,
			oper_ord_no = NEW.oper_ord_no,
			st_schd_tm = NEW.st_schd_tm,
			inst_st_schd_tm = NEW.inst_st_schd_tm,
			act_st_tm = NEW.act_st_tm,
			end_schd_tm = NEW.end_schd_tm,
			inst_end_schd_tm = NEW.inst_end_schd_tm,
			act_end_tm = NEW.act_end_tm,
			oper_lt = NEW.oper_lt,
			act_oper_lt = NEW.act_oper_lt,
			oper_offst_typ = NEW.oper_offst_typ,
			oper_offst = NEW.oper_offst,
			oper_schd_qty = NEW.oper_schd_qty,
			not_oper_schd_qty = NEW.not_oper_schd_qty,
			itm_ord_no = NEW.itm_ord_no,
			disp_seq = NEW.disp_seq,
			oper_ptn = NEW.oper_ptn,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			loc_cd = NEW.loc_cd,
			oper_ord_sts_typ = NEW.oper_ord_sts_typ,
			itm_ord_sts_typ = NEW.itm_ord_sts_typ,
			wg_cd = NEW.wg_cd,
			yield_oper_flg = NEW.yield_oper_flg
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (oper_ord_no = OLD.oper_ord_no OR oper_ord_no IS NULL AND OLD.oper_ord_no IS NULL)
		AND (st_schd_tm = OLD.st_schd_tm OR st_schd_tm IS NULL AND OLD.st_schd_tm IS NULL)
		AND (inst_st_schd_tm = OLD.inst_st_schd_tm OR inst_st_schd_tm IS NULL AND OLD.inst_st_schd_tm IS NULL)
		AND (act_st_tm = OLD.act_st_tm OR act_st_tm IS NULL AND OLD.act_st_tm IS NULL)
		AND (end_schd_tm = OLD.end_schd_tm OR end_schd_tm IS NULL AND OLD.end_schd_tm IS NULL)
		AND (inst_end_schd_tm = OLD.inst_end_schd_tm OR inst_end_schd_tm IS NULL AND OLD.inst_end_schd_tm IS NULL)
		AND (act_end_tm = OLD.act_end_tm OR act_end_tm IS NULL AND OLD.act_end_tm IS NULL)
		AND (oper_lt = OLD.oper_lt OR oper_lt IS NULL AND OLD.oper_lt IS NULL)
		AND (act_oper_lt = OLD.act_oper_lt OR act_oper_lt IS NULL AND OLD.act_oper_lt IS NULL)
		AND (oper_offst_typ = OLD.oper_offst_typ OR oper_offst_typ IS NULL AND OLD.oper_offst_typ IS NULL)
		AND (oper_offst = OLD.oper_offst OR oper_offst IS NULL AND OLD.oper_offst IS NULL)
		AND (oper_schd_qty = OLD.oper_schd_qty OR oper_schd_qty IS NULL AND OLD.oper_schd_qty IS NULL)
		AND (not_oper_schd_qty = OLD.not_oper_schd_qty OR not_oper_schd_qty IS NULL AND OLD.not_oper_schd_qty IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_ord_sts_typ = OLD.oper_ord_sts_typ OR oper_ord_sts_typ IS NULL AND OLD.oper_ord_sts_typ IS NULL)
		AND (itm_ord_sts_typ = OLD.itm_ord_sts_typ OR itm_ord_sts_typ IS NULL AND OLD.itm_ord_sts_typ IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND yield_oper_flg = OLD.yield_oper_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_oper_order$temp
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (oper_ord_no = OLD.oper_ord_no OR oper_ord_no IS NULL AND OLD.oper_ord_no IS NULL)
		AND (st_schd_tm = OLD.st_schd_tm OR st_schd_tm IS NULL AND OLD.st_schd_tm IS NULL)
		AND (inst_st_schd_tm = OLD.inst_st_schd_tm OR inst_st_schd_tm IS NULL AND OLD.inst_st_schd_tm IS NULL)
		AND (act_st_tm = OLD.act_st_tm OR act_st_tm IS NULL AND OLD.act_st_tm IS NULL)
		AND (end_schd_tm = OLD.end_schd_tm OR end_schd_tm IS NULL AND OLD.end_schd_tm IS NULL)
		AND (inst_end_schd_tm = OLD.inst_end_schd_tm OR inst_end_schd_tm IS NULL AND OLD.inst_end_schd_tm IS NULL)
		AND (act_end_tm = OLD.act_end_tm OR act_end_tm IS NULL AND OLD.act_end_tm IS NULL)
		AND (oper_lt = OLD.oper_lt OR oper_lt IS NULL AND OLD.oper_lt IS NULL)
		AND (act_oper_lt = OLD.act_oper_lt OR act_oper_lt IS NULL AND OLD.act_oper_lt IS NULL)
		AND (oper_offst_typ = OLD.oper_offst_typ OR oper_offst_typ IS NULL AND OLD.oper_offst_typ IS NULL)
		AND (oper_offst = OLD.oper_offst OR oper_offst IS NULL AND OLD.oper_offst IS NULL)
		AND (oper_schd_qty = OLD.oper_schd_qty OR oper_schd_qty IS NULL AND OLD.oper_schd_qty IS NULL)
		AND (not_oper_schd_qty = OLD.not_oper_schd_qty OR not_oper_schd_qty IS NULL AND OLD.not_oper_schd_qty IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_ord_sts_typ = OLD.oper_ord_sts_typ OR oper_ord_sts_typ IS NULL AND OLD.oper_ord_sts_typ IS NULL)
		AND (itm_ord_sts_typ = OLD.itm_ord_sts_typ OR itm_ord_sts_typ IS NULL AND OLD.itm_ord_sts_typ IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND yield_oper_flg = OLD.yield_oper_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_oper_order$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_oper_order
FOR EACH ROW
EXECUTE PROCEDURE msw_oper_order$func();
;

