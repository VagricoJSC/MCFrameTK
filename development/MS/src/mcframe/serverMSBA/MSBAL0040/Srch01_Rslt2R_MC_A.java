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
 * ブロック"Srch01_Rslt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt2R_MC_A extends MCConstRow {

	/**
	 * Demand No. (Matching destination) 需要ＮＯ(消込先).<p>
	 *
	 */
	public static final String $to_dmnd_no = "to_dmnd_no";
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
	public static final MCMeta fr_sno1_META = createCommonMeta($fr_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta fr_sno2_META = createCommonMeta($fr_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta fr_sno3_META = createCommonMeta($fr_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta fr_sno4_META = createCommonMeta($fr_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta fr_wrk_no_META = createCommonMeta($fr_wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta fr_wrk_nm_META = createCommonMeta($fr_wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta fr_dmnd_usr_cd_META = createCommonMeta($fr_dmnd_usr_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta fr_dmnd_usr_nm_META = createCommonMeta($fr_dmnd_usr_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta fr_dmnd_dpt_cd_META = createCommonMeta($fr_dmnd_dpt_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta fr_dmnd_dpt_nm_META = createCommonMeta($fr_dmnd_dpt_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta fr_dlv_cd_META = createCommonMeta($fr_dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta fr_dlv_nm_META = createCommonMeta($fr_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta fr_cst_cd_META = createCommonMeta($fr_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta fr_cst_nm_META = createCommonMeta($fr_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
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

	protected static final ConstMetaList<Srch01_Rslt2R> constMetas = new ConstMetaList<Srch01_Rslt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			to_dmnd_no_META,
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
			fr_sno1_META,
			fr_sno2_META,
			fr_sno3_META,
			fr_sno4_META,
			fr_wrk_no_META,
			fr_wrk_nm_META,
			fr_dmnd_usr_cd_META,
			fr_dmnd_usr_nm_META,
			fr_dmnd_dpt_cd_META,
			fr_dmnd_dpt_nm_META,
			fr_dlv_cd_META,
			fr_dlv_nm_META,
			fr_cst_cd_META,
			fr_cst_nm_META,
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
	protected Srch01_Rslt2R_MC_A(ConstMetaList<? extends Srch01_Rslt2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R clone() {
		return (Srch01_Rslt2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R createInstance() {
		return (Srch01_Rslt2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R getValues(String... names) {
		return (Srch01_Rslt2R) super.getValues(names);
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
	 * Demand No. (Matching source) 需要ＮＯ(消込元).<p>
	 *
	 */
	public String fr_dmnd_no() {
		return getConstString(offset + 1, $fr_dmnd_no);
	}

	/**
	 * Demand No. (Matching source) 需要ＮＯ(消込元).<p>
	 *
	 */
	public void fr_dmnd_no(String value) {
		setConstString(offset + 1, $fr_dmnd_no, value);
	}


	/**
	 * Demand date (Matching source) 需要日(消込元).<p>
	 *
	 */
	public MCDate fr_dmnd_dt() {
		return getConstDate(offset + 2, $fr_dmnd_dt);
	}

	/**
	 * Demand date (Matching source) 需要日(消込元).<p>
	 *
	 */
	public void fr_dmnd_dt(MCDate value) {
		setConstDate(offset + 2, $fr_dmnd_dt, value);
	}


	/**
	 * Demand period start date (Matching source) 需要期間開始日(消込元).<p>
	 *
	 */
	public MCDate fr_dmnd_st_dt() {
		return getConstDate(offset + 3, $fr_dmnd_st_dt);
	}

	/**
	 * Demand period start date (Matching source) 需要期間開始日(消込元).<p>
	 *
	 */
	public void fr_dmnd_st_dt(MCDate value) {
		setConstDate(offset + 3, $fr_dmnd_st_dt, value);
	}


	/**
	 * Demand period end date (Matching source) 需要期間終了日(消込元).<p>
	 *
	 */
	public MCDate fr_dmnd_end_dt() {
		return getConstDate(offset + 4, $fr_dmnd_end_dt);
	}

	/**
	 * Demand period end date (Matching source) 需要期間終了日(消込元).<p>
	 *
	 */
	public void fr_dmnd_end_dt(MCDate value) {
		setConstDate(offset + 4, $fr_dmnd_end_dt, value);
	}


	/**
	 * Delivery schedule period start date (Matching source) 納品予定期間開始日(消込元).<p>
	 *
	 */
	public MCDate fr_dlv_schd_st_dt() {
		return getConstDate(offset + 5, $fr_dlv_schd_st_dt);
	}

	/**
	 * Delivery schedule period start date (Matching source) 納品予定期間開始日(消込元).<p>
	 *
	 */
	public void fr_dlv_schd_st_dt(MCDate value) {
		setConstDate(offset + 5, $fr_dlv_schd_st_dt, value);
	}


	/**
	 * Delivery schedule period end date (Matching source) 納品予定期間終了日(消込元).<p>
	 *
	 */
	public MCDate fr_dlv_schd_end_dt() {
		return getConstDate(offset + 6, $fr_dlv_schd_end_dt);
	}

	/**
	 * Delivery schedule period end date (Matching source) 納品予定期間終了日(消込元).<p>
	 *
	 */
	public void fr_dlv_schd_end_dt(MCDate value) {
		setConstDate(offset + 6, $fr_dlv_schd_end_dt, value);
	}


	/**
	 * Demand period type (Matching source) 需要期間区分(消込元).<p>
	 *
	 */
	public String fr_dmnd_period_typ() {
		return getConstString(offset + 7, $fr_dmnd_period_typ);
	}

	/**
	 * Demand period type (Matching source) 需要期間区分(消込元).<p>
	 *
	 */
	public void fr_dmnd_period_typ(String value) {
		setConstString(offset + 7, $fr_dmnd_period_typ, value);
	}


	/**
	 * Demand period type name (Matching source) 需要期間区分名(消込元).<p>
	 *
	 */
	public String fr_dmnd_period_typ_nm() {
		return getConstString(offset + 8, $fr_dmnd_period_typ_nm);
	}

	/**
	 * Demand period type name (Matching source) 需要期間区分名(消込元).<p>
	 *
	 */
	public void fr_dmnd_period_typ_nm(String value) {
		setConstString(offset + 8, $fr_dmnd_period_typ_nm, value);
	}


	/**
	 * Demand type (Matching source) 需要区分(消込元).<p>
	 *
	 */
	public String fr_dmnd_typ() {
		return getConstString(offset + 9, $fr_dmnd_typ);
	}

	/**
	 * Demand type (Matching source) 需要区分(消込元).<p>
	 *
	 */
	public void fr_dmnd_typ(String value) {
		setConstString(offset + 9, $fr_dmnd_typ, value);
	}


	/**
	 * Demand type name (Matching source) 需要区分名(消込元).<p>
	 *
	 */
	public String fr_dmnd_typ_nm() {
		return getConstString(offset + 10, $fr_dmnd_typ_nm);
	}

	/**
	 * Demand type name (Matching source) 需要区分名(消込元).<p>
	 *
	 */
	public void fr_dmnd_typ_nm(String value) {
		setConstString(offset + 10, $fr_dmnd_typ_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 11, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 11, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 12, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 12, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 13, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 13, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 14, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 14, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 15, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 15, $itm_nm, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 16, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 16, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 17, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 17, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 18, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 18, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 19, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 19, $sno4_mng_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 20, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 20, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 21, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 21, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 22, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 22, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 22, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 22, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 22, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 22, $base_unit_dec_place, value);
	}


	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public MCNumber fr_input_qty() {
		return getConstNumber(offset + 23, $fr_input_qty);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(MCNumber value) {
		setConstNumber(offset + 23, $fr_input_qty, value);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(int value) {
		setConstNumber(offset + 23, $fr_input_qty, value);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(long value) {
		setConstNumber(offset + 23, $fr_input_qty, value);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(float value) {
		setConstNumber(offset + 23, $fr_input_qty, value);
	}

	/**
	 * Entry qty. (Matching source) 登録数量(消込元).<p>
	 *
	 */
	public void fr_input_qty(double value) {
		setConstNumber(offset + 23, $fr_input_qty, value);
	}


	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public MCNumber fr_dmnd_qty() {
		return getConstNumber(offset + 24, $fr_dmnd_qty);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(MCNumber value) {
		setConstNumber(offset + 24, $fr_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(int value) {
		setConstNumber(offset + 24, $fr_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(long value) {
		setConstNumber(offset + 24, $fr_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(float value) {
		setConstNumber(offset + 24, $fr_dmnd_qty, value);
	}

	/**
	 * Demand qty. (Matching source) 需要数量(消込元).<p>
	 *
	 */
	public void fr_dmnd_qty(double value) {
		setConstNumber(offset + 24, $fr_dmnd_qty, value);
	}


	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public MCNumber fr_rec_qty() {
		return getConstNumber(offset + 25, $fr_rec_qty);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(MCNumber value) {
		setConstNumber(offset + 25, $fr_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(int value) {
		setConstNumber(offset + 25, $fr_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(long value) {
		setConstNumber(offset + 25, $fr_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(float value) {
		setConstNumber(offset + 25, $fr_rec_qty, value);
	}

	/**
	 * Matching qty. (Matching source) 消込数量(消込元).<p>
	 *
	 */
	public void fr_rec_qty(double value) {
		setConstNumber(offset + 25, $fr_rec_qty, value);
	}


	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public String dmnd_loc_cd() {
		return getConstString(offset + 26, $dmnd_loc_cd);
	}

	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public void dmnd_loc_cd(String value) {
		setConstString(offset + 26, $dmnd_loc_cd, value);
	}


	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public String dmnd_loc_nm() {
		return getConstString(offset + 27, $dmnd_loc_nm);
	}

	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public void dmnd_loc_nm(String value) {
		setConstString(offset + 27, $dmnd_loc_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String dmnd_loc_grp_cd() {
		return getConstString(offset + 28, $dmnd_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void dmnd_loc_grp_cd(String value) {
		setConstString(offset + 28, $dmnd_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String dmnd_loc_grp_nm() {
		return getConstString(offset + 29, $dmnd_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void dmnd_loc_grp_nm(String value) {
		setConstString(offset + 29, $dmnd_loc_grp_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String dmnd_lg_grp_cd() {
		return getConstString(offset + 30, $dmnd_lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void dmnd_lg_grp_cd(String value) {
		setConstString(offset + 30, $dmnd_lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String dmnd_lg_grp_nm() {
		return getConstString(offset + 31, $dmnd_lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void dmnd_lg_grp_nm(String value) {
		setConstString(offset + 31, $dmnd_lg_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String dmnd_wg_cd() {
		return getConstString(offset + 32, $dmnd_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void dmnd_wg_cd(String value) {
		setConstString(offset + 32, $dmnd_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String dmnd_wg_nm() {
		return getConstString(offset + 33, $dmnd_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void dmnd_wg_nm(String value) {
		setConstString(offset + 33, $dmnd_wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String dmnd_site_cd() {
		return getConstString(offset + 34, $dmnd_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void dmnd_site_cd(String value) {
		setConstString(offset + 34, $dmnd_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String dmnd_site_nm() {
		return getConstString(offset + 35, $dmnd_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void dmnd_site_nm(String value) {
		setConstString(offset + 35, $dmnd_site_nm, value);
	}


	/**
	 * SEIBAN No. 1 (Matching source) 手配ＮＯ１(消込元).<p>
	 *
	 */
	public String fr_sno1() {
		return getConstString(offset + 36, $fr_sno1);
	}

	/**
	 * SEIBAN No. 1 (Matching source) 手配ＮＯ１(消込元).<p>
	 *
	 */
	public void fr_sno1(String value) {
		setConstString(offset + 36, $fr_sno1, value);
	}


	/**
	 * SEIBAN No. 2 (Matching source) 手配ＮＯ２(消込元).<p>
	 *
	 */
	public String fr_sno2() {
		return getConstString(offset + 37, $fr_sno2);
	}

	/**
	 * SEIBAN No. 2 (Matching source) 手配ＮＯ２(消込元).<p>
	 *
	 */
	public void fr_sno2(String value) {
		setConstString(offset + 37, $fr_sno2, value);
	}


	/**
	 * SEIBAN No. 3 (Matching source) 手配ＮＯ３(消込元).<p>
	 *
	 */
	public String fr_sno3() {
		return getConstString(offset + 38, $fr_sno3);
	}

	/**
	 * SEIBAN No. 3 (Matching source) 手配ＮＯ３(消込元).<p>
	 *
	 */
	public void fr_sno3(String value) {
		setConstString(offset + 38, $fr_sno3, value);
	}


	/**
	 * SEIBAN No. 4 (Matching source) 手配ＮＯ４(消込元).<p>
	 *
	 */
	public String fr_sno4() {
		return getConstString(offset + 39, $fr_sno4);
	}

	/**
	 * SEIBAN No. 4 (Matching source) 手配ＮＯ４(消込元).<p>
	 *
	 */
	public void fr_sno4(String value) {
		setConstString(offset + 39, $fr_sno4, value);
	}


	/**
	 * Sales project No. (Matching source) 案件ＮＯ(消込元).<p>
	 *
	 */
	public String fr_wrk_no() {
		return getConstString(offset + 40, $fr_wrk_no);
	}

	/**
	 * Sales project No. (Matching source) 案件ＮＯ(消込元).<p>
	 *
	 */
	public void fr_wrk_no(String value) {
		setConstString(offset + 40, $fr_wrk_no, value);
	}


	/**
	 * Sales project name (Matching source) 案件名(消込元).<p>
	 *
	 */
	public String fr_wrk_nm() {
		return getConstString(offset + 41, $fr_wrk_nm);
	}

	/**
	 * Sales project name (Matching source) 案件名(消込元).<p>
	 *
	 */
	public void fr_wrk_nm(String value) {
		setConstString(offset + 41, $fr_wrk_nm, value);
	}


	/**
	 * PIC cd. (Matching source) 担当者ＣＤ(消込元).<p>
	 *
	 */
	public String fr_dmnd_usr_cd() {
		return getConstString(offset + 42, $fr_dmnd_usr_cd);
	}

	/**
	 * PIC cd. (Matching source) 担当者ＣＤ(消込元).<p>
	 *
	 */
	public void fr_dmnd_usr_cd(String value) {
		setConstString(offset + 42, $fr_dmnd_usr_cd, value);
	}


	/**
	 * PIC name (Matching source) 担当者名(消込元).<p>
	 *
	 */
	public String fr_dmnd_usr_nm() {
		return getConstString(offset + 43, $fr_dmnd_usr_nm);
	}

	/**
	 * PIC name (Matching source) 担当者名(消込元).<p>
	 *
	 */
	public void fr_dmnd_usr_nm(String value) {
		setConstString(offset + 43, $fr_dmnd_usr_nm, value);
	}


	/**
	 * Demand source dept. cd. (Matching source) 需要元部門ＣＤ(消込元).<p>
	 *
	 */
	public String fr_dmnd_dpt_cd() {
		return getConstString(offset + 44, $fr_dmnd_dpt_cd);
	}

	/**
	 * Demand source dept. cd. (Matching source) 需要元部門ＣＤ(消込元).<p>
	 *
	 */
	public void fr_dmnd_dpt_cd(String value) {
		setConstString(offset + 44, $fr_dmnd_dpt_cd, value);
	}


	/**
	 * Demand source dept. name (Matching source) 需要元部門名(消込元).<p>
	 *
	 */
	public String fr_dmnd_dpt_nm() {
		return getConstString(offset + 45, $fr_dmnd_dpt_nm);
	}

	/**
	 * Demand source dept. name (Matching source) 需要元部門名(消込元).<p>
	 *
	 */
	public void fr_dmnd_dpt_nm(String value) {
		setConstString(offset + 45, $fr_dmnd_dpt_nm, value);
	}


	/**
	 * Delivery destination cd. (Matching source) 納品先ＣＤ(消込元).<p>
	 *
	 */
	public String fr_dlv_cd() {
		return getConstString(offset + 46, $fr_dlv_cd);
	}

	/**
	 * Delivery destination cd. (Matching source) 納品先ＣＤ(消込元).<p>
	 *
	 */
	public void fr_dlv_cd(String value) {
		setConstString(offset + 46, $fr_dlv_cd, value);
	}


	/**
	 * Delivery destination name (Matching source) 納品先名(消込元).<p>
	 *
	 */
	public String fr_dlv_nm() {
		return getConstString(offset + 47, $fr_dlv_nm);
	}

	/**
	 * Delivery destination name (Matching source) 納品先名(消込元).<p>
	 *
	 */
	public void fr_dlv_nm(String value) {
		setConstString(offset + 47, $fr_dlv_nm, value);
	}


	/**
	 * Customer cd. (Matching source) 得意先ＣＤ(消込元).<p>
	 *
	 */
	public String fr_cst_cd() {
		return getConstString(offset + 48, $fr_cst_cd);
	}

	/**
	 * Customer cd. (Matching source) 得意先ＣＤ(消込元).<p>
	 *
	 */
	public void fr_cst_cd(String value) {
		setConstString(offset + 48, $fr_cst_cd, value);
	}


	/**
	 * Customer name (Matching source) 得意先名(消込元).<p>
	 *
	 */
	public String fr_cst_nm() {
		return getConstString(offset + 49, $fr_cst_nm);
	}

	/**
	 * Customer name (Matching source) 得意先名(消込元).<p>
	 *
	 */
	public void fr_cst_nm(String value) {
		setConstString(offset + 49, $fr_cst_nm, value);
	}


	/**
	 * Plan monthly (Matching source) 計画月度(消込元).<p>
	 *
	 */
	public MCDate fr_ym() {
		return getConstDate(offset + 50, $fr_ym);
	}

	/**
	 * Plan monthly (Matching source) 計画月度(消込元).<p>
	 *
	 */
	public void fr_ym(MCDate value) {
		setConstDate(offset + 50, $fr_ym, value);
	}


	/**
	 * Sales plan version (Matching source) 販売計画バージョン(消込元).<p>
	 *
	 */
	public String fr_spln_vers() {
		return getConstString(offset + 51, $fr_spln_vers);
	}

	/**
	 * Sales plan version (Matching source) 販売計画バージョン(消込元).<p>
	 *
	 */
	public void fr_spln_vers(String value) {
		setConstString(offset + 51, $fr_spln_vers, value);
	}


	/**
	 * Plan item cd. (Matching source) 計画品目ＣＤ(消込元).<p>
	 *
	 */
	public String fr_spln_itm_cd() {
		return getConstString(offset + 52, $fr_spln_itm_cd);
	}

	/**
	 * Plan item cd. (Matching source) 計画品目ＣＤ(消込元).<p>
	 *
	 */
	public void fr_spln_itm_cd(String value) {
		setConstString(offset + 52, $fr_spln_itm_cd, value);
	}


	/**
	 * Plan item name (Matching source) 計画品名(消込元).<p>
	 *
	 */
	public String fr_spln_itm_nm() {
		return getConstString(offset + 53, $fr_spln_itm_nm);
	}

	/**
	 * Plan item name (Matching source) 計画品名(消込元).<p>
	 *
	 */
	public void fr_spln_itm_nm(String value) {
		setConstString(offset + 53, $fr_spln_itm_nm, value);
	}


	/**
	 * Currency cd. (Matching source) 通貨ＣＤ(消込元).<p>
	 *
	 */
	public String fr_cur_cd() {
		return getConstString(offset + 54, $fr_cur_cd);
	}

	/**
	 * Currency cd. (Matching source) 通貨ＣＤ(消込元).<p>
	 *
	 */
	public void fr_cur_cd(String value) {
		setConstString(offset + 54, $fr_cur_cd, value);
	}


	/**
	 * Currency name (Matching source) 通貨名(消込元).<p>
	 *
	 */
	public String fr_cur_nm() {
		return getConstString(offset + 55, $fr_cur_nm);
	}

	/**
	 * Currency name (Matching source) 通貨名(消込元).<p>
	 *
	 */
	public void fr_cur_nm(String value) {
		setConstString(offset + 55, $fr_cur_nm, value);
	}


	/**
	 * Sales forecast No. (Matching source) 顧客期間内示ＮＯ(消込元).<p>
	 *
	 */
	public String fr_cst_frcst_no() {
		return getConstString(offset + 56, $fr_cst_frcst_no);
	}

	/**
	 * Sales forecast No. (Matching source) 顧客期間内示ＮＯ(消込元).<p>
	 *
	 */
	public void fr_cst_frcst_no(String value) {
		setConstString(offset + 56, $fr_cst_frcst_no, value);
	}


	/**
	 * Sales forecast details No. (Matching source) 顧客期間内示明細ＮＯ(消込元).<p>
	 *
	 */
	public String fr_cst_frcst_d_no() {
		return getConstString(offset + 57, $fr_cst_frcst_d_no);
	}

	/**
	 * Sales forecast details No. (Matching source) 顧客期間内示明細ＮＯ(消込元).<p>
	 *
	 */
	public void fr_cst_frcst_d_no(String value) {
		setConstString(offset + 57, $fr_cst_frcst_d_no, value);
	}


	/**
	 * Sales order No. (Matching source) 受注ＮＯ(消込元).<p>
	 *
	 */
	public String fr_slo_no() {
		return getConstString(offset + 58, $fr_slo_no);
	}

	/**
	 * Sales order No. (Matching source) 受注ＮＯ(消込元).<p>
	 *
	 */
	public void fr_slo_no(String value) {
		setConstString(offset + 58, $fr_slo_no, value);
	}


	/**
	 * Sales order details No. (Matching source) 受注明細ＮＯ(消込元).<p>
	 *
	 */
	public String fr_slo_d_no() {
		return getConstString(offset + 59, $fr_slo_d_no);
	}

	/**
	 * Sales order details No. (Matching source) 受注明細ＮＯ(消込元).<p>
	 *
	 */
	public void fr_slo_d_no(String value) {
		setConstString(offset + 59, $fr_slo_d_no, value);
	}


	/**
	 * Internal remarks (Matching source) 内部備考(消込元).<p>
	 *
	 */
	public String fr_intr_rmrks() {
		return getConstString(offset + 60, $fr_intr_rmrks);
	}

	/**
	 * Internal remarks (Matching source) 内部備考(消込元).<p>
	 *
	 */
	public void fr_intr_rmrks(String value) {
		setConstString(offset + 60, $fr_intr_rmrks, value);
	}


	/**
	 * Spare 1 (Matching source) 予備１(消込元).<p>
	 *
	 */
	public String fr_sub_char1() {
		return getConstString(offset + 61, $fr_sub_char1);
	}

	/**
	 * Spare 1 (Matching source) 予備１(消込元).<p>
	 *
	 */
	public void fr_sub_char1(String value) {
		setConstString(offset + 61, $fr_sub_char1, value);
	}


	/**
	 * Spare 2 (Matching source) 予備２(消込元).<p>
	 *
	 */
	public String fr_sub_char2() {
		return getConstString(offset + 62, $fr_sub_char2);
	}

	/**
	 * Spare 2 (Matching source) 予備２(消込元).<p>
	 *
	 */
	public void fr_sub_char2(String value) {
		setConstString(offset + 62, $fr_sub_char2, value);
	}


	/**
	 * Spare 3 (Matching source) 予備３(消込元).<p>
	 *
	 */
	public String fr_sub_char3() {
		return getConstString(offset + 63, $fr_sub_char3);
	}

	/**
	 * Spare 3 (Matching source) 予備３(消込元).<p>
	 *
	 */
	public void fr_sub_char3(String value) {
		setConstString(offset + 63, $fr_sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 64, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 64, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 65, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 65, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 66, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 66, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 67, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 67, $itm_typ_d_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 68, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 68, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 69, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 69, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 70, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 70, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 71, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 71, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 72, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 72, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 73, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 73, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 74, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 74, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 75, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 75, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 76, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 76, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 77, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 77, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 78, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 78, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 79, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 79, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 80, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 80, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 81, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 81, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 82, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 82, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 83, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 83, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 84, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 84, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 85, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 85, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 86, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 86, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 87, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 87, $itm_grp_nm10, value);
	}


	/**
	 * Delivery destination classification cd. 1 (Matching source) 納品先分類ＣＤ１(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd1() {
		return getConstString(offset + 88, $fr_dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 (Matching source) 納品先分類ＣＤ１(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd1(String value) {
		setConstString(offset + 88, $fr_dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 (Matching source) 納品先分類名１(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm1() {
		return getConstString(offset + 89, $fr_dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 (Matching source) 納品先分類名１(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm1(String value) {
		setConstString(offset + 89, $fr_dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification cd. 2 (Matching source) 納品先分類ＣＤ２(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd2() {
		return getConstString(offset + 90, $fr_dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 (Matching source) 納品先分類ＣＤ２(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd2(String value) {
		setConstString(offset + 90, $fr_dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 (Matching source) 納品先分類名２(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm2() {
		return getConstString(offset + 91, $fr_dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 (Matching source) 納品先分類名２(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm2(String value) {
		setConstString(offset + 91, $fr_dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification cd. 3 (Matching source) 納品先分類ＣＤ３(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd3() {
		return getConstString(offset + 92, $fr_dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 (Matching source) 納品先分類ＣＤ３(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd3(String value) {
		setConstString(offset + 92, $fr_dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 (Matching source) 納品先分類名３(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm3() {
		return getConstString(offset + 93, $fr_dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 (Matching source) 納品先分類名３(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm3(String value) {
		setConstString(offset + 93, $fr_dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification cd. 4 (Matching source) 納品先分類ＣＤ４(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd4() {
		return getConstString(offset + 94, $fr_dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 (Matching source) 納品先分類ＣＤ４(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd4(String value) {
		setConstString(offset + 94, $fr_dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 (Matching source) 納品先分類名４(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm4() {
		return getConstString(offset + 95, $fr_dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 (Matching source) 納品先分類名４(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm4(String value) {
		setConstString(offset + 95, $fr_dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification cd. 5 (Matching source) 納品先分類ＣＤ５(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd5() {
		return getConstString(offset + 96, $fr_dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 (Matching source) 納品先分類ＣＤ５(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd5(String value) {
		setConstString(offset + 96, $fr_dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 (Matching source) 納品先分類名５(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm5() {
		return getConstString(offset + 97, $fr_dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 (Matching source) 納品先分類名５(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm5(String value) {
		setConstString(offset + 97, $fr_dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification cd. 6 (Matching source) 納品先分類ＣＤ６(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd6() {
		return getConstString(offset + 98, $fr_dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 (Matching source) 納品先分類ＣＤ６(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd6(String value) {
		setConstString(offset + 98, $fr_dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 (Matching source) 納品先分類名６(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm6() {
		return getConstString(offset + 99, $fr_dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 (Matching source) 納品先分類名６(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm6(String value) {
		setConstString(offset + 99, $fr_dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification cd. 7 (Matching source) 納品先分類ＣＤ７(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd7() {
		return getConstString(offset + 100, $fr_dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 (Matching source) 納品先分類ＣＤ７(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd7(String value) {
		setConstString(offset + 100, $fr_dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 (Matching source) 納品先分類名７(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm7() {
		return getConstString(offset + 101, $fr_dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 (Matching source) 納品先分類名７(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm7(String value) {
		setConstString(offset + 101, $fr_dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification cd. 8 (Matching source) 納品先分類ＣＤ８(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd8() {
		return getConstString(offset + 102, $fr_dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 (Matching source) 納品先分類ＣＤ８(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd8(String value) {
		setConstString(offset + 102, $fr_dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 (Matching source) 納品先分類名８(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm8() {
		return getConstString(offset + 103, $fr_dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 (Matching source) 納品先分類名８(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm8(String value) {
		setConstString(offset + 103, $fr_dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification cd. 9 (Matching source) 納品先分類ＣＤ９(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd9() {
		return getConstString(offset + 104, $fr_dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 (Matching source) 納品先分類ＣＤ９(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd9(String value) {
		setConstString(offset + 104, $fr_dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 (Matching source) 納品先分類名９(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm9() {
		return getConstString(offset + 105, $fr_dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 (Matching source) 納品先分類名９(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm9(String value) {
		setConstString(offset + 105, $fr_dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification cd. 10 (Matching source) 納品先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_cd10() {
		return getConstString(offset + 106, $fr_dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 (Matching source) 納品先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_cd10(String value) {
		setConstString(offset + 106, $fr_dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 (Matching source) 納品先分類名１０(消込元).<p>
	 *
	 */
	public String fr_dlv_grp_nm10() {
		return getConstString(offset + 107, $fr_dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 (Matching source) 納品先分類名１０(消込元).<p>
	 *
	 */
	public void fr_dlv_grp_nm10(String value) {
		setConstString(offset + 107, $fr_dlv_grp_nm10, value);
	}


	/**
	 * Customer classification cd. 1 (Matching source) 得意先分類ＣＤ１(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd1() {
		return getConstString(offset + 108, $fr_cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 (Matching source) 得意先分類ＣＤ１(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd1(String value) {
		setConstString(offset + 108, $fr_cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 (Matching source) 得意先分類名１(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm1() {
		return getConstString(offset + 109, $fr_cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 (Matching source) 得意先分類名１(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm1(String value) {
		setConstString(offset + 109, $fr_cst_grp_nm1, value);
	}


	/**
	 * Customer classification cd. 2 (Matching source) 得意先分類ＣＤ２(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd2() {
		return getConstString(offset + 110, $fr_cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 (Matching source) 得意先分類ＣＤ２(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd2(String value) {
		setConstString(offset + 110, $fr_cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 (Matching source) 得意先分類名２(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm2() {
		return getConstString(offset + 111, $fr_cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 (Matching source) 得意先分類名２(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm2(String value) {
		setConstString(offset + 111, $fr_cst_grp_nm2, value);
	}


	/**
	 * Customer classification cd. 3 (Matching source) 得意先分類ＣＤ３(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd3() {
		return getConstString(offset + 112, $fr_cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 (Matching source) 得意先分類ＣＤ３(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd3(String value) {
		setConstString(offset + 112, $fr_cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 (Matching source) 得意先分類名３(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm3() {
		return getConstString(offset + 113, $fr_cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 (Matching source) 得意先分類名３(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm3(String value) {
		setConstString(offset + 113, $fr_cst_grp_nm3, value);
	}


	/**
	 * Customer classification cd. 4 (Matching source) 得意先分類ＣＤ４(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd4() {
		return getConstString(offset + 114, $fr_cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 (Matching source) 得意先分類ＣＤ４(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd4(String value) {
		setConstString(offset + 114, $fr_cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 (Matching source) 得意先分類名４(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm4() {
		return getConstString(offset + 115, $fr_cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 (Matching source) 得意先分類名４(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm4(String value) {
		setConstString(offset + 115, $fr_cst_grp_nm4, value);
	}


	/**
	 * Customer classification cd. 5 (Matching source) 得意先分類ＣＤ５(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd5() {
		return getConstString(offset + 116, $fr_cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 (Matching source) 得意先分類ＣＤ５(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd5(String value) {
		setConstString(offset + 116, $fr_cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 (Matching source) 得意先分類名５(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm5() {
		return getConstString(offset + 117, $fr_cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 (Matching source) 得意先分類名５(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm5(String value) {
		setConstString(offset + 117, $fr_cst_grp_nm5, value);
	}


	/**
	 * Customer classification cd. 6 (Matching source) 得意先分類ＣＤ６(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd6() {
		return getConstString(offset + 118, $fr_cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 (Matching source) 得意先分類ＣＤ６(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd6(String value) {
		setConstString(offset + 118, $fr_cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 (Matching source) 得意先分類名６(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm6() {
		return getConstString(offset + 119, $fr_cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 (Matching source) 得意先分類名６(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm6(String value) {
		setConstString(offset + 119, $fr_cst_grp_nm6, value);
	}


	/**
	 * Customer classification cd. 7 (Matching source) 得意先分類ＣＤ７(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd7() {
		return getConstString(offset + 120, $fr_cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 (Matching source) 得意先分類ＣＤ７(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd7(String value) {
		setConstString(offset + 120, $fr_cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 (Matching source) 得意先分類名７(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm7() {
		return getConstString(offset + 121, $fr_cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 (Matching source) 得意先分類名７(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm7(String value) {
		setConstString(offset + 121, $fr_cst_grp_nm7, value);
	}


	/**
	 * Customer classification cd. 8 (Matching source) 得意先分類ＣＤ８(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd8() {
		return getConstString(offset + 122, $fr_cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 (Matching source) 得意先分類ＣＤ８(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd8(String value) {
		setConstString(offset + 122, $fr_cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 (Matching source) 得意先分類名８(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm8() {
		return getConstString(offset + 123, $fr_cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 (Matching source) 得意先分類名８(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm8(String value) {
		setConstString(offset + 123, $fr_cst_grp_nm8, value);
	}


	/**
	 * Customer classification cd. 9 (Matching source) 得意先分類ＣＤ９(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd9() {
		return getConstString(offset + 124, $fr_cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 (Matching source) 得意先分類ＣＤ９(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd9(String value) {
		setConstString(offset + 124, $fr_cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 (Matching source) 得意先分類名９(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm9() {
		return getConstString(offset + 125, $fr_cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 (Matching source) 得意先分類名９(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm9(String value) {
		setConstString(offset + 125, $fr_cst_grp_nm9, value);
	}


	/**
	 * Customer classification cd. 10 (Matching source) 得意先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public String fr_cst_grp_cd10() {
		return getConstString(offset + 126, $fr_cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 (Matching source) 得意先分類ＣＤ１０(消込元).<p>
	 *
	 */
	public void fr_cst_grp_cd10(String value) {
		setConstString(offset + 126, $fr_cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 (Matching source) 得意先分類名１０(消込元).<p>
	 *
	 */
	public String fr_cst_grp_nm10() {
		return getConstString(offset + 127, $fr_cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 (Matching source) 得意先分類名１０(消込元).<p>
	 *
	 */
	public void fr_cst_grp_nm10(String value) {
		setConstString(offset + 127, $fr_cst_grp_nm10, value);
	}


	/**
	 * Entry user ID (Matching source) 登録ユーザＩＤ(消込元).<p>
	 *
	 */
	public String fr_ins_usr_id() {
		return getConstString(offset + 128, $fr_ins_usr_id);
	}

	/**
	 * Entry user ID (Matching source) 登録ユーザＩＤ(消込元).<p>
	 *
	 */
	public void fr_ins_usr_id(String value) {
		setConstString(offset + 128, $fr_ins_usr_id, value);
	}


	/**
	 * Entry user name (Matching source) 登録ユーザ名(消込元).<p>
	 *
	 */
	public String fr_ins_usr_nm() {
		return getConstString(offset + 129, $fr_ins_usr_nm);
	}

	/**
	 * Entry user name (Matching source) 登録ユーザ名(消込元).<p>
	 *
	 */
	public void fr_ins_usr_nm(String value) {
		setConstString(offset + 129, $fr_ins_usr_nm, value);
	}


	/**
	 * Entry function ID (Matching source) 登録機能ＩＤ(消込元).<p>
	 *
	 */
	public String fr_ins_func_id() {
		return getConstString(offset + 130, $fr_ins_func_id);
	}

	/**
	 * Entry function ID (Matching source) 登録機能ＩＤ(消込元).<p>
	 *
	 */
	public void fr_ins_func_id(String value) {
		setConstString(offset + 130, $fr_ins_func_id, value);
	}


	/**
	 * Entry function name (Matching source) 登録機能名(消込元).<p>
	 *
	 */
	public String fr_ins_func_nm() {
		return getConstString(offset + 131, $fr_ins_func_nm);
	}

	/**
	 * Entry function name (Matching source) 登録機能名(消込元).<p>
	 *
	 */
	public void fr_ins_func_nm(String value) {
		setConstString(offset + 131, $fr_ins_func_nm, value);
	}


	/**
	 * Entry date and time (Matching source) 登録日時(消込元).<p>
	 *
	 */
	public MCTimestamp fr_ins_ts() {
		return getConstTimestamp(offset + 132, $fr_ins_ts);
	}

	/**
	 * Entry date and time (Matching source) 登録日時(消込元).<p>
	 *
	 */
	public void fr_ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 132, $fr_ins_ts, value);
	}


	/**
	 * Update user ID (Matching source) 更新ユーザＩＤ(消込元).<p>
	 *
	 */
	public String fr_upd_usr_id() {
		return getConstString(offset + 133, $fr_upd_usr_id);
	}

	/**
	 * Update user ID (Matching source) 更新ユーザＩＤ(消込元).<p>
	 *
	 */
	public void fr_upd_usr_id(String value) {
		setConstString(offset + 133, $fr_upd_usr_id, value);
	}


	/**
	 * Update user name (Matching source) 更新ユーザ名(消込元).<p>
	 *
	 */
	public String fr_upd_usr_nm() {
		return getConstString(offset + 134, $fr_upd_usr_nm);
	}

	/**
	 * Update user name (Matching source) 更新ユーザ名(消込元).<p>
	 *
	 */
	public void fr_upd_usr_nm(String value) {
		setConstString(offset + 134, $fr_upd_usr_nm, value);
	}


	/**
	 * Update function ID (Matching source) 更新機能ＩＤ(消込元).<p>
	 *
	 */
	public String fr_upd_func_id() {
		return getConstString(offset + 135, $fr_upd_func_id);
	}

	/**
	 * Update function ID (Matching source) 更新機能ＩＤ(消込元).<p>
	 *
	 */
	public void fr_upd_func_id(String value) {
		setConstString(offset + 135, $fr_upd_func_id, value);
	}


	/**
	 * Update function name (Matching source) 更新機能名(消込元).<p>
	 *
	 */
	public String fr_upd_func_nm() {
		return getConstString(offset + 136, $fr_upd_func_nm);
	}

	/**
	 * Update function name (Matching source) 更新機能名(消込元).<p>
	 *
	 */
	public void fr_upd_func_nm(String value) {
		setConstString(offset + 136, $fr_upd_func_nm, value);
	}


	/**
	 * Update date and time (Matching source) 更新日時(消込元).<p>
	 *
	 */
	public MCTimestamp fr_upd_ts() {
		return getConstTimestamp(offset + 137, $fr_upd_ts);
	}

	/**
	 * Update date and time (Matching source) 更新日時(消込元).<p>
	 *
	 */
	public void fr_upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 137, $fr_upd_ts, value);
	}


	/**
	 * Update request No. (Matching source) 更新リクエストＮＯ(消込元).<p>
	 *
	 */
	public String fr_upd_srv_req_no() {
		return getConstString(offset + 138, $fr_upd_srv_req_no);
	}

	/**
	 * Update request No. (Matching source) 更新リクエストＮＯ(消込元).<p>
	 *
	 */
	public void fr_upd_srv_req_no(String value) {
		setConstString(offset + 138, $fr_upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($to_dmnd_no.equalsIgnoreCase(name)) {
			return to_dmnd_no();
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
		if ($fr_ym.equalsIgnoreCase(name)) {
			return fr_ym();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
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
		if ($fr_ym.equalsIgnoreCase(name)) {
			return fr_ym();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
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
		if ($fr_ym.equalsIgnoreCase(name)) {
			fr_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
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
		if ($fr_ym.equalsIgnoreCase(name)) {
			fr_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
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

