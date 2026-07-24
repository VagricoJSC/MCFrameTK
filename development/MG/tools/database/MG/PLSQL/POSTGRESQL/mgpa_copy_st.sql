CREATE OR REPLACE PROCEDURE mgpa_copy_st$p_stk (
	IN i_calc_grp_cd_from	VARCHAR,
	IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	IN i_calc_grp_cd_to	VARCHAR,
	IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	IN i_lot_no_flg	CHARACTER,
	IN i_sublot_no_flg	CHARACTER,
	IN i_sno1_flg	CHARACTER,
	IN i_sno2_flg	CHARACTER,
	IN i_sno3_flg	CHARACTER,
	IN i_sno4_flg	CHARACTER,
	IN i_bp_flg	CHARACTER,
	IN i_asst_flg	CHARACTER,
	IN i_del_flg	CHARACTER,
	IN i_calc_grp	mam_calc_grp
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	月初在庫コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd_from
		コピー元計算グループＣＤ
<IN>	i_ym_from
		コピー元年月
<IN>	i_calc_grp_cd_to
		コピー先計算グループＣＤ
<IN>	i_ym_to
		コピー先年月
<IN>	i_lot_no_flg
		ロットＮＯ引継ＦＬＧ
<IN>	i_sublot_no_flg
		サブロットＮＯ引継ＦＬＧ
<IN>	i_sno1_flg
		手配ＮＯ１引継ＦＬＧ
<IN>	i_sno2_flg
		手配ＮＯ２引継ＦＬＧ
<IN>	i_sno3_flg
		手配ＮＯ３引継ＦＬＧ
<IN>	i_sno4_flg
		手配ＮＯ４引継ＦＬＧ
<IN>	i_bp_flg
		取引先引継ＦＬＧ
<IN>	i_asst_flg
		資産区分引継ＦＬＧ
<IN>	i_del_flg
		削除後再作成ＦＬＧ
<IN>	i_calc_grp
		mam_calc_grpのレコード
<HISTORY>
**********************************************************/
DECLARE
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_asst_prod		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD') ;
	c_asst_oth		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH') ;
	c_cost_calc_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP','CALC_STK') ;
	c_exp_calc_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXP_CALC_TYP','NON') ;
	c_stk_seq		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ST_STK_KEY') ;

	lock_stk CURSOR
	FOR
		SELECT	t.st_stk_key
		FROM	mgt_st_stk t
		WHERE	0=0
		AND	(
			t.calc_grp_cd = i_calc_grp_cd_from AND t.ym = i_ym_from
			OR
			t.calc_grp_cd = i_calc_grp_cd_to AND t.ym = i_ym_to
			)
		FOR UPDATE NOWAIT
	;

	l_stk		mgt_st_stk%ROWTYPE ;

	l_cnt		NUMERIC ;
	l_row_id	mgt_st_stk.st_stk_key%TYPE ;

	x	RECORD ;
	w	RECORD ;
BEGIN
	IF i_calc_grp.cost_calc_typ != c_cost_calc_stk
	AND i_calc_grp.exp_calc_typ = c_exp_calc_non THEN
		RETURN ;
	END IF ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_COPY_ST.P_STK') ;

	FOR x IN lock_stk LOOP EXIT ;
	END LOOP ;

	IF i_del_flg = '1' THEN
		DELETE FROM	mgt_st_stk_expns t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgt_st_stk t2
				WHERE	0=0
				AND	t2.st_stk_key = t.st_stk_key
				AND	t2.calc_grp_cd = i_calc_grp_cd_to
				AND	t2.ym = i_ym_to
			)
		;

		DELETE FROM	mgt_st_stk_diff t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgt_st_stk t2
				WHERE	0=0
				AND	t2.st_stk_key = t.st_stk_key
				AND	t2.calc_grp_cd = i_calc_grp_cd_to
				AND	t2.ym = i_ym_to
			)
		;

		DELETE FROM mgt_st_stk t WHERE t.calc_grp_cd = i_calc_grp_cd_to AND t.ym = i_ym_to ;
	ELSE
		SELECT	COUNT(*)
		INTO STRICT	l_cnt
		FROM	mgt_st_stk_diff t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgt_st_stk t2
				WHERE	0=0
				AND	t2.st_stk_key = t.st_stk_key
				AND	t2.calc_grp_cd = i_calc_grp_cd_to
				AND	t2.ym = i_ym_to
			)
		;

		IF l_cnt > 0 THEN
			CALL fcpa_err$raise_app_err('MGBBD0004') ;
		END IF ;
	END IF ;

	FOR x IN
		SELECT	t.st_stk_key,
			t.wg_cd,
			t.mng_dpt_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			CASE i_lot_no_flg WHEN '1' THEN t.lot_no ELSE c_null_val END AS lot_no,
			CASE i_sublot_no_flg WHEN '1' THEN t.sublot_no ELSE c_null_val END AS sublot_no,
			CASE i_sno1_flg WHEN '1' THEN t.sno1 ELSE c_null_val END AS sno1,
			CASE i_sno2_flg WHEN '1' THEN t.sno2 ELSE c_null_val END AS sno2,
			CASE i_sno3_flg WHEN '1' THEN t.sno3 ELSE c_null_val END AS sno3,
			CASE i_sno4_flg WHEN '1' THEN t.sno4 ELSE c_null_val END AS sno4,
			t.bp_cd,
			t.asst_typ,
			t.repurc_obli_flg,
			t.qty
		FROM	mgt_st_stk t
		WHERE	0=0
		AND	t.calc_grp_cd = i_calc_grp_cd_from
		AND	t.ym = i_ym_from
	LOOP
		l_stk.wg_cd := x.wg_cd ;
		l_stk.mng_dpt_cd := x.mng_dpt_cd ;
		l_stk.itm_cd := x.itm_cd ;
		l_stk.itm_sub1 := x.itm_sub1 ;
		l_stk.itm_sub2 := x.itm_sub2 ;
		l_stk.itm_sub3 := x.itm_sub3 ;
		l_stk.lot_no := x.lot_no ;
		l_stk.sublot_no := x.sublot_no ;
		l_stk.sno1 := x.sno1 ;
		l_stk.sno2 := x.sno2 ;
		l_stk.sno3 := x.sno3 ;
		l_stk.sno4 := x.sno4 ;
		l_stk.repurc_obli_flg := x.repurc_obli_flg ;

		IF i_asst_flg = '1' OR x.asst_typ = c_asst_oth THEN
			l_stk.asst_typ := x.asst_typ ;
		ELSE
			l_stk.asst_typ := c_asst_prod ;
		END IF ;

		IF i_bp_flg = '1' OR l_stk.asst_typ = c_asst_oth OR l_stk.repurc_obli_flg = '1' THEN
			l_stk.bp_cd := x.bp_cd ;
		ELSE
			l_stk.bp_cd := NULL ;
		END IF ;

		SELECT	MAX(t.st_stk_key)
		INTO STRICT	l_row_id
		FROM	mgt_st_stk t
		WHERE	0=0
		AND	t.calc_grp_cd = i_calc_grp_cd_to
		AND	t.wg_cd = l_stk.wg_cd
		AND	t.ym = i_ym_to
		AND	t.mng_dpt_cd = l_stk.mng_dpt_cd
		AND	t.itm_cd = l_stk.itm_cd
		AND	t.itm_sub1 = l_stk.itm_sub1
		AND	t.itm_sub2 = l_stk.itm_sub2
		AND	t.itm_sub3 = l_stk.itm_sub3
		AND	t.lot_no = l_stk.lot_no
		AND	t.sublot_no = l_stk.sublot_no
		AND	t.sno1 = l_stk.sno1
		AND	t.sno2 = l_stk.sno2
		AND	t.sno3 = l_stk.sno3
		AND	t.sno4 = l_stk.sno4
		AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(l_stk.bp_cd, c_null_val)
		AND	t.asst_typ = l_stk.asst_typ
		AND	t.repurc_obli_flg = l_stk.repurc_obli_flg
		;

		IF l_row_id IS NOT NULL THEN
			UPDATE	mgt_st_stk t
			SET	qty = t.qty + x.qty
			WHERE	0=0
			AND	t.st_stk_key = l_row_id
			;

			FOR w IN
				SELECT	t1.expns_cd,
					t1.amt
				FROM mgt_st_stk_expns t1
				WHERE	0=0
				AND	t1.st_stk_key = x.st_stk_key
			LOOP
 				IF (SELECT COUNT(*) FROM mgt_st_stk_expns t WHERE t.st_stk_key = l_row_id AND t.expns_cd = w.expns_cd) > 0 THEN
 					UPDATE	mgt_st_stk_expns t
					SET	amt = t.amt + w.amt
					WHERE	0=0
					AND	t.st_stk_key = l_row_id
					AND	t.expns_cd = w.expns_cd
					;
				ELSE
					INSERT INTO mgt_st_stk_expns (
						st_stk_key, expns_cd, amt
						)
					VALUES (
						l_row_id, w.expns_cd, w.amt
					)
					;
				END IF ;
			END LOOP ;
		ELSE
			l_row_id := mapa_num$f_get_seq(c_stk_seq) ;

			INSERT INTO mgt_st_stk (
				st_stk_key,
				calc_grp_cd, wg_cd, ym,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no,
				sno1, sno2, sno3, sno4,
				bp_cd, asst_typ,
				repurc_obli_flg,
				qty
				)
			VALUES (
				l_row_id,
				i_calc_grp_cd_to, l_stk.wg_cd, i_ym_to,
				l_stk.mng_dpt_cd,
				l_stk.itm_cd, l_stk.itm_sub1, l_stk.itm_sub2, l_stk.itm_sub3,
				l_stk.lot_no, l_stk.sublot_no,
				l_stk.sno1, l_stk.sno2, l_stk.sno3, l_stk.sno4,
				l_stk.bp_cd, l_stk.asst_typ,
				l_stk.repurc_obli_flg,
				x.qty
				)
			;

			DELETE FROM	mgt_st_stk_expns t
			WHERE	0=0
			AND	t.st_stk_key = l_row_id ;

			INSERT INTO mgt_st_stk_expns (
				st_stk_key,
				expns_cd,
				amt
				)
			SELECT	l_row_id,
				t.expns_cd,
				t.amt
			FROM	mgt_st_stk_expns t
			WHERE	0=0
			AND	t.st_stk_key = x.st_stk_key
			;
		END IF ;

	END LOOP ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_COPY_ST.P_STK') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_copy_st$p_wip_insert (
	IN reci	mgt_st_wip[],
	IN recj	mgt_st_wip_expns[]
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	INSERT処理
<REMARKS>

