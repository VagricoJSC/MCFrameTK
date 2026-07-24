CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_chk_std_rate (
	 IN i_calc_grp_cd	VARCHAR,
	 IN i_calc_no	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準配賦率の確定チェック
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;

	l_arg	mgt_arg%ROWTYPE ;

	l_cnt1	INTEGER ;
	l_cnt2	INTEGER ;
	l_ts	mgt_arg.ins_ts%TYPE ;
BEGIN
	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	IF l_arg.calc_err_flg = '1' THEN
		CALL fcpa_err$raise_app_err('MGBED0003') ;
	END IF ;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt1
	FROM	mgt_calc_std_alc_rate t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

	IF l_arg.alc_calc_typ != fcpa_const$get_const_val('MAC_ALC_CALC_TYP','NON') AND l_cnt1 = 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt2
		FROM	mgt_alc_calc_rate t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		;

		IF l_cnt2 <> 0 THEN
			CALL fcpa_err$raise_app_err('MGBED0005') ;
		END IF ;
	END IF ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt2
	FROM	mgt_calc_std_alc_rate t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_std_alc_rate t2
			WHERE	0=0
			AND	t2.fix_flg = '1'
			AND	t2.term = l_arg.term
			AND	t2.alc_ac_cd = t.alc_ac_cd
			AND	t2.calc_ctg_cd = t.calc_ctg_cd
			AND	t2.wg_cd = t.wg_cd
			AND	COALESCE(t2.dpt_cd, c_null_val) = COALESCE(t.dpt_cd, c_null_val)
			AND	COALESCE(t2.loc_cd, c_null_val) = COALESCE(t.loc_cd, c_null_val)
			AND	COALESCE(t2.oper_cd, c_null_val) = COALESCE(t.oper_cd, c_null_val)
			AND	COALESCE(t2.bp_cd, c_null_val) = COALESCE(t.bp_cd, c_null_val)
			AND	COALESCE(t2.ctg_cd, c_null_val) = COALESCE(t.ctg_cd, c_null_val)
			AND	COALESCE(t2.itm_cd, c_null_val) = COALESCE(t.itm_cd, c_null_val)
			AND	COALESCE(t2.itm_sub1, c_null_val) = COALESCE(t.itm_sub1, c_null_val)
			AND	COALESCE(t2.itm_sub2, c_null_val) = COALESCE(t.itm_sub2, c_null_val)
			AND	COALESCE(t2.itm_sub3, c_null_val) = COALESCE(t.itm_sub3, c_null_val)
		)
	;

	IF l_cnt1 <> l_cnt2 THEN
		CALL fcpa_err$raise_app_err('MGBED0005') ;
	END IF ;

	SELECT	MAX(t.upd_ts)
	INTO STRICT	l_ts
	FROM	mgt_std_alc_rate t
	WHERE	0=0
	AND	t.term = l_arg.term
	AND	t.fix_flg = '1'
	AND	(t.calc_no != i_calc_no OR t.calc_grp_cd != i_calc_grp_cd)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_std_alc_rate t2
			WHERE	0=0
			AND	t2.calc_no = i_calc_no
			AND	t2.calc_grp_cd = i_calc_grp_cd
			AND	t2.alc_ac_cd = t.alc_ac_cd
			AND	t2.calc_ctg_cd = t.calc_ctg_cd
			AND	t2.wg_cd = t.wg_cd
			AND	COALESCE(t2.dpt_cd, c_null_val) = COALESCE(t.dpt_cd, c_null_val)
			AND	COALESCE(t2.loc_cd, c_null_val) = COALESCE(t.loc_cd, c_null_val)
			AND	COALESCE(t2.oper_cd, c_null_val) = COALESCE(t.oper_cd, c_null_val)
			AND	COALESCE(t2.bp_cd, c_null_val) = COALESCE(t.bp_cd, c_null_val)
			AND	COALESCE(t2.ctg_cd, c_null_val) = COALESCE(t.ctg_cd, c_null_val)
			AND	COALESCE(t2.itm_cd, c_null_val) = COALESCE(t.itm_cd, c_null_val)
			AND	COALESCE(t2.itm_sub1, c_null_val) = COALESCE(t.itm_sub1, c_null_val)
			AND	COALESCE(t2.itm_sub2, c_null_val) = COALESCE(t.itm_sub2, c_null_val)
			AND	COALESCE(t2.itm_sub3, c_null_val) = COALESCE(t.itm_sub3, c_null_val)
		)
	;

 	IF l_ts IS NOT NULL AND l_ts > l_arg.ins_ts THEN
		CALL fcpa_err$raise_app_err('MGBED0006') ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_set_child (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	未確定の子品目を確定対象に含める
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt	INTEGER ;
	l_cnt1	INTEGER ;
	l_cnt2	INTEGER ;

	l_arg	mgt_arg%ROWTYPE ;
	l_std_fix_flg	CHAR(1) ;
	l_std_fix_max	NUMERIC ;
	l_parm	mgt_parm.parm_val%TYPE ;
	l_log_no	fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE ;
	x	RECORD ;
BEGIN
	<<SKIP_CHILD_ADD>>
	BEGIN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ITM_FIX.P_SET_CHILD') ;

		l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

		/* 品目をすべて対象としたときはチェックなし */
		SELECT	COUNT(*)
		INTO STRICT	l_cnt1
		FROM	mgt_calc_itm t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt2
		FROM	mgw_fix_itm w
		WHERE	0=0
		;

		IF l_cnt1 = l_cnt2 THEN
			EXIT SKIP_CHILD_ADD ;
		END IF ;

		l_std_fix_max := NULL ;
		l_std_fix_flg := '0' ;

		FOR x IN
			SELECT	t.parm_key,
				t.parm_val
			FROM	mgt_parm t
			WHERE	0=0
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.parm_key LIKE 'STD%'
		LOOP
			IF x.parm_key = 'STD_FIX_CHD' AND x.parm_val = '1' THEN
				l_std_fix_flg := '1' ;
			END IF ;

			IF x.parm_key = 'STD_FIX_CHD_MAX' THEN
				l_std_fix_max := x.parm_val::NUMERIC ;
			END IF ;
		END LOOP ;

		l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP') ;

		/* 未確定子品目を格納 */
		LOOP
			<<SKIP_CHECK>>
			BEGIN
				IF l_std_fix_flg = '0' THEN
					EXIT SKIP_CHECK ;
				END IF ;

				l_cnt := - 1 ;
				FOR x IN
					SELECT	t.itm_cd,
						t.itm_sub1,
						t.itm_sub2,
						t.itm_sub3,
						t.wg_cd,
						t.calc_ctg_cd
					FROM	mgt_calc_itm t
					WHERE	0=0
					AND	t.calc_no = i_calc_no
					AND	t.calc_grp_cd = i_calc_grp_cd
					AND	NOT EXISTS (
							SELECT	'X'
							FROM	mgw_fix_itm w
							WHERE	0=0
							AND	w.itm_cd = t.itm_cd
							AND	w.itm_sub1 = t.itm_sub1
							AND	w.itm_sub2 = t.itm_sub2
							AND	w.itm_sub3 = t.itm_sub3
							AND	w.wg_cd = t.wg_cd
							AND	w.calc_ctg_cd = t.calc_ctg_cd
							)
					AND	EXISTS (
						SELECT	'X'
						FROM	mgt_std_inpt w
						WHERE	0=0
						AND	w.calc_no = t.calc_no
						AND	w.calc_grp_cd = t.calc_grp_cd
						AND	w.itm_cd = t.itm_cd
						AND	w.itm_sub1 = t.itm_sub1
						AND	w.itm_sub2 = t.itm_sub2
						AND	w.itm_sub3 = t.itm_sub3
						AND	w.wg_cd = t.wg_cd
						AND	w.lvl = 1
						AND	EXISTS (
								SELECT	'X'
								FROM	mgt_std_top w1, mgw_fix_itm w2
								WHERE	0=0
								AND	w1.calc_no = w.calc_no
								AND	w1.calc_grp_cd = w.calc_grp_cd
								AND	w1.top_rec_no = w.top_rec_no
								AND	w1.sls_flg = '0'
								AND	w1.itm_cd = w2.itm_cd
								AND	w1.itm_sub1 = w2.itm_sub1
								AND	w1.itm_sub2 = w2.itm_sub2
								AND	w1.itm_sub3 = w2.itm_sub3
								AND	w1.wg_cd = w2.wg_cd
							)
						)
					AND	NOT EXISTS (
							SELECT	'X'
							FROM	mgt_std_fix t1
							WHERE	0=0
							AND	t1.itm_cd = t.itm_cd
							AND	t1.itm_sub1 = t.itm_sub1
							AND	t1.itm_sub2 = t.itm_sub2
							AND	t1.itm_sub3 = t.itm_sub3
							AND	t1.calc_ctg_cd = t.calc_ctg_cd
							AND	t1.wg_cd = t.wg_cd
							AND	t1.term = l_arg.term
						)
				LOOP
					l_cnt := l_cnt + 1 ;

					IF l_std_fix_max IS NOT NULL AND l_cnt >= l_std_fix_max THEN
						CALL fcpa_err$raise_app_err('MGBED0010') ;
					END IF ;

					CALL fcpa_batch_log$p_data_log('MGBED0009',
						l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
						x.calc_ctg_cd, x.wg_cd) ;
				END LOOP ;

				/* 依頼先の未確定子品目を格納 */
				FOR x IN
					SELECT DISTINCT
						t4.itm_cd,
						t4.itm_sub1,
						t4.itm_sub2,
						t4.itm_sub3,
						t4.wg_cd,
						t4.calc_ctg_cd
					FROM	mgw_fix_itm w,
						mgt_std_top t1,
						mgt_std_inpt t2,
						mgt_calc_itm_dtl t3,
						mgt_calc_itm t4
					WHERE	0=0
					AND	t1.calc_no = i_calc_no
					AND	t1.calc_grp_cd = i_calc_grp_cd
					AND	t1.sls_flg = '0'
					AND	t1.itm_cd = w.itm_cd
					AND	t1.itm_sub1 = w.itm_sub1
					AND	t1.itm_sub2 = w.itm_sub2
					AND	t1.itm_sub3 = w.itm_sub3
					AND	t1.wg_cd = w.wg_cd
					AND	t2.calc_no = t1.calc_no
					AND	t2.calc_grp_cd = t1.calc_grp_cd
					AND	t2.top_rec_no = t1.top_rec_no
					AND	t2.lvl <= 1
					AND	t3.calc_no = t2.calc_no
					AND	t3.calc_grp_cd = t2.calc_grp_cd
					AND	t3.itm_cd = t2.itm_cd
					AND	t3.itm_sub1 = t2.itm_sub1
					AND	t3.itm_sub2 = t2.itm_sub2
					AND	t3.itm_sub3 = t2.itm_sub3
					AND	t3.wg_cd = t2.wg_cd
					AND	t4.calc_no = t3.calc_no
					AND	t4.calc_grp_cd = t3.calc_grp_cd
					AND	t4.itm_cd = t3.itm_cd
					AND	t4.itm_sub1 = t3.itm_sub1
					AND	t4.itm_sub2 = t3.itm_sub2
					AND	t4.itm_sub3 = t3.itm_sub3
					AND	t4.wg_cd = t3.rqst_wg_cd
					AND	NOT EXISTS (
							SELECT	'X'
							FROM	mgw_fix_itm w1
							WHERE	0=0
							AND	w1.itm_cd = t4.itm_cd
							AND	w1.itm_sub1 = t4.itm_sub1
							AND	w1.itm_sub2 = t4.itm_sub2
							AND	w1.itm_sub3 = t4.itm_sub3
							AND	w1.wg_cd = t4.wg_cd
							AND	w1.calc_ctg_cd = t4.calc_ctg_cd
							)
					AND	NOT EXISTS (
							SELECT	'X'
							FROM	mgt_std_fix w2
							WHERE	0=0
							AND	w2.itm_cd = t4.itm_cd
							AND	w2.itm_sub1 = t4.itm_sub1
							AND	w2.itm_sub2 = t4.itm_sub2
							AND	w2.itm_sub3 = t4.itm_sub3
							AND	w2.calc_ctg_cd = t4.calc_ctg_cd
							AND	w2.wg_cd = t4.wg_cd
							AND	w2.term = l_arg.term
							)
				LOOP
					l_cnt := l_cnt + 1 ;

					IF l_std_fix_max IS NOT NULL AND l_cnt >= l_std_fix_max THEN
						CALL fcpa_err$raise_app_err('MGBED0010') ;
					END IF ;

					CALL fcpa_batch_log$p_data_log('MGBED0009',
						l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
						x.calc_ctg_cd, x.wg_cd) ;
				END LOOP ;

				IF l_cnt >= 0 THEN
					CALL fcpa_err$raise_app_err('MGBED0010') ;
				ELSE
					EXIT ;
				END IF ;
			END ;

			INSERT INTO mgw_fix_itm (
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				wg_cd,
				calc_ctg_cd
				)
			SELECT
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.wg_cd,
				t.calc_ctg_cd
			FROM	mgt_calc_itm t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgw_fix_itm w
					WHERE	0=0
					AND	w.itm_cd = t.itm_cd
					AND	w.itm_sub1 = t.itm_sub1
					AND	w.itm_sub2 = t.itm_sub2
					AND	w.itm_sub3 = t.itm_sub3
					AND	w.wg_cd = t.wg_cd
					AND	w.calc_ctg_cd = t.calc_ctg_cd
				)
			AND	EXISTS (
					SELECT	'X'
					FROM	mgt_std_inpt w
					WHERE	0=0
					AND	w.calc_no = t.calc_no
					AND	w.calc_grp_cd = t.calc_grp_cd
					AND	w.itm_cd = t.itm_cd
					AND	w.itm_sub1 = t.itm_sub1
					AND	w.itm_sub2 = t.itm_sub2
					AND	w.itm_sub3 = t.itm_sub3
					AND	w.wg_cd = t.wg_cd
					AND	w.lvl >= 1
					AND	EXISTS (
							SELECT	'X'
							FROM	mgt_std_top w1, mgw_fix_itm w2
							WHERE	0=0
							AND	w1.calc_no = w.calc_no
							AND	w1.calc_grp_cd = w.calc_grp_cd
							AND	w1.top_rec_no = w.top_rec_no
							AND	w1.sls_flg = '0'
							AND	w1.itm_cd = w2.itm_cd
							AND	w1.itm_sub1 = w2.itm_sub1
							AND	w1.itm_sub2 = w2.itm_sub2
							AND	w1.itm_sub3 = w2.itm_sub3
							AND	w1.wg_cd = w2.wg_cd
						)
				)
			;

			GET DIAGNOSTICS l_cnt = ROW_COUNT ;

			/* 依頼先の未確定子品目を格納 */
			INSERT INTO mgw_fix_itm (
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				wg_cd,
				calc_ctg_cd
				)
			SELECT	DISTINCT
				t4.itm_cd,
				t4.itm_sub1,
				t4.itm_sub2,
				t4.itm_sub3,
				t4.wg_cd,
				t4.calc_ctg_cd
			FROM	mgw_fix_itm w,
				mgt_std_top t1,
				mgt_std_inpt t2,
				mgt_calc_itm_dtl t3,
				mgt_calc_itm t4
			WHERE	0=0
			AND	t1.calc_no = i_calc_no
			AND	t1.calc_grp_cd = i_calc_grp_cd
			AND	t1.sls_flg = '0'
			AND	t1.itm_cd = w.itm_cd
			AND	t1.itm_sub1 = w.itm_sub1
			AND	t1.itm_sub2 = w.itm_sub2
			AND	t1.itm_sub3 = w.itm_sub3
			AND	t1.wg_cd = w.wg_cd
			AND	t2.calc_no = t1.calc_no
			AND	t2.calc_grp_cd = t1.calc_grp_cd
			AND	t2.top_rec_no = t1.top_rec_no
			AND	t3.calc_no = t2.calc_no
			AND	t3.calc_grp_cd = t2.calc_grp_cd
			AND	t3.itm_cd = t2.itm_cd
			AND	t3.itm_sub1 = t2.itm_sub1
			AND	t3.itm_sub2 = t2.itm_sub2
			AND	t3.itm_sub3 = t2.itm_sub3
			AND	t3.wg_cd = t2.wg_cd
			AND	t4.calc_no = t3.calc_no
			AND	t4.calc_grp_cd = t3.calc_grp_cd
			AND	t4.itm_cd = t3.itm_cd
			AND	t4.itm_sub1 = t3.itm_sub1
			AND	t4.itm_sub2 = t3.itm_sub2
			AND	t4.itm_sub3 = t3.itm_sub3
			AND	t4.wg_cd = t3.rqst_wg_cd
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgw_fix_itm w
					WHERE	0=0
					AND	w.itm_cd = t4.itm_cd
					AND	w.itm_sub1 = t4.itm_sub1
					AND	w.itm_sub2 = t4.itm_sub2
					AND	w.itm_sub3 = t4.itm_sub3
					AND	w.wg_cd = t4.wg_cd
					AND	w.calc_ctg_cd = t4.calc_ctg_cd
					)
			;

			GET DIAGNOSTICS l_cnt2 = ROW_COUNT ;
			l_cnt = l_cnt + l_cnt2 ;

			IF l_cnt = 0 THEN
				EXIT ;
			END IF ;
		END LOOP ;

	END ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ITM_FIX.P_SET_CHILD') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_fix_main (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準単価確定メイン処理
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_expns_prod	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','PROD') ;

	/* 対象品目のロック用のカーソル */
	lock_itm CURSOR  (ci_term mgt_arg.term%TYPE) FOR
		SELECT	t.itm_cd
		FROM	mgt_itm t
		WHERE	0=0
		AND	t.term = ci_term
		AND	EXISTS (
				SELECT	'X'
				FROM	mgw_fix_itm w
				WHERE 	0=0
				AND	w.itm_cd = t.itm_cd
				AND	w.itm_sub1 = t.itm_sub1
				AND	w.itm_sub2 = t.itm_sub2
				AND	w.itm_sub3 = t.itm_sub3
				AND	w.wg_cd = t.wg_cd
				AND	w.calc_ctg_cd = t.calc_ctg_cd
			)
		FOR UPDATE NOWAIT
	;

	l_arg	mgt_arg%ROWTYPE ;

	l_cnt	INTEGER ;
	l_ts	mgt_arg.ins_ts%TYPE ;
	x1	RECORD ;
	x2	RECORD ;
	x3	RECORD ;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ITM_FIX.P_FIX_MAIN') ;

	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	CALL mgpa_arg$p_lock(i_calc_grp_cd, i_calc_no, '0') ;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgw_fix_itm w
	WHERE	0=0
	;

	IF l_cnt = 0 THEN
		RETURN ;
	END IF ;

	/* 対象品目のロック */
	BEGIN
		FOR x1 IN lock_itm(l_arg.term) LOOP EXIT ;
		END LOOP ;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MGBXD0029') ;
	END ;

	SELECT	MAX(t.upd_ts)
	INTO STRICT	l_ts
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.term = l_arg.term
	AND	(t.calc_no != i_calc_no OR t.calc_grp_cd != i_calc_grp_cd)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	w.wg_cd = t.wg_cd
			AND	w.calc_ctg_cd = t.calc_ctg_cd
		)
	;

 	IF l_ts IS NOT NULL AND l_ts > l_arg.ins_ts THEN
		CALL fcpa_err$raise_app_err('MGBED0002') ;
	END IF ;

	/* 確定品目の削除 */
	DELETE FROM	mgw_fix_itm w
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_std_fix t
			WHERE	0=0
			AND	t.term = l_arg.term
			AND	t.itm_cd = w.itm_cd
			AND	t.itm_sub1 = w.itm_sub1
			AND	t.itm_sub2 = w.itm_sub2
			AND	t.itm_sub3 = w.itm_sub3
			AND	t.wg_cd = w.wg_cd
			AND	t.calc_ctg_cd = w.calc_ctg_cd
		)
	;

	/* mgt_std_topに存在しないデータは対象外とする */
	DELETE FROM	mgw_fix_itm w
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mgt_std_top t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.itm_cd = w.itm_cd
			AND	t.itm_sub1 = w.itm_sub1
			AND	t.itm_sub2 = w.itm_sub2
			AND	t.itm_sub3 = w.itm_sub3
			AND	t.wg_cd = w.wg_cd
			AND	t.sls_flg = '0'
		)
	;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgw_fix_itm w
	WHERE	0=0
	;

	IF l_cnt = 0 THEN
		CALL fcpa_batch_log$p_proc_log('MGBED0007');
		RETURN ;
	END IF ;

	UPDATE	mgw_fix_itm w
	SET	(calc_ptn_cd, std_qty)
		=
		(
		SELECT	t.calc_ptn_cd, t.std_qty
		FROM	mgt_calc_itm t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		AND	t.itm_cd = w.itm_cd
		AND	t.itm_sub1 = w.itm_sub1
		AND	t.itm_sub2 = w.itm_sub2
		AND	t.itm_sub3 = w.itm_sub3
		AND	t.wg_cd = w.wg_cd
		)
	WHERE	0=0
	;

	FOR x2 IN
		SELECT	w.*
		FROM	mgw_fix_itm w
		WHERE	0=0
	LOOP
		SELECT	COUNT(*)
		INTO STRICT	l_cnt
		FROM	mgt_itm t
		WHERE	0=0
		AND	t.term = l_arg.term
		AND	t.itm_cd = x2.itm_cd
		AND	t.itm_sub1 = x2.itm_sub1
		AND	t.itm_sub2 = x2.itm_sub2
		AND	t.itm_sub3 = x2.itm_sub3
		AND	t.wg_cd = x2.wg_cd
		AND	t.calc_ctg_cd = x2.calc_ctg_cd
		;

		IF l_cnt = 0 THEN
			INSERT INTO mgt_itm (
				itm_cd, itm_sub1, itm_sub2, itm_sub3, term,
				calc_ctg_cd, wg_cd, calc_ptn_cd,
				std_qty,
				fix_flg,
				rmrks, sub_char1, sub_char2, sub_char3
				)
			VALUES (
				x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3, l_arg.term,
				x2.calc_ctg_cd, x2.wg_cd, x2.calc_ptn_cd,
				x2.std_qty,
				'1',
				NULL, NULL, NULL, NULL
				)
			;
		ELSE
			UPDATE	mgt_itm t
			SET	calc_ptn_cd = x2.calc_ptn_cd,
				std_qty = x2.std_qty,
				fix_flg = '1',
				non_calc_flg = '0'
			WHERE	0=0
			AND	t.term = l_arg.term
			AND	t.itm_cd = x2.itm_cd
			AND	t.itm_sub1 = x2.itm_sub1
			AND	t.itm_sub2 = x2.itm_sub2
			AND	t.itm_sub3 = x2.itm_sub3
			AND	t.wg_cd = x2.wg_cd
			AND	t.calc_ctg_cd = x2.calc_ctg_cd
			;
		END IF ;
	END LOOP ;

	DELETE FROM	mgt_itm_dtl t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_dtl t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.itm_cd = t2.itm_cd
			AND	t.itm_sub1 = t2.itm_sub1
			AND	t.itm_sub2 = t2.itm_sub2
			AND	t.itm_sub3 = t2.itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t2.itm_cd
			AND	w.itm_sub1 = t2.itm_sub1
			AND	w.itm_sub2 = t2.itm_sub2
			AND	w.itm_sub3 = t2.itm_sub3
			AND	(t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		)
	;

	DELETE FROM mgw_fix_itm_dtl ;

	INSERT INTO mgw_fix_itm_dtl (
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		loc_cd, sppl_cd, rqst_wg_cd,
		term,
		calc_ctg_cd, wg_cd,
		cost_ratio,
		oper_ptn, bom_ptn,
		min_lot_qty, batch_lot_qty,
		fxd_lot_qty, fxd_yield_qty,
		nmr_qty, dnm_qty,
		alc_dpt_cd,
		exp_dpt_cd, exp_prio, max_qty,
		alc_val1, alc_val2, alc_val3, alc_val4, alc_val5,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.loc_cd, t.sppl_cd, t.rqst_wg_cd,
		l_arg.term,
		t.calc_ctg_cd, t.wg_cd,
		t.cost_ratio,
		t.oper_ptn, t.bom_ptn,
		t.min_lot_qty, t.batch_lot_qty,
		t.fxd_lot_qty, t.fxd_yield_qty,
		t.nmr_qty, t.dnm_qty,
		t.alc_dpt_cd,
		t.exp_dpt_cd, t.exp_prio, t.max_qty,
		t.alc_val1, t.alc_val2, t.alc_val3, t.alc_val4, t.alc_val5,
		t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3
	FROM	mgt_calc_itm_dtl t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	(t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	/* 原価品目工程情報に存在しない工程パタンはNULLに更新する */
	UPDATE mgw_fix_itm_dtl w
	SET oper_ptn = NULL
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_oper t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.itm_cd = w.itm_cd
			AND	t.itm_sub1 = w.itm_sub1
			AND	t.itm_sub2 = w.itm_sub2
			AND	t.itm_sub3 = w.itm_sub3
			AND	(t.wg_cd = c_null_val OR w.wg_cd = c_null_val OR t.wg_cd = w.wg_cd)
			AND	t.oper_ptn = w.oper_ptn
		)
	;

	/* 原価ＢＯＭ情報に存在しない構成パタンはNULLに更新する */
	UPDATE mgw_fix_itm_dtl w
	SET bom_ptn = c_null_val
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mgt_calc_bom t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.par_itm_cd = w.itm_cd
			AND	t.par_itm_sub1 = w.itm_sub1
			AND	t.par_itm_sub2 = w.itm_sub2
			AND	t.par_itm_sub3 = w.itm_sub3
			AND	(t.wg_cd = c_null_val OR w.wg_cd = c_null_val OR t.wg_cd = w.wg_cd)
			AND	t.bom_ptn = w.bom_ptn
		)
	;

	INSERT INTO mgt_itm_dtl (
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		loc_cd, sppl_cd, rqst_wg_cd,
		term,
		calc_ctg_cd, wg_cd,
		cost_ratio,
		oper_ptn, bom_ptn,
		min_lot_qty, batch_lot_qty,
		fxd_lot_qty, fxd_yield_qty,
		nmr_qty, dnm_qty,
		alc_dpt_cd,
		exp_dpt_cd, exp_prio, max_qty,
		alc_val1, alc_val2, alc_val3, alc_val4, alc_val5,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
		w.loc_cd, w.sppl_cd, w.rqst_wg_cd,
		l_arg.term,
		w.calc_ctg_cd, w.wg_cd,
		w.cost_ratio,
		w.oper_ptn, COALESCE(w.bom_ptn, c_null_val),
		w.min_lot_qty, w.batch_lot_qty,
		w.fxd_lot_qty, w.fxd_yield_qty,
		w.nmr_qty, w.dnm_qty,
		w.alc_dpt_cd,
		w.exp_dpt_cd, w.exp_prio, w.max_qty,
		w.alc_val1, w.alc_val2, w.alc_val3, w.alc_val4, w.alc_val5,
		w.rmrks, w.sub_char1, w.sub_char2, w.sub_char3
		FROM	mgw_fix_itm_dtl w
		WHERE	0=0
	;

	DELETE FROM	mgt_itm_oper t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_oper t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.itm_cd = t2.itm_cd
			AND	t.itm_sub1 = t2.itm_sub1
			AND	t.itm_sub2 = t2.itm_sub2
			AND	t.itm_sub3 = t2.itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm_dtl w
			WHERE	0=0
			AND	w.itm_cd = t2.itm_cd
			AND	w.itm_sub1 = t2.itm_sub1
			AND	w.itm_sub2 = t2.itm_sub2
			AND	w.itm_sub3 = t2.itm_sub3
			AND	(w.wg_cd = c_null_val OR t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		)
	;

	INSERT INTO mgt_itm_oper (
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		loc_cd, oper_ptn,
		oper_cd, oper_seq,
		term,
		calc_ctg_cd, wg_cd,
		disp_seq,
		nmr_qty, dnm_qty,
		yield_oper_flg,
		oper_unit_cd, oper_std_qty, oper_conv_qty,
		dec_place, unit_conv_rnd_typ,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.loc_cd, t.oper_ptn,
		t.oper_cd, t.oper_seq,
		l_arg.term,
		t.calc_ctg_cd, t.wg_cd,
		t.disp_seq,
		t.nmr_qty, t.dnm_qty,
		t.yield_oper_flg,
		t.oper_unit_cd, t.oper_std_qty, t.oper_conv_qty,
		t.dec_place, t.unit_conv_rnd_typ,
		t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3
	FROM	mgt_calc_itm_oper t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm_dtl w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	(w.wg_cd = c_null_val OR t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	DELETE FROM	mgt_bom t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_bom t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.par_itm_cd = t2.par_itm_cd
			AND	t.par_itm_sub1 = t2.par_itm_sub1
			AND	t.par_itm_sub2 = t2.par_itm_sub2
			AND	t.par_itm_sub3 = t2.par_itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm_dtl w
			WHERE	0=0
			AND	w.itm_cd = t2.par_itm_cd
			AND	w.itm_sub1 = t2.par_itm_sub1
			AND	w.itm_sub2 = t2.par_itm_sub2
			AND	w.itm_sub3 = t2.par_itm_sub3
			AND	(w.wg_cd = c_null_val OR t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		)
	;

	INSERT INTO mgt_bom (
		par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
		bom_ptn, oper_cd, oper_seq,
		chd_itm_cd, chd_itm_sub1, chd_itm_sub2, chd_itm_sub3,
		alt_grp_cd,
		expns_cd,
		term, calc_ctg_cd,
		wg_cd,
		disp_seq,
		par_rqmt_qty,
		chd_rqmt_qty, chd_base_qty,
		fxd_chd_rqmt_qty, chd_min_qty, chd_batch_qty,
		alt_itm_ratio,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3,
		t.bom_ptn, t.oper_cd, t.oper_seq,
		t.chd_itm_cd, t.chd_itm_sub1, t.chd_itm_sub2, t.chd_itm_sub3,
		t.alt_grp_cd,
		t.expns_cd,
		l_arg.term, t.calc_ctg_cd,
		t.wg_cd,
		t.disp_seq,
		t.par_rqmt_qty,
		t.chd_rqmt_qty, t.chd_base_qty,
		t.fxd_chd_rqmt_qty, t.chd_min_qty, t.chd_batch_qty,
		t.alt_itm_ratio,
		t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3
	FROM	mgt_calc_bom t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm_dtl w
			WHERE	0=0
			AND	w.itm_cd = t.par_itm_cd
			AND	w.itm_sub1 = t.par_itm_sub1
			AND	w.itm_sub2 = t.par_itm_sub2
			AND	w.itm_sub3 = t.par_itm_sub3
			AND	(w.wg_cd = c_null_val OR t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	DELETE FROM	mgt_itm_wk t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_wk t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.itm_cd = t2.itm_cd
			AND	t.itm_sub1 = t2.itm_sub1
			AND	t.itm_sub2 = t2.itm_sub2
			AND	t.itm_sub3 = t2.itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm_dtl w
			WHERE	0=0
			AND	w.itm_cd = t2.itm_cd
			AND	w.itm_sub1 = t2.itm_sub1
			AND	w.itm_sub2 = t2.itm_sub2
			AND	w.itm_sub3 = t2.itm_sub3
			AND	(w.wg_cd = c_null_val OR t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		)
	;

	INSERT INTO mgt_itm_wk (
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		loc_cd, oper_ptn, oper_cd, oper_seq,
		wk_cost_cd,
		term,
		calc_ctg_cd, wg_cd,
		base_qty,
		fxd_wk_cost, wk_cost,
		min_wk_cost, batch_wk_cost,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.loc_cd, t.oper_ptn, t.oper_cd, t.oper_seq,
		t.wk_cost_cd,
		l_arg.term,
		t.calc_ctg_cd, t.wg_cd,
		t.base_qty,
		t.fxd_wk_cost, t.wk_cost,
		t.min_wk_cost, t.batch_wk_cost,
		t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3
	FROM	mgt_calc_itm_wk t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm_dtl w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	(w.wg_cd = c_null_val OR t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	DELETE FROM	mgt_itm_purc t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_purc t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.itm_cd = t2.itm_cd
			AND	t.itm_sub1 = t2.itm_sub1
			AND	t.itm_sub2 = t2.itm_sub2
			AND	t.itm_sub3 = t2.itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t2.itm_cd
			AND	w.itm_sub1 = t2.itm_sub1
			AND	w.itm_sub2 = t2.itm_sub2
			AND	w.itm_sub3 = t2.itm_sub3
			AND	(t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		)
	;

	INSERT INTO mgt_itm_purc (
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		sppl_cd,
		term,
		calc_ctg_cd, wg_cd,
		base_qty, cur_cd, upri,
		cost_ratio,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.sppl_cd,
		l_arg.term,
		t.calc_ctg_cd, t.wg_cd,
		t.base_qty, t.cur_cd, t.upri,
		t.cost_ratio,
		t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3
	FROM	mgt_calc_itm_purc t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	(t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	DELETE FROM	mgt_itm_proc t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_proc t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.itm_cd = t2.itm_cd
			AND	t.itm_sub1 = t2.itm_sub1
			AND	t.itm_sub2 = t2.itm_sub2
			AND	t.itm_sub3 = t2.itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t2.itm_cd
			AND	w.itm_sub1 = t2.itm_sub1
			AND	w.itm_sub2 = t2.itm_sub2
			AND	w.itm_sub3 = t2.itm_sub3
			AND	(t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		)
	;

	INSERT INTO mgt_itm_proc (
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		sppl_cd,
		term,
		calc_ctg_cd, wg_cd,
		base_qty, cur_cd, upri,
		cost_ratio,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.sppl_cd,
		l_arg.term,
		t.calc_ctg_cd, t.wg_cd,
		t.base_qty, t.cur_cd, t.upri,
		t.cost_ratio,
		t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3
	FROM	mgt_calc_itm_proc t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	(t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	DELETE FROM	mgt_itm_prov t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_prov t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.itm_cd = t2.itm_cd
			AND	t.itm_sub1 = t2.itm_sub1
			AND	t.itm_sub2 = t2.itm_sub2
			AND	t.itm_sub3 = t2.itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t2.itm_cd
			AND	w.itm_sub1 = t2.itm_sub1
			AND	w.itm_sub2 = t2.itm_sub2
			AND	w.itm_sub3 = t2.itm_sub3
			AND	(t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		) 
	;

	INSERT INTO mgt_itm_prov (
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		prsppl_cd,
		term,
		calc_ctg_cd, wg_cd,
		prov_typ, base_qty, cur_cd,
		upri,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.prsppl_cd,
		l_arg.term,
		t.calc_ctg_cd, t.wg_cd,
		t.prov_typ, t.base_qty, t.cur_cd,
		t.upri,
		t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3
	FROM	mgt_calc_itm_prov t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	(t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	DELETE FROM	mgt_itm_sls t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_sls t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.itm_cd = t2.itm_cd
			AND	t.itm_sub1 = t2.itm_sub1
			AND	t.itm_sub2 = t2.itm_sub2
			AND	t.itm_sub3 = t2.itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t2.itm_cd
			AND	w.itm_sub1 = t2.itm_sub1
			AND	w.itm_sub2 = t2.itm_sub2
			AND	w.itm_sub3 = t2.itm_sub3
			AND	(t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		)
	;

	INSERT INTO mgt_itm_sls (
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		dpt_cd, cst_cd, dlv_cd,
		dest_cd1, dest_cd2, dest_cd3,
		term,
		calc_ctg_cd, wg_cd,
		base_qty, cur_cd, upri, prio,
		alc_val1, alc_val2, alc_val3, alc_val4, alc_val5,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.dpt_cd, t.cst_cd, t.dlv_cd,
		t.dest_cd1, t.dest_cd2, t.dest_cd3,
		l_arg.term,
		t.calc_ctg_cd, t.wg_cd,
		t.base_qty, t.cur_cd, t.upri, t.prio,
		t.alc_val1, t.alc_val2, t.alc_val3, t.alc_val4, t.alc_val5,
		t.rmrks, sub_char1, sub_char2, sub_char3
	FROM	mgt_calc_itm_sls t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	(t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	DELETE FROM	mgt_itm_fix t2
	WHERE	0=0
	AND	t2.term = l_arg.term
	AND	(l_ts IS NULL OR t2.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_itm_fix t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.calc_ctg_cd = t2.calc_ctg_cd
			AND	t.itm_cd = t2.itm_cd
			AND	t.itm_sub1 = t2.itm_sub1
			AND	t.itm_sub2 = t2.itm_sub2
			AND	t.itm_sub3 = t2.itm_sub3
			AND	t.wg_cd = t2.wg_cd
		)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t2.itm_cd
			AND	w.itm_sub1 = t2.itm_sub1
			AND	w.itm_sub2 = t2.itm_sub2
			AND	w.itm_sub3 = t2.itm_sub3
			AND	(t2.wg_cd = c_null_val OR w.wg_cd = t2.wg_cd)
		)
	;

	INSERT INTO mgt_itm_fix (
		itm_cd, itm_sub1, itm_sub2, itm_sub3, expns_cd,
		term,
		calc_ctg_cd, wg_cd,
		base_qty, std_upri,
		rmrks, sub_char1, sub_char2, sub_char3
		)
	SELECT	t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.expns_cd,
		l_arg.term,
		t.calc_ctg_cd, t.wg_cd,
		t.base_qty, t.std_upri,
		t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3
	FROM	mgt_calc_itm_fix t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(l_ts IS NULL OR t.wg_cd <> c_null_val)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	(t.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
		)
	;

	FOR x3 IN
		SELECT t.*
		FROM	mgt_calc_xrate t
		WHERE	0=0
		AND	t.calc_no = l_arg.calc_no
		AND	t.calc_grp_cd = l_arg.calc_grp_cd
		AND	t.xrate_cd = l_arg.xrate_cd
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	mgt_cur_xrate w
				WHERE	0=0
				AND	w.fr_cur_cd = t.fr_cur_cd
				AND	w.to_cur_cd = t.to_cur_cd
				AND	w.xrate_cd = t.xrate_cd
				AND	w.term = l_arg.term
				AND	w.fix_flg = '1'
			)
	LOOP
		SELECT	COUNT(*)
		INTO STRICT	l_cnt
		FROM	mgt_cur_xrate t2
		WHERE	0=0
		AND	t2.term = l_arg.term
		AND	t2.xrate_cd = l_arg.xrate_cd
		AND	t2.fr_cur_cd = x3.fr_cur_cd
		AND	t2.to_cur_cd = x3.to_cur_cd
		;

		IF l_cnt = 0 THEN
			INSERT INTO mgt_cur_xrate (
				term, xrate_cd,
				fr_cur_cd, to_cur_cd,
				xrate,
				fix_flg
				)
			VALUES (
				l_arg.term, l_arg.xrate_cd,
				x3.fr_cur_cd, x3.to_cur_cd,
				x3.xrate,
				'1'
				)
			;
		ELSE
			UPDATE	mgt_cur_xrate t2
			SET	xrate = x3.xrate,
				fix_flg = '1'
			WHERE	0=0
			AND	t2.term = l_arg.term
			AND	t2.xrate_cd = l_arg.xrate_cd
			AND	t2.fr_cur_cd = x3.fr_cur_cd
			AND	t2.to_cur_cd = x3.to_cur_cd
			;
		END IF ;
	END LOOP ;

	INSERT INTO mgt_std_fix (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		term,
		calc_ctg_cd,
		wg_cd,
		std_qty,
		std_upri,
		calc_no,
		calc_grp_cd
		)
	SELECT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		l_arg.term,
		x.calc_ctg_cd,
		x.wg_cd,
		SUM(x.qty),
		SUM(x.std_cost),
		i_calc_no,
		i_calc_grp_cd
	FROM	(
		SELECT	w1.itm_cd,
			w1.itm_sub1,
			w1.itm_sub2,
			w1.itm_sub3,
			w1.wg_cd,
			w1.calc_ctg_cd,
			t1.top_rec_no,
			COALESCE(t1.qty, 0) AS qty,
			COALESCE(SUM(t2.std_cost), 0) AS std_cost
		FROM	mgw_fix_itm w1, mgt_std_top t1
				LEFT OUTER JOIN mgt_std_sml_cost t2
					ON (t1.calc_no = t2.calc_no
						AND	t1.calc_grp_cd = t2.calc_grp_cd
						AND	t1.top_rec_no = t2.top_rec_no
						AND	t2.expns_typ = c_expns_prod
						)
		WHERE	0=0
		AND	w1.itm_cd = t1.itm_cd
		AND	w1.itm_sub1 = t1.itm_sub1
		AND	w1.itm_sub2 = t1.itm_sub2
		AND	w1.itm_sub3 = t1.itm_sub3
		AND	w1.wg_cd = t1.wg_cd
		AND	t1.calc_no = i_calc_no
		AND	t1.calc_grp_cd = i_calc_grp_cd
		AND	t1.sls_flg = '0'
		GROUP BY w1.itm_cd, w1.itm_sub1, w1.itm_sub2, w1.itm_sub3, w1.wg_cd, w1.calc_ctg_cd, t1.top_rec_no, t1.qty
		) x
	WHERE	0=0
	GROUP BY x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, x.calc_ctg_cd, x.wg_cd
	;

	GET DIAGNOSTICS l_cnt = ROW_COUNT ;
	CALL fcpa_batch_log$p_proc_log('MGBED0001', l_cnt::VARCHAR) ;

	UPDATE mgt_arg t
	SET fix_flg = '1'
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ITM_FIX.P_FIX_MAIN') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_fix (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準単価確定処理
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ITM_FIX.P_FIX') ;

	CALL mgpa_itm_fix$p_chk_std_rate(i_calc_grp_cd, i_calc_no) ;

	CALL mgpa_itm_fix$p_set_child(i_calc_grp_cd, i_calc_no) ;

	CALL mgpa_itm_fix$p_fix_main(i_calc_grp_cd, i_calc_no) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ITM_FIX.P_FIX') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_bulk_fix (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_wg_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準単価一括確定処理
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<IN> i_wg_cd
	ワーキンググループＣＤ
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ITM_FIX.P_BULK_FIX') ;

	CALL mgpa_itm_fix$p_chk_std_rate(i_calc_grp_cd, i_calc_no) ;

 	DELETE FROM mgw_fix_itm ;

	INSERT INTO mgw_fix_itm (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		wg_cd,
		calc_ctg_cd
		)
	SELECT
		t.itm_cd,
		t.itm_sub1,
		t.itm_sub2,
		t.itm_sub3,
		t.wg_cd,
		t.calc_ctg_cd
	FROM	 mgt_calc_itm t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.wg_cd = i_wg_cd
	;

	CALL mgpa_itm_fix$p_set_child(i_calc_grp_cd, i_calc_no) ;

	CALL mgpa_itm_fix$p_fix_main(i_calc_grp_cd, i_calc_no) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ITM_FIX.P_BULK_FIX') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_set_parent (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_flg CHARACTER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定済みの親品目を確定解除対象に含める
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<IN> i_flg
	品目件数チェックＦＬＧ
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt	INTEGER ;
	l_cnt1	INTEGER ;
	l_cnt2	INTEGER ;

	l_arg	mgt_arg%ROWTYPE ;
BEGIN
	<<SKIP_PARENT_ADD>>
	BEGIN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ITM_FIX.P_SET_PARENT') ;

		l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

		IF l_arg.calc_err_flg = '1' THEN
			CALL fcpa_err$raise_app_err('MGBED0003') ;
		END IF ;

		IF i_flg = '1' THEN
			/* 品目をすべて対象としたときはチェックなし */
			SELECT	COUNT(*)
			INTO STRICT	l_cnt1
			FROM	mgt_calc_itm t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			;

			SELECT	COUNT(*)
			INTO	STRICT l_cnt2
			FROM	mgw_fix_itm w
			WHERE	0=0
			;

			IF l_cnt1 = l_cnt2 THEN
				EXIT SKIP_PARENT_ADD ;
			END IF ;
		END IF ;

		/* 確定済親品目を格納 */
		LOOP
			INSERT INTO mgw_fix_itm (
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				wg_cd,
				calc_ctg_cd
				)
			SELECT	t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.wg_cd,
				t.calc_ctg_cd
			FROM	mgt_calc_itm t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgw_fix_itm w
					WHERE	0=0
					AND	w.itm_cd = t.itm_cd
					AND	w.itm_sub1 = t.itm_sub1
					AND	w.itm_sub2 = t.itm_sub2
					AND	w.itm_sub3 = t.itm_sub3
					AND	w.wg_cd = t.wg_cd
					AND	w.calc_ctg_cd = t.calc_ctg_cd
				)
			AND	EXISTS (
					SELECT	'X'
					FROM	mgt_std_top w
					WHERE	0=0
					AND	w.calc_no = t.calc_no
					AND	w.calc_grp_cd = t.calc_grp_cd
					AND	w.itm_cd = t.itm_cd
					AND	w.itm_sub1 = t.itm_sub1
					AND	w.itm_sub2 = t.itm_sub2
					AND	w.itm_sub3 = t.itm_sub3
					AND	w.wg_cd = t.wg_cd
					AND	w.sls_flg = '0'
					AND	EXISTS (
							SELECT	'X'
							FROM	mgt_std_inpt w1, mgw_fix_itm w2
							WHERE	0=0
							AND	w1.calc_no = w.calc_no
							AND	w1.calc_grp_cd = w.calc_grp_cd
							AND	w1.top_rec_no = w.top_rec_no
							AND	w1.lvl >= 1
							AND	w1.itm_cd = w2.itm_cd
							AND	w1.itm_sub1 = w2.itm_sub1
							AND	w1.itm_sub2 = w2.itm_sub2
							AND	w1.itm_sub3 = w2.itm_sub3
							AND	w1.wg_cd = w2.wg_cd
						)
				)
			;
			GET DIAGNOSTICS l_cnt = ROW_COUNT ;

			/* 依頼元の確定済親品目を格納 */
			INSERT INTO mgw_fix_itm (
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				wg_cd,
				calc_ctg_cd
				)
			SELECT DISTINCT
				t4.itm_cd,
				t4.itm_sub1,
				t4.itm_sub2,
				t4.itm_sub3,
				t4.wg_cd,
				t4.calc_ctg_cd
			FROM	mgw_fix_itm w,
				mgt_calc_itm_dtl t1,
				mgt_std_inpt t2,
				mgt_std_top t3,
				mgt_calc_itm t4
			WHERE	0=0
			AND	t1.calc_no = i_calc_no
			AND	t1.calc_grp_cd = i_calc_grp_cd
			AND	t1.itm_cd = w.itm_cd
			AND	t1.itm_sub1 = w.itm_sub1
			AND	t1.itm_sub2 = w.itm_sub2
			AND	t1.itm_sub3 = w.itm_sub3
			AND	t1.rqst_wg_cd = w.wg_cd
			AND	t2.calc_no = t1.calc_no
			AND	t2.calc_grp_cd = t1.calc_grp_cd
			AND	t2.itm_cd = t1.itm_cd
			AND	t2.itm_sub1 = t1.itm_sub1
			AND	t2.itm_sub2 = t1.itm_sub2
			AND	t2.itm_sub3 = t1.itm_sub3
			AND	t2.wg_cd = t1.wg_cd
			AND	t3.calc_no = t2.calc_no
			AND	t3.calc_grp_cd = t2.calc_grp_cd
			AND	t3.top_rec_no = t2.top_rec_no
			AND	t3.sls_flg = '0'
			AND	t4.calc_no = t3.calc_no
			AND	t4.calc_grp_cd = t3.calc_grp_cd
			AND	t4.itm_cd = t3.itm_cd
			AND	t4.itm_sub1 = t3.itm_sub1
			AND	t4.itm_sub2 = t3.itm_sub2
			AND	t4.itm_sub3 = t3.itm_sub3
			AND	t4.wg_cd = t3.wg_cd
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgw_fix_itm w
					WHERE	0=0
					AND	w.itm_cd = t4.itm_cd
					AND	w.itm_sub1 = t4.itm_sub1
					AND	w.itm_sub2 = t4.itm_sub2
					AND	w.itm_sub3 = t4.itm_sub3
					AND	w.wg_cd = t4.wg_cd
					AND	w.calc_ctg_cd = t4.calc_ctg_cd
					)
			;
			GET DIAGNOSTICS l_cnt2 = ROW_COUNT ;
			l_cnt = l_cnt + l_cnt2;

			IF l_cnt = 0 THEN
				EXIT ;
			END IF ;
		END LOOP ;
	END ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ITM_FIX.P_SET_PARENT') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_cancel_main (
	 IN i_calc_grp_cd	VARCHAR,
	 IN i_calc_no	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準単価解除メイン処理
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_cost_calc_cost_std	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP','COST_STD') ;

	/* 対象品目のロック用のカーソル */
	lock_itm CURSOR (ci_term mgt_arg.term%TYPE) FOR
		SELECT	t.itm_cd
		FROM	mgt_itm t
		WHERE	0=0
		AND	t.term = ci_term
		AND	EXISTS (
				SELECT	'X'
				FROM	mgw_fix_itm w
				WHERE 	0=0
				AND	w.itm_cd = t.itm_cd
				AND	w.itm_sub1 = t.itm_sub1
				AND	w.itm_sub2 = t.itm_sub2
				AND	w.itm_sub3 = t.itm_sub3
				AND	w.wg_cd = t.wg_cd
				AND	w.calc_ctg_cd = t.calc_ctg_cd
			)
		FOR UPDATE NOWAIT
	;

	l_arg mgt_arg%ROWTYPE ;
	l_cnt INTEGER ;
	x RECORD ;
	y RECORD ;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ITM_FIX.P_CANCEL_MAIN') ;

	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	CALL mgpa_arg$p_lock(i_calc_grp_cd, i_calc_no, '0') ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgw_fix_itm w
	WHERE	0=0
	;

	IF l_cnt = 0 THEN
		CALL fcpa_err$raise_app_err('MGBED0008') ;
	END IF ;

	/* 対象品目のロック */
	BEGIN
		FOR y IN lock_itm(l_arg.term) LOOP EXIT ;
		END LOOP ;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MGBXD0029') ;
	END ;

	UPDATE mgt_itm t
	SET fix_flg = '0'
	WHERE	0=0
	AND	t.term = l_arg.term
	AND	t.fix_flg = '1'
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	w.wg_cd = t.wg_cd
			AND	w.calc_ctg_cd = t.calc_ctg_cd
		)
	;

	DELETE FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_fix_itm w
			WHERE	0=0
			AND	w.itm_cd = t.itm_cd
			AND	w.itm_sub1 = t.itm_sub1
			AND	w.itm_sub2 = t.itm_sub2
			AND	w.itm_sub3 = t.itm_sub3
			AND	w.wg_cd = t.wg_cd
			AND	w.calc_ctg_cd = t.calc_ctg_cd
		)
	;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

	IF l_cnt = 0 THEN
		UPDATE mgt_arg t
		SET fix_flg = '0'
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		;

		FOR x IN
			SELECT	t.xrate_cd, t.term
			FROM	mgt_arg t
			WHERE	0=0
			AND	t.calc_no = i_calc_no
			AND	t.calc_grp_cd = i_calc_grp_cd
			AND	t.xrate_cd IS NOT NULL
		LOOP
			SELECT	COUNT(*)
			INTO STRICT	l_cnt
			FROM	mgt_arg t
			WHERE	0=0
			AND	t.term = x.term
			AND	t.xrate_cd = x.xrate_cd
			AND	t.fix_flg = '1'
			AND	t.cost_calc_typ = c_cost_calc_cost_std
			;

			IF l_cnt = 0 THEN
				UPDATE mgt_cur_xrate t
				SET fix_flg = '0'
				WHERE	0=0
				AND	t.term = x.term
				AND	t.xrate_cd = x.xrate_cd
				AND	t.fix_flg = '1'
				;
			END IF ;
		END LOOP ;
	END IF ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ITM_FIX.P_CANCEL_MAIN') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_cancel_add_calc_no (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	同一計算グループで異なる原価計算ＮＯに関連する親品目が存在しているときは
	確定解除処理を行う
<REMARKS>

<ARGUMENTS>
<IN> I_CALC_GRP_CD
	計算グループＣＤ
<IN> I_CALC_NO
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_arg mgt_arg%ROWTYPE ;
	x RECORD ;
BEGIN
	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	FOR x IN
		SELECT	t.calc_no
		FROM	mgt_arg t
		WHERE	0=0
		AND	t.term = l_arg.term
		AND	t.calc_grp_cd = i_calc_grp_cd
		AND	t.calc_no <> i_calc_no
		AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix w
				WHERE	0=0
				AND	w.calc_grp_cd = t.calc_grp_cd
				AND	w.calc_no = t.calc_no
			)
	LOOP
		CALL mgpa_itm_fix$p_set_parent(i_calc_grp_cd, x.calc_no, '0') ;
		CALL mgpa_itm_fix$p_cancel_main(i_calc_grp_cd, x.calc_no) ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_cancel (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準単価解除処理
<REMARKS>

<ARGUMENTS>
<IN> I_CALC_GRP_CD
	計算グループＣＤ
<IN> I_CALC_NO
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ITM_FIX.P_CANCEL') ;

	CALL mgpa_itm_fix$p_set_parent(i_calc_grp_cd, i_calc_no, '1') ;
	CALL mgpa_itm_fix$p_cancel_main(i_calc_grp_cd, i_calc_no) ;

	CALL mgpa_itm_fix$p_cancel_add_calc_no(i_calc_grp_cd, i_calc_no) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ITM_FIX.P_CANCEL') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_bulk_cancel (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準単価一括解除処理
<REMARKS>
	原価計算ＮＯもしくは期のいずれかは必須
<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<IN> i_wg_cd
	ワーキンググループＣＤ
<IN> i_term
	期
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ITM_FIX.P_BULK_CANCEL') ;

	FOR x IN
		SELECT	DISTINCT
			t.calc_no
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	(t.calc_no = i_calc_no OR i_calc_no IS NULL AND t.term = i_term)
		AND	t.calc_grp_cd = i_calc_grp_cd
		AND	t.wg_cd = i_wg_cd
	LOOP
		DELETE FROM mgw_fix_itm ;

		INSERT INTO mgw_fix_itm (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT	t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.wg_cd,
			t.calc_ctg_cd
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.calc_no = x.calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		AND	t.wg_cd = i_wg_cd
		;

		CALL mgpa_itm_fix$p_set_parent(i_calc_grp_cd, x.calc_no, '1') ;
		CALL mgpa_itm_fix$p_cancel_main(i_calc_grp_cd, x.calc_no) ;
	END LOOP ;

	IF i_calc_no IS NOT NULL THEN
		CALL mgpa_itm_fix$p_cancel_add_calc_no(i_calc_grp_cd, i_calc_no) ;
	END IF ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ITM_FIX.P_BULK_CANCEL') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_chk_rate_cancel (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準配賦率の確定解除チェック
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_calc_ctg_alc_rate_m	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ALC_RATE_M') ;
	c_calc_ctg_calc_itm	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','CALC_ITM') ;

	l_arg	mgt_arg%ROWTYPE ;
	l_cnt	INTEGER ;
	l_msg	VARCHAR[] ;
	x	RECORD ;
	y	RECORD ;
	z	RECORD ;
BEGIN
	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	CALL mgpa_arg$p_lock(i_calc_grp_cd, i_calc_no, '0') ;

	IF l_arg.runtime_wg_cd IS NULL THEN
		INSERT INTO maw_grp_wg_key
		SELECT m.calc_grp_cd, m.wg_cd FROM mam_grp_wg m WHERE m.calc_grp_cd = i_calc_grp_cd ;
	ELSE
		INSERT INTO maw_grp_wg_key VALUES (i_calc_grp_cd, l_arg.runtime_wg_cd) ;
	END IF ;

	FOR x IN
		SELECT	DISTINCT
			t.calc_ctg_cd,
			t.wg_cd
		FROM	mgt_std_alc_rate t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		AND	t.term = l_arg.term
	LOOP
		FOR y IN
			SELECT	DISTINCT
				m.calc_grp_cd
			FROM	mam_grp_ctg m, maw_grp_wg_key m2
			WHERE	0=0
			AND	m.calc_ctg_typ = c_calc_ctg_alc_rate_m
			AND	m.calc_ctg_cd = x.calc_ctg_cd
			AND	m2.wg_cd = x.wg_cd
			AND	m.calc_grp_cd = m2.calc_grp_cd
		LOOP
			FOR z IN
				SELECT	DISTINCT
						m.calc_ctg_cd, m2.wg_cd
				FROM	mam_grp_ctg m, maw_grp_wg_key m2
				WHERE	0=0
				AND	m.calc_ctg_typ = c_calc_ctg_calc_itm
				AND	m.calc_grp_cd = y.calc_grp_cd
				AND	m2.calc_grp_cd = y.calc_grp_cd
			LOOP
				SELECT	COUNT(*)
				INTO	STRICT l_cnt
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.term = l_arg.term
				AND	t.calc_ctg_cd = z.calc_ctg_cd
				AND	t.wg_cd = z.wg_cd
				;

				IF l_cnt > 0 THEN
					l_msg := fcpa_err$msg_binder(fcpa_date_util$f_to_char(l_arg.term, fcpa_date_util$y4m()), z.calc_ctg_cd, z.wg_cd) ;
					CALL fcpa_err$raise_app_err('MGBED0004', l_msg) ;
				END IF ;
			END LOOP ;
		END LOOP ;
	END LOOP ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_itm_fix$p_chk_rate_fix (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準配賦率の確定チェック
<REMARKS>

<ARGUMENTS>
<IN> i_calc_grp_cd
	計算グループＣＤ
<IN> i_calc_no
	原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_arg mgt_arg%ROWTYPE ;
BEGIN
	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	CALL mgpa_arg$p_lock(i_calc_grp_cd, i_calc_no, '0') ;

END ;
$BODY$
LANGUAGE plpgsql
;
