package mcframe.serverMA.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "一次配賦先部門マスタ // Departmental alloc. destination dept. master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>pre_alc_dpt_ptn</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦先部門パタン</td>
 *  	<td>Allocation destination department pattern</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>src_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦元部門ＣＤ</td>
 *  	<td>Allocation source dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>dst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦先部門ＣＤ</td>
 *  	<td>Allocation destination dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_PRE_ALC_DPT_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_PRE_ALC_DPT_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 配賦先部門パタン. Allocation destination department pattern.<p>
	 *
	 */
	public static final String $pre_alc_dpt_ptn = "pre_alc_dpt_ptn";
	private static final MCPermColumnInfo _pre_alc_dpt_ptn = createColumnInfo("pre_alc_dpt_ptn");
	public final MCStringPermColumn pre_alc_dpt_ptn = createStringColumn(_pre_alc_dpt_ptn);
	
	/**
	 * 配賦元部門ＣＤ. Allocation source dept. cd..<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	private static final MCPermColumnInfo _src_dpt_cd = createColumnInfo("src_dpt_cd");
	public final MCStringPermColumn src_dpt_cd = createStringColumn(_src_dpt_cd);
	
	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public static final String $dst_dpt_cd = "dst_dpt_cd";
	private static final MCPermColumnInfo _dst_dpt_cd = createColumnInfo("dst_dpt_cd");
	public final MCStringPermColumn dst_dpt_cd = createStringColumn(_dst_dpt_cd);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	public static final MCMeta pre_alc_dpt_ptn_META = createCommonMeta($pre_alc_dpt_ptn, mcframe.commonMA.meta.MA_META.PRE_ALC_DPT_PTN);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dst_dpt_cd_META = createCommonMeta($dst_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_PRE_ALC_DPT_KEY_R> constMetas = new ConstMetaList<MAW_PRE_ALC_DPT_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pre_alc_dpt_ptn_META,
			src_dpt_cd_META,
			dst_dpt_cd_META,
			term_META
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
	protected MAW_PRE_ALC_DPT_KEY_R(ConstMetaList<? extends MAW_PRE_ALC_DPT_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_PRE_ALC_DPT_KEY_R(ConstMetaList<? extends MAW_PRE_ALC_DPT_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_PRE_ALC_DPT_KEY_R.$pre_alc_dpt_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PRE_ALC_DPT_KEY_R.$pre_alc_dpt_ptn,
				"pre_alc_dpt_ptn",
				pre_alc_dpt_ptn,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PRE_ALC_DPT_KEY_R.$src_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PRE_ALC_DPT_KEY_R.$src_dpt_cd,
				"src_dpt_cd",
				src_dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PRE_ALC_DPT_KEY_R.$dst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PRE_ALC_DPT_KEY_R.$dst_dpt_cd,
				"dst_dpt_cd",
				dst_dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PRE_ALC_DPT_KEY_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAW_PRE_ALC_DPT_KEY_R.$term,
				"term",
				term,
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
	public static MAW_PRE_ALC_DPT_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_PRE_ALC_DPT_KEY_R create(String alias) {
		MAW_PRE_ALC_DPT_KEY_R row = new MAW_PRE_ALC_DPT_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_PRE_ALC_DPT_KEY_R createByName(T proto) {
		MAW_PRE_ALC_DPT_KEY_R row = MAW_PRE_ALC_DPT_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PRE_ALC_DPT_KEY_R clone() {
		return (MAW_PRE_ALC_DPT_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PRE_ALC_DPT_KEY_R createInstance() {
		return (MAW_PRE_ALC_DPT_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PRE_ALC_DPT_KEY_R getValues(String... names) {
		return (MAW_PRE_ALC_DPT_KEY_R) super.getValues(names);
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
	 * 配賦先部門パタン. Allocation destination department pattern.<p>
	 *
	 */
	public String pre_alc_dpt_ptn() {
		return getConstString(offset + 0, $pre_alc_dpt_ptn);
	}

	/**
	 * 配賦先部門パタン. Allocation destination department pattern.<p>
	 *
	 */
	public void pre_alc_dpt_ptn(String value) {
		setConstString(offset + 0, $pre_alc_dpt_ptn, value);
	}

	/**
	 * 配賦元部門ＣＤ. Allocation source dept. cd..<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 1, $src_dpt_cd);
	}

	/**
	 * 配賦元部門ＣＤ. Allocation source dept. cd..<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 1, $src_dpt_cd, value);
	}

	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public String dst_dpt_cd() {
		return getConstString(offset + 2, $dst_dpt_cd);
	}

	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public void dst_dpt_cd(String value) {
		setConstString(offset + 2, $dst_dpt_cd, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 3, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 3, $term, value);
	}

	public String getString(String name) {
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			return pre_alc_dpt_ptn();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			return dst_dpt_cd();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			return pre_alc_dpt_ptn();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			return dst_dpt_cd();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			pre_alc_dpt_ptn(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			dst_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			pre_alc_dpt_ptn(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			dst_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
