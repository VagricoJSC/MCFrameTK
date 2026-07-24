\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_ins_inpt(
	IN i_rec RECORD,
	IN i_cnt INTEGER,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	INOUT o_dpt_cd VARCHAR,
	INOUT o_dpt_flg CHARACTER,
	INOUT o_sum_t NUMERIC
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	投入振替のときの振替先投入実績をワークテーブルに作成する
<REMARKS>
	ワークテーブルの件数を取得する
<ARGUMENTS>
<IN>	i_rec
		入出庫実績と入出庫実績振替マスタを結合した結果
<IN>	i_cnt
		実行した回数
<IN>	i_term
		対象期
<INOUT>	o_dpt_cd
		部門ＣＤ
<INOUT>	o_dpt_flg
		部門フラグ
<INOUT>	o_sum_t
		ワークテーブルの件数
<HISTORY>
*************************************************************************/
DECLARE
	c_off CONSTANT VARCHAR := '0' ;
	c_on CONSTANT VARCHAR := '1' ;

	c_input		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INPUT');
	c_in_onr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_ONR');

	c_inpt_loc_non		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_LOC_TYP','NON');
	c_inpt_loc_loc		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_LOC_TYP','LOC');
	c_inpt_loc_dpt		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_LOC_TYP','DPT');
	c_inpt_loc_mng_dpt	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_LOC_TYP','MNG_DPT');

	l_inpt_loc_typ mam_act_io.inpt_loc_typ1%TYPE;
BEGIN
	IF i_cnt = 1 THEN
		l_inpt_loc_typ := i_rec.inpt_loc_typ1;
	ELSIF i_cnt = 2 AND i_rec.inpt_loc_typ2 IS NOT NULL THEN
		l_inpt_loc_typ := i_rec.inpt_loc_typ2;
	ELSIF i_cnt = 3 AND i_rec.inpt_loc_typ2 IS NOT NULL AND i_rec.inpt_loc_typ3 IS NOT NULL THEN
		l_inpt_loc_typ := i_rec.inpt_loc_typ3;
	ELSE
		o_sum_t := 0;
		RETURN;
	END IF;

	IF (o_dpt_cd IS NULL OR o_dpt_cd <> COALESCE(i_rec.alc_dpt_cd, COALESCE(i_rec.other_dpt_cd, i_rec.mng_dpt_cd))) THEN
		o_dpt_cd := COALESCE(i_rec.alc_dpt_cd, COALESCE(i_rec.other_dpt_cd, i_rec.mng_dpt_cd));
		o_dpt_flg := c_off;
	END IF;

	IF l_inpt_loc_typ = c_inpt_loc_dpt AND i_rec.stk_bp_cd IS NULL AND o_dpt_flg = c_off THEN
		CALL mapa_dpt_loc$p_set_dpt_loc(i_term, o_dpt_cd);
		o_dpt_flg := c_on;
	END IF;

	/* 振替先の投入実績をワークテーブルに格納する */
	DELETE FROM mgw_act_inpt;
	INSERT INTO mgw_act_inpt (
		par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
		itm_mfg_inst_no, mfg_act_no, oper_act_no,
		loc_cd, str_ln_cd,
		stk_bp_cd,
		qty
	)
	SELECT
		t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
		t1.itm_mfg_inst_no, t1.mfg_act_no, t1.oper_act_no,
		t1.loc_cd, t1.str_ln_cd,
		t1.stk_bp_cd,
		SUM(t1.qty)
	FROM mgt_act_inpt t1
		LEFT OUTER JOIN mgt_inst_oper t2 ON (
			t1.calc_ctg_cd = t2.calc_ctg_cd
			AND t1.par_itm_cd = t2.itm_cd
			AND t1.par_itm_sub1 = t2.itm_sub1
			AND t1.par_itm_sub2 = t2.itm_sub2
			AND t1.par_itm_sub3 = t2.itm_sub3
			AND t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
			AND t1.mfg_act_no = t2.mfg_act_no
			AND t1.oper_act_no = t2.oper_act_no)
	WHERE 0=0
	AND t1.calc_ctg_cd = i_rec.calc_ctg_cd
	AND t1.wg_cd = i_rec.wg_cd
	AND t1.ym = i_rec.ym
	AND t1.itm_cd = i_rec.itm_cd
	AND t1.itm_sub1 = i_rec.itm_sub1
	AND t1.itm_sub2 = i_rec.itm_sub2
	AND t1.itm_sub3 = i_rec.itm_sub3
	AND t1.lot_no = i_rec.lot_no
	AND t1.sublot_no = i_rec.sublot_no
	AND t1.sno1 = i_rec.sno1
	AND t1.sno2 = i_rec.sno2
	AND t1.sno3 = i_rec.sno3
	AND t1.sno4 = i_rec.sno4
	AND t1.ac_slip_typ IN (c_input, c_in_onr)
	AND t1.asst_typ = i_rec.asst_typ
	AND (
		i_rec.stk_bp_cd IS NOT NULL
			AND t1.stk_bp_cd IS NOT NULL
			AND i_rec.stk_bp_cd = t1.stk_bp_cd
			AND (
				l_inpt_loc_typ <> c_inpt_loc_mng_dpt
				OR
				l_inpt_loc_typ = c_inpt_loc_mng_dpt AND o_dpt_cd = t1.mng_dpt_cd
			)
		OR i_rec.stk_bp_cd IS NULL
		AND t1.stk_bp_cd IS NULL
		AND (
			l_inpt_loc_typ = c_inpt_loc_non
			OR
			l_inpt_loc_typ = c_inpt_loc_loc AND i_rec.alc_loc_cd = t1.loc_cd
			OR
			l_inpt_loc_typ = c_inpt_loc_mng_dpt AND o_dpt_cd = t1.mng_dpt_cd
			OR
			l_inpt_loc_typ = c_inpt_loc_dpt
			AND EXISTS (
				SELECT 'X'
				FROM maw_dpt_loc w
				WHERE 0=0
				AND w.dpt_cd = o_dpt_cd
				AND w.loc_cd = t1.loc_cd
				AND (
					w.oper_cd = t2.oper_cd
					OR
					w.oper_cd IS NULL AND w.oper_null_flg = c_off
					OR
					w.oper_cd IS NULL AND w.oper_null_flg = c_on AND t2.oper_cd IS NULL
					)
				)
			)
		)
	AND t1.qty > 0
	GROUP BY
		t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
		t1.itm_mfg_inst_no, t1.mfg_act_no, t1.oper_act_no,
		t1.loc_cd, t1.str_ln_cd,
		t1.stk_bp_cd
	;

	SELECT COALESCE(SUM(w.qty), 0)
	INTO STRICT o_sum_t
	FROM mgw_act_inpt w
	;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_ifsub(
	IN i_wg_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	出庫配賦費用の設定もしくは投入・入庫への振替の作成
<REMARKS>
	入出庫実績振替マスタによって出庫実績を振り替える
<ARGUMENTS>
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym
		対象年月
<HISTORY>
*************************************************************************/
DECLARE
	c_off CONSTANT VARCHAR := '0' ;
	c_on CONSTANT VARCHAR := '1' ;

	c_str CONSTANT VARCHAR := CONCAT(fcpa_const$get_const_val('FSC_MODULE_ID','CostManagement'), fcpa_const$get_const_val('MGC_STR','ACT_ID_DLM'));
	c_num_sys_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_INPT_ID');
	c_num_sys_inpt_length CONSTANT INTEGER := mgc_num_sys_typ$length(c_num_sys_inpt);

	c_rnd_typ CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDUP');

	c_inpt_loc_dpt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_INPT_LOC_TYP','DPT');

	c_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_OUT');
	c_io_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IN');

	c_trans_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TRANS_TYP','INPT');
	c_trans_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TRANS_TYP','GR');
	c_trans_non CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TRANS_TYP','NON');

	l_flg CHAR(1);

	l_sum_t NUMERIC;
	l_num_abs NUMERIC;
	l_num_abs2 NUMERIC;
	l_num_s NUMERIC;
	l_num_s2 NUMERIC;

	l_dpt_cd mam_cost_dpt.dpt_cd%TYPE;
	l_dpt_flg CHAR(1);

	l_itm_cd mam_itm.itm_cd%TYPE;

	l_act_io_id mgw_io.act_io_id%TYPE;
	l_act_io_id_sub mgw_io.act_io_id_sub%TYPE;

	l_g_term TIMESTAMP(0) WITHOUT TIME ZONE;
	l_g_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	cur_act_io CURSOR (i_wg_cd VARCHAR) FOR
		SELECT
			t.act_io_id, t.act_io_id_sub,
			t.calc_ctg_cd,
			t.wg_cd,
			t.ym, t.ac_dt,
			t.mng_dpt_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
			t.cost_io_typ, t.ac_slip_typ, t.ac_rsn_cd,
			t.other_wg_cd, t.other_dpt_cd,
			t.bp_cd, t.stk_bp_cd, t.asst_typ,
			t.qty,
			t.alc_wg_cd,
			t.alc_dpt_cd, t.alc_loc_cd, t.alc_oper_cd, t.alc_bp_cd,
			t.alc_ctg_cd, t.alc_itm_cd, t.alc_itm_sub1, t.alc_itm_sub2, t.alc_itm_sub3,
			t.alc_lot_no, t.alc_sublot_no, t.alc_sno1, t.alc_sno2, t.alc_sno3, t.alc_sno4,
			t.alc_itm_mfg_inst_no,
			t.zero_effect_flg,
			m.io_trans_typ,
			m.alc_ac_cd m_alc_ac_cd,
			m.alc_amt_flg m_alc_amt_flg,
			m.alc_wg_cd m_alc_wg_cd,
			m.dpt_flg, m.dpt_cd m_dpt_cd,
			m.loc_flg, m.loc_cd m_loc_cd,
			m.oper_flg, m.oper_cd m_oper_cd,
			m.bp_flg, m.bp_cd m_bp_cd,
			m.ctg_flg, m.ctg_cd m_ctg_cd,
			m.itm_flg, m.itm_cd m_itm_cd,
			m.itm_sub1 m_itm_sub1, m.itm_sub2 m_itm_sub2, m.itm_sub3 m_itm_sub3,
			m.lot_no_flg, m.lot_no m_lot_no,
			m.sublot_no_flg, m.sublot_no m_sublot_no,
			m.sno1_flg, m.sno1 m_sno1,
			m.sno2_flg, m.sno2 m_sno2,
			m.sno3_flg, m.sno3 m_sno3,
			m.sno4_flg, m.sno4 m_sno4,
			m.itm_mfg_inst_no_flg,
			COALESCE(m.inpt_loc_typ1, c_inpt_loc_dpt) inpt_loc_typ1,
			m.inpt_loc_typ2,
			m.inpt_loc_typ3,
			m2.unit_cd,
			COALESCE(m2.dec_place, 0) dec_place
		FROM mgw_io$temp t
			INNER JOIN mam_act_io m ON (
				t.ac_slip_typ = m.ac_slip_typ
				AND (t.itm_jnl_cd = m.itm_jnl_cd OR m.itm_jnl_cd IS NULL)
				AND (t.ac_rsn_cd = m.ac_rsn_cd
					OR m.ac_rsn_cd IS NULL AND m.ac_rsn_null_flg = c_off
					OR m.ac_rsn_cd IS NULL AND m.ac_rsn_null_flg = c_on AND t.ac_rsn_cd IS NULL)
				AND (t.alc_dpt_cd = m.tgt_dpt_cd OR m.tgt_dpt_cd IS NULL)
				AND (t.alc_loc_cd = m.tgt_loc_cd
					OR m.tgt_loc_cd IS NULL AND m.loc_null_flg = c_off
					OR m.tgt_loc_cd IS NULL AND m.loc_null_flg = c_on AND t.alc_loc_cd IS NULL)
				AND t.calc_ctg_cd = m.calc_ctg_cd
				AND t.wg_cd = m.wg_cd
				AND t.ac_dt BETWEEN m.st_dt AND m.end_dt
				)
			INNER JOIN mam_itm_srch m2 ON (
				t.itm_cd = m2.itm_cd
				AND t.itm_sub1 = m2.itm_sub1
				AND t.itm_sub2 = m2.itm_sub2
				AND t.itm_sub3 = m2.itm_sub3
				AND m2.del_flg = c_off
				AND m2.release_flg = c_on
				)
		WHERE 0=0
		AND t.wg_cd = i_wg_cd
		AND t.cost_io_typ = c_io_stk_out
		AND t.trd_grp IS NULL
		AND t.alc_ac_cd IS NULL
		AND (t.qty <> 0 OR t.qty = 0 AND t.zero_effect_flg = c_on)
		ORDER BY COALESCE(t.alc_dpt_cd, COALESCE(t.other_dpt_cd, t.mng_dpt_cd)),
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.act_io_id, t.act_io_id_sub, m.prio
		;

	x RECORD;
	y RECORD;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_MGTIF2MGT.P_IFSUB');

	l_act_io_id := NULL;
	l_act_io_id_sub := NULL;
	l_dpt_cd := NULL;
	l_dpt_flg := c_off;
	l_g_parm_itm_sub_typ := mapa_comm$f_get_parm('ITM_SUB_TYP');

	--期の取得
	l_g_term := mapa_term$f_get_term_ne(i_ym);

	DELETE FROM mgw_act_inpt2;

	FOR x IN cur_act_io (i_wg_cd) LOOP

		<<NEXT_OUT_LOOP>>
		BEGIN

			<<TRANS_SKIP>>
			BEGIN

				/* 優先順位の低いレコードは処理しない */
				IF l_act_io_id = x.act_io_id AND l_act_io_id_sub = x.act_io_id_sub THEN
					EXIT NEXT_OUT_LOOP;
				ELSE
					l_act_io_id := x.act_io_id;
					l_act_io_id_sub := x.act_io_id_sub;
				END IF;

				IF x.io_trans_typ = c_trans_inpt THEN
					/* 投入への振替 */
					CALL mgpa_ins_mgtif2mgt$p_ins_inpt(x, 1, l_g_term, l_dpt_cd, l_dpt_flg, l_sum_t);
					IF l_sum_t = 0 THEN
						CALL mgpa_ins_mgtif2mgt$p_ins_inpt(x, 2, l_g_term, l_dpt_cd, l_dpt_flg, l_sum_t);
						IF l_sum_t = 0 THEN
							CALL mgpa_ins_mgtif2mgt$p_ins_inpt(x, 3, l_g_term, l_dpt_cd, l_dpt_flg, l_sum_t);
						END IF;
					END IF;

					IF x.zero_effect_flg = c_on AND x.qty = 0 THEN
						IF l_sum_t = 0 THEN
							EXIT TRANS_SKIP;
						ELSE
							EXIT NEXT_OUT_LOOP;
						END IF;
					END IF;

					IF l_sum_t = 0 THEN
						/* 対応する投入実績が1件も存在しないため、投入への振替ができません。 */
						/* 配賦科目が設定されているときは配賦振替の処理を行います。 */
						/* 入出庫実績ＩＤ：{1} 品目：{2} 部門：{3} 数量：{4} 配賦科目：{5} */
						CALL fcpa_batch_log$p_data_log('MGBBD0016', l_log_no, l_log_sub_key1, l_log_sub_key2,
										x.act_io_id, mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_g_parm_itm_sub_typ),
										l_dpt_cd, x.qty::VARCHAR, x.m_alc_ac_cd);
						EXIT TRANS_SKIP;
					END IF;

					l_flg := c_off;
					l_num_abs := ABS(x.qty);
					l_num_abs2 := 0;
					l_num_s := x.qty;

					FOR y IN
						SELECT
							w.par_itm_cd, w.par_itm_sub1, w.par_itm_sub2, w.par_itm_sub3,
							w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
							w.loc_cd, w.str_ln_cd,
							w.stk_bp_cd,
							w.qty
						FROM mgw_act_inpt w
						WHERE 0=0
						ORDER BY w.qty DESC
					LOOP
						l_num_s2 := mapa_calc$f_rnd(x.qty * y.qty / l_sum_t, x.dec_place, c_rnd_typ);
						l_num_abs2 := l_num_abs2 + ABS(l_num_s2);

						IF l_num_abs2 >= l_num_abs THEN
							IF l_flg = c_on THEN
								EXIT;
							ELSE
								l_num_s2 := l_num_s;
								l_flg := c_on;
							END IF;
						END IF;

						IF l_num_s2 <> 0 THEN
							INSERT INTO mgw_act_inpt2 (
								act_io_id, act_io_id_sub,
								calc_ctg_cd, wg_cd,
								ym, ac_dt,
								par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
								itm_mfg_inst_no, mfg_act_no, oper_act_no,
								loc_cd, str_ln_cd,
								mng_dpt_cd,
								itm_cd, itm_sub1, itm_sub2, itm_sub3,
								lot_no, sublot_no, sno1, sno2, sno3, sno4,
								ac_slip_typ, ac_rsn_cd,
								bp_cd,
								stk_bp_cd, asst_typ,
								qty
							)
							VALUES (
								x.act_io_id, x.act_io_id_sub,
								x.calc_ctg_cd, x.wg_cd,
								x.ym, x.ac_dt,
								y.par_itm_cd, y.par_itm_sub1, y.par_itm_sub2, y.par_itm_sub3,
								y.itm_mfg_inst_no, y.mfg_act_no, y.oper_act_no,
								y.loc_cd, y.str_ln_cd,
								x.mng_dpt_cd,
								x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
								x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
								x.ac_slip_typ, x.ac_rsn_cd,
								x.bp_cd,
								y.stk_bp_cd, x.asst_typ,
								l_num_s2
								)
							;
							l_num_s := l_num_s - l_num_s2;
						END IF;
					END LOOP;

					DELETE FROM mgw_io t WHERE t.act_io_id = x.act_io_id AND t.act_io_id_sub = x.act_io_id_sub;

					EXIT NEXT_OUT_LOOP;

				ELSIF x.io_trans_typ = c_trans_gr THEN

					IF x.zero_effect_flg = c_on AND x.qty = 0 THEN
						EXIT NEXT_OUT_LOOP;
					END IF;

					/* 入庫への振替 */
					UPDATE mgw_io$temp t
 					SET cost_io_typ = c_io_stk_in,
						qty = t.qty * (- 1),
						alc_ac_cd = NULL,
						alc_amt_flg = c_off,
						alc_wg_cd = NULL,
						alc_dpt_cd = NULL,
						alc_loc_cd = NULL,
						alc_oper_cd = NULL,
						alc_bp_cd = NULL,
						alc_ctg_cd = NULL,
						alc_itm_cd = NULL,
						alc_itm_sub1 = NULL,
						alc_itm_sub2 = NULL,
						alc_itm_sub3 = NULL,
						alc_lot_no = NULL,
						alc_sublot_no = NULL,
						alc_sno1 = NULL,
						alc_sno2 = NULL,
						alc_sno3 = NULL,
						alc_sno4 = NULL,
						alc_itm_mfg_inst_no = NULL,
						mfg_act_grp = NULL
					WHERE t.act_io_id = x.act_io_id AND t.act_io_id_sub = x.act_io_id_sub
					;

					EXIT NEXT_OUT_LOOP;

				ELSIF x.io_trans_typ = c_trans_non THEN
					/* 対象外は処理しない */
					EXIT NEXT_OUT_LOOP;
				END IF;

			END; -- TRANS_SKIP

			/* 配賦費用の設定 */
			IF x.m_alc_ac_cd IS NULL THEN
				EXIT NEXT_OUT_LOOP;
			END IF;

			UPDATE mgw_io$temp t
			SET alc_ac_cd = x.m_alc_ac_cd,
				alc_amt_flg = x.m_alc_amt_flg,
				alc_wg_cd = COALESCE(x.m_alc_wg_cd, COALESCE(x.alc_wg_cd, x.wg_cd)),
				alc_dpt_cd = CASE x.dpt_flg WHEN c_off THEN x.m_dpt_cd ELSE x.alc_dpt_cd END,
				alc_loc_cd = CASE x.loc_flg WHEN c_off THEN x.m_loc_cd ELSE x.alc_loc_cd END,
				alc_oper_cd = CASE x.oper_flg WHEN c_off THEN x.m_oper_cd ELSE x.alc_oper_cd END,
				alc_bp_cd = CASE x.bp_flg WHEN c_off THEN x.m_bp_cd ELSE x.alc_bp_cd END,
				alc_ctg_cd = CASE x.ctg_flg WHEN c_off THEN x.m_ctg_cd ELSE x.alc_ctg_cd END,
				alc_itm_cd = CASE x.itm_flg WHEN c_off THEN x.m_itm_cd ELSE x.alc_itm_cd END,
				alc_itm_sub1 = CASE x.itm_flg WHEN c_off THEN x.m_itm_sub1 ELSE x.alc_itm_sub1 END,
				alc_itm_sub2 = CASE x.itm_flg WHEN c_off THEN x.m_itm_sub2 ELSE x.alc_itm_sub2 END,
				alc_itm_sub3 = CASE x.itm_flg WHEN c_off THEN x.m_itm_sub3 ELSE x.alc_itm_sub3 END,
				alc_lot_no = CASE x.lot_no_flg WHEN c_off THEN x.m_lot_no ELSE x.alc_lot_no END,
				alc_sublot_no = CASE x.sublot_no_flg WHEN c_off THEN x.m_sublot_no ELSE x.alc_sublot_no END,
				alc_sno1 = CASE x.sno1_flg WHEN c_off THEN x.m_sno1 ELSE x.alc_sno1 END,
				alc_sno2 = CASE x.sno2_flg WHEN c_off THEN x.m_sno2 ELSE x.alc_sno2 END,
				alc_sno3 = CASE x.sno3_flg WHEN c_off THEN x.m_sno3 ELSE x.alc_sno3 END,
				alc_sno4 = CASE x.sno4_flg WHEN c_off THEN x.m_sno4 ELSE x.alc_sno4 END,
				alc_itm_mfg_inst_no = CASE x.itm_mfg_inst_no_flg WHEN c_off THEN NULL ELSE x.alc_itm_mfg_inst_no END
			WHERE 0=0
			AND t.act_io_id = x.act_io_id AND t.act_io_id_sub = x.act_io_id_sub
			;

		END; -- NEXT_OUT_LOOP

	END LOOP;

	INSERT INTO mgt_act_inpt (
		act_inpt_id, act_inpt_id_sub,
		calc_ctg_cd, wg_cd,
		ym, ac_dt,
		par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
		itm_mfg_inst_no, mfg_act_no, oper_act_no,
		loc_cd, str_ln_cd,
		mng_dpt_cd,
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		ac_slip_typ, ac_rsn_cd,
		bp_cd,
		stk_bp_cd, asst_typ,
		qty
	)
	SELECT
		CONCAT(c_str, LPAD(mapa_num$f_get_seq(c_num_sys_inpt)::VARCHAR, c_num_sys_inpt_length, '0')), '1',
		t.calc_ctg_cd, t.wg_cd,
		t.ym, t.ac_dt,
		t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3,
		t.itm_mfg_inst_no, t.mfg_act_no, t.oper_act_no,
		t.loc_cd, t.str_ln_cd,
		t.mng_dpt_cd,
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
		t.ac_slip_typ, t.ac_rsn_cd,
		t.bp_cd,
		t.stk_bp_cd, t.asst_typ,
		t.qty
	FROM (
		SELECT
			w.calc_ctg_cd, w.wg_cd,
			w.ym, w.ac_dt,
			w.par_itm_cd, w.par_itm_sub1, w.par_itm_sub2, w.par_itm_sub3,
			w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
			w.loc_cd, w.str_ln_cd,
			w.mng_dpt_cd,
			w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
			w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
			w.ac_slip_typ, w.ac_rsn_cd,
			w.bp_cd,
			w.stk_bp_cd, w.asst_typ,
			SUM(w.qty) qty
		FROM mgw_act_inpt2 w
		WHERE 0=0
		GROUP BY
			w.calc_ctg_cd, w.wg_cd,
			w.ym, w.ac_dt,
			w.par_itm_cd, w.par_itm_sub1, w.par_itm_sub2, w.par_itm_sub3,
			w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
			w.loc_cd, w.str_ln_cd,
			w.mng_dpt_cd,
			w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
			w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
			w.ac_slip_typ, w.ac_rsn_cd,
			w.bp_cd,
			w.stk_bp_cd, w.asst_typ
		HAVING SUM(w.qty) <> 0
		) t
	WHERE 0=0
	;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_MGTIF2MGT.P_IFSUB');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$ins_mgw_io()
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	MGW_IOを作成する
<REMARKS>
<ARGUMENTS>
<HISTORY>
*************************************************************************/
BEGIN
	INSERT INTO mgw_io (
		act_io_id,
		act_io_id_sub,
		calc_ctg_cd,
		wg_cd,
		ym,
		ac_dt,
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
		cost_io_typ,
		ac_slip_typ,
		ac_rsn_cd,
		other_wg_cd,
		other_dpt_cd,
		bp_cd,
		stk_bp_cd,
		asst_typ,
		qty,
		amt,
		trd_cur_cd,
		trd_cur_amt,
		xrate,
		trd_grp,
		trd_ratio,
		alc_ac_cd,
		alc_amt_flg,
		alc_wg_cd,
		alc_dpt_cd,
		alc_loc_cd,
		alc_oper_cd,
		alc_bp_cd,
		alc_ctg_cd,
		alc_itm_cd,
		alc_itm_sub1,
		alc_itm_sub2,
		alc_itm_sub3,
		alc_lot_no,
		alc_sublot_no,
		alc_sno1,
		alc_sno2,
		alc_sno3,
		alc_sno4,
		alc_itm_mfg_inst_no,
		rec_eval_typ,
		sml_key,
		itm_jnl_cd,
		zero_effect_flg,
		mfg_act_grp
	)
	SELECT
		act_io_id,
		act_io_id_sub,
		calc_ctg_cd,
		wg_cd,
		ym,
		ac_dt,
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
		cost_io_typ,
		ac_slip_typ,
		ac_rsn_cd,
		other_wg_cd,
		other_dpt_cd,
		bp_cd,
		stk_bp_cd,
		asst_typ,
		qty,
		amt,
		trd_cur_cd,
		trd_cur_amt,
		xrate,
		trd_grp,
		trd_ratio,
		alc_ac_cd,
		alc_amt_flg,
		alc_wg_cd,
		alc_dpt_cd,
		alc_loc_cd,
		alc_oper_cd,
		alc_bp_cd,
		alc_ctg_cd,
		alc_itm_cd,
		alc_itm_sub1,
		alc_itm_sub2,
		alc_itm_sub3,
		alc_lot_no,
		alc_sublot_no,
		alc_sno1,
		alc_sno2,
		alc_sno3,
		alc_sno4,
		alc_itm_mfg_inst_no,
		rec_eval_typ,
		sml_key,
		itm_jnl_cd,
		zero_effect_flg,
		mfg_act_grp
	FROM mgpa_ins_mgtif2mgt$p_if$rec_io
	;

	TRUNCATE TABLE mgpa_ins_mgtif2mgt$p_if$rec_io;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_ifsub2(
	 IN i_wg_cd VARCHAR,
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	生販連携関連の入出庫実績をまとめる
<REMARKS>
	１．生販連携関連の入出庫実績をまとめる
	２．生産側の出庫が多ければ販売倉入(10701)とし、生産からの出庫・販売への入庫とする
		販売側の出庫が多ければ生産戻入(10712)とし、販売からの出庫・生産への入庫とする
<ARGUMENTS>
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym
		対象年月
<HISTORY>
*************************************************************************/
DECLARE
	c_max_cnt CONSTANT INTEGER := 10000 ; --バルクインサートでの最大レコード数
	c_off CONSTANT VARCHAR := '0' ;
	c_on CONSTANT VARCHAR := '1' ;

	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_ps_use1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP','PRODSLS');
	c_ps_use2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP','PROD');
	c_ps_use3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PS_USE_TYP','SLS');

	c_prod_itm_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_SO');
	c_prod_itm_ret_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_RET_SO');

	c_act1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP','NON');
	c_act2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ACT_SET_TYP','ALL_SET');

	c_asst1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS');
	c_asst2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');

	c_io_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IN');
	c_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_OUT');

	i INTEGER;
	l_cnt INTEGER;
	l_tmp mgw_wio%ROWTYPE;
	l_rsn mam_ac_rsn.ac_rsn_cd%TYPE;

	l_g_co_parm mam_co_parm%ROWTYPE;
	l_g_lot_use_typ mam_co_parm.lot_use_typ%TYPE;
	l_g_sublot_use_typ mam_co_parm.sublot_use_typ%TYPE;
	l_g_sno1_use_typ mam_co_parm.sno1_use_typ%TYPE;
	l_g_sno2_use_typ mam_co_parm.sno2_use_typ%TYPE;
	l_g_sno3_use_typ mam_co_parm.sno3_use_typ%TYPE;
	l_g_sno4_use_typ mam_co_parm.sno4_use_typ%TYPE;

	l_act_io_id_sub mgw_io.act_io_id_sub%TYPE;
	l_cost_io_typ mgw_io.cost_io_typ%TYPE;
	l_ac_slip_typ mgw_io.ac_slip_typ%TYPE;
	l_qty mgw_io.qty%TYPE;
	l_amt mgw_io.amt%TYPE;
	l_trd_cur_amt mgw_io.trd_cur_amt%TYPE;

	x1 RECORD;
	x2 RECORD;
	x3 RECORD;
/*************************************************************************/
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_MGTIF2MGT.P_IFSUB2');

	l_g_co_parm := mgpa_co_parm$f_get_rec();
	l_g_lot_use_typ := COALESCE(l_g_co_parm.lot_use_typ, c_ps_use1) ;
	l_g_sublot_use_typ := COALESCE(l_g_co_parm.sublot_use_typ, c_ps_use1) ;
	l_g_sno1_use_typ := COALESCE(l_g_co_parm.sno1_use_typ, c_ps_use1) ;
	l_g_sno2_use_typ := COALESCE(l_g_co_parm.sno2_use_typ, c_ps_use1) ;
	l_g_sno3_use_typ := COALESCE(l_g_co_parm.sno3_use_typ, c_ps_use1) ;
	l_g_sno4_use_typ := COALESCE(l_g_co_parm.sno4_use_typ, c_ps_use1) ;

	/* 販売の生産戻入を生産のマイナスの生産戻入とする */
	UPDATE mgw_io$temp w
	SET wg_cd = w.other_wg_cd,
		mng_dpt_cd = w.other_dpt_cd,
		ac_slip_typ = CASE w.zero_effect_flg WHEN c_off THEN c_prod_itm_so ELSE c_prod_itm_ret_so END,
		qty = w.qty * (- 1),
		amt = w.amt * (- 1),
		trd_cur_amt = w.trd_cur_amt * (- 1),
		other_wg_cd = w.wg_cd,
		other_dpt_cd = w.mng_dpt_cd
	WHERE 0=0
	AND w.ac_slip_typ = c_prod_itm_ret_so
	AND w.trd_grp IS NOT NULL
	;

	DELETE FROM mgw_wio w;

	INSERT INTO mgw_wio (
		act_io_id, act_io_id_sub,
		calc_ctg_cd,
		wg_cd, ym, ac_dt,
		mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		cost_io_typ, ac_slip_typ, ac_rsn_cd,
		other_wg_cd, other_dpt_cd,
		bp_cd, stk_bp_cd, asst_typ,
		qty, amt,
		trd_cur_cd, trd_cur_amt, xrate,
		trd_grp, rec_eval_typ, calc_seq, zero_effect_flg
	)
	SELECT
		w.act_io_id, '1',
		w.calc_ctg_cd,
		w.wg_cd, w.ym, w.ac_dt,
		w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
		CASE
			WHEN l_g_lot_use_typ = c_ps_use3 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.lot_act_typ, c_act1) = c_act2 THEN w.lot_no
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sublot_use_typ = c_ps_use3 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sublot_act_typ, c_act1) = c_act2 THEN w.sublot_no
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sno1_use_typ = c_ps_use3 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sno1_act_typ, c_act1) = c_act2 THEN w.sno1
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sno2_use_typ = c_ps_use3 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sno2_act_typ, c_act1) = c_act2 THEN w.sno2
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sno3_use_typ = c_ps_use3 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sno3_act_typ, c_act1) = c_act2 THEN w.sno3
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sno4_use_typ = c_ps_use3 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sno4_act_typ, c_act1) = c_act2 THEN w.sno4
				ELSE c_null_val
			END
		END,
		c_io_stk_out, w.ac_slip_typ, w.ac_rsn_cd,
		w.other_wg_cd, w.other_dpt_cd,
		w.bp_cd, w.stk_bp_cd, c_asst2,
		w.qty, w.amt,
		w.trd_cur_cd, w.trd_cur_amt, w.xrate,
		w.trd_grp, w.rec_eval_typ, COALESCE(m3.calc_seq, 0), w.zero_effect_flg
	FROM mgw_io$temp w
		INNER JOIN mam_itm_srch m ON (
			w.itm_cd = m.itm_cd
			AND w.itm_sub1 = m.itm_sub1
			AND w.itm_sub2 = m.itm_sub2
			AND w.itm_sub3 = m.itm_sub3
			AND m.del_flg = c_off
			AND m.release_flg = c_on)
		LEFT OUTER JOIN mam_calc_ptn m2 ON (
			m.calc_ptn_cd = m2.calc_ptn_cd
			AND m2.del_flg = c_off)
		LEFT OUTER JOIN mam_wg m3 ON (
			w.wg_cd = m3.wg_cd
			AND m3.del_flg = c_off)
	WHERE 0=0
	AND w.ym = i_ym
	AND w.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
	AND w.trd_grp IS NOT NULL
	;

	INSERT INTO mgw_wio (
		act_io_id, act_io_id_sub,
		calc_ctg_cd,
		wg_cd, ym, ac_dt,
		mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		cost_io_typ, ac_slip_typ, ac_rsn_cd,
		other_wg_cd, other_dpt_cd,
		bp_cd, stk_bp_cd, asst_typ,
		qty, amt,
		trd_cur_cd, trd_cur_amt, xrate,
		trd_grp, rec_eval_typ, calc_seq, zero_effect_flg
	)
	SELECT
		w.act_io_id, '2',
		w.calc_ctg_cd,
		w.other_wg_cd, w.ym, w.ac_dt,
		w.other_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
		CASE
			WHEN l_g_lot_use_typ = c_ps_use2 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.lot_act_typ, c_act1) = c_act2 THEN w.lot_no
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sublot_use_typ = c_ps_use2 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sublot_act_typ, c_act1) = c_act2 THEN w.sublot_no
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sno1_use_typ = c_ps_use2 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sno1_act_typ, c_act1) = c_act2 THEN w.sno1
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sno2_use_typ = c_ps_use2 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sno2_act_typ, c_act1) = c_act2 THEN w.sno2
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sno3_use_typ = c_ps_use2 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sno3_act_typ, c_act1) = c_act2 THEN w.sno3
				ELSE c_null_val
			END
		END,
		CASE
			WHEN l_g_sno4_use_typ = c_ps_use2 THEN c_null_val
			ELSE
			CASE
				WHEN COALESCE(m2.sno4_act_typ, c_act1) = c_act2 THEN w.sno4
				ELSE c_null_val
			END
		END,
		c_io_stk_in, w.ac_slip_typ, w.ac_rsn_cd,
		w.wg_cd, w.mng_dpt_cd,
		w.bp_cd, w.stk_bp_cd, c_asst1,
		w.qty, w.amt,
		w.trd_cur_cd, w.trd_cur_amt, w.xrate,
		w.trd_grp, w.rec_eval_typ, COALESCE(m3.calc_seq, 0), w.zero_effect_flg
	FROM mgw_io$temp w
		INNER JOIN mam_itm_srch m ON (
			w.itm_cd = m.itm_cd
			AND w.itm_sub1 = m.itm_sub1
			AND w.itm_sub2 = m.itm_sub2
			AND w.itm_sub3 = m.itm_sub3
			AND m.del_flg = c_off
			AND m.release_flg = c_on)
		LEFT OUTER JOIN mam_calc_ptn m2 ON (
			m.calc_ptn_cd = m2.calc_ptn_cd
			AND m2.del_flg = c_off)
		LEFT OUTER JOIN mam_wg m3 ON (
			w.other_wg_cd = m3.wg_cd
			AND m3.del_flg = c_off)
	WHERE 0=0
	AND w.ym = i_ym
	AND w.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
	AND w.trd_grp IS NOT NULL
	;

	DELETE FROM mgw_wio2 w;

	/* 生販連携の集計 */
	FOR x1 IN
		SELECT w.*
		FROM mgw_wio$temp w
		WHERE 0=0
		AND w.ym = i_ym
		AND w.cost_io_typ = c_io_stk_out
		ORDER BY ABS(w.qty) DESC /* 数量の大きい(絶対値)データから処理 */
	LOOP
		FOR x2 IN
 			SELECT w.*
			FROM mgw_wio$temp w
			WHERE 0=0
			AND w.ym = x1.ym
			AND w.cost_io_typ = c_io_stk_in
			AND w.trd_grp = x1.trd_grp
		LOOP

			<<SKIP_ZERO>>
			BEGIN

				IF x1.zero_effect_flg = c_on THEN
					EXIT SKIP_ZERO;
				END IF;

				IF x1.qty < 0 THEN
					l_tmp := x1;
					x1 := x2;
					x2 := l_tmp;
					x1.qty := x1.qty * - 1;
					x2.qty := x2.qty * - 1;
					x1.amt := x1.amt * - 1;
					x2.amt := x2.amt * - 1;
					x1.trd_cur_amt := x1.trd_cur_amt * - 1;
					x2.trd_cur_amt := x2.trd_cur_amt * - 1;
				END IF;

				l_cnt := 0;
				l_rsn := NULL;
				FOR x3 IN
					SELECT w.gi_ac_rsn_cd ac_rsn_cd
 					FROM mgw_wio2$temp w
 					WHERE 0=0
					AND w.gi_calc_ctg_cd = x2.calc_ctg_cd
					AND w.gi_wg_cd = x2.wg_cd
					AND w.gi_mng_dpt_cd = x2.mng_dpt_cd
					AND w.gi_itm_cd = x2.itm_cd
					AND w.gi_itm_sub1 = x2.itm_sub1
					AND w.gi_itm_sub2 = x2.itm_sub2
					AND w.gi_itm_sub3 = x2.itm_sub3
					AND w.gi_lot_no = x2.lot_no
					AND w.gi_sublot_no = x2.sublot_no
					AND w.gi_sno1 = x2.sno1
					AND w.gi_sno2 = x2.sno2
					AND w.gi_sno3 = x2.sno3
					AND w.gi_sno4 = x2.sno4
					AND (w.gi_bp_cd = x2.bp_cd OR w.gi_bp_cd IS NULL AND x2.bp_cd IS NULL)
					AND (w.gi_stk_bp_cd = x2.stk_bp_cd OR w.gi_stk_bp_cd IS NULL AND x2.stk_bp_cd IS NULL)
					AND w.gi_asst_typ = x2.asst_typ
					AND (w.gi_trd_cur_cd = x2.trd_cur_cd OR w.gi_trd_cur_cd IS NULL AND x2.trd_cur_cd IS NULL)
					AND (w.gi_xrate = x2.xrate OR w.gi_xrate IS NULL AND x2.xrate IS NULL)
					AND w.gi_zero_effect_flg = c_off
					AND w.gr_calc_ctg_cd = x1.calc_ctg_cd
					AND w.gr_wg_cd = x1.wg_cd
					AND w.gr_mng_dpt_cd = x1.mng_dpt_cd
					AND w.gr_itm_cd = x1.itm_cd
					AND w.gr_itm_sub1 = x1.itm_sub1
					AND w.gr_itm_sub2 = x1.itm_sub2
					AND w.gr_itm_sub3 = x1.itm_sub3
					AND w.gr_lot_no = x1.lot_no
					AND w.gr_sublot_no = x1.sublot_no
					AND w.gr_sno1 = x1.sno1
					AND w.gr_sno2 = x1.sno2
					AND w.gr_sno3 = x1.sno3
					AND w.gr_sno4 = x1.sno4
					AND (w.gr_bp_cd = x1.bp_cd OR w.gr_bp_cd IS NULL AND x1.bp_cd IS NULL)
					AND (w.gr_stk_bp_cd = x1.stk_bp_cd OR w.gr_stk_bp_cd IS NULL AND x1.stk_bp_cd IS NULL)
					AND w.gr_asst_typ = x1.asst_typ
					AND (w.gr_trd_cur_cd = x1.trd_cur_cd OR w.gr_trd_cur_cd IS NULL AND x1.trd_cur_cd IS NULL)
					AND (w.gr_xrate = x1.xrate OR w.gr_xrate IS NULL AND x1.xrate IS NULL)
					AND w.gr_zero_effect_flg = c_off
				LOOP
					IF COALESCE(x2.ac_rsn_cd, c_null_val) = COALESCE(x3.ac_rsn_cd, c_null_val) OR l_cnt = 0 THEN
						l_rsn := x3.ac_rsn_cd;
					END IF;
					l_cnt := l_cnt + 1;
				END LOOP;
			END;

			IF l_cnt = 0 OR x1.zero_effect_flg = c_on THEN
				/* 相手が存在しない場合はそのまま作成する */
				INSERT INTO mgw_wio2 (
					gi_act_io_id, gi_act_io_id_sub,
					gi_calc_ctg_cd, gi_wg_cd, gi_ym, gi_ac_dt,
					gi_mng_dpt_cd, gi_itm_cd, gi_itm_sub1, gi_itm_sub2, gi_itm_sub3,
					gi_lot_no, gi_sublot_no, gi_sno1, gi_sno2, gi_sno3, gi_sno4,
					gi_cost_io_typ, gi_ac_slip_typ, gi_ac_rsn_cd,
					gi_bp_cd, gi_stk_bp_cd, gi_asst_typ,
					gi_qty, gi_amt,
					gi_trd_cur_cd, gi_trd_cur_amt, gi_xrate,
					gi_trd_grp, gi_rec_eval_typ, gi_calc_seq, gi_zero_effect_flg,
					gr_act_io_id, gr_act_io_id_sub,
					gr_calc_ctg_cd, gr_wg_cd, gr_ym, gr_ac_dt,
					gr_mng_dpt_cd, gr_itm_cd, gr_itm_sub1, gr_itm_sub2, gr_itm_sub3,
					gr_lot_no, gr_sublot_no, gr_sno1, gr_sno2, gr_sno3, gr_sno4,
					gr_cost_io_typ, gr_ac_slip_typ, gr_ac_rsn_cd,
					gr_bp_cd, gr_stk_bp_cd, gr_asst_typ,
					gr_qty, gr_amt,
					gr_trd_cur_cd, gr_trd_cur_amt, gr_xrate,
					gr_trd_grp, gr_rec_eval_typ, gr_calc_seq, gr_zero_effect_flg
				)
				VALUES (
					x1.act_io_id, x1.act_io_id_sub,
					x1.calc_ctg_cd, x1.wg_cd, x1.ym, x1.ac_dt,
					x1.mng_dpt_cd, x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3,
					x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
					x1.cost_io_typ, x1.ac_slip_typ, x1.ac_rsn_cd,
					x1.bp_cd, x1.stk_bp_cd, x1.asst_typ,
					x1.qty, x1.amt,
					x1.trd_cur_cd, x1.trd_cur_amt, x1.xrate,
					x1.trd_grp, x1.rec_eval_typ, x1.calc_seq, x1.zero_effect_flg,
					x2.act_io_id, x2.act_io_id_sub,
					x2.calc_ctg_cd, x2.wg_cd, x2.ym, x2.ac_dt,
					x2.mng_dpt_cd, x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3,
					x2.lot_no, x2.sublot_no, x2.sno1, x2.sno2, x2.sno3, x2.sno4,
					x2.cost_io_typ, x2.ac_slip_typ, x2.ac_rsn_cd,
					x2.bp_cd, x2.stk_bp_cd, x2.asst_typ,
					x2.qty, x2.amt,
					x2.trd_cur_cd, x2.trd_cur_amt, x2.xrate,
					x2.trd_grp, x2.rec_eval_typ, x2.calc_seq, x2.zero_effect_flg
				)
				;
			ELSE
				/* 相手が存在する場合は集計のため反転して作成する */
				INSERT INTO mgw_wio2 (
					gi_act_io_id, gi_act_io_id_sub,
					gi_calc_ctg_cd, gi_wg_cd, gi_ym, gi_ac_dt,
					gi_mng_dpt_cd, gi_itm_cd, gi_itm_sub1, gi_itm_sub2, gi_itm_sub3,
					gi_lot_no, gi_sublot_no, gi_sno1, gi_sno2, gi_sno3, gi_sno4,
					gi_cost_io_typ, gi_ac_slip_typ, gi_ac_rsn_cd,
					gi_bp_cd, gi_stk_bp_cd, gi_asst_typ,
					gi_qty, gi_amt,
					gi_trd_cur_cd, gi_trd_cur_amt, gi_xrate,
					gi_trd_grp, gi_rec_eval_typ, gi_calc_seq, gi_zero_effect_flg,
					gr_act_io_id, gr_act_io_id_sub,
					gr_calc_ctg_cd, gr_wg_cd, gr_ym, gr_ac_dt,
					gr_mng_dpt_cd, gr_itm_cd, gr_itm_sub1, gr_itm_sub2, gr_itm_sub3,
					gr_lot_no, gr_sublot_no, gr_sno1, gr_sno2, gr_sno3, gr_sno4,
					gr_cost_io_typ, gr_ac_slip_typ, gr_ac_rsn_cd,
					gr_bp_cd, gr_stk_bp_cd, gr_asst_typ,
					gr_qty, gr_amt,
					gr_trd_cur_cd, gr_trd_cur_amt, gr_xrate,
					gr_trd_grp, gr_rec_eval_typ, gr_calc_seq, gr_zero_effect_flg
				)
				VALUES (
					x2.act_io_id, x2.act_io_id_sub,
					x2.calc_ctg_cd, x2.wg_cd, x2.ym, x2.ac_dt,
					x2.mng_dpt_cd, x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3,
					x2.lot_no, x2.sublot_no, x2.sno1, x2.sno2, x2.sno3, x2.sno4,
					x2.cost_io_typ, x2.ac_slip_typ, l_rsn,
					x2.bp_cd, x2.stk_bp_cd, x2.asst_typ,
					(- 1) * x2.qty, (- 1) * x2.amt,
					x2.trd_cur_cd, (- 1) * x2.trd_cur_amt, x2.xrate,
					x2.trd_grp, x2.rec_eval_typ, x2.calc_seq, x2.zero_effect_flg,
					x1.act_io_id, x1.act_io_id_sub,
					x1.calc_ctg_cd, x1.wg_cd, x1.ym, x1.ac_dt,
					x1.mng_dpt_cd, x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3,
					x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
					x1.cost_io_typ, x1.ac_slip_typ, l_rsn,
					x1.bp_cd, x1.stk_bp_cd, x1.asst_typ,
					(- 1) * x1.qty, (- 1) * x1.amt,
					x1.trd_cur_cd, (- 1) * x1.trd_cur_amt, x1.xrate,
					x1.trd_grp, x1.rec_eval_typ, x1.calc_seq, x1.zero_effect_flg
				)
				;
			END IF;
		END LOOP;
	END LOOP;

	DELETE FROM mgw_io w
	WHERE 0=0
	AND w.ym = i_ym
	AND w.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
	AND w.trd_grp IS NOT NULL
	;

	/* MGW_WIO2からMGW_IOへ作成 */
	i := 0 ;
	TRUNCATE TABLE mgpa_ins_mgtif2mgt$p_if$rec_io;
	FOR x3 IN
		SELECT
			MAX(w.gi_act_io_id) gi_act_io_id,
			w.gi_calc_ctg_cd, w.gi_wg_cd, w.gi_ym, MAX(w.gi_ac_dt) gi_ac_dt,
			w.gi_mng_dpt_cd, w.gi_itm_cd, w.gi_itm_sub1, w.gi_itm_sub2, w.gi_itm_sub3,
			w.gi_lot_no, w.gi_sublot_no, w.gi_sno1, w.gi_sno2, w.gi_sno3, w.gi_sno4,
			w.gi_ac_slip_typ, w.gi_ac_rsn_cd,
			w.gi_bp_cd, w.gi_stk_bp_cd, w.gi_asst_typ,
			SUM(w.gi_qty) gi_qty, SUM(w.gi_amt) gi_amt,
			w.gi_trd_cur_cd, SUM(w.gi_trd_cur_amt) gi_trd_cur_amt, w.gi_xrate,
			MAX(w.gi_trd_grp) gi_trd_grp, w.gi_rec_eval_typ,
			w.gi_calc_seq, w.gi_zero_effect_flg,
			MAX(w.gr_act_io_id) gr_act_io_id,
			w.gr_calc_ctg_cd, w.gr_wg_cd, w.gr_ym, MAX(w.gr_ac_dt) gr_ac_dt,
			w.gr_mng_dpt_cd, w.gr_itm_cd, w.gr_itm_sub1, w.gr_itm_sub2, w.gr_itm_sub3,
			w.gr_lot_no, w.gr_sublot_no, w.gr_sno1, w.gr_sno2, w.gr_sno3, w.gr_sno4,
			w.gr_ac_slip_typ, w.gr_ac_rsn_cd,
			w.gr_bp_cd, w.gr_stk_bp_cd, w.gr_asst_typ,
			SUM(w.gr_qty) gr_qty, SUM(w.gr_amt) gr_amt,
			w.gr_trd_cur_cd, SUM(w.gr_trd_cur_amt) gr_trd_cur_amt, w.gr_xrate,
			MAX(w.gr_trd_grp) gr_trd_grp, w.gr_rec_eval_typ,
			w.gr_calc_seq, w.gr_zero_effect_flg
		FROM mgw_wio2$temp w
		WHERE 0=0
		GROUP BY
			w.gi_calc_ctg_cd, w.gi_wg_cd, w.gi_ym,
			w.gi_mng_dpt_cd, w.gi_itm_cd, w.gi_itm_sub1, w.gi_itm_sub2, w.gi_itm_sub3,
			w.gi_lot_no, w.gi_sublot_no, w.gi_sno1, w.gi_sno2, w.gi_sno3, w.gi_sno4,
			w.gi_ac_slip_typ, w.gi_ac_rsn_cd,
			w.gi_bp_cd, w.gi_stk_bp_cd, w.gi_asst_typ,
			w.gi_trd_cur_cd, w.gi_xrate, w.gi_rec_eval_typ,
			w.gi_calc_seq, w.gi_zero_effect_flg,
			w.gr_calc_ctg_cd, w.gr_wg_cd, w.gr_ym,
			w.gr_mng_dpt_cd, w.gr_itm_cd, w.gr_itm_sub1, w.gr_itm_sub2, w.gr_itm_sub3,
			w.gr_lot_no, w.gr_sublot_no, w.gr_sno1, w.gr_sno2, w.gr_sno3, w.gr_sno4,
			w.gr_ac_slip_typ, w.gr_ac_rsn_cd,
			w.gr_bp_cd, w.gr_stk_bp_cd, w.gr_asst_typ,
			w.gr_trd_cur_cd, w.gr_xrate, w.gr_rec_eval_typ,
			w.gr_calc_seq, w.gr_zero_effect_flg
	LOOP

		<<SKIP_OUT>>
		BEGIN

			IF x3.gi_wg_cd <> i_wg_cd THEN
				EXIT SKIP_OUT;
			END IF;

			IF x3.gi_calc_seq = x3.gr_calc_seq
				AND (
					x3.gi_ac_slip_typ = c_prod_itm_so AND x3.gi_qty >= 0
					OR
					x3.gi_ac_slip_typ = c_prod_itm_ret_so AND x3.gi_qty > 0
					)
				OR
				x3.gi_calc_seq < x3.gr_calc_seq
			THEN
				/* 出庫関連をc_io_stk_outで作成する */
				l_act_io_id_sub := '1';
				l_cost_io_typ := c_io_stk_out;
				IF x3.gi_asst_typ = c_asst2 THEN
					l_ac_slip_typ := c_prod_itm_so;
				ELSE
					l_ac_slip_typ := c_prod_itm_ret_so;
				END IF;
				l_qty := x3.gi_qty ;
				l_amt := x3.gi_amt ;
				l_trd_cur_amt := x3.gi_trd_cur_amt ;
			ELSE
				/* 出庫関連をc_io_stk_inで作成する */
				l_act_io_id_sub := '2';
				l_cost_io_typ := c_io_stk_in;
				IF x3.gi_asst_typ = c_asst1 THEN
					l_ac_slip_typ := c_prod_itm_so;
				ELSE
					l_ac_slip_typ := c_prod_itm_ret_so;
				END IF;
				l_qty := (-1) * x3.gi_qty ;
				l_amt := (-1) * x3.gi_amt ;
				l_trd_cur_amt := (-1) * x3.gi_trd_cur_amt ;
			END IF;

			i := i + 1;
			INSERT INTO mgpa_ins_mgtif2mgt$p_if$rec_io (
				_index_,
				act_io_id,
				calc_ctg_cd,
				wg_cd,
				ym,
				ac_dt,
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
				ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd,
				bp_cd,
				stk_bp_cd,
				asst_typ,
				trd_cur_cd,
				xrate,
				trd_grp,
				rec_eval_typ,
				itm_jnl_cd,
				alc_amt_flg,
				zero_effect_flg,
				act_io_id_sub,
				cost_io_typ,
				ac_slip_typ,
				qty,
				amt,
				trd_cur_amt
			)
			VALUES (
				i,
				x3.gi_act_io_id,
				x3.gi_calc_ctg_cd,
				x3.gi_wg_cd,
				x3.gi_ym,
				x3.gi_ac_dt,
				x3.gi_mng_dpt_cd,
				x3.gi_itm_cd,
				x3.gi_itm_sub1,
				x3.gi_itm_sub2,
				x3.gi_itm_sub3,
				x3.gi_lot_no,
				x3.gi_sublot_no,
				x3.gi_sno1,
				x3.gi_sno2,
				x3.gi_sno3,
				x3.gi_sno4,
				x3.gi_ac_rsn_cd,
				x3.gr_wg_cd,
				x3.gr_mng_dpt_cd,
				x3.gi_bp_cd,
				x3.gi_stk_bp_cd,
				x3.gi_asst_typ,
				x3.gi_trd_cur_cd,
				x3.gi_xrate,
				x3.gi_trd_grp,
				x3.gi_rec_eval_typ,
				c_null_val,
				c_off,
				x3.gi_zero_effect_flg,
				l_act_io_id_sub,
				l_cost_io_typ,
				l_ac_slip_typ,
				l_qty,
				l_amt,
				l_trd_cur_amt
			)
			;

		END; --SKIP_OUT

		<<SKIP_IN>>
		BEGIN

			IF x3.gr_wg_cd <> i_wg_cd THEN
				EXIT SKIP_IN;
			END IF;


			IF x3.gi_calc_seq = x3.gr_calc_seq
				AND	(
					x3.gr_ac_slip_typ = c_prod_itm_so AND x3.gr_qty >= 0
					OR
					x3.gr_ac_slip_typ = c_prod_itm_ret_so AND x3.gr_qty > 0
					)
				OR
				x3.gi_calc_seq < x3.gr_calc_seq
			THEN
				--入庫関連をc_io_stk_inで作成する
				l_act_io_id_sub := '2';
				l_cost_io_typ := c_io_stk_in;
				IF x3.gr_asst_typ = c_asst1 THEN
					l_ac_slip_typ := c_prod_itm_so ;
				ELSE
					l_ac_slip_typ := c_prod_itm_ret_so ;
				END IF ;
				l_qty := x3.gr_qty ;
				l_amt := x3.gr_amt ;
				l_trd_cur_amt := x3.gr_trd_cur_amt ;
			ELSE
				--入庫関連をc_io_stk_outで作成する
				l_act_io_id_sub := '1';
				l_cost_io_typ := c_io_stk_out;
				IF x3.gr_asst_typ = c_asst2 THEN
					l_ac_slip_typ := c_prod_itm_so ;
				ELSE
					l_ac_slip_typ := c_prod_itm_ret_so ;
				END IF ;
				l_qty := (-1) * x3.gr_qty ;
				l_amt := (-1) * x3.gr_amt ;
				l_trd_cur_amt := (-1) * x3.gr_trd_cur_amt ;
			END IF ;

			i := i + 1;
			INSERT INTO mgpa_ins_mgtif2mgt$p_if$rec_io (
				_index_,
				act_io_id,
				calc_ctg_cd,
				wg_cd,
				ym,
				ac_dt,
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
				ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd,
				bp_cd,
				stk_bp_cd,
				asst_typ,
				trd_cur_cd,
				xrate,
				trd_grp,
				rec_eval_typ,
				itm_jnl_cd,
				alc_amt_flg,
				zero_effect_flg,
				act_io_id_sub,
				cost_io_typ,
				ac_slip_typ,
				qty,
				amt,
				trd_cur_amt
			)
			VALUES (
				i,
				x3.gr_act_io_id,
				x3.gr_calc_ctg_cd,
				x3.gr_wg_cd,
				x3.gr_ym,
				x3.gr_ac_dt,
				x3.gr_mng_dpt_cd,
				x3.gr_itm_cd,
				x3.gr_itm_sub1,
				x3.gr_itm_sub2,
				x3.gr_itm_sub3,
				x3.gr_lot_no,
				x3.gr_sublot_no,
				x3.gr_sno1,
				x3.gr_sno2,
				x3.gr_sno3,
				x3.gr_sno4,
				x3.gr_ac_rsn_cd,
				x3.gi_wg_cd,
				x3.gi_mng_dpt_cd,
				x3.gr_bp_cd,
				x3.gr_stk_bp_cd,
				x3.gr_asst_typ,
				x3.gr_trd_cur_cd,
				x3.gr_xrate,
				x3.gr_trd_grp,
				x3.gr_rec_eval_typ,
				c_null_val,
				c_off,
				x3.gr_zero_effect_flg,
				l_act_io_id_sub,
				l_cost_io_typ,
				l_ac_slip_typ,
				l_qty,
				l_amt,
				l_trd_cur_amt
			)
			;

		END; --SKIP_IN

		IF i > c_max_cnt THEN
			CALL mgpa_ins_mgtif2mgt$ins_mgw_io();
		END IF;
	END LOOP;

	IF i > 0 THEN
		CALL mgpa_ins_mgtif2mgt$ins_mgw_io();
	END IF;

	DELETE FROM mgw_io w
	WHERE 0=0
	AND w.ym = i_ym
	AND w.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so)
	AND w.trd_grp IS NULL
	AND w.wg_cd <> i_wg_cd
	;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_MGTIF2MGT.P_IFSUB2');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_ifsub3(
	 IN i_wg_cd VARCHAR,
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	部門間移動の入出庫実績を集計する
<REMARKS>
	１．部門間移動の入出庫実績をまとめる
	２．まとめた結果マイナス数量となったときは符号を反転し、管理部門と相手部門を入れ替える
	３．計算順序の小さいＷＧから大きいＷＧへ移動するようなデータを作成する

	TMP_DPT_CDが設定されているときは、部門間出庫のレコードを出庫元部門から
	TMP_DPT_CDへの出庫、TMP_DPT_CDから相手部門への出庫のレコードを作成後に集計する
