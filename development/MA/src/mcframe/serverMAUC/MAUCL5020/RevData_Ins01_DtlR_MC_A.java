package mcframe.serverMAUC.MAUCL5020;

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
 * ブロック"RevData_Ins01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RevData_Ins01_DtlR_MC_A extends MCConstRow {

	/**
	 * Revision history data source No. 改訂履歴データ作成元ＮＯ.<p>
	 *
	 */
	public static final String $rev_data_src_no = "rev_data_src_no";
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public static final String $rev_no = "rev_no";
	/**
	 * Revision history data type 改訂履歴データ区分.<p>
	 *
	 */
	public static final String $rev_data_typ = "rev_data_typ";


	public static final MCMeta rev_data_src_no_META = createCommonMeta($rev_data_src_no, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta rev_no_META = createCommonMeta($rev_no, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta rev_data_typ_META = createCommonMeta($rev_data_typ, mcframe.commonMA.meta.MA_META.REV_DATA_TYP);

	protected static final ConstMetaList<RevData_Ins01_DtlR> constMetas = new ConstMetaList<RevData_Ins01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rev_data_src_no_META,
			rev_no_META,
			rev_data_typ_META
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
	protected RevData_Ins01_DtlR_MC_A(ConstMetaList<? extends RevData_Ins01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RevData_Ins01_DtlR clone() {
		return (RevData_Ins01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RevData_Ins01_DtlR createInstance() {
		return (RevData_Ins01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RevData_Ins01_DtlR getValues(String... names) {
		return (RevData_Ins01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Revision history data source No. 改訂履歴データ作成元ＮＯ.<p>
	 *
	 */
	public String rev_data_src_no() {
		return getConstString(offset + 0, $rev_data_src_no);
	}

	/**
	 * Revision history data source No. 改訂履歴データ作成元ＮＯ.<p>
	 *
	 */
	public void rev_data_src_no(String value) {
		setConstString(offset + 0, $rev_data_src_no, value);
	}


	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCNumber rev_no() {
		return getConstNumber(offset + 1, $rev_no);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void rev_no(MCNumber value) {
		setConstNumber(offset + 1, $rev_no, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void rev_no(int value) {
		setConstNumber(offset + 1, $rev_no, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void rev_no(long value) {
		setConstNumber(offset + 1, $rev_no, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void rev_no(float value) {
		setConstNumber(offset + 1, $rev_no, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void rev_no(double value) {
		setConstNumber(offset + 1, $rev_no, value);
	}


	/**
	 * Revision history data type 改訂履歴データ区分.<p>
	 *
	 */
	public String rev_data_typ() {
		return getConstString(offset + 2, $rev_data_typ);
	}

	/**
	 * Revision history data type 改訂履歴データ区分.<p>
	 *
	 */
	public void rev_data_typ(String value) {
		setConstString(offset + 2, $rev_data_typ, value);
	}


	public String getString(String name) {
		if ($rev_data_src_no.equalsIgnoreCase(name)) {
			return rev_data_src_no();
		}
		if ($rev_data_typ.equalsIgnoreCase(name)) {
			return rev_data_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rev_no.equalsIgnoreCase(name)) {
			return rev_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($rev_data_src_no.equalsIgnoreCase(name)) {
			return rev_data_src_no();
		}
		if ($rev_data_typ.equalsIgnoreCase(name)) {
			return rev_data_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rev_no.equalsIgnoreCase(name)) {
			return rev_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($rev_data_src_no.equalsIgnoreCase(name)) {
			rev_data_src_no(value);
			return;
		}
		if ($rev_data_typ.equalsIgnoreCase(name)) {
			rev_data_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rev_data_src_no.equalsIgnoreCase(name)) {
			rev_data_src_no(value);
			return;
		}
		if ($rev_data_typ.equalsIgnoreCase(name)) {
			rev_data_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

