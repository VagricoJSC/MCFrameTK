CREATE OR REPLACE FUNCTION mgpa_pre_alc$cursor_ctg_list(
)
RETURNS TABLE (
	calc_ctg_cd	VARCHAR
)
AS
$BODY$
DECLARE
	x RECORD;
BEGIN
	FOR x IN
		SELECT	w.calc_ctg_cd
		FROM	mgw_calc_ctg w
		WHERE	0=0
		ORDER BY w.ctg_prio, w.calc_ctg_cd
	LOOP
		calc_ctg_cd := x.calc_ctg_cd;

		RETURN NEXT;
	END LOOP;

	RETURN;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_pre_alc$cursor_sel_list(
	 IN ci_wg_cd VARCHAR,
	 IN ci_alc_ac_cd VARCHAR,
	 IN ci_dpt_cd VARCHAR
)
RETURNS SETOF mgw_pre_alc_rate_sel
AS
$BODY$
DECLARE
	x RECORD;
BEGIN
	FOR x IN
		SELECT	m.*
		FROM	mgw_pre_alc_rate_sel m
		WHERE	0=0
		AND	m.wg_cd = ci_wg_cd
		AND	m.alc_ac_cd = ci_alc_ac_cd
		AND	m.dpt_cd = ci_dpt_cd
	LOOP
		RETURN NEXT x;
	END LOOP;

	RETURN;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_pre_alc$f_get_alc_rate_sel(
	 IN i_wg_cd VARCHAR,
	 IN i_alc_ac_cd VARCHAR,
	 IN i_dpt_cd VARCHAR)
RETURNS mgw_pre_alc_rate_sel
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる一次配賦基準選択マスタのレコードを返す
<REMARKS>
	対象となるレコードが存在しないときは一次配賦基準ＣＤに
	ＮＵＬＬ文字をセットしたレコードを返す
<ARGUMENTS>
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_ALC_AC_CD
		配賦科目ＣＤ
<IN>	I_DPT_CD
		部門ＣＤ
<RETURNVALUE>
	対象となるMAM_PRE_ALC_RATE_SELのレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');
	l_null_alc_ac CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');
	l_null_dpt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_alc_def	mgw_pre_alc_rate_sel%ROWTYPE;

	x1 RECORD;
	x2 RECORD;
	x3 RECORD;
	x4 RECORD;
BEGIN
	SELECT INTO l_alc_def * FROM mgpa_pre_alc$g_alc_def WHERE _index_ = 1;

	FOR x1 IN
		SELECT	w.*
		FROM	mgpa_pre_alc$cursor_sel_list(i_wg_cd, i_alc_ac_cd, i_dpt_cd) w
	LOOP
		RETURN x1;
	END LOOP;

	FOR x2 IN
		SELECT	w.*
		FROM	mgpa_pre_alc$cursor_sel_list(i_wg_cd, i_alc_ac_cd, l_null_dpt) w
	LOOP
		RETURN x2;
	END LOOP;

	FOR x3 IN
		SELECT	w.*
		FROM	mgpa_pre_alc$cursor_sel_list(i_wg_cd, l_null_alc_ac, i_dpt_cd) w
	LOOP
		RETURN x3;
	END LOOP;

	IF (SELECT COUNT(*) FROM mgpa_pre_alc$g_alc_def_rec WHERE _index_ = i_wg_cd) > 0 THEN
		SELECT INTO l_alc_def * FROM mgpa_pre_alc$g_alc_def_rec WHERE _index_ = i_wg_cd;
		RETURN l_alc_def;
	ELSE
		l_alc_def.pre_alc_rate_cd := NULL;

		FOR x4 IN
			SELECT	w.*
			FROM	mgpa_pre_alc$cursor_sel_list(i_wg_cd, l_null_alc_ac, l_null_dpt) w
		LOOP
			l_alc_def := x4;
		END LOOP;

		IF l_alc_def.pre_alc_rate_cd IS NULL THEN
			l_alc_def.pre_alc_rate_cd := c_null_val;
		END IF;
	END IF;

	INSERT INTO mgpa_pre_alc$g_alc_def (
		wg_cd,
		alc_ac_cd,
		dpt_cd,
		pre_alc_rate_cd,
		trd_alc_ac_cd,
		trd_wg_cd,
		pre_alc_dpt_ptn,
		fin_flg,
		_index_
		)
	VALUES (
		l_alc_def.wg_cd,
		l_alc_def.alc_ac_cd,
		l_alc_def.dpt_cd,
		l_alc_def.pre_alc_rate_cd,
		l_alc_def.trd_alc_ac_cd,
		l_alc_def.trd_wg_cd,
		l_alc_def.pre_alc_dpt_ptn,
		l_alc_def.fin_flg,
		1
		)
	ON CONFLICT (_index_)
	DO UPDATE SET
		wg_cd = l_alc_def.wg_cd,
		alc_ac_cd = l_alc_def.alc_ac_cd,
		dpt_cd = l_alc_def.dpt_cd,
		pre_alc_rate_cd = l_alc_def.pre_alc_rate_cd,
		trd_alc_ac_cd = l_alc_def.trd_alc_ac_cd,
		trd_wg_cd = l_alc_def.trd_wg_cd,
		pre_alc_dpt_ptn = l_alc_def.pre_alc_dpt_ptn,
		fin_flg = l_alc_def.fin_flg
	;

	INSERT INTO mgpa_pre_alc$g_alc_def_rec (
		wg_cd,
		alc_ac_cd,
		dpt_cd,
		pre_alc_rate_cd,
		trd_alc_ac_cd,
		trd_wg_cd,
		pre_alc_dpt_ptn,
		fin_flg,
		_index_
		)
	VALUES (
		l_alc_def.wg_cd,
		l_alc_def.alc_ac_cd,
		l_alc_def.dpt_cd,
		l_alc_def.pre_alc_rate_cd,
		l_alc_def.trd_alc_ac_cd,
		l_alc_def.trd_wg_cd,
		l_alc_def.pre_alc_dpt_ptn,
		l_alc_def.fin_flg,
		i_wg_cd
		)
	ON CONFLICT (_index_)
	DO UPDATE SET
		wg_cd = l_alc_def.wg_cd,
		alc_ac_cd = l_alc_def.alc_ac_cd,
		dpt_cd = l_alc_def.dpt_cd,
		pre_alc_rate_cd = l_alc_def.pre_alc_rate_cd,
		trd_alc_ac_cd = l_alc_def.trd_alc_ac_cd,
		trd_wg_cd = l_alc_def.trd_wg_cd,
		pre_alc_dpt_ptn = l_alc_def.pre_alc_dpt_ptn,
		fin_flg = l_alc_def.fin_flg
	;

	RETURN l_alc_def;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_set_work_itm_alc(
	 IN i_rec mgt_pln_alc_amt,
	 INOUT w1 INTEGER)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象データを品目配賦用ワークにセットする（計画）
<REMARKS>

<ARGUMENTS>
<IN>	I_REC
		配賦費用計画レコード
<INOUT>	W1
		ITM_ALCカウンタ
<HISTORY>
**************************************************************************/
BEGIN
	/* 品目配賦対象 */
	w1 := w1 + 1;
	INSERT INTO mgpa_pre_alc$itm_alc (
		calc_ctg_cd,
		alc_rec_typ,
		wg_cd,
		ym,
		alc_ac_cd,
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
		amt,
		_index_
		)
	VALUES (
		i_rec.calc_ctg_cd,
		i_rec.alc_rec_typ,
		i_rec.wg_cd,
		i_rec.ym,
		i_rec.alc_ac_cd,
		i_rec.dpt_cd,
		i_rec.loc_cd,
		i_rec.oper_cd,
		i_rec.bp_cd,
		i_rec.ctg_cd,
		i_rec.itm_cd,
		i_rec.itm_sub1,
		i_rec.itm_sub2,
		i_rec.itm_sub3,
		i_rec.lot_no,
		i_rec.sublot_no,
		i_rec.sno1,
		i_rec.sno2,
		i_rec.sno3,
		i_rec.sno4,
		NULL,
		NULL,
		NULL,
		NULL,
		i_rec.amt,
		w1
		);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_set_work_pre_alc(
	 IN i_rec mgt_pln_alc_amt,
	 IN i_arg mgt_arg,
	 INOUT w2 INTEGER)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象データを一次配賦用ワークにセットする（計画）
<REMARKS>

<ARGUMENTS>
<IN>	I_REC
		配賦費用計画レコード
<IN>	I_ARG
		MGT_ARGレコード
<INOUT>	W2
		PRE_ALCカウンタ
<HISTORY>
**************************************************************************/
BEGIN
	w2 := w2 + 1;
	INSERT INTO mgpa_pre_alc$pre_alc (
		calc_no,
		calc_grp_cd,
		alc_amt_key,
		wg_cd,
		ym,
		alc_ac_cd,
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
		amt,
		_index_
		)
	VALUES (
		i_arg.calc_no,
		i_arg.calc_grp_cd,
		i_rec.pln_alc_amt_key,
		i_rec.wg_cd,
		i_rec.ym,
		i_rec.alc_ac_cd,
		i_rec.dpt_cd,
		i_rec.loc_cd,
		i_rec.oper_cd,
		i_rec.bp_cd,
		i_rec.ctg_cd,
		i_rec.itm_cd,
		i_rec.itm_sub1,
		i_rec.itm_sub2,
		i_rec.itm_sub3,
		i_rec.lot_no,
		i_rec.sublot_no,
		i_rec.sno1,
		i_rec.sno2,
		i_rec.sno3,
		i_rec.sno4,
		NULL,
		NULL,
		NULL,
		NULL,
		i_rec.amt,
		w2
		);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_set_work_itm_alc(
	 IN i_rec mgt_act_alc_amt,
	 INOUT w1 INTEGER)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象データを品目配賦用ワークにセットする（実績）
<REMARKS>

<ARGUMENTS>
<IN>	I_REC
		配賦費用実績レコード
<INOUT>	W1
		ITM_ALCカウンタ
<HISTORY>
**************************************************************************/
BEGIN
	/* 品目配賦対象 */
	w1 := w1 + 1;
	INSERT INTO mgpa_pre_alc$itm_alc (
		calc_ctg_cd,
		alc_rec_typ,
		wg_cd,
		ym,
		alc_ac_cd,
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
		amt,
		_index_
		)
	VALUES (
		i_rec.calc_ctg_cd,
		i_rec.alc_rec_typ,
		i_rec.wg_cd,
		i_rec.ym,
		i_rec.alc_ac_cd,
		i_rec.dpt_cd,
		i_rec.loc_cd,
		i_rec.oper_cd,
		i_rec.bp_cd,
		i_rec.ctg_cd,
		i_rec.itm_cd,
		i_rec.itm_sub1,
		i_rec.itm_sub2,
		i_rec.itm_sub3,
		i_rec.lot_no,
		i_rec.sublot_no,
		i_rec.sno1,
		i_rec.sno2,
		i_rec.sno3,
		i_rec.sno4,
		i_rec.itm_mfg_inst_no,
		i_rec.iv_no,
		i_rec.po_no,
		i_rec.slo_no,
		i_rec.amt,
		w1
		);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_set_work_pre_alc(
	 IN i_rec mgt_act_alc_amt,
	 IN i_arg mgt_arg,
	 INOUT w2 INTEGER)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象データを一次配賦用ワークにセットする（実績）