<ARGUMENTS>
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym
		対象年月
<HISTORY>
*************************************************************************/
DECLARE
	c_off CONSTANT VARCHAR := '0' ;
	c_on CONSTANT VARCHAR := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_str_trd CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_STR','TRD_PREFIX');
	c_dpt_xfr_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_SO');
	c_io_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IN');
	c_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_OUT');

	l_cnt INTEGER;
	l_act_io_id mgw_io.act_io_id%TYPE;
	l_act_io_id_sub mgw_io.act_io_id_sub%TYPE;
	l_wg mgt_act_io.wg_cd%TYPE;
	l_dpt mgt_act_io.mng_dpt_cd%TYPE;
	l_g_co_parm mam_co_parm%ROWTYPE;
	l_g_tmp_dpt mam_cost_dpt.dpt_cd%TYPE ;

	x RECORD;
	y RECORD;
	y2 RECORD;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_MGTIF2MGT.P_IFSUB3');

	l_g_co_parm := mgpa_co_parm$f_get_rec();
	l_g_tmp_dpt := l_g_co_parm.tmp_dpt_cd ;

	<<SKIP_DPT>>
	BEGIN

		IF l_g_tmp_dpt IS NULL THEN
			EXIT SKIP_DPT;
		END IF;

		/* l_g_tmp_dptがNOT NULLのときはl_g_tmp_dptを中継する振替とする */
		FOR x IN (
			SELECT
				w.act_io_id, w.act_io_id_sub,
				w.calc_ctg_cd, w.wg_cd, w.ym, w.ac_dt,
				w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.cost_io_typ, w.ac_slip_typ, w.ac_rsn_cd,
				w.other_wg_cd, w.other_dpt_cd,
				w.bp_cd, w.stk_bp_cd, w.asst_typ,
				w.qty, w.amt,
				w.trd_cur_cd, w.trd_cur_amt, w.xrate,
				w.trd_grp, w.rec_eval_typ, w.zero_effect_flg,
				coalesce(m1.calc_seq, 0) calc_seq,
				coalesce(m2.calc_seq, 0) other_calc_seq
			FROM mgw_io$temp w
	 			LEFT OUTER JOIN mam_wg m1 ON (
					w.wg_cd = m1.wg_cd
					AND m1.del_flg = c_off)
				LEFT OUTER JOIN mam_wg m2 ON (
					w.other_wg_cd = m2.wg_cd
					AND m2.del_flg = c_off)
			WHERE 0=0
			AND w.ym = i_ym
			AND w.ac_slip_typ = c_dpt_xfr_so
			AND (w.wg_cd = i_wg_cd OR w.other_wg_cd = i_wg_cd)
			AND (w.wg_cd <> w.other_wg_cd OR w.mng_dpt_cd <> w.other_dpt_cd)
			AND w.zero_effect_flg = c_off
			)
		LOOP

			<<SKIP_TMP_DPT>>
			BEGIN

				IF x.calc_seq <> x.other_calc_seq THEN
					EXIT SKIP_TMP_DPT;
				END IF ;
		
				INSERT INTO mgw_io (
					act_io_id, act_io_id_sub,
					calc_ctg_cd, wg_cd, ym, ac_dt,
					mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					cost_io_typ, ac_slip_typ, ac_rsn_cd,
					other_wg_cd, other_dpt_cd,
					bp_cd, stk_bp_cd, asst_typ,
					qty, amt,
					trd_cur_cd, trd_cur_amt, xrate,
					trd_grp, rec_eval_typ, zero_effect_flg,
					itm_jnl_cd
				)
				VALUES (
					x.act_io_id, 'x',
					x.calc_ctg_cd, x.other_wg_cd, x.ym, x.ac_dt,
					l_g_tmp_dpt, x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
					x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
					x.cost_io_typ, x.ac_slip_typ, x.ac_rsn_cd,
					x.other_wg_cd, x.other_dpt_cd,
					x.bp_cd, x.stk_bp_cd, x.asst_typ,
					x.qty, x.amt,
					x.trd_cur_cd, x.trd_cur_amt, x.xrate,
					c_str_trd || x.trd_grp, x.rec_eval_typ, x.zero_effect_flg,
					c_null_val
					)
				;
		
				UPDATE mgw_io$temp w
				SET other_wg_cd = x.wg_cd,
					other_dpt_cd = l_g_tmp_dpt
				WHERE w.act_io_id = x.act_io_id
				AND w.act_io_id_sub = x.act_io_id_sub
				;

			END;--SKIP_TMP_DPT

		END LOOP;

	END;--SKIP_DPT

	DELETE FROM mgw_wio w;

	FOR y IN
		SELECT
			t.*,
			COALESCE(m1.calc_seq, 0) calc_seq,
			COALESCE(m2.calc_seq, 0) other_calc_seq
		FROM (
			SELECT
				MAX(w.act_io_id) act_io_id,
				MAX(w.act_io_id_sub) act_io_id_sub,
				w.calc_ctg_cd, w.wg_cd, w.ym,
				MAX(w.ac_dt) ac_dt,
				w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.cost_io_typ, w.ac_slip_typ, w.ac_rsn_cd,
				w.other_wg_cd, w.other_dpt_cd,
				w.bp_cd, w.stk_bp_cd, w.asst_typ,
				SUM(w.qty) qty,
				SUM(w.amt) amt,
				w.trd_cur_cd,
				SUM(w.trd_cur_amt) trd_cur_amt,
				w.xrate,
				MAX(w.trd_grp) trd_grp,
				w.rec_eval_typ,
				w.zero_effect_flg
			FROM mgw_io$temp w
			WHERE 0=0
			AND w.ym = i_ym
			AND w.ac_slip_typ = c_dpt_xfr_so
			AND (w.wg_cd = i_wg_cd OR w.other_wg_cd = i_wg_cd)
			AND (w.wg_cd <> w.other_wg_cd OR w.mng_dpt_cd <> w.other_dpt_cd)
			AND w.zero_effect_flg = c_off
			GROUP BY
				w.calc_ctg_cd, w.wg_cd, w.ym,
				w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.cost_io_typ, w.ac_slip_typ, w.ac_rsn_cd,
				w.other_wg_cd, w.other_dpt_cd,
				w.bp_cd, w.stk_bp_cd, w.asst_typ,
				w.trd_cur_cd,
				w.xrate,
				w.rec_eval_typ,
				w.zero_effect_flg
		) t
			LEFT OUTER JOIN mam_wg m1 ON (
				t.wg_cd = m1.wg_cd
				AND m1.del_flg = c_off)
			LEFT OUTER JOIN mam_wg m2 ON (
				t.other_wg_cd = m2.wg_cd
				AND m2.del_flg = c_off)
		WHERE 0=0
		ORDER BY ABS(t.qty) DESC, t.act_io_id, t.act_io_id_sub
	/* 数量の大きい(絶対値)データから処理 */
	LOOP
		IF y.qty < 0 THEN
			l_wg := y.wg_cd;
			l_dpt := y.mng_dpt_cd;
			y.wg_cd := y.other_wg_cd;
			y.mng_dpt_cd := y.other_dpt_cd;
			y.other_wg_cd := l_wg;
			y.other_dpt_cd := l_dpt;
			y.qty := y.qty * - 1;
			y.amt := y.amt * - 1;
			y.trd_cur_amt := y.trd_cur_amt * - 1;
		END IF;

		l_cnt := 0;
		l_act_io_id := NULL;
		l_act_io_id_sub := NULL;
		FOR y2 IN
			SELECT
				w.act_io_id,
				w.act_io_id_sub,
				w.ac_rsn_cd
			FROM mgw_wio$temp w
			WHERE 0=0
			AND w.calc_ctg_cd = y.calc_ctg_cd
			AND w.wg_cd = y.other_wg_cd
			AND w.mng_dpt_cd = y.other_dpt_cd
			AND w.other_wg_cd = y.wg_cd
			AND w.other_dpt_cd = y.mng_dpt_cd
			AND w.ym = y.ym
			AND w.itm_cd = y.itm_cd
			AND w.itm_sub1 = y.itm_sub1
			AND w.itm_sub2 = y.itm_sub2
			AND w.itm_sub3 = y.itm_sub3
			AND w.lot_no = y.lot_no
			AND w.sublot_no = y.sublot_no
			AND w.sno1 = y.sno1
			AND w.sno2 = y.sno2
			AND w.sno3 = y.sno3
			AND w.sno4 = y.sno4
			AND (w.bp_cd = y.bp_cd OR w.bp_cd IS NULL AND y.bp_cd IS NULL)
			AND (w.stk_bp_cd = y.stk_bp_cd OR w.stk_bp_cd IS NULL AND y.stk_bp_cd IS NULL)
			AND w.asst_typ = y.asst_typ
			AND (w.trd_cur_cd = y.trd_cur_cd OR w.trd_cur_cd IS NULL AND y.trd_cur_cd IS NULL)
			AND (w.xrate = y.xrate OR w.xrate IS NULL AND y.xrate IS NULL)
		LOOP
			IF COALESCE(y.ac_rsn_cd, c_null_val) = COALESCE(y2.ac_rsn_cd, c_null_val) OR l_cnt = 0 THEN
				l_act_io_id := y2.act_io_id;
				l_act_io_id_sub := y2.act_io_id_sub;
				IF l_cnt > 0 THEN
					EXIT ;
				END IF ;
			END IF ;
			l_cnt := l_cnt + 1 ;
		END LOOP;

		IF l_act_io_id IS NULL THEN
			INSERT INTO mgw_wio (
				act_io_id, act_io_id_sub,
				calc_ctg_cd, wg_cd, ym, ac_dt,
				mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				cost_io_typ, ac_slip_typ, ac_rsn_cd,
				other_wg_cd, other_dpt_cd,
				bp_cd, stk_bp_cd, asst_typ,
				qty, amt,
				trd_cur_cd, trd_cur_amt, xrate,
				trd_grp, rec_eval_typ,
				calc_seq, other_calc_seq, zero_effect_flg
			)
			VALUES (
				y.act_io_id, y.act_io_id_sub,
				y.calc_ctg_cd, y.wg_cd, y.ym, y.ac_dt,
				y.mng_dpt_cd, y.itm_cd, y.itm_sub1, y.itm_sub2, y.itm_sub3,
				y.lot_no, y.sublot_no, y.sno1, y.sno2, y.sno3, y.sno4,
				y.cost_io_typ, y.ac_slip_typ, y.ac_rsn_cd,
				y.other_wg_cd, y.other_dpt_cd,
				y.bp_cd, y.stk_bp_cd, y.asst_typ,
				y.qty, y.amt,
				y.trd_cur_cd, y.trd_cur_amt, y.xrate,
				y.trd_grp, y.rec_eval_typ,
				y.calc_seq, y.other_calc_seq, y.zero_effect_flg
				)
			;
		ELSE
			UPDATE mgw_wio$temp w
			SET qty = w.qty + (- 1) * y.qty,
				amt =
					CASE
						WHEN w.amt IS NULL THEN (- 1) * y.amt
						ELSE w.amt + (- 1) * COALESCE(y.amt, 0)
					END,
				trd_cur_amt =
					CASE
						WHEN w.trd_cur_amt IS NULL THEN (- 1) * y.trd_cur_amt
						ELSE w.trd_cur_amt + (- 1) * COALESCE(y.trd_cur_amt, 0)
					END
				WHERE 0=0
				AND w.act_io_id = l_act_io_id
				AND w.act_io_id_sub = l_act_io_id_sub
			;
		END IF;
	END LOOP;

	INSERT INTO mgw_wio (
		act_io_id, act_io_id_sub,
		calc_ctg_cd, wg_cd, ym, ac_dt,
		mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		cost_io_typ, ac_slip_typ, ac_rsn_cd,
		other_wg_cd, other_dpt_cd,
		bp_cd, stk_bp_cd, asst_typ,
		qty, amt,
		trd_cur_cd, trd_cur_amt, xrate,
		trd_grp, rec_eval_typ,
		calc_seq, other_calc_seq, zero_effect_flg
	)
	SELECT
		w.act_io_id, w.act_io_id_sub,
		w.calc_ctg_cd, w.wg_cd, w.ym, w.ac_dt,
		w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
		w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
		w.cost_io_typ, w.ac_slip_typ, w.ac_rsn_cd,
		w.other_wg_cd, w.other_dpt_cd,
		w.bp_cd, w.stk_bp_cd, w.asst_typ,
		w.qty, w.amt,
		w.trd_cur_cd, w.trd_cur_amt, w.xrate,
		w.trd_grp, w.rec_eval_typ,
		COALESCE(m1.calc_seq, 0), COALESCE(m2.calc_seq, 0), w.zero_effect_flg
	FROM mgw_io$temp w
		LEFT OUTER JOIN mam_wg m1 ON (
			w.wg_cd = m1.wg_cd
			AND m1.del_flg = c_off)
		LEFT OUTER JOIN mam_wg m2 ON (
			w.other_wg_cd = m2.wg_cd
			AND m2.del_flg = c_off)
	WHERE 0=0
	AND w.ym = i_ym
	AND w.ac_slip_typ = c_dpt_xfr_so
	AND (w.wg_cd = i_wg_cd OR w.other_wg_cd = i_wg_cd)
	AND (w.wg_cd <> w.other_wg_cd OR w.mng_dpt_cd <> w.other_dpt_cd)
	AND w.zero_effect_flg = c_on
	;

	DELETE FROM mgw_io w
	WHERE w.ym = i_ym
	AND w.ac_slip_typ = c_dpt_xfr_so
	;

	/* 同じ計算順序で数量が０以上または異なる計算順序で出庫元の計算順序が小さい場合の出庫データ */
	INSERT INTO mgw_io (
		act_io_id, act_io_id_sub,
		calc_ctg_cd, wg_cd, ym, ac_dt,
		mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		cost_io_typ, ac_slip_typ, ac_rsn_cd,
		other_wg_cd, other_dpt_cd,
		bp_cd, stk_bp_cd, asst_typ,
		qty, amt,
		trd_cur_cd, trd_cur_amt, xrate,
		trd_grp, rec_eval_typ, zero_effect_flg,
		itm_jnl_cd
	)
	SELECT
		w.act_io_id, CONCAT('1', w.act_io_id_sub),
		w.calc_ctg_cd, w.wg_cd, w.ym, w.ac_dt,
		w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
		w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
		c_io_stk_out, w.ac_slip_typ, w.ac_rsn_cd,
		w.other_wg_cd, w.other_dpt_cd,
		w.bp_cd, w.stk_bp_cd, w.asst_typ,
		w.qty, w.amt,
		w.trd_cur_cd, w.trd_cur_amt, w.xrate,
		w.trd_grp, w.rec_eval_typ, w.zero_effect_flg,
		c_null_val
	FROM mgw_wio$temp w
	WHERE 0=0
	AND w.wg_cd = i_wg_cd
	AND (w.calc_seq = w.other_calc_seq AND w.qty >= 0 OR w.calc_seq < w.other_calc_seq)
	;

	/* 同じ計算順序で数量が０以上または異なる計算順序で出庫元の計算順序が小さい場合の入庫データ */
	INSERT INTO mgw_io (
		act_io_id, act_io_id_sub,
		calc_ctg_cd, wg_cd, ym, ac_dt,
		mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		cost_io_typ, ac_slip_typ, ac_rsn_cd,
		other_wg_cd, other_dpt_cd,
		bp_cd, stk_bp_cd, asst_typ,
		qty, amt,
		trd_cur_cd, trd_cur_amt, xrate,
		trd_grp, rec_eval_typ, zero_effect_flg,
		itm_jnl_cd
	)
	SELECT
		w.act_io_id, CONCAT('2', w.act_io_id_sub),
		w.calc_ctg_cd, w.other_wg_cd, w.ym, w.ac_dt,
		w.other_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
		w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
		c_io_stk_in, w.ac_slip_typ, w.ac_rsn_cd,
		w.wg_cd, w.mng_dpt_cd,
		w.bp_cd, w.stk_bp_cd, w.asst_typ,
		w.qty, w.amt,
		w.trd_cur_cd, w.trd_cur_amt, w.xrate,
		w.trd_grp, w.rec_eval_typ, w.zero_effect_flg,
		c_null_val
	FROM mgw_wio$temp w
	WHERE 0=0
	AND w.other_wg_cd = i_wg_cd
	AND (w.calc_seq = w.other_calc_seq AND w.qty >= 0 OR w.calc_seq < w.other_calc_seq)
	;

	/* 同じ計算順序で数量が０未満または異なる計算順序で出庫元の計算順序が大きい場合の出庫データ */
	INSERT INTO mgw_io (
		act_io_id, act_io_id_sub,
		calc_ctg_cd, wg_cd, ym, ac_dt,
		mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		cost_io_typ, ac_slip_typ, ac_rsn_cd,
		other_wg_cd, other_dpt_cd,
		bp_cd, stk_bp_cd, asst_typ,
		qty, amt,
		trd_cur_cd, trd_cur_amt, xrate,
		trd_grp, rec_eval_typ, zero_effect_flg,
		itm_jnl_cd
	)
	SELECT
		w.act_io_id, CONCAT('1', w.act_io_id_sub),
		w.calc_ctg_cd, w.other_wg_cd, w.ym, w.ac_dt,
		w.other_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
		w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
		c_io_stk_out, w.ac_slip_typ, w.ac_rsn_cd,
		w.wg_cd, w.mng_dpt_cd,
		w.bp_cd, w.stk_bp_cd, w.asst_typ,
		(- 1) * w.qty, (- 1) * w.amt,
		w.trd_cur_cd, (- 1) * w.trd_cur_amt, w.xrate,
		w.trd_grp, w.rec_eval_typ, w.zero_effect_flg,
		c_null_val
	FROM mgw_wio$temp w
	WHERE 0=0
	AND w.other_wg_cd = i_wg_cd
	AND (w.calc_seq = w.other_calc_seq AND w.qty < 0 OR w.calc_seq > w.other_calc_seq)
	;

	/* 同じ計算順序で数量が０未満または異なる計算順序で出庫元の計算順序が大きい場合の入庫データ */
	INSERT INTO mgw_io (
		act_io_id, act_io_id_sub,
		calc_ctg_cd, wg_cd, ym, ac_dt,
		mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		cost_io_typ, ac_slip_typ, ac_rsn_cd,
		other_wg_cd, other_dpt_cd,
		bp_cd, stk_bp_cd, asst_typ,
		qty, amt,
		trd_cur_cd, trd_cur_amt, xrate,
		trd_grp, rec_eval_typ, zero_effect_flg,
		itm_jnl_cd
	)
	SELECT
		w.act_io_id, CONCAT('2', w.act_io_id_sub),
		w.calc_ctg_cd, w.wg_cd, w.ym, w.ac_dt,
		w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
		w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
		c_io_stk_in, w.ac_slip_typ, w.ac_rsn_cd,
		w.other_wg_cd, w.other_dpt_cd,
		w.bp_cd, w.stk_bp_cd, w.asst_typ,
		(- 1) * w.qty, (- 1) * w.amt,
		w.trd_cur_cd, (- 1) * w.trd_cur_amt, w.xrate,
		w.trd_grp, w.rec_eval_typ, w.zero_effect_flg,
		c_null_val
	FROM mgw_wio$temp w
	WHERE 0=0
	AND w.wg_cd = i_wg_cd
	AND (w.calc_seq = w.other_calc_seq AND w.qty < 0 OR w.calc_seq > w.other_calc_seq)
	;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_MGTIF2MGT.P_IFSUB3');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_ifsub4(
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	品目間振替の入出庫実績を集計する
<REMARKS>
	１．同一の振替情報は出庫数から入庫数を差し引く
	２．品目振替をまとめる
