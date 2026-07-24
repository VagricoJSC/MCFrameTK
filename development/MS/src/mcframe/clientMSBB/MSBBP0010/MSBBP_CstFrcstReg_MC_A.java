package mcframe.clientMSBB.MSBBP0010;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Srch01Caller;
import mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Imp01Caller;
import mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Sprt01Caller;
import mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Ins01Caller;
import mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Upd01Caller;
import mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Del01Caller;

/**
 * 画面"MSBBP_CstFrcstReg"パネルクラスです。<p>
 *
 * 顧客期間内示情報を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_CstFrcstReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBBP0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3;IMP,Input file,4 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3;IMP,ファイル入力,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_IMP = null;
	public MCLabel Cnd_cst_frcst_no_Label = null;
	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_frcst_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_cst_frcst_no_Label = null;
	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_cst_frcst_no = null;
	public MCLabel Hdr_cst_frcst_prnt_dt_Label = null;
	/**
	 * Customer forecast list issue date 得意先内示書発行日.<p>
	 *
	 */
	public MCDateField Hdr_cst_frcst_prnt_dt = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCCheckBox Hdr_can_flg = null;
	public MCLabel Hdr_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Hdr_cst_nm = null;
	public MCLabel Hdr_dlv_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Hdr_dlv_nm = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_usr_dpt_p_PPanel;
	public MCTextField Hdr_frcst_usr_cd;	// [Hdr]の[usr_dpt_p.usr_cd]を[Hdr_frcst_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_frcst_usr_nm;	// [Hdr]の[usr_dpt_p.usr_nm]を[Hdr_frcst_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_frcst_dpt_cd;	// [Hdr]の[usr_dpt_p.dpt_cd]を[Hdr_frcst_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_frcst_dpt_nm;	// [Hdr]の[usr_dpt_p.dpt_nm]を[Hdr_frcst_dpt_nm]としてエイリアス定義。
	/**
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_usr_cd = null;
	/**
	 * Customer dept. in charge cd. 得意先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_dpt_cd = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrk_no_p_PPanel;
	public MCTextField Hdr_wrk_no;	// [Hdr]の[wrk_no_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[wrk_no_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
	public MCLabel Hdr_can_rsn_cd_Label = null;
	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_can_rsn_cd = null;
	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public MCTextField Hdr_can_rsn_nm = null;
	public MCLabel Hdr_can_rmrks_Label = null;
	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public MCTextField Hdr_can_rmrks = null;
	public MCLabel Hdr_cst_frcst_slip_no_Label = null;
	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_cst_frcst_slip_no = null;
	public MCLabel Hdr_rcpt_dt_Label = null;
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDateField Hdr_rcpt_dt = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_sub_char1 = null;
	public MCLabel Hdr_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_sub_char2 = null;
	public MCLabel Hdr_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_sub_char3 = null;
	public MCLabel Hdr_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_nm = null;
	public MCLabel Hdr_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_nm = null;
	public MCLabel Hdr_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_nm = null;
	public MCLabel Hdr_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_nm = null;
	public MCLabel Hdr_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr_ins_ts = null;
	public MCLabel Hdr_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr_upd_ts = null;
	public MCLabel Hdr_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	// [SystemInfo]ブロック関連のField定義
	public MCPanel SystemInfoPanel = null;
	// [SystemInfo]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP0010.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_flg = null;
	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_frcst_no = null;
	/**
	 * Customer forecast list issue date 得意先内示書発行日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_frcst_prnt_dt = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_nm = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_usr_nm = null;
	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_dpt_cd = null;
	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_dpt_nm = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wrk_nm = null;
	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_frcst_slip_no = null;
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcpt_dt = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_frcst_d_no = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_period_typ = null;
	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_period_typ_nm = null;
	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_st_dt = null;
	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_end_dt = null;
	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_dt = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_qty = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	/**
	 * GI source location cd. 出庫元場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_loc_cd = null;
	/**
	 * GI source location name 出庫元場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_loc_nm = null;
	/**
	 * Customer forecast list details No. 得意先内示書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_frcst_slip_d_no = null;
	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_qty = null;
	/**
	 * Last customer forecast list issue date 前回得意先内示書発行日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_cst_frcst_prnt_dt = null;
	/**
	 * Last reception date 前回受付日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_rcpt_dt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_prms_qty_p_PPanel;
	public MCColumnConfig columnDtl_prms_qty;// [Dtl]の[prms_qty_p.qty]を[columnDtl_prms_qty]としてエイリアス定義。
	/**
	 * Lower priority 下位優先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_frcst_stop_flg = null;
	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spln_qty = null;
	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_qty = null;
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_intr_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char3 = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Sales order entry 受注登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1210 = null;
	/**
	 * Reference info. acquisition 参考情報取得.<p>
	 *
	 */
	public MCButton Btn_sprt_ref = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Btn_menu_move_p_PPanel;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_CAN]モードを表す定数 */
	public static final String UPD_CAN = "UPD_CAN";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [INS_FILE]モードを表す定数 */
	public static final String INS_FILE = "INS_FILE";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, FIX_I, SRCH, UPD, UPD_CAN, DEL, REF, FIX_U, FIX_D, INS_FILE};
	
	/** [MS_MSBBL0010_Srch01]のCallerの作成 */
	protected MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Srch01Caller createMS_MSBBL0010_Srch01() {
		MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Srch01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Srch01Bridge>
		caller = ((MSBBP_CstFrcstReg_MC)this).new MS_MSBBL0010_Srch01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Srch01Bridge>(
					(MSBBP_CstFrcstReg)this, new MS_MSBBL0010_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL0010_Srch01]の呼び出し */
	protected void callMS_MSBBL0010_Srch01() {
		MCCaller caller = createMS_MSBBL0010_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL0010_Imp01]のCallerの作成 */
	protected MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Imp01Caller createMS_MSBBL0010_Imp01() {
		MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Imp01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Imp01Bridge>
		caller = ((MSBBP_CstFrcstReg_MC)this).new MS_MSBBL0010_Imp01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Imp01Bridge>(
					(MSBBP_CstFrcstReg)this, new MS_MSBBL0010_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBBL0010_Imp01]の呼び出し */
	protected void callMS_MSBBL0010_Imp01() {
		MCCaller caller = createMS_MSBBL0010_Imp01();
		caller.exec();
	}
	/** [MS_MSBBL0010_Sprt01]のCallerの作成 */
	protected MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Sprt01Caller createMS_MSBBL0010_Sprt01() {
		MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Sprt01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Sprt01Bridge>
		caller = ((MSBBP_CstFrcstReg_MC)this).new MS_MSBBL0010_Sprt01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Sprt01Bridge>(
					(MSBBP_CstFrcstReg)this, new MS_MSBBL0010_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBBL0010_Sprt01]の呼び出し */
	protected void callMS_MSBBL0010_Sprt01() {
		MCCaller caller = createMS_MSBBL0010_Sprt01();
		caller.exec();
	}
	/** [MS_MSBBL0010_Ins01]のCallerの作成 */
	protected MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Ins01Caller createMS_MSBBL0010_Ins01() {
		MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Ins01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Ins01Bridge>
		caller = ((MSBBP_CstFrcstReg_MC)this).new MS_MSBBL0010_Ins01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Ins01Bridge>(
					(MSBBP_CstFrcstReg)this, new MS_MSBBL0010_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBBL0010_Ins01]の呼び出し */
	protected void callMS_MSBBL0010_Ins01() {
		MCCaller caller = createMS_MSBBL0010_Ins01();
		caller.exec();
	}
	/** [MS_MSBBL0010_Upd01]のCallerの作成 */
	protected MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Upd01Caller createMS_MSBBL0010_Upd01() {
		MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Upd01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Upd01Bridge>
		caller = ((MSBBP_CstFrcstReg_MC)this).new MS_MSBBL0010_Upd01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Upd01Bridge>(
					(MSBBP_CstFrcstReg)this, new MS_MSBBL0010_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL0010_Upd01]の呼び出し */
	protected void callMS_MSBBL0010_Upd01() {
		MCCaller caller = createMS_MSBBL0010_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL0010_Del01]のCallerの作成 */
	protected MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Del01Caller createMS_MSBBL0010_Del01() {
		MSBBP_CstFrcstReg_MC.MS_MSBBL0010_Del01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Del01Bridge>
		caller = ((MSBBP_CstFrcstReg_MC)this).new MS_MSBBL0010_Del01Caller<MSBBP_CstFrcstReg, MS_MSBBL0010_Del01Bridge>(
					(MSBBP_CstFrcstReg)this, new MS_MSBBL0010_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL0010_Del01]の呼び出し */
	protected void callMS_MSBBL0010_Del01() {
		MCCaller caller = createMS_MSBBL0010_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP0010.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP0010.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP0010.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0010.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP0010.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBB.MSBBP0010.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP0010.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP0010.HdrR createHdrR() {
		return mcframe.clientMSBB.MSBBP0010.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBB.MSBBP0010.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0010.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBB.MSBBP0010.DtlR createDtlR() {
		return mcframe.clientMSBB.MSBBP0010.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0010.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlL()) return "Dtl";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl")) return getDtlL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(CndPanel);
		ret.add(HdrTabPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(HdrPanel);
		ret.add(SystemInfoPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_CstFrcstReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_CstFrcstReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_CstFrcstReg_MC.jbCreateScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateCnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateHdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateTab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateTab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateHdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateSystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateDtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateBtn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbCreateEastBtn((MSBBP_CstFrcstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_CstFrcstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_CstFrcstReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBBP_CstFrcstReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_CstFrcstReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_CstFrcstReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBBP_CstFrcstReg p) {
		p.Hdr_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().usr_dpt_p());
		p.Hdr_usr_dpt_p_PPanel.setName("Hdr.usr_dpt_p");
		p.Hdr_frcst_usr_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_frcst_usr_cd.addAliasName("Hdr.frcst_usr_cd", p);
		p.Hdr_frcst_usr_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_frcst_usr_nm.addAliasName("Hdr.frcst_usr_nm", p);
		p.Hdr_frcst_dpt_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_frcst_dpt_cd.addAliasName("Hdr.frcst_dpt_cd", p);
		p.Hdr_frcst_dpt_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_frcst_dpt_nm.addAliasName("Hdr.frcst_dpt_nm", p);
		p.Hdr_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getHdrR().wrk_no_p());
		p.Hdr_wrk_no_p_PPanel.setName("Hdr.wrk_no_p");
		p.Hdr_wrk_no = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Hdr_wrk_no.addAliasName("Hdr.wrk_no", p);
		p.Hdr_wrk_nm = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Hdr_wrk_nm.addAliasName("Hdr.wrk_nm", p);
	}

	/**
	 * [SystemInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSystemInfo(MSBBP_CstFrcstReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBBP_CstFrcstReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP0010.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0010.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0010.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_prms_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0010.DtlR.$prms_qty_p);
		p.Dtl_prms_qty_p_PPanel.setName("Dtl.prms_qty_p");
		p.columnDtl_prms_qty = p.Dtl_prms_qty_p_PPanel.columnQty_qty;
		p.columnDtl_prms_qty.addAliasName("Dtl.prms_qty", p);
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBB.MSBBP0010.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_CstFrcstReg p) {
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_CstFrcstReg p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Hdr_cst_cd_ListPutter]の定義 */
	private MCListPutter Hdr_cst_cd_p = null;

	/**
	 * [Hdr_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_cst_cd_ListPutter() {
		if (Hdr_cst_cd_p == null) {
			Hdr_cst_cd_p = createHdr_cst_cd_ListPutter(Hdr_cst_cd, "cst_cd", "cst_nm","cst_usr_cd","cst_dpt_cd");

		}
		return Hdr_cst_cd_p;
	}
	
	
	/** [Hdr_dlv_cd_ListPutter]の定義 */
	private MCListPutter Hdr_dlv_cd_p = null;

	/**
	 * [Hdr_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dlv_cd_ListPutter() {
		if (Hdr_dlv_cd_p == null) {
			Hdr_dlv_cd_p = createHdr_dlv_cd_ListPutter(Hdr_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Hdr_dlv_cd_p;
	}
	
	
	/** [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "frcst_dpt_cd", "frcst_dpt_nm");
		}
		return Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_can_rsn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_can_rsn_cd_p = null;

	/**
	 * [Hdr_can_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_can_rsn_cd_ListPutter() {
		if (Hdr_can_rsn_cd_p == null) {
			Hdr_can_rsn_cd_p = createHdr_can_rsn_cd_ListPutter(Hdr_can_rsn_cd, "can_rsn_cd", "can_rsn_nm");

		}
		return Hdr_can_rsn_cd_p;
	}
	
	
	/** [Dtl_cst_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cst_itm_cd_p = null;

	/**
	 * [Dtl_cst_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_itm_cd_ListPutter() {
		if (Dtl_cst_itm_cd_p == null) {
			Dtl_cst_itm_cd_p = createDtl_cst_itm_cd_ListPutter(columnDtl_cst_itm_cd, "cst_itm_cd", "cst_itm_nm","itm_cd","itm_sub1","itm_sub2","itm_sub3");

		}
		return Dtl_cst_itm_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_frcst_period_typ_ListPutter]の定義 */
	private MCListPutter Dtl_frcst_period_typ_p = null;

	/**
	 * [Dtl_frcst_period_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_frcst_period_typ_ListPutter() {
		if (Dtl_frcst_period_typ_p == null) {
			Dtl_frcst_period_typ_p = createDtl_frcst_period_typ_ListPutter(columnDtl_frcst_period_typ, "frcst_period_typ", "frcst_period_typ_nm");

		}
		return Dtl_frcst_period_typ_p;
	}
	
	
	/** [Dtl_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_unit_cd_p = null;

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_unit_cd_ListPutter() {
		if (Dtl_trd_unit_cd_p == null) {
			Dtl_trd_unit_cd_p = createDtl_trd_unit_cd_ListPutter(columnDtl_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Dtl_trd_unit_cd_p;
	}
	
	
	/** [Dtl_gi_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gi_loc_cd_p = null;

	/**
	 * [Dtl_gi_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gi_loc_cd_ListPutter() {
		if (Dtl_gi_loc_cd_p == null) {
			Dtl_gi_loc_cd_p = createDtl_gi_loc_cd_ListPutter(columnDtl_gi_loc_cd, "gi_loc_cd", "gi_loc_nm");

		}
		return Dtl_gi_loc_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_CstFrcstReg create(){
		MSBBP_CstFrcstReg p = new MSBBP_CstFrcstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_CstFrcstReg create(String name){
		MSBBP_CstFrcstReg p = new MSBBP_CstFrcstReg(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MSBBP_CstFrcstReg_MC.jbfInitScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitCnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitHdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitTab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitTab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitHdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitSystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitDtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitBtn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbfInitEastBtn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitCnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitHdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitTab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitTab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitHdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitSystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitDtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitBtn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.jbInitEastBtn((MSBBP_CstFrcstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_IMP = p.beansFactory.createRadioButton("Cnd.ope_IMP");
		p.Cnd_cst_frcst_no_Label = p.beansFactory.createLabel("Cnd.cst_frcst_no_Label");
		p.Cnd_cst_frcst_no = p.beansFactory.createTextField("Cnd.cst_frcst_no");
		p.Cnd_cst_frcst_no.setLabel(p.Cnd_cst_frcst_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_cst_frcst_no_Label = p.beansFactory.createLabel("Hdr.cst_frcst_no_Label");
		p.Hdr_cst_frcst_no = p.beansFactory.createTextField("Hdr.cst_frcst_no");
		p.Hdr_cst_frcst_no.setLabel(p.Hdr_cst_frcst_no_Label);
		p.Hdr_cst_frcst_prnt_dt_Label = p.beansFactory.createLabel("Hdr.cst_frcst_prnt_dt_Label");
		p.Hdr_cst_frcst_prnt_dt = p.beansFactory.createDateField("Hdr.cst_frcst_prnt_dt");
		p.Hdr_cst_frcst_prnt_dt.setLabel(p.Hdr_cst_frcst_prnt_dt_Label);
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_cst_cd_Label = p.beansFactory.createLabel("Hdr.cst_cd_Label");
		p.Hdr_cst_cd = p.beansFactory.createTextField("Hdr.cst_cd");
		p.Hdr_cst_cd.setLabel(p.Hdr_cst_cd_Label);
		p.Hdr_cst_nm = p.beansFactory.createTextField("Hdr.cst_nm");
		p.Hdr_dlv_cd_Label = p.beansFactory.createLabel("Hdr.dlv_cd_Label");
		p.Hdr_dlv_cd = p.beansFactory.createTextField("Hdr.dlv_cd");
		p.Hdr_dlv_cd.setLabel(p.Hdr_dlv_cd_Label);
		p.Hdr_dlv_nm = p.beansFactory.createTextField("Hdr.dlv_nm");
		p.Hdr_cst_usr_cd = p.beansFactory.createTextField("Hdr.cst_usr_cd");
		p.Hdr_cst_dpt_cd = p.beansFactory.createTextField("Hdr.cst_dpt_cd");
		p.Hdr_can_rsn_cd_Label = p.beansFactory.createLabel("Hdr.can_rsn_cd_Label");
		p.Hdr_can_rsn_cd = p.beansFactory.createTextComboBox("Hdr.can_rsn_cd");
		p.Hdr_can_rsn_cd.setLabel(p.Hdr_can_rsn_cd_Label);
		p.Hdr_can_rsn_nm = p.beansFactory.createTextField("Hdr.can_rsn_nm");
		p.Hdr_can_rmrks_Label = p.beansFactory.createLabel("Hdr.can_rmrks_Label");
		p.Hdr_can_rmrks = p.beansFactory.createTextField("Hdr.can_rmrks");
		p.Hdr_can_rmrks.setLabel(p.Hdr_can_rmrks_Label);
		p.Hdr_cst_frcst_slip_no_Label = p.beansFactory.createLabel("Hdr.cst_frcst_slip_no_Label");
		p.Hdr_cst_frcst_slip_no = p.beansFactory.createTextField("Hdr.cst_frcst_slip_no");
		p.Hdr_cst_frcst_slip_no.setLabel(p.Hdr_cst_frcst_slip_no_Label);
		p.Hdr_rcpt_dt_Label = p.beansFactory.createLabel("Hdr.rcpt_dt_Label");
		p.Hdr_rcpt_dt = p.beansFactory.createDateField("Hdr.rcpt_dt");
		p.Hdr_rcpt_dt.setLabel(p.Hdr_rcpt_dt_Label);
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_ins_usr_id_Label = p.beansFactory.createLabel("Hdr.ins_usr_id_Label");
		p.Hdr_ins_usr_id = p.beansFactory.createTextField("Hdr.ins_usr_id");
		p.Hdr_ins_usr_id.setLabel(p.Hdr_ins_usr_id_Label);
		p.Hdr_ins_usr_nm = p.beansFactory.createTextField("Hdr.ins_usr_nm");
		p.Hdr_ins_func_id_Label = p.beansFactory.createLabel("Hdr.ins_func_id_Label");
		p.Hdr_ins_func_id = p.beansFactory.createTextField("Hdr.ins_func_id");
		p.Hdr_ins_func_id.setLabel(p.Hdr_ins_func_id_Label);
		p.Hdr_ins_func_nm = p.beansFactory.createTextField("Hdr.ins_func_nm");
		p.Hdr_upd_usr_id_Label = p.beansFactory.createLabel("Hdr.upd_usr_id_Label");
		p.Hdr_upd_usr_id = p.beansFactory.createTextField("Hdr.upd_usr_id");
		p.Hdr_upd_usr_id.setLabel(p.Hdr_upd_usr_id_Label);
		p.Hdr_upd_usr_nm = p.beansFactory.createTextField("Hdr.upd_usr_nm");
		p.Hdr_upd_func_id_Label = p.beansFactory.createLabel("Hdr.upd_func_id_Label");
		p.Hdr_upd_func_id = p.beansFactory.createTextField("Hdr.upd_func_id");
		p.Hdr_upd_func_id.setLabel(p.Hdr_upd_func_id_Label);
		p.Hdr_upd_func_nm = p.beansFactory.createTextField("Hdr.upd_func_nm");
		p.Hdr_ins_ts_Label = p.beansFactory.createLabel("Hdr.ins_ts_Label");
		p.Hdr_ins_ts = p.beansFactory.createTimestampField("Hdr.ins_ts");
		p.Hdr_ins_ts.setLabel(p.Hdr_ins_ts_Label);
		p.Hdr_upd_ts_Label = p.beansFactory.createLabel("Hdr.upd_ts_Label");
		p.Hdr_upd_ts = p.beansFactory.createTimestampField("Hdr.upd_ts");
		p.Hdr_upd_ts.setLabel(p.Hdr_upd_ts_Label);
		p.Hdr_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr.upd_srv_req_no_Label");
		p.Hdr_upd_srv_req_no = p.beansFactory.createTextField("Hdr.upd_srv_req_no");
		p.Hdr_upd_srv_req_no.setLabel(p.Hdr_upd_srv_req_no_Label);
	}

	/**
	 * [SystemInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSystemInfo(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.SystemInfoPanel = p.beansFactory.createPanel("SystemInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_fix_flg = p.beansFactory.createTableColumn("Dtl.fix_flg", MCColumnType.CHECK);
		p.columnDtl_cst_frcst_no = p.beansFactory.createTableColumn("Dtl.cst_frcst_no", MCColumnType.TEXT);
		p.columnDtl_cst_frcst_prnt_dt = p.beansFactory.createTableColumn("Dtl.cst_frcst_prnt_dt", MCColumnType.DATE);
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cd = p.beansFactory.createTableColumn("Dtl.dlv_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_nm = p.beansFactory.createTableColumn("Dtl.dlv_nm", MCColumnType.TEXT);
		p.columnDtl_frcst_usr_cd = p.beansFactory.createTableColumn("Dtl.frcst_usr_cd", MCColumnType.TEXT);
		p.columnDtl_frcst_usr_nm = p.beansFactory.createTableColumn("Dtl.frcst_usr_nm", MCColumnType.TEXT);
		p.columnDtl_frcst_dpt_cd = p.beansFactory.createTableColumn("Dtl.frcst_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_frcst_dpt_nm = p.beansFactory.createTableColumn("Dtl.frcst_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_wrk_no = p.beansFactory.createTableColumn("Dtl.wrk_no", MCColumnType.TEXT);
		p.columnDtl_wrk_nm = p.beansFactory.createTableColumn("Dtl.wrk_nm", MCColumnType.TEXT);
		p.columnDtl_cst_frcst_slip_no = p.beansFactory.createTableColumn("Dtl.cst_frcst_slip_no", MCColumnType.TEXT);
		p.columnDtl_rcpt_dt = p.beansFactory.createTableColumn("Dtl.rcpt_dt", MCColumnType.DATE);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_cst_frcst_d_no = p.beansFactory.createTableColumn("Dtl.cst_frcst_d_no", MCColumnType.TEXT);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_frcst_period_typ = p.beansFactory.createTableColumn("Dtl.frcst_period_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_frcst_period_typ_nm = p.beansFactory.createTableColumn("Dtl.frcst_period_typ_nm", MCColumnType.TEXT);
		p.columnDtl_frcst_st_dt = p.beansFactory.createTableColumn("Dtl.frcst_st_dt", MCColumnType.DATE);
		p.columnDtl_frcst_end_dt = p.beansFactory.createTableColumn("Dtl.frcst_end_dt", MCColumnType.DATE);
		p.columnDtl_frcst_dt = p.beansFactory.createTableColumn("Dtl.frcst_dt", MCColumnType.DATE);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_gi_loc_cd = p.beansFactory.createTableColumn("Dtl.gi_loc_cd", MCColumnType.TEXT);
		p.columnDtl_gi_loc_nm = p.beansFactory.createTableColumn("Dtl.gi_loc_nm", MCColumnType.TEXT);
		p.columnDtl_cst_frcst_slip_d_no = p.beansFactory.createTableColumn("Dtl.cst_frcst_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_last_qty = p.beansFactory.createTableColumn("Dtl.last_qty", MCColumnType.NUMBER);
		p.columnDtl_last_cst_frcst_prnt_dt = p.beansFactory.createTableColumn("Dtl.last_cst_frcst_prnt_dt", MCColumnType.DATE);
		p.columnDtl_last_rcpt_dt = p.beansFactory.createTableColumn("Dtl.last_rcpt_dt", MCColumnType.DATE);
		p.columnDtl_frcst_stop_flg = p.beansFactory.createTableColumn("Dtl.frcst_stop_flg", MCColumnType.CHECK);
		p.columnDtl_spln_qty = p.beansFactory.createTableColumn("Dtl.spln_qty", MCColumnType.NUMBER);
		p.columnDtl_slo_qty = p.beansFactory.createTableColumn("Dtl.slo_qty", MCColumnType.NUMBER);
		p.columnDtl_dtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.dtl_intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char1", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char2", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char3", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1210 = p.beansFactory.createButton("Btn.open_MSBBP1210", "open");
		p.Btn_sprt_ref = p.beansFactory.createButton("Btn.sprt_ref");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_IMP);
		p.Cnd_ope_IMP.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_IMP);
		p.ScreenOpePanel.add(p.Cnd_ope_IMP);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0010.CndR.ope_META);
		p.CndPanel.add(p.Cnd_cst_frcst_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_no);
		p.CndPanel.setLastBeans(p.Cnd_cst_frcst_no);
		p.Cnd_cst_frcst_no.setNextBeans(p.Cnd_srch);
		p.Cnd_cst_frcst_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0010.CndR.cst_frcst_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.Tab1Panel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.HdrTabTab.add(p.Tab2Panel, "HdrTab.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.HdrPanel, null);
		p.Tab1Panel.setLastBeans(p.HdrPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.SystemInfoPanel, null);
		p.Tab2Panel.setLastBeans(p.SystemInfoPanel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_cst_frcst_no_Label);
		p.HdrPanel.add(p.Hdr_cst_frcst_no);
		p.HdrPanel.setLastBeans(p.Hdr_cst_frcst_no);
		p.Hdr_cst_frcst_no.setNextBeans(p.Hdr_cst_frcst_prnt_dt);
		p.Hdr_cst_frcst_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.cst_frcst_no_META);
		p.HdrPanel.add(p.Hdr_cst_frcst_prnt_dt_Label);
		p.HdrPanel.add(p.Hdr_cst_frcst_prnt_dt);
		p.Hdr_cst_frcst_prnt_dt.setNextBeans(p.Hdr_can_flg);
		p.Hdr_cst_frcst_prnt_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.cst_frcst_prnt_dt_META);
		p.Hdr_cst_frcst_prnt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_cst_cd);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.can_flg_META);
		p.HdrPanel.add(p.Hdr_cst_cd_Label);
		p.HdrPanel.add(p.Hdr_cst_cd);
		p.Hdr_cst_cd.setNextBeans(p.Hdr_cst_nm);
		p.Hdr_cst_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.cst_cd_META);
		p.Hdr_cst_cd.addLinkBeans(p.Hdr_cst_nm,p.Hdr_cst_usr_cd,p.Hdr_cst_dpt_cd);
		p.Hdr_cst_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_cst_nm);
		p.Hdr_cst_nm.setNextBeans(p.Hdr_dlv_cd);
		p.Hdr_cst_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.cst_nm_META);
		p.HdrPanel.add(p.Hdr_dlv_cd_Label);
		p.HdrPanel.add(p.Hdr_dlv_cd);
		p.Hdr_dlv_cd.setNextBeans(p.Hdr_dlv_nm);
		p.Hdr_dlv_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.dlv_cd_META);
		p.Hdr_dlv_cd.addLinkBeans(p.Hdr_dlv_nm);
		p.Hdr_dlv_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dlv_nm);
		p.Hdr_dlv_nm.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_dlv_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.dlv_nm_META);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_cst_usr_cd);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_frcst_dpt_nm);
		p.HdrPanel.add(p.Hdr_cst_usr_cd);
		p.Hdr_cst_usr_cd.setNextBeans(p.Hdr_cst_dpt_cd);
		p.Hdr_cst_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.cst_usr_cd_META);
		p.HdrPanel.add(p.Hdr_cst_dpt_cd);
		p.Hdr_cst_dpt_cd.setNextBeans(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_cst_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.cst_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_wrk_no_p_PPanel.setNextBeans(p.Hdr_can_rsn_cd);
		p.Hdr_can_rsn_cd.setListType(MCListType.STRICT);
		p.Hdr_can_rsn_cd.setLinkBeans(p.Hdr_can_rsn_nm);
		p.HdrPanel.add(p.Hdr_can_rsn_cd_Label);
		p.HdrPanel.add(p.Hdr_can_rsn_cd);
		p.Hdr_can_rsn_cd.setNextBeans(p.Hdr_can_rsn_nm);
		p.Hdr_can_rsn_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.can_rsn_cd_META);
		p.HdrPanel.add(p.Hdr_can_rsn_nm);
		p.Hdr_can_rsn_nm.setNextBeans(p.Hdr_can_rmrks);
		p.Hdr_can_rsn_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.can_rsn_nm_META);
		p.HdrPanel.add(p.Hdr_can_rmrks_Label);
		p.HdrPanel.add(p.Hdr_can_rmrks);
		p.Hdr_can_rmrks.setNextBeans(p.Hdr_cst_frcst_slip_no);
		p.Hdr_can_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.can_rmrks_META);
		p.HdrPanel.add(p.Hdr_cst_frcst_slip_no_Label);
		p.HdrPanel.add(p.Hdr_cst_frcst_slip_no);
		p.Hdr_cst_frcst_slip_no.setNextBeans(p.Hdr_rcpt_dt);
		p.Hdr_cst_frcst_slip_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.cst_frcst_slip_no_META);
		p.HdrPanel.add(p.Hdr_rcpt_dt_Label);
		p.HdrPanel.add(p.Hdr_rcpt_dt);
		p.Hdr_rcpt_dt.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_rcpt_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.rcpt_dt_META);
		p.Hdr_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.sub_char3_META);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_id_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_id);
		p.SystemInfoPanel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.ins_usr_id_META);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.ins_usr_nm_META);
		p.SystemInfoPanel.add(p.Hdr_ins_func_id_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.ins_func_id_META);
		p.SystemInfoPanel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.ins_func_nm_META);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_id_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.upd_usr_id_META);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.upd_usr_nm_META);
		p.SystemInfoPanel.add(p.Hdr_upd_func_id_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.upd_func_id_META);
		p.SystemInfoPanel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.upd_func_nm_META);
		p.SystemInfoPanel.add(p.Hdr_ins_ts_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SystemInfoPanel.add(p.Hdr_upd_ts_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SystemInfoPanel.add(p.Hdr_upd_srv_req_no_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0010.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [SystemInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSystemInfo(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.SystemInfoPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP1210);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setNextBeans(p.Btn_sprt_ref);
		p.Btn_sprt_ref.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_sprt_ref);
		p.Btn_sprt_ref.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_menu_move_p_PPanel);
		p.BtnPanel.add(p.Btn_menu_move_p_PPanel);
		p.Btn_menu_move_p_PPanel.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBBP_CstFrcstReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBBP_CstFrcstReg_MC.mcInitScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitCnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitHdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitTab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitTab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitHdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitSystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitDtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitBtn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.mcInitEastBtn((MSBBP_CstFrcstReg)this);

		// [INS]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitINS_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS_EastBtn((MSBBP_CstFrcstReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__I_EastBtn((MSBBP_CstFrcstReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitSRCH_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitSRCH_EastBtn((MSBBP_CstFrcstReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitUPD_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD_EastBtn((MSBBP_CstFrcstReg)this);

		// [UPD_CAN]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitUPD__CAN_EastBtn((MSBBP_CstFrcstReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitDEL_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitDEL_EastBtn((MSBBP_CstFrcstReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitREF_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitREF_EastBtn((MSBBP_CstFrcstReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__U_EastBtn((MSBBP_CstFrcstReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitFIX__D_EastBtn((MSBBP_CstFrcstReg)this);

		// [INS_FILE]ステータスのモードの設定
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_ScreenOpe((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_Cnd((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_HdrTab((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_Tab1((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_Tab2((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_Hdr((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_SystemInfo((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_Dtl((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_Btn((MSBBP_CstFrcstReg)this);
		MSBBP_CstFrcstReg_MC.statusInitINS__FILE_EastBtn((MSBBP_CstFrcstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_CstFrcstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_CstFrcstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_IMP.addAllListener(p);
		p.Cnd_cst_frcst_no.setListListener(p);
		p.Cnd_cst_frcst_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBBP_CstFrcstReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_CstFrcstReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_CstFrcstReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBBP_CstFrcstReg p) {
		p.Hdr_cst_frcst_no.setListListener(p);
		p.Hdr_cst_frcst_no.addAllListener(p);
		p.Hdr_cst_frcst_prnt_dt.setListListener(p);
		p.Hdr_cst_frcst_prnt_dt.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_cst_cd.setListListener(p);
		p.Hdr_cst_cd.addAllListener(p);
		p.Hdr_cst_nm.setListListener(p);
		p.Hdr_cst_nm.addAllListener(p);
		p.Hdr_dlv_cd.setListListener(p);
		p.Hdr_dlv_cd.addAllListener(p);
		p.Hdr_dlv_nm.setListListener(p);
		p.Hdr_dlv_nm.addAllListener(p);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_cst_usr_cd.setListListener(p);
		p.Hdr_cst_usr_cd.addAllListener(p);
		p.Hdr_cst_dpt_cd.setListListener(p);
		p.Hdr_cst_dpt_cd.addAllListener(p);
		p.Hdr_can_rsn_cd.setListListener(p);
		p.Hdr_can_rsn_cd.addAllListener(p);
		p.Hdr_can_rsn_nm.setListListener(p);
		p.Hdr_can_rsn_nm.addAllListener(p);
		p.Hdr_can_rmrks.setListListener(p);
		p.Hdr_can_rmrks.addAllListener(p);
		p.Hdr_cst_frcst_slip_no.setListListener(p);
		p.Hdr_cst_frcst_slip_no.addAllListener(p);
		p.Hdr_rcpt_dt.setListListener(p);
		p.Hdr_rcpt_dt.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_ins_usr_id.setListListener(p);
		p.Hdr_ins_usr_id.addAllListener(p);
		p.Hdr_ins_usr_nm.setListListener(p);
		p.Hdr_ins_usr_nm.addAllListener(p);
		p.Hdr_ins_func_id.setListListener(p);
		p.Hdr_ins_func_id.addAllListener(p);
		p.Hdr_ins_func_nm.setListListener(p);
		p.Hdr_ins_func_nm.addAllListener(p);
		p.Hdr_upd_usr_id.setListListener(p);
		p.Hdr_upd_usr_id.addAllListener(p);
		p.Hdr_upd_usr_nm.setListListener(p);
		p.Hdr_upd_usr_nm.addAllListener(p);
		p.Hdr_upd_func_id.setListListener(p);
		p.Hdr_upd_func_id.addAllListener(p);
		p.Hdr_upd_func_nm.setListListener(p);
		p.Hdr_upd_func_nm.addAllListener(p);
		p.Hdr_ins_ts.setListListener(p);
		p.Hdr_ins_ts.addAllListener(p);
		p.Hdr_upd_ts.setListListener(p);
		p.Hdr_upd_ts.addAllListener(p);
		p.Hdr_upd_srv_req_no.setListListener(p);
		p.Hdr_upd_srv_req_no.addAllListener(p);
	}

	/**
	 *  [SystemInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSystemInfo(MSBBP_CstFrcstReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBBP_CstFrcstReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_fix_flg.addAllListener(p);
		p.columnDtl_cst_frcst_no.addAllListener(p);
		p.columnDtl_cst_frcst_no.setListListener(p);
		p.columnDtl_cst_frcst_prnt_dt.addAllListener(p);
		p.columnDtl_cst_frcst_prnt_dt.setListListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
		p.columnDtl_dlv_cd.addAllListener(p);
		p.columnDtl_dlv_cd.setListListener(p);
		p.columnDtl_dlv_nm.addAllListener(p);
		p.columnDtl_dlv_nm.setListListener(p);
		p.columnDtl_frcst_usr_cd.addAllListener(p);
		p.columnDtl_frcst_usr_cd.setListListener(p);
		p.columnDtl_frcst_usr_nm.addAllListener(p);
		p.columnDtl_frcst_usr_nm.setListListener(p);
		p.columnDtl_frcst_dpt_cd.addAllListener(p);
		p.columnDtl_frcst_dpt_cd.setListListener(p);
		p.columnDtl_frcst_dpt_nm.addAllListener(p);
		p.columnDtl_frcst_dpt_nm.setListListener(p);
		p.columnDtl_wrk_no.addAllListener(p);
		p.columnDtl_wrk_no.setListListener(p);
		p.columnDtl_wrk_nm.addAllListener(p);
		p.columnDtl_wrk_nm.setListListener(p);
		p.columnDtl_cst_frcst_slip_no.addAllListener(p);
		p.columnDtl_cst_frcst_slip_no.setListListener(p);
		p.columnDtl_rcpt_dt.addAllListener(p);
		p.columnDtl_rcpt_dt.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_cst_frcst_d_no.addAllListener(p);
		p.columnDtl_cst_frcst_d_no.setListListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_frcst_period_typ.addAllListener(p);
		p.columnDtl_frcst_period_typ.setListListener(p);
		p.columnDtl_frcst_period_typ_nm.addAllListener(p);
		p.columnDtl_frcst_period_typ_nm.setListListener(p);
		p.columnDtl_frcst_st_dt.addAllListener(p);
		p.columnDtl_frcst_st_dt.setListListener(p);
		p.columnDtl_frcst_end_dt.addAllListener(p);
		p.columnDtl_frcst_end_dt.setListListener(p);
		p.columnDtl_frcst_dt.addAllListener(p);
		p.columnDtl_frcst_dt.setListListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
		p.columnDtl_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_gi_loc_cd.addAllListener(p);
		p.columnDtl_gi_loc_cd.setListListener(p);
		p.columnDtl_gi_loc_nm.addAllListener(p);
		p.columnDtl_gi_loc_nm.setListListener(p);
		p.columnDtl_cst_frcst_slip_d_no.addAllListener(p);
		p.columnDtl_cst_frcst_slip_d_no.setListListener(p);
		p.columnDtl_last_qty.addAllListener(p);
		p.columnDtl_last_qty.setListListener(p);
		p.columnDtl_last_cst_frcst_prnt_dt.addAllListener(p);
		p.columnDtl_last_cst_frcst_prnt_dt.setListListener(p);
		p.columnDtl_last_rcpt_dt.addAllListener(p);
		p.columnDtl_last_rcpt_dt.setListListener(p);
		p.columnDtl_frcst_stop_flg.addAllListener(p);
		p.columnDtl_spln_qty.addAllListener(p);
		p.columnDtl_spln_qty.setListListener(p);
		p.columnDtl_slo_qty.addAllListener(p);
		p.columnDtl_slo_qty.setListListener(p);
		p.columnDtl_dtl_intr_rmrks.addAllListener(p);
		p.columnDtl_dtl_intr_rmrks.setListListener(p);
		p.columnDtl_dtl_sub_char1.addAllListener(p);
		p.columnDtl_dtl_sub_char1.setListListener(p);
		p.columnDtl_dtl_sub_char2.addAllListener(p);
		p.columnDtl_dtl_sub_char2.setListListener(p);
		p.columnDtl_dtl_sub_char3.addAllListener(p);
		p.columnDtl_dtl_sub_char3.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_CstFrcstReg p) {
		p.Btn_open_MSBBP1210.addAllListener(p);
		p.Btn_open_MSBBP1210.setAPMethodName("doBtn_open_MSBBP1210");
		p.Btn_sprt_ref.addAllListener(p);
		p.Btn_sprt_ref.setAPMethodName("doBtn_sprt_ref");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBBP_CstFrcstReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dlv_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_cst_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE);
		p.Hdr_can_rsn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_can_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcpt_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_frcst_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_frcst_period_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_frcst_period_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_frcst_end_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_frcst_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_gi_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_last_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_last_rcpt_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_prms_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_frcst_stop_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_spln_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, INS, MCMode.DISABLE);
		p.Btn_sprt_ref.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_can_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_frcst_period_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_frcst_period_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_frcst_end_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_frcst_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_last_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_last_rcpt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_prms_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_frcst_stop_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_spln_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sprt_ref.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_can_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_frcst_period_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_frcst_period_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_frcst_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_frcst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_rcpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_prms_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_frcst_stop_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_spln_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_ref.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_cst_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE);
		p.Hdr_can_rsn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_can_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcpt_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_frcst_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_frcst_period_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_frcst_period_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_frcst_end_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_frcst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_gi_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_last_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_last_rcpt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_prms_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_frcst_stop_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_spln_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_sprt_ref.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, UPD_CAN, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, UPD_CAN, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_CAN, MCMode.ENABLE);

	}

	/**
	 * [UPD_CAN]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD_CAN]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD_CAN]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD_CAN]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_dlv_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_CAN, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD_CAN, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_can_rsn_cd.putMode(p, UPD_CAN, MCMode.ENABLE);
		p.Hdr_can_rsn_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, UPD_CAN, MCMode.ENABLE);
		p.Hdr_cst_frcst_slip_no.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_CAN]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [UPD_CAN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_no.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_frcst_period_typ.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_frcst_period_typ_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_frcst_end_dt.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_frcst_dt.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_last_qty.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_last_rcpt_dt.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.Dtl_prms_qty_p_PPanel.putStatus(UPD_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_frcst_stop_flg.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_spln_qty.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_slo_qty.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.columnDtl_dtl_intr_rmrks.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [UPD_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, UPD_CAN, MCMode.DISABLE);
		p.Btn_sprt_ref.putMode(p, UPD_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_CAN, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, UPD_CAN, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD_CAN, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_CAN, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_CAN, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD_CAN, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, UPD_CAN, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_CAN, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_CAN, MCMode.DISABLE);

	}

	/**
	 * [UPD_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_can_rsn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_can_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_cst_frcst_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_frcst_period_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_frcst_period_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_frcst_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_frcst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_last_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_last_rcpt_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_prms_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_frcst_stop_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_spln_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_slo_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sprt_ref.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_can_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_frcst_period_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_frcst_period_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_frcst_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_frcst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_rcpt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_prms_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_frcst_stop_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_spln_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_sprt_ref.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_can_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_frcst_period_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_frcst_period_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_frcst_end_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_frcst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_last_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_last_rcpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_prms_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_frcst_stop_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_spln_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt_ref.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_can_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_frcst_usr_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_frcst_dpt_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_wrk_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_slip_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_rcpt_dt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_frcst_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_frcst_period_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_frcst_period_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_frcst_end_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_frcst_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_last_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_last_rcpt_dt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_prms_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_frcst_stop_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_spln_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_slo_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sprt_ref.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS_FILE]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_ScreenOpe(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS_FILE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_Cnd(MSBBP_CstFrcstReg p){
		p.Cnd_ope_Group.putMode(p, INS_FILE, MCMode.REQUIRED);
		p.Cnd_cst_frcst_no.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_FILE, MCMode.DISABLE);

	}

	/**
	 * [INS_FILE]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_HdrTab(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS_FILE]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_Tab1(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS_FILE]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_Tab2(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS_FILE]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_Hdr(MSBBP_CstFrcstReg p){
		p.Hdr_cst_frcst_no.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_prnt_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_dlv_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_dlv_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_FILE, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(INS_FILE, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_can_rsn_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_can_rsn_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_can_rmrks.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_cst_frcst_slip_no.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_FILE, MCMode.READ_ONLY);

	}

	/**
	 * [INS_FILE]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_SystemInfo(MSBBP_CstFrcstReg p){

	}

	/**
	 * [INS_FILE]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_Dtl(MSBBP_CstFrcstReg p){
		p.columnDtl_fix_flg.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_no.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_prnt_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_frcst_usr_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_frcst_usr_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_frcst_dpt_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_frcst_dpt_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_no.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_rcpt_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_d_no.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS_FILE, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_frcst_period_typ.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_frcst_period_typ_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_frcst_st_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_frcst_end_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_frcst_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS_FILE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS_FILE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_cst_frcst_slip_d_no.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_last_qty.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_last_cst_frcst_prnt_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_last_rcpt_dt.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Dtl_prms_qty_p_PPanel.putStatus(INS_FILE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_frcst_stop_flg.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_spln_qty.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_slo_qty.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_dtl_intr_rmrks.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_FILE, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(INS_FILE, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [INS_FILE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_Btn(MSBBP_CstFrcstReg p){
		p.Btn_open_MSBBP1210.putMode(p, INS_FILE, MCMode.DISABLE);
		p.Btn_sprt_ref.putMode(p, INS_FILE, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INS_FILE, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS_FILE, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS_FILE, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_FILE, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_FILE, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS_FILE, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, INS_FILE, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_FILE, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_FILE, MCMode.DISABLE);

	}

	/**
	 * [INS_FILE]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__FILE_EastBtn(MSBBP_CstFrcstReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_CstFrcstReg_MC.setTableConfigDtl((MSBBP_CstFrcstReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBBP_CstFrcstReg p) {
		p.columnDtl_fix_flg.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_flg);
		p.columnDtl_cst_frcst_no.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_frcst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_frcst_no);
		p.columnDtl_cst_frcst_prnt_dt.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_frcst_prnt_dt_META);
		p.columnDtl_cst_frcst_prnt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_frcst_prnt_dt);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.columnDtl_dlv_cd.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.dlv_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cd);
		p.columnDtl_dlv_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.dlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_nm);
		p.columnDtl_frcst_usr_cd.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_usr_cd);
		p.columnDtl_frcst_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_usr_nm);
		p.columnDtl_frcst_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_dpt_cd);
		p.columnDtl_frcst_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_dpt_nm);
		p.columnDtl_wrk_no.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.wrk_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wrk_no);
		p.columnDtl_wrk_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.wrk_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wrk_nm);
		p.columnDtl_cst_frcst_slip_no.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_frcst_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_frcst_slip_no);
		p.columnDtl_rcpt_dt.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.rcpt_dt_META);
		p.columnDtl_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_rcpt_dt);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_cst_frcst_d_no.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_frcst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_frcst_d_no);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_itm_cd_META);
		p.columnDtl_cst_itm_cd.addLinkBeans(p.columnDtl_cst_itm_nm,p.columnDtl_itm_cd,p.columnDtl_itm_sub1,p.columnDtl_itm_sub2,p.columnDtl_itm_sub3);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ);
		p.columnDtl_frcst_period_typ.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_period_typ_META);
		p.columnDtl_frcst_period_typ.addLinkBeans(p.columnDtl_frcst_period_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_period_typ);
		p.columnDtl_frcst_period_typ_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_period_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_period_typ_nm);
		p.columnDtl_frcst_st_dt.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_st_dt_META);
		p.columnDtl_frcst_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_st_dt);
		p.columnDtl_frcst_end_dt.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_end_dt_META);
		p.columnDtl_frcst_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_end_dt);
		p.columnDtl_frcst_dt.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_dt_META);
		p.columnDtl_frcst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_dt);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty,p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_gi_loc_cd.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.gi_loc_cd_META);
		p.columnDtl_gi_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_gi_loc_cd.addLinkBeans(p.columnDtl_gi_loc_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_loc_cd);
		p.columnDtl_gi_loc_nm.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.gi_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_loc_nm);
		p.columnDtl_cst_frcst_slip_d_no.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.cst_frcst_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_frcst_slip_d_no);
		p.columnDtl_last_qty.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.last_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_qty);
		p.columnDtl_last_cst_frcst_prnt_dt.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.last_cst_frcst_prnt_dt_META);
		p.columnDtl_last_cst_frcst_prnt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_last_cst_frcst_prnt_dt);
		p.columnDtl_last_rcpt_dt.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.last_rcpt_dt_META);
		p.columnDtl_last_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_last_rcpt_dt);
		p.DtlTable.addTable(p.Dtl_prms_qty_p_PPanel.QtyTable);
		p.columnDtl_frcst_stop_flg.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.frcst_stop_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_frcst_stop_flg);
		p.columnDtl_spln_qty.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.spln_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spln_qty);
		p.columnDtl_slo_qty.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.slo_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_qty);
		p.columnDtl_dtl_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.dtl_intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_intr_rmrks);
		p.columnDtl_dtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.dtl_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char1);
		p.columnDtl_dtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.dtl_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char2);
		p.columnDtl_dtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.dtl_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char3);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBB.MSBBP0010.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_fix_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_cst_cd.getListConfig().setPutter(getHdr_cst_cd_ListPutter());
		Hdr_dlv_cd.getListConfig().setPutter(getHdr_dlv_cd_ListPutter());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_can_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_can_rsn_cd.getListConfig().setPutter(getHdr_can_rsn_cd_ListPutter());
		columnDtl_cst_itm_cd.getListConfig().setPutter(getDtl_cst_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_frcst_period_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_frcst_period_typ.getListConfig().setPutter(getDtl_frcst_period_typ_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		columnDtl_gi_loc_cd.getListConfig().setPutter(getDtl_gi_loc_cd_ListPutter());
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_CANStatus() {
		status = UPD_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_FILE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_FILEStatus() {
		status = INS_FILE;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_CAN.equals(status)) {
			setUPD_CANStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (INS_FILE.equals(status)) {
			setINS_FILEStatus();
		}
	}

	/**
	 * [Hdr_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Hdr_can_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_can_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SloCanRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_frcst_period_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_frcst_period_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PeriodTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl_gi_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gi_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_cst_cd) return getHdr_cst_cd(row, info);
		if(combo == Hdr_dlv_cd) return getHdr_dlv_cd(row, info);
		if(combo == Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_can_rsn_cd) return getHdr_can_rsn_cd(row, info);
		if(combo == columnDtl_cst_itm_cd) return getDtl_cst_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_frcst_period_typ) return getDtl_frcst_period_typ(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == columnDtl_gi_loc_cd) return getDtl_gi_loc_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Btn_open_MSBBP1210) doBtn_open_MSBBP1210(info);
		else if (ap == Btn_sprt_ref) doBtn_sprt_ref(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1210(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_ref]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_ref(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cst_frcst_no) return doCnd_cst_frcst_no_VC(info);
		if (vc == Hdr_cst_frcst_no) return doHdr_cst_frcst_no_VC(info);
		if (vc == Hdr_cst_frcst_prnt_dt) return doHdr_cst_frcst_prnt_dt_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_cst_cd) return doHdr_cst_cd_VC(info);
		if (vc == Hdr_cst_nm) return doHdr_cst_nm_VC(info);
		if (vc == Hdr_dlv_cd) return doHdr_dlv_cd_VC(info);
		if (vc == Hdr_dlv_nm) return doHdr_dlv_nm_VC(info);
		if (vc == Hdr_cst_usr_cd) return doHdr_cst_usr_cd_VC(info);
		if (vc == Hdr_cst_dpt_cd) return doHdr_cst_dpt_cd_VC(info);
		if (vc == Hdr_can_rsn_cd) return doHdr_can_rsn_cd_VC(info);
		if (vc == Hdr_can_rsn_nm) return doHdr_can_rsn_nm_VC(info);
		if (vc == Hdr_can_rmrks) return doHdr_can_rmrks_VC(info);
		if (vc == Hdr_cst_frcst_slip_no) return doHdr_cst_frcst_slip_no_VC(info);
		if (vc == Hdr_rcpt_dt) return doHdr_rcpt_dt_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_ins_usr_id) return doHdr_ins_usr_id_VC(info);
		if (vc == Hdr_ins_usr_nm) return doHdr_ins_usr_nm_VC(info);
		if (vc == Hdr_ins_func_id) return doHdr_ins_func_id_VC(info);
		if (vc == Hdr_ins_func_nm) return doHdr_ins_func_nm_VC(info);
		if (vc == Hdr_upd_usr_id) return doHdr_upd_usr_id_VC(info);
		if (vc == Hdr_upd_usr_nm) return doHdr_upd_usr_nm_VC(info);
		if (vc == Hdr_upd_func_id) return doHdr_upd_func_id_VC(info);
		if (vc == Hdr_upd_func_nm) return doHdr_upd_func_nm_VC(info);
		if (vc == Hdr_ins_ts) return doHdr_ins_ts_VC(info);
		if (vc == Hdr_upd_ts) return doHdr_upd_ts_VC(info);
		if (vc == Hdr_upd_srv_req_no) return doHdr_upd_srv_req_no_VC(info);
		if (vc == columnDtl_fix_flg) return doDtl_fix_flg_VC(info);
		if (vc == columnDtl_cst_frcst_no) return doDtl_cst_frcst_no_VC(info);
		if (vc == columnDtl_cst_frcst_prnt_dt) return doDtl_cst_frcst_prnt_dt_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		if (vc == columnDtl_dlv_cd) return doDtl_dlv_cd_VC(info);
		if (vc == columnDtl_dlv_nm) return doDtl_dlv_nm_VC(info);
		if (vc == columnDtl_frcst_usr_cd) return doDtl_frcst_usr_cd_VC(info);
		if (vc == columnDtl_frcst_usr_nm) return doDtl_frcst_usr_nm_VC(info);
		if (vc == columnDtl_frcst_dpt_cd) return doDtl_frcst_dpt_cd_VC(info);
		if (vc == columnDtl_frcst_dpt_nm) return doDtl_frcst_dpt_nm_VC(info);
		if (vc == columnDtl_wrk_no) return doDtl_wrk_no_VC(info);
		if (vc == columnDtl_wrk_nm) return doDtl_wrk_nm_VC(info);
		if (vc == columnDtl_cst_frcst_slip_no) return doDtl_cst_frcst_slip_no_VC(info);
		if (vc == columnDtl_rcpt_dt) return doDtl_rcpt_dt_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_cst_frcst_d_no) return doDtl_cst_frcst_d_no_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_frcst_period_typ) return doDtl_frcst_period_typ_VC(info);
		if (vc == columnDtl_frcst_period_typ_nm) return doDtl_frcst_period_typ_nm_VC(info);
		if (vc == columnDtl_frcst_st_dt) return doDtl_frcst_st_dt_VC(info);
		if (vc == columnDtl_frcst_end_dt) return doDtl_frcst_end_dt_VC(info);
		if (vc == columnDtl_frcst_dt) return doDtl_frcst_dt_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_gi_loc_cd) return doDtl_gi_loc_cd_VC(info);
		if (vc == columnDtl_gi_loc_nm) return doDtl_gi_loc_nm_VC(info);
		if (vc == columnDtl_cst_frcst_slip_d_no) return doDtl_cst_frcst_slip_d_no_VC(info);
		if (vc == columnDtl_last_qty) return doDtl_last_qty_VC(info);
		if (vc == columnDtl_last_cst_frcst_prnt_dt) return doDtl_last_cst_frcst_prnt_dt_VC(info);
		if (vc == columnDtl_last_rcpt_dt) return doDtl_last_rcpt_dt_VC(info);
		if (vc == columnDtl_frcst_stop_flg) return doDtl_frcst_stop_flg_VC(info);
		if (vc == columnDtl_spln_qty) return doDtl_spln_qty_VC(info);
		if (vc == columnDtl_slo_qty) return doDtl_slo_qty_VC(info);
		if (vc == columnDtl_dtl_intr_rmrks) return doDtl_dtl_intr_rmrks_VC(info);
		if (vc == columnDtl_dtl_sub_char1) return doDtl_dtl_sub_char1_VC(info);
		if (vc == columnDtl_dtl_sub_char2) return doDtl_dtl_sub_char2_VC(info);
		if (vc == columnDtl_dtl_sub_char3) return doDtl_dtl_sub_char3_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		return true;
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_frcst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_frcst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_frcst_prnt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_frcst_prnt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[can_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_can_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[can_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_can_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[can_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_can_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_frcst_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_frcst_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_frcst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_frcst_prnt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_frcst_prnt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_frcst_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_frcst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_frcst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_period_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_frcst_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_cst_frcst_prnt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_cst_frcst_prnt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[frcst_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_frcst_stop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spln_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spln_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NC(info);
		else if (nc == Hdr_cst_frcst_no) doHdr_cst_frcst_no_NC(info);
		else if (nc == Hdr_cst_frcst_prnt_dt) doHdr_cst_frcst_prnt_dt_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_cst_cd) doHdr_cst_cd_NC(info);
		else if (nc == Hdr_cst_nm) doHdr_cst_nm_NC(info);
		else if (nc == Hdr_dlv_cd) doHdr_dlv_cd_NC(info);
		else if (nc == Hdr_dlv_nm) doHdr_dlv_nm_NC(info);
		else if (nc == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NC(info);
		else if (nc == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NC(info);
		else if (nc == Hdr_can_rsn_cd) doHdr_can_rsn_cd_NC(info);
		else if (nc == Hdr_can_rsn_nm) doHdr_can_rsn_nm_NC(info);
		else if (nc == Hdr_can_rmrks) doHdr_can_rmrks_NC(info);
		else if (nc == Hdr_cst_frcst_slip_no) doHdr_cst_frcst_slip_no_NC(info);
		else if (nc == Hdr_rcpt_dt) doHdr_rcpt_dt_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_ins_usr_id) doHdr_ins_usr_id_NC(info);
		else if (nc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NC(info);
		else if (nc == Hdr_ins_func_id) doHdr_ins_func_id_NC(info);
		else if (nc == Hdr_ins_func_nm) doHdr_ins_func_nm_NC(info);
		else if (nc == Hdr_upd_usr_id) doHdr_upd_usr_id_NC(info);
		else if (nc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NC(info);
		else if (nc == Hdr_upd_func_id) doHdr_upd_func_id_NC(info);
		else if (nc == Hdr_upd_func_nm) doHdr_upd_func_nm_NC(info);
		else if (nc == Hdr_ins_ts) doHdr_ins_ts_NC(info);
		else if (nc == Hdr_upd_ts) doHdr_upd_ts_NC(info);
		else if (nc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_fix_flg) doDtl_fix_flg_NC(info);
		else if (nc == columnDtl_cst_frcst_no) doDtl_cst_frcst_no_NC(info);
		else if (nc == columnDtl_cst_frcst_prnt_dt) doDtl_cst_frcst_prnt_dt_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
		else if (nc == columnDtl_dlv_cd) doDtl_dlv_cd_NC(info);
		else if (nc == columnDtl_dlv_nm) doDtl_dlv_nm_NC(info);
		else if (nc == columnDtl_frcst_usr_cd) doDtl_frcst_usr_cd_NC(info);
		else if (nc == columnDtl_frcst_usr_nm) doDtl_frcst_usr_nm_NC(info);
		else if (nc == columnDtl_frcst_dpt_cd) doDtl_frcst_dpt_cd_NC(info);
		else if (nc == columnDtl_frcst_dpt_nm) doDtl_frcst_dpt_nm_NC(info);
		else if (nc == columnDtl_wrk_no) doDtl_wrk_no_NC(info);
		else if (nc == columnDtl_wrk_nm) doDtl_wrk_nm_NC(info);
		else if (nc == columnDtl_cst_frcst_slip_no) doDtl_cst_frcst_slip_no_NC(info);
		else if (nc == columnDtl_rcpt_dt) doDtl_rcpt_dt_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_cst_frcst_d_no) doDtl_cst_frcst_d_no_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_frcst_period_typ) doDtl_frcst_period_typ_NC(info);
		else if (nc == columnDtl_frcst_period_typ_nm) doDtl_frcst_period_typ_nm_NC(info);
		else if (nc == columnDtl_frcst_st_dt) doDtl_frcst_st_dt_NC(info);
		else if (nc == columnDtl_frcst_end_dt) doDtl_frcst_end_dt_NC(info);
		else if (nc == columnDtl_frcst_dt) doDtl_frcst_dt_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_gi_loc_cd) doDtl_gi_loc_cd_NC(info);
		else if (nc == columnDtl_gi_loc_nm) doDtl_gi_loc_nm_NC(info);
		else if (nc == columnDtl_cst_frcst_slip_d_no) doDtl_cst_frcst_slip_d_no_NC(info);
		else if (nc == columnDtl_last_qty) doDtl_last_qty_NC(info);
		else if (nc == columnDtl_last_cst_frcst_prnt_dt) doDtl_last_cst_frcst_prnt_dt_NC(info);
		else if (nc == columnDtl_last_rcpt_dt) doDtl_last_rcpt_dt_NC(info);
		else if (nc == columnDtl_frcst_stop_flg) doDtl_frcst_stop_flg_NC(info);
		else if (nc == columnDtl_spln_qty) doDtl_spln_qty_NC(info);
		else if (nc == columnDtl_slo_qty) doDtl_slo_qty_NC(info);
		else if (nc == columnDtl_dtl_intr_rmrks) doDtl_dtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NC(info);
		else if (nc == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NC(info);
		else if (nc == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_prnt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_prnt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_prnt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_prnt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_period_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_cst_frcst_prnt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_cst_frcst_prnt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NE(info);
		else if (ne == Hdr_cst_frcst_no) doHdr_cst_frcst_no_NE(info);
		else if (ne == Hdr_cst_frcst_prnt_dt) doHdr_cst_frcst_prnt_dt_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_cst_cd) doHdr_cst_cd_NE(info);
		else if (ne == Hdr_cst_nm) doHdr_cst_nm_NE(info);
		else if (ne == Hdr_dlv_cd) doHdr_dlv_cd_NE(info);
		else if (ne == Hdr_dlv_nm) doHdr_dlv_nm_NE(info);
		else if (ne == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NE(info);
		else if (ne == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NE(info);
		else if (ne == Hdr_can_rsn_cd) doHdr_can_rsn_cd_NE(info);
		else if (ne == Hdr_can_rsn_nm) doHdr_can_rsn_nm_NE(info);
		else if (ne == Hdr_can_rmrks) doHdr_can_rmrks_NE(info);
		else if (ne == Hdr_cst_frcst_slip_no) doHdr_cst_frcst_slip_no_NE(info);
		else if (ne == Hdr_rcpt_dt) doHdr_rcpt_dt_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_ins_usr_id) doHdr_ins_usr_id_NE(info);
		else if (ne == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NE(info);
		else if (ne == Hdr_ins_func_id) doHdr_ins_func_id_NE(info);
		else if (ne == Hdr_ins_func_nm) doHdr_ins_func_nm_NE(info);
		else if (ne == Hdr_upd_usr_id) doHdr_upd_usr_id_NE(info);
		else if (ne == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NE(info);
		else if (ne == Hdr_upd_func_id) doHdr_upd_func_id_NE(info);
		else if (ne == Hdr_upd_func_nm) doHdr_upd_func_nm_NE(info);
		else if (ne == Hdr_ins_ts) doHdr_ins_ts_NE(info);
		else if (ne == Hdr_upd_ts) doHdr_upd_ts_NE(info);
		else if (ne == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_fix_flg) doDtl_fix_flg_NE(info);
		else if (ne == columnDtl_cst_frcst_no) doDtl_cst_frcst_no_NE(info);
		else if (ne == columnDtl_cst_frcst_prnt_dt) doDtl_cst_frcst_prnt_dt_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
		else if (ne == columnDtl_dlv_cd) doDtl_dlv_cd_NE(info);
		else if (ne == columnDtl_dlv_nm) doDtl_dlv_nm_NE(info);
		else if (ne == columnDtl_frcst_usr_cd) doDtl_frcst_usr_cd_NE(info);
		else if (ne == columnDtl_frcst_usr_nm) doDtl_frcst_usr_nm_NE(info);
		else if (ne == columnDtl_frcst_dpt_cd) doDtl_frcst_dpt_cd_NE(info);
		else if (ne == columnDtl_frcst_dpt_nm) doDtl_frcst_dpt_nm_NE(info);
		else if (ne == columnDtl_wrk_no) doDtl_wrk_no_NE(info);
		else if (ne == columnDtl_wrk_nm) doDtl_wrk_nm_NE(info);
		else if (ne == columnDtl_cst_frcst_slip_no) doDtl_cst_frcst_slip_no_NE(info);
		else if (ne == columnDtl_rcpt_dt) doDtl_rcpt_dt_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_cst_frcst_d_no) doDtl_cst_frcst_d_no_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_frcst_period_typ) doDtl_frcst_period_typ_NE(info);
		else if (ne == columnDtl_frcst_period_typ_nm) doDtl_frcst_period_typ_nm_NE(info);
		else if (ne == columnDtl_frcst_st_dt) doDtl_frcst_st_dt_NE(info);
		else if (ne == columnDtl_frcst_end_dt) doDtl_frcst_end_dt_NE(info);
		else if (ne == columnDtl_frcst_dt) doDtl_frcst_dt_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_gi_loc_cd) doDtl_gi_loc_cd_NE(info);
		else if (ne == columnDtl_gi_loc_nm) doDtl_gi_loc_nm_NE(info);
		else if (ne == columnDtl_cst_frcst_slip_d_no) doDtl_cst_frcst_slip_d_no_NE(info);
		else if (ne == columnDtl_last_qty) doDtl_last_qty_NE(info);
		else if (ne == columnDtl_last_cst_frcst_prnt_dt) doDtl_last_cst_frcst_prnt_dt_NE(info);
		else if (ne == columnDtl_last_rcpt_dt) doDtl_last_rcpt_dt_NE(info);
		else if (ne == columnDtl_frcst_stop_flg) doDtl_frcst_stop_flg_NE(info);
		else if (ne == columnDtl_spln_qty) doDtl_spln_qty_NE(info);
		else if (ne == columnDtl_slo_qty) doDtl_slo_qty_NE(info);
		else if (ne == columnDtl_dtl_intr_rmrks) doDtl_dtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NE(info);
		else if (ne == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NE(info);
		else if (ne == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_prnt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_prnt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_prnt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_prnt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_period_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_cst_frcst_prnt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_cst_frcst_prnt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NX(info);
		else if (nx == Hdr_cst_frcst_no) doHdr_cst_frcst_no_NX(info);
		else if (nx == Hdr_cst_frcst_prnt_dt) doHdr_cst_frcst_prnt_dt_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_cst_cd) doHdr_cst_cd_NX(info);
		else if (nx == Hdr_cst_nm) doHdr_cst_nm_NX(info);
		else if (nx == Hdr_dlv_cd) doHdr_dlv_cd_NX(info);
		else if (nx == Hdr_dlv_nm) doHdr_dlv_nm_NX(info);
		else if (nx == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NX(info);
		else if (nx == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NX(info);
		else if (nx == Hdr_can_rsn_cd) doHdr_can_rsn_cd_NX(info);
		else if (nx == Hdr_can_rsn_nm) doHdr_can_rsn_nm_NX(info);
		else if (nx == Hdr_can_rmrks) doHdr_can_rmrks_NX(info);
		else if (nx == Hdr_cst_frcst_slip_no) doHdr_cst_frcst_slip_no_NX(info);
		else if (nx == Hdr_rcpt_dt) doHdr_rcpt_dt_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_ins_usr_id) doHdr_ins_usr_id_NX(info);
		else if (nx == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NX(info);
		else if (nx == Hdr_ins_func_id) doHdr_ins_func_id_NX(info);
		else if (nx == Hdr_ins_func_nm) doHdr_ins_func_nm_NX(info);
		else if (nx == Hdr_upd_usr_id) doHdr_upd_usr_id_NX(info);
		else if (nx == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NX(info);
		else if (nx == Hdr_upd_func_id) doHdr_upd_func_id_NX(info);
		else if (nx == Hdr_upd_func_nm) doHdr_upd_func_nm_NX(info);
		else if (nx == Hdr_ins_ts) doHdr_ins_ts_NX(info);
		else if (nx == Hdr_upd_ts) doHdr_upd_ts_NX(info);
		else if (nx == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_fix_flg) doDtl_fix_flg_NX(info);
		else if (nx == columnDtl_cst_frcst_no) doDtl_cst_frcst_no_NX(info);
		else if (nx == columnDtl_cst_frcst_prnt_dt) doDtl_cst_frcst_prnt_dt_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
		else if (nx == columnDtl_dlv_cd) doDtl_dlv_cd_NX(info);
		else if (nx == columnDtl_dlv_nm) doDtl_dlv_nm_NX(info);
		else if (nx == columnDtl_frcst_usr_cd) doDtl_frcst_usr_cd_NX(info);
		else if (nx == columnDtl_frcst_usr_nm) doDtl_frcst_usr_nm_NX(info);
		else if (nx == columnDtl_frcst_dpt_cd) doDtl_frcst_dpt_cd_NX(info);
		else if (nx == columnDtl_frcst_dpt_nm) doDtl_frcst_dpt_nm_NX(info);
		else if (nx == columnDtl_wrk_no) doDtl_wrk_no_NX(info);
		else if (nx == columnDtl_wrk_nm) doDtl_wrk_nm_NX(info);
		else if (nx == columnDtl_cst_frcst_slip_no) doDtl_cst_frcst_slip_no_NX(info);
		else if (nx == columnDtl_rcpt_dt) doDtl_rcpt_dt_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_cst_frcst_d_no) doDtl_cst_frcst_d_no_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_frcst_period_typ) doDtl_frcst_period_typ_NX(info);
		else if (nx == columnDtl_frcst_period_typ_nm) doDtl_frcst_period_typ_nm_NX(info);
		else if (nx == columnDtl_frcst_st_dt) doDtl_frcst_st_dt_NX(info);
		else if (nx == columnDtl_frcst_end_dt) doDtl_frcst_end_dt_NX(info);
		else if (nx == columnDtl_frcst_dt) doDtl_frcst_dt_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_gi_loc_cd) doDtl_gi_loc_cd_NX(info);
		else if (nx == columnDtl_gi_loc_nm) doDtl_gi_loc_nm_NX(info);
		else if (nx == columnDtl_cst_frcst_slip_d_no) doDtl_cst_frcst_slip_d_no_NX(info);
		else if (nx == columnDtl_last_qty) doDtl_last_qty_NX(info);
		else if (nx == columnDtl_last_cst_frcst_prnt_dt) doDtl_last_cst_frcst_prnt_dt_NX(info);
		else if (nx == columnDtl_last_rcpt_dt) doDtl_last_rcpt_dt_NX(info);
		else if (nx == columnDtl_frcst_stop_flg) doDtl_frcst_stop_flg_NX(info);
		else if (nx == columnDtl_spln_qty) doDtl_spln_qty_NX(info);
		else if (nx == columnDtl_slo_qty) doDtl_slo_qty_NX(info);
		else if (nx == columnDtl_dtl_intr_rmrks) doDtl_dtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NX(info);
		else if (nx == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NX(info);
		else if (nx == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_prnt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_prnt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_prnt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_prnt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_period_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_cst_frcst_prnt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_cst_frcst_prnt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_cst_frcst_no) doCnd_cst_frcst_no_LC(info);
		else if (lc == Hdr_cst_frcst_no) doHdr_cst_frcst_no_LC(info);
		else if (lc == Hdr_cst_frcst_prnt_dt) doHdr_cst_frcst_prnt_dt_LC(info);
		else if (lc == Hdr_cst_cd) doHdr_cst_cd_LC(info);
		else if (lc == Hdr_cst_nm) doHdr_cst_nm_LC(info);
		else if (lc == Hdr_dlv_cd) doHdr_dlv_cd_LC(info);
		else if (lc == Hdr_dlv_nm) doHdr_dlv_nm_LC(info);
		else if (lc == Hdr_cst_usr_cd) doHdr_cst_usr_cd_LC(info);
		else if (lc == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_LC(info);
		else if (lc == Hdr_can_rsn_cd) doHdr_can_rsn_cd_LC(info);
		else if (lc == Hdr_can_rsn_nm) doHdr_can_rsn_nm_LC(info);
		else if (lc == Hdr_can_rmrks) doHdr_can_rmrks_LC(info);
		else if (lc == Hdr_cst_frcst_slip_no) doHdr_cst_frcst_slip_no_LC(info);
		else if (lc == Hdr_rcpt_dt) doHdr_rcpt_dt_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_ins_usr_id) doHdr_ins_usr_id_LC(info);
		else if (lc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_LC(info);
		else if (lc == Hdr_ins_func_id) doHdr_ins_func_id_LC(info);
		else if (lc == Hdr_ins_func_nm) doHdr_ins_func_nm_LC(info);
		else if (lc == Hdr_upd_usr_id) doHdr_upd_usr_id_LC(info);
		else if (lc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_LC(info);
		else if (lc == Hdr_upd_func_id) doHdr_upd_func_id_LC(info);
		else if (lc == Hdr_upd_func_nm) doHdr_upd_func_nm_LC(info);
		else if (lc == Hdr_ins_ts) doHdr_ins_ts_LC(info);
		else if (lc == Hdr_upd_ts) doHdr_upd_ts_LC(info);
		else if (lc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_cst_frcst_no) doDtl_cst_frcst_no_LC(info);
		else if (lc == columnDtl_cst_frcst_prnt_dt) doDtl_cst_frcst_prnt_dt_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
		else if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		else if (lc == columnDtl_dlv_nm) doDtl_dlv_nm_LC(info);
		else if (lc == columnDtl_frcst_usr_cd) doDtl_frcst_usr_cd_LC(info);
		else if (lc == columnDtl_frcst_usr_nm) doDtl_frcst_usr_nm_LC(info);
		else if (lc == columnDtl_frcst_dpt_cd) doDtl_frcst_dpt_cd_LC(info);
		else if (lc == columnDtl_frcst_dpt_nm) doDtl_frcst_dpt_nm_LC(info);
		else if (lc == columnDtl_wrk_no) doDtl_wrk_no_LC(info);
		else if (lc == columnDtl_wrk_nm) doDtl_wrk_nm_LC(info);
		else if (lc == columnDtl_cst_frcst_slip_no) doDtl_cst_frcst_slip_no_LC(info);
		else if (lc == columnDtl_rcpt_dt) doDtl_rcpt_dt_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_cst_frcst_d_no) doDtl_cst_frcst_d_no_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_frcst_period_typ) doDtl_frcst_period_typ_LC(info);
		else if (lc == columnDtl_frcst_period_typ_nm) doDtl_frcst_period_typ_nm_LC(info);
		else if (lc == columnDtl_frcst_st_dt) doDtl_frcst_st_dt_LC(info);
		else if (lc == columnDtl_frcst_end_dt) doDtl_frcst_end_dt_LC(info);
		else if (lc == columnDtl_frcst_dt) doDtl_frcst_dt_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_gi_loc_cd) doDtl_gi_loc_cd_LC(info);
		else if (lc == columnDtl_gi_loc_nm) doDtl_gi_loc_nm_LC(info);
		else if (lc == columnDtl_cst_frcst_slip_d_no) doDtl_cst_frcst_slip_d_no_LC(info);
		else if (lc == columnDtl_last_qty) doDtl_last_qty_LC(info);
		else if (lc == columnDtl_last_cst_frcst_prnt_dt) doDtl_last_cst_frcst_prnt_dt_LC(info);
		else if (lc == columnDtl_last_rcpt_dt) doDtl_last_rcpt_dt_LC(info);
		else if (lc == columnDtl_spln_qty) doDtl_spln_qty_LC(info);
		else if (lc == columnDtl_slo_qty) doDtl_slo_qty_LC(info);
		else if (lc == columnDtl_dtl_intr_rmrks) doDtl_dtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_LC(info);
		else if (lc == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_LC(info);
		else if (lc == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_prnt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_prnt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_frcst_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_frcst_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_prnt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_prnt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_period_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[frcst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_frcst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_frcst_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_frcst_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_cst_frcst_prnt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_cst_frcst_prnt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_cst_cd]の作成メソッド
	 */
	public MCList getHdr_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dlv_cd]の作成メソッド
	 */
	public MCList getHdr_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_can_rsn_cd]の作成メソッド
	 */
	public MCList getHdr_can_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSloCanRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_itm_cd]の作成メソッド
	 */
	public MCList getDtl_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_frcst_period_typ]の作成メソッド
	 */
	public MCList getDtl_frcst_period_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPeriodTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gi_loc_cd]の作成メソッド
	 */
	public MCList getDtl_gi_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL0010.Srch01")) {
			return new MS_MSBBL0010_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL0010.Imp01")) {
			return new MS_MSBBL0010_Imp01Bridge();
		}
		if (id.equals("MS.MSBBL0010.Sprt01")) {
			return new MS_MSBBL0010_Sprt01Bridge();
		}
		if (id.equals("MS.MSBBL0010.Ins01")) {
			return new MS_MSBBL0010_Ins01Bridge();
		}
		if (id.equals("MS.MSBBL0010.Upd01")) {
			return new MS_MSBBL0010_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL0010.Del01")) {
			return new MS_MSBBL0010_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0010_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL0010_Srch01Bridge() {
			p_MS_MSBBL0010_Srch01 = new MCParam(PDef.MS_MSBBL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0010.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));

			p_MS_MSBBL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0010.CndR up0() {
			return (mcframe.clientMSBB.MSBBP0010.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP0010.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP0010.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0010_Srch01.addDownBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			p_MS_MSBBL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0010_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP0010.HdrR)p_MS_MSBBL0010_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)p_MS_MSBBL0010_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL0010_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0010_Imp01;

		/** コンストラクタ */
		protected MS_MSBBL0010_Imp01Bridge() {
			p_MS_MSBBL0010_Imp01 = new MCParam(PDef.MS_MSBBL0010_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0010_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));

			p_MS_MSBBL0010_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0010_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0010_Imp01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0010_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0010_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)up(0);
		}

		protected mcframe.clientMSBB.MSBBP0010.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP0010.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0010_Imp01.addDownBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			p_MS_MSBBL0010_Imp01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0010_Imp01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP0010.HdrR)p_MS_MSBBL0010_Imp01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)p_MS_MSBBL0010_Imp01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL0010_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0010_Sprt01;

		/** コンストラクタ */
		protected MS_MSBBL0010_Sprt01Bridge() {
			p_MS_MSBBL0010_Sprt01 = new MCParam(PDef.MS_MSBBL0010_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0010_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));

			p_MS_MSBBL0010_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0010_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0010_Sprt01.addUpBlock(getHdrR());
			p_MS_MSBBL0010_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0010_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0010_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0010.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP0010.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0010_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0010_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)p_MS_MSBBL0010_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0010_Ins01;

		/** コンストラクタ */
		protected MS_MSBBL0010_Ins01Bridge() {
			p_MS_MSBBL0010_Ins01 = new MCParam(PDef.MS_MSBBL0010_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0010_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));

			p_MS_MSBBL0010_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0010_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0010_Ins01.addUpBlock(getHdrR());
			p_MS_MSBBL0010_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0010_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0010_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0010.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP0010.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)up(1);
		}

		protected mcframe.clientMSBB.MSBBP0010.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP0010.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0010_Ins01.addDownBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			p_MS_MSBBL0010_Ins01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0010_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP0010.HdrR)p_MS_MSBBL0010_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)p_MS_MSBBL0010_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0010_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL0010_Upd01Bridge() {
			p_MS_MSBBL0010_Upd01 = new MCParam(PDef.MS_MSBBL0010_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0010_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));

			p_MS_MSBBL0010_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0010_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0010_Upd01.addUpBlock(getHdrR());
			p_MS_MSBBL0010_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0010_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0010_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0010.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP0010.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)up(1);
		}

		protected mcframe.clientMSBB.MSBBP0010.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP0010.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0010.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0010_Upd01.addDownBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			p_MS_MSBBL0010_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0010.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0010_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP0010.HdrR)p_MS_MSBBL0010_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP0010.DtlR>)p_MS_MSBBL0010_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL0010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0010_Del01;

		/** コンストラクタ */
		protected MS_MSBBL0010_Del01Bridge() {
			p_MS_MSBBL0010_Del01 = new MCParam(PDef.MS_MSBBL0010_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0010_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0010.HdrR.create());
			// Down

			p_MS_MSBBL0010_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0010_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0010_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0010_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0010_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0010.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP0010.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBBL0010_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}