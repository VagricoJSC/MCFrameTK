package mcframe.serverMB.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "仕訳情報テーブル // Journal info. table"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>jnl_grp_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳グループＮＯ</td>
 *  	<td>Journal group No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ac_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上年月</td>
 *  	<td>Recording month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ac_if_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計ＩＦ区分</td>
 *  	<td>Accounting IF type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>slip_cnt_id</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票グループＩＤ</td>
 *  	<td>Slip group ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>jnl_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳伝票ＮＯ</td>
 *  	<td>Journal slip No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>jnl_no_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳伝票明細番号</td>
 *  	<td>Journal slip details number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>dc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸借区分</td>
 *  	<td>Debit and credit type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBW_JOURNAL_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MBW_JOURNAL_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 仕訳グループＮＯ. Journal group No..<p>
	 *
	 */
	public static final String $jnl_grp_no = "jnl_grp_no";
	private static final MCPermColumnInfo _jnl_grp_no = createColumnInfo("jnl_grp_no");
	public final MCStringPermColumn jnl_grp_no = createStringColumn(_jnl_grp_no);
	
	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	private static final MCPermColumnInfo _ac_ym = createColumnInfo("ac_ym");
	public final MCDatePermColumn ac_ym = createDateColumn(_ac_ym);
	
	/**
	 * 会計ＩＦ区分. Accounting IF type.<p>
	 *
	 */
	public static final String $ac_if_typ = "ac_if_typ";
	private static final MCPermColumnInfo _ac_if_typ = createColumnInfo("ac_if_typ");
	public final MCStringPermColumn ac_if_typ = createStringColumn(_ac_if_typ);
	
	/**
	 * 伝票グループＩＤ. Slip group ID.<p>
	 *
	 */
	public static final String $slip_cnt_id = "slip_cnt_id";
	private static final MCPermColumnInfo _slip_cnt_id = createColumnInfo("slip_cnt_id");
	public final MCStringPermColumn slip_cnt_id = createStringColumn(_slip_cnt_id);
	
	/**
	 * 仕訳伝票ＮＯ. Journal slip No..<p>
	 *
	 */
	public static final String $jnl_no = "jnl_no";
	private static final MCPermColumnInfo _jnl_no = createColumnInfo("jnl_no");
	public final MCStringPermColumn jnl_no = createStringColumn(_jnl_no);
	
	/**
	 * 仕訳伝票明細番号. Journal slip details number.<p>
	 *
	 */
	public static final String $jnl_no_seq = "jnl_no_seq";
	private static final MCPermColumnInfo _jnl_no_seq = createColumnInfo("jnl_no_seq");
	public final MCNumberPermColumn jnl_no_seq = createNumberColumn(_jnl_no_seq);
	
	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public static final String $dc_typ = "dc_typ";
	private static final MCPermColumnInfo _dc_typ = createColumnInfo("dc_typ");
	public final MCStringPermColumn dc_typ = createStringColumn(_dc_typ);
	
	public static final MCMeta jnl_grp_no_META = createCommonMeta($jnl_grp_no, mcframe.commonMA.meta.MA_META.JNL_GRP_NO);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_if_typ_META = createCommonMeta($ac_if_typ, mcframe.commonMA.meta.MA_META.AC_IF_TYP);
	public static final MCMeta slip_cnt_id_META = createCommonMeta($slip_cnt_id, mcframe.commonMA.meta.MA_META.SLIP_CNT_ID);
	public static final MCMeta jnl_no_META = createCommonMeta($jnl_no, mcframe.commonMA.meta.MA_META.JNL_NO);
	public static final MCMeta jnl_no_seq_META = createCommonMeta($jnl_no_seq, mcframe.commonMA.meta.MA_META.JNL_NO_SEQ);
	public static final MCMeta dc_typ_META = createCommonMeta($dc_typ, mcframe.commonMA.meta.MA_META.DC_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MBW_JOURNAL_KEY_R> constMetas = new ConstMetaList<MBW_JOURNAL_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			jnl_grp_no_META,
			ac_ym_META,
			ac_if_typ_META,
			slip_cnt_id_META,
			jnl_no_META,
			jnl_no_seq_META,
			dc_typ_META
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
	protected MBW_JOURNAL_KEY_R(ConstMetaList<? extends MBW_JOURNAL_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBW_JOURNAL_KEY_R(ConstMetaList<? extends MBW_JOURNAL_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBW_JOURNAL_KEY_R.$jnl_grp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_JOURNAL_KEY_R.$jnl_grp_no,
				"jnl_grp_no",
				jnl_grp_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_JOURNAL_KEY_R.$ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBW_JOURNAL_KEY_R.$ac_ym,
				"ac_ym",
				ac_ym,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_JOURNAL_KEY_R.$ac_if_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_JOURNAL_KEY_R.$ac_if_typ,
				"ac_if_typ",
				ac_if_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_JOURNAL_KEY_R.$slip_cnt_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_JOURNAL_KEY_R.$slip_cnt_id,
				"slip_cnt_id",
				slip_cnt_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_JOURNAL_KEY_R.$jnl_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_JOURNAL_KEY_R.$jnl_no,
				"jnl_no",
				jnl_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_JOURNAL_KEY_R.$jnl_no_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBW_JOURNAL_KEY_R.$jnl_no_seq,
				"jnl_no_seq",
				jnl_no_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_JOURNAL_KEY_R.$dc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_JOURNAL_KEY_R.$dc_typ,
				"dc_typ",
				dc_typ,
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
	public static MBW_JOURNAL_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBW_JOURNAL_KEY_R create(String alias) {
		MBW_JOURNAL_KEY_R row = new MBW_JOURNAL_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBW_JOURNAL_KEY_R createByName(T proto) {
		MBW_JOURNAL_KEY_R row = MBW_JOURNAL_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_JOURNAL_KEY_R clone() {
		return (MBW_JOURNAL_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_JOURNAL_KEY_R createInstance() {
		return (MBW_JOURNAL_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_JOURNAL_KEY_R getValues(String... names) {
		return (MBW_JOURNAL_KEY_R) super.getValues(names);
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
	 * 仕訳グループＮＯ. Journal group No..<p>
	 *
	 */
	public String jnl_grp_no() {
		return getConstString(offset + 0, $jnl_grp_no);
	}

	/**
	 * 仕訳グループＮＯ. Journal group No..<p>
	 *
	 */
	public void jnl_grp_no(String value) {
		setConstString(offset + 0, $jnl_grp_no, value);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 1, $ac_ym);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 1, $ac_ym, value);
	}

	/**
	 * 会計ＩＦ区分. Accounting IF type.<p>
	 *
	 */
	public String ac_if_typ() {
		return getConstString(offset + 2, $ac_if_typ);
	}

	/**
	 * 会計ＩＦ区分. Accounting IF type.<p>
	 *
	 */
	public void ac_if_typ(String value) {
		setConstString(offset + 2, $ac_if_typ, value);
	}

	/**
	 * 伝票グループＩＤ. Slip group ID.<p>
	 *
	 */
	public String slip_cnt_id() {
		return getConstString(offset + 3, $slip_cnt_id);
	}

	/**
	 * 伝票グループＩＤ. Slip group ID.<p>
	 *
	 */
	public void slip_cnt_id(String value) {
		setConstString(offset + 3, $slip_cnt_id, value);
	}

	/**
	 * 仕訳伝票ＮＯ. Journal slip No..<p>
	 *
	 */
	public String jnl_no() {
		return getConstString(offset + 4, $jnl_no);
	}

	/**
	 * 仕訳伝票ＮＯ. Journal slip No..<p>
	 *
	 */
	public void jnl_no(String value) {
		setConstString(offset + 4, $jnl_no, value);
	}

	/**
	 * 仕訳伝票明細番号. Journal slip details number.<p>
	 *
	 */
	public MCNumber jnl_no_seq() {
		return getConstNumber(offset + 5, $jnl_no_seq);
	}

	/**
	 * 仕訳伝票明細番号. Journal slip details number.<p>
	 *
	 */
	public void jnl_no_seq(MCNumber value) {
		setConstNumber(offset + 5, $jnl_no_seq, value);
	}
	
	/**
	 * 仕訳伝票明細番号. Journal slip details number.<p>
	 *
	 */
	public void jnl_no_seq(int value) {
		setConstNumber(offset + 5, $jnl_no_seq, value);
	}
	
	/**
	 * 仕訳伝票明細番号. Journal slip details number.<p>
	 *
	 */
	public void jnl_no_seq(long value) {
		setConstNumber(offset + 5, $jnl_no_seq, value);
	}
	
	/**
	 * 仕訳伝票明細番号. Journal slip details number.<p>
	 *
	 */
	public void jnl_no_seq(float value) {
		setConstNumber(offset + 5, $jnl_no_seq, value);
	}
	
	/**
	 * 仕訳伝票明細番号. Journal slip details number.<p>
	 *
	 */
	public void jnl_no_seq(double value) {
		setConstNumber(offset + 5, $jnl_no_seq, value);
	}
	
	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public String dc_typ() {
		return getConstString(offset + 6, $dc_typ);
	}

	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public void dc_typ(String value) {
		setConstString(offset + 6, $dc_typ, value);
	}

	public String getString(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			return slip_cnt_id();
		}
		if ($jnl_no.equalsIgnoreCase(name)) {
			return jnl_no();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			return jnl_no_seq();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			return slip_cnt_id();
		}
		if ($jnl_no.equalsIgnoreCase(name)) {
			return jnl_no();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			return jnl_no_seq();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			ac_if_typ(value);
			return;
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			slip_cnt_id(value);
			return;
		}
		if ($jnl_no.equalsIgnoreCase(name)) {
			jnl_no(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			ac_if_typ(value);
			return;
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			slip_cnt_id(value);
			return;
		}
		if ($jnl_no.equalsIgnoreCase(name)) {
			jnl_no(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
