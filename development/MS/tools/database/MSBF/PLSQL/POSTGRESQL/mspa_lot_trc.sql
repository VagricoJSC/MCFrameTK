CREATE OR REPLACE FUNCTION mspa_lot_trc$is_lotloop_f_itm(
	 IN i_rec msw_lot_trace_f_hrrchy,
	 IN i_mode NUMERIC
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		msw_lotloop_parsに存在するかどうかを判断する。
  （LOOPチェック）
<REMARKS>
<ARGUMENTS>
<IN>	i_rec
			検索対象レコード
		i_mode
			0:正展開、1:逆展開
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	IF i_mode = 0 THEN
		SELECT	COUNT(t1.itm_cd)
		INTO	STRICT l_cnt
		FROM	msw_lotloop_pars t1
		WHERE	t1.itm_cd = i_rec.itm_cd
		AND	t1.itm_sub1 = i_rec.itm_sub1
		AND	t1.itm_sub2 = i_rec.itm_sub2
		AND	t1.itm_sub3 = i_rec.itm_sub3
		AND	t1.lot_no = i_rec.lot_no
		AND	t1.sublot_no = i_rec.sublot_no
		AND	t1.sno1 = i_rec.sno1
		AND	t1.sno2 = i_rec.sno2
		AND	t1.sno3 = i_rec.sno3
		AND	t1.sno4 = i_rec.sno4
		;
	ELSE
		SELECT	COUNT(t1.itm_cd)
		INTO	STRICT l_cnt
		FROM	msw_lotloop_pars t1
		WHERE	t1.itm_cd = i_rec.par_itm_cd
		AND	t1.itm_sub1 = i_rec.par_itm_sub1
		AND	t1.itm_sub2 = i_rec.par_itm_sub2
		AND	t1.itm_sub3 = i_rec.par_itm_sub3
		AND	t1.lot_no = i_rec.par_lot_no
		AND	t1.sublot_no = i_rec.par_sublot_no
		AND	t1.sno1 = i_rec.par_sno1
		AND	t1.sno2 = i_rec.par_sno2
		AND	t1.sno3 = i_rec.par_sno3
		AND	t1.sno4 = i_rec.par_sno4
		;
	END IF;

	RETURN l_cnt;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_lot_trc$p_ins_lotloop_f_pars(
	 IN i_rec msw_lot_trace_f_hrrchy,
	 IN i_mode NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
		msw_lotloop_parsに追加する。
<REMARKS>
<ARGUMENTS>
<IN>	i_rec
			追加対象レコード
		i_mode
			0:正展開、1:逆展開
<HISTORY>
**********************************************************/
BEGIN
	IF i_mode = 0 THEN
		INSERT INTO msw_lotloop_pars (itm_cd, lot_no, sublot_no, itm_sub1, itm_sub2, itm_sub3, sno1, sno2, sno3, sno4)
		VALUES (i_rec.itm_cd, i_rec.lot_no, i_rec.sublot_no, i_rec.itm_sub1, i_rec.itm_sub2, i_rec.itm_sub3, i_rec.sno1, i_rec.sno2, i_rec.sno3, i_rec.sno4);
	ELSE
		INSERT INTO msw_lotloop_pars (itm_cd, lot_no, sublot_no, itm_sub1, itm_sub2, itm_sub3, sno1, sno2, sno3, sno4)
		VALUES (i_rec.par_itm_cd, i_rec.par_lot_no, i_rec.par_sublot_no, i_rec.par_itm_sub1, i_rec.par_itm_sub2, i_rec.par_itm_sub3, i_rec.par_sno1, i_rec.par_sno2, i_rec.par_sno3, i_rec.par_sno4);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_lot_trc$p_del_lotloop_f_pars(
	 IN i_rec msw_lot_trace_f_hrrchy
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
		msw_loop_parsを削除する。
<REMARKS>
<ARGUMENTS>
<IN>	i_rec
			削除対象レコード
<HISTORY>
**********************************************************/
BEGIN
	DELETE FROM msw_lotloop_pars
	WHERE	i_rec.itm_cd = itm_cd
	AND	i_rec.lot_no = lot_no
	AND	i_rec.sublot_no = sublot_no
	AND	i_rec.itm_sub1 = itm_sub1
	AND	i_rec.itm_sub2 = itm_sub2
	AND	i_rec.itm_sub3 = itm_sub3
	AND	i_rec.sno1 = sno1
	AND	i_rec.sno2 = sno2
	AND	i_rec.sno3 = sno3
	AND	i_rec.sno4 = sno4
	;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_lot_trc$is_lotdup_f_itm(
	 IN i_rec msw_lot_trace_f_hrrchy,
	 IN i_lot_not_mng NUMERIC,
	 IN i_lot_dupl_abl NUMERIC
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		ロット・サブロット管理区分による展開可否
<REMARKS>
<ARGUMENTS>
<IN>	i_rec
			対象レコード
<IN>	i_lot_not_mng
			ロット管理しない
<IN>	i_lot_dupl_abl
			同一ロット許可
<HISTORY>
**********************************************************/
BEGIN
	IF i_rec.lot_mng_typ = fcpa_const$get_const_val('MAC_LOT_MNG_TYP','UNIQ')
			OR i_rec.sublot_mng_typ = fcpa_const$get_const_val('MAC_SUBLOT_MNG_TYP','UNIQ') THEN
		RETURN 0;
	END IF;
	IF i_lot_not_mng = 1
		AND (i_rec.lot_mng_typ = fcpa_const$get_const_val('MAC_LOT_MNG_TYP','NOT_MNG')
			OR i_rec.sublot_mng_typ = fcpa_const$get_const_val('MAC_SUBLOT_MNG_TYP','NOT_MNG')) THEN
		RETURN 0;
	END IF;
	IF i_lot_dupl_abl = 1
		AND (i_rec.lot_mng_typ = fcpa_const$get_const_val('MAC_LOT_MNG_TYP','DUPL_ABL')
			OR i_rec.sublot_mng_typ = fcpa_const$get_const_val('MAC_SUBLOT_MNG_TYP','DUPL_ABL')) THEN
		RETURN 0;
	END IF;

	RETURN 1;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_lot_trc$p_ins_lot_trc_hrrchy_impl(
	 IN i_row msw_lot_trace_f_hrrchy,
	 IN i_lot_not_mng NUMERIC,
	 IN i_lot_dupl_abl NUMERIC,
	 INOUT io_rowidx NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ロットトレース正展開（ループ）
<REMARKS>
<ARGUMENTS>
<IN>	i_row
			展開元レコード
<IN>	i_lot_not_mng
			ロット管理しない
<IN>	i_lot_dupl_abl
			同一ロット許可
<INOUT>	io_rowidx
			行ＮＯ
<HISTORY>
**********************************************************/
DECLARE
	c_mfg_inst_unit_typ_itm		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_INST_UNIT_TYP','ITM');
	c_mfg_inst_unit_typ_oper	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_INST_UNIT_TYP','OPER');
	c_schd_act_typ_schd		CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_SCHD_ACT_TYP','SCHD');

	l_cur CURSOR (
		i_hrrchy NUMERIC,
		i_itm_cd VARCHAR,
		i_lot_no VARCHAR,
		i_sublot_no VARCHAR,
		i_itm_sub1 VARCHAR,
		i_itm_sub2 VARCHAR,
		i_itm_sub3 VARCHAR,
		i_sno1 VARCHAR,
		i_sno2 VARCHAR,
		i_sno3 VARCHAR,
		i_sno4 VARCHAR
	) FOR
	SELECT
		CASE
			WHEN i_hrrchy IS NOT NULL THEN i_hrrchy + 1
			ELSE 0
		END AS hrrchy,
		0 AS sort_no,
		'0' AS loop_flg,
		v.itm_cd,
		v.lot_no,
		v.sublot_no,
		v.itm_sub1,
		v.itm_sub2,
		v.itm_sub3,
		v.sno1,
		v.sno2,
		v.sno3,
		v.sno4,
		v.par_itm_cd,
		v.par_lot_no,
		v.par_sublot_no,
		v.par_itm_sub1,
		v.par_itm_sub2,
		v.par_itm_sub3,
		v.par_sno1,
		v.par_sno2,
		v.par_sno3,
		v.par_sno4,
		COALESCE(m2.itm_nm, m1.itm_nm) AS itm_nm,
		m1.lot_mng_typ,
		m1.sublot_mng_typ,
		NULL AS peg_no
	FROM	(
		SELECT DISTINCT
			t1.itm_cd,
			t1.lot_no,
			t1.sublot_no,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.sno1,
			t1.sno2,
			t1.sno3,
			t1.sno4,
			t2.itm_cd AS par_itm_cd,
			t2.lot_no AS par_lot_no,
			t2.sublot_no AS par_sublot_no,
			t2.itm_sub1 AS par_itm_sub1,
			t2.itm_sub2 AS par_itm_sub2,
			t2.itm_sub3 AS par_itm_sub3,
			t2.sno1 AS par_sno1,
			t2.sno2 AS par_sno2,
			t2.sno3 AS par_sno3,
			t2.sno4 AS par_sno4
		FROM
			mst_lot_trace_gi t1, 
			mst_lot_trace_gr t2
		WHERE	0=0
		AND (
			(
				(c_mfg_inst_unit_typ_itm = t2.mfg_inst_unit_typ
					AND (t2.mfg_act_no = t1.mfg_act_no
						OR (t2.itm_mfg_inst_no = t1.itm_mfg_inst_no AND c_schd_act_typ_schd = t2.schd_act_typ)
					)
				)
				OR (c_mfg_inst_unit_typ_oper = t2.mfg_inst_unit_typ
					AND t2.itm_mfg_inst_no = t1.itm_mfg_inst_no
				)
			)
			OR t2.stk_xfr_act_no = t1.stk_xfr_act_no
		)
		AND	t2.itm_cd = i_itm_cd
		AND	t2.itm_sub1 = i_itm_sub1
		AND	t2.itm_sub2 = i_itm_sub2
		AND	t2.itm_sub3 = i_itm_sub3
		AND	t2.lot_no = i_lot_no
		AND	t2.sublot_no = i_sublot_no
		AND	t2.sno1 = i_sno1
		AND	t2.sno2 = i_sno2
		AND	t2.sno3 = i_sno3
		AND	t2.sno4 = i_sno4
		AND	t1.base_unit_qty != 0
		) v
		LEFT OUTER JOIN mam_itm m1
			ON (v.itm_cd = m1.itm_cd AND v.itm_sub1 = m1.itm_sub1 AND v.itm_sub2 = m1.itm_sub2 AND v.itm_sub3 = m1.itm_sub3)
		LEFT OUTER JOIN mam_sundry_itm m2
			ON (v.itm_cd = m2.itm_cd AND v.itm_sub1 = m2.itm_sub1 AND v.itm_sub2 = m2.itm_sub2 AND v.itm_sub3 = m2.itm_sub3
				AND v.sno1 = m2.sno1 AND v.sno2 = m2.sno2 AND v.sno3 = m2.sno3 AND v.sno4 = m2.sno4)
	WHERE	0=0
	ORDER BY
		v.itm_cd,
		v.itm_sub1,
		v.itm_sub2,
		v.itm_sub3,
		v.lot_no,
		v.sublot_no,
		v.sno1,
		v.sno2,
		v.sno3,
		v.sno4,
		v.par_itm_cd,
		v.par_itm_sub1,
		v.par_itm_sub2,
		v.par_itm_sub3,
		v.par_lot_no,
		v.par_sublot_no,
		v.par_sno1,
		v.par_sno2,
		v.par_sno3,
		v.par_sno4
	;

	l_rec msw_lot_trace_f_hrrchy%ROWTYPE;
	l_list msw_lot_trace_f_hrrchy[];
BEGIN
	FOR l_rec IN l_cur (
		i_row.hrrchy,
		i_row.itm_cd,
		i_row.lot_no,
		i_row.sublot_no,
		i_row.itm_sub1,
		i_row.itm_sub2,
		i_row.itm_sub3,
		i_row.sno1,
		i_row.sno2,
		i_row.sno3,
		i_row.sno4
	)
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0)+1] := l_rec;
	END LOOP;

	IF COALESCE(array_length(l_list, 1), 0) > 0 THEN
		FOREACH l_rec IN ARRAY l_list LOOP
			io_rowidx := io_rowidx + 1;
			l_rec.sort_no := io_rowidx;
			l_rec.loop_flg := '0';
			IF mspa_lot_trc$is_lotloop_f_itm(l_rec, 0) = 1 THEN
				l_rec.loop_flg := '1';
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
			ELSIF mspa_lot_trc$is_lotdup_f_itm(l_rec, i_lot_not_mng, i_lot_dupl_abl) > 0 THEN
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
			ELSE
				CALL mspa_lot_trc$p_ins_lotloop_f_pars(l_rec, 0);
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
				CALL mspa_lot_trc$p_ins_lot_trc_hrrchy_impl(l_rec, i_lot_not_mng, i_lot_dupl_abl, io_rowidx);
			END IF;
		END LOOP ;
	END IF;
EXCEPTION
	WHEN others THEN
		RAISE;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_lot_trc$p_ins_lot_trc_hrrchy(
	 IN i_hrrchy NUMERIC,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_lot_no VARCHAR,
	 IN i_sublot_no VARCHAR,
	 IN i_sno1 VARCHAR,
	 IN i_sno2 VARCHAR,
	 IN i_sno3 VARCHAR,
	 IN i_sno4 VARCHAR,
	 IN i_lot_not_mng NUMERIC,
	 IN i_lot_dupl_abl NUMERIC,
	 IN i_mode NUMERIC DEFAULT 0
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ロットトレース正展開
<REMARKS>
<ARGUMENTS>
<IN>	i_hrrchy
			階層
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
<IN>	i_sno1
			手配ＮＯ１
<IN>	i_sno2
			手配ＮＯ２
<IN>	i_sno3
			手配ＮＯ３
<IN>	i_sno4
			手配ＮＯ４
<IN>	i_lot_not_mng
			ロット管理しない
<IN>	i_lot_dupl_abl
			同一ロット許可
<IN>	i_mode
			呼び出し元（0は画面から）
<HISTORY>
**********************************************************/
DECLARE
	l_rowidx NUMERIC := - 1;
	l_cur CURSOR (
		i_hrrchy NUMERIC,
		i_itm_cd VARCHAR,
		i_lot_no VARCHAR,
		i_sublot_no VARCHAR,
		i_itm_sub1 VARCHAR,
		i_itm_sub2 VARCHAR,
		i_itm_sub3 VARCHAR,
		i_sno1 VARCHAR,
		i_sno2 VARCHAR,
		i_sno3 VARCHAR,
		i_sno4 VARCHAR
	) FOR
	SELECT DISTINCT
		CASE
			WHEN i_hrrchy IS NOT NULL THEN i_hrrchy + 1
			ELSE 0
		END AS hrrchy,
		0 AS sort_no,
		'0' AS loop_flg,
		v.itm_cd,
		v.lot_no,
		v.sublot_no,
		v.itm_sub1,
		v.itm_sub2,
		v.itm_sub3,
		v.sno1,
		v.sno2,
		v.sno3,
		v.sno4,
		NULL AS par_itm_cd,
		NULL AS par_lot_no,
		NULL AS par_sublot_no,
		NULL AS par_itm_sub1,
		NULL AS par_itm_sub2,
		NULL AS par_itm_sub3,
		NULL AS par_sno1,
		NULL AS par_sno2,
		NULL AS par_sno3,
		NULL AS par_sno4,
		COALESCE(m2.itm_nm,
		m1.itm_nm) AS itm_nm,
		m1.lot_mng_typ,
		m1.sublot_mng_typ,
		NULL AS peg_no
	FROM	(
		SELECT
			t1.itm_cd,
			t1.lot_no,
			t1.sublot_no,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.sno1,
			t1.sno2,
			t1.sno3,
			t1.sno4
		FROM	mst_lot_trace_gr t1
		WHERE	0=0
		AND t1.itm_cd = i_itm_cd
		AND	(t1.itm_sub1 LIKE i_itm_sub1 OR i_itm_sub1 IS NULL)
		AND	(t1.itm_sub2 LIKE i_itm_sub2 OR i_itm_sub2 IS NULL)
		AND	(t1.itm_sub3 LIKE i_itm_sub3 OR i_itm_sub3 IS NULL)
		AND	(t1.lot_no LIKE i_lot_no OR i_lot_no IS NULL)
		AND	(t1.sublot_no LIKE i_sublot_no OR i_sublot_no IS NULL)
		AND	(t1.sno1 LIKE i_sno1 OR i_sno1 IS NULL)
		AND	(t1.sno2 LIKE i_sno2 OR i_sno2 IS NULL)
		AND	(t1.sno3 LIKE i_sno3 OR i_sno3 IS NULL)
		AND	(t1.sno4 LIKE i_sno4 OR i_sno4 IS NULL)) v
		LEFT OUTER JOIN mam_itm m1
			ON (v.itm_cd = m1.itm_cd AND v.itm_sub1 = m1.itm_sub1 AND v.itm_sub2 = m1.itm_sub2 AND v.itm_sub3 = m1.itm_sub3)
		LEFT OUTER JOIN mam_sundry_itm m2
			ON (v.itm_cd = m2.itm_cd AND v.itm_sub1 = m2.itm_sub1 AND v.itm_sub2 = m2.itm_sub2 AND v.itm_sub3 = m2.itm_sub3
				AND v.sno1 = m2.sno1 AND v.sno2 = m2.sno2 AND v.sno3 = m2.sno3 AND v.sno4 = m2.sno4)
		WHERE	0=0
		ORDER BY
			v.itm_cd,
			v.itm_sub1,
			v.itm_sub2,
			v.itm_sub3,
			v.lot_no,
			v.sublot_no,
			v.sno1,
			v.sno2,
			v.sno3,
			v.sno4
	;

	l_rec	msw_lot_trace_f_hrrchy%ROWTYPE;
	l_list	msw_lot_trace_f_hrrchy[];
BEGIN
	IF i_mode = 0 THEN
		CALL fcpa_postgres_util$p_truncate_work('msw_lot_trace_f_hrrchy');
	END IF;
	CALL fcpa_postgres_util$p_truncate_work('msw_lotloop_pars');

	FOR l_rec IN l_cur (
		i_hrrchy,
		i_itm_cd,
		i_lot_no,
		i_sublot_no,
		i_itm_sub1,
		i_itm_sub2,
		i_itm_sub3,
		i_sno1,
		i_sno2,
		i_sno3,
		i_sno4
	)
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0)+1] := l_rec;
	END LOOP;

	IF COALESCE(array_length(l_list, 1), 0) > 0 THEN
		FOREACH l_rec IN ARRAY l_list LOOP
			l_rowidx := l_rowidx + 1;
			l_rec.sort_no := l_rowidx;
			l_rec.loop_flg := '0';

			IF mspa_lot_trc$is_lotloop_f_itm(l_rec, 0) = 1 THEN
				l_rec.loop_flg := '1';
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
			ELSIF mspa_lot_trc$is_lotdup_f_itm(l_rec, i_lot_not_mng, i_lot_dupl_abl) > 0 THEN
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
			ELSE
				CALL mspa_lot_trc$p_ins_lotloop_f_pars(l_rec, 0);
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
				CALL mspa_lot_trc$p_ins_lot_trc_hrrchy_impl(l_rec, i_lot_not_mng, i_lot_dupl_abl, l_rowidx);
			END IF;
		END LOOP ;
	END IF;
EXCEPTION
	WHEN others THEN
		RAISE;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_lot_trc$p_ins_lot_trc_hrrchy_impl_bkwd(
	 IN i_row msw_lot_trace_f_hrrchy,
	 IN i_lot_not_mng NUMERIC,
	 IN i_lot_dupl_abl NUMERIC,
	 INOUT io_rowidx NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ロットトレース逆展開（ループ）
<REMARKS>
<ARGUMENTS>
<IN>	i_row
			展開元レコード
<IN>	i_lot_not_mng
			ロット管理しない
<IN>	i_lot_dupl_abl
			同一ロット許可
<INOUT>	io_rowidx
			行ＮＯ
<HISTORY>
**********************************************************/
DECLARE
	c_mfg_inst_unit_typ_itm		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_INST_UNIT_TYP','ITM');
	c_mfg_inst_unit_typ_oper	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_INST_UNIT_TYP','OPER');
	c_schd_act_typ_schd		CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_SCHD_ACT_TYP','SCHD');

	l_cur CURSOR (
		i_hrrchy NUMERIC,
		i_itm_cd VARCHAR,
		i_lot_no VARCHAR,
		i_sublot_no VARCHAR,
		i_itm_sub1 VARCHAR,
		i_itm_sub2 VARCHAR,
		i_itm_sub3 VARCHAR,
		i_sno1 VARCHAR,
		i_sno2 VARCHAR,
		i_sno3 VARCHAR,
		i_sno4 VARCHAR
	) FOR
	SELECT
		CASE
			WHEN i_hrrchy IS NOT NULL THEN i_hrrchy + 1
			ELSE 0
		END AS hrrchy,
		0 AS sort_no,
		'0' AS loop_flg,
		v.itm_cd,
		v.lot_no,
		v.sublot_no,
		v.itm_sub1,
		v.itm_sub2,
		v.itm_sub3,
		v.sno1,
		v.sno2,
		v.sno3,
		v.sno4,
		v.par_itm_cd,
		v.par_lot_no,
		v.par_sublot_no,
		v.par_itm_sub1,
		v.par_itm_sub2,
		v.par_itm_sub3,
		v.par_sno1,
		v.par_sno2,
		v.par_sno3,
		v.par_sno4,
		COALESCE(m2.itm_nm,
		m1.itm_nm) AS itm_nm,
		m1.lot_mng_typ,
		m1.sublot_mng_typ,
		NULL AS peg_no
	FROM
		(
		SELECT DISTINCT
			t1.itm_cd,
			t1.lot_no,
			t1.sublot_no,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.sno1,
			t1.sno2,
			t1.sno3,
			t1.sno4,
			t2.itm_cd AS par_itm_cd,
			t2.lot_no AS par_lot_no,
			t2.sublot_no AS par_sublot_no,
			t2.itm_sub1 AS par_itm_sub1,
			t2.itm_sub2 AS par_itm_sub2,
			t2.itm_sub3 AS par_itm_sub3,
			t2.sno1 AS par_sno1,
			t2.sno2 AS par_sno2,
			t2.sno3 AS par_sno3,
			t2.sno4 AS par_sno4
		FROM
			mst_lot_trace_gi t1,
			mst_lot_trace_gr t2
		WHERE	0=0
		AND (
			(
				(c_mfg_inst_unit_typ_itm = t2.mfg_inst_unit_typ
					AND (t2.mfg_act_no = t1.mfg_act_no
						OR (t2.itm_mfg_inst_no = t1.itm_mfg_inst_no AND c_schd_act_typ_schd = t2.schd_act_typ)
					)
				)
				OR (c_mfg_inst_unit_typ_oper = t2.mfg_inst_unit_typ
					AND t2.itm_mfg_inst_no = t1.itm_mfg_inst_no
				)
			)
			OR t2.stk_xfr_act_no = t1.stk_xfr_act_no
		)
		AND	t1.itm_cd = i_itm_cd
		AND	t1.itm_sub1 = i_itm_sub1
		AND	t1.itm_sub2 = i_itm_sub2
		AND	t1.itm_sub3 = i_itm_sub3
		AND	t1.lot_no = i_lot_no
		AND	t1.sublot_no = i_sublot_no
		AND	t1.sno1 = i_sno1
		AND	t1.sno2 = i_sno2
		AND	t1.sno3 = i_sno3
		AND	t1.sno4 = i_sno4
		AND	t1.base_unit_qty != 0
		) v
		LEFT OUTER JOIN mam_itm m1
			ON (v.par_itm_cd = m1.itm_cd AND v.par_itm_sub1 = m1.itm_sub1 AND v.par_itm_sub2 = m1.itm_sub2 AND v.par_itm_sub3 = m1.itm_sub3)
		LEFT OUTER JOIN mam_sundry_itm m2
			ON (v.par_itm_cd = m2.itm_cd AND v.par_itm_sub1 = m2.itm_sub1 AND v.par_itm_sub2 = m2.itm_sub2 AND v.par_itm_sub3 = m2.itm_sub3
				AND v.par_sno1 = m2.sno1 AND v.par_sno2 = m2.sno2 AND v.par_sno3 = m2.sno3 AND v.par_sno4 = m2.sno4)
	WHERE	0=0
	ORDER BY
		v.itm_cd,
		v.itm_sub1,
		v.itm_sub2,
		v.itm_sub3,
		v.lot_no,
		v.sublot_no,
		v.sno1,
		v.sno2,
		v.sno3,
		v.sno4,
		v.par_itm_cd,
		v.par_itm_sub1,
		v.par_itm_sub2,
		v.par_itm_sub3,
		v.par_lot_no,
		v.par_sublot_no,
		v.par_sno1,
		v.par_sno2,
		v.par_sno3,
		v.par_sno4
	;

	l_rec msw_lot_trace_f_hrrchy%ROWTYPE;
	l_list msw_lot_trace_f_hrrchy[];
BEGIN
	FOR l_rec IN l_cur (
		i_row.hrrchy,
		i_row.par_itm_cd,
		i_row.par_lot_no,
		i_row.par_sublot_no,
		i_row.par_itm_sub1,
		i_row.par_itm_sub2,
		i_row.par_itm_sub3,
		i_row.par_sno1,
		i_row.par_sno2,
		i_row.par_sno3,
		i_row.par_sno4
	)
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0)+1] := l_rec;
	END LOOP;

	IF COALESCE(array_length(l_list, 1), 0) > 0 THEN
		FOREACH l_rec IN ARRAY l_list LOOP
			io_rowidx := io_rowidx + 1;
			l_rec.sort_no := io_rowidx;
			l_rec.loop_flg := '0';

			IF mspa_lot_trc$is_lotloop_f_itm(l_rec, 1) = 1 THEN
				l_rec.loop_flg := '1';
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
			ELSIF mspa_lot_trc$is_lotdup_f_itm(l_rec, i_lot_not_mng, i_lot_dupl_abl) > 0 THEN
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
			ELSE
				CALL mspa_lot_trc$p_ins_lotloop_f_pars(l_rec, 1);
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
				CALL mspa_lot_trc$p_ins_lot_trc_hrrchy_impl_bkwd(l_rec, i_lot_not_mng, i_lot_dupl_abl, io_rowidx);
			END IF;
		END LOOP ;
	END IF;
EXCEPTION
	WHEN others THEN
		RAISE;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mspa_lot_trc$p_ins_lot_trc_hrrchy_bkwd(
	 IN i_hrrchy NUMERIC,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_lot_no VARCHAR,
	 IN i_sublot_no VARCHAR,
	 IN i_sno1 VARCHAR,
	 IN i_sno2 VARCHAR,
	 IN i_sno3 VARCHAR,
	 IN i_sno4 VARCHAR,
	 IN i_bp_lot_no VARCHAR,
	 IN i_ver_no VARCHAR,
	 IN i_lot_not_mng NUMERIC,
	 IN i_lot_dupl_abl NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	ロットトレース逆展開
<REMARKS>
<ARGUMENTS>
<IN>	i_hrrchy
			階層
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
<IN>	i_sno1
			手配ＮＯ１
<IN>	i_sno2
			手配ＮＯ２
<IN>	i_sno3
			手配ＮＯ３
<IN>	i_sno4
			手配ＮＯ４
<IN>	i_bp_lot_no
			業者ロットＮＯ
<IN>	i_ver_no
			版ＮＯ
<IN>	i_lot_not_mng
			ロット管理しない
<IN>	i_lot_dupl_abl
			同一ロット許可
<HISTORY>
**********************************************************/
DECLARE
	l_rowidx NUMERIC := - 1;
	l_cur CURSOR (
		i_hrrchy NUMERIC,
		i_itm_cd VARCHAR,
		i_lot_no VARCHAR,
		i_sublot_no VARCHAR,
		i_itm_sub1 VARCHAR,
		i_itm_sub2 VARCHAR,
		i_itm_sub3 VARCHAR,
		i_sno1 VARCHAR,
		i_sno2 VARCHAR,
		i_sno3 VARCHAR,
		i_sno4 VARCHAR
	) FOR
	SELECT DISTINCT
		CASE
			WHEN i_hrrchy IS NOT NULL THEN i_hrrchy + 1
			ELSE 0
		END AS hrrchy,
		0 AS sort_no,
		'0' AS loop_flg,
		NULL AS itm_cd,
		NULL AS lot_no,
		NULL AS sublot_no,
		NULL AS itm_sub1,
		NULL AS itm_sub2,
		NULL AS itm_sub3,
		NULL AS sno1,
		NULL AS sno2,
		NULL AS sno3,
		NULL AS sno4,
		v.par_itm_cd,
		v.par_lot_no,
		v.par_sublot_no,
		v.par_itm_sub1,
		v.par_itm_sub2,
		v.par_itm_sub3,
		v.par_sno1,
		v.par_sno2,
		v.par_sno3,
		v.par_sno4,
		COALESCE(m2.itm_nm,
		m1.itm_nm) AS itm_nm,
		m1.lot_mng_typ,
		m1.sublot_mng_typ,
		NULL AS peg_no
	FROM
		(
			SELECT
				t1.itm_cd AS par_itm_cd,
				t1.lot_no AS par_lot_no,
				t1.sublot_no AS par_sublot_no,
				t1.itm_sub1 AS par_itm_sub1,
				t1.itm_sub2 AS par_itm_sub2,
				t1.itm_sub3 AS par_itm_sub3,
				t1.sno1 AS par_sno1,
				t1.sno2 AS par_sno2,
				t1.sno3 AS par_sno3,
				t1.sno4 AS par_sno4
			FROM	mst_lot_trace_gr t1
			WHERE	0=0
			AND t1.itm_cd = i_itm_cd
			AND	 (t1.itm_sub1 LIKE i_itm_sub1 OR i_itm_sub1 IS NULL)
			AND	 (t1.itm_sub2 LIKE i_itm_sub2 OR i_itm_sub2 IS NULL)
			AND	 (t1.itm_sub3 LIKE i_itm_sub3 OR i_itm_sub3 IS NULL)
			AND	 (t1.lot_no LIKE i_lot_no OR i_lot_no IS NULL)
			AND	 (t1.sublot_no LIKE i_sublot_no OR i_sublot_no IS NULL)
			AND	 (t1.sno1 LIKE i_sno1 OR i_sno1 IS NULL)
			AND	 (t1.sno2 LIKE i_sno2 OR i_sno2 IS NULL)
			AND	 (t1.sno3 LIKE i_sno3 OR i_sno3 IS NULL)
			AND	 (t1.sno4 LIKE i_sno4 OR i_sno4 IS NULL)
			UNION
			SELECT
				t2.itm_cd AS par_itm_cd,
				t2.lot_no AS par_lot_no,
				t2.sublot_no AS par_sublot_no,
				t2.itm_sub1 AS par_itm_sub1,
				t2.itm_sub2 AS par_itm_sub2,
				t2.itm_sub3 AS par_itm_sub3,
				t2.sno1 AS par_sno1,
				t2.sno2 AS par_sno2,
				t2.sno3 AS par_sno3,
				t2.sno4 AS par_sno4
			FROM	mst_lot_trace_gi t2
			WHERE	0=0
			AND	 t2.itm_cd = i_itm_cd
			AND	 (t2.itm_sub1 LIKE i_itm_sub1 OR i_itm_sub1 IS NULL)
			AND	 (t2.itm_sub2 LIKE i_itm_sub2 OR i_itm_sub2 IS NULL)
			AND	 (t2.itm_sub3 LIKE i_itm_sub3 OR i_itm_sub3 IS NULL)
			AND	 (t2.lot_no LIKE i_lot_no OR i_lot_no IS NULL)
			AND	 (t2.sublot_no LIKE i_sublot_no OR i_sublot_no IS NULL)
			AND	 (t2.sno1 LIKE i_sno1 OR i_sno1 IS NULL)
			AND	 (t2.sno2 LIKE i_sno2 OR i_sno2 IS NULL)
			AND	 (t2.sno3 LIKE i_sno3 OR i_sno3 IS NULL)
			AND	 (t2.sno4 LIKE i_sno4 OR i_sno4 IS NULL)) v
		LEFT OUTER JOIN mam_itm m1
			ON (v.par_itm_cd = m1.itm_cd AND v.par_itm_sub1 = m1.itm_sub1 AND v.par_itm_sub2 = m1.itm_sub2 AND v.par_itm_sub3 = m1.itm_sub3)
		LEFT OUTER JOIN mam_sundry_itm m2
			ON (v.par_itm_cd = m2.itm_cd AND v.par_itm_sub1 = m2.itm_sub1 AND v.par_itm_sub2 = m2.itm_sub2 AND v.par_itm_sub3 = m2.itm_sub3
				AND v.par_sno1 = m2.sno1 AND v.par_sno2 = m2.sno2 AND v.par_sno3 = m2.sno3 AND v.par_sno4 = m2.sno4)
		LEFT OUTER JOIN msvt_lot_list t3
			ON (v.par_itm_cd = t3.itm_cd AND v.par_itm_sub1 = t3.itm_sub1 AND v.par_itm_sub2 = t3.itm_sub2 AND v.par_itm_sub3 = t3.itm_sub3
				AND v.par_lot_no = t3.lot_no AND v.par_sublot_no = t3.sublot_no)
	WHERE	0=0
	AND	 (t3.ver_no LIKE i_ver_no OR i_ver_no IS NULL)
	AND	 (t3.bp_lot_no LIKE i_bp_lot_no OR i_bp_lot_no IS NULL)
	ORDER BY
		v.par_itm_cd,
		v.par_itm_sub1,
		v.par_itm_sub2,
		v.par_itm_sub3,
		v.par_lot_no,
		v.par_sublot_no,
		v.par_sno1,
		v.par_sno2,
		v.par_sno3,
		v.par_sno4
	;

	l_rec	msw_lot_trace_f_hrrchy%ROWTYPE;
	l_list	msw_lot_trace_f_hrrchy[];
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_lot_trace_f_hrrchy');
	CALL fcpa_postgres_util$p_truncate_work('msw_lotloop_pars');

	FOR l_rec IN l_cur (
		i_hrrchy,
		i_itm_cd,
		i_lot_no,
		i_sublot_no,
		i_itm_sub1,
		i_itm_sub2,
		i_itm_sub3,
		i_sno1,
		i_sno2,
		i_sno3,
		i_sno4
	)
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0)+1] := l_rec;
	END LOOP;

	IF COALESCE(array_length(l_list, 1), 0) > 0 THEN
		FOREACH l_rec IN ARRAY l_list LOOP
			l_rowidx := l_rowidx + 1;
			l_rec.sort_no := l_rowidx;
			l_rec.loop_flg := '0';

			IF mspa_lot_trc$is_lotloop_f_itm(l_rec, 1) = 1 THEN
				l_rec.loop_flg := '1';
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
			ELSIF mspa_lot_trc$is_lotdup_f_itm(l_rec, i_lot_not_mng, i_lot_dupl_abl) > 0 THEN
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
			ELSE
				CALL mspa_lot_trc$p_ins_lotloop_f_pars(l_rec, 1);
				INSERT INTO msw_lot_trace_f_hrrchy VALUES (l_rec.*);
				CALL mspa_lot_trc$p_ins_lot_trc_hrrchy_impl_bkwd(l_rec, i_lot_not_mng, i_lot_dupl_abl, l_rowidx);
			END IF;
		END LOOP ;
	END IF;
