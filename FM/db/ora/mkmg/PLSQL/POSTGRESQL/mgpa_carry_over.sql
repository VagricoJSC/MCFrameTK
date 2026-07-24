CREATE OR REPLACE PROCEDURE mgpa_carry_over$p_stk_insert (
	 INOUT o_reci	mgt_st_stk[],
	 INOUT o_recj	mgt_st_stk_expns[]
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mgt_st_stk、mgt_st_stk_expnsのINSERT処理
<REMARKS>

<ARGUMENTS>
<INOUT>	o_reci
		mgt_st_stkの配列
<INOUT>	o_recj
		mgt_st_stk_expnsの配列
<HISTORY>
**********************************************************/
BEGIN
	IF COALESCE(array_length(o_reci, 1), 0) > 0 THEN
		INSERT INTO mgt_st_stk SELECT * FROM UNNEST(o_reci);
		o_reci := '{}' ;
	END IF ;

	IF COALESCE(array_length(o_recj, 1), 0) > 0 THEN
		INSERT INTO mgt_st_stk_expns SELECT * FROM UNNEST(o_recj);
		o_recj := '{}' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_carry_over$p_stk (
	i_arg	mgt_arg,
	i_ym	TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	月初在庫データの作成
<REMARKS>

<ARGUMENTS>
<IN>	i_arg
		mgt_argのレコード
<IN>	i_ym
		データ作成年月
<HISTORY>
**************************************************************************/
DECLARE
	c_max_cnt	CONSTANT INTEGER := 20000 ;	/* バルクインサートでの最大レコード数 */
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_calc_rec_end_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_STK') ;
	c_stk_seq_nm		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ST_STK_KEY') ;

	lock_stk CURSOR FOR
		SELECT	t.st_stk_key
		FROM	mgt_st_stk t
		WHERE	0=0
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.ym = i_ym
		FOR UPDATE NOWAIT
	;

	l_reci		mgt_st_stk[] ;
	l_recj		mgt_st_stk_expns[] ;
	l_tmp_reci	mgt_st_stk%ROWTYPE ;
	l_tmp_recj	mgt_st_stk_expns%ROWTYPE ;
	l_row_id	VARCHAR(20) ;
	x	RECORD ;
	y	RECORD ;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_CARRY_OVER.P_STK') ;

	FOR t IN lock_stk LOOP EXIT ;
	END LOOP ;

	DELETE FROM	mgt_st_stk_expns t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_st_stk w
			WHERE	0=0
			AND	w.st_stk_key = t.st_stk_key
			and	w.calc_grp_cd = i_arg.calc_grp_cd
			and	w.ym = i_ym
		)
	;

	DELETE FROM	mgt_st_stk_diff t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_st_stk w
			WHERE	0=0
			AND	w.st_stk_key = t.st_stk_key
			AND	w.calc_grp_cd = i_arg.calc_grp_cd
			AND	w.ym = i_ym
		)
	;

	DELETE FROM	mgt_st_stk t
	WHERE	0=0
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	t.ym = i_ym
	;

	FOR x IN
		SELECT	t.top_rec_no,
			t.wg_cd,
			t.mng_dpt_cd,
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
			t.bp_cd,
			t.asst_typ,
			t.repurc_obli_flg,
			t.qty
		FROM	mgt_acc_top t
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.ym = i_arg.end_ym
		AND	t.calc_rec_typ = c_calc_rec_end_stk
	LOOP
		l_row_id := mapa_num$f_get_seq(c_stk_seq_nm)::VARCHAR ;

		l_tmp_reci.st_stk_key  := l_row_id ;
		l_tmp_reci.calc_grp_cd := i_arg.calc_grp_cd ;
		l_tmp_reci.wg_cd := x.wg_cd ;
		l_tmp_reci.ym	:= i_ym ;
		l_tmp_reci.mng_dpt_cd := x.mng_dpt_cd ;
		l_tmp_reci.itm_cd	:= x.itm_cd ;
		l_tmp_reci.itm_sub1	:= x.itm_sub1 ;
		l_tmp_reci.itm_sub2	:= x.itm_sub2 ;
		l_tmp_reci.itm_sub3	:= x.itm_sub3 ;
		l_tmp_reci.itm_ext	:= c_null_val ;
		l_tmp_reci.lot_no	:= x.lot_no ;
		l_tmp_reci.sublot_no	:= x.sublot_no ;
		l_tmp_reci.sno1	:= x.sno1 ;
		l_tmp_reci.sno2	:= x.sno2 ;
		l_tmp_reci.sno3	:= x.sno3 ;
		l_tmp_reci.sno4	:= x.sno4 ;
		l_tmp_reci.bp_cd	:= x.bp_cd ;
		l_tmp_reci.asst_typ := x.asst_typ ;
		l_tmp_reci.repurc_obli_flg := x.repurc_obli_flg ;
		l_tmp_reci.qty	:= x.qty ;
		l_tmp_reci.std_flg := '0' ;

		l_reci[COALESCE(array_length(l_reci, 1), 0) + 1] := l_tmp_reci ;

		FOR y IN
			SELECT	t.expns_cd,
				SUM(t.amt) AS amt
			FROM	(
				SELECT	t1.expns_cd,
					t1.act_cost AS amt
				FROM	mgt_acc_sml_cost t1
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.top_rec_no = x.top_rec_no
				UNION ALL
				SELECT	m1.expns_cd,
					(- 1) * t2.amt AS amt
				FROM	mgt_stk_loss t2, mam_stk_eval m1
				WHERE	0=0
				AND	t2.calc_no = i_arg.calc_no
				AND	t2.calc_grp_cd = i_arg.calc_grp_cd
				AND	t2.wg_cd = x.wg_cd
				AND	t2.ym = i_arg.end_ym
				AND	t2.mng_dpt_cd = x.mng_dpt_cd
				AND	t2.itm_cd = x.itm_cd
				AND	t2.itm_sub1 = x.itm_sub1
				AND	t2.itm_sub2 = x.itm_sub2
				AND	t2.itm_sub3 = x.itm_sub3
				AND	t2.lot_no = x.lot_no
				AND	t2.sublot_no = x.sublot_no
				AND	t2.sno1 = x.sno1
				AND	t2.sno2 = x.sno2
				AND	t2.sno3 = x.sno3
				AND	t2.sno4 = x.sno4
				AND	COALESCE(t2.sppl_cd, c_null_val) = COALESCE(x.bp_cd, c_null_val)
				AND	t2.asst_typ = x.asst_typ
				AND	t2.stk_eval_cd = m1.stk_eval_cd
				AND	m1.cut_flg = '1'
				AND	m1.expns_cd IS NOT NULL
				) t
			WHERE	0=0
			GROUP BY t.expns_cd
		LOOP
			<<NEXT_LOOP>>
			BEGIN
				IF y.amt = 0 THEN
					EXIT NEXT_LOOP ;
				END IF ;

			l_tmp_recj.st_stk_key := l_row_id ;
			l_tmp_recj.expns_cd := y.expns_cd ;
			l_tmp_recj.amt := y.amt ;

			l_recj[COALESCE(array_length(l_recj, 1), 0) + 1] := l_tmp_recj ;

			END ;
		END LOOP ;

		IF COALESCE(array_length(l_reci, 1), 0) + COALESCE(array_length(l_recj, 1), 0) > c_max_cnt THEN
			CALL mgpa_carry_over$p_stk_insert(l_reci, l_recj) ;
		END IF ;
	END LOOP ;

	CALL mgpa_carry_over$p_stk_insert(l_reci, l_recj) ;

	DELETE FROM	mgt_st_stk t
	WHERE	0=0
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	t.ym = i_ym
	AND	t.qty = 0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mgt_st_stk_expns w
			WHERE	0=0
			AND	w.st_stk_key = t.st_stk_key
		)
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_CARRY_OVER.P_STK') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_carry_over$p_wip_insert (
	 INOUT o_reci	mgt_st_wip[],
	 INOUT o_recj	mgt_st_wip_expns[]
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mgt_st_wip、mgt_st_wip_expnsのINSERT処理
<REMARKS>

