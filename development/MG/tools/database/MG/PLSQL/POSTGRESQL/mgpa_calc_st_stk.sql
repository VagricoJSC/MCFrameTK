CREATE OR REPLACE PROCEDURE mgpa_calc_st_stk$p_set_itm (
	 IN i_calc_grp	VARCHAR,
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象品目設定処理
<REMARKS>
	対象となる確定されている品目をmgw_fix_itmに書き込む
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_term
		期
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt	NUMERIC ;
	l_parm	mam_sys_parm.parm_val%TYPE ;
	l_calc_grp	mam_calc_grp%ROWTYPE ;

	ctg_list CURSOR FOR
		SELECT	w.calc_ctg_cd
		FROM	mgw_calc_ctg w
		WHERE	0=0
		ORDER BY w.ctg_prio, w.calc_ctg_cd
	 ;

	l_log_no VARCHAR;
	l_log_sub_key1 NUMERIC;
	l_log_sub_key2 NUMERIC;
	y RECORD ;
BEGIN
	DELETE FROM maw_grp_wg_key ;
	l_calc_grp := mgpa_calc_grp$f_get_rec(i_calc_grp) ;
	IF l_calc_grp.runtime_wg_cd IS NULL THEN
		INSERT INTO maw_grp_wg_key
		SELECT m.calc_grp_cd, m.wg_cd FROM mam_grp_wg m WHERE m.calc_grp_cd = i_calc_grp ;
	ELSE
		INSERT INTO maw_grp_wg_key VALUES (i_calc_grp, l_calc_grp.runtime_wg_cd) ;
	END IF ;

	DELETE FROM mgw_fix_itm ;
	CALL mgpa_calc_ctg$p_set_work(i_calc_grp, fcpa_const$get_const_val('MAC_CALC_CTG_TYP','CALC_ITM')) ;
	FOR x IN ctg_list LOOP
		INSERT INTO mgw_fix_itm (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd,
			std_qty
			)
		SELECT
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.wg_cd,
			t.calc_ctg_cd,
			t.std_qty
		FROM	mgt_std_fix t, maw_grp_wg_key m
		WHERE	0=0
		AND	t.term = i_term
		AND	t.calc_ctg_cd = x.calc_ctg_cd
		AND	m.calc_grp_cd = i_calc_grp
		AND	m.wg_cd = t.wg_cd
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	mgw_fix_itm w
				WHERE	0=0
				AND	w.itm_cd = t.itm_cd
				AND	w.itm_sub1 = t.itm_sub1
				AND	w.itm_sub2 = t.itm_sub2
				AND	w.itm_sub3 = t.itm_sub3
				AND	w.wg_cd = t.wg_cd
			)
		;
	END LOOP ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgw_fix_itm w
	;

	IF l_cnt = 0 THEN
		CALL fcpa_err$raise_app_err('MGBBD0002') ;
	END IF ;

	l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP') ;

	/*** 確定品目のチェック ***/
	l_cnt := 0 ;
	FOR y IN
		SELECT	t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.wg_cd
		FROM	mgt_st_stk t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgw_st_stk_key w
				WHERE	0=0
				AND	w.st_stk_key = t.st_stk_key
			)
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	mgw_fix_itm w
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.wg_cd = w.wg_cd
			)
	LOOP
		l_cnt := l_cnt + 1 ;
		CALL fcpa_batch_log$p_data_log('MGBXD0015',
				l_log_no, l_log_sub_key1, l_log_sub_key2,
				fcpa_date_util$f_to_char(i_term, fcpa_date_util$y4m()),
				mapa_comm$f_to_disp_itm(y.itm_cd, y.itm_sub1, y.itm_sub2, y.itm_sub3, l_parm),
				y.wg_cd
				) ;
	END LOOP ;

	IF l_cnt > 0 THEN
		CALL fcpa_err$raise_app_err('MGBBD0003') ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_st_stk$p_main()
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	月初在庫評価替メイン処理
<REMARKS>
	mgw_st_stk_keyに対象となるデータを設定しておく必要がある
	評価替差異はmgt_st_stk_diffに書き込む
<ARGUMENTS>