<REMARKS>

<ARGUMENTS>
<IN>	I_REC
		配賦費用実績レコード
<IN>	I_ARG
		MGT_ARGレコード
<INOUT>	W2
		PRE_ALCカウンタ
<HISTORY>
**************************************************************************/
BEGIN
	w2 := w2 + 1;
	INSERT INTO mgpa_pre_alc$pre_alc (
		calc_no,
		calc_grp_cd,
		alc_amt_key,
		wg_cd,
		ym,
		alc_ac_cd,
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
		amt,
		_index_
		)
	VALUES (
		i_arg.calc_no,
		i_arg.calc_grp_cd,
		i_rec.act_alc_amt_key,
		i_rec.wg_cd,
		i_rec.ym,
		i_rec.alc_ac_cd,
		i_rec.dpt_cd,
		i_rec.loc_cd,
		i_rec.oper_cd,
		i_rec.bp_cd,
		i_rec.ctg_cd,
		i_rec.itm_cd,
		i_rec.itm_sub1,
		i_rec.itm_sub2,
		i_rec.itm_sub3,
		i_rec.lot_no,
		i_rec.sublot_no,
		i_rec.sno1,
		i_rec.sno2,
		i_rec.sno3,
		i_rec.sno4,
		i_rec.itm_mfg_inst_no,
		i_rec.iv_no,
		i_rec.po_no,
		i_rec.slo_no,
		i_rec.amt,
		w2
		);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_set_input_amt(
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_arg mgt_arg,
	 IN i_not_amt_flg CHAR,
	 INOUT w1 INTEGER,
	 INOUT w2 INTEGER)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	計算対象となる一次配賦計算用及び品目配賦用の費用データを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_ARG
		MGT_ARGレコード
<IN>	I_NOT_AMT_FLG
		G_NOT_AMT_FLGグローバル変数
<INOUT>	W1
		ITM_ALCカウンタ
<INOUT>	W2
		PRE_ALCカウンタ
<HISTORY>
**************************************************************************/
DECLARE
	c_pln	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');
	c_act	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'ACT');
	c_pre_alc_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_CALC_TYP', 'NON');
	c_pre_alc_calc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_CALC_TYP', 'CALC');
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	c_my_wg CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_ALC_REC_TYP', 'MY_WG');
	c_carry CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_ALC_REC_TYP', 'CARRY');

	l_sel_rec mgw_pre_alc_rate_sel%ROWTYPE;
	l_cnt NUMERIC;

	x1 mgt_pln_alc_amt%ROWTYPE;
	x2 mgt_act_alc_amt%ROWTYPE;
BEGIN
	IF i_arg.sa_typ = c_pln AND i_arg.pre_alc_calc_typ = c_pre_alc_calc THEN
		FOR x1 IN
			SELECT	t.*
			FROM	mgt_pln_alc_amt t
			WHERE	0=0
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
			AND t.alc_rec_typ != c_my_wg
			AND (
				t.wg_cd = i_arg.runtime_wg_cd
				OR EXISTS (
					SELECT	'X'
					FROM	mam_grp_wg m
					WHERE	0=0
					AND m.calc_grp_cd = i_arg.calc_grp_cd
					AND m.wg_cd = t.wg_cd
					)
				)
		LOOP
			<<NEXT_LOOP1>>
			BEGIN
				x1.wg_cd := COALESCE(i_arg.runtime_wg_cd, x1.wg_cd);

				IF x1.trd_wg_cd IS NOT NULL
				AND x1.trd_calc_grp_cd IS NOT NULL
				AND x1.trd_calc_no IS NOT NULL
				AND x1.alc_rec_typ != c_carry THEN
					SELECT	COUNT(*)
					INTO	STRICT l_cnt
					FROM	mam_grp_wg w
					WHERE	0=0
					AND w.calc_grp_cd = i_arg.calc_grp_cd
					AND w.wg_cd = x1.trd_wg_cd;

					IF l_cnt > 0 THEN
						EXIT NEXT_LOOP1;
					END IF;
				END IF;

				l_sel_rec := mgpa_pre_alc$f_get_alc_rate_sel(x1.wg_cd, x1.alc_ac_cd, x1.dpt_cd);
				IF l_sel_rec.pre_alc_rate_cd != c_null_val THEN
					CALL mgpa_pre_alc$p_set_work_pre_alc(x1, i_arg, w2);
				ELSIF i_not_amt_flg = '0' THEN
					CALL mgpa_pre_alc$p_set_work_itm_alc(x1, w1);
				END IF;
			END;
		END LOOP;
	ELSIF i_arg.sa_typ = c_pln AND i_arg.pre_alc_calc_typ = c_pre_alc_non AND i_not_amt_flg = '0' THEN

		FOR x1 IN
			SELECT	t.*
			FROM	mgt_pln_alc_amt t
			WHERE	0=0
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
			AND t.pre_alc_fin_flg = '0'
			AND (
				t.wg_cd = i_arg.runtime_wg_cd
				OR EXISTS (
					SELECT	'X'
					FROM	mam_grp_wg m
					WHERE	0=0
					AND m.calc_grp_cd = i_arg.CALC_GRP_CD
					AND m.wg_cd = t.wg_cd
					)
				)
		LOOP
			x1.wg_cd := COALESCE(i_arg.runtime_wg_cd, x1.wg_cd);

			IF x1.alc_rec_typ = c_my_wg THEN
				CALL mgpa_pre_alc$p_set_work_itm_alc(x1, w1);
			ELSE
				l_sel_rec := mgpa_pre_alc$f_get_alc_rate_sel(x1.wg_cd, x1.alc_ac_cd, x1.dpt_cd);
				IF l_sel_rec.pre_alc_rate_cd = c_null_val THEN
					CALL mgpa_pre_alc$p_set_work_itm_alc(x1, w1);
				END IF;
			END IF;
		END LOOP;
	ELSIF i_arg.sa_typ = c_act AND i_arg.pre_alc_calc_typ = c_pre_alc_calc THEN
		FOR x2 IN
			SELECT	t.*
			FROM	mgt_act_alc_amt t
			WHERE	0=0
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
			AND t.alc_rec_typ != c_my_wg
			AND (
				t.wg_cd = i_arg.runtime_wg_cd
				OR EXISTS (
					SELECT	'X'
					FROM	mam_grp_wg m
					WHERE	0=0
					AND m.calc_grp_cd = i_arg.calc_grp_cd
					AND m.wg_cd = t.wg_cd
					)
				)
		LOOP
			<<NEXT_LOOP3>>
			BEGIN
				x2.wg_cd := COALESCE(i_arg.runtime_wg_cd, x2.wg_cd);

				IF x2.trd_wg_cd IS NOT NULL
				AND x2.trd_calc_grp_cd IS NOT NULL
				AND x2.trd_calc_no IS NOT NULL
				AND x2.alc_rec_typ != c_carry THEN
					SELECT	COUNT(*)
					INTO	STRICT l_cnt
					FROM	mam_grp_wg w
					WHERE	0=0
					AND w.calc_grp_cd = i_arg.calc_grp_cd
					AND w.wg_cd = x2.trd_wg_cd;

					IF l_cnt > 0 THEN
						EXIT NEXT_LOOP3;
					END IF;
				END IF;

				l_sel_rec := mgpa_pre_alc$f_get_alc_rate_sel(x2.wg_cd, x2.alc_ac_cd, x2.dpt_cd);

				IF l_sel_rec.pre_alc_rate_cd != c_null_val THEN
					CALL mgpa_pre_alc$p_set_work_pre_alc(x2, i_arg, w2);
				ELSIF i_not_amt_flg = '0' THEN
					CALL mgpa_pre_alc$p_set_work_itm_alc(x2, w1);
				END IF;
			END;
		END LOOP;
	ELSIF i_arg.sa_typ = c_act AND i_arg.pre_alc_calc_typ = c_pre_alc_non AND i_not_amt_flg = '0' THEN
		FOR x2 IN
			SELECT	t.*
			FROM	mgt_act_alc_amt t
			WHERE	0=0
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
			AND t.pre_alc_fin_flg = '0'
			AND (
				t.wg_cd = i_arg.runtime_wg_cd
				OR EXISTS (
					SELECT	'X'
					FROM	mam_grp_wg m
					WHERE	0=0
					AND m.calc_grp_cd = i_arg.calc_grp_cd
					AND m.wg_cd = t.wg_cd
					)
				)
		LOOP
			x2.wg_cd := COALESCE(i_arg.runtime_wg_cd, x2.wg_cd);

			IF x2.alc_rec_typ = c_my_wg THEN
				CALL mgpa_pre_alc$p_set_work_itm_alc(x2, w1);
			ELSE
				l_sel_rec := mgpa_pre_alc$f_get_alc_rate_sel(x2.wg_cd, x2.alc_ac_cd, x2.dpt_cd);

				IF l_sel_rec.pre_alc_rate_cd = c_null_val THEN
					CALL mgpa_pre_alc$p_set_work_itm_alc(x2, w1);
				END IF;
			END IF;
		END LOOP;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_set_input_data(
	 IN i_arg mgt_arg)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	一次配賦計算用入力データの作成処理
<REMARKS>
	一次配賦・品目配賦の費用データを計算対象テーブルに出力する
	一次配賦基準選択マスタを参照して品目配賦のデータを作成するため
	一次配賦計算を行わないときでも処理を行う必要がある
<ARGUMENTS>
<IN>	I_ARG
		原価計算設定情報レコード
