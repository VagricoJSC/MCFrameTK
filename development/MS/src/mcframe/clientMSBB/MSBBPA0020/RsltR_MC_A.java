package mcframe.clientMSBB.MSBBPA0020;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	public static final String $par_itm_p = "par_itm_p";
	/**
	 * Product quantity 測線数.<p>
	 *
	 */
	public static final String $surv_line_qty = "surv_line_qty";
	/**
	 * Diameter 口径.<p>
	 *
	 */
	public static final String $diameter = "diameter";
	public static final String $chd_itm_p = "chd_itm_p";
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
	 * Item quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Spec cd. 仕様ＣＤ.<p>
	 *
	 */
	public static final String $spec_cd = "spec_cd";
	/**
	 * Body flag 本体ＦＬＧ.<p>
	 *
	 */
	public static final String $body_flg = "body_flg";
	/**
	 * Component flag 標準構成ＦＬＧ.<p>
	 *
	 */
	public static final String $comp_flg = "comp_flg";
	/**
	 * Ship print flag 出荷帳票出力対象ＦＬＧ.<p>
	 *
	 */
	public static final String $ship_prnt_flg = "ship_prnt_flg";

	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta surv_line_qty_META = createCommonMeta($surv_line_qty, mcframe.commonMA.meta.MA_META.SURV_LINE_QTY);
	public static final MCMeta diameter_META = createCommonMeta($diameter, mcframe.commonMA.meta.MA_META.DIAMETER);
	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spec_cd_META = createCommonMeta($spec_cd, mcframe.commonMA.meta.MA_META.TK_SPEC_CD);
	public static final MCMeta body_flg_META = createCommonMeta($body_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_flg_META = createCommonMeta($comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_prnt_flg_META = createCommonMeta($ship_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			par_itm_p_META,
			surv_line_qty_META,
			diameter_META,
			chd_itm_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			qty_META,
			spec_cd_META,
			body_flg_META,
			comp_flg_META,
			ship_prnt_flg_META
		},
		new String[][]{
			{
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm"
			},
			{
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 1, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 1, $par_itm_p, row);
	}


	/**
	 * Product quantity 測線数.<p>
	 *
	 */
	public String surv_line_qty() {
		return getConstString(offset + 2, $surv_line_qty);
	}

	/**
	 * Product quantity 測線数.<p>
	 *
	 */
	public void surv_line_qty(String value) {
		setConstString(offset + 2, $surv_line_qty, value);
	}


	/**
	 * Diameter 口径.<p>
	 *
	 */
	public String diameter() {
		return getConstString(offset + 3, $diameter);
	}

	/**
	 * Diameter 口径.<p>
	 *
	 */
	public void diameter(String value) {
		setConstString(offset + 3, $diameter, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 4, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 4, $chd_itm_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 5, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 5, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 6, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 6, $base_unit_nm, value);
	}


	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 7, $qty);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 7, $qty, value);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 7, $qty, value);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 7, $qty, value);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 7, $qty, value);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 7, $qty, value);
	}


	/**
	 * Spec cd. 仕様ＣＤ.<p>
	 *
	 */
	public String spec_cd() {
		return getConstString(offset + 8, $spec_cd);
	}

	/**
	 * Spec cd. 仕様ＣＤ.<p>
	 *
	 */
	public void spec_cd(String value) {
		setConstString(offset + 8, $spec_cd, value);
	}


	/**
	 * Body flag 本体ＦＬＧ.<p>
	 *
	 */
	public boolean body_flg() {
		return getConstBoolean(offset + 9, $body_flg);
	}

	/**
	 * Body flag 本体ＦＬＧ.<p>
	 *
	 */
	public void body_flg(boolean value) {
		setConstBoolean(offset + 9, $body_flg, value);
	}


	/**
	 * Component flag 標準構成ＦＬＧ.<p>
	 *
	 */
	public boolean comp_flg() {
		return getConstBoolean(offset + 10, $comp_flg);
	}

	/**
	 * Component flag 標準構成ＦＬＧ.<p>
	 *
	 */
	public void comp_flg(boolean value) {
		setConstBoolean(offset + 10, $comp_flg, value);
	}


	/**
	 * Ship print flag 出荷帳票出力対象ＦＬＧ.<p>
	 *
	 */
	public boolean ship_prnt_flg() {
		return getConstBoolean(offset + 11, $ship_prnt_flg);
	}

	/**
	 * Ship print flag 出荷帳票出力対象ＦＬＧ.<p>
	 *
	 */
	public void ship_prnt_flg(boolean value) {
		setConstBoolean(offset + 11, $ship_prnt_flg, value);
	}


	public String getString(String name) {
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			return spec_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($body_flg.equalsIgnoreCase(name)) {
			return body_flg();
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			return comp_flg();
		}
		if ($ship_prnt_flg.equalsIgnoreCase(name)) {
			return ship_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			return spec_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($body_flg.equalsIgnoreCase(name)) {
			return body_flg();
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			return comp_flg();
		}
		if ($ship_prnt_flg.equalsIgnoreCase(name)) {
			return ship_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			spec_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($body_flg.equalsIgnoreCase(name)) {
			body_flg(value);
			return;
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			comp_flg(value);
			return;
		}
		if ($ship_prnt_flg.equalsIgnoreCase(name)) {
			ship_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			spec_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($body_flg.equalsIgnoreCase(name)) {
			body_flg(value);
			return;
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			comp_flg(value);
			return;
		}
		if ($ship_prnt_flg.equalsIgnoreCase(name)) {
			ship_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return chd_itm_p().itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		chd_itm_p().itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return chd_itm_p().itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		chd_itm_p().itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return chd_itm_p().itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		chd_itm_p().itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return chd_itm_p().itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		chd_itm_p().itm_sub3(value);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return chd_itm_p().itm_nm();
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		chd_itm_p().itm_nm(value);
	}

}

