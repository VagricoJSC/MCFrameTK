package mcframe.serverMS.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "在庫分析制御情報 // Inventory analysis control info."PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>io_act_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払区分</td>
 *  	<td>GR/GI type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ctl_tgt_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>制御対象区分</td>
 *  	<td>Control target type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_STK_ANLY_CTL_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_STK_ANLY_CTL_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";
	private static final MCPermColumnInfo _io_act_typ = createColumnInfo("io_act_typ");
	public final MCStringPermColumn io_act_typ = createStringColumn(_io_act_typ);
	
	/**
	 * 制御対象区分. Control target type.<p>
	 *
	 */
	public static final String $ctl_tgt_typ = "ctl_tgt_typ";
	private static final MCPermColumnInfo _ctl_tgt_typ = createColumnInfo("ctl_tgt_typ");
	public final MCStringPermColumn ctl_tgt_typ = createStringColumn(_ctl_tgt_typ);
	
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta ctl_tgt_typ_META = createCommonMeta($ctl_tgt_typ, mcframe.commonMS.meta.MS_META.CTL_TGT_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_STK_ANLY_CTL_KEY_R> constMetas = new ConstMetaList<MSW_STK_ANLY_CTL_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			io_act_typ_META,
			ctl_tgt_typ_META
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
	protected MSW_STK_ANLY_CTL_KEY_R(ConstMetaList<? extends MSW_STK_ANLY_CTL_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_STK_ANLY_CTL_KEY_R(ConstMetaList<? extends MSW_STK_ANLY_CTL_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_STK_ANLY_CTL_KEY_R.$io_act_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_STK_ANLY_CTL_KEY_R.$io_act_typ,
				"io_act_typ",
				io_act_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_STK_ANLY_CTL_KEY_R.$ctl_tgt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_STK_ANLY_CTL_KEY_R.$ctl_tgt_typ,
				"ctl_tgt_typ",
				ctl_tgt_typ,
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
	public static MSW_STK_ANLY_CTL_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_STK_ANLY_CTL_KEY_R create(String alias) {
		MSW_STK_ANLY_CTL_KEY_R row = new MSW_STK_ANLY_CTL_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_STK_ANLY_CTL_KEY_R createByName(T proto) {
		MSW_STK_ANLY_CTL_KEY_R row = MSW_STK_ANLY_CTL_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_STK_ANLY_CTL_KEY_R clone() {
		return (MSW_STK_ANLY_CTL_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_STK_ANLY_CTL_KEY_R createInstance() {
		return (MSW_STK_ANLY_CTL_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_STK_ANLY_CTL_KEY_R getValues(String... names) {
		return (MSW_STK_ANLY_CTL_KEY_R) super.getValues(names);
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
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 0, $io_act_typ);
	}

	/**
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 0, $io_act_typ, value);
	}

	/**
	 * 制御対象区分. Control target type.<p>
	 *
	 */
	public String ctl_tgt_typ() {
		return getConstString(offset + 1, $ctl_tgt_typ);
	}

	/**
	 * 制御対象区分. Control target type.<p>
	 *
	 */
	public void ctl_tgt_typ(String value) {
		setConstString(offset + 1, $ctl_tgt_typ, value);
	}

	public String getString(String name) {
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($ctl_tgt_typ.equalsIgnoreCase(name)) {
			return ctl_tgt_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($ctl_tgt_typ.equalsIgnoreCase(name)) {
			return ctl_tgt_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($ctl_tgt_typ.equalsIgnoreCase(name)) {
			ctl_tgt_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($ctl_tgt_typ.equalsIgnoreCase(name)) {
			ctl_tgt_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
