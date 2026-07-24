CREATE OR REPLACE PROCEDURE mgpa_ac_if$p_get_ac_dpt(
	IN i_dpt VARCHAR,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	INOUT i_dpt_map_rec mam_cost_ac_dpt_map[],
	INOUT o_ac_dpt VARCHAR,
	IN i_ne_flg CHARACTER DEFAULT '0'
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価部門ＣＤから会計部門ＣＤへの変換処理
<REMARKS>
	原価部門ＣＤに対するMAM_COST_AC_DPT_MAPが存在しない場合は
	原価部門ＣＤを会計部門ＣＤとする。
	対象となる会計部門ＣＤがMAM_AC_DPTに存在しない場合はエラーとする。
<ARGUMENTS>
<IN>	i_dpt
		原価部門ＣＤ
<IN>	i_dt
		適用日
<INOUT>	i_dpt_map_rec
		MAM_COST_AC_DPT_MAP(キャッシュ)
<INOUT>	o_ac_dpt
		変換した会計部門ＣＤ
<IN>	i_ne_flg
		0:エラーにしない、1:エラーにする
<HISTORY>
**************************************************************************/
DECLARE
	rec mam_cost_ac_dpt_map%ROWTYPE;

	l_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_cnt INTEGER;
	l_msg VARCHAR[];
BEGIN
	IF i_dpt IS NULL THEN
		o_ac_dpt := NULL;
		RETURN;
	END IF;

	FOREACH rec IN ARRAY i_dpt_map_rec LOOP
		IF rec.dpt_cd = i_dpt THEN
			o_ac_dpt := rec.ac_dpt_cd;
			RETURN;
		END IF ;
	END LOOP;

	SELECT COALESCE(MIN(m.ac_dpt_cd), i_dpt)
	INTO STRICT l_dpt
	FROM mam_cost_ac_dpt_map m
	WHERE 0=0
	AND m.dpt_cd = i_dpt
	AND m.st_dt <= i_dt
	AND m.end_dt >= i_dt
	;

	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mam_ac_dpt m
	WHERE 0=0
	AND m.ac_dpt_cd = l_dpt
	AND m.st_dt <= i_dt
	AND m.end_dt >= i_dt
	;

	IF l_cnt = 0 THEN
		/* エラーにしない */
		IF i_ne_flg = '1' THEN
			o_ac_dpt := NULL;
			RETURN;
		END IF;
		l_msg := fcpa_err$msg_binder(l_dpt, fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md()));
		CALL fcpa_err$raise_app_err('MGBDD0016', l_msg);
	END IF;

	rec.dpt_cd := i_dpt;
	rec.ac_dpt_cd := l_dpt;
	i_dpt_map_rec[COALESCE(array_length(i_dpt_map_rec, 1), 0) + 1] := rec;

	o_ac_dpt := l_dpt;
	RETURN;
