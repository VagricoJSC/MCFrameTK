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
 * "計算対象通貨パラメータ情報 // (Calculation) Currency parameter info."DBコンテナRowクラスです。<p>
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
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額端数処理区分</td>
 *  	<td>Rounding type (Amount)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額小数部有効桁数</td>
 *  	<td>Amount number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ave_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価端数処理区分</td>
 *  	<td>Rounding type (Unit price)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ave_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価小数部有効桁数</td>
 *  	<td>Unit price number of decimal places</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGT_CALC_CUR_PARM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_CALC_CUR_PARM";

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
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public static final String $amt_rnd_typ = "amt_rnd_typ";
	private static final MCPermColumnInfo _amt_rnd_typ = createColumnInfo("amt_rnd_typ");
	public final MCStringPermColumn amt_rnd_typ = createStringColumn(_amt_rnd_typ);
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	private static final MCPermColumnInfo _amt_dec_place = createColumnInfo("amt_dec_place");
	public final MCNumberPermColumn amt_dec_place = createNumberColumn(_amt_dec_place);
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public static final String $ave_rnd_typ = "ave_rnd_typ";
	private static final MCPermColumnInfo _ave_rnd_typ = createColumnInfo("ave_rnd_typ");
	public final MCStringPermColumn ave_rnd_typ = createStringColumn(_ave_rnd_typ);
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public static final String $ave_dec_place = "ave_dec_place";
	private static final MCPermColumnInfo _ave_dec_place = createColumnInfo("ave_dec_place");
	public final MCNumberPermColumn ave_dec_place = createNumberColumn(_ave_dec_place);
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_rnd_typ_META = createCommonMeta($amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ave_rnd_typ_META = createCommonMeta($ave_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ave_dec_place_META = createCommonMeta($ave_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGT_CALC_CUR_PARM_R> constMetas = new ConstMetaList<MGT_CALC_CUR_PARM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			cur_cd_META,
			amt_rnd_typ_META,
			amt_dec_place_META,
			ave_rnd_typ_META,
			ave_dec_place_META
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
	protected MGT_CALC_CUR_PARM_R(ConstMetaList<? extends MGT_CALC_CUR_PARM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_CALC_CUR_PARM_R(ConstMetaList<? extends MGT_CALC_CUR_PARM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_CALC_CUR_PARM_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_CUR_PARM_R.$calc_no,
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
			MGT_CALC_CUR_PARM_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_CUR_PARM_R.$calc_grp_cd,
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
			MGT_CALC_CUR_PARM_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_CUR_PARM_R.$cur_cd,
				"cur_cd",
				cur_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_CUR_PARM_R.$amt_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_CUR_PARM_R.$amt_rnd_typ,
				"amt_rnd_typ",
				amt_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_CUR_PARM_R.$amt_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_CUR_PARM_R.$amt_dec_place,
				"amt_dec_place",
				amt_dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_CUR_PARM_R.$ave_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_CUR_PARM_R.$ave_rnd_typ,
				"ave_rnd_typ",
				ave_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_CUR_PARM_R.$ave_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_CUR_PARM_R.$ave_dec_place,
				"ave_dec_place",
				ave_dec_place,
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
	public static MGT_CALC_CUR_PARM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_CALC_CUR_PARM_R create(String alias) {
		MGT_CALC_CUR_PARM_R row = new MGT_CALC_CUR_PARM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_CALC_CUR_PARM_R createByName(T proto) {
		MGT_CALC_CUR_PARM_R row = MGT_CALC_CUR_PARM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_CUR_PARM_R clone() {
		return (MGT_CALC_CUR_PARM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_CUR_PARM_R createInstance() {
		return (MGT_CALC_CUR_PARM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_CUR_PARM_R getValues(String... names) {
		return (MGT_CALC_CUR_PARM_R) super.getValues(names);
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
		return true;
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
	 public MGW_CALC_CUR_PARM_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_CALC_CUR_PARM_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_CALC_CUR_PARM_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_CALC_CUR_PARM_KEY_R.TABLE_NAME);
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
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 2, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 2, $cur_cd, value);
	}

	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public String amt_rnd_typ() {
		return getConstString(offset + 3, $amt_rnd_typ);
	}

	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public void amt_rnd_typ(String value) {
		setConstString(offset + 3, $amt_rnd_typ, value);
	}

	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 4, $amt_dec_place);
	}

	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public String ave_rnd_typ() {
		return getConstString(offset + 5, $ave_rnd_typ);
	}

	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		setConstString(offset + 5, $ave_rnd_typ, value);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return getConstNumber(offset + 6, $ave_dec_place);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
