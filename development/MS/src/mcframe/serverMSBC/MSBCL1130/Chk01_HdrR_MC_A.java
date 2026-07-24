package mcframe.serverMSBC.MSBCL1130;

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
 * ブロック"Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public static final String $mfg_sts_typ_nm = "mfg_sts_typ_nm";
	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public static final String $st_act_tm = "st_act_tm";
	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public static final String $st_ac_dt = "st_ac_dt";
	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public static final String $end_act_tm = "end_act_tm";
	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public static final String $end_ac_dt = "end_ac_dt";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $unschd_master_dt = "unschd_master_dt";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $unschd_itm_cd = "unschd_itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $unschd_itm_sub1 = "unschd_itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $unschd_itm_sub2 = "unschd_itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $unschd_itm_sub3 = "unschd_itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $unschd_itm_nm = "unschd_itm_nm";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $unschd_lot_mng_typ = "unschd_lot_mng_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $unschd_lot_no_typ = "unschd_lot_no_typ";
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $unschd_lot_no_ptn_cd = "unschd_lot_no_ptn_cd";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $unschd_sublot_mng_typ = "unschd_sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $unschd_sublot_no_typ = "unschd_sublot_no_typ";
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $unschd_sublot_no_ptn_cd = "unschd_sublot_no_ptn_cd";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $unschd_sno1_mng_typ = "unschd_sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $unschd_sno2_mng_typ = "unschd_sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $unschd_sno3_mng_typ = "unschd_sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $unschd_sno4_mng_typ = "unschd_sno4_mng_typ";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_cd = "unschd_mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_nm = "unschd_mfg_loc_nm";
	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public static final String $unschd_mfg_str_ln_tgt_flg = "unschd_mfg_str_ln_tgt_flg";
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $unschd_mfg_str_ln_cd = "unschd_mfg_str_ln_cd";
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public static final String $unschd_mfg_str_ln_nm = "unschd_mfg_str_ln_nm";
	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public static final String $unschd_mfg_str_ln_cd_none_flg = "unschd_mfg_str_ln_cd_none_flg";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $unschd_sppl_cd = "unschd_sppl_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_site_cd = "unschd_mfg_loc_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_site_nm = "unschd_mfg_loc_site_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_wg_cd = "unschd_mfg_loc_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_wg_nm = "unschd_mfg_loc_wg_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $unschd_bom_ptn = "unschd_bom_ptn";
	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public static final String $unschd_lot_issue_typ = "unschd_lot_issue_typ";
	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public static final String $unschd_ln_stk_flg = "unschd_ln_stk_flg";
	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public static final String $unschd_no_mfg_aprv_flg = "unschd_no_mfg_aprv_flg";
	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public static final String $unschd_mst_yield_schd_qty = "unschd_mst_yield_schd_qty";
	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public static final String $unschd_mst_mfg_inst_qty = "unschd_mst_mfg_inst_qty";
	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public static final String $unschd_mst_fxd_rqmt_qty = "unschd_mst_fxd_rqmt_qty";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $unschd_strg_loc_cd = "unschd_strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $unschd_strg_loc_nm = "unschd_strg_loc_nm";
	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_tgt_flg = "unschd_strg_str_ln_tgt_flg";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_cd = "unschd_strg_str_ln_cd";
	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_nm = "unschd_strg_str_ln_nm";
	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_cd_none_flg = "unschd_strg_str_ln_cd_none_flg";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $unschd_oper_ptn = "unschd_oper_ptn";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $unschd_lot_no = "unschd_lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $unschd_sublot_no = "unschd_sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $unschd_sno1 = "unschd_sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $unschd_sno2 = "unschd_sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $unschd_sno3 = "unschd_sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $unschd_sno4 = "unschd_sno4";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $unschd_wrk_no = "unschd_wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $unschd_wrk_nm = "unschd_wrk_nm";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $unschd_trd_unit_cd = "unschd_trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $unschd_trd_unit_nm = "unschd_trd_unit_nm";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $unschd_conv_base_qty = "unschd_conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $unschd_conv_qty = "unschd_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unschd_trd_unit_dec_place = "unschd_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $unschd_trd_unit_rnd_typ = "unschd_trd_unit_rnd_typ";
	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public static final String $unschd_trd_unit_yield_act_qty = "unschd_trd_unit_yield_act_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unschd_base_unit_cd = "unschd_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unschd_base_unit_nm = "unschd_base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unschd_base_unit_dec_place = "unschd_base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $unschd_base_unit_conv_rnd_typ = "unschd_base_unit_conv_rnd_typ";
	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public static final String $unschd_base_unit_yield_act_qty = "unschd_base_unit_yield_act_qty";
	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_dpt_cd = "act_usr_dpt_cd";
	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public static final String $act_usr_dpt_nm = "act_usr_dpt_nm";
	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public static final String $mfg_act_rpt_rmrks = "mfg_act_rpt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $mfg_act_intr_rmrks = "mfg_act_intr_rmrks";
	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public static final String $mfg_act_sub_char1 = "mfg_act_sub_char1";
	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public static final String $mfg_act_sub_char2 = "mfg_act_sub_char2";
	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public static final String $mfg_act_sub_char3 = "mfg_act_sub_char3";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Process result status type name 処理結果状況区分名.<p>
	 *
	 */
	public static final String $rtn_sts_typ_nm = "rtn_sts_typ_nm";
	/**
	 * Process result info. ID 処理結果情報ＩＤ.<p>
	 *
	 */
	public static final String $msg_id = "msg_id";
	/**
	 * Process result info. 処理結果情報.<p>
	 *
	 */
	public static final String $msg = "msg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta st_act_tm_META = createCommonMeta($st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta st_ac_dt_META = createCommonMeta($st_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_act_tm_META = createCommonMeta($end_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_ac_dt_META = createCommonMeta($end_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unschd_master_dt_META = createCommonMeta($unschd_master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unschd_itm_cd_META = createCommonMeta($unschd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta unschd_itm_sub1_META = createCommonMeta($unschd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta unschd_itm_sub2_META = createCommonMeta($unschd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta unschd_itm_sub3_META = createCommonMeta($unschd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta unschd_itm_nm_META = createCommonMeta($unschd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unschd_lot_mng_typ_META = createCommonMeta($unschd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta unschd_lot_no_typ_META = createCommonMeta($unschd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta unschd_lot_no_ptn_cd_META = createCommonMeta($unschd_lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta unschd_sublot_mng_typ_META = createCommonMeta($unschd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta unschd_sublot_no_typ_META = createCommonMeta($unschd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta unschd_sublot_no_ptn_cd_META = createCommonMeta($unschd_sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta unschd_sno1_mng_typ_META = createCommonMeta($unschd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta unschd_sno2_mng_typ_META = createCommonMeta($unschd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta unschd_sno3_mng_typ_META = createCommonMeta($unschd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta unschd_sno4_mng_typ_META = createCommonMeta($unschd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta unschd_mfg_loc_cd_META = createCommonMeta($unschd_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta unschd_mfg_loc_nm_META = createCommonMeta($unschd_mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta unschd_mfg_str_ln_tgt_flg_META = createCommonMeta($unschd_mfg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_mfg_str_ln_cd_META = createCommonMeta($unschd_mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta unschd_mfg_str_ln_nm_META = createCommonMeta($unschd_mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta unschd_mfg_str_ln_cd_none_flg_META = createCommonMeta($unschd_mfg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_sppl_cd_META = createCommonMeta($unschd_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta unschd_mfg_loc_site_cd_META = createCommonMeta($unschd_mfg_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta unschd_mfg_loc_site_nm_META = createCommonMeta($unschd_mfg_loc_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta unschd_mfg_loc_wg_cd_META = createCommonMeta($unschd_mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta unschd_mfg_loc_wg_nm_META = createCommonMeta($unschd_mfg_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta unschd_bom_ptn_META = createCommonMeta($unschd_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta unschd_lot_issue_typ_META = createCommonMeta($unschd_lot_issue_typ, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP);
	public static final MCMeta unschd_ln_stk_flg_META = createCommonMeta($unschd_ln_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_no_mfg_aprv_flg_META = createCommonMeta($unschd_no_mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_mst_yield_schd_qty_META = createCommonMeta($unschd_mst_yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_mst_mfg_inst_qty_META = createCommonMeta($unschd_mst_mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_mst_fxd_rqmt_qty_META = createCommonMeta($unschd_mst_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta unschd_strg_loc_cd_META = createCommonMeta($unschd_strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta unschd_strg_loc_nm_META = createCommonMeta($unschd_strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta unschd_strg_str_ln_tgt_flg_META = createCommonMeta($unschd_strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_strg_str_ln_cd_META = createCommonMeta($unschd_strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta unschd_strg_str_ln_nm_META = createCommonMeta($unschd_strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta unschd_strg_str_ln_cd_none_flg_META = createCommonMeta($unschd_strg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_oper_ptn_META = createCommonMeta($unschd_oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta unschd_lot_no_META = createCommonMeta($unschd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta unschd_sublot_no_META = createCommonMeta($unschd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta unschd_sno1_META = createCommonMeta($unschd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta unschd_sno2_META = createCommonMeta($unschd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta unschd_sno3_META = createCommonMeta($unschd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta unschd_sno4_META = createCommonMeta($unschd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta unschd_wrk_no_META = createCommonMeta($unschd_wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta unschd_wrk_nm_META = createCommonMeta($unschd_wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta unschd_trd_unit_cd_META = createCommonMeta($unschd_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unschd_trd_unit_nm_META = createCommonMeta($unschd_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unschd_conv_base_qty_META = createCommonMeta($unschd_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_conv_qty_META = createCommonMeta($unschd_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_trd_unit_dec_place_META = createCommonMeta($unschd_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_trd_unit_rnd_typ_META = createCommonMeta($unschd_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unschd_trd_unit_yield_act_qty_META = createCommonMeta($unschd_trd_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_base_unit_cd_META = createCommonMeta($unschd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unschd_base_unit_nm_META = createCommonMeta($unschd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unschd_base_unit_dec_place_META = createCommonMeta($unschd_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_base_unit_conv_rnd_typ_META = createCommonMeta($unschd_base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unschd_base_unit_yield_act_qty_META = createCommonMeta($unschd_base_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_usr_dpt_cd_META = createCommonMeta($act_usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_usr_dpt_nm_META = createCommonMeta($act_usr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta mfg_act_rpt_rmrks_META = createCommonMeta($mfg_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta mfg_act_intr_rmrks_META = createCommonMeta($mfg_act_intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_INTR_RMRKS);
	public static final MCMeta mfg_act_sub_char1_META = createCommonMeta($mfg_act_sub_char1, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR1);
	public static final MCMeta mfg_act_sub_char2_META = createCommonMeta($mfg_act_sub_char2, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR2);
	public static final MCMeta mfg_act_sub_char3_META = createCommonMeta($mfg_act_sub_char3, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR3);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta rtn_sts_typ_nm_META = createCommonMeta($rtn_sts_typ_nm, mcframe.commonMA.meta.MA_META.RTN_STS_TYP_NM);
	public static final MCMeta msg_id_META = createCommonMeta($msg_id, mcframe.commonMA.meta.MA_META.MSG_ID);
	public static final MCMeta msg_META = createCommonMeta($msg, mcframe.commonMA.meta.MA_META.MSG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Chk01_HdrR> constMetas = new ConstMetaList<Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			st_act_tm_META,
			st_ac_dt_META,
			end_act_tm_META,
			end_ac_dt_META,
			unschd_master_dt_META,
			unschd_itm_cd_META,
			unschd_itm_sub1_META,
			unschd_itm_sub2_META,
			unschd_itm_sub3_META,
			unschd_itm_nm_META,
			unschd_lot_mng_typ_META,
			unschd_lot_no_typ_META,
			unschd_lot_no_ptn_cd_META,
			unschd_sublot_mng_typ_META,
			unschd_sublot_no_typ_META,
			unschd_sublot_no_ptn_cd_META,
			unschd_sno1_mng_typ_META,
			unschd_sno2_mng_typ_META,
			unschd_sno3_mng_typ_META,
			unschd_sno4_mng_typ_META,
			unschd_mfg_loc_cd_META,
			unschd_mfg_loc_nm_META,
			unschd_mfg_str_ln_tgt_flg_META,
			unschd_mfg_str_ln_cd_META,
			unschd_mfg_str_ln_nm_META,
			unschd_mfg_str_ln_cd_none_flg_META,
			unschd_sppl_cd_META,
			unschd_mfg_loc_site_cd_META,
			unschd_mfg_loc_site_nm_META,
			unschd_mfg_loc_wg_cd_META,
			unschd_mfg_loc_wg_nm_META,
			unschd_bom_ptn_META,
			unschd_lot_issue_typ_META,
			unschd_ln_stk_flg_META,
			unschd_no_mfg_aprv_flg_META,
			unschd_mst_yield_schd_qty_META,
			unschd_mst_mfg_inst_qty_META,
			unschd_mst_fxd_rqmt_qty_META,
			mfg_inst_unit_typ_META,
			unschd_strg_loc_cd_META,
			unschd_strg_loc_nm_META,
			unschd_strg_str_ln_tgt_flg_META,
			unschd_strg_str_ln_cd_META,
			unschd_strg_str_ln_nm_META,
			unschd_strg_str_ln_cd_none_flg_META,
			unschd_oper_ptn_META,
			unschd_lot_no_META,
			unschd_sublot_no_META,
			unschd_sno1_META,
			unschd_sno2_META,
			unschd_sno3_META,
			unschd_sno4_META,
			unschd_wrk_no_META,
			unschd_wrk_nm_META,
			unschd_trd_unit_cd_META,
			unschd_trd_unit_nm_META,
			unschd_conv_base_qty_META,
			unschd_conv_qty_META,
			unschd_trd_unit_dec_place_META,
			unschd_trd_unit_rnd_typ_META,
			unschd_trd_unit_yield_act_qty_META,
			unschd_base_unit_cd_META,
			unschd_base_unit_nm_META,
			unschd_base_unit_dec_place_META,
			unschd_base_unit_conv_rnd_typ_META,
			unschd_base_unit_yield_act_qty_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_usr_dpt_cd_META,
			act_usr_dpt_nm_META,
			mfg_act_rpt_rmrks_META,
			mfg_act_intr_rmrks_META,
			mfg_act_sub_char1_META,
			mfg_act_sub_char2_META,
			mfg_act_sub_char3_META,
			rtn_sts_typ_META,
			rtn_sts_typ_nm_META,
			msg_id_META,
			msg_META,
			peg_no_META,
			mfg_act_no_META,
			err_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[UPD_CNT_CHK]のキー定数 */
	public static final String $$UPD_CNT_CHK = "UPD_CNT_CHK";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$unschd_itm_sub1, "E"},	// unschd_itm_sub1
				{$unschd_itm_sub2, "E"},	// unschd_itm_sub2
				{$unschd_itm_sub3, "E"},	// unschd_itm_sub3
				{$unschd_mfg_str_ln_cd, "E"},	// unschd_mfg_str_ln_cd
				{$unschd_strg_str_ln_cd, "E"},	// unschd_strg_str_ln_cd
				{$unschd_lot_no, "E"},	// unschd_lot_no
				{$unschd_sublot_no, "E"},	// unschd_sublot_no
				{$unschd_sno1, "E"},	// unschd_sno1
				{$unschd_sno2, "E"},	// unschd_sno2
				{$unschd_sno3, "E"},	// unschd_sno3
				{$unschd_sno4, "E"}	// unschd_sno4
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$mfg_sts_typ, "MSC_MFG_STS_TYP"}	// mfg_sts_typ
			}
		)),
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$mfg_sts_typ, "E"},	// mfg_sts_typ
				{$st_act_tm, "E"},	// st_act_tm
				{$st_ac_dt, "E"},	// st_ac_dt
				{$unschd_master_dt, "E"},	// unschd_master_dt
				{$unschd_itm_cd, "E"},	// unschd_itm_cd
				{$unschd_itm_sub1, "E"},	// unschd_itm_sub1
				{$unschd_itm_sub2, "E"},	// unschd_itm_sub2
				{$unschd_itm_sub3, "E"},	// unschd_itm_sub3
				{$unschd_mfg_loc_cd, "E"},	// unschd_mfg_loc_cd
				{$unschd_bom_ptn, "E"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "E"},	// unschd_strg_loc_cd
				{$unschd_oper_ptn, "E"},	// unschd_oper_ptn
				{$unschd_trd_unit_cd, "E"},	// unschd_trd_unit_cd
				{$unschd_trd_unit_yield_act_qty, "E"}	// unschd_trd_unit_yield_act_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$unschd_trd_unit_yield_act_qty, "positive"}	// unschd_trd_unit_yield_act_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$st_act_tm, "tmBfToday"},	// st_act_tm
				{$st_ac_dt, "bfToday"},	// st_ac_dt
				{$end_act_tm, "tmBfToday"},	// end_act_tm
				{$end_ac_dt, "bfToday"}	// end_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_act_tm, "st_end_act:BF,st_group:BF"},	// st_act_tm
				{$st_ac_dt, "st_end_ac:BF,,st_group:AF"},	// st_ac_dt
				{$end_act_tm, "st_end_act:AF,end_group:BF"},	// end_act_tm
				{$end_ac_dt, "st_end_ac:AF,,end_group:AF"}	// end_ac_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$mfg_act_no, "E"}	// mfg_act_no
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$unschd_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// unschd_itm_sub3
				{$unschd_mfg_loc_cd, "MA.MAUAL0010.Loc"},	// unschd_mfg_loc_cd
				{$unschd_mfg_str_ln_cd, "MA.MAUAL0010.StrLn"},	// unschd_mfg_str_ln_cd
				{$unschd_bom_ptn, "MS.MSUAL0040.ItmDtlBomPtn"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "MA.MAUAL0010.Loc"},	// unschd_strg_loc_cd
				{$unschd_strg_str_ln_cd, "MA.MAUAL0010.StrLn"},	// unschd_strg_str_ln_cd
				{$unschd_oper_ptn, "MA.MAUAL0010.ItmOper"},	// unschd_oper_ptn
				{$unschd_trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// unschd_trd_unit_cd
				{$act_usr_cd, "MA.MAUAL0010.Usr"},	// act_usr_cd
				{$act_usr_dpt_cd, "MA.MAUAL0010.Dpt"}	// act_usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$unschd_itm_sub3, "unschd_itm_nm;unschd_lot_mng_typ;unschd_lot_no_typ;unschd_lot_no_ptn_cd;unschd_sublot_mng_typ;unschd_sublot_no_typ;unschd_sublot_no_ptn_cd;unschd_sno1_mng_typ;unschd_sno2_mng_typ;unschd_sno3_mng_typ;unschd_sno4_mng_typ;unschd_base_unit_cd;unschd_base_unit_nm;unschd_base_unit_dec_place;unschd_base_unit_conv_rnd_typ"},	// unschd_itm_sub3
				{$unschd_mfg_loc_cd, "unschd_mfg_loc_nm;unschd_mfg_str_ln_tgt_flg;unschd_mfg_loc_wg_cd;unschd_mfg_loc_site_cd;unschd_mfg_loc_wg_nm;unschd_mfg_loc_site_nm;unschd_sppl_cd"},	// unschd_mfg_loc_cd
				{$unschd_mfg_str_ln_cd, "unschd_mfg_str_ln_nm"},	// unschd_mfg_str_ln_cd
				{$unschd_bom_ptn, "unschd_lot_issue_typ;unschd_mst_yield_schd_qty;unschd_mst_mfg_inst_qty;unschd_mst_fxd_rqmt_qty;unschd_ln_stk_flg;unschd_no_mfg_aprv_flg;mfg_inst_unit_typ"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "unschd_strg_loc_nm;unschd_strg_str_ln_tgt_flg"},	// unschd_strg_loc_cd
				{$unschd_strg_str_ln_cd, "unschd_strg_str_ln_nm"},	// unschd_strg_str_ln_cd
				{$unschd_trd_unit_cd, "unschd_trd_unit_nm;unschd_trd_unit_dec_place;unschd_trd_unit_rnd_typ;unschd_conv_base_qty;unschd_conv_qty;pack_flg"},	// unschd_trd_unit_cd
				{$act_usr_cd, "act_usr_nm"},	// act_usr_cd
				{$act_usr_dpt_cd, "act_usr_dpt_nm"}	// act_usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$unschd_itm_sub3, "itm_nm;lot_mng_typ;lot_no_typ;lot_no_ptn_cd;sublot_mng_typ;sublot_no_typ;sublot_no_ptn_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ"},	// unschd_itm_sub3
				{$unschd_mfg_loc_cd, "loc_nm;str_ln_tgt_flg;wg_cd;site_cd;wg_nm;site_nm;sppl_cd"},	// unschd_mfg_loc_cd
				{$unschd_mfg_str_ln_cd, "str_ln_nm"},	// unschd_mfg_str_ln_cd
				{$unschd_bom_ptn, "lot_issue_typ;mst_yield_schd_qty;mst_mfg_inst_qty;mst_fxd_rqmt_qty;ln_stk_flg;no_mfg_aprv_flg;mfg_inst_unit_typ"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "loc_nm;str_ln_tgt_flg"},	// unschd_strg_loc_cd
				{$unschd_strg_str_ln_cd, "str_ln_nm"},	// unschd_strg_str_ln_cd
				{$unschd_trd_unit_cd, "unit_nm;dec_place;rnd_typ;conv_base_qty;conv_qty;pack_flg"},	// unschd_trd_unit_cd
				{$act_usr_cd, "usr_nm"},	// act_usr_cd
				{$act_usr_dpt_cd, "dpt_nm"}	// act_usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$unschd_itm_sub3, "unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2"},	// unschd_itm_sub3
				{$unschd_mfg_loc_cd, "unschd_master_dt;unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3"},	// unschd_mfg_loc_cd
				{$unschd_mfg_str_ln_cd, "unschd_mfg_loc_cd;true"},	// unschd_mfg_str_ln_cd
				{$unschd_bom_ptn, "unschd_master_dt;unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3;unschd_mfg_loc_wg_cd;unschd_mfg_loc_cd;MAC_STR.NULL_VAL;MAC_STR.NULL_VAL;MAC_STR.NULL_VAL"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "unschd_mfg_loc_wg_cd"},	// unschd_strg_loc_cd
				{$unschd_strg_str_ln_cd, "unschd_strg_loc_cd;true"},	// unschd_strg_str_ln_cd
				{$unschd_oper_ptn, "unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3;unschd_mfg_loc_cd;st_ac_dt;true"},	// unschd_oper_ptn
				{$unschd_trd_unit_cd, "unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3"},	// unschd_trd_unit_cd
				{$act_usr_cd, "st_ac_dt"},	// act_usr_cd
				{$act_usr_dpt_cd, "MAC_DPT_IS_SRCH_TYP.MFG;st_ac_dt;act_usr_cd"}	// act_usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$unschd_itm_sub3, "itm_cd;itm_sub1;itm_sub2"},	// unschd_itm_sub3
				{$unschd_mfg_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// unschd_mfg_loc_cd
				{$unschd_mfg_str_ln_cd, "loc_cd;mode_nullval_flg"},	// unschd_mfg_str_ln_cd
				{$unschd_bom_ptn, "dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd;sppl_cd;maker_cd;rqst_loc_cd"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "wg_cd"},	// unschd_strg_loc_cd
				{$unschd_strg_str_ln_cd, "loc_cd;mode_nullval_flg"},	// unschd_strg_str_ln_cd
				{$unschd_oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;loc_cd;dt;mode_nullval_flg"},	// unschd_oper_ptn
				{$unschd_trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// unschd_trd_unit_cd
				{$act_usr_cd, "dt"},	// act_usr_cd
				{$act_usr_dpt_cd, "dpt_is_srch_typ;dt;usr_cd"}	// act_usr_dpt_cd
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
	protected Chk01_HdrR_MC_A(ConstMetaList<? extends Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR clone() {
		return (Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR createInstance() {
		return (Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR getValues(String... names) {
		return (Chk01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 0, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 0, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 1, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 1, $mfg_sts_typ_nm, value);
	}


	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return getConstDate(offset + 2, $st_act_tm);
	}

	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		setConstDate(offset + 2, $st_act_tm, value);
	}


	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return getConstDate(offset + 3, $st_ac_dt);
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		setConstDate(offset + 3, $st_ac_dt, value);
	}


	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return getConstDate(offset + 4, $end_act_tm);
	}

	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		setConstDate(offset + 4, $end_act_tm, value);
	}


	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public MCDate end_ac_dt() {
		return getConstDate(offset + 5, $end_ac_dt);
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public void end_ac_dt(MCDate value) {
		setConstDate(offset + 5, $end_ac_dt, value);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate unschd_master_dt() {
		return getConstDate(offset + 6, $unschd_master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void unschd_master_dt(MCDate value) {
		setConstDate(offset + 6, $unschd_master_dt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String unschd_itm_cd() {
		return getConstString(offset + 7, $unschd_itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void unschd_itm_cd(String value) {
		setConstString(offset + 7, $unschd_itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String unschd_itm_sub1() {
		return getConstString(offset + 8, $unschd_itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void unschd_itm_sub1(String value) {
		setConstString(offset + 8, $unschd_itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String unschd_itm_sub2() {
		return getConstString(offset + 9, $unschd_itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void unschd_itm_sub2(String value) {
		setConstString(offset + 9, $unschd_itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String unschd_itm_sub3() {
		return getConstString(offset + 10, $unschd_itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void unschd_itm_sub3(String value) {
		setConstString(offset + 10, $unschd_itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String unschd_itm_nm() {
		return getConstString(offset + 11, $unschd_itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void unschd_itm_nm(String value) {
		setConstString(offset + 11, $unschd_itm_nm, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String unschd_lot_mng_typ() {
		return getConstString(offset + 12, $unschd_lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void unschd_lot_mng_typ(String value) {
		setConstString(offset + 12, $unschd_lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String unschd_lot_no_typ() {
		return getConstString(offset + 13, $unschd_lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void unschd_lot_no_typ(String value) {
		setConstString(offset + 13, $unschd_lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String unschd_lot_no_ptn_cd() {
		return getConstString(offset + 14, $unschd_lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void unschd_lot_no_ptn_cd(String value) {
		setConstString(offset + 14, $unschd_lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String unschd_sublot_mng_typ() {
		return getConstString(offset + 15, $unschd_sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void unschd_sublot_mng_typ(String value) {
		setConstString(offset + 15, $unschd_sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String unschd_sublot_no_typ() {
		return getConstString(offset + 16, $unschd_sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void unschd_sublot_no_typ(String value) {
		setConstString(offset + 16, $unschd_sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String unschd_sublot_no_ptn_cd() {
		return getConstString(offset + 17, $unschd_sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void unschd_sublot_no_ptn_cd(String value) {
		setConstString(offset + 17, $unschd_sublot_no_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String unschd_sno1_mng_typ() {
		return getConstString(offset + 18, $unschd_sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void unschd_sno1_mng_typ(String value) {
		setConstString(offset + 18, $unschd_sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String unschd_sno2_mng_typ() {
		return getConstString(offset + 19, $unschd_sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void unschd_sno2_mng_typ(String value) {
		setConstString(offset + 19, $unschd_sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String unschd_sno3_mng_typ() {
		return getConstString(offset + 20, $unschd_sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void unschd_sno3_mng_typ(String value) {
		setConstString(offset + 20, $unschd_sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String unschd_sno4_mng_typ() {
		return getConstString(offset + 21, $unschd_sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void unschd_sno4_mng_typ(String value) {
		setConstString(offset + 21, $unschd_sno4_mng_typ, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String unschd_mfg_loc_cd() {
		return getConstString(offset + 22, $unschd_mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void unschd_mfg_loc_cd(String value) {
		setConstString(offset + 22, $unschd_mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String unschd_mfg_loc_nm() {
		return getConstString(offset + 23, $unschd_mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void unschd_mfg_loc_nm(String value) {
		setConstString(offset + 23, $unschd_mfg_loc_nm, value);
	}


	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public boolean unschd_mfg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 24, $unschd_mfg_str_ln_tgt_flg);
	}

	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public void unschd_mfg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 24, $unschd_mfg_str_ln_tgt_flg, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String unschd_mfg_str_ln_cd() {
		return getConstString(offset + 25, $unschd_mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void unschd_mfg_str_ln_cd(String value) {
		setConstString(offset + 25, $unschd_mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String unschd_mfg_str_ln_nm() {
		return getConstString(offset + 26, $unschd_mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void unschd_mfg_str_ln_nm(String value) {
		setConstString(offset + 26, $unschd_mfg_str_ln_nm, value);
	}


	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public boolean unschd_mfg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 27, $unschd_mfg_str_ln_cd_none_flg);
	}

	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public void unschd_mfg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 27, $unschd_mfg_str_ln_cd_none_flg, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String unschd_sppl_cd() {
		return getConstString(offset + 28, $unschd_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void unschd_sppl_cd(String value) {
		setConstString(offset + 28, $unschd_sppl_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String unschd_mfg_loc_site_cd() {
		return getConstString(offset + 29, $unschd_mfg_loc_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void unschd_mfg_loc_site_cd(String value) {
		setConstString(offset + 29, $unschd_mfg_loc_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String unschd_mfg_loc_site_nm() {
		return getConstString(offset + 30, $unschd_mfg_loc_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void unschd_mfg_loc_site_nm(String value) {
		setConstString(offset + 30, $unschd_mfg_loc_site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String unschd_mfg_loc_wg_cd() {
		return getConstString(offset + 31, $unschd_mfg_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void unschd_mfg_loc_wg_cd(String value) {
		setConstString(offset + 31, $unschd_mfg_loc_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String unschd_mfg_loc_wg_nm() {
		return getConstString(offset + 32, $unschd_mfg_loc_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void unschd_mfg_loc_wg_nm(String value) {
		setConstString(offset + 32, $unschd_mfg_loc_wg_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String unschd_bom_ptn() {
		return getConstString(offset + 33, $unschd_bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void unschd_bom_ptn(String value) {
		setConstString(offset + 33, $unschd_bom_ptn, value);
	}


	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public String unschd_lot_issue_typ() {
		return getConstString(offset + 34, $unschd_lot_issue_typ);
	}

	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public void unschd_lot_issue_typ(String value) {
		setConstString(offset + 34, $unschd_lot_issue_typ, value);
	}


	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public boolean unschd_ln_stk_flg() {
		return getConstBoolean(offset + 35, $unschd_ln_stk_flg);
	}

	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public void unschd_ln_stk_flg(boolean value) {
		setConstBoolean(offset + 35, $unschd_ln_stk_flg, value);
	}


	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public boolean unschd_no_mfg_aprv_flg() {
		return getConstBoolean(offset + 36, $unschd_no_mfg_aprv_flg);
	}

	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public void unschd_no_mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 36, $unschd_no_mfg_aprv_flg, value);
	}


	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public MCNumber unschd_mst_yield_schd_qty() {
		return getConstNumber(offset + 37, $unschd_mst_yield_schd_qty);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 37, $unschd_mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(int value) {
		setConstNumber(offset + 37, $unschd_mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(long value) {
		setConstNumber(offset + 37, $unschd_mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(float value) {
		setConstNumber(offset + 37, $unschd_mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(double value) {
		setConstNumber(offset + 37, $unschd_mst_yield_schd_qty, value);
	}


	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public MCNumber unschd_mst_mfg_inst_qty() {
		return getConstNumber(offset + 38, $unschd_mst_mfg_inst_qty);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 38, $unschd_mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(int value) {
		setConstNumber(offset + 38, $unschd_mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(long value) {
		setConstNumber(offset + 38, $unschd_mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(float value) {
		setConstNumber(offset + 38, $unschd_mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(double value) {
		setConstNumber(offset + 38, $unschd_mst_mfg_inst_qty, value);
	}


	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public MCNumber unschd_mst_fxd_rqmt_qty() {
		return getConstNumber(offset + 39, $unschd_mst_fxd_rqmt_qty);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 39, $unschd_mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 39, $unschd_mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 39, $unschd_mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 39, $unschd_mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 39, $unschd_mst_fxd_rqmt_qty, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 40, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 40, $mfg_inst_unit_typ, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String unschd_strg_loc_cd() {
		return getConstString(offset + 41, $unschd_strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void unschd_strg_loc_cd(String value) {
		setConstString(offset + 41, $unschd_strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String unschd_strg_loc_nm() {
		return getConstString(offset + 42, $unschd_strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void unschd_strg_loc_nm(String value) {
		setConstString(offset + 42, $unschd_strg_loc_nm, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean unschd_strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 43, $unschd_strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void unschd_strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 43, $unschd_strg_str_ln_tgt_flg, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String unschd_strg_str_ln_cd() {
		return getConstString(offset + 44, $unschd_strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void unschd_strg_str_ln_cd(String value) {
		setConstString(offset + 44, $unschd_strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String unschd_strg_str_ln_nm() {
		return getConstString(offset + 45, $unschd_strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void unschd_strg_str_ln_nm(String value) {
		setConstString(offset + 45, $unschd_strg_str_ln_nm, value);
	}


	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public boolean unschd_strg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 46, $unschd_strg_str_ln_cd_none_flg);
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public void unschd_strg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 46, $unschd_strg_str_ln_cd_none_flg, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String unschd_oper_ptn() {
		return getConstString(offset + 47, $unschd_oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void unschd_oper_ptn(String value) {
		setConstString(offset + 47, $unschd_oper_ptn, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String unschd_lot_no() {
		return getConstString(offset + 48, $unschd_lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void unschd_lot_no(String value) {
		setConstString(offset + 48, $unschd_lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String unschd_sublot_no() {
		return getConstString(offset + 49, $unschd_sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void unschd_sublot_no(String value) {
		setConstString(offset + 49, $unschd_sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String unschd_sno1() {
		return getConstString(offset + 50, $unschd_sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void unschd_sno1(String value) {
		setConstString(offset + 50, $unschd_sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String unschd_sno2() {
		return getConstString(offset + 51, $unschd_sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void unschd_sno2(String value) {
		setConstString(offset + 51, $unschd_sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String unschd_sno3() {
		return getConstString(offset + 52, $unschd_sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void unschd_sno3(String value) {
		setConstString(offset + 52, $unschd_sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String unschd_sno4() {
		return getConstString(offset + 53, $unschd_sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void unschd_sno4(String value) {
		setConstString(offset + 53, $unschd_sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String unschd_wrk_no() {
		return getConstString(offset + 54, $unschd_wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void unschd_wrk_no(String value) {
		setConstString(offset + 54, $unschd_wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String unschd_wrk_nm() {
		return getConstString(offset + 55, $unschd_wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void unschd_wrk_nm(String value) {
		setConstString(offset + 55, $unschd_wrk_nm, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String unschd_trd_unit_cd() {
		return getConstString(offset + 56, $unschd_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void unschd_trd_unit_cd(String value) {
		setConstString(offset + 56, $unschd_trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String unschd_trd_unit_nm() {
		return getConstString(offset + 57, $unschd_trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void unschd_trd_unit_nm(String value) {
		setConstString(offset + 57, $unschd_trd_unit_nm, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber unschd_conv_base_qty() {
		return getConstNumber(offset + 58, $unschd_conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 58, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(int value) {
		setConstNumber(offset + 58, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(long value) {
		setConstNumber(offset + 58, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(float value) {
		setConstNumber(offset + 58, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(double value) {
		setConstNumber(offset + 58, $unschd_conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber unschd_conv_qty() {
		return getConstNumber(offset + 59, $unschd_conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(MCNumber value) {
		setConstNumber(offset + 59, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(int value) {
		setConstNumber(offset + 59, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(long value) {
		setConstNumber(offset + 59, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(float value) {
		setConstNumber(offset + 59, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(double value) {
		setConstNumber(offset + 59, $unschd_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unschd_trd_unit_dec_place() {
		return getConstNumber(offset + 60, $unschd_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 60, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(int value) {
		setConstNumber(offset + 60, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(long value) {
		setConstNumber(offset + 60, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(float value) {
		setConstNumber(offset + 60, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(double value) {
		setConstNumber(offset + 60, $unschd_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String unschd_trd_unit_rnd_typ() {
		return getConstString(offset + 61, $unschd_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void unschd_trd_unit_rnd_typ(String value) {
		setConstString(offset + 61, $unschd_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public MCNumber unschd_trd_unit_yield_act_qty() {
		return getConstNumber(offset + 62, $unschd_trd_unit_yield_act_qty);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 62, $unschd_trd_unit_yield_act_qty, value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(int value) {
		setConstNumber(offset + 62, $unschd_trd_unit_yield_act_qty, value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(long value) {
		setConstNumber(offset + 62, $unschd_trd_unit_yield_act_qty, value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(float value) {
		setConstNumber(offset + 62, $unschd_trd_unit_yield_act_qty, value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(double value) {
		setConstNumber(offset + 62, $unschd_trd_unit_yield_act_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unschd_base_unit_cd() {
		return getConstString(offset + 63, $unschd_base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unschd_base_unit_cd(String value) {
		setConstString(offset + 63, $unschd_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unschd_base_unit_nm() {
		return getConstString(offset + 64, $unschd_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unschd_base_unit_nm(String value) {
		setConstString(offset + 64, $unschd_base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unschd_base_unit_dec_place() {
		return getConstNumber(offset + 65, $unschd_base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 65, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(int value) {
		setConstNumber(offset + 65, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(long value) {
		setConstNumber(offset + 65, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(float value) {
		setConstNumber(offset + 65, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(double value) {
		setConstNumber(offset + 65, $unschd_base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String unschd_base_unit_conv_rnd_typ() {
		return getConstString(offset + 66, $unschd_base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void unschd_base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 66, $unschd_base_unit_conv_rnd_typ, value);
	}


	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public MCNumber unschd_base_unit_yield_act_qty() {
		return getConstNumber(offset + 67, $unschd_base_unit_yield_act_qty);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 67, $unschd_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(int value) {
		setConstNumber(offset + 67, $unschd_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(long value) {
		setConstNumber(offset + 67, $unschd_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(float value) {
		setConstNumber(offset + 67, $unschd_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(double value) {
		setConstNumber(offset + 67, $unschd_base_unit_yield_act_qty, value);
	}


	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 68, $act_usr_cd);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 68, $act_usr_cd, value);
	}


	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 69, $act_usr_nm);
	}

	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 69, $act_usr_nm, value);
	}


	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_usr_dpt_cd() {
		return getConstString(offset + 70, $act_usr_dpt_cd);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_usr_dpt_cd(String value) {
		setConstString(offset + 70, $act_usr_dpt_cd, value);
	}


	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public String act_usr_dpt_nm() {
		return getConstString(offset + 71, $act_usr_dpt_nm);
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public void act_usr_dpt_nm(String value) {
		setConstString(offset + 71, $act_usr_dpt_nm, value);
	}


	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public String mfg_act_rpt_rmrks() {
		return getConstString(offset + 72, $mfg_act_rpt_rmrks);
	}

	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public void mfg_act_rpt_rmrks(String value) {
		setConstString(offset + 72, $mfg_act_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String mfg_act_intr_rmrks() {
		return getConstString(offset + 73, $mfg_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void mfg_act_intr_rmrks(String value) {
		setConstString(offset + 73, $mfg_act_intr_rmrks, value);
	}


	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public String mfg_act_sub_char1() {
		return getConstString(offset + 74, $mfg_act_sub_char1);
	}

	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public void mfg_act_sub_char1(String value) {
		setConstString(offset + 74, $mfg_act_sub_char1, value);
	}


	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public String mfg_act_sub_char2() {
		return getConstString(offset + 75, $mfg_act_sub_char2);
	}

	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public void mfg_act_sub_char2(String value) {
		setConstString(offset + 75, $mfg_act_sub_char2, value);
	}


	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public String mfg_act_sub_char3() {
		return getConstString(offset + 76, $mfg_act_sub_char3);
	}

	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public void mfg_act_sub_char3(String value) {
		setConstString(offset + 76, $mfg_act_sub_char3, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 77, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 77, $rtn_sts_typ, value);
	}


	/**
	 * Process result status type name 処理結果状況区分名.<p>
	 *
	 */
	public String rtn_sts_typ_nm() {
		return getConstString(offset + 78, $rtn_sts_typ_nm);
	}

	/**
	 * Process result status type name 処理結果状況区分名.<p>
	 *
	 */
	public void rtn_sts_typ_nm(String value) {
		setConstString(offset + 78, $rtn_sts_typ_nm, value);
	}


	/**
	 * Process result info. ID 処理結果情報ＩＤ.<p>
	 *
	 */
	public String msg_id() {
		return getConstString(offset + 79, $msg_id);
	}

	/**
	 * Process result info. ID 処理結果情報ＩＤ.<p>
	 *
	 */
	public void msg_id(String value) {
		setConstString(offset + 79, $msg_id, value);
	}


	/**
	 * Process result info. 処理結果情報.<p>
	 *
	 */
	public String msg() {
		return getConstString(offset + 80, $msg);
	}

	/**
	 * Process result info. 処理結果情報.<p>
	 *
	 */
	public void msg(String value) {
		setConstString(offset + 80, $msg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 81, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 81, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 81, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 81, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 81, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 81, $peg_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 82, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 82, $mfg_act_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 83, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 83, $err_flg, value);
	}


	public String getString(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		if ($unschd_itm_cd.equalsIgnoreCase(name)) {
			return unschd_itm_cd();
		}
		if ($unschd_itm_sub1.equalsIgnoreCase(name)) {
			return unschd_itm_sub1();
		}
		if ($unschd_itm_sub2.equalsIgnoreCase(name)) {
			return unschd_itm_sub2();
		}
		if ($unschd_itm_sub3.equalsIgnoreCase(name)) {
			return unschd_itm_sub3();
		}
		if ($unschd_itm_nm.equalsIgnoreCase(name)) {
			return unschd_itm_nm();
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_lot_mng_typ();
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			return unschd_lot_no_typ();
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_lot_no_ptn_cd();
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_mng_typ();
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_no_typ();
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_sublot_no_ptn_cd();
		}
		if ($unschd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno1_mng_typ();
		}
		if ($unschd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno2_mng_typ();
		}
		if ($unschd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno3_mng_typ();
		}
		if ($unschd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno4_mng_typ();
		}
		if ($unschd_mfg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_cd();
		}
		if ($unschd_mfg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_nm();
		}
		if ($unschd_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_cd();
		}
		if ($unschd_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_nm();
		}
		if ($unschd_sppl_cd.equalsIgnoreCase(name)) {
			return unschd_sppl_cd();
		}
		if ($unschd_mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_site_cd();
		}
		if ($unschd_mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_site_nm();
		}
		if ($unschd_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_wg_cd();
		}
		if ($unschd_mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_wg_nm();
		}
		if ($unschd_bom_ptn.equalsIgnoreCase(name)) {
			return unschd_bom_ptn();
		}
		if ($unschd_lot_issue_typ.equalsIgnoreCase(name)) {
			return unschd_lot_issue_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_strg_loc_cd();
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_strg_loc_nm();
		}
		if ($unschd_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_cd();
		}
		if ($unschd_strg_str_ln_nm.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_nm();
		}
		if ($unschd_oper_ptn.equalsIgnoreCase(name)) {
			return unschd_oper_ptn();
		}
		if ($unschd_lot_no.equalsIgnoreCase(name)) {
			return unschd_lot_no();
		}
		if ($unschd_sublot_no.equalsIgnoreCase(name)) {
			return unschd_sublot_no();
		}
		if ($unschd_sno1.equalsIgnoreCase(name)) {
			return unschd_sno1();
		}
		if ($unschd_sno2.equalsIgnoreCase(name)) {
			return unschd_sno2();
		}
		if ($unschd_sno3.equalsIgnoreCase(name)) {
			return unschd_sno3();
		}
		if ($unschd_sno4.equalsIgnoreCase(name)) {
			return unschd_sno4();
		}
		if ($unschd_wrk_no.equalsIgnoreCase(name)) {
			return unschd_wrk_no();
		}
		if ($unschd_wrk_nm.equalsIgnoreCase(name)) {
			return unschd_wrk_nm();
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			return unschd_trd_unit_cd();
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			return unschd_trd_unit_nm();
		}
		if ($unschd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_trd_unit_rnd_typ();
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			return unschd_base_unit_cd();
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			return unschd_base_unit_nm();
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_base_unit_conv_rnd_typ();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_usr_dpt_cd.equalsIgnoreCase(name)) {
			return act_usr_dpt_cd();
		}
		if ($act_usr_dpt_nm.equalsIgnoreCase(name)) {
			return act_usr_dpt_nm();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			return mfg_act_sub_char1();
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			return mfg_act_sub_char2();
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			return mfg_act_sub_char3();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			return rtn_sts_typ_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg.equalsIgnoreCase(name)) {
			return msg();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			return unschd_mst_yield_schd_qty();
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			return unschd_mst_mfg_inst_qty();
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return unschd_mst_fxd_rqmt_qty();
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			return unschd_conv_base_qty();
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			return unschd_conv_qty();
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_trd_unit_dec_place();
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return unschd_trd_unit_yield_act_qty();
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_base_unit_dec_place();
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return unschd_base_unit_yield_act_qty();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			return end_ac_dt();
		}
		if ($unschd_master_dt.equalsIgnoreCase(name)) {
			return unschd_master_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($unschd_mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_tgt_flg();
		}
		if ($unschd_mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_cd_none_flg();
		}
		if ($unschd_ln_stk_flg.equalsIgnoreCase(name)) {
			return unschd_ln_stk_flg();
		}
		if ($unschd_no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return unschd_no_mfg_aprv_flg();
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_tgt_flg();
		}
		if ($unschd_strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_cd_none_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		if ($unschd_itm_cd.equalsIgnoreCase(name)) {
			return unschd_itm_cd();
		}
		if ($unschd_itm_sub1.equalsIgnoreCase(name)) {
			return unschd_itm_sub1();
		}
		if ($unschd_itm_sub2.equalsIgnoreCase(name)) {
			return unschd_itm_sub2();
		}
		if ($unschd_itm_sub3.equalsIgnoreCase(name)) {
			return unschd_itm_sub3();
		}
		if ($unschd_itm_nm.equalsIgnoreCase(name)) {
			return unschd_itm_nm();
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_lot_mng_typ();
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			return unschd_lot_no_typ();
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_lot_no_ptn_cd();
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_mng_typ();
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_no_typ();
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_sublot_no_ptn_cd();
		}
		if ($unschd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno1_mng_typ();
		}
		if ($unschd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno2_mng_typ();
		}
		if ($unschd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno3_mng_typ();
		}
		if ($unschd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno4_mng_typ();
		}
		if ($unschd_mfg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_cd();
		}
		if ($unschd_mfg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_nm();
		}
		if ($unschd_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_cd();
		}
		if ($unschd_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_nm();
		}
		if ($unschd_sppl_cd.equalsIgnoreCase(name)) {
			return unschd_sppl_cd();
		}
		if ($unschd_mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_site_cd();
		}
		if ($unschd_mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_site_nm();
		}
		if ($unschd_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_wg_cd();
		}
		if ($unschd_mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_wg_nm();
		}
		if ($unschd_bom_ptn.equalsIgnoreCase(name)) {
			return unschd_bom_ptn();
		}
		if ($unschd_lot_issue_typ.equalsIgnoreCase(name)) {
			return unschd_lot_issue_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_strg_loc_cd();
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_strg_loc_nm();
		}
		if ($unschd_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_cd();
		}
		if ($unschd_strg_str_ln_nm.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_nm();
		}
		if ($unschd_oper_ptn.equalsIgnoreCase(name)) {
			return unschd_oper_ptn();
		}
		if ($unschd_lot_no.equalsIgnoreCase(name)) {
			return unschd_lot_no();
		}
		if ($unschd_sublot_no.equalsIgnoreCase(name)) {
			return unschd_sublot_no();
		}
		if ($unschd_sno1.equalsIgnoreCase(name)) {
			return unschd_sno1();
		}
		if ($unschd_sno2.equalsIgnoreCase(name)) {
			return unschd_sno2();
		}
		if ($unschd_sno3.equalsIgnoreCase(name)) {
			return unschd_sno3();
		}
		if ($unschd_sno4.equalsIgnoreCase(name)) {
			return unschd_sno4();
		}
		if ($unschd_wrk_no.equalsIgnoreCase(name)) {
			return unschd_wrk_no();
		}
		if ($unschd_wrk_nm.equalsIgnoreCase(name)) {
			return unschd_wrk_nm();
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			return unschd_trd_unit_cd();
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			return unschd_trd_unit_nm();
		}
		if ($unschd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_trd_unit_rnd_typ();
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			return unschd_base_unit_cd();
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			return unschd_base_unit_nm();
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_base_unit_conv_rnd_typ();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_usr_dpt_cd.equalsIgnoreCase(name)) {
			return act_usr_dpt_cd();
		}
		if ($act_usr_dpt_nm.equalsIgnoreCase(name)) {
			return act_usr_dpt_nm();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			return mfg_act_sub_char1();
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			return mfg_act_sub_char2();
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			return mfg_act_sub_char3();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			return rtn_sts_typ_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg.equalsIgnoreCase(name)) {
			return msg();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			return unschd_mst_yield_schd_qty();
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			return unschd_mst_mfg_inst_qty();
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return unschd_mst_fxd_rqmt_qty();
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			return unschd_conv_base_qty();
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			return unschd_conv_qty();
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_trd_unit_dec_place();
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return unschd_trd_unit_yield_act_qty();
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_base_unit_dec_place();
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return unschd_base_unit_yield_act_qty();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			return end_ac_dt();
		}
		if ($unschd_master_dt.equalsIgnoreCase(name)) {
			return unschd_master_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($unschd_mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_tgt_flg();
		}
		if ($unschd_mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_cd_none_flg();
		}
		if ($unschd_ln_stk_flg.equalsIgnoreCase(name)) {
			return unschd_ln_stk_flg();
		}
		if ($unschd_no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return unschd_no_mfg_aprv_flg();
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_tgt_flg();
		}
		if ($unschd_strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_cd_none_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		if ($unschd_itm_cd.equalsIgnoreCase(name)) {
			unschd_itm_cd(value);
			return;
		}
		if ($unschd_itm_sub1.equalsIgnoreCase(name)) {
			unschd_itm_sub1(value);
			return;
		}
		if ($unschd_itm_sub2.equalsIgnoreCase(name)) {
			unschd_itm_sub2(value);
			return;
		}
		if ($unschd_itm_sub3.equalsIgnoreCase(name)) {
			unschd_itm_sub3(value);
			return;
		}
		if ($unschd_itm_nm.equalsIgnoreCase(name)) {
			unschd_itm_nm(value);
			return;
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			unschd_lot_mng_typ(value);
			return;
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			unschd_lot_no_typ(value);
			return;
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_lot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			unschd_sublot_mng_typ(value);
			return;
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			unschd_sublot_no_typ(value);
			return;
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_sublot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sno1_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno1_mng_typ(value);
			return;
		}
		if ($unschd_sno2_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno2_mng_typ(value);
			return;
		}
		if ($unschd_sno3_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno3_mng_typ(value);
			return;
		}
		if ($unschd_sno4_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno4_mng_typ(value);
			return;
		}
		if ($unschd_mfg_loc_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_cd(value);
			return;
		}
		if ($unschd_mfg_loc_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_nm(value);
			return;
		}
		if ($unschd_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_cd(value);
			return;
		}
		if ($unschd_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_nm(value);
			return;
		}
		if ($unschd_sppl_cd.equalsIgnoreCase(name)) {
			unschd_sppl_cd(value);
			return;
		}
		if ($unschd_mfg_loc_site_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_site_cd(value);
			return;
		}
		if ($unschd_mfg_loc_site_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_site_nm(value);
			return;
		}
		if ($unschd_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_wg_cd(value);
			return;
		}
		if ($unschd_mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_wg_nm(value);
			return;
		}
		if ($unschd_bom_ptn.equalsIgnoreCase(name)) {
			unschd_bom_ptn(value);
			return;
		}
		if ($unschd_lot_issue_typ.equalsIgnoreCase(name)) {
			unschd_lot_issue_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			unschd_strg_loc_cd(value);
			return;
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			unschd_strg_loc_nm(value);
			return;
		}
		if ($unschd_strg_str_ln_cd.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_cd(value);
			return;
		}
		if ($unschd_strg_str_ln_nm.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_nm(value);
			return;
		}
		if ($unschd_oper_ptn.equalsIgnoreCase(name)) {
			unschd_oper_ptn(value);
			return;
		}
		if ($unschd_lot_no.equalsIgnoreCase(name)) {
			unschd_lot_no(value);
			return;
		}
		if ($unschd_sublot_no.equalsIgnoreCase(name)) {
			unschd_sublot_no(value);
			return;
		}
		if ($unschd_sno1.equalsIgnoreCase(name)) {
			unschd_sno1(value);
			return;
		}
		if ($unschd_sno2.equalsIgnoreCase(name)) {
			unschd_sno2(value);
			return;
		}
		if ($unschd_sno3.equalsIgnoreCase(name)) {
			unschd_sno3(value);
			return;
		}
		if ($unschd_sno4.equalsIgnoreCase(name)) {
			unschd_sno4(value);
			return;
		}
		if ($unschd_wrk_no.equalsIgnoreCase(name)) {
			unschd_wrk_no(value);
			return;
		}
		if ($unschd_wrk_nm.equalsIgnoreCase(name)) {
			unschd_wrk_nm(value);
			return;
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			unschd_trd_unit_cd(value);
			return;
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			unschd_trd_unit_nm(value);
			return;
		}
		if ($unschd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			unschd_trd_unit_rnd_typ(value);
			return;
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			unschd_base_unit_cd(value);
			return;
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			unschd_base_unit_nm(value);
			return;
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_base_unit_conv_rnd_typ(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_usr_dpt_cd.equalsIgnoreCase(name)) {
			act_usr_dpt_cd(value);
			return;
		}
		if ($act_usr_dpt_nm.equalsIgnoreCase(name)) {
			act_usr_dpt_nm(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			mfg_act_sub_char1(value);
			return;
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			mfg_act_sub_char2(value);
			return;
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			mfg_act_sub_char3(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			rtn_sts_typ_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg.equalsIgnoreCase(name)) {
			msg(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
			return;
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			end_ac_dt(value);
			return;
		}
		if ($unschd_master_dt.equalsIgnoreCase(name)) {
			unschd_master_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($unschd_mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_cd_none_flg(value);
			return;
		}
		if ($unschd_ln_stk_flg.equalsIgnoreCase(name)) {
			unschd_ln_stk_flg(value);
			return;
		}
		if ($unschd_no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			unschd_no_mfg_aprv_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_cd_none_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		if ($unschd_itm_cd.equalsIgnoreCase(name)) {
			unschd_itm_cd(value);
			return;
		}
		if ($unschd_itm_sub1.equalsIgnoreCase(name)) {
			unschd_itm_sub1(value);
			return;
		}
		if ($unschd_itm_sub2.equalsIgnoreCase(name)) {
			unschd_itm_sub2(value);
			return;
		}
		if ($unschd_itm_sub3.equalsIgnoreCase(name)) {
			unschd_itm_sub3(value);
			return;
		}
		if ($unschd_itm_nm.equalsIgnoreCase(name)) {
			unschd_itm_nm(value);
			return;
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			unschd_lot_mng_typ(value);
			return;
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			unschd_lot_no_typ(value);
			return;
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_lot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			unschd_sublot_mng_typ(value);
			return;
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			unschd_sublot_no_typ(value);
			return;
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_sublot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sno1_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno1_mng_typ(value);
			return;
		}
		if ($unschd_sno2_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno2_mng_typ(value);
			return;
		}
		if ($unschd_sno3_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno3_mng_typ(value);
			return;
		}
		if ($unschd_sno4_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno4_mng_typ(value);
			return;
		}
		if ($unschd_mfg_loc_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_cd(value);
			return;
		}
		if ($unschd_mfg_loc_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_nm(value);
			return;
		}
		if ($unschd_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_cd(value);
			return;
		}
		if ($unschd_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_nm(value);
			return;
		}
		if ($unschd_sppl_cd.equalsIgnoreCase(name)) {
			unschd_sppl_cd(value);
			return;
		}
		if ($unschd_mfg_loc_site_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_site_cd(value);
			return;
		}
		if ($unschd_mfg_loc_site_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_site_nm(value);
			return;
		}
		if ($unschd_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_wg_cd(value);
			return;
		}
		if ($unschd_mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_wg_nm(value);
			return;
		}
		if ($unschd_bom_ptn.equalsIgnoreCase(name)) {
			unschd_bom_ptn(value);
			return;
		}
		if ($unschd_lot_issue_typ.equalsIgnoreCase(name)) {
			unschd_lot_issue_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			unschd_strg_loc_cd(value);
			return;
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			unschd_strg_loc_nm(value);
			return;
		}
		if ($unschd_strg_str_ln_cd.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_cd(value);
			return;
		}
		if ($unschd_strg_str_ln_nm.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_nm(value);
			return;
		}
		if ($unschd_oper_ptn.equalsIgnoreCase(name)) {
			unschd_oper_ptn(value);
			return;
		}
		if ($unschd_lot_no.equalsIgnoreCase(name)) {
			unschd_lot_no(value);
			return;
		}
		if ($unschd_sublot_no.equalsIgnoreCase(name)) {
			unschd_sublot_no(value);
			return;
		}
		if ($unschd_sno1.equalsIgnoreCase(name)) {
			unschd_sno1(value);
			return;
		}
		if ($unschd_sno2.equalsIgnoreCase(name)) {
			unschd_sno2(value);
			return;
		}
		if ($unschd_sno3.equalsIgnoreCase(name)) {
			unschd_sno3(value);
			return;
		}
		if ($unschd_sno4.equalsIgnoreCase(name)) {
			unschd_sno4(value);
			return;
		}
		if ($unschd_wrk_no.equalsIgnoreCase(name)) {
			unschd_wrk_no(value);
			return;
		}
		if ($unschd_wrk_nm.equalsIgnoreCase(name)) {
			unschd_wrk_nm(value);
			return;
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			unschd_trd_unit_cd(value);
			return;
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			unschd_trd_unit_nm(value);
			return;
		}
		if ($unschd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			unschd_trd_unit_rnd_typ(value);
			return;
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			unschd_base_unit_cd(value);
			return;
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			unschd_base_unit_nm(value);
			return;
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_base_unit_conv_rnd_typ(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_usr_dpt_cd.equalsIgnoreCase(name)) {
			act_usr_dpt_cd(value);
			return;
		}
		if ($act_usr_dpt_nm.equalsIgnoreCase(name)) {
			act_usr_dpt_nm(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			mfg_act_sub_char1(value);
			return;
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			mfg_act_sub_char2(value);
			return;
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			mfg_act_sub_char3(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			rtn_sts_typ_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg.equalsIgnoreCase(name)) {
			msg(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
			return;
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			end_ac_dt(value);
			return;
		}
		if ($unschd_master_dt.equalsIgnoreCase(name)) {
			unschd_master_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($unschd_mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_cd_none_flg(value);
			return;
		}
		if ($unschd_ln_stk_flg.equalsIgnoreCase(name)) {
			unschd_ln_stk_flg(value);
			return;
		}
		if ($unschd_no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			unschd_no_mfg_aprv_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_cd_none_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

