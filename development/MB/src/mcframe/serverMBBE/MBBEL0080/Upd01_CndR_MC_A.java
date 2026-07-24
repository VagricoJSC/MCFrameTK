package mcframe.serverMBBE.MBBEL0080;

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
 * ブロック"Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Import operation 取込オペレーション.<p>
	 *
	 */
	public static final String $imp_ope = "imp_ope";
	/**
	 * Module ID モジュールID.<p>
	 *
	 */
	public static final String $moduleid = "moduleid";
	/**
	 * Screen ID 画面ID.<p>
	 *
	 */
	public static final String $screenid = "screenid";
	/**
	 * Table テーブル.<p>
	 *
	 */
	public static final String $table = "table";
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public static final String $if_proc_typ = "if_proc_typ";


	public static final MCMeta imp_ope_META = createStringMeta($imp_ope);
	public static final MCMeta moduleid_META = createStringMeta($moduleid);
	public static final MCMeta screenid_META = createStringMeta($screenid);
	public static final MCMeta table_META = createStringMeta($table);
	public static final MCMeta if_proc_typ_META = createStringMeta($if_proc_typ);

	protected static final ConstMetaList<Upd01_CndR> constMetas = new ConstMetaList<Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			imp_ope_META,
			moduleid_META,
			screenid_META,
			table_META,
			if_proc_typ_META
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
	protected Upd01_CndR_MC_A(ConstMetaList<? extends Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CndR clone() {
		return (Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CndR createInstance() {
		return (Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CndR getValues(String... names) {
		return (Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Import operation 取込オペレーション.<p>
	 *
	 */
	public String imp_ope() {
		return getConstString(offset + 0, $imp_ope);
	}

	/**
	 * Import operation 取込オペレーション.<p>
	 *
	 */
	public void imp_ope(String value) {
		setConstString(offset + 0, $imp_ope, value);
	}


	/**
	 * Module ID モジュールID.<p>
	 *
	 */
	public String moduleid() {
		return getConstString(offset + 1, $moduleid);
	}

	/**
	 * Module ID モジュールID.<p>
	 *
	 */
	public void moduleid(String value) {
		setConstString(offset + 1, $moduleid, value);
	}


	/**
	 * Screen ID 画面ID.<p>
	 *
	 */
	public String screenid() {
		return getConstString(offset + 2, $screenid);
	}

	/**
	 * Screen ID 画面ID.<p>
	 *
	 */
	public void screenid(String value) {
		setConstString(offset + 2, $screenid, value);
	}


	/**
	 * Table テーブル.<p>
	 *
	 */
	public String table() {
		return getConstString(offset + 3, $table);
	}

	/**
	 * Table テーブル.<p>
	 *
	 */
	public void table(String value) {
		setConstString(offset + 3, $table, value);
	}


	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return getConstString(offset + 4, $if_proc_typ);
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		setConstString(offset + 4, $if_proc_typ, value);
	}


	public String getString(String name) {
		if ($imp_ope.equalsIgnoreCase(name)) {
			return imp_ope();
		}
		if ($moduleid.equalsIgnoreCase(name)) {
			return moduleid();
		}
		if ($screenid.equalsIgnoreCase(name)) {
			return screenid();
		}
		if ($table.equalsIgnoreCase(name)) {
			return table();
		}
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($imp_ope.equalsIgnoreCase(name)) {
			return imp_ope();
		}
		if ($moduleid.equalsIgnoreCase(name)) {
			return moduleid();
		}
		if ($screenid.equalsIgnoreCase(name)) {
			return screenid();
		}
		if ($table.equalsIgnoreCase(name)) {
			return table();
		}
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($imp_ope.equalsIgnoreCase(name)) {
			imp_ope(value);
			return;
		}
		if ($moduleid.equalsIgnoreCase(name)) {
			moduleid(value);
			return;
		}
		if ($screenid.equalsIgnoreCase(name)) {
			screenid(value);
			return;
		}
		if ($table.equalsIgnoreCase(name)) {
			table(value);
			return;
		}
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($imp_ope.equalsIgnoreCase(name)) {
			imp_ope(value);
			return;
		}
		if ($moduleid.equalsIgnoreCase(name)) {
			moduleid(value);
			return;
		}
		if ($screenid.equalsIgnoreCase(name)) {
			screenid(value);
			return;
		}
		if ($table.equalsIgnoreCase(name)) {
			table(value);
			return;
		}
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

