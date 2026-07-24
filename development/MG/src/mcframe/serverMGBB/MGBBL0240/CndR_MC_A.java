package mcframe.serverMGBB.MGBBL0240;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. (Copy from) コピー元計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd_fr = "calc_grp_cd_fr";
	/**
	 * Month (Copy from) コピー元年月.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Calculation group cd. (Copy to) コピー先計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd_to = "calc_grp_cd_to";
	/**
	 * Month (Copy to) コピー先年月.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public static final String $stk_flg = "stk_flg";
	/**
	 * WIP 仕掛.<p>
	 *
	 */
	public static final String $wip_flg = "wip_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no_flg = "lot_no_flg";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no_flg = "sublot_no_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
	/**
	 * BP 取引先.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_flg = "asst_flg";
	/**
	 * Process after deletion 削除後に処理する.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";


	public static final MCMeta calc_grp_cd_fr_META = createCommonMeta($calc_grp_cd_fr, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_to_META = createCommonMeta($calc_grp_cd_to, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wip_flg_META = createCommonMeta($wip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_flg_META = createCommonMeta($lot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_flg_META = createCommonMeta($sublot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asst_flg_META = createCommonMeta($asst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_fr_META,
			ym_fr_META,
			calc_grp_cd_to_META,
			ym_to_META,
			stk_flg_META,
			wip_flg_META,
			lot_no_flg_META,
			sublot_no_flg_META,
			sno1_flg_META,
			sno2_flg_META,
			sno3_flg_META,
			sno4_flg_META,
			bp_flg_META,
			asst_flg_META,
			del_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$calc_grp_cd_fr, "E"},	// calc_grp_cd_fr
				{$ym_fr, "E"},	// ym_fr
				{$calc_grp_cd_to, "E"},	// calc_grp_cd_to
				{$ym_to, "E"}	// ym_to
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$calc_grp_cd_fr, "MA.MAUAL0010.CalcGrp"},	// calc_grp_cd_fr
				{$calc_grp_cd_to, "MA.MAUAL0010.CalcGrp"}	// calc_grp_cd_to
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$calc_grp_cd_fr, "true"},	// calc_grp_cd_fr
				{$calc_grp_cd_to, "true"}	// calc_grp_cd_to
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$calc_grp_cd_fr, "exp_or_not_stk_or_calc_stk_flg"},	// calc_grp_cd_fr
				{$calc_grp_cd_to, "exp_or_not_stk_or_calc_stk_flg"}	// calc_grp_cd_to
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation group cd. (Copy from) コピー元計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd_fr() {
		return getConstString(offset + 0, $calc_grp_cd_fr);
	}

	/**
	 * Calculation group cd. (Copy from) コピー元計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd_fr(String value) {
		setConstString(offset + 0, $calc_grp_cd_fr, value);
	}


	/**
	 * Month (Copy from) コピー元年月.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 1, $ym_fr);
	}

	/**
	 * Month (Copy from) コピー元年月.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 1, $ym_fr, value);
	}


	/**
	 * Calculation group cd. (Copy to) コピー先計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd_to() {
		return getConstString(offset + 2, $calc_grp_cd_to);
	}

	/**
	 * Calculation group cd. (Copy to) コピー先計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd_to(String value) {
		setConstString(offset + 2, $calc_grp_cd_to, value);
	}


	/**
	 * Month (Copy to) コピー先年月.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 3, $ym_to);
	}

	/**
	 * Month (Copy to) コピー先年月.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 3, $ym_to, value);
	}


	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 4, $stk_flg);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 4, $stk_flg, value);
	}


	/**
	 * WIP 仕掛.<p>
	 *
	 */
	public boolean wip_flg() {
		return getConstBoolean(offset + 5, $wip_flg);
	}

	/**
	 * WIP 仕掛.<p>
	 *
	 */
	public void wip_flg(boolean value) {
		setConstBoolean(offset + 5, $wip_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_no_flg() {
		return getConstBoolean(offset + 6, $lot_no_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no_flg(boolean value) {
		setConstBoolean(offset + 6, $lot_no_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public boolean sublot_no_flg() {
		return getConstBoolean(offset + 7, $sublot_no_flg);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no_flg(boolean value) {
		setConstBoolean(offset + 7, $sublot_no_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 8, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 8, $sno1_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 9, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 9, $sno2_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 10, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 10, $sno3_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 11, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 11, $sno4_flg, value);
	}


	/**
	 * BP 取引先.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 12, $bp_flg);
	}

	/**
	 * BP 取引先.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 12, $bp_flg, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public boolean asst_flg() {
		return getConstBoolean(offset + 13, $asst_flg);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_flg(boolean value) {
		setConstBoolean(offset + 13, $asst_flg, value);
	}


	/**
	 * Process after deletion 削除後に処理する.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 14, $del_flg);
	}

	/**
	 * Process after deletion 削除後に処理する.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 14, $del_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd_fr.equalsIgnoreCase(name)) {
			return calc_grp_cd_fr();
		}
		if ($calc_grp_cd_to.equalsIgnoreCase(name)) {
			return calc_grp_cd_to();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($wip_flg.equalsIgnoreCase(name)) {
			return wip_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			return asst_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd_fr.equalsIgnoreCase(name)) {
			return calc_grp_cd_fr();
		}
		if ($calc_grp_cd_to.equalsIgnoreCase(name)) {
			return calc_grp_cd_to();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($wip_flg.equalsIgnoreCase(name)) {
			return wip_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			return asst_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd_fr.equalsIgnoreCase(name)) {
			calc_grp_cd_fr(value);
			return;
		}
		if ($calc_grp_cd_to.equalsIgnoreCase(name)) {
			calc_grp_cd_to(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($wip_flg.equalsIgnoreCase(name)) {
			wip_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			asst_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd_fr.equalsIgnoreCase(name)) {
			calc_grp_cd_fr(value);
			return;
		}
		if ($calc_grp_cd_to.equalsIgnoreCase(name)) {
			calc_grp_cd_to(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($wip_flg.equalsIgnoreCase(name)) {
			wip_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			asst_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

