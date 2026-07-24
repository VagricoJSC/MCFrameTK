package mcframe.serverMSBA.MSBAL0040;

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
 * ブロック"Srch02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_RsltR_MC_A extends MCConstRow {

	/**
	 * Demand No. (Matching destination) 需要ＮＯ(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_no = "to_dmnd_no";
	/**
	 * Demand date (Matching destination) 需要日(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_dt = "to_dmnd_dt";
	/**
	 * Demand period start date (Matching destination) 需要期間開始日(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_st_dt = "to_dmnd_st_dt";
	/**
	 * Demand period end date (Matching destination) 需要期間終了日(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_end_dt = "to_dmnd_end_dt";
	/**
	 * Delivery schedule period start date (Matching destination) 納品予定期間開始日(消込先).<p>
	 *
	 */
	public static final String $to_dlv_schd_st_dt = "to_dlv_schd_st_dt";
	/**
	 * Delivery schedule period end date (Matching destination) 納品予定期間終了日(消込先).<p>
	 *
	 */
	public static final String $to_dlv_schd_end_dt = "to_dlv_schd_end_dt";
	/**
	 * Demand period type (Matching destination) 需要期間区分(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_period_typ = "to_dmnd_period_typ";
	/**
	 * Demand period type name (Matching destination) 需要期間区分名(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_period_typ_nm = "to_dmnd_period_typ_nm";
	/**
	 * Demand type (Matching destination) 需要区分(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_typ = "to_dmnd_typ";
	/**
	 * Demand type name (Matching destination) 需要区分名(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_typ_nm = "to_dmnd_typ_nm";
	/**
	 * Demand No. (Matching source) 需要ＮＯ(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_no = "fr_dmnd_no";
	/**
	 * Demand date (Matching source) 需要日(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_dt = "fr_dmnd_dt";
	/**
	 * Demand period start date (Matching source) 需要期間開始日(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_st_dt = "fr_dmnd_st_dt";
	/**
	 * Demand period end date (Matching source) 需要期間終了日(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_end_dt = "fr_dmnd_end_dt";
	/**
	 * Delivery schedule period start date (Matching source) 納品予定期間開始日(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_schd_st_dt = "fr_dlv_schd_st_dt";
	/**
	 * Delivery schedule period end date (Matching source) 納品予定期間終了日(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_schd_end_dt = "fr_dlv_schd_end_dt";
	/**
	 * Demand period type (Matching source) 需要期間区分(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_period_typ = "fr_dmnd_period_typ";
	/**
	 * Demand period type name (Matching source) 需要期間区分名(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_period_typ_nm = "fr_dmnd_period_typ_nm";
	/**
	 * Demand type (Matching source) 需要区分(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_typ = "fr_dmnd_typ";
	/**
	 * Demand type name (Matching source) 需要区分名(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_typ_nm = "fr_dmnd_typ_nm";
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
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Entry qty. (Matching destination) 登録数量(消込先).<p>
	 *
	 */
	public static final String $to_input_qty = "to_input_qty";
	/**
	 * Demand qty. (Matching destination) 需要数量(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_qty = "to_dmnd_qty";
	/**
	 * Matching qty. (Matching destination) 消込数量(消込先).<p>
	 *
	 */
	public static final String $to_rec_qty = "to_rec_qty";
	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public static final String $fr_input_qty = "fr_input_qty";
	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_qty = "fr_dmnd_qty";
	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public static final String $fr_rec_qty = "fr_rec_qty";
	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_loc_cd = "dmnd_loc_cd";
	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public static final String $dmnd_loc_nm = "dmnd_loc_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_loc_grp_cd = "dmnd_loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $dmnd_loc_grp_nm = "dmnd_loc_grp_nm";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_lg_grp_cd = "dmnd_lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $dmnd_lg_grp_nm = "dmnd_lg_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_wg_cd = "dmnd_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $dmnd_wg_nm = "dmnd_wg_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_site_cd = "dmnd_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $dmnd_site_nm = "dmnd_site_nm";
	/**
	 * SEIBAN No. 1 (Matching destination) 手配ＮＯ１(消込先).<p>
	 *
	 */
	public static final String $to_sno1 = "to_sno1";
	/**
	 * SEIBAN No. 2 (Matching destination) 手配ＮＯ２(消込先).<p>
	 *
	 */
	public static final String $to_sno2 = "to_sno2";
	/**
	 * SEIBAN No. 3 (Matching destination) 手配ＮＯ３(消込先).<p>
	 *
	 */
	public static final String $to_sno3 = "to_sno3";
	/**
	 * SEIBAN No. 4 (Matching destination) 手配ＮＯ４(消込先).<p>
	 *
	 */
	public static final String $to_sno4 = "to_sno4";
	/**
	 * Sales project No. (Matching destination) 案件ＮＯ(消込先).<p>
	 *
	 */
	public static final String $to_wrk_no = "to_wrk_no";
	/**
	 * Sales project name (Matching destination) 案件名(消込先).<p>
	 *
	 */
	public static final String $to_wrk_nm = "to_wrk_nm";
	/**
	 * SEIBAN No. 1 (Matching source) 手配ＮＯ１(消込元).<p>
	 *
	 */
	public static final String $fr_sno1 = "fr_sno1";
	/**
	 * SEIBAN No. 2 (Matching source) 手配ＮＯ２(消込元).<p>
	 *
	 */
	public static final String $fr_sno2 = "fr_sno2";
	/**
	 * SEIBAN No. 3 (Matching source) 手配ＮＯ３(消込元).<p>
	 *
	 */
	public static final String $fr_sno3 = "fr_sno3";
	/**
	 * SEIBAN No. 4 (Matching source) 手配ＮＯ４(消込元).<p>
	 *
	 */
	public static final String $fr_sno4 = "fr_sno4";
	/**
	 * Sales project No. (Matching source) 案件ＮＯ(消込元).<p>
	 *
	 */
	public static final String $fr_wrk_no = "fr_wrk_no";
	/**
	 * Sales project name (Matching source) 案件名(消込元).<p>
	 *
	 */
	public static final String $fr_wrk_nm = "fr_wrk_nm";
	/**
	 * PIC cd. (Matching destination) 担当者ＣＤ(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_usr_cd = "to_dmnd_usr_cd";
	/**
	 * PIC name (Matching destination) 担当者名(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_usr_nm = "to_dmnd_usr_nm";
	/**
	 * Demand source dept. cd. (Matching destination) 需要元部門ＣＤ(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_dpt_cd = "to_dmnd_dpt_cd";
	/**
	 * Demand source dept. name (Matching destination) 需要元部門名(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_dpt_nm = "to_dmnd_dpt_nm";
	/**
	 * PIC cd. (Matching source) 担当者ＣＤ(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_usr_cd = "fr_dmnd_usr_cd";
	/**
	 * PIC name (Matching source) 担当者名(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_usr_nm = "fr_dmnd_usr_nm";
	/**
	 * Demand source dept. cd. (Matching source) 需要元部門ＣＤ(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_dpt_cd = "fr_dmnd_dpt_cd";
	/**
	 * Demand source dept. name (Matching source) 需要元部門名(消込元).<p>
	 *
	 */
	public static final String $fr_dmnd_dpt_nm = "fr_dmnd_dpt_nm";
	/**
	 * Delivery destination cd. (Matching destination) 納品先ＣＤ(消込先).<p>
	 *
	 */
	public static final String $to_dlv_cd = "to_dlv_cd";
	/**
	 * Delivery destination name (Matching destination) 納品先名(消込先).<p>
	 *
	 */
	public static final String $to_dlv_nm = "to_dlv_nm";
	/**
	 * Customer cd. (Matching destination) 得意先ＣＤ(消込先).<p>
	 *
	 */
	public static final String $to_cst_cd = "to_cst_cd";
	/**
	 * Customer name (Matching destination) 得意先名(消込先).<p>
	 *
	 */
	public static final String $to_cst_nm = "to_cst_nm";
	/**
	 * Delivery destination cd. (Matching source) 納品先ＣＤ(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_cd = "fr_dlv_cd";
	/**
	 * Delivery destination name (Matching source) 納品先名(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_nm = "fr_dlv_nm";
	/**
	 * Customer cd. (Matching source) 得意先ＣＤ(消込元).<p>
	 *
	 */
	public static final String $fr_cst_cd = "fr_cst_cd";
	/**
	 * Customer name (Matching source) 得意先名(消込元).<p>
	 *
	 */
	public static final String $fr_cst_nm = "fr_cst_nm";
	/**
	 * Plan monthly (Matching destination) 計画月度(消込先).<p>
	 *
	 */
	public static final String $to_ym = "to_ym";
	/**
	 * Sales plan version (Matching destination) 販売計画バージョン(消込先).<p>
	 *
	 */
	public static final String $to_spln_vers = "to_spln_vers";
	/**
	 * Plan item cd. (Matching destination) 計画品目ＣＤ(消込先).<p>
	 *
	 */
	public static final String $to_spln_itm_cd = "to_spln_itm_cd";
	/**
	 * Plan item name (Matching destination) 計画品名(消込先).<p>
	 *
	 */
	public static final String $to_spln_itm_nm = "to_spln_itm_nm";
	/**
	 * Currency cd. (Matching destination) 通貨ＣＤ(消込先).<p>
	 *
	 */
	public static final String $to_cur_cd = "to_cur_cd";
	/**
	 * Currency name (Matching destination) 通貨名(消込先).<p>
	 *
	 */
	public static final String $to_cur_nm = "to_cur_nm";
	/**
	 * Sales forecast No. (Matching destination) 顧客期間内示ＮＯ(消込先).<p>
	 *
	 */
	public static final String $to_cst_frcst_no = "to_cst_frcst_no";
	/**
	 * Sales forecast details No. (Matching destination) 顧客期間内示明細ＮＯ(消込先).<p>
	 *
	 */
	public static final String $to_cst_frcst_d_no = "to_cst_frcst_d_no";
	/**
	 * Sales order No. (Matching destination) 受注ＮＯ(消込先).<p>
	 *
	 */
	public static final String $to_slo_no = "to_slo_no";
	/**
	 * Sales order details No. (Matching destination) 受注明細ＮＯ(消込先).<p>
	 *
	 */
	public static final String $to_slo_d_no = "to_slo_d_no";
	/**
	 * Plan monthly (Matching source) 計画月度(消込元).<p>
	 *
	 */
	public static final String $fr_ym = "fr_ym";
	/**
	 * Sales plan version (Matching source) 販売計画バージョン(消込元).<p>
	 *
	 */
	public static final String $fr_spln_vers = "fr_spln_vers";
	/**
	 * Plan item cd. (Matching source) 計画品目ＣＤ(消込元).<p>
	 *
	 */
	public static final String $fr_spln_itm_cd = "fr_spln_itm_cd";
	/**
	 * Plan item name (Matching source) 計画品名(消込元).<p>
	 *
	 */
	public static final String $fr_spln_itm_nm = "fr_spln_itm_nm";
	/**
	 * Currency cd. (Matching source) 通貨ＣＤ(消込元).<p>
	 *
	 */
	public static final String $fr_cur_cd = "fr_cur_cd";
	/**
	 * Currency name (Matching source) 通貨名(消込元).<p>
	 *
	 */
	public static final String $fr_cur_nm = "fr_cur_nm";
	/**
	 * Sales forecast No. (Matching source) 顧客期間内示ＮＯ(消込元).<p>
	 *
	 */
	public static final String $fr_cst_frcst_no = "fr_cst_frcst_no";
	/**
	 * Sales forecast details No. (Matching source) 顧客期間内示明細ＮＯ(消込元).<p>
	 *
	 */
	public static final String $fr_cst_frcst_d_no = "fr_cst_frcst_d_no";
	/**
	 * Sales order No. (Matching source) 受注ＮＯ(消込元).<p>
	 *
	 */
	public static final String $fr_slo_no = "fr_slo_no";
	/**
	 * Sales order details No. (Matching source) 受注明細ＮＯ(消込元).<p>
	 *
	 */
	public static final String $fr_slo_d_no = "fr_slo_d_no";
	/**
	 * Internal remarks (Matching destination) 内部備考(消込先).<p>
	 *
	 */
	public static final String $to_intr_rmrks = "to_intr_rmrks";
	/**
	 * Spare 1 (Matching destination) 予備１(消込先).<p>
	 *
	 */
	public static final String $to_sub_char1 = "to_sub_char1";
	/**
	 * Spare 2 (Matching destination) 予備２(消込先).<p>
	 *
	 */
	public static final String $to_sub_char2 = "to_sub_char2";
	/**
	 * Spare 3 (Matching destination) 予備３(消込先).<p>
	 *
	 */
	public static final String $to_sub_char3 = "to_sub_char3";
	/**
	 * Internal remarks (Matching source) 内部備考(消込元).<p>
	 *
	 */
	public static final String $fr_intr_rmrks = "fr_intr_rmrks";
	/**
	 * Spare 1 (Matching source) 予備１(消込元).<p>
	 *
	 */
	public static final String $fr_sub_char1 = "fr_sub_char1";
	/**
	 * Spare 2 (Matching source) 予備２(消込元).<p>
	 *
	 */
	public static final String $fr_sub_char2 = "fr_sub_char2";
	/**
	 * Spare 3 (Matching source) 予備３(消込元).<p>
	 *
	 */
	public static final String $fr_sub_char3 = "fr_sub_char3";
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
	 * Delivery destination classification cd. 1 (Matching destination) 納品先分類ＣＤ１(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd1 = "to_dlv_grp_cd1";
	/**
	 * Delivery destination classification name 1 (Matching destination) 納品先分類名１(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm1 = "to_dlv_grp_nm1";
	/**
	 * Delivery destination classification cd. 2 (Matching destination) 納品先分類ＣＤ２(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd2 = "to_dlv_grp_cd2";
	/**
	 * Delivery destination classification name 2 (Matching destination) 納品先分類名２(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm2 = "to_dlv_grp_nm2";
	/**
	 * Delivery destination classification cd. 3 (Matching destination) 納品先分類ＣＤ３(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd3 = "to_dlv_grp_cd3";
	/**
	 * Delivery destination classification name 3 (Matching destination) 納品先分類名３(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm3 = "to_dlv_grp_nm3";
	/**
	 * Delivery destination classification cd. 4 (Matching destination) 納品先分類ＣＤ４(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd4 = "to_dlv_grp_cd4";
	/**
	 * Delivery destination classification name 4 (Matching destination) 納品先分類名４(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm4 = "to_dlv_grp_nm4";
	/**
	 * Delivery destination classification cd. 5 (Matching destination) 納品先分類ＣＤ５(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd5 = "to_dlv_grp_cd5";
	/**
	 * Delivery destination classification name 5 (Matching destination) 納品先分類名５(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm5 = "to_dlv_grp_nm5";
	/**
	 * Delivery destination classification cd. 6 (Matching destination) 納品先分類ＣＤ６(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd6 = "to_dlv_grp_cd6";
	/**
	 * Delivery destination classification name 6 (Matching destination) 納品先分類名６(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm6 = "to_dlv_grp_nm6";
	/**
	 * Delivery destination classification cd. 7 (Matching destination) 納品先分類ＣＤ７(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd7 = "to_dlv_grp_cd7";
	/**
	 * Delivery destination classification name 7 (Matching destination) 納品先分類名７(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm7 = "to_dlv_grp_nm7";
	/**
	 * Delivery destination classification cd. 8 (Matching destination) 納品先分類ＣＤ８(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd8 = "to_dlv_grp_cd8";
	/**
	 * Delivery destination classification name 8 (Matching destination) 納品先分類名８(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm8 = "to_dlv_grp_nm8";
	/**
	 * Delivery destination classification cd. 9 (Matching destination) 納品先分類ＣＤ９(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd9 = "to_dlv_grp_cd9";
	/**
	 * Delivery destination classification name 9 (Matching destination) 納品先分類名９(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm9 = "to_dlv_grp_nm9";
	/**
	 * Delivery destination classification cd. 10 (Matching destination) 納品先分類ＣＤ１０(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_cd10 = "to_dlv_grp_cd10";
	/**
	 * Delivery destination classification name 10 (Matching destination) 納品先分類名１０(消込先).<p>
	 *
	 */
	public static final String $to_dlv_grp_nm10 = "to_dlv_grp_nm10";
	/**
	 * Delivery destination classification cd. 1 (Matching source) 納品先分類ＣＤ１(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd1 = "fr_dlv_grp_cd1";
	/**
	 * Delivery destination classification name 1 (Matching source) 納品先分類名１(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm1 = "fr_dlv_grp_nm1";
	/**
	 * Delivery destination classification cd. 2 (Matching source) 納品先分類ＣＤ２(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd2 = "fr_dlv_grp_cd2";
	/**
	 * Delivery destination classification name 2 (Matching source) 納品先分類名２(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm2 = "fr_dlv_grp_nm2";
	/**
	 * Delivery destination classification cd. 3 (Matching source) 納品先分類ＣＤ３(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd3 = "fr_dlv_grp_cd3";
	/**
	 * Delivery destination classification name 3 (Matching source) 納品先分類名３(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm3 = "fr_dlv_grp_nm3";
	/**
	 * Delivery destination classification cd. 4 (Matching source) 納品先分類ＣＤ４(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd4 = "fr_dlv_grp_cd4";
	/**
	 * Delivery destination classification name 4 (Matching source) 納品先分類名４(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm4 = "fr_dlv_grp_nm4";
	/**
	 * Delivery destination classification cd. 5 (Matching source) 納品先分類ＣＤ５(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd5 = "fr_dlv_grp_cd5";
	/**
	 * Delivery destination classification name 5 (Matching source) 納品先分類名５(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm5 = "fr_dlv_grp_nm5";
	/**
	 * Delivery destination classification cd. 6 (Matching source) 納品先分類ＣＤ６(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd6 = "fr_dlv_grp_cd6";
	/**
	 * Delivery destination classification name 6 (Matching source) 納品先分類名６(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm6 = "fr_dlv_grp_nm6";
	/**
	 * Delivery destination classification cd. 7 (Matching source) 納品先分類ＣＤ７(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd7 = "fr_dlv_grp_cd7";
	/**
	 * Delivery destination classification name 7 (Matching source) 納品先分類名７(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm7 = "fr_dlv_grp_nm7";
	/**
	 * Delivery destination classification cd. 8 (Matching source) 納品先分類ＣＤ８(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd8 = "fr_dlv_grp_cd8";
	/**
	 * Delivery destination classification name 8 (Matching source) 納品先分類名８(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm8 = "fr_dlv_grp_nm8";
	/**
	 * Delivery destination classification cd. 9 (Matching source) 納品先分類ＣＤ９(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd9 = "fr_dlv_grp_cd9";
	/**
	 * Delivery destination classification name 9 (Matching source) 納品先分類名９(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm9 = "fr_dlv_grp_nm9";
	/**
	 * Delivery destination classification cd. 10 (Matching source) 納品先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_cd10 = "fr_dlv_grp_cd10";
	/**
	 * Delivery destination classification name 10 (Matching source) 納品先分類名１０(消込元).<p>
	 *
	 */
	public static final String $fr_dlv_grp_nm10 = "fr_dlv_grp_nm10";
	/**
	 * Customer classification cd. 1 (Matching destination) 得意先分類ＣＤ１(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd1 = "to_cst_grp_cd1";
	/**
	 * Customer classification name 1 (Matching destination) 得意先分類名１(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm1 = "to_cst_grp_nm1";
	/**
	 * Customer classification cd. 2 (Matching destination) 得意先分類ＣＤ２(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd2 = "to_cst_grp_cd2";
	/**
	 * Customer classification name 2 (Matching destination) 得意先分類名２(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm2 = "to_cst_grp_nm2";
	/**
	 * Customer classification cd. 3 (Matching destination) 得意先分類ＣＤ３(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd3 = "to_cst_grp_cd3";
	/**
	 * Customer classification name 3 (Matching destination) 得意先分類名３(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm3 = "to_cst_grp_nm3";
	/**
	 * Customer classification cd. 4 (Matching destination) 得意先分類ＣＤ４(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd4 = "to_cst_grp_cd4";
	/**
	 * Customer classification name 4 (Matching destination) 得意先分類名４(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm4 = "to_cst_grp_nm4";
	/**
	 * Customer classification cd. 5 (Matching destination) 得意先分類ＣＤ５(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd5 = "to_cst_grp_cd5";
	/**
	 * Customer classification name 5 (Matching destination) 得意先分類名５(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm5 = "to_cst_grp_nm5";
	/**
	 * Customer classification cd. 6 (Matching destination) 得意先分類ＣＤ６(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd6 = "to_cst_grp_cd6";
	/**
	 * Customer classification name 6 (Matching destination) 得意先分類名６(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm6 = "to_cst_grp_nm6";
	/**
	 * Customer classification cd. 7 (Matching destination) 得意先分類ＣＤ７(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd7 = "to_cst_grp_cd7";
	/**
	 * Customer classification name 7 (Matching destination) 得意先分類名７(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm7 = "to_cst_grp_nm7";
	/**
	 * Customer classification cd. 8 (Matching destination) 得意先分類ＣＤ８(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd8 = "to_cst_grp_cd8";
	/**
	 * Customer classification name 8 (Matching destination) 得意先分類名８(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm8 = "to_cst_grp_nm8";
	/**
	 * Customer classification cd. 9 (Matching destination) 得意先分類ＣＤ９(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd9 = "to_cst_grp_cd9";
	/**
	 * Customer classification name 9 (Matching destination) 得意先分類名９(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm9 = "to_cst_grp_nm9";
	/**
	 * Customer classification cd. 10 (Matching destination) 得意先分類ＣＤ１０(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_cd10 = "to_cst_grp_cd10";
	/**
	 * Customer classification name 10 (Matching destination) 得意先分類名１０(消込先).<p>
	 *
	 */
	public static final String $to_cst_grp_nm10 = "to_cst_grp_nm10";
	/**
	 * Customer classification cd. 1 (Matching source) 得意先分類ＣＤ１(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd1 = "fr_cst_grp_cd1";
	/**
	 * Customer classification name 1 (Matching source) 得意先分類名１(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm1 = "fr_cst_grp_nm1";
	/**
	 * Customer classification cd. 2 (Matching source) 得意先分類ＣＤ２(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd2 = "fr_cst_grp_cd2";
	/**
	 * Customer classification name 2 (Matching source) 得意先分類名２(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm2 = "fr_cst_grp_nm2";
	/**
	 * Customer classification cd. 3 (Matching source) 得意先分類ＣＤ３(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd3 = "fr_cst_grp_cd3";
	/**
	 * Customer classification name 3 (Matching source) 得意先分類名３(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm3 = "fr_cst_grp_nm3";
	/**
	 * Customer classification cd. 4 (Matching source) 得意先分類ＣＤ４(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd4 = "fr_cst_grp_cd4";
	/**
	 * Customer classification name 4 (Matching source) 得意先分類名４(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm4 = "fr_cst_grp_nm4";
	/**
	 * Customer classification cd. 5 (Matching source) 得意先分類ＣＤ５(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd5 = "fr_cst_grp_cd5";
	/**
	 * Customer classification name 5 (Matching source) 得意先分類名５(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm5 = "fr_cst_grp_nm5";
	/**
	 * Customer classification cd. 6 (Matching source) 得意先分類ＣＤ６(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd6 = "fr_cst_grp_cd6";
	/**
	 * Customer classification name 6 (Matching source) 得意先分類名６(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm6 = "fr_cst_grp_nm6";
	/**
	 * Customer classification cd. 7 (Matching source) 得意先分類ＣＤ７(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd7 = "fr_cst_grp_cd7";
	/**
	 * Customer classification name 7 (Matching source) 得意先分類名７(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm7 = "fr_cst_grp_nm7";
	/**
	 * Customer classification cd. 8 (Matching source) 得意先分類ＣＤ８(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd8 = "fr_cst_grp_cd8";
	/**
	 * Customer classification name 8 (Matching source) 得意先分類名８(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm8 = "fr_cst_grp_nm8";
	/**
	 * Customer classification cd. 9 (Matching source) 得意先分類ＣＤ９(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd9 = "fr_cst_grp_cd9";
	/**
	 * Customer classification name 9 (Matching source) 得意先分類名９(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm9 = "fr_cst_grp_nm9";
	/**
	 * Customer classification cd. 10 (Matching source) 得意先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_cd10 = "fr_cst_grp_cd10";
	/**
	 * Customer classification name 10 (Matching source) 得意先分類名１０(消込元).<p>
	 *
	 */
	public static final String $fr_cst_grp_nm10 = "fr_cst_grp_nm10";
	/**
	 * Entry user ID (Matching destination) 登録ユーザＩＤ(消込先).<p>
	 *
	 */
	public static final String $to_ins_usr_id = "to_ins_usr_id";
	/**
	 * Entry user name (Matching destination) 登録ユーザ名(消込先).<p>
	 *
	 */
	public static final String $to_ins_usr_nm = "to_ins_usr_nm";
	/**
	 * Entry function ID (Matching destination) 登録機能ＩＤ(消込先).<p>
	 *
	 */
	public static final String $to_ins_func_id = "to_ins_func_id";
	/**
	 * Entry function name (Matching destination) 登録機能名(消込先).<p>
	 *
	 */
	public static final String $to_ins_func_nm = "to_ins_func_nm";
	/**
	 * Entry date and time (Matching destination) 登録日時(消込先).<p>
	 *
	 */
	public static final String $to_ins_ts = "to_ins_ts";
	/**
	 * Update user ID (Matching destination) 更新ユーザＩＤ(消込先).<p>
	 *
	 */
	public static final String $to_upd_usr_id = "to_upd_usr_id";
	/**
	 * Update user name (Matching destination) 更新ユーザ名(消込先).<p>
	 *
	 */
	public static final String $to_upd_usr_nm = "to_upd_usr_nm";
	/**
	 * Update function ID (Matching destination) 更新機能ＩＤ(消込先).<p>
	 *
	 */
	public static final String $to_upd_func_id = "to_upd_func_id";
	/**
	 * Update function name (Matching destination) 更新機能名(消込先).<p>
	 *
	 */
	public static final String $to_upd_func_nm = "to_upd_func_nm";
	/**
	 * Update date and time (Matching destination) 更新日時(消込先).<p>
	 *
	 */
	public static final String $to_upd_ts = "to_upd_ts";
	/**
	 * Update request No. (Matching destination) 更新リクエストＮＯ(消込先).<p>
	 *
	 */
	public static final String $to_upd_srv_req_no = "to_upd_srv_req_no";
	/**
	 * Entry user ID (Matching source) 登録ユーザＩＤ(消込元).<p>
	 *
	 */
	public static final String $fr_ins_usr_id = "fr_ins_usr_id";
	/**
	 * Entry user name (Matching source) 登録ユーザ名(消込元).<p>
	 *
	 */
	public static final String $fr_ins_usr_nm = "fr_ins_usr_nm";
	/**
	 * Entry function ID (Matching source) 登録機能ＩＤ(消込元).<p>
	 *
	 */
	public static final String $fr_ins_func_id = "fr_ins_func_id";
	/**
	 * Entry function name (Matching source) 登録機能名(消込元).<p>
	 *
	 */
	public static final String $fr_ins_func_nm = "fr_ins_func_nm";
	/**
	 * Entry date and time (Matching source) 登録日時(消込元).<p>
	 *
	 */
	public static final String $fr_ins_ts = "fr_ins_ts";
	/**
	 * Update user ID (Matching source) 更新ユーザＩＤ(消込元).<p>
	 *
	 */
	public static final String $fr_upd_usr_id = "fr_upd_usr_id";
	/**
	 * Update user name (Matching source) 更新ユーザ名(消込元).<p>
	 *
	 */
	public static final String $fr_upd_usr_nm = "fr_upd_usr_nm";
	/**
	 * Update function ID (Matching source) 更新機能ＩＤ(消込元).<p>
	 *
	 */
	public static final String $fr_upd_func_id = "fr_upd_func_id";
	/**
	 * Update function name (Matching source) 更新機能名(消込元).<p>
	 *
	 */
	public static final String $fr_upd_func_nm = "fr_upd_func_nm";
	/**
	 * Update date and time (Matching source) 更新日時(消込元).<p>
	 *
	 */
	public static final String $fr_upd_ts = "fr_upd_ts";
	/**
	 * Update request No. (Matching source) 更新リクエストＮＯ(消込元).<p>
	 *
	 */
	public static final String $fr_upd_srv_req_no = "fr_upd_srv_req_no";


	public static final MCMeta to_dmnd_no_META = createCommonMeta($to_dmnd_no, mcframe.commonMA.meta.MA_META.DMND_NO);
	public static final MCMeta to_dmnd_dt_META = createCommonMeta($to_dmnd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta to_dmnd_st_dt_META = createCommonMeta($to_dmnd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta to_dmnd_end_dt_META = createCommonMeta($to_dmnd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta to_dlv_schd_st_dt_META = createCommonMeta($to_dlv_schd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta to_dlv_schd_end_dt_META = createCommonMeta($to_dlv_schd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta to_dmnd_period_typ_META = createCommonMeta($to_dmnd_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta to_dmnd_period_typ_nm_META = createCommonMeta($to_dmnd_period_typ_nm, mcframe.commonMA.meta.MA_META.PERIOD_TYP_NM);
	public static final MCMeta to_dmnd_typ_META = createCommonMeta($to_dmnd_typ, mcframe.commonMS.meta.MS_META.DMND_TYP);
	public static final MCMeta to_dmnd_typ_nm_META = createCommonMeta($to_dmnd_typ_nm, mcframe.commonMS.meta.MS_META.DMND_TYP_NM);
	public static final MCMeta fr_dmnd_no_META = createCommonMeta($fr_dmnd_no, mcframe.commonMA.meta.MA_META.DMND_NO);
	public static final MCMeta fr_dmnd_dt_META = createCommonMeta($fr_dmnd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fr_dmnd_st_dt_META = createCommonMeta($fr_dmnd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fr_dmnd_end_dt_META = createCommonMeta($fr_dmnd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fr_dlv_schd_st_dt_META = createCommonMeta($fr_dlv_schd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fr_dlv_schd_end_dt_META = createCommonMeta($fr_dlv_schd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fr_dmnd_period_typ_META = createCommonMeta($fr_dmnd_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta fr_dmnd_period_typ_nm_META = createCommonMeta($fr_dmnd_period_typ_nm, mcframe.commonMA.meta.MA_META.PERIOD_TYP_NM);
	public static final MCMeta fr_dmnd_typ_META = createCommonMeta($fr_dmnd_typ, mcframe.commonMS.meta.MS_META.DMND_TYP);
	public static final MCMeta fr_dmnd_typ_nm_META = createCommonMeta($fr_dmnd_typ_nm, mcframe.commonMS.meta.MS_META.DMND_TYP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta to_input_qty_META = createCommonMeta($to_input_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta to_dmnd_qty_META = createCommonMeta($to_dmnd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta to_rec_qty_META = createCommonMeta($to_rec_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fr_input_qty_META = createCommonMeta($fr_input_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fr_dmnd_qty_META = createCommonMeta($fr_dmnd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fr_rec_qty_META = createCommonMeta($fr_rec_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dmnd_loc_cd_META = createCommonMeta($dmnd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dmnd_loc_nm_META = createCommonMeta($dmnd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta dmnd_loc_grp_cd_META = createCommonMeta($dmnd_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta dmnd_loc_grp_nm_META = createCommonMeta($dmnd_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta dmnd_lg_grp_cd_META = createCommonMeta($dmnd_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dmnd_lg_grp_nm_META = createCommonMeta($dmnd_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta dmnd_wg_cd_META = createCommonMeta($dmnd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dmnd_wg_nm_META = createCommonMeta($dmnd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dmnd_site_cd_META = createCommonMeta($dmnd_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta dmnd_site_nm_META = createCommonMeta($dmnd_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta to_sno1_META = createCommonMeta($to_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta to_sno2_META = createCommonMeta($to_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta to_sno3_META = createCommonMeta($to_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta to_sno4_META = createCommonMeta($to_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta to_wrk_no_META = createCommonMeta($to_wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta to_wrk_nm_META = createCommonMeta($to_wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta fr_sno1_META = createCommonMeta($fr_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta fr_sno2_META = createCommonMeta($fr_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta fr_sno3_META = createCommonMeta($fr_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta fr_sno4_META = createCommonMeta($fr_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta fr_wrk_no_META = createCommonMeta($fr_wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta fr_wrk_nm_META = createCommonMeta($fr_wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta to_dmnd_usr_cd_META = createCommonMeta($to_dmnd_usr_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta to_dmnd_usr_nm_META = createCommonMeta($to_dmnd_usr_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta to_dmnd_dpt_cd_META = createCommonMeta($to_dmnd_dpt_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta to_dmnd_dpt_nm_META = createCommonMeta($to_dmnd_dpt_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta fr_dmnd_usr_cd_META = createCommonMeta($fr_dmnd_usr_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta fr_dmnd_usr_nm_META = createCommonMeta($fr_dmnd_usr_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta fr_dmnd_dpt_cd_META = createCommonMeta($fr_dmnd_dpt_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta fr_dmnd_dpt_nm_META = createCommonMeta($fr_dmnd_dpt_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta to_dlv_cd_META = createCommonMeta($to_dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta to_dlv_nm_META = createCommonMeta($to_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta to_cst_cd_META = createCommonMeta($to_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta to_cst_nm_META = createCommonMeta($to_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta fr_dlv_cd_META = createCommonMeta($fr_dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta fr_dlv_nm_META = createCommonMeta($fr_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta fr_cst_cd_META = createCommonMeta($fr_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta fr_cst_nm_META = createCommonMeta($fr_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta to_ym_META = createCommonMeta($to_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta to_spln_vers_META = createCommonMeta($to_spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta to_spln_itm_cd_META = createCommonMeta($to_spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta to_spln_itm_nm_META = createCommonMeta($to_spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta to_cur_cd_META = createCommonMeta($to_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta to_cur_nm_META = createCommonMeta($to_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta to_cst_frcst_no_META = createCommonMeta($to_cst_frcst_no, mcframe.commonMA.meta.MA_META.CST_FRCST_NO);
	public static final MCMeta to_cst_frcst_d_no_META = createCommonMeta($to_cst_frcst_d_no, mcframe.commonMA.meta.MA_META.CST_FRCST_D_NO);
	public static final MCMeta to_slo_no_META = createCommonMeta($to_slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta to_slo_d_no_META = createCommonMeta($to_slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta fr_ym_META = createCommonMeta($fr_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta fr_spln_vers_META = createCommonMeta($fr_spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta fr_spln_itm_cd_META = createCommonMeta($fr_spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta fr_spln_itm_nm_META = createCommonMeta($fr_spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta fr_cur_cd_META = createCommonMeta($fr_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta fr_cur_nm_META = createCommonMeta($fr_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta fr_cst_frcst_no_META = createCommonMeta($fr_cst_frcst_no, mcframe.commonMA.meta.MA_META.CST_FRCST_NO);
	public static final MCMeta fr_cst_frcst_d_no_META = createCommonMeta($fr_cst_frcst_d_no, mcframe.commonMA.meta.MA_META.CST_FRCST_D_NO);
	public static final MCMeta fr_slo_no_META = createCommonMeta($fr_slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta fr_slo_d_no_META = createCommonMeta($fr_slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta to_intr_rmrks_META = createCommonMeta($to_intr_rmrks, mcframe.commonMS.meta.MS_META.DMND_INTR_RMRKS);
	public static final MCMeta to_sub_char1_META = createCommonMeta($to_sub_char1, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR1);
	public static final MCMeta to_sub_char2_META = createCommonMeta($to_sub_char2, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR2);
	public static final MCMeta to_sub_char3_META = createCommonMeta($to_sub_char3, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR3);
	public static final MCMeta fr_intr_rmrks_META = createCommonMeta($fr_intr_rmrks, mcframe.commonMS.meta.MS_META.DMND_INTR_RMRKS);
	public static final MCMeta fr_sub_char1_META = createCommonMeta($fr_sub_char1, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR1);
	public static final MCMeta fr_sub_char2_META = createCommonMeta($fr_sub_char2, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR2);
	public static final MCMeta fr_sub_char3_META = createCommonMeta($fr_sub_char3, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta to_dlv_grp_cd1_META = createCommonMeta($to_dlv_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm1_META = createCommonMeta($to_dlv_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd2_META = createCommonMeta($to_dlv_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm2_META = createCommonMeta($to_dlv_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd3_META = createCommonMeta($to_dlv_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm3_META = createCommonMeta($to_dlv_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd4_META = createCommonMeta($to_dlv_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm4_META = createCommonMeta($to_dlv_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd5_META = createCommonMeta($to_dlv_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm5_META = createCommonMeta($to_dlv_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd6_META = createCommonMeta($to_dlv_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm6_META = createCommonMeta($to_dlv_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd7_META = createCommonMeta($to_dlv_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm7_META = createCommonMeta($to_dlv_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd8_META = createCommonMeta($to_dlv_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm8_META = createCommonMeta($to_dlv_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd9_META = createCommonMeta($to_dlv_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm9_META = createCommonMeta($to_dlv_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_dlv_grp_cd10_META = createCommonMeta($to_dlv_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_dlv_grp_nm10_META = createCommonMeta($to_dlv_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd1_META = createCommonMeta($fr_dlv_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm1_META = createCommonMeta($fr_dlv_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd2_META = createCommonMeta($fr_dlv_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm2_META = createCommonMeta($fr_dlv_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd3_META = createCommonMeta($fr_dlv_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm3_META = createCommonMeta($fr_dlv_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd4_META = createCommonMeta($fr_dlv_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm4_META = createCommonMeta($fr_dlv_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd5_META = createCommonMeta($fr_dlv_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm5_META = createCommonMeta($fr_dlv_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd6_META = createCommonMeta($fr_dlv_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm6_META = createCommonMeta($fr_dlv_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd7_META = createCommonMeta($fr_dlv_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm7_META = createCommonMeta($fr_dlv_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd8_META = createCommonMeta($fr_dlv_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm8_META = createCommonMeta($fr_dlv_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd9_META = createCommonMeta($fr_dlv_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm9_META = createCommonMeta($fr_dlv_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_dlv_grp_cd10_META = createCommonMeta($fr_dlv_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_dlv_grp_nm10_META = createCommonMeta($fr_dlv_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd1_META = createCommonMeta($to_cst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm1_META = createCommonMeta($to_cst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd2_META = createCommonMeta($to_cst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm2_META = createCommonMeta($to_cst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd3_META = createCommonMeta($to_cst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm3_META = createCommonMeta($to_cst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd4_META = createCommonMeta($to_cst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm4_META = createCommonMeta($to_cst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd5_META = createCommonMeta($to_cst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm5_META = createCommonMeta($to_cst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd6_META = createCommonMeta($to_cst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm6_META = createCommonMeta($to_cst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd7_META = createCommonMeta($to_cst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm7_META = createCommonMeta($to_cst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd8_META = createCommonMeta($to_cst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm8_META = createCommonMeta($to_cst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd9_META = createCommonMeta($to_cst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm9_META = createCommonMeta($to_cst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_cst_grp_cd10_META = createCommonMeta($to_cst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta to_cst_grp_nm10_META = createCommonMeta($to_cst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd1_META = createCommonMeta($fr_cst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm1_META = createCommonMeta($fr_cst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd2_META = createCommonMeta($fr_cst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm2_META = createCommonMeta($fr_cst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd3_META = createCommonMeta($fr_cst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm3_META = createCommonMeta($fr_cst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd4_META = createCommonMeta($fr_cst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm4_META = createCommonMeta($fr_cst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd5_META = createCommonMeta($fr_cst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm5_META = createCommonMeta($fr_cst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd6_META = createCommonMeta($fr_cst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm6_META = createCommonMeta($fr_cst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd7_META = createCommonMeta($fr_cst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm7_META = createCommonMeta($fr_cst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd8_META = createCommonMeta($fr_cst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm8_META = createCommonMeta($fr_cst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd9_META = createCommonMeta($fr_cst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm9_META = createCommonMeta($fr_cst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta fr_cst_grp_cd10_META = createCommonMeta($fr_cst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta fr_cst_grp_nm10_META = createCommonMeta($fr_cst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta to_ins_usr_id_META = createCommonMeta($to_ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta to_ins_usr_nm_META = createCommonMeta($to_ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta to_ins_func_id_META = createCommonMeta($to_ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta to_ins_func_nm_META = createCommonMeta($to_ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta to_ins_ts_META = createCommonMeta($to_ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta to_upd_usr_id_META = createCommonMeta($to_upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta to_upd_usr_nm_META = createCommonMeta($to_upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta to_upd_func_id_META = createCommonMeta($to_upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta to_upd_func_nm_META = createCommonMeta($to_upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta to_upd_ts_META = createCommonMeta($to_upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta to_upd_srv_req_no_META = createCommonMeta($to_upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta fr_ins_usr_id_META = createCommonMeta($fr_ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta fr_ins_usr_nm_META = createCommonMeta($fr_ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta fr_ins_func_id_META = createCommonMeta($fr_ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta fr_ins_func_nm_META = createCommonMeta($fr_ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta fr_ins_ts_META = createCommonMeta($fr_ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta fr_upd_usr_id_META = createCommonMeta($fr_upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta fr_upd_usr_nm_META = createCommonMeta($fr_upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta fr_upd_func_id_META = createCommonMeta($fr_upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta fr_upd_func_nm_META = createCommonMeta($fr_upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta fr_upd_ts_META = createCommonMeta($fr_upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta fr_upd_srv_req_no_META = createCommonMeta($fr_upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Srch02_RsltR> constMetas = new ConstMetaList<Srch02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			to_dmnd_no_META,
			to_dmnd_dt_META,
			to_dmnd_st_dt_META,
			to_dmnd_end_dt_META,
			to_dlv_schd_st_dt_META,
			to_dlv_schd_end_dt_META,
			to_dmnd_period_typ_META,
			to_dmnd_period_typ_nm_META,
			to_dmnd_typ_META,
			to_dmnd_typ_nm_META,
			fr_dmnd_no_META,
			fr_dmnd_dt_META,
			fr_dmnd_st_dt_META,
			fr_dmnd_end_dt_META,
			fr_dlv_schd_st_dt_META,
			fr_dlv_schd_end_dt_META,
			fr_dmnd_period_typ_META,
			fr_dmnd_period_typ_nm_META,
			fr_dmnd_typ_META,
			fr_dmnd_typ_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			to_input_qty_META,
			to_dmnd_qty_META,
			to_rec_qty_META,
			fr_input_qty_META,
			fr_dmnd_qty_META,
			fr_rec_qty_META,
			dmnd_loc_cd_META,
			dmnd_loc_nm_META,
			dmnd_loc_grp_cd_META,
			dmnd_loc_grp_nm_META,
			dmnd_lg_grp_cd_META,
			dmnd_lg_grp_nm_META,
			dmnd_wg_cd_META,
			dmnd_wg_nm_META,
			dmnd_site_cd_META,
			dmnd_site_nm_META,
			to_sno1_META,
			to_sno2_META,
			to_sno3_META,
			to_sno4_META,
			to_wrk_no_META,
			to_wrk_nm_META,
			fr_sno1_META,
			fr_sno2_META,
			fr_sno3_META,
			fr_sno4_META,
			fr_wrk_no_META,
			fr_wrk_nm_META,
			to_dmnd_usr_cd_META,
			to_dmnd_usr_nm_META,
			to_dmnd_dpt_cd_META,
			to_dmnd_dpt_nm_META,
			fr_dmnd_usr_cd_META,
			fr_dmnd_usr_nm_META,
			fr_dmnd_dpt_cd_META,
			fr_dmnd_dpt_nm_META,
			to_dlv_cd_META,
			to_dlv_nm_META,
			to_cst_cd_META,
			to_cst_nm_META,
			fr_dlv_cd_META,
			fr_dlv_nm_META,
			fr_cst_cd_META,
			fr_cst_nm_META,
			to_ym_META,
			to_spln_vers_META,
			to_spln_itm_cd_META,
			to_spln_itm_nm_META,
			to_cur_cd_META,
			to_cur_nm_META,
			to_cst_frcst_no_META,
			to_cst_frcst_d_no_META,
			to_slo_no_META,
			to_slo_d_no_META,
			fr_ym_META,
			fr_spln_vers_META,
			fr_spln_itm_cd_META,
			fr_spln_itm_nm_META,
			fr_cur_cd_META,
			fr_cur_nm_META,
			fr_cst_frcst_no_META,
			fr_cst_frcst_d_no_META,
			fr_slo_no_META,
			fr_slo_d_no_META,
			to_intr_rmrks_META,
			to_sub_char1_META,
			to_sub_char2_META,
			to_sub_char3_META,
			fr_intr_rmrks_META,
			fr_sub_char1_META,
			fr_sub_char2_META,
			fr_sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			to_dlv_grp_cd1_META,
			to_dlv_grp_nm1_META,
			to_dlv_grp_cd2_META,
			to_dlv_grp_nm2_META,
			to_dlv_grp_cd3_META,
			to_dlv_grp_nm3_META,
			to_dlv_grp_cd4_META,
			to_dlv_grp_nm4_META,
			to_dlv_grp_cd5_META,
			to_dlv_grp_nm5_META,
			to_dlv_grp_cd6_META,
			to_dlv_grp_nm6_META,
			to_dlv_grp_cd7_META,
			to_dlv_grp_nm7_META,
			to_dlv_grp_cd8_META,
			to_dlv_grp_nm8_META,
			to_dlv_grp_cd9_META,
			to_dlv_grp_nm9_META,
			to_dlv_grp_cd10_META,
			to_dlv_grp_nm10_META,
			fr_dlv_grp_cd1_META,
			fr_dlv_grp_nm1_META,
			fr_dlv_grp_cd2_META,
			fr_dlv_grp_nm2_META,
			fr_dlv_grp_cd3_META,
			fr_dlv_grp_nm3_META,
			fr_dlv_grp_cd4_META,
			fr_dlv_grp_nm4_META,
			fr_dlv_grp_cd5_META,
			fr_dlv_grp_nm5_META,
			fr_dlv_grp_cd6_META,
			fr_dlv_grp_nm6_META,
			fr_dlv_grp_cd7_META,
			fr_dlv_grp_nm7_META,
			fr_dlv_grp_cd8_META,
			fr_dlv_grp_nm8_META,
			fr_dlv_grp_cd9_META,
			fr_dlv_grp_nm9_META,
			fr_dlv_grp_cd10_META,
			fr_dlv_grp_nm10_META,
			to_cst_grp_cd1_META,
			to_cst_grp_nm1_META,
			to_cst_grp_cd2_META,
			to_cst_grp_nm2_META,
			to_cst_grp_cd3_META,
			to_cst_grp_nm3_META,
			to_cst_grp_cd4_META,
			to_cst_grp_nm4_META,
			to_cst_grp_cd5_META,
			to_cst_grp_nm5_META,
			to_cst_grp_cd6_META,
			to_cst_grp_nm6_META,
			to_cst_grp_cd7_META,
			to_cst_grp_nm7_META,
			to_cst_grp_cd8_META,
			to_cst_grp_nm8_META,
			to_cst_grp_cd9_META,
			to_cst_grp_nm9_META,
			to_cst_grp_cd10_META,
			to_cst_grp_nm10_META,
			fr_cst_grp_cd1_META,
			fr_cst_grp_nm1_META,
			fr_cst_grp_cd2_META,
			fr_cst_grp_nm2_META,
			fr_cst_grp_cd3_META,
			fr_cst_grp_nm3_META,
			fr_cst_grp_cd4_META,
			fr_cst_grp_nm4_META,
			fr_cst_grp_cd5_META,
			fr_cst_grp_nm5_META,
			fr_cst_grp_cd6_META,
			fr_cst_grp_nm6_META,
			fr_cst_grp_cd7_META,
			fr_cst_grp_nm7_META,
			fr_cst_grp_cd8_META,
			fr_cst_grp_nm8_META,
			fr_cst_grp_cd9_META,
			fr_cst_grp_nm9_META,
			fr_cst_grp_cd10_META,
			fr_cst_grp_nm10_META,
			to_ins_usr_id_META,
			to_ins_usr_nm_META,
			to_ins_func_id_META,
			to_ins_func_nm_META,
			to_ins_ts_META,
			to_upd_usr_id_META,
			to_upd_usr_nm_META,
			to_upd_func_id_META,
			to_upd_func_nm_META,
			to_upd_ts_META,
			to_upd_srv_req_no_META,
			fr_ins_usr_id_META,
			fr_ins_usr_nm_META,
			fr_ins_func_id_META,
			fr_ins_func_nm_META,
			fr_ins_ts_META,
			fr_upd_usr_id_META,
			fr_upd_usr_nm_META,
			fr_upd_func_id_META,
			fr_upd_func_nm_META,
			fr_upd_ts_META,
			fr_upd_srv_req_no_META
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
				{$to_dmnd_period_typ, "MAC_PERIOD_TYP"},	// to_dmnd_period_typ
				{$to_dmnd_typ, "MSC_DMND_TYP"},	// to_dmnd_typ
				{$fr_dmnd_period_typ, "MAC_PERIOD_TYP"},	// fr_dmnd_period_typ
				{$fr_dmnd_typ, "MSC_DMND_TYP"},	// fr_dmnd_typ
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	protected Srch02_RsltR_MC_A(ConstMetaList<? extends Srch02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_RsltR clone() {
		return (Srch02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_RsltR createInstance() {
		return (Srch02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_RsltR getValues(String... names) {
		return (Srch02_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Demand No. (Matching destination) 需要ＮＯ(消込先).<p>
	 *
	 */
	public String to_dmnd_no() {
		return getConstString(offset + 0, $to_dmnd_no);
	}

	/**
	 * Demand No. (Matching destination) 需要ＮＯ(消込先).<p>
	 *
	 */
	public void to_dmnd_no(String value) {
		setConstString(offset + 0, $to_dmnd_no, value);
	}


	/**
	 * Demand date (Matching destination) 需要日(消込先).<p>
	 *
	 */
	public MCDate to_dmnd_dt() {
		return getConstDate(offset + 1, $to_dmnd_dt);
	}

	/**
	 * Demand date (Matching destination) 需要日(消込先).<p>
	 *
	 */
	public void to_dmnd_dt(MCDate value) {
		setConstDate(offset + 1, $to_dmnd_dt, value);
	}


	/**
	 * Demand period start date (Matching destination) 需要期間開始日(消込先).<p>
	 *
	 */
	public MCDate to_dmnd_st_dt() {
		return getConstDate(offset + 2, $to_dmnd_st_dt);
	}

	/**
	 * Demand period start date (Matching destination) 需要期間開始日(消込先).<p>
	 *
	 */
	public void to_dmnd_st_dt(MCDate value) {
		setConstDate(offset + 2, $to_dmnd_st_dt, value);
	}


	/**
	 * Demand period end date (Matching destination) 需要期間終了日(消込先).<p>
	 *
	 */
	public MCDate to_dmnd_end_dt() {
		return getConstDate(offset + 3, $to_dmnd_end_dt);
	}

	/**
	 * Demand period end date (Matching destination) 需要期間終了日(消込先).<p>
	 *
	 */
	public void to_dmnd_end_dt(MCDate value) {
		setConstDate(offset + 3, $to_dmnd_end_dt, value);
	}


	/**
	 * Delivery schedule period start date (Matching destination) 納品予定期間開始日(消込先).<p>
	 *
	 */
	public MCDate to_dlv_schd_st_dt() {
		return getConstDate(offset + 4, $to_dlv_schd_st_dt);
	}

	/**
	 * Delivery schedule period start date (Matching destination) 納品予定期間開始日(消込先).<p>
	 *
	 */
	public void to_dlv_schd_st_dt(MCDate value) {
		setConstDate(offset + 4, $to_dlv_schd_st_dt, value);
	}


	/**
	 * Delivery schedule period end date (Matching destination) 納品予定期間終了日(消込先).<p>
	 *
	 */
	public MCDate to_dlv_schd_end_dt() {
		return getConstDate(offset + 5, $to_dlv_schd_end_dt);
	}

	/**
	 * Delivery schedule period end date (Matching destination) 納品予定期間終了日(消込先).<p>
	 *
	 */
	public void to_dlv_schd_end_dt(MCDate value) {
		setConstDate(offset + 5, $to_dlv_schd_end_dt, value);
	}


	/**
	 * Demand period type (Matching destination) 需要期間区分(消込先).<p>
	 *
	 */
	public String to_dmnd_period_typ() {
		return getConstString(offset + 6, $to_dmnd_period_typ);
	}

	/**
	 * Demand period type (Matching destination) 需要期間区分(消込先).<p>
	 *
	 */
	public void to_dmnd_period_typ(String value) {
		setConstString(offset + 6, $to_dmnd_period_typ, value);
	}


	/**
	 * Demand period type name (Matching destination) 需要期間区分名(消込先).<p>
	 *
	 */
	public String to_dmnd_period_typ_nm() {
		return getConstString(offset + 7, $to_dmnd_period_typ_nm);
	}

	/**
	 * Demand period type name (Matching destination) 需要期間区分名(消込先).<p>
	 *
	 */
	public void to_dmnd_period_typ_nm(String value) {
		setConstString(offset + 7, $to_dmnd_period_typ_nm, value);
	}


	/**
	 * Demand type (Matching destination) 需要区分(消込先).<p>
	 *
	 */
	public String to_dmnd_typ() {
		return getConstString(offset + 8, $to_dmnd_typ);
	}

	/**
	 * Demand type (Matching destination) 需要区分(消込先).<p>
	 *
	 */
	public void to_dmnd_typ(String value) {
		setConstString(offset + 8, $to_dmnd_typ, value);
	}


	/**
	 * Demand type name (Matching destination) 需要区分名(消込先).<p>
	 *
	 */
	public String to_dmnd_typ_nm() {
		return getConstString(offset + 9, $to_dmnd_typ_nm);
	}

	/**
	 * Demand type name (Matching destination) 需要区分名(消込先).<p>
	 *
	 */
	public void to_dmnd_typ_nm(String value) {
		setConstString(offset + 9, $to_dmnd_typ_nm, value);
	}


	/**
	 * Demand No. (Matching source) 需要ＮＯ(消込元).<p>
	 *
	 */
	public String fr_dmnd_no() {
		return getConstString(offset + 10, $fr_dmnd_no);
	}

	/**
	 * Demand No. (Matching source) 需要ＮＯ(消込元).<p>
	 *
	 */
	public void fr_dmnd_no(String value) {
		setConstString(offset + 10, $fr_dmnd_no, value);
	}


	/**
	 * Demand date (Matching source) 需要日(消込元).<p>
	 *
	 */
	public MCDate fr_dmnd_dt() {
		return getConstDate(offset + 11, $fr_dmnd_dt);
	}

	/**
	 * Demand date (Matching source) 需要日(消込元).<p>
	 *
	 */
	public void fr_dmnd_dt(MCDate value) {
		setConstDate(offset + 11, $fr_dmnd_dt, value);
	}


	/**
	 * Demand period start date (Matching source) 需要期間開始日(消込元).<p>
	 *
	 */
	public MCDate fr_dmnd_st_dt() {
		return getConstDate(offset + 12, $fr_dmnd_st_dt);
	}

	/**
	 * Demand period start date (Matching source) 需要期間開始日(消込元).<p>
	 *
	 */
	public void fr_dmnd_st_dt(MCDate value) {
		setConstDate(offset + 12, $fr_dmnd_st_dt, value);
	}


	/**
	 * Demand period end date (Matching source) 需要期間終了日(消込元).<p>
	 *
	 */
	public MCDate fr_dmnd_end_dt() {
		return getConstDate(offset + 13, $fr_dmnd_end_dt);
	}

	/**
	 * Demand period end date (Matching source) 需要期間終了日(消込元).<p>
	 *
	 */
	public void fr_dmnd_end_dt(MCDate value) {
		setConstDate(offset + 13, $fr_dmnd_end_dt, value);
	}


	/**
	 * Delivery schedule period start date (Matching source) 納品予定期間開始日(消込元).<p>
	 *
	 */
	public MCDate fr_dlv_schd_st_dt() {
		return getConstDate(offset + 14, $fr_dlv_schd_st_dt);
	}

	/**
	 * Delivery schedule period start date (Matching source) 納品予定期間開始日(消込元).<p>
	 *
	 */
	public void fr_dlv_schd_st_dt(MCDate value) {
		setConstDate(offset + 14, $fr_dlv_schd_st_dt, value);
	}


	/**
	 * Delivery schedule period end date (Matching source) 納品予定期間終了日(消込元).<p>
	 *
	 */
	public MCDate fr_dlv_schd_end_dt() {
		return getConstDate(offset + 15, $fr_dlv_schd_end_dt);
	}

	/**
	 * Delivery schedule period end date (Matching source) 納品予定期間終了日(消込元).<p>
	 *
	 */
	public void fr_dlv_schd_end_dt(MCDate value) {
		setConstDate(offset + 15, $fr_dlv_schd_end_dt, value);
	}


	/**
	 * Demand period type (Matching source) 需要期間区分(消込元).<p>
	 *
	 */
	public String fr_dmnd_period_typ() {
		return getConstString(offset + 16, $fr_dmnd_period_typ);
	}

	/**
	 * Demand period type (Matching source) 需要期間区分(消込元).<p>
	 *
	 */
	public void fr_dmnd_period_typ(String value) {
		setConstString(offset + 16, $fr_dmnd_period_typ, value);
	}


	/**
	 * Demand period type name (Matching source) 需要期間区分名(消込元).<p>
	 *
	 */
	public String fr_dmnd_period_typ_nm() {
		return getConstString(offset + 17, $fr_dmnd_period_typ_nm);
	}

	/**
	 * Demand period type name (Matching source) 需要期間区分名(消込元).<p>
	 *
	 */
	public void fr_dmnd_period_typ_nm(String value) {
		setConstString(offset + 17, $fr_dmnd_period_typ_nm, value);
	}


	/**
	 * Demand type (Matching source) 需要区分(消込元).<p>
	 *
	 */
	public String fr_dmnd_typ() {
		return getConstString(offset + 18, $fr_dmnd_typ);
	}

	/**
	 * Demand type (Matching source) 需要区分(消込元).<p>
	 *
	 */
	public void fr_dmnd_typ(String value) {
		setConstString(offset + 18, $fr_dmnd_typ, value);
	}


	/**
	 * Demand type name (Matching source) 需要区分名(消込元).<p>
	 *
	 */
	public String fr_dmnd_typ_nm() {
		return getConstString(offset + 19, $fr_dmnd_typ_nm);
	}

	/**
	 * Demand type name (Matching source) 需要区分名(消込元).<p>
	 *
	 */
	public void fr_dmnd_typ_nm(String value) {
		setConstString(offset + 19, $fr_dmnd_typ_nm, value);
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
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 25, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 25, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 26, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 26, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 27, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 27, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 28, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 28, $sno4_mng_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 29, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 29, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 30, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 30, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 31, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 31, $base_unit_dec_place, value);
	}


	/**
	 * Entry qty. (Matching destination) 登録数量(消込先).<p>
	 *
	 */
	public MCNumber to_input_qty() {
		return getConstNumber(offset + 32, $to_input_qty);
	}

	/**
	 * Entry qty. (Matching destination) 登録数量(消込先).<p>
	 *
	 */
	public void to_input_qty(MCNumber value) {
		setConstNumber(offset + 32, $to_input_qty, value);
	}

	/**
	 * Entry qty. (Matching destination) 登録数量(消込先).<p>
	 *
	 */
	public void to_input_qty(int value) {
		setConstNumber(offset + 32, $to_input_qty, value);
	}

	/**
	 * Entry qty. (Matching destination) 登録数量(消込先).<p>
	 *
	 */
	public void to_input_qty(long value) {
		setConstNumber(offset + 32, $to_input_qty, value);
	}

	/**
	 * Entry qty. (Matching destination) 登録数量(消込先).<p>
	 *
	 */
	public void to_input_qty(float value) {
		setConstNumber(offset + 32, $to_input_qty, value);
	}

	/**
	 * Entry qty. (Matching destination) 登録数量(消込先).<p>
	 *
	 */
	public void to_input_qty(double value) {
		setConstNumber(offset + 32, $to_input_qty, value);
	}


	/**
	 * Demand qty. (Matching destination) 需要数量(消込先).<p>
	 *
	 */
	public MCNumber to_dmnd_qty() {
		return getConstNumber(offset + 33, $to_dmnd_qty);
	}

	/**
	 * Demand qty. (Matching destination) 需要数量(消込先).<p>
	 *
	 */
	public void to_dmnd_qty(MCNumber value) {
		setConstNumber(offset + 33, $to_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching destination) 需要数量(消込先).<p>
	 *
	 */
	public void to_dmnd_qty(int value) {
		setConstNumber(offset + 33, $to_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching destination) 需要数量(消込先).<p>
	 *
	 */
	public void to_dmnd_qty(long value) {
		setConstNumber(offset + 33, $to_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching destination) 需要数量(消込先).<p>
	 *
	 */
	public void to_dmnd_qty(float value) {
		setConstNumber(offset + 33, $to_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching destination) 需要数量(消込先).<p>
	 *
	 */
	public void to_dmnd_qty(double value) {
		setConstNumber(offset + 33, $to_dmnd_qty, value);
	}


	/**
	 * Matching qty. (Matching destination) 消込数量(消込先).<p>
	 *
	 */
	public MCNumber to_rec_qty() {
		return getConstNumber(offset + 34, $to_rec_qty);
	}

	/**
	 * Matching qty. (Matching destination) 消込数量(消込先).<p>
	 *
	 */
	public void to_rec_qty(MCNumber value) {
		setConstNumber(offset + 34, $to_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching destination) 消込数量(消込先).<p>
	 *
	 */
	public void to_rec_qty(int value) {
		setConstNumber(offset + 34, $to_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching destination) 消込数量(消込先).<p>
	 *
	 */
	public void to_rec_qty(long value) {
		setConstNumber(offset + 34, $to_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching destination) 消込数量(消込先).<p>
	 *
	 */
	public void to_rec_qty(float value) {
		setConstNumber(offset + 34, $to_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching destination) 消込数量(消込先).<p>
	 *
	 */
	public void to_rec_qty(double value) {
		setConstNumber(offset + 34, $to_rec_qty, value);
	}


	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public MCNumber fr_input_qty() {
		return getConstNumber(offset + 35, $fr_input_qty);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(MCNumber value) {
		setConstNumber(offset + 35, $fr_input_qty, value);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(int value) {
		setConstNumber(offset + 35, $fr_input_qty, value);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(long value) {
		setConstNumber(offset + 35, $fr_input_qty, value);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(float value) {
		setConstNumber(offset + 35, $fr_input_qty, value);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(double value) {
		setConstNumber(offset + 35, $fr_input_qty, value);
	}


	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public MCNumber fr_dmnd_qty() {
		return getConstNumber(offset + 36, $fr_dmnd_qty);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(MCNumber value) {
		setConstNumber(offset + 36, $fr_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(int value) {
		setConstNumber(offset + 36, $fr_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(long value) {
		setConstNumber(offset + 36, $fr_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(float value) {
		setConstNumber(offset + 36, $fr_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(double value) {
		setConstNumber(offset + 36, $fr_dmnd_qty, value);
	}


	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public MCNumber fr_rec_qty() {
		return getConstNumber(offset + 37, $fr_rec_qty);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(MCNumber value) {
		setConstNumber(offset + 37, $fr_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(int value) {
		setConstNumber(offset + 37, $fr_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(long value) {
		setConstNumber(offset + 37, $fr_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(float value) {
		setConstNumber(offset + 37, $fr_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(double value) {
		setConstNumber(offset + 37, $fr_rec_qty, value);
	}


	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public String dmnd_loc_cd() {
		return getConstString(offset + 38, $dmnd_loc_cd);
	}

	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public void dmnd_loc_cd(String value) {
		setConstString(offset + 38, $dmnd_loc_cd, value);
	}


	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public String dmnd_loc_nm() {
		return getConstString(offset + 39, $dmnd_loc_nm);
	}

	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public void dmnd_loc_nm(String value) {
		setConstString(offset + 39, $dmnd_loc_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String dmnd_loc_grp_cd() {
		return getConstString(offset + 40, $dmnd_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void dmnd_loc_grp_cd(String value) {
		setConstString(offset + 40, $dmnd_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String dmnd_loc_grp_nm() {
		return getConstString(offset + 41, $dmnd_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void dmnd_loc_grp_nm(String value) {
		setConstString(offset + 41, $dmnd_loc_grp_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String dmnd_lg_grp_cd() {
		return getConstString(offset + 42, $dmnd_lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void dmnd_lg_grp_cd(String value) {
		setConstString(offset + 42, $dmnd_lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String dmnd_lg_grp_nm() {
		return getConstString(offset + 43, $dmnd_lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void dmnd_lg_grp_nm(String value) {
		setConstString(offset + 43, $dmnd_lg_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String dmnd_wg_cd() {
		return getConstString(offset + 44, $dmnd_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void dmnd_wg_cd(String value) {
		setConstString(offset + 44, $dmnd_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String dmnd_wg_nm() {
		return getConstString(offset + 45, $dmnd_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void dmnd_wg_nm(String value) {
		setConstString(offset + 45, $dmnd_wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String dmnd_site_cd() {
		return getConstString(offset + 46, $dmnd_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void dmnd_site_cd(String value) {
		setConstString(offset + 46, $dmnd_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String dmnd_site_nm() {
		return getConstString(offset + 47, $dmnd_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void dmnd_site_nm(String value) {
		setConstString(offset + 47, $dmnd_site_nm, value);
	}


	/**
	 * SEIBAN No. 1 (Matching destination) 手配ＮＯ１(消込先).<p>
	 *
	 */
	public String to_sno1() {
		return getConstString(offset + 48, $to_sno1);
	}

	/**
	 * SEIBAN No. 1 (Matching destination) 手配ＮＯ１(消込先).<p>
	 *
	 */
	public void to_sno1(String value) {
		setConstString(offset + 48, $to_sno1, value);
	}


	/**
	 * SEIBAN No. 2 (Matching destination) 手配ＮＯ２(消込先).<p>
	 *
	 */
	public String to_sno2() {
		return getConstString(offset + 49, $to_sno2);
	}

	/**
	 * SEIBAN No. 2 (Matching destination) 手配ＮＯ２(消込先).<p>
	 *
	 */
	public void to_sno2(String value) {
		setConstString(offset + 49, $to_sno2, value);
	}


	/**
	 * SEIBAN No. 3 (Matching destination) 手配ＮＯ３(消込先).<p>
	 *
	 */
	public String to_sno3() {
		return getConstString(offset + 50, $to_sno3);
	}

	/**
	 * SEIBAN No. 3 (Matching destination) 手配ＮＯ３(消込先).<p>
	 *
	 */
	public void to_sno3(String value) {
		setConstString(offset + 50, $to_sno3, value);
	}


	/**
	 * SEIBAN No. 4 (Matching destination) 手配ＮＯ４(消込先).<p>
	 *
	 */
	public String to_sno4() {
		return getConstString(offset + 51, $to_sno4);
	}

	/**
	 * SEIBAN No. 4 (Matching destination) 手配ＮＯ４(消込先).<p>
	 *
	 */
	public void to_sno4(String value) {
		setConstString(offset + 51, $to_sno4, value);
	}


	/**
	 * Sales project No. (Matching destination) 案件ＮＯ(消込先).<p>
	 *
	 */
	public String to_wrk_no() {
		return getConstString(offset + 52, $to_wrk_no);
	}

	/**
	 * Sales project No. (Matching destination) 案件ＮＯ(消込先).<p>
	 *
	 */
	public void to_wrk_no(String value) {
		setConstString(offset + 52, $to_wrk_no, value);
	}


	/**
	 * Sales project name (Matching destination) 案件名(消込先).<p>
	 *
	 */
	public String to_wrk_nm() {
		return getConstString(offset + 53, $to_wrk_nm);
	}

	/**
	 * Sales project name (Matching destination) 案件名(消込先).<p>
	 *
	 */
	public void to_wrk_nm(String value) {
		setConstString(offset + 53, $to_wrk_nm, value);
	}


	/**
	 * SEIBAN No. 1 (Matching source) 手配ＮＯ１(消込元).<p>
	 *
	 */
	public String fr_sno1() {
		return getConstString(offset + 54, $fr_sno1);
	}

	/**
	 * SEIBAN No. 1 (Matching source) 手配ＮＯ１(消込元).<p>
	 *
	 */
	public void fr_sno1(String value) {
		setConstString(offset + 54, $fr_sno1, value);
	}


	/**
	 * SEIBAN No. 2 (Matching source) 手配ＮＯ２(消込元).<p>
	 *
	 */
	public String fr_sno2() {
		return getConstString(offset + 55, $fr_sno2);
	}

	/**
	 * SEIBAN No. 2 (Matching source) 手配ＮＯ２(消込元).<p>
	 *
	 */
	public void fr_sno2(String value) {
		setConstString(offset + 55, $fr_sno2, value);
	}


	/**
	 * SEIBAN No. 3 (Matching source) 手配ＮＯ３(消込元).<p>
	 *
	 */
	public String fr_sno3() {
		return getConstString(offset + 56, $fr_sno3);
	}

	/**
	 * SEIBAN No. 3 (Matching source) 手配ＮＯ３(消込元).<p>
	 *
	 */
	public void fr_sno3(String value) {
		setConstString(offset + 56, $fr_sno3, value);
	}


	/**
	 * SEIBAN No. 4 (Matching source) 手配ＮＯ４(消込元).<p>
	 *
	 */
	public String fr_sno4() {
		return getConstString(offset + 57, $fr_sno4);
	}

	/**
	 * SEIBAN No. 4 (Matching source) 手配ＮＯ４(消込元).<p>
	 *
	 */
	public void fr_sno4(String value) {
		setConstString(offset + 57, $fr_sno4, value);
	}


	/**
	 * Sales project No. (Matching source) 案件ＮＯ(消込元).<p>
	 *
	 */
	public String fr_wrk_no() {
		return getConstString(offset + 58, $fr_wrk_no);
	}

	/**
	 * Sales project No. (Matching source) 案件ＮＯ(消込元).<p>
	 *
	 */
	public void fr_wrk_no(String value) {
		setConstString(offset + 58, $fr_wrk_no, value);
	}


	/**
	 * Sales project name (Matching source) 案件名(消込元).<p>
	 *
	 */
	public String fr_wrk_nm() {
		return getConstString(offset + 59, $fr_wrk_nm);
	}

	/**
	 * Sales project name (Matching source) 案件名(消込元).<p>
	 *
	 */
	public void fr_wrk_nm(String value) {
		setConstString(offset + 59, $fr_wrk_nm, value);
	}


	/**
	 * PIC cd. (Matching destination) 担当者ＣＤ(消込先).<p>
	 *
	 */
	public String to_dmnd_usr_cd() {
		return getConstString(offset + 60, $to_dmnd_usr_cd);
	}

	/**
	 * PIC cd. (Matching destination) 担当者ＣＤ(消込先).<p>
	 *
	 */
	public void to_dmnd_usr_cd(String value) {
		setConstString(offset + 60, $to_dmnd_usr_cd, value);
	}


	/**
	 * PIC name (Matching destination) 担当者名(消込先).<p>
	 *
	 */
	public String to_dmnd_usr_nm() {
		return getConstString(offset + 61, $to_dmnd_usr_nm);
	}

	/**
	 * PIC name (Matching destination) 担当者名(消込先).<p>
	 *
	 */
	public void to_dmnd_usr_nm(String value) {
		setConstString(offset + 61, $to_dmnd_usr_nm, value);
	}


	/**
	 * Demand source dept. cd. (Matching destination) 需要元部門ＣＤ(消込先).<p>
	 *
	 */
	public String to_dmnd_dpt_cd() {
		return getConstString(offset + 62, $to_dmnd_dpt_cd);
	}

	/**
	 * Demand source dept. cd. (Matching destination) 需要元部門ＣＤ(消込先).<p>
	 *
	 */
	public void to_dmnd_dpt_cd(String value) {
		setConstString(offset + 62, $to_dmnd_dpt_cd, value);
	}


	/**
	 * Demand source dept. name (Matching destination) 需要元部門名(消込先).<p>
	 *
	 */
	public String to_dmnd_dpt_nm() {
		return getConstString(offset + 63, $to_dmnd_dpt_nm);
	}

	/**
	 * Demand source dept. name (Matching destination) 需要元部門名(消込先).<p>
	 *
	 */
	public void to_dmnd_dpt_nm(String value) {
		setConstString(offset + 63, $to_dmnd_dpt_nm, value);
	}


	/**
	 * PIC cd. (Matching source) 担当者ＣＤ(消込元).<p>
	 *
	 */
	public String fr_dmnd_usr_cd() {
		return getConstString(offset + 64, $fr_dmnd_usr_cd);
	}

	/**
	 * PIC cd. (Matching source) 担当者ＣＤ(消込元).<p>
	 *
	 */
	public void fr_dmnd_usr_cd(String value) {
		setConstString(offset + 64, $fr_dmnd_usr_cd, value);
	}


	/**
	 * PIC name (Matching source) 担当者名(消込元).<p>
	 *
	 */
	public String fr_dmnd_usr_nm() {
		return getConstString(offset + 65, $fr_dmnd_usr_nm);
	}

	/**
	 * PIC name (Matching source) 担当者名(消込元).<p>
	 *
	 */
	public void fr_dmnd_usr_nm(String value) {
		setConstString(offset + 65, $fr_dmnd_usr_nm, value);
	}


	/**
	 * Demand source dept. cd. (Matching source) 需要元部門ＣＤ(消込元).<p>
	 *
	 */
	public String fr_dmnd_dpt_cd() {
		return getConstString(offset + 66, $fr_dmnd_dpt_cd);
	}

	/**
	 * Demand source dept. cd. (Matching source) 需要元部門ＣＤ(消込元).<p>
	 *
	 */
	public void fr_dmnd_dpt_cd(String value) {
		setConstString(offset + 66, $fr_dmnd_dpt_cd, value);
	}


	/**
	 * Demand source dept. name (Matching source) 需要元部門名(消込元).<p>
	 *
	 */
	public String fr_dmnd_dpt_nm() {
		return getConstString(offset + 67, $fr_dmnd_dpt_nm);
	}

	/**
	 * Demand source dept. name (Matching source) 需要元部門名(消込元).<p>
	 *
	 */
	public void fr_dmnd_dpt_nm(String value) {
		setConstString(offset + 67, $fr_dmnd_dpt_nm, value);
	}


	/**
	 * Delivery destination cd. (Matching destination) 納品先ＣＤ(消込先).<p>
	 *
	 */
	public String to_dlv_cd() {
		return getConstString(offset + 68, $to_dlv_cd);
	}

	/**
	 * Delivery destination cd. (Matching destination) 納品先ＣＤ(消込先).<p>
	 *
	 */
	public void to_dlv_cd(String value) {
		setConstString(offset + 68, $to_dlv_cd, value);
	}


	/**
	 * Delivery destination name (Matching destination) 納品先名(消込先).<p>
	 *
	 */
	public String to_dlv_nm() {
		return getConstString(offset + 69, $to_dlv_nm);
	}

	/**
	 * Delivery destination name (Matching destination) 納品先名(消込先).<p>
	 *
	 */
	public void to_dlv_nm(String value) {
		setConstString(offset + 69, $to_dlv_nm, value);
	}


	/**
	 * Customer cd. (Matching destination) 得意先ＣＤ(消込先).<p>
	 *
	 */
	public String to_cst_cd() {
		return getConstString(offset + 70, $to_cst_cd);
	}

	/**
	 * Customer cd. (Matching destination) 得意先ＣＤ(消込先).<p>
	 *
	 */
	public void to_cst_cd(String value) {
		setConstString(offset + 70, $to_cst_cd, value);
	}


	/**
	 * Customer name (Matching destination) 得意先名(消込先).<p>
	 *
	 */
	public String to_cst_nm() {
		return getConstString(offset + 71, $to_cst_nm);
	}

	/**
	 * Customer name (Matching destination) 得意先名(消込先).<p>
	 *
	 */
	public void to_cst_nm(String value) {
		setConstString(offset + 71, $to_cst_nm, value);
	}


	/**
	 * Delivery destination cd. (Matching source) 納品先ＣＤ(消込元).<p>
	 *
	 */
	public String fr_dlv_cd() {
		return getConstString(offset + 72, $fr_dlv_cd);
	}

	/**
	 * Delivery destination cd. (Matching source) 納品先ＣＤ(消込元).<p>
	 *
	 */
	public void fr_dlv_cd(String value) {
		setConstString(offset + 72, $fr_dlv_cd, value);
	}


	/**
	 * Delivery destination name (Matching source) 納品先名(消込元).<p>
	 *
	 */
	public String fr_dlv_nm() {
		return getConstString(offset + 73, $fr_dlv_nm);
	}

	/**
	 * Delivery destination name (Matching source) 納品先名(消込元).<p>
	 *
	 */
	public void fr_dlv_nm(String value) {
		setConstString(offset + 73, $fr_dlv_nm, value);
	}


	/**
	 * Customer cd. (Matching source) 得意先ＣＤ(消込元).<p>
	 *
	 */
	public String fr_cst_cd() {
		return getConstString(offset + 74, $fr_cst_cd);
	}

	/**
	 * Customer cd. (Matching source) 得意先ＣＤ(消込元).<p>
	 *
	 */
	public void fr_cst_cd(String value) {
		setConstString(offset + 74, $fr_cst_cd, value);
	}


	/**
	 * Customer name (Matching source) 得意先名(消込元).<p>
	 *
	 */
	public String fr_cst_nm() {
		return getConstString(offset + 75, $fr_cst_nm);
	}

	/**
	 * Customer name (Matching source) 得意先名(消込元).<p>
	 *
	 */
	public void fr_cst_nm(String value) {
		setConstString(offset + 75, $fr_cst_nm, value);
	}


	/**
	 * Plan monthly (Matching destination) 計画月度(消込先).<p>
	 *
	 */
	public MCDate to_ym() {
		return getConstDate(offset + 76, $to_ym);
	}

	/**
	 * Plan monthly (Matching destination) 計画月度(消込先).<p>
	 *
	 */
	public void to_ym(MCDate value) {
		setConstDate(offset + 76, $to_ym, value);
	}


	/**
	 * Sales plan version (Matching destination) 販売計画バージョン(消込先).<p>
	 *
	 */
	public String to_spln_vers() {
		return getConstString(offset + 77, $to_spln_vers);
	}

	/**
	 * Sales plan version (Matching destination) 販売計画バージョン(消込先).<p>
	 *
	 */
	public void to_spln_vers(String value) {
		setConstString(offset + 77, $to_spln_vers, value);
	}


	/**
	 * Plan item cd. (Matching destination) 計画品目ＣＤ(消込先).<p>
	 *
	 */
	public String to_spln_itm_cd() {
		return getConstString(offset + 78, $to_spln_itm_cd);
	}

	/**
	 * Plan item cd. (Matching destination) 計画品目ＣＤ(消込先).<p>
	 *
	 */
	public void to_spln_itm_cd(String value) {
		setConstString(offset + 78, $to_spln_itm_cd, value);
	}


	/**
	 * Plan item name (Matching destination) 計画品名(消込先).<p>
	 *
	 */
	public String to_spln_itm_nm() {
		return getConstString(offset + 79, $to_spln_itm_nm);
	}

	/**
	 * Plan item name (Matching destination) 計画品名(消込先).<p>
	 *
	 */
	public void to_spln_itm_nm(String value) {
		setConstString(offset + 79, $to_spln_itm_nm, value);
	}


	/**
	 * Currency cd. (Matching destination) 通貨ＣＤ(消込先).<p>
	 *
	 */
	public String to_cur_cd() {
		return getConstString(offset + 80, $to_cur_cd);
	}

	/**
	 * Currency cd. (Matching destination) 通貨ＣＤ(消込先).<p>
	 *
	 */
	public void to_cur_cd(String value) {
		setConstString(offset + 80, $to_cur_cd, value);
	}


	/**
	 * Currency name (Matching destination) 通貨名(消込先).<p>
	 *
	 */
	public String to_cur_nm() {
		return getConstString(offset + 81, $to_cur_nm);
	}

	/**
	 * Currency name (Matching destination) 通貨名(消込先).<p>
	 *
	 */
	public void to_cur_nm(String value) {
		setConstString(offset + 81, $to_cur_nm, value);
	}


	/**
	 * Sales forecast No. (Matching destination) 顧客期間内示ＮＯ(消込先).<p>
	 *
	 */
	public String to_cst_frcst_no() {
		return getConstString(offset + 82, $to_cst_frcst_no);
	}

	/**
	 * Sales forecast No. (Matching destination) 顧客期間内示ＮＯ(消込先).<p>
	 *
	 */
	public void to_cst_frcst_no(String value) {
		setConstString(offset + 82, $to_cst_frcst_no, value);
	}


	/**
	 * Sales forecast details No. (Matching destination) 顧客期間内示明細ＮＯ(消込先).<p>
	 *
	 */
	public String to_cst_frcst_d_no() {
		return getConstString(offset + 83, $to_cst_frcst_d_no);
	}

	/**
	 * Sales forecast details No. (Matching destination) 顧客期間内示明細ＮＯ(消込先).<p>
	 *
	 */
	public void to_cst_frcst_d_no(String value) {
		setConstString(offset + 83, $to_cst_frcst_d_no, value);
	}


	/**
	 * Sales order No. (Matching destination) 受注ＮＯ(消込先).<p>
	 *
	 */
	public String to_slo_no() {
		return getConstString(offset + 84, $to_slo_no);
	}

	/**
	 * Sales order No. (Matching destination) 受注ＮＯ(消込先).<p>
	 *
	 */
	public void to_slo_no(String value) {
		setConstString(offset + 84, $to_slo_no, value);
	}


	/**
	 * Sales order details No. (Matching destination) 受注明細ＮＯ(消込先).<p>
	 *
	 */
	public String to_slo_d_no() {
		return getConstString(offset + 85, $to_slo_d_no);
	}

	/**
	 * Sales order details No. (Matching destination) 受注明細ＮＯ(消込先).<p>
	 *
	 */
	public void to_slo_d_no(String value) {
		setConstString(offset + 85, $to_slo_d_no, value);
	}


	/**
	 * Plan monthly (Matching source) 計画月度(消込元).<p>
	 *
	 */
	public MCDate fr_ym() {
		return getConstDate(offset + 86, $fr_ym);
	}

	/**
	 * Plan monthly (Matching source) 計画月度(消込元).<p>
	 *
	 */
	public void fr_ym(MCDate value) {
		setConstDate(offset + 86, $fr_ym, value);
	}


	/**
	 * Sales plan version (Matching source) 販売計画バージョン(消込元).<p>
	 *
	 */
	public String fr_spln_vers() {
		return getConstString(offset + 87, $fr_spln_vers);
	}

	/**
	 * Sales plan version (Matching source) 販売計画バージョン(消込元).<p>
	 *
	 */
	public void fr_spln_vers(String value) {
		setConstString(offset + 87, $fr_spln_vers, value);
	}


	/**
	 * Plan item cd. (Matching source) 計画品目ＣＤ(消込元).<p>
	 *
	 */
	public String fr_spln_itm_cd() {
		return getConstString(offset + 88, $fr_spln_itm_cd);
	}

	/**
	 * Plan item cd. (Matching source) 計画品目ＣＤ(消込元).<p>
	 *
	 */
	public void fr_spln_itm_cd(String value) {
		setConstString(offset + 88, $fr_spln_itm_cd, value);
	}


	/**
	 * Plan item name (Matching source) 計画品名(消込元).<p>
	 *
	 */
	public String fr_spln_itm_nm() {
		return getConstString(offset + 89, $fr_spln_itm_nm);
	}

	/**
	 * Plan item name (Matching source) 計画品名(消込元).<p>
	 *
	 */
	public void fr_spln_itm_nm(String value) {
		setConstString(offset + 89, $fr_spln_itm_nm, value);
	}


	/**
	 * Currency cd. (Matching source) 通貨ＣＤ(消込元).<p>
	 *
	 */
	public String fr_cur_cd() {
		return getConstString(offset + 90, $fr_cur_cd);
	}

	/**
	 * Currency cd. (Matching source) 通貨ＣＤ(消込元).<p>
	 *
	 */
	public void fr_cur_cd(String value) {
		setConstString(offset + 90, $fr_cur_cd, value);
	}


	/**
	 * Currency name (Matching source) 通貨名(消込元).<p>
	 *
	 */
	public String fr_cur_nm() {
		return getConstString(offset + 91, $fr_cur_nm);
	}

	/**
	 * Currency name (Matching source) 通貨名(消込元).<p>
	 *
	 */
	public void fr_cur_nm(String value) {
		setConstString(offset + 91, $fr_cur_nm, value);
	}


	/**
	 * Sales forecast No. (Matching source) 顧客期間内示ＮＯ(消込元).<p>
	 *
	 */
	public String fr_cst_frcst_no() {
		return getConstString(offset + 92, $fr_cst_frcst_no);
	}

	/**
	 * Sales forecast No. (Matching source) 顧客期間内示ＮＯ(消込元).<p>
	 *
	 */
	public void fr_cst_frcst_no(String value) {
		setConstString(offset + 92, $fr_cst_frcst_no, value);
	}


	/**
	 * Sales forecast details No. (Matching source) 顧客期間内示明細ＮＯ(消込元).<p>
	 *
	 */
	public String fr_cst_frcst_d_no() {
		return getConstString(offset + 93, $fr_cst_frcst_d_no);
	}

	/**
	 * Sales forecast details No. (Matching source) 顧客期間内示明細ＮＯ(消込元).<p>
	 *
	 */
	public void fr_cst_frcst_d_no(String value) {
		setConstString(offset + 93, $fr_cst_frcst_d_no, value);
	}


	/**
	 * Sales order No. (Matching source) 受注ＮＯ(消込元).<p>
	 *
	 */
	public String fr_slo_no() {
		return getConstString(offset + 94, $fr_slo_no);
	}

	/**
	 * Sales order No. (Matching source) 受注ＮＯ(消込元).<p>
	 *
	 */
	public void fr_slo_no(String value) {
		setConstString(offset + 94, $fr_slo_no, value);
	}


	/**
	 * Sales order details No. (Matching source) 受注明細ＮＯ(消込元).<p>
	 *
	 */
	public String fr_slo_d_no() {
		return getConstString(offset + 95, $fr_slo_d_no);
	}

	/**
	 * Sales order details No. (Matching source) 受注明細ＮＯ(消込元).<p>
	 *
	 */
	public void fr_slo_d_no(String value) {
		setConstString(offset + 95, $fr_slo_d_no, value);
	}


	/**
	 * Internal remarks (Matching destination) 内部備考(消込先).<p>
	 *
	 */
	public String to_intr_rmrks() {
		return getConstString(offset + 96, $to_intr_rmrks);
	}

	/**
	 * Internal remarks (Matching destination) 内部備考(消込先).<p>
	 *
	 */
	public void to_intr_rmrks(String value) {
		setConstString(offset + 96, $to_intr_rmrks, value);
	}


	/**
	 * Spare 1 (Matching destination) 予備１(消込先).<p>
	 *
	 */
	public String to_sub_char1() {
		return getConstString(offset + 97, $to_sub_char1);
	}

	/**
	 * Spare 1 (Matching destination) 予備１(消込先).<p>
	 *
	 */
	public void to_sub_char1(String value) {
		setConstString(offset + 97, $to_sub_char1, value);
	}


	/**
	 * Spare 2 (Matching destination) 予備２(消込先).<p>
	 *
	 */
	public String to_sub_char2() {
		return getConstString(offset + 98, $to_sub_char2);
	}

	/**
	 * Spare 2 (Matching destination) 予備２(消込先).<p>
	 *
	 */
	public void to_sub_char2(String value) {
		setConstString(offset + 98, $to_sub_char2, value);
	}


	/**
	 * Spare 3 (Matching destination) 予備３(消込先).<p>
	 *
	 */
	public String to_sub_char3() {
		return getConstString(offset + 99, $to_sub_char3);
	}

	/**
	 * Spare 3 (Matching destination) 予備３(消込先).<p>
	 *
	 */
	public void to_sub_char3(String value) {
		setConstString(offset + 99, $to_sub_char3, value);
	}


	/**
	 * Internal remarks (Matching source) 内部備考(消込元).<p>
	 *
	 */
	public String fr_intr_rmrks() {
		return getConstString(offset + 100, $fr_intr_rmrks);
	}

	/**
	 * Internal remarks (Matching source) 内部備考(消込元).<p>
	 *
	 */
	public void fr_intr_rmrks(String value) {
		setConstString(offset + 100, $fr_intr_rmrks, value);
	}


	/**
	 * Spare 1 (Matching source) 予備１(消込元).<p>
	 *
	 */
	public String fr_sub_char1() {
		return getConstString(offset + 101, $fr_sub_char1);
	}

	/**
	 * Spare 1 (Matching source) 予備１(消込元).<p>
	 *
	 */
	public void fr_sub_char1(String value) {
		setConstString(offset + 101, $fr_sub_char1, value);
	}


	/**
	 * Spare 2 (Matching source) 予備２(消込元).<p>
	 *
	 */
	public String fr_sub_char2() {
		return getConstString(offset + 102, $fr_sub_char2);
	}

	/**
	 * Spare 2 (Matching source) 予備２(消込元).<p>
	 *
	 */
	public void fr_sub_char2(String value) {
		setConstString(offset + 102, $fr_sub_char2, value);
	}


	/**
	 * Spare 3 (Matching source) 予備３(消込元).<p>
	 *
	 */
	public String fr_sub_char3() {
		return getConstString(offset + 103, $fr_sub_char3);
	}

	/**
	 * Spare 3 (Matching source) 予備３(消込元).<p>
	 *
	 */
	public void fr_sub_char3(String value) {
		setConstString(offset + 103, $fr_sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 104, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 104, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 105, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 105, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 106, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 106, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 107, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 107, $itm_typ_d_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 108, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 108, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 109, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 109, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 110, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 110, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 111, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 111, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 112, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 112, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 113, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 113, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 114, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 114, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 115, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 115, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 116, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 116, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 117, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 117, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 118, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 118, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 119, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 119, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 120, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 120, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 121, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 121, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 122, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 122, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 123, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 123, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 124, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 124, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 125, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 125, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 126, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 126, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 127, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 127, $itm_grp_nm10, value);
	}


	/**
	 * Delivery destination classification cd. 1 (Matching destination) 納品先分類ＣＤ１(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd1() {
		return getConstString(offset + 128, $to_dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 (Matching destination) 納品先分類ＣＤ１(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd1(String value) {
		setConstString(offset + 128, $to_dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 (Matching destination) 納品先分類名１(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm1() {
		return getConstString(offset + 129, $to_dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 (Matching destination) 納品先分類名１(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm1(String value) {
		setConstString(offset + 129, $to_dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification cd. 2 (Matching destination) 納品先分類ＣＤ２(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd2() {
		return getConstString(offset + 130, $to_dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 (Matching destination) 納品先分類ＣＤ２(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd2(String value) {
		setConstString(offset + 130, $to_dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 (Matching destination) 納品先分類名２(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm2() {
		return getConstString(offset + 131, $to_dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 (Matching destination) 納品先分類名２(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm2(String value) {
		setConstString(offset + 131, $to_dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification cd. 3 (Matching destination) 納品先分類ＣＤ３(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd3() {
		return getConstString(offset + 132, $to_dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 (Matching destination) 納品先分類ＣＤ３(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd3(String value) {
		setConstString(offset + 132, $to_dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 (Matching destination) 納品先分類名３(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm3() {
		return getConstString(offset + 133, $to_dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 (Matching destination) 納品先分類名３(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm3(String value) {
		setConstString(offset + 133, $to_dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification cd. 4 (Matching destination) 納品先分類ＣＤ４(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd4() {
		return getConstString(offset + 134, $to_dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 (Matching destination) 納品先分類ＣＤ４(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd4(String value) {
		setConstString(offset + 134, $to_dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 (Matching destination) 納品先分類名４(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm4() {
		return getConstString(offset + 135, $to_dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 (Matching destination) 納品先分類名４(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm4(String value) {
		setConstString(offset + 135, $to_dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification cd. 5 (Matching destination) 納品先分類ＣＤ５(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd5() {
		return getConstString(offset + 136, $to_dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 (Matching destination) 納品先分類ＣＤ５(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd5(String value) {
		setConstString(offset + 136, $to_dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 (Matching destination) 納品先分類名５(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm5() {
		return getConstString(offset + 137, $to_dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 (Matching destination) 納品先分類名５(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm5(String value) {
		setConstString(offset + 137, $to_dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification cd. 6 (Matching destination) 納品先分類ＣＤ６(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd6() {
		return getConstString(offset + 138, $to_dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 (Matching destination) 納品先分類ＣＤ６(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd6(String value) {
		setConstString(offset + 138, $to_dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 (Matching destination) 納品先分類名６(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm6() {
		return getConstString(offset + 139, $to_dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 (Matching destination) 納品先分類名６(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm6(String value) {
		setConstString(offset + 139, $to_dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification cd. 7 (Matching destination) 納品先分類ＣＤ７(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd7() {
		return getConstString(offset + 140, $to_dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 (Matching destination) 納品先分類ＣＤ７(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd7(String value) {
		setConstString(offset + 140, $to_dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 (Matching destination) 納品先分類名７(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm7() {
		return getConstString(offset + 141, $to_dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 (Matching destination) 納品先分類名７(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm7(String value) {
		setConstString(offset + 141, $to_dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification cd. 8 (Matching destination) 納品先分類ＣＤ８(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd8() {
		return getConstString(offset + 142, $to_dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 (Matching destination) 納品先分類ＣＤ８(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd8(String value) {
		setConstString(offset + 142, $to_dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 (Matching destination) 納品先分類名８(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm8() {
		return getConstString(offset + 143, $to_dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 (Matching destination) 納品先分類名８(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm8(String value) {
		setConstString(offset + 143, $to_dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification cd. 9 (Matching destination) 納品先分類ＣＤ９(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd9() {
		return getConstString(offset + 144, $to_dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 (Matching destination) 納品先分類ＣＤ９(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd9(String value) {
		setConstString(offset + 144, $to_dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 (Matching destination) 納品先分類名９(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm9() {
		return getConstString(offset + 145, $to_dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 (Matching destination) 納品先分類名９(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm9(String value) {
		setConstString(offset + 145, $to_dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification cd. 10 (Matching destination) 納品先分類ＣＤ１０(消込先).<p>
	 *
	 */
	public String to_dlv_grp_cd10() {
		return getConstString(offset + 146, $to_dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 (Matching destination) 納品先分類ＣＤ１０(消込先).<p>
	 *
	 */
	public void to_dlv_grp_cd10(String value) {
		setConstString(offset + 146, $to_dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 (Matching destination) 納品先分類名１０(消込先).<p>
	 *
	 */
	public String to_dlv_grp_nm10() {
		return getConstString(offset + 147, $to_dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 (Matching destination) 納品先分類名１０(消込先).<p>
	 *
	 */
	public void to_dlv_grp_nm10(String value) {
		setConstString(offset + 147, $to_dlv_grp_nm10, value);
	}


	/**
	 * Delivery destination classification cd. 1 (Matching source) 納品先分類ＣＤ１(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd1() {
		return getConstString(offset + 148, $fr_dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 (Matching source) 納品先分類ＣＤ１(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd1(String value) {
		setConstString(offset + 148, $fr_dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 (Matching source) 納品先分類名１(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm1() {
		return getConstString(offset + 149, $fr_dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 (Matching source) 納品先分類名１(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm1(String value) {
		setConstString(offset + 149, $fr_dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification cd. 2 (Matching source) 納品先分類ＣＤ２(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd2() {
		return getConstString(offset + 150, $fr_dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 (Matching source) 納品先分類ＣＤ２(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd2(String value) {
		setConstString(offset + 150, $fr_dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 (Matching source) 納品先分類名２(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm2() {
		return getConstString(offset + 151, $fr_dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 (Matching source) 納品先分類名２(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm2(String value) {
		setConstString(offset + 151, $fr_dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification cd. 3 (Matching source) 納品先分類ＣＤ３(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd3() {
		return getConstString(offset + 152, $fr_dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 (Matching source) 納品先分類ＣＤ３(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd3(String value) {
		setConstString(offset + 152, $fr_dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 (Matching source) 納品先分類名３(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm3() {
		return getConstString(offset + 153, $fr_dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 (Matching source) 納品先分類名３(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm3(String value) {
		setConstString(offset + 153, $fr_dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification cd. 4 (Matching source) 納品先分類ＣＤ４(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd4() {
		return getConstString(offset + 154, $fr_dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 (Matching source) 納品先分類ＣＤ４(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd4(String value) {
		setConstString(offset + 154, $fr_dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 (Matching source) 納品先分類名４(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm4() {
		return getConstString(offset + 155, $fr_dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 (Matching source) 納品先分類名４(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm4(String value) {
		setConstString(offset + 155, $fr_dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification cd. 5 (Matching source) 納品先分類ＣＤ５(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd5() {
		return getConstString(offset + 156, $fr_dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 (Matching source) 納品先分類ＣＤ５(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd5(String value) {
		setConstString(offset + 156, $fr_dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 (Matching source) 納品先分類名５(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm5() {
		return getConstString(offset + 157, $fr_dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 (Matching source) 納品先分類名５(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm5(String value) {
		setConstString(offset + 157, $fr_dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification cd. 6 (Matching source) 納品先分類ＣＤ６(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd6() {
		return getConstString(offset + 158, $fr_dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 (Matching source) 納品先分類ＣＤ６(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd6(String value) {
		setConstString(offset + 158, $fr_dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 (Matching source) 納品先分類名６(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm6() {
		return getConstString(offset + 159, $fr_dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 (Matching source) 納品先分類名６(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm6(String value) {
		setConstString(offset + 159, $fr_dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification cd. 7 (Matching source) 納品先分類ＣＤ７(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd7() {
		return getConstString(offset + 160, $fr_dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 (Matching source) 納品先分類ＣＤ７(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd7(String value) {
		setConstString(offset + 160, $fr_dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 (Matching source) 納品先分類名７(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm7() {
		return getConstString(offset + 161, $fr_dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 (Matching source) 納品先分類名７(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm7(String value) {
		setConstString(offset + 161, $fr_dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification cd. 8 (Matching source) 納品先分類ＣＤ８(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd8() {
		return getConstString(offset + 162, $fr_dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 (Matching source) 納品先分類ＣＤ８(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd8(String value) {
		setConstString(offset + 162, $fr_dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 (Matching source) 納品先分類名８(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm8() {
		return getConstString(offset + 163, $fr_dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 (Matching source) 納品先分類名８(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm8(String value) {
		setConstString(offset + 163, $fr_dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification cd. 9 (Matching source) 納品先分類ＣＤ９(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd9() {
		return getConstString(offset + 164, $fr_dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 (Matching source) 納品先分類ＣＤ９(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd9(String value) {
		setConstString(offset + 164, $fr_dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 (Matching source) 納品先分類名９(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm9() {
		return getConstString(offset + 165, $fr_dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 (Matching source) 納品先分類名９(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm9(String value) {
		setConstString(offset + 165, $fr_dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification cd. 10 (Matching source) 納品先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd10() {
		return getConstString(offset + 166, $fr_dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 (Matching source) 納品先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd10(String value) {
		setConstString(offset + 166, $fr_dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 (Matching source) 納品先分類名１０(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm10() {
		return getConstString(offset + 167, $fr_dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 (Matching source) 納品先分類名１０(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm10(String value) {
		setConstString(offset + 167, $fr_dlv_grp_nm10, value);
	}


	/**
	 * Customer classification cd. 1 (Matching destination) 得意先分類ＣＤ１(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd1() {
		return getConstString(offset + 168, $to_cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 (Matching destination) 得意先分類ＣＤ１(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd1(String value) {
		setConstString(offset + 168, $to_cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 (Matching destination) 得意先分類名１(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm1() {
		return getConstString(offset + 169, $to_cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 (Matching destination) 得意先分類名１(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm1(String value) {
		setConstString(offset + 169, $to_cst_grp_nm1, value);
	}


	/**
	 * Customer classification cd. 2 (Matching destination) 得意先分類ＣＤ２(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd2() {
		return getConstString(offset + 170, $to_cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 (Matching destination) 得意先分類ＣＤ２(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd2(String value) {
		setConstString(offset + 170, $to_cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 (Matching destination) 得意先分類名２(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm2() {
		return getConstString(offset + 171, $to_cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 (Matching destination) 得意先分類名２(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm2(String value) {
		setConstString(offset + 171, $to_cst_grp_nm2, value);
	}


	/**
	 * Customer classification cd. 3 (Matching destination) 得意先分類ＣＤ３(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd3() {
		return getConstString(offset + 172, $to_cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 (Matching destination) 得意先分類ＣＤ３(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd3(String value) {
		setConstString(offset + 172, $to_cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 (Matching destination) 得意先分類名３(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm3() {
		return getConstString(offset + 173, $to_cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 (Matching destination) 得意先分類名３(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm3(String value) {
		setConstString(offset + 173, $to_cst_grp_nm3, value);
	}


	/**
	 * Customer classification cd. 4 (Matching destination) 得意先分類ＣＤ４(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd4() {
		return getConstString(offset + 174, $to_cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 (Matching destination) 得意先分類ＣＤ４(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd4(String value) {
		setConstString(offset + 174, $to_cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 (Matching destination) 得意先分類名４(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm4() {
		return getConstString(offset + 175, $to_cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 (Matching destination) 得意先分類名４(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm4(String value) {
		setConstString(offset + 175, $to_cst_grp_nm4, value);
	}


	/**
	 * Customer classification cd. 5 (Matching destination) 得意先分類ＣＤ５(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd5() {
		return getConstString(offset + 176, $to_cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 (Matching destination) 得意先分類ＣＤ５(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd5(String value) {
		setConstString(offset + 176, $to_cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 (Matching destination) 得意先分類名５(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm5() {
		return getConstString(offset + 177, $to_cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 (Matching destination) 得意先分類名５(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm5(String value) {
		setConstString(offset + 177, $to_cst_grp_nm5, value);
	}


	/**
	 * Customer classification cd. 6 (Matching destination) 得意先分類ＣＤ６(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd6() {
		return getConstString(offset + 178, $to_cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 (Matching destination) 得意先分類ＣＤ６(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd6(String value) {
		setConstString(offset + 178, $to_cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 (Matching destination) 得意先分類名６(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm6() {
		return getConstString(offset + 179, $to_cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 (Matching destination) 得意先分類名６(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm6(String value) {
		setConstString(offset + 179, $to_cst_grp_nm6, value);
	}


	/**
	 * Customer classification cd. 7 (Matching destination) 得意先分類ＣＤ７(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd7() {
		return getConstString(offset + 180, $to_cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 (Matching destination) 得意先分類ＣＤ７(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd7(String value) {
		setConstString(offset + 180, $to_cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 (Matching destination) 得意先分類名７(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm7() {
		return getConstString(offset + 181, $to_cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 (Matching destination) 得意先分類名７(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm7(String value) {
		setConstString(offset + 181, $to_cst_grp_nm7, value);
	}


	/**
	 * Customer classification cd. 8 (Matching destination) 得意先分類ＣＤ８(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd8() {
		return getConstString(offset + 182, $to_cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 (Matching destination) 得意先分類ＣＤ８(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd8(String value) {
		setConstString(offset + 182, $to_cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 (Matching destination) 得意先分類名８(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm8() {
		return getConstString(offset + 183, $to_cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 (Matching destination) 得意先分類名８(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm8(String value) {
		setConstString(offset + 183, $to_cst_grp_nm8, value);
	}


	/**
	 * Customer classification cd. 9 (Matching destination) 得意先分類ＣＤ９(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd9() {
		return getConstString(offset + 184, $to_cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 (Matching destination) 得意先分類ＣＤ９(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd9(String value) {
		setConstString(offset + 184, $to_cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 (Matching destination) 得意先分類名９(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm9() {
		return getConstString(offset + 185, $to_cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 (Matching destination) 得意先分類名９(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm9(String value) {
		setConstString(offset + 185, $to_cst_grp_nm9, value);
	}


	/**
	 * Customer classification cd. 10 (Matching destination) 得意先分類ＣＤ１０(消込先).<p>
	 *
	 */
	public String to_cst_grp_cd10() {
		return getConstString(offset + 186, $to_cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 (Matching destination) 得意先分類ＣＤ１０(消込先).<p>
	 *
	 */
	public void to_cst_grp_cd10(String value) {
		setConstString(offset + 186, $to_cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 (Matching destination) 得意先分類名１０(消込先).<p>
	 *
	 */
	public String to_cst_grp_nm10() {
		return getConstString(offset + 187, $to_cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 (Matching destination) 得意先分類名１０(消込先).<p>
	 *
	 */
	public void to_cst_grp_nm10(String value) {
		setConstString(offset + 187, $to_cst_grp_nm10, value);
	}


	/**
	 * Customer classification cd. 1 (Matching source) 得意先分類ＣＤ１(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd1() {
		return getConstString(offset + 188, $fr_cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 (Matching source) 得意先分類ＣＤ１(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd1(String value) {
		setConstString(offset + 188, $fr_cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 (Matching source) 得意先分類名１(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm1() {
		return getConstString(offset + 189, $fr_cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 (Matching source) 得意先分類名１(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm1(String value) {
		setConstString(offset + 189, $fr_cst_grp_nm1, value);
	}


	/**
	 * Customer classification cd. 2 (Matching source) 得意先分類ＣＤ２(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd2() {
		return getConstString(offset + 190, $fr_cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 (Matching source) 得意先分類ＣＤ２(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd2(String value) {
		setConstString(offset + 190, $fr_cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 (Matching source) 得意先分類名２(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm2() {
		return getConstString(offset + 191, $fr_cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 (Matching source) 得意先分類名２(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm2(String value) {
		setConstString(offset + 191, $fr_cst_grp_nm2, value);
	}


	/**
	 * Customer classification cd. 3 (Matching source) 得意先分類ＣＤ３(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd3() {
		return getConstString(offset + 192, $fr_cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 (Matching source) 得意先分類ＣＤ３(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd3(String value) {
		setConstString(offset + 192, $fr_cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 (Matching source) 得意先分類名３(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm3() {
		return getConstString(offset + 193, $fr_cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 (Matching source) 得意先分類名３(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm3(String value) {
		setConstString(offset + 193, $fr_cst_grp_nm3, value);
	}


	/**
	 * Customer classification cd. 4 (Matching source) 得意先分類ＣＤ４(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd4() {
		return getConstString(offset + 194, $fr_cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 (Matching source) 得意先分類ＣＤ４(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd4(String value) {
		setConstString(offset + 194, $fr_cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 (Matching source) 得意先分類名４(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm4() {
		return getConstString(offset + 195, $fr_cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 (Matching source) 得意先分類名４(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm4(String value) {
		setConstString(offset + 195, $fr_cst_grp_nm4, value);
	}


	/**
	 * Customer classification cd. 5 (Matching source) 得意先分類ＣＤ５(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd5() {
		return getConstString(offset + 196, $fr_cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 (Matching source) 得意先分類ＣＤ５(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd5(String value) {
		setConstString(offset + 196, $fr_cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 (Matching source) 得意先分類名５(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm5() {
		return getConstString(offset + 197, $fr_cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 (Matching source) 得意先分類名５(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm5(String value) {
		setConstString(offset + 197, $fr_cst_grp_nm5, value);
	}


	/**
	 * Customer classification cd. 6 (Matching source) 得意先分類ＣＤ６(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd6() {
		return getConstString(offset + 198, $fr_cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 (Matching source) 得意先分類ＣＤ６(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd6(String value) {
		setConstString(offset + 198, $fr_cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 (Matching source) 得意先分類名６(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm6() {
		return getConstString(offset + 199, $fr_cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 (Matching source) 得意先分類名６(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm6(String value) {
		setConstString(offset + 199, $fr_cst_grp_nm6, value);
	}


	/**
	 * Customer classification cd. 7 (Matching source) 得意先分類ＣＤ７(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd7() {
		return getConstString(offset + 200, $fr_cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 (Matching source) 得意先分類ＣＤ７(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd7(String value) {
		setConstString(offset + 200, $fr_cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 (Matching source) 得意先分類名７(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm7() {
		return getConstString(offset + 201, $fr_cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 (Matching source) 得意先分類名７(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm7(String value) {
		setConstString(offset + 201, $fr_cst_grp_nm7, value);
	}


	/**
	 * Customer classification cd. 8 (Matching source) 得意先分類ＣＤ８(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd8() {
		return getConstString(offset + 202, $fr_cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 (Matching source) 得意先分類ＣＤ８(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd8(String value) {
		setConstString(offset + 202, $fr_cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 (Matching source) 得意先分類名８(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm8() {
		return getConstString(offset + 203, $fr_cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 (Matching source) 得意先分類名８(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm8(String value) {
		setConstString(offset + 203, $fr_cst_grp_nm8, value);
	}


	/**
	 * Customer classification cd. 9 (Matching source) 得意先分類ＣＤ９(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd9() {
		return getConstString(offset + 204, $fr_cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 (Matching source) 得意先分類ＣＤ９(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd9(String value) {
		setConstString(offset + 204, $fr_cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 (Matching source) 得意先分類名９(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm9() {
		return getConstString(offset + 205, $fr_cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 (Matching source) 得意先分類名９(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm9(String value) {
		setConstString(offset + 205, $fr_cst_grp_nm9, value);
	}


	/**
	 * Customer classification cd. 10 (Matching source) 得意先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd10() {
		return getConstString(offset + 206, $fr_cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 (Matching source) 得意先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd10(String value) {
		setConstString(offset + 206, $fr_cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 (Matching source) 得意先分類名１０(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm10() {
		return getConstString(offset + 207, $fr_cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 (Matching source) 得意先分類名１０(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm10(String value) {
		setConstString(offset + 207, $fr_cst_grp_nm10, value);
	}


	/**
	 * Entry user ID (Matching destination) 登録ユーザＩＤ(消込先).<p>
	 *
	 */
	public String to_ins_usr_id() {
		return getConstString(offset + 208, $to_ins_usr_id);
	}

	/**
	 * Entry user ID (Matching destination) 登録ユーザＩＤ(消込先).<p>
	 *
	 */
	public void to_ins_usr_id(String value) {
		setConstString(offset + 208, $to_ins_usr_id, value);
	}


	/**
	 * Entry user name (Matching destination) 登録ユーザ名(消込先).<p>
	 *
	 */
	public String to_ins_usr_nm() {
		return getConstString(offset + 209, $to_ins_usr_nm);
	}

	/**
	 * Entry user name (Matching destination) 登録ユーザ名(消込先).<p>
	 *
	 */
	public void to_ins_usr_nm(String value) {
		setConstString(offset + 209, $to_ins_usr_nm, value);
	}


	/**
	 * Entry function ID (Matching destination) 登録機能ＩＤ(消込先).<p>
	 *
	 */
	public String to_ins_func_id() {
		return getConstString(offset + 210, $to_ins_func_id);
	}

	/**
	 * Entry function ID (Matching destination) 登録機能ＩＤ(消込先).<p>
	 *
	 */
	public void to_ins_func_id(String value) {
		setConstString(offset + 210, $to_ins_func_id, value);
	}


	/**
	 * Entry function name (Matching destination) 登録機能名(消込先).<p>
	 *
	 */
	public String to_ins_func_nm() {
		return getConstString(offset + 211, $to_ins_func_nm);
	}

	/**
	 * Entry function name (Matching destination) 登録機能名(消込先).<p>
	 *
	 */
	public void to_ins_func_nm(String value) {
		setConstString(offset + 211, $to_ins_func_nm, value);
	}


	/**
	 * Entry date and time (Matching destination) 登録日時(消込先).<p>
	 *
	 */
	public MCTimestamp to_ins_ts() {
		return getConstTimestamp(offset + 212, $to_ins_ts);
	}

	/**
	 * Entry date and time (Matching destination) 登録日時(消込先).<p>
	 *
	 */
	public void to_ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 212, $to_ins_ts, value);
	}


	/**
	 * Update user ID (Matching destination) 更新ユーザＩＤ(消込先).<p>
	 *
	 */
	public String to_upd_usr_id() {
		return getConstString(offset + 213, $to_upd_usr_id);
	}

	/**
	 * Update user ID (Matching destination) 更新ユーザＩＤ(消込先).<p>
	 *
	 */
	public void to_upd_usr_id(String value) {
		setConstString(offset + 213, $to_upd_usr_id, value);
	}


	/**
	 * Update user name (Matching destination) 更新ユーザ名(消込先).<p>
	 *
	 */
	public String to_upd_usr_nm() {
		return getConstString(offset + 214, $to_upd_usr_nm);
	}

	/**
	 * Update user name (Matching destination) 更新ユーザ名(消込先).<p>
	 *
	 */
	public void to_upd_usr_nm(String value) {
		setConstString(offset + 214, $to_upd_usr_nm, value);
	}


	/**
	 * Update function ID (Matching destination) 更新機能ＩＤ(消込先).<p>
	 *
	 */
	public String to_upd_func_id() {
		return getConstString(offset + 215, $to_upd_func_id);
	}

	/**
	 * Update function ID (Matching destination) 更新機能ＩＤ(消込先).<p>
	 *
	 */
	public void to_upd_func_id(String value) {
		setConstString(offset + 215, $to_upd_func_id, value);
	}


	/**
	 * Update function name (Matching destination) 更新機能名(消込先).<p>
	 *
	 */
	public String to_upd_func_nm() {
		return getConstString(offset + 216, $to_upd_func_nm);
	}

	/**
	 * Update function name (Matching destination) 更新機能名(消込先).<p>
	 *
	 */
	public void to_upd_func_nm(String value) {
		setConstString(offset + 216, $to_upd_func_nm, value);
	}


	/**
	 * Update date and time (Matching destination) 更新日時(消込先).<p>
	 *
	 */
	public MCTimestamp to_upd_ts() {
		return getConstTimestamp(offset + 217, $to_upd_ts);
	}

	/**
	 * Update date and time (Matching destination) 更新日時(消込先).<p>
	 *
	 */
	public void to_upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 217, $to_upd_ts, value);
	}


	/**
	 * Update request No. (Matching destination) 更新リクエストＮＯ(消込先).<p>
	 *
	 */
	public String to_upd_srv_req_no() {
		return getConstString(offset + 218, $to_upd_srv_req_no);
	}

	/**
	 * Update request No. (Matching destination) 更新リクエストＮＯ(消込先).<p>
	 *
	 */
	public void to_upd_srv_req_no(String value) {
		setConstString(offset + 218, $to_upd_srv_req_no, value);
	}


	/**
	 * Entry user ID (Matching source) 登録ユーザＩＤ(消込元).<p>
	 *
	 */
	public String fr_ins_usr_id() {
		return getConstString(offset + 219, $fr_ins_usr_id);
	}

	/**
	 * Entry user ID (Matching source) 登録ユーザＩＤ(消込元).<p>
	 *
	 */
	public void fr_ins_usr_id(String value) {
		setConstString(offset + 219, $fr_ins_usr_id, value);
	}


	/**
	 * Entry user name (Matching source) 登録ユーザ名(消込元).<p>
	 *
	 */
	public String fr_ins_usr_nm() {
		return getConstString(offset + 220, $fr_ins_usr_nm);
	}

	/**
	 * Entry user name (Matching source) 登録ユーザ名(消込元).<p>
	 *
	 */
	public void fr_ins_usr_nm(String value) {
		setConstString(offset + 220, $fr_ins_usr_nm, value);
	}


	/**
	 * Entry function ID (Matching source) 登録機能ＩＤ(消込元).<p>
	 *
	 */
	public String fr_ins_func_id() {
		return getConstString(offset + 221, $fr_ins_func_id);
	}

	/**
	 * Entry function ID (Matching source) 登録機能ＩＤ(消込元).<p>
	 *
	 */
	public void fr_ins_func_id(String value) {
		setConstString(offset + 221, $fr_ins_func_id, value);
	}


	/**
	 * Entry function name (Matching source) 登録機能名(消込元).<p>
	 *
	 */
	public String fr_ins_func_nm() {
		return getConstString(offset + 222, $fr_ins_func_nm);
	}

	/**
	 * Entry function name (Matching source) 登録機能名(消込元).<p>
	 *
	 */
	public void fr_ins_func_nm(String value) {
		setConstString(offset + 222, $fr_ins_func_nm, value);
	}


	/**
	 * Entry date and time (Matching source) 登録日時(消込元).<p>
	 *
	 */
	public MCTimestamp fr_ins_ts() {
		return getConstTimestamp(offset + 223, $fr_ins_ts);
	}

	/**
	 * Entry date and time (Matching source) 登録日時(消込元).<p>
	 *
	 */
	public void fr_ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 223, $fr_ins_ts, value);
	}


	/**
	 * Update user ID (Matching source) 更新ユーザＩＤ(消込元).<p>
	 *
	 */
	public String fr_upd_usr_id() {
		return getConstString(offset + 224, $fr_upd_usr_id);
	}

	/**
	 * Update user ID (Matching source) 更新ユーザＩＤ(消込元).<p>
	 *
	 */
	public void fr_upd_usr_id(String value) {
		setConstString(offset + 224, $fr_upd_usr_id, value);
	}


	/**
	 * Update user name (Matching source) 更新ユーザ名(消込元).<p>
	 *
	 */
	public String fr_upd_usr_nm() {
		return getConstString(offset + 225, $fr_upd_usr_nm);
	}

	/**
	 * Update user name (Matching source) 更新ユーザ名(消込元).<p>
	 *
	 */
	public void fr_upd_usr_nm(String value) {
		setConstString(offset + 225, $fr_upd_usr_nm, value);
	}


	/**
	 * Update function ID (Matching source) 更新機能ＩＤ(消込元).<p>
	 *
	 */
	public String fr_upd_func_id() {
		return getConstString(offset + 226, $fr_upd_func_id);
	}

	/**
	 * Update function ID (Matching source) 更新機能ＩＤ(消込元).<p>
	 *
	 */
	public void fr_upd_func_id(String value) {
		setConstString(offset + 226, $fr_upd_func_id, value);
	}


	/**
	 * Update function name (Matching source) 更新機能名(消込元).<p>
	 *
	 */
	public String fr_upd_func_nm() {
		return getConstString(offset + 227, $fr_upd_func_nm);
	}

	/**
	 * Update function name (Matching source) 更新機能名(消込元).<p>
	 *
	 */
	public void fr_upd_func_nm(String value) {
		setConstString(offset + 227, $fr_upd_func_nm, value);
	}


	/**
	 * Update date and time (Matching source) 更新日時(消込元).<p>
	 *
	 */
	public MCTimestamp fr_upd_ts() {
		return getConstTimestamp(offset + 228, $fr_upd_ts);
	}

	/**
	 * Update date and time (Matching source) 更新日時(消込元).<p>
	 *
	 */
	public void fr_upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 228, $fr_upd_ts, value);
	}


	/**
	 * Update request No. (Matching source) 更新リクエストＮＯ(消込元).<p>
	 *
	 */
	public String fr_upd_srv_req_no() {
		return getConstString(offset + 229, $fr_upd_srv_req_no);
	}

	/**
	 * Update request No. (Matching source) 更新リクエストＮＯ(消込元).<p>
	 *
	 */
	public void fr_upd_srv_req_no(String value) {
		setConstString(offset + 229, $fr_upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($to_dmnd_no.equalsIgnoreCase(name)) {
			return to_dmnd_no();
		}
		if ($to_dmnd_period_typ.equalsIgnoreCase(name)) {
			return to_dmnd_period_typ();
		}
		if ($to_dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			return to_dmnd_period_typ_nm();
		}
		if ($to_dmnd_typ.equalsIgnoreCase(name)) {
			return to_dmnd_typ();
		}
		if ($to_dmnd_typ_nm.equalsIgnoreCase(name)) {
			return to_dmnd_typ_nm();
		}
		if ($fr_dmnd_no.equalsIgnoreCase(name)) {
			return fr_dmnd_no();
		}
		if ($fr_dmnd_period_typ.equalsIgnoreCase(name)) {
			return fr_dmnd_period_typ();
		}
		if ($fr_dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			return fr_dmnd_period_typ_nm();
		}
		if ($fr_dmnd_typ.equalsIgnoreCase(name)) {
			return fr_dmnd_typ();
		}
		if ($fr_dmnd_typ_nm.equalsIgnoreCase(name)) {
			return fr_dmnd_typ_nm();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_nm();
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_cd();
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_nm();
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_cd();
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_nm();
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			return dmnd_wg_cd();
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			return dmnd_wg_nm();
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			return dmnd_site_cd();
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			return dmnd_site_nm();
		}
		if ($to_sno1.equalsIgnoreCase(name)) {
			return to_sno1();
		}
		if ($to_sno2.equalsIgnoreCase(name)) {
			return to_sno2();
		}
		if ($to_sno3.equalsIgnoreCase(name)) {
			return to_sno3();
		}
		if ($to_sno4.equalsIgnoreCase(name)) {
			return to_sno4();
		}
		if ($to_wrk_no.equalsIgnoreCase(name)) {
			return to_wrk_no();
		}
		if ($to_wrk_nm.equalsIgnoreCase(name)) {
			return to_wrk_nm();
		}
		if ($fr_sno1.equalsIgnoreCase(name)) {
			return fr_sno1();
		}
		if ($fr_sno2.equalsIgnoreCase(name)) {
			return fr_sno2();
		}
		if ($fr_sno3.equalsIgnoreCase(name)) {
			return fr_sno3();
		}
		if ($fr_sno4.equalsIgnoreCase(name)) {
			return fr_sno4();
		}
		if ($fr_wrk_no.equalsIgnoreCase(name)) {
			return fr_wrk_no();
		}
		if ($fr_wrk_nm.equalsIgnoreCase(name)) {
			return fr_wrk_nm();
		}
		if ($to_dmnd_usr_cd.equalsIgnoreCase(name)) {
			return to_dmnd_usr_cd();
		}
		if ($to_dmnd_usr_nm.equalsIgnoreCase(name)) {
			return to_dmnd_usr_nm();
		}
		if ($to_dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return to_dmnd_dpt_cd();
		}
		if ($to_dmnd_dpt_nm.equalsIgnoreCase(name)) {
			return to_dmnd_dpt_nm();
		}
		if ($fr_dmnd_usr_cd.equalsIgnoreCase(name)) {
			return fr_dmnd_usr_cd();
		}
		if ($fr_dmnd_usr_nm.equalsIgnoreCase(name)) {
			return fr_dmnd_usr_nm();
		}
		if ($fr_dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return fr_dmnd_dpt_cd();
		}
		if ($fr_dmnd_dpt_nm.equalsIgnoreCase(name)) {
			return fr_dmnd_dpt_nm();
		}
		if ($to_dlv_cd.equalsIgnoreCase(name)) {
			return to_dlv_cd();
		}
		if ($to_dlv_nm.equalsIgnoreCase(name)) {
			return to_dlv_nm();
		}
		if ($to_cst_cd.equalsIgnoreCase(name)) {
			return to_cst_cd();
		}
		if ($to_cst_nm.equalsIgnoreCase(name)) {
			return to_cst_nm();
		}
		if ($fr_dlv_cd.equalsIgnoreCase(name)) {
			return fr_dlv_cd();
		}
		if ($fr_dlv_nm.equalsIgnoreCase(name)) {
			return fr_dlv_nm();
		}
		if ($fr_cst_cd.equalsIgnoreCase(name)) {
			return fr_cst_cd();
		}
		if ($fr_cst_nm.equalsIgnoreCase(name)) {
			return fr_cst_nm();
		}
		if ($to_spln_vers.equalsIgnoreCase(name)) {
			return to_spln_vers();
		}
		if ($to_spln_itm_cd.equalsIgnoreCase(name)) {
			return to_spln_itm_cd();
		}
		if ($to_spln_itm_nm.equalsIgnoreCase(name)) {
			return to_spln_itm_nm();
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			return to_cur_cd();
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			return to_cur_nm();
		}
		if ($to_cst_frcst_no.equalsIgnoreCase(name)) {
			return to_cst_frcst_no();
		}
		if ($to_cst_frcst_d_no.equalsIgnoreCase(name)) {
			return to_cst_frcst_d_no();
		}
		if ($to_slo_no.equalsIgnoreCase(name)) {
			return to_slo_no();
		}
		if ($to_slo_d_no.equalsIgnoreCase(name)) {
			return to_slo_d_no();
		}
		if ($fr_spln_vers.equalsIgnoreCase(name)) {
			return fr_spln_vers();
		}
		if ($fr_spln_itm_cd.equalsIgnoreCase(name)) {
			return fr_spln_itm_cd();
		}
		if ($fr_spln_itm_nm.equalsIgnoreCase(name)) {
			return fr_spln_itm_nm();
		}
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			return fr_cur_cd();
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			return fr_cur_nm();
		}
		if ($fr_cst_frcst_no.equalsIgnoreCase(name)) {
			return fr_cst_frcst_no();
		}
		if ($fr_cst_frcst_d_no.equalsIgnoreCase(name)) {
			return fr_cst_frcst_d_no();
		}
		if ($fr_slo_no.equalsIgnoreCase(name)) {
			return fr_slo_no();
		}
		if ($fr_slo_d_no.equalsIgnoreCase(name)) {
			return fr_slo_d_no();
		}
		if ($to_intr_rmrks.equalsIgnoreCase(name)) {
			return to_intr_rmrks();
		}
		if ($to_sub_char1.equalsIgnoreCase(name)) {
			return to_sub_char1();
		}
		if ($to_sub_char2.equalsIgnoreCase(name)) {
			return to_sub_char2();
		}
		if ($to_sub_char3.equalsIgnoreCase(name)) {
			return to_sub_char3();
		}
		if ($fr_intr_rmrks.equalsIgnoreCase(name)) {
			return fr_intr_rmrks();
		}
		if ($fr_sub_char1.equalsIgnoreCase(name)) {
			return fr_sub_char1();
		}
		if ($fr_sub_char2.equalsIgnoreCase(name)) {
			return fr_sub_char2();
		}
		if ($fr_sub_char3.equalsIgnoreCase(name)) {
			return fr_sub_char3();
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
		if ($to_dlv_grp_cd1.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd1();
		}
		if ($to_dlv_grp_nm1.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm1();
		}
		if ($to_dlv_grp_cd2.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd2();
		}
		if ($to_dlv_grp_nm2.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm2();
		}
		if ($to_dlv_grp_cd3.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd3();
		}
		if ($to_dlv_grp_nm3.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm3();
		}
		if ($to_dlv_grp_cd4.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd4();
		}
		if ($to_dlv_grp_nm4.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm4();
		}
		if ($to_dlv_grp_cd5.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd5();
		}
		if ($to_dlv_grp_nm5.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm5();
		}
		if ($to_dlv_grp_cd6.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd6();
		}
		if ($to_dlv_grp_nm6.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm6();
		}
		if ($to_dlv_grp_cd7.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd7();
		}
		if ($to_dlv_grp_nm7.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm7();
		}
		if ($to_dlv_grp_cd8.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd8();
		}
		if ($to_dlv_grp_nm8.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm8();
		}
		if ($to_dlv_grp_cd9.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd9();
		}
		if ($to_dlv_grp_nm9.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm9();
		}
		if ($to_dlv_grp_cd10.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd10();
		}
		if ($to_dlv_grp_nm10.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm10();
		}
		if ($fr_dlv_grp_cd1.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd1();
		}
		if ($fr_dlv_grp_nm1.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm1();
		}
		if ($fr_dlv_grp_cd2.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd2();
		}
		if ($fr_dlv_grp_nm2.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm2();
		}
		if ($fr_dlv_grp_cd3.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd3();
		}
		if ($fr_dlv_grp_nm3.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm3();
		}
		if ($fr_dlv_grp_cd4.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd4();
		}
		if ($fr_dlv_grp_nm4.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm4();
		}
		if ($fr_dlv_grp_cd5.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd5();
		}
		if ($fr_dlv_grp_nm5.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm5();
		}
		if ($fr_dlv_grp_cd6.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd6();
		}
		if ($fr_dlv_grp_nm6.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm6();
		}
		if ($fr_dlv_grp_cd7.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd7();
		}
		if ($fr_dlv_grp_nm7.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm7();
		}
		if ($fr_dlv_grp_cd8.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd8();
		}
		if ($fr_dlv_grp_nm8.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm8();
		}
		if ($fr_dlv_grp_cd9.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd9();
		}
		if ($fr_dlv_grp_nm9.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm9();
		}
		if ($fr_dlv_grp_cd10.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd10();
		}
		if ($fr_dlv_grp_nm10.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm10();
		}
		if ($to_cst_grp_cd1.equalsIgnoreCase(name)) {
			return to_cst_grp_cd1();
		}
		if ($to_cst_grp_nm1.equalsIgnoreCase(name)) {
			return to_cst_grp_nm1();
		}
		if ($to_cst_grp_cd2.equalsIgnoreCase(name)) {
			return to_cst_grp_cd2();
		}
		if ($to_cst_grp_nm2.equalsIgnoreCase(name)) {
			return to_cst_grp_nm2();
		}
		if ($to_cst_grp_cd3.equalsIgnoreCase(name)) {
			return to_cst_grp_cd3();
		}
		if ($to_cst_grp_nm3.equalsIgnoreCase(name)) {
			return to_cst_grp_nm3();
		}
		if ($to_cst_grp_cd4.equalsIgnoreCase(name)) {
			return to_cst_grp_cd4();
		}
		if ($to_cst_grp_nm4.equalsIgnoreCase(name)) {
			return to_cst_grp_nm4();
		}
		if ($to_cst_grp_cd5.equalsIgnoreCase(name)) {
			return to_cst_grp_cd5();
		}
		if ($to_cst_grp_nm5.equalsIgnoreCase(name)) {
			return to_cst_grp_nm5();
		}
		if ($to_cst_grp_cd6.equalsIgnoreCase(name)) {
			return to_cst_grp_cd6();
		}
		if ($to_cst_grp_nm6.equalsIgnoreCase(name)) {
			return to_cst_grp_nm6();
		}
		if ($to_cst_grp_cd7.equalsIgnoreCase(name)) {
			return to_cst_grp_cd7();
		}
		if ($to_cst_grp_nm7.equalsIgnoreCase(name)) {
			return to_cst_grp_nm7();
		}
		if ($to_cst_grp_cd8.equalsIgnoreCase(name)) {
			return to_cst_grp_cd8();
		}
		if ($to_cst_grp_nm8.equalsIgnoreCase(name)) {
			return to_cst_grp_nm8();
		}
		if ($to_cst_grp_cd9.equalsIgnoreCase(name)) {
			return to_cst_grp_cd9();
		}
		if ($to_cst_grp_nm9.equalsIgnoreCase(name)) {
			return to_cst_grp_nm9();
		}
		if ($to_cst_grp_cd10.equalsIgnoreCase(name)) {
			return to_cst_grp_cd10();
		}
		if ($to_cst_grp_nm10.equalsIgnoreCase(name)) {
			return to_cst_grp_nm10();
		}
		if ($fr_cst_grp_cd1.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd1();
		}
		if ($fr_cst_grp_nm1.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm1();
		}
		if ($fr_cst_grp_cd2.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd2();
		}
		if ($fr_cst_grp_nm2.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm2();
		}
		if ($fr_cst_grp_cd3.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd3();
		}
		if ($fr_cst_grp_nm3.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm3();
		}
		if ($fr_cst_grp_cd4.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd4();
		}
		if ($fr_cst_grp_nm4.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm4();
		}
		if ($fr_cst_grp_cd5.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd5();
		}
		if ($fr_cst_grp_nm5.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm5();
		}
		if ($fr_cst_grp_cd6.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd6();
		}
		if ($fr_cst_grp_nm6.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm6();
		}
		if ($fr_cst_grp_cd7.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd7();
		}
		if ($fr_cst_grp_nm7.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm7();
		}
		if ($fr_cst_grp_cd8.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd8();
		}
		if ($fr_cst_grp_nm8.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm8();
		}
		if ($fr_cst_grp_cd9.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd9();
		}
		if ($fr_cst_grp_nm9.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm9();
		}
		if ($fr_cst_grp_cd10.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd10();
		}
		if ($fr_cst_grp_nm10.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm10();
		}
		if ($to_ins_usr_id.equalsIgnoreCase(name)) {
			return to_ins_usr_id();
		}
		if ($to_ins_usr_nm.equalsIgnoreCase(name)) {
			return to_ins_usr_nm();
		}
		if ($to_ins_func_id.equalsIgnoreCase(name)) {
			return to_ins_func_id();
		}
		if ($to_ins_func_nm.equalsIgnoreCase(name)) {
			return to_ins_func_nm();
		}
		if ($to_upd_usr_id.equalsIgnoreCase(name)) {
			return to_upd_usr_id();
		}
		if ($to_upd_usr_nm.equalsIgnoreCase(name)) {
			return to_upd_usr_nm();
		}
		if ($to_upd_func_id.equalsIgnoreCase(name)) {
			return to_upd_func_id();
		}
		if ($to_upd_func_nm.equalsIgnoreCase(name)) {
			return to_upd_func_nm();
		}
		if ($to_upd_srv_req_no.equalsIgnoreCase(name)) {
			return to_upd_srv_req_no();
		}
		if ($fr_ins_usr_id.equalsIgnoreCase(name)) {
			return fr_ins_usr_id();
		}
		if ($fr_ins_usr_nm.equalsIgnoreCase(name)) {
			return fr_ins_usr_nm();
		}
		if ($fr_ins_func_id.equalsIgnoreCase(name)) {
			return fr_ins_func_id();
		}
		if ($fr_ins_func_nm.equalsIgnoreCase(name)) {
			return fr_ins_func_nm();
		}
		if ($fr_upd_usr_id.equalsIgnoreCase(name)) {
			return fr_upd_usr_id();
		}
		if ($fr_upd_usr_nm.equalsIgnoreCase(name)) {
			return fr_upd_usr_nm();
		}
		if ($fr_upd_func_id.equalsIgnoreCase(name)) {
			return fr_upd_func_id();
		}
		if ($fr_upd_func_nm.equalsIgnoreCase(name)) {
			return fr_upd_func_nm();
		}
		if ($fr_upd_srv_req_no.equalsIgnoreCase(name)) {
			return fr_upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			return to_input_qty();
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			return to_dmnd_qty();
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			return to_rec_qty();
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			return fr_input_qty();
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			return fr_dmnd_qty();
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			return fr_rec_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($to_dmnd_dt.equalsIgnoreCase(name)) {
			return to_dmnd_dt();
		}
		if ($to_dmnd_st_dt.equalsIgnoreCase(name)) {
			return to_dmnd_st_dt();
		}
		if ($to_dmnd_end_dt.equalsIgnoreCase(name)) {
			return to_dmnd_end_dt();
		}
		if ($to_dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return to_dlv_schd_st_dt();
		}
		if ($to_dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return to_dlv_schd_end_dt();
		}
		if ($fr_dmnd_dt.equalsIgnoreCase(name)) {
			return fr_dmnd_dt();
		}
		if ($fr_dmnd_st_dt.equalsIgnoreCase(name)) {
			return fr_dmnd_st_dt();
		}
		if ($fr_dmnd_end_dt.equalsIgnoreCase(name)) {
			return fr_dmnd_end_dt();
		}
		if ($fr_dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return fr_dlv_schd_st_dt();
		}
		if ($fr_dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return fr_dlv_schd_end_dt();
		}
		if ($to_ym.equalsIgnoreCase(name)) {
			return to_ym();
		}
		if ($fr_ym.equalsIgnoreCase(name)) {
			return fr_ym();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($to_ins_ts.equalsIgnoreCase(name)) {
			return to_ins_ts();
		}
		if ($to_upd_ts.equalsIgnoreCase(name)) {
			return to_upd_ts();
		}
		if ($fr_ins_ts.equalsIgnoreCase(name)) {
			return fr_ins_ts();
		}
		if ($fr_upd_ts.equalsIgnoreCase(name)) {
			return fr_upd_ts();
		}
		return super.getTimestamp(name);
	}

	public String getStringNE(String name) {
		if ($to_dmnd_no.equalsIgnoreCase(name)) {
			return to_dmnd_no();
		}
		if ($to_dmnd_period_typ.equalsIgnoreCase(name)) {
			return to_dmnd_period_typ();
		}
		if ($to_dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			return to_dmnd_period_typ_nm();
		}
		if ($to_dmnd_typ.equalsIgnoreCase(name)) {
			return to_dmnd_typ();
		}
		if ($to_dmnd_typ_nm.equalsIgnoreCase(name)) {
			return to_dmnd_typ_nm();
		}
		if ($fr_dmnd_no.equalsIgnoreCase(name)) {
			return fr_dmnd_no();
		}
		if ($fr_dmnd_period_typ.equalsIgnoreCase(name)) {
			return fr_dmnd_period_typ();
		}
		if ($fr_dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			return fr_dmnd_period_typ_nm();
		}
		if ($fr_dmnd_typ.equalsIgnoreCase(name)) {
			return fr_dmnd_typ();
		}
		if ($fr_dmnd_typ_nm.equalsIgnoreCase(name)) {
			return fr_dmnd_typ_nm();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_nm();
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_cd();
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_nm();
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_cd();
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_nm();
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			return dmnd_wg_cd();
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			return dmnd_wg_nm();
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			return dmnd_site_cd();
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			return dmnd_site_nm();
		}
		if ($to_sno1.equalsIgnoreCase(name)) {
			return to_sno1();
		}
		if ($to_sno2.equalsIgnoreCase(name)) {
			return to_sno2();
		}
		if ($to_sno3.equalsIgnoreCase(name)) {
			return to_sno3();
		}
		if ($to_sno4.equalsIgnoreCase(name)) {
			return to_sno4();
		}
		if ($to_wrk_no.equalsIgnoreCase(name)) {
			return to_wrk_no();
		}
		if ($to_wrk_nm.equalsIgnoreCase(name)) {
			return to_wrk_nm();
		}
		if ($fr_sno1.equalsIgnoreCase(name)) {
			return fr_sno1();
		}
		if ($fr_sno2.equalsIgnoreCase(name)) {
			return fr_sno2();
		}
		if ($fr_sno3.equalsIgnoreCase(name)) {
			return fr_sno3();
		}
		if ($fr_sno4.equalsIgnoreCase(name)) {
			return fr_sno4();
		}
		if ($fr_wrk_no.equalsIgnoreCase(name)) {
			return fr_wrk_no();
		}
		if ($fr_wrk_nm.equalsIgnoreCase(name)) {
			return fr_wrk_nm();
		}
		if ($to_dmnd_usr_cd.equalsIgnoreCase(name)) {
			return to_dmnd_usr_cd();
		}
		if ($to_dmnd_usr_nm.equalsIgnoreCase(name)) {
			return to_dmnd_usr_nm();
		}
		if ($to_dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return to_dmnd_dpt_cd();
		}
		if ($to_dmnd_dpt_nm.equalsIgnoreCase(name)) {
			return to_dmnd_dpt_nm();
		}
		if ($fr_dmnd_usr_cd.equalsIgnoreCase(name)) {
			return fr_dmnd_usr_cd();
		}
		if ($fr_dmnd_usr_nm.equalsIgnoreCase(name)) {
			return fr_dmnd_usr_nm();
		}
		if ($fr_dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return fr_dmnd_dpt_cd();
		}
		if ($fr_dmnd_dpt_nm.equalsIgnoreCase(name)) {
			return fr_dmnd_dpt_nm();
		}
		if ($to_dlv_cd.equalsIgnoreCase(name)) {
			return to_dlv_cd();
		}
		if ($to_dlv_nm.equalsIgnoreCase(name)) {
			return to_dlv_nm();
		}
		if ($to_cst_cd.equalsIgnoreCase(name)) {
			return to_cst_cd();
		}
		if ($to_cst_nm.equalsIgnoreCase(name)) {
			return to_cst_nm();
		}
		if ($fr_dlv_cd.equalsIgnoreCase(name)) {
			return fr_dlv_cd();
		}
		if ($fr_dlv_nm.equalsIgnoreCase(name)) {
			return fr_dlv_nm();
		}
		if ($fr_cst_cd.equalsIgnoreCase(name)) {
			return fr_cst_cd();
		}
		if ($fr_cst_nm.equalsIgnoreCase(name)) {
			return fr_cst_nm();
		}
		if ($to_spln_vers.equalsIgnoreCase(name)) {
			return to_spln_vers();
		}
		if ($to_spln_itm_cd.equalsIgnoreCase(name)) {
			return to_spln_itm_cd();
		}
		if ($to_spln_itm_nm.equalsIgnoreCase(name)) {
			return to_spln_itm_nm();
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			return to_cur_cd();
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			return to_cur_nm();
		}
		if ($to_cst_frcst_no.equalsIgnoreCase(name)) {
			return to_cst_frcst_no();
		}
		if ($to_cst_frcst_d_no.equalsIgnoreCase(name)) {
			return to_cst_frcst_d_no();
		}
		if ($to_slo_no.equalsIgnoreCase(name)) {
			return to_slo_no();
		}
		if ($to_slo_d_no.equalsIgnoreCase(name)) {
			return to_slo_d_no();
		}
		if ($fr_spln_vers.equalsIgnoreCase(name)) {
			return fr_spln_vers();
		}
		if ($fr_spln_itm_cd.equalsIgnoreCase(name)) {
			return fr_spln_itm_cd();
		}
		if ($fr_spln_itm_nm.equalsIgnoreCase(name)) {
			return fr_spln_itm_nm();
		}
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			return fr_cur_cd();
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			return fr_cur_nm();
		}
		if ($fr_cst_frcst_no.equalsIgnoreCase(name)) {
			return fr_cst_frcst_no();
		}
		if ($fr_cst_frcst_d_no.equalsIgnoreCase(name)) {
			return fr_cst_frcst_d_no();
		}
		if ($fr_slo_no.equalsIgnoreCase(name)) {
			return fr_slo_no();
		}
		if ($fr_slo_d_no.equalsIgnoreCase(name)) {
			return fr_slo_d_no();
		}
		if ($to_intr_rmrks.equalsIgnoreCase(name)) {
			return to_intr_rmrks();
		}
		if ($to_sub_char1.equalsIgnoreCase(name)) {
			return to_sub_char1();
		}
		if ($to_sub_char2.equalsIgnoreCase(name)) {
			return to_sub_char2();
		}
		if ($to_sub_char3.equalsIgnoreCase(name)) {
			return to_sub_char3();
		}
		if ($fr_intr_rmrks.equalsIgnoreCase(name)) {
			return fr_intr_rmrks();
		}
		if ($fr_sub_char1.equalsIgnoreCase(name)) {
			return fr_sub_char1();
		}
		if ($fr_sub_char2.equalsIgnoreCase(name)) {
			return fr_sub_char2();
		}
		if ($fr_sub_char3.equalsIgnoreCase(name)) {
			return fr_sub_char3();
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
		if ($to_dlv_grp_cd1.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd1();
		}
		if ($to_dlv_grp_nm1.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm1();
		}
		if ($to_dlv_grp_cd2.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd2();
		}
		if ($to_dlv_grp_nm2.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm2();
		}
		if ($to_dlv_grp_cd3.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd3();
		}
		if ($to_dlv_grp_nm3.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm3();
		}
		if ($to_dlv_grp_cd4.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd4();
		}
		if ($to_dlv_grp_nm4.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm4();
		}
		if ($to_dlv_grp_cd5.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd5();
		}
		if ($to_dlv_grp_nm5.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm5();
		}
		if ($to_dlv_grp_cd6.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd6();
		}
		if ($to_dlv_grp_nm6.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm6();
		}
		if ($to_dlv_grp_cd7.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd7();
		}
		if ($to_dlv_grp_nm7.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm7();
		}
		if ($to_dlv_grp_cd8.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd8();
		}
		if ($to_dlv_grp_nm8.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm8();
		}
		if ($to_dlv_grp_cd9.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd9();
		}
		if ($to_dlv_grp_nm9.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm9();
		}
		if ($to_dlv_grp_cd10.equalsIgnoreCase(name)) {
			return to_dlv_grp_cd10();
		}
		if ($to_dlv_grp_nm10.equalsIgnoreCase(name)) {
			return to_dlv_grp_nm10();
		}
		if ($fr_dlv_grp_cd1.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd1();
		}
		if ($fr_dlv_grp_nm1.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm1();
		}
		if ($fr_dlv_grp_cd2.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd2();
		}
		if ($fr_dlv_grp_nm2.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm2();
		}
		if ($fr_dlv_grp_cd3.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd3();
		}
		if ($fr_dlv_grp_nm3.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm3();
		}
		if ($fr_dlv_grp_cd4.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd4();
		}
		if ($fr_dlv_grp_nm4.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm4();
		}
		if ($fr_dlv_grp_cd5.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd5();
		}
		if ($fr_dlv_grp_nm5.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm5();
		}
		if ($fr_dlv_grp_cd6.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd6();
		}
		if ($fr_dlv_grp_nm6.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm6();
		}
		if ($fr_dlv_grp_cd7.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd7();
		}
		if ($fr_dlv_grp_nm7.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm7();
		}
		if ($fr_dlv_grp_cd8.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd8();
		}
		if ($fr_dlv_grp_nm8.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm8();
		}
		if ($fr_dlv_grp_cd9.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd9();
		}
		if ($fr_dlv_grp_nm9.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm9();
		}
		if ($fr_dlv_grp_cd10.equalsIgnoreCase(name)) {
			return fr_dlv_grp_cd10();
		}
		if ($fr_dlv_grp_nm10.equalsIgnoreCase(name)) {
			return fr_dlv_grp_nm10();
		}
		if ($to_cst_grp_cd1.equalsIgnoreCase(name)) {
			return to_cst_grp_cd1();
		}
		if ($to_cst_grp_nm1.equalsIgnoreCase(name)) {
			return to_cst_grp_nm1();
		}
		if ($to_cst_grp_cd2.equalsIgnoreCase(name)) {
			return to_cst_grp_cd2();
		}
		if ($to_cst_grp_nm2.equalsIgnoreCase(name)) {
			return to_cst_grp_nm2();
		}
		if ($to_cst_grp_cd3.equalsIgnoreCase(name)) {
			return to_cst_grp_cd3();
		}
		if ($to_cst_grp_nm3.equalsIgnoreCase(name)) {
			return to_cst_grp_nm3();
		}
		if ($to_cst_grp_cd4.equalsIgnoreCase(name)) {
			return to_cst_grp_cd4();
		}
		if ($to_cst_grp_nm4.equalsIgnoreCase(name)) {
			return to_cst_grp_nm4();
		}
		if ($to_cst_grp_cd5.equalsIgnoreCase(name)) {
			return to_cst_grp_cd5();
		}
		if ($to_cst_grp_nm5.equalsIgnoreCase(name)) {
			return to_cst_grp_nm5();
		}
		if ($to_cst_grp_cd6.equalsIgnoreCase(name)) {
			return to_cst_grp_cd6();
		}
		if ($to_cst_grp_nm6.equalsIgnoreCase(name)) {
			return to_cst_grp_nm6();
		}
		if ($to_cst_grp_cd7.equalsIgnoreCase(name)) {
			return to_cst_grp_cd7();
		}
		if ($to_cst_grp_nm7.equalsIgnoreCase(name)) {
			return to_cst_grp_nm7();
		}
		if ($to_cst_grp_cd8.equalsIgnoreCase(name)) {
			return to_cst_grp_cd8();
		}
		if ($to_cst_grp_nm8.equalsIgnoreCase(name)) {
			return to_cst_grp_nm8();
		}
		if ($to_cst_grp_cd9.equalsIgnoreCase(name)) {
			return to_cst_grp_cd9();
		}
		if ($to_cst_grp_nm9.equalsIgnoreCase(name)) {
			return to_cst_grp_nm9();
		}
		if ($to_cst_grp_cd10.equalsIgnoreCase(name)) {
			return to_cst_grp_cd10();
		}
		if ($to_cst_grp_nm10.equalsIgnoreCase(name)) {
			return to_cst_grp_nm10();
		}
		if ($fr_cst_grp_cd1.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd1();
		}
		if ($fr_cst_grp_nm1.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm1();
		}
		if ($fr_cst_grp_cd2.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd2();
		}
		if ($fr_cst_grp_nm2.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm2();
		}
		if ($fr_cst_grp_cd3.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd3();
		}
		if ($fr_cst_grp_nm3.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm3();
		}
		if ($fr_cst_grp_cd4.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd4();
		}
		if ($fr_cst_grp_nm4.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm4();
		}
		if ($fr_cst_grp_cd5.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd5();
		}
		if ($fr_cst_grp_nm5.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm5();
		}
		if ($fr_cst_grp_cd6.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd6();
		}
		if ($fr_cst_grp_nm6.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm6();
		}
		if ($fr_cst_grp_cd7.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd7();
		}
		if ($fr_cst_grp_nm7.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm7();
		}
		if ($fr_cst_grp_cd8.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd8();
		}
		if ($fr_cst_grp_nm8.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm8();
		}
		if ($fr_cst_grp_cd9.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd9();
		}
		if ($fr_cst_grp_nm9.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm9();
		}
		if ($fr_cst_grp_cd10.equalsIgnoreCase(name)) {
			return fr_cst_grp_cd10();
		}
		if ($fr_cst_grp_nm10.equalsIgnoreCase(name)) {
			return fr_cst_grp_nm10();
		}
		if ($to_ins_usr_id.equalsIgnoreCase(name)) {
			return to_ins_usr_id();
		}
		if ($to_ins_usr_nm.equalsIgnoreCase(name)) {
			return to_ins_usr_nm();
		}
		if ($to_ins_func_id.equalsIgnoreCase(name)) {
			return to_ins_func_id();
		}
		if ($to_ins_func_nm.equalsIgnoreCase(name)) {
			return to_ins_func_nm();
		}
		if ($to_upd_usr_id.equalsIgnoreCase(name)) {
			return to_upd_usr_id();
		}
		if ($to_upd_usr_nm.equalsIgnoreCase(name)) {
			return to_upd_usr_nm();
		}
		if ($to_upd_func_id.equalsIgnoreCase(name)) {
			return to_upd_func_id();
		}
		if ($to_upd_func_nm.equalsIgnoreCase(name)) {
			return to_upd_func_nm();
		}
		if ($to_upd_srv_req_no.equalsIgnoreCase(name)) {
			return to_upd_srv_req_no();
		}
		if ($fr_ins_usr_id.equalsIgnoreCase(name)) {
			return fr_ins_usr_id();
		}
		if ($fr_ins_usr_nm.equalsIgnoreCase(name)) {
			return fr_ins_usr_nm();
		}
		if ($fr_ins_func_id.equalsIgnoreCase(name)) {
			return fr_ins_func_id();
		}
		if ($fr_ins_func_nm.equalsIgnoreCase(name)) {
			return fr_ins_func_nm();
		}
		if ($fr_upd_usr_id.equalsIgnoreCase(name)) {
			return fr_upd_usr_id();
		}
		if ($fr_upd_usr_nm.equalsIgnoreCase(name)) {
			return fr_upd_usr_nm();
		}
		if ($fr_upd_func_id.equalsIgnoreCase(name)) {
			return fr_upd_func_id();
		}
		if ($fr_upd_func_nm.equalsIgnoreCase(name)) {
			return fr_upd_func_nm();
		}
		if ($fr_upd_srv_req_no.equalsIgnoreCase(name)) {
			return fr_upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			return to_input_qty();
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			return to_dmnd_qty();
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			return to_rec_qty();
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			return fr_input_qty();
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			return fr_dmnd_qty();
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			return fr_rec_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($to_dmnd_dt.equalsIgnoreCase(name)) {
			return to_dmnd_dt();
		}
		if ($to_dmnd_st_dt.equalsIgnoreCase(name)) {
			return to_dmnd_st_dt();
		}
		if ($to_dmnd_end_dt.equalsIgnoreCase(name)) {
			return to_dmnd_end_dt();
		}
		if ($to_dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return to_dlv_schd_st_dt();
		}
		if ($to_dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return to_dlv_schd_end_dt();
		}
		if ($fr_dmnd_dt.equalsIgnoreCase(name)) {
			return fr_dmnd_dt();
		}
		if ($fr_dmnd_st_dt.equalsIgnoreCase(name)) {
			return fr_dmnd_st_dt();
		}
		if ($fr_dmnd_end_dt.equalsIgnoreCase(name)) {
			return fr_dmnd_end_dt();
		}
		if ($fr_dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return fr_dlv_schd_st_dt();
		}
		if ($fr_dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return fr_dlv_schd_end_dt();
		}
		if ($to_ym.equalsIgnoreCase(name)) {
			return to_ym();
		}
		if ($fr_ym.equalsIgnoreCase(name)) {
			return fr_ym();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($to_ins_ts.equalsIgnoreCase(name)) {
			return to_ins_ts();
		}
		if ($to_upd_ts.equalsIgnoreCase(name)) {
			return to_upd_ts();
		}
		if ($fr_ins_ts.equalsIgnoreCase(name)) {
			return fr_ins_ts();
		}
		if ($fr_upd_ts.equalsIgnoreCase(name)) {
			return fr_upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public void setString(String name, String value) {
		if ($to_dmnd_no.equalsIgnoreCase(name)) {
			to_dmnd_no(value);
			return;
		}
		if ($to_dmnd_period_typ.equalsIgnoreCase(name)) {
			to_dmnd_period_typ(value);
			return;
		}
		if ($to_dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			to_dmnd_period_typ_nm(value);
			return;
		}
		if ($to_dmnd_typ.equalsIgnoreCase(name)) {
			to_dmnd_typ(value);
			return;
		}
		if ($to_dmnd_typ_nm.equalsIgnoreCase(name)) {
			to_dmnd_typ_nm(value);
			return;
		}
		if ($fr_dmnd_no.equalsIgnoreCase(name)) {
			fr_dmnd_no(value);
			return;
		}
		if ($fr_dmnd_period_typ.equalsIgnoreCase(name)) {
			fr_dmnd_period_typ(value);
			return;
		}
		if ($fr_dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			fr_dmnd_period_typ_nm(value);
			return;
		}
		if ($fr_dmnd_typ.equalsIgnoreCase(name)) {
			fr_dmnd_typ(value);
			return;
		}
		if ($fr_dmnd_typ_nm.equalsIgnoreCase(name)) {
			fr_dmnd_typ_nm(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			dmnd_loc_nm(value);
			return;
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			dmnd_loc_grp_cd(value);
			return;
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			dmnd_loc_grp_nm(value);
			return;
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			dmnd_lg_grp_cd(value);
			return;
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			dmnd_lg_grp_nm(value);
			return;
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			dmnd_wg_cd(value);
			return;
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			dmnd_wg_nm(value);
			return;
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			dmnd_site_cd(value);
			return;
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			dmnd_site_nm(value);
			return;
		}
		if ($to_sno1.equalsIgnoreCase(name)) {
			to_sno1(value);
			return;
		}
		if ($to_sno2.equalsIgnoreCase(name)) {
			to_sno2(value);
			return;
		}
		if ($to_sno3.equalsIgnoreCase(name)) {
			to_sno3(value);
			return;
		}
		if ($to_sno4.equalsIgnoreCase(name)) {
			to_sno4(value);
			return;
		}
		if ($to_wrk_no.equalsIgnoreCase(name)) {
			to_wrk_no(value);
			return;
		}
		if ($to_wrk_nm.equalsIgnoreCase(name)) {
			to_wrk_nm(value);
			return;
		}
		if ($fr_sno1.equalsIgnoreCase(name)) {
			fr_sno1(value);
			return;
		}
		if ($fr_sno2.equalsIgnoreCase(name)) {
			fr_sno2(value);
			return;
		}
		if ($fr_sno3.equalsIgnoreCase(name)) {
			fr_sno3(value);
			return;
		}
		if ($fr_sno4.equalsIgnoreCase(name)) {
			fr_sno4(value);
			return;
		}
		if ($fr_wrk_no.equalsIgnoreCase(name)) {
			fr_wrk_no(value);
			return;
		}
		if ($fr_wrk_nm.equalsIgnoreCase(name)) {
			fr_wrk_nm(value);
			return;
		}
		if ($to_dmnd_usr_cd.equalsIgnoreCase(name)) {
			to_dmnd_usr_cd(value);
			return;
		}
		if ($to_dmnd_usr_nm.equalsIgnoreCase(name)) {
			to_dmnd_usr_nm(value);
			return;
		}
		if ($to_dmnd_dpt_cd.equalsIgnoreCase(name)) {
			to_dmnd_dpt_cd(value);
			return;
		}
		if ($to_dmnd_dpt_nm.equalsIgnoreCase(name)) {
			to_dmnd_dpt_nm(value);
			return;
		}
		if ($fr_dmnd_usr_cd.equalsIgnoreCase(name)) {
			fr_dmnd_usr_cd(value);
			return;
		}
		if ($fr_dmnd_usr_nm.equalsIgnoreCase(name)) {
			fr_dmnd_usr_nm(value);
			return;
		}
		if ($fr_dmnd_dpt_cd.equalsIgnoreCase(name)) {
			fr_dmnd_dpt_cd(value);
			return;
		}
		if ($fr_dmnd_dpt_nm.equalsIgnoreCase(name)) {
			fr_dmnd_dpt_nm(value);
			return;
		}
		if ($to_dlv_cd.equalsIgnoreCase(name)) {
			to_dlv_cd(value);
			return;
		}
		if ($to_dlv_nm.equalsIgnoreCase(name)) {
			to_dlv_nm(value);
			return;
		}
		if ($to_cst_cd.equalsIgnoreCase(name)) {
			to_cst_cd(value);
			return;
		}
		if ($to_cst_nm.equalsIgnoreCase(name)) {
			to_cst_nm(value);
			return;
		}
		if ($fr_dlv_cd.equalsIgnoreCase(name)) {
			fr_dlv_cd(value);
			return;
		}
		if ($fr_dlv_nm.equalsIgnoreCase(name)) {
			fr_dlv_nm(value);
			return;
		}
		if ($fr_cst_cd.equalsIgnoreCase(name)) {
			fr_cst_cd(value);
			return;
		}
		if ($fr_cst_nm.equalsIgnoreCase(name)) {
			fr_cst_nm(value);
			return;
		}
		if ($to_spln_vers.equalsIgnoreCase(name)) {
			to_spln_vers(value);
			return;
		}
		if ($to_spln_itm_cd.equalsIgnoreCase(name)) {
			to_spln_itm_cd(value);
			return;
		}
		if ($to_spln_itm_nm.equalsIgnoreCase(name)) {
			to_spln_itm_nm(value);
			return;
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			to_cur_cd(value);
			return;
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			to_cur_nm(value);
			return;
		}
		if ($to_cst_frcst_no.equalsIgnoreCase(name)) {
			to_cst_frcst_no(value);
			return;
		}
		if ($to_cst_frcst_d_no.equalsIgnoreCase(name)) {
			to_cst_frcst_d_no(value);
			return;
		}
		if ($to_slo_no.equalsIgnoreCase(name)) {
			to_slo_no(value);
			return;
		}
		if ($to_slo_d_no.equalsIgnoreCase(name)) {
			to_slo_d_no(value);
			return;
		}
		if ($fr_spln_vers.equalsIgnoreCase(name)) {
			fr_spln_vers(value);
			return;
		}
		if ($fr_spln_itm_cd.equalsIgnoreCase(name)) {
			fr_spln_itm_cd(value);
			return;
		}
		if ($fr_spln_itm_nm.equalsIgnoreCase(name)) {
			fr_spln_itm_nm(value);
			return;
		}
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			fr_cur_cd(value);
			return;
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			fr_cur_nm(value);
			return;
		}
		if ($fr_cst_frcst_no.equalsIgnoreCase(name)) {
			fr_cst_frcst_no(value);
			return;
		}
		if ($fr_cst_frcst_d_no.equalsIgnoreCase(name)) {
			fr_cst_frcst_d_no(value);
			return;
		}
		if ($fr_slo_no.equalsIgnoreCase(name)) {
			fr_slo_no(value);
			return;
		}
		if ($fr_slo_d_no.equalsIgnoreCase(name)) {
			fr_slo_d_no(value);
			return;
		}
		if ($to_intr_rmrks.equalsIgnoreCase(name)) {
			to_intr_rmrks(value);
			return;
		}
		if ($to_sub_char1.equalsIgnoreCase(name)) {
			to_sub_char1(value);
			return;
		}
		if ($to_sub_char2.equalsIgnoreCase(name)) {
			to_sub_char2(value);
			return;
		}
		if ($to_sub_char3.equalsIgnoreCase(name)) {
			to_sub_char3(value);
			return;
		}
		if ($fr_intr_rmrks.equalsIgnoreCase(name)) {
			fr_intr_rmrks(value);
			return;
		}
		if ($fr_sub_char1.equalsIgnoreCase(name)) {
			fr_sub_char1(value);
			return;
		}
		if ($fr_sub_char2.equalsIgnoreCase(name)) {
			fr_sub_char2(value);
			return;
		}
		if ($fr_sub_char3.equalsIgnoreCase(name)) {
			fr_sub_char3(value);
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
		if ($to_dlv_grp_cd1.equalsIgnoreCase(name)) {
			to_dlv_grp_cd1(value);
			return;
		}
		if ($to_dlv_grp_nm1.equalsIgnoreCase(name)) {
			to_dlv_grp_nm1(value);
			return;
		}
		if ($to_dlv_grp_cd2.equalsIgnoreCase(name)) {
			to_dlv_grp_cd2(value);
			return;
		}
		if ($to_dlv_grp_nm2.equalsIgnoreCase(name)) {
			to_dlv_grp_nm2(value);
			return;
		}
		if ($to_dlv_grp_cd3.equalsIgnoreCase(name)) {
			to_dlv_grp_cd3(value);
			return;
		}
		if ($to_dlv_grp_nm3.equalsIgnoreCase(name)) {
			to_dlv_grp_nm3(value);
			return;
		}
		if ($to_dlv_grp_cd4.equalsIgnoreCase(name)) {
			to_dlv_grp_cd4(value);
			return;
		}
		if ($to_dlv_grp_nm4.equalsIgnoreCase(name)) {
			to_dlv_grp_nm4(value);
			return;
		}
		if ($to_dlv_grp_cd5.equalsIgnoreCase(name)) {
			to_dlv_grp_cd5(value);
			return;
		}
		if ($to_dlv_grp_nm5.equalsIgnoreCase(name)) {
			to_dlv_grp_nm5(value);
			return;
		}
		if ($to_dlv_grp_cd6.equalsIgnoreCase(name)) {
			to_dlv_grp_cd6(value);
			return;
		}
		if ($to_dlv_grp_nm6.equalsIgnoreCase(name)) {
			to_dlv_grp_nm6(value);
			return;
		}
		if ($to_dlv_grp_cd7.equalsIgnoreCase(name)) {
			to_dlv_grp_cd7(value);
			return;
		}
		if ($to_dlv_grp_nm7.equalsIgnoreCase(name)) {
			to_dlv_grp_nm7(value);
			return;
		}
		if ($to_dlv_grp_cd8.equalsIgnoreCase(name)) {
			to_dlv_grp_cd8(value);
			return;
		}
		if ($to_dlv_grp_nm8.equalsIgnoreCase(name)) {
			to_dlv_grp_nm8(value);
			return;
		}
		if ($to_dlv_grp_cd9.equalsIgnoreCase(name)) {
			to_dlv_grp_cd9(value);
			return;
		}
		if ($to_dlv_grp_nm9.equalsIgnoreCase(name)) {
			to_dlv_grp_nm9(value);
			return;
		}
		if ($to_dlv_grp_cd10.equalsIgnoreCase(name)) {
			to_dlv_grp_cd10(value);
			return;
		}
		if ($to_dlv_grp_nm10.equalsIgnoreCase(name)) {
			to_dlv_grp_nm10(value);
			return;
		}
		if ($fr_dlv_grp_cd1.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd1(value);
			return;
		}
		if ($fr_dlv_grp_nm1.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm1(value);
			return;
		}
		if ($fr_dlv_grp_cd2.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd2(value);
			return;
		}
		if ($fr_dlv_grp_nm2.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm2(value);
			return;
		}
		if ($fr_dlv_grp_cd3.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd3(value);
			return;
		}
		if ($fr_dlv_grp_nm3.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm3(value);
			return;
		}
		if ($fr_dlv_grp_cd4.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd4(value);
			return;
		}
		if ($fr_dlv_grp_nm4.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm4(value);
			return;
		}
		if ($fr_dlv_grp_cd5.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd5(value);
			return;
		}
		if ($fr_dlv_grp_nm5.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm5(value);
			return;
		}
		if ($fr_dlv_grp_cd6.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd6(value);
			return;
		}
		if ($fr_dlv_grp_nm6.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm6(value);
			return;
		}
		if ($fr_dlv_grp_cd7.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd7(value);
			return;
		}
		if ($fr_dlv_grp_nm7.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm7(value);
			return;
		}
		if ($fr_dlv_grp_cd8.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd8(value);
			return;
		}
		if ($fr_dlv_grp_nm8.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm8(value);
			return;
		}
		if ($fr_dlv_grp_cd9.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd9(value);
			return;
		}
		if ($fr_dlv_grp_nm9.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm9(value);
			return;
		}
		if ($fr_dlv_grp_cd10.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd10(value);
			return;
		}
		if ($fr_dlv_grp_nm10.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm10(value);
			return;
		}
		if ($to_cst_grp_cd1.equalsIgnoreCase(name)) {
			to_cst_grp_cd1(value);
			return;
		}
		if ($to_cst_grp_nm1.equalsIgnoreCase(name)) {
			to_cst_grp_nm1(value);
			return;
		}
		if ($to_cst_grp_cd2.equalsIgnoreCase(name)) {
			to_cst_grp_cd2(value);
			return;
		}
		if ($to_cst_grp_nm2.equalsIgnoreCase(name)) {
			to_cst_grp_nm2(value);
			return;
		}
		if ($to_cst_grp_cd3.equalsIgnoreCase(name)) {
			to_cst_grp_cd3(value);
			return;
		}
		if ($to_cst_grp_nm3.equalsIgnoreCase(name)) {
			to_cst_grp_nm3(value);
			return;
		}
		if ($to_cst_grp_cd4.equalsIgnoreCase(name)) {
			to_cst_grp_cd4(value);
			return;
		}
		if ($to_cst_grp_nm4.equalsIgnoreCase(name)) {
			to_cst_grp_nm4(value);
			return;
		}
		if ($to_cst_grp_cd5.equalsIgnoreCase(name)) {
			to_cst_grp_cd5(value);
			return;
		}
		if ($to_cst_grp_nm5.equalsIgnoreCase(name)) {
			to_cst_grp_nm5(value);
			return;
		}
		if ($to_cst_grp_cd6.equalsIgnoreCase(name)) {
			to_cst_grp_cd6(value);
			return;
		}
		if ($to_cst_grp_nm6.equalsIgnoreCase(name)) {
			to_cst_grp_nm6(value);
			return;
		}
		if ($to_cst_grp_cd7.equalsIgnoreCase(name)) {
			to_cst_grp_cd7(value);
			return;
		}
		if ($to_cst_grp_nm7.equalsIgnoreCase(name)) {
			to_cst_grp_nm7(value);
			return;
		}
		if ($to_cst_grp_cd8.equalsIgnoreCase(name)) {
			to_cst_grp_cd8(value);
			return;
		}
		if ($to_cst_grp_nm8.equalsIgnoreCase(name)) {
			to_cst_grp_nm8(value);
			return;
		}
		if ($to_cst_grp_cd9.equalsIgnoreCase(name)) {
			to_cst_grp_cd9(value);
			return;
		}
		if ($to_cst_grp_nm9.equalsIgnoreCase(name)) {
			to_cst_grp_nm9(value);
			return;
		}
		if ($to_cst_grp_cd10.equalsIgnoreCase(name)) {
			to_cst_grp_cd10(value);
			return;
		}
		if ($to_cst_grp_nm10.equalsIgnoreCase(name)) {
			to_cst_grp_nm10(value);
			return;
		}
		if ($fr_cst_grp_cd1.equalsIgnoreCase(name)) {
			fr_cst_grp_cd1(value);
			return;
		}
		if ($fr_cst_grp_nm1.equalsIgnoreCase(name)) {
			fr_cst_grp_nm1(value);
			return;
		}
		if ($fr_cst_grp_cd2.equalsIgnoreCase(name)) {
			fr_cst_grp_cd2(value);
			return;
		}
		if ($fr_cst_grp_nm2.equalsIgnoreCase(name)) {
			fr_cst_grp_nm2(value);
			return;
		}
		if ($fr_cst_grp_cd3.equalsIgnoreCase(name)) {
			fr_cst_grp_cd3(value);
			return;
		}
		if ($fr_cst_grp_nm3.equalsIgnoreCase(name)) {
			fr_cst_grp_nm3(value);
			return;
		}
		if ($fr_cst_grp_cd4.equalsIgnoreCase(name)) {
			fr_cst_grp_cd4(value);
			return;
		}
		if ($fr_cst_grp_nm4.equalsIgnoreCase(name)) {
			fr_cst_grp_nm4(value);
			return;
		}
		if ($fr_cst_grp_cd5.equalsIgnoreCase(name)) {
			fr_cst_grp_cd5(value);
			return;
		}
		if ($fr_cst_grp_nm5.equalsIgnoreCase(name)) {
			fr_cst_grp_nm5(value);
			return;
		}
		if ($fr_cst_grp_cd6.equalsIgnoreCase(name)) {
			fr_cst_grp_cd6(value);
			return;
		}
		if ($fr_cst_grp_nm6.equalsIgnoreCase(name)) {
			fr_cst_grp_nm6(value);
			return;
		}
		if ($fr_cst_grp_cd7.equalsIgnoreCase(name)) {
			fr_cst_grp_cd7(value);
			return;
		}
		if ($fr_cst_grp_nm7.equalsIgnoreCase(name)) {
			fr_cst_grp_nm7(value);
			return;
		}
		if ($fr_cst_grp_cd8.equalsIgnoreCase(name)) {
			fr_cst_grp_cd8(value);
			return;
		}
		if ($fr_cst_grp_nm8.equalsIgnoreCase(name)) {
			fr_cst_grp_nm8(value);
			return;
		}
		if ($fr_cst_grp_cd9.equalsIgnoreCase(name)) {
			fr_cst_grp_cd9(value);
			return;
		}
		if ($fr_cst_grp_nm9.equalsIgnoreCase(name)) {
			fr_cst_grp_nm9(value);
			return;
		}
		if ($fr_cst_grp_cd10.equalsIgnoreCase(name)) {
			fr_cst_grp_cd10(value);
			return;
		}
		if ($fr_cst_grp_nm10.equalsIgnoreCase(name)) {
			fr_cst_grp_nm10(value);
			return;
		}
		if ($to_ins_usr_id.equalsIgnoreCase(name)) {
			to_ins_usr_id(value);
			return;
		}
		if ($to_ins_usr_nm.equalsIgnoreCase(name)) {
			to_ins_usr_nm(value);
			return;
		}
		if ($to_ins_func_id.equalsIgnoreCase(name)) {
			to_ins_func_id(value);
			return;
		}
		if ($to_ins_func_nm.equalsIgnoreCase(name)) {
			to_ins_func_nm(value);
			return;
		}
		if ($to_upd_usr_id.equalsIgnoreCase(name)) {
			to_upd_usr_id(value);
			return;
		}
		if ($to_upd_usr_nm.equalsIgnoreCase(name)) {
			to_upd_usr_nm(value);
			return;
		}
		if ($to_upd_func_id.equalsIgnoreCase(name)) {
			to_upd_func_id(value);
			return;
		}
		if ($to_upd_func_nm.equalsIgnoreCase(name)) {
			to_upd_func_nm(value);
			return;
		}
		if ($to_upd_srv_req_no.equalsIgnoreCase(name)) {
			to_upd_srv_req_no(value);
			return;
		}
		if ($fr_ins_usr_id.equalsIgnoreCase(name)) {
			fr_ins_usr_id(value);
			return;
		}
		if ($fr_ins_usr_nm.equalsIgnoreCase(name)) {
			fr_ins_usr_nm(value);
			return;
		}
		if ($fr_ins_func_id.equalsIgnoreCase(name)) {
			fr_ins_func_id(value);
			return;
		}
		if ($fr_ins_func_nm.equalsIgnoreCase(name)) {
			fr_ins_func_nm(value);
			return;
		}
		if ($fr_upd_usr_id.equalsIgnoreCase(name)) {
			fr_upd_usr_id(value);
			return;
		}
		if ($fr_upd_usr_nm.equalsIgnoreCase(name)) {
			fr_upd_usr_nm(value);
			return;
		}
		if ($fr_upd_func_id.equalsIgnoreCase(name)) {
			fr_upd_func_id(value);
			return;
		}
		if ($fr_upd_func_nm.equalsIgnoreCase(name)) {
			fr_upd_func_nm(value);
			return;
		}
		if ($fr_upd_srv_req_no.equalsIgnoreCase(name)) {
			fr_upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($to_dmnd_dt.equalsIgnoreCase(name)) {
			to_dmnd_dt(value);
			return;
		}
		if ($to_dmnd_st_dt.equalsIgnoreCase(name)) {
			to_dmnd_st_dt(value);
			return;
		}
		if ($to_dmnd_end_dt.equalsIgnoreCase(name)) {
			to_dmnd_end_dt(value);
			return;
		}
		if ($to_dlv_schd_st_dt.equalsIgnoreCase(name)) {
			to_dlv_schd_st_dt(value);
			return;
		}
		if ($to_dlv_schd_end_dt.equalsIgnoreCase(name)) {
			to_dlv_schd_end_dt(value);
			return;
		}
		if ($fr_dmnd_dt.equalsIgnoreCase(name)) {
			fr_dmnd_dt(value);
			return;
		}
		if ($fr_dmnd_st_dt.equalsIgnoreCase(name)) {
			fr_dmnd_st_dt(value);
			return;
		}
		if ($fr_dmnd_end_dt.equalsIgnoreCase(name)) {
			fr_dmnd_end_dt(value);
			return;
		}
		if ($fr_dlv_schd_st_dt.equalsIgnoreCase(name)) {
			fr_dlv_schd_st_dt(value);
			return;
		}
		if ($fr_dlv_schd_end_dt.equalsIgnoreCase(name)) {
			fr_dlv_schd_end_dt(value);
			return;
		}
		if ($to_ym.equalsIgnoreCase(name)) {
			to_ym(value);
			return;
		}
		if ($fr_ym.equalsIgnoreCase(name)) {
			fr_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($to_ins_ts.equalsIgnoreCase(name)) {
			to_ins_ts(value);
			return;
		}
		if ($to_upd_ts.equalsIgnoreCase(name)) {
			to_upd_ts(value);
			return;
		}
		if ($fr_ins_ts.equalsIgnoreCase(name)) {
			fr_ins_ts(value);
			return;
		}
		if ($fr_upd_ts.equalsIgnoreCase(name)) {
			fr_upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($to_dmnd_no.equalsIgnoreCase(name)) {
			to_dmnd_no(value);
			return;
		}
		if ($to_dmnd_period_typ.equalsIgnoreCase(name)) {
			to_dmnd_period_typ(value);
			return;
		}
		if ($to_dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			to_dmnd_period_typ_nm(value);
			return;
		}
		if ($to_dmnd_typ.equalsIgnoreCase(name)) {
			to_dmnd_typ(value);
			return;
		}
		if ($to_dmnd_typ_nm.equalsIgnoreCase(name)) {
			to_dmnd_typ_nm(value);
			return;
		}
		if ($fr_dmnd_no.equalsIgnoreCase(name)) {
			fr_dmnd_no(value);
			return;
		}
		if ($fr_dmnd_period_typ.equalsIgnoreCase(name)) {
			fr_dmnd_period_typ(value);
			return;
		}
		if ($fr_dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			fr_dmnd_period_typ_nm(value);
			return;
		}
		if ($fr_dmnd_typ.equalsIgnoreCase(name)) {
			fr_dmnd_typ(value);
			return;
		}
		if ($fr_dmnd_typ_nm.equalsIgnoreCase(name)) {
			fr_dmnd_typ_nm(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			dmnd_loc_nm(value);
			return;
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			dmnd_loc_grp_cd(value);
			return;
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			dmnd_loc_grp_nm(value);
			return;
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			dmnd_lg_grp_cd(value);
			return;
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			dmnd_lg_grp_nm(value);
			return;
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			dmnd_wg_cd(value);
			return;
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			dmnd_wg_nm(value);
			return;
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			dmnd_site_cd(value);
			return;
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			dmnd_site_nm(value);
			return;
		}
		if ($to_sno1.equalsIgnoreCase(name)) {
			to_sno1(value);
			return;
		}
		if ($to_sno2.equalsIgnoreCase(name)) {
			to_sno2(value);
			return;
		}
		if ($to_sno3.equalsIgnoreCase(name)) {
			to_sno3(value);
			return;
		}
		if ($to_sno4.equalsIgnoreCase(name)) {
			to_sno4(value);
			return;
		}
		if ($to_wrk_no.equalsIgnoreCase(name)) {
			to_wrk_no(value);
			return;
		}
		if ($to_wrk_nm.equalsIgnoreCase(name)) {
			to_wrk_nm(value);
			return;
		}
		if ($fr_sno1.equalsIgnoreCase(name)) {
			fr_sno1(value);
			return;
		}
		if ($fr_sno2.equalsIgnoreCase(name)) {
			fr_sno2(value);
			return;
		}
		if ($fr_sno3.equalsIgnoreCase(name)) {
			fr_sno3(value);
			return;
		}
		if ($fr_sno4.equalsIgnoreCase(name)) {
			fr_sno4(value);
			return;
		}
		if ($fr_wrk_no.equalsIgnoreCase(name)) {
			fr_wrk_no(value);
			return;
		}
		if ($fr_wrk_nm.equalsIgnoreCase(name)) {
			fr_wrk_nm(value);
			return;
		}
		if ($to_dmnd_usr_cd.equalsIgnoreCase(name)) {
			to_dmnd_usr_cd(value);
			return;
		}
		if ($to_dmnd_usr_nm.equalsIgnoreCase(name)) {
			to_dmnd_usr_nm(value);
			return;
		}
		if ($to_dmnd_dpt_cd.equalsIgnoreCase(name)) {
			to_dmnd_dpt_cd(value);
			return;
		}
		if ($to_dmnd_dpt_nm.equalsIgnoreCase(name)) {
			to_dmnd_dpt_nm(value);
			return;
		}
		if ($fr_dmnd_usr_cd.equalsIgnoreCase(name)) {
			fr_dmnd_usr_cd(value);
			return;
		}
		if ($fr_dmnd_usr_nm.equalsIgnoreCase(name)) {
			fr_dmnd_usr_nm(value);
			return;
		}
		if ($fr_dmnd_dpt_cd.equalsIgnoreCase(name)) {
			fr_dmnd_dpt_cd(value);
			return;
		}
		if ($fr_dmnd_dpt_nm.equalsIgnoreCase(name)) {
			fr_dmnd_dpt_nm(value);
			return;
		}
		if ($to_dlv_cd.equalsIgnoreCase(name)) {
			to_dlv_cd(value);
			return;
		}
		if ($to_dlv_nm.equalsIgnoreCase(name)) {
			to_dlv_nm(value);
			return;
		}
		if ($to_cst_cd.equalsIgnoreCase(name)) {
			to_cst_cd(value);
			return;
		}
		if ($to_cst_nm.equalsIgnoreCase(name)) {
			to_cst_nm(value);
			return;
		}
		if ($fr_dlv_cd.equalsIgnoreCase(name)) {
			fr_dlv_cd(value);
			return;
		}
		if ($fr_dlv_nm.equalsIgnoreCase(name)) {
			fr_dlv_nm(value);
			return;
		}
		if ($fr_cst_cd.equalsIgnoreCase(name)) {
			fr_cst_cd(value);
			return;
		}
		if ($fr_cst_nm.equalsIgnoreCase(name)) {
			fr_cst_nm(value);
			return;
		}
		if ($to_spln_vers.equalsIgnoreCase(name)) {
			to_spln_vers(value);
			return;
		}
		if ($to_spln_itm_cd.equalsIgnoreCase(name)) {
			to_spln_itm_cd(value);
			return;
		}
		if ($to_spln_itm_nm.equalsIgnoreCase(name)) {
			to_spln_itm_nm(value);
			return;
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			to_cur_cd(value);
			return;
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			to_cur_nm(value);
			return;
		}
		if ($to_cst_frcst_no.equalsIgnoreCase(name)) {
			to_cst_frcst_no(value);
			return;
		}
		if ($to_cst_frcst_d_no.equalsIgnoreCase(name)) {
			to_cst_frcst_d_no(value);
			return;
		}
		if ($to_slo_no.equalsIgnoreCase(name)) {
			to_slo_no(value);
			return;
		}
		if ($to_slo_d_no.equalsIgnoreCase(name)) {
			to_slo_d_no(value);
			return;
		}
		if ($fr_spln_vers.equalsIgnoreCase(name)) {
			fr_spln_vers(value);
			return;
		}
		if ($fr_spln_itm_cd.equalsIgnoreCase(name)) {
			fr_spln_itm_cd(value);
			return;
		}
		if ($fr_spln_itm_nm.equalsIgnoreCase(name)) {
			fr_spln_itm_nm(value);
			return;
		}
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			fr_cur_cd(value);
			return;
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			fr_cur_nm(value);
			return;
		}
		if ($fr_cst_frcst_no.equalsIgnoreCase(name)) {
			fr_cst_frcst_no(value);
			return;
		}
		if ($fr_cst_frcst_d_no.equalsIgnoreCase(name)) {
			fr_cst_frcst_d_no(value);
			return;
		}
		if ($fr_slo_no.equalsIgnoreCase(name)) {
			fr_slo_no(value);
			return;
		}
		if ($fr_slo_d_no.equalsIgnoreCase(name)) {
			fr_slo_d_no(value);
			return;
		}
		if ($to_intr_rmrks.equalsIgnoreCase(name)) {
			to_intr_rmrks(value);
			return;
		}
		if ($to_sub_char1.equalsIgnoreCase(name)) {
			to_sub_char1(value);
			return;
		}
		if ($to_sub_char2.equalsIgnoreCase(name)) {
			to_sub_char2(value);
			return;
		}
		if ($to_sub_char3.equalsIgnoreCase(name)) {
			to_sub_char3(value);
			return;
		}
		if ($fr_intr_rmrks.equalsIgnoreCase(name)) {
			fr_intr_rmrks(value);
			return;
		}
		if ($fr_sub_char1.equalsIgnoreCase(name)) {
			fr_sub_char1(value);
			return;
		}
		if ($fr_sub_char2.equalsIgnoreCase(name)) {
			fr_sub_char2(value);
			return;
		}
		if ($fr_sub_char3.equalsIgnoreCase(name)) {
			fr_sub_char3(value);
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
		if ($to_dlv_grp_cd1.equalsIgnoreCase(name)) {
			to_dlv_grp_cd1(value);
			return;
		}
		if ($to_dlv_grp_nm1.equalsIgnoreCase(name)) {
			to_dlv_grp_nm1(value);
			return;
		}
		if ($to_dlv_grp_cd2.equalsIgnoreCase(name)) {
			to_dlv_grp_cd2(value);
			return;
		}
		if ($to_dlv_grp_nm2.equalsIgnoreCase(name)) {
			to_dlv_grp_nm2(value);
			return;
		}
		if ($to_dlv_grp_cd3.equalsIgnoreCase(name)) {
			to_dlv_grp_cd3(value);
			return;
		}
		if ($to_dlv_grp_nm3.equalsIgnoreCase(name)) {
			to_dlv_grp_nm3(value);
			return;
		}
		if ($to_dlv_grp_cd4.equalsIgnoreCase(name)) {
			to_dlv_grp_cd4(value);
			return;
		}
		if ($to_dlv_grp_nm4.equalsIgnoreCase(name)) {
			to_dlv_grp_nm4(value);
			return;
		}
		if ($to_dlv_grp_cd5.equalsIgnoreCase(name)) {
			to_dlv_grp_cd5(value);
			return;
		}
		if ($to_dlv_grp_nm5.equalsIgnoreCase(name)) {
			to_dlv_grp_nm5(value);
			return;
		}
		if ($to_dlv_grp_cd6.equalsIgnoreCase(name)) {
			to_dlv_grp_cd6(value);
			return;
		}
		if ($to_dlv_grp_nm6.equalsIgnoreCase(name)) {
			to_dlv_grp_nm6(value);
			return;
		}
		if ($to_dlv_grp_cd7.equalsIgnoreCase(name)) {
			to_dlv_grp_cd7(value);
			return;
		}
		if ($to_dlv_grp_nm7.equalsIgnoreCase(name)) {
			to_dlv_grp_nm7(value);
			return;
		}
		if ($to_dlv_grp_cd8.equalsIgnoreCase(name)) {
			to_dlv_grp_cd8(value);
			return;
		}
		if ($to_dlv_grp_nm8.equalsIgnoreCase(name)) {
			to_dlv_grp_nm8(value);
			return;
		}
		if ($to_dlv_grp_cd9.equalsIgnoreCase(name)) {
			to_dlv_grp_cd9(value);
			return;
		}
		if ($to_dlv_grp_nm9.equalsIgnoreCase(name)) {
			to_dlv_grp_nm9(value);
			return;
		}
		if ($to_dlv_grp_cd10.equalsIgnoreCase(name)) {
			to_dlv_grp_cd10(value);
			return;
		}
		if ($to_dlv_grp_nm10.equalsIgnoreCase(name)) {
			to_dlv_grp_nm10(value);
			return;
		}
		if ($fr_dlv_grp_cd1.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd1(value);
			return;
		}
		if ($fr_dlv_grp_nm1.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm1(value);
			return;
		}
		if ($fr_dlv_grp_cd2.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd2(value);
			return;
		}
		if ($fr_dlv_grp_nm2.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm2(value);
			return;
		}
		if ($fr_dlv_grp_cd3.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd3(value);
			return;
		}
		if ($fr_dlv_grp_nm3.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm3(value);
			return;
		}
		if ($fr_dlv_grp_cd4.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd4(value);
			return;
		}
		if ($fr_dlv_grp_nm4.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm4(value);
			return;
		}
		if ($fr_dlv_grp_cd5.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd5(value);
			return;
		}
		if ($fr_dlv_grp_nm5.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm5(value);
			return;
		}
		if ($fr_dlv_grp_cd6.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd6(value);
			return;
		}
		if ($fr_dlv_grp_nm6.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm6(value);
			return;
		}
		if ($fr_dlv_grp_cd7.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd7(value);
			return;
		}
		if ($fr_dlv_grp_nm7.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm7(value);
			return;
		}
		if ($fr_dlv_grp_cd8.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd8(value);
			return;
		}
		if ($fr_dlv_grp_nm8.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm8(value);
			return;
		}
		if ($fr_dlv_grp_cd9.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd9(value);
			return;
		}
		if ($fr_dlv_grp_nm9.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm9(value);
			return;
		}
		if ($fr_dlv_grp_cd10.equalsIgnoreCase(name)) {
			fr_dlv_grp_cd10(value);
			return;
		}
		if ($fr_dlv_grp_nm10.equalsIgnoreCase(name)) {
			fr_dlv_grp_nm10(value);
			return;
		}
		if ($to_cst_grp_cd1.equalsIgnoreCase(name)) {
			to_cst_grp_cd1(value);
			return;
		}
		if ($to_cst_grp_nm1.equalsIgnoreCase(name)) {
			to_cst_grp_nm1(value);
			return;
		}
		if ($to_cst_grp_cd2.equalsIgnoreCase(name)) {
			to_cst_grp_cd2(value);
			return;
		}
		if ($to_cst_grp_nm2.equalsIgnoreCase(name)) {
			to_cst_grp_nm2(value);
			return;
		}
		if ($to_cst_grp_cd3.equalsIgnoreCase(name)) {
			to_cst_grp_cd3(value);
			return;
		}
		if ($to_cst_grp_nm3.equalsIgnoreCase(name)) {
			to_cst_grp_nm3(value);
			return;
		}
		if ($to_cst_grp_cd4.equalsIgnoreCase(name)) {
			to_cst_grp_cd4(value);
			return;
		}
		if ($to_cst_grp_nm4.equalsIgnoreCase(name)) {
			to_cst_grp_nm4(value);
			return;
		}
		if ($to_cst_grp_cd5.equalsIgnoreCase(name)) {
			to_cst_grp_cd5(value);
			return;
		}
		if ($to_cst_grp_nm5.equalsIgnoreCase(name)) {
			to_cst_grp_nm5(value);
			return;
		}
		if ($to_cst_grp_cd6.equalsIgnoreCase(name)) {
			to_cst_grp_cd6(value);
			return;
		}
		if ($to_cst_grp_nm6.equalsIgnoreCase(name)) {
			to_cst_grp_nm6(value);
			return;
		}
		if ($to_cst_grp_cd7.equalsIgnoreCase(name)) {
			to_cst_grp_cd7(value);
			return;
		}
		if ($to_cst_grp_nm7.equalsIgnoreCase(name)) {
			to_cst_grp_nm7(value);
			return;
		}
		if ($to_cst_grp_cd8.equalsIgnoreCase(name)) {
			to_cst_grp_cd8(value);
			return;
		}
		if ($to_cst_grp_nm8.equalsIgnoreCase(name)) {
			to_cst_grp_nm8(value);
			return;
		}
		if ($to_cst_grp_cd9.equalsIgnoreCase(name)) {
			to_cst_grp_cd9(value);
			return;
		}
		if ($to_cst_grp_nm9.equalsIgnoreCase(name)) {
			to_cst_grp_nm9(value);
			return;
		}
		if ($to_cst_grp_cd10.equalsIgnoreCase(name)) {
			to_cst_grp_cd10(value);
			return;
		}
		if ($to_cst_grp_nm10.equalsIgnoreCase(name)) {
			to_cst_grp_nm10(value);
			return;
		}
		if ($fr_cst_grp_cd1.equalsIgnoreCase(name)) {
			fr_cst_grp_cd1(value);
			return;
		}
		if ($fr_cst_grp_nm1.equalsIgnoreCase(name)) {
			fr_cst_grp_nm1(value);
			return;
		}
		if ($fr_cst_grp_cd2.equalsIgnoreCase(name)) {
			fr_cst_grp_cd2(value);
			return;
		}
		if ($fr_cst_grp_nm2.equalsIgnoreCase(name)) {
			fr_cst_grp_nm2(value);
			return;
		}
		if ($fr_cst_grp_cd3.equalsIgnoreCase(name)) {
			fr_cst_grp_cd3(value);
			return;
		}
		if ($fr_cst_grp_nm3.equalsIgnoreCase(name)) {
			fr_cst_grp_nm3(value);
			return;
		}
		if ($fr_cst_grp_cd4.equalsIgnoreCase(name)) {
			fr_cst_grp_cd4(value);
			return;
		}
		if ($fr_cst_grp_nm4.equalsIgnoreCase(name)) {
			fr_cst_grp_nm4(value);
			return;
		}
		if ($fr_cst_grp_cd5.equalsIgnoreCase(name)) {
			fr_cst_grp_cd5(value);
			return;
		}
		if ($fr_cst_grp_nm5.equalsIgnoreCase(name)) {
			fr_cst_grp_nm5(value);
			return;
		}
		if ($fr_cst_grp_cd6.equalsIgnoreCase(name)) {
			fr_cst_grp_cd6(value);
			return;
		}
		if ($fr_cst_grp_nm6.equalsIgnoreCase(name)) {
			fr_cst_grp_nm6(value);
			return;
		}
		if ($fr_cst_grp_cd7.equalsIgnoreCase(name)) {
			fr_cst_grp_cd7(value);
			return;
		}
		if ($fr_cst_grp_nm7.equalsIgnoreCase(name)) {
			fr_cst_grp_nm7(value);
			return;
		}
		if ($fr_cst_grp_cd8.equalsIgnoreCase(name)) {
			fr_cst_grp_cd8(value);
			return;
		}
		if ($fr_cst_grp_nm8.equalsIgnoreCase(name)) {
			fr_cst_grp_nm8(value);
			return;
		}
		if ($fr_cst_grp_cd9.equalsIgnoreCase(name)) {
			fr_cst_grp_cd9(value);
			return;
		}
		if ($fr_cst_grp_nm9.equalsIgnoreCase(name)) {
			fr_cst_grp_nm9(value);
			return;
		}
		if ($fr_cst_grp_cd10.equalsIgnoreCase(name)) {
			fr_cst_grp_cd10(value);
			return;
		}
		if ($fr_cst_grp_nm10.equalsIgnoreCase(name)) {
			fr_cst_grp_nm10(value);
			return;
		}
		if ($to_ins_usr_id.equalsIgnoreCase(name)) {
			to_ins_usr_id(value);
			return;
		}
		if ($to_ins_usr_nm.equalsIgnoreCase(name)) {
			to_ins_usr_nm(value);
			return;
		}
		if ($to_ins_func_id.equalsIgnoreCase(name)) {
			to_ins_func_id(value);
			return;
		}
		if ($to_ins_func_nm.equalsIgnoreCase(name)) {
			to_ins_func_nm(value);
			return;
		}
		if ($to_upd_usr_id.equalsIgnoreCase(name)) {
			to_upd_usr_id(value);
			return;
		}
		if ($to_upd_usr_nm.equalsIgnoreCase(name)) {
			to_upd_usr_nm(value);
			return;
		}
		if ($to_upd_func_id.equalsIgnoreCase(name)) {
			to_upd_func_id(value);
			return;
		}
		if ($to_upd_func_nm.equalsIgnoreCase(name)) {
			to_upd_func_nm(value);
			return;
		}
		if ($to_upd_srv_req_no.equalsIgnoreCase(name)) {
			to_upd_srv_req_no(value);
			return;
		}
		if ($fr_ins_usr_id.equalsIgnoreCase(name)) {
			fr_ins_usr_id(value);
			return;
		}
		if ($fr_ins_usr_nm.equalsIgnoreCase(name)) {
			fr_ins_usr_nm(value);
			return;
		}
		if ($fr_ins_func_id.equalsIgnoreCase(name)) {
			fr_ins_func_id(value);
			return;
		}
		if ($fr_ins_func_nm.equalsIgnoreCase(name)) {
			fr_ins_func_nm(value);
			return;
		}
		if ($fr_upd_usr_id.equalsIgnoreCase(name)) {
			fr_upd_usr_id(value);
			return;
		}
		if ($fr_upd_usr_nm.equalsIgnoreCase(name)) {
			fr_upd_usr_nm(value);
			return;
		}
		if ($fr_upd_func_id.equalsIgnoreCase(name)) {
			fr_upd_func_id(value);
			return;
		}
		if ($fr_upd_func_nm.equalsIgnoreCase(name)) {
			fr_upd_func_nm(value);
			return;
		}
		if ($fr_upd_srv_req_no.equalsIgnoreCase(name)) {
			fr_upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($to_input_qty.equalsIgnoreCase(name)) {
			to_input_qty(value);
			return;
		}
		if ($to_dmnd_qty.equalsIgnoreCase(name)) {
			to_dmnd_qty(value);
			return;
		}
		if ($to_rec_qty.equalsIgnoreCase(name)) {
			to_rec_qty(value);
			return;
		}
		if ($fr_input_qty.equalsIgnoreCase(name)) {
			fr_input_qty(value);
			return;
		}
		if ($fr_dmnd_qty.equalsIgnoreCase(name)) {
			fr_dmnd_qty(value);
			return;
		}
		if ($fr_rec_qty.equalsIgnoreCase(name)) {
			fr_rec_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($to_dmnd_dt.equalsIgnoreCase(name)) {
			to_dmnd_dt(value);
			return;
		}
		if ($to_dmnd_st_dt.equalsIgnoreCase(name)) {
			to_dmnd_st_dt(value);
			return;
		}
		if ($to_dmnd_end_dt.equalsIgnoreCase(name)) {
			to_dmnd_end_dt(value);
			return;
		}
		if ($to_dlv_schd_st_dt.equalsIgnoreCase(name)) {
			to_dlv_schd_st_dt(value);
			return;
		}
		if ($to_dlv_schd_end_dt.equalsIgnoreCase(name)) {
			to_dlv_schd_end_dt(value);
			return;
		}
		if ($fr_dmnd_dt.equalsIgnoreCase(name)) {
			fr_dmnd_dt(value);
			return;
		}
		if ($fr_dmnd_st_dt.equalsIgnoreCase(name)) {
			fr_dmnd_st_dt(value);
			return;
		}
		if ($fr_dmnd_end_dt.equalsIgnoreCase(name)) {
			fr_dmnd_end_dt(value);
			return;
		}
		if ($fr_dlv_schd_st_dt.equalsIgnoreCase(name)) {
			fr_dlv_schd_st_dt(value);
			return;
		}
		if ($fr_dlv_schd_end_dt.equalsIgnoreCase(name)) {
			fr_dlv_schd_end_dt(value);
			return;
		}
		if ($to_ym.equalsIgnoreCase(name)) {
			to_ym(value);
			return;
		}
		if ($fr_ym.equalsIgnoreCase(name)) {
			fr_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($to_ins_ts.equalsIgnoreCase(name)) {
			to_ins_ts(value);
			return;
		}
		if ($to_upd_ts.equalsIgnoreCase(name)) {
			to_upd_ts(value);
			return;
		}
		if ($fr_ins_ts.equalsIgnoreCase(name)) {
			fr_ins_ts(value);
			return;
		}
		if ($fr_upd_ts.equalsIgnoreCase(name)) {
			fr_upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}



}