END;
$BODY$
LANGUAGE  plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ac_if$p_get_jnl_key_map(
	IN i_ac_slip_typ VARCHAR,
	IN i_jnl_key_col_typ VARCHAR,
	IN i_jnl_key_map_rec mam_jnl_key_map[],
	INOUT o_jnl_key_map mam_jnl_key_map
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	引数に対応する仕訳キー対応マスタのレコードを取得
<REMARKS>

<ARGUMENTS>
<IN>	i_ac_slip_typ
		会計伝票区分
<IN>	i_jnl_key_col_typ
		仕訳キー項目区分
<IN>	i_jnl_key_map_rec
		仕訳キー対応マスタ（キャッシュ）
<INOUT>	o_jnl_key_map
		IN条件に対応する仕訳キー対応マスタのレコード
<HISTORY>
**************************************************************************/
DECLARE
	rec mam_jnl_key_map%ROWTYPE;
BEGIN
	IF COALESCE(array_length(i_jnl_key_map_rec, 1), 0) = 0 OR i_ac_slip_typ IS NULL OR i_jnl_key_col_typ IS NULL THEN
		o_jnl_key_map := NULL;
		RETURN;
	END IF;

	FOREACH rec IN ARRAY i_jnl_key_map_rec LOOP
		IF rec.ac_slip_typ <> i_ac_slip_typ THEN
			continue;
		END IF ;
		IF rec.jnl_key_col_typ <> i_jnl_key_col_typ THEN
			continue;
		END IF ;
		o_jnl_key_map := rec;
		EXIT ;
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ac_if$p_get_bp_grp(
	IN i_jnl_bp_rec mbt_ac_cost,
	IN i_jnl_key_map mam_jnl_key_map,
	IN i_bp_grp_typ VARCHAR,
	INOUT o_bp_grp_cd VARCHAR,
	INOUT i_bp_grp_rec mam_bp[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	取引先仕訳キー設定項目区分の取引先に対応する取引先分類ＣＤを取得
<REMARKS>

<ARGUMENTS>
<IN>	i_jnl_bp_rec
		会計情報レコードの取引先
<IN>	i_jnl_key_map
		仕訳キー対応マスタのレコード
<IN>	i_bp_grp_typ
		取引先分類仕訳キー設定項目区分
<INOUT>	o_bp_grp_cd
		取引先に対応する取引先分類ＣＤ
<INOUT>	i_bp_grp_rec
		取引先に対応する取引先分類ＣＤ（キャッシュ）
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_max_bp_cnt CONSTANT INTEGER := 10000 ;

	c_cst_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','CST_CD');
	c_sppl_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SPPL_CD');
	c_inv_com_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','INV_COM_CD');

	c_bp_grp_cd1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD1');
	c_bp_grp_cd2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD2');
	c_bp_grp_cd3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD3');
	c_bp_grp_cd4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD4');
	c_bp_grp_cd5 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD5');
	c_bp_grp_cd6 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD6');
	c_bp_grp_cd7 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD7');
	c_bp_grp_cd8 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD8');
	c_bp_grp_cd9 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD9');
	c_bp_grp_cd10 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD10');

	l_bp_cd mam_bp.bp_cd%TYPE;

	rec mam_bp%ROWTYPE;
	r_bp_grp mam_bp%ROWTYPE;
	x RECORD;
BEGIN
	IF i_jnl_key_map.bp_jnl_key_set_col_typ IS NULL OR i_bp_grp_typ IS NULL THEN
		o_bp_grp_cd := NULL;
		RETURN;
	END IF;

	CASE i_jnl_key_map.bp_jnl_key_set_col_typ
		WHEN c_cst_cd THEN
			l_bp_cd := i_jnl_bp_rec.cst_cd;
		WHEN c_sppl_cd THEN
			l_bp_cd := i_jnl_bp_rec.sppl_cd;
		WHEN c_inv_com_cd THEN
			l_bp_cd := i_jnl_bp_rec.inv_com_cd;
		ELSE
			o_bp_grp_cd := NULL;
			RETURN;
	END CASE;

	IF l_bp_cd IS NULL THEN
		o_bp_grp_cd := NULL;
		RETURN;
	END IF;

	IF COALESCE(array_length(i_bp_grp_rec, 1), 0) > 0 THEN
		FOREACH rec IN ARRAY i_bp_grp_rec LOOP
			IF rec.bp_cd = l_bp_cd THEN
				r_bp_grp := rec;
			END IF ;
		END LOOP;
	END IF;

	IF r_bp_grp.bp_cd IS NULL THEN
		FOR x IN
			SELECT
				m.bp_cd,
				m.bp_grp_cd1,
				m.bp_grp_cd2,
				m.bp_grp_cd3,
				m.bp_grp_cd4,
				m.bp_grp_cd5,
				m.bp_grp_cd6,
				m.bp_grp_cd7,
				m.bp_grp_cd8,
				m.bp_grp_cd9,
				m.bp_grp_cd10
			FROM mam_bp m
			WHERE 0=0
			AND m.del_flg = c_off
			AND m.bp_cd = l_bp_cd
		LOOP
			rec.bp_cd := x.bp_cd;
			rec.bp_grp_cd1 := x.bp_grp_cd1;
			rec.bp_grp_cd2 := x.bp_grp_cd2;
			rec.bp_grp_cd3 := x.bp_grp_cd3;
			rec.bp_grp_cd4 := x.bp_grp_cd4;
			rec.bp_grp_cd5 := x.bp_grp_cd5;
			rec.bp_grp_cd6 := x.bp_grp_cd6;
			rec.bp_grp_cd7 := x.bp_grp_cd7;
			rec.bp_grp_cd8 := x.bp_grp_cd8;
			rec.bp_grp_cd9 := x.bp_grp_cd9;
			rec.bp_grp_cd10 := x.bp_grp_cd10;
			i_bp_grp_rec[COALESCE(array_length(i_bp_grp_rec, 1), 0) + 1] := rec;
			r_bp_grp := rec;
		END LOOP;

		IF COALESCE(array_length(i_bp_grp_rec, 1), 0) > c_max_bp_cnt THEN
			i_bp_grp_rec := '{}';
		END IF;
	END IF;

	/* 取引先分類ＣＤを取得 */
	CASE i_bp_grp_typ
		WHEN c_bp_grp_cd1 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd1;
			RETURN;
		WHEN c_bp_grp_cd2 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd2;
			RETURN;
		WHEN c_bp_grp_cd3 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd3;
			RETURN;
		WHEN c_bp_grp_cd4 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd4;
			RETURN;
		WHEN c_bp_grp_cd5 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd5;
			RETURN;
		WHEN c_bp_grp_cd6 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd6;
			RETURN;
		WHEN c_bp_grp_cd7 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd7;
			RETURN;
		WHEN c_bp_grp_cd8 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd8;
			RETURN;
		WHEN c_bp_grp_cd9 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd9;
			RETURN;
		WHEN c_bp_grp_cd10 THEN
			o_bp_grp_cd := r_bp_grp.bp_grp_cd10;
			RETURN;
		ELSE
			o_bp_grp_cd := NULL;
			RETURN;
	END CASE;
END;
$BODY$
LANGUAGE  plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ac_if$p_ac_cost_insert(
	INOUT i_recs mbt_ac_cost[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	会計原価情報の登録
<REMARKS>
<ARGUMENTS>
<INOUT>	i_recs
		作成対象のレコードの配列
<HISTORY>
**************************************************************************/
BEGIN
	IF COALESCE(array_length(i_recs, 1), 0) > 0 THEN
		INSERT INTO mbt_ac_cost SELECT * FROM UNNEST(i_recs);
		i_recs := '{}';
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ac_if$p_ac_cost_merge(
	INOUT i_recs mbt_ac_cost[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	会計原価情報の更新
<REMARKS>
<ARGUMENTS>
<INOUT>	i_recs
		作成対象のレコードの配列
<HISTORY>
**************************************************************************/
DECLARE
	c_ac_cost_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_SYS_TYP','AC_COST');
	c_it_dat_no_l CONSTANT INTEGER := 15;
	i INTEGER;
	x RECORD;
BEGIN
	IF COALESCE(array_length(i_recs, 1), 0) > 0 THEN
		FOR x IN
			SELECT * FROM UNNEST(i_recs)
		LOOP
			SELECT COUNT(*)
			INTO STRICT i
			FROM mbt_ac_cost t
			WHERE t.wg_cd = x.wg_cd
			AND t.ac_ym = x.ac_ym
			AND t.calc_grp_cd = x.calc_grp_cd
			AND t.calc_no = x.calc_no
			AND t.ac_slip_typ = x.ac_slip_typ
			AND t.gi_dpt_cd = x.gi_dpt_cd
			AND t.gr_dpt_cd = x.gr_dpt_cd
			AND (t.loc_cd IS NULL AND x.loc_cd IS NULL OR t.loc_cd = x.loc_cd)
			AND t.itm_cd = x.itm_cd
			AND t.itm_sub1 = x.itm_sub1
			AND t.itm_sub2 = x.itm_sub2
			AND t.itm_sub3 = x.itm_sub3
			AND t.lot_no = x.lot_no
			AND t.sublot_no = x.sublot_no
			AND t.sno1 = x.sno1
			AND t.sno2 = x.sno2
			AND t.sno3 = x.sno3
			AND t.sno4 = x.sno4
			AND (t.slo_no IS NULL AND x.slo_no IS NULL OR t.slo_no = x.slo_no)
			AND (t.po_no IS NULL AND x.po_no IS NULL OR t.po_no = x.po_no)
			AND (t.iv_no IS NULL AND x.iv_no IS NULL OR t.iv_no = x.iv_no)
			AND t.src_alc_ac_cd = x.src_alc_ac_cd
			AND t.alc_ac_cd = x.alc_ac_cd;

			IF i > 0 THEN
				UPDATE mbt_ac_cost t
				SET amt = t.amt + x.amt
				WHERE t.wg_cd = x.wg_cd
				AND t.ac_ym = x.ac_ym
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.calc_no = x.calc_no
				AND t.ac_slip_typ = x.ac_slip_typ
				AND t.gi_dpt_cd = x.gi_dpt_cd
				AND t.gr_dpt_cd = x.gr_dpt_cd
				AND (t.loc_cd IS NULL AND x.loc_cd IS NULL OR t.loc_cd = x.loc_cd)
				AND t.itm_cd = x.itm_cd
				AND t.itm_sub1 = x.itm_sub1
				AND t.itm_sub2 = x.itm_sub2
				AND t.itm_sub3 = x.itm_sub3
				AND t.lot_no = x.lot_no
				AND t.sublot_no = x.sublot_no
				AND t.sno1 = x.sno1
				AND t.sno2 = x.sno2
				AND t.sno3 = x.sno3
				AND t.sno4 = x.sno4
				AND (t.slo_no IS NULL AND x.slo_no IS NULL OR t.slo_no = x.slo_no)
				AND (t.po_no IS NULL AND x.po_no IS NULL OR t.po_no = x.po_no)
				AND (t.iv_no IS NULL AND x.iv_no IS NULL OR t.iv_no = x.iv_no)
				AND t.src_alc_ac_cd = x.src_alc_ac_cd
				AND t.alc_ac_cd = x.alc_ac_cd;
			ELSE
				INSERT INTO mbt_ac_cost (
					data_no,
					wg_cd, ac_ym, calc_grp_cd, calc_no, ac_dt, ac_slip_typ,
					gi_dpt_cd, gr_dpt_cd, bd_dpt_cd, loc_cd, ac_itm_grp_cd, itm_jnl_cd,
					itm_cd, itm_sub1, itm_sub2, itm_sub3, itm_nm, lot_no, sublot_no,
					sno1, sno2, sno3, sno4, slo_no, po_no, iv_no, base_unit_cd,
					base_unit_qty, base_cur_cd, amt, foreign_flg, jnl_fin_cnt,
					src_alc_ac_cd, alc_ac_cd, jnl_key1, jnl_key2, jnl_key3, jnl_key4,
					jnl_key5, jnl_key6, jnl_key7, jnl_key8, jnl_key9, jnl_key10
				) VALUES (
					LPAD(mapa_num$f_get_seq(c_ac_cost_seq)::VARCHAR, c_it_dat_no_l, '0'),
					x.wg_cd, x.ac_ym, x.calc_grp_cd, x.calc_no, x.ac_dt, x.ac_slip_typ,
					x.gi_dpt_cd, x.gr_dpt_cd, x.bd_dpt_cd, x.loc_cd, x.ac_itm_grp_cd, x.itm_jnl_cd,
					x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, x.itm_nm, x.lot_no, x.sublot_no,
					x.sno1, x.sno2, x.sno3, x.sno4, x.slo_no, x.po_no, x.iv_no, x.base_unit_cd,
					x.base_unit_qty, x.base_cur_cd, x.amt, x.foreign_flg, x.jnl_fin_cnt,
					x.src_alc_ac_cd, x.alc_ac_cd, x.jnl_key1, x.jnl_key2, x.jnl_key3, x.jnl_key4,
					x.jnl_key5, x.jnl_key6, x.jnl_key7, x.jnl_key8, x.jnl_key9, x.jnl_key10
				);
			END IF;
		END LOOP;
		i_recs := '{}';
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ac_if$p_send_main(
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	会計ＩＦの送信メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<IN>	i_ym
		年月
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_ac_cost_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_SYS_TYP','AC_COST');
	c_it_dat_no_l CONSTANT INTEGER := 15;

	/* バルクインサートでの最大レコード数 */
	c_max_cnt CONSTANT INTEGER := 20000;

	c_jnl_key1_l CONSTANT INTEGER := 20;
	c_jnl_key2_l CONSTANT INTEGER := 20;
	c_jnl_key3_l CONSTANT INTEGER := 20;
	c_jnl_key4_l CONSTANT INTEGER := 20;
	c_jnl_key5_l CONSTANT INTEGER := 20;
	c_jnl_key6_l CONSTANT INTEGER := 20;
	c_jnl_key7_l CONSTANT INTEGER := 20;
	c_jnl_key8_l CONSTANT INTEGER := 20;
	c_jnl_key9_l CONSTANT INTEGER := 20;
	c_jnl_key10_l CONSTANT INTEGER := 20;

	c_calc_rec_comp CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','COMP');
	c_calc_rec_io CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','IO');
	c_calc_rec_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INPT');
	c_calc_rec_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','SLS');
	c_calc_rec_end_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_STK');
	c_calc_rec_end_wip CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_WIP');
	c_calc_rec_inst CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INST');
	c_calc_rec_adj CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ADJ');
	c_cost_io_ffr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','FFR_PROV');
	c_cost_io_onr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','ONR_PROV');
	c_cost_io_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IN');
	c_cost_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_OUT');
	c_cost_io_stk_io CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IO');
	c_asst_prod CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');
	c_asst_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS');
	c_asst_oth CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH');
	c_ac_slip_comp_cst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','COMP_CST');
	c_ac_slip_sls_cst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS_COST');
	c_ac_slip_mfg CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','MFG');
	c_ac_slip_purc_cost CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_COST');
	c_ac_slip_purc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC');
	c_ac_slip_eom_stk_prod CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','EOM_STK_PROD');
	c_ac_slip_eom_stk_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','EOM_STK_SLS');
	c_ac_slip_inp_wip_cst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INP_WIP_CST');
	c_ac_slip_input CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INPUT');
	c_ac_slip_in_onr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_ONR');
	c_ac_slip_in_ss CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_SS');
	c_ac_slip_byprod CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','BYPROD');
	c_ac_slip_cst_io_aod CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','CST_IO_AOD');
	c_ac_slip_onr_prov_diff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PROV_DIFF');
	c_ac_slip_in_onr_diff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_ONR_DIFF');
	c_ac_slip_stk_asm_diff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_ASM_DIFF');
	c_ac_slip_ffr_prov_cst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PROV_CST');
	c_ac_slip_onr_prov_cst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PROV_CST');
	c_ac_slip_eom_stk_asm_mis CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','EOM_STK_ASM_MIS');
	c_ac_slip_prod_itm_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_SO');
	c_ac_slip_prod_itm_ret_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_RET_SO');
	c_ac_slip_dpt_xfr_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_SO');
	c_ac_slip_prod_itm_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_GR');
	c_ac_slip_prod_itm_ret_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_RET_GR');
	c_ac_slip_dpt_xfr_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_GR');
	c_ac_slip_prod_itm_diff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_DIFF');
	c_ac_slip_prod_itm_ret_diff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_RET_DIFF');
	c_ac_slip_dpt_xfr_diff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_DIFF');
	c_enpns_prd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','PROD');
	c_ac_slip_dpt_alc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_ALC');

	c_wg_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','WG_CD');
	c_purc_dpt_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','PURC_DPT_CD');
	c_ap_dpt_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AP_DPT_CD');
	c_sls_dpt_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SLS_DPT_CD');
	c_ar_dpt_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AR_DPT_CD');
	c_gi_dpt_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','GI_DPT_CD');
	c_gr_dpt_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','GR_DPT_CD');
	c_bd_dpt_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BD_DPT_CD');
	c_sub_dpt_cd1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD1');
	c_sub_dpt_cd2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD2');
	c_sub_dpt_cd3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD3');
	c_loc_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','LOC_CD');
	c_str_ln_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','STR_LN_CD');
	c_cst_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','CST_CD');
	c_sppl_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SPPL_CD');
	c_inv_com_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','INV_COM_CD');
	c_ac_itm_grp_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AC_ITM_GRP_CD');
	c_itm_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_CD');
	c_itm_sub1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB1');
	c_itm_sub2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB2');
	c_itm_sub3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB3');
	c_sno1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO1');
	c_sno2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO2');
	c_sno3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO3');
	c_sno4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO4');
	c_itm_grp_cd1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD1');
	c_itm_grp_cd2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD2');
	c_itm_grp_cd3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD3');
	c_itm_grp_cd4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD4');
	c_itm_grp_cd5 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD5');
	c_itm_grp_cd6 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD6');
	c_itm_grp_cd7 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD7');
	c_itm_grp_cd8 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD8');
	c_itm_grp_cd9 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD9');
	c_itm_grp_cd10 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD10');
	c_trd_ac_itm_grp_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_AC_ITM_GRP_CD');
	c_trd_itm_jnl_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_JNL_CD');
	c_trd_itm_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_CD');
	c_trd_itm_sub1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_SUB1');
	c_trd_itm_sub2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_SUB2');
	c_trd_itm_sub3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_SUB3');
	c_trd_sno1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_SNO1');
	c_trd_sno2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_SNO2');
	c_trd_sno3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_SNO3');
	c_trd_sno4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_SNO4');
	c_trd_itm_grp_cd1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD1');
	c_trd_itm_grp_cd2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD2');
	c_trd_itm_grp_cd3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD3');
	c_trd_itm_grp_cd4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD4');
	c_trd_itm_grp_cd5 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD5');
	c_trd_itm_grp_cd6 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD6');
	c_trd_itm_grp_cd7 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD7');
	c_trd_itm_grp_cd8 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD8');
	c_trd_itm_grp_cd9 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD9');
	c_trd_itm_grp_cd10 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD10');
	c_area_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AREA_CD');
	c_cntry_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','CNTRY_CD');
	c_alc_ac_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ALC_AC_CD');
	c_src_alc_ac_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SRC_ALC_AC_CD');
	c_bp_grp_cd1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD1');
	c_bp_grp_cd2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD2');
	c_bp_grp_cd3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD3');
	c_bp_grp_cd4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD4');
	c_bp_grp_cd5 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD5');
	c_bp_grp_cd6 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD6');
	c_bp_grp_cd7 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD7');
	c_bp_grp_cd8 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD8');
	c_bp_grp_cd9 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD9');
	c_bp_grp_cd10 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD10');
	c_sub_char1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR1');
	c_sub_char2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR2');
	c_sub_char3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR3');
	c_sub_char4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR4');
	c_sub_char5 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR5');
	c_sub_char6 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR6');
	c_sub_char7 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR7');
	c_sub_char8 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR8');
	c_sub_char9 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR9');
	c_sub_char10 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR10');
	c_jnl_key1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY1');
	c_jnl_key2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY2');
	c_jnl_key3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY3');
	c_jnl_key4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY4');
	c_jnl_key5 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY5');
	c_jnl_key6 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY6');
	c_jnl_key7 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY7');
	c_jnl_key8 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY8');
	c_jnl_key9 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY9');
	c_jnl_key10 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY10');

	c_calc_rec_purc CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','PURC');
	c_expns_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','EXPNS_CD');
	c_ac_slip_itm_alc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ITM_ALC');
	c_ac_slip_diff_io_sum CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_IO_SUM');
	c_ac_slip_diff_io_pri CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_IO_PRI');
	c_ac_slip_diff_io_rate CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_IO_RATE');
	c_ac_slip_diff_qt_par CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_QT_PAR');
	c_ac_slip_diff_pr_par CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_PR_PAR');
	c_ac_slip_diff_qt_chd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_QT_CHD');
	c_ac_slip_diff_pr_chd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_PR_CHD');
	c_ac_slip_diff_wk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_WK');
	c_ac_slip_diff_act1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_ACT1');
	c_ac_slip_diff_act2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_ACT2');
	c_ac_slip_diff_act3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_ACT3');
	c_ac_slip_diff_act4 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_ACT4');
	c_ac_slip_diff_act5 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_ACT5');
	c_ac_slip_diff_rate_itm CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_RATE_ITM');
	c_ac_slip_diff_outsrc_sum CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_OUTSRC_SUM');
	c_ac_slip_diff_outsrc_pri CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_OUTSRC_PRI');
	c_ac_slip_diff_outsrc_rate CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_OUTSRC_RATE');
	c_ac_slip_diff_ss_par CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_SS_PAR');
	c_ac_slip_diff_ss_chd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_SS_CHD');
	c_ac_slip_diff_rate_alc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_RATE_ALC');
	c_ac_slip_diff_std_adj CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DIFF_STD_ADJ');
	c_ac_slip_in_stktk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_STKTK');
	c_ac_slip_oth_ccn_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_GR');

	dpt_path VARCHAR[];

	l_jnl_key_map mam_jnl_key_map%ROWTYPE;
	l_bp_rec mbt_ac_cost%ROWTYPE;
	l_jnl_key_col_typ VARCHAR;
	l_jnl_key_set_val VARCHAR(200);
	l_not_null_flg CHAR(1);

	l_itm_alc_flg CHAR(1);
	l_diff_io_sum_flg CHAR(1);
	l_diff_io_pri_flg CHAR(1);
	l_diff_io_rate_flg CHAR(1);
	l_diff_qt_par_flg CHAR(1);
	l_diff_pr_par_flg CHAR(1);
	l_diff_qt_chd_flg CHAR(1);
	l_diff_pr_chd_flg CHAR(1);
	l_diff_wk_flg CHAR(1);
	l_diff_act1_flg CHAR(1);
	l_diff_act2_flg CHAR(1);
	l_diff_act3_flg CHAR(1);
	l_diff_act4_flg CHAR(1);
	l_diff_act5_flg CHAR(1);
	l_diff_rate_itm_flg CHAR(1);
	l_diff_outsrc_sum_flg CHAR(1);
	l_diff_outsrc_pri_flg CHAR(1);
	l_diff_outsrc_rate_flg CHAR(1);
	l_diff_ss_par_flg CHAR(1);
	l_diff_ss_chd_flg CHAR(1);
	l_diff_rate_alc_flg CHAR(1);
	l_diff_std_adj_flg CHAR(1);
	/* 品目集計用 */
	l_itm_sum_sls_cst CHAR(1);
	l_itm_sum_onr_prov_diff CHAR(1);
	l_itm_sum_in_onr_diff CHAR(1);
	l_itm_sum_eom_stk_asm_mis CHAR(1);
	l_itm_sum_stk_asm_diff CHAR(1);
	l_itm_sum_itm_alc CHAR(1);
	l_itm_sum_diff_io_sum CHAR(1);
	l_itm_sum_diff_io_pri CHAR(1);
	l_itm_sum_diff_io_rate CHAR(1);
	l_itm_sum_diff_qt_par CHAR(1);
	l_itm_sum_diff_pr_par CHAR(1);
	l_itm_sum_diff_qt_chd CHAR(1);
	l_itm_sum_diff_pr_chd CHAR(1);
	l_itm_sum_diff_wk CHAR(1);
	l_itm_sum_diff_act1 CHAR(1);
	l_itm_sum_diff_act2 CHAR(1);
	l_itm_sum_diff_act3 CHAR(1);
	l_itm_sum_diff_act4 CHAR(1);
	l_itm_sum_diff_act5 CHAR(1);
	l_itm_sum_diff_rate_itm CHAR(1);
	l_itm_sum_diff_outsrc_sum CHAR(1);
	l_itm_sum_diff_outsrc_pri CHAR(1);
	l_itm_sum_diff_outsrc_rate CHAR(1);
	l_itm_sum_diff_ss_par CHAR(1);
	l_itm_sum_diff_ss_chd CHAR(1);
	l_itm_sum_diff_rate_alc CHAR(1);
	l_itm_sum_diff_std_adj CHAR(1);
	l_slo_no_sls_cst CHAR(1);
	l_slo_no_onr_prov_diff CHAR(1);
	l_slo_no_in_onr_diff CHAR(1);
	l_slo_no_itm_alc CHAR(1);
	l_slo_no_diff_io_sum CHAR(1);
	l_slo_no_diff_io_pri CHAR(1);
	l_slo_no_diff_io_rate CHAR(1);
	l_slo_no_diff_qt_par CHAR(1);
	l_slo_no_diff_pr_par CHAR(1);
	l_slo_no_diff_qt_chd CHAR(1);
	l_slo_no_diff_pr_chd CHAR(1);
	l_slo_no_diff_wk CHAR(1);
	l_slo_no_diff_act1 CHAR(1);
	l_slo_no_diff_act2 CHAR(1);
	l_slo_no_diff_act3 CHAR(1);
	l_slo_no_diff_act4 CHAR(1);
	l_slo_no_diff_act5 CHAR(1);
	l_slo_no_diff_rate_itm CHAR(1);
	l_slo_no_diff_outsrc_sum CHAR(1);
	l_slo_no_diff_outsrc_pri CHAR(1);
	l_slo_no_diff_outsrc_rate CHAR(1);
	l_slo_no_diff_ss_par CHAR(1);
	l_slo_no_diff_ss_chd CHAR(1);
	l_slo_no_diff_rate_alc CHAR(1);
	l_slo_no_diff_std_adj CHAR(1);
	l_po_no_sls_cst CHAR(1);
	l_po_no_onr_prov_diff CHAR(1);
	l_po_no_in_onr_diff CHAR(1);
	l_po_no_itm_alc CHAR(1);
	l_po_no_diff_io_sum CHAR(1);
	l_po_no_diff_io_pri CHAR(1);
	l_po_no_diff_io_rate CHAR(1);
	l_po_no_diff_qt_par CHAR(1);
	l_po_no_diff_pr_par CHAR(1);
	l_po_no_diff_qt_chd CHAR(1);
	l_po_no_diff_pr_chd CHAR(1);
	l_po_no_diff_wk CHAR(1);
	l_po_no_diff_act1 CHAR(1);
	l_po_no_diff_act2 CHAR(1);
	l_po_no_diff_act3 CHAR(1);
	l_po_no_diff_act4 CHAR(1);
	l_po_no_diff_act5 CHAR(1);
	l_po_no_diff_rate_itm CHAR(1);
	l_po_no_diff_outsrc_sum CHAR(1);
	l_po_no_diff_outsrc_pri CHAR(1);
	l_po_no_diff_outsrc_rate CHAR(1);
	l_po_no_diff_ss_par CHAR(1);
	l_po_no_diff_ss_chd CHAR(1);
	l_po_no_diff_rate_alc CHAR(1);
	l_po_no_diff_std_adj CHAR(1);
	l_iv_no_sls_cst CHAR(1);
	l_iv_no_onr_prov_diff CHAR(1);
	l_iv_no_in_onr_diff CHAR(1);
	l_iv_no_itm_alc CHAR(1);
	l_iv_no_diff_io_sum CHAR(1);
	l_iv_no_diff_io_pri CHAR(1);
	l_iv_no_diff_io_rate CHAR(1);
	l_iv_no_diff_qt_par CHAR(1);
	l_iv_no_diff_pr_par CHAR(1);
	l_iv_no_diff_qt_chd CHAR(1);
	l_iv_no_diff_pr_chd CHAR(1);
	l_iv_no_diff_wk CHAR(1);
	l_iv_no_diff_act1 CHAR(1);
	l_iv_no_diff_act2 CHAR(1);
	l_iv_no_diff_act3 CHAR(1);
	l_iv_no_diff_act4 CHAR(1);
	l_iv_no_diff_act5 CHAR(1);
	l_iv_no_diff_rate_itm CHAR(1);
	l_iv_no_diff_outsrc_sum CHAR(1);
	l_iv_no_diff_outsrc_pri CHAR(1);
	l_iv_no_diff_outsrc_rate CHAR(1);
	l_iv_no_diff_ss_par CHAR(1);
	l_iv_no_diff_ss_chd CHAR(1);
	l_iv_no_diff_rate_alc CHAR(1);
	l_iv_no_diff_std_adj CHAR(1);
	l_rev_in_stktk_flg CHAR(1);
	l_rev_oth_ccn_gr_flg CHAR(1);

	l_invalid_rsn_rec mam_ac_rsn[];
	r_invalid_rsn mam_ac_rsn%ROWTYPE;

	l_cnt INTEGER;
	l_co mam_co%ROWTYPE;
	l_co_parm mam_co_parm%ROWTYPE;
	l_end_dt TIMESTAMP(0) WITHOUT TIME ZONE;
	l_comp_flg CHAR(1);
	l_sls_flg CHAR(1);
	l_mfg_flg CHAR(1);
	l_purc_flg CHAR(1);
	l_stk_flg CHAR(1);
	l_wip_flg CHAR(1);
	l_inpt_flg CHAR(1);
	l_adj_flg CHAR(1);
	l_io_onr_flg CHAR(1);
	l_inpt_onr_flg CHAR(1);
	l_st_diff_flg CHAR(1);
	l_stk_loss_flg CHAR(1);
	l_diff_flg CHAR(1);
	l_prod_itm_flg CHAR(1);
	l_prod_itm_ret_flg CHAR(1);
	l_dpt_xfr_flg CHAR(1);
	l_prod_itm_diff_flg CHAR(1);
	l_prod_itm_ret_diff_flg CHAR(1);
	l_dpt_xfr_diff_flg CHAR(1);
	l_sign INTEGER;
	l_dpt1 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_dpt2 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_purc_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_ap_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sls_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_ar_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_gi_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_gr_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_bd_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt1 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt2 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt3 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sppl mam_bp.bp_cd%TYPE;
	l_cst mam_bp.bp_cd%TYPE;
	l_inv_com mam_bp.bp_cd%TYPE;
	l_foreign CHAR(1);
	l_amt mbt_ac_cost.amt%TYPE;
	l_parm mam_sys_parm.parm_val%TYPE;

	i INTEGER;
	sum_i INTEGER;
	l_dpt_map_rec mam_cost_ac_dpt_map[];

	l_jnl_key_map_rec mam_jnl_key_map[];
	r_jnl_key_map mam_jnl_key_map%ROWTYPE;

	l_bp_grp_rec mam_bp[];
	l_msg VARCHAR[];

	z1 RECORD;
	z2 RECORD;
	z3 RECORD;
	z4 RECORD;
	r RECORD;
	x RECORD;

	rec mbt_ac_cost%ROWTYPE;
	recs mbt_ac_cost[];
/*************************************************************************/
BEGIN
	l_co := mapa_co$f_get_co_rec();

	l_co_parm := mgpa_co_parm$f_get_rec();

	/* 月度末日の取得 */
	l_end_dt := mapa_dt$f_get_ym_end_dt_ne(i_ym, l_co.ac_cl_day, l_co.ac_cl_mon_base);

	l_comp_flg := '0';
	l_sls_flg := '0';
	l_mfg_flg := '0';
	l_purc_flg := '0';
	l_stk_flg := '0';
	l_wip_flg := '0';
	l_inpt_flg := '0';
	l_adj_flg := '0';
	l_io_onr_flg := '0';
	l_inpt_onr_flg := '0';
	l_st_diff_flg := '0';
	l_stk_loss_flg := '0';
	l_prod_itm_flg := '0';
	l_prod_itm_ret_flg := '0';
	l_dpt_xfr_flg := '0';
	l_prod_itm_diff_flg := '0';
	l_prod_itm_ret_diff_flg := '0';
	l_dpt_xfr_diff_flg := '0';
	l_itm_alc_flg := '0';
	l_diff_io_sum_flg := '0';
	l_diff_io_pri_flg := '0';
	l_diff_io_rate_flg := '0';
	l_diff_qt_par_flg := '0';
	l_diff_pr_par_flg := '0';
	l_diff_qt_chd_flg := '0';
	l_diff_pr_chd_flg := '0';
	l_diff_wk_flg := '0';
	l_diff_act1_flg := '0';
	l_diff_act2_flg := '0';
	l_diff_act3_flg := '0';
	l_diff_act4_flg := '0';
	l_diff_act5_flg := '0';
	l_diff_rate_itm_flg := '0';
	l_diff_outsrc_sum_flg := '0';
	l_diff_outsrc_pri_flg := '0';
	l_diff_outsrc_rate_flg := '0';
	l_diff_ss_par_flg := '0';
	l_diff_ss_chd_flg := '0';
	l_diff_rate_alc_flg := '0';
	l_diff_std_adj_flg := '0';

	l_itm_sum_sls_cst := '0';
	l_itm_sum_onr_prov_diff := '0';
	l_itm_sum_in_onr_diff := '0';
	l_itm_sum_eom_stk_asm_mis := '0';
	l_itm_sum_stk_asm_diff := '0';
	l_itm_sum_itm_alc := '0';
	l_itm_sum_diff_io_sum := '0';
	l_itm_sum_diff_io_pri := '0';
	l_itm_sum_diff_io_rate := '0';
	l_itm_sum_diff_qt_par := '0';
	l_itm_sum_diff_pr_par := '0';
	l_itm_sum_diff_qt_chd := '0';
	l_itm_sum_diff_pr_chd := '0';
	l_itm_sum_diff_wk := '0';
	l_itm_sum_diff_act1 := '0';
	l_itm_sum_diff_act2 := '0';
	l_itm_sum_diff_act3 := '0';
	l_itm_sum_diff_act4 := '0';
	l_itm_sum_diff_act5 := '0';
	l_itm_sum_diff_rate_itm := '0';
	l_itm_sum_diff_outsrc_sum := '0';
	l_itm_sum_diff_outsrc_pri := '0';
	l_itm_sum_diff_outsrc_rate := '0';
	l_itm_sum_diff_ss_par := '0';
	l_itm_sum_diff_ss_chd := '0';
	l_itm_sum_diff_rate_alc := '0';
	l_itm_sum_diff_std_adj := '0';
	l_slo_no_sls_cst := '1';
	l_slo_no_onr_prov_diff := '1';
	l_slo_no_in_onr_diff := '1';
	l_slo_no_itm_alc := '1';
	l_slo_no_diff_io_sum := '1';
	l_slo_no_diff_io_pri := '1';
	l_slo_no_diff_io_rate := '1';
	l_slo_no_diff_qt_par := '1';
	l_slo_no_diff_pr_par := '1';
	l_slo_no_diff_qt_chd := '1';
	l_slo_no_diff_pr_chd := '1';
	l_slo_no_diff_wk := '1';
	l_slo_no_diff_act1 := '1';
	l_slo_no_diff_act2 := '1';
	l_slo_no_diff_act3 := '1';
	l_slo_no_diff_act4 := '1';
	l_slo_no_diff_act5 := '1';
	l_slo_no_diff_rate_itm := '1';
	l_slo_no_diff_outsrc_sum := '1';
	l_slo_no_diff_outsrc_pri := '1';
	l_slo_no_diff_outsrc_rate := '1';
	l_slo_no_diff_ss_par := '1';
	l_slo_no_diff_ss_chd := '1';
	l_slo_no_diff_rate_alc := '1';
	l_slo_no_diff_std_adj := '1';
	l_po_no_sls_cst := '1';
	l_po_no_onr_prov_diff := '1';
	l_po_no_in_onr_diff := '1';
	l_po_no_itm_alc := '1';
	l_po_no_diff_io_sum := '1';
	l_po_no_diff_io_pri := '1';
	l_po_no_diff_io_rate := '1';
	l_po_no_diff_qt_par := '1';
	l_po_no_diff_pr_par := '1';
	l_po_no_diff_qt_chd := '1';
	l_po_no_diff_pr_chd := '1';
	l_po_no_diff_wk := '1';
	l_po_no_diff_act1 := '1';
	l_po_no_diff_act2 := '1';
	l_po_no_diff_act3 := '1';
	l_po_no_diff_act4 := '1';
	l_po_no_diff_act5 := '1';
	l_po_no_diff_rate_itm := '1';
	l_po_no_diff_outsrc_sum := '1';
	l_po_no_diff_outsrc_pri := '1';
	l_po_no_diff_outsrc_rate := '1';
	l_po_no_diff_ss_par := '1';
	l_po_no_diff_ss_chd := '1';
	l_po_no_diff_rate_alc := '1';
	l_po_no_diff_std_adj := '1';
	l_iv_no_sls_cst := '1';
	l_iv_no_onr_prov_diff := '1';
	l_iv_no_in_onr_diff := '1';
	l_iv_no_itm_alc := '1';
	l_iv_no_diff_io_sum := '1';
	l_iv_no_diff_io_pri := '1';
	l_iv_no_diff_io_rate := '1';
	l_iv_no_diff_qt_par := '1';
	l_iv_no_diff_pr_par := '1';
	l_iv_no_diff_qt_chd := '1';
	l_iv_no_diff_pr_chd := '1';
	l_iv_no_diff_wk := '1';
	l_iv_no_diff_act1 := '1';
	l_iv_no_diff_act2 := '1';
	l_iv_no_diff_act3 := '1';
	l_iv_no_diff_act4 := '1';
	l_iv_no_diff_act5 := '1';
	l_iv_no_diff_rate_itm := '1';
	l_iv_no_diff_outsrc_sum := '1';
	l_iv_no_diff_outsrc_pri := '1';
	l_iv_no_diff_outsrc_rate := '1';
	l_iv_no_diff_ss_par := '1';
	l_iv_no_diff_ss_chd := '1';
	l_iv_no_diff_rate_alc := '1';
	l_iv_no_diff_std_adj := '1';
	l_rev_in_stktk_flg := '0' ;
	l_rev_oth_ccn_gr_flg := '0' ;

	FOR z1 IN
		SELECT
			m.ac_slip_typ,
			m.itm_sum_flg,
			m.slo_no_flg,
			m.po_no_flg,
			m.iv_no_flg
		FROM mam_cost_slip_jnl m
		WHERE 0=0
		AND m.calc_grp_cd = i_calc_grp_cd
	LOOP
		IF z1.ac_slip_typ = c_ac_slip_comp_cst THEN
			l_comp_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_sls_cst THEN
			l_sls_flg := '1';
			l_itm_sum_sls_cst := z1.itm_sum_flg;
			l_slo_no_sls_cst := z1.slo_no_flg;
			l_po_no_sls_cst := z1.po_no_flg;
			l_iv_no_sls_cst := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_mfg THEN
			l_mfg_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_purc_cost THEN
			l_purc_flg := '1';

		ELSIF z1.ac_slip_typ IN (c_ac_slip_eom_stk_prod, c_ac_slip_eom_stk_sls) THEN
			l_stk_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_inp_wip_cst THEN
			l_wip_flg := '1';

		ELSIF z1.ac_slip_typ IN (
			c_ac_slip_input, c_ac_slip_in_onr,
			c_ac_slip_in_ss, c_ac_slip_byprod
		) THEN
			l_inpt_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_cst_io_aod THEN
			l_adj_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_onr_prov_diff THEN
			l_io_onr_flg := '1';
			l_itm_sum_onr_prov_diff := z1.itm_sum_flg;
			l_slo_no_onr_prov_diff := z1.slo_no_flg;
			l_po_no_onr_prov_diff := z1.po_no_flg;
			l_iv_no_onr_prov_diff := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_in_onr_diff THEN
			l_inpt_onr_flg := '1';
			l_itm_sum_in_onr_diff := z1.itm_sum_flg;
			l_slo_no_in_onr_diff := z1.slo_no_flg;
			l_po_no_in_onr_diff := z1.po_no_flg;
			l_iv_no_in_onr_diff := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_stk_asm_diff THEN
			l_st_diff_flg := '1';
			l_itm_sum_stk_asm_diff := z1.itm_sum_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_eom_stk_asm_mis THEN
			l_stk_loss_flg := '1';
			l_itm_sum_eom_stk_asm_mis := z1.itm_sum_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_prod_itm_gr THEN
			l_prod_itm_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_prod_itm_ret_gr THEN
			l_prod_itm_ret_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_dpt_xfr_gr THEN
			l_dpt_xfr_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_prod_itm_diff THEN
			l_prod_itm_diff_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_prod_itm_ret_diff THEN
			l_prod_itm_ret_diff_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_dpt_xfr_diff THEN
			l_dpt_xfr_diff_flg := '1';

		ELSIF z1.ac_slip_typ = c_ac_slip_itm_alc THEN
			l_itm_alc_flg := '1';
			l_itm_sum_itm_alc := z1.itm_sum_flg;
			l_slo_no_itm_alc := z1.slo_no_flg;
			l_po_no_itm_alc := z1.po_no_flg;
			l_iv_no_itm_alc := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_io_sum THEN
			l_diff_io_sum_flg := '1';
			l_itm_sum_diff_io_sum := z1.itm_sum_flg;
			l_slo_no_diff_io_sum := z1.slo_no_flg;
			l_po_no_diff_io_sum := z1.po_no_flg;
			l_iv_no_diff_io_sum := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_io_pri THEN
			l_diff_io_pri_flg := '1';
			l_itm_sum_diff_io_pri := z1.itm_sum_flg;
			l_slo_no_diff_io_pri := z1.slo_no_flg;
			l_po_no_diff_io_pri := z1.po_no_flg;
			l_iv_no_diff_io_pri := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_io_rate THEN
			l_diff_io_rate_flg := '1';
			l_itm_sum_diff_io_rate := z1.itm_sum_flg;
			l_slo_no_diff_io_rate := z1.slo_no_flg;
			l_po_no_diff_io_rate := z1.po_no_flg;
			l_iv_no_diff_io_rate := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_qt_par THEN
			l_diff_qt_par_flg := '1';
			l_itm_sum_diff_qt_par := z1.itm_sum_flg;
			l_slo_no_diff_qt_par := z1.slo_no_flg;
			l_po_no_diff_qt_par := z1.po_no_flg;
			l_iv_no_diff_qt_par := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_pr_par THEN
			l_diff_pr_par_flg := '1';
			l_itm_sum_diff_pr_par := z1.itm_sum_flg;
			l_slo_no_diff_pr_par := z1.slo_no_flg;
			l_po_no_diff_pr_par := z1.po_no_flg;
			l_iv_no_diff_pr_par := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_qt_chd THEN
			l_diff_qt_chd_flg := '1';
			l_itm_sum_diff_qt_chd := z1.itm_sum_flg;
			l_slo_no_diff_qt_chd := z1.slo_no_flg;
			l_po_no_diff_qt_chd := z1.po_no_flg;
			l_iv_no_diff_qt_chd := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_pr_chd THEN
			l_diff_pr_chd_flg := '1';
			l_itm_sum_diff_pr_chd := z1.itm_sum_flg;
			l_slo_no_diff_pr_chd := z1.slo_no_flg;
			l_po_no_diff_pr_chd := z1.po_no_flg;
			l_iv_no_diff_pr_chd := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_wk THEN
			l_diff_wk_flg := '1';
			l_itm_sum_diff_wk := z1.itm_sum_flg;
			l_slo_no_diff_wk := z1.slo_no_flg;
			l_po_no_diff_wk := z1.po_no_flg;
			l_iv_no_diff_wk := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_act1 THEN
			l_diff_act1_flg := '1';
			l_itm_sum_diff_act1 := z1.itm_sum_flg;
			l_slo_no_diff_act1 := z1.slo_no_flg;
			l_po_no_diff_act1 := z1.po_no_flg;
			l_iv_no_diff_act1 := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_act2 THEN
			l_diff_act2_flg := '1';
			l_itm_sum_diff_act2 := z1.itm_sum_flg;
			l_slo_no_diff_act2 := z1.slo_no_flg;
			l_po_no_diff_act2 := z1.po_no_flg;
			l_iv_no_diff_act2 := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_act3 THEN
			l_diff_act3_flg := '1';
			l_itm_sum_diff_act3 := z1.itm_sum_flg;
			l_slo_no_diff_act3 := z1.slo_no_flg;
			l_po_no_diff_act3 := z1.po_no_flg;
			l_iv_no_diff_act3 := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_act4 THEN
			l_diff_act4_flg := '1';
			l_itm_sum_diff_act4 := z1.itm_sum_flg;
			l_slo_no_diff_act4 := z1.slo_no_flg;
			l_po_no_diff_act4 := z1.po_no_flg;
			l_iv_no_diff_act4 := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_act5 THEN
			l_diff_act5_flg := '1';
			l_itm_sum_diff_act5 := z1.itm_sum_flg;
			l_slo_no_diff_act5 := z1.slo_no_flg;
			l_po_no_diff_act5 := z1.po_no_flg;
			l_iv_no_diff_act5 := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_rate_itm THEN
			l_diff_rate_itm_flg := '1';
			l_itm_sum_diff_rate_itm := z1.itm_sum_flg;
			l_slo_no_diff_rate_itm := z1.slo_no_flg;
			l_po_no_diff_rate_itm := z1.po_no_flg;
			l_iv_no_diff_rate_itm := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_outsrc_sum THEN
			l_diff_outsrc_sum_flg := '1';
			l_itm_sum_diff_outsrc_sum := z1.itm_sum_flg;
			l_slo_no_diff_outsrc_sum := z1.slo_no_flg;
			l_po_no_diff_outsrc_sum := z1.po_no_flg;
			l_iv_no_diff_outsrc_sum := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_outsrc_pri THEN
			l_diff_outsrc_pri_flg := '1';
			l_itm_sum_diff_outsrc_pri := z1.itm_sum_flg;
			l_slo_no_diff_outsrc_pri := z1.slo_no_flg;
			l_po_no_diff_outsrc_pri := z1.po_no_flg;
			l_iv_no_diff_outsrc_pri := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_outsrc_rate THEN
			l_diff_outsrc_rate_flg := '1';
			l_itm_sum_diff_outsrc_rate := z1.itm_sum_flg;
			l_slo_no_diff_outsrc_rate := z1.slo_no_flg;
			l_po_no_diff_outsrc_rate := z1.po_no_flg;
			l_iv_no_diff_outsrc_rate := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_ss_par THEN
			l_diff_ss_par_flg := '1';
			l_itm_sum_diff_ss_par := z1.itm_sum_flg;
			l_slo_no_diff_ss_par := z1.slo_no_flg;
			l_po_no_diff_ss_par := z1.po_no_flg;
			l_iv_no_diff_ss_par := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_ss_chd THEN
			l_diff_ss_chd_flg := '1';
			l_itm_sum_diff_ss_chd := z1.itm_sum_flg;
			l_slo_no_diff_ss_chd := z1.slo_no_flg;
			l_po_no_diff_ss_chd := z1.po_no_flg;
			l_iv_no_diff_ss_chd := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_rate_alc THEN
			l_diff_rate_alc_flg := '1';
			l_itm_sum_diff_rate_alc := z1.itm_sum_flg;
			l_slo_no_diff_rate_alc := z1.slo_no_flg;
			l_po_no_diff_rate_alc := z1.po_no_flg;
			l_iv_no_diff_rate_alc := z1.iv_no_flg;

		ELSIF z1.ac_slip_typ = c_ac_slip_diff_std_adj THEN
			l_diff_std_adj_flg := '1';
			l_itm_sum_diff_std_adj := z1.itm_sum_flg;
			l_slo_no_diff_std_adj := z1.slo_no_flg;
			l_po_no_diff_std_adj := z1.po_no_flg;
			l_iv_no_diff_std_adj := z1.iv_no_flg;

		ELSE
			NULL;
		END IF;
	END LOOP;

	l_invalid_rsn_rec := '{}';
	FOR z2 IN
		SELECT m.parm_val
		FROM mgt_parm m
		WHERE 0=0
		AND m.calc_grp_cd = i_calc_grp_cd
		AND m.parm_key = 'ETC_AC_RSN_INVALID'
	LOOP
		IF z2.parm_val = '1' THEN
			FOR z3 IN
				SELECT
					m.ac_rsn_cd,
					m.ac_invalid_flg
				FROM mam_ac_rsn m
				WHERE 0=0
				AND m.ac_invalid_flg = '1'
				AND m.del_flg = '0'
			LOOP
				r_invalid_rsn.ac_rsn_cd := z3.ac_rsn_cd;
				r_invalid_rsn.ac_invalid_flg := z3.ac_invalid_flg;
				l_invalid_rsn_rec[COALESCE(array_length(l_invalid_rsn_rec, 1), 0) + 1] := r_invalid_rsn;
			END LOOP;
		END IF;
	END LOOP;

	FOR z3 IN (
		SELECT
			m.parm_key,
			m.parm_val
		FROM mgt_parm m
		WHERE 0=0
		AND m.calc_grp_cd = i_calc_grp_cd
		AND m.parm_key IN ('ETC_AC_IN_STKTK', 'ETC_AC_OTH_CCN_GR')
		AND m.parm_val = '1'
		)
	LOOP
		IF z3.parm_key = 'ETC_AC_IN_STKTK' THEN
			l_rev_in_stktk_flg := '1' ;
		END IF ;

		IF z3.parm_key = 'ETC_AC_OTH_CCN_GR' THEN
			l_rev_oth_ccn_gr_flg := '1' ;
		END IF ;
	END LOOP ;

	DELETE FROM mbt_ac_cost t
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ac_ym = i_ym
	;

	l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP');
	/* 仕訳キー対応マスタの取得 */
	l_cnt := 0;
	l_jnl_key_map_rec := '{}';
	FOR r_jnl_key_map IN
		SELECT *
		FROM mam_jnl_key_map m
		WHERE 0=0
		AND m.cost_flg = c_on
		ORDER BY m.ac_slip_typ, m.jnl_key_col_typ
	LOOP
		l_cnt := l_cnt + 1;
		l_jnl_key_map_rec[l_cnt] := r_jnl_key_map;
	END LOOP;

	l_dpt_map_rec := '{}';
	i := 0;
	sum_i := 0;
	FOR x IN
		/* 投入・売上以外に関する受払原価 */
		SELECT
			x1.calc_rec_typ, x1.cost_io_typ,
			x1.wg_cd,
			x1.mng_dpt_cd dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3,
			x1.itm_nm, x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd,
			x1.bp_cd, x1.stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.other_dpt_cd dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			SUM(x1.qty) qty,
			x1.trd_grp,
			SUM(x1.act_cost) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			m1.area_cd,
			m1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x1.itm_grp_cd1,
			x1.itm_grp_cd2,
			x1.itm_grp_cd3,
			x1.itm_grp_cd4,
			x1.itm_grp_cd5,
			x1.itm_grp_cd6,
			x1.itm_grp_cd7,
			x1.itm_grp_cd8,
			x1.itm_grp_cd9,
			x1.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			SELECT
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
				t1.wg_cd, t1.mng_dpt_cd,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				CASE m5.po_no_flg WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE m5.slo_no_flg WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE m5.iv_no_flg WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.trd_grp END trd_grp,
				COALESCE(SUM(t2.act_cost), 0) act_cost,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM (
				SELECT
					t.calc_grp_cd, t.calc_no, t.top_rec_no,
					t.calc_rec_typ, t.cost_io_typ,
					t.wg_cd, t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.ac_rsn_cd,
					t.loc_cd, t.str_ln_cd,
					t.bp_cd, t.stk_bp_cd,
					t.po_no, t.slo_no, t.iv_no,
					CASE
						WHEN t.calc_rec_typ = c_calc_rec_purc THEN t.alc_dpt_cd
						ELSE t.other_dpt_cd
					END other_dpt_cd,
					t.asst_typ,
					t.repurc_obli_flg,
					t.qty,
					t.trd_grp,
					CASE
						WHEN t.calc_rec_typ = c_calc_rec_end_stk THEN
							CASE t.asst_typ
								WHEN c_asst_prod THEN c_ac_slip_eom_stk_prod
								ELSE c_ac_slip_eom_stk_sls
							END
						WHEN t.calc_rec_typ = c_calc_rec_end_wip THEN c_ac_slip_inp_wip_cst
						WHEN t.calc_rec_typ = c_calc_rec_comp THEN c_ac_slip_comp_cst
						WHEN t.calc_rec_typ = c_calc_rec_inst THEN c_ac_slip_mfg
						WHEN t.calc_rec_typ = c_calc_rec_purc THEN c_ac_slip_purc_cost
						WHEN t.calc_rec_typ = c_calc_rec_io THEN
							CASE t.cost_io_typ
								WHEN c_cost_io_ffr_prov THEN c_ac_slip_ffr_prov_cst
								WHEN c_cost_io_onr_prov THEN c_ac_slip_onr_prov_cst
								WHEN c_cost_io_stk_in THEN
									CASE t.ac_slip_typ
										WHEN c_ac_slip_prod_itm_so THEN c_ac_slip_prod_itm_gr
										WHEN c_ac_slip_prod_itm_ret_so THEN c_ac_slip_prod_itm_ret_gr
										WHEN c_ac_slip_dpt_xfr_so THEN c_ac_slip_dpt_xfr_gr
										ELSE t.ac_slip_typ
									END
								ELSE t.ac_slip_typ
							END
						WHEN t.calc_rec_typ = c_calc_rec_adj THEN c_ac_slip_cst_io_aod
						ELSE NULL
					END ac_slip_typ
				FROM mgt_acc_top t
				WHERE 0=0
				AND t.calc_no = i_calc_no
				AND t.calc_grp_cd = i_calc_grp_cd
				AND t.asst_typ IN (c_asst_prod, c_asst_sls)
				AND (
					l_comp_flg = '1' AND t.calc_rec_typ = c_calc_rec_comp
					OR
					l_mfg_flg = '1' AND t.calc_rec_typ = c_calc_rec_inst
					OR
					l_purc_flg = '1' AND t.calc_rec_typ = c_calc_rec_purc
					OR
					t.calc_rec_typ = c_calc_rec_io
					OR
					l_stk_flg = '1' AND t.calc_rec_typ = c_calc_rec_end_stk AND t.ym = i_ym
					OR
					l_wip_flg = '1' AND t.calc_rec_typ = c_calc_rec_end_wip AND t.ym = i_ym
					OR
					l_adj_flg = '1' AND t.calc_rec_typ = c_calc_rec_adj
					)
			) t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				AND t2.expns_typ = c_enpns_prd
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			LEFT OUTER JOIN mam_cost_slip_jnl m5 ON (m5.calc_grp_cd = t1.calc_grp_cd AND m5.ac_slip_typ = t1.ac_slip_typ)
			WHERE 0=0
			AND (
				m5.calc_grp_cd IS NOT NULL
				OR
				l_prod_itm_diff_flg = '1' AND t1.ac_slip_typ = c_ac_slip_prod_itm_gr
				OR
				l_prod_itm_ret_diff_flg = '1' AND t1.ac_slip_typ = c_ac_slip_prod_itm_ret_gr
				OR
				l_dpt_xfr_diff_flg = '1' AND t1.ac_slip_typ = c_ac_slip_dpt_xfr_gr
				OR
				l_purc_flg = '1' AND t1.ac_slip_typ = c_ac_slip_purc
				)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = t1.ac_slip_typ
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			GROUP BY
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
				t1.wg_cd, t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				COALESCE(m4.itm_nm, m1.itm_nm),
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				t1.po_no, t1.slo_no, t1.iv_no,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty,
				t1.trd_grp,
				m1.itm_grp_cd1, m1.itm_grp_cd2, m1.itm_grp_cd3, m1.itm_grp_cd4, m1.itm_grp_cd5,
				m1.itm_grp_cd6, m1.itm_grp_cd7, m1.itm_grp_cd8, m1.itm_grp_cd9, m1.itm_grp_cd10,
				m5.itm_sum_flg,
				m5.po_no_flg, m5.slo_no_flg, m5.iv_no_flg
			) x1
		LEFT OUTER JOIN mam_bp m1 ON (COALESCE(x1.stk_bp_cd, x1.bp_cd) = m1.bp_cd AND m1.del_flg = '0')
		WHERE 0=0
		GROUP BY
			x1.calc_rec_typ, x1.cost_io_typ,
			x1.wg_cd, x1.mng_dpt_cd,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3,
			x1.itm_nm, x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd,
			x1.bp_cd, x1.stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.other_dpt_cd,
			x1.asst_typ,
			x1.repurc_obli_flg,
			x1.trd_grp,
			m1.area_cd, m1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10
		UNION ALL
		/* 投入に関する原価 */
		SELECT
			x2.calc_rec_typ, x2.cost_io_typ,
			x2.wg_cd,
			x2.mng_dpt_cd dpt_cd1,
			CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.itm_cd END itm_cd,
			CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.itm_sub1 END itm_sub1,
			CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.itm_sub2 END itm_sub2,
			CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.itm_sub3 END itm_sub3,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_nm END itm_nm,
			x2.itm_jnl_cd, x2.ac_itm_grp_cd, x2.unit_cd,
			CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.lot_no END lot_no,
			CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.sublot_no END sublot_no,
			x2.sno1, x2.sno2, x2.sno3, x2.sno4,
			x2.ac_slip_typ, x2.ac_rsn_cd,
			x2.loc_cd, x2.str_ln_cd,
			x2.bp_cd, x2.stk_bp_cd,
			CASE m5.po_no_flg WHEN c_off THEN NULL ELSE t1.po_no END po_no,
			CASE m5.slo_no_flg WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
			CASE m5.iv_no_flg WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
			t1.mng_dpt_cd dpt_cd2,
			x2.asst_typ,
			x2.repurc_obli_flg,
			SUM(x2.qty) qty,
			NULL trd_grp,
			SUM(x2.act_cost) amt,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.itm_cd END trd_itm_cd,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.itm_sub1 END trd_itm_sub1,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.itm_sub2 END trd_itm_sub2,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.itm_sub3 END trd_itm_sub3,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END trd_itm_nm,
			m1.itm_jnl_cd trd_itm_jnl_cd,
			m1.ac_itm_grp_cd trd_ac_itm_grp_cd,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.lot_no END trd_lot_no,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.sublot_no END trd_sublot_no,
			t1.sno1 trd_sno1,
			t1.sno2 trd_sno2,
			t1.sno3 trd_sno3,
			t1.sno4 trd_sno4,
			m2.area_cd,
			m2.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd1 END itm_grp_cd1,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd2 END itm_grp_cd2,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd3 END itm_grp_cd3,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd4 END itm_grp_cd4,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd5 END itm_grp_cd5,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd6 END itm_grp_cd6,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd7 END itm_grp_cd7,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd8 END itm_grp_cd8,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd9 END itm_grp_cd9,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd10 END itm_grp_cd10,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END trd_itm_grp_cd1,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END trd_itm_grp_cd2,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END trd_itm_grp_cd3,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END trd_itm_grp_cd4,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END trd_itm_grp_cd5,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END trd_itm_grp_cd6,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END trd_itm_grp_cd7,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END trd_itm_grp_cd8,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END trd_itm_grp_cd9,
			CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END trd_itm_grp_cd10
		FROM (
			SELECT
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ, t1.ym,
				t1.wg_cd, t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				COALESCE(m4.itm_nm, m1.itm_nm) itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty,
				t1.itm_mfg_inst_no,
				t1.mfg_act_no,
				t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
				COALESCE(SUM(t2.act_cost), 0) act_cost,
				m1.itm_grp_cd1, m1.itm_grp_cd2, m1.itm_grp_cd3, m1.itm_grp_cd4, m1.itm_grp_cd5,
				m1.itm_grp_cd6, m1.itm_grp_cd7, m1.itm_grp_cd8, m1.itm_grp_cd9, m1.itm_grp_cd10
			FROM (
				SELECT
					t.calc_grp_cd, t.calc_no, t.top_rec_no, t.ym,
					t.calc_rec_typ, t.cost_io_typ,
					t.wg_cd, t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.ac_rsn_cd,
					t.loc_cd, t.str_ln_cd,
					t.bp_cd, t.stk_bp_cd,
					t.other_dpt_cd,
					t.asst_typ,
					t.repurc_obli_flg,
					t.qty,
					t.itm_mfg_inst_no,
					t.mfg_act_no,
					t.par_itm_cd,
					t.par_itm_sub1,
					t.par_itm_sub2,
					t.par_itm_sub3,
					CASE t.asst_typ
						WHEN c_asst_oth THEN
							CASE t.ac_slip_typ
								WHEN c_ac_slip_in_ss THEN c_ac_slip_in_ss
								ELSE c_ac_slip_in_onr
							END
						ELSE
							CASE t.ac_slip_typ
								WHEN c_ac_slip_byprod THEN t.ac_slip_typ
								ELSE
									CASE
										WHEN t.repurc_obli_flg = '1' THEN c_ac_slip_in_onr
										ELSE c_ac_slip_input
									END
							END
					END ac_slip_typ
				FROM mgt_acc_top t
				WHERE 0=0
				AND t.calc_no = i_calc_no
				AND t.calc_grp_cd = i_calc_grp_cd
				AND t.calc_rec_typ = c_calc_rec_inpt
				AND l_inpt_flg = '1'
			) t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				AND t2.expns_typ = c_enpns_prd
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = t1.ac_slip_typ
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			GROUP BY
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ, t1.ym,
				t1.wg_cd, t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				COALESCE(m4.itm_nm, m1.itm_nm),
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty,
				t1.itm_mfg_inst_no,
				t1.mfg_act_no,
				t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
				m1.itm_grp_cd1, m1.itm_grp_cd2, m1.itm_grp_cd3, m1.itm_grp_cd4, m1.itm_grp_cd5,
				m1.itm_grp_cd6, m1.itm_grp_cd7, m1.itm_grp_cd8, m1.itm_grp_cd9, m1.itm_grp_cd10
			) x2
			INNER JOIN mgt_acc_top t1 ON
				(0=0
				AND t1.calc_no = i_calc_no
				AND t1.calc_grp_cd = i_calc_grp_cd
				AND t1.itm_cd = x2.par_itm_cd
				AND t1.itm_sub1 = x2.par_itm_sub1
				AND t1.itm_sub2 = x2.par_itm_sub2
				AND t1.itm_sub3 = x2.par_itm_sub3
				AND t1.itm_mfg_inst_no = x2.itm_mfg_inst_no
				AND t1.mfg_act_no = x2.mfg_act_no
				AND t1.ym = x2.ym
				AND t1.calc_rec_typ = c_calc_rec_inst
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (x2.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			INNER JOIN mam_cost_slip_jnl m5 ON (m5.ac_slip_typ = x2.ac_slip_typ AND m5.calc_grp_cd = i_calc_grp_cd)
			WHERE 0=0
			GROUP BY
				x2.calc_rec_typ, x2.cost_io_typ, x2.wg_cd, x2.mng_dpt_cd,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.itm_cd END,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.itm_sub1 END,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.itm_sub2 END,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.itm_sub3 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_nm END,
				x2.itm_jnl_cd, x2.ac_itm_grp_cd, x2.unit_cd,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.lot_no END,
				CASE m5.itm_sum_flg WHEN c_on THEN c_null_val ELSE x2.sublot_no END,
				x2.sno1, x2.sno2, x2.sno3, x2.sno4,
				x2.ac_slip_typ, x2.ac_rsn_cd,
				x2.loc_cd, x2.str_ln_cd,
				x2.bp_cd, x2.stk_bp_cd,
				CASE m5.po_no_flg WHEN c_off THEN NULL ELSE t1.po_no END,
				CASE m5.slo_no_flg WHEN c_off THEN NULL ELSE t1.slo_no END,
				CASE m5.iv_no_flg WHEN c_off THEN NULL ELSE t1.iv_no END,
				t1.mng_dpt_cd,
				x2.asst_typ,
				x2.repurc_obli_flg,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.itm_cd END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.itm_sub1 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.itm_sub2 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.itm_sub3 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.lot_no END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE t1.sublot_no END,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				m2.area_cd, m2.cntry_cd,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd1 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd2 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd3 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd4 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd5 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd6 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd7 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd8 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd9 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE x2.itm_grp_cd10 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END,
				CASE m5.itm_sum_flg WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END
		UNION ALL
		/* 売上に関する原価 */
		SELECT
			x3.calc_rec_typ, x3.cost_io_typ,
			x3.wg_cd,
			x3.mng_dpt_cd dpt_cd1,
			x3.itm_cd, x3.itm_sub1, x3.itm_sub2, x3.itm_sub3,
			x3.itm_nm, x3.itm_jnl_cd, x3.ac_itm_grp_cd, x3.unit_cd,
			x3.lot_no, x3.sublot_no, x3.sno1, x3.sno2, x3.sno3, x3.sno4,
			x3.ac_slip_typ, x3.ac_rsn_cd,
			x3.loc_cd, x3.str_ln_cd,
			x3.bp_cd, x3.stk_bp_cd,
			x3.po_no, x3.slo_no, x3.iv_no,
			x3.other_dpt_cd dpt_cd2,
			x3.asst_typ,
			x3.repurc_obli_flg,
			SUM(x3.qty) qty,
			NULL trd_grp,
			SUM(x3.act_cost) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			m1.area_cd,
			m1.cntry_cd,
			x3.SLS_DPT_CD,
			x3.SLS_USR_CD usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x3.itm_grp_cd1,
			x3.itm_grp_cd2,
			x3.itm_grp_cd3,
			x3.itm_grp_cd4,
			x3.itm_grp_cd5,
			x3.itm_grp_cd6,
			x3.itm_grp_cd7,
			x3.itm_grp_cd8,
			x3.itm_grp_cd9,
			x3.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			SELECT
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_sls_cst WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_sls_cst WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_sls_cst WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_sls_cst WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_sls_cst WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_sls_cst WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				CASE l_po_no_sls_cst WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_sls_cst WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_sls_cst WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty, t3.sls_dpt_cd, t3.sls_usr_cd,
				COALESCE(SUM(t2.act_cost), 0) act_cost,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_sls_cst WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM (
				SELECT
					t.calc_grp_cd, t.calc_no, t.top_rec_no,
					t.calc_rec_typ, t.cost_io_typ,
					t.act_id, t.act_id_sub,
					t.wg_cd, t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.ac_rsn_cd,
					t.loc_cd, t.str_ln_cd,
					t.bp_cd, t.stk_bp_cd,
					t.po_no, t.slo_no, t.iv_no,
					t.other_dpt_cd,
					t.asst_typ,
					t.repurc_obli_flg,
					t.qty,
					c_ac_slip_sls_cst ac_slip_typ
				FROM mgt_acc_top t
				WHERE 0=0
				AND t.calc_no = i_calc_no
				AND t.calc_grp_cd = i_calc_grp_cd
				AND t.asst_typ IN (c_asst_prod, c_asst_sls)
				AND t.calc_rec_typ = c_calc_rec_sls
				AND l_sls_flg = '1'
			) t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				AND t2.expns_typ = c_enpns_prd
				)
			INNER JOIN mgt_calc_sls t3 ON
				(0=0
				AND t1.calc_no = t3.calc_no
				AND t1.calc_grp_cd = t3.calc_grp_cd
				AND t1.act_id = t3.act_sls_id
				AND t1.act_id_sub = t3.act_sls_id_sub
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND EXISTS (
					SELECT 'X'
					FROM mam_cost_slip_jnl m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = t1.ac_slip_typ
					)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = t1.ac_slip_typ
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			GROUP BY
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
				t1.wg_cd, t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				COALESCE(m4.itm_nm, m1.itm_nm),
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				t1.po_no, t1.slo_no, t1.iv_no,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty,
				t3.sls_dpt_cd, t3.sls_usr_cd,
				m1.itm_grp_cd1, m1.itm_grp_cd2, m1.itm_grp_cd3, m1.itm_grp_cd4, m1.itm_grp_cd5,
				m1.itm_grp_cd6, m1.itm_grp_cd7, m1.itm_grp_cd8, m1.itm_grp_cd9, m1.itm_grp_cd10
		) x3
		LEFT OUTER JOIN mam_bp m1 ON (x3.bp_cd = m1.bp_cd AND m1.del_flg = '0')
		WHERE 0=0
		GROUP BY
			x3.calc_rec_typ, x3.cost_io_typ,
			x3.wg_cd, x3.mng_dpt_cd,
			x3.itm_cd, x3.itm_sub1, x3.itm_sub2, x3.itm_sub3,
			x3.itm_nm, x3.itm_jnl_cd, x3.ac_itm_grp_cd, x3.unit_cd,
			x3.lot_no, x3.sublot_no, x3.sno1, x3.sno2, x3.sno3, x3.sno4,
			x3.ac_slip_typ, x3.ac_rsn_cd,
			x3.loc_cd, x3.str_ln_cd,
			x3.bp_cd, x3.stk_bp_cd,
			x3.po_no, x3.slo_no, x3.iv_no,
			x3.other_dpt_cd,
			x3.asst_typ,
			x3.repurc_obli_flg,
			m1.area_cd, m1.cntry_cd,
			x3.sls_dpt_cd, x3.sls_usr_cd,
			x3.itm_grp_cd1, x3.itm_grp_cd2, x3.itm_grp_cd3, x3.itm_grp_cd4, x3.itm_grp_cd5,
			x3.itm_grp_cd6, x3.itm_grp_cd7, x3.itm_grp_cd8, x3.itm_grp_cd9, x3.itm_grp_cd10
		UNION ALL
		/* 有償支給差益 */
		SELECT
			x4.calc_rec_typ, x4.cost_io_typ,
			x4.wg_cd,
			x4.mng_dpt_cd dpt_cd1,
			x4.itm_cd, x4.itm_sub1, x4.itm_sub2, x4.itm_sub3,
			x4.itm_nm, x4.itm_jnl_cd, x4.ac_itm_grp_cd, x4.unit_cd,
			x4.lot_no, x4.sublot_no, x4.sno1, x4.sno2, x4.sno3, x4.sno4,
			x4.ac_slip_typ, x4.ac_rsn_cd,
			x4.loc_cd, x4.str_ln_cd,
			x4.bp_cd, x4.stk_bp_cd,
			x4.po_no, x4.slo_no, x4.iv_no,
			x4.other_dpt_cd dpt_cd2,
			x4.asst_typ,
			x4.repurc_obli_flg,
			SUM(x4.qty) qty,
			NULL trd_grp,
			SUM(x4.act_cost) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			m1.area_cd,
			m1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x4.itm_grp_cd1,
			x4.itm_grp_cd2,
			x4.itm_grp_cd3,
			x4.itm_grp_cd4,
			x4.itm_grp_cd5,
			x4.itm_grp_cd6,
			x4.itm_grp_cd7,
			x4.itm_grp_cd8,
			x4.itm_grp_cd9,
			x4.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			SELECT
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				CASE l_po_no_onr_prov_diff WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_onr_prov_diff WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_onr_prov_diff WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty,
				t1.amt - COALESCE(SUM(t2.act_cost), 0) act_cost,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_onr_prov_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
				FROM (
					SELECT
						t.calc_grp_cd, t.calc_no, t.top_rec_no,
						t.calc_rec_typ, t.cost_io_typ,
						t.act_id, t.act_id_sub,
						t.wg_cd, t.mng_dpt_cd,
						t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
						t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
						t.ac_rsn_cd,
						t.loc_cd, t.str_ln_cd,
						t.bp_cd, t.stk_bp_cd,
						t.po_no, t.slo_no, t.iv_no,
						t.other_dpt_cd,
						t.asst_typ,
						t.repurc_obli_flg,
						t.qty,
						COALESCE(t.amt, 0) amt,
						c_ac_slip_onr_prov_diff ac_slip_typ
					FROM mgt_acc_top t
					WHERE 0=0
					AND t.calc_no = i_calc_no
					AND t.calc_grp_cd = i_calc_grp_cd
					AND t.calc_rec_typ = c_calc_rec_io
					AND t.cost_io_typ = c_cost_io_onr_prov
					AND l_io_onr_flg = '1'
				) t1
				LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
					(0=0
					AND t1.calc_no = t2.calc_no
					AND t1.calc_grp_cd = t2.calc_grp_cd
					AND t1.top_rec_no = t2.top_rec_no
					AND t2.expns_typ = c_enpns_prd
					)
				LEFT OUTER JOIN mam_itm_srch m1 ON
					(0=0
					AND t1.itm_cd = m1.itm_cd
					AND t1.itm_sub1 = m1.itm_sub1
					AND t1.itm_sub2 = m1.itm_sub2
					AND t1.itm_sub3 = m1.itm_sub3
					AND m1.del_flg = '0'
					AND m1.release_flg = '1'
					)
				LEFT OUTER JOIN mam_sundry_itm m4 ON
					(0=0
					AND t1.itm_cd = m4.itm_cd
					AND t1.itm_sub1 = m4.itm_sub1
					AND t1.itm_sub2 = m4.itm_sub2
					AND t1.itm_sub3 = m4.itm_sub3
					AND t1.sno1 = m4.sno1
					AND t1.sno2 = m4.sno2
					AND t1.sno3 = m4.sno3
					AND t1.sno4 = m4.sno4
					)
				WHERE 0=0
				AND NOT EXISTS (
						SELECT 'X'
						FROM mam_cost_ac_out m
						WHERE 0=0
						AND m.calc_grp_cd = t1.calc_grp_cd
						AND m.ac_slip_typ = t1.ac_slip_typ
						AND m.itm_jnl_cd = m1.itm_jnl_cd
						AND m.st_dt <= l_end_dt
						AND m.end_dt >= l_end_dt
						)
				GROUP BY
					t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
					t1.wg_cd, t1.mng_dpt_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					COALESCE(m4.itm_nm, m1.itm_nm),
					m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.ac_slip_typ, t1.ac_rsn_cd,
					t1.loc_cd, t1.str_ln_cd,
					t1.bp_cd, t1.stk_bp_cd,
					t1.po_no, t1.slo_no, t1.iv_no,
					t1.other_dpt_cd,
					t1.asst_typ,
					t1.repurc_obli_flg,
					t1.qty, t1.amt,
					m1.itm_grp_cd1, m1.itm_grp_cd2, m1.itm_grp_cd3, m1.itm_grp_cd4, m1.itm_grp_cd5,
					m1.itm_grp_cd6, m1.itm_grp_cd7, m1.itm_grp_cd8, m1.itm_grp_cd9, m1.itm_grp_cd10
			) x4
			LEFT OUTER JOIN mam_bp m1 ON (x4.bp_cd = m1.bp_cd AND m1.del_flg = '0')
			WHERE 0=0
			GROUP BY
				x4.calc_rec_typ, x4.cost_io_typ,
				x4.wg_cd, x4.mng_dpt_cd,
				x4.itm_cd, x4.itm_sub1, x4.itm_sub2, x4.itm_sub3,
				x4.itm_nm, x4.itm_jnl_cd, x4.ac_itm_grp_cd, x4.unit_cd,
				x4.lot_no, x4.sublot_no, x4.sno1, x4.sno2, x4.sno3, x4.sno4,
				x4.ac_slip_typ, x4.ac_rsn_cd,
				x4.loc_cd, x4.str_ln_cd,
				x4.bp_cd, x4.stk_bp_cd,
				x4.po_no, x4.slo_no, x4.iv_no,
				x4.other_dpt_cd,
				x4.asst_typ,
				x4.repurc_obli_flg,
				m1.area_cd, m1.cntry_cd,
				x4.itm_grp_cd1, x4.itm_grp_cd2, x4.itm_grp_cd3, x4.itm_grp_cd4, x4.itm_grp_cd5,
				x4.itm_grp_cd6, x4.itm_grp_cd7, x4.itm_grp_cd8, x4.itm_grp_cd9, x4.itm_grp_cd10
		UNION ALL
		/* 投入（有償差益） */
		SELECT
			x5.calc_rec_typ, x5.cost_io_typ,
			x5.wg_cd,
			x5.mng_dpt_cd dpt_cd1,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.itm_cd END itm_cd,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.itm_sub1 END itm_sub1,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.itm_sub2 END itm_sub2,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.itm_sub3 END itm_sub3,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_nm END itm_nm,
			x5.itm_jnl_cd, x5.ac_itm_grp_cd, x5.unit_cd,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.lot_no END lot_no,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.sublot_no END sublot_no,
			x5.sno1, x5.sno2, x5.sno3, x5.sno4,
			x5.ac_slip_typ, x5.ac_rsn_cd,
			x5.loc_cd, x5.str_ln_cd,
			x5.bp_cd, x5.stk_bp_cd,
			CASE l_po_no_in_onr_diff WHEN c_off THEN NULL ELSE t1.po_no END po_no,
			CASE l_slo_no_in_onr_diff WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
			CASE l_iv_no_in_onr_diff WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
			t1.mng_dpt_cd dpt_cd2,
			x5.asst_typ,
			x5.repurc_obli_flg,
			SUM(x5.qty) qty,
			NULL trd_grp,
			SUM(x5.act_cost) amt,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.itm_cd END trd_itm_cd,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.itm_sub1 END trd_itm_sub1,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.itm_sub2 END trd_itm_sub2,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.itm_sub3 END trd_itm_sub3,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END trd_itm_nm,
			m1.itm_jnl_cd trd_itm_jnl_cd,
			m1.ac_itm_grp_cd trd_ac_itm_grp_cd,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.lot_no END trd_lot_no,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.sublot_no END trd_sublot_no,
			t1.sno1 trd_sno1,
			t1.sno2 trd_sno2,
			t1.sno3 trd_sno3,
			t1.sno4 trd_sno4,
			m2.area_cd,
			m2.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd1 END itm_grp_cd1,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd2 END itm_grp_cd2,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd3 END itm_grp_cd3,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd4 END itm_grp_cd4,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd5 END itm_grp_cd5,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd6 END itm_grp_cd6,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd7 END itm_grp_cd7,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd8 END itm_grp_cd8,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd9 END itm_grp_cd9,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd10 END itm_grp_cd10,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END trd_itm_grp_cd1,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END trd_itm_grp_cd2,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END trd_itm_grp_cd3,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END trd_itm_grp_cd4,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END trd_itm_grp_cd5,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END trd_itm_grp_cd6,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END trd_itm_grp_cd7,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END trd_itm_grp_cd8,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END trd_itm_grp_cd9,
			CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END trd_itm_grp_cd10
		FROM (
			SELECT
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
				t1.wg_cd, t1.ym, t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				COALESCE(m4.itm_nm, m1.itm_nm) itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty,
				t1.itm_mfg_inst_no,
				t1.mfg_act_no,
				t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
				t1.amt - COALESCE(SUM(t2.act_cost), 0) act_cost,
				m1.itm_grp_cd1, m1.itm_grp_cd2, m1.itm_grp_cd3, m1.itm_grp_cd4, m1.itm_grp_cd5,
				m1.itm_grp_cd6, m1.itm_grp_cd7, m1.itm_grp_cd8, m1.itm_grp_cd9, m1.itm_grp_cd10
			FROM (
				SELECT
					t.calc_grp_cd, t.calc_no, t.top_rec_no,
					t.calc_rec_typ, t.cost_io_typ,
					t.wg_cd, t.ym, t.mng_dpt_cd,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
					t.ac_rsn_cd,
					t.loc_cd, t.str_ln_cd,
					t.bp_cd, t.stk_bp_cd,
					t.other_dpt_cd,
					t.asst_typ,
					t.repurc_obli_flg,
					t.qty,
					COALESCE(t.so_act_amt, 0) amt,
					t.itm_mfg_inst_no,
					t.mfg_act_no,
					t.par_itm_cd,
					t.par_itm_sub1,
					t.par_itm_sub2,
					t.par_itm_sub3,
					c_ac_slip_in_onr_diff ac_slip_typ
				FROM mgt_acc_top t
				WHERE 0=0
				AND t.calc_no = i_calc_no
				AND t.calc_grp_cd = i_calc_grp_cd
				AND t.calc_rec_typ = c_calc_rec_inpt
				AND t.ac_slip_typ != c_ac_slip_in_ss
				AND	(t.asst_typ = c_asst_oth OR t.repurc_obli_flg = '1')
				AND l_inpt_onr_flg = '1'
			) t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = t1.ac_slip_typ
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			GROUP BY
				t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
				t1.wg_cd, t1.ym, t1.mng_dpt_cd,
				t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
				COALESCE(m4.itm_nm, m1.itm_nm),
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_slip_typ, t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd, t1.stk_bp_cd,
				t1.other_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				t1.qty, t1.amt,
				t1.itm_mfg_inst_no,
				t1.mfg_act_no,
				t1.par_itm_cd, t1.par_itm_sub1, t1.par_itm_sub2, t1.par_itm_sub3,
				m1.itm_grp_cd1, m1.itm_grp_cd2, m1.itm_grp_cd3, m1.itm_grp_cd4, m1.itm_grp_cd5,
				m1.itm_grp_cd6, m1.itm_grp_cd7, m1.itm_grp_cd8, m1.itm_grp_cd9, m1.itm_grp_cd10
			) x5
			INNER JOIN mgt_acc_top t1 ON
				(0=0
				AND t1.calc_no = i_calc_no
				AND t1.calc_grp_cd = i_calc_grp_cd
				AND t1.itm_cd = x5.par_itm_cd
				AND t1.itm_sub1 = x5.par_itm_sub1
				AND t1.itm_sub2 = x5.par_itm_sub2
				AND t1.itm_sub3 = x5.par_itm_sub3
				AND t1.itm_mfg_inst_no = x5.itm_mfg_inst_no
				AND t1.mfg_act_no = x5.mfg_act_no
				AND t1.ym = x5.ym
				AND t1.calc_rec_typ = c_calc_rec_inst
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (x5.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			GROUP BY
				x5.calc_rec_typ, x5.cost_io_typ,
				x5.wg_cd, x5.mng_dpt_cd,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.itm_cd END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.itm_sub1 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.itm_sub2 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.itm_sub3 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_nm END,
				x5.itm_jnl_cd, x5.ac_itm_grp_cd, x5.unit_cd,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.lot_no END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN c_null_val ELSE x5.sublot_no END,
				x5.sno1, x5.sno2, x5.sno3, x5.sno4,
				x5.ac_slip_typ, x5.ac_rsn_cd,
				x5.loc_cd, x5.str_ln_cd,
				x5.bp_cd, x5.stk_bp_cd,
				CASE l_po_no_in_onr_diff WHEN c_off THEN NULL ELSE t1.po_no END,
				CASE l_slo_no_in_onr_diff WHEN c_off THEN NULL ELSE t1.slo_no END,
				CASE l_iv_no_in_onr_diff WHEN c_off THEN NULL ELSE t1.iv_no END,
				t1.mng_dpt_cd,
				x5.asst_typ,
				x5.repurc_obli_flg,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.itm_cd END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.itm_sub1 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.itm_sub2 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.itm_sub3 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.lot_no END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE t1.sublot_no END,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				m2.area_cd, m2.cntry_cd,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd1 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd2 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd3 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd4 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd5 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd6 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd7 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd8 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd9 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE x5.itm_grp_cd10 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END,
				CASE l_itm_sum_in_onr_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END
		UNION ALL
		/* 評価損 */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x6.wg_cd,
			x6.mng_dpt_cd dpt_cd1,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.itm_cd END itm_cd,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.itm_sub1 END itm_sub1,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.itm_sub2 END itm_sub2,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.itm_sub3 END itm_sub3,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
			m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.lot_no END lot_no,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.sublot_no END sublot_no,
			x6.sno1, x6.sno2, x6.sno3, x6.sno4,
			c_ac_slip_eom_stk_asm_mis ac_slip_typ,
			m3.ac_rsn_cd ac_rsn_cd,
			NULL loc_cd,
			NULL str_ln_cd,
			x6.sppl_cd bp_cd,
			x6.sppl_cd stk_bp_cd,
			NULL po_no,
			NULL slo_no,
			NULL iv_no,
			NULL dpt_cd2,
			x6.asst_typ,
			'0' repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x6.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			m2.area_cd,
			m2.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM mgt_stk_loss x6
		LEFT OUTER JOIN mam_itm_srch m1 ON
			(0=0
			AND x6.itm_cd = m1.itm_cd
			AND x6.itm_sub1 = m1.itm_sub1
			AND x6.itm_sub2 = m1.itm_sub2
			AND x6.itm_sub3 = m1.itm_sub3
			AND m1.del_flg = '0'
			AND m1.release_flg = '1'
			)
		LEFT OUTER JOIN mam_bp m2 ON (x6.sppl_cd = m2.bp_cd AND m2.del_flg = '0')
		LEFT OUTER JOIN mam_stk_eval m3 ON (x6.stk_eval_cd = m3.stk_eval_cd AND m3.del_flg = '0')
		LEFT OUTER JOIN mam_sundry_itm m4 ON
			(0=0
			AND x6.itm_cd = m4.itm_cd
			AND x6.itm_sub1 = m4.itm_sub1
			AND x6.itm_sub2 = m4.itm_sub2
			AND x6.itm_sub3 = m4.itm_sub3
			AND x6.sno1 = m4.sno1
			AND x6.sno2 = m4.sno2
			AND x6.sno3 = m4.sno3
			AND x6.sno4 = m4.sno4
			)
		WHERE 0=0
		AND x6.calc_no = i_calc_no
		AND x6.calc_grp_cd = i_calc_grp_cd
		AND l_stk_loss_flg = '1'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mam_cost_ac_out m
				WHERE 0=0
				AND m.calc_grp_cd = x6.calc_grp_cd
				AND m.ac_slip_typ = c_ac_slip_eom_stk_asm_mis
				AND m.itm_jnl_cd = m1.itm_jnl_cd
				AND m.st_dt <= l_end_dt
				AND m.end_dt >= l_end_dt
				)
		GROUP BY
			x6.wg_cd, x6.mng_dpt_cd,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.itm_cd END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.itm_sub1 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.itm_sub2 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.itm_sub3 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END,
			m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.lot_no END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN c_null_val ELSE x6.sublot_no END,
			x6.sno1, x6.sno2, x6.sno3, x6.sno4,
			m3.ac_rsn_cd, x6.sppl_cd, x6.asst_typ,
			m2.area_cd, m2.cntry_cd,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END,
			CASE l_itm_sum_eom_stk_asm_mis WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END
		UNION ALL
		/* 月初在庫評価替差異 */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			t1.wg_cd,
			t1.mng_dpt_cd dpt_cd1,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
			m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
			t1.sno1, t1.sno2, t1.sno3, t1.sno4,
			c_ac_slip_stk_asm_diff ac_slip_typ,
			NULL ac_rsn_cd,
			NULL loc_cd,
			NULL str_ln_cd,
			t1.bp_cd,
			t1.bp_cd stk_bp_cd,
			NULL po_no,
			NULL slo_no,
			NULL iv_no,
			NULL dpt_cd2,
			t1.asst_typ,
			'0' repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(t2.diff_amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			NULL area_cd,
			NULL cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM mgt_st_stk t1
		INNER JOIN mgt_st_stk_diff t2 ON (t1.st_stk_key = t2.st_stk_key)
		LEFT OUTER JOIN mam_itm_srch m1 ON
			(0=0
			AND t1.itm_cd = m1.itm_cd
			AND t1.itm_sub1 = m1.itm_sub1
			AND t1.itm_sub2 = m1.itm_sub2
			AND t1.itm_sub3 = m1.itm_sub3
			AND m1.del_flg = '0'
			AND m1.release_flg = '1'
			)
		LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
		LEFT OUTER JOIN mam_sundry_itm m4 ON
			(0=0
			AND t1.itm_cd = m4.itm_cd
			AND t1.itm_sub1 = m4.itm_sub1
			AND t1.itm_sub2 = m4.itm_sub2
			AND t1.itm_sub3 = m4.itm_sub3
			AND t1.sno1 = m4.sno1
			AND t1.sno2 = m4.sno2
			AND t1.sno3 = m4.sno3
			AND t1.sno4 = m4.sno4
			)
		WHERE 0=0
		AND t1.calc_grp_cd = i_calc_grp_cd
		AND t1.ym = i_ym
		AND t1.asst_typ IN (c_asst_prod, c_asst_sls)
		AND l_st_diff_flg = '1'
		AND NOT EXISTS (
				SELECT 'X'
				FROM mam_cost_ac_out m
				WHERE 0=0
				AND m.calc_grp_cd = t1.calc_grp_cd
				AND m.ac_slip_typ = c_ac_slip_stk_asm_diff
				AND m.itm_jnl_cd = m1.itm_jnl_cd
				AND m.st_dt <= l_end_dt
				AND m.end_dt >= l_end_dt
				)
		GROUP BY
			t1.wg_cd, t1.mng_dpt_cd,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.itm_cd END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END,
			m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.lot_no END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN c_null_val ELSE t1.sublot_no END,
			t1.sno1, t1.sno2, t1.sno3, t1.sno4,
			t1.bp_cd, t1.asst_typ,
			m2.area_cd, m2.cntry_cd,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END,
			CASE l_itm_sum_stk_asm_diff WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END
		UNION ALL
		/* 配賦原価 */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			t2.wg_cd,
			t2.dpt_cd dpt_cd1,
			t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t2.itm_nm,
			t2.itm_jnl_cd, t2.ac_itm_grp_cd, t2.unit_cd,
			t2.lot_no, t2.sublot_no, t2.sno1, t2.sno2, t2.sno3, t2.sno4,
			c_ac_slip_itm_alc ac_slip_typ,
			t2.ac_rsn_cd,
			t2.loc_cd, t2.str_ln_cd,
			t2.bp_cd,
			NULL stk_bp_cd,
			t2.po_no, t2.slo_no, t2.iv_no,
			t2.mng_dpt_cd dpt_cd2,
			t2.asst_typ,
			'0' repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(t2.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			m1.area_cd,
			m1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			t2.alc_ac_cd,
			t2.expns_cd,
			t2.itm_grp_cd1, t2.itm_grp_cd2, t2.itm_grp_cd3, t2.itm_grp_cd4, t2.itm_grp_cd5,
			t2.itm_grp_cd6, t2.itm_grp_cd7, t2.itm_grp_cd8, t2.itm_grp_cd9, t2.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_itm_alc WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_itm_alc WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_itm_alc WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.dpt_cd,
				t1.asst_typ,
				SUM(t1.alc_amt + t1.adj_amt) amt,
				t1.alc_ac_cd, t1.expns_cd,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM (
				SELECT
					t1.calc_grp_cd,
					t1.wg_cd, t1.mng_dpt_cd,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.ac_rsn_cd,
					t1.loc_cd, t1.str_ln_cd,
					t1.bp_cd,
					t1.po_no, t1.slo_no, t1.iv_no,
					t1.asst_typ,
					t1.alc_amt, t1.adj_amt,
					t2.alc_ac_cd, t2.dpt_cd, t2.expns_cd
				FROM mgt_alc_calc_rate t2
				INNER JOIN mgt_alc_calc_dtl t1 ON
					(0=0
					AND t1.calc_no = t2.calc_no
					AND t1.calc_grp_cd = t2.calc_grp_cd
					AND t1.alc_grp_id = t2.alc_grp_id
					)
				WHERE 0=0
				AND t2.calc_no = i_calc_no
				AND t2.calc_grp_cd = i_calc_grp_cd
				AND t2.dpt_cd IS NOT NULL
				AND l_itm_alc_flg = '1'
				AND EXISTS (
						SELECT 'X'
						FROM mam_alc_ac m
						WHERE 0=0
						AND m.alc_ac_cd = t2.alc_ac_cd
						AND m.not_itm_alc_ac_flg = '0'
						AND m.del_flg = '0'
						)
			) t1
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_itm_alc
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			GROUP BY
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.itm_cd END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.lot_no END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN c_null_val ELSE t1.sublot_no END,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				t1.po_no, t1.slo_no, t1.iv_no,
				t1.asst_typ,
				t1.alc_ac_cd, t1.dpt_cd, t1.expns_cd,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END,
				CASE l_itm_sum_itm_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END
		) t2
		LEFT OUTER JOIN mam_bp m1 ON (t2.bp_cd = m1.bp_cd AND m1.del_flg = '0')
		WHERE 0=0
		GROUP BY
			t2.wg_cd, t2.mng_dpt_cd,
			t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t2.itm_nm,
			t2.itm_jnl_cd, t2.ac_itm_grp_cd, t2.unit_cd,
			t2.lot_no, t2.sublot_no, t2.sno1, t2.sno2, t2.sno3, t2.sno4,
			t2.ac_rsn_cd,
			t2.loc_cd, t2.str_ln_cd,
			t2.bp_cd,
			t2.po_no, t2.slo_no, t2.iv_no,
			t2.asst_typ,
			t2.alc_ac_cd, t2.dpt_cd, t2.expns_cd,
			m1.area_cd, m1.cntry_cd,
			t2.itm_grp_cd1, t2.itm_grp_cd2, t2.itm_grp_cd3, t2.itm_grp_cd4, t2.itm_grp_cd5,
			t2.itm_grp_cd6, t2.itm_grp_cd7, t2.itm_grp_cd8, t2.itm_grp_cd9, t2.itm_grp_cd10
		UNION ALL
		/* 受入価格差異（合計）/（単価差異）/（レート差異） */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.mng_dpt_cd dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			NULL loc_cd,
			NULL str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.alc_dpt_cd dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
				/* 受入価格差異（合計） */
				SELECT
					t1.wg_cd, t1.mng_dpt_cd,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
					m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
					t1.sno1, t1.sno2, t1.sno3, t1.sno4,
					t1.ac_rsn_cd,
					t1.bp_cd,
					CASE l_po_no_diff_io_sum WHEN c_off THEN NULL ELSE t1.po_no END po_no,
					CASE l_slo_no_diff_io_sum WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
					CASE l_iv_no_diff_io_sum WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
					t1.alc_dpt_cd,
					t1.asst_typ,
					t1.repurc_obli_flg,
					COALESCE(t1.std_amt, 0) - COALESCE(t1.amt, 0) amt,
					m2.area_cd,
					m2.cntry_cd,
					c_ac_slip_diff_io_sum ac_slip_typ,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
					CASE l_itm_sum_diff_io_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
				FROM mgt_acc_top t1
				LEFT OUTER JOIN mam_itm_srch m1 ON
					(0=0
					AND t1.itm_cd = m1.itm_cd
					AND t1.itm_sub1 = m1.itm_sub1
					AND t1.itm_sub2 = m1.itm_sub2
					AND t1.itm_sub3 = m1.itm_sub3
					AND m1.del_flg = '0'
					AND m1.release_flg = '1'
					)
				LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
				LEFT OUTER JOIN mam_sundry_itm m4 ON
					(0=0
					AND t1.itm_cd = m4.itm_cd
					AND t1.itm_sub1 = m4.itm_sub1
					AND t1.itm_sub2 = m4.itm_sub2
					AND t1.itm_sub3 = m4.itm_sub3
					AND t1.sno1 = m4.sno1
					AND t1.sno2 = m4.sno2
					AND t1.sno3 = m4.sno3
					AND t1.sno4 = m4.sno4
					)
				WHERE 0=0
				AND l_diff_io_sum_flg = '1'
				AND t1.calc_no = i_calc_no
				AND t1.calc_grp_cd = i_calc_grp_cd
				AND t1.calc_rec_typ = c_calc_rec_purc
				AND NOT EXISTS (
						SELECT 'X'
						FROM mam_cost_ac_out m
						WHERE 0=0
						AND m.calc_grp_cd = t1.calc_grp_cd
						AND m.ac_slip_typ = c_ac_slip_diff_io_sum
						AND m.itm_jnl_cd = m1.itm_jnl_cd
						AND m.st_dt <= l_end_dt
						AND m.end_dt >= l_end_dt
						)
			UNION ALL
			/* 受入価格差異（単価差異） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.bp_cd,
				CASE l_po_no_diff_io_pri WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_io_pri WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_io_pri WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.alc_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t1.upri_diff, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_io_pri ac_slip_typ,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_io_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_io_pri_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_purc
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_io_pri
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 受入価格差異（レート差異） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.bp_cd,
				CASE l_po_no_diff_io_rate WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_io_rate WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_io_rate WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.alc_dpt_cd,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t1.rate_diff, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_io_rate ac_slip_typ,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_io_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_io_rate_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_purc
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_io_rate
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
		) x1
		GROUP BY
			x1.wg_cd, x1.mng_dpt_cd,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.alc_dpt_cd,
			x1.asst_typ,
			x1.repurc_obli_flg,
			x1.area_cd, x1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10
		UNION ALL
		/* 数量差異（親）/ 払出価格差異（親） */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.mng_dpt_cd dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.mng_dpt_cd dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			/* 数量差異（親） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_qt_par WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_qt_par WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_qt_par WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_qty, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_qt_par ac_slip_typ,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_qt_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1')
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_qt_par_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_qt_par
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 払出価格差異（親） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_pr_par WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_pr_par WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_pr_par WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t3.diff_up, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_pr_par ac_slip_typ,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_pr_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			INNER JOIN mgt_acc_inpt t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				AND t2.lvl = 1
				AND t2.ac_slip_typ <> c_ac_slip_in_ss
				)
			LEFT OUTER JOIN mgt_acc_cost t3 ON
				(0=0
				AND t2.calc_no = t3.calc_no
				AND t2.calc_grp_cd = t3.calc_grp_cd
				AND t2.inpt_rec_no = t3.sml_inpt_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_pr_par_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_pr_par
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			) x1
		GROUP BY
			x1.wg_cd, x1.mng_dpt_cd,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.asst_typ,
			x1.repurc_obli_flg,
			x1.area_cd, x1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10
		UNION ALL
		/* 数量差異（子）/ 払出価格差異（子） */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd,
			x1.str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			x1.trd_itm_cd, x1.trd_itm_sub1, x1.trd_itm_sub2, x1.trd_itm_sub3, x1.trd_itm_nm,
			x1.trd_itm_jnl_cd, x1.trd_ac_itm_grp_cd,
			x1.trd_lot_no, x1.trd_sublot_no, x1.trd_sno1, x1.trd_sno2, x1.trd_sno3, x1.trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			x1.trd_itm_grp_cd1, x1.trd_itm_grp_cd2, x1.trd_itm_grp_cd3, x1.trd_itm_grp_cd4, x1.trd_itm_grp_cd5,
			x1.trd_itm_grp_cd6, x1.trd_itm_grp_cd7, x1.trd_itm_grp_cd8, x1.trd_itm_grp_cd9, x1.trd_itm_grp_cd10
		FROM (
			/* 数量差異（子） */
			SELECT
				t1.wg_cd,
				t1.mng_dpt_cd dpt_cd1,
				t2.mng_dpt_cd dpt_cd2,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t2.itm_cd END itm_cd,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t2.lot_no END lot_no,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t2.sublot_no END sublot_no,
				t2.sno1, t2.sno2, t2.sno3, t2.sno4,
				t2.ac_rsn_cd,
				t2.loc_cd, t2.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_qt_chd WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_qt_chd WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_qt_chd WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t2.asst_typ,
				t2.repurc_obli_flg,
				COALESCE(t3.diff_qty, 0) amt,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t1.itm_cd END trd_itm_cd,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END trd_itm_sub1,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END trd_itm_sub2,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END trd_itm_sub3,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE COALESCE(m6.itm_nm, m5.itm_nm) END trd_itm_nm,
				m5.itm_jnl_cd trd_itm_jnl_cd,
				m5.ac_itm_grp_cd trd_ac_itm_grp_cd,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t1.lot_no END trd_lot_no,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN c_null_val ELSE t1.sublot_no END trd_sublot_no,
				t1.sno1 trd_sno1,
				t1.sno2 trd_sno2,
				t1.sno3 trd_sno3,
				t1.sno4 trd_sno4,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_qt_chd ac_slip_typ,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd1 END trd_itm_grp_cd1,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd2 END trd_itm_grp_cd2,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd3 END trd_itm_grp_cd3,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd4 END trd_itm_grp_cd4,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd5 END trd_itm_grp_cd5,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd6 END trd_itm_grp_cd6,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd7 END trd_itm_grp_cd7,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd8 END trd_itm_grp_cd8,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd9 END trd_itm_grp_cd9,
				CASE l_itm_sum_diff_qt_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd10 END trd_itm_grp_cd10
			FROM mgt_acc_top t1
				INNER JOIN mgt_acc_inpt t2 ON
					(0=0
					AND t1.calc_no = t2.calc_no
					AND t1.calc_grp_cd = t2.calc_grp_cd
					AND t1.top_rec_no = t2.top_rec_no
					AND t2.lvl = 1
					)
				LEFT OUTER JOIN mgt_acc_cost t3 ON
					(0=0
					AND t2.calc_no = t3.calc_no
					AND t2.calc_grp_cd = t3.calc_grp_cd
					AND t2.inpt_rec_no = t3.sml_inpt_rec_no
					)
				LEFT OUTER JOIN mam_itm_srch m1 ON
					(0=0
					AND t2.itm_cd = m1.itm_cd
					AND t2.itm_sub1 = m1.itm_sub1
					AND t2.itm_sub2 = m1.itm_sub2
					AND t2.itm_sub3 = m1.itm_sub3
					AND m1.del_flg = '0'
					AND m1.release_flg = '1'
					)
				LEFT OUTER JOIN mam_sundry_itm m4 ON
					(0=0
					AND t2.itm_cd = m4.itm_cd
					AND t2.itm_sub1 = m4.itm_sub1
					AND t2.itm_sub2 = m4.itm_sub2
					AND t2.itm_sub3 = m4.itm_sub3
					AND t2.sno1 = m4.sno1
					AND t2.sno2 = m4.sno2
					AND t2.sno3 = m4.sno3
					AND t2.sno4 = m4.sno4)
				LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
				LEFT OUTER JOIN mam_itm_srch m5 ON
					(0=0
					AND t1.itm_cd = m5.itm_cd
					AND t1.itm_sub1 = m5.itm_sub1
					AND t1.itm_sub2 = m5.itm_sub2
					AND t1.itm_sub3 = m5.itm_sub3
					AND m5.del_flg = '0'
					AND m5.release_flg = '1'
					)
				LEFT OUTER JOIN mam_sundry_itm m6 ON
					(0=0
					AND t1.itm_cd = m6.itm_cd
					AND t1.itm_sub1 = m6.itm_sub1
					AND t1.itm_sub2 = m6.itm_sub2
					AND t1.itm_sub3 = m6.itm_sub3
					AND t1.sno1 = m6.sno1
					AND t1.sno2 = m6.sno2
					AND t1.sno3 = m6.sno3
					AND t1.sno4 = m6.sno4
					)
				WHERE 0=0
				AND l_diff_qt_chd_flg = '1'
				AND t1.calc_no = i_calc_no
				AND t1.calc_grp_cd = i_calc_grp_cd
				AND t1.calc_rec_typ = c_calc_rec_inst
				AND NOT EXISTS (
						SELECT 'X'
						FROM mam_cost_ac_out m
						WHERE 0=0
						AND m.calc_grp_cd = t1.calc_grp_cd
						AND m.ac_slip_typ = c_ac_slip_diff_qt_chd
						AND m.itm_jnl_cd = m1.itm_jnl_cd
						AND m.st_dt <= l_end_dt
						AND m.end_dt >= l_end_dt
						)
			UNION ALL
			/* 払出価格差異（子） */
			SELECT
				t1.wg_cd,
				t1.mng_dpt_cd dpt_cd1,
				t2.mng_dpt_cd dpt_cd2,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t2.itm_cd END itm_cd,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t2.lot_no END lot_no,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t2.sublot_no END sublot_no,
				t2.sno1, t2.sno2, t2.sno3, t2.sno4,
				t2.ac_rsn_cd,
				t2.loc_cd, t2.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_pr_chd WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_pr_chd WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_pr_chd WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t2.asst_typ,
				t2.repurc_obli_flg,
				COALESCE(t3.diff_up, 0) amt,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t1.itm_cd END trd_itm_cd,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END trd_itm_sub1,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END trd_itm_sub2,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END trd_itm_sub3,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE COALESCE(m6.itm_nm, m5.itm_nm) END trd_itm_nm,
				m5.itm_jnl_cd trd_itm_jnl_cd,
				m5.ac_itm_grp_cd trd_ac_itm_grp_cd,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t1.lot_no END trd_lot_no,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN c_null_val ELSE t1.sublot_no END trd_sublot_no,
				t1.sno1 trd_sno1,
				t1.sno2 trd_sno2,
				t1.sno3 trd_sno3,
				t1.sno4 trd_sno4,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_pr_chd ac_slip_typ,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd1 END trd_itm_grp_cd1,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd2 END trd_itm_grp_cd2,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd3 END trd_itm_grp_cd3,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd4 END trd_itm_grp_cd4,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd5 END trd_itm_grp_cd5,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd6 END trd_itm_grp_cd6,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd7 END trd_itm_grp_cd7,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd8 END trd_itm_grp_cd8,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd9 END trd_itm_grp_cd9,
				CASE l_itm_sum_diff_pr_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd10 END trd_itm_grp_cd10
			FROM mgt_acc_top t1
			INNER JOIN mgt_acc_inpt t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				AND t2.lvl = 1
				AND t2.ac_slip_typ <> c_ac_slip_in_ss
				)
			LEFT OUTER JOIN mgt_acc_cost t3 ON
				(0=0
				AND t2.calc_no = t3.calc_no
				AND t2.calc_grp_cd = t3.calc_grp_cd
				AND t2.inpt_rec_no = t3.sml_inpt_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t2.itm_cd = m1.itm_cd
				AND t2.itm_sub1 = m1.itm_sub1
				AND t2.itm_sub2 = m1.itm_sub2
				AND t2.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t2.itm_cd = m4.itm_cd
				AND t2.itm_sub1 = m4.itm_sub1
				AND t2.itm_sub2 = m4.itm_sub2
				AND t2.itm_sub3 = m4.itm_sub3
				AND t2.sno1 = m4.sno1
				AND t2.sno2 = m4.sno2
				AND t2.sno3 = m4.sno3
				AND t2.sno4 = m4.sno4
				)
			LEFT OUTER JOIN mam_itm_srch m5 ON
				(0=0
				AND t1.itm_cd = m5.itm_cd
				AND t1.itm_sub1 = m5.itm_sub1
				AND t1.itm_sub2 = m5.itm_sub2
				AND t1.itm_sub3 = m5.itm_sub3
				AND m5.del_flg = '0'
				AND m5.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm m6 ON
				(0=0
				AND t1.itm_cd = m6.itm_cd
				AND t1.itm_sub1 = m6.itm_sub1
				AND t1.itm_sub2 = m6.itm_sub2
				AND t1.itm_sub3 = m6.itm_sub3
				AND t1.sno1 = m6.sno1
				AND t1.sno2 = m6.sno2
				AND t1.sno3 = m6.sno3
				AND t1.sno4 = m6.sno4
				)
			WHERE 0=0
			AND l_diff_pr_chd_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_pr_chd
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
		) x1
		GROUP BY
			x1.wg_cd, x1.dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.dpt_cd2, x1.asst_typ,
			x1.repurc_obli_flg,
			x1.trd_itm_cd, x1.trd_itm_sub1, x1.trd_itm_sub2, x1.trd_itm_sub3, x1.trd_itm_nm,
			x1.trd_itm_jnl_cd, x1.trd_ac_itm_grp_cd,
			x1.trd_lot_no, x1.trd_sublot_no, x1.trd_sno1, x1.trd_sno2, x1.trd_sno3, x1.trd_sno4,
			x1.area_cd, x1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			x1.trd_itm_grp_cd1, x1.trd_itm_grp_cd2, x1.trd_itm_grp_cd3, x1.trd_itm_grp_cd4, x1.trd_itm_grp_cd5,
			x1.trd_itm_grp_cd6, x1.trd_itm_grp_cd7, x1.trd_itm_grp_cd8, x1.trd_itm_grp_cd9, x1.trd_itm_grp_cd10
		UNION ALL
		/* 工数差異 / 実績差異１～５ / 配賦率差異（品目） */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.mng_dpt_cd dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd,
			x1.str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.mng_dpt_cd dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			x1.expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			/* 工数差異 */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_wk WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_wk WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_wk WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_wk WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_wk WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_wk WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_wk WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_wk WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_wk WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_wk, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_wk ac_slip_typ,
				t2.expns_cd,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_wk WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_wk_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_wk
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 実績差異１ */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_act1 WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_act1 WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_act1 WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_a, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_act1 ac_slip_typ,
				t2.expns_cd,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_act1 WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_act1_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ IN (c_calc_rec_inst, c_calc_rec_purc)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_act1
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 実績差異２ */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_act2 WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_act2 WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_act2 WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_b, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_act2 ac_slip_typ,
				t2.expns_cd,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_act2 WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_act2_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ IN (c_calc_rec_inst, c_calc_rec_purc)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_act2
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 実績差異３ */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_act3 WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_act3 WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_act3 WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_c, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_act3 ac_slip_typ,
				t2.expns_cd,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_act3 WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_act3_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ IN (c_calc_rec_inst, c_calc_rec_purc)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_act3
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 実績差異４ */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_act4 WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_act4 WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_act4 WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_d, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_act4 ac_slip_typ,
				t2.expns_cd,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_act4 WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_act4_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ IN (c_calc_rec_inst, c_calc_rec_purc)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_act4
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 実績差異５ */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_act5 WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_act5 WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_act5 WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_e, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_act5 ac_slip_typ,
				t2.expns_cd,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_act5 WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_act5_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ IN (c_calc_rec_inst, c_calc_rec_purc)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_act5
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 配賦率差異（品目） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_rate_itm WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_rate_itm WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_rate_itm WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_rt, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_rate_itm ac_slip_typ,
				t2.expns_cd,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_rate_itm WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_rate_itm_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ IN (c_calc_rec_inst, c_calc_rec_purc)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_rate_itm
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
		) x1
		GROUP BY
			x1.wg_cd, x1.mng_dpt_cd,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.asst_typ,
			x1.repurc_obli_flg,
			x1.area_cd, x1.cntry_cd, x1.expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10
		UNION ALL
		/* 外注単価差異（合計）/（単価差異）/（レート差異） */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.mng_dpt_cd dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd,
			x1.str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.mng_dpt_cd dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			/* 外注単価差異（合計） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_outsrc_sum WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_outsrc_sum WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_outsrc_sum WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t1.upri_diff, 0) + COALESCE(t1.rate_diff, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_outsrc_sum ac_slip_typ,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_outsrc_sum WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_outsrc_sum_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND t1.bp_cd IS NOT NULL
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_outsrc_sum
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 外注単価差異（単価差異） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_outsrc_pri WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_outsrc_pri WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_outsrc_pri WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t1.upri_diff, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_outsrc_pri ac_slip_typ,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_outsrc_pri WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_outsrc_pri_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND t1.bp_cd IS NOT NULL
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_outsrc_pri
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			UNION ALL
			/* 外注単価差異（レート差異） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_outsrc_rate WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_outsrc_rate WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_outsrc_rate WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t1.rate_diff, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_outsrc_rate ac_slip_typ,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_outsrc_rate WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_outsrc_rate_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND t1.bp_cd IS NOT NULL
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_outsrc_rate
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
		) x1
		GROUP BY
			x1.wg_cd, x1.mng_dpt_cd,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.asst_typ,
			x1.repurc_obli_flg,
			x1.area_cd, x1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10
		UNION ALL
		/* 自給単価差異（親） */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.mng_dpt_cd dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd,
			x1.str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.mng_dpt_cd dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			/* 自給単価差異（親） */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t2.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_ss_par WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_ss_par WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_ss_par WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t3.diff_up, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_ss_par ac_slip_typ,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_ss_par WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			INNER JOIN mgt_acc_inpt t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				AND t2.lvl = 1
				AND t2.ac_slip_typ = c_ac_slip_in_ss
				AND t2.asst_typ = c_asst_oth
				)
			LEFT OUTER JOIN mgt_acc_cost t3 ON
				(0=0
				AND t2.calc_no = t3.calc_no
				AND t2.calc_grp_cd = t3.calc_grp_cd
				AND t2.inpt_rec_no = t3.sml_inpt_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_ss_par_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_ss_par
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			) x1
		GROUP BY
			x1.wg_cd, x1.mng_dpt_cd,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.asst_typ,
			x1.repurc_obli_flg,
			x1.area_cd, x1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10
		UNION ALL
		/* 自給単価差異（子） */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd,
			x1.str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			x1.trd_itm_cd, x1.trd_itm_sub1, x1.trd_itm_sub2, x1.trd_itm_sub3, x1.trd_itm_nm,
			x1.trd_itm_jnl_cd, x1.trd_ac_itm_grp_cd,
			x1.trd_lot_no, x1.trd_sublot_no, x1.trd_sno1, x1.trd_sno2, x1.trd_sno3, x1.trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			x1.trd_itm_grp_cd1, x1.trd_itm_grp_cd2, x1.trd_itm_grp_cd3, x1.trd_itm_grp_cd4, x1.trd_itm_grp_cd5,
			x1.trd_itm_grp_cd6, x1.trd_itm_grp_cd7, x1.trd_itm_grp_cd8, x1.trd_itm_grp_cd9, x1.trd_itm_grp_cd10
		FROM (
			/* 自給単価差異（子） */
			SELECT
				t1.wg_cd,
				t1.mng_dpt_cd dpt_cd1,
				t2.mng_dpt_cd dpt_cd2,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t2.itm_cd END itm_cd,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t2.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t2.lot_no END lot_no,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t2.sublot_no END sublot_no,
				t2.sno1, t2.sno2, t2.sno3, t2.sno4,
				t2.ac_rsn_cd,
				t2.loc_cd, t2.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_ss_chd WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_ss_chd WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_ss_chd WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t2.asst_typ,
				t2.repurc_obli_flg,
				COALESCE(t3.diff_up, 0) amt,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t1.itm_cd END trd_itm_cd,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END trd_itm_sub1,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END trd_itm_sub2,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END trd_itm_sub3,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE COALESCE(m6.itm_nm, m5.itm_nm) END trd_itm_nm,
				m5.itm_jnl_cd trd_itm_jnl_cd,
				m5.ac_itm_grp_cd trd_ac_itm_grp_cd,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t1.lot_no END trd_lot_no,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN c_null_val ELSE t1.sublot_no END trd_sublot_no,
				t1.sno1 trd_sno1,
				t1.sno2 trd_sno2,
				t1.sno3 trd_sno3,
				t1.sno4 trd_sno4,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_ss_chd ac_slip_typ,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd1 END trd_itm_grp_cd1,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd2 END trd_itm_grp_cd2,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd3 END trd_itm_grp_cd3,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd4 END trd_itm_grp_cd4,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd5 END trd_itm_grp_cd5,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd6 END trd_itm_grp_cd6,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd7 END trd_itm_grp_cd7,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd8 END trd_itm_grp_cd8,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd9 END trd_itm_grp_cd9,
				CASE l_itm_sum_diff_ss_chd WHEN c_on THEN NULL ELSE m5.itm_grp_cd10 END trd_itm_grp_cd10
			FROM mgt_acc_top t1
			INNER JOIN mgt_acc_inpt t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				AND t2.lvl = 1
				AND t2.ac_slip_typ = c_ac_slip_in_ss
				AND t2.asst_typ = c_asst_oth
				)
			LEFT OUTER JOIN mgt_acc_cost t3 ON
				(0=0
				AND t2.calc_no = t3.calc_no
				AND t2.calc_grp_cd = t3.calc_grp_cd
				AND t2.inpt_rec_no = t3.sml_inpt_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t2.itm_cd = m1.itm_cd
				AND t2.itm_sub1 = m1.itm_sub1
				AND t2.itm_sub2 = m1.itm_sub2
				AND t2.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t2.itm_cd = m4.itm_cd
				AND t2.itm_sub1 = m4.itm_sub1
				AND t2.itm_sub2 = m4.itm_sub2
				AND t2.itm_sub3 = m4.itm_sub3
				AND t2.sno1 = m4.sno1
				AND t2.sno2 = m4.sno2
				AND t2.sno3 = m4.sno3
				AND t2.sno4 = m4.sno4
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_itm_srch m5 ON
				(0=0
				AND t1.itm_cd = m5.itm_cd
				AND t1.itm_sub1 = m5.itm_sub1
				AND t1.itm_sub2 = m5.itm_sub2
				AND t1.itm_sub3 = m5.itm_sub3
				AND m5.del_flg = '0'
				AND m5.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm m6 ON
				(0=0
				AND t1.itm_cd = m6.itm_cd
				AND t1.itm_sub1 = m6.itm_sub1
				AND t1.itm_sub2 = m6.itm_sub2
				AND t1.itm_sub3 = m6.itm_sub3
				AND t1.sno1 = m6.sno1
				AND t1.sno2 = m6.sno2
				AND t1.sno3 = m6.sno3
				AND t1.sno4 = m6.sno4
				)
			WHERE 0=0
			AND l_diff_ss_chd_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ = c_calc_rec_inst
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_ss_chd
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			) x1
		GROUP BY
			x1.wg_cd, x1.dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.dpt_cd2, x1.asst_typ,
			x1.repurc_obli_flg,
			x1.trd_itm_cd, x1.trd_itm_sub1, x1.trd_itm_sub2, x1.trd_itm_sub3, x1.trd_itm_nm,
			x1.trd_itm_jnl_cd, x1.trd_ac_itm_grp_cd,
			x1.trd_lot_no, x1.trd_sublot_no, x1.trd_sno1, x1.trd_sno2, x1.trd_sno3, x1.trd_sno4,
			x1.area_cd, x1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			x1.trd_itm_grp_cd1, x1.trd_itm_grp_cd2, x1.trd_itm_grp_cd3, x1.trd_itm_grp_cd4, x1.trd_itm_grp_cd5,
			x1.trd_itm_grp_cd6, x1.trd_itm_grp_cd7, x1.trd_itm_grp_cd8, x1.trd_itm_grp_cd9, x1.trd_itm_grp_cd10
		UNION ALL
		/* 配賦率差異（配賦科目） */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.dpt_cd dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ,
			NULL ac_rsn_cd,
			x1.loc_cd,
			NULL str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.dpt_cd dpt_cd2,
			NULL asst_typ,
			'0' repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			x1.alc_ac_cd,
			x1.expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			SELECT
				t1.wg_cd, t1.dpt_cd,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN c_null_val ELSE COALESCE(t1.itm_cd, c_null_val) END itm_cd,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN c_null_val ELSE COALESCE(t1.itm_sub1, c_null_val) END itm_sub1,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN c_null_val ELSE COALESCE(t1.itm_sub2, c_null_val) END itm_sub2,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN c_null_val ELSE COALESCE(t1.itm_sub3, c_null_val) END itm_sub3,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				COALESCE(m1.itm_jnl_cd, c_null_val) itm_jnl_cd,
				m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.loc_cd, t1.bp_cd,
				CASE l_po_no_diff_rate_alc WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_rate_alc WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_rate_alc WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.amt - (t1.alc_amt + t1.trd_alc_amt) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_rate_alc ac_slip_typ,
				t1.alc_ac_cd, t1.expns_cd,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_rate_alc WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_alc_calc_rate t1
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_rate_alc_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.dpt_cd IS NOT NULL
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_rate_alc
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			AND EXISTS (
					SELECT 'X'
					FROM mam_alc_ac m
					WHERE 0=0
					AND m.alc_ac_cd = t1.alc_ac_cd
					AND m.not_alc_rate_ac_flg = '0'
					AND m.del_flg = '0'
					)
			) x1
		GROUP BY
			x1.wg_cd, x1.dpt_cd,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ,
			x1.loc_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.alc_ac_cd, x1.expns_cd,
			x1.area_cd, x1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10
		UNION ALL
		/* 標準調整差異 */
		SELECT
			NULL calc_rec_typ,
			NULL cost_io_typ,
			x1.wg_cd,
			x1.mng_dpt_cd dpt_cd1,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd,
			x1.str_ln_cd,
			x1.bp_cd,
			NULL stk_bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.mng_dpt_cd dpt_cd2,
			x1.asst_typ,
			x1.repurc_obli_flg,
			0 qty,
			NULL trd_grp,
			SUM(x1.amt) amt,
			NULL trd_itm_cd,
			NULL trd_itm_sub1,
			NULL trd_itm_sub2,
			NULL trd_itm_sub3,
			NULL trd_itm_nm,
			NULL trd_itm_jnl_cd,
			NULL trd_ac_itm_grp_cd,
			NULL trd_lot_no,
			NULL trd_sublot_no,
			NULL trd_sno1,
			NULL trd_sno2,
			NULL trd_sno3,
			NULL trd_sno4,
			x1.area_cd,
			x1.cntry_cd,
			NULL sls_dpt_cd,
			NULL usr_cd,
			NULL alc_ac_cd,
			NULL expns_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10,
			NULL trd_itm_grp_cd1,
			NULL trd_itm_grp_cd2,
			NULL trd_itm_grp_cd3,
			NULL trd_itm_grp_cd4,
			NULL trd_itm_grp_cd5,
			NULL trd_itm_grp_cd6,
			NULL trd_itm_grp_cd7,
			NULL trd_itm_grp_cd8,
			NULL trd_itm_grp_cd9,
			NULL trd_itm_grp_cd10
		FROM (
			/* 標準調整差異 */
			SELECT
				t1.wg_cd, t1.mng_dpt_cd,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN c_null_val ELSE t1.itm_cd END itm_cd,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN c_null_val ELSE t1.itm_sub1 END itm_sub1,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN c_null_val ELSE t1.itm_sub2 END itm_sub2,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN c_null_val ELSE t1.itm_sub3 END itm_sub3,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE COALESCE(m4.itm_nm, m1.itm_nm) END itm_nm,
				m1.itm_jnl_cd, m1.ac_itm_grp_cd, m1.unit_cd,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN c_null_val ELSE t1.lot_no END lot_no,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN c_null_val ELSE t1.sublot_no END sublot_no,
				t1.sno1, t1.sno2, t1.sno3, t1.sno4,
				t1.ac_rsn_cd,
				t1.loc_cd, t1.str_ln_cd,
				t1.bp_cd,
				CASE l_po_no_diff_std_adj WHEN c_off THEN NULL ELSE t1.po_no END po_no,
				CASE l_slo_no_diff_std_adj WHEN c_off THEN NULL ELSE t1.slo_no END slo_no,
				CASE l_iv_no_diff_std_adj WHEN c_off THEN NULL ELSE t1.iv_no END iv_no,
				t1.asst_typ,
				t1.repurc_obli_flg,
				COALESCE(t2.diff_std, 0) amt,
				m2.area_cd,
				m2.cntry_cd,
				c_ac_slip_diff_std_adj ac_slip_typ,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd1 END itm_grp_cd1,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd2 END itm_grp_cd2,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd3 END itm_grp_cd3,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd4 END itm_grp_cd4,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd5 END itm_grp_cd5,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd6 END itm_grp_cd6,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd7 END itm_grp_cd7,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd8 END itm_grp_cd8,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd9 END itm_grp_cd9,
				CASE l_itm_sum_diff_std_adj WHEN c_on THEN NULL ELSE m1.itm_grp_cd10 END itm_grp_cd10
			FROM mgt_acc_top t1
			LEFT OUTER JOIN mgt_acc_sml_cost t2 ON
				(0=0
				AND t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no
				)
			LEFT OUTER JOIN mam_itm_srch m1 ON
				(0=0
				AND t1.itm_cd = m1.itm_cd
				AND t1.itm_sub1 = m1.itm_sub1
				AND t1.itm_sub2 = m1.itm_sub2
				AND t1.itm_sub3 = m1.itm_sub3
				AND m1.del_flg = '0'
				AND m1.release_flg = '1'
				)
			LEFT OUTER JOIN mam_bp m2 ON (t1.bp_cd = m2.bp_cd AND m2.del_flg = '0')
			LEFT OUTER JOIN mam_sundry_itm m4 ON
				(0=0
				AND t1.itm_cd = m4.itm_cd
				AND t1.itm_sub1 = m4.itm_sub1
				AND t1.itm_sub2 = m4.itm_sub2
				AND t1.itm_sub3 = m4.itm_sub3
				AND t1.sno1 = m4.sno1
				AND t1.sno2 = m4.sno2
				AND t1.sno3 = m4.sno3
				AND t1.sno4 = m4.sno4
				)
			WHERE 0=0
			AND l_diff_std_adj_flg = '1'
			AND t1.calc_no = i_calc_no
			AND t1.calc_grp_cd = i_calc_grp_cd
			AND t1.calc_rec_typ IN (c_calc_rec_inst, c_calc_rec_purc)
			AND NOT EXISTS (
					SELECT 'X'
					FROM mam_cost_ac_out m
					WHERE 0=0
					AND m.calc_grp_cd = t1.calc_grp_cd
					AND m.ac_slip_typ = c_ac_slip_diff_std_adj
					AND m.itm_jnl_cd = m1.itm_jnl_cd
					AND m.st_dt <= l_end_dt
					AND m.end_dt >= l_end_dt
					)
			) x1
		GROUP BY
			x1.wg_cd, x1.mng_dpt_cd,
			x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, x1.itm_nm,
			x1.itm_jnl_cd, x1.ac_itm_grp_cd, x1.unit_cd,
			x1.lot_no, x1.sublot_no, x1.sno1, x1.sno2, x1.sno3, x1.sno4,
			x1.ac_slip_typ, x1.ac_rsn_cd,
			x1.loc_cd, x1.str_ln_cd, x1.bp_cd,
			x1.po_no, x1.slo_no, x1.iv_no,
			x1.asst_typ,
			x1.repurc_obli_flg,
			x1.area_cd, x1.cntry_cd,
			x1.itm_grp_cd1, x1.itm_grp_cd2, x1.itm_grp_cd3, x1.itm_grp_cd4, x1.itm_grp_cd5,
			x1.itm_grp_cd6, x1.itm_grp_cd7, x1.itm_grp_cd8, x1.itm_grp_cd9, x1.itm_grp_cd10
	LOOP

		<<NEXT_LOOP>>
		BEGIN
			IF x.qty = 0 AND x.amt = 0 OR x.ac_slip_typ IS NULL THEN
				EXIT NEXT_LOOP;
			END IF;

			IF x.ac_rsn_cd IS NOT NULL THEN
				FOREACH r_invalid_rsn IN ARRAY l_invalid_rsn_rec LOOP
					IF r_invalid_rsn.ac_rsn_cd = x.ac_rsn_cd THEN
						EXIT NEXT_LOOP;
					END IF;
				END LOOP;
			END IF;

			IF x.itm_jnl_cd IS NULL THEN
				l_msg := fcpa_err$msg_binder(mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm));
				CALL fcpa_err$raise_app_err('MGBXD0043', l_msg);
			END IF;

			l_sign := 1;

			l_purc_dpt := NULL;
			l_ap_dpt := NULL;
			l_sls_dpt := NULL;
			l_ar_dpt := NULL;
			l_gi_dpt := NULL;
			l_gr_dpt := NULL;
			l_bd_dpt := NULL;
			l_sub_dpt1 := NULL;
			l_sub_dpt2 := NULL;
			l_sub_dpt3 := NULL;

			l_sppl := NULL;
			l_cst := NULL;
			l_inv_com := NULL;

			l_amt := 0;

			IF x.cntry_cd != l_co.cntry_cd THEN
				l_foreign := '1';
			ELSE
				l_foreign := '0';
			END IF;

			CALL mgpa_ac_if$p_get_ac_dpt(x.dpt_cd1, l_end_dt, l_dpt_map_rec, l_dpt1, '0');

			IF x.dpt_cd2 = x.dpt_cd1 THEN
				l_dpt2 := l_dpt1;
			ELSE
				CALL mgpa_ac_if$p_get_ac_dpt(x.dpt_cd2, l_end_dt, l_dpt_map_rec, l_dpt2, '0');
			END IF;

			IF x.sls_dpt_cd = x.dpt_cd1 THEN
				l_sls_dpt := l_dpt1;
			ELSIF x.sls_dpt_cd = x.dpt_cd2 THEN
				l_sls_dpt := l_dpt2;
			ELSE
				CALL mgpa_ac_if$p_get_ac_dpt(x.sls_dpt_cd, l_end_dt, l_dpt_map_rec, l_sls_dpt, '0');
			END IF;

			IF x.calc_rec_typ IN (
				c_calc_rec_end_stk,
				c_calc_rec_end_wip,
				c_calc_rec_adj,
				c_calc_rec_comp,
				c_calc_rec_inst,
				c_calc_rec_purc
			) THEN
				l_gr_dpt := l_dpt1; /* 入庫部門：管理部門 */
				IF x.calc_rec_typ = c_calc_rec_purc THEN
					l_bd_dpt := l_dpt2; /* 負担部門：配賦部門 */
				ELSE
					l_bd_dpt := l_dpt1; /* 負担部門：管理部門 */
				END IF;

				IF x.asst_typ = c_asst_prod OR x.calc_rec_typ = c_calc_rec_purc THEN
					l_sppl := x.bp_cd;
				ELSE
					l_cst := x.bp_cd;
				END IF;
				IF x.calc_rec_typ IN (c_calc_rec_end_stk, c_calc_rec_end_wip) THEN
					l_inv_com := x.stk_bp_cd;
				END IF;

			ELSIF x.calc_rec_typ = c_calc_rec_inpt THEN
				IF x.ac_slip_typ = c_ac_slip_byprod THEN
					l_sign := - 1;
					l_gr_dpt := l_dpt1; /* 入庫部門：投入部門 */
					l_gi_dpt := l_dpt2; /* 出庫部門：製造部門 */
					l_bd_dpt := l_dpt2; /* 負担部門：製造部門 */
				ELSE
					l_gr_dpt := l_dpt2; /* 入庫部門：製造部門 */
					l_gi_dpt := l_dpt1; /* 出庫部門：投入部門 */
					l_bd_dpt := l_dpt2; /* 負担部門：製造部門 */
				END IF;

				l_sppl := x.bp_cd;

			ELSIF x.calc_rec_typ = c_calc_rec_sls THEN
				l_gi_dpt := l_dpt1; /* 出庫部門：管理部門 */
				l_bd_dpt := l_dpt1; /* 負担部門：管理部門 */

				l_cst := x.bp_cd;

			ELSIF x.calc_rec_typ = c_calc_rec_io THEN
				IF x.asst_typ = c_asst_prod THEN
					l_sppl := COALESCE(x.stk_bp_cd, x.bp_cd);
				ELSE
					l_cst := COALESCE(x.stk_bp_cd, x.bp_cd);
				END IF;

				IF x.cost_io_typ IN (c_cost_io_ffr_prov, c_cost_io_onr_prov) THEN
					l_gi_dpt := l_dpt1; /* 出庫部門：管理部門 */
					l_gr_dpt := l_dpt2; /* 入庫部門：相手部門 */
					l_bd_dpt := l_dpt2; /* 負担部門：相手部門 */

				ELSIF x.cost_io_typ = c_cost_io_stk_in THEN

					IF x.trd_grp IS NOT NULL
					AND (
						l_prod_itm_diff_flg = '1' AND x.ac_slip_typ = c_ac_slip_prod_itm_gr
						OR
						l_prod_itm_ret_diff_flg = '1' AND x.ac_slip_typ = c_ac_slip_prod_itm_ret_gr
						OR
						l_dpt_xfr_diff_flg = '1' AND x.ac_slip_typ = c_ac_slip_dpt_xfr_gr
					) THEN
						FOR z4 IN
							SELECT
								COALESCE(SUM(t.amt), 0) amt
							FROM mgt_acc_trd t
							WHERE 0=0
							AND t.calc_no = i_calc_no
							AND t.calc_grp_cd = i_calc_grp_cd
							AND t.trd_grp = x.trd_grp
						LOOP
							IF z4.amt = 0 THEN
								IF (
									l_prod_itm_flg = '1' AND x.ac_slip_typ = c_ac_slip_prod_itm_gr
									OR
									l_prod_itm_ret_flg = '1' AND x.ac_slip_typ = c_ac_slip_prod_itm_ret_gr
									OR l_dpt_xfr_flg = '1' AND x.ac_slip_typ = c_ac_slip_dpt_xfr_gr
								) THEN
									NULL;
								ELSE
									EXIT NEXT_LOOP;
								END IF;
							ELSE
								l_amt := z4.amt * - 1;
							END IF;
						END LOOP;
					END IF;

					l_gi_dpt := l_dpt2; /* 出庫部門：相手部門 */
					l_gr_dpt := l_dpt1; /* 入庫部門：管理部門 */
					l_bd_dpt := l_dpt1; /* 負担部門：管理部門 */

				ELSIF x.cost_io_typ IN (c_cost_io_stk_out, c_cost_io_stk_io) THEN
					l_gi_dpt := l_dpt1; /* 出庫部門：管理部門 */
					l_gr_dpt := l_dpt2; /* 入庫部門：相手部門 */
					l_bd_dpt := l_dpt2; /* 負担部門：相手部門 */
				ELSE
					EXIT NEXT_LOOP;
				END IF;

				IF x.cost_io_typ = c_cost_io_stk_out
				AND (x.ac_slip_typ = c_ac_slip_in_stktk AND l_rev_in_stktk_flg = c_on
				  OR x.ac_slip_typ = c_ac_slip_oth_ccn_gr AND l_rev_oth_ccn_gr_flg = c_on
				  )
				THEN
					l_sign := -1 ;
				END IF ;

			ELSIF x.ac_slip_typ IN (c_ac_slip_eom_stk_asm_mis, c_ac_slip_stk_asm_diff) THEN
				l_gi_dpt := l_dpt1; /* 出庫部門：管理部門 */
				l_gr_dpt := l_dpt1; /* 入庫部門：管理部門 */
				l_bd_dpt := l_dpt1; /* 負担部門：管理部門 */

				l_sppl := x.bp_cd;

			ELSIF x.ac_slip_typ IN (c_ac_slip_itm_alc) THEN
				l_gi_dpt := l_dpt1; /* 出庫部門：費用部門 */
				l_gr_dpt := l_dpt2; /* 入庫部門：管理部門 */
				l_bd_dpt := l_dpt2; /* 負担部門：管理部門 */

				l_sppl := x.bp_cd;

			ELSIF x.ac_slip_typ IN (c_ac_slip_diff_io_sum, c_ac_slip_diff_io_pri, c_ac_slip_diff_io_rate) THEN
				l_gr_dpt := l_dpt1; /* 入庫部門：管理部門 */
				l_bd_dpt := l_dpt2; /* 負担部門：配賦部門 */

				l_sppl := x.bp_cd;

			ELSIF x.ac_slip_typ IN (c_ac_slip_diff_qt_par, c_ac_slip_diff_pr_par, c_ac_slip_diff_wk,
					c_ac_slip_diff_act1, c_ac_slip_diff_act2, c_ac_slip_diff_act3, c_ac_slip_diff_act4, c_ac_slip_diff_act5,
					c_ac_slip_diff_rate_itm, c_ac_slip_diff_outsrc_sum, c_ac_slip_diff_outsrc_pri, c_ac_slip_diff_outsrc_rate,
					c_ac_slip_diff_ss_par, c_ac_slip_diff_std_adj) THEN
				l_gr_dpt := l_dpt1; /* 入庫部門：管理部門 */
				l_bd_dpt := l_dpt1; /* 負担部門：管理部門 */

				l_sppl := x.bp_cd;

			ELSIF x.ac_slip_typ IN (c_ac_slip_diff_qt_chd, c_ac_slip_diff_pr_chd, c_ac_slip_diff_ss_chd) THEN
				l_gi_dpt := l_dpt2; /* 出庫部門：管理部門 */
				l_gr_dpt := l_dpt1; /* 入庫部門：管理部門 */
				l_bd_dpt := l_dpt1; /* 負担部門：管理部門 */

				l_sppl := x.bp_cd;

			ELSIF x.ac_slip_typ IN (c_ac_slip_diff_rate_alc) THEN
				l_gi_dpt := l_dpt1; /* 出庫部門：費用部門 */
				l_bd_dpt := l_dpt1; /* 負担部門：費用部門 */

				l_sppl := x.bp_cd;

			ELSE
				EXIT NEXT_LOOP;

			END IF;

			i := i + 1;
			rec := NULL;

			rec.data_no := lpad(mapa_num$f_get_seq(c_ac_cost_seq)::VARCHAR, c_it_dat_no_l, '0');
			rec.wg_cd := x.wg_cd;
			rec.ac_ym := i_ym;
			rec.calc_grp_cd := i_calc_grp_cd;
			rec.calc_no := i_calc_no;
			rec.ac_dt := l_end_dt;
			rec.ac_slip_typ := x.ac_slip_typ;
			rec.ac_rsn_cd := x.ac_rsn_cd;
			rec.purc_dpt_cd := l_purc_dpt;
			rec.ap_dpt_cd := l_ap_dpt;
			rec.sls_dpt_cd := l_sls_dpt;
			rec.ar_dpt_cd := l_ar_dpt;
			rec.gi_dpt_cd := l_gi_dpt;
			rec.gr_dpt_cd := l_gr_dpt;
			rec.bd_dpt_cd := l_bd_dpt;
			rec.sub_dpt_cd1 := l_sub_dpt1;
			rec.sub_dpt_cd2 := l_sub_dpt2;
			rec.sub_dpt_cd3 := l_sub_dpt3;
			rec.loc_cd := x.loc_cd;
			rec.str_ln_cd := x.str_ln_cd;
			rec.ac_itm_grp_cd := x.ac_itm_grp_cd;
			rec.itm_jnl_cd := x.itm_jnl_cd;
			rec.itm_cd := x.itm_cd;
			rec.itm_sub1 := x.itm_sub1;
			rec.itm_sub2 := x.itm_sub2;
			rec.itm_sub3 := x.itm_sub3;
			rec.itm_nm := x.itm_nm;
			rec.lot_no := COALESCE(x.lot_no, c_null_val);
			rec.sublot_no := COALESCE(x.sublot_no, c_null_val);
			rec.sno1 := COALESCE(x.sno1, c_null_val);
			rec.sno2 := COALESCE(x.sno2, c_null_val);
			rec.sno3 := COALESCE(x.sno3, c_null_val);
			rec.sno4 := COALESCE(x.sno4, c_null_val);
			rec.slo_no := x.slo_no;
			rec.po_no := x.po_no;
			rec.iv_no := x.iv_no;
			rec.wrk_no := NULL;
			rec.asst_typ := x.asst_typ;
			rec.repurc_obli_flg := x.repurc_obli_flg;
			rec.base_unit_cd := x.unit_cd;
			rec.base_unit_qty := x.qty * l_sign;
			rec.base_cur_cd := l_co.base_cur_cd;
			rec.amt := x.amt * l_sign;
			rec.sppl_cd := l_sppl;
			rec.cst_cd := l_cst;
			rec.inv_com_cd := l_inv_com;
			IF x.area_cd IS NOT NULL THEN
				rec.area_cd := x.area_cd;
			ELSIF l_inv_com IS NULL THEN
				rec.area_cd := l_co.area_cd;
			END IF;

			IF x.cntry_cd IS NOT NULL THEN
				rec.cntry_cd := x.cntry_cd;
			ELSIF l_inv_com IS NULL THEN
				rec.cntry_cd := l_co.cntry_cd;
			END IF;
			rec.foreign_flg := l_foreign;
			rec.usr_cd := x.usr_cd;
			rec.trd_grp := x.trd_grp;
			rec.trd_ac_itm_grp_cd := x.trd_ac_itm_grp_cd;
			rec.trd_itm_jnl_cd := x.trd_itm_jnl_cd;
			rec.trd_itm_cd := x.trd_itm_cd;
			rec.trd_itm_sub1 := x.trd_itm_sub1;
			rec.trd_itm_sub2 := x.trd_itm_sub2;
			rec.trd_itm_sub3 := x.trd_itm_sub3;
			rec.trd_itm_nm := x.trd_itm_nm;
			rec.trd_lot_no := x.trd_lot_no;
			rec.trd_sublot_no := x.trd_sublot_no;
			rec.trd_sno1 := x.trd_sno1;
			rec.trd_sno2 := x.trd_sno2;
			rec.trd_sno3 := x.trd_sno3;
			rec.trd_sno4 := x.trd_sno4;

			rec.jnl_fin_cnt := 0;

			rec.alc_ac_cd := x.alc_ac_cd;
			rec.expns_cd := x.expns_cd;
			rec.sub_char1 := NULL;
			rec.sub_char2 := NULL;
			rec.sub_char3 := NULL;
			rec.sub_char4 := NULL;
			rec.sub_char5 := NULL;
			rec.sub_char6 := NULL;
			rec.sub_char7 := NULL;
			rec.sub_char8 := NULL;
			rec.sub_char9 := NULL;
			rec.sub_char10 := NULL;
			rec.sub_num1 := NULL;
			rec.sub_num2 := NULL;
			rec.sub_num3 := NULL;
			rec.sub_dt1 := NULL;
			rec.sub_dt2 := NULL;
			rec.sub_dt3 := NULL;

			IF l_amt <> 0 AND l_prod_itm_diff_flg = '1' AND x.ac_slip_typ = c_ac_slip_prod_itm_gr THEN

				IF l_prod_itm_flg = '0' THEN
					rec.ac_slip_typ := c_ac_slip_prod_itm_diff;
					rec.amt := l_amt;
				ELSIF l_prod_itm_flg = '1' THEN

					recs[i] := rec;

					i := i + 1;
					rec.data_no := lpad(mapa_num$f_get_seq(c_ac_cost_seq)::VARCHAR, c_it_dat_no_l, '0');
					rec.ac_slip_typ := c_ac_slip_prod_itm_diff;
					rec.amt := l_amt;
				END IF;

			ELSIF l_amt <> 0 AND l_prod_itm_ret_diff_flg = '1' AND x.ac_slip_typ = c_ac_slip_prod_itm_ret_gr THEN

				IF l_prod_itm_ret_flg = '0' THEN
					rec.ac_slip_typ := c_ac_slip_prod_itm_ret_diff;
					rec.amt := l_amt;
				ELSIF l_prod_itm_ret_flg = '1' THEN

					recs[i] := rec;

					i := i + 1;
					rec.data_no := lpad(mapa_num$f_get_seq(c_ac_cost_seq)::VARCHAR, c_it_dat_no_l, '0');
					rec.ac_slip_typ := c_ac_slip_prod_itm_ret_diff;
					rec.amt := l_amt;
				END IF;

			ELSIF l_amt <> 0 AND l_dpt_xfr_diff_flg = '1' AND x.ac_slip_typ = c_ac_slip_dpt_xfr_gr THEN

				IF l_dpt_xfr_flg = '0' THEN
					rec.ac_slip_typ := c_ac_slip_dpt_xfr_diff;
					rec.amt := l_amt;
				ELSIF l_dpt_xfr_flg = '1' THEN

					recs[i] := rec;

					i := i + 1;
					rec.data_no := lpad(mapa_num$f_get_seq(c_ac_cost_seq)::VARCHAR, c_it_dat_no_l, '0');
					rec.ac_slip_typ := c_ac_slip_dpt_xfr_diff;
					rec.amt := l_amt;
				END IF;

			END IF;

			FOR j IN 1..10 LOOP
				CASE j
					WHEN 1 THEN
						l_jnl_key_col_typ := c_jnl_key1;
					WHEN 2 THEN
						l_jnl_key_col_typ := c_jnl_key2;
					WHEN 3 THEN
						l_jnl_key_col_typ := c_jnl_key3;
					WHEN 4 THEN
						l_jnl_key_col_typ := c_jnl_key4;
					WHEN 5 THEN
						l_jnl_key_col_typ := c_jnl_key5;
					WHEN 6 THEN
						l_jnl_key_col_typ := c_jnl_key6;
					WHEN 7 THEN
						l_jnl_key_col_typ := c_jnl_key7;
					WHEN 8 THEN
						l_jnl_key_col_typ := c_jnl_key8;
					WHEN 9 THEN
						l_jnl_key_col_typ := c_jnl_key9;
					WHEN 10 THEN
						l_jnl_key_col_typ := c_jnl_key10;
				END CASE;

				/* 仕訳キー対応マスタのレコードを取得 */
				l_jnl_key_map := NULL;
				CALL mgpa_ac_if$p_get_jnl_key_map(rec.ac_slip_typ, l_jnl_key_col_typ, l_jnl_key_map_rec, l_jnl_key_map);

				IF l_jnl_key_map.jnl_key_set_col_typ IS NULL THEN
					CONTINUE;
				END IF;

				/* 取引先を専用レコードへ格納 */
				l_bp_rec := NULL;
				l_bp_rec.cst_cd := rec.cst_cd;
				l_bp_rec.sppl_cd := rec.sppl_cd;
				l_bp_rec.inv_com_cd := rec.inv_com_cd;

				/* 仕訳キー設定項目に対応するカラムの値を取得 */
				CASE l_jnl_key_map.jnl_key_set_col_typ
					WHEN c_wg_cd THEN
						l_jnl_key_set_val := rec.wg_cd;
						l_not_null_flg := c_on;
					WHEN c_purc_dpt_cd THEN
						l_jnl_key_set_val := rec.purc_dpt_cd;
						l_not_null_flg := c_off;
					WHEN c_ap_dpt_cd THEN
						l_jnl_key_set_val := rec.ap_dpt_cd;
						l_not_null_flg := c_off;
					WHEN c_sls_dpt_cd THEN
						l_jnl_key_set_val := rec.sls_dpt_cd;
						l_not_null_flg := c_off;
					WHEN c_ar_dpt_cd THEN
						l_jnl_key_set_val := rec.ar_dpt_cd;
						l_not_null_flg := c_off;
					WHEN c_gi_dpt_cd THEN
						l_jnl_key_set_val := rec.gi_dpt_cd;
						l_not_null_flg := c_off;
					WHEN c_gr_dpt_cd THEN
						l_jnl_key_set_val := rec.gr_dpt_cd;
						l_not_null_flg := c_off;
					WHEN c_bd_dpt_cd THEN
						l_jnl_key_set_val := rec.bd_dpt_cd;
						l_not_null_flg := c_off;
					WHEN c_sub_dpt_cd1 THEN
						l_jnl_key_set_val := rec.sub_dpt_cd1;
						l_not_null_flg := c_off;
					WHEN c_sub_dpt_cd2 THEN
						l_jnl_key_set_val := rec.sub_dpt_cd2;
						l_not_null_flg := c_off;
					WHEN c_sub_dpt_cd3 THEN
						l_jnl_key_set_val := rec.sub_dpt_cd3;
						l_not_null_flg := c_off;
					WHEN c_loc_cd THEN
						l_jnl_key_set_val := rec.loc_cd;
						l_not_null_flg := c_off;
					WHEN c_str_ln_cd THEN
						l_jnl_key_set_val := rec.str_ln_cd;
						l_not_null_flg := c_off;
					WHEN c_cst_cd THEN
						l_jnl_key_set_val := rec.cst_cd;
						l_not_null_flg := c_off;
					WHEN c_sppl_cd THEN
						l_jnl_key_set_val := rec.sppl_cd;
						l_not_null_flg := c_off;
					WHEN c_inv_com_cd THEN
						l_jnl_key_set_val := rec.inv_com_cd;
						l_not_null_flg := c_off;
					WHEN c_ac_itm_grp_cd THEN
						l_jnl_key_set_val := rec.ac_itm_grp_cd;
						l_not_null_flg := c_off;
					WHEN c_itm_cd THEN
						l_jnl_key_set_val := rec.itm_cd;
						l_not_null_flg := c_on;
					WHEN c_itm_sub1 THEN
						l_jnl_key_set_val := rec.itm_sub1;
						l_not_null_flg := c_on;
					WHEN c_itm_sub2 THEN
						l_jnl_key_set_val := rec.itm_sub2;
						l_not_null_flg := c_on;
					WHEN c_itm_sub3 THEN
						l_jnl_key_set_val := rec.itm_sub3;
						l_not_null_flg := c_on;
					WHEN c_sno1 THEN
						l_jnl_key_set_val := rec.sno1;
						l_not_null_flg := c_on;
					WHEN c_sno2 THEN
						l_jnl_key_set_val := rec.sno2;
						l_not_null_flg := c_on;
					WHEN c_sno3 THEN
						l_jnl_key_set_val := rec.sno3;
						l_not_null_flg := c_on;
					WHEN c_sno4 THEN
						l_jnl_key_set_val := rec.sno4;
						l_not_null_flg := c_on;
					WHEN c_itm_grp_cd1 THEN
						l_jnl_key_set_val := x.itm_grp_cd1;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd2 THEN
						l_jnl_key_set_val := x.itm_grp_cd2;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd3 THEN
						l_jnl_key_set_val := x.itm_grp_cd3;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd4 THEN
						l_jnl_key_set_val := x.itm_grp_cd4;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd5 THEN
						l_jnl_key_set_val := x.itm_grp_cd5;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd6 THEN
						l_jnl_key_set_val := x.itm_grp_cd6;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd7 THEN
						l_jnl_key_set_val := x.itm_grp_cd7;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd8 THEN
						l_jnl_key_set_val := x.itm_grp_cd8;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd9 THEN
						l_jnl_key_set_val := x.itm_grp_cd9;
						l_not_null_flg := c_off;
					WHEN c_itm_grp_cd10 THEN
						l_jnl_key_set_val := x.itm_grp_cd10;
						l_not_null_flg := c_off;
					WHEN c_trd_ac_itm_grp_cd THEN
						l_jnl_key_set_val := rec.trd_ac_itm_grp_cd;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_jnl_cd THEN
						l_jnl_key_set_val := rec.trd_itm_jnl_cd;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_cd THEN
						l_jnl_key_set_val := rec.trd_itm_cd;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_sub1 THEN
						l_jnl_key_set_val := rec.trd_itm_sub1;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_sub2 THEN
						l_jnl_key_set_val := rec.trd_itm_sub2;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_sub3 THEN
						l_jnl_key_set_val := rec.trd_itm_sub3;
						l_not_null_flg := c_off;
					WHEN c_trd_sno1 THEN
						l_jnl_key_set_val := rec.trd_sno1;
						l_not_null_flg := c_off;
					WHEN c_trd_sno2 THEN
						l_jnl_key_set_val := rec.trd_sno2;
						l_not_null_flg := c_off;
					WHEN c_trd_sno3 THEN
						l_jnl_key_set_val := rec.trd_sno3;
						l_not_null_flg := c_off;
					WHEN c_trd_sno4 THEN
						l_jnl_key_set_val := rec.trd_sno4;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd1 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd1;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd2 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd2;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd3 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd3;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd4 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd4;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd5 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd5;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd6 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd6;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd7 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd7;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd8 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd8;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd9 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd9;
						l_not_null_flg := c_off;
					WHEN c_trd_itm_grp_cd10 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd10;
						l_not_null_flg := c_off;
					WHEN c_area_cd THEN
						l_jnl_key_set_val := rec.area_cd;
						l_not_null_flg := c_off;
					WHEN c_cntry_cd THEN
						l_jnl_key_set_val := rec.cntry_cd;
						l_not_null_flg := c_off;
					WHEN c_alc_ac_cd THEN
						l_jnl_key_set_val := rec.alc_ac_cd;
						l_not_null_flg := c_off;
					WHEN c_src_alc_ac_cd THEN
						l_jnl_key_set_val := rec.src_alc_ac_cd;
						l_not_null_flg := c_off;
					WHEN c_expns_cd THEN
						l_jnl_key_set_val := rec.expns_cd;
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd1 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd1, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd2 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd2, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd3 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd3, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd4 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd4, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd5 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd5, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd6 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd6, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd7 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd7, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd8 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd8, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd9 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd9, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_bp_grp_cd10 THEN
						CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd10, l_jnl_key_set_val, l_bp_grp_rec);
						l_not_null_flg := c_off;
					WHEN c_sub_char1 THEN
						l_jnl_key_set_val := rec.sub_char1;
						l_not_null_flg := c_off;
					WHEN c_sub_char2 THEN
						l_jnl_key_set_val := rec.sub_char2;
						l_not_null_flg := c_off;
					WHEN c_sub_char3 THEN
						l_jnl_key_set_val := rec.sub_char3;
						l_not_null_flg := c_off;
					WHEN c_sub_char4 THEN
						l_jnl_key_set_val := rec.sub_char4;
						l_not_null_flg := c_off;
					WHEN c_sub_char5 THEN
						l_jnl_key_set_val := rec.sub_char5;
						l_not_null_flg := c_off;
					WHEN c_sub_char6 THEN
						l_jnl_key_set_val := rec.sub_char6;
						l_not_null_flg := c_off;
					WHEN c_sub_char7 THEN
						l_jnl_key_set_val := rec.sub_char7;
						l_not_null_flg := c_off;
					WHEN c_sub_char8 THEN
						l_jnl_key_set_val := rec.sub_char8;
						l_not_null_flg := c_off;
					WHEN c_sub_char9 THEN
						l_jnl_key_set_val := rec.sub_char9;
						l_not_null_flg := c_off;
					WHEN c_sub_char10 THEN
						l_jnl_key_set_val := rec.sub_char10;
						l_not_null_flg := c_off;
					ELSE
						l_jnl_key_set_val := NULL;
						l_not_null_flg := c_off;
				END CASE;

				/* NULL可項目がNULLの場合、NULL不可項目がNULL文字の場合 */
				IF (l_jnl_key_set_val IS NULL AND l_not_null_flg = c_off)
					OR (l_jnl_key_set_val = c_null_val AND l_not_null_flg = c_on) THEN
					l_jnl_key_set_val := l_jnl_key_map.default_cd;
				END IF;

				CASE l_jnl_key_col_typ
					WHEN c_jnl_key1 THEN
						rec.jnl_key1 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key1_l);
					WHEN c_jnl_key2 THEN
						rec.jnl_key2 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key2_l);
					WHEN c_jnl_key3 THEN
						rec.jnl_key3 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key3_l);
					WHEN c_jnl_key4 THEN
						rec.jnl_key4 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key4_l);
					WHEN c_jnl_key5 THEN
						rec.jnl_key5 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key5_l);
					WHEN c_jnl_key6 THEN
						rec.jnl_key6 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key6_l);
					WHEN c_jnl_key7 THEN
						rec.jnl_key7 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key7_l);
					WHEN c_jnl_key8 THEN
						rec.jnl_key8 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key8_l);
					WHEN c_jnl_key9 THEN
						rec.jnl_key9 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key9_l);
					WHEN c_jnl_key10 THEN
						rec.jnl_key10 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key10_l);
				END CASE;
			END LOOP;

			recs[i] := rec;

			IF i > c_max_cnt THEN
				CALL mgpa_ac_if$p_ac_cost_insert(recs);
				i := 0;
			END IF;

		END;-- NEXT_LOOP

	END LOOP;

	CALL mgpa_ac_if$p_ac_cost_insert(recs);

	<<SKIP_DPT_ALC>>
	BEGIN

		SELECT COUNT(*)
		INTO STRICT l_cnt
		FROM mam_cost_slip_jnl
		WHERE calc_grp_cd = i_calc_grp_cd
		AND ac_slip_typ = c_ac_slip_dpt_alc
		;

		IF l_cnt = 0 THEN
			EXIT SKIP_DPT_ALC;
		END IF;

		/* 部門間配賦の結果を送信 */
		recs := '{}';
		i := 0;
		FOR x IN
			SELECT
				z.lvl,
				z.src_dpt_cd,
				z.dpt_cd,
				z.src_alc_ac_cd,
				z.alc_ac_cd,
				z.wg_cd,
				z.loc_cd,
				itm.ac_itm_grp_cd,
				COALESCE(itm.itm_jnl_cd, c_null_val) itm_jnl_cd,
				COALESCE(z.itm_cd, c_null_val) itm_cd,
				COALESCE(z.itm_sub1, c_null_val) itm_sub1,
				COALESCE(z.itm_sub2, c_null_val) itm_sub2,
				COALESCE(z.itm_sub3, c_null_val) itm_sub3,
				COALESCE(sun.itm_nm, itm.itm_nm) itm_nm,
				COALESCE(z.lot_no, c_null_val) lot_no,
				COALESCE(z.sublot_no, c_null_val) sublot_no,
				COALESCE(z.sno1, c_null_val) sno1,
				COALESCE(z.sno2, c_null_val) sno2,
				COALESCE(z.sno3, c_null_val) sno3,
				COALESCE(z.sno4, c_null_val) sno4,
				z.slo_no,
				z.po_no,
				z.iv_no,
				itm.unit_cd,
				z.amt,
				itm.itm_grp_cd1,
				itm.itm_grp_cd2,
				itm.itm_grp_cd3,
				itm.itm_grp_cd4,
				itm.itm_grp_cd5,
				itm.itm_grp_cd6,
				itm.itm_grp_cd7,
				itm.itm_grp_cd8,
				itm.itm_grp_cd9,
				itm.itm_grp_cd10,
				NULL trd_itm_grp_cd1,
				NULL trd_itm_grp_cd2,
				NULL trd_itm_grp_cd3,
				NULL trd_itm_grp_cd4,
				NULL trd_itm_grp_cd5,
				NULL trd_itm_grp_cd6,
				NULL trd_itm_grp_cd7,
				NULL trd_itm_grp_cd8,
				NULL trd_itm_grp_cd9,
				NULL trd_itm_grp_cd10
			FROM (
				WITH RECURSIVE
				base AS (
					SELECT
						t.*,
						ROW_NUMBER() OVER(ORDER BY NULL) rec_id,
						ROW_NUMBER() OVER(ORDER BY t.pre_alc_seq, t.calc_no, t.calc_grp_cd) search_id
					FROM mgt_pre_alc_path t
				),
				vrec AS (
					SELECT
						c.rec_id root_id,
						NULL::NUMERIC par_id,
						c.rec_id,
						1 hrrchy,
						c.pre_alc_seq,
						NULL::VARCHAR src_dpt_cd,
						NULL::VARCHAR src_alc_ac_cd,
						c.dpt_cd,
						c.alc_ac_cd,
						ARRAY(SELECT c.search_id) search_id_path,
						ARRAY(SELECT c.rec_id) rec_id_path,
						'0' cycle_flg
					FROM base c
					WHERE 0=0
					AND c.calc_no = i_calc_no
					AND c.calc_grp_cd = i_calc_grp_cd
					AND c.dpt_cd IS NOT NULL
					AND c.pre_alc_lvl = 0
					AND (
						EXISTS (
							SELECT 'X' FROM mam_cost_ac_dpt_map w
							WHERE w.dpt_cd = c.dpt_cd
							AND w.st_dt <= l_end_dt
							AND w.end_dt >= l_end_dt
							AND EXISTS (
								SELECT 'X' FROM mam_ac_dpt y
								WHERE y.ac_dpt_cd = w.ac_dpt_cd
								AND y.st_dt <= l_end_dt
								AND y.end_dt >= l_end_dt
							)
						)
						OR
						EXISTS (
								SELECT 'X' FROM mam_ac_dpt y
								WHERE y.ac_dpt_cd = c.dpt_cd
								AND y.st_dt <= l_end_dt
								AND y.end_dt >= l_end_dt
						)
					)
					AND NOT EXISTS (
						SELECT 'X' FROM mam_itm_srch w
						WHERE w.itm_cd = c.itm_cd
						AND w.itm_sub1 = c.itm_sub1
						AND w.itm_sub2 = c.itm_sub2
						AND w.itm_sub3 = c.itm_sub3
						AND w.del_flg = '0'
						AND w.release_flg = '1'
						AND EXISTS (
							SELECT 'X' FROM mam_cost_ac_out y
							WHERE 0=0
							AND y.calc_grp_cd = i_calc_grp_cd
							AND y.ac_slip_typ = c_ac_slip_dpt_alc
							AND y.itm_jnl_cd = w.itm_jnl_cd
							AND y.st_dt <= l_end_dt
							AND y.end_dt >= l_end_dt
						)
					)
					UNION ALL (
						SELECT
							p.root_id,
							p.rec_id par_id,
							c.rec_id,
							p.hrrchy + 1 hrrchy,
							c.pre_alc_seq,
							p.dpt_cd src_dpt_cd,
							p.alc_ac_cd src_alc_ac_cd,
							c.dpt_cd,
							c.alc_ac_cd,
							p.search_id_path || c.search_id search_id_path,
							p.rec_id_path || c.rec_id rec_id_path,
							CASE WHEN c.rec_id = any(p.rec_id_path) THEN '1' ELSE '0' END cycle_flg
						FROM vrec p
						INNER JOIN base c ON (p.pre_alc_seq = c.src_pre_alc_seq)
						WHERE 0=0
						AND p.cycle_flg = '0'
						AND c.calc_no = i_calc_no
						AND c.calc_grp_cd = i_calc_grp_cd
						AND NOT EXISTS (
								SELECT 'X' FROM mgt_pre_alc_path w
								WHERE w.calc_no = c.calc_no
								AND w.calc_grp_cd = c.calc_grp_cd
								AND w.src_pre_alc_seq = c.src_pre_alc_seq
								AND w.dpt_cd IS NULL)
					)
				)
				SELECT
					ROW_NUMBER() OVER(ORDER BY p.search_id_path) AS no,
					p.hrrchy lvl,
					p.src_dpt_cd,
					p.src_alc_ac_cd,
					c.dpt_cd,
					c.alc_ac_cd,
					c.wg_cd,
					c.loc_cd,
					c.itm_cd,
					c.itm_sub1,
					c.itm_sub2,
					c.itm_sub3,
					c.lot_no,
					c.sublot_no,
					c.sno1,
					c.sno2,
					c.sno3,
					c.sno4,
					c.slo_no,
					c.po_no,
					c.iv_no,
					c.amt
				FROM vrec p
				LEFT OUTER JOIN base c ON (p.rec_id = c.rec_id)
				WHERE 0=0
				AND p.cycle_flg = '0'
			) z
			LEFT OUTER JOIN mam_itm_srch itm ON
				(0=0
				AND itm.itm_cd = z.itm_cd
				AND itm.itm_sub1 = z.itm_sub1
				AND itm.itm_sub2 = z.itm_sub2
				AND itm.itm_sub3 = z.itm_sub3
				AND itm.del_flg = '0'
				AND itm.release_flg = '1'
				)
			LEFT OUTER JOIN mam_sundry_itm sun ON
				(0=0
				AND sun.itm_cd = z.itm_cd
				AND sun.itm_sub1 = z.itm_sub1
				AND sun.itm_sub2 = z.itm_sub2
				AND sun.itm_sub3 = z.itm_sub3
				AND sun.sno1 = z.sno1
				AND sun.sno2 = z.sno2
				AND sun.sno3 = z.sno3
				AND sun.sno4 = z.sno4
				)
			WHERE 0=0
			AND z.lvl <> 1
			ORDER BY z.no
		LOOP

			<<NEXT_LOOP>>
			BEGIN

				CALL mgpa_ac_if$p_get_ac_dpt(x.src_dpt_cd, l_end_dt, l_dpt_map_rec, l_gi_dpt, '1');
				CALL mgpa_ac_if$p_get_ac_dpt(x.dpt_cd, l_end_dt, l_dpt_map_rec, l_gr_dpt, '1');

				IF l_gi_dpt IS NULL THEN
					l_gi_dpt := dpt_path[x.lvl - 1];
				END IF;
				dpt_path[x.lvl] := l_gi_dpt;

				IF l_gr_dpt IS NULL THEN
					EXIT NEXT_LOOP;
				END IF;

				i := i + 1;
				rec := NULL;

				rec.wg_cd := x.wg_cd;
				rec.ac_ym := i_ym;
				rec.calc_grp_cd := i_calc_grp_cd;
				rec.calc_no := i_calc_no;
				rec.ac_dt := l_end_dt;
				rec.ac_slip_typ := c_ac_slip_dpt_alc;
				rec.gi_dpt_cd := l_gi_dpt;
				rec.gr_dpt_cd := l_gr_dpt;
				rec.bd_dpt_cd := l_gr_dpt;
				rec.loc_cd := x.loc_cd;
				rec.ac_itm_grp_cd := x.ac_itm_grp_cd;
				rec.itm_jnl_cd := x.itm_jnl_cd;
				rec.itm_cd := x.itm_cd;
				rec.itm_sub1 := x.itm_sub1;
				rec.itm_sub2 := x.itm_sub2;
				rec.itm_sub3 := x.itm_sub3;
				rec.itm_nm := x.itm_nm;
				rec.lot_no := x.lot_no;
				rec.sublot_no := x.sublot_no;
				rec.sno1 := x.sno1;
				rec.sno2 := x.sno2;
				rec.sno3 := x.sno3;
				rec.sno4 := x.sno4;
				rec.slo_no := x.slo_no;
				rec.po_no := x.po_no;
				rec.iv_no := x.iv_no;
				rec.base_unit_cd := x.unit_cd;
				rec.base_unit_qty := 0;
				rec.base_cur_cd := l_co.base_cur_cd;
				rec.amt := x.amt;
				rec.foreign_flg := '0';
				rec.jnl_fin_cnt := 0;
				rec.src_alc_ac_cd := x.src_alc_ac_cd;
				rec.alc_ac_cd := x.alc_ac_cd;

				FOR j IN 1..10 LOOP
					CASE j
						WHEN 1 THEN
							l_jnl_key_col_typ := c_jnl_key1;
						WHEN 2 THEN
							l_jnl_key_col_typ := c_jnl_key2;
						WHEN 3 THEN
							l_jnl_key_col_typ := c_jnl_key3;
						WHEN 4 THEN
							l_jnl_key_col_typ := c_jnl_key4;
						WHEN 5 THEN
							l_jnl_key_col_typ := c_jnl_key5;
						WHEN 6 THEN
							l_jnl_key_col_typ := c_jnl_key6;
						WHEN 7 THEN
							l_jnl_key_col_typ := c_jnl_key7;
						WHEN 8 THEN
							l_jnl_key_col_typ := c_jnl_key8;
						WHEN 9 THEN
							l_jnl_key_col_typ := c_jnl_key9;
						WHEN 10 THEN
							l_jnl_key_col_typ := c_jnl_key10;
					END CASE;

					/* 仕訳キー対応マスタのレコードを取得 */
					l_jnl_key_map := NULL;
					CALL mgpa_ac_if$p_get_jnl_key_map(rec.ac_slip_typ, l_jnl_key_col_typ, l_jnl_key_map_rec, l_jnl_key_map);

					IF l_jnl_key_map.jnl_key_set_col_typ IS NULL THEN
						CONTINUE;
					END IF;

					/* 取引先を専用レコードへ格納 */
					l_bp_rec := NULL;
					l_bp_rec.cst_cd := rec.cst_cd;
					l_bp_rec.sppl_cd := rec.sppl_cd;
					l_bp_rec.inv_com_cd := rec.inv_com_cd;

					/* 仕訳キー設定項目に対応するカラムの値を取得 */
					CASE l_jnl_key_map.jnl_key_set_col_typ
						WHEN c_wg_cd THEN
							l_jnl_key_set_val := rec.wg_cd;
							l_not_null_flg := c_on;
						WHEN c_purc_dpt_cd THEN
							l_jnl_key_set_val := rec.purc_dpt_cd;
							l_not_null_flg := c_off;
						WHEN c_ap_dpt_cd THEN
							l_jnl_key_set_val := rec.ap_dpt_cd;
							l_not_null_flg := c_off;
						WHEN c_sls_dpt_cd THEN
							l_jnl_key_set_val := rec.sls_dpt_cd;
							l_not_null_flg := c_off;
						WHEN c_ar_dpt_cd THEN
							l_jnl_key_set_val := rec.ar_dpt_cd;
							l_not_null_flg := c_off;
						WHEN c_gi_dpt_cd THEN
							l_jnl_key_set_val := rec.gi_dpt_cd;
							l_not_null_flg := c_off;
						WHEN c_gr_dpt_cd THEN
							l_jnl_key_set_val := rec.gr_dpt_cd;
							l_not_null_flg := c_off;
						WHEN c_bd_dpt_cd THEN
							l_jnl_key_set_val := rec.bd_dpt_cd;
							l_not_null_flg := c_off;
						WHEN c_sub_dpt_cd1 THEN
							l_jnl_key_set_val := rec.sub_dpt_cd1;
							l_not_null_flg := c_off;
						WHEN c_sub_dpt_cd2 THEN
							l_jnl_key_set_val := rec.sub_dpt_cd2;
							l_not_null_flg := c_off;
						WHEN c_sub_dpt_cd3 THEN
							l_jnl_key_set_val := rec.sub_dpt_cd3;
							l_not_null_flg := c_off;
						WHEN c_loc_cd THEN
							l_jnl_key_set_val := rec.loc_cd;
							l_not_null_flg := c_off;
						WHEN c_str_ln_cd THEN
							l_jnl_key_set_val := rec.str_ln_cd;
							l_not_null_flg := c_off;
						WHEN c_cst_cd THEN
							l_jnl_key_set_val := rec.cst_cd;
							l_not_null_flg := c_off;
						WHEN c_sppl_cd THEN
							l_jnl_key_set_val := rec.sppl_cd;
							l_not_null_flg := c_off;
						WHEN c_inv_com_cd THEN
							l_jnl_key_set_val := rec.inv_com_cd;
							l_not_null_flg := c_off;
						WHEN c_ac_itm_grp_cd THEN
							l_jnl_key_set_val := rec.ac_itm_grp_cd;
							l_not_null_flg := c_off;
						WHEN c_itm_cd THEN
							l_jnl_key_set_val := rec.itm_cd;
							l_not_null_flg := c_on;
						WHEN c_itm_sub1 THEN
							l_jnl_key_set_val := rec.itm_sub1;
							l_not_null_flg := c_on;
						WHEN c_itm_sub2 THEN
							l_jnl_key_set_val := rec.itm_sub2;
							l_not_null_flg := c_on;
						WHEN c_itm_sub3 THEN
							l_jnl_key_set_val := rec.itm_sub3;
							l_not_null_flg := c_on;
						WHEN c_sno1 THEN
							l_jnl_key_set_val := rec.sno1;
							l_not_null_flg := c_on;
						WHEN c_sno2 THEN
							l_jnl_key_set_val := rec.sno2;
							l_not_null_flg := c_on;
						WHEN c_sno3 THEN
							l_jnl_key_set_val := rec.sno3;
							l_not_null_flg := c_on;
						WHEN c_sno4 THEN
							l_jnl_key_set_val := rec.sno4;
							l_not_null_flg := c_on;
						WHEN c_itm_grp_cd1 THEN
							l_jnl_key_set_val := x.itm_grp_cd1;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd2 THEN
							l_jnl_key_set_val := x.itm_grp_cd2;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd3 THEN
							l_jnl_key_set_val := x.itm_grp_cd3;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd4 THEN
							l_jnl_key_set_val := x.itm_grp_cd4;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd5 THEN
							l_jnl_key_set_val := x.itm_grp_cd5;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd6 THEN
							l_jnl_key_set_val := x.itm_grp_cd6;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd7 THEN
							l_jnl_key_set_val := x.itm_grp_cd7;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd8 THEN
							l_jnl_key_set_val := x.itm_grp_cd8;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd9 THEN
							l_jnl_key_set_val := x.itm_grp_cd9;
							l_not_null_flg := c_off;
						WHEN c_itm_grp_cd10 THEN
							l_jnl_key_set_val := x.itm_grp_cd10;
							l_not_null_flg := c_off;
						WHEN c_trd_ac_itm_grp_cd THEN
							l_jnl_key_set_val := rec.trd_ac_itm_grp_cd;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_jnl_cd THEN
							l_jnl_key_set_val := rec.trd_itm_jnl_cd;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_cd THEN
							l_jnl_key_set_val := rec.trd_itm_cd;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_sub1 THEN
							l_jnl_key_set_val := rec.trd_itm_sub1;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_sub2 THEN
							l_jnl_key_set_val := rec.trd_itm_sub2;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_sub3 THEN
							l_jnl_key_set_val := rec.trd_itm_sub3;
							l_not_null_flg := c_off;
						WHEN c_trd_sno1 THEN
							l_jnl_key_set_val := rec.trd_sno1;
							l_not_null_flg := c_off;
						WHEN c_trd_sno2 THEN
							l_jnl_key_set_val := rec.trd_sno2;
							l_not_null_flg := c_off;
						WHEN c_trd_sno3 THEN
							l_jnl_key_set_val := rec.trd_sno3;
							l_not_null_flg := c_off;
						WHEN c_trd_sno4 THEN
							l_jnl_key_set_val := rec.trd_sno4;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd1 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd1;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd2 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd2;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd3 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd3;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd4 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd4;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd5 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd5;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd6 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd6;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd7 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd7;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd8 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd8;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd9 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd9;
							l_not_null_flg := c_off;
						WHEN c_trd_itm_grp_cd10 THEN
							l_jnl_key_set_val := x.trd_itm_grp_cd10;
							l_not_null_flg := c_off;
						WHEN c_area_cd THEN
							l_jnl_key_set_val := rec.area_cd;
							l_not_null_flg := c_off;
						WHEN c_cntry_cd THEN
							l_jnl_key_set_val := rec.cntry_cd;
							l_not_null_flg := c_off;
						WHEN c_alc_ac_cd THEN
							l_jnl_key_set_val := rec.alc_ac_cd;
							l_not_null_flg := c_off;
						WHEN c_src_alc_ac_cd THEN
							l_jnl_key_set_val := rec.src_alc_ac_cd;
							l_not_null_flg := c_off;
						WHEN c_expns_cd THEN
							l_jnl_key_set_val := rec.expns_cd;
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd1 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd1, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd2 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd2, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd3 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd3, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd4 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd4, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd5 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd5, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd6 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd6, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd7 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd7, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd8 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd8, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd9 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd9, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_bp_grp_cd10 THEN
							CALL mgpa_ac_if$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd10, l_jnl_key_set_val, l_bp_grp_rec);
							l_not_null_flg := c_off;
						WHEN c_sub_char1 THEN
							l_jnl_key_set_val := rec.sub_char1;
							l_not_null_flg := c_off;
						WHEN c_sub_char2 THEN
							l_jnl_key_set_val := rec.sub_char2;
							l_not_null_flg := c_off;
						WHEN c_sub_char3 THEN
							l_jnl_key_set_val := rec.sub_char3;
							l_not_null_flg := c_off;
						WHEN c_sub_char4 THEN
							l_jnl_key_set_val := rec.sub_char4;
							l_not_null_flg := c_off;
						WHEN c_sub_char5 THEN
							l_jnl_key_set_val := rec.sub_char5;
							l_not_null_flg := c_off;
						WHEN c_sub_char6 THEN
							l_jnl_key_set_val := rec.sub_char6;
							l_not_null_flg := c_off;
						WHEN c_sub_char7 THEN
							l_jnl_key_set_val := rec.sub_char7;
							l_not_null_flg := c_off;
						WHEN c_sub_char8 THEN
							l_jnl_key_set_val := rec.sub_char8;
							l_not_null_flg := c_off;
						WHEN c_sub_char9 THEN
							l_jnl_key_set_val := rec.sub_char9;
							l_not_null_flg := c_off;
						WHEN c_sub_char10 THEN
							l_jnl_key_set_val := rec.sub_char10;
							l_not_null_flg := c_off;
						ELSE
							l_jnl_key_set_val := NULL;
							l_not_null_flg := c_off;
					END CASE;

					/* NULL可項目がNULLの場合、NULL不可項目がNULL文字の場合 */
					IF (l_jnl_key_set_val IS NULL AND l_not_null_flg = c_off)
						OR (l_jnl_key_set_val = c_null_val AND l_not_null_flg = c_on) THEN
						l_jnl_key_set_val := l_jnl_key_map.default_cd;
					END IF;

					CASE l_jnl_key_col_typ
						WHEN c_jnl_key1 THEN
							rec.jnl_key1 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key1_l);
						WHEN c_jnl_key2 THEN
							rec.jnl_key2 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key2_l);
						WHEN c_jnl_key3 THEN
							rec.jnl_key3 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key3_l);
						WHEN c_jnl_key4 THEN
							rec.jnl_key4 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key4_l);
						WHEN c_jnl_key5 THEN
							rec.jnl_key5 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key5_l);
						WHEN c_jnl_key6 THEN
							rec.jnl_key6 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key6_l);
						WHEN c_jnl_key7 THEN
							rec.jnl_key7 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key7_l);
						WHEN c_jnl_key8 THEN
							rec.jnl_key8 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key8_l);
						WHEN c_jnl_key9 THEN
							rec.jnl_key9 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key9_l);
						WHEN c_jnl_key10 THEN
							rec.jnl_key10 := SUBSTR(l_jnl_key_set_val, 1, c_jnl_key10_l);
					END CASE;

				END LOOP;

				recs[i] := rec;

				IF i > c_max_cnt THEN
					CALL mgpa_ac_if$p_ac_cost_merge(recs);
					i := 0;
				END IF;

			END;--NEXT_LOOP

		END LOOP;

		CALL mgpa_ac_if$p_ac_cost_merge(recs);

	END;-- SKIP_DPT_ALC

	SELECT COUNT(*)
	INTO STRICT sum_i
	FROM mbt_ac_cost t
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ac_ym = i_ym
	;

	l_jnl_key_map_rec := '{}';
	l_bp_grp_rec := '{}';
	l_dpt_map_rec := '{}';
	l_invalid_rsn_rec := '{}';

	CALL fcpa_batch_log$p_proc_log('MGBDD0015', sum_i::VARCHAR);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ac_if$p_send(
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	会計ＩＦの送信処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_ym
		年月
<HISTORY>
**************************************************************************/
DECLARE
	l_calc_no mgt_arg.calc_no%TYPE;
	l_cnt INTEGER;
	l_msg VARCHAR[];
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0030', i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()), NULL);

	/* 確定情報のロック */
	CALL mgpa_calc_fix$p_lock(i_calc_grp_cd, i_ym);

	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mgt_calc_fix t
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ym = i_ym
	AND t.ac_if_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN;
	END IF;

	SELECT MAX(t.calc_no)
	INTO STRICT l_calc_no
	FROM mgt_calc_fix t
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ym = i_ym
	AND t.ac_if_flg = '0'
	;

	IF l_calc_no IS NULL THEN
		RETURN;
	END IF;

	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mam_cost_slip_jnl m
	WHERE 0=0
	AND m.calc_grp_cd = i_calc_grp_cd
	;

	IF l_cnt = 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd);
		CALL fcpa_err$raise_app_err('MGBDD0014', l_msg);
	END IF;

	CALL mgpa_ac_if$p_send_main(i_calc_grp_cd, l_calc_no, i_ym);

	UPDATE mgt_calc_fix t
	SET ac_if_flg = '1'
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ym = i_ym
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_AC_IF.P_SEND');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_ac_if$p_cancel(
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	会計ＩＦの送信取消処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_ym
		年月
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt INTEGER;
	l_msg VARCHAR[];
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0030', i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()), NULL);

	/* 確定情報のロック */
	CALL mgpa_calc_fix$p_lock(i_calc_grp_cd, i_ym);

	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mgt_calc_fix t
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ym = i_ym
	AND t.ac_if_flg = '1'
	;

	IF l_cnt = 0 THEN
		RETURN;
	END IF;

	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mbt_ac_cost t
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ac_ym = i_ym
	AND t.jnl_fin_cnt > 0
	;

	IF l_cnt > 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
		CALL fcpa_err$raise_app_err('MGBDD0013', l_msg);
	END IF;

	DELETE FROM mbt_ac_cost t
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ac_ym = i_ym
	;

	UPDATE mgt_calc_fix t
	SET ac_if_flg = '0'
	WHERE 0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.ym = i_ym
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_AC_IF.P_CANCEL');
END;
$BODY$
LANGUAGE plpgsql
;