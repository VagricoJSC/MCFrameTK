CREATE OR REPLACE PROCEDURE mspa_frcst_slo_sum$p_ins_wk(
	 IN i_sum_st_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sls_dpt_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	顧客内示・受注集計テーブルを更新するためのワークテーブルを登録する
<REMARKS>

<ARGUMENTS>
<IN>
	i_sls_st_ym
		集計開始年月
<IN>
	i_sls_dpt_cd
		売上部門ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_slo_typ_slo CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_SLO_TYP','SLO');
	c_slo_typ_pre_slo CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_SLO_TYP','PRE_SLO');
	c_trd_ptn_typ_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_TRD_PTN_TYP','SLS');
	c_ship_inst_typ_pick CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SHIP_INST_TYP','PICK');
	c_ship_inst_typ_non CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SHIP_INST_TYP','NON');
	c_mac_rnd_typ_rndoff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF');

	l_co mam_co%ROWTYPE;
	l_sum_st_dt TIMESTAMP WITHOUT TIME ZONE;
BEGIN

	l_co := mapa_co$f_get_co_rec();
	l_sum_st_dt := mapa_dt$f_get_ym_st_dt_ne(i_sum_st_ym, l_co.ac_cl_day, l_co.ac_cl_mon_base);

	INSERT INTO msw_frcst_slo_sum (
		ym,
		sls_dpt_cd,
		sls_usr_cd,
		cst_cd,
		wrk_no,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		trd_cur_cd,
		spln_itm_cd,
		sls_itm_grp_cd,
		base_unit_slo_qty,
		trd_cur_slo_amt,
		slo_cost_amt,
		base_unit_pre_slo_qty,
		trd_cur_pre_slo_amt,
		pre_slo_cost_amt,
		cst_frcst_qty,
		trd_cur_cst_frcst_amt,
		usr_cst_cd,
		usr_wrk_no,
		sum_cst_cd,
		sum_wrk_no,
		dt,
		upri_unit_cd,
		lot_qty
	)
	SELECT
		v.ym,
		v.sls_dpt_cd,
		v.sls_usr_cd,
		v.cst_cd,
		COALESCE(v.wrk_no, c_null_val) AS wrk_no,
		v.itm_cd,
		v.itm_sub1,
		v.itm_sub2,
		v.itm_sub3,
		v.trd_cur_cd,
		m1.spln_itm_cd,
		mapa_itm$f_get_sls_itm_grp_cd(v.itm_cd, v.itm_sub1, v.itm_sub2, v.itm_sub3, v.ym) AS sls_itm_grp,
		v.base_unit_slo_qty,
		v.trd_cur_slo_amt,
		v.slo_cost_amt,
		v.base_unit_pre_slo_qty,
		v.trd_cur_pre_slo_amt,
		v.pre_slo_cost_amt,
		v.cst_frcst_qty,
		0 AS trd_cur_cst_frcst_amt,		/* 顧客期間内示の金額は別途計算する */
		c_null_val AS usr_cst_cd,
		c_null_val AS usr_wrk_no,
		c_null_val AS sum_cst_cd,
		c_null_val AS sum_wrk_no,
		v.dt,
		m1.upri_unit_cd,
		m1.lot_qty
	FROM
		(/* 受注金額 */
		SELECT
			mapa_dt$f_get_ac_ym(COALESCE(t2.slo_sum_base_dt, COALESCE(t2.dlv_rqst_tm, t1.slo_dt))) AS ym,
			t1.sls_dpt_cd,
			t1.sls_usr_cd,
			t1.cst_cd,
			t1.wrk_no,
			t2.itm_cd,
			t2.itm_sub1,
			t2.itm_sub2,
			t2.itm_sub3,
			t1.trd_cur_cd,
			CASE t1.slo_typ
				WHEN c_slo_typ_slo THEN t2.base_unit_qty
				WHEN c_slo_typ_pre_slo THEN 0
			END AS base_unit_slo_qty,
			CASE t1.slo_typ
				WHEN c_slo_typ_slo THEN t2.trd_cur_amt
				WHEN c_slo_typ_pre_slo THEN 0
			END AS trd_cur_slo_amt,
			CASE t1.slo_typ
				WHEN c_slo_typ_slo THEN COALESCE(t2.cost_amt, 0)
				WHEN c_slo_typ_pre_slo THEN 0
			END AS slo_cost_amt,
			CASE t1.slo_typ
				WHEN c_slo_typ_slo THEN 0
				WHEN c_slo_typ_pre_slo THEN t2.base_unit_qty
			END AS base_unit_pre_slo_qty,
			CASE t1.slo_typ
				WHEN c_slo_typ_slo THEN 0
				WHEN c_slo_typ_pre_slo THEN t2.trd_cur_amt
			END AS trd_cur_pre_slo_amt,
			CASE t1.slo_typ
				WHEN c_slo_typ_slo THEN 0
				WHEN c_slo_typ_pre_slo THEN COALESCE(t2.cost_amt, 0)
			END AS pre_slo_cost_amt,
			0 AS cst_frcst_qty,
			NULL::TIMESTAMP WITHOUT TIME ZONE AS dt
			FROM
				mst_slo t1
				JOIN mst_slo_d t2 ON (t1.slo_no = t2.slo_no)
			WHERE	0=0
			AND	t1.can_flg = '0'
			AND	t1.trd_ptn_typ = c_trd_ptn_typ_sls
			AND	t2.vmi_flg = '0'
			AND	t2.can_flg = '0'
			AND	t2.abort_flg = '0'	/* 受注明細の打切は、取消と同様に扱う(出荷予定の打切はカウントする） */
			AND	t2.bd_dpt_cd IS NULL
			AND	t2.slo_sum_base_dt >= l_sum_st_dt
			AND	(t1.sls_dpt_cd = i_sls_dpt_cd OR i_sls_dpt_cd IS NULL)
			UNION ALL
			/* 受注金額(残数打ち切り) */
			SELECT
				mapa_dt$f_get_ac_ym(COALESCE(t2.slo_sum_base_dt, COALESCE(t2.dlv_rqst_tm, t1.slo_dt))) AS ym,
				t1.sls_dpt_cd,
				t1.sls_usr_cd,
				t1.cst_cd,
				t1.wrk_no,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				t1.trd_cur_cd,
				CASE t1.slo_typ
					WHEN c_slo_typ_slo THEN
				        	CASE t3.ship_inst_typ
								WHEN c_ship_inst_typ_pick THEN t4.ship_inst_qty
								WHEN c_ship_inst_typ_non THEN t4.ship_act_qty
								ELSE t2.base_unit_qty end
					WHEN c_slo_typ_pre_slo THEN 0
				END base_unit_slo_qty,
				CASE t1.slo_typ
					WHEN c_slo_typ_slo THEN
							CASE t3.ship_inst_typ
								WHEN c_ship_inst_typ_pick THEN
									mapa_amt$f_get_exc_tax_amt (
										t2.trd_cur_upri,
										mapa_calc$f_rnd_ne((t4.ship_inst_qty * m1.conv_base_qty) / m1.conv_qty, m1.dec_place, m1.rnd_typ),
										m3.sls_amt_rnd_typ,
										m3.sls_tax_rnd_typ,
										m4.amt_dec_place,
										m2.inc_tax_flg,
										m2.tax_rate,
										mapa_calc$f_rnd_ne(t2.trd_cur_dscnt_amt * mapa_calc$f_rnd_ne((t4.ship_inst_qty * m1.conv_base_qty) / m1.conv_qty, m1.dec_place, m1.rnd_typ) / t2.base_unit_qty, m4.amt_dec_place, m3.sls_amt_rnd_typ)
									)
								WHEN c_ship_inst_typ_non THEN
									mapa_amt$f_get_exc_tax_amt (
										t2.trd_cur_upri,
										mapa_calc$f_rnd_ne((t4.ship_act_qty * m1.conv_base_qty) / m1.conv_qty, m1.dec_place, m1.rnd_typ),
										m3.sls_amt_rnd_typ,
										m3.sls_tax_rnd_typ,
										m4.amt_dec_place,
										m2.inc_tax_flg,
										m2.tax_rate,
										mapa_calc$f_rnd_ne(t2.trd_cur_dscnt_amt * mapa_calc$f_rnd_ne((t4.ship_act_qty * m1.conv_base_qty) / m1.conv_qty, m1.dec_place, m1.rnd_typ) / t2.base_unit_qty, m4.amt_dec_place, m3.sls_amt_rnd_typ)
									)
								ELSE t2.trd_cur_amt END
					WHEN c_slo_typ_pre_slo THEN 0
				END trd_cur_slo_amt,
				CASE t1.slo_typ
				    	WHEN c_slo_typ_slo THEN
							CASE t3.ship_inst_typ
								WHEN c_ship_inst_typ_pick THEN
									 mapa_calc$f_rnd (
										COALESCE(t2.cost_upri, 0) * t4.ship_inst_qty,
										m6.amt_dec_place,
										c_mac_rnd_typ_rndoff
									)
								WHEN c_ship_inst_typ_non THEN
									mapa_calc$f_rnd (
										COALESCE(t2.cost_upri, 0) * t4.ship_act_qty,
										m6.amt_dec_place,
										c_mac_rnd_typ_rndoff
									)
								ELSE COALESCE(t2.cost_amt, 0) END
					WHEN c_slo_typ_pre_slo THEN 0
				END slo_cost_amt,
				CASE t1.slo_typ
					WHEN c_slo_typ_slo THEN 0
					WHEN c_slo_typ_pre_slo THEN t2.base_unit_qty
				END AS base_unit_pre_slo_qty,
				CASE t1.slo_typ
					WHEN c_slo_typ_slo THEN 0
					WHEN c_slo_typ_pre_slo THEN t2.trd_cur_amt
				END AS trd_cur_pre_slo_amt,
				CASE t1.slo_typ
					WHEN c_slo_typ_slo THEN 0
					WHEN c_slo_typ_pre_slo THEN COALESCE(t2.cost_amt, 0)
				END AS pre_slo_cost_amt,
				0 AS cst_frcst_qty,
				NULL::TIMESTAMP WITHOUT TIME ZONE AS dt
			FROM
				mst_slo t1
				JOIN mst_slo_d t2 ON (t1.slo_no = t2.slo_no)
				JOIN mst_ship_pr t3 ON (t2.slo_d_no = t3.slo_d_no)
				JOIN mst_ship_schd t4 ON (t3.ship_pr_no = t4.ship_pr_no)
				LEFT JOIN mavm_itm_unit m1 ON (t4.itm_cd = m1.itm_cd AND t4.itm_sub1 = m1.itm_sub1 AND t4.itm_sub2 = m1.itm_sub2 AND t4.itm_sub3 = m1.itm_sub3 AND t4.trd_unit_cd = m1.unit_cd)
				LEFT JOIN mam_tax m2 ON (t2.tax_cd = m2.tax_cd)
				LEFT JOIN mam_bp m3 ON (t1.cst_cd = m3.bp_cd)
				LEFT JOIN mam_cur m4 ON (t1.trd_cur_cd = m4.cur_cd)
				CROSS JOIN mam_co m5
				LEFT JOIN mam_cur m6 ON (m5.base_cur_cd = m6.cur_cd)
			WHERE	0=0
			AND	t1.can_flg = '0'
			AND	t1.trd_ptn_typ = c_trd_ptn_typ_sls
			AND	t2.vmi_flg = '0'
			AND	t2.can_flg = '0'
			AND	t2.abort_flg = '1'	/* 受注明細打切 */
			AND	t4.abort_flg = '0'	/* 出荷予定の打切は対象外 */
			AND	t2.bd_dpt_cd IS NULL
			AND	t2.slo_sum_base_dt >= l_sum_st_dt
			AND	(t1.sls_dpt_cd = i_sls_dpt_cd OR i_sls_dpt_cd IS NULL)
			UNION ALL
			/* インボイス登録で行追加したインボイス明細 */
			/* 受注金額として集計する。どの受注に対応するかは特定できないので、本受注として集計する */
			SELECT
				mapa_dt$f_get_ac_ym(COALESCE(t1.trd_schd_dt, t1.iv_dt)) AS ym,
				t2.sls_dpt_cd,
				t2.sls_usr_cd,
				t1.ship_rqst_id_cd AS cst_cd,
				t3.wrk_no,
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				t1.trd_cur_cd,
				t2.base_unit_qty AS base_unit_slo_qty,
				t2.trd_cur_amt AS trd_cur_slo_amt,
				mapa_std_cost$f_get_std_amt(t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t1.iv_dt, m1.wg_cd, t2.base_unit_qty, m2.gm_std_upri_typ) AS slo_cost_amt,
				0 AS base_unit_pre_slo_qty,
				0 AS trd_cur_pre_slo_amt,
				0 AS pre_slo_cost_amt,
				0 AS cst_frcst_qty,
				NULL::TIMESTAMP WITHOUT TIME ZONE AS dt
			FROM
				mst_iv t1
				JOIN mst_iv_d t2 ON (t1.iv_mng_no = t2.iv_mng_no)
				LEFT OUTER JOIN msvt_wrk_sno t3 ON (t2.sno1 = t3.sno1)
				LEFT OUTER JOIN mam_dpt m1 ON (t2.sls_dpt_cd = m1.dpt_cd AND t1.iv_dt BETWEEN m1.st_dt AND m1.end_dt)
				CROSS JOIN mam_co m2
			WHERE	0=0
			AND	t2.manual_add_flg = '1'
			AND	t1.trd_schd_dt >= l_sum_st_dt
			AND	(t2.sls_dpt_cd = i_sls_dpt_cd OR i_sls_dpt_cd IS NULL)
			AND	t1.trd_ptn_typ = c_trd_ptn_typ_sls
			UNION ALL
			/* 顧客期間内示 */
			SELECT
				t1.ym,
				t1.sls_dpt_cd,
				t1.sls_usr_cd,
				t1.cst_cd,
				t1.wrk_no,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				NULL AS trd_cud_cd,		/* ワークテーブル登録後に算出する */
				0 AS base_unit_slo_qty,
				0 AS trd_cur_slo_amt,
				0 AS slo_cost_amt,
				0 AS base_unit_pre_slo_qty,
				0 AS trd_cur_pre_slo_amt,
				0 AS pre_slo_cost_amt,
				t1.cst_frcst_qty,
				mapa_dt$f_get_ym_st_dt_ne(t1.ym, l_co.ac_cl_day, l_co.ac_cl_mon_base) AS dt
			FROM	mst_frcst_sum t1
			WHERE	0=0
			AND	t1.ym >= i_sum_st_ym
			AND	(t1.sls_dpt_cd = i_sls_dpt_cd OR i_sls_dpt_cd IS NULL)
		) AS v
		LEFT OUTER JOIN mam_spln_itm_conf m1 ON
			(0=0
			AND	v.itm_cd = m1.itm_cd
			AND	v.itm_sub1 = m1.itm_sub1
			AND	v.itm_sub2 = m1.itm_sub2
			AND	v.itm_sub3 = m1.itm_sub3
			AND	v.sls_dpt_cd =
				CASE m1.dpt_cd
					WHEN c_null_val THEN v.sls_dpt_cd
					ELSE m1.dpt_cd
				END
			AND	v.ym BETWEEN m1.st_ym AND m1.end_ym
			AND	m1.del_flg = '0'
			)
	;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_frcst_slo_sum$p_upd_wk_spln()
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	ワークテーブルに、販売計画で必要な情報を更新する
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
BEGIN
	/* 1:USR:X,A->X,A */
	UPDATE msw_frcst_slo_sum t
	SET
		usr_cst_cd = t.cst_cd,
		usr_wrk_no = t.wrk_no
	WHERE	0=0
	AND	t.usr_cst_cd = c_null_val
	AND	t.usr_wrk_no = c_null_val
	AND	EXISTS (
			SELECT	'X'
			FROM
				mst_spln_fmt x
				LEFT OUTER JOIN mam_spln_itm_conf m ON
					(0=0
					AND	m.spln_itm_cd = x.spln_itm_cd
					AND
						CASE m.dpt_cd
							WHEN c_null_val THEN x.dpt_cd
							ELSE m.dpt_cd
						END = x.dpt_cd
					AND	m.st_ym <= x.end_ym
					AND	m.end_ym >= x.st_ym
					AND	m.del_flg = '0'
					)
			WHERE	0=0
			AND	x.dpt_cd = t.sls_dpt_cd
			AND	x.spln_itm_cd = t.spln_itm_cd
			AND	(
				x.spln_itm_cd <> c_null_val
				AND	m.itm_cd = t.itm_cd AND m.itm_sub1 = t.itm_sub1 AND m.itm_sub2 = t.itm_sub2 AND m.itm_sub3 = t.itm_sub3
				OR
				x.spln_itm_cd = c_null_val
				AND	x.itm_cd = t.itm_cd AND x.itm_sub1 = x.itm_sub1 AND x.itm_sub2 = t.itm_sub2 AND x.itm_sub3 = t.itm_sub3
			)
			AND	fcpa_postgres_util$greatest(x.st_ym, COALESCE(m.st_ym, x.st_ym)) <= t.ym
			AND	fcpa_postgres_util$least(x.end_ym, COALESCE(m.end_ym, x.end_ym)) >= t.ym
			AND	x.cst_cd = t.cst_cd
			AND	x.wrk_no = t.wrk_no
			AND	x.cst_cd <> c_null_val
			AND	x.wrk_no <> c_null_val
		)
	;

	/* 2:USR:Y,A->*,A */
	UPDATE msw_frcst_slo_sum t
	SET
		usr_wrk_no = t.wrk_no
	WHERE	0=0
	AND	t.usr_cst_cd = c_null_val
	AND	t.usr_wrk_no = c_null_val
	AND	EXISTS (
			SELECT	'X'
			FROM
				mst_spln_fmt x
				LEFT OUTER JOIN mam_spln_itm_conf m ON
					(0=0
					AND	m.spln_itm_cd = x.spln_itm_cd
					AND
						CASE m.dpt_cd
							WHEN c_null_val THEN x.dpt_cd
							ELSE m.dpt_cd
						END = x.dpt_cd
					AND	m.st_ym <= x.end_ym
					AND	m.end_ym >= x.st_ym
					AND	m.del_flg = '0'
					)
			WHERE	0=0
			AND	x.dpt_cd = t.sls_dpt_cd
			AND	x.spln_itm_cd = t.spln_itm_cd
			AND	(
				x.spln_itm_cd <> c_null_val
				AND	m.itm_cd = t.itm_cd AND m.itm_sub1 = t.itm_sub1 AND m.itm_sub2 = t.itm_sub2 AND m.itm_sub3 = t.itm_sub3
				OR
				x.spln_itm_cd = c_null_val
				AND	x.itm_cd = t.itm_cd AND x.itm_sub1 = x.itm_sub1 AND x.itm_sub2 = t.itm_sub2 AND x.itm_sub3 = t.itm_sub3
			)
			AND	fcpa_postgres_util$greatest(x.st_ym, COALESCE(m.st_ym, x.st_ym)) <= t.ym
			AND	fcpa_postgres_util$least(x.end_ym, COALESCE(m.end_ym, x.end_ym)) >= t.ym
			AND	x.wrk_no = t.wrk_no
			AND	x.cst_cd = c_null_val
			AND	x.wrk_no <> c_null_val
		)
	;

	/* 3:USR:X,B->X,* */
	UPDATE msw_frcst_slo_sum t
	SET
		usr_cst_cd = t.cst_cd
	WHERE	0=0
	AND	t.usr_cst_cd = c_null_val
	AND	t.usr_wrk_no = c_null_val
	AND	EXISTS (
			SELECT	'X'
			FROM
				mst_spln_fmt x
				LEFT OUTER JOIN mam_spln_itm_conf m ON
					(0=0
					AND	m.spln_itm_cd = x.spln_itm_cd
					AND
						CASE m.dpt_cd
							WHEN c_null_val THEN x.dpt_cd
							ELSE m.dpt_cd
						END = x.dpt_cd
					AND	m.st_ym <= x.end_ym
					AND	m.end_ym >= x.st_ym
					AND	m.del_flg = '0'
					)
			WHERE	0=0
			AND	x.dpt_cd = t.sls_dpt_cd
			AND	x.spln_itm_cd = t.spln_itm_cd
			AND	(x.spln_itm_cd <> c_null_val
			AND	m.itm_cd = t.itm_cd
			AND	m.itm_sub1 = t.itm_sub1
			AND	m.itm_sub2 = t.itm_sub2
			AND	m.itm_sub3 = t.itm_sub3 OR x.spln_itm_cd = c_null_val
			AND	x.itm_cd = t.itm_cd
			AND	x.itm_sub1 = x.itm_sub1
			AND	x.itm_sub2 = t.itm_sub2
			AND	x.itm_sub3 = t.itm_sub3)
			AND	fcpa_postgres_util$greatest(x.st_ym, COALESCE(m.st_ym, x.st_ym)) <= t.ym
			AND	fcpa_postgres_util$least(x.end_ym, COALESCE(m.end_ym, x.end_ym)) >= t.ym
			AND	x.cst_cd = t.cst_cd
			AND	x.cst_cd <> c_null_val
			AND	x.wrk_no = c_null_val
		)
	;

	/* 4:SUM:X,A->X,A */
	UPDATE msw_frcst_slo_sum t
	SET
		sum_cst_cd = t.usr_cst_cd,
		sum_wrk_no = t.usr_wrk_no
	WHERE	0=0
	AND	t.sum_cst_cd = c_null_val
	AND	t.sum_wrk_no = c_null_val
	AND	EXISTS (
			SELECT	'X'
			FROM
				mst_spln_fmt x
				LEFT OUTER JOIN mam_spln_itm_conf m ON
					(0=0
					AND	m.spln_itm_cd = x.spln_itm_cd
					AND
						CASE m.dpt_cd
							WHEN c_null_val THEN x.dpt_cd
							ELSE m.dpt_cd
						END = x.dpt_cd
					AND	m.st_ym <= x.end_ym
					AND	m.end_ym >= x.st_ym
					AND	m.del_flg = '0'
					)
			WHERE	0=0
			AND	x.dpt_cd = t.sls_dpt_cd
			AND	x.spln_itm_cd = t.spln_itm_cd
			AND	(
				x.spln_itm_cd <> c_null_val
				AND	m.itm_cd = t.itm_cd AND m.itm_sub1 = t.itm_sub1 AND m.itm_sub2 = t.itm_sub2 AND m.itm_sub3 = t.itm_sub3
				OR
				x.spln_itm_cd = c_null_val
				AND	x.itm_cd = t.itm_cd AND x.itm_sub1 = x.itm_sub1 AND x.itm_sub2 = t.itm_sub2 AND x.itm_sub3 = t.itm_sub3
			)
			AND	fcpa_postgres_util$greatest(x.st_ym, COALESCE(m.st_ym, x.st_ym)) <= t.ym
			AND	fcpa_postgres_util$least(x.end_ym, COALESCE(m.end_ym, x.end_ym)) >= t.ym
			AND	x.cst_cd = t.usr_cst_cd
			AND	x.wrk_no = t.usr_wrk_no
			AND	x.cst_cd_unit_flg = '1'
			AND	x.wrk_no_unit_flg = '1'
		)
	;

	/* 5:SUM:X,A->*,A */
	UPDATE msw_frcst_slo_sum t
	SET
		sum_cst_cd = c_null_val,
		sum_wrk_no = t.usr_wrk_no
	WHERE	0=0
	AND	t.sum_cst_cd = c_null_val
	AND	t.sum_wrk_no = c_null_val
	AND	EXISTS (
			SELECT	'X'
			FROM
				mst_spln_fmt x
				LEFT OUTER JOIN mam_spln_itm_conf m ON
					(0=0
					AND	m.spln_itm_cd = x.spln_itm_cd
					AND
						CASE m.dpt_cd
							WHEN c_null_val THEN x.dpt_cd
							ELSE m.dpt_cd
						END = x.dpt_cd
					AND	m.st_ym <= x.end_ym
					AND	m.end_ym >= x.st_ym
					AND	m.del_flg = '0'
					)
			WHERE	0=0
			AND	x.dpt_cd = t.sls_dpt_cd
			AND	x.spln_itm_cd = t.spln_itm_cd
			AND	(
				x.spln_itm_cd <> c_null_val
				AND	m.itm_cd = t.itm_cd AND m.itm_sub1 = t.itm_sub1 AND m.itm_sub2 = t.itm_sub2 AND m.itm_sub3 = t.itm_sub3
				OR
				x.spln_itm_cd = c_null_val
				AND	x.itm_cd = t.itm_cd AND x.itm_sub1 = x.itm_sub1 AND x.itm_sub2 = t.itm_sub2 AND x.itm_sub3 = t.itm_sub3
				)
			AND	fcpa_postgres_util$greatest(x.st_ym, COALESCE(m.st_ym, x.st_ym)) <= t.ym
			AND	fcpa_postgres_util$least(x.end_ym, COALESCE(m.end_ym, x.end_ym)) >= t.ym
			AND	x.cst_cd = t.usr_cst_cd
			AND	x.wrk_no = t.usr_wrk_no
			AND	x.cst_cd_unit_flg = '0'
			AND	x.wrk_no_unit_flg = '1'
		)
	;

	/* 6:SUM:X,A->X,* */
	UPDATE msw_frcst_slo_sum t
	SET
		sum_cst_cd = t.usr_cst_cd,
		sum_wrk_no = c_null_val
	WHERE	0=0
	AND	t.sum_cst_cd = c_null_val
	AND	t.sum_wrk_no = c_null_val
	AND	EXISTS (
			SELECT'X'
			FROM
				mst_spln_fmt x
				LEFT OUTER JOIN mam_spln_itm_conf m ON
					(0=0
					AND	m.spln_itm_cd = x.spln_itm_cd
					AND
						CASE m.dpt_cd
							WHEN c_null_val THEN x.dpt_cd
							ELSE m.dpt_cd
						END = x.dpt_cd
					AND	m.st_ym <= x.end_ym
					AND	m.end_ym >= x.st_ym
					AND	m.del_flg = '0'
					)
			WHERE	0=0
			AND	x.dpt_cd = t.sls_dpt_cd
			AND	x.spln_itm_cd = t.spln_itm_cd
			AND	(
				x.spln_itm_cd <> c_null_val
				AND	m.itm_cd = t.itm_cd AND m.itm_sub1 = t.itm_sub1 AND m.itm_sub2 = t.itm_sub2 AND m.itm_sub3 = t.itm_sub3
				OR
				x.spln_itm_cd = c_null_val
				AND	x.itm_cd = t.itm_cd AND x.itm_sub1 = x.itm_sub1 AND x.itm_sub2 = t.itm_sub2 AND x.itm_sub3 = t.itm_sub3
				)
			AND	fcpa_postgres_util$greatest(x.st_ym, COALESCE(m.st_ym, x.st_ym)) <= t.ym
			AND	fcpa_postgres_util$least(x.end_ym, COALESCE(m.end_ym, x.end_ym)) >= t.ym
			AND	x.cst_cd = t.usr_cst_cd
			AND	x.wrk_no = t.usr_wrk_no
			AND	x.cst_cd_unit_flg = '1'
			AND	x.wrk_no_unit_flg = '0'
		)
	;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_frcst_slo_sum$p_upd_wk_frcst()
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	ワークテーブルの顧客期間内示情報の金額を計算する
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	cur_frcst CURSOR FOR
		SELECT
			w.*,
			m1.sls_amt_rnd_typ,
			m1.sls_tax_rnd_typ,
			m2.amt_dec_place,
			m3.unit_cd,
			m4.wg_cd
		FROM
			mspa_frcst_slo_sum$wk_frcst w
			LEFT JOIN mam_bp m1 ON (w.cst_cd = m1.bp_cd)
			LEFT JOIN mam_cur m2 ON (w.trd_cur_cd = m2.cur_cd)
			LEFT JOIN mam_itm m3 ON (w.itm_cd = m3.itm_cd AND w.itm_sub1 = m3.itm_sub1 AND w.itm_sub2 = m3.itm_sub2 AND w.itm_sub3 = m3.itm_sub3)
			LEFT JOIN mam_dpt m4 ON (w.sls_dpt_cd = m4.dpt_cd AND w.dt BETWEEN m4.st_dt AND m4.end_dt)
		WHERE 0=0
		AND w.cst_frcst_qty > 0
		;
	l_upri maw_sls_upri_srv.sls_upri%TYPE;
	l_amt msw_frcst_slo_sum.trd_cur_cst_frcst_amt%TYPE;
	l_inc_tax_flg mam_tax.inc_tax_flg%TYPE;
	l_tax_rate mam_tax.tax_rate%TYPE;
	l_conv_base_qty mavm_itm_unit.conv_base_qty%TYPE;
	l_conv_qty mavm_itm_unit.conv_qty%TYPE;
BEGIN
	/* 取引通貨を設定（販売計画から通貨を取得する） */
	UPDATE msw_frcst_slo_sum w
	SET
		trd_cur_cd = (
			SELECT
				s.cur_cd
			FROM	mst_spln_fmt s
			WHERE	0=0
			AND	w.sls_dpt_cd = s.dpt_cd
			AND	w.usr_cst_cd = s.cst_cd
			AND	w.wrk_no = s.wrk_no
			AND	(
				w.spln_itm_cd = c_null_val
				AND	w.spln_itm_cd = s.spln_itm_cd
				AND	w.itm_cd = s.itm_cd
				AND	w.itm_sub1 = s.itm_sub1
				AND	w.itm_sub2 = s.itm_sub2
				AND	w.itm_sub3 = s.itm_sub3
				OR
				w.spln_itm_cd <> c_null_val
				AND	w.spln_itm_cd = s.spln_itm_cd
			)
			AND	w.ym BETWEEN s.st_ym
			AND	s.end_ym
		)
	WHERE	0=0
	AND	cst_frcst_qty > 0
	;

	/* 販売計画から通貨が取得できなければ、取引先マスタの取引通貨とする */
	UPDATE msw_frcst_slo_sum w
	SET
		trd_cur_cd = (
			SELECT	cur_cd
			FROM	mam_bp m
			WHERE	w.cst_cd = m.bp_cd
			)
	WHERE	0=0
	AND	cst_frcst_qty > 0
	AND	trd_cur_cd IS NULL
	;

	/* 一時テーブル（インデックス付き）を作成し、データを移動 */
	CALL fcpa_postgres_util$type_is_table_row('mspa_frcst_slo_sum$wk_frcst', 'msw_frcst_slo_sum', 'INTEGER') ;
	INSERT INTO mspa_frcst_slo_sum$wk_frcst SELECT *, ROW_NUMBER() OVER() FROM msw_frcst_slo_sum;
	CALL fcpa_postgres_util$p_truncate_work('msw_frcst_slo_sum') ;

	FOR rec IN cur_frcst LOOP

		/* 単価の取得 */
		CALL fcpa_postgres_util$p_truncate_work('maw_sls_upri_srv') ;

		INSERT INTO maw_sls_upri_srv (
			peg_no,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			cst_cd,
			unit_cd,
			qty,
			cur_cd,
			wg_cd,
			dt,
			grp_no,
			sls_upri_flg
		)
		VALUES (
			1,
			rec.itm_cd,
			rec.itm_sub1,
			rec.itm_sub2,
			rec.itm_sub3,
			rec.cst_cd,
			COALESCE(rec.upri_unit_cd, rec.unit_cd),
			COALESCE(rec.lot_qty, 9999999999.99999999),
			rec.trd_cur_cd,
			rec.wg_cd,
			rec.dt,
			'1',
			'1'
		)
		;

		CALL mapa_sls_upri$p_set_sls_upri_wk();

		SELECT	COALESCE(sls_upri, 0)
		INTO	STRICT l_upri
		FROM	maw_sls_upri_srv;

		CALL fcpa_postgres_util$p_truncate_work('maw_sls_upri_srv') ;

		/* 金額計算 */
		IF l_upri <> 0 THEN
			SELECT
				inc_tax_flg, tax_rate
			INTO	STRICT l_inc_tax_flg, l_tax_rate
			FROM	mam_tax
			WHERE	0=0
			AND	tax_cd = mapa_tax$f_get_sls_tax_cd(rec.itm_cd, rec.itm_sub1, rec.itm_sub2, rec.itm_sub3, rec.cst_cd, rec.dt)
			;

			IF rec.upri_unit_cd IS NULL THEN
				l_amt := mapa_amt$f_get_exc_tax_amt(l_upri, rec.cst_frcst_qty, rec.sls_amt_rnd_typ, rec.sls_tax_rnd_typ, rec.amt_dec_place, l_inc_tax_flg, l_tax_rate);
			ELSE
				SELECT
					conv_base_qty,
					conv_qty
				INTO
					STRICT l_conv_base_qty,
					l_conv_qty
				FROM	mavm_itm_unit
				WHERE	0=0
				AND	itm_cd = rec.itm_cd
				AND	itm_sub1 = rec.itm_sub1
				AND	itm_sub2 = rec.itm_sub2
				AND	itm_sub3 = rec.itm_sub3
				AND	unit_cd = rec.upri_unit_cd
				;

				l_amt := mapa_amt$f_get_exc_tax_amt(l_upri, rec.cst_frcst_qty * l_conv_base_qty / l_conv_qty, rec.sls_amt_rnd_typ, rec.sls_tax_rnd_typ, rec.amt_dec_place, l_inc_tax_flg, l_tax_rate);
			END IF;

			/* 金額の更新 */
			UPDATE mspa_frcst_slo_sum$wk_frcst
			SET trd_cur_cst_frcst_amt = l_amt
			WHERE _index_ = rec._index_
			;
		END IF;
	END LOOP;

	/* 一時テーブルのデータを戻す */
 	INSERT INTO msw_frcst_slo_sum SELECT
		ym,sls_dpt_cd,sls_usr_cd,cst_cd,wrk_no,itm_cd,itm_sub1,itm_sub2,itm_sub3,
		trd_cur_cd,spln_itm_cd,sls_itm_grp_cd,base_unit_slo_qty,trd_cur_slo_amt,
		slo_cost_amt,base_unit_pre_slo_qty,trd_cur_pre_slo_amt,pre_slo_cost_amt,
		cst_frcst_qty,trd_cur_cst_frcst_amt,usr_cst_cd,usr_wrk_no,sum_cst_cd,
		sum_wrk_no,dt,upri_unit_cd,lot_qty
	FROM mspa_frcst_slo_sum$wk_frcst;

	/* 一時テーブル削除 */
	TRUNCATE TABLE mspa_frcst_slo_sum$wk_frcst ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_frcst_slo_sum$p_ins_trn()
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	ワークテーブルを集計し、mst_frcst_slo_sumにレコードを追加する
<REMARKS>

<ARGUMENTS>
<HISTORY>
**************************************************************************/
BEGIN
	INSERT INTO mst_frcst_slo_sum (
		ym,
		sls_dpt_cd,
		sls_usr_cd,
		cst_cd,
		wrk_no,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		trd_cur_cd,
		spln_itm_cd,
		sls_itm_grp_cd,
		base_unit_slo_qty,
		trd_cur_slo_amt,
		slo_cost_amt,
		base_unit_pre_slo_qty,
		trd_cur_pre_slo_amt,
		pre_slo_cost_amt,
		cst_frcst_qty,
		trd_cur_cst_frcst_amt,
		usr_cst_cd,
		usr_wrk_no,
		sum_cst_cd,
		sum_wrk_no
	)
	SELECT
		ym,
		sls_dpt_cd,
		sls_usr_cd,
		cst_cd,
		wrk_no,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		trd_cur_cd,
		spln_itm_cd,
		sls_itm_grp_cd,
		SUM(base_unit_slo_qty),
		SUM(trd_cur_slo_amt),
		SUM(slo_cost_amt),
		SUM(base_unit_pre_slo_qty),
		SUM(trd_cur_pre_slo_amt),
		SUM(pre_slo_cost_amt),
		SUM(cst_frcst_qty),
		SUM(trd_cur_cst_frcst_amt),
		usr_cst_cd,
		usr_wrk_no,
		sum_cst_cd,
		sum_wrk_no
	FROM	msw_frcst_slo_sum
	GROUP BY
		ym,
		sls_dpt_cd,
		sls_usr_cd,
		cst_cd,
		wrk_no,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		trd_cur_cd,
		spln_itm_cd,
		sls_itm_grp_cd,
		usr_cst_cd,
		usr_wrk_no,
		sum_cst_cd,
		sum_wrk_no
	;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_frcst_slo_sum$p_frcst_slo_sum_main(
	 IN i_sum_st_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_sls_dpt_cd VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	顧客内示・受注集計テーブルを更新する（メイン処理）
<REMARKS>

<ARGUMENTS>
<IN>
	i_sls_st_ym
		集計開始年月
<IN>
	i_sls_dpt_cd
		売上部門ＣＤ
<HISTORY>
**************************************************************************/
BEGIN

	/* 集計条件に従ってmst_frcst_slo_sumを削除する */
	DELETE FROM	mst_frcst_slo_sum t
	WHERE	0=0
	AND	t.ym >= i_sum_st_ym
	AND	(t.sls_dpt_cd = i_sls_dpt_cd OR i_sls_dpt_cd IS NULL)
	;

	/* ワークテーブルにレコードを追加 */
	CALL mspa_frcst_slo_sum$p_ins_wk(i_sum_st_ym, i_sls_dpt_cd);

	/* ワークテーブルに販売計画に必要な項目を設定する */
	CALL mspa_frcst_slo_sum$p_upd_wk_spln();

	/* ワークテーブルの顧客期間内示のデータを更新する */
	CALL mspa_frcst_slo_sum$p_upd_wk_frcst();

	/* ワークテーブルを集計して、mst_frcst_slo_sumに書き込む */
	CALL mspa_frcst_slo_sum$p_ins_trn();

	/* ワークテーブルを削除する */
	CALL fcpa_postgres_util$p_truncate_work('msw_frcst_slo_sum') ;

END;
$BODY$
LANGUAGE plpgsql
;