<HISTORY>
**************************************************************************/
DECLARE
	c_pln	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');
	c_act	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'ACT');
	c_pre_alc_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_CALC_TYP', 'NON');
	c_inpt_alc_amt	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_INPT_ALC_TYP', 'ALC_AMT');
	c_alc_month	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ALC_CALC_TYP', 'MONTH_ALC');
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_arg		mgt_arg%ROWTYPE;
	l_not_amt_flg	CHAR(1);

	w1		INTEGER;
	w2		INTEGER;

	l_cnt NUMERIC;

	sql$rowcount BIGINT;

	l1 RECORD;
	l2 RECORD;
	l3 RECORD;
	l4 RECORD;

	c_alc_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ALC_CALC_TYP', 'NON');
	c_cost_std	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'COST_STD');
	c_cost_other	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'OTHER');
	c_pre_alc_rate_sel	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'PRE_ALC_RATE_SEL');
	c_pre_rate_term	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'PRE_RATE_TERM');
	c_pre_rate_mly	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'PRE_RATE_MLY');
	c_alc_amt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ALC_AMT');
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$itm_alc', 'mgw_alc_amt', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$pre_alc', 'mgt_calc_pre_alc_amt', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$g_alc_def', 'mgw_pre_alc_rate_sel', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$g_alc_def_rec', 'mgw_pre_alc_rate_sel', 'varchar');

	<<SKIP_RATE_SEL>>
	BEGIN
		UPDATE mgpa_pre_alc$g_alc_def SET pre_alc_rate_cd = NULL WHERE _index_ = 1;
		TRUNCATE TABLE mgpa_pre_alc$itm_alc;
		TRUNCATE TABLE mgpa_pre_alc$pre_alc;
		TRUNCATE TABLE mgpa_pre_alc$g_alc_def_rec;
		w1 := 0;
		w2 := 0;

		l_arg := i_arg;

		IF l_arg.alc_calc_typ = c_alc_non AND
			l_arg.cost_calc_typ IN (c_cost_std, c_cost_other)
		THEN
			l_not_amt_flg := '1';
		ELSE
			l_not_amt_flg := '0';
		END IF;

		IF l_arg.pre_alc_calc_typ = c_pre_alc_non
		AND l_not_amt_flg = '1' THEN
			EXIT SKIP_RATE_SEL;
		END IF;

		l_cnt := 0;
		DELETE FROM	mgw_pre_alc_rate_sel;
		CALL mgpa_calc_ctg$p_set_work(l_arg.calc_grp_cd, c_pre_alc_rate_sel);

		FOR l1 IN
			SELECT	w.*
			FROM	mgpa_pre_alc$cursor_ctg_list() w
		LOOP
			INSERT INTO mgw_pre_alc_rate_sel (
				wg_cd,
				alc_ac_cd,
				dpt_cd,
				pre_alc_rate_cd,
				trd_alc_ac_cd,
				trd_wg_cd,
				pre_alc_dpt_ptn,
				fin_flg
				)
			SELECT
				m.wg_cd,
				COALESCE(m.alc_ac_cd, c_null_val),
				COALESCE(m.dpt_cd, c_null_val),
				m.pre_alc_rate_cd,
				m.trd_alc_ac_cd,
				m.trd_wg_cd,
				m.pre_alc_dpt_ptn,
				m.fin_flg
			FROM	mam_pre_alc_rate_sel m
			WHERE	0=0
			AND m.term = l_arg.term
			AND m.calc_ctg_cd = l1.calc_ctg_cd
			AND (
				m.wg_cd = l_arg.runtime_wg_cd
				OR
				l_arg.runtime_wg_cd IS NULL
					AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg m2
						WHERE	0=0
						AND m2.calc_grp_cd = l_arg.calc_grp_cd
						AND m2.wg_cd = m.wg_cd
						)
				)
			AND NOT EXISTS (
					SELECT	'X'
					FROM	mgw_pre_alc_rate_sel w
					WHERE	0=0
					AND w.wg_cd = m.wg_cd
					AND w.alc_ac_cd = COALESCE(m.alc_ac_cd, c_null_val)
					AND w.dpt_cd = COALESCE(m.dpt_cd, c_null_val)
				);
			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
		END LOOP;

		CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGW_PRE_ALC_RATE_SEL', l_cnt::VARCHAR);

		/*** 部門・配賦科目がＮＵＬＬのレコードは終了ＦＬＧをＯＮとする ***/
		UPDATE mgw_pre_alc_rate_sel w
		SET fin_flg = '1'
		WHERE	0=0
		AND w.alc_ac_cd = c_null_val
		AND w.dpt_cd = c_null_val;
	END;

	<<SKIP_PRE_RATE>>
	BEGIN
		IF l_arg.pre_alc_calc_typ = c_pre_alc_non THEN
			EXIT SKIP_PRE_RATE;
		END IF;

		l_cnt := 0;
		DELETE FROM	mgw_pre_rate_term;
		CALL mgpa_calc_ctg$p_set_work(l_arg.calc_grp_cd, c_pre_rate_term);

		FOR l2 IN
			SELECT	w.*
			FROM	mgpa_pre_alc$cursor_ctg_list() w
		LOOP
			INSERT INTO mgw_pre_rate_term (
				pre_alc_rate_cd, wg_cd,
				dpt_cd, loc_cd, oper_cd, bp_cd,
				ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				itm_mfg_inst_no, iv_no, po_no, slo_no,
				alc_ac_cd, trd_wg_cd,
				pre_alc_rate,
				adj_flg
				)
			SELECT	t.pre_alc_rate_cd, t.wg_cd,
				t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
				t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
				t.alc_ac_cd, t.trd_wg_cd,
				t.pre_alc_rate,
				t.adj_flg
			FROM	mgt_pre_rate_term t, mam_pre_alc_rate m
			WHERE	0=0
			AND t.term = l_arg.term
			AND t.calc_ctg_cd = l2.calc_ctg_cd
			AND t.pre_alc_rate_cd = m.pre_alc_rate_cd
			AND (m.pln_mly_flg = '0' OR m.act_mly_flg = '0')
			AND (
				t.wg_cd = l_arg.runtime_wg_cd
				OR
				l_arg.runtime_wg_cd IS NULL
					AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg m2
						WHERE	0=0
						AND m2.calc_grp_cd = l_arg.CALC_GRP_CD
						AND m2.wg_cd = t.wg_cd
					)
				)
			AND NOT EXISTS (
					SELECT	'X'
					FROM	mgw_pre_rate_term w
					WHERE	0=0
					AND w.pre_alc_rate_cd = t.pre_alc_rate_cd
					AND w.wg_cd = t.wg_cd
				);
			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
		END LOOP;
		CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGW_PRE_RATE_TERM', l_cnt::VARCHAR);

		l_cnt := 0;
		DELETE FROM	mgw_pre_rate_mly;
		CALL mgpa_calc_ctg$p_set_work(l_arg.calc_grp_cd, c_pre_rate_mly);

		FOR l3 IN
			SELECT	w.*
			FROM	mgpa_pre_alc$cursor_ctg_list() w
		LOOP
			INSERT INTO mgw_pre_rate_mly (
				pre_alc_rate_cd, ym, wg_cd,
				dpt_cd, loc_cd, oper_cd, bp_cd,
				ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				itm_mfg_inst_no, iv_no, po_no, slo_no,
				alc_ac_cd, trd_wg_cd,
				pre_alc_rate,
				adj_flg
				)
			SELECT	t.pre_alc_rate_cd, t.ym, t.wg_cd,
				t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
				t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
				t.alc_ac_cd, t.trd_wg_cd,
				t.pre_alc_rate,
				t.adj_flg
			FROM	mgt_pre_rate_mly t, mam_pre_alc_rate m
			WHERE	0=0
			AND t.ym BETWEEN l_arg.st_ym AND l_arg.end_ym
			AND t.calc_ctg_cd = l3.calc_ctg_cd
			AND t.pre_alc_rate_cd = m.pre_alc_rate_cd
			AND (
				l_arg.sa_typ = c_pln AND m.pln_mly_flg = '1' AND t.sa_typ = c_pln
				OR
				l_arg.sa_typ = c_act AND m.act_mly_flg = '1' AND m.pln_rule_flg = '0' AND t.sa_typ = c_act
				OR
				l_arg.SA_TYP = c_act AND m.act_mly_flg = '0' AND m.pln_rule_flg = '1' AND t.sa_typ = c_pln
				)
			AND (
				t.wg_cd = l_arg.runtime_wg_cd
				OR
				l_arg.runtime_wg_cd IS NULL
					AND EXISTS (
						SELECT 'X'
						FROM	mam_grp_wg m2
						WHERE	0=0
						AND m2.calc_grp_cd = l_arg.calc_grp_cd
						AND m2.wg_cd = t.wg_cd
						)
				)
			AND NOT EXISTS (
					SELECT	'X'
					FROM	mgw_pre_rate_mly w
					WHERE	0=0
					AND w.pre_alc_rate_cd = t.pre_alc_rate_cd
					AND w.ym = t.ym
					AND w.wg_cd = t.wg_cd
				);
			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
		END LOOP;
		CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGW_PRE_RATE_MLY', l_cnt::VARCHAR);
	END;

	CALL mgpa_calc_ctg$p_set_work(l_arg.calc_grp_cd, c_alc_amt);

	FOR l4 IN
		SELECT	w.*
		FROM	mgpa_pre_alc$cursor_ctg_list() w
	LOOP
		CALL mgpa_pre_alc$p_set_input_amt(l4.calc_ctg_cd, l_arg, l_not_amt_flg, w1, w2);
	END LOOP;

	DELETE FROM	mgw_alc_amt;
	DELETE FROM	mgt_calc_alc_amt t WHERE t.calc_no = l_arg.calc_no AND t.calc_grp_cd = l_arg.calc_grp_cd;

	IF w1 > 0 THEN
		INSERT INTO mgw_alc_amt (
			calc_ctg_cd,
			alc_rec_typ,
			wg_cd,
			ym,
			alc_ac_cd,
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
			amt
			)
		SELECT
			calc_ctg_cd,
			alc_rec_typ,
			wg_cd,
			ym,
			alc_ac_cd,
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
			amt
		FROM
			mgpa_pre_alc$itm_alc
		ORDER BY _index_ ASC;
		TRUNCATE TABLE mgpa_pre_alc$itm_alc;
		w1 := 0;

		INSERT INTO mgt_calc_alc_amt (
			calc_no, calc_grp_cd,
			inpt_alc_typ, wg_cd,
			ym,
			alc_ac_cd,
			dpt_cd, loc_cd, oper_cd, bp_cd,
			ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
			lot_no, sublot_no, sno1, sno2, sno3, sno4,
			itm_mfg_inst_no, iv_no, po_no, slo_no,
			amt
			)
		SELECT
			l_arg.calc_no, l_arg.calc_grp_cd,
			c_inpt_alc_amt, COALESCE(l_arg.runtime_wg_cd, w.wg_cd),
			CASE l_arg.alc_calc_typ
				WHEN c_alc_month THEN w.ym
				ELSE l_arg.end_ym END,
			w.alc_ac_cd,
			w.dpt_cd, w.loc_cd, w.oper_cd, w.bp_cd,
			w.ctg_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
			w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
			w.itm_mfg_inst_no, w.iv_no, w.po_no, w.slo_no,
			SUM(w.amt)
		FROM	mgw_alc_amt w
		WHERE	0=0
		GROUP BY COALESCE(l_arg.runtime_wg_cd, w.wg_cd),
			CASE l_arg.ALC_CALC_TYP
				WHEN c_alc_month THEN w.ym
				ELSE l_arg.end_ym END,
			w.alc_ac_cd,
			w.dpt_cd, w.loc_cd, w.oper_cd, w.bp_cd,
			w.ctg_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
			w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
			w.itm_mfg_inst_no, w.iv_no, w.po_no, w.slo_no;
		GET DIAGNOSTICS l_cnt = ROW_COUNT;
		CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ALC_AMT', l_cnt::VARCHAR);
	END IF;

	DELETE FROM mgt_calc_pre_alc_amt t WHERE t.calc_no = l_arg.calc_no AND t.calc_grp_cd = l_arg.calc_grp_cd;
	IF w2 > 0 THEN
		INSERT INTO mgt_calc_pre_alc_amt (
			calc_no,
			calc_grp_cd,
			alc_amt_key,
			wg_cd,
			ym,
			alc_ac_cd,
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
			amt
			)
		SELECT
			calc_no,
			calc_grp_cd,
			alc_amt_key,
			wg_cd,
			ym,
			alc_ac_cd,
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
			amt
		FROM
			mgpa_pre_alc$pre_alc
		ORDER BY _index_ ASC;

		l_cnt := w2;
		TRUNCATE TABLE mgpa_pre_alc$pre_alc;
		w2 := 0;

		CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_PRE_ALC_AMT', l_cnt::VARCHAR);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_pre_alc$f_get_pre_alc_rate(
	 IN i_pre_alc_rate_cd VARCHAR)
