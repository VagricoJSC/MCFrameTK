\encoding UTF-8

CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_raise_err()
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	取込エラー処理
<REMARKS>

<ARGUMENTS>

<HISTORY>
**************************************************************************/
DECLARE
	l_bind VARCHAR[] ;
BEGIN
	l_bind := fcpa_err$msg_binder('MBPA_IMP_AC.P_MAIN') ;
	CALL fcpa_err$raise_app_err('MBBBD0004', l_bind) ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_set_ac_dpt (
	 IN i_dpt_cd VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 INOUT o_ac_dpt_cd VARCHAR,
	 INOUT o_dpt_cache mam_dpt[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	会計部門変換処理
<REMARKS>

<ARGUMENTS>
<IN>	i_dpt_cd
		部門ＣＤ
<IN>	i_dt
		対象日
<INOUT>	o_ac_dpt_cd
		会計部門ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	l_rec mam_dpt%ROWTYPE;
BEGIN
	IF i_dpt_cd IS NULL THEN
		o_ac_dpt_cd := i_dpt_cd;
		RETURN;
	END IF;

	FOR i IN 1..COALESCE(array_length(o_dpt_cache, 1), 0) LOOP
		IF o_dpt_cache[i].dpt_cd = i_dpt_cd THEN
			o_ac_dpt_cd := o_dpt_cache[i].ac_dpt_cd;
			RETURN;
		END IF;
	END LOOP;

	SELECT	MIN(m.ac_dpt_cd)
	INTO	STRICT o_ac_dpt_cd
	FROM	mam_dpt m
	WHERE	0=0
	AND	m.dpt_cd = i_dpt_cd
	AND	m.st_dt <= i_dt
	AND	m.end_dt >= i_dt
	AND	m.del_flg = c_off
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_ac_dpt w
		WHERE	0=0
		AND	w.ac_dpt_cd = m.ac_dpt_cd
		AND	w.st_dt <= i_dt
		AND	w.end_dt >= i_dt
		AND	w.del_flg = c_off
		)
	;

	IF o_ac_dpt_cd IS NULL THEN
		/* 対象の部門を会計部門に変換できませんでした。部門ＣＤ：{1} */
		CALL fcpa_batch_log$p_data_log('MBBBD0027', l_log_no, l_log_sub_key1, l_log_sub_key2, i_dpt_cd);
	END IF;

	l_rec.dpt_cd := i_dpt_cd;
	l_rec.ac_dpt_cd := o_ac_dpt_cd;
	o_dpt_cache[COALESCE(array_length(o_dpt_cache, 1), 0) + 1] := l_rec;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_set_ac_tax (
	 IN i_ac_slip_typ VARCHAR,
	 IN i_tax_cd VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_tmap CHARACTER,
	 INOUT o_ac_tax_cd VARCHAR,
	 INOUT o_tax_cache mam_ac_tax_map[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	会計税変換処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ac_slip_typ
		会計伝票区分
<IN>	i_tax_cd
		税ＣＤ
<IN>	i_dt
		対象日
<IN>	i_tmap
		有効な会計税対応マスタが存在
<INOUT>	o_ac_tax_cd
		会計税ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';

	l_cnt NUMERIC;
	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	l_rec mam_ac_tax_map%ROWTYPE;
BEGIN
	IF i_tax_cd IS NULL THEN
		o_ac_tax_cd := i_tax_cd;
		RETURN;
	END IF;

	FOR i IN 1..COALESCE(array_length(o_tax_cache, 1), 0) LOOP
		IF o_tax_cache[i].tax_cd = i_tax_cd THEN
			o_ac_tax_cd := o_tax_cache[i].ac_tax_cd;
			RETURN;
		END IF;
	END LOOP;

	o_ac_tax_cd := NULL;
	IF i_tmap = c_on THEN
		SELECT	MIN(m.ac_tax_cd)
		INTO	STRICT o_ac_tax_cd
		FROM	mam_ac_tax_map m
		WHERE	0=0
		AND	m.ac_slip_typ = i_ac_slip_typ
		AND	m.tax_cd = i_tax_cd
		AND	m.st_dt <= i_dt
		AND	m.end_dt >= i_dt
		AND	m.del_flg = c_off
		AND	EXISTS (
			SELECT	'X'
			FROM	mam_ac_tax w
			WHERE	0=0
			AND	w.ac_tax_cd = m.ac_tax_cd
			AND	w.st_dt <= i_dt
			AND	w.end_dt >= i_dt
			AND	w.del_flg = c_off
			)
		;

		IF o_ac_tax_cd IS NULL THEN
			/* 会計税対応マスタに有効なレコードが登録されていません。会計伝票区分：{1} 税ＣＤ：{2} */
			CALL fcpa_batch_log$p_data_log('MBBBD0028', l_log_no, l_log_sub_key1, l_log_sub_key2, i_ac_slip_typ, i_tax_cd);
		END IF;
	ELSE
 		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mam_ac_tax m
		WHERE	0=0
		AND	m.ac_tax_cd = i_tax_cd
		AND	m.st_dt <= i_dt
		AND	m.end_dt >= i_dt
		AND	m.del_flg = c_off
		;

		IF l_cnt > 0 THEN
			o_ac_tax_cd := i_tax_cd;
		ELSE
			/* 会計税マスタに有効なレコードが登録されていません。税ＣＤ：{1} */
			CALL fcpa_batch_log$p_data_log('MBBBD0029', l_log_no, l_log_sub_key1, l_log_sub_key2, i_tax_cd);
		END IF;
	END IF;

	l_rec.tax_cd := i_tax_cd;
	l_rec.ac_tax_cd := o_ac_tax_cd;
	o_tax_cache[COALESCE(array_length(o_tax_cache, 1), 0) + 1] := l_rec;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_get_jnl_key_map (
	 IN i_ac_slip_typ VARCHAR,
	 IN i_jnl_key_col_typ VARCHAR,
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
<INOUT>	o_jnl_key_map
		IN条件に対応する仕訳キー対応マスタのレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';
BEGIN
	o_jnl_key_map := NULL;

	IF i_ac_slip_typ IS NULL OR i_jnl_key_col_typ IS NULL THEN
		RETURN;
	END IF;

	BEGIN
		SELECT * INTO STRICT o_jnl_key_map
		FROM mam_jnl_key_map
		WHERE ac_slip_typ = i_ac_slip_typ
		AND jnl_key_col_typ = i_jnl_key_col_typ
		AND cost_flg = c_off;
	EXCEPTION
		WHEN OTHERS THEN
		RETURN;
	END ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_get_bp_grp (
	 IN i_jnl_bp_rec VARCHAR[],
	 IN i_jnl_key_map mam_jnl_key_map,
	 IN i_bp_grp_typ VARCHAR,
	 INOUT o_bp_grp_cd VARCHAR
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
		配列の内容
		(1:acst, 2:cst, 3:psppl, 4:bsppl, 5:asppl, 6:sppl, 7:inv_com, 8:rcst, 9:setoff)
<IN>	i_jnl_key_map
		仕訳キー対応マスタのレコード
<IN>	i_bp_grp_typ
		取引先分類仕訳キー設定項目区分
<INOUT>	o_bp_grp_cd
		取引先分類ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';
	c_max_bp_cnt CONSTANT INTEGER := 10000 ;

	c_acst_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ACST_CD');
	c_cst_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','CST_CD');
	c_asppl_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ASPPL_CD');
	c_sppl_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SPPL_CD');
	c_inv_com_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','INV_COM_CD');
	c_rcst_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','RCST_CD');
	c_setoff_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SETOFF_CD');
	c_psppl_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','PSPPL_CD');
	c_bsppl_cd CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BSPPL_CD');

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

	l_cnt NUMERIC;
	l_bp_grp_rec mam_bp%ROWTYPE;
	l_bp_cd mam_bp.bp_cd%TYPE;
BEGIN
	o_bp_grp_cd := NULL;

	IF i_jnl_key_map.bp_jnl_key_set_col_typ IS NULL OR i_bp_grp_typ IS NULL THEN
		RETURN;
	END IF;

	CASE i_jnl_key_map.bp_jnl_key_set_col_typ
		WHEN c_acst_cd THEN
			l_bp_cd := i_jnl_bp_rec[1];
		WHEN c_cst_cd THEN
			l_bp_cd := i_jnl_bp_rec[2];
		WHEN c_psppl_cd THEN
			l_bp_cd := i_jnl_bp_rec[3];
		WHEN c_bsppl_cd THEN
			l_bp_cd := i_jnl_bp_rec[4];
		WHEN c_asppl_cd THEN
			l_bp_cd := i_jnl_bp_rec[5];
		WHEN c_sppl_cd THEN
			l_bp_cd := i_jnl_bp_rec[6];
		WHEN c_inv_com_cd THEN
			l_bp_cd := i_jnl_bp_rec[7];
		WHEN c_rcst_cd THEN
			l_bp_cd := i_jnl_bp_rec[8];
		WHEN c_setoff_cd THEN
			l_bp_cd := i_jnl_bp_rec[9];
		ELSE
			RETURN;
	END CASE;

	IF l_bp_cd IS NULL THEN
		RETURN;
	ELSIF (SELECT COUNT(*) FROM mbpa_imp_ac$p_main$l_bp_cache WHERE _index_ = l_bp_cd) > 0 THEN
		SELECT * INTO STRICT l_bp_grp_rec FROM mbpa_imp_ac$p_main$l_bp_cache WHERE _index_ = l_bp_cd;
	ELSE
		INSERT INTO mbpa_imp_ac$p_main$l_bp_cache
		SELECT m.*, m.bp_cd FROM mam_bp m
		WHERE 0=0
		AND m.del_flg = c_off
		AND m.bp_cd = l_bp_cd;

		IF (SELECT COUNT(*) FROM mbpa_imp_ac$p_main$l_bp_cache WHERE _index_ = l_bp_cd) > 0 THEN
			SELECT * INTO STRICT l_bp_grp_rec FROM mbpa_imp_ac$p_main$l_bp_cache WHERE _index_ = l_bp_cd;
		END IF ;

		IF (SELECT COUNT(*) FROM mbpa_imp_ac$p_main$l_bp_cache) > c_max_bp_cnt THEN
			TRUNCATE TABLE mbpa_imp_ac$p_main$l_bp_cache;
		END IF;
	END IF;

	/* 取引先分類ＣＤを取得 */
	CASE i_bp_grp_typ
		WHEN c_bp_grp_cd1 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd1;
		WHEN c_bp_grp_cd2 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd2;
		WHEN c_bp_grp_cd3 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd3;
		WHEN c_bp_grp_cd4 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd4;
		WHEN c_bp_grp_cd5 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd5;
		WHEN c_bp_grp_cd6 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd6;
		WHEN c_bp_grp_cd7 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd7;
		WHEN c_bp_grp_cd8 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd8;
		WHEN c_bp_grp_cd9 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd9;
		WHEN c_bp_grp_cd10 THEN
			o_bp_grp_cd := l_bp_grp_rec.bp_grp_cd10;
		ELSE
			o_bp_grp_cd := NULL;
	END CASE;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$ins_io(
	INOUT o_recs mbt_ac_io[],
	INOUT o_recs_id mst_io_act[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	受払情報取込処理のサブプログラム
<REMARKS>

<ARGUMENTS>
<IN>	o_recs
		登録対象データ
<IN>	o_recs_id
		更新対象データ（主キー）
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
BEGIN
	IF COALESCE(array_length(o_recs, 1), 0) > 0 THEN
		INSERT INTO mbt_ac_io SELECT * FROM UNNEST(o_recs) ;

		UPDATE mst_io_act t
 		SET a_imp_flg = c_on
		FROM UNNEST(o_recs_id) w
		WHERE 0=0
		AND t.slip_no = w.slip_no
		AND t.slip_seq_no = w.slip_seq_no
		AND t.a_imp_flg = c_off;
	END IF;

	o_recs := '{}';
	o_recs_id := '{}';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_io(
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_rerun CHARACTER,
	IN i_reget CHARACTER,
	IN i_tmap CHARACTER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	受払情報取込処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym
		取込対象月
<IN>	i_dt_fr
		対象期間(FROM)
<IN>	i_dt_to
		対象期間(TO)
<IN>	i_rerun
		再取込ＦＬＧ
<IN>	i_reget
		マスタ再取得ＦＬＧ
<IN>	i_tmap
		有効な会計税対応マスタが存在
<HISTORY>
**************************************************************************/
DECLARE
	c_max_cnt CONSTANT INTEGER := 50 ; /* バルクインサートでの最大レコード数 */
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_proc_nm CONSTANT VARCHAR := 'MBPA_IMP_AC.P_IO';
	c_ac_io_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_SYS_TYP','AC_IO');
	c_it_dat_no_l CONSTANT INTEGER := 15;

	/* 仕入 */
	c_purc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC');
	/* 経費購買 */
	c_purc_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XPNS');
	/* 未着品入荷 */
	c_arr_in_transit CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ARR_IN_TRANSIT');
	/* 仕入返品 */
	c_purc_ret CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_RET');
	/* 経費返品 */
	c_purc_ret_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_RET_XPNS');
	/* 仕入値引 */
	c_purc_dscnt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_DSCNT');
	/* 経費値引 */
	c_purc_dscnt_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_DSCNT_XPNS');
	/* 仕入値増 */
	c_purc_xtra CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XTRA');
	/* 経費値増 */
	c_purc_xtra_xpns CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_XTRA_XPNS');
	/* 売上 */
	c_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS');
	/* 売上返品 */
	c_sls_ret CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS_RET');
	/* 売上値引 */
	c_sls_dscnt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS_DSCNT');
	/* 売上値増 */
	c_sls_xtra CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SLS_XTRA');
	/* 製造 */
	c_mfg CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','MFG');
	/* 副産物製造 */
	c_byprod CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','BYPROD');
	/* 投入 */
	c_input CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INPUT');
	/* 投入(有償) */
	c_in_onr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_ONR');
	/* 投入(自給) */
	c_in_ss CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_SS');
	/* 無償支給 */
	c_ffr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PROV');
	/* 有償支給 */
	c_onr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PROV');
	/* 無償支給戻 */
	c_ffr_prvr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','FFR_PRVR');
	/* 有償支給戻 */
	c_onr_prvr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','ONR_PRVR');
	/* 検査抜取 */
	c_insp_smpl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','INSP_SMPL');
	/* 廃棄 */
	c_disp_scrp CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DISP_SCRP');
	/* 棚卸出庫 */
	c_so_stktk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SO_STKTK');
	/* 棚卸入庫 */
	c_in_stktk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','IN_STKTK');
	/* 販売倉入 */
	c_prod_itm_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_SO');
	/* 生産戻入 */
	c_prod_itm_ret_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_RET_SO');
	/* 部門間移動 */
	c_dpt_xfr_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','DPT_XFR_SO');
	/* 他勘定出庫 */
	c_oth_ccn_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_SO');
	/* 他勘定入庫 */
	c_oth_ccn_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','OTH_CCN_GR');
	/* 出荷 */
	c_ship CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP');
	/* 出荷返品 */
	c_ship_ret CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP_RET');
	/* 在庫振替出庫 */
	c_stk_sw_so CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_SO');
	/* 在庫振替入庫 */
	c_stk_sw_gr CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','STK_SW_GR');
	/* 無効 */
	c_dis CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','DIS');
	/* 取消 */
	c_can CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLIP_STS_TYP','CAN');

	/* 仕入実績受払ＮＯ */
	c_purc_act_io_no CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_FIX_NO_TYP','PURC_ACT_IO_NO');
	/* 未着品仕入 */
	c_purc_in_transit CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PURC_IN_TRANSIT');

	c_wg_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','WG_CD');
	c_purc_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','PURC_DPT_CD');
	c_ap_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AP_DPT_CD');
	c_sls_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SLS_DPT_CD');
	c_ar_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AR_DPT_CD');
	c_gi_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','GI_DPT_CD');
	c_gr_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','GR_DPT_CD');
	c_bd_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BD_DPT_CD');
	c_sub_dpt_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD1');
	c_sub_dpt_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD2');
	c_sub_dpt_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD3');
	c_loc_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','LOC_CD');
	c_str_ln_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','STR_LN_CD');
	c_acst_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ACST_CD');
	c_cst_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','CST_CD');
	c_asppl_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ASPPL_CD');
	c_sppl_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SPPL_CD');
	c_ac_itm_grp_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AC_ITM_GRP_CD');
	c_gd_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','GD_CD');
	c_itm_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_CD');
	c_itm_sub1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB1');
	c_itm_sub2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB2');
	c_itm_sub3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB3');
	c_sno1		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO1');
	c_sno2		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO2');
	c_sno3		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO3');
	c_sno4		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO4');
	c_itm_grp_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD1');
	c_itm_grp_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD2');
	c_itm_grp_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD3');
	c_itm_grp_cd4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD4');
	c_itm_grp_cd5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD5');
	c_itm_grp_cd6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD6');
	c_itm_grp_cd7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD7');
	c_itm_grp_cd8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD8');
	c_itm_grp_cd9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD9');
	c_itm_grp_cd10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD10');
	c_trd_ac_itm_grp_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_AC_ITM_GRP_CD');
	c_trd_itm_jnl_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_JNL_CD');
	c_trd_itm_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_CD');
	c_trd_itm_sub1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_SUB1');
	c_trd_itm_sub2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_SUB2');
	c_trd_itm_sub3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_SUB3');
	c_trd_sno1		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_SNO1');
	c_trd_sno2		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_SNO2');
	c_trd_sno3		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_SNO3');
	c_trd_sno4		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_SNO4');
	c_trd_itm_grp_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD1');
	c_trd_itm_grp_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD2');
	c_trd_itm_grp_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD3');
	c_trd_itm_grp_cd4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD4');
	c_trd_itm_grp_cd5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD5');
	c_trd_itm_grp_cd6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD6');
	c_trd_itm_grp_cd7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD7');
	c_trd_itm_grp_cd8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD8');
	c_trd_itm_grp_cd9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD9');
	c_trd_itm_grp_cd10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_ITM_GRP_CD10');
	c_area_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AREA_CD');
	c_cntry_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','CNTRY_CD');
	c_tax_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TAX_CD');
	c_trd_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TRD_CD');
	c_bp_grp_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD1');
	c_bp_grp_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD2');
	c_bp_grp_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD3');
	c_bp_grp_cd4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD4');
	c_bp_grp_cd5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD5');
	c_bp_grp_cd6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD6');
	c_bp_grp_cd7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD7');
	c_bp_grp_cd8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD8');
	c_bp_grp_cd9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD9');
	c_bp_grp_cd10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD10');
	c_sub_char1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR1');
	c_sub_char2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR2');
	c_sub_char3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR3');
	c_sub_char4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR4');
	c_sub_char5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR5');
	c_sub_char6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR6');
	c_sub_char7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR7');
	c_sub_char8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR8');
	c_sub_char9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR9');
	c_sub_char10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR10');

	c_asst_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS');
	c_asst_mfg	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');
	c_asst_oth	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH');

	l_purc_in_transit_flg CHAR(1);
	l_purc_flg CHAR(1);
	l_cnt NUMERIC;
	l_rec_cnt NUMERIC;
	l_chk_err CHAR(1);
	l_max_ts mst_io_act.ins_ts%TYPE;
	l_tmp_dt mst_io_act.ac_dt%TYPE;
	l_tmp_slip VARCHAR;
	l_wg_cd mam_wg.wg_cd%TYPE;
	l_qty mbt_ac_io.base_unit_qty%TYPE;
	l_trd_qty mbt_ac_io.trd_unit_qty%TYPE;
	l_tax_cd mam_tax.tax_cd%TYPE;
	l_usr_cd mam_usr.usr_cd%TYPE;
	l_purc_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_ap_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sls_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_ar_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_gi_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_gr_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_bd_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_bill_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt1 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt2 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt3 mam_ac_dpt.ac_dpt_cd%TYPE;

	c_jnl_key1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY1');
	c_jnl_key2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY2');
	c_jnl_key3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY3');
	c_jnl_key4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY4');
	c_jnl_key5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY5');
	c_jnl_key6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY6');
	c_jnl_key7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY7');
	c_jnl_key8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY8');
	c_jnl_key9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY9');
	c_jnl_key10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY10');
	l_jnl_key_map		mam_jnl_key_map%ROWTYPE ;
	l_jnl_key_col_typ	VARCHAR;
	l_jnl_key_set_val	VARCHAR(200);
	l_not_null_flg		CHAR(1);

	l_rec mbt_ac_io%ROWTYPE;
	l_recs mbt_ac_io[];
	l_rec_id mst_io_act%ROWTYPE;
	l_recs_id mst_io_act[];
	l_bp_rec VARCHAR[];
	l_inv_rsn mam_ac_rsn%ROWTYPE;
	l_ac_rsn_rec VARCHAR[];
	l_dpt_cache mam_dpt[];
	l_tax_cache mam_ac_tax_map[];

	y RECORD;
	x RECORD;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0001', c_proc_nm);

	/* ロック後に追加されたレコードは取込対象外にする */
	l_max_ts := NULL;

	BEGIN
		FOR y IN
			SELECT /*+ IndexScan(mst_io_act_mst_io_act_all_org) */
				t.ins_ts
			FROM mst_io_act t
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.ac_dt >= i_dt_fr
			AND t.ac_dt < i_dt_to + '1 days'::INTERVAL
			AND (t.a_imp_flg = c_off OR i_rerun = c_on)
			AND EXISTS (
				SELECT 'X'
				FROM mam_slip_jnl w
				WHERE 0=0
				AND CASE w.ac_slip_typ
						WHEN c_purc_in_transit THEN c_purc
						ELSE w.ac_slip_typ
					END = t.ac_slip_typ
				AND w.del_flg = c_off
				)
			ORDER BY t.ins_ts DESC, t.slip_no, t.slip_seq_no
			FOR UPDATE NOWAIT
		LOOP
			l_max_ts := y.ins_ts;
			EXIT;
		END LOOP;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MBBBD0003');
	END ;

	/* 会計伝票区分仕訳マスタに「未着品仕入」が登録されているか */
	l_purc_in_transit_flg := c_off;

 	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mam_slip_jnl t
	WHERE 0=0
	AND t.ac_slip_typ = c_purc_in_transit
	AND t.del_flg = c_off;

	IF l_cnt > 0 THEN
		l_purc_in_transit_flg := c_on;
	END IF;

	/* 会計伝票区分仕訳マスタに「仕入」が登録されているか */
	l_purc_flg := c_off;

	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mam_slip_jnl t
	WHERE 0=0
	AND t.ac_slip_typ = c_purc
	AND t.del_flg = c_off;

	IF l_cnt > 0 THEN
		l_purc_flg := c_on;
	END IF;

	IF i_rerun = c_on THEN
		/* 再取込チェック */
		SELECT MAX(t.jnl_fin_cnt)
		INTO STRICT l_cnt
		FROM mbt_ac_io t
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.ac_dt BETWEEN i_dt_fr AND i_dt_to;

		IF l_cnt > 0 THEN
			/* 対象の受払データで仕訳済みのレコードがあるため再取込できません。 */
			CALL fcpa_err$raise_app_err('MBBBD0031');
		ELSE
			DELETE FROM mbt_ac_io t
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.ac_dt BETWEEN i_dt_fr AND i_dt_to;
		END IF;

		UPDATE /*+ IndexScan(mst_io_act_mst_io_act_all_org) */
			mst_io_act t
		SET a_imp_flg = c_off
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.ac_dt >= i_dt_fr
		AND t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND t.a_imp_flg = c_on
		AND t.ins_ts <= l_max_ts;
	END IF;

	UPDATE /*+ IndexScan(mst_io_act_mst_io_act_all_org_2) */
		mst_io_act t
	SET a_imp_flg = c_on
	WHERE 0=0
	AND t.ac_ym = i_ym
	AND t.ac_dt >= i_dt_fr
	AND t.ac_dt < i_dt_to + '1 days'::INTERVAL
	AND t.a_imp_flg = c_off
	AND t.ins_ts <= l_max_ts
	AND EXISTS (
		SELECT 'X'
		FROM mam_slip_jnl w
		WHERE 0=0
		AND CASE w.ac_slip_typ
				WHEN c_purc_in_transit THEN
					CASE t.fix_no_typ
						WHEN c_purc_act_io_no THEN c_purc
						ELSE w.ac_slip_typ
					END
				ELSE w.ac_slip_typ
			END = t.ac_slip_typ
		AND w.red_input_flg = c_off
		AND w.del_flg = c_off
		)
	AND EXISTS (
		SELECT 'X'
		FROM mst_io_act w
		WHERE 0=0
		AND w.slip_no = t.slip_no
		AND w.slip_rev_no = t.slip_rev_no
		AND w.ac_ym = i_ym
		AND w.ac_dt >= i_dt_fr
		AND w.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND w.send_flg = c_on
		AND w.a_imp_flg = c_off
		AND w.ins_ts <= l_max_ts
		AND w.slip_sts_typ = c_dis)
	AND EXISTS (
		SELECT 'X'
		FROM mst_io_act w
		WHERE 0=0
		AND w.slip_no = t.slip_no
		AND w.slip_rev_no = t.slip_rev_no
		AND w.ac_ym = i_ym
		AND w.ac_dt >= i_dt_fr
		AND w.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND w.send_flg = c_on
		AND w.a_imp_flg = c_off
		AND w.ins_ts <= l_max_ts
		AND w.slip_sts_typ = c_can);

	l_rec_cnt := 0;
	l_chk_err := c_off;
	l_tmp_dt := NULL;
	l_tmp_slip := NULL;
	l_dpt_cache := '{}';
	l_tax_cache := '{}';

	/* 会計理由マスタの取得 */
	SELECT array_agg(m.ac_rsn_cd) INTO l_ac_rsn_rec
	FROM mam_ac_rsn m
	WHERE 0=0
	AND m.ac_invalid_flg = c_on
	AND m.del_flg = c_off;

	FOR x IN (
		SELECT /*+ IndexScan(mst_io_act_mst_io_act_all_org) */
			t.gi_wg_cd,
			t.gr_wg_cd,
			t.bd_wg_cd,
			t.outsrc_mfg_loc_wg_cd,
			t.ac_ym,
			t.slip_no,
			t.slip_seq_no,
			DATE_TRUNC('DAY', t.ac_dt) ac_dt,
			t.slip_rev_no,
			t.slip_sts_typ,
			CASE t.slip_sts_typ
				WHEN c_can THEN c_on
				ELSE c_off
			END can_flg,
			t.un_fix_flg,
			t.temp_ap_flg,
			t.trd_cd,
			t.io_typ,
			t.purc_typ,
			t.ac_slip_typ,
			t.ac_rsn_cd,
			t.purc_dpt_cd,	/* 購買部門 */
			t.ap_dpt_cd,	/* 債務部門 */
			t.sls_dpt_cd,	/* 売上部門 */
			t.ar_dpt_cd,	/* 債権部門 */
			t.gi_dpt_cd,	/* 出庫部門 */
			t.gr_dpt_cd,	/* 入庫部門 */
			t.bd_dpt_cd,	/* 負担部門 */
			t.sub_dpt_cd1,	/* 予備部門1 */
			t.sub_dpt_cd2,	/* 予備部門2 */
			t.sub_dpt_cd3,	/* 予備部門3 */
			t.loc_cd,
			t.str_ln_cd,
			t.act_usr_cd,
			t.sls_usr_cd,
			t.mfg_usr_cd,
			t.purc_usr_cd,
			COALESCE(m2.ac_itm_grp_cd, t.ac_itm_grp_cd) ac_itm_grp_cd,
			COALESCE(m2.itm_jnl_cd, t.itm_jnl_cd) itm_jnl_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			COALESCE(m2.itm_nm, t.itm_nm) itm_nm,
			t.lot_no,
			t.sublot_no,
			t.sno1,
			t.sno2,
			t.sno3,
			t.sno4,
			t.fix_no_typ,
			t.gd_cd,
			t.quality_typ,
			t.asst_typ,
			t.base_unit_qty,
			t.base_unit_cd,
			t.trd_unit_qty,
			t.trd_unit_cd,
			t.base_cur_cd,
			COALESCE(t.base_cur_amt, 0) base_cur_amt,
			COALESCE(t.base_cur_tax_amt, 0) base_cur_tax_amt,
			t.trd_cur_cd,
			COALESCE(t.trd_cur_amt, 0) trd_cur_amt,
			COALESCE(t.trd_cur_tax_amt, 0) trd_cur_tax_amt,
			t.ptax_cur_cd,
			COALESCE(t.ptax_cur_amt, 0)		ptax_cur_amt,
			COALESCE(t.ptax_cur_tax_amt, 0)	ptax_cur_tax_amt,
			t.tax_cd,
			t.foreign_flg,
			t.xrate_cd,
			t.xrate,
			t.ptax_xrate_cd,
			t.ptax_xrate,
			t.slo_no,
			t.po_no,
			t.iv_no,
			t.rcpt_iv_no,
			t2.wrk_no,
			t.dlv_cd,	/* 納品先 */
			t.acst_cd,	/* 売掛先 */
			t.cst_cd,	/* 得意先 */
			t.asppl_cd,	/* 買掛先 */
			t.sppl_cd,	/* 発注先 */
			t.spot_flg,
			t.sttl_schd_dt,
			t.sttl_cd,
			t.cst_itm_cd,
			t.cst_itm_nm,
			t.sppl_itm_cd,
			t.sppl_itm_nm,
			t.area_cd,
			t.cntry_cd,
			COALESCE(m3.ac_itm_grp_cd, t.par_ac_itm_grp_cd) trd_ac_itm_grp_cd,
			COALESCE(m3.itm_jnl_cd, t.par_itm_jnl_cd) trd_itm_jnl_cd,
			t.itm_mfg_inst_no,
			t.par_itm_cd trd_itm_cd,
			t.par_itm_sub1 trd_itm_sub1,
			t.par_itm_sub2 trd_itm_sub2,
			t.par_itm_sub3 trd_itm_sub3,
			COALESCE(m3.itm_nm, t.par_itm_nm) trd_itm_nm,
			t.par_lot_no trd_lot_no,
			t.par_sublot_no trd_sublot_no,
			t.par_sno1 trd_sno1,
			t.par_sno2 trd_sno2,
			t.par_sno3 trd_sno3,
			t.par_sno4 trd_sno4,
			t.act_no,
			t.trd_rmrks,
			t.trd_d_rmrks,
			t.sub_char1,
			t.sub_char2,
			t.sub_char3,
			t.sub_char4,
			t.sub_char5,
			t.sub_char6,
			t.sub_char7,
			t.sub_char8,
			t.sub_char9,
			t.sub_char10,
			t.sub_num1,
			t.sub_num2,
			t.sub_num3,
			t.sub_dt1,
			t.sub_dt2,
			t.sub_dt3,
			t.ins_func_id,
			t.upd_func_id,
			t.repurc_obli_flg,
			t.trd_cur_proc_amt,
			t.trd_cur_onr_prov_amt,
			t.base_cur_proc_amt,
			t.base_cur_onr_prov_amt,
			t.ptax_cur_proc_amt,
			t.ptax_cur_onr_prov_amt,
			m4.dscnt_itm_flg,
			m4.itm_grp_cd1,
			m4.itm_grp_cd2,
			m4.itm_grp_cd3,
			m4.itm_grp_cd4,
			m4.itm_grp_cd5,
			m4.itm_grp_cd6,
			m4.itm_grp_cd7,
			m4.itm_grp_cd8,
			m4.itm_grp_cd9,
			m4.itm_grp_cd10,
			m5.itm_grp_cd1 trd_itm_grp_cd1,
			m5.itm_grp_cd2 trd_itm_grp_cd2,
			m5.itm_grp_cd3 trd_itm_grp_cd3,
			m5.itm_grp_cd4 trd_itm_grp_cd4,
			m5.itm_grp_cd5 trd_itm_grp_cd5,
			m5.itm_grp_cd6 trd_itm_grp_cd6,
			m5.itm_grp_cd7 trd_itm_grp_cd7,
			m5.itm_grp_cd8 trd_itm_grp_cd8,
			m5.itm_grp_cd9 trd_itm_grp_cd9,
			m5.itm_grp_cd10 trd_itm_grp_cd10,
			m6.wg_cd purc_wg_cd
		FROM mst_io_act t
		JOIN mam_slip_jnl m1 ON (
			CASE m1.ac_slip_typ
				WHEN c_purc_in_transit THEN
					CASE l_purc_flg WHEN c_off THEN c_purc ELSE m1.ac_slip_typ END
				ELSE m1.ac_slip_typ
			END = t.ac_slip_typ
			AND m1.del_flg = c_off)
 		LEFT OUTER JOIN msvt_wrk_sno t2 ON (t2.sno1 = t.sno1)
		LEFT OUTER JOIN LATERAL (
			SELECT w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				CASE w.sundry_itm_flg
					WHEN c_off THEN w.itm_nm
					ELSE NULL
				END itm_nm,
				w.ac_itm_grp_cd,
				w.itm_jnl_cd
			FROM mam_itm_srch w
			WHERE 0=0
			AND i_reget = c_on
		) m2 ON (t.itm_cd = m2.itm_cd
			AND t.itm_sub1 = m2.itm_sub1
			AND t.itm_sub2 = m2.itm_sub2
			AND t.itm_sub3 = m2.itm_sub3)
		LEFT OUTER JOIN LATERAL (
			SELECT w.itm_cd, w.itm_sub1, w.itm_sub2, w.itm_sub3,
				CASE w.sundry_itm_flg
					WHEN c_off THEN w.itm_nm
					ELSE NULL
				END itm_nm,
				w.ac_itm_grp_cd,
				w.itm_jnl_cd
			FROM mam_itm_srch w
			WHERE 0=0
			AND i_reget = c_on
		) m3 ON (t.par_itm_cd = m3.itm_cd
			AND t.par_itm_sub1 = m3.itm_sub1
			AND t.par_itm_sub2 = m3.itm_sub2
			AND t.par_itm_sub3 = m3.itm_sub3)
		LEFT OUTER JOIN mam_itm_srch m4 ON (t.itm_cd = m4.itm_cd
			AND t.itm_sub1 = m4.itm_sub1
			AND t.itm_sub2 = m4.itm_sub2
			AND t.itm_sub3 = m4.itm_sub3)
		LEFT OUTER JOIN mam_itm_srch m5 ON (t.par_itm_cd = m5.itm_cd
			AND t.par_itm_sub1 = m5.itm_sub1
			AND t.par_itm_sub2 = m5.itm_sub2
			AND t.par_itm_sub3 = m5.itm_sub3)
		LEFT OUTER JOIN mam_dpt m6 ON (t.purc_dpt_cd = m6.dpt_cd
			AND t.ac_dt >= m6.st_dt
			AND t.ac_dt <= m6.end_dt
			AND m6.del_flg = c_off)
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.ac_dt >= i_dt_fr
		AND t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND t.send_flg = c_on
		AND t.a_imp_flg = c_off
		AND t.ins_ts <= l_max_ts
		ORDER BY t.ac_dt, t.ac_slip_typ, t.slip_no, t.slip_seq_no
		)
	LOOP
		<<NEXT_LOOP>>
		BEGIN

			/* 会計伝票区分仕訳マスタに「仕入」が未登録かつ「未着品仕入」が登録されているとき
			   通常の「仕入」は取り込まない */
			IF x.ac_slip_typ = c_purc AND l_purc_in_transit_flg = c_on AND l_purc_flg = c_off AND x.fix_no_typ <> c_purc_act_io_no THEN
				EXIT NEXT_LOOP ;
			END IF ;
			/* 値引・値増関連は数量０とする */
			IF x.ac_slip_typ IN (
				c_purc_dscnt, c_purc_xtra,
				c_purc_dscnt_xpns, c_purc_xtra_xpns,
				c_sls_dscnt, c_sls_xtra
				)
			THEN
				l_qty := 0 ;
				l_trd_qty := 0 ;
			ELSE
				l_qty := x.base_unit_qty ;
				l_trd_qty := x.trd_unit_qty ;
			END IF ;
			/* 値引品目は「経費購買」「経費返品」「売上」「売上返品」の場合、数量を０とする */
			IF x.dscnt_itm_flg = c_on AND x.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_sls, c_sls_ret) THEN
				l_qty := 0 ;
				l_trd_qty := 0 ;
			END IF ;

			IF l_qty = 0 AND l_trd_qty = 0
				AND x.base_cur_amt = 0 AND x.base_cur_tax_amt = 0
				AND x.trd_cur_amt = 0 AND x.trd_cur_tax_amt = 0
				AND x.ptax_cur_amt = 0 AND x.ptax_cur_tax_amt = 0
			THEN
				UPDATE mst_io_act t
				SET a_imp_flg = c_on
				WHERE 0=0
				AND t.slip_no = x.slip_no
				AND t.slip_seq_no = x.slip_seq_no
				AND t.a_imp_flg = c_off;

				EXIT NEXT_LOOP ;
			END IF ;

			/* 有償支給・有償支給戻・投入(有償)・投入(自給)以外で自社資産以外は対象外 */
			IF x.ac_slip_typ IN (
				c_onr_prov, c_onr_prvr,
				c_in_onr, c_in_ss
				)
			THEN
				IF x.ac_slip_typ = c_onr_prov AND x.asst_typ = c_asst_oth THEN
					x.asst_typ := c_asst_mfg ;
				END IF ;
			ELSIF x.asst_typ NOT IN (c_asst_sls, c_asst_mfg) THEN
				UPDATE mst_io_act t
				SET a_imp_flg = c_on
				WHERE 0=0
				AND t.slip_no = x.slip_no
				AND t.slip_seq_no = x.slip_seq_no
				AND t.a_imp_flg = c_off;

				EXIT NEXT_LOOP ;
			END IF ;

			IF x.ac_rsn_cd IS NOT NULL THEN
				FOR i IN 1..COALESCE(array_length(l_ac_rsn_rec, 1), 0) LOOP
					IF l_ac_rsn_rec[i] = x.ac_rsn_cd THEN
						EXIT NEXT_LOOP ;
					END IF;
				END LOOP;
			END IF ;

			IF l_tmp_dt IS NULL OR l_tmp_dt <> x.ac_dt THEN
				l_dpt_cache := '{}';
				l_tax_cache := '{}';
				l_tmp_dt := x.ac_dt ;
			END IF ;

			/* 購買部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.purc_dpt_cd, x.ac_dt, l_purc_dpt, l_dpt_cache) ;
			IF x.purc_dpt_cd IS NOT NULL AND l_purc_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 債務部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.ap_dpt_cd, x.ac_dt, l_ap_dpt, l_dpt_cache) ;
			IF x.ap_dpt_cd IS NOT NULL AND l_ap_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 売上部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.sls_dpt_cd, x.ac_dt, l_sls_dpt, l_dpt_cache) ;
			IF x.sls_dpt_cd IS NOT NULL AND l_sls_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 債権部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.ar_dpt_cd, x.ac_dt, l_ar_dpt, l_dpt_cache) ;
			IF x.ar_dpt_cd IS NOT NULL AND l_ar_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 出庫部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.gi_dpt_cd, x.ac_dt, l_gi_dpt, l_dpt_cache) ;
			IF x.gi_dpt_cd IS NOT NULL AND l_gi_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 入庫部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.gr_dpt_cd, x.ac_dt, l_gr_dpt, l_dpt_cache) ;
			IF x.gr_dpt_cd IS NOT NULL AND l_gr_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 負担部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.bd_dpt_cd, x.ac_dt, l_bd_dpt, l_dpt_cache) ;
			IF x.bd_dpt_cd IS NOT NULL AND l_bd_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 予備部門1 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd1, x.ac_dt, l_sub_dpt1, l_dpt_cache) ;
			IF x.sub_dpt_cd1 IS NOT NULL AND l_sub_dpt1 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 予備部門2 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd2, x.ac_dt, l_sub_dpt2, l_dpt_cache) ;
			IF x.sub_dpt_cd2 IS NOT NULL AND l_sub_dpt2 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			/* 予備部門3 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd3, x.ac_dt, l_sub_dpt3, l_dpt_cache) ;
			IF x.sub_dpt_cd3 IS NOT NULL AND l_sub_dpt3 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			IF l_bd_dpt IS NULL THEN
				IF x.ac_slip_typ in (c_purc, c_arr_in_transit, c_sls_ret) THEN
					/* 仕入・未着品入荷・売上返品のときは入庫部門を負担部門に設定する */
					l_bd_dpt := l_gr_dpt ;
				ELSIF x.ac_slip_typ IN (c_purc_ret, c_sls) THEN
					/* 仕入返品・売上のときは出庫部門を負担部門に設定する */
					l_bd_dpt := l_gi_dpt ;
				END IF ;
			END IF ;

			/* 部門間移動のとき、入庫と出庫部門が同一のレコードはとりこまない */
			IF x.ac_slip_typ = c_dpt_xfr_so AND l_gi_dpt = l_gr_dpt THEN
				EXIT NEXT_LOOP ;
			END IF ;

			IF l_tmp_slip IS NULL OR l_tmp_slip <> x.ac_slip_typ THEN
				l_tax_cache := '{}';
				l_tmp_slip := x.ac_slip_typ ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_tax(x.ac_slip_typ, x.tax_cd, x.ac_dt, i_tmap, l_tax_cd, l_tax_cache) ;
			IF x.tax_cd IS NOT NULL AND l_tax_cd IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			l_wg_cd := NULL ;
			IF x.ac_slip_typ in (c_purc, c_arr_in_transit, c_purc_ret, c_purc_dscnt, c_purc_xtra) AND x.itm_mfg_inst_no IS NOT NULL
			THEN /* 外注 */
				l_wg_cd := x.outsrc_mfg_loc_wg_cd ;
			ELSIF x.ac_slip_typ IN (c_purc, c_arr_in_transit)
			THEN /* 仕入 */
				l_wg_cd := x.gr_wg_cd ;
			ELSIF x.ac_slip_typ IN (c_purc_ret)
			THEN /* 仕入返品 */
				l_wg_cd := x.gi_wg_cd ;
			ELSIF x.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_purc_dscnt, c_purc_dscnt_xpns, c_purc_xtra, c_purc_xtra_xpns)
			THEN /* 経費返品・値引、経費購買・値増 */
				l_wg_cd := x.bd_wg_cd ;
				IF l_wg_cd IS NULL THEN
					IF x.ac_slip_typ = c_purc_xpns THEN
						l_wg_cd := x.gr_wg_cd ;
					ELSIF x.ac_slip_typ = c_purc_ret_xpns THEN
						l_wg_cd := x.gi_wg_cd ;
					ELSE
						l_wg_cd := x.purc_wg_cd ;
					END IF ;
				END IF ;
			ELSIF x.ac_slip_typ IN (c_sls_dscnt, c_sls_xtra)
			THEN /* 売上値引・値増 */
				l_wg_cd := x.bd_wg_cd ;
			ELSIF x.ac_slip_typ IN (c_mfg, c_byprod)
			THEN /* 製造, 副産物製造 */
				l_wg_cd := x.gr_wg_cd ;
			ELSIF x.ac_slip_typ IN (c_input, c_in_onr, c_in_ss, c_insp_smpl, c_disp_scrp, c_so_stktk, c_oth_ccn_so)
			THEN /* 投入 */
				l_wg_cd := x.gi_wg_cd ;
			ELSIF x.ac_slip_typ IN (c_in_stktk, c_oth_ccn_gr)
			THEN /* 入庫 */
				l_wg_cd := x.gr_wg_cd ;
			ELSIF x.ac_slip_typ IN (c_ffr_prov, c_onr_prov, c_ship_ret)
			THEN /* 支給、出荷返品 */
				l_wg_cd := COALESCE(x.gr_wg_cd, x.gi_wg_cd) ;
				IF l_gi_dpt IS NULL THEN
					l_gi_dpt := l_gr_dpt ;
					l_bd_dpt := l_gr_dpt ;
				END IF ;
			ELSIF x.ac_slip_typ IN (c_ffr_prvr, c_onr_prvr, c_ship)
			THEN /* 支給戻、出荷 */
				l_wg_cd := COALESCE(x.gi_wg_cd, x.gr_wg_cd) ;
				IF l_gr_dpt IS NULL THEN
					l_gr_dpt := l_gi_dpt ;
					l_bd_dpt := l_gi_dpt ;
				END IF ;
			ELSIF x.ac_slip_typ IN (c_stk_sw_gr)
			THEN /* 振替入庫関連 */
				l_wg_cd := COALESCE(x.gr_wg_cd, x.gi_wg_cd) ;
			ELSIF x.ac_slip_typ IN (c_prod_itm_so, c_prod_itm_ret_so, c_dpt_xfr_so, c_stk_sw_so)
			THEN /* 振替出庫関連 */
				l_wg_cd := COALESCE(x.gi_wg_cd, x.gr_wg_cd) ;
			ELSIF x.ac_slip_typ IN (c_sls)
			THEN /* 売上 */
				l_wg_cd := COALESCE(x.gi_wg_cd, x.bd_wg_cd) ;
			ELSIF x.ac_slip_typ IN (c_sls_ret)
			THEN /* 売上返品 */
				l_wg_cd := COALESCE(x.gr_wg_cd, x.bd_wg_cd) ;
			ELSE
				l_wg_cd := COALESCE(x.gi_wg_cd, x.gr_wg_cd) ;
			END IF ;

			l_usr_cd := NULL ;
			IF SUBSTR(x.ac_slip_typ, 1, 3) = '101' THEN
				l_usr_cd := x.purc_usr_cd ;
			ELSIF SUBSTR(x.ac_slip_typ, 1, 3) = '102' THEN
				l_usr_cd := x.sls_usr_cd ;
			ELSIF SUBSTR(x.ac_slip_typ, 1, 3) = '103' OR SUBSTR(x.ac_slip_typ, 1, 3) = '104' THEN
				l_usr_cd := x.mfg_usr_cd ;
			ELSE
				l_usr_cd := x.act_usr_cd ;
			END IF ;

			l_rec := NULL;

			l_rec.data_no		:= LPAD(mapa_num$f_get_seq(c_ac_io_seq)::VARCHAR, c_it_dat_no_l, '0') ;
			l_rec.wg_cd		:= l_wg_cd ;
			l_rec.ac_ym		:= x.ac_ym ;
			l_rec.slip_no		:= x.slip_no ;
			l_rec.slip_seq_no	:= x.slip_seq_no ;
			l_rec.slip_rev_no	:= x.slip_rev_no ;
			l_rec.ac_dt		:= x.ac_dt ;
			l_rec.can_flg		:= x.can_flg ;
			l_rec.un_fix_flg	:= x.un_fix_flg ;
			l_rec.temp_ap_flg	:= x.temp_ap_flg ;
			l_rec.purc_typ		:= x.purc_typ ;
			l_rec.ac_slip_typ	:= x.ac_slip_typ ;
			l_rec.ac_rsn_cd	:= x.ac_rsn_cd ;
			l_rec.purc_dpt_cd	:= l_purc_dpt ;
			l_rec.ap_dpt_cd	:= l_ap_dpt ;
			l_rec.sls_dpt_cd	:= l_sls_dpt ;
			l_rec.ar_dpt_cd	:= l_ar_dpt ;
			l_rec.gi_dpt_cd	:= l_gi_dpt ;
			l_rec.gr_dpt_cd	:= l_gr_dpt ;
			l_rec.bd_dpt_cd	:= l_bd_dpt ;
			l_rec.sub_dpt_cd1	:= l_sub_dpt1 ;
			l_rec.sub_dpt_cd2	:= l_sub_dpt2 ;
			l_rec.sub_dpt_cd3	:= l_sub_dpt3 ;
			l_rec.loc_cd		:= x.loc_cd ;
			l_rec.str_ln_cd	:= x.str_ln_cd ;
			l_rec.usr_cd		:= l_usr_cd ;
			l_rec.ac_itm_grp_cd	:= x.ac_itm_grp_cd ;
			l_rec.itm_jnl_cd	:= x.itm_jnl_cd ;
			l_rec.itm_cd		:= x.itm_cd ;
			l_rec.itm_sub1		:= x.itm_sub1 ;
			l_rec.itm_sub2		:= x.itm_sub2 ;
			l_rec.itm_sub3		:= x.itm_sub3 ;
			l_rec.itm_nm		:= x.itm_nm ;
			l_rec.lot_no		:= x.lot_no ;
			l_rec.sublot_no	:= x.sublot_no ;
			l_rec.sno1		:= x.sno1 ;
			l_rec.sno2		:= x.sno2 ;
			l_rec.sno3		:= x.sno3 ;
			l_rec.sno4		:= x.sno4 ;
			l_rec.gd_cd		:= x.gd_cd ;
			l_rec.quality_typ	:= x.quality_typ ;
			l_rec.asst_typ		:= x.asst_typ ;
			l_rec.base_unit_qty	:= l_qty ;
			l_rec.base_unit_cd	:= x.base_unit_cd ;
			l_rec.trd_unit_qty	:= l_trd_qty ;
			l_rec.trd_unit_cd	:= x.trd_unit_cd ;
			l_rec.base_cur_cd	:= x.base_cur_cd ;
			l_rec.base_cur_amt	:= x.base_cur_amt ;
			l_rec.base_cur_tax_amt	:= x.base_cur_tax_amt ;
			l_rec.trd_cur_cd	:= x.trd_cur_cd ;
			l_rec.trd_cur_amt	:= x.trd_cur_amt ;
			l_rec.trd_cur_tax_amt	:= x.trd_cur_tax_amt ;
			l_rec.ptax_cur_cd	:= x.ptax_cur_cd ;
			l_rec.ptax_cur_amt	:= x.ptax_cur_amt ;
			l_rec.ptax_cur_tax_amt	:= x.ptax_cur_tax_amt ;
			/* 値引品目は「経費購買」「経費返品」「売上」「売上返品」の場合、金額の符号反転 */
			IF x.dscnt_itm_flg = c_on AND x.ac_slip_typ IN (c_purc_xpns, c_purc_ret_xpns, c_sls, c_sls_ret) THEN
				l_rec.base_cur_amt		:= - l_rec.base_cur_amt ;
				l_rec.base_cur_tax_amt	:= - l_rec.base_cur_tax_amt ;
				l_rec.trd_cur_amt		:= - l_rec.trd_cur_amt ;
				l_rec.trd_cur_tax_amt	:= - l_rec.trd_cur_tax_amt ;
				l_rec.ptax_cur_amt		:= - l_rec.ptax_cur_amt ;
				l_rec.ptax_cur_tax_amt	:= - l_rec.ptax_cur_tax_amt ;
			END IF ;
			/* 会計伝票区分仕訳マスタに「未着品仕入」が登録されているとき
			  「仕入」かつ確定ＮＯ区分が「仕入実績受払ＮＯ」の場合、会計伝票区分を「未着品仕入」に付け替え */
			IF l_purc_in_transit_flg = c_on AND x.ac_slip_typ = c_purc AND x.fix_no_typ = c_purc_act_io_no THEN
				l_rec.ac_slip_typ	:= c_purc_in_transit ;
			END IF ;
			l_rec.tax_cd		:= l_tax_cd ;
			l_rec.foreign_flg	:= x.foreign_flg ;
			l_rec.xrate_cd		:= x.xrate_cd ;
			l_rec.xrate		:= x.xrate ;
			l_rec.ptax_xrate_cd	:= x.ptax_xrate_cd ;
			l_rec.ptax_xrate	:= x.ptax_xrate ;
			l_rec.slo_no		:= x.slo_no ;
			l_rec.po_no		:= x.po_no ;

			IF x.ac_slip_typ IN (
					c_purc, c_purc_xpns,
					c_purc_ret, c_purc_ret_xpns,
					c_purc_dscnt, c_purc_dscnt_xpns,
					c_purc_xtra, c_purc_xtra_xpns,
					c_arr_in_transit
			) THEN
				l_rec.iv_no	:= x.rcpt_iv_no ;
			ELSE
				l_rec.iv_no	:= x.iv_no ;
			END IF ;

			l_rec.wrk_no		:= x.wrk_no ;
			l_rec.acst_cd		:= x.acst_cd ;
			l_rec.cst_cd		:= x.cst_cd ;
			l_rec.asppl_cd		:= x.asppl_cd ;
			l_rec.sppl_cd		:= x.sppl_cd ;
			l_rec.spot_flg		:= x.spot_flg ;
			l_rec.sttl_schd_dt	:= x.sttl_schd_dt ;
			l_rec.sttl_cd		:= x.sttl_cd ;
			l_rec.cst_itm_cd	:= x.cst_itm_cd ;
			l_rec.cst_itm_nm	:= x.cst_itm_nm ;
			l_rec.sppl_itm_cd	:= x.sppl_itm_cd ;
			l_rec.sppl_itm_nm	:= x.sppl_itm_nm ;
			l_rec.area_cd		:= x.area_cd ;
			l_rec.cntry_cd		:= x.cntry_cd ;

			IF x.ac_slip_typ IN (c_stk_sw_so, c_stk_sw_gr) THEN
				l_rec.trd_grp	:= x.act_no ;
			ELSE
				l_rec.trd_grp	:= NULL ;
			END IF ;

			l_rec.trd_ac_itm_grp_cd := x.trd_ac_itm_grp_cd ;
			l_rec.trd_itm_jnl_cd	:= x.trd_itm_jnl_cd ;
			l_rec.trd_itm_cd	:= x.trd_itm_cd ;
			l_rec.trd_itm_sub1	:= x.trd_itm_sub1 ;
			l_rec.trd_itm_sub2	:= x.trd_itm_sub2 ;
			l_rec.trd_itm_sub3	:= x.trd_itm_sub3 ;
			l_rec.trd_itm_nm	:= x.trd_itm_nm ;
			l_rec.trd_lot_no	:= x.trd_lot_no ;
			l_rec.trd_sublot_no	:= x.trd_sublot_no ;
			l_rec.trd_sno1		:= x.trd_sno1 ;
			l_rec.trd_sno2		:= x.trd_sno2 ;
			l_rec.trd_sno3		:= x.trd_sno3 ;
			l_rec.trd_sno4		:= x.trd_sno4 ;

			l_rec.trd_rmrks	:= x.trd_rmrks ;
			l_rec.trd_d_rmrks	:= x.trd_d_rmrks ;
			l_rec.sub_char1	:= x.sub_char1 ;
			l_rec.sub_char2	:= x.sub_char2 ;
			l_rec.sub_char3	:= x.sub_char3 ;
			l_rec.sub_char4	:= x.sub_char4 ;
			l_rec.sub_char5	:= x.sub_char5 ;
			l_rec.sub_char6	:= x.sub_char6 ;
			l_rec.sub_char7	:= x.sub_char7 ;
			l_rec.sub_char8	:= x.sub_char8 ;
			l_rec.sub_char9	:= x.sub_char9 ;
			l_rec.sub_char10	:= x.sub_char10 ;
			l_rec.sub_num1		:= x.sub_num1 ;
			l_rec.sub_num2		:= x.sub_num2 ;
			l_rec.sub_num3		:= x.sub_num3 ;
			l_rec.sub_dt1		:= x.sub_dt1 ;
			l_rec.sub_dt2		:= x.sub_dt2 ;
			l_rec.sub_dt3		:= x.sub_dt3 ;
			l_rec.inpt_ins_func_id	:= x.ins_func_id ;
			l_rec.inpt_upd_func_id	:= x.upd_func_id ;
			l_rec.jnl_fin_cnt	:= 0 ;
			l_rec.repurc_obli_flg		:= x.repurc_obli_flg ;
			l_rec.trd_cur_proc_amt		:= x.trd_cur_proc_amt ;
			l_rec.trd_cur_onr_prov_amt	:= x.trd_cur_onr_prov_amt ;
			l_rec.base_cur_proc_amt		:= x.base_cur_proc_amt ;
			l_rec.base_cur_onr_prov_amt	:= x.base_cur_onr_prov_amt ;
			l_rec.ptax_cur_proc_amt		:= x.ptax_cur_proc_amt ;
			l_rec.ptax_cur_onr_prov_amt	:= x.ptax_cur_onr_prov_amt ;

			FOR j IN 1..10 LOOP
				CASE j
					WHEN 1 THEN
						l_jnl_key_col_typ := c_jnl_key1 ;
					WHEN 2 THEN
						l_jnl_key_col_typ := c_jnl_key2 ;
					WHEN 3 THEN
						l_jnl_key_col_typ := c_jnl_key3 ;
					WHEN 4 THEN
						l_jnl_key_col_typ := c_jnl_key4 ;
					WHEN 5 THEN
						l_jnl_key_col_typ := c_jnl_key5 ;
					WHEN 6 THEN
						l_jnl_key_col_typ := c_jnl_key6 ;
					WHEN 7 THEN
						l_jnl_key_col_typ := c_jnl_key7 ;
					WHEN 8 THEN
						l_jnl_key_col_typ := c_jnl_key8 ;
					WHEN 9 THEN
						l_jnl_key_col_typ := c_jnl_key9 ;
					WHEN 10 THEN
						l_jnl_key_col_typ := c_jnl_key10 ;
				END CASE ;

				/* 仕訳キー対応マスタのレコードを取得 */
				CALL mbpa_imp_ac$p_get_jnl_key_map(l_rec.ac_slip_typ, l_jnl_key_col_typ, l_jnl_key_map) ;

				IF l_jnl_key_map.jnl_key_set_col_typ IS NULL THEN
					CONTINUE ;
				END IF ;

				/* 取引先を専用レコードへ格納 */
				/* (1:acst, 2:cst, 3:psppl, 4:bsppl, 5:asppl, 6:sppl, 7:inv_com, 8:rcst, 9:setoff) */
				l_bp_rec := '{}';
				l_bp_rec[1] := l_rec.acst_cd;
				l_bp_rec[2] := l_rec.cst_cd;
				l_bp_rec[5] := l_rec.asppl_cd;
				l_bp_rec[6] := l_rec.sppl_cd;

				/* 仕訳キー設定項目に対応するカラムの値を取得 */
				CASE l_jnl_key_map.jnl_key_set_col_typ
					WHEN c_wg_cd THEN
						l_jnl_key_set_val := l_rec.wg_cd ;
						l_not_null_flg := c_on ;
					WHEN c_purc_dpt_cd THEN
						l_jnl_key_set_val := l_rec.purc_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_ap_dpt_cd THEN
						l_jnl_key_set_val := l_rec.ap_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_sls_dpt_cd THEN
						l_jnl_key_set_val := l_rec.sls_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_ar_dpt_cd THEN
						l_jnl_key_set_val := l_rec.ar_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_gi_dpt_cd THEN
						l_jnl_key_set_val := l_rec.gi_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_gr_dpt_cd THEN
						l_jnl_key_set_val := l_rec.gr_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_bd_dpt_cd THEN
						l_jnl_key_set_val := l_rec.bd_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd1 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd1 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd2 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd2 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd3 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd3 ;
						l_not_null_flg := c_off ;
					WHEN c_loc_cd THEN
						l_jnl_key_set_val := l_rec.loc_cd ;
						l_not_null_flg := c_off ;
					WHEN c_str_ln_cd THEN
						l_jnl_key_set_val := l_rec.str_ln_cd ;
						l_not_null_flg := c_off ;
					WHEN c_acst_cd THEN
						l_jnl_key_set_val := l_rec.acst_cd ;
						l_not_null_flg := c_off ;
					WHEN c_cst_cd THEN
						l_jnl_key_set_val := l_rec.cst_cd ;
						l_not_null_flg := c_off ;
					WHEN c_asppl_cd THEN
						l_jnl_key_set_val := l_rec.asppl_cd ;
						l_not_null_flg := c_off ;
					WHEN c_sppl_cd THEN
						l_jnl_key_set_val := l_rec.sppl_cd ;
						l_not_null_flg := c_off ;
					WHEN c_ac_itm_grp_cd THEN
						l_jnl_key_set_val := l_rec.ac_itm_grp_cd ;
						l_not_null_flg := c_off ;
					WHEN c_gd_cd THEN
						l_jnl_key_set_val := l_rec.gd_cd ;
						l_not_null_flg := c_off ;
					WHEN c_itm_cd THEN
						l_jnl_key_set_val := l_rec.itm_cd ;
						l_not_null_flg := c_on ;
					WHEN c_itm_sub1 THEN
						l_jnl_key_set_val := l_rec.itm_sub1 ;
						l_not_null_flg := c_on ;
					WHEN c_itm_sub2 THEN
						l_jnl_key_set_val := l_rec.itm_sub2 ;
						l_not_null_flg := c_on ;
					WHEN c_itm_sub3 THEN
						l_jnl_key_set_val := l_rec.itm_sub3 ;
						l_not_null_flg := c_on ;
					WHEN c_sno1 THEN
						l_jnl_key_set_val := l_rec.sno1 ;
						l_not_null_flg := c_on ;
					WHEN c_sno2 THEN
						l_jnl_key_set_val := l_rec.sno2 ;
						l_not_null_flg := c_on ;
					WHEN c_sno3 THEN
						l_jnl_key_set_val := l_rec.sno3 ;
						l_not_null_flg := c_on ;
					WHEN c_sno4 THEN
						l_jnl_key_set_val := l_rec.sno4 ;
						l_not_null_flg := c_on ;
					WHEN c_itm_grp_cd1 THEN
						l_jnl_key_set_val := x.itm_grp_cd1 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd2 THEN
						l_jnl_key_set_val := x.itm_grp_cd2 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd3 THEN
						l_jnl_key_set_val := x.itm_grp_cd3 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd4 THEN
						l_jnl_key_set_val := x.itm_grp_cd4 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd5 THEN
						l_jnl_key_set_val := x.itm_grp_cd5 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd6 THEN
						l_jnl_key_set_val := x.itm_grp_cd6 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd7 THEN
						l_jnl_key_set_val := x.itm_grp_cd7 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd8 THEN
						l_jnl_key_set_val := x.itm_grp_cd8 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd9 THEN
						l_jnl_key_set_val := x.itm_grp_cd9 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd10 THEN
						l_jnl_key_set_val := x.itm_grp_cd10 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_ac_itm_grp_cd THEN
						l_jnl_key_set_val := l_rec.trd_ac_itm_grp_cd ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_jnl_cd THEN
						l_jnl_key_set_val := l_rec.trd_itm_jnl_cd ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_cd THEN
						l_jnl_key_set_val := l_rec.trd_itm_cd ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_sub1 THEN
						l_jnl_key_set_val := l_rec.trd_itm_sub1 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_sub2 THEN
						l_jnl_key_set_val := l_rec.trd_itm_sub2 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_sub3 THEN
						l_jnl_key_set_val := l_rec.trd_itm_sub3 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_sno1 THEN
						l_jnl_key_set_val := l_rec.trd_sno1 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_sno2 THEN
						l_jnl_key_set_val := l_rec.trd_sno2 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_sno3 THEN
						l_jnl_key_set_val := l_rec.trd_sno3 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_sno4 THEN
						l_jnl_key_set_val := l_rec.trd_sno4 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd1 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd1 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd2 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd2 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd3 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd3 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd4 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd4 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd5 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd5 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd6 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd6 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd7 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd7 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd8 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd8 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd9 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd9 ;
						l_not_null_flg := c_off ;
					WHEN c_trd_itm_grp_cd10 THEN
						l_jnl_key_set_val := x.trd_itm_grp_cd10 ;
						l_not_null_flg := c_off ;
					WHEN c_area_cd THEN
						l_jnl_key_set_val := l_rec.area_cd ;
						l_not_null_flg := c_off ;
					WHEN c_cntry_cd THEN
						l_jnl_key_set_val := l_rec.cntry_cd ;
						l_not_null_flg := c_off ;
					WHEN c_tax_cd THEN
						l_jnl_key_set_val := l_rec.tax_cd ;
						l_not_null_flg := c_off ;
					WHEN c_trd_cd THEN
						l_jnl_key_set_val := x.trd_cd ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd1 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd1, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd2 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd2, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd3 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd3, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd4 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd4, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd5 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd5, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd6 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd6, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd7 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd7, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd8 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd8, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd9 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd9, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd10 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd10, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char1 THEN
						l_jnl_key_set_val := l_rec.sub_char1 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char2 THEN
						l_jnl_key_set_val := l_rec.sub_char2 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char3 THEN
						l_jnl_key_set_val := l_rec.sub_char3 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char4 THEN
						l_jnl_key_set_val := l_rec.sub_char4 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char5 THEN
						l_jnl_key_set_val := l_rec.sub_char5 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char6 THEN
						l_jnl_key_set_val := l_rec.sub_char6 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char7 THEN
						l_jnl_key_set_val := l_rec.sub_char7 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char8 THEN
						l_jnl_key_set_val := l_rec.sub_char8 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char9 THEN
						l_jnl_key_set_val := l_rec.sub_char9 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char10 THEN
						l_jnl_key_set_val := l_rec.sub_char10 ;
						l_not_null_flg := c_off ;
					ELSE
						l_jnl_key_set_val := NULL ;
						l_not_null_flg := c_off ;
				END CASE ;

				/* NULL可項目がNULLの場合、NULL不可項目がNULL文字の場合 */
				IF (l_jnl_key_set_val IS NULL AND l_not_null_flg = c_off)
					OR (l_jnl_key_set_val = c_null_val AND l_not_null_flg = c_on) THEN
					l_jnl_key_set_val := l_jnl_key_map.default_cd ;
				END IF ;

				CASE l_jnl_key_col_typ
					WHEN c_jnl_key1 THEN
						l_rec.jnl_key1 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key2 THEN
						l_rec.jnl_key2 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key3 THEN
						l_rec.jnl_key3 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key4 THEN
						l_rec.jnl_key4 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key5 THEN
						l_rec.jnl_key5 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key6 THEN
						l_rec.jnl_key6 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key7 THEN
						l_rec.jnl_key7 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key8 THEN
						l_rec.jnl_key8 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key9 THEN
						l_rec.jnl_key9 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key10 THEN
						l_rec.jnl_key10 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
				END CASE ;
			END LOOP ;

			l_recs[COALESCE(array_length(l_recs, 1), 0)+1] := l_rec;

			l_rec_id.slip_no := x.slip_no;
			l_rec_id.slip_seq_no := x.slip_seq_no;
			l_recs_id[COALESCE(array_length(l_recs_id, 1), 0)+1] := l_rec_id;

			l_rec_cnt := l_rec_cnt + 1;

			IF COALESCE(array_length(l_recs, 1), 0) > c_max_cnt THEN
				CALL mbpa_imp_ac$ins_io(l_recs, l_recs_id) ;
			END IF ;

		END;

	END LOOP;

	CALL mbpa_imp_ac$ins_io(l_recs, l_recs_id);

	/* 処理が終了しました。{1} データ取込件数 : {2} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0026', c_proc_nm, l_rec_cnt::VARCHAR);

	COMMIT ;
	
	IF l_chk_err = c_on THEN
		CALL mbpa_imp_ac$p_raise_err();
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$ins_stk(
	INOUT o_recs mbt_ac_stk[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	在庫情報取込処理のサブプログラム
<REMARKS>

<ARGUMENTS>
<IN>	o_recs
		登録対象データ
<HISTORY>
**************************************************************************/
BEGIN
	IF COALESCE(array_length(o_recs, 1), 0) > 0 THEN
		INSERT INTO mbt_ac_stk SELECT * FROM UNNEST(o_recs) ;
	END IF;

	o_recs := '{}';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_stk(
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_end_dt TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	在庫情報取込処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym
		取込対象月
<IN>	i_end_dt_fr
		月度末日
<HISTORY>
**************************************************************************/
DECLARE
	c_max_cnt CONSTANT INTEGER := 50 ; /* バルクインサートでの最大レコード数 */
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_proc_nm CONSTANT VARCHAR := 'MBPA_IMP_AC.P_STK';
	c_ac_stk_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_SYS_TYP','AC_STK');
	c_it_dat_no_l CONSTANT INTEGER := 15;

	/* 月末在庫 */
	c_end_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MSC_IO_ACT_TYP','END_STK');
	/* 月末在庫（生産） */
	c_eom_stk_mfg CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','EOM_STK_PROD');
	/* 月末在庫（販売） */
	c_eom_stk_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','EOM_STK_SLS');

	c_wg_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','WG_CD');
	c_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','DPT_CD');
	c_sub_dpt_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD1');
	c_sub_dpt_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD2');
	c_sub_dpt_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD3');
	c_loc_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','LOC_CD');
	c_str_ln_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','STR_LN_CD');
	c_inv_com_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','INV_COM_CD');
	c_ac_itm_grp_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AC_ITM_GRP_CD');
	c_gd_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','GD_CD');
	c_itm_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_CD');
	c_itm_sub1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB1');
	c_itm_sub2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB2');
	c_itm_sub3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_SUB3');
	c_sno1		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO1');
	c_sno2		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO2');
	c_sno3		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO3');
	c_sno4		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SNO4');
	c_itm_grp_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD1');
	c_itm_grp_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD2');
	c_itm_grp_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD3');
	c_itm_grp_cd4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD4');
	c_itm_grp_cd5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD5');
	c_itm_grp_cd6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD6');
	c_itm_grp_cd7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD7');
	c_itm_grp_cd8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD8');
	c_itm_grp_cd9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD9');
	c_itm_grp_cd10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ITM_GRP_CD10');
	c_area_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AREA_CD');
	c_cntry_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','CNTRY_CD');
	c_bp_grp_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD1');
	c_bp_grp_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD2');
	c_bp_grp_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD3');
	c_bp_grp_cd4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD4');
	c_bp_grp_cd5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD5');
	c_bp_grp_cd6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD6');
	c_bp_grp_cd7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD7');
	c_bp_grp_cd8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD8');
	c_bp_grp_cd9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD9');
	c_bp_grp_cd10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD10');
	c_sub_char1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR1');
	c_sub_char2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR2');
	c_sub_char3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR3');
	c_sub_char4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR4');
	c_sub_char5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR5');
	c_sub_char6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR6');
	c_sub_char7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR7');
	c_sub_char8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR8');
	c_sub_char9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR9');
	c_sub_char10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR10');

	c_asst_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS');
	c_asst_mfg	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');
	c_asst_mng_mng	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');/* 資産管理する */
	c_asst_mng_not	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','NOT_MNG');/* 資産管理しない */

	l_cnt NUMERIC;
	l_rec_cnt NUMERIC;
	l_dpt mam_ac_dpt.ac_dpt_cd%TYPE;

	c_jnl_key1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY1');
	c_jnl_key2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY2');
	c_jnl_key3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY3');
	c_jnl_key4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY4');
	c_jnl_key5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY5');
	c_jnl_key6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY6');
	c_jnl_key7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY7');
	c_jnl_key8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY8');
	c_jnl_key9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY9');
	c_jnl_key10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY10');
	l_jnl_key_map		mam_jnl_key_map%ROWTYPE ;
	l_jnl_key_col_typ	VARCHAR;
	l_jnl_key_set_val	VARCHAR(200);
	l_not_null_flg		CHAR(1);

	l_rec mbt_ac_stk%ROWTYPE;
	l_recs mbt_ac_stk[];
	l_bp_rec VARCHAR[];
	l_dpt_cache mam_dpt[];

	/* 締情報テーブルロック用のカーソル */
	cur_close CURSOR FOR
 		SELECT t.ym, t.stk_cl_flg
		FROM mst_close t
		WHERE 0=0
		AND t.ym = i_ym
		FOR UPDATE;

	x RECORD;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0001', c_proc_nm);

	/* 締情報のロック */
	BEGIN
		FOR x IN cur_close LOOP EXIT;
		END LOOP ;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MBBBD0003');
	END ;

	/* 在庫締が行われていなければ取り込まない */
	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mst_close t
	WHERE 0=0
	AND t.ym = i_ym
	AND t.stk_cl_flg = c_on;

	IF l_cnt = 0 THEN
		/* 在庫締処理が行われていないため在庫情報を取り込めません。 */
		CALL fcpa_err$raise_app_err('MBBBD0030');
	END IF;

	/* 取り込むときは常に再取込となる */
	/* 再取込チェック */
	SELECT MAX(t.jnl_fin_cnt)
	INTO STRICT l_cnt
	FROM mbt_ac_stk t
	WHERE 0=0
	AND t.ac_ym = i_ym;

	IF l_cnt > 0 THEN
		/* 対象の在庫データで仕訳済みのレコードがあるため取込できません。 */
		CALL fcpa_err$raise_app_err('MBBBD0032');
	END IF;

	DELETE FROM mbt_ac_stk t
	WHERE 0=0
	AND t.ac_ym = i_ym;

	l_rec_cnt := 0;
	l_dpt_cache := '{}';

	BEGIN
		FOR x IN
			SELECT
				m3.wg_cd,
				t.ac_ym,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				COALESCE(m5.itm_nm, m2.itm_nm) AS itm_nm,
				t.lot_no,
				t.sublot_no,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.gd_cd,
				t.quality_typ,
				t.asst_typ,
				t.loc_cd,
				t.str_ln_cd,
				mapa_loc$f_get_asst_dpt_cd_ne(t.loc_cd, i_end_dt, c_on) dpt_cd,
				m3.sppl_cd inv_com_cd,
				t.base_unit_qty,
				m2.unit_cd base_unit_cd,
				CASE
					WHEN t.asst_typ = c_asst_sls THEN c_eom_stk_sls
					WHEN t.asst_typ = c_asst_mfg THEN c_eom_stk_mfg
					ELSE NULL
				END AS ac_slip_typ,
				m2.ac_itm_grp_cd,
				m2.itm_jnl_cd,
				m4.area_cd,
				m4.cntry_cd,
				m2.itm_grp_cd1,
				m2.itm_grp_cd2,
				m2.itm_grp_cd3,
				m2.itm_grp_cd4,
				m2.itm_grp_cd5,
				m2.itm_grp_cd6,
				m2.itm_grp_cd7,
				m2.itm_grp_cd8,
				m2.itm_grp_cd9,
				m2.itm_grp_cd10
			FROM mam_slip_jnl m1
			JOIN mst_mly_stk_dtl t
				ON (CASE
						WHEN t.asst_typ = c_asst_sls THEN c_eom_stk_sls
						WHEN t.asst_typ = c_asst_mfg THEN c_eom_stk_mfg
						ELSE NULL
					END = m1.ac_slip_typ)
			LEFT OUTER JOIN mam_itm_srch m2
				ON (t.itm_cd = m2.itm_cd AND t.itm_sub1 = m2.itm_sub1 AND t.itm_sub2 = m2.itm_sub2 AND t.itm_sub3 = m2.itm_sub3)
			JOIN mam_loc m3
				ON (t.loc_cd = m3.loc_cd)
			LEFT OUTER JOIN mam_bp m4
				ON (m3.sppl_cd = m4.bp_cd)
			LEFT OUTER JOIN mam_sundry_itm m5
				ON (t.itm_cd = m5.itm_cd
				AND t.itm_sub1 = m5.itm_sub1
				AND t.itm_sub2 = m5.itm_sub2
				AND t.itm_sub3 = m5.itm_sub3
				AND t.sno1 = m5.sno1
				AND t.sno2 = m5.sno2
				AND t.sno3 = m5.sno3
				AND t.sno4 = m5.sno4)
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.io_act_typ = c_end_stk
			AND t.asst_typ IN (c_asst_sls, c_asst_mfg)
			/* 他社資産は対象外 */
			AND COALESCE(m2.asset_mng_typ, c_asst_mng_not) = c_asst_mng_mng
			AND t.base_unit_qty <> 0
			AND m1.del_flg = c_off
			AND m3.del_flg = c_off
			ORDER BY t.ac_ym
			FOR UPDATE OF t NOWAIT
		LOOP

			CALL mbpa_imp_ac$p_set_ac_dpt(x.dpt_cd, i_end_dt, l_dpt, l_dpt_cache);
			IF l_dpt IS NULL THEN
				/* １件でもエラーがあったら取込は行わない */
				CALL mbpa_imp_ac$p_raise_err();
			END IF;

			l_rec := NULL;

			l_rec.data_no := LPAD(mapa_num$f_get_seq(c_ac_stk_seq)::VARCHAR, c_it_dat_no_l, '0') ;
			l_rec.wg_cd := x.wg_cd;
			l_rec.ac_ym := x.ac_ym;
			l_rec.ac_dt := i_end_dt;
			l_rec.itm_cd := x.itm_cd;
			l_rec.itm_sub1 := x.itm_sub1;
			l_rec.itm_sub2 := x.itm_sub2;
			l_rec.itm_sub3 := x.itm_sub3;
			l_rec.itm_nm := x.itm_nm;
			l_rec.lot_no := x.lot_no;
			l_rec.sublot_no := x.sublot_no;
			l_rec.sno1 := x.sno1;
			l_rec.sno2 := x.sno2;
			l_rec.sno3 := x.sno3;
			l_rec.sno4 := x.sno4;
			l_rec.gd_cd := x.gd_cd;
			l_rec.quality_typ := x.quality_typ;
			l_rec.asst_typ := x.asst_typ;
			l_rec.loc_cd := x.loc_cd;
			l_rec.str_ln_cd := x.str_ln_cd;
			l_rec.dpt_cd := l_dpt;
			l_rec.inv_com_cd := x.inv_com_cd;
			l_rec.base_unit_qty := x.base_unit_qty;
			l_rec.base_unit_cd := x.base_unit_cd;
			l_rec.ac_slip_typ := x.ac_slip_typ;
			l_rec.ac_itm_grp_cd := x.ac_itm_grp_cd;
			l_rec.itm_jnl_cd := x.itm_jnl_cd;
			l_rec.area_cd := x.area_cd;
			l_rec.cntry_cd := x.cntry_cd;
			l_rec.usr_cd := NULL;
			l_rec.sub_dpt_cd1 := NULL;
			l_rec.sub_dpt_cd2 := NULL;
			l_rec.sub_dpt_cd3 := NULL;
			l_rec.sub_char1 := NULL;
			l_rec.sub_char2 := NULL;
			l_rec.sub_char3 := NULL;
			l_rec.sub_char4 := NULL;
			l_rec.sub_char5 := NULL;
			l_rec.sub_char6 := NULL;
			l_rec.sub_char7 := NULL;
			l_rec.sub_char8 := NULL;
			l_rec.sub_char9 := NULL;
			l_rec.sub_char10 := NULL;
			l_rec.sub_num1 := NULL;
			l_rec.sub_num2 := NULL;
			l_rec.sub_num3 := NULL;
			l_rec.sub_dt1 := NULL;
			l_rec.sub_dt2 := NULL;
			l_rec.sub_dt3 := NULL;
			l_rec.jnl_fin_cnt := 0;

			FOR j IN 1..10 LOOP
				CASE j
					WHEN 1 THEN
						l_jnl_key_col_typ := c_jnl_key1 ;
					WHEN 2 THEN
						l_jnl_key_col_typ := c_jnl_key2 ;
					WHEN 3 THEN
						l_jnl_key_col_typ := c_jnl_key3 ;
					WHEN 4 THEN
						l_jnl_key_col_typ := c_jnl_key4 ;
					WHEN 5 THEN
						l_jnl_key_col_typ := c_jnl_key5 ;
					WHEN 6 THEN
						l_jnl_key_col_typ := c_jnl_key6 ;
					WHEN 7 THEN
						l_jnl_key_col_typ := c_jnl_key7 ;
					WHEN 8 THEN
						l_jnl_key_col_typ := c_jnl_key8 ;
					WHEN 9 THEN
						l_jnl_key_col_typ := c_jnl_key9 ;
					WHEN 10 THEN
						l_jnl_key_col_typ := c_jnl_key10 ;
				END CASE ;

				/* 仕訳キー対応マスタのレコードを取得 */
				CALL mbpa_imp_ac$p_get_jnl_key_map(l_rec.ac_slip_typ, l_jnl_key_col_typ, l_jnl_key_map) ;

				IF l_jnl_key_map.jnl_key_set_col_typ IS NULL THEN
					CONTINUE ;
				END IF ;

				/* 取引先を専用レコードへ格納 */
				/* (1:acst, 2:cst, 3:psppl, 4:bsppl, 5:asppl, 6:sppl, 7:inv_com, 8:rcst, 9:setoff) */
				l_bp_rec := '{}';
				l_bp_rec[7] := l_rec.inv_com_cd;

				/* 仕訳キー設定項目に対応するカラムの値を取得 */
				CASE l_jnl_key_map.jnl_key_set_col_typ
					WHEN c_wg_cd THEN
						l_jnl_key_set_val := l_rec.wg_cd ;
						l_not_null_flg := c_on ;
					WHEN c_dpt_cd THEN
						l_jnl_key_set_val := l_rec.dpt_cd ;
						l_not_null_flg := c_on ;
					WHEN c_sub_dpt_cd1 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd1 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd2 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd2 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd3 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd3 ;
						l_not_null_flg := c_off ;
					WHEN c_loc_cd THEN
						l_jnl_key_set_val := l_rec.loc_cd ;
						l_not_null_flg := c_on ;
					WHEN c_str_ln_cd THEN
						l_jnl_key_set_val := l_rec.str_ln_cd ;
						l_not_null_flg := c_on ;
					WHEN c_inv_com_cd THEN
						l_jnl_key_set_val := l_rec.inv_com_cd ;
						l_not_null_flg := c_off ;
					WHEN c_ac_itm_grp_cd THEN
						l_jnl_key_set_val := l_rec.ac_itm_grp_cd ;
						l_not_null_flg := c_off ;
					WHEN c_gd_cd THEN
						l_jnl_key_set_val := l_rec.gd_cd ;
						l_not_null_flg := c_on ;
					WHEN c_itm_cd THEN
						l_jnl_key_set_val := l_rec.itm_cd ;
						l_not_null_flg := c_on ;
					WHEN c_itm_sub1 THEN
						l_jnl_key_set_val := l_rec.itm_sub1 ;
						l_not_null_flg := c_on ;
					WHEN c_itm_sub2 THEN
						l_jnl_key_set_val := l_rec.itm_sub2 ;
						l_not_null_flg := c_on ;
					WHEN c_itm_sub3 THEN
						l_jnl_key_set_val := l_rec.itm_sub3 ;
						l_not_null_flg := c_on ;
					WHEN c_sno1 THEN
						l_jnl_key_set_val := l_rec.sno1 ;
						l_not_null_flg := c_on ;
					WHEN c_sno2 THEN
						l_jnl_key_set_val := l_rec.sno2 ;
						l_not_null_flg := c_on ;
					WHEN c_sno3 THEN
						l_jnl_key_set_val := l_rec.sno3 ;
						l_not_null_flg := c_on ;
					WHEN c_sno4 THEN
						l_jnl_key_set_val := l_rec.sno4 ;
						l_not_null_flg := c_on ;
					WHEN c_itm_grp_cd1 THEN
						l_jnl_key_set_val := x.itm_grp_cd1 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd2 THEN
						l_jnl_key_set_val := x.itm_grp_cd2 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd3 THEN
						l_jnl_key_set_val := x.itm_grp_cd3 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd4 THEN
						l_jnl_key_set_val := x.itm_grp_cd4 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd5 THEN
						l_jnl_key_set_val := x.itm_grp_cd5 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd6 THEN
						l_jnl_key_set_val := x.itm_grp_cd6 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd7 THEN
						l_jnl_key_set_val := x.itm_grp_cd7 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd8 THEN
						l_jnl_key_set_val := x.itm_grp_cd8 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd9 THEN
						l_jnl_key_set_val := x.itm_grp_cd9 ;
						l_not_null_flg := c_off ;
					WHEN c_itm_grp_cd10 THEN
						l_jnl_key_set_val := x.itm_grp_cd10 ;
						l_not_null_flg := c_off ;
					WHEN c_area_cd THEN
						l_jnl_key_set_val := l_rec.area_cd ;
						l_not_null_flg := c_off ;
					WHEN c_cntry_cd THEN
						l_jnl_key_set_val := l_rec.cntry_cd ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd1 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd1, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd2 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd2, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd3 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd3, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd4 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd4, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd5 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd5, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd6 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd6, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd7 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd7, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd8 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd8, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd9 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd9, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd10 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd10, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char1 THEN
						l_jnl_key_set_val := l_rec.sub_char1 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char2 THEN
						l_jnl_key_set_val := l_rec.sub_char2 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char3 THEN
						l_jnl_key_set_val := l_rec.sub_char3 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char4 THEN
						l_jnl_key_set_val := l_rec.sub_char4 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char5 THEN
						l_jnl_key_set_val := l_rec.sub_char5 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char6 THEN
						l_jnl_key_set_val := l_rec.sub_char6 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char7 THEN
						l_jnl_key_set_val := l_rec.sub_char7 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char8 THEN
						l_jnl_key_set_val := l_rec.sub_char8 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char9 THEN
						l_jnl_key_set_val := l_rec.sub_char9 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char10 THEN
						l_jnl_key_set_val := l_rec.sub_char10 ;
						l_not_null_flg := c_off ;
					ELSE
						l_jnl_key_set_val := NULL ;
						l_not_null_flg := c_off ;
				END CASE;

				/* NULL可項目がNULLの場合、NULL不可項目がNULL文字の場合 */
				IF (l_jnl_key_set_val IS NULL AND l_not_null_flg = c_off)
					OR (l_jnl_key_set_val = c_null_val AND l_not_null_flg = c_on) THEN
					l_jnl_key_set_val := l_jnl_key_map.default_cd ;
				END IF ;

				CASE l_jnl_key_col_typ
					WHEN c_jnl_key1 THEN
						l_rec.jnl_key1 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key2 THEN
						l_rec.jnl_key2 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key3 THEN
						l_rec.jnl_key3 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key4 THEN
						l_rec.jnl_key4 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key5 THEN
						l_rec.jnl_key5 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key6 THEN
						l_rec.jnl_key6 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key7 THEN
						l_rec.jnl_key7 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key8 THEN
						l_rec.jnl_key8 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key9 THEN
						l_rec.jnl_key9 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key10 THEN
						l_rec.jnl_key10 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
				END CASE ;
			END LOOP;

			l_recs[COALESCE(array_length(l_recs, 1), 0)+1] := l_rec;

			l_rec_cnt := l_rec_cnt + 1;

			IF COALESCE(array_length(l_recs, 1), 0) > c_max_cnt THEN
				CALL mbpa_imp_ac$ins_stk(l_recs) ;
			END IF ;

		END LOOP;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MBBBD0003');
	END ;

	CALL mbpa_imp_ac$ins_stk(l_recs);

	/* 処理が終了しました。{1} データ取込件数 : {2} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0026', c_proc_nm, l_rec_cnt::VARCHAR);

	COMMIT ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$ins_rcv(
	INOUT o_recs mbt_ac_rcv[],
	INOUT o_recs_id mst_rcv_act_if[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	入金情報取込処理のサブプログラム
<REMARKS>

<ARGUMENTS>
<IN>	o_recs
		登録対象データ
<IN>	o_recs_id
		更新対象データ（主キー）
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
BEGIN
	IF COALESCE(array_length(o_recs, 1), 0) > 0 THEN
		INSERT INTO mbt_ac_rcv SELECT * FROM UNNEST(o_recs) ;

		UPDATE mst_rcv_act_if t
		SET
			a_imp_flg = c_on
		FROM UNNEST(o_recs_id) w
		WHERE 0=0
		AND t.rcv_act_if_no = w.rcv_act_if_no
		AND t.a_imp_flg = c_off;
	END IF;

	o_recs := '{}';
	o_recs_id := '{}';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_rcv(
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_rerun CHARACTER,
	IN i_tmap CHARACTER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	入金情報取込処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym
		取込対象月
<IN>	i_dt_fr
		対象期間(FROM)
<IN>	i_dt_to
		対象期間(TO)
<IN>	i_rerun
		再取込ＦＬＧ
<IN>	i_tmap
		有効な会計税対応マスタが存在
<HISTORY>
**************************************************************************/
DECLARE
	c_max_cnt CONSTANT INTEGER := 50 ; /* バルクインサートでの最大レコード数 */
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_proc_nm CONSTANT VARCHAR := 'MBPA_IMP_AC.P_RCV';
	c_ac_rcv_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_SYS_TYP','AC_RCV');
	c_it_dat_no_l CONSTANT INTEGER := 15;

	/* 売掛消込 */
	c_ar_fad CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AR_FAD');
	/* 為替差益（債権消込） */
	c_ar_ex_gain_appl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AR_EX_GAIN_APPL');
	/* 為替差損（債権消込） */
	c_ar_ex_loss_appl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AR_EX_LOSS_APPL');
	/* 為替差益（債権評価替） */
	c_ar_ex_gain_rev CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AR_EX_GAIN_REV');
	/* 為替差損（債権評価替） */
	c_ar_ex_loss_rev CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AR_EX_LOSS_REV');
	/* 未収金消込 */
	c_ac_fad CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AC_FAD');
	/* 為替差益（未収金消込） */
	c_ac_ex_gain_appl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AC_EX_GAIN_APPL');
	/* 為替差損（未収金消込） */
	c_ac_ex_loss_appl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AC_EX_LOSS_APPL');
	/* 為替差益（未収金評価替） */
	c_ac_ex_gain_rev CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AC_EX_GAIN_REV');
	/* 為替差損（未収金評価替） */
	c_ac_ex_loss_rev CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AC_EX_LOSS_REV');

	/* 売掛金 */
	c_ar CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AR_TYP','AR');
	/* 未収金 */
	c_ac CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AR_TYP','AC');

	c_wg_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','WG_CD');
	c_ar_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AR_DPT_CD');
	c_rcv_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','RCV_DPT_CD');
	c_so_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SO_DPT_CD');
	c_sub_dpt_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD1');
	c_sub_dpt_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD2');
	c_sub_dpt_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD3');
	c_acst_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ACST_CD');
	c_rcst_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','RCST_CD');
	c_setoff_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SETOFF_CD');
	c_tax_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TAX_CD');
	c_bp_grp_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD1');
	c_bp_grp_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD2');
	c_bp_grp_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD3');
	c_bp_grp_cd4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD4');
	c_bp_grp_cd5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD5');
	c_bp_grp_cd6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD6');
	c_bp_grp_cd7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD7');
	c_bp_grp_cd8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD8');
	c_bp_grp_cd9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD9');
	c_bp_grp_cd10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD10');
	c_sub_char1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR1');
	c_sub_char2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR2');
	c_sub_char3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR3');
	c_sub_char4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR4');
	c_sub_char5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR5');
	c_sub_char6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR6');
	c_sub_char7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR7');
	c_sub_char8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR8');
	c_sub_char9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR9');
	c_sub_char10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR10');

	l_cnt NUMERIC;
	l_rec_cnt NUMERIC;
	l_chk_err CHAR(1);
	l_rowcount INTEGER;
	l_max_ts mst_rcv_act_if.ins_ts%TYPE;
	l_tmp_dt mst_rcv_act_if.ac_dt%TYPE;
	l_tmp_slip VARCHAR;
	l_tax_cd mam_tax.tax_cd%TYPE;
	l_ar_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_rcv_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_so_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_bill_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt1 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt2 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt3 mam_ac_dpt.ac_dpt_cd%TYPE;

	l_fad_cnt NUMERIC;
	l_ex_gain_appl_cnt NUMERIC;
	l_ex_loss_appl_cnt NUMERIC;
	l_ex_gain_rev_cnt NUMERIC;
	l_ex_loss_rev_cnt NUMERIC;

	c_jnl_key1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY1');
	c_jnl_key2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY2');
	c_jnl_key3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY3');
	c_jnl_key4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY4');
	c_jnl_key5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY5');
	c_jnl_key6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY6');
	c_jnl_key7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY7');
	c_jnl_key8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY8');
	c_jnl_key9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY9');
	c_jnl_key10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY10');
	l_jnl_key_map		mam_jnl_key_map%ROWTYPE ;
	l_jnl_key_col_typ	VARCHAR;
	l_jnl_key_set_val	VARCHAR(200);
	l_not_null_flg		CHAR(1);

	l_rec mbt_ac_rcv%ROWTYPE;
	l_recs mbt_ac_rcv[];
	l_rec_id mst_rcv_act_if%ROWTYPE;
	l_recs_id mst_rcv_act_if[];
	l_bp_rec VARCHAR[];
	l_inv_rsn mam_ac_rsn%ROWTYPE;
	l_ac_rsn_rec VARCHAR[];
	l_dpt_cache mam_dpt[];
	l_tax_cache mam_ac_tax_map[];

	/* 締処理為替評価替レコードの集計処理ロック用のカーソル */
	cur_ac_rcv CURSOR FOR
		SELECT t.data_no
		FROM mbt_ac_rcv t
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.jnl_fin_cnt = 0
		/* 締処理為替評価替 */
		AND t.rcv_act_no = c_null_val
		ORDER BY t.data_no
		FOR UPDATE NOWAIT;

	y RECORD;
	x RECORD;
	y1 RECORD;

BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0001', c_proc_nm);

	/* ロック後に追加されたレコードは取込対象外にする */
	l_max_ts := NULL;
	BEGIN
		FOR y IN
			SELECT t.ins_ts
			FROM mst_rcv_act_if t
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.ac_dt >= i_dt_fr
			AND t.ac_dt < i_dt_to + '1 days'::INTERVAL
			AND (t.a_imp_flg = c_off OR i_rerun = c_on)
			AND EXISTS (
					SELECT 'X'
					FROM mam_slip_jnl w
					WHERE 0=0
					AND w.ac_slip_typ = t.ac_slip_typ
					AND w.del_flg = c_off)
			ORDER BY t.ins_ts DESC, t.rcv_act_if_no
			FOR UPDATE NOWAIT
		LOOP
			l_max_ts := y.ins_ts;
			EXIT;
		END LOOP;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MBBBD0003');
	END ;

	SELECT COUNT(*)
	INTO STRICT l_fad_cnt
	FROM mam_slip_jnl m
	WHERE 0=0
	AND m.ac_slip_typ IN (c_ar_fad, c_ac_fad)
	AND m.del_flg = c_off
	;

	SELECT COUNT(*)
	INTO STRICT l_ex_gain_appl_cnt
	FROM mam_slip_jnl m
	WHERE 0=0
	AND m.ac_slip_typ IN (c_ar_ex_gain_appl, c_ac_ex_gain_appl)
	AND m.del_flg = c_off;

	SELECT COUNT(*)
	INTO STRICT l_ex_loss_appl_cnt
	FROM mam_slip_jnl m
	WHERE 0=0
	AND m.ac_slip_typ IN (c_ar_ex_loss_appl, c_ac_ex_loss_appl)
	AND m.del_flg = c_off;

	SELECT COUNT(*)
	INTO STRICT l_ex_gain_rev_cnt
	FROM mam_slip_jnl m
	WHERE 0=0
	AND m.ac_slip_typ IN (c_ar_ex_gain_rev, c_ac_ex_gain_rev)
	AND m.del_flg = c_off;

	SELECT COUNT(*)
	INTO STRICT l_ex_loss_rev_cnt
	FROM mam_slip_jnl m
	WHERE 0=0
	AND m.ac_slip_typ IN (c_ar_ex_loss_rev, c_ac_ex_loss_rev)
	AND m.del_flg = c_off;

	IF i_rerun = c_on THEN
		/* 再取込チェック */
		SELECT MAX(t.jnl_fin_cnt)
		INTO STRICT l_cnt
		FROM mbt_ac_rcv t
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.ac_dt BETWEEN i_dt_fr AND i_dt_to;

		IF l_cnt > 0 THEN
			/* 対象の入金データで仕訳済みのレコードがあるため再取込できません。 */
			CALL fcpa_err$raise_app_err('MBBBD0033');
		ELSE
			DELETE FROM mbt_ac_rcv t
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.ac_dt BETWEEN i_dt_fr AND i_dt_to;
		END IF;

		UPDATE mst_rcv_act_if t
		SET a_imp_flg = c_off
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.ac_dt >= i_dt_fr
		AND t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND t.a_imp_flg = c_on
		AND t.ins_ts <= l_max_ts;
	END IF;

	UPDATE mst_rcv_act_if t
	SET a_imp_flg = c_on
	WHERE 0=0
	AND t.ac_ym = i_ym
	AND t.ac_dt >= i_dt_fr
	AND t.ac_dt < i_dt_to + '1 days'::INTERVAL
	AND t.a_imp_flg = c_off
	AND t.ins_ts <= l_max_ts
	AND EXISTS (
			SELECT 'X'
			FROM mam_slip_jnl w
			WHERE 0=0
			AND w.ac_slip_typ = t.ac_slip_typ
			AND w.red_input_flg = c_off
			AND w.del_flg = c_off
			)
	AND EXISTS (
			SELECT 'X'
			FROM mst_rcv_act_if w
			WHERE 0=0
			AND w.act_no = t.act_no
			AND w.act_rev = t.act_rev
			AND w.ac_slip_typ = t.ac_slip_typ
			AND w.ac_ym = i_ym
			AND w.ac_dt >= i_dt_fr
			AND w.ac_dt < i_dt_to + '1 days'::INTERVAL
			AND w.a_imp_flg = c_off
			AND w.ins_ts <= l_max_ts
			GROUP BY w.act_no, w.act_rev, w.ac_slip_typ
			HAVING SUM(CASE w.can_flg WHEN c_off THEN 1 ELSE 0 END)
				= SUM(CASE w.can_flg WHEN c_on THEN 1 ELSE 0 END)
			);

	l_rec_cnt := 0;
	l_chk_err := c_off;
	l_tmp_dt := NULL;
	l_dpt_cache := '{}';
	l_tax_cache := '{}';

	/* 会計理由マスタの取得 */
	SELECT array_agg(m.ac_rsn_cd) INTO l_ac_rsn_rec
	FROM mam_ac_rsn m
	WHERE 0=0
	AND m.ac_invalid_flg = c_on
	AND m.del_flg = c_off;

	FOR x IN (
		SELECT
			t.rcv_act_if_no,
			m2.wg_cd,
			t.ac_ym,
			COALESCE(t.act_no, c_null_val) rcv_act_no,
			COALESCE(t.act_seq, 1) rcv_act_seq,
			COALESCE(t.act_rev, 1) rcv_act_rev,
			t.ar_typ,
			t.act_d_no rcv_act_d_no,
			t.act_d_seq rcv_act_d_seq,
			DATE_TRUNC('DAY', t.ac_dt) ac_dt,
			t.can_flg,
			t.ac_slip_typ,
			t.ac_rsn_cd,
			t.ar_dpt_cd,
			t.rcv_dpt_cd,
			t.so_dpt_cd,
			t.sub_dpt_cd1,
			t.sub_dpt_cd2,
			t.sub_dpt_cd3,
			t.rcst_cd,
			t.acst_cd,
			t.setoff_cd,
			t.foreign_flg,
			t.base_cur_cd,
			t.base_cur_amt,
			t.base_cur_tax_amt,
			t.trd_cur_cd,
			t.trd_cur_amt,
			t.trd_cur_tax_amt,
			t.tax_cd,
			t.xrate_cd,
			t.xrate,
			t.bill_no,
			t.usr_cd,
			t.iv_no,
			t.wrk_no,
			t.bank_ac_cd,
			t.xfr_psn,
			t.note_no,
			t.trd_rmrks,
			t.trd_d_rmrks,
			t.sub_char1,
			t.sub_char2,
			t.sub_char3,
			t.sub_char4,
			t.sub_char5,
			t.sub_char6,
			t.sub_char7,
			t.sub_char8,
			t.sub_char9,
			t.sub_char10,
			t.sub_num1,
			t.sub_num2,
			t.sub_num3,
			t.sub_dt1,
			t.sub_dt2,
			t.sub_dt3
		FROM mst_rcv_act_if t, mam_slip_jnl m1, mam_dpt m2
		WHERE 0=0
		AND m1.ac_slip_typ = t.ac_slip_typ
		AND m2.dpt_cd = COALESCE(t.ar_dpt_cd, t.rcv_dpt_cd)
		AND m2.st_dt  <= t.ac_dt
		AND m2.end_dt >= t.ac_dt
		AND t.ac_ym = i_ym
		AND t.ac_dt >= i_dt_fr
		AND t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND t.a_imp_flg = c_off
		AND t.ins_ts <= l_max_ts
		AND m1.del_flg = c_off
		AND m2.del_flg = c_off
		ORDER BY t.ac_dt, t.ac_slip_typ, t.rcv_act_if_no
		)
	LOOP
		<<NEXT_LOOP>>
		BEGIN

			IF x.base_cur_amt = 0 AND x.base_cur_tax_amt = 0
			AND x.trd_cur_amt = 0 AND x.trd_cur_tax_amt = 0 THEN
				UPDATE mst_rcv_act_if t
				SET a_imp_flg = c_on
				WHERE 0=0
				AND t.rcv_act_if_no = x.rcv_act_if_no
				AND t.a_imp_flg = c_off;

				EXIT NEXT_LOOP ;
			END IF ;

			IF x.ac_rsn_cd IS NOT NULL THEN
				FOR i IN 1..COALESCE(array_length(l_ac_rsn_rec, 1), 0) LOOP
					IF l_ac_rsn_rec[i] = x.ac_rsn_cd THEN
						EXIT NEXT_LOOP ;
					END IF;
				END LOOP;
			END IF ;

			IF l_tmp_dt IS NULL OR l_tmp_dt <> x.ac_dt THEN
				l_dpt_cache := '{}';
				l_tax_cache := '{}';
				l_tmp_dt := x.ac_dt ;
			END IF ;

			/* 債権部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.ar_dpt_cd, x.ac_dt, l_ar_dpt, l_dpt_cache) ;
			IF x.ar_dpt_cd IS NOT NULL AND l_ar_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;
			/* 入金部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.rcv_dpt_cd, x.ac_dt, l_rcv_dpt, l_dpt_cache) ;
			IF x.rcv_dpt_cd IS NOT NULL AND l_rcv_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;
			/* 相殺部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.so_dpt_cd, x.ac_dt, l_so_dpt, l_dpt_cache) ;
			IF x.so_dpt_cd IS NOT NULL AND l_so_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;
			/* 予備部門1 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd1, x.ac_dt, l_sub_dpt1, l_dpt_cache) ;
			IF x.sub_dpt_cd1 IS NOT NULL AND l_sub_dpt1 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;
			/* 予備部門2 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd2, x.ac_dt, l_sub_dpt2, l_dpt_cache) ;
			IF x.sub_dpt_cd2 IS NOT NULL AND l_sub_dpt2 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;
			/* 予備部門3 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd3, x.ac_dt, l_sub_dpt3, l_dpt_cache) ;
			IF x.sub_dpt_cd3 IS NOT NULL AND l_sub_dpt3 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			IF l_tmp_slip IS NULL OR l_tmp_slip <> x.ac_slip_typ THEN
				l_tax_cache := '{}';
				l_tmp_slip := x.ac_slip_typ ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_tax(x.ac_slip_typ, x.tax_cd, x.ac_dt, i_tmap, l_tax_cd, l_tax_cache) ;
			IF x.tax_cd IS NOT NULL AND l_tax_cd IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			IF x.ar_typ = c_ac THEN
				IF l_fad_cnt = 2 AND x.ac_slip_typ = c_ar_fad THEN
					x.ac_slip_typ := c_ac_fad ;
				END IF ;

				IF l_ex_gain_appl_cnt = 2 AND x.ac_slip_typ = c_ar_ex_gain_appl THEN
					x.ac_slip_typ := c_ac_ex_gain_appl ;
				END IF ;

				IF l_ex_loss_appl_cnt = 2 AND x.ac_slip_typ = c_ar_ex_loss_appl THEN
					x.ac_slip_typ := c_ac_ex_loss_appl ;
				END IF ;

				IF l_ex_gain_rev_cnt = 2 AND x.ac_slip_typ = c_ar_ex_gain_rev THEN
					x.ac_slip_typ := c_ac_ex_gain_rev ;
				END IF ;

				IF l_ex_loss_rev_cnt = 2 AND x.ac_slip_typ = c_ar_ex_loss_rev THEN
					x.ac_slip_typ := c_ac_ex_loss_rev ;
				END IF ;
			END IF ;

			l_rec := NULL;
			l_rec.data_no := LPAD(mapa_num$f_get_seq(c_ac_rcv_seq)::VARCHAR, c_it_dat_no_l, '0') ;
			l_rec.wg_cd		:= x.wg_cd ;
			l_rec.ac_ym		:= x.ac_ym ;
			l_rec.rcv_act_no	:= x.rcv_act_no ;
			l_rec.rcv_act_seq	:= x.rcv_act_seq ;
			l_rec.rcv_act_rev	:= x.rcv_act_rev ;
			l_rec.rcv_act_d_no	:= x.rcv_act_d_no ;
			l_rec.rcv_act_d_seq	:= x.rcv_act_d_seq ;
			l_rec.ac_dt		:= x.ac_dt ;
			l_rec.can_flg		:= x.can_flg ;
			l_rec.ac_slip_typ	:= x.ac_slip_typ ;
			l_rec.ac_rsn_cd	:= x.ac_rsn_cd ;
			l_rec.ar_dpt_cd	:= l_ar_dpt ;
			l_rec.rcv_dpt_cd	:= l_rcv_dpt ;
			l_rec.so_dpt_cd	:= l_so_dpt ;
			l_rec.sub_dpt_cd1	:= l_sub_dpt1 ;
			l_rec.sub_dpt_cd2	:= l_sub_dpt2 ;
			l_rec.sub_dpt_cd3	:= l_sub_dpt3 ;
			l_rec.rcst_cd		:= x.rcst_cd ;
			l_rec.acst_cd		:= x.acst_cd ;
			l_rec.setoff_cd	:= x.setoff_cd ;
			l_rec.foreign_flg	:= x.foreign_flg ;
			l_rec.base_cur_cd	:= x.base_cur_cd ;
			l_rec.base_cur_amt	:= x.base_cur_amt ;
			l_rec.base_cur_tax_amt	:= x.base_cur_tax_amt ;
			l_rec.trd_cur_cd	:= x.trd_cur_cd ;
			l_rec.trd_cur_amt	:= x.trd_cur_amt ;
			l_rec.trd_cur_tax_amt	:= x.trd_cur_tax_amt ;
			l_rec.tax_cd		:= l_tax_cd ;
			l_rec.xrate_cd		:= x.xrate_cd ;
			l_rec.xrate		:= x.xrate ;
			l_rec.bill_no		:= x.bill_no ;
			l_rec.usr_cd		:= x.usr_cd ;
			l_rec.iv_no		:= x.iv_no ;
			l_rec.wrk_no		:= x.wrk_no ;
			l_rec.bank_ac_cd	:= x.bank_ac_cd ;
			l_rec.xfr_psn		:= x.xfr_psn ;
			l_rec.note_no		:= x.note_no ;
			l_rec.trd_rmrks	:= x.trd_rmrks ;
			l_rec.trd_d_rmrks	:= x.trd_d_rmrks ;
			l_rec.sub_char1	:= x.sub_char1 ;
			l_rec.sub_char2	:= x.sub_char2 ;
			l_rec.sub_char3	:= x.sub_char3 ;
			l_rec.sub_char4	:= x.sub_char4 ;
			l_rec.sub_char5	:= x.sub_char5 ;
			l_rec.sub_char6	:= x.sub_char6 ;
			l_rec.sub_char7	:= x.sub_char7 ;
			l_rec.sub_char8	:= x.sub_char8 ;
			l_rec.sub_char9	:= x.sub_char9 ;
			l_rec.sub_char10	:= x.sub_char10 ;
			l_rec.sub_num1		:= x.sub_num1 ;
			l_rec.sub_num2		:= x.sub_num2 ;
			l_rec.sub_num3		:= x.sub_num3 ;
			l_rec.sub_dt1		:= x.sub_dt1 ;
			l_rec.sub_dt2		:= x.sub_dt2 ;
			l_rec.sub_dt3		:= x.sub_dt3 ;
			l_rec.jnl_fin_cnt	:= 0 ;

			FOR j IN 1..10 LOOP
				CASE j
					WHEN 1 THEN
						l_jnl_key_col_typ := c_jnl_key1 ;
					WHEN 2 THEN
						l_jnl_key_col_typ := c_jnl_key2 ;
					WHEN 3 THEN
						l_jnl_key_col_typ := c_jnl_key3 ;
					WHEN 4 THEN
						l_jnl_key_col_typ := c_jnl_key4 ;
					WHEN 5 THEN
						l_jnl_key_col_typ := c_jnl_key5 ;
					WHEN 6 THEN
						l_jnl_key_col_typ := c_jnl_key6 ;
					WHEN 7 THEN
						l_jnl_key_col_typ := c_jnl_key7 ;
					WHEN 8 THEN
						l_jnl_key_col_typ := c_jnl_key8 ;
					WHEN 9 THEN
						l_jnl_key_col_typ := c_jnl_key9 ;
					WHEN 10 THEN
						l_jnl_key_col_typ := c_jnl_key10 ;
				END CASE ;

				/* 仕訳キー対応マスタのレコードを取得 */
				CALL mbpa_imp_ac$p_get_jnl_key_map(l_rec.ac_slip_typ, l_jnl_key_col_typ, l_jnl_key_map) ;

				IF l_jnl_key_map.jnl_key_set_col_typ IS NULL THEN
					CONTINUE ;
				END IF ;

				/* 取引先を専用レコードへ格納 */
				/* (1:acst, 2:cst, 3:psppl, 4:bsppl, 5:asppl, 6:sppl, 7:inv_com, 8:rcst, 9:setoff) */
				l_bp_rec := '{}';
				l_bp_rec[1] := l_rec.acst_cd;
				l_bp_rec[8] := l_rec.rcst_cd;
				l_bp_rec[9] := l_rec.setoff_cd;

				/* 仕訳キー設定項目に対応するカラムの値を取得 */
				CASE l_jnl_key_map.jnl_key_set_col_typ
					WHEN c_wg_cd THEN
						l_jnl_key_set_val := l_rec.wg_cd ;
						l_not_null_flg := c_on ;
					WHEN c_ar_dpt_cd THEN
						l_jnl_key_set_val := l_rec.ar_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_rcv_dpt_cd THEN
						l_jnl_key_set_val := l_rec.rcv_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_so_dpt_cd THEN
						l_jnl_key_set_val := l_rec.so_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd1 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd1 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd2 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd2 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd3 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd3 ;
						l_not_null_flg := c_off ;
					WHEN c_acst_cd THEN
						l_jnl_key_set_val := l_rec.acst_cd ;
						l_not_null_flg := c_off ;
					WHEN c_rcst_cd THEN
						l_jnl_key_set_val := l_rec.rcst_cd ;
						l_not_null_flg := c_off ;
					WHEN c_setoff_cd THEN
						l_jnl_key_set_val := l_rec.setoff_cd ;
						l_not_null_flg := c_off ;
					WHEN c_tax_cd THEN
						l_jnl_key_set_val := l_rec.tax_cd ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd1 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd1, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd2 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd2, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd3 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd3, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd4 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd4, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd5 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd5, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd6 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd6, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd7 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd7, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd8 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd8, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd9 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd9, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd10 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd10, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char1 THEN
						l_jnl_key_set_val := l_rec.sub_char1 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char2 THEN
						l_jnl_key_set_val := l_rec.sub_char2 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char3 THEN
						l_jnl_key_set_val := l_rec.sub_char3 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char4 THEN
						l_jnl_key_set_val := l_rec.sub_char4 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char5 THEN
						l_jnl_key_set_val := l_rec.sub_char5 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char6 THEN
						l_jnl_key_set_val := l_rec.sub_char6 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char7 THEN
						l_jnl_key_set_val := l_rec.sub_char7 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char8 THEN
						l_jnl_key_set_val := l_rec.sub_char8 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char9 THEN
						l_jnl_key_set_val := l_rec.sub_char9 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char10 THEN
						l_jnl_key_set_val := l_rec.sub_char10 ;
						l_not_null_flg := c_off ;
					ELSE
						l_jnl_key_set_val := NULL ;
						l_not_null_flg := c_off ;
				END CASE ;

				/* NULL可項目がNULLの場合、NULL不可項目がNULL文字の場合 */
				IF (l_jnl_key_set_val IS NULL AND l_not_null_flg = c_off)
					OR (l_jnl_key_set_val = c_null_val AND l_not_null_flg = c_on) THEN
					l_jnl_key_set_val := l_jnl_key_map.default_cd ;
				END IF ;

				CASE l_jnl_key_col_typ
					WHEN c_jnl_key1 THEN
						l_rec.jnl_key1 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key2 THEN
						l_rec.jnl_key2 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key3 THEN
						l_rec.jnl_key3 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key4 THEN
						l_rec.jnl_key4 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key5 THEN
						l_rec.jnl_key5 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key6 THEN
						l_rec.jnl_key6 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key7 THEN
						l_rec.jnl_key7 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key8 THEN
						l_rec.jnl_key8 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key9 THEN
						l_rec.jnl_key9 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key10 THEN
						l_rec.jnl_key10 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
				END CASE ;
			END LOOP ;

			l_recs[COALESCE(array_length(l_recs, 1), 0)+1] := l_rec;

			l_rec_id.rcv_act_if_no := x.rcv_act_if_no;
			l_recs_id[COALESCE(array_length(l_recs_id, 1), 0)+1] := l_rec_id;

			l_rec_cnt := l_rec_cnt + 1;

			IF COALESCE(array_length(l_recs, 1), 0) > c_max_cnt THEN
				CALL mbpa_imp_ac$ins_rcv(l_recs, l_recs_id);
			END IF ;

		END;

	END LOOP;

	CALL mbpa_imp_ac$ins_rcv(l_recs, l_recs_id);

	<<SKIP_SUM>>
	BEGIN
		IF l_rec_cnt = 0 THEN
			EXIT SKIP_SUM;
		END IF;

		/* 締処理為替評価替レコードの集計処理 */
		BEGIN
			FOR x IN cur_ac_rcv LOOP EXIT;
			END LOOP ;
		EXCEPTION
			WHEN lock_not_available THEN
				CALL fcpa_err$raise_app_err('MBBBD0003');
		END ;

		FOR y1 IN
			SELECT
				MAX(t.data_no) data_no,
				t.wg_cd,
				CASE t.ac_slip_typ
					WHEN c_ar_ex_loss_rev THEN c_ar_ex_gain_rev
					WHEN c_ac_ex_loss_rev THEN c_ac_ex_gain_rev
					ELSE t.ac_slip_typ
				END ac_slip_typ,
				t.ac_rsn_cd,
				t.ar_dpt_cd,
				t.rcv_dpt_cd,
				t.so_dpt_cd,
				t.sub_dpt_cd1,
				t.sub_dpt_cd2,
				t.sub_dpt_cd3,
				t.rcst_cd,
				t.acst_cd,
				t.setoff_cd,
				t.foreign_flg,
				t.base_cur_cd,
				t.trd_cur_cd,
				t.tax_cd,
				t.xrate_cd,
				t.bill_no,
				t.usr_cd,
				t.iv_no,
				t.wrk_no,
				t.bank_ac_cd,
				t.xfr_psn,
				t.note_no,
				t.jnl_key1,
				t.jnl_key2,
				t.jnl_key3,
				t.jnl_key4,
				t.jnl_key5,
				t.jnl_key6,
				t.jnl_key7,
				t.jnl_key8,
				t.jnl_key9,
				t.jnl_key10,
				t.trd_rmrks,
				t.trd_d_rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3,
				t.sub_char4,
				t.sub_char5,
				t.sub_char6,
				t.sub_char7,
				t.sub_char8,
				t.sub_char9,
				t.sub_char10,
				t.sub_num1,
				t.sub_num2,
				t.sub_num3,
				t.sub_dt1,
				t.sub_dt2,
				t.sub_dt3,
				SUM(t.base_cur_amt) base_cur_amt,
				SUM(t.base_cur_tax_amt) base_cur_tax_amt,
				SUM(t.trd_cur_amt) trd_cur_amt,
				SUM(t.trd_cur_tax_amt) trd_cur_tax_amt
			FROM mbt_ac_rcv t
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.jnl_fin_cnt = 0
			/* 締処理為替評価替 */
			AND t.rcv_act_no = c_null_val
			GROUP BY t.wg_cd,
				CASE t.ac_slip_typ
					WHEN c_ar_ex_loss_rev THEN c_ar_ex_gain_rev
					WHEN c_ac_ex_loss_rev THEN c_ac_ex_gain_rev
					ELSE t.ac_slip_typ
				END, t.ac_rsn_cd, t.ar_dpt_cd, t.rcv_dpt_cd, t.so_dpt_cd, t.sub_dpt_cd1, t.sub_dpt_cd2, t.sub_dpt_cd3,
				t.rcst_cd, t.acst_cd, t.setoff_cd, t.foreign_flg, t.base_cur_cd, t.trd_cur_cd, t.tax_cd, t.xrate_cd,
				t.bill_no, t.usr_cd, t.iv_no, t.wrk_no, t.bank_ac_cd, t.xfr_psn, t.note_no, t.jnl_key1, t.jnl_key2, t.jnl_key3,
				t.jnl_key4, t.jnl_key5, t.jnl_key6, t.jnl_key7, t.jnl_key8, t.jnl_key9, t.jnl_key10, t.trd_rmrks, t.trd_d_rmrks,
				t.sub_char1, t.sub_char2, t.sub_char3, t.sub_char4, t.sub_char5, t.sub_char6, t.sub_char7, t.sub_char8, t.sub_char9,
				t.sub_char10, t.sub_num1, t.sub_num2, t.sub_num3, t.sub_dt1, t.sub_dt2, t.sub_dt3
		LOOP
			UPDATE mbt_ac_rcv t
			SET
				base_cur_amt = y1.base_cur_amt,
				base_cur_tax_amt = y1.base_cur_tax_amt,
				trd_cur_amt = y1.trd_cur_amt,
				trd_cur_tax_amt = y1.trd_cur_tax_amt
			WHERE 0=0
			AND t.data_no = y1.data_no
			AND (0 = 1
				OR t.base_cur_amt != y1.base_cur_amt
				OR t.base_cur_tax_amt != y1.base_cur_tax_amt
				OR t.trd_cur_amt != y1.trd_cur_amt
				OR t.trd_cur_tax_amt != y1.trd_cur_tax_amt);

			DELETE FROM mbt_ac_rcv t
			WHERE 0=0
			AND t.data_no <> y1.data_no
			AND t.ac_ym = i_ym
			AND t.jnl_fin_cnt = 0
			/* 締処理為替評価替 */
			AND t.rcv_act_no = c_null_val
			AND t.wg_cd = y1.wg_cd
			AND CASE t.ac_slip_typ
					WHEN c_ar_ex_loss_rev THEN c_ar_ex_gain_rev
					WHEN c_ac_ex_loss_rev THEN c_ac_ex_gain_rev
					ELSE t.ac_slip_typ
				END = y1.ac_slip_typ
			AND (t.ac_rsn_cd = y1.ac_rsn_cd OR t.ac_rsn_cd IS NULL AND y1.ac_rsn_cd IS NULL)
			AND (t.ar_dpt_cd = y1.ar_dpt_cd OR t.ar_dpt_cd IS NULL AND y1.ar_dpt_cd IS NULL)
			AND (t.rcv_dpt_cd = y1.rcv_dpt_cd OR t.rcv_dpt_cd IS NULL AND y1.rcv_dpt_cd IS NULL)
			AND (t.so_dpt_cd = y1.so_dpt_cd OR t.so_dpt_cd IS NULL AND y1.so_dpt_cd IS NULL)
			AND (t.sub_dpt_cd1 = y1.sub_dpt_cd1 OR t.sub_dpt_cd1 IS NULL AND y1.sub_dpt_cd1 IS NULL)
			AND (t.sub_dpt_cd2 = y1.sub_dpt_cd2 OR t.sub_dpt_cd2 IS NULL AND y1.sub_dpt_cd2 IS NULL)
			AND (t.sub_dpt_cd3 = y1.sub_dpt_cd3 OR t.sub_dpt_cd3 IS NULL AND y1.sub_dpt_cd3 IS NULL)
			AND (t.rcst_cd = y1.rcst_cd OR t.rcst_cd IS NULL AND y1.rcst_cd IS NULL)
			AND (t.acst_cd = y1.acst_cd OR t.acst_cd IS NULL AND y1.acst_cd IS NULL)
			AND (t.setoff_cd = y1.setoff_cd OR t.setoff_cd IS NULL AND y1.setoff_cd IS NULL)
			AND t.foreign_flg = y1.foreign_flg
			AND t.base_cur_cd = y1.base_cur_cd
			AND t.trd_cur_cd = y1.trd_cur_cd
			AND (t.tax_cd = y1.tax_cd OR t.tax_cd IS NULL AND y1.tax_cd IS NULL)
			AND (t.xrate_cd = y1.xrate_cd OR t.xrate_cd IS NULL AND y1.xrate_cd IS NULL)
			AND (t.bill_no = y1.bill_no OR t.bill_no IS NULL AND y1.bill_no IS NULL)
			AND (t.usr_cd = y1.usr_cd OR t.usr_cd IS NULL AND y1.usr_cd IS NULL)
			AND (t.iv_no = y1.iv_no OR t.iv_no IS NULL AND y1.iv_no IS NULL)
			AND (t.wrk_no = y1.wrk_no OR t.wrk_no IS NULL AND y1.wrk_no IS NULL)
			AND (t.bank_ac_cd = y1.bank_ac_cd OR t.bank_ac_cd IS NULL AND y1.bank_ac_cd IS NULL)
			AND (t.xfr_psn = y1.xfr_psn OR t.xfr_psn IS NULL AND y1.xfr_psn IS NULL)
			AND (t.note_no = y1.note_no OR t.note_no IS NULL AND y1.note_no IS NULL)
			AND (t.jnl_key1 = y1.jnl_key1 OR t.jnl_key1 IS NULL AND y1.jnl_key1 IS NULL)
			AND (t.jnl_key2 = y1.jnl_key2 OR t.jnl_key2 IS NULL AND y1.jnl_key2 IS NULL)
			AND (t.jnl_key3 = y1.jnl_key3 OR t.jnl_key3 IS NULL AND y1.jnl_key3 IS NULL)
			AND (t.jnl_key4 = y1.jnl_key4 OR t.jnl_key4 IS NULL AND y1.jnl_key4 IS NULL)
			AND (t.jnl_key5 = y1.jnl_key5 OR t.jnl_key5 IS NULL AND y1.jnl_key5 IS NULL)
			AND (t.jnl_key6 = y1.jnl_key6 OR t.jnl_key6 IS NULL AND y1.jnl_key6 IS NULL)
			AND (t.jnl_key7 = y1.jnl_key7 OR t.jnl_key7 IS NULL AND y1.jnl_key7 IS NULL)
			AND (t.jnl_key8 = y1.jnl_key8 OR t.jnl_key8 IS NULL AND y1.jnl_key8 IS NULL)
			AND (t.jnl_key9 = y1.jnl_key9 OR t.jnl_key9 IS NULL AND y1.jnl_key9 IS NULL)
			AND (t.jnl_key10 = y1.jnl_key10 OR t.jnl_key10 IS NULL AND y1.jnl_key10 IS NULL)
			AND (t.trd_rmrks = y1.trd_rmrks OR t.trd_rmrks IS NULL AND y1.trd_rmrks IS NULL)
			AND (t.trd_d_rmrks = y1.trd_d_rmrks OR t.trd_d_rmrks IS NULL AND y1.trd_d_rmrks IS NULL)
			AND (t.sub_char1 = y1.sub_char1 OR t.sub_char1 IS NULL AND y1.sub_char1 IS NULL)
			AND (t.sub_char2 = y1.sub_char2 OR t.sub_char2 IS NULL AND y1.sub_char2 IS NULL)
			AND (t.sub_char3 = y1.sub_char3 OR t.sub_char3 IS NULL AND y1.sub_char3 IS NULL)
			AND (t.sub_char4 = y1.sub_char4 OR t.sub_char4 IS NULL AND y1.sub_char4 IS NULL)
			AND (t.sub_char5 = y1.sub_char5 OR t.sub_char5 IS NULL AND y1.sub_char5 IS NULL)
			AND (t.sub_char6 = y1.sub_char6 OR t.sub_char6 IS NULL AND y1.sub_char6 IS NULL)
			AND (t.sub_char7 = y1.sub_char7 OR t.sub_char7 IS NULL AND y1.sub_char7 IS NULL)
			AND (t.sub_char8 = y1.sub_char8 OR t.sub_char8 IS NULL AND y1.sub_char8 IS NULL)
			AND (t.sub_char9 = y1.sub_char9 OR t.sub_char9 IS NULL AND y1.sub_char9 IS NULL)
			AND (t.sub_char10 = y1.sub_char10 OR t.sub_char10 IS NULL AND y1.sub_char10 IS NULL)
			AND (t.sub_num1 = y1.sub_num1 OR t.sub_num1 IS NULL AND y1.sub_num1 IS NULL)
			AND (t.sub_num2 = y1.sub_num2 OR t.sub_num2 IS NULL AND y1.sub_num2 IS NULL)
			AND (t.sub_num3 = y1.sub_num3 OR t.sub_num3 IS NULL AND y1.sub_num3 IS NULL)
			AND (t.sub_dt1 = y1.sub_dt1 OR t.sub_dt1 IS NULL AND y1.sub_dt1 IS NULL)
			AND (t.sub_dt2 = y1.sub_dt2 OR t.sub_dt2 IS NULL AND y1.sub_dt2 IS NULL)
			AND (t.sub_dt3 = y1.sub_dt3 OR t.sub_dt3 IS NULL AND y1.sub_dt3 IS NULL);

			GET DIAGNOSTICS l_rowcount = ROW_COUNT;
			l_rec_cnt := l_rec_cnt - l_rowcount;

			DELETE FROM mbt_ac_rcv t
			WHERE 0=0
			AND t.data_no = y1.data_no
			AND t.base_cur_amt = 0
			AND t.base_cur_tax_amt = 0
			AND t.trd_cur_amt = 0
			AND t.trd_cur_tax_amt = 0;

			GET DIAGNOSTICS l_rowcount = ROW_COUNT;
			l_rec_cnt := l_rec_cnt - l_rowcount;

		END LOOP;

		UPDATE mbt_ac_rcv t
		SET ac_slip_typ = c_ar_ex_loss_rev
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.jnl_fin_cnt = 0
		AND t.rcv_act_no = c_null_val
		AND t.ac_slip_typ = c_ar_ex_gain_rev
		AND t.base_cur_amt < 0;

		UPDATE mbt_ac_rcv t
		SET ac_slip_typ = c_ar_ex_gain_rev
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.jnl_fin_cnt = 0
		AND t.rcv_act_no = c_null_val
		AND t.ac_slip_typ = c_ar_ex_loss_rev
		AND t.base_cur_amt > 0;

		UPDATE mbt_ac_rcv t
		SET ac_slip_typ = c_ac_ex_loss_rev
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.jnl_fin_cnt = 0
		AND t.rcv_act_no = c_null_val
		AND t.ac_slip_typ = c_ac_ex_gain_rev
		AND t.base_cur_amt < 0;

		UPDATE mbt_ac_rcv t
		SET ac_slip_typ = c_ac_ex_gain_rev
		WHERE 0=0
		AND t.ac_ym = i_ym
		AND t.jnl_fin_cnt = 0
		AND t.rcv_act_no = c_null_val
		AND t.ac_slip_typ = c_ac_ex_loss_rev
		AND t.base_cur_amt > 0;
	END;

	/* 処理が終了しました。{1} データ取込件数 : {2} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0026', c_proc_nm, l_rec_cnt::VARCHAR);

	COMMIT ;

	IF l_chk_err = c_on THEN
		CALL mbpa_imp_ac$p_raise_err();
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$ins_pay(
	INOUT o_recs mbt_ac_pay[],
	INOUT o_recs_id mst_pay_act_if[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	支払情報取込処理のサブプログラム
<REMARKS>

<ARGUMENTS>
<IN>	o_recs
		登録対象データ
<IN>	o_recs_id
		更新対象データ（主キー）
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
BEGIN
	IF COALESCE(array_length(o_recs, 1), 0) > 0 THEN
		INSERT INTO mbt_ac_pay SELECT * FROM UNNEST(o_recs) ;

		UPDATE	mst_pay_act_if t
		SET	a_imp_flg = c_on
		FROM	UNNEST(o_recs_id) w
		WHERE	0=0
		AND	t.pay_act_if_no = w.pay_act_if_no
		AND	t.a_imp_flg = c_off;
	END IF;

	o_recs := '{}';
	o_recs_id := '{}';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_pay (
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_rerun CHAR,
	IN i_tmap CHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	支払情報取込処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym
		取込対象月
<IN>	i_dt_fr
		対象期間(FROM)
<IN>	i_dt_to
		対象期間(TO)
<IN>	i_rerun
		再取込ＦＬＧ
<IN>	i_tmap
		有効な会計税対応マスタが存在
<HISTORY>
**************************************************************************/
DECLARE
	c_max_cnt CONSTANT INTEGER := 50 ; /* バルクインサートでの最大レコード数 */
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_proc_nm CONSTANT VARCHAR := 'MBPA_IMP_AC.P_PAY';

	c_ac_pay_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_SYS_TYP','AC_PAY');
	c_it_dat_no_l CONSTANT INTEGER := 15;

	c_ap_ex_gain_rev CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AP_EX_GAIN_REV'); /* 為替差益（債務評価替） */
	c_ap_ex_loss_rev CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AP_EX_LOSS_REV'); /* 為替差損（債務評価替） */

	c_ae_ex_gain_rev CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AE_EX_GAIN_REV'); /* 為替差益（未払金評価替） */
	c_ae_ex_loss_rev CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','AE_EX_LOSS_REV'); /* 為替差損（未払金評価替） */

	c_wg_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','WG_CD');
	c_pay_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','PAY_DPT_CD');
	c_bsppl_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BSPPL_DPT_CD');
	c_ap_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','AP_DPT_CD');
	c_so_dpt_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SO_DPT_CD');
	c_sub_dpt_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD1');
	c_sub_dpt_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD2');
	c_sub_dpt_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_DPT_CD3');
	c_psppl_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','PSPPL_CD');
	c_bsppl_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BSPPL_CD');
	c_asppl_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','ASPPL_CD');
	c_setoff_cd	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SETOFF_CD');
	c_tax_cd		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','TAX_CD');
	c_bp_grp_cd1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD1');
	c_bp_grp_cd2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD2');
	c_bp_grp_cd3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD3');
	c_bp_grp_cd4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD4');
	c_bp_grp_cd5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD5');
	c_bp_grp_cd6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD6');
	c_bp_grp_cd7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD7');
	c_bp_grp_cd8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD8');
	c_bp_grp_cd9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD9');
	c_bp_grp_cd10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','BP_GRP_CD10');
	c_sub_char1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR1');
	c_sub_char2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR2');
	c_sub_char3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR3');
	c_sub_char4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR4');
	c_sub_char5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR5');
	c_sub_char6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR6');
	c_sub_char7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR7');
	c_sub_char8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR8');
	c_sub_char9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR9');
	c_sub_char10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_SET_COL_TYP','SUB_CHAR10');
	c_jnl_key1	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY1');
	c_jnl_key2	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY2');
	c_jnl_key3	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY3');
	c_jnl_key4	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY4');
	c_jnl_key5	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY5');
	c_jnl_key6	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY6');
	c_jnl_key7	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY7');
	c_jnl_key8	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY8');
	c_jnl_key9	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY9');
	c_jnl_key10	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_JNL_KEY_COL_TYP','JNL_KEY10');

	l_rec mbt_ac_pay%ROWTYPE;
	l_recs mbt_ac_pay[];
	i INTEGER;

	l_rec_id mst_pay_act_if%ROWTYPE;
	l_recs_id mst_pay_act_if[];
	d1 INTEGER;

	l_cnt NUMERIC;
	l_rec_cnt NUMERIC;
	l_chk_err CHAR(1);
	l_max_ts mst_pay_act_if.ins_ts%TYPE;
	l_rowcount INTEGER;

	l_tmp_dt mst_pay_act_if.ac_dt%TYPE;
	l_tmp_slip VARCHAR;

	l_tax_cd mam_tax.tax_cd%TYPE;
	l_pay_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_bsppl_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_ap_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_so_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt1 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt2 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt3 mam_ac_dpt.ac_dpt_cd%TYPE;

	l_jnl_key_map		mam_jnl_key_map%ROWTYPE ;
	l_jnl_key_col_typ	VARCHAR;
	l_jnl_key_set_val	VARCHAR(200);
	l_not_null_flg		CHAR(1);
	l_bp_rec VARCHAR[];
	l_inv_rsn mam_ac_rsn%ROWTYPE;
	l_ac_rsn_rec VARCHAR[];
	l_dpt_cache mam_dpt[];
	l_tax_cache mam_ac_tax_map[];

	/* 締処理為替評価替レコードの集計処理ロック用のカーソル */
	cur_ac_pay CURSOR
	FOR
		SELECT	t.data_no
		FROM	mbt_ac_pay t
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.jnl_fin_cnt = 0
		AND	t.pay_act_no = c_null_val /* 締処理為替評価替 */
		ORDER BY t.data_no
		FOR UPDATE NOWAIT
	;

	x RECORD;
	y RECORD;
	y1 RECORD;

BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0001', c_proc_nm);

	/* ロック後に追加されたレコードは取込対象外にする */
	l_max_ts := NULL;
	BEGIN
		FOR y IN (
			SELECT	t.ins_ts
			FROM	mst_pay_act_if t
			WHERE	0=0
			AND	t.ac_ym = i_ym
			AND	t.ac_dt >= i_dt_fr
			AND	t.ac_dt < i_dt_to + '1 days'::INTERVAL
			AND	(t.a_imp_flg = c_off OR i_rerun = c_on)
			AND	EXISTS (
					SELECT	'X'
					FROM	mam_slip_jnl w
					WHERE	0=0
					AND	w.ac_slip_typ = t.ac_slip_typ
					AND	w.del_flg = c_off
					)
			ORDER BY t.ins_ts DESC, t.pay_act_if_no
			FOR UPDATE NOWAIT
			)
		LOOP
			l_max_ts := y.ins_ts;
			EXIT;
		END LOOP;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MBBBD0003');
	END ;

	IF i_rerun = c_on THEN
		/* 再取込チェック */
		SELECT	MAX(t.jnl_fin_cnt)
		INTO	STRICT l_cnt
		FROM	mbt_ac_pay t
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
		;

		IF l_cnt > 0 THEN
			/* 対象の支払データで仕訳済みのレコードがあるため再取込できません。 */
			CALL fcpa_err$raise_app_err('MBBBD0037');
		ELSE
			DELETE	FROM mbt_ac_pay t
			WHERE	0=0
			AND	t.ac_ym = i_ym
			AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
			;
		END IF;

		UPDATE	mst_pay_act_if t
		SET	a_imp_flg = c_off
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt >= i_dt_fr
		AND	t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND	t.a_imp_flg = c_on
		AND	t.ins_ts <= l_max_ts
		;
	END IF;

	UPDATE	mst_pay_act_if t
	SET	a_imp_flg = c_on
	WHERE	0=0
	AND	t.ac_ym = i_ym
	AND	t.pay_act_no != c_null_val /* 締処理為替評価替レコードは対象外 */
	AND	t.ac_dt >= i_dt_fr
	AND	t.ac_dt < i_dt_to + '1 days'::INTERVAL
	AND	t.a_imp_flg = c_off
	AND	t.ins_ts <= l_max_ts
	AND	EXISTS (
			SELECT	'X'
			FROM	mam_slip_jnl w
			WHERE	0=0
			AND	w.ac_slip_typ = t.ac_slip_typ
			AND	w.red_input_flg = c_off
			AND	w.del_flg = c_off
			)
	AND EXISTS (
			SELECT
				'X'
			FROM	mst_pay_act_if w
			WHERE	0=0
			AND	w.pay_act_no = t.pay_act_no
			AND	w.pay_act_rev = t.pay_act_rev
			AND	w.ac_slip_typ = t.ac_slip_typ
			AND	w.ac_ym = i_ym
			AND	w.ac_dt >= i_dt_fr
			AND	w.ac_dt < i_dt_to + '1 days'::INTERVAL
			AND	w.a_imp_flg = c_off
			AND	w.ins_ts <= l_max_ts
			GROUP BY w.pay_act_no, w.pay_act_rev, w.ac_slip_typ
			HAVING	SUM(CASE w.can_flg WHEN c_off THEN 1 ELSE 0 END)
				= SUM(CASE w.can_flg WHEN c_on THEN 1 ELSE 0 END)
			)
	;

	i := 0;
	d1 := 0;
	l_rec_cnt := 0;
	l_chk_err := c_off;
	l_tmp_dt := NULL;
	l_dpt_cache := '{}';
	l_tax_cache := '{}';

	/* 会計理由マスタの取得 */
	SELECT array_agg(m.ac_rsn_cd) INTO l_ac_rsn_rec
	FROM mam_ac_rsn m
	WHERE 0=0
	AND m.ac_invalid_flg = c_on
	AND m.del_flg = c_off;

	FOR x IN (
		SELECT	t.pay_act_if_no,
			t.wg_cd,
			t.ac_ym,
			t.pay_act_no,
			t.pay_act_seq,
			t.pay_act_rev,
			COALESCE(t.pay_act_d_no, c_null_val) pay_act_d_no,
			COALESCE(t.pay_act_d_seq, 1) pay_act_d_seq,
			DATE_TRUNC('DAY', t.ac_dt) ac_dt,
			t.can_flg,
			t.ac_slip_typ,
			t.ac_rsn_cd,
			t.pay_dpt_cd,
			t.bsppl_dpt_cd,
			t.ap_dpt_cd,
			t.so_dpt_cd,
			t.sub_dpt_cd1,
			t.sub_dpt_cd2,
			t.sub_dpt_cd3,
			t.psppl_cd,
			t.bsppl_cd,
			t.asppl_cd,
			t.setoff_cd,
			t.setoff_nm,
			t.foreign_flg,
			t.base_cur_cd,
			t.base_cur_amt,
			t.base_cur_tax_amt,
			t.trd_cur_cd,
			t.trd_cur_amt,
			t.trd_cur_tax_amt,
			t.tax_cd,
			t.xrate_cd,
			t.xrate,
			t.rcv_bill_no,
			t.pay_chk_no,
			t.usr_cd,
			t.iv_no,
			t.wrk_no,
			t.bank_ac_cd,
			t.pay_bank_ac_cd,
			t.note_no,
			t.trd_rmrks,
			t.trd_d_rmrks,
			t.sub_char1,
			t.sub_char2,
			t.sub_char3,
			t.sub_char4,
			t.sub_char5,
			t.sub_char6,
			t.sub_char7,
			t.sub_char8,
			t.sub_char9,
			t.sub_char10,
			t.sub_num1,
			t.sub_num2,
			t.sub_num3,
			t.sub_dt1,
			t.sub_dt2,
			t.sub_dt3
		FROM	mst_pay_act_if t
			INNER JOIN mam_slip_jnl m1 ON (m1.ac_slip_typ = t.ac_slip_typ AND m1.del_flg = c_off)
		WHERE	0=0
		AND	t.ac_ym	= i_ym
		AND	t.ac_dt >= i_dt_fr
		AND	t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND	t.a_imp_flg = c_off
		AND	t.ins_ts <= l_max_ts
		ORDER BY t.ac_dt, t.ac_slip_typ, t.pay_act_if_no
		)
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			IF x.base_cur_amt = 0 AND x.base_cur_tax_amt = 0
			AND x.trd_cur_amt = 0 AND x.trd_cur_tax_amt = 0 THEN
				UPDATE	mst_pay_act_if t
				SET	a_imp_flg = c_on
				WHERE	0=0
				AND	t.pay_act_if_no = x.pay_act_if_no
				AND	t.a_imp_flg = c_off
				;

				EXIT NEXT_LOOP ;
			END IF ;

			IF x.ac_rsn_cd IS NOT NULL THEN
				FOR i IN 1..COALESCE(array_length(l_ac_rsn_rec, 1), 0) LOOP
					IF l_ac_rsn_rec[i] = x.ac_rsn_cd THEN
						EXIT NEXT_LOOP ;
					END IF;
				END LOOP;
			END IF ;

			IF l_tmp_dt IS NULL OR l_tmp_dt <> x.ac_dt THEN
				l_dpt_cache := '{}';
				l_tax_cache := '{}';
				l_tmp_dt := x.ac_dt ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.pay_dpt_cd, x.ac_dt, l_pay_dpt, l_dpt_cache) ;
			IF x.pay_dpt_cd IS NOT NULL AND l_pay_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.bsppl_dpt_cd, x.ac_dt, l_bsppl_dpt, l_dpt_cache) ;
			IF x.bsppl_dpt_cd IS NOT NULL AND l_bsppl_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.ap_dpt_cd, x.ac_dt, l_ap_dpt, l_dpt_cache) ;
			IF x.ap_dpt_cd IS NOT NULL AND l_ap_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.so_dpt_cd, x.ac_dt, l_so_dpt, l_dpt_cache) ;
			IF x.so_dpt_cd IS NOT NULL AND l_so_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd1, x.ac_dt, l_sub_dpt1, l_dpt_cache) ;
			IF x.sub_dpt_cd1 IS NOT NULL AND l_sub_dpt1 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd2, x.ac_dt, l_sub_dpt2, l_dpt_cache) ;
			IF x.sub_dpt_cd2 IS NOT NULL AND l_sub_dpt2 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd3, x.ac_dt, l_sub_dpt3, l_dpt_cache) ;
			IF x.sub_dpt_cd3 IS NOT NULL AND l_sub_dpt3 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			IF l_tmp_slip IS NULL OR l_tmp_slip <> x.ac_slip_typ THEN
				l_tax_cache := '{}';
				l_tmp_slip := x.ac_slip_typ ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_tax(x.ac_slip_typ, x.tax_cd, x.ac_dt, i_tmap, l_tax_cd, l_tax_cache) ;
			IF x.tax_cd IS NOT NULL AND l_tax_cd IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			i := COALESCE(array_length(l_recs, 1), 0) + 1;
			l_rec := NULL;

			l_rec.data_no := LPAD(mapa_num$f_get_seq(c_ac_pay_seq)::VARCHAR, c_it_dat_no_l, '0') ;
			l_rec.wg_cd		:= x.wg_cd ;
			l_rec.ac_ym		:= x.ac_ym ;
			l_rec.pay_act_no	:= x.pay_act_no ;
			l_rec.pay_act_seq	:= x.pay_act_seq ;
			l_rec.pay_act_rev	:= x.pay_act_rev ;
			l_rec.pay_act_d_no	:= x.pay_act_d_no ;
			l_rec.pay_act_d_seq	:= x.pay_act_d_seq ;
			l_rec.ac_dt		:= x.ac_dt ;
			l_rec.can_flg		:= x.can_flg ;
			l_rec.ac_slip_typ	:= x.ac_slip_typ ;
			l_rec.ac_rsn_cd	:= x.ac_rsn_cd ;
			l_rec.pay_dpt_cd	:= l_pay_dpt ;
			l_rec.bsppl_dpt_cd	:= l_bsppl_dpt ;
			l_rec.ap_dpt_cd	:= l_ap_dpt ;
			l_rec.so_dpt_cd	:= l_so_dpt ;
			l_rec.sub_dpt_cd1	:= l_sub_dpt1 ;
			l_rec.sub_dpt_cd2	:= l_sub_dpt2 ;
			l_rec.sub_dpt_cd3	:= l_sub_dpt3 ;
			l_rec.psppl_cd		:= x.psppl_cd ;
			l_rec.bsppl_cd		:= x.bsppl_cd ;
			l_rec.asppl_cd		:= x.asppl_cd ;
			l_rec.setoff_cd	:= x.setoff_cd ;
			l_rec.setoff_nm	:= x.setoff_nm ;
			l_rec.foreign_flg	:= x.foreign_flg ;
			l_rec.base_cur_cd	:= x.base_cur_cd ;
			l_rec.base_cur_amt	:= x.base_cur_amt ;
			l_rec.base_cur_tax_amt	:= x.base_cur_tax_amt ;
			l_rec.trd_cur_cd	:= x.trd_cur_cd ;
			l_rec.trd_cur_amt	:= x.trd_cur_amt ;
			l_rec.trd_cur_tax_amt	:= x.trd_cur_tax_amt ;
			l_rec.tax_cd		:= l_tax_cd ;
			l_rec.xrate_cd		:= x.xrate_cd ;
			l_rec.xrate		:= x.xrate ;
			l_rec.rcv_bill_no	:= x.rcv_bill_no ;
			l_rec.pay_chk_no	:= x.pay_chk_no ;
			l_rec.usr_cd		:= x.usr_cd ;
			l_rec.iv_no		:= x.iv_no ;
			l_rec.wrk_no		:= x.wrk_no ;
			l_rec.bank_ac_cd	:= x.bank_ac_cd ;
			l_rec.pay_bank_ac_cd	:= x.pay_bank_ac_cd ;
			l_rec.note_no		:= x.note_no ;
			l_rec.trd_rmrks	:= x.trd_rmrks ;
			l_rec.trd_d_rmrks	:= x.trd_d_rmrks ;
			l_rec.sub_char1	:= x.sub_char1 ;
			l_rec.sub_char2	:= x.sub_char2 ;
			l_rec.sub_char3	:= x.sub_char3 ;
			l_rec.sub_char4	:= x.sub_char4 ;
			l_rec.sub_char5	:= x.sub_char5 ;
			l_rec.sub_char6	:= x.sub_char6 ;
			l_rec.sub_char7	:= x.sub_char7 ;
			l_rec.sub_char8	:= x.sub_char8 ;
			l_rec.sub_char9	:= x.sub_char9 ;
			l_rec.sub_char10	:= x.sub_char10 ;
			l_rec.sub_num1		:= x.sub_num1 ;
			l_rec.sub_num2		:= x.sub_num2 ;
			l_rec.sub_num3		:= x.sub_num3 ;
			l_rec.sub_dt1		:= x.sub_dt1 ;
			l_rec.sub_dt2		:= x.sub_dt2 ;
			l_rec.sub_dt3		:= x.sub_dt3 ;
			l_rec.jnl_fin_cnt	:= 0 ;

			/* 共通処理（仕訳キー）*/
			FOR j IN 1..10 LOOP
				CASE j
					WHEN 1 THEN
						l_jnl_key_col_typ := c_jnl_key1 ;
					WHEN 2 THEN
						l_jnl_key_col_typ := c_jnl_key2 ;
					WHEN 3 THEN
						l_jnl_key_col_typ := c_jnl_key3 ;
					WHEN 4 THEN
						l_jnl_key_col_typ := c_jnl_key4 ;
					WHEN 5 THEN
						l_jnl_key_col_typ := c_jnl_key5 ;
					WHEN 6 THEN
						l_jnl_key_col_typ := c_jnl_key6 ;
					WHEN 7 THEN
						l_jnl_key_col_typ := c_jnl_key7 ;
					WHEN 8 THEN
						l_jnl_key_col_typ := c_jnl_key8 ;
					WHEN 9 THEN
						l_jnl_key_col_typ := c_jnl_key9 ;
					WHEN 10 THEN
						l_jnl_key_col_typ := c_jnl_key10 ;
				END CASE ;
	
				/* 仕訳キー対応マスタのレコードを取得 */
				CALL mbpa_imp_ac$p_get_jnl_key_map(l_rec.ac_slip_typ, l_jnl_key_col_typ, l_jnl_key_map) ;

				IF l_jnl_key_map.jnl_key_set_col_typ IS NULL THEN
					CONTINUE ;
				END IF ;
	
				/* 取引先を専用レコードへ格納 */
				/* (1:acst, 2:cst, 3:psppl, 4:bsppl, 5:asppl, 6:sppl, 7:inv_com, 8:rcst, 9:setoff) */
				l_bp_rec := '{}';
				l_bp_rec[3] := l_rec.psppl_cd;
				l_bp_rec[4] := l_rec.bsppl_cd;
				l_bp_rec[5] := l_rec.asppl_cd;
				l_bp_rec[9] := l_rec.setoff_cd;
	
				/* 仕訳キー設定項目に対応するカラムの値を取得 */
				CASE l_jnl_key_map.jnl_key_set_col_typ
					WHEN c_wg_cd THEN
						l_jnl_key_set_val := l_rec.wg_cd ;
						l_not_null_flg := c_on ;
					WHEN c_pay_dpt_cd THEN
						l_jnl_key_set_val := l_rec.pay_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_bsppl_dpt_cd THEN
						l_jnl_key_set_val := l_rec.bsppl_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_ap_dpt_cd THEN
						l_jnl_key_set_val := l_rec.ap_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_so_dpt_cd THEN
						l_jnl_key_set_val := l_rec.so_dpt_cd ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd1 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd1 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd2 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd2 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_dpt_cd3 THEN
						l_jnl_key_set_val := l_rec.sub_dpt_cd3 ;
						l_not_null_flg := c_off ;
					WHEN c_psppl_cd THEN
						l_jnl_key_set_val := l_rec.psppl_cd ;
						l_not_null_flg := c_off ;
					WHEN c_bsppl_cd THEN
						l_jnl_key_set_val := l_rec.bsppl_cd ;
						l_not_null_flg := c_off ;
					WHEN c_asppl_cd THEN
						l_jnl_key_set_val := l_rec.asppl_cd ;
						l_not_null_flg := c_off ;
					WHEN c_setoff_cd THEN
						l_jnl_key_set_val := l_rec.setoff_cd ;
						l_not_null_flg := c_off ;
					WHEN c_tax_cd THEN
						l_jnl_key_set_val := l_rec.tax_cd ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd1 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd1, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd2 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd2, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd3 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd3, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd4 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd4, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd5 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd5, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd6 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd6, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd7 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd7, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd8 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd8, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd9 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd9, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_bp_grp_cd10 THEN
						CALL mbpa_imp_ac$p_get_bp_grp(l_bp_rec, l_jnl_key_map, c_bp_grp_cd10, l_jnl_key_set_val) ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char1 THEN
						l_jnl_key_set_val := l_rec.sub_char1 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char2 THEN
						l_jnl_key_set_val := l_rec.sub_char2 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char3 THEN
						l_jnl_key_set_val := l_rec.sub_char3 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char4 THEN
						l_jnl_key_set_val := l_rec.sub_char4 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char5 THEN
						l_jnl_key_set_val := l_rec.sub_char5 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char6 THEN
						l_jnl_key_set_val := l_rec.sub_char6 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char7 THEN
						l_jnl_key_set_val := l_rec.sub_char7 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char8 THEN
						l_jnl_key_set_val := l_rec.sub_char8 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char9 THEN
						l_jnl_key_set_val := l_rec.sub_char9 ;
						l_not_null_flg := c_off ;
					WHEN c_sub_char10 THEN
						l_jnl_key_set_val := l_rec.sub_char10 ;
						l_not_null_flg := c_off ;
					ELSE
						l_jnl_key_set_val := NULL ;
						l_not_null_flg := c_off ;
				END CASE ;
	
				/* NULL可項目がNULLの場合、NULL不可項目がNULL文字の場合 */
				IF (l_jnl_key_set_val IS NULL AND l_not_null_flg = c_off)
					OR (l_jnl_key_set_val = c_null_val AND l_not_null_flg = c_on) THEN
					l_jnl_key_set_val := l_jnl_key_map.default_cd ;
				END IF ;
	
				CASE l_jnl_key_col_typ
					WHEN c_jnl_key1 THEN
						l_rec.jnl_key1 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key2 THEN
						l_rec.jnl_key2 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key3 THEN
						l_rec.jnl_key3 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key4 THEN
						l_rec.jnl_key4 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key5 THEN
						l_rec.jnl_key5 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key6 THEN
						l_rec.jnl_key6 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key7 THEN
						l_rec.jnl_key7 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key8 THEN
						l_rec.jnl_key8 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key9 THEN
						l_rec.jnl_key9 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
					WHEN c_jnl_key10 THEN
						l_rec.jnl_key10 := SUBSTR(l_jnl_key_set_val, 1, 20) ;
				END CASE ;
			END LOOP ;

			l_recs[i] := l_rec;

			d1 := COALESCE(array_length(l_recs_id, 1), 0) + 1;
			l_rec_id.pay_act_if_no := x.pay_act_if_no;
			l_recs_id[d1] := l_rec_id;

			l_rec_cnt := l_rec_cnt + 1;

			IF i > c_max_cnt THEN
				CALL mbpa_imp_ac$ins_pay(l_recs, l_recs_id);
			END IF ;

		END;

	END LOOP;

	CALL mbpa_imp_ac$ins_pay(l_recs, l_recs_id);

	<<SKIP_SUM>>
	BEGIN
		IF l_rec_cnt = 0 THEN
			EXIT SKIP_SUM;
		END IF;

		/* 締処理為替評価替レコードの集計処理 */
		BEGIN
			FOR x IN cur_ac_pay LOOP EXIT;
			END LOOP ;
		EXCEPTION
			WHEN lock_not_available THEN
				CALL fcpa_err$raise_app_err('MBBBD0003');
		END ;

		FOR y1 IN (
			SELECT	MAX(t.data_no) data_no,
				t.wg_cd,
				CASE t.ac_slip_typ
					WHEN c_ap_ex_loss_rev THEN c_ap_ex_gain_rev
					WHEN c_ae_ex_loss_rev THEN c_ae_ex_gain_rev
					ELSE t.ac_slip_typ
				END ac_slip_typ,
				t.ac_rsn_cd,
				t.pay_dpt_cd,
				t.bsppl_dpt_cd,
				t.ap_dpt_cd,
				t.so_dpt_cd,
				t.sub_dpt_cd1,
				t.sub_dpt_cd2,
				t.sub_dpt_cd3,
				t.psppl_cd,
				t.bsppl_cd,
				t.asppl_cd,
				t.setoff_cd,
				t.setoff_nm,
				t.foreign_flg,
				t.base_cur_cd,
				t.trd_cur_cd,
				t.tax_cd,
				t.xrate_cd,
				t.rcv_bill_no,
				t.pay_chk_no,
				t.usr_cd,
				t.iv_no,
				t.wrk_no,
				t.bank_ac_cd,
				t.pay_bank_ac_cd,
				t.note_no,
				t.jnl_key1,
				t.jnl_key2,
				t.jnl_key3,
				t.jnl_key4,
				t.jnl_key5,
				t.jnl_key6,
				t.jnl_key7,
				t.jnl_key8,
				t.jnl_key9,
				t.jnl_key10,
				t.trd_rmrks,
				t.trd_d_rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3,
				t.sub_char4,
				t.sub_char5,
				t.sub_char6,
				t.sub_char7,
				t.sub_char8,
				t.sub_char9,
				t.sub_char10,
				t.sub_num1,
				t.sub_num2,
				t.sub_num3,
				t.sub_dt1,
				t.sub_dt2,
				t.sub_dt3,
				SUM(t.base_cur_amt) base_cur_amt,
				SUM(t.base_cur_tax_amt) base_cur_tax_amt,
				SUM(t.trd_cur_amt) trd_cur_amt,
				SUM(t.trd_cur_tax_amt) trd_cur_tax_amt
			FROM	mbt_ac_pay t
			WHERE	0=0
			AND	t.ac_ym = i_ym
			AND	t.jnl_fin_cnt = 0
			AND	t.pay_act_no = c_null_val /* 締処理為替評価替 */
			GROUP BY t.wg_cd,
				CASE t.ac_slip_typ WHEN c_ap_ex_loss_rev THEN c_ap_ex_gain_rev WHEN c_ae_ex_loss_rev THEN c_ae_ex_gain_rev ELSE t.ac_slip_typ END,
				t.ac_rsn_cd,
				t.pay_dpt_cd, t.bsppl_dpt_cd, t.ap_dpt_cd, t.so_dpt_cd,
				t.sub_dpt_cd1, t.sub_dpt_cd2, t.sub_dpt_cd3,
				t.psppl_cd, t.bsppl_cd, t.asppl_cd, t.setoff_cd, t.setoff_nm, t.foreign_flg,
				t.base_cur_cd, t.trd_cur_cd, t.tax_cd,
				t.xrate_cd,
				t.rcv_bill_no, t.pay_chk_no, t.usr_cd, t.iv_no, t.wrk_no,
				t.bank_ac_cd, t.pay_bank_ac_cd, t.note_no,
				t.jnl_key1, t.jnl_key2, t.jnl_key3, t.jnl_key4, t.jnl_key5,
				t.jnl_key6, t.jnl_key7, t.jnl_key8, t.jnl_key9, t.jnl_key10,
				t.trd_rmrks, t.trd_d_rmrks,
				t.sub_char1, t.sub_char2, t.sub_char3, t.sub_char4, t.sub_char5,
				t.sub_char6, t.sub_char7, t.sub_char8, t.sub_char9, t.sub_char10,
				t.sub_num1, t.sub_num2, t.sub_num3,
				t.sub_dt1, t.sub_dt2, t.sub_dt3
			)
		LOOP
			UPDATE	mbt_ac_pay t
			SET	base_cur_amt = y1.base_cur_amt,
				base_cur_tax_amt = y1.base_cur_tax_amt,
				trd_cur_amt = y1.trd_cur_amt,
				trd_cur_tax_amt = y1.trd_cur_tax_amt
			WHERE	0=0
			AND	t.data_no = y1.data_no
			AND	(0 = 1
				OR t.base_cur_amt != y1.base_cur_amt
				OR t.base_cur_tax_amt != y1.base_cur_tax_amt
				OR t.trd_cur_amt != y1.trd_cur_amt
				OR t.trd_cur_tax_amt != y1.trd_cur_tax_amt
				)
			;

			DELETE	FROM mbt_ac_pay t
			WHERE	0=0
			AND	t.data_no <> y1.data_no
			AND	t.ac_ym = i_ym
			AND	t.jnl_fin_cnt = 0
			AND t.pay_act_no = c_null_val /* 締処理為替評価替 */
			AND t.wg_cd = y1.wg_cd
			AND CASE t.ac_slip_typ
					WHEN c_ap_ex_loss_rev THEN c_ap_ex_gain_rev
					WHEN c_ae_ex_loss_rev THEN c_ae_ex_gain_rev
					ELSE t.ac_slip_typ
				END = y1.ac_slip_typ
			AND (t.ac_rsn_cd = y1.ac_rsn_cd OR t.ac_rsn_cd IS NULL AND y1.ac_rsn_cd IS NULL)
			AND (t.pay_dpt_cd = y1.pay_dpt_cd OR t.pay_dpt_cd IS NULL AND y1.pay_dpt_cd IS NULL)
			AND (t.bsppl_dpt_cd = y1.bsppl_dpt_cd OR t.bsppl_dpt_cd IS NULL AND y1.bsppl_dpt_cd IS NULL)
			AND (t.ap_dpt_cd = y1.ap_dpt_cd OR t.ap_dpt_cd IS NULL AND y1.ap_dpt_cd IS NULL)
			AND (t.so_dpt_cd = y1.so_dpt_cd OR t.so_dpt_cd IS NULL AND y1.so_dpt_cd IS NULL)
			AND (t.sub_dpt_cd1 = y1.sub_dpt_cd1 OR t.sub_dpt_cd1 IS NULL AND y1.sub_dpt_cd1 IS NULL)
			AND (t.sub_dpt_cd2 = y1.sub_dpt_cd2 OR t.sub_dpt_cd2 IS NULL AND y1.sub_dpt_cd2 IS NULL)
			AND (t.sub_dpt_cd3 = y1.sub_dpt_cd3 OR t.sub_dpt_cd3 IS NULL AND y1.sub_dpt_cd3 IS NULL)
			AND (t.psppl_cd = y1.psppl_cd OR t.psppl_cd IS NULL AND y1.psppl_cd IS NULL)
			AND (t.bsppl_cd = y1.bsppl_cd OR t.bsppl_cd IS NULL AND y1.bsppl_cd IS NULL)
			AND (t.asppl_cd = y1.asppl_cd OR t.asppl_cd IS NULL AND y1.asppl_cd IS NULL)
			AND (t.setoff_cd = y1.setoff_cd OR t.setoff_cd IS NULL AND y1.setoff_cd IS NULL)
			AND (t.setoff_nm = y1.setoff_nm OR t.setoff_nm IS NULL AND y1.setoff_nm IS NULL)
			AND t.foreign_flg = y1.foreign_flg
			AND t.base_cur_cd = y1.base_cur_cd
			AND t.trd_cur_cd = y1.trd_cur_cd
			AND (t.tax_cd = y1.tax_cd OR t.tax_cd IS NULL AND y1.tax_cd IS NULL)
			AND (t.xrate_cd = y1.xrate_cd OR t.xrate_cd IS NULL AND y1.xrate_cd IS NULL)
			AND (t.rcv_bill_no = y1.rcv_bill_no OR t.rcv_bill_no IS NULL AND y1.rcv_bill_no IS NULL)
			AND (t.pay_chk_no = y1.pay_chk_no OR t.pay_chk_no IS NULL AND y1.pay_chk_no IS NULL)
			AND (t.usr_cd = y1.usr_cd OR t.usr_cd IS NULL AND y1.usr_cd IS NULL)
			AND (t.iv_no = y1.iv_no OR t.iv_no IS NULL AND y1.iv_no IS NULL)
			AND (t.wrk_no = y1.wrk_no OR t.wrk_no IS NULL AND y1.wrk_no IS NULL)
			AND (t.bank_ac_cd = y1.bank_ac_cd OR t.bank_ac_cd IS NULL AND y1.bank_ac_cd IS NULL)
			AND (t.pay_bank_ac_cd = y1.pay_bank_ac_cd OR t.pay_bank_ac_cd IS NULL AND y1.pay_bank_ac_cd IS NULL)
			AND (t.note_no = y1.note_no OR t.note_no IS NULL AND y1.note_no IS NULL)
			AND (t.jnl_key1 = y1.jnl_key1 OR t.jnl_key1 IS NULL AND y1.jnl_key1 IS NULL)
			AND (t.jnl_key2 = y1.jnl_key2 OR t.jnl_key2 IS NULL AND y1.jnl_key2 IS NULL)
			AND (t.jnl_key3 = y1.jnl_key3 OR t.jnl_key3 IS NULL AND y1.jnl_key3 IS NULL)
			AND (t.jnl_key4 = y1.jnl_key4 OR t.jnl_key4 IS NULL AND y1.jnl_key4 IS NULL)
			AND (t.jnl_key5 = y1.jnl_key5 OR t.jnl_key5 IS NULL AND y1.jnl_key5 IS NULL)
			AND (t.jnl_key6 = y1.jnl_key6 OR t.jnl_key6 IS NULL AND y1.jnl_key6 IS NULL)
			AND (t.jnl_key7 = y1.jnl_key7 OR t.jnl_key7 IS NULL AND y1.jnl_key7 IS NULL)
			AND (t.jnl_key8 = y1.jnl_key8 OR t.jnl_key8 IS NULL AND y1.jnl_key8 IS NULL)
			AND (t.jnl_key9 = y1.jnl_key9 OR t.jnl_key9 IS NULL AND y1.jnl_key9 IS NULL)
			AND (t.jnl_key10 = y1.jnl_key10 OR t.jnl_key10 IS NULL AND y1.jnl_key10 IS NULL)
			AND (t.trd_rmrks = y1.trd_rmrks OR t.trd_rmrks IS NULL AND y1.trd_rmrks IS NULL)
			AND (t.trd_d_rmrks = y1.trd_d_rmrks OR t.trd_d_rmrks IS NULL AND y1.trd_d_rmrks IS NULL)
			AND (t.sub_char1 = y1.sub_char1 OR t.sub_char1 IS NULL AND y1.sub_char1 IS NULL)
			AND (t.sub_char2 = y1.sub_char2 OR t.sub_char2 IS NULL AND y1.sub_char2 IS NULL)
			AND (t.sub_char3 = y1.sub_char3 OR t.sub_char3 IS NULL AND y1.sub_char3 IS NULL)
			AND (t.sub_char4 = y1.sub_char4 OR t.sub_char4 IS NULL AND y1.sub_char4 IS NULL)
			AND (t.sub_char5 = y1.sub_char5 OR t.sub_char5 IS NULL AND y1.sub_char5 IS NULL)
			AND (t.sub_char6 = y1.sub_char6 OR t.sub_char6 IS NULL AND y1.sub_char6 IS NULL)
			AND (t.sub_char7 = y1.sub_char7 OR t.sub_char7 IS NULL AND y1.sub_char7 IS NULL)
			AND (t.sub_char8 = y1.sub_char8 OR t.sub_char8 IS NULL AND y1.sub_char8 IS NULL)
			AND (t.sub_char9 = y1.sub_char9 OR t.sub_char9 IS NULL AND y1.sub_char9 IS NULL)
			AND (t.sub_char10 = y1.sub_char10 OR t.sub_char10 IS NULL AND y1.sub_char10 IS NULL)
			AND (t.sub_num1 = y1.sub_num1 OR t.sub_num1 IS NULL AND y1.sub_num1 IS NULL)
			AND (t.sub_num2 = y1.sub_num2 OR t.sub_num2 IS NULL AND y1.sub_num2 IS NULL)
			AND (t.sub_num3 = y1.sub_num3 OR t.sub_num3 IS NULL AND y1.sub_num3 IS NULL)
			AND (t.sub_dt1 = y1.sub_dt1 OR t.sub_dt1 IS NULL AND y1.sub_dt1 IS NULL)
			AND (t.sub_dt2 = y1.sub_dt2 OR t.sub_dt2 IS NULL AND y1.sub_dt2 IS NULL)
			AND (t.sub_dt3 = y1.sub_dt3 OR t.sub_dt3 IS NULL AND y1.sub_dt3 IS NULL)
			;

			GET DIAGNOSTICS l_rowcount = ROW_COUNT;
			l_rec_cnt := l_rec_cnt - l_rowcount;

			DELETE FROM mbt_ac_pay t
			WHERE 0=0
			AND t.data_no = y1.data_no
			AND t.base_cur_amt = 0
			AND t.base_cur_tax_amt = 0
			AND t.trd_cur_amt = 0
			AND t.trd_cur_tax_amt = 0;

			GET DIAGNOSTICS l_rowcount = ROW_COUNT;
			l_rec_cnt := l_rec_cnt - l_rowcount;

		END LOOP;

		UPDATE	mbt_ac_pay t
		SET	ac_slip_typ = c_ap_ex_loss_rev
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.jnl_fin_cnt = 0
		AND	t.pay_act_no = c_null_val
		AND	t.ac_slip_typ = c_ap_ex_gain_rev
		AND	t.base_cur_amt < 0
		;

		UPDATE	mbt_ac_pay t
		SET	ac_slip_typ = c_ap_ex_gain_rev
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.jnl_fin_cnt = 0
		AND	t.pay_act_no = c_null_val
		AND	t.ac_slip_typ = c_ap_ex_loss_rev
		AND	t.base_cur_amt > 0
		;

		UPDATE	mbt_ac_pay t
		SET	ac_slip_typ = c_ae_ex_loss_rev
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.jnl_fin_cnt = 0
		AND	t.pay_act_no = c_null_val
		AND	t.ac_slip_typ = c_ae_ex_gain_rev
		AND	t.base_cur_amt < 0
		;

		UPDATE	mbt_ac_pay t
		SET	ac_slip_typ = c_ae_ex_gain_rev
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.jnl_fin_cnt = 0
		AND	t.pay_act_no = c_null_val
		AND	t.ac_slip_typ = c_ae_ex_loss_rev
		AND	t.base_cur_amt > 0
		;
	END;

	/* 処理が終了しました。{1} データ取込件数 : {2} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0026', c_proc_nm, l_rec_cnt::VARCHAR);

	COMMIT ;

	IF l_chk_err = c_on THEN
		CALL mbpa_imp_ac$p_raise_err();
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$ins_schd_pay(
	INOUT o_recs mbt_ac_schd_pay[],
	INOUT o_recs_id mst_pay_schd_if[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	支払依頼情報取込処理のサブプログラム
<REMARKS>

<ARGUMENTS>
<IN>	o_recs
		登録対象データ
<IN>	o_recs_id
		更新対象データ（主キー）
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
BEGIN
	IF COALESCE(array_length(o_recs, 1), 0) > 0 THEN
		INSERT INTO mbt_ac_schd_pay SELECT * FROM UNNEST(o_recs) ;

		UPDATE	mst_pay_schd_if t
		SET	a_imp_flg = c_on
		FROM	UNNEST(o_recs_id) w
		WHERE	0=0
		AND	t.pay_schd_if_no = w.pay_schd_if_no
		AND	t.a_imp_flg = c_off
		;
	END IF;

	o_recs := '{}';
	o_recs_id := '{}';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_schdpay (
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_rerun CHARACTER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	支払依頼情報取込処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym
		取込対象月
<IN>	i_dt_fr
		対象期間(FROM)
<IN>	i_dt_to
		対象期間(TO)
<IN>	i_rerun
		再取込ＦＬＧ
<HISTORY>
**************************************************************************/
DECLARE
	c_max_cnt CONSTANT INTEGER := 50 ; /* バルクインサートでの最大レコード数 */
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_proc_nm CONSTANT VARCHAR := 'MBPA_IMP_AC.P_SCHDPAY';

	c_ac_schd_pay_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_SYS_TYP','AC_SCHD_PAY');
	c_it_dat_no_l CONSTANT INTEGER := 15;

	c_setoff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AP_STTL_TYP','SETOFF');
	c_wtax CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AP_STTL_TYP','WTAX');

	c_crud_crt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DATA_CRUD_TYP','CRT');
	c_crud_del CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_DATA_CRUD_TYP','DEL');

	l_rec mbt_ac_schd_pay%ROWTYPE;
	l_recs mbt_ac_schd_pay[];
	i INTEGER;

	l_rec_id mst_pay_schd_if%ROWTYPE;
	l_recs_id mst_pay_schd_if[];
	d1 INTEGER;

	l_cnt NUMERIC;
	l_rec_cnt NUMERIC;
	l_chk_err CHAR(1);
	l_max_ts mst_pay_schd_if.ins_ts%TYPE;

	l_tmp_dt mst_pay_schd_if.ac_dt%TYPE;

	l_pay_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_bsppl_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_ap_dpt mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt1 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt2 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_sub_dpt3 mam_ac_dpt.ac_dpt_cd%TYPE;
	l_dpt_cache mam_dpt[];

	cur_ac_schd_pay CURSOR
	FOR
		SELECT	t.data_no
		FROM	mbt_ac_schd_pay t
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
		ORDER BY t.data_no
		FOR UPDATE NOWAIT
	;

	y RECORD;
	x RECORD;

BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0001', c_proc_nm);

	/* ロック後に追加されたレコードは取込対象外にする */
	l_max_ts := NULL;
	BEGIN
		FOR y IN (
			SELECT t.ins_ts
			FROM mst_pay_schd_if t
			WHERE 0=0
			AND t.ac_ym = i_ym
			AND t.ac_dt BETWEEN i_dt_fr AND i_dt_to
			AND (t.a_imp_flg = c_off OR i_rerun = c_on)
			AND t.ap_sttl_typ IS NOT NULL
			AND t.ap_sttl_typ <> c_setoff
			AND t.ap_sttl_typ <> c_wtax
			ORDER BY t.ins_ts DESC, t.pay_schd_if_no
			FOR UPDATE NOWAIT
			)
		LOOP
			l_max_ts := y.ins_ts;
			EXIT;
		END LOOP;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MBBBD0003');
	END ;

	IF i_rerun = c_on THEN
		/* 再取込チェック */
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mbt_ac_schd_pay t
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
		AND	t.send_flg = c_on
		;

		IF l_cnt > 0 THEN
			/* 対象の支払依頼データで送信済みのレコードがあるため再取込できません。 */
			CALL fcpa_err$raise_app_err('MBBBD0038');
		ELSE
			/* ロック */
			BEGIN
				FOR x IN cur_ac_schd_pay LOOP EXIT;
				END LOOP ;
			EXCEPTION
				WHEN lock_not_available THEN
					CALL fcpa_err$raise_app_err('MBBBD0003');
			END ;

			DELETE FROM	mbt_ac_schd_pay t
			WHERE	0=0
			AND	t.ac_ym = i_ym
			AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
			;
		END IF;

		UPDATE	mst_pay_schd_if t
		SET	a_imp_flg = c_off
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
		AND	t.a_imp_flg = c_on
		AND	t.ins_ts <= l_max_ts
		;
	END IF;

	UPDATE	mst_pay_schd_if t
	SET	a_imp_flg = c_on
	WHERE	0=0
	AND	t.ac_ym = i_ym
	AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
	AND	t.a_imp_flg = c_off
	AND	t.ins_ts <= l_max_ts
	AND	t.ap_sttl_typ IS NOT NULL
	AND	t.ap_sttl_typ <> c_setoff
	AND	t.ap_sttl_typ <> c_wtax
	AND	EXISTS (
			SELECT
				'X'
			FROM	mst_pay_schd_if w
			WHERE	0=0
			AND	w.ap_appl_schd_no = t.ap_appl_schd_no
			AND	w.ac_ym = i_ym
			AND	w.ac_dt BETWEEN i_dt_fr AND i_dt_to
			AND	w.a_imp_flg = c_off
			AND	w.ins_ts <= l_max_ts
			GROUP BY w.ap_appl_schd_no
			HAVING	SUM(CASE w.data_crud_typ WHEN c_crud_crt THEN 1 ELSE 0 END)
				= SUM(CASE w.data_crud_typ WHEN c_crud_del THEN 1 ELSE 0 END)
			)
	;

	i := 0;
	d1 := 0;
	l_rec_cnt := 0;
	l_chk_err := c_off;
	l_tmp_dt := NULL;
	l_dpt_cache := '{}';

	FOR x IN (
		SELECT	t.pay_schd_if_no,
			t.wg_cd,
			t.ac_ym,
			DATE_TRUNC('DAY', t.ac_dt) ac_dt,
			CASE t.data_crud_typ WHEN c_crud_del THEN '1' ELSE '0' END can_flg,
			t.pay_ap_typ,
			t.ap_appl_schd_no,
			t.pay_chk_no,
			t.pay_dpt_cd,
			t.bsppl_dpt_cd,
			t.ap_dpt_cd,
			t.sub_dpt_cd1,
			t.sub_dpt_cd2,
			t.sub_dpt_cd3,
			t.asppl_cd,
			t.bsppl_cd,
			t.psppl_cd,
			t.foreign_flg,
			t.base_cur_cd,
			CASE t.data_crud_typ WHEN c_crud_del THEN (-1) * t.base_cur_amt ELSE t.base_cur_amt END base_cur_amt,
			t.trd_cur_cd,
			CASE t.data_crud_typ WHEN c_crud_del THEN (-1) * t.trd_cur_amt ELSE t.trd_cur_amt END trd_cur_amt,
			t.xrate_cd,
			t.xrate,
			t.pay_spot_flg,
			t.pay_schd_dt,
			t.sttl_cd,
			t.ap_sttl_typ,
			t.ap_typ,
			t.bank_ac_cd,
			t.pay_bank_ac_cd,
			t.drawer_nm,
			t.note_no,
			DATE_TRUNC('DAY', t.due_dt) due_dt,
			DATE_TRUNC('DAY', t.draw_dt) draw_dt,
			t.rcv_bill_no,
			t.usr_cd,
			t.iv_no,
			t.wrk_no,
			t.trd_rmrks,
			t.trd_d_rmrks,
			t.sub_char1,
			t.sub_char2,
			t.sub_char3,
			t.sub_char4,
			t.sub_char5,
			t.sub_char6,
			t.sub_char7,
			t.sub_char8,
			t.sub_char9,
			t.sub_char10,
			t.sub_num1,
			t.sub_num2,
			t.sub_num3,
			t.sub_dt1,
			t.sub_dt2,
			t.sub_dt3
		FROM	mst_pay_schd_if t
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
		AND	t.a_imp_flg = c_off
		AND	t.ins_ts <= l_max_ts
		AND	t.ap_sttl_typ IS NOT NULL
		AND	t.ap_sttl_typ <> c_setoff
		AND	t.ap_sttl_typ <> c_wtax
		ORDER BY t.ac_dt, t.pay_schd_if_no
		)
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			/* 共通処理（金額）*/
			IF x.base_cur_amt = 0 AND x.trd_cur_amt = 0 THEN
				UPDATE	mst_pay_schd_if t
				SET	a_imp_flg = c_on
				WHERE	0=0
				AND	t.pay_schd_if_no = x.pay_schd_if_no
				AND	t.a_imp_flg = c_off
				;

				EXIT NEXT_LOOP ;
			END IF ;

			IF l_tmp_dt IS NULL OR l_tmp_dt <> x.ac_dt THEN
				l_dpt_cache := '{}';
				l_tmp_dt := x.ac_dt ;
			END IF ;

			/* 共通処理（会計部門）*/
			CALL mbpa_imp_ac$p_set_ac_dpt(x.pay_dpt_cd, x.ac_dt, l_pay_dpt, l_dpt_cache) ;
			IF x.pay_dpt_cd IS NOT NULL AND l_pay_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.bsppl_dpt_cd, x.ac_dt, l_bsppl_dpt, l_dpt_cache) ;
			IF x.bsppl_dpt_cd IS NOT NULL AND l_bsppl_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.ap_dpt_cd, x.ac_dt, l_ap_dpt, l_dpt_cache) ;
			IF x.ap_dpt_cd IS NOT NULL AND l_ap_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd1, x.ac_dt, l_sub_dpt1, l_dpt_cache) ;
			IF x.sub_dpt_cd1 IS NOT NULL AND l_sub_dpt1 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd2, x.ac_dt, l_sub_dpt2, l_dpt_cache) ;
			IF x.sub_dpt_cd2 IS NOT NULL AND l_sub_dpt2 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			CALL mbpa_imp_ac$p_set_ac_dpt(x.sub_dpt_cd3, x.ac_dt, l_sub_dpt3, l_dpt_cache) ;
			IF x.sub_dpt_cd3 IS NOT NULL AND l_sub_dpt3 IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			i := COALESCE(array_length(l_recs, 1), 0) + 1;
			l_rec := NULL;

			l_rec.data_no := LPAD(mapa_num$f_get_seq(c_ac_schd_pay_seq)::VARCHAR, c_it_dat_no_l, '0') ;
			l_rec.wg_cd		:= x.wg_cd ;
			l_rec.ac_ym		:= x.ac_ym ;
			l_rec.ac_dt		:= x.ac_dt ;
			l_rec.can_flg		:= x.can_flg ;
			l_rec.pay_ap_typ	:= x.pay_ap_typ ;
			l_rec.ap_appl_schd_no	:= x.ap_appl_schd_no ;
			l_rec.pay_chk_no	:= x.pay_chk_no ;
			l_rec.pay_dpt_cd	:= l_pay_dpt ;
			l_rec.bsppl_dpt_cd	:= l_bsppl_dpt ;
			l_rec.ap_dpt_cd	:= l_ap_dpt ;
			l_rec.sub_dpt_cd1	:= l_sub_dpt1 ;
			l_rec.sub_dpt_cd2	:= l_sub_dpt2 ;
			l_rec.sub_dpt_cd3	:= l_sub_dpt3 ;
			l_rec.asppl_cd		:= x.asppl_cd ;
			l_rec.bsppl_cd		:= x.bsppl_cd ;
			l_rec.psppl_cd		:= x.psppl_cd ;
			l_rec.foreign_flg	:= x.foreign_flg ;
			l_rec.base_cur_cd	:= x.base_cur_cd ;
			l_rec.base_cur_amt	:= x.base_cur_amt ;
			l_rec.trd_cur_cd	:= x.trd_cur_cd ;
			l_rec.trd_cur_amt	:= x.trd_cur_amt ;
			l_rec.xrate_cd		:= x.xrate_cd ;
			l_rec.xrate		:= x.xrate ;
			l_rec.pay_spot_flg	:= x.pay_spot_flg ;
			l_rec.pay_schd_dt	:= x.pay_schd_dt ;
			l_rec.sttl_cd		:= x.sttl_cd ;
			l_rec.ap_sttl_typ	:= x.ap_sttl_typ ;
			l_rec.ap_typ		:= x.ap_typ ;
			l_rec.bank_ac_cd	:= x.bank_ac_cd ;
			l_rec.pay_bank_ac_cd	:= x.pay_bank_ac_cd ;
			l_rec.drawer_nm	:= x.drawer_nm ;
			l_rec.note_no		:= x.note_no ;
			l_rec.due_dt		:= x.due_dt ;
			l_rec.draw_dt		:= x.draw_dt ;
			l_rec.rcv_bill_no	:= x.rcv_bill_no ;
			l_rec.usr_cd		:= x.usr_cd ;
			l_rec.iv_no		:= x.iv_no ;
			l_rec.wrk_no		:= x.wrk_no ;
			l_rec.trd_rmrks	:= x.trd_rmrks ;
			l_rec.trd_d_rmrks	:= x.trd_d_rmrks ;
			l_rec.sub_char1	:= x.sub_char1 ;
			l_rec.sub_char2	:= x.sub_char2 ;
			l_rec.sub_char3	:= x.sub_char3 ;
			l_rec.sub_char4	:= x.sub_char4 ;
			l_rec.sub_char5	:= x.sub_char5 ;
			l_rec.sub_char6	:= x.sub_char6 ;
			l_rec.sub_char7	:= x.sub_char7 ;
			l_rec.sub_char8	:= x.sub_char8 ;
			l_rec.sub_char9	:= x.sub_char9 ;
			l_rec.sub_char10	:= x.sub_char10 ;
			l_rec.sub_num1		:= x.sub_num1 ;
			l_rec.sub_num2		:= x.sub_num2 ;
			l_rec.sub_num3		:= x.sub_num3 ;
			l_rec.sub_dt1		:= x.sub_dt1 ;
			l_rec.sub_dt2		:= x.sub_dt2 ;
			l_rec.sub_dt3		:= x.sub_dt3 ;
			l_rec.send_flg		:= c_off ;
			l_rec.proc_no		:= NULL ;

			l_recs[i] := l_rec;

			d1 := COALESCE(array_length(l_recs_id, 1), 0) + 1 ;
			l_rec_id.pay_schd_if_no := x.pay_schd_if_no;
			l_recs_id[d1] := l_rec_id;
			l_rec_cnt := l_rec_cnt + 1;

			IF i > c_max_cnt THEN
				CALL mbpa_imp_ac$ins_schd_pay(l_recs, l_recs_id);
			END IF ;

		END;

	END LOOP;

	CALL mbpa_imp_ac$ins_schd_pay(l_recs, l_recs_id);

	/* 処理が終了しました。{1} データ取込件数 : {2} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0026', c_proc_nm, l_rec_cnt::VARCHAR);

	COMMIT ;

	IF l_chk_err = c_on THEN
		CALL mbpa_imp_ac$p_raise_err();
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$ins_note(
	INOUT o_recs mbt_ac_note[],
	INOUT o_recs_id mst_note_if[]
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	手形情報取込処理のサブプログラム
<REMARKS>

<ARGUMENTS>
<IN>	o_recs
		登録対象データ
<IN>	o_recs_id
		更新対象データ（主キー）
<HISTORY>
**************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
BEGIN
	IF COALESCE(array_length(o_recs, 1), 0) > 0 THEN
		INSERT INTO mbt_ac_note SELECT * FROM UNNEST(o_recs) ;

		UPDATE	mst_note_if t
		SET	a_imp_flg = c_on
		FROM	UNNEST(o_recs_id) w
		WHERE	0=0
		AND	t.note_if_no = w.note_if_no
		AND	t.a_imp_flg = c_off
		;
	END IF;

	o_recs := '{}';
	o_recs_id := '{}';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_note(
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_fr TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt_to TIMESTAMP WITHOUT TIME ZONE,
	IN i_rerun CHARACTER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	手形情報取込処理
<REMARKS>

<ARGUMENTS>
<IN>	i_ym
		取込対象月
<IN>	i_dt_fr
		対象期間(FROM)
<IN>	i_dt_to
		対象期間(TO)
<IN>	i_rerun
		再取込ＦＬＧ
<HISTORY>
**************************************************************************/
DECLARE
	c_max_cnt CONSTANT INTEGER := 50 ; /* バルクインサートでの最大レコード数 */
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');

	c_proc_nm CONSTANT VARCHAR := 'MBPA_IMP_AC.P_NOTE';

	c_ac_note_seq CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_NUM_SYS_TYP','AC_NOTE');
	c_it_dat_no_l CONSTANT INTEGER := 15;

	l_cnt NUMERIC;
	l_rec_cnt NUMERIC;
	l_chk_err CHAR(1);
	l_max_ts mst_note_if.ins_ts%TYPE;

	l_tmp_dt mst_note_if.ac_dt%TYPE;

	l_dpt mam_ac_dpt.ac_dpt_cd%TYPE;

	l_rec mbt_ac_note%ROWTYPE;
	l_recs mbt_ac_note[];
	i INTEGER;

	l_rec_id mst_note_if%ROWTYPE;
	l_recs_id mst_note_if[];
	d1 INTEGER;
	l_dpt_cache mam_dpt[];
	
	y RECORD;
	x RECORD;
	z1 RECORD;
	z2 RECORD;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0001', c_proc_nm);

	/* ロック後に追加されたレコードは取込対象外にする */
	l_max_ts := NULL;
	BEGIN
		FOR y IN (
			SELECT	t.ins_ts
			FROM	mst_note_if t
			WHERE	0=0
			AND	t.ac_ym = i_ym
			AND	t.ac_dt >= i_dt_fr
			AND	t.ac_dt < i_dt_to + '1 days'::INTERVAL
			AND	(t.a_imp_flg = c_off OR i_rerun = c_on)
			ORDER BY t.ins_ts DESC, note_if_no
			FOR UPDATE NOWAIT
			)
		LOOP
			l_max_ts := y.ins_ts;
			EXIT;
		END LOOP;
	EXCEPTION
		WHEN lock_not_available THEN
			CALL fcpa_err$raise_app_err('MBBBD0003');
	END ;

	IF i_rerun = c_on THEN
		/* 再取込チェック */
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mbt_ac_note t
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to
		AND	t.fin_flg = c_on;

		IF l_cnt > 0 THEN
			/* 対象の手形データで処理済みのレコードがあるため再取込できません。 */
			CALL fcpa_err$raise_app_err('MBBBD0034');
		ELSE
			DELETE FROM mbt_ac_note t
			WHERE	0=0
			AND	t.ac_ym = i_ym
			AND	t.ac_dt BETWEEN i_dt_fr AND i_dt_to;
		END IF;

		UPDATE	mst_note_if t
		SET	a_imp_flg = c_off
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt >= i_dt_fr
		AND	t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND	t.a_imp_flg = c_on
		AND	t.ins_ts <= l_max_ts
		;

	END IF;

	FOR z1 IN (
		SELECT	t.*
		FROM	mst_note_if t
		WHERE	0=0
		AND	t.ac_ym = i_ym
		AND	t.ac_dt >= i_dt_fr
		AND	t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND	t.a_imp_flg = c_off
		AND	t.ins_ts <= l_max_ts
		AND	t.base_cur_amt < 0
		ORDER BY t.note_if_no
		)
	LOOP
		FOR z2 IN (
			SELECT	t.*
			FROM	mst_note_if t
			WHERE	0=0
			AND	t.ac_ym = z1.ac_ym
			AND	t.ac_dt = z1.ac_dt
			AND	(t.note_rsn_cd = z1.note_rsn_cd OR t.note_rsn_cd IS NULL AND z1.note_rsn_cd IS NULL)
			AND	t.dpt_cd = z1.dpt_cd
			AND	t.rcst_cd = z1.rcst_cd
			AND	t.note_no = z1.note_no
			AND	t.note_typ = z1.note_typ
			AND	t.bank_cd = z1.bank_cd
			AND	t.branch_cd = z1.branch_cd
			AND	t.base_cur_amt > 0
			AND	ABS(t.base_cur_amt) = ABS(z1.base_cur_amt)
			AND	t.note_if_no < z1.note_if_no
			AND	t.a_imp_flg = c_off
			AND	t.ins_ts <= l_max_ts
			ORDER BY t.note_if_no
			)
		LOOP

			UPDATE	mst_note_if t
			SET	a_imp_flg = c_on
			WHERE	0=0
			AND	t.note_if_no = z2.note_if_no
			;

			UPDATE	mst_note_if t
			SET	a_imp_flg = c_on
			WHERE	0=0
			AND	t.note_if_no = z1.note_if_no
			;

			EXIT ;
		END LOOP ;
	END LOOP ;

	i := 0;
	d1 := 0;
	l_rec_cnt := 0;
	l_chk_err := c_off;
	l_tmp_dt := NULL;
	l_dpt_cache := '{}';

	FOR x IN (
		SELECT
			t.note_if_no,
			m1.wg_cd,
			t.ac_ym,
			DATE_TRUNC('DAY', t.ac_dt) AC_DT,
			t.note_rsn_cd,
			t.dpt_cd,
			t.rcst_cd,
			t.foreign_flg,
			t.base_cur_cd,
			t.base_cur_amt,
			t.base_cur_tax_amt,
			t.trd_cur_cd,
			t.trd_cur_amt,
			t.trd_cur_tax_amt,
			t.xrate_cd,
			t.xrate,
			t.note_no,
			t.note_typ,
			t.draw_dt,
			t.due_dt,
			t.bank_cd,
			t.branch_cd,
			t.drawer_nm,
			t.endrsr1,
			t.endrsr2,
			t.endrsr3,
			t.endrsr4,
			t.endrsr5,
			t.accptr,
			t.sub_char1,
			t.sub_char2,
			t.sub_char3,
			t.sub_char4,
			t.sub_char5,
			t.sub_char6,
			t.sub_char7,
			t.sub_char8,
			t.sub_char9,
			t.sub_char10,
			t.sub_num1,
			t.sub_num2,
			t.sub_num3,
			t.sub_dt1,
			t.sub_dt2,
			t.sub_dt3
		FROM	mst_note_if t, mam_dpt m1
		WHERE	0=0
		AND	m1.dpt_cd = t.dpt_cd
		AND	m1.st_dt  <= t.ac_dt
		AND	m1.end_dt >= t.ac_dt
		AND	t.ac_ym = i_ym
		AND	t.ac_dt >= i_dt_fr
		AND	t.ac_dt < i_dt_to + '1 days'::INTERVAL
		AND	t.a_imp_flg = c_off
		AND	t.ins_ts <= l_max_ts
		ORDER BY t.ac_dt, t.note_if_no
		)
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			IF x.base_cur_amt = 0 AND x.base_cur_tax_amt = 0 THEN
				UPDATE	mst_note_if t
				SET	a_imp_flg = c_on
				WHERE	0=0
				AND	t.note_if_no = x.note_if_no
				AND	t.a_imp_flg = c_off
				;

				EXIT NEXT_LOOP ;
			END IF ;

			IF l_tmp_dt IS NULL OR l_tmp_dt <> x.ac_dt THEN
				l_dpt_cache := '{}';
				l_tmp_dt := x.ac_dt ;
			END IF ;

			/* 受入部門 */
			CALL mbpa_imp_ac$p_set_ac_dpt(x.dpt_cd, x.ac_dt, l_dpt, l_dpt_cache) ;
			IF x.dpt_cd IS NOT NULL AND l_dpt IS NULL THEN
				l_chk_err := c_on ;
				EXIT NEXT_LOOP ;
			END IF ;

			i := COALESCE(array_length(l_recs_id, 1), 0) + 1;
			l_rec := NULL;

			l_rec.data_no := LPAD(mapa_num$f_get_seq(c_ac_note_seq)::VARCHAR, c_it_dat_no_l, '0') ;
			l_rec.wg_cd		:= x.wg_cd ;
			l_rec.ac_ym		:= x.ac_ym ;
			l_rec.ac_dt		:= x.ac_dt ;
			l_rec.note_rsn_cd	:= x.note_rsn_cd ;
			l_rec.dpt_cd		:= l_dpt ;
			l_rec.rcst_cd		:= x.rcst_cd ;
			l_rec.foreign_flg	:= x.foreign_flg ;
			l_rec.base_cur_cd	:= x.base_cur_cd ;
			l_rec.base_cur_amt	:= x.base_cur_amt ;
			l_rec.base_cur_tax_amt	:= x.base_cur_tax_amt ;
			l_rec.trd_cur_cd	:= x.trd_cur_cd ;
			l_rec.trd_cur_amt	:= x.trd_cur_amt ;
			l_rec.trd_cur_tax_amt	:= x.trd_cur_tax_amt ;
			l_rec.xrate_cd		:= x.xrate_cd ;
			l_rec.xrate		:= x.xrate ;
			l_rec.note_no		:= x.note_no ;
			l_rec.note_typ		:= x.note_typ ;
			l_rec.draw_dt		:= x.draw_dt ;
			l_rec.due_dt		:= x.due_dt ;
			l_rec.bank_cd		:= x.bank_cd ;
			l_rec.branch_cd	:= x.branch_cd ;
			l_rec.drawer_nm	:= x.drawer_nm ;
			l_rec.endrsr1		:= x.endrsr1 ;
			l_rec.endrsr2		:= x.endrsr2 ;
			l_rec.endrsr3		:= x.endrsr3 ;
			l_rec.endrsr4		:= x.endrsr4 ;
			l_rec.endrsr5		:= x.endrsr5 ;
			l_rec.accptr		:= x.accptr ;
			l_rec.sub_char1	:= x.sub_char1 ;
			l_rec.sub_char2	:= x.sub_char2 ;
			l_rec.sub_char3	:= x.sub_char3 ;
			l_rec.sub_char4	:= x.sub_char4 ;
			l_rec.sub_char5	:= x.sub_char5 ;
			l_rec.sub_char6	:= x.sub_char6 ;
			l_rec.sub_char7	:= x.sub_char7 ;
			l_rec.sub_char8	:= x.sub_char8 ;
			l_rec.sub_char9	:= x.sub_char9 ;
			l_rec.sub_char10	:= x.sub_char10 ;
			l_rec.sub_num1		:= x.sub_num1 ;
			l_rec.sub_num2		:= x.sub_num2 ;
			l_rec.sub_num3		:= x.sub_num3 ;
			l_rec.sub_dt1		:= x.sub_dt1 ;
			l_rec.sub_dt2		:= x.sub_dt2 ;
			l_rec.sub_dt3		:= x.sub_dt3 ;
			l_rec.fin_flg		:= c_off ;

			l_recs[i] := l_rec;

			d1 := COALESCE(array_length(l_recs_id, 1), 0) + 1;
			l_rec_id.note_if_no := x.note_if_no;
			l_recs_id[d1] := l_rec_id;

			l_rec_cnt := l_rec_cnt + 1;

			IF i > c_max_cnt THEN
				CALL mbpa_imp_ac$ins_note(l_recs, l_recs_id);
			END IF ;

		END;
	
	END LOOP;

	CALL mbpa_imp_ac$ins_note(l_recs, l_recs_id);

	/* 処理が終了しました。{1} データ取込件数 : {2} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0026', c_proc_nm, l_rec_cnt::VARCHAR);

	COMMIT ;

	IF l_chk_err = c_on THEN
		CALL mbpa_imp_ac$p_raise_err();
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_main(
	 IN i_ac_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt_fr TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt_to TIMESTAMP WITHOUT TIME ZONE,
	 IN i_io CHARACTER,
	 IN i_stk CHARACTER,
	 IN i_rcv CHARACTER,
	 IN i_pay CHARACTER,
	 IN i_schdpay CHARACTER,
	 IN i_note CHARACTER,
	 IN i_rerun CHARACTER,
	 IN i_reget CHARACTER)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	取込のメイン処理
<REMARKS>
	ＳＣＭから会計ＩＦ用テーブル(MBT_AC_***)への取込処理。
<ARGUMENTS>
<IN>	i_ac_ym
		取込対象月
<IN>	i_dt_fr
		取込対象開始日 (NULLのときは指定月の開始日）
<IN>	i_dt_to
		取込対象終了日（指定日も含む)(NULLのときは指定月の最終日）
<IN>	i_io
		受払情報取込ＦＬＧ
<IN>	i_stk
		在庫情報取込ＦＬＧ
<IN>	i_rcv
		入金情報ＦＬＧ
<IN>	i_pay
		支払情報ＦＬＧ
<IN>	i_schdpay
		支払依頼情報ＦＬＧ
<IN>	i_note
		手形情報ＦＬＧ
<IN>	i_rerun
		再取込ＦＬＧ 0:未取込のレコードが対象 1:取込済みのレコードも対象
<IN>	i_reget
		マスタ再取得ＦＬＧ 0:取り込み時にトランザクションの品目情報を使用する 1:取り込み時に共通品目マスタの情報を使用する
<HISTORY>
**************************************************************************/
DECLARE
	c_proc_nm CONSTANT VARCHAR := 'MBPA_IMP_AC.P_MAIN';
	c_off CONSTANT CHAR(1) := '0';
	c_on CONSTANT CHAR(1) := '1';

	l_co mam_co%ROWTYPE ;
	l_ym TIMESTAMP WITHOUT TIME ZONE;
	l_dt_fr TIMESTAMP WITHOUT TIME ZONE;
	l_dt_to TIMESTAMP WITHOUT TIME ZONE;
	l_st_dt TIMESTAMP WITHOUT TIME ZONE;
	l_end_dt TIMESTAMP WITHOUT TIME ZONE;

	l_cnt NUMERIC;
	l_tmap CHAR(1);
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0001', c_proc_nm);

	CALL fcpa_postgres_util$type_is_table_row('mbpa_imp_ac$p_main$l_bp_cache', 'mam_bp', 'varchar') ;

	l_ym := i_ac_ym;

	/* 自社情報の取得 */
	l_co := mapa_co$f_get_co_rec();

	/* 対象期間の設定 */
	/* 対象開始日がNULLのときはすべて有効(1000/01/01をセット) */
	IF i_dt_fr IS NULL THEN
		l_dt_fr := to_timestamp('10000101','YYYYMMDD')::TIMESTAMP(0) WITHOUT TIME ZONE;
	ELSE
		l_dt_fr := i_dt_fr;
	END IF;

	/* 対象終了日がNULLのときはすべて有効(2999/12/31をセット) */
	IF i_dt_to IS NULL THEN
		l_dt_to := to_timestamp('29991231','YYYYMMDD')::TIMESTAMP(0) WITHOUT TIME ZONE;
	ELSE
		l_dt_to := i_dt_to;
	END IF;

	l_dt_fr := DATE_TRUNC('DAY', l_dt_fr);
	l_dt_to := DATE_TRUNC('DAY', l_dt_to);

	/* 月度初／末日の計算 */
	l_st_dt := mapa_dt$f_get_ym_st_dt_ne(l_ym, l_co.ac_cl_day, l_co.ac_cl_mon_base);
	l_end_dt := mapa_dt$f_get_ym_end_dt_ne(l_ym, l_co.ac_cl_day, l_co.ac_cl_mon_base);

	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mam_slip_jnl
	WHERE 0=0
	AND del_flg = c_off;

	IF l_cnt = 0 THEN
		/* 仕訳対象の会計伝票区分が存在していません。会計伝票区分仕訳マスタを確認してください。 */
		CALL fcpa_err$raise_app_err('MBBBD0035');
	END IF;

	/* 対象年月の月初日に対して有効な会計税対応マスタが１件でも登録されていたら会計税対応マスタを使用する */
	l_tmap := c_off;
	SELECT COUNT(*)
	INTO STRICT l_cnt
	FROM mam_ac_tax_map m
	WHERE 0=0
	AND m.st_dt <= l_st_dt
	AND m.end_dt >= l_st_dt
	AND m.del_flg = c_off
	AND EXISTS (
			SELECT 'X'
			FROM mam_ac_tax y
			WHERE 0=0
			AND y.ac_tax_cd = m.ac_tax_cd
			AND y.st_dt <= l_st_dt
			AND y.end_dt >= l_st_dt
			AND y.del_flg = c_off
		)
	LIMIT 1;

	IF l_cnt > 0 THEN
		l_tmap := c_on;
	END IF;

	TRUNCATE TABLE mbpa_imp_ac$p_main$l_bp_cache;

	IF i_io = c_on THEN
		CALL mbpa_imp_ac$p_io(l_ym, l_dt_fr, l_dt_to, i_rerun, i_reget, l_tmap);
	END IF;

	IF i_stk = c_on THEN
		CALL mbpa_imp_ac$p_stk(l_ym, l_end_dt);
	END IF;

	IF i_rcv = c_on THEN
		CALL mbpa_imp_ac$p_rcv(l_ym, l_dt_fr, l_dt_to, i_rerun, l_tmap);
	END IF;

	IF i_pay = c_on THEN
		CALL mbpa_imp_ac$p_pay(l_ym, l_dt_fr, l_dt_to, i_rerun, l_tmap);
	END IF;

	IF i_schdpay = c_on THEN
		CALL mbpa_imp_ac$p_schdpay(l_ym, l_dt_fr, l_dt_to, i_rerun);
	END IF;

	IF i_note = c_on THEN
		CALL mbpa_imp_ac$p_note(l_ym, l_dt_fr, l_dt_to, i_rerun);
	END IF;

	TRUNCATE TABLE mbpa_imp_ac$p_main$l_bp_cache;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MBBBD0002', c_proc_nm);

END;
$BODY$
LANGUAGE plpgsql
;