<ARGUMENTS>
<INOUT>	o_reci
		mgt_st_wipの配列
<INOUT>	o_recj
		mgt_st_wip_expnsの配列
<HISTORY>
**********************************************************/
BEGIN
	IF COALESCE(array_length(o_reci, 1), 0) > 0 THEN
		INSERT INTO mgt_st_wip SELECT * FROM UNNEST(o_reci);
		o_reci := '{}' ;
	END IF ;

	IF COALESCE(array_length(o_recj, 1), 0) > 0 THEN
		INSERT INTO mgt_st_wip_expns SELECT * FROM UNNEST(o_recj);
		o_recj := '{}' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_carry_over$p_wip (
	i_arg	mgt_arg,
	i_ym	TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	月初仕掛データの作成
<REMARKS>

<ARGUMENTS>
<IN>	i_arg
		mgt_argのレコード
<IN>	i_ym
		データ作成年月
<HISTORY>
**************************************************************************/
DECLARE
	c_max_cnt	CONSTANT INTEGER := 20000 ;	/* バルクインサートでの最大レコード数 */
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_calc_rec_end_wip	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_WIP') ;
	c_wip_seq_nm		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ST_WIP_KEY') ;

	lock_wip CURSOR FOR
		SELECT	t.st_wip_key
		FROM	mgt_st_wip t
		WHERE	0=0
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.ym = i_ym
		FOR UPDATE NOWAIT
	;

	l_reci		mgt_st_wip[] ;
	l_recj		mgt_st_wip_expns[] ;
	l_tmp_reci	mgt_st_wip%ROWTYPE ;
	l_tmp_recj	mgt_st_wip_expns%ROWTYPE ;
	l_row_id	VARCHAR(20) ;
	x RECORD ;
	y RECORD ;
BEGIN

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_CARRY_OVER.P_WIP') ;

	FOR t IN lock_wip LOOP EXIT ;
	END LOOP ;

	DELETE FROM	mgt_st_wip_expns t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_st_wip w
			WHERE	0=0
			AND	w.st_wip_key = t.st_wip_key
			AND	w.calc_grp_cd = i_arg.calc_grp_cd
			AND	w.ym = i_ym
		)
	;

	DELETE FROM	mgt_st_wip t
	WHERE	0=0
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	t.ym = i_ym
	;

	FOR x IN
		SELECT	t.top_rec_no,
			t.wg_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.itm_mfg_inst_no,
			t.mfg_act_no,
			COALESCE(t.oper_act_no, c_null_val) AS oper_act_no,
			t.loc_cd,
			t.str_ln_cd,
			t.oper_cd,
			t.oper_seq,
			t.qty,
			COALESCE(t.per, 50) AS per
		FROM	mgt_acc_top t
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.ym = i_arg.end_ym
		AND	t.calc_rec_typ = c_calc_rec_end_wip
	LOOP
		l_row_id := mapa_num$f_get_seq(c_wip_seq_nm)::VARCHAR ;

		l_tmp_reci.st_wip_key	:= l_row_id ;
		l_tmp_reci.calc_grp_cd	:= i_arg.calc_grp_cd ;
		l_tmp_reci.wg_cd		:= x.wg_cd ;
		l_tmp_reci.ym		:= i_ym ;
		l_tmp_reci.itm_cd		:= x.itm_cd ;
		l_tmp_reci.itm_sub1		:= x.itm_sub1 ;
		l_tmp_reci.itm_sub2		:= x.itm_sub2 ;
		l_tmp_reci.itm_sub3		:= x.itm_sub3 ;
		l_tmp_reci.itm_ext		:= c_null_val ;
		l_tmp_reci.itm_mfg_inst_no := x.itm_mfg_inst_no ;
		l_tmp_reci.mfg_act_no	:= x.mfg_act_no ;
		l_tmp_reci.oper_act_no	:= x.oper_act_no ;
		l_tmp_reci.loc_cd		:= x.loc_cd ;
		l_tmp_reci.str_ln_cd	:= x.str_ln_cd ;
		l_tmp_reci.oper_cd		:= x.oper_cd ;
		l_tmp_reci.oper_seq	:= x.oper_seq ;
		l_tmp_reci.wip_qty		:= x.qty ;
		l_tmp_reci.wip_per		:= x.per ;

		l_reci[COALESCE(array_length(l_reci, 1), 0) + 1] := l_tmp_reci ;

		FOR y IN
			SELECT	w.expns_cd,
				SUM(w.wip_amt) AS wip_amt,
				SUM(w.inpt_amt) AS inpt_amt
			FROM	(
				SELECT	t2.expns_cd,
					SUM(t2.act_cost) AS wip_amt,
					0 AS inpt_amt
				FROM	mgt_acc_inpt t1, mgt_acc_cost t2
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.top_rec_no = x.top_rec_no
				AND	t1.lvl = 0
				AND	t1.calc_no = t2.calc_no
				AND	t1.calc_grp_cd = t2.calc_grp_cd
				AND	t1.inpt_rec_no = t2.sml_inpt_rec_no
				GROUP BY t2.expns_cd
				UNION ALL
				SELECT	t2.expns_cd,
					0 AS wip_amt,
					SUM(t2.act_cost) AS inpt_amt
				FROM	mgt_acc_inpt t1, mgt_acc_cost t2
				WHERE	0=0
				AND	t1.calc_no = i_arg.calc_no
				AND	t1.calc_grp_cd = i_arg.calc_grp_cd
				AND	t1.top_rec_no = x.top_rec_no
				AND	t1.lvl = 1
				AND	t1.calc_no = t2.calc_no
				AND	t1.calc_grp_cd = t2.calc_grp_cd
				AND	t1.inpt_rec_no = t2.sml_inpt_rec_no
				GROUP BY t2.expns_cd
				) w
			WHERE	0=0
			GROUP BY w.expns_cd
		LOOP
			<<NEXT_LOOP>>
			BEGIN
				IF y.wip_amt = 0 AND y.inpt_amt = 0 THEN
					EXIT NEXT_LOOP ;
				END IF ;

			l_tmp_recj.st_wip_key := l_row_id ;
			l_tmp_recj.expns_cd := y.expns_cd ;
			l_tmp_recj.wip_amt	 := y.wip_amt ;
			l_tmp_recj.inpt_amt := y.inpt_amt ;

			l_recj[COALESCE(array_length(l_recj, 1), 0) + 1] := l_tmp_recj ;

			END ;
		END LOOP ;

		IF COALESCE(array_length(l_reci, 1), 0) + COALESCE(array_length(l_recj, 1), 0) > c_max_cnt THEN
			CALL mgpa_carry_over$p_wip_insert(l_reci, l_recj) ;
		END IF ;
	END LOOP ;

	CALL mgpa_carry_over$p_wip_insert(l_reci, l_recj) ;

	DELETE FROM	mgt_st_wip t
	WHERE	0=0
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	t.ym = i_ym
	AND	t.wip_qty = 0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mgt_st_wip_expns w
			WHERE	0=0
			AND	w.st_wip_key = t.st_wip_key
		)
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_CARRY_OVER.P_WIP') ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mgpa_carry_over$p_chk_fix_calc_no (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	計算グループＣＤ・年月に対して確定されており、
	確定対象の原価計算ＮＯが入力値の原価計算ＮＯと異なるときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<IN>	I_CALC_NO
		原価計算ＮＯ
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_calc_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym
		AND t.calc_no != i_calc_no;

	IF l_cnt > 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
		CALL fcpa_err$raise_app_err('MGBXD0014', l_msg);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mgpa_carry_over$f_chk_fix (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	確定済みのときは１、未確定のときは０を返す
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_calc_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym;

	IF l_cnt > 0 THEN
		RETURN '1';
	END IF;

	RETURN '0';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_carry_over$p_chk_fix (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	l_flg CHAR(1);
BEGIN
	l_flg := mgpa_carry_over$f_chk_fix(i_calc_grp_cd, i_ym);

	IF l_flg = '1' THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
		CALL fcpa_err$raise_app_err('MGBXD0014', l_msg);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_carry_over$p_main (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_proc_no NUMERIC DEFAULT NULL
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	繰越データの作成
<REMARKS>
	引数の原価計算情報に設定されている計算対象末尾月＋１の
	年月データを作成する
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<IN>	i_proc_no
		処理ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_arg	mgt_arg%ROWTYPE;
	l_ym	mgt_arg.end_ym%TYPE ;
	l_msg	VARCHAR[] ;
BEGIN
	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	/* 繰越元の確定チェック */
	CALL mgpa_carry_over$p_chk_fix_calc_no(i_calc_grp_cd, l_arg.end_ym, i_calc_no) ;

	l_ym := fcpa_postgres_util$add_months(l_arg.end_ym, 1) ;

	/* 繰越先の確定チェック */
	CALL mgpa_carry_over$p_chk_fix(i_calc_grp_cd, l_ym) ;

	IF i_proc_no IS NULL OR i_proc_no = 1 THEN
		CALL mgpa_carry_over$p_stk(l_arg, l_ym) ;
	END IF ;
	IF i_proc_no IS NULL OR i_proc_no = 2 THEN
		CALL mgpa_carry_over$p_wip(l_arg, l_ym) ;
	END IF ;

EXCEPTION
	WHEN lock_not_available THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(l_ym, fcpa_date_util$y4m())) ;
		CALL fcpa_err$raise_app_err('MGBXD0010', l_msg) ;
END ;
$BODY$
LANGUAGE plpgsql
;
