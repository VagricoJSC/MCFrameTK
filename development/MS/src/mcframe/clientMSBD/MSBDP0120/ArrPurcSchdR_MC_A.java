package mcframe.clientMSBD.MSBDP0120;

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
 * ブロック"ArrPurcSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrPurcSchdR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Cancel remaining receipt 入荷打切.<p>
	 *
	 */
	public static final String $arr_abort_flg = "arr_abort_flg";
	/**
	 * Cancel remaining purchase 仕入打切.<p>
	 *
	 */
	public static final String $purc_abort_flg = "purc_abort_flg";
	/**
	 * Cancel remaining receipt progress 入荷進捗打切.<p>
	 *
	 */
	public static final String $arr_pr_abort_flg = "arr_pr_abort_flg";
	/**
	 * Item 品目.<p>
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
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $arr_loc_cd = "arr_loc_cd";
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public static final String $arr_loc_nm = "arr_loc_nm";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public static final String $arr_schd_dt = "arr_schd_dt";
	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public static final String $arr_schd_hm = "arr_schd_hm";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	public static final String $schd_qty_p = "schd_qty_p";
	public static final String $purc_schd_qty_p = "purc_schd_qty_p";
	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public static final String $schd_unit_cd = "schd_unit_cd";
	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public static final String $schd_unit_nm = "schd_unit_nm";
	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public static final String $schd_unit_conv_base_qty = "schd_unit_conv_base_qty";
	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public static final String $schd_unit_conv_qty = "schd_unit_conv_qty";
	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public static final String $schd_unit_dec_place = "schd_unit_dec_place";
	/**
	 * Schedule unit rounding type 予定単位端数処理区分.<p>
	 *
	 */
	public static final String $schd_unit_rnd_typ = "schd_unit_rnd_typ";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $base_unit_purc_schd_qty_p = "base_unit_purc_schd_qty_p";
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
	public static final String $rcpt_iv_qty_p = "rcpt_iv_qty_p";
	public static final String $arr_act_qty_p = "arr_act_qty_p";
	public static final String $arr_act_abort_qty_p = "arr_act_abort_qty_p";
	public static final String $purc_act_qty_p = "purc_act_qty_p";
	public static final String $purc_abort_qty_p = "purc_abort_qty_p";
	public static final String $accpt_dfct_qty_p = "accpt_dfct_qty_p";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public static final String $arr_cmpl_flg = "arr_cmpl_flg";
	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public static final String $purc_cmpl_flg = "purc_cmpl_flg";
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public static final String $arr_skip_flg = "arr_skip_flg";
	/**
	 * Not for purchase 仕入対象外.<p>
	 *
	 */
	public static final String $non_purc_flg = "non_purc_flg";
	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public static final String $rcpt_iv_cmpl_flg = "rcpt_iv_cmpl_flg";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_d_no = "rcpt_iv_d_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_d_no = "prms_rcpt_d_no";
	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_d_no = "dlv_inst_d_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_mng_no = "dlv_slip_mng_no";
	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public static final String $dlv_slip_mng_seq = "dlv_slip_mng_seq";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public static final String $dlv_slip_d_seq = "dlv_slip_d_seq";
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_no = "purc_ddlv_dlv_slip_no";
	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_seq = "purc_ddlv_dlv_slip_seq";
	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_rev = "purc_ddlv_dlv_slip_rev";
	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_d_no = "purc_ddlv_dlv_slip_d_no";
	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public static final String $dlv_slip_d_rmrks = "dlv_slip_d_rmrks";
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
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";

	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $arr_schd_qty = $schd_qty_p + ".qty";
	public static final String $purc_schd_qty = $purc_schd_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $base_unit_purc_schd_qty = $base_unit_purc_schd_qty_p + ".qty";
	public static final String $rcpt_iv_qty = $rcpt_iv_qty_p + ".qty";
	public static final String $arr_qty = $arr_act_qty_p + ".qty";
	public static final String $act_abort_qty = $arr_act_abort_qty_p + ".qty";
	public static final String $purc_act_qty = $purc_act_qty_p + ".qty";
	public static final String $purc_abort_qty = $purc_abort_qty_p + ".qty";
	public static final String $accpt_dfct_qty = $accpt_dfct_qty_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_abort_flg_META = createCommonMeta($arr_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_abort_flg_META = createCommonMeta($purc_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_pr_abort_flg_META = createCommonMeta($arr_pr_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta arr_loc_cd_META = createCommonMeta($arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta arr_loc_nm_META = createCommonMeta($arr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta arr_schd_dt_META = createCommonMeta($arr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_hm_META = createCommonMeta($arr_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_qty_p_META = createInnerRowMeta($schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_schd_qty_p_META = createInnerRowMeta($purc_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_unit_cd_META = createCommonMeta($schd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_unit_nm_META = createCommonMeta($schd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_unit_conv_base_qty_META = createCommonMeta($schd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_conv_qty_META = createCommonMeta($schd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_dec_place_META = createCommonMeta($schd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_unit_rnd_typ_META = createCommonMeta($schd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_purc_schd_qty_p_META = createInnerRowMeta($base_unit_purc_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rcpt_iv_qty_p_META = createInnerRowMeta($rcpt_iv_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta arr_act_qty_p_META = createInnerRowMeta($arr_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta arr_act_abort_qty_p_META = createInnerRowMeta($arr_act_abort_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_act_qty_p_META = createInnerRowMeta($purc_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_abort_qty_p_META = createInnerRowMeta($purc_abort_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta accpt_dfct_qty_p_META = createInnerRowMeta($accpt_dfct_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cmpl_flg_META = createCommonMeta($arr_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cmpl_flg_META = createCommonMeta($purc_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_purc_flg_META = createCommonMeta($non_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_cmpl_flg_META = createCommonMeta($rcpt_iv_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta prms_rcpt_d_no_META = createCommonMeta($prms_rcpt_d_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_D_NO);
	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.DLV_INST_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_mng_no_META = createCommonMeta($dlv_slip_mng_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_MNG_NO);
	public static final MCMeta dlv_slip_mng_seq_META = createCommonMeta($dlv_slip_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_d_seq_META = createCommonMeta($dlv_slip_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_ddlv_dlv_slip_no_META = createCommonMeta($purc_ddlv_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta purc_ddlv_dlv_slip_seq_META = createCommonMeta($purc_ddlv_dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_ddlv_dlv_slip_rev_META = createCommonMeta($purc_ddlv_dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_ddlv_dlv_slip_d_no_META = createCommonMeta($purc_ddlv_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_d_rmrks_META = createCommonMeta($dlv_slip_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<ArrPurcSchdR> constMetas = new ConstMetaList<ArrPurcSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			arr_abort_flg_META,
			purc_abort_flg_META,
			arr_pr_abort_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			lot_no_p_META,
			arr_schd_no_META,
			purc_schd_no_META,
			arr_loc_cd_META,
			arr_loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			bp_lot_no_META,
			arr_schd_dt_META,
			arr_schd_hm_META,
			purc_schd_dt_META,
			sync_flg_META,
			schd_qty_p_META,
			purc_schd_qty_p_META,
			schd_unit_cd_META,
			schd_unit_nm_META,
			schd_unit_conv_base_qty_META,
			schd_unit_conv_qty_META,
			schd_unit_dec_place_META,
			schd_unit_rnd_typ_META,
			base_unit_qty_p_META,
			base_unit_purc_schd_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			rcpt_iv_qty_p_META,
			arr_act_qty_p_META,
			arr_act_abort_qty_p_META,
			purc_act_qty_p_META,
			purc_abort_qty_p_META,
			accpt_dfct_qty_p_META,
			outsrc_flg_META,
			arr_cmpl_flg_META,
			purc_cmpl_flg_META,
			arr_skip_flg_META,
			non_purc_flg_META,
			rcpt_iv_cmpl_flg_META,
			po_d_no_META,
			rcpt_iv_no_META,
			rcpt_iv_d_no_META,
			mfg_inst_no_META,
			purc_act_d_no_META,
			prms_rcpt_d_no_META,
			dlv_inst_d_no_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			dlv_slip_mng_no_META,
			dlv_slip_mng_seq_META,
			dlv_slip_d_no_META,
			dlv_slip_d_seq_META,
			purc_ddlv_dlv_slip_no_META,
			purc_ddlv_dlv_slip_seq_META,
			purc_ddlv_dlv_slip_rev_META,
			purc_ddlv_dlv_slip_d_no_META,
			dlv_slip_d_rmrks_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			arr_pr_no_META,
			arr_pr_upd_cntr_META
		},
		new String[][]{
			{
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"arr_schd_qty",
				"purc_schd_qty",
				"base_unit_qty",
				"base_unit_purc_schd_qty",
				"rcpt_iv_qty",
				"arr_qty",
				"act_abort_qty",
				"purc_act_qty",
				"purc_abort_qty",
				"accpt_dfct_qty"
			},
			{
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$arr_schd_qty,
				$purc_schd_qty,
				$base_unit_qty,
				$base_unit_purc_schd_qty,
				$rcpt_iv_qty,
				$arr_qty,
				$act_abort_qty,
				$purc_act_qty,
				$purc_abort_qty,
				$accpt_dfct_qty
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$arr_schd_hm, "TM"},	// arr_schd_hm
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$base_unit_purc_schd_qty_p + ".qty", "BASE_UNIT"},	// base_unit_purc_schd_qty_p.qty
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"}	// base_unit_rnd_typ
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
	protected ArrPurcSchdR_MC_A(ConstMetaList<? extends ArrPurcSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrPurcSchdR clone() {
		return (ArrPurcSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrPurcSchdR createInstance() {
		return (ArrPurcSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrPurcSchdR getValues(String... names) {
		return (ArrPurcSchdR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Cancel remaining receipt 入荷打切.<p>
	 *
	 */
	public boolean arr_abort_flg() {
		return getConstBoolean(offset + 1, $arr_abort_flg);
	}

	/**
	 * Cancel remaining receipt 入荷打切.<p>
	 *
	 */
	public void arr_abort_flg(boolean value) {
		setConstBoolean(offset + 1, $arr_abort_flg, value);
	}


	/**
	 * Cancel remaining purchase 仕入打切.<p>
	 *
	 */
	public boolean purc_abort_flg() {
		return getConstBoolean(offset + 2, $purc_abort_flg);
	}

	/**
	 * Cancel remaining purchase 仕入打切.<p>
	 *
	 */
	public void purc_abort_flg(boolean value) {
		setConstBoolean(offset + 2, $purc_abort_flg, value);
	}


	/**
	 * Cancel remaining receipt progress 入荷進捗打切.<p>
	 *
	 */
	public boolean arr_pr_abort_flg() {
		return getConstBoolean(offset + 3, $arr_pr_abort_flg);
	}

	/**
	 * Cancel remaining receipt progress 入荷進捗打切.<p>
	 *
	 */
	public void arr_pr_abort_flg(boolean value) {
		setConstBoolean(offset + 3, $arr_pr_abort_flg, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 8, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 8, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 9, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 9, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 10, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 10, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 11, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 11, $sublot_no_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 12, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 12, $lot_no_p, row);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 13, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 13, $arr_schd_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 14, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 14, $purc_schd_no, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return getConstString(offset + 15, $arr_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		setConstString(offset + 15, $arr_loc_cd, value);
	}


	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public String arr_loc_nm() {
		return getConstString(offset + 16, $arr_loc_nm);
	}

	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public void arr_loc_nm(String value) {
		setConstString(offset + 16, $arr_loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 17, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 17, $str_ln_cd, value);
	}


	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 18, $str_ln_nm);
	}

	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 18, $str_ln_nm, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 19, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 19, $bp_lot_no, value);
	}


	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCDate arr_schd_dt() {
		return getConstDate(offset + 20, $arr_schd_dt);
	}

	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public void arr_schd_dt(MCDate value) {
		setConstDate(offset + 20, $arr_schd_dt, value);
	}


	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public MCDate arr_schd_hm() {
		return getConstDate(offset + 21, $arr_schd_hm);
	}

	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public void arr_schd_hm(MCDate value) {
		setConstDate(offset + 21, $arr_schd_hm, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 22, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 22, $purc_schd_dt, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 23, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 23, $sync_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $schd_qty_p);
	}
	
	public void schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $purc_schd_qty_p);
	}
	
	public void purc_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $purc_schd_qty_p, row);
	}


	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public String schd_unit_cd() {
		return getConstString(offset + 26, $schd_unit_cd);
	}

	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public void schd_unit_cd(String value) {
		setConstString(offset + 26, $schd_unit_cd, value);
	}


	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public String schd_unit_nm() {
		return getConstString(offset + 27, $schd_unit_nm);
	}

	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public void schd_unit_nm(String value) {
		setConstString(offset + 27, $schd_unit_nm, value);
	}


	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public MCNumber schd_unit_conv_base_qty() {
		return getConstNumber(offset + 28, $schd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 28, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 28, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 28, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 28, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 28, $schd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public MCNumber schd_unit_conv_qty() {
		return getConstNumber(offset + 29, $schd_unit_conv_qty);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 29, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(int value) {
		setConstNumber(offset + 29, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(long value) {
		setConstNumber(offset + 29, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(float value) {
		setConstNumber(offset + 29, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(double value) {
		setConstNumber(offset + 29, $schd_unit_conv_qty, value);
	}


	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_unit_dec_place() {
		return getConstNumber(offset + 30, $schd_unit_dec_place);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 30, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(int value) {
		setConstNumber(offset + 30, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(long value) {
		setConstNumber(offset + 30, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(float value) {
		setConstNumber(offset + 30, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(double value) {
		setConstNumber(offset + 30, $schd_unit_dec_place, value);
	}


	/**
	 * Schedule unit rounding type 予定単位端数処理区分.<p>
	 *
	 */
	public String schd_unit_rnd_typ() {
		return getConstString(offset + 31, $schd_unit_rnd_typ);
	}

	/**
	 * Schedule unit rounding type 予定単位端数処理区分.<p>
	 *
	 */
	public void schd_unit_rnd_typ(String value) {
		setConstString(offset + 31, $schd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_purc_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $base_unit_purc_schd_qty_p);
	}
	
	public void base_unit_purc_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $base_unit_purc_schd_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 34, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 34, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 35, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 35, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 36, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 37, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 37, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rcpt_iv_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $rcpt_iv_qty_p);
	}
	
	public void rcpt_iv_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $rcpt_iv_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR arr_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $arr_act_qty_p);
	}
	
	public void arr_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $arr_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR arr_act_abort_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $arr_act_abort_qty_p);
	}
	
	public void arr_act_abort_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $arr_act_abort_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 41, $purc_act_qty_p);
	}
	
	public void purc_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 41, $purc_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_abort_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $purc_abort_qty_p);
	}
	
	public void purc_abort_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $purc_abort_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR accpt_dfct_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $accpt_dfct_qty_p);
	}
	
	public void accpt_dfct_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $accpt_dfct_qty_p, row);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 44, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 44, $outsrc_flg, value);
	}


	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public boolean arr_cmpl_flg() {
		return getConstBoolean(offset + 45, $arr_cmpl_flg);
	}

	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public void arr_cmpl_flg(boolean value) {
		setConstBoolean(offset + 45, $arr_cmpl_flg, value);
	}


	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return getConstBoolean(offset + 46, $purc_cmpl_flg);
	}

	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		setConstBoolean(offset + 46, $purc_cmpl_flg, value);
	}


	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 47, $arr_skip_flg);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 47, $arr_skip_flg, value);
	}


	/**
	 * Not for purchase 仕入対象外.<p>
	 *
	 */
	public boolean non_purc_flg() {
		return getConstBoolean(offset + 48, $non_purc_flg);
	}

	/**
	 * Not for purchase 仕入対象外.<p>
	 *
	 */
	public void non_purc_flg(boolean value) {
		setConstBoolean(offset + 48, $non_purc_flg, value);
	}


	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public boolean rcpt_iv_cmpl_flg() {
		return getConstBoolean(offset + 49, $rcpt_iv_cmpl_flg);
	}

	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public void rcpt_iv_cmpl_flg(boolean value) {
		setConstBoolean(offset + 49, $rcpt_iv_cmpl_flg, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 50, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 50, $po_d_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 51, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 51, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 52, $rcpt_iv_d_no);
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 52, $rcpt_iv_d_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 53, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 53, $mfg_inst_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 54, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 54, $purc_act_d_no, value);
	}


	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_d_no() {
		return getConstString(offset + 55, $prms_rcpt_d_no);
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_d_no(String value) {
		setConstString(offset + 55, $prms_rcpt_d_no, value);
	}


	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 56, $dlv_inst_d_no);
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 56, $dlv_inst_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 57, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 57, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 58, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 58, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 58, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 58, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 58, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 58, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 59, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 59, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 59, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 59, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 59, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 59, $dlv_slip_rev, value);
	}


	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return getConstString(offset + 60, $dlv_slip_mng_no);
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		setConstString(offset + 60, $dlv_slip_mng_no, value);
	}


	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return getConstNumber(offset + 61, $dlv_slip_mng_seq);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		setConstNumber(offset + 61, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		setConstNumber(offset + 61, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		setConstNumber(offset + 61, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		setConstNumber(offset + 61, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		setConstNumber(offset + 61, $dlv_slip_mng_seq, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 62, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 62, $dlv_slip_d_no, value);
	}


	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public MCNumber dlv_slip_d_seq() {
		return getConstNumber(offset + 63, $dlv_slip_d_seq);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(MCNumber value) {
		setConstNumber(offset + 63, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(int value) {
		setConstNumber(offset + 63, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(long value) {
		setConstNumber(offset + 63, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(float value) {
		setConstNumber(offset + 63, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(double value) {
		setConstNumber(offset + 63, $dlv_slip_d_seq, value);
	}


	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_no() {
		return getConstString(offset + 64, $purc_ddlv_dlv_slip_no);
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_no(String value) {
		setConstString(offset + 64, $purc_ddlv_dlv_slip_no, value);
	}


	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public MCNumber purc_ddlv_dlv_slip_seq() {
		return getConstNumber(offset + 65, $purc_ddlv_dlv_slip_seq);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(int value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(long value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(float value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(double value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_seq, value);
	}


	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public MCNumber purc_ddlv_dlv_slip_rev() {
		return getConstNumber(offset + 66, $purc_ddlv_dlv_slip_rev);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 66, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(int value) {
		setConstNumber(offset + 66, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(long value) {
		setConstNumber(offset + 66, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(float value) {
		setConstNumber(offset + 66, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(double value) {
		setConstNumber(offset + 66, $purc_ddlv_dlv_slip_rev, value);
	}


	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_d_no() {
		return getConstString(offset + 67, $purc_ddlv_dlv_slip_d_no);
	}

	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_d_no(String value) {
		setConstString(offset + 67, $purc_ddlv_dlv_slip_d_no, value);
	}


	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return getConstString(offset + 68, $dlv_slip_d_rmrks);
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		setConstString(offset + 68, $dlv_slip_d_rmrks, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 69, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 69, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 70, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 70, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 71, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 71, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 72, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 72, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 73, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 73, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 74, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 74, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 75, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 75, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 76, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 76, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 77, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 77, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 78, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 78, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 79, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 79, $upd_srv_req_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 80, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 80, $arr_pr_no, value);
	}


	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 81, $arr_pr_upd_cntr);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 81, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 81, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 81, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 81, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 81, $arr_pr_upd_cntr, value);
	}


	public String getString(String name) {
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			return arr_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			return schd_unit_nm();
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_unit_rnd_typ();
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			return prms_rcpt_d_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
		}
		if ($purc_ddlv_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_d_no();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_base_qty();
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_seq();
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_rev();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($arr_schd_hm.equalsIgnoreCase(name)) {
			return arr_schd_hm();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($arr_abort_flg.equalsIgnoreCase(name)) {
			return arr_abort_flg();
		}
		if ($purc_abort_flg.equalsIgnoreCase(name)) {
			return purc_abort_flg();
		}
		if ($arr_pr_abort_flg.equalsIgnoreCase(name)) {
			return arr_pr_abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_cmpl_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($rcpt_iv_cmpl_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_cmpl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			return arr_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			return schd_unit_nm();
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_unit_rnd_typ();
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			return prms_rcpt_d_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
		}
		if ($purc_ddlv_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_d_no();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_base_qty();
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_seq();
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_rev();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($arr_schd_hm.equalsIgnoreCase(name)) {
			return arr_schd_hm();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($arr_abort_flg.equalsIgnoreCase(name)) {
			return arr_abort_flg();
		}
		if ($purc_abort_flg.equalsIgnoreCase(name)) {
			return purc_abort_flg();
		}
		if ($arr_pr_abort_flg.equalsIgnoreCase(name)) {
			return arr_pr_abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_cmpl_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($rcpt_iv_cmpl_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_cmpl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			arr_loc_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			schd_unit_cd(value);
			return;
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			schd_unit_nm(value);
			return;
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_unit_rnd_typ(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			prms_rcpt_d_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_d_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_d_no(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($arr_schd_hm.equalsIgnoreCase(name)) {
			arr_schd_hm(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($arr_abort_flg.equalsIgnoreCase(name)) {
			arr_abort_flg(value);
			return;
		}
		if ($purc_abort_flg.equalsIgnoreCase(name)) {
			purc_abort_flg(value);
			return;
		}
		if ($arr_pr_abort_flg.equalsIgnoreCase(name)) {
			arr_pr_abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			arr_cmpl_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($rcpt_iv_cmpl_flg.equalsIgnoreCase(name)) {
			rcpt_iv_cmpl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			arr_loc_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			schd_unit_cd(value);
			return;
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			schd_unit_nm(value);
			return;
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_unit_rnd_typ(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			prms_rcpt_d_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_d_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_d_no(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($arr_schd_hm.equalsIgnoreCase(name)) {
			arr_schd_hm(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($arr_abort_flg.equalsIgnoreCase(name)) {
			arr_abort_flg(value);
			return;
		}
		if ($purc_abort_flg.equalsIgnoreCase(name)) {
			purc_abort_flg(value);
			return;
		}
		if ($arr_pr_abort_flg.equalsIgnoreCase(name)) {
			arr_pr_abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			arr_cmpl_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($rcpt_iv_cmpl_flg.equalsIgnoreCase(name)) {
			rcpt_iv_cmpl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($schd_qty_p.equalsIgnoreCase(name)) {
			return schd_qty_p();
		}
		if ($purc_schd_qty_p.equalsIgnoreCase(name)) {
			return purc_schd_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($base_unit_purc_schd_qty_p.equalsIgnoreCase(name)) {
			return base_unit_purc_schd_qty_p();
		}
		if ($rcpt_iv_qty_p.equalsIgnoreCase(name)) {
			return rcpt_iv_qty_p();
		}
		if ($arr_act_qty_p.equalsIgnoreCase(name)) {
			return arr_act_qty_p();
		}
		if ($arr_act_abort_qty_p.equalsIgnoreCase(name)) {
			return arr_act_abort_qty_p();
		}
		if ($purc_act_qty_p.equalsIgnoreCase(name)) {
			return purc_act_qty_p();
		}
		if ($purc_abort_qty_p.equalsIgnoreCase(name)) {
			return purc_abort_qty_p();
		}
		if ($accpt_dfct_qty_p.equalsIgnoreCase(name)) {
			return accpt_dfct_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($schd_qty_p.equalsIgnoreCase(name)) {
			schd_qty_p(
				((MCContainerMeta) schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_schd_qty_p.equalsIgnoreCase(name)) {
			purc_schd_qty_p(
				((MCContainerMeta) purc_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_purc_schd_qty_p.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty_p(
				((MCContainerMeta) base_unit_purc_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rcpt_iv_qty_p.equalsIgnoreCase(name)) {
			rcpt_iv_qty_p(
				((MCContainerMeta) rcpt_iv_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($arr_act_qty_p.equalsIgnoreCase(name)) {
			arr_act_qty_p(
				((MCContainerMeta) arr_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($arr_act_abort_qty_p.equalsIgnoreCase(name)) {
			arr_act_abort_qty_p(
				((MCContainerMeta) arr_act_abort_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_act_qty_p.equalsIgnoreCase(name)) {
			purc_act_qty_p(
				((MCContainerMeta) purc_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_abort_qty_p.equalsIgnoreCase(name)) {
			purc_abort_qty_p(
				((MCContainerMeta) purc_abort_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($accpt_dfct_qty_p.equalsIgnoreCase(name)) {
			accpt_dfct_qty_p(
				((MCContainerMeta) accpt_dfct_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	public String lot_no() {
		return lot_no_p().lot_no();
	}

	public void lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	public String sublot_no() {
		return lot_no_p().sublot_no();
	}

	public void sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public MCNumber arr_schd_qty() {
		return schd_qty_p().qty();
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(MCNumber value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(int value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(long value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(float value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(double value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public MCNumber purc_schd_qty() {
		return purc_schd_qty_p().qty();
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(MCNumber value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(int value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(long value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(float value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(double value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_schd_qty() {
		return base_unit_purc_schd_qty_p().qty();
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(MCNumber value) {
		base_unit_purc_schd_qty_p().qty(value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(int value) {
		base_unit_purc_schd_qty_p().qty(value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(long value) {
		base_unit_purc_schd_qty_p().qty(value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(float value) {
		base_unit_purc_schd_qty_p().qty(value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(double value) {
		base_unit_purc_schd_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public MCNumber rcpt_iv_qty() {
		return rcpt_iv_qty_p().qty();
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(MCNumber value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(int value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(long value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(float value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(double value) {
		rcpt_iv_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return arr_act_qty_p().qty();
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		arr_act_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		arr_act_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		arr_act_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		arr_act_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		arr_act_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public MCNumber act_abort_qty() {
		return arr_act_abort_qty_p().qty();
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(MCNumber value) {
		arr_act_abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(int value) {
		arr_act_abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(long value) {
		arr_act_abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(float value) {
		arr_act_abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(double value) {
		arr_act_abort_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public MCNumber purc_act_qty() {
		return purc_act_qty_p().qty();
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(MCNumber value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(int value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(long value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(float value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(double value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public MCNumber purc_abort_qty() {
		return purc_abort_qty_p().qty();
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(MCNumber value) {
		purc_abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(int value) {
		purc_abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(long value) {
		purc_abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(float value) {
		purc_abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(double value) {
		purc_abort_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_qty() {
		return accpt_dfct_qty_p().qty();
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(MCNumber value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(int value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(long value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(float value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(double value) {
		accpt_dfct_qty_p().qty(value);
	}

}

