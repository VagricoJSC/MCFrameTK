CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_get_parm (
	INOUT o_usr VARCHAR,
	INOUT o_parm_itm_sub_typ VARCHAR,
	INOUT o_co_parm mam_co_parm,
	INOUT o_fix_dpt VARCHAR,
	INOUT o_bcur_cd VARCHAR,
	INOUT o_sno1_use_typ VARCHAR,
	INOUT o_sno2_use_typ VARCHAR,
	INOUT o_sno3_use_typ VARCHAR,
	INOUT o_sno4_use_typ VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		原価会社パラメータマスタなどからパラメータを取得する
<REMARKS>
		原価会社パラメータマスタなどからパラメータを取得する
<ARGUMENTS>
<INOUT>	O_USR
		ユーザＩＤ
<INOUT>	O_PARM_ITM_SUB_TYP

<INOUT>	O_CO_PARM

<INOUT>	O_FIX_DPT

<INOUT>	O_BCUR_CD

<INOUT>	O_SNO1_USE_TYP

<INOUT>	O_SNO2_USE_TYP

<INOUT>	O_SNO3_USE_TYP

<INOUT>	O_SNO4_USE_TYP

<HISTORY>
**************************************************************************/
DECLARE
	c_ps_use_mfgsls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP', 'PRODSLS') ; /* 生産・販売データで使用する */
BEGIN
	/* パラメータの取得 */
	o_usr := COALESCE(fcpa_context$f_get_userid(), fcpa_context$f_get_os_usr()) ;
	o_parm_itm_sub_typ := mapa_comm$f_get_parm('ITM_SUB_TYP') ;
	o_bcur_cd := mapa_xchng$f_get_base_cur_cd() ;

	o_co_parm := mgpa_co_parm$f_get_rec() ;
	o_fix_dpt := o_co_parm.fix_dpt_cd ;
	o_sno1_use_typ := COALESCE(o_co_parm.sno1_use_typ, c_ps_use_mfgsls) ;
	o_sno2_use_typ := COALESCE(o_co_parm.sno2_use_typ, c_ps_use_mfgsls) ;
	o_sno3_use_typ := COALESCE(o_co_parm.sno3_use_typ, c_ps_use_mfgsls) ;
	o_sno4_use_typ := COALESCE(o_co_parm.sno4_use_typ, c_ps_use_mfgsls) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_sim_chk (
	IN i_sim_mrp_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	シミュレーションＮＯの存在チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_sim_mrp_typ_gp_sim CONSTANT VARCHAR := '1' ;	--汎用シミュレーション

	l_cnt NUMERIC ;
	l_bind VARCHAR[] ;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgvt_mst_sim_mrp t
	WHERE	0=0
	AND t.sim_mrp_no = i_sim_mrp_no
	AND t.sim_mrp_typ = c_sim_mrp_typ_gp_sim
	;

	IF l_cnt = 0 THEN
		l_bind := fcpa_err$msg_binder(i_sim_mrp_no) ;
		CALL fcpa_err$raise_app_err('MGBAD0001', l_bind) ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_ins_mgw_sls (
	IN i_calc_ctg_cd VARCHAR,
	IN i_ym_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_pln_imp_typ VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		売上計画用
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL') ;
	c_asst_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP', 'CO_SLS') ; /* 自社(販売) */
	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */

	c_mly_spln_amt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLS_PLN_IMP_TYP', 'MLY_SPLN_AMT') ;
	c_mly_spln CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLS_PLN_IMP_TYP', 'MLY_SPLN') ;

	l_usr fcm_user.user_id%TYPE ;
	l_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE ;
	l_co_parm mam_co_parm%ROWTYPE ;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE ;
	l_bcur_cd mam_cur.cur_cd%TYPE ;
	l_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE ;
	l_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE ;
	l_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE ;
	l_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE ;

	rec_dpt mam_dpt[] ;

	l_tmp_ym TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dpt_cd mam_cost_dpt.dpt_cd%TYPE ;
	l_sls_dpt_cd mam_cost_dpt.dpt_cd%TYPE ;

	w INTEGER := 0 ;
	x RECORD ;

BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_pln$p_ins_mgw_sls$rec_w', 'mgw_imp_pln_sls', 'integer') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_PLN.P_INS_MGW_SLS') ;

	/* パラメータの取得 */
	CALL mgpa_imp_pln$p_get_parm(l_usr, l_parm_itm_sub_typ, l_co_parm, l_fix_dpt, l_bcur_cd, l_sno1_use_typ, l_sno2_use_typ, l_sno3_use_typ, l_sno4_use_typ) ;

	DELETE FROM	mgw_imp_pln_sls t
	WHERE	0=0
	AND t.calc_ctg_cd = i_calc_ctg_cd
	AND t.ym BETWEEN i_ym_fr AND i_ym_to
	AND EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND t.wg_cd = w.wg_cd
		)
	;

	rec_dpt := '{}' ;
	l_tmp_ym := NULL ;
	w := 0 ;

	FOR x IN
		SELECT
			t.ym,
			m2.wg_cd,
			t.dpt_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.cst_cd,
			t.sls_dpt_cd,
			t.sls_usr_cd,
			t.cur_cd,
			m1.unit_cd,
			SUM(t.qty) AS qty,
			SUM(t.amt) AS amt
		FROM	(
			SELECT
				t.spln_ym AS ym,
				t.dpt_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.cst_cd,
				t.dpt_cd AS sls_dpt_cd,
				NULL AS sls_usr_cd,
				t.spln_qty AS qty,
				t.cur_cd,
				t.spln_amt AS amt
			FROM	mgvt_mst_spln_sum_itm_new t
			WHERE	0=0
			AND t.spln_ym BETWEEN i_ym_fr AND i_ym_to
			AND t.spln_qty <> 0
			AND i_pln_imp_typ = c_mly_spln_amt
			UNION ALL
			SELECT
				t.spln_ym AS ym,
				t.dpt_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.cst_cd,
				t.dpt_cd AS sls_dpt_cd,
				NULL AS sls_usr_cd,
				t.spln_qty AS qty,
				NULL AS cur_cd,
				NULL AS amt
			FROM	mgvt_mst_spln_sum_itm_new t
			WHERE	0=0
			AND t.spln_ym BETWEEN i_ym_fr AND i_ym_to
			AND t.spln_qty <> 0
			AND i_pln_imp_typ = c_mly_spln
			) t,
			mam_itm m1, mam_dpt m2
		WHERE	0=0
		AND t.itm_cd = m1.itm_cd
		AND t.itm_sub1 = m1.itm_sub1
		AND t.itm_sub2 = m1.itm_sub2
		AND t.itm_sub3 = m1.itm_sub3
		AND t.dpt_cd = m2.dpt_cd
		AND t.ym between m2.st_dt AND m2.end_dt
		AND m2.del_flg = c_off
		AND EXISTS (
				SELECT	'X'
				FROM	mgw_wg w
				WHERE	0=0
				AND m2.wg_cd = w.wg_cd
			)
		GROUP BY t.ym, m2.wg_cd,
			t.dpt_cd,
			t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.cst_cd, t.sls_dpt_cd, t.sls_usr_cd, t.cur_cd,
			m1.unit_cd
		ORDER BY t.ym
	LOOP
		/* 部門の変換 */
		<<NEXT_LOOP_ERR>>
		BEGIN
			IF l_tmp_ym IS NULL OR l_tmp_ym <> x.ym THEN
				rec_dpt := '{}' ;
				l_tmp_ym := x.ym ;
			END IF ;

			CALL mgpa_cost_if$p_get_dpt(x.dpt_cd, l_fix_dpt, x.ym, rec_dpt, l_dpt_cd, c_off) ;
			IF l_dpt_cd IS NULL THEN
				EXIT NEXT_LOOP_ERR ;
			END IF ;

			IF x.sls_dpt_cd IS NOT NULL THEN
				CALL mgpa_cost_if$p_get_dpt(x.sls_dpt_cd, NULL, x.ym, rec_dpt, l_sls_dpt_cd, c_off) ;
				IF l_sls_dpt_cd IS NULL THEN
					EXIT NEXT_LOOP_ERR ;
				END IF ;
			END IF ;

			w := w + 1 ;

			INSERT INTO mgpa_imp_pln$p_ins_mgw_sls$rec_w (
				calc_ctg_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
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
				asst_typ,
				_index_
				)
			VALUES (
				i_calc_ctg_cd,
				x.wg_cd,
				x.ym,
				l_dpt_cd,
				x.itm_cd,
				x.itm_sub1,
				x.itm_sub2,
				x.itm_sub3,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_asst_sls,
				w
				)
			;

			IF x.cst_cd = c_null_val THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_sls$rec_w SET cst_cd = NULL WHERE _index_ = w ;
			ELSE
				UPDATE mgpa_imp_pln$p_ins_mgw_sls$rec_w SET cst_cd = x.cst_cd WHERE _index_ = w ;
			END IF ;

			UPDATE mgpa_imp_pln$p_ins_mgw_sls$rec_w SET
				dlv_cd = NULL,
				sls_dpt_cd = l_sls_dpt_cd,
				sls_usr_cd = x.sls_usr_cd,
				alc_dpt_cd = l_sls_dpt_cd,
				dest_cd1 = NULL,
				dest_cd2 = NULL,
				dest_cd3 = NULL,
				cost_sls_cd1 = NULL,
				cost_sls_cd2 = NULL,
				cost_sls_cd3 = NULL,
				cost_sls_cd4 = NULL,
				cost_sls_cd5 = NULL,
				unit_cd = x.unit_cd,
				qty = x.qty,
				cur_cd = x.cur_cd,
				amt = x.amt,
				rmrks = NULL,
				sub_char1 = NULL,
				sub_char2 = NULL,
				sub_char3 = NULL,
				imp_err_flg = c_off,
				imp_flg = c_on
			WHERE 0=0
			AND _index_ = w
			;

			IF w > c_max_cnt THEN
				INSERT INTO mgw_imp_pln_sls (
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					asst_typ,
					cst_cd,
					dlv_cd,
					sls_dpt_cd,
					sls_usr_cd,
					alc_dpt_cd,
					dest_cd1,
					dest_cd2,
					dest_cd3,
					cost_sls_cd1,
					cost_sls_cd2,
					cost_sls_cd3,
					cost_sls_cd4,
					cost_sls_cd5,
					unit_cd,
					qty,
					cur_cd,
					amt,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					imp_err_flg,
					imp_flg
					)
				SELECT
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					asst_typ,
					cst_cd,
					dlv_cd,
					sls_dpt_cd,
					sls_usr_cd,
					alc_dpt_cd,
					dest_cd1,
					dest_cd2,
					dest_cd3,
					cost_sls_cd1,
					cost_sls_cd2,
					cost_sls_cd3,
					cost_sls_cd4,
					cost_sls_cd5,
					unit_cd,
					qty,
					cur_cd,
					amt,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					imp_err_flg,
					imp_flg
				FROM
					mgpa_imp_pln$p_ins_mgw_sls$rec_w
				;

				TRUNCATE TABLE mgpa_imp_pln$p_ins_mgw_sls$rec_w ;
				w := 0 ;
			END IF ;

		END ;
	END LOOP ;

	IF w > 0 THEN
		INSERT INTO mgw_imp_pln_sls (
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			asst_typ,
			cst_cd,
			dlv_cd,
			sls_dpt_cd,
			sls_usr_cd,
			alc_dpt_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			cost_sls_cd1,
			cost_sls_cd2,
			cost_sls_cd3,
			cost_sls_cd4,
			cost_sls_cd5,
			unit_cd,
			qty,
			cur_cd,
			amt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			imp_err_flg,
			imp_flg
			)
		SELECT
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			asst_typ,
			cst_cd,
			dlv_cd,
			sls_dpt_cd,
			sls_usr_cd,
			alc_dpt_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			cost_sls_cd1,
			cost_sls_cd2,
			cost_sls_cd3,
			cost_sls_cd4,
			cost_sls_cd5,
			unit_cd,
			qty,
			cur_cd,
			amt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			imp_err_flg,
			imp_flg
		FROM
			mgpa_imp_pln$p_ins_mgw_sls$rec_w
		;

		TRUNCATE TABLE mgpa_imp_pln$p_ins_mgw_sls$rec_w ;
		w := 0 ;
	END IF ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_PLN.P_INS_MGW_SLS') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_ins_mgw_rqmt (
	IN i_calc_ctg_cd VARCHAR,
	IN i_ym_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_pln_imp_typ VARCHAR,
	IN i_sim_mrp_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		月次計画用
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL') ;
	c_asst_mfg CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP', 'CO_PROD') ; /* 自社(生産) */
	c_act_set_non CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP', 'NON') ; /* 対象外 */
	c_ps_use_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP', 'SLS') ; /* 販売データのみ使用する */
	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */

	c_sim_rqmt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RQMT_PLN_IMP_TYP', 'SIM_RQMT') ;
	c_mly_rqmt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RQMT_PLN_IMP_TYP', 'MLY_RQMT') ;
	c_rqmt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RQMT_PLN_IMP_TYP', 'RQMT') ;
	c_dmnd_rqmt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RQMT_PLN_IMP_TYP', 'DMND_RQMT') ;
	c_prcd_rqmt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RQMT_PLN_IMP_TYP', 'PRCD_RQMT') ;
	c_dmnd_use CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROD_PLN_TYP', 'DMND_USE') ;
	c_dmnd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RQMT_PLN_IMP_TYP', 'DMND') ;

	l_usr fcm_user.user_id%TYPE ;
	l_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE ;
	l_co_parm mam_co_parm%ROWTYPE ;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE ;
	l_bcur_cd mam_cur.cur_cd%TYPE ;
	l_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE ;
	l_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE ;
	l_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE ;
	l_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE ;

	rec_dpt mam_dpt[] ;

	l_tmp_dt TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dpt_cd mam_cost_dpt.dpt_cd%TYPE ;
	l_sls_dpt_cd mam_cost_dpt.dpt_cd%TYPE ;

	l_ym_to mam_term.term%TYPE ;

	w INTEGER := 0 ;
	x RECORD ;

BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_pln$p_ins_mgw_rqmt$rec_w', 'mgw_imp_pln_rqmt', 'integer') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_PLN.P_INS_MGW_RQMT') ;

	/* パラメータの取得 */
	CALL mgpa_imp_pln$p_get_parm(l_usr, l_parm_itm_sub_typ, l_co_parm, l_fix_dpt, l_bcur_cd, l_sno1_use_typ, l_sno2_use_typ, l_sno3_use_typ, l_sno4_use_typ) ;

	IF i_pln_imp_typ = c_sim_rqmt THEN
		CALL mgpa_imp_pln$p_sim_chk(i_sim_mrp_no) ;
	END IF ;

	DELETE FROM	mgw_imp_pln_rqmt t
	WHERE	0=0
	AND t.calc_ctg_cd = i_calc_ctg_cd
	AND t.ym BETWEEN i_ym_fr AND i_ym_to
	AND EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND t.wg_cd = w.wg_cd
		)
	;

	rec_dpt := '{}' ;
	l_ym_to := fcpa_postgres_util$add_months(i_ym_to, 1) ;
	l_tmp_dt := NULL ;
	w := 0 ;

	FOR x IN
		SELECT
			t.wg_cd,
			t.ym,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.dpt_cd,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			SUM(t.qty) AS qty,
			m1.unit_cd,
			COALESCE(m2.sno1_act_typ, c_act_set_non) AS sno1_act_typ,
			COALESCE(m2.sno2_act_typ, c_act_set_non) AS sno2_act_typ,
			COALESCE(m2.sno3_act_typ, c_act_set_non) AS sno3_act_typ,
			COALESCE(m2.sno4_act_typ, c_act_set_non) AS sno4_act_typ
		FROM	(
			SELECT
				t.wg_cd,
				t.prod_ym AS ym,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				mapa_loc$f_get_asst_dpt_cd_ne(t.strg_loc_cd, prod_ym, c_on) AS dpt_cd,
				c_null_val AS sno1,
				c_null_val AS sno2,
				c_null_val AS sno3,
				c_null_val AS sno4,
				t.qty
			FROM	mgvt_mst_mly_rqmt t
			WHERE	0=0
			AND t.ym = (
				SELECT	MAX(w.ym)
				FROM	mgvt_mst_mly_rqmt w
				WHERE	0=0
				AND t.prod_ym = w.prod_ym
				AND t.itm_cd = w.itm_cd
				AND t.itm_sub1 = w.itm_sub1
				AND t.itm_sub2 = w.itm_sub2
				AND t.itm_sub3 = w.itm_sub3
				AND t.strg_loc_cd = w.strg_loc_cd
				)
			AND t.prod_ym BETWEEN i_ym_fr AND i_ym_to
			AND t.qty <> 0
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ = c_mly_rqmt
			UNION ALL
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.due_dt) AS ym,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				mapa_loc$f_get_asst_dpt_cd_ne(t.strg_loc_cd, due_dt, c_on) AS dpt_cd,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.rqmt_qty AS qty
			FROM	mgvt_mst_rqmt t
			WHERE	0=0
			AND t.due_dt >= i_ym_fr
			AND t.due_dt < l_ym_to
			AND t.rqmt_qty <> 0
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ IN (c_rqmt, c_dmnd_rqmt, c_prcd_rqmt)
			UNION ALL
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.dmnd_dt) AS ym,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				mapa_loc$f_get_asst_dpt_cd_ne(t.dmnd_loc_cd, dmnd_dt, c_on) AS dpt_cd,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.dmnd_qty AS qty
			FROM	mgvt_mst_dly_dmnd t
				LEFT OUTER JOIN mavm_itm_wg m
					ON (t.itm_cd = m.itm_cd
					AND t.itm_sub1 = m.itm_sub1
					AND t.itm_sub2 = m.itm_sub2
					AND t.itm_sub3 = m.itm_sub3
					AND t.wg_cd = m.wg_cd)
			WHERE	0=0
			AND t.dmnd_dt >= i_ym_fr
			AND t.dmnd_dt < l_ym_to
			AND t.dmnd_qty <> 0
			AND m.prod_pln_typ = c_dmnd_use
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ IN (c_dmnd, c_dmnd_rqmt)
			UNION ALL
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.due_dt) AS ym,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				mapa_loc$f_get_asst_dpt_cd_ne(t.strg_loc_cd, due_dt, c_on) AS dpt_cd,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.rqmt_qty AS qty
			FROM	mgvt_mst_prcd_rqmt t
			WHERE	0=0
			AND t.due_dt >= i_ym_fr
			AND t.due_dt < l_ym_to
			AND t.rqmt_qty <> 0
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ = c_prcd_rqmt
			UNION ALL
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.due_dt) AS ym,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				mapa_loc$f_get_asst_dpt_cd_ne(t.strg_loc_cd, due_dt, c_on) AS dpt_cd,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.rqmt_qty AS qty
			FROM	mgvt_mst_sim_rqmt t
			WHERE	0=0
			AND t.due_dt >= i_ym_fr
			AND t.due_dt < l_ym_to
			AND t.sim_mrp_no = i_sim_mrp_no
			AND t.rqmt_qty <> 0
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ = c_sim_rqmt
			) t,
			mam_itm m1
			LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd AND m2.del_flg = c_off)
		WHERE	0=0
		AND t.itm_cd = m1.itm_cd
		AND t.itm_sub1 = m1.itm_sub1
		AND t.itm_sub2 = m1.itm_sub2
		AND t.itm_sub3 = m1.itm_sub3
		AND t.dpt_cd IS NOT NULL
		GROUP BY t.wg_cd, t.ym, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.dpt_cd,
			t.sno1, t.sno2, t.sno3, t.sno4, m1.unit_cd,
			m2.sno1_act_typ, m2.sno2_act_typ, m2.sno3_act_typ, m2.sno4_act_typ
		ORDER BY t.ym
	LOOP
		/* 部門の変換 */
		<<NEXT_LOOP_ERR>>
		BEGIN
			IF l_tmp_dt IS NULL OR l_tmp_dt <> x.ym THEN
				rec_dpt := '{}' ;
				l_tmp_dt := x.ym ;
			END IF ;

			CALL mgpa_cost_if$p_get_dpt(x.dpt_cd, l_fix_dpt, x.ym, rec_dpt, l_dpt_cd, c_off) ;
			IF l_dpt_cd IS NULL THEN
				EXIT NEXT_LOOP_ERR ;
			END IF ;

			w := w + 1 ;

			INSERT INTO mgpa_imp_pln$p_ins_mgw_rqmt$rec_w (
				calc_ctg_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
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
				asst_typ,
				unit_cd,
				qty,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3,
				imp_err_flg,
				imp_flg,
				_index_
				)
			VALUES (
				i_calc_ctg_cd,
				x.wg_cd,
				x.ym,
				l_dpt_cd,
				x.itm_cd,
				x.itm_sub1,
				x.itm_sub2,
				x.itm_sub3,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_asst_mfg,
				x.unit_cd,
				x.qty,
				NULL,
				NULL,
				NULL,
				NULL,
				c_off,
				c_on,
				w
				)
			;

			IF l_sno1_use_typ <> c_ps_use_sls AND x.sno1_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_rqmt$rec_w SET sno1 = x.sno1 WHERE _index_ = w ;
			END IF ;

			IF l_sno2_use_typ <> c_ps_use_sls AND x.sno2_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_rqmt$rec_w SET sno2 = x.sno2 WHERE _index_ = w ;
			END IF ;

			IF l_sno3_use_typ <> c_ps_use_sls AND x.sno3_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_rqmt$rec_w SET sno3 = x.sno3 WHERE _index_ = w ;
			END IF ;

			IF l_sno4_use_typ <> c_ps_use_sls AND x.sno4_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_rqmt$rec_w SET sno4 = x.sno4 WHERE _index_ = w ;
			END IF ;

			IF w > c_max_cnt THEN
				INSERT INTO mgw_imp_pln_rqmt (
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					asst_typ,
					unit_cd,
					qty,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					imp_err_flg,
					imp_flg
					)
				SELECT
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					asst_typ,
					unit_cd,
					qty,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					imp_err_flg,
					imp_flg
				FROM mgpa_imp_pln$p_ins_mgw_rqmt$rec_w ;
				TRUNCATE TABLE mgpa_imp_pln$p_ins_mgw_rqmt$rec_w
				;
				w := 0 ;
			END IF ;

		END ;
	END LOOP ;

	IF w > 0 THEN
		INSERT INTO mgw_imp_pln_rqmt (
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			asst_typ,
			unit_cd,
			qty,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			imp_err_flg,
			imp_flg
			)
		SELECT
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			asst_typ,
			unit_cd,
			qty,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			imp_err_flg,
			imp_flg
		FROM mgpa_imp_pln$p_ins_mgw_rqmt$rec_w
		;
		TRUNCATE TABLE mgpa_imp_pln$p_ins_mgw_rqmt$rec_w ;
		w := 0 ;
	END IF ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_PLN.P_INS_MGW_RQMT') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_ins_mgw_mfg (
	IN i_calc_ctg_cd VARCHAR,
	IN i_ym_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_pln_imp_typ VARCHAR,
	IN i_sim_mrp_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		製造計画用
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL') ;
	c_asst_mfg CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP', 'CO_PROD') ; /* 自社(生産) */
	c_act_set_non CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP', 'NON') ; /* 対象外 */
	c_ps_use_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP', 'SLS') ; /* 販売データのみ使用する */
	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */

	c_sim_itm_order CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_PLN_IMP_TYP', 'SIM_ITM_ORDER') ;
	c_itm_order CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_PLN_IMP_TYP', 'ITM_ORDER') ;
	c_prcd_itm_order CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_PLN_IMP_TYP', 'PRCD_ITM_ORDER') ;
	c_opn CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP', 'OPN') ;
	c_itm_ord_typ_mfg CONSTANT VARCHAR := '1' ;	--製造
	c_itm_ord_typ_outsrc CONSTANT VARCHAR := '3' ;	--外注
	c_ord_gnrt_typ_uplnd CONSTANT VARCHAR := '5' ;	--計画外

	l_usr fcm_user.user_id%TYPE ;
	l_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE ;
	l_co_parm mam_co_parm%ROWTYPE ;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE ;
	l_bcur_cd mam_cur.cur_cd%TYPE ;
	l_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE ;
	l_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE ;
	l_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE ;
	l_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE ;

	rec_dpt mam_dpt[] ;

	l_tmp_dt TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dpt_cd mam_cost_dpt.dpt_cd%TYPE ;
	l_sls_dpt_cd mam_cost_dpt.dpt_cd%TYPE ;

	l_ym_to mam_term.term%TYPE ;

	w INTEGER := 0 ;
	x RECORD ;

BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_pln$p_ins_mgw_mfg$rec_w', 'mgw_imp_pln_mfg', 'integer') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_PLN.P_INS_MGW_MFG') ;

	/* パラメータの取得 */
	CALL mgpa_imp_pln$p_get_parm(l_usr, l_parm_itm_sub_typ, l_co_parm, l_fix_dpt, l_bcur_cd, l_sno1_use_typ, l_sno2_use_typ, l_sno3_use_typ, l_sno4_use_typ) ;

	IF i_pln_imp_typ = c_sim_itm_order THEN
		CALL mgpa_imp_pln$p_sim_chk(i_sim_mrp_no) ;
	END IF ;

	DELETE FROM	mgw_imp_pln_mfg t
	WHERE	0=0
	AND t.calc_ctg_cd = i_calc_ctg_cd
	AND t.ym BETWEEN i_ym_fr AND i_ym_to
	AND EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND t.wg_cd = w.wg_cd
		)
	;

	rec_dpt := '{}' ;
	l_ym_to := fcpa_postgres_util$add_months(i_ym_to, 1) ;
	l_tmp_dt := NULL ;
	w := 0 ;

	FOR x IN
		SELECT
			t.wg_cd,
			t.ym,
			t.dt,
			t.dpt_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.loc_cd,
			SUM(t.qty) AS qty,
			m1.unit_cd,
			COALESCE(m2.sno1_act_typ, c_act_set_non) AS sno1_act_typ,
			COALESCE(m2.sno2_act_typ, c_act_set_non) AS sno2_act_typ,
			COALESCE(m2.sno3_act_typ, c_act_set_non) AS sno3_act_typ,
			COALESCE(m2.sno4_act_typ, c_act_set_non) AS sno4_act_typ
		FROM	(
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.strg_schd_dt) AS ym,
				t.strg_schd_dt AS dt,
				m.asst_dpt_cd AS dpt_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.mfg_loc_cd AS loc_cd,
				t.inst_qty AS qty
			FROM	mgvt_mst_itm_order t, mam_loc m
			WHERE	0=0
			AND t.mfg_loc_cd = m.loc_cd
			AND t.strg_schd_dt >= i_ym_fr
			AND t.strg_schd_dt < l_ym_to
			AND t.itm_ord_typ IN (c_itm_ord_typ_mfg, c_itm_ord_typ_outsrc)
			AND t.ord_gnrt_typ NOT IN (c_ord_gnrt_typ_uplnd)
			AND t.yield_schd_qty <> 0
			AND m.del_flg = c_off
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND (
				i_pln_imp_typ = c_itm_order
				OR
				i_pln_imp_typ = c_prcd_itm_order
				)
			UNION ALL
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.strg_schd_dt) AS ym,
				t.strg_schd_dt AS dt,
				m1.asst_dpt_cd AS dpt_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.mfg_loc_cd AS loc_cd,
				t.inst_qty AS qty
			FROM	mgvt_mst_prcd_itm_order t, mam_loc m1, mam_itm_dtl m2
			WHERE	0=0
			AND t.mfg_loc_cd = m1.loc_cd
			AND t.wg_cd = m2.wg_cd
			AND t.itm_cd = m2.itm_cd
			AND t.itm_sub1 = m2.itm_sub1
			AND t.itm_sub2 = m2.itm_sub2
			AND t.itm_sub3 = m2.itm_sub3
			AND t.mfg_loc_cd = m2.mfg_loc_cd
			AND t.master_dt >= m2.st_dt
			AND t.master_dt <= m2.end_dt
			AND t.strg_schd_dt >= i_ym_fr
			AND t.strg_schd_dt < l_ym_to
			AND t.itm_ord_typ IN (c_itm_ord_typ_mfg, c_itm_ord_typ_outsrc)
			AND t.ord_gnrt_typ NOT IN (c_ord_gnrt_typ_uplnd)
			AND t.yield_schd_qty <> 0
			AND m2.pre_po_tgt_flg = c_on
			AND m1.del_flg = c_off
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ = c_prcd_itm_order
			AND t.itm_ord_sts_typ = c_opn
			UNION ALL
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.strg_schd_dt) AS ym,
				t.strg_schd_dt AS dt,
				m.asst_dpt_cd AS dpt_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.mfg_loc_cd AS loc_cd,
				t.inst_qty AS qty
			FROM	mgvt_mst_sim_itm_order t, mam_loc m
			WHERE	0=0
			AND t.mfg_loc_cd = m.loc_cd
			AND t.strg_schd_dt >= i_ym_fr
			AND t.strg_schd_dt < l_ym_to
			AND t.itm_ord_typ IN (c_itm_ord_typ_mfg, c_itm_ord_typ_outsrc)
			AND t.ord_gnrt_typ NOT IN (c_ord_gnrt_typ_uplnd)
			AND t.sim_mrp_no = i_sim_mrp_no
			AND t.yield_schd_qty <> 0
			AND m.del_flg = c_off
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ = c_sim_itm_order
			) t,
			mam_itm m1
			LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd AND m2.del_flg = c_off)
		WHERE	0=0
		AND t.itm_cd = m1.itm_cd
		AND t.itm_sub1 = m1.itm_sub1
		AND t.itm_sub2 = m1.itm_sub2
		AND t.itm_sub3 = m1.itm_sub3
		AND t.dpt_cd IS NOT NULL
		GROUP BY t.wg_cd, t.ym, t.dt, t.dpt_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.sno1, t.sno2, t.sno3, t.sno4, t.loc_cd, m1.unit_cd,
			m2.sno1_act_typ, m2.sno2_act_typ, m2.sno3_act_typ, m2.sno4_act_typ
		ORDER BY t.dt
	LOOP
		/* 部門の変換 */
		<<NEXT_LOOP_ERR>>
		BEGIN
			IF l_tmp_dt IS NULL OR l_tmp_dt <> x.dt THEN
				rec_dpt := '{}' ;
				l_tmp_dt := x.dt ;
			END IF ;

			CALL mgpa_cost_if$p_get_dpt(x.dpt_cd, l_fix_dpt, x.ym, rec_dpt, l_dpt_cd, c_off) ;
			IF l_dpt_cd IS NULL THEN
				EXIT NEXT_LOOP_ERR ;
			END IF ;

			w := w + 1 ;

			INSERT INTO mgpa_imp_pln$p_ins_mgw_mfg$rec_w (
				calc_ctg_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
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
				loc_cd,
				str_ln_cd,
				asst_typ,
				unit_cd,
				qty,
				cur_cd,
				amt,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3,
				imp_err_flg,
				imp_flg,
				_index_
				)
			VALUES (
				i_calc_ctg_cd,
				x.wg_cd,
				x.ym,
				l_dpt_cd,
				x.itm_cd,
				x.itm_sub1,
				x.itm_sub2,
				x.itm_sub3,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				x.loc_cd,
				c_null_val,
				c_asst_mfg,
				x.unit_cd,
				x.qty,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				c_off,
				c_on,
				w
				)
			;

			IF l_sno1_use_typ <> c_ps_use_sls AND x.sno1_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_mfg$rec_w SET sno1 = x.sno1 WHERE _index_ = w ;
			END IF ;

			IF l_sno2_use_typ <> c_ps_use_sls AND x.sno2_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_mfg$rec_w SET sno2 = x.sno2 WHERE _index_ = w ;
			END IF ;

			IF l_sno3_use_typ <> c_ps_use_sls AND x.sno3_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_mfg$rec_w SET sno3 = x.sno3 WHERE _index_ = w ;
			END IF ;

			IF l_sno4_use_typ <> c_ps_use_sls AND x.sno4_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_mfg$rec_w SET sno4 = x.sno4 WHERE _index_ = w ;
			END IF ;

			IF w > c_max_cnt THEN
				INSERT INTO mgw_imp_pln_mfg (
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					loc_cd,
					str_ln_cd,
					asst_typ,
					unit_cd,
					qty,
					cur_cd,
					amt,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					imp_err_flg,
					imp_flg
					)
				SELECT
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					loc_cd,
					str_ln_cd,
					asst_typ,
					unit_cd,
					qty,
					cur_cd,
					amt,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					imp_err_flg,
					imp_flg
				FROM mgpa_imp_pln$p_ins_mgw_mfg$rec_w
				;
				TRUNCATE TABLE mgpa_imp_pln$p_ins_mgw_mfg$rec_w ;
				w := 0 ;
			END IF ;

		END ;

	END LOOP ;

	IF w > 0 THEN
		INSERT INTO mgw_imp_pln_mfg (
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			loc_cd,
			str_ln_cd,
			asst_typ,
			unit_cd,
			qty,
			cur_cd,
			amt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			imp_err_flg,
			imp_flg
			)
		SELECT
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			loc_cd,
			str_ln_cd,
			asst_typ,
			unit_cd,
			qty,
			cur_cd,
			amt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			imp_err_flg,
			imp_flg
		FROM mgpa_imp_pln$p_ins_mgw_mfg$rec_w
		;
		TRUNCATE TABLE mgpa_imp_pln$p_ins_mgw_mfg$rec_w ;
		w := 0 ;
	END IF ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_PLN.P_INS_MGW_MFG') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_ins_mgw_purc (
	IN i_calc_ctg_cd VARCHAR,
	IN i_ym_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_pln_imp_typ VARCHAR,
	IN i_sim_mrp_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		購買計画用
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL') ;
	c_asst_mfg CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP', 'CO_PROD') ; /* 自社(生産) */
	c_act_set_non CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP', 'NON') ; /* 対象外 */
	c_ps_use_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP', 'SLS') ; /* 販売データのみ使用する */
	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */

	c_itm_order CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PURC_PLN_IMP_TYP', 'ITM_ORDER') ;
	c_prcd_itm_order CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PURC_PLN_IMP_TYP', 'PRCD_ITM_ORDER') ;
	c_sim_itm_order CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PURC_PLN_IMP_TYP', 'SIM_ITM_ORDER') ;
	c_itm_ord_typ_purc CONSTANT VARCHAR := '2' ;	--購買
	c_ord_gnrt_typ_uplnd CONSTANT VARCHAR := '5' ;	--計画外
	c_itm_ord_sts_typ_opn CONSTANT VARCHAR := '1' ;	--未確定

	l_usr fcm_user.user_id%TYPE ;
	l_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE ;
	l_co_parm mam_co_parm%ROWTYPE ;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE ;
	l_bcur_cd mam_cur.cur_cd%TYPE ;
	l_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE ;
	l_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE ;
	l_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE ;
	l_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE ;

	rec_dpt mam_dpt[] ;

	l_tmp_dt TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_dpt_cd mam_cost_dpt.dpt_cd%TYPE ;
	l_alc_dpt_cd mam_cost_dpt.dpt_cd%TYPE ;

	l_ym_to mam_term.term%TYPE ;

	w INTEGER := 0 ;
	x RECORD ;

BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_pln$p_ins_mgw_purc$rec_w', 'mgw_imp_pln_purc', 'integer') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_PLN.P_INS_MGW_PURC') ;

	/* パラメータの取得 */
	CALL mgpa_imp_pln$p_get_parm(l_usr, l_parm_itm_sub_typ, l_co_parm, l_fix_dpt, l_bcur_cd, l_sno1_use_typ, l_sno2_use_typ, l_sno3_use_typ, l_sno4_use_typ) ;

	IF i_pln_imp_typ = c_sim_itm_order THEN
		CALL mgpa_imp_pln$p_sim_chk(i_sim_mrp_no) ;
	END IF ;

	DELETE FROM	mgw_imp_pln_purc t
	WHERE	0=0
	AND t.calc_ctg_cd = i_calc_ctg_cd
	AND t.ym BETWEEN i_ym_fr AND i_ym_to
	AND EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND t.wg_cd = w.wg_cd
		)
	;

	rec_dpt := '{}' ;
	l_ym_to := fcpa_postgres_util$add_months(i_ym_to, 1) ;
	l_tmp_dt := NULL ;
	w := 0 ;

	FOR x IN
		SELECT
			t.wg_cd,
			t.ym,
			t.dt,
			t.dpt_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.sppl_cd,
			t.alc_dpt_cd,
			SUM(t.qty) AS qty,
			m1.unit_cd,
			COALESCE(m2.sno1_act_typ, c_act_set_non) AS sno1_act_typ,
			COALESCE(m2.sno2_act_typ, c_act_set_non) AS sno2_act_typ,
			COALESCE(m2.sno3_act_typ, c_act_set_non) AS sno3_act_typ,
			COALESCE(m2.sno4_act_typ, c_act_set_non) AS sno4_act_typ
		FROM	(
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.strg_schd_dt) AS ym,
				t.strg_schd_dt AS dt,
				m.asst_dpt_cd AS dpt_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.sppl_cd,
				NULL AS alc_dpt_cd,
				t.inst_qty AS qty
			FROM	mgvt_mst_itm_order t, mam_loc m
			WHERE	0=0
			AND t.strg_loc_cd = m.loc_cd
			AND t.strg_schd_dt >= i_ym_fr
			AND t.strg_schd_dt < l_ym_to
			AND t.itm_ord_typ = c_itm_ord_typ_purc
			AND t.ord_gnrt_typ NOT IN (c_ord_gnrt_typ_uplnd)
			AND t.yield_schd_qty <> 0
			AND m.del_flg = c_off
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND (
				i_pln_imp_typ = c_itm_order
				OR
				i_pln_imp_typ = c_prcd_itm_order
				)
			UNION ALL
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.strg_schd_dt) AS ym,
				t.strg_schd_dt AS dt,
				m1.asst_dpt_cd AS dpt_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.sppl_cd,
				NULL AS alc_dpt_cd,
				t.inst_qty AS qty
			FROM	mgvt_mst_prcd_itm_order t, mam_loc m1, mam_itm_dtl m2
			WHERE	0=0
			AND t.strg_loc_cd = m1.loc_cd
			AND t.wg_cd = m2.wg_cd
			AND t.itm_cd = m2.itm_cd
			AND t.itm_sub1 = m2.itm_sub1
			AND t.itm_sub2 = m2.itm_sub2
			AND t.itm_sub3 = m2.itm_sub3
			AND t.sppl_cd = m2.sppl_cd
			AND t.master_dt >= m2.st_dt
			AND t.master_dt <= m2.end_dt
			AND t.strg_schd_dt >= i_ym_fr
			AND t.strg_schd_dt < l_ym_to
			AND t.itm_ord_typ = c_itm_ord_typ_purc
			AND t.ord_gnrt_typ NOT IN (c_ord_gnrt_typ_uplnd)
			AND t.yield_schd_qty <> 0
			AND m2.pre_po_tgt_flg = c_on
			AND m1.del_flg = c_off
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ = c_prcd_itm_order
			AND t.itm_ord_sts_typ = c_itm_ord_sts_typ_opn
			UNION ALL
			SELECT
				t.wg_cd,
				DATE_TRUNC('MONTH', t.strg_schd_dt) AS ym,
				t.strg_schd_dt AS dt,
				m.asst_dpt_cd AS dpt_cd,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.sppl_cd,
				NULL AS alc_dpt_cd,
				t.inst_qty AS qty
			FROM	mgvt_mst_sim_itm_order t, mam_loc m
			WHERE	0=0
			AND t.strg_loc_cd = m.loc_cd
			AND t.strg_schd_dt >= i_ym_fr
			AND t.strg_schd_dt < l_ym_to
			AND t.itm_ord_typ = c_itm_ord_typ_purc
			AND t.ord_gnrt_typ NOT IN (c_ord_gnrt_typ_uplnd)
			AND t.yield_schd_qty <> 0
			AND t.sim_mrp_no = i_sim_mrp_no
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			AND i_pln_imp_typ = c_sim_itm_order
			) t,
			mam_itm m1
			LEFT OUTER JOIN mam_calc_ptn m2 ON (m1.calc_ptn_cd = m2.calc_ptn_cd AND m2.del_flg = c_off)
		WHERE	0=0
		AND t.itm_cd = m1.itm_cd
		AND t.itm_sub1 = m1.itm_sub1
		AND t.itm_sub2 = m1.itm_sub2
		AND t.itm_sub3 = m1.itm_sub3
		AND t.dpt_cd IS NOT NULL
		GROUP BY t.wg_cd, t.ym, t.dt, t.dpt_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.sno1, t.sno2, t.sno3, t.sno4, t.sppl_cd, t.alc_dpt_cd, m1.unit_cd,
			m2.sno1_act_typ, m2.sno2_act_typ, m2.sno3_act_typ, m2.sno4_act_typ
		ORDER BY t.dt
	LOOP
		<<NEXT_LOOP_ERR>>
		BEGIN
			/* 部門の変換 */
			IF l_tmp_dt IS NULL OR l_tmp_dt <> x.dt THEN
				rec_dpt := '{}' ;
				l_tmp_dt := x.dt ;
			END IF ;

			CALL mgpa_cost_if$p_get_dpt(x.dpt_cd, l_fix_dpt, x.ym, rec_dpt, l_dpt_cd, c_off) ;
			IF l_dpt_cd IS NULL THEN
				EXIT NEXT_LOOP_ERR ;
			END IF ;

			IF x.alc_dpt_cd IS NOT NULL THEN
				CALL mgpa_cost_if$p_get_dpt(x.alc_dpt_cd, NULL, x.ym, rec_dpt, l_alc_dpt_cd, c_off) ;
				IF l_alc_dpt_cd IS NULL THEN
					EXIT NEXT_LOOP_ERR ;
				END IF ;
			END IF ;

			w := w + 1 ;

			INSERT INTO mgpa_imp_pln$p_ins_mgw_purc$rec_w (
				calc_ctg_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
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
				sppl_cd,
				asst_typ,
				unit_cd,
				qty,
				cur_cd,
				amt,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3,
				imp_err_flg,
				imp_flg,
				_index_
				)
			VALUES (
				i_calc_ctg_cd,
				x.wg_cd,
				x.ym,
				l_dpt_cd,
				x.itm_cd,
				x.itm_sub1,
				x.itm_sub2,
				x.itm_sub3,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				c_null_val,
				x.sppl_cd,
				c_asst_mfg,
				x.unit_cd,
				x.qty,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				NULL,
				c_off,
				c_on,
				w
				)
			;

			IF l_sno1_use_typ <> c_ps_use_sls AND x.sno1_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_purc$rec_w SET sno1 = x.sno1 WHERE _index_ = w ;
			END IF ;

			IF l_sno2_use_typ <> c_ps_use_sls AND x.sno2_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_purc$rec_w SET sno2 = x.sno2 WHERE _index_ = w ;
			END IF ;

			IF l_sno3_use_typ <> c_ps_use_sls AND x.sno3_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_purc$rec_w SET sno3 = x.sno3 WHERE _index_ = w ;
			END IF ;

			IF l_sno4_use_typ <> c_ps_use_sls AND x.sno4_act_typ <> c_act_set_non THEN
				UPDATE mgpa_imp_pln$p_ins_mgw_purc$rec_w SET sno4 = x.sno4 WHERE _index_ = w ;
			END IF ;

			IF w > c_max_cnt THEN
				INSERT INTO mgw_imp_pln_purc (
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					sppl_cd,
					asst_typ,
					unit_cd,
					qty,
					cur_cd,
					amt,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					imp_err_flg,
					imp_flg
					)
				SELECT
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					sppl_cd,
					asst_typ,
					unit_cd,
					qty,
					cur_cd,
					amt,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					imp_err_flg,
					imp_flg
				FROM mgpa_imp_pln$p_ins_mgw_purc$rec_w
				;
				TRUNCATE TABLE mgpa_imp_pln$p_ins_mgw_purc$rec_w ;
				w := 0 ;
			END IF ;

		END ;
	END LOOP ;

	IF w > 0 THEN
		INSERT INTO mgw_imp_pln_purc (
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			sppl_cd,
			asst_typ,
			unit_cd,
			qty,
			cur_cd,
			amt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			imp_err_flg,
			imp_flg
			)
		SELECT
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			sppl_cd,
			asst_typ,
			unit_cd,
			qty,
			cur_cd,
			amt,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			imp_err_flg,
			imp_flg
		FROM mgpa_imp_pln$p_ins_mgw_purc$rec_w
		;
		TRUNCATE TABLE mgpa_imp_pln$p_ins_mgw_purc$rec_w ;
		w := 0 ;
	END IF ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_PLN.P_INS_MGW_PURC') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_sls (
	IN i_calc_ctg_cd VARCHAR,
	IN i_ym_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_pln_imp_typ VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		売上計画用
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_sls_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP', 'PLN_SLS_KEY') ;
	c_asst_mfg CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP', 'CO_PROD') ; /* 自社(生産) */
	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */

	l_msg VARCHAR[] ;
	l_usr fcm_user.user_id%TYPE ;
	l_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE ;
	l_co_parm mam_co_parm%ROWTYPE ;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE ;
	l_bcur_cd mam_cur.cur_cd%TYPE ;
	l_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE ;
	l_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE ;
	l_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE ;
	l_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE ;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	i INTEGER := 0 ;

	l_err CHAR(1) ;
	l_term mam_term.term%TYPE ;

	lock_pln_sls CURSOR
	FOR
		SELECT	t.pln_sls_key
		FROM	mgt_pln_sls t
		WHERE	0=0
		AND t.calc_ctg_cd = i_calc_ctg_cd
		AND t.ym BETWEEN i_ym_fr AND i_ym_to
		AND EXISTS (
				SELECT	'X'
				FROM	mgw_wg w
				WHERE	0=0
				AND t.wg_cd = w.wg_cd
			)
		FOR UPDATE NOWAIT
	;

	x RECORD ;

BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_pln$p_sls$rec', 'mgt_pln_sls', 'integer') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_PLN.P_SLS') ;

	/* パラメータの取得 */
	CALL mgpa_imp_pln$p_get_parm(l_usr, l_parm_itm_sub_typ, l_co_parm, l_fix_dpt, l_bcur_cd, l_sno1_use_typ, l_sno2_use_typ, l_sno3_use_typ, l_sno4_use_typ) ;

	BEGIN
		FOR x IN lock_pln_sls LOOP EXIT ;
		END LOOP ;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MGBXD0029') ;
	END ;

	/* 販売管理から計画データをコピー */
	CALL mgpa_imp_pln$p_ins_mgw_sls(i_calc_ctg_cd, i_ym_fr, i_ym_to, i_pln_imp_typ) ;

	DELETE FROM	mgt_pln_sls t
	WHERE	0=0
	AND t.calc_ctg_cd = i_calc_ctg_cd
	AND t.ym BETWEEN i_ym_fr AND i_ym_to
	AND EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND t.wg_cd = w.wg_cd
		)
	;

	l_err := c_off ;
	FOR x IN
		SELECT	t.*,
			m1.itm_cd AS m_itm,
			m3.dpt_cd AS m_mng_dpt,
			m4.bp_cd AS m_cst,
			m5.bp_cd AS m_dlv,
			m6.dpt_cd AS m_sls_dpt,
			m7.dpt_cd AS m_alc_dpt,
			m8.bp_cd AS m_dest1,
			m9.bp_cd AS m_dest2,
			m10.bp_cd AS m_dest3
		FROM	(
			SELECT	t.calc_ctg_cd, t.wg_cd,
				t.ym, t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4, t.asst_typ,
				t.cst_cd, t.dlv_cd,
				t.sls_dpt_cd, t.sls_usr_cd, t.alc_dpt_cd,
				t.dest_cd1, t.dest_cd2, t.dest_cd3,
				t.cost_sls_cd1, t.cost_sls_cd2, t.cost_sls_cd3, t.cost_sls_cd4, t.cost_sls_cd5,
				t.unit_cd, SUM(t.qty) AS qty,
				t.cur_cd, SUM(t.amt) AS amt
			FROM	mgw_imp_pln_sls t
			WHERE	0=0
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.ym BETWEEN i_ym_fr AND i_ym_to
			AND t.imp_flg = c_on
			AND t.upd_usr_id = l_usr
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			GROUP BY t.calc_ctg_cd, t.wg_cd,
				t.ym, t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.asst_typ,
				t.cst_cd, t.dlv_cd,
				t.sls_dpt_cd, t.sls_usr_cd, t.alc_dpt_cd,
				t.dest_cd1, t.dest_cd2, t.dest_cd3,
				t.cost_sls_cd1, t.cost_sls_cd2, t.cost_sls_cd3, t.cost_sls_cd4, t.cost_sls_cd5,
				t.unit_cd, t.cur_cd
			) t
			LEFT OUTER JOIN mam_itm m1
				ON (t.itm_cd = m1.itm_cd
				AND t.itm_sub1 = m1.itm_sub1
				AND t.itm_sub2 = m1.itm_sub2
				AND t.itm_sub3 = m1.itm_sub3)
			LEFT OUTER JOIN mam_term m2 ON (t.ym >= m2.term AND t.ym < m2.term_end_ym AND m2.del_flg = c_off)
			LEFT OUTER JOIN mam_cost_dpt m3 ON (t.mng_dpt_cd = m3.dpt_cd AND m2.term = m3.term AND m3.del_flg = c_off)
			LEFT OUTER JOIN mam_bp m4 ON (t.cst_cd = m4.bp_cd AND m4.del_flg = c_off)
			LEFT OUTER JOIN mam_bp m5 ON (t.dlv_cd = m5.bp_cd AND m5.del_flg = c_off)
			LEFT OUTER JOIN mam_cost_dpt m6 ON (t.sls_dpt_cd = m6.dpt_cd AND m2.term = m6.term AND m6.del_flg = c_off)
			LEFT OUTER JOIN mam_cost_dpt m7 ON (t.alc_dpt_cd = m7.dpt_cd AND m2.term = m7.term AND m7.del_flg = c_off)
			LEFT OUTER JOIN mam_bp m8 ON (t.dest_cd1 = m8.bp_cd AND m8.del_flg = c_off)
			LEFT OUTER JOIN mam_bp m9 ON (t.dest_cd2 = m9.bp_cd AND m9.del_flg = c_off)
			LEFT OUTER JOIN mam_bp m10 ON (t.dest_cd3 = m10.bp_cd AND m10.del_flg = c_off)
		WHERE	0=0
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			<<NEXT_LOOP_ERR>>
			BEGIN
				IF x.m_itm IS NULL THEN
					/* 品目マスタに有効な品目として登録されていません。品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0002', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ)) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.m_mng_dpt IS NULL THEN
					/* 原価部門マスタに登録されていません。部門ＣＤ：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
							x.mng_dpt_cd, fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m())) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.cst_cd IS NOT NULL AND x.m_cst IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。得意先ＣＤ：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0006', l_log_no, l_log_sub_key1, l_log_sub_key2, x.cst_cd) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.dlv_cd IS NOT NULL AND x.m_dlv = c_off THEN
					/* 取引先マスタに有効な取引先として登録されていません。納品先ＣＤ：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0007', l_log_no, l_log_sub_key1, l_log_sub_key2, x.dlv_cd) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.alc_dpt_cd IS NOT NULL AND x.m_alc_dpt IS NULL THEN
					/* 原価部門マスタに登録されていません。部門ＣＤ：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
							x.alc_dpt_cd, fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m())) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.sls_dpt_cd IS NOT NULL AND x.m_sls_dpt IS NULL THEN
					/* 原価部門マスタに登録されていません。部門ＣＤ：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
							x.sls_dpt_cd, fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m())) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.dest_cd1 IS NOT NULL AND x.m_dest1 IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。仕向先ＣＤ１：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0008', l_log_no, l_log_sub_key1, l_log_sub_key2, x.dest_cd1) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.dest_cd2 IS NOT NULL AND x.m_dest3 IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。仕向先ＣＤ２：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0009', l_log_no, l_log_sub_key1, l_log_sub_key2, x.dest_cd2) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.dest_cd3 IS NOT NULL AND x.m_dest3 IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。仕向先ＣＤ３：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0010', l_log_no, l_log_sub_key1, l_log_sub_key2, x.dest_cd3) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				i := i + 1 ;

				INSERT INTO mgpa_imp_pln$p_sls$rec (
					pln_sls_key,
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					asst_typ,
					cst_cd,
					dlv_cd,
					sls_dpt_cd,
					sls_usr_cd,
					alc_dpt_cd,
					dest_cd1,
					dest_cd2,
					dest_cd3,
					cost_sls_cd1,
					cost_sls_cd2,
					cost_sls_cd3,
					cost_sls_cd4,
					cost_sls_cd5,
					unit_cd,
					qty,
					cur_cd,
					amt,
					_index_
					)
				VALUES (
					mapa_num$f_get_seq(c_sls_seq),
					x.calc_ctg_cd,
					x.wg_cd,
					x.ym,
					x.mng_dpt_cd,
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
					c_asst_mfg,
					x.cst_cd,
					x.dlv_cd,
					x.sls_dpt_cd,
					x.sls_usr_cd,
					x.alc_dpt_cd,
					x.dest_cd1,
					x.dest_cd2,
					x.dest_cd3,
					x.cost_sls_cd1,
					x.cost_sls_cd2,
					x.cost_sls_cd3,
					x.cost_sls_cd4,
					x.cost_sls_cd5,
					x.unit_cd,
					x.qty,
					x.cur_cd,
					x.amt,
					i
					)
				;

				IF l_co_parm.asst_flg = c_on THEN
					UPDATE mgpa_imp_pln$p_sls$rec SET asst_typ = c_asst_mfg WHERE _index_ = i ;
				ELSE
					UPDATE mgpa_imp_pln$p_sls$rec SET asst_typ = x.asst_typ WHERE _index_ = i ;
				END IF ;

				IF i > c_max_cnt THEN
					INSERT INTO mgt_pln_sls (
						pln_sls_key,
						calc_ctg_cd,
						wg_cd,
						ym,
						mng_dpt_cd,
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
						asst_typ,
						cst_cd,
						dlv_cd,
						sls_dpt_cd,
						sls_usr_cd,
						alc_dpt_cd,
						dest_cd1,
						dest_cd2,
						dest_cd3,
						cost_sls_cd1,
						cost_sls_cd2,
						cost_sls_cd3,
						cost_sls_cd4,
						cost_sls_cd5,
						unit_cd,
						qty,
						cur_cd,
						amt
						)
					SELECT
						pln_sls_key,
						calc_ctg_cd,
						wg_cd,
						ym,
						mng_dpt_cd,
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
						asst_typ,
						cst_cd,
						dlv_cd,
						sls_dpt_cd,
						sls_usr_cd,
						alc_dpt_cd,
						dest_cd1,
						dest_cd2,
						dest_cd3,
						cost_sls_cd1,
						cost_sls_cd2,
						cost_sls_cd3,
						cost_sls_cd4,
						cost_sls_cd5,
						unit_cd,
						qty,
						cur_cd,
						amt
					FROM
						mgpa_imp_pln$p_sls$rec
					;
					TRUNCATE TABLE mgpa_imp_pln$p_sls$rec ;
					i := 0 ;
				END IF ;

				EXIT NEXT_LOOP ;

			END ;

			l_err := c_on ;

		END ;

	END LOOP ;

	IF i > 0 THEN
		INSERT INTO mgt_pln_sls (
			pln_sls_key,
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			asst_typ,
			cst_cd,
			dlv_cd,
			sls_dpt_cd,
			sls_usr_cd,
			alc_dpt_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			cost_sls_cd1,
			cost_sls_cd2,
			cost_sls_cd3,
			cost_sls_cd4,
			cost_sls_cd5,
			unit_cd,
			qty,
			cur_cd,
			amt
			)
		SELECT
			pln_sls_key,
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			asst_typ,
			cst_cd,
			dlv_cd,
			sls_dpt_cd,
			sls_usr_cd,
			alc_dpt_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			cost_sls_cd1,
			cost_sls_cd2,
			cost_sls_cd3,
			cost_sls_cd4,
			cost_sls_cd5,
			unit_cd,
			qty,
			cur_cd,
			amt
		FROM
			mgpa_imp_pln$p_sls$rec
		;
		TRUNCATE TABLE mgpa_imp_pln$p_sls$rec ;
		i := 0 ;
	END IF ;

	DELETE FROM	mgw_imp_pln_sls w
	WHERE	0=0
	AND w.imp_flg = c_on
	AND w.imp_err_flg = c_off
	AND w.upd_usr_id = l_usr
	;

	IF l_err = c_on THEN
		COMMIT ; /* 正常データは取込済みにするため */
		l_msg := fcpa_err$msg_binder('MGPA_IMP_PLN.P_SLS') ;
		CALL fcpa_err$raise_app_err('MGBXD0037', l_msg) ;
	END IF ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_PLN.P_SLS') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_rqmt (
	IN i_calc_ctg_cd VARCHAR,
	IN i_ym_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_pln_imp_typ VARCHAR,
	IN i_sim_mrp_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		月次計画用
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_rqmt_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP', 'PLN_RQMT_KEY') ;
	c_asset_mng_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP', 'MNG') ; /* 資産管理する */
	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */

	l_msg VARCHAR[] ;
	l_usr fcm_user.user_id%TYPE ;
	l_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE ;
	l_co_parm mam_co_parm%ROWTYPE ;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE ;
	l_bcur_cd mam_cur.cur_cd%TYPE ;
	l_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE ;
	l_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE ;
	l_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE ;
	l_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE ;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	i INTEGER := 0 ;

	l_err CHAR(1) ;

	lock_pln_rqmt CURSOR
	FOR
		SELECT	t.pln_rqmt_key
		FROM	mgt_pln_rqmt t
		WHERE	0=0
		AND t.calc_ctg_cd = i_calc_ctg_cd
		AND t.ym BETWEEN i_ym_fr AND i_ym_to
		AND EXISTS (
				SELECT	'X'
				FROM	mgw_wg w
				WHERE	0=0
				AND t.wg_cd = w.wg_cd
			)
		FOR UPDATE NOWAIT
	;

	x RECORD ;

BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_pln$p_rqmt$rec', 'mgt_pln_rqmt', 'integer') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_PLN.P_RQMT') ;

	/* パラメータの取得 */
	CALL mgpa_imp_pln$p_get_parm(l_usr, l_parm_itm_sub_typ, l_co_parm, l_fix_dpt, l_bcur_cd, l_sno1_use_typ, l_sno2_use_typ, l_sno3_use_typ, l_sno4_use_typ) ;

	BEGIN
		FOR x IN lock_pln_rqmt LOOP EXIT ;
		END LOOP ;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MGBXD0029') ;
	END ;

	/* 生産管理から計画データをコピー */
	CALL mgpa_imp_pln$p_ins_mgw_rqmt(i_calc_ctg_cd, i_ym_fr, i_ym_to, i_pln_imp_typ, i_sim_mrp_no) ;

	DELETE FROM	mgt_pln_rqmt t
	WHERE	0=0
	AND t.calc_ctg_cd = i_calc_ctg_cd
	AND t.ym BETWEEN i_ym_fr AND i_ym_to
	AND EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND t.wg_cd = w.wg_cd
		)
	;

	l_err := c_off ;
	FOR x IN
		SELECT	t.*,
			m1.itm_cd AS m_itm,
			m1.asset_mng_typ,
			m3.dpt_cd AS m_mng_dpt
		FROM	(
			SELECT	t.calc_ctg_cd, t.wg_cd,
				t.ym, t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.asst_typ,
				t.unit_cd, SUM(t.qty) AS qty
			FROM	mgw_imp_pln_rqmt t
			WHERE	0=0
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.ym BETWEEN i_ym_fr AND i_ym_to
			AND t.imp_flg = c_on
			AND t.upd_usr_id = l_usr
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			GROUP BY t.calc_ctg_cd, t.wg_cd,
				t.ym, t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.asst_typ,
				t.unit_cd
			) t
			LEFT OUTER JOIN mam_itm m1
				ON (t.itm_cd = m1.itm_cd
				AND t.itm_sub1 = m1.itm_sub1
				AND t.itm_sub2 = m1.itm_sub2
				AND t.itm_sub3 = m1.itm_sub3)
			LEFT OUTER JOIN mam_term m2 ON (t.ym >= m2.term AND t.ym < m2.term_end_ym AND m2.del_flg = c_off)
			LEFT OUTER JOIN mam_cost_dpt m3 ON (t.mng_dpt_cd = m3.dpt_cd AND m2.term = m3.term AND m3.del_flg = c_off)
		WHERE	0=0
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			<<NEXT_LOOP_ERR>>
			BEGIN
				IF x.m_itm IS NULL THEN
					/* 品目マスタに有効な品目として登録されていません。品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0002', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ)) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.asset_mng_typ IS NULL OR x.asset_mng_typ <> c_asset_mng_mng THEN
					/* 品目マスタに資産管理可能な品目として登録されていません。取込の対象にはなりません。品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0003', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ)) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.m_mng_dpt IS NULL THEN
					/* 原価部門マスタに登録されていません。部門ＣＤ：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
							x.mng_dpt_cd, fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m())) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				i := i + 1 ;

				INSERT INTO mgpa_imp_pln$p_rqmt$rec (
					pln_rqmt_key,
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					asst_typ,
					unit_cd,
					qty,
					_index_
					)
				VALUES (
					mapa_num$f_get_seq(c_rqmt_seq),
					x.calc_ctg_cd,
					x.wg_cd,
					x.ym,
					x.mng_dpt_cd,
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
					x.asst_typ,
					x.unit_cd,
					x.qty,
					i
					)
				;

				IF i > c_max_cnt THEN
					INSERT INTO mgt_pln_rqmt (
						pln_rqmt_key,
						calc_ctg_cd,
						wg_cd,
						ym,
						mng_dpt_cd,
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
						asst_typ,
						unit_cd,
						qty
						)
					SELECT
						pln_rqmt_key,
						calc_ctg_cd,
						wg_cd,
						ym,
						mng_dpt_cd,
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
						asst_typ,
						unit_cd,
						qty
					FROM
						mgpa_imp_pln$p_rqmt$rec
					;
					TRUNCATE TABLE mgpa_imp_pln$p_rqmt$rec ;
					i := 0 ;
				END IF ;

				EXIT NEXT_LOOP ;

			END ;

			l_err := c_on ;

		END ;

	END LOOP ;

	IF i > 0 THEN
		INSERT INTO mgt_pln_rqmt (
			pln_rqmt_key,
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			asst_typ,
			unit_cd,
			qty
			)
		SELECT
			pln_rqmt_key,
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			asst_typ,
			unit_cd,
			qty
		FROM
			mgpa_imp_pln$p_rqmt$rec
		;
		TRUNCATE TABLE mgpa_imp_pln$p_rqmt$rec ;
		i := 0 ;
	END IF ;

	DELETE FROM	mgw_imp_pln_rqmt w
	WHERE	0=0
	AND w.imp_flg = c_on
	AND w.imp_err_flg = c_off
	AND w.upd_usr_id = l_usr
	;

	IF l_err = c_on THEN
		COMMIT ; /* 正常データは取込済みにするため */
		l_msg := fcpa_err$msg_binder('MGPA_IMP_PLN.P_RQMT') ;
		CALL fcpa_err$raise_app_err('MGBXD0037', l_msg) ;
	END IF ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_PLN.P_RQMT') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_mfg (
	IN i_calc_ctg_cd VARCHAR,
	IN i_ym_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_pln_imp_typ VARCHAR,
	IN i_sim_mrp_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		製造計画用
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL') ;
	c_mfg_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP', 'PLN_MFG_KEY') ;
	c_act_set_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP', 'IN_SET') ; /* 受入のみ設定 */
	c_ps_use_mfgsls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP', 'PRODSLS') ; /* 生産・販売データで使用する */
	c_ps_use_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP', 'SLS') ; /* 販売データのみ使用する */
	c_asset_mng_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP', 'MNG') ; /* 資産管理する */
	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */

	l_msg VARCHAR[] ;
	l_usr fcm_user.user_id%TYPE ;
	l_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE ;
	l_co_parm mam_co_parm%ROWTYPE ;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE ;
	l_bcur_cd mam_cur.cur_cd%TYPE ;
	l_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE ;
	l_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE ;
	l_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE ;
	l_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE ;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	i INTEGER := 0 ;

	l_err CHAR(1) ;

	lock_pln_mfg CURSOR
	FOR
		SELECT	t.pln_mfg_key
		FROM	mgt_pln_mfg t
		WHERE	0=0
		AND t.calc_ctg_cd = i_calc_ctg_cd
		AND t.ym BETWEEN i_ym_fr AND i_ym_to
		AND EXISTS (
				SELECT	'X'
				FROM	mgw_wg w
				WHERE	0=0
				AND t.wg_cd = w.wg_cd
			)
		FOR UPDATE NOWAIT
	;

	x RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_pln$p_mfg$rec', 'mgt_pln_mfg', 'integer') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_PLN.P_MFG') ;

	/* パラメータの取得 */
	CALL mgpa_imp_pln$p_get_parm(l_usr, l_parm_itm_sub_typ, l_co_parm, l_fix_dpt, l_bcur_cd, l_sno1_use_typ, l_sno2_use_typ, l_sno3_use_typ, l_sno4_use_typ) ;

	BEGIN
		FOR x IN lock_pln_mfg LOOP EXIT ;
		END LOOP ;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MGBXD0029') ;
	END ;

	/* 生産管理から計画データをコピー */
	CALL mgpa_imp_pln$p_ins_mgw_mfg(i_calc_ctg_cd, i_ym_fr, i_ym_to, i_pln_imp_typ, i_sim_mrp_no) ;

	DELETE FROM	mgt_pln_mfg t
	WHERE	0=0
	AND t.calc_ctg_cd = i_calc_ctg_cd
	AND t.ym BETWEEN i_ym_fr AND i_ym_to
	AND EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND t.wg_cd = w.wg_cd
		)
	;

	l_err := c_off ;
	FOR x IN
		SELECT	t.*,
			m1.itm_cd AS m_itm,
			m1.asset_mng_typ,
			m3.dpt_cd AS m_mng_dpt,
			m4.loc_cd AS m_loc,
			COALESCE(m4.stktk_tgt_flg, c_off) AS stktk_tgt_flg
		FROM	(
			SELECT t.calc_ctg_cd, t.wg_cd,
				t.ym, t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.loc_cd, t.str_ln_cd,
				t.asst_typ,
				t.unit_cd, SUM(t.qty) AS qty,
				t.cur_cd, SUM(t.amt) AS amt
			FROM	mgw_imp_pln_mfg t
			WHERE	0=0
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.ym BETWEEN i_ym_fr AND i_ym_to
			AND t.imp_flg = c_on
			AND t.upd_usr_id = l_usr
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			GROUP BY t.calc_ctg_cd, t.wg_cd,
				t.ym, t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.loc_cd, t.str_ln_cd,
				t.asst_typ,
				t.unit_cd, t.cur_cd
			) t
			LEFT OUTER JOIN mam_itm m1
				ON (t.itm_cd = m1.itm_cd
				AND t.itm_sub1 = m1.itm_sub1
				AND t.itm_sub2 = m1.itm_sub2
				AND t.itm_sub3 = m1.itm_sub3)
			LEFT OUTER JOIN mam_term m2 ON (t.ym >= m2.term AND t.ym < m2.term_end_ym AND m2.del_flg = c_off)
			LEFT OUTER JOIN mam_cost_dpt m3 ON (t.mng_dpt_cd = m3.dpt_cd AND m2.term = m3.term AND m3.del_flg = c_off)
			LEFT OUTER JOIN mam_loc m4 ON (t.loc_cd = m4.loc_cd AND m4.del_flg = c_off)
		WHERE	0=0
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			<<NEXT_LOOP_ERR>>
			BEGIN
				IF x.m_itm IS NULL THEN
					/* 品目マスタに有効な品目として登録されていません。品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0002', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ)) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.asset_mng_typ IS NULL OR x.asset_mng_typ <> c_asset_mng_mng THEN
					/* 品目マスタに資産管理可能な品目として登録されていません。取込の対象にはなりません。品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0003', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ)) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.m_mng_dpt IS NULL THEN
					/* 原価部門マスタに登録されていません。部門ＣＤ：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
							x.mng_dpt_cd, fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m())) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.m_loc IS NULL THEN
					/* 場所マスタに有効な場所として登録されていません。場所ＣＤ：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0004', l_log_no, l_log_sub_key1, l_log_sub_key2, x.loc_cd) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				i := i + 1 ;

				INSERT INTO mgpa_imp_pln$p_mfg$rec (
					pln_mfg_key,
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					loc_cd,
					str_ln_cd,
					asst_typ,
					unit_cd,
					qty,
					cur_cd,
					amt,
					_index_
					)
				VALUES (
					mapa_num$f_get_seq(c_mfg_seq),
					x.calc_ctg_cd,
					x.wg_cd,
					x.ym,
					x.mng_dpt_cd,
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
					x.loc_cd,
					c_null_val,
					x.asst_typ,
					x.unit_cd,
					x.qty,
					x.cur_cd,
					x.amt,
					i
					)
				;

				IF x.stktk_tgt_flg = c_on THEN
					UPDATE mgpa_imp_pln$p_mfg$rec SET str_ln_cd = x.str_ln_cd WHERE _index_ = i ;
				ELSE
					UPDATE mgpa_imp_pln$p_mfg$rec SET str_ln_cd = c_null_val WHERE _index_ = i ;
				END IF ;

				IF i > c_max_cnt THEN
					INSERT INTO mgt_pln_mfg (
						pln_mfg_key,
						calc_ctg_cd,
						wg_cd,
						ym,
						mng_dpt_cd,
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
						loc_cd,
						str_ln_cd,
						asst_typ,
						unit_cd,
						qty,
						cur_cd,
						amt
						)
					SELECT
						pln_mfg_key,
						calc_ctg_cd,
						wg_cd,
						ym,
						mng_dpt_cd,
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
						loc_cd,
						str_ln_cd,
						asst_typ,
						unit_cd,
						qty,
						cur_cd,
						amt
					FROM
						mgpa_imp_pln$p_mfg$rec
					;
					TRUNCATE TABLE mgpa_imp_pln$p_mfg$rec ;
					i := 0 ;
				END IF ;

				EXIT NEXT_LOOP ;

			END ;

			l_err := c_on ;

		END ;

	END LOOP ;

	IF i > 0 THEN
		INSERT INTO mgt_pln_mfg (
			pln_mfg_key,
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			loc_cd,
			str_ln_cd,
			asst_typ,
			unit_cd,
			qty,
			cur_cd,
			amt
			)
		SELECT
			pln_mfg_key,
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			loc_cd,
			str_ln_cd,
			asst_typ,
			unit_cd,
			qty,
			cur_cd,
			amt
		FROM
			mgpa_imp_pln$p_mfg$rec
		;
		TRUNCATE TABLE mgpa_imp_pln$p_mfg$rec ;
		i := 0 ;
	END IF ;

	DELETE FROM	mgw_imp_pln_mfg w
	WHERE	0=0
	AND w.imp_flg = c_on
	AND w.imp_err_flg = c_off
	AND w.upd_usr_id = l_usr
	;

	IF l_err = c_on THEN
		COMMIT ; /* 正常データは取込済みにするため */
		l_msg := fcpa_err$msg_binder('MGPA_IMP_PLN.P_MFG') ;
		CALL fcpa_err$raise_app_err('MGBXD0037', l_msg) ;
	END IF ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_PLN.P_MFG') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_pln$p_purc (
	IN i_calc_ctg_cd VARCHAR,
	IN i_ym_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_pln_imp_typ VARCHAR,
	IN i_sim_mrp_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		計画データを取込む
