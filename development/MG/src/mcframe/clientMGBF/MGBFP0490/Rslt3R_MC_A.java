package mcframe.clientMGBF.MGBFP0490;

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
 * ブロック"Rslt3"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Rslt3R_MC_A extends MCConstRow {

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
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
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
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public static final String $wk_cost_unit_nm = "wk_cost_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $unit = "unit";
	/**
	 * Cost 原価.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public static final String $base_qty = "base_qty";
	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public static final String $base_unit = "base_unit";
	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public static final String $pln_qty = "pln_qty";
	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public static final String $pln_cost = "pln_cost";


	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta wk_rsn_nm_META = createCommonMeta($wk_rsn_nm, mcframe.commonMA.meta.MA_META.WK_RSN_NM);
	public static final MCMeta wk_cost_unit_nm_META = createCommonMeta($wk_cost_unit_nm, mcframe.commonMA.meta.MA_META.WK_COST_UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_META = createCommonMeta($unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_META = createCommonMeta($base_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_qty_META = createCommonMeta($pln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pln_cost_META = createCommonMeta($pln_cost, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Rslt3R> constMetas = new ConstMetaList<Rslt3R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_cd_META,
			oper_nm_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			wk_rsn_cd_META,
			wk_rsn_nm_META,
			wk_cost_unit_nm_META,
			dec_place_META,
			ym_META,
			qty_META,
			unit_META,
			act_cost_META,
			base_qty_META,
			base_unit_META,
			pln_qty_META,
			pln_cost_META
		},
		new String[][]{
			{
			},
			{
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
				{$oper_cd, "Key"},	// oper_cd
				{$wk_cost_cd, "Key"},	// wk_cost_cd
				{$wk_rsn_cd, "Key"}	// wk_rsn_cd
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
				{$oper_nm, "Key"},	// oper_nm
				{$wk_cost_nm, "Key"},	// wk_cost_nm
				{$wk_rsn_nm, "Key"},	// wk_rsn_nm
				{$wk_cost_unit_nm, "Key"},	// wk_cost_unit_nm
				{$dec_place, "Key"}	// dec_place
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
				{$qty, "Key"},	// qty
				{$unit, "Key"},	// unit
				{$act_cost, "Key"},	// act_cost
				{$base_qty, "Key"},	// base_qty
				{$base_unit, "Key"},	// base_unit
				{$pln_qty, "Key"},	// pln_qty
				{$pln_cost, "Key"}	// pln_cost
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$ym, "Key"}	// ym
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
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
	protected Rslt3R_MC_A(ConstMetaList<? extends Rslt3R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt3R clone() {
		return (Rslt3R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt3R createInstance() {
		return (Rslt3R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt3R getValues(String... names) {
		return (Rslt3R) super.getValues(names);
	}



	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 0, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 0, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 1, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 1, $oper_nm, value);
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


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 4, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 4, $wk_rsn_cd, value);
	}


	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 5, $wk_rsn_nm);
	}

	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public void wk_rsn_nm(String value) {
		setConstString(offset + 5, $wk_rsn_nm, value);
	}


	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public String wk_cost_unit_nm() {
		return getConstString(offset + 6, $wk_cost_unit_nm);
	}

	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public void wk_cost_unit_nm(String value) {
		setConstString(offset + 6, $wk_cost_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 7, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 7, $dec_place, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 8, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 8, $ym, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 9, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 9, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 9, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 9, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 9, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 9, $qty, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber unit() {
		return getConstNumber(offset + 10, $unit);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(MCNumber value) {
		setConstNumber(offset + 10, $unit, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(int value) {
		setConstNumber(offset + 10, $unit, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(long value) {
		setConstNumber(offset + 10, $unit, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(float value) {
		setConstNumber(offset + 10, $unit, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(double value) {
		setConstNumber(offset + 10, $unit, value);
	}


	/**
	 * Cost 原価.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 11, $act_cost);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 11, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 11, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 11, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 11, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 11, $act_cost, value);
	}


	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 12, $base_qty);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 12, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 12, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 12, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 12, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 12, $base_qty, value);
	}


	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public MCNumber base_unit() {
		return getConstNumber(offset + 13, $base_unit);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(MCNumber value) {
		setConstNumber(offset + 13, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(int value) {
		setConstNumber(offset + 13, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(long value) {
		setConstNumber(offset + 13, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(float value) {
		setConstNumber(offset + 13, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(double value) {
		setConstNumber(offset + 13, $base_unit, value);
	}


	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public MCNumber pln_qty() {
		return getConstNumber(offset + 14, $pln_qty);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(MCNumber value) {
		setConstNumber(offset + 14, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(int value) {
		setConstNumber(offset + 14, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(long value) {
		setConstNumber(offset + 14, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(float value) {
		setConstNumber(offset + 14, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(double value) {
		setConstNumber(offset + 14, $pln_qty, value);
	}


	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public MCNumber pln_cost() {
		return getConstNumber(offset + 15, $pln_cost);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(MCNumber value) {
		setConstNumber(offset + 15, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(int value) {
		setConstNumber(offset + 15, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(long value) {
		setConstNumber(offset + 15, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(float value) {
		setConstNumber(offset + 15, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(double value) {
		setConstNumber(offset + 15, $pln_cost, value);
	}


	public String getString(String name) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($unit.equalsIgnoreCase(name)) {
			return unit();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			return base_unit();
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			return pln_qty();
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			return pln_cost();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($unit.equalsIgnoreCase(name)) {
			return unit();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			return base_unit();
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			return pln_qty();
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			return pln_cost();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
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
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
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
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

