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
 * "原価計算為替レートビュー // Cost calculation exchange rate view"DBコンテナRowクラスです。<p>
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
 *  	<td>fr_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>換算元通貨ＣＤ</td>
 *  	<td>Exchange-from currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>to_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>換算先通貨ＣＤ</td>
 *  	<td>Exchange-to currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_XRATE_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_XRATE";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 換算元通貨ＣＤ. Exchange-from currency cd..<p>
	 *
	 */
	public static final String $fr_cur_cd = "fr_cur_cd";
	private static final MCPermColumnInfo _fr_cur_cd = createColumnInfo("fr_cur_cd");
	public final MCStringPermColumn fr_cur_cd = createStringColumn(_fr_cur_cd);
	
	/**
	 * 換算先通貨ＣＤ. Exchange-to currency cd..<p>
	 *
	 */
	public static final String $to_cur_cd = "to_cur_cd";
	private static final MCPermColumnInfo _to_cur_cd = createColumnInfo("to_cur_cd");
	public final MCStringPermColumn to_cur_cd = createStringColumn(_to_cur_cd);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	public static final MCMeta fr_cur_cd_META = createCommonMeta($fr_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta to_cur_cd_META = createCommonMeta($to_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_XRATE_R> constMetas = new ConstMetaList<MGVM_XRATE_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			fr_cur_cd_META,
			to_cur_cd_META,
			xrate_META
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
	protected MGVM_XRATE_R(ConstMetaList<? extends MGVM_XRATE_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_XRATE_R(ConstMetaList<? extends MGVM_XRATE_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_XRATE_R.$fr_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_XRATE_R.$fr_cur_cd,
				"fr_cur_cd",
				fr_cur_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_XRATE_R.$to_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_XRATE_R.$to_cur_cd,
				"to_cur_cd",
				to_cur_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_XRATE_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_XRATE_R.$xrate,
				"xrate",
				xrate,
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
	public static MGVM_XRATE_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_XRATE_R create(String alias) {
		MGVM_XRATE_R row = new MGVM_XRATE_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_XRATE_R createByName(T proto) {
		MGVM_XRATE_R row = MGVM_XRATE_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_XRATE_R clone() {
		return (MGVM_XRATE_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_XRATE_R createInstance() {
		return (MGVM_XRATE_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_XRATE_R getValues(String... names) {
		return (MGVM_XRATE_R) super.getValues(names);
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
	 * 換算元通貨ＣＤ. Exchange-from currency cd..<p>
	 *
	 */
	public String fr_cur_cd() {
		return getConstString(offset + 0, $fr_cur_cd);
	}

	/**
	 * 換算元通貨ＣＤ. Exchange-from currency cd..<p>
	 *
	 */
	public void fr_cur_cd(String value) {
		setConstString(offset + 0, $fr_cur_cd, value);
	}

	/**
	 * 換算先通貨ＣＤ. Exchange-to currency cd..<p>
	 *
	 */
	public String to_cur_cd() {
		return getConstString(offset + 1, $to_cur_cd);
	}

	/**
	 * 換算先通貨ＣＤ. Exchange-to currency cd..<p>
	 *
	 */
	public void to_cur_cd(String value) {
		setConstString(offset + 1, $to_cur_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 2, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 2, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 2, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 2, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 2, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 2, $xrate, value);
	}
	
	public String getString(String name) {
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			return fr_cur_cd();
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			return to_cur_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			return fr_cur_cd();
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			return to_cur_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			fr_cur_cd(value);
			return;
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			to_cur_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			fr_cur_cd(value);
			return;
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			to_cur_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
