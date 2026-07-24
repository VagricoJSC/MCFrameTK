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
 * "発番情報 // Numbering info."PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>num_biz_typ</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発番業務区分</td>
 *  	<td>Numbering operation type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>num_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発番パタンＣＤ</td>
 *  	<td>Numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key_elm</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー要素</td>
 *  	<td>Key element</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_SEQ_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_SEQ_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public static final String $num_biz_typ = "num_biz_typ";
	private static final MCPermColumnInfo _num_biz_typ = createColumnInfo("num_biz_typ");
	public final MCStringPermColumn num_biz_typ = createStringColumn(_num_biz_typ);
	
	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public static final String $num_ptn_cd = "num_ptn_cd";
	private static final MCPermColumnInfo _num_ptn_cd = createColumnInfo("num_ptn_cd");
	public final MCStringPermColumn num_ptn_cd = createStringColumn(_num_ptn_cd);
	
	/**
	 * キー要素. Key element.<p>
	 *
	 */
	public static final String $key_elm = "key_elm";
	private static final MCPermColumnInfo _key_elm = createColumnInfo("key_elm");
	public final MCStringPermColumn key_elm = createStringColumn(_key_elm);
	
	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta key_elm_META = createCommonMeta($key_elm, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_SEQ_KEY_R> constMetas = new ConstMetaList<MAW_SEQ_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			num_biz_typ_META,
			num_ptn_cd_META,
			key_elm_META
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
	protected MAW_SEQ_KEY_R(ConstMetaList<? extends MAW_SEQ_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_SEQ_KEY_R(ConstMetaList<? extends MAW_SEQ_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_SEQ_KEY_R.$num_biz_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SEQ_KEY_R.$num_biz_typ,
				"num_biz_typ",
				num_biz_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SEQ_KEY_R.$num_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SEQ_KEY_R.$num_ptn_cd,
				"num_ptn_cd",
				num_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SEQ_KEY_R.$key_elm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SEQ_KEY_R.$key_elm,
				"key_elm",
				key_elm,
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
	public static MAW_SEQ_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_SEQ_KEY_R create(String alias) {
		MAW_SEQ_KEY_R row = new MAW_SEQ_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_SEQ_KEY_R createByName(T proto) {
		MAW_SEQ_KEY_R row = MAW_SEQ_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SEQ_KEY_R clone() {
		return (MAW_SEQ_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SEQ_KEY_R createInstance() {
		return (MAW_SEQ_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SEQ_KEY_R getValues(String... names) {
		return (MAW_SEQ_KEY_R) super.getValues(names);
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
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public String num_biz_typ() {
		return getConstString(offset + 0, $num_biz_typ);
	}

	/**
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public void num_biz_typ(String value) {
		setConstString(offset + 0, $num_biz_typ, value);
	}

	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 1, $num_ptn_cd);
	}

	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 1, $num_ptn_cd, value);
	}

	/**
	 * キー要素. Key element.<p>
	 *
	 */
	public String key_elm() {
		return getConstString(offset + 2, $key_elm);
	}

	/**
	 * キー要素. Key element.<p>
	 *
	 */
	public void key_elm(String value) {
		setConstString(offset + 2, $key_elm, value);
	}

	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			return key_elm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			return key_elm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			key_elm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			key_elm(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
