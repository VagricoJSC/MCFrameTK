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
 * ブロック"HdrContFctr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrContFctrR_MC_A extends MCConstRow {

	public static final String $stk_cont_qty_p = "stk_cont_qty_p";
	public static final String $stk_cont_qty2_p = "stk_cont_qty2_p";
	public static final String $stk_cont_qty3_p = "stk_cont_qty3_p";
	public static final String $stk_cont_qty4_p = "stk_cont_qty4_p";
	public static final String $gr_cont_qty_p = "gr_cont_qty_p";
	public static final String $gr_cont_qty2_p = "gr_cont_qty2_p";
	public static final String $gr_cont_qty3_p = "gr_cont_qty3_p";
	public static final String $gr_cont_qty4_p = "gr_cont_qty4_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	public static final String $gi_cont_qty_p = "gi_cont_qty_p";
	public static final String $gi_cont_qty2_p = "gi_cont_qty2_p";
	public static final String $gi_cont_qty3_p = "gi_cont_qty3_p";
	public static final String $gi_cont_qty4_p = "gi_cont_qty4_p";
	public static final String $cont_fctr_p = "cont_fctr_p";

	public static final String $stk_qty = $stk_cont_qty_p + ".cont_qty";
	public static final String $stk_qty2 = $stk_cont_qty2_p + ".cont_qty";
	public static final String $stk_qty3 = $stk_cont_qty3_p + ".cont_qty";
	public static final String $stk_qty4 = $stk_cont_qty4_p + ".cont_qty";
	public static final String $gr_qty = $gr_cont_qty_p + ".cont_qty";
	public static final String $gr_qty2 = $gr_cont_qty2_p + ".cont_qty";
	public static final String $gr_qty3 = $gr_cont_qty3_p + ".cont_qty";
	public static final String $gr_qty4 = $gr_cont_qty4_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $gi_qty = $gi_cont_qty_p + ".cont_qty";
	public static final String $gi_qty2 = $gi_cont_qty2_p + ".cont_qty";
	public static final String $gi_qty3 = $gi_cont_qty3_p + ".cont_qty";
	public static final String $gi_qty4 = $gi_cont_qty4_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_p + ".cont_fctr_unit_nm";

	public static final MCMeta stk_cont_qty_p_META = createInnerRowMeta($stk_cont_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta stk_cont_qty2_p_META = createInnerRowMeta($stk_cont_qty2_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta stk_cont_qty3_p_META = createInnerRowMeta($stk_cont_qty3_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta stk_cont_qty4_p_META = createInnerRowMeta($stk_cont_qty4_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta gr_cont_qty_p_META = createInnerRowMeta($gr_cont_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta gr_cont_qty2_p_META = createInnerRowMeta($gr_cont_qty2_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta gr_cont_qty3_p_META = createInnerRowMeta($gr_cont_qty3_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta gr_cont_qty4_p_META = createInnerRowMeta($gr_cont_qty4_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP0370.StdContFctrR.class);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP0380.ActContFctrR.class);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta gi_cont_qty_p_META = createInnerRowMeta($gi_cont_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta gi_cont_qty2_p_META = createInnerRowMeta($gi_cont_qty2_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta gi_cont_qty3_p_META = createInnerRowMeta($gi_cont_qty3_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta gi_cont_qty4_p_META = createInnerRowMeta($gi_cont_qty4_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta cont_fctr_p_META = createInnerRowMeta($cont_fctr_p, mcframe.clientMAUB.MAUBP0360.ContFctrUnitR.class);

	protected static final ConstMetaList<HdrContFctrR> constMetas = new ConstMetaList<HdrContFctrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			stk_cont_qty_p_META,
			stk_cont_qty2_p_META,
			stk_cont_qty3_p_META,
			stk_cont_qty4_p_META,
			gr_cont_qty_p_META,
			gr_cont_qty2_p_META,
			gr_cont_qty3_p_META,
			gr_cont_qty4_p_META,
			cont_fctr_flg_META,
			std_cont_fctr_p_META,
			act_cont_fctr_p_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			gi_cont_qty_p_META,
			gi_cont_qty2_p_META,
			gi_cont_qty3_p_META,
			gi_cont_qty4_p_META,
			cont_fctr_p_META
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
				"std_cont_fctr",
				"act_cont_fctr",
				"gi_qty",
				"gi_qty2",
				"gi_qty3",
				"gi_qty4",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm"
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
				$std_cont_fctr,
				$act_cont_fctr,
				$gi_qty,
				$gi_qty2,
				$gi_qty3,
				$gi_qty4,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm
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
	protected HdrContFctrR_MC_A(ConstMetaList<? extends HdrContFctrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrContFctrR clone() {
		return (HdrContFctrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrContFctrR createInstance() {
		return (HdrContFctrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrContFctrR getValues(String... names) {
		return (HdrContFctrR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0350.ContQtyR stk_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 0, $stk_cont_qty_p);
	}
	
	public void stk_cont_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 0, $stk_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR stk_cont_qty2_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 1, $stk_cont_qty2_p);
	}
	
	public void stk_cont_qty2_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 1, $stk_cont_qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR stk_cont_qty3_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 2, $stk_cont_qty3_p);
	}
	
	public void stk_cont_qty3_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 2, $stk_cont_qty3_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR stk_cont_qty4_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 3, $stk_cont_qty4_p);
	}
	
	public void stk_cont_qty4_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 3, $stk_cont_qty4_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR gr_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 4, $gr_cont_qty_p);
	}
	
	public void gr_cont_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 4, $gr_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR gr_cont_qty2_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 5, $gr_cont_qty2_p);
	}
	
	public void gr_cont_qty2_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 5, $gr_cont_qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR gr_cont_qty3_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 6, $gr_cont_qty3_p);
	}
	
	public void gr_cont_qty3_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 6, $gr_cont_qty3_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR gr_cont_qty4_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 7, $gr_cont_qty4_p);
	}
	
	public void gr_cont_qty4_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 7, $gr_cont_qty4_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 8, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 8, $cont_fctr_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0370.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP0370.StdContFctrR) getConstInnerRow(offset + 9, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP0370.StdContFctrR row){
		setConstInnerRow(offset + 9, $std_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP0380.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP0380.ActContFctrR) getConstInnerRow(offset + 10, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP0380.ActContFctrR row){
		setConstInnerRow(offset + 10, $act_cont_fctr_p, row);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 11, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 11, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 11, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 11, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 11, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 11, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 12, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 12, $cont_fctr_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR gi_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 13, $gi_cont_qty_p);
	}
	
	public void gi_cont_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 13, $gi_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR gi_cont_qty2_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 14, $gi_cont_qty2_p);
	}
	
	public void gi_cont_qty2_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 14, $gi_cont_qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR gi_cont_qty3_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 15, $gi_cont_qty3_p);
	}
	
	public void gi_cont_qty3_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 15, $gi_cont_qty3_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR gi_cont_qty4_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 16, $gi_cont_qty4_p);
	}
	
	public void gi_cont_qty4_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 16, $gi_cont_qty4_p, row);
	}


	public mcframe.clientMAUB.MAUBP0360.ContFctrUnitR cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP0360.ContFctrUnitR) getConstInnerRow(offset + 17, $cont_fctr_p);
	}
	
	public void cont_fctr_p(mcframe.clientMAUB.MAUBP0360.ContFctrUnitR row){
		setConstInnerRow(offset + 17, $cont_fctr_p, row);
	}


	public String getString(String name) {
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($stk_cont_qty_p.equalsIgnoreCase(name)) {
			return stk_cont_qty_p();
		}
		if ($stk_cont_qty2_p.equalsIgnoreCase(name)) {
			return stk_cont_qty2_p();
		}
		if ($stk_cont_qty3_p.equalsIgnoreCase(name)) {
			return stk_cont_qty3_p();
		}
		if ($stk_cont_qty4_p.equalsIgnoreCase(name)) {
			return stk_cont_qty4_p();
		}
		if ($gr_cont_qty_p.equalsIgnoreCase(name)) {
			return gr_cont_qty_p();
		}
		if ($gr_cont_qty2_p.equalsIgnoreCase(name)) {
			return gr_cont_qty2_p();
		}
		if ($gr_cont_qty3_p.equalsIgnoreCase(name)) {
			return gr_cont_qty3_p();
		}
		if ($gr_cont_qty4_p.equalsIgnoreCase(name)) {
			return gr_cont_qty4_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
		}
		if ($gi_cont_qty_p.equalsIgnoreCase(name)) {
			return gi_cont_qty_p();
		}
		if ($gi_cont_qty2_p.equalsIgnoreCase(name)) {
			return gi_cont_qty2_p();
		}
		if ($gi_cont_qty3_p.equalsIgnoreCase(name)) {
			return gi_cont_qty3_p();
		}
		if ($gi_cont_qty4_p.equalsIgnoreCase(name)) {
			return gi_cont_qty4_p();
		}
		if ($cont_fctr_p.equalsIgnoreCase(name)) {
			return cont_fctr_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($stk_cont_qty_p.equalsIgnoreCase(name)) {
			stk_cont_qty_p(
				((MCContainerMeta) stk_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($stk_cont_qty2_p.equalsIgnoreCase(name)) {
			stk_cont_qty2_p(
				((MCContainerMeta) stk_cont_qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($stk_cont_qty3_p.equalsIgnoreCase(name)) {
			stk_cont_qty3_p(
				((MCContainerMeta) stk_cont_qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($stk_cont_qty4_p.equalsIgnoreCase(name)) {
			stk_cont_qty4_p(
				((MCContainerMeta) stk_cont_qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($gr_cont_qty_p.equalsIgnoreCase(name)) {
			gr_cont_qty_p(
				((MCContainerMeta) gr_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($gr_cont_qty2_p.equalsIgnoreCase(name)) {
			gr_cont_qty2_p(
				((MCContainerMeta) gr_cont_qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($gr_cont_qty3_p.equalsIgnoreCase(name)) {
			gr_cont_qty3_p(
				((MCContainerMeta) gr_cont_qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($gr_cont_qty4_p.equalsIgnoreCase(name)) {
			gr_cont_qty4_p(
				((MCContainerMeta) gr_cont_qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0370.StdContFctrR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0380.ActContFctrR.class, value)
			);
			return;
		}
		if ($gi_cont_qty_p.equalsIgnoreCase(name)) {
			gi_cont_qty_p(
				((MCContainerMeta) gi_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($gi_cont_qty2_p.equalsIgnoreCase(name)) {
			gi_cont_qty2_p(
				((MCContainerMeta) gi_cont_qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($gi_cont_qty3_p.equalsIgnoreCase(name)) {
			gi_cont_qty3_p(
				((MCContainerMeta) gi_cont_qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($gi_cont_qty4_p.equalsIgnoreCase(name)) {
			gi_cont_qty4_p(
				((MCContainerMeta) gi_cont_qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_p.equalsIgnoreCase(name)) {
			cont_fctr_p(
				((MCContainerMeta) cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0360.ContFctrUnitR.class, value)
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
		return stk_cont_qty_p().cont_qty();
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(int value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(long value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(float value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_qty(double value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public MCNumber stk_qty2() {
		return stk_cont_qty2_p().cont_qty();
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(MCNumber value) {
		stk_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(int value) {
		stk_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(long value) {
		stk_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(float value) {
		stk_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (Inventory) 引当（在庫）.<p>
	 *
	 */
	public void stk_qty2(double value) {
		stk_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public MCNumber stk_qty3() {
		return stk_cont_qty3_p().cont_qty();
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(MCNumber value) {
		stk_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(int value) {
		stk_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(long value) {
		stk_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(float value) {
		stk_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (Inventory) 保留（在庫）.<p>
	 *
	 */
	public void stk_qty3(double value) {
		stk_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public MCNumber stk_qty4() {
		return stk_cont_qty4_p().cont_qty();
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(MCNumber value) {
		stk_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(int value) {
		stk_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(long value) {
		stk_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(float value) {
		stk_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Allocatable (Inventory) 引当可能（在庫）.<p>
	 *
	 */
	public void stk_qty4(double value) {
		stk_cont_qty4_p().cont_qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public MCNumber gr_qty() {
		return gr_cont_qty_p().cont_qty();
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(MCNumber value) {
		gr_cont_qty_p().cont_qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(int value) {
		gr_cont_qty_p().cont_qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(long value) {
		gr_cont_qty_p().cont_qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(float value) {
		gr_cont_qty_p().cont_qty(value);
	}

	/**
	 * GR 入庫.<p>
	 *
	 */
	public void gr_qty(double value) {
		gr_cont_qty_p().cont_qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public MCNumber gr_qty2() {
		return gr_cont_qty2_p().cont_qty();
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(MCNumber value) {
		gr_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(int value) {
		gr_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(long value) {
		gr_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(float value) {
		gr_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (GR) 引当（入庫）.<p>
	 *
	 */
	public void gr_qty2(double value) {
		gr_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public MCNumber gr_qty3() {
		return gr_cont_qty3_p().cont_qty();
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(MCNumber value) {
		gr_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(int value) {
		gr_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(long value) {
		gr_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(float value) {
		gr_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (GR) 保留（入庫）.<p>
	 *
	 */
	public void gr_qty3(double value) {
		gr_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public MCNumber gr_qty4() {
		return gr_cont_qty4_p().cont_qty();
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(MCNumber value) {
		gr_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(int value) {
		gr_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(long value) {
		gr_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(float value) {
		gr_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Allocatable (GR) 引当可能（入庫）.<p>
	 *
	 */
	public void gr_qty4(double value) {
		gr_cont_qty4_p().cont_qty(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public MCNumber act_cont_fctr() {
		return act_cont_fctr_p().act_cont_fctr();
	}

	public void act_cont_fctr(MCNumber value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(int value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(long value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(float value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(double value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public MCNumber gi_qty() {
		return gi_cont_qty_p().cont_qty();
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(MCNumber value) {
		gi_cont_qty_p().cont_qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(int value) {
		gi_cont_qty_p().cont_qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(long value) {
		gi_cont_qty_p().cont_qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(float value) {
		gi_cont_qty_p().cont_qty(value);
	}

	/**
	 * GI 出庫.<p>
	 *
	 */
	public void gi_qty(double value) {
		gi_cont_qty_p().cont_qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public MCNumber gi_qty2() {
		return gi_cont_qty2_p().cont_qty();
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(MCNumber value) {
		gi_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(int value) {
		gi_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(long value) {
		gi_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(float value) {
		gi_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Allocation (GI) 引当（出庫）.<p>
	 *
	 */
	public void gi_qty2(double value) {
		gi_cont_qty2_p().cont_qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public MCNumber gi_qty3() {
		return gi_cont_qty3_p().cont_qty();
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(MCNumber value) {
		gi_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(int value) {
		gi_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(long value) {
		gi_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(float value) {
		gi_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Pending (GI) 保留（出庫）.<p>
	 *
	 */
	public void gi_qty3(double value) {
		gi_cont_qty3_p().cont_qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public MCNumber gi_qty4() {
		return gi_cont_qty4_p().cont_qty();
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(MCNumber value) {
		gi_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(int value) {
		gi_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(long value) {
		gi_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(float value) {
		gi_cont_qty4_p().cont_qty(value);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void gi_qty4(double value) {
		gi_cont_qty4_p().cont_qty(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_fctr_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_fctr_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_fctr_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_fctr_p().cont_fctr_unit_nm(value);
	}

}

