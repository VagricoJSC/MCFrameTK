CREATE OR REPLACE PROCEDURE mgpa_imp_itm_dtl$p_ins_mgw_main(
	 IN i_calc_ctg VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_cmn_mfg_flg CHARACTER,
	 IN i_imp_ope_typ VARCHAR)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		品目詳細マスタ用のデータをコピー用ワークテーブルに作成する
<REMARKS>
		ワークテーブル作成メイン処理用プロシージャ
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<IN>	I_IMP_CMN_MFG_FLG
		共通製造データ取込ＦＬＧ
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE;
	l_wg_cd mam_wg.wg_cd%TYPE;
	l_cnt INTEGER;

	c_interactive CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','INTERACTIVE');
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');
	c_purc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PURC_ID_TYP','PURC');
	c_onr_rcv CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PURC_ID_TYP','ONR_RCV');
	c_vmi CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PURC_ID_TYP','VMI');
BEGIN
	/* 個別取込ならデフォルトの計算カテゴリＣＤを使いその他の引数は無視する */
	IF i_imp_ope_typ = c_interactive THEN
		l_calc_ctg_cd := mgpa_co_parm$f_get_calc_ctg_cd(NULL);
		l_wg_cd := NULL;
	ELSE
		l_calc_ctg_cd := i_calc_ctg;
		l_wg_cd := i_wg_cd;
	END IF;

	DELETE FROM	mgw_imp_itm_dtl w
	WHERE	0=0
	AND w.calc_ctg_cd = l_calc_ctg_cd
	AND w.term = i_term
	AND (l_wg_cd IS NULL OR w.wg_cd = l_wg_cd)
	AND (i_imp_ope_typ = c_batch
			OR EXISTS (
				SELECT	'X'
				FROM	mgw_imp_interactive_key wk
				WHERE	0=0
				AND wk.itm_cd = w.itm_cd
				AND wk.itm_sub1 = w.itm_sub1
				AND wk.itm_sub2 = w.itm_sub2
				AND wk.itm_sub3 = w.itm_sub3
				AND wk.wg_cd = w.wg_cd
			)
		);

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgw_wg;

	/*** ＳＣＭのマスタからコピーする ***/
	INSERT INTO mgw_imp_itm_dtl (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		loc_cd,
		sppl_cd,
		rqst_wg_cd,
		term,
		calc_ctg_cd,
		wg_cd,
		cost_ratio,
		oper_ptn,
		bom_ptn,
		min_lot_qty,
		batch_lot_qty,
		fxd_lot_qty,
		fxd_yield_qty,
		nmr_qty,
		dnm_qty,
		alc_dpt_cd,
		exp_dpt_cd,
		exp_prio,
		max_qty,
		alc_val1,
		alc_val2,
		alc_val3,
		alc_val4,
		alc_val5,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3,
		non_calc_flg,
		imp_err_flg,
		imp_flg
		)
	SELECT
		m01.itm_cd,
		m01.itm_sub1,
		m01.itm_sub2,
		m01.itm_sub3,
		m01.mfg_loc_cd,
		m01.sppl_cd,
		m01.rqst_wg_cd,
		m01.term,
		l_calc_ctg_cd,
		m01.wg_cd,
		m01.cost_ratio,
		m01.oper_ptn,
		m01.bom_ptn,
		m01.min_lot_qty,
		m01.batch_lot_qty,
		m01.max_lot_qty,
		m01.fxd_rqmt_qty,
		m01.yield_schd_qty,
		m01.mfg_inst_qty,
		m01.alc_dpt_cd,
		m01.exp_dpt_cd,
		m01.prio,
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		NULL,
		m01.memo1,
		NULL,
		NULL,
		NULL,
		c_off,
		c_off,
		CASE i_imp_ope_typ
			WHEN c_interactive THEN c_on
			ELSE c_off
		END
	FROM	(
		/* 製造品 */
		SELECT
			m21.itm_cd,
			m21.itm_sub1,
			m21.itm_sub2,
			m21.itm_sub3,
			m21.mfg_loc_cd,
			m21.sppl_cd,
			c_null_val AS rqst_wg_cd,
			m23.term,
			CASE i_imp_cmn_mfg_flg
				WHEN c_on THEN c_null_val
				ELSE m21.wg_cd
			END AS wg_cd,
			m21.bom_ptn,
			COALESCE(m21.cost_ratio, m21.order_ratio) AS cost_ratio,
			CASE m21.oper_ptn
				WHEN c_null_val THEN NULL
				ELSE m21.oper_ptn
			END AS oper_ptn,
			m21.min_lot_qty,
			m21.batch_lot_qty,
			m21.max_lot_qty,
			COALESCE(m21.fxd_rqmt_qty, 0) AS fxd_rqmt_qty,
			m21.yield_schd_qty,
			m21.mfg_inst_qty,
			NULL AS alc_dpt_cd,
			mgpa_cost_if$f_get_dpt(
				mapa_dpt$f_get_dpt_cd_ne(
					mapa_loc$f_get_asst_dpt_cd_ne(m21.mfg_loc_cd, COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)), c_on),
					COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))),
				NULL,
				COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)),
				c_off) AS exp_dpt_cd,
			m21.prio,
			m21.memo1,
			ROW_NUMBER() OVER (PARTITION BY
				m21.itm_cd,
				m21.itm_sub1,
				m21.itm_sub2,
				m21.itm_sub3,
				m21.mfg_loc_cd,
				CASE i_imp_cmn_mfg_flg
					WHEN c_on THEN c_null_val
					ELSE m21.wg_cd
				END ORDER BY m21.bom_ptn, m21.st_dt) AS rn
		FROM	mam_itm_dtl_ m21, mam_itm_srch m22, mam_term m23
		WHERE	0=0
		AND m21.itm_cd = m22.itm_cd
		AND m21.itm_sub1 = m22.itm_sub1
		AND m21.itm_sub2 = m22.itm_sub2
		AND m21.itm_sub3 = m22.itm_sub3
		AND (
			i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt
			OR
			i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
			)
		AND m21.del_flg = c_off
		AND (i_imp_cmn_mfg_flg = c_on OR m21.wg_cd <> c_null_val) /* 共通製造データ取込ＦＬＧ＝オンのときのみ製造品の共通データを作成可能 */
		AND m21.mfg_loc_cd <> c_null_val
		AND m21.sppl_cd = c_null_val
		AND m21.maker_cd = c_null_val
		AND m21.rqst_loc_cd = c_null_val
		AND m22.del_flg = c_off
		AND m23.term = i_term
		AND COALESCE(m21.cost_ratio, m21.order_ratio) > 0
		AND (i_imp_cmn_mfg_flg = c_off AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd)
			OR i_imp_cmn_mfg_flg = c_on AND (l_cnt = 0 OR EXISTS (SELECT 'X' FROM mgw_wg w WHERE w.wg_cd = m21.wg_cd)))
		AND (i_imp_ope_typ = c_batch
				OR EXISTS (
					SELECT	'X'
					FROM	mgw_imp_interactive_key wk
					WHERE	0=0
					AND wk.itm_cd = m21.itm_cd
					AND wk.itm_sub1 = m21.itm_sub1
					AND wk.itm_sub2 = m21.itm_sub2
					AND wk.itm_sub3 = m21.itm_sub3
					AND wk.wg_cd = m21.wg_cd
				)
			)
		UNION ALL
		/* 購買品 */
		SELECT
			m21.itm_cd,
			m21.itm_sub1,
			m21.itm_sub2,
			m21.itm_sub3,
			m21.mfg_loc_cd,
			m21.sppl_cd,
			c_null_val AS rqst_wg_cd,
			m23.term,
			m21.wg_cd,
			c_null_val AS bom_ptn,
			COALESCE(m21.cost_ratio, m21.order_ratio) AS cost_ratio,
			m21.oper_ptn,
			m21.min_lot_qty,
			m21.batch_lot_qty,
			m21.max_lot_qty,
			COALESCE(m21.fxd_rqmt_qty, 0) AS fxd_rqmt_qty,
			m21.yield_schd_qty,
			m21.mfg_inst_qty,
			mgpa_cost_if$f_get_dpt(
				mapa_dpt$f_get_dpt_cd_ne(
					COALESCE(m24.purc_dpt_cd, m25.dpt_cd),
					COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))),
				NULL,
				COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)),
				c_off) AS alc_dpt_cd,
			NULL AS exp_dpt_cd,
			m21.prio,
			m21.memo1,
			ROW_NUMBER() OVER (
				PARTITION BY
					m21.itm_cd,
					m21.itm_sub1,
					m21.itm_sub2,
					m21.itm_sub3,
					m21.sppl_cd,
					m21.wg_cd
				ORDER BY
					CASE m21.maker_cd
					WHEN c_null_val THEN NULL
					ELSE m21.maker_cd
					END NULLS FIRST, m21.st_dt
				) AS rn
		FROM	mam_itm_srch m22,
				mam_term m23,
				mam_sppl_usr m24
				RIGHT OUTER JOIN mam_itm_dtl_ m21
					ON (m21.sppl_cd = m24.sppl_cd
						AND fcpa_postgres_util$greatest(i_term, m21.st_dt) BETWEEN m24.st_dt AND m24.end_dt)
				LEFT OUTER JOIN mam_usr_acl m25
					ON (m24.purc_usr_cd = m25.usr_cd
						AND fcpa_postgres_util$greatest(i_term, m24.st_dt) BETWEEN m25.st_dt AND m25.end_dt)
		WHERE	0=0
		AND m21.itm_cd = m22.itm_cd
		AND m21.itm_sub1 = m22.itm_sub1
		AND m21.itm_sub2 = m22.itm_sub2
		AND m21.itm_sub3 = m22.itm_sub3
		AND (
			i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt
			OR
			i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
			)
		AND m21.del_flg = c_off
		AND m21.mfg_loc_cd = c_null_val
		AND m21.sppl_cd <> c_null_val
		AND m21.rqst_loc_cd = c_null_val
		AND m21.bom_ptn = c_null_val
		AND m22.del_flg = c_off
		AND m23.term = i_term
		AND m21.purc_id_typ IN (c_purc, c_onr_rcv, c_vmi)
		AND COALESCE(m21.cost_ratio, m21.order_ratio) > 0
		AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd)
		AND (i_imp_ope_typ = c_batch
				OR EXISTS (
					SELECT	'X'
					FROM	mgw_imp_interactive_key wk
					WHERE	0=0
					AND wk.itm_cd = m21.itm_cd
					AND wk.itm_sub1 = m21.itm_sub1
					AND wk.itm_sub2 = m21.itm_sub2
					AND wk.itm_sub3 = m21.itm_sub3
					AND wk.wg_cd = m21.wg_cd
				)
			)
		UNION ALL
		/* 依頼品 */
		SELECT
			m21.itm_cd,
			m21.itm_sub1,
			m21.itm_sub2,
			m21.itm_sub3,
			m21.mfg_loc_cd,
			m21.sppl_cd,
			m24.wg_cd AS rqst_wg_cd,
			m23.term,
			m21.wg_cd,
			c_null_val AS bom_ptn,
			COALESCE(m21.cost_ratio, m21.order_ratio) AS cost_ratio,
			m21.oper_ptn,
			m21.min_lot_qty,
			m21.batch_lot_qty,
			m21.max_lot_qty,
			COALESCE(m21.fxd_rqmt_qty, 0) AS fxd_rqmt_qty,
			m21.yield_schd_qty,
			m21.mfg_inst_qty,
			NULL AS alc_dpt_cd,
			mgpa_cost_if$f_get_dpt(
				mapa_dpt$f_get_dpt_cd_ne(
					mapa_loc$f_get_asst_dpt_cd_ne(
						m21.rqst_loc_cd,
						COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)),
						c_on),
					COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))),
				NULL,
				COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)),
				c_off) AS exp_dpt_cd,
			m21.prio,
			m21.memo1,
			ROW_NUMBER() OVER (
				PARTITION BY
					m21.itm_cd,
					m21.itm_sub1,
					m21.itm_sub2,
					m21.itm_sub3,
					m24.wg_cd,
					m21.wg_cd
				ORDER BY
					m21.st_dt
				) AS rn
		FROM	mam_itm_srch m22,
				mam_term m23,
				mam_loc m24
				RIGHT OUTER JOIN mam_itm_dtl_ m21
					ON (m21.rqst_loc_cd = m24.loc_cd)
		WHERE	0=0
		AND m21.itm_cd = m22.itm_cd
		AND m21.itm_sub1 = m22.itm_sub1
		AND m21.itm_sub2 = m22.itm_sub2
		AND m21.itm_sub3 = m22.itm_sub3
		AND (
			i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt
			OR
			i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
			)
		AND m21.del_flg = c_off
		AND m21.mfg_loc_cd = c_null_val
		AND m21.sppl_cd = c_null_val
		AND m21.maker_cd = c_null_val
		AND m21.rqst_loc_cd <> c_null_val
		AND m21.bom_ptn = c_null_val
		AND m22.del_flg = c_off
		AND m23.term = i_term
		AND m24.del_flg = c_off
		AND COALESCE(m21.cost_ratio, m21.order_ratio) > 0
		AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd)
		AND (i_imp_ope_typ = c_batch
				OR EXISTS (
					SELECT	'X'
					FROM	mgw_imp_interactive_key wk
					WHERE	0=0
					AND wk.itm_cd = m21.itm_cd
					AND wk.itm_sub1 = m21.itm_sub1
					AND wk.itm_sub2 = m21.itm_sub2
					AND wk.itm_sub3 = m21.itm_sub3
					AND wk.wg_cd = m21.wg_cd
				)
			)
		) m01
	WHERE	0=0
	AND m01.rn = 1
	ORDER BY
		m01.itm_cd,
		m01.itm_sub1,
		m01.itm_sub2,
		m01.itm_sub3,
		m01.mfg_loc_cd,
		m01.sppl_cd,
		m01.rqst_wg_cd;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_dtl$p_imp_mgt_main(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_ope_typ VARCHAR,
	 IN i_usr VARCHAR,
	 INOUT o_err_flg CHAR)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目詳細)