<ARGUMENTS>
<IN>	i_ym
		対象年月
<HISTORY>
*************************************************************************/
DECLARE
	c_max_cnt CONSTANT INTEGER := 10000 ; --バルクインサートでの最大レコード数
	c_off CONSTANT VARCHAR := '0' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	c_stk_sw_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_SO');
	c_stk_sw_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_GR');
	c_io_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IN');
	c_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_OUT');

	i INTEGER;
	l_qty_s mgw_io.qty%TYPE;
	l_amt_s mgw_io.amt%TYPE;
	l_tamt_s mgw_io.trd_cur_amt%TYPE;
	l_cnt INTEGER;
	l_cnt2 INTEGER;
	l_tmp mgw_io%ROWTYPE;
	l_rsn mam_ac_rsn.ac_rsn_cd%TYPE;

	l_cost_io_typ mgw_io.cost_io_typ%TYPE;
	l_ac_slip_typ mgw_io.ac_slip_typ%TYPE;
	l_qty mgw_io.qty%TYPE;
	l_amt mgw_io.amt%TYPE;
	l_trd_cur_amt mgw_io.trd_cur_amt%TYPE;

	x1 RECORD;
	x2 RECORD;
	x3 RECORD;
/************************************************************************/
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_MGTIF2MGT.P_IFSUB4');

	/* 同一の振替情報は出庫数から入庫数を差し引く */
	FOR x1 IN
		SELECT
			w.act_io_id, w.act_io_id_sub,
			w.calc_ctg_cd, w.wg_cd, w.ym,
			w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
			w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
			w.bp_cd, w.stk_bp_cd, w.asst_typ,
			w.qty, w.amt,
			w.trd_cur_cd, w.trd_cur_amt, w.xrate,
			w.trd_grp
		FROM mgw_io$temp w
		WHERE 0=0
		AND w.ym = i_ym
		AND w.trd_grp IS NOT NULL
		AND w.ac_slip_typ = c_stk_sw_so
		AND w.zero_effect_flg = c_off
	LOOP
		l_qty_s := x1.qty ;
		l_amt_s := x1.amt ;
		l_tamt_s := x1.trd_cur_amt ;

		FOR x2 IN
			SELECT
				w.act_io_id, w.act_io_id_sub,
				w.qty,
				w.amt,
				w.trd_cur_amt
			FROM mgw_io$temp w
			WHERE 0=0
			AND w.calc_ctg_cd = x1.calc_ctg_cd
			AND w.wg_cd = x1.wg_cd
			AND w.mng_dpt_cd = x1.mng_dpt_cd
			AND w.ym = x1.ym
			AND w.itm_cd = x1.itm_cd
			AND w.itm_sub1 = x1.itm_sub1
			AND w.itm_sub2 = x1.itm_sub2
			AND w.itm_sub3 = x1.itm_sub3
			AND w.lot_no = x1.lot_no
			AND w.sublot_no = x1.sublot_no
			AND w.sno1 = x1.sno1
			AND w.sno2 = x1.sno2
			AND w.sno3 = x1.sno3
			AND w.sno4 = x1.sno4
			AND (w.bp_cd = x1.bp_cd OR w.bp_cd IS NULL AND x1.bp_cd IS NULL)
			AND (w.stk_bp_cd = x1.stk_bp_cd OR w.stk_bp_cd IS NULL AND x1.stk_bp_cd IS NULL)
			AND w.asst_typ = x1.asst_typ
			AND (w.trd_cur_cd = x1.trd_cur_cd OR w.trd_cur_cd IS NULL AND x1.trd_cur_cd IS NULL)
			AND (w.xrate = x1.xrate OR w.xrate IS NULL AND x1.xrate IS NULL)
			AND w.trd_grp = x1.trd_grp
			AND w.ac_slip_typ = c_stk_sw_gr
			AND w.zero_effect_flg = c_off
		LOOP

			IF l_qty_s < x2.qty THEN
				l_qty_s := x2.qty - l_qty_s ;

				IF l_amt_s IS NULL THEN
					l_amt_s := x2.amt ;
				ELSE
					l_amt_s := COALESCE(x2.amt, 0) - l_amt_s ;
				END IF ;

				IF l_tamt_s IS NULL THEN
					l_tamt_s := x2.trd_cur_amt ;
				ELSE
					l_tamt_s := COALESCE(x2.trd_cur_amt, 0) - l_tamt_s ;
				END IF ;

				UPDATE mgw_io$temp w
				SET qty = l_qty_s,
					amt = l_amt_s,
					trd_cur_amt = l_tamt_s
				WHERE 0=0
				AND w.act_io_id = x2.act_io_id
				AND w.act_io_id_sub = x2.act_io_id_sub
				;

				l_qty_s := 0 ;

				IF l_amt_s IS NOT NULL THEN
					l_amt_s := 0 ;
				END IF ;

				IF l_tamt_s IS NOT NULL THEN
					l_tamt_s := 0 ;
				END IF ;
			ELSE

				DELETE FROM mgw_io w WHERE w.act_io_id = x2.act_io_id AND w.act_io_id_sub = x2.act_io_id_sub;
				l_qty_s := l_qty_s - x2.qty ;

				IF l_amt_s IS NULL THEN
					l_amt_s := (-1) * x2.amt ;
				ELSE
					l_amt_s := l_amt_s - COALESCE(x2.amt, 0) ;
				END IF ;

				IF l_tamt_s IS NULL THEN
					l_tamt_s := (-1) * x2.trd_cur_amt ;
				ELSE
					l_tamt_s := l_tamt_s - COALESCE(x2.trd_cur_amt, 0) ;
				END IF ;

			END IF ;

			IF l_qty_s = 0
			AND (l_amt_s IS NULL OR l_amt_s = 0)
			AND (l_tamt_s IS NULL OR l_tamt_s = 0)
			THEN
				EXIT ;
			END IF ;

		END LOOP ;

		SELECT COUNT(*)
		INTO STRICT l_cnt
		FROM mgw_io$temp w
		WHERE 0=0
		AND w.ym = x1.ym
		AND w.ac_slip_typ = c_stk_sw_so
		AND w.act_io_id <> x1.act_io_id
		AND w.act_io_id_sub <> x1.act_io_id_sub
		AND w.trd_grp = x1.trd_grp
		AND w.zero_effect_flg = c_off
		;

		IF l_cnt <> 0 AND l_qty_s = 0
		AND (l_amt_s IS NULL OR l_amt_s = 0)
		AND (l_tamt_s IS NULL OR l_tamt_s = 0)
		THEN
			--入庫もなく数量も０のときは無効にする
			DELETE FROM mgw_io w WHERE w.act_io_id = x1.act_io_id AND w.act_io_id_sub = x1.act_io_id_sub;
		ELSE
			--数量、金額を更新する
			UPDATE mgw_io$temp w
			SET qty = l_qty_s,
				amt = l_amt_s,
				trd_cur_amt = l_tamt_s
			WHERE 0=0
			AND w.act_io_id = x1.act_io_id
			AND w.act_io_id_sub = x1.act_io_id_sub
			;
		END IF ;
	END LOOP;

	DELETE FROM mgw_wio2 w;

	/* 品目振替の集計 */
	FOR x1 IN
		SELECT w.*
		FROM mgw_io$temp w
		WHERE 0=0
		AND w.ym = i_ym
		AND w.ac_slip_typ = c_stk_sw_so
		AND w.trd_grp IS NOT NULL
		AND w.zero_effect_flg = c_off
 		ORDER BY ABS(w.qty) DESC /* 数量の大きい(絶対値)データから処理 */
	LOOP
		/* 1:1の振替のみ対応 */
		SELECT
			SUM(CASE w.ac_slip_typ
					WHEN c_stk_sw_so THEN 1
					ELSE 0
				END),
			SUM(CASE w.ac_slip_typ
					WHEN c_stk_sw_gr THEN 1
					ELSE 0
				END)
		INTO STRICT l_cnt, l_cnt2
		FROM mgw_io$temp w
		WHERE 0=0
		AND w.ym = x1.ym
		AND w.ac_slip_typ IN (c_stk_sw_so, c_stk_sw_gr)
		AND w.trd_grp = x1.trd_grp
		AND w.zero_effect_flg = c_off
		AND (x1.qty >= 0 AND w.qty >= 0 OR x1.qty < 0 AND w.qty < 0)
		;

		IF l_cnt = 1 AND l_cnt2 = 1 THEN
			/* 1:1はMGW_WIO2に作成する */
			FOR x2 IN
				SELECT w.*
				FROM mgw_io$temp w
				WHERE 0=0
				AND w.ym = x1.ym
				AND w.ac_slip_typ = c_stk_sw_gr
				AND w.trd_grp = x1.trd_grp
				AND w.zero_effect_flg = c_off
				AND (x1.qty >= 0 AND w.qty >= 0 OR x1.qty < 0 AND w.qty < 0)
			LOOP
				IF x1.qty < 0 AND x2.qty < 0 THEN
					l_tmp := x1;
					x1 := x2;
					x2 := l_tmp;
					x1.qty := x1.qty * - 1;
					x2.qty := x2.qty * - 1;
					x1.amt := x1.amt * - 1;
					x2.amt := x2.amt * - 1;
					x1.trd_cur_amt := x1.trd_cur_amt * - 1;
					x2.trd_cur_amt := x2.trd_cur_amt * - 1;
				END IF;

				l_cnt := 0;
				l_rsn := NULL;
				FOR x3 IN
					SELECT w.gi_ac_rsn_cd ac_rsn_cd
					FROM mgw_wio2$temp w
					WHERE 0=0
					AND w.gi_calc_ctg_cd = x2.calc_ctg_cd
					AND w.gi_wg_cd = x2.wg_cd
					AND w.gi_mng_dpt_cd = x2.mng_dpt_cd
					AND w.gi_itm_cd = x2.itm_cd
					AND w.gi_itm_sub1 = x2.itm_sub1
					AND w.gi_itm_sub2 = x2.itm_sub2
					AND w.gi_itm_sub3 = x2.itm_sub3
					AND w.gi_lot_no = x2.lot_no
					AND w.gi_sublot_no = x2.sublot_no
					AND w.gi_sno1 = x2.sno1
					AND w.gi_sno2 = x2.sno2
					AND w.gi_sno3 = x2.sno3
					AND w.gi_sno4 = x2.sno4
					AND (w.gi_bp_cd = x2.bp_cd OR w.gi_bp_cd IS NULL AND x2.bp_cd IS NULL)
					AND (w.gi_stk_bp_cd = x2.stk_bp_cd OR w.gi_stk_bp_cd IS NULL AND x2.stk_bp_cd IS NULL)
					AND w.gi_asst_typ = x2.asst_typ
					AND (w.gi_trd_cur_cd = x2.trd_cur_cd OR w.gi_trd_cur_cd IS NULL AND x2.trd_cur_cd IS NULL)
					AND (w.gi_xrate = x2.xrate OR w.gi_xrate IS NULL AND x2.xrate IS NULL)
					AND w.gr_calc_ctg_cd = x1.calc_ctg_cd
					AND w.gr_wg_cd = x1.wg_cd
					AND w.gr_mng_dpt_cd = x1.mng_dpt_cd
					AND w.gr_itm_cd = x1.itm_cd
					AND w.gr_itm_sub1 = x1.itm_sub1
					AND w.gr_itm_sub2 = x1.itm_sub2
					AND w.gr_itm_sub3 = x1.itm_sub3
					AND w.gr_lot_no = x1.lot_no
					AND w.gr_sublot_no = x1.sublot_no
					AND w.gr_sno1 = x1.sno1
					AND w.gr_sno2 = x1.sno2
					AND w.gr_sno3 = x1.sno3
					AND w.gr_sno4 = x1.sno4
					AND (w.gr_bp_cd = x1.bp_cd OR w.gr_bp_cd IS NULL AND x1.bp_cd IS NULL)
					AND (w.gr_stk_bp_cd = x1.stk_bp_cd OR w.gr_stk_bp_cd IS NULL AND x1.stk_bp_cd IS NULL)
					AND w.gr_asst_typ = x1.asst_typ
					AND (w.gr_trd_cur_cd = x1.trd_cur_cd OR w.gr_trd_cur_cd IS NULL AND x1.trd_cur_cd IS NULL)
					AND (w.gr_xrate = x1.xrate OR w.gr_xrate IS NULL AND x1.xrate IS NULL)
				LOOP
					IF COALESCE(x2.ac_rsn_cd, c_null_val) = COALESCE(x3.ac_rsn_cd, c_null_val) OR l_cnt = 0 THEN
						l_rsn := x3.ac_rsn_cd;
					END IF;
					l_cnt := l_cnt + 1;
				END LOOP;

				IF l_cnt = 0 THEN
					/* 相手が存在しない場合はそのまま作成する */
					INSERT INTO mgw_wio2 (
						gi_act_io_id, gi_act_io_id_sub,
						gi_calc_ctg_cd, gi_wg_cd, gi_ym, gi_ac_dt,
						gi_mng_dpt_cd, gi_itm_cd, gi_itm_sub1, gi_itm_sub2, gi_itm_sub3,
						gi_lot_no, gi_sublot_no, gi_sno1, gi_sno2, gi_sno3, gi_sno4,
						gi_cost_io_typ, gi_ac_slip_typ, gi_ac_rsn_cd,
						gi_bp_cd, gi_stk_bp_cd, gi_asst_typ,
						gi_qty, gi_amt,
						gi_trd_cur_cd, gi_trd_cur_amt, gi_xrate,
						gi_trd_grp, gi_rec_eval_typ, gi_zero_effect_flg,
						gr_act_io_id, gr_act_io_id_sub,
						gr_calc_ctg_cd, gr_wg_cd, gr_ym, gr_ac_dt,
						gr_mng_dpt_cd, gr_itm_cd, gr_itm_sub1, gr_itm_sub2, gr_itm_sub3,
						gr_lot_no, gr_sublot_no, gr_sno1, gr_sno2, gr_sno3, gr_sno4,
						gr_cost_io_typ, gr_ac_slip_typ, gr_ac_rsn_cd,
						gr_bp_cd, gr_stk_bp_cd, gr_asst_typ,
						gr_qty, gr_amt,
						gr_trd_cur_cd, gr_trd_cur_amt, gr_xrate,
						gr_trd_grp, gr_rec_eval_typ, gr_zero_effect_flg
					)
					VALUES (
						x1.act_io_id, x1.act_io_id_sub,
						x1.calc_ctg_cd, x1.wg_cd, x1.ym, x1.ac_dt,
						x1.mng_dpt_cd, x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3,
						x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
						x1.cost_io_typ, x1.ac_slip_typ, x1.ac_rsn_cd,
						x1.bp_cd, x1.stk_bp_cd, x1.asst_typ,
						x1.qty, x1.amt,
						x1.trd_cur_cd, x1.trd_cur_amt, x1.xrate,
						x1.trd_grp, x1.rec_eval_typ, x1.zero_effect_flg,
						x2.act_io_id, x2.act_io_id_sub,
						x2.calc_ctg_cd, x2.wg_cd, x2.ym, x2.ac_dt,
						x2.mng_dpt_cd, x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3,
						x2.lot_no, x2.sublot_no, x2.sno1, x2.sno2, x2.sno3, x2.sno4,
						x2.cost_io_typ, x2.ac_slip_typ, x2.ac_rsn_cd,
						x2.bp_cd, x2.stk_bp_cd, x2.asst_typ,
						x2.qty, x2.amt,
						x2.trd_cur_cd, x2.trd_cur_amt, x2.xrate,
						x2.trd_grp, x2.rec_eval_typ, x2.zero_effect_flg
						)
					;
				ELSE
					/* 相手が存在する場合は集計のため反転して作成する */
					INSERT INTO mgw_wio2 (
						gi_act_io_id, gi_act_io_id_sub,
						gi_calc_ctg_cd, gi_wg_cd, gi_ym, gi_ac_dt,
						gi_mng_dpt_cd, gi_itm_cd, gi_itm_sub1, gi_itm_sub2, gi_itm_sub3,
						gi_lot_no, gi_sublot_no, gi_sno1, gi_sno2, gi_sno3, gi_sno4,
						gi_cost_io_typ, gi_ac_slip_typ, gi_ac_rsn_cd,
						gi_bp_cd, gi_stk_bp_cd, gi_asst_typ,
						gi_qty, gi_amt,
						gi_trd_cur_cd, gi_trd_cur_amt, gi_xrate,
						gi_trd_grp, gi_rec_eval_typ, gi_zero_effect_flg,
						gr_act_io_id, gr_act_io_id_sub,
						gr_calc_ctg_cd, gr_wg_cd, gr_ym, gr_ac_dt,
						gr_mng_dpt_cd, gr_itm_cd, gr_itm_sub1, gr_itm_sub2, gr_itm_sub3,
						gr_lot_no, gr_sublot_no, gr_sno1, gr_sno2, gr_sno3, gr_sno4,
						gr_cost_io_typ, gr_ac_slip_typ, gr_ac_rsn_cd,
						gr_bp_cd, gr_stk_bp_cd, gr_asst_typ,
						gr_qty, gr_amt,
						gr_trd_cur_cd, gr_trd_cur_amt, gr_xrate,
						gr_trd_grp, gr_rec_eval_typ, gr_zero_effect_flg
					)
					VALUES (
						x2.act_io_id, x2.act_io_id_sub,
						x2.calc_ctg_cd, x2.wg_cd, x2.ym, x2.ac_dt,
						x2.mng_dpt_cd, x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3,
						x2.lot_no, x2.sublot_no, x2.sno1, x2.sno2, x2.sno3, x2.sno4,
						x2.cost_io_typ, x2.ac_slip_typ, l_rsn,
						x2.bp_cd, x2.stk_bp_cd, x2.asst_typ,
						(- 1) * x2.qty, (- 1) * x2.amt,
						x2.trd_cur_cd, (- 1) * x2.trd_cur_amt, x2.xrate,
						x2.trd_grp, x2.rec_eval_typ, x2.zero_effect_flg,
						x1.act_io_id, x1.act_io_id_sub,
						x1.calc_ctg_cd, x1.wg_cd, x1.ym, x1.ac_dt,
						x1.mng_dpt_cd, x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3,
						x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
						x1.cost_io_typ, x1.ac_slip_typ, l_rsn,
						x1.bp_cd, x1.stk_bp_cd, x1.asst_typ,
						(- 1) * x1.qty, (- 1) * x1.amt,
						x1.trd_cur_cd, (- 1) * x1.trd_cur_amt, x1.xrate,
						x1.trd_grp, x1.rec_eval_typ, x1.zero_effect_flg
						)
					;
				END IF;
			END LOOP;
		END IF;
	END LOOP;

	/* MGW_WIO2に作成したデータはMGW_IOから削除する */
	DELETE FROM mgw_io t
	WHERE 0=0
	AND EXISTS (
 			SELECT 'X'
			FROM mgw_wio2$temp w
			WHERE 0=0
			AND w.gi_act_io_id = t.act_io_id
			AND w.gi_act_io_id_sub = t.act_io_id_sub
		)
	;

	DELETE FROM mgw_io t
	WHERE 0=0
	AND EXISTS (
			SELECT 'X'
			FROM mgw_wio2$temp w
			WHERE 0=0
			AND w.gr_act_io_id = t.act_io_id
			AND w.gr_act_io_id_sub = t.act_io_id_sub
		)
	;

	/* MGW_WIO2からMGW_IOへ作成 */
	i := 0 ;
	TRUNCATE TABLE mgpa_ins_mgtif2mgt$p_if$rec_io;
	FOR x3 IN
		SELECT
			MAX(w.gi_act_io_id) gi_act_io_id,
			MAX(w.gi_act_io_id_sub) gi_act_io_id_sub,
			w.gi_calc_ctg_cd, w.gi_wg_cd, w.gi_ym, MAX(w.gi_ac_dt) gi_ac_dt,
			w.gi_mng_dpt_cd, w.gi_itm_cd, w.gi_itm_sub1, w.gi_itm_sub2, w.gi_itm_sub3,
			w.gi_lot_no, w.gi_sublot_no, w.gi_sno1, w.gi_sno2, w.gi_sno3, w.gi_sno4,
			w.gi_ac_rsn_cd,
			w.gi_bp_cd, w.gi_stk_bp_cd, w.gi_asst_typ,
			SUM(w.gi_qty) gi_qty, SUM(w.gi_amt) gi_amt,
			w.gi_trd_cur_cd, SUM(w.gi_trd_cur_amt) gi_trd_cur_amt, w.gi_xrate,
			MAX(w.gi_trd_grp) gi_trd_grp, w.gi_rec_eval_typ, w.gi_zero_effect_flg,
			MAX(w.gr_act_io_id) gr_act_io_id,
			MAX(w.gr_act_io_id_sub) gr_act_io_id_sub,
			w.gr_calc_ctg_cd, w.gr_wg_cd, w.gr_ym, MAX(w.gr_ac_dt) gr_ac_dt,
			w.gr_mng_dpt_cd, w.gr_itm_cd, w.gr_itm_sub1, w.gr_itm_sub2, w.gr_itm_sub3,
			w.gr_lot_no, w.gr_sublot_no, w.gr_sno1, w.gr_sno2, w.gr_sno3, w.gr_sno4,
			w.gr_ac_rsn_cd,
			w.gr_bp_cd, w.gr_stk_bp_cd, w.gr_asst_typ,
			SUM(w.gr_qty) gr_qty, SUM(w.gr_amt) gr_amt,
			w.gr_trd_cur_cd, SUM(w.gr_trd_cur_amt) gr_trd_cur_amt, w.gr_xrate,
			MAX(w.gr_trd_grp) gr_trd_grp, w.gr_rec_eval_typ, w.gr_zero_effect_flg
		FROM mgw_wio2$temp w
		WHERE 0=0
		GROUP BY
			w.gi_calc_ctg_cd, w.gi_wg_cd, w.gi_ym,
			w.gi_mng_dpt_cd, w.gi_itm_cd, w.gi_itm_sub1, w.gi_itm_sub2, w.gi_itm_sub3,
			w.gi_lot_no, w.gi_sublot_no, w.gi_sno1, w.gi_sno2, w.gi_sno3, w.gi_sno4,
			w.gi_ac_rsn_cd,
			w.gi_bp_cd, w.gi_stk_bp_cd, w.gi_asst_typ,
			w.gi_trd_cur_cd, w.gi_xrate, w.gi_rec_eval_typ, w.gi_zero_effect_flg,
			w.gr_calc_ctg_cd, w.gr_wg_cd, w.gr_ym,
			w.gr_mng_dpt_cd, w.gr_itm_cd, w.gr_itm_sub1, w.gr_itm_sub2, w.gr_itm_sub3,
			w.gr_lot_no, w.gr_sublot_no, w.gr_sno1, w.gr_sno2, w.gr_sno3, w.gr_sno4,
			w.gr_ac_rsn_cd,
			w.gr_bp_cd, w.gr_stk_bp_cd, w.gr_asst_typ,
			w.gr_trd_cur_cd, w.gr_xrate, w.gr_rec_eval_typ, w.gr_zero_effect_flg
	LOOP
		i := i + 1 ;
		/* 出庫関連 */
		IF x3.gi_qty > 0 THEN
			--出庫関連をc_io_stk_outで作成する
			l_cost_io_typ := c_io_stk_out ;
			l_ac_slip_typ := c_stk_sw_so ;
			l_qty := x3.gi_qty ;
			l_amt := x3.gi_amt ;
			l_trd_cur_amt := x3.gi_trd_cur_amt ;
		ELSE
			--出庫関連をc_io_stk_inで作成する
			l_cost_io_typ := c_io_stk_in ;
			l_ac_slip_typ := c_stk_sw_gr ;
			l_qty := (-1) * x3.gi_qty ;
			l_amt := (-1) * x3.gi_amt ;
			l_trd_cur_amt := (-1) * x3.gi_trd_cur_amt ;
		END IF ;

		INSERT INTO mgpa_ins_mgtif2mgt$p_if$rec_io (
			_index_,
			act_io_id,
			act_io_id_sub,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
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
			ac_rsn_cd,
			other_wg_cd,
			other_dpt_cd,
			bp_cd,
			stk_bp_cd,
			asst_typ,
			trd_cur_cd,
			xrate,
			trd_grp,
			rec_eval_typ,
			itm_jnl_cd,
			alc_amt_flg,
			zero_effect_flg,
			cost_io_typ,
			ac_slip_typ,
			qty,
			amt,
			trd_cur_amt
		)
		VALUES (
			i,
			x3.gi_act_io_id,
			x3.gi_act_io_id_sub,
			x3.gi_calc_ctg_cd,
			x3.gi_wg_cd,
			x3.gi_ym,
			x3.gi_ac_dt,
			x3.gi_mng_dpt_cd,
			x3.gi_itm_cd,
			x3.gi_itm_sub1,
			x3.gi_itm_sub2,
			x3.gi_itm_sub3,
			x3.gi_lot_no,
			x3.gi_sublot_no,
			x3.gi_sno1,
			x3.gi_sno2,
			x3.gi_sno3,
			x3.gi_sno4,
			x3.gi_ac_rsn_cd,
			x3.gr_wg_cd,
			x3.gr_mng_dpt_cd,
			x3.gi_bp_cd,
			x3.gi_stk_bp_cd,
			x3.gi_asst_typ,
			x3.gi_trd_cur_cd,
			x3.gi_xrate,
			x3.gi_trd_grp,
			x3.gi_rec_eval_typ,
			c_null_val,
			c_off,
			x3.gi_zero_effect_flg,
			l_cost_io_typ,
			l_ac_slip_typ,
			l_qty,
			l_amt,
			l_trd_cur_amt
		)
		;

		i := i + 1 ;
		/* 入庫関連 */
		IF x3.gi_qty > 0 THEN
			--入庫関連をc_io_stk_inで作成する
			l_cost_io_typ := c_io_stk_in ;
			l_ac_slip_typ := c_stk_sw_gr ;
			l_qty := x3.gr_qty ;
			l_amt := x3.gr_amt ;
			l_trd_cur_amt := x3.gr_trd_cur_amt ;
		ELSE
			--入庫関連をc_io_stk_outで作成する
			l_cost_io_typ := c_io_stk_out ;
			l_ac_slip_typ := c_stk_sw_so ;
			l_qty := (-1) * x3.gr_qty ;
			l_amt := (-1) * x3.gr_amt ;
			l_trd_cur_amt := (-1) * x3.gr_trd_cur_amt ;
		END IF ;

		INSERT INTO mgpa_ins_mgtif2mgt$p_if$rec_io (
			_index_,
			act_io_id,
			act_io_id_sub,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
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
			ac_rsn_cd,
			other_wg_cd,
			other_dpt_cd,
			bp_cd,
			stk_bp_cd,
			asst_typ,
			trd_cur_cd,
			xrate,
			trd_grp,
			rec_eval_typ,
			itm_jnl_cd,
			alc_amt_flg,
			zero_effect_flg,
			cost_io_typ,
			ac_slip_typ,
			qty,
			amt,
			trd_cur_amt
		)
		VALUES (
			i,
			x3.gr_act_io_id,
			x3.gr_act_io_id_sub,
			x3.gr_calc_ctg_cd,
			x3.gr_wg_cd,
			x3.gr_ym,
			x3.gr_ac_dt,
			x3.gr_mng_dpt_cd,
			x3.gr_itm_cd,
			x3.gr_itm_sub1,
			x3.gr_itm_sub2,
			x3.gr_itm_sub3,
			x3.gr_lot_no,
			x3.gr_sublot_no,
			x3.gr_sno1,
			x3.gr_sno2,
			x3.gr_sno3,
			x3.gr_sno4,
			x3.gr_ac_rsn_cd,
			x3.gi_wg_cd,
			x3.gi_mng_dpt_cd,
			x3.gr_bp_cd,
			x3.gr_stk_bp_cd,
			x3.gr_asst_typ,
			x3.gr_trd_cur_cd,
			x3.gr_xrate,
			x3.gr_trd_grp,
			x3.gr_rec_eval_typ,
			c_null_val,
			c_off,
			x3.gr_zero_effect_flg,
			l_cost_io_typ,
			l_ac_slip_typ,
			l_qty,
			l_amt,
			l_trd_cur_amt
		)
		;

		IF i > c_max_cnt THEN
			CALL mgpa_ins_mgtif2mgt$ins_mgw_io();
		END IF;
	END LOOP;

	IF i > 0 THEN
		CALL mgpa_ins_mgtif2mgt$ins_mgw_io();
	END IF;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_MGTIF2MGT.P_IFSUB4');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_io_to_inpt(
	 IN i_calc_ctg VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	投入実績への振替の作成
