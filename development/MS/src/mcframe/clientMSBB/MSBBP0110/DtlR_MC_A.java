package mcframe.clientMSBB.MSBBP0110;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public static final String $spln_ym = "spln_ym";
	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public static final String $sum_flg = "sum_flg";
	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public static final String $spln_qty = "spln_qty";
	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public static final String $spln_amt = "spln_amt";
	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public static final String $pre_spln_qty = "pre_spln_qty";
	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public static final String $pre_spln_amt = "pre_spln_amt";
	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public static final String $ref_spln_qty = "ref_spln_qty";
	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public static final String $ref_spln_amt = "ref_spln_amt";
	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public static final String $frcst_qty = "frcst_qty";
	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public static final String $frcst_amt = "frcst_amt";
	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public static final String $pre_slo_qty = "pre_slo_qty";
	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public static final String $pre_slo_amt = "pre_slo_amt";
	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public static final String $slo_qty = "slo_qty";
	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public static final String $slo_amt = "slo_amt";


	public static final MCMeta grp_peg_no_META = createCommonMeta($grp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta spln_ym_META = createCommonMeta($spln_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_flg_META = createCommonMeta($sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_qty_META = createCommonMeta($spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spln_amt_META = createCommonMeta($spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pre_spln_qty_META = createCommonMeta($pre_spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pre_spln_amt_META = createCommonMeta($pre_spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ref_spln_qty_META = createCommonMeta($ref_spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ref_spln_amt_META = createCommonMeta($ref_spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta frcst_qty_META = createCommonMeta($frcst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta frcst_amt_META = createCommonMeta($frcst_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pre_slo_qty_META = createCommonMeta($pre_slo_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pre_slo_amt_META = createCommonMeta($pre_slo_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_qty_META = createCommonMeta($slo_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta slo_amt_META = createCommonMeta($slo_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_peg_no_META,
			spln_ym_META,
			sum_flg_META,
			spln_qty_META,
			spln_amt_META,
			pre_spln_qty_META,
			pre_spln_amt_META,
			ref_spln_qty_META,
			ref_spln_amt_META,
			frcst_qty_META,
			frcst_amt_META,
			pre_slo_qty_META,
			pre_slo_amt_META,
			slo_qty_META,
			slo_amt_META
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
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
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
				{$grp_peg_no, "HKEY"},	// grp_peg_no
				{$spln_ym, "ELM"},	// spln_ym
				{$spln_qty, "HVAL"},	// spln_qty
				{$spln_amt, "HVAL"},	// spln_amt
				{$pre_spln_qty, "HVAL"},	// pre_spln_qty
				{$pre_spln_amt, "HVAL"},	// pre_spln_amt
				{$ref_spln_qty, "HVAL"},	// ref_spln_qty
				{$ref_spln_amt, "HVAL"},	// ref_spln_amt
				{$frcst_qty, "HVAL"},	// frcst_qty
				{$frcst_amt, "HVAL"},	// frcst_amt
				{$pre_slo_qty, "HVAL"},	// pre_slo_qty
				{$pre_slo_amt, "HVAL"},	// pre_slo_amt
				{$slo_qty, "HVAL"},	// slo_qty
				{$slo_amt, "HVAL"}	// slo_amt
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 0, $grp_peg_no);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(double value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}


	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public MCDate spln_ym() {
		return getConstDate(offset + 1, $spln_ym);
	}

	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public void spln_ym(MCDate value) {
		setConstDate(offset + 1, $spln_ym, value);
	}


	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public boolean sum_flg() {
		return getConstBoolean(offset + 2, $sum_flg);
	}

	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public void sum_flg(boolean value) {
		setConstBoolean(offset + 2, $sum_flg, value);
	}


	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public MCNumber spln_qty() {
		return getConstNumber(offset + 3, $spln_qty);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		setConstNumber(offset + 3, $spln_qty, value);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(int value) {
		setConstNumber(offset + 3, $spln_qty, value);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(long value) {
		setConstNumber(offset + 3, $spln_qty, value);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(float value) {
		setConstNumber(offset + 3, $spln_qty, value);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(double value) {
		setConstNumber(offset + 3, $spln_qty, value);
	}


	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public MCNumber spln_amt() {
		return getConstNumber(offset + 4, $spln_amt);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(MCNumber value) {
		setConstNumber(offset + 4, $spln_amt, value);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(int value) {
		setConstNumber(offset + 4, $spln_amt, value);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(long value) {
		setConstNumber(offset + 4, $spln_amt, value);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(float value) {
		setConstNumber(offset + 4, $spln_amt, value);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(double value) {
		setConstNumber(offset + 4, $spln_amt, value);
	}


	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public MCNumber pre_spln_qty() {
		return getConstNumber(offset + 5, $pre_spln_qty);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(MCNumber value) {
		setConstNumber(offset + 5, $pre_spln_qty, value);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(int value) {
		setConstNumber(offset + 5, $pre_spln_qty, value);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(long value) {
		setConstNumber(offset + 5, $pre_spln_qty, value);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(float value) {
		setConstNumber(offset + 5, $pre_spln_qty, value);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(double value) {
		setConstNumber(offset + 5, $pre_spln_qty, value);
	}


	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public MCNumber pre_spln_amt() {
		return getConstNumber(offset + 6, $pre_spln_amt);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(MCNumber value) {
		setConstNumber(offset + 6, $pre_spln_amt, value);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(int value) {
		setConstNumber(offset + 6, $pre_spln_amt, value);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(long value) {
		setConstNumber(offset + 6, $pre_spln_amt, value);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(float value) {
		setConstNumber(offset + 6, $pre_spln_amt, value);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(double value) {
		setConstNumber(offset + 6, $pre_spln_amt, value);
	}


	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public MCNumber ref_spln_qty() {
		return getConstNumber(offset + 7, $ref_spln_qty);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(MCNumber value) {
		setConstNumber(offset + 7, $ref_spln_qty, value);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(int value) {
		setConstNumber(offset + 7, $ref_spln_qty, value);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(long value) {
		setConstNumber(offset + 7, $ref_spln_qty, value);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(float value) {
		setConstNumber(offset + 7, $ref_spln_qty, value);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(double value) {
		setConstNumber(offset + 7, $ref_spln_qty, value);
	}


	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public MCNumber ref_spln_amt() {
		return getConstNumber(offset + 8, $ref_spln_amt);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(MCNumber value) {
		setConstNumber(offset + 8, $ref_spln_amt, value);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(int value) {
		setConstNumber(offset + 8, $ref_spln_amt, value);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(long value) {
		setConstNumber(offset + 8, $ref_spln_amt, value);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(float value) {
		setConstNumber(offset + 8, $ref_spln_amt, value);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(double value) {
		setConstNumber(offset + 8, $ref_spln_amt, value);
	}


	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public MCNumber frcst_qty() {
		return getConstNumber(offset + 9, $frcst_qty);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(MCNumber value) {
		setConstNumber(offset + 9, $frcst_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(int value) {
		setConstNumber(offset + 9, $frcst_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(long value) {
		setConstNumber(offset + 9, $frcst_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(float value) {
		setConstNumber(offset + 9, $frcst_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(double value) {
		setConstNumber(offset + 9, $frcst_qty, value);
	}


	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public MCNumber frcst_amt() {
		return getConstNumber(offset + 10, $frcst_amt);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(MCNumber value) {
		setConstNumber(offset + 10, $frcst_amt, value);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(int value) {
		setConstNumber(offset + 10, $frcst_amt, value);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(long value) {
		setConstNumber(offset + 10, $frcst_amt, value);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(float value) {
		setConstNumber(offset + 10, $frcst_amt, value);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(double value) {
		setConstNumber(offset + 10, $frcst_amt, value);
	}


	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public MCNumber pre_slo_qty() {
		return getConstNumber(offset + 11, $pre_slo_qty);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(MCNumber value) {
		setConstNumber(offset + 11, $pre_slo_qty, value);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(int value) {
		setConstNumber(offset + 11, $pre_slo_qty, value);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(long value) {
		setConstNumber(offset + 11, $pre_slo_qty, value);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(float value) {
		setConstNumber(offset + 11, $pre_slo_qty, value);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(double value) {
		setConstNumber(offset + 11, $pre_slo_qty, value);
	}


	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public MCNumber pre_slo_amt() {
		return getConstNumber(offset + 12, $pre_slo_amt);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(MCNumber value) {
		setConstNumber(offset + 12, $pre_slo_amt, value);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(int value) {
		setConstNumber(offset + 12, $pre_slo_amt, value);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(long value) {
		setConstNumber(offset + 12, $pre_slo_amt, value);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(float value) {
		setConstNumber(offset + 12, $pre_slo_amt, value);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(double value) {
		setConstNumber(offset + 12, $pre_slo_amt, value);
	}


	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public MCNumber slo_qty() {
		return getConstNumber(offset + 13, $slo_qty);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(MCNumber value) {
		setConstNumber(offset + 13, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(int value) {
		setConstNumber(offset + 13, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(long value) {
		setConstNumber(offset + 13, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(float value) {
		setConstNumber(offset + 13, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(double value) {
		setConstNumber(offset + 13, $slo_qty, value);
	}


	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public MCNumber slo_amt() {
		return getConstNumber(offset + 14, $slo_amt);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(MCNumber value) {
		setConstNumber(offset + 14, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(int value) {
		setConstNumber(offset + 14, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(long value) {
		setConstNumber(offset + 14, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(float value) {
		setConstNumber(offset + 14, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(double value) {
		setConstNumber(offset + 14, $slo_amt, value);
	}


	public MCNumber getNumber(String name) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			return pre_spln_qty();
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			return pre_spln_amt();
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			return ref_spln_qty();
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			return ref_spln_amt();
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			return frcst_qty();
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			return frcst_amt();
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			return pre_slo_qty();
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			return pre_slo_amt();
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			return slo_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			return spln_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sum_flg.equalsIgnoreCase(name)) {
			return sum_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			return pre_spln_qty();
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			return pre_spln_amt();
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			return ref_spln_qty();
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			return ref_spln_amt();
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			return frcst_qty();
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			return frcst_amt();
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			return pre_slo_qty();
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			return pre_slo_amt();
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			return slo_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			return spln_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sum_flg.equalsIgnoreCase(name)) {
			return sum_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			spln_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sum_flg.equalsIgnoreCase(name)) {
			sum_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($pre_spln_qty.equalsIgnoreCase(name)) {
			pre_spln_qty(value);
			return;
		}
		if ($pre_spln_amt.equalsIgnoreCase(name)) {
			pre_spln_amt(value);
			return;
		}
		if ($ref_spln_qty.equalsIgnoreCase(name)) {
			ref_spln_qty(value);
			return;
		}
		if ($ref_spln_amt.equalsIgnoreCase(name)) {
			ref_spln_amt(value);
			return;
		}
		if ($frcst_qty.equalsIgnoreCase(name)) {
			frcst_qty(value);
			return;
		}
		if ($frcst_amt.equalsIgnoreCase(name)) {
			frcst_amt(value);
			return;
		}
		if ($pre_slo_qty.equalsIgnoreCase(name)) {
			pre_slo_qty(value);
			return;
		}
		if ($pre_slo_amt.equalsIgnoreCase(name)) {
			pre_slo_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			spln_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sum_flg.equalsIgnoreCase(name)) {
			sum_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