<REMARKS>
		取込メイン処理用プロシージャ
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<IN>	I_USR
		ユーザＩＤ
<INOUT>	O_ERR_FLG
		エラーフラグ
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_max_cnt CONSTANT INTEGER := 50000; /* バルクインサートでの最大レコード数 */
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	l_log_no fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE;

	i INTEGER := 0;
	j RECORD;
	k INTEGER := 0;
	l RECORD;

	l_chk_flg CHAR(1);
	l_parm mam_sys_parm.parm_val%TYPE;
	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE;

	x RECORD;
	y RECORD;

	c_interactive CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','INTERACTIVE');
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');
	c_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp', 'mgt_itm_dtl', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp_tmp', 'mgt_itm_dtl', 'integer');

	/* 確定品目は削除 */
	CALL mgpa_fix_del$p_itm_dtl(i_usr, i_term);

	l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP');

	/* 個別取込ならデフォルトの計算カテゴリＣＤを使う */
	IF i_imp_ope_typ = c_interactive THEN
		l_calc_ctg_cd := mgpa_co_parm$f_get_calc_ctg_cd(NULL);
	ELSE
		l_calc_ctg_cd := NULL;
	END IF;

	FOR x IN
		SELECT
			t.*, m.asset_mng_typ AS asset_mng_typ
		FROM	(
			SELECT DISTINCT
				w.itm_cd,
				w.itm_sub1,
				w.itm_sub2,
				w.itm_sub3,
				w.wg_cd,
				w.term,
				w.calc_ctg_cd
			FROM	mgw_imp_itm_dtl w
			WHERE	0=0
			AND w.imp_flg = c_on
			AND w.upd_usr_id = i_usr
			AND w.term = i_term
			AND (l_calc_ctg_cd IS NULL OR w.calc_ctg_cd = l_calc_ctg_cd)
			AND (i_imp_ope_typ = c_batch
						AND w.upd_srv_req_no = fcpa_context$f_get_processid()
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_imp_interactive_key wk
						WHERE	0=0
						AND wk.itm_cd = w.itm_cd
						AND wk.itm_sub1 = w.itm_sub1
						AND wk.itm_sub2 = w.itm_sub2
						AND wk.itm_sub3 = w.itm_sub3
						AND wk.wg_cd = w.wg_cd
					)
				)
			) t
			LEFT OUTER JOIN mam_itm_srch m
				ON (t.itm_cd = m.itm_cd
					AND t.itm_sub1 = m.itm_sub1
					AND t.itm_sub2 = m.itm_sub2
					AND t.itm_sub3 = m.itm_sub3
					AND m.del_flg = c_off)
		WHERE	0=0
	LOOP
		/*** 品目チェック処理、エラーとなった品目と同じ品目のワークのデータは全件をエラーとして、取り込まない ***/
		<<NEXT_LOOP>>
		BEGIN
			IF x.asset_mng_typ IS NULL THEN
				/* 品目マスタに有効な品目として登録されていません。品目：{1} */
				CALL fcpa_batch_log$p_data_log('MGBDD0023', l_log_no, l_log_sub_key1, l_log_sub_key2,
					mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm));

				UPDATE mgw_imp_itm_dtl w
				SET imp_err_flg = c_on
				WHERE	0=0
				AND w.itm_cd = x.itm_cd
				AND w.itm_sub1 = x.itm_sub1
				AND w.itm_sub2 = x.itm_sub2
				AND w.itm_sub3 = x.itm_sub3
				AND w.wg_cd = x.wg_cd
				AND w.calc_ctg_cd = x.calc_ctg_cd
				AND w.imp_flg = c_on
				AND w.term = i_term
				AND w.upd_usr_id = i_usr;

				o_err_flg := c_on ;

				EXIT NEXT_LOOP;
			END IF;

			k := 0;
			FOR y IN
				SELECT
					w.itm_cd,
					w.itm_sub1,
					w.itm_sub2,
					w.itm_sub3,
					w.loc_cd,
					w.sppl_cd,
					w.rqst_wg_cd,
					w.term,
					w.calc_ctg_cd,
					w.wg_cd,
					w.cost_ratio,
					w.oper_ptn,
					w.bom_ptn,
					w.min_lot_qty,
					w.batch_lot_qty,
					w.fxd_lot_qty,
					w.fxd_yield_qty,
					w.nmr_qty,
					w.dnm_qty,
					w.alc_dpt_cd,
					w.exp_dpt_cd,
					w.exp_prio,
					w.max_qty,
					w.alc_val1,
					w.alc_val2,
					w.alc_val3,
					w.alc_val4,
					w.alc_val5,
					w.rmrks,
					w.sub_char1,
					w.sub_char2,
					w.sub_char3,
					w.non_calc_flg,
					m1.bp_cd AS mam_bp_cd,
					m2.dpt_cd AS mam_alc_dpt_cd,
					m3.dpt_cd AS mam_exp_dpt_cd,
					m4.loc_cd AS mam_loc_cd,
					m5.wg_cd AS mam_wg_cd,
					CASE w.loc_cd
						WHEN c_null_val THEN 0
						ELSE 1
					END +
					CASE w.sppl_cd
						WHEN c_null_val THEN 0
						ELSE 1
					END +
					CASE w.rqst_wg_cd
						WHEN c_null_val THEN 0
						ELSE 1
					END AS cnt
				FROM	mgw_imp_itm_dtl w
					LEFT OUTER JOIN mam_bp m1
						ON (w.sppl_cd = m1.bp_cd)
					LEFT OUTER JOIN mam_cost_dpt m2
						ON (w.alc_dpt_cd = m2.dpt_cd AND w.term = m2.term)
					LEFT OUTER JOIN mam_cost_dpt m3
						ON (w.exp_dpt_cd = m3.dpt_cd AND w.term = m3.term)
					LEFT OUTER JOIN mam_loc m4
						ON (w.loc_cd = m4.loc_cd)
					LEFT OUTER JOIN mam_wg m5
						ON (w.rqst_wg_cd = m5.wg_cd)
				WHERE	0=0
				AND w.itm_cd = x.itm_cd
				AND w.itm_sub1 = x.itm_sub1
				AND w.itm_sub2 = x.itm_sub2
				AND w.itm_sub3 = x.itm_sub3
				AND w.wg_cd = x.wg_cd
				AND w.term = x.term
				AND w.calc_ctg_cd = x.calc_ctg_cd
				AND w.upd_usr_id = i_usr
				AND w.imp_flg = c_on
			LOOP
				l_chk_flg := c_off;

				/*** 取込対象データのチェック、品目、ワーキンググループ、期、計算カテゴリ、ユーザ単位でチェックする ***/
				IF c_mng <> x.asset_mng_typ AND y.loc_cd <> c_null_val THEN
					/* 資産管理しない品目に対して場所を設定することはできません。品目：{1} 場所：{2} */
					CALL fcpa_batch_log$p_data_log('MGBDD0027', l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
						y.loc_cd);
					l_chk_flg := c_on;
				END IF;

				IF y.cnt = 0 THEN
					/* 場所と発注先と依頼先ワーキンググループがいずれも設定されていません。品目：{1} ワーキンググループ：{2} */
					CALL fcpa_batch_log$p_data_log('MGBDD0048', l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
						x.wg_cd);
					l_chk_flg := c_on;
				ELSIF y.cnt > 1 THEN
					/* 場所と発注先と依頼先ワーキンググループのうち、いずれか1つのみを指定してください。品目：{1} 場所：{2} 発注先：{3} 依頼先ワーキンググループ：{4} */
					CALL fcpa_batch_log$p_data_log('MGBDD0028', l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
						y.loc_cd,
						y.sppl_cd,
						y.rqst_wg_cd);
					l_chk_flg := c_on;
				ELSIF y.loc_cd <> c_null_val AND y.mam_loc_cd IS NULL THEN
					/* 場所マスタに有効な場所として登録されていません。場所：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0025', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.loc_cd);
					l_chk_flg := c_on;
				ELSIF y.sppl_cd <> c_null_val AND y.mam_bp_cd IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。発注先：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0059', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.sppl_cd);
					l_chk_flg := c_on;
				ELSIF y.rqst_wg_cd <> c_null_val AND y.mam_wg_cd IS NULL THEN
					/* ワーキンググループマスタに有効なワーキンググループとして登録されていません。依頼先ワーキンググループ：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0066', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.rqst_wg_cd);
					l_chk_flg := c_on;
				ELSIF y.wg_cd <> c_null_val AND y.rqst_wg_cd = y.wg_cd THEN
					/* 依頼先ワーキンググループにワーキンググループと同じ値を指定できません。依頼先ワーキンググループ：{1} ワーキンググループ：{2} */
					CALL fcpa_batch_log$p_data_log('MGBDD0067', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.rqst_wg_cd,
						y.wg_cd);
					l_chk_flg := c_on;
				END IF;

				IF y.alc_dpt_cd IS NOT NULL AND y.mam_alc_dpt_cd IS NULL THEN
					/* 原価部門マスタに登録されていません。部門：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.alc_dpt_cd,
						fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()));
					l_chk_flg := c_on;
				END IF;

				IF y.exp_dpt_cd IS NOT NULL AND y.mam_exp_dpt_cd IS NULL THEN
					/* 原価部門マスタに登録されていません。部門：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.exp_dpt_cd,
						fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()));
					l_chk_flg := c_on;
				END IF;

				IF l_chk_flg = c_on THEN
					UPDATE mgw_imp_itm_dtl w
					SET imp_err_flg = c_on
					WHERE	0=0
					AND w.itm_cd = x.itm_cd
					AND w.itm_sub1 = x.itm_sub1
					AND w.itm_sub2 = x.itm_sub2
					AND w.itm_sub3 = x.itm_sub3
					AND w.wg_cd = x.wg_cd
					AND w.term = x.term
					AND w.calc_ctg_cd = x.calc_ctg_cd
					AND w.upd_usr_id = i_usr;

					o_err_flg := c_on ;

					EXIT NEXT_LOOP;
				END IF;

				k := k + 1;

				INSERT INTO mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp_tmp (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					loc_cd,
					sppl_cd,
					rqst_wg_cd,
					term,
					calc_ctg_cd,
					wg_cd,
					cost_ratio,
					oper_ptn,
					bom_ptn,
					min_lot_qty,
					batch_lot_qty,
					fxd_lot_qty,
					fxd_yield_qty,
					nmr_qty,
					dnm_qty,
					alc_dpt_cd,
					exp_dpt_cd,
					exp_prio,
					max_qty,
					alc_val1,
					alc_val2,
					alc_val3,
					alc_val4,
					alc_val5,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg,
					_index_
					)
				VALUES (
					y.itm_cd,
					y.itm_sub1,
					y.itm_sub2,
					y.itm_sub3,
					y.loc_cd,
					y.sppl_cd,
					y.rqst_wg_cd,
					y.term,
					y.calc_ctg_cd,
					y.wg_cd,
					y.cost_ratio,
					y.oper_ptn,
					y.bom_ptn,
					y.min_lot_qty,
					y.batch_lot_qty,
					y.fxd_lot_qty,
					y.fxd_yield_qty,
					y.nmr_qty,
					y.dnm_qty,
					y.alc_dpt_cd,
					y.exp_dpt_cd,
					y.exp_prio,
					y.max_qty,
					y.alc_val1,
					y.alc_val2,
					y.alc_val3,
					y.alc_val4,
					y.alc_val5,
					y.rmrks,
					y.sub_char1,
					y.sub_char2,
					y.sub_char3,
					y.non_calc_flg,
					k
					);
			END LOOP;

			FOR l IN
				SELECT * FROM mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp_tmp ORDER BY _index_ ASC
			LOOP
				i := i + 1;
				INSERT INTO mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					loc_cd,
					sppl_cd,
					rqst_wg_cd,
					term,
					calc_ctg_cd,
					wg_cd,
					cost_ratio,
					oper_ptn,
					bom_ptn,
					min_lot_qty,
					batch_lot_qty,
					fxd_lot_qty,
					fxd_yield_qty,
					nmr_qty,
					dnm_qty,
					alc_dpt_cd,
					exp_dpt_cd,
					exp_prio,
					max_qty,
					alc_val1,
					alc_val2,
					alc_val3,
					alc_val4,
					alc_val5,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg,
					_index_
					)
				VALUES (
					l.itm_cd,
					l.itm_sub1,
					l.itm_sub2,
					l.itm_sub3,
					l.loc_cd,
					l.sppl_cd,
					l.rqst_wg_cd,
					l.term,
					l.calc_ctg_cd,
					l.wg_cd,
					l.cost_ratio,
					l.oper_ptn,
					l.bom_ptn,
					l.min_lot_qty,
					l.batch_lot_qty,
					l.fxd_lot_qty,
					l.fxd_yield_qty,
					l.nmr_qty,
					l.dnm_qty,
					l.alc_dpt_cd,
					l.exp_dpt_cd,
					l.exp_prio,
					l.max_qty,
					l.alc_val1,
					l.alc_val2,
					l.alc_val3,
					l.alc_val4,
					l.alc_val5,
					l.rmrks,
					l.sub_char1,
					l.sub_char2,
					l.sub_char3,
					l.non_calc_flg,
					i
					);
			END LOOP;

			IF i > c_max_cnt THEN
				FOR j IN
					SELECT * FROM mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp ORDER BY _index_ ASC
				LOOP
					DELETE FROM mgt_itm_dtl m
					WHERE	0=0
					AND	m.itm_cd = j.itm_cd
					AND	m.itm_sub1 = j.itm_sub1
					AND	m.itm_sub2 = j.itm_sub2
					AND	m.itm_sub3 = j.itm_sub3
					AND	m.term = j.term
					AND	m.calc_ctg_cd = j.calc_ctg_cd
					AND	m.wg_cd = j.wg_cd;
				END LOOP;
				
				INSERT INTO mgt_itm_dtl (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					loc_cd,
					sppl_cd,
					rqst_wg_cd,
					term,
					calc_ctg_cd,
					wg_cd,
					cost_ratio,
					oper_ptn,
					bom_ptn,
					min_lot_qty,
					batch_lot_qty,
					fxd_lot_qty,
					fxd_yield_qty,
					nmr_qty,
					dnm_qty,
					alc_dpt_cd,
					exp_dpt_cd,
					exp_prio,
					max_qty,
					alc_val1,
					alc_val2,
					alc_val3,
					alc_val4,
					alc_val5,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg
					)
				SELECT
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					loc_cd,
					sppl_cd,
					rqst_wg_cd,
					term,
					calc_ctg_cd,
					wg_cd,
					cost_ratio,
					oper_ptn,
					bom_ptn,
					min_lot_qty,
					batch_lot_qty,
					fxd_lot_qty,
					fxd_yield_qty,
					nmr_qty,
					dnm_qty,
					alc_dpt_cd,
					exp_dpt_cd,
					exp_prio,
					max_qty,
					alc_val1,
					alc_val2,
					alc_val3,
					alc_val4,
					alc_val5,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg
				FROM
					mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp;
				
				TRUNCATE TABLE mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp;
				i := 0 ;
			END IF;
		END;
		TRUNCATE TABLE mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp_tmp;
	END LOOP;

	IF i > 0 THEN
		FOR j IN
			SELECT * FROM mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp ORDER BY _index_ ASC
		LOOP
			DELETE FROM mgt_itm_dtl m
			WHERE	0=0
			AND	m.itm_cd = j.itm_cd
			AND	m.itm_sub1 = j.itm_sub1
			AND	m.itm_sub2 = j.itm_sub2
			AND	m.itm_sub3 = j.itm_sub3
			AND	m.term = j.term
			AND	m.calc_ctg_cd = j.calc_ctg_cd
			AND	m.wg_cd = j.wg_cd;
		END LOOP;

		INSERT INTO mgt_itm_dtl (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			sppl_cd,
			rqst_wg_cd,
			term,
			calc_ctg_cd,
			wg_cd,
			cost_ratio,
			oper_ptn,
			bom_ptn,
			min_lot_qty,
			batch_lot_qty,
			fxd_lot_qty,
			fxd_yield_qty,
			nmr_qty,
			dnm_qty,
			alc_dpt_cd,
			exp_dpt_cd,
			exp_prio,
			max_qty,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg
			)
		SELECT
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			sppl_cd,
			rqst_wg_cd,
			term,
			calc_ctg_cd,
			wg_cd,
			cost_ratio,
			oper_ptn,
			bom_ptn,
			min_lot_qty,
			batch_lot_qty,
			fxd_lot_qty,
			fxd_yield_qty,
			nmr_qty,
			dnm_qty,
			alc_dpt_cd,
			exp_dpt_cd,
			exp_prio,
			max_qty,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg
		FROM
			mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp;

		TRUNCATE TABLE mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp;
	END IF;

	TRUNCATE TABLE mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp_tmp;
	TRUNCATE TABLE mgpa_imp_itm_dtl$p_imp_mgt_main$l_imp;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_dtl$p_ins_mgw(
	 IN i_calc_ctg VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_cmn_mfg_flg CHARACTER DEFAULT '0',
	 IN i_imp_ope_typ VARCHAR DEFAULT '2')
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		品目詳細マスタ用のデータをコピー用ワークテーブルに作成する
<REMARKS>
		メイン処理を起動するプロシージャ
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<IN>	I_IMP_CMN_MFG_FLG
		共通製造データ取込ＦＬＧ
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	l_calc_ctg mam_calc_ctg.calc_ctg_cd%TYPE;
BEGIN
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_ITM_DTL.P_INS_MGW');

	l_calc_ctg := mgpa_co_parm$f_get_calc_ctg_cd(i_calc_ctg);

	/* メイン処理の起動 */
	CALL mgpa_imp_itm_dtl$p_ins_mgw_main(l_calc_ctg, i_wg_cd, i_term, i_dt, i_imp_cmn_mfg_flg, i_imp_ope_typ);

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_ITM_DTL.P_INS_MGW');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_dtl$p_imp_mgt(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_imp_ope_typ VARCHAR DEFAULT '2')
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目詳細)
<REMARKS>
		メイン処理を起動するプロシージャ
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	l_err_flg CHAR(1);
	l_usr fcm_user.user_id%TYPE;

	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH');
