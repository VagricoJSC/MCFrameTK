package mcframe.clientMSBC.MSBCP1100;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"DtlWk"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlWkR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	public static final String $act_wk_cost_p = "act_wk_cost_p";
	public static final String $schd_wk_cost_p = "schd_wk_cost_p";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	public static final String $rem_wk_cost_p = "rem_wk_cost_p";
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public static final String $wk_cost_unit_nm = "wk_cost_unit_nm";
	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public static final String $wk_cost_dec_place = "wk_cost_dec_place";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $st_tm_p = "st_tm_p";
	public static final String $end_tm_p = "end_tm_p";
	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public static final String $brk_pd = "brk_pd";
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public static final String $wk_day_cd = "wk_day_cd";
	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public static final String $wk_day_nm = "wk_day_nm";
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public static final String $wk_rsn_cd = "wk_rsn_cd";
	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public static final String $wk_rsn_nm = "wk_rsn_nm";
	public static final String $wk_usr_p = "wk_usr_p";
	/**
	 * Equipment 設備.<p>
	 *
	 */
	public static final String $fclty = "fclty";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public static final String $wk_cost_calc_upd_flg = "wk_cost_calc_upd_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $wk_act_intr_rmrks = "wk_act_intr_rmrks";
	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public static final String $wk_act_sub_char1 = "wk_act_sub_char1";
	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public static final String $wk_act_sub_char2 = "wk_act_sub_char2";
	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public static final String $wk_act_sub_char3 = "wk_act_sub_char3";
	public static final String $wk_cost_p = "wk_cost_p";
	public static final String $fxd_wk_cost_p = "fxd_wk_cost_p";
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public static final String $wk_act_no = "wk_act_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_wk_act_no = "ext_wk_act_no";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public static final String $mfg_sts_typ_nm = "mfg_sts_typ_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Delete operation row 工程行削除.<p>
	 *
	 */
	public static final String $oper_del_flg = "oper_del_flg";

	public static final String $act_wk_cost = $act_wk_cost_p + ".wk_cost_qty";
	public static final String $schd_wk_cost = $schd_wk_cost_p + ".wk_cost_qty";
	public static final String $rem_wk_cost = $rem_wk_cost_p + ".wk_cost_qty";
	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $dummy_st_dt = $st_tm_p + ".ymd";
	public static final String $st_tm = $st_tm_p + ".hm";
	public static final String $dummy_end_dt = $end_tm_p + ".ymd";
	public static final String $end_tm = $end_tm_p + ".hm";
	public static final String $wk_usr_cd = $wk_usr_p + ".usr_cd";
	public static final String $wk_usr_nm = $wk_usr_p + ".usr_nm";
	public static final String $wk_usr_dpt_cd = $wk_usr_p + ".dpt_cd";
	public static final String $wk_usr_dpt_nm = $wk_usr_p + ".dpt_nm";
	public static final String $wk_cost = $wk_cost_p + ".wk_cost_qty";
	public static final String $fxd_wk_cost = $fxd_wk_cost_p + ".wk_cost_qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta act_wk_cost_p_META = createInnerRowMeta($act_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta schd_wk_cost_p_META = createInnerRowMeta($schd_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_wk_cost_p_META = createInnerRowMeta($rem_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta wk_cost_unit_nm_META = createCommonMeta($wk_cost_unit_nm, mcframe.commonMA.meta.MA_META.WK_COST_UNIT_NM);
	public static final MCMeta wk_cost_dec_place_META = createCommonMeta($wk_cost_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta st_tm_p_META = createInnerRowMeta($st_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_tm_p_META = createInnerRowMeta($end_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta brk_pd_META = createCommonMeta($brk_pd, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta wk_day_cd_META = createCommonMeta($wk_day_cd, mcframe.commonMA.meta.MA_META.WK_DAY_CD);
	public static final MCMeta wk_day_nm_META = createCommonMeta($wk_day_nm, mcframe.commonMA.meta.MA_META.WK_DAY_NM);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta wk_rsn_nm_META = createCommonMeta($wk_rsn_nm, mcframe.commonMA.meta.MA_META.WK_RSN_NM);
	public static final MCMeta wk_usr_p_META = createInnerRowMeta($wk_usr_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta fclty_META = createCommonMeta($fclty, mcframe.commonMA.meta.MA_META.FCLTY);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_upd_flg_META = createCommonMeta($wk_cost_calc_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_act_intr_rmrks_META = createCommonMeta($wk_act_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_ACT_INTR_RMRKS);
	public static final MCMeta wk_act_sub_char1_META = createCommonMeta($wk_act_sub_char1, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR1);
	public static final MCMeta wk_act_sub_char2_META = createCommonMeta($wk_act_sub_char2, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR2);
	public static final MCMeta wk_act_sub_char3_META = createCommonMeta($wk_act_sub_char3, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR3);
	public static final MCMeta wk_cost_p_META = createInnerRowMeta($wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta fxd_wk_cost_p_META = createInnerRowMeta($fxd_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta wk_act_no_META = createCommonMeta($wk_act_no, mcframe.commonMA.meta.MA_META.WK_ACT_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_wk_act_no_META = createCommonMeta($ext_wk_act_no, mcframe.commonMA.meta.MA_META.EXT_WK_ACT_NO);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_del_flg_META = createCommonMeta($oper_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlWkR> constMetas = new ConstMetaList<DtlWkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			oper_peg_no_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			act_wk_cost_p_META,
			schd_wk_cost_p_META,
			abort_flg_META,
			rem_wk_cost_p_META,
			wk_cost_unit_nm_META,
			wk_cost_dec_place_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			ac_dt_p_META,
			st_tm_p_META,
			end_tm_p_META,
			brk_pd_META,
			wk_day_cd_META,
			wk_day_nm_META,
			wk_rsn_cd_META,
			wk_rsn_nm_META,
			wk_usr_p_META,
			fclty_META,
			wk_cost_calc_flg_META,
			wk_cost_calc_upd_flg_META,
			wk_act_intr_rmrks_META,
			wk_act_sub_char1_META,
			wk_act_sub_char2_META,
			wk_act_sub_char3_META,
			wk_cost_p_META,
			fxd_wk_cost_p_META,
			wk_schd_no_META,
			wk_act_no_META,
			oper_inst_no_META,
			oper_act_no_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_wk_act_no_META,
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			disp_seq_META,
			oper_del_flg_META
		},
		new String[][]{
			{
				"act_wk_cost",
				"schd_wk_cost",
				"rem_wk_cost",
				"ac_dt",
				"dummy_st_dt",
				"st_tm",
				"dummy_end_dt",
				"end_tm",
				"wk_usr_cd",
				"wk_usr_nm",
				"wk_usr_dpt_cd",
				"wk_usr_dpt_nm",
				"wk_cost",
				"fxd_wk_cost"
			},
			{
				$act_wk_cost,
				$schd_wk_cost,
				$rem_wk_cost,
				$ac_dt,
				$dummy_st_dt,
				$st_tm,
				$dummy_end_dt,
				$end_tm,
				$wk_usr_cd,
				$wk_usr_nm,
				$wk_usr_dpt_cd,
				$wk_usr_dpt_nm,
				$wk_cost,
				$fxd_wk_cost
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$wk_cost_cd, "wk_cost_nm;wk_cost_unit_nm;dec_place"},	// wk_cost_cd
				{$wk_usr_p + ".dpt_cd", "dpt_nm"}	// wk_usr_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wk_usr_p + ".dpt_cd", "ac_dt;wk_usr_cd;MAC_DPT_IS_SRCH_TYP.MFG"}	// wk_usr_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wk_usr_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// wk_usr_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$st_tm_p + ".hm", "_DISP"},	// st_tm_p.hm
				{$end_tm_p + ".hm", "_DISP"}	// end_tm_p.hm
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected DtlWkR_MC_A(ConstMetaList<? extends DtlWkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlWkR clone() {
		return (DtlWkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlWkR createInstance() {
		return (DtlWkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlWkR getValues(String... names) {
		return (DtlWkR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 1, $oper_peg_no);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 2, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 2, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 3, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 3, $wk_cost_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR act_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 4, $act_wk_cost_p);
	}
	
	public void act_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 4, $act_wk_cost_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR schd_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 5, $schd_wk_cost_p);
	}
	
	public void schd_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 5, $schd_wk_cost_p, row);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 6, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 6, $abort_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR rem_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 7, $rem_wk_cost_p);
	}
	
	public void rem_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 7, $rem_wk_cost_p, row);
	}


	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public String wk_cost_unit_nm() {
		return getConstString(offset + 8, $wk_cost_unit_nm);
	}

	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public void wk_cost_unit_nm(String value) {
		setConstString(offset + 8, $wk_cost_unit_nm, value);
	}


	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber wk_cost_dec_place() {
		return getConstNumber(offset + 9, $wk_cost_dec_place);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(MCNumber value) {
		setConstNumber(offset + 9, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(int value) {
		setConstNumber(offset + 9, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(long value) {
		setConstNumber(offset + 9, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(float value) {
		setConstNumber(offset + 9, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(double value) {
		setConstNumber(offset + 9, $wk_cost_dec_place, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 10, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 10, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 11, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 11, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 12, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 13, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 13, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 14, $st_tm_p);
	}
	
	public void st_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 14, $st_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 15, $end_tm_p);
	}
	
	public void end_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 15, $end_tm_p, row);
	}


	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public MCNumber brk_pd() {
		return getConstNumber(offset + 16, $brk_pd);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(MCNumber value) {
		setConstNumber(offset + 16, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(int value) {
		setConstNumber(offset + 16, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(long value) {
		setConstNumber(offset + 16, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(float value) {
		setConstNumber(offset + 16, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(double value) {
		setConstNumber(offset + 16, $brk_pd, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 17, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 17, $wk_day_cd, value);
	}


	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public String wk_day_nm() {
		return getConstString(offset + 18, $wk_day_nm);
	}

	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public void wk_day_nm(String value) {
		setConstString(offset + 18, $wk_day_nm, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 19, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 19, $wk_rsn_cd, value);
	}


	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 20, $wk_rsn_nm);
	}

	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public void wk_rsn_nm(String value) {
		setConstString(offset + 20, $wk_rsn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR wk_usr_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 21, $wk_usr_p);
	}
	
	public void wk_usr_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 21, $wk_usr_p, row);
	}


	/**
	 * Equipment 設備.<p>
	 *
	 */
	public String fclty() {
		return getConstString(offset + 22, $fclty);
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public void fclty(String value) {
		setConstString(offset + 22, $fclty, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 23, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 23, $wk_cost_calc_flg, value);
	}


	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public boolean wk_cost_calc_upd_flg() {
		return getConstBoolean(offset + 24, $wk_cost_calc_upd_flg);
	}

	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public void wk_cost_calc_upd_flg(boolean value) {
		setConstBoolean(offset + 24, $wk_cost_calc_upd_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String wk_act_intr_rmrks() {
		return getConstString(offset + 25, $wk_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void wk_act_intr_rmrks(String value) {
		setConstString(offset + 25, $wk_act_intr_rmrks, value);
	}


	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public String wk_act_sub_char1() {
		return getConstString(offset + 26, $wk_act_sub_char1);
	}

	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public void wk_act_sub_char1(String value) {
		setConstString(offset + 26, $wk_act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public String wk_act_sub_char2() {
		return getConstString(offset + 27, $wk_act_sub_char2);
	}

	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public void wk_act_sub_char2(String value) {
		setConstString(offset + 27, $wk_act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public String wk_act_sub_char3() {
		return getConstString(offset + 28, $wk_act_sub_char3);
	}

	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public void wk_act_sub_char3(String value) {
		setConstString(offset + 28, $wk_act_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 29, $wk_cost_p);
	}
	
	public void wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 29, $wk_cost_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR fxd_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 30, $fxd_wk_cost_p);
	}
	
	public void fxd_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 30, $fxd_wk_cost_p, row);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 31, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 31, $wk_schd_no, value);
	}


	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return getConstString(offset + 32, $wk_act_no);
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		setConstString(offset + 32, $wk_act_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 33, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 33, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 34, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 34, $oper_act_no, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 35, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 35, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 36, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 36, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 37, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 37, $ext_sys_nm, value);
	}


	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public String ext_wk_act_no() {
		return getConstString(offset + 38, $ext_wk_act_no);
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public void ext_wk_act_no(String value) {
		setConstString(offset + 38, $ext_wk_act_no, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 39, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 39, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 40, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 40, $mfg_sts_typ_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 41, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 41, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 41, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 41, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 41, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 41, $disp_seq, value);
	}


	/**
	 * Delete operation row 工程行削除.<p>
	 *
	 */
	public boolean oper_del_flg() {
		return getConstBoolean(offset + 42, $oper_del_flg);
	}

	/**
	 * Delete operation row 工程行削除.<p>
	 *
	 */
	public void oper_del_flg(boolean value) {
		setConstBoolean(offset + 42, $oper_del_flg, value);
	}


	public String getString(String name) {
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($fclty.equalsIgnoreCase(name)) {
			return fclty();
		}
		if ($wk_act_intr_rmrks.equalsIgnoreCase(name)) {
			return wk_act_intr_rmrks();
		}
		if ($wk_act_sub_char1.equalsIgnoreCase(name)) {
			return wk_act_sub_char1();
		}
		if ($wk_act_sub_char2.equalsIgnoreCase(name)) {
			return wk_act_sub_char2();
		}
		if ($wk_act_sub_char3.equalsIgnoreCase(name)) {
			return wk_act_sub_char3();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_upd_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($oper_del_flg.equalsIgnoreCase(name)) {
			return oper_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($fclty.equalsIgnoreCase(name)) {
			return fclty();
		}
		if ($wk_act_intr_rmrks.equalsIgnoreCase(name)) {
			return wk_act_intr_rmrks();
		}
		if ($wk_act_sub_char1.equalsIgnoreCase(name)) {
			return wk_act_sub_char1();
		}
		if ($wk_act_sub_char2.equalsIgnoreCase(name)) {
			return wk_act_sub_char2();
		}
		if ($wk_act_sub_char3.equalsIgnoreCase(name)) {
			return wk_act_sub_char3();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_upd_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($oper_del_flg.equalsIgnoreCase(name)) {
			return oper_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			wk_day_nm(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
			return;
		}
		if ($fclty.equalsIgnoreCase(name)) {
			fclty(value);
			return;
		}
		if ($wk_act_intr_rmrks.equalsIgnoreCase(name)) {
			wk_act_intr_rmrks(value);
			return;
		}
		if ($wk_act_sub_char1.equalsIgnoreCase(name)) {
			wk_act_sub_char1(value);
			return;
		}
		if ($wk_act_sub_char2.equalsIgnoreCase(name)) {
			wk_act_sub_char2(value);
			return;
		}
		if ($wk_act_sub_char3.equalsIgnoreCase(name)) {
			wk_act_sub_char3(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_upd_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($oper_del_flg.equalsIgnoreCase(name)) {
			oper_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			wk_day_nm(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
			return;
		}
		if ($fclty.equalsIgnoreCase(name)) {
			fclty(value);
			return;
		}
		if ($wk_act_intr_rmrks.equalsIgnoreCase(name)) {
			wk_act_intr_rmrks(value);
			return;
		}
		if ($wk_act_sub_char1.equalsIgnoreCase(name)) {
			wk_act_sub_char1(value);
			return;
		}
		if ($wk_act_sub_char2.equalsIgnoreCase(name)) {
			wk_act_sub_char2(value);
			return;
		}
		if ($wk_act_sub_char3.equalsIgnoreCase(name)) {
			wk_act_sub_char3(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_upd_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($oper_del_flg.equalsIgnoreCase(name)) {
			oper_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($act_wk_cost_p.equalsIgnoreCase(name)) {
			return act_wk_cost_p();
		}
		if ($schd_wk_cost_p.equalsIgnoreCase(name)) {
			return schd_wk_cost_p();
		}
		if ($rem_wk_cost_p.equalsIgnoreCase(name)) {
			return rem_wk_cost_p();
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($st_tm_p.equalsIgnoreCase(name)) {
			return st_tm_p();
		}
		if ($end_tm_p.equalsIgnoreCase(name)) {
			return end_tm_p();
		}
		if ($wk_usr_p.equalsIgnoreCase(name)) {
			return wk_usr_p();
		}
		if ($wk_cost_p.equalsIgnoreCase(name)) {
			return wk_cost_p();
		}
		if ($fxd_wk_cost_p.equalsIgnoreCase(name)) {
			return fxd_wk_cost_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($act_wk_cost_p.equalsIgnoreCase(name)) {
			act_wk_cost_p(
				((MCContainerMeta) act_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($schd_wk_cost_p.equalsIgnoreCase(name)) {
			schd_wk_cost_p(
				((MCContainerMeta) schd_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($rem_wk_cost_p.equalsIgnoreCase(name)) {
			rem_wk_cost_p(
				((MCContainerMeta) rem_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($st_tm_p.equalsIgnoreCase(name)) {
			st_tm_p(
				((MCContainerMeta) st_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_tm_p.equalsIgnoreCase(name)) {
			end_tm_p(
				((MCContainerMeta) end_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($wk_usr_p.equalsIgnoreCase(name)) {
			wk_usr_p(
				((MCContainerMeta) wk_usr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($wk_cost_p.equalsIgnoreCase(name)) {
			wk_cost_p(
				((MCContainerMeta) wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($fxd_wk_cost_p.equalsIgnoreCase(name)) {
			fxd_wk_cost_p(
				((MCContainerMeta) fxd_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public MCNumber act_wk_cost() {
		return act_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(MCNumber value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(int value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(long value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(float value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(double value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public MCNumber schd_wk_cost() {
		return schd_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_wk_cost(MCNumber value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_wk_cost(int value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_wk_cost(long value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_wk_cost(float value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_wk_cost(double value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public MCNumber rem_wk_cost() {
		return rem_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(MCNumber value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(int value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(long value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(float value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(double value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	/**
	 * Start date dummy 着手日ダミー.<p>
	 *
	 */
	public MCDate dummy_st_dt() {
		return st_tm_p().ymd();
	}

	/**
	 * Start date dummy 着手日ダミー.<p>
	 *
	 */
	public void dummy_st_dt(MCDate value) {
		st_tm_p().ymd(value);
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public MCDate st_tm() {
		return st_tm_p().hm();
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		st_tm_p().hm(value);
	}

	/**
	 * End date dummy 終了日ダミー.<p>
	 *
	 */
	public MCDate dummy_end_dt() {
		return end_tm_p().ymd();
	}

	/**
	 * End date dummy 終了日ダミー.<p>
	 *
	 */
	public void dummy_end_dt(MCDate value) {
		end_tm_p().ymd(value);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_tm() {
		return end_tm_p().hm();
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		end_tm_p().hm(value);
	}

	public String wk_usr_cd() {
		return wk_usr_p().usr_cd();
	}

	public void wk_usr_cd(String value) {
		wk_usr_p().usr_cd(value);
	}

	public String wk_usr_nm() {
		return wk_usr_p().usr_nm();
	}

	public void wk_usr_nm(String value) {
		wk_usr_p().usr_nm(value);
	}

	public String wk_usr_dpt_cd() {
		return wk_usr_p().dpt_cd();
	}

	public void wk_usr_dpt_cd(String value) {
		wk_usr_p().dpt_cd(value);
	}

	public String wk_usr_dpt_nm() {
		return wk_usr_p().dpt_nm();
	}

	public void wk_usr_dpt_nm(String value) {
		wk_usr_p().dpt_nm(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public MCNumber wk_cost() {
		return wk_cost_p().wk_cost_qty();
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(MCNumber value) {
		wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(int value) {
		wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(long value) {
		wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(float value) {
		wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(double value) {
		wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public MCNumber fxd_wk_cost() {
		return fxd_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(MCNumber value) {
		fxd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(int value) {
		fxd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(long value) {
		fxd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(float value) {
		fxd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(double value) {
		fxd_wk_cost_p().wk_cost_qty(value);
	}

}

