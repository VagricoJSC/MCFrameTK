package mcframe.clientMGBE.MGBEP0060;

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
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public static final String $expns_grp_cd = "expns_grp_cd";
	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public static final String $expns_grp_nm = "expns_grp_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $expnsg_seq = "expnsg_seq";
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $expns_seq = "expns_seq";
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public static final String $alc_ptn_nm = "alc_ptn_nm";
	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public static final String $alc_amt = "alc_amt";
	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public static final String $alc_tgt_val = "alc_tgt_val";
	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public static final String $alc_rate = "alc_rate";
	/**
	 * Allocation coefficient value 配賦係数値.<p>
	 *
	 */
	public static final String $coef_val = "coef_val";
	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public static final String $alc_org_tgt_val = "alc_org_tgt_val";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta expns_grp_cd_META = createCommonMeta($expns_grp_cd, mcframe.commonMA.meta.MA_META.EXPNS_GRP_CD);
	public static final MCMeta expns_grp_nm_META = createCommonMeta($expns_grp_nm, mcframe.commonMA.meta.MA_META.EXPNS_GRP_NM);
	public static final MCMeta expnsg_seq_META = createCommonMeta($expnsg_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta expns_seq_META = createCommonMeta($expns_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta alc_ptn_nm_META = createCommonMeta($alc_ptn_nm, mcframe.commonMA.meta.MA_META.ALC_PTN_NM);
	public static final MCMeta alc_amt_META = createCommonMeta($alc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_tgt_val_META = createCommonMeta($alc_tgt_val, mcframe.commonMG.meta.MG_META.ALC_TGT_VAL);
	public static final MCMeta alc_rate_META = createCommonMeta($alc_rate, mcframe.commonMA.meta.MA_META.ALC_RATE);
	public static final MCMeta coef_val_META = createCommonMeta($coef_val, mcframe.commonMA.meta.MA_META.COEF_VAL);
	public static final MCMeta alc_org_tgt_val_META = createCommonMeta($alc_org_tgt_val, mcframe.commonMG.meta.MG_META.ALC_TGT_VAL);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			loc_cd_META,
			loc_nm_META,
			oper_cd_META,
			oper_nm_META,
			bp_cd_META,
			bp_nm_META,
			ctg_cd_META,
			ctg_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			expns_grp_cd_META,
			expns_grp_nm_META,
			expnsg_seq_META,
			expns_cd_META,
			expns_nm_META,
			expns_seq_META,
			alc_ptn_cd_META,
			alc_ptn_nm_META,
			alc_amt_META,
			alc_tgt_val_META,
			alc_rate_META,
			coef_val_META,
			alc_org_tgt_val_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
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
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$alc_amt, "STD"},	// alc_amt
				{$alc_tgt_val, "STD"},	// alc_tgt_val
				{$alc_org_tgt_val, "STD"}	// alc_org_tgt_val
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 2, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 2, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 3, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 3, $alc_ac_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 4, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 4, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 5, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 5, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 6, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 6, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 7, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 7, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 8, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 8, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 9, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 9, $oper_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 10, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 10, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 11, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 11, $bp_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 12, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 12, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 13, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 13, $ctg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 14, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 14, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 15, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 15, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 16, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 16, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 17, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 17, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 18, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 18, $itm_typ_d_nm, value);
	}


	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public String expns_grp_cd() {
		return getConstString(offset + 19, $expns_grp_cd);
	}

	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public void expns_grp_cd(String value) {
		setConstString(offset + 19, $expns_grp_cd, value);
	}


	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public String expns_grp_nm() {
		return getConstString(offset + 20, $expns_grp_nm);
	}

	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public void expns_grp_nm(String value) {
		setConstString(offset + 20, $expns_grp_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber expnsg_seq() {
		return getConstNumber(offset + 21, $expnsg_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expnsg_seq(MCNumber value) {
		setConstNumber(offset + 21, $expnsg_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expnsg_seq(int value) {
		setConstNumber(offset + 21, $expnsg_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expnsg_seq(long value) {
		setConstNumber(offset + 21, $expnsg_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expnsg_seq(float value) {
		setConstNumber(offset + 21, $expnsg_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expnsg_seq(double value) {
		setConstNumber(offset + 21, $expnsg_seq, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 22, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 22, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 23, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 23, $expns_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber expns_seq() {
		return getConstNumber(offset + 24, $expns_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expns_seq(MCNumber value) {
		setConstNumber(offset + 24, $expns_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expns_seq(int value) {
		setConstNumber(offset + 24, $expns_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expns_seq(long value) {
		setConstNumber(offset + 24, $expns_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expns_seq(float value) {
		setConstNumber(offset + 24, $expns_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void expns_seq(double value) {
		setConstNumber(offset + 24, $expns_seq, value);
	}


	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 25, $alc_ptn_cd);
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 25, $alc_ptn_cd, value);
	}


	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public String alc_ptn_nm() {
		return getConstString(offset + 26, $alc_ptn_nm);
	}

	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public void alc_ptn_nm(String value) {
		setConstString(offset + 26, $alc_ptn_nm, value);
	}


	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public MCNumber alc_amt() {
		return getConstNumber(offset + 27, $alc_amt);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(MCNumber value) {
		setConstNumber(offset + 27, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(int value) {
		setConstNumber(offset + 27, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(long value) {
		setConstNumber(offset + 27, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(float value) {
		setConstNumber(offset + 27, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(double value) {
		setConstNumber(offset + 27, $alc_amt, value);
	}


	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public MCNumber alc_tgt_val() {
		return getConstNumber(offset + 28, $alc_tgt_val);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(MCNumber value) {
		setConstNumber(offset + 28, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(int value) {
		setConstNumber(offset + 28, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(long value) {
		setConstNumber(offset + 28, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(float value) {
		setConstNumber(offset + 28, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(double value) {
		setConstNumber(offset + 28, $alc_tgt_val, value);
	}


	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public MCNumber alc_rate() {
		return getConstNumber(offset + 29, $alc_rate);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(MCNumber value) {
		setConstNumber(offset + 29, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(int value) {
		setConstNumber(offset + 29, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(long value) {
		setConstNumber(offset + 29, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(float value) {
		setConstNumber(offset + 29, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(double value) {
		setConstNumber(offset + 29, $alc_rate, value);
	}


	/**
	 * Allocation coefficient value 配賦係数値.<p>
	 *
	 */
	public MCNumber coef_val() {
		return getConstNumber(offset + 30, $coef_val);
	}

	/**
	 * Allocation coefficient value 配賦係数値.<p>
	 *
	 */
	public void coef_val(MCNumber value) {
		setConstNumber(offset + 30, $coef_val, value);
	}

	/**
	 * Allocation coefficient value 配賦係数値.<p>
	 *
	 */
	public void coef_val(int value) {
		setConstNumber(offset + 30, $coef_val, value);
	}

	/**
	 * Allocation coefficient value 配賦係数値.<p>
	 *
	 */
	public void coef_val(long value) {
		setConstNumber(offset + 30, $coef_val, value);
	}

	/**
	 * Allocation coefficient value 配賦係数値.<p>
	 *
	 */
	public void coef_val(float value) {
		setConstNumber(offset + 30, $coef_val, value);
	}

	/**
	 * Allocation coefficient value 配賦係数値.<p>
	 *
	 */
	public void coef_val(double value) {
		setConstNumber(offset + 30, $coef_val, value);
	}


	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public MCNumber alc_org_tgt_val() {
		return getConstNumber(offset + 31, $alc_org_tgt_val);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(MCNumber value) {
		setConstNumber(offset + 31, $alc_org_tgt_val, value);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(int value) {
		setConstNumber(offset + 31, $alc_org_tgt_val, value);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(long value) {
		setConstNumber(offset + 31, $alc_org_tgt_val, value);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(float value) {
		setConstNumber(offset + 31, $alc_org_tgt_val, value);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(double value) {
		setConstNumber(offset + 31, $alc_org_tgt_val, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			return expnsg_seq();
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			return expns_seq();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			return alc_tgt_val();
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			return alc_rate();
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			return coef_val();
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			return alc_org_tgt_val();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			return expnsg_seq();
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			return expns_seq();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			return alc_tgt_val();
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			return alc_rate();
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			return coef_val();
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			return alc_org_tgt_val();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($expnsg_seq.equalsIgnoreCase(name)) {
			expnsg_seq(value);
			return;
		}
		if ($expns_seq.equalsIgnoreCase(name)) {
			expns_seq(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($coef_val.equalsIgnoreCase(name)) {
			coef_val(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
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

}

