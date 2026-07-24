\encoding UTF-8

CREATE OR REPLACE FUNCTION mspa_mrpea$f_get_usrnm(
	 IN i_wg_cd VARCHAR,
	 IN i_proc_typ VARCHAR,
	 IN i_sim_mrp_no VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>

<REMARKS>

<ARGUMENTS>

<RETURNVALUE>

<HISTORY>
**********************************************************/
DECLARE
	v_rtn mst_sim_mrp.upd_usr_nm%TYPE;
BEGIN
	BEGIN
		IF i_proc_typ = fcpa_const$get_const_val('MSC_MRP_TYP','SIM') THEN
			SELECT	t.upd_usr_nm
			INTO	STRICT v_rtn
			FROM	mst_sim_mrp t
			WHERE	0=0
			AND	t.sim_mrp_no = i_sim_mrp_no
			;
		ELSE
			SELECT	t.upd_usr_nm
			INTO	STRICT v_rtn
			FROM	mst_mrp_lock t
			WHERE	0=0
			AND	t.wg_cd = i_wg_cd
			AND	t.mrp_typ = i_proc_typ
			;
		END IF;
	EXCEPTION
		WHEN others THEN
			v_rtn := NULL;
	END;
	RETURN v_rtn;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_mrpea$f_get_sim_mrp(
	 IN i_sim_mrp_no VARCHAR
)
RETURNS mst_sim_mrp
AS
$BODY$
/*********************************************************
<SYNOPSIS>

<REMARKS>

<ARGUMENTS>

<RETURNVALUE>

<HISTORY>
**********************************************************/
DECLARE
	l_rec mst_sim_mrp%ROWTYPE;
BEGIN
	BEGIN
		SELECT	t.*
		INTO	STRICT l_rec
		FROM	mst_sim_mrp t
		WHERE	0=0
		AND	t.sim_mrp_no = i_sim_mrp_no
		;
	EXCEPTION
		WHEN others THEN
			l_rec := NULL;
	END;
	RETURN l_rec;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_mrpea$p_mrpea0(
	 IN i_co_cd VARCHAR,
	 IN i_usr_cd VARCHAR,
	 IN i_screen_id VARCHAR,
	 IN i_srv_req_no VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_proc_typ VARCHAR,
	 IN i_proc_cnt VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_sim_mrp_typ VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰセッション設定処理
<REMARKS>
		ＭＲＰ用のセッション作成時に呼び出されるプロシージャ
<ARGUMENTS>

<ITEM>
	i_co_cd			: 会社コード
	i_usr_cd		: ユーザコード
	i_screen_id		: 画面ＩＤ
	i_srv_req_no	: 更新リクエストＮＯ
	i_wg_cd			: ＷＧＣＤ
	i_proc_typ		: ＭＲＰ実行区分
	i_proc_cnt		: ＭＲＰ計算ＮＯ
	i_sim_mrp_no	: シミュレーションＮＯ
	i_sim_mrp_typ	: シミュレーションＭＲＰ区分
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_context$set_co_cd_ext(i_co_cd); --一番最初に呼ぶ

	CALL fcpa_context$set_userid(i_usr_cd);
	CALL fcpa_context$set_call_pg_id(i_screen_id);
	CALL fcpa_context$set_processid(i_srv_req_no);
	CALL fcpa_context$set_usernm(mspa_mrpea$f_get_usrnm(i_wg_cd, i_proc_typ, i_sim_mrp_no));

	IF i_proc_typ = fcpa_const$get_const_val('MSC_MRP_TYP','SIM') AND i_sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','MST_CHK') THEN
		CALL mapa_context$set_release_flg_ctl('0');
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_mrpea$p_valid_itm_sub(
	 IN i_wg_cd VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		品目絞込み処理
<REMARKS>

<ARGUMENTS>

<ITEM>
	i_wg_cd		: ＷＧＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	l_list msw_mrp_itm_tmp[];
BEGIN
	SELECT
		ARRAY_AGG( ROW(v.itm_cd, v.itm_sub1, v.itm_sub2, v.itm_sub3))
	INTO	STRICT l_list
	FROM	(
		SELECT DISTINCT
			t.chd_itm_cd AS itm_cd,
			t.chd_itm_sub1 AS itm_sub1,
			t.chd_itm_sub2 AS itm_sub2,
			t.chd_itm_sub3 AS itm_sub3
		FROM
			msvm_mrp_bom t,
			msw_mrp_itm_tmp t1
		WHERE	0=0
		AND	t.par_itm_cd = t1.itm_cd
		AND	t.par_itm_sub1 = t1.itm_sub1
		AND	t.par_itm_sub2 = t1.itm_sub2
		AND	t.par_itm_sub3 = t1.itm_sub3
		AND	t.chd_itm_cd IS NOT NULL
		AND	NOT EXISTS (
			SELECT	'x'
			FROM	msw_mrp_itm t2
			WHERE	0=0
			AND	t.chd_itm_cd = t2.itm_cd
			AND	t.chd_itm_sub1 = t2.itm_sub1
			AND	t.chd_itm_sub2 = t2.itm_sub2
			AND	t.chd_itm_sub3 = t2.itm_sub3
			)
		) v
	;

	IF COALESCE(array_length(l_list, 1), 0) = 0 THEN
		RETURN;
	END IF;

	CALL fcpa_postgres_util$p_truncate_work('msw_mrp_itm_tmp');
	FOR i IN array_lower(l_list, 1)..array_upper(l_list, 1) LOOP
		INSERT INTO msw_mrp_itm_tmp VALUES (l_list[i].*);
		INSERT INTO msw_mrp_itm VALUES (l_list[i].*);
	END LOOP;

	CALL mspa_mrpea$p_valid_itm_sub(i_wg_cd);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_mrpea$p_valid_itm(
	 IN i_wg_cd VARCHAR,
	 IN i_proc_typ VARCHAR,
	 IN i_sim_mrp mst_sim_mrp
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ前処理
<REMARKS>

<ARGUMENTS>

<ITEM>
	i_wg_cd				: ＷＧＣＤ
	i_proc_typ	: ＭＲＰ実行区分
	i_sim_mrp_typ		: シミュレーションＭＲＰ区分
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_mrp_itm_tmp');
	CALL fcpa_postgres_util$p_truncate_work('msw_mrp_itm');

	IF i_proc_typ = fcpa_const$get_const_val('MSC_MRP_TYP','MRP') THEN
		INSERT INTO msw_mrp_itm_tmp
		SELECT DISTINCT
			v.itm_cd,
			v.itm_sub1,
			v.itm_sub2,
			v.itm_sub3
		FROM (
			/* 通常ＭＲＰのケース */
			SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_rqmt WHERE wg_cd = i_wg_cd
			UNION ALL
			SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_io_schd_gi WHERE wg_cd = i_wg_cd
			UNION ALL
			SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_itm_orderz WHERE wg_cd = i_wg_cd
			UNION ALL
			SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_stk WHERE wg_cd = i_wg_cd
		) v
		;
	ELSIF i_proc_typ = fcpa_const$get_const_val('MSC_MRP_TYP','PRCD') THEN
		/* 先行手配のケース */
		INSERT INTO msw_mrp_itm_tmp
		SELECT DISTINCT
			v.itm_cd,
			v.itm_sub1,
			v.itm_sub2,
			v.itm_sub3
		FROM (
			SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_prcd_rqmt WHERE wg_cd = i_wg_cd
			UNION ALL
			SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_io_schd_gi WHERE wg_cd = i_wg_cd
			UNION ALL
			SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_itm_orderz WHERE wg_cd = i_wg_cd
			UNION ALL
			SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_stk WHERE wg_cd = i_wg_cd
		) v
		;
	ELSIF i_proc_typ = fcpa_const$get_const_val('MSC_MRP_TYP','SIM') THEN
		/* シミュレーションのケース */
		IF i_sim_mrp.sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','GP_SIM') THEN
			/* 汎用シミュレーション */
			INSERT INTO msw_mrp_itm_tmp
			SELECT DISTINCT
				v.itm_cd,
				v.itm_sub1,
				v.itm_sub2,
				v.itm_sub3
			FROM (
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_sim_rqmt_full
						WHERE wg_cd = i_wg_cd AND (i_sim_mrp.dly_rqmt_flg = '1' AND sim_mrp_no IS NULL OR sim_mrp_no = i_sim_mrp.sim_mrp_no)
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_io_schd_gi_noship WHERE wg_cd = i_wg_cd AND i_sim_mrp.gi_flg = '1'
				/* 出庫予定（出荷をのぞく） */
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_io_schd_gi_ship WHERE wg_cd = i_wg_cd AND i_sim_mrp.ship_flg = '1'
				/* 出荷予定 */
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_itm_orderz WHERE wg_cd = i_wg_cd AND i_sim_mrp.gr_flg = '1'
				/* 入庫予定 */
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_stk
				WHERE wg_cd = i_wg_cd
				AND	i_sim_mrp.stk_flg = '1'
			) v
			;
		ELSIF i_sim_mrp.sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','MST_CHK') THEN
			/* リリース前マスタチェック用 */
			INSERT INTO msw_mrp_itm_tmp
			SELECT DISTINCT
				v.itm_cd,
				v.itm_sub1,
				v.itm_sub2,
				v.itm_sub3
			FROM (
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_sim_rqmt WHERE wg_cd = i_wg_cd AND sim_mrp_no = i_sim_mrp.sim_mrp_no
			) v
			;
		ELSIF i_sim_mrp.sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','SD_ADJST') THEN
			/* 需給調整用 */
			INSERT INTO msw_mrp_itm_tmp
			SELECT DISTINCT
				v.itm_cd,
				v.itm_sub1,
				v.itm_sub2,
				v.itm_sub3
			FROM (
 				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_sim_rqmt_sd WHERE wg_cd = i_wg_cd
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_io_schd_gi_sd WHERE wg_cd = i_wg_cd
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_itm_orderz WHERE wg_cd = i_wg_cd
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_stk WHERE wg_cd = i_wg_cd
			) v
			;
		ELSIF i_sim_mrp.sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','PRMS') THEN
			/* 納期回答用 */
			INSERT INTO msw_mrp_itm_tmp
			SELECT DISTINCT
				v.itm_cd,
				v.itm_sub1,
				v.itm_sub2,
				v.itm_sub3
			FROM (
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_sim_rqmt_prms WHERE wg_cd = i_wg_cd
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_io_schd_gi WHERE wg_cd = i_wg_cd
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_itm_orderz WHERE wg_cd = i_wg_cd
				UNION ALL
				SELECT DISTINCT itm_cd, itm_sub1, itm_sub2, itm_sub3 FROM msvt_mrp_stk WHERE wg_cd = i_wg_cd
			) v
			;
		END IF;
	END IF;

	SELECT COUNT(itm_cd) INTO STRICT l_cnt FROM msw_mrp_itm_tmp;

	IF l_cnt = 0 THEN
		RETURN;
	END IF;

	INSERT INTO msw_mrp_itm
	SELECT * FROM msw_mrp_itm_tmp
	;

	CALL mspa_mrpea$p_valid_itm_sub(i_wg_cd);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_mrpea$p_mrp_orderz_sub(
	 IN i_wg_cd VARCHAR,
	 IN i_sim_mrp mst_sim_mrp
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>

<REMARKS>

<ARGUMENTS>

<ITEM>

<HISTORY>
**************************************************************************/
DECLARE
	c_mrp_data_typ_ordz CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_MRP_DATA_TYP','ORDZ');
	c_mrp_data_typ_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_MRP_DATA_TYP','STK');
	c_mrp_data_typ_schdo CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_MRP_DATA_TYP','SCHDO');
	c_mrp_data_typ_schdi CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_MRP_DATA_TYP','SCHDI');
	c_mrp_data_typ_kordz CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_MRP_DATA_TYP','KORDZ');

	c_sim_mrp_typ_sd_adjst CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_SIM_MRP_TYP','SD_ADJST');
	c_sim_mrp_typ_prms CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_SIM_MRP_TYP','PRMS');
	c_sim_mrp_typ_gp_sim CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_SIM_MRP_TYP','GP_SIM');
BEGIN
	INSERT INTO msw_mrp_orderz
	SELECT
		c_mrp_data_typ_ordz,
		t1.itm_ord_no,
		NULL AS io_schd_no,
		NULL AS io_schd_typ,
		NULL AS io_schd_sts_typ,
		t1.itm_ord_typ,
		t1.itm_ord_sts_typ,
		NULL AS oper_ord_sts_typ,
		t1.itm_cd,
		t1.itm_sub1,
		t1.itm_sub2,
		t1.itm_sub3,
		t1.ver_no,
		t1.strg_loc_cd AS loc_cd,
		t1.bom_ptn,
		t1.oper_ptn,
		NULL::NUMERIC AS disp_seq,
		NULL AS alt_grp_cd,
		NULL::NUMERIC AS alt_grp_seq,
		NULL AS oper_ord_no,
		NULL AS oper_inst_no,
		NULL AS alt_itm_typ,
		NULL::NUMERIC AS alt_itm_ratio,
		NULL::NUMERIC AS alt_alloc_prio,
		NULL AS lot_no,
		NULL AS sublot_no,
		NULL AS lot_seq,
		t1.mfg_loc_cd,
		t1.sppl_cd,
		t1.maker_cd,
		t1.rqst_loc_cd,
		t1.rqst_wg_cd,
		t1.yield_schd_qty AS qty,
		t1.master_dt,
		t1.po_schd_dt,
		t1.gi_schd_dt,
		t1.mfg_st_schd_dt,
		t1.mfg_end_schd_dt,
		NULL::TIMESTAMP WITHOUT TIME ZONE AS st_schd_tm,
		NULL::TIMESTAMP WITHOUT TIME ZONE AS end_schd_tm,
		t1.strg_schd_dt,
		t1.accpt_schd_dt,
		t1.insp_st_schd_dt,
		t1.insp_end_schd_dt,
		NULL::TIMESTAMP WITHOUT TIME ZONE AS first_gr_dt,
		t1.avl_schd_dt,
		NULL AS oper_cd,
		NULL::NUMERIC AS oper_seq,
		t1.sno1,
		CASE t1.itm_ord_typ
			WHEN '4' THEN t2.sno1_mng_typ
			WHEN '5' THEN t2.sno1_mng_typ
			ELSE t1.sno_typ1
		END AS sno_typ1,
		t1.sno2,
		CASE t1.itm_ord_typ
			WHEN '4' THEN t2.sno2_mng_typ
			WHEN '5' THEN t2.sno2_mng_typ
			ELSE t1.sno_typ2
		END AS sno_typ2,
		t1.sno3,
		CASE t1.itm_ord_typ
			WHEN '4' THEN t2.sno3_mng_typ
			WHEN '5' THEN t2.sno3_mng_typ
			ELSE t1.sno_typ3
		END AS sno_typ3,
		t1.sno4,
		CASE t1.itm_ord_typ
			WHEN '4' THEN t2.sno4_mng_typ
			WHEN '5' THEN t2.sno4_mng_typ
			ELSE t1.sno_typ4
		END AS sno_typ4,
		NULL AS ex_sno1,
		NULL AS ex_sno2,
		NULL AS ex_sno3,
		NULL AS ex_sno4,
		NULL AS gd_cd,
		DATE_TRUNC('DAY', t1.lmt_dt) + '1 days'::INTERVAL AS lmt_dt,
		t1.wg_cd,
		t1.rqmt_no,
		NULL AS inpt_ctl_typ,
		'0' AS alloc_flg
	FROM	msvt_mrp_itm_orderz t1
		LEFT OUTER JOIN msvm_mrp_itm t2 ON
			(t1.wg_cd = t2.wg_cd
			AND t1.itm_cd = t2.itm_cd
			AND t1.itm_sub1 = t2.itm_sub1
			AND t1.itm_sub2 = t2.itm_sub2
			AND t1.itm_sub3 = t2.itm_sub3
			)
	WHERE	0=0
	AND	t1.wg_cd = i_wg_cd
	AND	(i_sim_mrp.sim_mrp_no IS NULL
		OR i_sim_mrp.sim_mrp_typ IN (c_sim_mrp_typ_sd_adjst, c_sim_mrp_typ_prms)
		OR (i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_gp_sim AND i_sim_mrp.gr_flg = '1')
		)
	UNION ALL
	SELECT
		c_mrp_data_typ_stk,
		NULL AS itm_ord_no,
		NULL AS io_schd_no,
		NULL AS io_schd_typ,
		NULL AS io_schd_sts_typ,
		NULL AS itm_ord_typ,
		NULL AS itm_ord_sts_typ,
		NULL AS oper_ord_sts_typ,
		t2.itm_cd,
		t2.itm_sub1,
		t2.itm_sub2,
		t2.itm_sub3,
		t2.ver_no,
		t2.loc_cd,
		NULL AS bom_ptn,
		NULL AS oper_ptn,
		NULL AS disp_seq,
		NULL AS alt_grp_cd,
		NULL AS alt_grp_seq,
		NULL AS oper_ord_no,
		NULL AS oper_inst_no,
		NULL AS alt_itm_typ,
		NULL AS alt_itm_ratio,
		NULL AS alt_alloc_prio,
		t2.lot_no,
		t2.sublot_no,
		t2.lot_seq,
		NULL AS mfg_loc_cd,
		NULL AS sppl_cd,
		NULL AS maker_cd,
		NULL AS rqst_loc_cd,
		NULL AS rqst_wg_cd,
		t2.base_unit_qty AS qty,
		NULL AS master_dt,
		NULL AS po_schd_dt,
		NULL AS gi_schd_dt,
		NULL AS mfg_st_schd_dt,
		NULL AS mfg_end_schd_dt,
		NULL AS st_schd_tm,
		NULL AS end_schd_tm,
		NULL AS strg_schd_dt,
		NULL AS accpt_schd_dt,
		NULL AS insp_st_schd_dt,
		NULL AS insp_end_schd_dt,
		t2.first_gr_dt,
		t2.avl_schd_dt,
		NULL AS oper_cd,
		NULL AS oper_seq,
		t2.sno1,
		NULL AS sno_typ1,
		t2.sno2,
		NULL AS sno_typ2,
		t2.sno3,
		NULL AS sno_typ3,
		t2.sno4,
		NULL AS sno_typ4,
		NULL AS ex_sno1,
		NULL AS ex_sno2,
		NULL AS ex_sno3,
		NULL AS ex_sno4,
		t2.gd_cd,
		DATE_TRUNC('DAY', t2.lmt_dt) + '1 days'::INTERVAL AS lmt_dt,
		t2.wg_cd,
		NULL AS rqmt_no,
		NULL AS inpt_ctl_typ,
		'0' AS alloc_flg
	FROM	msvt_mrp_stk t2
	WHERE	0=0
	AND	t2.wg_cd = i_wg_cd
	AND	(i_sim_mrp.sim_mrp_no IS NULL
		OR i_sim_mrp.sim_mrp_typ IN (c_sim_mrp_typ_sd_adjst, c_sim_mrp_typ_prms)
		OR (i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_gp_sim AND i_sim_mrp.stk_flg = '1')
		)
	UNION ALL
	SELECT
		c_mrp_data_typ_schdo,
		t3.itm_ord_no,
		t3.io_schd_no,
		t3.io_schd_typ,
		t3.io_schd_sts_typ,
		NULL AS itm_ord_typ,
		NULL AS itm_ord_sts_typ,
		NULL AS oper_ord_sts_typ,
		t3.itm_cd,
		t3.itm_sub1,
		t3.itm_sub2,
		t3.itm_sub3,
		t3.ver_no,
		t3.loc_cd,
		NULL AS bom_ptn,
		t3.oper_ptn AS oper_ptn,
		NULL AS disp_seq,
		t3.alt_grp_cd,
		t3.alt_grp_seq,
		t3.oper_ord_no,
		t3.oper_inst_no,
		t3.alt_itm_typ,
		t3.alt_itm_ratio,
		t3.alt_alloc_prio,
		t3.lot_no,
		t3.sublot_no,
		NULL AS lot_seq,
		NULL AS mfg_loc_cd,
		NULL AS sppl_cd,
		NULL AS maker_cd,
		NULL AS rqst_loc_cd,
		NULL AS rqst_wg_cd,
		t3.base_unit_qty AS qty,
		NULL AS master_dt,
		NULL AS po_schd_dt,
		NULL AS gi_schd_dt,
		NULL AS mfg_st_schd_dt,
		NULL AS mfg_end_schd_dt,
		NULL AS st_schd_tm,
		NULL AS end_schd_tm,
		NULL AS strg_schd_dt,
		NULL AS accpt_schd_dt,
		NULL AS insp_st_schd_dt,
		NULL AS insp_end_schd_dt,
		NULL AS first_gr_dt,
		t3.schd_dt AS avl_schd_dt,
		t3.oper_cd,
		t3.oper_seq,
		t3.sno1,
		t3.sno_typ1,
		t3.sno2,
		t3.sno_typ2,
		t3.sno3,
		t3.sno_typ3,
		t3.sno4,
		t3.sno_typ4,
		t3.ex_sno1,
		t3.ex_sno2,
		t3.ex_sno3,
		t3.ex_sno4,
		t3.gd_cd,
		NULL AS lmt_dt,
		t3.wg_cd,
		NULL AS rqmt_no,
		t3.inpt_ctl_typ,
		t3.alloc_flg
	FROM	msvt_mrp_io_schd_gi t3
	WHERE	0=0
	AND	t3.wg_cd = i_wg_cd
	AND	(i_sim_mrp.sim_mrp_no IS NULL OR i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_prms)
	UNION ALL
	SELECT
		c_mrp_data_typ_schdo,
		t3.itm_ord_no,
		t3.io_schd_no,
		t3.io_schd_typ,
		t3.io_schd_sts_typ,
		NULL AS itm_ord_typ,
		NULL AS itm_ord_sts_typ,
		NULL AS oper_ord_sts_typ,
		t3.itm_cd,
		t3.itm_sub1,
		t3.itm_sub2,
		t3.itm_sub3,
		t3.ver_no,
		t3.loc_cd,
		NULL AS bom_ptn,
		t3.oper_ptn AS oper_ptn,
		NULL AS disp_seq,
		t3.alt_grp_cd,
		t3.alt_grp_seq,
		t3.oper_ord_no,
		t3.oper_inst_no,
		t3.alt_itm_typ,
		t3.alt_itm_ratio,
		t3.alt_alloc_prio,
		t3.lot_no,
		t3.sublot_no,
		NULL AS lot_seq,
		NULL AS mfg_loc_cd,
		NULL AS sppl_cd,
		NULL AS maker_cd,
		NULL AS rqst_loc_cd,
		NULL AS rqst_wg_cd,
		t3.base_unit_qty AS qty,
		NULL AS master_dt,
		NULL AS po_schd_dt,
		NULL AS gi_schd_dt,
		NULL AS mfg_st_schd_dt,
		NULL AS mfg_end_schd_dt,
		NULL AS st_schd_tm,
		NULL AS end_schd_tm,
		NULL AS strg_schd_dt,
		NULL AS accpt_schd_dt,
		NULL AS insp_st_schd_dt,
		NULL AS insp_end_schd_dt,
		NULL AS first_gr_dt,
		t3.schd_dt AS avl_schd_dt,
		t3.oper_cd,
		t3.oper_seq,
		t3.sno1,
		t3.sno_typ1,
		t3.sno2,
		t3.sno_typ2,
		t3.sno3,
		t3.sno_typ3,
		t3.sno4,
		t3.sno_typ4,
		t3.ex_sno1,
		t3.ex_sno2,
		t3.ex_sno3,
		t3.ex_sno4,
		t3.gd_cd,
		NULL AS lmt_dt,
		t3.wg_cd,
		NULL AS rqmt_no,
		t3.inpt_ctl_typ,
		t3.alloc_flg
	FROM	msvt_mrp_io_schd_gi_sd t3
	WHERE	0=0
	AND	t3.wg_cd = i_wg_cd
	AND	i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_sd_adjst
	UNION ALL
	SELECT
		c_mrp_data_typ_schdo,
		t3.itm_ord_no,
		t3.io_schd_no,
		t3.io_schd_typ,
		t3.io_schd_sts_typ,
		NULL AS itm_ord_typ,
		NULL AS itm_ord_sts_typ,
		NULL AS oper_ord_sts_typ,
		t3.itm_cd,
		t3.itm_sub1,
		t3.itm_sub2,
		t3.itm_sub3,
		t3.ver_no,
		t3.loc_cd,
		NULL AS bom_ptn,
		t3.oper_ptn AS oper_ptn,
		NULL AS disp_seq,
		t3.alt_grp_cd,
		t3.alt_grp_seq,
		t3.oper_ord_no,
		t3.oper_inst_no,
		t3.alt_itm_typ,
		t3.alt_itm_ratio,
		t3.alt_alloc_prio,
		t3.lot_no,
		t3.sublot_no,
		NULL AS lot_seq,
		NULL AS mfg_loc_cd,
		NULL AS sppl_cd,
		NULL AS maker_cd,
		NULL AS rqst_loc_cd,
		NULL AS rqst_wg_cd,
		t3.base_unit_qty AS qty,
		NULL AS master_dt,
		NULL AS po_schd_dt,
		NULL AS gi_schd_dt,
		NULL AS mfg_st_schd_dt,
		NULL AS mfg_end_schd_dt,
		NULL AS st_schd_tm,
		NULL AS end_schd_tm,
		NULL AS strg_schd_dt,
		NULL AS accpt_schd_dt,
		NULL AS insp_st_schd_dt,
		NULL AS insp_end_schd_dt,
		NULL AS first_gr_dt,
		t3.schd_dt AS avl_schd_dt,
		t3.oper_cd,
		t3.oper_seq,
		t3.sno1,
		t3.sno_typ1,
		t3.sno2,
		t3.sno_typ2,
		t3.sno3,
		t3.sno_typ3,
		t3.sno4,
		t3.sno_typ4,
		t3.ex_sno1,
		t3.ex_sno2,
		t3.ex_sno3,
		t3.ex_sno4,
		t3.gd_cd,
		NULL AS lmt_dt,
		t3.wg_cd,
		NULL AS rqmt_no,
		t3.inpt_ctl_typ,
		t3.alloc_flg
	FROM	msvt_mrp_io_schd_gi_noship t3
	WHERE	0=0
	AND	t3.wg_cd = i_wg_cd
	AND	i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_gp_sim
	AND	i_sim_mrp.gi_flg = '1'
	UNION ALL
	SELECT
		c_mrp_data_typ_schdo,
		t3.itm_ord_no,
		t3.io_schd_no,
		t3.io_schd_typ,
		t3.io_schd_sts_typ,
		NULL AS itm_ord_typ,
		NULL AS itm_ord_sts_typ,
		NULL AS oper_ord_sts_typ,
		t3.itm_cd,
		t3.itm_sub1,
		t3.itm_sub2,
		t3.itm_sub3,
		t3.ver_no,
		t3.loc_cd,
		NULL AS bom_ptn,
		t3.oper_ptn AS oper_ptn,
		NULL AS disp_seq,
		t3.alt_grp_cd,
		t3.alt_grp_seq,
		t3.oper_ord_no,
		t3.oper_inst_no,
		t3.alt_itm_typ,
		t3.alt_itm_ratio,
		t3.alt_alloc_prio,
		t3.lot_no,
		t3.sublot_no,
		NULL AS lot_seq,
		NULL AS mfg_loc_cd,
		NULL AS sppl_cd,
		NULL AS maker_cd,
		NULL AS rqst_loc_cd,
		NULL AS rqst_wg_cd,
		t3.base_unit_qty AS qty,
		NULL AS master_dt,
		NULL AS po_schd_dt,
		NULL AS gi_schd_dt,
		NULL AS mfg_st_schd_dt,
		NULL AS mfg_end_schd_dt,
		NULL AS st_schd_tm,
		NULL AS end_schd_tm,
		NULL AS strg_schd_dt,
		NULL AS accpt_schd_dt,
		NULL AS insp_st_schd_dt,
		NULL AS insp_end_schd_dt,
		NULL AS first_gr_dt,
		t3.schd_dt AS avl_schd_dt,
		t3.oper_cd,
		t3.oper_seq,
		t3.sno1,
		t3.sno_typ1,
		t3.sno2,
		t3.sno_typ2,
		t3.sno3,
		t3.sno_typ3,
		t3.sno4,
		t3.sno_typ4,
		t3.ex_sno1,
		t3.ex_sno2,
		t3.ex_sno3,
		t3.ex_sno4,
		t3.gd_cd,
		NULL AS lmt_dt,
		t3.wg_cd,
		NULL AS rqmt_no,
		t3.inpt_ctl_typ,
		t3.alloc_flg
	FROM	msvt_mrp_io_schd_gi_ship t3
	WHERE	0=0
	AND	t3.wg_cd = i_wg_cd
	AND	i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_gp_sim
	AND	i_sim_mrp.ship_flg = '1'
	UNION ALL
	SELECT
		c_mrp_data_typ_schdi,
		t4.itm_ord_no AS itm_ord_no,
		t4.io_schd_no AS io_schd_no,
		t4.io_schd_typ AS io_schd_typ,
		t4.io_schd_sts_typ AS io_schd_sts_typ,
		NULL AS itm_ord_typ,
		NULL AS itm_ord_sts_typ,
		NULL AS oper_ord_sts_typ,
		t4.itm_cd,
		t4.itm_sub1,
		t4.itm_sub2,
		t4.itm_sub3,
		t4.ver_no,
		t4.loc_cd,
		NULL AS bom_ptn,
		NULL AS oper_ptn,
		NULL AS disp_seq,
		NULL AS alt_grp_cd,
		NULL AS alt_grp_seq,
		NULL AS oper_ord_no,
		NULL AS oper_inst_no,
		NULL AS alt_itm_typ,
		NULL AS alt_itm_ratio,
		NULL AS alt_alloc_prio,
		t4.lot_no,
		t4.sublot_no,
		NULL AS lot_seq,
		NULL AS mfg_loc_cd,
		NULL AS sppl_cd,
		NULL AS maker_cd,
		NULL AS rqst_loc_cd,
		NULL AS rqst_wg_cd,
		t4.base_unit_qty AS qty,
		NULL AS master_dt,
		NULL AS po_schd_dt,
		NULL AS gi_schd_dt,
		NULL AS mfg_st_schd_dt,
		NULL AS mfg_end_schd_dt,
		NULL AS st_schd_tm,
		NULL AS end_schd_tm,
		NULL AS strg_schd_dt,
		NULL AS accpt_schd_dt,
		NULL AS insp_st_schd_dt,
		NULL AS insp_end_schd_dt,
		NULL AS first_gr_dt,
		t4.avl_schd_dt AS avl_schd_dt,
		NULL AS oper_cd,
		NULL AS oper_seq,
		t4.sno1,
		NULL AS sno_typ1,
		t4.sno2,
		NULL AS sno_typ2,
		t4.sno3,
		NULL AS sno_typ3,
		t4.sno4,
		NULL AS sno_typ4,
		NULL AS ex_sno1,
		NULL AS ex_sno2,
		NULL AS ex_sno3,
		NULL AS ex_sno4,
		t4.gd_cd,
		DATE_TRUNC('DAY', t4.lmt_dt) + '1 days'::INTERVAL AS lmt_dt,
		t4.wg_cd,
		NULL AS rqmt_no,
		NULL AS inpt_ctl_typ,
		'0' AS alloc_flg
	FROM	msvt_mrp_io_schd_gr t4
	WHERE	0=0
	AND	t4.wg_cd = i_wg_cd
	AND	(i_sim_mrp.sim_mrp_no IS NULL
		OR i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_prms
		OR (i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_gp_sim AND i_sim_mrp.gr_flg = '1')
		)
	UNION ALL
	SELECT
		c_mrp_data_typ_schdi,
		t4.itm_ord_no AS itm_ord_no,
		t4.io_schd_no AS io_schd_no,
		t4.io_schd_typ AS io_schd_typ,
		t4.io_schd_sts_typ AS io_schd_sts_typ,
		NULL AS itm_ord_typ,
		NULL AS itm_ord_sts_typ,
		NULL AS oper_ord_sts_typ,
		t4.itm_cd,
		t4.itm_sub1,
		t4.itm_sub2,
		t4.itm_sub3,
		t4.ver_no,
		t4.loc_cd,
		NULL AS bom_ptn,
		NULL AS oper_ptn,
		NULL AS disp_seq,
		NULL AS alt_grp_cd,
		NULL AS alt_grp_seq,
		NULL AS oper_ord_no,
		NULL AS oper_inst_no,
		NULL AS alt_itm_typ,
		NULL AS alt_itm_ratio,
		NULL AS alt_alloc_prio,
		t4.lot_no,
		t4.sublot_no,
		NULL AS lot_seq,
		NULL AS mfg_loc_cd,
		NULL AS sppl_cd,
		NULL AS maker_cd,
		NULL AS rqst_loc_cd,
		NULL AS rqst_wg_cd,
		t4.base_unit_qty AS qty,
		NULL AS master_dt,
		NULL AS po_schd_dt,
		NULL AS gi_schd_dt,
		NULL AS mfg_st_schd_dt,
		NULL AS mfg_end_schd_dt,
		NULL AS st_schd_tm,
		NULL AS end_schd_tm,
		NULL AS strg_schd_dt,
		NULL AS accpt_schd_dt,
		NULL AS insp_st_schd_dt,
		NULL AS insp_end_schd_dt,
		NULL AS first_gr_dt,
		t4.avl_schd_dt AS avl_schd_dt,
		NULL AS oper_cd,
		NULL AS oper_seq,
		t4.sno1,
		NULL AS sno_typ1,
		t4.sno2,
		NULL AS sno_typ2,
		t4.sno3,
		NULL AS sno_typ3,
		t4.sno4,
		NULL AS sno_typ4,
		NULL AS ex_sno1,
		NULL AS ex_sno2,
		NULL AS ex_sno3,
		NULL AS ex_sno4,
		t4.gd_cd,
		DATE_TRUNC('DAY', t4.lmt_dt) + '1 days'::INTERVAL AS lmt_dt,
		t4.wg_cd,
		NULL AS rqmt_no,
		NULL AS inpt_ctl_typ,
		'0' AS alloc_flg
	FROM	msvt_mrp_sim_io_schd_gr t4
	WHERE	0=0
	AND	t4.wg_cd = i_wg_cd
	AND	i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_sd_adjst
	UNION ALL
	SELECT
		c_mrp_data_typ_kordz,
		t5.itm_ord_no AS itm_ord_no,
		NULL AS io_schd_no,
		NULL AS io_schd_typ,
		NULL AS io_schd_sts_typ,
		NULL AS itm_ord_typ,
		NULL AS itm_ord_sts_typ,
		t5.oper_ord_sts_typ,
		NULL AS itm_cd,
		NULL AS itm_sub1,
		NULL AS itm_sub2,
		NULL AS itm_sub3,
		NULL AS ver_no,
		NULL AS loc_cd,
		NULL AS bom_ptn,
		t5.oper_ptn,
		t5.disp_seq,
		NULL AS alt_grp_cd,
		NULL AS alt_grp_seq,
		t5.oper_ord_no,
		NULL AS oper_inst_no,
		NULL AS alt_itm_typ,
		NULL AS alt_itm_ratio,
		NULL AS alt_alloc_prio,
		NULL AS lot_no,
		NULL AS sublot_no,
		NULL AS lot_seq,
		t5.loc_cd AS mfg_loc_cd,
		NULL AS sppl_cd,
		NULL AS maker_cd,
		NULL AS rqst_loc_cd,
		NULL AS rqst_wg_cd,
		t5.oper_schd_qty AS qty,
		NULL AS master_dt,
		NULL AS po_schd_dt,
		NULL AS gi_schd_dt,
		NULL AS mfg_st_schd_dt,
		NULL AS mfg_end_schd_dt,
		t5.st_schd_tm AS st_schd_tm,
		t5.end_schd_tm AS end_schd_tm,
		NULL AS strg_schd_dt,
		NULL AS accpt_schd_dt,
		NULL AS insp_st_schd_dt,
		NULL AS insp_end_schd_dt,
		NULL AS first_gr_dt,
		NULL AS avl_schd_dt,
		t5.oper_cd,
		t5.oper_seq,
		NULL AS sno1,
		NULL AS sno_typ1,
		NULL AS sno2,
		NULL AS sno_typ2,
		NULL AS sno3,
		NULL AS sno_typ3,
		NULL AS sno4,
		NULL AS sno_typ4,
		NULL AS ex_sno1,
		NULL AS ex_sno2,
		NULL AS ex_sno3,
		NULL AS ex_sno4,
		NULL AS gd_cd,
		NULL AS lmt_dt,
		t5.wg_cd,
		NULL AS rqmt_no,
		NULL AS inpt_ctl_typ,
		'0' AS alloc_flg
	FROM	msvt_mrp_oper_orderz t5
	WHERE	0=0
	AND	t5.wg_cd = i_wg_cd
	AND	(i_sim_mrp.sim_mrp_no IS NULL
		OR i_sim_mrp.sim_mrp_typ IN (c_sim_mrp_typ_sd_adjst, c_sim_mrp_typ_prms)
		OR (i_sim_mrp.sim_mrp_typ = c_sim_mrp_typ_gp_sim AND i_sim_mrp.gr_flg = '1')
		)
	;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_mrpea$p_mrp_orderz(
	 IN i_wg_cd VARCHAR,
	 IN i_proc_typ VARCHAR,
	 IN i_proc_cnt VARCHAR,
	 IN i_sim_mrp mst_sim_mrp
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ用トランザクション取得
<REMARKS>
		ＭＲＰで参照する複数のトランザクションを一貫性を持って取得する
<ARGUMENTS>

<ITEM>
	i_wg_cd		: ＷＧＣＤ
	i_proc_tyP	: ＭＲＰ実行区分
	i_proc_cnT	: ＭＲＰ計算ＮＯ
	i_sim_mrp	: シミュレーション管理情報
<HISTORY>
**************************************************************************/
BEGIN
	IF i_proc_typ = fcpa_const$get_const_val('MSC_MRP_TYP','MRP') THEN
		CALL mspa_mrpea$p_mrp_orderz_sub(i_wg_cd, i_sim_mrp);
	ELSIF i_proc_typ = fcpa_const$get_const_val('MSC_MRP_TYP','PRCD') THEN
		CALL mspa_mrpea$p_mrp_orderz_sub(i_wg_cd, i_sim_mrp);
	ELSIF i_proc_typ = fcpa_const$get_const_val('MSC_MRP_TYP','SIM') THEN
		IF i_sim_mrp.sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','GP_SIM') THEN
			CALL mspa_mrpea$p_mrp_orderz_sub(i_wg_cd, i_sim_mrp);
		ELSIF i_sim_mrp.sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','MST_CHK') THEN
			NULL;
		ELSIF i_sim_mrp.sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','SD_ADJST') THEN
			CALL mspa_mrpea$p_mrp_orderz_sub(i_wg_cd, i_sim_mrp);
		ELSIF i_sim_mrp.sim_mrp_typ = fcpa_const$get_const_val('MSC_SIM_MRP_TYP','PRMS') THEN
			CALL mspa_mrpea$p_mrp_orderz_sub(i_wg_cd, i_sim_mrp);
		END IF;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_mrpea$p_mrpea1(
	 IN i_wg_cd VARCHAR,
	 IN i_proc_typ VARCHAR,
	 IN i_proc_cnt VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_sim_mrp_typ VARCHAR,
	 INOUT o_out NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ前処理
<REMARKS>
		ＭＲＰの処理最初に呼ばれるプロシージャ
<ARGUMENTS>

<ITEM>
	i_wg_cd			: ＷＧＣＤ
	i_proc_typ		: ＭＲＰ実行区分
	i_proc_cnt		: ＭＲＰ計算ＮＯ
	i_sim_mrp_no	: シミュレーションＮＯ
	i_sim_mrp_typ	: シミュレーションＭＲＰ区分
	o_out			: 処理結果	０：正常終了
<HISTORY>
**************************************************************************/
BEGIN

	o_out := 0;

EXCEPTION
	WHEN others THEN
		o_out := 9;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_mrpea$p_mrpea2(
	 IN i_wg_cd VARCHAR,
	 IN i_proc_typ VARCHAR,
	 IN i_proc_cnt VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_sim_mrp_typ VARCHAR,
	 INOUT o_out NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ中処理
<REMARKS>
		ＭＲＰによる未確定データ削除後に呼ばれるプロシージャ
<ARGUMENTS>

<ITEM>
	i_wg_cd			: ＷＧＣＤ
	i_proc_typ		: ＭＲＰ実行区分
	i_proc_cnt		: ＭＲＰ計算ＮＯ
	i_sim_mrp_no	: シミュレーションＮＯ
	i_sim_mrp_typ	: シミュレーションＭＲＰ区分
	o_out			: 処理結果	０：正常終了
<HISTORY>
**************************************************************************/
DECLARE
	l_sim_mrp mst_sim_mrp%ROWTYPE;
BEGIN
	IF i_sim_mrp_no IS NOT NULL THEN
		l_sim_mrp := mspa_mrpea$f_get_sim_mrp(i_sim_mrp_no);
	END IF;

	CALL mspa_mrpea$p_valid_itm(i_wg_cd, i_proc_typ, l_sim_mrp);

	CALL mspa_mrpea$p_mrp_orderz(i_wg_cd, i_proc_typ, i_proc_cnt, l_sim_mrp);

	o_out := 0;

EXCEPTION
	WHEN others THEN
		o_out := 9;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_mrpea$p_mrpea3(
	 IN i_wg_cd VARCHAR,
	 IN i_proc_typ VARCHAR,
	 IN i_proc_cnt VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_sim_mrp_typ VARCHAR,
	 INOUT o_out NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ後処理
<REMARKS>
		ＭＲＰ実行後に呼ばれるプロシージャ
<ARGUMENTS>

<ITEM>
	i_wg_cd			: ＷＧＣＤ
	i_proc_typ		: ＭＲＰ実行区分
	i_proc_cnt		: ＭＲＰ計算ＮＯ
	i_sim_mrp_no	: シミュレーションＮＯ
	i_sim_mrp_typ	: シミュレーションＭＲＰ区分
	o_out			: 処理結果	０：正常終了
<HISTORY>
**************************************************************************/
BEGIN

	o_out := 0;

EXCEPTION
	WHEN others THEN
		o_out := 9;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mspa_mrpea$p_get_sim_mrp(
	 IN i_sim_mrp_no VARCHAR,
	 INOUT o_dly_rqmt_flg CHARACTER,
	 INOUT o_stk_flg CHARACTER,
	 INOUT o_gr_flg CHARACTER,
	 INOUT o_gi_flg CHARACTER,
	 INOUT o_out NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ処理
<REMARKS>
		MST_SIM_MRPの取得
<ARGUMENTS>

<ITEM>
	i_sim_mrp_no	: シミュレーションＮＯ
	o_dly_rqmt_flg	: 日次生産依頼
	o_stk_flg	: 在庫
	o_gr_flg	: 入庫予定
	o_gi_flg	: 出庫予定(出荷予定除く)
	o_out		: 処理結果	０：正常終了
<HISTORY>
**************************************************************************/
BEGIN
	SELECT	t.dly_rqmt_flg, t.stk_flg, t.gr_flg, t.gi_flg
	INTO STRICT o_dly_rqmt_flg, o_stk_flg, o_gr_flg, o_gi_flg
	FROM	mst_sim_mrp t
	WHERE	0=0
	AND	t.sim_mrp_no = i_sim_mrp_no
	;

	o_out := 0;

EXCEPTION
	WHEN others THEN
		o_out := 9;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mspa_mrpea$p_get_sim_mrp(
	 IN i_sim_mrp_no VARCHAR,
	 INOUT o_dly_rqmt_flg CHARACTER,
	 INOUT o_stk_flg CHARACTER,
	 INOUT o_gr_flg CHARACTER,
	 INOUT o_gi_flg CHARACTER,
	 INOUT o_ship_flg CHARACTER,
	 INOUT o_out NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ処理
<REMARKS>
		MST_SIM_MRPの取得
<ARGUMENTS>

<ITEM>
	i_sim_mrp_no	: シミュレーションＮＯ
	o_dly_rqmt_flg	: 日次生産依頼
	o_stk_flg	: 在庫
	o_gr_flg	: 入庫予定
	o_gi_flg	: 出庫予定(出荷予定除く)
	o_ship_flg	: 出荷予定
	o_out		: 処理結果	０：正常終了
<HISTORY>
**************************************************************************/
BEGIN
	SELECT	t.dly_rqmt_flg, t.stk_flg, t.gr_flg, t.gi_flg, t.ship_flg
	INTO STRICT o_dly_rqmt_flg, o_stk_flg, o_gr_flg, o_gi_flg, o_ship_flg
	FROM	mst_sim_mrp t
	WHERE	0=0
	AND	t.sim_mrp_no = i_sim_mrp_no
	;

	o_out := 0;

EXCEPTION
	WHEN others THEN
		o_out := 9;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mspa_mrpea$p_get_prefix(
	 IN i_wg_cd VARCHAR,
	 IN i_mrp_cntr_typ VARCHAR,
	 INOUT o_prefix VARCHAR,
	 INOUT o_out NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ処理
<REMARKS>
		PREFIXの取得
<ARGUMENTS>

<ITEM>
	i_wg_cd		: ワーキンググループＣＤ
	i_mrp_cntr_typ	: ＭＲＰカウンタ区分
	o_prefix	: 接頭辞
	o_out		: 処理結果	０：正常終了
<HISTORY>
**************************************************************************/
BEGIN
	SELECT	t.prefix
	INTO STRICT o_prefix
	FROM	mst_mrp_cntr t
	WHERE	0=0
	AND	t.wg_cd = i_wg_cd
	AND	t.mrp_cntr_typ = i_mrp_cntr_typ
	;

	o_out := 0;

EXCEPTION
	WHEN others THEN
		o_out := 9;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mspa_mrpea$p_get_stdgd(
	 INOUT o_stdgd VARCHAR,
	 INOUT o_out NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ処理
<REMARKS>
		デフォルト格付の取得
<ARGUMENTS>

<ITEM>
	o_stdgd		: デフォルト格付ＣＤ
	o_out		: 処理結果	０：正常終了
<HISTORY>
**************************************************************************/
BEGIN
	o_stdgd := mapa_util$f_get_def_gd_cd() ;

	o_out := 0;

EXCEPTION
	WHEN others THEN
		o_out := 9;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mspa_mrpea$p_get_today(
	 INOUT o_today VARCHAR,
	 INOUT o_out NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
		ＭＲＰ処理
<REMARKS>
		システム日付の取得
<ARGUMENTS>

<ITEM>
	o_today		: システム日付の文字列（YYYYMMDD)
	o_out		: 処理結果	０：正常終了
<HISTORY>
**************************************************************************/
BEGIN
	o_today := TO_CHAR(fcpa_date_util$f_get_today(), 'YYYYMMDD') ;

	o_out := 0;

EXCEPTION
	WHEN others THEN
		o_out := 9;
END;
$BODY$
LANGUAGE plpgsql
;