<REMARKS>
		購入計画用
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_YM_FR
		対象年月ＦＲＯＭ
<IN>	I_YM_TO
		対象年月ＴＯ
<IN>	I_PLN_IMP_TYP
		計画取込区分
<IN>	I_SIM_MRP_NO
		シミュレーションＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_purc_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP', 'PLN_PURC_KEY') ;
	c_asset_mng_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP', 'MNG') ; /* 資産管理する */
	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */

	l_msg VARCHAR[] ;
	l_usr fcm_user.user_id%TYPE ;
	l_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE ;
	l_co_parm mam_co_parm%ROWTYPE ;
	l_fix_dpt mam_cost_dpt.dpt_cd%TYPE ;
	l_bcur_cd mam_cur.cur_cd%TYPE ;
	l_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE ;
	l_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE ;
	l_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE ;
	l_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE ;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	i INTEGER := 0 ;

	l_err CHAR(1) ;

	lock_pln_purc CURSOR
	FOR
		SELECT	t.pln_purc_key
		FROM	mgt_pln_purc t
		WHERE	0=0
		AND t.calc_ctg_cd = i_calc_ctg_cd
		AND t.ym BETWEEN i_ym_fr AND i_ym_to
		AND EXISTS (
				SELECT	'X'
				FROM	mgw_wg w
				WHERE	0=0
				AND t.wg_cd = w.wg_cd
			)
		FOR UPDATE NOWAIT
	;

	x RECORD ;

BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_pln$p_purc$rec', 'mgt_pln_purc', 'integer') ;

	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_PLN.P_PURC') ;

	/* パラメータの取得 */
	CALL mgpa_imp_pln$p_get_parm(l_usr, l_parm_itm_sub_typ, l_co_parm, l_fix_dpt, l_bcur_cd, l_sno1_use_typ, l_sno2_use_typ, l_sno3_use_typ, l_sno4_use_typ) ;

	BEGIN
		FOR x IN lock_pln_purc LOOP EXIT ;
		END LOOP ;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MGBXD0029') ;
	END ;

	/* 生産管理から計画データをコピー */
	CALL mgpa_imp_pln$p_ins_mgw_purc(i_calc_ctg_cd, i_ym_fr, i_ym_to, i_pln_imp_typ, i_sim_mrp_no) ;

	DELETE FROM	mgt_pln_purc t
	WHERE	0=0
	AND t.calc_ctg_cd = i_calc_ctg_cd
	AND t.ym BETWEEN i_ym_fr AND i_ym_to
	AND EXISTS (
			SELECT	'X'
			FROM	mgw_wg w
			WHERE	0=0
			AND t.wg_cd = w.wg_cd
		)
	;

	l_err := c_off ;
	FOR x IN
		SELECT	t.*,
			m1.itm_cd AS m_itm,
			m1.asset_mng_typ,
			m3.dpt_cd AS m_mng_dpt,
			m4.bp_cd AS m_bp,
			m5.dpt_nm AS m_alc_dpt
		FROM	(
			SELECT	t.calc_ctg_cd, t.wg_cd,
				t.ym, t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.sppl_cd,
				t.alc_dpt_cd,
				t.asst_typ,
				t.unit_cd, SUM(t.qty) AS qty,
				t.cur_cd, SUM(t.amt) AS amt
			FROM	mgw_imp_pln_purc t
			WHERE	0=0
			AND t.calc_ctg_cd = i_calc_ctg_cd
			AND t.ym BETWEEN i_ym_fr AND i_ym_to
			AND t.imp_flg = c_on
			AND t.upd_usr_id = l_usr
			AND EXISTS (
					SELECT 'X'
					FROM	mgw_wg w
					WHERE	0=0
					AND t.wg_cd = w.wg_cd
				)
			GROUP BY t.calc_ctg_cd, t.wg_cd,
				t.ym, t.mng_dpt_cd,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no,
				t.sno1, t.sno2, t.sno3, t.sno4,
				t.sppl_cd,
				t.alc_dpt_cd,
				t.asst_typ,
				t.unit_cd, t.cur_cd
			) t
			LEFT OUTER JOIN mam_itm m1
				ON (t.itm_cd = m1.itm_cd
				AND t.itm_sub1 = m1.itm_sub1
				AND t.itm_sub2 = m1.itm_sub2
				AND t.itm_sub3 = m1.itm_sub3)
			LEFT OUTER JOIN mam_term m2 ON (t.ym >= m2.term AND t.ym < m2.term_end_ym AND m2.del_flg = c_off)
			LEFT OUTER JOIN mam_cost_dpt m3 ON (t.mng_dpt_cd = m3.dpt_cd AND m2.term = m3.term AND m3.del_flg = c_off)
			LEFT OUTER JOIN mam_bp m4 ON (t.sppl_cd = m4.bp_cd AND m4.del_flg = c_off)
			LEFT OUTER JOIN mam_cost_dpt m5 ON (t.alc_dpt_cd = m5.dpt_cd AND m2.term = m5.term AND m5.del_flg = c_off)
		WHERE	0=0
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			<<NEXT_LOOP_ERR>>
			BEGIN
				IF x.m_itm IS NULL THEN
					/* 品目マスタに登録されていません。品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0002', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ)) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.asset_mng_typ IS NULL OR x.asset_mng_typ <> c_asset_mng_mng THEN
					/* 品目マスタに資産管理可能な品目として登録されていません。取込の対象にはなりません。品目：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0003', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ)) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.m_mng_dpt IS NULL THEN
					/* 原価部門マスタに登録されていません。部門ＣＤ：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
							x.mng_dpt_cd, fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m())) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.m_bp IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。発注先ＣＤ：{1} */
					CALL fcpa_batch_log$p_data_log('MGBAD0005', l_log_no, l_log_sub_key1, l_log_sub_key2, x.sppl_cd) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				IF x.alc_dpt_cd IS NOT NULL AND x.m_alc_dpt IS NULL THEN
					/* 原価部門マスタに登録されていません。部門ＣＤ：{1} 期：{2} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
							x.alc_dpt_cd, fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m())) ;
					EXIT NEXT_LOOP_ERR ;
				END IF ;

				i := i + 1 ;

				INSERT INTO mgpa_imp_pln$p_purc$rec (
					pln_purc_key,
					calc_ctg_cd,
					wg_cd,
					ym,
					mng_dpt_cd,
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
					sppl_cd,
					alc_dpt_cd,
					asst_typ,
					unit_cd,
					qty,
					cur_cd,
					amt,
					_index_
					)
				VALUES (
					mapa_num$f_get_seq(c_purc_seq),
					x.calc_ctg_cd,
					x.wg_cd,
					x.ym,
					x.mng_dpt_cd,
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
					x.sppl_cd,
					x.alc_dpt_cd,
					x.asst_typ,
					x.unit_cd,
					x.qty,
					x.cur_cd,
					x.amt,
					i
					)
				;

				IF i > c_max_cnt THEN
					INSERT INTO mgt_pln_purc (
						pln_purc_key,
						calc_ctg_cd,
						wg_cd,
						ym,
						mng_dpt_cd,
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
						sppl_cd,
						alc_dpt_cd,
						asst_typ,
						unit_cd,
						qty,
						cur_cd,
						amt
						)
					SELECT
						pln_purc_key,
						calc_ctg_cd,
						wg_cd,
						ym,
						mng_dpt_cd,
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
						sppl_cd,
						alc_dpt_cd,
						asst_typ,
						unit_cd,
						qty,
						cur_cd,
						amt
					FROM
						mgpa_imp_pln$p_purc$rec
					;
					TRUNCATE TABLE mgpa_imp_pln$p_purc$rec ;
					i := 0 ;
				END IF ;

				EXIT NEXT_LOOP ;

			END ;

			l_err := c_on ;

		END ;

	END LOOP ;

	IF i > 0 THEN
		INSERT INTO mgt_pln_purc (
			pln_purc_key,
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			sppl_cd,
			alc_dpt_cd,
			asst_typ,
			unit_cd,
			qty,
			cur_cd,
			amt
			)
		SELECT
			pln_purc_key,
			calc_ctg_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
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
			sppl_cd,
			alc_dpt_cd,
			asst_typ,
			unit_cd,
			qty,
			cur_cd,
			amt
		FROM
			mgpa_imp_pln$p_purc$rec
		;
		TRUNCATE TABLE mgpa_imp_pln$p_purc$rec ;
		i := 0 ;
	END IF ;

	DELETE FROM	mgw_imp_pln_purc w
	WHERE	0=0
	AND w.imp_flg = c_on
	AND w.imp_err_flg = c_off
	AND w.upd_usr_id = l_usr
	;

	IF l_err = c_on THEN
		COMMIT ; /* 正常データは取込済みにするため */
		l_msg := fcpa_err$msg_binder('MGPA_IMP_PLN.P_PURC') ;
		CALL fcpa_err$raise_app_err('MGBXD0037', l_msg) ;
	END IF ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_PLN.P_PURC') ;

END ;
$BODY$
LANGUAGE plpgsql
;
