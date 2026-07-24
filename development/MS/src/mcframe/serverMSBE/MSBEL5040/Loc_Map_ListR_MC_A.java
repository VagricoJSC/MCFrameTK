package mcframe.serverMSBE.MSBEL5040;

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
 * ブロック"Loc_Map_List"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Loc_Map_ListR_MC_A extends MCConstRow {

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
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	/**
	 * Input supplier cd. 投入発注先ＣＤ.<p>
	 *
	 */
	public static final String $inpt_sppl_cd = "inpt_sppl_cd";
	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gr_sppl_cd = "gr_sppl_cd";
	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public static final String $stk_loc_cd = "stk_loc_cd";
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public static final String $alloc_days = "alloc_days";
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public static final String $prio2 = "prio2";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $fr_lg_grp_cd = "fr_lg_grp_cd";
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public static final String $to_lg_grp_cd = "to_lg_grp_cd";
	/**
	 * Shipping point controlling site type 出荷元管轄区分.<p>
	 *
	 */
	public static final String $fr_loc_mng_typ = "fr_loc_mng_typ";
	/**
	 * Receiving point controlling site type 出荷先管轄区分.<p>
	 *
	 */
	public static final String $to_loc_mng_typ = "to_loc_mng_typ";
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $fr_site_cd = "fr_site_cd";
	/**
	 * Receiving point factory/distribution warehouse cd. 出荷先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public static final String $tmp_prio = "tmp_prio";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_sppl_cd_META = createCommonMeta($inpt_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_sppl_cd_META = createCommonMeta($gr_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_loc_cd_META = createCommonMeta($stk_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta alloc_days_META = createCommonMeta($alloc_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta prio2_META = createCommonMeta($prio2, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta fr_lg_grp_cd_META = createCommonMeta($fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta to_lg_grp_cd_META = createCommonMeta($to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta fr_loc_mng_typ_META = createCommonMeta($fr_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta to_loc_mng_typ_META = createCommonMeta($to_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta fr_site_cd_META = createCommonMeta($fr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta tmp_prio_META = createCommonMeta($tmp_prio, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);

	protected static final ConstMetaList<Loc_Map_ListR> constMetas = new ConstMetaList<Loc_Map_ListR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ship_term_cd_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			inpt_sppl_cd_META,
			dlv_lg_grp_cd_META,
			alloc_grp_cd_META,
			gi_lg_grp_cd_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_stk_arrv_bp_cd_META,
			gr_loc_cd_META,
			gr_str_ln_cd_META,
			gr_sppl_cd_META,
			stk_loc_cd_META,
			xfr_lt_META,
			alloc_days_META,
			prio_META,
			prio2_META,
			fr_lg_grp_cd_META,
			to_lg_grp_cd_META,
			fr_loc_mng_typ_META,
			to_loc_mng_typ_META,
			fr_site_cd_META,
			to_site_cd_META,
			tmp_prio_META,
			alloc_scope_typ_META
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
	protected Loc_Map_ListR_MC_A(ConstMetaList<? extends Loc_Map_ListR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Loc_Map_ListR clone() {
		return (Loc_Map_ListR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Loc_Map_ListR createInstance() {
		return (Loc_Map_ListR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Loc_Map_ListR getValues(String... names) {
		return (Loc_Map_ListR) super.getValues(names);
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
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 4, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 4, $ship_term_cd, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 5, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 5, $inpt_loc_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 6, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 6, $inpt_str_ln_cd, value);
	}


	/**
	 * Input supplier cd. 投入発注先ＣＤ.<p>
	 *
	 */
	public String inpt_sppl_cd() {
		return getConstString(offset + 7, $inpt_sppl_cd);
	}

	/**
	 * Input supplier cd. 投入発注先ＣＤ.<p>
	 *
	 */
	public void inpt_sppl_cd(String value) {
		setConstString(offset + 7, $inpt_sppl_cd, value);
	}


	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 8, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 8, $dlv_lg_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 9, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 9, $alloc_grp_cd, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 10, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 10, $gi_lg_grp_cd, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 11, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 11, $gi_loc_cd, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 12, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 12, $gi_str_ln_cd, value);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 13, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 13, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 14, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 14, $gr_loc_cd, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 15, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 15, $gr_str_ln_cd, value);
	}


	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public String gr_sppl_cd() {
		return getConstString(offset + 16, $gr_sppl_cd);
	}

	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public void gr_sppl_cd(String value) {
		setConstString(offset + 16, $gr_sppl_cd, value);
	}


	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public String stk_loc_cd() {
		return getConstString(offset + 17, $stk_loc_cd);
	}

	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		setConstString(offset + 17, $stk_loc_cd, value);
	}


	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 18, $xfr_lt);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}


	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public MCNumber alloc_days() {
		return getConstNumber(offset + 19, $alloc_days);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(MCNumber value) {
		setConstNumber(offset + 19, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(int value) {
		setConstNumber(offset + 19, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(long value) {
		setConstNumber(offset + 19, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(float value) {
		setConstNumber(offset + 19, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(double value) {
		setConstNumber(offset + 19, $alloc_days, value);
	}


	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 20, $prio);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 20, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 20, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 20, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 20, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 20, $prio, value);
	}


	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public MCNumber prio2() {
		return getConstNumber(offset + 21, $prio2);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(MCNumber value) {
		setConstNumber(offset + 21, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(int value) {
		setConstNumber(offset + 21, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(long value) {
		setConstNumber(offset + 21, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(float value) {
		setConstNumber(offset + 21, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(double value) {
		setConstNumber(offset + 21, $prio2, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String fr_lg_grp_cd() {
		return getConstString(offset + 22, $fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void fr_lg_grp_cd(String value) {
		setConstString(offset + 22, $fr_lg_grp_cd, value);
	}


	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String to_lg_grp_cd() {
		return getConstString(offset + 23, $to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void to_lg_grp_cd(String value) {
		setConstString(offset + 23, $to_lg_grp_cd, value);
	}


	/**
	 * Shipping point controlling site type 出荷元管轄区分.<p>
	 *
	 */
	public String fr_loc_mng_typ() {
		return getConstString(offset + 24, $fr_loc_mng_typ);
	}

	/**
	 * Shipping point controlling site type 出荷元管轄区分.<p>
	 *
	 */
	public void fr_loc_mng_typ(String value) {
		setConstString(offset + 24, $fr_loc_mng_typ, value);
	}


	/**
	 * Receiving point controlling site type 出荷先管轄区分.<p>
	 *
	 */
	public String to_loc_mng_typ() {
		return getConstString(offset + 25, $to_loc_mng_typ);
	}

	/**
	 * Receiving point controlling site type 出荷先管轄区分.<p>
	 *
	 */
	public void to_loc_mng_typ(String value) {
		setConstString(offset + 25, $to_loc_mng_typ, value);
	}


	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String fr_site_cd() {
		return getConstString(offset + 26, $fr_site_cd);
	}

	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void fr_site_cd(String value) {
		setConstString(offset + 26, $fr_site_cd, value);
	}


	/**
	 * Receiving point factory/distribution warehouse cd. 出荷先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 27, $to_site_cd);
	}

	/**
	 * Receiving point factory/distribution warehouse cd. 出荷先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 27, $to_site_cd, value);
	}


	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public MCNumber tmp_prio() {
		return getConstNumber(offset + 28, $tmp_prio);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(MCNumber value) {
		setConstNumber(offset + 28, $tmp_prio, value);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(int value) {
		setConstNumber(offset + 28, $tmp_prio, value);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(long value) {
		setConstNumber(offset + 28, $tmp_prio, value);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(float value) {
		setConstNumber(offset + 28, $tmp_prio, value);
	}

	/**
	 * Allocation priority (Temporary) 引当優先順（一時）.<p>
	 *
	 */
	public void tmp_prio(double value) {
		setConstNumber(offset + 28, $tmp_prio, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 29, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 29, $alloc_scope_typ, value);
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_sppl_cd();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($fr_loc_mng_typ.equalsIgnoreCase(name)) {
			return fr_loc_mng_typ();
		}
		if ($to_loc_mng_typ.equalsIgnoreCase(name)) {
			return to_loc_mng_typ();
		}
		if ($fr_site_cd.equalsIgnoreCase(name)) {
			return fr_site_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($prio2.equalsIgnoreCase(name)) {
			return prio2();
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			return tmp_prio();
		}
		return super.getNumber(name);
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_sppl_cd();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($fr_loc_mng_typ.equalsIgnoreCase(name)) {
			return fr_loc_mng_typ();
		}
		if ($to_loc_mng_typ.equalsIgnoreCase(name)) {
			return to_loc_mng_typ();
		}
		if ($fr_site_cd.equalsIgnoreCase(name)) {
			return fr_site_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($prio2.equalsIgnoreCase(name)) {
			return prio2();
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			return tmp_prio();
		}
		return super.getNumberNE(name);
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			inpt_sppl_cd(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($fr_loc_mng_typ.equalsIgnoreCase(name)) {
			fr_loc_mng_typ(value);
			return;
		}
		if ($to_loc_mng_typ.equalsIgnoreCase(name)) {
			to_loc_mng_typ(value);
			return;
		}
		if ($fr_site_cd.equalsIgnoreCase(name)) {
			fr_site_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			inpt_sppl_cd(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($fr_loc_mng_typ.equalsIgnoreCase(name)) {
			fr_loc_mng_typ(value);
			return;
		}
		if ($to_loc_mng_typ.equalsIgnoreCase(name)) {
			to_loc_mng_typ(value);
			return;
		}
		if ($fr_site_cd.equalsIgnoreCase(name)) {
			fr_site_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($tmp_prio.equalsIgnoreCase(name)) {
			tmp_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