BEGIN
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_ITM_DTL.P_IMP_MGT');

	l_usr := fcpa_context$f_get_userid();

	l_err_flg := c_off;

	/* メイン処理の起動 */
	CALL mgpa_imp_itm_dtl$p_imp_mgt_main(i_term, i_imp_ope_typ, l_usr, l_err_flg);

	/* エラーデータ以外は削除 */
	DELETE FROM	mgw_imp_itm_dtl w
	WHERE	0=0
	AND w.imp_flg = c_on
	AND w.imp_err_flg = c_off
	AND w.upd_usr_id = l_usr
	AND w.term = i_term
	AND (i_imp_ope_typ = c_batch
			AND w.upd_srv_req_no = fcpa_context$f_get_processid()
		OR EXISTS (
			SELECT	'X'
			FROM	mgw_imp_interactive_key wk
			WHERE	0=0
			AND wk.itm_cd = w.itm_cd
			AND wk.itm_sub1 = w.itm_sub1
			AND wk.itm_sub2 = w.itm_sub2
			AND wk.itm_sub3 = w.itm_sub3
			AND wk.wg_cd = w.wg_cd
			)
		);

	IF l_err_flg = c_on THEN
		UPDATE mgw_imp_itm_dtl w
		SET imp_flg = c_off
		WHERE	0=0
		AND w.imp_flg = c_on
		AND w.imp_err_flg = c_on
		AND w.upd_usr_id = l_usr
		AND w.term = i_term
		AND (i_imp_ope_typ = c_batch
				AND w.upd_srv_req_no = fcpa_context$f_get_processid()
			OR EXISTS (
				SELECT	'X'
				FROM	mgw_imp_interactive_key wk
				WHERE	0=0
				AND wk.itm_cd = w.itm_cd
				AND wk.itm_sub1 = w.itm_sub1
				AND wk.itm_sub2 = w.itm_sub2
				AND wk.itm_sub3 = w.itm_sub3
				AND wk.wg_cd = w.wg_cd
				)
			);

		COMMIT;
		CALL fcpa_err$raise_app_err('MGBDD0057');
	END IF;

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_ITM_DTL.P_IMP_MGT');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_dtl$p_set_key(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		取り込み処理を実行するためのワークテーブルを作成する
<REMARKS>
		MAW_IMP_ITMをもとにMGW_IMP_INTERACTIVE_KEYを作成する
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';

	l_term_end_ym mam_term.term%TYPE;
BEGIN
	SELECT	MAX(m.term_end_ym)
	INTO	STRICT l_term_end_ym
	FROM	mam_term m
	WHERE	0=0
	AND m.term = i_term;

	DELETE FROM	mgw_imp_interactive_key;
	INSERT INTO mgw_imp_interactive_key (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		wg_cd
		)
	SELECT DISTINCT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		x.wg_cd
	FROM	maw_imp_itm w, mam_itm_dtl_ x
	WHERE	0=0
	AND w.itm_cd = x.itm_cd
	AND w.itm_sub1 = x.itm_sub1
	AND w.itm_sub2 = x.itm_sub2
	AND w.itm_sub3 = x.itm_sub3
	AND (
		i_dt IS NOT NULL AND x.st_dt <= i_dt AND x.end_dt >= i_dt
		OR
		i_dt IS NULL AND x.st_dt < l_term_end_ym AND x.end_dt >= i_term
		)
	AND x.del_flg = c_off;
END;
$BODY$
LANGUAGE plpgsql
;
