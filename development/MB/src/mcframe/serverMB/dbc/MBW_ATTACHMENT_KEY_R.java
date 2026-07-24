package mcframe.serverMB.dbc;

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
 * "添付ファイル情報 // Attachement file info."PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>data_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>帳票管理ＮＯ</td>
 *  	<td>Report management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>edition</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>版</td>
 *  	<td>Version</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBW_ATTACHMENT_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MBW_ATTACHMENT_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 帳票管理ＮＯ. Report management No..<p>
	 *
	 */
	public static final String $data_no = "data_no";
	private static final MCPermColumnInfo _data_no = createColumnInfo("data_no");
	public final MCStringPermColumn data_no = createStringColumn(_data_no);
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public static final String $edition = "edition";
	private static final MCPermColumnInfo _edition = createColumnInfo("edition");
	public final MCNumberPermColumn edition = createNumberColumn(_edition);
	
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);
	public static final MCMeta edition_META = createCommonMeta($edition, mcframe.commonMA.meta.MA_META.SLIP_REV);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MBW_ATTACHMENT_KEY_R> constMetas = new ConstMetaList<MBW_ATTACHMENT_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_no_META,
			edition_META
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
	protected MBW_ATTACHMENT_KEY_R(ConstMetaList<? extends MBW_ATTACHMENT_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBW_ATTACHMENT_KEY_R(ConstMetaList<? extends MBW_ATTACHMENT_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBW_ATTACHMENT_KEY_R.$data_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_ATTACHMENT_KEY_R.$data_no,
				"data_no",
				data_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_ATTACHMENT_KEY_R.$edition,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBW_ATTACHMENT_KEY_R.$edition,
				"edition",
				edition,
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
	public static MBW_ATTACHMENT_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBW_ATTACHMENT_KEY_R create(String alias) {
		MBW_ATTACHMENT_KEY_R row = new MBW_ATTACHMENT_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBW_ATTACHMENT_KEY_R createByName(T proto) {
		MBW_ATTACHMENT_KEY_R row = MBW_ATTACHMENT_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_ATTACHMENT_KEY_R clone() {
		return (MBW_ATTACHMENT_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_ATTACHMENT_KEY_R createInstance() {
		return (MBW_ATTACHMENT_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_ATTACHMENT_KEY_R getValues(String... names) {
		return (MBW_ATTACHMENT_KEY_R) super.getValues(names);
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
	 * 帳票管理ＮＯ. Report management No..<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 0, $data_no);
	}

	/**
	 * 帳票管理ＮＯ. Report management No..<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 0, $data_no, value);
	}

	/**
	 * 版. Version.<p>
	 *
	 */
	public MCNumber edition() {
		return getConstNumber(offset + 1, $edition);
	}

	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(MCNumber value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(int value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(long value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(float value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(double value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	public String getString(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
