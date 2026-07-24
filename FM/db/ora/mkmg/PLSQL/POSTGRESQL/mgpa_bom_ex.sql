CREATE OR REPLACE PROCEDURE mgpa_bom_ex$p_ins_bom_ex()
AS
$BODY$
/**********************************************************
<SYNOPSIS>
	MGW_BOM_EXにレコードを作成する
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
DECLARE
	i INTEGER;
BEGIN
	SELECT COUNT(*) INTO STRICT i FROM mgpa_bom_ex$g_bom;

	IF i = 0 THEN
		RETURN;
	END IF;

	INSERT INTO mgw_bom_ex
	SELECT
		bom_lvl,
		sort_no,
		wg_cd,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		bom_ptn,
		oper_cd,
		oper_seq,
		alt_grp_cd,
		expns_cd,
		par_rqmt_qty,
		chd_rqmt_qty,
		chd_base_qty,
		fxd_chd_rqmt_qty,
		chd_min_qty,
		chd_batch_qty,
		alt_itm_ratio,
		disp_seq,
		par_wg_cd,
		par_itm_cd,
		par_itm_sub1,
		par_itm_sub2,
		par_itm_sub3,
		par_sort_no,
		bom_wg_cd,
		calc_ctg_cd,
		itm_calc_ctg_cd,
		dtl_calc_ctg_cd,
		purc_calc_ctg_cd,
		proc_calc_ctg_cd,
		prov_calc_ctg_cd,
		sls_calc_ctg_cd,
		fix_calc_ctg_cd,
		bottom_flg,
		loop_flg
	FROM mgpa_bom_ex$g_bom
	;

	TRUNCATE TABLE mgpa_bom_ex$g_bom;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_bom_ex$p_upd_loop(
	IN i_lvl NUMERIC
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	MGW_BOM_EXのLOOP_FLGを更新する
<REMARKS>
<ARGUMENTS>
<IN>	i_lvl
		チェック対象のレベル
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_max_itm CONSTANT INTEGER := 6 ;

	l_cnt INTEGER;

	x RECORD;
BEGIN
	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mgw_bom_ex t
	WHERE 0=0
	AND t.bom_lvl = i_lvl
	AND EXISTS (
			SELECT 'X'
			FROM mgw_bom_ex w
			WHERE 0=0
			AND w.bom_lvl < t.bom_lvl
			AND w.itm_cd = t.itm_cd
			AND w.itm_sub1 = t.itm_sub1
			AND w.itm_sub2 = t.itm_sub2
			AND w.itm_sub3 = t.itm_sub3
			AND (w.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
			AND SUBSTR(w.sort_no, 1, (w.bom_lvl::INTEGER + 1) * c_max_itm) = SUBSTR(t.sort_no, 1, (w.bom_lvl::INTEGER + 1) * c_max_itm)
		)
	;

	IF l_cnt = 0 THEN
		RETURN;
	END IF;

	FOR x IN
		SELECT t.ctid
		FROM mgw_bom_ex$temp t
		WHERE 0=0
		AND t.bom_lvl = i_lvl
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex$temp w
				WHERE 0=0
				AND w.bom_lvl < t.bom_lvl
				AND w.itm_cd = t.itm_cd
				AND w.itm_sub1 = t.itm_sub1
				AND w.itm_sub2 = t.itm_sub2
				AND w.itm_sub3 = t.itm_sub3
				AND (w.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
				AND SUBSTR(w.sort_no, 1, (w.bom_lvl::INTEGER + 1) * c_max_itm) = SUBSTR(t.sort_no, 1, (w.bom_lvl::INTEGER + 1) * c_max_itm)
			)
	LOOP
		UPDATE mgw_bom_ex$temp t
		SET loop_flg = '1'
		WHERE 0=0
		AND t.ctid = x.ctid
		;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_bom_ex$p_set_tgt_data(
	IN i_calc_grp_cd VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_bom_ptn VARCHAR,
	IN i_rev_flg CHARACTER
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	MGW_BOM_EX_TMPに設定されているデータに対して必要な
	マスタデータをワークテーブルに作成する
<REMARKS>
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_term
		期
<IN>	i_bom_ptn
		構成パタン
<IN>	i_rev_flg
		逆展開ＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_calc_itm CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','CALC_ITM');
	c_itm_dtl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ITM_DTL');
	c_itm_purc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ITM_PURC');
	c_itm_proc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ITM_PROC');
	c_itm_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ITM_PROV');
	c_itm_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ITM_SLS');
	c_itm_fix CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ITM_FIX');
	c_bom CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','BOM');

	l_cnt INTEGER;
	l_cnt2 INTEGER;

	cur_ctg_list CURSOR (l_calc_ctg_typ VARCHAR) FOR
		SELECT w.calc_ctg_cd
		FROM mgw_calc_grp_ctg w
		WHERE 0=0
		AND w.calc_ctg_typ = l_calc_ctg_typ
		ORDER BY w.ctg_prio, w.calc_ctg_cd
		;

	l1 RECORD;
	l2 RECORD;
	l3 RECORD;
	l4 RECORD;
	l5 RECORD;
	l6 RECORD;
	l7 RECORD;
	l8 RECORD;
BEGIN
	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_itm');
	FOR l1 IN cur_ctg_list(c_calc_itm) LOOP
		INSERT INTO mgw_bom_ex_itm (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT	m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm m
		WHERE 0=0
		AND m.term = i_term
		AND m.calc_ctg_cd = l1.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND EXISTS (
				SELECT 'X'
				FROM mam_grp_wg x
				WHERE 0=0
				AND x.calc_grp_cd = i_calc_grp_cd
				AND x.wg_cd = m.wg_cd
			)
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_tmp x
				WHERE 0=0
				AND x.itm_cd = m.itm_cd
				AND x.itm_sub1 = m.itm_sub1
				AND x.itm_sub2 = m.itm_sub2
				AND x.itm_sub3 = m.itm_sub3
				AND (i_rev_flg = '1' OR x.wg_cd = c_null_val OR x.wg_cd = m.wg_cd)
			)
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_itm w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = m.wg_cd
			)
		;
	END LOOP;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_dtl');
	FOR l2 IN cur_ctg_list(c_itm_dtl) LOOP
		INSERT INTO mgw_bom_ex_dtl (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			bom_ptn,
			wg_cd,
			rqst_wg_cd,
			calc_ctg_cd
		)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.bom_ptn,
			m.wg_cd,
			CASE m.rqst_wg_cd WHEN c_null_val THEN m.wg_cd ELSE m.rqst_wg_cd END,
			m.calc_ctg_cd
		FROM mgt_itm_dtl m
		WHERE 0=0
		AND m.term = i_term
		AND m.calc_ctg_cd = l2.calc_ctg_cd
		AND (i_wg_cd <> c_null_val OR m.rqst_wg_cd = c_null_val)
		AND (
			i_bom_ptn IS NOT NULL AND m.bom_ptn = i_bom_ptn
			OR
			i_bom_ptn IS NULL
			OR
			m.bom_ptn IS NULL
			OR
			m.bom_ptn = c_null_val
			)
		AND m.non_calc_flg = '0'
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_itm t
				WHERE 0=0
				AND t.itm_cd = m.itm_cd
				AND t.itm_sub1 = m.itm_sub1
				AND t.itm_sub2 = m.itm_sub2
				AND t.itm_sub3 = m.itm_sub3
				AND t.wg_cd = m.wg_cd
			)
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_dtl w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = m.wg_cd
				AND w.rqst_wg_cd = CASE m.rqst_wg_cd WHEN c_null_val THEN m.wg_cd ELSE m.rqst_wg_cd END
			)
		;

		INSERT INTO mgw_bom_ex_dtl (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			bom_ptn,
			wg_cd,
			rqst_wg_cd,
			calc_ctg_cd
		)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.bom_ptn,
			t.wg_cd,
			CASE m.rqst_wg_cd WHEN c_null_val THEN t.wg_cd ELSE m.rqst_wg_cd END,
			m.calc_ctg_cd
		FROM mgt_itm_dtl m
			INNER JOIN mgw_bom_ex_tmp t ON (
				m.itm_cd = t.itm_cd
				AND m.itm_sub1 = t.itm_sub1
				AND m.itm_sub2 = t.itm_sub2
				AND m.itm_sub3 = t.itm_sub3)
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = c_null_val
		AND m.calc_ctg_cd = l2.calc_ctg_cd
		AND (i_wg_cd <> c_null_val OR m.rqst_wg_cd = c_null_val)
		AND (
			i_bom_ptn IS NOT NULL AND m.bom_ptn = i_bom_ptn
			OR
			i_bom_ptn IS NULL
			OR
			m.bom_ptn IS NULL
			OR
			m.bom_ptn = c_null_val
			)
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_dtl w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = t.wg_cd
			)
		;
	END LOOP;

	LOOP
		l_cnt := 0 ;
		FOR l2 IN cur_ctg_list(c_itm_dtl) LOOP
			/* 依頼先ＷＧデータ */
			INSERT INTO mgw_bom_ex_dtl (
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				bom_ptn,
				wg_cd,
				rqst_wg_cd,
				calc_ctg_cd
				)
			SELECT DISTINCT
				m.itm_cd,
				m.itm_sub1,
				m.itm_sub2,
				m.itm_sub3,
				m.bom_ptn,
				CASE m.rqst_wg_cd WHEN c_null_val THEN m.wg_cd ELSE t.wg_cd END,
				CASE m.rqst_wg_cd WHEN c_null_val THEN t.wg_cd ELSE m.rqst_wg_cd END,
				m.calc_ctg_cd
			FROM mgw_bom_ex_dtl t
				INNER JOIN mgt_itm_dtl m ON (
					t.itm_cd = m.itm_cd
					AND t.itm_sub1 = m.itm_sub1
					AND t.itm_sub2 = m.itm_sub2
					AND t.itm_sub3 = m.itm_sub3
					AND t.rqst_wg_cd = m.wg_cd
					AND t.wg_cd <> m.rqst_wg_cd
					AND m.term = i_term
					AND m.calc_ctg_cd = l2.calc_ctg_cd
					AND	(
						i_bom_ptn IS NOT NULL AND m.bom_ptn = i_bom_ptn
						OR
						i_bom_ptn IS NULL
						OR
						m.bom_ptn IS NULL
						OR
						m.bom_ptn = c_null_val
					)
					AND m.non_calc_flg = '0'
				)
			WHERE 0=0
			AND t.rqst_wg_cd <> t.wg_cd
			AND	(t.bom_ptn IS NULL OR t.bom_ptn = c_null_val)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mgw_bom_ex_dtl w
					WHERE 0=0
					AND w.itm_cd = m.itm_cd
					AND w.itm_sub1 = m.itm_sub1
					AND w.itm_sub2 = m.itm_sub2
					AND w.itm_sub3 = m.itm_sub3
					AND w.wg_cd = CASE m.rqst_wg_cd WHEN c_null_val THEN m.wg_cd ELSE t.wg_cd END
					AND w.rqst_wg_cd = CASE m.rqst_wg_cd WHEN c_null_val THEN t.wg_cd ELSE m.rqst_wg_cd END
				)
			;
			GET DIAGNOSTICS l_cnt2 = ROW_COUNT;
			l_cnt := l_cnt + l_cnt2;
		END LOOP;
		IF l_cnt = 0 THEN
			EXIT;
		END IF;
	END LOOP;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_purc');
	FOR l3 IN cur_ctg_list(c_itm_purc) LOOP
		INSERT INTO mgw_bom_ex_purc (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_purc m
		WHERE 0=0
		AND m.term = i_term
		AND m.calc_ctg_cd = l3.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_itm t
				WHERE 0=0
				AND t.itm_cd = m.itm_cd
				AND t.itm_sub1 = m.itm_sub1
				AND t.itm_sub2 = m.itm_sub2
				AND t.itm_sub3 = m.itm_sub3
				AND t.wg_cd = m.wg_cd
			)
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_purc w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = m.wg_cd
			)
		;

		INSERT INTO mgw_bom_ex_purc (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			t.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_purc m
			INNER JOIN mgw_bom_ex_itm t ON (
				m.itm_cd = t.itm_cd
				AND m.itm_sub1 = t.itm_sub1
				AND m.itm_sub2 = t.itm_sub2
				AND m.itm_sub3 = t.itm_sub3)
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = c_null_val
		AND m.calc_ctg_cd = l3.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_purc w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = t.wg_cd
			)
		;
	END LOOP;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_proc');
	FOR l8 IN cur_ctg_list(c_itm_proc) LOOP
		INSERT INTO mgw_bom_ex_proc (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_proc m
		WHERE 0=0
		AND m.term = i_term
		AND m.calc_ctg_cd = l8.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_proc w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = m.wg_cd
			)
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_itm t
				WHERE 0=0
				AND t.itm_cd = m.itm_cd
				AND t.itm_sub1 = m.itm_sub1
				AND t.itm_sub2 = m.itm_sub2
				AND t.itm_sub3 = m.itm_sub3
				AND t.wg_cd = m.wg_cd
			)
		;

		INSERT INTO mgw_bom_ex_proc (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			t.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_proc m
			INNER JOIN mgw_bom_ex_itm t ON (
				m.itm_cd = t.itm_cd
				AND m.itm_sub1 = t.itm_sub1
				AND m.itm_sub2 = t.itm_sub2
				AND m.itm_sub3 = t.itm_sub3)
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = c_null_val
		AND m.calc_ctg_cd = l8.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_proc w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = t.wg_cd
			)
		;
	END LOOP;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_prov');
	FOR l4 IN cur_ctg_list(c_itm_prov) LOOP
		INSERT INTO mgw_bom_ex_prov (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_prov m
		WHERE 0=0
		AND m.term = i_term
		AND m.calc_ctg_cd = l4.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_prov w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = m.wg_cd
			)
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_itm t
				WHERE 0=0
				AND t.itm_cd = m.itm_cd
				AND t.itm_sub1 = m.itm_sub1
				AND t.itm_sub2 = m.itm_sub2
				AND t.itm_sub3 = m.itm_sub3
				AND t.wg_cd = m.wg_cd
			)
		;

		INSERT INTO mgw_bom_ex_prov (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			t.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_prov m
			INNER JOIN mgw_bom_ex_itm t ON (
				m.itm_cd = t.itm_cd
				AND m.itm_sub1 = t.itm_sub1
				AND m.itm_sub2 = t.itm_sub2
				AND m.itm_sub3 = t.itm_sub3)
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = c_null_val
		AND m.calc_ctg_cd = l4.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_prov w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = t.wg_cd
			)
		;
	END LOOP;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_sls');
	FOR l5 IN cur_ctg_list(c_itm_sls) LOOP
		INSERT INTO mgw_bom_ex_sls (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_sls m
		WHERE 0=0
		AND m.term = i_term
		AND m.calc_ctg_cd = l5.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_sls w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = m.wg_cd
			)
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_itm t
				WHERE 0=0
				AND t.itm_cd = m.itm_cd
				AND t.itm_sub1 = m.itm_sub1
				AND t.itm_sub2 = m.itm_sub2
				AND t.itm_sub3 = m.itm_sub3
				AND t.wg_cd = m.wg_cd
			)
		;

		INSERT INTO mgw_bom_ex_sls (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
		)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			t.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_sls m
			INNER JOIN mgw_bom_ex_itm t ON (
				m.itm_cd = t.itm_cd
				AND m.itm_sub1 = t.itm_sub1
				AND m.itm_sub2 = t.itm_sub2
				AND m.itm_sub3 = t.itm_sub3)
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = c_null_val
		AND m.calc_ctg_cd = l5.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_sls w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = t.wg_cd
			)
		;
	END LOOP;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_fix');
	FOR l6 IN cur_ctg_list(c_itm_fix) LOOP
		INSERT INTO mgw_bom_ex_fix (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_fix m
		WHERE 0=0
		AND m.term = i_term
		AND m.calc_ctg_cd = l6.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_fix w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = m.wg_cd
			)
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_itm t
				WHERE 0=0
				AND t.itm_cd = m.itm_cd
				AND t.itm_sub1 = m.itm_sub1
				AND t.itm_sub2 = m.itm_sub2
				AND t.itm_sub3 = m.itm_sub3
				AND t.wg_cd = m.wg_cd
			)
		;

		INSERT INTO mgw_bom_ex_fix (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			t.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_fix m
			INNER JOIN mgw_bom_ex_itm t ON (
				m.itm_cd = t.itm_cd
				AND m.itm_sub1 = t.itm_sub1
				AND m.itm_sub2 = t.itm_sub2
				AND m.itm_sub3 = t.itm_sub3)
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = c_null_val
		AND m.calc_ctg_cd = l6.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_fix w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
				AND w.wg_cd = t.wg_cd
			)
		;
	END LOOP;

	UPDATE mgw_bom_ex_itm t
	SET dtl_calc_ctg_cd =
			(
			SELECT MIN(w.calc_ctg_cd)
			FROM mgw_bom_ex_dtl w
			WHERE 0=0
			AND w.itm_cd = t.itm_cd
			AND w.itm_sub1 = t.itm_sub1
			AND w.itm_sub2 = t.itm_sub2
			AND w.itm_sub3 = t.itm_sub3
			AND (w.wg_cd = c_null_val OR w.wg_cd = t.wg_cd)
			),
		purc_calc_ctg_cd =
			(
			SELECT MIN(w.calc_ctg_cd)
			FROM mgw_bom_ex_purc w
			WHERE 0=0
			AND w.itm_cd = t.itm_cd
			AND w.itm_sub1 = t.itm_sub1
			AND w.itm_sub2 = t.itm_sub2
			AND w.itm_sub3 = t.itm_sub3
			AND w.wg_cd = t.wg_cd
			),
		proc_calc_ctg_cd =
			(
			SELECT MIN(w.calc_ctg_cd)
			FROM mgw_bom_ex_proc w
			WHERE 0=0
			AND w.itm_cd = t.itm_cd
			AND w.itm_sub1 = t.itm_sub1
			AND w.itm_sub2 = t.itm_sub2
			AND w.itm_sub3 = t.itm_sub3
			AND w.wg_cd = t.wg_cd
			),
		prov_calc_ctg_cd =
			(
			SELECT MIN(w.calc_ctg_cd)
			FROM mgw_bom_ex_prov w
			WHERE 0=0
			AND w.itm_cd = t.itm_cd
			AND w.itm_sub1 = t.itm_sub1
			AND w.itm_sub2 = t.itm_sub2
			AND w.itm_sub3 = t.itm_sub3
			AND w.wg_cd = t.wg_cd
			),
		sls_calc_ctg_cd =
			(
			SELECT MIN(w.calc_ctg_cd)
			FROM mgw_bom_ex_sls w
			WHERE 0=0
			AND w.itm_cd = t.itm_cd
			AND w.itm_sub1 = t.itm_sub1
			AND w.itm_sub2 = t.itm_sub2
			AND w.itm_sub3 = t.itm_sub3
			AND w.wg_cd = t.wg_cd
			),
		fix_calc_ctg_cd =
			(
			SELECT MIN(w.calc_ctg_cd)
			FROM mgw_bom_ex_fix w
			WHERE 0=0
			AND w.itm_cd = t.itm_cd
			AND w.itm_sub1 = t.itm_sub1
			AND w.itm_sub2 = t.itm_sub2
			AND w.itm_sub3 = t.itm_sub3
			AND w.wg_cd = t.wg_cd
			)
		WHERE 0=0
	;

	IF i_wg_cd = c_null_val THEN
		/* WG未指定の場合はWG違いのレコードを集約する */
		INSERT INTO mgw_bom_ex_itm (
			itm_cd, itm_sub1, itm_sub2, itm_sub3, wg_cd,
			calc_ctg_cd, dtl_calc_ctg_cd, purc_calc_ctg_cd, proc_calc_ctg_cd,
			prov_calc_ctg_cd, sls_calc_ctg_cd, fix_calc_ctg_cd, bom_wg_cd
			)
		SELECT	w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3, c_null_val,
			MIN(w.calc_ctg_cd), MIN(w.dtl_calc_ctg_cd), MIN(w.purc_calc_ctg_cd), MIN(w.proc_calc_ctg_cd),
			MIN(w.prov_calc_ctg_cd), MIN(w.sls_calc_ctg_cd), MIN(w.fix_calc_ctg_cd), MIN(w.bom_wg_cd)
		FROM mgw_bom_ex_itm w
		WHERE 0=0
		GROUP BY w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3
		;

		INSERT INTO mgw_bom_ex_dtl (
			itm_cd, itm_sub1, itm_sub2, itm_sub3, bom_ptn, wg_cd, rqst_wg_cd,
			calc_ctg_cd, bom_calc_ctg_cd
			)
		SELECT	t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.bom_ptn, c_null_val, c_null_val,
			MIN(t.calc_ctg_cd), MIN(t.bom_calc_ctg_cd)
		FROM mgw_bom_ex_dtl t
		WHERE 0=0
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_dtl w
				WHERE 0=0
				AND w.itm_cd = t.itm_cd
				AND w.itm_sub1 = t.itm_sub1
				AND w.itm_sub2 = t.itm_sub2
				AND w.itm_sub3 = t.itm_sub3
				AND w.bom_ptn = t.bom_ptn
				AND w.wg_cd = c_null_val
				AND w.rqst_wg_cd = c_null_val
			)
		GROUP BY t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.bom_ptn
		;

		DELETE FROM mgw_bom_ex_itm w WHERE w.wg_cd <> c_null_val;
		DELETE FROM mgw_bom_ex_dtl w WHERE w.wg_cd <> c_null_val;
	END IF;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_bom');
	IF i_rev_flg = '0' THEN
		DELETE FROM mgw_bom_ex_dtl w
		WHERE 0=0
		AND (
			i_bom_ptn IS NOT NULL AND w.bom_ptn <> i_bom_ptn
			OR
			w.bom_ptn IS NULL
			OR
			w.bom_ptn = c_null_val
			)
		;

		FOR l7 IN cur_ctg_list(c_bom) LOOP
			INSERT INTO mgw_bom_ex_bom (
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				bom_ptn,
				oper_cd, oper_seq,
				chd_itm_cd,
				chd_itm_sub1,
				chd_itm_sub2,
				chd_itm_sub3,
				alt_grp_cd, expns_cd,
				disp_seq,
				par_rqmt_qty,
				chd_rqmt_qty, chd_base_qty, fxd_chd_rqmt_qty,
				chd_min_qty,
				chd_batch_qty,
				alt_itm_ratio,
				wg_cd,
				calc_ctg_cd
				)
			SELECT	m.par_itm_cd,
				m.par_itm_sub1,
				m.par_itm_sub2,
				m.par_itm_sub3,
				m.bom_ptn,
				m.oper_cd, m.oper_seq,
				m.chd_itm_cd,
				m.chd_itm_sub1,
				m.chd_itm_sub2,
				m.chd_itm_sub3,
				m.alt_grp_cd, m.expns_cd,
				m.disp_seq,
				m.par_rqmt_qty,
				m.chd_rqmt_qty, m.chd_base_qty, m.fxd_chd_rqmt_qty,
				m.chd_min_qty,
				m.chd_batch_qty,
				m.alt_itm_ratio,
				m.wg_cd,
				m.calc_ctg_cd
			FROM mgt_bom m
			WHERE 0=0
			AND m.term = i_term
			AND m.calc_ctg_cd = l7.calc_ctg_cd
			AND m.non_calc_flg = '0'
			AND m.wg_cd <> c_null_val
			AND NOT EXISTS (
					SELECT 'X'
					FROM mgw_bom_ex_bom w
					WHERE 0=0
					AND w.par_itm_cd = m.par_itm_cd
					AND w.par_itm_sub1 = m.par_itm_sub1
					AND w.par_itm_sub2 = m.par_itm_sub2
					AND w.par_itm_sub3 = m.par_itm_sub3
					AND w.bom_ptn = m.bom_ptn
					AND w.wg_cd = m.wg_cd
				)
			AND EXISTS (
					SELECT 'X'
					FROM mgw_bom_ex_dtl t
					WHERE 0=0
					AND t.itm_cd = m.par_itm_cd
					AND t.itm_sub1 = m.par_itm_sub1
					AND t.itm_sub2 = m.par_itm_sub2
					AND t.itm_sub3 = m.par_itm_sub3
					AND t.bom_ptn = m.bom_ptn
					AND t.wg_cd = m.wg_cd
				)
			;

			INSERT INTO mgw_bom_ex_bom (
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				bom_ptn,
				oper_cd, oper_seq,
				chd_itm_cd,
				chd_itm_sub1,
				chd_itm_sub2,
				chd_itm_sub3,
				alt_grp_cd, expns_cd,
				disp_seq,
				par_rqmt_qty,
				chd_rqmt_qty, chd_base_qty, fxd_chd_rqmt_qty,
				chd_min_qty,
				chd_batch_qty,
				alt_itm_ratio,
				wg_cd,
				calc_ctg_cd
				)
			SELECT DISTINCT
				m.par_itm_cd,
				m.par_itm_sub1,
				m.par_itm_sub2,
				m.par_itm_sub3,
				m.bom_ptn,
				m.oper_cd, m.oper_seq,
				m.chd_itm_cd,
				m.chd_itm_sub1,
				m.chd_itm_sub2,
				m.chd_itm_sub3,
				m.alt_grp_cd, m.expns_cd,
				m.disp_seq,
				m.par_rqmt_qty,
				m.chd_rqmt_qty, m.chd_base_qty, m.fxd_chd_rqmt_qty,
				m.chd_min_qty,
				m.chd_batch_qty,
				m.alt_itm_ratio,
				t.wg_cd,
				m.calc_ctg_cd
			FROM mgt_bom m
				INNER JOIN mgw_bom_ex_dtl t ON (
					m.par_itm_cd = t.itm_cd
					AND m.par_itm_sub1 = t.itm_sub1
					AND m.par_itm_sub2 = t.itm_sub2
					AND m.par_itm_sub3 = t.itm_sub3
					AND m.bom_ptn = t.bom_ptn)
			WHERE 0=0
			AND m.term = i_term
			AND m.wg_cd = c_null_val
			AND m.calc_ctg_cd = l7.calc_ctg_cd
			AND m.non_calc_flg = '0'
			AND NOT EXISTS (
					SELECT 'X'
					FROM mgw_bom_ex_bom w
					WHERE 0=0
					AND w.par_itm_cd = m.par_itm_cd
					AND w.par_itm_sub1 = m.par_itm_sub1
					AND w.par_itm_sub2 = m.par_itm_sub2
					AND w.par_itm_sub3 = m.par_itm_sub3
					AND w.bom_ptn = m.bom_ptn
					AND w.wg_cd = t.wg_cd
				)
			;
		END LOOP;

		UPDATE mgw_bom_ex_dtl w
		SET bom_calc_ctg_cd = (
				SELECT MIN(t.calc_ctg_cd)
				FROM mgw_bom_ex_bom t
				WHERE 0=0
				AND t.par_itm_cd = w.itm_cd
				AND t.par_itm_sub1 = w.itm_sub1
				AND t.par_itm_sub2 = w.itm_sub2
				AND t.par_itm_sub3 = w.itm_sub3
				AND t.bom_ptn = w.bom_ptn
				AND	(t.wg_cd = w.wg_cd OR i_wg_cd = c_null_val)
				)
		WHERE 0=0
		;
	ELSE
		FOR l7 IN cur_ctg_list(c_bom) LOOP
			INSERT INTO mgw_bom_ex_bom (
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				chd_itm_cd,
				chd_itm_sub1,
				chd_itm_sub2,
				chd_itm_sub3,
				alt_grp_cd,
				expns_cd,
				disp_seq,
				par_rqmt_qty,
				chd_rqmt_qty,
				chd_base_qty,
				fxd_chd_rqmt_qty,
				chd_min_qty,
				chd_batch_qty,
				alt_itm_ratio,
				wg_cd,
				calc_ctg_cd
				)
			SELECT	m.par_itm_cd,
				m.par_itm_sub1,
				m.par_itm_sub2,
				m.par_itm_sub3,
				m.bom_ptn,
				m.oper_cd,
				m.oper_seq,
				m.chd_itm_cd,
				m.chd_itm_sub1,
				m.chd_itm_sub2,
				m.chd_itm_sub3,
				m.alt_grp_cd,
				m.expns_cd,
				m.disp_seq,
				m.par_rqmt_qty,
				m.chd_rqmt_qty,
				m.chd_base_qty,
				m.fxd_chd_rqmt_qty,
				m.chd_min_qty,
				m.chd_batch_qty,
				m.alt_itm_ratio,
				m.wg_cd,
				m.calc_ctg_cd
			FROM mgt_bom m
			WHERE 0=0
			AND m.term = i_term
			AND m.calc_ctg_cd = l7.calc_ctg_cd
			AND m.non_calc_flg = '0'
			AND m.wg_cd <> c_null_val
			AND (i_bom_ptn IS NULL OR m.bom_ptn = i_bom_ptn)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mgw_bom_ex_bom w
					WHERE 0=0
					AND w.par_itm_cd = m.par_itm_cd
					AND w.par_itm_sub1 = m.par_itm_sub1
					AND w.par_itm_sub2 = m.par_itm_sub2
					AND w.par_itm_sub3 = m.par_itm_sub3
					AND w.bom_ptn = m.bom_ptn
					AND w.wg_cd = m.wg_cd
				)
			AND EXISTS (
					SELECT 'X'
					FROM mgw_bom_ex_itm t
					WHERE 0=0
					AND t.itm_cd = m.chd_itm_cd
					AND t.itm_sub1 = m.chd_itm_sub1
					AND t.itm_sub2 = m.chd_itm_sub2
					AND t.itm_sub3 = m.chd_itm_sub3
				)
			AND EXISTS (
					SELECT 'X'
					FROM mgw_bom_ex_tmp w1
						INNER JOIN mgw_bom_ex_dtl w2 ON (
							w1.itm_cd = w2.itm_cd
							AND w1.itm_sub1 = w2.itm_sub1
							AND w1.itm_sub2 = w2.itm_sub2
							AND w1.itm_sub3 = w2.itm_sub3
							AND w1.wg_cd = w2.wg_cd
							)
					WHERE 0=0
					AND w2.rqst_wg_cd = m.wg_cd
					AND w2.itm_cd = m.chd_itm_cd
					AND w2.itm_sub1 = m.chd_itm_sub1
					AND w2.itm_sub2 = m.chd_itm_sub2
					AND w2.itm_sub3 = m.chd_itm_sub3
				)
			;

			INSERT INTO mgw_bom_ex_bom (
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				chd_itm_cd,
				chd_itm_sub1,
				chd_itm_sub2,
				chd_itm_sub3,
				alt_grp_cd,
				expns_cd,
				disp_seq,
				par_rqmt_qty,
				chd_rqmt_qty,
				chd_base_qty,
				fxd_chd_rqmt_qty,
				chd_min_qty,
				chd_batch_qty,
				alt_itm_ratio,
				wg_cd,
				calc_ctg_cd
				)
			SELECT	m.par_itm_cd,
				m.par_itm_sub1,
				m.par_itm_sub2,
				m.par_itm_sub3,
				m.bom_ptn,
				m.oper_cd,
				m.oper_seq,
				m.chd_itm_cd,
				m.chd_itm_sub1,
				m.chd_itm_sub2,
				m.chd_itm_sub3,
				m.alt_grp_cd,
				m.expns_cd,
				m.disp_seq,
				m.par_rqmt_qty,
				m.chd_rqmt_qty,
				m.chd_base_qty,
				m.fxd_chd_rqmt_qty,
				m.chd_min_qty,
				m.chd_batch_qty,
				m.alt_itm_ratio,
				t.wg_cd,
				m.calc_ctg_cd
			FROM mgt_bom m
				CROSS JOIN mgw_bom_ex_tmp t
			WHERE 0=0
			AND m.term = i_term
			AND m.wg_cd = c_null_val
			AND m.calc_ctg_cd = l7.calc_ctg_cd
			AND m.non_calc_flg = '0'
			AND m.chd_itm_cd = t.itm_cd
			AND m.chd_itm_sub1 = t.itm_sub1
			AND m.chd_itm_sub2 = t.itm_sub2
			AND m.chd_itm_sub3 = t.itm_sub3
			AND (i_bom_ptn IS NULL OR m.bom_ptn = i_bom_ptn)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mgw_bom_ex_bom w
					WHERE 0=0
					AND w.par_itm_cd = m.par_itm_cd
					AND w.par_itm_sub1 = m.par_itm_sub1
					AND w.par_itm_sub2 = m.par_itm_sub2
					AND w.par_itm_sub3 = m.par_itm_sub3
					AND w.bom_ptn = m.bom_ptn
					AND w.wg_cd = t.wg_cd
				)
			;
		END LOOP;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_bom_ex$p_bom_ex1(
	IN i_calc_grp_cd VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_itm_cd VARCHAR,
	IN i_itm_sub1 VARCHAR,
	IN i_itm_sub2 VARCHAR,
	IN i_itm_sub3 VARCHAR,
	IN i_bom_ptn VARCHAR,
	IN i_bom_ptn_flg CHARACTER,
	IN i_max_hrrchy NUMERIC
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価ＢＯＭマスタを正展開する際に必要なデータを
	原価ＢＯＭ展開ワークに作成する
<REMARKS>
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_term
		期
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bom_ptn
		構成パタン
<IN>	i_bom_ptn_flg
		構成パタン引継ぎＦＬＧ
<IN>	i_max_hrrchy
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_max_lvl CONSTANT mgw_bom_ex.bom_lvl%TYPE := 500 ;
	c_max_itm CONSTANT INTEGER := 6 ;
	c_max_itm_num CONSTANT INTEGER := 999999 ; --c_max_itmの桁に対する最大数
	c_seq_digit CONSTANT INTEGER := 3000;
	c_max_cnt CONSTANT INTEGER := 5000 ; --バルクインサートでの最大レコード数

	i INTEGER;
	l_seq INTEGER;
	l_lvl mgw_bom_ex.bom_lvl%TYPE;
	l_wg_cd mam_wg.wg_cd%TYPE;
	l_stop_flg CHAR(1);
	x RECORD;
BEGIN
	/* 一時テーブルの作成 */
	CALL fcpa_postgres_util$type_is_table_row('mgpa_bom_ex$g_bom', 'mgw_bom_ex', 'integer') ;

	IF i_wg_cd IS NULL THEN
		l_wg_cd := c_null_val;
	ELSE
		l_wg_cd := i_wg_cd;
	END IF;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_tmp');
	INSERT INTO mgw_bom_ex_tmp (
		bom_lvl, sort_no,
		wg_cd,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3
		)
	VALUES (
		0, 0,
		l_wg_cd,
		i_itm_cd,
		i_itm_sub1,
		i_itm_sub2,
		i_itm_sub3
		)
	;

	CALL mgpa_calc_ctg$p_set_work_all(i_calc_grp_cd);

	CALL mgpa_bom_ex$p_set_tgt_data(i_calc_grp_cd, l_wg_cd, i_term, i_bom_ptn, '0');

	l_seq := 0;
	l_lvl := 0;
	l_stop_flg := '0';
	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex');
	INSERT INTO mgw_bom_ex (
		bom_lvl, sort_no, wg_cd,
		itm_cd, itm_sub1, itm_sub2, itm_sub3, bom_ptn, calc_ctg_cd,
		itm_calc_ctg_cd, dtl_calc_ctg_cd, purc_calc_ctg_cd, proc_calc_ctg_cd,
		prov_calc_ctg_cd, sls_calc_ctg_cd, fix_calc_ctg_cd,
		bottom_flg
		)
	SELECT	l_lvl, LPAD(l_seq::VARCHAR, c_seq_digit, '0'), m1.wg_cd,
		m1.itm_cd, m1.itm_sub1, m1.itm_sub2, m1.itm_sub3, i_bom_ptn, m2.bom_calc_ctg_cd,
		m1.calc_ctg_cd, m1.dtl_calc_ctg_cd, m1.purc_calc_ctg_cd, m1.proc_calc_ctg_cd,
		m1.prov_calc_ctg_cd, m1.sls_calc_ctg_cd, m1.fix_calc_ctg_cd,
		'1'
	FROM mgw_bom_ex_itm m1
		INNER JOIN mgw_bom_ex_dtl m2 ON (
			m1.itm_cd = m2.itm_cd
			AND m1.itm_sub1 = m2.itm_sub1
			AND m1.itm_sub2 = m2.itm_sub2
			AND m1.itm_sub3 = m2.itm_sub3
			AND m1.dtl_calc_ctg_cd = m2.calc_ctg_cd
			AND m2.bom_ptn = i_bom_ptn
			AND	(l_wg_cd = c_null_val OR m1.wg_cd = l_wg_cd AND m2.wg_cd = l_wg_cd)
			)
	WHERE 0=0
	;

	LOOP
		l_lvl := l_lvl + 1;
		IF i_max_hrrchy IS NOT NULL AND i_max_hrrchy < l_lvl THEN
			l_stop_flg := '1';
			EXIT;
		END IF;

		call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_tmp');
		INSERT INTO mgw_bom_ex_tmp (
			bom_lvl, sort_no,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			alt_grp_cd, expns_cd,
			disp_seq,
			par_rqmt_qty,
			chd_rqmt_qty, chd_base_qty, fxd_chd_rqmt_qty,
			chd_min_qty, chd_batch_qty,
			alt_itm_ratio,
			calc_ctg_cd,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_sort_no,
			wg_cd,
			bom_wg_cd
			)
		SELECT	l_lvl, row_number() OVER (),
			t3.chd_itm_cd,
			t3.chd_itm_sub1,
			t3.chd_itm_sub2,
			t3.chd_itm_sub3,
			t3.bom_ptn,
			t3.oper_cd,
			t3.oper_seq,
			t3.alt_grp_cd, t3.expns_cd,
			t3.disp_seq,
			t3.par_rqmt_qty,
			t3.chd_rqmt_qty, t3.chd_base_qty, t3.fxd_chd_rqmt_qty,
			t3.chd_min_qty, t3.chd_batch_qty,
			t3.alt_itm_ratio,
			t3.calc_ctg_cd,
			t3.par_itm_cd,
			t3.par_itm_sub1,
			t3.par_itm_sub2,
			t3.par_itm_sub3,
			t1.sort_no,
			t3.wg_cd,
			t3.wg_cd
		FROM mgw_bom_ex t1
			INNER JOIN mgw_bom_ex_dtl t2 ON (
				t1.itm_cd = t2.itm_cd
				AND t1.itm_sub1 = t2.itm_sub1
				AND t1.itm_sub2 = t2.itm_sub2
				AND t1.itm_sub3 = t2.itm_sub3
				AND t1.bom_ptn = t2.bom_ptn
				AND	(t1.wg_cd = t2.rqst_wg_cd OR l_wg_cd = c_null_val)
				)
			INNER JOIN mgw_bom_ex_bom t3 ON (
				t2.itm_cd = t3.par_itm_cd
				AND t2.itm_sub1 = t3.par_itm_sub1
				AND t2.itm_sub2 = t3.par_itm_sub2
				AND t2.itm_sub3 = t3.par_itm_sub3
				AND t2.bom_ptn = t3.bom_ptn
				AND t2.wg_cd = t3.wg_cd)
		WHERE 0=0
		AND t1.bom_lvl = l_lvl - 1
		AND t1.loop_flg = '0'
		;

		IF i_bom_ptn_flg = '0' THEN
			CALL mgpa_bom_ex$p_set_tgt_data(i_calc_grp_cd, l_wg_cd, i_term, NULL, '0');
		ELSE
			CALL mgpa_bom_ex$p_set_tgt_data(i_calc_grp_cd, l_wg_cd, i_term, i_bom_ptn, '0');
		END IF;

		l_seq := 0;
		i := 0;
		TRUNCATE TABLE mgpa_bom_ex$g_bom;
		FOR x IN
			SELECT	t1.bom_lvl,
				t1.par_sort_no sort_no,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				m2.bom_ptn,
				t1.oper_cd,
				t1.oper_seq,
				t1.alt_grp_cd,
				t1.expns_cd,
				t1.disp_seq,
				t1.par_rqmt_qty,
				t1.chd_rqmt_qty,
				t1.chd_base_qty,
				t1.fxd_chd_rqmt_qty,
				t1.chd_min_qty,
				t1.chd_batch_qty,
				t1.alt_itm_ratio,
				m2.bom_calc_ctg_cd calc_ctg_cd,
				t1.par_itm_cd,
				t1.par_itm_sub1,
				t1.par_itm_sub2,
				t1.par_itm_sub3,
				m1.calc_ctg_cd itm_calc_ctg_cd,
				m1.dtl_calc_ctg_cd,
				m1.purc_calc_ctg_cd,
				m1.proc_calc_ctg_cd,
				m1.prov_calc_ctg_cd,
				m1.sls_calc_ctg_cd,
				m1.fix_calc_ctg_cd,
				COALESCE(m1.wg_cd, t1.wg_cd) wg_cd
			FROM mgw_bom_ex_tmp t1
				LEFT OUTER JOIN mgw_bom_ex_itm m1 ON (
					t1.itm_cd = m1.itm_cd
					AND t1.itm_sub1 = m1.itm_sub1
					AND t1.itm_sub2 = m1.itm_sub2
					AND t1.itm_sub3 = m1.itm_sub3
					AND t1.wg_cd = m1.wg_cd)
				LEFT OUTER JOIN mgw_bom_ex_dtl m2 ON (
					t1.itm_cd = m2.itm_cd
					AND t1.itm_sub1 = m2.itm_sub1
					AND t1.itm_sub2 = m2.itm_sub2
					AND t1.itm_sub3 = m2.itm_sub3
					AND t1.wg_cd = m2.rqst_wg_cd)
			WHERE 0=0
			ORDER BY t1.par_sort_no,
				t1.oper_cd, t1.oper_seq, t1.disp_seq,
				t1.alt_grp_cd, t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
		LOOP
			l_seq := l_seq + 1;
			IF l_seq > c_max_itm_num THEN
				EXIT;
			END IF;

			i := i + 1;
			INSERT INTO mgpa_bom_ex$g_bom (
				_index_,
				bom_lvl,
				sort_no,
				wg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				alt_grp_cd,
				expns_cd,
				disp_seq,
				par_rqmt_qty,
				chd_rqmt_qty,
				chd_base_qty,
				fxd_chd_rqmt_qty,
				chd_min_qty,
				chd_batch_qty,
				alt_itm_ratio,
				calc_ctg_cd,
				itm_calc_ctg_cd,
				dtl_calc_ctg_cd,
				purc_calc_ctg_cd,
				proc_calc_ctg_cd,
				prov_calc_ctg_cd,
				sls_calc_ctg_cd,
				fix_calc_ctg_cd,
				bottom_flg,
				par_sort_no,
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				loop_flg
				)
			VALUES (
				i,
				x.bom_lvl,
				RPAD(SUBSTR(x.sort_no, 1, (l_lvl::INTEGER * c_max_itm)) || LPAD(l_seq::VARCHAR, c_max_itm, '0'), c_seq_digit, '0'),
				x.wg_cd,
				x.itm_cd,
				x.itm_sub1,
				x.itm_sub2,
				x.itm_sub3,
				x.bom_ptn,
				x.oper_cd,
				x.oper_seq,
				x.alt_grp_cd,
				x.expns_cd,
				x.disp_seq,
				x.par_rqmt_qty,
				x.chd_rqmt_qty,
				x.chd_base_qty,
				x.fxd_chd_rqmt_qty,
				x.chd_min_qty,
				x.chd_batch_qty,
				x.alt_itm_ratio,
				x.calc_ctg_cd,
				x.itm_calc_ctg_cd,
				x.dtl_calc_ctg_cd,
				x.purc_calc_ctg_cd,
				x.proc_calc_ctg_cd,
				x.prov_calc_ctg_cd,
				x.sls_calc_ctg_cd,
				x.fix_calc_ctg_cd,
				'1',
				x.sort_no,
				x.par_itm_cd,
				x.par_itm_sub1,
				x.par_itm_sub2,
				x.par_itm_sub3,
				'0'
				)
			;

			IF i > c_max_cnt THEN
				CALL mgpa_bom_ex$p_ins_bom_ex();
				i := 0;
			END IF;
		END LOOP;

		IF l_lvl >= c_max_lvl OR l_seq = 0 THEN
			IF l_lvl >= c_max_lvl THEN
				l_stop_flg := '1';
			END IF;

			EXIT;
		END IF;

		CALL mgpa_bom_ex$p_ins_bom_ex();
		i := 0;

		CALL mgpa_bom_ex$p_upd_loop(l_lvl);

	END LOOP;

	UPDATE mgw_bom_ex w
	SET bottom_flg = '0'
	WHERE 0=0
	AND (
		l_stop_flg = '1' AND w.bom_lvl = i_max_hrrchy
		OR
		EXISTS (
			SELECT 'X'
			FROM mgw_bom_ex z
			WHERE 0=0
			AND z.par_sort_no = w.sort_no
			)
		)
	;

	TRUNCATE TABLE mgpa_bom_ex$g_bom;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_bom_ex$p_bom_ex2(
	IN i_calc_grp_cd VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_itm_cd VARCHAR,
	IN i_itm_sub1 VARCHAR,
	IN i_itm_sub2 VARCHAR,
	IN i_itm_sub3 VARCHAR,
	IN i_bom_ptn VARCHAR,
	IN i_bom_ptn_flg CHARACTER,
	IN i_max_hrrchy NUMERIC
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価ＢＯＭマスタを逆展開する際に必要なデータを
	原価ＢＯＭ展開ワークに作成する。
<REMARKS>
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_term
		期
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bom_ptn
		構成パタン
<IN>	i_bom_ptn_flg
		構成パタン引継ぎＦＬＧ
<IN>	i_max_hrrchy
		最大階層
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_max_lvl CONSTANT mgw_bom_ex.bom_lvl%TYPE := 500 ;
	c_max_itm CONSTANT INTEGER := 6 ;
	c_max_itm_num CONSTANT INTEGER := 999999 ; --c_max_itmの桁に対する最大数
	c_seq_digit CONSTANT INTEGER := 3000;
	c_max_cnt CONSTANT INTEGER := 5000 ; --バルクインサートでの最大レコード数
	c_calc_itm CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','CALC_ITM');

	i INTEGER;
	l_seq INTEGER;
	l_lvl mgw_bom_ex.bom_lvl%TYPE;
	l_wg_cd mam_wg.wg_cd%TYPE;
	l_stop_flg CHAR(1);
	x RECORD;
BEGIN
	/* 一時テーブルの作成 */
	CALL fcpa_postgres_util$type_is_table_row('mgpa_bom_ex$g_bom', 'mgw_bom_ex', 'integer') ;

	IF i_wg_cd IS NULL THEN
		l_wg_cd := c_null_val;
	ELSE
		l_wg_cd := i_wg_cd;
	END IF;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_tmp');
	INSERT INTO mgw_bom_ex_tmp (
		bom_lvl, sort_no,
		wg_cd,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3
		)
	VALUES (
		0, 0,
		l_wg_cd,
		i_itm_cd,
		i_itm_sub1,
		i_itm_sub2,
		i_itm_sub3
		)
	;

	CALL mgpa_calc_ctg$p_set_work_all(i_calc_grp_cd);

	CALL mgpa_bom_ex$p_set_tgt_data(i_calc_grp_cd, l_wg_cd, i_term, i_bom_ptn, '1');

	l_seq := 0;
	l_lvl := 0;
	l_stop_flg := '0';
	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex');
	INSERT INTO mgw_bom_ex (
		bom_lvl, sort_no, wg_cd,
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		itm_calc_ctg_cd, dtl_calc_ctg_cd, purc_calc_ctg_cd, proc_calc_ctg_cd,
		prov_calc_ctg_cd, sls_calc_ctg_cd, fix_calc_ctg_cd,
		bom_wg_cd,
		bottom_flg
		)
	SELECT	l_lvl, LPAD(l_seq::VARCHAR, c_seq_digit, '0'), m1.wg_cd,
		m1.itm_cd, m1.itm_sub1, m1.itm_sub2, m1.itm_sub3,
		m1.calc_ctg_cd, m1.dtl_calc_ctg_cd, m1.purc_calc_ctg_cd, m1.proc_calc_ctg_cd,
		m1.prov_calc_ctg_cd, m1.sls_calc_ctg_cd, m1.fix_calc_ctg_cd,
		l_wg_cd,
		'1'
	FROM mgw_bom_ex_itm m1
	WHERE 0=0
	AND (l_wg_cd = c_null_val OR m1.wg_cd = l_wg_cd)
	;

	LOOP
		l_lvl := l_lvl + 1;
		IF i_max_hrrchy IS NOT NULL AND i_max_hrrchy < l_lvl THEN
			l_stop_flg := '1';
			EXIT;
		END IF;

		call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_tmp');
		INSERT INTO mgw_bom_ex_tmp (
			bom_lvl, sort_no,
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)
		SELECT
			0, 0,
			m.wg_cd,
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3
		FROM mgt_itm m
		WHERE 0=0
		AND m.term = i_term
		AND m.non_calc_flg = '0'
		AND EXISTS (
				SELECT 'X'
				FROM mgw_calc_grp_ctg w
				WHERE 0=0
				AND w.calc_ctg_typ = c_calc_itm
				AND w.calc_ctg_cd = m.calc_ctg_cd
			)
		AND EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex w1
					INNER JOIN mgw_bom_ex_bom w2 ON (
						w1.itm_cd = w2.chd_itm_cd
						AND w1.itm_sub1 = w2.chd_itm_sub1
						AND w1.itm_sub2 = w2.chd_itm_sub2
						AND w1.itm_sub3 = w2.chd_itm_sub3)
				WHERE 0=0
				AND w1.bom_lvl = l_lvl - 1
				AND w1.loop_flg = '0'
				AND w2.wg_cd = m.wg_cd
				AND w2.par_itm_cd = m.itm_cd
				AND w2.par_itm_sub1 = m.itm_sub1
				AND w2.par_itm_sub2 = m.itm_sub2
				AND w2.par_itm_sub3 = m.itm_sub3
			)
		;

		call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_bom_tmp1');
		INSERT INTO mgw_bom_ex_bom_tmp1 (
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			alt_grp_cd,
			expns_cd,
			disp_seq,
			par_rqmt_qty,
			chd_rqmt_qty,
			chd_base_qty,
			fxd_chd_rqmt_qty,
			chd_min_qty,
			chd_batch_qty,
			alt_itm_ratio,
			wg_cd,
			bom_wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m1.par_itm_cd,
			m1.par_itm_sub1,
			m1.par_itm_sub2,
			m1.par_itm_sub3,
			m1.bom_ptn,
			m1.oper_cd,
			m1.oper_seq,
			m1.chd_itm_cd,
			m1.chd_itm_sub1,
			m1.chd_itm_sub2,
			m1.chd_itm_sub3,
			m1.alt_grp_cd,
			m1.expns_cd,
			m1.disp_seq,
			m1.par_rqmt_qty,
			m1.chd_rqmt_qty,
			m1.chd_base_qty,
			m1.fxd_chd_rqmt_qty,
			m1.chd_min_qty,
			m1.chd_batch_qty,
			m1.alt_itm_ratio,
			m1.wg_cd,
			m2.wg_cd,
			m1.calc_ctg_cd
		FROM mgw_bom_ex_bom m1
			INNER JOIN mgw_bom_ex_dtl m2 ON (
				m1.chd_itm_cd = m2.itm_cd
				AND m1.chd_itm_sub1 = m2.itm_sub1
				AND m1.chd_itm_sub2 = m2.itm_sub2
				AND m1.chd_itm_sub3 = m2.itm_sub3
				AND m1.wg_cd = m2.rqst_wg_cd
				AND (m2.bom_ptn <> c_null_val OR m2.wg_cd = m2.rqst_wg_cd))
		WHERE 0=0
		;

		IF i_bom_ptn_flg = '0' THEN
			CALL mgpa_bom_ex$p_set_tgt_data(i_calc_grp_cd, l_wg_cd, i_term, NULL, '1');
		ELSE
			CALL mgpa_bom_ex$p_set_tgt_data(i_calc_grp_cd, l_wg_cd, i_term, i_bom_ptn, '1');
		END IF;

		l_seq := 0;
		i := 0;
		TRUNCATE TABLE mgpa_bom_ex$g_bom;
		FOR x IN
			SELECT	l_lvl lvl,
				t1.sort_no,
				t1.itm_cd par_itm_cd,
				t1.itm_sub1 par_itm_sub1,
				t1.itm_sub2 par_itm_sub2,
				t1.itm_sub3 par_itm_sub3,
				m2.itm_cd,
				m2.itm_sub1,
				m2.itm_sub2,
				m2.itm_sub3,
				m1.bom_ptn,
				m1.oper_cd,
				m1.oper_seq,
				m1.alt_grp_cd,
				m1.expns_cd,
				m1.disp_seq,
				m1.par_rqmt_qty,
				m1.chd_rqmt_qty,
				m1.chd_base_qty,
				m1.fxd_chd_rqmt_qty,
				m1.chd_min_qty,
				m1.chd_batch_qty,
				m1.alt_itm_ratio,
				m1.calc_ctg_cd,
				m2.calc_ctg_cd itm_calc_ctg_cd,
				m2.dtl_calc_ctg_cd,
				m2.purc_calc_ctg_cd,
				m2.proc_calc_ctg_cd,
				m2.prov_calc_ctg_cd,
				m2.sls_calc_ctg_cd,
				m2.fix_calc_ctg_cd,
				m2.wg_cd
			FROM mgw_bom_ex t1
				INNER JOIN mgw_bom_ex_bom_tmp1 m1 ON (
					t1.itm_cd = m1.chd_itm_cd
					AND t1.itm_sub1 = m1.chd_itm_sub1
					AND t1.itm_sub2 = m1.chd_itm_sub2
					AND t1.itm_sub3 = m1.chd_itm_sub3
					AND t1.wg_cd = m1.bom_wg_cd)
				INNER JOIN mgw_bom_ex_itm m2 ON (
					m1.par_itm_cd = m2.itm_cd
					AND m1.par_itm_sub1 = m2.itm_sub1
					AND m1.par_itm_sub2 = m2.itm_sub2
					AND m1.par_itm_sub3 = m2.itm_sub3
					AND m1.wg_cd = m2.wg_cd)
			WHERE 0=0
			AND t1.bom_lvl = l_lvl - 1
			AND t1.loop_flg = '0'
			ORDER BY t1.sort_no, m1.bom_ptn, m1.oper_cd, m1.oper_seq,
				m1.alt_grp_cd, m2.itm_cd, m2.itm_sub1, m2.itm_sub2, m2.itm_sub3, m1.disp_seq
		LOOP
			l_seq := l_seq + 1;
			IF l_seq > c_max_itm_num THEN
				EXIT;
			END IF;

			i := i + 1;

			INSERT INTO mgpa_bom_ex$g_bom (
				_index_,
				bom_lvl,
				sort_no,
				wg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				alt_grp_cd,
				expns_cd,
				disp_seq,
				par_rqmt_qty,
				chd_rqmt_qty,
				chd_base_qty,
				fxd_chd_rqmt_qty,
				chd_min_qty,
				chd_batch_qty,
				alt_itm_ratio,
				calc_ctg_cd,
				itm_calc_ctg_cd,
				dtl_calc_ctg_cd,
				purc_calc_ctg_cd,
				proc_calc_ctg_cd,
				prov_calc_ctg_cd,
				sls_calc_ctg_cd,
				fix_calc_ctg_cd,
				bottom_flg,
				par_sort_no,
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				loop_flg
				)
			VALUES (
				i,
				x.lvl,
				RPAD(SUBSTR(x.sort_no, 1, (l_lvl::INTEGER * c_max_itm)) || LPAD(l_seq::VARCHAR, c_max_itm, '0'), c_seq_digit, '0'),
				x.wg_cd,
				x.itm_cd,
				x.itm_sub1,
				x.itm_sub2,
				x.itm_sub3,
				x.bom_ptn,
				x.oper_cd,
				x.oper_seq,
				x.alt_grp_cd,
				x.expns_cd,
				x.disp_seq,
				x.par_rqmt_qty,
				x.chd_rqmt_qty,
				x.chd_base_qty,
				x.fxd_chd_rqmt_qty,
				x.chd_min_qty,
				x.chd_batch_qty,
				x.alt_itm_ratio,
				x.calc_ctg_cd,
				x.itm_calc_ctg_cd,
				x.dtl_calc_ctg_cd,
				x.purc_calc_ctg_cd,
				x.proc_calc_ctg_cd,
				x.prov_calc_ctg_cd,
				x.sls_calc_ctg_cd,
				x.fix_calc_ctg_cd,
				'1',
				x.sort_no,
				x.par_itm_cd,
				x.par_itm_sub1,
				x.par_itm_sub2,
				x.par_itm_sub3,
				'0'
				)
			;

			IF i > c_max_cnt THEN
				CALL mgpa_bom_ex$p_ins_bom_ex();
				i := 0;
			END IF;
		END LOOP;

		IF l_lvl >= c_max_lvl OR l_seq = 0 THEN
			IF l_lvl >= c_max_lvl THEN
				l_stop_flg := '1';
			END IF;

			EXIT;
		END IF;

		CALL mgpa_bom_ex$p_ins_bom_ex();
		i := 0;

		CALL mgpa_bom_ex$p_upd_loop(l_lvl);
	END LOOP;

	UPDATE mgw_bom_ex w
	SET bottom_flg = '0'
	WHERE 0=0
	AND (
		l_stop_flg = '1' AND w.bom_lvl = i_max_hrrchy
		OR
		EXISTS (
			SELECT 'X'
			FROM mgw_bom_ex z
			WHERE 0=0
			AND z.par_sort_no = w.sort_no
			)
		)
	;

	TRUNCATE TABLE mgpa_bom_ex$g_bom;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_bom_ex$p_set_oper_wk(
	IN i_calc_grp_cd VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_itm_cd VARCHAR,
	IN i_itm_sub1 VARCHAR,
	IN i_itm_sub2 VARCHAR,
	IN i_itm_sub3 VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	入力データに対する原価品目工程マスタ・原価品目工数マスタ情報を
	ワークテーブルに作成する
<REMARKS>
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_term
		期
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_itm_oper CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ITM_OPER');
	c_itm_wk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ITM_WK');

	cur_ctg_list CURSOR (l_calc_ctg_typ VARCHAR) FOR
		SELECT w.calc_ctg_cd
		FROM mgw_calc_grp_ctg w
		WHERE 0=0
		AND w.calc_ctg_typ = l_calc_ctg_typ
		ORDER BY w.ctg_prio, w.calc_ctg_cd
		;

	l1 RECORD;
	l2 RECORD;
BEGIN
	CALL mgpa_calc_ctg$p_set_work_all(i_calc_grp_cd);

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_oper');
	FOR l1 IN cur_ctg_list(c_itm_oper) LOOP
		INSERT INTO mgw_bom_ex_oper (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_oper m
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = i_wg_cd
		AND m.itm_cd = i_itm_cd
		AND m.itm_sub1 = i_itm_sub1
		AND m.itm_sub2 = i_itm_sub2
		AND m.itm_sub3 = i_itm_sub3
		AND m.calc_ctg_cd = l1.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_oper w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
			)
		;

		INSERT INTO mgw_bom_ex_oper (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_oper m
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = c_null_val
		AND m.itm_cd = i_itm_cd
		AND m.itm_sub1 = i_itm_sub1
		AND m.itm_sub2 = i_itm_sub2
		AND m.itm_sub3 = i_itm_sub3
		AND m.calc_ctg_cd = l1.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_oper w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
			)
		;
	END LOOP;

	call fcpa_postgres_util$p_truncate_work('mgw_bom_ex_wk');
	FOR l2 IN cur_ctg_list(c_itm_wk) LOOP
		INSERT INTO mgw_bom_ex_wk (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_wk m
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = i_wg_cd
		AND m.itm_cd = i_itm_cd
		AND m.itm_sub1 = i_itm_sub1
		AND m.itm_sub2 = i_itm_sub2
		AND m.itm_sub3 = i_itm_sub3
		AND m.calc_ctg_cd = l2.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_wk w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
			)
		;

		INSERT INTO mgw_bom_ex_wk (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
			)
		SELECT DISTINCT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.wg_cd,
			m.calc_ctg_cd
		FROM mgt_itm_wk m
		WHERE 0=0
		AND m.term = i_term
		AND m.wg_cd = c_null_val
		AND m.itm_cd = i_itm_cd
		AND m.itm_sub1 = i_itm_sub1
		AND m.itm_sub2 = i_itm_sub2
		AND m.itm_sub3 = i_itm_sub3
		AND m.calc_ctg_cd = l2.calc_ctg_cd
		AND m.non_calc_flg = '0'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mgw_bom_ex_wk w
				WHERE 0=0
				AND w.itm_cd = m.itm_cd
				AND w.itm_sub1 = m.itm_sub1
				AND w.itm_sub2 = m.itm_sub2
				AND w.itm_sub3 = m.itm_sub3
			)
		;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;
