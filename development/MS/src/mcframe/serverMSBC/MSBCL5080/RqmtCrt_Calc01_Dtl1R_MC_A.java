package mcframe.serverMSBC.MSBCL5080;

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
 * ブロック"RqmtCrt_Calc01_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RqmtCrt_Calc01_Dtl1R_MC_A extends MCConstRow {

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $pln_ym = "pln_ym";
	/**
	 * Production month 生産年月.<p>
	 *
	 */
	public static final String $prod_ym = "prod_ym";
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Storage location calendar cd. 格納場所カレンダＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cal_cd = "strg_loc_cal_cd";
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public static final String $prod_qty_by_day = "prod_qty_by_day";
	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon01_prod_qty = "mon01_prod_qty";
	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon02_prod_qty = "mon02_prod_qty";
	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon03_prod_qty = "mon03_prod_qty";
	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon04_prod_qty = "mon04_prod_qty";
	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon05_prod_qty = "mon05_prod_qty";
	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon06_prod_qty = "mon06_prod_qty";
	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon07_prod_qty = "mon07_prod_qty";
	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon08_prod_qty = "mon08_prod_qty";
	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon09_prod_qty = "mon09_prod_qty";
	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon10_prod_qty = "mon10_prod_qty";
	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon11_prod_qty = "mon11_prod_qty";
	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon12_prod_qty = "mon12_prod_qty";
	/**
	 * Proportion ratio 案分比率.<p>
	 *
	 */
	public static final String $prod_rate = "prod_rate";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Production stat date 生産開始日.<p>
	 *
	 */
	public static final String $prod_begin_day = "prod_begin_day";
	/**
	 * Creation start date 作成開始年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public static final String $date_div_mons = "date_div_mons";
	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public static final String $week_div_mons = "week_div_mons";
	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public static final String $period_div_mons = "period_div_mons";
	/**
	 * Production request created months 生産依頼作成月数.<p>
	 *
	 */
	public static final String $rqmt_mons = "rqmt_mons";
	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public static final String $prcd_mons = "prcd_mons";
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public static final String $rqmt_typ = "rqmt_typ";
	/**
	 * Mfg. location supplier cd. 製造場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_sppl_cd = "mfg_loc_sppl_cd";
	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public static final String $prod_pln_typ = "prod_pln_typ";
	/**
	 * Disaggregation by day type 日ばらし区分.<p>
	 *
	 */
	public static final String $date_div_typ = "date_div_typ";


	public static final MCMeta pln_ym_META = createCommonMeta($pln_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta prod_ym_META = createCommonMeta($prod_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta strg_loc_cal_cd_META = createCommonMeta($strg_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta prod_qty_by_day_META = createCommonMeta($prod_qty_by_day, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon01_prod_qty_META = createCommonMeta($mon01_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon02_prod_qty_META = createCommonMeta($mon02_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon03_prod_qty_META = createCommonMeta($mon03_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon04_prod_qty_META = createCommonMeta($mon04_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon05_prod_qty_META = createCommonMeta($mon05_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon06_prod_qty_META = createCommonMeta($mon06_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon07_prod_qty_META = createCommonMeta($mon07_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon08_prod_qty_META = createCommonMeta($mon08_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon09_prod_qty_META = createCommonMeta($mon09_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon10_prod_qty_META = createCommonMeta($mon10_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon11_prod_qty_META = createCommonMeta($mon11_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon12_prod_qty_META = createCommonMeta($mon12_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prod_rate_META = createCommonMeta($prod_rate, mcframe.commonMA.meta.MA_META.PROD_RATE);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prod_begin_day_META = createCommonMeta($prod_begin_day, mcframe.commonMA.meta.MA_META.PROD_BEGIN_DAY);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta date_div_mons_META = createCommonMeta($date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta week_div_mons_META = createCommonMeta($week_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta period_div_mons_META = createCommonMeta($period_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta rqmt_mons_META = createCommonMeta($rqmt_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta prcd_mons_META = createCommonMeta($prcd_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta rqmt_typ_META = createCommonMeta($rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta mfg_loc_sppl_cd_META = createCommonMeta($mfg_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prod_pln_typ_META = createCommonMeta($prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta date_div_typ_META = createCommonMeta($date_div_typ, mcframe.commonMA.meta.MA_META.DATE_DIV_TYP);

	protected static final ConstMetaList<RqmtCrt_Calc01_Dtl1R> constMetas = new ConstMetaList<RqmtCrt_Calc01_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pln_ym_META,
			prod_ym_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			strg_loc_cd_META,
			wg_cd_META,
			strg_loc_cal_cd_META,
			mps_grp_cd_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			rqst_loc_cd_META,
			qty_META,
			dec_place_META,
			prod_qty_by_day_META,
			mon01_prod_qty_META,
			mon02_prod_qty_META,
			mon03_prod_qty_META,
			mon04_prod_qty_META,
			mon05_prod_qty_META,
			mon06_prod_qty_META,
			mon07_prod_qty_META,
			mon08_prod_qty_META,
			mon09_prod_qty_META,
			mon10_prod_qty_META,
			mon11_prod_qty_META,
			mon12_prod_qty_META,
			prod_rate_META,
			prio_META,
			prod_begin_day_META,
			ym_META,
			date_div_mons_META,
			week_div_mons_META,
			period_div_mons_META,
			rqmt_mons_META,
			prcd_mons_META,
			rqmt_typ_META,
			mfg_loc_sppl_cd_META,
			prod_pln_typ_META,
			date_div_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected RqmtCrt_Calc01_Dtl1R_MC_A(ConstMetaList<? extends RqmtCrt_Calc01_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_Dtl1R clone() {
		return (RqmtCrt_Calc01_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_Dtl1R createInstance() {
		return (RqmtCrt_Calc01_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_Dtl1R getValues(String... names) {
		return (RqmtCrt_Calc01_Dtl1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate pln_ym() {
		return getConstDate(offset + 0, $pln_ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void pln_ym(MCDate value) {
		setConstDate(offset + 0, $pln_ym, value);
	}


	/**
	 * Production month 生産年月.<p>
	 *
	 */
	public MCDate prod_ym() {
		return getConstDate(offset + 1, $prod_ym);
	}

	/**
	 * Production month 生産年月.<p>
	 *
	 */
	public void prod_ym(MCDate value) {
		setConstDate(offset + 1, $prod_ym, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 6, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 6, $strg_loc_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
	}


	/**
	 * Storage location calendar cd. 格納場所カレンダＣＤ.<p>
	 *
	 */
	public String strg_loc_cal_cd() {
		return getConstString(offset + 8, $strg_loc_cal_cd);
	}

	/**
	 * Storage location calendar cd. 格納場所カレンダＣＤ.<p>
	 *
	 */
	public void strg_loc_cal_cd(String value) {
		setConstString(offset + 8, $strg_loc_cal_cd, value);
	}


	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 9, $mps_grp_cd);
	}

	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 9, $mps_grp_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 10, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 10, $mfg_loc_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 11, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 11, $sppl_cd, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 12, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 12, $rqst_loc_cd, value);
	}


	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 13, $qty);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 13, $qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 13, $qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 13, $qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 13, $qty, value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 13, $qty, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 14, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 14, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 14, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 14, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 14, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 14, $dec_place, value);
	}


	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public MCNumber prod_qty_by_day() {
		return getConstNumber(offset + 15, $prod_qty_by_day);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(MCNumber value) {
		setConstNumber(offset + 15, $prod_qty_by_day, value);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(int value) {
		setConstNumber(offset + 15, $prod_qty_by_day, value);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(long value) {
		setConstNumber(offset + 15, $prod_qty_by_day, value);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(float value) {
		setConstNumber(offset + 15, $prod_qty_by_day, value);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(double value) {
		setConstNumber(offset + 15, $prod_qty_by_day, value);
	}


	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon01_prod_qty() {
		return getConstNumber(offset + 16, $mon01_prod_qty);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(MCNumber value) {
		setConstNumber(offset + 16, $mon01_prod_qty, value);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(int value) {
		setConstNumber(offset + 16, $mon01_prod_qty, value);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(long value) {
		setConstNumber(offset + 16, $mon01_prod_qty, value);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(float value) {
		setConstNumber(offset + 16, $mon01_prod_qty, value);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(double value) {
		setConstNumber(offset + 16, $mon01_prod_qty, value);
	}


	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon02_prod_qty() {
		return getConstNumber(offset + 17, $mon02_prod_qty);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(MCNumber value) {
		setConstNumber(offset + 17, $mon02_prod_qty, value);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(int value) {
		setConstNumber(offset + 17, $mon02_prod_qty, value);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(long value) {
		setConstNumber(offset + 17, $mon02_prod_qty, value);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(float value) {
		setConstNumber(offset + 17, $mon02_prod_qty, value);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(double value) {
		setConstNumber(offset + 17, $mon02_prod_qty, value);
	}


	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon03_prod_qty() {
		return getConstNumber(offset + 18, $mon03_prod_qty);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(MCNumber value) {
		setConstNumber(offset + 18, $mon03_prod_qty, value);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(int value) {
		setConstNumber(offset + 18, $mon03_prod_qty, value);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(long value) {
		setConstNumber(offset + 18, $mon03_prod_qty, value);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(float value) {
		setConstNumber(offset + 18, $mon03_prod_qty, value);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(double value) {
		setConstNumber(offset + 18, $mon03_prod_qty, value);
	}


	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon04_prod_qty() {
		return getConstNumber(offset + 19, $mon04_prod_qty);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(MCNumber value) {
		setConstNumber(offset + 19, $mon04_prod_qty, value);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(int value) {
		setConstNumber(offset + 19, $mon04_prod_qty, value);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(long value) {
		setConstNumber(offset + 19, $mon04_prod_qty, value);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(float value) {
		setConstNumber(offset + 19, $mon04_prod_qty, value);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(double value) {
		setConstNumber(offset + 19, $mon04_prod_qty, value);
	}


	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon05_prod_qty() {
		return getConstNumber(offset + 20, $mon05_prod_qty);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(MCNumber value) {
		setConstNumber(offset + 20, $mon05_prod_qty, value);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(int value) {
		setConstNumber(offset + 20, $mon05_prod_qty, value);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(long value) {
		setConstNumber(offset + 20, $mon05_prod_qty, value);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(float value) {
		setConstNumber(offset + 20, $mon05_prod_qty, value);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(double value) {
		setConstNumber(offset + 20, $mon05_prod_qty, value);
	}


	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon06_prod_qty() {
		return getConstNumber(offset + 21, $mon06_prod_qty);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(MCNumber value) {
		setConstNumber(offset + 21, $mon06_prod_qty, value);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(int value) {
		setConstNumber(offset + 21, $mon06_prod_qty, value);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(long value) {
		setConstNumber(offset + 21, $mon06_prod_qty, value);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(float value) {
		setConstNumber(offset + 21, $mon06_prod_qty, value);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(double value) {
		setConstNumber(offset + 21, $mon06_prod_qty, value);
	}


	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon07_prod_qty() {
		return getConstNumber(offset + 22, $mon07_prod_qty);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(MCNumber value) {
		setConstNumber(offset + 22, $mon07_prod_qty, value);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(int value) {
		setConstNumber(offset + 22, $mon07_prod_qty, value);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(long value) {
		setConstNumber(offset + 22, $mon07_prod_qty, value);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(float value) {
		setConstNumber(offset + 22, $mon07_prod_qty, value);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(double value) {
		setConstNumber(offset + 22, $mon07_prod_qty, value);
	}


	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon08_prod_qty() {
		return getConstNumber(offset + 23, $mon08_prod_qty);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(MCNumber value) {
		setConstNumber(offset + 23, $mon08_prod_qty, value);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(int value) {
		setConstNumber(offset + 23, $mon08_prod_qty, value);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(long value) {
		setConstNumber(offset + 23, $mon08_prod_qty, value);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(float value) {
		setConstNumber(offset + 23, $mon08_prod_qty, value);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(double value) {
		setConstNumber(offset + 23, $mon08_prod_qty, value);
	}


	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon09_prod_qty() {
		return getConstNumber(offset + 24, $mon09_prod_qty);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(MCNumber value) {
		setConstNumber(offset + 24, $mon09_prod_qty, value);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(int value) {
		setConstNumber(offset + 24, $mon09_prod_qty, value);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(long value) {
		setConstNumber(offset + 24, $mon09_prod_qty, value);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(float value) {
		setConstNumber(offset + 24, $mon09_prod_qty, value);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(double value) {
		setConstNumber(offset + 24, $mon09_prod_qty, value);
	}


	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon10_prod_qty() {
		return getConstNumber(offset + 25, $mon10_prod_qty);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(MCNumber value) {
		setConstNumber(offset + 25, $mon10_prod_qty, value);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(int value) {
		setConstNumber(offset + 25, $mon10_prod_qty, value);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(long value) {
		setConstNumber(offset + 25, $mon10_prod_qty, value);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(float value) {
		setConstNumber(offset + 25, $mon10_prod_qty, value);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(double value) {
		setConstNumber(offset + 25, $mon10_prod_qty, value);
	}


	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon11_prod_qty() {
		return getConstNumber(offset + 26, $mon11_prod_qty);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(MCNumber value) {
		setConstNumber(offset + 26, $mon11_prod_qty, value);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(int value) {
		setConstNumber(offset + 26, $mon11_prod_qty, value);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(long value) {
		setConstNumber(offset + 26, $mon11_prod_qty, value);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(float value) {
		setConstNumber(offset + 26, $mon11_prod_qty, value);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(double value) {
		setConstNumber(offset + 26, $mon11_prod_qty, value);
	}


	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon12_prod_qty() {
		return getConstNumber(offset + 27, $mon12_prod_qty);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(MCNumber value) {
		setConstNumber(offset + 27, $mon12_prod_qty, value);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(int value) {
		setConstNumber(offset + 27, $mon12_prod_qty, value);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(long value) {
		setConstNumber(offset + 27, $mon12_prod_qty, value);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(float value) {
		setConstNumber(offset + 27, $mon12_prod_qty, value);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(double value) {
		setConstNumber(offset + 27, $mon12_prod_qty, value);
	}


	/**
	 * Proportion ratio 案分比率.<p>
	 *
	 */
	public MCNumber prod_rate() {
		return getConstNumber(offset + 28, $prod_rate);
	}

	/**
	 * Proportion ratio 案分比率.<p>
	 *
	 */
	public void prod_rate(MCNumber value) {
		setConstNumber(offset + 28, $prod_rate, value);
	}

	/**
	 * Proportion ratio 案分比率.<p>
	 *
	 */
	public void prod_rate(int value) {
		setConstNumber(offset + 28, $prod_rate, value);
	}

	/**
	 * Proportion ratio 案分比率.<p>
	 *
	 */
	public void prod_rate(long value) {
		setConstNumber(offset + 28, $prod_rate, value);
	}

	/**
	 * Proportion ratio 案分比率.<p>
	 *
	 */
	public void prod_rate(float value) {
		setConstNumber(offset + 28, $prod_rate, value);
	}

	/**
	 * Proportion ratio 案分比率.<p>
	 *
	 */
	public void prod_rate(double value) {
		setConstNumber(offset + 28, $prod_rate, value);
	}


	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 29, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 29, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 29, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 29, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 29, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 29, $prio, value);
	}


	/**
	 * Production stat date 生産開始日.<p>
	 *
	 */
	public MCNumber prod_begin_day() {
		return getConstNumber(offset + 30, $prod_begin_day);
	}

	/**
	 * Production stat date 生産開始日.<p>
	 *
	 */
	public void prod_begin_day(MCNumber value) {
		setConstNumber(offset + 30, $prod_begin_day, value);
	}

	/**
	 * Production stat date 生産開始日.<p>
	 *
	 */
	public void prod_begin_day(int value) {
		setConstNumber(offset + 30, $prod_begin_day, value);
	}

	/**
	 * Production stat date 生産開始日.<p>
	 *
	 */
	public void prod_begin_day(long value) {
		setConstNumber(offset + 30, $prod_begin_day, value);
	}

	/**
	 * Production stat date 生産開始日.<p>
	 *
	 */
	public void prod_begin_day(float value) {
		setConstNumber(offset + 30, $prod_begin_day, value);
	}

	/**
	 * Production stat date 生産開始日.<p>
	 *
	 */
	public void prod_begin_day(double value) {
		setConstNumber(offset + 30, $prod_begin_day, value);
	}


	/**
	 * Creation start date 作成開始年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 31, $ym);
	}

	/**
	 * Creation start date 作成開始年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 31, $ym, value);
	}


	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public MCNumber date_div_mons() {
		return getConstNumber(offset + 32, $date_div_mons);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(MCNumber value) {
		setConstNumber(offset + 32, $date_div_mons, value);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(int value) {
		setConstNumber(offset + 32, $date_div_mons, value);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(long value) {
		setConstNumber(offset + 32, $date_div_mons, value);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(float value) {
		setConstNumber(offset + 32, $date_div_mons, value);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(double value) {
		setConstNumber(offset + 32, $date_div_mons, value);
	}


	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public MCNumber week_div_mons() {
		return getConstNumber(offset + 33, $week_div_mons);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(MCNumber value) {
		setConstNumber(offset + 33, $week_div_mons, value);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(int value) {
		setConstNumber(offset + 33, $week_div_mons, value);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(long value) {
		setConstNumber(offset + 33, $week_div_mons, value);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(float value) {
		setConstNumber(offset + 33, $week_div_mons, value);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(double value) {
		setConstNumber(offset + 33, $week_div_mons, value);
	}


	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public MCNumber period_div_mons() {
		return getConstNumber(offset + 34, $period_div_mons);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(MCNumber value) {
		setConstNumber(offset + 34, $period_div_mons, value);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(int value) {
		setConstNumber(offset + 34, $period_div_mons, value);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(long value) {
		setConstNumber(offset + 34, $period_div_mons, value);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(float value) {
		setConstNumber(offset + 34, $period_div_mons, value);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(double value) {
		setConstNumber(offset + 34, $period_div_mons, value);
	}


	/**
	 * Production request created months 生産依頼作成月数.<p>
	 *
	 */
	public MCNumber rqmt_mons() {
		return getConstNumber(offset + 35, $rqmt_mons);
	}

	/**
	 * Production request created months 生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(MCNumber value) {
		setConstNumber(offset + 35, $rqmt_mons, value);
	}

	/**
	 * Production request created months 生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(int value) {
		setConstNumber(offset + 35, $rqmt_mons, value);
	}

	/**
	 * Production request created months 生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(long value) {
		setConstNumber(offset + 35, $rqmt_mons, value);
	}

	/**
	 * Production request created months 生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(float value) {
		setConstNumber(offset + 35, $rqmt_mons, value);
	}

	/**
	 * Production request created months 生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(double value) {
		setConstNumber(offset + 35, $rqmt_mons, value);
	}


	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public MCNumber prcd_mons() {
		return getConstNumber(offset + 36, $prcd_mons);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(MCNumber value) {
		setConstNumber(offset + 36, $prcd_mons, value);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(int value) {
		setConstNumber(offset + 36, $prcd_mons, value);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(long value) {
		setConstNumber(offset + 36, $prcd_mons, value);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(float value) {
		setConstNumber(offset + 36, $prcd_mons, value);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(double value) {
		setConstNumber(offset + 36, $prcd_mons, value);
	}


	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public String rqmt_typ() {
		return getConstString(offset + 37, $rqmt_typ);
	}

	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public void rqmt_typ(String value) {
		setConstString(offset + 37, $rqmt_typ, value);
	}


	/**
	 * Mfg. location supplier cd. 製造場所発注先ＣＤ.<p>
	 *
	 */
	public String mfg_loc_sppl_cd() {
		return getConstString(offset + 38, $mfg_loc_sppl_cd);
	}

	/**
	 * Mfg. location supplier cd. 製造場所発注先ＣＤ.<p>
	 *
	 */
	public void mfg_loc_sppl_cd(String value) {
		setConstString(offset + 38, $mfg_loc_sppl_cd, value);
	}


	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public String prod_pln_typ() {
		return getConstString(offset + 39, $prod_pln_typ);
	}

	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public void prod_pln_typ(String value) {
		setConstString(offset + 39, $prod_pln_typ, value);
	}


	/**
	 * Disaggregation by day type 日ばらし区分.<p>
	 *
	 */
	public String date_div_typ() {
		return getConstString(offset + 40, $date_div_typ);
	}

	/**
	 * Disaggregation by day type 日ばらし区分.<p>
	 *
	 */
	public void date_div_typ(String value) {
		setConstString(offset + 40, $date_div_typ, value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($strg_loc_cal_cd.equalsIgnoreCase(name)) {
			return strg_loc_cal_cd();
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_loc_sppl_cd();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			return date_div_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			return prod_qty_by_day();
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			return mon01_prod_qty();
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			return mon02_prod_qty();
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			return mon03_prod_qty();
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			return mon04_prod_qty();
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			return mon05_prod_qty();
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			return mon06_prod_qty();
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			return mon07_prod_qty();
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			return mon08_prod_qty();
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			return mon09_prod_qty();
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			return mon10_prod_qty();
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			return mon11_prod_qty();
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			return mon12_prod_qty();
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			return prod_rate();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			return prod_begin_day();
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			return date_div_mons();
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			return week_div_mons();
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			return period_div_mons();
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			return rqmt_mons();
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			return prcd_mons();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pln_ym.equalsIgnoreCase(name)) {
			return pln_ym();
		}
		if ($prod_ym.equalsIgnoreCase(name)) {
			return prod_ym();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($strg_loc_cal_cd.equalsIgnoreCase(name)) {
			return strg_loc_cal_cd();
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_loc_sppl_cd();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			return date_div_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			return prod_qty_by_day();
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			return mon01_prod_qty();
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			return mon02_prod_qty();
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			return mon03_prod_qty();
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			return mon04_prod_qty();
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			return mon05_prod_qty();
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			return mon06_prod_qty();
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			return mon07_prod_qty();
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			return mon08_prod_qty();
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			return mon09_prod_qty();
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			return mon10_prod_qty();
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			return mon11_prod_qty();
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			return mon12_prod_qty();
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			return prod_rate();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			return prod_begin_day();
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			return date_div_mons();
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			return week_div_mons();
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			return period_div_mons();
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			return rqmt_mons();
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			return prcd_mons();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pln_ym.equalsIgnoreCase(name)) {
			return pln_ym();
		}
		if ($prod_ym.equalsIgnoreCase(name)) {
			return prod_ym();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($strg_loc_cal_cd.equalsIgnoreCase(name)) {
			strg_loc_cal_cd(value);
			return;
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			mfg_loc_sppl_cd(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			date_div_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pln_ym.equalsIgnoreCase(name)) {
			pln_ym(value);
			return;
		}
		if ($prod_ym.equalsIgnoreCase(name)) {
			prod_ym(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($strg_loc_cal_cd.equalsIgnoreCase(name)) {
			strg_loc_cal_cd(value);
			return;
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			mfg_loc_sppl_cd(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			date_div_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prod_begin_day.equalsIgnoreCase(name)) {
			prod_begin_day(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pln_ym.equalsIgnoreCase(name)) {
			pln_ym(value);
			return;
		}
		if ($prod_ym.equalsIgnoreCase(name)) {
			prod_ym(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

