package mcframe.clientMGBD.MGBDP0030;

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
 * ブロック"MenuList"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MenuListR_MC_A extends MCConstRow {

	public static final String $menu_no = "menu_no";
	public static final String $module_id = "module_id";
	public static final String $scrn_id = "scrn_id";


	public static final MCMeta menu_no_META = createCommonMeta($menu_no, mcframe.commonMA.meta.MA_META.MENU_NO);
	public static final MCMeta module_id_META = createCommonMeta($module_id, mcframe.commonMA.meta.MA_META.MODULE_ID);
	public static final MCMeta scrn_id_META = createCommonMeta($scrn_id, mcframe.commonMA.meta.MA_META.SCREEN_ID);

	protected static final ConstMetaList<MenuListR> constMetas = new ConstMetaList<MenuListR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			menu_no_META,
			module_id_META,
			scrn_id_META
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
	protected MenuListR_MC_A(ConstMetaList<? extends MenuListR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MenuListR clone() {
		return (MenuListR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MenuListR createInstance() {
		return (MenuListR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MenuListR getValues(String... names) {
		return (MenuListR) super.getValues(names);
	}



	public MCNumber menu_no() {
		return getConstNumber(offset + 0, $menu_no);
	}

	public void menu_no(MCNumber value) {
		setConstNumber(offset + 0, $menu_no, value);
	}

	public void menu_no(int value) {
		setConstNumber(offset + 0, $menu_no, value);
	}

	public void menu_no(long value) {
		setConstNumber(offset + 0, $menu_no, value);
	}

	public void menu_no(float value) {
		setConstNumber(offset + 0, $menu_no, value);
	}

	public void menu_no(double value) {
		setConstNumber(offset + 0, $menu_no, value);
	}


	public String module_id() {
		return getConstString(offset + 1, $module_id);
	}

	public void module_id(String value) {
		setConstString(offset + 1, $module_id, value);
	}


	public String scrn_id() {
		return getConstString(offset + 2, $scrn_id);
	}

	public void scrn_id(String value) {
		setConstString(offset + 2, $scrn_id, value);
	}


	public String getString(String name) {
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($scrn_id.equalsIgnoreCase(name)) {
			return scrn_id();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($menu_no.equalsIgnoreCase(name)) {
			return menu_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($scrn_id.equalsIgnoreCase(name)) {
			return scrn_id();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($menu_no.equalsIgnoreCase(name)) {
			return menu_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($scrn_id.equalsIgnoreCase(name)) {
			scrn_id(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($scrn_id.equalsIgnoreCase(name)) {
			scrn_id(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

