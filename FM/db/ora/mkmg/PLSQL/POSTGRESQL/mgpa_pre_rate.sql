CREATE OR REPLACE PROCEDURE mgpa_pre_rate$p_wk(
	 IN i_sa_typ VARCHAR,
	 IN i_ym_from TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	 IN i_wg_cd VARCHAR,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_alc_rate mam_pre_alc_rate,
	 IN i INTEGER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	工数データからの比率作成処理
<REMARKS>

<ARGUMENTS>
<IN>	I_SA_TYP
		予実区分
<IN>	I_YM_FROM
		取得先年月ＦＲＯＭ
<IN>	I_YM_TO
		取得先年月ＴＯ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_TERM
		対象期
<IN>	I_ALC_RATE
		MAM_PRE_ALC_RATEレコード
<IN>	I
		配列カウンタ
<HISTORY>
**************************************************************************/
DECLARE
	c_pln CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');

	l_msg VARCHAR[];
	l_cnt NUMERIC;
	l_val mgt_pre_rate_mly.pre_alc_rate%TYPE;
	l_tmp1 mgt_pre_rate_mly.pre_alc_rate%TYPE;
	l_tmp2 mgt_pre_rate_mly.pre_alc_rate%TYPE;

	l_rate mgt_pre_rate_mly%ROWTYPE;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_pre_alc_wk m
	WHERE	0=0
	AND m.term = i_term
	AND m.calc_ctg_cd = i_calc_ctg_cd
	AND m.wg_cd = i_wg_cd
	AND m.pre_alc_rate_cd = i_alc_rate.pre_alc_rate_cd
	;

	IF l_cnt = 0 THEN
		l_msg := fcpa_err$msg_binder(
				fcpa_date_util$f_to_char(i_term, fcpa_date_util$y4m()),
				i_wg_cd,
				i_calc_ctg_cd,
				i_alc_rate.pre_alc_rate_cd
				);
		CALL fcpa_err$raise_app_err('MGBGD0005', l_msg);
	END IF;

	IF i_sa_typ = c_pln THEN
		/* 工数計画データから作成 */
		FOR t IN 1..i LOOP
			SELECT * INTO STRICT l_rate FROM mgpa_pre_rate$rate WHERE _index_ = t;

			IF l_rate.dpt_cd IS NOT NULL THEN
				CALL mapa_dpt_loc$p_set_dpt_loc(i_term, l_rate.dpt_cd); /* 品目工数用 */
				CALL mapa_dpt_loc$p_set_dpt_dpt(i_term, l_rate.dpt_cd); /* 品目外工数用 */
			END IF;
			IF l_rate.ctg_cd IS NOT NULL THEN
				CALL mapa_ctg_itm$p_set_ctg_itm(i_term, l_rate.ctg_cd); /* 品目工数用 */
				CALL mapa_ctg_itm$p_set_ctg_ctg(i_term, l_rate.ctg_cd); /* 品目外工数用 */
			END IF;

			SELECT	SUM(t1.wk_cost * COALESCE(m1.coef_val, 1))
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mam_pre_alc_wk m1,
				mgt_pln_itm_wk t1
				LEFT OUTER JOIN mam_loc m2 ON (t1.loc_cd = m2.loc_cd)
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.wk_cost_cd = m1.wk_cost_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND m1.term = i_term
			AND m1.calc_ctg_cd = i_calc_ctg_cd
			AND m1.wg_cd = i_wg_cd
			AND m1.pre_alc_rate_cd = i_alc_rate.pre_alc_rate_cd
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_loc w
						WHERE	0=0
						AND w.loc_cd = t1.loc_cd
						AND (
							w.oper_cd = t1.oper_cd
							OR
							w.oper_cd IS NULL AND w.oper_null_flg = '0'
							OR
							w.oper_cd IS NULL AND w.oper_null_flg = '1' AND t1.oper_cd IS NULL
							)
						)
				)
			AND (l_rate.loc_cd IS NULL OR l_rate.loc_cd = t1.loc_cd)
			AND (l_rate.oper_cd IS NULL OR l_rate.oper_cd = t1.oper_cd)
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = m2.sppl_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_itm w
						WHERE	0=0
						AND w.itm_cd = t1.itm_cd
						AND w.itm_sub1 = t1.itm_sub1
						AND w.itm_sub2 = t1.itm_sub2
						AND w.itm_sub3 = t1.itm_sub3
						)
				)
			AND (l_rate.itm_cd IS NULL OR l_rate.itm_cd = t1.itm_cd)
			AND (l_rate.itm_sub1 IS NULL OR l_rate.itm_sub1 = t1.itm_sub1)
			AND (l_rate.itm_sub2 IS NULL OR l_rate.itm_sub2 = t1.itm_sub2)
			AND (l_rate.itm_sub3 IS NULL OR l_rate.itm_sub3 = t1.itm_sub3)
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND l_rate.itm_mfg_inst_no IS NULL
			AND l_rate.iv_no IS NULL
			AND l_rate.po_no IS NULL
			AND l_rate.slo_no IS NULL
			;

			l_tmp1 := COALESCE(l_val, 0) * l_rate.pre_alc_rate;

			SELECT	SUM(t1.wk_cost * COALESCE(m1.coef_val, 1))
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mam_pre_alc_wk m1,
				mgt_pln_other_wk t1
				LEFT OUTER JOIN mam_loc m2 ON (t1.loc_cd = m2.loc_cd)
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.wk_cost_cd = m1.wk_cost_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND m1.term = i_term
			AND m1.calc_ctg_cd = i_calc_ctg_cd
			AND m1.wg_cd = i_wg_cd
			AND m1.pre_alc_rate_cd = i_alc_rate.pre_alc_rate_cd
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_dpt w
						WHERE	0=0
						AND w.dpt_cd = t1.dpt_cd
						)
				)
			AND (l_rate.loc_cd IS NULL OR l_rate.loc_cd = t1.loc_cd)
			AND (l_rate.oper_cd IS NULL OR l_rate.oper_cd = t1.oper_cd)
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = m2.sppl_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_ctg w
						WHERE	0=0
						AND w.ctg_cd = t1.ctg_cd
						)
				)
			AND l_rate.itm_cd IS NULL
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND l_rate.itm_mfg_inst_no IS NULL
			AND l_rate.iv_no IS NULL
			AND l_rate.po_no IS NULL
			AND l_rate.slo_no IS NULL
			;

			l_tmp2 := COALESCE(l_val, 0) * l_rate.pre_alc_rate;

			UPDATE mgpa_pre_rate$rate SET pre_alc_rate = l_tmp1 + l_tmp2 WHERE _index_ = t;
		END LOOP;
	ELSE
		/* 工数実績データから作成 */
		FOR t IN 1..i LOOP
			SELECT * INTO STRICT l_rate FROM mgpa_pre_rate$rate WHERE _index_ = t;
			IF l_rate.dpt_cd IS NOT NULL THEN
				CALL mapa_dpt_loc$p_set_dpt_loc(i_term, l_rate.dpt_cd); /* 指図工数用 */
				CALL mapa_dpt_loc$p_set_dpt_dpt(i_term, l_rate.dpt_cd); /* 指図外工数用 */
			END IF;

			IF l_rate.ctg_cd IS NOT NULL THEN
				CALL mapa_ctg_itm$p_set_ctg_itm(i_term, l_rate.ctg_cd); /* 指図工数用 */
				CALL mapa_ctg_itm$p_set_ctg_ctg(i_term, l_rate.ctg_cd); /* 指図外工数用 */
			END IF;

			SELECT	SUM(t1.wk_cost * COALESCE(m1.coef_val, 1))
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mgt_itm_mfg_inst t2,
				mam_pre_alc_wk m1,
				mgt_act_inst_wk t1
				LEFT OUTER JOIN mgt_inst_oper t3
					ON (t1.itm_cd = t3.itm_cd
						AND t1.itm_sub1 = t3.itm_sub1
						AND t1.itm_sub2 = t3.itm_sub2
						AND t1.itm_sub3 = t3.itm_sub3
						AND t1.calc_ctg_cd = t3.calc_ctg_cd
						AND t1.wg_cd = t3.wg_cd
						AND t1.itm_mfg_inst_no = t3.itm_mfg_inst_no
						AND t1.oper_act_no = t3.oper_act_no
						AND t1.mfg_act_no = t3.mfg_act_no
						)
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.itm_cd = t2.itm_cd
			AND t1.itm_sub1 = t2.itm_sub1
			AND t1.itm_sub2 = t2.itm_sub2
			AND t1.itm_sub3 = t2.itm_sub3
			AND t1.calc_ctg_cd = t2.calc_ctg_cd
			AND t1.wg_cd = t2.wg_cd
			AND t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
			AND t1.mfg_act_no = t2.mfg_act_no
			AND t1.wk_cost_cd = m1.wk_cost_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND m1.term = i_term
			AND m1.calc_ctg_cd = i_calc_ctg_cd
			AND m1.wg_cd = i_wg_cd
			AND m1.pre_alc_rate_cd = i_alc_rate.pre_alc_rate_cd
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_loc w
						WHERE	0=0
						AND w.loc_cd = t1.loc_cd
						AND (
							w.oper_cd = t3.oper_cd
							OR
							w.oper_cd IS NULL AND w.oper_null_flg = '0'
							OR
							w.oper_cd IS NULL AND w.oper_null_flg = '1' AND t3.oper_cd IS NULL
							)
						)
				)
			AND (l_rate.loc_cd IS NULL OR l_rate.loc_cd = t1.loc_cd)
			AND (l_rate.oper_cd IS NULL OR l_rate.oper_cd = t3.oper_cd)
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = t2.sppl_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_itm w
						WHERE	0=0
						AND w.itm_cd = t1.itm_cd
						AND w.itm_sub1 = t1.itm_sub1
						AND w.itm_sub2 = t1.itm_sub2
						AND w.itm_sub3 = t1.itm_sub3
						)
				)
			AND (l_rate.itm_cd IS NULL OR l_rate.itm_cd = t1.itm_cd)
			AND (l_rate.itm_sub1 IS NULL OR l_rate.itm_sub1 = t1.itm_sub1)
			AND (l_rate.itm_sub2 IS NULL OR l_rate.itm_sub2 = t1.itm_sub2)
			AND (l_rate.itm_sub3 IS NULL OR l_rate.itm_sub3 = t1.itm_sub3)
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t2.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t2.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t2.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t2.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t2.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t2.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND (l_rate.itm_mfg_inst_no IS NULL OR l_rate.itm_mfg_inst_no = t1.itm_mfg_inst_no)
			AND (l_rate.iv_no IS NULL OR l_rate.iv_no = t2.iv_no)
			AND (l_rate.po_no IS NULL OR l_rate.po_no = t2.po_no)
			AND (l_rate.slo_no IS NULL OR l_rate.slo_no = t2.slo_no)
			;

			l_tmp1 := COALESCE(l_val, 0) * l_rate.PRE_ALC_RATE;

			SELECT	SUM(t1.wk_cost * COALESCE(m1.coef_val, 1))
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mam_pre_alc_wk m1,
				mgt_act_other_wk t1
				LEFT OUTER JOIN mam_loc m2 ON (t1.loc_cd = m2.loc_cd)
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.wk_cost_cd = m1.wk_cost_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND m1.term = i_term
			AND m1.calc_ctg_cd = i_calc_ctg_cd
			AND m1.wg_cd = i_wg_cd
			AND m1.pre_alc_rate_cd = i_alc_rate.PRE_ALC_RATE_CD
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_dpt w
						WHERE	0=0
						AND w.dpt_cd = t1.dpt_cd
						)
				)
			AND (l_rate.loc_cd IS NULL OR l_rate.loc_cd = t1.loc_cd)
			AND (l_rate.oper_cd IS NULL OR l_rate.oper_cd = t1.oper_cd)
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = m2.sppl_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_ctg w
						WHERE	0=0
						AND w.ctg_cd = t1.ctg_cd
						)
				)
			AND l_rate.itm_cd IS NULL
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND l_rate.itm_mfg_inst_no IS NULL
			AND l_rate.iv_no IS NULL
			AND l_rate.po_no IS NULL
			AND l_rate.slo_no IS NULL
			;

			l_tmp2 := COALESCE(l_val, 0) * l_rate.pre_alc_rate;

			UPDATE mgpa_pre_rate$rate SET pre_alc_rate = l_tmp1 + l_tmp2 WHERE _index_ = t;
		END LOOP;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_rate$p_mfg(
	 IN i_sa_typ VARCHAR,
	 IN i_ym_from TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_co mam_co,
	 IN i_cur mam_cur,
	 IN i_alc_rate mam_pre_alc_rate,
	 IN i INTEGER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	製造データからの比率作成処理
<REMARKS>

<ARGUMENTS>
<IN>	I_SA_TYP
		予実区分
<IN>	I_YM_FROM
		取得先年月ＦＲＯＭ
<IN>	I_YM_TO
		取得先年月ＴＯ
<IN>	I_TERM
		対象期
<IN>	I_CO
		MAM_COレコード
<IN>	I_CUR
		MAM_CURレコード
<IN>	I_ALC_RATE
		MAM_PRE_ALC_RATEレコード
<IN>	I
		配列カウンタ
<HISTORY>
**************************************************************************/
DECLARE
	c_pln CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');
	c_mfg_qty CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'MFG_QTY');

	l_val mgt_pre_rate_mly.pre_alc_rate%TYPE;
	l_qty_flg CHAR(1);

	l_rate mgt_pre_rate_mly%ROWTYPE;
