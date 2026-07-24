\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_alc_ptn$p_ini()
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	初期化処理
<REMARKS>
	メモリ内のワークデータをクリアする
<ARGUMENTS>
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$dpt_alc_grp', 'VARCHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$loc_alc_grp', 'VARCHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$oper_alc_grp', 'VARCHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$bp_alc_grp', 'VARCHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$ctg_alc_grp', 'VARCHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$itm_alc_grp', 'VARCHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$alc_ptn', 'VARCHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$expns_ac', 'VARCHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$type_is_table_col('mgpa_alc_ptn$expns_rule', 'VARCHAR', 'VARCHAR') ;

	PERFORM fcpa_postgres_util$set_var('mgpa_alc_ptn', 'g_mst_cnt', 0) ;

	TRUNCATE TABLE mgpa_alc_ptn$dpt_alc_grp ;
	TRUNCATE TABLE mgpa_alc_ptn$loc_alc_grp ;
	TRUNCATE TABLE mgpa_alc_ptn$oper_alc_grp ;
	TRUNCATE TABLE mgpa_alc_ptn$bp_alc_grp ;
	TRUNCATE TABLE mgpa_alc_ptn$ctg_alc_grp ;
	TRUNCATE TABLE mgpa_alc_ptn$itm_alc_grp ;
	TRUNCATE TABLE mgpa_alc_ptn$alc_ptn ;
	TRUNCATE TABLE mgpa_alc_ptn$expns_ac ;
	TRUNCATE TABLE mgpa_alc_ptn$expns_rule ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_alc_ptn$p_set_work (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる配賦パタン選択マスタのデータを作成する
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_term
		期
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_itm_dlm	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','ITM_DLM') ;

	l_concat_itm	VARCHAR(60) ;
	l_calc_grp	mam_calc_grp%ROWTYPE ;

	ctg_list CURSOR FOR
		SELECT	w.calc_ctg_cd
		FROM	mgw_calc_ctg w
		WHERE	0=0
		ORDER BY w.ctg_prio, w.calc_ctg_cd
	;

	sql$rowcount	BIGINT ;
	w1	RECORD ;
	w2	RECORD ;
	w3	RECORD ;
	w4	RECORD ;
	w5	RECORD ;
	w6	RECORD ;
	w7	RECORD ;
	w8	RECORD ;
	w9	RECORD ;
BEGIN

	<<SKIP_ALC_GRP>>
	BEGIN
		CALL mgpa_alc_ptn$p_ini() ;

		DELETE FROM maw_grp_wg_key ;
		l_calc_grp := mgpa_calc_grp$f_get_rec(i_calc_grp_cd) ;
		IF l_calc_grp.runtime_wg_cd IS NULL THEN
			INSERT INTO maw_grp_wg_key
			SELECT	m.calc_grp_cd, m.wg_cd
			FROM	mam_grp_wg m
			WHERE	m.calc_grp_cd = i_calc_grp_cd
			;
		ELSE
			INSERT INTO maw_grp_wg_key VALUES (i_calc_grp_cd, l_calc_grp.runtime_wg_cd) ;
		END IF ;

		DELETE FROM mgw_alc_ptn_sel ;
		CALL mgpa_calc_ctg$p_set_work(i_calc_grp_cd, fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ALC_PTN_SEL')) ;
		FOR l1 IN ctg_list LOOP
			INSERT INTO mgw_alc_ptn_sel (
				alc_ac_cd,
				dpt_alc_grp,
				loc_alc_grp,
				oper_alc_grp,
				bp_alc_grp,
				ctg_alc_grp,
				itm_alc_grp,
				wg_cd,
				alc_ptn_cd,
				expns_cd
				)
			SELECT
				m.alc_ac_cd,
				COALESCE(m.dpt_alc_grp, c_null_val),
				COALESCE(m.loc_alc_grp, c_null_val),
				COALESCE(m.oper_alc_grp, c_null_val),
				COALESCE(m.bp_alc_grp, c_null_val),
				COALESCE(m.ctg_alc_grp, c_null_val),
				COALESCE(m.itm_alc_grp, c_null_val),
				m.wg_cd,
				m.alc_ptn_cd,
				m.expns_cd
			FROM	mam_alc_ptn_sel m, maw_grp_wg_key m2
			WHERE	0=0
			AND	m.term = i_term
			AND	m.calc_ctg_cd = l1.calc_ctg_cd
			AND	m2.calc_grp_cd = i_calc_grp_cd
			AND	m.wg_cd = m2.wg_cd
			AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgw_alc_ptn_sel w
					WHERE	0=0
					AND	w.alc_ac_cd = m.alc_ac_cd
					AND	w.dpt_alc_grp = COALESCE(m.dpt_alc_grp, c_null_val)
					AND	w.loc_alc_grp = COALESCE(m.loc_alc_grp, c_null_val)
					AND	w.oper_alc_grp = COALESCE(m.oper_alc_grp, c_null_val)
					AND	w.bp_alc_grp = COALESCE(m.bp_alc_grp, c_null_val)
					AND	w.ctg_alc_grp = COALESCE(m.ctg_alc_grp, c_null_val)
					AND	w.itm_alc_grp = COALESCE(m.itm_alc_grp, c_null_val)
					AND	w.wg_cd = m.wg_cd
				)
			;
			GET DIAGNOSTICS sql$rowcount = ROW_COUNT ;
			PERFORM fcpa_postgres_util$set_var('mgpa_alc_ptn', 'g_mst_cnt', fcpa_postgres_util$get_var('mgpa_alc_ptn', 'g_mst_cnt')::NUMERIC + sql$rowcount) ;
		END LOOP ;
		CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGW_ALC_PTN_SEL', fcpa_postgres_util$get_var('mgpa_alc_ptn', 'g_mst_cnt')::VARCHAR) ;

		IF fcpa_postgres_util$get_var('mgpa_alc_ptn', 'g_mst_cnt')::NUMERIC = 0 THEN
			EXIT SKIP_ALC_GRP ;
		END IF ;

		FOR w1 IN
			SELECT
				m.dpt_cd,
				m.dpt_alc_grp
			FROM	mam_cost_dpt m
			WHERE	0=0
			AND	m.term = i_term
			AND	m.del_flg = '0'
			AND	m.dpt_alc_grp IS NOT NULL
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_alc_ptn_sel w
					WHERE	0=0
					AND	w.dpt_alc_grp = m.dpt_alc_grp
				)
		LOOP
			INSERT INTO mgpa_alc_ptn$dpt_alc_grp (_elem_, _index_) VALUES (w1.dpt_alc_grp, w1.dpt_cd) ;
		END LOOP ;

		FOR w2 IN
			SELECT
				m.loc_cd,
				m.loc_alc_grp
			FROM	mam_loc m
			WHERE	0=0
			AND	m.del_flg = '0'
			AND	m.loc_alc_grp IS NOT NULL
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_alc_ptn_sel w
					WHERE	0=0
					AND	w.loc_alc_grp = m.loc_alc_grp
				)
		LOOP
			INSERT INTO mgpa_alc_ptn$loc_alc_grp (_elem_, _index_) VALUES (w2.loc_alc_grp, w2.loc_cd) ;
		END LOOP ;

		FOR w3 IN
			SELECT
				m.oper_cd,
				m.oper_alc_grp
			FROM	mam_oper m
			WHERE	0=0
			AND	m.del_flg = '0'
			AND	m.oper_alc_grp IS NOT NULL
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_alc_ptn_sel w
					WHERE	0=0
					AND	w.oper_alc_grp = m.oper_alc_grp
				)
		LOOP
			INSERT INTO mgpa_alc_ptn$oper_alc_grp (_elem_, _index_) VALUES (w3.oper_alc_grp, w3.oper_cd) ;
		END LOOP ;

		FOR w4 IN
			SELECT
				m.bp_cd,
				m.bp_alc_grp
			FROM	mam_bp m
			WHERE	0=0
			AND	m.del_flg = '0'
			AND	m.bp_alc_grp IS NOT NULL
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_alc_ptn_sel w
					WHERE	0=0
					AND	w.bp_alc_grp = m.bp_alc_grp
				)
		LOOP
			INSERT INTO mgpa_alc_ptn$bp_alc_grp (_elem_, _index_) VALUES (w4.bp_alc_grp, w4.bp_cd) ;
		END LOOP ;

		FOR w5 IN
			SELECT
				m.ctg_cd,
				m.ctg_alc_grp
			FROM	mam_cost_ctg m
			WHERE	0=0
			AND	m.del_flg = '0'
			AND	m.ctg_alc_grp IS NOT NULL
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_alc_ptn_sel w
					WHERE	0=0
					AND	w.ctg_alc_grp = m.ctg_alc_grp
				)
		LOOP
			INSERT INTO mgpa_alc_ptn$ctg_alc_grp (_elem_, _index_) VALUES (w5.ctg_alc_grp, w5.ctg_cd) ;
		END LOOP ;

		FOR w6 IN
			SELECT
				m.itm_cd,
				m.itm_sub1,
				m.itm_sub2,
				m.itm_sub3,
				m.itm_alc_grp
			FROM	mam_itm m
			WHERE	0=0
			AND	m.itm_alc_grp IS NOT NULL
			AND	EXISTS (
					SELECT	'X'
					FROM	mgw_alc_ptn_sel w
					WHERE	0=0
					AND	w.itm_alc_grp = m.itm_alc_grp
				)
		LOOP
			l_concat_itm := CONCAT_WS(c_itm_dlm, w6.itm_cd, w6.itm_sub1, w6.itm_sub2, w6.itm_sub3) ;
			INSERT INTO mgpa_alc_ptn$itm_alc_grp (_elem_, _index_) VALUES (w6.itm_alc_grp, l_concat_itm) ;
		END LOOP ;
	END ;


	FOR w7 IN
		SELECT
			m.alc_ac_cd,
			m.alc_ptn_cd
		FROM	mam_alc_ac m
		WHERE	0=0
		AND	m.del_flg = '0'
		AND	m.alc_ptn_cd IS NOT NULL
	LOOP
		INSERT INTO mgpa_alc_ptn$alc_ptn (_elem_, _index_) VALUES (w7.alc_ptn_cd, w7.alc_ac_cd) ;
	END LOOP ;

	FOR w8 IN
		SELECT
			m.alc_ac_cd,
			m.expns_cd
		FROM	mam_alc_ac m
		WHERE	0=0
			AND	m.del_flg = '0'
			AND	m.expns_cd IS NOT NULL
	LOOP
		INSERT INTO mgpa_alc_ptn$expns_ac (_elem_, _index_) VALUES (w8.expns_cd, w8.alc_ac_cd) ;
	END LOOP ;

	FOR w9 IN
		SELECT
			m.alc_ptn_cd,
			m.expns_cd
		FROM	mam_alc_rule m
		WHERE	0=0
		AND	m.term = i_term
		AND	m.del_flg = '0'
		AND	m.expns_cd IS NOT NULL
	LOOP
		INSERT INTO mgpa_alc_ptn$expns_rule (_elem_, _index_) VALUES (w9.expns_cd, w9.alc_ptn_cd) ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_alc_ptn$p_get_alc_ptn_expns (
	 IN i_alc_ac_cd VARCHAR,
	 IN i_dpt_cd VARCHAR,
	 IN i_loc_cd VARCHAR,
	 IN i_oper_cd VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_ctg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_wg_cd VARCHAR,
	 INOUT o_alc_ptn_cd VARCHAR,
	 INOUT o_expns_cd VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	使用する配賦パタンＣＤと費目ＣＤを取得する
<REMARKS>

<ARGUMENTS>
<IN>	i_alc_ac_cd
		配賦科目ＣＤ
<IN>	i_dpt_cd
		部門ＣＤ
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_oper_cd
		工程ＣＤ
<IN>	i_bp_cd
		取引先ｃｄ
<IN>	i_ctg_cd
		品群ＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_wg_cd
		ワーキンググループＣＤ
<OUT>	o_alc_ptn_cd
		対象となる配賦パタンＣＤ
<OUT>	o_expns_cd
		対象となる費目ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_itm_dlm		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','ITM_DLM') ;

	l_concat_itm	VARCHAR(60) ;
	l_dpt_alc_grp	mam_alc_ptn_sel.dpt_alc_grp%TYPE ;
	l_loc_alc_grp	mam_alc_ptn_sel.loc_alc_grp%TYPE ;
	l_oper_alc_grp	mam_alc_ptn_sel.oper_alc_grp%TYPE ;
	l_bp_alc_grp	mam_alc_ptn_sel.bp_alc_grp%TYPE ;
	l_ctg_alc_grp	mam_alc_ptn_sel.ctg_alc_grp%TYPE ;
	l_itm_alc_grp	mam_alc_ptn_sel.itm_alc_grp%TYPE ;
	x	RECORD ;
BEGIN

	<<SKIP_ALC_PTN_SEL>>
	BEGIN
		o_alc_ptn_cd := NULL ;
		o_expns_cd := NULL ;

		IF fcpa_postgres_util$get_var('mgpa_alc_ptn', 'g_mst_cnt')::NUMERIC = 0 THEN
			EXIT SKIP_ALC_PTN_SEL ;
		END IF ;

		IF i_dpt_cd IS NOT NULL AND (SELECT COUNT(*) FROM mgpa_alc_ptn$dpt_alc_grp WHERE _index_ = i_dpt_cd) > 0 THEN
			SELECT	_elem_ INTO STRICT l_dpt_alc_grp 
			FROM	mgpa_alc_ptn$dpt_alc_grp
			WHERE	_index_ = i_dpt_cd ;
		ELSE
			l_dpt_alc_grp := c_null_val ;
		END IF ;

		IF i_loc_cd IS NOT NULL AND (SELECT COUNT(*) FROM mgpa_alc_ptn$loc_alc_grp WHERE _index_ = i_loc_cd) > 0 THEN
			SELECT	_elem_ INTO STRICT l_loc_alc_grp
			FROM	mgpa_alc_ptn$loc_alc_grp
			WHERE	_index_ = i_loc_cd ;
		ELSE
			l_loc_alc_grp := c_null_val ;
		END IF ;

		IF i_oper_cd IS NOT NULL AND (SELECT COUNT(*) FROM mgpa_alc_ptn$oper_alc_grp WHERE _index_ = i_oper_cd) > 0 THEN
			SELECT	_elem_ INTO STRICT l_oper_alc_grp
			FROM	mgpa_alc_ptn$oper_alc_grp
			WHERE	_index_ = i_oper_cd ;
		ELSE
			l_oper_alc_grp := c_null_val ;
		END IF ;

		IF i_bp_cd IS NOT NULL AND (SELECT COUNT(*) FROM mgpa_alc_ptn$bp_alc_grp WHERE _index_ = i_bp_cd) > 0 THEN
			SELECT	_elem_ INTO STRICT l_bp_alc_grp
			FROM	mgpa_alc_ptn$bp_alc_grp
			WHERE	_index_ = i_bp_cd ;
		ELSE
			l_bp_alc_grp := c_null_val ;
		END IF ;

		IF i_ctg_cd IS NOT NULL AND (SELECT COUNT(*) FROM mgpa_alc_ptn$ctg_alc_grp WHERE _index_ = i_ctg_cd) > 0 THEN
			SELECT	_elem_ INTO STRICT l_ctg_alc_grp
			FROM	mgpa_alc_ptn$ctg_alc_grp
			WHERE	_index_ = i_ctg_cd ;
		ELSE
			l_ctg_alc_grp := c_null_val ;
		END IF ;

		IF i_itm_cd IS NOT NULL AND i_itm_sub1 IS NOT NULL AND i_itm_sub2 IS NOT NULL AND i_itm_sub3 IS NOT NULL THEN
			l_concat_itm := CONCAT_WS(c_itm_dlm, i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3) ;
			IF (SELECT COUNT(*) FROM mgpa_alc_ptn$itm_alc_grp WHERE _index_ = l_concat_itm) > 0 THEN
				SELECT	_elem_ INTO STRICT l_itm_alc_grp
				FROM	mgpa_alc_ptn$itm_alc_grp
				WHERE	_index_ = l_concat_itm ;
			ELSE
				l_itm_alc_grp := c_null_val ;
			END IF ;
		ELSE
			l_itm_alc_grp := c_null_val ;
		END IF ;

		FOR x IN
			SELECT
				w.alc_ptn_cd,
				w.expns_cd
			FROM	mgw_alc_ptn_sel w
			WHERE	0=0
			AND	w.alc_ac_cd = i_alc_ac_cd
			AND	(w.dpt_alc_grp = l_dpt_alc_grp OR w.dpt_alc_grp = c_null_val)
			AND	(w.loc_alc_grp = l_loc_alc_grp OR w.loc_alc_grp = c_null_val)
			AND	(w.oper_alc_grp = l_oper_alc_grp OR w.oper_alc_grp = c_null_val)
			AND	(w.bp_alc_grp = l_bp_alc_grp OR w.bp_alc_grp = c_null_val)
			AND	(w.ctg_alc_grp = l_ctg_alc_grp OR w.ctg_alc_grp = c_null_val)
			AND	(w.itm_alc_grp = l_itm_alc_grp OR w.itm_alc_grp = c_null_val)
			AND	w.wg_cd = i_wg_cd
			ORDER BY
				CASE w.dpt_alc_grp WHEN c_null_val THEN NULL ELSE w.dpt_alc_grp END,
				CASE w.loc_alc_grp WHEN c_null_val THEN NULL ELSE w.loc_alc_grp END,
				CASE w.oper_alc_grp WHEN c_null_val THEN NULL ELSE w.oper_alc_grp END,
				CASE w.bp_alc_grp WHEN c_null_val THEN NULL ELSE w.bp_alc_grp END,
				CASE w.ctg_alc_grp WHEN c_null_val THEN NULL ELSE w.ctg_alc_grp END,
				CASE w.itm_alc_grp WHEN c_null_val THEN NULL ELSE w.itm_alc_grp END
		LOOP
			o_alc_ptn_cd := x.alc_ptn_cd ;
			o_expns_cd := x.expns_cd ;
			EXIT ;
		END LOOP ;

	END ;

	IF o_alc_ptn_cd IS NULL AND (SELECT COUNT(*) FROM mgpa_alc_ptn$alc_ptn WHERE _index_ = i_alc_ac_cd) > 0 THEN
		SELECT _elem_ INTO STRICT o_alc_ptn_cd FROM mgpa_alc_ptn$alc_ptn WHERE _index_ = i_alc_ac_cd ;
	END IF ;

	IF o_expns_cd IS NULL THEN
		IF (SELECT COUNT(*) FROM mgpa_alc_ptn$expns_ac WHERE _index_ = i_alc_ac_cd) > 0 THEN
			SELECT	_elem_ INTO STRICT o_expns_cd
			FROM	mgpa_alc_ptn$expns_ac
			WHERE	_index_ = i_alc_ac_cd ;
		ELSIF o_alc_ptn_cd IS NOT NULL AND (SELECT COUNT(*) FROM mgpa_alc_ptn$expns_rule WHERE _index_ = o_alc_ptn_cd) > 0 THEN
			SELECT	_elem_ INTO STRICT o_expns_cd
			FROM	mgpa_alc_ptn$expns_rule
			WHERE	_index_ = o_alc_ptn_cd ;
		END IF ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;

