\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_sca_prep$cursor_ctg_list()
RETURNS TABLE (
	calc_ctg_cd	VARCHAR
)
AS
$BODY$
DECLARE
	x RECORD;
BEGIN
	FOR x IN
		SELECT	w.calc_ctg_cd
		FROM	mgw_calc_ctg w
		WHERE	0=0
		ORDER BY w.ctg_prio, w.calc_ctg_cd
	LOOP
		calc_ctg_cd := x.calc_ctg_cd;

		RETURN NEXT;
	END LOOP;

	RETURN;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_prep$p_itm_add(
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	品目指定計算を行ったときに関連する子品目を追加する
<REMARKS>

<ARGUMENTS>
<IN>	I_ARG
		MGT_ARGレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');
	c_calc_ctg_bom	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'BOM');

	i INTEGER;
	l_usr fcm_user.user_id%TYPE;

	x RECORD;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_sca_prep$p_itm_add$l_itms', 'mgt_usr_itm', 'integer');

	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_PREP.P_ITM_ADD');

	CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_bom);
	l_usr := fcpa_context$f_get_userid();
	LOOP
		i := 0;
		FOR x IN
			SELECT DISTINCT
				m.chd_itm_cd,
				m.chd_itm_sub1,
				m.chd_itm_sub2,
				m.chd_itm_sub3
			FROM	mgt_usr_itm t, mgt_bom m
			WHERE	0=0
			AND t.usr_cd = l_usr
			AND t.calc_grp_cd = i_arg.calc_grp_cd
			AND t.itm_cd = m.par_itm_cd
			AND t.itm_sub1 = m.par_itm_sub1
			AND t.itm_sub2 = m.par_itm_sub2
			AND t.itm_sub3 = m.par_itm_sub3
			AND m.term = i_arg.term
			AND EXISTS (
					SELECT	'X'
					FROM	mgw_calc_ctg w
					WHERE	0=0
					AND w.calc_ctg_cd = m.calc_ctg_cd
					)
			AND (
				m.wg_cd = c_null_val
				OR EXISTS (
					SELECT	'X'
					FROM	mam_grp_wg w2
					WHERE	0=0
					AND w2.calc_grp_cd = i_arg.calc_grp_cd
					AND w2.wg_cd = m.wg_cd
					)
				)
			AND NOT EXISTS (
					SELECT	'X'
					FROM	mgt_usr_itm t2
					WHERE	0=0
					AND t2.usr_cd = l_usr
					AND t2.calc_grp_cd = i_arg.calc_grp_cd
					AND t2.itm_cd = m.chd_itm_cd
					AND t2.itm_sub1 = m.chd_itm_sub1
					AND t2.itm_sub2 = m.chd_itm_sub2
					AND t2.itm_sub3 = m.chd_itm_sub3
					)
		LOOP
			i := i + 1;
			INSERT INTO mgpa_sca_prep$p_itm_add$l_itms (
				usr_cd,
				calc_grp_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				_index_
				)
			VALUES (
				l_usr,
				i_arg.calc_grp_cd,
				x.chd_itm_cd,
				x.chd_itm_sub1,
				x.chd_itm_sub2,
				x.chd_itm_sub3,
				i
				)
			;
		END LOOP;

		EXIT WHEN i = 0;

		INSERT INTO mgt_usr_itm (
			usr_cd,
			calc_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
			)
		SELECT
			usr_cd,
			calc_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		FROM mgpa_sca_prep$p_itm_add$l_itms
		;

		TRUNCATE TABLE mgpa_sca_prep$p_itm_add$l_itms;
	END LOOP;

	TRUNCATE TABLE mgpa_sca_prep$p_itm_add$l_itms;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_PREP.P_ITM_ADD');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_prep$p_set_alc(
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	予定配賦率の設定や配賦パタンの設定を行う
<REMARKS>

