package mcframe.serverMGBF.MGBFL0400;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * Calculation setting info. (Dummy for join) 原価計算設定情報（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_term = "dummy_term";
	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public static final String $rpt_row_cd = "rpt_row_cd";
	/**
	 * Report type レポート対象区分.<p>
	 *
	 */
	public static final String $rpt_tgt_typ = "rpt_tgt_typ";
	/**
	 * Prefix 接頭語.<p>
	 *
	 */
	public static final String $rpt_pre_word = "rpt_pre_word";
	/**
	 * Report row name レポート行名.<p>
	 *
	 */
	public static final String $rpt_row_nm = "rpt_row_nm";
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
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public static final String $itm_grp_nm = "itm_grp_nm";
	public static final String $col_all = "col_all";


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta rpt_row_cd_META = createCommonMeta($rpt_row_cd, mcframe.commonMA.meta.MA_META.RPT_ROW_CD);
	public static final MCMeta rpt_tgt_typ_META = createCommonMeta($rpt_tgt_typ, mcframe.commonMA.meta.MA_META.RPT_TGT_TYP);
	public static final MCMeta rpt_pre_word_META = createCommonMeta($rpt_pre_word, mcframe.commonMA.meta.MA_META.RPT_PRE_WORD);
	public static final MCMeta rpt_row_nm_META = createCommonMeta($rpt_row_nm, mcframe.commonMA.meta.MA_META.RPT_ROW_NM);
	public static final MCMeta rpt_seq_META = createCommonMeta($rpt_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta fg_r_META = createCommonMeta($fg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_g_META = createCommonMeta($fg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_b_META = createCommonMeta($fg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_r_META = createCommonMeta($bg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_g_META = createCommonMeta($bg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_b_META = createCommonMeta($bg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta qty_unit_typ_META = createCommonMeta($qty_unit_typ, mcframe.commonMA.meta.MA_META.QTY_UNIT_TYP);
	public static final MCMeta rpt_row_view_META = createCommonMeta($rpt_row_view, mcframe.commonMA.meta.MA_META.RPT_ROW_NM);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_grp_nm_META = createCommonMeta($itm_grp_nm, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta col_all_META = createStringMeta($col_all);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
			rpt_row_cd_META,
			rpt_tgt_typ_META,
			rpt_pre_word_META,
			rpt_row_nm_META,
			rpt_seq_META,
			fg_r_META,
			fg_g_META,
			fg_b_META,
			bg_r_META,
			bg_g_META,
			bg_b_META,
			qty_unit_typ_META,
			rpt_row_view_META,
			mng_dpt_nm_META,
			itm_nm_META,
			itm_jnl_nm_META,
			itm_grp_nm_META,
			col_all_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation setting info. (Dummy for join) 原価計算設定情報（結合用ダミー）.<p>
	 *
	 */
	public MCDate dummy_term() {
		return getConstDate(offset + 0, $dummy_term);
	}

	/**
	 * Calculation setting info. (Dummy for join) 原価計算設定情報（結合用ダミー）.<p>
	 *
	 */
	public void dummy_term(MCDate value) {
		setConstDate(offset + 0, $dummy_term, value);
	}


	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public String rpt_row_cd() {
		return getConstString(offset + 1, $rpt_row_cd);
	}

	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public void rpt_row_cd(String value) {
		setConstString(offset + 1, $rpt_row_cd, value);
	}


	/**
	 * Report type レポート対象区分.<p>
	 *
	 */
	public String rpt_tgt_typ() {
		return getConstString(offset + 2, $rpt_tgt_typ);
	}

	/**
	 * Report type レポート対象区分.<p>
	 *
	 */
	public void rpt_tgt_typ(String value) {
		setConstString(offset + 2, $rpt_tgt_typ, value);
	}


	/**
	 * Prefix 接頭語.<p>
	 *
	 */
	public String rpt_pre_word() {
		return getConstString(offset + 3, $rpt_pre_word);
	}

	/**
	 * Prefix 接頭語.<p>
	 *
	 */
	public void rpt_pre_word(String value) {
		setConstString(offset + 3, $rpt_pre_word, value);
	}


	/**
	 * Report row name レポート行名.<p>
	 *
	 */
	public String rpt_row_nm() {
		return getConstString(offset + 4, $rpt_row_nm);
	}

	/**
	 * Report row name レポート行名.<p>
	 *
	 */
	public void rpt_row_nm(String value) {
		setConstString(offset + 4, $rpt_row_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber rpt_seq() {
		return getConstNumber(offset + 5, $rpt_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(MCNumber value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(int value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(long value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(float value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void rpt_seq(double value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}


	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public MCNumber fg_r() {
		return getConstNumber(offset + 6, $fg_r);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(MCNumber value) {
		setConstNumber(offset + 6, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(int value) {
		setConstNumber(offset + 6, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(long value) {
		setConstNumber(offset + 6, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(float value) {
		setConstNumber(offset + 6, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(double value) {
		setConstNumber(offset + 6, $fg_r, value);
	}


	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public MCNumber fg_g() {
		return getConstNumber(offset + 7, $fg_g);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(MCNumber value) {
		setConstNumber(offset + 7, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(int value) {
		setConstNumber(offset + 7, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(long value) {
		setConstNumber(offset + 7, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(float value) {
		setConstNumber(offset + 7, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(double value) {
		setConstNumber(offset + 7, $fg_g, value);
	}


	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public MCNumber fg_b() {
		return getConstNumber(offset + 8, $fg_b);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(MCNumber value) {
		setConstNumber(offset + 8, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(int value) {
		setConstNumber(offset + 8, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(long value) {
		setConstNumber(offset + 8, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(float value) {
		setConstNumber(offset + 8, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(double value) {
		setConstNumber(offset + 8, $fg_b, value);
	}


	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public MCNumber bg_r() {
		return getConstNumber(offset + 9, $bg_r);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(MCNumber value) {
		setConstNumber(offset + 9, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(int value) {
		setConstNumber(offset + 9, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(long value) {
		setConstNumber(offset + 9, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(float value) {
		setConstNumber(offset + 9, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(double value) {
		setConstNumber(offset + 9, $bg_r, value);
	}


	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public MCNumber bg_g() {
		return getConstNumber(offset + 10, $bg_g);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(MCNumber value) {
		setConstNumber(offset + 10, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(int value) {
		setConstNumber(offset + 10, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(long value) {
		setConstNumber(offset + 10, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(float value) {
		setConstNumber(offset + 10, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(double value) {
		setConstNumber(offset + 10, $bg_g, value);
	}


	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public MCNumber bg_b() {
		return getConstNumber(offset + 11, $bg_b);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(MCNumber value) {
		setConstNumber(offset + 11, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(int value) {
		setConstNumber(offset + 11, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(long value) {
		setConstNumber(offset + 11, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(float value) {
		setConstNumber(offset + 11, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(double value) {
		setConstNumber(offset + 11, $bg_b, value);
	}


	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public String qty_unit_typ() {
		return getConstString(offset + 12, $qty_unit_typ);
	}

	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public void qty_unit_typ(String value) {
		setConstString(offset + 12, $qty_unit_typ, value);
	}


	/**
	 * Column 項目.<p>
	 *
	 */
	public String rpt_row_view() {
		return getConstString(offset + 13, $rpt_row_view);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void rpt_row_view(String value) {
		setConstString(offset + 13, $rpt_row_view, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 14, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 14, $mng_dpt_nm, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 15, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 15, $itm_nm, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 16, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 16, $itm_jnl_nm, value);
	}


	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public String itm_grp_nm() {
		return getConstString(offset + 17, $itm_grp_nm);
	}

	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public void itm_grp_nm(String value) {
		setConstString(offset + 17, $itm_grp_nm, value);
	}


	public String col_all() {
		return getConstString(offset + 18, $col_all);
	}

	public void col_all(String value) {
		setConstString(offset + 18, $col_all, value);
	}


	public String getString(String name) {
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			return rpt_row_cd();
		}
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			return rpt_tgt_typ();
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			return rpt_pre_word();
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			return rpt_row_nm();
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
		}
		if ($rpt_row_view.equalsIgnoreCase(name)) {
			return rpt_row_view();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
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
	public MCDate getDate(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			return rpt_row_cd();
		}
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			return rpt_tgt_typ();
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			return rpt_pre_word();
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			return rpt_row_nm();
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
		}
		if ($rpt_row_view.equalsIgnoreCase(name)) {
			return rpt_row_view();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
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
	public MCDate getDateNE(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			rpt_row_cd(value);
			return;
		}
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			rpt_tgt_typ(value);
			return;
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			rpt_pre_word(value);
			return;
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			rpt_row_nm(value);
			return;
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
			return;
		}
		if ($rpt_row_view.equalsIgnoreCase(name)) {
			rpt_row_view(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
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
	public void setDate(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			rpt_row_cd(value);
			return;
		}
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			rpt_tgt_typ(value);
			return;
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			rpt_pre_word(value);
			return;
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			rpt_row_nm(value);
			return;
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
			return;
		}
		if ($rpt_row_view.equalsIgnoreCase(name)) {
			rpt_row_view(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

