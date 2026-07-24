package mcframe.serverMSBB.MSBBL0110;

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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public static final String $spln_ym = "spln_ym";
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

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_peg_no_META,
			spln_ym_META,
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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 0, $grp_peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
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
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public MCNumber spln_qty() {
		return getConstNumber(offset + 2, $spln_qty);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		setConstNumber(offset + 2, $spln_qty, value);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(int value) {
		setConstNumber(offset + 2, $spln_qty, value);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(long value) {
		setConstNumber(offset + 2, $spln_qty, value);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(float value) {
		setConstNumber(offset + 2, $spln_qty, value);
	}

	/**
	 * Planned qty. (Current) 計画数量(今回).<p>
	 *
	 */
	public void spln_qty(double value) {
		setConstNumber(offset + 2, $spln_qty, value);
	}


	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public MCNumber spln_amt() {
		return getConstNumber(offset + 3, $spln_amt);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(MCNumber value) {
		setConstNumber(offset + 3, $spln_amt, value);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(int value) {
		setConstNumber(offset + 3, $spln_amt, value);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(long value) {
		setConstNumber(offset + 3, $spln_amt, value);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(float value) {
		setConstNumber(offset + 3, $spln_amt, value);
	}

	/**
	 * Plan amount (Current) 計画金額(今回).<p>
	 *
	 */
	public void spln_amt(double value) {
		setConstNumber(offset + 3, $spln_amt, value);
	}


	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public MCNumber pre_spln_qty() {
		return getConstNumber(offset + 4, $pre_spln_qty);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(MCNumber value) {
		setConstNumber(offset + 4, $pre_spln_qty, value);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(int value) {
		setConstNumber(offset + 4, $pre_spln_qty, value);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(long value) {
		setConstNumber(offset + 4, $pre_spln_qty, value);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(float value) {
		setConstNumber(offset + 4, $pre_spln_qty, value);
	}

	/**
	 * Planned qty. (Last time) 計画数量(前回).<p>
	 *
	 */
	public void pre_spln_qty(double value) {
		setConstNumber(offset + 4, $pre_spln_qty, value);
	}


	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public MCNumber pre_spln_amt() {
		return getConstNumber(offset + 5, $pre_spln_amt);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(MCNumber value) {
		setConstNumber(offset + 5, $pre_spln_amt, value);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(int value) {
		setConstNumber(offset + 5, $pre_spln_amt, value);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(long value) {
		setConstNumber(offset + 5, $pre_spln_amt, value);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(float value) {
		setConstNumber(offset + 5, $pre_spln_amt, value);
	}

	/**
	 * Plan amount (Last time) 計画金額(前回).<p>
	 *
	 */
	public void pre_spln_amt(double value) {
		setConstNumber(offset + 5, $pre_spln_amt, value);
	}


	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public MCNumber ref_spln_qty() {
		return getConstNumber(offset + 6, $ref_spln_qty);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(MCNumber value) {
		setConstNumber(offset + 6, $ref_spln_qty, value);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(int value) {
		setConstNumber(offset + 6, $ref_spln_qty, value);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(long value) {
		setConstNumber(offset + 6, $ref_spln_qty, value);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(float value) {
		setConstNumber(offset + 6, $ref_spln_qty, value);
	}

	/**
	 * Planned qty. (Comparison) 計画数量(比較).<p>
	 *
	 */
	public void ref_spln_qty(double value) {
		setConstNumber(offset + 6, $ref_spln_qty, value);
	}


	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public MCNumber ref_spln_amt() {
		return getConstNumber(offset + 7, $ref_spln_amt);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(MCNumber value) {
		setConstNumber(offset + 7, $ref_spln_amt, value);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(int value) {
		setConstNumber(offset + 7, $ref_spln_amt, value);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(long value) {
		setConstNumber(offset + 7, $ref_spln_amt, value);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(float value) {
		setConstNumber(offset + 7, $ref_spln_amt, value);
	}

	/**
	 * Plan amount (Comparison) 計画金額(比較).<p>
	 *
	 */
	public void ref_spln_amt(double value) {
		setConstNumber(offset + 7, $ref_spln_amt, value);
	}


	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public MCNumber frcst_qty() {
		return getConstNumber(offset + 8, $frcst_qty);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(MCNumber value) {
		setConstNumber(offset + 8, $frcst_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(int value) {
		setConstNumber(offset + 8, $frcst_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(long value) {
		setConstNumber(offset + 8, $frcst_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(float value) {
		setConstNumber(offset + 8, $frcst_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void frcst_qty(double value) {
		setConstNumber(offset + 8, $frcst_qty, value);
	}


	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public MCNumber frcst_amt() {
		return getConstNumber(offset + 9, $frcst_amt);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(MCNumber value) {
		setConstNumber(offset + 9, $frcst_amt, value);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(int value) {
		setConstNumber(offset + 9, $frcst_amt, value);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(long value) {
		setConstNumber(offset + 9, $frcst_amt, value);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(float value) {
		setConstNumber(offset + 9, $frcst_amt, value);
	}

	/**
	 * Forecast amount 内示金額.<p>
	 *
	 */
	public void frcst_amt(double value) {
		setConstNumber(offset + 9, $frcst_amt, value);
	}


	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public MCNumber pre_slo_qty() {
		return getConstNumber(offset + 10, $pre_slo_qty);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(MCNumber value) {
		setConstNumber(offset + 10, $pre_slo_qty, value);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(int value) {
		setConstNumber(offset + 10, $pre_slo_qty, value);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(long value) {
		setConstNumber(offset + 10, $pre_slo_qty, value);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(float value) {
		setConstNumber(offset + 10, $pre_slo_qty, value);
	}

	/**
	 * Sales order qty. (Temporary) 受注数量（仮）.<p>
	 *
	 */
	public void pre_slo_qty(double value) {
		setConstNumber(offset + 10, $pre_slo_qty, value);
	}


	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public MCNumber pre_slo_amt() {
		return getConstNumber(offset + 11, $pre_slo_amt);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(MCNumber value) {
		setConstNumber(offset + 11, $pre_slo_amt, value);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(int value) {
		setConstNumber(offset + 11, $pre_slo_amt, value);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(long value) {
		setConstNumber(offset + 11, $pre_slo_amt, value);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(float value) {
		setConstNumber(offset + 11, $pre_slo_amt, value);
	}

	/**
	 * Sales order amount (Return) 受注金額（仮）.<p>
	 *
	 */
	public void pre_slo_amt(double value) {
		setConstNumber(offset + 11, $pre_slo_amt, value);
	}


	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public MCNumber slo_qty() {
		return getConstNumber(offset + 12, $slo_qty);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(MCNumber value) {
		setConstNumber(offset + 12, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(int value) {
		setConstNumber(offset + 12, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(long value) {
		setConstNumber(offset + 12, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(float value) {
		setConstNumber(offset + 12, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(double value) {
		setConstNumber(offset + 12, $slo_qty, value);
	}


	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public MCNumber slo_amt() {
		return getConstNumber(offset + 13, $slo_amt);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(MCNumber value) {
		setConstNumber(offset + 13, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(int value) {
		setConstNumber(offset + 13, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(long value) {
		setConstNumber(offset + 13, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(float value) {
		setConstNumber(offset + 13, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(double value) {
		setConstNumber(offset + 13, $slo_amt, value);
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



}

