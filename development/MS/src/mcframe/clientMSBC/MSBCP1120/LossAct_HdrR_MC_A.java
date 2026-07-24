package mcframe.clientMSBC.MSBCP1120;

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
 * ブロック"LossAct_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LossAct_HdrR_MC_A extends MCConstRow {

	public static final String $itm_p = "itm_p";
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
	public static final String $inpt_qty_p = "inpt_qty_p";
	public static final String $loss_qty_p = "loss_qty_p";
	public static final String $fix_loss_qty_p = "fix_loss_qty_p";
	public static final String $cont_inpt_qty_p = "cont_inpt_qty_p";
	public static final String $cont_loss_qty_p = "cont_loss_qty_p";
	public static final String $cont_fix_loss_qty_p = "cont_fix_loss_qty_p";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_dec_place = "base_dec_place";
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $inpt_qty = $inpt_qty_p + ".qty";
	public static final String $loss_qty = $loss_qty_p + ".qty";
	public static final String $fxd_loss_qty = $fix_loss_qty_p + ".qty";
	public static final String $cont_inpt_qty = $cont_inpt_qty_p + ".cont_qty";
	public static final String $cont_loss_qty = $cont_loss_qty_p + ".cont_qty";
	public static final String $cont_fxd_loss_qty = $cont_fix_loss_qty_p + ".cont_qty";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";

	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta inpt_qty_p_META = createInnerRowMeta($inpt_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta loss_qty_p_META = createInnerRowMeta($loss_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta fix_loss_qty_p_META = createInnerRowMeta($fix_loss_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta cont_inpt_qty_p_META = createInnerRowMeta($cont_inpt_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta cont_loss_qty_p_META = createInnerRowMeta($cont_loss_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta cont_fix_loss_qty_p_META = createInnerRowMeta($cont_fix_loss_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP0380.ActContFctrR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP0370.StdContFctrR.class);

	protected static final ConstMetaList<LossAct_HdrR> constMetas = new ConstMetaList<LossAct_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			inpt_qty_p_META,
			loss_qty_p_META,
			fix_loss_qty_p_META,
			cont_inpt_qty_p_META,
			cont_loss_qty_p_META,
			cont_fix_loss_qty_p_META,
			base_dec_place_META,
			base_unit_conv_rnd_typ_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			act_cont_fctr_p_META,
			std_cont_fctr_p_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"inpt_qty",
				"loss_qty",
				"fxd_loss_qty",
				"cont_inpt_qty",
				"cont_loss_qty",
				"cont_fxd_loss_qty",
				"act_cont_fctr",
				"std_cont_fctr"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$inpt_qty,
				$loss_qty,
				$fxd_loss_qty,
				$cont_inpt_qty,
				$cont_loss_qty,
				$cont_fxd_loss_qty,
				$act_cont_fctr,
				$std_cont_fctr
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
	protected LossAct_HdrR_MC_A(ConstMetaList<? extends LossAct_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LossAct_HdrR clone() {
		return (LossAct_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LossAct_HdrR createInstance() {
		return (LossAct_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LossAct_HdrR getValues(String... names) {
		return (LossAct_HdrR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 0, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 0, $itm_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 1, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 1, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 2, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 2, $base_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR inpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 3, $inpt_qty_p);
	}
	
	public void inpt_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 3, $inpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 4, $loss_qty_p);
	}
	
	public void loss_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 4, $loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR fix_loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 5, $fix_loss_qty_p);
	}
	
	public void fix_loss_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 5, $fix_loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR cont_inpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 6, $cont_inpt_qty_p);
	}
	
	public void cont_inpt_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 6, $cont_inpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR cont_loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 7, $cont_loss_qty_p);
	}
	
	public void cont_loss_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 7, $cont_loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR cont_fix_loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 8, $cont_fix_loss_qty_p);
	}
	
	public void cont_fix_loss_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 8, $cont_fix_loss_qty_p, row);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 9, $base_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 9, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 9, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 9, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 9, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 9, $base_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 10, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 10, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 11, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 11, $cont_fctr_flg, value);
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


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 13, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 13, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 13, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 13, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 13, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 13, $cont_fctr_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP0380.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP0380.ActContFctrR) getConstInnerRow(offset + 14, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP0380.ActContFctrR row){
		setConstInnerRow(offset + 14, $act_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP0370.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP0370.StdContFctrR) getConstInnerRow(offset + 15, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP0370.StdContFctrR row){
		setConstInnerRow(offset + 15, $std_cont_fctr_p, row);
	}


	public String getString(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
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
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($inpt_qty_p.equalsIgnoreCase(name)) {
			return inpt_qty_p();
		}
		if ($loss_qty_p.equalsIgnoreCase(name)) {
			return loss_qty_p();
		}
		if ($fix_loss_qty_p.equalsIgnoreCase(name)) {
			return fix_loss_qty_p();
		}
		if ($cont_inpt_qty_p.equalsIgnoreCase(name)) {
			return cont_inpt_qty_p();
		}
		if ($cont_loss_qty_p.equalsIgnoreCase(name)) {
			return cont_loss_qty_p();
		}
		if ($cont_fix_loss_qty_p.equalsIgnoreCase(name)) {
			return cont_fix_loss_qty_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($inpt_qty_p.equalsIgnoreCase(name)) {
			inpt_qty_p(
				((MCContainerMeta) inpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($loss_qty_p.equalsIgnoreCase(name)) {
			loss_qty_p(
				((MCContainerMeta) loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($fix_loss_qty_p.equalsIgnoreCase(name)) {
			fix_loss_qty_p(
				((MCContainerMeta) fix_loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		if ($cont_inpt_qty_p.equalsIgnoreCase(name)) {
			cont_inpt_qty_p(
				((MCContainerMeta) cont_inpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_loss_qty_p.equalsIgnoreCase(name)) {
			cont_loss_qty_p(
				((MCContainerMeta) cont_loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fix_loss_qty_p.equalsIgnoreCase(name)) {
			cont_fix_loss_qty_p(
				((MCContainerMeta) cont_fix_loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0380.ActContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0370.StdContFctrR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public MCNumber inpt_qty() {
		return inpt_qty_p().qty();
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(MCNumber value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(int value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(long value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(float value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(double value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public MCNumber loss_qty() {
		return loss_qty_p().qty();
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(MCNumber value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(int value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(long value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(float value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(double value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. 固定ロス数量.<p>
	 *
	 */
	public MCNumber fxd_loss_qty() {
		return fix_loss_qty_p().qty();
	}

	/**
	 * Constant loss qty. 固定ロス数量.<p>
	 *
	 */
	public void fxd_loss_qty(MCNumber value) {
		fix_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. 固定ロス数量.<p>
	 *
	 */
	public void fxd_loss_qty(int value) {
		fix_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. 固定ロス数量.<p>
	 *
	 */
	public void fxd_loss_qty(long value) {
		fix_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. 固定ロス数量.<p>
	 *
	 */
	public void fxd_loss_qty(float value) {
		fix_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. 固定ロス数量.<p>
	 *
	 */
	public void fxd_loss_qty(double value) {
		fix_loss_qty_p().qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return cont_inpt_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return cont_loss_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_loss_qty() {
		return cont_fix_loss_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(MCNumber value) {
		cont_fix_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(int value) {
		cont_fix_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(long value) {
		cont_fix_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(float value) {
		cont_fix_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(double value) {
		cont_fix_loss_qty_p().cont_qty(value);
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

}

