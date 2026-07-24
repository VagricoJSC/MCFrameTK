package mcframe.clientMGBG.MGBGP0150;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * TERM,View term ratio,0;PLN,View monthly ratio (Plan),1;ACT,View monthly ratio (Result),2;PA,View monthly ratio (Plan/Result),3; TERM,期間比率を参照する,0;PLN,月次比率（計画）を参照する,1;ACT,月次比率（実績）を参照する,2;PA,月次比率（計画実績）を参照する,3;.<p>
	 *
	 */
	public static final String $typ = "typ";
	public static final String $term_p = "term_p";
	/**
	 * Period calculation category cd. 期間計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Period calculation category name 期間計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $pln_calc_ctg_cd = "pln_calc_ctg_cd";
	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public static final String $pln_calc_ctg_nm = "pln_calc_ctg_nm";
	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $act_calc_ctg_cd = "act_calc_ctg_cd";
	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public static final String $act_calc_ctg_nm = "act_calc_ctg_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public static final String $pre_alc_rate_cd = "pre_alc_rate_cd";
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public static final String $pre_alc_rate_nm = "pre_alc_rate_nm";
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $pre_alc_ptn_cd = "pre_alc_ptn_cd";
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public static final String $pre_alc_ptn_nm = "pre_alc_ptn_nm";
	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public static final String $dpt_alc_typ = "dpt_alc_typ";
	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public static final String $loc_alc_typ = "loc_alc_typ";
	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public static final String $oper_alc_typ = "oper_alc_typ";
	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public static final String $bp_alc_typ = "bp_alc_typ";
	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public static final String $ctg_alc_typ = "ctg_alc_typ";
	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public static final String $itm_alc_typ = "itm_alc_typ";
	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public static final String $lot_alc_typ = "lot_alc_typ";
	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public static final String $sublot_alc_typ = "sublot_alc_typ";
	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public static final String $sno1_alc_typ = "sno1_alc_typ";
	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public static final String $sno2_alc_typ = "sno2_alc_typ";
	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public static final String $sno3_alc_typ = "sno3_alc_typ";
	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public static final String $sno4_alc_typ = "sno4_alc_typ";
	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public static final String $inst_alc_typ = "inst_alc_typ";
	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public static final String $iv_alc_typ = "iv_alc_typ";
	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public static final String $po_alc_typ = "po_alc_typ";
	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public static final String $slo_alc_typ = "slo_alc_typ";
	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public static final String $alc_ac_alc_typ = "alc_ac_alc_typ";
	/**
	 * Calculation category allocation type 計算カテゴリ配賦区分.<p>
	 *
	 */
	public static final String $wg_alc_typ = "wg_alc_typ";

	public static final String $term_fr = $term_p + ".term_fr";
	public static final String $term_to = $term_p + ".term_to";

	public static final MCMeta typ_META = createStringMeta($typ);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0240.TermR.class);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pln_calc_ctg_cd_META = createCommonMeta($pln_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta pln_calc_ctg_nm_META = createCommonMeta($pln_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta act_calc_ctg_cd_META = createCommonMeta($act_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta act_calc_ctg_nm_META = createCommonMeta($act_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta pre_alc_rate_cd_META = createCommonMeta($pre_alc_rate_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_CD);
	public static final MCMeta pre_alc_rate_nm_META = createCommonMeta($pre_alc_rate_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_NM);
	public static final MCMeta pre_alc_ptn_cd_META = createCommonMeta($pre_alc_ptn_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_CD);
	public static final MCMeta pre_alc_ptn_nm_META = createCommonMeta($pre_alc_ptn_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_NM);
	public static final MCMeta dpt_alc_typ_META = createCommonMeta($dpt_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta loc_alc_typ_META = createCommonMeta($loc_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta oper_alc_typ_META = createCommonMeta($oper_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta bp_alc_typ_META = createCommonMeta($bp_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta ctg_alc_typ_META = createCommonMeta($ctg_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta itm_alc_typ_META = createCommonMeta($itm_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta lot_alc_typ_META = createCommonMeta($lot_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sublot_alc_typ_META = createCommonMeta($sublot_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno1_alc_typ_META = createCommonMeta($sno1_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno2_alc_typ_META = createCommonMeta($sno2_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno3_alc_typ_META = createCommonMeta($sno3_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno4_alc_typ_META = createCommonMeta($sno4_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta inst_alc_typ_META = createCommonMeta($inst_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta iv_alc_typ_META = createCommonMeta($iv_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta po_alc_typ_META = createCommonMeta($po_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta slo_alc_typ_META = createCommonMeta($slo_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta alc_ac_alc_typ_META = createCommonMeta($alc_ac_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta wg_alc_typ_META = createCommonMeta($wg_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			typ_META,
			term_p_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			ym_fr_META,
			ym_to_META,
			pln_calc_ctg_cd_META,
			pln_calc_ctg_nm_META,
			act_calc_ctg_cd_META,
			act_calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			pre_alc_rate_cd_META,
			pre_alc_rate_nm_META,
			pre_alc_ptn_cd_META,
			pre_alc_ptn_nm_META,
			dpt_alc_typ_META,
			loc_alc_typ_META,
			oper_alc_typ_META,
			bp_alc_typ_META,
			ctg_alc_typ_META,
			itm_alc_typ_META,
			lot_alc_typ_META,
			sublot_alc_typ_META,
			sno1_alc_typ_META,
			sno2_alc_typ_META,
			sno3_alc_typ_META,
			sno4_alc_typ_META,
			inst_alc_typ_META,
			iv_alc_typ_META,
			po_alc_typ_META,
			slo_alc_typ_META,
			alc_ac_alc_typ_META,
			wg_alc_typ_META
		},
		new String[][]{
			{
				"term_fr",
				"term_to"
			},
			{
				$term_fr,
				$term_to
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$wg_alc_typ, "WG"}	// wg_alc_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "rd_flg"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$pln_calc_ctg_cd, "calc_ctg_nm"},	// pln_calc_ctg_cd
				{$act_calc_ctg_cd, "calc_ctg_nm"}	// act_calc_ctg_cd
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * TERM,View term ratio,0;PLN,View monthly ratio (Plan),1;ACT,View monthly ratio (Result),2;PA,View monthly ratio (Plan/Result),3; TERM,期間比率を参照する,0;PLN,月次比率（計画）を参照する,1;ACT,月次比率（実績）を参照する,2;PA,月次比率（計画実績）を参照する,3;.<p>
	 *
	 */
	public String typ() {
		return getConstString(offset + 0, $typ);
	}

	/**
	 * TERM,View term ratio,0;PLN,View monthly ratio (Plan),1;ACT,View monthly ratio (Result),2;PA,View monthly ratio (Plan/Result),3; TERM,期間比率を参照する,0;PLN,月次比率（計画）を参照する,1;ACT,月次比率（実績）を参照する,2;PA,月次比率（計画実績）を参照する,3;.<p>
	 *
	 */
	public void typ(String value) {
		setConstString(offset + 0, $typ, value);
	}


	public mcframe.clientMAUB.MAUBP0240.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0240.TermR) getConstInnerRow(offset + 1, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0240.TermR row){
		setConstInnerRow(offset + 1, $term_p, row);
	}


	/**
	 * Period calculation category cd. 期間計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 2, $calc_ctg_cd);
	}

	/**
	 * Period calculation category cd. 期間計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 2, $calc_ctg_cd, value);
	}


	/**
	 * Period calculation category name 期間計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 3, $calc_ctg_nm);
	}

	/**
	 * Period calculation category name 期間計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 3, $calc_ctg_nm, value);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 4, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 4, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 5, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 5, $ym_to, value);
	}


	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public String pln_calc_ctg_cd() {
		return getConstString(offset + 6, $pln_calc_ctg_cd);
	}

	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public void pln_calc_ctg_cd(String value) {
		setConstString(offset + 6, $pln_calc_ctg_cd, value);
	}


	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public String pln_calc_ctg_nm() {
		return getConstString(offset + 7, $pln_calc_ctg_nm);
	}

	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public void pln_calc_ctg_nm(String value) {
		setConstString(offset + 7, $pln_calc_ctg_nm, value);
	}


	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public String act_calc_ctg_cd() {
		return getConstString(offset + 8, $act_calc_ctg_cd);
	}

	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public void act_calc_ctg_cd(String value) {
		setConstString(offset + 8, $act_calc_ctg_cd, value);
	}


	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public String act_calc_ctg_nm() {
		return getConstString(offset + 9, $act_calc_ctg_nm);
	}

	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public void act_calc_ctg_nm(String value) {
		setConstString(offset + 9, $act_calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 10, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 10, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 11, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 11, $wg_nm, value);
	}


	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return getConstString(offset + 12, $pre_alc_rate_cd);
	}

	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		setConstString(offset + 12, $pre_alc_rate_cd, value);
	}


	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public String pre_alc_rate_nm() {
		return getConstString(offset + 13, $pre_alc_rate_nm);
	}

	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public void pre_alc_rate_nm(String value) {
		setConstString(offset + 13, $pre_alc_rate_nm, value);
	}


	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public String pre_alc_ptn_cd() {
		return getConstString(offset + 14, $pre_alc_ptn_cd);
	}

	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public void pre_alc_ptn_cd(String value) {
		setConstString(offset + 14, $pre_alc_ptn_cd, value);
	}


	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public String pre_alc_ptn_nm() {
		return getConstString(offset + 15, $pre_alc_ptn_nm);
	}

	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public void pre_alc_ptn_nm(String value) {
		setConstString(offset + 15, $pre_alc_ptn_nm, value);
	}


	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public String dpt_alc_typ() {
		return getConstString(offset + 16, $dpt_alc_typ);
	}

	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public void dpt_alc_typ(String value) {
		setConstString(offset + 16, $dpt_alc_typ, value);
	}


	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public String loc_alc_typ() {
		return getConstString(offset + 17, $loc_alc_typ);
	}

	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public void loc_alc_typ(String value) {
		setConstString(offset + 17, $loc_alc_typ, value);
	}


	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public String oper_alc_typ() {
		return getConstString(offset + 18, $oper_alc_typ);
	}

	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public void oper_alc_typ(String value) {
		setConstString(offset + 18, $oper_alc_typ, value);
	}


	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public String bp_alc_typ() {
		return getConstString(offset + 19, $bp_alc_typ);
	}

	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public void bp_alc_typ(String value) {
		setConstString(offset + 19, $bp_alc_typ, value);
	}


	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public String ctg_alc_typ() {
		return getConstString(offset + 20, $ctg_alc_typ);
	}

	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public void ctg_alc_typ(String value) {
		setConstString(offset + 20, $ctg_alc_typ, value);
	}


	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public String itm_alc_typ() {
		return getConstString(offset + 21, $itm_alc_typ);
	}

	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public void itm_alc_typ(String value) {
		setConstString(offset + 21, $itm_alc_typ, value);
	}


	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public String lot_alc_typ() {
		return getConstString(offset + 22, $lot_alc_typ);
	}

	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public void lot_alc_typ(String value) {
		setConstString(offset + 22, $lot_alc_typ, value);
	}


	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public String sublot_alc_typ() {
		return getConstString(offset + 23, $sublot_alc_typ);
	}

	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public void sublot_alc_typ(String value) {
		setConstString(offset + 23, $sublot_alc_typ, value);
	}


	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public String sno1_alc_typ() {
		return getConstString(offset + 24, $sno1_alc_typ);
	}

	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public void sno1_alc_typ(String value) {
		setConstString(offset + 24, $sno1_alc_typ, value);
	}


	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public String sno2_alc_typ() {
		return getConstString(offset + 25, $sno2_alc_typ);
	}

	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public void sno2_alc_typ(String value) {
		setConstString(offset + 25, $sno2_alc_typ, value);
	}


	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public String sno3_alc_typ() {
		return getConstString(offset + 26, $sno3_alc_typ);
	}

	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public void sno3_alc_typ(String value) {
		setConstString(offset + 26, $sno3_alc_typ, value);
	}


	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public String sno4_alc_typ() {
		return getConstString(offset + 27, $sno4_alc_typ);
	}

	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public void sno4_alc_typ(String value) {
		setConstString(offset + 27, $sno4_alc_typ, value);
	}


	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public String inst_alc_typ() {
		return getConstString(offset + 28, $inst_alc_typ);
	}

	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public void inst_alc_typ(String value) {
		setConstString(offset + 28, $inst_alc_typ, value);
	}


	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public String iv_alc_typ() {
		return getConstString(offset + 29, $iv_alc_typ);
	}

	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public void iv_alc_typ(String value) {
		setConstString(offset + 29, $iv_alc_typ, value);
	}


	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public String po_alc_typ() {
		return getConstString(offset + 30, $po_alc_typ);
	}

	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public void po_alc_typ(String value) {
		setConstString(offset + 30, $po_alc_typ, value);
	}


	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public String slo_alc_typ() {
		return getConstString(offset + 31, $slo_alc_typ);
	}

	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public void slo_alc_typ(String value) {
		setConstString(offset + 31, $slo_alc_typ, value);
	}


	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public String alc_ac_alc_typ() {
		return getConstString(offset + 32, $alc_ac_alc_typ);
	}

	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public void alc_ac_alc_typ(String value) {
		setConstString(offset + 32, $alc_ac_alc_typ, value);
	}


	/**
	 * Calculation category allocation type 計算カテゴリ配賦区分.<p>
	 *
	 */
	public String wg_alc_typ() {
		return getConstString(offset + 33, $wg_alc_typ);
	}

	/**
	 * Calculation category allocation type 計算カテゴリ配賦区分.<p>
	 *
	 */
	public void wg_alc_typ(String value) {
		setConstString(offset + 33, $wg_alc_typ, value);
	}


	public String getString(String name) {
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			return pln_calc_ctg_cd();
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			return pln_calc_ctg_nm();
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			return dpt_alc_typ();
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			return loc_alc_typ();
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			return oper_alc_typ();
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			return bp_alc_typ();
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			return ctg_alc_typ();
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			return itm_alc_typ();
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			return lot_alc_typ();
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			return sublot_alc_typ();
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			return sno1_alc_typ();
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			return sno2_alc_typ();
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			return sno3_alc_typ();
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			return sno4_alc_typ();
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			return inst_alc_typ();
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			return iv_alc_typ();
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			return po_alc_typ();
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			return slo_alc_typ();
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ();
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			return wg_alc_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			return pln_calc_ctg_cd();
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			return pln_calc_ctg_nm();
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			return dpt_alc_typ();
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			return loc_alc_typ();
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			return oper_alc_typ();
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			return bp_alc_typ();
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			return ctg_alc_typ();
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			return itm_alc_typ();
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			return lot_alc_typ();
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			return sublot_alc_typ();
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			return sno1_alc_typ();
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			return sno2_alc_typ();
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			return sno3_alc_typ();
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			return sno4_alc_typ();
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			return inst_alc_typ();
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			return iv_alc_typ();
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			return po_alc_typ();
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			return slo_alc_typ();
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ();
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			return wg_alc_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			pln_calc_ctg_cd(value);
			return;
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			pln_calc_ctg_nm(value);
			return;
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_calc_ctg_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
			return;
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			dpt_alc_typ(value);
			return;
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			loc_alc_typ(value);
			return;
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			oper_alc_typ(value);
			return;
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			bp_alc_typ(value);
			return;
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			ctg_alc_typ(value);
			return;
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			itm_alc_typ(value);
			return;
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			lot_alc_typ(value);
			return;
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			sublot_alc_typ(value);
			return;
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			sno1_alc_typ(value);
			return;
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			sno2_alc_typ(value);
			return;
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			sno3_alc_typ(value);
			return;
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			sno4_alc_typ(value);
			return;
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			inst_alc_typ(value);
			return;
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			iv_alc_typ(value);
			return;
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			po_alc_typ(value);
			return;
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			slo_alc_typ(value);
			return;
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			alc_ac_alc_typ(value);
			return;
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			wg_alc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			pln_calc_ctg_cd(value);
			return;
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			pln_calc_ctg_nm(value);
			return;
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_calc_ctg_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
			return;
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			dpt_alc_typ(value);
			return;
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			loc_alc_typ(value);
			return;
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			oper_alc_typ(value);
			return;
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			bp_alc_typ(value);
			return;
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			ctg_alc_typ(value);
			return;
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			itm_alc_typ(value);
			return;
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			lot_alc_typ(value);
			return;
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			sublot_alc_typ(value);
			return;
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			sno1_alc_typ(value);
			return;
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			sno2_alc_typ(value);
			return;
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			sno3_alc_typ(value);
			return;
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			sno4_alc_typ(value);
			return;
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			inst_alc_typ(value);
			return;
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			iv_alc_typ(value);
			return;
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			po_alc_typ(value);
			return;
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			slo_alc_typ(value);
			return;
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			alc_ac_alc_typ(value);
			return;
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			wg_alc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0240.TermR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term_fr() {
		return term_p().term_fr();
	}

	public void term_fr(MCDate value) {
		term_p().term_fr(value);
	}

	public MCDate term_to() {
		return term_p().term_to();
	}

	public void term_to(MCDate value) {
		term_p().term_to(value);
	}

}

