package mcframe.serverMGBF.MGBFL0490;

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
 * ブロック"Srch01_Rslt3"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt3R_MC_A extends MCConstRow {

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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $wk_rsn_cd = "wk_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
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
	 * Cost 原価.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
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
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_qty_META = createCommonMeta($pln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pln_cost_META = createCommonMeta($pln_cost, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_Rslt3R> constMetas = new ConstMetaList<Srch01_Rslt3R>(
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
			act_cost_META,
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

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_Rslt3R_MC_A(ConstMetaList<? extends Srch01_Rslt3R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt3R clone() {
		return (Srch01_Rslt3R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt3R createInstance() {
		return (Srch01_Rslt3R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt3R getValues(String... names) {
		return (Srch01_Rslt3R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 2, $wk_cost_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 2, $wk_cost_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 3, $wk_cost_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 3, $wk_cost_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 4, $wk_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 4, $wk_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 5, $wk_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
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
	 * Cost 原価.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 10, $act_cost);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 10, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 10, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 10, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 10, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 10, $act_cost, value);
	}


	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public MCNumber pln_qty() {
		return getConstNumber(offset + 11, $pln_qty);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(MCNumber value) {
		setConstNumber(offset + 11, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(int value) {
		setConstNumber(offset + 11, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(long value) {
		setConstNumber(offset + 11, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(float value) {
		setConstNumber(offset + 11, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(double value) {
		setConstNumber(offset + 11, $pln_qty, value);
	}


	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public MCNumber pln_cost() {
		return getConstNumber(offset + 12, $pln_cost);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(MCNumber value) {
		setConstNumber(offset + 12, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(int value) {
		setConstNumber(offset + 12, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(long value) {
		setConstNumber(offset + 12, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(float value) {
		setConstNumber(offset + 12, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(double value) {
		setConstNumber(offset + 12, $pln_cost, value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
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
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
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

