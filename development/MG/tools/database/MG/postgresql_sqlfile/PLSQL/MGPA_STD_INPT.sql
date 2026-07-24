\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_std_inpt$p_ex (
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
		UPDATE	mgw_std_inpt w1
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
	END LOOP;

	FOR x1 IN
		SELECT DISTINCT
			w1.inpt_rec_no
		FROM	mgw_std_inpt w1
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
		FROM	mgw_std_inpt p, mgw_std_inpt c
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
		CALL mgpa_std_inpt$p_ex(x2.wg_cd, x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3, x2.lvl, l_tgt_no, o_no) ;
	END LOOP ;

	IF l_bottom_flg = '1' THEN
		UPDATE mgw_std_inpt w
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


CREATE OR REPLACE PROCEDURE mgpa_std_inpt$p_main (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_loc_cd VARCHAR,
	 IN i_sppl_cd VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	標準内訳照会作成メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
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
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_sppl_cd
		取引先ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	c_enpns_prd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','PROD') ;

	l_tgt_no	NUMERIC[] ;
	l_no		NUMERIC(9) ;
	l_cnt		NUMERIC ;
	l_bottom_flg	CHAR(1) ;
	x	RECORD ;
	p	RECORD ;
	r	RECORD ;
BEGIN
	l_no := 0 ;

	DELETE FROM mgw_std_inpt ;

	FOR x IN
		SELECT	t1.lvl,
			t1.wg_cd,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.mfg_purc_typ,
			t1.inpt_rec_no,
			t1.top_rec_no,
			t1.std_qty,
			t1.the_qty
		FROM	mgt_std_top t0, mgt_std_inpt t1
		WHERE	0=0
		AND	t1.calc_no = t0.calc_no
		AND	t1.calc_grp_cd = t0.calc_grp_cd
		AND	t1.top_rec_no = t0.top_rec_no
		AND	t0.calc_no = i_calc_no
		AND	t0.calc_grp_cd = i_calc_grp_cd
		AND	t0.wg_cd = i_wg_cd
		AND	t0.itm_cd = i_itm_cd
		AND	t0.itm_sub1 = i_itm_sub1
		AND	t0.itm_sub2 = i_itm_sub2
		AND	t0.itm_sub3 = i_itm_sub3
		AND	t0.sls_flg = '0'
		AND	(i_loc_cd IS NULL OR t0.loc_cd LIKE i_loc_cd)
		AND	(i_sppl_cd IS NULL OR t0.sppl_cd LIKE i_sppl_cd)
	LOOP
		SELECT	COUNT(t1.calc_no)
		INTO STRICT	l_cnt
		FROM	mgt_std_cost t1
		WHERE	0=0
		AND	t1.calc_no = i_calc_no
		AND	t1.calc_grp_cd = i_calc_grp_cd
		AND	t1.inpt_rec_no = x.inpt_rec_no
		AND	t1.expns_typ = c_enpns_prd
		;

		INSERT INTO mgw_std_inpt (
			lvl,
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			mfg_purc_typ,
			inpt_rec_no,
			std_qty,
			the_qty,
			expns_cd,
			std_cost,
			the_cost,
			sml_inpt_rec_no
			)
		SELECT
			x.lvl,
			x.wg_cd,
			x.itm_cd,
			x.itm_sub1,
			x.itm_sub2,
			x.itm_sub3,
			x.mfg_purc_typ,
			x.inpt_rec_no,
			CASE row_number() OVER (ORDER BY NULL)
				WHEN 1 THEN x.std_qty
				ELSE 0
			END,
			CASE row_number() OVER (ORDER BY NULL)
				WHEN 1 THEN x.the_qty
				ELSE 0
			END,
			y.expns_cd,
			y.std_cost,
			y.the_cost,
			z.sml_inpt_rec_no
		FROM	(
			SELECT	t1.expns_cd,
				SUM(t1.std_cost) AS std_cost,
				SUM(t1.the_cost) AS the_cost
			FROM	mgt_std_cost t1
			WHERE	0=0
			AND	t1.calc_no = i_calc_no
			AND	t1.calc_grp_cd = i_calc_grp_cd
			AND	t1.inpt_rec_no = x.inpt_rec_no
			AND	t1.expns_typ = c_enpns_prd
			AND	l_cnt > 0
			GROUP BY
				t1.expns_cd
			UNION ALL
			SELECT	NULL AS expns_cd,
				0 AS std_cost,
				0 AS the_cost
			WHERE	0=0
			AND	l_cnt = 0
			) y,
			(
			SELECT	COALESCE(MAX(t1.inpt_rec_no), 0) AS sml_inpt_rec_no
			FROM	mgt_std_inpt t1
			WHERE	0=0
			AND	t1.calc_no = i_calc_no
			AND	t1.calc_grp_cd = i_calc_grp_cd
			AND	t1.top_rec_no = x.top_rec_no
			AND	t1.lvl = x.lvl - 1
			AND	t1.inpt_rec_no <= x.inpt_rec_no
			) z
		WHERE	0=0
		;
	END LOOP ;

	FOR p IN
		SELECT DISTINCT
			w1.inpt_rec_no
		FROM	mgw_std_inpt w1
		WHERE	0=0
		AND	w1.lvl = 0
	LOOP
		l_tgt_no[COALESCE(array_length(l_tgt_no, 1), 0) + 1] := p.inpt_rec_no ;
	END LOOP ;

	l_bottom_flg := '1' ;
	FOR r IN
		SELECT	w1.wg_cd,
			w1.itm_cd,
			w1.itm_sub1,
			w1.itm_sub2,
			w1.itm_sub3
		FROM	mgw_std_inpt w1
		WHERE	0=0
		AND	w1.lvl = 1
		GROUP BY w1.wg_cd, w1.itm_cd, w1.itm_sub1, w1.itm_sub2, w1.itm_sub3
		ORDER BY MIN(w1.inpt_rec_no)
	LOOP
		l_bottom_flg := '0' ;
		CALL mgpa_std_inpt$p_ex(r.wg_cd, r.itm_cd, r.itm_sub1, r.itm_sub2, r.itm_sub3, 1, l_tgt_no, l_no) ;
	END LOOP ;

	IF l_bottom_flg = '1' THEN
		UPDATE	mgw_std_inpt w
		SET	bottom_flg = '1'
		WHERE	0=0
		AND	w.lvl = 0 ;
	END IF ;

	l_tgt_no := '{}';

END ;
$BODY$
LANGUAGE plpgsql
;

