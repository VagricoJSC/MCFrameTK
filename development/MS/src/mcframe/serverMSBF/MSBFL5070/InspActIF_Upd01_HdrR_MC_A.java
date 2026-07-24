package mcframe.serverMSBF.MSBFL5070;

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
 * ブロック"InspActIF_Upd01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspActIF_Upd01_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public static final String $insp_freq = "insp_freq";
	/**
	 * Update number of inspections 検査回数更新.<p>
	 *
	 */
	public static final String $insp_freq_upd_flg = "insp_freq_upd_flg";
	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public static final String $src_no1 = "src_no1";
	/**
	 * Update creation source No. 1 作成元ＮＯ１更新.<p>
	 *
	 */
	public static final String $src_no1_upd_flg = "src_no1_upd_flg";
	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public static final String $src_no2 = "src_no2";
	/**
	 * Update creation source No. 2 作成元ＮＯ２更新.<p>
	 *
	 */
	public static final String $src_no2_upd_flg = "src_no2_upd_flg";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Update inspection classification type 検査種類区分更新.<p>
	 *
	 */
	public static final String $insp_typ_upd_flg = "insp_typ_upd_flg";
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 * Update inspection method type 検査方法区分更新.<p>
	 *
	 */
	public static final String $insp_mtd_typ_upd_flg = "insp_mtd_typ_upd_flg";
	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	/**
	 * Update inspection status type 検査状況区分更新.<p>
	 *
	 */
	public static final String $insp_sts_typ_upd_flg = "insp_sts_typ_upd_flg";
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 * Update inspection approval status type 検査承認状況区分更新.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_upd_flg = "insp_aprv_sts_typ_upd_flg";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Update item cd. 品目ＣＤ更新.<p>
	 *
	 */
	public static final String $itm_cd_upd_flg = "itm_cd_upd_flg";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Update branch No. 1 枝番１更新.<p>
	 *
	 */
	public static final String $itm_sub1_upd_flg = "itm_sub1_upd_flg";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Update branch No. 2 枝番２更新.<p>
	 *
	 */
	public static final String $itm_sub2_upd_flg = "itm_sub2_upd_flg";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Update branch No. 3 枝番３更新.<p>
	 *
	 */
	public static final String $itm_sub3_upd_flg = "itm_sub3_upd_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Lot No. update ロットＮＯ更新.<p>
	 *
	 */
	public static final String $lot_no_upd_flg = "lot_no_upd_flg";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Sublot No.?update サブロットＮＯ更新.<p>
	 *
	 */
	public static final String $sublot_no_upd_flg = "sublot_no_upd_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Version No. update 版ＮＯ更新.<p>
	 *
	 */
	public static final String $ver_no_upd_flg = "ver_no_upd_flg";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Update conforming type 良品区分更新.<p>
	 *
	 */
	public static final String $quality_typ_upd_flg = "quality_typ_upd_flg";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading cd. update 格付ＣＤ更新.<p>
	 *
	 */
	public static final String $gd_cd_upd_flg = "gd_cd_upd_flg";
	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public static final String $dfct_rsn_cd = "dfct_rsn_cd";
	/**
	 * Update defective reason cd. 不良理由ＣＤ更新.<p>
	 *
	 */
	public static final String $dfct_rsn_cd_upd_flg = "dfct_rsn_cd_upd_flg";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Update supplier cd. 発注先ＣＤ更新.<p>
	 *
	 */
	public static final String $sppl_cd_upd_flg = "sppl_cd_upd_flg";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker cd. update メーカＣＤ更新.<p>
	 *
	 */
	public static final String $maker_cd_upd_flg = "maker_cd_upd_flg";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Update mfg. location cd. 製造場所ＣＤ更新.<p>
	 *
	 */
	public static final String $mfg_loc_cd_upd_flg = "mfg_loc_cd_upd_flg";
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	/**
	 * Update shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ更新.<p>
	 *
	 */
	public static final String $from_site_cd_upd_flg = "from_site_cd_upd_flg";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Update base unit qty. 基準単位数量更新.<p>
	 *
	 */
	public static final String $base_unit_qty_upd_flg = "base_unit_qty_upd_flg";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Update base unit cd. 基準単位ＣＤ更新.<p>
	 *
	 */
	public static final String $base_unit_cd_upd_flg = "base_unit_cd_upd_flg";
	/**
	 * Inventory gross qty. 総在庫数量.<p>
	 *
	 */
	public static final String $ttl_stk_qty = "ttl_stk_qty";
	/**
	 * Update inventory gross qty. 総在庫数量更新.<p>
	 *
	 */
	public static final String $ttl_stk_qty_upd_flg = "ttl_stk_qty_upd_flg";
	/**
	 * Inspection start date 検査開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Inspection start time 検査開始時刻.<p>
	 *
	 */
	public static final String $st_hm = "st_hm";
	/**
	 * Update inspection start time 検査開始時刻更新.<p>
	 *
	 */
	public static final String $st_hm_upd_flg = "st_hm_upd_flg";
	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Inspection end time 検査終了時刻.<p>
	 *
	 */
	public static final String $end_hm = "end_hm";
	/**
	 * Update inspection end time 検査終了時刻更新.<p>
	 *
	 */
	public static final String $end_hm_upd_flg = "end_hm_upd_flg";
	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Update implementation PIC cd. 実施担当者ＣＤ更新.<p>
	 *
	 */
	public static final String $act_usr_cd_upd_flg = "act_usr_cd_upd_flg";
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Update Implementation dept. cd. 実施部門ＣＤ更新.<p>
	 *
	 */
	public static final String $act_dpt_cd_upd_flg = "act_dpt_cd_upd_flg";
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ = "lmt_dt_frm_typ";
	/**
	 * Update expiration base date type 期限起算日区分更新.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ_upd_flg = "lmt_dt_frm_typ_upd_flg";
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	/**
	 * Update base date 起算日更新.<p>
	 *
	 */
	public static final String $lmt_dt_frm_upd_flg = "lmt_dt_frm_upd_flg";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public static final String $vld_dt_upd_flg = "vld_dt_upd_flg";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * Update usage expiration date 使用期限更新.<p>
	 *
	 */
	public static final String $lmt_dt_upd_flg = "lmt_dt_upd_flg";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Update actual active ingredient coefficient 実際有効成分係数更新.<p>
	 *
	 */
	public static final String $act_cont_fctr_upd_flg = "act_cont_fctr_upd_flg";
	/**
	 * Start cancellation recording date 着手取消計上日.<p>
	 *
	 */
	public static final String $stt_can_ac_dt = "stt_can_ac_dt";
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Update result internal remarks 実績内部備考更新.<p>
	 *
	 */
	public static final String $intr_rmrks_upd_flg = "intr_rmrks_upd_flg";
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 * Update lot remarks ロット備考更新.<p>
	 *
	 */
	public static final String $lot_rmrks_upd_flg = "lot_rmrks_upd_flg";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public static final String $sub_char1_upd_flg = "sub_char1_upd_flg";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public static final String $sub_char2_upd_flg = "sub_char2_upd_flg";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public static final String $sub_char3_upd_flg = "sub_char3_upd_flg";
	/**
	 * Update counter (inspection order) 更新カウンタ（検査指図）.<p>
	 *
	 */
	public static final String $insp_inst_upd_cntr = "insp_inst_upd_cntr";
	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public static final String $act_upd_cntr = "act_upd_cntr";
	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public static final String $lims_flg = "lims_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_act_no = "ext_insp_act_no";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta insp_freq_upd_flg_META = createCommonMeta($insp_freq_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta src_no1_META = createCommonMeta($src_no1, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no1_upd_flg_META = createCommonMeta($src_no1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta src_no2_META = createCommonMeta($src_no2, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no2_upd_flg_META = createCommonMeta($src_no2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_typ_upd_flg_META = createCommonMeta($insp_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_mtd_typ_upd_flg_META = createCommonMeta($insp_mtd_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_sts_typ_upd_flg_META = createCommonMeta($insp_sts_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_upd_flg_META = createCommonMeta($insp_aprv_sts_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_cd_upd_flg_META = createCommonMeta($itm_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_upd_flg_META = createCommonMeta($itm_sub1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_upd_flg_META = createCommonMeta($itm_sub2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_upd_flg_META = createCommonMeta($itm_sub3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_upd_flg_META = createCommonMeta($lot_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_upd_flg_META = createCommonMeta($sublot_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta ver_no_upd_flg_META = createCommonMeta($ver_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_upd_flg_META = createCommonMeta($quality_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_cd_upd_flg_META = createCommonMeta($gd_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dfct_rsn_cd_META = createCommonMeta($dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dfct_rsn_cd_upd_flg_META = createCommonMeta($dfct_rsn_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_cd_upd_flg_META = createCommonMeta($sppl_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_upd_flg_META = createCommonMeta($maker_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_cd_upd_flg_META = createCommonMeta($mfg_loc_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta from_site_cd_upd_flg_META = createCommonMeta($from_site_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_upd_flg_META = createCommonMeta($base_unit_qty_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_cd_upd_flg_META = createCommonMeta($base_unit_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ttl_stk_qty_META = createCommonMeta($ttl_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ttl_stk_qty_upd_flg_META = createCommonMeta($ttl_stk_qty_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_hm_META = createCommonMeta($st_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta st_hm_upd_flg_META = createCommonMeta($st_hm_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_hm_META = createCommonMeta($end_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_hm_upd_flg_META = createCommonMeta($end_hm_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_cd_upd_flg_META = createCommonMeta($act_usr_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_cd_upd_flg_META = createCommonMeta($act_dpt_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_typ_upd_flg_META = createCommonMeta($lmt_dt_frm_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_frm_upd_flg_META = createCommonMeta($lmt_dt_frm_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_upd_flg_META = createCommonMeta($vld_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_upd_flg_META = createCommonMeta($lmt_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta act_cont_fctr_upd_flg_META = createCommonMeta($act_cont_fctr_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stt_can_ac_dt_META = createCommonMeta($stt_can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_INTR_RMRKS);
	public static final MCMeta intr_rmrks_upd_flg_META = createCommonMeta($intr_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta lot_rmrks_upd_flg_META = createCommonMeta($lot_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char1_upd_flg_META = createCommonMeta($sub_char1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char2_upd_flg_META = createCommonMeta($sub_char2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR3);
	public static final MCMeta sub_char3_upd_flg_META = createCommonMeta($sub_char3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_inst_upd_cntr_META = createCommonMeta($insp_inst_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta act_upd_cntr_META = createCommonMeta($act_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_insp_act_no_META = createCommonMeta($ext_insp_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);

	protected static final ConstMetaList<InspActIF_Upd01_HdrR> constMetas = new ConstMetaList<InspActIF_Upd01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			insp_no_META,
			insp_act_no_META,
			insp_freq_META,
			insp_freq_upd_flg_META,
			src_no1_META,
			src_no1_upd_flg_META,
			src_no2_META,
			src_no2_upd_flg_META,
			insp_typ_META,
			insp_typ_upd_flg_META,
			insp_mtd_typ_META,
			insp_mtd_typ_upd_flg_META,
			insp_sts_typ_META,
			insp_sts_typ_upd_flg_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_upd_flg_META,
			itm_cd_META,
			itm_cd_upd_flg_META,
			itm_sub1_META,
			itm_sub1_upd_flg_META,
			itm_sub2_META,
			itm_sub2_upd_flg_META,
			itm_sub3_META,
			itm_sub3_upd_flg_META,
			lot_no_META,
			lot_no_upd_flg_META,
			sublot_no_META,
			sublot_no_upd_flg_META,
			ver_no_META,
			ver_no_upd_flg_META,
			quality_typ_META,
			quality_typ_upd_flg_META,
			gd_cd_META,
			gd_cd_upd_flg_META,
			dfct_rsn_cd_META,
			dfct_rsn_cd_upd_flg_META,
			sppl_cd_META,
			sppl_cd_upd_flg_META,
			maker_cd_META,
			maker_cd_upd_flg_META,
			mfg_loc_cd_META,
			mfg_loc_cd_upd_flg_META,
			from_site_cd_META,
			from_site_cd_upd_flg_META,
			base_unit_qty_META,
			base_unit_qty_upd_flg_META,
			base_unit_cd_META,
			base_unit_cd_upd_flg_META,
			ttl_stk_qty_META,
			ttl_stk_qty_upd_flg_META,
			st_dt_META,
			st_hm_META,
			st_hm_upd_flg_META,
			end_dt_META,
			end_hm_META,
			end_hm_upd_flg_META,
			act_usr_cd_META,
			act_usr_cd_upd_flg_META,
			act_dpt_cd_META,
			act_dpt_cd_upd_flg_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_typ_upd_flg_META,
			lmt_dt_frm_META,
			lmt_dt_frm_upd_flg_META,
			vld_dt_META,
			vld_dt_upd_flg_META,
			lmt_dt_META,
			lmt_dt_upd_flg_META,
			act_cont_fctr_META,
			act_cont_fctr_upd_flg_META,
			stt_can_ac_dt_META,
			intr_rmrks_META,
			intr_rmrks_upd_flg_META,
			lot_rmrks_META,
			lot_rmrks_upd_flg_META,
			sub_char1_META,
			sub_char1_upd_flg_META,
			sub_char2_META,
			sub_char2_upd_flg_META,
			sub_char3_META,
			sub_char3_upd_flg_META,
			insp_inst_upd_cntr_META,
			act_upd_cntr_META,
			lims_flg_META,
			ext_sys_cd_META,
			ext_insp_act_no_META
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
	protected InspActIF_Upd01_HdrR_MC_A(ConstMetaList<? extends InspActIF_Upd01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActIF_Upd01_HdrR clone() {
		return (InspActIF_Upd01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActIF_Upd01_HdrR createInstance() {
		return (InspActIF_Upd01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActIF_Upd01_HdrR getValues(String... names) {
		return (InspActIF_Upd01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 2, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 2, $insp_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 3, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 3, $insp_act_no, value);
	}


	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 4, $insp_freq);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 4, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 4, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 4, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 4, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 4, $insp_freq, value);
	}


	/**
	 * Update number of inspections 検査回数更新.<p>
	 *
	 */
	public boolean insp_freq_upd_flg() {
		return getConstBoolean(offset + 5, $insp_freq_upd_flg);
	}

	/**
	 * Update number of inspections 検査回数更新.<p>
	 *
	 */
	public void insp_freq_upd_flg(boolean value) {
		setConstBoolean(offset + 5, $insp_freq_upd_flg, value);
	}


	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public String src_no1() {
		return getConstString(offset + 6, $src_no1);
	}

	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public void src_no1(String value) {
		setConstString(offset + 6, $src_no1, value);
	}


	/**
	 * Update creation source No. 1 作成元ＮＯ１更新.<p>
	 *
	 */
	public boolean src_no1_upd_flg() {
		return getConstBoolean(offset + 7, $src_no1_upd_flg);
	}

	/**
	 * Update creation source No. 1 作成元ＮＯ１更新.<p>
	 *
	 */
	public void src_no1_upd_flg(boolean value) {
		setConstBoolean(offset + 7, $src_no1_upd_flg, value);
	}


	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public String src_no2() {
		return getConstString(offset + 8, $src_no2);
	}

	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public void src_no2(String value) {
		setConstString(offset + 8, $src_no2, value);
	}


	/**
	 * Update creation source No. 2 作成元ＮＯ２更新.<p>
	 *
	 */
	public boolean src_no2_upd_flg() {
		return getConstBoolean(offset + 9, $src_no2_upd_flg);
	}

	/**
	 * Update creation source No. 2 作成元ＮＯ２更新.<p>
	 *
	 */
	public void src_no2_upd_flg(boolean value) {
		setConstBoolean(offset + 9, $src_no2_upd_flg, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 10, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 10, $insp_typ, value);
	}


	/**
	 * Update inspection classification type 検査種類区分更新.<p>
	 *
	 */
	public boolean insp_typ_upd_flg() {
		return getConstBoolean(offset + 11, $insp_typ_upd_flg);
	}

	/**
	 * Update inspection classification type 検査種類区分更新.<p>
	 *
	 */
	public void insp_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 11, $insp_typ_upd_flg, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 12, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 12, $insp_mtd_typ, value);
	}


	/**
	 * Update inspection method type 検査方法区分更新.<p>
	 *
	 */
	public boolean insp_mtd_typ_upd_flg() {
		return getConstBoolean(offset + 13, $insp_mtd_typ_upd_flg);
	}

	/**
	 * Update inspection method type 検査方法区分更新.<p>
	 *
	 */
	public void insp_mtd_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 13, $insp_mtd_typ_upd_flg, value);
	}


	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 14, $insp_sts_typ);
	}

	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 14, $insp_sts_typ, value);
	}


	/**
	 * Update inspection status type 検査状況区分更新.<p>
	 *
	 */
	public boolean insp_sts_typ_upd_flg() {
		return getConstBoolean(offset + 15, $insp_sts_typ_upd_flg);
	}

	/**
	 * Update inspection status type 検査状況区分更新.<p>
	 *
	 */
	public void insp_sts_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 15, $insp_sts_typ_upd_flg, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 16, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 16, $insp_aprv_sts_typ, value);
	}


	/**
	 * Update inspection approval status type 検査承認状況区分更新.<p>
	 *
	 */
	public boolean insp_aprv_sts_typ_upd_flg() {
		return getConstBoolean(offset + 17, $insp_aprv_sts_typ_upd_flg);
	}

	/**
	 * Update inspection approval status type 検査承認状況区分更新.<p>
	 *
	 */
	public void insp_aprv_sts_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 17, $insp_aprv_sts_typ_upd_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 18, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 18, $itm_cd, value);
	}


	/**
	 * Update item cd. 品目ＣＤ更新.<p>
	 *
	 */
	public boolean itm_cd_upd_flg() {
		return getConstBoolean(offset + 19, $itm_cd_upd_flg);
	}

	/**
	 * Update item cd. 品目ＣＤ更新.<p>
	 *
	 */
	public void itm_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 19, $itm_cd_upd_flg, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 20, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 20, $itm_sub1, value);
	}


	/**
	 * Update branch No. 1 枝番１更新.<p>
	 *
	 */
	public boolean itm_sub1_upd_flg() {
		return getConstBoolean(offset + 21, $itm_sub1_upd_flg);
	}

	/**
	 * Update branch No. 1 枝番１更新.<p>
	 *
	 */
	public void itm_sub1_upd_flg(boolean value) {
		setConstBoolean(offset + 21, $itm_sub1_upd_flg, value);
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
	 * Update branch No. 2 枝番２更新.<p>
	 *
	 */
	public boolean itm_sub2_upd_flg() {
		return getConstBoolean(offset + 23, $itm_sub2_upd_flg);
	}

	/**
	 * Update branch No. 2 枝番２更新.<p>
	 *
	 */
	public void itm_sub2_upd_flg(boolean value) {
		setConstBoolean(offset + 23, $itm_sub2_upd_flg, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 24, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 24, $itm_sub3, value);
	}


	/**
	 * Update branch No. 3 枝番３更新.<p>
	 *
	 */
	public boolean itm_sub3_upd_flg() {
		return getConstBoolean(offset + 25, $itm_sub3_upd_flg);
	}

	/**
	 * Update branch No. 3 枝番３更新.<p>
	 *
	 */
	public void itm_sub3_upd_flg(boolean value) {
		setConstBoolean(offset + 25, $itm_sub3_upd_flg, value);
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
	 * Lot No. update ロットＮＯ更新.<p>
	 *
	 */
	public boolean lot_no_upd_flg() {
		return getConstBoolean(offset + 27, $lot_no_upd_flg);
	}

	/**
	 * Lot No. update ロットＮＯ更新.<p>
	 *
	 */
	public void lot_no_upd_flg(boolean value) {
		setConstBoolean(offset + 27, $lot_no_upd_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 28, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 28, $sublot_no, value);
	}


	/**
	 * Sublot No.?update サブロットＮＯ更新.<p>
	 *
	 */
	public boolean sublot_no_upd_flg() {
		return getConstBoolean(offset + 29, $sublot_no_upd_flg);
	}

	/**
	 * Sublot No.?update サブロットＮＯ更新.<p>
	 *
	 */
	public void sublot_no_upd_flg(boolean value) {
		setConstBoolean(offset + 29, $sublot_no_upd_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 30, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 30, $ver_no, value);
	}


	/**
	 * Version No. update 版ＮＯ更新.<p>
	 *
	 */
	public boolean ver_no_upd_flg() {
		return getConstBoolean(offset + 31, $ver_no_upd_flg);
	}

	/**
	 * Version No. update 版ＮＯ更新.<p>
	 *
	 */
	public void ver_no_upd_flg(boolean value) {
		setConstBoolean(offset + 31, $ver_no_upd_flg, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 32, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 32, $quality_typ, value);
	}


	/**
	 * Update conforming type 良品区分更新.<p>
	 *
	 */
	public boolean quality_typ_upd_flg() {
		return getConstBoolean(offset + 33, $quality_typ_upd_flg);
	}

	/**
	 * Update conforming type 良品区分更新.<p>
	 *
	 */
	public void quality_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 33, $quality_typ_upd_flg, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 34, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 34, $gd_cd, value);
	}


	/**
	 * Grading cd. update 格付ＣＤ更新.<p>
	 *
	 */
	public boolean gd_cd_upd_flg() {
		return getConstBoolean(offset + 35, $gd_cd_upd_flg);
	}

	/**
	 * Grading cd. update 格付ＣＤ更新.<p>
	 *
	 */
	public void gd_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 35, $gd_cd_upd_flg, value);
	}


	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public String dfct_rsn_cd() {
		return getConstString(offset + 36, $dfct_rsn_cd);
	}

	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public void dfct_rsn_cd(String value) {
		setConstString(offset + 36, $dfct_rsn_cd, value);
	}


	/**
	 * Update defective reason cd. 不良理由ＣＤ更新.<p>
	 *
	 */
	public boolean dfct_rsn_cd_upd_flg() {
		return getConstBoolean(offset + 37, $dfct_rsn_cd_upd_flg);
	}

	/**
	 * Update defective reason cd. 不良理由ＣＤ更新.<p>
	 *
	 */
	public void dfct_rsn_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 37, $dfct_rsn_cd_upd_flg, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 38, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 38, $sppl_cd, value);
	}


	/**
	 * Update supplier cd. 発注先ＣＤ更新.<p>
	 *
	 */
	public boolean sppl_cd_upd_flg() {
		return getConstBoolean(offset + 39, $sppl_cd_upd_flg);
	}

	/**
	 * Update supplier cd. 発注先ＣＤ更新.<p>
	 *
	 */
	public void sppl_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 39, $sppl_cd_upd_flg, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 40, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 40, $maker_cd, value);
	}


	/**
	 * Maker cd. update メーカＣＤ更新.<p>
	 *
	 */
	public boolean maker_cd_upd_flg() {
		return getConstBoolean(offset + 41, $maker_cd_upd_flg);
	}

	/**
	 * Maker cd. update メーカＣＤ更新.<p>
	 *
	 */
	public void maker_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 41, $maker_cd_upd_flg, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 42, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 42, $mfg_loc_cd, value);
	}


	/**
	 * Update mfg. location cd. 製造場所ＣＤ更新.<p>
	 *
	 */
	public boolean mfg_loc_cd_upd_flg() {
		return getConstBoolean(offset + 43, $mfg_loc_cd_upd_flg);
	}

	/**
	 * Update mfg. location cd. 製造場所ＣＤ更新.<p>
	 *
	 */
	public void mfg_loc_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 43, $mfg_loc_cd_upd_flg, value);
	}


	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 44, $from_site_cd);
	}

	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 44, $from_site_cd, value);
	}


	/**
	 * Update shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ更新.<p>
	 *
	 */
	public boolean from_site_cd_upd_flg() {
		return getConstBoolean(offset + 45, $from_site_cd_upd_flg);
	}

	/**
	 * Update shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ更新.<p>
	 *
	 */
	public void from_site_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 45, $from_site_cd_upd_flg, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 46, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 46, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 46, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 46, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 46, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 46, $base_unit_qty, value);
	}


	/**
	 * Update base unit qty. 基準単位数量更新.<p>
	 *
	 */
	public boolean base_unit_qty_upd_flg() {
		return getConstBoolean(offset + 47, $base_unit_qty_upd_flg);
	}

	/**
	 * Update base unit qty. 基準単位数量更新.<p>
	 *
	 */
	public void base_unit_qty_upd_flg(boolean value) {
		setConstBoolean(offset + 47, $base_unit_qty_upd_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 48, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 48, $base_unit_cd, value);
	}


	/**
	 * Update base unit cd. 基準単位ＣＤ更新.<p>
	 *
	 */
	public boolean base_unit_cd_upd_flg() {
		return getConstBoolean(offset + 49, $base_unit_cd_upd_flg);
	}

	/**
	 * Update base unit cd. 基準単位ＣＤ更新.<p>
	 *
	 */
	public void base_unit_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 49, $base_unit_cd_upd_flg, value);
	}


	/**
	 * Inventory gross qty. 総在庫数量.<p>
	 *
	 */
	public MCNumber ttl_stk_qty() {
		return getConstNumber(offset + 50, $ttl_stk_qty);
	}

	/**
	 * Inventory gross qty. 総在庫数量.<p>
	 *
	 */
	public void ttl_stk_qty(MCNumber value) {
		setConstNumber(offset + 50, $ttl_stk_qty, value);
	}

	/**
	 * Inventory gross qty. 総在庫数量.<p>
	 *
	 */
	public void ttl_stk_qty(int value) {
		setConstNumber(offset + 50, $ttl_stk_qty, value);
	}

	/**
	 * Inventory gross qty. 総在庫数量.<p>
	 *
	 */
	public void ttl_stk_qty(long value) {
		setConstNumber(offset + 50, $ttl_stk_qty, value);
	}

	/**
	 * Inventory gross qty. 総在庫数量.<p>
	 *
	 */
	public void ttl_stk_qty(float value) {
		setConstNumber(offset + 50, $ttl_stk_qty, value);
	}

	/**
	 * Inventory gross qty. 総在庫数量.<p>
	 *
	 */
	public void ttl_stk_qty(double value) {
		setConstNumber(offset + 50, $ttl_stk_qty, value);
	}


	/**
	 * Update inventory gross qty. 総在庫数量更新.<p>
	 *
	 */
	public boolean ttl_stk_qty_upd_flg() {
		return getConstBoolean(offset + 51, $ttl_stk_qty_upd_flg);
	}

	/**
	 * Update inventory gross qty. 総在庫数量更新.<p>
	 *
	 */
	public void ttl_stk_qty_upd_flg(boolean value) {
		setConstBoolean(offset + 51, $ttl_stk_qty_upd_flg, value);
	}


	/**
	 * Inspection start date 検査開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 52, $st_dt);
	}

	/**
	 * Inspection start date 検査開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 52, $st_dt, value);
	}


	/**
	 * Inspection start time 検査開始時刻.<p>
	 *
	 */
	public MCDate st_hm() {
		return getConstDate(offset + 53, $st_hm);
	}

	/**
	 * Inspection start time 検査開始時刻.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		setConstDate(offset + 53, $st_hm, value);
	}


	/**
	 * Update inspection start time 検査開始時刻更新.<p>
	 *
	 */
	public boolean st_hm_upd_flg() {
		return getConstBoolean(offset + 54, $st_hm_upd_flg);
	}

	/**
	 * Update inspection start time 検査開始時刻更新.<p>
	 *
	 */
	public void st_hm_upd_flg(boolean value) {
		setConstBoolean(offset + 54, $st_hm_upd_flg, value);
	}


	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 55, $end_dt);
	}

	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 55, $end_dt, value);
	}


	/**
	 * Inspection end time 検査終了時刻.<p>
	 *
	 */
	public MCDate end_hm() {
		return getConstDate(offset + 56, $end_hm);
	}

	/**
	 * Inspection end time 検査終了時刻.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		setConstDate(offset + 56, $end_hm, value);
	}


	/**
	 * Update inspection end time 検査終了時刻更新.<p>
	 *
	 */
	public boolean end_hm_upd_flg() {
		return getConstBoolean(offset + 57, $end_hm_upd_flg);
	}

	/**
	 * Update inspection end time 検査終了時刻更新.<p>
	 *
	 */
	public void end_hm_upd_flg(boolean value) {
		setConstBoolean(offset + 57, $end_hm_upd_flg, value);
	}


	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 58, $act_usr_cd);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 58, $act_usr_cd, value);
	}


	/**
	 * Update implementation PIC cd. 実施担当者ＣＤ更新.<p>
	 *
	 */
	public boolean act_usr_cd_upd_flg() {
		return getConstBoolean(offset + 59, $act_usr_cd_upd_flg);
	}

	/**
	 * Update implementation PIC cd. 実施担当者ＣＤ更新.<p>
	 *
	 */
	public void act_usr_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 59, $act_usr_cd_upd_flg, value);
	}


	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 60, $act_dpt_cd);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 60, $act_dpt_cd, value);
	}


	/**
	 * Update Implementation dept. cd. 実施部門ＣＤ更新.<p>
	 *
	 */
	public boolean act_dpt_cd_upd_flg() {
		return getConstBoolean(offset + 61, $act_dpt_cd_upd_flg);
	}

	/**
	 * Update Implementation dept. cd. 実施部門ＣＤ更新.<p>
	 *
	 */
	public void act_dpt_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 61, $act_dpt_cd_upd_flg, value);
	}


	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 62, $lmt_dt_frm_typ);
	}

	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 62, $lmt_dt_frm_typ, value);
	}


	/**
	 * Update expiration base date type 期限起算日区分更新.<p>
	 *
	 */
	public boolean lmt_dt_frm_typ_upd_flg() {
		return getConstBoolean(offset + 63, $lmt_dt_frm_typ_upd_flg);
	}

	/**
	 * Update expiration base date type 期限起算日区分更新.<p>
	 *
	 */
	public void lmt_dt_frm_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 63, $lmt_dt_frm_typ_upd_flg, value);
	}


	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 64, $lmt_dt_frm);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 64, $lmt_dt_frm, value);
	}


	/**
	 * Update base date 起算日更新.<p>
	 *
	 */
	public boolean lmt_dt_frm_upd_flg() {
		return getConstBoolean(offset + 65, $lmt_dt_frm_upd_flg);
	}

	/**
	 * Update base date 起算日更新.<p>
	 *
	 */
	public void lmt_dt_frm_upd_flg(boolean value) {
		setConstBoolean(offset + 65, $lmt_dt_frm_upd_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 66, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 66, $vld_dt, value);
	}


	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public boolean vld_dt_upd_flg() {
		return getConstBoolean(offset + 67, $vld_dt_upd_flg);
	}

	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public void vld_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 67, $vld_dt_upd_flg, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 68, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 68, $lmt_dt, value);
	}


	/**
	 * Update usage expiration date 使用期限更新.<p>
	 *
	 */
	public boolean lmt_dt_upd_flg() {
		return getConstBoolean(offset + 69, $lmt_dt_upd_flg);
	}

	/**
	 * Update usage expiration date 使用期限更新.<p>
	 *
	 */
	public void lmt_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 69, $lmt_dt_upd_flg, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 70, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 70, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 70, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 70, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 70, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 70, $act_cont_fctr, value);
	}


	/**
	 * Update actual active ingredient coefficient 実際有効成分係数更新.<p>
	 *
	 */
	public boolean act_cont_fctr_upd_flg() {
		return getConstBoolean(offset + 71, $act_cont_fctr_upd_flg);
	}

	/**
	 * Update actual active ingredient coefficient 実際有効成分係数更新.<p>
	 *
	 */
	public void act_cont_fctr_upd_flg(boolean value) {
		setConstBoolean(offset + 71, $act_cont_fctr_upd_flg, value);
	}


	/**
	 * Start cancellation recording date 着手取消計上日.<p>
	 *
	 */
	public MCDate stt_can_ac_dt() {
		return getConstDate(offset + 72, $stt_can_ac_dt);
	}

	/**
	 * Start cancellation recording date 着手取消計上日.<p>
	 *
	 */
	public void stt_can_ac_dt(MCDate value) {
		setConstDate(offset + 72, $stt_can_ac_dt, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 73, $intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 73, $intr_rmrks, value);
	}


	/**
	 * Update result internal remarks 実績内部備考更新.<p>
	 *
	 */
	public boolean intr_rmrks_upd_flg() {
		return getConstBoolean(offset + 74, $intr_rmrks_upd_flg);
	}

	/**
	 * Update result internal remarks 実績内部備考更新.<p>
	 *
	 */
	public void intr_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 74, $intr_rmrks_upd_flg, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 75, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 75, $lot_rmrks, value);
	}


	/**
	 * Update lot remarks ロット備考更新.<p>
	 *
	 */
	public boolean lot_rmrks_upd_flg() {
		return getConstBoolean(offset + 76, $lot_rmrks_upd_flg);
	}

	/**
	 * Update lot remarks ロット備考更新.<p>
	 *
	 */
	public void lot_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 76, $lot_rmrks_upd_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 77, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 77, $sub_char1, value);
	}


	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public boolean sub_char1_upd_flg() {
		return getConstBoolean(offset + 78, $sub_char1_upd_flg);
	}

	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public void sub_char1_upd_flg(boolean value) {
		setConstBoolean(offset + 78, $sub_char1_upd_flg, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 79, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 79, $sub_char2, value);
	}


	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public boolean sub_char2_upd_flg() {
		return getConstBoolean(offset + 80, $sub_char2_upd_flg);
	}

	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public void sub_char2_upd_flg(boolean value) {
		setConstBoolean(offset + 80, $sub_char2_upd_flg, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 81, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 81, $sub_char3, value);
	}


	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public boolean sub_char3_upd_flg() {
		return getConstBoolean(offset + 82, $sub_char3_upd_flg);
	}

	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public void sub_char3_upd_flg(boolean value) {
		setConstBoolean(offset + 82, $sub_char3_upd_flg, value);
	}


	/**
	 * Update counter (inspection order) 更新カウンタ（検査指図）.<p>
	 *
	 */
	public MCNumber insp_inst_upd_cntr() {
		return getConstNumber(offset + 83, $insp_inst_upd_cntr);
	}

	/**
	 * Update counter (inspection order) 更新カウンタ（検査指図）.<p>
	 *
	 */
	public void insp_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 83, $insp_inst_upd_cntr, value);
	}

	/**
	 * Update counter (inspection order) 更新カウンタ（検査指図）.<p>
	 *
	 */
	public void insp_inst_upd_cntr(int value) {
		setConstNumber(offset + 83, $insp_inst_upd_cntr, value);
	}

	/**
	 * Update counter (inspection order) 更新カウンタ（検査指図）.<p>
	 *
	 */
	public void insp_inst_upd_cntr(long value) {
		setConstNumber(offset + 83, $insp_inst_upd_cntr, value);
	}

	/**
	 * Update counter (inspection order) 更新カウンタ（検査指図）.<p>
	 *
	 */
	public void insp_inst_upd_cntr(float value) {
		setConstNumber(offset + 83, $insp_inst_upd_cntr, value);
	}

	/**
	 * Update counter (inspection order) 更新カウンタ（検査指図）.<p>
	 *
	 */
	public void insp_inst_upd_cntr(double value) {
		setConstNumber(offset + 83, $insp_inst_upd_cntr, value);
	}


	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public MCNumber act_upd_cntr() {
		return getConstNumber(offset + 84, $act_upd_cntr);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 84, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(int value) {
		setConstNumber(offset + 84, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(long value) {
		setConstNumber(offset + 84, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(float value) {
		setConstNumber(offset + 84, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(double value) {
		setConstNumber(offset + 84, $act_upd_cntr, value);
	}


	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 85, $lims_flg);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 85, $lims_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 86, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 86, $ext_sys_cd, value);
	}


	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_no() {
		return getConstString(offset + 87, $ext_insp_act_no);
	}

	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_no(String value) {
		setConstString(offset + 87, $ext_insp_act_no, value);
	}


	public String getString(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			return ttl_stk_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			return insp_inst_upd_cntr();
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			return act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($stt_can_ac_dt.equalsIgnoreCase(name)) {
			return stt_can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($insp_freq_upd_flg.equalsIgnoreCase(name)) {
			return insp_freq_upd_flg();
		}
		if ($src_no1_upd_flg.equalsIgnoreCase(name)) {
			return src_no1_upd_flg();
		}
		if ($src_no2_upd_flg.equalsIgnoreCase(name)) {
			return src_no2_upd_flg();
		}
		if ($insp_typ_upd_flg.equalsIgnoreCase(name)) {
			return insp_typ_upd_flg();
		}
		if ($insp_mtd_typ_upd_flg.equalsIgnoreCase(name)) {
			return insp_mtd_typ_upd_flg();
		}
		if ($insp_sts_typ_upd_flg.equalsIgnoreCase(name)) {
			return insp_sts_typ_upd_flg();
		}
		if ($insp_aprv_sts_typ_upd_flg.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_upd_flg();
		}
		if ($itm_cd_upd_flg.equalsIgnoreCase(name)) {
			return itm_cd_upd_flg();
		}
		if ($itm_sub1_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub1_upd_flg();
		}
		if ($itm_sub2_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub2_upd_flg();
		}
		if ($itm_sub3_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub3_upd_flg();
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			return lot_no_upd_flg();
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			return sublot_no_upd_flg();
		}
		if ($ver_no_upd_flg.equalsIgnoreCase(name)) {
			return ver_no_upd_flg();
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			return quality_typ_upd_flg();
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			return gd_cd_upd_flg();
		}
		if ($dfct_rsn_cd_upd_flg.equalsIgnoreCase(name)) {
			return dfct_rsn_cd_upd_flg();
		}
		if ($sppl_cd_upd_flg.equalsIgnoreCase(name)) {
			return sppl_cd_upd_flg();
		}
		if ($maker_cd_upd_flg.equalsIgnoreCase(name)) {
			return maker_cd_upd_flg();
		}
		if ($mfg_loc_cd_upd_flg.equalsIgnoreCase(name)) {
			return mfg_loc_cd_upd_flg();
		}
		if ($from_site_cd_upd_flg.equalsIgnoreCase(name)) {
			return from_site_cd_upd_flg();
		}
		if ($base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return base_unit_qty_upd_flg();
		}
		if ($base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return base_unit_cd_upd_flg();
		}
		if ($ttl_stk_qty_upd_flg.equalsIgnoreCase(name)) {
			return ttl_stk_qty_upd_flg();
		}
		if ($st_hm_upd_flg.equalsIgnoreCase(name)) {
			return st_hm_upd_flg();
		}
		if ($end_hm_upd_flg.equalsIgnoreCase(name)) {
			return end_hm_upd_flg();
		}
		if ($act_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			return act_usr_cd_upd_flg();
		}
		if ($act_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			return act_dpt_cd_upd_flg();
		}
		if ($lmt_dt_frm_typ_upd_flg.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_upd_flg();
		}
		if ($lmt_dt_frm_upd_flg.equalsIgnoreCase(name)) {
			return lmt_dt_frm_upd_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($lmt_dt_upd_flg.equalsIgnoreCase(name)) {
			return lmt_dt_upd_flg();
		}
		if ($act_cont_fctr_upd_flg.equalsIgnoreCase(name)) {
			return act_cont_fctr_upd_flg();
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($lot_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return lot_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			return ttl_stk_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			return insp_inst_upd_cntr();
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			return act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($stt_can_ac_dt.equalsIgnoreCase(name)) {
			return stt_can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($insp_freq_upd_flg.equalsIgnoreCase(name)) {
			return insp_freq_upd_flg();
		}
		if ($src_no1_upd_flg.equalsIgnoreCase(name)) {
			return src_no1_upd_flg();
		}
		if ($src_no2_upd_flg.equalsIgnoreCase(name)) {
			return src_no2_upd_flg();
		}
		if ($insp_typ_upd_flg.equalsIgnoreCase(name)) {
			return insp_typ_upd_flg();
		}
		if ($insp_mtd_typ_upd_flg.equalsIgnoreCase(name)) {
			return insp_mtd_typ_upd_flg();
		}
		if ($insp_sts_typ_upd_flg.equalsIgnoreCase(name)) {
			return insp_sts_typ_upd_flg();
		}
		if ($insp_aprv_sts_typ_upd_flg.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_upd_flg();
		}
		if ($itm_cd_upd_flg.equalsIgnoreCase(name)) {
			return itm_cd_upd_flg();
		}
		if ($itm_sub1_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub1_upd_flg();
		}
		if ($itm_sub2_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub2_upd_flg();
		}
		if ($itm_sub3_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub3_upd_flg();
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			return lot_no_upd_flg();
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			return sublot_no_upd_flg();
		}
		if ($ver_no_upd_flg.equalsIgnoreCase(name)) {
			return ver_no_upd_flg();
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			return quality_typ_upd_flg();
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			return gd_cd_upd_flg();
		}
		if ($dfct_rsn_cd_upd_flg.equalsIgnoreCase(name)) {
			return dfct_rsn_cd_upd_flg();
		}
		if ($sppl_cd_upd_flg.equalsIgnoreCase(name)) {
			return sppl_cd_upd_flg();
		}
		if ($maker_cd_upd_flg.equalsIgnoreCase(name)) {
			return maker_cd_upd_flg();
		}
		if ($mfg_loc_cd_upd_flg.equalsIgnoreCase(name)) {
			return mfg_loc_cd_upd_flg();
		}
		if ($from_site_cd_upd_flg.equalsIgnoreCase(name)) {
			return from_site_cd_upd_flg();
		}
		if ($base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return base_unit_qty_upd_flg();
		}
		if ($base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return base_unit_cd_upd_flg();
		}
		if ($ttl_stk_qty_upd_flg.equalsIgnoreCase(name)) {
			return ttl_stk_qty_upd_flg();
		}
		if ($st_hm_upd_flg.equalsIgnoreCase(name)) {
			return st_hm_upd_flg();
		}
		if ($end_hm_upd_flg.equalsIgnoreCase(name)) {
			return end_hm_upd_flg();
		}
		if ($act_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			return act_usr_cd_upd_flg();
		}
		if ($act_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			return act_dpt_cd_upd_flg();
		}
		if ($lmt_dt_frm_typ_upd_flg.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_upd_flg();
		}
		if ($lmt_dt_frm_upd_flg.equalsIgnoreCase(name)) {
			return lmt_dt_frm_upd_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($lmt_dt_upd_flg.equalsIgnoreCase(name)) {
			return lmt_dt_upd_flg();
		}
		if ($act_cont_fctr_upd_flg.equalsIgnoreCase(name)) {
			return act_cont_fctr_upd_flg();
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($lot_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return lot_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($stt_can_ac_dt.equalsIgnoreCase(name)) {
			stt_can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($insp_freq_upd_flg.equalsIgnoreCase(name)) {
			insp_freq_upd_flg(value);
			return;
		}
		if ($src_no1_upd_flg.equalsIgnoreCase(name)) {
			src_no1_upd_flg(value);
			return;
		}
		if ($src_no2_upd_flg.equalsIgnoreCase(name)) {
			src_no2_upd_flg(value);
			return;
		}
		if ($insp_typ_upd_flg.equalsIgnoreCase(name)) {
			insp_typ_upd_flg(value);
			return;
		}
		if ($insp_mtd_typ_upd_flg.equalsIgnoreCase(name)) {
			insp_mtd_typ_upd_flg(value);
			return;
		}
		if ($insp_sts_typ_upd_flg.equalsIgnoreCase(name)) {
			insp_sts_typ_upd_flg(value);
			return;
		}
		if ($insp_aprv_sts_typ_upd_flg.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_upd_flg(value);
			return;
		}
		if ($itm_cd_upd_flg.equalsIgnoreCase(name)) {
			itm_cd_upd_flg(value);
			return;
		}
		if ($itm_sub1_upd_flg.equalsIgnoreCase(name)) {
			itm_sub1_upd_flg(value);
			return;
		}
		if ($itm_sub2_upd_flg.equalsIgnoreCase(name)) {
			itm_sub2_upd_flg(value);
			return;
		}
		if ($itm_sub3_upd_flg.equalsIgnoreCase(name)) {
			itm_sub3_upd_flg(value);
			return;
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			lot_no_upd_flg(value);
			return;
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			sublot_no_upd_flg(value);
			return;
		}
		if ($ver_no_upd_flg.equalsIgnoreCase(name)) {
			ver_no_upd_flg(value);
			return;
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			quality_typ_upd_flg(value);
			return;
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			gd_cd_upd_flg(value);
			return;
		}
		if ($dfct_rsn_cd_upd_flg.equalsIgnoreCase(name)) {
			dfct_rsn_cd_upd_flg(value);
			return;
		}
		if ($sppl_cd_upd_flg.equalsIgnoreCase(name)) {
			sppl_cd_upd_flg(value);
			return;
		}
		if ($maker_cd_upd_flg.equalsIgnoreCase(name)) {
			maker_cd_upd_flg(value);
			return;
		}
		if ($mfg_loc_cd_upd_flg.equalsIgnoreCase(name)) {
			mfg_loc_cd_upd_flg(value);
			return;
		}
		if ($from_site_cd_upd_flg.equalsIgnoreCase(name)) {
			from_site_cd_upd_flg(value);
			return;
		}
		if ($base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			base_unit_qty_upd_flg(value);
			return;
		}
		if ($base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			base_unit_cd_upd_flg(value);
			return;
		}
		if ($ttl_stk_qty_upd_flg.equalsIgnoreCase(name)) {
			ttl_stk_qty_upd_flg(value);
			return;
		}
		if ($st_hm_upd_flg.equalsIgnoreCase(name)) {
			st_hm_upd_flg(value);
			return;
		}
		if ($end_hm_upd_flg.equalsIgnoreCase(name)) {
			end_hm_upd_flg(value);
			return;
		}
		if ($act_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			act_usr_cd_upd_flg(value);
			return;
		}
		if ($act_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			act_dpt_cd_upd_flg(value);
			return;
		}
		if ($lmt_dt_frm_typ_upd_flg.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_upd_flg(value);
			return;
		}
		if ($lmt_dt_frm_upd_flg.equalsIgnoreCase(name)) {
			lmt_dt_frm_upd_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($lmt_dt_upd_flg.equalsIgnoreCase(name)) {
			lmt_dt_upd_flg(value);
			return;
		}
		if ($act_cont_fctr_upd_flg.equalsIgnoreCase(name)) {
			act_cont_fctr_upd_flg(value);
			return;
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($lot_rmrks_upd_flg.equalsIgnoreCase(name)) {
			lot_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ttl_stk_qty.equalsIgnoreCase(name)) {
			ttl_stk_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($insp_inst_upd_cntr.equalsIgnoreCase(name)) {
			insp_inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($stt_can_ac_dt.equalsIgnoreCase(name)) {
			stt_can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($insp_freq_upd_flg.equalsIgnoreCase(name)) {
			insp_freq_upd_flg(value);
			return;
		}
		if ($src_no1_upd_flg.equalsIgnoreCase(name)) {
			src_no1_upd_flg(value);
			return;
		}
		if ($src_no2_upd_flg.equalsIgnoreCase(name)) {
			src_no2_upd_flg(value);
			return;
		}
		if ($insp_typ_upd_flg.equalsIgnoreCase(name)) {
			insp_typ_upd_flg(value);
			return;
		}
		if ($insp_mtd_typ_upd_flg.equalsIgnoreCase(name)) {
			insp_mtd_typ_upd_flg(value);
			return;
		}
		if ($insp_sts_typ_upd_flg.equalsIgnoreCase(name)) {
			insp_sts_typ_upd_flg(value);
			return;
		}
		if ($insp_aprv_sts_typ_upd_flg.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_upd_flg(value);
			return;
		}
		if ($itm_cd_upd_flg.equalsIgnoreCase(name)) {
			itm_cd_upd_flg(value);
			return;
		}
		if ($itm_sub1_upd_flg.equalsIgnoreCase(name)) {
			itm_sub1_upd_flg(value);
			return;
		}
		if ($itm_sub2_upd_flg.equalsIgnoreCase(name)) {
			itm_sub2_upd_flg(value);
			return;
		}
		if ($itm_sub3_upd_flg.equalsIgnoreCase(name)) {
			itm_sub3_upd_flg(value);
			return;
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			lot_no_upd_flg(value);
			return;
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			sublot_no_upd_flg(value);
			return;
		}
		if ($ver_no_upd_flg.equalsIgnoreCase(name)) {
			ver_no_upd_flg(value);
			return;
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			quality_typ_upd_flg(value);
			return;
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			gd_cd_upd_flg(value);
			return;
		}
		if ($dfct_rsn_cd_upd_flg.equalsIgnoreCase(name)) {
			dfct_rsn_cd_upd_flg(value);
			return;
		}
		if ($sppl_cd_upd_flg.equalsIgnoreCase(name)) {
			sppl_cd_upd_flg(value);
			return;
		}
		if ($maker_cd_upd_flg.equalsIgnoreCase(name)) {
			maker_cd_upd_flg(value);
			return;
		}
		if ($mfg_loc_cd_upd_flg.equalsIgnoreCase(name)) {
			mfg_loc_cd_upd_flg(value);
			return;
		}
		if ($from_site_cd_upd_flg.equalsIgnoreCase(name)) {
			from_site_cd_upd_flg(value);
			return;
		}
		if ($base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			base_unit_qty_upd_flg(value);
			return;
		}
		if ($base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			base_unit_cd_upd_flg(value);
			return;
		}
		if ($ttl_stk_qty_upd_flg.equalsIgnoreCase(name)) {
			ttl_stk_qty_upd_flg(value);
			return;
		}
		if ($st_hm_upd_flg.equalsIgnoreCase(name)) {
			st_hm_upd_flg(value);
			return;
		}
		if ($end_hm_upd_flg.equalsIgnoreCase(name)) {
			end_hm_upd_flg(value);
			return;
		}
		if ($act_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			act_usr_cd_upd_flg(value);
			return;
		}
		if ($act_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			act_dpt_cd_upd_flg(value);
			return;
		}
		if ($lmt_dt_frm_typ_upd_flg.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_upd_flg(value);
			return;
		}
		if ($lmt_dt_frm_upd_flg.equalsIgnoreCase(name)) {
			lmt_dt_frm_upd_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($lmt_dt_upd_flg.equalsIgnoreCase(name)) {
			lmt_dt_upd_flg(value);
			return;
		}
		if ($act_cont_fctr_upd_flg.equalsIgnoreCase(name)) {
			act_cont_fctr_upd_flg(value);
			return;
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($lot_rmrks_upd_flg.equalsIgnoreCase(name)) {
			lot_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

