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
 * "自動仕訳マスタ // Auto-journal master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計伝票区分</td>
 *  	<td>Accounting slip type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>auto_jnl_key_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>自動仕訳キーＣＤ</td>
 *  	<td>Auto-journal key cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>auto_jnl_grp</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>自動仕訳グループ</td>
 *  	<td>Auto-journal group</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>jnl_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳パタンＣＤ</td>
 *  	<td>Journal pattern cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_AUTO_JNL_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_AUTO_JNL_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	private static final MCPermColumnInfo _ac_slip_typ = createColumnInfo("ac_slip_typ");
	public final MCStringPermColumn ac_slip_typ = createStringColumn(_ac_slip_typ);
	
	/**
	 * 自動仕訳キーＣＤ. Auto-journal key cd..<p>
	 *
	 */
	public static final String $auto_jnl_key_cd = "auto_jnl_key_cd";
	private static final MCPermColumnInfo _auto_jnl_key_cd = createColumnInfo("auto_jnl_key_cd");
	public final MCStringPermColumn auto_jnl_key_cd = createStringColumn(_auto_jnl_key_cd);
	
	/**
	 * 自動仕訳グループ. Auto-journal group.<p>
	 *
	 */
	public static final String $auto_jnl_grp = "auto_jnl_grp";
	private static final MCPermColumnInfo _auto_jnl_grp = createColumnInfo("auto_jnl_grp");
	public final MCStringPermColumn auto_jnl_grp = createStringColumn(_auto_jnl_grp);
	
	/**
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	private static final MCPermColumnInfo _jnl_ptn_cd = createColumnInfo("jnl_ptn_cd");
	public final MCStringPermColumn jnl_ptn_cd = createStringColumn(_jnl_ptn_cd);
	
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta auto_jnl_key_cd_META = createCommonMeta($auto_jnl_key_cd, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_CD);
	public static final MCMeta auto_jnl_grp_META = createCommonMeta($auto_jnl_grp, mcframe.commonMA.meta.MA_META.AUTO_JNL_GRP);
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_AUTO_JNL_KEY_R> constMetas = new ConstMetaList<MAW_AUTO_JNL_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ac_slip_typ_META,
			auto_jnl_key_cd_META,
			auto_jnl_grp_META,
			jnl_ptn_cd_META
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
	protected MAW_AUTO_JNL_KEY_R(ConstMetaList<? extends MAW_AUTO_JNL_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_AUTO_JNL_KEY_R(ConstMetaList<? extends MAW_AUTO_JNL_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_AUTO_JNL_KEY_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_AUTO_JNL_KEY_R.$ac_slip_typ,
				"ac_slip_typ",
				ac_slip_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_AUTO_JNL_KEY_R.$auto_jnl_key_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_AUTO_JNL_KEY_R.$auto_jnl_key_cd,
				"auto_jnl_key_cd",
				auto_jnl_key_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_AUTO_JNL_KEY_R.$auto_jnl_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_AUTO_JNL_KEY_R.$auto_jnl_grp,
				"auto_jnl_grp",
				auto_jnl_grp,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_AUTO_JNL_KEY_R.$jnl_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_AUTO_JNL_KEY_R.$jnl_ptn_cd,
				"jnl_ptn_cd",
				jnl_ptn_cd,
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
	public static MAW_AUTO_JNL_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_AUTO_JNL_KEY_R create(String alias) {
		MAW_AUTO_JNL_KEY_R row = new MAW_AUTO_JNL_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_AUTO_JNL_KEY_R createByName(T proto) {
		MAW_AUTO_JNL_KEY_R row = MAW_AUTO_JNL_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_AUTO_JNL_KEY_R clone() {
		return (MAW_AUTO_JNL_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_AUTO_JNL_KEY_R createInstance() {
		return (MAW_AUTO_JNL_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_AUTO_JNL_KEY_R getValues(String... names) {
		return (MAW_AUTO_JNL_KEY_R) super.getValues(names);
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
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 0, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 0, $ac_slip_typ, value);
	}

	/**
	 * 自動仕訳キーＣＤ. Auto-journal key cd..<p>
	 *
	 */
	public String auto_jnl_key_cd() {
		return getConstString(offset + 1, $auto_jnl_key_cd);
	}

	/**
	 * 自動仕訳キーＣＤ. Auto-journal key cd..<p>
	 *
	 */
	public void auto_jnl_key_cd(String value) {
		setConstString(offset + 1, $auto_jnl_key_cd, value);
	}

	/**
	 * 自動仕訳グループ. Auto-journal group.<p>
	 *
	 */
	public String auto_jnl_grp() {
		return getConstString(offset + 2, $auto_jnl_grp);
	}

	/**
	 * 自動仕訳グループ. Auto-journal group.<p>
	 *
	 */
	public void auto_jnl_grp(String value) {
		setConstString(offset + 2, $auto_jnl_grp, value);
	}

	/**
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 3, $jnl_ptn_cd);
	}

	/**
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 3, $jnl_ptn_cd, value);
	}

	public String getString(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			return auto_jnl_grp();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			return auto_jnl_grp();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			auto_jnl_grp(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			auto_jnl_grp(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
