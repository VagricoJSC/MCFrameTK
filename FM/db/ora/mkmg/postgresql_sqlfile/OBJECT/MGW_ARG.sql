\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_arg()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	term timestamp(0),
	st_ym timestamp(0),
	end_ym timestamp(0),
	sa_typ varchar,
	exp_calc_typ varchar,
	pre_alc_calc_typ varchar,
	alc_calc_typ varchar,
	cost_calc_typ varchar,
	eval_typ varchar,
	inpt_calc_flg char,
	wk_calc_flg char,
	prov_calc_flg char,
	xfr_calc_flg char,
	xrate_cd varchar,
	runtime_wg_cd varchar,
	calc_st timestamp(0),
	calc_fin timestamp(0),
	calc_cnt numeric,
	calc_exec_cnt numeric,
	alc_err_flg char,
	trd_amt_flg char,
	adj_amt_flg char,
	minus_stk_flg char,
	other_chk_flg char,
	itm_limit_flg char,
	data_check_flg char,
	carry_flg char,
	non_del_flg char,
	fix_flg char,
	rate_fix_flg char,
	calc_err_flg char,
	ins_srv_req_no varchar,
	batch_log_no varchar,
	rmrks varchar,
	sub_char1 varchar,
	sub_char2 varchar,
	sub_char3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_arg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_arg$temp(
				calc_no varchar (15) NOT NULL,
				calc_grp_cd varchar (10) NOT NULL,
				term timestamp(0)  NOT NULL,
				st_ym timestamp(0)  NOT NULL,
				end_ym timestamp(0)  NOT NULL,
				sa_typ varchar (1) NOT NULL,
				exp_calc_typ varchar (1) NOT NULL,
				pre_alc_calc_typ varchar (1) NOT NULL,
				alc_calc_typ varchar (1) NOT NULL,
				cost_calc_typ varchar (1) NOT NULL,
				eval_typ varchar (1) NULL,
				inpt_calc_flg char (1) DEFAULT '0' NOT NULL,
				wk_calc_flg char (1) DEFAULT '0' NOT NULL,
				prov_calc_flg char (1) DEFAULT '0' NOT NULL,
				xfr_calc_flg char (1) DEFAULT '0' NOT NULL,
				xrate_cd varchar (2) NULL,
				runtime_wg_cd varchar (10) NULL,
				calc_st timestamp(0)  NOT NULL,
				calc_fin timestamp(0)  NULL,
				calc_cnt numeric (2,0) DEFAULT 1 NOT NULL,
				calc_exec_cnt numeric (2,0) DEFAULT 1 NOT NULL,
				alc_err_flg char (1) DEFAULT '0' NOT NULL,
				trd_amt_flg char (1) DEFAULT '0' NOT NULL,
				adj_amt_flg char (1) DEFAULT '0' NOT NULL,
				minus_stk_flg char (1) DEFAULT '0' NOT NULL,
				other_chk_flg char (1) DEFAULT '0' NOT NULL,
				itm_limit_flg char (1) DEFAULT '0' NOT NULL,
				data_check_flg char (1) DEFAULT '0' NOT NULL,
				carry_flg char (1) DEFAULT '0' NOT NULL,
				non_del_flg char (1) DEFAULT '0' NOT NULL,
				fix_flg char (1) DEFAULT '0' NOT NULL,
				rate_fix_flg char (1) DEFAULT '0' NOT NULL,
				calc_err_flg char (1) DEFAULT '0' NOT NULL,
				ins_srv_req_no varchar (50) NULL,
				batch_log_no varchar (15) NULL,
				rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_pk PRIMARY KEY(calc_no,calc_grp_cd);
			
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck01 CHECK (inpt_calc_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck02 CHECK (wk_calc_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck03 CHECK (prov_calc_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck04 CHECK (xfr_calc_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck05 CHECK (alc_err_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck06 CHECK (trd_amt_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck07 CHECK (adj_amt_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck08 CHECK (minus_stk_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck09 CHECK (other_chk_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck10 CHECK (itm_limit_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck11 CHECK (data_check_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck12 CHECK (carry_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck13 CHECK (non_del_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck14 CHECK (fix_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck15 CHECK (rate_fix_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
				ADD CONSTRAINT mgw_arg_ck16 CHECK (calc_err_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_arg$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_arg$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_arg
AS
SELECT *
FROM mgw_arg();
ALTER VIEW mgw_arg ALTER COLUMN inpt_calc_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN wk_calc_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN prov_calc_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN xfr_calc_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN calc_cnt SET DEFAULT 1;
ALTER VIEW mgw_arg ALTER COLUMN calc_exec_cnt SET DEFAULT 1;
ALTER VIEW mgw_arg ALTER COLUMN alc_err_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN trd_amt_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN adj_amt_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN minus_stk_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN other_chk_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN itm_limit_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN data_check_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN carry_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN non_del_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN fix_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN rate_fix_flg SET DEFAULT '0';
ALTER VIEW mgw_arg ALTER COLUMN calc_err_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_arg$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_arg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_arg$temp(
				calc_no varchar (15) NOT NULL,
				calc_grp_cd varchar (10) NOT NULL,
				term timestamp(0)  NOT NULL,
				st_ym timestamp(0)  NOT NULL,
				end_ym timestamp(0)  NOT NULL,
				sa_typ varchar (1) NOT NULL,
				exp_calc_typ varchar (1) NOT NULL,
				pre_alc_calc_typ varchar (1) NOT NULL,
				alc_calc_typ varchar (1) NOT NULL,
				cost_calc_typ varchar (1) NOT NULL,
				eval_typ varchar (1) NULL,
				inpt_calc_flg char (1) DEFAULT '0' NOT NULL,
				wk_calc_flg char (1) DEFAULT '0' NOT NULL,
				prov_calc_flg char (1) DEFAULT '0' NOT NULL,
				xfr_calc_flg char (1) DEFAULT '0' NOT NULL,
				xrate_cd varchar (2) NULL,
				runtime_wg_cd varchar (10) NULL,
				calc_st timestamp(0)  NOT NULL,
				calc_fin timestamp(0)  NULL,
				calc_cnt numeric (2,0) DEFAULT 1 NOT NULL,
				calc_exec_cnt numeric (2,0) DEFAULT 1 NOT NULL,
				alc_err_flg char (1) DEFAULT '0' NOT NULL,
				trd_amt_flg char (1) DEFAULT '0' NOT NULL,
				adj_amt_flg char (1) DEFAULT '0' NOT NULL,
				minus_stk_flg char (1) DEFAULT '0' NOT NULL,
				other_chk_flg char (1) DEFAULT '0' NOT NULL,
				itm_limit_flg char (1) DEFAULT '0' NOT NULL,
				data_check_flg char (1) DEFAULT '0' NOT NULL,
				carry_flg char (1) DEFAULT '0' NOT NULL,
				non_del_flg char (1) DEFAULT '0' NOT NULL,
				fix_flg char (1) DEFAULT '0' NOT NULL,
				rate_fix_flg char (1) DEFAULT '0' NOT NULL,
				calc_err_flg char (1) DEFAULT '0' NOT NULL,
				ins_srv_req_no varchar (50) NULL,
				batch_log_no varchar (15) NULL,
				rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_pk PRIMARY KEY(calc_no,calc_grp_cd);
			
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck01 CHECK (inpt_calc_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck02 CHECK (wk_calc_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck03 CHECK (prov_calc_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck04 CHECK (xfr_calc_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck05 CHECK (alc_err_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck06 CHECK (trd_amt_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck07 CHECK (adj_amt_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck08 CHECK (minus_stk_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck09 CHECK (other_chk_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck10 CHECK (itm_limit_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck11 CHECK (data_check_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck12 CHECK (carry_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck13 CHECK (non_del_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck14 CHECK (fix_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck15 CHECK (rate_fix_flg IN ('0', '1'));
			ALTER TABLE mgw_arg$temp
			ADD CONSTRAINT mgw_arg_ck16 CHECK (calc_err_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_arg$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_arg$temp(
			calc_no,
			calc_grp_cd,
			term,
			st_ym,
			end_ym,
			sa_typ,
			exp_calc_typ,
			pre_alc_calc_typ,
			alc_calc_typ,
			cost_calc_typ,
			eval_typ,
			inpt_calc_flg,
			wk_calc_flg,
			prov_calc_flg,
			xfr_calc_flg,
			xrate_cd,
			runtime_wg_cd,
			calc_st,
			calc_fin,
			calc_cnt,
			calc_exec_cnt,
			alc_err_flg,
			trd_amt_flg,
			adj_amt_flg,
			minus_stk_flg,
			other_chk_flg,
			itm_limit_flg,
			data_check_flg,
			carry_flg,
			non_del_flg,
			fix_flg,
			rate_fix_flg,
			calc_err_flg,
			ins_srv_req_no,
			batch_log_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.term,
			NEW.st_ym,
			NEW.end_ym,
			NEW.sa_typ,
			NEW.exp_calc_typ,
			NEW.pre_alc_calc_typ,
			NEW.alc_calc_typ,
			NEW.cost_calc_typ,
			NEW.eval_typ,
			NEW.inpt_calc_flg,
			NEW.wk_calc_flg,
			NEW.prov_calc_flg,
			NEW.xfr_calc_flg,
			NEW.xrate_cd,
			NEW.runtime_wg_cd,
			NEW.calc_st,
			NEW.calc_fin,
			NEW.calc_cnt,
			NEW.calc_exec_cnt,
			NEW.alc_err_flg,
			NEW.trd_amt_flg,
			NEW.adj_amt_flg,
			NEW.minus_stk_flg,
			NEW.other_chk_flg,
			NEW.itm_limit_flg,
			NEW.data_check_flg,
			NEW.carry_flg,
			NEW.non_del_flg,
			NEW.fix_flg,
			NEW.rate_fix_flg,
			NEW.calc_err_flg,
			NEW.ins_srv_req_no,
			NEW.batch_log_no,
			NEW.rmrks,
			NEW.sub_char1,
			NEW.sub_char2,
			NEW.sub_char3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_arg$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			term = NEW.term,
			st_ym = NEW.st_ym,
			end_ym = NEW.end_ym,
			sa_typ = NEW.sa_typ,
			exp_calc_typ = NEW.exp_calc_typ,
			pre_alc_calc_typ = NEW.pre_alc_calc_typ,
			alc_calc_typ = NEW.alc_calc_typ,
			cost_calc_typ = NEW.cost_calc_typ,
			eval_typ = NEW.eval_typ,
			inpt_calc_flg = NEW.inpt_calc_flg,
			wk_calc_flg = NEW.wk_calc_flg,
			prov_calc_flg = NEW.prov_calc_flg,
			xfr_calc_flg = NEW.xfr_calc_flg,
			xrate_cd = NEW.xrate_cd,
			runtime_wg_cd = NEW.runtime_wg_cd,
			calc_st = NEW.calc_st,
			calc_fin = NEW.calc_fin,
			calc_cnt = NEW.calc_cnt,
			calc_exec_cnt = NEW.calc_exec_cnt,
			alc_err_flg = NEW.alc_err_flg,
			trd_amt_flg = NEW.trd_amt_flg,
			adj_amt_flg = NEW.adj_amt_flg,
			minus_stk_flg = NEW.minus_stk_flg,
			other_chk_flg = NEW.other_chk_flg,
			itm_limit_flg = NEW.itm_limit_flg,
			data_check_flg = NEW.data_check_flg,
			carry_flg = NEW.carry_flg,
			non_del_flg = NEW.non_del_flg,
			fix_flg = NEW.fix_flg,
			rate_fix_flg = NEW.rate_fix_flg,
			calc_err_flg = NEW.calc_err_flg,
			ins_srv_req_no = NEW.ins_srv_req_no,
			batch_log_no = NEW.batch_log_no,
			rmrks = NEW.rmrks,
			sub_char1 = NEW.sub_char1,
			sub_char2 = NEW.sub_char2,
			sub_char3 = NEW.sub_char3
		WHERE 0=0
		AND calc_no = OLD.calc_no
		AND calc_grp_cd = OLD.calc_grp_cd
		AND term = OLD.term
		AND st_ym = OLD.st_ym
		AND end_ym = OLD.end_ym
		AND sa_typ = OLD.sa_typ
		AND exp_calc_typ = OLD.exp_calc_typ
		AND pre_alc_calc_typ = OLD.pre_alc_calc_typ
		AND alc_calc_typ = OLD.alc_calc_typ
		AND cost_calc_typ = OLD.cost_calc_typ
		AND (eval_typ = OLD.eval_typ OR eval_typ IS NULL AND OLD.eval_typ IS NULL)
		AND inpt_calc_flg = OLD.inpt_calc_flg
		AND wk_calc_flg = OLD.wk_calc_flg
		AND prov_calc_flg = OLD.prov_calc_flg
		AND xfr_calc_flg = OLD.xfr_calc_flg
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (runtime_wg_cd = OLD.runtime_wg_cd OR runtime_wg_cd IS NULL AND OLD.runtime_wg_cd IS NULL)
		AND calc_st = OLD.calc_st
		AND (calc_fin = OLD.calc_fin OR calc_fin IS NULL AND OLD.calc_fin IS NULL)
		AND calc_cnt = OLD.calc_cnt
		AND calc_exec_cnt = OLD.calc_exec_cnt
		AND alc_err_flg = OLD.alc_err_flg
		AND trd_amt_flg = OLD.trd_amt_flg
		AND adj_amt_flg = OLD.adj_amt_flg
		AND minus_stk_flg = OLD.minus_stk_flg
		AND other_chk_flg = OLD.other_chk_flg
		AND itm_limit_flg = OLD.itm_limit_flg
		AND data_check_flg = OLD.data_check_flg
		AND carry_flg = OLD.carry_flg
		AND non_del_flg = OLD.non_del_flg
		AND fix_flg = OLD.fix_flg
		AND rate_fix_flg = OLD.rate_fix_flg
		AND calc_err_flg = OLD.calc_err_flg
		AND (ins_srv_req_no = OLD.ins_srv_req_no OR ins_srv_req_no IS NULL AND OLD.ins_srv_req_no IS NULL)
		AND (batch_log_no = OLD.batch_log_no OR batch_log_no IS NULL AND OLD.batch_log_no IS NULL)
		AND (rmrks = OLD.rmrks OR rmrks IS NULL AND OLD.rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_arg$temp
		WHERE 0=0
		AND calc_no = OLD.calc_no
		AND calc_grp_cd = OLD.calc_grp_cd
		AND term = OLD.term
		AND st_ym = OLD.st_ym
		AND end_ym = OLD.end_ym
		AND sa_typ = OLD.sa_typ
		AND exp_calc_typ = OLD.exp_calc_typ
		AND pre_alc_calc_typ = OLD.pre_alc_calc_typ
		AND alc_calc_typ = OLD.alc_calc_typ
		AND cost_calc_typ = OLD.cost_calc_typ
		AND (eval_typ = OLD.eval_typ OR eval_typ IS NULL AND OLD.eval_typ IS NULL)
		AND inpt_calc_flg = OLD.inpt_calc_flg
		AND wk_calc_flg = OLD.wk_calc_flg
		AND prov_calc_flg = OLD.prov_calc_flg
		AND xfr_calc_flg = OLD.xfr_calc_flg
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (runtime_wg_cd = OLD.runtime_wg_cd OR runtime_wg_cd IS NULL AND OLD.runtime_wg_cd IS NULL)
		AND calc_st = OLD.calc_st
		AND (calc_fin = OLD.calc_fin OR calc_fin IS NULL AND OLD.calc_fin IS NULL)
		AND calc_cnt = OLD.calc_cnt
		AND calc_exec_cnt = OLD.calc_exec_cnt
		AND alc_err_flg = OLD.alc_err_flg
		AND trd_amt_flg = OLD.trd_amt_flg
		AND adj_amt_flg = OLD.adj_amt_flg
		AND minus_stk_flg = OLD.minus_stk_flg
		AND other_chk_flg = OLD.other_chk_flg
		AND itm_limit_flg = OLD.itm_limit_flg
		AND data_check_flg = OLD.data_check_flg
		AND carry_flg = OLD.carry_flg
		AND non_del_flg = OLD.non_del_flg
		AND fix_flg = OLD.fix_flg
		AND rate_fix_flg = OLD.rate_fix_flg
		AND calc_err_flg = OLD.calc_err_flg
		AND (ins_srv_req_no = OLD.ins_srv_req_no OR ins_srv_req_no IS NULL AND OLD.ins_srv_req_no IS NULL)
		AND (batch_log_no = OLD.batch_log_no OR batch_log_no IS NULL AND OLD.batch_log_no IS NULL)
		AND (rmrks = OLD.rmrks OR rmrks IS NULL AND OLD.rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_arg$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_arg
FOR EACH ROW
EXECUTE PROCEDURE mgw_arg$func();
;

