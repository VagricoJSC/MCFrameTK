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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	public static final String $calc_p = "calc_p";
	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
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
	public static final String $itm_p = "itm_p";
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
	 * Without Location 場所無.<p>
	 *
	 */
	public static final String $no_loc_flg = "no_loc_flg";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Without supplier 発注先無.<p>
	 *
	 */
	public static final String $no_sppl_flg = "no_sppl_flg";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * No customer 得意先無.<p>
	 *
	 */
	public static final String $no_cst_flg = "no_cst_flg";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * No delivery destination 納品先無.<p>
	 *
	 */
	public static final String $no_dlv_flg = "no_dlv_flg";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Without distribution channel 1 仕向先１無.<p>
	 *
	 */
	public static final String $no_dest1_flg = "no_dest1_flg";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Without distribution channel 2 仕向先２無.<p>
	 *
	 */
	public static final String $no_dest2_flg = "no_dest2_flg";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Without distribution channel 3 仕向先３無.<p>
	 *
	 */
	public static final String $no_dest3_flg = "no_dest3_flg";
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
	 * Without dept. 部門無.<p>
	 *
	 */
	public static final String $no_dpt_flg = "no_dpt_flg";
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
	 * Cost element type 費目区分.<p>
	 *
	 */
	public static final String $expns_typ = "expns_typ";
	/**
	 * Cost element type name 費目区分名.<p>
	 *
	 */
	public static final String $expns_typ_nm = "expns_typ_nm";
	/**
	 * Include allocation amount = 0 配賦金額＝０含む.<p>
	 *
	 */
	public static final String $amt_zero_flg = "amt_zero_flg";
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
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd1 = "alc_ac_grp_cd1";
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm1 = "alc_ac_grp_nm1";
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd2 = "alc_ac_grp_cd2";
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm2 = "alc_ac_grp_nm2";
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd3 = "alc_ac_grp_cd3";
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm3 = "alc_ac_grp_nm3";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd2 = "dpt_cd2";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm2 = "dpt_nm2";
	/**
	 * Without dept. 部門無.<p>
	 *
	 */
	public static final String $no_dpt2_flg = "no_dpt2_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd2 = "loc_cd2";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm2 = "loc_nm2";
	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public static final String $no_loc2_flg = "no_loc2_flg";
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
	 * Without operation 工程無.<p>
	 *
	 */
	public static final String $no_oper_flg = "no_oper_flg";
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
	 * Without BP 取引先無.<p>
	 *
	 */
	public static final String $no_bp_flg = "no_bp_flg";
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
	/**
	 * Without item category 品群無.<p>
	 *
	 */
	public static final String $no_ctg_flg = "no_ctg_flg";
	public static final String $itm2_p = "itm2_p";
	/**
	 * Without item 品目無.<p>
	 *
	 */
	public static final String $no_itm2_flg = "no_itm2_flg";

	public static final String $calc_no = $calc_p + ".calc_no";
	public static final String $rmrks = $calc_p + ".rmrks";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $itm_cd2 = $itm2_p + ".itm_cd";
	public static final String $itm_sub1_2 = $itm2_p + ".itm_sub1";
	public static final String $itm_sub2_2 = $itm2_p + ".itm_sub2";
	public static final String $itm_sub3_2 = $itm2_p + ".itm_sub3";
	public static final String $itm_nm2 = $itm2_p + ".itm_nm";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_p_META = createInnerRowMeta($calc_p, mcframe.clientMGUB.MGUBP0010.CalcNoR.class);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta no_loc_flg_META = createCommonMeta($no_loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta no_sppl_flg_META = createCommonMeta($no_sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta no_cst_flg_META = createCommonMeta($no_cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta no_dlv_flg_META = createCommonMeta($no_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta no_dest1_flg_META = createCommonMeta($no_dest1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta no_dest2_flg_META = createCommonMeta($no_dest2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta no_dest3_flg_META = createCommonMeta($no_dest3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta no_dpt_flg_META = createCommonMeta($no_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta expns_grp_cd_META = createCommonMeta($expns_grp_cd, mcframe.commonMA.meta.MA_META.EXPNS_GRP_CD);
	public static final MCMeta expns_grp_nm_META = createCommonMeta($expns_grp_nm, mcframe.commonMA.meta.MA_META.EXPNS_GRP_NM);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta expns_typ_META = createCommonMeta($expns_typ, mcframe.commonMA.meta.MA_META.EXPNS_TYP);
	public static final MCMeta expns_typ_nm_META = createCommonMeta($expns_typ_nm, mcframe.commonMA.meta.MA_META.EXPNS_TYP_NM);
	public static final MCMeta amt_zero_flg_META = createCommonMeta($amt_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_grp_cd1_META = createCommonMeta($alc_ac_grp_cd1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_nm1_META = createCommonMeta($alc_ac_grp_nm1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta alc_ac_grp_cd2_META = createCommonMeta($alc_ac_grp_cd2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_nm2_META = createCommonMeta($alc_ac_grp_nm2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta alc_ac_grp_cd3_META = createCommonMeta($alc_ac_grp_cd3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_nm3_META = createCommonMeta($alc_ac_grp_nm3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta dpt_cd2_META = createCommonMeta($dpt_cd2, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm2_META = createCommonMeta($dpt_nm2, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta no_dpt2_flg_META = createCommonMeta($no_dpt2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd2_META = createCommonMeta($loc_cd2, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm2_META = createCommonMeta($loc_nm2, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta no_loc2_flg_META = createCommonMeta($no_loc2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta no_oper_flg_META = createCommonMeta($no_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta no_bp_flg_META = createCommonMeta($no_bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta no_ctg_flg_META = createCommonMeta($no_ctg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm2_p_META = createInnerRowMeta($itm2_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta no_itm2_flg_META = createCommonMeta($no_itm2_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			calc_p_META,
			term_META,
			wg_cd_META,
			wg_nm_META,
			itm_p_META,
			loc_cd_META,
			loc_nm_META,
			no_loc_flg_META,
			sppl_cd_META,
			sppl_nm_META,
			no_sppl_flg_META,
			cst_cd_META,
			cst_nm_META,
			no_cst_flg_META,
			dlv_cd_META,
			dlv_nm_META,
			no_dlv_flg_META,
			dest_cd1_META,
			dest_nm1_META,
			no_dest1_flg_META,
			dest_cd2_META,
			dest_nm2_META,
			no_dest2_flg_META,
			dest_cd3_META,
			dest_nm3_META,
			no_dest3_flg_META,
			dpt_cd_META,
			dpt_nm_META,
			no_dpt_flg_META,
			expns_grp_cd_META,
			expns_grp_nm_META,
			expns_cd_META,
			expns_nm_META,
			expns_typ_META,
			expns_typ_nm_META,
			amt_zero_flg_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			alc_ac_grp_cd1_META,
			alc_ac_grp_nm1_META,
			alc_ac_grp_cd2_META,
			alc_ac_grp_nm2_META,
			alc_ac_grp_cd3_META,
			alc_ac_grp_nm3_META,
			dpt_cd2_META,
			dpt_nm2_META,
			no_dpt2_flg_META,
			loc_cd2_META,
			loc_nm2_META,
			no_loc2_flg_META,
			oper_cd_META,
			oper_nm_META,
			no_oper_flg_META,
			bp_cd_META,
			bp_nm_META,
			no_bp_flg_META,
			ctg_cd_META,
			ctg_nm_META,
			no_ctg_flg_META,
			itm2_p_META,
			no_itm2_flg_META
		},
		new String[][]{
			{
				"calc_no",
				"rmrks",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"itm_cd2",
				"itm_sub1_2",
				"itm_sub2_2",
				"itm_sub3_2",
				"itm_nm2"
			},
			{
				$calc_no,
				$rmrks,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$itm_cd2,
				$itm_sub1_2,
				$itm_sub2_2,
				$itm_sub3_2,
				$itm_nm2
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
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$cst_cd, "bp_nm"},	// cst_cd
				{$dlv_cd, "bp_nm"},	// dlv_cd
				{$dest_cd1, "bp_nm"},	// dest_cd1
				{$dest_cd2, "bp_nm"},	// dest_cd2
				{$dest_cd3, "bp_nm"},	// dest_cd3
				{$alc_ac_grp_cd1, "alc_ac_grp_nm"},	// alc_ac_grp_cd1
				{$alc_ac_grp_cd2, "alc_ac_grp_nm"},	// alc_ac_grp_cd2
				{$alc_ac_grp_cd3, "alc_ac_grp_nm"},	// alc_ac_grp_cd3
				{$dpt_cd2, "dpt_nm"},	// dpt_cd2
				{$loc_cd2, "loc_nm"},	// loc_cd2
				{$itm2_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// itm2_p.itm_cd
				{$itm2_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// itm2_p.itm_sub1
				{$itm2_p + ".itm_sub2", "itm_nm;itm_sub3"},	// itm2_p.itm_sub2
				{$itm2_p + ".itm_sub3", "itm_nm"}	// itm2_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "true"},	// calc_grp_cd
				{$calc_p + ".calc_no", "calc_grp_cd"},	// calc_p.calc_no
				{$wg_cd, "true"},	// wg_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1v"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_p.itm_sub3
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL"},	// loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST"},	// cst_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV"},	// dlv_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd3
				{$dpt_cd, "term"},	// dpt_cd
				{$expns_cd, "expns_grp_cd"},	// expns_cd
				{$dpt_cd2, "true"},	// dpt_cd2
				{$loc_cd2, "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL"},	// loc_cd2
				{$itm2_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true;true"},	// itm2_p.itm_cd
				{$itm2_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd2;true;true"},	// itm2_p.itm_sub1
				{$itm2_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd2;itm_sub1_2;true;true"},	// itm2_p.itm_sub2
				{$itm2_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd2;itm_sub1_2;itm_sub2_2;true;true"}	// itm2_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "std_flg"},	// calc_grp_cd
				{$calc_p + ".calc_no", "calc_grp_cd"},	// calc_p.calc_no
				{$wg_cd, "rd_flg"},	// wg_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;release_flg_on;release_flg_off"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;release_flg_on;release_flg_off"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;release_flg_on;release_flg_off"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_p.itm_sub3
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$cst_cd, "bp_is_srch_typ"},	// cst_cd
				{$dlv_cd, "bp_is_srch_typ"},	// dlv_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"},	// dest_cd3
				{$dpt_cd, "ym"},	// dpt_cd
				{$expns_cd, "expns_grp_cd"},	// expns_cd
				{$dpt_cd2, "mode_this_month_flg"},	// dpt_cd2
				{$loc_cd2, "loc_is_srch_typ"},	// loc_cd2
				{$itm2_p + ".itm_cd", "itm_is_srch_typ;release_flg_on;release_flg_off"},	// itm2_p.itm_cd
				{$itm2_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;release_flg_on;release_flg_off"},	// itm2_p.itm_sub1
				{$itm2_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;release_flg_on;release_flg_off"},	// itm2_p.itm_sub2
				{$itm2_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"}	// itm2_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$dest_cd1, "DEST1"},	// dest_cd1
				{$dest_nm1, "DEST1"},	// dest_nm1
				{$no_dest1_flg, "DEST1"},	// no_dest1_flg
				{$dest_cd2, "DEST2"},	// dest_cd2
				{$dest_nm2, "DEST2"},	// dest_nm2
				{$no_dest2_flg, "DEST2"},	// no_dest2_flg
				{$dest_cd3, "DEST3"},	// dest_cd3
				{$dest_nm3, "DEST3"},	// dest_nm3
				{$no_dest3_flg, "DEST3"}	// no_dest3_flg
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
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 1, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 1, $calc_grp_nm, value);
	}


	public mcframe.clientMGUB.MGUBP0010.CalcNoR calc_p(){
		return (mcframe.clientMGUB.MGUBP0010.CalcNoR) getConstInnerRow(offset + 2, $calc_p);
	}
	
	public void calc_p(mcframe.clientMGUB.MGUBP0010.CalcNoR row){
		setConstInnerRow(offset + 2, $calc_p, row);
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 3, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 3, $term, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 6, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 6, $itm_p, row);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 7, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 7, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 8, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 8, $loc_nm, value);
	}


	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public boolean no_loc_flg() {
		return getConstBoolean(offset + 9, $no_loc_flg);
	}

	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public void no_loc_flg(boolean value) {
		setConstBoolean(offset + 9, $no_loc_flg, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 10, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 10, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 11, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 11, $sppl_nm, value);
	}


	/**
	 * Without supplier 発注先無.<p>
	 *
	 */
	public boolean no_sppl_flg() {
		return getConstBoolean(offset + 12, $no_sppl_flg);
	}

	/**
	 * Without supplier 発注先無.<p>
	 *
	 */
	public void no_sppl_flg(boolean value) {
		setConstBoolean(offset + 12, $no_sppl_flg, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 13, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 13, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 14, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 14, $cst_nm, value);
	}


	/**
	 * No customer 得意先無.<p>
	 *
	 */
	public boolean no_cst_flg() {
		return getConstBoolean(offset + 15, $no_cst_flg);
	}

	/**
	 * No customer 得意先無.<p>
	 *
	 */
	public void no_cst_flg(boolean value) {
		setConstBoolean(offset + 15, $no_cst_flg, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 16, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 16, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 17, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 17, $dlv_nm, value);
	}


	/**
	 * No delivery destination 納品先無.<p>
	 *
	 */
	public boolean no_dlv_flg() {
		return getConstBoolean(offset + 18, $no_dlv_flg);
	}

	/**
	 * No delivery destination 納品先無.<p>
	 *
	 */
	public void no_dlv_flg(boolean value) {
		setConstBoolean(offset + 18, $no_dlv_flg, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 19, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 19, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 20, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 20, $dest_nm1, value);
	}


	/**
	 * Without distribution channel 1 仕向先１無.<p>
	 *
	 */
	public boolean no_dest1_flg() {
		return getConstBoolean(offset + 21, $no_dest1_flg);
	}

	/**
	 * Without distribution channel 1 仕向先１無.<p>
	 *
	 */
	public void no_dest1_flg(boolean value) {
		setConstBoolean(offset + 21, $no_dest1_flg, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 22, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 22, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 23, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 23, $dest_nm2, value);
	}


	/**
	 * Without distribution channel 2 仕向先２無.<p>
	 *
	 */
	public boolean no_dest2_flg() {
		return getConstBoolean(offset + 24, $no_dest2_flg);
	}

	/**
	 * Without distribution channel 2 仕向先２無.<p>
	 *
	 */
	public void no_dest2_flg(boolean value) {
		setConstBoolean(offset + 24, $no_dest2_flg, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 25, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 25, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 26, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 26, $dest_nm3, value);
	}


	/**
	 * Without distribution channel 3 仕向先３無.<p>
	 *
	 */
	public boolean no_dest3_flg() {
		return getConstBoolean(offset + 27, $no_dest3_flg);
	}

	/**
	 * Without distribution channel 3 仕向先３無.<p>
	 *
	 */
	public void no_dest3_flg(boolean value) {
		setConstBoolean(offset + 27, $no_dest3_flg, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 28, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 28, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 29, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 29, $dpt_nm, value);
	}


	/**
	 * Without dept. 部門無.<p>
	 *
	 */
	public boolean no_dpt_flg() {
		return getConstBoolean(offset + 30, $no_dpt_flg);
	}

	/**
	 * Without dept. 部門無.<p>
	 *
	 */
	public void no_dpt_flg(boolean value) {
		setConstBoolean(offset + 30, $no_dpt_flg, value);
	}


	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public String expns_grp_cd() {
		return getConstString(offset + 31, $expns_grp_cd);
	}

	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public void expns_grp_cd(String value) {
		setConstString(offset + 31, $expns_grp_cd, value);
	}


	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public String expns_grp_nm() {
		return getConstString(offset + 32, $expns_grp_nm);
	}

	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public void expns_grp_nm(String value) {
		setConstString(offset + 32, $expns_grp_nm, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 33, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 33, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 34, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 34, $expns_nm, value);
	}


	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public String expns_typ() {
		return getConstString(offset + 35, $expns_typ);
	}

	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public void expns_typ(String value) {
		setConstString(offset + 35, $expns_typ, value);
	}


	/**
	 * Cost element type name 費目区分名.<p>
	 *
	 */
	public String expns_typ_nm() {
		return getConstString(offset + 36, $expns_typ_nm);
	}

	/**
	 * Cost element type name 費目区分名.<p>
	 *
	 */
	public void expns_typ_nm(String value) {
		setConstString(offset + 36, $expns_typ_nm, value);
	}


	/**
	 * Include allocation amount = 0 配賦金額＝０含む.<p>
	 *
	 */
	public boolean amt_zero_flg() {
		return getConstBoolean(offset + 37, $amt_zero_flg);
	}

	/**
	 * Include allocation amount = 0 配賦金額＝０含む.<p>
	 *
	 */
	public void amt_zero_flg(boolean value) {
		setConstBoolean(offset + 37, $amt_zero_flg, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 38, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 38, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 39, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 39, $alc_ac_nm, value);
	}


	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public String alc_ac_grp_cd1() {
		return getConstString(offset + 40, $alc_ac_grp_cd1);
	}

	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public void alc_ac_grp_cd1(String value) {
		setConstString(offset + 40, $alc_ac_grp_cd1, value);
	}


	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public String alc_ac_grp_nm1() {
		return getConstString(offset + 41, $alc_ac_grp_nm1);
	}

	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public void alc_ac_grp_nm1(String value) {
		setConstString(offset + 41, $alc_ac_grp_nm1, value);
	}


	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public String alc_ac_grp_cd2() {
		return getConstString(offset + 42, $alc_ac_grp_cd2);
	}

	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public void alc_ac_grp_cd2(String value) {
		setConstString(offset + 42, $alc_ac_grp_cd2, value);
	}


	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public String alc_ac_grp_nm2() {
		return getConstString(offset + 43, $alc_ac_grp_nm2);
	}

	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public void alc_ac_grp_nm2(String value) {
		setConstString(offset + 43, $alc_ac_grp_nm2, value);
	}


	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public String alc_ac_grp_cd3() {
		return getConstString(offset + 44, $alc_ac_grp_cd3);
	}

	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public void alc_ac_grp_cd3(String value) {
		setConstString(offset + 44, $alc_ac_grp_cd3, value);
	}


	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public String alc_ac_grp_nm3() {
		return getConstString(offset + 45, $alc_ac_grp_nm3);
	}

	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public void alc_ac_grp_nm3(String value) {
		setConstString(offset + 45, $alc_ac_grp_nm3, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd2() {
		return getConstString(offset + 46, $dpt_cd2);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd2(String value) {
		setConstString(offset + 46, $dpt_cd2, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm2() {
		return getConstString(offset + 47, $dpt_nm2);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm2(String value) {
		setConstString(offset + 47, $dpt_nm2, value);
	}


	/**
	 * Without dept. 部門無.<p>
	 *
	 */
	public boolean no_dpt2_flg() {
		return getConstBoolean(offset + 48, $no_dpt2_flg);
	}

	/**
	 * Without dept. 部門無.<p>
	 *
	 */
	public void no_dpt2_flg(boolean value) {
		setConstBoolean(offset + 48, $no_dpt2_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd2() {
		return getConstString(offset + 49, $loc_cd2);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd2(String value) {
		setConstString(offset + 49, $loc_cd2, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm2() {
		return getConstString(offset + 50, $loc_nm2);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm2(String value) {
		setConstString(offset + 50, $loc_nm2, value);
	}


	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public boolean no_loc2_flg() {
		return getConstBoolean(offset + 51, $no_loc2_flg);
	}

	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public void no_loc2_flg(boolean value) {
		setConstBoolean(offset + 51, $no_loc2_flg, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 52, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 52, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 53, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 53, $oper_nm, value);
	}


	/**
	 * Without operation 工程無.<p>
	 *
	 */
	public boolean no_oper_flg() {
		return getConstBoolean(offset + 54, $no_oper_flg);
	}

	/**
	 * Without operation 工程無.<p>
	 *
	 */
	public void no_oper_flg(boolean value) {
		setConstBoolean(offset + 54, $no_oper_flg, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 55, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 55, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 56, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 56, $bp_nm, value);
	}


	/**
	 * Without BP 取引先無.<p>
	 *
	 */
	public boolean no_bp_flg() {
		return getConstBoolean(offset + 57, $no_bp_flg);
	}

	/**
	 * Without BP 取引先無.<p>
	 *
	 */
	public void no_bp_flg(boolean value) {
		setConstBoolean(offset + 57, $no_bp_flg, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 58, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 58, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 59, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 59, $ctg_nm, value);
	}


	/**
	 * Without item category 品群無.<p>
	 *
	 */
	public boolean no_ctg_flg() {
		return getConstBoolean(offset + 60, $no_ctg_flg);
	}

	/**
	 * Without item category 品群無.<p>
	 *
	 */
	public void no_ctg_flg(boolean value) {
		setConstBoolean(offset + 60, $no_ctg_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm2_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 61, $itm2_p);
	}
	
	public void itm2_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 61, $itm2_p, row);
	}


	/**
	 * Without item 品目無.<p>
	 *
	 */
	public boolean no_itm2_flg() {
		return getConstBoolean(offset + 62, $no_itm2_flg);
	}

	/**
	 * Without item 品目無.<p>
	 *
	 */
	public void no_itm2_flg(boolean value) {
		setConstBoolean(offset + 62, $no_itm2_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
		}
		if ($expns_typ_nm.equalsIgnoreCase(name)) {
			return expns_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm3();
		}
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			return dpt_cd2();
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			return dpt_nm2();
		}
		if ($loc_cd2.equalsIgnoreCase(name)) {
			return loc_cd2();
		}
		if ($loc_nm2.equalsIgnoreCase(name)) {
			return loc_nm2();
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($no_loc_flg.equalsIgnoreCase(name)) {
			return no_loc_flg();
		}
		if ($no_sppl_flg.equalsIgnoreCase(name)) {
			return no_sppl_flg();
		}
		if ($no_cst_flg.equalsIgnoreCase(name)) {
			return no_cst_flg();
		}
		if ($no_dlv_flg.equalsIgnoreCase(name)) {
			return no_dlv_flg();
		}
		if ($no_dest1_flg.equalsIgnoreCase(name)) {
			return no_dest1_flg();
		}
		if ($no_dest2_flg.equalsIgnoreCase(name)) {
			return no_dest2_flg();
		}
		if ($no_dest3_flg.equalsIgnoreCase(name)) {
			return no_dest3_flg();
		}
		if ($no_dpt_flg.equalsIgnoreCase(name)) {
			return no_dpt_flg();
		}
		if ($amt_zero_flg.equalsIgnoreCase(name)) {
			return amt_zero_flg();
		}
		if ($no_dpt2_flg.equalsIgnoreCase(name)) {
			return no_dpt2_flg();
		}
		if ($no_loc2_flg.equalsIgnoreCase(name)) {
			return no_loc2_flg();
		}
		if ($no_oper_flg.equalsIgnoreCase(name)) {
			return no_oper_flg();
		}
		if ($no_bp_flg.equalsIgnoreCase(name)) {
			return no_bp_flg();
		}
		if ($no_ctg_flg.equalsIgnoreCase(name)) {
			return no_ctg_flg();
		}
		if ($no_itm2_flg.equalsIgnoreCase(name)) {
			return no_itm2_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
		}
		if ($expns_typ_nm.equalsIgnoreCase(name)) {
			return expns_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm3();
		}
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			return dpt_cd2();
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			return dpt_nm2();
		}
		if ($loc_cd2.equalsIgnoreCase(name)) {
			return loc_cd2();
		}
		if ($loc_nm2.equalsIgnoreCase(name)) {
			return loc_nm2();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($no_loc_flg.equalsIgnoreCase(name)) {
			return no_loc_flg();
		}
		if ($no_sppl_flg.equalsIgnoreCase(name)) {
			return no_sppl_flg();
		}
		if ($no_cst_flg.equalsIgnoreCase(name)) {
			return no_cst_flg();
		}
		if ($no_dlv_flg.equalsIgnoreCase(name)) {
			return no_dlv_flg();
		}
		if ($no_dest1_flg.equalsIgnoreCase(name)) {
			return no_dest1_flg();
		}
		if ($no_dest2_flg.equalsIgnoreCase(name)) {
			return no_dest2_flg();
		}
		if ($no_dest3_flg.equalsIgnoreCase(name)) {
			return no_dest3_flg();
		}
		if ($no_dpt_flg.equalsIgnoreCase(name)) {
			return no_dpt_flg();
		}
		if ($amt_zero_flg.equalsIgnoreCase(name)) {
			return amt_zero_flg();
		}
		if ($no_dpt2_flg.equalsIgnoreCase(name)) {
			return no_dpt2_flg();
		}
		if ($no_loc2_flg.equalsIgnoreCase(name)) {
			return no_loc2_flg();
		}
		if ($no_oper_flg.equalsIgnoreCase(name)) {
			return no_oper_flg();
		}
		if ($no_bp_flg.equalsIgnoreCase(name)) {
			return no_bp_flg();
		}
		if ($no_ctg_flg.equalsIgnoreCase(name)) {
			return no_ctg_flg();
		}
		if ($no_itm2_flg.equalsIgnoreCase(name)) {
			return no_itm2_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
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
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
			return;
		}
		if ($expns_typ_nm.equalsIgnoreCase(name)) {
			expns_typ_nm(value);
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
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			alc_ac_grp_nm1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			alc_ac_grp_nm2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			alc_ac_grp_nm3(value);
			return;
		}
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			dpt_cd2(value);
			return;
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			dpt_nm2(value);
			return;
		}
		if ($loc_cd2.equalsIgnoreCase(name)) {
			loc_cd2(value);
			return;
		}
		if ($loc_nm2.equalsIgnoreCase(name)) {
			loc_nm2(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($no_loc_flg.equalsIgnoreCase(name)) {
			no_loc_flg(value);
			return;
		}
		if ($no_sppl_flg.equalsIgnoreCase(name)) {
			no_sppl_flg(value);
			return;
		}
		if ($no_cst_flg.equalsIgnoreCase(name)) {
			no_cst_flg(value);
			return;
		}
		if ($no_dlv_flg.equalsIgnoreCase(name)) {
			no_dlv_flg(value);
			return;
		}
		if ($no_dest1_flg.equalsIgnoreCase(name)) {
			no_dest1_flg(value);
			return;
		}
		if ($no_dest2_flg.equalsIgnoreCase(name)) {
			no_dest2_flg(value);
			return;
		}
		if ($no_dest3_flg.equalsIgnoreCase(name)) {
			no_dest3_flg(value);
			return;
		}
		if ($no_dpt_flg.equalsIgnoreCase(name)) {
			no_dpt_flg(value);
			return;
		}
		if ($amt_zero_flg.equalsIgnoreCase(name)) {
			amt_zero_flg(value);
			return;
		}
		if ($no_dpt2_flg.equalsIgnoreCase(name)) {
			no_dpt2_flg(value);
			return;
		}
		if ($no_loc2_flg.equalsIgnoreCase(name)) {
			no_loc2_flg(value);
			return;
		}
		if ($no_oper_flg.equalsIgnoreCase(name)) {
			no_oper_flg(value);
			return;
		}
		if ($no_bp_flg.equalsIgnoreCase(name)) {
			no_bp_flg(value);
			return;
		}
		if ($no_ctg_flg.equalsIgnoreCase(name)) {
			no_ctg_flg(value);
			return;
		}
		if ($no_itm2_flg.equalsIgnoreCase(name)) {
			no_itm2_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
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
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
			return;
		}
		if ($expns_typ_nm.equalsIgnoreCase(name)) {
			expns_typ_nm(value);
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
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			alc_ac_grp_nm1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			alc_ac_grp_nm2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			alc_ac_grp_nm3(value);
			return;
		}
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			dpt_cd2(value);
			return;
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			dpt_nm2(value);
			return;
		}
		if ($loc_cd2.equalsIgnoreCase(name)) {
			loc_cd2(value);
			return;
		}
		if ($loc_nm2.equalsIgnoreCase(name)) {
			loc_nm2(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($no_loc_flg.equalsIgnoreCase(name)) {
			no_loc_flg(value);
			return;
		}
		if ($no_sppl_flg.equalsIgnoreCase(name)) {
			no_sppl_flg(value);
			return;
		}
		if ($no_cst_flg.equalsIgnoreCase(name)) {
			no_cst_flg(value);
			return;
		}
		if ($no_dlv_flg.equalsIgnoreCase(name)) {
			no_dlv_flg(value);
			return;
		}
		if ($no_dest1_flg.equalsIgnoreCase(name)) {
			no_dest1_flg(value);
			return;
		}
		if ($no_dest2_flg.equalsIgnoreCase(name)) {
			no_dest2_flg(value);
			return;
		}
		if ($no_dest3_flg.equalsIgnoreCase(name)) {
			no_dest3_flg(value);
			return;
		}
		if ($no_dpt_flg.equalsIgnoreCase(name)) {
			no_dpt_flg(value);
			return;
		}
		if ($amt_zero_flg.equalsIgnoreCase(name)) {
			amt_zero_flg(value);
			return;
		}
		if ($no_dpt2_flg.equalsIgnoreCase(name)) {
			no_dpt2_flg(value);
			return;
		}
		if ($no_loc2_flg.equalsIgnoreCase(name)) {
			no_loc2_flg(value);
			return;
		}
		if ($no_oper_flg.equalsIgnoreCase(name)) {
			no_oper_flg(value);
			return;
		}
		if ($no_bp_flg.equalsIgnoreCase(name)) {
			no_bp_flg(value);
			return;
		}
		if ($no_ctg_flg.equalsIgnoreCase(name)) {
			no_ctg_flg(value);
			return;
		}
		if ($no_itm2_flg.equalsIgnoreCase(name)) {
			no_itm2_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($calc_p.equalsIgnoreCase(name)) {
			return calc_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($itm2_p.equalsIgnoreCase(name)) {
			return itm2_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($calc_p.equalsIgnoreCase(name)) {
			calc_p(
				((MCContainerMeta) calc_p_META).castInnerRow(mcframe.clientMGUB.MGUBP0010.CalcNoR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($itm2_p.equalsIgnoreCase(name)) {
			itm2_p(
				((MCContainerMeta) itm2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String calc_no() {
		return calc_p().calc_no();
	}

	public void calc_no(String value) {
		calc_p().calc_no(value);
	}

	public String rmrks() {
		return calc_p().rmrks();
	}

	public void rmrks(String value) {
		calc_p().rmrks(value);
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

	public String itm_cd2() {
		return itm2_p().itm_cd();
	}

	public void itm_cd2(String value) {
		itm2_p().itm_cd(value);
	}

	public String itm_sub1_2() {
		return itm2_p().itm_sub1();
	}

	public void itm_sub1_2(String value) {
		itm2_p().itm_sub1(value);
	}

	public String itm_sub2_2() {
		return itm2_p().itm_sub2();
	}

	public void itm_sub2_2(String value) {
		itm2_p().itm_sub2(value);
	}

	public String itm_sub3_2() {
		return itm2_p().itm_sub3();
	}

	public void itm_sub3_2(String value) {
		itm2_p().itm_sub3(value);
	}

	public String itm_nm2() {
		return itm2_p().itm_nm();
	}

	public void itm_nm2(String value) {
		itm2_p().itm_nm(value);
	}

}

