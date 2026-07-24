package mcframe.serverMBBB.MBBBL5030;

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
 * ブロック"AutoJnl_Upd02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AutoJnl_Upd02_DtlR_MC_A extends mcframe.serverMB.dbc.MBW_PRE_JOURNAL_R {

	/**
	 * Inventory location type 在庫場所区分.<p>
	 *
	 */
	public static final String $inv_loc_typ = "inv_loc_typ";
	/**
	 * Accounting IF table type 会計ＩＦテーブル区分.<p>
	 *
	 */
	public static final String $table_typ = "table_typ";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";


	public static final MCMeta inv_loc_typ_META = createCommonMeta($inv_loc_typ, mcframe.commonMA.meta.MA_META.INV_LOC_TYP);
	public static final MCMeta table_typ_META = createCommonMeta($table_typ, mcframe.commonMA.meta.MA_META.AC_TABLE_TYP);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);

	protected static final ConstMetaList<AutoJnl_Upd02_DtlR> constMetas = new ConstMetaList<AutoJnl_Upd02_DtlR>(
		mcframe.serverMB.dbc.MBW_PRE_JOURNAL_R.constMetas,
		new MCMeta[]{
			inv_loc_typ_META,
			table_typ_META,
			data_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected AutoJnl_Upd02_DtlR_MC_A(ConstMetaList<? extends AutoJnl_Upd02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_Upd02_DtlR clone() {
		return (AutoJnl_Upd02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_Upd02_DtlR createInstance() {
		return (AutoJnl_Upd02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_Upd02_DtlR getValues(String... names) {
		return (AutoJnl_Upd02_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Inventory location type 在庫場所区分.<p>
	 *
	 */
	public String inv_loc_typ() {
		return getConstString(offset + 0, $inv_loc_typ);
	}

	/**
	 * Inventory location type 在庫場所区分.<p>
	 *
	 */
	public void inv_loc_typ(String value) {
		setConstString(offset + 0, $inv_loc_typ, value);
	}


	/**
	 * Accounting IF table type 会計ＩＦテーブル区分.<p>
	 *
	 */
	public String table_typ() {
		return getConstString(offset + 1, $table_typ);
	}

	/**
	 * Accounting IF table type 会計ＩＦテーブル区分.<p>
	 *
	 */
	public void table_typ(String value) {
		setConstString(offset + 1, $table_typ, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 2, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 2, $data_no, value);
	}


	public String getString(String name) {
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			return inv_loc_typ();
		}
		if ($table_typ.equalsIgnoreCase(name)) {
			return table_typ();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			return inv_loc_typ();
		}
		if ($table_typ.equalsIgnoreCase(name)) {
			return table_typ();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			inv_loc_typ(value);
			return;
		}
		if ($table_typ.equalsIgnoreCase(name)) {
			table_typ(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			inv_loc_typ(value);
			return;
		}
		if ($table_typ.equalsIgnoreCase(name)) {
			table_typ(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