BEGIN
	IF i_alc_rate.pre_alc_set_typ = c_mfg_qty THEN
		l_qty_flg := '1';
	ELSE
		l_qty_flg := '0';
	END IF;

	IF i_sa_typ = c_pln THEN
		IF l_qty_flg = '0' THEN
			CALL mgpa_xchng$p_ini(i_term, i_co.purc_xrate_cd);
		END IF;

		/* 製造計画データから作成 */
		FOR t IN 1..i LOOP
			SELECT * INTO STRICT l_rate FROM mgpa_pre_rate$rate WHERE _index_ = t;
			IF l_rate.dpt_cd IS NOT NULL THEN
				CALL mapa_dpt_loc$p_set_dpt_loc(i_term, l_rate.dpt_cd);
			END IF;

			IF l_rate.ctg_cd IS NOT NULL THEN
				CALL mapa_ctg_itm$p_set_ctg_itm(i_term, l_rate.ctg_cd);
			END IF;

			SELECT
				CASE l_qty_flg
					WHEN '1' THEN
						SUM(mgpa_unit$f_get_conv_qty(
							t1.qty,
							m2.conv_base_qty,
							m2.conv_qty,
							m3.dec_place,
							m3.rnd_typ)
						)
					ELSE
						SUM(mgpa_xchng$f_xchng(
							t1.cur_cd,
							i_co.base_cur_cd,
							i_cur.amt_dec_place,
							i_co.xrate_rnd_typ,
							t1.amt,
							'MGT_PLN_MFG')
						)
				END
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mgt_pln_mfg t1
				LEFT OUTER JOIN mam_loc m1 ON (t1.loc_cd = m1.loc_cd)
				LEFT OUTER JOIN mavm_itm_unit m2
					ON (t1.itm_cd = m2.itm_cd
						AND t1.itm_sub1 = m2.itm_sub1
						AND t1.itm_sub2 = m2.itm_sub2
						AND t1.itm_sub3 = m2.itm_sub3
						AND t1.unit_cd = m2.unit_cd
						)
				LEFT OUTER JOIN mam_itm_cmn_ m3
					ON (t1.itm_cd = m3.itm_cd
						AND t1.itm_sub1 = m3.itm_sub1
						AND t1.itm_sub2 = m3.itm_sub2
						AND t1.itm_sub3 = m3.itm_sub3
						)
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_loc w
						WHERE	0=0
						AND w.loc_cd = t1.loc_cd
						AND w.oper_cd IS NULL
						)
				)
			AND (l_rate.loc_cd IS NULL OR l_rate.loc_cd = t1.loc_cd)
			AND l_rate.oper_cd IS NULL
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = m1.sppl_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_itm w
						WHERE	0=0
						AND w.itm_cd = t1.itm_cd
						AND w.itm_sub1 = t1.itm_sub1
						AND w.itm_sub2 = t1.itm_sub2
						AND w.itm_sub3 = t1.itm_sub3
						)
				)
			AND (l_rate.itm_cd IS NULL OR l_rate.itm_cd = t1.itm_cd)
			AND (l_rate.itm_sub1 IS NULL OR l_rate.itm_sub1 = t1.itm_sub1)
			AND (l_rate.itm_sub2 IS NULL OR l_rate.itm_sub2 = t1.itm_sub2)
			AND (l_rate.itm_sub3 IS NULL OR l_rate.itm_sub3 = t1.itm_sub3)
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND l_rate.itm_mfg_inst_no IS NULL
			AND l_rate.iv_no IS NULL
			AND l_rate.po_no IS NULL
			AND l_rate.slo_no IS NULL
			;

			UPDATE mgpa_pre_rate$rate SET pre_alc_rate = COALESCE(l_val, 0) * l_rate.pre_alc_rate WHERE _index_ = t;
		END LOOP;
	ELSE
		/* 製造実績データから作成 */
		FOR t IN 1..i LOOP
			SELECT * INTO STRICT l_rate FROM mgpa_pre_rate$rate WHERE _index_ = t;
			IF l_rate.dpt_cd IS NOT NULL THEN
				CALL mapa_dpt_loc$p_set_dpt_loc(i_term, l_rate.dpt_cd);
			END IF;

			IF l_rate.ctg_cd IS NOT NULL THEN
				CALL mapa_ctg_itm$p_set_ctg_itm(i_term, l_rate.ctg_cd);
			END IF;

			SELECT CASE l_qty_flg WHEN '1' THEN SUM(t1.qty) ELSE SUM(t1.amt) END
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mgt_itm_mfg_inst t2,
				mgt_act_mfg t1
				LEFT OUTER JOIN mgt_inst_oper t3
					ON (t1.itm_cd = t3.itm_cd
						AND t1.itm_sub1 = t3.itm_sub1
						AND t1.itm_sub2 = t3.itm_sub2
						AND t1.itm_sub3 = t3.itm_sub3
						AND t1.calc_ctg_cd = t3.calc_ctg_cd
						AND t1.wg_cd = t3.wg_cd
						AND t1.itm_mfg_inst_no = t3.itm_mfg_inst_no
						AND t1.oper_act_no = t3.oper_act_no
						AND t1.mfg_act_no = t3.mfg_act_no
						)
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND t1.itm_cd = t2.itm_cd
			AND t1.itm_sub1 = t2.itm_sub1
			AND t1.itm_sub2 = t2.itm_sub2
			AND t1.itm_sub3 = t2.itm_sub3
			AND t1.calc_ctg_cd = t2.calc_ctg_cd
			AND t1.wg_cd = t2.wg_cd
			AND t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
			AND t1.mfg_act_no = t2.mfg_act_no
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_loc w
						WHERE	0=0
						AND w.loc_cd = t1.loc_cd
						AND (
							w.oper_cd = t3.oper_cd
							OR
							w.oper_cd IS NULL AND w.oper_null_flg = '0'
							OR
							w.oper_cd IS NULL AND w.oper_null_flg = '1' AND t3.oper_cd IS NULL
							)
						)
				)
			AND (l_rate.loc_cd IS NULL OR l_rate.loc_cd = t1.loc_cd)
			AND (l_rate.oper_cd IS NULL OR l_rate.oper_cd = t3.oper_cd)
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = t2.sppl_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_itm w
						WHERE	0=0
						AND w.itm_cd = t1.itm_cd
						AND w.itm_sub1 = t1.itm_sub1
						AND w.itm_sub2 = t1.itm_sub2
						AND w.itm_sub3 = t1.itm_sub3
						)
				)
			AND (l_rate.itm_cd IS NULL OR l_rate.itm_cd = t1.itm_cd)
			AND (l_rate.itm_sub1 IS NULL OR l_rate.itm_sub1 = t1.itm_sub1)
			AND (l_rate.itm_sub2 IS NULL OR l_rate.itm_sub2 = t1.itm_sub2)
			AND (l_rate.itm_sub3 IS NULL OR l_rate.itm_sub3 = t1.itm_sub3)
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND (l_rate.itm_mfg_inst_no IS NULL OR l_rate.itm_mfg_inst_no = t1.itm_mfg_inst_no)
			AND (l_rate.iv_no IS NULL OR l_rate.iv_no = t2.iv_no)
			AND (l_rate.po_no IS NULL OR l_rate.po_no = t2.po_no)
			AND (l_rate.slo_no IS NULL OR l_rate.slo_no = t2.slo_no);

			UPDATE mgpa_pre_rate$rate SET pre_alc_rate = COALESCE(l_val, 0) * l_rate.pre_alc_rate WHERE _index_ = t;
		END LOOP;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_rate$p_purc(
	 IN i_sa_typ VARCHAR,
	 IN i_ym_from TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_co mam_co,
	 IN i_cur mam_cur,
	 IN i_alc_rate mam_pre_alc_rate,
	 IN i INTEGER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	購買データからの比率作成処理
<REMARKS>

<ARGUMENTS>
<IN>	I_SA_TYP
		予実区分
<IN>	I_YM_FROM
		取得先年月ＦＲＯＭ
<IN>	I_YM_TO
		取得先年月ＴＯ
<IN>	I_TERM
		対象期
<IN>	I_CO
		MAM_COレコード
<IN>	I_CUR
		MAM_CURレコード
<IN>	I_ALC_RATE
		MAM_PRE_ALC_RATEレコード
<IN>	I_ALC_RATE
		MAM_PRE_ALC_RATEレコード
<IN>	I
		配列カウンタ
<HISTORY>
**************************************************************************/
DECLARE
	c_pln CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');
	c_purc_qty CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'PURC_QTY');

	l_val mgt_pre_rate_mly.pre_alc_rate%TYPE;
	l_qty_flg CHAR(1);

	l_rate mgt_pre_rate_mly%ROWTYPE;
