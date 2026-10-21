package mcframe.serverMSBB.MSBBLA0020;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public static final String $prod_itm_cd = "prod_itm_cd";
	/**
	 * Product branch no 1 製品枝番１.<p>
	 *
	 */
	public static final String $prod_itm_sub1 = "prod_itm_sub1";
	/**
	 * Product branch no 2 製品枝番２.<p>
	 *
	 */
	public static final String $prod_itm_sub2 = "prod_itm_sub2";
	/**
	 * Product branch no 3 製品枝番３.<p>
	 *
	 */
	public static final String $prod_itm_sub3 = "prod_itm_sub3";
	/**
	 * Product name 製品名.<p>
	 *
	 */
	public static final String $prod_itm_nm = "prod_itm_nm";
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
	/**
	 * Item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Item branch no 1 構成品目枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Item branch no 2 構成品目枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Item branch no 3 構成品目枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Product name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
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


	public static final MCMeta prod_itm_cd_META = createCommonMeta($prod_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta prod_itm_sub1_META = createCommonMeta($prod_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta prod_itm_sub2_META = createCommonMeta($prod_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta prod_itm_sub3_META = createCommonMeta($prod_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta prod_itm_nm_META = createCommonMeta($prod_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta surv_line_qty_META = createCommonMeta($surv_line_qty, mcframe.commonMA.meta.MA_META.SURV_LINE_QTY);
	public static final MCMeta diameter_META = createCommonMeta($diameter, mcframe.commonMA.meta.MA_META.DIAMETER);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spec_cd_META = createCommonMeta($spec_cd, mcframe.commonMA.meta.MA_META.TK_SPEC_CD);
	public static final MCMeta body_flg_META = createCommonMeta($body_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_flg_META = createCommonMeta($comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_prnt_flg_META = createCommonMeta($ship_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prod_itm_cd_META,
			prod_itm_sub1_META,
			prod_itm_sub2_META,
			prod_itm_sub3_META,
			prod_itm_nm_META,
			surv_line_qty_META,
			diameter_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			qty_META,
			spec_cd_META,
			body_flg_META,
			comp_flg_META,
			ship_prnt_flg_META
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public String prod_itm_cd() {
		return getConstString(offset + 0, $prod_itm_cd);
	}

	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public void prod_itm_cd(String value) {
		setConstString(offset + 0, $prod_itm_cd, value);
	}


	/**
	 * Product branch no 1 製品枝番１.<p>
	 *
	 */
	public String prod_itm_sub1() {
		return getConstString(offset + 1, $prod_itm_sub1);
	}

	/**
	 * Product branch no 1 製品枝番１.<p>
	 *
	 */
	public void prod_itm_sub1(String value) {
		setConstString(offset + 1, $prod_itm_sub1, value);
	}


	/**
	 * Product branch no 2 製品枝番２.<p>
	 *
	 */
	public String prod_itm_sub2() {
		return getConstString(offset + 2, $prod_itm_sub2);
	}

	/**
	 * Product branch no 2 製品枝番２.<p>
	 *
	 */
	public void prod_itm_sub2(String value) {
		setConstString(offset + 2, $prod_itm_sub2, value);
	}


	/**
	 * Product branch no 3 製品枝番３.<p>
	 *
	 */
	public String prod_itm_sub3() {
		return getConstString(offset + 3, $prod_itm_sub3);
	}

	/**
	 * Product branch no 3 製品枝番３.<p>
	 *
	 */
	public void prod_itm_sub3(String value) {
		setConstString(offset + 3, $prod_itm_sub3, value);
	}


	/**
	 * Product name 製品名.<p>
	 *
	 */
	public String prod_itm_nm() {
		return getConstString(offset + 4, $prod_itm_nm);
	}

	/**
	 * Product name 製品名.<p>
	 *
	 */
	public void prod_itm_nm(String value) {
		setConstString(offset + 4, $prod_itm_nm, value);
	}


	/**
	 * Product quantity 測線数.<p>
	 *
	 */
	public String surv_line_qty() {
		return getConstString(offset + 5, $surv_line_qty);
	}

	/**
	 * Product quantity 測線数.<p>
	 *
	 */
	public void surv_line_qty(String value) {
		setConstString(offset + 5, $surv_line_qty, value);
	}


	/**
	 * Diameter 口径.<p>
	 *
	 */
	public String diameter() {
		return getConstString(offset + 6, $diameter);
	}

	/**
	 * Diameter 口径.<p>
	 *
	 */
	public void diameter(String value) {
		setConstString(offset + 6, $diameter, value);
	}


	/**
	 * Item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 7, $itm_cd);
	}

	/**
	 * Item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 7, $itm_cd, value);
	}


	/**
	 * Item branch no 1 構成品目枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 8, $itm_sub1);
	}

	/**
	 * Item branch no 1 構成品目枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 8, $itm_sub1, value);
	}


	/**
	 * Item branch no 2 構成品目枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 9, $itm_sub2);
	}

	/**
	 * Item branch no 2 構成品目枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 9, $itm_sub2, value);
	}


	/**
	 * Item branch no 3 構成品目枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 10, $itm_sub3);
	}

	/**
	 * Item branch no 3 構成品目枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 10, $itm_sub3, value);
	}


	/**
	 * Product name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 11, $itm_nm);
	}

	/**
	 * Product name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 11, $itm_nm, value);
	}


	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 12, $qty);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 12, $qty, value);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 12, $qty, value);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 12, $qty, value);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 12, $qty, value);
	}

	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 12, $qty, value);
	}


	/**
	 * Spec cd. 仕様ＣＤ.<p>
	 *
	 */
	public String spec_cd() {
		return getConstString(offset + 13, $spec_cd);
	}

	/**
	 * Spec cd. 仕様ＣＤ.<p>
	 *
	 */
	public void spec_cd(String value) {
		setConstString(offset + 13, $spec_cd, value);
	}


	/**
	 * Body flag 本体ＦＬＧ.<p>
	 *
	 */
	public boolean body_flg() {
		return getConstBoolean(offset + 14, $body_flg);
	}

	/**
	 * Body flag 本体ＦＬＧ.<p>
	 *
	 */
	public void body_flg(boolean value) {
		setConstBoolean(offset + 14, $body_flg, value);
	}


	/**
	 * Component flag 標準構成ＦＬＧ.<p>
	 *
	 */
	public boolean comp_flg() {
		return getConstBoolean(offset + 15, $comp_flg);
	}

	/**
	 * Component flag 標準構成ＦＬＧ.<p>
	 *
	 */
	public void comp_flg(boolean value) {
		setConstBoolean(offset + 15, $comp_flg, value);
	}


	/**
	 * Ship print flag 出荷帳票出力対象ＦＬＧ.<p>
	 *
	 */
	public boolean ship_prnt_flg() {
		return getConstBoolean(offset + 16, $ship_prnt_flg);
	}

	/**
	 * Ship print flag 出荷帳票出力対象ＦＬＧ.<p>
	 *
	 */
	public void ship_prnt_flg(boolean value) {
		setConstBoolean(offset + 16, $ship_prnt_flg, value);
	}


	public String getString(String name) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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



}

