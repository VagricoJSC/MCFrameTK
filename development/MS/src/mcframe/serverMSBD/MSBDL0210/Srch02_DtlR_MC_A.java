package mcframe.serverMSBD.MSBDL0210;

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
 * ブロック"Srch02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_DtlR_MC_A extends MCConstRow {

	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_no = "purc_frcst_no";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public static final String $pf_dt = "pf_dt";
	/**
	 * Last forecast date 前回内示日.<p>
	 *
	 */
	public static final String $pre_pf_dt = "pre_pf_dt";
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
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_grp_cd1 = "sppl_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $sppl_grp_nm1 = "sppl_grp_nm1";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_grp_cd2 = "sppl_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $sppl_grp_nm2 = "sppl_grp_nm2";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_grp_cd3 = "sppl_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $sppl_grp_nm3 = "sppl_grp_nm3";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sppl_grp_cd4 = "sppl_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $sppl_grp_nm4 = "sppl_grp_nm4";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sppl_grp_cd5 = "sppl_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $sppl_grp_nm5 = "sppl_grp_nm5";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sppl_grp_cd6 = "sppl_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $sppl_grp_nm6 = "sppl_grp_nm6";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sppl_grp_cd7 = "sppl_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $sppl_grp_nm7 = "sppl_grp_nm7";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sppl_grp_cd8 = "sppl_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $sppl_grp_nm8 = "sppl_grp_nm8";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sppl_grp_cd9 = "sppl_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $sppl_grp_nm9 = "sppl_grp_nm9";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sppl_grp_cd10 = "sppl_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $sppl_grp_nm10 = "sppl_grp_nm10";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
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
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public static final String $pf_usr_cd = "pf_usr_cd";
	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public static final String $pf_usr_nm = "pf_usr_nm";
	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public static final String $pf_dpt_cd = "pf_dpt_cd";
	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public static final String $pf_dpt_nm = "pf_dpt_nm";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $pf_rpt_flg = "pf_rpt_flg";
	/**
	 * Issue date and time 発行日時.<p>
	 *
	 */
	public static final String $pf_rpt_dt = "pf_rpt_dt";
	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public static final String $pf_rpt_no = "pf_rpt_no";
	/**
	 * Cancel issued 取消発行済.<p>
	 *
	 */
	public static final String $del_pf_rpt_flg = "del_pf_rpt_flg";
	/**
	 * Cancellation issue date and time 取消発行日時.<p>
	 *
	 */
	public static final String $del_pf_rpt_dt = "del_pf_rpt_dt";
	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public static final String $hdr_rpt_rmrks = "hdr_rpt_rmrks";
	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public static final String $hdr_intr_rmrks = "hdr_intr_rmrks";
	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public static final String $hdr_sub_char1 = "hdr_sub_char1";
	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public static final String $hdr_sub_char2 = "hdr_sub_char2";
	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public static final String $hdr_sub_char3 = "hdr_sub_char3";
	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_fix_no = "purc_frcst_fix_no";
	/**
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_d_no = "purc_frcst_d_no";
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
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public static final String $purc_commit_flg = "purc_commit_flg";
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public static final String $pf_period_typ = "pf_period_typ";
	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public static final String $pf_period_typ_nm = "pf_period_typ_nm";
	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public static final String $pf_period_st_dt = "pf_period_st_dt";
	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public static final String $pf_period_end_dt = "pf_period_end_dt";
	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public static final String $fix_period_flg = "fix_period_flg";
	/**
	 * Firming period (packet) 確定期間（パケット）.<p>
	 *
	 */
	public static final String $fix_period_num = "fix_period_num";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public static final String $trd_unit_schd_qty = "trd_unit_schd_qty";
	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public static final String $trd_unit_pf_qty = "trd_unit_pf_qty";
	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public static final String $trd_unit_prms_qty = "trd_unit_prms_qty";
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
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public static final String $base_unit_schd_qty = "base_unit_schd_qty";
	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public static final String $base_unit_pf_qty = "base_unit_pf_qty";
	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public static final String $base_unit_prms_qty = "base_unit_prms_qty";
	/**
	 * Last forecast date purchase forecast firm No. 前回内示日購買内示確定ＮＯ.<p>
	 *
	 */
	public static final String $pre_purc_frcst_fix_no = "pre_purc_frcst_fix_no";
	/**
	 * Last firmed period 前回確定期間.<p>
	 *
	 */
	public static final String $pre_fix_period_flg = "pre_fix_period_flg";
	/**
	 * Last unit cd. 前回単位ＣＤ.<p>
	 *
	 */
	public static final String $pre_trd_unit_cd = "pre_trd_unit_cd";
	/**
	 * Last unit name 前回単位名.<p>
	 *
	 */
	public static final String $pre_trd_unit_nm = "pre_trd_unit_nm";
	/**
	 * Last transaction unit number of decimal places 前回取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pre_trd_unit_dec_place = "pre_trd_unit_dec_place";
	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public static final String $pre_trd_unit_pf_qty = "pre_trd_unit_pf_qty";
	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public static final String $pre_base_unit_pf_qty = "pre_base_unit_pf_qty";
	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public static final String $dtl_rpt_rmrks = "dtl_rpt_rmrks";
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public static final String $dtl_intr_rmrks = "dtl_intr_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_frcst_no_META = createCommonMeta($purc_frcst_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_NO);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pf_dt_META = createCommonMeta($pf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pre_pf_dt_META = createCommonMeta($pre_pf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_grp_cd1_META = createCommonMeta($sppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm1_META = createCommonMeta($sppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd2_META = createCommonMeta($sppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm2_META = createCommonMeta($sppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd3_META = createCommonMeta($sppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm3_META = createCommonMeta($sppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd4_META = createCommonMeta($sppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm4_META = createCommonMeta($sppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd5_META = createCommonMeta($sppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm5_META = createCommonMeta($sppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd6_META = createCommonMeta($sppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm6_META = createCommonMeta($sppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd7_META = createCommonMeta($sppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm7_META = createCommonMeta($sppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd8_META = createCommonMeta($sppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm8_META = createCommonMeta($sppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd9_META = createCommonMeta($sppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm9_META = createCommonMeta($sppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd10_META = createCommonMeta($sppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm10_META = createCommonMeta($sppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta pf_usr_cd_META = createCommonMeta($pf_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pf_usr_nm_META = createCommonMeta($pf_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pf_dpt_cd_META = createCommonMeta($pf_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pf_dpt_nm_META = createCommonMeta($pf_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pf_rpt_flg_META = createCommonMeta($pf_rpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pf_rpt_dt_META = createCommonMeta($pf_rpt_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pf_rpt_no_META = createCommonMeta($pf_rpt_no, mcframe.commonMA.meta.MA_META.PF_RPT_NO);
	public static final MCMeta del_pf_rpt_flg_META = createCommonMeta($del_pf_rpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_pf_rpt_dt_META = createCommonMeta($del_pf_rpt_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta hdr_rpt_rmrks_META = createCommonMeta($hdr_rpt_rmrks, mcframe.commonMS.meta.MS_META.PF_HDR_RPT_RMRKS);
	public static final MCMeta hdr_intr_rmrks_META = createCommonMeta($hdr_intr_rmrks, mcframe.commonMS.meta.MS_META.PF_HDR_INTR_RMRKS);
	public static final MCMeta hdr_sub_char1_META = createCommonMeta($hdr_sub_char1, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR1);
	public static final MCMeta hdr_sub_char2_META = createCommonMeta($hdr_sub_char2, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR2);
	public static final MCMeta hdr_sub_char3_META = createCommonMeta($hdr_sub_char3, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR3);
	public static final MCMeta purc_frcst_fix_no_META = createCommonMeta($purc_frcst_fix_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_FIX_NO);
	public static final MCMeta purc_frcst_d_no_META = createCommonMeta($purc_frcst_d_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_D_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta purc_commit_flg_META = createCommonMeta($purc_commit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pf_period_typ_META = createCommonMeta($pf_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta pf_period_typ_nm_META = createCommonMeta($pf_period_typ_nm, mcframe.commonMA.meta.MA_META.PERIOD_TYP_NM);
	public static final MCMeta pf_period_st_dt_META = createCommonMeta($pf_period_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pf_period_end_dt_META = createCommonMeta($pf_period_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fix_period_flg_META = createCommonMeta($fix_period_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_period_num_META = createCommonMeta($fix_period_num, mcframe.commonMA.meta.MA_META.PF_PERIOD);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_schd_qty_META = createCommonMeta($trd_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_pf_qty_META = createCommonMeta($trd_unit_pf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_prms_qty_META = createCommonMeta($trd_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_schd_qty_META = createCommonMeta($base_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_pf_qty_META = createCommonMeta($base_unit_pf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_prms_qty_META = createCommonMeta($base_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pre_purc_frcst_fix_no_META = createCommonMeta($pre_purc_frcst_fix_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_FIX_NO);
	public static final MCMeta pre_fix_period_flg_META = createCommonMeta($pre_fix_period_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_trd_unit_cd_META = createCommonMeta($pre_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pre_trd_unit_nm_META = createCommonMeta($pre_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pre_trd_unit_dec_place_META = createCommonMeta($pre_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pre_trd_unit_pf_qty_META = createCommonMeta($pre_trd_unit_pf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pre_base_unit_pf_qty_META = createCommonMeta($pre_base_unit_pf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dtl_rpt_rmrks_META = createCommonMeta($dtl_rpt_rmrks, mcframe.commonMS.meta.MS_META.PF_FIX_RPT_RMRKS);
	public static final MCMeta dtl_intr_rmrks_META = createCommonMeta($dtl_intr_rmrks, mcframe.commonMS.meta.MS_META.PF_FIX_INTR_RMRKS);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Srch02_DtlR> constMetas = new ConstMetaList<Srch02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			fix_flg_META,
			del_flg_META,
			purc_frcst_no_META,
			latest_flg_META,
			pf_dt_META,
			pre_pf_dt_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_grp_cd1_META,
			sppl_grp_nm1_META,
			sppl_grp_cd2_META,
			sppl_grp_nm2_META,
			sppl_grp_cd3_META,
			sppl_grp_nm3_META,
			sppl_grp_cd4_META,
			sppl_grp_nm4_META,
			sppl_grp_cd5_META,
			sppl_grp_nm5_META,
			sppl_grp_cd6_META,
			sppl_grp_nm6_META,
			sppl_grp_cd7_META,
			sppl_grp_nm7_META,
			sppl_grp_cd8_META,
			sppl_grp_nm8_META,
			sppl_grp_cd9_META,
			sppl_grp_nm9_META,
			sppl_grp_cd10_META,
			sppl_grp_nm10_META,
			subcon_flg_META,
			wg_cd_META,
			wg_nm_META,
			pf_usr_cd_META,
			pf_usr_nm_META,
			pf_dpt_cd_META,
			pf_dpt_nm_META,
			pf_rpt_flg_META,
			pf_rpt_dt_META,
			pf_rpt_no_META,
			del_pf_rpt_flg_META,
			del_pf_rpt_dt_META,
			hdr_rpt_rmrks_META,
			hdr_intr_rmrks_META,
			hdr_sub_char1_META,
			hdr_sub_char2_META,
			hdr_sub_char3_META,
			purc_frcst_fix_no_META,
			purc_frcst_d_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
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
			purc_commit_flg_META,
			pf_period_typ_META,
			pf_period_typ_nm_META,
			pf_period_st_dt_META,
			pf_period_end_dt_META,
			fix_period_flg_META,
			fix_period_num_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_schd_qty_META,
			trd_unit_pf_qty_META,
			trd_unit_prms_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_schd_qty_META,
			base_unit_pf_qty_META,
			base_unit_prms_qty_META,
			pre_purc_frcst_fix_no_META,
			pre_fix_period_flg_META,
			pre_trd_unit_cd_META,
			pre_trd_unit_nm_META,
			pre_trd_unit_dec_place_META,
			pre_trd_unit_pf_qty_META,
			pre_base_unit_pf_qty_META,
			dtl_rpt_rmrks_META,
			dtl_intr_rmrks_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
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
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$pf_period_typ, "MAC_PERIOD_TYP"}	// pf_period_typ
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
	protected Srch02_DtlR_MC_A(ConstMetaList<? extends Srch02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR clone() {
		return (Srch02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR createInstance() {
		return (Srch02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR getValues(String... names) {
		return (Srch02_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 0, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 0, $fix_flg, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
	}


	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public String purc_frcst_no() {
		return getConstString(offset + 2, $purc_frcst_no);
	}

	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public void purc_frcst_no(String value) {
		setConstString(offset + 2, $purc_frcst_no, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 3, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 3, $latest_flg, value);
	}


	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public MCDate pf_dt() {
		return getConstDate(offset + 4, $pf_dt);
	}

	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public void pf_dt(MCDate value) {
		setConstDate(offset + 4, $pf_dt, value);
	}


	/**
	 * Last forecast date 前回内示日.<p>
	 *
	 */
	public MCDate pre_pf_dt() {
		return getConstDate(offset + 5, $pre_pf_dt);
	}

	/**
	 * Last forecast date 前回内示日.<p>
	 *
	 */
	public void pre_pf_dt(MCDate value) {
		setConstDate(offset + 5, $pre_pf_dt, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 6, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 6, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 7, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 7, $sppl_nm, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return getConstString(offset + 8, $sppl_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		setConstString(offset + 8, $sppl_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return getConstString(offset + 9, $sppl_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		setConstString(offset + 9, $sppl_grp_nm1, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return getConstString(offset + 10, $sppl_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		setConstString(offset + 10, $sppl_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return getConstString(offset + 11, $sppl_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		setConstString(offset + 11, $sppl_grp_nm2, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return getConstString(offset + 12, $sppl_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		setConstString(offset + 12, $sppl_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return getConstString(offset + 13, $sppl_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		setConstString(offset + 13, $sppl_grp_nm3, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return getConstString(offset + 14, $sppl_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		setConstString(offset + 14, $sppl_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return getConstString(offset + 15, $sppl_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		setConstString(offset + 15, $sppl_grp_nm4, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return getConstString(offset + 16, $sppl_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		setConstString(offset + 16, $sppl_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return getConstString(offset + 17, $sppl_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		setConstString(offset + 17, $sppl_grp_nm5, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return getConstString(offset + 18, $sppl_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		setConstString(offset + 18, $sppl_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return getConstString(offset + 19, $sppl_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		setConstString(offset + 19, $sppl_grp_nm6, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return getConstString(offset + 20, $sppl_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		setConstString(offset + 20, $sppl_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return getConstString(offset + 21, $sppl_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		setConstString(offset + 21, $sppl_grp_nm7, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return getConstString(offset + 22, $sppl_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		setConstString(offset + 22, $sppl_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return getConstString(offset + 23, $sppl_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		setConstString(offset + 23, $sppl_grp_nm8, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return getConstString(offset + 24, $sppl_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		setConstString(offset + 24, $sppl_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return getConstString(offset + 25, $sppl_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		setConstString(offset + 25, $sppl_grp_nm9, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return getConstString(offset + 26, $sppl_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		setConstString(offset + 26, $sppl_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return getConstString(offset + 27, $sppl_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		setConstString(offset + 27, $sppl_grp_nm10, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 28, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 28, $subcon_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 29, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 29, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 30, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 30, $wg_nm, value);
	}


	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public String pf_usr_cd() {
		return getConstString(offset + 31, $pf_usr_cd);
	}

	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public void pf_usr_cd(String value) {
		setConstString(offset + 31, $pf_usr_cd, value);
	}


	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public String pf_usr_nm() {
		return getConstString(offset + 32, $pf_usr_nm);
	}

	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public void pf_usr_nm(String value) {
		setConstString(offset + 32, $pf_usr_nm, value);
	}


	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public String pf_dpt_cd() {
		return getConstString(offset + 33, $pf_dpt_cd);
	}

	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public void pf_dpt_cd(String value) {
		setConstString(offset + 33, $pf_dpt_cd, value);
	}


	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public String pf_dpt_nm() {
		return getConstString(offset + 34, $pf_dpt_nm);
	}

	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public void pf_dpt_nm(String value) {
		setConstString(offset + 34, $pf_dpt_nm, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean pf_rpt_flg() {
		return getConstBoolean(offset + 35, $pf_rpt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void pf_rpt_flg(boolean value) {
		setConstBoolean(offset + 35, $pf_rpt_flg, value);
	}


	/**
	 * Issue date and time 発行日時.<p>
	 *
	 */
	public MCDate pf_rpt_dt() {
		return getConstDate(offset + 36, $pf_rpt_dt);
	}

	/**
	 * Issue date and time 発行日時.<p>
	 *
	 */
	public void pf_rpt_dt(MCDate value) {
		setConstDate(offset + 36, $pf_rpt_dt, value);
	}


	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public String pf_rpt_no() {
		return getConstString(offset + 37, $pf_rpt_no);
	}

	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public void pf_rpt_no(String value) {
		setConstString(offset + 37, $pf_rpt_no, value);
	}


	/**
	 * Cancel issued 取消発行済.<p>
	 *
	 */
	public boolean del_pf_rpt_flg() {
		return getConstBoolean(offset + 38, $del_pf_rpt_flg);
	}

	/**
	 * Cancel issued 取消発行済.<p>
	 *
	 */
	public void del_pf_rpt_flg(boolean value) {
		setConstBoolean(offset + 38, $del_pf_rpt_flg, value);
	}


	/**
	 * Cancellation issue date and time 取消発行日時.<p>
	 *
	 */
	public MCDate del_pf_rpt_dt() {
		return getConstDate(offset + 39, $del_pf_rpt_dt);
	}

	/**
	 * Cancellation issue date and time 取消発行日時.<p>
	 *
	 */
	public void del_pf_rpt_dt(MCDate value) {
		setConstDate(offset + 39, $del_pf_rpt_dt, value);
	}


	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public String hdr_rpt_rmrks() {
		return getConstString(offset + 40, $hdr_rpt_rmrks);
	}

	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public void hdr_rpt_rmrks(String value) {
		setConstString(offset + 40, $hdr_rpt_rmrks, value);
	}


	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public String hdr_intr_rmrks() {
		return getConstString(offset + 41, $hdr_intr_rmrks);
	}

	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public void hdr_intr_rmrks(String value) {
		setConstString(offset + 41, $hdr_intr_rmrks, value);
	}


	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public String hdr_sub_char1() {
		return getConstString(offset + 42, $hdr_sub_char1);
	}

	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public void hdr_sub_char1(String value) {
		setConstString(offset + 42, $hdr_sub_char1, value);
	}


	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public String hdr_sub_char2() {
		return getConstString(offset + 43, $hdr_sub_char2);
	}

	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public void hdr_sub_char2(String value) {
		setConstString(offset + 43, $hdr_sub_char2, value);
	}


	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public String hdr_sub_char3() {
		return getConstString(offset + 44, $hdr_sub_char3);
	}

	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public void hdr_sub_char3(String value) {
		setConstString(offset + 44, $hdr_sub_char3, value);
	}


	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public String purc_frcst_fix_no() {
		return getConstString(offset + 45, $purc_frcst_fix_no);
	}

	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public void purc_frcst_fix_no(String value) {
		setConstString(offset + 45, $purc_frcst_fix_no, value);
	}


	/**
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public String purc_frcst_d_no() {
		return getConstString(offset + 46, $purc_frcst_d_no);
	}

	/**
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public void purc_frcst_d_no(String value) {
		setConstString(offset + 46, $purc_frcst_d_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 47, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 47, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 48, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 48, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 49, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 49, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 50, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 50, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 51, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 51, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 52, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 52, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 53, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 53, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 54, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 54, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 55, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 55, $itm_typ_d_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 56, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 56, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 57, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 57, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 58, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 58, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 59, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 59, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 60, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 60, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 61, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 61, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 62, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 62, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 63, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 63, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 64, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 64, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 65, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 65, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 66, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 66, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 67, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 67, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 68, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 68, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 69, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 69, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 70, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 70, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 71, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 71, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 72, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 72, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 73, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 73, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 74, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 74, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 75, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 75, $itm_grp_nm10, value);
	}


	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public boolean purc_commit_flg() {
		return getConstBoolean(offset + 76, $purc_commit_flg);
	}

	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public void purc_commit_flg(boolean value) {
		setConstBoolean(offset + 76, $purc_commit_flg, value);
	}


	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public String pf_period_typ() {
		return getConstString(offset + 77, $pf_period_typ);
	}

	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public void pf_period_typ(String value) {
		setConstString(offset + 77, $pf_period_typ, value);
	}


	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public String pf_period_typ_nm() {
		return getConstString(offset + 78, $pf_period_typ_nm);
	}

	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public void pf_period_typ_nm(String value) {
		setConstString(offset + 78, $pf_period_typ_nm, value);
	}


	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCDate pf_period_st_dt() {
		return getConstDate(offset + 79, $pf_period_st_dt);
	}

	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public void pf_period_st_dt(MCDate value) {
		setConstDate(offset + 79, $pf_period_st_dt, value);
	}


	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCDate pf_period_end_dt() {
		return getConstDate(offset + 80, $pf_period_end_dt);
	}

	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public void pf_period_end_dt(MCDate value) {
		setConstDate(offset + 80, $pf_period_end_dt, value);
	}


	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public boolean fix_period_flg() {
		return getConstBoolean(offset + 81, $fix_period_flg);
	}

	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public void fix_period_flg(boolean value) {
		setConstBoolean(offset + 81, $fix_period_flg, value);
	}


	/**
	 * Firming period (packet) 確定期間（パケット）.<p>
	 *
	 */
	public MCNumber fix_period_num() {
		return getConstNumber(offset + 82, $fix_period_num);
	}

	/**
	 * Firming period (packet) 確定期間（パケット）.<p>
	 *
	 */
	public void fix_period_num(MCNumber value) {
		setConstNumber(offset + 82, $fix_period_num, value);
	}

	/**
	 * Firming period (packet) 確定期間（パケット）.<p>
	 *
	 */
	public void fix_period_num(int value) {
		setConstNumber(offset + 82, $fix_period_num, value);
	}

	/**
	 * Firming period (packet) 確定期間（パケット）.<p>
	 *
	 */
	public void fix_period_num(long value) {
		setConstNumber(offset + 82, $fix_period_num, value);
	}

	/**
	 * Firming period (packet) 確定期間（パケット）.<p>
	 *
	 */
	public void fix_period_num(float value) {
		setConstNumber(offset + 82, $fix_period_num, value);
	}

	/**
	 * Firming period (packet) 確定期間（パケット）.<p>
	 *
	 */
	public void fix_period_num(double value) {
		setConstNumber(offset + 82, $fix_period_num, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 83, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 83, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 84, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 84, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 85, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 85, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 85, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 85, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 85, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 85, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 86, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 86, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 86, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 86, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 86, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 86, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 87, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 87, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 87, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 87, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 87, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 87, $trd_unit_conv_qty, value);
	}


	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public MCNumber trd_unit_schd_qty() {
		return getConstNumber(offset + 88, $trd_unit_schd_qty);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 88, $trd_unit_schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(int value) {
		setConstNumber(offset + 88, $trd_unit_schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(long value) {
		setConstNumber(offset + 88, $trd_unit_schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(float value) {
		setConstNumber(offset + 88, $trd_unit_schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(double value) {
		setConstNumber(offset + 88, $trd_unit_schd_qty, value);
	}


	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public MCNumber trd_unit_pf_qty() {
		return getConstNumber(offset + 89, $trd_unit_pf_qty);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(MCNumber value) {
		setConstNumber(offset + 89, $trd_unit_pf_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(int value) {
		setConstNumber(offset + 89, $trd_unit_pf_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(long value) {
		setConstNumber(offset + 89, $trd_unit_pf_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(float value) {
		setConstNumber(offset + 89, $trd_unit_pf_qty, value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(double value) {
		setConstNumber(offset + 89, $trd_unit_pf_qty, value);
	}


	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public MCNumber trd_unit_prms_qty() {
		return getConstNumber(offset + 90, $trd_unit_prms_qty);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 90, $trd_unit_prms_qty, value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(int value) {
		setConstNumber(offset + 90, $trd_unit_prms_qty, value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(long value) {
		setConstNumber(offset + 90, $trd_unit_prms_qty, value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(float value) {
		setConstNumber(offset + 90, $trd_unit_prms_qty, value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(double value) {
		setConstNumber(offset + 90, $trd_unit_prms_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 91, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 91, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 92, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 92, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 93, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 93, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 93, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 93, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 93, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 93, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 94, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 94, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_qty() {
		return getConstNumber(offset + 95, $base_unit_schd_qty);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 95, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(int value) {
		setConstNumber(offset + 95, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(long value) {
		setConstNumber(offset + 95, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(float value) {
		setConstNumber(offset + 95, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(double value) {
		setConstNumber(offset + 95, $base_unit_schd_qty, value);
	}


	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public MCNumber base_unit_pf_qty() {
		return getConstNumber(offset + 96, $base_unit_pf_qty);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(MCNumber value) {
		setConstNumber(offset + 96, $base_unit_pf_qty, value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(int value) {
		setConstNumber(offset + 96, $base_unit_pf_qty, value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(long value) {
		setConstNumber(offset + 96, $base_unit_pf_qty, value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(float value) {
		setConstNumber(offset + 96, $base_unit_pf_qty, value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(double value) {
		setConstNumber(offset + 96, $base_unit_pf_qty, value);
	}


	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public MCNumber base_unit_prms_qty() {
		return getConstNumber(offset + 97, $base_unit_prms_qty);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 97, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(int value) {
		setConstNumber(offset + 97, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(long value) {
		setConstNumber(offset + 97, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(float value) {
		setConstNumber(offset + 97, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(double value) {
		setConstNumber(offset + 97, $base_unit_prms_qty, value);
	}


	/**
	 * Last forecast date purchase forecast firm No. 前回内示日購買内示確定ＮＯ.<p>
	 *
	 */
	public String pre_purc_frcst_fix_no() {
		return getConstString(offset + 98, $pre_purc_frcst_fix_no);
	}

	/**
	 * Last forecast date purchase forecast firm No. 前回内示日購買内示確定ＮＯ.<p>
	 *
	 */
	public void pre_purc_frcst_fix_no(String value) {
		setConstString(offset + 98, $pre_purc_frcst_fix_no, value);
	}


	/**
	 * Last firmed period 前回確定期間.<p>
	 *
	 */
	public boolean pre_fix_period_flg() {
		return getConstBoolean(offset + 99, $pre_fix_period_flg);
	}

	/**
	 * Last firmed period 前回確定期間.<p>
	 *
	 */
	public void pre_fix_period_flg(boolean value) {
		setConstBoolean(offset + 99, $pre_fix_period_flg, value);
	}


	/**
	 * Last unit cd. 前回単位ＣＤ.<p>
	 *
	 */
	public String pre_trd_unit_cd() {
		return getConstString(offset + 100, $pre_trd_unit_cd);
	}

	/**
	 * Last unit cd. 前回単位ＣＤ.<p>
	 *
	 */
	public void pre_trd_unit_cd(String value) {
		setConstString(offset + 100, $pre_trd_unit_cd, value);
	}


	/**
	 * Last unit name 前回単位名.<p>
	 *
	 */
	public String pre_trd_unit_nm() {
		return getConstString(offset + 101, $pre_trd_unit_nm);
	}

	/**
	 * Last unit name 前回単位名.<p>
	 *
	 */
	public void pre_trd_unit_nm(String value) {
		setConstString(offset + 101, $pre_trd_unit_nm, value);
	}


	/**
	 * Last transaction unit number of decimal places 前回取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pre_trd_unit_dec_place() {
		return getConstNumber(offset + 102, $pre_trd_unit_dec_place);
	}

	/**
	 * Last transaction unit number of decimal places 前回取引単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 102, $pre_trd_unit_dec_place, value);
	}

	/**
	 * Last transaction unit number of decimal places 前回取引単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(int value) {
		setConstNumber(offset + 102, $pre_trd_unit_dec_place, value);
	}

	/**
	 * Last transaction unit number of decimal places 前回取引単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(long value) {
		setConstNumber(offset + 102, $pre_trd_unit_dec_place, value);
	}

	/**
	 * Last transaction unit number of decimal places 前回取引単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(float value) {
		setConstNumber(offset + 102, $pre_trd_unit_dec_place, value);
	}

	/**
	 * Last transaction unit number of decimal places 前回取引単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(double value) {
		setConstNumber(offset + 102, $pre_trd_unit_dec_place, value);
	}


	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public MCNumber pre_trd_unit_pf_qty() {
		return getConstNumber(offset + 103, $pre_trd_unit_pf_qty);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(MCNumber value) {
		setConstNumber(offset + 103, $pre_trd_unit_pf_qty, value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(int value) {
		setConstNumber(offset + 103, $pre_trd_unit_pf_qty, value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(long value) {
		setConstNumber(offset + 103, $pre_trd_unit_pf_qty, value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(float value) {
		setConstNumber(offset + 103, $pre_trd_unit_pf_qty, value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(double value) {
		setConstNumber(offset + 103, $pre_trd_unit_pf_qty, value);
	}


	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public MCNumber pre_base_unit_pf_qty() {
		return getConstNumber(offset + 104, $pre_base_unit_pf_qty);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(MCNumber value) {
		setConstNumber(offset + 104, $pre_base_unit_pf_qty, value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(int value) {
		setConstNumber(offset + 104, $pre_base_unit_pf_qty, value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(long value) {
		setConstNumber(offset + 104, $pre_base_unit_pf_qty, value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(float value) {
		setConstNumber(offset + 104, $pre_base_unit_pf_qty, value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(double value) {
		setConstNumber(offset + 104, $pre_base_unit_pf_qty, value);
	}


	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public String dtl_rpt_rmrks() {
		return getConstString(offset + 105, $dtl_rpt_rmrks);
	}

	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public void dtl_rpt_rmrks(String value) {
		setConstString(offset + 105, $dtl_rpt_rmrks, value);
	}


	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return getConstString(offset + 106, $dtl_intr_rmrks);
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		setConstString(offset + 106, $dtl_intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 107, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 107, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 108, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 108, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 109, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 109, $dtl_sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 110, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 110, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 111, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 111, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 112, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 112, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 113, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 113, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 114, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 114, $ins_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 115, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 115, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 115, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 115, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 115, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 115, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 116, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 116, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 117, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 117, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 118, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 118, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 119, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 119, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 120, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 120, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 121, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 121, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			return purc_frcst_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			return pf_usr_cd();
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			return pf_usr_nm();
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			return pf_dpt_cd();
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			return pf_dpt_nm();
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			return pf_rpt_no();
		}
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			return hdr_rpt_rmrks();
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			return hdr_intr_rmrks();
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			return hdr_sub_char1();
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			return hdr_sub_char2();
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			return hdr_sub_char3();
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return purc_frcst_fix_no();
		}
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			return purc_frcst_d_no();
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
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			return pf_period_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($pre_purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return pre_purc_frcst_fix_no();
		}
		if ($pre_trd_unit_cd.equalsIgnoreCase(name)) {
			return pre_trd_unit_cd();
		}
		if ($pre_trd_unit_nm.equalsIgnoreCase(name)) {
			return pre_trd_unit_nm();
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			return dtl_rpt_rmrks();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			return fix_period_num();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			return trd_unit_pf_qty();
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			return base_unit_pf_qty();
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			return base_unit_prms_qty();
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return pre_trd_unit_dec_place();
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			return pre_trd_unit_pf_qty();
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			return pre_base_unit_pf_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			return pf_dt();
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			return pre_pf_dt();
		}
		if ($pf_rpt_dt.equalsIgnoreCase(name)) {
			return pf_rpt_dt();
		}
		if ($del_pf_rpt_dt.equalsIgnoreCase(name)) {
			return del_pf_rpt_dt();
		}
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($pf_rpt_flg.equalsIgnoreCase(name)) {
			return pf_rpt_flg();
		}
		if ($del_pf_rpt_flg.equalsIgnoreCase(name)) {
			return del_pf_rpt_flg();
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			return purc_commit_flg();
		}
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		if ($pre_fix_period_flg.equalsIgnoreCase(name)) {
			return pre_fix_period_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			return purc_frcst_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			return pf_usr_cd();
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			return pf_usr_nm();
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			return pf_dpt_cd();
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			return pf_dpt_nm();
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			return pf_rpt_no();
		}
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			return hdr_rpt_rmrks();
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			return hdr_intr_rmrks();
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			return hdr_sub_char1();
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			return hdr_sub_char2();
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			return hdr_sub_char3();
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return purc_frcst_fix_no();
		}
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			return purc_frcst_d_no();
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
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			return pf_period_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($pre_purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return pre_purc_frcst_fix_no();
		}
		if ($pre_trd_unit_cd.equalsIgnoreCase(name)) {
			return pre_trd_unit_cd();
		}
		if ($pre_trd_unit_nm.equalsIgnoreCase(name)) {
			return pre_trd_unit_nm();
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			return dtl_rpt_rmrks();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			return fix_period_num();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			return trd_unit_pf_qty();
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			return base_unit_pf_qty();
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			return base_unit_prms_qty();
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return pre_trd_unit_dec_place();
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			return pre_trd_unit_pf_qty();
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			return pre_base_unit_pf_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			return pf_dt();
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			return pre_pf_dt();
		}
		if ($pf_rpt_dt.equalsIgnoreCase(name)) {
			return pf_rpt_dt();
		}
		if ($del_pf_rpt_dt.equalsIgnoreCase(name)) {
			return del_pf_rpt_dt();
		}
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($pf_rpt_flg.equalsIgnoreCase(name)) {
			return pf_rpt_flg();
		}
		if ($del_pf_rpt_flg.equalsIgnoreCase(name)) {
			return del_pf_rpt_flg();
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			return purc_commit_flg();
		}
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		if ($pre_fix_period_flg.equalsIgnoreCase(name)) {
			return pre_fix_period_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			purc_frcst_no(value);
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			pf_usr_cd(value);
			return;
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			pf_usr_nm(value);
			return;
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			pf_dpt_cd(value);
			return;
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			pf_dpt_nm(value);
			return;
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			pf_rpt_no(value);
			return;
		}
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			hdr_rpt_rmrks(value);
			return;
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			hdr_intr_rmrks(value);
			return;
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			hdr_sub_char1(value);
			return;
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			hdr_sub_char2(value);
			return;
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			hdr_sub_char3(value);
			return;
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			purc_frcst_fix_no(value);
			return;
		}
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			purc_frcst_d_no(value);
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
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
			return;
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			pf_period_typ_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($pre_purc_frcst_fix_no.equalsIgnoreCase(name)) {
			pre_purc_frcst_fix_no(value);
			return;
		}
		if ($pre_trd_unit_cd.equalsIgnoreCase(name)) {
			pre_trd_unit_cd(value);
			return;
		}
		if ($pre_trd_unit_nm.equalsIgnoreCase(name)) {
			pre_trd_unit_nm(value);
			return;
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			dtl_rpt_rmrks(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			pf_dt(value);
			return;
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			pre_pf_dt(value);
			return;
		}
		if ($pf_rpt_dt.equalsIgnoreCase(name)) {
			pf_rpt_dt(value);
			return;
		}
		if ($del_pf_rpt_dt.equalsIgnoreCase(name)) {
			del_pf_rpt_dt(value);
			return;
		}
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($pf_rpt_flg.equalsIgnoreCase(name)) {
			pf_rpt_flg(value);
			return;
		}
		if ($del_pf_rpt_flg.equalsIgnoreCase(name)) {
			del_pf_rpt_flg(value);
			return;
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			purc_commit_flg(value);
			return;
		}
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		if ($pre_fix_period_flg.equalsIgnoreCase(name)) {
			pre_fix_period_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			purc_frcst_no(value);
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			pf_usr_cd(value);
			return;
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			pf_usr_nm(value);
			return;
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			pf_dpt_cd(value);
			return;
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			pf_dpt_nm(value);
			return;
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			pf_rpt_no(value);
			return;
		}
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			hdr_rpt_rmrks(value);
			return;
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			hdr_intr_rmrks(value);
			return;
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			hdr_sub_char1(value);
			return;
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			hdr_sub_char2(value);
			return;
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			hdr_sub_char3(value);
			return;
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			purc_frcst_fix_no(value);
			return;
		}
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			purc_frcst_d_no(value);
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
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
			return;
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			pf_period_typ_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($pre_purc_frcst_fix_no.equalsIgnoreCase(name)) {
			pre_purc_frcst_fix_no(value);
			return;
		}
		if ($pre_trd_unit_cd.equalsIgnoreCase(name)) {
			pre_trd_unit_cd(value);
			return;
		}
		if ($pre_trd_unit_nm.equalsIgnoreCase(name)) {
			pre_trd_unit_nm(value);
			return;
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			dtl_rpt_rmrks(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($pre_trd_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty(value);
			return;
		}
		if ($pre_base_unit_pf_qty.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			pf_dt(value);
			return;
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			pre_pf_dt(value);
			return;
		}
		if ($pf_rpt_dt.equalsIgnoreCase(name)) {
			pf_rpt_dt(value);
			return;
		}
		if ($del_pf_rpt_dt.equalsIgnoreCase(name)) {
			del_pf_rpt_dt(value);
			return;
		}
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($pf_rpt_flg.equalsIgnoreCase(name)) {
			pf_rpt_flg(value);
			return;
		}
		if ($del_pf_rpt_flg.equalsIgnoreCase(name)) {
			del_pf_rpt_flg(value);
			return;
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			purc_commit_flg(value);
			return;
		}
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		if ($pre_fix_period_flg.equalsIgnoreCase(name)) {
			pre_fix_period_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

