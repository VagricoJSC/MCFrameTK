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
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価計算任意基準値配賦ビュー // Cost calculation optional value allocation view"DBコンテナRowクラスです。<p>
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
 *  	<td>alc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦パタンＣＤ</td>
 *  	<td>Allocation pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>alc_val_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦基準値区分</td>
 *  	<td>Allocation value type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>minus_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マイナスＦＬＧ</td>
 *  	<td>Minus flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_ALC_OTHER_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_ALC_OTHER";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	private static final MCPermColumnInfo _alc_ptn_cd = createColumnInfo("alc_ptn_cd");
	public final MCStringPermColumn alc_ptn_cd = createStringColumn(_alc_ptn_cd);
	
	/**
	 * 配賦基準値区分. Allocation value type.<p>
	 *
	 */
	public static final String $alc_val_typ = "alc_val_typ";
	private static final MCPermColumnInfo _alc_val_typ = createColumnInfo("alc_val_typ");
	public final MCStringPermColumn alc_val_typ = createStringColumn(_alc_val_typ);
	
	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public static final String $minus_flg = "minus_flg";
	private static final MCPermColumnInfo _minus_flg = createColumnInfo("minus_flg");
	public final MCBooleanPermColumn minus_flg = createBooleanColumn(_minus_flg);
	
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta alc_val_typ_META = createCommonMeta($alc_val_typ, mcframe.commonMA.meta.MA_META.ALC_VAL_TYP);
	public static final MCMeta minus_flg_META = createCommonMeta($minus_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_ALC_OTHER_R> constMetas = new ConstMetaList<MGVM_ALC_OTHER_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			alc_ptn_cd_META,
			alc_val_typ_META,
			minus_flg_META
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
	protected MGVM_ALC_OTHER_R(ConstMetaList<? extends MGVM_ALC_OTHER_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_ALC_OTHER_R(ConstMetaList<? extends MGVM_ALC_OTHER_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_ALC_OTHER_R.$alc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_OTHER_R.$alc_ptn_cd,
				"alc_ptn_cd",
				alc_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_OTHER_R.$alc_val_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_OTHER_R.$alc_val_typ,
				"alc_val_typ",
				alc_val_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_OTHER_R.$minus_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVM_ALC_OTHER_R.$minus_flg,
				"minus_flg",
				minus_flg,
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
	public static MGVM_ALC_OTHER_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_ALC_OTHER_R create(String alias) {
		MGVM_ALC_OTHER_R row = new MGVM_ALC_OTHER_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_ALC_OTHER_R createByName(T proto) {
		MGVM_ALC_OTHER_R row = MGVM_ALC_OTHER_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_OTHER_R clone() {
		return (MGVM_ALC_OTHER_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_OTHER_R createInstance() {
		return (MGVM_ALC_OTHER_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_OTHER_R getValues(String... names) {
		return (MGVM_ALC_OTHER_R) super.getValues(names);
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
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 0, $alc_ptn_cd);
	}

	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 0, $alc_ptn_cd, value);
	}

	/**
	 * 配賦基準値区分. Allocation value type.<p>
	 *
	 */
	public String alc_val_typ() {
		return getConstString(offset + 1, $alc_val_typ);
	}

	/**
	 * 配賦基準値区分. Allocation value type.<p>
	 *
	 */
	public void alc_val_typ(String value) {
		setConstString(offset + 1, $alc_val_typ, value);
	}

	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public boolean minus_flg() {
		return getConstBoolean(offset + 2, $minus_flg);
	}

	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public void minus_flg(boolean value) {
		setConstBoolean(offset + 2, $minus_flg, value);
	}

	public String getString(String name) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_val_typ.equalsIgnoreCase(name)) {
			return alc_val_typ();
		}
		return super.getString(name);
	}

	public boolean getBoolean(String name) {
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_val_typ.equalsIgnoreCase(name)) {
			return alc_val_typ();
		}
		return super.getStringNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_val_typ.equalsIgnoreCase(name)) {
			alc_val_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_val_typ.equalsIgnoreCase(name)) {
			alc_val_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
