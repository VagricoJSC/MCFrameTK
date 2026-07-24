package mcframe.clientMGBF.MGBFP0030;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	public static final String $itm_typ_p = "itm_typ_p";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	public static final String $itm_p = "itm_p";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no_flg = "po_no_flg";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no_flg = "slo_no_flg";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no_flg = "iv_no_flg";
	/**
	 * Child management dept. 子管理部門.<p>
	 *
	 */
	public static final String $chd_mng_dpt_flg = "chd_mng_dpt_flg";
	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public static final String $chd_lot_flg = "chd_lot_flg";
	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public static final String $chd_sublot_flg = "chd_sublot_flg";
	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public static final String $chd_sno1_flg = "chd_sno1_flg";
	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public static final String $chd_sno2_flg = "chd_sno2_flg";
	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public static final String $chd_sno3_flg = "chd_sno3_flg";
	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public static final String $chd_sno4_flg = "chd_sno4_flg";
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ_flg = "ac_slip_typ_flg";
	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public static final String $ac_rsn_flg = "ac_rsn_flg";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta po_no_flg_META = createCommonMeta($po_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_flg_META = createCommonMeta($slo_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_flg_META = createCommonMeta($iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_mng_dpt_flg_META = createCommonMeta($chd_mng_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_lot_flg_META = createCommonMeta($chd_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sublot_flg_META = createCommonMeta($chd_sublot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sno1_flg_META = createCommonMeta($chd_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sno2_flg_META = createCommonMeta($chd_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sno3_flg_META = createCommonMeta($chd_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sno4_flg_META = createCommonMeta($chd_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_slip_typ_flg_META = createCommonMeta($ac_slip_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_rsn_flg_META = createCommonMeta($ac_rsn_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_no_META,
			wg_cd_META,
			ym_META,
			mng_dpt_cd_META,
			itm_typ_p_META,
			itm_jnl_cd_META,
			itm_p_META,
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			bp_cd_META,
			po_no_META,
			slo_no_META,
			iv_no_META,
			po_no_flg_META,
			slo_no_flg_META,
			iv_no_flg_META,
			chd_mng_dpt_flg_META,
			chd_lot_flg_META,
			chd_sublot_flg_META,
			chd_sno1_flg_META,
			chd_sno2_flg_META,
			chd_sno3_flg_META,
			chd_sno4_flg_META,
			ac_slip_typ_flg_META,
			ac_rsn_flg_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_d_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3"
			},
			{
				$itm_typ,
				$itm_typ_d_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$chd_sno1_flg, "SNO1"},	// chd_sno1_flg
				{$chd_sno2_flg, "SNO2"},	// chd_sno2_flg
				{$chd_sno3_flg, "SNO3"},	// chd_sno3_flg
				{$chd_sno4_flg, "SNO4"}	// chd_sno4_flg
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 1, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 1, $calc_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 4, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 4, $mng_dpt_cd, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 5, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 5, $itm_typ_p, row);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 6, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 6, $itm_jnl_cd, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 7, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 7, $itm_p, row);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 8, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 8, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 9, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 9, $mfg_act_no, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 10, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 10, $bp_cd, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 11, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 11, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 12, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 12, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 13, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 13, $iv_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public boolean po_no_flg() {
		return getConstBoolean(offset + 14, $po_no_flg);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no_flg(boolean value) {
		setConstBoolean(offset + 14, $po_no_flg, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public boolean slo_no_flg() {
		return getConstBoolean(offset + 15, $slo_no_flg);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no_flg(boolean value) {
		setConstBoolean(offset + 15, $slo_no_flg, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public boolean iv_no_flg() {
		return getConstBoolean(offset + 16, $iv_no_flg);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no_flg(boolean value) {
		setConstBoolean(offset + 16, $iv_no_flg, value);
	}


	/**
	 * Child management dept. 子管理部門.<p>
	 *
	 */
	public boolean chd_mng_dpt_flg() {
		return getConstBoolean(offset + 17, $chd_mng_dpt_flg);
	}

	/**
	 * Child management dept. 子管理部門.<p>
	 *
	 */
	public void chd_mng_dpt_flg(boolean value) {
		setConstBoolean(offset + 17, $chd_mng_dpt_flg, value);
	}


	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public boolean chd_lot_flg() {
		return getConstBoolean(offset + 18, $chd_lot_flg);
	}

	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public void chd_lot_flg(boolean value) {
		setConstBoolean(offset + 18, $chd_lot_flg, value);
	}


	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public boolean chd_sublot_flg() {
		return getConstBoolean(offset + 19, $chd_sublot_flg);
	}

	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public void chd_sublot_flg(boolean value) {
		setConstBoolean(offset + 19, $chd_sublot_flg, value);
	}


	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public boolean chd_sno1_flg() {
		return getConstBoolean(offset + 20, $chd_sno1_flg);
	}

	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public void chd_sno1_flg(boolean value) {
		setConstBoolean(offset + 20, $chd_sno1_flg, value);
	}


	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public boolean chd_sno2_flg() {
		return getConstBoolean(offset + 21, $chd_sno2_flg);
	}

	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public void chd_sno2_flg(boolean value) {
		setConstBoolean(offset + 21, $chd_sno2_flg, value);
	}


	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public boolean chd_sno3_flg() {
		return getConstBoolean(offset + 22, $chd_sno3_flg);
	}

	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public void chd_sno3_flg(boolean value) {
		setConstBoolean(offset + 22, $chd_sno3_flg, value);
	}


	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public boolean chd_sno4_flg() {
		return getConstBoolean(offset + 23, $chd_sno4_flg);
	}

	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public void chd_sno4_flg(boolean value) {
		setConstBoolean(offset + 23, $chd_sno4_flg, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public boolean ac_slip_typ_flg() {
		return getConstBoolean(offset + 24, $ac_slip_typ_flg);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ_flg(boolean value) {
		setConstBoolean(offset + 24, $ac_slip_typ_flg, value);
	}


	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public boolean ac_rsn_flg() {
		return getConstBoolean(offset + 25, $ac_rsn_flg);
	}

	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public void ac_rsn_flg(boolean value) {
		setConstBoolean(offset + 25, $ac_rsn_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($chd_mng_dpt_flg.equalsIgnoreCase(name)) {
			return chd_mng_dpt_flg();
		}
		if ($chd_lot_flg.equalsIgnoreCase(name)) {
			return chd_lot_flg();
		}
		if ($chd_sublot_flg.equalsIgnoreCase(name)) {
			return chd_sublot_flg();
		}
		if ($chd_sno1_flg.equalsIgnoreCase(name)) {
			return chd_sno1_flg();
		}
		if ($chd_sno2_flg.equalsIgnoreCase(name)) {
			return chd_sno2_flg();
		}
		if ($chd_sno3_flg.equalsIgnoreCase(name)) {
			return chd_sno3_flg();
		}
		if ($chd_sno4_flg.equalsIgnoreCase(name)) {
			return chd_sno4_flg();
		}
		if ($ac_slip_typ_flg.equalsIgnoreCase(name)) {
			return ac_slip_typ_flg();
		}
		if ($ac_rsn_flg.equalsIgnoreCase(name)) {
			return ac_rsn_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($chd_mng_dpt_flg.equalsIgnoreCase(name)) {
			return chd_mng_dpt_flg();
		}
		if ($chd_lot_flg.equalsIgnoreCase(name)) {
			return chd_lot_flg();
		}
		if ($chd_sublot_flg.equalsIgnoreCase(name)) {
			return chd_sublot_flg();
		}
		if ($chd_sno1_flg.equalsIgnoreCase(name)) {
			return chd_sno1_flg();
		}
		if ($chd_sno2_flg.equalsIgnoreCase(name)) {
			return chd_sno2_flg();
		}
		if ($chd_sno3_flg.equalsIgnoreCase(name)) {
			return chd_sno3_flg();
		}
		if ($chd_sno4_flg.equalsIgnoreCase(name)) {
			return chd_sno4_flg();
		}
		if ($ac_slip_typ_flg.equalsIgnoreCase(name)) {
			return ac_slip_typ_flg();
		}
		if ($ac_rsn_flg.equalsIgnoreCase(name)) {
			return ac_rsn_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($chd_mng_dpt_flg.equalsIgnoreCase(name)) {
			chd_mng_dpt_flg(value);
			return;
		}
		if ($chd_lot_flg.equalsIgnoreCase(name)) {
			chd_lot_flg(value);
			return;
		}
		if ($chd_sublot_flg.equalsIgnoreCase(name)) {
			chd_sublot_flg(value);
			return;
		}
		if ($chd_sno1_flg.equalsIgnoreCase(name)) {
			chd_sno1_flg(value);
			return;
		}
		if ($chd_sno2_flg.equalsIgnoreCase(name)) {
			chd_sno2_flg(value);
			return;
		}
		if ($chd_sno3_flg.equalsIgnoreCase(name)) {
			chd_sno3_flg(value);
			return;
		}
		if ($chd_sno4_flg.equalsIgnoreCase(name)) {
			chd_sno4_flg(value);
			return;
		}
		if ($ac_slip_typ_flg.equalsIgnoreCase(name)) {
			ac_slip_typ_flg(value);
			return;
		}
		if ($ac_rsn_flg.equalsIgnoreCase(name)) {
			ac_rsn_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($chd_mng_dpt_flg.equalsIgnoreCase(name)) {
			chd_mng_dpt_flg(value);
			return;
		}
		if ($chd_lot_flg.equalsIgnoreCase(name)) {
			chd_lot_flg(value);
			return;
		}
		if ($chd_sublot_flg.equalsIgnoreCase(name)) {
			chd_sublot_flg(value);
			return;
		}
		if ($chd_sno1_flg.equalsIgnoreCase(name)) {
			chd_sno1_flg(value);
			return;
		}
		if ($chd_sno2_flg.equalsIgnoreCase(name)) {
			chd_sno2_flg(value);
			return;
		}
		if ($chd_sno3_flg.equalsIgnoreCase(name)) {
			chd_sno3_flg(value);
			return;
		}
		if ($chd_sno4_flg.equalsIgnoreCase(name)) {
			chd_sno4_flg(value);
			return;
		}
		if ($ac_slip_typ_flg.equalsIgnoreCase(name)) {
			ac_slip_typ_flg(value);
			return;
		}
		if ($ac_rsn_flg.equalsIgnoreCase(name)) {
			ac_rsn_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

}