<REMARKS>
	入出庫実績ＩＦを振り替える
<ARGUMENTS>
<IN>	i_calc_ctg
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym
		対象年月
<HISTORY>
*************************************************************************/
DECLARE
	c_off CONSTANT VARCHAR := '0' ;
	c_on CONSTANT VARCHAR := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_str CONSTANT VARCHAR := CONCAT(fcpa_const$get_const_val('FSC_MODULE_ID','CostManagement'), fcpa_const$get_const_val('MGC_STR','ACT_ID_DLM'));
	c_num_sys_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_INPT_ID');
	c_num_sys_inpt_length CONSTANT INTEGER := mgc_num_sys_typ$length(c_num_sys_inpt);

	/* 切り上げ */
	c_rnd_typ CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDUP');

	c_asst2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');
	c_asst3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH');
	c_input CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INPUT');
	c_in_onr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_ONR');

	l_flg CHAR(1);
	l_sum_t NUMERIC;
	l_num_abs NUMERIC;
	l_num_abs2 NUMERIC;
	l_num_s NUMERIC;
	l_num_s2 NUMERIC;
	l_cnt INTEGER;

	l_g_co_parm mam_co_parm%ROWTYPE;
	l_g_term TIMESTAMP(0) WITHOUT TIME ZONE;
	l_g_act_trd_calc_ctg mam_calc_ctg.calc_ctg_cd%TYPE;
	l_g_def_calc_ctg mam_calc_ctg.calc_ctg_cd%TYPE;
	l_g_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	x RECORD;
	x2 RECORD;
	y RECORD;
