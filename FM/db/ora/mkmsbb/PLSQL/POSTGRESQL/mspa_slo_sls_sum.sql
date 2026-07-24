CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_sls_sum_dpt_main (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC,
	IN i_dpt_lvl_cd	VARCHAR,
	IN i_use_act_xrate_flg	CHARACTER,
	IN i_sls_bdg_grp	VARCHAR,
	IN i_xrate_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定年月、売上表示期間より部門別用の売上集計受注ワークを作成するメイン処理
<REMARKS>
	呼び出し元の処理にて、画面で指定された部門階層の部門ＣＤを、レベル１として、
	売上集計部門階層ワークに登録しておく必要がある。
<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<IN>
	i_dpt_lvl_cd
		部門階層ＣＤ
<IN>
	i_use_act_xrate_flg
		実績を売上時レートで換算
<IN>
	i_sls_bdg_grp
		予算分類
<IN>
	i_xrate_cd
		為替レートＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	l_co	mam_co%ROWTYPE ;
	l_base_cur_amt_dec_place	mam_cur.amt_dec_place%TYPE ;
	x	RECORD ;
BEGIN

	/* 初期設定 */
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_dpt_lvl_cd', i_dpt_lvl_cd) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_use_act_xrate_flg', i_use_act_xrate_flg) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_sls_bdg_grp', i_sls_bdg_grp) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_xrate_cd', i_xrate_cd) ;

	l_co := mapa_co$f_get_co_rec() ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_cl_day', l_co.ac_cl_day) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_cl_mon_base', l_co.ac_cl_mon_base) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_base_cur_cd', l_co.base_cur_cd) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_gm_std_upri_sel_typ', l_co.gm_std_upri_typ) ;

	SELECT	amt_dec_place
	INTO	STRICT l_base_cur_amt_dec_place
	FROM	mam_cur
	WHERE	cur_cd = l_co.base_cur_cd
	;

	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_base_cur_amt_dec_place', l_base_cur_amt_dec_place) ;

	FOR x IN
		SELECT	w.sls_dpt_cd
		FROM	msw_sls_sum_dpt_lvl w
		WHERE	0=0
		AND	w.lvl = 1
	LOOP
		CALL mspa_slo_sls_sum$p_ins_dpt_lvl(i_ym, i_sls_disp_term, x.sls_dpt_cd) ;
	END LOOP ;

	CALL mspa_slo_sls_sum$p_ins_sls_sum_dpt(i_ym, i_sls_disp_term) ;

	CALL mspa_slo_sls_sum$p_ins_slo_sum_dpt(i_ym, i_sls_disp_term) ;

	CALL mspa_slo_sls_sum$p_ins_slo_bl_dpt(i_ym, i_sls_disp_term) ;

	CALL mspa_slo_sls_sum$p_ins_sls_bdg_dpt(i_ym, i_sls_disp_term) ;

	CALL mspa_slo_sls_sum$p_ins_spln_sum_dpt(i_ym, i_sls_disp_term) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_dpt_lvl (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC,
	IN i_dpt_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定年月、売上表示期間、部門ＣＤを条件に売上集計部門階層ワークを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<IN>
	i_dpt_cd
		部門ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	l_co_rec	mam_co%ROWTYPE ;
	l_base_ym	msw_sls_sum_dpt_lvl.ym%TYPE ;
	l_base_dt	mam_dpt.st_dt%TYPE ;
	x	RECORD ;
BEGIN

	l_co_rec := mapa_co$f_get_co_rec() ;

	FOR i IN 1..COALESCE(i_sls_disp_term, 1) LOOP
		l_base_ym := fcpa_postgres_util$add_months(i_ym, i - 1) ;
		l_base_dt := mapa_dt$f_get_ym_st_dt_ne(l_base_ym, l_co_rec.ac_cl_day::NUMERIC(2, 0), l_co_rec.ac_cl_mon_base::NUMERIC(1, 0)) ;

		/* 指定年月より後の月の売上部門集計ワークを補完する */
		IF i > 1 THEN
			INSERT INTO msw_sls_sum_dpt_lvl VALUES (
					l_base_ym,	/* 年月 */
					mapa_dpt$f_get_dpt_cd_ne(i_dpt_cd, l_base_dt),	/* 売上部門ＣＤ */
					mapa_dpt$f_get_dpt_cd_ne(i_dpt_cd, l_base_dt),	/* 指定階層部門ＣＤ */
					NULL,	/* 下位部門ＣＤ */
					1		/* レベル */
					)
			;
		END IF ;

		FOR x IN
			SELECT	m.dpt_cd
			FROM	mam_dpt m
			WHERE	0=0
			AND	m.up_lv_dpt_cd = i_dpt_cd
			AND	l_base_dt BETWEEN m.st_dt AND m.end_dt
			AND	m.sls_dpt_flg = '1'
		LOOP
			INSERT INTO msw_sls_sum_dpt_lvl VALUES (
					l_base_ym,	/* 年月 */
					x.DPT_CD,	/* 売上部門ＣＤ */
					mapa_dpt$f_get_dpt_cd_ne(i_dpt_cd, l_base_dt),	/* 指定階層部門ＣＤ */
					x.DPT_CD,	/* 下位部門ＣＤ */
					2		/* レベル */
					)
			;
		END LOOP ;

		CALL mspa_slo_sls_sum$p_ins_dpt_lvl(2, l_base_ym, l_base_dt, mapa_dpt$f_get_dpt_cd_ne(i_dpt_cd, l_base_dt)) ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_dpt_lvl (
	IN i_lvl	NUMERIC,
	IN i_base_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_base_dt	TIMESTAMP WITHOUT TIME ZONE,
	IN i_crnt_dpt_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定レベルの売上集計部門階層ワークの売上部門ＣＤをもとに、下位階層の
	部門ＣＤを取得し、売上集計部門階層ワークに登録する。
	最下層の部門ＣＤまで同じ処理を繰り返し行う。
<REMARKS>

<ARGUMENTS>
<IN>
	i_lvl
		レベル
<IN>
	i_base_ym
		基準月
<IN>
	i_base_dt
		基準日
<IN>
	i_crnt_dpt_cd
		指定階層部門ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt	NUMERIC ;
	x	RECORD ;
	y	RECORD ;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	msw_sls_sum_dpt_lvl w
	WHERE	0=0
	AND	w.ym = i_base_ym
	AND	w.lvl = i_lvl
	AND	w.crnt_dpt_cd = i_crnt_dpt_cd ;

	IF l_cnt > 0 THEN
		FOR x IN
			SELECT	w.ym, w.sls_dpt_cd, w.crnt_dpt_cd, w.dw_dpt_cd
			FROM	msw_sls_sum_dpt_lvl w
			WHERE	0=0
			AND	w.ym = i_base_ym
			AND	w.lvl = i_lvl
			AND	w.crnt_dpt_cd = i_crnt_dpt_cd
		LOOP
			FOR y IN
				SELECT	m.dpt_cd
				FROM	mam_dpt m
				WHERE	0=0
				AND	m.up_lv_dpt_cd = x.sls_dpt_cd
				AND	i_base_dt BETWEEN m.st_dt AND m.end_dt
				AND	m.sls_dpt_flg = '1'
			LOOP
				INSERT INTO msw_sls_sum_dpt_lvl VALUES (
							i_base_ym,
							y.dpt_cd,
							x.crnt_dpt_cd,
							x.dw_dpt_cd,
							i_lvl + 1
							)
				;
			END LOOP ;
		END LOOP ;

		CALL mspa_slo_sls_sum$p_ins_dpt_lvl(i_lvl + 1, i_base_ym, i_base_dt, i_crnt_dpt_cd) ;

	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_sls_sum_dpt (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	売上集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
	登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
	l_dpt_lvl_cd	msw_slo_sls_sum.dpt_lvl_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_dpt_lvl_cd') ;
	l_st_ym		mst_sls_sum.ym%TYPE ;
	l_end_ym	mst_sls_sum.ym%TYPE ;
BEGIN
	l_st_ym := i_ym ;

	IF i_sls_disp_term IS NULL THEN
		/* 指定年月のデータのみ抽出 */
		l_end_ym := i_ym ;
	ELSE
		/* 指定年月から表示期間分のデータを抽出 */
		l_end_ym := fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1) ;
	END IF ;

	INSERT INTO msw_slo_sls_sum (
		ym,
		dpt_lvl_cd,
		sls_dpt_cd,
		dpt_cd1,
		dpt_cd2,
		sls_usr_cd,
		cst_cd,
		trd_cur_cd,
		xrate,
		sls_amt,
		base_cur_sls_amt,
		sls_cost_amt,
		not_sum_flg,
		spln_usr_flg
	)
	SELECT
		t.ym,
		l_dpt_lvl_cd,
		t.sls_dpt_cd,
		w.crnt_dpt_cd,
		w.dw_dpt_cd,
		t.sls_usr_cd,
		t.cst_cd,
		t.cur_cd,
		mapa_xchng$f_get_xrate(
						t.cur_cd,
						l_base_cur_cd,
						l_xrate_cd,
						mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
		t.trd_cur_sls_amt,
		t.base_cur_sls_amt,
		t.cost_amt,
		'0',
		'0'
	FROM
		mst_sls_sum t
		INNER JOIN msw_sls_sum_dpt_lvl w ON (t.sls_dpt_cd = w.sls_dpt_cd AND t.ym = w.ym)
	WHERE	0=0
	AND	t.ym BETWEEN l_st_ym AND l_end_ym
	;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_slo_sum_dpt (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	受注集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
	登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
	l_dpt_lvl_cd	msw_slo_sls_sum.dpt_lvl_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_dpt_lvl_cd') ;
	l_st_ym		mst_frcst_slo_sum.ym%TYPE ;
	l_end_ym	mst_frcst_slo_sum.ym%TYPE ;
BEGIN
	l_st_ym := i_ym ;

	IF i_sls_disp_term IS NULL THEN
		/* 指定年月のデータのみ抽出 */
		l_end_ym := i_ym ;
	ELSE
		/* 指定年月から表示期間分のデータを抽出 */
		l_end_ym := fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1) ;
	END IF ;

	INSERT INTO msw_slo_sls_sum (
		ym,
		dpt_lvl_cd,
		sls_dpt_cd,
		dpt_cd1,
		dpt_cd2,
		sls_usr_cd,
		cst_cd,
		trd_cur_cd,
		xrate,
		slo_amt,
		slo_cost_amt,
		not_sum_flg,
		spln_usr_flg
	)
	SELECT
		t.ym,
		l_dpt_lvl_cd,
		w.sls_dpt_cd,
		w.crnt_dpt_cd,
		w.dw_dpt_cd,
		t.sls_usr_cd,
		t.cst_cd,
		t.trd_cur_cd,
		mapa_xchng$f_get_xrate(
						t.trd_cur_cd,
						l_base_cur_cd,
						l_xrate_cd,
						mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
		CASE
			WHEN m1.dscnt_itm_flg = '1' THEN (t.trd_cur_slo_amt + t.trd_cur_pre_slo_amt) * - 1
			ELSE t.trd_cur_slo_amt + t.trd_cur_pre_slo_amt
		END,
		t.slo_cost_amt + t.pre_slo_cost_amt,
		'0',
		'0'
	FROM
		mst_frcst_slo_sum t
		LEFT OUTER JOIN mam_dpt d ON (t.sls_dpt_cd = d.dpt_cd AND mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base) BETWEEN d.st_dt AND d.end_dt)
		LEFT OUTER JOIN mam_dpt_map dm ON (t.sls_dpt_cd = dm.old_dpt_cd AND mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base) BETWEEN dm.st_dt AND dm.end_dt)
		INNER JOIN msw_sls_sum_dpt_lvl w
			ON (CASE
				WHEN d.dpt_cd IS NOT NULL THEN d.dpt_cd
				ELSE dm.new_dpt_cd
			END = w.sls_dpt_cd AND t.ym = w.ym)
		LEFT OUTER JOIN mam_itm m1 ON (t.itm_cd = m1.itm_cd AND t.itm_sub1 = m1.itm_sub1 AND t.itm_sub2 = m1.itm_sub2 AND t.itm_sub3 = m1.itm_sub3)
	WHERE	0=0
	AND	t.ym BETWEEN l_st_ym AND l_end_ym
	;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_slo_bl_dpt (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	売上予定テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
	登録する。部門については、部門変換マスタで最新の部門に変換する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	c_rndoff	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;
	c_slip_sts_crt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','CRT') ;
	c_slip_sts_dis	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','DIS') ;

	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_base_cur_amt_dec_place	mam_cur.amt_dec_place%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_amt_dec_place') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
	l_dpt_lvl_cd	msw_slo_sls_sum.dpt_lvl_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_dpt_lvl_cd') ;
	l_gm_std_upri_sel_typ	mam_co.gm_std_upri_typ%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_gm_std_upri_sel_typ') ;
	l_st_dt		mst_sls_schd.sls_schd_dt%TYPE ;
	l_end_dt	mst_sls_schd.sls_schd_dt%TYPE ;
BEGIN
	l_st_dt := mapa_dt$f_get_ym_st_dt_ne(i_ym, l_cl_day, l_cl_mon_base) ;

	IF i_sls_disp_term IS NULL THEN
		/* 指定年月のデータのみ抽出 */
		l_end_dt := mapa_dt$f_get_ym_end_dt_ne(i_ym, l_cl_day, l_cl_mon_base) ;
	ELSE
		/* 指定年月から表示期間分のデータを抽出 */
		l_end_dt := mapa_dt$f_get_ym_end_dt_ne(fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1), l_cl_day, l_cl_mon_base) ;
	END IF ;

	INSERT INTO msw_slo_sls_sum (
		ym,
		dpt_lvl_cd,
		sls_dpt_cd,
		dpt_cd1,
		dpt_cd2,
		sls_usr_cd,
		cst_cd,
		trd_cur_cd,
		xrate,
		slo_bl_amt,
		slo_bl_cost_amt,
		not_sum_flg,
		spln_usr_flg
	)
	SELECT
		v2.ym,
		l_dpt_lvl_cd AS dpt_lvl_cd,
		v2.sls_dpt_cd,
		v2.crnt_dpt_cd,
		v2.dw_dpt_cd,
		v2.sls_usr_cd,
		v2.cst_cd,
		v2.trd_cur_cd,
		mapa_xchng$f_get_xrate(
			v2.TRD_CUR_CD,
			l_base_cur_cd,
			l_xrate_cd,
			mapa_dt$f_get_ym_st_dt_ne(v2.YM, l_cl_day, l_cl_mon_base)
		) AS xrate,
		SUM(v2.slo_bl_amt) AS slo_bl_amt,
		SUM(v2.slo_bl_cost_amt) AS slo_bl_cost_amt,
		'0' AS not_sum_flg,
		'0' AS spln_usr_flg
	FROM	(
		SELECT
			v1.ym,
			v1.cst_cd,
			v1.sls_dpt_cd,
			v1.crnt_dpt_cd,
			v1.dw_dpt_cd,
			v1.sls_usr_cd,
			v1.trd_cur_cd,
			mapa_amt$f_get_exc_tax_amt(
				v1.trd_cur_upri,
				v1.trd_unit_rem_qty,
				m2.sls_amt_rnd_typ,
				m2.sls_tax_rnd_typ,
				m3.amt_dec_place,
				m1.inc_tax_flg,
				m1.tax_rate,
				mapa_calc$f_rnd_ne(v1.trd_cur_dscnt_amt * v1.base_unit_rem_qty / v1.dscnt_base_qty, m3.amt_dec_place, c_rndoff)
			) AS slo_bl_amt,
			mapa_calc$f_rnd_ne(
				v1.cost_upri * v1.base_unit_rem_qty,
				l_base_cur_amt_dec_place,
				c_rndoff
			) AS slo_bl_cost_amt
		FROM
			(
			/* 未出荷指図、未出荷実績（出荷指図対象外）、仕入直送、インボイス取引（行追加除く）の売上予定 */
			SELECT
				mapa_dt$f_get_ac_ym(
					t1.sls_schd_dt,
					l_cl_day,
					l_cl_mon_base
				) AS ym,
				t3.cst_cd,
				w.sls_dpt_cd,
				w.crnt_dpt_cd,
				w.dw_dpt_cd,
				t3.sls_usr_cd,
				t3.trd_cur_cd,
				CASE
					WHEN m2.dscnt_itm_flg = '1' THEN t2.trd_cur_upri * - 1
					ELSE t2.trd_cur_upri
				END AS trd_cur_upri,
				t2.cost_upri,
				t2.tax_cd,
				t2.trd_cur_dscnt_amt,
				t1.trd_unit_qty,
				CASE
					WHEN cst.cst_iv_flg = '1' THEN
						CASE
							WHEN t2.trd_unit_cd = t2.base_unit_cd THEN t4.base_unit_qty - t4.ship_schd_abort_qty - t4.ship_ret_qty - GREATEST(t4.iv_schd_qty, t4.ship_inst_qty, t4.ship_act_qty)
							ELSE (t4.base_unit_qty - t4.ship_schd_abort_qty - t4.ship_ret_qty - GREATEST(t4.iv_schd_qty, t4.ship_inst_qty, t4.ship_act_qty)) * conv_base_qty / conv_qty
						END
					ELSE
						CASE
							WHEN t2.trd_unit_cd = t1.base_unit_cd THEN t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty
							ELSE (t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty) * conv_base_qty / conv_qty
						END 
				END AS trd_unit_rem_qty,
				CASE
					WHEN cst.cst_iv_flg = '1' THEN t4.base_unit_qty - t4.ship_schd_abort_qty - t4.ship_ret_qty - GREATEST(t4.iv_schd_qty, t4.ship_inst_qty, t4.ship_act_qty)
					ELSE t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty
				END AS base_unit_rem_qty,
				t2.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				INNER JOIN mst_slo_d t2 ON (t1.slo_d_no = t2.slo_d_no)
				INNER JOIN mst_slo t3 ON (t2.slo_no = t3.slo_no)
				LEFT OUTER JOIN mam_dpt d ON (t3.sls_dpt_cd = d.dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN d.st_dt AND d.end_dt)
				LEFT OUTER JOIN mam_dpt_map dm ON (t3.sls_dpt_cd = dm.old_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN dm.st_dt AND dm.end_dt)
				INNER JOIN msw_sls_sum_dpt_lvl w
					ON (CASE
						WHEN d.dpt_cd IS NOT NULL THEN d.dpt_cd
						ELSE dm.new_dpt_cd
					END = w.sls_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) = w.ym)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t2.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2 ON (t2.itm_cd = m2.itm_cd AND t2.itm_sub1 = m2.itm_sub1 AND t2.itm_sub2 = m2.itm_sub2 AND t2.itm_sub3 = m2.itm_sub3)
				LEFT OUTER JOIN mam_bp cst ON (t3.cst_cd = cst.bp_cd AND cst.cst_flg = '1')
				LEFT OUTER JOIN mst_ship_pr t4 ON (t2.slo_d_no = t4.slo_d_no)
			WHERE	0=0
			AND	t1.cmpl_flg = '0'
			AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
			AND	t1.slo_d_no IS NOT NULL
			AND	t1.ship_inst_d_no IS NULL
			AND	t1.dlv_slip_d_no IS NULL
			AND t1.iv_d_no IS NULL
			AND CASE
					WHEN cst.cst_iv_flg = '1' THEN t4.base_unit_qty - t4.ship_schd_abort_qty - t4.ship_ret_qty - GREATEST(t4.iv_schd_qty, t4.ship_inst_qty, t4.ship_act_qty)
					ELSE t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty
				END > 0
			UNION ALL
			/* 出荷指図の売上予定（出荷実績後は除く） */
			/* 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする */
			SELECT
				mapa_dt$f_get_ac_ym(
					t1.sls_schd_dt,
					l_cl_day,
					l_cl_mon_base
				) AS ym,
				t5.bp_cd AS cst_cd,
				w.sls_dpt_cd,
				w.crnt_dpt_cd,
				w.dw_dpt_cd,
				t5.usr_cd AS sls_usr_cd,
				t5.trd_cur_cd,
				CASE
					WHEN m2.dscnt_itm_flg = '1' THEN t4.trd_cur_upri * - 1
					ELSE t4.trd_cur_upri
				END AS trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				SUM(t3.base_unit_qty - t3.ship_act_qty) * conv_base_qty / conv_qty AS trd_unit_rem_qty,
				SUM(t3.base_unit_qty - t3.ship_act_qty) AS base_unit_rem_qty,
				t4.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				JOIN mst_ship_schd t2 ON (t1.ship_schd_no = t2.ship_schd_no)
				JOIN mst_ship_alloc_sts t3 ON (t2.ship_schd_no = t3.ship_schd_no)
				JOIN mst_dlv_slip_d t4 ON (t3.dlv_slip_d_no = t4.dlv_slip_d_no AND t3.dlv_slip_no = t4.dlv_slip_no AND t3.dlv_slip_seq = t4.dlv_slip_seq)
				JOIN mst_dlv_slip t5 ON (t4.dlv_slip_no = t5.dlv_slip_no AND t4.dlv_slip_seq = t5.dlv_slip_seq)
				JOIN mst_slo_d t6 ON (t1.slo_d_no = t6.slo_d_no)
				LEFT OUTER JOIN mam_dpt d ON (t5.dpt_cd = d.dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN d.st_dt AND d.end_dt)
				LEFT OUTER JOIN mam_dpt_map dm ON (t5.dpt_cd = dm.old_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN dm.st_dt AND dm.end_dt)
				INNER JOIN msw_sls_sum_dpt_lvl w
					ON (CASE
						WHEN d.dpt_cd IS NOT NULL THEN d.dpt_cd
						ELSE dm.new_dpt_cd
					END = w.sls_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) = w.ym)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t1.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2 ON (t2.itm_cd = m2.itm_cd AND t2.itm_sub1 = m2.itm_sub1 AND t2.itm_sub2 = m2.itm_sub2 AND t2.itm_sub3 = m2.itm_sub3)
				WHERE	0=0
				AND	t1.cmpl_flg = '0'
				AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
				AND	t1.dlv_slip_d_no IS NULL
				AND	t3.ship_inst_d_no IS NOT NULL
				AND	t3.ship_act_qty < t3.base_unit_qty
				AND	t5.slip_sts_typ IN (c_slip_sts_crt, c_slip_sts_dis)
				GROUP BY
					t1.sls_schd_dt,
					t5.bp_cd,
					w.sls_dpt_cd,
					w.crnt_dpt_cd,
					w.dw_dpt_cd,
					t5.usr_cd,
					t5.trd_cur_cd,
					t4.trd_cur_upri,
					t6.cost_upri,
					t4.tax_cd,
					t4.trd_cur_dscnt_amt,
					t4.trd_unit_qty,
					t4.base_unit_qty,
					m1.conv_qty,
					m1.conv_base_qty,
					m2.dscnt_itm_flg
			UNION ALL
			/* 出荷実績後の売上予定（インボイス取引除く） */
			/* 出荷実績以降、受注なしの出荷実績も対象となる */
			SELECT
				mapa_dt$f_get_ac_ym(
					t1.sls_schd_dt,
					l_cl_day,
					l_cl_mon_base
				) AS ym,
				t3.bp_cd AS cst_cd,
				w.sls_dpt_cd,
				w.crnt_dpt_cd,
				w.dw_dpt_cd,
				t3.usr_cd AS sls_usr_cd,
				t3.trd_cur_cd,
				CASE
					WHEN m3.dscnt_itm_flg = '1' THEN t2.trd_cur_upri * - 1
					ELSE t2.trd_cur_upri
				END AS trd_cur_upri,
				CASE
					WHEN t4.slo_d_no IS NOT NULL THEN t4.cost_upri
					ELSE mapa_std_cost$f_get_std_upri(t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t3.ship_tm, m2.wg_cd, l_gm_std_upri_sel_typ)
				END AS cost_upri,
				t2.tax_cd,
				t2.trd_cur_dscnt_amt,
				t1.trd_unit_qty,
				CASE
					WHEN t1.trd_unit_cd = t1.base_unit_cd THEN t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty
					ELSE (t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty) * conv_base_qty / conv_qty
				END AS trd_unit_rem_qty,
				t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty AS base_unit_rem_qty,
				t2.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				INNER JOIN mst_dlv_slip_d t2 ON (t1.dlv_slip_d_no = t2.dlv_slip_d_no)
				INNER JOIN mst_dlv_slip t3 ON (t2.dlv_slip_no = t3.dlv_slip_no AND t2.dlv_slip_seq = t3.dlv_slip_seq)
				LEFT OUTER JOIN mst_slo_d t4 ON (t1.slo_d_no = t4.slo_d_no)
				LEFT OUTER JOIN mam_dpt d ON (t3.dpt_cd = d.dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN d.st_dt AND d.end_dt)
				LEFT OUTER JOIN mam_dpt_map dm ON (t3.dpt_cd = dm.old_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN dm.st_dt AND dm.end_dt)
				INNER JOIN msw_sls_sum_dpt_lvl w
					ON (CASE
						WHEN d.dpt_cd IS NOT NULL THEN d.dpt_cd
						ELSE dm.new_dpt_cd
					END = w.sls_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) = w.ym)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t1.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_dpt m2 ON (t3.dpt_cd = m2.dpt_cd AND t3.ship_tm BETWEEN m2.st_dt AND m2.end_dt)
				LEFT OUTER JOIN mam_itm m3 ON (t2.itm_cd = m3.itm_cd AND t2.itm_sub1 = m3.itm_sub1 AND t2.itm_sub2 = m3.itm_sub2 AND t2.itm_sub3 = m3.itm_sub3)
			WHERE	0=0
			AND	t1.cmpl_flg = '0'
			AND	t1.sls_schd_dt IS NOT NULL
			AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
			AND	t1.dlv_slip_d_no IS NOT NULL
			AND t1.iv_d_no IS NULL
			AND	t2.dlv_slip_d_seq = (
					SELECT MAX(w2.dlv_slip_d_seq)
					FROM mst_ship_act_d w1
					INNER JOIN mst_dlv_slip_d w2 ON (
						w2.dlv_slip_d_no = w1.dlv_slip_d_no AND w2.dlv_slip_no = w1.dlv_slip_no AND w2.dlv_slip_seq = w1.dlv_slip_seq
					)
					WHERE w1.dlv_slip_d_no = t1.dlv_slip_d_no AND w1.can_flg = '0'
			)
			UNION ALL
			/* 追加したインボイス明細に対応する売上予定（受注がないので、インボイストランから取得する） */
			/* 追加したインボイス明細には一部売上はない */
			SELECT
				mapa_dt$f_get_ac_ym(
					t1.sls_schd_dt,
					l_cl_day,
					l_cl_mon_base
				) AS ym,
				t3.ship_rqst_id_cd AS cst_cd,
				w.sls_dpt_cd,
				w.crnt_dpt_cd,
				w.dw_dpt_cd,
				t2.sls_usr_cd,
				t3.trd_cur_cd,
				CASE
					WHEN m3.dscnt_itm_flg = '1' THEN t2.trd_cur_upri * - 1
					ELSE t2.trd_cur_upri
				END AS trd_cur_upri,
				mapa_std_cost$f_get_std_upri(t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t3.iv_dt, m2.wg_cd, l_gm_std_upri_sel_typ) AS cost_upri,
				t2.tax_cd,
				t2.trd_cur_dscnt_amt,
				t1.trd_unit_qty,
				t1.trd_unit_qty AS trd_unit_rem_qty,
				t1.base_unit_qty AS base_unit_rem_qty,
				t2.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				INNER JOIN mst_iv_d t2 ON (t1.iv_d_no = t2.iv_d_no)
				INNER JOIN mst_iv t3 ON (t2.iv_mng_no = t3.iv_mng_no)
				LEFT OUTER JOIN mam_dpt d ON (t2.sls_dpt_cd = d.dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN d.st_dt AND d.end_dt)
				LEFT OUTER JOIN mam_dpt_map dm ON (t2.sls_dpt_cd = dm.old_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN dm.st_dt AND dm.end_dt)
				INNER JOIN msw_sls_sum_dpt_lvl w
					ON (CASE
						WHEN d.dpt_cd IS NOT NULL THEN d.dpt_cd
						ELSE dm.new_dpt_cd
					END = w.sls_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) = w.ym)
				LEFT OUTER JOIN mam_dpt m2 ON (t2.sls_dpt_cd = m2.dpt_cd AND t3.iv_dt BETWEEN m2.st_dt AND m2.end_dt)
				LEFT OUTER JOIN mam_itm m3 ON (t2.itm_cd = m3.itm_cd AND t2.itm_sub1 = m3.itm_sub1 AND t2.itm_sub2 = m3.itm_sub2 AND t2.itm_sub3 = m3.itm_sub3)
			WHERE	0=0
			AND	t1.cmpl_flg = '0'
			AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
			UNION ALL
			/* 出荷指図の売上予定（インボイス取引。出荷実績後、インボイス登録済は除く） */
			/* 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする */
			SELECT
				mapa_dt$f_get_ac_ym(
					t1.sls_schd_dt,
					l_cl_day,
					l_cl_mon_base
				) AS ym,
				t5.bp_cd AS cst_cd,
				w.sls_dpt_cd,
				w.crnt_dpt_cd,
				w.dw_dpt_cd,
				t5.usr_cd AS sls_usr_cd,
				t5.trd_cur_cd,
				CASE
					WHEN m2.dscnt_itm_flg = '1' THEN t4.trd_cur_upri * - 1
					ELSE t4.trd_cur_upri
				END AS trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				SUM(t3.base_unit_qty - GREATEST(COALESCE(v1.iv_qty, 0), t3.ship_act_qty)) * conv_base_qty / conv_qty AS trd_unit_rem_qty,
				SUM(t3.base_unit_qty - GREATEST(COALESCE(v1.iv_qty, 0), t3.ship_act_qty)) AS base_unit_rem_qty,
				t4.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				JOIN mst_ship_pr t7 ON (t1.slo_d_no = t7.slo_d_no)
				JOIN mst_ship_schd t2 ON (t7.ship_pr_no = t2.ship_pr_no)
				JOIN mst_ship_alloc_sts t3 ON (t2.ship_schd_no = t3.ship_schd_no)
				JOIN mst_dlv_slip_d t4 ON (t3.dlv_slip_no = t4.dlv_slip_no AND t3.dlv_slip_seq = t4.dlv_slip_seq AND t3.dlv_slip_d_no = t4.dlv_slip_d_no)
				JOIN mst_dlv_slip t5 ON (t4.dlv_slip_no = t5.dlv_slip_no AND t4.dlv_slip_seq = t5.dlv_slip_seq)
				JOIN mst_slo_d t6 ON (t1.slo_d_no = t6.slo_d_no)
				LEFT OUTER JOIN(
						SELECT
							st1.ship_alloc_sts_no,
							SUM(st1.base_unit_qty) AS iv_qty
						FROM
							mst_iv_ship_inst_map st1
						GROUP BY
							st1.ship_alloc_sts_no
					) v1 ON (t3.ship_alloc_sts_no = v1.ship_alloc_sts_no)
				LEFT OUTER JOIN mam_dpt d ON (t5.dpt_cd = d.dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN d.st_dt AND d.end_dt)
				LEFT OUTER JOIN mam_dpt_map dm ON (t5.dpt_cd = dm.old_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN dm.st_dt AND dm.end_dt)
				INNER JOIN msw_sls_sum_dpt_lvl w
					ON (CASE
						WHEN d.dpt_cd IS NOT NULL THEN d.dpt_cd
						ELSE dm.new_dpt_cd
					END = w.sls_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) = w.ym)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t1.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2 ON (t2.itm_cd = m2.itm_cd AND t2.itm_sub1 = m2.itm_sub1 AND t2.itm_sub2 = m2.itm_sub2 AND t2.itm_sub3 = m2.itm_sub3)
				LEFT JOIN MAM_BP cst ON (t5.bp_cd = cst.bp_cd AND cst.cst_flg = '1')
				WHERE	0=0
				AND	t1.cmpl_flg = '0'
				AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
				AND	t1.iv_d_no IS NULL
				AND	t3.ship_inst_d_no IS NOT NULL
				AND	cst.cst_iv_flg = '1'
				AND	t3.ship_act_qty < t3.base_unit_qty
				AND	t3.base_unit_qty - GREATEST(COALESCE(v1.iv_qty, 0), t3.ship_act_qty) > 0
				AND	t5.slip_sts_typ IN (c_slip_sts_crt, c_slip_sts_dis)
				GROUP BY
					t1.sls_schd_dt,
					t5.bp_cd,
					w.sls_dpt_cd,
					w.crnt_dpt_cd,
					w.dw_dpt_cd,
					t5.usr_cd,
					t5.trd_cur_cd,
					t4.trd_cur_upri,
					t6.cost_upri,
					t4.tax_cd,
					t4.trd_cur_dscnt_amt,
					t4.trd_unit_qty,
					t4.base_unit_qty,
					m1.conv_qty,
					m1.conv_base_qty,
					m2.dscnt_itm_flg
			UNION ALL
			/* 出荷実績の売上予定（インボイス取引。出荷実績後は除く） */
			/* 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする */
			SELECT
				mapa_dt$f_get_ac_ym(
					t1.sls_schd_dt,
					l_cl_day,
					l_cl_mon_base
				) AS ym,
				t5.bp_cd AS cst_cd,
				w.sls_dpt_cd,
				w.crnt_dpt_cd,
				w.dw_dpt_cd,
				t5.usr_cd AS sls_usr_cd,
				t5.trd_cur_cd,
				CASE
					WHEN m2.dscnt_itm_flg = '1' THEN t4.trd_cur_upri * - 1
					ELSE t4.trd_cur_upri
				END AS trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				SUM(t8.base_unit_qty - t8.ship_ret_qty - COALESCE(v1.iv_qty, 0)) * conv_base_qty / conv_qty AS trd_unit_rem_qty,
				SUM(t8.base_unit_qty - t8.ship_ret_qty - COALESCE(v1.iv_qty, 0)) AS base_unit_rem_qty,
				t4.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				JOIN mst_ship_pr t7 ON (t1.slo_d_no = t7.slo_d_no)
				JOIN mst_ship_schd t2 ON (t7.ship_pr_no = t2.ship_pr_no)
				JOIN mst_ship_alloc_sts t3 ON (t2.ship_schd_no = t3.ship_schd_no)
				JOIN mst_ship_act_d t8 ON (t3.ship_alloc_sts_no = t8.ship_alloc_sts_no)
				JOIN mst_dlv_slip_d t4 ON (t8.dlv_slip_no = t4.dlv_slip_no AND t8.dlv_slip_seq = t4.dlv_slip_seq AND t8.dlv_slip_d_no = t4.dlv_slip_d_no)
				JOIN mst_dlv_slip t5 ON (t4.dlv_slip_no = t5.dlv_slip_no AND t4.dlv_slip_seq = t5.dlv_slip_seq)
				JOIN mst_slo_d t6 ON (t1.slo_d_no = t6.slo_d_no)
				LEFT OUTER JOIN(
						SELECT
							st1.ship_alloc_sts_no,
							SUM(st1.base_unit_qty) AS iv_qty
						FROM
							mst_iv_ship_act_map st1
						GROUP BY
							st1.ship_alloc_sts_no
					) v1 ON (t3.ship_alloc_sts_no = v1.ship_alloc_sts_no)
				LEFT OUTER JOIN mam_dpt d ON (t5.dpt_cd = d.dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN d.st_dt AND d.end_dt)
				LEFT OUTER JOIN mam_dpt_map dm ON (t5.dpt_cd = dm.old_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN dm.st_dt AND dm.end_dt)
				INNER JOIN msw_sls_sum_dpt_lvl w
					ON (CASE
						WHEN d.dpt_cd IS NOT NULL THEN d.dpt_cd
						ELSE dm.new_dpt_cd
					END = w.sls_dpt_cd AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) = w.ym)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t1.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2 ON (t2.itm_cd = m2.itm_cd AND t2.itm_sub1 = m2.itm_sub1 AND t2.itm_sub2 = m2.itm_sub2 AND t2.itm_sub3 = m2.itm_sub3)
				LEFT JOIN MAM_BP cst ON (t5.bp_cd = cst.bp_cd AND cst.cst_flg = '1')
				WHERE	0=0
				AND	t1.cmpl_flg = '0'
				AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
				AND	t1.iv_d_no IS NULL
				AND	cst.cst_iv_flg = '1'
				AND	t8.base_unit_qty - t8.ship_ret_qty - COALESCE(v1.iv_qty, 0) > 0
				AND	t5.slip_sts_typ IN (c_slip_sts_crt, c_slip_sts_dis)
				AND	t8.can_flg = '0'
				GROUP BY
					t1.sls_schd_dt,
					t5.bp_cd,
					w.sls_dpt_cd,
					w.crnt_dpt_cd,
					w.dw_dpt_cd,
					t5.usr_cd,
					t5.trd_cur_cd,
					t4.trd_cur_upri,
					t6.cost_upri,
					t4.tax_cd,
					t4.trd_cur_dscnt_amt,
					t4.trd_unit_qty,
					t4.base_unit_qty,
					m1.conv_qty,
					m1.conv_base_qty,
					m2.dscnt_itm_flg
			) v1
			LEFT OUTER JOIN mam_tax m1 ON (v1.tax_cd = m1.tax_cd)
			LEFT OUTER JOIN mam_bp m2 ON (v1.cst_cd = m2.bp_cd)
			LEFT OUTER JOIN mam_cur m3 ON (v1.trd_cur_cd = m3.cur_cd)
		) v2
	WHERE	0=0
	GROUP BY
		v2.ym,
		v2.sls_dpt_cd,
		v2.crnt_dpt_cd,
		v2.dw_dpt_cd,
		v2.sls_usr_cd,
		v2.cst_cd,
		v2.trd_cur_cd
	;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_sls_bdg_dpt (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	販売予算テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
	登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
	l_dpt_lvl_cd	msw_slo_sls_sum.dpt_lvl_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_dpt_lvl_cd') ;
	l_sls_bdg_grp	mst_sls_bdg.sls_bdg_grp%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_sls_bdg_grp') ;
	l_st_ym		mst_sls_bdg.ym%TYPE ;
	l_end_ym	mst_sls_bdg.ym%TYPE ;
BEGIN
	l_st_ym := i_ym ;

	IF i_sls_disp_term IS NULL THEN
		/* 指定年月のデータのみ抽出 */
		l_end_ym := i_ym ;
	ELSE
		/* 指定年月から表示期間分のデータを抽出 */
		l_end_ym := fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1) ;
	END IF ;

	INSERT INTO msw_slo_sls_sum (
		ym,
		dpt_lvl_cd,
		sls_dpt_cd,
		dpt_cd1,
		dpt_cd2,
		sls_usr_cd,
		cst_cd,
		trd_cur_cd,
		sls_itm_grp_cd,
		wrk_no,
		xrate,
		bdg_sls_amt,
		bdg_sls_prof_amt,
		not_sum_flg,
		spln_usr_flg
	)
	SELECT
		t.ym,
		l_dpt_lvl_cd,
		t.sls_dpt_cd,
		w.crnt_dpt_cd,
		w.dw_dpt_cd,
		t.sls_usr_cd,
		t.cst_cd,
		t.trd_cur_cd,
		t.sls_itm_grp_cd,
		t.wrk_no,
		mapa_xchng$f_get_xrate(
						t.trd_cur_cd,
						l_base_cur_cd,
						l_xrate_cd,
						mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
		t.bdg_sls_amt,
		t.bdg_sls_prof_amt,
		t.not_sum_flg,
		'0'
	FROM
		mst_sls_bdg t
		INNER JOIN msw_sls_sum_dpt_lvl w ON (t.sls_dpt_cd = w.sls_dpt_cd AND t.ym = w.ym)
	WHERE	0=0
	AND	t.ym BETWEEN l_st_ym AND l_end_ym
	AND	(t.sls_bdg_grp = l_sls_bdg_grp OR t.sls_bdg_grp IS NULL AND l_sls_bdg_grp IS NULL)
	;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_spln_sum_dpt (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	販売計画集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
	登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
	l_dpt_lvl_cd	msw_slo_sls_sum.dpt_lvl_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_dpt_lvl_cd') ;
	l_st_ym		mst_spln_sum_itm_new.spln_ym%TYPE ;
	l_end_ym	mst_spln_sum_itm_new.spln_ym%TYPE ;
BEGIN
	l_st_ym := i_ym ;

	IF i_sls_disp_term IS NULL THEN
		/* 指定年月のデータのみ抽出 */
		l_end_ym := i_ym ;
	ELSE
		/* 指定年月から表示期間分のデータを抽出 */
		l_end_ym := fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1) ;
	END IF ;

	/* 担当者含まない */
	INSERT INTO msw_slo_sls_sum (
		ym,
		dpt_lvl_cd,
		sls_dpt_cd,
		dpt_cd1,
		dpt_cd2,
		sls_usr_cd,
		cst_cd,
		trd_cur_cd,
		xrate,
		spln_amt,
		not_sum_flg,
		spln_usr_flg
	)
	SELECT
		t.spln_ym,
		l_dpt_lvl_cd,
		t.dpt_cd,
		w.crnt_dpt_cd,
		w.dw_dpt_cd,
		NULL,
		t.cst_cd,
		t.cur_cd,
		mapa_xchng$f_get_xrate(
						t.cur_cd,
						l_base_cur_cd,
						l_xrate_cd,
						mapa_dt$f_get_ym_st_dt_ne(t.spln_ym, l_cl_day, l_cl_mon_base)),
		t.spln_amt,
		'0',
		'0'
	FROM
		mst_spln_sum_itm_new t
		INNER JOIN msw_sls_sum_dpt_lvl w ON (t.dpt_cd = w.sls_dpt_cd AND t.spln_ym = w.ym)
	WHERE	0=0
	AND	t.spln_ym BETWEEN l_st_ym AND l_end_ym
	;

	/* 担当者含む */
	INSERT INTO msw_slo_sls_sum (
		ym,
		dpt_lvl_cd,
		sls_dpt_cd,
		dpt_cd1,
		dpt_cd2,
		sls_usr_cd,
		cst_cd,
		trd_cur_cd,
		xrate,
		spln_amt,
		not_sum_flg,
		spln_usr_flg
	)
	SELECT
		t.spln_ym,
		l_dpt_lvl_cd,
		t.dpt_cd,
		w.crnt_dpt_cd,
		w.dw_dpt_cd,
		t.usr_cd,
		t.cst_cd,
		t.cur_cd,
		mapa_xchng$f_get_xrate(
						t.cur_cd,
						l_base_cur_cd,
						l_xrate_cd,
						mapa_dt$f_get_ym_st_dt_ne(t.spln_ym, l_cl_day, l_cl_mon_base)),
		t.spln_amt,
		'0',
		'1'
	FROM
		mst_spln_usr_itm_new t
		INNER JOIN msw_sls_sum_dpt_lvl w ON (t.dpt_cd = w.sls_dpt_cd AND t.spln_ym = w.ym)
	WHERE	0=0
	AND	t.spln_ym BETWEEN l_st_ym AND l_end_ym
	;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_sls_sum_ig_main (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC,
	IN i_sls_itm_grp_lvl	NUMERIC,
	IN i_use_act_xrate_flg	CHARACTER,
	IN i_sls_bdg_grp	VARCHAR,
	IN i_xrate_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定年月、売上表示期間より品目体系別用の売上集計受注ワークを作成する
	メイン処理
<REMARKS>
	呼び出し元の処理にて、画面で指定された品目階層の品目階層ＣＤを、
	レベル１として売上集計品目体系階層ワークに登録しておく必要がある。
<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<IN>
	i_sls_itm_grp_lvl
		品目体系階層
<IN>
	i_use_act_xrate_flg
		実績を売上時レートで換算
<IN>
	i_sls_bdg_grp
		予算分類
<IN>
	i_xrate_cd
		為替レートＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	l_co	mam_co%ROWTYPE ;
	l_base_cur_amt_dec_place	mam_cur.amt_dec_place%TYPE ;
	x	RECORD ;
BEGIN
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_use_act_xrate_flg', i_use_act_xrate_flg) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_sls_bdg_grp', i_sls_bdg_grp) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_xrate_cd', i_xrate_cd) ;

	l_co := mapa_co$f_get_co_rec() ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_cl_day', l_co.ac_cl_day) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_cl_mon_base', l_co.ac_cl_mon_base) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_base_cur_cd', l_co.base_cur_cd) ;
	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_gm_std_upri_sel_typ', l_co.gm_std_upri_typ) ;

	SELECT	amt_dec_place
	INTO STRICT	l_base_cur_amt_dec_place
	FROM	mam_cur
	WHERE	cur_cd = l_co.base_cur_cd
	;

	PERFORM fcpa_postgres_util$set_var('mspa_slo_sls_sum', 'g_base_cur_amt_dec_place', l_base_cur_amt_dec_place) ;

	FOR x IN
		SELECT	w.sls_itm_grp_cd
		FROM	msw_sls_sum_ig_lvl w
		WHERE	0=0
		AND	w.lvl = 1
	LOOP
		CALL mspa_slo_sls_sum$p_ins_ig_lvl(x.sls_itm_grp_cd) ;
	END LOOP ;

	CALL mspa_slo_sls_sum$p_ins_sls_sum_itm_grp(i_ym, i_sls_disp_term) ;

	CALL mspa_slo_sls_sum$p_ins_slo_sum_itm_grp(i_ym, i_sls_disp_term) ;

	CALL mspa_slo_sls_sum$p_ins_slo_bl_itm_grp(i_ym, i_sls_disp_term) ;

	CALL mspa_slo_sls_sum$p_ins_sls_bdg_itm_grp(i_ym, i_sls_disp_term) ;

	CALL mspa_slo_sls_sum$p_ins_spln_sum_itm_grp(i_ym, i_sls_disp_term) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_ig_lvl (
	IN i_sls_itm_grp_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定年月、売上表示期間、品目体系ＣＤを条件に売上集計部門階層ワークを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_sls_itm_grp_cd
		品目体系ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN
		SELECT	m.sls_itm_grp_cd
		FROM	mam_sls_itm_grp m
		WHERE	0=0
		AND	m.up_sls_itm_grp_cd = i_sls_itm_grp_cd
	LOOP
		INSERT INTO msw_sls_sum_ig_lvl VALUES (
				x.sls_itm_grp_cd,	/* 品目体系ＣＤ */
				i_sls_itm_grp_cd,	/* 指定階層品目体系ＣＤ */
				x.sls_itm_grp_cd,	/* 下位品目体系ＣＤ */
				2					/* レベル */
				)
		;
	END LOOP ;

	CALL mspa_slo_sls_sum$p_ins_ig_lvl(2, i_sls_itm_grp_cd) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_ig_lvl (
	IN i_lvl	NUMERIC,
	IN i_crnt_sls_itm_grp_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定レベルの売上集計品目体系階層ワークの品目体系ＣＤをもとに、下位階層の
	品目体系ＣＤを取得し、売上集計品目体系階層ワークに登録する。
	最下層の品目体系ＣＤまで同じ処理を繰り返し行う。
<REMARKS>

<ARGUMENTS>
<IN>
	i_lvl
		レベル
<IN>
	i_crnt_sls_itm_grp_cd
		指定階層販売品目体系ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt	NUMERIC ;
	x	RECORD ;
	y	RECORD ;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	msw_sls_sum_ig_lvl w
	WHERE	0=0
	AND	w.lvl = i_lvl
	AND	w.crnt_sls_itm_grp_cd = i_crnt_sls_itm_grp_cd ;

	IF l_cnt > 0 THEN
		FOR x IN
			SELECT
				w.sls_itm_grp_cd, w.crnt_sls_itm_grp_cd, w.dw_sls_itm_grp_cd
			FROM	msw_sls_sum_ig_lvl w
			WHERE	0=0
			AND	w.lvl = i_lvl
			AND	w.crnt_sls_itm_grp_cd = i_crnt_sls_itm_grp_cd
		LOOP
			FOR y IN
				SELECT	m.sls_itm_grp_cd
				FROM	mam_sls_itm_grp m
				WHERE	0=0
				AND	m.up_sls_itm_grp_cd = x.sls_itm_grp_cd
			LOOP
				INSERT INTO msw_sls_sum_ig_lvl VALUES (
							y.sls_itm_grp_cd,
							x.crnt_sls_itm_grp_cd,
							x.dw_sls_itm_grp_cd,
							i_lvl + 1
							)
				;
			END LOOP ;
		END LOOP ;

		CALL mspa_slo_sls_sum$p_ins_ig_lvl(i_lvl + 1, i_crnt_sls_itm_grp_cd) ;

	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_sls_sum_itm_grp (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	売上集計テーブルから品目体系ＣＤをキーとした情報を取得し、
	売上集計受注ワークに登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
BEGIN

	/* 指定年月のデータのみ抽出 */
	IF i_sls_disp_term IS NULL THEN
		INSERT INTO msw_slo_sls_sum (
			ym,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_itm_grp_cd,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			sls_usr_cd,
			cst_cd,
			trd_cur_cd,
			xrate,
			sls_qty,
			sls_amt,
			base_cur_sls_amt,
			sls_cost_amt,
			not_sum_flg,
			spln_usr_flg
		)
		SELECT
			t.ym,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			w.sls_itm_grp_cd,
			w.crnt_sls_itm_grp_cd,
			w.dw_sls_itm_grp_cd,
			t.sls_usr_cd,
			t.cst_cd,
			t.cur_cd,
			mapa_xchng$f_get_xrate(
				t.cur_cd,
				l_base_cur_cd,
				l_xrate_cd,
				mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
			t.base_unit_sls_qty,
			t.trd_cur_sls_amt,
			t.base_cur_sls_amt,
			t.cost_amt,
			'0',
			'0'
		FROM
			mst_sls_sum t
			INNER JOIN mam_itm m ON (t.itm_cd = m.itm_cd AND t.itm_sub1 = m.itm_sub1 AND t.itm_sub2 = m.itm_sub2 AND t.itm_sub3 = m.itm_sub3)
			LEFT OUTER JOIN mam_itm_sub sm ON (t.itm_cd = sm.itm_cd AND t.itm_sub1 = sm.itm_sub1 AND t.itm_sub2 = sm.itm_sub2 AND t.itm_sub3 = sm.itm_sub3
						AND t.ym BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
			INNER JOIN msw_sls_sum_ig_lvl w
				ON (CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m.sls_itm_grp_cd
				END = w.sls_itm_grp_cd)
		WHERE	0=0
		AND	t.ym = i_ym ;
	/* 指定年月から表示期間分のデータを抽出 */
	ELSE
		INSERT INTO msw_slo_sls_sum (
			ym,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_itm_grp_cd,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			sls_usr_cd,
			cst_cd,
			trd_cur_cd,
			xrate,
			sls_qty,
			sls_amt,
			base_cur_sls_amt,
			sls_cost_amt,
			not_sum_flg,
			spln_usr_flg
		)
		SELECT
			t.ym,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			w.sls_itm_grp_cd,
			w.crnt_sls_itm_grp_cd,
			w.dw_sls_itm_grp_cd,
			t.sls_usr_cd,
			t.cst_cd,
			t.cur_cd,
			mapa_xchng$f_get_xrate(
							t.cur_cd,
							l_base_cur_cd,
							l_xrate_cd,
							mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
			t.base_unit_sls_qty,
			t.trd_cur_sls_amt,
			t.base_cur_sls_amt,
			t.cost_amt,
			'0',
			'0'
		FROM
			mst_sls_sum t
			INNER JOIN mam_itm m ON (t.itm_cd = m.itm_cd AND t.itm_sub1 = m.itm_sub1 AND t.itm_sub2 = m.itm_sub2 AND t.itm_sub3 = m.itm_sub3)
			LEFT OUTER JOIN mam_itm_sub sm ON (t.itm_cd = sm.itm_cd AND t.itm_sub1 = sm.itm_sub1 AND t.itm_sub2 = sm.itm_sub2 AND t.itm_sub3 = sm.itm_sub3
						AND t.ym BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
			INNER JOIN msw_sls_sum_ig_lvl w
				ON (CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m.sls_itm_grp_cd
				END = w.sls_itm_grp_cd)
		WHERE	0=0
		AND	t.ym BETWEEN i_ym AND fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1)
		;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_slo_sum_itm_grp (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	受注集計テーブルから品目体系ＣＤをキーとした情報を取得し、
	売上集計受注ワークに登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
BEGIN

	/* 指定年月のデータのみ抽出 */
	IF i_sls_disp_term IS NULL THEN
		INSERT INTO msw_slo_sls_sum (
			ym,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_itm_grp_cd,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			sls_usr_cd,
			cst_cd,
			trd_cur_cd,
			xrate,
			slo_qty,
			slo_amt,
			slo_cost_amt,
			not_sum_flg,
			spln_usr_flg
		)
		SELECT
			t.ym,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.sls_itm_grp_cd,
			w.crnt_sls_itm_grp_cd,
			w.dw_sls_itm_grp_cd,
			t.sls_usr_cd,
			t.cst_cd,
			t.trd_cur_cd,
			mapa_xchng$f_get_xrate(
				t.trd_cur_cd,
				l_base_cur_cd,
				l_xrate_cd,
				mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
			t.base_unit_slo_qty + t.base_unit_pre_slo_qty,
			CASE
				WHEN m1.dscnt_itm_flg = '1' THEN (t.trd_cur_slo_amt + t.trd_cur_pre_slo_amt) * - 1
				ELSE t.trd_cur_slo_amt + t.trd_cur_pre_slo_amt
			END,
			t.slo_cost_amt + t.pre_slo_cost_amt,
			'0',
			'0'
		FROM
			mst_frcst_slo_sum t
			INNER JOIN msw_sls_sum_ig_lvl w ON (t.sls_itm_grp_cd = w.sls_itm_grp_cd)
			LEFT OUTER JOIN mam_itm m1 ON (t.itm_cd = m1.itm_cd AND t.itm_sub1 = m1.itm_sub1 AND t.itm_sub2 = m1.itm_sub2 AND t.itm_sub3 = m1.itm_sub3)
		WHERE	0=0
		AND	t.ym = i_ym
		;
	/* 指定年月から表示期間分のデータを抽出 */
	ELSE
		INSERT INTO msw_slo_sls_sum (
			ym,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_itm_grp_cd,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			sls_usr_cd,
			cst_cd,
			trd_cur_cd,
			xrate,
			slo_qty,
			slo_amt,
			slo_cost_amt,
			not_sum_flg,
			spln_usr_flg
		)
		SELECT
			t.ym,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.sls_itm_grp_cd,
			w.crnt_sls_itm_grp_cd,
			w.dw_sls_itm_grp_cd,
			t.sls_usr_cd,
			t.cst_cd,
			t.trd_cur_cd,
			mapa_xchng$f_get_xrate(
				t.trd_cur_cd,
				l_base_cur_cd,
				l_xrate_cd,
				mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
			t.base_unit_slo_qty + t.base_unit_pre_slo_qty,
			CASE
				WHEN m1.dscnt_itm_flg = '1' THEN (t.trd_cur_slo_amt + t.trd_cur_pre_slo_amt) * - 1
				ELSE t.trd_cur_slo_amt + t.trd_cur_pre_slo_amt
			END,
			t.slo_cost_amt + t.pre_slo_cost_amt,
			'0',
			'0'
		FROM
			mst_frcst_slo_sum t
			INNER JOIN msw_sls_sum_ig_lvl w ON (t.sls_itm_grp_cd = w.sls_itm_grp_cd)
			LEFT OUTER JOIN mam_itm m1 ON (t.itm_cd = m1.itm_cd AND t.itm_sub1 = m1.itm_sub1 AND t.itm_sub2 = m1.itm_sub2 AND t.itm_sub3 = m1.itm_sub3)
		WHERE	0=0
		AND	t.ym BETWEEN i_ym AND fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1)
		;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_slo_bl_itm_grp (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	売上予定テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
	登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	c_rndoff	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;
	c_slip_sts_crt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','CRT') ;
	c_slip_sts_dis	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','DIS') ;

	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_base_cur_amt_dec_place	mam_cur.amt_dec_place%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_amt_dec_place') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
	l_gm_std_upri_sel_typ	mam_co.gm_std_upri_typ%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_gm_std_upri_sel_typ') ;
	l_st_dt		mst_sls_schd.sls_schd_dt%TYPE ;
	l_end_dt	mst_sls_schd.sls_schd_dt%TYPE ;
BEGIN
	l_st_dt := mapa_dt$f_get_ym_st_dt_ne(i_ym, l_cl_day, l_cl_mon_base) ;

	IF i_sls_disp_term IS NULL THEN
		/* 指定年月のデータのみ抽出 */
		l_end_dt := mapa_dt$f_get_ym_end_dt_ne(i_ym, l_cl_day, l_cl_mon_base) ;
	ELSE
		/* 指定年月から表示期間分のデータを抽出 */
		l_end_dt := mapa_dt$f_get_ym_end_dt_ne(fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1), l_cl_day, l_cl_mon_base) ;
	END IF ;

	INSERT INTO msw_slo_sls_sum (
		ym,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		sls_itm_grp_cd,
		sls_itm_grp_cd1,
		sls_itm_grp_cd2,
		sls_usr_cd,
		cst_cd,
		trd_cur_cd,
		xrate,
		slo_bl_qty,
		slo_bl_amt,
		slo_bl_cost_amt,
		not_sum_flg,
		spln_usr_flg
	)
	SELECT
		v2.ym,
		v2.itm_cd,
		v2.itm_sub1,
		v2.itm_sub2,
		v2.itm_sub3,
		v2.sls_itm_grp_cd,
		w.crnt_sls_itm_grp_cd,
		w.dw_sls_itm_grp_cd,
		v2.sls_usr_cd,
		v2.cst_cd,
		v2.trd_cur_cd,
		mapa_xchng$f_get_xrate(
			v2.trd_cur_cd,
			l_base_cur_cd,
			l_xrate_cd,
			mapa_dt$f_get_ym_st_dt_ne(v2.ym, l_cl_day, l_cl_mon_base)
		) AS xrate,
		SUM(v2.slo_bl_qty) AS slo_bl_qty,
		SUM(v2.slo_bl_amt) AS slo_bl_amt,
		SUM(v2.slo_bl_cost_amt) AS slo_bl_cost_amt,
		'0' AS not_sum_flg,
		'0' AS spln_usr_flg
	FROM	(
		SELECT
			v1.ym,
			v1.cst_cd,
			v1.sls_usr_cd,
			v1.trd_cur_cd,
			v1.itm_cd,
			v1.itm_sub1,
			v1.itm_sub2,
			v1.itm_sub3,
			v1.sls_itm_grp_cd,
			v1.base_unit_rem_qty AS slo_bl_qty,
			mapa_amt$f_get_exc_tax_amt(
				v1.trd_cur_upri,
				v1.trd_unit_rem_qty,
				m2.sls_amt_rnd_typ,
				m2.sls_tax_rnd_typ,
				m3.amt_dec_place,
				m1.inc_tax_flg,
				m1.tax_rate,
				mapa_calc$f_rnd_ne(v1.trd_cur_dscnt_amt * v1.base_unit_rem_qty / v1.dscnt_base_qty, m3.amt_dec_place, c_rndoff)
			) AS slo_bl_amt,
			mapa_calc$f_rnd_ne(
				v1.cost_upri * v1.base_unit_rem_qty,
				l_base_cur_amt_dec_place,
				c_rndoff
			) AS slo_bl_cost_amt
		FROM
			(
			/* 未出荷指図、未出荷実績（出荷指図対象外）、仕入直送、インボイス取引（行追加除く）の売上予定 */
			SELECT
				mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) AS ym,
				t3.cst_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m2.sls_itm_grp_cd
				END AS sls_itm_grp_cd,
				t3.sls_usr_cd,
				t3.trd_cur_cd,
				CASE
					WHEN m2.dscnt_itm_flg = '1' THEN t2.trd_cur_upri * - 1
					ELSE t2.trd_cur_upri
				END AS trd_cur_upri,
				t2.cost_upri,
				t2.tax_cd,
				t2.trd_cur_dscnt_amt,
				t1.trd_unit_qty,
				CASE
					WHEN cst.cst_iv_flg = '1' THEN
						CASE
							WHEN t2.trd_unit_cd = t2.base_unit_cd THEN t4.base_unit_qty - t4.ship_schd_abort_qty - t4.ship_ret_qty - GREATEST(t4.iv_schd_qty, t4.ship_inst_qty, t4.ship_act_qty)
							ELSE (t4.base_unit_qty - t4.ship_schd_abort_qty - t4.ship_ret_qty - GREATEST(t4.iv_schd_qty, t4.ship_inst_qty, t4.ship_act_qty)) * conv_base_qty / conv_qty
						END
					ELSE
						CASE
							WHEN t2.trd_unit_cd = t1.base_unit_cd THEN t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty
							ELSE (t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty) * conv_base_qty / conv_qty
						END 
				END AS trd_unit_rem_qty,
				CASE
					WHEN cst.cst_iv_flg = '1' THEN t4.base_unit_qty - t4.ship_schd_abort_qty - t4.ship_ret_qty - GREATEST(t4.iv_schd_qty, t4.ship_inst_qty, t4.ship_act_qty)
					ELSE t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty
				END AS base_unit_rem_qty,
				t2.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				INNER JOIN mst_slo_d t2 ON (t1.slo_d_no = t2.slo_d_no)
				INNER JOIN mst_slo t3 ON (t2.slo_no = t3.slo_no)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t2.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2 ON (t2.itm_cd = m2.itm_cd AND t2.itm_sub1 = m2.itm_sub1 AND t2.itm_sub2 = m2.itm_sub2 AND t2.itm_sub3 = m2.itm_sub3)
				LEFT OUTER JOIN mam_itm_sub sm ON (t2.itm_cd = sm.itm_cd AND t2.itm_sub1 = sm.itm_sub1 AND t2.itm_sub2 = sm.itm_sub2 AND t2.itm_sub3 = sm.itm_sub3
							AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
				LEFT OUTER JOIN mam_bp cst ON (t3.cst_cd = cst.bp_cd AND cst.cst_flg = '1')
				LEFT OUTER JOIN mst_ship_pr t4 ON (t2.slo_d_no = t4.slo_d_no)
			WHERE	0=0
			AND	t1.cmpl_flg = '0'
			AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
			AND	t1.slo_d_no IS NOT NULL
			AND	t1.ship_inst_d_no IS NULL
			AND	t1.dlv_slip_d_no IS NULL
			AND t1.iv_d_no IS NULL
			AND CASE
					WHEN cst.cst_iv_flg = '1' THEN t4.base_unit_qty - t4.ship_schd_abort_qty - t4.ship_ret_qty - GREATEST(t4.iv_schd_qty, t4.ship_inst_qty, t4.ship_act_qty)
					ELSE t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty
				END > 0
			UNION ALL
			/* 出荷指図の売上予定（出荷実績後は除く） */
			/* 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする */
			SELECT
				mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) AS ym,
				t5.bp_cd AS cst_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m2.sls_itm_grp_cd
				END AS sls_itm_grp_cd,
				t5.usr_cd AS sls_usr_cd,
				t5.trd_cur_cd,
				CASE
					WHEN m2.dscnt_itm_flg = '1' THEN t4.trd_cur_upri * - 1
					ELSE t4.trd_cur_upri
				END AS trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				SUM(t3.base_unit_qty - t3.ship_act_qty) * conv_base_qty / conv_qty AS trd_unit_rem_qty, SUM(t3.base_unit_qty - t3.ship_act_qty) AS base_unit_rem_qty,
				t4.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				JOIN mst_ship_schd t2 ON (t1.ship_schd_no = t2.ship_schd_no)
				JOIN mst_ship_alloc_sts t3 ON (t2.ship_schd_no = t3.ship_schd_no)
				JOIN mst_dlv_slip_d t4 ON (t3.dlv_slip_d_no = t4.dlv_slip_d_no AND t3.dlv_slip_no = t4.dlv_slip_no AND t3.dlv_slip_seq = t4.dlv_slip_seq)
				JOIN mst_dlv_slip t5 ON (t4.dlv_slip_no = t5.dlv_slip_no AND t4.dlv_slip_seq = t5.dlv_slip_seq)
				JOIN mst_slo_d t6 ON (t1.slo_d_no = t6.slo_d_no)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t1.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2 ON (t2.itm_cd = m2.itm_cd AND t2.itm_sub1 = m2.itm_sub1 AND t2.itm_sub2 = m2.itm_sub2 AND t2.itm_sub3 = m2.itm_sub3)
				LEFT OUTER JOIN mam_itm_sub sm ON (t2.itm_cd = sm.itm_cd AND t2.itm_sub1 = sm.itm_sub1 AND t2.itm_sub2 = sm.itm_sub2 AND t2.itm_sub3 = sm.itm_sub3
							AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
			WHERE	0=0
			AND	t1.cmpl_flg = '0'
			AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
			AND	t1.dlv_slip_d_no IS NULL
			AND	t3.ship_inst_d_no IS NOT NULL
			AND	t3.ship_act_qty < t3.base_unit_qty
			AND	t5.slip_sts_typ IN (c_slip_sts_crt, c_slip_sts_dis)
			GROUP BY
				t1.sls_schd_dt,
				t5.bp_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m2.sls_itm_grp_cd
				END,
				t5.usr_cd,
				t5.trd_cur_cd,
				t4.trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				t4.base_unit_qty,
				m1.conv_qty,
				m1.conv_base_qty,
				m2.dscnt_itm_flg
			UNION ALL
			/* 出荷実績後の売上予定（インボイス取引除く） */
			/* 出荷実績以降、受注なしの出荷実績も対象となる */
			SELECT
				mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) AS ym,
				t3.bp_cd AS cst_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m3.sls_itm_grp_cd
				END,
				t3.usr_cd AS sls_usr_cd,
				t3.trd_cur_cd,
				CASE
					WHEN m3.dscnt_itm_flg = '1' THEN t2.trd_cur_upri * - 1
					ELSE t2.trd_cur_upri
				END AS trd_cur_upri,
				CASE
					WHEN t4.slo_d_no IS NOT NULL THEN t4.cost_upri
					ELSE mapa_std_cost$f_get_std_upri(t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t3.ship_tm, m2.wg_cd, l_gm_std_upri_sel_typ)
				END AS cost_upri,
				t2.tax_cd,
				t2.trd_cur_dscnt_amt,
				t1.trd_unit_qty,
				CASE
					WHEN t1.trd_unit_cd = t1.base_unit_cd THEN t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty
					ELSE (t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty) * conv_base_qty / conv_qty
				END AS trd_unit_rem_qty,
				t1.base_unit_qty - t1.base_unit_abort_qty - t1.base_unit_sls_qty AS base_unit_rem_qty,
				t2.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				INNER JOIN mst_dlv_slip_d t2 ON (t1.dlv_slip_d_no = t2.dlv_slip_d_no)
				INNER JOIN mst_dlv_slip t3 ON (t2.dlv_slip_no = t3.dlv_slip_no AND t2.dlv_slip_seq = t3.dlv_slip_seq)
				LEFT OUTER JOIN mst_slo_d t4 ON (t1.slo_d_no = t4.slo_d_no)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t1.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_dpt m2 ON (t3.dpt_cd = m2.dpt_cd AND t3.ship_tm BETWEEN m2.st_dt AND m2.end_dt)
				LEFT OUTER JOIN mam_itm m3 ON (t2.itm_cd = m3.itm_cd AND t2.itm_sub1 = m3.itm_sub1 AND t2.itm_sub2 = m3.itm_sub2 AND t2.itm_sub3 = m3.itm_sub3)
				LEFT OUTER JOIN mam_itm_sub sm ON (t2.itm_cd = sm.itm_cd AND t2.itm_sub1 = sm.itm_sub1 AND t2.itm_sub2 = sm.itm_sub2 AND t2.itm_sub3 = sm.itm_sub3
							AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
				WHERE	0=0
				AND	t1.cmpl_flg = '0'
				AND	t1.sls_schd_dt IS NOT NULL
				AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
				AND	t1.dlv_slip_d_no IS NOT NULL
				AND t1.iv_d_no IS NULL
				AND	t2.dlv_slip_d_seq = (
						SELECT MAX(w2.dlv_slip_d_seq)
						FROM mst_ship_act_d w1
						INNER JOIN mst_dlv_slip_d w2 ON (
							w2.dlv_slip_d_no = w1.dlv_slip_d_no AND w2.dlv_slip_no = w1.dlv_slip_no AND w2.dlv_slip_seq = w1.dlv_slip_seq
						)
						WHERE w1.dlv_slip_d_no = t1.dlv_slip_d_no AND w1.can_flg = '0'
				)
			UNION ALL
			/* 追加したインボイス明細に対応する売上予定（受注がないので、インボイストランから取得する） */
			/* 追加したインボイス明細には一部売上はない */
			SELECT
				mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) AS ym,
				t3.ship_rqst_id_cd AS cst_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m3.sls_itm_grp_cd
				END, t2.sls_usr_cd, t3.trd_cur_cd,
				CASE
					WHEN m3.dscnt_itm_flg = '1' THEN t2.trd_cur_upri * - 1
					ELSE t2.trd_cur_upri
				END AS trd_cur_upri,
				mapa_std_cost$f_get_std_upri(t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t3.iv_dt, m2.wg_cd, l_gm_std_upri_sel_typ) AS cost_upri,
				t2.tax_cd,
				t2.trd_cur_dscnt_amt,
				t1.trd_unit_qty,
				t1.trd_unit_qty AS trd_unit_rem_qty,
				t1.base_unit_qty AS base_unit_rem_qty,
				t2.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				INNER JOIN mst_iv_d t2 ON (t1.iv_d_no = t2.iv_d_no)
				INNER JOIN mst_iv t3 ON (t2.iv_mng_no = t3.iv_mng_no)
				LEFT OUTER JOIN mam_dpt m2 ON (t2.sls_dpt_cd = m2.dpt_cd AND t3.iv_dt BETWEEN m2.st_dt AND m2.end_dt)
				LEFT OUTER JOIN mam_itm m3 ON (t2.itm_cd = m3.itm_cd AND t2.itm_sub1 = m3.itm_sub1 AND t2.itm_sub2 = m3.itm_sub2 AND t2.itm_sub3 = m3.itm_sub3)
				LEFT OUTER JOIN mam_itm_sub sm ON (t2.itm_cd = sm.itm_cd AND t2.itm_sub1 = sm.itm_sub1 AND t2.itm_sub2 = sm.itm_sub2 AND t2.itm_sub3 = sm.itm_sub3
							AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
			WHERE	0=0
			AND	t1.cmpl_flg = '0'
			AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
			UNION ALL
			/* 出荷指図の売上予定（インボイス取引。出荷実績後、インボイス登録済は除く） */
			/* 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする */
			SELECT
				mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) AS ym,
				t5.bp_cd AS cst_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m2.sls_itm_grp_cd
				END AS sls_itm_grp_cd,
				t5.usr_cd AS sls_usr_cd,
				t5.trd_cur_cd,
				CASE
					WHEN m2.dscnt_itm_flg = '1' THEN t4.trd_cur_upri * - 1
					ELSE t4.trd_cur_upri
				END AS trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				SUM(t3.base_unit_qty - GREATEST(COALESCE(v1.iv_qty, 0), t3.ship_act_qty)) * conv_base_qty / conv_qty AS trd_unit_rem_qty,
				SUM(t3.base_unit_qty - GREATEST(COALESCE(v1.iv_qty, 0), t3.ship_act_qty)) AS base_unit_rem_qty,
				t4.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				JOIN mst_ship_pr t7 ON (t1.slo_d_no = t7.slo_d_no)
				JOIN mst_ship_schd t2 ON (t7.ship_pr_no = t2.ship_pr_no)
				JOIN mst_ship_alloc_sts t3 ON (t2.ship_schd_no = t3.ship_schd_no)
				JOIN mst_dlv_slip_d t4 ON (t3.dlv_slip_no = t4.dlv_slip_no AND t3.dlv_slip_seq = t4.dlv_slip_seq AND t3.dlv_slip_d_no = t4.dlv_slip_d_no)
				JOIN mst_dlv_slip t5 ON (t4.dlv_slip_no = t5.dlv_slip_no AND t4.dlv_slip_seq = t5.dlv_slip_seq)
				JOIN mst_slo_d t6 ON (t1.slo_d_no = t6.slo_d_no)
				LEFT OUTER JOIN(
						SELECT
							st1.ship_alloc_sts_no,
							SUM(st1.base_unit_qty) AS iv_qty
						FROM
							mst_iv_ship_inst_map st1
						GROUP BY
							st1.ship_alloc_sts_no
					) v1 ON (t3.ship_alloc_sts_no = v1.ship_alloc_sts_no)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t1.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2 ON (t2.itm_cd = m2.itm_cd AND t2.itm_sub1 = m2.itm_sub1 AND t2.itm_sub2 = m2.itm_sub2 AND t2.itm_sub3 = m2.itm_sub3)
				LEFT OUTER JOIN mam_itm_sub sm ON (t2.itm_cd = sm.itm_cd AND t2.itm_sub1 = sm.itm_sub1 AND t2.itm_sub2 = sm.itm_sub2 AND t2.itm_sub3 = sm.itm_sub3
							AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
				LEFT JOIN MAM_BP cst ON (t5.bp_cd = cst.bp_cd AND cst.cst_flg = '1')
			WHERE	0=0
			AND	t1.cmpl_flg = '0'
			AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
			AND	t1.iv_d_no IS NULL
			AND	t3.ship_inst_d_no IS NOT NULL
			AND	cst.cst_iv_flg = '1'
			AND	t3.ship_act_qty < t3.base_unit_qty
			AND	t3.base_unit_qty - GREATEST(COALESCE(v1.iv_qty, 0), t3.ship_act_qty) > 0
			AND	t5.slip_sts_typ IN (c_slip_sts_crt, c_slip_sts_dis)
			AND	t5.dlv_slip_act_no IS NULL
			GROUP BY
				t1.sls_schd_dt,
				t5.bp_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m2.sls_itm_grp_cd
				END,
				t5.usr_cd,
				t5.trd_cur_cd,
				t4.trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				t4.base_unit_qty,
				m1.conv_qty,
				m1.conv_base_qty,
				m2.dscnt_itm_flg
			UNION ALL
			/* 出荷実績の売上予定（インボイス取引。出荷実績後は除く） */
			/* 納品書明細と出荷引当状況から適切な取引単位残数が計算できないので、常に基準単位からの逆換算とする */
			SELECT
				mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) AS ym,
				t5.bp_cd AS cst_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m2.sls_itm_grp_cd
				END AS sls_itm_grp_cd,
				t5.usr_cd AS sls_usr_cd,
				t5.trd_cur_cd,
				CASE
					WHEN m2.dscnt_itm_flg = '1' THEN t4.trd_cur_upri * - 1
					ELSE t4.trd_cur_upri
				END AS trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				SUM(t8.base_unit_qty - t8.ship_ret_qty - COALESCE(v1.iv_qty, 0)) * conv_base_qty / conv_qty AS trd_unit_rem_qty,
				SUM(t8.base_unit_qty - t8.ship_ret_qty - COALESCE(v1.iv_qty, 0)) AS base_unit_rem_qty,
				t4.base_unit_qty AS dscnt_base_qty
			FROM
				mst_sls_schd t1
				JOIN mst_ship_pr t7 ON (t1.slo_d_no = t7.slo_d_no)
				JOIN mst_ship_schd t2 ON (t7.ship_pr_no = t2.ship_pr_no)
				JOIN mst_ship_alloc_sts t3 ON (t2.ship_schd_no = t3.ship_schd_no)
				JOIN mst_ship_act_d t8 ON (t3.ship_alloc_sts_no = t8.ship_alloc_sts_no)
				JOIN mst_dlv_slip_d t4 ON (t8.dlv_slip_no = t4.dlv_slip_no AND t8.dlv_slip_seq = t4.dlv_slip_seq AND t8.dlv_slip_d_no = t4.dlv_slip_d_no)
				JOIN mst_dlv_slip t5 ON (t4.dlv_slip_no = t5.dlv_slip_no AND t4.dlv_slip_seq = t5.dlv_slip_seq)
				JOIN mst_slo_d t6 ON (t1.slo_d_no = t6.slo_d_no)
				LEFT OUTER JOIN(
						SELECT
							st1.ship_alloc_sts_no,
							SUM(st1.base_unit_qty) AS iv_qty
						FROM
							mst_iv_ship_act_map st1
						GROUP BY
							st1.ship_alloc_sts_no
					) v1 ON (t3.ship_alloc_sts_no = v1.ship_alloc_sts_no)
				LEFT OUTER JOIN mavm_itm_unit m1 ON (t2.itm_cd = m1.itm_cd AND t2.itm_sub1 = m1.itm_sub1 AND t2.itm_sub2 = m1.itm_sub2 AND t2.itm_sub3 = m1.itm_sub3 AND t1.trd_unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2 ON (t2.itm_cd = m2.itm_cd AND t2.itm_sub1 = m2.itm_sub1 AND t2.itm_sub2 = m2.itm_sub2 AND t2.itm_sub3 = m2.itm_sub3)
				LEFT OUTER JOIN mam_itm_sub sm ON (t2.itm_cd = sm.itm_cd AND t2.itm_sub1 = sm.itm_sub1 AND t2.itm_sub2 = sm.itm_sub2 AND t2.itm_sub3 = sm.itm_sub3
							AND mapa_dt$f_get_ac_ym(t1.sls_schd_dt, l_cl_day, l_cl_mon_base) BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
				LEFT JOIN MAM_BP cst ON (t5.bp_cd = cst.bp_cd AND cst.cst_flg = '1')
			WHERE	0=0
			AND	t1.cmpl_flg = '0'
			AND	t1.sls_schd_dt BETWEEN l_st_dt AND l_end_dt
			AND	t1.iv_d_no IS NULL
			AND	cst.cst_iv_flg = '1'
			AND	t8.base_unit_qty - t8.ship_ret_qty - COALESCE(v1.iv_qty, 0) > 0
			AND	t5.slip_sts_typ IN (c_slip_sts_crt, c_slip_sts_dis)
			AND	t8.can_flg = '0'
			GROUP BY
				t1.sls_schd_dt,
				t5.bp_cd,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m2.sls_itm_grp_cd
				END,
				t5.usr_cd,
				t5.trd_cur_cd,
				t4.trd_cur_upri,
				t6.cost_upri,
				t4.tax_cd,
				t4.trd_cur_dscnt_amt,
				t4.trd_unit_qty,
				t4.base_unit_qty,
				m1.conv_qty,
				m1.conv_base_qty,
				m2.dscnt_itm_flg
			) v1
			LEFT OUTER JOIN mam_tax m1 ON (v1.tax_cd = m1.tax_cd)
			LEFT OUTER JOIN mam_bp m2 ON (v1.cst_cd = m2.bp_cd)
			LEFT OUTER JOIN mam_cur m3 ON (v1.trd_cur_cd = m3.cur_cd)
		) v2
	INNER JOIN msw_sls_sum_ig_lvl w ON (v2.sls_itm_grp_cd = w.sls_itm_grp_cd)
	WHERE	0=0
	GROUP BY
		v2.ym,
		v2.itm_cd,
		v2.itm_sub1,
		v2.itm_sub2,
		v2.itm_sub3,
		v2.sls_itm_grp_cd,
		w.crnt_sls_itm_grp_cd,
		w.dw_sls_itm_grp_cd,
		v2.sls_usr_cd,
		v2.cst_cd,
		v2.trd_cur_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_sls_bdg_itm_grp (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	販売予算テーブルから品目体系ＣＤをキーとした情報を取得し、
	売上集計受注ワークに登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
	l_sls_bdg_grp	mst_sls_bdg.sls_bdg_grp%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_sls_bdg_grp') ;
BEGIN

    /* 指定年月のデータのみ抽出 */
	IF i_sls_disp_term IS NULL THEN
		INSERT INTO msw_slo_sls_sum (
			ym,
			sls_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_itm_grp_cd,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			sls_usr_cd,
			cst_cd,
			trd_cur_cd,
			wrk_no,
			xrate,
			bdg_sls_amt,
			bdg_sls_prof_amt,
			not_sum_flg,
			spln_usr_flg
		)
		SELECT
			t.ym,
			t.sls_dpt_cd,
			NULL,
			NULL,
			NULL,
			NULL,
			t.sls_itm_grp_cd,
			w.crnt_sls_itm_grp_cd,
			w.dw_sls_itm_grp_cd,
			t.sls_usr_cd,
			t.cst_cd,
			t.trd_cur_cd,
			t.wrk_no,
			mapa_xchng$f_get_xrate(
							t.trd_cur_cd,
							l_base_cur_cd,
							l_xrate_cd,
							mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
			t.bdg_sls_amt,
			t.bdg_sls_prof_amt,
			t.not_sum_flg,
			'0'
		FROM
			mst_sls_bdg t
			INNER JOIN msw_sls_sum_ig_lvl w ON (t.sls_itm_grp_cd = w.sls_itm_grp_cd)
		WHERE	0=0
		AND	t.ym = i_ym
		AND	(t.sls_bdg_grp = l_sls_bdg_grp OR t.sls_bdg_grp IS NULL AND l_sls_bdg_grp IS NULL)
		AND	t.sls_itm_grp_not_sum_flg = '0'
		;
	/* 指定年月から表示期間分のデータを抽出 */
	ELSE
		INSERT INTO msw_slo_sls_sum (
			ym,
			sls_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_itm_grp_cd,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			sls_usr_cd,
			cst_cd,
			trd_cur_cd,
			wrk_no,
			xrate,
			bdg_sls_amt,
			bdg_sls_prof_amt,
			not_sum_flg,
			spln_usr_flg
		)
		SELECT
			t.ym,
			t.sls_dpt_cd,
			NULL,
			NULL,
			NULL,
			NULL,
			t.sls_itm_grp_cd,
			w.crnt_sls_itm_grp_cd,
			w.dw_sls_itm_grp_cd,
			t.sls_usr_cd,
			t.cst_cd,
			t.trd_cur_cd,
			t.wrk_no,
			mapa_xchng$f_get_xrate(
							t.trd_cur_cd,
							l_base_cur_cd,
							l_xrate_cd,
							mapa_dt$f_get_ym_st_dt_ne(t.ym, l_cl_day, l_cl_mon_base)),
			t.bdg_sls_amt,
			t.bdg_sls_prof_amt,
			t.not_sum_flg,
			'0'
		FROM
			mst_sls_bdg t
			INNER JOIN msw_sls_sum_ig_lvl w ON (t.sls_itm_grp_cd = w.sls_itm_grp_cd)
		WHERE	0=0
		AND	t.ym BETWEEN i_ym AND fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1)
		AND	(t.sls_bdg_grp = l_sls_bdg_grp OR t.sls_bdg_grp IS NULL AND l_sls_bdg_grp IS NULL)
		AND	t.sls_itm_grp_not_sum_flg = '0'
		;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_slo_sls_sum$p_ins_spln_sum_itm_grp (
	IN i_ym	TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_disp_term	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	販売計画集計テーブルから品目体系ＣＤをキーとした情報を取得し、
	売上集計受注ワークに登録する。
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym
		指定年月
<IN>
	i_sls_disp_term
		売上表示期間
<HISTORY>
**************************************************************************/
DECLARE
	l_base_cur_cd	mam_co.base_cur_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_base_cur_cd') ;
	l_cl_day		mam_co.ac_cl_day%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_day') ;
	l_cl_mon_base	mam_co.ac_cl_mon_base%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_cl_mon_base') ;
	l_xrate_cd		mam_cur_xrate.xrate_cd%TYPE := fcpa_postgres_util$get_var('mspa_slo_sls_sum', 'g_xrate_cd') ;
BEGIN

	/* 指定年月のデータのみ抽出 */
	IF i_sls_disp_term IS NULL THEN
		INSERT INTO msw_slo_sls_sum (
			ym,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_itm_grp_cd,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			sls_usr_cd,
			cst_cd,
			trd_cur_cd,
			xrate,
			spln_qty,
			spln_amt,
			not_sum_flg,
			spln_usr_flg
		)
		SELECT
			t.spln_ym,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			w.sls_itm_grp_cd,
			w.crnt_sls_itm_grp_cd,
			w.dw_sls_itm_grp_cd,
			NULL,
			t.cst_cd,
			t.cur_cd,
			mapa_xchng$f_get_xrate(
							t.cur_cd,
							l_base_cur_cd,
							l_xrate_cd,
							mapa_dt$f_get_ym_st_dt_ne(t.spln_ym, l_cl_day, l_cl_mon_base)),
			t.spln_qty,
			t.spln_amt,
			'0',
			'0'
		FROM
			mst_spln_sum_itm_new t
			INNER JOIN mam_itm m ON (t.itm_cd = m.itm_cd AND t.itm_sub1 = m.itm_sub1 AND t.itm_sub2 = m.itm_sub2 AND t.itm_sub3 = m.itm_sub3)
			LEFT OUTER JOIN mam_itm_sub sm ON (t.itm_cd = sm.itm_cd AND t.itm_sub1 = sm.itm_sub1 AND t.itm_sub2 = sm.itm_sub2 AND t.itm_sub3 = sm.itm_sub3
						AND t.ym BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
			INNER JOIN msw_sls_sum_ig_lvl w
				ON (CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m.sls_itm_grp_cd
				END = w.sls_itm_grp_cd)
		WHERE	0=0
		AND	t.spln_ym = i_ym
		;
	/* 指定年月から表示期間分のデータを抽出 */
	ELSE
		INSERT INTO msw_slo_sls_sum (
			ym,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_itm_grp_cd,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			sls_usr_cd,
			cst_cd,
			trd_cur_cd,
			xrate,
			spln_qty,
			spln_amt,
			not_sum_flg,
			spln_usr_flg
		)
		SELECT
			t.spln_ym,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			w.sls_itm_grp_cd,
			w.crnt_sls_itm_grp_cd,
			w.dw_sls_itm_grp_cd,
			NULL,
			t.cst_cd,
			t.cur_cd,
			mapa_xchng$f_get_xrate(
							t.cur_cd,
							l_base_cur_cd,
							l_xrate_cd,
							mapa_dt$f_get_ym_st_dt_ne(t.spln_ym, l_cl_day, l_cl_mon_base)),
			t.spln_qty,
			t.spln_amt,
			'0',
			'0'
		FROM
			mst_spln_sum_itm_new t
			INNER JOIN mam_itm m ON (t.itm_cd = m.itm_cd AND t.itm_sub1 = m.itm_sub1 AND t.itm_sub2 = m.itm_sub2 AND t.itm_sub3 = m.itm_sub3)
			LEFT OUTER JOIN mam_itm_sub sm ON (t.itm_cd = sm.itm_cd AND t.itm_sub1 = sm.itm_sub1 AND t.itm_sub2 = sm.itm_sub2 AND t.itm_sub3 = sm.itm_sub3
						AND t.ym BETWEEN sm.st_dt AND sm.end_dt AND sm.del_flg = '0')
			INNER JOIN msw_sls_sum_ig_lvl w
				ON (CASE
					WHEN sm.itm_cd IS NOT NULL THEN sm.sls_itm_grp_cd
					ELSE m.sls_itm_grp_cd
				END = w.sls_itm_grp_cd)
		WHERE	0=0
		AND	t.spln_ym BETWEEN i_ym AND fcpa_postgres_util$add_months(i_ym, i_sls_disp_term - 1)
		;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;
