package mcframe.clientMABC.MABCP2040;

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

	public static final String $module1_p = "module1_p";
	public static final String $scrn1_p = "scrn1_p";
	public static final String $module2_p = "module2_p";
	public static final String $scrn2_p = "scrn2_p";

	public static final String $module_id1 = $module1_p + ".module_id";
	public static final String $module_id_nm1 = $module1_p + ".module_id_nm";
	public static final String $scrn_id1 = $scrn1_p + ".screen_id";
	public static final String $scrn_name1 = $scrn1_p + ".screen_name";
	public static final String $module_id2 = $module2_p + ".module_id";
	public static final String $module_id_nm2 = $module2_p + ".module_id_nm";
	public static final String $scrn_id2 = $scrn2_p + ".screen_id";
	public static final String $scrn_name2 = $scrn2_p + ".screen_name";

	public static final MCMeta module1_p_META = createInnerRowMeta($module1_p, mcframe.clientFSUB.FSUBP0030.ModuleR.class);
	public static final MCMeta scrn1_p_META = createInnerRowMeta($scrn1_p, mcframe.clientFSUB.FSUBP0040.ScreenR.class);
	public static final MCMeta module2_p_META = createInnerRowMeta($module2_p, mcframe.clientFSUB.FSUBP0030.ModuleR.class);
	public static final MCMeta scrn2_p_META = createInnerRowMeta($scrn2_p, mcframe.clientFSUB.FSUBP0040.ScreenR.class);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			module1_p_META,
			scrn1_p_META,
			module2_p_META,
			scrn2_p_META
		},
		new String[][]{
			{
				"module_id1",
				"module_id_nm1",
				"scrn_id1",
				"scrn_name1",
				"module_id2",
				"module_id_nm2",
				"scrn_id2",
				"scrn_name2"
			},
			{
				$module_id1,
				$module_id_nm1,
				$scrn_id1,
				$scrn_name1,
				$module_id2,
				$module_id_nm2,
				$scrn_id2,
				$scrn_name2
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

	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$scrn1_p + ".screen_id", "module_id1"},	// scrn1_p.screen_id
				{$scrn2_p + ".screen_id", "module_id2"}	// scrn2_p.screen_id
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$scrn1_p + ".screen_id", "module_id"},	// scrn1_p.screen_id
				{$scrn2_p + ".screen_id", "module_id"}	// scrn2_p.screen_id
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



	public mcframe.clientFSUB.FSUBP0030.ModuleR module1_p(){
		return (mcframe.clientFSUB.FSUBP0030.ModuleR) getConstInnerRow(offset + 0, $module1_p);
	}
	
	public void module1_p(mcframe.clientFSUB.FSUBP0030.ModuleR row){
		setConstInnerRow(offset + 0, $module1_p, row);
	}


	public mcframe.clientFSUB.FSUBP0040.ScreenR scrn1_p(){
		return (mcframe.clientFSUB.FSUBP0040.ScreenR) getConstInnerRow(offset + 1, $scrn1_p);
	}
	
	public void scrn1_p(mcframe.clientFSUB.FSUBP0040.ScreenR row){
		setConstInnerRow(offset + 1, $scrn1_p, row);
	}


	public mcframe.clientFSUB.FSUBP0030.ModuleR module2_p(){
		return (mcframe.clientFSUB.FSUBP0030.ModuleR) getConstInnerRow(offset + 2, $module2_p);
	}
	
	public void module2_p(mcframe.clientFSUB.FSUBP0030.ModuleR row){
		setConstInnerRow(offset + 2, $module2_p, row);
	}


	public mcframe.clientFSUB.FSUBP0040.ScreenR scrn2_p(){
		return (mcframe.clientFSUB.FSUBP0040.ScreenR) getConstInnerRow(offset + 3, $scrn2_p);
	}
	
	public void scrn2_p(mcframe.clientFSUB.FSUBP0040.ScreenR row){
		setConstInnerRow(offset + 3, $scrn2_p, row);
	}






	public MCRow getInnerRow(String name) {
		if ($module1_p.equalsIgnoreCase(name)) {
			return module1_p();
		}
		if ($scrn1_p.equalsIgnoreCase(name)) {
			return scrn1_p();
		}
		if ($module2_p.equalsIgnoreCase(name)) {
			return module2_p();
		}
		if ($scrn2_p.equalsIgnoreCase(name)) {
			return scrn2_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($module1_p.equalsIgnoreCase(name)) {
			module1_p(
				((MCContainerMeta) module1_p_META).castInnerRow(mcframe.clientFSUB.FSUBP0030.ModuleR.class, value)
			);
			return;
		}
		if ($scrn1_p.equalsIgnoreCase(name)) {
			scrn1_p(
				((MCContainerMeta) scrn1_p_META).castInnerRow(mcframe.clientFSUB.FSUBP0040.ScreenR.class, value)
			);
			return;
		}
		if ($module2_p.equalsIgnoreCase(name)) {
			module2_p(
				((MCContainerMeta) module2_p_META).castInnerRow(mcframe.clientFSUB.FSUBP0030.ModuleR.class, value)
			);
			return;
		}
		if ($scrn2_p.equalsIgnoreCase(name)) {
			scrn2_p(
				((MCContainerMeta) scrn2_p_META).castInnerRow(mcframe.clientFSUB.FSUBP0040.ScreenR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Module ID 1 モジュールＩＤ１.<p>
	 *
	 */
	public String module_id1() {
		return module1_p().module_id();
	}

	/**
	 * Module ID 1 モジュールＩＤ１.<p>
	 *
	 */
	public void module_id1(String value) {
		module1_p().module_id(value);
	}

	/**
	 * Module name 1 モジュール名１.<p>
	 *
	 */
	public String module_id_nm1() {
		return module1_p().module_id_nm();
	}

	/**
	 * Module name 1 モジュール名１.<p>
	 *
	 */
	public void module_id_nm1(String value) {
		module1_p().module_id_nm(value);
	}

	/**
	 * Screen ID 1 画面ＩＤ１.<p>
	 *
	 */
	public String scrn_id1() {
		return scrn1_p().screen_id();
	}

	/**
	 * Screen ID 1 画面ＩＤ１.<p>
	 *
	 */
	public void scrn_id1(String value) {
		scrn1_p().screen_id(value);
	}

	/**
	 * Screen name 1 画面名１.<p>
	 *
	 */
	public String scrn_name1() {
		return scrn1_p().screen_name();
	}

	/**
	 * Screen name 1 画面名１.<p>
	 *
	 */
	public void scrn_name1(String value) {
		scrn1_p().screen_name(value);
	}

	/**
	 * Module ID 2 モジュールＩＤ２.<p>
	 *
	 */
	public String module_id2() {
		return module2_p().module_id();
	}

	/**
	 * Module ID 2 モジュールＩＤ２.<p>
	 *
	 */
	public void module_id2(String value) {
		module2_p().module_id(value);
	}

	/**
	 * Module name 2 モジュール名２.<p>
	 *
	 */
	public String module_id_nm2() {
		return module2_p().module_id_nm();
	}

	/**
	 * Module name 2 モジュール名２.<p>
	 *
	 */
	public void module_id_nm2(String value) {
		module2_p().module_id_nm(value);
	}

	/**
	 * Screen ID 2 画面ＩＤ２.<p>
	 *
	 */
	public String scrn_id2() {
		return scrn2_p().screen_id();
	}

	/**
	 * Screen ID 2 画面ＩＤ２.<p>
	 *
	 */
	public void scrn_id2(String value) {
		scrn2_p().screen_id(value);
	}

	/**
	 * Screen name 2 画面名２.<p>
	 *
	 */
	public String scrn_name2() {
		return scrn2_p().screen_name();
	}

	/**
	 * Screen name 2 画面名２.<p>
	 *
	 */
	public void scrn_name2(String value) {
		scrn2_p().screen_name(value);
	}

}

