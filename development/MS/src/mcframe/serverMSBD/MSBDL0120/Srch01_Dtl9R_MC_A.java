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
 * ブロック"Srch01_Dtl9"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Dtl9R_MC_A extends MCConstRow {

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
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
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $conv_base_qty = "conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $conv_qty = "conv_qty";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
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
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
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
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public static final String $rcpt_iv_qty = "rcpt_iv_qty";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public static final String $prms_dlv_dt = "prms_dlv_dt";
	/**
	 * Replied delivery time 回答納入時刻.<p>
	 *
	 */
	public static final String $prms_dlv_hm = "prms_dlv_hm";
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
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_d_no = "prms_rcpt_d_no";
	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_no = "prms_rcpt_no";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
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
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_no = "purc_ddlv_dlv_slip_no";
	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_rev = "purc_ddlv_dlv_slip_rev";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
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
	 * Order promising result received details update counter 納期回答受領明細更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public static final String $rcpt_iv_cmpl_flg = "rcpt_iv_cmpl_flg";


	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta conv_base_qty_META = createCommonMeta($conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta conv_qty_META = createCommonMeta($conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_abort_qty_META = createCommonMeta($act_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_act_qty_META = createCommonMeta($purc_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_abort_qty_META = createCommonMeta($purc_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta accpt_dfct_qty_META = createCommonMeta($accpt_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rcpt_iv_qty_META = createCommonMeta($rcpt_iv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta prms_dlv_dt_META = createCommonMeta($prms_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_dlv_hm_META = createCommonMeta($prms_dlv_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RCPT_D_INTR_RMRKS);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RMRKS);
	public static final MCMeta prms_rcpt_d_no_META = createCommonMeta($prms_rcpt_d_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_D_NO);
	public static final MCMeta prms_rcpt_no_META = createCommonMeta($prms_rcpt_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_NO);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.DLV_INST_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_ddlv_dlv_slip_no_META = createCommonMeta($purc_ddlv_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta purc_ddlv_dlv_slip_rev_META = createCommonMeta($purc_ddlv_dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_D_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_D_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_D_CHAR3);
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
	public static final MCMeta arr_cmpl_flg_META = createCommonMeta($arr_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cmpl_flg_META = createCommonMeta($purc_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_purc_flg_META = createCommonMeta($non_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta rcpt_iv_cmpl_flg_META = createCommonMeta($rcpt_iv_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_Dtl9R> constMetas = new ConstMetaList<Srch01_Dtl9R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			po_d_no_META,
			dlv_cd_META,
			purc_id_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			dscnt_itm_flg_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			conv_base_qty_META,
			conv_qty_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			arr_qty_META,
			act_abort_qty_META,
			purc_act_qty_META,
			purc_abort_qty_META,
			accpt_dfct_qty_META,
			rcpt_iv_qty_META,
			rcpt_iv_no_META,
			prms_dlv_dt_META,
			prms_dlv_hm_META,
			purc_schd_dt_META,
			sync_flg_META,
			intr_rmrks_META,
			prms_rmrks_META,
			prms_rcpt_d_no_META,
			prms_rcpt_no_META,
			outsrc_flg_META,
			mfg_inst_no_META,
			purc_act_d_no_META,
			dlv_inst_d_no_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			purc_ddlv_dlv_slip_no_META,
			purc_ddlv_dlv_slip_rev_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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
			arr_cmpl_flg_META,
			purc_cmpl_flg_META,
			arr_skip_flg_META,
			non_purc_flg_META,
			upd_cntr_META,
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
	protected Srch01_Dtl9R_MC_A(ConstMetaList<? extends Srch01_Dtl9R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl9R clone() {
		return (Srch01_Dtl9R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl9R createInstance() {
		return (Srch01_Dtl9R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl9R getValues(String... names) {
		return (Srch01_Dtl9R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 0, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 0, $po_d_no, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 1, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 1, $dlv_cd, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 2, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 2, $purc_id_typ, value);
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 7, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 7, $dscnt_itm_flg, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 8, $trd_unit_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 9, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 9, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 10, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 10, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 11, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 11, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 11, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 11, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 11, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 11, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 12, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 12, $trd_unit_rnd_typ, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber conv_base_qty() {
		return getConstNumber(offset + 13, $conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(MCNumber value) {
		setConstNumber(offset + 13, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(int value) {
		setConstNumber(offset + 13, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(long value) {
		setConstNumber(offset + 13, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(float value) {
		setConstNumber(offset + 13, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(double value) {
		setConstNumber(offset + 13, $conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return getConstNumber(offset + 14, $conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		setConstNumber(offset + 14, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(int value) {
		setConstNumber(offset + 14, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(long value) {
		setConstNumber(offset + 14, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(float value) {
		setConstNumber(offset + 14, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(double value) {
		setConstNumber(offset + 14, $conv_qty, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 15, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 15, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 15, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 15, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 15, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 15, $base_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 16, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 16, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 17, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 17, $base_unit_nm, value);
	}


	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 18, $base_unit_dec_place);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 19, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 19, $base_unit_rnd_typ, value);
	}


	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 20, $arr_qty);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 20, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 20, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 20, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 20, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 20, $arr_qty, value);
	}


	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public MCNumber act_abort_qty() {
		return getConstNumber(offset + 21, $act_abort_qty);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(MCNumber value) {
		setConstNumber(offset + 21, $act_abort_qty, value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(int value) {
		setConstNumber(offset + 21, $act_abort_qty, value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(long value) {
		setConstNumber(offset + 21, $act_abort_qty, value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(float value) {
		setConstNumber(offset + 21, $act_abort_qty, value);
	}

	/**
	 * Cancelled remaining receipt qty. 入荷打切数量.<p>
	 *
	 */
	public void act_abort_qty(double value) {
		setConstNumber(offset + 21, $act_abort_qty, value);
	}


	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public MCNumber purc_act_qty() {
		return getConstNumber(offset + 22, $purc_act_qty);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(MCNumber value) {
		setConstNumber(offset + 22, $purc_act_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(int value) {
		setConstNumber(offset + 22, $purc_act_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(long value) {
		setConstNumber(offset + 22, $purc_act_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(float value) {
		setConstNumber(offset + 22, $purc_act_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_act_qty(double value) {
		setConstNumber(offset + 22, $purc_act_qty, value);
	}


	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public MCNumber purc_abort_qty() {
		return getConstNumber(offset + 23, $purc_abort_qty);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(MCNumber value) {
		setConstNumber(offset + 23, $purc_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(int value) {
		setConstNumber(offset + 23, $purc_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(long value) {
		setConstNumber(offset + 23, $purc_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(float value) {
		setConstNumber(offset + 23, $purc_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void purc_abort_qty(double value) {
		setConstNumber(offset + 23, $purc_abort_qty, value);
	}


	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_qty() {
		return getConstNumber(offset + 24, $accpt_dfct_qty);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(MCNumber value) {
		setConstNumber(offset + 24, $accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(int value) {
		setConstNumber(offset + 24, $accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(long value) {
		setConstNumber(offset + 24, $accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(float value) {
		setConstNumber(offset + 24, $accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(double value) {
		setConstNumber(offset + 24, $accpt_dfct_qty, value);
	}


	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public MCNumber rcpt_iv_qty() {
		return getConstNumber(offset + 25, $rcpt_iv_qty);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(MCNumber value) {
		setConstNumber(offset + 25, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(int value) {
		setConstNumber(offset + 25, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(long value) {
		setConstNumber(offset + 25, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(float value) {
		setConstNumber(offset + 25, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(double value) {
		setConstNumber(offset + 25, $rcpt_iv_qty, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 26, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 26, $rcpt_iv_no, value);
	}


	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return getConstDate(offset + 27, $prms_dlv_dt);
	}

	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		setConstDate(offset + 27, $prms_dlv_dt, value);
	}


	/**
	 * Replied delivery time 回答納入時刻.<p>
	 *
	 */
	public MCDate prms_dlv_hm() {
		return getConstDate(offset + 28, $prms_dlv_hm);
	}

	/**
	 * Replied delivery time 回答納入時刻.<p>
	 *
	 */
	public void prms_dlv_hm(MCDate value) {
		setConstDate(offset + 28, $prms_dlv_hm, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 29, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 29, $purc_schd_dt, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 30, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 30, $sync_flg, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 31, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 31, $intr_rmrks, value);
	}


	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 32, $prms_rmrks);
	}

	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 32, $prms_rmrks, value);
	}


	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_d_no() {
		return getConstString(offset + 33, $prms_rcpt_d_no);
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_d_no(String value) {
		setConstString(offset + 33, $prms_rcpt_d_no, value);
	}


	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_no() {
		return getConstString(offset + 34, $prms_rcpt_no);
	}

	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_no(String value) {
		setConstString(offset + 34, $prms_rcpt_no, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 35, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 35, $outsrc_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 36, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 36, $mfg_inst_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 37, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 37, $purc_act_d_no, value);
	}


	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 38, $dlv_inst_d_no);
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 38, $dlv_inst_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 39, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 39, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 40, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 40, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 40, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 40, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 40, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 40, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 41, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 41, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 41, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 41, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 41, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 41, $dlv_slip_rev, value);
	}


	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_no() {
		return getConstString(offset + 42, $purc_ddlv_dlv_slip_no);
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_no(String value) {
		setConstString(offset + 42, $purc_ddlv_dlv_slip_no, value);
	}


	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public MCNumber purc_ddlv_dlv_slip_rev() {
		return getConstNumber(offset + 43, $purc_ddlv_dlv_slip_rev);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 43, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(int value) {
		setConstNumber(offset + 43, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(long value) {
		setConstNumber(offset + 43, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(float value) {
		setConstNumber(offset + 43, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(double value) {
		setConstNumber(offset + 43, $purc_ddlv_dlv_slip_rev, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 44, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 44, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 45, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 45, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 46, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 46, $sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 47, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 47, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 48, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 48, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 49, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 49, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 50, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 50, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 51, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 52, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 52, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 53, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 53, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 54, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 54, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 55, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 55, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 56, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 56, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 57, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 57, $upd_srv_req_no, value);
	}


	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public boolean arr_cmpl_flg() {
		return getConstBoolean(offset + 58, $arr_cmpl_flg);
	}

	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public void arr_cmpl_flg(boolean value) {
		setConstBoolean(offset + 58, $arr_cmpl_flg, value);
	}


	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return getConstBoolean(offset + 59, $purc_cmpl_flg);
	}

	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		setConstBoolean(offset + 59, $purc_cmpl_flg, value);
	}


	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 60, $arr_skip_flg);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 60, $arr_skip_flg, value);
	}


	/**
	 * Not for purchase 仕入対象外.<p>
	 *
	 */
	public boolean non_purc_flg() {
		return getConstBoolean(offset + 61, $non_purc_flg);
	}

	/**
	 * Not for purchase 仕入対象外.<p>
	 *
	 */
	public void non_purc_flg(boolean value) {
		setConstBoolean(offset + 61, $non_purc_flg, value);
	}


	/**
	 * Order promising result received details update counter 納期回答受領明細更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 62, $upd_cntr);
	}

	/**
	 * Order promising result received details update counter 納期回答受領明細更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 62, $upd_cntr, value);
	}

	/**
	 * Order promising result received details update counter 納期回答受領明細更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 62, $upd_cntr, value);
	}

	/**
	 * Order promising result received details update counter 納期回答受領明細更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 62, $upd_cntr, value);
	}

	/**
	 * Order promising result received details update counter 納期回答受領明細更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 62, $upd_cntr, value);
	}

	/**
	 * Order promising result received details update counter 納期回答受領明細更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 62, $upd_cntr, value);
	}


	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public boolean rcpt_iv_cmpl_flg() {
		return getConstBoolean(offset + 63, $rcpt_iv_cmpl_flg);
	}

	/**
	 * Purchase invoice completed (100% received) 受領インボイス完了（全数受領）.<p>
	 *
	 */
	public void rcpt_iv_cmpl_flg(boolean value) {
		setConstBoolean(offset + 63, $rcpt_iv_cmpl_flg, value);
	}


	public String getString(String name) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			return prms_rcpt_d_no();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			return rcpt_iv_qty();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($prms_dlv_hm.equalsIgnoreCase(name)) {
			return prms_dlv_hm();
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
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			return prms_rcpt_d_no();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			return rcpt_iv_qty();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($prms_dlv_hm.equalsIgnoreCase(name)) {
			return prms_dlv_hm();
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
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
			return;
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			prms_rcpt_d_no(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
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
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($prms_dlv_hm.equalsIgnoreCase(name)) {
			prms_dlv_hm(value);
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
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
			return;
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			prms_rcpt_d_no(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
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
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($prms_dlv_hm.equalsIgnoreCase(name)) {
			prms_dlv_hm(value);
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
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
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