<ARGUMENTS>
<IN>	I_ARG
		MGT_ARGレコード
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt NUMERIC;

	c_max_alc_key_cnt CONSTANT INTEGER := 10000;

	c_null_val				CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');
	c_alc_calc_month		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ALC_CALC_TYP', 'MONTH_ALC');
	c_alc_calc_term			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ALC_CALC_TYP', 'TERM_ALC');
	c_alc_calc_non			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ALC_CALC_TYP', 'NON');
	c_calc_ctg_alc_rate_t	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ALC_RATE_T');
	c_inpt_alc_alc_rate		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_INPT_ALC_TYP', 'ALC_RATE');

	sql$rowcount BIGINT;

	l12 RECORD;
	x RECORD;
	y RECORD;
	n RECORD;

	alc_key1 mgt_calc_std_alc_rate[];
	alc_key2 mgt_calc_alc_amt[];
	alc_key3 mgt_calc_io[];

	l_alc_ptn_cd_temp	mgt_calc_std_alc_rate.alc_ptn_cd%TYPE;
	l_expns_cd_temp		mgt_calc_std_alc_rate.expns_cd%TYPE;

	l_calc_no			mgt_calc_alc_amt.calc_no%TYPE;
	l_calc_grp_cd		mgt_calc_alc_amt.calc_grp_cd%TYPE;
	l_inpt_alc_typ		mgt_calc_alc_amt.inpt_alc_typ%TYPE;
	l_wg_cd				mgt_calc_alc_amt.wg_cd%TYPE;
	l_ym				mgt_calc_alc_amt.ym%TYPE;
	l_alc_ac_cd			mgt_calc_alc_amt.alc_ac_cd%TYPE;
	l_dpt_cd			mgt_calc_alc_amt.dpt_cd%TYPE;
	l_loc_cd			mgt_calc_alc_amt.loc_cd%TYPE;
	l_oper_cd			mgt_calc_alc_amt.oper_cd%TYPE;
	l_bp_cd				mgt_calc_alc_amt.bp_cd%TYPE;
	l_ctg_cd			mgt_calc_alc_amt.ctg_cd%TYPE;
	l_itm_cd			mgt_calc_alc_amt.itm_cd%TYPE;
	l_itm_sub1			mgt_calc_alc_amt.itm_sub1%TYPE;
	l_itm_sub2			mgt_calc_alc_amt.itm_sub2%TYPE;
	l_itm_sub3			mgt_calc_alc_amt.itm_sub3%TYPE;
	l_lot_no			mgt_calc_alc_amt.lot_no%TYPE;
	l_sublot_no			mgt_calc_alc_amt.sublot_no%TYPE;
	l_sno1				mgt_calc_alc_amt.sno1%TYPE;
	l_sno2				mgt_calc_alc_amt.sno2%TYPE;
	l_sno3				mgt_calc_alc_amt.sno3%TYPE;
	l_sno4				mgt_calc_alc_amt.sno4%TYPE;
	l_itm_mfg_inst_no	mgt_calc_alc_amt.itm_mfg_inst_no%TYPE;
	l_iv_no				mgt_calc_alc_amt.iv_no%TYPE;
	l_po_no				mgt_calc_alc_amt.po_no%TYPE;
	l_slo_no			mgt_calc_alc_amt.slo_no%TYPE;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_PREP.P_SET_ALC');

	<<SKIP_ALC_RATE_T>>
	BEGIN
		IF i_arg.alc_calc_typ = c_alc_calc_non THEN
			EXIT SKIP_ALC_RATE_T;
		END IF;

		l_cnt := 0;
		DELETE FROM mgw_alc_rate t;
		CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_alc_rate_t);
		FOR l12 IN
			SELECT	w.*
			FROM	mgpa_sca_prep$cursor_ctg_list() w
		LOOP
			INSERT INTO mgw_alc_rate (
				wg_cd,
				ym,
				alc_ac_cd,
				dpt_cd, loc_cd, oper_cd, bp_cd,
				ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				itm_mfg_inst_no, iv_no, po_no, slo_no,
				alc_rate
				)
			SELECT
				t.wg_cd,
				t.ym,
				t.alc_ac_cd,
				t.dpt_cd, t.loc_cd, t.oper_cd, t.bp_cd,
				t.ctg_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
				t.itm_mfg_inst_no, t.iv_no, t.po_no, t.slo_no,
				t.alc_rate
			FROM	mgt_alc_rate t
			WHERE	0=0
			AND (
				i_arg.alc_calc_typ = c_alc_calc_month
						AND t.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				OR
				i_arg.alc_calc_typ = c_alc_calc_term
						AND t.ym = i_arg.end_ym
				)
			AND t.calc_ctg_cd = l12.calc_ctg_cd
			AND t.no_calc_flg = '0'
			AND (
				t.wg_cd = i_arg.runtime_wg_cd
				OR
				i_arg.runtime_wg_cd IS NULL
					AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t.wg_cd
					)
				)
			AND NOT EXISTS (
					SELECT	'X'
					FROM	mgw_alc_rate w
					WHERE	0=0
					AND w.wg_cd = t.wg_cd
					AND w.ym = t.ym
					AND w.alc_ac_cd = t.alc_ac_cd
					AND COALESCE(w.dpt_cd, c_null_val) = COALESCE(t.dpt_cd, c_null_val)
					AND COALESCE(w.loc_cd, c_null_val) = COALESCE(t.loc_cd, c_null_val)
					AND COALESCE(w.oper_cd, c_null_val) = COALESCE(t.oper_cd, c_null_val)
					AND COALESCE(w.bp_cd, c_null_val) = COALESCE(t.bp_cd, c_null_val)
					AND COALESCE(w.ctg_cd, c_null_val) = COALESCE(t.ctg_cd, c_null_val)
					AND COALESCE(w.itm_cd, c_null_val) = COALESCE(t.itm_cd, c_null_val)
					AND COALESCE(w.itm_sub1, c_null_val) = COALESCE(t.itm_sub1, c_null_val)
					AND COALESCE(w.itm_sub2, c_null_val) = COALESCE(t.itm_sub2, c_null_val)
					AND COALESCE(w.itm_sub3, c_null_val) = COALESCE(t.itm_sub3, c_null_val)
					AND COALESCE(w.lot_no, c_null_val) = COALESCE(t.lot_no, c_null_val)
					AND COALESCE(w.sublot_no, c_null_val) = COALESCE(t.sublot_no, c_null_val)
					AND COALESCE(w.sno1, c_null_val) = COALESCE(t.sno1, c_null_val)
					AND COALESCE(w.sno2, c_null_val) = COALESCE(t.sno2, c_null_val)
					AND COALESCE(w.sno3, c_null_val) = COALESCE(t.sno3, c_null_val)
					AND COALESCE(w.sno4, c_null_val) = COALESCE(t.sno4, c_null_val)
					AND COALESCE(w.itm_mfg_inst_no, c_null_val) = COALESCE(t.itm_mfg_inst_no, c_null_val)
					AND COALESCE(w.iv_no, c_null_val) = COALESCE(t.iv_no, c_null_val)
					AND COALESCE(w.po_no, c_null_val) = COALESCE(t.po_no, c_null_val)
					AND COALESCE(w.slo_no, c_null_val) = COALESCE(t.slo_no, c_null_val)
				)
			;

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
		END LOOP;

		IF l_cnt = 0 THEN
			EXIT SKIP_ALC_RATE_T;
		END IF;

		FOR x IN
			SELECT	w.*
			FROM	mgw_alc_rate w
			WHERE	0=0
		LOOP
			l_calc_no := NULL;
			l_calc_grp_cd := NULL;
			l_inpt_alc_typ := NULL;
			l_wg_cd := NULL;
			l_ym := NULL;
			l_alc_ac_cd := NULL;
			l_dpt_cd := NULL;
			l_loc_cd := NULL;
			l_oper_cd := NULL;
			l_bp_cd := NULL;
			l_ctg_cd := NULL;
			l_itm_cd := NULL;
			l_itm_sub1 := NULL;
			l_itm_sub2 := NULL;
			l_itm_sub3 := NULL;
			l_lot_no := NULL;
			l_sublot_no := NULL;
			l_sno1 := NULL;
			l_sno2 := NULL;
			l_sno3 := NULL;
			l_sno4 := NULL;
			l_itm_mfg_inst_no := NULL;
			l_iv_no := NULL;
			l_po_no := NULL;
			l_slo_no := NULL;
			FOR y IN
				SELECT	t.*
				FROM	mgt_calc_alc_amt t
				WHERE	0=0
				AND	t.calc_no = i_arg.calc_no
				AND	t.calc_grp_cd = i_arg.calc_grp_cd
				AND	t.wg_cd = x.wg_cd
				AND	t.ym = x.ym
				AND	t.alc_ac_cd = x.alc_ac_cd
				AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(x.dpt_cd, c_null_val)
				AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(x.loc_cd, c_null_val)
				AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(x.oper_cd, c_null_val)
				AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(x.bp_cd, c_null_val)
				AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(x.ctg_cd, c_null_val)
				AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(x.itm_cd, c_null_val)
				AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(x.itm_sub1, c_null_val)
				AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(x.itm_sub2, c_null_val)
				AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(x.itm_sub3, c_null_val)
				AND	COALESCE(t.lot_no, c_null_val) = COALESCE(x.lot_no, c_null_val)
				AND	COALESCE(t.sublot_no, c_null_val) = COALESCE(x.sublot_no, c_null_val)
				AND	COALESCE(t.sno1, c_null_val) = COALESCE(x.sno1, c_null_val)
				AND	COALESCE(t.sno2, c_null_val) = COALESCE(x.sno2, c_null_val)
				AND	COALESCE(t.sno3, c_null_val) = COALESCE(x.sno3, c_null_val)
				AND	COALESCE(t.sno4, c_null_val) = COALESCE(x.sno4, c_null_val)
				AND	COALESCE(t.itm_mfg_inst_no, c_null_val) = COALESCE(x.itm_mfg_inst_no, c_null_val)
				AND	COALESCE(t.iv_no, c_null_val) = COALESCE(x.iv_no, c_null_val)
				AND	COALESCE(t.po_no, c_null_val) = COALESCE(x.po_no, c_null_val)
				AND	COALESCE(t.slo_no, c_null_val) = COALESCE(x.slo_no, c_null_val)
			LOOP
				IF l_calc_grp_cd IS NULL THEN
					l_calc_no := y.calc_no;
					l_calc_grp_cd := y.calc_grp_cd;
					l_inpt_alc_typ := y.inpt_alc_typ;
					l_wg_cd := y.wg_cd;
					l_ym := y.ym;
					l_alc_ac_cd := y.alc_ac_cd;
					l_dpt_cd := y.dpt_cd;
					l_loc_cd := y.loc_cd;
					l_oper_cd := y.oper_cd;
					l_bp_cd := y.bp_cd;
					l_ctg_cd := y.ctg_cd;
					l_itm_cd := y.itm_cd;
					l_itm_sub1 := y.itm_sub1;
					l_itm_sub2 := y.itm_sub2;
					l_itm_sub3 := y.itm_sub3;
					l_lot_no := y.lot_no;
					l_sublot_no := y.sublot_no;
					l_sno1 := y.sno1;
					l_sno2 := y.sno2;
					l_sno3 := y.sno3;
					l_sno4 := y.sno4;
					l_itm_mfg_inst_no := y.itm_mfg_inst_no;
					l_iv_no := y.iv_no;
					l_po_no := y.po_no;
					l_slo_no := y.slo_no;
				ELSE
					UPDATE	mgt_calc_alc_amt t
					SET	amt = amt + y.amt
					WHERE	0=0
					AND	t.calc_no = l_calc_no
					AND	t.calc_grp_cd = l_calc_grp_cd
					AND	t.inpt_alc_typ = l_inpt_alc_typ
					AND	t.wg_cd = l_wg_cd
					AND	t.ym = l_ym
					AND	t.alc_ac_cd = l_alc_ac_cd
					AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(l_dpt_cd, c_null_val)
					AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(l_loc_cd, c_null_val)
					AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(l_oper_cd, c_null_val)
					AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(l_bp_cd, c_null_val)
					AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(l_ctg_cd, c_null_val)
					AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(l_itm_cd, c_null_val)
					AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(l_itm_sub1, c_null_val)
					AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(l_itm_sub2, c_null_val)
					AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(l_itm_sub3, c_null_val)
					AND	COALESCE(t.lot_no, c_null_val) = COALESCE(l_lot_no, c_null_val)
					AND	COALESCE(t.sublot_no, c_null_val) = COALESCE(l_sublot_no, c_null_val)
					AND	COALESCE(t.sno1, c_null_val) = COALESCE(l_sno1, c_null_val)
					AND	COALESCE(t.sno2, c_null_val) = COALESCE(l_sno2, c_null_val)
					AND	COALESCE(t.sno3, c_null_val) = COALESCE(l_sno3, c_null_val)
					AND	COALESCE(t.sno4, c_null_val) = COALESCE(l_sno4, c_null_val)
					AND	COALESCE(t.itm_mfg_inst_no, c_null_val) = COALESCE(l_itm_mfg_inst_no, c_null_val)
					AND	COALESCE(t.iv_no, c_null_val) = COALESCE(l_iv_no, c_null_val)
					AND	COALESCE(t.po_no, c_null_val) = COALESCE(l_po_no, c_null_val)
					AND	COALESCE(t.slo_no, c_null_val) = COALESCE(l_slo_no, c_null_val)
					;

					DELETE FROM mgt_calc_alc_amt t
					WHERE	0=0
					AND	t.calc_no = y.calc_no
					AND	t.calc_grp_cd = y.calc_grp_cd
					AND	t.inpt_alc_typ = y.inpt_alc_typ
					AND	t.wg_cd = y.wg_cd
					AND	t.ym = y.ym
					AND	t.alc_ac_cd = y.alc_ac_cd
					AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(y.dpt_cd, c_null_val)
					AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(y.loc_cd, c_null_val)
					AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(y.oper_cd, c_null_val)
					AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(y.bp_cd, c_null_val)
					AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(y.ctg_cd, c_null_val)
					AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(y.itm_cd, c_null_val)
					AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(y.itm_sub1, c_null_val)
					AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(y.itm_sub2, c_null_val)
					AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(y.itm_sub3, c_null_val)
					AND	COALESCE(t.lot_no, c_null_val) = COALESCE(y.lot_no, c_null_val)
					AND	COALESCE(t.sublot_no, c_null_val) = COALESCE(y.sublot_no, c_null_val)
					AND	COALESCE(t.sno1, c_null_val) = COALESCE(y.sno1, c_null_val)
					AND	COALESCE(t.sno2, c_null_val) = COALESCE(y.sno2, c_null_val)
					AND	COALESCE(t.sno3, c_null_val) = COALESCE(y.sno3, c_null_val)
					AND	COALESCE(t.sno4, c_null_val) = COALESCE(y.sno4, c_null_val)
					AND	COALESCE(t.itm_mfg_inst_no, c_null_val) = COALESCE(y.itm_mfg_inst_no, c_null_val)
					AND	COALESCE(t.iv_no, c_null_val) = COALESCE(y.iv_no, c_null_val)
					AND	COALESCE(t.po_no, c_null_val) = COALESCE(y.po_no, c_null_val)
					AND	COALESCE(t.slo_no, c_null_val) = COALESCE(y.slo_no, c_null_val)
					;
				END IF;
			END LOOP;
		END LOOP;

		FOR x IN
			SELECT	w.*
			FROM	mgw_alc_rate w
			WHERE	0=0
		LOOP
			IF (
				SELECT	COUNT(*)
				FROM	mgt_calc_alc_amt t
				WHERE	0=0
				AND	t.calc_no = i_arg.calc_no
				AND	t.calc_grp_cd = i_arg.calc_grp_cd
				AND	t.wg_cd = x.wg_cd
				AND	t.ym = x.ym
				AND	t.alc_ac_cd = x.alc_ac_cd
				AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(x.dpt_cd, c_null_val)
				AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(x.loc_cd, c_null_val)
				AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(x.oper_cd, c_null_val)
				AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(x.bp_cd, c_null_val)
				AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(x.ctg_cd, c_null_val)
				AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(x.itm_cd, c_null_val)
				AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(x.itm_sub1, c_null_val)
				AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(x.itm_sub2, c_null_val)
				AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(x.itm_sub3, c_null_val)
				AND	COALESCE(t.lot_no, c_null_val) = COALESCE(x.lot_no, c_null_val)
				AND	COALESCE(t.sublot_no, c_null_val) = COALESCE(x.sublot_no, c_null_val)
				AND	COALESCE(t.sno1, c_null_val) = COALESCE(x.sno1, c_null_val)
				AND	COALESCE(t.sno2, c_null_val) = COALESCE(x.sno2, c_null_val)
				AND	COALESCE(t.sno3, c_null_val) = COALESCE(x.sno3, c_null_val)
				AND	COALESCE(t.sno4, c_null_val) = COALESCE(x.sno4, c_null_val)
				AND	COALESCE(t.itm_mfg_inst_no, c_null_val) = COALESCE(x.itm_mfg_inst_no, c_null_val)
				AND	COALESCE(t.iv_no, c_null_val) = COALESCE(x.iv_no, c_null_val)
				AND	COALESCE(t.po_no, c_null_val) = COALESCE(x.po_no, c_null_val)
				AND	COALESCE(t.slo_no, c_null_val) = COALESCE(x.slo_no, c_null_val)
				) > 0
			THEN
				UPDATE	mgt_calc_alc_amt t
				SET	inpt_alc_typ = c_inpt_alc_alc_rate,
					alc_rate = x.alc_rate
				WHERE	0=0
				AND	t.calc_no = i_arg.calc_no
				AND	t.calc_grp_cd = i_arg.calc_grp_cd
				AND	t.wg_cd = x.wg_cd
				AND	t.ym = x.ym
				AND	t.alc_ac_cd = x.alc_ac_cd
				AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(x.dpt_cd, c_null_val)
				AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(x.loc_cd, c_null_val)
				AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(x.oper_cd, c_null_val)
				AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(x.bp_cd, c_null_val)
				AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(x.ctg_cd, c_null_val)
				AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(x.itm_cd, c_null_val)
				AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(x.itm_sub1, c_null_val)
				AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(x.itm_sub2, c_null_val)
				AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(x.itm_sub3, c_null_val)
				AND	COALESCE(t.lot_no, c_null_val) = COALESCE(x.lot_no, c_null_val)
				AND	COALESCE(t.sublot_no, c_null_val) = COALESCE(x.sublot_no, c_null_val)
				AND	COALESCE(t.sno1, c_null_val) = COALESCE(x.sno1, c_null_val)
				AND	COALESCE(t.sno2, c_null_val) = COALESCE(x.sno2, c_null_val)
				AND	COALESCE(t.sno3, c_null_val) = COALESCE(x.sno3, c_null_val)
				AND	COALESCE(t.sno4, c_null_val) = COALESCE(x.sno4, c_null_val)
				AND	COALESCE(t.itm_mfg_inst_no, c_null_val) = COALESCE(x.itm_mfg_inst_no, c_null_val)
				AND	COALESCE(t.iv_no, c_null_val) = COALESCE(x.iv_no, c_null_val)
				AND	COALESCE(t.po_no, c_null_val) = COALESCE(x.po_no, c_null_val)
				AND	COALESCE(t.slo_no, c_null_val) = COALESCE(x.slo_no, c_null_val)
				;
			ELSE
				INSERT INTO mgt_calc_alc_amt (
					calc_no, calc_grp_cd,
					inpt_alc_typ,
					wg_cd,
					ym, alc_ac_cd,
					dpt_cd, loc_cd, oper_cd, bp_cd,
					ctg_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3,
					lot_no, sublot_no,
					sno1, sno2, sno3, sno4,
					itm_mfg_inst_no,
					iv_no, po_no, slo_no,
					amt,
					alc_rate
					)
				VALUES	(
					i_arg.calc_no, i_arg.calc_grp_cd,
					c_inpt_alc_alc_rate,
					x.wg_cd,
					x.ym, x.alc_ac_cd,
					x.dpt_cd, x.loc_cd, x.oper_cd, x.bp_cd,
					x.ctg_cd, x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3,
					x.lot_no, x.sublot_no,
					x.sno1, x.sno2, x.sno3, x.sno4,
					x.itm_mfg_inst_no,
					x.iv_no, x.po_no, x.slo_no,
					0,
					x.alc_rate
					)
				;
			END IF;
		END LOOP;

		CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGW_ALC_RATE', l_cnt::VARCHAR);
		COMMIT;

	END;

	/*** 配賦パタンと費目の設定 ***/
	CALL mgpa_alc_ptn$p_set_work(i_arg.calc_grp_cd, i_arg.term);

	alc_key1 := '{}' ;
	FOR n IN
		SELECT *
		FROM	mgt_calc_std_alc_rate t
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.alc_ptn_cd IS NULL
	LOOP
		l_alc_ptn_cd_temp = n.alc_ptn_cd;
		l_expns_cd_temp = n.expns_cd;

		CALL mgpa_alc_ptn$p_get_alc_ptn_expns(
			n.alc_ac_cd, n.dpt_cd, n.loc_cd, n.oper_cd, n.bp_cd, n.ctg_cd,
			n.itm_cd, n.itm_sub1, n.itm_sub2, n.itm_sub3, n.wg_cd,
			l_alc_ptn_cd_temp, l_expns_cd_temp);

		n.alc_ptn_cd := l_alc_ptn_cd_temp;
		n.expns_cd := l_expns_cd_temp;
		alc_key1[COALESCE(array_length(alc_key1, 1), 0) + 1] := n ;

		IF (COALESCE(array_length(alc_key1, 1), 0) > c_max_alc_key_cnt) THEN
			UPDATE	mgt_calc_std_alc_rate t
			SET	alc_ptn_cd = w.alc_ptn_cd,
				expns_cd = w.expns_cd
			FROM (SELECT * FROM UNNEST(alc_key1)) w
			WHERE	0=0
			AND	t.calc_no = i_arg.calc_no
			AND	t.calc_grp_cd = i_arg.calc_grp_cd
			AND	t.alc_ac_cd = w.alc_ac_cd
			AND	t.wg_cd = w.wg_cd
			AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(w.dpt_cd, c_null_val)
			AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(w.loc_cd, c_null_val)
			AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(w.oper_cd, c_null_val)
			AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(w.bp_cd, c_null_val)
			AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(w.ctg_cd, c_null_val)
			AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(w.itm_cd, c_null_val)
			AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(w.itm_sub1, c_null_val)
			AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(w.itm_sub2, c_null_val)
			AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(w.itm_sub3, c_null_val)
			;
			alc_key1 := '{}' ;
		END IF;
	END LOOP;

	IF (COALESCE(array_length(alc_key1, 1), 0) > 0) THEN
		UPDATE	mgt_calc_std_alc_rate t
		SET	alc_ptn_cd = w.alc_ptn_cd,
			expns_cd = w.expns_cd
		FROM (SELECT * FROM UNNEST(alc_key1)) w
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.alc_ac_cd = w.alc_ac_cd
		AND	t.wg_cd = w.wg_cd
		AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(w.dpt_cd, c_null_val)
		AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(w.loc_cd, c_null_val)
		AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(w.oper_cd, c_null_val)
		AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(w.bp_cd, c_null_val)
		AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(w.ctg_cd, c_null_val)
		AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(w.itm_cd, c_null_val)
		AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(w.itm_sub1, c_null_val)
		AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(w.itm_sub2, c_null_val)
		AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(w.itm_sub3, c_null_val)
		;
		alc_key1 := '{}' ;
	END IF;

	alc_key2 := '{}' ;
	FOR n IN
		SELECT *
		FROM	mgt_calc_alc_amt t
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.alc_ptn_cd IS NULL
	LOOP
		l_alc_ptn_cd_temp = n.alc_ptn_cd;
		l_expns_cd_temp = n.expns_cd;

		CALL mgpa_alc_ptn$p_get_alc_ptn_expns(
			n.alc_ac_cd, n.dpt_cd, n.loc_cd, n.oper_cd, n.bp_cd, n.ctg_cd,
			n.itm_cd, n.itm_sub1, n.itm_sub2, n.itm_sub3, n.wg_cd,
			l_alc_ptn_cd_temp, l_expns_cd_temp);

		n.alc_ptn_cd := l_alc_ptn_cd_temp;
		n.expns_cd := l_expns_cd_temp;
		alc_key2[COALESCE(array_length(alc_key2, 1), 0) + 1] := n ;

		IF (COALESCE(array_length(alc_key2, 1), 0) > c_max_alc_key_cnt) THEN
			UPDATE	mgt_calc_alc_amt t
			SET	alc_ptn_cd = w.alc_ptn_cd,
				expns_cd = w.expns_cd
			FROM (SELECT * FROM UNNEST(alc_key2)) w
			WHERE	0=0
			AND	t.calc_no = i_arg.calc_no
			AND	t.calc_grp_cd = i_arg.calc_grp_cd
			AND	t.alc_ac_cd = w.alc_ac_cd
			AND	t.wg_cd = w.wg_cd
			AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(w.dpt_cd, c_null_val)
			AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(w.loc_cd, c_null_val)
			AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(w.oper_cd, c_null_val)
			AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(w.bp_cd, c_null_val)
			AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(w.ctg_cd, c_null_val)
			AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(w.itm_cd, c_null_val)
			AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(w.itm_sub1, c_null_val)
			AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(w.itm_sub2, c_null_val)
			AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(w.itm_sub3, c_null_val)
			AND	t.alc_ptn_cd IS NULL
			;
			alc_key2 := '{}' ;
		END IF;
	END LOOP;

	IF (COALESCE(array_length(alc_key2, 1), 0) > 0) THEN
		UPDATE	mgt_calc_alc_amt t
		SET	alc_ptn_cd = w.alc_ptn_cd,
			expns_cd = w.expns_cd
		FROM (SELECT * FROM UNNEST(alc_key2)) w
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.alc_ac_cd = w.alc_ac_cd
		AND	t.wg_cd = w.wg_cd
		AND	COALESCE(t.dpt_cd, c_null_val) = COALESCE(w.dpt_cd, c_null_val)
		AND	COALESCE(t.loc_cd, c_null_val) = COALESCE(w.loc_cd, c_null_val)
		AND	COALESCE(t.oper_cd, c_null_val) = COALESCE(w.oper_cd, c_null_val)
		AND	COALESCE(t.bp_cd, c_null_val) = COALESCE(w.bp_cd, c_null_val)
		AND	COALESCE(t.ctg_cd, c_null_val) = COALESCE(w.ctg_cd, c_null_val)
		AND	COALESCE(t.itm_cd, c_null_val) = COALESCE(w.itm_cd, c_null_val)
		AND	COALESCE(t.itm_sub1, c_null_val) = COALESCE(w.itm_sub1, c_null_val)
		AND	COALESCE(t.itm_sub2, c_null_val) = COALESCE(w.itm_sub2, c_null_val)
		AND	COALESCE(t.itm_sub3, c_null_val) = COALESCE(w.itm_sub3, c_null_val)
		AND	t.alc_ptn_cd IS NULL
		;
		alc_key2 := '{}' ;
	END IF;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_parm m
	WHERE	0=0
	AND m.calc_grp_cd = i_arg.calc_grp_cd
	AND m.parm_key = 'ETC_IO_ALC_WG'
	AND m.parm_val = '1'
	;

	alc_key3 := '{}' ;
	FOR n IN
 		SELECT *
		FROM	mgt_calc_io t
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.alc_ac_cd IS NOT NULL
		AND	t.alc_amt_flg = '0'
		AND	t.alc_ptn_cd IS NULL
	LOOP
		l_alc_ptn_cd_temp = n.alc_ptn_cd;
		l_expns_cd_temp = n.expns_cd;

		CALL mgpa_alc_ptn$p_get_alc_ptn_expns(
			n.alc_ac_cd, n.alc_dpt_cd, n.alc_loc_cd, n.alc_oper_cd, n.alc_bp_cd, n.alc_ctg_cd,
			n.alc_itm_cd, n.alc_itm_sub1, n.alc_itm_sub2, n.alc_itm_sub3, CASE l_cnt WHEN 0 THEN n.wg_cd ELSE COALESCE(n.alc_wg_cd, n.wg_cd) END,
			l_alc_ptn_cd_temp, l_expns_cd_temp);

		n.alc_ptn_cd := l_alc_ptn_cd_temp;
		n.expns_cd := l_expns_cd_temp;
		alc_key3[COALESCE(array_length(alc_key3, 1), 0) + 1] := n ;

		IF (COALESCE(array_length(alc_key3, 1), 0) > c_max_alc_key_cnt) THEN
			UPDATE	mgt_calc_io t
			SET	alc_ptn_cd = w.alc_ptn_cd,
				expns_cd = w.expns_cd
			FROM (SELECT * FROM UNNEST(alc_key3)) w
			WHERE	0=0
			AND	t.calc_no = i_arg.calc_no
			AND	t.calc_grp_cd = i_arg.calc_grp_cd
			AND	t.act_io_id = w.act_io_id
			AND	t.act_io_id_sub = w.act_io_id_sub
			;
			alc_key3 := '{}' ;
		END IF;
	END LOOP;

	IF (COALESCE(array_length(alc_key3, 1), 0) > 0) THEN
		UPDATE	mgt_calc_io t
		SET	alc_ptn_cd = w.alc_ptn_cd,
			expns_cd = w.expns_cd
		FROM (SELECT * FROM UNNEST(alc_key3)) w
		WHERE	0=0
		AND	t.calc_no = i_arg.calc_no
		AND	t.calc_grp_cd = i_arg.calc_grp_cd
		AND	t.act_io_id = w.act_io_id
		AND	t.act_io_id_sub = w.act_io_id_sub
		;
		alc_key3 := '{}' ;
	END IF;

	CALL mgpa_alc_ptn$p_ini();

	COMMIT;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_PREP.P_SET_ALC');

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_prep$p_set_other_trd(
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	異なる計算グループ間の振替処理
<REMARKS>
	計算グループに対して計算順序グループが設定されていないときは引継ぎの処理は行わない
	1. 異なる計算グループからの振替出庫金額を対応する振替入庫の費目別原価に設定する
	2. 異なる計算グループへの振替出庫及び入庫の振替グループをＮＵＬＬにする
<ARGUMENTS>
<IN>	I_ARG
		MGT_ARGレコード
<HISTORY>
**************************************************************************/
DECLARE
	l_msg VARCHAR[];

	c_calc_rec_io CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP', 'IO');

	c_amt_other CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_AMT_ADD_TYP', 'OTHER_CALC');

	c_eval_expns CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP', 'EXPNS');

	c_cost_io_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP', 'STK_IN');
	c_cost_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP', 'STK_OUT');

	idx INTEGER;

	l_cnt NUMERIC;
	l_ym mam_term.term%TYPE;
	l_calc_no mgt_arg.calc_no%TYPE;

	x RECORD;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mgpa_sca_prep$p_set_other_trd$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'integer') ;

	<<PROC_FIN>>
	BEGIN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_PREP.P_SET_OTHER_TRD');

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mam_calc_grp m
		WHERE	0=0
		AND m.calc_grp_cd = i_arg.calc_grp_cd
		AND m.calc_seq_grp IS NOT NULL
		AND m.del_flg = '0'
		;

		IF l_cnt = 0 THEN
			EXIT PROC_FIN;
		END IF;

		TRUNCATE TABLE mgpa_sca_prep$p_set_other_trd$rec_ym;
		idx := 0;
		l_ym := i_arg.st_ym;
		LOOP
			idx := idx + 1;
			INSERT INTO mgpa_sca_prep$p_set_other_trd$rec_ym (
				_elem_,
				_index_
				)
			VALUES (
				l_ym,
				idx
				)
			;

			IF l_ym >= i_arg.end_ym THEN
				EXIT;
			END IF;

			l_ym := fcpa_postgres_util$add_months(l_ym, 1);
		END LOOP;

		IF idx = 0 THEN
			EXIT PROC_FIN;
		END IF;

		DELETE FROM mgw_calc_io_expns_amt;

		/* 計算グループ間のチェック */
		FOR x IN
			SELECT	m1.calc_grp_cd,
				m1.calc_seq_grp,
				COALESCE(m1.calc_seq, 0) AS calc_seq,
				m2.calc_grp_cd AS calc_grp_cd2,
				COALESCE(m2.calc_seq, 0) AS calc_seq2
			FROM	mam_calc_grp m1, mam_calc_grp m2
			WHERE	0=0
			AND m1.calc_grp_cd = i_arg.calc_grp_cd
			AND m1.calc_seq_grp IS NOT NULL
			AND m1.del_flg = '0'
			AND m1.calc_grp_cd <> m2.calc_grp_cd
			AND m1.calc_seq_grp = m2.calc_seq_grp
			AND m2.del_flg = '0'
			AND COALESCE(m1.calc_seq, 0) > COALESCE(m2.calc_seq, 0)
		LOOP
			FOR i IN 1..idx LOOP
				SELECT	MAX(t.calc_no)
				INTO	STRICT l_calc_no
				FROM	mgt_ym_no t
				WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd2
				AND t.ym = (SELECT _elem_ FROM mgpa_sca_prep$p_set_other_trd$rec_ym WHERE _index_ = i)
				;

				IF l_calc_no IS NULL THEN
					l_msg := fcpa_err$msg_binder(
							x.calc_grp_cd, x.calc_seq_grp, x.calc_seq::VARCHAR,
							x.calc_grp_cd2, x.calc_seq2::VARCHAR,
							fcpa_date_util$f_to_char((SELECT _elem_ FROM mgpa_sca_prep$p_set_other_trd$rec_ym WHERE _index_ = i), fcpa_date_util$y4m())
							);
					CALL fcpa_err$raise_app_err('MGBDD0017', l_msg);
				END IF;

				/* 1. 異なる計算グループからの振替出庫金額を対応する振替入庫の費目別原価に設定する */
				INSERT INTO mgw_calc_io_expns_amt (
					itm_cd, itm_sub1, itm_sub2, itm_sub3, itm_ext,
					wg_cd,
					act_io_id, act_io_id_sub,
					expns_cd,
					amt
					)
				SELECT
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, t1.itm_ext,
					t1.wg_cd,
					t1.act_io_id, t1.act_io_id_sub,
					t4.expns_cd,
					SUM(t4.act_cost)
				FROM	mgt_calc_io t1, mgt_calc_io_trd t2,
					mgt_acc_top t3, mgt_acc_sml_cost t4
				WHERE	0=0
				AND t1.calc_no = i_arg.calc_no
				AND t1.calc_grp_cd = i_arg.calc_grp_cd
				AND t1.cost_io_typ = c_cost_io_stk_in
				AND t1.rec_eval_typ IS NULL
				AND t1.trd_grp IS NOT NULL
				AND t1.other_wg_cd IS NOT NULL
				AND t1.other_wg_cd <> t1.wg_cd
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w
						WHERE	0=0
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.wg_cd = t1.other_wg_cd
						)
				AND t1.ym = (SELECT _elem_ FROM mgpa_sca_prep$p_set_other_trd$rec_ym WHERE _index_ = i)
				AND t1.ym = t2.ym
				AND t1.trd_grp = t2.trd_grp
				AND t2.calc_no = l_calc_no
				AND t2.calc_grp_cd = x.calc_grp_cd2
				AND t2.calc_no = t3.calc_no
				AND t2.calc_grp_cd = t3.calc_grp_cd
				AND t2.act_io_id = t3.act_id
				AND t2.act_io_id_sub = t3.act_id_sub
				AND t3.calc_rec_typ = c_calc_rec_io
				AND t3.cost_io_typ = c_cost_io_stk_out
				AND t3.calc_no = t4.calc_no
				AND t3.calc_grp_cd = t4.calc_grp_cd
				AND t3.top_rec_no = t4.top_rec_no
				GROUP BY t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, t1.itm_ext,
					t1.wg_cd,
					t1.act_io_id, t1.act_io_id_sub,
					t4.expns_cd
				;

				INSERT INTO mgt_calc_trd_calc_no (
					calc_no, calc_grp_cd,
					ym,
					trd_calc_no, trd_calc_grp_cd
					)
				VALUES (
					i_arg.calc_no, i_arg.calc_grp_cd,
					(SELECT _elem_ FROM mgpa_sca_prep$p_set_other_trd$rec_ym WHERE _index_ = i),
					l_calc_no, x.calc_grp_cd2
					)
				;
			END LOOP;
		END LOOP;

		DELETE FROM mgt_calc_io_expns_amt t
		WHERE	0=0
		AND t.calc_no = i_arg.calc_no
		AND t.calc_grp_cd = i_arg.calc_grp_cd
		AND t.amt_add_typ = c_amt_other
		;

		INSERT INTO mgt_calc_io_expns_amt (
			calc_no, calc_grp_cd,
			itm_cd, itm_sub1, itm_sub2, itm_sub3, itm_ext,
			wg_cd,
			act_io_id, act_io_id_sub,
			expns_cd,
			amt_add_typ,
			amt
			)
		SELECT	i_arg.calc_no, i_arg.calc_grp_cd,
			w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3, w.itm_ext,
			COALESCE(i_arg.runtime_wg_cd, w.wg_cd),
			w.act_io_id, w.act_io_id_sub,
			w.expns_cd,
			c_amt_other,
			SUM(w.amt)
		FROM	mgw_calc_io_expns_amt w
		WHERE	0=0
		GROUP BY w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3, w.itm_ext,
			COALESCE(i_arg.runtime_wg_cd, w.wg_cd),
			w.act_io_id, w.act_io_id_sub,
			w.expns_cd
		;

		UPDATE mgt_calc_io t
		SET rec_eval_typ = c_eval_expns
		WHERE	0=0
		AND t.calc_no = i_arg.calc_no
		AND t.calc_grp_cd = i_arg.calc_grp_cd
		AND t.cost_io_typ = c_cost_io_stk_in
		AND t.rec_eval_typ IS NULL
		AND t.trd_grp IS NOT NULL
		AND t.other_wg_cd IS NOT NULL
		AND t.other_wg_cd <> t.wg_cd
		AND EXISTS (
				SELECT	'X'
				FROM	mgt_calc_io_expns_amt w
				WHERE	0=0
				AND w.calc_no = t.calc_no
				AND w.calc_grp_cd = t.calc_grp_cd
				AND w.itm_cd = t.itm_cd
				AND w.itm_sub1 = t.itm_sub1
				AND w.itm_sub2 = t.itm_sub2
				AND w.itm_sub3 = t.itm_sub3
				AND w.itm_ext = t.itm_ext
				AND w.wg_cd = t.wg_cd
				AND w.act_io_id = t.act_io_id
				AND w.act_io_id_sub = t.act_io_id_sub
				AND w.amt_add_typ = c_amt_other
			)
		;

		/* 2. 異なる計算グループへの振替出庫及び入庫の振替グループをＮＵＬＬにする */
		DELETE FROM mgt_calc_io_trd t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
		INSERT INTO mgt_calc_io_trd (
			calc_no, calc_grp_cd,
			act_io_id, act_io_id_sub,
			ym, trd_grp,
			wg_cd, other_wg_cd,
			cost_io_typ
			)
		SELECT	t.calc_no, t.calc_grp_cd,
			t.act_io_id, t.act_io_id_sub,
			t.ym, t.trd_grp,
			t.wg_cd, t.other_wg_cd,
			t.cost_io_typ
		FROM	mgt_calc_io t
		WHERE	0=0
		AND t.calc_no = i_arg.calc_no
		AND t.calc_grp_cd = i_arg.calc_grp_cd
		AND t.cost_io_typ IN (c_cost_io_stk_out, c_cost_io_stk_in)
		AND t.trd_grp IS NOT NULL
		AND t.other_wg_cd IS NOT NULL
		AND t.other_wg_cd <> t.wg_cd
		AND NOT EXISTS (
				SELECT	'X'
				FROM	mam_grp_wg w
				WHERE	0=0
				AND w.calc_grp_cd = i_arg.calc_grp_cd
				AND w.wg_cd = t.other_wg_cd
				)
		;

		UPDATE	mgt_calc_io t
		SET	trd_grp = NULL,
			trd_ratio = NULL,
			alc_ac_cd = NULL
		WHERE	0=0
		AND t.calc_no = i_arg.calc_no
		AND t.calc_grp_cd = i_arg.calc_grp_cd
		AND t.cost_io_typ IN (c_cost_io_stk_out, c_cost_io_stk_in)
		AND t.trd_grp IS NOT NULL
		AND t.other_wg_cd IS NOT NULL
		AND t.other_wg_cd <> t.wg_cd
		AND EXISTS (
				SELECT	'X'
				FROM	mgt_calc_io_trd w
				WHERE	0=0
				AND w.calc_no = t.calc_no
				AND w.calc_grp_cd = t.calc_grp_cd
				AND w.act_io_id = t.act_io_id
				AND w.act_io_id_sub = t.act_io_id_sub
			)
		;

	END;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_PREP.P_SET_OTHER_TRD');

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_prep$p_proca(
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	複数回の計算を行うときの最初の処理
<REMARKS>

<ARGUMENTS>
<IN>	I_ARG
		MGT_ARGレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	c_asst_prod		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP', 'CO_PROD');
	c_asst_oth		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP', 'OTH');

	c_ac_slip_purc_xpns	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP', 'PURC_XPNS');
	c_ac_slip_mfg		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP', 'MFG');
	c_ac_slip_byprod	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP', 'BYPROD');
	c_ac_slip_purc		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP', 'PURC');
	c_ac_slip_input		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP', 'INPUT');
	c_ac_slip_in_onr	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP', 'IN_ONR');
	c_ac_slip_in_ss		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP', 'IN_SS');
	c_ac_slip_sls		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP', 'SLS');

	c_asset_mng_not_mng	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP', 'NOT_MNG');

	c_prov_ffr		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP', 'FFR_PROV');
	c_prov_onr		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP', 'ONR_PROV');
	c_prov_ss		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PROV_TYP', 'SS');

	c_mfg_purc_purc		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MFG_PURC_TYP', 'PURC');
	c_unit_calc_calc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UNIT_CALC_TYP', 'CALC');
	c_unit_calc_non		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UNIT_CALC_TYP', 'NON');
	c_exp_set_non		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXP_SET_TYP', 'NON');
	c_wip_tgt			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_WIP_TYP', 'TGT');
	c_bd_agg_non		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BD_AGG_TYP', 'NON');
	c_exp_alloc_cost	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXP_ALLOC_TYP', 'COST_RATIO');

	c_pre_alc_calc_non		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_CALC_TYP', 'NON');
	c_exp_calc_non			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXP_CALC_TYP', 'NON');
	c_exp_calc_rqmt			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXP_CALC_TYP', 'RQMT');
	c_exp_calc_mfg			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXP_CALC_TYP', 'MFG');
	c_alc_calc_non			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ALC_CALC_TYP', 'NON');
	c_cost_calc_other		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'OTHER');
	c_cost_calc_stk			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'CALC_STK');
	c_cost_calc_std			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'COST_STD');
	c_sa_act				CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'ACT');
	c_sa_pln				CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'PLN');
	c_calc_ctg_rqmt			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'RQMT');
	c_calc_ctg_mfg			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'MFG');
	c_calc_ctg_purc			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'PURC');
	c_calc_ctg_wk			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'WK');
	c_calc_ctg_inpt			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'INPT');
	c_calc_ctg_io			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'IO');
	c_calc_ctg_sls			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'SLS');
	c_calc_ctg_inst_wip		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'INST_WIP');
	c_calc_ctg_gp_alc		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'GP_ALC');
	c_calc_ctg_calc_itm		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'CALC_ITM');
	c_calc_ctg_itm_dtl		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ITM_DTL');
	c_calc_ctg_itm_oper		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ITM_OPER');
	c_calc_ctg_itm_wk		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ITM_WK');
	c_calc_ctg_itm_purc		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ITM_PURC');
	c_calc_ctg_itm_proc		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ITM_PROC');
	c_calc_ctg_itm_prov		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ITM_PROV');
	c_calc_ctg_itm_sls		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ITM_SLS');
	c_calc_ctg_itm_fix		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ITM_FIX');
	c_calc_ctg_alc_rate_m	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'ALC_RATE_M');
	c_calc_ctg_other_wk		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'OTHER_WK');
	c_calc_ctg_bom			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'BOM');

	l_co mam_co%ROWTYPE;
	l_co_parm mam_co_parm%ROWTYPE;
	l_cur mam_cur%ROWTYPE;

	l_stk_calc_grp_cd mam_calc_grp.calc_grp_cd%TYPE;
	l_wip_calc_grp_cd mam_calc_grp.calc_grp_cd%TYPE;

	l_cnt NUMERIC;
	l_itm_cnt NUMERIC;
	l_usr fcm_user.user_id%TYPE;

	sql$rowcount BIGINT;
	l1 RECORD;
	l2 RECORD;
	l3 RECORD;
	l4 RECORD;
	l5 RECORD;
	l6 RECORD;
	l7 RECORD;
	l8 RECORD;
	l9 RECORD;
	l10 RECORD;
	l11 RECORD;
	l14 RECORD;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_PREP.P_PROCA');

	l_co := mapa_co$f_get_co_rec();

	l_co_parm := mgpa_co_parm$f_get_rec();

	l_cur := mgpa_xchng$f_get_cur(l_co.base_cur_cd);

	l_usr := fcpa_context$f_get_userid();

	CALL mgpa_set_itm_ext$p_itm_ext_null(i_arg);

	<<PROC_END>>
	BEGIN
		<<SKIP_RQMT>>
		BEGIN
			l_cnt := 0;
			DELETE FROM mgt_calc_parm t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			INSERT INTO mgt_calc_parm (
				calc_no, calc_grp_cd,
				parm_key,
				parm_val,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3
				)
			SELECT	i_arg.calc_no, i_arg.calc_grp_cd,
				m.parm_key,
				m.parm_val,
				m.rmrks,
				m.sub_char1,
				m.sub_char2,
				m.sub_char3
			FROM	(
				SELECT	m1.parm_key,
					m1.parm_val,
					m1.rmrks,
					m1.sub_char1,
					m1.sub_char2,
					m1.sub_char3
				FROM	mgt_parm m1
				WHERE	0=0
				AND m1.calc_grp_cd = i_arg.calc_grp_cd
				AND m1.parm_val IS NOT NULL
				UNION ALL
				SELECT	'SCA_ITM_SUB_TYP' AS parm_key,
					m2.parm_val AS parm_val,
					NULL AS rmrks,
					NULL AS sub_char1,
					NULL AS sub_char2,
					NULL AS sub_char3
				FROM	mam_sys_parm m2
				WHERE	0=0
				AND m2.parm_key = 'ITM_SUB_TYP'
				AND m2.parm_val IS NOT NULL
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_parm x
						WHERE	0=0
						AND x.calc_grp_cd = i_arg.calc_grp_cd
						AND x.parm_key = 'SCA_ITM_SUB_TYP'
						AND x.parm_val IS NOT NULL
					)
				UNION ALL
				SELECT	'SCA_NULL_VAL' AS parm_key,
					c_null_val AS parm_val,
					NULL AS rmrks,
					NULL AS sub_char1,
					NULL AS sub_char2,
					NULL AS sub_char3
				WHERE	0=0
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_parm x
						WHERE	0=0
						AND x.calc_grp_cd = i_arg.calc_grp_cd
						AND x.parm_key = 'SCA_NULL_VAL'
						AND x.parm_val IS NOT NULL
					)
				UNION ALL
				SELECT	'SCA_CHK' AS parm_key,
					'1' AS parm_val,
					NULL AS rmrks,
					NULL AS sub_char1,
					NULL AS sub_char2,
					NULL AS sub_char3
				WHERE	0=0
				AND i_arg.data_check_flg = '1'
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_parm x
						WHERE	0=0
						AND x.calc_grp_cd = i_arg.calc_grp_cd
						AND x.parm_key = 'SCA_CHK'
						AND x.parm_val IS NOT NULL
					)
				UNION ALL
				SELECT	'SCA_BCUR' AS parm_key,
					l_co.base_cur_cd AS parm_val,
					NULL AS rmrks,
					NULL AS sub_char1,
					NULL AS sub_char2,
					NULL AS sub_char3
				WHERE	0=0
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_parm x
						WHERE	0=0
						AND x.calc_grp_cd = i_arg.calc_grp_cd
						AND x.parm_key = 'SCA_BCUR'
						AND x.parm_val IS NOT NULL
					)
				UNION ALL
				SELECT	'ETC_STK_CALC_GRP' AS parm_key,
					i_arg.calc_grp_cd AS parm_val,
					NULL AS rmrks,
					NULL AS sub_char1,
					NULL AS sub_char2,
					NULL AS sub_char3
				WHERE	0=0
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_parm x
						WHERE	0=0
						AND x.calc_grp_cd = i_arg.calc_grp_cd
						AND x.parm_key = 'ETC_STK_CALC_GRP'
						AND x.parm_val IS NOT NULL
					)
				UNION ALL
				SELECT	'ETC_WIP_CALC_GRP' AS parm_key,
					i_arg.calc_grp_cd AS parm_val,
					NULL AS rmrks,
					NULL AS sub_char1,
					NULL AS sub_char2,
					NULL AS sub_char3
				WHERE	0=0
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_parm x
						WHERE	0=0
						AND x.calc_grp_cd = i_arg.calc_grp_cd
						AND x.parm_key = 'ETC_WIP_CALC_GRP'
						AND x.parm_val IS NOT NULL
					)
				) m
			WHERE	0=0;

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_PARM', l_cnt::VARCHAR);
			COMMIT;

			SELECT	COALESCE(MIN(m.parm_val), i_arg.calc_grp_cd)
			INTO	STRICT l_stk_calc_grp_cd
			FROM	mgt_parm m
			WHERE	0=0
			AND m.calc_grp_cd = i_arg.calc_grp_cd
			AND m.parm_key = 'ETC_STK_CALC_GRP'
			AND m.parm_val IS NOT NULL;

			SELECT	COALESCE(MIN(m.parm_val), i_arg.calc_grp_cd)
			INTO	STRICT l_wip_calc_grp_cd
			FROM	mgt_parm m
			WHERE	0=0
			AND m.calc_grp_cd = i_arg.calc_grp_cd
			AND m.parm_key = 'ETC_WIP_CALC_GRP'
			AND m.parm_val IS NOT NULL;

			l_cnt := 0;
			DELETE FROM mgt_calc_cur_parm t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			INSERT INTO mgt_calc_cur_parm (
				calc_no, calc_grp_cd,
				cur_cd,
				amt_rnd_typ,
				amt_dec_place,
				ave_rnd_typ,
				ave_dec_place
				)
			SELECT	i_arg.calc_no, i_arg.calc_grp_cd,
				m.cur_cd,
				l_co_parm.amt_rnd_typ,
				m.amt_dec_place,
				l_co_parm.ave_rnd_typ,
				m.upri_dec_place
			FROM	mam_cur m
			WHERE	0=0;

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_CUR_PARM', l_cnt::VARCHAR);
			COMMIT;

			CALL mgpa_pre_alc$p_set_input_data(i_arg);
			/* 一次配賦計算処理 */
			IF i_arg.pre_alc_calc_typ != c_pre_alc_calc_non THEN
				CALL mgpa_pre_alc$p_main(i_arg);
			END IF;
			COMMIT;

			IF i_arg.exp_calc_typ = c_exp_calc_non
			AND i_arg.alc_calc_typ = c_alc_calc_non
			AND i_arg.cost_calc_typ = c_cost_calc_other
			AND i_arg.inpt_calc_flg = '0'
			AND i_arg.wk_calc_flg = '0' THEN
				EXIT PROC_END;
			END IF;

			CALL mgpa_xchng$p_ini(i_arg);

			l_cnt := 0;
			DELETE FROM mgt_calc_ptn t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			INSERT INTO mgt_calc_ptn (
				calc_no, calc_grp_cd,
				calc_ptn_cd,
				mfg_purc_typ,
				eval_typ,
				dpt_typ,
				lot_typ,
				sublot_typ,
				sno1_typ,
				sno2_typ,
				sno3_typ,
				sno4_typ,
				lot_exp_typ,
				sublot_exp_typ,
				sno1_exp_typ,
				sno2_exp_typ,
				sno3_exp_typ,
				sno4_exp_typ,
				std_rnd_typ,
				std_dec_place,
				amt_rnd_typ,
				amt_dec_place,
				ave_rnd_typ,
				ave_dec_place,
				adj_typ,
				wip_typ,
				bd_agg_typ,
				mrgn_expns_cd,
				purc_expns_cd,
				out_expns_cd,
				inpt_expns_cd,
				ss_expns_cd,
				prov_expns_cd,
				exp_alloc_typ
				)
			SELECT	i_arg.calc_no, i_arg.calc_grp_cd,
				m1.calc_ptn_cd,
				COALESCE(m2.mfg_purc_typ, COALESCE(m1.mfg_purc_typ, c_mfg_purc_purc)),
				COALESCE(m2.eval_typ, COALESCE(m1.eval_typ, i_arg.eval_typ)),
				COALESCE(m2.dpt_typ, COALESCE(m1.dpt_typ, c_unit_calc_calc)), /* 部門のデフォルトは計算対象とする */
				COALESCE(m2.lot_typ, COALESCE(m1.lot_typ, c_unit_calc_non)),
				COALESCE(m2.sublot_typ, COALESCE(m1.sublot_typ, c_unit_calc_non)),
				COALESCE(m2.sno1_typ, COALESCE(m1.sno1_typ, c_unit_calc_non)),
				COALESCE(m2.sno2_typ, COALESCE(m1.sno2_typ, c_unit_calc_non)),
				COALESCE(m2.sno3_typ, COALESCE(m1.sno3_typ, c_unit_calc_non)),
				COALESCE(m2.sno4_typ, COALESCE(m1.sno4_typ, c_unit_calc_non)),
				COALESCE(m2.lot_exp_typ, COALESCE(m1.lot_exp_typ, c_exp_set_non)),
				COALESCE(m2.sublot_exp_typ, COALESCE(m1.sublot_exp_typ, c_exp_set_non)),
				COALESCE(m2.sno1_exp_typ, COALESCE(m1.sno1_exp_typ, c_exp_set_non)),
				COALESCE(m2.sno2_exp_typ, COALESCE(m1.sno2_exp_typ, c_exp_set_non)),
				COALESCE(m2.sno3_exp_typ, COALESCE(m1.sno3_exp_typ, c_exp_set_non)),
				COALESCE(m2.sno4_exp_typ, COALESCE(m1.sno4_exp_typ, c_exp_set_non)),
				COALESCE(m2.std_rnd_typ, COALESCE(m1.std_rnd_typ, l_co_parm.std_rnd_typ)),
				COALESCE(m2.std_dec_place, COALESCE(m1.std_dec_place, l_co_parm.std_dec_place)),
				l_co_parm.amt_rnd_typ,
				l_co_parm.amt_dec_place,
				COALESCE(m2.ave_rnd_typ, COALESCE(m1.ave_rnd_typ, l_co_parm.ave_rnd_typ)),
				COALESCE(m2.ave_dec_place, COALESCE(m1.ave_dec_place, l_co_parm.ave_dec_place)),
				COALESCE(m2.adj_typ, COALESCE(m1.adj_typ, l_co_parm.adj_typ)),
				COALESCE(m2.wip_typ, COALESCE(m1.wip_typ, c_wip_tgt)),
				COALESCE(m2.bd_agg_typ, COALESCE(m1.bd_agg_typ, c_bd_agg_non)),
				COALESCE(m2.mrgn_expns_cd, COALESCE(m1.mrgn_expns_cd, l_co_parm.mrgn_expns_cd)),
				COALESCE(m2.purc_expns_cd, COALESCE(m1.purc_expns_cd, l_co_parm.purc_expns_cd)),
				COALESCE(m2.out_expns_cd, COALESCE(m1.out_expns_cd, l_co_parm.out_expns_cd)),
				COALESCE(m2.inpt_expns_cd, COALESCE(m1.inpt_expns_cd, l_co_parm.inpt_expns_cd)),
				COALESCE(m2.ss_expns_cd, COALESCE(m1.ss_expns_cd, l_co_parm.ss_expns_cd)),
				COALESCE(m2.prov_expns_cd, COALESCE(m1.prov_expns_cd, l_co_parm.prov_expns_cd)),
				COALESCE(m2.exp_alloc_typ, COALESCE(m1.exp_alloc_typ, c_exp_alloc_cost))
			FROM	mam_calc_ptn m1
				LEFT OUTER JOIN (
					SELECT	x.*
					FROM	mam_grp_ptn x
					WHERE	0=0
					AND x.calc_grp_cd = i_arg.calc_grp_cd
					) m2
					ON (m1.calc_ptn_cd = m2.calc_ptn_cd)
			WHERE	0=0;

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_PTN', l_cnt::VARCHAR);
			COMMIT;

			SELECT	COUNT(*)
			INTO	STRICT l_itm_cnt
			FROM	mgt_usr_itm t
			WHERE	0=0
			AND t.usr_cd = l_usr
			AND t.calc_grp_cd = i_arg.calc_grp_cd;

			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	mgt_parm m
			WHERE	0=0
			AND m.calc_grp_cd = i_arg.calc_grp_cd
			AND m.parm_key = 'ETC_ITM_LIMIT'
			AND m.parm_val = '1';

			IF l_itm_cnt = 0 AND l_cnt = 1 THEN
				<<SKIP_RQMT_USR_ITM>>
				BEGIN
					IF i_arg.exp_calc_typ != c_exp_calc_rqmt OR i_arg.sa_typ = c_sa_act THEN
						EXIT SKIP_RQMT_USR_ITM;
					END IF;

					/* 月次計画 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_rqmt);
					INSERT INTO mgt_usr_itm (
						usr_cd, calc_grp_cd,
						itm_cd, itm_sub1, itm_sub2, itm_sub3
						)
					SELECT DISTINCT
						l_usr, i_arg.calc_grp_cd,
						t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
					FROM	mgw_calc_ctg w1, mgt_pln_rqmt t1
					WHERE	0=0
					AND w1.calc_ctg_cd = t1.calc_ctg_cd
					AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
					AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = t1.wg_cd
							);

					GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
					l_itm_cnt := l_itm_cnt + sql$rowcount;

				END;

				<<SKIP_PROD_PURC_USR_ITM>>
				BEGIN
					IF i_arg.exp_calc_typ = c_exp_calc_rqmt THEN
						EXIT SKIP_PROD_PURC_USR_ITM;
					END IF;

					/* 製造計画／実績 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_mfg);
					IF i_arg.sa_typ = c_sa_pln THEN
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_pln_mfg t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					ELSE
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_mfg t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					END IF;

					IF i_arg.exp_calc_typ = c_exp_calc_mfg THEN
						EXIT SKIP_PROD_PURC_USR_ITM;
					END IF;

					/* 購買計画／実績 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_purc);
					IF i_arg.sa_typ = c_sa_pln THEN
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_pln_purc t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					ELSE
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_purc t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					END IF;

				END;

				<<SKIP_WK_USR_ITM>>
				BEGIN
					IF i_arg.wk_calc_flg = '1' OR i_arg.exp_calc_typ = c_exp_calc_rqmt THEN
						EXIT SKIP_WK_USR_ITM;
					END IF;

					/* 品目工数計画／指図工数実績 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_wk);
					IF i_arg.sa_typ = c_sa_pln THEN
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_pln_itm_wk t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					ELSE
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_inst_wk t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					END IF;

				END;

				<<SKIP_INPT_USR_ITM>>
				BEGIN
					IF i_arg.inpt_calc_flg = '1' OR i_arg.exp_calc_typ = c_exp_calc_rqmt THEN
						EXIT SKIP_INPT_USR_ITM;
					END IF;

					/* 投入計画／投入実績 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_inpt);
					IF i_arg.sa_typ = c_sa_pln THEN
						/* 親品目 */
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3
						FROM	mgw_calc_ctg w1, mgt_pln_inpt t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.par_itm_cd
							AND x.itm_sub1 = t1.par_itm_sub1
							AND x.itm_sub2 = t1.par_itm_sub2
							AND x.itm_sub3 = t1.par_itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;

						/* 子品目 */
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_pln_inpt t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					ELSE
						/* 親品目 */
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_inpt t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.par_itm_cd
							AND x.itm_sub1 = t1.par_itm_sub1
							AND x.itm_sub2 = t1.par_itm_sub2
							AND x.itm_sub3 = t1.par_itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;

						/* 子品目 */
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_inpt t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					END IF;

				END;

				<<SKIP_IO_USR_ITM>>
				BEGIN
					IF i_arg.cost_calc_typ != c_cost_calc_stk THEN
						EXIT SKIP_IO_USR_ITM;
					END IF;

					/* 入出庫実績 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_io);
					IF i_arg.sa_typ = c_sa_pln THEN
						NULL;
					ELSE
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_io t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;

						/* 配賦先品目 */
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.alc_itm_cd, t1.alc_itm_sub1, t1.alc_itm_sub2, t1.alc_itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_io t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND t1.alc_itm_cd IS NOT NULL
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.alc_itm_cd
							AND x.itm_sub1 = t1.alc_itm_sub1
							AND x.itm_sub2 = t1.alc_itm_sub2
							AND x.itm_sub3 = t1.alc_itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					END IF;

				END;

				<<SKIP_SLS_USR_ITM>>
				BEGIN
					IF i_arg.cost_calc_typ IN (c_cost_calc_std, c_cost_calc_other)
					AND i_arg.exp_calc_typ != c_exp_calc_rqmt
					AND i_arg.alc_calc_typ = c_alc_calc_non THEN
						EXIT SKIP_SLS_USR_ITM;
					END IF;

					/* 売上計画／実績 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_sls);
					IF i_arg.sa_typ = c_sa_pln THEN
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_pln_sls t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					ELSE
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_sls t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					END IF;

				END;

				<<SKIP_INST_WIP_USR_ITM>>
				BEGIN
					IF i_arg.cost_calc_typ IN (c_cost_calc_std, c_cost_calc_other) THEN
						EXIT SKIP_INST_WIP_USR_ITM;
					END IF;

					/* 指図仕掛実績 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_inst_wip);
					IF i_arg.sa_typ = c_sa_pln THEN
						NULL;
					ELSE
						INSERT INTO mgt_usr_itm (
							usr_cd, calc_grp_cd,
							itm_cd, itm_sub1, itm_sub2, itm_sub3
							)
						SELECT DISTINCT
							l_usr, i_arg.calc_grp_cd,
							t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
						FROM	mgw_calc_ctg w1, mgt_act_inst_wip t1
						WHERE	0=0
						AND w1.calc_ctg_cd = t1.calc_ctg_cd
						AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
						AND EXISTS (
								SELECT	'X'
								FROM	mam_grp_wg w2
								WHERE	0=0
								AND w2.calc_grp_cd = i_arg.calc_grp_cd
								AND w2.wg_cd = t1.wg_cd
								)
						AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_usr_itm x
							WHERE	0=0
							AND x.usr_cd = l_usr
							AND x.calc_grp_cd = i_arg.calc_grp_cd
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
						);

						GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
						l_itm_cnt := l_itm_cnt + sql$rowcount;
					END IF;

				END;

				<<SKIP_GP_ALC_USR_ITM>>
				BEGIN
					IF i_arg.cost_calc_typ IN (c_cost_calc_std, c_cost_calc_other)
					AND i_arg.alc_calc_typ = c_alc_calc_non THEN
						EXIT SKIP_GP_ALC_USR_ITM;
					END IF;

					/* 汎用配賦対象 */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_gp_alc);
					INSERT INTO mgt_usr_itm (
						usr_cd, calc_grp_cd,
						itm_cd, itm_sub1, itm_sub2, itm_sub3
						)
					SELECT DISTINCT
						l_usr, i_arg.calc_grp_cd,
						t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
					FROM	mgw_calc_ctg w1, mgt_gp_alc t1
					WHERE	0=0
					AND w1.calc_ctg_cd = t1.calc_ctg_cd
					AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
					AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = t1.wg_cd
							)
					AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_usr_itm x
						WHERE	0=0
						AND x.usr_cd = l_usr
						AND x.calc_grp_cd = i_arg.calc_grp_cd
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
					);

					GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
					l_itm_cnt := l_itm_cnt + sql$rowcount;
				END;

				/* 月初在庫 */
				INSERT INTO mgt_usr_itm (
					usr_cd, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3
					)
				SELECT DISTINCT
					l_usr, i_arg.calc_grp_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
				FROM	mgt_st_stk t1
				WHERE	0=0
				AND t1.calc_grp_cd = l_stk_calc_grp_cd
				AND t1.ym = i_arg.st_ym
				AND NOT EXISTS (
					SELECT	'X'
					FROM	mgt_usr_itm x
					WHERE	0=0
					AND x.usr_cd = l_usr
					AND x.calc_grp_cd = i_arg.calc_grp_cd
					AND x.itm_cd = t1.itm_cd
					AND x.itm_sub1 = t1.itm_sub1
					AND x.itm_sub2 = t1.itm_sub2
					AND x.itm_sub3 = t1.itm_sub3
				);

				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_itm_cnt := l_itm_cnt + sql$rowcount;

				/* 月初仕掛 */
				INSERT INTO mgt_usr_itm (
					usr_cd, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3
					)
				SELECT DISTINCT
					l_usr, i_arg.calc_grp_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3
				FROM	mgt_st_wip t1
				WHERE	0=0
				AND t1.calc_grp_cd = l_wip_calc_grp_cd
				AND t1.ym = i_arg.st_ym
				AND NOT EXISTS (
					SELECT	'X'
					FROM	mgt_usr_itm x
					WHERE	0=0
					AND x.usr_cd = l_usr
					AND x.calc_grp_cd = i_arg.calc_grp_cd
					AND x.itm_cd = t1.itm_cd
					AND x.itm_sub1 = t1.itm_sub1
					AND x.itm_sub2 = t1.itm_sub2
					AND x.itm_sub3 = t1.itm_sub3
				);

				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_itm_cnt := l_itm_cnt + sql$rowcount;

				CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_USR_ITM', l_itm_cnt::VARCHAR);
				COMMIT;

			ELSIF l_itm_cnt = 0 THEN
				SELECT	COUNT(*)
				INTO	STRICT l_cnt
				FROM	mgt_parm m
				WHERE	0=0
				AND m.calc_grp_cd = i_arg.calc_grp_cd
				AND m.parm_key = 'ETC_ITM_LIMIT_FIX'
				AND m.parm_val = '1';

				IF l_cnt > 0 THEN
					/* 計算カテゴリの優先順は意識せず未確定品目のみを入れる */
					CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_calc_itm);
					INSERT INTO mgt_usr_itm (
						usr_cd, calc_grp_cd,
						itm_cd, itm_sub1, itm_sub2, itm_sub3
						)
					SELECT DISTINCT
						l_usr, i_arg.calc_grp_cd,
						t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3
					FROM	mgt_itm t
					WHERE	0=0
					AND t.term = i_arg.term
					AND t.non_calc_flg = '0'
					AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w1
							WHERE	0=0
							AND w1.calc_grp_cd = i_arg.calc_grp_cd
							AND w1.wg_cd = t.wg_cd
						)
					AND EXISTS (
							SELECT	'X'
							FROM	mgw_calc_ctg w2
							WHERE	0=0
							AND w2.calc_ctg_cd = t.calc_ctg_cd
						)
					AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_std_fix w3
							WHERE	0=0
							AND w3.itm_cd = t.itm_cd
							AND w3.itm_sub1 = t.itm_sub1
							AND w3.itm_sub2 = t.itm_sub2
							AND w3.itm_sub3 = t.itm_sub3
							AND w3.term = t.term
							AND w3.calc_ctg_cd = t.calc_ctg_cd
							AND w3.wg_cd = t.wg_cd
						);

					GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
					l_itm_cnt := l_itm_cnt + sql$rowcount;

					CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_USR_ITM', l_itm_cnt::VARCHAR);
					COMMIT;
				END IF;
			END IF;

			IF l_itm_cnt > 0 THEN
				CALL mgpa_sca_prep$p_itm_add(i_arg);
			END IF;

			DELETE FROM mgw_usr_itm;
			INSERT INTO mgw_usr_itm (
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3
				)
			SELECT
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3
			FROM	mgt_usr_itm t
			WHERE	0=0
			AND t.usr_cd = l_usr
			AND t.calc_grp_cd = i_arg.calc_grp_cd;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_calc_itm);
			FOR l1 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					wg_cd,
					calc_ptn_cd,
					std_qty,
					calc_ctg_cd,
					rmrks,
					sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.wg_cd,
					m.calc_ptn_cd,
					m.std_qty,
					m.calc_ctg_cd,
					m.rmrks,
					m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l1.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = i_arg.runtime_wg_cd
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND w.wg_cd = m.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm t
						WHERE	0=0
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm_dtl t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_itm_dtl);
			FOR l2 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm_dtl (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					loc_cd, sppl_cd, rqst_wg_cd,
					wg_cd,
					cost_ratio,
					oper_ptn, bom_ptn,
					min_lot_qty, batch_lot_qty, fxd_lot_qty, fxd_yield_qty,
					nmr_qty, dnm_qty,
					alc_dpt_cd, exp_dpt_cd, exp_prio, max_qty,
					alc_val1, alc_val2, alc_val3, alc_val4, alc_val5,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.loc_cd, m.sppl_cd, m.rqst_wg_cd,
					m.wg_cd,
					m.cost_ratio,
					m.oper_ptn, m.bom_ptn,
					m.min_lot_qty, m.batch_lot_qty, m.fxd_lot_qty, m.fxd_yield_qty,
					m.nmr_qty, m.dnm_qty,
					m.alc_dpt_cd, m.exp_dpt_cd, m.exp_prio, m.max_qty,
					m.alc_val1, m.alc_val2, m.alc_val3, m.alc_val4, m.alc_val5,
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm_dtl m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l2.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND (i_arg.runtime_wg_cd IS NULL OR m.rqst_wg_cd = c_null_val)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_dtl w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					)
				AND EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm t
						WHERE	0=0
						AND t.calc_no = i_arg.calc_no
						AND t.calc_grp_cd = i_arg.calc_grp_cd
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						AND (m.wg_cd = c_null_val OR t.wg_cd = m.wg_cd)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_DTL', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm_oper t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_itm_oper);
			FOR l3 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm_oper (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					loc_cd, oper_ptn, oper_cd, oper_seq,
					wg_cd,
					disp_seq,
					nmr_qty, dnm_qty,
					yield_oper_flg,
					oper_unit_cd, oper_std_qty, oper_conv_qty,
					dec_place, unit_conv_rnd_typ,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.loc_cd, m.oper_ptn, m.oper_cd, m.oper_seq,
					m.wg_cd,
					m.disp_seq,
					m.nmr_qty, m.dnm_qty,
					m.yield_oper_flg,
					m.oper_unit_cd, m.oper_std_qty, m.oper_conv_qty,
					m.dec_place, m.unit_conv_rnd_typ,
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm_oper m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l3.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_oper w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					)
				AND EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_dtl t
						WHERE	0=0
						AND t.calc_no = i_arg.calc_no
						AND t.calc_grp_cd = i_arg.calc_grp_cd
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						AND (t.wg_cd = m.wg_cd OR t.wg_cd = c_null_val OR m.wg_cd = c_null_val)
						AND t.oper_ptn = m.oper_ptn
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_OPER', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_bom t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_bom);
			FOR l4 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_bom (
					calc_no, calc_grp_cd,
					par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
					bom_ptn, oper_cd, oper_seq,
					chd_itm_cd, chd_itm_sub1, chd_itm_sub2, chd_itm_sub3,
					alt_grp_cd,
					expns_cd,
					wg_cd,
					disp_seq,
					par_rqmt_qty,
					chd_rqmt_qty, chd_base_qty,
					fxd_chd_rqmt_qty, chd_min_qty, chd_batch_qty,
					alt_itm_ratio,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT DISTINCT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.par_itm_cd, m.par_itm_sub1, m.par_itm_sub2, m.par_itm_sub3,
					m.bom_ptn, m.oper_cd, m.oper_seq,
					m.chd_itm_cd, m.chd_itm_sub1, m.chd_itm_sub2, m.chd_itm_sub3,
					m.alt_grp_cd,
					m.expns_cd,
					m.wg_cd,
					m.disp_seq,
					m.par_rqmt_qty,
					m.chd_rqmt_qty, m.chd_base_qty,
					m.fxd_chd_rqmt_qty, m.chd_min_qty, m.chd_batch_qty,
					m.alt_itm_ratio,
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_bom m
						, (
							SELECT DISTINCT s.itm_cd, s.itm_sub1, s.itm_sub2, s.itm_sub3, s.wg_cd, s.bom_ptn
							FROM mgt_calc_itm_dtl s
							WHERE s.calc_no = i_arg.calc_no
							AND s.calc_grp_cd = i_arg.calc_grp_cd
						) n
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l4.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND n.itm_cd = m.par_itm_cd
				AND n.itm_sub1 = m.par_itm_sub1
				AND n.itm_sub2 = m.par_itm_sub2
				AND n.itm_sub3 = m.par_itm_sub3
				AND (n.wg_cd = m.wg_cd OR n.wg_cd = c_null_val OR m.wg_cd = c_null_val)
				AND n.bom_ptn = m.bom_ptn
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_bom w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.par_itm_cd = m.par_itm_cd
						AND w.par_itm_sub1 = m.par_itm_sub1
						AND w.par_itm_sub2 = m.par_itm_sub2
						AND w.par_itm_sub3 = m.par_itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_BOM', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm_wk t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_itm_wk);
			FOR l5 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm_wk (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					loc_cd, oper_ptn, oper_cd, oper_seq,
					wk_cost_cd,
					wg_cd,
					base_qty,
					fxd_wk_cost, wk_cost,
					min_wk_cost, batch_wk_cost,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.loc_cd, m.oper_ptn, m.oper_cd, m.oper_seq,
					m.wk_cost_cd,
					m.wg_cd,
					m.base_qty,
					m.fxd_wk_cost, m.wk_cost,
					m.min_wk_cost, m.batch_wk_cost,
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm_wk m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l5.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_wk w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					)
				AND EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_dtl t
						WHERE	0=0
						AND t.calc_no = i_arg.calc_no
						AND t.calc_grp_cd = i_arg.calc_grp_cd
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						AND (t.wg_cd = m.wg_cd OR t.wg_cd = c_null_val OR m.wg_cd = c_null_val)
						AND (t.loc_cd = m.loc_cd OR m.loc_cd = c_null_val)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_WK', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm_purc t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_itm_purc);
			FOR l6 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm_purc (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					sppl_cd, wg_cd,
					base_qty,
					cur_cd, upri,
					base_cur_upri,
					cost_ratio,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.sppl_cd, m.wg_cd,
					m.base_qty,
					m.cur_cd, m.upri,
					mgpa_xchng$f_xchng(m.cur_cd, l_co.base_cur_cd,
							l_cur.upri_dec_place, l_co.xrate_rnd_typ, m.upri, 'MGT_ITM_PURC'),
					m.cost_ratio,
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm_purc m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l6.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_purc w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					)
				AND EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm t
						WHERE	0=0
						AND t.calc_no = i_arg.calc_no
						AND t.calc_grp_cd = i_arg.calc_grp_cd
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						AND (m.wg_cd = c_null_val OR t.wg_cd = m.wg_cd)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_PURC', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm_proc t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_itm_proc);
			FOR l7 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm_proc (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					sppl_cd, wg_cd,
					base_qty,
					cur_cd, upri,
					base_cur_upri,
					cost_ratio,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.sppl_cd, m.wg_cd,
					m.base_qty,
					m.cur_cd, m.upri,
					mgpa_xchng$f_xchng(m.cur_cd, l_co.base_cur_cd,
							l_cur.upri_dec_place, l_co.xrate_rnd_typ, m.upri, 'MGT_ITM_PROC'),
					m.cost_ratio,
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm_proc m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l7.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_proc w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					)
				AND EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm t
						WHERE	0=0
						AND t.calc_no = i_arg.calc_no
						AND t.calc_grp_cd = i_arg.calc_grp_cd
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						AND (m.wg_cd = c_null_val OR t.wg_cd = m.wg_cd)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_PROC', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm_prov t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_itm_prov);
			FOR l8 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm_prov (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					prsppl_cd,
					wg_cd,
					prov_typ,
					base_qty,
					cur_cd, upri,
					base_cur_upri,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.prsppl_cd,
					m.wg_cd,
					m.prov_typ,
					m.base_qty,
					m.cur_cd, m.upri,
					mgpa_xchng$f_xchng(m.cur_cd, l_co.base_cur_cd,
							l_cur.upri_dec_place, l_co.xrate_rnd_typ, m.upri, 'MGT_ITM_PROV'),
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm_prov m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l8.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_prov w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					)
				AND EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm t
						WHERE	0=0
						AND t.calc_no = i_arg.calc_no
						AND t.calc_grp_cd = i_arg.calc_grp_cd
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						AND (m.wg_cd = c_null_val OR t.wg_cd = m.wg_cd)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_PROV', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm_sls t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_itm_sls);
			FOR l9 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm_sls (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					dpt_cd,
					cst_cd,
					dlv_cd,
					dest_cd1, dest_cd2, dest_cd3,
					wg_cd,
					base_qty,
					cur_cd, upri,
					base_cur_upri,
					prio,
					alc_val1, alc_val2, alc_val3, alc_val4, alc_val5,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.dpt_cd,
					m.cst_cd,
					m.dlv_cd,
					m.dest_cd1, m.dest_cd2, m.dest_cd3,
					m.wg_cd,
					m.base_qty,
					m.cur_cd, m.upri,
					mgpa_xchng$f_xchng(m.cur_cd, l_co.base_cur_cd,
							l_cur.upri_dec_place, l_co.xrate_rnd_typ, m.upri, 'MGT_ITM_SLS'),
					m.prio,
					m.alc_val1, m.alc_val2, m.alc_val3, m.alc_val4, m.alc_val5,
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm_sls m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l9.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_sls w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					)
				AND EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm t
						WHERE	0=0
						AND t.calc_no = i_arg.calc_no
						AND t.calc_grp_cd = i_arg.calc_grp_cd
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						AND (m.wg_cd = c_null_val OR t.wg_cd = m.wg_cd)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_SLS', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_itm_fix t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_itm_fix);
			FOR l10 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_itm_fix (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					expns_cd,
					wg_cd,
					base_qty,
					std_upri,
					calc_ctg_cd,
					rmrks, sub_char1, sub_char2, sub_char3
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.expns_cd,
					m.wg_cd,
					m.base_qty,
					m.std_upri,
					m.calc_ctg_cd,
					m.rmrks, m.sub_char1, m.sub_char2, m.sub_char3
				FROM	mgt_itm_fix m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l10.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = c_null_val
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm_fix w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.itm_cd = m.itm_cd
						AND w.itm_sub1 = m.itm_sub1
						AND w.itm_sub2 = m.itm_sub2
						AND w.itm_sub3 = m.itm_sub3
						AND (w.wg_cd = c_null_val OR w.wg_cd = m.wg_cd)
					)
				AND EXISTS (
						SELECT	'X'
						FROM	mgt_calc_itm t
						WHERE	0=0
						AND t.calc_no = i_arg.calc_no
						AND t.calc_grp_cd = i_arg.calc_grp_cd
						AND t.itm_cd = m.itm_cd
						AND t.itm_sub1 = m.itm_sub1
						AND t.itm_sub2 = m.itm_sub2
						AND t.itm_sub3 = m.itm_sub3
						AND (m.wg_cd = c_null_val OR t.wg_cd = m.wg_cd)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_FIX', l_cnt::VARCHAR);
			COMMIT;

			l_cnt := 0;
			DELETE FROM mgt_calc_std_alc_rate t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_alc_rate_m);
			FOR l11 IN
				SELECT	w.*
				FROM	mgpa_sca_prep$cursor_ctg_list() w
			LOOP
				INSERT INTO mgt_calc_std_alc_rate (
					calc_no, calc_grp_cd,
					alc_ac_cd,
					dpt_cd, loc_cd, oper_cd,
					bp_cd, ctg_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					wg_cd,
					alc_rate,
					alc_ptn_cd,
					expns_cd,
					calc_ctg_cd
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					m.alc_ac_cd,
					m.dpt_cd, m.loc_cd, m.oper_cd,
					m.bp_cd, m.ctg_cd,
					m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3,
					m.wg_cd,
					m.alc_rate,
					CASE WHEN m.fix_flg = '1' THEN m.fix_alc_ptn_cd ELSE NULL END,
					CASE WHEN m.fix_flg = '1' THEN m.fix_expns_cd ELSE NULL END,
					m.calc_ctg_cd
				FROM	mgt_std_alc_rate m
				WHERE	0=0
				AND m.term = i_arg.term
				AND m.calc_ctg_cd = l11.calc_ctg_cd
				AND m.non_calc_flg = '0'
				AND (
					m.wg_cd = i_arg.runtime_wg_cd
					OR
					i_arg.runtime_wg_cd IS NULL
						AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = m.wg_cd
						)
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgt_calc_std_alc_rate w
						WHERE	0=0
						AND w.calc_no = i_arg.calc_no
						AND w.calc_grp_cd = i_arg.calc_grp_cd
						AND w.alc_ac_cd = m.alc_ac_cd
						AND COALESCE(w.dpt_cd, c_null_val) = COALESCE(m.dpt_cd, c_null_val)
						AND COALESCE(w.loc_cd, c_null_val) = COALESCE(m.loc_cd, c_null_val)
						AND COALESCE(w.oper_cd, c_null_val) = COALESCE(m.oper_cd, c_null_val)
						AND COALESCE(w.bp_cd, c_null_val) = COALESCE(m.bp_cd, c_null_val)
						AND COALESCE(w.ctg_cd, c_null_val) = COALESCE(m.ctg_cd, c_null_val)
						AND COALESCE(w.itm_cd, c_null_val) = COALESCE(m.itm_cd, c_null_val)
						AND COALESCE(w.itm_sub1, c_null_val) = COALESCE(m.itm_sub1, c_null_val)
						AND COALESCE(w.itm_sub2, c_null_val) = COALESCE(m.itm_sub2, c_null_val)
						AND COALESCE(w.itm_sub3, c_null_val) = COALESCE(m.itm_sub3, c_null_val)
						AND w.wg_cd = m.wg_cd
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END LOOP;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_STD_ALC_RATE', l_cnt::VARCHAR);
			COMMIT;

			IF i_arg.exp_calc_typ != c_exp_calc_rqmt OR i_arg.sa_typ = c_sa_act THEN
				EXIT SKIP_RQMT;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_rqmt t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_rqmt);
			INSERT INTO mgt_calc_rqmt (
				calc_no, calc_grp_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				asst_typ,
				qty
				)
			SELECT
				i_arg.calc_no, i_arg.calc_grp_cd,
				COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
				t1.ym,
				t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.asst_typ,
				SUM(mgpa_unit$f_get_conv_qty(t1.qty, m1.conv_base_qty, m1.conv_qty, m2.dec_place, m2.rnd_typ))
			FROM	mgw_calc_ctg w1, mgt_pln_rqmt t1
				LEFT OUTER JOIN mavm_itm_unit m1
					ON (t1.itm_cd = m1.itm_cd
					AND t1.itm_sub1 = m1.itm_sub1
					AND t1.itm_sub2 = m1.itm_sub2
					AND t1.itm_sub3 = m1.itm_sub3
					AND t1.unit_cd = m1.unit_cd)
				LEFT OUTER JOIN mam_itm m2
					ON (t1.itm_cd = m2.itm_cd
					AND t1.itm_sub1 = m2.itm_sub1
					AND t1.itm_sub2 = m2.itm_sub2
					AND t1.itm_sub3 = m2.itm_sub3)
			WHERE	0=0
			AND w1.calc_ctg_cd = t1.calc_ctg_cd
			AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
			AND EXISTS (
					SELECT	'X'
					FROM	mam_grp_wg w2
					WHERE	0=0
					AND w2.calc_grp_cd = i_arg.calc_grp_cd
					AND w2.wg_cd = t1.wg_cd
				)
			AND (
				l_itm_cnt = 0
				OR EXISTS (
					SELECT	'X'
					FROM	mgw_usr_itm x
					WHERE	0=0
					AND x.itm_cd = t1.itm_cd
					AND x.itm_sub1 = t1.itm_sub1
					AND x.itm_sub2 = t1.itm_sub2
					AND x.itm_sub3 = t1.itm_sub3
					)
				)
			GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
				t1.ym,
				t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.asst_typ;
			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_RQMT', l_cnt::VARCHAR);
			COMMIT;

		END;

		<<SKIP_PROD_PURC>>
		BEGIN
			DELETE FROM mgw_calc_itm_mfg_inst;

			IF i_arg.exp_calc_typ = c_exp_calc_rqmt THEN
				EXIT SKIP_PROD_PURC;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_mfg t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_mfg);
			IF i_arg.sa_typ = c_sa_pln THEN
				INSERT INTO mgt_calc_mfg (
					calc_no, calc_grp_cd,
					wg_cd,
					ym, ac_dt,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					oper_act_no, oper_cd, oper_seq,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					loc_cd, str_ln_cd,
					ac_slip_typ, ac_rsn_cd,
					expns_cd,
					asst_typ, mng_dpt_cd,
					cur_cd,
					xrate,
					qty,
					amt,
					cur_amt,
					mfg_per, mfg_cost_ratio,
					alc_val1, alc_val2, alc_val3, alc_val4, alc_val5
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					t.wg_cd,
					t.ym, t.ym,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					MAX(t.pln_mfg_key), c_null_val,
					c_null_val, NULL, NULL,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.loc_cd, t.str_ln_cd,
					t.ac_slip_typ, NULL,
					NULL,
					t.asst_typ, t.mng_dpt_cd,
					t.cur_cd,
					t.xrate,
					SUM(t.qty),
					SUM(mgpa_xchng$f_xchng2(t.cur_cd, l_co.base_cur_cd, t.xrate,
								l_cur.amt_dec_place, l_co.xrate_rnd_typ, t.cur_amt, 'MGT_PLN_MFG')),
					SUM(t.cur_amt),
					100, 1,
					NULL, NULL, NULL, NULL, NULL
				FROM	(
					SELECT
						COALESCE(i_arg.runtime_wg_cd, t1.wg_cd) AS wg_cd,
						t1.ym,
						t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
						t1.pln_mfg_key,
						t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
						t1.loc_cd, t1.str_ln_cd,
						CASE WHEN m3.sppl_cd IS NULL THEN c_ac_slip_mfg ELSE c_ac_slip_purc END AS ac_slip_typ,
						t1.asst_typ, t1.mng_dpt_cd,
						mgpa_unit$f_get_conv_qty(t1.qty, m1.conv_base_qty, m1.conv_qty, m2.dec_place, m2.rnd_typ) AS qty,
						t1.cur_cd,
						t1.amt AS cur_amt,
						mgpa_xchng$f_get_rate(t1.cur_cd, l_co.base_cur_cd) AS xrate
					FROM	mgw_calc_ctg w1, mgt_pln_mfg t1
						LEFT OUTER JOIN mavm_itm_unit m1
							ON (t1.itm_cd = m1.itm_cd
							AND t1.itm_sub1 = m1.itm_sub1
							AND t1.itm_sub2 = m1.itm_sub2
							AND t1.itm_sub3 = m1.itm_sub3
							AND t1.unit_cd = m1.unit_cd)
						LEFT OUTER JOIN mam_itm m2
							ON (t1.itm_cd = m2.itm_cd
							AND t1.itm_sub1 = m2.itm_sub1
							AND t1.itm_sub2 = m2.itm_sub2
							AND t1.itm_sub3 = m2.itm_sub3)
						LEFT OUTER JOIN mam_loc m3
							ON (t1.loc_cd = m3.loc_cd)
					WHERE	0=0
					AND w1.calc_ctg_cd = t1.calc_ctg_cd
					AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
					AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = t1.wg_cd
						)
					AND (
						l_itm_cnt = 0
						OR EXISTS (
							SELECT	'X'
							FROM	mgw_usr_itm x
							WHERE	0=0
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
							)
						)
					) t
				WHERE	0=0
				GROUP BY t.wg_cd,
					t.ym,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.loc_cd, t.str_ln_cd,
					t.ac_slip_typ,
					t.asst_typ, t.mng_dpt_cd,
					t.cur_cd, t.xrate;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;

				INSERT INTO mgw_calc_itm_mfg_inst (
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					wg_cd,
					ym, mng_dpt_cd,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					loc_cd, str_ln_cd,
					sppl_cd,
					po_no, iv_no, slo_no,
					asst_typ,
					qty
					)
				SELECT
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					MAX(t1.pln_mfg_key), c_null_val,
					t1.wg_cd,
					t1.ym, t1.mng_dpt_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.loc_cd, t1.str_ln_cd,
					m3.sppl_cd,
					NULL, NULL, NULL,
					t1.asst_typ,
					SUM(mgpa_unit$f_get_conv_qty(t1.qty, m1.conv_base_qty, m1.conv_qty, m2.dec_place, m2.rnd_typ))
				FROM	mgw_calc_ctg w1, mgt_pln_mfg t1
					LEFT OUTER JOIN mavm_itm_unit m1
						ON (t1.itm_cd = m1.itm_cd
						AND t1.itm_sub1 = m1.itm_sub1
						AND t1.itm_sub2 = m1.itm_sub2
						AND t1.itm_sub3 = m1.itm_sub3
						AND t1.unit_cd = m1.unit_cd)
					LEFT OUTER JOIN mam_itm m2
						ON (t1.itm_cd = m2.itm_cd
						AND t1.itm_sub1 = m2.itm_sub1
						AND t1.itm_sub2 = m2.itm_sub2
						AND t1.itm_sub3 = m2.itm_sub3)
					LEFT OUTER JOIN mam_loc m3
						ON (t1.loc_cd = m3.loc_cd)
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					)
				GROUP BY
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.wg_cd,
					t1.ym, t1.mng_dpt_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.loc_cd, t1.str_ln_cd,
					m3.sppl_cd,
					t1.asst_typ;

			ELSE
				INSERT INTO mgt_calc_mfg (
					calc_no, calc_grp_cd,
					wg_cd,
					ym, ac_dt,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					oper_act_no, oper_cd, oper_seq,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					loc_cd, str_ln_cd,
					ac_slip_typ, ac_rsn_cd,
					expns_cd,
					cur_cd,
					xrate,
					qty,
					amt,
					cur_amt,
					mfg_per, mfg_cost_ratio,
					alc_val1, alc_val2, alc_val3, alc_val4, alc_val5
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ac_dt,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.itm_mfg_inst_no, t1.mfg_act_no,
					t1.oper_act_no, t2.oper_cd, t2.oper_seq,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.loc_cd, t1.str_ln_cd,
					t1.ac_slip_typ, t1.ac_rsn_cd,
					t1.expns_cd,
					t1.trd_cur_cd,
					t1.xrate,
					SUM(t1.qty),
					SUM(t1.amt),
					SUM(t1.trd_cur_amt),
					MAX(t1.mfg_per),
					MAX(COALESCE(t1.mfg_cost_ratio, 1)),
					SUM(t1.alc_val1), SUM(t1.alc_val2), SUM(t1.alc_val3), SUM(t1.alc_val4), SUM(t1.alc_val5)
				FROM	mgw_calc_ctg w1, mgt_act_mfg t1
					LEFT OUTER JOIN mgt_inst_oper t2
						ON (t1.calc_ctg_cd = t2.calc_ctg_cd
						AND t1.itm_cd = t2.itm_cd
						AND t1.itm_sub1 = t2.itm_sub1
						AND t1.itm_sub2 = t2.itm_sub2
						AND t1.itm_sub3 = t2.itm_sub3
						AND t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
						AND t1.mfg_act_no = t2.mfg_act_no
						AND t1.oper_act_no = t2.oper_act_no)
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					)
				GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd), t1.ym, t1.ac_dt,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.itm_mfg_inst_no, t1.mfg_act_no,
					t1.oper_act_no, t2.oper_cd, t2.oper_seq,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.loc_cd, t1.str_ln_cd,
					t1.ac_slip_typ, t1.ac_rsn_cd,
					t1.expns_cd,
					t1.trd_cur_cd, t1.xrate;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;

				INSERT INTO mgw_calc_itm_mfg_inst (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no
					)
				SELECT DISTINCT
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.itm_mfg_inst_no,
					t.mfg_act_no
				FROM	mgt_calc_mfg t
				WHERE	0=0
				AND t.calc_no = i_arg.calc_no
				AND t.calc_grp_cd = i_arg.calc_grp_cd;
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_MFG', l_cnt::VARCHAR);
			COMMIT;

			IF i_arg.exp_calc_typ = c_exp_calc_mfg THEN
				EXIT SKIP_PROD_PURC;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_purc t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_purc);
			IF i_arg.sa_typ = c_sa_pln THEN
				INSERT INTO mgt_calc_purc (
					calc_no, calc_grp_cd,
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
					expns_cd,
					cur_cd,
					xrate,
					qty,
					amt,
					cur_amt,
					alc_val1, alc_val2, alc_val3, alc_val4, alc_val5
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					t.wg_cd,
					t.ym, t.ym,
					t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.sppl_cd,
					NULL, NULL, NULL,
					t.alc_dpt_cd,
					c_ac_slip_purc, NULL,
					t.asst_typ,
					NULL,
					t.cur_cd,
					t.xrate,
					SUM(t.QTY),
					SUM(mgpa_xchng$f_xchng2(t.cur_cd, l_co.base_cur_cd, t.xrate,
								l_cur.amt_dec_place, l_co.xrate_rnd_typ, t.cur_amt, 'MGT_PLN_PURC')),
					SUM(t.cur_amt),
					NULL, NULL, NULL, NULL, NULL
				FROM	(
					SELECT
						COALESCE(i_arg.runtime_wg_cd, t1.wg_cd) AS wg_cd,
						t1.ym,
						t1.mng_dpt_cd,
						t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
						t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
						t1.sppl_cd,
						t1.alc_dpt_cd,
						t1.asst_typ,
						mgpa_unit$f_get_conv_qty(t1.qty, m1.conv_base_qty, m1.conv_qty, m2.dec_place, m2.rnd_typ) AS qty,
						t1.cur_cd,
						t1.amt AS cur_amt,
						mgpa_xchng$f_get_rate(t1.cur_cd, l_co.base_cur_cd) AS xrate
					FROM	mgw_calc_ctg w1, mgt_pln_purc t1
						LEFT OUTER JOIN mavm_itm_unit m1
							ON (t1.itm_cd = m1.itm_cd
							AND t1.itm_sub1 = m1.itm_sub1
							AND t1.itm_sub2 = m1.itm_sub2
							AND t1.itm_sub3 = m1.itm_sub3
							AND t1.unit_cd = m1.unit_cd)
						LEFT OUTER JOIN mam_itm m2
							ON (t1.itm_cd = m2.itm_cd
							AND t1.itm_sub1 = m2.itm_sub1
							AND t1.itm_sub2 = m2.itm_sub2
							AND t1.itm_sub3 = m2.itm_sub3)
					WHERE	0=0
					AND w1.calc_ctg_cd = t1.calc_ctg_cd
					AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
					AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = t1.wg_cd
						)
					AND (
						l_itm_cnt = 0
						OR EXISTS (
							SELECT	'X'
							FROM	mgw_usr_itm x
							WHERE	0=0
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
							)
						)
					) t
				WHERE	0=0
				GROUP BY t.wg_cd,
					t.ym,
					t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.sppl_cd,
					t.alc_dpt_cd,
					t.asst_typ,
					t.cur_cd, t.xrate;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			ELSE
				INSERT INTO mgt_calc_purc (
					calc_no, calc_grp_cd,
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
					expns_cd,
					cur_cd,
					xrate,
					qty,
					amt,
					cur_amt,
					alc_val1, alc_val2, alc_val3, alc_val4, alc_val5
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ac_dt,
					t1.mng_dpt_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.sppl_cd, t1.po_no, t1.slo_no, t1.iv_no,
					t1.alc_dpt_cd,
					t1.ac_slip_typ, t1.ac_rsn_cd,
					t1.asst_typ,
					t1.expns_cd,
					t1.trd_cur_cd,
					t1.xrate,
					SUM(t1.qty),
					SUM(t1.amt),
					SUM(t1.trd_cur_amt),
					SUM(t1.alc_val1), SUM(t1.alc_val2), SUM(t1.alc_val3), SUM(t1.alc_val4), SUM(t1.alc_val5)
				FROM	mgw_calc_ctg w1, mgt_act_purc t1
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					)
				GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ac_dt,
					t1.mng_dpt_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.sppl_cd, t1.po_no, t1.slo_no, t1.iv_no,
					t1.alc_dpt_cd,
					t1.ac_slip_typ, t1.ac_rsn_cd,
					t1.asst_typ,
					t1.expns_cd,
					t1.trd_cur_cd, t1.xrate;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_PURC', l_cnt::VARCHAR);
			COMMIT;

		END;

		<<SKIP_WK>>
		BEGIN
			IF i_arg.wk_calc_flg = '1' OR i_arg.exp_calc_typ = c_exp_calc_rqmt THEN
				EXIT SKIP_WK;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_wk t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_wk);
			IF i_arg.sa_typ = c_sa_pln THEN
				INSERT INTO mgw_calc_itm_mfg_inst (
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					wg_cd,
					ym, mng_dpt_cd,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					loc_cd, str_ln_cd,
					sppl_cd,
					po_no, iv_no, slo_no,
					asst_typ,
					qty
					)
				SELECT
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					CONCAT_WS('', 'W', MAX(t1.pln_itm_wk_key)), c_null_val,
					t1.wg_cd,
					t1.ym, t1.mng_dpt_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.loc_cd, t1.str_ln_cd,
					m1.sppl_cd,
					NULL, NULL, NULL,
					c_asst_prod,
					0
				FROM	mgw_calc_ctg w1, mgt_pln_itm_wk t1
					LEFT OUTER JOIN mam_loc m1 ON (t1.loc_cd = m1.loc_cd)
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgw_calc_itm_mfg_inst x
						WHERE	0=0
						AND x.wg_cd = t1.wg_cd
						AND x.ym = t1.ym
						AND x.mng_dpt_cd = t1.mng_dpt_cd
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						AND x.lot_no = t1.lot_no
						AND x.sublot_no = t1.sublot_no
						AND x.sno1 = t1.sno1
						AND x.sno2 = t1.sno2
						AND x.sno3 = t1.sno3
						AND x.sno4 = t1.sno4
						AND x.loc_cd = t1.loc_cd
						AND x.str_ln_cd = t1.str_ln_cd
						AND x.asst_typ = c_asst_prod
						)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					)
				GROUP BY t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.wg_cd,
					t1.ym, t1.mng_dpt_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.loc_cd, t1.str_ln_cd,
					m1.sppl_cd;

				INSERT INTO mgt_calc_wk (
					calc_no, calc_grp_cd,
					wg_cd,
					ym, ac_dt,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					oper_act_no, oper_cd, oper_seq,
					loc_cd, str_ln_cd,
					wk_cost_cd, wk_rsn_cd,
					wk_cost
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ym,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					MAX(t2.itm_mfg_inst_no), MAX(t2.mfg_act_no),
					c_null_val, t1.oper_cd, t1.oper_seq,
					t1.loc_cd, t1.str_ln_cd,
					t1.wk_cost_cd, NULL,
					SUM(t1.wk_cost)
				FROM	mgw_calc_ctg w1, mgt_pln_itm_wk t1, mgw_calc_itm_mfg_inst t2
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND t1.wg_cd = t2.wg_cd
				AND t1.ym = t2.ym
				AND t1.mng_dpt_cd = t2.mng_dpt_cd
				AND t1.itm_cd = t2.itm_cd
				AND t1.itm_sub1 = t2.itm_sub1
				AND t1.itm_sub2 = t2.itm_sub2
				AND t1.itm_sub3 = t2.itm_sub3
				AND t1.lot_no = t2.lot_no
				AND t1.sublot_no = t2.sublot_no
				AND t1.sno1 = t2.sno1
				AND t1.sno2 = t2.sno2
				AND t1.sno3 = t2.sno3
				AND t1.sno4 = t2.sno4
				AND t1.loc_cd = t2.loc_cd
				AND t1.str_ln_cd = t2.str_ln_cd
				AND c_asst_prod = t2.asst_typ
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					)
				GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd), t1.ym,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.oper_cd, t1.oper_seq,
					t1.loc_cd, t1.str_ln_cd,
					t1.wk_cost_cd;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			ELSE
				INSERT INTO mgt_calc_wk (
					calc_no, calc_grp_cd,
					wg_cd,
					ym, ac_dt,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					oper_act_no, oper_cd, oper_seq,
					loc_cd, str_ln_cd,
					wk_cost_cd, wk_rsn_cd,
					wk_cost
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ac_dt,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.itm_mfg_inst_no, t1.mfg_act_no,
					t1.oper_act_no, t2.oper_cd, t2.oper_seq,
					t1.loc_cd, t1.str_ln_cd,
					t1.wk_cost_cd, t1.wk_rsn_cd,
					SUM(t1.wk_cost)
				FROM	mgw_calc_ctg w1, mgt_act_inst_wk t1
					LEFT OUTER JOIN mgt_inst_oper t2
						ON (t1.calc_ctg_cd = t2.calc_ctg_cd
						AND t1.itm_cd = t2.itm_cd
						AND t1.itm_sub1 = t2.itm_sub1
						AND t1.itm_sub2 = t2.itm_sub2
						AND t1.itm_sub3 = t2.itm_sub3
						AND t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
						AND t1.mfg_act_no = t2.mfg_act_no
						AND t1.oper_act_no = t2.oper_act_no)
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					)
				GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd), t1.ym, t1.ac_dt,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.itm_mfg_inst_no, t1.mfg_act_no,
					t1.oper_act_no, t2.oper_cd, t2.oper_seq,
					t1.loc_cd, t1.str_ln_cd,
					t1.wk_cost_cd, t1.wk_rsn_cd;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;

				INSERT INTO mgw_calc_itm_mfg_inst (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no
					)
				SELECT
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					x.itm_mfg_inst_no,
					x.mfg_act_no
				FROM (
					SELECT DISTINCT
						t.itm_cd,
						t.itm_sub1,
						t.itm_sub2,
						t.itm_sub3,
						t.itm_mfg_inst_no,
						t.mfg_act_no
					FROM	mgt_calc_wk t
					WHERE	0=0
					AND t.calc_no = i_arg.calc_no
					AND t.calc_grp_cd = i_arg.calc_grp_cd
					) x
				WHERE 0=0
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgw_calc_itm_mfg_inst w
						WHERE	0=0
						AND w.itm_cd = x.itm_cd
						AND w.itm_sub1 = x.itm_sub1
						AND w.itm_sub2 = x.itm_sub2
						AND w.itm_sub3 = x.itm_sub3
						AND w.itm_mfg_inst_no = x.itm_mfg_inst_no
						AND w.mfg_act_no = x.mfg_act_no
						);
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_WK', l_cnt::VARCHAR);
			COMMIT;

		END;

		<<SKIP_INPT>>
		BEGIN
			l_cnt := 0;
			DELETE FROM mgt_calc_other_wk t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_other_wk);
			IF i_arg.sa_typ = c_sa_pln THEN
				INSERT INTO mgt_calc_other_wk (
					calc_no, calc_grp_cd,
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
					i_arg.calc_no, i_arg.calc_grp_cd,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ym,
					t1.dpt_cd, t1.ctg_cd,
					t1.loc_cd, t1.oper_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.wk_cost_cd,
					NULL,
					SUM(t1.wk_cost)
				FROM	mgw_calc_ctg w1, mgt_pln_other_wk t1
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd), t1.ym,
					t1.dpt_cd, t1.ctg_cd,
					t1.loc_cd, t1.oper_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.wk_cost_cd;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			ELSE
				INSERT INTO mgt_calc_other_wk (
					calc_no, calc_grp_cd,
					wg_cd,
					ym, ac_dt,
					dpt_cd, ctg_cd,
					loc_cd, oper_cd,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					wk_cost_cd, wk_rsn_cd,
					wk_cost
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ac_dt,
					t1.dpt_cd, t1.ctg_cd,
					t1.loc_cd, t1.oper_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.wk_cost_cd, t1.wk_rsn_cd,
					SUM(t1.wk_cost)
				FROM	mgw_calc_ctg w1, mgt_act_other_wk t1
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd), t1.ym, t1.ac_dt,
					t1.dpt_cd, t1.ctg_cd,
					t1.loc_cd, t1.oper_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.wk_cost_cd,
					t1.wk_rsn_cd;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_OTHER_WK', l_cnt::VARCHAR);
			COMMIT;

			IF i_arg.INPT_CALC_FLG = '1' OR i_arg.exp_calc_typ = c_exp_calc_rqmt THEN
				EXIT SKIP_INPT;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_inpt t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_inpt);
			IF i_arg.sa_typ = c_sa_pln THEN
				INSERT INTO mgw_calc_itm_mfg_inst (
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					wg_cd,
					ym, mng_dpt_cd,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					loc_cd, str_ln_cd,
					sppl_cd,
					po_no, iv_no, slo_no,
					asst_typ,
					qty
					)
				SELECT
					t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
					CONCAT_WS('', 'W', MAX(t1.pln_inpt_key)), c_null_val,
					t1.wg_cd,
					t1.ym, t1.mng_dpt_cd,
					t1.par_lot_no, t1.par_sublot_no, t1.par_sno1, t1.par_sno2, t1.par_sno3, t1.par_sno4,
					t1.loc_cd, t1.str_ln_cd,
					m1.sppl_cd,
					NULL, NULL, NULL,
					COALESCE(t1.asst_typ, c_asst_prod),
					0
				FROM	mgw_calc_ctg w1, mgt_pln_inpt t1
					LEFT OUTER JOIN mam_loc m1 ON (t1.loc_cd = m1.loc_cd)
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgw_calc_itm_mfg_inst x
						WHERE	0=0
						AND x.wg_cd = t1.wg_cd
						AND x.ym = t1.ym
						AND x.mng_dpt_cd = t1.mng_dpt_cd
						AND x.itm_cd = t1.par_itm_cd
						AND x.itm_sub1 = t1.par_itm_sub1
						AND x.itm_sub2 = t1.par_itm_sub2
						AND x.itm_sub3 = t1.par_itm_sub3
						AND x.lot_no = t1.par_lot_no
						AND x.sublot_no = t1.par_sublot_no
						AND x.sno1 = t1.par_sno1
						AND x.sno2 = t1.par_sno2
						AND x.sno3 = t1.par_sno3
						AND x.sno4 = t1.par_sno4
						AND x.loc_cd = t1.loc_cd
						AND x.str_ln_cd = t1.str_ln_cd
						AND x.asst_typ = COALESCE(t1.asst_typ, c_asst_prod)
						)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.par_itm_cd
						AND x.itm_sub1 = t1.par_itm_sub1
						AND x.itm_sub2 = t1.par_itm_sub2
						AND x.itm_sub3 = t1.par_itm_sub3
						)
					)
				GROUP BY t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
					t1.wg_cd,
					t1.ym, t1.mng_dpt_cd,
					t1.par_lot_no, t1.par_sublot_no, t1.par_sno1, t1.par_sno2, t1.par_sno3, t1.par_sno4,
					t1.loc_cd, t1.str_ln_cd,
					m1.sppl_cd,
					COALESCE(t1.asst_typ, c_asst_prod);

				INSERT INTO mgt_calc_inpt (
					calc_no, calc_grp_cd,
					act_inpt_id, act_inpt_id_sub,
					wg_cd,
					ym, ac_dt,
					par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					oper_act_no, oper_cd, oper_seq,
					loc_cd, str_ln_cd,
					mng_dpt_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					ac_slip_typ, ac_rsn_cd,
					stk_bp_cd,
					asst_typ,
					bp_cd,
					qty,
					amt,
					cur_cd,
					cur_amt,
					xrate,
					rec_eval_typ,
					expns_cd
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					MAX(t.pln_inpt_key), '0',
					t.wg_cd,
					t.ym, t.ym,
					t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3,
					MAX(t.itm_mfg_inst_no), MAX(t.mfg_act_no),
					c_null_val, t.oper_cd, t.oper_seq,
					t.loc_cd, t.str_ln_cd,
					t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.ac_slip_typ, NULL,
					t.stk_bp_cd,
					t.asst_typ,
					t.bp_cd,
					SUM(t.qty),
					SUM(mgpa_xchng$f_xchng2(t.cur_cd, l_co.base_cur_cd, t.xrate,
								l_cur.amt_dec_place, l_co.xrate_rnd_typ, t.cur_amt, 'MGT_PLN_INPT')),
					t.cur_cd,
					SUM(t.cur_amt),
					t.xrate,
					NULL,
					t.expns_cd
				FROM	(
					SELECT
						t1.pln_inpt_key,
						COALESCE(i_arg.runtime_wg_cd, t1.wg_cd) AS wg_cd,
						t1.ym,
						t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
						t2.itm_mfg_inst_no, t2.mfg_act_no,
						t1.oper_cd, t1.oper_seq,
						t1.loc_cd, t1.str_ln_cd,
						COALESCE(t1.inpt_dpt_cd, t1.mng_dpt_cd) AS mng_dpt_cd,
						t1.par_lot_no, t1.par_sublot_no, t1.par_sno1, t1.par_sno2, t1.par_sno3, t1.par_sno4,
						t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
						t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
						CASE
							WHEN t1.prov_typ = c_prov_ss THEN c_ac_slip_in_ss
							WHEN m2.asset_mng_typ = c_asset_mng_not_mng THEN c_ac_slip_purc_xpns
							WHEN t1.prov_typ = c_prov_onr THEN c_ac_slip_in_onr
							WHEN t1.prov_typ = c_prov_ffr THEN c_ac_slip_input
							WHEN t1.qty < 0 THEN c_ac_slip_byprod
							ELSE c_ac_slip_input
						END AS ac_slip_typ,
						t1.stk_bp_cd,
						CASE t1.prov_typ
							WHEN c_prov_onr THEN 
								CASE WHEN m3.repurc_obli_flg = '1' THEN c_asst_prod ELSE c_asst_oth END
							WHEN c_prov_ss THEN c_asst_oth
							ELSE c_asst_prod
						END AS asst_typ,
						CASE WHEN t1.prov_typ = c_prov_onr AND m3.repurc_obli_flg = '1' THEN t1.stk_bp_cd
							ELSE NULL
						END bp_cd,
						mgpa_unit$f_get_conv_qty(t1.qty, m1.conv_base_qty, m1.conv_qty, m2.dec_place, m2.rnd_typ) AS qty,
						t1.cur_cd,
						t1.amt AS cur_amt,
						mgpa_xchng$f_get_rate(t1.cur_cd, l_co.base_cur_cd) AS xrate,
						t1.expns_cd
					FROM	mgw_calc_ctg w1, mgt_pln_inpt t1
						INNER JOIN mgw_calc_itm_mfg_inst t2 ON
							(0=0
							AND t1.wg_cd = t2.wg_cd
							AND t1.ym = t2.ym
							AND t1.mng_dpt_cd = t2.mng_dpt_cd
							AND t1.par_itm_cd = t2.itm_cd
							AND t1.par_itm_sub1 = t2.itm_sub1
							AND t1.par_itm_sub2 = t2.itm_sub2
							AND t1.par_itm_sub3 = t2.itm_sub3
							AND t1.par_lot_no = t2.lot_no
							AND t1.par_sublot_no = t2.sublot_no
							AND t1.par_sno1 = t2.sno1
							AND t1.par_sno2 = t2.sno2
							AND t1.par_sno3 = t2.sno3
							AND t1.par_sno4 = t2.sno4
							AND t1.loc_cd = t2.loc_cd
							AND t1.str_ln_cd = t2.str_ln_cd
							AND COALESCE(t1.asst_typ, c_asst_prod) = t2.asst_typ
							)
						LEFT OUTER JOIN mavm_itm_unit m1
							ON (t1.itm_cd = m1.itm_cd
							AND t1.itm_sub1 = m1.itm_sub1
							AND t1.itm_sub2 = m1.itm_sub2
							AND t1.itm_sub3 = m1.itm_sub3
							AND t1.unit_cd = m1.unit_cd)
						LEFT OUTER JOIN mam_itm m2
							ON (t1.itm_cd = m2.itm_cd
							AND t1.itm_sub1 = m2.itm_sub1
							AND t1.itm_sub2 = m2.itm_sub2
							AND t1.itm_sub3 = m2.itm_sub3)
						LEFT OUTER JOIN mam_bp m3 ON (t1.stk_bp_cd = m3.bp_cd)
					WHERE	0=0
					AND w1.calc_ctg_cd = t1.calc_ctg_cd
					AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
					AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = t1.wg_cd
						)
					AND (
						l_itm_cnt = 0
						OR EXISTS (
							SELECT	'X'
							FROM	mgw_usr_itm x
							WHERE	0=0
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
							)
						)
					) t
				WHERE	0=0
				GROUP BY t.wg_cd, t.ym,
					t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3,
					t.par_lot_no, t.par_sublot_no, t.par_sno1, t.par_sno2, t.par_sno3, t.par_sno4,
					t.oper_cd, t.oper_seq,
					t.loc_cd, t.str_ln_cd,
					t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.ac_slip_typ,
					t.stk_bp_cd,
					t.asst_typ,
					t.bp_cd,
					t.expns_cd,
					t.cur_cd, t.xrate;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			ELSE
				INSERT INTO mgt_calc_inpt (
					calc_no, calc_grp_cd,
					act_inpt_id, act_inpt_id_sub,
					wg_cd,
					ym, ac_dt,
					par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					oper_act_no, oper_cd, oper_seq,
					loc_cd, str_ln_cd,
					mng_dpt_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					ac_slip_typ, ac_rsn_cd,
					stk_bp_cd, asst_typ,
					bp_cd,
					qty,
					amt,
					cur_cd,
					cur_amt,
					xrate,
					rec_eval_typ,
					expns_cd,
					eval_loop_flg, zero_effect_flg
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					t1.act_inpt_id, t1.act_inpt_id_sub,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ac_dt,
					t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
					t1.itm_mfg_inst_no, t1.mfg_act_no,
					t1.oper_act_no, t2.oper_cd, t2.oper_seq,
					t1.loc_cd, t1.str_ln_cd,
					t1.mng_dpt_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.ac_slip_typ, t1.ac_rsn_cd,
					t1.stk_bp_cd, t1.asst_typ,
					t1.bp_cd,
					t1.qty, t1.amt,
					t1.trd_cur_cd, t1.trd_cur_amt,
					t1.xrate,
					t1.rec_eval_typ,
					t1.expns_cd,
					t1.eval_loop_flg, t1.zero_effect_flg
				FROM	mgw_calc_ctg w1, mgt_act_inpt t1
					LEFT OUTER JOIN mgt_inst_oper t2
						ON (t1.calc_ctg_cd = t2.calc_ctg_cd
						AND t1.par_itm_cd = t2.itm_cd
						AND t1.par_itm_sub1 = t2.itm_sub1
						AND t1.par_itm_sub2 = t2.itm_sub2
						AND t1.par_itm_sub3 = t2.itm_sub3
						AND t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
						AND t1.mfg_act_no = t2.mfg_act_no
						AND t1.oper_act_no = t2.oper_act_no)
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;

				INSERT INTO mgw_calc_itm_mfg_inst (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no
					)
				SELECT
					x.par_itm_cd,
					x.par_itm_sub1,
					x.par_itm_sub2,
					x.par_itm_sub3,
					x.itm_mfg_inst_no,
					x.mfg_act_no
				FROM (
					SELECT DISTINCT
						t.par_itm_cd,
						t.par_itm_sub1,
						t.par_itm_sub2,
						t.par_itm_sub3,
						t.itm_mfg_inst_no,
						t.mfg_act_no
					FROM	mgt_calc_inpt t
					WHERE	0=0
					AND t.calc_no = i_arg.calc_no
					AND t.calc_grp_cd = i_arg.calc_grp_cd
					) x
				WHERE 0=0
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgw_calc_itm_mfg_inst w
						WHERE	0=0
						AND w.itm_cd = x.par_itm_cd
						AND w.itm_sub1 = x.par_itm_sub1
						AND w.itm_sub2 = x.par_itm_sub2
						AND w.itm_sub3 = x.par_itm_sub3
						AND w.itm_mfg_inst_no = x.itm_mfg_inst_no
						AND w.mfg_act_no = x.mfg_act_no
						);
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_INPT', l_cnt::VARCHAR);
			COMMIT;

		END;

		<<SKIP_IO>>
		BEGIN
			IF i_arg.cost_calc_typ != c_cost_calc_stk THEN
				EXIT SKIP_IO;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_io t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_io);

			IF i_arg.sa_typ = c_sa_pln THEN
				NULL;
			ELSE
				INSERT INTO mgt_calc_io (
					calc_no, calc_grp_cd,
					act_io_id, act_io_id_sub,
					wg_cd,
					ym, ac_dt,
					mng_dpt_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					cost_io_typ,
					ac_slip_typ, ac_rsn_cd,
					other_wg_cd,
					other_dpt_cd,
					bp_cd,
					stk_bp_cd,
					asst_typ,
					qty,
					amt,
					cur_cd, cur_amt,
					xrate,
					trd_grp, trd_ratio,
					alc_ac_cd, alc_amt_flg,
					alc_wg_cd,
					alc_dpt_cd, alc_loc_cd, alc_oper_cd,
					alc_bp_cd, alc_ctg_cd, alc_itm_cd, alc_itm_sub1, alc_itm_sub2, alc_itm_sub3,
					alc_lot_no, alc_sublot_no, alc_sno1, alc_sno2, alc_sno3, alc_sno4,
					alc_itm_mfg_inst_no,
					rec_eval_typ,
					eval_loop_flg, zero_effect_flg,
					calc_ctg_cd
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					t1.act_io_id, t1.act_io_id_sub,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ac_dt,
					t1.mng_dpt_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.cost_io_typ,
					t1.ac_slip_typ, t1.ac_rsn_cd,
					COALESCE(i_arg.runtime_wg_cd, COALESCE(t1.other_wg_cd, t1.wg_cd)),
					t1.other_dpt_cd,
					t1.bp_cd,
					t1.stk_bp_cd,
					t1.asst_typ,
					t1.qty,
					t1.amt,
					t1.trd_cur_cd, t1.trd_cur_amt,
					t1.xrate,
					t1.trd_grp, t1.trd_ratio,
					t1.alc_ac_cd, t1.alc_amt_flg,
					COALESCE(i_arg.runtime_wg_cd, COALESCE(t1.alc_wg_cd, t1.wg_cd)),
					t1.alc_dpt_cd, t1.alc_loc_cd, t1.alc_oper_cd,
					t1.alc_bp_cd, t1.alc_ctg_cd, t1.alc_itm_cd, t1.alc_itm_sub1, t1.alc_itm_sub2, t1.alc_itm_sub3,
					t1.alc_lot_no, t1.alc_sublot_no, t1.alc_sno1, t1.alc_sno2, t1.alc_sno3, t1.alc_sno4,
					t1.alc_itm_mfg_inst_no,
					t1.rec_eval_typ,
					t1.eval_loop_flg, t1.zero_effect_flg,
					t1.calc_ctg_cd
				FROM	mgw_calc_ctg w1, mgt_act_io t1
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_IO', l_cnt::VARCHAR);
			COMMIT;

		END;

		<<SKIP_SLS>>
		BEGIN
			IF i_arg.cost_calc_typ IN (c_cost_calc_std, c_cost_calc_other)
			AND i_arg.exp_calc_typ != c_exp_calc_rqmt
			AND i_arg.alc_calc_typ = c_alc_calc_non THEN
				EXIT SKIP_SLS;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_sls t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_sls);
			IF i_arg.sa_typ = c_sa_pln THEN
				INSERT INTO mgt_calc_sls (
					calc_no, calc_grp_cd,
					act_sls_id, act_sls_id_sub,
					wg_cd,
					ym, ac_dt,
					mng_dpt_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					ac_slip_typ, ac_rsn_cd,
					asst_typ,
					qty,
					amt,
					cur_cd,
					cur_amt,
					xrate,
					cst_cd, dlv_cd,
					sls_dpt_cd, sls_usr_cd,
					slo_no, iv_no,
					stk_bp_cd,
					alc_dpt_cd,
					dest_cd1, dest_cd2, dest_cd3,
					cost_sls_cd1, cost_sls_cd2, cost_sls_cd3, cost_sls_cd4, cost_sls_cd5,
					alc_val1, alc_val2, alc_val3, alc_val4, alc_val5,
					rec_eval_typ
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					MAX(t.pln_sls_key), '0',
					t.wg_cd,
					t.ym, t.ym,
					t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					c_ac_slip_sls, NULL,
					t.asst_typ,
					SUM(t.qty),
					SUM(mgpa_xchng$f_xchng2(t.cur_cd, l_co.base_cur_cd, t.xrate,
								l_cur.amt_dec_place, l_co.xrate_rnd_typ, t.cur_amt, 'MGT_PLN_SLS')),
					t.cur_cd,
					SUM(t.cur_amt),
					t.xrate,
					t.cst_cd, t.dlv_cd,
					t.sls_dpt_cd, t.sls_usr_cd,
					NULL, NULL,
					NULL,
					t.alc_dpt_cd,
					t.dest_cd1, t.dest_cd2, t.dest_cd3,
					t.cost_sls_cd1, t.cost_sls_cd2, t.cost_sls_cd3, t.cost_sls_cd4, t.cost_sls_cd5,
					NULL, NULL, NULL, NULL, NULL,
					NULL
				FROM	(
					SELECT
						t1.pln_sls_key,
						COALESCE(i_arg.runtime_wg_cd, t1.wg_cd) AS wg_cd,
						t1.ym,
						t1.mng_dpt_cd,
						t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
						t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
						t1.asst_typ,
						mgpa_unit$f_get_conv_qty(t1.qty, m1.conv_base_qty, m1.conv_qty, m2.dec_place, m2.rnd_typ) AS qty,
						t1.cur_cd,
						t1.amt AS cur_amt,
						mgpa_xchng$f_get_rate(t1.cur_cd, l_co.base_cur_cd) AS xrate,
						t1.cst_cd, t1.dlv_cd,
						t1.sls_dpt_cd, t1.sls_usr_cd,
						t1.alc_dpt_cd,
						t1.dest_cd1, t1.dest_cd2, t1.dest_cd3,
						t1.cost_sls_cd1, t1.cost_sls_cd2, t1.cost_sls_cd3, t1.cost_sls_cd4, t1.cost_sls_cd5
					FROM	mgw_calc_ctg w1, mgt_pln_sls t1
						LEFT OUTER JOIN mavm_itm_unit m1
							ON (t1.itm_cd = m1.itm_cd
							AND t1.itm_sub1 = m1.itm_sub1
							AND t1.itm_sub2 = m1.itm_sub2
							AND t1.itm_sub3 = m1.itm_sub3
							AND t1.unit_cd = m1.unit_cd)
						LEFT OUTER JOIN mam_itm m2
							ON (t1.itm_cd = m2.itm_cd
							AND t1.itm_sub1 = m2.itm_sub1
							AND t1.itm_sub2 = m2.itm_sub2
							AND t1.itm_sub3 = m2.itm_sub3)
					WHERE	0=0
					AND w1.calc_ctg_cd = t1.calc_ctg_cd
					AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
					AND EXISTS (
							SELECT	'X'
							FROM	mam_grp_wg w2
							WHERE	0=0
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.wg_cd = t1.wg_cd
						)
					AND (
						l_itm_cnt = 0
						OR EXISTS (
							SELECT	'X'
							FROM	mgw_usr_itm x
							WHERE	0=0
							AND x.itm_cd = t1.itm_cd
							AND x.itm_sub1 = t1.itm_sub1
							AND x.itm_sub2 = t1.itm_sub2
							AND x.itm_sub3 = t1.itm_sub3
							)
						)
					) t
				WHERE	0=0
				GROUP BY t.wg_cd, t.ym,
					t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.asst_typ,
					t.cst_cd, t.dlv_cd,
					t.sls_dpt_cd, t.sls_usr_cd,
					t.alc_dpt_cd,
					t.dest_cd1, t.dest_cd2, t.dest_cd3,
					t.cost_sls_cd1, t.cost_sls_cd2, t.cost_sls_cd3, t.cost_sls_cd4, t.cost_sls_cd5,
					t.cur_cd, t.xrate;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			ELSE
				INSERT INTO mgt_calc_sls (
					calc_no, calc_grp_cd,
					act_sls_id, act_sls_id_sub,
					wg_cd,
					ym, ac_dt,
					mng_dpt_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					ac_slip_typ, ac_rsn_cd,
					asst_typ,
					qty,
					amt,
					cur_cd, cur_amt,
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
					i_arg.calc_no, i_arg.calc_grp_cd,
					t1.act_sls_id, t1.act_sls_id_sub,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym, t1.ac_dt,
					t1.mng_dpt_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.ac_slip_typ, t1.ac_rsn_cd,
					t1.asst_typ,
					t1.qty,
					t1.amt,
					t1.trd_cur_cd, t1.trd_cur_amt,
					t1.xrate,
					t1.cst_cd, t1.dlv_cd,
					t1.sls_dpt_cd, t1.sls_usr_cd,
					t1.slo_no, t1.iv_no,
					t1.stk_bp_cd,
					t1.alc_dpt_cd,
					t1.dest_cd1, t1.dest_cd2, t1.dest_cd3,
					t1.cost_sls_cd1, t1.cost_sls_cd2, t1.cost_sls_cd3, t1.cost_sls_cd4, t1.cost_sls_cd5,
					t1.alc_val1, t1.alc_val2, t1.alc_val3, t1.alc_val4, t1.alc_val5,
					t1.rec_eval_typ,
					t1.zero_effect_flg
				FROM	mgw_calc_ctg w1, mgt_act_sls t1
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					);
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_SLS', l_cnt::VARCHAR);
			COMMIT;

		END;

		<<SKIP_INST_WIP>>
		BEGIN
			IF i_arg.cost_calc_typ IN (c_cost_calc_std, c_cost_calc_other) THEN
				EXIT SKIP_INST_WIP;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_inst_wip t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_inst_wip);
			IF i_arg.sa_typ = c_sa_pln THEN
				NULL;
			ELSE
				INSERT INTO mgt_calc_inst_wip (
					calc_no, calc_grp_cd,
					wg_cd,
					ym,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					oper_act_no, oper_cd, oper_seq,
					loc_cd, str_ln_cd,
					ac_rsn_cd,
					wip_qty,
					wip_per
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.ym,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.itm_mfg_inst_no, t1.mfg_act_no,
					t1.oper_act_no, t2.oper_cd, t2.oper_seq,
					t1.loc_cd, t1.str_ln_cd,
					t1.ac_rsn_cd,
					SUM(t1.wip_qty),
					MAX(t1.wip_per)
				FROM	mgw_calc_ctg w1, mgt_act_inst_wip t1
					LEFT OUTER JOIN mgt_inst_oper t2
						ON (t1.calc_ctg_cd = t2.calc_ctg_cd
						AND t1.itm_cd = t2.itm_cd
						AND t1.itm_sub1 = t2.itm_sub1
						AND t1.itm_sub2 = t2.itm_sub2
						AND t1.itm_sub3 = t2.itm_sub3
						AND t1.itm_mfg_inst_no = t2.itm_mfg_inst_no
						AND t1.mfg_act_no = t2.mfg_act_no
						AND t1.oper_act_no = t2.oper_act_no)
				WHERE	0=0
				AND w1.calc_ctg_cd = t1.calc_ctg_cd
				AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
				AND EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND w2.calc_grp_cd = i_arg.calc_grp_cd
						AND w2.wg_cd = t1.wg_cd
					)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t1.itm_cd
						AND x.itm_sub1 = t1.itm_sub1
						AND x.itm_sub2 = t1.itm_sub2
						AND x.itm_sub3 = t1.itm_sub3
						)
					)
				GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd), t1.ym,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.itm_mfg_inst_no, t1.mfg_act_no,
					t1.oper_act_no, t2.oper_cd, t2.oper_seq,
					t1.loc_cd, t1.str_ln_cd,
					t1.ac_rsn_cd;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;

				INSERT INTO mgw_calc_itm_mfg_inst (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no
					)
				SELECT
					x.itm_cd,
					x.itm_sub1,
					x.itm_sub2,
					x.itm_sub3,
					x.itm_mfg_inst_no,
					x.mfg_act_no
				FROM (
					SELECT DISTINCT
						t.itm_cd,
						t.itm_sub1,
						t.itm_sub2,
						t.itm_sub3,
						t.itm_mfg_inst_no,
						t.mfg_act_no
					FROM	mgt_calc_inst_wip t
					WHERE	0=0
					AND t.calc_no = i_arg.calc_no
					AND t.calc_grp_cd = i_arg.calc_grp_cd
					) x
				WHERE 0=0
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgw_calc_itm_mfg_inst w
						WHERE	0=0
						AND w.itm_cd = x.itm_cd
						AND w.itm_sub1 = x.itm_sub1
						AND w.itm_sub2 = x.itm_sub2
						AND w.itm_sub3 = x.itm_sub3
						AND w.itm_mfg_inst_no = x.itm_mfg_inst_no
						AND w.mfg_act_no = x.mfg_act_no
						);
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_INST_WIP', l_cnt::VARCHAR);
			COMMIT;

		END;

		<<SKIP_GP_ALC>>
		BEGIN
			l_cnt := 0;
			DELETE FROM mgt_calc_itm_mfg_inst t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			IF i_arg.sa_typ = c_sa_pln THEN
				INSERT INTO mgt_calc_itm_mfg_inst (
					calc_no, calc_grp_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3,
					itm_mfg_inst_no, mfg_act_no,
					wg_cd,
					mng_dpt_cd,
					lot_no, sublot_no, sno1, sno2, sno3, sno4,
					sppl_cd, po_no, slo_no, iv_no,
					asst_typ,
					qty
					)
				SELECT
					i_arg.calc_no, i_arg.calc_grp_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.itm_mfg_inst_no, t1.mfg_act_no,
					COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
					t1.mng_dpt_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.sppl_cd, t1.po_no, t1.slo_no, t1.iv_no,
					t1.asst_typ,
					t1.qty
				FROM	mgw_calc_itm_mfg_inst t1
				WHERE	0=0;
				GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
				l_cnt := l_cnt + sql$rowcount;
			ELSE
				INSERT INTO mgw_calc_itm_mfg_inst (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					itm_mfg_inst_no,
					mfg_act_no
					)
				SELECT DISTINCT
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.itm_mfg_inst_no,
					t.mfg_act_no
				FROM	mgt_st_wip t
				WHERE	0=0
				AND t.calc_grp_cd = l_wip_calc_grp_cd
				AND t.ym = i_arg.st_ym
				AND	(
					EXISTS (
						SELECT	'X'
						FROM	mam_grp_wg w2
						WHERE	0=0
						AND	w2.calc_grp_cd = i_arg.calc_grp_cd
						AND	w2.wg_cd = t.wg_cd
					)
					OR
		        	EXISTS (
						SELECT	'X'
						FROM	mam_calc_grp w3
						WHERE	0=0
						AND	w3.calc_grp_cd = i_arg.calc_grp_cd
						AND	w3.runtime_wg_cd = t.wg_cd
					)
				)
				AND NOT EXISTS (
						SELECT	'X'
						FROM	mgw_calc_itm_mfg_inst w
						WHERE	0=0
						AND w.itm_cd = t.itm_cd
						AND w.itm_sub1 = t.itm_sub1
						AND w.itm_sub2 = t.itm_sub2
						AND w.itm_sub3 = t.itm_sub3
						AND w.itm_mfg_inst_no = t.itm_mfg_inst_no
						AND w.mfg_act_no = t.mfg_act_no
						)
				AND (
					l_itm_cnt = 0
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_usr_itm x
						WHERE	0=0
						AND x.itm_cd = t.itm_cd
						AND x.itm_sub1 = t.itm_sub1
						AND x.itm_sub2 = t.itm_sub2
						AND x.itm_sub3 = t.itm_sub3
						)
					);

				CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_mfg);
				FOR l14 IN
					SELECT	w.*
					FROM	mgpa_sca_prep$cursor_ctg_list() w
				LOOP
					INSERT INTO mgt_calc_itm_mfg_inst (
						calc_no, calc_grp_cd,
						itm_cd, itm_sub1, itm_sub2, itm_sub3,
						itm_mfg_inst_no, mfg_act_no,
						wg_cd,
						mng_dpt_cd,
						lot_no, sublot_no, sno1, sno2, sno3, sno4,
						sppl_cd, po_no, slo_no, iv_no,
						asst_typ, qty,
						schd_st_dt, schd_end_dt, act_st_dt, act_end_dt,
						calc_ctg_cd
						)
					SELECT
						i_arg.calc_no, i_arg.calc_grp_cd,
						t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
						t1.itm_mfg_inst_no, t1.mfg_act_no,
						COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
						t1.mng_dpt_cd,
						t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
						t1.sppl_cd, t1.po_no, t1.slo_no, t1.iv_no,
						t1.asst_typ, t1.qty,
						t1.schd_st_dt, t1.schd_end_dt, t1.act_st_dt, t1.act_end_dt,
						t1.calc_ctg_cd
					FROM	mgw_calc_itm_mfg_inst w1, mgt_itm_mfg_inst t1
					WHERE	0=0
					AND w1.itm_cd = t1.itm_cd
					AND w1.itm_sub1 = t1.itm_sub1
					AND w1.itm_sub2 = t1.itm_sub2
					AND w1.itm_sub3 = t1.itm_sub3
					AND w1.itm_mfg_inst_no = t1.itm_mfg_inst_no
					AND w1.mfg_act_no = t1.mfg_act_no
					AND t1.calc_ctg_cd = l14.calc_ctg_cd
					AND NOT EXISTS (
							SELECT	'X'
							FROM	mgt_calc_itm_mfg_inst w2
							WHERE	0=0
							AND w2.calc_no = i_arg.calc_no
							AND w2.calc_grp_cd = i_arg.calc_grp_cd
							AND w2.itm_cd = w1.itm_cd
							AND w2.itm_sub1 = w1.itm_sub1
							AND w2.itm_sub2 = w1.itm_sub2
							AND w2.itm_sub3 = w1.itm_sub3
							AND w2.itm_mfg_inst_no = w1.itm_mfg_inst_no
							AND w2.mfg_act_no = w1.mfg_act_no
						)
					AND (
						l_itm_cnt = 0
						OR EXISTS (
							SELECT	'X'
							FROM	mgw_usr_itm x
							WHERE	0=0
							AND x.itm_cd = w1.itm_cd
							AND x.itm_sub1 = w1.itm_sub1
							AND x.itm_sub2 = w1.itm_sub2
							AND x.itm_sub3 = w1.itm_sub3
							)
						);
					GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
					l_cnt := l_cnt + sql$rowcount;
				END LOOP;
			END IF;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_ITM_MFG_INST', l_cnt::VARCHAR);
			COMMIT;

			IF i_arg.cost_calc_typ IN (c_cost_calc_std, c_cost_calc_other)
			AND i_arg.alc_calc_typ = c_alc_calc_non THEN
				EXIT SKIP_GP_ALC;
			END IF;

			l_cnt := 0;
			DELETE FROM mgt_calc_gp_alc t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd;
			CALL mgpa_calc_ctg$p_set_work(i_arg.calc_grp_cd, c_calc_ctg_gp_alc);
			INSERT INTO mgt_calc_gp_alc (
				calc_no, calc_grp_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
				itm_cd, itm_sub1, itm_sub2, itm_sub3,
				lot_no, sublot_no, sno1, sno2, sno3, sno4,
				loc_cd, oper_cd, bp_cd, alc_dpt_cd,
				itm_mfg_inst_no,
				iv_no, po_no, slo_no,
				asst_typ,
				gp_alc_cd,
				qty,
				amt,
				alc_val1,
				alc_val2,
				alc_val3,
				alc_val4,
				alc_val5
				)
			SELECT
				i_arg.calc_no, i_arg.calc_grp_cd,
				COALESCE(i_arg.runtime_wg_cd, t1.wg_cd),
				t1.ym,
				t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.loc_cd, t1.oper_cd, t1.bp_cd, t1.alc_dpt_cd,
				t1.itm_mfg_inst_no,
				t1.iv_no, t1.po_no, t1.slo_no,
				t1.asst_typ,
				t1.gp_alc_cd,
				SUM(t1.qty),
				SUM(t1.amt),
				SUM(t1.alc_val1),
				SUM(t1.alc_val2),
				SUM(t1.alc_val3),
				SUM(t1.alc_val4),
				SUM(t1.alc_val5)
			FROM	mgw_calc_ctg w1, mgt_gp_alc t1
			WHERE	0=0
			AND w1.calc_ctg_cd = t1.calc_ctg_cd
			AND t1.ym BETWEEN i_arg.st_ym AND i_arg.end_ym
			AND EXISTS (
					SELECT	'X'
					FROM	mam_grp_wg w2
					WHERE	0=0
					AND w2.calc_grp_cd = i_arg.calc_grp_cd
					AND w2.wg_cd = t1.wg_cd
				)
			AND (
				l_itm_cnt = 0
				OR EXISTS (
					SELECT	'X'
					FROM	mgw_usr_itm x
					WHERE	0=0
					AND x.itm_cd = t1.itm_cd
					AND x.itm_sub1 = t1.itm_sub1
					AND x.itm_sub2 = t1.itm_sub2
					AND x.itm_sub3 = t1.itm_sub3
					)
				)
			GROUP BY COALESCE(i_arg.runtime_wg_cd, t1.wg_cd), t1.ym,
				t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.loc_cd, t1.oper_cd, t1.bp_cd, t1.alc_dpt_cd,
				t1.itm_mfg_inst_no,
				t1.iv_no, t1.po_no, t1.slo_no,
				t1.asst_typ,
				t1.gp_alc_cd;
			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_cnt := l_cnt + sql$rowcount;
			CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_GP_ALC', l_cnt::VARCHAR);
			COMMIT;

		END;

		CALL mgpa_set_itm_ext$p_set_itm_ext(i_arg);

		CALL mgpa_sca_prep$p_set_alc(i_arg);

		IF i_arg.cost_calc_typ = c_cost_calc_stk THEN
			CALL mgpa_sca_prep$p_set_other_trd(i_arg);
		END IF;

	END;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_PREP.P_PROCA');

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_prep$p_procx(
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	複数回の計算を行うときの処理
<REMARKS>

<ARGUMENTS>
<IN>	I_ARG
		MGT_ARGレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_pre_alc_calc_non CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_PRE_ALC_CALC_TYP', 'NON');
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_PREP.P_PROCX');

	CALL mgpa_pre_alc$p_set_input_data(i_arg);
	/* 一次配賦計算処理 */
	IF i_arg.pre_alc_calc_typ != c_pre_alc_calc_non THEN
		CALL mgpa_pre_alc$p_main(i_arg);
	END IF;
	COMMIT;

	CALL mgpa_sca_prep$p_set_alc(i_arg);

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_PREP.P_PROCX');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_prep$p_main(
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価計算前処理のメイン処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_arg mgt_arg%ROWTYPE;
BEGIN
	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no);

	IF l_arg.calc_exec_cnt = 1 THEN
		CALL mgpa_sca_prep$p_proca(l_arg);
	ELSE
		CALL mgpa_sca_prep$p_procx(l_arg);
	END IF;

	COMMIT; /* エンジン読み取り用のため */
END;
$BODY$
LANGUAGE plpgsql
;

