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
 * "承認情報明細 // Approval info. details"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>aprv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認ＮＯ</td>
 *  	<td>Approval No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>aprv_no_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認ＮＯ連番</td>
 *  	<td>Approval sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ</td>
 *  	<td>Approval role cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主担当者ＣＤ</td>
 *  	<td>Main PIC cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBW_APRV_D_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MBW_APRV_D_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	private static final MCPermColumnInfo _aprv_no = createColumnInfo("aprv_no");
	public final MCStringPermColumn aprv_no = createStringColumn(_aprv_no);
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public static final String $aprv_no_seq = "aprv_no_seq";
	private static final MCPermColumnInfo _aprv_no_seq = createColumnInfo("aprv_no_seq");
	public final MCNumberPermColumn aprv_no_seq = createNumberColumn(_aprv_no_seq);
	
	/**
	 * 承認役割ＣＤ. Approval role cd..<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	private static final MCPermColumnInfo _aprv_role_cd = createColumnInfo("aprv_role_cd");
	public final MCStringPermColumn aprv_role_cd = createStringColumn(_aprv_role_cd);
	
	/**
	 * 主担当者ＣＤ. Main PIC cd..<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	private static final MCPermColumnInfo _aprv_usr_cd = createColumnInfo("aprv_usr_cd");
	public final MCStringPermColumn aprv_usr_cd = createStringColumn(_aprv_usr_cd);
	
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_no_seq_META = createCommonMeta($aprv_no_seq, mcframe.commonMA.meta.MA_META.APRV_NO_SEQ);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MBW_APRV_D_KEY_R> constMetas = new ConstMetaList<MBW_APRV_D_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			aprv_no_META,
			aprv_no_seq_META,
			aprv_role_cd_META,
			aprv_usr_cd_META
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
	protected MBW_APRV_D_KEY_R(ConstMetaList<? extends MBW_APRV_D_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBW_APRV_D_KEY_R(ConstMetaList<? extends MBW_APRV_D_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBW_APRV_D_KEY_R.$aprv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_D_KEY_R.$aprv_no,
				"aprv_no",
				aprv_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_D_KEY_R.$aprv_no_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBW_APRV_D_KEY_R.$aprv_no_seq,
				"aprv_no_seq",
				aprv_no_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_D_KEY_R.$aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_D_KEY_R.$aprv_role_cd,
				"aprv_role_cd",
				aprv_role_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_D_KEY_R.$aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_D_KEY_R.$aprv_usr_cd,
				"aprv_usr_cd",
				aprv_usr_cd,
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
	public static MBW_APRV_D_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBW_APRV_D_KEY_R create(String alias) {
		MBW_APRV_D_KEY_R row = new MBW_APRV_D_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBW_APRV_D_KEY_R createByName(T proto) {
		MBW_APRV_D_KEY_R row = MBW_APRV_D_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_APRV_D_KEY_R clone() {
		return (MBW_APRV_D_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_APRV_D_KEY_R createInstance() {
		return (MBW_APRV_D_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_APRV_D_KEY_R getValues(String... names) {
		return (MBW_APRV_D_KEY_R) super.getValues(names);
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
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 0, $aprv_no);
	}

	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 0, $aprv_no, value);
	}

	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public MCNumber aprv_no_seq() {
		return getConstNumber(offset + 1, $aprv_no_seq);
	}

	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(MCNumber value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(int value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(long value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(float value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(double value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認役割ＣＤ. Approval role cd..<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 2, $aprv_role_cd);
	}

	/**
	 * 承認役割ＣＤ. Approval role cd..<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 2, $aprv_role_cd, value);
	}

	/**
	 * 主担当者ＣＤ. Main PIC cd..<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 3, $aprv_usr_cd);
	}

	/**
	 * 主担当者ＣＤ. Main PIC cd..<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 3, $aprv_usr_cd, value);
	}

	public String getString(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