<ARGUMENTS>
<HISTORY>
**********************************************************/
BEGIN
	IF COALESCE(array_length(reci, 1), 0) > 0 THEN
		INSERT INTO mgt_st_wip SELECT * FROM UNNEST(reci) ;
	END IF ;

	IF COALESCE(array_length(recj, 1), 0) > 0 THEN
		INSERT INTO mgt_st_wip_expns SELECT * FROM UNNEST(recj) ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_copy_st$p_wip (
	IN i_calc_grp_cd_from	VARCHAR,
	IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	IN i_calc_grp_cd_to	VARCHAR,
	IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	IN i_del_flg	CHARACTER,
	IN i_calc_grp	mam_calc_grp
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	月初仕掛コピー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd_from
		コピー元計算グループＣＤ
<IN>	i_ym_from
		コピー元年月
<IN>	i_calc_grp_cd_to
		コピー先計算グループＣＤ
<IN>	i_ym_to
		コピー先年月
<IN>	i_del_flg
		削除後再作成ＦＬＧ
<IN>	i_calc_grp
		mam_calc_grpのレコード
<HISTORY>
**********************************************************/
DECLARE
	c_max_cnt			CONSTANT INTEGER := 10000 ; /* バルクインサートでの最大レコード数 */
	c_null_val			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_cost_calc_not_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP','NOT_STK') ;
	c_cost_calc_stk		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP','CALC_STK') ;
	c_wip_seq			CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ST_WIP_KEY') ;

	lock_wip CURSOR
	FOR
		SELECT	t.st_wip_key
		FROM	mgt_st_wip t
		WHERE	0=0
		AND	(
			t.calc_grp_cd = i_calc_grp_cd_from AND t.ym = i_ym_from
			OR
			t.calc_grp_cd = i_calc_grp_cd_to AND t.ym = i_ym_to
			)
		FOR UPDATE NOWAIT
	;

	reci	mgt_st_wip[] ;
	reci_temp mgt_st_wip%ROWTYPE ;
	i	INTEGER ;

	recj	mgt_st_wip_expns[] ;
	recj_temp	mgt_st_wip_expns%ROWTYPE ;
	j	INTEGER ;

	l_row_id		mgt_st_wip.st_wip_key%TYPE ;
	x	RECORD ;
	y	RECORD ;
BEGIN
	IF i_calc_grp.cost_calc_typ != c_cost_calc_not_stk
	AND i_calc_grp.cost_calc_typ != c_cost_calc_stk THEN
		RETURN ;
	END IF ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_COPY_ST.P_WIP') ;

	FOR x IN lock_wip LOOP EXIT ;
	END LOOP ;

	IF i_del_flg = '1' THEN
		DELETE FROM mgt_st_wip_expns t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgt_st_wip t2
				WHERE	0=0
				AND	t2.st_wip_key = t.st_wip_key
				AND	t2.calc_grp_cd = i_calc_grp_cd_to
				AND	t2.ym = i_ym_to
			)
		;
		DELETE FROM mgt_st_wip t WHERE t.calc_grp_cd = i_calc_grp_cd_to AND t.ym = i_ym_to ;
	END IF ;

	i := 0 ;
	j := 0 ;
	reci := '{}' ;
	recj := '{}' ;
	FOR x IN
		SELECT	t.st_wip_key,
			t.wg_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.itm_mfg_inst_no,
			t.mfg_act_no,
			t.oper_act_no,
			t.loc_cd,
			t.str_ln_cd,
			t.oper_cd,
			t.oper_seq,
			t.wip_qty,
			t.wip_per
		FROM	mgt_st_wip t
		WHERE	0=0
		AND	t.calc_grp_cd = i_calc_grp_cd_from
		AND	t.ym = i_ym_from
	LOOP
		l_row_id := mapa_num$f_get_seq(c_wip_seq) ;

		i := i + 1 ;

		reci_temp.st_wip_key := l_row_id ;
		reci_temp.calc_grp_cd := i_calc_grp_cd_to ;
		reci_temp.wg_cd := x.wg_cd ;
		reci_temp.ym := i_ym_to ;
		reci_temp.itm_cd := x.itm_cd ;
		reci_temp.itm_sub1 := x.itm_sub1 ;
		reci_temp.itm_sub2 := x.itm_sub2 ;
		reci_temp.itm_sub3 := x.itm_sub3 ;
		reci_temp.itm_ext := c_null_val ;
		reci_temp.itm_mfg_inst_no := x.itm_mfg_inst_no ;
		reci_temp.mfg_act_no := x.mfg_act_no ;
		reci_temp.oper_act_no := x.oper_act_no ;
		reci_temp.loc_cd := x.loc_cd ;
		reci_temp.str_ln_cd := x.str_ln_cd ;
		reci_temp.oper_cd := x.oper_cd ;
		reci_temp.oper_seq := x.oper_seq ;
		reci_temp.wip_qty := x.wip_qty ;
		reci_temp.wip_per := x.wip_per ;

		reci[i] := reci_temp ;

		FOR y IN
			SELECT	t.expns_cd,
				t.wip_amt,
				t.inpt_amt
			FROM	mgt_st_wip_expns t
			WHERE	0=0
			AND	t.st_wip_key = x.st_wip_key
			AND	(t.wip_amt <> 0 OR t.inpt_amt <> 0)
		LOOP
			j := j + 1 ;

			recj_temp.st_wip_key := l_row_id ;
			recj_temp.expns_cd := y.expns_cd ;
			recj_temp.wip_amt := y.wip_amt ;
			recj_temp.inpt_amt := y.inpt_amt ;
			recj[j] := recj_temp ;
		END LOOP ;

		IF i + j > c_max_cnt THEN
			CALL mgpa_copy_st$p_wip_insert(reci, recj) ;
			reci := '{}' ;
			recj := '{}' ;
			i := 0 ;
			j := 0 ;
		END IF ;
	END LOOP ;

	CALL mgpa_copy_st$p_wip_insert(reci, recj) ;
	reci := '{}' ;
	recj := '{}' ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_COPY_ST.P_WIP') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_copy_st$p_main (
	IN i_calc_grp_cd_from	VARCHAR,
	IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	IN i_calc_grp_cd_to	VARCHAR,
	IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	IN i_stk_flg	CHARACTER,
	IN i_wip_flg	CHARACTER,
	IN i_lot_no_flg	CHARACTER,
	IN i_sublot_no_flg	CHARACTER,
	IN i_sno1_flg	CHARACTER,
	IN i_sno2_flg	CHARACTER,
	IN i_sno3_flg	CHARACTER,
	IN i_sno4_flg	CHARACTER,
	IN i_bp_flg	CHARACTER,
	IN i_asst_flg	CHARACTER,
	IN i_del_flg	CHARACTER
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	月初データコピーメイン処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd_from
		コピー元計算グループＣＤ
