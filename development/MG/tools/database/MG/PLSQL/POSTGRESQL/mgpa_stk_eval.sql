CREATE OR REPLACE FUNCTION mgpa_stk_eval$f_get_eval (
	 IN i_stk_eval_cd	VARCHAR
)
RETURNS mam_stk_eval
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mam_stk_evalのレコードを返す
<REMARKS>
	存在しないときはエラーとする
<ARGUMENTS>
<IN>	i_stk_eval_cd
		在庫評価ＣＤ
<RETURNVALUE>
	対象となるmam_stk_evalのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_rec	mam_stk_eval%ROWTYPE ;
	l_msg	VARCHAR[] ;
BEGIN
	BEGIN
		SELECT	m.*
		INTO	STRICT l_rec
		FROM	mam_stk_eval m
		WHERE	0=0
		AND	m.stk_eval_cd = i_stk_eval_cd
		;
	EXCEPTION
		WHEN no_data_found THEN
			l_msg := fcpa_err$msg_binder(i_stk_eval_cd) ;
			CALL fcpa_err$raise_app_err('MGBBD0005', l_msg) ;
	END ;

	RETURN l_rec ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_stk_eval$p_stk_eval_insert (
	 INOUT o_rec	mgt_stk_eval[]
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mgt_stk_evalのINSERT処理
<REMARKS>

<ARGUMENTS>
<INOUT>	o_rec
		mgt_stk_evalの配列
<HISTORY>
**********************************************************/
BEGIN
	IF COALESCE(array_length(o_rec, 1), 0) > 0 THEN
		INSERT INTO mgt_stk_eval SELECT * FROM UNNEST(o_rec);
		o_rec := '{}' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_stk_eval$p_main (
	 IN i_calc_ctg_cd	VARCHAR,
	 IN i_wg_cd	VARCHAR,
	 IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_stk_eval_cd	VARCHAR,
	 IN i_calc_grp_cd	VARCHAR,
	 IN i_calc_no	VARCHAR,
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	月末在庫評価データ作成メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym
		年月
<IN>	i_stk_eval_cd
		在庫評価ＣＤ
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<IN>	i_ym_from
		取得先年月ＦＲＯＭ
<IN>	i_ym_to
		取得先年月ＴＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_rndoff	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;
	c_eval_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_LOSS_EVAL_TYP','NON') ;
	c_upri_set_std		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UPRI_SET_TYP','STD') ;
	c_upri_set_avg_purc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UPRI_SET_TYP','AVG_PURC') ;
	c_upri_set_avg_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UPRI_SET_TYP','AVG_SLS') ;
	c_upri_set_prev_purc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UPRI_SET_TYP','PREV_PURC') ;
	c_upri_set_prev_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UPRI_SET_TYP','PREV_SLS') ;
	c_enpns_prd			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','PROD') ;
	c_asset_mng_mng		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG') ;
	c_calc_ctg_purc		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','PURC') ;
	c_calc_ctg_sls		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','SLS') ;
	c_max_cnt	CONSTANT INTEGER := 20000 ;	/* バルクインサートでの最大レコード数 */

	lock_stk_eval CURSOR FOR
		SELECT	t.itm_cd
		FROM	mgt_stk_eval t
		WHERE	0=0
		AND	t.calc_ctg_cd = i_calc_ctg_cd
		AND	t.stk_eval_cd = i_stk_eval_cd
		AND	t.wg_cd = i_wg_cd
		AND	t.ym = i_ym
		FOR UPDATE NOWAIT
	;

	l_eval mam_stk_eval%ROWTYPE ;

	l_arg mgt_arg%ROWTYPE ;
	l_co mam_co%ROWTYPE ;
	l_cur mam_cur%ROWTYPE ;
	l_calc_grp	mam_calc_grp%ROWTYPE ;

	l_rec	mgt_stk_eval[] ;
	l_tmp_rec	mgt_stk_eval%ROWTYPE ;
	l_msg	VARCHAR[] ;
	x RECORD ;
	y RECORD ;
	w RECORD ;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0028',
		i_calc_ctg_cd,
		i_wg_cd,
		fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()),
		i_stk_eval_cd,
		i_calc_grp_cd,
		i_calc_no,
		fcpa_date_util$f_to_char(i_ym_from, fcpa_date_util$y4m()),
		fcpa_date_util$f_to_char(i_ym_to, fcpa_date_util$y4m())
		) ;

	l_co := mapa_co$f_get_co_rec() ;

	l_cur := mgpa_xchng$f_get_cur(l_co.base_cur_cd) ;

	l_eval := mgpa_stk_eval$f_get_eval(i_stk_eval_cd) ;

	IF l_eval.lump_rate_flg = '1' THEN
		l_msg := fcpa_err$msg_binder(i_stk_eval_cd) ;
		CALL fcpa_err$raise_app_err('MGBBD0006', l_msg) ;

	ELSIF l_eval.upri_set_typ IS NULL THEN
		l_msg := fcpa_err$msg_binder(i_stk_eval_cd) ;
		CALL fcpa_err$raise_app_err('MGBBD0007', l_msg) ;
	END IF ;

	DELETE FROM maw_wg_key ;
	l_calc_grp := mgpa_calc_grp$f_get_rec(i_calc_grp_cd) ;
	IF l_calc_grp.runtime_wg_cd IS NOT NULL AND l_calc_grp.runtime_wg_cd = i_wg_cd THEN
		INSERT INTO maw_wg_key
		SELECT m.wg_cd FROM mam_grp_wg m WHERE m.calc_grp_cd = i_calc_grp_cd ;
	ELSE
		INSERT INTO maw_wg_key VALUES (i_wg_cd) ;
	END IF ;

	/***ロック***/
	BEGIN
		FOR w IN lock_stk_eval LOOP EXIT ;
		END LOOP ;

	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MGBXD0029') ;
	END ;

	DELETE FROM	mgt_stk_eval t
	WHERE	0=0
	AND	t.calc_ctg_cd = i_calc_ctg_cd
	AND	t.stk_eval_cd = i_stk_eval_cd
	AND	t.wg_cd = i_wg_cd
	AND	t.ym = i_ym
	;

	CASE l_eval.upri_set_typ
		WHEN c_upri_set_std THEN
			l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

			INSERT INTO mgt_stk_eval (
				calc_ctg_cd,
				stk_eval_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no,
				sno1, sno2, sno3, sno4,
				asst_typ,
				base_qty,
				upri
				)
			SELECT
				i_calc_ctg_cd,
				i_stk_eval_cd,
				i_wg_cd,
				i_ym,
				NULL,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				c_null_val, c_null_val,
				c_null_val, c_null_val, c_null_val, c_null_val,
				NULL,
				SUM(t.qty),
				SUM(t.std_cost)
			FROM	(
				SELECT	t1.itm_cd,
					t1.itm_sub1,
					t1.itm_sub2,
					t1.itm_sub3,
					t1.top_rec_no,
					COALESCE(t1.qty, 0) AS qty,
					COALESCE(SUM(t2.std_cost), 0) AS std_cost
				FROM	mam_itm m1,
					mgt_std_top t1
					LEFT OUTER JOIN mgt_std_sml_cost t2
						ON (t1.calc_no = t2.calc_no AND t1.calc_grp_cd = t2.calc_grp_cd AND t1.top_rec_no = t2.top_rec_no AND t2.expns_typ = c_enpns_prd)
				WHERE	0=0
				AND t1.calc_no = i_calc_no
				AND	t1.calc_grp_cd = i_calc_grp_cd
				AND	t1.wg_cd = i_wg_cd
				AND	t1.sls_flg = '0'
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.asset_mng_typ = c_asset_mng_mng
				GROUP BY t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, t1.top_rec_no, t1.qty
				) t
			WHERE	0=0
			AND	t.std_cost <> 0
			GROUP BY t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3
			;

		WHEN c_upri_set_avg_purc THEN
			CALL mgpa_calc_ctg$p_set_work(i_calc_grp_cd, c_calc_ctg_purc) ;

			INSERT INTO mgt_stk_eval (
				calc_ctg_cd,
				stk_eval_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no,
				sno1, sno2, sno3, sno4,
				asst_typ,
				base_qty,
				upri
				)
			SELECT
				i_calc_ctg_cd,
				i_stk_eval_cd,
				i_wg_cd,
				i_ym,
				t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.asst_typ,
				t.base_qty,
				mapa_calc$f_rnd(t.amt / t.qty * t.base_qty, l_cur.upri_dec_place, c_rndoff)
			FROM	(
				SELECT
					CASE COALESCE(m2.dpt_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.mng_dpt_cd
					END AS mng_dpt_cd,
					t1.itm_cd,
					t1.itm_sub1,
					t1.itm_sub2,
					t1.itm_sub3,
					COALESCE(m1.cost_std_qty, 1) AS base_qty,
					CASE COALESCE(m2.lot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.lot_no
					END AS lot_no,
					CASE COALESCE(m2.sublot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sublot_no
					END AS sublot_no,
					CASE COALESCE(m2.sno1_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno1
					END AS sno1,
					CASE COALESCE(m2.sno2_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno2
					END AS sno2,
					CASE COALESCE(m2.sno3_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno3
					END AS sno3,
					CASE COALESCE(m2.sno4_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno4
					END AS sno4,
					CASE COALESCE(m2.asst_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.asst_typ
					END AS asst_typ,
					SUM(t1.qty) AS qty,
					SUM(t1.amt) AS amt
				FROM	mgw_calc_ctg w1,
					maw_wg_key w2,
					mgt_act_purc_if t1,
					mam_itm m1
					LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd AND m2.del_flg = '0')
				WHERE	0=0
				AND	w1.calc_ctg_cd = t1.calc_ctg_cd
				AND	w2.wg_cd = t1.wg_cd
				AND	t1.ym BETWEEN i_ym_from AND i_ym_to
				AND	t1.no_eval_flg = '0'
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.asset_mng_typ = c_asset_mng_mng
				GROUP BY
					CASE COALESCE(m2.dpt_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.mng_dpt_cd
					END,
					t1.itm_cd,
					t1.itm_sub1,
					t1.itm_sub2,
					t1.itm_sub3,
					COALESCE(m1.cost_std_qty, 1),
					CASE COALESCE(m2.lot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.lot_no
					END,
					CASE COALESCE(m2.sublot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sublot_no
					END,
					CASE COALESCE(m2.sno1_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno1
					END,
					CASE COALESCE(m2.sno2_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno2
					END,
					CASE COALESCE(m2.sno3_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno3
					END,
					CASE COALESCE(m2.sno4_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno4
					END,
					CASE COALESCE(m2.asst_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.asst_typ
					END
				) t
			WHERE	0=0
			AND	(t.qty > 0 AND t.amt > 0 OR t.qty < 0 AND t.amt < 0)
			AND	t.base_qty > 0
			;

		WHEN c_upri_set_avg_sls THEN
			CALL mgpa_calc_ctg$p_set_work(i_calc_grp_cd, c_calc_ctg_sls) ;

			INSERT INTO mgt_stk_eval (
				calc_ctg_cd,
				stk_eval_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no,
				sno1, sno2, sno3, sno4,
				asst_typ,
				base_qty,
				upri
				)
			SELECT
				i_calc_ctg_cd,
				i_stk_eval_cd,
				i_wg_cd,
				i_ym,
				t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.asst_typ,
				t.base_qty,
				mapa_calc$f_rnd(t.amt / t.qty * t.base_qty, l_cur.upri_dec_place, c_rndoff)
			FROM	(
				SELECT
					CASE COALESCE(m2.dpt_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.mng_dpt_cd
					END AS mng_dpt_cd,
					t1.itm_cd,
					t1.itm_sub1,
					t1.itm_sub2,
					t1.itm_sub3,
					COALESCE(m1.cost_std_qty, 1) AS base_qty,
					CASE COALESCE(m2.lot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.lot_no
					END AS lot_no,
					CASE COALESCE(m2.sublot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sublot_no
					END AS sublot_no,
					CASE COALESCE(m2.sno1_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno1
					END AS sno1,
					CASE COALESCE(m2.sno2_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno2
					END AS sno2,
					CASE COALESCE(m2.sno3_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno3
					END AS sno3,
					CASE COALESCE(m2.sno4_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno4
					END AS sno4,
					CASE COALESCE(m2.asst_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.asst_typ
					END AS asst_typ,
					SUM(t1.qty) AS qty,
					SUM(t1.amt) AS amt
				FROM
					mgw_calc_ctg w1,
					maw_wg_key w2,
					mgt_act_sls_if t1,
					mam_itm m1
					LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd AND m2.del_flg = '0')
				WHERE	0=0
				AND	w1.calc_ctg_cd = t1.calc_ctg_cd
				AND	w2.wg_cd = t1.wg_cd
				AND	t1.ym BETWEEN i_ym_from AND i_ym_to
				AND	t1.no_eval_flg = '0'
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.asset_mng_typ = c_asset_mng_mng
				GROUP BY
					CASE COALESCE(m2.dpt_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.mng_dpt_cd
					END, t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, COALESCE(m1.cost_std_qty, 1),
					CASE COALESCE(m2.lot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.lot_no
					END,
					CASE COALESCE(m2.sublot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sublot_no
					END,
					CASE COALESCE(m2.sno1_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno1
					END,
					CASE COALESCE(m2.sno2_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno2
					END,
					CASE COALESCE(m2.sno3_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno3
					END,
					CASE COALESCE(m2.sno4_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN c_null_val
						ELSE t1.sno4
					END,
					CASE COALESCE(m2.asst_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.asst_typ
					END
				) t
			WHERE	0=0
			AND	(t.qty > 0 AND t.amt > 0 OR t.qty < 0 AND t.amt < 0)
			AND	t.base_qty > 0
			;

		WHEN c_upri_set_prev_purc THEN
			CALL mgpa_calc_ctg$p_set_work(i_calc_grp_cd, c_calc_ctg_purc) ;

			FOR x IN
				SELECT
					CASE COALESCE(m2.dpt_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.mng_dpt_cd
					END AS mng_dpt_cd,
					t1.itm_cd,
					t1.itm_sub1,
					t1.itm_sub2,
					t1.itm_sub3,
					COALESCE(m1.cost_std_qty, 1) AS cost_std_qty,
					CASE COALESCE(m2.lot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.lot_no
					END AS lot_no,
					CASE COALESCE(m2.sublot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sublot_no
					END AS sublot_no,
					CASE COALESCE(m2.sno1_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno1
					END AS sno1,
					CASE COALESCE(m2.sno2_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno2
					END AS sno2,
					CASE COALESCE(m2.sno3_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno3
					END AS sno3,
					CASE COALESCE(m2.sno4_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno4
					END AS sno4,
					CASE COALESCE(m2.asst_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.asst_typ
					END AS asst_typ, 
					MAX(t1.ac_dt) AS ac_dt
				FROM
					mgw_calc_ctg w1,
					maw_wg_key w2,
					mgt_act_purc_if t1,
					mam_itm m1
					LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd AND m2.del_flg = '0')
				WHERE	0=0
				AND	w1.calc_ctg_cd = t1.calc_ctg_cd
				AND	w2.wg_cd = t1.wg_cd
				AND	t1.ym BETWEEN i_ym_from AND i_ym_to
				AND	t1.no_eval_flg = '0'
				AND	t1.qty > 0
				AND	t1.amt > 0
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.asset_mng_typ = c_asset_mng_mng
				GROUP BY
					CASE COALESCE(m2.dpt_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.mng_dpt_cd
					END, t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, COALESCE(m1.cost_std_qty, 1),
					CASE COALESCE(m2.lot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.lot_no
					END,
					CASE COALESCE(m2.sublot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sublot_no
					END,
					CASE COALESCE(m2.sno1_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno1
					END,
					CASE COALESCE(m2.sno2_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno2
					END,
					CASE COALESCE(m2.sno3_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno3
					END,
					CASE COALESCE(m2.sno4_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno4
					END,
					CASE COALESCE(m2.asst_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.asst_typ
					END
			LOOP
				FOR y IN
					SELECT	t1.qty, t1.amt
					FROM	mgw_calc_ctg w1, maw_wg_key w2, mgt_act_purc_if t1
					WHERE	0=0
					AND	w1.calc_ctg_cd = t1.calc_ctg_cd
					AND	w2.wg_cd = t1.wg_cd
					AND	t1.ym BETWEEN i_ym_from AND i_ym_to
					AND	t1.no_eval_flg = '0'
					AND	t1.qty > 0
					AND	t1.amt > 0
					AND	t1.ac_dt = x.ac_dt
					AND	t1.itm_cd = x.itm_cd
					AND	t1.itm_sub1 = x.itm_sub1
					AND	t1.itm_sub2 = x.itm_sub2
					AND	t1.itm_sub3 = x.itm_sub3
					AND
						CASE
							WHEN x.mng_dpt_cd IS NULL THEN t1.mng_dpt_cd
							ELSE x.mng_dpt_cd
						END = t1.mng_dpt_cd
					AND
						CASE
							WHEN x.lot_no IS NULL THEN t1.lot_no
							ELSE x.lot_no
						END = t1.lot_no
					AND
						CASE
							WHEN x.sublot_no IS NULL THEN t1.sublot_no
							ELSE x.sublot_no
						END = t1.sublot_no
					AND
						CASE
							WHEN x.sno1 IS NULL THEN t1.sno1
							ELSE x.sno1
						END = t1.sno1
					AND
						CASE
							WHEN x.sno2 IS NULL THEN t1.sno2
							ELSE x.sno2
						END = t1.sno2
					AND
						CASE
							WHEN x.sno3 IS NULL THEN t1.sno3
							ELSE x.sno3
						END = t1.sno3
					AND
						CASE
							WHEN x.sno4 IS NULL THEN t1.sno4
							ELSE x.sno4
						END = t1.sno4
					AND
						CASE
							WHEN x.ASST_TYP IS NULL THEN t1.asst_typ
							ELSE x.ASST_TYP
						END = t1.asst_typ
					ORDER BY t1.data_lno DESC
				LOOP
					l_tmp_rec.calc_ctg_cd := i_calc_ctg_cd ;
					l_tmp_rec.stk_eval_cd := i_stk_eval_cd ;
					l_tmp_rec.wg_cd := i_wg_cd ;
					l_tmp_rec.ym := i_ym ;
					l_tmp_rec.mng_dpt_cd := x.mng_dpt_cd ;
					l_tmp_rec.itm_cd := x.itm_cd ;
					l_tmp_rec.itm_sub1 := x.itm_sub1 ;
					l_tmp_rec.itm_sub2 := x.itm_sub2 ;
					l_tmp_rec.itm_sub3 := x.itm_sub3 ;
					l_tmp_rec.lot_no := COALESCE(x.lot_no, c_null_val) ;
					l_tmp_rec.sublot_no := COALESCE(x.sublot_no, c_null_val) ;
					l_tmp_rec.sno1 := COALESCE(x.sno1, c_null_val) ;
					l_tmp_rec.sno2 := COALESCE(x.sno2, c_null_val) ;
					l_tmp_rec.sno3 := COALESCE(x.sno3, c_null_val) ;
					l_tmp_rec.sno4 := COALESCE(x.sno4, c_null_val) ;
					l_tmp_rec.asst_typ := x.asst_typ ;
					l_tmp_rec.base_qty := x.cost_std_qty ;
					l_tmp_rec.upri := mapa_calc$f_rnd(y.amt / y.qty * x.cost_std_qty, l_cur.upri_dec_place, c_rndoff) ;

					l_rec[COALESCE(array_length(l_rec, 1), 0) + 1] := l_tmp_rec ;

					EXIT ;
				END LOOP ;

				IF COALESCE(array_length(l_rec, 1), 0) > c_max_cnt THEN
					CALL mgpa_stk_eval$p_stk_eval_insert(l_rec) ;
				END IF ;
			END LOOP ;

			CALL mgpa_stk_eval$p_stk_eval_insert(l_rec) ;

		WHEN c_upri_set_prev_sls THEN
			CALL mgpa_calc_ctg$p_set_work(i_calc_grp_cd, c_calc_ctg_sls) ;

			FOR x IN
				SELECT
					CASE COALESCE(m2.dpt_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.mng_dpt_cd
					END AS mng_dpt_cd,
					t1.itm_cd,
					t1.itm_sub1,
					t1.itm_sub2,
					t1.itm_sub3,
					COALESCE(m1.cost_std_qty, 1) AS cost_std_qty,
					CASE COALESCE(m2.lot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.lot_no
					END AS lot_no,
					CASE COALESCE(m2.sublot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sublot_no
					END AS sublot_no,
					CASE COALESCE(m2.sno1_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno1
					END AS sno1,
					CASE COALESCE(m2.sno2_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno2
					END AS sno2,
					CASE COALESCE(m2.sno3_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno3
					END AS sno3,
					CASE COALESCE(m2.sno4_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno4
					END AS sno4,
					CASE COALESCE(m2.asst_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.asst_typ
					END AS asst_typ, MAX(t1.ac_dt) AS ac_dt
				FROM
					mgw_calc_ctg w1,
					maw_wg_key w2,
					mgt_act_sls_if t1,
					mam_itm m1
					LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd AND m2.del_flg = '0')
				WHERE	0=0
				AND	w1.calc_ctg_cd = t1.calc_ctg_cd
				AND	w2.wg_cd = t1.wg_cd
				AND	t1.ym BETWEEN i_ym_from AND i_ym_to
				AND	t1.no_eval_flg = '0'
				AND	t1.qty > 0
				AND	t1.amt > 0
				AND	t1.itm_cd = m1.itm_cd
				AND	t1.itm_sub1 = m1.itm_sub1
				AND	t1.itm_sub2 = m1.itm_sub2
				AND	t1.itm_sub3 = m1.itm_sub3
				AND	m1.asset_mng_typ = c_asset_mng_mng
				GROUP BY
					CASE COALESCE(m2.dpt_loss_eval_typ,
						c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.mng_dpt_cd
					END,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					COALESCE(m1.cost_std_qty, 1),
					CASE COALESCE(m2.lot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.lot_no
					END,
					CASE COALESCE(m2.sublot_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sublot_no
					END,
					CASE COALESCE(m2.sno1_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno1
					END,
					CASE COALESCE(m2.sno2_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno2
					END,
					CASE COALESCE(m2.sno3_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno3
					END,
					CASE COALESCE(m2.sno4_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.sno4
					END,
					CASE COALESCE(m2.asst_loss_eval_typ, c_eval_non)
						WHEN c_eval_non THEN NULL
						ELSE t1.asst_typ
					END
			LOOP
				FOR y IN
					SELECT	t1.qty, t1.amt
					FROM	mgw_calc_ctg w1, maw_wg_key w2, mgt_act_sls_if t1
					WHERE	0=0
					AND	w1.calc_ctg_cd = t1.calc_ctg_cd
					AND	w2.wg_cd = t1.wg_cd
					AND	t1.ym BETWEEN i_ym_from AND i_ym_to
					AND	t1.no_eval_flg = '0'
					AND	t1.qty > 0
					AND	t1.amt > 0
					AND	t1.ac_dt = x.ac_dt
					AND	t1.itm_cd = x.itm_cd
					AND	t1.itm_sub1 = x.itm_sub1
					AND	t1.itm_sub2 = x.itm_sub2
					AND	t1.itm_sub3 = x.itm_sub3
					AND
						CASE
							WHEN x.mng_dpt_cd IS NULL THEN t1.mng_dpt_cd
							ELSE x.mng_dpt_cd
						END = t1.mng_dpt_cd
					AND
						CASE
							WHEN x.lot_no IS NULL THEN t1.lot_no
							ELSE x.lot_no
						END = t1.lot_no
					AND
						CASE
							WHEN x.sublot_no IS NULL THEN t1.sublot_no
							ELSE x.sublot_no
						END = t1.sublot_no
					AND
						CASE
							WHEN x.sno1 IS NULL THEN t1.sno1
							ELSE x.sno1
						END = t1.sno1
					AND
						CASE
							WHEN x.sno2 IS NULL THEN t1.sno2
							ELSE x.sno2
						END = t1.sno2
					AND
						CASE
							WHEN x.sno3 IS NULL THEN t1.sno3
							ELSE x.sno3
						END = t1.sno3
					AND
						CASE
							WHEN x.sno4 IS NULL THEN t1.sno4
							ELSE x.sno4
						END = t1.sno4
					AND
						CASE
							WHEN x.ASST_TYP IS NULL THEN t1.asst_typ
							ELSE x.ASST_TYP
						END = t1.asst_typ
					ORDER BY t1.data_lno DESC
				LOOP
					l_tmp_rec.calc_ctg_cd := i_calc_ctg_cd ;
					l_tmp_rec.stk_eval_cd := i_stk_eval_cd ;
					l_tmp_rec.wg_cd := i_wg_cd ;
					l_tmp_rec.ym := i_ym ;
					l_tmp_rec.mng_dpt_cd := x.mng_dpt_cd ;
					l_tmp_rec.itm_cd := x.itm_cd ;
					l_tmp_rec.itm_sub1 := x.itm_sub1 ;
					l_tmp_rec.itm_sub2 := x.itm_sub2 ;
					l_tmp_rec.itm_sub3 := x.itm_sub3 ;
					l_tmp_rec.lot_no := COALESCE(x.lot_no, c_null_val) ;
					l_tmp_rec.sublot_no := COALESCE(x.sublot_no, c_null_val) ;
					l_tmp_rec.sno1 := COALESCE(x.sno1, c_null_val) ;
					l_tmp_rec.sno2 := COALESCE(x.sno2, c_null_val) ;
					l_tmp_rec.sno3 := COALESCE(x.sno3, c_null_val) ;
					l_tmp_rec.sno4 := COALESCE(x.sno4, c_null_val) ;
					l_tmp_rec.asst_typ := x.asst_typ ;
					l_tmp_rec.base_qty := x.cost_std_qty ;
					l_tmp_rec.upri := mapa_calc$f_rnd(y.amt / y.qty * x.cost_std_qty, l_cur.upri_dec_place, c_rndoff) ;

					l_rec[COALESCE(array_length(l_rec, 1), 0) + 1] := l_tmp_rec ;

					EXIT ;
				END LOOP ;

				IF COALESCE(array_length(l_rec, 1), 0) > c_max_cnt THEN
					CALL mgpa_stk_eval$p_stk_eval_insert(l_rec) ;
				END IF ;
			END LOOP ;

			CALL mgpa_stk_eval$p_stk_eval_insert(l_rec) ;
		ELSE
			NULL ;
	END CASE ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_STK_EVAL.P_MAIN') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_stk_eval$p_set_work (
	 IN i_calc_grp_cd	VARCHAR,
	 IN i_stk_eval_cd	VARCHAR,
	 IN i_ym	TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	評価損登録時に使用するワークテーブルを作成する
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_stk_eval_cd
		在庫評価ＣＤ
<IN>	i_ym
		年月
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_eval_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_LOSS_EVAL_TYP','NON') ;
	c_eval_tgt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_LOSS_EVAL_TYP','TGT') ;
	c_upri_set_std	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UPRI_SET_TYP','STD') ;

	ctg_list CURSOR FOR
		SELECT	w.calc_ctg_cd
		FROM	mgw_calc_ctg w
		WHERE	0=0
		ORDER BY w.ctg_prio, w.calc_ctg_cd
	;

	l_eval mam_stk_eval%ROWTYPE ;
	l_calc_grp mam_calc_grp%ROWTYPE ;
	x RECORD ;
BEGIN
	<<SKIP_STK_EVAL>>
	BEGIN
		DELETE FROM mgw_stk_eval ;
		DELETE FROM mgw_act_stk ;

		CALL mgpa_calc_ctg$p_set_work(i_calc_grp_cd, fcpa_const$get_const_val('MAC_CALC_CTG_TYP','END_STK')) ;

		l_eval := mgpa_stk_eval$f_get_eval(i_stk_eval_cd) ;

		IF l_eval.lump_rate_flg = '1' THEN
			EXIT SKIP_STK_EVAL ;
		END IF ;

		FOR x IN ctg_list LOOP
			INSERT INTO mgw_stk_eval (
				wg_cd,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no,
				sno1, sno2, sno3, sno4,
				asst_typ,
				base_qty,
				upri
				)
			SELECT
				t1.wg_cd,
				COALESCE(t1.mng_dpt_cd, c_null_val),
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				t1.lot_no, t1.sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				COALESCE(t1.asst_typ, c_null_val),
				t1.base_qty,
				t1.upri
			FROM	mgt_stk_eval t1
				LEFT OUTER JOIN mam_itm m1
					ON (t1.itm_cd = m1.itm_cd AND t1.itm_sub1 = m1.itm_sub1 AND t1.itm_sub2 = m1.itm_sub2 AND t1.itm_sub3 = m1.itm_sub3)
				LEFT OUTER JOIN mam_calc_ptn m2
					ON (m1.calc_ptn_cd = m2.calc_ptn_cd AND m2.del_flg = '0')
			WHERE	0=0
			AND	t1.ym = i_ym
			AND	t1.stk_eval_cd = i_stk_eval_cd
			AND	t1.calc_ctg_cd = x.calc_ctg_cd
			AND	(
				(COALESCE(m2.dpt_loss_eval_typ, c_eval_non) = c_eval_non OR l_eval.upri_set_typ = c_upri_set_std)
					AND t1.mng_dpt_cd IS NULL
				OR
				COALESCE(m2.dpt_loss_eval_typ, c_eval_non) = c_eval_tgt AND t1.mng_dpt_cd IS NOT NULL
				)
			AND (
				(COALESCE(m2.lot_loss_eval_typ, c_eval_non) = c_eval_non OR l_eval.upri_set_typ = c_upri_set_std)
					AND t1.lot_no = c_null_val
				OR
				COALESCE(m2.lot_loss_eval_typ, c_eval_non) = c_eval_tgt AND t1.lot_no IS NOT NULL
				)
			AND (
				(COALESCE(m2.sublot_loss_eval_typ, c_eval_non) = c_eval_non OR l_eval.upri_set_typ = c_upri_set_std)
					AND t1.sublot_no = c_null_val
				OR
				COALESCE(m2.sublot_loss_eval_typ, c_eval_non) = c_eval_tgt AND t1.sublot_no IS NOT NULL
				)
			AND (
				(COALESCE(m2.sno1_loss_eval_typ, c_eval_non) = c_eval_non OR l_eval.upri_set_typ = c_upri_set_std)
					AND t1.sno1 = c_null_val
				OR
				COALESCE(m2.sno1_loss_eval_typ, c_eval_non) = c_eval_tgt AND t1.sno1 IS NOT NULL
				)
			AND (
				(COALESCE(m2.sno2_loss_eval_typ, c_eval_non) = c_eval_non OR l_eval.upri_set_typ = c_upri_set_std)
					AND t1.sno2 = c_null_val
				OR
				COALESCE(m2.sno2_loss_eval_typ, c_eval_non) = c_eval_tgt AND t1.sno2 IS NOT NULL
				)
			AND (
				(COALESCE(m2.sno3_loss_eval_typ, c_eval_non) = c_eval_non OR l_eval.upri_set_typ = c_upri_set_std)
					AND t1.sno3 = c_null_val
				OR
				COALESCE(m2.sno3_loss_eval_typ, c_eval_non) = c_eval_tgt AND t1.sno3 IS NOT NULL
				)
			AND (
				(COALESCE(m2.sno4_loss_eval_typ, c_eval_non) = c_eval_non OR l_eval.upri_set_typ = c_upri_set_std)
					AND t1.sno4 = c_null_val
				OR
				COALESCE(m2.sno4_loss_eval_typ, c_eval_non) = c_eval_tgt AND t1.sno4 IS NOT NULL
				)
			AND (
				(COALESCE(m2.asst_loss_eval_typ, c_eval_non) = c_eval_non OR l_eval.upri_set_typ = c_upri_set_std)
					AND t1.asst_typ IS NULL
				OR
				COALESCE(m2.asst_loss_eval_typ, c_eval_non) = c_eval_tgt AND t1.asst_typ IS NOT NULL
				)
			AND NOT EXISTS (
					SELECT	'X'
					FROM	mgw_stk_eval w
					WHERE	0=0
					AND	w.wg_cd = t1.wg_cd
					AND	w.mng_dpt_cd = COALESCE(t1.mng_dpt_cd, c_null_val)
					AND	w.itm_cd = t1.itm_cd
					AND	w.itm_sub1 = t1.itm_sub1
					AND	w.itm_sub2 = t1.itm_sub2
					AND	w.itm_sub3 = t1.itm_sub3
					AND	w.lot_no = t1.lot_no
					AND	w.sublot_no = t1.sublot_no
					AND	w.sno1 = t1.sno1
					AND	w.sno2 = t1.sno2
					AND	w.sno3 = t1.sno3
					AND	w.sno4 = t1.sno4
					AND	w.asst_typ = COALESCE(t1.asst_typ, c_null_val)
				)
			;
		END LOOP ;
	END ;

	l_calc_grp := mgpa_calc_grp$f_get_rec(i_calc_grp_cd) ;

	DELETE FROM maw_wg_key ;
	INSERT INTO maw_wg_key
	SELECT m.wg_cd FROM mam_grp_wg m WHERE m.calc_grp_cd = i_calc_grp_cd ;

	INSERT INTO mgw_act_stk (
		wg_cd,
		mng_dpt_cd,
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no,
		sno1, sno2, sno3, sno4,
		bp_cd,
		asst_typ,
		qty,
		first_gr_dt,
		vld_dt,
		lmt_dt,
		non_mov_base_dt
		)
	SELECT
		COALESCE(l_calc_grp.runtime_wg_cd, t.wg_cd),
		t.mng_dpt_cd,
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.lot_no, t.sublot_no,
		t.sno1, t.sno2, t.sno3, t.sno4,
		t.bp_cd,
		t.asst_typ,
		SUM(t.qty),
		MIN(t.first_gr_dt),
		MIN(t.vld_dt),
		MIN(t.lmt_dt),
		MAX(t.non_mov_base_dt)
	FROM	mgw_calc_ctg w, mgt_act_stk t, maw_wg_key w2
	WHERE	0=0
	AND	w.calc_ctg_cd = t.calc_ctg_cd
	AND	w2.wg_cd =t.wg_cd
	AND	t.ym = i_ym
	GROUP BY COALESCE(l_calc_grp.runtime_wg_cd, t.wg_cd), t.mng_dpt_cd,
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.lot_no, t.sublot_no,
		t.sno1, t.sno2, t.sno3, t.sno4,
		t.bp_cd,
		t.asst_typ
	;

END ;
$BODY$
LANGUAGE plpgsql
;