BEGIN
	IF i_alc_rate.pre_alc_set_typ = c_purc_qty THEN
		l_qty_flg := '1';
	ELSE
		l_qty_flg := '0';
	END IF;

	IF i_sa_typ = c_pln THEN
		IF l_qty_flg = '0' THEN
			CALL mgpa_xchng$p_ini(i_term, i_co.purc_xrate_cd);
		END IF;

		/* 購買計画データから作成 */
		FOR t IN 1..i LOOP
			SELECT * INTO STRICT l_rate FROM mgpa_pre_rate$rate WHERE _index_ = t;
			IF l_rate.dpt_cd IS NOT NULL THEN
				CALL mapa_dpt_loc$p_set_dpt_dpt(i_term, l_rate.dpt_cd); /* ALC_DPT_CDを対象とするため */
			END IF;
			IF l_rate.ctg_cd IS NOT NULL THEN
				CALL mapa_ctg_itm$p_set_ctg_itm(i_term, l_rate.ctg_cd);
			END IF;

			SELECT
				CASE l_qty_flg
					WHEN '1' THEN
						SUM(mgpa_unit$f_get_conv_qty(
							t1.qty,
							m1.conv_base_qty,
							m1.conv_qty,
							m2.dec_place,
							m2.rnd_typ)
						)
					ELSE
						SUM(mgpa_xchng$f_xchng(
							t1.cur_cd,
							i_co.base_cur_cd,
							i_cur.amt_dec_place,
							i_co.xrate_rnd_typ,
							t1.amt,
							'MGT_PLN_PURC')
						)
				END
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mgt_pln_purc t1
				LEFT OUTER JOIN mavm_itm_unit m1
					ON (t1.itm_cd = m1.itm_cd
						AND t1.itm_sub1 = m1.itm_sub1
						AND t1.itm_sub2 = m1.itm_sub2
						AND t1.itm_sub3 = m1.itm_sub3
						AND t1.unit_cd = m1.unit_cd
						)
				LEFT OUTER JOIN mam_itm_cmn_ m2
					ON (t1.itm_cd = m2.itm_cd
						AND t1.itm_sub1 = m2.itm_sub1
						AND t1.itm_sub2 = m2.itm_sub2
						AND t1.itm_sub3 = m2.itm_sub3
						)
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_dpt w
						WHERE	0=0
						AND w.dpt_cd = t1.alc_dpt_cd
						)
				)
			AND l_rate.loc_cd IS NULL
			AND l_rate.oper_cd IS NULL
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = t1.sppl_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_itm w
						WHERE	0=0
						AND w.itm_cd = t1.itm_cd
						AND w.itm_sub1 = t1.itm_sub1
						AND w.itm_sub2 = t1.itm_sub2
						AND w.itm_sub3 = t1.itm_sub3
						)
				)
			AND (l_rate.itm_cd IS NULL OR l_rate.itm_cd = t1.itm_cd)
			AND (l_rate.itm_sub1 IS NULL OR l_rate.itm_sub1 = t1.itm_sub1)
			AND (l_rate.itm_sub2 IS NULL OR l_rate.itm_sub2 = t1.itm_sub2)
			AND (l_rate.itm_sub3 IS NULL OR l_rate.itm_sub3 = t1.itm_sub3)
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND l_rate.itm_mfg_inst_no IS NULL
			AND l_rate.iv_no IS NULL
			AND l_rate.po_no IS NULL
			AND l_rate.slo_no IS NULL
			;

			UPDATE mgpa_pre_rate$rate SET pre_alc_rate = COALESCE(l_val, 0) * l_rate.pre_alc_rate WHERE _index_ = t;
		END LOOP;
	ELSE
		/* 購買実績データから作成 */
		FOR t IN 1..i LOOP
			SELECT * INTO STRICT l_rate FROM mgpa_pre_rate$rate WHERE _index_ = t;
			IF l_rate.dpt_cd IS NOT NULL THEN
				CALL mapa_dpt_loc$p_set_dpt_dpt(i_term, l_rate.dpt_cd); /* ALC_DPT_CDを対象とするため */
			END IF;
			IF l_rate.ctg_cd IS NOT NULL THEN
				CALL mapa_ctg_itm$p_set_ctg_itm(i_term, l_rate.ctg_cd);
			END IF;

			SELECT CASE l_qty_flg WHEN '1' THEN SUM(t1.qty) ELSE SUM(t1.amt) END
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mgt_act_purc t1
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_dpt w
						WHERE	0=0
						AND w.dpt_cd = t1.alc_dpt_cd
						)
				)
			AND l_rate.loc_cd IS NULL
			AND l_rate.oper_cd IS NULL
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = t1.sppl_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_itm w
						WHERE	0=0
						AND w.itm_cd = t1.itm_cd
						AND w.itm_sub1 = t1.itm_sub1
						AND w.itm_sub2 = t1.itm_sub2
						AND w.itm_sub3 = t1.itm_sub3
						)
				)
			AND (l_rate.itm_cd IS NULL OR l_rate.itm_cd = t1.itm_cd)
			AND (l_rate.itm_sub1 IS NULL OR l_rate.itm_sub1 = t1.itm_sub1)
			AND (l_rate.itm_sub2 IS NULL OR l_rate.itm_sub2 = t1.itm_sub2)
			AND (l_rate.itm_sub3 IS NULL OR l_rate.itm_sub3 = t1.itm_sub3)
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND l_rate.itm_mfg_inst_no IS NULL
			AND (l_rate.iv_no IS NULL OR l_rate.iv_no = t1.iv_no)
			AND (l_rate.po_no IS NULL OR l_rate.po_no = t1.po_no)
			AND (l_rate.slo_no IS NULL OR l_rate.slo_no = t1.slo_no)
			;

			UPDATE mgpa_pre_rate$rate SET pre_alc_rate = COALESCE(l_val, 0) * l_rate.pre_alc_rate WHERE _index_ = t;
		END LOOP;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_rate$p_sls(
	 IN i_sa_typ VARCHAR,
	 IN i_ym_FROM	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_co mam_co,
	 IN i_cur mam_cur,
	 IN i_alc_rate mam_pre_alc_rate,
	 IN i INTEGER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	売上データからの比率作成処理
<REMARKS>

<ARGUMENTS>
<IN>	I_SA_TYP
		予実区分
<IN>	I_YM_FROM
		取得先年月ＦＲＯＭ
<IN>	I_YM_TO
		取得先年月ＴＯ
<IN>	I_TERM
		対象期
<IN>	I_CO
		MAM_COレコード
<IN>	I_CUR
		MAM_CURレコード
<IN>	I_ALC_RATE
		MAM_PRE_ALC_RATEレコード
<IN>	I
		配列カウンタ
<HISTORY>
**************************************************************************/
DECLARE
	c_pln CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');
	c_sls_qty CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'SLS_QTY');

	l_val mgt_pre_rate_mly.pre_alc_rate%TYPE;
	l_qty_flg CHAR(1);

	l_rate mgt_pre_rate_mly%ROWTYPE;
