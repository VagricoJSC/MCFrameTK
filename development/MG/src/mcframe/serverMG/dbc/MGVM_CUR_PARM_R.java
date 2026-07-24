package mcframe.serverMG.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

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
 * "原価計算通貨パラメータビュー // Cost calculation currency parameter view"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>amt_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額端数処理区分</td>
 *  	<td>Rounding type (Amount)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額小数部有効桁数</td>
 *  	<td>Amount number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ave_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価端数処理区分</td>
 *  	<td>Rounding type (Unit price)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ave_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価小数部有効桁数</td>
 *  	<td>Unit price number of decimal places</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_CUR_PARM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_CUR_PARM";

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
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public static final String $amt_rnd_typ = "amt_rnd_typ";
	private static final MCPermColumnInfo _amt_rnd_typ = createColumnInfo("amt_rnd_typ");
	public final MCStringPermColumn amt_rnd_typ = createStringColumn(_amt_rnd_typ);
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	private static final MCPermColumnInfo _amt_dec_place = createColumnInfo("amt_dec_place");
	public final MCNumberPermColumn amt_dec_place = createNumberColumn(_amt_dec_place);
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public static final String $ave_rnd_typ = "ave_rnd_typ";
	private static final MCPermColumnInfo _ave_rnd_typ = createColumnInfo("ave_rnd_typ");
	public final MCStringPermColumn ave_rnd_typ = createStringColumn(_ave_rnd_typ);
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public static final String $ave_dec_place = "ave_dec_place";
	private static final MCPermColumnInfo _ave_dec_place = createColumnInfo("ave_dec_place");
	public final MCNumberPermColumn ave_dec_place = createNumberColumn(_ave_dec_place);
	
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_rnd_typ_META = createCommonMeta($amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ave_rnd_typ_META = createCommonMeta($ave_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ave_dec_place_META = createCommonMeta($ave_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_CUR_PARM_R> constMetas = new ConstMetaList<MGVM_CUR_PARM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cur_cd_META,
			amt_rnd_typ_META,
			amt_dec_place_META,
			ave_rnd_typ_META,
			ave_dec_place_META
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
	protected MGVM_CUR_PARM_R(ConstMetaList<? extends MGVM_CUR_PARM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_CUR_PARM_R(ConstMetaList<? extends MGVM_CUR_PARM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_CUR_PARM_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_CUR_PARM_R.$cur_cd,
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
			MGVM_CUR_PARM_R.$amt_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_CUR_PARM_R.$amt_rnd_typ,
				"amt_rnd_typ",
				amt_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_CUR_PARM_R.$amt_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_CUR_PARM_R.$amt_dec_place,
				"amt_dec_place",
				amt_dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_CUR_PARM_R.$ave_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_CUR_PARM_R.$ave_rnd_typ,
				"ave_rnd_typ",
				ave_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_CUR_PARM_R.$ave_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_CUR_PARM_R.$ave_dec_place,
				"ave_dec_place",
				ave_dec_place,
				false,
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
	public static MGVM_CUR_PARM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_CUR_PARM_R create(String alias) {
		MGVM_CUR_PARM_R row = new MGVM_CUR_PARM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_CUR_PARM_R createByName(T proto) {
		MGVM_CUR_PARM_R row = MGVM_CUR_PARM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_CUR_PARM_R clone() {
		return (MGVM_CUR_PARM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_CUR_PARM_R createInstance() {
		return (MGVM_CUR_PARM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_CUR_PARM_R getValues(String... names) {
		return (MGVM_CUR_PARM_R) super.getValues(names);
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
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public String amt_rnd_typ() {
		return getConstString(offset + 1, $amt_rnd_typ);
	}

	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public void amt_rnd_typ(String value) {
		setConstString(offset + 1, $amt_rnd_typ, value);
	}

	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 2, $amt_dec_place);
	}

	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 2, $amt_dec_place, value);
	}
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public String ave_rnd_typ() {
		return getConstString(offset + 3, $ave_rnd_typ);
	}

	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		setConstString(offset + 3, $ave_rnd_typ, value);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return getConstNumber(offset + 4, $ave_dec_place);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		setConstNumber(offset + 4, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		setConstNumber(offset + 4, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		setConstNumber(offset + 4, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		setConstNumber(offset + 4, $ave_dec_place, value);
	}
	
	public String getString(String name) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