/************************************************************************/
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_MGTIF2MGT.P_IO_TO_INPT');

	/* 一時テーブルの作成 */
	CREATE TEMP TABLE mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if (
		calc_ctg_cd VARCHAR,
		wg_cd VARCHAR,
		ym TIMESTAMP(0) WITHOUT TIME ZONE,
		ac_dt TIMESTAMP(0) WITHOUT TIME ZONE,
		itm_cd VARCHAR,
		itm_sub1 VARCHAR,
		itm_sub2 VARCHAR,
		itm_sub3 VARCHAR,
		itm_mfg_inst_no VARCHAR,
		mfg_act_no VARCHAR,
		oper_act_no VARCHAR,
		lot_no VARCHAR,
		sublot_no VARCHAR,
		loc_cd VARCHAR,
		str_ln_cd VARCHAR,
		qty NUMERIC,
		amt NUMERIC,
		expns_cd VARCHAR,
		mfg_act_grp VARCHAR,
		bom_ptn VARCHAR,
		oper_ptn VARCHAR,
		oper_cd VARCHAR,
		oper_seq NUMERIC,
		sppl_cd VARCHAR
	) ON COMMIT DROP;
	ALTER TABLE mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if ADD _index_ VARCHAR;
	CREATE UNIQUE INDEX ON mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if (_index_);

	CREATE TEMP TABLE mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if_sub (
		calc_ctg_cd VARCHAR,
		wg_cd VARCHAR,
		ym TIMESTAMP(0) WITHOUT TIME ZONE,
		ac_dt TIMESTAMP(0) WITHOUT TIME ZONE,
		itm_cd VARCHAR,
		itm_sub1 VARCHAR,
		itm_sub2 VARCHAR,
		itm_sub3 VARCHAR,
		itm_mfg_inst_no VARCHAR,
		mfg_act_no VARCHAR,
		oper_act_no VARCHAR,
		lot_no VARCHAR,
		sublot_no VARCHAR,
		loc_cd VARCHAR,
		str_ln_cd VARCHAR,
		qty NUMERIC,
		amt NUMERIC,
		expns_cd VARCHAR,
		mfg_act_grp VARCHAR,
		bom_ptn VARCHAR,
		oper_ptn VARCHAR,
		oper_cd VARCHAR,
		oper_seq NUMERIC,
		sppl_cd VARCHAR
	) ON COMMIT DROP;
	ALTER TABLE mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if_sub ADD _index_ VARCHAR;
	CREATE UNIQUE INDEX ON mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if_sub (_index_);

	--期の取得
	l_g_term := mapa_term$f_get_term_ne(i_ym);

	--IFパラメータの取得
	l_g_co_parm := mgpa_co_parm$f_get_rec();
	l_g_act_trd_calc_ctg := l_g_co_parm.act_trd_calc_ctg_cd;
	l_g_def_calc_ctg := l_g_co_parm.def_calc_ctg_cd;
	l_g_parm_itm_sub_typ := mapa_comm$f_get_parm('ITM_SUB_TYP');

	<<PROD_END>>
	BEGIN

		SELECT COUNT(*)
		INTO STRICT l_cnt
		FROM mgw_io$temp w
		WHERE 0=0
		AND w.mfg_act_grp IS NOT NULL
		AND w.qty <> 0
		;

		IF l_cnt = 0 THEN
			EXIT PROD_END;
		END IF;

		TRUNCATE TABLE mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if;
		INSERT INTO mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if (
			_index_,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			lot_no,
			sublot_no,
			loc_cd,
			str_ln_cd,
			qty,
			amt,
			expns_cd,
			mfg_act_grp,
			bom_ptn,
			oper_ptn,
			oper_cd,
			oper_seq,
			sppl_cd
		)
		SELECT
			ROW_NUMBER() OVER(),
			t1.calc_ctg_cd,
			t1.wg_cd,
			t1.ym,
			t1.ac_dt,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.itm_mfg_inst_no,
			t1.mfg_act_no,
			COALESCE(t3.oper_act_no, c_null_val),
			t1.lot_no,
			t1.sublot_no,
			t1.loc_cd,
			t1.str_ln_cd,
			SUM(t1.qty),
			SUM(t1.amt),
			t1.expns_cd,
			t1.mfg_act_grp,
			COALESCE(t1.bom_ptn, t2.bom_ptn),
			t1.oper_ptn,
			t3.oper_cd,
			t3.oper_seq,
			m1.sppl_cd
		FROM mgt_act_mfg_if t1
			LEFT OUTER JOIN mgt_itm_dtl t2 ON (
				t1.itm_cd = t2.itm_cd
				AND t1.itm_sub1 = t2.itm_sub1
				AND t1.itm_sub2 = t2.itm_sub2
				AND t1.itm_sub3 = t2.itm_sub3
				AND t1.loc_cd = t2.loc_cd
				AND t1.wg_cd = t2.wg_cd
				AND t2.sppl_cd = c_null_val
				AND t2.rqst_wg_cd = c_null_val
				AND t2.term = l_g_term
				AND t2.calc_ctg_cd = COALESCE(l_g_act_trd_calc_ctg, l_g_def_calc_ctg)
				AND t2.non_calc_flg = c_off)
			LEFT OUTER JOIN mgt_inst_oper t3 ON (
				t1.itm_cd = t3.itm_cd
				AND t1.itm_sub1 = t3.itm_sub1
				AND t1.itm_sub2 = t3.itm_sub2
				AND t1.itm_sub3 = t3.itm_sub3
				AND t1.itm_mfg_inst_no = t3.itm_mfg_inst_no
				AND t1.mfg_act_no = t3.mfg_act_no
				AND t1.wg_cd = t3.wg_cd
				AND t1.calc_ctg_cd = t3.calc_ctg_cd)
			LEFT OUTER JOIN mam_loc m1 ON (t1.loc_cd = m1.loc_cd)
		WHERE 0=0
		AND t1.ym = i_ym
		AND t1.wg_cd = i_wg_cd
		AND t1.calc_ctg_cd = i_calc_ctg
		AND t1.mfg_act_grp IS NOT NULL
		GROUP BY
			t1.calc_ctg_cd, t1.wg_cd, t1.ym, t1.ac_dt,
			t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
			t1.itm_mfg_inst_no, t1.mfg_act_no, t3.oper_act_no,
			t1.lot_no, t1.sublot_no, t1.loc_cd, t1.str_ln_cd,
			t1.expns_cd, t1.mfg_act_grp,
			COALESCE(t1.bom_ptn, t2.bom_ptn),
			t1.oper_ptn, t3.oper_cd, t3.oper_seq, m1.sppl_cd
		;

		SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if;
		IF l_cnt = 0 THEN
			EXIT PROD_END;
		END IF;

		DELETE FROM mgw_act_inpt2;

		FOR x IN
			SELECT
				t.act_io_id, t.act_io_id_sub,
				t.calc_ctg_cd,
				t.wg_cd,
				t.ym, t.ac_dt,
				t.mng_dpt_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.cost_io_typ, t.ac_slip_typ, t.ac_rsn_cd,
				t.other_wg_cd, t.other_dpt_cd,
				t.bp_cd, t.stk_bp_cd, t.asst_typ,
				t.qty,
				t.zero_effect_flg,
				t.mfg_act_grp,
				COALESCE(m.dec_place, 0) dec_place
			FROM mgw_io$temp t
				LEFT OUTER JOIN mam_itm_srch m ON (
					t.itm_cd = m.itm_cd
	 				AND t.itm_sub1 = m.itm_sub1
					AND t.itm_sub2 = m.itm_sub2
					AND t.itm_sub3 = m.itm_sub3
					AND m.del_flg = c_off
					AND m.release_flg = c_on)
			WHERE 0=0
			AND t.mfg_act_grp IS NOT NULL
			AND t.qty <> 0
		LOOP

			<<NEXT_OUT_LOOP>>
			BEGIN

				--投入への製造実績グループにもとづく振替
				l_cnt := 0 ;
				TRUNCATE TABLE mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if_sub;
				FOR x2 IN
					SELECT * FROM mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if
					ORDER BY _index_
				LOOP
					IF x2.mfg_act_grp <> x.mfg_act_grp THEN
						CONTINUE ;
					ELSIF COALESCE(x2.sppl_cd, c_null_val) <> COALESCE(x.stk_bp_cd, c_null_val) THEN
						CONTINUE ;
					END IF ;
					l_cnt := l_cnt + 1 ;
					INSERT INTO mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if_sub (
						_index_,
						calc_ctg_cd,
						wg_cd,
						ym,
						ac_dt,
						itm_cd,
						itm_sub1,
						itm_sub2,
						itm_sub3,
						itm_mfg_inst_no,
						mfg_act_no,
						oper_act_no,
						lot_no,
						sublot_no,
						loc_cd,
						str_ln_cd,
						qty,
						amt,
						expns_cd,
						mfg_act_grp,
						bom_ptn,
						oper_ptn,
						oper_cd,
						oper_seq,
						sppl_cd
					)
					VALUES (
						l_cnt,
						x2.calc_ctg_cd,
						x2.wg_cd,
						x2.ym,
						x2.ac_dt,
						x2.itm_cd,
						x2.itm_sub1,
						x2.itm_sub2,
						x2.itm_sub3,
						x2.itm_mfg_inst_no,
						x2.mfg_act_no,
						x2.oper_act_no,
						x2.lot_no,
						x2.sublot_no,
						x2.loc_cd,
						x2.str_ln_cd,
						x2.qty,
						x2.amt,
						x2.expns_cd,
						x2.mfg_act_grp,
						x2.bom_ptn,
						x2.oper_ptn,
						x2.oper_cd,
						x2.oper_seq,
						x2.sppl_cd
					)
					;
				END LOOP;

				IF l_cnt = 0 THEN
					CALL fcpa_batch_log$p_data_log('MGBBD0050', l_log_no, l_log_sub_key1, l_log_sub_key2,
									x.act_io_id, x.mfg_act_grp, x.stk_bp_cd,
									mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_g_parm_itm_sub_typ),
									x.qty::VARCHAR);
					EXIT NEXT_OUT_LOOP ;
				END IF ;

				--原価ＢＯＭを展開して子品目毎の投入予定数量を取得
				DELETE FROM mgw_act_mfg_bom ;

				INSERT INTO mgw_act_mfg_bom (
					par_itm_cd,
					par_itm_sub1,
					par_itm_sub2,
					par_itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no,
					oper_act_no,
					loc_cd,
					str_ln_cd,
					bp_cd,
					mfg_act_grp,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					expns_cd,
					qty
				)
				SELECT
					w.itm_cd,
					w.itm_sub1,
					w.itm_sub2,
					w.itm_sub3,
					w.itm_mfg_inst_no,
					w.mfg_act_no,
					w.oper_act_no,
					w.loc_cd,
					w.str_ln_cd,
					w.sppl_cd,
					w.mfg_act_grp,
					t.chd_itm_cd,
					t.chd_itm_sub1,
					t.chd_itm_sub2,
					t.chd_itm_sub3,
					t.expns_cd,
					mapa_calc$f_rnd(t.chd_rqmt_qty / t.par_rqmt_qty * w.qty, x.dec_place, c_rnd_typ)
				FROM mgt_bom t
					INNER JOIN mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if_sub w ON (
						t.par_itm_cd = w.itm_cd
						AND t.par_itm_sub1 = w.itm_sub1
						AND t.par_itm_sub2 = w.itm_sub2
						AND t.par_itm_sub3 = w.itm_sub3
						AND t.bom_ptn = w.bom_ptn
						AND (
							t.oper_cd = w.oper_cd AND t.oper_seq = w.oper_seq
							OR
							w.oper_cd IS NULL
							)
						AND t.wg_cd = w.wg_cd)
				WHERE 0=0
				AND t.alt_grp_cd IS NULL
				AND t.term = l_g_term
				AND t.calc_ctg_cd = COALESCE(l_g_act_trd_calc_ctg, l_g_def_calc_ctg)
				AND t.chd_itm_cd = x.itm_cd
				AND t.chd_itm_sub1 = x.itm_sub1
				AND t.chd_itm_sub2 = x.itm_sub2
				AND t.chd_itm_sub3 = x.itm_sub3
				AND t.non_calc_flg = c_off
				;

				INSERT INTO mgw_act_mfg_bom (
					par_itm_cd,
					par_itm_sub1,
					par_itm_sub2,
					par_itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no,
					oper_act_no,
					loc_cd,
					str_ln_cd,
					bp_cd,
					mfg_act_grp,
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					expns_cd,
					qty
				)
				SELECT
					w.itm_cd,
					w.itm_sub1,
					w.itm_sub2,
					w.itm_sub3,
					w.itm_mfg_inst_no,
					w.mfg_act_no,
					w.oper_act_no,
					w.loc_cd,
					w.str_ln_cd,
					w.sppl_cd,
					w.mfg_act_grp,
					t.chd_itm_cd,
					t.chd_itm_sub1,
					t.chd_itm_sub2,
					t.chd_itm_sub3,
					t.expns_cd,
					mapa_calc$f_rnd(t.chd_rqmt_qty / t.par_rqmt_qty * w.qty, x.dec_place, c_rnd_typ)
				FROM mgt_bom t
					INNER JOIN mgpa_ins_mgtif2mgt$p_io_to_inpt$act_mfg_if_sub w ON (
						t.par_itm_cd = w.itm_cd
						AND t.par_itm_sub1 = w.itm_sub1
						AND t.par_itm_sub2 = w.itm_sub2
						AND t.par_itm_sub3 = w.itm_sub3
						AND t.bom_ptn = w.bom_ptn
						AND (
							t.oper_cd = w.oper_cd AND t.oper_seq = w.oper_seq
							OR
							w.oper_cd IS NULL
							))
				WHERE 0=0
				AND t.alt_grp_cd IS NULL
				AND t.term = l_g_term
				AND t.calc_ctg_cd = COALESCE(l_g_act_trd_calc_ctg, l_g_def_calc_ctg)
				AND t.wg_cd = c_null_val
				AND t.chd_itm_cd = x.itm_cd
				AND t.chd_itm_sub1 = x.itm_sub1
				AND t.chd_itm_sub2 = x.itm_sub2
				AND t.chd_itm_sub3 = x.itm_sub3
				AND t.non_calc_flg = c_off
				AND NOT EXISTS (
						SELECT 'X'
						FROM mgt_bom w2
						WHERE 0=0
						AND w2.par_itm_cd = w.itm_cd
						AND w2.par_itm_sub1 = w.itm_sub1
						AND w2.par_itm_sub2 = w.itm_sub2
						AND w2.par_itm_sub3 = w.itm_sub3
						AND w2.bom_ptn = w.bom_ptn
						AND w2.alt_grp_cd IS NULL
						AND w2.term = l_g_term
						AND w2.calc_ctg_cd = COALESCE(l_g_act_trd_calc_ctg, l_g_def_calc_ctg)
						AND w2.wg_cd = w.wg_cd
						AND w2.non_calc_flg = c_off
					)
				;
		
				SELECT COUNT(*), COALESCE(SUM(w.qty), 0)
				INTO STRICT l_cnt, l_sum_t
				FROM mgw_act_mfg_bom w
				WHERE 0=0
				;
		
				IF l_cnt = 0 OR l_sum_t = 0 THEN
					CALL fcpa_batch_log$p_data_log('MGBBD0048', l_log_no, l_log_sub_key1, l_log_sub_key2,
									x.act_io_id, x.mfg_act_grp, x.stk_bp_cd,
									mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_g_parm_itm_sub_typ),
									x.qty::VARCHAR);
					EXIT NEXT_OUT_LOOP ;
				END IF ;
		
				--製造実績ＢＯＭワークの数量が大きい順に、入出庫実績ＩＦの数量を按分する
				l_flg := c_off ;
				l_num_abs := ABS(x.qty) ;
				l_num_abs2 := 0 ;
				l_num_s := x.qty ;
		
				FOR y IN
					SELECT
						w.par_itm_cd, w.par_itm_sub1, w.par_itm_sub2, w.par_itm_sub3,
						w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
						w.loc_cd, w.str_ln_cd, w.bp_cd,
						w.expns_cd, w.qty
					FROM mgw_act_mfg_bom w
					WHERE 0=0
					ORDER BY w.qty DESC
				LOOP
					l_num_s2 := mapa_calc$f_rnd(x.qty * y.qty / l_sum_t, x.dec_place, c_rnd_typ) ;
					l_num_abs2 := l_num_abs2 + ABS(l_num_s2) ;
					IF l_num_abs2 >= l_num_abs THEN
						IF l_flg = c_on THEN
							EXIT ;
						ELSE
							l_num_s2 := l_num_s ;
							l_flg := c_on ;
						END IF ;
					END IF ;
					IF l_num_s2 <> 0 THEN
						INSERT INTO mgw_act_inpt2 (
							act_io_id, act_io_id_sub,
							calc_ctg_cd, wg_cd,
							ym, ac_dt,
							par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
							itm_mfg_inst_no, mfg_act_no, oper_act_no,
							loc_cd, str_ln_cd,
							mng_dpt_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3,
							lot_no, sublot_no, sno1, sno2, sno3, sno4,
							ac_slip_typ, ac_rsn_cd,
							bp_cd,
							stk_bp_cd, asst_typ, mfg_act_grp,
							expns_cd, qty
						)
						VALUES	(
							x.act_io_id, x.act_io_id_sub,
							x.calc_ctg_cd, x.wg_cd,
							x.ym, x.ac_dt,
							y.par_itm_cd, y.par_itm_sub1, y.par_itm_sub2, y.par_itm_sub3,
							y.itm_mfg_inst_no, y.mfg_act_no, y.oper_act_no,
							y.loc_cd, y.str_ln_cd,
							x.mng_dpt_cd,
							x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
							x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
							x.ac_slip_typ, x.ac_rsn_cd,
							x.bp_cd,
							y.bp_cd, x.asst_typ, x.mfg_act_grp,
							y.expns_cd, l_num_s2
							)
						;
						l_num_s := l_num_s - l_num_s2 ;
					END IF ;
				END LOOP ;
		
				DELETE FROM mgw_io t WHERE t.act_io_id = x.act_io_id AND t.act_io_id_sub = x.act_io_id_sub;

			END;--NEXT_OUT_LOOP

		END LOOP;

		INSERT INTO mgt_act_inpt (
			act_inpt_id, act_inpt_id_sub,
			calc_ctg_cd, wg_cd,
			ym, ac_dt,
			par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
			itm_mfg_inst_no, mfg_act_no, oper_act_no,
			loc_cd, str_ln_cd,
			mng_dpt_cd,
			itm_cd, itm_sub1, itm_sub2, itm_sub3,
			lot_no, sublot_no, sno1, sno2, sno3, sno4,
			ac_slip_typ, ac_rsn_cd,
			bp_cd,
			stk_bp_cd, asst_typ, mfg_act_grp,
			expns_cd, qty
		)
		SELECT
			CONCAT(c_str, LPAD(mapa_num$f_get_seq(c_num_sys_inpt)::VARCHAR, c_num_sys_inpt_length, '0')), '1',
			t.calc_ctg_cd, t.wg_cd,
			t.ym, t.ac_dt,
			t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3,
			t.itm_mfg_inst_no, t.mfg_act_no, t.oper_act_no,
			t.loc_cd, t.str_ln_cd,
			t.mng_dpt_cd,
			t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
			CASE
				WHEN t.asst_typ = c_asst3 THEN c_in_onr
				ELSE c_input
			END, t.ac_rsn_cd,
			t.bp_cd,
			t.stk_bp_cd, t.asst_typ, t.mfg_act_grp,
			t.expns_cd, t.qty
		FROM (
			SELECT
				w.calc_ctg_cd, w.wg_cd,
				w.ym, w.ac_dt,
				w.par_itm_cd, w.par_itm_sub1, w.par_itm_sub2, w.par_itm_sub3,
				w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
				w.loc_cd, w.str_ln_cd,
				w.mng_dpt_cd,
				w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.ac_slip_typ, w.ac_rsn_cd,
				w.bp_cd,
				w.stk_bp_cd, w.asst_typ, w.mfg_act_grp,
				w.expns_cd, SUM(w.qty) qty
			FROM mgw_act_inpt2 w
			WHERE 0=0
			GROUP BY
				w.calc_ctg_cd, w.wg_cd,
				w.ym, w.ac_dt,
				w.par_itm_cd, w.par_itm_sub1, w.par_itm_sub2, w.par_itm_sub3,
				w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
				w.loc_cd, w.str_ln_cd,
				w.mng_dpt_cd,
				w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
				w.ac_slip_typ, w.ac_rsn_cd,
				w.bp_cd,
				w.stk_bp_cd, w.asst_typ, w.mfg_act_grp,
				w.expns_cd
			HAVING SUM(w.qty) <> 0
			) t
		WHERE 0=0
		;

	END; --PROD_END

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_MGTIF2MGT.P_IO_TO_INPT');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk(
	IN i_calc_ctg VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	指図工数実績への振替の作成
<REMARKS>
	指図外工数実績ＩＦを振り替える
<ARGUMENTS>
<IN>	i_calc_ctg
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym
		対象年月
<HISTORY>
*************************************************************************/
DECLARE
	c_off CONSTANT VARCHAR := '0' ;
	c_on CONSTANT VARCHAR := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_str CONSTANT VARCHAR := CONCAT(fcpa_const$get_const_val('FSC_MODULE_ID','CostManagement'), fcpa_const$get_const_val('MGC_STR','ACT_ID_DLM'));
	c_num_sys_inst_wk CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_INST_WK_ID');
	c_num_sys_inst_wk_length CONSTANT INTEGER := mgc_num_sys_typ$length(c_num_sys_inst_wk);

	/* 切り上げ */
	c_rnd_typ CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDUP');

	l_flg CHAR(1);

	l_sum_t NUMERIC;
	l_num_abs NUMERIC;
	l_num_abs2 NUMERIC;
	l_num_s NUMERIC;
	l_num_s2 NUMERIC;
	l_cnt INTEGER;

	l_g_co_parm mam_co_parm%ROWTYPE;
	l_g_term TIMESTAMP(0) WITHOUT TIME ZONE;
	l_g_act_trd_calc_ctg mam_calc_ctg.calc_ctg_cd%TYPE;
	l_g_def_calc_ctg mam_calc_ctg.calc_ctg_cd%TYPE;
	l_g_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	x RECORD;
	x2 RECORD;
	y RECORD;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_MGTIF2MGT.P_OTHER_WK_TO_INST_WK');

	/* 一時テーブルの作成 */
	CREATE TEMP TABLE mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if (
		calc_ctg_cd VARCHAR,
		wg_cd VARCHAR,
		ym TIMESTAMP(0) WITHOUT TIME ZONE,
		ac_dt TIMESTAMP(0) WITHOUT TIME ZONE,
		itm_cd VARCHAR,
		itm_sub1 VARCHAR,
		itm_sub2 VARCHAR,
		itm_sub3 VARCHAR,
		itm_mfg_inst_no VARCHAR,
		mfg_act_no VARCHAR,
		oper_act_no VARCHAR,
		lot_no VARCHAR,
		sublot_no VARCHAR,
		loc_cd VARCHAR,
		str_ln_cd VARCHAR,
		qty NUMERIC,
		mfg_act_grp VARCHAR,
		oper_ptn VARCHAR,
		oper_cd VARCHAR,
		oper_seq NUMERIC
	) ON COMMIT DROP;
	ALTER TABLE mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if ADD _index_ VARCHAR;
	CREATE UNIQUE INDEX ON mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if (_index_);

	CREATE TEMP TABLE mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if_sub (
		calc_ctg_cd VARCHAR,
		wg_cd VARCHAR,
		ym TIMESTAMP(0) WITHOUT TIME ZONE,
		ac_dt TIMESTAMP(0) WITHOUT TIME ZONE,
		itm_cd VARCHAR,
		itm_sub1 VARCHAR,
		itm_sub2 VARCHAR,
		itm_sub3 VARCHAR,
		itm_mfg_inst_no VARCHAR,
		mfg_act_no VARCHAR,
		oper_act_no VARCHAR,
		lot_no VARCHAR,
		sublot_no VARCHAR,
		loc_cd VARCHAR,
		str_ln_cd VARCHAR,
		qty NUMERIC,
		mfg_act_grp VARCHAR,
		oper_ptn VARCHAR,
		oper_cd VARCHAR,
		oper_seq NUMERIC
	) ON COMMIT DROP;
	ALTER TABLE mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if_sub ADD _index_ VARCHAR;
	CREATE UNIQUE INDEX ON mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if_sub (_index_);

	--期の取得
	l_g_term := mapa_term$f_get_term_ne(i_ym);

	--IFパラメータの取得
	l_g_co_parm := mgpa_co_parm$f_get_rec();
	l_g_act_trd_calc_ctg := l_g_co_parm.act_trd_calc_ctg_cd;
	l_g_def_calc_ctg := l_g_co_parm.def_calc_ctg_cd;
	l_g_parm_itm_sub_typ := mapa_comm$f_get_parm('ITM_SUB_TYP');

	<<PROD_END>>
	BEGIN

		INSERT INTO mgw_act_other_wk_if (
			data_lno,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			dpt_cd,
			ctg_cd,
			loc_cd,
			oper_cd,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			mfg_act_grp
		)
		SELECT
			t.data_lno,
			t.calc_ctg_cd,
			t.wg_cd,
			t.ym,
			t.ac_dt,
			t.dpt_cd,
			t.ctg_cd,
			t.loc_cd,
			t.oper_cd,
			t.lot_no,
			t.sublot_no,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.wk_cost_cd,
			t.wk_rsn_cd,
			t.wk_cost,
			t.mfg_act_grp
		FROM mgt_act_other_wk_if t
		WHERE 0=0
		AND t.ym = i_ym
		AND t.wg_cd = i_wg_cd
		AND t.calc_ctg_cd = i_calc_ctg
		;

		SELECT COUNT(*)
		INTO STRICT l_cnt
		FROM mgw_act_other_wk_if w
		WHERE 0=0
		AND w.mfg_act_grp IS NOT NULL
		;

		IF l_cnt = 0 THEN
			EXIT PROD_END;
		END IF;

		TRUNCATE TABLE mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if;
		INSERT INTO mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if (
			_index_,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			lot_no,
			sublot_no,
			loc_cd,
			str_ln_cd,
			qty,
			mfg_act_grp,
			oper_ptn,
			oper_cd,
			oper_seq
		)
		SELECT
			ROW_NUMBER() OVER(),
			t1.calc_ctg_cd,
			t1.wg_cd,
			t1.ym,
			t1.ac_dt,
			t1.itm_cd,
			t1.itm_sub1,
			t1.itm_sub2,
			t1.itm_sub3,
			t1.itm_mfg_inst_no,
			t1.mfg_act_no,
			COALESCE(t3.oper_act_no, c_null_val),
			t1.lot_no,
			t1.sublot_no,
			t1.loc_cd,
			t1.str_ln_cd,
			SUM(t1.qty),
			t1.mfg_act_grp,
			COALESCE(t1.oper_ptn, t2.oper_ptn),
			t3.oper_cd,
			t3.oper_seq
		FROM mgt_act_mfg_if t1
			LEFT OUTER JOIN mgt_itm_dtl t2 ON (
				t1.itm_cd = t2.itm_cd
				AND t1.itm_sub1 = t2.itm_sub1
				AND t1.itm_sub2 = t2.itm_sub2
				AND t1.itm_sub3 = t2.itm_sub3
				AND t1.loc_cd = t2.loc_cd
				AND t1.wg_cd = t2.wg_cd
				AND t2.sppl_cd = c_null_val
				AND t2.rqst_wg_cd = c_null_val
				AND t2.term = l_g_term
				AND t2.calc_ctg_cd = COALESCE(l_g_act_trd_calc_ctg, l_g_def_calc_ctg)
				AND t2.non_calc_flg = c_off)
			LEFT OUTER JOIN mgt_inst_oper t3 ON (
				t1.itm_cd = t3.itm_cd
				AND t1.itm_sub1 = t3.itm_sub1
				AND t1.itm_sub2 = t3.itm_sub2
				AND t1.itm_sub3 = t3.itm_sub3
				AND t1.itm_mfg_inst_no = t3.itm_mfg_inst_no
				AND t1.mfg_act_no = t3.mfg_act_no
				AND t1.wg_cd = t3.wg_cd
				AND t1.calc_ctg_cd = t3.calc_ctg_cd)
		WHERE 0=0
		AND t1.ym = i_ym
		AND t1.wg_cd = i_wg_cd
		AND t1.mfg_act_grp IS NOT NULL
		AND t1.calc_ctg_cd = i_calc_ctg
		GROUP BY
			t1.calc_ctg_cd, t1.wg_cd, t1.ym, t1.ac_dt,
			t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
			t1.itm_mfg_inst_no, t1.mfg_act_no, t3.oper_act_no,
			t1.lot_no, t1.sublot_no, t1.loc_cd, t1.str_ln_cd,
			t1.mfg_act_grp, COALESCE(t1.oper_ptn, t2.oper_ptn),
			t3.oper_cd, t3.oper_seq
		;

		SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if;
		IF l_cnt = 0 THEN
			EXIT PROD_END;
		END IF;

		FOR x IN
			SELECT
				t.data_lno,
				t.calc_ctg_cd, t.wg_cd, t.ym, t.ac_dt,
				t.wk_cost_cd, t.wk_cost, t.wk_rsn_cd, t.mfg_act_grp,
				COALESCE(m.dec_place, 0) dec_place
			FROM mgw_act_other_wk_if t
				LEFT OUTER JOIN mam_wk_cost m ON (t.wk_cost_cd = m.wk_cost_cd)
			WHERE 0=0
			AND t.mfg_act_grp IS NOT NULL
			AND t.wk_cost <> 0
		LOOP

			<<NEXT_OUT_LOOP>>
			BEGIN

				--指図工数への製造実績グループにもとづく振替
				l_cnt := 0 ;
				TRUNCATE TABLE mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if_sub;
				FOR x2 IN
					SELECT * FROM mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if
					ORDER BY _index_
				LOOP
					IF x2.mfg_act_grp <> x.mfg_act_grp THEN
						CONTINUE ;
					END IF ;
					l_cnt := l_cnt + 1;
					INSERT INTO mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if_sub (
						_index_,
						calc_ctg_cd,
						wg_cd,
						ym,
						ac_dt,
						itm_cd,
						itm_sub1,
						itm_sub2,
						itm_sub3,
						itm_mfg_inst_no,
						mfg_act_no,
						oper_act_no,
						lot_no,
						sublot_no,
						loc_cd,
						str_ln_cd,
						qty,
						mfg_act_grp,
						oper_ptn,
						oper_cd,
						oper_seq
					)
					VALUES (
						l_cnt,
						x2.calc_ctg_cd,
						x2.wg_cd,
						x2.ym,
						x2.ac_dt,
						x2.itm_cd,
						x2.itm_sub1,
						x2.itm_sub2,
						x2.itm_sub3,
						x2.itm_mfg_inst_no,
						x2.mfg_act_no,
						x2.oper_act_no,
						x2.lot_no,
						x2.sublot_no,
						x2.loc_cd,
						x2.str_ln_cd,
						x2.qty,
						x2.mfg_act_grp,
						x2.oper_ptn,
						x2.oper_cd,
						x2.oper_seq
					)
					;
				END LOOP;

				IF l_cnt = 0 THEN
					CALL fcpa_batch_log$p_data_log('MGBBD0051', l_log_no, l_log_sub_key1, l_log_sub_key2,
									x.data_lno::VARCHAR, x.mfg_act_grp, x.wk_cost_cd, x.wk_cost::VARCHAR);
					EXIT NEXT_OUT_LOOP ;
				END IF ;

				--原価品目工数情報から工数管理毎の予定工数を取得
				DELETE FROM mgw_act_mfg_itm_wk;

				INSERT INTO mgw_act_mfg_itm_wk (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no,
					oper_act_no,
					loc_cd,
					str_ln_cd,
					mfg_act_grp,
					wk_cost_cd,
					wk_cost
				)
				SELECT
					w.itm_cd,
					w.itm_sub1,
					w.itm_sub2,
					w.itm_sub3,
					w.itm_mfg_inst_no,
					w.mfg_act_no,
					w.oper_act_no,
					w.loc_cd,
					w.str_ln_cd,
					w.mfg_act_grp,
					t.wk_cost_cd,
					mapa_calc$f_rnd(t.wk_cost / t.base_qty * w.qty, x.dec_place, c_rnd_typ)
				FROM mgt_itm_wk t
					INNER JOIN mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if_sub w ON (
						t.itm_cd = w.itm_cd
						AND t.itm_sub1 = w.itm_sub1
						AND t.itm_sub2 = w.itm_sub2
						AND t.itm_sub3 = w.itm_sub3
						AND t.loc_cd = w.loc_cd
						AND t.oper_ptn = COALESCE(w.oper_ptn, c_null_val)
						AND (
							t.oper_cd = w.oper_cd AND t.oper_seq = w.oper_seq
							OR
							w.oper_cd IS NULL
							)
						AND t.wg_cd = w.wg_cd)
				WHERE 0=0
				AND t.term = l_g_term
				AND t.calc_ctg_cd = COALESCE(l_g_act_trd_calc_ctg, l_g_def_calc_ctg)
				AND t.wk_cost_cd = x.wk_cost_cd
				AND t.non_calc_flg = c_off
				;

				INSERT INTO mgw_act_mfg_itm_wk (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no,
					oper_act_no,
					loc_cd,
					str_ln_cd,
					mfg_act_grp,
					wk_cost_cd,
					wk_cost
				)
				SELECT
					w.itm_cd,
					w.itm_sub1,
					w.itm_sub2,
					w.itm_sub3,
					w.itm_mfg_inst_no,
					w.mfg_act_no,
					w.oper_act_no,
					w.loc_cd,
					w.str_ln_cd,
					w.mfg_act_grp,
					t.wk_cost_cd,
					mapa_calc$f_rnd(t.wk_cost / t.base_qty * w.qty, x.dec_place, c_rnd_typ)
				FROM mgt_itm_wk t
					INNER JOIN mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk$act_mfg_if_sub w ON (
						t.itm_cd = w.itm_cd
						AND t.itm_sub1 = w.itm_sub1
						AND t.itm_sub2 = w.itm_sub2
						AND t.itm_sub3 = w.itm_sub3
						AND t.oper_ptn = COALESCE(w.oper_ptn, c_null_val)
						AND (
							t.oper_cd = w.oper_cd AND t.oper_seq = w.oper_seq
							OR
							w.oper_cd IS NULL
							))
				WHERE 0=0
				AND t.loc_cd = c_null_val
				AND t.term = l_g_term
				AND t.calc_ctg_cd = COALESCE(l_g_act_trd_calc_ctg, l_g_def_calc_ctg)
				AND t.wg_cd = c_null_val
				AND t.wk_cost_cd = x.wk_cost_cd
				AND t.non_calc_flg = c_off
				AND NOT EXISTS (
						SELECT 'X'
						FROM mgt_itm_wk w2
						WHERE 0=0
						AND w2.itm_cd = w.itm_cd
						AND w2.itm_sub1 = w.itm_sub1
						AND w2.itm_sub2 = w.itm_sub2
						AND w2.itm_sub3 = w.itm_sub3
						AND w2.oper_ptn = COALESCE(w.oper_ptn, c_null_val)
						AND w2.term = l_g_term
						AND w2.calc_ctg_cd = COALESCE(l_g_act_trd_calc_ctg, l_g_def_calc_ctg)
						AND w2.wg_cd = w.wg_cd
						AND w2.non_calc_flg = c_off
					)
				;

				SELECT COUNT(*), COALESCE(SUM(w.wk_cost), 0)
				INTO STRICT l_cnt, l_sum_t
				FROM mgw_act_mfg_itm_wk w
				WHERE 0=0
				;

				IF l_cnt = 0 OR l_sum_t = 0 THEN
					CALL fcpa_batch_log$p_data_log('MGBBD0049', l_log_no, l_log_sub_key1, l_log_sub_key2,
									x.data_lno::VARCHAR, x.mfg_act_grp, x.wk_cost_cd, x.wk_cost::VARCHAR);
					EXIT NEXT_OUT_LOOP ;
				END IF ;

				--製造実績品目工数ワークの数量が大きい順に、指図外工数ＩＦの数量を按分する
				l_flg := c_off ;
				l_num_abs := ABS(x.wk_cost) ;
				l_num_abs2 := 0 ;
				l_num_s := x.wk_cost ;

				FOR y IN
					SELECT
						w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
						w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
						w.loc_cd, w.str_ln_cd,
						w.wk_cost_cd,
						w.wk_cost
					FROM mgw_act_mfg_itm_wk w
					WHERE 0=0
					ORDER BY w.wk_cost DESC
				LOOP
					l_num_s2 := mapa_calc$f_rnd(x.wk_cost * y.wk_cost / l_sum_t, x.dec_place, c_rnd_typ) ;
					l_num_abs2 := l_num_abs2 + ABS(l_num_s2) ;
					IF l_num_abs2 >= l_num_abs THEN
						IF l_flg = c_on THEN
							EXIT ;
						ELSE
							l_num_s2 := l_num_s ;
							l_flg := c_on ;
						END IF ;
					END IF ;
					IF l_num_s2 <> 0 THEN
						INSERT INTO mgw_act_inst_wk (
							calc_ctg_cd, wg_cd,
							ym, ac_dt,
							itm_cd, itm_sub1, itm_sub2, itm_sub3,
							itm_mfg_inst_no, mfg_act_no, oper_act_no,
							loc_cd, str_ln_cd,
							wk_cost_cd, wk_rsn_cd,
							wk_cost
						)
						VALUES (
							x.calc_ctg_cd, x.wg_cd,
							x.ym, x.ac_dt,
							y.itm_cd, y.itm_sub1, y.itm_sub2, y.itm_sub3,
							y.itm_mfg_inst_no, y.mfg_act_no, y.oper_act_no,
							y.loc_cd, y.str_ln_cd,
							y.wk_cost_cd, x.wk_rsn_cd,
							l_num_s2
							)
						;
						l_num_s := l_num_s - l_num_s2 ;
					END IF ;
				END LOOP ;

				DELETE FROM mgw_act_other_wk_if t WHERE t.data_lno = x.data_lno;

			END;--NEXT_OUT_LOOP

		END LOOP;

		INSERT INTO mgt_act_inst_wk (
			act_inst_wk_id,
			calc_ctg_cd, wg_cd,
			ym, ac_dt,
			itm_cd, itm_sub1, itm_sub2, itm_sub3,
			itm_mfg_inst_no, mfg_act_no, oper_act_no,
			loc_cd, str_ln_cd,
			wk_cost_cd, wk_rsn_cd,
			wk_cost
		)
		SELECT
			CONCAT(c_str, LPAD(mapa_num$f_get_seq(c_num_sys_inst_wk)::VARCHAR, c_num_sys_inst_wk_length, '0')),
			t.calc_ctg_cd, t.wg_cd,
			t.ym, t.ac_dt,
			t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
			t.itm_mfg_inst_no, t.mfg_act_no, t.oper_act_no,
			t.loc_cd, t.str_ln_cd,
			t.wk_cost_cd, t.wk_rsn_cd,
			t.wk_cost
		FROM (
			SELECT
				w.calc_ctg_cd, w.wg_cd,
				w.ym, w.ac_dt,
				w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
				w.loc_cd, w.str_ln_cd,
				w.wk_cost_cd, w.wk_rsn_cd,
				SUM(w.wk_cost) wk_cost
			FROM mgw_act_inst_wk w
			WHERE 0=0
			GROUP BY
				w.calc_ctg_cd, w.wg_cd,
				w.ym, w.ac_dt,
				w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				w.itm_mfg_inst_no, w.mfg_act_no, w.oper_act_no,
				w.loc_cd, w.str_ln_cd,
				w.wk_cost_cd, w.wk_rsn_cd
			HAVING SUM(w.wk_cost) <> 0
			) t
		WHERE 0=0
		;

	END;--PROD_END

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_MGTIF2MGT.P_OTHER_WK_TO_INST_WK');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(
	IN i_calc_ctg VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	エラーメッセージの出力処理を行う
