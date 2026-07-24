package mcframe.serverMSBC.MSBCL6050;

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
 * ブロック"MfgActReg_Upd01_DtlYield"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActReg_Upd01_DtlYieldR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Output pegging No. 出来高紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	/**
	 * Output qty. 出来高数.<p>
	 *
	 */
	public static final String $trd_unit_yield_act_qty = "trd_unit_yield_act_qty";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Base unit output qty. 基準単位出来高数.<p>
	 *
	 */
	public static final String $base_unit_yield_act_qty = "base_unit_yield_act_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public static final String $act_tm = "act_tm";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
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
	 * Same lot 同一ロット.<p>
	 *
	 */
	public static final String $same_lot_flg = "same_lot_flg";
	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public static final String $yield_rsn_cd = "yield_rsn_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public static final String $yield_rate = "yield_rate";
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $yield_act_intr_rmrks = "yield_act_intr_rmrks";
	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public static final String $yield_act_rpt_rmrks = "yield_act_rpt_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char1 = "yield_act_sub_char1";
	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char2 = "yield_act_sub_char2";
	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char3 = "yield_act_sub_char3";
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $yield_act_no = "yield_act_no";
	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public static final String $stk_lst_prnt_flg = "stk_lst_prnt_flg";
	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public static final String $mes_id = "mes_id";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $oper_disp_seq = "oper_disp_seq";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public static final String $itm_mfg_inst_qty = "itm_mfg_inst_qty";
	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public static final String $mfg_st_qty = "mfg_st_qty";
	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_lot_no = "mfg_inst_lot_no";
	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_sublot_no = "mfg_inst_sublot_no";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
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
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Output location cd. 出来高場所ＣＤ.<p>
	 *
	 */
	public static final String $yield_loc_cd = "yield_loc_cd";
	/**
	 * Output rack/line cd. 出来高棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $yield_str_ln_cd = "yield_str_ln_cd";
	/**
	 * Allow same sublot numbering 同一サブロット発番許可.<p>
	 *
	 */
	public static final String $sublot_ctl_flg = "sublot_ctl_flg";
	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public static final String $bkf_ctl_flg = "bkf_ctl_flg";
	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public static final String $not_stk_flg = "not_stk_flg";
	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public static final String $old_lot_no = "old_lot_no";
	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public static final String $old_sublot_no = "old_sublot_no";
	/**
	 * Output type before update 更新前出来高区分.<p>
	 *
	 */
	public static final String $old_yield_typ = "old_yield_typ";
	/**
	 * Base unit output qty. before update 更新前基準単位出来高数.<p>
	 *
	 */
	public static final String $old_base_unit_yield_act_qty = "old_base_unit_yield_act_qty";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_yield_act_no = "ext_yield_act_no";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta trd_unit_yield_act_qty_META = createCommonMeta($trd_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_yield_act_qty_META = createCommonMeta($base_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta act_tm_META = createCommonMeta($act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta same_lot_flg_META = createCommonMeta($same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_rsn_cd_META = createCommonMeta($yield_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta yield_rate_META = createCommonMeta($yield_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta yield_act_intr_rmrks_META = createCommonMeta($yield_act_intr_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_INTR_RMRKS);
	public static final MCMeta yield_act_rpt_rmrks_META = createCommonMeta($yield_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_RPT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta yield_act_sub_char1_META = createCommonMeta($yield_act_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR1);
	public static final MCMeta yield_act_sub_char2_META = createCommonMeta($yield_act_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR2);
	public static final MCMeta yield_act_sub_char3_META = createCommonMeta($yield_act_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR3);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta yield_act_no_META = createCommonMeta($yield_act_no, mcframe.commonMA.meta.MA_META.YIELD_ACT_NO);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_disp_seq_META = createCommonMeta($oper_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta itm_mfg_inst_qty_META = createCommonMeta($itm_mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_st_qty_META = createCommonMeta($mfg_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_lot_no_META = createCommonMeta($mfg_inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta mfg_inst_sublot_no_META = createCommonMeta($mfg_inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta yield_loc_cd_META = createCommonMeta($yield_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta yield_str_ln_cd_META = createCommonMeta($yield_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta sublot_ctl_flg_META = createCommonMeta($sublot_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bkf_ctl_flg_META = createCommonMeta($bkf_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_stk_flg_META = createCommonMeta($not_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_lot_no_META = createCommonMeta($old_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta old_sublot_no_META = createCommonMeta($old_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta old_yield_typ_META = createCommonMeta($old_yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta old_base_unit_yield_act_qty_META = createCommonMeta($old_base_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_yield_act_no_META = createCommonMeta($ext_yield_act_no, mcframe.commonMA.meta.MA_META.EXT_YIELD_ACT_NO);

	protected static final ConstMetaList<MfgActReg_Upd01_DtlYieldR> constMetas = new ConstMetaList<MfgActReg_Upd01_DtlYieldR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			err_flg_META,
			oper_inst_no_META,
			yield_typ_META,
			trd_unit_yield_act_qty_META,
			trd_unit_cd_META,
			base_unit_yield_act_qty_META,
			base_unit_cd_META,
			act_tm_META,
			ac_dt_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_META,
			sublot_no_META,
			same_lot_flg_META,
			yield_rsn_cd_META,
			gd_cd_META,
			strg_loc_cd_META,
			strg_str_ln_cd_META,
			yield_rate_META,
			insp_cnt_rmrks_META,
			yield_act_intr_rmrks_META,
			yield_act_rpt_rmrks_META,
			trd_rmrks_META,
			yield_act_sub_char1_META,
			yield_act_sub_char2_META,
			yield_act_sub_char3_META,
			yield_schd_no_META,
			yield_act_no_META,
			stk_lst_prnt_flg_META,
			mes_id_META,
			data_no_META,
			oper_cd_META,
			oper_disp_seq_META,
			itm_ord_no_META,
			can_ac_dt_META,
			pack_flg_META,
			mfg_inst_no_META,
			trd_cd_META,
			act_dpt_cd_META,
			act_usr_cd_META,
			itm_mfg_inst_qty_META,
			mfg_st_qty_META,
			mfg_inst_lot_no_META,
			mfg_inst_sublot_no_META,
			mfg_inst_unit_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			mfg_act_no_META,
			itm_mfg_inst_no_META,
			oper_act_no_META,
			div_seq_META,
			mfg_mtd_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			quality_typ_META,
			yield_loc_cd_META,
			yield_str_ln_cd_META,
			sublot_ctl_flg_META,
			bkf_ctl_flg_META,
			not_stk_flg_META,
			old_lot_no_META,
			old_sublot_no_META,
			old_yield_typ_META,
			old_base_unit_yield_act_qty_META,
			wg_cd_META,
			site_cd_META,
			abort_flg_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_yield_act_no_META
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
	protected MfgActReg_Upd01_DtlYieldR_MC_A(ConstMetaList<? extends MfgActReg_Upd01_DtlYieldR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd01_DtlYieldR clone() {
		return (MfgActReg_Upd01_DtlYieldR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd01_DtlYieldR createInstance() {
		return (MfgActReg_Upd01_DtlYieldR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd01_DtlYieldR getValues(String... names) {
		return (MfgActReg_Upd01_DtlYieldR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 2, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}


	/**
	 * Output pegging No. 出来高紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 3, $peg_no);
	}

	/**
	 * Output pegging No. 出来高紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Output pegging No. 出来高紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Output pegging No. 出来高紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Output pegging No. 出来高紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Output pegging No. 出来高紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 3, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 4, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 4, $err_flg, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 5, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 5, $oper_inst_no, value);
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 6, $yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 6, $yield_typ, value);
	}


	/**
	 * Output qty. 出来高数.<p>
	 *
	 */
	public MCNumber trd_unit_yield_act_qty() {
		return getConstNumber(offset + 7, $trd_unit_yield_act_qty);
	}

	/**
	 * Output qty. 出来高数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}

	/**
	 * Output qty. 出来高数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(int value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}

	/**
	 * Output qty. 出来高数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(long value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}

	/**
	 * Output qty. 出来高数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(float value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}

	/**
	 * Output qty. 出来高数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(double value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 8, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 8, $trd_unit_cd, value);
	}


	/**
	 * Base unit output qty. 基準単位出来高数.<p>
	 *
	 */
	public MCNumber base_unit_yield_act_qty() {
		return getConstNumber(offset + 9, $base_unit_yield_act_qty);
	}

	/**
	 * Base unit output qty. 基準単位出来高数.<p>
	 *
	 */
	public void base_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数.<p>
	 *
	 */
	public void base_unit_yield_act_qty(int value) {
		setConstNumber(offset + 9, $base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数.<p>
	 *
	 */
	public void base_unit_yield_act_qty(long value) {
		setConstNumber(offset + 9, $base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数.<p>
	 *
	 */
	public void base_unit_yield_act_qty(float value) {
		setConstNumber(offset + 9, $base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数.<p>
	 *
	 */
	public void base_unit_yield_act_qty(double value) {
		setConstNumber(offset + 9, $base_unit_yield_act_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 10, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 10, $base_unit_cd, value);
	}


	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return getConstDate(offset + 11, $act_tm);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		setConstDate(offset + 11, $act_tm, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 12, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 12, $ac_dt, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 13, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 13, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 14, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 14, $sublot_mng_typ, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 15, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 15, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 16, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 16, $sublot_no, value);
	}


	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public boolean same_lot_flg() {
		return getConstBoolean(offset + 17, $same_lot_flg);
	}

	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		setConstBoolean(offset + 17, $same_lot_flg, value);
	}


	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public String yield_rsn_cd() {
		return getConstString(offset + 18, $yield_rsn_cd);
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public void yield_rsn_cd(String value) {
		setConstString(offset + 18, $yield_rsn_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 19, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 19, $gd_cd, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 20, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 20, $strg_loc_cd, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 21, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 21, $strg_str_ln_cd, value);
	}


	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return getConstNumber(offset + 22, $yield_rate);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		setConstNumber(offset + 22, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(int value) {
		setConstNumber(offset + 22, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(long value) {
		setConstNumber(offset + 22, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(float value) {
		setConstNumber(offset + 22, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(double value) {
		setConstNumber(offset + 22, $yield_rate, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 23, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 23, $insp_cnt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String yield_act_intr_rmrks() {
		return getConstString(offset + 24, $yield_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void yield_act_intr_rmrks(String value) {
		setConstString(offset + 24, $yield_act_intr_rmrks, value);
	}


	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String yield_act_rpt_rmrks() {
		return getConstString(offset + 25, $yield_act_rpt_rmrks);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void yield_act_rpt_rmrks(String value) {
		setConstString(offset + 25, $yield_act_rpt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 26, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 26, $trd_rmrks, value);
	}


	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public String yield_act_sub_char1() {
		return getConstString(offset + 27, $yield_act_sub_char1);
	}

	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public void yield_act_sub_char1(String value) {
		setConstString(offset + 27, $yield_act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public String yield_act_sub_char2() {
		return getConstString(offset + 28, $yield_act_sub_char2);
	}

	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public void yield_act_sub_char2(String value) {
		setConstString(offset + 28, $yield_act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public String yield_act_sub_char3() {
		return getConstString(offset + 29, $yield_act_sub_char3);
	}

	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public void yield_act_sub_char3(String value) {
		setConstString(offset + 29, $yield_act_sub_char3, value);
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 30, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 30, $yield_schd_no, value);
	}


	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return getConstString(offset + 31, $yield_act_no);
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		setConstString(offset + 31, $yield_act_no, value);
	}


	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public boolean stk_lst_prnt_flg() {
		return getConstBoolean(offset + 32, $stk_lst_prnt_flg);
	}

	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public void stk_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 32, $stk_lst_prnt_flg, value);
	}


	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 33, $mes_id);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 33, $mes_id, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 34, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 34, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 34, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 34, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 34, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 34, $data_no, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 35, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 35, $oper_cd, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber oper_disp_seq() {
		return getConstNumber(offset + 36, $oper_disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(MCNumber value) {
		setConstNumber(offset + 36, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(int value) {
		setConstNumber(offset + 36, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(long value) {
		setConstNumber(offset + 36, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(float value) {
		setConstNumber(offset + 36, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(double value) {
		setConstNumber(offset + 36, $oper_disp_seq, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 37, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 37, $itm_ord_no, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 38, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 38, $can_ac_dt, value);
	}


	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 39, $pack_flg);
	}

	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 39, $pack_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 40, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 40, $mfg_inst_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 41, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 41, $trd_cd, value);
	}


	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 42, $act_dpt_cd);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 42, $act_dpt_cd, value);
	}


	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 43, $act_usr_cd);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 43, $act_usr_cd, value);
	}


	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public MCNumber itm_mfg_inst_qty() {
		return getConstNumber(offset + 44, $itm_mfg_inst_qty);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 44, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(int value) {
		setConstNumber(offset + 44, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(long value) {
		setConstNumber(offset + 44, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(float value) {
		setConstNumber(offset + 44, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(double value) {
		setConstNumber(offset + 44, $itm_mfg_inst_qty, value);
	}


	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public MCNumber mfg_st_qty() {
		return getConstNumber(offset + 45, $mfg_st_qty);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(MCNumber value) {
		setConstNumber(offset + 45, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(int value) {
		setConstNumber(offset + 45, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(long value) {
		setConstNumber(offset + 45, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(float value) {
		setConstNumber(offset + 45, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(double value) {
		setConstNumber(offset + 45, $mfg_st_qty, value);
	}


	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public String mfg_inst_lot_no() {
		return getConstString(offset + 46, $mfg_inst_lot_no);
	}

	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public void mfg_inst_lot_no(String value) {
		setConstString(offset + 46, $mfg_inst_lot_no, value);
	}


	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public String mfg_inst_sublot_no() {
		return getConstString(offset + 47, $mfg_inst_sublot_no);
	}

	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public void mfg_inst_sublot_no(String value) {
		setConstString(offset + 47, $mfg_inst_sublot_no, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 48, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 48, $mfg_inst_unit_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 49, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 49, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 50, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 50, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 51, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 51, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 52, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 52, $sno4_mng_typ, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 53, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 53, $mfg_act_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 54, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 54, $itm_mfg_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 55, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 55, $oper_act_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 56, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 56, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 56, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 56, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 56, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 56, $div_seq, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 57, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 57, $mfg_mtd_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 58, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 58, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 59, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 59, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 60, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 60, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 61, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 61, $itm_sub3, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 62, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 62, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 63, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 63, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 64, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 64, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 65, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 65, $sno4, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 66, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 66, $quality_typ, value);
	}


	/**
	 * Output location cd. 出来高場所ＣＤ.<p>
	 *
	 */
	public String yield_loc_cd() {
		return getConstString(offset + 67, $yield_loc_cd);
	}

	/**
	 * Output location cd. 出来高場所ＣＤ.<p>
	 *
	 */
	public void yield_loc_cd(String value) {
		setConstString(offset + 67, $yield_loc_cd, value);
	}


	/**
	 * Output rack/line cd. 出来高棚・ラインＣＤ.<p>
	 *
	 */
	public String yield_str_ln_cd() {
		return getConstString(offset + 68, $yield_str_ln_cd);
	}

	/**
	 * Output rack/line cd. 出来高棚・ラインＣＤ.<p>
	 *
	 */
	public void yield_str_ln_cd(String value) {
		setConstString(offset + 68, $yield_str_ln_cd, value);
	}


	/**
	 * Allow same sublot numbering 同一サブロット発番許可.<p>
	 *
	 */
	public boolean sublot_ctl_flg() {
		return getConstBoolean(offset + 69, $sublot_ctl_flg);
	}

	/**
	 * Allow same sublot numbering 同一サブロット発番許可.<p>
	 *
	 */
	public void sublot_ctl_flg(boolean value) {
		setConstBoolean(offset + 69, $sublot_ctl_flg, value);
	}


	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public boolean bkf_ctl_flg() {
		return getConstBoolean(offset + 70, $bkf_ctl_flg);
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public void bkf_ctl_flg(boolean value) {
		setConstBoolean(offset + 70, $bkf_ctl_flg, value);
	}


	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public boolean not_stk_flg() {
		return getConstBoolean(offset + 71, $not_stk_flg);
	}

	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public void not_stk_flg(boolean value) {
		setConstBoolean(offset + 71, $not_stk_flg, value);
	}


	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public String old_lot_no() {
		return getConstString(offset + 72, $old_lot_no);
	}

	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public void old_lot_no(String value) {
		setConstString(offset + 72, $old_lot_no, value);
	}


	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public String old_sublot_no() {
		return getConstString(offset + 73, $old_sublot_no);
	}

	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public void old_sublot_no(String value) {
		setConstString(offset + 73, $old_sublot_no, value);
	}


	/**
	 * Output type before update 更新前出来高区分.<p>
	 *
	 */
	public String old_yield_typ() {
		return getConstString(offset + 74, $old_yield_typ);
	}

	/**
	 * Output type before update 更新前出来高区分.<p>
	 *
	 */
	public void old_yield_typ(String value) {
		setConstString(offset + 74, $old_yield_typ, value);
	}


	/**
	 * Base unit output qty. before update 更新前基準単位出来高数.<p>
	 *
	 */
	public MCNumber old_base_unit_yield_act_qty() {
		return getConstNumber(offset + 75, $old_base_unit_yield_act_qty);
	}

	/**
	 * Base unit output qty. before update 更新前基準単位出来高数.<p>
	 *
	 */
	public void old_base_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 75, $old_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. before update 更新前基準単位出来高数.<p>
	 *
	 */
	public void old_base_unit_yield_act_qty(int value) {
		setConstNumber(offset + 75, $old_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. before update 更新前基準単位出来高数.<p>
	 *
	 */
	public void old_base_unit_yield_act_qty(long value) {
		setConstNumber(offset + 75, $old_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. before update 更新前基準単位出来高数.<p>
	 *
	 */
	public void old_base_unit_yield_act_qty(float value) {
		setConstNumber(offset + 75, $old_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. before update 更新前基準単位出来高数.<p>
	 *
	 */
	public void old_base_unit_yield_act_qty(double value) {
		setConstNumber(offset + 75, $old_base_unit_yield_act_qty, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 76, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 76, $wg_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 77, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 77, $site_cd, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 78, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 78, $abort_flg, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 79, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 79, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 80, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 80, $ext_sys_cd, value);
	}


	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public String ext_yield_act_no() {
		return getConstString(offset + 81, $ext_yield_act_no);
	}

	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public void ext_yield_act_no(String value) {
		setConstString(offset + 81, $ext_yield_act_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			return mfg_inst_lot_no();
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			return mfg_inst_sublot_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
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
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($yield_loc_cd.equalsIgnoreCase(name)) {
			return yield_loc_cd();
		}
		if ($yield_str_ln_cd.equalsIgnoreCase(name)) {
			return yield_str_ln_cd();
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			return old_lot_no();
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			return old_sublot_no();
		}
		if ($old_yield_typ.equalsIgnoreCase(name)) {
			return old_yield_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			return ext_yield_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_act_qty();
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_act_qty();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			return itm_mfg_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return old_base_unit_yield_act_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($sublot_ctl_flg.equalsIgnoreCase(name)) {
			return sublot_ctl_flg();
		}
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			return bkf_ctl_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			return mfg_inst_lot_no();
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			return mfg_inst_sublot_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
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
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($yield_loc_cd.equalsIgnoreCase(name)) {
			return yield_loc_cd();
		}
		if ($yield_str_ln_cd.equalsIgnoreCase(name)) {
			return yield_str_ln_cd();
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			return old_lot_no();
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			return old_sublot_no();
		}
		if ($old_yield_typ.equalsIgnoreCase(name)) {
			return old_yield_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			return ext_yield_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_act_qty();
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_act_qty();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			return itm_mfg_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return old_base_unit_yield_act_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($sublot_ctl_flg.equalsIgnoreCase(name)) {
			return sublot_ctl_flg();
		}
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			return bkf_ctl_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			mfg_inst_lot_no(value);
			return;
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			mfg_inst_sublot_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
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
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($yield_loc_cd.equalsIgnoreCase(name)) {
			yield_loc_cd(value);
			return;
		}
		if ($yield_str_ln_cd.equalsIgnoreCase(name)) {
			yield_str_ln_cd(value);
			return;
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			old_lot_no(value);
			return;
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			old_sublot_no(value);
			return;
		}
		if ($old_yield_typ.equalsIgnoreCase(name)) {
			old_yield_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			ext_yield_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($sublot_ctl_flg.equalsIgnoreCase(name)) {
			sublot_ctl_flg(value);
			return;
		}
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			bkf_ctl_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			mfg_inst_lot_no(value);
			return;
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			mfg_inst_sublot_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
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
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($yield_loc_cd.equalsIgnoreCase(name)) {
			yield_loc_cd(value);
			return;
		}
		if ($yield_str_ln_cd.equalsIgnoreCase(name)) {
			yield_str_ln_cd(value);
			return;
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			old_lot_no(value);
			return;
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			old_sublot_no(value);
			return;
		}
		if ($old_yield_typ.equalsIgnoreCase(name)) {
			old_yield_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			ext_yield_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		if ($base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			old_base_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($sublot_ctl_flg.equalsIgnoreCase(name)) {
			sublot_ctl_flg(value);
			return;
		}
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			bkf_ctl_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

