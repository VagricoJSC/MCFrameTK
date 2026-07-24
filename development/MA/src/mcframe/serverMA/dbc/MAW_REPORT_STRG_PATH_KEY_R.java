package mcframe.serverMA.dbc;

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
 * "帳票保存先マスタ // Report storage location master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>biz_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務区分</td>
 *  	<td>Business type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_REPORT_STRG_PATH_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_REPORT_STRG_PATH_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 業務区分. Business type.<p>
	 *
	 */
	public static final String $biz_typ = "biz_typ";
	private static final MCPermColumnInfo _biz_typ = createColumnInfo("biz_typ");
	public final MCStringPermColumn biz_typ = createStringColumn(_biz_typ);
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_REPORT_STRG_PATH_KEY_R> constMetas = new ConstMetaList<MAW_REPORT_STRG_PATH_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			biz_typ_META,
			bp_cd_META
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
	protected MAW_REPORT_STRG_PATH_KEY_R(ConstMetaList<? extends MAW_REPORT_STRG_PATH_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_REPORT_STRG_PATH_KEY_R(ConstMetaList<? extends MAW_REPORT_STRG_PATH_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_REPORT_STRG_PATH_KEY_R.$biz_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_REPORT_STRG_PATH_KEY_R.$biz_typ,
				"biz_typ",
				biz_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_REPORT_STRG_PATH_KEY_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_REPORT_STRG_PATH_KEY_R.$bp_cd,
				"bp_cd",
				bp_cd,
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
	public static MAW_REPORT_STRG_PATH_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_REPORT_STRG_PATH_KEY_R create(String alias) {
		MAW_REPORT_STRG_PATH_KEY_R row = new MAW_REPORT_STRG_PATH_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_REPORT_STRG_PATH_KEY_R createByName(T proto) {
		MAW_REPORT_STRG_PATH_KEY_R row = MAW_REPORT_STRG_PATH_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_REPORT_STRG_PATH_KEY_R clone() {
		return (MAW_REPORT_STRG_PATH_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_REPORT_STRG_PATH_KEY_R createInstance() {
		return (MAW_REPORT_STRG_PATH_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_REPORT_STRG_PATH_KEY_R getValues(String... names) {
		return (MAW_REPORT_STRG_PATH_KEY_R) super.getValues(names);
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
	 * 業務区分. Business type.<p>
	 *
	 */
	public String biz_typ() {
		return getConstString(offset + 0, $biz_typ);
	}

	/**
	 * 業務区分. Business type.<p>
	 *
	 */
	public void biz_typ(String value) {
		setConstString(offset + 0, $biz_typ, value);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 1, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 1, $bp_cd, value);
	}

	public String getString(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
