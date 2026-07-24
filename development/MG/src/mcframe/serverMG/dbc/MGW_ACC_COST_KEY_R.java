package mcframe.serverMG.dbc;

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
 * "原価展開情報（原価計算結果） // Cost explosion info. (Calculation result)"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>inpt_rec_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入レコードＮＯ</td>
 *  	<td>Input record No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wk_rec_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工数レコードＮＯ</td>
 *  	<td>Man-hour record No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>oper_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程実績ＮＯ</td>
 *  	<td>Operation result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_ACC_COST_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_ACC_COST_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	private static final MCPermColumnInfo _calc_no = createColumnInfo("calc_no");
	public final MCStringPermColumn calc_no = createStringColumn(_calc_no);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public static final String $inpt_rec_no = "inpt_rec_no";
	private static final MCPermColumnInfo _inpt_rec_no = createColumnInfo("inpt_rec_no");
	public final MCNumberPermColumn inpt_rec_no = createNumberColumn(_inpt_rec_no);
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public static final String $wk_rec_no = "wk_rec_no";
	private static final MCPermColumnInfo _wk_rec_no = createColumnInfo("wk_rec_no");
	public final MCNumberPermColumn wk_rec_no = createNumberColumn(_wk_rec_no);
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	private static final MCPermColumnInfo _oper_act_no = createColumnInfo("oper_act_no");
	public final MCStringPermColumn oper_act_no = createStringColumn(_oper_act_no);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	private static final MCPermColumnInfo _oper_seq = createColumnInfo("oper_seq");
	public final MCNumberPermColumn oper_seq = createNumberColumn(_oper_seq);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta inpt_rec_no_META = createCommonMeta($inpt_rec_no, mcframe.commonMG.meta.MG_META.INPT_REC_NO);
	public static final MCMeta wk_rec_no_META = createCommonMeta($wk_rec_no, mcframe.commonMG.meta.MG_META.WK_REC_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MGW_ACC_COST_KEY_R> constMetas = new ConstMetaList<MGW_ACC_COST_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			inpt_rec_no_META,
			wk_rec_no_META,
			oper_act_no_META,
			oper_cd_META,
			oper_seq_META,
			expns_cd_META
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
	protected MGW_ACC_COST_KEY_R(ConstMetaList<? extends MGW_ACC_COST_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_ACC_COST_KEY_R(ConstMetaList<? extends MGW_ACC_COST_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_ACC_COST_KEY_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_COST_KEY_R.$calc_no,
				"calc_no",
				calc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_COST_KEY_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_COST_KEY_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_COST_KEY_R.$inpt_rec_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_COST_KEY_R.$inpt_rec_no,
				"inpt_rec_no",
				inpt_rec_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_COST_KEY_R.$wk_rec_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_COST_KEY_R.$wk_rec_no,
				"wk_rec_no",
				wk_rec_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_COST_KEY_R.$oper_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_COST_KEY_R.$oper_act_no,
				"oper_act_no",
				oper_act_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_COST_KEY_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_COST_KEY_R.$oper_cd,
				"oper_cd",
				oper_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_COST_KEY_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_COST_KEY_R.$oper_seq,
				"oper_seq",
				oper_seq,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_COST_KEY_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_COST_KEY_R.$expns_cd,
				"expns_cd",
				expns_cd,
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
	public static MGW_ACC_COST_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ACC_COST_KEY_R create(String alias) {
		MGW_ACC_COST_KEY_R row = new MGW_ACC_COST_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_ACC_COST_KEY_R createByName(T proto) {
		MGW_ACC_COST_KEY_R row = MGW_ACC_COST_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACC_COST_KEY_R clone() {
		return (MGW_ACC_COST_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACC_COST_KEY_R createInstance() {
		return (MGW_ACC_COST_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACC_COST_KEY_R getValues(String... names) {
		return (MGW_ACC_COST_KEY_R) super.getValues(names);
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
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 0, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 0, $calc_no, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}

	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public MCNumber inpt_rec_no() {
		return getConstNumber(offset + 2, $inpt_rec_no);
	}

	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(MCNumber value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(int value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(long value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(float value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(double value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public MCNumber wk_rec_no() {
		return getConstNumber(offset + 3, $wk_rec_no);
	}

	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(MCNumber value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(int value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(long value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(float value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(double value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 4, $oper_act_no);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 4, $oper_act_no, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 5, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 5, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 6, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 7, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 7, $expns_cd, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			return inpt_rec_no();
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			return wk_rec_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			return inpt_rec_no();
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			return wk_rec_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
