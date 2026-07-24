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
 * ブロック"Upd01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_RsltR_MC_A extends MCConstRow {

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $rowno = "rowno";
	/**
	 * Column ID 項目ID.<p>
	 *
	 */
	public static final String $id = "id";
	/**
	 * Data types データ型.<p>
	 *
	 */
	public static final String $type = "type";
	/**
	 * Value (String) 値（文字列）.<p>
	 *
	 */
	public static final String $STRING = "STRING";
	/**
	 * Value (Numeric) 値（数値）.<p>
	 *
	 */
	public static final String $NUMBER = "NUMBER";
	/**
	 * Value (Logical value) 値（論理値）.<p>
	 *
	 */
	public static final String $BOOLEAN = "BOOLEAN";
	/**
	 * Value (date and time) 値（日時）.<p>
	 *
	 */
	public static final String $DATE = "DATE";
	/**
	 * Value (Time stamp) 値（タイムスタンプ）.<p>
	 *
	 */
	public static final String $TIMESTAMP = "TIMESTAMP";
	/**
	 * Value (Binary) 値（バイナリ）.<p>
	 *
	 */
	public static final String $BINARY = "BINARY";


	public static final MCMeta rowno_META = createNumberMeta($rowno);
	public static final MCMeta id_META = createStringMeta($id);
	public static final MCMeta type_META = createStringMeta($type);
	public static final MCMeta STRING_META = createStringMeta($STRING);
	public static final MCMeta NUMBER_META = createNumberMeta($NUMBER);
	public static final MCMeta BOOLEAN_META = createBooleanMeta($BOOLEAN);
	public static final MCMeta DATE_META = createDateMeta($DATE);
	public static final MCMeta TIMESTAMP_META = createTimestampMeta($TIMESTAMP);
	public static final MCMeta BINARY_META = createBinaryMeta($BINARY);

	protected static final ConstMetaList<Upd01_RsltR> constMetas = new ConstMetaList<Upd01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rowno_META,
			id_META,
			type_META,
			STRING_META,
			NUMBER_META,
			BOOLEAN_META,
			DATE_META,
			TIMESTAMP_META,
			BINARY_META
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
	protected Upd01_RsltR_MC_A(ConstMetaList<? extends Upd01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_RsltR clone() {
		return (Upd01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_RsltR createInstance() {
		return (Upd01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_RsltR getValues(String... names) {
		return (Upd01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber rowno() {
		return getConstNumber(offset + 0, $rowno);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void rowno(MCNumber value) {
		setConstNumber(offset + 0, $rowno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void rowno(int value) {
		setConstNumber(offset + 0, $rowno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void rowno(long value) {
		setConstNumber(offset + 0, $rowno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void rowno(float value) {
		setConstNumber(offset + 0, $rowno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void rowno(double value) {
		setConstNumber(offset + 0, $rowno, value);
	}


	/**
	 * Column ID 項目ID.<p>
	 *
	 */
	public String id() {
		return getConstString(offset + 1, $id);
	}

	/**
	 * Column ID 項目ID.<p>
	 *
	 */
	public void id(String value) {
		setConstString(offset + 1, $id, value);
	}


	/**
	 * Data types データ型.<p>
	 *
	 */
	public String type() {
		return getConstString(offset + 2, $type);
	}

	/**
	 * Data types データ型.<p>
	 *
	 */
	public void type(String value) {
		setConstString(offset + 2, $type, value);
	}


	/**
	 * Value (String) 値（文字列）.<p>
	 *
	 */
	public String STRING() {
		return getConstString(offset + 3, $STRING);
	}

	/**
	 * Value (String) 値（文字列）.<p>
	 *
	 */
	public void STRING(String value) {
		setConstString(offset + 3, $STRING, value);
	}


	/**
	 * Value (Numeric) 値（数値）.<p>
	 *
	 */
	public MCNumber NUMBER() {
		return getConstNumber(offset + 4, $NUMBER);
	}

	/**
	 * Value (Numeric) 値（数値）.<p>
	 *
	 */
	public void NUMBER(MCNumber value) {
		setConstNumber(offset + 4, $NUMBER, value);
	}

	/**
	 * Value (Numeric) 値（数値）.<p>
	 *
	 */
	public void NUMBER(int value) {
		setConstNumber(offset + 4, $NUMBER, value);
	}

	/**
	 * Value (Numeric) 値（数値）.<p>
	 *
	 */
	public void NUMBER(long value) {
		setConstNumber(offset + 4, $NUMBER, value);
	}

	/**
	 * Value (Numeric) 値（数値）.<p>
	 *
	 */
	public void NUMBER(float value) {
		setConstNumber(offset + 4, $NUMBER, value);
	}

	/**
	 * Value (Numeric) 値（数値）.<p>
	 *
	 */
	public void NUMBER(double value) {
		setConstNumber(offset + 4, $NUMBER, value);
	}


	/**
	 * Value (Logical value) 値（論理値）.<p>
	 *
	 */
	public boolean BOOLEAN() {
		return getConstBoolean(offset + 5, $BOOLEAN);
	}

	/**
	 * Value (Logical value) 値（論理値）.<p>
	 *
	 */
	public void BOOLEAN(boolean value) {
		setConstBoolean(offset + 5, $BOOLEAN, value);
	}


	/**
	 * Value (date and time) 値（日時）.<p>
	 *
	 */
	public MCDate DATE() {
		return getConstDate(offset + 6, $DATE);
	}

	/**
	 * Value (date and time) 値（日時）.<p>
	 *
	 */
	public void DATE(MCDate value) {
		setConstDate(offset + 6, $DATE, value);
	}


	/**
	 * Value (Time stamp) 値（タイムスタンプ）.<p>
	 *
	 */
	public MCTimestamp TIMESTAMP() {
		return getConstTimestamp(offset + 7, $TIMESTAMP);
	}

	/**
	 * Value (Time stamp) 値（タイムスタンプ）.<p>
	 *
	 */
	public void TIMESTAMP(MCTimestamp value) {
		setConstTimestamp(offset + 7, $TIMESTAMP, value);
	}


	/**
	 * Value (Binary) 値（バイナリ）.<p>
	 *
	 */
	public MCBinary BINARY() {
		return getConstBinary(offset + 8, $BINARY);
	}

	/**
	 * Value (Binary) 値（バイナリ）.<p>
	 *
	 */
	public void BINARY(MCBinary value) {
		setConstBinary(offset + 8, $BINARY, value);
	}


	public String getString(String name) {
		if ($id.equalsIgnoreCase(name)) {
			return id();
		}
		if ($type.equalsIgnoreCase(name)) {
			return type();
		}
		if ($STRING.equalsIgnoreCase(name)) {
			return STRING();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rowno.equalsIgnoreCase(name)) {
			return rowno();
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			return NUMBER();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($DATE.equalsIgnoreCase(name)) {
			return DATE();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($TIMESTAMP.equalsIgnoreCase(name)) {
			return TIMESTAMP();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($BOOLEAN.equalsIgnoreCase(name)) {
			return BOOLEAN();
		}
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		if ($BINARY.equalsIgnoreCase(name)) {
			return BINARY();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($id.equalsIgnoreCase(name)) {
			return id();
		}
		if ($type.equalsIgnoreCase(name)) {
			return type();
		}
		if ($STRING.equalsIgnoreCase(name)) {
			return STRING();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rowno.equalsIgnoreCase(name)) {
			return rowno();
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			return NUMBER();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($DATE.equalsIgnoreCase(name)) {
			return DATE();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($TIMESTAMP.equalsIgnoreCase(name)) {
			return TIMESTAMP();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($BOOLEAN.equalsIgnoreCase(name)) {
			return BOOLEAN();
		}
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($BINARY.equalsIgnoreCase(name)) {
			return BINARY();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($STRING.equalsIgnoreCase(name)) {
			STRING(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($DATE.equalsIgnoreCase(name)) {
			DATE(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($TIMESTAMP.equalsIgnoreCase(name)) {
			TIMESTAMP(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($BOOLEAN.equalsIgnoreCase(name)) {
			BOOLEAN(value);
			return;
		}
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		if ($BINARY.equalsIgnoreCase(name)) {
			BINARY(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($STRING.equalsIgnoreCase(name)) {
			STRING(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rowno.equalsIgnoreCase(name)) {
			rowno(value);
			return;
		}
		if ($NUMBER.equalsIgnoreCase(name)) {
			NUMBER(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($DATE.equalsIgnoreCase(name)) {
			DATE(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($TIMESTAMP.equalsIgnoreCase(name)) {
			TIMESTAMP(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($BOOLEAN.equalsIgnoreCase(name)) {
			BOOLEAN(value);
			return;
		}
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		if ($BINARY.equalsIgnoreCase(name)) {
			BINARY(value);
			return;
		}
		super.setBinaryNE(name, value);
	}



}