RETURNS mam_pre_alc_rate
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる一次配賦基準マスタのレコードを返す
<REMARKS>

<ARGUMENTS>
<IN>	I_PRE_ALC_RATE_CD
		一次配賦基準ＣＤ
<RETURNVALUE>
	対象となるMAM_PRE_ALC_RATEのレコード
<HISTORY>
**************************************************************************/
DECLARE
	l_rate_mst mam_pre_alc_rate%ROWTYPE;
	l_msg		VARCHAR[];
	x RECORD;
BEGIN
	IF (SELECT COUNT(*) FROM mgpa_pre_alc$rate_mst WHERE _index_ = i_pre_alc_rate_cd) > 0 THEN
		SELECT INTO l_rate_mst * FROM mgpa_pre_alc$rate_mst WHERE _index_ = i_pre_alc_rate_cd;
		RETURN l_rate_mst;
	ELSE
		FOR x IN
			SELECT	m.*
			FROM	mam_pre_alc_rate m
			WHERE	0=0
			AND m.pre_alc_rate_cd = i_pre_alc_rate_cd
		LOOP
			INSERT INTO mgpa_pre_alc$rate_mst (
				pre_alc_rate_cd,
				pre_alc_rate_nm,
				base_pre_alc_rate_nm,
				pre_alc_ptn_cd,
				pln_mly_flg,
				act_mly_flg,
				pln_rule_flg,
				pre_alc_set_typ,
				memo1,
				memo2,
				memo3,
				del_flg,
				del_usr_id,
				del_usr_nm,
				del_ts,
				ins_usr_id,
				ins_usr_nm,
				ins_ts,
				ins_func_id,
				upd_cntr,
				upd_usr_id,
				upd_usr_nm,
				upd_ts,
				upd_func_id,
				upd_srv_req_no,
				_index_
				)
			VALUES (
				x.pre_alc_rate_cd,
				x.pre_alc_rate_nm,
				x.base_pre_alc_rate_nm,
				x.pre_alc_ptn_cd,
				x.pln_mly_flg,
				x.act_mly_flg,
				x.pln_rule_flg,
				x.pre_alc_set_typ,
				x.memo1,
				x.memo2,
				x.memo3,
				x.del_flg,
				x.del_usr_id,
				x.del_usr_nm,
				x.del_ts,
				x.ins_usr_id,
				x.ins_usr_nm,
				x.ins_ts,
				x.ins_func_id,
				x.upd_cntr,
				x.upd_usr_id,
				x.upd_usr_nm,
				x.upd_ts,
				x.upd_func_id,
				x.upd_srv_req_no,
				i_pre_alc_rate_cd
				);
			RETURN x;
		END LOOP;
	END IF;
	
	l_msg := fcpa_err$msg_binder(i_pre_alc_rate_cd);
	CALL fcpa_err$raise_app_err('MGBXD0045', l_msg);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_pre_alc$f_get_pre_alc_ptn(
	 IN i_pre_alc_ptn_cd VARCHAR)
RETURNS mam_pre_alc_ptn
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる一次配賦パタンマスタのレコードを返す
<REMARKS>

<ARGUMENTS>
<IN>	I_PRE_ALC_PTN_CD
		一次配賦パタンＣＤ
<RETURNVALUE>
	対象となるMAM_PRE_ALC_PTNのレコード
<HISTORY>
**************************************************************************/
DECLARE
	l_ptn_mst mam_pre_alc_ptn%ROWTYPE;
	l_msg		VARCHAR[];
	x RECORD;
BEGIN
	IF (SELECT COUNT(*) FROM mgpa_pre_alc$ptn_mst WHERE _index_ = i_pre_alc_ptn_cd) > 0 THEN
		SELECT INTO l_ptn_mst * FROM mgpa_pre_alc$ptn_mst WHERE _index_ = i_pre_alc_ptn_cd;
		RETURN l_ptn_mst;
	ELSE
		FOR x IN
			SELECT	m.*
			FROM	mam_pre_alc_ptn m
			WHERE	0=0
			AND m.pre_alc_ptn_cd = i_pre_alc_ptn_cd
		LOOP
			INSERT INTO mgpa_pre_alc$ptn_mst (
				pre_alc_ptn_cd,
				pre_alc_ptn_nm,
				base_pre_alc_ptn_nm,
				dpt_alc_typ,
				loc_alc_typ,
				oper_alc_typ,
				bp_alc_typ,
				ctg_alc_typ,
				itm_alc_typ,
				lot_alc_typ,
				sublot_alc_typ,
				sno1_alc_typ,
				sno2_alc_typ,
				sno3_alc_typ,
				sno4_alc_typ,
				inst_alc_typ,
				iv_alc_typ,
				po_alc_typ,
				slo_alc_typ,
				alc_ac_alc_typ,
				wg_alc_typ,
				memo1,
				memo2,
				memo3,
				del_flg,
				del_usr_id,
				del_usr_nm,
				del_ts,
				ins_usr_id,
				ins_usr_nm,
				ins_ts,
				ins_func_id,
				upd_cntr,
				upd_usr_id,
				upd_usr_nm,
				upd_ts,
				upd_func_id,
				upd_srv_req_no,
				_index_
				)
			VALUES (
				x.pre_alc_ptn_cd,
				x.pre_alc_ptn_nm,
				x.base_pre_alc_ptn_nm,
				x.dpt_alc_typ,
				x.loc_alc_typ,
				x.oper_alc_typ,
				x.bp_alc_typ,
				x.ctg_alc_typ,
				x.itm_alc_typ,
				x.lot_alc_typ,
				x.sublot_alc_typ,
				x.sno1_alc_typ,
				x.sno2_alc_typ,
				x.sno3_alc_typ,
				x.sno4_alc_typ,
				x.inst_alc_typ,
				x.iv_alc_typ,
				x.po_alc_typ,
				x.slo_alc_typ,
				x.alc_ac_alc_typ,
				x.wg_alc_typ,
				x.memo1,
				x.memo2,
				x.memo3,
				x.del_flg,
				x.del_usr_id,
				x.del_usr_nm,
				x.del_ts,
				x.ins_usr_id,
				x.ins_usr_nm,
				x.ins_ts,
				x.ins_func_id,
				x.upd_cntr,
				x.upd_usr_id,
				x.upd_usr_nm,
				x.upd_ts,
				x.upd_func_id,
				x.upd_srv_req_no,
				i_pre_alc_ptn_cd
				);
			RETURN x;
		END LOOP;
	END IF;
	
	l_msg := fcpa_err$msg_binder(i_pre_alc_ptn_cd);
	CALL fcpa_err$raise_app_err('MGBXD0046', l_msg);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_ins_pre_alc_path(
	 IN i_no_chk CHARACTER)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	MGT_PRE_ALC_PATHにレコードを作成する
<REMARKS>
<IN>	I_NO_CHK
		チェックなしＦＬＧ
<ARGUMENTS>

<HISTORY>
**************************************************************************/
DECLARE
	l_rate_mst mam_pre_alc_rate%ROWTYPE;
	l_msg		VARCHAR[];

	l_max_rec CONSTANT INTEGER := 5000;
	l_cnt INTEGER;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM mgpa_pre_alc$alc_tgt;

	IF l_cnt = 0 THEN
		RETURN;
	END IF;

	IF i_no_chk = '1' OR l_cnt > l_max_rec THEN
		INSERT INTO mgt_pre_alc_path (
			calc_no,
			calc_grp_cd,
			pre_alc_seq,
			ym,
			inpt_alc_typ,
			wg_cd,
			alc_ac_cd,
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
			amt,
			pre_alc_rate,
			pre_alc_total,
			pre_alc_calc_rate,
			pre_alc_rate_cd,
			src_wg_cd,
			src_pre_alc_seq,
			top_pre_alc_seq,
			pre_alc_lvl,
			fin_flg,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no
			)
		SELECT
			calc_no,
			calc_grp_cd,
			pre_alc_seq,
			ym,
			inpt_alc_typ,
			wg_cd,
			alc_ac_cd,
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
			amt,
			pre_alc_rate,
			pre_alc_total,
			pre_alc_calc_rate,
			pre_alc_rate_cd,
			src_wg_cd,
			src_pre_alc_seq,
			top_pre_alc_seq,
			pre_alc_lvl,
			fin_flg,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no
		FROM
			mgpa_pre_alc$alc_tgt
		ORDER BY _index_ ASC;

		TRUNCATE TABLE mgpa_pre_alc$alc_tgt;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_calc_pre_alc(
	 IN i_alc_rec mgt_pre_alc_path,
	 IN i_arg mgt_arg,
	 IN i_co_parm mam_co_parm,
	 IN i_loop_err CHAR,
	 IN i_lvl_sum CHAR,
	 INOUT o_seq NUMERIC)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	一次配賦計算処理
<REMARKS>

<ARGUMENTS>
<IN>	I_ALC_REC
		MGT_PRE_ALC_PATHレコード
<IN>	I_ARG
		MGT_ARGレコード
<IN>	I_CO_PARM
		MAM_CO_PARMレコード
<IN>	I_LOOP_ERR
		G_LOOP_ERRグローバル変数
<IN>	I_LVL_SUM
		G_LVL_SUMグローバル変数
<INOUT>	O_SEQ
		カウンタ
