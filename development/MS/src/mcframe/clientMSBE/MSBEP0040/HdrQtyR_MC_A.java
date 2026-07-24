package mcframe.clientMSBE.MSBEP0040;

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
 * ブロック"HdrQty"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrQtyR_MC_A extends MCConstRow {

	public static final String $stk_base_qty_p = "stk_base_qty_p";
	public static final String $stk_base_qty2_p = "stk_base_qty2_p";
	public static final String $stk_base_qty3_p = "stk_base_qty3_p";
	public static final String $stk_base_qty4_p = "stk_base_qty4_p";
	public static final String $gr_base_qty_p = "gr_base_qty_p";
	public static final String $gr_base_qty2_p = "gr_base_qty2_p";
	public static final String $gr_base_qty3_p = "gr_base_qty3_p";
	public static final String $gr_base_qty4_p = "gr_base_qty4_p";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	public static final String $gi_base_qty_p = "gi_base_qty_p";
	public static final String $gi_base_qty2_p = "gi_base_qty2_p";
	public static final String $gi_base_qty3_p = "gi_base_qty3_p";
	public static final String $gi_base_qty4_p = "gi_base_qty4_p";
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

	public static final String $stk_qty = $stk_base_qty_p + ".qty";
	public static final String $stk_qty2 = $stk_base_qty2_p + ".qty";
	public static final String $stk_qty3 = $stk_base_qty3_p + ".qty";
	public static final String $stk_qty4 = $stk_base_qty4_p + ".qty";
	public static final String $gr_qty = $gr_base_qty_p + ".qty";
	public static final String $gr_qty2 = $gr_base_qty2_p + ".qty";
	public static final String $gr_qty3 = $gr_base_qty3_p + ".qty";
	public static final String $gr_qty4 = $gr_base_qty4_p + ".qty";
	public static final String $gi_qty = $gi_base_qty_p + ".qty";
	public static final String $gi_qty2 = $gi_base_qty2_p + ".qty";
	public static final String $gi_qty3 = $gi_base_qty3_p + ".qty";
	public static final String $gi_qty4 = $gi_base_qty4_p + ".qty";

	public static final MCMeta stk_base_qty_p_META = createInnerRowMeta($stk_base_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta stk_base_qty2_p_META = createInnerRowMeta($stk_base_qty2_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta stk_base_qty3_p_META = createInnerRowMeta($stk_base_qty3_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta stk_base_qty4_p_META = createInnerRowMeta($stk_base_qty4_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta gr_base_qty_p_META = createInnerRowMeta($gr_base_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta gr_base_qty2_p_META = createInnerRowMeta($gr_base_qty2_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta gr_base_qty3_p_META = createInnerRowMeta($gr_base_qty3_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta gr_base_qty4_p_META = createInnerRowMeta($gr_base_qty4_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta gi_base_qty_p_META = createInnerRowMeta($gi_base_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta gi_base_qty2_p_META = createInnerRowMeta($gi_base_qty2_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta gi_base_qty3_p_META = createInnerRowMeta($gi_base_qty3_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta gi_base_qty4_p_META = createInnerRowMeta($gi_base_qty4_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);

	protected static final ConstMetaList<HdrQtyR> constMetas = new ConstMetaList<HdrQtyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			stk_base_qty_p_META,
			stk_base_qty2_p_META,
			stk_base_qty3_p_META,
			stk_base_qty4_p_META,
			gr_base_qty_p_META,
			gr_base_qty2_p_META,
			gr_base_qty3_p_META,
			gr_base_qty4_p_META,
			base_unit_dec_place_META,
			gi_base_qty_p_META,
			gi_base_qty2_p_META,
			gi_base_qty3_p_META,
			gi_base_qty4_p_META,
			base_unit_cd_META,
			base_unit_nm_META
		},
		new String[][]{
			{
				"stk_qty",
				"stk_qty2",
				"stk_qty3",
				"stk_qty4",
				"gr_qty",
				"gr_qty2",
				"gr_qty3",
				"gr_qty4",
				"gi_qty",
				"gi_qty2",
				"gi_qty3",
				"gi_qty4"
			},
			{
				$stk_qty,
				$stk_qty2,
				$stk_qty3,
				$stk_qty4,
				$gr_qty,
				$gr_qty2,
				$gr_qty3,
				$gr_qty4,
				$gi_qty,
				$gi_qty2,
				$gi_qty3,
				$gi_qty4
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
	protected HdrQtyR_MC_A(ConstMetaList<? extends HdrQtyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrQtyR clone() {
		return (HdrQtyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrQtyR createInstance() {
		return (HdrQtyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrQtyR getValues(String... names) {
		return (HdrQtyR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0050.QtyR stk_base_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 0, $stk_base_qty_p);
	}
	
	public void stk_base_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 0, $stk_base_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR stk_base_qty2_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 1, $stk_base_qty2_p);
	}
	
	public void stk_base_qty2_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 1, $stk_base_qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR stk_base_qty3_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 2, $stk_base_qty3_p);
	}
	
	public void stk_base_qty3_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 2, $stk_base_qty3_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR stk_base_qty4_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 3, $stk_base_qty4_p);
	}
	
	public void stk_base_qty4_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 3, $stk_base_qty4_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR gr_base_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 4, $gr_base_qty_p);
	}
	
	public void gr_base_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 4, $gr_base_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR gr_base_qty2_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 5, $gr_base_qty2_p);
	}
	
	public void gr_base_qty2_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 5, $gr_base_qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR gr_base_qty3_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 6, $gr_base_qty3_p);
	}
	
	public void gr_base_qty3_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 6, $gr_base_qty3_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR gr_base_qty4_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 7, $gr_base_qty4_p);
	}
	
	public void gr_base_qty4_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 7, $gr_base_qty4_p, row);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 8, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 8, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 8, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 8, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 8, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR gi_base_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 9, $gi_base_qty_p);
	}
	
	public void gi_base_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 9, $gi_base_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR gi_base_qty2_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 10, $gi_base_qty2_p);
	}
	
	public void gi_base_qty2_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 10, $gi_base_qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR gi_base_qty3_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 11, $gi_base_qty3_p);
	}
	
	public void gi_base_qty3_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 11, $gi_base_qty3_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR gi_base_qty4_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 12, $gi_base_qty4_p);
	}
	
	public void gi_base_qty4_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 12, $gi_base_qty4_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 13, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 13, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 14, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 14, $base_unit_nm, value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($stk_base_qty_p.equalsIgnoreCase(name)) {
			return stk_base_qty_p();
		}
		if ($stk_base_qty2_p.equalsIgnoreCase(name)) {
			return stk_base_qty2_p();
		}
		if ($stk_base_qty3_p.equalsIgnoreCase(name)) {
			return stk_base_qty3_p();
		}
		if ($stk_base_qty4_p.equalsIgnoreCase(name)) {
			return stk_base_qty4_p();
		}
		if ($gr_base_qty_p.equalsIgnoreCase(name)) {
			return gr_base_qty_p();
		}
		if ($gr_base_qty2_p.equalsIgnoreCase(name)) {
			return gr_base_qty2_p();
		}
		if ($gr_base_qty3_p.equalsIgnoreCase(name)) {
			return gr_base_qty3_p();
		}
		if ($gr_base_qty4_p.equalsIgnoreCase(name)) {
			return gr_base_qty4_p();
		}
		if ($gi_base_qty_p.equalsIgnoreCase(name)) {
			return gi_base_qty_p();
		}
		if ($gi_base_qty2_p.equalsIgnoreCase(name)) {
			return gi_base_qty2_p();
		}
		if ($gi_base_qty3_p.equalsIgnoreCase(name)) {
			return gi_base_qty3_p();
		}
		if ($gi_base_qty4_p.equalsIgnoreCase(name)) {
			return gi_base_qty4_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($stk_base_qty_p.equalsIgnoreCase(name)) {
			stk_base_qty_p(
				((MCContainerMeta) stk_base_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($stk_base_qty2_p.equalsIgnoreCase(name)) {
			stk_base_qty2_p(
				((MCContainerMeta) stk_base_qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($stk_base_qty3_p.equalsIgnoreCase(name)) {
			stk_base_qty3_p(
				((MCContainerMeta) stk_base_qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($stk_base_qty4_p.equalsIgnoreCase(name)) {
			stk_base_qty4_p(
				((MCContainerMeta) stk_base_qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($gr_base_qty_p.equalsIgnoreCase(name)) {
			gr_base_qty_p(
				((MCContainerMeta) gr_base_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($gr_base_qty2_p.equalsIgnoreCase(name)) {
			gr_base_qty2_p(
				((MCContainerMeta) gr_base_qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($gr_base_qty3_p.equalsIgnoreCase(name)) {
			gr_base_qty3_p(
				((MCContainerMeta) gr_base_qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($gr_base_qty4_p.equalsIgnoreCase(name)) {
			gr_base_qty4_p(
				((MCContainerMeta) gr_base_qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($gi_base_qty_p.equalsIgnoreCase(name)) {
			gi_base_qty_p(
				((MCContainerMeta) gi_base_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($gi_base_qty2_p.equalsIgnoreCase(name)) {
			gi_base_qty2_p(
				((MCContainerMeta) gi_base_qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($gi_base_qty3_p.equalsIgnoreCase(name)) {
			gi_base_qty3_p(
				((MCContainerMeta) gi_base_qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($gi_base_qty4_p.equalsIgnoreCase(name)) {
			gi_base_qty4_p(
				((MCContainerMeta) gi_base_qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return stk_base_qty_p().qty();
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		stk_base_qty_p().qty(value);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(int value) {
		stk_base_qty_p().qty(value);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(long value) {
		stk_base_qty_p().qty(value);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(float value) {
		stk_base_qty_p().qty(value);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(double value) {
		stk_base_qty_p().qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public MCNumber stk_qty2() {
		return stk_base_qty2_p().qty();
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(MCNumber value) {
		stk_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(int value) {
		stk_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(long value) {
		stk_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(float value) {
		stk_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(double value) {
		stk_base_qty2_p().qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public MCNumber stk_qty3() {
		return stk_base_qty3_p().qty();
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(MCNumber value) {
		stk_base_qty3_p().qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(int value) {
		stk_base_qty3_p().qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(long value) {
		stk_base_qty3_p().qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(float value) {
		stk_base_qty3_p().qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(double value) {
		stk_base_qty3_p().qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public MCNumber stk_qty4() {
		return stk_base_qty4_p().qty();
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(MCNumber value) {
		stk_base_qty4_p().qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(int value) {
		stk_base_qty4_p().qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(long value) {
		stk_base_qty4_p().qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(float value) {
		stk_base_qty4_p().qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(double value) {
		stk_base_qty4_p().qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public MCNumber gr_qty() {
		return gr_base_qty_p().qty();
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(MCNumber value) {
		gr_base_qty_p().qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(int value) {
		gr_base_qty_p().qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(long value) {
		gr_base_qty_p().qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(float value) {
		gr_base_qty_p().qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(double value) {
		gr_base_qty_p().qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public MCNumber gr_qty2() {
		return gr_base_qty2_p().qty();
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(MCNumber value) {
		gr_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(int value) {
		gr_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(long value) {
		gr_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(float value) {
		gr_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(double value) {
		gr_base_qty2_p().qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public MCNumber gr_qty3() {
		return gr_base_qty3_p().qty();
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(MCNumber value) {
		gr_base_qty3_p().qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(int value) {
		gr_base_qty3_p().qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(long value) {
		gr_base_qty3_p().qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(float value) {
		gr_base_qty3_p().qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(double value) {
		gr_base_qty3_p().qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public MCNumber gr_qty4() {
		return gr_base_qty4_p().qty();
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(MCNumber value) {
		gr_base_qty4_p().qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(int value) {
		gr_base_qty4_p().qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(long value) {
		gr_base_qty4_p().qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(float value) {
		gr_base_qty4_p().qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(double value) {
		gr_base_qty4_p().qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public MCNumber gi_qty() {
		return gi_base_qty_p().qty();
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(MCNumber value) {
		gi_base_qty_p().qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(int value) {
		gi_base_qty_p().qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(long value) {
		gi_base_qty_p().qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(float value) {
		gi_base_qty_p().qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(double value) {
		gi_base_qty_p().qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public MCNumber gi_qty2() {
		return gi_base_qty2_p().qty();
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(MCNumber value) {
		gi_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(int value) {
		gi_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(long value) {
		gi_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(float value) {
		gi_base_qty2_p().qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(double value) {
		gi_base_qty2_p().qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public MCNumber gi_qty3() {
		return gi_base_qty3_p().qty();
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(MCNumber value) {
		gi_base_qty3_p().qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(int value) {
		gi_base_qty3_p().qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(long value) {
		gi_base_qty3_p().qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(float value) {
		gi_base_qty3_p().qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(double value) {
		gi_base_qty3_p().qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public MCNumber gi_qty4() {
		return gi_base_qty4_p().qty();
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(MCNumber value) {
		gi_base_qty4_p().qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(int value) {
		gi_base_qty4_p().qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(long value) {
		gi_base_qty4_p().qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(float value) {
		gi_base_qty4_p().qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(double value) {
		gi_base_qty4_p().qty(value);
	}

}

