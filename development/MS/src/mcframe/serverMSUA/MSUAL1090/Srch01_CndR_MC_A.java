package mcframe.serverMSUA.MSUAL1090;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public static final String $main_itm_cd = "main_itm_cd";
	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public static final String $main_itm_sub1 = "main_itm_sub1";
	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public static final String $main_itm_sub2 = "main_itm_sub2";
	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public static final String $main_itm_sub3 = "main_itm_sub3";
	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public static final String $main_itm_unit_cd = "main_itm_unit_cd";
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public static final String $set_grp_cd = "set_grp_cd";
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public static final String $set_grp_nm = "set_grp_nm";
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public static final String $main_itm_qty = "main_itm_qty";


	public static final MCMeta main_itm_cd_META = createCommonMeta($main_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta main_itm_sub1_META = createCommonMeta($main_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta main_itm_sub2_META = createCommonMeta($main_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta main_itm_sub3_META = createCommonMeta($main_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta main_itm_unit_cd_META = createCommonMeta($main_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta set_grp_nm_META = createCommonMeta($set_grp_nm, mcframe.commonMA.meta.MA_META.SET_GRP_NM);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta main_itm_qty_META = createCommonMeta($main_itm_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			main_itm_cd_META,
			main_itm_sub1_META,
			main_itm_sub2_META,
			main_itm_sub3_META,
			main_itm_unit_cd_META,
			set_grp_cd_META,
			set_grp_nm_META,
			base_dt_META,
			main_itm_qty_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public String main_itm_cd() {
		return getConstString(offset + 0, $main_itm_cd);
	}

	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public void main_itm_cd(String value) {
		setConstString(offset + 0, $main_itm_cd, value);
	}


	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public String main_itm_sub1() {
		return getConstString(offset + 1, $main_itm_sub1);
	}

	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public void main_itm_sub1(String value) {
		setConstString(offset + 1, $main_itm_sub1, value);
	}


	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public String main_itm_sub2() {
		return getConstString(offset + 2, $main_itm_sub2);
	}

	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public void main_itm_sub2(String value) {
		setConstString(offset + 2, $main_itm_sub2, value);
	}


	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public String main_itm_sub3() {
		return getConstString(offset + 3, $main_itm_sub3);
	}

	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public void main_itm_sub3(String value) {
		setConstString(offset + 3, $main_itm_sub3, value);
	}


	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public String main_itm_unit_cd() {
		return getConstString(offset + 4, $main_itm_unit_cd);
	}

	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public void main_itm_unit_cd(String value) {
		setConstString(offset + 4, $main_itm_unit_cd, value);
	}


	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 5, $set_grp_cd);
	}

	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 5, $set_grp_cd, value);
	}


	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public String set_grp_nm() {
		return getConstString(offset + 6, $set_grp_nm);
	}

	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public void set_grp_nm(String value) {
		setConstString(offset + 6, $set_grp_nm, value);
	}


	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 7, $base_dt);
	}

	/**
	 * Application date 適用日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 7, $base_dt, value);
	}


	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public MCNumber main_itm_qty() {
		return getConstNumber(offset + 8, $main_itm_qty);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(MCNumber value) {
		setConstNumber(offset + 8, $main_itm_qty, value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(int value) {
		setConstNumber(offset + 8, $main_itm_qty, value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(long value) {
		setConstNumber(offset + 8, $main_itm_qty, value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(float value) {
		setConstNumber(offset + 8, $main_itm_qty, value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(double value) {
		setConstNumber(offset + 8, $main_itm_qty, value);
	}


	public String getString(String name) {
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			return main_itm_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			return main_itm_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

