package mcframe.serverMS.dbc;

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
 * "債権為替差損益 // AR foreign exchange gains and losses"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>rcv_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金実績明細ＮＯ</td>
 *  	<td>Payment received result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>rcv_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金実績明細連番</td>
 *  	<td>Payment received result details sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ar_xrate_rev_his_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権為替レート評価替履歴ＮＯ</td>
 *  	<td>AR exchange rate revaluation history No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ref_ar_xrate_rev_his_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>参照債権為替レート評価替履歴ＮＯ</td>
 *  	<td>Reference AR exchange rate revaluation history No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_AR_EXC_GAIN_LOSS_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_AR_EXC_GAIN_LOSS_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	private static final MCPermColumnInfo _rcv_act_d_no = createColumnInfo("rcv_act_d_no");
	public final MCStringPermColumn rcv_act_d_no = createStringColumn(_rcv_act_d_no);
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public static final String $rcv_act_d_seq = "rcv_act_d_seq";
	private static final MCPermColumnInfo _rcv_act_d_seq = createColumnInfo("rcv_act_d_seq");
	public final MCNumberPermColumn rcv_act_d_seq = createNumberColumn(_rcv_act_d_seq);
	
	/**
	 * 債権為替レート評価替履歴ＮＯ. AR exchange rate revaluation history No..<p>
	 *
	 */
	public static final String $ar_xrate_rev_his_no = "ar_xrate_rev_his_no";
	private static final MCPermColumnInfo _ar_xrate_rev_his_no = createColumnInfo("ar_xrate_rev_his_no");
	public final MCStringPermColumn ar_xrate_rev_his_no = createStringColumn(_ar_xrate_rev_his_no);
	
	/**
	 * 参照債権為替レート評価替履歴ＮＯ. Reference AR exchange rate revaluation history No..<p>
	 *
	 */
	public static final String $ref_ar_xrate_rev_his_no = "ref_ar_xrate_rev_his_no";
	private static final MCPermColumnInfo _ref_ar_xrate_rev_his_no = createColumnInfo("ref_ar_xrate_rev_his_no");
	public final MCStringPermColumn ref_ar_xrate_rev_his_no = createStringColumn(_ref_ar_xrate_rev_his_no);
	
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ar_xrate_rev_his_no_META = createStringMeta($ar_xrate_rev_his_no, 15);
	public static final MCMeta ref_ar_xrate_rev_his_no_META = createStringMeta($ref_ar_xrate_rev_his_no, 15);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_AR_EXC_GAIN_LOSS_KEY_R> constMetas = new ConstMetaList<MSW_AR_EXC_GAIN_LOSS_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			ar_xrate_rev_his_no_META,
			ref_ar_xrate_rev_his_no_META
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
	protected MSW_AR_EXC_GAIN_LOSS_KEY_R(ConstMetaList<? extends MSW_AR_EXC_GAIN_LOSS_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_AR_EXC_GAIN_LOSS_KEY_R(ConstMetaList<? extends MSW_AR_EXC_GAIN_LOSS_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_AR_EXC_GAIN_LOSS_KEY_R.$rcv_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_AR_EXC_GAIN_LOSS_KEY_R.$rcv_act_d_no,
				"rcv_act_d_no",
				rcv_act_d_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_AR_EXC_GAIN_LOSS_KEY_R.$rcv_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_AR_EXC_GAIN_LOSS_KEY_R.$rcv_act_d_seq,
				"rcv_act_d_seq",
				rcv_act_d_seq,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_AR_EXC_GAIN_LOSS_KEY_R.$ar_xrate_rev_his_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_AR_EXC_GAIN_LOSS_KEY_R.$ar_xrate_rev_his_no,
				"ar_xrate_rev_his_no",
				ar_xrate_rev_his_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_AR_EXC_GAIN_LOSS_KEY_R.$ref_ar_xrate_rev_his_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_AR_EXC_GAIN_LOSS_KEY_R.$ref_ar_xrate_rev_his_no,
				"ref_ar_xrate_rev_his_no",
				ref_ar_xrate_rev_his_no,
				true,
				true,
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
	public static MSW_AR_EXC_GAIN_LOSS_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_AR_EXC_GAIN_LOSS_KEY_R create(String alias) {
		MSW_AR_EXC_GAIN_LOSS_KEY_R row = new MSW_AR_EXC_GAIN_LOSS_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_AR_EXC_GAIN_LOSS_KEY_R createByName(T proto) {
		MSW_AR_EXC_GAIN_LOSS_KEY_R row = MSW_AR_EXC_GAIN_LOSS_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_AR_EXC_GAIN_LOSS_KEY_R clone() {
		return (MSW_AR_EXC_GAIN_LOSS_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_AR_EXC_GAIN_LOSS_KEY_R createInstance() {
		return (MSW_AR_EXC_GAIN_LOSS_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_AR_EXC_GAIN_LOSS_KEY_R getValues(String... names) {
		return (MSW_AR_EXC_GAIN_LOSS_KEY_R) super.getValues(names);
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
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 0, $rcv_act_d_no);
	}

	/**
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 0, $rcv_act_d_no, value);
	}

	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 1, $rcv_act_d_seq);
	}

	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 債権為替レート評価替履歴ＮＯ. AR exchange rate revaluation history No..<p>
	 *
	 */
	public String ar_xrate_rev_his_no() {
		return getConstString(offset + 2, $ar_xrate_rev_his_no);
	}

	/**
	 * 債権為替レート評価替履歴ＮＯ. AR exchange rate revaluation history No..<p>
	 *
	 */
	public void ar_xrate_rev_his_no(String value) {
		setConstString(offset + 2, $ar_xrate_rev_his_no, value);
	}

	/**
	 * 参照債権為替レート評価替履歴ＮＯ. Reference AR exchange rate revaluation history No..<p>
	 *
	 */
	public String ref_ar_xrate_rev_his_no() {
		return getConstString(offset + 3, $ref_ar_xrate_rev_his_no);
	}

	/**
	 * 参照債権為替レート評価替履歴ＮＯ. Reference AR exchange rate revaluation history No..<p>
	 *
	 */
	public void ref_ar_xrate_rev_his_no(String value) {
		setConstString(offset + 3, $ref_ar_xrate_rev_his_no, value);
	}

	public String getString(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($ar_xrate_rev_his_no.equalsIgnoreCase(name)) {
			return ar_xrate_rev_his_no();
		}
		if ($ref_ar_xrate_rev_his_no.equalsIgnoreCase(name)) {
			return ref_ar_xrate_rev_his_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($ar_xrate_rev_his_no.equalsIgnoreCase(name)) {
			return ar_xrate_rev_his_no();
		}
		if ($ref_ar_xrate_rev_his_no.equalsIgnoreCase(name)) {
			return ref_ar_xrate_rev_his_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($ar_xrate_rev_his_no.equalsIgnoreCase(name)) {
			ar_xrate_rev_his_no(value);
			return;
		}
		if ($ref_ar_xrate_rev_his_no.equalsIgnoreCase(name)) {
			ref_ar_xrate_rev_his_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($ar_xrate_rev_his_no.equalsIgnoreCase(name)) {
			ar_xrate_rev_his_no(value);
			return;
		}
		if ($ref_ar_xrate_rev_his_no.equalsIgnoreCase(name)) {
			ref_ar_xrate_rev_his_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
