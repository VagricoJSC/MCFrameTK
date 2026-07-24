package mcframe.clientMGBD.MGBDP0300;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public static final String $tab_ctg_typ = "tab_ctg_typ";
	/**
	 * Table category type name テーブルカテゴリ区分名.<p>
	 *
	 */
	public static final String $tab_ctg_typ_nm = "tab_ctg_typ_nm";
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public static final String $list_sort = "list_sort";
	/**
	 * Table name テーブル名.<p>
	 *
	 */
	public static final String $cost_copy_typ = "cost_copy_typ";
	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public static final String $cost_copy_typ_nm = "cost_copy_typ_nm";
	/**
	 * Cost to copy type key 原価コピー対象区分キー.<p>
	 *
	 */
	public static final String $cost_copy_typ_key = "cost_copy_typ_key";
	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public static final String $module_id = "module_id";
	/**
	 * Screen ID 画面ＩＤ.<p>
	 *
	 */
	public static final String $screen_id = "screen_id";
	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public static final String $cnt_fr = "cnt_fr";
	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public static final String $cnt_to = "cnt_to";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tab_ctg_typ_META = createCommonMeta($tab_ctg_typ, mcframe.commonMG.meta.MG_META.TAB_CTG_TYP);
	public static final MCMeta tab_ctg_typ_nm_META = createCommonMeta($tab_ctg_typ_nm, mcframe.commonMG.meta.MG_META.TAB_CTG_TYP_NM);
	public static final MCMeta list_sort_META = createCommonMeta($list_sort, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cost_copy_typ_META = createCommonMeta($cost_copy_typ, mcframe.commonMG.meta.MG_META.COST_COPY_TYP);
	public static final MCMeta cost_copy_typ_nm_META = createCommonMeta($cost_copy_typ_nm, mcframe.commonMG.meta.MG_META.COST_COPY_TYP_NM);
	public static final MCMeta cost_copy_typ_key_META = createStringMeta($cost_copy_typ_key);
	public static final MCMeta module_id_META = createCommonMeta($module_id, mcframe.commonMA.meta.MA_META.MODULE_ID);
	public static final MCMeta screen_id_META = createCommonMeta($screen_id, mcframe.commonMA.meta.MA_META.SCREEN_ID);
	public static final MCMeta cnt_fr_META = createCommonMeta($cnt_fr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cnt_to_META = createCommonMeta($cnt_to, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			tab_ctg_typ_META,
			tab_ctg_typ_nm_META,
			list_sort_META,
			cost_copy_typ_META,
			cost_copy_typ_nm_META,
			cost_copy_typ_key_META,
			module_id_META,
			screen_id_META,
			cnt_fr_META,
			cnt_to_META
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
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
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public String tab_ctg_typ() {
		return getConstString(offset + 1, $tab_ctg_typ);
	}

	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public void tab_ctg_typ(String value) {
		setConstString(offset + 1, $tab_ctg_typ, value);
	}


	/**
	 * Table category type name テーブルカテゴリ区分名.<p>
	 *
	 */
	public String tab_ctg_typ_nm() {
		return getConstString(offset + 2, $tab_ctg_typ_nm);
	}

	/**
	 * Table category type name テーブルカテゴリ区分名.<p>
	 *
	 */
	public void tab_ctg_typ_nm(String value) {
		setConstString(offset + 2, $tab_ctg_typ_nm, value);
	}


	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCNumber list_sort() {
		return getConstNumber(offset + 3, $list_sort);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void list_sort(MCNumber value) {
		setConstNumber(offset + 3, $list_sort, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void list_sort(int value) {
		setConstNumber(offset + 3, $list_sort, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void list_sort(long value) {
		setConstNumber(offset + 3, $list_sort, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void list_sort(float value) {
		setConstNumber(offset + 3, $list_sort, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void list_sort(double value) {
		setConstNumber(offset + 3, $list_sort, value);
	}


	/**
	 * Table name テーブル名.<p>
	 *
	 */
	public String cost_copy_typ() {
		return getConstString(offset + 4, $cost_copy_typ);
	}

	/**
	 * Table name テーブル名.<p>
	 *
	 */
	public void cost_copy_typ(String value) {
		setConstString(offset + 4, $cost_copy_typ, value);
	}


	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public String cost_copy_typ_nm() {
		return getConstString(offset + 5, $cost_copy_typ_nm);
	}

	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public void cost_copy_typ_nm(String value) {
		setConstString(offset + 5, $cost_copy_typ_nm, value);
	}


	/**
	 * Cost to copy type key 原価コピー対象区分キー.<p>
	 *
	 */
	public String cost_copy_typ_key() {
		return getConstString(offset + 6, $cost_copy_typ_key);
	}

	/**
	 * Cost to copy type key 原価コピー対象区分キー.<p>
	 *
	 */
	public void cost_copy_typ_key(String value) {
		setConstString(offset + 6, $cost_copy_typ_key, value);
	}


	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public String module_id() {
		return getConstString(offset + 7, $module_id);
	}

	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public void module_id(String value) {
		setConstString(offset + 7, $module_id, value);
	}


	/**
	 * Screen ID 画面ＩＤ.<p>
	 *
	 */
	public String screen_id() {
		return getConstString(offset + 8, $screen_id);
	}

	/**
	 * Screen ID 画面ＩＤ.<p>
	 *
	 */
	public void screen_id(String value) {
		setConstString(offset + 8, $screen_id, value);
	}


	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public MCNumber cnt_fr() {
		return getConstNumber(offset + 9, $cnt_fr);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(MCNumber value) {
		setConstNumber(offset + 9, $cnt_fr, value);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(int value) {
		setConstNumber(offset + 9, $cnt_fr, value);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(long value) {
		setConstNumber(offset + 9, $cnt_fr, value);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(float value) {
		setConstNumber(offset + 9, $cnt_fr, value);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(double value) {
		setConstNumber(offset + 9, $cnt_fr, value);
	}


	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public MCNumber cnt_to() {
		return getConstNumber(offset + 10, $cnt_to);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(MCNumber value) {
		setConstNumber(offset + 10, $cnt_to, value);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(int value) {
		setConstNumber(offset + 10, $cnt_to, value);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(long value) {
		setConstNumber(offset + 10, $cnt_to, value);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(float value) {
		setConstNumber(offset + 10, $cnt_to, value);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(double value) {
		setConstNumber(offset + 10, $cnt_to, value);
	}


	public String getString(String name) {
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			return tab_ctg_typ();
		}
		if ($tab_ctg_typ_nm.equalsIgnoreCase(name)) {
			return tab_ctg_typ_nm();
		}
		if ($cost_copy_typ.equalsIgnoreCase(name)) {
			return cost_copy_typ();
		}
		if ($cost_copy_typ_nm.equalsIgnoreCase(name)) {
			return cost_copy_typ_nm();
		}
		if ($cost_copy_typ_key.equalsIgnoreCase(name)) {
			return cost_copy_typ_key();
		}
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($screen_id.equalsIgnoreCase(name)) {
			return screen_id();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($list_sort.equalsIgnoreCase(name)) {
			return list_sort();
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			return cnt_fr();
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			return cnt_to();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			return tab_ctg_typ();
		}
		if ($tab_ctg_typ_nm.equalsIgnoreCase(name)) {
			return tab_ctg_typ_nm();
		}
		if ($cost_copy_typ.equalsIgnoreCase(name)) {
			return cost_copy_typ();
		}
		if ($cost_copy_typ_nm.equalsIgnoreCase(name)) {
			return cost_copy_typ_nm();
		}
		if ($cost_copy_typ_key.equalsIgnoreCase(name)) {
			return cost_copy_typ_key();
		}
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($screen_id.equalsIgnoreCase(name)) {
			return screen_id();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($list_sort.equalsIgnoreCase(name)) {
			return list_sort();
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			return cnt_fr();
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			return cnt_to();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			tab_ctg_typ(value);
			return;
		}
		if ($tab_ctg_typ_nm.equalsIgnoreCase(name)) {
			tab_ctg_typ_nm(value);
			return;
		}
		if ($cost_copy_typ.equalsIgnoreCase(name)) {
			cost_copy_typ(value);
			return;
		}
		if ($cost_copy_typ_nm.equalsIgnoreCase(name)) {
			cost_copy_typ_nm(value);
			return;
		}
		if ($cost_copy_typ_key.equalsIgnoreCase(name)) {
			cost_copy_typ_key(value);
			return;
		}
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($screen_id.equalsIgnoreCase(name)) {
			screen_id(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			tab_ctg_typ(value);
			return;
		}
		if ($tab_ctg_typ_nm.equalsIgnoreCase(name)) {
			tab_ctg_typ_nm(value);
			return;
		}
		if ($cost_copy_typ.equalsIgnoreCase(name)) {
			cost_copy_typ(value);
			return;
		}
		if ($cost_copy_typ_nm.equalsIgnoreCase(name)) {
			cost_copy_typ_nm(value);
			return;
		}
		if ($cost_copy_typ_key.equalsIgnoreCase(name)) {
			cost_copy_typ_key(value);
			return;
		}
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($screen_id.equalsIgnoreCase(name)) {
			screen_id(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