EXCEPTION
	WHEN others THEN
		RAISE;
END;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mspa_lot_trc$p_ins_lot_trc_hrrchy_multi_input()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	複数在庫のロットトレース正展開
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	l_cur CURSOR  FOR
	SELECT 
		w.peg_no,
		w.itm_cd,
		w.lot_no,
		w.sublot_no,
		w.itm_sub1,
		w.itm_sub2,
		w.itm_sub3,
		w.sno1,
		w.sno2,
		w.sno3,
		w.sno4,
		w.lot_not_mng,
		w.lot_dupl_abl
	FROM
		msw_lot_trace_multi_input w
	ORDER BY
		w.peg_no
	;

	l_rec	msw_lot_trace_multi_input%ROWTYPE;
	l_list	msw_lot_trace_multi_input[];
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('msw_lot_trace_f_hrrchy');

	FOR l_rec IN l_cur
	LOOP
		l_list[COALESCE(array_length(l_list, 1), 0)+1] := l_rec;
	END LOOP;

	IF COALESCE(array_length(l_list, 1), 0) > 0 THEN
		FOREACH l_rec IN ARRAY l_list LOOP
			CALL mspa_lot_trc$p_ins_lot_trc_hrrchy(
				null, l_rec.itm_cd, l_rec.itm_sub1, l_rec.itm_sub2, l_rec.itm_sub3, l_rec.lot_no, l_rec.sublot_no,
				l_rec.sno1, l_rec.sno2, l_rec.sno3, l_rec.sno4, l_rec.lot_not_mng, l_rec.lot_dupl_abl, 1);
			UPDATE msw_lot_trace_f_hrrchy SET peg_no = l_rec.peg_no WHERE peg_no IS NULL;
		END LOOP;
	END IF;
EXCEPTION
	WHEN others THEN
		RAISE;
END;
$BODY$
LANGUAGE plpgsql
;