BEGIN
	IF i_alc_rate.pre_alc_set_typ = c_sls_qty THEN
		l_qty_flg := '1';
	ELSE
		l_qty_flg := '0';
	END IF;

	IF i_sa_typ = c_pln THEN
		IF l_qty_flg = '0' THEN
			CALL mgpa_xchng$p_ini(i_term, i_co.sls_xrate_cd);
		END IF;

		/* 売上計画データから作成 */
		FOR t IN 1..i LOOP
			SELECT * INTO STRICT l_rate FROM mgpa_pre_rate$rate WHERE _index_ = t;
			IF l_rate.dpt_cd IS NOT NULL THEN
				CALL mapa_dpt_loc$p_set_dpt_dpt(i_term, l_rate.dpt_cd); /* ALC_DPT_CDを対象とするため */
			END IF;

			IF l_rate.ctg_cd IS NOT NULL THEN
				CALL mapa_ctg_itm$p_set_ctg_itm(i_term, l_rate.ctg_cd);
			END IF;

			SELECT
				CASE l_qty_flg
					WHEN '1' THEN
						SUM(mgpa_unit$f_get_conv_qty(
							t1.qty,
							m1.conv_base_qty,
							m1.conv_qty,
							m2.dec_place,
							m2.rnd_typ)
						)
					ELSE
						SUM(mgpa_xchng$f_xchng(
							t1.cur_cd,
							i_co.base_cur_cd,
							i_cur.amt_dec_place,
							i_co.xrate_rnd_typ,
							t1.amt,
							'MGT_PLN_SLS')
						)
				END
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mgt_pln_sls t1
				LEFT OUTER JOIN mavm_itm_unit m1
					ON (t1.itm_cd = m1.itm_cd
						AND t1.itm_sub1 = m1.itm_sub1
						AND t1.itm_sub2 = m1.itm_sub2
						AND t1.itm_sub3 = m1.itm_sub3
						AND t1.unit_cd = m1.unit_cd
						)
				LEFT OUTER JOIN mam_itm_cmn_ m2
					ON (t1.itm_cd = m2.itm_cd
						AND t1.itm_sub1 = m2.itm_sub1
						AND t1.itm_sub2 = m2.itm_sub2
						AND t1.itm_sub3 = m2.itm_sub3
						)
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND (l_rate.dpt_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_dpt w
						WHERE	0=0
						AND w.dpt_cd = t1.alc_dpt_cd
						)
				)
			AND l_rate.loc_cd IS NULL
			AND l_rate.oper_cd IS NULL
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = t1.cst_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_itm w
						WHERE	0=0
						AND w.itm_cd = t1.itm_cd
						AND w.itm_sub1 = t1.itm_sub1
						AND w.itm_sub2 = t1.itm_sub2
						AND w.itm_sub3 = t1.itm_sub3
						)
				)
			AND (l_rate.itm_cd IS NULL OR l_rate.itm_cd = t1.itm_cd)
			AND (l_rate.itm_sub1 IS NULL OR l_rate.itm_sub1 = t1.itm_sub1)
			AND (l_rate.itm_sub2 IS NULL OR l_rate.itm_sub2 = t1.itm_sub2)
			AND (l_rate.itm_sub3 IS NULL OR l_rate.itm_sub3 = t1.itm_sub3)
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND l_rate.itm_mfg_inst_no IS NULL
			AND l_rate.iv_no IS NULL
			AND l_rate.po_no IS NULL
			AND l_rate.slo_no IS NULL
			;

			UPDATE mgpa_pre_rate$rate SET pre_alc_rate = COALESCE(l_val, 0) * l_rate.pre_alc_rate WHERE _index_ = t;
		END LOOP;
	ELSE
		/* 売上実績データから作成 */
		FOR t IN 1..i LOOP
			SELECT * INTO STRICT l_rate FROM mgpa_pre_rate$rate WHERE _index_ = t;
			IF l_rate.dpt_cd IS NOT NULL THEN
				CALL mapa_dpt_loc$p_set_dpt_dpt(i_term, l_rate.dpt_cd); /* ALC_DPT_CDを対象とするため */
			END IF;
			IF l_rate.ctg_cd IS NOT NULL THEN
				CALL mapa_ctg_itm$p_set_ctg_itm(i_term, l_rate.ctg_cd);
			END IF;

			SELECT CASE l_qty_flg WHEN '1' THEN SUM(t1.qty) ELSE SUM(t1.amt) END
			INTO	STRICT l_val
			FROM	mgw_calc_ctg_wg x,
				mgt_act_sls t1
			WHERE	0=0
			AND x.calc_ctg_cd = t1.calc_ctg_cd
			AND x.wg_cd = t1.wg_cd
			AND t1.ym BETWEEN i_ym_from AND i_ym_to
			AND (l_rate.DPT_CD IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_dpt_dpt w
						WHERE	0=0
						AND w.dpt_cd = t1.alc_dpt_cd
						)
				)
			AND l_rate.loc_cd IS NULL
			AND l_rate.oper_cd IS NULL
			AND (l_rate.bp_cd IS NULL OR l_rate.bp_cd = t1.cst_cd)
			AND (l_rate.ctg_cd IS NULL
					OR EXISTS (
						SELECT	'X'
						FROM	maw_ctg_itm w
						WHERE	0=0
						AND w.itm_cd = t1.itm_cd
						AND w.itm_sub1 = t1.itm_sub1
						AND w.itm_sub2 = t1.itm_sub2
						AND w.itm_sub3 = t1.itm_sub3
						)
				)
			AND (l_rate.itm_cd IS NULL OR l_rate.itm_cd = t1.itm_cd)
			AND (l_rate.itm_sub1 IS NULL OR l_rate.itm_sub1 = t1.itm_sub1)
			AND (l_rate.itm_sub2 IS NULL OR l_rate.itm_sub2 = t1.itm_sub2)
			AND (l_rate.itm_sub3 IS NULL OR l_rate.itm_sub3 = t1.itm_sub3)
			AND (l_rate.lot_no IS NULL OR l_rate.lot_no = t1.lot_no)
			AND (l_rate.sublot_no IS NULL OR l_rate.sublot_no = t1.sublot_no)
			AND (l_rate.sno1 IS NULL OR l_rate.sno1 = t1.sno1)
			AND (l_rate.sno2 IS NULL OR l_rate.sno2 = t1.sno2)
			AND (l_rate.sno3 IS NULL OR l_rate.sno3 = t1.sno3)
			AND (l_rate.sno4 IS NULL OR l_rate.sno4 = t1.sno4)
			AND (l_rate.trd_wg_cd IS NULL OR l_rate.trd_wg_cd = t1.wg_cd)
			AND l_rate.itm_mfg_inst_no IS NULL
			AND (l_rate.iv_no IS NULL OR l_rate.iv_no = t1.iv_no)
			AND l_rate.po_no IS NULL
			AND (l_rate.slo_no IS NULL OR l_rate.slo_no = t1.slo_no)
			;

			UPDATE mgpa_pre_rate$rate SET pre_alc_rate = COALESCE(l_val, 0) * l_rate.pre_alc_rate WHERE _index_ = t;
		END LOOP;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_rate$p_main(
	 IN i_sa_typ VARCHAR,
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_from TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	 IN i_wg_cd VARCHAR,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_pre_alc_rate_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	一次配賦比率作成メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_SA_TYP
		予実区分
<IN>	I_YM
		作成対象年月
<IN>	I_YM_FROM
		取得先年月ＦＲＯＭ
<IN>	I_YM_TO
		取得先年月ＴＯ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_PRE_ALC_RATE_CD
		一次配賦基準ＣＤ
<HISTORY>
**************************************************************************/
DECLARE

	c_alc_over CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_TYP', 'NON_OVER');
	c_alc_null CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_TYP', 'NON_NULL');
	c_alc_tgt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_TYP', 'TARGET');

	c_pln CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');
	c_act CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'ACT');
	c_wk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'WK');
	c_mfg_qty CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'MFG_QTY');
	c_mfg_amt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'MFG_AMT');
	c_purc_qty CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'PURC_QTY');
	c_purc_amt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'PURC_AMT');
	c_sls_qty CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'SLS_QTY');
	c_sls_amt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_SET_TYP', 'SLS_AMT');

	l_cnt NUMERIC;
	l_data_sa_typ mgt_arg.sa_typ%TYPE;
	l_key_sa_typ mgt_arg.sa_typ%TYPE;
	l_key_ym mam_term.term%TYPE;

	l_msg VARCHAR[];
	l_term mam_term.term%TYPE;
	l_co mam_co%ROWTYPE;
	l_cur mam_cur%ROWTYPE;
	l_alc_rate mam_pre_alc_rate%ROWTYPE;
	l_alc_ctg mam_pre_alc_ctg%ROWTYPE;
	l_ptn_rec mam_pre_alc_ptn%ROWTYPE;

	i INTEGER;
	x RECORD;
