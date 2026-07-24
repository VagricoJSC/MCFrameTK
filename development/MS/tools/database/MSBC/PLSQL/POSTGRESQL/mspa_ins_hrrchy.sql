CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_itm_ord_f_hrrchy_impl (
	 IN i_list msw_itm_ord_f_hrrchy[],
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	P_INS_ITM_ORD_F_HRRCHY_...の実装
<REMARKS>
	オーダ正展開用
<ARGUMENTS>
<IN>	i_list
		リスト
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	c_def_max_lvl	CONSTANT INTEGER := 500 ;
	l_lvl	msw_itm_ord_f_hrrchy.hrrchy%TYPE ;
	l_rec	msw_itm_ord_f_hrrchy%ROWTYPE ;
BEGIN

	IF COALESCE(array_length(i_list, 1), 0) > 0 THEN
		IF i_max_lvl IS NULL OR i_max_lvl <= 0 THEN
			l_lvl := c_def_max_lvl ;
		ELSE
			l_lvl := i_max_lvl ;
		END IF ;

		FOREACH l_rec IN ARRAY i_list LOOP
			INSERT INTO msw_itm_ord_f_hrrchy VALUES (l_rec.*) ;
			INSERT INTO msw_itm_ord_f_hrrchy
				WITH RECURSIVE t99 (
					root_id,
					level,
					top,
					itm_ord_no,
					chd_itm_cd,
					chd_itm_sub1,
					chd_itm_sub2,
					chd_itm_sub3,
					chd_ver_no,
					chd_loc_cd,
					chd_io_schd_pr_no,
					chd_lot_no,
					chd_sublot_no,
					chd_schd_alloc_qty,
					chd_gi_schd_dt,
					chd_sno1,
					chd_sno2,
					chd_sno3,
					chd_sno4,
					wg_cd,
					p_io_schd_pr_no,
					path,
					cycle
				) AS (
					SELECT
						l_rec.root_id AS root_id,
						1 AS level,
						ROW_NUMBER() OVER(ORDER BY t1.io_schd_pr_no) AS top,
						t1.io_schd_pr_no AS itm_ord_no,
						t0.itm_cd AS chd_itm_cd,
						t0.itm_sub1 AS chd_itm_sub1,
						t0.itm_sub2 AS chd_itm_sub2,
						t0.itm_sub3 AS chd_itm_sub3,
						t0.ver_no AS chd_ver_no,
						COALESCE(t1.loc_cd, t0.loc_cd) AS chd_loc_cd, -- 在庫管理しない場合は所要場所を格納場所とみなす
						t1.io_schd_pr_no AS chd_io_schd_pr_no,
						t1.lot_no AS chd_lot_no,
						t1.sublot_no AS chd_sublot_no,
						COALESCE(t1.schd_alloc_qty, t0.net_rqmt_qty) AS chd_schd_alloc_qty, -- 在庫管理しない場合は所要数を引当予定数とする
						t1.gi_schd_dt AS chd_gi_schd_dt,
						t1.sno1 AS chd_sno1,
						t1.sno2 AS chd_sno2,
						t1.sno3 AS chd_sno3,
						t1.sno4 AS chd_sno4,
						t0.wg_cd,
						t1.io_schd_pr_no AS p_io_schd_pr_no,
						ARRAY[t1.io_schd_pr_no]::VARCHAR(15)[] AS path,
						false
					FROM
						mst_mrprqmt t0
						LEFT JOIN mst_alloc_pln t1 ON (t0.rqmt_no = t1.rqmt_no)
						JOIN mavm_rd_wg t5 ON (t0.wg_cd = t5.wg_cd)
					WHERE	0=0
					AND	t0.itm_ord_no = l_rec.root_id
					UNION ALL
					SELECT
						t99.root_id AS root_id,
						t99.level + 1 AS level,
						t99.top AS top,
						t1.io_schd_pr_no AS itm_ord_no,
						t0.itm_cd AS chd_itm_cd,
						t0.itm_sub1 AS chd_itm_sub1,
						t0.itm_sub2 AS chd_itm_sub2,
						t0.itm_sub3 AS chd_itm_sub3,
						t0.ver_no AS chd_ver_no,
						COALESCE(t1.loc_cd, t0.loc_cd) AS chd_loc_cd, -- 在庫管理しない場合は所要場所を格納場所とみなす
						t1.io_schd_pr_no AS chd_io_schd_pr_no,
						t1.lot_no AS chd_lot_no,
						t1.sublot_no AS chd_sublot_no,
						COALESCE(t1.schd_alloc_qty, t0.net_rqmt_qty) AS chd_schd_alloc_qty, -- 在庫管理しない場合は所要数を引当予定数とする
						t1.gi_schd_dt AS chd_gi_schd_dt,
						t1.sno1 AS chd_sno1,
						t1.sno2 AS chd_sno2,
						t1.sno3 AS chd_sno3,
						t1.sno4 AS chd_sno4,
						t0.wg_cd,
						t1.io_schd_pr_no AS p_io_schd_pr_no,
						(t99.path || t1.io_schd_pr_no)::VARCHAR(15)[] AS path,
						t1.io_schd_pr_no = ANY(path) AS cycle
					FROM
						(mst_mrprqmt t0 CROSS JOIN t99)
						LEFT JOIN mst_alloc_pln t1 ON (t0.rqmt_no = t1.rqmt_no)
					WHERE	0=0
					AND	t99.p_io_schd_pr_no = t0.itm_ord_no
					AND	t99.level + 1 <= l_lvl
					AND	NOT cycle
				)
				SELECT
					root_id,
					ROW_NUMBER() OVER (ORDER BY top, path) AS sort_no,
					level,
					itm_ord_no,
					chd_itm_cd,
					chd_itm_sub1,
					chd_itm_sub2,
					chd_itm_sub3,
					chd_ver_no,
					chd_loc_cd,
					chd_io_schd_pr_no,
					chd_lot_no,
					chd_sublot_no,
					chd_schd_alloc_qty,
					chd_gi_schd_dt,
					chd_sno1,
					chd_sno2,
					chd_sno3,
					chd_sno4,
					wg_cd
				FROM	t99
			;
		END LOOP ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_itm_ord_f_hrrchy_o (
	 IN i_itm_ord_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MRP所要を元に作成した品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
<REMARKS>
	オーダ正展開用
<ARGUMENTS>
<IN>	i_itm_ord_no
		品目オーダＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR FOR
		SELECT
			i_itm_ord_no AS root_id,
			0 AS sort_no,
			0 AS level,
			i_itm_ord_no AS itm_ord_no,
			t.itm_cd AS chd_itm_cd,
			t.itm_sub1 AS chd_itm_sub1,
			t.itm_sub2 AS chd_itm_sub2,
			t.itm_sub3 AS chd_itm_sub3,
			t.ver_no AS chd_ver_no,
			t.strg_loc_cd AS chd_loc_cd,
			t.itm_ord_no AS chd_io_schd_pr_no,
			NULL AS chd_lot_no,
			NULL AS chd_sublot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t.sno1 AS chd_sno1,
			t.sno2 AS chd_sno2,
			t.sno3 AS chd_sno3,
			t.sno4 AS chd_sno4,
			t.wg_cd AS wg_cd
		FROM
			mst_itm_order t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND t.itm_ord_no = i_itm_ord_no
		;

	l_rec msw_itm_ord_f_hrrchy%ROWTYPE ;
	l_list msw_itm_ord_f_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_f_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_itm_ord_f_hrrchy_impl(l_list, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_itm_ord_f_hrrchy_r (
	 IN i_rqmt_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MRP所要を元に作成した品目オーダの階層化データをMSW_ITM_ORD_F_HRRCHYに格納する。
<REMARKS>
	オーダ正展開用
<ARGUMENTS>
<IN>	i_rqmt_no
		所要ＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR FOR
		SELECT
			t.itm_ord_no AS root_id,
			0 AS sort_no,
			0 AS level,
			t.itm_ord_no,
			t.itm_cd AS chd_itm_cd,
			t.itm_sub1 AS chd_itm_sub1,
			t.itm_sub2 AS chd_itm_sub2,
			t.itm_sub3 AS chd_itm_sub3,
			t.ver_no AS chd_ver_no,
			t.strg_loc_cd AS chd_loc_cd,
			t.itm_ord_no AS chd_io_schd_pr_no,
			NULL AS chd_lot_no,
			NULL AS chd_sublot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t.sno1 AS chd_sno1,
			t.sno2 AS chd_sno2,
			t.sno3 AS chd_sno3,
			t.sno4 AS chd_sno4,
			t.wg_cd AS wg_cd
		FROM
			mst_itm_order t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND t.rqmt_no = i_rqmt_no
		UNION ALL
		SELECT
			COALESCE(t.io_schd_pr_no, t.rqmt_no) AS root_id,
			0 AS sort_no,
			0 AS level,
			t1.itm_ord_no AS itm_ord_no,
			t.itm_cd AS chd_itm_cd,
			t.itm_sub1 AS chd_itm_sub1,
			t.itm_sub2 AS chd_itm_sub2,
			t.itm_sub3 AS chd_itm_sub3,
			t.ver_no AS chd_ver_no,
			t.loc_cd AS chd_loc_cd,
			t.io_schd_pr_no AS chd_io_schd_pr_no,
			t.lot_no AS chd_lot_no,
			t.sublot_no AS chd_sublot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t.sno1 AS chd_sno1,
			t.sno2 AS chd_sno2,
			t.sno3 AS chd_sno3,
			t.sno4 AS chd_sno4,
			t.wg_cd AS wg_cd
		FROM
			mst_alloc_pln t
			LEFT OUTER JOIN mst_itm_order t1 ON (t.io_schd_pr_no = t1.itm_ord_no)
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND t.rqmt_no = i_rqmt_no
		;

	l_rec msw_itm_ord_f_hrrchy%ROWTYPE ;
	l_list msw_itm_ord_f_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_f_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_itm_ord_f_hrrchy_impl(l_list, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_itm_ord_f_hrrchy_l (
	 IN i_slo_d_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MRP所要を元に作成した品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
<REMARKS>
	オーダ正展開用
<ARGUMENTS>
<IN>	i_slo_d_no
		受注明細ＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	c_gi	CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_TYP','GI') ;
	c_slo_d_no	CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_SCHD_SUB_TYP','SLO_D_NO') ;
	c_xfr_schd_no	CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_SCHD_SUB_TYP','XFR_SCHD_NO') ;

	l_cur CURSOR FOR
		/* 売上 */
		SELECT
			t3.itm_ord_no AS root_id,
			0 AS sort_no,
			0 AS level,
			t3.io_schd_pr_no AS itm_ord_no,
			t3.itm_cd AS chd_itm_cd,
			t3.itm_sub1 AS chd_itm_sub1,
			t3.itm_sub2 AS chd_itm_sub2,
			t3.itm_sub3 AS chd_itm_sub3,
			t3.ver_no AS chd_ver_no,
			t3.strg_loc_cd AS chd_loc_cd,
			t3.itm_ord_no AS chd_io_schd_pr_no,
			NULL AS chd_lot_no,
			NULL AS chd_sublot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t3.sno1 AS chd_sno1,
			t3.sno2 AS chd_sno2,
			t3.sno3 AS chd_sno3,
			t3.sno4 AS chd_sno4,
			t3.wg_cd AS wg_cd
		FROM
			mst_io_schd t1
			LEFT OUTER JOIN msvt_mrprqmt_alloc_pln t2 ON
				(0=0
				AND	t1.io_schd_typ = t2.io_schd_typ
				AND	t1.io_schd_sts_typ = t2.io_schd_sts_typ
				AND	t1.io_schd_no = t2.io_schd_no
				)
			LEFT OUTER JOIN mst_itm_order t3 ON (t2.chd_io_schd_pr_no = t3.itm_ord_no)
			JOIN mavm_rd_wg t4 ON (t3.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t1.io_typ = c_gi
		AND	t1.io_schd_sub_typ2 = c_slo_d_no
		AND	t1.io_schd_sub_no2 = i_slo_d_no
		AND	t2.chd_io_schd_pr_no IS NOT NULL
		/* 移送予定（WG間経由の売上） */
		UNION ALL
		SELECT
			t1.io_schd_pr_no AS root_id,
			0 AS sort_no,
			0 AS level,
			t1.io_schd_pr_no AS itm_ord_no,
			t1.itm_cd AS chd_itm_cd,
			t1.itm_sub1 AS chd_itm_sub1,
			t1.itm_sub2 AS chd_itm_sub2,
			t1.itm_sub3 AS chd_itm_sub3,
			t1.ver_no AS chd_ver_no,
			t3.gr_loc_cd AS loc_cd,
			t1.io_schd_pr_no AS chd_io_schd_pr_no,
			NULL AS chd_lot_no,
			NULL AS chd_sublot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t1.sno1 AS chd_sno1,
			t1.sno2 AS chd_sno2,
			t1.sno3 AS chd_sno3,
			t1.sno4 AS chd_sno4,
			t1.wg_cd AS wg_cd
		FROM
			mst_io_schd t1
			LEFT OUTER JOIN msvt_mrprqmt_alloc_pln t2 ON
				(0=0
				AND	t1.io_schd_typ = t2.io_schd_typ
				AND	t1.io_schd_sts_typ = t2.io_schd_sts_typ
				AND	t1.io_schd_no = t2.io_schd_no
				)
			JOIN mst_xfr_schd t3 ON (t1.io_schd_sub_no1 = t3.xfr_schd_no AND t1.io_schd_sub_typ1 = c_xfr_schd_no)
			JOIN mavm_rd_wg t4 ON (t3.gi_wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t1.io_typ = c_gi
		AND	t3.slo_d_no = i_slo_d_no
		AND	t2.chd_io_schd_pr_no IS NOT NULL
		;

	l_rec msw_itm_ord_f_hrrchy%ROWTYPE ;
	l_list msw_itm_ord_f_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_f_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_itm_ord_f_hrrchy_impl(l_list, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_itm_ord_r_hrrchy_impl (
	 IN i_list msw_itm_ord_r_hrrchy[],
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	P_INS_ITM_ORD_R_HRRCHY_...の実装
<REMARKS>
	オーダ逆展開用
<ARGUMENTS>
<IN>	i_list
		リスト
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	c_def_max_lvl	CONSTANT INTEGER := 500 ;
	c_xfr_gi	CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_SCHD_TYP','XFR_GI') ;

	l_lvl	msw_itm_ord_f_hrrchy.hrrchy%TYPE ;
	l_rec	msw_itm_ord_r_hrrchy%ROWTYPE ;
BEGIN

	IF COALESCE(array_length(i_list, 1), 0) > 0 THEN
		IF i_max_lvl IS NULL OR i_max_lvl <= 0 THEN
			l_lvl := c_def_max_lvl ;
		ELSE
			l_lvl := i_max_lvl ;
		END IF ;

		FOREACH l_rec IN ARRAY i_list LOOP
			INSERT INTO msw_itm_ord_r_hrrchy VALUES (l_rec.*) ;
			INSERT INTO msw_itm_ord_r_hrrchy
				WITH RECURSIVE t99 (
					root_id,
					level,
					top,
					rqmt_no,
					chd_rqmt_no,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					ver_no,
					lot_no,
					sublot_no,
					loc_cd,
					itm_ord_no,
					io_schd_typ,
					io_schd_pr_no,
					schd_alloc_qty,
					gi_schd_dt,
					sno1,
					sno2,
					sno3,
					sno4,
					wg_cd,
					p_rqmt_no,
					path,
					cycle
				) AS (
					SELECT
						l_rec.root_id as root_id,
						1 AS level,
						ROW_NUMBER() OVER(ORDER BY t4.rqmt_no) AS top,
						t1.rqmt_no,
						t4.rqmt_no as chd_rqmt_no,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_cd
							ELSE t4.itm_cd
						END AS itm_cd,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub1
							ELSE t4.itm_sub1
						END AS itm_sub1,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub2
							ELSE t4.itm_sub2
						END AS itm_sub2,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub3
							ELSE t4.itm_sub3
						END AS itm_sub3,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.ver_no
							ELSE t4.ver_no
						END AS ver_no,
						NULL AS lot_no,
						NULL AS sublot_no,
						t4.loc_cd,
						t1.itm_ord_no,
						t1.io_schd_typ,
						t1.itm_ord_no as io_schd_pr_no,
						t4.schd_alloc_qty,
						t4.gi_schd_dt,
						t1.sno1,
						t1.sno2,
						t1.sno3,
						t1.sno4,
						t1.wg_cd,
						t4.rqmt_no AS p_rqmt_no,
						ARRAY[t4.rqmt_no]::VARCHAR(15)[] AS path,
						false
					FROM
						mst_mrprqmt t1
						LEFT JOIN mst_alloc_pln t4 ON (t1.itm_ord_no = t4.io_schd_pr_no)
						JOIN mavm_rd_wg t5 ON (t1.wg_cd = t5.wg_cd)
					WHERE	0=0
					AND	t1.rqmt_no = l_rec.root_id
					UNION ALL
					SELECT
						t99.root_id AS root_id,
						t99.level + 1 AS level,
						t99.top AS top,
						t1.rqmt_no,
						t4.rqmt_no as chd_rqmt_no,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_cd
							ELSE t4.itm_cd
						END AS itm_cd,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub1
							ELSE t4.itm_sub1
						END AS itm_sub1,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub2
							ELSE t4.itm_sub2
						END AS itm_sub2,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub3
							ELSE t4.itm_sub3
						END AS itm_sub3,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.ver_no
							ELSE t4.ver_no
						END AS ver_no,
						NULL AS lot_no,
						NULL AS sublot_no,
						t4.loc_cd,
						t1.itm_ord_no,
						t1.io_schd_typ,
						t1.itm_ord_no as io_schd_pr_no,
						t4.schd_alloc_qty,
						t4.gi_schd_dt,
						t1.sno1,
						t1.sno2,
						t1.sno3,
						t1.sno4,
						t1.wg_cd,
						t4.rqmt_no AS p_rqmt_no,
						(t99.path || t4.rqmt_no)::VARCHAR(15)[] AS path,
						t4.rqmt_no = ANY(path) AS cycle
					FROM
						(mst_mrprqmt t1 CROSS JOIN t99)
						LEFT JOIN mst_alloc_pln t4 ON (t1.itm_ord_no = t4.io_schd_pr_no)
						JOIN mavm_rd_wg t5 ON (t1.wg_cd = t5.wg_cd)
					WHERE	0=0
					AND	t99.p_rqmt_no = t1.rqmt_no
					AND	t99.level + 1 <= l_lvl
					AND	NOT cycle
				)
				SELECT
					root_id,
					ROW_NUMBER() OVER (ORDER BY top, path) AS sort_no,
					level,
					rqmt_no,
					chd_rqmt_no,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					ver_no,
					lot_no,
					sublot_no,
					loc_cd,
					itm_ord_no,
					io_schd_typ,
					io_schd_pr_no,
					schd_alloc_qty,
					gi_schd_dt,
					sno1,
					sno2,
					sno3,
					sno4,
					wg_cd
				FROM	t99
				WHERE	0=0
				-- 逆展開の場合最初の階層以外に在庫はなく、itm_ord_noがない行は需要情報など関連する品目オーダ・受払予定のない情報
				-- 画面の明細として適切に表示できないため省く
				AND t99.itm_ord_no IS NOT NULL
			;
		END LOOP ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_itm_ord_r_hrrchy_o (
	 IN i_itm_ord_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MRP所要を元に作成した品目オーダの逆展開結果を一時表（MSW_ITM_ORD_R_HRRCHY）に格納する。
<REMARKS>
	オーダ逆展開用
<ARGUMENTS>
<IN>	i_itm_ord_no
		品目オーダＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	c_bymfg	CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_SCHD_TYP','BYMFG') ;

	l_cur CURSOR FOR
		SELECT
			t.rqmt_no AS root_id,
			0 AS sort_no,
			0 AS level,
			NULL AS rqmt_no,
			t.rqmt_no AS chd_rqmt_no,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.ver_no,
			t.lot_no,
			t.sublot_no,
			t.loc_cd,
			t.io_schd_pr_no AS itm_ord_no,
			NULL AS io_schd_typ,
			NULL AS io_schd_pr_no,
			t.schd_alloc_qty,
			t.gi_schd_dt,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.wg_cd
		FROM
			mst_alloc_pln t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t.io_schd_pr_no = i_itm_ord_no
		;

	l_rec	msw_itm_ord_r_hrrchy%ROWTYPE ;
	l_list	msw_itm_ord_r_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_r_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_itm_ord_r_hrrchy_impl(l_list, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_itm_ord_r_hrrchy_s (
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_lot_no VARCHAR,
	 IN i_sublot_no VARCHAR,
	 IN i_loc_cd VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MRP所要を元に作成した品目オーダの階層化データをMSW_ITM_ORD_R_HRRCHYに格納する。
<REMARKS>
	オーダ逆展開用
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_lot_no
		ロットＮＯ
<IN>	i_sublot_no
		サブロットＮＯ
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR FOR
		SELECT
			t.rqmt_no AS root_id,
			0 AS sort_no,
			0 AS level,
			NULL AS rqmt_no,
			t.rqmt_no AS chd_rqmt_no,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.ver_no,
			t.lot_no,
			t.sublot_no,
			t.loc_cd,
			NULL AS itm_ord_no,
			NULL AS io_schd_typ,
			NULL AS io_schd_pr_no,
			t.schd_alloc_qty,
			t.gi_schd_dt,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.wg_cd
		FROM
			mst_alloc_pln t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.lot_no = i_lot_no
		AND	t.sublot_no = i_sublot_no
		AND	t.loc_cd = i_loc_cd
	;

	l_rec msw_itm_ord_r_hrrchy%ROWTYPE ;
	l_list msw_itm_ord_r_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_r_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_itm_ord_r_hrrchy_impl(l_list, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_impl (
	 IN i_list msw_itm_ord_f_hrrchy[],
	 IN i_sim_mrp_no VARCHAR,
	 IN i_max_lvl	 NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	P_INS_SIM_ORD_F_HRRCHY_...の実装
<REMARKS>
	シミュレーションオーダ正展開用
<ARGUMENTS>
<IN>	i_list
		リスト
<in>	i_sim_mrp_no
		シミュレーションＮＯ
<in>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	c_def_max_lvl	CONSTANT INTEGER := 500 ;
	l_lvl	msw_itm_ord_f_hrrchy.hrrchy%TYPE ;
	l_rec	msw_itm_ord_f_hrrchy%ROWTYPE ;
BEGIN

	IF COALESCE(array_length(i_list, 1), 0) > 0 THEN
		IF i_max_lvl IS NULL OR i_max_lvl <= 0 THEN
			l_lvl := c_def_max_lvl ;
		ELSE
			l_lvl := i_max_lvl ;
		END IF ;

		FOREACH l_rec IN ARRAY i_list LOOP
			INSERT INTO msw_itm_ord_f_hrrchy VALUES (l_rec.*) ;
			INSERT INTO msw_itm_ord_f_hrrchy
				WITH RECURSIVE t99 (
					root_id,
					level,
					top,
					itm_ord_no,
					chd_itm_cd,
					chd_itm_sub1,
					chd_itm_sub2,
					chd_itm_sub3,
					chd_ver_no,
					chd_loc_cd,
					chd_io_schd_pr_no,
					chd_lot_no,
					chd_sublot_no,
					chd_schd_alloc_qty,
					chd_gi_schd_dt,
					chd_sno1,
					chd_sno2,
					chd_sno3,
					chd_sno4,
					wg_cd,
					p_io_schd_pr_no,
					p_sim_mrp_no,
					path,
					cycle
				) AS (
					SELECT
						l_rec.root_id as root_id,
						1 AS level,
						ROW_NUMBER() OVER(ORDER BY t1.io_schd_pr_no) AS top,
						t1.io_schd_pr_no as itm_ord_no,
						t0.itm_cd as chd_itm_cd,
						t0.itm_sub1 as chd_itm_sub1,
						t0.itm_sub2 as chd_itm_sub2,
						t0.itm_sub3 as chd_itm_sub3,
						t0.ver_no as chd_ver_no,
						COALESCE(t1.loc_cd, t0.loc_cd) AS chd_loc_cd, -- 在庫管理しない場合は所要場所を格納場所とみなす
						t1.io_schd_pr_no as chd_io_schd_pr_no,
						t1.lot_no as chd_lot_no,
						t1.sublot_no as chd_sublot_no,
						COALESCE(t1.schd_alloc_qty, t0.net_rqmt_qty) AS chd_schd_alloc_qty, -- 在庫管理しない場合は所要数を引当予定数とする
						t1.gi_schd_dt as chd_gi_schd_dt,
						t1.sno1 as chd_sno1,
						t1.sno2 as chd_sno2,
						t1.sno3 as chd_sno3,
						t1.sno4 as chd_sno4,
						t0.wg_cd,
						t1.io_schd_pr_no AS p_io_schd_pr_no,
						t1.sim_mrp_no AS p_sim_mrp_no,
						ARRAY[t1.io_schd_pr_no]::VARCHAR(15)[] AS path,
						false
					FROM
						mst_sim_mrprqmt t0
						LEFT JOIN mst_sim_alloc_pln t1 ON (t0.rqmt_no = t1.rqmt_no AND t0.sim_mrp_no = t1.sim_mrp_no)
						JOIN mavm_rd_wg t5 ON (t0.wg_cd = t5.wg_cd)
					WHERE	0=0
					AND	t0.itm_ord_no = l_rec.root_id
					AND	t0.sim_mrp_no = i_sim_mrp_no
					UNION ALL
					SELECT
						t99.root_id AS root_id,
						t99.level + 1 AS level,
						t99.top AS top,
						t1.io_schd_pr_no as itm_ord_no,
						t0.itm_cd as chd_itm_cd,
						t0.itm_sub1 as chd_itm_sub1,
						t0.itm_sub2 as chd_itm_sub2,
						t0.itm_sub3 as chd_itm_sub3,
						t0.ver_no as chd_ver_no,
						COALESCE(t1.loc_cd, t0.loc_cd) AS chd_loc_cd, -- 在庫管理しない場合は所要場所を格納場所とみなす
						t1.io_schd_pr_no as chd_io_schd_pr_no,
						t1.lot_no as chd_lot_no,
						t1.sublot_no as chd_sublot_no,
						COALESCE(t1.schd_alloc_qty, t0.net_rqmt_qty) AS chd_schd_alloc_qty, -- 在庫管理しない場合は所要数を引当予定数とする
						t1.gi_schd_dt as chd_gi_schd_dt,
						t1.sno1 as chd_sno1,
						t1.sno2 as chd_sno2,
						t1.sno3 as chd_sno3,
						t1.sno4 as chd_sno4,
						t0.wg_cd,
						t1.io_schd_pr_no AS p_io_schd_pr_no,
						t1.sim_mrp_no AS p_sim_mrp_no,
						(t99.path || t1.io_schd_pr_no)::VARCHAR(15)[] AS path,
						t1.io_schd_pr_no = ANY(path) AS cycle
					FROM
						(mst_sim_mrprqmt t0 CROSS JOIN t99)
						LEFT JOIN mst_sim_alloc_pln t1 ON (t0.rqmt_no = t1.rqmt_no and t0.sim_mrp_no = t1.sim_mrp_no)
						JOIN mavm_rd_wg t5 ON (t0.wg_cd = t5.wg_cd)
					WHERE	0=0
					AND	t99.p_io_schd_pr_no = t0.itm_ord_no
					AND	t99.p_sim_mrp_no = t0.sim_mrp_no
					AND	t99.level + 1 <= l_lvl
					AND	NOT cycle
				)
				SELECT
					root_id,
					ROW_NUMBER() OVER (ORDER BY top, path) AS sort_no,
					level,
					itm_ord_no,
					chd_itm_cd,
					chd_itm_sub1,
					chd_itm_sub2,
					chd_itm_sub3,
					chd_ver_no,
					chd_loc_cd,
					chd_io_schd_pr_no,
					chd_lot_no,
					chd_sublot_no,
					chd_schd_alloc_qty,
					chd_gi_schd_dt,
					chd_sno1,
					chd_sno2,
					chd_sno3,
					chd_sno4,
					wg_cd
				FROM	t99
			;
		END LOOP ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_o (
	 IN i_itm_ord_no VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MRP所要を元に作成したシミュレーション用品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
<REMARKS>
	シミュレーション用オーダ正展開用
<ARGUMENTS>
<IN>	i_itm_ord_no
		品目オーダＮＯ
<IN>	i_sim_mrp_no
		シミュレーションＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR FOR
		SELECT
			i_itm_ord_no AS root_id,
			0 AS sort_no,
			0 AS level,
			i_itm_ord_no AS itm_ord_no,
			t.itm_cd AS chd_itm_cd,
			t.itm_sub1 AS chd_itm_sub1,
			t.itm_sub2 AS chd_itm_sub2,
			t.itm_sub3 AS chd_itm_sub3,
			t.ver_no AS chd_ver_no,
			t.strg_loc_cd AS chd_loc_cd,
			t.itm_ord_no AS chd_io_schd_pr_no,
			NULL AS chd_lot_no,
			NULL AS chd_sub_lot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t.sno1 AS chd_sno1,
			t.sno2 AS chd_sno2,
			t.sno3 AS chd_sno3,
			t.sno4 AS chd_sno4,
			t.wg_cd
		FROM
			mst_sim_itm_order t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t.itm_ord_no = i_itm_ord_no
		AND	t.sim_mrp_no = i_sim_mrp_no
	;

	l_rec	msw_itm_ord_f_hrrchy%ROWTYPE ;
	l_list	msw_itm_ord_f_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_f_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_impl(l_list, i_sim_mrp_no, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_r (
	 IN i_rqmt_no VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MRP所要を元に作成したシミュレーション用品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
<REMARKS>
	シミュレーション用オーダ正展開用
<ARGUMENTS>
<IN>	i_rqmt_no
		所要ＮＯ
<IN>	i_sim_mrp_no
		シミュレーションＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR FOR
		SELECT
			t.itm_ord_no AS root_id,
			0 AS sort_no,
			0 AS hrrchy,
			t.itm_ord_no AS itm_ord_no,
			t.itm_cd AS chd_itm_cd,
			t.itm_sub1 AS chd_itm_sub1,
			t.itm_sub2 AS chd_itm_sub2,
			t.itm_sub3 AS chd_itm_sub3,
			t.ver_no AS chd_ver_no,
			t.strg_loc_cd AS chd_loc_cd,
			t.itm_ord_no AS chd_io_schd_pr_no,
			NULL AS chd_lot_no,
			NULL AS chd_sublot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t.sno1 AS chd_sno1,
			t.sno2 AS chd_sno2,
			t.sno3 AS chd_sno3,
			t.sno4 AS chd_sno4,
			t.wg_cd
		FROM
			mst_sim_itm_order t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t.rqmt_no = i_rqmt_no
		AND	t.sim_mrp_no = i_sim_mrp_no
		UNION ALL
		SELECT
			COALESCE(t.io_schd_pr_no, t.rqmt_no) AS root_id,
			0 AS sort_no,
			0 AS hrrchy,
			COALESCE(t1.itm_ord_no, t2.itm_ord_no) AS itm_ord_no,
			t.itm_cd AS chd_itm_cd,
			t.itm_sub1 AS chd_itm_sub1,
			t.itm_sub2 AS chd_itm_sub2,
			t.itm_sub3 AS chd_itm_sub3,
			t.ver_no AS chd_ver_no,
			t.loc_cd AS chd_loc_cd,
			t.io_schd_pr_no AS chd_io_schd_pr_no,
			t.lot_no AS chd_lot_no,
			t.sublot_no AS chd_sublot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t.sno1 AS chd_sno1,
			t.sno2 AS chd_sno2,
			t.sno3 AS chd_sno3,
			t.sno4 AS chd_sno4,
			t.wg_cd AS wg_cd
		FROM
			mst_sim_alloc_pln t
			LEFT OUTER JOIN mst_sim_itm_order t1 ON (t.io_schd_pr_no = t1.itm_ord_no)
			LEFT OUTER JOIN mst_itm_order t2 ON (t.io_schd_pr_no = t2.itm_ord_no)
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t.rqmt_no = i_rqmt_no
		AND	t.sim_mrp_no = i_sim_mrp_no
		;

	l_rec msw_itm_ord_f_hrrchy%ROWTYPE ;
	l_list msw_itm_ord_f_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_f_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_impl(l_list, i_sim_mrp_no, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_x (
	 IN i_rqmt_no VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	納期回答を元に作成したシミュレーション用品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
<REMARKS>
	シミュレーション用オーダ正展開用
<ARGUMENTS>
<IN>	i_rqmt_no
		所要ＮＯ
<IN>	i_sim_mrp_no
		シミュレーションＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	c_gi	CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_TYP','GI') ;
	c_slo_d_no	CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_SCHD_SUB_TYP','SLO_D_NO') ;

	l_cur CURSOR FOR
		SELECT
			COALESCE(t.io_schd_pr_no, t.rqmt_no) AS root_id,
			0 AS sort_no,
			0 AS level,
			NULL AS itm_ord_no,
			t.itm_cd AS chd_itm_cd,
			t.itm_sub1 AS chd_itm_sub1,
			t.itm_sub2 AS chd_itm_sub2,
			t.itm_sub3 AS chd_itm_sub3,
			t.ver_no AS chd_ver_no,
			t.loc_cd AS chd_loc_cd,
			t.io_schd_pr_no AS chd_io_schd_pr_no,
			t.lot_no AS chd_lot_no,
			t.sublot_no AS chd_sublot_no,
			NULL AS chd_schd_alloc_qty,
			NULL AS chd_gi_schd_dt,
			t.sno1 AS chd_sno1,
			t.sno2 AS chd_sno2,
			t.sno3 AS chd_sno3,
			t.sno4 AS chd_sno4, t.wg_cd AS wg_cd
		FROM
			mst_sim_alloc_pln t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t.rqmt_no = i_rqmt_no
		AND	t.sim_mrp_no = i_sim_mrp_no
	UNION ALL
	SELECT
		t2.itm_ord_no AS root_id,
			0 AS sort_no,
			0 AS level,
			t2.chd_io_schd_pr_no AS itm_ord_no,
			t2.chd_itm_cd,
			t2.chd_itm_sub1,
			t2.chd_itm_sub2,
			t2.chd_itm_sub3,
			t2.chd_ver_no,
			t2.chd_loc_cd,
			t2.chd_io_schd_pr_no,
			t2.chd_lot_no,
			t2.chd_sublot_no,
			t2.chd_schd_alloc_qty,
			t2.chd_gi_schd_dt,
			t2.chd_sno1,
			t2.chd_sno2,
			t2.chd_sno3,
			t2.chd_sno4,
			t1.wg_cd AS wg_cd
		FROM
			mst_io_schd t1
			LEFT OUTER JOIN msvt_sim_mrprqmt_alloc_pln t2 ON (0=0 AND t1.io_schd_typ = t2.io_schd_typ AND t1.io_schd_no = t2.io_schd_no)
		WHERE	0=0
		AND	t1.io_typ = c_gi
		AND	t1.io_schd_sub_typ2 = c_slo_d_no
		AND	t1.io_schd_sub_no2 = i_rqmt_no
	UNION ALL
		SELECT
			t2.itm_ord_no AS root_id,
			0 AS sort_no,
			0 AS level,
			t2.chd_io_schd_pr_no AS itm_ord_no,
			t2.chd_itm_cd,
			t2.chd_itm_sub1,
			t2.chd_itm_sub2,
			t2.chd_itm_sub3,
			t2.chd_ver_no,
			t2.chd_loc_cd,
			t2.chd_io_schd_pr_no,
			t2.chd_lot_no,
			t2.chd_sublot_no,
			t2.chd_schd_alloc_qty,
			t2.chd_gi_schd_dt,
			t2.chd_sno1,
			t2.chd_sno2,
			t2.chd_sno3,
			t2.chd_sno4,
			t1.wg_cd AS wg_cd
		FROM
			mst_io_schd t1
			LEFT OUTER JOIN msvt_sim_mrprqmt_alloc_pln t2 ON (0=0 AND t1.io_schd_typ = t2.io_schd_typ AND t1.io_schd_no = t2.io_schd_no)
		WHERE	0=0
		AND	t1.io_typ = c_gi
		AND	t1.io_schd_sub_typ3 = fcpa_const$get_const_val('MSC_IO_SCHD_SUB_TYP','SHIP_SCHD_NO')
		AND	t1.io_schd_sub_no3 = i_rqmt_no
	;

	l_rec msw_itm_ord_f_hrrchy%ROWTYPE ;
	l_list msw_itm_ord_f_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_f_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_impl(l_list, i_sim_mrp_no, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_p (
	 IN i_io_schd_no VARCHAR,
	 IN i_io_schd_typ VARCHAR,
	 IN i_io_schd_sts_typ VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	納期回答を元に作成したシミュレーション用品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
<REMARKS>
	シミュレーション用オーダ正展開用
<ARGUMENTS>
<IN>	i_io_schd_no
		受払予定ＮＯ
<IN>	i_io_schd_typ
		受払予定区分
<IN>	i_io_schd_sts_typ
		受払予定状況区分
<IN>	i_sim_mrp_no
		シミュレーションＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR FOR
		SELECT
			t1.chd_io_schd_pr_no AS root_id,
			0 AS sort_no,
			0 AS level,
			t1.chd_io_schd_pr_no AS itm_ord_no,
			t1.chd_itm_cd,
			t1.chd_itm_sub1,
			t1.chd_itm_sub2,
			t1.chd_itm_sub3,
			t1.chd_ver_no,
			t1.chd_loc_cd,
			t1.chd_io_schd_pr_no,
			t1.chd_lot_no,
			t1.chd_sublot_no,
			t1.chd_schd_alloc_qty,
			t1.chd_gi_schd_dt,
			t1.chd_sno1,
			t1.chd_sno2,
			t1.chd_sno3,
			t1.chd_sno4,
			t1.wg_cd AS wg_cd
		FROM
			msvt_sim_mrprqmt_alloc_pln t1
		WHERE	0=0
		AND	t1.io_schd_typ = i_io_schd_typ
		AND	t1.io_schd_sts_typ = i_io_schd_sts_typ
		AND	t1.io_schd_no = i_io_schd_no
		AND	t1.sim_mrp_no = i_sim_mrp_no
	;

	l_rec msw_itm_ord_f_hrrchy%ROWTYPE ;
	l_list msw_itm_ord_f_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_f_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_sim_ord_f_hrrchy_impl(l_list, i_sim_mrp_no, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_sim_ord_r_hrrchy_impl (
	 IN i_list msw_itm_ord_r_hrrchy[],
	 IN i_sim_mrp_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	P_INS_SIM_ITM_ORD_R_HRRCHY_...の実装
<REMARKS>
	シミュレーション用オーダ逆展開用
<ARGUMENTS>
<IN>	i_list
		リスト
<IN>	i_sim_mrp_no
		シミュレーションＮＯ
<HISTORY>
**********************************************************/
DECLARE
	c_def_max_lvl	CONSTANT INTEGER := 500 ;
	c_xfr_gi	CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_SCHD_TYP','XFR_GI') ;

	l_lvl	msw_itm_ord_f_hrrchy.hrrchy%TYPE ;
	l_rec	msw_itm_ord_r_hrrchy%ROWTYPE ;
BEGIN

	IF COALESCE(array_length(i_list, 1), 0) > 0 THEN
		IF i_max_lvl IS NULL OR i_max_lvl <= 0 THEN
			l_lvl := c_def_max_lvl ;
		ELSE
			l_lvl := i_max_lvl ;
		END IF ;

		FOREACH l_rec IN ARRAY i_list LOOP
			INSERT INTO msw_itm_ord_r_hrrchy VALUES (l_rec.*) ;
			INSERT INTO msw_itm_ord_r_hrrchy
				WITH RECURSIVE t99 (
					root_id,
					level,
					top,
					rqmt_no,
					chd_rqmt_no,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					ver_no,
					lot_no,
					sublot_no,
					loc_cd,
					itm_ord_no,
					io_schd_typ,
					io_schd_pr_no,
					io_schd_no,
					schd_alloc_qty,
					gi_schd_dt,
					sno1,
					sno2,
					sno3,
					sno4,
					wg_cd,
					p_rqmt_no,
					p_sim_mrp_no,
					path,
					cycle
				) AS (
					SELECT
						l_rec.root_id AS root_id,
						1 AS level,
						ROW_NUMBER() OVER(ORDER BY t1.rqmt_no) AS top,
						t1.rqmt_no,
						t4.rqmt_no as chd_rqmt_no,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_cd
							ELSE t4.itm_cd
						END AS itm_cd,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub1
							ELSE t4.itm_sub1
						END AS itm_sub1,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub2
							ELSE t4.itm_sub2
						END AS itm_sub2,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub3
							ELSE t4.itm_sub3
						END AS itm_sub3,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.ver_no
							ELSE t4.ver_no
						END AS ver_no,
						NULL AS lot_no,
						NULL AS sublot_no,
						t4.loc_cd,
						t1.itm_ord_no,
						t1.io_schd_typ,
						t1.itm_ord_no AS io_schd_pr_no,
						t1.io_schd_no,
						t4.schd_alloc_qty,
						t4.gi_schd_dt,
						t1.sno1,
						t1.sno2,
						t1.sno3,
						t1.sno4,
						t1.wg_cd,
						t4.rqmt_no AS p_rqmt_no,
						t4.sim_mrp_no AS p_sim_mrp_no,
						ARRAY[t1.rqmt_no]::VARCHAR(15)[] AS path,
						false
					FROM
						mst_sim_mrprqmt t1
						LEFT JOIN mst_sim_alloc_pln t4 ON (t1.itm_ord_no = t4.io_schd_pr_no and t1.sim_mrp_no = t4.sim_mrp_no)
						JOIN mavm_rd_wg t5 ON (t1.wg_cd = t5.wg_cd)
					WHERE	0=0
					AND	t1.rqmt_no = l_rec.root_id
					AND	t1.sim_mrp_no = i_sim_mrp_no
					UNION ALL
					SELECT
						t99.root_id AS root_id,
						t99.level + 1 AS level,
						t99.top AS top,
						t1.rqmt_no,
						t4.rqmt_no AS chd_rqmt_no,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_cd
							ELSE t4.itm_cd
						END AS itm_cd,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub1
							ELSE t4.itm_sub1
						END AS itm_sub1,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub2
							ELSE t4.itm_sub2
						END AS itm_sub2,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.itm_sub3
							ELSE t4.itm_sub3
						END AS itm_sub3,
						CASE t1.io_schd_typ
							WHEN c_xfr_gi THEN t1.ver_no
							ELSE t4.ver_no
						END AS ver_no,
						NULL AS lot_no,
						NULL AS sublot_no,
						t4.loc_cd,
						t1.itm_ord_no,
						t1.io_schd_typ,
						t1.itm_ord_no as io_schd_pr_no,
						t1.io_schd_no,
						t4.schd_alloc_qty,
						t4.gi_schd_dt,
						t1.sno1,
						t1.sno2,
						t1.sno3,
						t1.sno4,
						t1.wg_cd,
						t4.rqmt_no AS p_rqmt_no,
						t4.sim_mrp_no AS p_sim_mrp_no,
						(t99.path || t1.rqmt_no)::VARCHAR(15)[] AS path,
						t1.rqmt_no = ANY(path) AS cycle
					FROM
						(mst_sim_mrprqmt t1 CROSS JOIN t99)
						LEFT JOIN mst_sim_alloc_pln t4 ON (t1.itm_ord_no = t4.io_schd_pr_no and t1.sim_mrp_no = t4.sim_mrp_no)
						JOIN mavm_rd_wg t5 ON (t1.wg_cd = t5.wg_cd)
					WHERE	0=0
					AND	t99.p_rqmt_no = t1.rqmt_no
					AND	t99.p_sim_mrp_no = t1.sim_mrp_no
					AND	t99.level + 1 <= l_lvl
					AND	NOT cycle
				)
				SELECT
					root_id,
					ROW_NUMBER() OVER (ORDER BY top, path) AS sort_no,
					level,
					rqmt_no,
					chd_rqmt_no,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					ver_no,
					lot_no,
					sublot_no,
					loc_cd,
					itm_ord_no,
					io_schd_typ,
					io_schd_pr_no,
					schd_alloc_qty,
					gi_schd_dt,
					sno1,
					sno2,
					sno3,
					sno4,
					wg_cd
				FROM	t99
				WHERE	0=0
				-- 逆展開の場合最初の階層以外に在庫はなく、itm_ord_noがない行は需要情報など関連する品目オーダ・受払予定のない情報
				-- 画面の明細として適切に表示できないため省く
				AND t99.itm_ord_no IS NOT NULL
			;
		END LOOP ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_sim_ord_r_hrrchy_o (
	 IN i_itm_ord_no VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	MRP所要を元に作成したシミュレーション用品目オーダの逆展開結果を一時表（MSW_ITM_ORD_R_HRRCHY）に格納する。
<REMARKS>
	シミュレーション用オーダ逆展開用
<ARGUMENTS>
<IN>	i_itm_ord_no
		品目オーダＮＯ
<IN>	i_sim_mrp_no
		シミュレーションＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR FOR
		SELECT
			t.rqmt_no AS root_id,
			0 AS sort_no,
			0 AS level,
			NULL AS rqmt_no,
			t.rqmt_no AS chd_rqmt_no,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.ver_no,
			t.lot_no,
			t.sublot_no,
			t.loc_cd,
			t.io_schd_pr_no AS itm_ord_no,
			NULL AS io_schd_typ,
			NULL AS io_schd_pr_no,
			t.schd_alloc_qty,
			t.gi_schd_dt,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.wg_cd
		FROM
			mst_sim_alloc_pln t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t.io_schd_pr_no = i_itm_ord_no
		AND	t.sim_mrp_no = i_sim_mrp_no
		;

	l_rec	msw_itm_ord_r_hrrchy%ROWTYPE ;
	l_list	msw_itm_ord_r_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_r_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_sim_ord_r_hrrchy_impl(l_list, i_sim_mrp_no, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_ins_hrrchy$p_ins_sim_ord_r_hrrchy_s (
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_lot_no VARCHAR,
	 IN i_sublot_no VARCHAR,
	 IN i_loc_cd VARCHAR,
	 IN i_sim_mrp_no VARCHAR,
	 IN i_max_lvl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
MRP所要を元に作成したシミュレーション用品目オーダの階層化データをmsw_itm_ord_r_hrrchyに格納する。
<REMARKS>
	シミュレーション用オーダ逆展開用
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_lot_no
		ロットＮＯ
<IN>	i_sublot_no
		サブロットＮＯ
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_sim_mrp_no
		シミュレーションＮＯ
<IN>	i_max_lvl
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR FOR
		SELECT
			t.rqmt_no AS root_id,
			0 AS sort_no,
			0 AS level,
			NULL AS rqmt_no,
			t.rqmt_no AS chd_rqmt_no,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.ver_no,
			t.lot_no,
			t.sublot_no,
			t.loc_cd,
			NULL AS itm_ord_no,
			NULL AS io_schd_typ,
			NULL AS io_schd_pr_no,
			t.schd_alloc_qty,
			t.gi_schd_dt,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.wg_cd
		FROM
			mst_sim_alloc_pln t
			JOIN mavm_rd_wg t4 ON (t.wg_cd = t4.wg_cd)
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.lot_no = i_lot_no
		AND	t.sublot_no = i_sublot_no
		AND	t.loc_cd = i_loc_cd
		AND	t.sim_mrp_no = i_sim_mrp_no
		;

	l_rec msw_itm_ord_r_hrrchy%ROWTYPE ;
	l_list msw_itm_ord_r_hrrchy[] ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_itm_ord_r_hrrchy') ;

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0) + 1] := l_rec ;
	END LOOP ;

	CALL mspa_ins_hrrchy$p_ins_sim_ord_r_hrrchy_impl(l_list, i_sim_mrp_no, i_max_lvl) ;

END ;
$BODY$
LANGUAGE plpgsql
;
