package mcframe.serverMSBE.MSBEL0500;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

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
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
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
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Vendor No. 業者ＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
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
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
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
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
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
	 * Distribution G 物流Ｇ.<p>
	 *
	 */
	public static final String $lg_grp_flg = "lg_grp_flg";
	/**
	 * Gross allocation location G 総量引当場所Ｇ.<p>
	 *
	 */
	public static final String $alloc_grp_flg = "alloc_grp_flg";
	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public static final String $loc_grp_flg = "loc_grp_flg";
	/**
	 * Grading 格付.<p>
	 *
	 */
	public static final String $gd_flg = "gd_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
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
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
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
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
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
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_flg_META = createCommonMeta($lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_flg_META = createCommonMeta($site_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_flg_META = createCommonMeta($lg_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_grp_flg_META = createCommonMeta($alloc_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_grp_flg_META = createCommonMeta($loc_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_flg_META = createCommonMeta($gd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_flg_META = createCommonMeta($stk_id_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_no_flg_META = createCommonMeta($fix_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_dt_flg_META = createCommonMeta($schd_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_wg_cd_META = createCommonMeta($slo_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta slo_lg_grp_cd_META = createCommonMeta($slo_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta stk_info_srch_typ_META = createCommonMeta($stk_info_srch_typ, mcframe.commonMS.meta.MS_META.STK_INFO_SRCH_TYP);
	public static final MCMeta stk_info_itm_typ_META = createCommonMeta($stk_info_itm_typ, mcframe.commonMS.meta.MS_META.STK_INFO_ITM_TYP);
	public static final MCMeta stk_info_loc_typ_META = createCommonMeta($stk_info_loc_typ, mcframe.commonMS.meta.MS_META.STK_INFO_LOC_TYP);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
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
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			bp_lot_no_META,
			sno1_null_flg_META,
			sno1_META,
			sno2_null_flg_META,
			sno2_META,
			sno3_null_flg_META,
			sno3_META,
			sno4_null_flg_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
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
			fix_no_typ_META,
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
			itm_grp_flg1_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_flg2_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_flg3_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_flg4_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_flg5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_flg6_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_flg7_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_flg8_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_flg9_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_flg10_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			wg_flg_META,
			ver_flg_META,
			lot_flg_META,
			loc_flg_META,
			site_flg_META,
			lg_grp_flg_META,
			alloc_grp_flg_META,
			loc_grp_flg_META,
			gd_flg_META,
			sno1_flg_META,
			sno2_flg_META,
			sno3_flg_META,
			sno4_flg_META,
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 0, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 0, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 1, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 1, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 2, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 2, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 3, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 3, $str_ln_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 4, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 4, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 5, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 5, $stk_arrv_bp_nm, value);
	}


	/**
	 * Exclude delivery destination/receiving point inventory 納品先・配送先在庫を除く.<p>
	 *
	 */
	public boolean only_int_flg() {
		return getConstBoolean(offset + 6, $only_int_flg);
	}

	/**
	 * Exclude delivery destination/receiving point inventory 納品先・配送先在庫を除く.<p>
	 *
	 */
	public void only_int_flg(boolean value) {
		setConstBoolean(offset + 6, $only_int_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 7, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 7, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 8, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 8, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 10, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 10, $wg_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 11, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 11, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 12, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 12, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 13, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 13, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 14, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 14, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 15, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 15, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 16, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 16, $loc_grp_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 17, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 17, $itm_typ, value);
	}


	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 18, $itm_typ_d_cd);
	}

	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 18, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 19, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 19, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 20, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 20, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 21, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 21, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 22, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 22, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 23, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 23, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 24, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 24, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 25, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 25, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 26, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 26, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 27, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 27, $sublot_no, value);
	}


	/**
	 * Vendor No. 業者ＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 28, $bp_lot_no);
	}

	/**
	 * Vendor No. 業者ＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 28, $bp_lot_no, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 29, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 29, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 30, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 30, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 31, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 31, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 32, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 32, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 33, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 33, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 34, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 34, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 35, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 35, $sno4_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 36, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 36, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 37, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 37, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 38, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 38, $wrk_nm, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 39, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 39, $vld_dt_fr, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 40, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 40, $vld_dt_to, value);
	}


	/**
	 * Usage expiration date FROM 使用期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate lmt_dt_fr() {
		return getConstDate(offset + 41, $lmt_dt_fr);
	}

	/**
	 * Usage expiration date FROM 使用期限ＦＲＯＭ.<p>
	 *
	 */
	public void lmt_dt_fr(MCDate value) {
		setConstDate(offset + 41, $lmt_dt_fr, value);
	}


	/**
	 * Usage expiration date TO 使用期限ＴＯ.<p>
	 *
	 */
	public MCDate lmt_dt_to() {
		return getConstDate(offset + 42, $lmt_dt_to);
	}

	/**
	 * Usage expiration date TO 使用期限ＴＯ.<p>
	 *
	 */
	public void lmt_dt_to(MCDate value) {
		setConstDate(offset + 42, $lmt_dt_to, value);
	}


	/**
	 * Include period not set 期限未設定含む.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 43, $unreg_lmt_flg);
	}

	/**
	 * Include period not set 期限未設定含む.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 43, $unreg_lmt_flg, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 44, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 44, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 45, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 45, $gd_nm, value);
	}


	/**
	 * Allocatable qty.: positive only 引当可能数量：正数のみ.<p>
	 *
	 */
	public boolean positive_flg() {
		return getConstBoolean(offset + 46, $positive_flg);
	}

	/**
	 * Allocatable qty.: positive only 引当可能数量：正数のみ.<p>
	 *
	 */
	public void positive_flg(boolean value) {
		setConstBoolean(offset + 46, $positive_flg, value);
	}


	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public boolean except_alloc_wait_flg() {
		return getConstBoolean(offset + 47, $except_alloc_wait_flg);
	}

	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public void except_alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 47, $except_alloc_wait_flg, value);
	}


	/**
	 * Include without inventory 在庫なし含む.<p>
	 *
	 */
	public boolean stk_schd_flg() {
		return getConstBoolean(offset + 48, $stk_schd_flg);
	}

	/**
	 * Include without inventory 在庫なし含む.<p>
	 *
	 */
	public void stk_schd_flg(boolean value) {
		setConstBoolean(offset + 48, $stk_schd_flg, value);
	}


	/**
	 * Exclude GR schedule for gross allocation 総量引当対象外の入庫予定除く.<p>
	 *
	 */
	public boolean grs_alloc_flg() {
		return getConstBoolean(offset + 49, $grs_alloc_flg);
	}

	/**
	 * Exclude GR schedule for gross allocation 総量引当対象外の入庫予定除く.<p>
	 *
	 */
	public void grs_alloc_flg(boolean value) {
		setConstBoolean(offset + 49, $grs_alloc_flg, value);
	}


	/**
	 * Conforming item 良品.<p>
	 *
	 */
	public boolean quality_typ_good_flg() {
		return getConstBoolean(offset + 50, $quality_typ_good_flg);
	}

	/**
	 * Conforming item 良品.<p>
	 *
	 */
	public void quality_typ_good_flg(boolean value) {
		setConstBoolean(offset + 50, $quality_typ_good_flg, value);
	}


	/**
	 * Operation defective 工程不良品.<p>
	 *
	 */
	public boolean quality_typ_dfct_oper_flg() {
		return getConstBoolean(offset + 51, $quality_typ_dfct_oper_flg);
	}

	/**
	 * Operation defective 工程不良品.<p>
	 *
	 */
	public void quality_typ_dfct_oper_flg(boolean value) {
		setConstBoolean(offset + 51, $quality_typ_dfct_oper_flg, value);
	}


	/**
	 * Inspection defective 検査不良品.<p>
	 *
	 */
	public boolean quality_typ_dfct_insp_flg() {
		return getConstBoolean(offset + 52, $quality_typ_dfct_insp_flg);
	}

	/**
	 * Inspection defective 検査不良品.<p>
	 *
	 */
	public void quality_typ_dfct_insp_flg(boolean value) {
		setConstBoolean(offset + 52, $quality_typ_dfct_insp_flg, value);
	}


	/**
	 * Pending 保留.<p>
	 *
	 */
	public boolean quality_typ_sspnd_flg() {
		return getConstBoolean(offset + 53, $quality_typ_sspnd_flg);
	}

	/**
	 * Pending 保留.<p>
	 *
	 */
	public void quality_typ_sspnd_flg(boolean value) {
		setConstBoolean(offset + 53, $quality_typ_sspnd_flg, value);
	}


	/**
	 * Wait for inspection 検査待.<p>
	 *
	 */
	public boolean stk_insp_typ_yet_flg() {
		return getConstBoolean(offset + 54, $stk_insp_typ_yet_flg);
	}

	/**
	 * Wait for inspection 検査待.<p>
	 *
	 */
	public void stk_insp_typ_yet_flg(boolean value) {
		setConstBoolean(offset + 54, $stk_insp_typ_yet_flg, value);
	}


	/**
	 * Inspecting 検査中.<p>
	 *
	 */
	public boolean stk_insp_typ_ing_flg() {
		return getConstBoolean(offset + 55, $stk_insp_typ_ing_flg);
	}

	/**
	 * Inspecting 検査中.<p>
	 *
	 */
	public void stk_insp_typ_ing_flg(boolean value) {
		setConstBoolean(offset + 55, $stk_insp_typ_ing_flg, value);
	}


	/**
	 * Wait for decision 判定待.<p>
	 *
	 */
	public boolean stk_insp_typ_wait_judg_flg() {
		return getConstBoolean(offset + 56, $stk_insp_typ_wait_judg_flg);
	}

	/**
	 * Wait for decision 判定待.<p>
	 *
	 */
	public void stk_insp_typ_wait_judg_flg(boolean value) {
		setConstBoolean(offset + 56, $stk_insp_typ_wait_judg_flg, value);
	}


	/**
	 * Inspected 検査済.<p>
	 *
	 */
	public boolean stk_insp_typ_fin_flg() {
		return getConstBoolean(offset + 57, $stk_insp_typ_fin_flg);
	}

	/**
	 * Inspected 検査済.<p>
	 *
	 */
	public void stk_insp_typ_fin_flg(boolean value) {
		setConstBoolean(offset + 57, $stk_insp_typ_fin_flg, value);
	}


	/**
	 * Internal inventory 自社在庫.<p>
	 *
	 */
	public boolean stk_id_typ_costk_flg() {
		return getConstBoolean(offset + 58, $stk_id_typ_costk_flg);
	}

	/**
	 * Internal inventory 自社在庫.<p>
	 *
	 */
	public void stk_id_typ_costk_flg(boolean value) {
		setConstBoolean(offset + 58, $stk_id_typ_costk_flg, value);
	}


	/**
	 * Before return acceptance 返品検収前.<p>
	 *
	 */
	public boolean stk_id_typ_rtn_pre_accpt_flg() {
		return getConstBoolean(offset + 59, $stk_id_typ_rtn_pre_accpt_flg);
	}

	/**
	 * Before return acceptance 返品検収前.<p>
	 *
	 */
	public void stk_id_typ_rtn_pre_accpt_flg(boolean value) {
		setConstBoolean(offset + 59, $stk_id_typ_rtn_pre_accpt_flg, value);
	}


	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public boolean stk_id_typ_cststk_flg() {
		return getConstBoolean(offset + 60, $stk_id_typ_cststk_flg);
	}

	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public void stk_id_typ_cststk_flg(boolean value) {
		setConstBoolean(offset + 60, $stk_id_typ_cststk_flg, value);
	}


	/**
	 * VMI VMI.<p>
	 *
	 */
	public boolean stk_id_typ_rnt_rcv_flg() {
		return getConstBoolean(offset + 61, $stk_id_typ_rnt_rcv_flg);
	}

	/**
	 * VMI VMI.<p>
	 *
	 */
	public void stk_id_typ_rnt_rcv_flg(boolean value) {
		setConstBoolean(offset + 61, $stk_id_typ_rnt_rcv_flg, value);
	}


	/**
	 * Before purchase acceptance 仕入検収前.<p>
	 *
	 */
	public boolean stk_id_typ_purc_pre_accpt_flg() {
		return getConstBoolean(offset + 62, $stk_id_typ_purc_pre_accpt_flg);
	}

	/**
	 * Before purchase acceptance 仕入検収前.<p>
	 *
	 */
	public void stk_id_typ_purc_pre_accpt_flg(boolean value) {
		setConstBoolean(offset + 62, $stk_id_typ_purc_pre_accpt_flg, value);
	}


	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public boolean stk_id_typ_accpt_dfct_flg() {
		return getConstBoolean(offset + 63, $stk_id_typ_accpt_dfct_flg);
	}

	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public void stk_id_typ_accpt_dfct_flg(boolean value) {
		setConstBoolean(offset + 63, $stk_id_typ_accpt_dfct_flg, value);
	}


	/**
	 * Receiving free of charge 無償受給.<p>
	 *
	 */
	public boolean stk_id_typ_ncv_rcv_flg() {
		return getConstBoolean(offset + 64, $stk_id_typ_ncv_rcv_flg);
	}

	/**
	 * Receiving free of charge 無償受給.<p>
	 *
	 */
	public void stk_id_typ_ncv_rcv_flg(boolean value) {
		setConstBoolean(offset + 64, $stk_id_typ_ncv_rcv_flg, value);
	}


	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public boolean stk_id_typ_onr_prov_flg() {
		return getConstBoolean(offset + 65, $stk_id_typ_onr_prov_flg);
	}

	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public void stk_id_typ_onr_prov_flg(boolean value) {
		setConstBoolean(offset + 65, $stk_id_typ_onr_prov_flg, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 66, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 66, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 67, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 67, $stk_bp_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 68, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 68, $asst_typ, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 69, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 69, $fix_no_typ, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 70, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 70, $fix_no, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 71, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 71, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 72, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 72, $pack_unit_nm, value);
	}


	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_gr_dt_fr() {
		return getConstDate(offset + 73, $first_gr_dt_fr);
	}

	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public void first_gr_dt_fr(MCDate value) {
		setConstDate(offset + 73, $first_gr_dt_fr, value);
	}


	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public MCDate first_gr_dt_to() {
		return getConstDate(offset + 74, $first_gr_dt_to);
	}

	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public void first_gr_dt_to(MCDate value) {
		setConstDate(offset + 74, $first_gr_dt_to, value);
	}


	/**
	 * Scheduled date FROM 予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate schd_dt_fr() {
		return getConstDate(offset + 75, $schd_dt_fr);
	}

	/**
	 * Scheduled date FROM 予定日ＦＲＯＭ.<p>
	 *
	 */
	public void schd_dt_fr(MCDate value) {
		setConstDate(offset + 75, $schd_dt_fr, value);
	}


	/**
	 * Scheduled date TO 予定日ＴＯ.<p>
	 *
	 */
	public MCDate schd_dt_to() {
		return getConstDate(offset + 76, $schd_dt_to);
	}

	/**
	 * Scheduled date TO 予定日ＴＯ.<p>
	 *
	 */
	public void schd_dt_to(MCDate value) {
		setConstDate(offset + 76, $schd_dt_to, value);
	}


	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public boolean plnt_aprv_sts_typ_opn_flg() {
		return getConstBoolean(offset + 77, $plnt_aprv_sts_typ_opn_flg);
	}

	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_opn_flg(boolean value) {
		setConstBoolean(offset + 77, $plnt_aprv_sts_typ_opn_flg, value);
	}


	/**
	 * Approved 承認済.<p>
	 *
	 */
	public boolean plnt_aprv_sts_typ_acpt_flg() {
		return getConstBoolean(offset + 78, $plnt_aprv_sts_typ_acpt_flg);
	}

	/**
	 * Approved 承認済.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_acpt_flg(boolean value) {
		setConstBoolean(offset + 78, $plnt_aprv_sts_typ_acpt_flg, value);
	}


	/**
	 * Reject 却下.<p>
	 *
	 */
	public boolean plnt_aprv_sts_typ_rjct_flg() {
		return getConstBoolean(offset + 79, $plnt_aprv_sts_typ_rjct_flg);
	}

	/**
	 * Reject 却下.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_rjct_flg(boolean value) {
		setConstBoolean(offset + 79, $plnt_aprv_sts_typ_rjct_flg, value);
	}


	/**
	 * Not set 未設定.<p>
	 *
	 */
	public boolean plnt_aprv_sts_typ_non_flg() {
		return getConstBoolean(offset + 80, $plnt_aprv_sts_typ_non_flg);
	}

	/**
	 * Not set 未設定.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_non_flg(boolean value) {
		setConstBoolean(offset + 80, $plnt_aprv_sts_typ_non_flg, value);
	}


	/**
	 * Undecided 未判定.<p>
	 *
	 */
	public boolean mrkt_judg_sts_typ_opn_flg() {
		return getConstBoolean(offset + 81, $mrkt_judg_sts_typ_opn_flg);
	}

	/**
	 * Undecided 未判定.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_opn_flg(boolean value) {
		setConstBoolean(offset + 81, $mrkt_judg_sts_typ_opn_flg, value);
	}


	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public boolean mrkt_judg_sts_typ_acpt_flg() {
		return getConstBoolean(offset + 82, $mrkt_judg_sts_typ_acpt_flg);
	}

	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_acpt_flg(boolean value) {
		setConstBoolean(offset + 82, $mrkt_judg_sts_typ_acpt_flg, value);
	}


	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public boolean mrkt_judg_sts_typ_not_acpt_flg() {
		return getConstBoolean(offset + 83, $mrkt_judg_sts_typ_not_acpt_flg);
	}

	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_not_acpt_flg(boolean value) {
		setConstBoolean(offset + 83, $mrkt_judg_sts_typ_not_acpt_flg, value);
	}


	/**
	 * Not set 未設定.<p>
	 *
	 */
	public boolean mrkt_judg_sts_typ_non_flg() {
		return getConstBoolean(offset + 84, $mrkt_judg_sts_typ_non_flg);
	}

	/**
	 * Not set 未設定.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_non_flg(boolean value) {
		setConstBoolean(offset + 84, $mrkt_judg_sts_typ_non_flg, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 85, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 85, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 86, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 86, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 87, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 87, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 88, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 88, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 89, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 89, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 90, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 90, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 91, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 91, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 92, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 92, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 93, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 93, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 94, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 94, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 95, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 95, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 96, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 96, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 97, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 97, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 98, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 98, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 99, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 99, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 100, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 100, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 101, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 101, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 102, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 102, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 103, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 103, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 104, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 104, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 105, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 105, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 106, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 106, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 107, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 107, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 108, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 108, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 109, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 109, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 110, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 110, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 111, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 111, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 112, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 112, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 113, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 113, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 114, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 114, $itm_grp_nm10, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 115, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 115, $wg_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 116, $ver_flg);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 116, $ver_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_flg() {
		return getConstBoolean(offset + 117, $lot_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_flg(boolean value) {
		setConstBoolean(offset + 117, $lot_flg, value);
	}


	/**
	 * Location 場所.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 118, $loc_flg);
	}

	/**
	 * Location 場所.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 118, $loc_flg, value);
	}


	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public boolean site_flg() {
		return getConstBoolean(offset + 119, $site_flg);
	}

	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public void site_flg(boolean value) {
		setConstBoolean(offset + 119, $site_flg, value);
	}


	/**
	 * Distribution G 物流Ｇ.<p>
	 *
	 */
	public boolean lg_grp_flg() {
		return getConstBoolean(offset + 120, $lg_grp_flg);
	}

	/**
	 * Distribution G 物流Ｇ.<p>
	 *
	 */
	public void lg_grp_flg(boolean value) {
		setConstBoolean(offset + 120, $lg_grp_flg, value);
	}


	/**
	 * Gross allocation location G 総量引当場所Ｇ.<p>
	 *
	 */
	public boolean alloc_grp_flg() {
		return getConstBoolean(offset + 121, $alloc_grp_flg);
	}

	/**
	 * Gross allocation location G 総量引当場所Ｇ.<p>
	 *
	 */
	public void alloc_grp_flg(boolean value) {
		setConstBoolean(offset + 121, $alloc_grp_flg, value);
	}


	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public boolean loc_grp_flg() {
		return getConstBoolean(offset + 122, $loc_grp_flg);
	}

	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public void loc_grp_flg(boolean value) {
		setConstBoolean(offset + 122, $loc_grp_flg, value);
	}


	/**
	 * Grading 格付.<p>
	 *
	 */
	public boolean gd_flg() {
		return getConstBoolean(offset + 123, $gd_flg);
	}

	/**
	 * Grading 格付.<p>
	 *
	 */
	public void gd_flg(boolean value) {
		setConstBoolean(offset + 123, $gd_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 124, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 124, $sno1_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 125, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 125, $sno2_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 126, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 126, $sno3_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 127, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 127, $sno4_flg, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public boolean stk_id_flg() {
		return getConstBoolean(offset + 128, $stk_id_flg);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_flg(boolean value) {
		setConstBoolean(offset + 128, $stk_id_flg, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public boolean fix_no_flg() {
		return getConstBoolean(offset + 129, $fix_no_flg);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_flg(boolean value) {
		setConstBoolean(offset + 129, $fix_no_flg, value);
	}


	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public boolean schd_dt_flg() {
		return getConstBoolean(offset + 130, $schd_dt_flg);
	}

	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public void schd_dt_flg(boolean value) {
		setConstBoolean(offset + 130, $schd_dt_flg, value);
	}


	/**
	 * WG cd. (For order) ワーキンググループＣＤ（受注用）.<p>
	 *
	 */
	public String slo_wg_cd() {
		return getConstString(offset + 131, $slo_wg_cd);
	}

	/**
	 * WG cd. (For order) ワーキンググループＣＤ（受注用）.<p>
	 *
	 */
	public void slo_wg_cd(String value) {
		setConstString(offset + 131, $slo_wg_cd, value);
	}


	/**
	 * Distribution group cd. (For sales order) 物流グループＣＤ（受注用）.<p>
	 *
	 */
	public String slo_lg_grp_cd() {
		return getConstString(offset + 132, $slo_lg_grp_cd);
	}

	/**
	 * Distribution group cd. (For sales order) 物流グループＣＤ（受注用）.<p>
	 *
	 */
	public void slo_lg_grp_cd(String value) {
		setConstString(offset + 132, $slo_lg_grp_cd, value);
	}


	/**
	 * Inventory info. search type 在庫情報検索区分.<p>
	 *
	 */
	public String stk_info_srch_typ() {
		return getConstString(offset + 133, $stk_info_srch_typ);
	}

	/**
	 * Inventory info. search type 在庫情報検索区分.<p>
	 *
	 */
	public void stk_info_srch_typ(String value) {
		setConstString(offset + 133, $stk_info_srch_typ, value);
	}


	/**
	 * Inventory info. item type 在庫情報品目区分.<p>
	 *
	 */
	public String stk_info_itm_typ() {
		return getConstString(offset + 134, $stk_info_itm_typ);
	}

	/**
	 * Inventory info. item type 在庫情報品目区分.<p>
	 *
	 */
	public void stk_info_itm_typ(String value) {
		setConstString(offset + 134, $stk_info_itm_typ, value);
	}


	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public String stk_info_loc_typ() {
		return getConstString(offset + 135, $stk_info_loc_typ);
	}

	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public void stk_info_loc_typ(String value) {
		setConstString(offset + 135, $stk_info_loc_typ, value);
	}


	public String getString(String name) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
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
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
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
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
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
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
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
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
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
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
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
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
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
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
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
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
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



}