<HISTORY>
**************************************************************************/
DECLARE
	c_rnd_typ		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;	/* 四捨五入 */
	c_expns_prod	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','PROD') ;
	c_expns_sga		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','SGA') ;
	c_expns_sppl	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','SPPL') ;
	c_asst_oth		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH') ;

	l_calc_grp	mam_calc_grp.calc_grp_cd%TYPE ;
	l_ym	mgt_st_stk.ym%TYPE ;
	l_term	mam_term.term%TYPE ;
	l_digit	NUMERIC ;
	l_cnt	NUMERIC ;
	l_co_parm	mam_co_parm%ROWTYPE ;

	lock_stk CURSOR FOR
		SELECT	t.itm_cd
		FROM	mgt_st_stk t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgw_st_stk_key w
				WHERE	0=0
				AND	w.st_stk_key = t.st_stk_key
			)
		FOR UPDATE NOWAIT
		;

	l_tqa	CHAR(1) ;
	l_sum_amt	mgw_st_stk_diff.af_amt%TYPE ;
	l_std_amt	mgw_st_stk_diff.af_amt%TYPE ;
	l_msg	VARCHAR[] ;
	x	RECORD ;
	y	RECORD ;
	z	RECORD ;
	r	RECORD ;
BEGIN
	<<PROC_END>>
	BEGIN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_CALC_ST_STK.P_MAIN') ;

		/***他社資産は除く***/
		DELETE FROM	mgw_st_stk_key w
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgt_st_stk t
				WHERE	0=0
				AND	t.st_stk_key = w.st_stk_key
				AND	(t.asst_typ = c_asst_oth OR t.repurc_obli_flg = '1')
			)
		;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_st_stk t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgw_st_stk_key w
				WHERE	0=0
				AND	w.st_stk_key = t.st_stk_key
			)
		;

		EXIT PROC_END WHEN l_cnt = 0 ;

		BEGIN
			SELECT DISTINCT
				t.calc_grp_cd, t.ym
			INTO STRICT	l_calc_grp, l_ym
			FROM	mgt_st_stk t
			WHERE	0=0
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_st_stk_key w
					WHERE	0=0
					AND	w.st_stk_key = t.st_stk_key
				)
			;
		EXCEPTION
			WHEN too_many_rows THEN
				CALL fcpa_err$raise_app_err('MGBBD0001') ;
		END ;

		/*** ロック***/
		BEGIN
			FOR x IN lock_stk LOOP EXIT ;
			END LOOP ;
		EXCEPTION
			WHEN lock_not_available THEN
				l_msg := fcpa_err$msg_binder(l_calc_grp, fcpa_date_util$f_to_char(l_ym, fcpa_date_util$y4m())) ;
				CALL fcpa_err$raise_app_err('MGBXD0010', l_msg) ;
		END ;

		/*** 対象年月に対する確定状況の確認 ***/
		CALL mgpa_calc_fix$p_chk_fix(l_calc_grp, l_ym) ;

		l_term := mapa_term$f_get_term(l_ym) ;

		/*** 対象となる確定品目のセット ***/
		CALL mgpa_calc_st_stk$p_set_itm(l_calc_grp, l_term) ;

		/*** 原価計算と同じ桁数で端数処理を行う ***/
		SELECT	COALESCE(MIN(m.parm_val::NUMERIC), 8)
		INTO STRICT	l_digit
		FROM	mgt_parm m
		WHERE	0=0
		AND	m.calc_grp_cd = l_calc_grp
		AND	m.parm_key = 'SCA_PREC_COST'
		;

		l_tqa := '0' ;
		SELECT	COUNT(*)
		INTO STRICT	l_cnt
		FROM	mgt_parm m
		WHERE	0=0
		AND	m.calc_grp_cd = l_calc_grp
		AND	m.parm_key = 'SCA_TQA'
		AND	m.parm_val IS NOT NULL
		AND	m.parm_val != '0'
		AND	m.parm_val != 'NO'
		;

		IF l_cnt > 0 THEN
			l_tqa := '1' ;
		END IF ;

		l_co_parm := mgpa_co_parm$f_get_rec() ;

		/*** 評価替前のデータを作成する ***/
		DELETE FROM	mgw_st_stk_diff ;
		INSERT INTO mgw_st_stk_diff (
			st_stk_key,
			expns_cd,
			diff_amt,
			bf_amt,
			af_amt
			)
		SELECT
			t.st_stk_key,
			t.expns_cd,
			0,
			t.amt,
			0
		FROM	mgt_st_stk_expns t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgw_st_stk_key w
				WHERE	0=0
				AND	w.st_stk_key = t.st_stk_key
				)
		AND	t.amt != 0
		;

		/* 製造・売上原価費目以外のデータは削除 */
		DELETE FROM	mgw_st_stk_diff w
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mam_expns m
				WHERE	0=0
				AND	m.expns_cd = w.expns_cd
				AND	m.expns_typ IN (c_expns_sga, c_expns_sppl)
			)
		;

		FOR x IN
			SELECT	t.st_stk_key,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.wg_cd,
				t.qty
			FROM	mgt_st_stk t
			WHERE	0=0
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_st_stk_key w
					WHERE	0=0
					AND	w.st_stk_key = t.st_stk_key
				)
		LOOP

			FOR y IN
				SELECT	w.calc_ctg_cd,
						w.std_qty
				FROM	mgw_fix_itm w
				WHERE	0=0
				AND	w.itm_cd = x.itm_cd
				AND	w.itm_sub1 = x.itm_sub1
				AND	w.itm_sub2 = x.itm_sub2
				AND	w.itm_sub3 = x.itm_sub3
				AND	w.wg_cd = x.wg_cd
			LOOP

				FOR z IN
					SELECT
						t3.expns_cd,
						SUM(t3.std_cost) AS amt
					FROM	mgt_std_fix t1, mgt_std_top t2, mgt_std_sml_cost t3
					WHERE	0=0
					AND	t1.itm_cd = x.itm_cd
					AND	t1.itm_sub1 = x.itm_sub1
					AND	t1.itm_sub2 = x.itm_sub2
					AND	t1.itm_sub3 = x.itm_sub3
					AND	t1.calc_ctg_cd = y.calc_ctg_cd
					AND	t1.term = l_term
					AND	t1.wg_cd = x.wg_cd
					AND	t1.itm_cd = t2.itm_cd
					AND	t1.itm_sub1 = t2.itm_sub1
					AND	t1.itm_sub2 = t2.itm_sub2
					AND	t1.itm_sub3 = t2.itm_sub3
					AND	t1.wg_cd = t2.wg_cd
					AND	t1.calc_no = t2.calc_no
					AND	t1.calc_grp_cd = t2.calc_grp_cd
					AND	t2.sls_flg = '0'
					AND	t2.calc_no = t3.calc_no
					AND	t2.calc_grp_cd = t3.calc_grp_cd
					AND	t2.top_rec_no = t3.top_rec_no
					AND	t3.expns_typ = c_expns_prod
					AND	t3.std_cost != 0
					GROUP BY t3.expns_cd
				LOOP

					SELECT	COUNT(*)
					INTO STRICT	l_cnt
					FROM	mgw_st_stk_diff w
					WHERE	0=0
					AND	w.st_stk_key = x.st_stk_key
					AND	w.expns_cd = z.expns_cd
					;

					IF l_cnt = 0 THEN
						INSERT INTO mgw_st_stk_diff (
							st_stk_key,
							expns_cd,
							diff_amt,
							bf_amt,
							af_amt
							)
						VALUES	(
							x.st_stk_key,
							z.expns_cd,
							0,
							0,
							mapa_calc$f_rnd(
								mapa_calc$f_rnd(x.qty * z.amt / y.std_qty, l_digit, c_rnd_typ),
								l_co_parm.amt_dec_place,
								l_co_parm.amt_rnd_typ)
							)
						;
					ELSE
						UPDATE mgw_st_stk_diff t
						SET af_amt = t.af_amt +
								mapa_calc$f_rnd(
									mapa_calc$f_rnd(x.qty * z.amt / y.std_qty, l_digit, c_rnd_typ),
									l_co_parm.amt_dec_place,
									l_co_parm.amt_rnd_typ)
						WHERE	0=0
						AND	t.st_stk_key = x.st_stk_key
						AND	t.expns_cd = z.expns_cd
						;
					END IF ;
				END LOOP ;

				IF l_tqa = '1' THEN
					SELECT	COALESCE(SUM(w.af_amt), 0)
					INTO STRICT	l_sum_amt
					FROM	mgw_st_stk_diff w
					WHERE	0=0
					AND	w.st_stk_key = x.st_stk_key
					;

					SELECT	mapa_calc$f_rnd(
							SUM(t3.std_cost) * x.qty / y.std_qty,
							l_co_parm.amt_dec_place,
							l_co_parm.amt_rnd_typ
							)
					INTO STRICT	l_std_amt
					FROM	mgt_std_fix t1, mgt_std_top t2, mgt_std_sml_cost t3
					WHERE	0=0
					AND	t1.itm_cd = x.itm_cd
					AND	t1.itm_sub1 = x.itm_sub1
					AND	t1.itm_sub2 = x.itm_sub2
					AND	t1.itm_sub3 = x.itm_sub3
					AND	t1.calc_ctg_cd = y.calc_ctg_cd
					AND	t1.wg_cd = x.wg_cd
					AND	t1.term = l_term
					AND	t1.itm_cd = t2.itm_cd
					AND	t1.itm_sub1 = t2.itm_sub1
					AND	t1.itm_sub2 = t2.itm_sub2
					AND	t1.itm_sub3 = t2.itm_sub3
					AND	t1.wg_cd = t2.wg_cd
					AND	t1.calc_no = t2.calc_no
					AND	t1.calc_grp_cd = t2.calc_grp_cd
					AND	t2.sls_flg = '0'
					AND	t2.calc_no = t3.calc_no
					AND	t2.calc_grp_cd = t3.calc_grp_cd
					AND	t2.top_rec_no = t3.top_rec_no
					AND	t3.expns_typ = c_expns_prod
					AND	t3.std_cost != 0
					;

					IF l_std_amt != l_sum_amt THEN
						SELECT	COUNT(*)
						INTO STRICT	l_cnt
						FROM	mgw_st_stk_diff w
						WHERE	0=0
						AND	w.st_stk_key = x.st_stk_key
						AND	w.expns_cd = l_co_parm.mrgn_expns_cd
						;

						IF l_cnt = 0 THEN
							INSERT INTO mgw_st_stk_diff (
								st_stk_key,
								expns_cd,
								diff_amt,
								bf_amt,
								af_amt
								)
							VALUES	(
								x.st_stk_key,
								l_co_parm.mrgn_expns_cd,
								0,
								0,
								l_std_amt - l_sum_amt
								)
							;
						ELSE
							UPDATE mgw_st_stk_diff t
							SET	af_amt = t.af_amt + l_std_amt - l_sum_amt
							WHERE	0=0
							AND	t.st_stk_key = x.st_stk_key
							AND	t.expns_cd = l_co_parm.mrgn_expns_cd
							;
						END IF ;
					END IF ;
				END IF ;
			END LOOP ;
		END LOOP ;

		DELETE FROM	mgw_st_stk_diff w
		WHERE	0=0
		AND	w.af_amt = 0
		AND	w.bf_amt = 0
		;

		FOR r IN
			SELECT	w.*
			FROM	mgw_st_stk_diff w
			WHERE	0=0
		LOOP

			SELECT	COUNT(*)
			INTO STRICT	l_cnt
			FROM	mgt_st_stk_diff w
			WHERE	0=0
			AND	w.st_stk_key = r.st_stk_key
			AND	w.expns_cd = r.expns_cd
			;

			IF l_cnt = 0 THEN
				INSERT INTO mgt_st_stk_diff (
					st_stk_key,
					expns_cd,
					diff_amt,
					bf_amt,
					af_amt
					)
				VALUES	(
					r.st_stk_key,
					r.expns_cd,
					r.af_amt - r.bf_amt,
					r.bf_amt,
					r.af_amt
					)
				;
			ELSE
				UPDATE mgt_st_stk_diff t
				SET	diff_amt = r.af_amt - t.bf_amt,
					af_amt = r.af_amt
				WHERE	0=0
				AND	t.st_stk_key = r.st_stk_key
				AND	t.expns_cd = r.expns_cd
				;
			END IF ;
		END LOOP ;

		/*** 月初在庫費目情報の再作成 ***/
		DELETE FROM	mgt_st_stk_expns t
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgw_st_stk_key w
				WHERE	0=0
				AND	w.st_stk_key = t.st_stk_key
			)
		;

		INSERT INTO mgt_st_stk_expns (
			st_stk_key,
			expns_cd,
			amt
			)
		SELECT
			w.st_stk_key,
			w.expns_cd,
			w.af_amt
		FROM	mgw_st_stk_diff w
		WHERE	0=0
		AND	w.af_amt != 0
		;

		/*** 標準評価後ＦＬＧの更新 ***/
		UPDATE mgt_st_stk t
		SET std_flg = '1'
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	mgw_st_stk_key w
				WHERE	0=0
				AND	w.st_stk_key = t.st_stk_key
			)
		;
	END ;

	DELETE FROM	mgw_st_stk_key ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_CALC_ST_STK.P_MAIN') ;

END ;
$BODY$
LANGUAGE plpgsql
;