<IN>	i_ym_from
		コピー元年月
<IN>	i_calc_grp_cd_to
		コピー先計算グループＣＤ
<IN>	i_ym_to
		コピー先年月
<IN>	i_stk_flg
		月初在庫作成ＦＬＧ
<IN>	i_wip_flg
		月初仕掛作成ＦＬＧ
<IN>	i_lot_no_flg
		ロットＮＯ引継ＦＬＧ
<IN>	i_sublot_no_flg
		サブロットＮＯ引継ＦＬＧ
<IN>	i_sno1_flg
		手配ＮＯ１引継ＦＬＧ
<IN>	i_sno2_flg
		手配ＮＯ２引継ＦＬＧ
<IN>	i_sno3_flg
		手配ＮＯ３引継ＦＬＧ
<IN>	i_sno4_flg
		手配ＮＯ４引継ＦＬＧ
<IN>	i_bp_flg
		取引先引継ＦＬＧ
<IN>	i_asst_flg
		資産区分引継ＦＬＧ
<IN>	i_del_flg
		削除後再作成ＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
	l_calc_grp	mam_calc_grp%ROWTYPE ;
BEGIN
	/*** コピー先年月に対する確定状況の確認 ***/
	CALL mgpa_calc_fix$p_chk_fix(i_calc_grp_cd_to, i_ym_to) ;

	l_calc_grp := mgpa_calc_grp$f_get_rec(i_calc_grp_cd_to) ;

	IF i_stk_flg = '1' THEN
		CALL mgpa_copy_st$p_stk(i_calc_grp_cd_from, i_ym_from, i_calc_grp_cd_to, i_ym_to,
			i_lot_no_flg, i_sublot_no_flg, i_sno1_flg, i_sno2_flg, i_sno3_flg, i_sno4_flg,
			i_bp_flg, i_asst_flg, i_del_flg, l_calc_grp
			) ;
	END IF ;

	IF i_wip_flg = '1' THEN
		CALL mgpa_copy_st$p_wip(i_calc_grp_cd_from, i_ym_from, i_calc_grp_cd_to, i_ym_to, i_del_flg, l_calc_grp) ;
	END IF ;

EXCEPTION
	WHEN lock_not_available THEN
		CALL fcpa_err$raise_app_err('MGBXD0029') ;
END ;
$BODY$
LANGUAGE plpgsql
;
