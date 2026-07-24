package mcframe.clientMSBC.MSBCP1060;

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
 * ブロック"Info"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InfoR_MC_A extends MCConstRow {

	public static final String $itm_p = "itm_p";
	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public static final String $base_unit_std_inpt_qty = "base_unit_std_inpt_qty";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $std_cont_fctr_unit_cd = "std_cont_fctr_unit_cd";
	public static final String $act_cont_qty_p = "act_cont_qty_p";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $act_cont_fctr_unit_cd = "act_cont_fctr_unit_cd";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $act_cont_qty = $act_cont_qty_p + ".cont_qty";

	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta base_unit_std_inpt_qty_META = createCommonMeta($base_unit_std_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP0370.StdContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta std_cont_fctr_unit_cd_META = createCommonMeta($std_cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta act_cont_qty_p_META = createInnerRowMeta($act_cont_qty_p, mcframe.clientMAUB.MAUBP0350.ContQtyR.class);
	public static final MCMeta act_cont_fctr_unit_cd_META = createCommonMeta($act_cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);

	protected static final ConstMetaList<InfoR> constMetas = new ConstMetaList<InfoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_p_META,
			base_unit_std_inpt_qty_META,
			std_cont_fctr_p_META,
			std_cont_qty_p_META,
			std_cont_fctr_unit_cd_META,
			act_cont_qty_p_META,
			act_cont_fctr_unit_cd_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"std_cont_fctr",
				"std_cont_qty",
				"act_cont_qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$std_cont_fctr,
				$std_cont_qty,
				$act_cont_qty
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
				{$std_cont_fctr_p, "CONT_FCTR"},	// std_cont_fctr_p
				{$std_cont_fctr_p + ".std_cont_fctr", "CONT_FCTR"},	// std_cont_fctr_p.std_cont_fctr
				{$std_cont_qty_p, "CONT_FCTR"},	// std_cont_qty_p
				{$std_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// std_cont_qty_p.cont_qty
				{$std_cont_fctr_unit_cd, "CONT_FCTR"},	// std_cont_fctr_unit_cd
				{$act_cont_qty_p, "CONT_FCTR"},	// act_cont_qty_p
				{$act_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// act_cont_qty_p.cont_qty
				{$act_cont_fctr_unit_cd, "CONT_FCTR"}	// act_cont_fctr_unit_cd
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
	protected InfoR_MC_A(ConstMetaList<? extends InfoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InfoR clone() {
		return (InfoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InfoR createInstance() {
		return (InfoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InfoR getValues(String... names) {
		return (InfoR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 0, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 0, $itm_p, row);
	}


	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public MCNumber base_unit_std_inpt_qty() {
		return getConstNumber(offset + 1, $base_unit_std_inpt_qty);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_inpt_qty(MCNumber value) {
		setConstNumber(offset + 1, $base_unit_std_inpt_qty, value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_inpt_qty(int value) {
		setConstNumber(offset + 1, $base_unit_std_inpt_qty, value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_inpt_qty(long value) {
		setConstNumber(offset + 1, $base_unit_std_inpt_qty, value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_inpt_qty(float value) {
		setConstNumber(offset + 1, $base_unit_std_inpt_qty, value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_inpt_qty(double value) {
		setConstNumber(offset + 1, $base_unit_std_inpt_qty, value);
	}


	public mcframe.clientMAUB.MAUBP0370.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP0370.StdContFctrR) getConstInnerRow(offset + 2, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP0370.StdContFctrR row){
		setConstInnerRow(offset + 2, $std_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 3, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 3, $std_cont_qty_p, row);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String std_cont_fctr_unit_cd() {
		return getConstString(offset + 4, $std_cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void std_cont_fctr_unit_cd(String value) {
		setConstString(offset + 4, $std_cont_fctr_unit_cd, value);
	}


	public mcframe.clientMAUB.MAUBP0350.ContQtyR act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP0350.ContQtyR) getConstInnerRow(offset + 5, $act_cont_qty_p);
	}
	
	public void act_cont_qty_p(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		setConstInnerRow(offset + 5, $act_cont_qty_p, row);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String act_cont_fctr_unit_cd() {
		return getConstString(offset + 6, $act_cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void act_cont_fctr_unit_cd(String value) {
		setConstString(offset + 6, $act_cont_fctr_unit_cd, value);
	}


	public String getString(String name) {
		if ($std_cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return std_cont_fctr_unit_cd();
		}
		if ($act_cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return act_cont_fctr_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_std_inpt_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($std_cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return std_cont_fctr_unit_cd();
		}
		if ($act_cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return act_cont_fctr_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_std_inpt_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($std_cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			std_cont_fctr_unit_cd(value);
			return;
		}
		if ($act_cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			act_cont_fctr_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($std_cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			std_cont_fctr_unit_cd(value);
			return;
		}
		if ($act_cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			act_cont_fctr_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_std_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_std_inpt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			return std_cont_qty_p();
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			return act_cont_qty_p();
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
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0370.StdContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			std_cont_qty_p(
				((MCContainerMeta) std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
			);
			return;
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			act_cont_qty_p(
				((MCContainerMeta) act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0350.ContQtyR.class, value)
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
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		act_cont_qty_p().cont_qty(value);
	}

}

