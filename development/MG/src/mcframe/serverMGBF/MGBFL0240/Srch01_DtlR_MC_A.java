package mcframe.serverMGBF.MGBFL0240;

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
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $rpt_seq = "rpt_seq";
	/**
	 * Report type レポート対象区分.<p>
	 *
	 */
	public static final String $rpt_tgt_typ = "rpt_tgt_typ";
	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public static final String $rpt_row_cd = "rpt_row_cd";
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
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public static final String $rpt_key_typ = "rpt_key_typ";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd1 = "alc_ac_grp_cd1";
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd2 = "alc_ac_grp_cd2";
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd3 = "alc_ac_grp_cd3";
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd2 = "itm_jnl_cd2";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Cost GR/GI type 原価入出庫区分.<p>
	 *
	 */
	public static final String $cost_io_typ = "cost_io_typ";
	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public static final String $qty_unit_typ = "qty_unit_typ";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	public static final String $col_all = "col_all";


	public static final MCMeta rpt_seq_META = createCommonMeta($rpt_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta rpt_tgt_typ_META = createCommonMeta($rpt_tgt_typ, mcframe.commonMA.meta.MA_META.RPT_TGT_TYP);
	public static final MCMeta rpt_row_cd_META = createCommonMeta($rpt_row_cd, mcframe.commonMA.meta.MA_META.RPT_ROW_CD);
	public static final MCMeta rpt_pre_word_META = createCommonMeta($rpt_pre_word, mcframe.commonMA.meta.MA_META.RPT_PRE_WORD);
	public static final MCMeta rpt_row_nm_META = createCommonMeta($rpt_row_nm, mcframe.commonMA.meta.MA_META.RPT_ROW_NM);
	public static final MCMeta fg_r_META = createCommonMeta($fg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_g_META = createCommonMeta($fg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_b_META = createCommonMeta($fg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_r_META = createCommonMeta($bg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_g_META = createCommonMeta($bg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_b_META = createCommonMeta($bg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta rpt_key_typ_META = createCommonMeta($rpt_key_typ, mcframe.commonMA.meta.MA_META.RPT_KEY_TYP);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta alc_ac_grp_cd1_META = createCommonMeta($alc_ac_grp_cd1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_cd2_META = createCommonMeta($alc_ac_grp_cd2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_cd3_META = createCommonMeta($alc_ac_grp_cd3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta itm_jnl_cd2_META = createCommonMeta($itm_jnl_cd2, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta cost_io_typ_META = createCommonMeta($cost_io_typ, mcframe.commonMA.meta.MA_META.COST_IO_TYP);
	public static final MCMeta qty_unit_typ_META = createCommonMeta($qty_unit_typ, mcframe.commonMA.meta.MA_META.QTY_UNIT_TYP);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_all_META = createStringMeta($col_all);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rpt_seq_META,
			rpt_tgt_typ_META,
			rpt_row_cd_META,
			rpt_pre_word_META,
			rpt_row_nm_META,
			fg_r_META,
			fg_g_META,
			fg_b_META,
			bg_r_META,
			bg_g_META,
			bg_b_META,
			rpt_key_typ_META,
			calc_grp_cd_META,
			calc_no_META,
			wg_cd_META,
			asst_typ_META,
			alc_ac_grp_cd1_META,
			alc_ac_grp_cd2_META,
			alc_ac_grp_cd3_META,
			alc_ac_cd_META,
			ac_slip_typ_META,
			ac_rsn_cd_META,
			itm_jnl_cd2_META,
			itm_grp_cd1_META,
			itm_grp_cd2_META,
			itm_grp_cd3_META,
			itm_grp_cd4_META,
			itm_grp_cd5_META,
			itm_grp_cd6_META,
			itm_grp_cd7_META,
			itm_grp_cd8_META,
			itm_grp_cd9_META,
			itm_grp_cd10_META,
			cost_io_typ_META,
			qty_unit_typ_META,
			ttl_META,
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
	 * Report type レポート対象区分.<p>
	 *
	 */
	public String rpt_tgt_typ() {
		return getConstString(offset + 1, $rpt_tgt_typ);
	}

	/**
	 * Report type レポート対象区分.<p>
	 *
	 */
	public void rpt_tgt_typ(String value) {
		setConstString(offset + 1, $rpt_tgt_typ, value);
	}


	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public String rpt_row_cd() {
		return getConstString(offset + 2, $rpt_row_cd);
	}

	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public void rpt_row_cd(String value) {
		setConstString(offset + 2, $rpt_row_cd, value);
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
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public MCNumber fg_r() {
		return getConstNumber(offset + 5, $fg_r);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(MCNumber value) {
		setConstNumber(offset + 5, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(int value) {
		setConstNumber(offset + 5, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(long value) {
		setConstNumber(offset + 5, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(float value) {
		setConstNumber(offset + 5, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(double value) {
		setConstNumber(offset + 5, $fg_r, value);
	}


	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public MCNumber fg_g() {
		return getConstNumber(offset + 6, $fg_g);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(MCNumber value) {
		setConstNumber(offset + 6, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(int value) {
		setConstNumber(offset + 6, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(long value) {
		setConstNumber(offset + 6, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(float value) {
		setConstNumber(offset + 6, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(double value) {
		setConstNumber(offset + 6, $fg_g, value);
	}


	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public MCNumber fg_b() {
		return getConstNumber(offset + 7, $fg_b);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(MCNumber value) {
		setConstNumber(offset + 7, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(int value) {
		setConstNumber(offset + 7, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(long value) {
		setConstNumber(offset + 7, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(float value) {
		setConstNumber(offset + 7, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(double value) {
		setConstNumber(offset + 7, $fg_b, value);
	}


	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public MCNumber bg_r() {
		return getConstNumber(offset + 8, $bg_r);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(MCNumber value) {
		setConstNumber(offset + 8, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(int value) {
		setConstNumber(offset + 8, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(long value) {
		setConstNumber(offset + 8, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(float value) {
		setConstNumber(offset + 8, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(double value) {
		setConstNumber(offset + 8, $bg_r, value);
	}


	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public MCNumber bg_g() {
		return getConstNumber(offset + 9, $bg_g);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(MCNumber value) {
		setConstNumber(offset + 9, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(int value) {
		setConstNumber(offset + 9, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(long value) {
		setConstNumber(offset + 9, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(float value) {
		setConstNumber(offset + 9, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(double value) {
		setConstNumber(offset + 9, $bg_g, value);
	}


	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public MCNumber bg_b() {
		return getConstNumber(offset + 10, $bg_b);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(MCNumber value) {
		setConstNumber(offset + 10, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(int value) {
		setConstNumber(offset + 10, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(long value) {
		setConstNumber(offset + 10, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(float value) {
		setConstNumber(offset + 10, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(double value) {
		setConstNumber(offset + 10, $bg_b, value);
	}


	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public String rpt_key_typ() {
		return getConstString(offset + 11, $rpt_key_typ);
	}

	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public void rpt_key_typ(String value) {
		setConstString(offset + 11, $rpt_key_typ, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 12, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 12, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 13, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 13, $calc_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 14, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 14, $wg_cd, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 15, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 15, $asst_typ, value);
	}


	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public String alc_ac_grp_cd1() {
		return getConstString(offset + 16, $alc_ac_grp_cd1);
	}

	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public void alc_ac_grp_cd1(String value) {
		setConstString(offset + 16, $alc_ac_grp_cd1, value);
	}


	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public String alc_ac_grp_cd2() {
		return getConstString(offset + 17, $alc_ac_grp_cd2);
	}

	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public void alc_ac_grp_cd2(String value) {
		setConstString(offset + 17, $alc_ac_grp_cd2, value);
	}


	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public String alc_ac_grp_cd3() {
		return getConstString(offset + 18, $alc_ac_grp_cd3);
	}

	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public void alc_ac_grp_cd3(String value) {
		setConstString(offset + 18, $alc_ac_grp_cd3, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 19, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 19, $alc_ac_cd, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 20, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 20, $ac_slip_typ, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 21, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 21, $ac_rsn_cd, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd2() {
		return getConstString(offset + 22, $itm_jnl_cd2);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd2(String value) {
		setConstString(offset + 22, $itm_jnl_cd2, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 23, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 23, $itm_grp_cd1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 24, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 24, $itm_grp_cd2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 25, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 25, $itm_grp_cd3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 26, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 26, $itm_grp_cd4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 27, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 27, $itm_grp_cd5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 28, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 28, $itm_grp_cd6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 29, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 29, $itm_grp_cd7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 30, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 30, $itm_grp_cd8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 31, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 31, $itm_grp_cd9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 32, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 32, $itm_grp_cd10, value);
	}


	/**
	 * Cost GR/GI type 原価入出庫区分.<p>
	 *
	 */
	public String cost_io_typ() {
		return getConstString(offset + 33, $cost_io_typ);
	}

	/**
	 * Cost GR/GI type 原価入出庫区分.<p>
	 *
	 */
	public void cost_io_typ(String value) {
		setConstString(offset + 33, $cost_io_typ, value);
	}


	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public String qty_unit_typ() {
		return getConstString(offset + 34, $qty_unit_typ);
	}

	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public void qty_unit_typ(String value) {
		setConstString(offset + 34, $qty_unit_typ, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 35, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 35, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 35, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 35, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 35, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 35, $ttl, value);
	}


	public String col_all() {
		return getConstString(offset + 36, $col_all);
	}

	public void col_all(String value) {
		setConstString(offset + 36, $col_all, value);
	}


	public String getString(String name) {
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			return rpt_tgt_typ();
		}
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			return rpt_row_cd();
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			return rpt_pre_word();
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			return rpt_row_nm();
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			return rpt_key_typ();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($itm_jnl_cd2.equalsIgnoreCase(name)) {
			return itm_jnl_cd2();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			return cost_io_typ();
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
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
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			return rpt_tgt_typ();
		}
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			return rpt_row_cd();
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			return rpt_pre_word();
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			return rpt_row_nm();
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			return rpt_key_typ();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($itm_jnl_cd2.equalsIgnoreCase(name)) {
			return itm_jnl_cd2();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			return cost_io_typ();
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
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
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			rpt_tgt_typ(value);
			return;
		}
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			rpt_row_cd(value);
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
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			rpt_key_typ(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($itm_jnl_cd2.equalsIgnoreCase(name)) {
			itm_jnl_cd2(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			cost_io_typ(value);
			return;
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			rpt_tgt_typ(value);
			return;
		}
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			rpt_row_cd(value);
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
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			rpt_key_typ(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($itm_jnl_cd2.equalsIgnoreCase(name)) {
			itm_jnl_cd2(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			cost_io_typ(value);
			return;
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