<REMARKS>
<ARGUMENTS>
<IN>	i_calc_ctg
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym
		対象年月
<HISTORY>
*************************************************************************/
DECLARE
	l_msg VARCHAR[];
BEGIN
	l_msg := fcpa_err$msg_binder(i_calc_ctg, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
	CALL fcpa_err$raise_app_err('MGBBD0043', l_msg);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ins_mgtif2mgt$p_if(
	 IN i_calc_ctg VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_mfg CHARACTER,
	 IN i_tran CHARACTER,
	 IN i_stk CHARACTER,
	 IN i_del CHARACTER)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	原価実績インターフェースデータから原価実績データの作成処理を行う
<REMARKS>
	I_DELが設定されているときは対象データの削除処理を行う
<ARGUMENTS>
<IN>	i_calc_ctg
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_ym
		対象年月
<IN>	i_mfg
		製造実績関連(製造、購買、投入、工数) 0:実行しない 1:実行する
<IN>	i_tran
		入出庫関連(入出庫、売上) 0:実行しない 1:実行する
<IN>	i_stk
		在庫情報 0:実行しない 1:実行する
<IN>	i_del
		削除 0:取込処理を実行 1:削除処理を実行
<HISTORY>
*************************************************************************/
DECLARE
	c_off CONSTANT VARCHAR := '0' ;
	c_on CONSTANT VARCHAR := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_ok CONSTANT INTEGER := 0;
	c_err1 CONSTANT INTEGER := 1;

	c_sa_act CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP','ACT');

	c_alc_rec_purc CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_ALC_REC_TYP','PURC_ALC');

	c_num_sys_alc CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_NUM_SYS_TYP','ACT_ALC_AMT_KEY');

	c_trans_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TRANS_TYP','INPT');

	c_asset_mng_mng CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');

	c_calc_ctg_alc_amt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ALC_AMT');
	c_calc_ctg_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','INPT');

	c_purc_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XPNS');
	c_purc_ret_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_RET_XPNS');
	c_purc_dscnt_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_DSCNT_XPNS');
	c_purc_xtra_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XTRA_XPNS');
	c_ffr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PROV');
	c_ffr_prvr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PRVR');
	c_onr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PROV');
	c_onr_prvr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PRVR');
	c_ship CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP');
	c_ship_ret CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP_RET');
	c_dpt_xfr_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_SO');
	c_prod_itm_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_SO');
	c_prod_itm_ret_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_RET_SO');
	c_stk_sw_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_SO');
	c_stk_sw_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_GR');
	c_so_stktk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SO_STKTK');
	c_in_stktk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_STKTK');
	c_oth_ccn_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_SO');
	c_oth_ccn_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_GR');
	c_insp_smpl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INSP_SMPL');
	c_disp_scrp CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DISP_SCRP');
	c_in_onr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_ONR');
	c_asst1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS');
	c_asst2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');

	c_io_ffr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','FFR_PROV');
	c_io_onr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','ONR_PROV');
	c_io_stk_io CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IO');
	c_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_OUT');
	c_io_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IN');

	c_set_tgt_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SET_TGT_TYP','INPT');
	c_set_tgt_io CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SET_TGT_TYP','IO');
	c_set_tgt_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SET_TGT_TYP','SLS');
	c_set_tgt_io_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SET_TGT_TYP','IO_IN');
	c_set_tgt_io_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SET_TGT_TYP','IO_OUT');

	l_rc INTEGER;
	l_cnt INTEGER;

	l_ts mgt_act_inpt.ins_ts%TYPE;
	l_usr fcm_user.user_id%TYPE;

	l_stktk_sum CHAR(1);
	l_oth_ccn_sum CHAR(1);

	l_ym TIMESTAMP(0) WITHOUT TIME ZONE;
	l_calc_ctg mam_calc_ctg.calc_ctg_cd%TYPE;
	l_wg_cd mam_wg.wg_cd%TYPE;

	l_g_co_parm mam_co_parm%ROWTYPE;
	l_g_term TIMESTAMP(0) WITHOUT TIME ZONE;
	l_g_parm_itm_sub_typ mam_sys_parm.parm_val%TYPE;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	l_msg VARCHAR[];

	itm CURSOR FOR
		SELECT
			w.tbl,
			w.itm_cd,
			w.itm_sub1,
			w.itm_sub2,
			w.itm_sub3
		FROM (
			SELECT DISTINCT
				'MGT_ACT_MFG_IF' tbl,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM mgt_act_mfg_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_INST_WIP_IF' tbl,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM mgt_act_inst_wip_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_PURC_IF' tbl,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM mgt_act_purc_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_INPT_IF' tbl,
				t.par_itm_cd itm_cd,
				t.par_itm_sub1 itm_sub1,
				t.par_itm_sub2 itm_sub2,
				t.par_itm_sub3 itm_sub3
			FROM mgt_act_inpt_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_INPT_IF' tbl,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM mgt_act_inpt_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_INST_WK_IF' tbl,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM mgt_act_inst_wk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.alc_itm_cd itm_cd,
				t.alc_itm_sub1 itm_sub1,
				t.alc_itm_sub2 itm_sub2,
				t.alc_itm_sub3 itm_sub3
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.alc_itm_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_STK_IF' tbl,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM mgt_act_stk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_stk = c_on
			) w
		WHERE 0=0
		AND NOT EXISTS (
				SELECT 'X'
				FROM mam_itm_srch m
				WHERE 0=0
				AND m.itm_cd = w.itm_cd
				AND m.itm_sub1 = w.itm_sub1
				AND m.itm_sub2 = w.itm_sub2
				AND m.itm_sub3 = w.itm_sub3
				AND m.del_flg = c_off AND m.release_flg = c_on
				)
	;
	itm_r RECORD;

	loc CURSOR FOR
		SELECT
			w.tbl tbl,
			w.loc loc
		FROM (
			SELECT DISTINCT
				'MGT_ACT_MFG_IF' tbl,
				t.loc_cd loc
			FROM mgt_act_mfg_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_PURC_IF' tbl,
				t.alc_loc_cd loc
			FROM mgt_act_purc_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.alc_loc_cd IS NOT NULL
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_INST_WIP_IF' tbl,
				t.loc_cd loc
			FROM mgt_act_inst_wip_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_INPT_IF' tbl,
				t.loc_cd loc
			FROM mgt_act_inpt_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_INST_WK_IF' tbl,
				t.loc_cd loc
			FROM mgt_act_inst_wk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_OTHER_WK_IF' tbl,
				t.loc_cd loc
			FROM mgt_act_other_wk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.loc_cd IS NOT NULL
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.alc_loc_cd loc
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.alc_loc_cd IS NOT NULL
			AND i_tran = c_on
			) w
		WHERE 0=0
		AND NOT EXISTS (
				SELECT 'X'
				FROM mam_loc m
				WHERE 0=0
				AND m.loc_cd = w.loc
				AND m.del_flg = c_off
				)
	;
	loc_r RECORD;

	bp CURSOR FOR
		SELECT
			w.tbl tbl,
			w.bp bp
		FROM (
			SELECT DISTINCT
				'MGT_ACT_PURC_IF' tbl,
				t.sppl_cd bp
			FROM mgt_act_purc_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.cst_cd bp
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.cst_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.dlv_cd bp
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.dlv_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.stk_bp_cd bp
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.stk_bp_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.dest_cd1 bp
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.dest_cd1 IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.dest_cd2 bp
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.dest_cd2 IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.dest_cd3 bp
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.dest_cd3 IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.bp_cd bp
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.bp_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.stk_bp_cd bp
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.stk_bp_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.alc_bp_cd bp
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.alc_bp_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_STK_IF' tbl,
				t.bp_cd bp
			FROM mgt_act_stk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.bp_cd IS NOT NULL
			AND i_stk = c_on
			) w
		WHERE 0=0
		AND NOT EXISTS (
				SELECT 'X'
				FROM mam_bp m
				WHERE 0=0
				AND m.bp_cd = w.bp
				AND m.del_flg = c_off
		)
	;
	bp_r RECORD;

	dpt CURSOR FOR
		SELECT
			w.tbl tbl,
			w.dpt dpt
		FROM (
			SELECT DISTINCT
				'MGT_ACT_PURC_IF' tbl,
				t.mng_dpt_cd dpt
			FROM mgt_act_purc_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_PURC_IF' tbl,
				t.alc_dpt_cd dpt
			FROM mgt_act_purc_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_INPT_IF' tbl,
				t.mng_dpt_cd dpt
			FROM mgt_act_inpt_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_OTHER_WK_IF' tbl,
				t.dpt_cd dpt
			FROM mgt_act_other_wk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.dpt_cd IS NOT NULL
			AND i_mfg = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.mng_dpt_cd dpt
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.sls_dpt_cd dpt
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.sls_dpt_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_SLS_IF' tbl,
				t.alc_dpt_cd dpt
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.alc_dpt_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.mng_dpt_cd dpt
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.other_dpt_cd dpt
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.other_dpt_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_IO_IF' tbl,
				t.alc_dpt_cd dpt
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.alc_dpt_cd IS NOT NULL
			AND i_tran = c_on
			UNION ALL
			SELECT DISTINCT
				'MGT_ACT_STK_IF' tbl,
				t.mng_dpt_cd dpt
			FROM mgt_act_stk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND i_stk = c_on
			) w
		WHERE 0=0
		AND NOT EXISTS (
				SELECT 'X'
				FROM mam_cost_dpt m
				WHERE 0=0
				AND m.dpt_cd = w.dpt
				AND m.term = l_g_term
				AND m.del_flg = c_off
		)
	;
	dpt_r RECORD;

	fix_r RECORD;
BEGIN
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_INS_MGTIF2MGT.P_IF');

	l_rc := c_ok;

	l_ts := fcpa_date_util$f_mcsystimestamp();
	l_usr := COALESCE(fcpa_context$f_get_userid(), fcpa_context$f_get_os_usr());

	/* 一時テーブルの作成 */
	CALL fcpa_postgres_util$type_is_table_row('mgpa_ins_mgtif2mgt$p_if$rec_io', 'mgw_io', 'integer') ;

	/* 期の取得 */
	l_g_term := mapa_term$f_get_term_ne(i_ym);

	/* IFパラメータの取得 */
	l_g_co_parm := mgpa_co_parm$f_get_rec();
	l_stktk_sum := l_g_co_parm.stktk_sum_flg;
	l_oth_ccn_sum := l_g_co_parm.oth_ccn_sum_flg;

	IF i_mfg = c_on THEN
		/* 経費配賦振替マスタによる振替処理が可能かチェック */
		SELECT MAX(t.wg_cd)
		INTO STRICT l_wg_cd
		FROM mgt_act_alc_amt t
		WHERE 0=0
		AND t.ym = i_ym
		AND t.alc_rec_typ = c_alc_rec_purc
		AND t.pre_alc_fin_flg = c_on
		AND t.trd_wg_cd = i_wg_cd
		AND t.calc_ctg_cd = i_calc_ctg
		;

		IF l_wg_cd IS NOT NULL THEN
			l_msg := fcpa_err$msg_binder('MGT_ACT_ALC_AMT', i_calc_ctg, l_wg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			CALL fcpa_err$raise_app_err('MGBBD0014', l_msg);
		END IF;
	END IF;

	IF i_mfg = c_on OR i_tran = c_on THEN
		FOR fix_r IN
			SELECT DISTINCT
				t1.calc_grp_cd
			FROM mgt_calc_fix t1
				INNER JOIN mgt_arg t2 ON (
					t1.calc_no = t2.calc_no
					AND t1.calc_grp_cd = t2.calc_grp_cd
					AND t2.sa_typ = c_sa_act)
			WHERE 0=0
			AND t1.ym = i_ym
		LOOP
			IF i_mfg = c_on THEN
				/* 配賦費用実績が確定している場合、購買から配賦費用実績へ振り替えた実績が存在するとエラーとする */
				SELECT MAX(t.calc_ctg_cd)
				INTO STRICT l_calc_ctg
				FROM mgt_ctg_fix t
				WHERE 0=0
				AND t.calc_grp_cd = fix_r.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_calc_ctg_alc_amt
				AND t.calc_ctg_cd = i_calc_ctg
				;

				SELECT MAX(t1.wg_cd)
				INTO STRICT l_wg_cd
				FROM mgt_act_alc_amt t1
					INNER JOIN mgt_wg_fix t2 ON (
						t2.calc_grp_cd = fix_r.calc_grp_cd
						AND t2.ym = i_ym
						AND t1.wg_cd = t2.wg_cd
						AND t1.ym = t2.ym)
				WHERE 0=0
				AND t1.alc_rec_typ = c_alc_rec_purc
				AND t1.trd_wg_cd = i_wg_cd
				;

				IF l_calc_ctg IS NOT NULL AND l_wg_cd IS NOT NULL THEN
					l_msg := fcpa_err$msg_binder('MGT_ACT_ALC_AMT', fix_r.calc_grp_cd, l_calc_ctg, l_wg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
					CALL fcpa_err$raise_app_err('MGBBD0019', l_msg);
				END IF;
			END IF;

			IF i_tran = c_on THEN
				/* 投入実績が確定している場合、入出庫から投入へ振り替える設定がされているとエラーとする */
				SELECT MAX(t.calc_ctg_cd)
				INTO STRICT l_calc_ctg
				FROM mgt_ctg_fix t
				WHERE 0=0
				AND t.calc_grp_cd = fix_r.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_calc_ctg_inpt
				AND t.calc_ctg_cd = i_calc_ctg
				;

				SELECT MAX(t.wg_cd)
				INTO STRICT l_wg_cd
				FROM mgt_wg_fix t
				WHERE 0=0
				AND t.calc_grp_cd = fix_r.calc_grp_cd
				AND t.ym = i_ym
				AND t.wg_cd = i_wg_cd
				;

				IF l_calc_ctg IS NOT NULL AND l_wg_cd IS NOT NULL THEN
					SELECT COUNT(*)
					INTO STRICT l_cnt
					FROM mam_act_io m
					WHERE 0=0
					AND m.calc_ctg_cd = i_calc_ctg
					AND m.wg_cd = i_wg_cd
					AND m.io_trans_typ = c_trans_inpt
					AND i_ym BETWEEN m.st_dt AND m.end_dt
					;

					IF l_cnt > 0 THEN
						l_msg := fcpa_err$msg_binder('MGT_ACT_IO', fix_r.calc_grp_cd, i_calc_ctg, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
						CALL fcpa_err$raise_app_err('MGBXD0025', l_msg);
					END IF;
					SELECT COUNT(*)
					INTO STRICT l_cnt
					FROM mgt_act_io_if t
					WHERE 0=0
					AND t.calc_ctg_cd = i_calc_ctg
					AND t.wg_cd = i_wg_cd
					AND t.ym = i_ym
					AND t.mfg_act_grp IS NOT NULL
					;

					IF l_cnt > 0 THEN
						l_msg := fcpa_err$msg_binder(fix_r.calc_grp_cd, i_calc_ctg, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
						CALL fcpa_err$raise_app_err('MGBXD0048', l_msg);
					END IF;
				END IF;
			END IF;
		END LOOP;
	END IF;

	<<SKIP_CHK>>
	BEGIN

		IF i_del = c_on OR l_g_co_parm.chk_mst_flg = c_off THEN
			EXIT SKIP_CHK;
		END IF;

		l_g_parm_itm_sub_typ := mapa_comm$f_get_parm('ITM_SUB_TYP');

		/* マスタチェック */
		FOR itm_r IN itm LOOP
			l_rc := c_err1;
			CALL fcpa_batch_log$p_data_log('MGBBD0011', l_log_no, l_log_sub_key1, l_log_sub_key2,
						itm_r.tbl, mapa_comm$f_to_disp_itm(itm_r.itm_cd, itm_r.itm_sub1, itm_r.itm_sub2, itm_r.itm_sub3, l_g_parm_itm_sub_typ));
		END LOOP;

		FOR loc_r IN loc LOOP
			l_rc := c_err1;
			CALL fcpa_batch_log$p_data_log('MGBBD0010', l_log_no, l_log_sub_key1, l_log_sub_key2, loc_r.tbl, loc_r.loc);
		END LOOP;

		FOR bp_r IN bp LOOP
			l_rc := c_err1;
			CALL fcpa_batch_log$p_data_log('MGBBD0009', l_log_no, l_log_sub_key1, l_log_sub_key2, bp_r.tbl, bp_r.bp);
		END LOOP;

		FOR dpt_r IN dpt LOOP
			l_rc := c_err1;
			CALL fcpa_batch_log$p_data_log('MGBBD0008', l_log_no, l_log_sub_key1, l_log_sub_key2, dpt_r.tbl, dpt_r.dpt, fcpa_date_util$f_to_char(l_g_term, fcpa_date_util$y4m()));
		END LOOP;

		IF l_rc = c_err1 THEN
			/* マスタチェックでエラーが発生しました。{1} */
			l_msg := fcpa_err$msg_binder('MGPA_INS_MGTIF2MGT');
			CALL fcpa_err$raise_app_err('MGBBD0012', l_msg);
		END IF;

	END;--SKIP_CHK

	/* 該当月のデータは削除 */
	IF i_mfg = c_on THEN
		DELETE FROM mgt_act_alc_amt t
		WHERE 0=0
		AND t.ym = i_ym
		AND t.calc_ctg_cd = i_calc_ctg
		AND t.trd_wg_cd = i_wg_cd
		AND t.alc_rec_typ = c_alc_rec_purc
		;

		DELETE FROM mgt_act_inpt_expns t
		WHERE 0=0
		AND EXISTS (
				SELECT 'X'
				FROM mgt_act_inpt w
				WHERE 0=0
				AND w.ym = i_ym
				AND w.calc_ctg_cd = i_calc_ctg
				AND w.wg_cd = i_wg_cd
				AND w.act_inpt_id = t.act_inpt_id
				AND w.act_inpt_id_sub = t.act_inpt_id_sub
				)
		;

		DELETE FROM mgt_act_mfg t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg AND t.wg_cd = i_wg_cd;
		DELETE FROM mgt_act_inst_wip t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg AND t.wg_cd = i_wg_cd;
		DELETE FROM mgt_act_purc t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg AND t.wg_cd = i_wg_cd;
		DELETE FROM mgt_act_inpt t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg AND t.wg_cd = i_wg_cd AND t.mfg_act_grp IS NULL;
		DELETE FROM mgt_act_inst_wk t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg AND t.wg_cd = i_wg_cd;
		DELETE FROM mgt_act_other_wk t WHERE t.ym = i_ym AND t.calc_ctg_cd = i_calc_ctg AND t.wg_cd = i_wg_cd;
	END IF;

	IF i_tran = c_on THEN
		DELETE FROM mgt_act_inpt t
		WHERE 0=0
		AND t.ym = i_ym
		AND t.calc_ctg_cd = i_calc_ctg
		AND t.wg_cd = i_wg_cd
		AND mac_ac_slip_typ$is_acxfer_typ(t.ac_slip_typ) = c_on
		;

		DELETE FROM mgt_act_inpt t
		WHERE 0=0
		AND t.ym = i_ym
		AND t.calc_ctg_cd = i_calc_ctg
		AND t.wg_cd = i_wg_cd
		AND t.mfg_act_grp IS NOT NULL
		;

		DELETE FROM mgt_act_io_expns t
		WHERE 0=0
		AND EXISTS (
				SELECT 'X'
				FROM mgt_act_io w
				WHERE 0=0
				AND w.ym = i_ym
				AND w.calc_ctg_cd = i_calc_ctg
				AND w.wg_cd = i_wg_cd
				AND t.act_io_id = w.act_io_id
				AND t.act_io_id_sub = w.act_io_id_sub
				)
		;

		DELETE FROM mgt_act_sls_expns t
		WHERE 0=0
		AND EXISTS (
				SELECT 'X'
				FROM mgt_act_sls w
				WHERE 0=0
				AND w.ym = i_ym
				AND w.calc_ctg_cd = i_calc_ctg
				AND w.wg_cd = i_wg_cd
				AND t.act_sls_id = w.act_sls_id
				AND t.act_sls_id_sub = w.act_sls_id_sub
				)
		;

		DELETE FROM mgt_act_io t
		WHERE t.ym = i_ym
		AND t.calc_ctg_cd = i_calc_ctg
		AND t.wg_cd = i_wg_cd
		;

		DELETE FROM mgt_act_sls t
		WHERE t.ym = i_ym
		AND t.calc_ctg_cd = i_calc_ctg
		AND t.wg_cd = i_wg_cd
		;
	END IF;

	IF i_stk = c_on THEN
		DELETE FROM mgt_act_stk t
		WHERE t.ym = i_ym
		AND t.calc_ctg_cd = i_calc_ctg
		AND t.wg_cd = i_wg_cd
		;
	END IF;

	<<PROD_END>>
	BEGIN

		IF i_del = c_on THEN
			EXIT PROD_END;
		END IF;

		DELETE FROM mgw_wio w;
		DELETE FROM mgw_wio2 w;
		DELETE FROM mgw_io w;

		<<SKIP_MFG>>
		BEGIN

			IF i_mfg = c_off THEN
				EXIT SKIP_MFG;
			END IF;

			/* 製造実績の取込 */
			SELECT MAX(t.ym), MAX(t.calc_ctg_cd), MAX(t.wg_cd)
			INTO STRICT l_ym, l_calc_ctg, l_wg_cd
			FROM mgt_act_mfg_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_mfg w
					WHERE 0=0
					AND w.act_mfg_id = t.data_lno::VARCHAR
					AND (w.calc_ctg_cd <> i_calc_ctg OR w.wg_cd <> i_wg_cd OR w.ym <> i_ym)
					)
			LIMIT 1
			;

			IF l_calc_ctg IS NOT NULL THEN
				CALL mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(l_calc_ctg, l_wg_cd, l_ym);
			END IF;

			INSERT INTO mgt_act_mfg (
				act_mfg_id,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				oper_act_no,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				loc_cd, str_ln_cd,
				ac_slip_typ, ac_rsn_cd,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				mfg_per,
				mfg_cost_ratio,
				expns_cd,
				alc_val1, alc_val2, alc_val3, alc_val4, alc_val5
 			)
			SELECT
				MAX(t.act_mfg_id),
				t.calc_ctg_cd,
				t.wg_cd,
				t.ym, MAX(t.ac_dt),
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.itm_mfg_inst_no,
				t.mfg_act_no,
				t.oper_act_no,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.loc_cd, t.str_ln_cd,
				t.ac_slip_typ, t.ac_rsn_cd,
				SUM(t.qty), SUM(t.amt),
				t.trd_cur_cd,
				SUM(t.trd_cur_amt),
				t.xrate,
				MAX(t.mfg_per),
				SUM(t.mfg_cost_ratio),
				t.expns_cd,
				SUM(t.alc_val1), SUM(t.alc_val2), SUM(t.alc_val3), SUM(t.alc_val4), SUM(t.alc_val5)
			FROM (
				SELECT
					MAX(x.data_lno::VARCHAR) act_mfg_id,
					x.calc_ctg_cd,
					x.wg_cd,
					x.ym, MAX(x.ac_dt) ac_dt,
					x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
					x.itm_mfg_inst_no,
					x.mfg_act_no,
					x.oper_act_no,
					x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
					x.loc_cd, x.str_ln_cd,
					x.ac_slip_typ, x.ac_rsn_cd,
					SUM(x.qty) qty, SUM(x.amt) amt,
					x.trd_cur_cd,
					SUM(x.trd_cur_amt) trd_cur_amt,
					x.xrate,
					x.mfg_per,
					SUM(x.mfg_cost_ratio) mfg_cost_ratio,
					x.expns_cd,
					SUM(x.alc_val1) alc_val1,
					SUM(x.alc_val2) alc_val2,
					SUM(x.alc_val3) alc_val3,
					SUM(x.alc_val4) alc_val4,
					SUM(x.alc_val5) alc_val5
				FROM mgt_act_mfg_if x
				WHERE 0=0
				AND x.ym = i_ym
				AND x.calc_ctg_cd = i_calc_ctg
				AND x.wg_cd = i_wg_cd
				GROUP BY
					x.calc_ctg_cd,
					x.wg_cd,
					x.ym,
					x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
					x.itm_mfg_inst_no,
					x.mfg_act_no,
					x.oper_act_no,
					x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
					x.loc_cd, x.str_ln_cd,
					x.ac_slip_typ, x.ac_rsn_cd,
					x.trd_cur_cd,
					x.xrate,
					x.mfg_per,
					x.expns_cd
				) t
			WHERE 0=0
			AND (t.qty <> 0 OR t.amt <> 0 OR t.trd_cur_amt <> 0
				OR t.alc_val1 <> 0 OR t.alc_val2 <> 0 OR t.alc_val3 <> 0 OR t.alc_val4 <> 0 OR t.alc_val5 <> 0)
			GROUP BY
				t.calc_ctg_cd,
				t.wg_cd,
				t.ym,
				t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.itm_mfg_inst_no,
				t.mfg_act_no,
				t.oper_act_no,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.loc_cd, t.str_ln_cd,
				t.ac_slip_typ, t.ac_rsn_cd,
				t.trd_cur_cd,
				t.xrate,
				t.expns_cd
			;

			DELETE FROM mgt_act_mfg x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.qty = 0
			AND COALESCE(x.amt, 0) = 0
			AND COALESCE(x.trd_cur_amt, 0) = 0
			AND COALESCE(x.alc_val1, 0) = 0
			AND COALESCE(x.alc_val2, 0) = 0
			AND COALESCE(x.alc_val3, 0) = 0
			AND COALESCE(x.alc_val4, 0) = 0
			AND COALESCE(x.alc_val5, 0) = 0
			;

			/* 指図仕掛実績の取込 */
			INSERT INTO mgt_act_inst_wip (
				calc_ctg_cd,
				wg_cd,
				ym,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				oper_act_no,
				loc_cd, str_ln_cd,
				ac_rsn_cd,
				wip_qty, wip_per
			)
			SELECT
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.itm_mfg_inst_no,
				x.mfg_act_no,
				x.oper_act_no,
				x.loc_cd, x.str_ln_cd,
				x.ac_rsn_cd,
				x.wip_qty, x.wip_per
			FROM mgt_act_inst_wip_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			;

			DELETE FROM mgt_act_inst_wip x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.wip_qty = 0
			;

			/* 購買実績の取込 */
			SELECT MAX(t.ym), MAX(t.calc_ctg_cd), MAX(t.wg_cd)
			INTO STRICT l_ym, l_calc_ctg, l_wg_cd
			FROM mgt_act_purc_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_purc w
					WHERE 0=0
					AND w.act_purc_id = t.data_lno::VARCHAR
					AND (w.calc_ctg_cd <> i_calc_ctg OR w.wg_cd <> i_wg_cd OR w.ym <> i_ym)
					)
			LIMIT 1
			;

			IF l_calc_ctg IS NOT NULL THEN
				CALL mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(l_calc_ctg, l_wg_cd, l_ym);
			END IF;

			/* 経費関連は取込まない */
			INSERT INTO mgt_act_purc (
				act_purc_id,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				sppl_cd,
				po_no, slo_no, iv_no,
				alc_dpt_cd,
				ac_slip_typ, ac_rsn_cd,
				asst_typ,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				expns_cd,
				alc_val1, alc_val2, alc_val3, alc_val4, alc_val5
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				x.calc_ctg_cd,
				x.wg_cd, x.ym, MAX(x.ac_dt),
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.sppl_cd,
				x.po_no, x.slo_no, x.iv_no,
				x.alc_dpt_cd,
				x.ac_slip_typ, x.ac_rsn_cd,
				x.asst_typ,
				SUM(x.qty), SUM(x.amt),
				x.trd_cur_cd,
				SUM(x.trd_cur_amt),
				x.xrate,
				x.expns_cd,
				SUM(x.alc_val1), SUM(x.alc_val2), SUM(x.alc_val3), SUM(x.alc_val4), SUM(x.alc_val5)
			FROM mgt_act_purc_if x
				INNER JOIN mam_itm_srch m ON (
					x.itm_cd = m.itm_cd
					AND x.itm_sub1 = m.itm_sub1
					AND x.itm_sub2 = m.itm_sub2
					AND x.itm_sub3 = m.itm_sub3
					AND m.asset_mng_typ = c_asset_mng_mng
					AND m.del_flg = c_off
					AND m.release_flg = c_on)
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.ac_slip_typ NOT IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt_xpns, c_purc_xtra_xpns)
			GROUP BY
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.sppl_cd,
				x.po_no, x.slo_no, x.iv_no,
				x.alc_dpt_cd,
				x.ac_slip_typ, x.ac_rsn_cd,
				x.asst_typ,
				x.trd_cur_cd,
				x.xrate,
				x.expns_cd
			;

			DELETE FROM mgt_act_purc x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.qty = 0
			AND x.amt = 0
			AND COALESCE(x.trd_cur_amt, 0) = 0
			AND COALESCE(x.alc_val1, 0) = 0
			AND COALESCE(x.alc_val2, 0) = 0
			AND COALESCE(x.alc_val3, 0) = 0
			AND COALESCE(x.alc_val4, 0) = 0
			AND COALESCE(x.alc_val5, 0) = 0
			;

			INSERT INTO mgt_act_alc_amt (
				act_alc_amt_key,
				calc_ctg_cd,
				alc_rec_typ,
				wg_cd,
				ym,
				alc_ac_cd,
				dpt_cd, loc_cd, oper_cd,
				bp_cd, ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				itm_mfg_inst_no, iv_no, po_no, slo_no,
				amt,
				trd_wg_cd, trd_calc_grp_cd, trd_calc_no,
				pre_alc_fin_flg
			)
			SELECT
				mapa_num$f_get_seq(c_num_sys_alc),
				t.calc_ctg_cd,
				c_alc_rec_purc,
				t.wg_cd,
				t.ym,
				t.alc_ac_cd,
				t.dpt_cd, t.loc_cd, t.oper_cd,
				t.bp_cd, t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
				t.amt,
				t.trd_wg_cd, t.trd_calc_grp_cd, t.trd_calc_no,
				c_off
			FROM (
				SELECT
					x.calc_ctg_cd,
					COALESCE(m.alc_wg_cd, x.wg_cd) wg_cd,
					x.ym,
					m.alc_ac_cd,
					CASE m.dpt_flg
						WHEN c_off THEN m.dpt_cd
						ELSE x.alc_dpt_cd
					END dpt_cd,
					COALESCE(x.alc_loc_cd, m.loc_cd) loc_cd,
					COALESCE(x.alc_oper_cd, m.oper_cd) oper_cd,
					CASE m.bp_flg
						WHEN c_off THEN m.bp_cd
						ELSE x.sppl_cd
					END bp_cd,
					COALESCE(x.alc_ctg_cd, m.ctg_cd) ctg_cd,
					m.itm_cd,
					m.itm_sub1,
					m.itm_sub2,
					m.itm_sub3,
					CASE m.lot_no_flg
						WHEN c_off THEN m.lot_no
						ELSE
						CASE x.lot_no
							WHEN c_null_val THEN NULL
							ELSE x.lot_no
						END
					END lot_no,
					CASE m.sublot_no_flg
						WHEN c_off THEN m.sublot_no
						ELSE
						CASE x.sublot_no
							WHEN c_null_val THEN NULL
							ELSE x.sublot_no
						END
					END sublot_no,
					CASE m.sno1_flg
						WHEN c_off THEN m.sno1
						ELSE
						CASE x.sno1
							WHEN c_null_val THEN NULL
							ELSE x.sno1
						END
					END sno1,
					CASE m.sno2_flg
						WHEN c_off THEN m.sno2
						ELSE
						CASE x.sno2
							WHEN c_null_val THEN NULL
							ELSE x.sno2
						END
					END sno2,
					CASE m.sno3_flg
						WHEN c_off THEN m.sno3
						ELSE
						CASE x.sno3
							WHEN c_null_val THEN NULL
							ELSE x.sno3
						END
					END sno3,
					CASE m.sno4_flg
						WHEN c_off THEN m.sno4
						ELSE
						CASE x.sno4
							WHEN c_null_val THEN NULL
							ELSE x.sno4
						END
					END sno4, 
					NULL itm_mfg_inst_no,
					CASE m.iv_no_flg
						WHEN c_off THEN NULL
						ELSE x.iv_no
					END iv_no,
					CASE m.po_no_flg
						WHEN c_off THEN NULL
						ELSE x.po_no
					END po_no,
					CASE m.slo_no_flg
						WHEN c_off THEN NULL
						ELSE x.slo_no
					END slo_no,
					SUM(x.amt) amt,
					x.wg_cd trd_wg_cd, NULL trd_calc_grp_cd, NULL trd_calc_no
				FROM mgt_act_purc_if x
					INNER JOIN mam_xpns_purc_alc m ON (
						x.itm_cd = m.xpns_itm_cd
						AND x.itm_sub1 = m.xpns_itm_sub1
						AND x.itm_sub2 = m.xpns_itm_sub2
						AND x.itm_sub3 = m.xpns_itm_sub3
						AND x.ac_rsn_cd = m.ac_rsn_cd
						AND x.calc_ctg_cd = m.calc_ctg_cd
						AND x.wg_cd = m.wg_cd
						AND x.ac_dt BETWEEN m.st_dt AND m.end_dt)
				WHERE 0=0
				AND x.ym = i_ym
				AND x.calc_ctg_cd = i_calc_ctg
				AND x.wg_cd = i_wg_cd
				GROUP BY
					x.calc_ctg_cd,
					COALESCE(m.alc_wg_cd, x.wg_cd),
					x.ym,
					m.alc_ac_cd,
					CASE m.dpt_flg
						WHEN c_off THEN m.dpt_cd
						ELSE x.alc_dpt_cd
					END,
					COALESCE(x.alc_loc_cd, m.loc_cd),
					COALESCE(x.alc_oper_cd, m.oper_cd),
					CASE m.bp_flg
						WHEN c_off THEN m.bp_cd
						ELSE x.sppl_cd
					END,
					COALESCE(x.alc_ctg_cd, m.ctg_cd),
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					CASE m.lot_no_flg
						WHEN c_off THEN m.lot_no
						ELSE
						CASE x.lot_no
							WHEN c_null_val THEN NULL
							ELSE x.lot_no
						END
					END,
					CASE m.sublot_no_flg
						WHEN c_off THEN m.sublot_no
						ELSE
						CASE x.sublot_no
							WHEN c_null_val THEN NULL
							ELSE x.sublot_no
						END
					END,
					CASE m.sno1_flg
						WHEN c_off THEN m.sno1
						ELSE
						CASE x.sno1
							WHEN c_null_val THEN NULL
							ELSE x.sno1
						END
					END,
					CASE m.sno2_flg
						WHEN c_off THEN m.sno2
						ELSE
						CASE x.sno2
							WHEN c_null_val THEN NULL
							ELSE x.sno2
						END
					END,
					CASE m.sno3_flg
						WHEN c_off THEN m.sno3
						ELSE
						CASE x.sno3
							WHEN c_null_val THEN NULL
							ELSE x.sno3
						END
					END,
					CASE m.sno4_flg
						WHEN c_off THEN m.sno4
						ELSE
						CASE x.sno4
							WHEN c_null_val THEN NULL
							ELSE x.sno4
						END
					END,
					CASE m.iv_no_flg
						WHEN c_off THEN NULL
						ELSE x.iv_no
					END,
					CASE m.po_no_flg
						WHEN c_off THEN NULL
						ELSE x.po_no
					END,
					CASE m.slo_no_flg
						WHEN c_off THEN NULL
						ELSE x.slo_no
					END, x.wg_cd
				HAVING SUM(x.amt) <> 0
				) t
			WHERE 0=0
			;

			/* 投入実績の取込 */
			SELECT MAX(t.ym), MAX(t.calc_ctg_cd), MAX(t.wg_cd)
			INTO STRICT l_ym, l_calc_ctg, l_wg_cd
			FROM mgt_act_inpt_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_inpt w
					WHERE 0=0
					AND w.act_inpt_id = t.data_lno::VARCHAR
					AND (w.calc_ctg_cd <> i_calc_ctg OR w.wg_cd <> i_wg_cd OR w.ym <> i_ym)
					)
			LIMIT 1
			;

			IF l_calc_ctg IS NOT NULL THEN
				CALL mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(l_calc_ctg, l_wg_cd, l_ym);
			END IF;

			INSERT INTO mgt_act_inpt (
				act_inpt_id,
				act_inpt_id_sub,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				oper_act_no,
				loc_cd, str_ln_cd,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				ac_slip_typ, ac_rsn_cd,
				stk_bp_cd, asst_typ,
				bp_cd,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				rec_eval_typ,
				expns_cd,
				zero_effect_flg
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				'0',
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym, MAX(x.ac_dt),
				x.par_itm_cd, x.par_itm_sub1, x.par_itm_sub2, x.par_itm_sub3,
				x.itm_mfg_inst_no,
				x.mfg_act_no,
				x.oper_act_no,
				x.loc_cd, x.str_ln_cd,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.ac_slip_typ, x.ac_rsn_cd,
				x.stk_bp_cd, x.asst_typ,
				CASE WHEN x.ac_slip_typ = c_in_onr
						AND m.repurc_obli_flg = c_on
						AND x.asst_typ IN (c_asst1, c_asst2) THEN x.stk_bp_cd
					ELSE NULL
				END,
				SUM(x.qty), SUM(x.amt),
				x.trd_cur_cd,
				SUM(x.trd_cur_amt),
				x.xrate,
				x.rec_eval_typ,
				x.expns_cd,
				x.zero_effect_flg
			FROM mgt_act_inpt_if x
				LEFT OUTER JOIN mam_bp m ON (x.stk_bp_cd = m.bp_cd)
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			GROUP BY
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.par_itm_cd, x.par_itm_sub1, x.par_itm_sub2, x.par_itm_sub3,
				x.itm_mfg_inst_no,
				x.mfg_act_no,
				x.oper_act_no,
				x.loc_cd, x.str_ln_cd,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.ac_slip_typ, x.ac_rsn_cd,
				x.stk_bp_cd, x.asst_typ,
				CASE WHEN x.ac_slip_typ = c_in_onr
						AND m.repurc_obli_flg = c_on
						AND x.asst_typ IN (c_asst1, c_asst2) THEN x.stk_bp_cd
					ELSE NULL
				END,
				x.trd_cur_cd,
				x.xrate,
				x.rec_eval_typ,
				x.expns_cd,
				x.zero_effect_flg
			;

			DELETE FROM mgt_act_inpt x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.qty = 0
			AND COALESCE(x.amt, 0) = 0
			AND COALESCE(x.trd_cur_amt, 0) = 0
			AND x.zero_effect_flg = c_off
			;

			UPDATE mgt_act_inpt t
			SET stk_bp_cd =
					(
					SELECT MAX(w.sppl_cd)
					FROM mgt_itm_mfg_inst w
					WHERE 0=0
					AND w.calc_ctg_cd = t.calc_ctg_cd
					AND w.itm_cd = t.par_itm_cd
					AND w.itm_sub1 = t.par_itm_sub1
					AND w.itm_sub2 = t.par_itm_sub2
					AND w.itm_sub3 = t.par_itm_sub3
					AND w.itm_mfg_inst_no = t.itm_mfg_inst_no
					AND w.mfg_act_no = t.mfg_act_no
					AND w.sppl_cd IS NOT NULL
					)
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND t.stk_bp_cd IS NULL
			AND EXISTS (
					SELECT 'X'
					FROM mgt_itm_mfg_inst x
					WHERE 0=0
					AND x.calc_ctg_cd = t.calc_ctg_cd
					AND x.itm_cd = t.par_itm_cd
					AND x.itm_sub1 = t.par_itm_sub1
					AND x.itm_sub2 = t.par_itm_sub2
					AND x.itm_sub3 = t.par_itm_sub3
					AND x.itm_mfg_inst_no = t.itm_mfg_inst_no
					AND x.mfg_act_no = t.mfg_act_no
					AND x.sppl_cd IS NOT NULL
					)
			;

			/* 指図工数実績の取込 */
			SELECT MAX(t.ym), MAX(t.calc_ctg_cd), MAX(t.wg_cd)
			INTO STRICT l_ym, l_calc_ctg, l_wg_cd
			FROM mgt_act_inst_wk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_inst_wk w
					WHERE 0=0
					AND w.act_inst_wk_id = t.data_lno::VARCHAR
					AND (w.calc_ctg_cd <> i_calc_ctg OR w.wg_cd <> i_wg_cd OR w.ym <> i_ym)
					)
			LIMIT 1
			;

			IF l_calc_ctg IS NOT NULL THEN
				CALL mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(l_calc_ctg, l_wg_cd, l_ym);
			END IF;

			INSERT INTO mgt_act_inst_wk (
				act_inst_wk_id,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				oper_act_no,
				loc_cd, str_ln_cd,
				wk_cost_cd,
				wk_rsn_cd,
				wk_cost
			)
			SELECT
				MAX(x.data_lno),
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym, MAX(x.ac_dt),
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.itm_mfg_inst_no,
				x.mfg_act_no,
				x.oper_act_no,
				x.loc_cd, x.str_ln_cd,
				x.wk_cost_cd,
				x.wk_rsn_cd,
				SUM(x.wk_cost)
			FROM mgt_act_inst_wk_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			GROUP BY
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.itm_mfg_inst_no,
				x.mfg_act_no,
				x.oper_act_no,
				x.loc_cd, x.str_ln_cd,
				x.wk_cost_cd,
				x.wk_rsn_cd
			;

			DELETE FROM mgt_act_inst_wk x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.wk_cost = 0
			;

			/* 指図外工数実績の取込 */
			SELECT MAX(t.ym), MAX(t.calc_ctg_cd), MAX(t.wg_cd)
			INTO STRICT l_ym, l_calc_ctg, l_wg_cd
			FROM mgt_act_other_wk_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_other_wk w
					WHERE 0=0
					AND w.act_other_wk_id = t.data_lno::VARCHAR
					AND (w.calc_ctg_cd <> i_calc_ctg OR w.wg_cd <> i_wg_cd OR w.ym <> i_ym)
					)
			LIMIT 1
			;

			IF l_calc_ctg IS NOT NULL THEN
				CALL mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(l_calc_ctg, l_wg_cd, l_ym);
			END IF;

			/* 指図外工数実績ＩＦの指図工数実績への振替 */
			CALL mgpa_ins_mgtif2mgt$p_other_wk_to_inst_wk(i_calc_ctg, i_wg_cd, i_ym);

			INSERT INTO mgt_act_other_wk (
				act_other_wk_id,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				dpt_cd, ctg_cd,
				loc_cd, oper_cd,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				wk_cost_cd,
				wk_rsn_cd,
				wk_cost
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym, MAX(x.ac_dt),
				x.dpt_cd, x.ctg_cd,
				x.loc_cd, x.oper_cd,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.wk_cost_cd,
				x.wk_rsn_cd,
				SUM(x.wk_cost)
			FROM mgw_act_other_wk_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			GROUP BY
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.dpt_cd, x.ctg_cd,
				x.loc_cd, x.oper_cd,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.wk_cost_cd,
				x.wk_rsn_cd
			;

			DELETE FROM mgt_act_other_wk x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.wk_cost = 0
			;

		END;--SKIP_MFG

		<<SKIP_TRAN>>
		BEGIN

			IF i_tran = c_off THEN
				EXIT SKIP_TRAN;
			END IF;

			/* 無償支給、有償支給、出荷のデータチェック */
			SELECT MAX(t.ym), MAX(t.calc_ctg_cd), MAX(t.wg_cd)
			INTO STRICT l_ym, l_calc_ctg, l_wg_cd
			FROM mgt_act_io_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND COALESCE(t.other_wg_cd, t.wg_cd) = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_io w
					WHERE 0=0
					AND w.act_io_id = t.data_lno::VARCHAR
					AND w.act_io_id_sub = '0'
					AND (w.calc_ctg_cd <> i_calc_ctg OR w.wg_cd <> i_wg_cd OR w.ym <> i_ym)
					AND w.ac_slip_typ IN (
							c_ffr_prov, c_ffr_prvr,
							c_onr_prov, c_onr_prvr, c_ship,
							c_ship_ret
							)
					)
			LIMIT 1
			;

			IF l_calc_ctg IS NOT NULL THEN
				CALL mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(l_calc_ctg, l_wg_cd, l_ym);
			END IF;

			/* 無償支給の取込 */
			INSERT INTO mgt_act_io (
				act_io_id,
				act_io_id_sub,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				cost_io_typ,
				ac_slip_typ,
				ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd,
				bp_cd, stk_bp_cd,
				asst_typ,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				rec_eval_typ,
				zero_effect_flg
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				'0',
				x.calc_ctg_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),		/* ワーキンググループ違いの支給は部門振替を作成する */
				x.ym, MAX(x.ac_dt),
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),	/* 部門違いの支給は部門振替を作成する */
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				c_io_ffr_prov,		/* 無償支給 */
				CASE WHEN SUM(x.qty) >= 0
					THEN c_ffr_prov	/* 無償支給 */
					ELSE c_ffr_prvr	/* 無償支給戻 */
				END,
				x.ac_rsn_cd,
				CASE x.wg_cd
					WHEN x.other_wg_cd THEN NULL
					ELSE x.other_wg_cd
				END,
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.bp_cd, NULL,
				x.asst_typ,
				SUM(x.qty), SUM(x.amt),
				x.trd_cur_cd,
				SUM(x.trd_cur_amt),
				x.xrate,
				x.rec_eval_typ,
				x.zero_effect_flg
			FROM mgt_act_io_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND COALESCE(x.other_wg_cd, x.wg_cd) = i_wg_cd
			AND x.ac_slip_typ IN (c_ffr_prov, c_ffr_prvr)
			GROUP BY
				x.calc_ctg_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),
				x.ym,
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.ac_rsn_cd,
				CASE x.wg_cd
					WHEN x.other_wg_cd THEN NULL
					ELSE x.other_wg_cd
				END,
				x.bp_cd,
				x.asst_typ,
				x.trd_cur_cd,
				x.xrate,
				x.rec_eval_typ,
				x.zero_effect_flg
			;

			/* 有償支給の取込 */
			INSERT INTO mgt_act_io (
				act_io_id,
				act_io_id_sub,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				cost_io_typ,
				ac_slip_typ,
				ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd,
				bp_cd, stk_bp_cd,
				asst_typ,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				rec_eval_typ,
				zero_effect_flg
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				'0',
				x.calc_ctg_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),		/* ワーキンググループ違いの支給は部門振替を作成する */
				x.ym, MAX(x.ac_dt),
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),	/* 部門違いの支給は部門振替を作成する */
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				c_io_onr_prov,		/* 有償支給 */
				CASE WHEN SUM(x.qty) >= 0
					THEN c_onr_prov	/* 有償支給 */
					ELSE c_onr_prvr	/* 有償支給戻 */
				END,
				x.ac_rsn_cd,
				CASE x.wg_cd
					WHEN x.other_wg_cd THEN NULL
					ELSE x.other_wg_cd
				END,
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.bp_cd, NULL,
				x.asst_typ,
				SUM(x.qty), SUM(x.amt),
				x.trd_cur_cd,
				SUM(x.trd_cur_amt),
				x.xrate,
				x.rec_eval_typ,
				x.zero_effect_flg
			FROM mgt_act_io_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND COALESCE(x.other_wg_cd, x.wg_cd) = i_wg_cd
			AND x.ac_slip_typ IN (c_onr_prov, c_onr_prvr)
			GROUP BY
				x.calc_ctg_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),
				x.ym,
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.ac_rsn_cd,
				CASE x.wg_cd
					WHEN x.other_wg_cd THEN NULL
					ELSE x.other_wg_cd
				END,
				x.bp_cd,
				x.asst_typ,
				x.trd_cur_cd,
				x.xrate,
				x.rec_eval_typ,
				x.zero_effect_flg
			;

			/* 出荷の取込 */
			INSERT INTO mgt_act_io (
				act_io_id,
				act_io_id_sub,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				cost_io_typ,
				ac_slip_typ,
				ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd,
				bp_cd, stk_bp_cd,
				asst_typ,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				rec_eval_typ,
				zero_effect_flg
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				'0',
				x.calc_ctg_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),		/* ワーキンググループ違いの出荷は部門振替を作成する */
				x.ym, MAX(x.ac_dt),
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),	/* 部門違いの出荷は部門振替を作成する */
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				c_io_stk_io,		/* 入出庫 */
				CASE WHEN SUM(x.qty) >= 0
					THEN c_ship		/* 出荷 */
					ELSE c_ship_ret	/* 出荷返品 */
				END,
				x.ac_rsn_cd,
				CASE x.wg_cd
					WHEN x.other_wg_cd THEN NULL
					ELSE x.other_wg_cd
				END,
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.bp_cd, NULL,
				x.asst_typ,
				SUM(x.qty), SUM(x.amt),
				x.trd_cur_cd,
				SUM(x.trd_cur_amt),
				x.xrate,
				x.rec_eval_typ,
				x.zero_effect_flg
			FROM mgt_act_io_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND COALESCE(x.other_wg_cd, x.wg_cd) = i_wg_cd
			AND x.ac_slip_typ IN (c_ship, c_ship_ret)
			GROUP BY
				x.calc_ctg_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),
				x.ym,
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.ac_rsn_cd,
				CASE x.wg_cd
					WHEN x.other_wg_cd THEN NULL
					ELSE x.other_wg_cd
				END,
				x.bp_cd,
				x.asst_typ,
				x.trd_cur_cd,
				x.xrate,
				x.rec_eval_typ,
				x.zero_effect_flg
			;

			/* ワーキンググループ、部門違いの支給、出荷は部門振替を作成する */
			INSERT INTO mgw_io (
				act_io_id,
				act_io_id_sub,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				cost_io_typ,
				ac_slip_typ,
				ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd,
				bp_cd, stk_bp_cd,
				asst_typ,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				trd_grp,
				rec_eval_typ,
				sml_key,
				itm_jnl_cd,
				zero_effect_flg
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				'1',
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym, MAX(x.ac_dt),
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				c_io_stk_out,
				c_dpt_xfr_so,
				x.ac_rsn_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				NULL, NULL,
				x.asst_typ,
				SUM(x.qty), NULL,
				NULL,
				NULL,
				NULL,
				MAX(x.data_lno::VARCHAR),
				x.rec_eval_typ,
				TO_CHAR(x.ym, 'YYYYMMDD'),
				c_null_val,
				x.zero_effect_flg
			FROM mgt_act_io_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND (x.wg_cd = i_wg_cd OR x.other_wg_cd = i_wg_cd)
			AND x.ac_slip_typ IN (
						c_ffr_prov, c_ffr_prvr, c_onr_prov, c_onr_prvr,
						c_ship, c_ship_ret
						)
			AND (x.wg_cd <> x.other_wg_cd OR x.mng_dpt_cd <> x.other_dpt_cd)
			GROUP BY
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.ac_rsn_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.asst_typ,
				x.rec_eval_typ,
				TO_CHAR(x.ym, 'YYYYMMDD'),
				x.zero_effect_flg
			;

			/* 生販連携、部門振替、在庫振替の出庫、入庫実績の取込 */
			INSERT INTO mgw_io (
				act_io_id,
				act_io_id_sub,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				cost_io_typ,
				ac_slip_typ, ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd,
				bp_cd, stk_bp_cd,
				asst_typ,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				trd_grp, trd_ratio,
				rec_eval_typ,
				sml_key,
				itm_jnl_cd,
				zero_effect_flg
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				'0',
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym, MAX(x.ac_dt),
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				CASE
					WHEN x.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so, c_stk_sw_so)
						THEN c_io_stk_out	/* 出庫 */
					WHEN x.ac_slip_typ = c_stk_sw_gr
						THEN c_io_stk_in	/* 入庫 */
				END,
				x.ac_slip_typ, x.ac_rsn_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.bp_cd, x.stk_bp_cd,
				x.asst_typ,
				SUM(x.qty), SUM(x.amt),
				x.trd_cur_cd,
				SUM(x.trd_cur_amt),
				x.xrate,
				x.trd_grp, SUM(x.trd_ratio),
				x.rec_eval_typ,
				TO_CHAR(x.ym, 'YYYYMMDD'),
				m.itm_jnl_cd,
				x.zero_effect_flg
			FROM mgt_act_io_if x
				INNER JOIN mam_itm_srch m ON (
					x.itm_cd = m.itm_cd
					AND x.itm_sub1 = m.itm_sub1
					AND x.itm_sub2 = m.itm_sub2
					AND x.itm_sub3 = m.itm_sub3
					AND m.del_flg = c_off
					AND m.release_flg = c_on)
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND (
				x.wg_cd = i_wg_cd
				OR
				x.ac_slip_typ IN (c_dpt_xfr_so, c_prod_itm_so, c_prod_itm_ret_so)
					AND x.other_wg_cd = i_wg_cd
				)
			AND x.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so, c_stk_sw_so, c_stk_sw_gr)
			GROUP BY
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				CASE
					WHEN x.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so, c_stk_sw_so)
						THEN c_io_stk_out	/* 出庫 */
					WHEN x.ac_slip_typ = c_stk_sw_gr
						THEN c_io_stk_in	/* 入庫 */
				END,
				x.ac_slip_typ, x.ac_rsn_cd,
				COALESCE(x.other_wg_cd, x.wg_cd),
				COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
				x.bp_cd, x.stk_bp_cd,
				x.asst_typ,
				x.trd_cur_cd,
				x.xrate,
				x.trd_grp,
				x.rec_eval_typ,
				TO_CHAR(x.ym, 'YYYYMMDD'),
				m.itm_jnl_cd,
				x.zero_effect_flg
			;

			/* 検査抜取、廃棄・除却、棚卸、他勘定の出庫実績の取込 */
			INSERT INTO mgw_io (
				act_io_id,
				act_io_id_sub,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				cost_io_typ,
				ac_slip_typ, ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd,
				bp_cd, stk_bp_cd,
				asst_typ,
				qty,
				amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				alc_ac_cd,
				alc_amt_flg,
				alc_wg_cd,
				alc_dpt_cd, alc_loc_cd, alc_oper_cd, alc_bp_cd,
				alc_ctg_cd, alc_itm_cd, alc_itm_sub1, alc_itm_sub2, alc_itm_sub3,
				alc_lot_no, alc_sublot_no, alc_sno1, alc_sno2, alc_sno3, alc_sno4,
				alc_itm_mfg_inst_no,
				rec_eval_typ,
				sml_key,
				itm_jnl_cd,
				zero_effect_flg,
				mfg_act_grp
			)
			SELECT
				x2.act_io_id,
				'0',
				x2.calc_ctg_cd,
				x2.wg_cd,
				x2.ym, x2.ac_dt,
				x2.mng_dpt_cd,
				x2.itm_cd, x2.itm_sub1, x2.itm_sub2, x2.itm_sub3,
				x2.lot_no, x2.sublot_no, x2.sno1, x2.sno2, x2.sno3, x2.sno4,
				c_io_stk_out, /* 出庫 */
				CASE
					WHEN l_stktk_sum = c_off AND x2.ac_slip_typ = c_so_stktk THEN
					CASE
						WHEN x2.qty >= 0 THEN c_so_stktk /* 棚卸出庫 */
						WHEN x2.qty < 0 THEN c_in_stktk /* 棚卸入庫 */
					END
					WHEN l_oth_ccn_sum = c_off AND x2.ac_slip_typ = c_oth_ccn_so THEN
					CASE
						WHEN x2.qty >= 0 THEN c_oth_ccn_so /* 他勘定出庫 */
						WHEN x2.qty < 0 THEN c_oth_ccn_gr /* 他勘定入庫 */
					END
					ELSE x2.ac_slip_typ
				END, x2.ac_rsn_cd,
				x2.other_wg_cd,
				x2.other_dpt_cd,
				x2.bp_cd, x2.stk_bp_cd,
				x2.asst_typ,
				x2.qty,
				x2.amt,
				x2.trd_cur_cd,
				x2.trd_cur_amt,
				x2.xrate,
				x2.alc_ac_cd,
				x2.alc_amt_flg,
				x2.alc_wg_cd,
				x2.alc_dpt_cd, x2.alc_loc_cd, x2.alc_oper_cd, x2.alc_bp_cd,
				x2.alc_ctg_cd, x2.alc_itm_cd, x2.alc_itm_sub1, x2.alc_itm_sub2, x2.alc_itm_sub3,
				x2.alc_lot_no, x2.alc_sublot_no, x2.alc_sno1, x2.alc_sno2, x2.alc_sno3, x2.alc_sno4,
				x2.alc_itm_mfg_inst_no,
				x2.rec_eval_typ,
				x2.sml_key,
				m.itm_jnl_cd,
				x2.zero_effect_flg,
				x2.mfg_act_grp
			FROM (
				SELECT
					MAX(x.data_lno::VARCHAR) act_io_id,
					x.calc_ctg_cd,
					x.wg_cd,
					x.ym, MAX(x.ac_dt) ac_dt,
					x.mng_dpt_cd,
					x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
					x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
					CASE
						WHEN l_stktk_sum = c_off AND x.ac_slip_typ = c_in_stktk THEN c_so_stktk
						WHEN l_oth_ccn_sum = c_off AND x.ac_slip_typ = c_oth_ccn_gr THEN c_oth_ccn_so
						ELSE x.ac_slip_typ
					END ac_slip_typ, x.ac_rsn_cd,
					COALESCE(x.other_wg_cd, x.wg_cd) other_wg_cd,
					COALESCE(x.other_dpt_cd, x.mng_dpt_cd) other_dpt_cd,
					x.bp_cd, x.stk_bp_cd,
					x.asst_typ,
					SUM(x.qty * CASE WHEN x.ac_slip_typ IN (c_in_stktk, c_oth_ccn_gr) THEN -1 ELSE 1 END) qty,
					SUM(x.amt * CASE WHEN x.ac_slip_typ IN (c_in_stktk, c_oth_ccn_gr) THEN -1 ELSE 1 END) amt,
					x.trd_cur_cd,
					SUM(x.trd_cur_amt * CASE WHEN x.ac_slip_typ IN (c_in_stktk, c_oth_ccn_gr) THEN -1 ELSE 1 END) trd_cur_amt,
					x.xrate,
					x.alc_ac_cd,
					x.alc_amt_flg,
					x.alc_wg_cd,
					x.alc_dpt_cd, x.alc_loc_cd, x.alc_oper_cd, x.alc_bp_cd,
					x.alc_ctg_cd, x.alc_itm_cd, x.alc_itm_sub1, x.alc_itm_sub2, x.alc_itm_sub3,
					x.alc_lot_no, x.alc_sublot_no, x.alc_sno1, x.alc_sno2, x.alc_sno3, x.alc_sno4,
					x.alc_itm_mfg_inst_no,
					x.rec_eval_typ,
					TO_CHAR(x.ym, 'YYYYMMDD') sml_key,
					x.zero_effect_flg,
					x.mfg_act_grp
				FROM mgt_act_io_if x
				WHERE 0=0
				AND x.ym = i_ym
				AND x.calc_ctg_cd = i_calc_ctg
				AND x.wg_cd = i_wg_cd
				AND x.ac_slip_typ IN (c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so, c_in_stktk, c_oth_ccn_gr)
				GROUP BY
					x.calc_ctg_cd,
					x.wg_cd,
					x.ym,
					x.mng_dpt_cd,
					x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
					x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
					CASE
						WHEN l_stktk_sum = c_off AND x.ac_slip_typ = c_in_stktk THEN c_so_stktk
						WHEN l_oth_ccn_sum = c_off AND x.ac_slip_typ = c_oth_ccn_gr THEN c_oth_ccn_so
						ELSE x.ac_slip_typ
					END, x.ac_rsn_cd,
					COALESCE(x.other_wg_cd, x.wg_cd),
					COALESCE(x.other_dpt_cd, x.mng_dpt_cd),
					x.bp_cd,
					x.stk_bp_cd, x.asst_typ,
					x.trd_cur_cd,
					x.xrate,
					x.alc_ac_cd,
					x.alc_amt_flg,
					x.alc_wg_cd,
					x.alc_dpt_cd, x.alc_loc_cd, x.alc_oper_cd, x.alc_bp_cd,
					x.alc_ctg_cd, x.alc_itm_cd, x.alc_itm_sub1, x.alc_itm_sub2, x.alc_itm_sub3,
					x.alc_lot_no, x.alc_sublot_no, x.alc_sno1, x.alc_sno2, x.alc_sno3, x.alc_sno4,
					x.alc_itm_mfg_inst_no,
					x.rec_eval_typ,
					TO_CHAR(x.ym, 'YYYYMMDD'),
					x.zero_effect_flg,
					x.mfg_act_grp
			) x2
				INNER JOIN mam_itm_srch m ON (
					x2.itm_cd = m.itm_cd
					AND x2.itm_sub1 = m.itm_sub1
					AND x2.itm_sub2 = m.itm_sub2
					AND x2.itm_sub3 = m.itm_sub3
					AND m.del_flg = c_off
					AND m.release_flg = c_on)
			WHERE 0=0
			;

			DELETE FROM mgw_io w
			WHERE 0=0
			AND w.ym = i_ym
			AND w.calc_ctg_cd = i_calc_ctg
			AND w.qty = 0
			AND (COALESCE(w.amt, 0) = 0
				AND COALESCE(w.trd_cur_amt, 0) = 0
				AND w.ac_slip_typ IN (c_onr_prov, c_onr_prvr)
				OR w.ac_slip_typ NOT IN (c_onr_prov, c_onr_prvr)
				)
			AND w.zero_effect_flg = c_off
			;

			/* 出庫配賦費用の設定もしくは投入・入庫への振替の作成 */
			CALL mgpa_ins_mgtif2mgt$p_ifsub(i_wg_cd, i_ym);
			/* 入出庫から投入への振替の作成 */
			CALL mgpa_ins_mgtif2mgt$p_io_to_inpt(i_calc_ctg, i_wg_cd, i_ym);

			/* 販売倉入・生産戻入の集計 */
			CALL mgpa_ins_mgtif2mgt$p_ifsub2(i_wg_cd, i_ym);

			/* 部門間移動の集計 */
			CALL mgpa_ins_mgtif2mgt$p_ifsub3(i_wg_cd, i_ym);

			/* 品目間振替の集計 */
			CALL mgpa_ins_mgtif2mgt$p_ifsub4(i_ym);

			/* 配賦科目ＣＤがNULLのときはALC_XXX項目をクリアする */
			UPDATE mgw_io$temp w
			SET alc_amt_flg = c_off,
				alc_wg_cd = NULL,
				alc_dpt_cd = NULL,
				alc_loc_cd = NULL,
				alc_oper_cd = NULL,
				alc_bp_cd = NULL,
				alc_ctg_cd = NULL,
				alc_itm_cd = NULL,
				alc_itm_sub1 = NULL,
				alc_itm_sub2 = NULL,
				alc_itm_sub3 = NULL,
				alc_lot_no = NULL,
				alc_sublot_no = NULL,
				alc_sno1 = NULL,
				alc_sno2 = NULL,
				alc_sno3 = NULL,
				alc_sno4 = NULL,
				alc_itm_mfg_inst_no = NULL
			WHERE 0=0
			AND w.alc_ac_cd IS NULL
			;

			SELECT MAX(t.ym), MAX(t.calc_ctg_cd), MAX(t.wg_cd)
			INTO STRICT l_ym, l_calc_ctg, l_wg_cd
			FROM mgw_io$temp t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_io w
					WHERE 0=0
					AND w.act_io_id = t.act_io_id
					AND w.act_io_id_sub = t.act_io_id_sub
					AND (w.calc_ctg_cd <> i_calc_ctg OR w.wg_cd <> i_wg_cd OR w.ym <> i_ym)
					AND w.ac_slip_typ IN (
							c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so,
							c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so, c_stk_sw_so,
							c_in_stktk, c_oth_ccn_gr, c_stk_sw_gr
							)
					)
			LIMIT 1
			;

			IF l_calc_ctg IS NOT NULL THEN
				CALL mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(l_calc_ctg, l_wg_cd, l_ym);
			END IF;

			/* 入出庫実績の作成 */
			INSERT INTO mgt_act_io (
				act_io_id, act_io_id_sub,
				calc_ctg_cd, wg_cd, ym, ac_dt,
				mng_dpt_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				cost_io_typ, ac_slip_typ, ac_rsn_cd,
				other_wg_cd,
				other_dpt_cd, bp_cd, stk_bp_cd, asst_typ,
				qty, amt,
				trd_cur_cd, trd_cur_amt, xrate,
				trd_grp, trd_ratio,
				alc_ac_cd, alc_amt_flg, alc_wg_cd, alc_dpt_cd, alc_loc_cd,
				alc_oper_cd, alc_bp_cd, alc_ctg_cd, alc_itm_cd, alc_itm_sub1, alc_itm_sub2, alc_itm_sub3,
				alc_lot_no, alc_sublot_no, alc_sno1, alc_sno2, alc_sno3, alc_sno4,
				alc_itm_mfg_inst_no, rec_eval_typ, zero_effect_flg
			)
			SELECT
				x.act_io_id, x.act_io_id_sub,
				x.calc_ctg_cd, x.wg_cd, x.ym, x.ac_dt,
				x.mng_dpt_cd, x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.cost_io_typ,
				CASE
					WHEN l_stktk_sum = c_off AND x.ac_slip_typ = c_so_stktk THEN
					CASE
						WHEN x.cost_io_typ = c_io_stk_out AND x.qty >= 0 THEN c_so_stktk /* 棚卸払出 */
						WHEN x.cost_io_typ = c_io_stk_out AND x.qty < 0 THEN c_in_stktk /* 棚卸入庫 */
						WHEN x.cost_io_typ = c_io_stk_in AND x.qty >= 0 THEN c_in_stktk /* 棚卸入庫 */
						WHEN x.cost_io_typ = c_io_stk_in AND x.qty < 0 THEN c_so_stktk /* 棚卸払出 */
					END
					WHEN l_oth_ccn_sum = c_off AND x.ac_slip_typ = c_oth_ccn_so THEN
					CASE
						WHEN x.cost_io_typ = c_io_stk_out AND x.qty >= 0 THEN c_oth_ccn_so /* 他勘定払出 */
						WHEN x.cost_io_typ = c_io_stk_out AND x.qty < 0 THEN c_oth_ccn_gr /* 他勘定入庫 */
						WHEN x.cost_io_typ = c_io_stk_in AND x.qty >= 0 THEN c_oth_ccn_gr /* 他勘定入庫 */
						WHEN x.cost_io_typ = c_io_stk_in AND x.qty < 0 THEN c_oth_ccn_so /* 他勘定払出 */
					END
					ELSE x.ac_slip_typ
				END,
				x.ac_rsn_cd,
				x.other_wg_cd,
				x.other_dpt_cd, x.bp_cd, x.stk_bp_cd, x.asst_typ,
				x.qty, x.amt,
				x.trd_cur_cd, x.trd_cur_amt, x.xrate,
				x.trd_grp, x.trd_ratio,
				x.alc_ac_cd, x.alc_amt_flg, x.alc_wg_cd, x.alc_dpt_cd, x.alc_loc_cd,
				x.alc_oper_cd, x.alc_bp_cd, x.alc_ctg_cd, x.alc_itm_cd, x.alc_itm_sub1, x.alc_itm_sub2, x.alc_itm_sub3,
				x.alc_lot_no, x.alc_sublot_no, x.alc_sno1, x.alc_sno2, x.alc_sno3, x.alc_sno4,
				x.alc_itm_mfg_inst_no, x.rec_eval_typ, x.zero_effect_flg
			FROM (
				SELECT
					MAX(w.act_io_id) act_io_id, MAX(w.act_io_id_sub) act_io_id_sub,
					w.calc_ctg_cd, w.wg_cd, w.ym, MAX(w.ac_dt) ac_dt,
					w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
					w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
					w.cost_io_typ,
					CASE
						WHEN l_stktk_sum = c_off AND w.ac_slip_typ = c_in_stktk THEN c_so_stktk
						WHEN l_oth_ccn_sum = c_off AND w.ac_slip_typ = c_oth_ccn_gr THEN c_oth_ccn_so
						ELSE w.ac_slip_typ
					END ac_slip_typ,
					w.ac_rsn_cd,
					CASE w.wg_cd
						WHEN w.other_wg_cd THEN NULL
						ELSE w.other_wg_cd
					END other_wg_cd,
					w.other_dpt_cd, w.bp_cd, w.stk_bp_cd, w.asst_typ,
					SUM(w.qty) qty, SUM(w.amt) amt,
					w.trd_cur_cd, SUM(w.trd_cur_amt) trd_cur_amt, w.xrate,
					w.trd_grp, SUM(w.trd_ratio) trd_ratio,
					w.alc_ac_cd, w.alc_amt_flg, w.alc_wg_cd, w.alc_dpt_cd, w.alc_loc_cd,
					w.alc_oper_cd, w.alc_bp_cd, w.alc_ctg_cd, w.alc_itm_cd, w.alc_itm_sub1, w.alc_itm_sub2, w.alc_itm_sub3,
					w.alc_lot_no, w.alc_sublot_no, w.alc_sno1, w.alc_sno2, w.alc_sno3, w.alc_sno4,
					w.alc_itm_mfg_inst_no, w.rec_eval_typ, w.zero_effect_flg
				FROM mgw_io$temp w
				WHERE 0=0
				GROUP BY
					w.calc_ctg_cd, w.wg_cd, w.ym,
					w.mng_dpt_cd, w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
					w.lot_no, w.sublot_no, w.sno1, w.sno2, w.sno3, w.sno4,
					w.cost_io_typ,
					CASE
						WHEN l_stktk_sum = c_off AND w.ac_slip_typ = c_in_stktk THEN c_so_stktk
						WHEN l_oth_ccn_sum = c_off AND w.ac_slip_typ = c_oth_ccn_gr THEN c_oth_ccn_so
						ELSE w.ac_slip_typ
					END,
					w.ac_rsn_cd,
					CASE w.wg_cd
						WHEN w.other_wg_cd THEN NULL
						ELSE w.other_wg_cd
					END,
					w.other_dpt_cd, w.bp_cd, w.stk_bp_cd, w.asst_typ,
					w.trd_cur_cd, w.xrate,
					w.trd_grp,
					w.alc_ac_cd, w.alc_amt_flg, w.alc_wg_cd, w.alc_dpt_cd, w.alc_loc_cd,
					w.alc_oper_cd, w.alc_bp_cd, w.alc_ctg_cd, w.alc_itm_cd, w.alc_itm_sub1, w.alc_itm_sub2, w.alc_itm_sub3,
					w.alc_lot_no, w.alc_sublot_no, w.alc_sno1, w.alc_sno2, w.alc_sno3, w.alc_sno4,
					w.alc_itm_mfg_inst_no, w.rec_eval_typ, w.zero_effect_flg, w.sml_key
				) x
			;

			DELETE FROM mgt_act_io x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.qty = 0
			AND (COALESCE(x.amt, 0) = 0
				AND COALESCE(x.trd_cur_amt, 0) = 0
				AND x.ac_slip_typ IN (c_onr_prov, c_onr_prvr)
				OR x.ac_slip_typ NOT IN (c_onr_prov, c_onr_prvr)
				)
			AND x.zero_effect_flg = c_off
			;

			/* 売上実績の取込 */
			SELECT MAX(t.ym), MAX(t.calc_ctg_cd), MAX(t.wg_cd)
			INTO STRICT l_ym, l_calc_ctg, l_wg_cd
			FROM mgt_act_sls_if t
			WHERE 0=0
			AND t.ym = i_ym
			AND t.calc_ctg_cd = i_calc_ctg
			AND t.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM mgt_act_sls w
					WHERE 0=0
					AND w.act_sls_id = t.data_lno::VARCHAR
					AND (w.calc_ctg_cd <> i_calc_ctg OR w.wg_cd <> i_wg_cd OR w.ym <> i_ym)
					)
			LIMIT 1
			;

			IF l_calc_ctg IS NOT NULL THEN
				CALL mgpa_ins_mgtif2mgt$p_ctg_wg_ym_err(l_calc_ctg, l_wg_cd, l_ym);
			END IF;

			INSERT INTO mgt_act_sls (
				act_sls_id,
				act_sls_id_sub,
				calc_ctg_cd,
				wg_cd,
				ym, ac_dt,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				ac_slip_typ, ac_rsn_cd,
				asst_typ,
				qty, amt,
				trd_cur_cd,
				trd_cur_amt,
				xrate,
				cst_cd, dlv_cd,
				sls_dpt_cd, sls_usr_cd,
				slo_no, iv_no,
				stk_bp_cd,
				alc_dpt_cd,
				dest_cd1, dest_cd2, dest_cd3,
				cost_sls_cd1, cost_sls_cd2, cost_sls_cd3, cost_sls_cd4, cost_sls_cd5,
				alc_val1, alc_val2, alc_val3, alc_val4, alc_val5,
				rec_eval_typ,
				zero_effect_flg
			)
			SELECT
				MAX(x.data_lno::VARCHAR),
				'0',
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym, MAX(x.ac_dt),
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.ac_slip_typ, x.ac_rsn_cd,
				x.asst_typ,
				SUM(x.qty), SUM(x.amt),
				x.trd_cur_cd,
				SUM(x.trd_cur_amt),
				x.xrate,
				x.cst_cd, x.dlv_cd,
				x.sls_dpt_cd, x.sls_usr_cd,
				x.slo_no, x.iv_no,
				x.stk_bp_cd,
				x.alc_dpt_cd,
				x.dest_cd1, x.dest_cd2, x.dest_cd3,
				x.cost_sls_cd1, x.cost_sls_cd2, x.cost_sls_cd3, x.cost_sls_cd4, x.cost_sls_cd5,
				SUM(x.alc_val1), SUM(x.alc_val2), SUM(x.alc_val3), SUM(x.alc_val4), SUM(x.alc_val5),
				x.rec_eval_typ,
				x.zero_effect_flg
			FROM mgt_act_sls_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			GROUP BY
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.ac_slip_typ, x.ac_rsn_cd,
				x.asst_typ,
				x.trd_cur_cd,
				x.xrate,
				x.cst_cd, x.dlv_cd,
				x.sls_dpt_cd, x.sls_usr_cd,
				x.slo_no, x.iv_no,
				x.stk_bp_cd,
				x.alc_dpt_cd,
				x.dest_cd1, x.dest_cd2, x.dest_cd3,
				x.cost_sls_cd1, x.cost_sls_cd2, x.cost_sls_cd3, x.cost_sls_cd4, x.cost_sls_cd5,
				x.rec_eval_typ,
				x.zero_effect_flg
			;

			DELETE FROM mgt_act_sls x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.qty = 0
			AND x.amt = 0
			AND COALESCE(x.trd_cur_amt, 0) = 0
			AND COALESCE(x.alc_val1, 0) = 0
			AND COALESCE(x.alc_val2, 0) = 0
			AND COALESCE(x.alc_val3, 0) = 0
			AND COALESCE(x.alc_val4, 0) = 0
			AND COALESCE(x.alc_val5, 0) = 0
			AND x.zero_effect_flg = c_off
			;

		END;--SKIP_TRAN

		<<SKIP_STK>>
		BEGIN

			IF i_stk = c_off THEN
				EXIT SKIP_STK;
			END IF;

			/* 在庫実績の取込 */
			INSERT INTO mgt_act_stk (
				calc_ctg_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				bp_cd,
				asst_typ,
				qty,
				first_gr_dt, vld_dt, lmt_dt,
				non_mov_base_dt
			)
			SELECT
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.bp_cd,
				x.asst_typ,
				SUM(x.qty),
				MIN(x.first_gr_dt), MIN(x.vld_dt), MIN(x.lmt_dt),
				MAX(x.non_mov_base_dt)
			FROM mgt_act_stk_if x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			GROUP BY
				x.calc_ctg_cd,
				x.wg_cd,
				x.ym,
				x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.bp_cd,
				x.asst_typ
			;

			DELETE FROM mgt_act_stk x
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.qty = 0
			;

		END;--SKIP_STK

		IF i_mfg = c_on OR i_tran = c_on THEN
			/* 明細データ設定（投入） */
			DELETE FROM mgw_expns_inpt;
			INSERT INTO mgw_expns_inpt (
				act_inpt_id, act_inpt_id_sub, ym, mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				stk_bp_cd, asst_typ, qty, amt_set_typ, calc_grp_cd, wg_cd
			)
			SELECT
				x.act_inpt_id, x.act_inpt_id_sub, x.ym, x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.stk_bp_cd, x.asst_typ, x.qty, m.amt_set_typ, m.calc_grp_cd, x.wg_cd
			FROM mgt_act_inpt x
				INNER JOIN mam_rec_eval_set m ON (
					m.set_tgt_typ = c_set_tgt_inpt
					AND x.ac_slip_typ = m.ac_slip_typ
					AND (x.ac_rsn_cd = m.ac_rsn_cd OR x.ac_rsn_cd IS NULL AND m.ac_rsn_cd IS NULL)
					AND x.calc_ctg_cd = m.calc_ctg_cd
					AND x.wg_cd = m.wg_cd
					AND x.ac_dt BETWEEN m.st_dt AND m.end_dt)
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND x.ins_usr_id = l_usr
			AND x.ins_ts >= l_ts
			;

			SELECT COUNT(*) INTO STRICT l_cnt FROM mgw_expns_inpt x;

			IF l_cnt > 0 THEN
				CALL mgpa_set_expns$p_inpt('0');
			END IF;
		END IF;

		IF i_tran = c_on THEN
			/* 明細データ設定（入出庫） */
			DELETE FROM mgw_expns_io;
			INSERT INTO mgw_expns_io (
				act_io_id, act_io_id_sub, ym, mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				stk_bp_cd, asst_typ, qty, amt_set_typ, calc_grp_cd, wg_cd
			)
			SELECT
				x.act_io_id, x.act_io_id_sub, x.ym, x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.stk_bp_cd, x.asst_typ, x.qty, m.amt_set_typ, m.calc_grp_cd, x.wg_cd
			FROM mgt_act_io x
				INNER JOIN mam_rec_eval_set m ON (
					m.set_tgt_typ = c_set_tgt_io
					AND x.ac_slip_typ = m.ac_slip_typ
					AND (x.ac_rsn_cd = m.ac_rsn_cd OR x.ac_rsn_cd IS NULL AND m.ac_rsn_cd IS NULL)
					AND x.calc_ctg_cd = m.calc_ctg_cd
					AND x.wg_cd = m.wg_cd
					AND x.ac_dt BETWEEN m.st_dt AND m.end_dt)
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			;

			INSERT INTO mgw_expns_io (
				act_io_id, act_io_id_sub, ym, mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				stk_bp_cd, asst_typ, qty, amt_set_typ, calc_grp_cd, wg_cd
			)
			SELECT
				x.act_io_id, x.act_io_id_sub, x.ym, x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.stk_bp_cd, x.asst_typ, x.qty, m.amt_set_typ, m.calc_grp_cd, x.wg_cd
			FROM mgt_act_io x
				INNER JOIN mam_rec_eval_set m ON (
					m.set_tgt_typ IN (c_set_tgt_io_in, c_set_tgt_io_out)
					AND (
						x.cost_io_typ = c_io_stk_in AND m.set_tgt_typ = c_set_tgt_io_in
						OR
						x.cost_io_typ = c_io_stk_out AND m.set_tgt_typ = c_set_tgt_io_out
						)
					AND x.ac_slip_typ = m.ac_slip_typ
					AND (x.ac_rsn_cd = m.ac_rsn_cd OR x.ac_rsn_cd IS NULL AND m.ac_rsn_cd IS NULL)
					AND x.calc_ctg_cd = m.calc_ctg_cd
					AND x.wg_cd = m.wg_cd
					AND x.ac_dt BETWEEN m.st_dt AND m.end_dt)
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			AND NOT EXISTS (
					SELECT 'X'
					FROM mgw_expns_io w
					WHERE 0=0
					AND w.act_io_id = x.act_io_id
					AND w.act_io_id_sub = x.act_io_id_sub
				)
			;

			SELECT COUNT(*) INTO STRICT l_cnt FROM mgw_expns_io x;

			IF l_cnt > 0 THEN
				CALL mgpa_set_expns$p_io('0');
			END IF;

			/* 明細データ設定（売上） */
			DELETE FROM mgw_expns_sls;
			INSERT INTO mgw_expns_sls (
				act_sls_id, act_sls_id_sub, ym, mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				stk_bp_cd, asst_typ, qty, amt_set_typ, calc_grp_cd, wg_cd
			)
			SELECT
				x.act_sls_id, x.act_sls_id_sub, x.ym, x.mng_dpt_cd,
				x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
				x.lot_no, x.sublot_no, x.sno1, x.sno2, x.sno3, x.sno4,
				x.stk_bp_cd, x.asst_typ, x.qty, m.amt_set_typ, m.calc_grp_cd, x.wg_cd
			FROM mgt_act_sls x
				INNER JOIN mam_rec_eval_set m ON (
					m.set_tgt_typ = c_set_tgt_sls
					AND x.ac_slip_typ = m.ac_slip_typ
					AND (x.ac_rsn_cd = m.ac_rsn_cd OR x.ac_rsn_cd IS NULL AND m.ac_rsn_cd IS NULL)
					AND x.calc_ctg_cd = m.calc_ctg_cd
					AND x.wg_cd = m.wg_cd
					AND x.ac_dt BETWEEN m.st_dt AND m.end_dt)
			WHERE 0=0
			AND x.ym = i_ym
			AND x.calc_ctg_cd = i_calc_ctg
			AND x.wg_cd = i_wg_cd
			;

			SELECT COUNT(*) INTO STRICT l_cnt FROM mgw_expns_sls x;

			IF l_cnt > 0 THEN
				CALL mgpa_set_expns$p_sls('0');
			END IF;

		END IF;

		IF l_rc = c_err1 THEN
			COMMIT; /* 正常データは取込済みにするため */
			l_msg := fcpa_err$msg_binder('MGPA_INS_MGTIF2MGT.P_IF');
			CALL fcpa_err$raise_app_err('MGBXD0037', l_msg);
		END IF;

	END;--PROD_END

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_INS_MGTIF2MGT.P_IF');
END;
$BODY$
LANGUAGE plpgsql
;

