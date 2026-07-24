package mcframe.serverMSBD.MSBDL0120;

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
 * ブロック"Srch01_Dtl3"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Dtl3R_MC_A extends MCConstRow {

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
	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public static final String $arr_schd_qty = "arr_schd_qty";
	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public static final String $purc_schd_qty = "purc_schd_qty";
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
	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public static final String $base_unit_purc_schd_qty = "base_unit_purc_schd_qty";
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
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public static final String $rcpt_iv_qty = "rcpt_iv_qty";
	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public static final String $arr_qty = "arr_qty";
	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public static final String $act_abort_qty = "act_abort_qty";
	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public static final String $purc_act_qty = "purc_act_qty";
	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public static final String $purc_abort_qty = "purc_abort_qty";
	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public static final String $accpt_dfct_qty = "accpt_dfct_qty";
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
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_d_no = "prms_rcpt_d_no";
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
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_d_no = "dlv_inst_d_no";
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
	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public static final String $rcpt_iv_cmpl_flg = "rcpt_iv_cmpl_flg";


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
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
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
	public static final MCMeta arr_schd_qty_META = createCommonMeta($arr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_schd_qty_META = createCommonMeta($purc_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_cd_META = createCommonMeta($schd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_unit_nm_META = createCommonMeta($schd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_unit_conv_base_qty_META = createCommonMeta($schd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_conv_qty_META = createCommonMeta($schd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_dec_place_META = createCommonMeta($schd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_unit_rnd_typ_META = createCommonMeta($schd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_purc_schd_qty_META = createCommonMeta($base_unit_purc_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rcpt_iv_qty_META = createCommonMeta($rcpt_iv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_abort_qty_META = createCommonMeta($act_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_act_qty_META = createCommonMeta($purc_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_abort_qty_META = createCommonMeta($purc_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta accpt_dfct_qty_META = createCommonMeta($accpt_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cmpl_flg_META = createCommonMeta($arr_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cmpl_flg_META = createCommonMeta($purc_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_purc_flg_META = createCommonMeta($non_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta prms_rcpt_d_no_META = createCommonMeta($prms_rcpt_d_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_mng_no_META = createCommonMeta($dlv_slip_mng_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_MNG_NO);
	public static final MCMeta dlv_slip_mng_seq_META = createCommonMeta($dlv_slip_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_d_seq_META = createCommonMeta($dlv_slip_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.DLV_INST_D_NO);
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
	public static final MCMeta rcpt_iv_cmpl_flg_META = createCommonMeta($rcpt_iv_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_Dtl3R> constMetas = new ConstMetaList<Srch01_Dtl3R>(
		MCConstRow.constMetas,
		new MCMeta[]{
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
			lot_no_META,
			sublot_no_META,
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
			arr_schd_qty_META,
			purc_schd_qty_META,
			schd_unit_cd_META,
			schd_unit_nm_META,
			schd_unit_conv_base_qty_META,
			schd_unit_conv_qty_META,
			schd_unit_dec_place_META,
			schd_unit_rnd_typ_META,
			base_unit_qty_META,
			base_unit_purc_schd_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			rcpt_iv_qty_META,
			arr_qty_META,
			act_abort_qty_META,
			purc_act_qty_META,
			purc_abort_qty_META,
			accpt_dfct_qty_META,
			outsrc_flg_META,
			arr_cmpl_flg_META,
			purc_cmpl_flg_META,
			arr_skip_flg_META,
			non_purc_flg_META,
			po_d_no_META,
			rcpt_iv_no_META,
			rcpt_iv_d_no_META,
			mfg_inst_no_META,
			purc_act_d_no_META,
			prms_rcpt_d_no_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			dlv_slip_mng_no_META,
			dlv_slip_mng_seq_META,
			dlv_slip_d_no_META,
			dlv_slip_d_seq_META,
			dlv_inst_d_no_META,
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
			arr_pr_upd_cntr_META,
			rcpt_iv_cmpl_flg_META
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
	protected Srch01_Dtl3R_MC_A(ConstMetaList<? extends Srch01_Dtl3R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl3R clone() {
		return (Srch01_Dtl3R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl3R createInstance() {
		return (Srch01_Dtl3R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl3R getValues(String... names) {
		return (Srch01_Dtl3R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Cancel remaining receipt 入荷打切.<p>
	 *
	 */
	public boolean arr_abort_flg() {
		return getConstBoolean(offset + 0, $arr_abort_flg);
	}

	/**
	 * Cancel remaining receipt 入荷打切.<p>
	 *
	 */
	public void arr_abort_flg(boolean value) {
		setConstBoolean(offset + 0, $arr_abort_flg, value);
	}


	/**
	 * Cancel remaining purchase 仕入打切.<p>
	 *
	 */
	public boolean purc_abort_flg() {
		return getConstBoolean(offset + 1, $purc_abort_flg);
	}

	/**
	 * Cancel remaining purchase 仕入打切.<p>
	 *
	 */
	public void purc_abort_flg(boolean value) {
		setConstBoolean(offset + 1, $purc_abort_flg, value);
	}


	/**
	 * Cancel remaining receipt progress 入荷進捗打切.<p>
	 *
	 */
	public boolean arr_pr_abort_flg() {
		return getConstBoolean(offset + 2, $arr_pr_abort_flg);
	}

	/**
	 * Cancel remaining receipt progress 入荷進捗打切.<p>
	 *
	 */
	public void arr_pr_abort_flg(boolean value) {
		setConstBoolean(offset + 2, $arr_pr_abort_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 7, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 7, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 8, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 8, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 9, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 9, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 10, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 10, $sublot_no_typ, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 11, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 11, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 12, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 12, $sublot_no, value);
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


	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public MCNumber arr_schd_qty() {
		return getConstNumber(offset + 24, $arr_schd_qty);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(MCNumber value) {
		setConstNumber(offset + 24, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(int value) {
		setConstNumber(offset + 24, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(long value) {
		setConstNumber(offset + 24, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(float value) {
		setConstNumber(offset + 24, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(double value) {
		setConstNumber(offset + 24, $arr_schd_qty, value);
	}


	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public MCNumber purc_schd_qty() {
		return getConstNumber(offset + 25, $purc_schd_qty);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(MCNumber value) {
		setConstNumber(offset + 25, $purc_schd_qty, value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(int value) {
		setConstNumber(offset + 25, $purc_schd_qty, value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(long value) {
		setConstNumber(offset + 25, $purc_schd_qty, value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(float value) {
		setConstNumber(offset + 25, $purc_schd_qty, value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(double value) {
		setConstNumber(offset + 25, $purc_schd_qty, value);
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


	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 32, $base_unit_qty);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 32, $base_unit_qty, value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 32, $base_unit_qty, value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 32, $base_unit_qty, value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 32, $base_unit_qty, value);
	}

	/**
	 * Base unit receipt scheduled qty. 基準単位入荷予定数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 32, $base_unit_qty, value);
	}


	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_schd_qty() {
		return getConstNumber(offset + 33, $base_unit_purc_schd_qty);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(MCNumber value) {
		setConstNumber(offset + 33, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(int value) {
		setConstNumber(offset + 33, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(long value) {
		setConstNumber(offset + 33, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(float value) {
		setConstNumber(offset + 33, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(double value) {
		setConstNumber(offset + 33, $base_unit_purc_schd_qty, value);
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


	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public MCNumber rcpt_iv_qty() {
		return getConstNumber(offset + 38, $rcpt_iv_qty);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(MCNumber value) {
		setConstNumber(offset + 38, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(int value) {
		setConstNumber(offset + 38, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(long value) {
		setConstNumber(offset + 38, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(float value) {
		setConstNumber(offset + 38, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(double value) {
		setConstNumber(offset + 38, $rcpt_iv_qty, value);
	}


	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 39, $arr_qty);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 39, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 39, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 39, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 39, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 39, $arr_qty, value);
	}


	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public MCNumber act_abort_qty() {
		return getConstNumber(offset + 40, $act_abort_qty);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(MCNumber value) {
		setConstNumber(offset + 40, $act_abort_qty, value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(int value) {
		setConstNumber(offset + 40, $act_abort_qty, value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(long value) {
		setConstNumber(offset + 40, $act_abort_qty, value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(float value) {
		setConstNumber(offset + 40, $act_abort_qty, value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(double value) {
		setConstNumber(offset + 40, $act_abort_qty, value);
	}


	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public MCNumber purc_act_qty() {
		return getConstNumber(offset + 41, $purc_act_qty);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(MCNumber value) {
		setConstNumber(offset + 41, $purc_act_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(int value) {
		setConstNumber(offset + 41, $purc_act_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(long value) {
		setConstNumber(offset + 41, $purc_act_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(float value) {
		setConstNumber(offset + 41, $purc_act_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(double value) {
		setConstNumber(offset + 41, $purc_act_qty, value);
	}


	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public MCNumber purc_abort_qty() {
		return getConstNumber(offset + 42, $purc_abort_qty);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(MCNumber value) {
		setConstNumber(offset + 42, $purc_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(int value) {
		setConstNumber(offset + 42, $purc_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(long value) {
		setConstNumber(offset + 42, $purc_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(float value) {
		setConstNumber(offset + 42, $purc_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(double value) {
		setConstNumber(offset + 42, $purc_abort_qty, value);
	}


	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_qty() {
		return getConstNumber(offset + 43, $accpt_dfct_qty);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(MCNumber value) {
		setConstNumber(offset + 43, $accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(int value) {
		setConstNumber(offset + 43, $accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(long value) {
		setConstNumber(offset + 43, $accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(float value) {
		setConstNumber(offset + 43, $accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(double value) {
		setConstNumber(offset + 43, $accpt_dfct_qty, value);
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
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 49, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 49, $po_d_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 50, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 50, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 51, $rcpt_iv_d_no);
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 51, $rcpt_iv_d_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 52, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 52, $mfg_inst_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 53, $purc_act_d_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 53, $purc_act_d_no, value);
	}


	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_d_no() {
		return getConstString(offset + 54, $prms_rcpt_d_no);
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_d_no(String value) {
		setConstString(offset + 54, $prms_rcpt_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 55, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 55, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 56, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 56, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 56, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 56, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 56, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 56, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 57, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 57, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 57, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 57, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 57, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 57, $dlv_slip_rev, value);
	}


	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return getConstString(offset + 58, $dlv_slip_mng_no);
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		setConstString(offset + 58, $dlv_slip_mng_no, value);
	}


	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return getConstNumber(offset + 59, $dlv_slip_mng_seq);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		setConstNumber(offset + 59, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		setConstNumber(offset + 59, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		setConstNumber(offset + 59, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		setConstNumber(offset + 59, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		setConstNumber(offset + 59, $dlv_slip_mng_seq, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 60, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 60, $dlv_slip_d_no, value);
	}


	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public MCNumber dlv_slip_d_seq() {
		return getConstNumber(offset + 61, $dlv_slip_d_seq);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(MCNumber value) {
		setConstNumber(offset + 61, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(int value) {
		setConstNumber(offset + 61, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(long value) {
		setConstNumber(offset + 61, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(float value) {
		setConstNumber(offset + 61, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(double value) {
		setConstNumber(offset + 61, $dlv_slip_d_seq, value);
	}


	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 62, $dlv_inst_d_no);
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 62, $dlv_inst_d_no, value);
	}


	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_no() {
		return getConstString(offset + 63, $purc_ddlv_dlv_slip_no);
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_no(String value) {
		setConstString(offset + 63, $purc_ddlv_dlv_slip_no, value);
	}


	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public MCNumber purc_ddlv_dlv_slip_seq() {
		return getConstNumber(offset + 64, $purc_ddlv_dlv_slip_seq);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 64, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(int value) {
		setConstNumber(offset + 64, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(long value) {
		setConstNumber(offset + 64, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(float value) {
		setConstNumber(offset + 64, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(double value) {
		setConstNumber(offset + 64, $purc_ddlv_dlv_slip_seq, value);
	}


	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public MCNumber purc_ddlv_dlv_slip_rev() {
		return getConstNumber(offset + 65, $purc_ddlv_dlv_slip_rev);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(int value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(long value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(float value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(double value) {
		setConstNumber(offset + 65, $purc_ddlv_dlv_slip_rev, value);
	}


	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_d_no() {
		return getConstString(offset + 66, $purc_ddlv_dlv_slip_d_no);
	}

	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_d_no(String value) {
		setConstString(offset + 66, $purc_ddlv_dlv_slip_d_no, value);
	}


	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return getConstString(offset + 67, $dlv_slip_d_rmrks);
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		setConstString(offset + 67, $dlv_slip_d_rmrks, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 68, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 68, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 69, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 69, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 70, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 70, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 71, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 71, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 72, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 72, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 73, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 73, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 74, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 74, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 75, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 75, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 76, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 76, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 77, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 77, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 78, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 78, $upd_srv_req_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 79, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 79, $arr_pr_no, value);
	}


	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 80, $arr_pr_upd_cntr);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 80, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 80, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 80, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 80, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 80, $arr_pr_upd_cntr, value);
	}


	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public boolean rcpt_iv_cmpl_flg() {
		return getConstBoolean(offset + 81, $rcpt_iv_cmpl_flg);
	}

	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public void rcpt_iv_cmpl_flg(boolean value) {
		setConstBoolean(offset + 81, $rcpt_iv_cmpl_flg, value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			return arr_schd_qty();
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			return purc_schd_qty();
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_base_qty();
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_schd_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			return rcpt_iv_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			return act_abort_qty();
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			return purc_act_qty();
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			return purc_abort_qty();
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_qty();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			return arr_schd_qty();
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			return purc_schd_qty();
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_base_qty();
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_schd_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			return rcpt_iv_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			return act_abort_qty();
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			return purc_act_qty();
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			return purc_abort_qty();
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_qty();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
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
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
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
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($purc_schd_qty.equalsIgnoreCase(name)) {
			purc_schd_qty(value);
			return;
		}
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($act_abort_qty.equalsIgnoreCase(name)) {
			act_abort_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($purc_abort_qty.equalsIgnoreCase(name)) {
			purc_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
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



}

