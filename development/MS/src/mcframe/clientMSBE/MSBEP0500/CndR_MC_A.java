package mcframe.clientMSBE.MSBEP0500;

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
	 * ADD,Add row and apply,1;UPD,Apply to focused rows,2 ADD,行追加して反映する,1;UPD,フォーカス行に反映する,2.<p>
	 *
	 */
	public static final String $ope = "ope";
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
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * Exclude delivery destination/receiving point inventory 納品先・配送先在庫を除く.<p>
	 *
	 */
	public static final String $only_int_flg = "only_int_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	public static final String $sno_p = "sno_p";
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public static final String $vld_dt_to = "vld_dt_to";
	/**
	 * Usage expiration date FROM 使用期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $lmt_dt_fr = "lmt_dt_fr";
	/**
	 * Usage expiration date TO 使用期限ＴＯ.<p>
	 *
	 */
	public static final String $lmt_dt_to = "lmt_dt_to";
	/**
	 * Include period not set 期限未設定含む.<p>
	 *
	 */
	public static final String $unreg_lmt_flg = "unreg_lmt_flg";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Allocatable qty.: positive only 引当可能数量：正数のみ.<p>
	 *
	 */
	public static final String $positive_flg = "positive_flg";
	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public static final String $except_alloc_wait_flg = "except_alloc_wait_flg";
	/**
	 * Include without inventory 在庫なし含む.<p>
	 *
	 */
	public static final String $stk_schd_flg = "stk_schd_flg";
	/**
	 * Exclude GR schedule for gross allocation 総量引当対象外の入庫予定除く.<p>
	 *
	 */
	public static final String $grs_alloc_flg = "grs_alloc_flg";
	/**
	 * Conforming item 良品.<p>
	 *
	 */
	public static final String $quality_typ_good_flg = "quality_typ_good_flg";
	/**
	 * Operation defective 工程不良品.<p>
	 *
	 */
	public static final String $quality_typ_dfct_oper_flg = "quality_typ_dfct_oper_flg";
	/**
	 * Inspection defective 検査不良品.<p>
	 *
	 */
	public static final String $quality_typ_dfct_insp_flg = "quality_typ_dfct_insp_flg";
	/**
	 * Pending 保留.<p>
	 *
	 */
	public static final String $quality_typ_sspnd_flg = "quality_typ_sspnd_flg";
	/**
	 * Wait for inspection 検査待.<p>
	 *
	 */
	public static final String $stk_insp_typ_yet_flg = "stk_insp_typ_yet_flg";
	/**
	 * Inspecting 検査中.<p>
	 *
	 */
	public static final String $stk_insp_typ_ing_flg = "stk_insp_typ_ing_flg";
	/**
	 * Wait for decision 判定待.<p>
	 *
	 */
	public static final String $stk_insp_typ_wait_judg_flg = "stk_insp_typ_wait_judg_flg";
	/**
	 * Inspected 検査済.<p>
	 *
	 */
	public static final String $stk_insp_typ_fin_flg = "stk_insp_typ_fin_flg";
	/**
	 * Internal inventory 自社在庫.<p>
	 *
	 */
	public static final String $stk_id_typ_costk_flg = "stk_id_typ_costk_flg";
	/**
	 * Before return acceptance 返品検収前.<p>
	 *
	 */
	public static final String $stk_id_typ_rtn_pre_accpt_flg = "stk_id_typ_rtn_pre_accpt_flg";
	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public static final String $stk_id_typ_cststk_flg = "stk_id_typ_cststk_flg";
	/**
	 * VMI VMI.<p>
	 *
	 */
	public static final String $stk_id_typ_rnt_rcv_flg = "stk_id_typ_rnt_rcv_flg";
	/**
	 * Before purchase acceptance 仕入検収前.<p>
	 *
	 */
	public static final String $stk_id_typ_purc_pre_accpt_flg = "stk_id_typ_purc_pre_accpt_flg";
	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public static final String $stk_id_typ_accpt_dfct_flg = "stk_id_typ_accpt_dfct_flg";
	/**
	 * Receiving free of charge 無償受給.<p>
	 *
	 */
	public static final String $stk_id_typ_ncv_rcv_flg = "stk_id_typ_ncv_rcv_flg";
	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public static final String $stk_id_typ_onr_prov_flg = "stk_id_typ_onr_prov_flg";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public static final String $fix_no_typ_nm = "fix_no_typ_nm";
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public static final String $fix_no = "fix_no";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $first_gr_dt_fr = "first_gr_dt_fr";
	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public static final String $first_gr_dt_to = "first_gr_dt_to";
	/**
	 * Scheduled date FROM 予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $schd_dt_fr = "schd_dt_fr";
	/**
	 * Scheduled date TO 予定日ＴＯ.<p>
	 *
	 */
	public static final String $schd_dt_to = "schd_dt_to";
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_opn_flg = "plnt_aprv_sts_typ_opn_flg";
	/**
	 * Approved 承認済.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_acpt_flg = "plnt_aprv_sts_typ_acpt_flg";
	/**
	 * Reject 却下.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_rjct_flg = "plnt_aprv_sts_typ_rjct_flg";
	/**
	 * Not set 未設定.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_non_flg = "plnt_aprv_sts_typ_non_flg";
	/**
	 * Undecided 未判定.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_opn_flg = "mrkt_judg_sts_typ_opn_flg";
	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_acpt_flg = "mrkt_judg_sts_typ_acpt_flg";
	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_not_acpt_flg = "mrkt_judg_sts_typ_not_acpt_flg";
	/**
	 * Not set 未設定.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_non_flg = "mrkt_judg_sts_typ_non_flg";
	public static final String $itm_grp_p = "itm_grp_p";
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_flg = "lot_flg";
	/**
	 * Location 場所.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public static final String $site_flg = "site_flg";
	/**
	 * Distribution group 物流グループ.<p>
	 *
	 */
	public static final String $lg_grp_flg = "lg_grp_flg";
	/**
	 * Gross allocation location group 総量引当場所グループ.<p>
	 *
	 */
	public static final String $alloc_grp_flg = "alloc_grp_flg";
	/**
	 * Mfg. location group 製造場所グループ.<p>
	 *
	 */
	public static final String $loc_grp_flg = "loc_grp_flg";
	/**
	 * Grading 格付.<p>
	 *
	 */
	public static final String $gd_flg = "gd_flg";
	public static final String $sno_flg_p = "sno_flg_p";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_flg = "stk_id_flg";
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public static final String $fix_no_flg = "fix_no_flg";
	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public static final String $schd_dt_flg = "schd_dt_flg";
	/**
	 * WG cd. (For order) ワーキンググループＣＤ（受注用）.<p>
	 *
	 */
	public static final String $slo_wg_cd = "slo_wg_cd";
	/**
	 * Distribution group cd. (For sales order) 物流グループＣＤ（受注用）.<p>
	 *
	 */
	public static final String $slo_lg_grp_cd = "slo_lg_grp_cd";
	/**
	 * Inventory info. search type 在庫情報検索区分.<p>
	 *
	 */
	public static final String $stk_info_srch_typ = "stk_info_srch_typ";
	/**
	 * Inventory info. item type 在庫情報品目区分.<p>
	 *
	 */
	public static final String $stk_info_itm_typ = "stk_info_itm_typ";
	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public static final String $stk_info_loc_typ = "stk_info_loc_typ";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno1_null_flg = $sno_p + ".sno1_null_flg";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno2_null_flg = $sno_p + ".sno2_null_flg";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno3_null_flg = $sno_p + ".sno3_null_flg";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $sno4_null_flg = $sno_p + ".sno4_null_flg";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";
	public static final String $sno1_flg = $sno_flg_p + ".sno1_flg";
	public static final String $sno2_flg = $sno_flg_p + ".sno2_flg";
	public static final String $sno3_flg = $sno_flg_p + ".sno3_flg";
	public static final String $sno4_flg = $sno_flg_p + ".sno4_flg";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta only_int_flg_META = createCommonMeta($only_int_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_to_META = createCommonMeta($vld_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_fr_META = createCommonMeta($lmt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_to_META = createCommonMeta($lmt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unreg_lmt_flg_META = createCommonMeta($unreg_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta positive_flg_META = createCommonMeta($positive_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_alloc_wait_flg_META = createCommonMeta($except_alloc_wait_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_schd_flg_META = createCommonMeta($stk_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta grs_alloc_flg_META = createCommonMeta($grs_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_good_flg_META = createCommonMeta($quality_typ_good_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_dfct_oper_flg_META = createCommonMeta($quality_typ_dfct_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_dfct_insp_flg_META = createCommonMeta($quality_typ_dfct_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_sspnd_flg_META = createCommonMeta($quality_typ_sspnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_insp_typ_yet_flg_META = createCommonMeta($stk_insp_typ_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_insp_typ_ing_flg_META = createCommonMeta($stk_insp_typ_ing_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_insp_typ_wait_judg_flg_META = createCommonMeta($stk_insp_typ_wait_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_insp_typ_fin_flg_META = createCommonMeta($stk_insp_typ_fin_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_costk_flg_META = createCommonMeta($stk_id_typ_costk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_rtn_pre_accpt_flg_META = createCommonMeta($stk_id_typ_rtn_pre_accpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_cststk_flg_META = createCommonMeta($stk_id_typ_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_rnt_rcv_flg_META = createCommonMeta($stk_id_typ_rnt_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_purc_pre_accpt_flg_META = createCommonMeta($stk_id_typ_purc_pre_accpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_accpt_dfct_flg_META = createCommonMeta($stk_id_typ_accpt_dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_ncv_rcv_flg_META = createCommonMeta($stk_id_typ_ncv_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_onr_prov_flg_META = createCommonMeta($stk_id_typ_onr_prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta first_gr_dt_fr_META = createCommonMeta($first_gr_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_to_META = createCommonMeta($first_gr_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_dt_fr_META = createCommonMeta($schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_dt_to_META = createCommonMeta($schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta plnt_aprv_sts_typ_opn_flg_META = createCommonMeta($plnt_aprv_sts_typ_opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_sts_typ_acpt_flg_META = createCommonMeta($plnt_aprv_sts_typ_acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_sts_typ_rjct_flg_META = createCommonMeta($plnt_aprv_sts_typ_rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_sts_typ_non_flg_META = createCommonMeta($plnt_aprv_sts_typ_non_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_sts_typ_opn_flg_META = createCommonMeta($mrkt_judg_sts_typ_opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_sts_typ_acpt_flg_META = createCommonMeta($mrkt_judg_sts_typ_acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_sts_typ_not_acpt_flg_META = createCommonMeta($mrkt_judg_sts_typ_not_acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_sts_typ_non_flg_META = createCommonMeta($mrkt_judg_sts_typ_non_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_flg_META = createCommonMeta($lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_flg_META = createCommonMeta($site_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_flg_META = createCommonMeta($lg_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_grp_flg_META = createCommonMeta($alloc_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_grp_flg_META = createCommonMeta($loc_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_flg_META = createCommonMeta($gd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno_flg_p_META = createInnerRowMeta($sno_flg_p, mcframe.clientMAUB.MAUBP0440.SnoFlgR.class);
	public static final MCMeta stk_id_flg_META = createCommonMeta($stk_id_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_no_flg_META = createCommonMeta($fix_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_dt_flg_META = createCommonMeta($schd_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_wg_cd_META = createCommonMeta($slo_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta slo_lg_grp_cd_META = createCommonMeta($slo_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta stk_info_srch_typ_META = createCommonMeta($stk_info_srch_typ, mcframe.commonMS.meta.MS_META.STK_INFO_SRCH_TYP);
	public static final MCMeta stk_info_itm_typ_META = createCommonMeta($stk_info_itm_typ, mcframe.commonMS.meta.MS_META.STK_INFO_ITM_TYP);
	public static final MCMeta stk_info_loc_typ_META = createCommonMeta($stk_info_loc_typ, mcframe.commonMS.meta.MS_META.STK_INFO_LOC_TYP);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			only_int_flg_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			itm_typ_p_META,
			itm_p_META,
			sundry_itm_flg_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			bp_lot_no_META,
			sno_p_META,
			vld_dt_fr_META,
			vld_dt_to_META,
			lmt_dt_fr_META,
			lmt_dt_to_META,
			unreg_lmt_flg_META,
			gd_cd_META,
			gd_nm_META,
			positive_flg_META,
			except_alloc_wait_flg_META,
			stk_schd_flg_META,
			grs_alloc_flg_META,
			quality_typ_good_flg_META,
			quality_typ_dfct_oper_flg_META,
			quality_typ_dfct_insp_flg_META,
			quality_typ_sspnd_flg_META,
			stk_insp_typ_yet_flg_META,
			stk_insp_typ_ing_flg_META,
			stk_insp_typ_wait_judg_flg_META,
			stk_insp_typ_fin_flg_META,
			stk_id_typ_costk_flg_META,
			stk_id_typ_rtn_pre_accpt_flg_META,
			stk_id_typ_cststk_flg_META,
			stk_id_typ_rnt_rcv_flg_META,
			stk_id_typ_purc_pre_accpt_flg_META,
			stk_id_typ_accpt_dfct_flg_META,
			stk_id_typ_ncv_rcv_flg_META,
			stk_id_typ_onr_prov_flg_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			first_gr_dt_fr_META,
			first_gr_dt_to_META,
			schd_dt_fr_META,
			schd_dt_to_META,
			plnt_aprv_sts_typ_opn_flg_META,
			plnt_aprv_sts_typ_acpt_flg_META,
			plnt_aprv_sts_typ_rjct_flg_META,
			plnt_aprv_sts_typ_non_flg_META,
			mrkt_judg_sts_typ_opn_flg_META,
			mrkt_judg_sts_typ_acpt_flg_META,
			mrkt_judg_sts_typ_not_acpt_flg_META,
			mrkt_judg_sts_typ_non_flg_META,
			itm_grp_p_META,
			wg_flg_META,
			ver_flg_META,
			lot_flg_META,
			loc_flg_META,
			site_flg_META,
			lg_grp_flg_META,
			alloc_grp_flg_META,
			loc_grp_flg_META,
			gd_flg_META,
			sno_flg_p_META,
			stk_id_flg_META,
			fix_no_flg_META,
			schd_dt_flg_META,
			slo_wg_cd_META,
			slo_lg_grp_cd_META,
			stk_info_srch_typ_META,
			stk_info_itm_typ_META,
			stk_info_loc_typ_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"sno1",
				"sno1_null_flg",
				"sno2",
				"sno2_null_flg",
				"sno3",
				"sno3_null_flg",
				"sno4",
				"sno4_null_flg",
				"wrk_no",
				"wrk_nm",
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10",
				"sno1_flg",
				"sno2_flg",
				"sno3_flg",
				"sno4_flg"
			},
			{
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$sno1,
				$sno1_null_flg,
				$sno2,
				$sno2_null_flg,
				$sno3,
				$sno3_null_flg,
				$sno4,
				$sno4_null_flg,
				$wrk_no,
				$wrk_nm,
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
				$itm_grp_cd10,
				$itm_grp_nm10,
				$sno1_flg,
				$sno2_flg,
				$sno3_flg,
				$sno4_flg
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
				{$stk_arrv_bp_cd, "bp_nm"},	// stk_arrv_bp_cd
				{$stk_bp_cd, "bp_nm"},	// stk_bp_cd
				{$pack_unit_cd, "unit_nm"}	// pack_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$str_ln_cd, "loc_cd;true"},	// str_ln_cd
				{$stk_arrv_bp_cd, "MAC_BP_IS_SRCH_TYP.COMM"},	// stk_arrv_bp_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$stk_bp_cd, "MAC_BP_IS_SRCH_TYP.COMM"}	// stk_bp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$str_ln_cd, "loc_cd;mode_nullval_flg"},	// str_ln_cd
				{$stk_arrv_bp_cd, "bp_is_srch_typ"},	// stk_arrv_bp_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$stk_bp_cd, "bp_is_srch_typ"}	// stk_bp_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$ver_no_p, "VER_NO"},	// ver_no_p
				{$ver_no_p + ".ver_no", "VER_NO"},	// ver_no_p.ver_no
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$wg_flg, "WG"},	// wg_flg
				{$ver_flg, "VER_NO"},	// ver_flg
				{$site_flg, "SITE"},	// site_flg
				{$lg_grp_flg, "LG_GRP"},	// lg_grp_flg
				{$alloc_grp_flg, "ALLOC_GRP"},	// alloc_grp_flg
				{$loc_grp_flg, "LOC_GRP"},	// loc_grp_flg
				{$gd_flg, "STK_GD"}	// gd_flg
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
	 * ADD,Add row and apply,1;UPD,Apply to focused rows,2 ADD,行追加して反映する,1;UPD,フォーカス行に反映する,2.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * ADD,Add row and apply,1;UPD,Apply to focused rows,2 ADD,行追加して反映する,1;UPD,フォーカス行に反映する,2.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 1, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 1, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 2, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 2, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 3, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 3, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 4, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 4, $str_ln_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 5, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 5, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 6, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 6, $stk_arrv_bp_nm, value);
	}


	/**
	 * Exclude delivery destination/receiving point inventory 納品先・配送先在庫を除く.<p>
	 *
	 */
	public boolean only_int_flg() {
		return getConstBoolean(offset + 7, $only_int_flg);
	}

	/**
	 * Exclude delivery destination/receiving point inventory 納品先・配送先在庫を除く.<p>
	 *
	 */
	public void only_int_flg(boolean value) {
		setConstBoolean(offset + 7, $only_int_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 8, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 8, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 9, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 9, $site_nm, value);
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 12, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 12, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 13, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 13, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 14, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 14, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 15, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 15, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 16, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 16, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 17, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 17, $loc_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 18, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 18, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 19, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 19, $itm_p, row);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 20, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 20, $sundry_itm_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 21, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 21, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 22, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 22, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 23, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 23, $sublot_no, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 24, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 24, $bp_lot_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 25, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 25, $sno_p, row);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 26, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 26, $vld_dt_fr, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 27, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 27, $vld_dt_to, value);
	}


	/**
	 * Usage expiration date FROM 使用期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate lmt_dt_fr() {
		return getConstDate(offset + 28, $lmt_dt_fr);
	}

	/**
	 * Usage expiration date FROM 使用期限ＦＲＯＭ.<p>
	 *
	 */
	public void lmt_dt_fr(MCDate value) {
		setConstDate(offset + 28, $lmt_dt_fr, value);
	}


	/**
	 * Usage expiration date TO 使用期限ＴＯ.<p>
	 *
	 */
	public MCDate lmt_dt_to() {
		return getConstDate(offset + 29, $lmt_dt_to);
	}

	/**
	 * Usage expiration date TO 使用期限ＴＯ.<p>
	 *
	 */
	public void lmt_dt_to(MCDate value) {
		setConstDate(offset + 29, $lmt_dt_to, value);
	}


	/**
	 * Include period not set 期限未設定含む.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 30, $unreg_lmt_flg);
	}

	/**
	 * Include period not set 期限未設定含む.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 30, $unreg_lmt_flg, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 31, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 31, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 32, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 32, $gd_nm, value);
	}


	/**
	 * Allocatable qty.: positive only 引当可能数量：正数のみ.<p>
	 *
	 */
	public boolean positive_flg() {
		return getConstBoolean(offset + 33, $positive_flg);
	}

	/**
	 * Allocatable qty.: positive only 引当可能数量：正数のみ.<p>
	 *
	 */
	public void positive_flg(boolean value) {
		setConstBoolean(offset + 33, $positive_flg, value);
	}


	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public boolean except_alloc_wait_flg() {
		return getConstBoolean(offset + 34, $except_alloc_wait_flg);
	}

	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public void except_alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 34, $except_alloc_wait_flg, value);
	}


	/**
	 * Include without inventory 在庫なし含む.<p>
	 *
	 */
	public boolean stk_schd_flg() {
		return getConstBoolean(offset + 35, $stk_schd_flg);
	}

	/**
	 * Include without inventory 在庫なし含む.<p>
	 *
	 */
	public void stk_schd_flg(boolean value) {
		setConstBoolean(offset + 35, $stk_schd_flg, value);
	}


	/**
	 * Exclude GR schedule for gross allocation 総量引当対象外の入庫予定除く.<p>
	 *
	 */
	public boolean grs_alloc_flg() {
		return getConstBoolean(offset + 36, $grs_alloc_flg);
	}

	/**
	 * Exclude GR schedule for gross allocation 総量引当対象外の入庫予定除く.<p>
	 *
	 */
	public void grs_alloc_flg(boolean value) {
		setConstBoolean(offset + 36, $grs_alloc_flg, value);
	}


	/**
	 * Conforming item 良品.<p>
	 *
	 */
	public boolean quality_typ_good_flg() {
		return getConstBoolean(offset + 37, $quality_typ_good_flg);
	}

	/**
	 * Conforming item 良品.<p>
	 *
	 */
	public void quality_typ_good_flg(boolean value) {
		setConstBoolean(offset + 37, $quality_typ_good_flg, value);
	}


	/**
	 * Operation defective 工程不良品.<p>
	 *
	 */
	public boolean quality_typ_dfct_oper_flg() {
		return getConstBoolean(offset + 38, $quality_typ_dfct_oper_flg);
	}

	/**
	 * Operation defective 工程不良品.<p>
	 *
	 */
	public void quality_typ_dfct_oper_flg(boolean value) {
		setConstBoolean(offset + 38, $quality_typ_dfct_oper_flg, value);
	}


	/**
	 * Inspection defective 検査不良品.<p>
	 *
	 */
	public boolean quality_typ_dfct_insp_flg() {
		return getConstBoolean(offset + 39, $quality_typ_dfct_insp_flg);
	}

	/**
	 * Inspection defective 検査不良品.<p>
	 *
	 */
	public void quality_typ_dfct_insp_flg(boolean value) {
		setConstBoolean(offset + 39, $quality_typ_dfct_insp_flg, value);
	}


	/**
	 * Pending 保留.<p>
	 *
	 */
	public boolean quality_typ_sspnd_flg() {
		return getConstBoolean(offset + 40, $quality_typ_sspnd_flg);
	}

	/**
	 * Pending 保留.<p>
	 *
	 */
	public void quality_typ_sspnd_flg(boolean value) {
		setConstBoolean(offset + 40, $quality_typ_sspnd_flg, value);
	}


	/**
	 * Wait for inspection 検査待.<p>
	 *
	 */
	public boolean stk_insp_typ_yet_flg() {
		return getConstBoolean(offset + 41, $stk_insp_typ_yet_flg);
	}

	/**
	 * Wait for inspection 検査待.<p>
	 *
	 */
	public void stk_insp_typ_yet_flg(boolean value) {
		setConstBoolean(offset + 41, $stk_insp_typ_yet_flg, value);
	}


	/**
	 * Inspecting 検査中.<p>
	 *
	 */
	public boolean stk_insp_typ_ing_flg() {
		return getConstBoolean(offset + 42, $stk_insp_typ_ing_flg);
	}

	/**
	 * Inspecting 検査中.<p>
	 *
	 */
	public void stk_insp_typ_ing_flg(boolean value) {
		setConstBoolean(offset + 42, $stk_insp_typ_ing_flg, value);
	}


	/**
	 * Wait for decision 判定待.<p>
	 *
	 */
	public boolean stk_insp_typ_wait_judg_flg() {
		return getConstBoolean(offset + 43, $stk_insp_typ_wait_judg_flg);
	}

	/**
	 * Wait for decision 判定待.<p>
	 *
	 */
	public void stk_insp_typ_wait_judg_flg(boolean value) {
		setConstBoolean(offset + 43, $stk_insp_typ_wait_judg_flg, value);
	}


	/**
	 * Inspected 検査済.<p>
	 *
	 */
	public boolean stk_insp_typ_fin_flg() {
		return getConstBoolean(offset + 44, $stk_insp_typ_fin_flg);
	}

	/**
	 * Inspected 検査済.<p>
	 *
	 */
	public void stk_insp_typ_fin_flg(boolean value) {
		setConstBoolean(offset + 44, $stk_insp_typ_fin_flg, value);
	}


	/**
	 * Internal inventory 自社在庫.<p>
	 *
	 */
	public boolean stk_id_typ_costk_flg() {
		return getConstBoolean(offset + 45, $stk_id_typ_costk_flg);
	}

	/**
	 * Internal inventory 自社在庫.<p>
	 *
	 */
	public void stk_id_typ_costk_flg(boolean value) {
		setConstBoolean(offset + 45, $stk_id_typ_costk_flg, value);
	}


	/**
	 * Before return acceptance 返品検収前.<p>
	 *
	 */
	public boolean stk_id_typ_rtn_pre_accpt_flg() {
		return getConstBoolean(offset + 46, $stk_id_typ_rtn_pre_accpt_flg);
	}

	/**
	 * Before return acceptance 返品検収前.<p>
	 *
	 */
	public void stk_id_typ_rtn_pre_accpt_flg(boolean value) {
		setConstBoolean(offset + 46, $stk_id_typ_rtn_pre_accpt_flg, value);
	}


	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public boolean stk_id_typ_cststk_flg() {
		return getConstBoolean(offset + 47, $stk_id_typ_cststk_flg);
	}

	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public void stk_id_typ_cststk_flg(boolean value) {
		setConstBoolean(offset + 47, $stk_id_typ_cststk_flg, value);
	}


	/**
	 * VMI VMI.<p>
	 *
	 */
	public boolean stk_id_typ_rnt_rcv_flg() {
		return getConstBoolean(offset + 48, $stk_id_typ_rnt_rcv_flg);
	}

	/**
	 * VMI VMI.<p>
	 *
	 */
	public void stk_id_typ_rnt_rcv_flg(boolean value) {
		setConstBoolean(offset + 48, $stk_id_typ_rnt_rcv_flg, value);
	}


	/**
	 * Before purchase acceptance 仕入検収前.<p>
	 *
	 */
	public boolean stk_id_typ_purc_pre_accpt_flg() {
		return getConstBoolean(offset + 49, $stk_id_typ_purc_pre_accpt_flg);
	}

	/**
	 * Before purchase acceptance 仕入検収前.<p>
	 *
	 */
	public void stk_id_typ_purc_pre_accpt_flg(boolean value) {
		setConstBoolean(offset + 49, $stk_id_typ_purc_pre_accpt_flg, value);
	}


	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public boolean stk_id_typ_accpt_dfct_flg() {
		return getConstBoolean(offset + 50, $stk_id_typ_accpt_dfct_flg);
	}

	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public void stk_id_typ_accpt_dfct_flg(boolean value) {
		setConstBoolean(offset + 50, $stk_id_typ_accpt_dfct_flg, value);
	}


	/**
	 * Receiving free of charge 無償受給.<p>
	 *
	 */
	public boolean stk_id_typ_ncv_rcv_flg() {
		return getConstBoolean(offset + 51, $stk_id_typ_ncv_rcv_flg);
	}

	/**
	 * Receiving free of charge 無償受給.<p>
	 *
	 */
	public void stk_id_typ_ncv_rcv_flg(boolean value) {
		setConstBoolean(offset + 51, $stk_id_typ_ncv_rcv_flg, value);
	}


	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public boolean stk_id_typ_onr_prov_flg() {
		return getConstBoolean(offset + 52, $stk_id_typ_onr_prov_flg);
	}

	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public void stk_id_typ_onr_prov_flg(boolean value) {
		setConstBoolean(offset + 52, $stk_id_typ_onr_prov_flg, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 53, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 53, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 54, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 54, $stk_bp_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 55, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 55, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 56, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 56, $asst_typ_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 57, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 57, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 58, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 58, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 59, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 59, $fix_no, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 60, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 60, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 61, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 61, $pack_unit_nm, value);
	}


	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_gr_dt_fr() {
		return getConstDate(offset + 62, $first_gr_dt_fr);
	}

	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public void first_gr_dt_fr(MCDate value) {
		setConstDate(offset + 62, $first_gr_dt_fr, value);
	}


	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public MCDate first_gr_dt_to() {
		return getConstDate(offset + 63, $first_gr_dt_to);
	}

	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public void first_gr_dt_to(MCDate value) {
		setConstDate(offset + 63, $first_gr_dt_to, value);
	}


	/**
	 * Scheduled date FROM 予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate schd_dt_fr() {
		return getConstDate(offset + 64, $schd_dt_fr);
	}

	/**
	 * Scheduled date FROM 予定日ＦＲＯＭ.<p>
	 *
	 */
	public void schd_dt_fr(MCDate value) {
		setConstDate(offset + 64, $schd_dt_fr, value);
	}


	/**
	 * Scheduled date TO 予定日ＴＯ.<p>
	 *
	 */
	public MCDate schd_dt_to() {
		return getConstDate(offset + 65, $schd_dt_to);
	}

	/**
	 * Scheduled date TO 予定日ＴＯ.<p>
	 *
	 */
	public void schd_dt_to(MCDate value) {
		setConstDate(offset + 65, $schd_dt_to, value);
	}


	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public boolean plnt_aprv_sts_typ_opn_flg() {
		return getConstBoolean(offset + 66, $plnt_aprv_sts_typ_opn_flg);
	}

	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_opn_flg(boolean value) {
		setConstBoolean(offset + 66, $plnt_aprv_sts_typ_opn_flg, value);
	}


	/**
	 * Approved 承認済.<p>
	 *
	 */
	public boolean plnt_aprv_sts_typ_acpt_flg() {
		return getConstBoolean(offset + 67, $plnt_aprv_sts_typ_acpt_flg);
	}

	/**
	 * Approved 承認済.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_acpt_flg(boolean value) {
		setConstBoolean(offset + 67, $plnt_aprv_sts_typ_acpt_flg, value);
	}


	/**
	 * Reject 却下.<p>
	 *
	 */
	public boolean plnt_aprv_sts_typ_rjct_flg() {
		return getConstBoolean(offset + 68, $plnt_aprv_sts_typ_rjct_flg);
	}

	/**
	 * Reject 却下.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_rjct_flg(boolean value) {
		setConstBoolean(offset + 68, $plnt_aprv_sts_typ_rjct_flg, value);
	}


	/**
	 * Not set 未設定.<p>
	 *
	 */
	public boolean plnt_aprv_sts_typ_non_flg() {
		return getConstBoolean(offset + 69, $plnt_aprv_sts_typ_non_flg);
	}

	/**
	 * Not set 未設定.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_non_flg(boolean value) {
		setConstBoolean(offset + 69, $plnt_aprv_sts_typ_non_flg, value);
	}


	/**
	 * Undecided 未判定.<p>
	 *
	 */
	public boolean mrkt_judg_sts_typ_opn_flg() {
		return getConstBoolean(offset + 70, $mrkt_judg_sts_typ_opn_flg);
	}

	/**
	 * Undecided 未判定.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_opn_flg(boolean value) {
		setConstBoolean(offset + 70, $mrkt_judg_sts_typ_opn_flg, value);
	}


	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public boolean mrkt_judg_sts_typ_acpt_flg() {
		return getConstBoolean(offset + 71, $mrkt_judg_sts_typ_acpt_flg);
	}

	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_acpt_flg(boolean value) {
		setConstBoolean(offset + 71, $mrkt_judg_sts_typ_acpt_flg, value);
	}


	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public boolean mrkt_judg_sts_typ_not_acpt_flg() {
		return getConstBoolean(offset + 72, $mrkt_judg_sts_typ_not_acpt_flg);
	}

	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_not_acpt_flg(boolean value) {
		setConstBoolean(offset + 72, $mrkt_judg_sts_typ_not_acpt_flg, value);
	}


	/**
	 * Not set 未設定.<p>
	 *
	 */
	public boolean mrkt_judg_sts_typ_non_flg() {
		return getConstBoolean(offset + 73, $mrkt_judg_sts_typ_non_flg);
	}

	/**
	 * Not set 未設定.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_non_flg(boolean value) {
		setConstBoolean(offset + 73, $mrkt_judg_sts_typ_non_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 74, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 74, $itm_grp_p, row);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 75, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 75, $wg_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 76, $ver_flg);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 76, $ver_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_flg() {
		return getConstBoolean(offset + 77, $lot_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_flg(boolean value) {
		setConstBoolean(offset + 77, $lot_flg, value);
	}


	/**
	 * Location 場所.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 78, $loc_flg);
	}

	/**
	 * Location 場所.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 78, $loc_flg, value);
	}


	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public boolean site_flg() {
		return getConstBoolean(offset + 79, $site_flg);
	}

	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public void site_flg(boolean value) {
		setConstBoolean(offset + 79, $site_flg, value);
	}


	/**
	 * Distribution group 物流グループ.<p>
	 *
	 */
	public boolean lg_grp_flg() {
		return getConstBoolean(offset + 80, $lg_grp_flg);
	}

	/**
	 * Distribution group 物流グループ.<p>
	 *
	 */
	public void lg_grp_flg(boolean value) {
		setConstBoolean(offset + 80, $lg_grp_flg, value);
	}


	/**
	 * Gross allocation location group 総量引当場所グループ.<p>
	 *
	 */
	public boolean alloc_grp_flg() {
		return getConstBoolean(offset + 81, $alloc_grp_flg);
	}

	/**
	 * Gross allocation location group 総量引当場所グループ.<p>
	 *
	 */
	public void alloc_grp_flg(boolean value) {
		setConstBoolean(offset + 81, $alloc_grp_flg, value);
	}


	/**
	 * Mfg. location group 製造場所グループ.<p>
	 *
	 */
	public boolean loc_grp_flg() {
		return getConstBoolean(offset + 82, $loc_grp_flg);
	}

	/**
	 * Mfg. location group 製造場所グループ.<p>
	 *
	 */
	public void loc_grp_flg(boolean value) {
		setConstBoolean(offset + 82, $loc_grp_flg, value);
	}


	/**
	 * Grading 格付.<p>
	 *
	 */
	public boolean gd_flg() {
		return getConstBoolean(offset + 83, $gd_flg);
	}

	/**
	 * Grading 格付.<p>
	 *
	 */
	public void gd_flg(boolean value) {
		setConstBoolean(offset + 83, $gd_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0440.SnoFlgR sno_flg_p(){
		return (mcframe.clientMAUB.MAUBP0440.SnoFlgR) getConstInnerRow(offset + 84, $sno_flg_p);
	}
	
	public void sno_flg_p(mcframe.clientMAUB.MAUBP0440.SnoFlgR row){
		setConstInnerRow(offset + 84, $sno_flg_p, row);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public boolean stk_id_flg() {
		return getConstBoolean(offset + 85, $stk_id_flg);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_flg(boolean value) {
		setConstBoolean(offset + 85, $stk_id_flg, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public boolean fix_no_flg() {
		return getConstBoolean(offset + 86, $fix_no_flg);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_flg(boolean value) {
		setConstBoolean(offset + 86, $fix_no_flg, value);
	}


	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public boolean schd_dt_flg() {
		return getConstBoolean(offset + 87, $schd_dt_flg);
	}

	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public void schd_dt_flg(boolean value) {
		setConstBoolean(offset + 87, $schd_dt_flg, value);
	}


	/**
	 * WG cd. (For order) ワーキンググループＣＤ（受注用）.<p>
	 *
	 */
	public String slo_wg_cd() {
		return getConstString(offset + 88, $slo_wg_cd);
	}

	/**
	 * WG cd. (For order) ワーキンググループＣＤ（受注用）.<p>
	 *
	 */
	public void slo_wg_cd(String value) {
		setConstString(offset + 88, $slo_wg_cd, value);
	}


	/**
	 * Distribution group cd. (For sales order) 物流グループＣＤ（受注用）.<p>
	 *
	 */
	public String slo_lg_grp_cd() {
		return getConstString(offset + 89, $slo_lg_grp_cd);
	}

	/**
	 * Distribution group cd. (For sales order) 物流グループＣＤ（受注用）.<p>
	 *
	 */
	public void slo_lg_grp_cd(String value) {
		setConstString(offset + 89, $slo_lg_grp_cd, value);
	}


	/**
	 * Inventory info. search type 在庫情報検索区分.<p>
	 *
	 */
	public String stk_info_srch_typ() {
		return getConstString(offset + 90, $stk_info_srch_typ);
	}

	/**
	 * Inventory info. search type 在庫情報検索区分.<p>
	 *
	 */
	public void stk_info_srch_typ(String value) {
		setConstString(offset + 90, $stk_info_srch_typ, value);
	}


	/**
	 * Inventory info. item type 在庫情報品目区分.<p>
	 *
	 */
	public String stk_info_itm_typ() {
		return getConstString(offset + 91, $stk_info_itm_typ);
	}

	/**
	 * Inventory info. item type 在庫情報品目区分.<p>
	 *
	 */
	public void stk_info_itm_typ(String value) {
		setConstString(offset + 91, $stk_info_itm_typ, value);
	}


	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public String stk_info_loc_typ() {
		return getConstString(offset + 92, $stk_info_loc_typ);
	}

	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public void stk_info_loc_typ(String value) {
		setConstString(offset + 92, $stk_info_loc_typ, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($slo_wg_cd.equalsIgnoreCase(name)) {
			return slo_wg_cd();
		}
		if ($slo_lg_grp_cd.equalsIgnoreCase(name)) {
			return slo_lg_grp_cd();
		}
		if ($stk_info_srch_typ.equalsIgnoreCase(name)) {
			return stk_info_srch_typ();
		}
		if ($stk_info_itm_typ.equalsIgnoreCase(name)) {
			return stk_info_itm_typ();
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			return stk_info_loc_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($lmt_dt_fr.equalsIgnoreCase(name)) {
			return lmt_dt_fr();
		}
		if ($lmt_dt_to.equalsIgnoreCase(name)) {
			return lmt_dt_to();
		}
		if ($first_gr_dt_fr.equalsIgnoreCase(name)) {
			return first_gr_dt_fr();
		}
		if ($first_gr_dt_to.equalsIgnoreCase(name)) {
			return first_gr_dt_to();
		}
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			return schd_dt_fr();
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			return schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($only_int_flg.equalsIgnoreCase(name)) {
			return only_int_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($positive_flg.equalsIgnoreCase(name)) {
			return positive_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($stk_schd_flg.equalsIgnoreCase(name)) {
			return stk_schd_flg();
		}
		if ($grs_alloc_flg.equalsIgnoreCase(name)) {
			return grs_alloc_flg();
		}
		if ($quality_typ_good_flg.equalsIgnoreCase(name)) {
			return quality_typ_good_flg();
		}
		if ($quality_typ_dfct_oper_flg.equalsIgnoreCase(name)) {
			return quality_typ_dfct_oper_flg();
		}
		if ($quality_typ_dfct_insp_flg.equalsIgnoreCase(name)) {
			return quality_typ_dfct_insp_flg();
		}
		if ($quality_typ_sspnd_flg.equalsIgnoreCase(name)) {
			return quality_typ_sspnd_flg();
		}
		if ($stk_insp_typ_yet_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_yet_flg();
		}
		if ($stk_insp_typ_ing_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_ing_flg();
		}
		if ($stk_insp_typ_wait_judg_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_wait_judg_flg();
		}
		if ($stk_insp_typ_fin_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_fin_flg();
		}
		if ($stk_id_typ_costk_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_costk_flg();
		}
		if ($stk_id_typ_rtn_pre_accpt_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_rtn_pre_accpt_flg();
		}
		if ($stk_id_typ_cststk_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_cststk_flg();
		}
		if ($stk_id_typ_rnt_rcv_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_rnt_rcv_flg();
		}
		if ($stk_id_typ_purc_pre_accpt_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_purc_pre_accpt_flg();
		}
		if ($stk_id_typ_accpt_dfct_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_accpt_dfct_flg();
		}
		if ($stk_id_typ_ncv_rcv_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_ncv_rcv_flg();
		}
		if ($stk_id_typ_onr_prov_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_onr_prov_flg();
		}
		if ($plnt_aprv_sts_typ_opn_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_opn_flg();
		}
		if ($plnt_aprv_sts_typ_acpt_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_acpt_flg();
		}
		if ($plnt_aprv_sts_typ_rjct_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_rjct_flg();
		}
		if ($plnt_aprv_sts_typ_non_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_non_flg();
		}
		if ($mrkt_judg_sts_typ_opn_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_opn_flg();
		}
		if ($mrkt_judg_sts_typ_acpt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_acpt_flg();
		}
		if ($mrkt_judg_sts_typ_not_acpt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_not_acpt_flg();
		}
		if ($mrkt_judg_sts_typ_non_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_non_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			return site_flg();
		}
		if ($lg_grp_flg.equalsIgnoreCase(name)) {
			return lg_grp_flg();
		}
		if ($alloc_grp_flg.equalsIgnoreCase(name)) {
			return alloc_grp_flg();
		}
		if ($loc_grp_flg.equalsIgnoreCase(name)) {
			return loc_grp_flg();
		}
		if ($gd_flg.equalsIgnoreCase(name)) {
			return gd_flg();
		}
		if ($stk_id_flg.equalsIgnoreCase(name)) {
			return stk_id_flg();
		}
		if ($fix_no_flg.equalsIgnoreCase(name)) {
			return fix_no_flg();
		}
		if ($schd_dt_flg.equalsIgnoreCase(name)) {
			return schd_dt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($slo_wg_cd.equalsIgnoreCase(name)) {
			return slo_wg_cd();
		}
		if ($slo_lg_grp_cd.equalsIgnoreCase(name)) {
			return slo_lg_grp_cd();
		}
		if ($stk_info_srch_typ.equalsIgnoreCase(name)) {
			return stk_info_srch_typ();
		}
		if ($stk_info_itm_typ.equalsIgnoreCase(name)) {
			return stk_info_itm_typ();
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			return stk_info_loc_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($lmt_dt_fr.equalsIgnoreCase(name)) {
			return lmt_dt_fr();
		}
		if ($lmt_dt_to.equalsIgnoreCase(name)) {
			return lmt_dt_to();
		}
		if ($first_gr_dt_fr.equalsIgnoreCase(name)) {
			return first_gr_dt_fr();
		}
		if ($first_gr_dt_to.equalsIgnoreCase(name)) {
			return first_gr_dt_to();
		}
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			return schd_dt_fr();
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			return schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($only_int_flg.equalsIgnoreCase(name)) {
			return only_int_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($positive_flg.equalsIgnoreCase(name)) {
			return positive_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($stk_schd_flg.equalsIgnoreCase(name)) {
			return stk_schd_flg();
		}
		if ($grs_alloc_flg.equalsIgnoreCase(name)) {
			return grs_alloc_flg();
		}
		if ($quality_typ_good_flg.equalsIgnoreCase(name)) {
			return quality_typ_good_flg();
		}
		if ($quality_typ_dfct_oper_flg.equalsIgnoreCase(name)) {
			return quality_typ_dfct_oper_flg();
		}
		if ($quality_typ_dfct_insp_flg.equalsIgnoreCase(name)) {
			return quality_typ_dfct_insp_flg();
		}
		if ($quality_typ_sspnd_flg.equalsIgnoreCase(name)) {
			return quality_typ_sspnd_flg();
		}
		if ($stk_insp_typ_yet_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_yet_flg();
		}
		if ($stk_insp_typ_ing_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_ing_flg();
		}
		if ($stk_insp_typ_wait_judg_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_wait_judg_flg();
		}
		if ($stk_insp_typ_fin_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_fin_flg();
		}
		if ($stk_id_typ_costk_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_costk_flg();
		}
		if ($stk_id_typ_rtn_pre_accpt_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_rtn_pre_accpt_flg();
		}
		if ($stk_id_typ_cststk_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_cststk_flg();
		}
		if ($stk_id_typ_rnt_rcv_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_rnt_rcv_flg();
		}
		if ($stk_id_typ_purc_pre_accpt_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_purc_pre_accpt_flg();
		}
		if ($stk_id_typ_accpt_dfct_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_accpt_dfct_flg();
		}
		if ($stk_id_typ_ncv_rcv_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_ncv_rcv_flg();
		}
		if ($stk_id_typ_onr_prov_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_onr_prov_flg();
		}
		if ($plnt_aprv_sts_typ_opn_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_opn_flg();
		}
		if ($plnt_aprv_sts_typ_acpt_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_acpt_flg();
		}
		if ($plnt_aprv_sts_typ_rjct_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_rjct_flg();
		}
		if ($plnt_aprv_sts_typ_non_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_non_flg();
		}
		if ($mrkt_judg_sts_typ_opn_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_opn_flg();
		}
		if ($mrkt_judg_sts_typ_acpt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_acpt_flg();
		}
		if ($mrkt_judg_sts_typ_not_acpt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_not_acpt_flg();
		}
		if ($mrkt_judg_sts_typ_non_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_non_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			return site_flg();
		}
		if ($lg_grp_flg.equalsIgnoreCase(name)) {
			return lg_grp_flg();
		}
		if ($alloc_grp_flg.equalsIgnoreCase(name)) {
			return alloc_grp_flg();
		}
		if ($loc_grp_flg.equalsIgnoreCase(name)) {
			return loc_grp_flg();
		}
		if ($gd_flg.equalsIgnoreCase(name)) {
			return gd_flg();
		}
		if ($stk_id_flg.equalsIgnoreCase(name)) {
			return stk_id_flg();
		}
		if ($fix_no_flg.equalsIgnoreCase(name)) {
			return fix_no_flg();
		}
		if ($schd_dt_flg.equalsIgnoreCase(name)) {
			return schd_dt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($slo_wg_cd.equalsIgnoreCase(name)) {
			slo_wg_cd(value);
			return;
		}
		if ($slo_lg_grp_cd.equalsIgnoreCase(name)) {
			slo_lg_grp_cd(value);
			return;
		}
		if ($stk_info_srch_typ.equalsIgnoreCase(name)) {
			stk_info_srch_typ(value);
			return;
		}
		if ($stk_info_itm_typ.equalsIgnoreCase(name)) {
			stk_info_itm_typ(value);
			return;
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			stk_info_loc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			vld_dt_to(value);
			return;
		}
		if ($lmt_dt_fr.equalsIgnoreCase(name)) {
			lmt_dt_fr(value);
			return;
		}
		if ($lmt_dt_to.equalsIgnoreCase(name)) {
			lmt_dt_to(value);
			return;
		}
		if ($first_gr_dt_fr.equalsIgnoreCase(name)) {
			first_gr_dt_fr(value);
			return;
		}
		if ($first_gr_dt_to.equalsIgnoreCase(name)) {
			first_gr_dt_to(value);
			return;
		}
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			schd_dt_fr(value);
			return;
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($only_int_flg.equalsIgnoreCase(name)) {
			only_int_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($positive_flg.equalsIgnoreCase(name)) {
			positive_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($stk_schd_flg.equalsIgnoreCase(name)) {
			stk_schd_flg(value);
			return;
		}
		if ($grs_alloc_flg.equalsIgnoreCase(name)) {
			grs_alloc_flg(value);
			return;
		}
		if ($quality_typ_good_flg.equalsIgnoreCase(name)) {
			quality_typ_good_flg(value);
			return;
		}
		if ($quality_typ_dfct_oper_flg.equalsIgnoreCase(name)) {
			quality_typ_dfct_oper_flg(value);
			return;
		}
		if ($quality_typ_dfct_insp_flg.equalsIgnoreCase(name)) {
			quality_typ_dfct_insp_flg(value);
			return;
		}
		if ($quality_typ_sspnd_flg.equalsIgnoreCase(name)) {
			quality_typ_sspnd_flg(value);
			return;
		}
		if ($stk_insp_typ_yet_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_yet_flg(value);
			return;
		}
		if ($stk_insp_typ_ing_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_ing_flg(value);
			return;
		}
		if ($stk_insp_typ_wait_judg_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_wait_judg_flg(value);
			return;
		}
		if ($stk_insp_typ_fin_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_fin_flg(value);
			return;
		}
		if ($stk_id_typ_costk_flg.equalsIgnoreCase(name)) {
			stk_id_typ_costk_flg(value);
			return;
		}
		if ($stk_id_typ_rtn_pre_accpt_flg.equalsIgnoreCase(name)) {
			stk_id_typ_rtn_pre_accpt_flg(value);
			return;
		}
		if ($stk_id_typ_cststk_flg.equalsIgnoreCase(name)) {
			stk_id_typ_cststk_flg(value);
			return;
		}
		if ($stk_id_typ_rnt_rcv_flg.equalsIgnoreCase(name)) {
			stk_id_typ_rnt_rcv_flg(value);
			return;
		}
		if ($stk_id_typ_purc_pre_accpt_flg.equalsIgnoreCase(name)) {
			stk_id_typ_purc_pre_accpt_flg(value);
			return;
		}
		if ($stk_id_typ_accpt_dfct_flg.equalsIgnoreCase(name)) {
			stk_id_typ_accpt_dfct_flg(value);
			return;
		}
		if ($stk_id_typ_ncv_rcv_flg.equalsIgnoreCase(name)) {
			stk_id_typ_ncv_rcv_flg(value);
			return;
		}
		if ($stk_id_typ_onr_prov_flg.equalsIgnoreCase(name)) {
			stk_id_typ_onr_prov_flg(value);
			return;
		}
		if ($plnt_aprv_sts_typ_opn_flg.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_opn_flg(value);
			return;
		}
		if ($plnt_aprv_sts_typ_acpt_flg.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_acpt_flg(value);
			return;
		}
		if ($plnt_aprv_sts_typ_rjct_flg.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_rjct_flg(value);
			return;
		}
		if ($plnt_aprv_sts_typ_non_flg.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_non_flg(value);
			return;
		}
		if ($mrkt_judg_sts_typ_opn_flg.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_opn_flg(value);
			return;
		}
		if ($mrkt_judg_sts_typ_acpt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_acpt_flg(value);
			return;
		}
		if ($mrkt_judg_sts_typ_not_acpt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_not_acpt_flg(value);
			return;
		}
		if ($mrkt_judg_sts_typ_non_flg.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_non_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			site_flg(value);
			return;
		}
		if ($lg_grp_flg.equalsIgnoreCase(name)) {
			lg_grp_flg(value);
			return;
		}
		if ($alloc_grp_flg.equalsIgnoreCase(name)) {
			alloc_grp_flg(value);
			return;
		}
		if ($loc_grp_flg.equalsIgnoreCase(name)) {
			loc_grp_flg(value);
			return;
		}
		if ($gd_flg.equalsIgnoreCase(name)) {
			gd_flg(value);
			return;
		}
		if ($stk_id_flg.equalsIgnoreCase(name)) {
			stk_id_flg(value);
			return;
		}
		if ($fix_no_flg.equalsIgnoreCase(name)) {
			fix_no_flg(value);
			return;
		}
		if ($schd_dt_flg.equalsIgnoreCase(name)) {
			schd_dt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($slo_wg_cd.equalsIgnoreCase(name)) {
			slo_wg_cd(value);
			return;
		}
		if ($slo_lg_grp_cd.equalsIgnoreCase(name)) {
			slo_lg_grp_cd(value);
			return;
		}
		if ($stk_info_srch_typ.equalsIgnoreCase(name)) {
			stk_info_srch_typ(value);
			return;
		}
		if ($stk_info_itm_typ.equalsIgnoreCase(name)) {
			stk_info_itm_typ(value);
			return;
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			stk_info_loc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			vld_dt_to(value);
			return;
		}
		if ($lmt_dt_fr.equalsIgnoreCase(name)) {
			lmt_dt_fr(value);
			return;
		}
		if ($lmt_dt_to.equalsIgnoreCase(name)) {
			lmt_dt_to(value);
			return;
		}
		if ($first_gr_dt_fr.equalsIgnoreCase(name)) {
			first_gr_dt_fr(value);
			return;
		}
		if ($first_gr_dt_to.equalsIgnoreCase(name)) {
			first_gr_dt_to(value);
			return;
		}
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			schd_dt_fr(value);
			return;
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($only_int_flg.equalsIgnoreCase(name)) {
			only_int_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($positive_flg.equalsIgnoreCase(name)) {
			positive_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($stk_schd_flg.equalsIgnoreCase(name)) {
			stk_schd_flg(value);
			return;
		}
		if ($grs_alloc_flg.equalsIgnoreCase(name)) {
			grs_alloc_flg(value);
			return;
		}
		if ($quality_typ_good_flg.equalsIgnoreCase(name)) {
			quality_typ_good_flg(value);
			return;
		}
		if ($quality_typ_dfct_oper_flg.equalsIgnoreCase(name)) {
			quality_typ_dfct_oper_flg(value);
			return;
		}
		if ($quality_typ_dfct_insp_flg.equalsIgnoreCase(name)) {
			quality_typ_dfct_insp_flg(value);
			return;
		}
		if ($quality_typ_sspnd_flg.equalsIgnoreCase(name)) {
			quality_typ_sspnd_flg(value);
			return;
		}
		if ($stk_insp_typ_yet_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_yet_flg(value);
			return;
		}
		if ($stk_insp_typ_ing_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_ing_flg(value);
			return;
		}
		if ($stk_insp_typ_wait_judg_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_wait_judg_flg(value);
			return;
		}
		if ($stk_insp_typ_fin_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_fin_flg(value);
			return;
		}
		if ($stk_id_typ_costk_flg.equalsIgnoreCase(name)) {
			stk_id_typ_costk_flg(value);
			return;
		}
		if ($stk_id_typ_rtn_pre_accpt_flg.equalsIgnoreCase(name)) {
			stk_id_typ_rtn_pre_accpt_flg(value);
			return;
		}
		if ($stk_id_typ_cststk_flg.equalsIgnoreCase(name)) {
			stk_id_typ_cststk_flg(value);
			return;
		}
		if ($stk_id_typ_rnt_rcv_flg.equalsIgnoreCase(name)) {
			stk_id_typ_rnt_rcv_flg(value);
			return;
		}
		if ($stk_id_typ_purc_pre_accpt_flg.equalsIgnoreCase(name)) {
			stk_id_typ_purc_pre_accpt_flg(value);
			return;
		}
		if ($stk_id_typ_accpt_dfct_flg.equalsIgnoreCase(name)) {
			stk_id_typ_accpt_dfct_flg(value);
			return;
		}
		if ($stk_id_typ_ncv_rcv_flg.equalsIgnoreCase(name)) {
			stk_id_typ_ncv_rcv_flg(value);
			return;
		}
		if ($stk_id_typ_onr_prov_flg.equalsIgnoreCase(name)) {
			stk_id_typ_onr_prov_flg(value);
			return;
		}
		if ($plnt_aprv_sts_typ_opn_flg.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_opn_flg(value);
			return;
		}
		if ($plnt_aprv_sts_typ_acpt_flg.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_acpt_flg(value);
			return;
		}
		if ($plnt_aprv_sts_typ_rjct_flg.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_rjct_flg(value);
			return;
		}
		if ($plnt_aprv_sts_typ_non_flg.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_non_flg(value);
			return;
		}
		if ($mrkt_judg_sts_typ_opn_flg.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_opn_flg(value);
			return;
		}
		if ($mrkt_judg_sts_typ_acpt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_acpt_flg(value);
			return;
		}
		if ($mrkt_judg_sts_typ_not_acpt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_not_acpt_flg(value);
			return;
		}
		if ($mrkt_judg_sts_typ_non_flg.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_non_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			site_flg(value);
			return;
		}
		if ($lg_grp_flg.equalsIgnoreCase(name)) {
			lg_grp_flg(value);
			return;
		}
		if ($alloc_grp_flg.equalsIgnoreCase(name)) {
			alloc_grp_flg(value);
			return;
		}
		if ($loc_grp_flg.equalsIgnoreCase(name)) {
			loc_grp_flg(value);
			return;
		}
		if ($gd_flg.equalsIgnoreCase(name)) {
			gd_flg(value);
			return;
		}
		if ($stk_id_flg.equalsIgnoreCase(name)) {
			stk_id_flg(value);
			return;
		}
		if ($fix_no_flg.equalsIgnoreCase(name)) {
			fix_no_flg(value);
			return;
		}
		if ($schd_dt_flg.equalsIgnoreCase(name)) {
			schd_dt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($sno_flg_p.equalsIgnoreCase(name)) {
			return sno_flg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		if ($sno_flg_p.equalsIgnoreCase(name)) {
			sno_flg_p(
				((MCContainerMeta) sno_flg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0440.SnoFlgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
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

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public boolean sno1_null_flg() {
		return sno_p().sno1_null_flg();
	}

	public void sno1_null_flg(boolean value) {
		sno_p().sno1_null_flg(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public boolean sno2_null_flg() {
		return sno_p().sno2_null_flg();
	}

	public void sno2_null_flg(boolean value) {
		sno_p().sno2_null_flg(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public boolean sno3_null_flg() {
		return sno_p().sno3_null_flg();
	}

	public void sno3_null_flg(boolean value) {
		sno_p().sno3_null_flg(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public boolean sno4_null_flg() {
		return sno_p().sno4_null_flg();
	}

	public void sno4_null_flg(boolean value) {
		sno_p().sno4_null_flg(value);
	}

	public String wrk_no() {
		return sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_p().wrk_nm(value);
	}

	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

	public boolean sno1_flg() {
		return sno_flg_p().sno1_flg();
	}

	public void sno1_flg(boolean value) {
		sno_flg_p().sno1_flg(value);
	}

	public boolean sno2_flg() {
		return sno_flg_p().sno2_flg();
	}

	public void sno2_flg(boolean value) {
		sno_flg_p().sno2_flg(value);
	}

	public boolean sno3_flg() {
		return sno_flg_p().sno3_flg();
	}

	public void sno3_flg(boolean value) {
		sno_flg_p().sno3_flg(value);
	}

	public boolean sno4_flg() {
		return sno_flg_p().sno4_flg();
	}

	public void sno4_flg(boolean value) {
		sno_flg_p().sno4_flg(value);
	}

}

