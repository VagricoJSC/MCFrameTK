package mcframe.serverMSBE.MSBEL0040;

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
 * ブロック"Srch01_RsltQty"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltQtyR_MC_A extends MCConstRow {

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public static final String $stk_qty = "stk_qty";
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public static final String $stk_qty2 = "stk_qty2";
	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public static final String $stk_qty3 = "stk_qty3";
	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public static final String $stk_qty4 = "stk_qty4";
	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public static final String $gr_qty = "gr_qty";
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public static final String $gr_qty2 = "gr_qty2";
	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public static final String $gr_qty3 = "gr_qty3";
	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public static final String $gr_qty4 = "gr_qty4";
	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public static final String $gi_qty = "gi_qty";
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public static final String $gi_qty2 = "gi_qty2";
	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public static final String $gi_qty3 = "gi_qty3";
	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public static final String $gi_qty4 = "gi_qty4";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";


	public static final MCMeta stk_qty_META = createCommonMeta($stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_qty2_META = createCommonMeta($stk_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_qty3_META = createCommonMeta($stk_qty3, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_qty4_META = createCommonMeta($stk_qty4, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_qty_META = createCommonMeta($gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_qty2_META = createCommonMeta($gr_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_qty3_META = createCommonMeta($gr_qty3, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_qty4_META = createCommonMeta($gr_qty4, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_qty_META = createCommonMeta($gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_qty2_META = createCommonMeta($gi_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_qty3_META = createCommonMeta($gi_qty3, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_qty4_META = createCommonMeta($gi_qty4, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<Srch01_RsltQtyR> constMetas = new ConstMetaList<Srch01_RsltQtyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			stk_qty_META,
			stk_qty2_META,
			stk_qty3_META,
			stk_qty4_META,
			gr_qty_META,
			gr_qty2_META,
			gr_qty3_META,
			gr_qty4_META,
			gi_qty_META,
			gi_qty2_META,
			gi_qty3_META,
			gi_qty4_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META
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
	protected Srch01_RsltQtyR_MC_A(ConstMetaList<? extends Srch01_RsltQtyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltQtyR clone() {
		return (Srch01_RsltQtyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltQtyR createInstance() {
		return (Srch01_RsltQtyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltQtyR getValues(String... names) {
		return (Srch01_RsltQtyR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return getConstNumber(offset + 0, $stk_qty);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		setConstNumber(offset + 0, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(int value) {
		setConstNumber(offset + 0, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(long value) {
		setConstNumber(offset + 0, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(float value) {
		setConstNumber(offset + 0, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(double value) {
		setConstNumber(offset + 0, $stk_qty, value);
	}


	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber stk_qty2() {
		return getConstNumber(offset + 1, $stk_qty2);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void stk_qty2(MCNumber value) {
		setConstNumber(offset + 1, $stk_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void stk_qty2(int value) {
		setConstNumber(offset + 1, $stk_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void stk_qty2(long value) {
		setConstNumber(offset + 1, $stk_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void stk_qty2(float value) {
		setConstNumber(offset + 1, $stk_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void stk_qty2(double value) {
		setConstNumber(offset + 1, $stk_qty2, value);
	}


	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public MCNumber stk_qty3() {
		return getConstNumber(offset + 2, $stk_qty3);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void stk_qty3(MCNumber value) {
		setConstNumber(offset + 2, $stk_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void stk_qty3(int value) {
		setConstNumber(offset + 2, $stk_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void stk_qty3(long value) {
		setConstNumber(offset + 2, $stk_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void stk_qty3(float value) {
		setConstNumber(offset + 2, $stk_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void stk_qty3(double value) {
		setConstNumber(offset + 2, $stk_qty3, value);
	}


	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public MCNumber stk_qty4() {
		return getConstNumber(offset + 3, $stk_qty4);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void stk_qty4(MCNumber value) {
		setConstNumber(offset + 3, $stk_qty4, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void stk_qty4(int value) {
		setConstNumber(offset + 3, $stk_qty4, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void stk_qty4(long value) {
		setConstNumber(offset + 3, $stk_qty4, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void stk_qty4(float value) {
		setConstNumber(offset + 3, $stk_qty4, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void stk_qty4(double value) {
		setConstNumber(offset + 3, $stk_qty4, value);
	}


	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public MCNumber gr_qty() {
		return getConstNumber(offset + 4, $gr_qty);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_qty(MCNumber value) {
		setConstNumber(offset + 4, $gr_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_qty(int value) {
		setConstNumber(offset + 4, $gr_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_qty(long value) {
		setConstNumber(offset + 4, $gr_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_qty(float value) {
		setConstNumber(offset + 4, $gr_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_qty(double value) {
		setConstNumber(offset + 4, $gr_qty, value);
	}


	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber gr_qty2() {
		return getConstNumber(offset + 5, $gr_qty2);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gr_qty2(MCNumber value) {
		setConstNumber(offset + 5, $gr_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gr_qty2(int value) {
		setConstNumber(offset + 5, $gr_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gr_qty2(long value) {
		setConstNumber(offset + 5, $gr_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gr_qty2(float value) {
		setConstNumber(offset + 5, $gr_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gr_qty2(double value) {
		setConstNumber(offset + 5, $gr_qty2, value);
	}


	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public MCNumber gr_qty3() {
		return getConstNumber(offset + 6, $gr_qty3);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gr_qty3(MCNumber value) {
		setConstNumber(offset + 6, $gr_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gr_qty3(int value) {
		setConstNumber(offset + 6, $gr_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gr_qty3(long value) {
		setConstNumber(offset + 6, $gr_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gr_qty3(float value) {
		setConstNumber(offset + 6, $gr_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gr_qty3(double value) {
		setConstNumber(offset + 6, $gr_qty3, value);
	}


	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public MCNumber gr_qty4() {
		return getConstNumber(offset + 7, $gr_qty4);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void gr_qty4(MCNumber value) {
		setConstNumber(offset + 7, $gr_qty4, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void gr_qty4(int value) {
		setConstNumber(offset + 7, $gr_qty4, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void gr_qty4(long value) {
		setConstNumber(offset + 7, $gr_qty4, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void gr_qty4(float value) {
		setConstNumber(offset + 7, $gr_qty4, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void gr_qty4(double value) {
		setConstNumber(offset + 7, $gr_qty4, value);
	}


	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public MCNumber gi_qty() {
		return getConstNumber(offset + 8, $gi_qty);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_qty(MCNumber value) {
		setConstNumber(offset + 8, $gi_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_qty(int value) {
		setConstNumber(offset + 8, $gi_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_qty(long value) {
		setConstNumber(offset + 8, $gi_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_qty(float value) {
		setConstNumber(offset + 8, $gi_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_qty(double value) {
		setConstNumber(offset + 8, $gi_qty, value);
	}


	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber gi_qty2() {
		return getConstNumber(offset + 9, $gi_qty2);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gi_qty2(MCNumber value) {
		setConstNumber(offset + 9, $gi_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gi_qty2(int value) {
		setConstNumber(offset + 9, $gi_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gi_qty2(long value) {
		setConstNumber(offset + 9, $gi_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gi_qty2(float value) {
		setConstNumber(offset + 9, $gi_qty2, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void gi_qty2(double value) {
		setConstNumber(offset + 9, $gi_qty2, value);
	}


	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public MCNumber gi_qty3() {
		return getConstNumber(offset + 10, $gi_qty3);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gi_qty3(MCNumber value) {
		setConstNumber(offset + 10, $gi_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gi_qty3(int value) {
		setConstNumber(offset + 10, $gi_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gi_qty3(long value) {
		setConstNumber(offset + 10, $gi_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gi_qty3(float value) {
		setConstNumber(offset + 10, $gi_qty3, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void gi_qty3(double value) {
		setConstNumber(offset + 10, $gi_qty3, value);
	}


	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public MCNumber gi_qty4() {
		return getConstNumber(offset + 11, $gi_qty4);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void gi_qty4(MCNumber value) {
		setConstNumber(offset + 11, $gi_qty4, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void gi_qty4(int value) {
		setConstNumber(offset + 11, $gi_qty4, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void gi_qty4(long value) {
		setConstNumber(offset + 11, $gi_qty4, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void gi_qty4(float value) {
		setConstNumber(offset + 11, $gi_qty4, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void gi_qty4(double value) {
		setConstNumber(offset + 11, $gi_qty4, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 12, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 12, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 13, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 13, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 14, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}


	public String getString(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			return stk_qty2();
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			return stk_qty3();
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			return stk_qty4();
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			return gr_qty();
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			return gr_qty2();
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			return gr_qty3();
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			return gr_qty4();
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			return gi_qty();
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			return gi_qty2();
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			return gi_qty3();
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			return gi_qty4();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			return stk_qty2();
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			return stk_qty3();
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			return stk_qty4();
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			return gr_qty();
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			return gr_qty2();
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			return gr_qty3();
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			return gr_qty4();
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			return gi_qty();
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			return gi_qty2();
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			return gi_qty3();
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			return gi_qty4();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($stk_qty2.equalsIgnoreCase(name)) {
			stk_qty2(value);
			return;
		}
		if ($stk_qty3.equalsIgnoreCase(name)) {
			stk_qty3(value);
			return;
		}
		if ($stk_qty4.equalsIgnoreCase(name)) {
			stk_qty4(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_qty2.equalsIgnoreCase(name)) {
			gr_qty2(value);
			return;
		}
		if ($gr_qty3.equalsIgnoreCase(name)) {
			gr_qty3(value);
			return;
		}
		if ($gr_qty4.equalsIgnoreCase(name)) {
			gr_qty4(value);
			return;
		}
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_qty2.equalsIgnoreCase(name)) {
			gi_qty2(value);
			return;
		}
		if ($gi_qty3.equalsIgnoreCase(name)) {
			gi_qty3(value);
			return;
		}
		if ($gi_qty4.equalsIgnoreCase(name)) {
			gi_qty4(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

