package mcframe.serverMSBE.MSBEL5070;

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
 * ブロック"OPRqst_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OPRqst_Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public static final String $rqst_qty = "rqst_qty";
	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public static final String $gr_schd_qty = "gr_schd_qty";
	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public static final String $stk_qty = "stk_qty";
	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public static final String $gi_schd_qty = "gi_schd_qty";
	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public static final String $shortage_qty = "shortage_qty";
	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public static final String $gr_schd_cont_qty = "gr_schd_cont_qty";
	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public static final String $stk_cont_qty = "stk_cont_qty";
	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public static final String $gi_schd_cont_qty = "gi_schd_cont_qty";
	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public static final String $shortage_cont_qty = "shortage_cont_qty";
	/**
	 * Shortage 不足.<p>
	 *
	 */
	public static final String $shortage_flg = "shortage_flg";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_qty_META = createCommonMeta($rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_schd_qty_META = createCommonMeta($gr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_qty_META = createCommonMeta($stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_schd_qty_META = createCommonMeta($gi_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta shortage_qty_META = createCommonMeta($shortage_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_schd_cont_qty_META = createCommonMeta($gr_schd_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta stk_cont_qty_META = createCommonMeta($stk_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta gi_schd_cont_qty_META = createCommonMeta($gi_schd_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta shortage_cont_qty_META = createCommonMeta($shortage_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta shortage_flg_META = createCommonMeta($shortage_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<OPRqst_Srch01_RsltR> constMetas = new ConstMetaList<OPRqst_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			strg_loc_cd_META,
			rqst_qty_META,
			gr_schd_qty_META,
			stk_qty_META,
			gi_schd_qty_META,
			shortage_qty_META,
			gr_schd_cont_qty_META,
			stk_cont_qty_META,
			gi_schd_cont_qty_META,
			shortage_cont_qty_META,
			shortage_flg_META
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
	protected OPRqst_Srch01_RsltR_MC_A(ConstMetaList<? extends OPRqst_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OPRqst_Srch01_RsltR clone() {
		return (OPRqst_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OPRqst_Srch01_RsltR createInstance() {
		return (OPRqst_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OPRqst_Srch01_RsltR getValues(String... names) {
		return (OPRqst_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 4, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 4, $strg_loc_cd, value);
	}


	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public MCNumber rqst_qty() {
		return getConstNumber(offset + 5, $rqst_qty);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(MCNumber value) {
		setConstNumber(offset + 5, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(int value) {
		setConstNumber(offset + 5, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(long value) {
		setConstNumber(offset + 5, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(float value) {
		setConstNumber(offset + 5, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(double value) {
		setConstNumber(offset + 5, $rqst_qty, value);
	}


	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public MCNumber gr_schd_qty() {
		return getConstNumber(offset + 6, $gr_schd_qty);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(MCNumber value) {
		setConstNumber(offset + 6, $gr_schd_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(int value) {
		setConstNumber(offset + 6, $gr_schd_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(long value) {
		setConstNumber(offset + 6, $gr_schd_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(float value) {
		setConstNumber(offset + 6, $gr_schd_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void gr_schd_qty(double value) {
		setConstNumber(offset + 6, $gr_schd_qty, value);
	}


	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return getConstNumber(offset + 7, $stk_qty);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		setConstNumber(offset + 7, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(int value) {
		setConstNumber(offset + 7, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(long value) {
		setConstNumber(offset + 7, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(float value) {
		setConstNumber(offset + 7, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(double value) {
		setConstNumber(offset + 7, $stk_qty, value);
	}


	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public MCNumber gi_schd_qty() {
		return getConstNumber(offset + 8, $gi_schd_qty);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(MCNumber value) {
		setConstNumber(offset + 8, $gi_schd_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(int value) {
		setConstNumber(offset + 8, $gi_schd_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(long value) {
		setConstNumber(offset + 8, $gi_schd_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(float value) {
		setConstNumber(offset + 8, $gi_schd_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void gi_schd_qty(double value) {
		setConstNumber(offset + 8, $gi_schd_qty, value);
	}


	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public MCNumber shortage_qty() {
		return getConstNumber(offset + 9, $shortage_qty);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(MCNumber value) {
		setConstNumber(offset + 9, $shortage_qty, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(int value) {
		setConstNumber(offset + 9, $shortage_qty, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(long value) {
		setConstNumber(offset + 9, $shortage_qty, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(float value) {
		setConstNumber(offset + 9, $shortage_qty, value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(double value) {
		setConstNumber(offset + 9, $shortage_qty, value);
	}


	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public MCNumber gr_schd_cont_qty() {
		return getConstNumber(offset + 10, $gr_schd_cont_qty);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(MCNumber value) {
		setConstNumber(offset + 10, $gr_schd_cont_qty, value);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(int value) {
		setConstNumber(offset + 10, $gr_schd_cont_qty, value);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(long value) {
		setConstNumber(offset + 10, $gr_schd_cont_qty, value);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(float value) {
		setConstNumber(offset + 10, $gr_schd_cont_qty, value);
	}

	/**
	 * GR active ingredient 入庫有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(double value) {
		setConstNumber(offset + 10, $gr_schd_cont_qty, value);
	}


	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public MCNumber stk_cont_qty() {
		return getConstNumber(offset + 11, $stk_cont_qty);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(MCNumber value) {
		setConstNumber(offset + 11, $stk_cont_qty, value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(int value) {
		setConstNumber(offset + 11, $stk_cont_qty, value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(long value) {
		setConstNumber(offset + 11, $stk_cont_qty, value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(float value) {
		setConstNumber(offset + 11, $stk_cont_qty, value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(double value) {
		setConstNumber(offset + 11, $stk_cont_qty, value);
	}


	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public MCNumber gi_schd_cont_qty() {
		return getConstNumber(offset + 12, $gi_schd_cont_qty);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(MCNumber value) {
		setConstNumber(offset + 12, $gi_schd_cont_qty, value);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(int value) {
		setConstNumber(offset + 12, $gi_schd_cont_qty, value);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(long value) {
		setConstNumber(offset + 12, $gi_schd_cont_qty, value);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(float value) {
		setConstNumber(offset + 12, $gi_schd_cont_qty, value);
	}

	/**
	 * GI active ingredient 出庫有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(double value) {
		setConstNumber(offset + 12, $gi_schd_cont_qty, value);
	}


	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public MCNumber shortage_cont_qty() {
		return getConstNumber(offset + 13, $shortage_cont_qty);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(MCNumber value) {
		setConstNumber(offset + 13, $shortage_cont_qty, value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(int value) {
		setConstNumber(offset + 13, $shortage_cont_qty, value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(long value) {
		setConstNumber(offset + 13, $shortage_cont_qty, value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(float value) {
		setConstNumber(offset + 13, $shortage_cont_qty, value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(double value) {
		setConstNumber(offset + 13, $shortage_cont_qty, value);
	}


	/**
	 * Shortage 不足.<p>
	 *
	 */
	public boolean shortage_flg() {
		return getConstBoolean(offset + 14, $shortage_flg);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void shortage_flg(boolean value) {
		setConstBoolean(offset + 14, $shortage_flg, value);
	}


	public String getString(String name) {
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			return gi_schd_qty();
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			return shortage_qty();
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			return gr_schd_cont_qty();
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			return stk_cont_qty();
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			return gi_schd_cont_qty();
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			return shortage_cont_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($shortage_flg.equalsIgnoreCase(name)) {
			return shortage_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			return gi_schd_qty();
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			return shortage_qty();
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			return gr_schd_cont_qty();
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			return stk_cont_qty();
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			return gi_schd_cont_qty();
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			return shortage_cont_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($shortage_flg.equalsIgnoreCase(name)) {
			return shortage_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($shortage_flg.equalsIgnoreCase(name)) {
			shortage_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($shortage_qty.equalsIgnoreCase(name)) {
			shortage_qty(value);
			return;
		}
		if ($gr_schd_cont_qty.equalsIgnoreCase(name)) {
			gr_schd_cont_qty(value);
			return;
		}
		if ($stk_cont_qty.equalsIgnoreCase(name)) {
			stk_cont_qty(value);
			return;
		}
		if ($gi_schd_cont_qty.equalsIgnoreCase(name)) {
			gi_schd_cont_qty(value);
			return;
		}
		if ($shortage_cont_qty.equalsIgnoreCase(name)) {
			shortage_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($shortage_flg.equalsIgnoreCase(name)) {
			shortage_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

