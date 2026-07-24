package mcframe.serverMS.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

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
 * "請求ワーク // Billing work"DBコンテナRowクラスです。<p>
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
 *  	<td>bill_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求管理ＮＯ</td>
 *  	<td>Billing management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求先ＣＤ</td>
 *  	<td>Billing customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求部門ＣＤ</td>
 *  	<td>Billing dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_cl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求締年月日</td>
 *  	<td>Billing closing day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求為替レート</td>
 *  	<td>Billing exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>案件ＮＯ</td>
 *  	<td>Sales project No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_bill_cl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入力締請求年月日</td>
 *  	<td>Input closing billing date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_rcv_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入力入金予定日</td>
 *  	<td>Input scheduled payment receipt date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dat_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>データカウンタ</td>
 *  	<td>Data counter</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_BILL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_BILL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	private static final MCPermColumnInfo _bill_mng_no = createColumnInfo("bill_mng_no");
	public final MCStringPermColumn bill_mng_no = createStringColumn(_bill_mng_no);
	
	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	private static final MCPermColumnInfo _bcst_cd = createColumnInfo("bcst_cd");
	public final MCStringPermColumn bcst_cd = createStringColumn(_bcst_cd);
	
	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	private static final MCPermColumnInfo _bill_dpt_cd = createColumnInfo("bill_dpt_cd");
	public final MCStringPermColumn bill_dpt_cd = createStringColumn(_bill_dpt_cd);
	
	/**
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public static final String $bill_cl_dt = "bill_cl_dt";
	private static final MCPermColumnInfo _bill_cl_dt = createColumnInfo("bill_cl_dt");
	public final MCDatePermColumn bill_cl_dt = createDateColumn(_bill_cl_dt);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
	private static final MCPermColumnInfo _bill_xrate = createColumnInfo("bill_xrate");
	public final MCNumberPermColumn bill_xrate = createNumberColumn(_bill_xrate);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
	/**
	 * 入力締請求年月日. Input closing billing date.<p>
	 *
	 */
	public static final String $inpt_bill_cl_dt = "inpt_bill_cl_dt";
	private static final MCPermColumnInfo _inpt_bill_cl_dt = createColumnInfo("inpt_bill_cl_dt");
	public final MCDatePermColumn inpt_bill_cl_dt = createDateColumn(_inpt_bill_cl_dt);
	
	/**
	 * 入力入金予定日. Input scheduled payment receipt date.<p>
	 *
	 */
	public static final String $inpt_rcv_schd_dt = "inpt_rcv_schd_dt";
	private static final MCPermColumnInfo _inpt_rcv_schd_dt = createColumnInfo("inpt_rcv_schd_dt");
	public final MCDatePermColumn inpt_rcv_schd_dt = createDateColumn(_inpt_rcv_schd_dt);
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public static final String $dat_cntr = "dat_cntr";
	private static final MCPermColumnInfo _dat_cntr = createColumnInfo("dat_cntr");
	public final MCNumberPermColumn dat_cntr = createNumberColumn(_dat_cntr);
	
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta inpt_bill_cl_dt_META = createCommonMeta($inpt_bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inpt_rcv_schd_dt_META = createCommonMeta($inpt_rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dat_cntr_META = createCommonMeta($dat_cntr, mcframe.commonMA.meta.MA_META.INT);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_BILL_R> constMetas = new ConstMetaList<MSW_BILL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bill_mng_no_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			bill_cl_dt_META,
			iv_no_META,
			trd_cur_cd_META,
			bill_xrate_META,
			wrk_no_META,
			inpt_bill_cl_dt_META,
			inpt_rcv_schd_dt_META,
			dat_cntr_META
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
	protected MSW_BILL_R(ConstMetaList<? extends MSW_BILL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_BILL_R(ConstMetaList<? extends MSW_BILL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_BILL_R.$bill_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_R.$bill_mng_no,
				"bill_mng_no",
				bill_mng_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_R.$bcst_cd,
				"bcst_cd",
				bcst_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$bill_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_R.$bill_dpt_cd,
				"bill_dpt_cd",
				bill_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$bill_cl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_BILL_R.$bill_cl_dt,
				"bill_cl_dt",
				bill_cl_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_R.$iv_no,
				"iv_no",
				iv_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$bill_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_BILL_R.$bill_xrate,
				"bill_xrate",
				bill_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_R.$wrk_no,
				"wrk_no",
				wrk_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$inpt_bill_cl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_BILL_R.$inpt_bill_cl_dt,
				"inpt_bill_cl_dt",
				inpt_bill_cl_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$inpt_rcv_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_BILL_R.$inpt_rcv_schd_dt,
				"inpt_rcv_schd_dt",
				inpt_rcv_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_R.$dat_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_BILL_R.$dat_cntr,
				"dat_cntr",
				dat_cntr,
				false,
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
	public static MSW_BILL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_BILL_R create(String alias) {
		MSW_BILL_R row = new MSW_BILL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_BILL_R createByName(T proto) {
		MSW_BILL_R row = MSW_BILL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_R clone() {
		return (MSW_BILL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_R createInstance() {
		return (MSW_BILL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_R getValues(String... names) {
		return (MSW_BILL_R) super.getValues(names);
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
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 0, $bill_mng_no);
	}

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 0, $bill_mng_no, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 1, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 1, $bcst_cd, value);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 2, $bill_dpt_cd);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 2, $bill_dpt_cd, value);
	}

	/**
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 3, $bill_cl_dt);
	}

	/**
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 3, $bill_cl_dt, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 4, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 4, $iv_no, value);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 5, $trd_cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 5, $trd_cur_cd, value);
	}

	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 6, $bill_xrate);
	}

	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 6, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 6, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 6, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 6, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 6, $bill_xrate, value);
	}
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 7, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 7, $wrk_no, value);
	}

	/**
	 * 入力締請求年月日. Input closing billing date.<p>
	 *
	 */
	public MCDate inpt_bill_cl_dt() {
		return getConstDate(offset + 8, $inpt_bill_cl_dt);
	}

	/**
	 * 入力締請求年月日. Input closing billing date.<p>
	 *
	 */
	public void inpt_bill_cl_dt(MCDate value) {
		setConstDate(offset + 8, $inpt_bill_cl_dt, value);
	}

	/**
	 * 入力入金予定日. Input scheduled payment receipt date.<p>
	 *
	 */
	public MCDate inpt_rcv_schd_dt() {
		return getConstDate(offset + 9, $inpt_rcv_schd_dt);
	}

	/**
	 * 入力入金予定日. Input scheduled payment receipt date.<p>
	 *
	 */
	public void inpt_rcv_schd_dt(MCDate value) {
		setConstDate(offset + 9, $inpt_rcv_schd_dt, value);
	}

	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public MCNumber dat_cntr() {
		return getConstNumber(offset + 10, $dat_cntr);
	}

	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(MCNumber value) {
		setConstNumber(offset + 10, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(int value) {
		setConstNumber(offset + 10, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(long value) {
		setConstNumber(offset + 10, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(float value) {
		setConstNumber(offset + 10, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(double value) {
		setConstNumber(offset + 10, $dat_cntr, value);
	}
	
	public String getString(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			return dat_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($inpt_bill_cl_dt.equalsIgnoreCase(name)) {
			return inpt_bill_cl_dt();
		}
		if ($inpt_rcv_schd_dt.equalsIgnoreCase(name)) {
			return inpt_rcv_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			return dat_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($inpt_bill_cl_dt.equalsIgnoreCase(name)) {
			return inpt_bill_cl_dt();
		}
		if ($inpt_rcv_schd_dt.equalsIgnoreCase(name)) {
			return inpt_rcv_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($inpt_bill_cl_dt.equalsIgnoreCase(name)) {
			inpt_bill_cl_dt(value);
			return;
		}
		if ($inpt_rcv_schd_dt.equalsIgnoreCase(name)) {
			inpt_rcv_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($inpt_bill_cl_dt.equalsIgnoreCase(name)) {
			inpt_bill_cl_dt(value);
			return;
		}
		if ($inpt_rcv_schd_dt.equalsIgnoreCase(name)) {
			inpt_rcv_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
