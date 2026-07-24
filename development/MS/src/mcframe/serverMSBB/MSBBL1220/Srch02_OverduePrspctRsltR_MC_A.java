package mcframe.serverMSBB.MSBBL1220;

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
 * ブロック"Srch02_OverduePrspctRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_OverduePrspctRsltR_MC_A extends MCConstRow {

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Date and time 日時.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * Shipping scheduled qty. (Base unit) 出荷予定数量(基準単位).<p>
	 *
	 */
	public static final String $ship_schd_qty = "ship_schd_qty";
	/**
	 * Shipping result qty. (Base unit) 出荷実績数量(基準単位).<p>
	 *
	 */
	public static final String $ship_act_qty = "ship_act_qty";
	/**
	 * Replied qty. (Base unit) 回答数量(基準単位).<p>
	 *
	 */
	public static final String $prms_qty = "prms_qty";
	/**
	 * Adjusted shipping schedule qty. 調整済出荷予定数.<p>
	 *
	 */
	public static final String $adj_ship_shcd_qty = "adj_ship_shcd_qty";
	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public static final String $rqst_qty = "rqst_qty";
	/**
	 * Request unit cd. 依頼単位ＣＤ.<p>
	 *
	 */
	public static final String $rqst_unit_cd = "rqst_unit_cd";
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public static final String $conv_base_qty = "conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $conv_qty = "conv_qty";
	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public static final String $base_unit_rqst_qty = "base_unit_rqst_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";


	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_qty_META = createCommonMeta($ship_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_act_qty_META = createCommonMeta($ship_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_qty_META = createCommonMeta($prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta adj_ship_shcd_qty_META = createCommonMeta($adj_ship_shcd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqst_qty_META = createCommonMeta($rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqst_unit_cd_META = createCommonMeta($rqst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta conv_base_qty_META = createCommonMeta($conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta conv_qty_META = createCommonMeta($conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqst_qty_META = createCommonMeta($base_unit_rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);

	protected static final ConstMetaList<Srch02_OverduePrspctRsltR> constMetas = new ConstMetaList<Srch02_OverduePrspctRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_d_no_META,
			dt_META,
			ship_schd_qty_META,
			ship_act_qty_META,
			prms_qty_META,
			adj_ship_shcd_qty_META,
			rqst_qty_META,
			rqst_unit_cd_META,
			conv_base_qty_META,
			conv_qty_META,
			base_unit_rqst_qty_META,
			base_unit_cd_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META
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
	protected Srch02_OverduePrspctRsltR_MC_A(ConstMetaList<? extends Srch02_OverduePrspctRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_OverduePrspctRsltR clone() {
		return (Srch02_OverduePrspctRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_OverduePrspctRsltR createInstance() {
		return (Srch02_OverduePrspctRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_OverduePrspctRsltR getValues(String... names) {
		return (Srch02_OverduePrspctRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 0, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 0, $slo_d_no, value);
	}


	/**
	 * Date and time 日時.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 1, $dt);
	}

	/**
	 * Date and time 日時.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 1, $dt, value);
	}


	/**
	 * Shipping scheduled qty. (Base unit) 出荷予定数量(基準単位).<p>
	 *
	 */
	public MCNumber ship_schd_qty() {
		return getConstNumber(offset + 2, $ship_schd_qty);
	}

	/**
	 * Shipping scheduled qty. (Base unit) 出荷予定数量(基準単位).<p>
	 *
	 */
	public void ship_schd_qty(MCNumber value) {
		setConstNumber(offset + 2, $ship_schd_qty, value);
	}

	/**
	 * Shipping scheduled qty. (Base unit) 出荷予定数量(基準単位).<p>
	 *
	 */
	public void ship_schd_qty(int value) {
		setConstNumber(offset + 2, $ship_schd_qty, value);
	}

	/**
	 * Shipping scheduled qty. (Base unit) 出荷予定数量(基準単位).<p>
	 *
	 */
	public void ship_schd_qty(long value) {
		setConstNumber(offset + 2, $ship_schd_qty, value);
	}

	/**
	 * Shipping scheduled qty. (Base unit) 出荷予定数量(基準単位).<p>
	 *
	 */
	public void ship_schd_qty(float value) {
		setConstNumber(offset + 2, $ship_schd_qty, value);
	}

	/**
	 * Shipping scheduled qty. (Base unit) 出荷予定数量(基準単位).<p>
	 *
	 */
	public void ship_schd_qty(double value) {
		setConstNumber(offset + 2, $ship_schd_qty, value);
	}


	/**
	 * Shipping result qty. (Base unit) 出荷実績数量(基準単位).<p>
	 *
	 */
	public MCNumber ship_act_qty() {
		return getConstNumber(offset + 3, $ship_act_qty);
	}

	/**
	 * Shipping result qty. (Base unit) 出荷実績数量(基準単位).<p>
	 *
	 */
	public void ship_act_qty(MCNumber value) {
		setConstNumber(offset + 3, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. (Base unit) 出荷実績数量(基準単位).<p>
	 *
	 */
	public void ship_act_qty(int value) {
		setConstNumber(offset + 3, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. (Base unit) 出荷実績数量(基準単位).<p>
	 *
	 */
	public void ship_act_qty(long value) {
		setConstNumber(offset + 3, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. (Base unit) 出荷実績数量(基準単位).<p>
	 *
	 */
	public void ship_act_qty(float value) {
		setConstNumber(offset + 3, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. (Base unit) 出荷実績数量(基準単位).<p>
	 *
	 */
	public void ship_act_qty(double value) {
		setConstNumber(offset + 3, $ship_act_qty, value);
	}


	/**
	 * Replied qty. (Base unit) 回答数量(基準単位).<p>
	 *
	 */
	public MCNumber prms_qty() {
		return getConstNumber(offset + 4, $prms_qty);
	}

	/**
	 * Replied qty. (Base unit) 回答数量(基準単位).<p>
	 *
	 */
	public void prms_qty(MCNumber value) {
		setConstNumber(offset + 4, $prms_qty, value);
	}

	/**
	 * Replied qty. (Base unit) 回答数量(基準単位).<p>
	 *
	 */
	public void prms_qty(int value) {
		setConstNumber(offset + 4, $prms_qty, value);
	}

	/**
	 * Replied qty. (Base unit) 回答数量(基準単位).<p>
	 *
	 */
	public void prms_qty(long value) {
		setConstNumber(offset + 4, $prms_qty, value);
	}

	/**
	 * Replied qty. (Base unit) 回答数量(基準単位).<p>
	 *
	 */
	public void prms_qty(float value) {
		setConstNumber(offset + 4, $prms_qty, value);
	}

	/**
	 * Replied qty. (Base unit) 回答数量(基準単位).<p>
	 *
	 */
	public void prms_qty(double value) {
		setConstNumber(offset + 4, $prms_qty, value);
	}


	/**
	 * Adjusted shipping schedule qty. 調整済出荷予定数.<p>
	 *
	 */
	public MCNumber adj_ship_shcd_qty() {
		return getConstNumber(offset + 5, $adj_ship_shcd_qty);
	}

	/**
	 * Adjusted shipping schedule qty. 調整済出荷予定数.<p>
	 *
	 */
	public void adj_ship_shcd_qty(MCNumber value) {
		setConstNumber(offset + 5, $adj_ship_shcd_qty, value);
	}

	/**
	 * Adjusted shipping schedule qty. 調整済出荷予定数.<p>
	 *
	 */
	public void adj_ship_shcd_qty(int value) {
		setConstNumber(offset + 5, $adj_ship_shcd_qty, value);
	}

	/**
	 * Adjusted shipping schedule qty. 調整済出荷予定数.<p>
	 *
	 */
	public void adj_ship_shcd_qty(long value) {
		setConstNumber(offset + 5, $adj_ship_shcd_qty, value);
	}

	/**
	 * Adjusted shipping schedule qty. 調整済出荷予定数.<p>
	 *
	 */
	public void adj_ship_shcd_qty(float value) {
		setConstNumber(offset + 5, $adj_ship_shcd_qty, value);
	}

	/**
	 * Adjusted shipping schedule qty. 調整済出荷予定数.<p>
	 *
	 */
	public void adj_ship_shcd_qty(double value) {
		setConstNumber(offset + 5, $adj_ship_shcd_qty, value);
	}


	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public MCNumber rqst_qty() {
		return getConstNumber(offset + 6, $rqst_qty);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(MCNumber value) {
		setConstNumber(offset + 6, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(int value) {
		setConstNumber(offset + 6, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(long value) {
		setConstNumber(offset + 6, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(float value) {
		setConstNumber(offset + 6, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(double value) {
		setConstNumber(offset + 6, $rqst_qty, value);
	}


	/**
	 * Request unit cd. 依頼単位ＣＤ.<p>
	 *
	 */
	public String rqst_unit_cd() {
		return getConstString(offset + 7, $rqst_unit_cd);
	}

	/**
	 * Request unit cd. 依頼単位ＣＤ.<p>
	 *
	 */
	public void rqst_unit_cd(String value) {
		setConstString(offset + 7, $rqst_unit_cd, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber conv_base_qty() {
		return getConstNumber(offset + 8, $conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void conv_base_qty(MCNumber value) {
		setConstNumber(offset + 8, $conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void conv_base_qty(int value) {
		setConstNumber(offset + 8, $conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void conv_base_qty(long value) {
		setConstNumber(offset + 8, $conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void conv_base_qty(float value) {
		setConstNumber(offset + 8, $conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void conv_base_qty(double value) {
		setConstNumber(offset + 8, $conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return getConstNumber(offset + 9, $conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		setConstNumber(offset + 9, $conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void conv_qty(int value) {
		setConstNumber(offset + 9, $conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void conv_qty(long value) {
		setConstNumber(offset + 9, $conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void conv_qty(float value) {
		setConstNumber(offset + 9, $conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void conv_qty(double value) {
		setConstNumber(offset + 9, $conv_qty, value);
	}


	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public MCNumber base_unit_rqst_qty() {
		return getConstNumber(offset + 10, $base_unit_rqst_qty);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void base_unit_rqst_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_rqst_qty, value);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void base_unit_rqst_qty(int value) {
		setConstNumber(offset + 10, $base_unit_rqst_qty, value);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void base_unit_rqst_qty(long value) {
		setConstNumber(offset + 10, $base_unit_rqst_qty, value);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void base_unit_rqst_qty(float value) {
		setConstNumber(offset + 10, $base_unit_rqst_qty, value);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void base_unit_rqst_qty(double value) {
		setConstNumber(offset + 10, $base_unit_rqst_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 11, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 11, $base_unit_cd, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 12, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 12, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 13, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 13, $base_unit_rnd_typ, value);
	}


	public String getString(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			return rqst_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			return ship_schd_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			return prms_qty();
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			return adj_ship_shcd_qty();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			return base_unit_rqst_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			return rqst_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			return ship_schd_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			return prms_qty();
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			return adj_ship_shcd_qty();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			return base_unit_rqst_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			rqst_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			rqst_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ship_schd_qty.equalsIgnoreCase(name)) {
			ship_schd_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($adj_ship_shcd_qty.equalsIgnoreCase(name)) {
			adj_ship_shcd_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_rqst_qty.equalsIgnoreCase(name)) {
			base_unit_rqst_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

