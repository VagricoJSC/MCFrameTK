package mcframe.serverMA.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "振込手数料マスタ // Transfer fee master"PKワークテーブルDBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>min_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>下限金額</td>
 *  	<td>Min. amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>max_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>上限金額</td>
 *  	<td>Max. amount</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>rcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金先ＣＤ</td>
 *  	<td>Payer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>com_paid</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>振込手数料</td>
 *  	<td>Transfer fee</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_COM_PAID_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_COM_PAID_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public static final String $min_amt = "min_amt";
	private static final MCPermColumnInfo _min_amt = createColumnInfo("min_amt");
	public final MCNumberPermColumn min_amt = createNumberColumn(_min_amt);
	
	/**
	 * 上限金額. Max. amount.<p>
	 *
	 */
	public static final String $max_amt = "max_amt";
	private static final MCPermColumnInfo _max_amt = createColumnInfo("max_amt");
	public final MCNumberPermColumn max_amt = createNumberColumn(_max_amt);
	
	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	private static final MCPermColumnInfo _rcst_cd = createColumnInfo("rcst_cd");
	public final MCStringPermColumn rcst_cd = createStringColumn(_rcst_cd);
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public static final String $com_paid = "com_paid";
	private static final MCPermColumnInfo _com_paid = createColumnInfo("com_paid");
	public final MCNumberPermColumn com_paid = createNumberColumn(_com_paid);
	
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta min_amt_META = createCommonMeta($min_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta max_amt_META = createCommonMeta($max_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta com_paid_META = createCommonMeta($com_paid, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_COM_PAID_KEY_R> constMetas = new ConstMetaList<MAW_COM_PAID_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cur_cd_META,
			min_amt_META,
			max_amt_META,
			rcst_cd_META,
			com_paid_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected MAW_COM_PAID_KEY_R(ConstMetaList<? extends MAW_COM_PAID_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_COM_PAID_KEY_R(ConstMetaList<? extends MAW_COM_PAID_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_COM_PAID_KEY_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COM_PAID_KEY_R.$cur_cd,
				"cur_cd",
				cur_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COM_PAID_KEY_R.$min_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_COM_PAID_KEY_R.$min_amt,
				"min_amt",
				min_amt,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COM_PAID_KEY_R.$max_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_COM_PAID_KEY_R.$max_amt,
				"max_amt",
				max_amt,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COM_PAID_KEY_R.$rcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COM_PAID_KEY_R.$rcst_cd,
				"rcst_cd",
				rcst_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COM_PAID_KEY_R.$com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_COM_PAID_KEY_R.$com_paid,
				"com_paid",
				com_paid,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_COM_PAID_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_COM_PAID_KEY_R create(String alias) {
		MAW_COM_PAID_KEY_R row = new MAW_COM_PAID_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_COM_PAID_KEY_R createByName(T proto) {
		MAW_COM_PAID_KEY_R row = MAW_COM_PAID_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COM_PAID_KEY_R clone() {
		return (MAW_COM_PAID_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COM_PAID_KEY_R createInstance() {
		return (MAW_COM_PAID_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COM_PAID_KEY_R getValues(String... names) {
		return (MAW_COM_PAID_KEY_R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 0, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 0, $cur_cd, value);
	}

	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public MCNumber min_amt() {
		return getConstNumber(offset + 1, $min_amt);
	}

	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(MCNumber value) {
		setConstNumber(offset + 1, $min_amt, value);
	}
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(int value) {
		setConstNumber(offset + 1, $min_amt, value);
	}
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(long value) {
		setConstNumber(offset + 1, $min_amt, value);
	}
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(float value) {
		setConstNumber(offset + 1, $min_amt, value);
	}
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(double value) {
		setConstNumber(offset + 1, $min_amt, value);
	}
	
	/**
	 * 上限金額. Max. amount.<p>
	 *
	 */
	public MCNumber max_amt() {
		return getConstNumber(offset + 2, $max_amt);
	}

	/**
	 * 上限金額. Max. amount.<p>
	 *
	 */
	public void max_amt(MCNumber value) {
		setConstNumber(offset + 2, $max_amt, value);
	}
	
	/**
	 * 上限金額. Max. amount.<p>
	 *
	 */
	public void max_amt(int value) {
		setConstNumber(offset + 2, $max_amt, value);
	}
	
	/**
	 * 上限金額. Max. amount.<p>
	 *
	 */
	public void max_amt(long value) {
		setConstNumber(offset + 2, $max_amt, value);
	}
	
	/**
	 * 上限金額. Max. amount.<p>
	 *
	 */
	public void max_amt(float value) {
		setConstNumber(offset + 2, $max_amt, value);
	}
	
	/**
	 * 上限金額. Max. amount.<p>
	 *
	 */
	public void max_amt(double value) {
		setConstNumber(offset + 2, $max_amt, value);
	}
	
	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 3, $rcst_cd);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 3, $rcst_cd, value);
	}

	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public MCNumber com_paid() {
		return getConstNumber(offset + 4, $com_paid);
	}

	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		setConstNumber(offset + 4, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(int value) {
		setConstNumber(offset + 4, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(long value) {
		setConstNumber(offset + 4, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(float value) {
		setConstNumber(offset + 4, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(double value) {
		setConstNumber(offset + 4, $com_paid, value);
	}
	
	public String getString(String name) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($min_amt.equalsIgnoreCase(name)) {
			return min_amt();
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			return max_amt();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($min_amt.equalsIgnoreCase(name)) {
			return min_amt();
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			return max_amt();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($max_amt.equalsIgnoreCase(name)) {
			max_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