BEGIN
	BEGIN
		CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_rate$rate', 'mgt_pre_rate_mly', 'integer');

		CALL fcpa_batch_log$p_proc_log('MGBXD0018',
			i_sa_typ,
			fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()),
			i_wg_cd,
			i_calc_ctg_cd,
			i_pre_alc_rate_cd);

		l_co := mapa_co$f_get_co_rec();
		l_cur := mgpa_xchng$f_get_cur(l_co.base_cur_cd);

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mam_pre_alc_rate m
		WHERE	0=0
		AND m.pre_alc_rate_cd = i_pre_alc_rate_cd
		AND m.pre_alc_set_typ IS NOT NULL
		;

		IF l_cnt = 0 THEN
			l_msg := fcpa_err$msg_binder(i_pre_alc_rate_cd);
			CALL fcpa_err$raise_app_err('MGBGD0001', l_msg);
		END IF;

		SELECT	m.*
		INTO	STRICT l_alc_rate
		FROM	mam_pre_alc_rate m
		WHERE	0=0
		AND m.pre_alc_rate_cd = i_pre_alc_rate_cd
		;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mam_pre_alc_ptn m
		WHERE	0=0
		AND m.pre_alc_ptn_cd = l_alc_rate.pre_alc_ptn_cd
		;

		IF l_cnt = 0 THEN
			l_msg := fcpa_err$msg_binder(l_alc_rate.pre_alc_ptn_cd);
			CALL fcpa_err$raise_app_err('MGBXD0046', l_msg);
		END IF;

		SELECT	m.*
		INTO	STRICT l_ptn_rec
		FROM	mam_pre_alc_ptn m
		WHERE	0=0
		AND m.pre_alc_ptn_cd = l_alc_rate.pre_alc_ptn_cd
		;

		IF i_sa_typ = c_pln AND l_alc_rate.pln_mly_flg = '0' THEN
			l_msg := fcpa_err$msg_binder(i_pre_alc_rate_cd);
			CALL fcpa_err$raise_app_err('MGBGD0002', l_msg);
		END IF;
		IF i_sa_typ = c_act AND l_alc_rate.act_mly_flg = '0' THEN
			l_msg := fcpa_err$msg_binder(i_pre_alc_rate_cd);
			CALL fcpa_err$raise_app_err('MGBGD0003', l_msg);
		END IF;

		l_term := mapa_term$f_get_term(i_ym);
		BEGIN
			SELECT	m.*
			INTO	STRICT l_alc_ctg
			FROM	mam_pre_alc_ctg m
			WHERE	0=0
			AND m.term = l_term
			AND m.pre_alc_rate_cd = i_pre_alc_rate_cd
			AND m.calc_ctg_cd = i_calc_ctg_cd
			AND m.wg_cd = i_wg_cd
			;
		EXCEPTION
			WHEN no_data_found THEN
				l_msg := fcpa_err$msg_binder(
						fcpa_date_util$f_to_char(l_term, fcpa_date_util$y4m()),
						i_wg_cd,
						i_calc_ctg_cd,
						i_pre_alc_rate_cd
						);
				CALL fcpa_err$raise_app_err('MGBGD0004', l_msg);
		END;

		DELETE FROM mgw_calc_ctg_wg w;
		IF i_sa_typ = c_pln THEN
			l_data_sa_typ := COALESCE(l_alc_ctg.data_pln_sa_typ, i_sa_typ);
			l_key_sa_typ := COALESCE(l_alc_ctg.key_pln_sa_typ, i_sa_typ);
			l_key_ym := COALESCE(l_alc_ctg.key_pln_ym, l_term);
		ELSE
			l_data_sa_typ := COALESCE(l_alc_ctg.data_act_sa_typ, i_sa_typ);
			l_key_sa_typ := COALESCE(l_alc_ctg.key_act_sa_typ, i_sa_typ);
			l_key_ym := COALESCE(l_alc_ctg.key_act_ym, l_term);
		END IF;

		INSERT INTO mgw_calc_ctg_wg (calc_ctg_cd, wg_cd)
		SELECT	m.data_calc_ctg_cd, m.data_wg_cd
		FROM	mam_pre_rate_tgt m
		WHERE	0=0
		AND m.pre_alc_rate_cd = i_pre_alc_rate_cd
		AND m.calc_ctg_cd = i_calc_ctg_cd
		AND m.term = l_term
		AND m.sa_typ = i_sa_typ
		AND m.wg_cd = i_wg_cd
		;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgw_calc_ctg_wg w
		;

		IF l_cnt = 0 THEN
			INSERT INTO mgw_calc_ctg_wg (calc_ctg_cd, wg_cd) VALUES (i_calc_ctg_cd, i_wg_cd);
		END IF;

		i := 0;
		TRUNCATE TABLE mgpa_pre_rate$rate;
		FOR x IN
			select
				t.pre_alc_rate_cd,
				t.sa_typ,
				t.ym,
				t.calc_ctg_cd,
				t.wg_cd,
				t.dpt_cd,
				t.loc_cd,
				t.oper_cd,
				t.bp_cd,
				t.ctg_cd,
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
				t.itm_mfg_inst_no,
				t.iv_no,
				t.po_no,
				t.slo_no,
				t.alc_ac_cd,
				t.trd_wg_cd,
				t.pre_alc_rate,
				t.adj_flg,
				t.rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3
			FROM	mgt_pre_rate_mly t
			WHERE	0=0
			AND t.pre_alc_rate_cd = i_pre_alc_rate_cd
			AND t.sa_typ = l_key_sa_typ
			AND t.ym = l_key_ym
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.wg_cd = i_wg_cd
			FOR UPDATE NOWAIT
		LOOP
			IF x.dpt_cd IS NOT NULL AND COALESCE(l_ptn_rec.dpt_alc_typ, c_alc_over) != c_alc_tgt
			OR x.loc_cd IS NOT NULL AND COALESCE(l_ptn_rec.loc_alc_typ, c_alc_over) != c_alc_tgt
			OR x.oper_cd IS NOT NULL AND COALESCE(l_ptn_rec.oper_alc_typ, c_alc_over) != c_alc_tgt
			OR x.bp_cd IS NOT NULL AND COALESCE(l_ptn_rec.bp_alc_typ, c_alc_over) != c_alc_tgt
			OR x.ctg_cd IS NOT NULL AND COALESCE(l_ptn_rec.ctg_alc_typ, c_alc_over) != c_alc_tgt
			OR x.itm_cd IS NOT NULL AND COALESCE(l_ptn_rec.itm_alc_typ, c_alc_over) != c_alc_tgt
			OR x.lot_no IS NOT NULL AND COALESCE(l_ptn_rec.lot_alc_typ, c_alc_over) != c_alc_tgt
			OR x.sublot_no IS NOT NULL AND COALESCE(l_ptn_rec.sublot_alc_typ, c_alc_over) != c_alc_tgt
			OR x.sno1 IS NOT NULL AND COALESCE(l_ptn_rec.sno1_alc_typ, c_alc_over) != c_alc_tgt
			OR x.sno2 IS NOT NULL AND COALESCE(l_ptn_rec.sno2_alc_typ, c_alc_over) != c_alc_tgt
			OR x.sno3 IS NOT NULL AND COALESCE(l_ptn_rec.sno3_alc_typ, c_alc_over) != c_alc_tgt
			OR x.sno4 IS NOT NULL AND COALESCE(l_ptn_rec.sno4_alc_typ, c_alc_over) != c_alc_tgt
			OR x.itm_mfg_inst_no IS NOT NULL AND COALESCE(l_ptn_rec.inst_alc_typ, c_alc_over) != c_alc_tgt
			OR x.iv_no IS NOT NULL AND COALESCE(l_ptn_rec.iv_alc_typ, c_alc_over) != c_alc_tgt
			OR x.po_no IS NOT NULL AND COALESCE(l_ptn_rec.po_alc_typ, c_alc_over) != c_alc_tgt
			OR x.slo_no IS NOT NULL AND COALESCE(l_ptn_rec.slo_alc_typ, c_alc_over) != c_alc_tgt
			OR x.alc_ac_cd IS NOT NULL AND COALESCE(l_ptn_rec.alc_ac_alc_typ, c_alc_over) != c_alc_tgt
			OR x.trd_wg_cd IS NOT NULL AND COALESCE(l_ptn_rec.wg_alc_typ, c_alc_over) != c_alc_tgt
			THEN
				l_msg := fcpa_err$msg_binder(
						l_key_sa_typ,
						fcpa_date_util$f_to_char(l_key_ym, fcpa_date_util$y4m()),
						i_wg_cd,
						i_calc_ctg_cd,
						i_pre_alc_rate_cd
						);
				CALL fcpa_err$raise_app_err('MGBGD0007', l_msg);
			END IF;

			i := i + 1;
			INSERT INTO mgpa_pre_rate$rate (
				pre_alc_rate_cd,
				sa_typ,
				ym,
				calc_ctg_cd,
				wg_cd,
				dpt_cd,
				loc_cd,
				oper_cd,
				bp_cd,
				ctg_cd,
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
				itm_mfg_inst_no,
				iv_no,
				po_no,
				slo_no,
				alc_ac_cd,
				trd_wg_cd,
				pre_alc_rate,
				adj_flg,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3,
				_index_
				)
			VALUES (
				x.pre_alc_rate_cd,
				x.sa_typ,
				x.ym,
				x.calc_ctg_cd,
				x.wg_cd,
				x.dpt_cd,
				x.loc_cd,
				x.oper_cd,
				x.bp_cd,
				x.ctg_cd,
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
				x.itm_mfg_inst_no,
				x.iv_no,
				x.po_no,
				x.slo_no,
				x.alc_ac_cd,
				x.trd_wg_cd,
				x.pre_alc_rate,
				x.adj_flg,
				x.rmrks,
				x.sub_char1,
				x.sub_char2,
				x.sub_char3,
				i
				);
			UPDATE mgpa_pre_rate$rate SET ym = i_ym, sa_typ = i_sa_typ WHERE _index_ = i;
			IF l_alc_ctg.rate_coeff_flg = '0' THEN
				UPDATE mgpa_pre_rate$rate SET pre_alc_rate = 1 WHERE _index_ = i;
			END IF;
		END LOOP;

		IF i = 0 THEN
			l_msg := fcpa_err$msg_binder(
					l_key_sa_typ,
					fcpa_date_util$f_to_char(l_key_ym, fcpa_date_util$y4m()),
					i_wg_cd,
					i_calc_ctg_cd,
					i_pre_alc_rate_cd
					);
			CALL fcpa_err$raise_app_err('MGBGD0006', l_msg);
		END IF;
		/* キー情報に対する比率データを設定する */
		IF l_alc_rate.pre_alc_set_typ = c_wk THEN
			CALL mgpa_pre_rate$p_wk(l_data_sa_typ, i_ym_from, i_ym_to, i_wg_cd, i_calc_ctg_cd, l_term, l_alc_rate, i);

		ELSIF l_alc_rate.pre_alc_set_typ IN (c_mfg_qty, c_mfg_amt) THEN
			CALL mgpa_pre_rate$p_mfg(l_data_sa_typ, i_ym_from, i_ym_to, l_term, l_co, l_cur, l_alc_rate, i);

		ELSIF l_alc_rate.pre_alc_set_typ IN (c_purc_qty, c_purc_amt) THEN
			CALL mgpa_pre_rate$p_purc(l_data_sa_typ, i_ym_from, i_ym_to, l_term, l_co, l_cur, l_alc_rate, i);

		ELSIF l_alc_rate.pre_alc_set_typ IN (c_sls_qty, c_sls_amt) THEN
			CALL mgpa_pre_rate$p_sls(l_data_sa_typ, i_ym_from, i_ym_to, l_term, l_co, l_cur, l_alc_rate, i);

		END IF;

		DELETE FROM	mgt_pre_rate_mly t
		WHERE	0=0
		AND t.pre_alc_rate_cd = i_pre_alc_rate_cd
		AND t.sa_typ = i_sa_typ
		AND t.ym = i_ym
		AND t.calc_ctg_cd = i_calc_ctg_cd
		AND t.wg_cd = i_wg_cd
		;

		IF i > 0 THEN
			INSERT INTO mgt_pre_rate_mly (
				pre_alc_rate_cd,
				sa_typ,
				ym,
				calc_ctg_cd,
				wg_cd,
				dpt_cd,
				loc_cd,
				oper_cd,
				bp_cd,
				ctg_cd,
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
				itm_mfg_inst_no,
				iv_no,
				po_no,
				slo_no,
				alc_ac_cd,
				trd_wg_cd,
				pre_alc_rate,
				adj_flg,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
				)
			SELECT
				pre_alc_rate_cd,
				sa_typ,
				ym,
				calc_ctg_cd,
				wg_cd,
				dpt_cd,
				loc_cd,
				oper_cd,
				bp_cd,
				ctg_cd,
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
				itm_mfg_inst_no,
				iv_no,
				po_no,
				slo_no,
				alc_ac_cd,
				trd_wg_cd,
				pre_alc_rate,
				adj_flg,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
			FROM	mgpa_pre_rate$rate;
		END IF;

		CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_PRE_RATE.P_MAIN');

	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MGBXD0029');
	END;
	COMMIT;
END;
$BODY$
LANGUAGE plpgsql
;
