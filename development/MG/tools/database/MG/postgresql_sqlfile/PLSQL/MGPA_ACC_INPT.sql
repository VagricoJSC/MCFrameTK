\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_acc_inpt$p_ex (
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_lvl NUMERIC,
	 IN i_tgt_no NUMERIC[],
	 INOUT o_no NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	再帰的展開処理
<REMARKS>

<ARGUMENTS>
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_lvl
		階層レベル
<IN>	i_tgt_no
		対象となる投入レコードＮＯのリスト
<INOUT>	o_no
		集計投入レコードＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_tgt_no	NUMERIC[] ;
	l_bottom_flg	CHAR(1) ;
	x1	RECORD ;
	x2	RECORD ;
BEGIN
	IF COALESCE(array_length(i_tgt_no, 1), 0) = 0 THEN
		RETURN ;
	END IF ;

	o_no := o_no + 1 ;

	FOR i IN 1 .. array_length(i_tgt_no, 1) LOOP
		UPDATE	mgw_acc_inpt$temp w1
		SET	sml_inpt_rec_no = o_no
		WHERE	0=0
		AND	w1.wg_cd = i_wg_cd
		AND	w1.itm_cd = i_itm_cd
		AND	w1.itm_sub1 = i_itm_sub1
		AND	w1.itm_sub2 = i_itm_sub2
		AND	w1.itm_sub3 = i_itm_sub3
		AND	w1.lvl = i_lvl
		AND	w1.sml_inpt_rec_no = i_tgt_no[i]
		;
	END LOOP ;

	FOR x1 IN
		SELECT DISTINCT
			w1.inpt_rec_no
		FROM	mgw_acc_inpt$temp w1
		WHERE	0=0
		AND	w1.wg_cd = i_wg_cd
		AND	w1.itm_cd = i_itm_cd
		AND	w1.itm_sub1 = i_itm_sub1
		AND	w1.itm_sub2 = i_itm_sub2
		AND	w1.itm_sub3 = i_itm_sub3
		AND	w1.lvl = i_lvl
		AND	w1.sml_inpt_rec_no = o_no
	LOOP
		l_tgt_no[COALESCE(array_length(l_tgt_no, 1), 0) + 1] := x1.inpt_rec_no ;
	END LOOP ;

	l_bottom_flg := '1' ;
	FOR x2 IN
		SELECT	c.wg_cd,
			c.itm_cd,
			c.itm_sub1,
			c.itm_sub2,
			c.itm_sub3,
			c.lvl
		FROM	mgw_acc_inpt$temp p, mgw_acc_inpt$temp c
		WHERE	0=0
		AND	p.sml_inpt_rec_no = o_no
		AND	p.wg_cd = i_wg_cd
		AND	p.itm_cd = i_itm_cd
		AND	p.itm_sub1 = i_itm_sub1
		AND	p.itm_sub2 = i_itm_sub2
		AND	p.itm_sub3 = i_itm_sub3
		AND	p.lvl = i_lvl
		AND	c.sml_inpt_rec_no = p.inpt_rec_no
		AND	c.lvl = i_lvl + 1
		GROUP BY c.wg_cd, c.itm_cd, c.itm_sub1, c.itm_sub2, c.itm_sub3, c.lvl
		ORDER BY MIN(c.inpt_rec_no)
	LOOP
		l_bottom_flg := '0' ;
		CALL mgpa_acc_inpt$p_ex(x2.wg_cd, x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3, x2.lvl, l_tgt_no, o_no) ;
	END LOOP ;

	IF l_bottom_flg = '1' THEN
		UPDATE mgw_acc_inpt$temp w
		SET bottom_flg = '1'
		WHERE	0=0
		AND	w.sml_inpt_rec_no = o_no
		AND	w.wg_cd = i_wg_cd
		AND	w.itm_cd = i_itm_cd
		AND	w.itm_sub1 = i_itm_sub1
		AND	w.itm_sub2 = i_itm_sub2
		AND	w.itm_sub3 = i_itm_sub3
		AND	w.lvl = i_lvl
		;
	END IF ;

	l_tgt_no := '{}';

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_acc_inpt$p_main (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_itm_mfg_inst_no VARCHAR,
	 IN i_mfg_act_no VARCHAR,
	 IN i_mng_dpt_cd VARCHAR,
	 IN i_lot_no VARCHAR,
	 IN i_sublot_no VARCHAR,
	 IN i_sno1 VARCHAR,
	 IN i_sno2 VARCHAR,
	 IN i_sno3 VARCHAR,
	 IN i_sno4 VARCHAR,
	 IN i_loc_cd VARCHAR,
	 IN i_str_ln_cd VARCHAR,
	 IN i_po_no VARCHAR,
	 IN i_no_po_no_flg CHARACTER,
	 IN i_slo_no VARCHAR,
	 IN i_no_slo_no_flg CHARACTER,
	 IN i_iv_no VARCHAR,
	 IN i_no_iv_no_flg CHARACTER,
	 IN i_wip_flg CHARACTER DEFAULT '0'
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価内訳照会作成メイン処理
<REMARKS>
	原価計算ＮＯが設定されていないときは、対象となる品目・品目製造指図ＮＯ
	・製造実績ＮＯに対して、指定された年月までの累計情報を作成する。
	※確定されている原価計算結果（MGT_YM_NO）をもとにデータを作成する。
	原価計算ＮＯが設定されているときは、対象となる原価計算ＮＯに対する結果
	からのみデータを作成する。
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym_from
		年月ＦＲＯＭ
<IN>	i_ym_to
		年月ＴＯ
<IN>	i_itm_cd
		品目ＣＤ
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
<IN>	i_mng_dpt_cd
		管理部門ＣＤ
<IN>	i_lot_no
		ロットＮＯ
<IN>	i_sublot_no
		サブロットＮＯ
<IN>	i_sno1
		手配ＮＯ１
<IN>	i_sno2
		手配ＮＯ２
<IN>	i_sno3
		手配ＮＯ３
<IN>	i_sno4
		手配ＮＯ４
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_str_ln_cd
		ラインＣＤ
<IN>	i_po_no
		発注ＮＯ
<IN>	i_no_po_no_flg
		発注ＮＯ無ＦＬＧ
<IN>	i_slo_no
		受注ＮＯ
<IN>	i_no_slo_no_flg
		受注ＮＯ無ＦＬＧ
<IN>	i_iv_no
		Ｉ／Ｖ ＮＯ
<IN>	i_no_iv_no_flg
		Ｉ／Ｖ ＮＯ無ＦＬＧ
<IN>	i_wip_flg
		月初仕掛ＦＬＧ
<HISTORY>
**************************************************************************/
DECLARE
	c_calc_rec_inst		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INST') ;
	c_calc_rec_st_wip	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ST_WIP') ;
	c_enpns_prd			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','PROD') ;
	c_sml_length		CONSTANT NUMERIC(13) := POWER(10, 9) ;

	l_tgt_no	NUMERIC[] ;
	l_no		NUMERIC(9) ;
	l_cnt	NUMERIC ;
	l_bottom_flg	CHAR(1) ;
	l_rec_typ_1		VARCHAR(1) ;
	x	RECORD ;
	p	RECORD ;
	r	RECORD ;
	s	RECORD ;
BEGIN
	l_no := 0 ;

	call fcpa_postgres_util$p_truncate_work('mgw_acc_inpt');
	DELETE FROM mgw_calc_no ;

	l_rec_typ_1 := NULL ;
	IF i_calc_no IS NULL THEN
		INSERT INTO mgw_calc_no (
			calc_grp_cd,
			calc_no,
			ym
			)
		SELECT	t.calc_grp_cd,
			t.calc_no,
			t.ym
		FROM	mgt_ym_no t
		WHERE	0=0
		AND	t.calc_grp_cd = i_calc_grp_cd
		AND	(i_ym_from	IS NULL OR t.ym >= i_ym_from)
		AND	t.ym <= i_ym_to
		;
	ELSE
		INSERT INTO mgw_calc_no (
			calc_grp_cd,
			calc_no,
			ym
			)
		SELECT	t.calc_grp_cd,
			t.calc_no,
			NULL
		FROM	mgt_arg t
		WHERE	0=0
		AND	t.calc_grp_cd = i_calc_grp_cd
		AND	t.calc_no = i_calc_no
		;

		IF i_wip_flg = '1' THEN
			l_rec_typ_1 := c_calc_rec_st_wip ;
		END IF ;
	END IF ;

	FOR x IN
		SELECT	t3.calc_no,
			t2.calc_rec_typ,
			t3.lvl,
			t3.wg_cd,
			t3.itm_cd,
			t3.itm_sub1,
			t3.itm_sub2,
			t3.itm_sub3,
			t3.mfg_purc_typ,
			t3.inpt_rec_no,
			t3.top_rec_no,
			CASE t2.calc_rec_typ
				WHEN c_calc_rec_st_wip THEN 0
				ELSE t3.act_qty
			END AS act_qty,
			CASE t2.calc_rec_typ
				WHEN c_calc_rec_st_wip THEN 0
				ELSE t3.std_qty
			END AS std_qty
		FROM	mgw_calc_no t1, mgt_acc_top t2, mgt_acc_inpt t3
		WHERE	0=0
		AND	t1.calc_no = t2.calc_no
		AND	t1.calc_grp_cd = t2.calc_grp_cd
		AND	(t1.ym IS NULL OR t1.ym = t2.ym)
		AND	t2.calc_no = t3.calc_no
		AND	t2.calc_grp_cd = t3.calc_grp_cd
		AND	t2.top_rec_no = t3.top_rec_no
		AND	t2.wg_cd = i_wg_cd
		AND	t2.itm_cd = i_itm_cd
		AND	t2.itm_sub1 = i_itm_sub1
		AND	t2.itm_sub2 = i_itm_sub2
		AND	t2.itm_sub3 = i_itm_sub3
		AND	t2.calc_rec_typ IN (c_calc_rec_inst, l_rec_typ_1)
		AND	(i_ym_from IS NULL OR t2.ym >= i_ym_from)
		AND	(i_ym_to IS NULL OR t2.ym <= i_ym_to)
		AND	(i_itm_mfg_inst_no IS NULL OR t2.itm_mfg_inst_no LIKE i_itm_mfg_inst_no)
		AND	(i_mfg_act_no IS NULL OR t2.mfg_act_no LIKE i_mfg_act_no)
		AND	(i_mng_dpt_cd IS NULL OR t2.mng_dpt_cd LIKE i_mng_dpt_cd)
		AND	(i_lot_no IS NULL OR t2.lot_no LIKE i_lot_no)
		AND	(i_sublot_no IS NULL OR t2.sublot_no LIKE i_sublot_no)
		AND	(i_sno1 IS NULL OR t2.sno1 LIKE i_sno1)
		AND	(i_sno2 IS NULL OR t2.sno2 LIKE i_sno2)
		AND	(i_sno3 IS NULL OR t2.sno3 LIKE i_sno3)
		AND	(i_sno4 IS NULL OR t2.sno4 LIKE i_sno4)
		AND	(i_loc_cd IS NULL OR t2.loc_cd LIKE i_loc_cd)
		AND	(i_str_ln_cd IS NULL OR t2.str_ln_cd LIKE i_str_ln_cd)
		AND	(i_po_no IS NULL OR t2.po_no LIKE i_po_no)
		AND	(i_slo_no IS NULL OR t2.slo_no LIKE i_slo_no)
		AND	(i_iv_no IS NULL OR t2.iv_no LIKE i_iv_no)
		AND	(i_no_po_no_flg = '0' OR t2.po_no IS NULL)
		AND	(i_no_slo_no_flg = '0' OR t2.slo_no IS NULL)
		AND	(i_no_iv_no_flg = '0' OR t2.iv_no IS NULL)
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			IF x.calc_rec_typ = c_calc_rec_st_wip THEN
				IF x.lvl > 0 THEN
					EXIT NEXT_LOOP ;
				ELSE
					SELECT	COUNT(t.calc_no)
					INTO STRICT	l_cnt
					FROM	mgt_acc_cost t
					WHERE	0=0
					AND	t.calc_grp_cd = i_calc_grp_cd
					AND	t.calc_no = x.calc_no
					AND	t.top_rec_no = x.top_rec_no
					AND	t.expns_typ = c_enpns_prd
					;
					IF l_cnt > 0 THEN
						l_cnt := - 1 ;
					END IF ;
				END IF ;
			ELSE
				SELECT	COUNT(t.calc_no)
				INTO STRICT	l_cnt
				FROM	mgt_acc_cost t
				WHERE	0=0
				AND	t.calc_grp_cd = i_calc_grp_cd
				AND	t.calc_no = x.calc_no
				AND	t.inpt_rec_no = x.inpt_rec_no
				AND	t.expns_typ = c_enpns_prd
				;
			END IF ;

			INSERT INTO mgw_acc_inpt$temp (
				lvl,
				wg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				mfg_purc_typ,
				inpt_rec_no,
				act_qty,
				std_qty,
				expns_cd,
				act_cost,
				std_cost,
				sml_inpt_rec_no,
				calc_no
				)
			SELECT
				CASE x.calc_rec_typ
					WHEN c_calc_rec_st_wip THEN 0
					ELSE x.lvl
				END,
				x.wg_cd,
				x.itm_cd,
				x.itm_sub1,
				x.itm_sub2,
				x.itm_sub3,
				x.mfg_purc_typ,
				x.inpt_rec_no,
				CASE row_number() OVER (ORDER BY NULL)
					WHEN 1 THEN x.act_qty
					ELSE 0
				END,
				CASE row_number() OVER (ORDER BY NULL)
					WHEN 1 THEN x.std_qty
					ELSE 0
				END,
				y.expns_cd,
				y.act_cost,
				CASE x.calc_rec_typ
					WHEN c_calc_rec_st_wip THEN 0
					ELSE y.std_cost
				END,
				z.sml_inpt_rec_no,
				x.calc_no
			FROM	(
				SELECT	t.expns_cd,
					SUM(t.act_cost) AS act_cost,
					SUM(t.std_cost) AS std_cost
				FROM	mgt_acc_cost t
				WHERE	0=0
				AND	t.calc_grp_cd = i_calc_grp_cd
				AND	t.calc_no = x.calc_no
				AND	t.inpt_rec_no = x.inpt_rec_no
				AND	t.expns_typ = c_enpns_prd
				AND	l_cnt > 0
				GROUP BY t.expns_cd
				UNION ALL
				SELECT	t.expns_cd,
					SUM(t.act_cost) AS act_cost,
					SUM(t.std_cost) AS std_cost
				FROM	mgt_acc_cost t
				WHERE	0=0
				AND	t.calc_grp_cd = i_calc_grp_cd
				AND	t.calc_no = x.calc_no
				AND	t.top_rec_no = x.top_rec_no
				AND	t.expns_typ = c_enpns_prd
				AND	l_cnt < 0
				GROUP BY t.expns_cd
				UNION ALL
				SELECT	NULL AS expns_cd,
					0 AS act_cost,
					0 AS std_cost
				WHERE	0=0
				AND	l_cnt = 0
				) y,
				(
				SELECT	COALESCE(MAX(t.inpt_rec_no), 0) AS sml_inpt_rec_no
				FROM	mgt_acc_inpt t
				WHERE	0=0
				AND	t.calc_grp_cd = i_calc_grp_cd
				AND	t.calc_no = x.calc_no
				AND	t.top_rec_no = x.top_rec_no
				AND	t.lvl = x.lvl - 1
				AND	t.inpt_rec_no <= x.inpt_rec_no
				) z
			WHERE	0=0
			;
		END ;
	END LOOP ;

	FOR r IN
		SELECT	row_number() OVER (ORDER BY NULL) AS r_no,
			w.calc_no
		FROM	(
			SELECT DISTINCT
				w1.calc_no
			FROM	mgw_acc_inpt$temp w1
			WHERE	0=0
			) w
		WHERE	0=0
	LOOP
		UPDATE mgw_acc_inpt$temp w
		SET inpt_rec_no = r.r_no * c_sml_length + w.inpt_rec_no,
			sml_inpt_rec_no =
				CASE w.sml_inpt_rec_no
					WHEN 0 THEN 0
					ELSE r.r_no * c_sml_length + w.sml_inpt_rec_no
				END
		WHERE	0=0
		AND	w.calc_no = r.calc_no
		;
	END LOOP ;

	FOR p IN
		SELECT DISTINCT
			w1.inpt_rec_no
		FROM	mgw_acc_inpt$temp w1
		WHERE	0=0
		AND	w1.lvl = 0
	LOOP
		l_tgt_no[COALESCE(array_length(l_tgt_no, 1), 0) + 1] := p.inpt_rec_no ;
	END LOOP ;

	l_bottom_flg := '1' ;
	FOR s IN
		SELECT	w1.wg_cd,
			w1.itm_cd,
			w1.itm_sub1,
			w1.itm_sub2,
			w1.itm_sub3
		FROM	mgw_acc_inpt$temp w1
		WHERE	0=0
		AND	w1.lvl = 1
		GROUP BY w1.wg_cd, w1.itm_cd, w1.itm_sub1, w1.itm_sub2, w1.itm_sub3
		ORDER BY MIN(w1.inpt_rec_no)
	LOOP
		l_bottom_flg := '0' ;
		CALL mgpa_acc_inpt$p_ex(s.wg_cd, s.itm_cd, s.itm_sub1, s.itm_sub2, s.itm_sub3, 1, l_tgt_no, l_no) ;
	END LOOP ;

	IF l_bottom_flg = '1' THEN
		UPDATE	mgw_acc_inpt$temp w
		SET	bottom_flg = '1'
		WHERE	0=0
		AND	w.lvl = 0
		;
	END IF ;

	l_tgt_no := '{}';

END ;
$BODY$
LANGUAGE plpgsql
;

