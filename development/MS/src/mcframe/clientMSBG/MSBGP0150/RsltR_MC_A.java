package mcframe.clientMSBG.MSBGP0150;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Payment received info. type 入金情報区分.<p>
	 *
	 */
	public static final String $rcv_dat_typ = "rcv_dat_typ";
	/**
	 * Payment received info. type name 入金情報区分名.<p>
	 *
	 */
	public static final String $rcv_dat_typ_nm = "rcv_dat_typ_nm";
	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public static final String $rcv_dpt_cd = "rcv_dpt_cd";
	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public static final String $rcv_dpt_nm = "rcv_dpt_nm";
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
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public static final String $rcv_usr_cd = "rcv_usr_cd";
	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public static final String $rcv_usr_nm = "rcv_usr_nm";
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	public static final String $rcv_amt_p = "rcv_amt_p";
	public static final String $roc_bal_p = "roc_bal_p";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $rcv_mtd_nm = "rcv_mtd_nm";
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public static final String $auto_appl_sts_typ = "auto_appl_sts_typ";
	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public static final String $auto_appl_sts_typ_nm = "auto_appl_sts_typ_nm";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public static final String $rcv_rmrks = "rcv_rmrks";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Split 分割.<p>
	 *
	 */
	public static final String $div_flg = "div_flg";
	/**
	 * Payment received split source No. 分割元入金ＮＯ.<p>
	 *
	 */
	public static final String $div_src_rcv_no = "div_src_rcv_no";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $src_rcv_act_no = "src_rcv_act_no";
	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public static final String $if_rcv_no = "if_rcv_no";
	/**
	 * FB ＦＢ.<p>
	 *
	 */
	public static final String $fb_flg = "fb_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public static final String $ext_rcv_no = "ext_rcv_no";
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
	public static final String $rts_msg_p = "rts_msg_p";
	public static final String $rcv_grp_p = "rcv_grp_p";
	public static final String $bill_grp_p = "bill_grp_p";
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

	public static final String $rcv_amt = $rcv_amt_p + ".amt";
	public static final String $not_proc_bal = $roc_bal_p + ".amt";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $rcv_grp_cd1 = $rcv_grp_p + ".bp_grp_cd1";
	public static final String $rcv_grp_nm1 = $rcv_grp_p + ".bp_grp_nm1";
	public static final String $rcv_grp_cd2 = $rcv_grp_p + ".bp_grp_cd2";
	public static final String $rcv_grp_nm2 = $rcv_grp_p + ".bp_grp_nm2";
	public static final String $rcv_grp_cd3 = $rcv_grp_p + ".bp_grp_cd3";
	public static final String $rcv_grp_nm3 = $rcv_grp_p + ".bp_grp_nm3";
	public static final String $rcv_grp_cd4 = $rcv_grp_p + ".bp_grp_cd4";
	public static final String $rcv_grp_nm4 = $rcv_grp_p + ".bp_grp_nm4";
	public static final String $rcv_grp_cd5 = $rcv_grp_p + ".bp_grp_cd5";
	public static final String $rcv_grp_nm5 = $rcv_grp_p + ".bp_grp_nm5";
	public static final String $rcv_grp_cd6 = $rcv_grp_p + ".bp_grp_cd6";
	public static final String $rcv_grp_nm6 = $rcv_grp_p + ".bp_grp_nm6";
	public static final String $rcv_grp_cd7 = $rcv_grp_p + ".bp_grp_cd7";
	public static final String $rcv_grp_nm7 = $rcv_grp_p + ".bp_grp_nm7";
	public static final String $rcv_grp_cd8 = $rcv_grp_p + ".bp_grp_cd8";
	public static final String $rcv_grp_nm8 = $rcv_grp_p + ".bp_grp_nm8";
	public static final String $rcv_grp_cd9 = $rcv_grp_p + ".bp_grp_cd9";
	public static final String $rcv_grp_nm9 = $rcv_grp_p + ".bp_grp_nm9";
	public static final String $rcv_grp_cd10 = $rcv_grp_p + ".bp_grp_cd10";
	public static final String $rcv_grp_nm10 = $rcv_grp_p + ".bp_grp_nm10";
	public static final String $bill_grp_cd1 = $bill_grp_p + ".bp_grp_cd1";
	public static final String $bill_grp_nm1 = $bill_grp_p + ".bp_grp_nm1";
	public static final String $bill_grp_cd2 = $bill_grp_p + ".bp_grp_cd2";
	public static final String $bill_grp_nm2 = $bill_grp_p + ".bp_grp_nm2";
	public static final String $bill_grp_cd3 = $bill_grp_p + ".bp_grp_cd3";
	public static final String $bill_grp_nm3 = $bill_grp_p + ".bp_grp_nm3";
	public static final String $bill_grp_cd4 = $bill_grp_p + ".bp_grp_cd4";
	public static final String $bill_grp_nm4 = $bill_grp_p + ".bp_grp_nm4";
	public static final String $bill_grp_cd5 = $bill_grp_p + ".bp_grp_cd5";
	public static final String $bill_grp_nm5 = $bill_grp_p + ".bp_grp_nm5";
	public static final String $bill_grp_cd6 = $bill_grp_p + ".bp_grp_cd6";
	public static final String $bill_grp_nm6 = $bill_grp_p + ".bp_grp_nm6";
	public static final String $bill_grp_cd7 = $bill_grp_p + ".bp_grp_cd7";
	public static final String $bill_grp_nm7 = $bill_grp_p + ".bp_grp_nm7";
	public static final String $bill_grp_cd8 = $bill_grp_p + ".bp_grp_cd8";
	public static final String $bill_grp_nm8 = $bill_grp_p + ".bp_grp_nm8";
	public static final String $bill_grp_cd9 = $bill_grp_p + ".bp_grp_cd9";
	public static final String $bill_grp_nm9 = $bill_grp_p + ".bp_grp_nm9";
	public static final String $bill_grp_cd10 = $bill_grp_p + ".bp_grp_cd10";
	public static final String $bill_grp_nm10 = $bill_grp_p + ".bp_grp_nm10";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_dat_typ_META = createCommonMeta($rcv_dat_typ, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP);
	public static final MCMeta rcv_dat_typ_nm_META = createCommonMeta($rcv_dat_typ_nm, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP_NM);
	public static final MCMeta rcv_dpt_cd_META = createCommonMeta($rcv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rcv_dpt_nm_META = createCommonMeta($rcv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rcv_usr_cd_META = createCommonMeta($rcv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcv_usr_nm_META = createCommonMeta($rcv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rcv_amt_p_META = createInnerRowMeta($rcv_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta roc_bal_p_META = createInnerRowMeta($roc_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta auto_appl_sts_typ_META = createCommonMeta($auto_appl_sts_typ, mcframe.commonMS.meta.MS_META.AUTO_APPL_STS_TYP);
	public static final MCMeta auto_appl_sts_typ_nm_META = createCommonMeta($auto_appl_sts_typ_nm, mcframe.commonMS.meta.MS_META.AUTO_APPL_STS_TYP_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta rcv_rmrks_META = createCommonMeta($rcv_rmrks, mcframe.commonMS.meta.MS_META.RCV_RMRKS);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta div_flg_META = createCommonMeta($div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta div_src_rcv_no_META = createCommonMeta($div_src_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta src_rcv_act_no_META = createCommonMeta($src_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta if_rcv_no_META = createCommonMeta($if_rcv_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta fb_flg_META = createCommonMeta($fb_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_rcv_no_META = createCommonMeta($ext_rcv_no, mcframe.commonMA.meta.MA_META.EXT_RCV_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR3);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta rcv_grp_p_META = createInnerRowMeta($rcv_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta bill_grp_p_META = createInnerRowMeta($bill_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
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

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			rcv_dat_typ_META,
			rcv_dat_typ_nm_META,
			rcv_dpt_cd_META,
			rcv_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			rcv_usr_cd_META,
			rcv_usr_nm_META,
			rcv_no_META,
			rcv_dt_META,
			rcst_cd_META,
			rcst_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			xfr_psn_META,
			cur_cd_META,
			cur_nm_META,
			amt_dec_place_META,
			rcv_amt_p_META,
			roc_bal_p_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			bank_ac_no_META,
			rcv_mtd_cd_META,
			rcv_mtd_nm_META,
			note_no_META,
			auto_appl_sts_typ_META,
			auto_appl_sts_typ_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			bsppl_cd_META,
			bsppl_nm_META,
			acst_cd_META,
			acst_nm_META,
			pay_act_no_META,
			rcv_rmrks_META,
			prnt_flg_META,
			div_flg_META,
			div_src_rcv_no_META,
			src_rcv_act_no_META,
			if_rcv_no_META,
			fb_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_rcv_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rts_msg_p_META,
			rcv_grp_p_META,
			bill_grp_p_META,
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
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"rcv_amt",
				"not_proc_bal",
				"rtn_sts_typ",
				"rcv_grp_cd1",
				"rcv_grp_nm1",
				"rcv_grp_cd2",
				"rcv_grp_nm2",
				"rcv_grp_cd3",
				"rcv_grp_nm3",
				"rcv_grp_cd4",
				"rcv_grp_nm4",
				"rcv_grp_cd5",
				"rcv_grp_nm5",
				"rcv_grp_cd6",
				"rcv_grp_nm6",
				"rcv_grp_cd7",
				"rcv_grp_nm7",
				"rcv_grp_cd8",
				"rcv_grp_nm8",
				"rcv_grp_cd9",
				"rcv_grp_nm9",
				"rcv_grp_cd10",
				"rcv_grp_nm10",
				"bill_grp_cd1",
				"bill_grp_nm1",
				"bill_grp_cd2",
				"bill_grp_nm2",
				"bill_grp_cd3",
				"bill_grp_nm3",
				"bill_grp_cd4",
				"bill_grp_nm4",
				"bill_grp_cd5",
				"bill_grp_nm5",
				"bill_grp_cd6",
				"bill_grp_nm6",
				"bill_grp_cd7",
				"bill_grp_nm7",
				"bill_grp_cd8",
				"bill_grp_nm8",
				"bill_grp_cd9",
				"bill_grp_nm9",
				"bill_grp_cd10",
				"bill_grp_nm10"
			},
			{
				$rcv_amt,
				$not_proc_bal,
				$rtn_sts_typ,
				$rcv_grp_cd1,
				$rcv_grp_nm1,
				$rcv_grp_cd2,
				$rcv_grp_nm2,
				$rcv_grp_cd3,
				$rcv_grp_nm3,
				$rcv_grp_cd4,
				$rcv_grp_nm4,
				$rcv_grp_cd5,
				$rcv_grp_nm5,
				$rcv_grp_cd6,
				$rcv_grp_nm6,
				$rcv_grp_cd7,
				$rcv_grp_nm7,
				$rcv_grp_cd8,
				$rcv_grp_nm8,
				$rcv_grp_cd9,
				$rcv_grp_nm9,
				$rcv_grp_cd10,
				$rcv_grp_nm10,
				$bill_grp_cd1,
				$bill_grp_nm1,
				$bill_grp_cd2,
				$bill_grp_nm2,
				$bill_grp_cd3,
				$bill_grp_nm3,
				$bill_grp_cd4,
				$bill_grp_nm4,
				$bill_grp_cd5,
				$bill_grp_nm5,
				$bill_grp_cd6,
				$bill_grp_nm6,
				$bill_grp_cd7,
				$bill_grp_nm7,
				$bill_grp_cd8,
				$bill_grp_nm8,
				$bill_grp_cd9,
				$bill_grp_nm9,
				$bill_grp_cd10,
				$bill_grp_nm10
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
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
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
	 * Payment received info. type 入金情報区分.<p>
	 *
	 */
	public String rcv_dat_typ() {
		return getConstString(offset + 1, $rcv_dat_typ);
	}

	/**
	 * Payment received info. type 入金情報区分.<p>
	 *
	 */
	public void rcv_dat_typ(String value) {
		setConstString(offset + 1, $rcv_dat_typ, value);
	}


	/**
	 * Payment received info. type name 入金情報区分名.<p>
	 *
	 */
	public String rcv_dat_typ_nm() {
		return getConstString(offset + 2, $rcv_dat_typ_nm);
	}

	/**
	 * Payment received info. type name 入金情報区分名.<p>
	 *
	 */
	public void rcv_dat_typ_nm(String value) {
		setConstString(offset + 2, $rcv_dat_typ_nm, value);
	}


	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public String rcv_dpt_cd() {
		return getConstString(offset + 3, $rcv_dpt_cd);
	}

	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public void rcv_dpt_cd(String value) {
		setConstString(offset + 3, $rcv_dpt_cd, value);
	}


	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public String rcv_dpt_nm() {
		return getConstString(offset + 4, $rcv_dpt_nm);
	}

	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public void rcv_dpt_nm(String value) {
		setConstString(offset + 4, $rcv_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 6, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 6, $wg_nm, value);
	}


	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public String rcv_usr_cd() {
		return getConstString(offset + 7, $rcv_usr_cd);
	}

	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public void rcv_usr_cd(String value) {
		setConstString(offset + 7, $rcv_usr_cd, value);
	}


	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public String rcv_usr_nm() {
		return getConstString(offset + 8, $rcv_usr_nm);
	}

	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public void rcv_usr_nm(String value) {
		setConstString(offset + 8, $rcv_usr_nm, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 9, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 9, $rcv_no, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 10, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 10, $rcv_dt, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 11, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 11, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 12, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 12, $rcst_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 13, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 13, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 14, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 14, $bcst_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 15, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 15, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 16, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 16, $bill_dpt_nm, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 17, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 17, $xfr_psn, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 18, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 18, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 19, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 19, $cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 20, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 21, $rcv_amt_p);
	}
	
	public void rcv_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 21, $rcv_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR roc_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 22, $roc_bal_p);
	}
	
	public void roc_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 22, $roc_bal_p, row);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 23, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 23, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 24, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 24, $bank_ac_nm, value);
	}


	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 25, $bank_ac_no);
	}

	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 25, $bank_ac_no, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 26, $rcv_mtd_cd);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 26, $rcv_mtd_cd, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 27, $rcv_mtd_nm);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 27, $rcv_mtd_nm, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 28, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 28, $note_no, value);
	}


	/**
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public String auto_appl_sts_typ() {
		return getConstString(offset + 29, $auto_appl_sts_typ);
	}

	/**
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public void auto_appl_sts_typ(String value) {
		setConstString(offset + 29, $auto_appl_sts_typ, value);
	}


	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public String auto_appl_sts_typ_nm() {
		return getConstString(offset + 30, $auto_appl_sts_typ_nm);
	}

	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public void auto_appl_sts_typ_nm(String value) {
		setConstString(offset + 30, $auto_appl_sts_typ_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 31, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 31, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 32, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 32, $asppl_nm, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 33, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 33, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 34, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 34, $bsppl_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 35, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 35, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 36, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 36, $acst_nm, value);
	}


	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 37, $pay_act_no);
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 37, $pay_act_no, value);
	}


	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public String rcv_rmrks() {
		return getConstString(offset + 38, $rcv_rmrks);
	}

	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public void rcv_rmrks(String value) {
		setConstString(offset + 38, $rcv_rmrks, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 39, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 39, $prnt_flg, value);
	}


	/**
	 * Split 分割.<p>
	 *
	 */
	public boolean div_flg() {
		return getConstBoolean(offset + 40, $div_flg);
	}

	/**
	 * Split 分割.<p>
	 *
	 */
	public void div_flg(boolean value) {
		setConstBoolean(offset + 40, $div_flg, value);
	}


	/**
	 * Payment received split source No. 分割元入金ＮＯ.<p>
	 *
	 */
	public String div_src_rcv_no() {
		return getConstString(offset + 41, $div_src_rcv_no);
	}

	/**
	 * Payment received split source No. 分割元入金ＮＯ.<p>
	 *
	 */
	public void div_src_rcv_no(String value) {
		setConstString(offset + 41, $div_src_rcv_no, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String src_rcv_act_no() {
		return getConstString(offset + 42, $src_rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void src_rcv_act_no(String value) {
		setConstString(offset + 42, $src_rcv_act_no, value);
	}


	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public MCNumber if_rcv_no() {
		return getConstNumber(offset + 43, $if_rcv_no);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(MCNumber value) {
		setConstNumber(offset + 43, $if_rcv_no, value);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(int value) {
		setConstNumber(offset + 43, $if_rcv_no, value);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(long value) {
		setConstNumber(offset + 43, $if_rcv_no, value);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(float value) {
		setConstNumber(offset + 43, $if_rcv_no, value);
	}

	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public void if_rcv_no(double value) {
		setConstNumber(offset + 43, $if_rcv_no, value);
	}


	/**
	 * FB ＦＢ.<p>
	 *
	 */
	public boolean fb_flg() {
		return getConstBoolean(offset + 44, $fb_flg);
	}

	/**
	 * FB ＦＢ.<p>
	 *
	 */
	public void fb_flg(boolean value) {
		setConstBoolean(offset + 44, $fb_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 45, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 45, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 46, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 46, $ext_sys_nm, value);
	}


	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public String ext_rcv_no() {
		return getConstString(offset + 47, $ext_rcv_no);
	}

	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public void ext_rcv_no(String value) {
		setConstString(offset + 47, $ext_rcv_no, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 48, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 48, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 49, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 49, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 50, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 50, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 51, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 51, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR rcv_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 52, $rcv_grp_p);
	}
	
	public void rcv_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 52, $rcv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR bill_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 53, $bill_grp_p);
	}
	
	public void bill_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 53, $bill_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 54, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 54, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 55, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 55, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 56, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 56, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 57, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 57, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 58, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 58, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 59, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 59, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 60, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 60, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 61, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 61, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 62, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 62, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 63, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 63, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 64, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 64, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($rcv_dat_typ.equalsIgnoreCase(name)) {
			return rcv_dat_typ();
		}
		if ($rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			return rcv_dat_typ_nm();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			return rcv_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ();
		}
		if ($auto_appl_sts_typ_nm.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($div_src_rcv_no.equalsIgnoreCase(name)) {
			return div_src_rcv_no();
		}
		if ($src_rcv_act_no.equalsIgnoreCase(name)) {
			return src_rcv_act_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			return ext_rcv_no();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			return if_rcv_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
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
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($div_flg.equalsIgnoreCase(name)) {
			return div_flg();
		}
		if ($fb_flg.equalsIgnoreCase(name)) {
			return fb_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_dat_typ.equalsIgnoreCase(name)) {
			return rcv_dat_typ();
		}
		if ($rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			return rcv_dat_typ_nm();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			return rcv_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ();
		}
		if ($auto_appl_sts_typ_nm.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($div_src_rcv_no.equalsIgnoreCase(name)) {
			return div_src_rcv_no();
		}
		if ($src_rcv_act_no.equalsIgnoreCase(name)) {
			return src_rcv_act_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			return ext_rcv_no();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			return if_rcv_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
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
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($div_flg.equalsIgnoreCase(name)) {
			return div_flg();
		}
		if ($fb_flg.equalsIgnoreCase(name)) {
			return fb_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_dat_typ.equalsIgnoreCase(name)) {
			rcv_dat_typ(value);
			return;
		}
		if ($rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			rcv_dat_typ_nm(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			rcv_dpt_nm(value);
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			auto_appl_sts_typ(value);
			return;
		}
		if ($auto_appl_sts_typ_nm.equalsIgnoreCase(name)) {
			auto_appl_sts_typ_nm(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($div_src_rcv_no.equalsIgnoreCase(name)) {
			div_src_rcv_no(value);
			return;
		}
		if ($src_rcv_act_no.equalsIgnoreCase(name)) {
			src_rcv_act_no(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			ext_rcv_no(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
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
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($div_flg.equalsIgnoreCase(name)) {
			div_flg(value);
			return;
		}
		if ($fb_flg.equalsIgnoreCase(name)) {
			fb_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_dat_typ.equalsIgnoreCase(name)) {
			rcv_dat_typ(value);
			return;
		}
		if ($rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			rcv_dat_typ_nm(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			rcv_dpt_nm(value);
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
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			auto_appl_sts_typ(value);
			return;
		}
		if ($auto_appl_sts_typ_nm.equalsIgnoreCase(name)) {
			auto_appl_sts_typ_nm(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($div_src_rcv_no.equalsIgnoreCase(name)) {
			div_src_rcv_no(value);
			return;
		}
		if ($src_rcv_act_no.equalsIgnoreCase(name)) {
			src_rcv_act_no(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			ext_rcv_no(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($if_rcv_no.equalsIgnoreCase(name)) {
			if_rcv_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
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
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($div_flg.equalsIgnoreCase(name)) {
			div_flg(value);
			return;
		}
		if ($fb_flg.equalsIgnoreCase(name)) {
			fb_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rcv_amt_p.equalsIgnoreCase(name)) {
			return rcv_amt_p();
		}
		if ($roc_bal_p.equalsIgnoreCase(name)) {
			return roc_bal_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($rcv_grp_p.equalsIgnoreCase(name)) {
			return rcv_grp_p();
		}
		if ($bill_grp_p.equalsIgnoreCase(name)) {
			return bill_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rcv_amt_p.equalsIgnoreCase(name)) {
			rcv_amt_p(
				((MCContainerMeta) rcv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($roc_bal_p.equalsIgnoreCase(name)) {
			roc_bal_p(
				((MCContainerMeta) roc_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($rcv_grp_p.equalsIgnoreCase(name)) {
			rcv_grp_p(
				((MCContainerMeta) rcv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($bill_grp_p.equalsIgnoreCase(name)) {
			bill_grp_p(
				((MCContainerMeta) bill_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return rcv_amt_p().amt();
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return roc_bal_p().amt();
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		roc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		roc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		roc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		roc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		roc_bal_p().amt(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public String rcv_grp_cd1() {
		return rcv_grp_p().bp_grp_cd1();
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public void rcv_grp_cd1(String value) {
		rcv_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public String rcv_grp_nm1() {
		return rcv_grp_p().bp_grp_nm1();
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public void rcv_grp_nm1(String value) {
		rcv_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public String rcv_grp_cd2() {
		return rcv_grp_p().bp_grp_cd2();
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public void rcv_grp_cd2(String value) {
		rcv_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public String rcv_grp_nm2() {
		return rcv_grp_p().bp_grp_nm2();
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public void rcv_grp_nm2(String value) {
		rcv_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public String rcv_grp_cd3() {
		return rcv_grp_p().bp_grp_cd3();
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public void rcv_grp_cd3(String value) {
		rcv_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public String rcv_grp_nm3() {
		return rcv_grp_p().bp_grp_nm3();
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public void rcv_grp_nm3(String value) {
		rcv_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public String rcv_grp_cd4() {
		return rcv_grp_p().bp_grp_cd4();
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public void rcv_grp_cd4(String value) {
		rcv_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public String rcv_grp_nm4() {
		return rcv_grp_p().bp_grp_nm4();
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public void rcv_grp_nm4(String value) {
		rcv_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public String rcv_grp_cd5() {
		return rcv_grp_p().bp_grp_cd5();
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public void rcv_grp_cd5(String value) {
		rcv_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public String rcv_grp_nm5() {
		return rcv_grp_p().bp_grp_nm5();
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public void rcv_grp_nm5(String value) {
		rcv_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public String rcv_grp_cd6() {
		return rcv_grp_p().bp_grp_cd6();
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public void rcv_grp_cd6(String value) {
		rcv_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public String rcv_grp_nm6() {
		return rcv_grp_p().bp_grp_nm6();
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public void rcv_grp_nm6(String value) {
		rcv_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public String rcv_grp_cd7() {
		return rcv_grp_p().bp_grp_cd7();
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public void rcv_grp_cd7(String value) {
		rcv_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public String rcv_grp_nm7() {
		return rcv_grp_p().bp_grp_nm7();
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public void rcv_grp_nm7(String value) {
		rcv_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public String rcv_grp_cd8() {
		return rcv_grp_p().bp_grp_cd8();
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public void rcv_grp_cd8(String value) {
		rcv_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public String rcv_grp_nm8() {
		return rcv_grp_p().bp_grp_nm8();
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public void rcv_grp_nm8(String value) {
		rcv_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public String rcv_grp_cd9() {
		return rcv_grp_p().bp_grp_cd9();
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public void rcv_grp_cd9(String value) {
		rcv_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public String rcv_grp_nm9() {
		return rcv_grp_p().bp_grp_nm9();
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public void rcv_grp_nm9(String value) {
		rcv_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public String rcv_grp_cd10() {
		return rcv_grp_p().bp_grp_cd10();
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public void rcv_grp_cd10(String value) {
		rcv_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public String rcv_grp_nm10() {
		return rcv_grp_p().bp_grp_nm10();
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public void rcv_grp_nm10(String value) {
		rcv_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bill_grp_cd1() {
		return bill_grp_p().bp_grp_cd1();
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bill_grp_cd1(String value) {
		bill_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bill_grp_nm1() {
		return bill_grp_p().bp_grp_nm1();
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bill_grp_nm1(String value) {
		bill_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bill_grp_cd2() {
		return bill_grp_p().bp_grp_cd2();
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bill_grp_cd2(String value) {
		bill_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bill_grp_nm2() {
		return bill_grp_p().bp_grp_nm2();
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bill_grp_nm2(String value) {
		bill_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bill_grp_cd3() {
		return bill_grp_p().bp_grp_cd3();
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bill_grp_cd3(String value) {
		bill_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bill_grp_nm3() {
		return bill_grp_p().bp_grp_nm3();
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bill_grp_nm3(String value) {
		bill_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bill_grp_cd4() {
		return bill_grp_p().bp_grp_cd4();
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bill_grp_cd4(String value) {
		bill_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bill_grp_nm4() {
		return bill_grp_p().bp_grp_nm4();
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bill_grp_nm4(String value) {
		bill_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bill_grp_cd5() {
		return bill_grp_p().bp_grp_cd5();
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bill_grp_cd5(String value) {
		bill_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bill_grp_nm5() {
		return bill_grp_p().bp_grp_nm5();
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bill_grp_nm5(String value) {
		bill_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bill_grp_cd6() {
		return bill_grp_p().bp_grp_cd6();
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bill_grp_cd6(String value) {
		bill_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bill_grp_nm6() {
		return bill_grp_p().bp_grp_nm6();
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bill_grp_nm6(String value) {
		bill_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bill_grp_cd7() {
		return bill_grp_p().bp_grp_cd7();
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bill_grp_cd7(String value) {
		bill_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bill_grp_nm7() {
		return bill_grp_p().bp_grp_nm7();
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bill_grp_nm7(String value) {
		bill_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bill_grp_cd8() {
		return bill_grp_p().bp_grp_cd8();
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bill_grp_cd8(String value) {
		bill_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bill_grp_nm8() {
		return bill_grp_p().bp_grp_nm8();
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bill_grp_nm8(String value) {
		bill_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bill_grp_cd9() {
		return bill_grp_p().bp_grp_cd9();
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bill_grp_cd9(String value) {
		bill_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bill_grp_nm9() {
		return bill_grp_p().bp_grp_nm9();
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bill_grp_nm9(String value) {
		bill_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bill_grp_cd10() {
		return bill_grp_p().bp_grp_cd10();
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bill_grp_cd10(String value) {
		bill_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bill_grp_nm10() {
		return bill_grp_p().bp_grp_nm10();
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bill_grp_nm10(String value) {
		bill_grp_p().bp_grp_nm10(value);
	}

}

