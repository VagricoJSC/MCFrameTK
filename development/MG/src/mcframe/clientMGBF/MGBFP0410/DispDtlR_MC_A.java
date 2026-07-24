package mcframe.clientMGBF.MGBFP0410;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"DispDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DispDtlR_MC_A extends MCConstRow {

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $rpt_seq = "rpt_seq";
	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public static final String $fg_r = "fg_r";
	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public static final String $fg_g = "fg_g";
	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public static final String $fg_b = "fg_b";
	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public static final String $bg_r = "bg_r";
	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public static final String $bg_g = "bg_g";
	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public static final String $bg_b = "bg_b";
	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public static final String $qty_unit_typ = "qty_unit_typ";
	/**
	 * Column 項目.<p>
	 *
	 */
	public static final String $rpt_row_view = "rpt_row_view";
	public static final String $col_all = "col_all";


	public static final MCMeta rpt_seq_META = createCommonMeta($rpt_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta fg_r_META = createCommonMeta($fg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_g_META = createCommonMeta($fg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_b_META = createCommonMeta($fg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_r_META = createCommonMeta($bg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_g_META = createCommonMeta($bg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_b_META = createCommonMeta($bg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta qty_unit_typ_META = createCommonMeta($qty_unit_typ, mcframe.commonMA.meta.MA_META.QTY_UNIT_TYP);
	public static final MCMeta rpt_row_view_META = createCommonMeta($rpt_row_view, mcframe.commonMA.meta.MA_META.RPT_ROW_NM);
	public static final MCMeta col_all_META = createStringMeta($col_all);

	protected static final ConstMetaList<DispDtlR> constMetas = new ConstMetaList<DispDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rpt_seq_META,
			fg_r_META,
			fg_g_META,
			fg_b_META,
			bg_r_META,
			bg_g_META,
			bg_b_META,
			qty_unit_typ_META,
			rpt_row_view_META,
			col_all_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		))
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected DispDtlR_MC_A(ConstMetaList<? extends DispDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispDtlR clone() {
		return (DispDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispDtlR createInstance() {
		return (DispDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispDtlR getValues(String... names) {
		return (DispDtlR) super.getValues(names);
	}



	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber rpt_seq() {
		return getConstNumber(offset + 0, $rpt_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(MCNumber value) {
		setConstNumber(offset + 0, $rpt_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(int value) {
		setConstNumber(offset + 0, $rpt_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(long value) {
		setConstNumber(offset + 0, $rpt_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(float value) {
		setConstNumber(offset + 0, $rpt_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(double value) {
		setConstNumber(offset + 0, $rpt_seq, value);
	}


	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public MCNumber fg_r() {
		return getConstNumber(offset + 1, $fg_r);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(MCNumber value) {
		setConstNumber(offset + 1, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(int value) {
		setConstNumber(offset + 1, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(long value) {
		setConstNumber(offset + 1, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(float value) {
		setConstNumber(offset + 1, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(double value) {
		setConstNumber(offset + 1, $fg_r, value);
	}


	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public MCNumber fg_g() {
		return getConstNumber(offset + 2, $fg_g);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(MCNumber value) {
		setConstNumber(offset + 2, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(int value) {
		setConstNumber(offset + 2, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(long value) {
		setConstNumber(offset + 2, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(float value) {
		setConstNumber(offset + 2, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(double value) {
		setConstNumber(offset + 2, $fg_g, value);
	}


	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public MCNumber fg_b() {
		return getConstNumber(offset + 3, $fg_b);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(MCNumber value) {
		setConstNumber(offset + 3, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(int value) {
		setConstNumber(offset + 3, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(long value) {
		setConstNumber(offset + 3, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(float value) {
		setConstNumber(offset + 3, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(double value) {
		setConstNumber(offset + 3, $fg_b, value);
	}


	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public MCNumber bg_r() {
		return getConstNumber(offset + 4, $bg_r);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(MCNumber value) {
		setConstNumber(offset + 4, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(int value) {
		setConstNumber(offset + 4, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(long value) {
		setConstNumber(offset + 4, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(float value) {
		setConstNumber(offset + 4, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(double value) {
		setConstNumber(offset + 4, $bg_r, value);
	}


	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public MCNumber bg_g() {
		return getConstNumber(offset + 5, $bg_g);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(MCNumber value) {
		setConstNumber(offset + 5, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(int value) {
		setConstNumber(offset + 5, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(long value) {
		setConstNumber(offset + 5, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(float value) {
		setConstNumber(offset + 5, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(double value) {
		setConstNumber(offset + 5, $bg_g, value);
	}


	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public MCNumber bg_b() {
		return getConstNumber(offset + 6, $bg_b);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(MCNumber value) {
		setConstNumber(offset + 6, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(int value) {
		setConstNumber(offset + 6, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(long value) {
		setConstNumber(offset + 6, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(float value) {
		setConstNumber(offset + 6, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(double value) {
		setConstNumber(offset + 6, $bg_b, value);
	}


	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public String qty_unit_typ() {
		return getConstString(offset + 7, $qty_unit_typ);
	}

	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public void qty_unit_typ(String value) {
		setConstString(offset + 7, $qty_unit_typ, value);
	}


	/**
	 * Column 項目.<p>
	 *
	 */
	public String rpt_row_view() {
		return getConstString(offset + 8, $rpt_row_view);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void rpt_row_view(String value) {
		setConstString(offset + 8, $rpt_row_view, value);
	}


	public String col_all() {
		return getConstString(offset + 9, $col_all);
	}

	public void col_all(String value) {
		setConstString(offset + 9, $col_all, value);
	}


	public String getString(String name) {
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
		}
		if ($rpt_row_view.equalsIgnoreCase(name)) {
			return rpt_row_view();
		}
		if ($col_all.equalsIgnoreCase(name)) {
			return col_all();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			return rpt_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
		}
		if ($rpt_row_view.equalsIgnoreCase(name)) {
			return rpt_row_view();
		}
		if ($col_all.equalsIgnoreCase(name)) {
			return col_all();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			return rpt_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
			return;
		}
		if ($rpt_row_view.equalsIgnoreCase(name)) {
			rpt_row_view(value);
			return;
		}
		if ($col_all.equalsIgnoreCase(name)) {
			col_all(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
			return;
		}
		if ($rpt_row_view.equalsIgnoreCase(name)) {
			rpt_row_view(value);
			return;
		}
		if ($col_all.equalsIgnoreCase(name)) {
			col_all(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

