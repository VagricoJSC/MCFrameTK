CREATE OR REPLACE FUNCTION mgpa_ins_scm2mgtif$f_get_msc_io_act_typ_io_typ (
	IN i_io_act_typ VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	ＭＳモジュールの受払区分の属性値io_typを取得する
<REMARKS>
	ＭＳモジュールが存在しているときのみ取得される
<ARGUMENTS>
<IN>	i_io_act_typ
		受払区分
<RETURN VALUE>
		MSC_IO_ACT_TYP.IO_TYPの結果
<HISTORY>
*************************************************************************/
DECLARE
	l_sql	CONSTANT VARCHAR := 
				'
				SELECT msc_io_act_typ$io_typ($1) ;
				' ;
	l_io_typ	VARCHAR ;
BEGIN
	l_io_typ := NULL ;
	EXECUTE l_sql INTO STRICT l_io_typ USING i_io_act_typ ;

	RETURN l_io_typ;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_scm2mgtif$p_col_proc_itm()
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	品目製造指図情報を変更する
<REMARKS>
	原価ＩＦパラメータマスタの設定により品目製造指図情報の指定項目を変更する
<ARGUMENTS>
<HISTORY>
*************************************************************************/
DECLARE
	c_tgt_po_no		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','PO_NO');
	c_tgt_slo_no	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','SLO_NO');
	c_tgt_iv_no		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','IV_NO');
	l_cnt INTEGER;
	r RECORD;
BEGIN
	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_parm_itm;
	IF l_cnt = 0 THEN
		RETURN;
	END IF;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w6;
	FOR r IN
		SELECT w.* FROM mgpa_ins_scm2mgtif$p_if$rec_parm_itm w
	LOOP
		CASE r.tgt_col_typ
			WHEN c_tgt_po_no THEN
				UPDATE mgpa_ins_scm2mgtif$p_if$rec_w6 SET po_no = NULL WHERE _index_ = l_cnt;
			WHEN c_tgt_slo_no THEN
				UPDATE mgpa_ins_scm2mgtif$p_if$rec_w6 SET slo_no = NULL WHERE _index_ = l_cnt;
			WHEN c_tgt_iv_no THEN
				UPDATE mgpa_ins_scm2mgtif$p_if$rec_w6 SET iv_no = NULL WHERE _index_ = l_cnt;
		END CASE;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_scm2mgtif$p_col_proc_purc()
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	購買実績ＩＦを変更する
<REMARKS>
	原価ＩＦパラメータマスタの設定により購買実績ＩＦの指定項目を変更する
<ARGUMENTS>
<HISTORY>
*************************************************************************/
DECLARE
	c_tgt_po_no		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','PO_NO');
	c_tgt_slo_no	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','SLO_NO');
	c_tgt_iv_no		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','IV_NO');
	l_cnt INTEGER;
	r RECORD;
BEGIN
	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_parm_purc_if;
	IF l_cnt = 0 THEN
		RETURN;
	END IF;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w2;
	FOR r IN
		SELECT w.* FROM mgpa_ins_scm2mgtif$p_if$rec_parm_purc_if w
	LOOP
		CASE r.tgt_col_typ
			WHEN c_tgt_po_no THEN
				UPDATE mgpa_ins_scm2mgtif$p_if$rec_w2 SET po_no = NULL WHERE _index_ = l_cnt;
			WHEN c_tgt_slo_no THEN
				UPDATE mgpa_ins_scm2mgtif$p_if$rec_w2 SET slo_no = NULL WHERE _index_ = l_cnt;
			WHEN c_tgt_iv_no THEN
				UPDATE mgpa_ins_scm2mgtif$p_if$rec_w2 SET iv_no = NULL WHERE _index_ = l_cnt;
		END CASE;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_scm2mgtif$p_col_proc_sls()
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	売上実績ＩＦを変更する
<REMARKS>
	原価ＩＦパラメータマスタの設定により売上実績ＩＦの指定項目を変更する
<ARGUMENTS>
<HISTORY>
*************************************************************************/
DECLARE
	c_tgt_slo_no	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','SLO_NO');
	c_tgt_iv_no		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','IV_NO');
	l_cnt INTEGER;
	r RECORD;
BEGIN
	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_parm_sls_if;
	IF l_cnt = 0 THEN
		RETURN;
	END IF;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w5;
	FOR r IN
		SELECT w.* FROM mgpa_ins_scm2mgtif$p_if$rec_parm_sls_if w
	LOOP
		CASE r.tgt_col_typ
			WHEN c_tgt_slo_no THEN
				UPDATE mgpa_ins_scm2mgtif$p_if$rec_w5 SET slo_no = NULL WHERE _index_ = l_cnt;
			WHEN c_tgt_iv_no THEN
				UPDATE mgpa_ins_scm2mgtif$p_if$rec_w5 SET iv_no = NULL WHERE _index_ = l_cnt;
		END CASE;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_ins_scm2mgtif$f_chk_itm(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_itm_mfg_inst_no VARCHAR,
	 IN i_mfg_act_no VARCHAR)
RETURNS INTEGER
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	品目ＣＤ、枝番１～３、品目製造指図ＮＯ、製造実績ＮＯごとに重複チェックを行う
<REMARKS>
	重複なしならOK、重複ありならERRとする
<ARGUMENTS>
<IN>	i_itm_cd
		品目ｃｄ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_itm_mfg_inst_no
		品目製造指図ｎｏ
<IN>	i_mfg_act_no
		製造実績ｎｏ
<HISTORY>
*************************************************************************/
DECLARE
	c_ok		CONSTANT INTEGER := 0 ;
	c_err		CONSTANT INTEGER := 1 ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_str_chk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','CHK_STR_DLM');
	l_cnt INTEGER;
	l_chk_str VARCHAR(90);
BEGIN
	IF i_itm_mfg_inst_no IS NULL AND COALESCE(i_mfg_act_no, c_null_val) = c_null_val THEN
		RETURN c_err;
	END IF;
	l_chk_str := CONCAT_WS(c_str_chk, i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_itm_mfg_inst_no, i_mfg_act_no);

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_chk_itm WHERE _index_ = l_chk_str;
	IF l_cnt > 0 THEN
		RETURN c_err;
	ELSE
		INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_chk_itm (_index_, _elem_) VALUES (l_chk_str, l_chk_str);
		RETURN c_ok;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_ins_scm2mgtif$f_chk_oper(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_itm_mfg_inst_no VARCHAR,
	 IN i_mfg_act_no VARCHAR,
	 IN i_oper_act_no VARCHAR)
RETURNS INTEGER
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	品目ＣＤ、枝番１～３、品目製造指図ＮＯ、製造実績ＮＯ、工程実績ＮＯごとに重複チェックを行う
<REMARKS>
	重複なしならOK、重複ありならERRとする
<ARGUMENTS>
<IN>	i_itm_cd
		品目ｃｄ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_itm_mfg_inst_no
		品目製造指図ｎｏ
<IN>	i_mfg_act_no
		製造実績ｎｏ
<IN>	i_oper_act_no
		工程実績ｎｏ
<HISTORY>
*************************************************************************/
DECLARE
	c_ok		CONSTANT INTEGER := 0 ;
	c_err		CONSTANT INTEGER := 1 ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_str_chk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','CHK_STR_DLM');
	l_cnt INTEGER;
	l_chk_str VARCHAR(106);
BEGIN
	IF (i_itm_mfg_inst_no IS NULL AND COALESCE(i_mfg_act_no, c_null_val) = c_null_val)
	OR COALESCE(i_oper_act_no, c_null_val) = c_null_val THEN
		RETURN c_err;
	END IF;
	l_chk_str := CONCAT_WS(c_str_chk,
		i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_itm_mfg_inst_no, i_mfg_act_no, i_oper_act_no);

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_chk_oper WHERE _index_ = l_chk_str;
	IF l_cnt > 0 THEN
		RETURN c_err;
	ELSE
		INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_chk_oper (_index_, _elem_) VALUES (l_chk_str, l_chk_str);
		RETURN c_ok;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_ins_scm2mgtif$f_chk_iv (
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_itm_mfg_inst_no VARCHAR,
	 IN i_mfg_act_no VARCHAR,
	 IN i_iv_no VARCHAR
)
RETURNS INTEGER
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	品目ＣＤ、枝番１～３、品目製造指図ＮＯ、製造実績ＮＯごとにインボイスＮＯの重複チェックを行う
<REMARKS>
	インボイスＮＯ違いで重複している場合は-1を返す
	重複なしならOK、重複ありならERRとする
<ARGUMENTS>
<IN>	i_itm_cd
		品目CD
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_itm_mfg_inst_no
		品目製造指図ＮＯ
<IN>	i_mfg_act_no
		製造実績ＮＯ
<IN>	i_iv_no
		インボイスＮＯ
<HISTORY>
*************************************************************************/
DECLARE
	c_ok		CONSTANT INTEGER := 0 ;
	c_err		CONSTANT INTEGER := 1 ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_str_chk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','CHK_STR_DLM') ;
	l_cnt INTEGER ;
	l_chk_str VARCHAR(90) ;
	l_chk_str2 VARCHAR(106) ;
BEGIN
	IF i_itm_mfg_inst_no IS NULL AND COALESCE(i_mfg_act_no, c_null_val) = c_null_val THEN
		RETURN c_err ;
	END IF ;

	l_chk_str := CONCAT_WS(c_str_chk, i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_itm_mfg_inst_no, i_mfg_act_no) ;
	l_chk_str2 := CONCAT_WS(c_str_chk, l_chk_str, i_iv_no) ;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_chk_iv WHERE _index_ = l_chk_str ;
	IF l_cnt > 0 THEN
		SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_chk_iv2 WHERE _index_ = l_chk_str2 ;
		IF l_cnt > 0 THEN
			RETURN c_err ;
		ELSE
			INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_chk_iv2 (_index_, _elem_) VALUES (l_chk_str2, l_chk_str2) ;
			RETURN -1 ;
		END IF ;
	ELSE
		INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_chk_iv (_index_, _elem_) VALUES (l_chk_str, l_chk_str) ;
		INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_chk_iv2 (_index_, _elem_) VALUES (l_chk_str2, l_chk_str2) ;
		RETURN c_ok ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_scm2mgtif$p_ins_tran (
	INOUT i_mfg_cnt			INTEGER,
	INOUT i_purc_cnt		INTEGER,
	INOUT i_inpt_cnt		INTEGER,
	INOUT i_io_cnt			INTEGER,
	INOUT i_sls_cnt			INTEGER,
	INOUT i_inst_wk_cnt		INTEGER,
	INOUT i_mfg_inst_cnt	INTEGER,
	INOUT i_inst_oper_cnt	INTEGER
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	受払情報から原価ＩＦテーブルを作成する
<REMARKS>
	品目製造指図情報、指図工程情報は作成対象のデータと同一キーの
	データを対象テーブルから削除して後にデータを作成する
<ARGUMENTS>
<INOUT>	i_mfg_cnt
		製造実績ＩＦ登録件数
<INOUT>	i_purc_cnt
		購買実績ＩＦ登録件数
<INOUT>	i_inpt_cnt
		投入実績ＩＦ登録件数
<INOUT>	i_io_cnt
		入出庫実績ＩＦ登録件数
<INOUT>	i_sls_cnt
		売上実績ＩＦ登録件数
<INOUT>	i_inst_wk_cnt
		指図工数実績ＩＦ登録件数
<INOUT>	i_mfg_inst_cnt
		品目製造指図情報登録件数
<INOUT>	i_inst_oper_cnt
		指図工程情報登録件数
<HISTORY>
*************************************************************************/
DECLARE
	c_off	CONSTANT CHAR(1) := '0' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	l_cnt INTEGER;
BEGIN
	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w1;
	IF l_cnt > 0 THEN
		i_mfg_cnt := i_mfg_cnt + l_cnt;
		INSERT INTO mgt_act_mfg_if (
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			loc_cd,
			str_ln_cd,
			ac_slip_typ,
			ac_rsn_cd,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			mfg_per,
			mfg_cost_ratio,
			expns_cd,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			mfg_act_grp,
			bom_ptn,
			oper_ptn,
			no_pln_flg,
			no_itm_info_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			loc_cd,
			str_ln_cd,
			ac_slip_typ,
			ac_rsn_cd,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			mfg_per,
			mfg_cost_ratio,
			expns_cd,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			mfg_act_grp,
			bom_ptn,
			oper_ptn,
			no_pln_flg,
			no_itm_info_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$rec_w1
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w1;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w2;
	IF l_cnt > 0 THEN
		i_purc_cnt := i_purc_cnt + l_cnt;
		INSERT INTO mgt_act_purc_if (
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			sppl_cd,
			po_no,
			slo_no,
			iv_no,
			alc_dpt_cd,
			ac_slip_typ,
			ac_rsn_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			expns_cd,
			alc_loc_cd,
			alc_oper_cd,
			alc_ctg_cd,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			no_pln_flg,
			no_itm_info_flg,
			no_eval_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			sppl_cd,
			po_no,
			slo_no,
			iv_no,
			alc_dpt_cd,
			ac_slip_typ,
			ac_rsn_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			expns_cd,
			alc_loc_cd,
			alc_oper_cd,
			alc_ctg_cd,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			no_pln_flg,
			no_itm_info_flg,
			no_eval_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$rec_w2
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w2;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w3;
	IF l_cnt > 0 THEN
		i_inpt_cnt := i_inpt_cnt + l_cnt;
		INSERT INTO mgt_act_inpt_if (
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			ac_slip_typ,
			ac_rsn_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			rec_eval_typ,
			expns_cd,
			no_pln_flg,
			no_itm_info_flg,
			zero_effect_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			ac_slip_typ,
			ac_rsn_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			rec_eval_typ,
			expns_cd,
			no_pln_flg,
			no_itm_info_flg,
			zero_effect_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$rec_w3
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w3;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w4;
	IF l_cnt > 0 THEN
		i_io_cnt := i_io_cnt + l_cnt;
		INSERT INTO mgt_act_io_if (
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			ac_slip_typ,
			ac_rsn_cd,
			other_wg_cd,
			other_dpt_cd,
			mfg_act_grp,
			bp_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			trd_grp,
			trd_ratio,
			alc_ac_cd,
			alc_amt_flg,
			alc_wg_cd,
			alc_dpt_cd,
			alc_loc_cd,
			alc_oper_cd,
			alc_bp_cd,
			alc_ctg_cd,
			alc_itm_cd,
			alc_itm_sub1,
			alc_itm_sub2,
			alc_itm_sub3,
			alc_lot_no,
			alc_sublot_no,
			alc_sno1,
			alc_sno2,
			alc_sno3,
			alc_sno4,
			alc_itm_mfg_inst_no,
			rec_eval_typ,
			no_pln_flg,
			no_itm_info_flg,
			zero_effect_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			ac_slip_typ,
			ac_rsn_cd,
			other_wg_cd,
			other_dpt_cd,
			mfg_act_grp,
			bp_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			trd_grp,
			trd_ratio,
			alc_ac_cd,
			alc_amt_flg,
			alc_wg_cd,
			alc_dpt_cd,
			alc_loc_cd,
			alc_oper_cd,
			alc_bp_cd,
			alc_ctg_cd,
			alc_itm_cd,
			alc_itm_sub1,
			alc_itm_sub2,
			alc_itm_sub3,
			alc_lot_no,
			alc_sublot_no,
			alc_sno1,
			alc_sno2,
			alc_sno3,
			alc_sno4,
			alc_itm_mfg_inst_no,
			rec_eval_typ,
			no_pln_flg,
			no_itm_info_flg,
			zero_effect_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$rec_w4
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w4;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w5;
	IF l_cnt > 0 THEN
		i_sls_cnt := i_sls_cnt + l_cnt;
		INSERT INTO mgt_act_sls_if (
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			ac_slip_typ,
			ac_rsn_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			cst_cd,
			dlv_cd,
			sls_dpt_cd,
			sls_usr_cd,
			slo_no,
			iv_no,
			stk_bp_cd,
			alc_dpt_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			cost_sls_cd1,
			cost_sls_cd2,
			cost_sls_cd3,
			cost_sls_cd4,
			cost_sls_cd5,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			rec_eval_typ,
			no_pln_flg,
			no_itm_info_flg,
			no_eval_flg,
			zero_effect_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			ac_slip_typ,
			ac_rsn_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			cst_cd,
			dlv_cd,
			sls_dpt_cd,
			sls_usr_cd,
			slo_no,
			iv_no,
			stk_bp_cd,
			alc_dpt_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			cost_sls_cd1,
			cost_sls_cd2,
			cost_sls_cd3,
			cost_sls_cd4,
			cost_sls_cd5,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			rec_eval_typ,
			no_pln_flg,
			no_itm_info_flg,
			no_eval_flg,
			zero_effect_flg,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$rec_w5
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w5;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w6;
	IF l_cnt > 0 THEN
		i_mfg_inst_cnt := i_mfg_inst_cnt + l_cnt;
		DELETE FROM mgt_itm_mfg_inst t
		WHERE EXISTS (
				SELECT 'X' FROM mgpa_ins_scm2mgtif$p_if$rec_w6 w
				WHERE w.calc_ctg_cd = t.calc_ctg_cd
				AND w.itm_cd = t.itm_cd
				AND w.itm_sub1 = t.itm_sub1
				AND w.itm_sub2 = t.itm_sub2
				AND w.itm_sub3 = t.itm_sub3
				AND w.itm_mfg_inst_no = t.itm_mfg_inst_no
				AND w.mfg_act_no = t.mfg_act_no
				)
		;
		INSERT INTO mgt_itm_mfg_inst (
			calc_ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			wg_cd,
			mng_dpt_cd,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			sppl_cd,
			po_no,
			slo_no,
			iv_no,
			asst_typ,
			qty,
			schd_st_dt,
			schd_end_dt,
			act_st_dt,
			act_end_dt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			calc_ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			wg_cd,
			mng_dpt_cd,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			sppl_cd,
			po_no,
			slo_no,
			iv_no,
			asst_typ,
			qty,
			schd_st_dt,
			schd_end_dt,
			act_st_dt,
			act_end_dt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$rec_w6
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w6;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w7;
	IF l_cnt > 0 THEN
		i_inst_oper_cnt := i_inst_oper_cnt + l_cnt;
		DELETE FROM mgt_inst_oper t
		WHERE EXISTS (
				SELECT 'X' FROM mgpa_ins_scm2mgtif$p_if$rec_w7 w
				WHERE w.calc_ctg_cd = t.calc_ctg_cd
				AND w.itm_cd = t.itm_cd
				AND w.itm_sub1 = t.itm_sub1
				AND w.itm_sub2 = t.itm_sub2
				AND w.itm_sub3 = t.itm_sub3
				AND w.itm_mfg_inst_no = t.itm_mfg_inst_no
				AND w.mfg_act_no = t.mfg_act_no
				AND w.oper_act_no = t.oper_act_no
				)
		;
		INSERT INTO mgt_inst_oper (
			calc_ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			wg_cd,
			mng_dpt_cd,
			oper_cd,
			oper_seq,
			disp_seq,
			qty,
			schd_st_dt,
			schd_end_dt,
			act_st_dt,
			act_end_dt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			calc_ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			wg_cd,
			mng_dpt_cd,
			oper_cd,
			oper_seq,
			disp_seq,
			qty,
			schd_st_dt,
			schd_end_dt,
			act_st_dt,
			act_end_dt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$rec_w7
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w7;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$tmp_w3;
	IF l_cnt > 0 THEN
		INSERT INTO mgw_act_inpt_if (
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_lot_no,
			par_sublot_no,
			par_sno1,
			par_sno2,
			par_sno3,
			par_sno4,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			ac_slip_typ,
			ac_rsn_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			rec_eval_typ,
			expns_cd,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_lot_no,
			par_sublot_no,
			par_sno1,
			par_sno2,
			par_sno3,
			par_sno4,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			ac_slip_typ,
			ac_rsn_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			rec_eval_typ,
			expns_cd,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$tmp_w3
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$tmp_w3;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_id;
	IF l_cnt > 0 THEN
		UPDATE mgvt_mst_io_act t
		SET c_imp_flg = c_on
		FROM mgpa_ins_scm2mgtif$p_if$rec_id w
		WHERE t.slip_no = w.slip_no
		AND t.slip_seq_no = w.slip_seq_no
		AND t.send_flg = c_on
		AND t.c_imp_flg = c_off
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_id;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w8;
	IF l_cnt > 0 THEN
		i_inst_wk_cnt := i_inst_wk_cnt + l_cnt;
		INSERT INTO mgt_act_inst_wk_if (
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			no_pln_flg,
			no_itm_info_flg,
			wk_act_no,
			scm_if_flg,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		) SELECT
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			no_pln_flg,
			no_itm_info_flg,
			wk_act_no,
			scm_if_flg,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		FROM mgpa_ins_scm2mgtif$p_if$rec_w8
		;
	END IF;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w8;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_scm2mgtif$p_set_non_move(
	IN i_co_parm mam_co_parm,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	滞留情報の計算
<REMARKS>
	月次受払在庫詳細情報と滞留制御情報から滞留在庫情報を作成する
<ARGUMENTS>
<IN>	i_co_parm
		会社パラメータレコード
<IN>	i_ym
		対象年月
<HISTORY>
*************************************************************************/
DECLARE
	c_off	CONSTANT CHAR(1) := '0' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_gi		CONSTANT VARCHAR := '2' ;	-- 出庫（入出庫区分）
	c_gr		CONSTANT VARCHAR := '1' ;	-- 入庫（入出庫区分）

	c_end_stk	CONSTANT VARCHAR := 'Z0101' ;	-- 月末在庫


	l_cnt INTEGER;
	l_gi_flg CHAR(1) := c_off;
	l_gr_flg CHAR(1) := c_off;
	l_gi_ym TIMESTAMP(0) WITHOUT TIME ZONE;
	l_gr_ym TIMESTAMP(0) WITHOUT TIME ZONE;

	x RECORD;
/************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_set_non_move$rec_i', 'mgt_non_mov_stk', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_set_non_move$rec_d', 'mgw_non_mov_stk_key', 'integer') ;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgc_non_mov_ctl t
	WHERE mgpa_ins_scm2mgtif$f_get_msc_io_act_typ_io_typ(t.io_act_typ) = c_gi
	LIMIT 1;
	IF l_cnt > 0 THEN
		l_gi_flg := c_on;
	END IF;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgc_non_mov_ctl t
	WHERE mgpa_ins_scm2mgtif$f_get_msc_io_act_typ_io_typ(t.io_act_typ) = c_gr
	LIMIT 1;
	IF l_cnt > 0 THEN
		l_gr_flg := c_on;
	END IF;

	IF l_gi_flg = c_off AND l_gr_flg = c_off THEN
		RETURN ;
	END IF ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_SCM2MGTIF.P_SET_NON_MOVE');
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_set_non_move$rec_i;
	TRUNCATE TABLE mgpa_ins_scm2mgtif$p_set_non_move$rec_d;

	FOR x IN
		SELECT DISTINCT
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			CASE i_co_parm.lot_non_mov_flg
				WHEN c_on THEN t.lot_no
				ELSE c_null_val
			END lot_no,
			CASE i_co_parm.sublot_non_mov_flg
				WHEN c_on THEN t.sublot_no
				ELSE c_null_val
			END sublot_no,
			CASE i_co_parm.sno1_non_mov_flg
				WHEN c_on THEN t.sno1
				ELSE c_null_val
			END sno1,
			CASE i_co_parm.sno2_non_mov_flg
				WHEN c_on THEN t.sno2
				ELSE c_null_val
			END sno2,
			CASE i_co_parm.sno3_non_mov_flg
				WHEN c_on THEN t.sno3
				ELSE c_null_val
			END sno3,
			CASE i_co_parm.sno4_non_mov_flg
				WHEN c_on THEN t.sno4
				ELSE c_null_val
			END sno4,
			CASE i_co_parm.wg_non_mov_flg
				WHEN c_on THEN loc.wg_cd
				ELSE c_null_val
			END wg_cd
			FROM mgvt_mst_mly_stk_dtl t
				JOIN mam_loc loc ON (loc.loc_cd = t.loc_cd)
			WHERE 0=0
			AND loc.del_flg = c_off
			AND t.ac_ym = i_ym
			AND t.io_act_typ = c_end_stk
	LOOP
		<<SKIP_GI>>
		BEGIN
			l_gi_ym := NULL;
			l_gr_ym := NULL;

			IF l_gi_flg = c_off THEN
				EXIT SKIP_GI;
			END IF;

			/* 出庫滞留基準年月取得 */
			SELECT MAX(t.ac_ym) INTO STRICT l_gi_ym
			FROM mgvt_mst_mly_stk_dtl t
				JOIN mam_loc loc ON (loc.loc_cd = t.loc_cd)
				JOIN mgc_non_mov_ctl ctl ON (ctl.io_act_typ = t.io_act_typ)
			WHERE 0=0
			AND loc.del_flg = c_off
			AND t.itm_cd = x.itm_cd
			AND t.itm_sub1 = x.itm_sub1
			AND t.itm_sub2 = x.itm_sub2
			AND t.itm_sub3 = x.itm_sub3
			AND (i_co_parm.lot_non_mov_flg = c_off OR t.lot_no = x.lot_no)
			AND (i_co_parm.sublot_non_mov_flg = c_off OR t.sublot_no = x.sublot_no)
			AND (i_co_parm.sno1_non_mov_flg = c_off OR t.sno1 = x.sno1)
			AND (i_co_parm.sno2_non_mov_flg = c_off OR t.sno2 = x.sno2)
			AND (i_co_parm.sno3_non_mov_flg = c_off OR t.sno3 = x.sno3)
			AND (i_co_parm.sno4_non_mov_flg = c_off OR t.sno4 = x.sno4)
			AND (i_co_parm.wg_non_mov_flg = c_off OR loc.wg_cd = x.wg_cd)
			AND t.ac_ym <= i_ym
			AND mgpa_ins_scm2mgtif$f_get_msc_io_act_typ_io_typ(t.io_act_typ) = c_gi;
		END;

		<<SKIP_GR>>
		BEGIN
			IF l_gr_flg = c_off THEN
				EXIT SKIP_GR;
			END IF;

			/* 入庫滞留基準年月取得 */
			SELECT MAX(t.ac_ym) INTO STRICT l_gr_ym
			FROM mgvt_mst_mly_stk_dtl t
				JOIN mam_loc loc ON (loc.loc_cd = t.loc_cd)
				JOIN mgc_non_mov_ctl ctl ON (ctl.io_act_typ = t.io_act_typ)
			WHERE 0=0
			AND loc.del_flg = c_off
			AND t.ac_ym <= i_ym
			AND mgpa_ins_scm2mgtif$f_get_msc_io_act_typ_io_typ(t.io_act_typ) = c_gr
			AND t.itm_cd = x.itm_cd
			AND t.itm_sub1 = x.itm_sub1
			AND t.itm_sub2 = x.itm_sub2
			AND t.itm_sub3 = x.itm_sub3
			AND (i_co_parm.lot_non_mov_flg = c_off OR t.lot_no = x.lot_no)
			AND (i_co_parm.sublot_non_mov_flg = c_off OR t.sublot_no = x.sublot_no)
			AND (i_co_parm.sno1_non_mov_flg = c_off OR t.sno1 = x.sno1)
			AND (i_co_parm.sno2_non_mov_flg = c_off OR t.sno2 = x.sno2)
			AND (i_co_parm.sno3_non_mov_flg = c_off OR t.sno3 = x.sno3)
			AND (i_co_parm.sno4_non_mov_flg = c_off OR t.sno4 = x.sno4)
			AND (i_co_parm.wg_non_mov_flg = c_off OR loc.wg_cd = x.wg_cd)
			AND (SELECT
					COALESCE(SUM(w.base_unit_qty), 0)
				FROM mgvt_mst_mly_stk_dtl w
					JOIN mam_loc w2 ON (w2.loc_cd = w.loc_cd)
				WHERE 0=0
				AND w2.del_flg = c_off
				AND w.ac_ym = fcpa_postgres_util$add_months(t.ac_ym, -1)
				AND w.io_act_typ = c_end_stk
				AND w.itm_cd = t.itm_cd
				AND w.itm_sub1 = t.itm_sub1
				AND w.itm_sub2 = t.itm_sub2
				AND w.itm_sub3 = t.itm_sub3
				AND (i_co_parm.lot_non_mov_flg = c_off OR w.lot_no = x.lot_no)
				AND (i_co_parm.sublot_non_mov_flg = c_off OR w.sublot_no = x.sublot_no)
				AND (i_co_parm.sno1_non_mov_flg = c_off OR w.sno1 = x.sno1)
				AND (i_co_parm.sno2_non_mov_flg = c_off OR w.sno2 = x.sno2)
				AND (i_co_parm.sno3_non_mov_flg = c_off OR w.sno3 = x.sno3)
				AND (i_co_parm.sno4_non_mov_flg = c_off OR w.sno4 = x.sno4)
				AND (i_co_parm.wg_non_mov_flg = c_off OR w2.wg_cd = x.wg_cd)) = 0;
		END;

		CONTINUE WHEN l_gi_ym IS NULL AND l_gr_ym IS NULL;

		INSERT INTO mgpa_ins_scm2mgtif$p_set_non_move$rec_d (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd
		) VALUES (
			x.itm_cd,
			x.itm_sub1,
			x.itm_sub2,
			x.itm_sub3,
			x.lot_no,
			x.sublot_no,
			x.sno1,
			x.sno2,
			x.sno3,
			x.sno4,
			x.wg_cd
		);

		INSERT INTO mgpa_ins_scm2mgtif$p_set_non_move$rec_i (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd,
			calc_ym,
			non_mov_base_ym,
			non_mov_gi_ym,
			non_mov_gr_ym
		) VALUES (
			x.itm_cd,
			x.itm_sub1,
			x.itm_sub2,
			x.itm_sub3,
			x.lot_no,
			x.sublot_no,
			x.sno1,
			x.sno2,
			x.sno3,
			x.sno4,
			x.wg_cd,
			i_ym,
			/* 滞留基準年月判定 */
			CASE WHEN l_gr_ym IS NULL OR l_gi_ym >= l_gr_ym
				THEN l_gi_ym
				ELSE l_gr_ym
			END,
			CASE WHEN l_gr_ym IS NULL OR l_gi_ym >= l_gr_ym
				THEN l_gi_ym
				ELSE NULL
			END,
			CASE WHEN l_gr_ym IS NULL OR l_gi_ym >= l_gr_ym
				THEN NULL
				ELSE l_gr_ym
			END
		);

	END LOOP;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_set_non_move$rec_i;
	IF l_cnt > 0 THEN
		/* 既存滞留在庫情報削除 */
		DELETE FROM mgt_non_mov_stk t
		WHERE EXISTS (
				SELECT 'X' FROM mgpa_ins_scm2mgtif$p_set_non_move$rec_d w
				WHERE w.itm_cd = t.itm_cd
				AND w.itm_sub1 = t.itm_sub1
				AND w.itm_sub2 = t.itm_sub2
				AND w.itm_sub3 = t.itm_sub3
				AND w.lot_no = t.lot_no
				AND w.sublot_no = t.sublot_no
				AND w.sno1 = t.sno1
				AND w.sno2 = t.sno2
				AND w.sno3 = t.sno3
				AND w.sno4 = t.sno4
				AND w.wg_cd = t.wg_cd
				)
		;

		/* 滞留在庫情報作成 */
		INSERT INTO mgt_non_mov_stk (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd,
			calc_ym,
			non_mov_base_ym,
			non_mov_gi_ym,
			non_mov_gr_ym
		) SELECT
			w.itm_cd,
			w.itm_sub1,
			w.itm_sub2,
			w.itm_sub3,
			w.lot_no,
			w.sublot_no,
			w.sno1,
			w.sno2,
			w.sno3,
			w.sno4,
			w.wg_cd,
			w.calc_ym,
			w.non_mov_base_ym,
			w.non_mov_gi_ym,
			w.non_mov_gr_ym
		FROM mgpa_ins_scm2mgtif$p_set_non_move$rec_i w
		;
	END IF;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_SCM2MGTIF.P_SET_NON_MOVE');

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_scm2mgtif$p_if(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_io CHARACTER,
	 IN i_wk CHARACTER,
	 IN i_wip CHARACTER,
	 IN i_stk CHARACTER,
	 IN i_rerun CHARACTER,
	 IN i_non_mov CHARACTER DEFAULT '0')
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	ＳＣＭデータから原価実績インターフェースデータの作成処理を行う
<REMARKS>

<ARGUMENTS>
<IN>	i_ym
		対象年月
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_io
		受払実績 0:実行しない 1:実行する
<IN>	i_wk
		作業実績 0:実行しない 1:実行する
<IN>	i_wip
		仕掛実績 0:実行しない 1:実行する
<IN>	i_stk
		在庫情報 0:実行しない 1:実行する
<IN>	i_rerun
		0:追加処理 1:再取込
<IN>	i_non_mov
		0:滞留在庫計算しない 1:滞留在庫計算する
<HISTORY>
*************************************************************************/
DECLARE
	c_proc_set_up	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COL_PROC_TYP','SET_UP');
	c_tab_itm		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_TABLE_TYP','ITM_MFG_INST');
	c_tab_purc_if	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_TABLE_TYP','ACT_PURC_IF');
	c_tab_sls_if	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_TABLE_TYP','ACT_SLS_IF');

	/* バルクインサートでの最大レコード数 */
	c_max_cnt	CONSTANT INTEGER := 50000;

	c_off	CONSTANT CHAR(1) := '0' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	c_ok		CONSTANT INTEGER := 0 ;
	c_err		CONSTANT INTEGER := 1 ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_str_chk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','CHK_STR_DLM') ;

	c_tgt_po_no		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','PO_NO');
	c_tgt_slo_no	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','SLO_NO');
	c_tgt_iv_no		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TGT_COL_TYP','IV_NO');

	/* 仕入 */
	c_purc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC');
	/* 経費購買 */
	c_purc_xpns	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XPNS');
	/* 未着品入荷 */
	c_arr_in_transit	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ARR_IN_TRANSIT');
	/* 仕入返品 */
	c_purc_ret	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_RET');
	/* 経費返品 */
	c_purc_ret_xpns	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_RET_XPNS');
	/* 仕入値引 */
	c_purc_dscnt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_DSCNT');
	/* 経費値引 */
	c_purc_dscnt_xpns	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_DSCNT_XPNS');
	/* 仕入値増 */
	c_purc_xtra	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XTRA');
	/* 経費値増 */
	c_purc_xtra_xpns	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XTRA_XPNS');
	/* 売上 */
	c_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS');
	/* 売上返品 */
	c_sls_ret	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS_RET');
	/* 売上値引 */
	c_sls_dscnt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS_DSCNT');
	/* 売上値増 */
	c_sls_xtra	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS_XTRA');
	/* 製造 */
	c_mfg	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','MFG');
	/* 副産物製造 */
	c_byprod	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','BYPROD');
	/* 投入 */
	c_input	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INPUT');
	/* 投入(有償) */
	c_in_onr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_ONR');
	/* 投入(自給) */
	c_in_ss	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_SS');
	/* 無償支給 */
	c_ffr_prov	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PROV');
	/* 有償支給 */
	c_onr_prov	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PROV');
	/* 無償支給戻 */
	c_ffr_prvr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PRVR');
	/* 有償支給戻 */
	c_onr_prvr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PRVR');
	/* 検査抜取 */
	c_insp_smpl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INSP_SMPL');
	/* 廃棄 */
	c_disp_scrp	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DISP_SCRP');
	/* 棚卸出庫 */
	c_so_stktk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SO_STKTK');
	/* 棚卸入庫 */
	c_in_stktk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_STKTK');
	/* 販売倉入 */
	c_prod_itm_so	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_SO');
	/* 生産戻入 */
	c_prod_itm_ret_so	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_RET_SO');
	/* 部門間移動 */
	c_dpt_xfr_so	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_SO');
	/* 他勘定出庫 */
	c_oth_ccn_so	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_SO');
	/* 他勘定入庫 */
	c_oth_ccn_gr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_GR');
	/* 在庫振替出庫 */
	c_stk_sw_so	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_SO');
	/* 在庫振替入庫 */
	c_stk_sw_gr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_GR');
	/* 出荷 */
	c_ship	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP');
	/* 出荷返品 */
	c_ship_ret	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP_RET');
	/* 月末在庫(生産) */
	c_eom_stk_prod	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','EOM_STK_PROD');
	/* 月末在庫(販売) */
	c_eom_stk_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','EOM_STK_SLS');

	/* 新規 */
	c_crt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','CRT');
	/* 無効 */
	c_dis	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','DIS');
	/* 取消 */
	c_can	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','CAN');

	c_str_no	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','ITM_MFG_INST_NO_PREFIX');
	c_str_no2	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','ITM_MFG_INST_NO_PREFIX2');
	c_str_no3	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','ITM_MFG_INST_NO_PREFIX3');
	c_str_trd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','TRD_PREFIX2');
	c_str_trd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','TRD_PREFIX3');

	/* 品目製造指図ＮＯ */
	c_itm_mfg_inst	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ITM_MFG_INST');
	c_itm_mfg_inst_length	CONSTANT INTEGER := mgc_num_sys_typ$length(c_itm_mfg_inst);
	/* 製造実績ＩＦデータ行ＮＯ */
	c_act_mfg_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_MFG_IF_DATA_LNO');
	/* 購買実績ＩＦデータ行ＮＯ */
	c_act_purc_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_PURC_IF_DATA_LNO');
	/* 投入実績ＩＦデータ行ＮＯ */
	c_act_inpt_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_INPT_IF_DATA_LNO');
	/* 入出庫実績ＩＦデータ行ＮＯ */
	c_act_io_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_IO_IF_DATA_LNO');
	/* 売上実績ＩＦデータ行ＮＯ */
	c_act_sls_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_SLS_IF_DATA_LNO');
	/* 在庫実績ＩＦデータ行ＮＯ */
	c_act_stk_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_STK_IF_DATA_LNO');
	/* 指図仕掛実績ＩＦデータ行ＮＯ */
	c_act_inst_wip_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_INST_WIP_IF_DATA_LNO');
	/* 指図工数実績ＩＦデータ行ＮＯ */
	c_act_inst_wk_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_INST_WK_IF_DATA_LNO');
	/* 指図外工数実績ＩＦデータ行ＮＯ */
	c_act_other_wk_if_data_lno	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_OTHER_WK_IF_DATA_LNO');
	/* 品目単位 */
	c_itm	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_INST_UNIT_TYP','ITM');
	/* 工程単位 */
	c_oper	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_INST_UNIT_TYP','OPER');
	/* 対象外 */
	c_act1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP','NON');
	/* 設定 */
	c_act2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP','ALL_SET');
	/* 受入のみ設定 */
	c_act3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP','IN_SET');
	/* 生産・販売データで使用する */
	c_ps_use1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP','PRODSLS');
	/* 生産データのみ使用する */
	c_ps_use2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP','PROD');
	/* 販売データのみ使用する */
	c_ps_use3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP','SLS');
	/* 自社(販売) */
	c_asst1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS');
	/* 自社(生産) */
	c_asst2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');
	/* 他社 */
	c_asst3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH');
	/* 自社在庫 */
	c_stk_id1	CONSTANT VARCHAR := '1' ;
	/* 有償支給 */
	c_stk_id8	CONSTANT VARCHAR := '8' ;
	/* 原価管理 */
	c_module_mg	CONSTANT VARCHAR := fcpa_const$get_const_val('FSC_MODULE_ID','CostManagement');
	/* 資産管理する */
	c_asst_mng1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');
	/* 資産管理しない */
	c_asst_mng2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','NOT_MNG');
	/* 架空品 */
	c_asst_mng3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','PHANTOM');

	/* 月末在庫 */
	c_end_stk	CONSTANT VARCHAR := 'Z0101' ;
	/* 納品書ＮＯ */
	c_fix_no_dlv_slip_no CONSTANT VARCHAR := '2' ;
	/* インボイスＮＯ */
	c_fix_no_iv_no CONSTANT VARCHAR := '3' ;
	/* 仕入実績受払ＮＯ */
	c_fix_no_purc_act_io CONSTANT VARCHAR := '6' ;
	/* 売上返品 */
	c_trd_ptn_sls_rtn	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TRD_PTN_TYP','SLS_RTN');
	/* 売上 */
	c_trd_ptn_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TRD_PTN_TYP','SLS');
	/* 未確定 */
	c_unfixed	CONSTANT VARCHAR := '**' ;

	/* 場所 */
	c_inst_loc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ITM_MFG_INST_NO_SET_TYP','LOC');
	/* 設定なし */
	c_mfg_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_ACT_NO_SET_TYP','NON');
	/* 設定なし */
	c_oper_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_OPER_ACT_NO_SET_TYP','NON');
	/* 工程 */
	c_oper_oper	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_OPER_ACT_NO_SET_TYP','OPER');

	c_itm_mfg_inst_no_l	CONSTANT INTEGER := 15;
	c_mfg_act_no_l	CONSTANT INTEGER := 15;

	l_rslt INTEGER;
	l_dpt_err INTEGER;
	l_msg VARCHAR[];
	l_co mam_co%ROWTYPE;
	l_sign INTEGER;
	l_qty mgvt_mst_io_act.base_unit_qty%TYPE;
	l_term TIMESTAMP(0) WITHOUT TIME ZONE;
	l_st_dt TIMESTAMP(0) WITHOUT TIME ZONE;
	l_end_dt TIMESTAMP(0) WITHOUT TIME ZONE;
	l_parm mam_sys_parm.parm_val%TYPE;
	l_rec_dpt mam_dpt[];
	l_data_lno mgt_act_mfg_if.data_lno%TYPE;

	/* 購買部門 */
	l_purc_dpt mam_cost_dpt.dpt_cd%TYPE;
	/* 債務部門 */
	l_ap_dpt mam_cost_dpt.dpt_cd%TYPE;
	/* 売上部門 */
	l_sls_dpt mam_cost_dpt.dpt_cd%TYPE;
	/* 債権部門 */
	l_ar_dpt mam_cost_dpt.dpt_cd%TYPE;
	/* 出庫部門 */
	l_gi_dpt mam_cost_dpt.dpt_cd%TYPE;
	/* 入庫部門 */
	l_gr_dpt mam_cost_dpt.dpt_cd%TYPE;
	/* 負担部門 */
	l_bd_dpt mam_cost_dpt.dpt_cd%TYPE;
	/* 予備部門1 */
	l_sub_dpt1 mam_cost_dpt.dpt_cd%TYPE;
	/* 予備部門2 */
	l_sub_dpt2 mam_cost_dpt.dpt_cd%TYPE;
	/* 予備部門3 */
	l_sub_dpt3 mam_cost_dpt.dpt_cd%TYPE;
	/* 外注製造場所部門ＣＤ */
	l_outsrc_mfg_loc_dpt_cd mam_cost_dpt.dpt_cd%TYPE;
	/* 管理部門 */
	l_mdpt mam_cost_dpt.dpt_cd%TYPE;
	/* 配賦部門、親部門、相手部門、売上部門 */
	l_odpt mam_cost_dpt.dpt_cd%TYPE;
	/* ワーキンググループＣＤ */
	l_wg mam_wg.wg_cd%TYPE;
	/* 相手ワーキンググループＣＤ */
	l_owg mam_wg.wg_cd%TYPE;

	l_loc mam_loc.loc_cd%TYPE;
	l_trd_ratio mgt_act_io_if.trd_ratio%TYPE;
	l_co_parm mam_co_parm%ROWTYPE;
	l_lot_use_typ VARCHAR;
	l_sublot_use_typ VARCHAR;
	l_sno1_use_typ VARCHAR;
	l_sno2_use_typ VARCHAR;
	l_sno3_use_typ VARCHAR;
	l_sno4_use_typ VARCHAR;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE;
	l_trd_flg CHAR(1);
	l_stop_slip_flg CHAR(1);
	l_oper_sum_flg CHAR(1);
	l_non_prod_flg CHAR(1);
	l_non_sls_flg CHAR(1);
	l_asst_flg CHAR(1);
	l_stk_bp_flg CHAR(1);
	l_mfg_zero_flg CHAR(1);
	l_cnt INTEGER;
	l_chk_cnt INTEGER;
	l_chk_err CHAR(1);
	l_tmp_dt TIMESTAMP(0) WITHOUT TIME ZONE;
	l_rec_cnt INTEGER;
	l_inst_wk_row_cnt INTEGER;
	l_other_wk_cnt INTEGER;
	l_stk_cnt INTEGER;
	l_wip_cnt INTEGER;
	l_itm_out_cnt INTEGER;
	l_rsn_gi_cnt INTEGER;
	l_base_cur_cd mam_cur.cur_cd%TYPE;
	l_upri_dec_place mam_cur.upri_dec_place%TYPE;
	l_amt_dec_place mam_cur.amt_dec_place%TYPE;
	l_itm_mfg_inst_no mgvt_mst_io_act.itm_mfg_inst_no%TYPE;
	l_mfg_act_no mgvt_mst_io_act.mfg_act_no%TYPE;
	l_oper_act_no mgvt_mst_io_act.oper_act_no%TYPE;
	l_asst_typ VARCHAR;
	l_tgt_po_no_flg CHAR(1) := c_off;
	l_tgt_slo_flg CHAR(1) := c_off;
	l_tgt_iv_flg CHAR(1) := c_off;
	l_max_ts TIMESTAMP WITHOUT TIME ZONE;

	l_mfg_cnt		INTEGER;
	l_purc_cnt		INTEGER;
	l_inpt_cnt		INTEGER;
	l_io_cnt		INTEGER;
	l_sls_cnt		INTEGER;
	l_inst_wk_cnt	INTEGER;
	l_mfg_inst_cnt	INTEGER;
	l_inst_oper_cnt INTEGER;

	w3 INTEGER;
	w6 INTEGER;
	u6 INTEGER;
	r3 RECORD;
	r6 RECORD;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	x1 RECORD;
	r1 RECORD;
	r2 RECORD;
/************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_w1', 'mgt_act_mfg_if', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_w2', 'mgt_act_purc_if', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_w3', 'mgt_act_inpt_if', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_w4', 'mgt_act_io_if', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_w5', 'mgt_act_sls_if', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_w6', 'mgt_itm_mfg_inst', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_w7', 'mgt_inst_oper', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_w8', 'mgt_act_inst_wk_if', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$tmp_w3', 'mgw_act_inpt_if', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$tmp_w6', 'mgt_itm_mfg_inst', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$upd_w6', 'mgt_itm_mfg_inst', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_id', 'mst_io_act', 'integer') ;

	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_parm_itm', 'mam_if_parm', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_parm_purc_if', 'mam_if_parm', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_scm2mgtif$p_if$rec_parm_sls_if', 'mam_if_parm', 'integer') ;

	CALL fcpa_postgres_util$type_is_table_col('mgpa_ins_scm2mgtif$p_if$rec_chk_itm', 'varchar', 'varchar') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_ins_scm2mgtif$p_if$rec_chk_oper', 'varchar', 'varchar') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_ins_scm2mgtif$p_if$rec_chk_iv', 'varchar', 'varchar') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_ins_scm2mgtif$p_if$rec_chk_iv2', 'varchar', 'varchar') ;

	<<SKIP_TRAN>>
	BEGIN
		<<SKIP_STOP>>
		BEGIN
			/* 処理を開始しました。{1} */
			CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_SCM2MGTIF.P_IF');

			/* 期の取得 */
			l_term := mapa_term$f_get_term_ne(i_ym);

			/* 自社情報の取得 */
			l_co := mapa_co$f_get_co_rec();

			/* 基準通貨情報の取得 */
			CALL mapa_xchng$p_get_base_cur_info(l_base_cur_cd, l_upri_dec_place, l_amt_dec_place);

			/* 月初／月度末日の計算 */
			l_st_dt := mapa_dt$f_get_ym_st_dt_ne(i_ym, l_co.ac_cl_day, l_co.ac_cl_mon_base);
			l_end_dt := mapa_dt$f_get_ym_end_dt_ne(i_ym, l_co.ac_cl_day, l_co.ac_cl_mon_base);

			/* パラメータの取得 */
			l_co_parm := mgpa_co_parm$f_get_rec();
			l_lot_use_typ := COALESCE(l_co_parm.lot_use_typ, c_ps_use1);
			l_sublot_use_typ := COALESCE(l_co_parm.sublot_use_typ, c_ps_use1);
			l_sno1_use_typ := COALESCE(l_co_parm.sno1_use_typ, c_ps_use1);
			l_sno2_use_typ := COALESCE(l_co_parm.sno2_use_typ, c_ps_use1);
			l_sno3_use_typ := COALESCE(l_co_parm.sno3_use_typ, c_ps_use1);
			l_sno4_use_typ := COALESCE(l_co_parm.sno4_use_typ, c_ps_use1);
			l_fix_dpt := l_co_parm.fix_dpt_cd;
			l_trd_flg := l_co_parm.trd_ratio_flg;
			l_stop_slip_flg := l_co_parm.stop_slip_flg;
			l_oper_sum_flg := l_co_parm.oper_sum_flg;
			l_non_prod_flg := l_co_parm.non_prod_flg;
			l_non_sls_flg := l_co_parm.non_sls_flg;
			l_asst_flg := l_co_parm.asst_flg;
			l_stk_bp_flg := l_co_parm.stk_bp_flg;

			l_rslt := c_ok;

			l_mfg_cnt := 0;
			l_purc_cnt := 0;
			l_inpt_cnt := 0;
			l_io_cnt := 0;
			l_sls_cnt := 0;
			l_inst_wk_cnt := 0;
			l_mfg_inst_cnt := 0;
			l_inst_oper_cnt := 0;

			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_chk_itm;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_chk_oper;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_chk_iv;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_chk_iv2;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w1;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w2;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w3;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w4;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w5;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w6;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w7;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w8;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$tmp_w3;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$tmp_w6;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$upd_w6;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_id;

			SELECT COUNT(m.itm_cd)
			INTO STRICT l_itm_out_cnt
			FROM mam_cost_itm_out m
			WHERE 0=0
			AND m.ym <= i_ym;

			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_parm_itm;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_parm_purc_if;
			TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_parm_sls_if;

			FOR r1 IN
				SELECT t.* FROM mam_if_parm t
			LOOP
				IF r1.col_proc_typ <> c_proc_set_up THEN
					CASE r1.cost_table_typ
						WHEN c_tab_itm THEN
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_parm_itm
							(cost_table_typ, tgt_col_typ, col_proc_typ)
							VALUES
							(r1.cost_table_typ, r1.tgt_col_typ, r1.col_proc_typ);
						WHEN c_tab_purc_if THEN
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_parm_purc_if
							(cost_table_typ, tgt_col_typ, col_proc_typ)
							VALUES
							(r1.cost_table_typ, r1.tgt_col_typ, r1.col_proc_typ);
						WHEN c_tab_sls_if THEN
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_parm_sls_if
							(cost_table_typ, tgt_col_typ, col_proc_typ)
							VALUES
							(r1.cost_table_typ, r1.tgt_col_typ, r1.col_proc_typ);
					END CASE;
				END IF;
			END LOOP;
			SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_parm_itm;
			IF l_cnt > 0 THEN
				FOR r1 IN
					SELECT * FROM mgpa_ins_scm2mgtif$p_if$rec_parm_itm
				LOOP
					CASE r1.tgt_col_typ
					WHEN c_tgt_po_no THEN
						l_tgt_po_no_flg := c_on ;
					WHEN c_tgt_slo_no THEN
						l_tgt_slo_flg := c_on ;
					WHEN c_tgt_iv_no THEN
						l_tgt_iv_flg := c_on ;
					END CASE ;
				END LOOP;
			END IF;

			l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP');

			/* 受払情報の取込 */
			IF i_io = c_off THEN
				EXIT SKIP_TRAN;
			END IF;

			CALL fcpa_batch_log$p_proc_log('MGBBD0037', l_log_no, l_log_sub_key1::VARCHAR, l_log_sub_key2::VARCHAR);

			/* ロック後に追加されたレコードは取込対象外にする */
			l_max_ts := NULL;
			BEGIN

				FOR r1 IN
					SELECT t.ins_ts
					FROM mgvt_mst_io_act t
					WHERE 0=0
					AND t.ac_ym = i_ym
					AND t.send_flg = c_on
					AND (t.c_imp_flg = c_off OR i_rerun = c_on)
					ORDER BY t.ins_ts DESC, t.slip_no, t.slip_seq_no
					FOR UPDATE NOWAIT
				LOOP
					l_max_ts := r1.ins_ts;
					EXIT;
				END LOOP;

			EXCEPTION
				WHEN lock_not_available THEN
					CALL fcpa_err$raise_app_err('MGBXD0029');
			END;

			IF i_rerun = c_on THEN
				DELETE FROM mgt_itm_mfg_inst t
				WHERE 0=0
				AND t.itm_mfg_inst_no LIKE CONCAT(c_str_no, '%')
				AND LENGTH(t.itm_mfg_inst_no) = c_itm_mfg_inst_length + LENGTH(c_str_no)
				AND t.mfg_act_no = c_null_val
				AND t.calc_ctg_cd = i_calc_ctg_cd
				AND EXISTS (
						SELECT 'X'
						FROM mgt_act_inpt_if w
						WHERE 0=0
						AND w.par_itm_cd = t.itm_cd
						AND w.par_itm_sub1 = t.itm_sub1
						AND w.par_itm_sub2 = t.itm_sub2
						AND w.par_itm_sub3 = t.itm_sub3
						AND w.itm_mfg_inst_no = t.itm_mfg_inst_no
						AND w.mfg_act_no = t.mfg_act_no
						AND w.calc_ctg_cd = t.calc_ctg_cd
						AND w.ym = i_ym
						)
				;

				DELETE FROM mgt_itm_mfg_inst t
				WHERE 0=0
				AND t.mfg_act_no LIKE CONCAT(c_str_no, '%')
				AND LENGTH(t.mfg_act_no) = c_itm_mfg_inst_length + LENGTH(c_str_no)
				AND t.calc_ctg_cd = i_calc_ctg_cd
				AND EXISTS (
						SELECT 'X'
						FROM mgt_act_mfg_if w
						WHERE 0=0
						AND w.itm_cd = t.itm_cd
						AND w.itm_sub1 = t.itm_sub1
						AND w.itm_sub2 = t.itm_sub2
						AND w.itm_sub3 = t.itm_sub3
						AND w.itm_mfg_inst_no = t.itm_mfg_inst_no
						AND w.mfg_act_no = t.mfg_act_no
						AND w.calc_ctg_cd = t.calc_ctg_cd
						AND w.ym = i_ym
						)
				;

				DELETE FROM mgt_act_mfg_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd;
				DELETE FROM mgt_act_purc_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd;
				DELETE FROM mgt_act_inpt_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd;
				DELETE FROM mgt_act_io_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd;
				DELETE FROM mgt_act_sls_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd;

				UPDATE mgvt_mst_io_act t
				SET c_imp_flg = c_off
				WHERE 0=0
				AND t.ac_ym = i_ym
				AND t.send_flg = c_on
				AND t.c_imp_flg = c_on
				AND t.ins_ts <= l_max_ts
				;

			END IF;

			SELECT COUNT(m.ac_rsn_cd)
			INTO STRICT l_rsn_gi_cnt
			FROM mam_ac_rsn m
			WHERE 0=0
			AND m.cost_invalid_flg = c_on
			;

			IF l_stop_slip_flg = c_on THEN
				EXIT SKIP_STOP;
			END IF;

			UPDATE mgvt_mst_io_act t1
			SET c_imp_flg = c_on
			WHERE 0=0
			AND t1.ac_ym = i_ym
			AND t1.send_flg = c_on
			AND t1.c_imp_flg = c_off
			AND t1.ins_ts <= l_max_ts
			AND EXISTS (
					SELECT 'X'
					FROM mgvt_mst_io_act t2
					WHERE 0=0
					AND t2.slip_no = t1.slip_no
					AND t2.slip_rev_no = t1.slip_rev_no
					AND t2.ac_ym = i_ym
					AND t2.send_flg = c_on
					AND t2.c_imp_flg = c_off
					AND t2.ins_ts <= l_max_ts
					AND t2.slip_sts_typ = c_dis
					)
			AND EXISTS (
					SELECT 'X'
					FROM mgvt_mst_io_act t2
					WHERE 0=0
					AND t2.slip_no = t1.slip_no
					AND t2.slip_rev_no = t1.slip_rev_no
					AND t2.ac_ym = i_ym
					AND t2.send_flg = c_on
					AND t2.c_imp_flg = c_off
					AND t2.ins_ts <= l_max_ts
					AND t2.slip_sts_typ = c_can
					)
			;
		END;

		IF l_co_parm.non_transit_flg = c_on THEN
			UPDATE mgvt_mst_io_act t1
			SET c_imp_flg = c_on
			WHERE 0=0
			AND t1.ac_ym = i_ym
			AND t1.send_flg = c_on
			AND t1.c_imp_flg = c_off
			AND t1.ins_ts <= l_max_ts
			AND t1.ac_slip_typ = c_purc AND t1.fix_no_typ = c_fix_no_purc_act_io
			AND (t1.itm_mfg_inst_no IS NULL OR t1.asset_mng_typ <> c_asst_mng1);
		END IF ;

		l_rec_cnt := 0;
		l_tmp_dt := NULL;
		l_rec_dpt := '{}';

		FOR x1 IN
			SELECT
				t.slip_no,
				t.slip_seq_no,
				t.ac_ym,
 				DATE_TRUNC('DAY', t.ac_dt) ac_dt,
				t.ac_slip_typ,
				t.ac_rsn_cd,
				t.gi_wg_cd,
				t.gr_wg_cd,
				t.bd_wg_cd,
				m6.wg_cd	purc_wg_cd,
				t.purc_typ,
				t.purc_dpt_cd,	--購買部門
				t.ap_dpt_cd,	--債務部門
				t.sls_dpt_cd,	--売上部門
				t.ar_dpt_cd,	--債権部門
				t.gi_dpt_cd,	--出庫部門
				t.gr_dpt_cd,	--入庫部門
				t.bd_dpt_cd,	--負担部門
				t.sub_dpt_cd1,	--予備部門1
				t.sub_dpt_cd2,	--予備部門2
				t.sub_dpt_cd3,	--予備部門3
				t.loc_cd,
				t.str_ln_cd,
				t.sls_usr_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.lot_no,
				t.sublot_no,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.fix_no_typ,
				t.asst_typ,
				t.stk_id_typ,
				t.base_unit_qty	qty,
				t.base_cur_amt	amt,
				t.trd_cur_cd,
				t.trd_cur_amt,
				t.xrate,
				t.slo_no,
				t.po_no,
				t.iv_no,
				t.rcpt_iv_no,
				t.bd_ctg_cd,
				t.bd_bp_cd,
				t.bd_oper_cd,
				t.bd_loc_cd,
				t.bd_slo_no,
				t.bd_po_no,
				t.bd_iv_no,
				t.dlv_cd,
				COALESCE(t.cst_cd, t.acst_cd)	cst_cd,
				t.dest_cd1,
				t.dest_cd2,
				t.dest_cd3,
				COALESCE(t.sppl_cd, t.asppl_cd)	bp_cd,
				t.itm_mfg_inst_no,
				t.itm_inst_qty,
				t.mfg_st_qty,
				t.mfg_act_no,
				t.oper_act_no,
				t.disp_seq,
				t.oper_cd,
				t.outsrc_mfg_loc_cd,
				t.outsrc_mfg_loc_dpt_cd,
				t.outsrc_mfg_loc_wg_cd,
				t.mfg_inst_unit_typ,
				t.par_itm_cd,
				t.par_itm_sub1,
				t.par_itm_sub2,
				t.par_itm_sub3,
				t.par_lot_no,
				t.par_sublot_no,
				t.par_sno1,
				t.par_sno2,
				t.par_sno3,
				t.par_sno4,
				t.act_no,
				COALESCE(t.yield_rate, 100)	yield_rate,
				t.trd_rmrks,
				t.trd_d_rmrks,
				t.trd_ptn_typ,
				COALESCE(m1.asset_mng_typ, c_asst1)	asset_mng_typ,
				COALESCE(m1.del_flg, c_on)			del_flg,
				COALESCE(m1.dscnt_itm_flg, c_off)	dscnt_itm_flg,
				COALESCE(m2.lot_act_typ, c_act1)	lot_act_typ,
				COALESCE(m2.sublot_act_typ, c_act1)	sublot_act_typ,
				COALESCE(m2.sno1_act_typ, c_act1)	sno1_act_typ,
				COALESCE(m2.sno2_act_typ, c_act1)	sno2_act_typ,
				COALESCE(m2.sno3_act_typ, c_act1)	sno3_act_typ,
				COALESCE(m2.sno4_act_typ, c_act1)	sno4_act_typ,
				CASE WHEN t.par_itm_cd IS NULL
					THEN m2.itm_mfg_inst_no_set_typ
					ELSE m4.itm_mfg_inst_no_set_typ
				END itm_mfg_inst_no_set_typ,
				CASE WHEN t.par_itm_cd IS NULL
					THEN m2.mfg_act_no_set_typ
					ELSE m4.mfg_act_no_set_typ
				END mfg_act_no_set_typ,
				CASE WHEN t.par_itm_cd IS NULL
					THEN m2.oper_act_no_set_typ
					ELSE m4.oper_act_no_set_typ
				END oper_act_no_set_typ,
				COALESCE(m3.asset_mng_typ, c_asst1)	par_asset_mng_typ,
				COALESCE(m3.del_flg, c_on)			par_del_flg,
				COALESCE(m4.lot_act_typ, c_act1)	par_lot_act_typ,
				COALESCE(m4.sublot_act_typ, c_act1)	par_sublot_act_typ,
				COALESCE(m4.sno1_act_typ, c_act1)	par_sno1_act_typ,
				COALESCE(m4.sno2_act_typ, c_act1)	par_sno2_act_typ,
				COALESCE(m4.sno3_act_typ, c_act1)	par_sno3_act_typ,
				COALESCE(m4.sno4_act_typ, c_act1)	par_sno4_act_typ,
				COALESCE(m5.dlv_flg, c_off)			dlv_flg,
				COALESCE(m5.tdlv_flg, c_on)			tdlv_flg
			FROM mgvt_mst_io_act t
				LEFT OUTER JOIN mam_itm_srch m1 ON (
					m1.itm_cd = t.itm_cd
					AND m1.itm_sub1 = t.itm_sub1
					AND m1.itm_sub2 = t.itm_sub2
					AND m1.itm_sub3 = t.itm_sub3
					AND m1.del_flg = c_off
					AND m1.release_flg = c_on)
				LEFT OUTER JOIN mam_calc_ptn m2 ON (m2.calc_ptn_cd = m1.calc_ptn_cd)
				LEFT OUTER JOIN mam_itm_srch m3 ON (
					m3.itm_cd = t.par_itm_cd
					AND m3.itm_sub1 = t.par_itm_sub1
					AND m3.itm_sub2 = t.par_itm_sub2
					AND m3.itm_sub3 = t.par_itm_sub3
					AND m3.del_flg = c_off
					AND m3.release_flg = c_on)
				LEFT OUTER JOIN mam_calc_ptn m4 ON (m4.calc_ptn_cd = m3.calc_ptn_cd)
				LEFT OUTER JOIN mam_bp m5 ON (m5.bp_cd = t.dlv_cd)
				LEFT OUTER JOIN mam_dpt m6 ON (
					m6.dpt_cd = t.purc_dpt_cd
					AND m6.st_dt <= t.ac_dt
					AND m6.end_dt >= t.ac_dt
					AND m6.del_flg = c_off)
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.send_flg = c_on
			AND t.c_imp_flg = c_off
			AND t.ins_ts <= l_max_ts
			ORDER BY t.ac_dt DESC, t.slip_no DESC, t.slip_seq_no DESC
		LOOP

			<<SKIP_ERR>>
			BEGIN

				<<NEXT_LOOP_ERR>>
				BEGIN

					<<NEXT_LOOP>>
					BEGIN

						l_dpt_err := c_ok ;

						l_mdpt := null ;
						l_odpt := null ;
						l_wg := null ;
						l_owg := null ;
						l_loc := null ;
						l_mfg_zero_flg := c_off ;

						IF x1.qty = 0 AND (x1.amt = 0 OR x1.amt IS NULL) THEN
							IF x1.ac_slip_typ = c_mfg THEN
								l_mfg_zero_flg := c_on ;
							ELSE
								EXIT NEXT_LOOP;
							END IF ;
						END IF ;

						--有償支給・有償支給戻・投入(有償)・投入(自給)以外で資産区分=1,2以外は対象外
						IF x1.ac_slip_typ IN (c_onr_prov, c_onr_prvr, c_in_onr, c_in_ss) THEN
							NULL ;
						ELSIF x1.asst_typ <> c_asst1 AND x1.asst_typ <> c_asst2 THEN
							--外注先の他社資産の受払は対象とする
							IF x1.asst_typ = c_asst3 AND x1.bp_cd IS NOT NULL THEN
								NULL ;
							ELSE
								EXIT NEXT_LOOP;
							END IF ;
						END IF ;

						IF l_itm_out_cnt > 0 THEN
							--原価対象外のチェック
							SELECT COUNT(m.itm_cd) INTO STRICT l_cnt
							FROM mam_cost_itm_out m
							WHERE 0=0
							AND m.itm_cd = x1.itm_cd
							AND m.itm_sub1 = x1.itm_sub1
							AND m.itm_sub2 = x1.itm_sub2
							AND m.itm_sub3 = x1.itm_sub3
							AND m.ym <= i_ym;

							IF l_cnt > 0 THEN
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.par_itm_cd IS NOT NULL THEN
								SELECT COUNT(m.itm_cd) INTO STRICT l_cnt
								FROM mam_cost_itm_out m
								WHERE 0=0
								AND m.itm_cd = x1.par_itm_cd
								AND m.itm_sub1 = x1.par_itm_sub1
								AND m.itm_sub2 = x1.par_itm_sub2
								AND m.itm_sub3 = x1.par_itm_sub3
								AND m.ym <= i_ym;

								IF l_cnt > 0 THEN
									--原価対象外品目マスタに親品目が登録されています。取込対象外となるため子品目の払い出しも無効になります。
									--テーブル：{1} 親品目：{2} 品目：{3}
									CALL fcpa_batch_log$p_data_log('MGBBD0046', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MST_IO_ACT',
										mapa_comm$f_to_disp_itm(x1.par_itm_cd, x1.par_itm_sub1, x1.par_itm_sub2, x1.par_itm_sub3, l_parm),
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm));
									l_rslt := c_err;
									EXIT NEXT_LOOP;
								END IF ;
							END IF ;
						END IF ;

						IF l_rsn_gi_cnt > 0 AND x1.ac_rsn_cd IS NOT NULL THEN
							--原価対象外のチェック
							SELECT COUNT(m.ac_rsn_cd) INTO STRICT l_cnt
							FROM mam_ac_rsn m
							WHERE 0=0
							AND m.ac_rsn_cd = x1.ac_rsn_cd
							AND m.cost_invalid_flg = c_on
							;

							IF l_cnt > 0 THEN
								EXIT NEXT_LOOP;
							END IF ;
						END IF ;

						IF x1.del_flg = c_on THEN
							--品目マスタに登録されていません。テーブル：{1} 品目：{2}
							CALL fcpa_batch_log$p_data_log('MGBBD0011', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MST_IO_ACT',
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm)) ;
							l_rslt := c_err;
							EXIT NEXT_LOOP;
						END IF ;
						IF x1.par_itm_cd IS NOT NULL AND (x1.par_del_flg = c_on) THEN
							--親品目が品目マスタに登録されていません。取込対象外となるため子品目の払い出しも無効になります。
							--テーブル：{1} 親品目：{2} 品目：{3}
							CALL fcpa_batch_log$p_data_log('MGBBD0047', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MST_IO_ACT',
										mapa_comm$f_to_disp_itm(x1.par_itm_cd, x1.par_itm_sub1, x1.par_itm_sub2, x1.par_itm_sub3, l_parm),
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm)) ;
							l_rslt := c_err;
							EXIT NEXT_LOOP;
						END IF ;

						--部門の変換
						IF l_tmp_dt IS NULL OR l_tmp_dt <> x1.ac_dt THEN
							l_rec_dpt := '{}';
							l_tmp_dt := x1.ac_dt ;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.purc_dpt_cd, NULL, x1.ac_dt, l_rec_dpt, l_purc_dpt, c_on) ;
						IF x1.purc_dpt_cd IS NOT NULL AND l_purc_dpt IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.ap_dpt_cd, NULL, x1.ac_dt, l_rec_dpt, l_ap_dpt, c_on) ;
						IF x1.ap_dpt_cd IS NOT NULL AND l_ap_dpt IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.sls_dpt_cd, NULL, x1.ac_dt, l_rec_dpt, l_sls_dpt, c_on) ;
						IF x1.sls_dpt_cd IS NOT NULL AND l_sls_dpt IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.ar_dpt_cd, NULL, x1.ac_dt, l_rec_dpt, l_ar_dpt, c_on) ;
						IF x1.ar_dpt_cd IS NOT NULL AND l_ar_dpt IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.gi_dpt_cd, NULL, x1.ac_dt, l_rec_dpt, l_gi_dpt, c_on) ;
						IF x1.gi_dpt_cd IS NOT NULL AND l_gi_dpt IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.gr_dpt_cd, NULL, x1.ac_dt, l_rec_dpt, l_gr_dpt, c_on) ;
						IF x1.gr_dpt_cd IS NOT NULL AND l_gr_dpt IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.bd_dpt_cd, NULL, x1.ac_dt, l_rec_dpt, l_bd_dpt, c_on) ;
						IF x1.bd_dpt_cd IS NOT NULL AND l_bd_dpt IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.sub_dpt_cd1, NULL, x1.ac_dt, l_rec_dpt, l_sub_dpt1, c_on) ;
						IF x1.sub_dpt_cd1 IS NOT NULL AND l_sub_dpt1 IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.sub_dpt_cd2, NULL, x1.ac_dt, l_rec_dpt, l_sub_dpt2, c_on) ;
						IF x1.sub_dpt_cd2 IS NOT NULL AND l_sub_dpt2 IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.sub_dpt_cd3, NULL, x1.ac_dt, l_rec_dpt, l_sub_dpt3, c_on) ;
						IF x1.sub_dpt_cd3 IS NOT NULL AND l_sub_dpt3 IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						CALL mgpa_cost_if$p_get_dpt(x1.outsrc_mfg_loc_dpt_cd, NULL, x1.ac_dt, l_rec_dpt, l_outsrc_mfg_loc_dpt_cd, c_on) ;
						IF x1.outsrc_mfg_loc_dpt_cd IS NOT NULL AND l_outsrc_mfg_loc_dpt_cd IS NULL THEN
							EXIT NEXT_LOOP_ERR;
						END IF ;

						--数量の設定 値引・値増関連は数量を0とする
						IF x1.ac_slip_typ IN (c_purc_dscnt, c_purc_dscnt_xpns, c_purc_xtra, c_purc_xtra_xpns, c_sls_dscnt, c_sls_xtra) THEN
							l_qty := 0 ;
						ELSE
							l_qty := x1.qty ;
						END IF ;
						--数量の設定２ 値引品目かつ経費購買、経費返品、売上、売上返品は数量を0とする
						IF x1.dscnt_itm_flg = c_on AND x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_sls, c_sls_ret) THEN
							l_qty := 0 ;
						END IF ;

						--販売資産を生産資産として取込む
						IF l_asst_flg = c_on THEN
							IF x1.asst_typ = c_asst3 THEN
								l_asst_typ := c_asst3 ;
							ELSE
								l_asst_typ := c_asst2 ;
							END IF ;
						ELSE
							l_asst_typ := x1.asst_typ ;
						END IF ;

						-- 製造指図単位区分
						IF x1.mfg_inst_unit_typ = c_oper THEN
							x1.mfg_act_no := c_null_val ;
						END IF ;

						-- 品目製造指図ＮＯ設定区分
						IF x1.itm_mfg_inst_no_set_typ = c_inst_loc AND
							(x1.itm_mfg_inst_no IS NOT NULL
							OR x1.ac_slip_typ IN (
								c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns,				--経費
								c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr	--入出庫
								) AND x1.par_itm_cd IS NOT NULL AND COALESCE(x1.bd_loc_cd, x1.loc_cd) IS NOT NULL
							)
						THEN
							x1.itm_mfg_inst_no := CONCAT(c_str_no3, fcpa_postgres_util$substr(COALESCE(x1.outsrc_mfg_loc_cd, x1.loc_cd), 1, c_itm_mfg_inst_no_l-LENGTH(c_str_no3))) ;
							x1.itm_inst_qty := 0 ;
							x1.mfg_st_qty := 0 ;
						END IF ;

						-- 製造実績ＮＯ設定区分
						IF x1.mfg_act_no_set_typ = c_mfg_non THEN
							IF x1.itm_mfg_inst_no_set_typ = c_inst_loc AND x1.itm_mfg_inst_no IS NOT NULL THEN
								x1.mfg_act_no := COALESCE(fcpa_postgres_util$substr(COALESCE(x1.outsrc_mfg_loc_cd, x1.loc_cd), c_itm_mfg_inst_no_l-LENGTH(c_str_no3)+1, c_mfg_act_no_l), c_null_val) ;
							ELSE
								x1.mfg_act_no := c_null_val ;
							END IF ;
							x1.itm_inst_qty := 0 ;
							x1.mfg_st_qty := 0 ;
						END IF ;

						-- 工程実績ＮＯ設定区分
						IF x1.oper_act_no_set_typ = c_oper_non THEN
							x1.oper_act_no := c_null_val ;
						ELSIF x1.oper_act_no_set_typ = c_oper_oper THEN
							x1.oper_act_no := x1.oper_cd ;
						ELSIF l_oper_sum_flg = c_on THEN
							x1.oper_act_no := COALESCE(x1.oper_cd, c_null_val);
						END IF ;

						--製造実績関連の取込
						IF x1.ac_slip_typ = c_mfg
						OR x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra) AND x1.itm_mfg_inst_no IS NOT NULL AND x1.asset_mng_typ = c_asst_mng1 --外注
						THEN
							IF l_non_prod_flg = c_on THEN
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.asset_mng_typ <> c_asst_mng1 THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0044', l_log_no, l_log_sub_key1, l_log_sub_key2,
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm), x1.ac_slip_typ) ;
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ = c_mfg THEN
								--製造は入庫部門を管理部門とする
								l_mdpt := l_gr_dpt ;
								l_wg := x1.gr_wg_cd ;
							ELSE
								--外注先場所を使用する
								x1.loc_cd	:= x1.outsrc_mfg_loc_cd ;
								x1.str_ln_cd	:= c_null_val ;

								--外注先場所に対する部門を管理部門とする
								l_mdpt := l_outsrc_mfg_loc_dpt_cd ;
								l_wg := x1.outsrc_mfg_loc_wg_cd ;

								IF x1.ac_slip_typ = c_purc THEN
									IF x1.fix_no_typ = c_fix_no_purc_act_io THEN
										--未着品の仕入は外注先場所に対する部門を設定する
										l_odpt := l_outsrc_mfg_loc_dpt_cd ;
										l_owg := x1.outsrc_mfg_loc_wg_cd ;

										--仕掛があるので在庫を作らない
										l_qty := 0 ;
									ELSE
										--入庫場所に対する部門を設定する
										l_odpt := l_gr_dpt ;
										l_owg := x1.gr_wg_cd ;
									END IF ;
								ELSIF x1.ac_slip_typ = c_arr_in_transit THEN
									--入庫場所に対する部門を設定する
									l_odpt := l_gr_dpt ;
									l_owg := x1.gr_wg_cd ;
								ELSIF x1.ac_slip_typ = c_purc_ret THEN
									--出庫場所に対する部門を設定する
									l_odpt := l_gi_dpt ;
									l_owg := x1.gi_wg_cd ;
								END IF ;
							END IF ;

							IF l_wg IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0018', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							IF l_mdpt IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0017', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ IN (c_purc_ret, c_purc_dscnt) THEN
								--符号を反転させる
								l_sign := -1 ;
							ELSE
								--符号はそのまま
								l_sign := 1 ;
							END IF ;

							<<MFG_ZERO>>
							BEGIN

								IF l_mfg_zero_flg = c_on THEN
									EXIT MFG_ZERO ;
								END IF ;

								IF x1.ac_slip_typ IN (c_purc, c_purc_ret, c_arr_in_transit)
								AND (l_fix_dpt IS NULL AND l_mdpt <> l_odpt OR l_wg <> l_owg)
								AND l_qty <> 0 THEN
									--外注で出庫ＷＧと入庫ＷＧもしくは出庫部門と入庫部門が異なるときは入出庫実績を作成する
									IF l_owg IS NULL THEN
										CALL fcpa_batch_log$p_data_log('MGBBD0018', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
										l_dpt_err := c_err ;
										EXIT NEXT_LOOP;
									END IF ;

									IF l_odpt IS NULL THEN
										CALL fcpa_batch_log$p_data_log('MGBBD0017', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
										l_dpt_err := c_err ;
										EXIT NEXT_LOOP;
									END IF ;

									SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w4;
									l_cnt := l_cnt + 1;
									l_data_lno := mapa_num$f_get_seq(c_act_io_if_data_lno);
									INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w4 (
										_index_,
										data_lno,
										calc_ctg_cd,
										wg_cd,
										ym,
										ac_dt,
										mng_dpt_cd,
										itm_cd,
										itm_sub1,
										itm_sub2,
										itm_sub3,
										lot_no,
										sublot_no,
										sno1,
										sno2,
										sno3,
										sno4,
										ac_slip_typ,
										ac_rsn_cd,
										other_wg_cd,
										other_dpt_cd,
										bp_cd,
										stk_bp_cd,
										asst_typ,
										qty,
										amt,
										trd_cur_cd,
										trd_cur_amt,
										xrate,
										trd_grp,
										trd_ratio,
										alc_ac_cd,
										alc_amt_flg,
										alc_wg_cd,
										alc_dpt_cd,
										alc_loc_cd,
										alc_oper_cd,
										alc_bp_cd,
										alc_ctg_cd,
										alc_itm_cd,
										alc_itm_sub1,
										alc_itm_sub2,
										alc_itm_sub3,
										alc_lot_no,
										alc_sublot_no,
										alc_sno1,
										alc_sno2,
										alc_sno3,
										alc_sno4,
										alc_itm_mfg_inst_no,
										rec_eval_typ,
										no_pln_flg,
										no_itm_info_flg,
										zero_effect_flg,
										slip_no,
										slip_seq_no,
										rmrks,
										sub_char1,
										sub_char2,
										sub_char3
									) VALUES (
										l_cnt,
										l_data_lno,
										i_calc_ctg_cd,
										l_wg,
										x1.ac_ym,
										x1.ac_dt,
										l_mdpt,
										x1.itm_cd,
										x1.itm_sub1,
										x1.itm_sub2,
										x1.itm_sub3,
										CASE WHEN l_lot_use_typ <> c_ps_use3 AND x1.lot_act_typ = c_act2
											THEN x1.lot_no
											ELSE c_null_val
										END,
										CASE WHEN l_sublot_use_typ <> c_ps_use3 AND x1.sublot_act_typ = c_act2
											THEN x1.sublot_no
											ELSE c_null_val
										END,
										CASE WHEN l_sno1_use_typ <> c_ps_use3 AND x1.sno1_act_typ = c_act2
											THEN x1.sno1
											ELSE c_null_val
										END,
										CASE WHEN l_sno2_use_typ <> c_ps_use3 AND x1.sno2_act_typ = c_act2
											THEN x1.sno2
											ELSE c_null_val
										END,
										CASE WHEN l_sno3_use_typ <> c_ps_use3 AND x1.sno3_act_typ = c_act2
											THEN x1.sno3
											ELSE c_null_val
										END,
										CASE WHEN l_sno4_use_typ <> c_ps_use3 AND x1.sno4_act_typ = c_act2
											THEN x1.sno4
											ELSE c_null_val
										END,
										c_dpt_xfr_so,
										x1.ac_rsn_cd,
										CASE WHEN l_wg = l_owg
											THEN NULL
											ELSE l_owg
										END,
										l_odpt,
										NULL,
										NULL,
										c_asst2,
										l_qty * l_sign,
										NULL,
										NULL,
										NULL,
										NULL,
										CONCAT(c_str_trd3, l_data_lno::VARCHAR),
										NULL,
										NULL,
										c_off,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										NULL,
										c_off,
										c_off,
										c_off,
										x1.slip_no,
										x1.slip_seq_no,
										x1.trd_d_rmrks,
										NULL,
										NULL,
										NULL
										)
									;
								END IF ;

								SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w1;
								l_cnt := l_cnt + 1;
								l_data_lno := mapa_num$f_get_seq(c_act_mfg_if_data_lno);
								INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w1 (
									_index_,
									data_lno,
									calc_ctg_cd,
									wg_cd,
									ym,
									ac_dt,
									itm_cd,
									itm_sub1,
									itm_sub2,
									itm_sub3,
									itm_mfg_inst_no,
									mfg_act_no,
									oper_act_no,
									lot_no,
									sublot_no,
									sno1,
									sno2,
									sno3,
									sno4,
									loc_cd,
									str_ln_cd,
									ac_slip_typ,
									ac_rsn_cd,
									qty,
									amt,
									trd_cur_cd,
									trd_cur_amt,
									xrate,
									mfg_per,
									mfg_cost_ratio,
									expns_cd,
									alc_val1,
									alc_val2,
									alc_val3,
									alc_val4,
									alc_val5,
									no_pln_flg,
									no_itm_info_flg,
									slip_no,
									slip_seq_no,
									rmrks,
									sub_char1,
									sub_char2,
									sub_char3
								) VALUES (
									l_cnt,
									mapa_num$f_get_seq(c_act_mfg_if_data_lno),
									i_calc_ctg_cd,
									l_wg,
									x1.ac_ym,
									x1.ac_dt,
									x1.itm_cd,
									x1.itm_sub1,
									x1.itm_sub2,
									x1.itm_sub3,
									x1.itm_mfg_inst_no,
									COALESCE(x1.mfg_act_no, c_null_val),
									COALESCE(x1.oper_act_no, c_null_val),
									CASE WHEN l_lot_use_typ <> c_ps_use3 AND x1.lot_act_typ <> c_act1
										THEN x1.lot_no
										ELSE c_null_val
									END,
									CASE WHEN l_sublot_use_typ <> c_ps_use3 AND x1.sublot_act_typ <> c_act1
										THEN x1.sublot_no
										ELSE c_null_val
									END,
									CASE WHEN l_sno1_use_typ <> c_ps_use3 AND x1.sno1_act_typ <> c_act1
										THEN x1.sno1
										ELSE c_null_val
									END,
									CASE WHEN l_sno2_use_typ <> c_ps_use3 AND x1.sno2_act_typ <> c_act1
										THEN x1.sno2
										ELSE c_null_val
									END,
									CASE WHEN l_sno3_use_typ <> c_ps_use3 AND x1.sno3_act_typ <> c_act1
										THEN x1.sno3
										ELSE c_null_val
									END,
									CASE WHEN l_sno4_use_typ <> c_ps_use3 AND x1.sno4_act_typ <> c_act1
										THEN x1.sno4
										ELSE c_null_val
									END,
									x1.loc_cd,
									COALESCE(x1.str_ln_cd, c_null_val),
									x1.ac_slip_typ,
									x1.ac_rsn_cd,
									l_qty * l_sign,
									CASE WHEN x1.bp_cd IS NOT NULL
										THEN x1.amt * l_sign
										ELSE NULL
									END,
									CASE WHEN x1.bp_cd IS NOT NULL
										THEN x1.trd_cur_cd
										ELSE NULL
									END,
									CASE WHEN x1.bp_cd IS NOT NULL
										THEN x1.trd_cur_amt * l_sign
										ELSE NULL
									END,
									CASE WHEN x1.bp_cd IS NOT NULL
										THEN x1.xrate
										ELSE NULL
									END,
									x1.yield_rate,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									c_off,
									c_off,
									x1.slip_no,
									x1.slip_seq_no,
									x1.trd_d_rmrks,
									NULL,
									NULL,
									NULL
									)
								;

								--未着品の入荷では仕入に対する赤伝と入荷の黒伝を作成する
								IF x1.ac_slip_typ = c_arr_in_transit THEN
									INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w1 (
										_index_,
										data_lno,
 										calc_ctg_cd,wg_cd,ym,ac_dt,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no,oper_act_no,
										lot_no,sublot_no,sno1,sno2,sno3,sno4,loc_cd,str_ln_cd,ac_slip_typ,ac_rsn_cd,qty,amt,trd_cur_cd,
										trd_cur_amt,xrate,mfg_per,mfg_cost_ratio,expns_cd,alc_val1,alc_val2,alc_val3,alc_val4,alc_val5,
										no_pln_flg,no_itm_info_flg,slip_no,slip_seq_no,rmrks,sub_char1,sub_char2,sub_char3
									) SELECT 
										l_cnt + 1,
										mapa_num$f_get_seq(c_act_mfg_if_data_lno),
 										calc_ctg_cd,wg_cd,ym,ac_dt,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no,oper_act_no,
										lot_no,sublot_no,sno1,sno2,sno3,sno4,loc_cd,str_ln_cd,ac_slip_typ,ac_rsn_cd,qty,amt,trd_cur_cd,
										trd_cur_amt,xrate,mfg_per,mfg_cost_ratio,expns_cd,alc_val1,alc_val2,alc_val3,alc_val4,alc_val5,
										no_pln_flg,no_itm_info_flg,slip_no,slip_seq_no,rmrks,sub_char1,sub_char2,sub_char3
									FROM mgpa_ins_scm2mgtif$p_if$rec_w1
									WHERE _index_ = l_cnt
									;

									UPDATE mgpa_ins_scm2mgtif$p_if$rec_w1 w SET
										lot_no =
											CASE WHEN l_lot_use_typ <> c_ps_use3 AND x1.lot_act_typ <> c_act1
												THEN c_unfixed
												ELSE c_null_val
											END,
										sublot_no =
											CASE WHEN l_sublot_use_typ <> c_ps_use3 AND x1.sublot_act_typ <> c_act1
												THEN c_unfixed
												ELSE c_null_val
											END,
										ac_slip_typ = c_purc,
										qty = 0,
										amt = w.amt * -1,
										trd_cur_amt = w.trd_cur_amt * -1
									WHERE w._index_ = l_cnt
									;

									--品目製造指図、指図工程は作成しない
									EXIT NEXT_LOOP;
								END IF ;

								IF x1.ac_slip_typ IN (c_purc_ret, c_purc_dscnt, c_purc_xtra) THEN
									--仕入返品・値増・値引は品目製造指図及び指図工程情報を作成しない
									EXIT NEXT_LOOP;
								END IF ;

							END; -- MFG_ZERO

							<<OPER_MFG>>
							BEGIN
								IF x1.rcpt_iv_no IS NULL OR l_tgt_iv_flg = c_on OR x1.mfg_act_no_set_typ = c_mfg_non THEN
									IF mgpa_ins_scm2mgtif$f_chk_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_mfg_inst_no, x1.mfg_act_no) = c_err THEN
										EXIT OPER_MFG ;
									END IF ;
								ELSE
									l_chk_cnt := mgpa_ins_scm2mgtif$f_chk_iv(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_mfg_inst_no, x1.mfg_act_no, x1.rcpt_iv_no) ;
									IF l_chk_cnt = c_err THEN
										EXIT OPER_MFG ;
									ELSIF l_chk_cnt = -1 THEN
										x1.mfg_act_no := CONCAT(c_str_no, LPAD(mapa_num$f_get_seq(c_itm_mfg_inst)::VARCHAR, c_itm_mfg_inst_length, '0'));
										x1.mfg_st_qty := 0;
										x1.itm_inst_qty := 0;
										UPDATE mgpa_ins_scm2mgtif$p_if$rec_w1 w SET mfg_act_no = x1.mfg_act_no WHERE w._index_ = l_cnt;
									END IF ;
								END IF ;

								SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w6;
								l_cnt := l_cnt + 1;
								INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w6 (
									_index_,
									calc_ctg_cd,
									itm_cd,
									itm_sub1,
									itm_sub2,
									itm_sub3,
									itm_mfg_inst_no,
									mfg_act_no,
									wg_cd,
									mng_dpt_cd,
									lot_no,
									sublot_no,
									sno1,
									sno2,
									sno3,
									sno4,
									sppl_cd,
									po_no,
									slo_no,
									iv_no,
									asst_typ,
									qty,
									schd_st_dt,
									schd_end_dt,
									act_st_dt,
									act_end_dt,
									rmrks,
									sub_char1,
									sub_char2,
									sub_char3
								) VALUES (
									l_cnt,
									i_calc_ctg_cd,
									x1.itm_cd,
									x1.itm_sub1,
									x1.itm_sub2,
									x1.itm_sub3,
									x1.itm_mfg_inst_no,
									x1.mfg_act_no,
									l_wg,
									COALESCE(l_fix_dpt, l_mdpt),
									CASE WHEN x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_lot_use_typ <> c_ps_use3 AND x1.lot_act_typ <> c_act1
												THEN COALESCE(x1.par_lot_no, c_null_val)
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sublot_use_typ <> c_ps_use3 AND x1.sublot_act_typ <> c_act1
												THEN COALESCE(x1.par_sublot_no, c_null_val)
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sno1_use_typ <> c_ps_use3 AND x1.sno1_act_typ <> c_act1
 												THEN x1.sno1
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sno2_use_typ <> c_ps_use3 AND x1.sno2_act_typ <> c_act1
 												THEN x1.sno2
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sno3_use_typ <> c_ps_use3 AND x1.sno3_act_typ <> c_act1
 												THEN x1.sno3
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sno4_use_typ <> c_ps_use3 AND x1.sno4_act_typ <> c_act1
 												THEN x1.sno4
												ELSE c_null_val
											END
									END,
									x1.bp_cd,
									x1.po_no,
									x1.slo_no,
									x1.rcpt_iv_no,
									l_asst_typ,
									CASE WHEN x1.mfg_inst_unit_typ = c_itm
										THEN COALESCE(x1.mfg_st_qty, 0)
										ELSE COALESCE(x1.itm_inst_qty, 0)
									END,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL
									)
								;

								CALL mgpa_ins_scm2mgtif$p_col_proc_itm();

								IF x1.rcpt_iv_no IS NOT NULL AND COALESCE(x1.mfg_act_no_set_typ, c_null_val) <> c_mfg_non THEN
									SELECT COUNT(*) INTO STRICT u6 FROM mgpa_ins_scm2mgtif$p_if$upd_w6 ;
									u6 := u6 + 1 ;
									INSERT INTO mgpa_ins_scm2mgtif$p_if$upd_w6 (
										_index_,
										calc_ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no,wg_cd,mng_dpt_cd,
										lot_no,sublot_no,sno1,sno2,sno3,sno4,sppl_cd,po_no,slo_no,iv_no,asst_typ,qty,schd_st_dt,
										schd_end_dt,act_st_dt,act_end_dt,rmrks,sub_char1,sub_char2,sub_char3
									) SELECT
										u6,
										calc_ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no,wg_cd,mng_dpt_cd,
										lot_no,sublot_no,sno1,sno2,sno3,sno4,sppl_cd,po_no,slo_no,iv_no,asst_typ,qty,schd_st_dt,
										schd_end_dt,act_st_dt,act_end_dt,rmrks,sub_char1,sub_char2,sub_char3
									FROM mgpa_ins_scm2mgtif$p_if$rec_w6
									WHERE _index_ = l_cnt
									;

									DELETE FROM mgpa_ins_scm2mgtif$p_if$rec_w6 WHERE _index_ = l_cnt ;
								END IF ;

								IF l_mfg_zero_flg = c_on THEN
									EXIT NEXT_LOOP;
								END IF ;

							END; --OPER_MFG

							IF x1.oper_cd IS NULL OR x1.oper_cd = c_null_val OR mgpa_ins_scm2mgtif$f_chk_oper(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_mfg_inst_no, x1.mfg_act_no, x1.oper_act_no) = c_err THEN
								EXIT NEXT_LOOP;
							END IF ;

							SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w7;
							l_cnt := l_cnt + 1;
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w7 (
								_index_,
								calc_ctg_cd,
								itm_cd,
								itm_sub1,
								itm_sub2,
								itm_sub3,
								itm_mfg_inst_no,
								mfg_act_no,
								oper_act_no,
								wg_cd,
								mng_dpt_cd,
								oper_cd,
								oper_seq,
								disp_seq,
								qty,
								schd_st_dt,
								schd_end_dt,
								act_st_dt,
								act_end_dt,
								rmrks,
								sub_char1,
								sub_char2,
								sub_char3
							) VALUES (
								l_cnt,
								i_calc_ctg_cd,
								x1.itm_cd,
								x1.itm_sub1,
								x1.itm_sub2,
								x1.itm_sub3,
								x1.itm_mfg_inst_no,
								x1.mfg_act_no,
								x1.oper_act_no,
								l_wg,
								COALESCE(l_fix_dpt, l_mdpt),
								x1.oper_cd,
								1,
								COALESCE(x1.disp_seq, 1),
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL
								)
							;

							EXIT NEXT_LOOP;
						END IF ;

						--購買実績関連の取込
						IF x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra)
						OR x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns) AND (x1.par_itm_cd IS NULL OR COALESCE(x1.bd_loc_cd, x1.loc_cd) IS NULL)
						THEN
							IF l_non_prod_flg = c_off AND x1.asst_typ = c_asst2
							OR l_non_sls_flg = c_off AND x1.asst_typ = c_asst1
							THEN
								NULL ;
							ELSE
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ IN (c_purc_ret, c_purc_dscnt, c_purc_ret_xpns, c_purc_dscnt_xpns) THEN
								--値引・返品関連
								IF x1.ac_slip_typ = c_purc_ret THEN
									--仕入返品は出庫部門を管理部門とする
									l_mdpt := l_gi_dpt ;
									l_wg := x1.gi_wg_cd ;
								ELSE
									--経費返品・値引は負担部門を管理部門とする
									l_mdpt := l_bd_dpt ;
									l_wg := x1.bd_wg_cd ;
								END IF ;

								--符号を反転させる
								l_sign := -1 ;
							ELSE
								IF x1.ac_slip_typ IN (c_purc, c_arr_in_transit) THEN
									--仕入は入庫部門を管理部門とする
									l_mdpt := l_gr_dpt ;
									l_wg := x1.gr_wg_cd ;
								ELSE
									--経費購買・値増は負担部門を管理部門とする
									l_mdpt := l_bd_dpt ;
									l_wg := x1.bd_wg_cd ;
								END IF ;

								--符号はそのまま
								l_sign := 1 ;
							END IF ;
							IF l_wg IS NULL THEN
								IF x1.ac_slip_typ = c_purc_xpns THEN
									l_wg := x1.gr_wg_cd ;
								ELSIF x1.ac_slip_typ = c_purc_ret_xpns THEN
									l_wg := x1.gi_wg_cd ;
								ELSIF x1.ac_slip_typ IN (c_purc_dscnt, c_purc_dscnt_xpns, c_purc_xtra, c_purc_xtra_xpns) THEN
									l_wg := x1.purc_wg_cd ;
								END IF ;
							END IF ;
							-- 値引品目かつ経費購買、経費返品は符号を反転する
							IF x1.dscnt_itm_flg = c_on AND x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns) THEN
								l_sign := - l_sign ;
							END IF ;

							--配賦部門コードの設定
							l_odpt := COALESCE(l_bd_dpt, COALESCE(l_purc_dpt, l_ap_dpt)) ;

							IF l_wg IS NULL THEN
								IF x1.ac_slip_typ IN (c_purc_dscnt, c_purc_xtra, c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns) THEN
									CALL fcpa_batch_log$p_data_log('MGBBD0020', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								ELSE
									CALL fcpa_batch_log$p_data_log('MGBBD0018', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
									l_dpt_err := c_err ;
								END IF ;
								EXIT NEXT_LOOP;
							END IF ;

							IF l_mdpt IS NULL OR l_odpt IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0017', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w2;
							l_cnt := l_cnt + 1;
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w2 (
								_index_,
								data_lno,
								calc_ctg_cd,
								wg_cd,
								ym,
								ac_dt,
								mng_dpt_cd,
								itm_cd,
								itm_sub1,
								itm_sub2,
								itm_sub3,
								lot_no,
								sublot_no,
								sno1,
								sno2,
								sno3,
								sno4,
								sppl_cd,
								po_no,
								slo_no,
								iv_no,
								alc_loc_cd,
								alc_oper_cd,
								alc_ctg_cd,
								alc_dpt_cd,
								ac_slip_typ,
								ac_rsn_cd,
								asst_typ,
								qty,
								amt,
								trd_cur_cd,
								trd_cur_amt,
								xrate,
								expns_cd,
								alc_val1,
								alc_val2,
								alc_val3,
								alc_val4,
								alc_val5,
								no_pln_flg,
								no_itm_info_flg,
								no_eval_flg,
								slip_no,
								slip_seq_no,
								rmrks,
								sub_char1,
								sub_char2,
								sub_char3
							) VALUES (
								l_cnt,
								mapa_num$f_get_seq(c_act_purc_if_data_lno),
								i_calc_ctg_cd,
								l_wg,
								x1.ac_ym,
								x1.ac_dt,
								COALESCE(l_fix_dpt, l_mdpt),
								x1.itm_cd,
								x1.itm_sub1,
								x1.itm_sub2,
								x1.itm_sub3,
								CASE WHEN x1.lot_act_typ <> c_act1 AND (
									l_lot_use_typ = c_ps_use2 AND x1.asst_typ = c_asst2
										OR l_lot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_lot_use_typ = c_ps_use1)
									THEN
										CASE WHEN x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN COALESCE(x1.par_lot_no, x1.lot_no)
											ELSE x1.lot_no
										END
									ELSE c_null_val
								END,
								CASE WHEN x1.sublot_act_typ <> c_act1 AND (
									l_sublot_use_typ = c_ps_use2 AND x1.asst_typ = c_asst2
										OR l_sublot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sublot_use_typ = c_ps_use1)
									THEN
										CASE WHEN x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN COALESCE(x1.par_sublot_no, x1.sublot_no)
											ELSE x1.sublot_no
										END
									ELSE c_null_val
								END,
								CASE WHEN x1.sno1_act_typ <> c_act1 AND (
									l_sno1_use_typ = c_ps_use2 AND x1.asst_typ = c_asst2
										OR l_sno1_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno1_use_typ = c_ps_use1)
									THEN
										CASE WHEN x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN COALESCE(x1.par_sno1, x1.sno1)
											ELSE x1.sno1
										END
									ELSE c_null_val
								END,
								CASE WHEN x1.sno2_act_typ <> c_act1 AND (
									l_sno2_use_typ = c_ps_use2 AND x1.asst_typ = c_asst2
										OR l_sno2_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno2_use_typ = c_ps_use1)
									THEN
										CASE WHEN x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN COALESCE(x1.par_sno2, x1.sno2)
											ELSE x1.sno2
										END
									ELSE c_null_val
								END,
								CASE WHEN x1.sno3_act_typ <> c_act1 AND (
									l_sno3_use_typ = c_ps_use2 AND x1.asst_typ = c_asst2
										OR l_sno3_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno3_use_typ = c_ps_use1)
									THEN
										CASE WHEN x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN COALESCE(x1.par_sno3, x1.sno3)
											ELSE x1.sno3
										END
									ELSE c_null_val
								END,
								CASE WHEN x1.sno4_act_typ <> c_act1 AND (
									l_sno4_use_typ = c_ps_use2 AND x1.asst_typ = c_asst2
										OR l_sno4_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno4_use_typ = c_ps_use1)
									THEN
										CASE WHEN x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN COALESCE(x1.par_sno4, x1.sno4)
											ELSE x1.sno4
										END
									ELSE c_null_val
								END,
								CASE WHEN x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra)
									THEN x1.bp_cd
									ELSE COALESCE(x1.bd_bp_cd, x1.bp_cd)
								END,
								CASE WHEN x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra)
									THEN x1.po_no
									ELSE COALESCE(x1.bd_po_no, x1.po_no)
								END,
								CASE WHEN x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra)
									THEN x1.slo_no
									ELSE COALESCE(x1.bd_slo_no, x1.slo_no)
								END,
								CASE WHEN x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra)
									THEN x1.rcpt_iv_no
									ELSE COALESCE(x1.bd_iv_no, x1.rcpt_iv_no)
								END,
								CASE WHEN x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra)
									THEN NULL
									ELSE x1.bd_loc_cd
								END,
								CASE WHEN x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra)
									THEN NULL
									ELSE x1.bd_oper_cd
								END,
								CASE WHEN x1.ac_slip_typ IN (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra)
									THEN NULL
									ELSE x1.bd_ctg_cd
								END,
								l_odpt,
								x1.ac_slip_typ,
								x1.ac_rsn_cd,
								l_asst_typ,
								l_qty * l_sign,
								x1.amt * l_sign,
								x1.trd_cur_cd,
								x1.trd_cur_amt * l_sign,
								x1.xrate,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								c_off,
								c_off,
								c_off,
								x1.slip_no,
								x1.slip_seq_no,
								x1.trd_d_rmrks,
								NULL,
								NULL,
								NULL
								)
							;

							CALL mgpa_ins_scm2mgtif$p_col_proc_purc();

							--未着品の入荷では仕入に対する赤伝と入荷の黒伝を作成する
							IF x1.ac_slip_typ = c_arr_in_transit AND l_co_parm.non_transit_flg = c_off THEN
								INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w2 (
									_index_,
									data_lno,
									calc_ctg_cd,wg_cd,ym,ac_dt,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,
									sno1,sno2,sno3,sno4,sppl_cd,po_no,slo_no,iv_no,alc_loc_cd,alc_oper_cd,alc_ctg_cd,alc_dpt_cd,
									ac_slip_typ,ac_rsn_cd,asst_typ,qty,amt,trd_cur_cd,trd_cur_amt,xrate,expns_cd,alc_val1,
									alc_val2,alc_val3,alc_val4,alc_val5,no_pln_flg,no_itm_info_flg,no_eval_flg,slip_no,slip_seq_no,
									rmrks,sub_char1,sub_char2,sub_char3
								) SELECT 
									l_cnt + 1,
									mapa_num$f_get_seq(c_act_purc_if_data_lno),
									calc_ctg_cd,wg_cd,ym,ac_dt,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,
									sno1,sno2,sno3,sno4,sppl_cd,po_no,slo_no,iv_no,alc_loc_cd,alc_oper_cd,alc_ctg_cd,alc_dpt_cd,
									ac_slip_typ,ac_rsn_cd,asst_typ,qty,amt,trd_cur_cd,trd_cur_amt,xrate,expns_cd,alc_val1,
									alc_val2,alc_val3,alc_val4,alc_val5,no_pln_flg,no_itm_info_flg,no_eval_flg,slip_no,slip_seq_no,
									rmrks,sub_char1,sub_char2,sub_char3
								FROM mgpa_ins_scm2mgtif$p_if$rec_w2
								WHERE _index_ = l_cnt
								;

								UPDATE mgpa_ins_scm2mgtif$p_if$rec_w2 w SET
									lot_no =
										CASE WHEN x1.lot_act_typ <> c_act1 AND (
											l_lot_use_typ = c_ps_use2 AND x1.asst_typ = c_asst2
												OR l_lot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
												OR l_lot_use_typ = c_ps_use1)
											THEN c_unfixed
											ELSE c_null_val
										END,
									sublot_no =
										CASE WHEN x1.sublot_act_typ <> c_act1 AND (
											l_sublot_use_typ = c_ps_use2 AND x1.asst_typ = c_asst2
												OR l_sublot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
												OR l_sublot_use_typ = c_ps_use1)
											THEN c_unfixed
											ELSE c_null_val
										END,
									ac_slip_typ = c_purc,
									qty = w.qty * -1,
									amt = w.amt * -1,
									trd_cur_amt = w.trd_cur_amt * -1
								WHERE w._index_ = l_cnt
								;
							END IF ;

							EXIT NEXT_LOOP;
						END IF ;

						--投入実績関連の取込
						IF x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod)
						OR x1.ac_slip_typ IN (
							c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns,				--経費
							c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr	--入出庫
							) AND x1.par_itm_cd IS NOT NULL AND COALESCE(x1.bd_loc_cd, x1.loc_cd) IS NOT NULL
						THEN
							IF l_non_prod_flg = c_on THEN
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.par_asset_mng_typ <> c_asst_mng1 THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0045', l_log_no, l_log_sub_key1, l_log_sub_key2,
										mapa_comm$f_to_disp_itm(x1.par_itm_cd, x1.par_itm_sub1, x1.par_itm_sub2, x1.par_itm_sub3, l_parm), x1.ac_slip_typ) ;
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ IN (c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr)	--入出庫
							AND x1.asset_mng_typ <> c_asst_mng1 THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0044', l_log_no, l_log_sub_key1, l_log_sub_key2,
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm), x1.ac_slip_typ) ;
								EXIT NEXT_LOOP;
							END IF ;

							l_itm_mfg_inst_no := x1.itm_mfg_inst_no ;
							l_mfg_act_no := COALESCE(x1.mfg_act_no, c_null_val) ;
							l_oper_act_no := COALESCE(x1.oper_act_no, c_null_val) ;

							IF x1.ac_slip_typ IN (
								c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns,				--経費
								c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr	--入出庫
							) THEN
								IF x1.ac_slip_typ IN (c_purc_xpns, c_purc_xtra_xpns) THEN
									--経費購買は負担部門を管理部門（投入）とする
									l_mdpt	:= l_bd_dpt ;
									l_wg	:= x1.bd_wg_cd ;
									l_owg	:= x1.bd_wg_cd ;

									l_sign := 1 ;
								ELSIF x1.ac_slip_typ IN (c_purc_ret_xpns, c_purc_dscnt_xpns) THEN
									--経費返品は負担部門を管理部門（投入）とする
									l_mdpt	:= l_bd_dpt ;
									l_wg	:= x1.bd_wg_cd ;
									l_owg	:= x1.bd_wg_cd ;

									l_sign := -1 ;
								ELSIF x1.ac_slip_typ IN (c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so) THEN
									--出庫は出庫部門を管理部門（投入）とする
									l_mdpt	:= l_gi_dpt ;
									l_wg	:= x1.gi_wg_cd ;
									l_owg	:= coalesce(x1.bd_wg_cd, x1.gi_wg_cd) ;

									l_sign := 1 ;
								ELSIF x1.ac_slip_typ IN (c_in_stktk, c_oth_ccn_gr) THEN
									--入庫は入庫部門を管理部門（投入）とする
									l_mdpt	:= l_gr_dpt ;
									l_wg	:= x1.gr_wg_cd ;
									l_owg	:= coalesce(x1.bd_wg_cd, x1.gr_wg_cd) ;

									l_sign := -1 ;
								END IF ;
								IF l_wg IS NULL THEN
									IF x1.ac_slip_typ = c_purc_xpns THEN
										l_wg := x1.gr_wg_cd ;
									ELSIF x1.ac_slip_typ = c_purc_ret_xpns THEN
										l_wg := x1.gi_wg_cd ;
									ELSIF x1.ac_slip_typ IN (c_purc_dscnt_xpns, c_purc_xtra_xpns) THEN
										l_wg := x1.purc_wg_cd ;
									END IF ;
									l_owg := l_wg ;
								END IF ;

								-- 値引品目かつ経費購買、経費返品は符号を反転する
								IF x1.dscnt_itm_flg = c_on AND x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns) THEN
									l_sign := - l_sign ;
								END IF ;

								--負担部門を管理部門（品目製造指図）とする
								l_odpt	:= l_bd_dpt ;
								l_loc	:= COALESCE(x1.bd_loc_cd, x1.loc_cd) ;

								IF x1.itm_mfg_inst_no IS NULL THEN
									l_itm_mfg_inst_no := c_null_val ;
									l_mfg_act_no := c_null_val ;
									l_oper_act_no := c_null_val ;
								END IF ;

							ELSIF x1.ac_slip_typ = c_byprod THEN
								--副産物製造は入庫部門を管理部門（投入）、管理部門（品目製造指図）とする
								l_mdpt	:= l_gr_dpt ;
								l_wg	:= x1.gr_wg_cd ;

								l_odpt	:= l_gr_dpt ;
								l_owg	:= x1.gr_wg_cd ;

								l_loc	:= x1.loc_cd ;

								--符号を反転
								l_sign := -1 ;
							ELSE
								--出庫部門を管理部門（投入）、管理部門（品目製造指図）とする
								l_mdpt	:= l_gi_dpt ;
								l_wg	:= x1.gi_wg_cd ;

								l_odpt := l_gi_dpt ;
								l_owg	:= x1.gi_wg_cd ;

								l_loc	:= x1.loc_cd ;

								--符号はそのまま
								l_sign := 1 ;
							END IF ;

							IF l_wg IS NULL OR l_owg IS NULL THEN
								IF x1.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns) THEN	--経費
									CALL fcpa_batch_log$p_data_log('MGBBD0020', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								ELSE
									CALL fcpa_batch_log$p_data_log('MGBBD0018', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
									l_dpt_err := c_err ;
								END IF ;
								EXIT NEXT_LOOP;
							END IF ;

							IF l_mdpt IS NULL OR l_odpt IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0017', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ IN (c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr)
							AND (l_fix_dpt IS NULL AND l_mdpt <> l_odpt OR l_wg <> l_owg)
							AND l_qty <> 0 THEN
								--入出庫で出庫ＷＧと入庫ＷＧもしくは出庫部門と入庫部門が異なるときは入出庫実績を作成する

								SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w4;
								l_cnt := l_cnt + 1;
								l_data_lno := mapa_num$f_get_seq(c_act_io_if_data_lno);
								INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w4 (
									_index_,
									data_lno,
									calc_ctg_cd,
									wg_cd,
									ym,
									ac_dt,
									mng_dpt_cd,
									itm_cd,
									itm_sub1,
									itm_sub2,
									itm_sub3,
									lot_no,
									sublot_no,
									sno1,
									sno2,
									sno3,
									sno4,
									ac_slip_typ,
									ac_rsn_cd,
									other_wg_cd,
									other_dpt_cd,
									bp_cd,
									stk_bp_cd,
									asst_typ,
									qty,
									amt,
									trd_cur_cd,
									trd_cur_amt,
									xrate,
									trd_grp,
									trd_ratio,
									alc_ac_cd,
									alc_amt_flg,
									alc_wg_cd,
									alc_dpt_cd,
									alc_loc_cd,
									alc_oper_cd,
									alc_bp_cd,
									alc_ctg_cd,
									alc_itm_cd,
									alc_itm_sub1,
									alc_itm_sub2,
									alc_itm_sub3,
									alc_lot_no,
									alc_sublot_no,
									alc_sno1,
									alc_sno2,
									alc_sno3,
									alc_sno4,
									alc_itm_mfg_inst_no,
									rec_eval_typ,
									no_pln_flg,
									no_itm_info_flg,
									zero_effect_flg,
									slip_no,
									slip_seq_no,
									rmrks,
									sub_char1,
									sub_char2,
									sub_char3
								) VALUES (
									l_cnt,
									l_data_lno,
									i_calc_ctg_cd,
									l_wg,
									x1.ac_ym,
									x1.ac_dt,
									l_mdpt,
									x1.itm_cd,
									x1.itm_sub1,
									x1.itm_sub2,
									x1.itm_sub3,
									CASE WHEN l_lot_use_typ <> c_ps_use3 AND x1.lot_act_typ = c_act2
										THEN x1.lot_no
										ELSE c_null_val
									END,
									CASE WHEN l_sublot_use_typ <> c_ps_use3 AND x1.sublot_act_typ = c_act2
										THEN x1.sublot_no
										ELSE c_null_val
									END,
									CASE WHEN l_sno1_use_typ <> c_ps_use3 AND x1.sno1_act_typ = c_act2
										THEN x1.sno1
										ELSE c_null_val
									END,
									CASE WHEN l_sno2_use_typ <> c_ps_use3 AND x1.sno2_act_typ = c_act2
										THEN x1.sno2
										ELSE c_null_val
									END,
									CASE WHEN l_sno3_use_typ <> c_ps_use3 AND x1.sno3_act_typ = c_act2
										THEN x1.sno3
										ELSE c_null_val
									END,
									CASE WHEN l_sno4_use_typ <> c_ps_use3 AND x1.sno4_act_typ = c_act2
										THEN x1.sno4
										ELSE c_null_val
									END,
									c_dpt_xfr_so,
									x1.ac_rsn_cd,
									CASE WHEN l_wg = l_owg
										THEN NULL
										ELSE l_owg
									END,
									l_odpt,
									NULL,
									x1.bp_cd,
									l_asst_typ,
									l_qty * l_sign,
									NULL,
									NULL,
									NULL,
									NULL,
									CONCAT(c_str_trd3, l_data_lno::VARCHAR),
									NULL,
									NULL,
									c_off,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									c_off,
									c_off,
									c_off,
									x1.slip_no,
									x1.slip_seq_no,
									x1.trd_d_rmrks,
									NULL,
									NULL,
									NULL
									)
								;

								l_mdpt	:= l_odpt ;
								l_wg	:= l_owg ;
							END IF ;

							SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w3;
							w3 := l_cnt + 1;
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w3 (
								_index_,
								data_lno,
								calc_ctg_cd,
								wg_cd,
								ym,
								ac_dt,
								par_itm_cd,
								par_itm_sub1,
								par_itm_sub2,
								par_itm_sub3,
								itm_mfg_inst_no,
								mfg_act_no,
								oper_act_no,
								loc_cd,
								str_ln_cd,
								mng_dpt_cd,
								itm_cd,
								itm_sub1,
								itm_sub2,
								itm_sub3,
								lot_no,
								sublot_no,
								sno1,
								sno2,
								sno3,
								sno4,
								ac_slip_typ,
								ac_rsn_cd,
								stk_bp_cd,
								asst_typ,
								qty,
								amt,
								trd_cur_cd,
								trd_cur_amt,
								xrate,
								rec_eval_typ,
								expns_cd,
								no_pln_flg,
								no_itm_info_flg,
								zero_effect_flg,
								slip_no,
								slip_seq_no,
								rmrks,
								sub_char1,
								sub_char2,
								sub_char3
							) VALUES (
								w3,
								mapa_num$f_get_seq(c_act_inpt_if_data_lno),
								i_calc_ctg_cd,
								l_wg,
								x1.ac_ym,
								x1.ac_dt,
								x1.par_itm_cd,
								x1.par_itm_sub1,
								x1.par_itm_sub2,
								x1.par_itm_sub3,
								l_itm_mfg_inst_no,
								l_mfg_act_no,
								l_oper_act_no,
								l_loc,
								COALESCE(x1.str_ln_cd, c_null_val),
								COALESCE(l_fix_dpt, l_mdpt),
								x1.itm_cd,
								x1.itm_sub1,
								x1.itm_sub2,
								x1.itm_sub3,
								CASE WHEN l_lot_use_typ <> c_ps_use3 AND x1.lot_act_typ = c_act2
									THEN x1.lot_no
									ELSE c_null_val
								END,
								CASE WHEN l_sublot_use_typ <> c_ps_use3 AND x1.sublot_act_typ = c_act2
									THEN x1.sublot_no
									ELSE c_null_val
								END,
								CASE WHEN l_sno1_use_typ <> c_ps_use3 AND x1.sno1_act_typ = c_act2
									THEN x1.sno1
									ELSE c_null_val
								END,
								CASE WHEN l_sno2_use_typ <> c_ps_use3 AND x1.sno2_act_typ = c_act2
									THEN x1.sno2
									ELSE c_null_val
								END,
								CASE WHEN l_sno3_use_typ <> c_ps_use3 AND x1.sno3_act_typ = c_act2
									THEN x1.sno3
									ELSE c_null_val
								END,
								CASE WHEN l_sno4_use_typ <> c_ps_use3 AND x1.sno4_act_typ = c_act2
									THEN x1.sno4
									ELSE c_null_val
								END,
								x1.ac_slip_typ,
								x1.ac_rsn_cd,
								x1.bp_cd,
								l_asst_typ,
								l_qty * l_sign,
								x1.amt * l_sign,
								x1.trd_cur_cd,
								x1.trd_cur_amt * l_sign,
								x1.xrate,
								NULL,
								NULL,
								c_off,
								c_off,
								c_off,
								x1.slip_no,
								x1.slip_seq_no,
								x1.trd_d_rmrks,
								NULL,
								NULL,
								NULL
								)
							;

							<<OPER_INPT>>
							BEGIN

								IF l_itm_mfg_inst_no <> c_null_val AND mgpa_ins_scm2mgtif$f_chk_itm(x1.par_itm_cd, x1.par_itm_sub1, x1.par_itm_sub2, x1.par_itm_sub3, l_itm_mfg_inst_no, l_mfg_act_no) = c_err
								THEN
									EXIT OPER_INPT ;
								END IF ;

								SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w6;
								w6 := l_cnt + 1;
								INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w6 (
									_index_,
									calc_ctg_cd,
									itm_cd,
									itm_sub1,
									itm_sub2,
									itm_sub3,
									itm_mfg_inst_no,
									mfg_act_no,
									wg_cd,
									mng_dpt_cd,
									lot_no,
									sublot_no,
									sno1,
									sno2,
									sno3,
									sno4,
									sppl_cd,
									po_no,
									slo_no,
									iv_no,
									asst_typ,
									qty,
									schd_st_dt,
									schd_end_dt,
									act_st_dt,
									act_end_dt,
									rmrks,
									sub_char1,
									sub_char2,
									sub_char3
								) VALUES (
									w6,
									i_calc_ctg_cd,
									x1.par_itm_cd,
									x1.par_itm_sub1,
									x1.par_itm_sub2,
									x1.par_itm_sub3,
									l_itm_mfg_inst_no,
									l_mfg_act_no,
									l_owg,
									COALESCE(l_fix_dpt, l_odpt),
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod) AND x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_lot_use_typ <> c_ps_use3 AND x1.par_lot_act_typ <> c_act1
												THEN COALESCE(x1.par_lot_no, c_null_val)
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod) AND x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sublot_use_typ <> c_ps_use3 AND x1.par_sublot_act_typ <> c_act1
												THEN COALESCE(x1.par_sublot_no, c_null_val)
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod) AND x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sno1_use_typ <> c_ps_use3 AND x1.par_sno1_act_typ <> c_act1
												THEN COALESCE(x1.par_sno1, c_null_val)
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod) AND x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sno2_use_typ <> c_ps_use3 AND x1.par_sno2_act_typ <> c_act1
												THEN COALESCE(x1.par_sno2, c_null_val)
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod) AND x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sno3_use_typ <> c_ps_use3 AND x1.par_sno3_act_typ <> c_act1
												THEN COALESCE(x1.par_sno3, c_null_val)
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod) AND x1.itm_mfg_inst_no_set_typ = c_inst_loc
										THEN c_null_val
										ELSE
											CASE WHEN l_sno4_use_typ <> c_ps_use3 AND x1.par_sno4_act_typ <> c_act1
												THEN COALESCE(x1.par_sno4, c_null_val)
												ELSE c_null_val
											END
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod)
										THEN x1.bp_cd
										ELSE COALESCE(x1.bd_bp_cd, x1.bp_cd)
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod)
										THEN x1.po_no
										ELSE COALESCE(x1.bd_po_no, x1.po_no)
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod)
										THEN x1.slo_no
										ELSE COALESCE(x1.bd_slo_no, x1.slo_no)
									END,
									CASE WHEN x1.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_byprod)
										THEN x1.rcpt_iv_no
										ELSE COALESCE(x1.bd_iv_no, x1.rcpt_iv_no)
									END,
									c_asst2,
									CASE WHEN x1.mfg_inst_unit_typ = c_itm
										THEN COALESCE(x1.mfg_st_qty, 0)
										ELSE COALESCE(x1.itm_inst_qty, 0)
									END,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL,
									NULL
									)
								;

								CALL mgpa_ins_scm2mgtif$p_col_proc_itm();

								IF l_itm_mfg_inst_no <> c_null_val
								AND x1.ac_slip_typ IN (
									c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns,				--経費
									c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr	--入出庫
								) THEN

									SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$tmp_w6;
									l_cnt := l_cnt + 1;
									INSERT INTO mgpa_ins_scm2mgtif$p_if$tmp_w6 (
										_index_,
										calc_ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no,wg_cd,mng_dpt_cd,
										lot_no,sublot_no,sno1,sno2,sno3,sno4,sppl_cd,po_no,slo_no,iv_no,asst_typ,qty,schd_st_dt,
										schd_end_dt,act_st_dt,act_end_dt,rmrks,sub_char1,sub_char2,sub_char3
									) SELECT
										l_cnt,
										calc_ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no,wg_cd,mng_dpt_cd,
										lot_no,sublot_no,sno1,sno2,sno3,sno4,sppl_cd,po_no,slo_no,iv_no,asst_typ,qty,schd_st_dt,
										schd_end_dt,act_st_dt,act_end_dt,rmrks,sub_char1,sub_char2,sub_char3
									FROM mgpa_ins_scm2mgtif$p_if$rec_w6
									WHERE _index_ = w6
									;

									DELETE FROM mgpa_ins_scm2mgtif$p_if$rec_w6 WHERE _index_ = w6;

									DELETE FROM mgpa_ins_scm2mgtif$p_if$rec_chk_itm
									WHERE _index_ = CONCAT_WS(c_str_chk, x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_mfg_inst_no, x1.mfg_act_no);

									EXIT NEXT_LOOP;
								END IF ;

								IF l_itm_mfg_inst_no = c_null_val THEN
									SELECT * INTO STRICT r3 FROM mgpa_ins_scm2mgtif$p_if$rec_w3 WHERE _index_ = w3;
									SELECT * INTO STRICT r6 FROM mgpa_ins_scm2mgtif$p_if$rec_w6 WHERE _index_ = w6;
									SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$tmp_w3;
									l_cnt := l_cnt + 1;
									INSERT INTO mgpa_ins_scm2mgtif$p_if$tmp_w3 (
										_index_,
										calc_ctg_cd,
										wg_cd,
										ym,
										ac_dt,
										par_itm_cd,
										par_itm_sub1,
										par_itm_sub2,
										par_itm_sub3,
										par_lot_no,
										par_sublot_no,
										par_sno1,
										par_sno2,
										par_sno3,
										par_sno4 ,
										itm_mfg_inst_no,
										mfg_act_no,
										oper_act_no,
										loc_cd,
										str_ln_cd,
										mng_dpt_cd,
										itm_cd,
										itm_sub1,
										itm_sub2,
										itm_sub3,
										lot_no,
										sublot_no,
										sno1,
										sno2,
										sno3,
										sno4 ,
										ac_slip_typ,
										ac_rsn_cd,
										stk_bp_cd,
										asst_typ,
										qty,
										amt,
										trd_cur_cd,
										trd_cur_amt,
										xrate,
										rec_eval_typ,
										expns_cd,
										slip_no,
										slip_seq_no,
										rmrks,
										sub_char1,
										sub_char2,
										sub_char3
									) VALUES (
										l_cnt,
										r3.calc_ctg_cd,
										r3.wg_cd,
										r3.ym,
										r3.ac_dt,
										r3.par_itm_cd,
										r3.par_itm_sub1,
										r3.par_itm_sub2,
										r3.par_itm_sub3,
										r6.lot_no,
										r6.sublot_no,
										r6.sno1,
										r6.sno2,
										r6.sno3,
										r6.sno4,
										r3.itm_mfg_inst_no,
										r3.mfg_act_no,
										r3.oper_act_no,
										r3.loc_cd,
										r3.str_ln_cd,
										r3.mng_dpt_cd,
										r3.itm_cd,
										r3.itm_sub1,
										r3.itm_sub2,
										r3.itm_sub3,
										CASE WHEN r3.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN c_null_val
											ELSE r3.lot_no
										END,
										CASE WHEN r3.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN c_null_val
											ELSE r3.sublot_no
										END,
										CASE WHEN r3.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN c_null_val
											ELSE r3.sno1
										END,
										CASE WHEN r3.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN c_null_val
											ELSE r3.sno2
										END,
										CASE WHEN r3.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN c_null_val
											ELSE r3.sno3
										END,
										CASE WHEN r3.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
											THEN c_null_val
											ELSE r3.sno4
										END,
										r3.ac_slip_typ,
										r3.ac_rsn_cd,
										r3.stk_bp_cd,
										r3.asst_typ,
										r3.qty,
										r3.amt,
										r3.trd_cur_cd,
										r3.trd_cur_amt,
										r3.xrate,
										r3.rec_eval_typ,
										r3.expns_cd,
										r3.slip_no,
										r3.slip_seq_no,
										r3.rmrks,
										NULL,
										NULL,
										NULL
										)
									;

									DELETE FROM mgpa_ins_scm2mgtif$p_if$rec_w3 WHERE _index_ = w3;
									DELETE FROM mgpa_ins_scm2mgtif$p_if$rec_w6 WHERE _index_ = w6;

									EXIT NEXT_LOOP;
								END IF ;

							END; -- OPER_INPT

							IF x1.oper_cd IS NULL OR x1.oper_cd = c_null_val OR mgpa_ins_scm2mgtif$f_chk_oper(x1.par_itm_cd, x1.par_itm_sub1, x1.par_itm_sub2, x1.par_itm_sub3, l_itm_mfg_inst_no, l_mfg_act_no, l_oper_act_no) = c_err THEN
								EXIT NEXT_LOOP;
							END IF ;

							SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w7;
							l_cnt := l_cnt + 1;
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w7 (
								_index_,
								calc_ctg_cd,
								itm_cd,
								itm_sub1,
								itm_sub2,
								itm_sub3,
								itm_mfg_inst_no,
								mfg_act_no,
								oper_act_no,
								wg_cd,
								mng_dpt_cd,
								oper_cd,
								oper_seq,
								disp_seq,
								qty,
								schd_st_dt,
								schd_end_dt,
								act_st_dt,
								act_end_dt,
								rmrks,
								sub_char1,
								sub_char2,
								sub_char3
							) VALUES (
								l_cnt,
								i_calc_ctg_cd,
								x1.par_itm_cd,
								x1.par_itm_sub1,
								x1.par_itm_sub2,
								x1.par_itm_sub3,
								l_itm_mfg_inst_no,
								l_mfg_act_no,
								l_oper_act_no,
								l_owg,
								COALESCE(l_fix_dpt, l_odpt),
								x1.oper_cd,
								1,
								COALESCE(x1.disp_seq, 1),
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL
								)
							;

							EXIT NEXT_LOOP;
						END IF ;

						--支給、出荷実績関連の取込
						IF x1.ac_slip_typ IN (
							c_ffr_prov, c_onr_prov, c_ffr_prvr, c_onr_prvr, c_ship, c_ship_ret
							)
						THEN
							IF l_non_prod_flg = c_off AND x1.asst_typ IN (c_asst2, c_asst3)
							OR l_non_sls_flg = c_off AND x1.asst_typ = c_asst1
							THEN
								NULL ;
							ELSE
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.asset_mng_typ <> c_asst_mng1 THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0044', l_log_no, l_log_sub_key1, l_log_sub_key2,
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm), x1.ac_slip_typ) ;
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ IN (c_ffr_prvr, c_onr_prvr, c_ship) THEN
								--支給戻関連、出荷は出庫部門を管理部門とする
								l_mdpt	:= COALESCE(l_gi_dpt, l_gr_dpt) ;
								l_wg	:= COALESCE(x1.gi_wg_cd, x1.gr_wg_cd) ;
							ELSE	--c_ffr_prov, c_onr_prov, c_ship_ret
								--支給関連、出荷返品は入庫部門を管理部門とする
								l_mdpt	:= COALESCE(l_gr_dpt, l_gi_dpt) ;
								l_wg	:= COALESCE(x1.gr_wg_cd, x1.gi_wg_cd) ;
							END IF ;

							IF x1.ac_slip_typ IN (c_ffr_prvr, c_onr_prvr, c_ship_ret) THEN
								--符号を反転
								l_sign := -1 ;
							ELSE	--c_ffr_prov, c_onr_prov, c_ship
								--符号はそのまま
								l_sign := 1 ;
							END IF ;

							l_odpt	:= l_mdpt ;
							l_owg	:= l_wg ;

							IF l_wg IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0018', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							IF l_mdpt IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0017', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							--自社から出庫したことにする
							IF l_asst_typ = c_asst3 THEN
								l_asst_typ := c_asst2 ;
							END IF ;

							IF x1.ac_slip_typ IN (c_ship, c_ship_ret) THEN
								--出荷先の在庫を考慮しない場合は出荷関連のデータを取込まない
								IF l_stk_bp_flg = c_off THEN
									EXIT NEXT_LOOP;
								END IF ;
							END IF ;

							SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w4;
							l_cnt := l_cnt + 1;
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w4 (
								_index_,
								data_lno,
								calc_ctg_cd,
								wg_cd,
								ym,
								ac_dt,
								mng_dpt_cd,
								itm_cd,
								itm_sub1,
								itm_sub2,
								itm_sub3,
								lot_no,
								sublot_no,
								sno1,
								sno2,
								sno3,
								sno4,
								ac_slip_typ,
								ac_rsn_cd,
								other_wg_cd,
								other_dpt_cd,
								bp_cd,
								stk_bp_cd,
								asst_typ,
								qty,
								amt,
								trd_cur_cd,
								trd_cur_amt,
								xrate,
								trd_grp,
								trd_ratio,
								alc_ac_cd,
								alc_amt_flg,
								alc_wg_cd,
								alc_dpt_cd,
								alc_loc_cd,
								alc_oper_cd,
								alc_bp_cd,
								alc_ctg_cd,
								alc_itm_cd,
								alc_itm_sub1,
								alc_itm_sub2,
								alc_itm_sub3,
								alc_lot_no,
								alc_sublot_no,
								alc_sno1,
								alc_sno2,
								alc_sno3,
								alc_sno4,
								alc_itm_mfg_inst_no,
								rec_eval_typ,
								no_pln_flg,
								no_itm_info_flg,
								zero_effect_flg,
								slip_no,
								slip_seq_no,
								rmrks,
								sub_char1,
								sub_char2,
								sub_char3
							) VALUES (
								l_cnt,
								mapa_num$f_get_seq(c_act_io_if_data_lno),
								i_calc_ctg_cd,
								l_wg,
								x1.ac_ym,
								x1.ac_dt,
								COALESCE(l_fix_dpt, l_mdpt),
								x1.itm_cd,
								x1.itm_sub1,
								x1.itm_sub2,
								x1.itm_sub3,
								CASE WHEN x1.lot_act_typ = c_act2 AND (
									l_lot_use_typ = c_ps_use2 and x1.asst_typ IN (c_asst2, c_asst3)
										OR l_lot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_lot_use_typ = c_ps_use1)
									THEN x1.lot_no
									ELSE c_null_val
								END,
								CASE WHEN x1.sublot_act_typ = c_act2 AND (
									l_sublot_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sublot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sublot_use_typ = c_ps_use1)
									THEN x1.sublot_no
									ELSE c_null_val
								END,
								CASE WHEN x1.sno1_act_typ = c_act2 AND (
									l_sno1_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sno1_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno1_use_typ = c_ps_use1)
									THEN x1.sno1
									ELSE c_null_val
								END,
								CASE WHEN x1.sno2_act_typ = c_act2 AND (
									l_sno2_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sno2_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno2_use_typ = c_ps_use1)
									THEN x1.sno2
									ELSE c_null_val
								END,
								CASE WHEN x1.sno3_act_typ = c_act2 AND (
									l_sno3_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sno3_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno3_use_typ = c_ps_use1)
									THEN x1.sno3
									ELSE c_null_val
								END,
								CASE WHEN x1.sno4_act_typ = c_act2 AND (
									l_sno4_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sno4_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno4_use_typ = c_ps_use1)
									THEN x1.sno4
									ELSE c_null_val
								END,
								x1.ac_slip_typ,
								x1.ac_rsn_cd,
								--出庫ＷＧと入庫ＷＧは同じなのでOTHER_WG_CDを設定しない
								NULL,
								COALESCE(l_fix_dpt, l_odpt),
								CASE WHEN x1.ac_slip_typ IN (c_ship, c_ship_ret)
									THEN x1.dlv_cd
									ELSE x1.bp_cd
								END,
								NULL,
								l_asst_typ,
								l_qty * l_sign,
								CASE WHEN x1.ac_slip_typ IN (c_onr_prov, c_onr_prvr)
									THEN x1.amt * l_sign
									ELSE NULL
								END,
								CASE WHEN x1.ac_slip_typ IN (c_onr_prov, c_onr_prvr)
									THEN x1.trd_cur_cd
									ELSE NULL
								END,
								CASE WHEN x1.ac_slip_typ IN (c_onr_prov, c_onr_prvr)
									THEN x1.trd_cur_amt * l_sign
									ELSE NULL
								END,
								CASE WHEN x1.ac_slip_typ IN (c_onr_prov, c_onr_prvr)
									THEN x1.xrate
									ELSE NULL
								END,
								NULL,
								NULL,
								NULL,
								c_off,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								c_off,
								c_off,
								 c_off,
								x1.slip_no,
								x1.slip_seq_no,
								x1.trd_d_rmrks,
								NULL,
								NULL,
								NULL
								)
							;

							EXIT NEXT_LOOP;
						END IF ;

						--出庫、入庫実績関連の取込
						IF x1.ac_slip_typ IN (
							c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so,	--出庫
							c_in_stktk, c_oth_ccn_gr	--入庫
							)
						AND (x1.par_itm_cd IS NULL OR COALESCE(x1.bd_loc_cd, x1.loc_cd) IS NULL)
						THEN
							IF l_non_prod_flg = c_off AND x1.asst_typ IN (c_asst2, c_asst3)
							OR l_non_sls_flg = c_off AND x1.asst_typ = c_asst1
							THEN
								NULL ;
							ELSE
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.asset_mng_typ <> c_asst_mng1 THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0044', l_log_no, l_log_sub_key1, l_log_sub_key2,
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm), x1.ac_slip_typ) ;
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ IN (c_in_stktk, c_oth_ccn_gr) THEN
								--入庫関連は入庫部門を管理部門とする
								l_mdpt	:= l_gr_dpt ;
								l_wg	:= x1.gr_wg_cd ;

								--負担・出庫部門を相手部門とする
								l_odpt	:= COALESCE(l_bd_dpt, COALESCE(l_gi_dpt, l_gr_dpt)) ;
								l_owg	:= COALESCE(x1.bd_wg_cd, COALESCE(x1.gi_wg_cd, x1.gr_wg_cd)) ;
							ELSE	--c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so
								--その他は出庫部門を管理部門とする
								l_mdpt	:= l_gi_dpt ;
								l_wg	:= x1.gi_wg_cd ;

								--負担・入庫部門を相手部門とする
								l_odpt	:= COALESCE(l_bd_dpt, COALESCE(l_gr_dpt, l_gi_dpt)) ;
								l_owg	:= COALESCE(x1.bd_wg_cd, COALESCE(x1.gr_wg_cd, x1.gi_wg_cd)) ;
							END IF ;

							IF l_wg IS NULL OR l_owg IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0018', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							IF l_mdpt IS NULL OR l_odpt IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0017', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w4;
							l_cnt := l_cnt + 1;
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w4 (
								_index_,
								data_lno,
								calc_ctg_cd,
								wg_cd,
								ym,
								ac_dt,
								mng_dpt_cd,
								itm_cd,
								itm_sub1,
								itm_sub2,
								itm_sub3,
								lot_no,
								alc_lot_no,
								sublot_no,
								alc_sublot_no,
								sno1,
								alc_sno1,
								sno2,
								alc_sno2,
								sno3,
								alc_sno3,
								sno4,
								alc_sno4,
								ac_slip_typ,
								ac_rsn_cd,
								other_wg_cd,
								other_dpt_cd,
								bp_cd,
								stk_bp_cd,
								asst_typ,
								qty,
								amt,
								trd_cur_cd,
								trd_cur_amt,
								xrate,
								trd_grp,
								trd_ratio,
								alc_ac_cd,
								alc_amt_flg,
								alc_wg_cd,
								alc_dpt_cd,
								alc_loc_cd,
								alc_oper_cd,
								alc_bp_cd,
								alc_ctg_cd,
								alc_itm_cd,
								alc_itm_sub1,
								alc_itm_sub2,
								alc_itm_sub3,
								alc_itm_mfg_inst_no,
								rec_eval_typ,
								no_pln_flg,
								no_itm_info_flg,
								zero_effect_flg,
								slip_no,
								slip_seq_no,
								rmrks,
								sub_char1,
								sub_char2,
								sub_char3
							) VALUES (
								l_cnt,
								mapa_num$f_get_seq(c_act_io_if_data_lno),
								i_calc_ctg_cd,
								l_wg,
								x1.ac_ym,
								x1.ac_dt,
								COALESCE(l_fix_dpt, l_mdpt),
								x1.itm_cd,
								x1.itm_sub1,
								x1.itm_sub2,
								x1.itm_sub3,
								CASE WHEN x1.lot_act_typ = c_act2 AND (
									l_lot_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_lot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_lot_use_typ = c_ps_use1)
									THEN x1.lot_no
									ELSE c_null_val
								END,
								CASE WHEN x1.par_lot_no IS NULL AND x1.lot_no <> c_null_val
									THEN x1.lot_no
									ELSE x1.par_lot_no
								END,
								CASE WHEN x1.sublot_act_typ = c_act2 AND (
									l_sublot_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sublot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sublot_use_typ = c_ps_use1)
									THEN x1.sublot_no
									ELSE c_null_val
								END,
								CASE WHEN x1.par_sublot_no IS NULL AND x1.sublot_no <> c_null_val
									THEN x1.sublot_no
									ELSE x1.par_sublot_no
								END,
								CASE WHEN x1.sno1_act_typ = c_act2 AND (
									l_sno1_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sno1_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno1_use_typ = c_ps_use1)
									THEN x1.sno1
									ELSE c_null_val
								END,
								CASE WHEN x1.par_sno1 IS NULL AND x1.sno1 <> c_null_val
									THEN x1.sno1
									ELSE x1.par_sno1
								END,
								CASE WHEN x1.sno2_act_typ = c_act2 AND (
									l_sno2_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sno2_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno2_use_typ = c_ps_use1)
									THEN x1.sno2
									ELSE c_null_val
								END,
								CASE WHEN x1.par_sno2 IS NULL AND x1.sno2 <> c_null_val
									THEN x1.sno2
									ELSE x1.par_sno2
								END,
								CASE WHEN x1.sno3_act_typ = c_act2 AND (
									l_sno3_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sno3_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno3_use_typ = c_ps_use1)
									THEN x1.sno3
									ELSE c_null_val
								END,
								CASE WHEN x1.par_sno3 IS NULL AND x1.sno3 <> c_null_val
									THEN x1.sno3
									ELSE x1.par_sno3
								END,
								CASE WHEN x1.sno4_act_typ = c_act2 AND (
									l_sno4_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
										OR l_sno4_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
										OR l_sno4_use_typ = c_ps_use1)
									THEN x1.sno4
									ELSE c_null_val
								END,
								CASE WHEN x1.par_sno4 IS NULL AND x1.sno4 <> c_null_val
									THEN x1.sno4
									ELSE x1.par_sno4
								END,
								x1.ac_slip_typ,
								x1.ac_rsn_cd,
								CASE WHEN l_wg = l_owg
									THEN NULL
									ELSE l_owg
								END,
								l_odpt,
								CASE WHEN l_asst_typ IN (c_asst1, c_asst2) AND x1.stk_id_typ = c_stk_id8
									THEN x1.bp_cd
									ELSE NULL
								END,
								CASE WHEN l_asst_typ = c_asst1 OR (l_asst_typ = c_asst2 AND x1.trd_ptn_typ = c_trd_ptn_sls)
									THEN
										CASE
											WHEN x1.trd_ptn_typ = c_trd_ptn_sls_rtn THEN NULL
											WHEN l_stk_bp_flg = c_on THEN x1.dlv_cd
											ELSE NULL
										END
									ELSE x1.bp_cd
								END,
								l_asst_typ,
								l_qty,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								c_off,
								l_owg,
								l_odpt,
								COALESCE(x1.bd_loc_cd, x1.loc_cd),
								COALESCE(x1.bd_oper_cd, x1.oper_cd),
								COALESCE(x1.bd_bp_cd, x1.bp_cd),
								x1.bd_ctg_cd,
								COALESCE(x1.par_itm_cd, x1.itm_cd),
								COALESCE(x1.par_itm_sub1, x1.itm_sub1),
								COALESCE(x1.par_itm_sub2, x1.itm_sub2),
								COALESCE(x1.par_itm_sub3, x1.itm_sub3),
								x1.itm_mfg_inst_no,
								NULL,
								c_off,
								c_off,
								c_off,
								x1.slip_no,
								x1.slip_seq_no,
								x1.trd_d_rmrks,
								NULL,
								NULL,
								NULL
								)
							;

							EXIT NEXT_LOOP;
						END IF ;

						--振替出庫、入庫実績関連の取込
						IF x1.ac_slip_typ IN (
							c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so, c_stk_sw_so,	--出庫
							c_stk_sw_gr														--入庫
							)
						THEN
							IF x1.ac_slip_typ = c_prod_itm_so AND x1.asst_typ = c_asst1 AND l_non_prod_flg = c_off THEN
								x1.asst_typ := c_asst2 ;
							ELSIF x1.ac_slip_typ = c_prod_itm_so AND x1.asst_typ = c_asst2 AND l_non_prod_flg = c_on THEN
								x1.ASST_TYP := C_ASST1 ;
							END IF ;
							IF x1.ac_slip_typ = c_prod_itm_ret_so AND x1.asst_typ = c_asst2 AND l_non_sls_flg = c_off THEN
								x1.asst_typ := c_asst1 ;
							ELSIF x1.ac_slip_typ = c_prod_itm_ret_so AND x1.asst_typ = c_asst1 AND l_non_sls_flg = c_on THEN
								x1.asst_typ := c_asst2 ;
							END IF ;
							IF l_non_prod_flg = c_off AND x1.asst_typ IN (c_asst2, c_asst3)
							OR l_non_sls_flg = c_off AND x1.asst_typ = c_asst1
							THEN
								NULL ;
							ELSE
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.asset_mng_typ <> c_asst_mng1 THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0044', l_log_no, l_log_sub_key1, l_log_sub_key2,
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm), x1.ac_slip_typ) ;
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ = c_stk_sw_gr
							OR x1.ac_slip_typ = c_prod_itm_so AND l_non_prod_flg = c_on
							OR x1.ac_slip_typ = c_prod_itm_ret_so AND l_non_sls_flg = c_on
							THEN
								--振替入庫関連は入庫部門を管理部門、出庫部門を相手部門とする
								l_mdpt	:= COALESCE(l_gr_dpt, l_gi_dpt) ;
								l_wg	:= COALESCE(x1.gr_wg_cd, x1.gi_wg_cd) ;

								l_odpt	:= COALESCE(l_gi_dpt, l_gr_dpt) ;
								l_owg	:= COALESCE(x1.gi_wg_cd, x1.gr_wg_cd) ;
							ELSE	--c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so, c_stk_sw_so
								--振替出庫関連は出庫部門を管理部門、入庫部門を相手部門とする
								l_mdpt	:= COALESCE(l_gi_dpt, l_gr_dpt) ;
								l_wg	:= COALESCE(x1.gi_wg_cd, x1.gr_wg_cd) ;

								l_odpt	:= COALESCE(l_gr_dpt, l_gi_dpt) ;
								l_owg	:= COALESCE(x1.gr_wg_cd, x1.gi_wg_cd) ;
							END IF ;

							IF	x1.ac_slip_typ = c_prod_itm_so THEN
								IF l_non_prod_flg = c_on
								THEN
									l_asst_typ := c_asst1 ;
								ELSE
									l_asst_typ := c_asst2 ;
								END IF ;
							ELSIF x1.ac_slip_typ = c_prod_itm_ret_so THEN
								IF l_asst_flg = c_on OR l_non_sls_flg = c_on
								THEN
									l_asst_typ := c_asst2 ;
								ELSE
									l_asst_typ := c_asst1 ;
								END IF ;
							END IF ;

							IF l_wg IS NULL OR l_owg IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0018', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							IF l_mdpt IS NULL OR l_odpt IS NULL THEN
								CALL fcpa_batch_log$p_data_log('MGBBD0017', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ = c_dpt_xfr_so
							OR x1.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so) AND l_asst_flg = c_on THEN
								--部門間移動のとき、出庫ＷＧと入庫ＷＧが同一かつ
								--出庫部門と入庫部門が同一のレコードはとりこまない
								IF (l_fix_dpt IS NOT NULL OR l_mdpt = l_odpt) AND l_wg = l_owg THEN
									EXIT NEXT_LOOP;
								END IF ;
							END IF ;

							l_trd_ratio := NULL ;
							IF x1.ac_slip_typ = c_stk_sw_gr THEN
								IF l_trd_flg = c_on THEN
									l_trd_ratio := mapa_std_cost$f_get_std_amt(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.ac_dt, l_wg, l_qty, l_co.stk_std_upri_typ) ;
									IF l_trd_ratio IS NULL THEN
										--標準単価マスタから単価が取得できなかったので、振替比率を設定しません。ワーキンググループＣＤ：{1}品目：{2}
										CALL fcpa_batch_log$p_data_log('MGBBD0013', l_log_no, l_log_sub_key1, l_log_sub_key2, l_wg,
										mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm)) ;
									END IF ;
								END IF ;
							END IF ;

							SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w4;
							l_cnt := l_cnt + 1;
							l_data_lno := mapa_num$f_get_seq(c_act_io_if_data_lno);
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w4 (
								_index_,
								data_lno,
								calc_ctg_cd,
								wg_cd,
								ym,
								ac_dt,
								mng_dpt_cd,
								itm_cd,
								itm_sub1,
								itm_sub2,
								itm_sub3,
								lot_no,
								sublot_no,
								sno1,
								sno2,
								sno3,
								sno4,
								ac_slip_typ,
								ac_rsn_cd,
								other_wg_cd,
								other_dpt_cd,
								bp_cd,
								stk_bp_cd,
								asst_typ,
								qty,
								amt,
								trd_cur_cd,
								trd_cur_amt,
								xrate,
								trd_grp,
								trd_ratio,
								alc_ac_cd,
								alc_amt_flg,
								alc_wg_cd,
								alc_dpt_cd,
								alc_loc_cd,
								alc_oper_cd,
								alc_bp_cd,
								alc_ctg_cd,
								alc_itm_cd,
								alc_itm_sub1,
								alc_itm_sub2,
								alc_itm_sub3,
								alc_lot_no,
								alc_sublot_no,
								alc_sno1,
								alc_sno2,
								alc_sno3,
								alc_sno4,
								alc_itm_mfg_inst_no,
								rec_eval_typ,
								no_pln_flg,
								no_itm_info_flg,
								zero_effect_flg,
								slip_no,
								slip_seq_no,
								rmrks,
								sub_char1,
								sub_char2,
								sub_char3
							) VALUES (
								l_cnt,
								l_data_lno,
								i_calc_ctg_cd,
								l_wg,
								x1.ac_ym,
								x1.ac_dt,
								COALESCE(l_fix_dpt, l_mdpt),
								x1.itm_cd,
								x1.itm_sub1,
								x1.itm_sub2,
								x1.itm_sub3,
								CASE WHEN x1.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
									AND l_asst_flg = c_off AND l_non_prod_flg = c_off AND l_non_sls_flg = c_off
									THEN x1.lot_no --生販連携関連は実績作成処理で変換する
									ELSE
 										CASE WHEN x1.lot_act_typ = c_act2 AND (
											l_lot_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
												OR l_lot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
												OR l_lot_use_typ = c_ps_use1)
											THEN x1.lot_no
											ELSE c_null_val
										END
								END,
								CASE WHEN x1.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
									AND l_asst_flg = c_off AND l_non_prod_flg = c_off AND l_non_sls_flg = c_off
									THEN x1.sublot_no --生販連携関連は実績作成処理で変換する
									ELSE
 										CASE WHEN x1.sublot_act_typ = c_act2 AND (
											l_sublot_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
												OR l_sublot_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
												OR l_sublot_use_typ = c_ps_use1)
											THEN x1.sublot_no
											ELSE c_null_val
										END
								END,
								CASE WHEN x1.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
									AND l_asst_flg = c_off AND l_non_prod_flg = c_off AND l_non_sls_flg = c_off
									THEN x1.sno1 --生販連携関連は実績作成処理で変換する
									ELSE
 										CASE WHEN x1.sno1_act_typ = c_act2 AND (
											l_sno1_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
												OR l_sno1_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
												OR l_sno1_use_typ = c_ps_use1)
											THEN x1.sno1
											ELSE c_null_val
										END
								END,
								CASE WHEN x1.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
									AND l_asst_flg = c_off AND l_non_prod_flg = c_off AND l_non_sls_flg = c_off
									THEN x1.sno2 --生販連携関連は実績作成処理で変換する
									ELSE
 										CASE WHEN x1.sno2_act_typ = c_act2 AND (
											l_sno2_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
												OR l_sno2_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
												OR l_sno2_use_typ = c_ps_use1)
											THEN x1.sno2
											ELSE c_null_val
										END
								END,
								CASE WHEN x1.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
									AND l_asst_flg = c_off AND l_non_prod_flg = c_off AND l_non_sls_flg = c_off
									THEN x1.sno3 --生販連携関連は実績作成処理で変換する
									ELSE
 										CASE WHEN x1.sno3_act_typ = c_act2 AND (
											l_sno3_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
												OR l_sno3_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
												OR l_sno3_use_typ = c_ps_use1)
											THEN x1.sno3
											ELSE c_null_val
										END
								END,
								CASE WHEN x1.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
									AND l_asst_flg = c_off AND l_non_prod_flg = c_off AND l_non_sls_flg = c_off
									THEN x1.sno4 --生販連携関連は実績作成処理で変換する
									ELSE
 										CASE WHEN x1.sno4_act_typ = c_act2 AND (
											l_sno4_use_typ = c_ps_use2 AND x1.asst_typ IN (c_asst2, c_asst3)
												OR l_sno4_use_typ = c_ps_use3 AND x1.asst_typ = c_asst1
												OR l_sno4_use_typ = c_ps_use1)
											THEN x1.sno4
											ELSE c_null_val
										END
								END,
								--販売資産を生産資産として取込む場合は部門間移動として扱う
								CASE WHEN x1.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so) AND l_asst_flg = c_on
									THEN c_dpt_xfr_so
									ELSE x1.ac_slip_typ
								END,
								x1.ac_rsn_cd,
								CASE WHEN l_wg = l_owg
									THEN NULL
									ELSE l_owg
								END,
								COALESCE(l_fix_dpt, l_odpt),
								null,
								CASE WHEN l_asst_typ = c_asst1
									THEN
										CASE WHEN l_stk_bp_flg = c_on
											THEN x1.dlv_cd
											ELSE NULL
										END
									ELSE x1.bp_cd
								END,
								l_asst_typ,
								CASE WHEN x1.ac_slip_typ = c_prod_itm_so AND l_non_prod_flg = c_on
								OR x1.ac_slip_typ = c_prod_itm_ret_so AND l_non_sls_flg = c_on
									THEN -1 * l_qty
									ELSE l_qty
								END,
								NULL,
								NULL,
								NULL,
								NULL,
								CASE WHEN x1.ac_slip_typ = c_dpt_xfr_so
									THEN CONCAT(c_str_trd3, l_data_lno::VARCHAR)
								WHEN x1.ac_slip_typ IN (c_stk_sw_so, c_stk_sw_gr)
									THEN CONCAT(c_str_trd2, x1.act_no)
								ELSE --c_prod_itm_so, c_prod_itm_ret_so
									CASE WHEN l_non_prod_flg = c_off AND l_non_sls_flg = c_off
										THEN CONCAT(c_str_trd3, l_data_lno::VARCHAR)
										ELSE NULL
									END
								END,
								l_trd_ratio,
								NULL,
								c_off,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								c_off,
								c_off,
								c_off,
								x1.slip_no,
								x1.slip_seq_no,
								x1.trd_d_rmrks,
								NULL,
								NULL,
								NULL
								)
							;

							EXIT NEXT_LOOP;
						END IF ;

						--売上実績関連の取込
						IF x1.ac_slip_typ IN (c_sls, c_sls_ret, c_sls_dscnt, c_sls_xtra)
						THEN
							IF l_non_sls_flg = c_off THEN
								NULL ;
							ELSE
								EXIT NEXT_LOOP;
							END IF ;

							IF x1.ac_slip_typ IN (c_sls_dscnt, c_sls_xtra) THEN
								--負担部門を管理部門とする
								l_mdpt	:= COALESCE(l_bd_dpt, l_sls_dpt) ;
								l_wg	:= x1.bd_wg_cd ;

								IF x1.ac_slip_typ = c_sls_dscnt THEN
									--売上値引は符号を反転させる
									l_sign	:= -1 ;
								ELSE
									--符号はそのまま
									l_sign	:= 1 ;
								END IF ;
							ELSIF x1.ac_slip_typ = c_sls_ret THEN
								--入庫部門を管理部門とする
								l_mdpt	:= COALESCE(l_gr_dpt, COALESCE(l_bd_dpt, l_sls_dpt)) ;
								l_wg	:= COALESCE(x1.gr_wg_cd, x1.bd_wg_cd) ;

								--売上返品は符号を反転させる
								l_sign	:= -1 ;
							ELSE
								--出庫部門を管理部門とする
								l_mdpt	:= COALESCE(l_gi_dpt, COALESCE(l_bd_dpt, l_sls_dpt)) ;
								l_wg	:= COALESCE(x1.gi_wg_cd, x1.bd_wg_cd) ;

								--符号はそのまま
								l_sign	:= 1 ;
							END IF ;
							-- 値引品目かつ売上、売上返品は符号を反転する
							IF x1.dscnt_itm_flg = c_on AND x1.ac_slip_typ IN (c_sls, c_sls_ret) THEN
								l_sign := - l_sign ;
							END IF ;

							l_odpt	:= l_sls_dpt ;

							IF l_wg IS NULL THEN
								IF x1.ac_slip_typ IN (c_sls_dscnt, c_sls_xtra) THEN
									CALL fcpa_batch_log$p_data_log('MGBBD0020', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								ELSE
									CALL fcpa_batch_log$p_data_log('MGBBD0018', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
									l_dpt_err := c_err ;
								END IF ;
								EXIT NEXT_LOOP;
							END IF ;

							IF l_mdpt IS NULL OR l_odpt IS NULL THEN
									CALL fcpa_batch_log$p_data_log('MGBBD0017', l_log_no, l_log_sub_key1, l_log_sub_key2, x1.slip_no, x1.slip_seq_no::VARCHAR) ;
								l_dpt_err := c_err ;
								EXIT NEXT_LOOP;
							END IF ;

							SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w5;
							l_cnt := l_cnt + 1;
							INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w5 (
								_index_,
								data_lno,
								calc_ctg_cd,
								wg_cd,
								ym,
								ac_dt,
								mng_dpt_cd,
								itm_cd,
								itm_sub1,
								itm_sub2,
								itm_sub3,
								lot_no,
								sublot_no,
								sno1,
								sno2,
								sno3,
								sno4,
								ac_slip_typ,
								ac_rsn_cd,
								asst_typ,
								qty,
								amt,
								trd_cur_cd,
								trd_cur_amt,
								xrate,
								cst_cd,
								dlv_cd,
								sls_dpt_cd,
								sls_usr_cd,
								slo_no,
								iv_no,
								stk_bp_cd,
								alc_dpt_cd,
								dest_cd1,
								dest_cd2,
								dest_cd3,
								cost_sls_cd1,
								cost_sls_cd2,
								cost_sls_cd3,
								cost_sls_cd4,
								cost_sls_cd5,
								alc_val1,
								alc_val2,
								alc_val3,
								alc_val4,
								alc_val5,
								rec_eval_typ,
								no_pln_flg,
								no_itm_info_flg,
								no_eval_flg,
								zero_effect_flg,
								slip_no,
								slip_seq_no,
								rmrks,
								sub_char1,
								sub_char2,
								sub_char3
							) VALUES (
								l_cnt,
								mapa_num$f_get_seq(c_act_sls_if_data_lno),
								i_calc_ctg_cd,
								l_wg,
								x1.ac_ym,
								x1.ac_dt,
								COALESCE(l_fix_dpt, l_mdpt),
								x1.itm_cd,
								x1.itm_sub1,
								x1.itm_sub2,
								x1.itm_sub3,
								CASE WHEN l_lot_use_typ <> c_ps_use2 AND x1.lot_act_typ = c_act2
									THEN x1.lot_no
									ELSE c_null_val
								END,
								CASE WHEN l_sublot_use_typ <> c_ps_use2 AND x1.sublot_act_typ = c_act2
									THEN x1.sublot_no
									ELSE c_null_val
								END,
								CASE WHEN l_sno1_use_typ <> c_ps_use2 AND x1.sno1_act_typ = c_act2
									THEN x1.sno1
									ELSE c_null_val
								END,
								CASE WHEN l_sno2_use_typ <> c_ps_use2 AND x1.sno2_act_typ = c_act2
									THEN x1.sno2
									ELSE c_null_val
								END,
								CASE WHEN l_sno3_use_typ <> c_ps_use2 AND x1.sno3_act_typ = c_act2
									THEN x1.sno3
									ELSE c_null_val
								END,
								CASE WHEN l_sno4_use_typ <> c_ps_use2 AND x1.sno4_act_typ = c_act2
									THEN x1.sno4
									ELSE c_null_val
								END,
								x1.ac_slip_typ,
								x1.ac_rsn_cd,
								l_asst_typ,
								l_qty * l_sign,
								x1.amt * l_sign,
								x1.trd_cur_cd,
								x1.trd_cur_amt * l_sign,
								x1.xrate,
								x1.cst_cd,
								x1.dlv_cd,
								l_odpt,
								x1.sls_usr_cd,
								x1.slo_no,
								x1.iv_no,
								--納品先としてのみ使用するコードを納品先として扱う
								CASE WHEN l_stk_bp_flg = c_on AND x1.ac_slip_typ = c_sls AND x1.dlv_flg = c_on
									THEN x1.dlv_cd
									ELSE NULL
								END,
								l_odpt,
								x1.dest_cd1,
								x1.dest_cd2,
								x1.dest_cd3,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								c_off,
								c_off,
								c_off,
								c_off,
								x1.slip_no,
								x1.slip_seq_no,
								x1.trd_d_rmrks,
								NULL,
								NULL,
								NULL
								)
							;

							CALL mgpa_ins_scm2mgtif$p_col_proc_sls();

							EXIT NEXT_LOOP;
						END IF ;

					END; -- NEXT_LOOP

					IF l_dpt_err = c_err THEN
						EXIT NEXT_LOOP_ERR;
					END IF ;

					INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_id (slip_no, slip_seq_no) VALUES (x1.slip_no, x1.slip_seq_no);

					SELECT
						(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w1) +
						(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w2) +
						(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w3) +
						(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w4) +
						(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w5) +
						(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w6) +
						(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w7)
					INTO STRICT l_cnt;

					IF l_cnt > c_max_cnt THEN
						CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);
					END IF ;

					l_rec_cnt := l_rec_cnt + 1 ;

					EXIT SKIP_ERR;

				END; -- NEXT_LOOP_ERR

				l_rslt := c_err;

			END; -- SKIP_ERR

		END LOOP;

		CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);

		TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_chk_itm;
		TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_chk_oper;

		FOR r1 IN
			SELECT
				t.calc_ctg_cd, t.wg_cd, t.ym, t.ac_dt, t.par_itm_cd,
				t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3,
				t.par_lot_no, t.par_sublot_no, t.par_sno1, t.par_sno2, t.par_sno3, t.par_sno4,
				t.itm_mfg_inst_no,
				t.mfg_act_no,
				t.oper_act_no,
				t.loc_cd, t.str_ln_cd,
				t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.ac_slip_typ, t.ac_rsn_cd,
				t.stk_bp_cd, t.asst_typ,
				SUM(t.qty) qty,
				SUM(t.amt) amt,
				t.trd_cur_cd,
				SUM(t.trd_cur_amt) trd_cur_amt,
				t.xrate, t.rec_eval_typ, t.expns_cd,
				MAX(t.slip_no) slip_no,
				MAX(t.slip_seq_no) slip_seq_no,
				MAX(t.rmrks) rmrks
			FROM mgw_act_inpt_if t
			WHERE 0=0
			GROUP BY t.calc_ctg_cd, t.wg_cd, t.ym, t.ac_dt,
				t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3,
				t.par_lot_no, t.par_sublot_no, t.par_sno1, t.par_sno2, t.par_sno3, t.par_sno4,
				t.itm_mfg_inst_no,
				t.mfg_act_no,
				t.oper_act_no,
				t.loc_cd, t.str_ln_cd,
				t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.ac_slip_typ, t.ac_rsn_cd,
				t.stk_bp_cd, t.asst_typ,
				t.trd_cur_cd, t.xrate,
				t.rec_eval_typ, t.expns_cd
		LOOP

			<<NEXT_LOOP_W>>
			BEGIN

				IF COALESCE(r1.qty, 0) = 0 AND COALESCE(r1.amt, 0) = 0 AND COALESCE(r1.trd_cur_amt, 0) = 0 THEN
					EXIT NEXT_LOOP_W;
				END IF;

				SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$tmp_w3;
				l_cnt := l_cnt + 1;
				INSERT INTO mgpa_ins_scm2mgtif$p_if$tmp_w3 (
					_index_,
					calc_ctg_cd,
					wg_cd,
					ym,
					ac_dt,
					par_itm_cd,
					par_itm_sub1,
					par_itm_sub2,
					par_itm_sub3,
					par_lot_no,
					par_sublot_no,
					par_sno1,
					par_sno2,
					par_sno3,
					par_sno4 ,
					itm_mfg_inst_no,
					mfg_act_no,
					oper_act_no,
					loc_cd,
					str_ln_cd,
					mng_dpt_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					lot_no,
					sublot_no,
					sno1,
					sno2,
					sno3,
					sno4 ,
					ac_slip_typ,
					ac_rsn_cd,
					stk_bp_cd,
					asst_typ,
					qty,
					amt,
					trd_cur_cd,
					trd_cur_amt,
					xrate,
					rec_eval_typ,
					expns_cd,
					slip_no,
					slip_seq_no,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3
				) VALUES (
					l_cnt,
					r1.calc_ctg_cd,
					r1.wg_cd,
					r1.ym,
					r1.ac_dt,
					r1.par_itm_cd,
					r1.par_itm_sub1,
					r1.par_itm_sub2,
					r1.par_itm_sub3,
					r1.par_lot_no,
					r1.par_sublot_no,
					r1.par_sno1,
					r1.par_sno2,
					r1.par_sno3,
					r1.par_sno4,
					r1.itm_mfg_inst_no,
					r1.mfg_act_no,
					r1.oper_act_no,
					r1.loc_cd,
					r1.str_ln_cd,
					r1.mng_dpt_cd,
					r1.itm_cd,
					r1.itm_sub1,
					r1.itm_sub2,
					r1.itm_sub3,
					r1.lot_no,
					r1.sublot_no,
					r1.sno1,
					r1.sno2,
					r1.sno3,
					r1.sno4,
					r1.ac_slip_typ,
					r1.ac_rsn_cd,
					r1.stk_bp_cd,
					r1.asst_typ,
					r1.qty,
					r1.amt,
					r1.trd_cur_cd,
					r1.trd_cur_amt,
					r1.xrate,
					r1.rec_eval_typ,
					r1.expns_cd,
					r1.slip_no,
					r1.slip_seq_no,
					r1.rmrks,
					NULL,
					NULL,
					NULL
					)
				;

			END;

		END LOOP;

		DELETE FROM mgw_act_inpt_if t;

		CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);

		FOR r1 IN
			SELECT DISTINCT
				w.par_itm_cd,
				w.par_itm_sub1,
				w.par_itm_sub2,
				w.par_itm_sub3,
				w.calc_ctg_cd,
				w.wg_cd,
				w.mng_dpt_cd,
				w.par_lot_no, w.par_sublot_no, w.par_sno1, w.par_sno2, w.par_sno3, w.par_sno4,
				w.loc_cd, w.str_ln_cd, m.sppl_cd
			FROM mgw_act_inpt_if w
				LEFT OUTER JOIN mam_loc m ON (w.loc_cd = m.loc_cd)
			WHERE 0=0
		LOOP
			SELECT MAX(t.itm_mfg_inst_no)
			INTO STRICT l_itm_mfg_inst_no
			FROM mgt_itm_mfg_inst t
			WHERE 0=0
			AND t.itm_mfg_inst_no LIKE CONCAT(c_str_no, '%')
			AND LENGTH(t.itm_mfg_inst_no) = c_itm_mfg_inst_length + LENGTH(c_str_no)
			AND t.mfg_act_no = c_null_val
			AND t.itm_cd = r1.par_itm_cd
			AND t.itm_sub1 = r1.par_itm_sub1
			AND t.itm_sub2 = r1.par_itm_sub2
			AND t.itm_sub3 = r1.par_itm_sub3
			AND t.calc_ctg_cd = r1.calc_ctg_cd
			AND t.wg_cd = r1.wg_cd
			AND t.mng_dpt_cd = r1.mng_dpt_cd
			AND t.lot_no = r1.par_lot_no
			AND t.sublot_no = r1.par_sublot_no
			AND t.sno1 = r1.par_sno1
			AND t.sno2 = r1.par_sno2
			AND t.sno3 = r1.par_sno3
			AND t.sno4 = r1.par_sno4
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_inpt_if x
					WHERE 0=0
					AND x.calc_ctg_cd = t.calc_ctg_cd
					AND x.ym = i_ym
					AND x.par_itm_cd = t.itm_cd
					AND x.par_itm_sub1 = t.itm_sub1
					AND x.par_itm_sub2 = t.itm_sub2
					AND x.par_itm_sub3 = t.itm_sub3
					AND x.itm_mfg_inst_no = t.itm_mfg_inst_no
					AND x.mfg_act_no = t.mfg_act_no
					AND x.loc_cd = r1.loc_cd
					AND x.str_ln_cd = r1.str_ln_cd
					)
			;

			IF l_itm_mfg_inst_no IS NULL THEN
				l_itm_mfg_inst_no := CONCAT(c_str_no, LPAD(mapa_num$f_get_seq(c_itm_mfg_inst)::VARCHAR, c_itm_mfg_inst_length, '0'));


				SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w6;
				l_cnt := l_cnt + 1;
				INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w6 (
					_index_,
					calc_ctg_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no,
					wg_cd,
					mng_dpt_cd,
					lot_no,
					sublot_no,
					sno1,
					sno2,
					sno3,
					sno4,
					sppl_cd,
					po_no,
					slo_no,
					iv_no,
					asst_typ,
					qty,
					schd_st_dt,
					schd_end_dt,
					act_st_dt,
					act_end_dt,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3
				) VALUES (
					l_cnt,
					r1.calc_ctg_cd,
					r1.par_itm_cd,
					r1.par_itm_sub1,
					r1.par_itm_sub2,
					r1.par_itm_sub3,
					l_itm_mfg_inst_no,
					c_null_val,
					r1.wg_cd,
					r1.mng_dpt_cd,
					r1.par_lot_no,
					r1.par_sublot_no,
					r1.par_sno1,
					r1.par_sno2,
					r1.par_sno3,
					r1.par_sno4,
					r1.sppl_cd,
					NULL,
					NULL,
					NULL,
					c_asst2,
					0,
					NULL,
					NULL,
					NULL,
					NULL,
					NULL,
					NULL,
					NULL,
					NULL
					)
				;

				CALL mgpa_ins_scm2mgtif$p_col_proc_itm();

			END IF;

			FOR r2 IN
				SELECT w.*
				FROM mgw_act_inpt_if w
				WHERE 0=0
				AND w.par_itm_cd = r1.par_itm_cd
				AND w.par_itm_sub1 = r1.par_itm_sub1
				AND w.par_itm_sub2 = r1.par_itm_sub2
				AND w.par_itm_sub3 = r1.par_itm_sub3
				AND w.calc_ctg_cd = r1.calc_ctg_cd
				AND w.mng_dpt_cd = r1.mng_dpt_cd
				AND w.par_lot_no = r1.par_lot_no
				AND w.par_sublot_no = r1.par_sublot_no
				AND w.par_sno1 = r1.par_sno1
				AND w.par_sno2 = r1.par_sno2
				AND w.par_sno3 = r1.par_sno3
				AND w.par_sno4 = r1.par_sno4
				AND w.loc_cd = r1.loc_cd
				AND w.str_ln_cd = r1.str_ln_cd
			LOOP

				SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w3;
				l_cnt := l_cnt + 1;
				INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w3 (
					_index_,
					data_lno,
					calc_ctg_cd,
					wg_cd,
					ym,
					ac_dt,
					par_itm_cd,
					par_itm_sub1,
					par_itm_sub2,
					par_itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no,
					oper_act_no,
					loc_cd,
					str_ln_cd,
					mng_dpt_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					lot_no,
					sublot_no,
					sno1,
					sno2,
					sno3,
					sno4 ,
					ac_slip_typ,
					ac_rsn_cd,
					stk_bp_cd,
					asst_typ,
					qty,
					amt,
					trd_cur_cd,
					trd_cur_amt,
					xrate,
					rec_eval_typ,
					expns_cd,
					no_pln_flg,
					no_itm_info_flg,
					zero_effect_flg,
					slip_no,
					slip_seq_no,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3
				) VALUES (
					l_cnt,
					mapa_num$f_get_seq(c_act_inpt_if_data_lno),
					r2.calc_ctg_cd,
					r2.wg_cd,
					r2.ym,
					r2.ac_dt,
					r2.par_itm_cd,
					r2.par_itm_sub1,
					r2.par_itm_sub2,
					r2.par_itm_sub3,
					 l_itm_mfg_inst_no,
					r2.mfg_act_no,
					r2.oper_act_no,
					r2.loc_cd,
					r2.str_ln_cd,
					r2.mng_dpt_cd,
					r2.itm_cd,
					r2.itm_sub1,
					r2.itm_sub2,
					r2.itm_sub3,
					r2.lot_no,
					r2.sublot_no,
					r2.sno1,
					r2.sno2,
					r2.sno3,
					r2.sno4,
					r2.ac_slip_typ,
					r2.ac_rsn_cd,
					r2.stk_bp_cd,
					r2.asst_typ,
					r2.qty,
					r2.amt,
					r2.trd_cur_cd,
					r2.trd_cur_amt,
					r2.xrate,
					r2.rec_eval_typ,
					r2.expns_cd,
					c_off,
					c_off,
					 c_off,
					r2.slip_no,
					r2.slip_seq_no,
					r2.rmrks,
					NULL,
					NULL,
					NULL
					)
				;

			END LOOP;
		END LOOP;

		CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);

		SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$tmp_w6;
		IF l_cnt > 0 THEN

			-- 既存のデータを優先するので一意制約はエラーとしない
			INSERT INTO mgt_itm_mfg_inst (
				calc_ctg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				wg_cd,
				mng_dpt_cd,
				lot_no,
				sublot_no,
				sno1,
				sno2,
				sno3,
				sno4,
				sppl_cd,
				po_no,
				slo_no,
				iv_no,
				asst_typ,
				qty,
				schd_st_dt,
				schd_end_dt,
				act_st_dt,
				act_end_dt,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
			) SELECT
				t.calc_ctg_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.itm_mfg_inst_no,
				t.mfg_act_no,
				t.wg_cd,
				t.mng_dpt_cd,
				t.lot_no,
				t.sublot_no,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.sppl_cd,
				t.po_no,
				t.slo_no,
				t.iv_no,
				t.asst_typ,
				t.qty,
				t.schd_st_dt,
				t.schd_end_dt,
				t.act_st_dt,
				t.act_end_dt,
				t.rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3
			FROM mgpa_ins_scm2mgtif$p_if$tmp_w6 t
			WHERE NOT EXISTS (
					SELECT 'X' FROM mgt_itm_mfg_inst w
					WHERE w.calc_ctg_cd = t.calc_ctg_cd
					AND w.itm_cd = t.itm_cd
					AND w.itm_sub1 = t.itm_sub1
					AND w.itm_sub2 = t.itm_sub2
					AND w.itm_sub3 = t.itm_sub3
					AND w.itm_mfg_inst_no = t.itm_mfg_inst_no
					AND w.mfg_act_no = t.mfg_act_no
					)
			;

			GET DIAGNOSTICS l_cnt = ROW_COUNT;

			l_mfg_inst_cnt := l_mfg_inst_cnt + l_cnt;
		END IF;

		IF u6 > 0 THEN
			DELETE FROM mgt_itm_mfg_inst t
			WHERE 0=0
			AND EXISTS (
				 	SELECT 'X' FROM mgpa_ins_scm2mgtif$p_if$upd_w6 w
				 	WHERE 0=0
					AND t.calc_ctg_cd = w.calc_ctg_cd
					AND t.itm_cd = w.itm_cd
					AND t.itm_sub1 = w.itm_sub1
					AND t.itm_sub2 = w.itm_sub2
					AND t.itm_sub3 = w.itm_sub3
					AND t.itm_mfg_inst_no = w.itm_mfg_inst_no
					AND t.mfg_act_no = w.mfg_act_no
					AND t.upd_srv_req_no = fcpa_context$f_get_processid()
					)
			;

			GET DIAGNOSTICS l_cnt = ROW_COUNT ;
			l_mfg_inst_cnt := l_mfg_inst_cnt - l_cnt ;
			DELETE FROM mgt_itm_mfg_inst t
			WHERE 0=0
			AND EXISTS (
				 	SELECT 'X' FROM mgpa_ins_scm2mgtif$p_if$upd_w6 w
				 	WHERE 0=0
					AND t.calc_ctg_cd = w.calc_ctg_cd
					AND t.itm_cd = w.itm_cd
					AND t.itm_sub1 = w.itm_sub1
					AND t.itm_sub2 = w.itm_sub2
					AND t.itm_sub3 = w.itm_sub3
					AND t.itm_mfg_inst_no = w.itm_mfg_inst_no
					AND t.mfg_act_no = w.mfg_act_no
					)
			;
			l_mfg_inst_cnt := l_mfg_inst_cnt + u6 ;

			INSERT INTO mgt_itm_mfg_inst (
				calc_ctg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				wg_cd,
				mng_dpt_cd,
				lot_no,
				sublot_no,
				sno1,
				sno2,
				sno3,
				sno4,
				sppl_cd,
				po_no,
				slo_no,
				iv_no,
				asst_typ,
				qty,
				schd_st_dt,
				schd_end_dt,
				act_st_dt,
				act_end_dt,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
			) SELECT
				t.calc_ctg_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.itm_mfg_inst_no,
				t.mfg_act_no,
				t.wg_cd,
				t.mng_dpt_cd,
				t.lot_no,
				t.sublot_no,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.sppl_cd,
				t.po_no,
				t.slo_no,
				t.iv_no,
				t.asst_typ,
				t.qty,
				t.schd_st_dt,
				t.schd_end_dt,
				t.act_st_dt,
				t.act_end_dt,
				t.rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3
			FROM mgpa_ins_scm2mgtif$p_if$upd_w6 t
			;
		END IF ;

		CALL fcpa_batch_log$p_proc_log('MGBBD0022', l_rec_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0026', l_mfg_inst_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0027', l_inst_oper_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0028', l_mfg_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0029', l_purc_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0030', l_inpt_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0031', l_io_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0032', l_sls_cnt::VARCHAR);

	END; -- SKIP_TRAN

	COMMIT;

	/* 作業実績情報の取込 */
	<<SKIP_WK>>
	BEGIN

		IF i_wk = c_off OR l_non_prod_flg = c_on THEN
			EXIT SKIP_WK;
		END IF;

		CALL fcpa_batch_log$p_proc_log('MGBBD0038');

 		SELECT COUNT(*)
		INTO STRICT l_rec_cnt
		FROM mgvt_mst_wk_act t
		WHERE 0=0
		AND t.ac_dt BETWEEN l_st_dt AND l_end_dt
		AND t.wk_cost <> 0
		;

		IF l_rec_cnt = 0 THEN
			CALL fcpa_batch_log$p_proc_log('MGBBD0023', l_rec_cnt::VARCHAR);
			EXIT SKIP_WK;
		END IF;

		/* 部門のチェック */
		l_tmp_dt := NULL;
		l_rec_dpt := '{}';
		l_chk_err := c_off;

		FOR r1 IN
			SELECT
				t.ac_dt,
				t.dpt_cd
			FROM mgvt_mst_wk_act t
			WHERE 0=0
			AND t.ac_dt BETWEEN l_st_dt AND l_end_dt
			AND t.itm_mfg_inst_no IS NOT NULL
			AND t.wk_cost <> 0
			AND (
				l_itm_out_cnt = 0
				OR
				NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_itm_out m
					WHERE 0=0
					AND m.itm_cd = t.itm_cd
					AND m.itm_sub1 = t.itm_sub1
					AND m.itm_sub2 = t.itm_sub2
					AND m.itm_sub3 = t.itm_sub3
					AND m.ym <= i_ym
					)
				)
			UNION
			SELECT
				t.ac_dt,
				t.dpt_cd
			FROM mgvt_mst_wk_act t
			WHERE 0=0
			AND t.ac_dt BETWEEN l_st_dt AND l_end_dt
			AND t.itm_mfg_inst_no IS NULL
			AND (t.itm_cd IS NULL OR t.loc_cd IS NULL)
			AND t.wk_cost <> 0
			UNION
			SELECT
				t.ac_dt,
				t.dpt_cd
			FROM mgvt_mst_wk_act t
			WHERE 0=0
			AND t.ac_dt BETWEEN l_st_dt AND l_end_dt
			AND t.itm_mfg_inst_no IS NULL
			AND t.itm_cd IS NOT NULL
			AND t.loc_cd IS NOT NULL
			AND t.wk_cost <> 0
			AND (
				l_itm_out_cnt = 0
				OR
				NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_itm_out m
					WHERE 0=0
					AND m.itm_cd = t.itm_cd
					AND m.itm_sub1 = t.itm_sub1
					AND m.itm_sub2 = t.itm_sub2
					AND m.itm_sub3 = t.itm_sub3
					AND m.ym <= i_ym
					)
				)
		LOOP
			IF l_tmp_dt IS NULL OR l_tmp_dt <> r1.ac_dt THEN
				l_rec_dpt := '{}';
				l_tmp_dt := r1.ac_dt;
			END IF;

			CALL mgpa_cost_if$p_get_dpt(mapa_dpt$f_get_dpt_cd_ne(r1.dpt_cd, r1.ac_dt), l_fix_dpt, r1.ac_dt, l_rec_dpt, l_mdpt, c_on);

			IF l_mdpt IS NULL THEN
				l_rslt := c_err;
				l_chk_err := c_on;
			END IF;
		END LOOP;

		IF l_chk_err = c_on THEN
			EXIT SKIP_WK;
		END IF;

		/* 取得するときは年月ごとに再取り込みを行う */
		DELETE FROM mgt_itm_mfg_inst t
		WHERE 0=0
		AND t.itm_mfg_inst_no LIKE CONCAT(c_str_no2, '%')
		AND LENGTH(t.itm_mfg_inst_no) = c_itm_mfg_inst_length + LENGTH(c_str_no2)
		AND t.mfg_act_no = c_null_val
		AND t.calc_ctg_cd = i_calc_ctg_cd
		AND EXISTS (
				SELECT 'X'
				FROM mgt_act_inst_wk_if w
				WHERE 0=0
				AND w.itm_cd = t.itm_cd
				AND w.itm_sub1 = t.itm_sub1
				AND w.itm_sub2 = t.itm_sub2
				AND w.itm_sub3 = t.itm_sub3
				AND w.itm_mfg_inst_no = t.itm_mfg_inst_no
				AND w.mfg_act_no = t.mfg_act_no
				AND w.calc_ctg_cd = t.calc_ctg_cd
				AND w.ym = i_ym
				AND (i_rerun = c_on OR w.scm_if_flg = c_on)
				)
		;

		DELETE FROM mgt_act_inst_wk_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd AND (i_rerun = c_on OR t.scm_if_flg = c_on);
		DELETE FROM mgt_act_other_wk_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd AND (i_rerun = c_on OR t.scm_if_flg = c_on);

		/* 指図工数実績 */
		INSERT INTO mgt_act_inst_wk_if (
			data_lno,
			calc_ctg_cd, wg_cd,
			ym,
			ac_dt,
			itm_cd, itm_sub1, itm_sub2, itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd, str_ln_cd,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			no_pln_flg, no_itm_info_flg,
			wk_act_no,
			rmrks, sub_char1, sub_char2, sub_char3, scm_if_flg)
		SELECT
			mapa_num$f_get_seq(c_act_inst_wk_if_data_lno),	
			i_calc_ctg_cd, t.loc_wg_cd,
			i_ym,
			t.ac_dt,
			t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			CASE m2.itm_mfg_inst_no_set_typ
				WHEN c_inst_loc THEN CONCAT(c_str_no3, fcpa_postgres_util$substr(t.loc_cd, 1, c_itm_mfg_inst_no_l - LENGTH(c_str_no3)))
				ELSE t.itm_mfg_inst_no
			END,
			CASE m2.mfg_act_no_set_typ
				WHEN c_mfg_non THEN
				CASE m2.itm_mfg_inst_no_set_typ
					WHEN c_inst_loc THEN COALESCE(fcpa_postgres_util$substr(t.loc_cd, c_itm_mfg_inst_no_l - LENGTH(c_str_no3) + 1, c_mfg_act_no_l), c_null_val)
					ELSE c_null_val
				END
				ELSE
				CASE t8.mfg_inst_unit_typ
					WHEN c_oper THEN c_null_val
					ELSE COALESCE(t.mfg_act_no, c_null_val)
				END
			END,
			CASE m2.oper_act_no_set_typ
				WHEN c_oper_non THEN c_null_val
				WHEN c_oper_oper THEN t.oper_cd
				ELSE COALESCE(CASE l_oper_sum_flg
					WHEN c_on THEN t.oper_cd
					ELSE t.oper_act_no
				END, c_null_val)
			END,
			t.loc_cd, COALESCE(t.str_ln_cd, c_null_val),
			t.wk_cost_cd,
			t.wk_rsn_cd,
			t.wk_cost,
			c_off, c_off,
			t.wk_act_no,
			t.intr_rmrks, NULL, NULL, NULL,
			c_on
		FROM mgvt_mst_wk_act t
			LEFT OUTER JOIN mgvt_mst_mfg_act t7 ON (t7.mfg_act_no = t.mfg_act_no)
			LEFT OUTER JOIN mgvt_mst_mfg_inst t8 ON (t8.mfg_inst_no = t7.mfg_inst_no)
			LEFT OUTER JOIN mam_itm_srch m1 ON (
					t.itm_cd = m1.itm_cd
					AND t.itm_sub1 = m1.itm_sub1
					AND t.itm_sub2 = m1.itm_sub2
					AND t.itm_sub3 = m1.itm_sub3
					AND m1.del_flg = c_off
					AND m1.release_flg = c_on)
			LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd)
		WHERE 0=0
		AND t.ac_dt BETWEEN l_st_dt AND l_end_dt
		AND t.itm_mfg_inst_no IS NOT NULL
		AND t.wk_cost <> 0
		AND (
			l_itm_out_cnt = 0
			OR
			NOT EXISTS (
				SELECT 'X'
				FROM mam_cost_itm_out m
				WHERE 0=0
				AND m.itm_cd = t.itm_cd
				AND m.itm_sub1 = t.itm_sub1
				AND m.itm_sub2 = t.itm_sub2
				AND m.itm_sub3 = t.itm_sub3
				AND m.ym <= i_ym
				)
			)
		;

		GET DIAGNOSTICS l_inst_wk_row_cnt = ROW_COUNT;

		/* 指図外工数実績 */
		INSERT INTO mgt_act_other_wk_if (
			data_lno,
			calc_ctg_cd, wg_cd,
			ym, ac_dt,
			dpt_cd, ctg_cd,
			loc_cd, oper_cd,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			no_pln_flg,
			wk_act_no,
			rmrks, sub_char1, sub_char2, sub_char3, scm_if_flg)
		SELECT
			mapa_num$f_get_seq(c_act_other_wk_if_data_lno),
			i_calc_ctg_cd, t.dpt_wg_cd,
			i_ym, t.ac_dt,
			mgpa_cost_if$f_get_dpt(mapa_dpt$f_get_dpt_cd_ne(t.dpt_cd, t.ac_dt), NULL, t.ac_dt, c_off), NULL,
			t.loc_cd, t.oper_cd,
			t.lot_no,
			t.sublot_no,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.wk_cost_cd,
			t.wk_rsn_cd,
			t.wk_cost, c_off,
			t.wk_act_no,
			t.intr_rmrks, NULL, NULL, NULL, c_on
		FROM mgvt_mst_wk_act t
		WHERE 0=0
		AND t.ac_dt BETWEEN l_st_dt AND l_end_dt
		AND t.itm_mfg_inst_no IS NULL
		AND (t.itm_cd IS NULL OR t.loc_cd IS NULL)
		AND t.wk_cost <> 0
		AND t.dpt_wg_cd IS NOT NULL
		;

		GET DIAGNOSTICS l_other_wk_cnt = ROW_COUNT;

		/* 指図工程情報 */
		TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w7;
		l_inst_oper_cnt := 0;

		FOR r1 IN
			SELECT DISTINCT
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				CASE m2.itm_mfg_inst_no_set_typ
					WHEN c_inst_loc THEN CONCAT(c_str_no3, fcpa_postgres_util$substr(t.loc_cd, 1, c_itm_mfg_inst_no_l - LENGTH(c_str_no3)))
					ELSE t.itm_mfg_inst_no
				END itm_mfg_inst_no,
				CASE m2.mfg_act_no_set_typ
					WHEN c_mfg_non THEN
					CASE m2.itm_mfg_inst_no_set_typ
						WHEN c_inst_loc THEN COALESCE(fcpa_postgres_util$substr(t.loc_cd, c_itm_mfg_inst_no_l - LENGTH(c_str_no3) + 1, c_mfg_act_no_l), c_null_val)
						ELSE c_null_val
					END
					ELSE
					CASE t8.mfg_inst_unit_typ
						WHEN c_oper THEN c_null_val
						ELSE COALESCE(t.mfg_act_no, c_null_val)
					END
				END mfg_act_no,
				CASE m2.oper_act_no_set_typ
					WHEN c_oper_non THEN c_null_val
					WHEN c_oper_oper THEN t.oper_cd
					ELSE
					CASE l_oper_sum_flg
						WHEN c_on THEN t.oper_cd
						ELSE t.oper_act_no
					END
				END oper_act_no,
				t.loc_wg_cd wg_cd,
				mgpa_cost_if$f_get_dpt(mapa_dpt$f_get_dpt_cd_ne(t.dpt_cd, t.ac_dt), l_fix_dpt, t.ac_dt, c_off) mng_dpt_cd,
				t.oper_cd,
				CASE m2.oper_act_no_set_typ
					WHEN c_oper_oper THEN 1
					ELSE
					CASE l_oper_sum_flg
						WHEN c_on THEN 1
						ELSE COALESCE(t3.oper_seq, 0)
					END
				END oper_seq,
				CASE m2.oper_act_no_set_typ
					WHEN c_oper_oper THEN 1
					ELSE
					CASE l_oper_sum_flg
						WHEN c_on THEN 1
						ELSE t3.disp_seq
					END
				END disp_seq,
				CASE m2.oper_act_no_set_typ
					WHEN c_oper_oper THEN NULL
					ELSE
					CASE l_oper_sum_flg
						WHEN c_on THEN NULL
						ELSE t2.base_unit_qty
					END
				END qty
			FROM mgvt_mst_wk_act t
				LEFT OUTER JOIN mgvt_mst_oper_act t2 ON (t.oper_act_no = t2.oper_act_no)
				LEFT OUTER JOIN mgvt_mst_oper_inst t3 ON (t2.oper_inst_no = t3.oper_inst_no)
				LEFT OUTER JOIN mgvt_mst_mfg_act t7 ON (t7.mfg_act_no = t.mfg_act_no)
				LEFT OUTER JOIN mgvt_mst_mfg_inst t8 ON (t8.mfg_inst_no = t7.mfg_inst_no)
				LEFT OUTER JOIN mam_itm_srch m1 ON (
						t.itm_cd = m1.itm_cd
						AND t.itm_sub1 = m1.itm_sub1
						AND t.itm_sub2 = m1.itm_sub2
						AND t.itm_sub3 = m1.itm_sub3
						AND m1.del_flg = c_off
						AND m1.release_flg = c_on)
				LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd)
			WHERE 0=0
			AND t.ac_dt BETWEEN l_st_dt AND l_end_dt
			AND t.itm_mfg_inst_no IS NOT NULL
			AND t.oper_act_no IS NOT NULL
			AND t.oper_act_no <> c_null_val
			AND t.oper_cd IS NOT NULL
			AND t.oper_cd <> c_null_val
			AND t.wk_cost <> 0
			AND COALESCE(m2.oper_act_no_set_typ, c_null_val) <> c_oper_non
			AND (
				l_itm_out_cnt = 0
				OR
				NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_itm_out m
					WHERE 0=0
					AND m.itm_cd = t.itm_cd
					AND m.itm_sub1 = t.itm_sub1
					AND m.itm_sub2 = t.itm_sub2
					AND m.itm_sub3 = t.itm_sub3
					AND m.ym <= i_ym
					)
				)
		LOOP

			SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w7;
			l_cnt := l_cnt + 1;
			INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w7 (
				_index_,
				calc_ctg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				oper_act_no,
				wg_cd,
				mng_dpt_cd,
				oper_cd,
				oper_seq,
				disp_seq,
				qty,
				schd_st_dt,
				schd_end_dt,
				act_st_dt,
				act_end_dt,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
			) VALUES (
				l_cnt,
				i_calc_ctg_cd,
				r1.itm_cd,
				r1.itm_sub1,
				r1.itm_sub2,
				r1.itm_sub3,
				r1.itm_mfg_inst_no,
				r1.mfg_act_no,
				r1.oper_act_no,
				r1.wg_cd,
				r1.mng_dpt_cd,
				r1.oper_cd,
				r1.oper_seq,
				r1.disp_seq,
				r1.qty,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL
				)
			;

			IF l_cnt > c_max_cnt THEN
				CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);
			END IF;
		END LOOP;

		CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);

		/* 指図情報は無いが品目が指定されているデータを指図工数実績として取り込む */
		TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w6;
		TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w8;
		l_inst_wk_cnt := 0;
		l_mfg_inst_cnt := 0;

		INSERT INTO mgw_act_inst_wk_if (
			calc_ctg_cd, wg_cd,
			ym, ac_dt,
			itm_cd, itm_sub1, itm_sub2, itm_sub3,
			lot_no, sublot_no, sno1, sno2, sno3, sno4,
			itm_mfg_inst_no, mfg_act_no, oper_act_no,
			loc_cd, str_ln_cd,
			mng_dpt_cd,
			wk_cost_cd, wk_rsn_cd, wk_cost,
			wk_act_no,
			rmrks, sub_char1, sub_char2, sub_char3)
		SELECT
			i_calc_ctg_cd, t.loc_wg_cd,
			i_ym, t.ac_dt,
			t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			CASE
				WHEN l_lot_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.lot_act_typ, c_act1) <> c_act1 THEN COALESCE(t.lot_no, c_null_val)
					ELSE c_null_val
				END
				ELSE c_null_val
			END lot_no,
			CASE
				WHEN l_sublot_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sublot_act_typ, c_act1) <> c_act1 THEN COALESCE(t.sublot_no, c_null_val)
					ELSE c_null_val
				END
				ELSE c_null_val
			END sublot_no,
			CASE
				WHEN l_sno1_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sno1_act_typ, c_act1) <> c_act1 THEN t.sno1
					ELSE c_null_val
				END
				ELSE c_null_val
			END sno1,
			CASE
				WHEN l_sno2_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sno2_act_typ, c_act1) <> c_act1 THEN t.sno2
					ELSE c_null_val
				END
				ELSE c_null_val
			END sno2,
			CASE
				WHEN l_sno3_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sno3_act_typ, c_act1) <> c_act1 THEN t.sno3
					ELSE c_null_val
				END
				ELSE c_null_val
			END sno3,
			CASE
				WHEN l_sno4_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sno4_act_typ, c_act1) <> c_act1 THEN t.sno4
					ELSE c_null_val
				END
				ELSE c_null_val
			END sno4,
			c_null_val, c_null_val, c_null_val,
			t.loc_cd, COALESCE(t.str_ln_cd, c_null_val),
			mgpa_cost_if$f_get_dpt(mapa_dpt$f_get_dpt_cd_ne(t.dpt_cd, t.ac_dt), l_fix_dpt, t.ac_dt, c_off),
			t.wk_cost_cd, t.wk_rsn_cd, SUM(t.wk_cost),
			MAX(t.wk_act_no),
			MAX(t.intr_rmrks), NULL, NULL, NULL
		FROM mgvt_mst_wk_act t
			INNER JOIN mam_itm_srch m1 ON (
					t.itm_cd = m1.itm_cd
					AND t.itm_sub1 = m1.itm_sub1
					AND t.itm_sub2 = m1.itm_sub2
					AND t.itm_sub3 = m1.itm_sub3
					AND m1.del_flg = c_off
					AND m1.release_flg = c_on
					AND m1.asset_mng_typ = c_asst_mng1)
			LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd)
		WHERE 0=0
		AND t.ac_dt BETWEEN l_st_dt AND l_end_dt
		AND t.itm_mfg_inst_no IS NULL
		AND t.itm_cd IS NOT NULL
		AND t.loc_cd IS NOT NULL
		AND t.wk_cost <> 0
		AND (
			l_itm_out_cnt = 0
			OR
			NOT EXISTS (
				SELECT 'X'
				FROM mam_cost_itm_out m
				WHERE 0=0
				AND m.itm_cd = t.itm_cd
				AND m.itm_sub1 = t.itm_sub1
				AND m.itm_sub2 = t.itm_sub2
				AND m.itm_sub3 = t.itm_sub3
				AND m.ym <= i_ym
				)
			)
		GROUP BY t.loc_wg_cd, t.ac_dt, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			CASE
				WHEN l_lot_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.lot_act_typ, c_act1) <> c_act1 THEN COALESCE(t.lot_no, c_null_val)
					ELSE c_null_val
				END
				ELSE c_null_val
			END,
			CASE
				WHEN l_sublot_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sublot_act_typ, c_act1) <> c_act1 THEN COALESCE(t.sublot_no, c_null_val)
					ELSE c_null_val
				END
				ELSE c_null_val
			END,
			CASE
				WHEN l_sno1_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sno1_act_typ, c_act1) <> c_act1 THEN t.sno1
					ELSE c_null_val
				END
				ELSE c_null_val
			END,
			CASE
				WHEN l_sno2_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sno2_act_typ, c_act1) <> c_act1 THEN t.sno2
					ELSE c_null_val
				END
				ELSE c_null_val
			END,
			CASE
				WHEN l_sno3_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sno3_act_typ, c_act1) <> c_act1 THEN t.sno3
					ELSE c_null_val
				END
				ELSE c_null_val
			END,
			CASE
				WHEN l_sno4_use_typ <> c_ps_use3 THEN
				CASE
					WHEN COALESCE(m2.sno4_act_typ, c_act1) <> c_act1 THEN t.sno4
					ELSE c_null_val
				END
				ELSE c_null_val
			END,
			t.loc_cd, COALESCE(t.str_ln_cd, c_null_val),
			mgpa_cost_if$f_get_dpt(mapa_dpt$f_get_dpt_cd_ne(t.dpt_cd, t.ac_dt), l_fix_dpt, t.ac_dt, c_off),
			t.wk_cost_cd, t.wk_rsn_cd
		;

		FOR r1 IN
			SELECT DISTINCT
				w.itm_cd,
				w.itm_sub1,
				w.itm_sub2,
				w.itm_sub3,
				w.calc_ctg_cd,
				w.wg_cd,
				w.mng_dpt_cd,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.loc_cd, w.str_ln_cd, m.sppl_cd
			FROM mgw_act_inst_wk_if w
				LEFT OUTER JOIN mam_loc m ON (w.loc_cd = m.loc_cd)
		LOOP
			SELECT MAX(t.itm_mfg_inst_no)
			INTO STRICT l_itm_mfg_inst_no
			FROM mgt_itm_mfg_inst t
			WHERE 0=0
			AND t.itm_mfg_inst_no LIKE CONCAT(c_str_no2, '%')
			AND LENGTH(t.itm_mfg_inst_no) = c_itm_mfg_inst_length + LENGTH(c_str_no2)
			AND t.mfg_act_no = c_null_val
			AND t.itm_cd = r1.itm_cd
			AND t.itm_sub1 = r1.itm_sub1
			AND t.itm_sub2 = r1.itm_sub2
			AND t.itm_sub3 = r1.itm_sub3
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.wg_cd = r1.wg_cd
			AND t.mng_dpt_cd = r1.mng_dpt_cd
			AND t.lot_no = r1.lot_no
			AND t.sublot_no = r1.sublot_no
			AND t.sno1 = r1.sno1
			AND t.sno2 = r1.sno2
			AND t.sno3 = r1.sno3
			AND t.sno4 = r1.sno4
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_inst_wk_if x
					WHERE 0=0
					AND x.calc_ctg_cd = t.calc_ctg_cd
					AND x.ym = i_ym
					AND x.itm_cd = t.itm_cd
					AND x.itm_sub1 = t.itm_sub1
					AND x.itm_sub2 = t.itm_sub2
					AND x.itm_sub3 = t.itm_sub3
					AND x.itm_mfg_inst_no = t.itm_mfg_inst_no
					AND x.mfg_act_no = t.mfg_act_no
					AND x.loc_cd = r1.loc_cd
					AND x.str_ln_cd = r1.str_ln_cd
					)
			;

			IF l_itm_mfg_inst_no IS NULL THEN
				l_itm_mfg_inst_no := CONCAT(c_str_no2, LPAD(mapa_num$f_get_seq(c_itm_mfg_inst)::VARCHAR, c_itm_mfg_inst_length, '0'));

				SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w6;
				l_cnt := l_cnt + 1;
				INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w6 (
					_index_,
					calc_ctg_cd,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no,
					wg_cd,
					mng_dpt_cd,
					lot_no,
					sublot_no,
					sno1,
					sno2,
					sno3,
					sno4,
					sppl_cd,
					po_no,
					slo_no,
					iv_no,
					asst_typ,
					qty,
					schd_st_dt,
					schd_end_dt,
					act_st_dt,
					act_end_dt,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3
				) VALUES (
					l_cnt,
					i_calc_ctg_cd,
					r1.itm_cd,
					r1.itm_sub1,
					r1.itm_sub2,
					r1.itm_sub3,
					l_itm_mfg_inst_no,
					c_null_val,
					r1.wg_cd,
					r1.mng_dpt_cd,
					r1.lot_no,
					r1.sublot_no,
					r1.sno1,
					r1.sno2,
					r1.sno3,
					r1.sno4,
					r1.sppl_cd,
					NULL,
					NULL,
					NULL,
					c_asst2,
					0,
					NULL,
					NULL,
					NULL,
					NULL,
					NULL,
					NULL,
					NULL,
					NULL
					)
				;

				CALL mgpa_ins_scm2mgtif$p_col_proc_itm();
			END IF;

			FOR r2 IN
				SELECT w.*
				FROM mgw_act_inst_wk_if w
				WHERE 0=0
				AND w.itm_cd = r1.itm_cd
				AND w.itm_sub1 = r1.itm_sub1
				AND w.itm_sub2 = r1.itm_sub2
				AND w.itm_sub3 = r1.itm_sub3
				AND w.calc_ctg_cd = r1.calc_ctg_cd
				AND w.mng_dpt_cd = r1.mng_dpt_cd
				AND w.lot_no = r1.lot_no
				AND w.sublot_no = r1.sublot_no
				AND w.sno1 = r1.sno1
				AND w.sno2 = r1.sno2
				AND w.sno3 = r1.sno3
				AND w.sno4 = r1.sno4
				AND w.loc_cd = r1.loc_cd
				AND w.str_ln_cd = r1.str_ln_cd
			LOOP

				SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_scm2mgtif$p_if$rec_w8;
				l_cnt := l_cnt + 1;
				INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w8 (
					_index_,
					data_lno,
					calc_ctg_cd,
					wg_cd,
					ym,
					ac_dt,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no,
					oper_act_no,
					loc_cd,
					str_ln_cd,
					wk_cost_cd,
					wk_rsn_cd,
					wk_cost,
					no_pln_flg,
					no_itm_info_flg,
					wk_act_no,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					scm_if_flg
				) VALUES (
					l_cnt,
					mapa_num$f_get_seq(c_act_inst_wk_if_data_lno),
					i_calc_ctg_cd,
					r2.wg_cd,
					i_ym,
					r2.ac_dt,
					r2.itm_cd,
					r2.itm_sub1,
					r2.itm_sub2,
					r2.itm_sub3,
					l_itm_mfg_inst_no,
					r2.mfg_act_no,
					r2.oper_act_no,
					r2.loc_cd,
					r2.str_ln_cd,
					r2.wk_cost_cd,
					r2.wk_rsn_cd,
					r2.wk_cost,
					c_off,
					c_off,
					r2.wk_act_no,
					r2.rmrks,
					NULL,
					NULL,
					NULL,
					c_on
					)
				;
			END LOOP;

			SELECT
				(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w6) +
				(SELECT COUNT(*) FROM mgpa_ins_scm2mgtif$p_if$rec_w8)
			INTO STRICT l_cnt;

			IF l_cnt > c_max_cnt THEN
				CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);
			END IF ;
		END LOOP;

		CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);

		CALL fcpa_batch_log$p_proc_log('MGBBD0023', l_rec_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0033', (l_inst_wk_row_cnt + l_inst_wk_cnt)::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0034', l_other_wk_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0026', l_mfg_inst_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0027', l_inst_oper_cnt::VARCHAR);

	END; -- SKIP_WK

	COMMIT;

	/* 仕掛実績情報の取込 */
	<<SKIP_WIP>>
	BEGIN

		IF i_wip = c_off OR l_non_prod_flg = c_on THEN
			EXIT SKIP_WIP;
		END IF;

		CALL fcpa_batch_log$p_proc_log('MGBBD0039');

 		SELECT COUNT(*)
		INTO STRICT l_rec_cnt
		FROM mgvt_mst_mly_wip t
		WHERE 0=0 AND t.ym = i_ym
		AND t.cmpl_flg = c_off
		AND t.base_unit_wip_qty <> 0
		;

		IF l_rec_cnt = 0 THEN
			CALL fcpa_batch_log$p_proc_log('MGBBD0024', l_rec_cnt::VARCHAR);
			EXIT SKIP_WIP;
		END IF;

		/* 部門のチェック */
		l_rec_dpt := '{}';
		CALL mgpa_cost_if$p_loc_init();
		l_chk_err := c_off;

		FOR r1 IN
			SELECT DISTINCT
				t.loc_cd
			FROM mgvt_mst_mly_wip t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.base_unit_wip_qty <> 0
			AND t.cmpl_flg = c_off
			AND (
				l_itm_out_cnt = 0
				OR
				NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_itm_out m
					WHERE 0=0
					AND m.itm_cd = t.itm_cd
					AND m.itm_sub1 = t.itm_sub1
					AND m.itm_sub2 = t.itm_sub2
					AND m.itm_sub3 = t.itm_sub3
					AND m.ym <= i_ym
					)
				)
		LOOP
			CALL mgpa_cost_if$p_get_dpt(mapa_loc$f_get_asst_dpt_cd_ne(r1.loc_cd, l_end_dt, c_on), l_fix_dpt, l_end_dt, l_rec_dpt, l_mdpt, c_on);

			IF l_mdpt IS NULL THEN
				l_rslt := c_err;
				l_chk_err := c_on;
			ELSE
				CALL mgpa_cost_if$p_loc_cache(r1.loc_cd, l_mdpt);
			END IF;
		END LOOP;

		IF l_chk_err = c_on THEN
			EXIT SKIP_WIP;
		END IF;

		/* 取得するときは年月ごとに再取り込みを行う */
		DELETE FROM mgt_act_inst_wip_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd AND (i_rerun = c_on OR t.scm_if_flg = c_on);

		/* 仕掛情報の取込 */
		INSERT INTO mgt_act_inst_wip_if (
			data_lno,
			calc_ctg_cd, wg_cd,
			ym,
			itm_cd, itm_sub1, itm_sub2, itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd, str_ln_cd,
			ac_rsn_cd,
			wip_qty,
			wip_per,
			rmrks, sub_char1, sub_char2, sub_char3,
			scm_if_flg)
		SELECT
			mapa_num$f_get_seq(c_act_inst_wip_if_data_lno),
			i_calc_ctg_cd, x.wg_cd,
			x.ym,
			x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
			x.itm_mfg_inst_no,
			x.mfg_act_no,
			c_null_val,
			x.loc_cd, x.str_ln_cd,
			NULL,
			SUM(x.base_unit_wip_qty),
			MAX(x.wip_rate),
			NULL, NULL, NULL, NULL,
			c_on
		FROM (
			SELECT
				t2.wg_cd,
				t.ym,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				CASE m2.itm_mfg_inst_no_set_typ
					WHEN c_inst_loc THEN CONCAT(c_str_no3, fcpa_postgres_util$substr(t.loc_cd, 1, c_itm_mfg_inst_no_l - LENGTH(c_str_no3)))
					ELSE t.itm_mfg_inst_no
				END itm_mfg_inst_no,
				CASE m2.mfg_act_no_set_typ
					WHEN c_mfg_non THEN
						CASE m2.itm_mfg_inst_no_set_typ
							WHEN c_inst_loc THEN COALESCE(fcpa_postgres_util$substr(t.loc_cd, c_itm_mfg_inst_no_l - LENGTH(c_str_no3) + 1, c_mfg_act_no_l), c_null_val)
							ELSE c_null_val
						END
					ELSE
						CASE t8.mfg_inst_unit_typ
							WHEN c_oper THEN c_null_val
							ELSE COALESCE(t.mfg_act_no, c_null_val)
						END
				END mfg_act_no,
				t.loc_cd,
				t.str_ln_cd,
				t.base_unit_wip_qty,
				CASE m2.itm_mfg_inst_no_set_typ
					WHEN c_inst_loc THEN 50
					ELSE t.wip_rate
				END wip_rate
			FROM mgvt_mst_itm_mfg_inst t2
				INNER JOIN mgvt_mst_mly_wip t ON (t.itm_mfg_inst_no = t2.itm_mfg_inst_no)
				LEFT OUTER JOIN mgvt_mst_mfg_act t7 ON (t7.mfg_act_no = t.mfg_act_no)
				LEFT OUTER JOIN mgvt_mst_mfg_inst t8 ON (t8.mfg_inst_no = t7.mfg_inst_no)
				LEFT OUTER JOIN mam_itm_srch m1 ON (
						t.itm_cd = m1.itm_cd
						AND t.itm_sub1 = m1.itm_sub1
						AND t.itm_sub2 = m1.itm_sub2
						AND t.itm_sub3 = m1.itm_sub3
						AND m1.del_flg = c_off
						AND m1.release_flg = c_on)
				LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd)
			WHERE 0=0
			AND t.ym = i_ym
			AND t.base_unit_wip_qty <> 0
			AND t.cmpl_flg = c_off
			AND (
				l_itm_out_cnt = 0
				OR
				NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_itm_out m
					WHERE 0=0
					AND m.itm_cd = t.itm_cd
					AND m.itm_sub1 = t.itm_sub1
					AND m.itm_sub2 = t.itm_sub2
					AND m.itm_sub3 = t.itm_sub3
					AND m.ym <= i_ym
					)
				)
		) x
		WHERE 0=0
		GROUP BY x.wg_cd, x.ym, x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
			x.itm_mfg_inst_no, x.mfg_act_no, x.loc_cd, x.str_ln_cd
		;

		GET DIAGNOSTICS l_wip_cnt = ROW_COUNT;

		/* 品目製造指図情報 */
		TRUNCATE TABLE mgpa_ins_scm2mgtif$p_if$rec_w6;
		l_mfg_inst_cnt := 0;
		l_cnt := 0;

		FOR r1 IN
			SELECT
				i_calc_ctg_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.itm_mfg_inst_no,
				x.mfg_act_no,
				x.wg_cd,
				x.mng_dpt_cd,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.sppl_cd,
				x.po_no, x.slo_no, x.rcpt_iv_no,
				x.asst_typ,
				x.base_unit_schd_qty,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL, NULL, NULL, NULL
			FROM (
				SELECT
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					CASE m2.itm_mfg_inst_no_set_typ
						WHEN c_inst_loc THEN CONCAT(c_str_no3, fcpa_postgres_util$substr(t.loc_cd, 1, c_itm_mfg_inst_no_l - LENGTH(c_str_no3)))
						ELSE t.itm_mfg_inst_no
					END itm_mfg_inst_no,
					CASE m2.mfg_act_no_set_typ
						WHEN c_mfg_non THEN
						CASE m2.itm_mfg_inst_no_set_typ
							WHEN c_inst_loc THEN COALESCE(fcpa_postgres_util$substr(t.loc_cd, c_itm_mfg_inst_no_l - LENGTH(c_str_no3) + 1, c_mfg_act_no_l), c_null_val)
							ELSE c_null_val
						END
						ELSE
						CASE t8.mfg_inst_unit_typ
							WHEN c_oper THEN c_null_val
							ELSE COALESCE(t.mfg_act_no, c_null_val)
						END
					END mfg_act_no,
					t2.wg_cd,
					mgpa_cost_if$f_get_loc_to_dpt(t.loc_cd) mng_dpt_cd,
					CASE
						WHEN m2.itm_mfg_inst_no_set_typ = c_inst_loc THEN c_null_val
						ELSE
						CASE
							WHEN l_lot_use_typ <> c_ps_use3 THEN
							CASE
								WHEN COALESCE(m2.lot_act_typ, c_act1) <> c_act1 THEN COALESCE(t.lot_no, c_null_val)
								ELSE c_null_val
							END
							ELSE c_null_val
						END
					END lot_no,
					CASE
						WHEN m2.itm_mfg_inst_no_set_typ = c_inst_loc THEN c_null_val
						ELSE
						CASE
							WHEN l_sublot_use_typ <> c_ps_use3 THEN
							CASE
								WHEN COALESCE(m2.sublot_act_typ, c_act1) <> c_act1 THEN COALESCE(t.sublot_no, c_null_val)
								ELSE c_null_val
							END
							ELSE c_null_val
						END
					END sublot_no,
					CASE
						WHEN m2.itm_mfg_inst_no_set_typ = c_inst_loc THEN c_null_val
						ELSE
						CASE
							WHEN l_sno1_use_typ <> c_ps_use3 THEN
							CASE
								WHEN COALESCE(m2.sno1_act_typ, c_act1) <> c_act1 THEN t.sno1
								ELSE c_null_val
							END
							ELSE c_null_val
						END
					END sno1,
					CASE
						WHEN m2.itm_mfg_inst_no_set_typ = c_inst_loc THEN c_null_val
						ELSE
						CASE
							WHEN l_sno2_use_typ <> c_ps_use3 THEN
							CASE
								WHEN COALESCE(m2.sno2_act_typ, c_act1) <> c_act1 THEN t.sno2
								ELSE c_null_val
							END
							ELSE c_null_val
						END
					END sno2,
					CASE
						WHEN m2.itm_mfg_inst_no_set_typ = c_inst_loc THEN c_null_val
						ELSE
						CASE
							WHEN l_sno3_use_typ <> c_ps_use3 THEN
							CASE
								WHEN COALESCE(m2.sno3_act_typ, c_act1) <> c_act1 THEN t.sno3
								ELSE c_null_val
							END
							ELSE c_null_val
						END
					END sno3,
					CASE
						WHEN m2.itm_mfg_inst_no_set_typ = c_inst_loc THEN c_null_val
						ELSE
						CASE
							WHEN l_sno4_use_typ <> c_ps_use3 THEN
							CASE
								WHEN COALESCE(m2.sno4_act_typ, c_act1) <> c_act1 THEN t.sno4
								ELSE c_null_val
							END
							ELSE c_null_val
						END
					END sno4,
					t2.sppl_cd,
					CASE l_tgt_po_no_flg
						WHEN c_off THEN t4.po_no
					END po_no,
					CASE l_tgt_slo_flg
						WHEN c_off THEN t4.slo_no
					END slo_no,
					CASE l_tgt_iv_flg
						WHEN c_off THEN t6.rcpt_iv_no
					END rcpt_iv_no,
					CASE l_asst_flg
						WHEN c_off THEN t.asst_typ
						ELSE c_asst2
					END asst_typ,
					CASE m2.itm_mfg_inst_no_set_typ
						WHEN c_inst_loc THEN 0
						ELSE
						CASE m2.mfg_act_no_set_typ
							WHEN c_mfg_non THEN 0
							ELSE t.base_unit_schd_qty
						END
					END base_unit_schd_qty,
					DATE_TRUNC('DAY', t3.st_schd_tm) st_schd_tm,
					DATE_TRUNC('DAY', t3.end_schd_tm) end_schd_tm,
					t.st_ac_dt,
					t.end_ac_dt,
					t3.intr_rmrks, t3.sub_char1, t3.sub_char2, t3.sub_char3,
					ROW_NUMBER() OVER (PARTITION BY
						t.itm_cd,
						t.itm_sub1,
						t.itm_sub2,
						t.itm_sub3,
						CASE m2.itm_mfg_inst_no_set_typ
							WHEN c_inst_loc THEN CONCAT(c_str_no3, fcpa_postgres_util$substr(t.loc_cd, 1, c_itm_mfg_inst_no_l - LENGTH(c_str_no3)))
							ELSE t.itm_mfg_inst_no
						END,
						CASE m2.mfg_act_no_set_typ
							WHEN c_mfg_non THEN
							CASE m2.itm_mfg_inst_no_set_typ
								WHEN c_inst_loc THEN COALESCE(fcpa_postgres_util$substr(t.loc_cd, c_itm_mfg_inst_no_l - LENGTH(c_str_no3) + 1, c_mfg_act_no_l), c_null_val)
								ELSE c_null_val
							END
							ELSE
							CASE t8.mfg_inst_unit_typ
								WHEN c_oper THEN c_null_val
								ELSE COALESCE(t.mfg_act_no, c_null_val)
							END
						END
						ORDER BY t3.st_schd_tm, t3.mfg_inst_no) st_schd_tm_rn
				FROM mgvt_mst_mly_wip t
					INNER JOIN mgvt_mst_itm_mfg_inst t2 ON (t2.itm_mfg_inst_no = t.itm_mfg_inst_no)
					INNER JOIN mgvt_mst_mfg_inst t3 ON (t3.itm_mfg_inst_no = t2.itm_mfg_inst_no)
					LEFT OUTER JOIN mgvt_mst_purc_act_d t4 ON (t4.po_d_no = t3.po_d_no)
					LEFT OUTER JOIN mgvt_mst_arr_pr t5 ON (t5.po_d_no = t3.po_d_no)
					LEFT OUTER JOIN mgvt_mst_arr_schd t6 ON (
							t6.mfg_inst_no = t3.mfg_inst_no
							AND t6.arr_pr_no = t5.arr_pr_no)
					LEFT OUTER JOIN mgvt_mst_mfg_act t7 ON (t7.mfg_act_no = t.mfg_act_no)
					LEFT OUTER JOIN mgvt_mst_mfg_inst t8 ON (t8.mfg_inst_no = t7.mfg_inst_no)
					INNER JOIN mam_itm_srch m1 ON (
							m1.itm_cd = t.itm_cd
							AND m1.itm_sub1 = t.itm_sub1
							AND m1.itm_sub2 = t.itm_sub2
							AND m1.itm_sub3 = t.itm_sub3
							AND m1.del_flg = c_off
							AND m1.release_flg = c_on
							AND m1.asset_mng_typ = c_asst_mng1)
					LEFT OUTER JOIN mam_calc_ptn m2 ON (m2.calc_ptn_cd = m1.calc_ptn_cd)
				WHERE 0=0
				AND t.ym = i_ym
				AND t.base_unit_wip_qty <> 0
				AND t.cmpl_flg = c_off
				AND (
					l_itm_out_cnt = 0
					OR
					NOT EXISTS (
						SELECT 'X'
						FROM mam_cost_itm_out m
						WHERE 0=0
						AND m.itm_cd = t.itm_cd
						AND m.itm_sub1 = t.itm_sub1
						AND m.itm_sub2 = t.itm_sub2
						AND m.itm_sub3 = t.itm_sub3
						AND m.ym <= i_ym
						)
					)
				) x
			WHERE 0=0
			AND x.st_schd_tm_rn = 1
		LOOP
			l_cnt := l_cnt + 1;
			INSERT INTO mgpa_ins_scm2mgtif$p_if$rec_w6 (
				_index_,
				calc_ctg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				wg_cd,
				mng_dpt_cd,
				lot_no,
				sublot_no,
				sno1,
				sno2,
				sno3,
				sno4,
				sppl_cd,
				po_no,
				slo_no,
				iv_no,
				asst_typ,
				qty,
				schd_st_dt,
				schd_end_dt,
				act_st_dt,
				act_end_dt,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
			) VALUES (
				l_cnt,
				i_calc_ctg_cd,
				r1.itm_cd,
				r1.itm_sub1,
				r1.itm_sub2,
				r1.itm_sub3,
				r1.itm_mfg_inst_no,
				r1.mfg_act_no,
				r1.wg_cd,
				r1.mng_dpt_cd,
				r1.lot_no,
				r1.sublot_no,
				r1.sno1,
				r1.sno2,
				r1.sno3,
				r1.sno4,
				r1.sppl_cd,
				r1.po_no,
				r1.slo_no,
				r1.rcpt_iv_no,
				r1.asst_typ,
				r1.base_unit_schd_qty,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL
			);
			
			IF l_cnt > c_max_cnt THEN
				CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);
				l_cnt := 0;
			END IF ;
		END LOOP;

		CALL mgpa_ins_scm2mgtif$p_ins_tran(l_mfg_cnt,l_purc_cnt,l_inpt_cnt,l_io_cnt,l_sls_cnt,l_inst_wk_cnt,l_mfg_inst_cnt,l_inst_oper_cnt);

		CALL fcpa_batch_log$p_proc_log('MGBBD0024', l_rec_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0036', l_wip_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0026', l_mfg_inst_cnt::VARCHAR);

	END; -- SKIP_WIP

	COMMIT;

	/* 在庫情報の取込 */
	<<SKIP_STK>>
	BEGIN

		IF i_stk = c_off THEN
			EXIT SKIP_STK;
		END IF;

		CALL fcpa_batch_log$p_proc_log('MGBBD0040');
		IF i_non_mov = c_on THEN
			CALL mgpa_ins_scm2mgtif$p_set_non_move(l_co_parm, i_ym);
		END IF;

		SELECT COUNT(*)
		INTO STRICT l_rec_cnt
		FROM mgvt_mst_mly_stk_dtl t
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.io_act_typ = c_end_stk
		AND t.base_unit_qty <> 0
		;

		IF l_rec_cnt = 0 THEN
			CALL fcpa_batch_log$p_proc_log('MGBBD0025', l_rec_cnt::VARCHAR);
			EXIT SKIP_STK;
		END IF;

		/* 部門のチェック */
		l_rec_dpt := '{}';
		CALL mgpa_cost_if$p_loc_init();
		l_chk_err := c_off;

		FOR r1 IN
			SELECT DISTINCT
				t.loc_cd
			FROM mgvt_mst_mly_stk_dtl t
				INNER JOIN mam_loc m1 ON (
						m1.loc_cd = t.loc_cd
						AND m1.del_flg = c_off)
				LEFT OUTER JOIN mam_bp m2 ON (t.stk_arrv_bp_cd = m2.bp_cd)
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.io_act_typ = c_end_stk
			AND t.base_unit_qty <> 0
			AND (m1.sppl_cd IS NOT NULL AND t.stk_id_typ IN (c_stk_id1, c_stk_id8) OR m1.sppl_cd IS NULL AND t.asst_typ <> c_asst3)
			AND (l_non_prod_flg = c_off AND t.asst_typ IN (c_asst2, c_asst3) OR l_non_sls_flg = c_off AND t.asst_typ = c_asst1)
			AND (
				l_itm_out_cnt = 0
				OR
				NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_itm_out m
					WHERE 0=0
					AND m.itm_cd = t.itm_cd
					AND m.itm_sub1 = t.itm_sub1
					AND m.itm_sub2 = t.itm_sub2
					AND m.itm_sub3 = t.itm_sub3
					AND m.ym <= i_ym
					)
				)
		LOOP
			CALL mgpa_cost_if$p_get_dpt(mapa_loc$f_get_asst_dpt_cd_ne(r1.loc_cd, l_end_dt, c_on), l_fix_dpt, l_end_dt, l_rec_dpt, l_mdpt, c_on);

			IF l_mdpt IS NULL THEN
				l_rslt := c_err;
				l_chk_err := c_on;
			ELSE
				CALL mgpa_cost_if$p_loc_cache(r1.loc_cd, l_mdpt);
			END IF;
		END LOOP;

		IF l_chk_err = c_on THEN
			EXIT SKIP_STK;
		END IF;

		/* 取得するときは年月ごとに再取り込みを行う */
		DELETE FROM mgt_act_stk_if t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg_cd AND (i_rerun = c_on OR t.scm_if_flg = c_on);

		/* 在庫情報の取込 */
		INSERT INTO mgt_act_stk_if (
			data_lno,
			calc_ctg_cd, wg_cd,
			ym,
			mng_dpt_cd,
			itm_cd, itm_sub1, itm_sub2, itm_sub3,
			lot_no, sublot_no,
			sno1, sno2, sno3, sno4,
			bp_cd,
			asst_typ,
			qty,
			first_gr_dt, vld_dt, lmt_dt,
			non_mov_base_dt,
			rmrks, sub_char1, sub_char2, sub_char3,
			scm_if_flg)
		SELECT
			mapa_num$f_get_seq(c_act_stk_if_data_lno),
			i_calc_ctg_cd, z.wg_cd,
			z.ac_ym,
			z.mng_dpt_cd,
			z.itm_cd, z.itm_sub1, z.itm_sub2, z.itm_sub3,
			COALESCE(z.lot_no, c_null_val), COALESCE(z.SUBLOT_NO, c_null_val),
			COALESCE(z.sno1, c_null_val), COALESCE(z.sno2, c_null_val), COALESCE(z.sno3, c_null_val), COALESCE(z.sno4, c_null_val),
			z.bp_cd,
			z.asst_typ,
			z.qty,
			z.first_gr_dt, z.vld_dt, z.lmt_dt,
			(/* 滞留基準年月 */
				SELECT
					COALESCE(MAX(w.non_mov_gi_ym), MIN(w.non_mov_gr_ym))
				FROM mgt_non_mov_stk w
				WHERE 0=0
				AND w.itm_cd = z.itm_cd 
				AND w.itm_sub1 = z.itm_sub1
				AND w.itm_sub2 = z.itm_sub2
				AND w.itm_sub3 = z.itm_sub3
				AND (z.lot_no IS NULL OR l_co_parm.lot_non_mov_flg = c_off OR w.lot_no = z.lot_no)
				AND (z.sublot_no IS NULL OR l_co_parm.sublot_non_mov_flg = c_off OR w.sublot_no = z.sublot_no)
				AND (z.sno1 IS NULL OR l_co_parm.sno1_non_mov_flg = c_off OR w.sno1 = z.sno1)
				AND (z.sno2 IS NULL OR l_co_parm.sno2_non_mov_flg = c_off OR w.sno2 = z.sno2)
				AND (z.sno3 IS NULL OR l_co_parm.sno3_non_mov_flg = c_off OR w.sno3 = z.sno3)
				AND (z.sno4 IS NULL OR l_co_parm.sno4_non_mov_flg = c_off OR w.sno4 = z.sno4)
				AND (l_co_parm.wg_non_mov_flg = c_off OR w.wg_cd = z.wg_cd)
			),
			NULL, NULL, NULL, NULL,
			c_on
		FROM (
			SELECT
				x.wg_cd,
				x.ac_ym,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.bp_cd,
				x.asst_typ,
				SUM(x.qty) qty,
				MIN(x.first_gr_dt) first_gr_dt,
				MIN(x.vld_dt) vld_dt,
				MIN(x.lmt_dt) lmt_dt
			FROM (
				SELECT
					m1.wg_cd,
					t.ac_ym,
					mgpa_cost_if$f_get_loc_to_dpt(t.loc_cd) mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					CASE
						WHEN l_lot_use_typ = c_ps_use2 AND t.asst_typ IN (c_asst2, c_asst3)
							OR l_lot_use_typ = c_ps_use3 AND t.asst_typ = c_asst1
							OR l_lot_use_typ = c_ps_use1 THEN
								CASE
									WHEN COALESCE(m4.lot_act_typ, c_act1) = c_act2 THEN t.lot_no
									ELSE NULL
								END
						ELSE NULL
					END lot_no,
					CASE
						WHEN l_sublot_use_typ = c_ps_use2 AND t.asst_typ IN (c_asst2, c_asst3)
							OR l_sublot_use_typ = c_ps_use3 AND t.asst_typ = c_asst1
							OR l_sublot_use_typ = c_ps_use1 THEN
								CASE
									WHEN COALESCE(m4.sublot_act_typ, c_act1) = c_act2 THEN t.sublot_no
									ELSE NULL
								END
						ELSE NULL
					END sublot_no,
					CASE
						WHEN l_sno1_use_typ = c_ps_use2 AND t.asst_typ IN (c_asst2, c_asst3)
							OR l_sno1_use_typ = c_ps_use3 AND t.asst_typ = c_asst1
							OR l_sno1_use_typ = c_ps_use1 THEN
								CASE
									WHEN COALESCE(m4.sno1_act_typ, c_act1) = c_act2 THEN t.sno1
									ELSE NULL
								END
						ELSE NULL
					END sno1,
					CASE
						WHEN l_sno2_use_typ = c_ps_use2 AND t.asst_typ IN (c_asst2, c_asst3)
							OR l_sno2_use_typ = c_ps_use3 AND t.asst_typ = c_asst1
							OR l_sno2_use_typ = c_ps_use1 THEN
								CASE
									WHEN COALESCE(m4.sno2_act_typ, c_act1) = c_act2 THEN t.sno2
									ELSE NULL
								END
						ELSE NULL
					END sno2,
					CASE
						WHEN l_sno3_use_typ = c_ps_use2 AND t.asst_typ IN (c_asst2, c_asst3)
							OR l_sno3_use_typ = c_ps_use3 AND t.asst_typ = c_asst1
							OR l_sno3_use_typ = c_ps_use1 THEN
								CASE
									WHEN COALESCE(m4.sno3_act_typ, c_act1) = c_act2 THEN t.sno3
									ELSE NULL
								END
						ELSE NULL
					END sno3,
					CASE
						WHEN l_sno4_use_typ = c_ps_use2 AND t.asst_typ IN (c_asst2, c_asst3)
							OR l_sno4_use_typ = c_ps_use3 AND t.asst_typ = c_asst1
							OR l_sno4_use_typ = c_ps_use1 THEN
								CASE
									WHEN COALESCE(m4.sno4_act_typ, c_act1) = c_act2 THEN t.sno4
									ELSE NULL
								END
						ELSE NULL
					END sno4,
					CASE t.asst_typ
						WHEN c_asst1 THEN
							CASE l_stk_bp_flg
								WHEN c_off THEN NULL
								ELSE
									CASE t.stk_arrv_bp_cd
										WHEN c_null_val THEN NULL
										ELSE
											CASE
												WHEN m2.dlv_flg = c_on AND m2.tdlv_flg = c_off THEN t.stk_arrv_bp_cd
												WHEN m2.dlv_flg = c_on AND m2.tdlv_flg = c_on THEN
													CASE
														WHEN t.fix_no_typ IN (c_fix_no_dlv_slip_no, c_fix_no_iv_no) THEN t.stk_arrv_bp_cd
														ELSE NULL
													END
												ELSE NULL
											END
									END
							END
						WHEN c_asst2 THEN
							CASE t.stk_arrv_bp_cd
								WHEN c_null_val THEN NULL
								ELSE
									CASE
										WHEN m2.dlv_flg = c_on AND m2.tdlv_flg = c_off THEN t.stk_arrv_bp_cd
										WHEN m2.dlv_flg = c_on AND m2.tdlv_flg = c_on THEN
											CASE
												WHEN t.fix_no_typ IN (c_fix_no_dlv_slip_no, c_fix_no_iv_no) THEN t.stk_arrv_bp_cd
												ELSE NULL
											END
										ELSE t.stk_arrv_bp_cd
									END
							END
						ELSE
							CASE t.stk_arrv_bp_cd
								WHEN c_null_val THEN NULL
								ELSE t.stk_arrv_bp_cd
							END
					END bp_cd,
					CASE l_asst_flg
						WHEN c_off THEN t.asst_typ
						ELSE
							CASE t.asst_typ
								WHEN c_asst3 THEN c_asst3
								ELSE c_asst2
							END
					END asst_typ,
					t.base_unit_qty qty,
					t.sub_char1, t.sub_char2, t.sub_char3,
					t2.first_gr_dt, t2.vld_dt, t2.lmt_dt
				FROM mgvt_mst_mly_stk_dtl t
					LEFT OUTER JOIN mgvt_msvt_lot_list t2 ON (
							t.itm_cd = t2.itm_cd
							AND t.itm_sub1 = t2.itm_sub1
							AND t.itm_sub2 = t2.itm_sub2
							AND t.itm_sub3 = t2.itm_sub3
							AND t.lot_no = t2.lot_no
							AND t.sublot_no = t2.sublot_no)
					INNER JOIN mam_loc m1 ON (
							m1.loc_cd = t.loc_cd
							AND m1.del_flg = c_off)
					LEFT OUTER JOIN mam_bp m2 ON (t.stk_arrv_bp_cd = m2.bp_cd)
					INNER JOIN mam_itm_srch m3 ON (
							m3.itm_cd = t.itm_cd
							AND m3.itm_sub1 = t.itm_sub1
							AND m3.itm_sub2 = t.itm_sub2
							AND m3.itm_sub3 = t.itm_sub3
							AND m3.del_flg = c_off
							AND m3.release_flg = c_on
							AND m3.asset_mng_typ = c_asst_mng1)
					LEFT OUTER JOIN mam_calc_ptn m4 ON (m3.calc_ptn_cd = m4.calc_ptn_cd)
				WHERE 0=0
				AND t.ac_ym = i_ym
				AND t.io_act_typ = c_end_stk
				AND t.base_unit_qty <> 0
				AND NOT EXISTS (
						SELECT 'X'
						FROM mgvt_mst_purc_act_io w1
							LEFT OUTER JOIN mgvt_mst_purc_act_d w2 ON (
									w1.purc_act_d_no = w2.purc_act_d_no
									AND w1.purc_act_d_seq = w2.purc_act_d_seq)
						WHERE 0=0
						AND t.fix_no_typ = c_fix_no_purc_act_io
						AND w1.purc_act_io_no = t.fix_no
						AND (l_co_parm.non_transit_flg = c_on OR w2.mfg_inst_no IS NOT NULL))
				AND (
					m1.sppl_cd IS NOT NULL AND t.stk_id_typ IN (c_stk_id1, c_stk_id8)
					OR
					m1.sppl_cd IS NULL AND t.asst_typ <> c_asst3
					)
				AND (
					l_non_prod_flg = c_off AND t.asst_typ IN (c_asst2, c_asst3)
					OR
					l_non_sls_flg = c_off AND t.asst_typ = c_asst1
					)
				AND (
					l_itm_out_cnt = 0
					OR
					NOT EXISTS (
						SELECT 'X'
						FROM mam_cost_itm_out m
						WHERE 0=0
						AND m.itm_cd = t.itm_cd
						AND m.itm_sub1 = t.itm_sub1
						AND m.itm_sub2 = t.itm_sub2
						AND m.itm_sub3 = t.itm_sub3
						AND m.ym <= i_ym
						)
					)
				) x
			WHERE 0=0
			GROUP BY x.wg_cd, x.ac_ym, x.mng_dpt_cd, x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4, x.bp_cd, x.asst_typ
			) z
		;

		GET DIAGNOSTICS l_stk_cnt = ROW_COUNT;

		CALL fcpa_batch_log$p_proc_log('MGBBD0025', l_rec_cnt::VARCHAR);
		CALL fcpa_batch_log$p_proc_log('MGBBD0035', l_stk_cnt::VARCHAR);

	END; -- SKIP_STK

	COMMIT;

	IF l_rslt = c_err THEN
		COMMIT ; /* 正常データは取込済みにするため */
		l_msg := fcpa_err$msg_binder('MGPA_INS_SCM2MGTIF.P_IF');
		CALL fcpa_err$raise_app_err('MGBXD0037', l_msg);
	END IF;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_SCM2MGTIF.P_IF');

END;
$BODY$
LANGUAGE plpgsql
;