<HISTORY>
**************************************************************************/
DECLARE
	c_pln	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');
	c_act	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'ACT');
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_msg		VARCHAR[];

	c_alc_over CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_TYP', 'NON_OVER');
	c_alc_null CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_TYP', 'NON_NULL');
	c_alc_tgt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_TYP', 'TARGET');

	l_sel_rec mgw_pre_alc_rate_sel%ROWTYPE;
	l_rate_rec mam_pre_alc_rate%ROWTYPE;
	l_ptn_rec mam_pre_alc_ptn%ROWTYPE;

	l_amt mgt_pre_alc_path.amt%TYPE;
	l_total mgt_pre_alc_path.pre_alc_total%TYPE;
	l_calc_rate mgt_pre_alc_path.pre_alc_calc_rate%TYPE;

	cur_rate CURSOR (
		ci_pre_alc_rate_cd VARCHAR,
		ci_ym TIMESTAMP WITHOUT TIME ZONE,
		ci_wg_cd VARCHAR)
	FOR
		SELECT	t.*
		FROM	(
			SELECT	w.dpt_cd, w.loc_cd, w.oper_cd, w.bp_cd,
				w.ctg_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.itm_mfg_inst_no, w.iv_no, w.po_no, w.slo_no,
				w.alc_ac_cd,
				w.trd_wg_cd,
				w.pre_alc_rate,
				w.adj_flg
			FROM	mgw_pre_rate_term w
			WHERE	0=0
			AND w.pre_alc_rate_cd = ci_pre_alc_rate_cd
			AND w.wg_cd = ci_wg_cd
			AND w.pre_alc_rate != 0
			AND ci_ym IS NULL
			UNION ALL
			SELECT	w.dpt_cd, w.loc_cd, w.oper_cd, w.bp_cd,
				w.ctg_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.itm_mfg_inst_no, w.iv_no, w.po_no, w.slo_no,
				w.alc_ac_cd,
				w.trd_wg_cd,
				w.pre_alc_rate,
				w.adj_flg
			FROM	mgw_pre_rate_mly w
			WHERE	0=0
			AND w.pre_alc_rate_cd = ci_pre_alc_rate_cd
			AND w.pre_alc_rate != 0
			AND w.ym = ci_ym
			AND w.wg_cd = ci_wg_cd
			AND ci_ym IS NOT NULL
			) t
		WHERE	0=0
		ORDER BY t.ADJ_FLG, t.PRE_ALC_RATE,
			t.DPT_CD, t.LOC_CD, t.OPER_CD, t.BP_CD,
			t.CTG_CD, t.ITM_CD, t.ITM_SUB1, t.ITM_SUB2, t.ITM_SUB3,
			t.LOT_NO, t.SUBLOT_NO, t.SNO1, t.SNO2, t.SNO3, t.SNO4,
			t.ITM_MFG_INST_NO, t.IV_NO, t.PO_NO, t.SLO_NO,
			t.ALC_AC_CD,
			t.TRD_WG_CD;

	j INTEGER;
	k INTEGER;

	x RECORD;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mgpa_pre_alc$p_calc_pre_alc$alc_dpt_mst', 'character', 'varchar');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$p_calc_pre_alc$rate', 'mgw_pre_rate_term', 'integer');

	l_sel_rec := mgpa_pre_alc$f_get_alc_rate_sel(i_alc_rec.wg_cd, i_alc_rec.alc_ac_cd, i_alc_rec.dpt_cd);

	IF l_sel_rec.pre_alc_rate_cd = c_null_val THEN
		IF i_alc_rec.pre_alc_lvl = 0 THEN
			l_msg := fcpa_err$msg_binder(i_alc_rec.wg_cd, i_alc_rec.dpt_cd, i_alc_rec.alc_ac_cd);
			CALL fcpa_err$raise_app_err('MGBDD0003', l_msg);
		END IF;

		UPDATE mgt_pre_alc_path t
		SET fin_flg = '1'
		WHERE	0=0
		AND t.calc_no = i_alc_rec.calc_no
		AND t.calc_grp_cd = i_alc_rec.calc_grp_cd
		AND t.pre_alc_seq = i_alc_rec.pre_alc_seq;

		IF i_lvl_sum = '1' THEN
			UPDATE mgt_pre_alc_path t
			SET fin_flg = '1'
			WHERE	0=0
			AND t.calc_no = i_alc_rec.calc_no
			AND t.calc_grp_cd = i_alc_rec.calc_grp_cd
			AND t.ym = i_alc_rec.ym
			AND t.wg_cd = i_alc_rec.wg_cd
			AND t.alc_ac_cd = i_alc_rec.alc_ac_cd
			AND COALESCE(t.dpt_cd, c_null_val) = COALESCE(i_alc_rec.dpt_cd, c_null_val)
			AND COALESCE(t.loc_cd, c_null_val) = COALESCE(i_alc_rec.loc_cd, c_null_val)
			AND COALESCE(t.oper_cd, c_null_val) = COALESCE(i_alc_rec.oper_cd, c_null_val)
			AND COALESCE(t.bp_cd, c_null_val) = COALESCE(i_alc_rec.bp_cd, c_null_val)
			AND COALESCE(t.ctg_cd, c_null_val) = COALESCE(i_alc_rec.ctg_cd, c_null_val)
			AND COALESCE(t.itm_cd, c_null_val) = COALESCE(i_alc_rec.itm_cd, c_null_val)
			AND COALESCE(t.itm_sub1, c_null_val) = COALESCE(i_alc_rec.itm_sub1, c_null_val)
			AND COALESCE(t.itm_sub2, c_null_val) = COALESCE(i_alc_rec.itm_sub2, c_null_val)
			AND COALESCE(t.itm_sub3, c_null_val) = COALESCE(i_alc_rec.itm_sub3, c_null_val)
			AND COALESCE(t.lot_no, c_null_val) = COALESCE(i_alc_rec.lot_no, c_null_val)
			AND COALESCE(t.sublot_no, c_null_val) = COALESCE(i_alc_rec.sublot_no, c_null_val)
			AND COALESCE(t.sno1, c_null_val) = COALESCE(i_alc_rec.sno1, c_null_val)
			AND COALESCE(t.sno2, c_null_val) = COALESCE(i_alc_rec.sno2, c_null_val)
			AND COALESCE(t.sno3, c_null_val) = COALESCE(i_alc_rec.sno3, c_null_val)
			AND COALESCE(t.sno4, c_null_val) = COALESCE(i_alc_rec.sno4, c_null_val)
			AND COALESCE(t.itm_mfg_inst_no, c_null_val) = COALESCE(i_alc_rec.itm_mfg_inst_no, c_null_val)
			AND COALESCE(t.iv_no, c_null_val) = COALESCE(i_alc_rec.iv_no, c_null_val)
			AND COALESCE(t.po_no, c_null_val) = COALESCE(i_alc_rec.po_no, c_null_val)
			AND COALESCE(t.slo_no, c_null_val) = COALESCE(i_alc_rec.slo_no, c_null_val)
			AND t.src_wg_cd = i_alc_rec.src_wg_cd
			AND t.pre_alc_lvl = i_alc_rec.pre_alc_lvl
			AND t.fin_flg = '0';
		END IF;

		RETURN;
	END IF;

	l_rate_rec := mgpa_pre_alc$f_get_pre_alc_rate(l_sel_rec.pre_alc_rate_cd);

	l_ptn_rec := mgpa_pre_alc$f_get_pre_alc_ptn(l_rate_rec.pre_alc_ptn_cd);

	/*** 配賦先部門の取得 ***/
	TRUNCATE TABLE mgpa_pre_alc$p_calc_pre_alc$alc_dpt_mst;

	IF l_sel_rec.pre_alc_dpt_ptn IS NOT NULL AND i_alc_rec.dpt_cd IS NOT NULL THEN
		FOR x IN
			SELECT	m.dst_dpt_cd
			FROM	mam_pre_alc_dpt m
			WHERE	0=0
			AND m.pre_alc_dpt_ptn = l_sel_rec.pre_alc_dpt_ptn
			AND m.src_dpt_cd = i_alc_rec.dpt_cd
			AND m.term = i_arg.term
		LOOP
			INSERT INTO mgpa_pre_alc$p_calc_pre_alc$alc_dpt_mst (
				_elem_,
				_index_
				)
			VALUES (
				'1',
				x.dst_dpt_cd
				);
		END LOOP;
	END IF;

	/*** 配賦比率の取得 ***/
	TRUNCATE TABLE mgpa_pre_alc$p_calc_pre_alc$rate;

	l_total := 0;
	k := 0;

	IF i_arg.sa_typ = c_pln AND l_rate_rec.pln_mly_flg = '0'
	OR i_arg.sa_typ = c_act AND l_rate_rec.act_mly_flg = '0' AND l_rate_rec.pln_rule_flg = '0'
	THEN
		/* 期間比率から取得 */
		FOR x IN
			cur_rate (l_rate_rec.pre_alc_rate_cd, NULL, i_alc_rec.wg_cd)
		LOOP
			IF (SELECT COUNT(*) FROM mgpa_pre_alc$p_calc_pre_alc$alc_dpt_mst) = 0
			OR (SELECT COUNT(*) FROM mgpa_pre_alc$p_calc_pre_alc$alc_dpt_mst WHERE _index_ = x.dpt_cd) > 0 THEN
				k := k + 1;
				INSERT INTO mgpa_pre_alc$p_calc_pre_alc$rate (
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
					_index_
					)
				VALUES (
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
					k
					);
				l_total := l_total + x.pre_alc_rate;
			END IF;
		END LOOP;

		IF k = 0 OR l_total = 0 THEN
			l_msg := fcpa_err$msg_binder(
					fcpa_date_util$f_to_char(i_arg.term, fcpa_date_util$y4m()),
					l_rate_rec.pre_alc_rate_cd,
					i_alc_rec.wg_cd,
					i_alc_rec.dpt_cd,
					l_sel_rec.pre_alc_dpt_ptn
				);
			IF k = 0 THEN
				CALL fcpa_err$raise_app_err('MGBDD0004', l_msg);
			ELSE
				CALL fcpa_err$raise_app_err('MGBDD0005', l_msg);
			END IF;
		END IF;
	ELSE
		/* 月次比率から取得 */
		FOR x IN
			cur_rate (l_rate_rec.pre_alc_rate_cd, i_alc_rec.ym, i_alc_rec.wg_cd)
		LOOP
			IF (SELECT COUNT(*) FROM mgpa_pre_alc$p_calc_pre_alc$alc_dpt_mst) = 0
			OR (SELECT COUNT(*) FROM mgpa_pre_alc$p_calc_pre_alc$alc_dpt_mst WHERE _index_ = x.dpt_cd) > 0 THEN
				k := k + 1;
				INSERT INTO mgpa_pre_alc$p_calc_pre_alc$rate (
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
					_index_
					)
				VALUES (
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
					k
					);
				l_total := l_total + x.pre_alc_rate;
			END IF;
		END LOOP;

		IF k = 0 OR l_total = 0 THEN
			l_msg := fcpa_err$msg_binder(
					fcpa_date_util$f_to_char(i_alc_rec.ym, fcpa_date_util$y4m()),
					l_rate_rec.pre_alc_rate_cd,
					i_alc_rec.wg_cd,
					i_alc_rec.dpt_cd,
					l_sel_rec.pre_alc_dpt_ptn
				);
			IF k = 0 THEN
				CALL fcpa_err$raise_app_err('MGBDD0006', l_msg);
			ELSE
				CALL fcpa_err$raise_app_err('MGBDD0007', l_msg);
			END IF;
		END IF;
	END IF;
	TRUNCATE TABLE mgpa_pre_alc$p_calc_pre_alc$alc_dpt_mst;

	/*** 配賦元レコードに配賦関連の情報を設定 ***/
	l_amt := i_alc_rec.amt;
	l_calc_rate := l_amt / l_total;

	UPDATE mgt_pre_alc_path t
	SET pre_alc_rate_cd = l_rate_rec.pre_alc_rate_cd,
		pre_alc_total = l_total,
		pre_alc_calc_rate = l_calc_rate
	WHERE	0=0
	AND t.calc_no = i_alc_rec.calc_no
	AND t.calc_grp_cd = i_alc_rec.calc_grp_cd
	AND t.pre_alc_seq = i_alc_rec.pre_alc_seq;

	/*** 配賦処理 ***/
	SELECT	COUNT(*)
	INTO	STRICT j
	FROM	mgpa_pre_alc$alc_tgt;

	FOR i IN 1..k LOOP
		j := j + 1;
		o_seq := o_seq + 1;

		INSERT INTO mgpa_pre_alc$alc_tgt (
			calc_no,
			calc_grp_cd,
			pre_alc_seq,
			ym,
			src_wg_cd,
			src_pre_alc_seq,
			top_pre_alc_seq,
			pre_alc_lvl,
			fin_flg,
			_index_
			)
		VALUES (
			i_arg.calc_no,
			i_arg.calc_grp_cd,
			o_seq,
			i_alc_rec.ym,
			i_alc_rec.src_wg_cd,
			i_alc_rec.pre_alc_seq,
			i_alc_rec.top_pre_alc_seq,
			i_alc_rec.pre_alc_lvl + 1,
			l_sel_rec.fin_flg,
			j
			);

		CASE l_ptn_rec.wg_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET wg_cd = COALESCE(l_sel_rec.trd_wg_cd, i_alc_rec.wg_cd) WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET wg_cd = COALESCE(
					(SELECT trd_wg_cd FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i),
					COALESCE(l_sel_rec.trd_wg_cd, i_alc_rec.wg_cd)
					)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET wg_cd = COALESCE(l_sel_rec.trd_wg_cd, i_alc_rec.wg_cd) WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.alc_ac_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET alc_ac_cd = COALESCE(l_sel_rec.trd_alc_ac_cd, i_alc_rec.alc_ac_cd) WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET alc_ac_cd = COALESCE(
					(SELECT alc_ac_cd FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i),
					COALESCE(l_sel_rec.trd_alc_ac_cd, i_alc_rec.alc_ac_cd)
					)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET alc_ac_cd = COALESCE(l_sel_rec.trd_alc_ac_cd, i_alc_rec.alc_ac_cd) WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.dpt_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET dpt_cd = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET dpt_cd = (SELECT dpt_cd FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET dpt_cd = i_alc_rec.dpt_cd WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.loc_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET loc_cd = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET loc_cd = (SELECT loc_cd FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET loc_cd = i_alc_rec.loc_cd WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.oper_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET oper_cd = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET oper_cd = (SELECT oper_cd FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET oper_cd = i_alc_rec.oper_cd WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.bp_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET bp_cd = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET bp_cd = (SELECT bp_cd FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET bp_cd = i_alc_rec.bp_cd WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.ctg_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET ctg_cd = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET ctg_cd = (SELECT ctg_cd FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET ctg_cd = i_alc_rec.ctg_cd WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.itm_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt
				SET
					itm_cd = NULL,
					itm_sub1 = NULL,
					itm_sub2 = NULL,
					itm_sub3 = NULL
				WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt
				SET
					itm_cd = w.itm_cd,
					itm_sub1 = w.itm_sub1,
					itm_sub2 = w.itm_sub2,
					itm_sub3 = w.itm_sub3
				FROM (SELECT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i) w
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt
				SET
					itm_cd = i_alc_rec.itm_cd,
					itm_sub1 = i_alc_rec.itm_sub1,
					itm_sub2 = i_alc_rec.itm_sub2,
					itm_sub3 = i_alc_rec.itm_sub3
				WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.lot_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET lot_no = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET lot_no = (SELECT lot_no FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET lot_no = i_alc_rec.lot_no WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.sublot_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sublot_no = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sublot_no = (SELECT sublot_no FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET sublot_no = i_alc_rec.sublot_no WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.sno1_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sno1 = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sno1 = (SELECT sno1 FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET sno1 = i_alc_rec.sno1 WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.sno2_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sno2 = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sno2 = (SELECT sno2 FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET sno2 = i_alc_rec.sno2 WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.sno3_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sno3 = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sno3 = (SELECT sno3 FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET sno3 = i_alc_rec.sno3 WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.sno4_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sno4 = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET sno4 = (SELECT sno4 FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET sno4 = i_alc_rec.sno4 WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.inst_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET itm_mfg_inst_no = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET itm_mfg_inst_no = (SELECT itm_mfg_inst_no FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET itm_mfg_inst_no = i_alc_rec.itm_mfg_inst_no WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.iv_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET iv_no = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET iv_no = (SELECT iv_no FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET iv_no = i_alc_rec.iv_no WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.po_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET po_no = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET po_no = (SELECT po_no FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET po_no = i_alc_rec.po_no WHERE _index_ = j;
		END CASE;

		CASE l_ptn_rec.slo_alc_typ
			WHEN c_alc_null THEN
				UPDATE mgpa_pre_alc$alc_tgt SET slo_no = NULL WHERE _index_ = j;
			WHEN c_alc_tgt THEN
				UPDATE mgpa_pre_alc$alc_tgt SET slo_no = (SELECT slo_no FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
				WHERE _index_ = j;
			ELSE
				UPDATE mgpa_pre_alc$alc_tgt SET slo_no = i_alc_rec.slo_no WHERE _index_ = j;
		END CASE;

		UPDATE mgpa_pre_alc$alc_tgt SET pre_alc_rate = (SELECT pre_alc_rate FROM mgpa_pre_alc$p_calc_pre_alc$rate WHERE _index_ = i)
		WHERE _index_ = j;

		IF (SELECT pre_alc_lvl FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j) = i_co_parm.pre_alc_max_lvl THEN
			UPDATE mgpa_pre_alc$alc_tgt SET fin_flg = '1' WHERE _index_ = j;
		END IF;

		IF i = k THEN
			UPDATE mgpa_pre_alc$alc_tgt SET amt = l_amt WHERE _index_ = j;
		ELSE
			UPDATE mgpa_pre_alc$alc_tgt
			SET amt = mapa_calc$f_rnd(l_calc_rate * (SELECT pre_alc_rate FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), i_co_parm.amt_dec_place, i_co_parm.amt_rnd_typ)
			WHERE _index_ = j;
			l_amt := l_amt - (SELECT amt FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j);
		END IF;

		IF i_loop_err = '1' AND (SELECT fin_flg FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j) = '0' THEN
			FOR x IN
				WITH RECURSIVE t1 (
					calc_no,
					calc_grp_cd,
					pre_alc_seq,
					ym,
					inpt_alc_typ,
					wg_cd,
					alc_ac_cd,
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
					amt,
					pre_alc_rate,
					pre_alc_total,
					pre_alc_calc_rate,
					pre_alc_rate_cd,
					src_wg_cd,
					src_pre_alc_seq,
					top_pre_alc_seq,
					pre_alc_lvl,
					fin_flg,
					ins_usr_id,
					ins_usr_nm,
					ins_ts,
					ins_func_id,
					upd_cntr,
					upd_usr_id,
					upd_usr_nm,
					upd_ts,
					upd_func_id,
					upd_srv_req_no
				) AS
				(
					SELECT	t.*
					FROM	mgt_pre_alc_path t
					WHERE	0=0
					AND t.calc_no = i_arg.calc_no
					AND t.calc_grp_cd = i_arg.calc_grp_cd
					AND t.pre_alc_seq = (SELECT src_pre_alc_seq FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j)
					UNION ALL
					SELECT	t.*
					FROM	mgt_pre_alc_path t, t1
					WHERE	0=0
					AND t1.src_pre_alc_seq = t.pre_alc_seq
					AND t1.calc_no = i_arg.calc_no
					AND t1.calc_grp_cd = i_arg.calc_grp_cd
				)
				SELECT
					calc_no,
					calc_grp_cd,
					pre_alc_seq,
					ym,
					inpt_alc_typ,
					wg_cd,
					alc_ac_cd,
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
					amt,
					pre_alc_rate,
					pre_alc_total,
					pre_alc_calc_rate,
					pre_alc_rate_cd,
					src_wg_cd,
					src_pre_alc_seq,
					top_pre_alc_seq,
					pre_alc_lvl,
					fin_flg,
					ins_usr_id,
					ins_usr_nm,
					ins_ts,
					ins_func_id,
					upd_cntr,
					upd_usr_id,
					upd_usr_nm,
					upd_ts,
					upd_func_id,
					upd_srv_req_no
				FROM	t1
			LOOP
				IF x.wg_cd = (SELECT wg_cd FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j)
				AND x.alc_ac_cd = (SELECT alc_ac_cd FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j)
				AND COALESCE(x.dpt_cd, c_null_val) = COALESCE((SELECT dpt_cd FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.loc_cd, c_null_val) = COALESCE((SELECT loc_cd FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.oper_cd, c_null_val) = COALESCE((SELECT oper_cd FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.bp_cd, c_null_val) = COALESCE((SELECT bp_cd FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.ctg_cd, c_null_val) = COALESCE((SELECT ctg_cd FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.itm_cd, c_null_val) = COALESCE((SELECT itm_cd FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.itm_sub1, c_null_val) = COALESCE((SELECT itm_sub1 FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.itm_sub2, c_null_val) = COALESCE((SELECT itm_sub2 FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.itm_sub3, c_null_val) = COALESCE((SELECT itm_sub3 FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.lot_no, c_null_val) = COALESCE((SELECT lot_no FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.sublot_no, c_null_val) = COALESCE((SELECT sublot_no FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.sno1, c_null_val) = COALESCE((SELECT sno1 FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.sno2, c_null_val) = COALESCE((SELECT sno2 FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.sno3, c_null_val) = COALESCE((SELECT sno3 FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.sno4, c_null_val) = COALESCE((SELECT sno4 FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.itm_mfg_inst_no, c_null_val) = COALESCE((SELECT itm_mfg_inst_no FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.iv_no, c_null_val) = COALESCE((SELECT iv_no FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.po_no, c_null_val) = COALESCE((SELECT po_no FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				AND COALESCE(x.slo_no, c_null_val) = COALESCE((SELECT slo_no FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j), c_null_val)
				THEN
					o_seq := l_loop_err_num;
					l_msg := fcpa_err$msg_binder(
						(SELECT top_pre_alc_seq FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j)::VARCHAR,
						x.pre_alc_seq::VARCHAR,
						(SELECT pre_alc_seq FROM mgpa_pre_alc$alc_tgt WHERE _index_ = j)::VARCHAR
						);
					RETURN;
				END IF;
			END LOOP;
		END IF;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_pre_alc$p_main(
	 IN i_arg mgt_arg)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	一次配賦計算のメイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_ARG
		原価計算設定情報レコード
<HISTORY>
**************************************************************************/
DECLARE
	c_pre_alc_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_CALC_TYP', 'NON');
	c_alc_month	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ALC_CALC_TYP', 'MONTH_ALC');
	c_inpt_alc_amt	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_INPT_ALC_TYP', 'ALC_AMT');
	c_inpt_pre_alc	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_INPT_ALC_TYP', 'PRE_ALC');
	c_inpt_so_alc	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_INPT_ALC_TYP', 'SO_ALC');
	c_loop_err_num	CONSTANT NUMERIC := -1;

	l_msg		VARCHAR[];
	l_log_no	fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;

	l_arg		mgt_arg%ROWTYPE;
	l_co_parm	mam_co_parm%ROWTYPE;

	l_max_lvl_err	CHAR(1);
	l_max_rec_err	CHAR(1);
	l_loop_err	CHAR(1);
	l_lvl_sum	CHAR(1);

	c_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP', 'STK_OUT');

	c_amt_add_alc CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_AMT_ADD_TYP', 'ALC');

	l_lvl mam_co_parm.pre_alc_max_lvl%TYPE;

	l_rec_cnt NUMERIC;
	l_cnt NUMERIC;

	i INTEGER;

	z RECORD;
	x RECORD;

	sql$rowcount BIGINT;

	l_alc_rec mgt_pre_alc_path%ROWTYPE;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$rate_mst', 'mam_pre_alc_rate', 'varchar');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$ptn_mst', 'mam_pre_alc_ptn', 'varchar');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$alc_tgt', 'mgt_pre_alc_path', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$g_alc_def', 'mgw_pre_alc_rate_sel', 'integer');
	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$g_alc_def_rec', 'mgw_pre_alc_rate_sel', 'varchar');

	CALL fcpa_postgres_util$type_is_table_row('mgpa_pre_alc$p_main$alc_rec', 'mgt_pre_alc_path', 'integer');

	<<PROC_FIN>>
	BEGIN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_PRE_ALC.P_MAIN');

		l_arg := i_arg;

		IF l_arg.pre_alc_calc_typ = c_pre_alc_non THEN
			EXIT PROC_FIN;
		END IF;

		l_co_parm := mgpa_co_parm$f_get_rec();
		IF l_co_parm.pre_alc_max_lvl IS NULL THEN
			l_co_parm.pre_alc_max_lvl := 10;
		END IF;

		IF l_co_parm.pre_alc_max_rec IS NULL THEN
			l_co_parm.pre_alc_max_rec := 10000;
		END IF;

		l_max_lvl_err := '0';
		l_max_rec_err := '0';
		l_loop_err := '0';
		l_lvl_sum := '0';

		FOR z IN
			SELECT	t.parm_key, t.parm_val
			FROM	mgt_calc_parm t
			WHERE	0=0
			AND t.calc_grp_cd = l_arg.calc_grp_cd
			AND t.calc_no = l_arg.calc_no
			AND t.parm_key LIKE 'PRE%'
		LOOP
			IF z.parm_key = 'PRE_MAX_LVL' AND z.parm_val IS NOT NULL THEN
				l_co_parm.pre_alc_max_lvl := z.parm_val::NUMERIC;
			END IF;

			IF z.parm_key = 'PRE_MAX_REC' AND z.parm_val IS NOT NULL THEN
				l_co_parm.pre_alc_max_rec := z.parm_val::NUMERIC;
			END IF;

			IF z.parm_key = 'PRE_MAX_LVL_ERR' AND z.parm_val = '1' THEN
				l_max_lvl_err := z.parm_val;
			END IF;

			IF z.parm_key = 'PRE_MAX_REC_ERR' AND z.parm_val = '1' THEN
				l_max_rec_err := z.parm_val;
			END IF;

			IF z.parm_key = 'PRE_LOOP_ERR' AND z.parm_val = '1' THEN
				l_loop_err := z.parm_val;
			END IF;

			IF z.parm_key = 'PRE_LVL_SUM' AND z.parm_val = '1' THEN
				l_lvl_sum := z.parm_val;
			END IF;
		END LOOP;

		DELETE FROM	mgt_pre_alc_path t
		WHERE t.calc_no = l_arg.calc_no
		AND t.calc_grp_cd = l_arg.calc_grp_cd;

		INSERT INTO mgt_pre_alc_path (
			calc_no, calc_grp_cd,
			ym, inpt_alc_typ,
			wg_cd, alc_ac_cd,
			dpt_cd, loc_cd, oper_cd, bp_cd,
			ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
			lot_no, sublot_no, sno1, sno2, sno3, sno4,
			itm_mfg_inst_no, iv_no, po_no, slo_no,
			amt,
			src_wg_cd,
			pre_alc_seq,
			src_pre_alc_seq,
			top_pre_alc_seq,
			pre_alc_lvl
			)
		SELECT
			l_arg.calc_no, l_arg.calc_grp_cd,
			t.ym, t.inpt_alc_typ, t.wg_cd, t.alc_ac_cd,
			t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
			t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
			t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
			t.amt,
			t.wg_cd,
			row_number() OVER (ORDER BY NULL),
			NULL::NUMERIC,
			row_number() OVER (ORDER BY NULL),
			0
		FROM	(
			SELECT	w.*
			FROM	(
				SELECT
					c_inpt_alc_amt AS inpt_alc_typ,
					t1.ym, t1.wg_cd, t1.alc_ac_cd,
					t1.dpt_cd, t1.loc_cd, t1.oper_cd, t1.bp_cd,
					t1.ctg_cd, t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.itm_mfg_inst_no, t1.iv_no, t1.po_no, t1.slo_no,
					SUM(t1.amt) AS amt
				FROM	mgt_calc_pre_alc_amt t1
				WHERE	0=0
				AND t1.calc_no = l_arg.calc_no
				AND t1.calc_grp_cd = l_arg.calc_grp_cd
				AND t1.amt != 0
				GROUP BY t1.ym, t1.wg_cd, t1.alc_ac_cd,
					t1.dpt_cd, t1.loc_cd, t1.oper_cd, t1.bp_cd,
					t1.ctg_cd, t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.itm_mfg_inst_no, t1.iv_no, t1.po_no, t1.slo_no
				UNION ALL
				SELECT
					c_inpt_so_alc AS inpt_alc_typ,
					t1.ym,
					t1.alc_wg_cd AS wg_cd,
					t1.alc_ac_cd AS alc_ac_cd,
					t1.alc_dpt_cd AS dpt_cd,
					t1.alc_loc_cd AS loc_cd,
					t1.alc_oper_cd AS oper_cd,
					t1.alc_bp_cd AS bp_cd,
					t1.alc_ctg_cd AS ctg_cd,
					t1.alc_itm_cd AS itm_cd,
					t1.alc_itm_sub1 AS itm_sub1,
					t1.alc_itm_sub2 AS itm_sub2,
					t1.alc_itm_sub3 AS itm_sub3,
					t1.alc_lot_no AS lot_no,
					t1.alc_sublot_no AS sublot_no,
					t1.alc_sno1 AS sno1,
					t1.alc_sno2 AS sno2,
					t1.alc_sno3 AS sno3,
					t1.alc_sno4 AS sno4,
					t1.alc_itm_mfg_inst_no AS itm_mfg_inst_no,
					NULL AS iv_no,
					NULL AS po_no,
					NULL AS slo_no,
					SUM(t2.amt) AS amt
				FROM	mgt_calc_io t1, mgt_calc_io_expns_amt t2
				WHERE	0=0
				AND t1.calc_no = l_arg.calc_no
				AND t1.calc_grp_cd = l_arg.calc_grp_cd
				AND t1.alc_ac_cd IS NOT NULL
				AND t1.alc_amt_flg = '1'
				AND t1.cost_io_typ = c_io_stk_out
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.itm_cd = t2.itm_cd
				AND t1.itm_sub1 = t2.itm_sub1
				AND t1.itm_sub2 = t2.itm_sub2
				AND t1.itm_sub3 = t2.itm_sub3
				AND t1.wg_cd = t2.wg_cd
				AND t1.act_io_id = t2.act_io_id
				AND t1.act_io_id_sub = t2.act_io_id_sub
				AND t2.amt_add_typ = c_amt_add_alc
				AND l_arg.calc_exec_cnt > 1
				GROUP BY t1.ym, t1.alc_wg_cd, t1.alc_ac_cd,
					t1.alc_dpt_cd, t1.alc_loc_cd, t1.alc_oper_cd,
					t1.alc_bp_cd, t1.alc_ctg_cd, t1.alc_itm_cd,
					t1.alc_itm_sub1, t1.alc_itm_sub2, t1.alc_itm_sub3,
					t1.alc_lot_no, t1.alc_sublot_no, t1.alc_sno1, t1.alc_sno2, t1.alc_sno3, t1.alc_sno4,
					t1.alc_itm_mfg_inst_no
				) w
			WHERE	0=0
			ORDER BY w.ym, w.inpt_alc_typ,
				w.wg_cd, w.alc_ac_cd,
				w.dpt_cd, w.loc_cd, w.oper_cd, w.bp_cd,
				w.ctg_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.itm_mfg_inst_no, w.iv_no, w.po_no, w.slo_no
			) t
		WHERE	0=0;

		SELECT	COUNT(*)
		INTO	STRICT l_rec_cnt
		FROM	mgt_pre_alc_path t
		WHERE	0=0
		AND t.calc_no = l_arg.calc_no
		AND t.calc_grp_cd = l_arg.calc_grp_cd;

		IF l_rec_cnt > l_co_parm.pre_alc_max_rec THEN
			TRUNCATE TABLE mgpa_pre_alc$rate_mst;
			TRUNCATE TABLE mgpa_pre_alc$ptn_mst;
			TRUNCATE TABLE mgpa_pre_alc$p_main$alc_rec;
			TRUNCATE TABLE mgpa_pre_alc$alc_tgt;
			IF l_max_rec_err = '1' THEN
				COMMIT;
			END IF;

			l_msg := fcpa_err$msg_binder(l_rec_cnt::VARCHAR, l_co_parm.pre_alc_max_rec::VARCHAR);
			CALL fcpa_err$raise_app_err('MGBDD0001', l_msg);
		END IF;

		TRUNCATE TABLE mgpa_pre_alc$rate_mst;
		TRUNCATE TABLE mgpa_pre_alc$ptn_mst;
		TRUNCATE TABLE mgpa_pre_alc$p_main$alc_rec;
		TRUNCATE TABLE mgpa_pre_alc$alc_tgt;

		l_lvl := 0;
		i := 0;
		WHILE l_lvl < l_co_parm.pre_alc_max_lvl LOOP
			IF l_lvl_sum = '1' THEN
				FOR x IN
					SELECT	t.ym,
						t.wg_cd, t.alc_ac_cd,
						t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
						t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
						t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
						t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
						t.src_wg_cd,
						SUM(t.amt) AS amt,
						MIN(t.pre_alc_seq) AS pre_alc_seq,
						MIN(t.top_pre_alc_seq) AS top_pre_alc_seq
					FROM	mgt_pre_alc_path t
					WHERE	0=0
					AND t.calc_no = l_arg.calc_no
					AND t.calc_grp_cd = l_arg.calc_grp_cd
					AND t.pre_alc_lvl = l_lvl
					AND t.amt != 0
					AND t.fin_flg = '0'
					GROUP BY t.ym,
						t.wg_cd, t.alc_ac_cd,
						t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
						t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
						t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
						t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
						t.src_wg_cd
					HAVING SUM(t.amt) != 0
					ORDER BY MIN(t.pre_alc_seq)
				LOOP
					i := i + 1;
					INSERT INTO mgpa_pre_alc$p_main$alc_rec (
						calc_no,
						calc_grp_cd,
						pre_alc_seq,
						ym,
						wg_cd,
						alc_ac_cd,
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
						amt,
						src_wg_cd,
						top_pre_alc_seq,
						pre_alc_lvl,
						fin_flg,
						_index_
						)
					VALUES (
						l_arg.calc_no,
						l_arg.calc_grp_cd,
						x.pre_alc_seq,
						x.ym,
						x.wg_cd,
						x.alc_ac_cd,
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
						x.amt,
						x.src_wg_cd,
						x.top_pre_alc_seq,
						l_lvl,
						'0',
						i
						);
				END LOOP;
			ELSE
				FOR x IN
					SELECT	t.*
					FROM	mgt_pre_alc_path t
					WHERE	0=0
					AND t.calc_no = l_arg.calc_no
					AND t.calc_grp_cd = l_arg.calc_grp_cd
					AND t.pre_alc_lvl = l_lvl
					AND t.amt != 0
					AND t.fin_flg = '0'
					ORDER BY t.pre_alc_seq
				LOOP
					i := i + 1;
					INSERT INTO mgpa_pre_alc$p_main$alc_rec (
						calc_no,
						calc_grp_cd,
						pre_alc_seq,
						ym,
						inpt_alc_typ,
						wg_cd,
						alc_ac_cd,
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
						amt,
						pre_alc_rate,
						pre_alc_total,
						pre_alc_calc_rate,
						pre_alc_rate_cd,
						src_wg_cd,
						src_pre_alc_seq,
						top_pre_alc_seq,
						pre_alc_lvl,
						fin_flg,
						ins_usr_id,
						ins_usr_nm,
						ins_ts,
						ins_func_id,
						upd_cntr,
						upd_usr_id,
						upd_usr_nm,
						upd_ts,
						upd_func_id,
						upd_srv_req_no,
						_index_
						)
					VALUES (
						x.calc_no,
						x.calc_grp_cd,
						x.pre_alc_seq,
						x.ym,
						x.inpt_alc_typ,
						x.wg_cd,
						x.alc_ac_cd,
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
						x.amt,
						x.pre_alc_rate,
						x.pre_alc_total,
						x.pre_alc_calc_rate,
						x.pre_alc_rate_cd,
						x.src_wg_cd,
						x.src_pre_alc_seq,
						x.top_pre_alc_seq,
						x.pre_alc_lvl,
						x.fin_flg,
						x.ins_usr_id,
						x.ins_usr_nm,
						x.ins_ts,
						x.ins_func_id,
						x.upd_cntr,
						x.upd_usr_id,
						x.upd_usr_nm,
						x.upd_ts,
						x.upd_func_id,
						x.upd_srv_req_no,
						i
						);
				END LOOP;
			END IF;

			IF i > 0 THEN
				FOR j IN 1..i LOOP
					SELECT INTO l_alc_rec * FROM mgpa_pre_alc$p_main$alc_rec WHERE _index_ = j;
					CALL mgpa_pre_alc$p_calc_pre_alc(l_alc_rec, l_arg, l_co_parm, l_loop_err, l_lvl_sum, l_rec_cnt);

					IF l_loop_err = '1' AND l_rec_cnt = c_loop_err_num THEN
						TRUNCATE TABLE mgpa_pre_alc$p_main$alc_rec;
						TRUNCATE TABLE mgpa_pre_alc$rate_mst;
						TRUNCATE TABLE mgpa_pre_alc$ptn_mst;

						CALL mgpa_pre_alc$p_ins_pre_alc_path('1');
						COMMIT;
						CALL fcpa_err$raise_app_err('MGBDD0020', l_msg);
					END IF;

					CALL mgpa_pre_alc$p_ins_pre_alc_path('0');

					IF l_rec_cnt > l_co_parm.pre_alc_max_rec THEN
						TRUNCATE TABLE mgpa_pre_alc$p_main$alc_rec;
						TRUNCATE TABLE mgpa_pre_alc$rate_mst;
						TRUNCATE TABLE mgpa_pre_alc$ptn_mst;

						IF l_max_rec_err = '1' THEN
							CALL mgpa_pre_alc$p_ins_pre_alc_path('1');
							COMMIT;
						ELSE
							TRUNCATE TABLE mgpa_pre_alc$alc_tgt;
						END IF;

						l_msg := fcpa_err$msg_binder(l_rec_cnt::VARCHAR, l_co_parm.pre_alc_max_rec::VARCHAR);
						CALL fcpa_err$raise_app_err('MGBDD0001', l_msg);
					END IF;
				END LOOP;
			END IF;

			CALL mgpa_pre_alc$p_ins_pre_alc_path('1');

			IF i = 0 THEN
				EXIT;
			END IF;

			TRUNCATE TABLE mgpa_pre_alc$p_main$alc_rec;
			i := 0;
			l_lvl := l_lvl + 1;
		END LOOP;

		TRUNCATE TABLE mgpa_pre_alc$p_main$alc_rec;
		TRUNCATE TABLE mgpa_pre_alc$rate_mst;
		TRUNCATE TABLE mgpa_pre_alc$ptn_mst;

		IF l_lvl >= l_co_parm.pre_alc_max_lvl THEN
			IF l_max_lvl_err = '0' THEN
				CALL fcpa_batch_log$p_data_log('MGBDD0002', l_log_no, l_log_sub_key1, l_log_sub_key2, l_co_parm.pre_alc_max_lvl::VARCHAR);
			ELSE
				COMMIT;
				l_msg := fcpa_err$msg_binder(l_co_parm.pre_alc_max_lvl::VARCHAR);
				CALL fcpa_err$raise_app_err('MGBDD0021', l_msg);
			END IF;
		END IF;

		DELETE FROM	mgt_pre_alc t
		WHERE t.calc_no = l_arg.calc_no
		AND t.calc_grp_cd = l_arg.calc_grp_cd;

		INSERT INTO mgt_pre_alc (
			calc_no, calc_grp_cd,
			wg_cd, ym, alc_ac_cd,
			dpt_cd, loc_cd, oper_cd, bp_cd,
			ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
			lot_no, sublot_no, sno1, sno2, sno3, sno4,
			itm_mfg_inst_no, iv_no, po_no, slo_no,
			src_wg_cd,
			amt
			)
		SELECT	l_arg.calc_no, l_arg.calc_grp_cd,
			t.wg_cd, t.ym, t.alc_ac_cd,
			t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
			t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
			t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
			t.src_wg_cd,
			SUM(t.amt)
		FROM	mgt_pre_alc_path t
		WHERE	0=0
		AND t.calc_no = l_arg.calc_no
		AND t.calc_grp_cd = l_arg.calc_grp_cd
		AND t.fin_flg = '1'
		AND t.amt != 0
		GROUP BY t.wg_cd, t.ym, t.alc_ac_cd,
			t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
			t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
			t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
			t.src_wg_cd;

		l_cnt := 0;
		INSERT INTO mgt_calc_alc_amt (
			calc_no, calc_grp_cd,
			inpt_alc_typ, wg_cd,
			ym, alc_ac_cd,
			dpt_cd, loc_cd, oper_cd, bp_cd,
			ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
			lot_no, sublot_no, sno1, sno2, sno3, sno4,
			itm_mfg_inst_no, iv_no, po_no, slo_no,
			amt
			)
		SELECT
			l_arg.calc_no, l_arg.calc_grp_cd,
			c_inpt_pre_alc, COALESCE(l_arg.runtime_wg_cd, t.wg_cd),
			CASE l_arg.alc_calc_typ
				WHEN c_alc_month THEN t.ym
				ELSE l_arg.end_ym
			END,
			t.alc_ac_cd,
			t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
			t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
			t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
			SUM(t.amt)
		FROM	mgt_pre_alc t
		WHERE	0=0
		AND	(
			t.wg_cd = l_arg.runtime_wg_cd
			OR 
			l_arg.runtime_wg_cd IS NULL
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_wg w
					WHERE	0=0
					AND	w.calc_grp_cd = l_arg.calc_grp_cd
					AND	w.wg_cd = t.wg_cd
				)
		)
		AND t.calc_no = l_arg.calc_no
		AND t.calc_grp_cd = l_arg.calc_grp_cd
		AND t.amt != 0
		GROUP BY COALESCE(l_arg.runtime_wg_cd, t.wg_cd),
			CASE l_arg.alc_calc_typ
				WHEN c_alc_month THEN t.ym
				ELSE l_arg.end_ym
			END,
			t.alc_ac_cd,
			t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
			t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
			t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no;

		GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
		l_cnt := l_cnt + sql$rowcount;
		CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ALC_AMT', l_cnt::VARCHAR);
	END;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_PRE_ALC.P_MAIN');
END;
$BODY$
LANGUAGE plpgsql
;
