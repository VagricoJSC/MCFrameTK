package mcframe.clientMSBB.MSBBP1030;

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
import mcframe.clientMSBB.MSBBP1030.MSBBP_WrkReg_MC.MS_MSBBL1030_Srch01Caller;
import mcframe.clientMSBB.MSBBP1030.MSBBP_WrkReg_MC.MS_MSBBL1030_Ins01Caller;
import mcframe.clientMSBB.MSBBP1030.MSBBP_WrkReg_MC.MS_MSBBL1030_Upd01Caller;
import mcframe.clientMSBB.MSBBP1030.MSBBP_WrkReg_MC.MS_MSBBL1030_Del01Caller;

/**
 * 画面"MSBBP_WrkReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_WrkReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1030";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_wrk_no_Label = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_wrk_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_wrk_no_Label = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_wrk_no = null;
	public MCLabel Hdr_wrk_nm_Label = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCTextField Hdr_wrk_nm = null;
	public MCLabel Hdr_st_dt_Label = null;
	/**
	 * Sales project start date 案件開始日.<p>
	 *
	 */
	public MCDateField Hdr_st_dt = null;
	public MCLabel Hdr_end_dt_Label = null;
	/**
	 * Sales project end date 案件終了日.<p>
	 *
	 */
	public MCDateField Hdr_end_dt = null;
	public MCLabel Hdr_term_cond_Label = null;
	/**
	 * Contract terms 契約条件.<p>
	 *
	 */
	public MCTextField Hdr_term_cond = null;
	public MCLabel Hdr_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Hdr_cur_nm = null;
	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public MCNumberField Hdr_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_budget_p_PPanel;
	public MCNumberField Hdr_budget;	// [Hdr]の[budget_p.amt]を[Hdr_budget]としてエイリアス定義。
	public MCLabel Hdr_wrk_sts_cd_Label = null;
	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_wrk_sts_cd = null;
	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public MCTextField Hdr_wrk_sts_nm = null;
	public MCLabel Hdr_slo_acc_cd_Label = null;
	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_slo_acc_cd = null;
	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public MCTextField Hdr_slo_acc_nm = null;
	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public MCCheckBox Hdr_wrk_ar_flg = null;
	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public MCCheckBox Hdr_wrk_ap_flg = null;
	public MCLabel Hdr_slo_rsn_Label = null;
	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public MCTextField Hdr_slo_rsn = null;
	public MCLabel Hdr_fail_rsn_Label = null;
	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public MCTextField Hdr_fail_rsn = null;
	public MCLabel Hdr_wrk_rmrks_Label = null;
	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public MCTextField Hdr_wrk_rmrks = null;
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
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCCheckBox Hdr_can_flg = null;
	public MCLabel Hdr_wrk_desc_Label = null;
	public MCScrollPane Hdr_wrk_descScrollPane = null;
	/**
	 * Sales project overview 案件概要.<p>
	 *
	 */
	public MCTextArea Hdr_wrk_desc = null;
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Hdr3]ブロック関連のField定義
	public MCPanel Hdr3Panel = null;
	// [Hdr3]ブロックの項目のField定義
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [Dtab1]ブロック関連のField定義
	public MCPanel Dtab1Panel = null;
	// [Dtab1]ブロックの項目のField定義
	// [HdrDtl]ブロック関連のField定義
	public MCPanel HdrDtlPanel = null;
	// [HdrDtl]ブロックの項目のField定義
	// [NDtl]ブロック関連のField定義
	public MCPanel NDtlPanel = null;
	// [NDtl]ブロックの項目のField定義
	// [MidDtl]ブロック関連のField定義
	public MCPanel MidDtlPanel = null;
	// [MidDtl]ブロックの項目のField定義
	// [Wdtl]ブロック関連のField定義
	public MCPanel WdtlPanel = null;
	// [Wdtl]ブロックの項目のField定義
	// [Edtl]ブロック関連のField定義
	public MCPanel EdtlPanel = null;
	// [Edtl]ブロックの項目のField定義
	// [Sdtl]ブロック関連のField定義
	public MCPanel SdtlPanel = null;
	// [Sdtl]ブロックの項目のField定義
	// [Dtab2]ブロック関連のField定義
	public MCPanel Dtab2Panel = null;
	// [Dtab2]ブロックの項目のField定義
	// [Dtl1]ブロック関連のField定義
	public MCPanel Dtl1Panel = null;
	public MCScrollPane Dtl1ScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1030.Dtl1R> Dtl1Table = null;
	// [Dtl1]ブロックの項目のField定義
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_wrk_no = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_nm = null;
	/**
	 * Miscellaneous 諸口.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_sundry_flg = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Dtl1_cst_addr_p_PPanel;
	public MCColumnConfig columnDtl1_cntry_cd;// [Dtl1]の[cst_addr_p.cntry_cd]を[columnDtl1_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_cntry_nm;// [Dtl1]の[cst_addr_p.cntry_nm]を[columnDtl1_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_zip_cd;// [Dtl1]の[cst_addr_p.zip_cd]を[columnDtl1_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_addr1;// [Dtl1]の[cst_addr_p.addr1]を[columnDtl1_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_addr2;// [Dtl1]の[cst_addr_p.addr2]を[columnDtl1_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_addr3;// [Dtl1]の[cst_addr_p.addr3]を[columnDtl1_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_addr4;// [Dtl1]の[cst_addr_p.addr4]を[columnDtl1_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl1_cst_cntct_dpt;// [Dtl1]の[cst_addr_p.cntct_dpt]を[columnDtl1_cst_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_cst_cntct_psn;// [Dtl1]の[cst_addr_p.cntct_psn]を[columnDtl1_cst_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tel;// [Dtl1]の[cst_addr_p.tel]を[columnDtl1_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl1_fax;// [Dtl1]の[cst_addr_p.fax]を[columnDtl1_fax]としてエイリアス定義。
	/**
	 * Capital stock 資本金.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_capital = null;
	/**
	 * Number of employee 従業員数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_emp_num = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_srv_req_no = null;
	// [Btm1]ブロック関連のField定義
	public MCPanel Btm1Panel = null;
	// [Btm1]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btm1_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btm1_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btm1_rcopy = null;
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1030.Dtl2R> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_wrk_no = null;
	/**
	 * History No. 履歴ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_hist_no = null;
	/**
	 * Activities cd. 活動状況ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_sts_cd = null;
	/**
	 * Activity status name 活動状況名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_sts_nm = null;
	/**
	 * Activity history 活動経緯.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_hist = null;
	/**
	 * Scheduled activity date 活動予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_schd_dt = null;
	/**
	 * Activity schedule 活動予定.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_schd = null;
	/**
	 * Actual activity result date 活動実績日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_act_dt = null;
	/**
	 * Results of activities 活動実績.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_act = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_srv_req_no = null;
	// [Btm2]ブロック関連のField定義
	public MCPanel Btm2Panel = null;
	// [Btm2]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btm2_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btm2_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btm2_rcopy = null;
	// [Dtl3]ブロック関連のField定義
	public MCPanel Dtl3Panel = null;
	public MCScrollPane Dtl3ScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1030.Dtl3R> Dtl3Table = null;
	// [Dtl3]ブロックの項目のField定義
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_wrk_no = null;
	/**
	 * Conflict No. 競合ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_comp_no = null;
	/**
	 * Conflict occurred date 競合発生日.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_comp_dt = null;
	/**
	 * Conflict info. 競合情報.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_comp_info = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_srv_req_no = null;
	// [Btm3]ブロック関連のField定義
	public MCPanel Btm3Panel = null;
	// [Btm3]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btm3_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btm3_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btm3_rcopy = null;
	// [Dtl4]ブロック関連のField定義
	public MCPanel Dtl4Panel = null;
	public MCScrollPane Dtl4ScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1030.Dtl4R> Dtl4Table = null;
	// [Dtl4]ブロックの項目のField定義
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_qtn_no = null;
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_qtn_rev = null;
	/**
	 * Quotation type 見積区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_qtn_typ = null;
	/**
	 * Quotation type name 見積区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_qtn_typ_nm = null;
	/**
	 * Quotation date 見積日.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_qtn_dt = null;
	/**
	 * Quotation expiration date 見積有効期限.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_valid_dt = null;
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_rcpt_dt = null;
	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_rcpt_usr_cd = null;
	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_rcpt_usr_nm = null;
	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_qtn_rmrks = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl4_upd_srv_req_no = null;
	// [Dtl5]ブロック関連のField定義
	public MCPanel Dtl5Panel = null;
	public MCScrollPane Dtl5ScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1030.Dtl5R> Dtl5Table = null;
	// [Dtl5]ブロックの項目のField定義
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_wrk_no = null;
	/**
	 * Numbering 発番.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_num_flg = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_sno1 = null;
	/**
	 * Use quotation 見積使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_qtn_flg = null;
	/**
	 * Use sales order 受注使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_slo_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl5_upd_srv_req_no = null;
	// [Btm5]ブロック関連のField定義
	public MCPanel Btm5Panel = null;
	// [Btm5]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btm5_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btm5_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btm5_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Quotation entry 見積登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1110 = null;
	/**
	 * Sales order entry 受注登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1210 = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF, UPD, INS, DEL, FIX_I, FIX_U, FIX_D};
	
	/** [MS_MSBBL1030_Srch01]のCallerの作成 */
	protected MSBBP_WrkReg_MC.MS_MSBBL1030_Srch01Caller createMS_MSBBL1030_Srch01() {
		MSBBP_WrkReg_MC.MS_MSBBL1030_Srch01Caller<MSBBP_WrkReg, MS_MSBBL1030_Srch01Bridge>
		caller = ((MSBBP_WrkReg_MC)this).new MS_MSBBL1030_Srch01Caller<MSBBP_WrkReg, MS_MSBBL1030_Srch01Bridge>(
					(MSBBP_WrkReg)this, new MS_MSBBL1030_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1030_Srch01]の呼び出し */
	protected void callMS_MSBBL1030_Srch01() {
		MCCaller caller = createMS_MSBBL1030_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1030_Ins01]のCallerの作成 */
	protected MSBBP_WrkReg_MC.MS_MSBBL1030_Ins01Caller createMS_MSBBL1030_Ins01() {
		MSBBP_WrkReg_MC.MS_MSBBL1030_Ins01Caller<MSBBP_WrkReg, MS_MSBBL1030_Ins01Bridge>
		caller = ((MSBBP_WrkReg_MC)this).new MS_MSBBL1030_Ins01Caller<MSBBP_WrkReg, MS_MSBBL1030_Ins01Bridge>(
					(MSBBP_WrkReg)this, new MS_MSBBL1030_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBBL1030_Ins01]の呼び出し */
	protected void callMS_MSBBL1030_Ins01() {
		MCCaller caller = createMS_MSBBL1030_Ins01();
		caller.exec();
	}
	/** [MS_MSBBL1030_Upd01]のCallerの作成 */
	protected MSBBP_WrkReg_MC.MS_MSBBL1030_Upd01Caller createMS_MSBBL1030_Upd01() {
		MSBBP_WrkReg_MC.MS_MSBBL1030_Upd01Caller<MSBBP_WrkReg, MS_MSBBL1030_Upd01Bridge>
		caller = ((MSBBP_WrkReg_MC)this).new MS_MSBBL1030_Upd01Caller<MSBBP_WrkReg, MS_MSBBL1030_Upd01Bridge>(
					(MSBBP_WrkReg)this, new MS_MSBBL1030_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1030_Upd01]の呼び出し */
	protected void callMS_MSBBL1030_Upd01() {
		MCCaller caller = createMS_MSBBL1030_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL1030_Del01]のCallerの作成 */
	protected MSBBP_WrkReg_MC.MS_MSBBL1030_Del01Caller createMS_MSBBL1030_Del01() {
		MSBBP_WrkReg_MC.MS_MSBBL1030_Del01Caller<MSBBP_WrkReg, MS_MSBBL1030_Del01Bridge>
		caller = ((MSBBP_WrkReg_MC)this).new MS_MSBBL1030_Del01Caller<MSBBP_WrkReg, MS_MSBBL1030_Del01Bridge>(
					(MSBBP_WrkReg)this, new MS_MSBBL1030_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL1030_Del01]の呼び出し */
	protected void callMS_MSBBL1030_Del01() {
		MCCaller caller = createMS_MSBBL1030_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1030.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1030.HdrR aHdrR;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R> aDtl1L;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R> aDtl2L;
	/** [Dtl3]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R> aDtl3L;
	/** [Dtl4]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1030.Dtl4R> aDtl4L;
	/** [Dtl5]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> aDtl5L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1030.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1030.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBB.MSBBP1030.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1030.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1030.HdrR createHdrR() {
		return mcframe.clientMSBB.MSBBP1030.HdrR.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R> aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R> getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMSBB.MSBBP1030.Dtl1R createDtl1R() {
		return mcframe.clientMSBB.MSBBP1030.Dtl1R.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R> createDtl1L() {
		return MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl1R.class);
	}

	/**
	 * Dtl1Tableを初期化します。
	 */
	protected void createDtl1Table(){
		if(Dtl1Table == null){
			Dtl1Table = beansFactory.createTable2("Dtl1.table");
		}
	}

	/**
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBB.MSBBP1030.Dtl2R createDtl2R() {
		return mcframe.clientMSBB.MSBBP1030.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R> createDtl2L() {
		return MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl2R.class);
	}

	/**
	 * Dtl2Tableを初期化します。
	 */
	protected void createDtl2Table(){
		if(Dtl2Table == null){
			Dtl2Table = beansFactory.createTable2("Dtl2.table");
		}
	}

	/**
	 * コピーによってaDtl3Lを設定します。
	 *
	 * aDtl3Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl3L
	 */
	public void setDtl3L(MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R> aList) {
		if (getDtl3L() != aList) {
			getDtl3L().setAll(aList);
		}
	}

	/**
	 * [Dtl3]ブロックのコンテナaDtl3Lを返します。
	 *
	 * @return Dtl3L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R> getDtl3L() {
		return aDtl3L;
	}

	/**
	 * aDtl3Rを作成します。
	 *
	 * @return Dtl3R
	 */
	public mcframe.clientMSBB.MSBBP1030.Dtl3R createDtl3R() {
		return mcframe.clientMSBB.MSBBP1030.Dtl3R.create();
	}

	/**
	 * aDtl3Lを作成します。
	 *
	 * @return Dtl3L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R> createDtl3L() {
		return MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl3R.class);
	}

	/**
	 * Dtl3Tableを初期化します。
	 */
	protected void createDtl3Table(){
		if(Dtl3Table == null){
			Dtl3Table = beansFactory.createTable2("Dtl3.table");
		}
	}

	/**
	 * コピーによってaDtl4Lを設定します。
	 *
	 * aDtl4Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl4L
	 */
	public void setDtl4L(MCList<mcframe.clientMSBB.MSBBP1030.Dtl4R> aList) {
		if (getDtl4L() != aList) {
			getDtl4L().setAll(aList);
		}
	}

	/**
	 * [Dtl4]ブロックのコンテナaDtl4Lを返します。
	 *
	 * @return Dtl4L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl4R> getDtl4L() {
		return aDtl4L;
	}

	/**
	 * aDtl4Rを作成します。
	 *
	 * @return Dtl4R
	 */
	public mcframe.clientMSBB.MSBBP1030.Dtl4R createDtl4R() {
		return mcframe.clientMSBB.MSBBP1030.Dtl4R.create();
	}

	/**
	 * aDtl4Lを作成します。
	 *
	 * @return Dtl4L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl4R> createDtl4L() {
		return MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl4R.class);
	}

	/**
	 * Dtl4Tableを初期化します。
	 */
	protected void createDtl4Table(){
		if(Dtl4Table == null){
			Dtl4Table = beansFactory.createTable2("Dtl4.table");
		}
	}

	/**
	 * コピーによってaDtl5Lを設定します。
	 *
	 * aDtl5Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl5L
	 */
	public void setDtl5L(MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> aList) {
		if (getDtl5L() != aList) {
			getDtl5L().setAll(aList);
		}
	}

	/**
	 * [Dtl5]ブロックのコンテナaDtl5Lを返します。
	 *
	 * @return Dtl5L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> getDtl5L() {
		return aDtl5L;
	}

	/**
	 * aDtl5Rを作成します。
	 *
	 * @return Dtl5R
	 */
	public mcframe.clientMSBB.MSBBP1030.Dtl5R createDtl5R() {
		return mcframe.clientMSBB.MSBBP1030.Dtl5R.create();
	}

	/**
	 * aDtl5Lを作成します。
	 *
	 * @return Dtl5L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> createDtl5L() {
		return MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class);
	}

	/**
	 * Dtl5Tableを初期化します。
	 */
	protected void createDtl5Table(){
		if(Dtl5Table == null){
			Dtl5Table = beansFactory.createTable2("Dtl5.table");
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
		if(!MCCollectionUtil.contains(ret, getDtl1L())) ret.add(getDtl1L());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
		if(!MCCollectionUtil.contains(ret, getDtl3L())) ret.add(getDtl3L());
		if(!MCCollectionUtil.contains(ret, getDtl4L())) ret.add(getDtl4L());
		if(!MCCollectionUtil.contains(ret, getDtl5L())) ret.add(getDtl5L());
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
		if(aCnt == getDtl1L()) return "Dtl1";
		if(aCnt == getDtl2L()) return "Dtl2";
		if(aCnt == getDtl3L()) return "Dtl3";
		if(aCnt == getDtl4L()) return "Dtl4";
		if(aCnt == getDtl5L()) return "Dtl5";
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
		if(bId.equals("Dtl1")) return getDtl1L();
		if(bId.equals("Dtl2")) return getDtl2L();
		if(bId.equals("Dtl3")) return getDtl3L();
		if(bId.equals("Dtl4")) return getDtl4L();
		if(bId.equals("Dtl5")) return getDtl5L();
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
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(Hdr3Panel);
		ret.add(DtlTabPanel);
		ret.add(Dtab1Panel);
		ret.add(HdrDtlPanel);
		ret.add(NDtlPanel);
		ret.add(MidDtlPanel);
		ret.add(WdtlPanel);
		ret.add(EdtlPanel);
		ret.add(SdtlPanel);
		ret.add(Dtab2Panel);
		ret.add(Dtl1Panel);
		ret.add(Btm1Panel);
		ret.add(Dtl2Panel);
		ret.add(Btm2Panel);
		ret.add(Dtl3Panel);
		ret.add(Btm3Panel);
		ret.add(Dtl4Panel);
		ret.add(Dtl5Panel);
		ret.add(Btm5Panel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_WrkReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		aDtl2L = createDtl2L();
		aDtl3L = createDtl3L();
		aDtl4L = createDtl4L();
		aDtl5L = createDtl5L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_WrkReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		createDtl1Table();
		Dtl1Table.setRowName(name);
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
		aDtl3L = createDtl3L();
		createDtl3Table();
		Dtl3Table.setRowName(name);
		aDtl4L = createDtl4L();
		createDtl4Table();
		Dtl4Table.setRowName(name);
		aDtl5L = createDtl5L();
		createDtl5Table();
		Dtl5Table.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_WrkReg_MC.jbCreateScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateCnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateHdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateHdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateHdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateHdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateDtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateDtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateHdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateNDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateMidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateWdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateEdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateSdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateDtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateDtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateBtm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateDtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateBtm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateDtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateBtm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateDtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateDtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateBtm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateBtn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbCreateEastBtn((MSBBP_WrkReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_WrkReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_WrkReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBBP_WrkReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBBP_WrkReg p) {
		p.Hdr_budget_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().budget_p());
		p.Hdr_budget_p_PPanel.setName("Hdr.budget_p");
		p.Hdr_budget = p.Hdr_budget_p_PPanel.Amt_amt;
		p.Hdr_budget.addAliasName("Hdr.budget", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBBP_WrkReg p) {
	}

	/**
	 * [Hdr3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr3(MSBBP_WrkReg p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MSBBP_WrkReg p) {
	}

	/**
	 * [Dtab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtab1(MSBBP_WrkReg p) {
	}

	/**
	 * [HdrDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrDtl(MSBBP_WrkReg p) {
	}

	/**
	 * [NDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateNDtl(MSBBP_WrkReg p) {
	}

	/**
	 * [MidDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMidDtl(MSBBP_WrkReg p) {
	}

	/**
	 * [Wdtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWdtl(MSBBP_WrkReg p) {
	}

	/**
	 * [Edtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEdtl(MSBBP_WrkReg p) {
	}

	/**
	 * [Sdtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSdtl(MSBBP_WrkReg p) {
	}

	/**
	 * [Dtab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtab2(MSBBP_WrkReg p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MSBBP_WrkReg p) {
		p.Dtl1_cst_addr_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBB.MSBBP1030.Dtl1R.$cst_addr_p);
		p.Dtl1_cst_addr_p_PPanel.setName("Dtl1.cst_addr_p");
		p.columnDtl1_cntry_cd = p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd;
		p.columnDtl1_cntry_cd.addAliasName("Dtl1.cntry_cd", p);
		p.columnDtl1_cntry_nm = p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm;
		p.columnDtl1_cntry_nm.addAliasName("Dtl1.cntry_nm", p);
		p.columnDtl1_zip_cd = p.Dtl1_cst_addr_p_PPanel.columnAddr_zip_cd;
		p.columnDtl1_zip_cd.addAliasName("Dtl1.zip_cd", p);
		p.columnDtl1_addr1 = p.Dtl1_cst_addr_p_PPanel.columnAddr_addr1;
		p.columnDtl1_addr1.addAliasName("Dtl1.addr1", p);
		p.columnDtl1_addr2 = p.Dtl1_cst_addr_p_PPanel.columnAddr_addr2;
		p.columnDtl1_addr2.addAliasName("Dtl1.addr2", p);
		p.columnDtl1_addr3 = p.Dtl1_cst_addr_p_PPanel.columnAddr_addr3;
		p.columnDtl1_addr3.addAliasName("Dtl1.addr3", p);
		p.columnDtl1_addr4 = p.Dtl1_cst_addr_p_PPanel.columnAddr_addr4;
		p.columnDtl1_addr4.addAliasName("Dtl1.addr4", p);
		p.columnDtl1_cst_cntct_dpt = p.Dtl1_cst_addr_p_PPanel.columnAddr_cntct_dpt;
		p.columnDtl1_cst_cntct_dpt.addAliasName("Dtl1.cst_cntct_dpt", p);
		p.columnDtl1_cst_cntct_psn = p.Dtl1_cst_addr_p_PPanel.columnAddr_cntct_psn;
		p.columnDtl1_cst_cntct_psn.addAliasName("Dtl1.cst_cntct_psn", p);
		p.columnDtl1_tel = p.Dtl1_cst_addr_p_PPanel.columnAddr_tel;
		p.columnDtl1_tel.addAliasName("Dtl1.tel", p);
		p.columnDtl1_fax = p.Dtl1_cst_addr_p_PPanel.columnAddr_fax;
		p.columnDtl1_fax.addAliasName("Dtl1.fax", p);
	}

	/**
	 * [Btm1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtm1(MSBBP_WrkReg p) {
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBBP_WrkReg p) {
	}

	/**
	 * [Btm2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtm2(MSBBP_WrkReg p) {
	}

	/**
	 * [Dtl3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl3(MSBBP_WrkReg p) {
	}

	/**
	 * [Btm3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtm3(MSBBP_WrkReg p) {
	}

	/**
	 * [Dtl4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl4(MSBBP_WrkReg p) {
	}

	/**
	 * [Dtl5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl5(MSBBP_WrkReg p) {
	}

	/**
	 * [Btm5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtm5(MSBBP_WrkReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_WrkReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_WrkReg p) {
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

	
	/** [Hdr_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr_cur_cd_p = null;

	/**
	 * [Hdr_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_cur_cd_ListPutter() {
		if (Hdr_cur_cd_p == null) {
			Hdr_cur_cd_p = createHdr_cur_cd_ListPutter(Hdr_cur_cd, "cur_cd", "cur_nm","amt_dec_place");

		}
		return Hdr_cur_cd_p;
	}
	
	
	/** [Hdr_wrk_sts_cd_ListPutter]の定義 */
	private MCListPutter Hdr_wrk_sts_cd_p = null;

	/**
	 * [Hdr_wrk_sts_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_wrk_sts_cd_ListPutter() {
		if (Hdr_wrk_sts_cd_p == null) {
			Hdr_wrk_sts_cd_p = createHdr_wrk_sts_cd_ListPutter(Hdr_wrk_sts_cd, "wrk_sts_cd", "wrk_sts_nm");

		}
		return Hdr_wrk_sts_cd_p;
	}
	
	
	/** [Hdr_slo_acc_cd_ListPutter]の定義 */
	private MCListPutter Hdr_slo_acc_cd_p = null;

	/**
	 * [Hdr_slo_acc_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_slo_acc_cd_ListPutter() {
		if (Hdr_slo_acc_cd_p == null) {
			Hdr_slo_acc_cd_p = createHdr_slo_acc_cd_ListPutter(Hdr_slo_acc_cd, "slo_acc_cd", "slo_acc_nm");

		}
		return Hdr_slo_acc_cd_p;
	}
	
	
	/** [Dtl1_cst_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_cst_cd_p = null;

	/**
	 * [Dtl1_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_cst_cd_ListPutter() {
		if (Dtl1_cst_cd_p == null) {
			Dtl1_cst_cd_p = createDtl1_cst_cd_ListPutter(columnDtl1_cst_cd, "cst_cd", "cst_nm","cst_sundry_flg","zip_cd","addr1","addr2","addr3","addr4","cst_cntct_dpt","cst_cntct_psn","tel","fax");

		}
		return Dtl1_cst_cd_p;
	}
	
	
	/** [Dtl2_act_sts_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_act_sts_cd_p = null;

	/**
	 * [Dtl2_act_sts_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_act_sts_cd_ListPutter() {
		if (Dtl2_act_sts_cd_p == null) {
			Dtl2_act_sts_cd_p = createDtl2_act_sts_cd_ListPutter(columnDtl2_act_sts_cd, "act_sts_cd", "act_sts_nm");

		}
		return Dtl2_act_sts_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_WrkReg create(){
		MSBBP_WrkReg p = new MSBBP_WrkReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_WrkReg create(String name){
		MSBBP_WrkReg p = new MSBBP_WrkReg(name);
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
		MSBBP_WrkReg_MC.jbfInitScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitCnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitHdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitHdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitHdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitHdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitDtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitDtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitHdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitNDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitMidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitWdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitEdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitSdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitDtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitDtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitBtm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitDtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitBtm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitDtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitBtm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitDtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitDtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitBtm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitBtn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbfInitEastBtn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitCnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitHdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitHdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitHdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitHdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitDtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitDtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitHdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitNDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitMidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitWdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitEdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitSdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitDtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitDtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitBtm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitDtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitBtm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitDtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitBtm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitDtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitDtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitBtm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitBtn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.jbInitEastBtn((MSBBP_WrkReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_wrk_no_Label = p.beansFactory.createLabel("Cnd.wrk_no_Label");
		p.Cnd_wrk_no = p.beansFactory.createTextField("Cnd.wrk_no");
		p.Cnd_wrk_no.setLabel(p.Cnd_wrk_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_wrk_no_Label = p.beansFactory.createLabel("Hdr.wrk_no_Label");
		p.Hdr_wrk_no = p.beansFactory.createTextField("Hdr.wrk_no");
		p.Hdr_wrk_no.setLabel(p.Hdr_wrk_no_Label);
		p.Hdr_wrk_nm_Label = p.beansFactory.createLabel("Hdr.wrk_nm_Label");
		p.Hdr_wrk_nm = p.beansFactory.createTextField("Hdr.wrk_nm");
		p.Hdr_wrk_nm.setLabel(p.Hdr_wrk_nm_Label);
		p.Hdr_st_dt_Label = p.beansFactory.createLabel("Hdr.st_dt_Label");
		p.Hdr_st_dt = p.beansFactory.createDateField("Hdr.st_dt");
		p.Hdr_st_dt.setLabel(p.Hdr_st_dt_Label);
		p.Hdr_end_dt_Label = p.beansFactory.createLabel("Hdr.end_dt_Label");
		p.Hdr_end_dt = p.beansFactory.createDateField("Hdr.end_dt");
		p.Hdr_end_dt.setLabel(p.Hdr_end_dt_Label);
		p.Hdr_term_cond_Label = p.beansFactory.createLabel("Hdr.term_cond_Label");
		p.Hdr_term_cond = p.beansFactory.createTextField("Hdr.term_cond");
		p.Hdr_term_cond.setLabel(p.Hdr_term_cond_Label);
		p.Hdr_cur_cd_Label = p.beansFactory.createLabel("Hdr.cur_cd_Label");
		p.Hdr_cur_cd = p.beansFactory.createTextComboBox("Hdr.cur_cd");
		p.Hdr_cur_cd.setLabel(p.Hdr_cur_cd_Label);
		p.Hdr_cur_nm = p.beansFactory.createTextField("Hdr.cur_nm");
		p.Hdr_amt_dec_place = p.beansFactory.createNumberField("Hdr.amt_dec_place");
		p.Hdr_wrk_sts_cd_Label = p.beansFactory.createLabel("Hdr.wrk_sts_cd_Label");
		p.Hdr_wrk_sts_cd = p.beansFactory.createTextComboBox("Hdr.wrk_sts_cd");
		p.Hdr_wrk_sts_cd.setLabel(p.Hdr_wrk_sts_cd_Label);
		p.Hdr_wrk_sts_nm = p.beansFactory.createTextField("Hdr.wrk_sts_nm");
		p.Hdr_slo_acc_cd_Label = p.beansFactory.createLabel("Hdr.slo_acc_cd_Label");
		p.Hdr_slo_acc_cd = p.beansFactory.createTextComboBox("Hdr.slo_acc_cd");
		p.Hdr_slo_acc_cd.setLabel(p.Hdr_slo_acc_cd_Label);
		p.Hdr_slo_acc_nm = p.beansFactory.createTextField("Hdr.slo_acc_nm");
		p.Hdr_wrk_ar_flg = p.beansFactory.createCheckBox("Hdr.wrk_ar_flg");
		p.Hdr_wrk_ap_flg = p.beansFactory.createCheckBox("Hdr.wrk_ap_flg");
		p.Hdr_slo_rsn_Label = p.beansFactory.createLabel("Hdr.slo_rsn_Label");
		p.Hdr_slo_rsn = p.beansFactory.createTextField("Hdr.slo_rsn");
		p.Hdr_slo_rsn.setLabel(p.Hdr_slo_rsn_Label);
		p.Hdr_fail_rsn_Label = p.beansFactory.createLabel("Hdr.fail_rsn_Label");
		p.Hdr_fail_rsn = p.beansFactory.createTextField("Hdr.fail_rsn");
		p.Hdr_fail_rsn.setLabel(p.Hdr_fail_rsn_Label);
		p.Hdr_wrk_rmrks_Label = p.beansFactory.createLabel("Hdr.wrk_rmrks_Label");
		p.Hdr_wrk_rmrks = p.beansFactory.createTextField("Hdr.wrk_rmrks");
		p.Hdr_wrk_rmrks.setLabel(p.Hdr_wrk_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_wrk_desc_Label = p.beansFactory.createLabel("Hdr.wrk_desc_Label");
		p.Hdr_wrk_descScrollPane = p.beansFactory.createScrollPane("Hdr.wrk_descscroll");
		p.Hdr_wrk_desc = p.beansFactory.createTextArea("Hdr.wrk_desc");
		p.Hdr_wrk_desc.setLabel(p.Hdr_wrk_desc_Label);
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
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr3(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Hdr3Panel = p.beansFactory.createPanel("Hdr3");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtab1(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtab1Panel = p.beansFactory.createPanel("Dtab1");
		// ブロックの項目の初期化
	}

	/**
	 * [HdrDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrDtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.HdrDtlPanel = p.beansFactory.createPanel("HdrDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [NDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitNDtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.NDtlPanel = p.beansFactory.createPanel("NDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [MidDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMidDtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.MidDtlPanel = p.beansFactory.createPanel("MidDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wdtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWdtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.WdtlPanel = p.beansFactory.createPanel("Wdtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Edtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEdtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.EdtlPanel = p.beansFactory.createPanel("Edtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Sdtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSdtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.SdtlPanel = p.beansFactory.createPanel("Sdtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtab2(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtab2Panel = p.beansFactory.createPanel("Dtab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel = p.beansFactory.createPanel("Dtl1");
		p.Dtl1ScrollPane = p.beansFactory.createScrollPane("Dtl1.scroll");
		p.createDtl1Table();
		// ブロックの項目の初期化
		p.columnDtl1_wrk_no = p.beansFactory.createTableColumn("Dtl1.wrk_no", MCColumnType.TEXT);
		p.columnDtl1_cst_cd = p.beansFactory.createTableColumn("Dtl1.cst_cd", MCColumnType.TEXT);
		p.columnDtl1_cst_nm = p.beansFactory.createTableColumn("Dtl1.cst_nm", MCColumnType.TEXT);
		p.columnDtl1_cst_sundry_flg = p.beansFactory.createTableColumn("Dtl1.cst_sundry_flg", MCColumnType.CHECK);
		p.columnDtl1_capital = p.beansFactory.createTableColumn("Dtl1.capital", MCColumnType.NUMBER);
		p.columnDtl1_emp_num = p.beansFactory.createTableColumn("Dtl1.emp_num", MCColumnType.NUMBER);
		p.columnDtl1_sub_char1 = p.beansFactory.createTableColumn("Dtl1.sub_char1", MCColumnType.TEXT);
		p.columnDtl1_sub_char2 = p.beansFactory.createTableColumn("Dtl1.sub_char2", MCColumnType.TEXT);
		p.columnDtl1_sub_char3 = p.beansFactory.createTableColumn("Dtl1.sub_char3", MCColumnType.TEXT);
		p.columnDtl1_ins_usr_id = p.beansFactory.createTableColumn("Dtl1.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl1_ins_usr_nm = p.beansFactory.createTableColumn("Dtl1.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_ins_func_id = p.beansFactory.createTableColumn("Dtl1.ins_func_id", MCColumnType.TEXT);
		p.columnDtl1_ins_func_nm = p.beansFactory.createTableColumn("Dtl1.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl1_ins_ts = p.beansFactory.createTableColumn("Dtl1.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl1_upd_usr_id = p.beansFactory.createTableColumn("Dtl1.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl1_upd_usr_nm = p.beansFactory.createTableColumn("Dtl1.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_upd_func_id = p.beansFactory.createTableColumn("Dtl1.upd_func_id", MCColumnType.TEXT);
		p.columnDtl1_upd_func_nm = p.beansFactory.createTableColumn("Dtl1.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl1_upd_ts = p.beansFactory.createTableColumn("Dtl1.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl1_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl1.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btm1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtm1(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Btm1Panel = p.beansFactory.createPanel("Btm1");
		// ブロックの項目の初期化
		p.Btm1_radd = p.beansFactory.createButton("Btm1.radd", "no_border");
		p.Btm1_rdel = p.beansFactory.createButton("Btm1.rdel", "no_border");
		p.Btm1_rcopy = p.beansFactory.createButton("Btm1.rcopy", "no_border");
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_wrk_no = p.beansFactory.createTableColumn("Dtl2.wrk_no", MCColumnType.TEXT);
		p.columnDtl2_hist_no = p.beansFactory.createTableColumn("Dtl2.hist_no", MCColumnType.NUMBER);
		p.columnDtl2_act_sts_cd = p.beansFactory.createTableColumn("Dtl2.act_sts_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_act_sts_nm = p.beansFactory.createTableColumn("Dtl2.act_sts_nm", MCColumnType.TEXT);
		p.columnDtl2_act_hist = p.beansFactory.createTableColumn("Dtl2.act_hist", MCColumnType.TEXT);
		p.columnDtl2_act_schd_dt = p.beansFactory.createTableColumn("Dtl2.act_schd_dt", MCColumnType.DATE);
		p.columnDtl2_act_schd = p.beansFactory.createTableColumn("Dtl2.act_schd", MCColumnType.TEXT);
		p.columnDtl2_act_act_dt = p.beansFactory.createTableColumn("Dtl2.act_act_dt", MCColumnType.DATE);
		p.columnDtl2_act_act = p.beansFactory.createTableColumn("Dtl2.act_act", MCColumnType.TEXT);
		p.columnDtl2_sub_char1 = p.beansFactory.createTableColumn("Dtl2.sub_char1", MCColumnType.TEXT);
		p.columnDtl2_sub_char2 = p.beansFactory.createTableColumn("Dtl2.sub_char2", MCColumnType.TEXT);
		p.columnDtl2_sub_char3 = p.beansFactory.createTableColumn("Dtl2.sub_char3", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_id = p.beansFactory.createTableColumn("Dtl2.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_nm = p.beansFactory.createTableColumn("Dtl2.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_func_id = p.beansFactory.createTableColumn("Dtl2.ins_func_id", MCColumnType.TEXT);
		p.columnDtl2_ins_func_nm = p.beansFactory.createTableColumn("Dtl2.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_ts = p.beansFactory.createTableColumn("Dtl2.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_usr_id = p.beansFactory.createTableColumn("Dtl2.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl2_upd_usr_nm = p.beansFactory.createTableColumn("Dtl2.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_func_id = p.beansFactory.createTableColumn("Dtl2.upd_func_id", MCColumnType.TEXT);
		p.columnDtl2_upd_func_nm = p.beansFactory.createTableColumn("Dtl2.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_ts = p.beansFactory.createTableColumn("Dtl2.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl2.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btm2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtm2(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Btm2Panel = p.beansFactory.createPanel("Btm2");
		// ブロックの項目の初期化
		p.Btm2_radd = p.beansFactory.createButton("Btm2.radd", "no_border");
		p.Btm2_rdel = p.beansFactory.createButton("Btm2.rdel", "no_border");
		p.Btm2_rcopy = p.beansFactory.createButton("Btm2.rcopy", "no_border");
	}

	/**
	 * [Dtl3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl3(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl3Panel = p.beansFactory.createPanel("Dtl3");
		p.Dtl3ScrollPane = p.beansFactory.createScrollPane("Dtl3.scroll");
		p.createDtl3Table();
		// ブロックの項目の初期化
		p.columnDtl3_wrk_no = p.beansFactory.createTableColumn("Dtl3.wrk_no", MCColumnType.TEXT);
		p.columnDtl3_comp_no = p.beansFactory.createTableColumn("Dtl3.comp_no", MCColumnType.NUMBER);
		p.columnDtl3_comp_dt = p.beansFactory.createTableColumn("Dtl3.comp_dt", MCColumnType.DATE);
		p.columnDtl3_comp_info = p.beansFactory.createTableColumn("Dtl3.comp_info", MCColumnType.TEXT);
		p.columnDtl3_sub_char1 = p.beansFactory.createTableColumn("Dtl3.sub_char1", MCColumnType.TEXT);
		p.columnDtl3_sub_char2 = p.beansFactory.createTableColumn("Dtl3.sub_char2", MCColumnType.TEXT);
		p.columnDtl3_sub_char3 = p.beansFactory.createTableColumn("Dtl3.sub_char3", MCColumnType.TEXT);
		p.columnDtl3_ins_usr_id = p.beansFactory.createTableColumn("Dtl3.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl3_ins_usr_nm = p.beansFactory.createTableColumn("Dtl3.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl3_ins_func_id = p.beansFactory.createTableColumn("Dtl3.ins_func_id", MCColumnType.TEXT);
		p.columnDtl3_ins_func_nm = p.beansFactory.createTableColumn("Dtl3.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl3_ins_ts = p.beansFactory.createTableColumn("Dtl3.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl3_upd_usr_id = p.beansFactory.createTableColumn("Dtl3.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl3_upd_usr_nm = p.beansFactory.createTableColumn("Dtl3.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl3_upd_func_id = p.beansFactory.createTableColumn("Dtl3.upd_func_id", MCColumnType.TEXT);
		p.columnDtl3_upd_func_nm = p.beansFactory.createTableColumn("Dtl3.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl3_upd_ts = p.beansFactory.createTableColumn("Dtl3.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl3_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl3.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btm3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtm3(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Btm3Panel = p.beansFactory.createPanel("Btm3");
		// ブロックの項目の初期化
		p.Btm3_radd = p.beansFactory.createButton("Btm3.radd", "no_border");
		p.Btm3_rdel = p.beansFactory.createButton("Btm3.rdel", "no_border");
		p.Btm3_rcopy = p.beansFactory.createButton("Btm3.rcopy", "no_border");
	}

	/**
	 * [Dtl4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl4(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl4Panel = p.beansFactory.createPanel("Dtl4");
		p.Dtl4ScrollPane = p.beansFactory.createScrollPane("Dtl4.scroll");
		p.createDtl4Table();
		// ブロックの項目の初期化
		p.columnDtl4_qtn_no = p.beansFactory.createTableColumn("Dtl4.qtn_no", MCColumnType.TEXT);
		p.columnDtl4_qtn_rev = p.beansFactory.createTableColumn("Dtl4.qtn_rev", MCColumnType.NUMBER);
		p.columnDtl4_qtn_typ = p.beansFactory.createTableColumn("Dtl4.qtn_typ", MCColumnType.TEXT);
		p.columnDtl4_qtn_typ_nm = p.beansFactory.createTableColumn("Dtl4.qtn_typ_nm", MCColumnType.TEXT);
		p.columnDtl4_qtn_dt = p.beansFactory.createTableColumn("Dtl4.qtn_dt", MCColumnType.DATE);
		p.columnDtl4_valid_dt = p.beansFactory.createTableColumn("Dtl4.valid_dt", MCColumnType.DATE);
		p.columnDtl4_rcpt_dt = p.beansFactory.createTableColumn("Dtl4.rcpt_dt", MCColumnType.DATE);
		p.columnDtl4_rcpt_usr_cd = p.beansFactory.createTableColumn("Dtl4.rcpt_usr_cd", MCColumnType.TEXT);
		p.columnDtl4_rcpt_usr_nm = p.beansFactory.createTableColumn("Dtl4.rcpt_usr_nm", MCColumnType.TEXT);
		p.columnDtl4_qtn_rmrks = p.beansFactory.createTableColumn("Dtl4.qtn_rmrks", MCColumnType.TEXT);
		p.columnDtl4_ins_usr_id = p.beansFactory.createTableColumn("Dtl4.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl4_ins_usr_nm = p.beansFactory.createTableColumn("Dtl4.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl4_ins_func_id = p.beansFactory.createTableColumn("Dtl4.ins_func_id", MCColumnType.TEXT);
		p.columnDtl4_ins_func_nm = p.beansFactory.createTableColumn("Dtl4.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl4_ins_ts = p.beansFactory.createTableColumn("Dtl4.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl4_upd_usr_id = p.beansFactory.createTableColumn("Dtl4.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl4_upd_usr_nm = p.beansFactory.createTableColumn("Dtl4.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl4_upd_func_id = p.beansFactory.createTableColumn("Dtl4.upd_func_id", MCColumnType.TEXT);
		p.columnDtl4_upd_func_nm = p.beansFactory.createTableColumn("Dtl4.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl4_upd_ts = p.beansFactory.createTableColumn("Dtl4.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl4_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl4.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Dtl5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl5(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl5Panel = p.beansFactory.createPanel("Dtl5");
		p.Dtl5ScrollPane = p.beansFactory.createScrollPane("Dtl5.scroll");
		p.createDtl5Table();
		// ブロックの項目の初期化
		p.columnDtl5_wrk_no = p.beansFactory.createTableColumn("Dtl5.wrk_no", MCColumnType.TEXT);
		p.columnDtl5_num_flg = p.beansFactory.createTableColumn("Dtl5.num_flg", MCColumnType.CHECK);
		p.columnDtl5_sno1 = p.beansFactory.createTableColumn("Dtl5.sno1", MCColumnType.TEXT);
		p.columnDtl5_qtn_flg = p.beansFactory.createTableColumn("Dtl5.qtn_flg", MCColumnType.CHECK);
		p.columnDtl5_slo_flg = p.beansFactory.createTableColumn("Dtl5.slo_flg", MCColumnType.CHECK);
		p.columnDtl5_ins_usr_id = p.beansFactory.createTableColumn("Dtl5.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl5_ins_usr_nm = p.beansFactory.createTableColumn("Dtl5.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl5_ins_func_id = p.beansFactory.createTableColumn("Dtl5.ins_func_id", MCColumnType.TEXT);
		p.columnDtl5_ins_func_nm = p.beansFactory.createTableColumn("Dtl5.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl5_ins_ts = p.beansFactory.createTableColumn("Dtl5.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl5_upd_usr_id = p.beansFactory.createTableColumn("Dtl5.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl5_upd_usr_nm = p.beansFactory.createTableColumn("Dtl5.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl5_upd_func_id = p.beansFactory.createTableColumn("Dtl5.upd_func_id", MCColumnType.TEXT);
		p.columnDtl5_upd_func_nm = p.beansFactory.createTableColumn("Dtl5.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl5_upd_ts = p.beansFactory.createTableColumn("Dtl5.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl5_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl5.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btm5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtm5(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Btm5Panel = p.beansFactory.createPanel("Btm5");
		// ブロックの項目の初期化
		p.Btm5_radd = p.beansFactory.createButton("Btm5.radd", "no_border");
		p.Btm5_rdel = p.beansFactory.createButton("Btm5.rdel", "no_border");
		p.Btm5_rcopy = p.beansFactory.createButton("Btm5.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1110 = p.beansFactory.createButton("Btn.open_MSBBP1110", "open");
		p.Btn_open_MSBBP1210 = p.beansFactory.createButton("Btn.open_MSBBP1210", "open");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_WrkReg p) {
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
	protected static void jbInitCnd(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1030.CndR.ope_META);
		p.CndPanel.add(p.Cnd_wrk_no_Label);
		p.CndPanel.add(p.Cnd_wrk_no);
		p.CndPanel.setLastBeans(p.Cnd_wrk_no);
		p.Cnd_wrk_no.setNextBeans(p.Cnd_srch);
		p.Cnd_wrk_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1030.CndR.wrk_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlTabPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
		p.Hdr2Panel.setNextBeans(p.Hdr3Panel);
		p.HdrTabTab.add(p.Hdr3Panel, "HdrTab.tab3");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_wrk_no_Label);
		p.HdrPanel.add(p.Hdr_wrk_no);
		p.HdrPanel.setLastBeans(p.Hdr_wrk_no);
		p.Hdr_wrk_no.setNextBeans(p.Hdr_wrk_nm);
		p.Hdr_wrk_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.wrk_no_META);
		p.HdrPanel.add(p.Hdr_wrk_nm_Label);
		p.HdrPanel.add(p.Hdr_wrk_nm);
		p.Hdr_wrk_nm.setNextBeans(p.Hdr_st_dt);
		p.Hdr_wrk_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.wrk_nm_META);
		p.HdrPanel.add(p.Hdr_st_dt_Label);
		p.HdrPanel.add(p.Hdr_st_dt);
		p.Hdr_st_dt.setNextBeans(p.Hdr_end_dt);
		p.Hdr_st_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.st_dt_META);
		p.Hdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_end_dt_Label);
		p.HdrPanel.add(p.Hdr_end_dt);
		p.Hdr_end_dt.setNextBeans(p.Hdr_term_cond);
		p.Hdr_end_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.end_dt_META);
		p.Hdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_term_cond_Label);
		p.HdrPanel.add(p.Hdr_term_cond);
		p.Hdr_term_cond.setNextBeans(p.Hdr_cur_cd);
		p.Hdr_term_cond.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.term_cond_META);
		p.Hdr_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_cur_cd.setLinkBeans(p.Hdr_cur_nm,p.Hdr_amt_dec_place);
		p.HdrPanel.add(p.Hdr_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_cur_cd);
		p.Hdr_cur_cd.setNextBeans(p.Hdr_cur_nm);
		p.Hdr_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.cur_cd_META);
		p.HdrPanel.add(p.Hdr_cur_nm);
		p.Hdr_cur_nm.setNextBeans(p.Hdr_amt_dec_place);
		p.Hdr_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.cur_nm_META);
		p.HdrPanel.add(p.Hdr_amt_dec_place);
		p.Hdr_amt_dec_place.setNextBeans(p.Hdr_budget_p_PPanel);
		p.Hdr_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_budget_p_PPanel);
		p.Hdr_budget_p_PPanel.setNextBeans(p.Hdr_wrk_sts_cd);
		p.Hdr_wrk_sts_cd.setListType(MCListType.STRICT);
		p.Hdr_wrk_sts_cd.setLinkBeans(p.Hdr_wrk_sts_nm);
		p.HdrPanel.add(p.Hdr_wrk_sts_cd_Label);
		p.HdrPanel.add(p.Hdr_wrk_sts_cd);
		p.Hdr_wrk_sts_cd.setNextBeans(p.Hdr_wrk_sts_nm);
		p.Hdr_wrk_sts_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.wrk_sts_cd_META);
		p.HdrPanel.add(p.Hdr_wrk_sts_nm);
		p.Hdr_wrk_sts_nm.setNextBeans(p.Hdr_slo_acc_cd);
		p.Hdr_wrk_sts_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.wrk_sts_nm_META);
		p.Hdr_slo_acc_cd.setListType(MCListType.STRICT);
		p.Hdr_slo_acc_cd.setLinkBeans(p.Hdr_slo_acc_nm);
		p.HdrPanel.add(p.Hdr_slo_acc_cd_Label);
		p.HdrPanel.add(p.Hdr_slo_acc_cd);
		p.Hdr_slo_acc_cd.setNextBeans(p.Hdr_slo_acc_nm);
		p.Hdr_slo_acc_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.slo_acc_cd_META);
		p.HdrPanel.add(p.Hdr_slo_acc_nm);
		p.Hdr_slo_acc_nm.setNextBeans(p.Hdr_wrk_ar_flg);
		p.Hdr_slo_acc_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.slo_acc_nm_META);
		p.HdrPanel.add(p.Hdr_wrk_ar_flg);
		p.Hdr_wrk_ar_flg.setNextBeans(p.Hdr_wrk_ap_flg);
		p.Hdr_wrk_ar_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.wrk_ar_flg_META);
		p.HdrPanel.add(p.Hdr_wrk_ap_flg);
		p.Hdr_wrk_ap_flg.setNextBeans(p.Hdr_slo_rsn);
		p.Hdr_wrk_ap_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.wrk_ap_flg_META);
		p.HdrPanel.add(p.Hdr_slo_rsn_Label);
		p.HdrPanel.add(p.Hdr_slo_rsn);
		p.Hdr_slo_rsn.setNextBeans(p.Hdr_fail_rsn);
		p.Hdr_slo_rsn.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.slo_rsn_META);
		p.HdrPanel.add(p.Hdr_fail_rsn_Label);
		p.HdrPanel.add(p.Hdr_fail_rsn);
		p.Hdr_fail_rsn.setNextBeans(p.Hdr_wrk_rmrks);
		p.Hdr_fail_rsn.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.fail_rsn_META);
		p.HdrPanel.add(p.Hdr_wrk_rmrks_Label);
		p.HdrPanel.add(p.Hdr_wrk_rmrks);
		p.Hdr_wrk_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_wrk_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.wrk_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_can_flg);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.can_flg_META);
		p.Hdr2Panel.add(p.Hdr_wrk_desc_Label);
		p.Hdr_wrk_descScrollPane.getViewport().add(p.Hdr_wrk_desc);
		p.Hdr2Panel.add(p.Hdr_wrk_descScrollPane);
		p.Hdr2Panel.setLastBeans(p.Hdr_wrk_desc);
		p.Hdr_wrk_desc.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.wrk_desc_META);
		p.Hdr3Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr3Panel.add(p.Hdr_ins_usr_id);
		p.Hdr3Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.ins_usr_id_META);
		p.Hdr3Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.ins_usr_nm_META);
		p.Hdr3Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr3Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.ins_func_id_META);
		p.Hdr3Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.ins_func_nm_META);
		p.Hdr3Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr3Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.upd_usr_id_META);
		p.Hdr3Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.upd_usr_nm_META);
		p.Hdr3Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr3Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.upd_func_id_META);
		p.Hdr3Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.upd_func_nm_META);
		p.Hdr3Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr3Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr3Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr3Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr3Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr3Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1030.HdrR.upd_cntr_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setNextBeans(p.Hdr3Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr3(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.add(p.DtlTabPanel);
		p.DtlTabPanel.setNextBeans(p.BtnPanel);
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.Dtab1Panel, "DtlTab.tab1");
		p.DtlTabTab.setLastBeans(p.Dtab1Panel);
		p.Dtab1Panel.setNextBeans(p.Dtab2Panel);
		p.DtlTabTab.add(p.Dtab2Panel, "DtlTab.tab2");
	}

	/**
	 * [Dtab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtab1(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtab1Panel.setNextBeans(p.Dtab2Panel);
		p.Dtab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Dtab1Panel.add(p.HdrDtlPanel, null);
		p.Dtab1Panel.setLastBeans(p.HdrDtlPanel);
		p.HdrDtlPanel.setNextBeans(p.SdtlPanel);
		p.Dtab1Panel.add(p.SdtlPanel, null);
	}

	/**
	 * [HdrDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrDtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.HdrDtlPanel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.HdrDtlPanel.add(p.NDtlPanel, null);
		p.HdrDtlPanel.setLastBeans(p.NDtlPanel);
		p.NDtlPanel.setNextBeans(p.MidDtlPanel);
		p.HdrDtlPanel.add(p.MidDtlPanel, null);
	}

	/**
	 * [NDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitNDtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.NDtlPanel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.NDtlPanel.add(p.Dtl1Panel, null);
		p.NDtlPanel.setLastBeans(p.Dtl1Panel);
		p.Dtl1Panel.setNextBeans(p.Btm1Panel);
		p.NDtlPanel.add(p.Btm1Panel, null);
	}

	/**
	 * [MidDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMidDtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.MidDtlPanel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.MidDtlPanel.add(p.WdtlPanel, null);
		p.MidDtlPanel.setLastBeans(p.WdtlPanel);
		p.WdtlPanel.setNextBeans(p.EdtlPanel);
		p.MidDtlPanel.add(p.EdtlPanel, null);
	}

	/**
	 * [Wdtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWdtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.WdtlPanel.setLayoutPosition("CLC+");
		// ブロックの項目の初期化
		p.WdtlPanel.add(p.Dtl2Panel, null);
		p.WdtlPanel.setLastBeans(p.Dtl2Panel);
		p.Dtl2Panel.setNextBeans(p.Btm2Panel);
		p.WdtlPanel.add(p.Btm2Panel, null);
	}

	/**
	 * [Edtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEdtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.EdtlPanel.setLayoutPosition("CRC+");
		// ブロックの項目の初期化
		p.EdtlPanel.add(p.Dtl3Panel, null);
		p.EdtlPanel.setLastBeans(p.Dtl3Panel);
		p.Dtl3Panel.setNextBeans(p.Btm3Panel);
		p.EdtlPanel.add(p.Btm3Panel, null);
	}

	/**
	 * [Sdtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSdtl(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.SdtlPanel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.SdtlPanel.add(p.Dtl4Panel, null);
		p.SdtlPanel.setLastBeans(p.Dtl4Panel);
	}

	/**
	 * [Dtab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtab2(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtab2Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Dtab2Panel.add(p.Dtl5Panel, null);
		p.Dtab2Panel.setLastBeans(p.Dtl5Panel);
		p.Dtl5Panel.setNextBeans(p.Btm5Panel);
		p.Dtab2Panel.add(p.Btm5Panel, null);
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel.add(p.Dtl1ScrollPane);
		p.Dtl1Panel.setLastBeans(p.Dtl1Table);
		p.Dtl1ScrollPane.setViewportView(p.Dtl1Table);
		p.Dtl1Table.setList(p.getDtl1L());
		p.Dtl1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btm1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtm1(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Btm1Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btm1_radd.setIcon("INSERT_RECORD");
		p.Btm1Panel.add(p.Btm1_radd);
		p.Btm1Panel.setLastBeans(p.Btm1_radd);
		p.Btm1_radd.setNextBeans(p.Btm1_rdel);
		p.Btm1_rdel.setIcon("DELETE_RECORD");
		p.Btm1Panel.add(p.Btm1_rdel);
		p.Btm1_rdel.setNextBeans(p.Btm1_rcopy);
		p.Btm1_rcopy.setIcon("COPY_RECORD");
		p.Btm1Panel.add(p.Btm1_rcopy);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btm2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtm2(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Btm2Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btm2_radd.setIcon("INSERT_RECORD");
		p.Btm2Panel.add(p.Btm2_radd);
		p.Btm2Panel.setLastBeans(p.Btm2_radd);
		p.Btm2_radd.setNextBeans(p.Btm2_rdel);
		p.Btm2_rdel.setIcon("DELETE_RECORD");
		p.Btm2Panel.add(p.Btm2_rdel);
		p.Btm2_rdel.setNextBeans(p.Btm2_rcopy);
		p.Btm2_rcopy.setIcon("COPY_RECORD");
		p.Btm2Panel.add(p.Btm2_rcopy);
	}

	/**
	 * [Dtl3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl3(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl3Panel.add(p.Dtl3ScrollPane);
		p.Dtl3Panel.setLastBeans(p.Dtl3Table);
		p.Dtl3ScrollPane.setViewportView(p.Dtl3Table);
		p.Dtl3Table.setList(p.getDtl3L());
		p.Dtl3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btm3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtm3(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Btm3Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btm3_radd.setIcon("INSERT_RECORD");
		p.Btm3Panel.add(p.Btm3_radd);
		p.Btm3Panel.setLastBeans(p.Btm3_radd);
		p.Btm3_radd.setNextBeans(p.Btm3_rdel);
		p.Btm3_rdel.setIcon("DELETE_RECORD");
		p.Btm3Panel.add(p.Btm3_rdel);
		p.Btm3_rdel.setNextBeans(p.Btm3_rcopy);
		p.Btm3_rcopy.setIcon("COPY_RECORD");
		p.Btm3Panel.add(p.Btm3_rcopy);
	}

	/**
	 * [Dtl4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl4(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl4Panel.add(p.Dtl4ScrollPane);
		p.Dtl4Panel.setLastBeans(p.Dtl4Table);
		p.Dtl4ScrollPane.setViewportView(p.Dtl4Table);
		p.Dtl4Table.setList(p.getDtl4L());
		p.Dtl4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl5(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Dtl5Panel.add(p.Dtl5ScrollPane);
		p.Dtl5Panel.setLastBeans(p.Dtl5Table);
		p.Dtl5ScrollPane.setViewportView(p.Dtl5Table);
		p.Dtl5Table.setList(p.getDtl5L());
		p.Dtl5Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btm5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtm5(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.Btm5Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btm5_radd.setIcon("INSERT_RECORD");
		p.Btm5Panel.add(p.Btm5_radd);
		p.Btm5Panel.setLastBeans(p.Btm5_radd);
		p.Btm5_radd.setNextBeans(p.Btm5_rdel);
		p.Btm5_rdel.setIcon("DELETE_RECORD");
		p.Btm5Panel.add(p.Btm5_rdel);
		p.Btm5_rdel.setNextBeans(p.Btm5_rcopy);
		p.Btm5_rcopy.setIcon("COPY_RECORD");
		p.Btm5Panel.add(p.Btm5_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_WrkReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1110.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP1110);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1110);
		p.Btn_open_MSBBP1110.setNextBeans(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setNextBeans(p.Btn_ins);
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
	protected static void jbInitEastBtn(MSBBP_WrkReg p) {
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
		MSBBP_WrkReg_MC.mcInitScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitCnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitHdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitHdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitHdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitHdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitDtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitDtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitHdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitNDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitMidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitWdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitEdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitSdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitDtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitDtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitBtm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitDtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitBtm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitDtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitBtm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitDtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitDtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitBtm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitBtn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.mcInitEastBtn((MSBBP_WrkReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_WrkReg_MC.statusInitSRCH_ScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Cnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_HdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Hdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Hdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Hdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_DtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Dtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_HdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_NDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_MidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Wdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Edtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Sdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Dtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Dtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Btm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Dtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Btm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Dtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Btm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Dtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Dtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Btm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_Btn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitSRCH_EastBtn((MSBBP_WrkReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_WrkReg_MC.statusInitREF_ScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Cnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_HdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Hdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Hdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Hdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_DtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Dtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_HdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_NDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_MidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Wdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Edtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Sdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Dtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Dtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Btm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Dtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Btm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Dtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Btm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Dtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Dtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Btm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_Btn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitREF_EastBtn((MSBBP_WrkReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_WrkReg_MC.statusInitUPD_ScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Cnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_HdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Hdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Hdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Hdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_DtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Dtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_HdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_NDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_MidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Wdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Edtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Sdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Dtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Dtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Btm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Dtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Btm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Dtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Btm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Dtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Dtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Btm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_Btn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitUPD_EastBtn((MSBBP_WrkReg)this);

		// [INS]ステータスのモードの設定
		MSBBP_WrkReg_MC.statusInitINS_ScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Cnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_HdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Hdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Hdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Hdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_DtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Dtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_HdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_NDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_MidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Wdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Edtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Sdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Dtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Dtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Btm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Dtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Btm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Dtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Btm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Dtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Dtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Btm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_Btn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitINS_EastBtn((MSBBP_WrkReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_WrkReg_MC.statusInitDEL_ScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Cnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_HdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Hdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Hdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Hdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_DtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Dtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_HdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_NDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_MidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Wdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Edtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Sdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Dtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Dtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Btm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Dtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Btm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Dtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Btm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Dtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Dtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Btm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_Btn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitDEL_EastBtn((MSBBP_WrkReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBBP_WrkReg_MC.statusInitFIX__I_ScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Cnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_HdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Hdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Hdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Hdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_DtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Dtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_HdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_NDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_MidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Wdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Edtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Sdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Dtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Dtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Btm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Dtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Btm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Dtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Btm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Dtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Dtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Btm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_Btn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__I_EastBtn((MSBBP_WrkReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_WrkReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Cnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_HdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Hdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Hdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Hdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_DtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Dtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_HdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_NDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_MidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Wdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Edtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Sdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Dtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Dtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Btm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Dtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Btm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Dtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Btm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Dtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Dtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Btm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_Btn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__U_EastBtn((MSBBP_WrkReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBBP_WrkReg_MC.statusInitFIX__D_ScreenOpe((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Cnd((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_HdrTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Hdr((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Hdr2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Hdr3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_DtlTab((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Dtab1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_HdrDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_NDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_MidDtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Wdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Edtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Sdtl((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Dtab2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Dtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Btm1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Dtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Btm2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Dtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Btm3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Dtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Dtl5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Btm5((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_Btn((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.statusInitFIX__D_EastBtn((MSBBP_WrkReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_WrkReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_WrkReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_wrk_no.setListListener(p);
		p.Cnd_wrk_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBBP_WrkReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBBP_WrkReg p) {
		p.Hdr_wrk_no.setListListener(p);
		p.Hdr_wrk_no.addAllListener(p);
		p.Hdr_wrk_nm.setListListener(p);
		p.Hdr_wrk_nm.addAllListener(p);
		p.Hdr_st_dt.setListListener(p);
		p.Hdr_st_dt.addAllListener(p);
		p.Hdr_end_dt.setListListener(p);
		p.Hdr_end_dt.addAllListener(p);
		p.Hdr_term_cond.setListListener(p);
		p.Hdr_term_cond.addAllListener(p);
		p.Hdr_cur_cd.setListListener(p);
		p.Hdr_cur_cd.addAllListener(p);
		p.Hdr_cur_nm.setListListener(p);
		p.Hdr_cur_nm.addAllListener(p);
		p.Hdr_amt_dec_place.setListListener(p);
		p.Hdr_amt_dec_place.addAllListener(p);
		p.Hdr_wrk_sts_cd.setListListener(p);
		p.Hdr_wrk_sts_cd.addAllListener(p);
		p.Hdr_wrk_sts_nm.setListListener(p);
		p.Hdr_wrk_sts_nm.addAllListener(p);
		p.Hdr_slo_acc_cd.setListListener(p);
		p.Hdr_slo_acc_cd.addAllListener(p);
		p.Hdr_slo_acc_nm.setListListener(p);
		p.Hdr_slo_acc_nm.addAllListener(p);
		p.Hdr_wrk_ar_flg.addAllListener(p);
		p.Hdr_wrk_ap_flg.addAllListener(p);
		p.Hdr_slo_rsn.setListListener(p);
		p.Hdr_slo_rsn.addAllListener(p);
		p.Hdr_fail_rsn.setListListener(p);
		p.Hdr_fail_rsn.addAllListener(p);
		p.Hdr_wrk_rmrks.setListListener(p);
		p.Hdr_wrk_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_wrk_desc.addAllListener(p);
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
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBBP_WrkReg p) {
	}

	/**
	 *  [Hdr3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr3(MSBBP_WrkReg p) {
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MSBBP_WrkReg p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Dtab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtab1(MSBBP_WrkReg p) {
	}

	/**
	 *  [HdrDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrDtl(MSBBP_WrkReg p) {
	}

	/**
	 *  [NDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitNDtl(MSBBP_WrkReg p) {
	}

	/**
	 *  [MidDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMidDtl(MSBBP_WrkReg p) {
	}

	/**
	 *  [Wdtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWdtl(MSBBP_WrkReg p) {
	}

	/**
	 *  [Edtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEdtl(MSBBP_WrkReg p) {
	}

	/**
	 *  [Sdtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSdtl(MSBBP_WrkReg p) {
	}

	/**
	 *  [Dtab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtab2(MSBBP_WrkReg p) {
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MSBBP_WrkReg p) {
		p.Dtl1Table.addAllListener(p);
		p.columnDtl1_wrk_no.addAllListener(p);
		p.columnDtl1_wrk_no.setListListener(p);
		p.columnDtl1_cst_cd.addAllListener(p);
		p.columnDtl1_cst_cd.setListListener(p);
		p.columnDtl1_cst_nm.addAllListener(p);
		p.columnDtl1_cst_nm.setListListener(p);
		p.columnDtl1_cst_sundry_flg.addAllListener(p);
		p.columnDtl1_capital.addAllListener(p);
		p.columnDtl1_capital.setListListener(p);
		p.columnDtl1_emp_num.addAllListener(p);
		p.columnDtl1_emp_num.setListListener(p);
		p.columnDtl1_sub_char1.addAllListener(p);
		p.columnDtl1_sub_char1.setListListener(p);
		p.columnDtl1_sub_char2.addAllListener(p);
		p.columnDtl1_sub_char2.setListListener(p);
		p.columnDtl1_sub_char3.addAllListener(p);
		p.columnDtl1_sub_char3.setListListener(p);
		p.columnDtl1_ins_usr_id.addAllListener(p);
		p.columnDtl1_ins_usr_id.setListListener(p);
		p.columnDtl1_ins_usr_nm.addAllListener(p);
		p.columnDtl1_ins_usr_nm.setListListener(p);
		p.columnDtl1_ins_func_id.addAllListener(p);
		p.columnDtl1_ins_func_id.setListListener(p);
		p.columnDtl1_ins_func_nm.addAllListener(p);
		p.columnDtl1_ins_func_nm.setListListener(p);
		p.columnDtl1_ins_ts.addAllListener(p);
		p.columnDtl1_ins_ts.setListListener(p);
		p.columnDtl1_upd_usr_id.addAllListener(p);
		p.columnDtl1_upd_usr_id.setListListener(p);
		p.columnDtl1_upd_usr_nm.addAllListener(p);
		p.columnDtl1_upd_usr_nm.setListListener(p);
		p.columnDtl1_upd_func_id.addAllListener(p);
		p.columnDtl1_upd_func_id.setListListener(p);
		p.columnDtl1_upd_func_nm.addAllListener(p);
		p.columnDtl1_upd_func_nm.setListListener(p);
		p.columnDtl1_upd_ts.addAllListener(p);
		p.columnDtl1_upd_ts.setListListener(p);
		p.columnDtl1_upd_srv_req_no.addAllListener(p);
		p.columnDtl1_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btm1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtm1(MSBBP_WrkReg p) {
		p.Btm1_radd.addAllListener(p);
		p.Btm1_radd.setAPMethodName("doBtm1_radd");
		p.Btm1_rdel.addAllListener(p);
		p.Btm1_rdel.setAPMethodName("doBtm1_rdel");
		p.Btm1_rcopy.addAllListener(p);
		p.Btm1_rcopy.setAPMethodName("doBtm1_rcopy");
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBBP_WrkReg p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_wrk_no.addAllListener(p);
		p.columnDtl2_wrk_no.setListListener(p);
		p.columnDtl2_hist_no.addAllListener(p);
		p.columnDtl2_hist_no.setListListener(p);
		p.columnDtl2_act_sts_cd.addAllListener(p);
		p.columnDtl2_act_sts_cd.setListListener(p);
		p.columnDtl2_act_sts_nm.addAllListener(p);
		p.columnDtl2_act_sts_nm.setListListener(p);
		p.columnDtl2_act_hist.addAllListener(p);
		p.columnDtl2_act_hist.setListListener(p);
		p.columnDtl2_act_schd_dt.addAllListener(p);
		p.columnDtl2_act_schd_dt.setListListener(p);
		p.columnDtl2_act_schd.addAllListener(p);
		p.columnDtl2_act_schd.setListListener(p);
		p.columnDtl2_act_act_dt.addAllListener(p);
		p.columnDtl2_act_act_dt.setListListener(p);
		p.columnDtl2_act_act.addAllListener(p);
		p.columnDtl2_act_act.setListListener(p);
		p.columnDtl2_sub_char1.addAllListener(p);
		p.columnDtl2_sub_char1.setListListener(p);
		p.columnDtl2_sub_char2.addAllListener(p);
		p.columnDtl2_sub_char2.setListListener(p);
		p.columnDtl2_sub_char3.addAllListener(p);
		p.columnDtl2_sub_char3.setListListener(p);
		p.columnDtl2_ins_usr_id.addAllListener(p);
		p.columnDtl2_ins_usr_id.setListListener(p);
		p.columnDtl2_ins_usr_nm.addAllListener(p);
		p.columnDtl2_ins_usr_nm.setListListener(p);
		p.columnDtl2_ins_func_id.addAllListener(p);
		p.columnDtl2_ins_func_id.setListListener(p);
		p.columnDtl2_ins_func_nm.addAllListener(p);
		p.columnDtl2_ins_func_nm.setListListener(p);
		p.columnDtl2_ins_ts.addAllListener(p);
		p.columnDtl2_ins_ts.setListListener(p);
		p.columnDtl2_upd_usr_id.addAllListener(p);
		p.columnDtl2_upd_usr_id.setListListener(p);
		p.columnDtl2_upd_usr_nm.addAllListener(p);
		p.columnDtl2_upd_usr_nm.setListListener(p);
		p.columnDtl2_upd_func_id.addAllListener(p);
		p.columnDtl2_upd_func_id.setListListener(p);
		p.columnDtl2_upd_func_nm.addAllListener(p);
		p.columnDtl2_upd_func_nm.setListListener(p);
		p.columnDtl2_upd_ts.addAllListener(p);
		p.columnDtl2_upd_ts.setListListener(p);
		p.columnDtl2_upd_srv_req_no.addAllListener(p);
		p.columnDtl2_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btm2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtm2(MSBBP_WrkReg p) {
		p.Btm2_radd.addAllListener(p);
		p.Btm2_radd.setAPMethodName("doBtm2_radd");
		p.Btm2_rdel.addAllListener(p);
		p.Btm2_rdel.setAPMethodName("doBtm2_rdel");
		p.Btm2_rcopy.addAllListener(p);
		p.Btm2_rcopy.setAPMethodName("doBtm2_rcopy");
	}

	/**
	 *  [Dtl3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl3(MSBBP_WrkReg p) {
		p.Dtl3Table.addAllListener(p);
		p.columnDtl3_wrk_no.addAllListener(p);
		p.columnDtl3_wrk_no.setListListener(p);
		p.columnDtl3_comp_no.addAllListener(p);
		p.columnDtl3_comp_no.setListListener(p);
		p.columnDtl3_comp_dt.addAllListener(p);
		p.columnDtl3_comp_dt.setListListener(p);
		p.columnDtl3_comp_info.addAllListener(p);
		p.columnDtl3_comp_info.setListListener(p);
		p.columnDtl3_sub_char1.addAllListener(p);
		p.columnDtl3_sub_char1.setListListener(p);
		p.columnDtl3_sub_char2.addAllListener(p);
		p.columnDtl3_sub_char2.setListListener(p);
		p.columnDtl3_sub_char3.addAllListener(p);
		p.columnDtl3_sub_char3.setListListener(p);
		p.columnDtl3_ins_usr_id.addAllListener(p);
		p.columnDtl3_ins_usr_id.setListListener(p);
		p.columnDtl3_ins_usr_nm.addAllListener(p);
		p.columnDtl3_ins_usr_nm.setListListener(p);
		p.columnDtl3_ins_func_id.addAllListener(p);
		p.columnDtl3_ins_func_id.setListListener(p);
		p.columnDtl3_ins_func_nm.addAllListener(p);
		p.columnDtl3_ins_func_nm.setListListener(p);
		p.columnDtl3_ins_ts.addAllListener(p);
		p.columnDtl3_ins_ts.setListListener(p);
		p.columnDtl3_upd_usr_id.addAllListener(p);
		p.columnDtl3_upd_usr_id.setListListener(p);
		p.columnDtl3_upd_usr_nm.addAllListener(p);
		p.columnDtl3_upd_usr_nm.setListListener(p);
		p.columnDtl3_upd_func_id.addAllListener(p);
		p.columnDtl3_upd_func_id.setListListener(p);
		p.columnDtl3_upd_func_nm.addAllListener(p);
		p.columnDtl3_upd_func_nm.setListListener(p);
		p.columnDtl3_upd_ts.addAllListener(p);
		p.columnDtl3_upd_ts.setListListener(p);
		p.columnDtl3_upd_srv_req_no.addAllListener(p);
		p.columnDtl3_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btm3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtm3(MSBBP_WrkReg p) {
		p.Btm3_radd.addAllListener(p);
		p.Btm3_radd.setAPMethodName("doBtm3_radd");
		p.Btm3_rdel.addAllListener(p);
		p.Btm3_rdel.setAPMethodName("doBtm3_rdel");
		p.Btm3_rcopy.addAllListener(p);
		p.Btm3_rcopy.setAPMethodName("doBtm3_rcopy");
	}

	/**
	 *  [Dtl4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl4(MSBBP_WrkReg p) {
		p.Dtl4Table.addAllListener(p);
		p.columnDtl4_qtn_no.addAllListener(p);
		p.columnDtl4_qtn_no.setListListener(p);
		p.columnDtl4_qtn_rev.addAllListener(p);
		p.columnDtl4_qtn_rev.setListListener(p);
		p.columnDtl4_qtn_typ.addAllListener(p);
		p.columnDtl4_qtn_typ.setListListener(p);
		p.columnDtl4_qtn_typ_nm.addAllListener(p);
		p.columnDtl4_qtn_typ_nm.setListListener(p);
		p.columnDtl4_qtn_dt.addAllListener(p);
		p.columnDtl4_qtn_dt.setListListener(p);
		p.columnDtl4_valid_dt.addAllListener(p);
		p.columnDtl4_valid_dt.setListListener(p);
		p.columnDtl4_rcpt_dt.addAllListener(p);
		p.columnDtl4_rcpt_dt.setListListener(p);
		p.columnDtl4_rcpt_usr_cd.addAllListener(p);
		p.columnDtl4_rcpt_usr_cd.setListListener(p);
		p.columnDtl4_rcpt_usr_nm.addAllListener(p);
		p.columnDtl4_rcpt_usr_nm.setListListener(p);
		p.columnDtl4_qtn_rmrks.addAllListener(p);
		p.columnDtl4_qtn_rmrks.setListListener(p);
		p.columnDtl4_ins_usr_id.addAllListener(p);
		p.columnDtl4_ins_usr_id.setListListener(p);
		p.columnDtl4_ins_usr_nm.addAllListener(p);
		p.columnDtl4_ins_usr_nm.setListListener(p);
		p.columnDtl4_ins_func_id.addAllListener(p);
		p.columnDtl4_ins_func_id.setListListener(p);
		p.columnDtl4_ins_func_nm.addAllListener(p);
		p.columnDtl4_ins_func_nm.setListListener(p);
		p.columnDtl4_ins_ts.addAllListener(p);
		p.columnDtl4_ins_ts.setListListener(p);
		p.columnDtl4_upd_usr_id.addAllListener(p);
		p.columnDtl4_upd_usr_id.setListListener(p);
		p.columnDtl4_upd_usr_nm.addAllListener(p);
		p.columnDtl4_upd_usr_nm.setListListener(p);
		p.columnDtl4_upd_func_id.addAllListener(p);
		p.columnDtl4_upd_func_id.setListListener(p);
		p.columnDtl4_upd_func_nm.addAllListener(p);
		p.columnDtl4_upd_func_nm.setListListener(p);
		p.columnDtl4_upd_ts.addAllListener(p);
		p.columnDtl4_upd_ts.setListListener(p);
		p.columnDtl4_upd_srv_req_no.addAllListener(p);
		p.columnDtl4_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Dtl5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl5(MSBBP_WrkReg p) {
		p.Dtl5Table.addAllListener(p);
		p.columnDtl5_wrk_no.addAllListener(p);
		p.columnDtl5_wrk_no.setListListener(p);
		p.columnDtl5_num_flg.addAllListener(p);
		p.columnDtl5_sno1.addAllListener(p);
		p.columnDtl5_sno1.setListListener(p);
		p.columnDtl5_qtn_flg.addAllListener(p);
		p.columnDtl5_slo_flg.addAllListener(p);
		p.columnDtl5_ins_usr_id.addAllListener(p);
		p.columnDtl5_ins_usr_id.setListListener(p);
		p.columnDtl5_ins_usr_nm.addAllListener(p);
		p.columnDtl5_ins_usr_nm.setListListener(p);
		p.columnDtl5_ins_func_id.addAllListener(p);
		p.columnDtl5_ins_func_id.setListListener(p);
		p.columnDtl5_ins_func_nm.addAllListener(p);
		p.columnDtl5_ins_func_nm.setListListener(p);
		p.columnDtl5_ins_ts.addAllListener(p);
		p.columnDtl5_ins_ts.setListListener(p);
		p.columnDtl5_upd_usr_id.addAllListener(p);
		p.columnDtl5_upd_usr_id.setListListener(p);
		p.columnDtl5_upd_usr_nm.addAllListener(p);
		p.columnDtl5_upd_usr_nm.setListListener(p);
		p.columnDtl5_upd_func_id.addAllListener(p);
		p.columnDtl5_upd_func_id.setListListener(p);
		p.columnDtl5_upd_func_nm.addAllListener(p);
		p.columnDtl5_upd_func_nm.setListListener(p);
		p.columnDtl5_upd_ts.addAllListener(p);
		p.columnDtl5_upd_ts.setListListener(p);
		p.columnDtl5_upd_srv_req_no.addAllListener(p);
		p.columnDtl5_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btm5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtm5(MSBBP_WrkReg p) {
		p.Btm5_radd.addAllListener(p);
		p.Btm5_radd.setAPMethodName("doBtm5_radd");
		p.Btm5_rdel.addAllListener(p);
		p.Btm5_rdel.setAPMethodName("doBtm5_rdel");
		p.Btm5_rcopy.addAllListener(p);
		p.Btm5_rcopy.setAPMethodName("doBtm5_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_WrkReg p) {
		p.Btn_open_MSBBP1110.addAllListener(p);
		p.Btn_open_MSBBP1110.setAPMethodName("doBtn_open_MSBBP1110");
		p.Btn_open_MSBBP1210.addAllListener(p);
		p.Btn_open_MSBBP1210.setAPMethodName("doBtn_open_MSBBP1210");
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
	protected static void mcInitEastBtn(MSBBP_WrkReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_WrkReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBBP_WrkReg p){
		p.Hdr_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_term_cond.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_budget_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_wrk_sts_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_sts_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_acc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_acc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_ar_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_ap_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_rsn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_fail_rsn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_desc.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr3(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtab1(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[HdrDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrDtl(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[NDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_NDtl(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[MidDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_MidDtl(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Wdtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wdtl(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Edtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Edtl(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Sdtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sdtl(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtab2(MSBBP_WrkReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1(MSBBP_WrkReg p){
		p.columnDtl1_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_cst_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_capital.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_emp_num.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btm1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btm1(MSBBP_WrkReg p){
		p.Btm1_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btm1_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btm1_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MSBBP_WrkReg p){
		p.columnDtl2_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_hist_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_act_sts_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_sts_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_hist.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_schd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_act.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btm2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btm2(MSBBP_WrkReg p){
		p.Btm2_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btm2_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btm2_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl3(MSBBP_WrkReg p){
		p.columnDtl3_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl3_comp_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl3_comp_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_comp_info.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btm3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btm3(MSBBP_WrkReg p){
		p.Btm3_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btm3_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btm3_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl4(MSBBP_WrkReg p){
		p.columnDtl4_qtn_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_qtn_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_valid_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl4_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl5(MSBBP_WrkReg p){
		p.columnDtl5_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl5_num_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_qtn_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_slo_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl5_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btm5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btm5(MSBBP_WrkReg p){
		p.Btm5_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btm5_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btm5_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_WrkReg p){
		p.Btn_open_MSBBP1110.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_WrkReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBBP_WrkReg p){
		p.Hdr_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_term_cond.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_budget_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_wrk_sts_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wrk_sts_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_slo_acc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_slo_acc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wrk_ar_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wrk_ap_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_slo_rsn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_fail_rsn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wrk_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wrk_desc.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr3(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Dtab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtab1(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[HdrDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrDtl(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[NDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_NDtl(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[MidDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_MidDtl(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Wdtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wdtl(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Edtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Edtl(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Sdtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sdtl(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Dtab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtab2(MSBBP_WrkReg p){

	}

	/**
	 * [REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1(MSBBP_WrkReg p){
		p.columnDtl1_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_cst_sundry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_capital.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_emp_num.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btm1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btm1(MSBBP_WrkReg p){
		p.Btm1_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btm1_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btm1_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MSBBP_WrkReg p){
		p.columnDtl2_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_hist_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_act_sts_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_sts_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_hist.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_schd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_act_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_act.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btm2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btm2(MSBBP_WrkReg p){
		p.Btm2_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btm2_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btm2_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl3(MSBBP_WrkReg p){
		p.columnDtl3_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl3_comp_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl3_comp_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_comp_info.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btm3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btm3(MSBBP_WrkReg p){
		p.Btm3_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btm3_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btm3_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl4(MSBBP_WrkReg p){
		p.columnDtl4_qtn_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_qtn_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_valid_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl4_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl5(MSBBP_WrkReg p){
		p.columnDtl5_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl5_num_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_qtn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_slo_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl5_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btm5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btm5(MSBBP_WrkReg p){
		p.Btm5_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btm5_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btm5_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_WrkReg p){
		p.Btn_open_MSBBP1110.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_WrkReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBBP_WrkReg p){
		p.Hdr_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wrk_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_st_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_end_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_term_cond.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_budget_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Hdr_wrk_sts_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_wrk_sts_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_slo_acc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_slo_acc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wrk_ar_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_wrk_ap_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_slo_rsn.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_fail_rsn.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_wrk_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wrk_desc.putMode(p, UPD, MCMode.ENABLE);
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
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr3(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlTab(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Dtab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtab1(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[HdrDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrDtl(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[NDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_NDtl(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[MidDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MidDtl(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Wdtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wdtl(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Edtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Edtl(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Sdtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sdtl(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Dtab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtab2(MSBBP_WrkReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1(MSBBP_WrkReg p){
		p.columnDtl1_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_cst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_cst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_cst_sundry_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.ENABLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_capital.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_emp_num.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btm1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btm1(MSBBP_WrkReg p){
		p.Btm1_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btm1_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btm1_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MSBBP_WrkReg p){
		p.columnDtl2_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_hist_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_act_sts_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_act_sts_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_act_hist.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_act_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_act_schd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_act_act_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_act_act.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btm2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btm2(MSBBP_WrkReg p){
		p.Btm2_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btm2_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btm2_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl3(MSBBP_WrkReg p){
		p.columnDtl3_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl3_comp_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl3_comp_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl3_comp_info.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl3_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl3_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl3_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl3_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btm3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btm3(MSBBP_WrkReg p){
		p.Btm3_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btm3_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btm3_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl4(MSBBP_WrkReg p){
		p.columnDtl4_qtn_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_qtn_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_valid_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl4_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl5(MSBBP_WrkReg p){
		p.columnDtl5_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl5_num_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl5_sno1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl5_qtn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_slo_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl5_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btm5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btm5(MSBBP_WrkReg p){
		p.Btm5_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btm5_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btm5_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_WrkReg p){
		p.Btn_open_MSBBP1110.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBBP_WrkReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBBP_WrkReg p){
		p.Hdr_wrk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wrk_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_st_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_end_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_term_cond.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_cur_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_budget_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Hdr_wrk_sts_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_wrk_sts_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_slo_acc_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_slo_acc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wrk_ar_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_wrk_ap_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_slo_rsn.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_fail_rsn.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_wrk_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wrk_desc.putMode(p, INS, MCMode.ENABLE);
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
		p.Hdr_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr3(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlTab(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Dtab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtab1(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[HdrDtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrDtl(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[NDtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_NDtl(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[MidDtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_MidDtl(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Wdtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Wdtl(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Edtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Edtl(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Sdtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Sdtl(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Dtab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtab2(MSBBP_WrkReg p){

	}

	/**
	 * [INS]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl1(MSBBP_WrkReg p){
		p.columnDtl1_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_cst_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_cst_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_cst_sundry_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.ENABLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_capital.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_emp_num.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btm1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btm1(MSBBP_WrkReg p){
		p.Btm1_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btm1_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btm1_rcopy.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2(MSBBP_WrkReg p){
		p.columnDtl2_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_hist_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_act_sts_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_act_sts_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_act_hist.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_act_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_act_schd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_act_act_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_act_act.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btm2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btm2(MSBBP_WrkReg p){
		p.Btm2_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btm2_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btm2_rcopy.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl3(MSBBP_WrkReg p){
		p.columnDtl3_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl3_comp_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl3_comp_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl3_comp_info.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl3_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl3_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl3_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl3_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btm3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btm3(MSBBP_WrkReg p){
		p.Btm3_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btm3_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btm3_rcopy.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Dtl4]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl4(MSBBP_WrkReg p){
		p.columnDtl4_qtn_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_qtn_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_valid_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl4_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Dtl5]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl5(MSBBP_WrkReg p){
		p.columnDtl5_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl5_num_flg.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl5_sno1.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl5_qtn_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_slo_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl5_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btm5]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btm5(MSBBP_WrkReg p){
		p.Btm5_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btm5_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btm5_rcopy.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBBP_WrkReg p){
		p.Btn_open_MSBBP1110.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_WrkReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBBP_WrkReg p){
		p.Hdr_wrk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wrk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_term_cond.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_budget_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_wrk_sts_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wrk_sts_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_slo_acc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_slo_acc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wrk_ar_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wrk_ap_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_slo_rsn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_fail_rsn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wrk_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wrk_desc.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Hdr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr3(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlTab(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Dtab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtab1(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[HdrDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrDtl(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[NDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_NDtl(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[MidDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_MidDtl(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Wdtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wdtl(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Edtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Edtl(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Sdtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Sdtl(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Dtab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtab2(MSBBP_WrkReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1(MSBBP_WrkReg p){
		p.columnDtl1_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_cst_sundry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_capital.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_emp_num.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btm1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btm1(MSBBP_WrkReg p){
		p.Btm1_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btm1_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btm1_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MSBBP_WrkReg p){
		p.columnDtl2_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_hist_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_act_sts_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_sts_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_hist.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_schd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_act_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_act.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btm2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btm2(MSBBP_WrkReg p){
		p.Btm2_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btm2_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btm2_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl3(MSBBP_WrkReg p){
		p.columnDtl3_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl3_comp_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl3_comp_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_comp_info.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btm3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btm3(MSBBP_WrkReg p){
		p.Btm3_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btm3_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btm3_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl4(MSBBP_WrkReg p){
		p.columnDtl4_qtn_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_qtn_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_valid_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl4_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl5]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl5(MSBBP_WrkReg p){
		p.columnDtl5_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl5_num_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_sno1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_qtn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_slo_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl5_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btm5]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btm5(MSBBP_WrkReg p){
		p.Btm5_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btm5_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btm5_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_WrkReg p){
		p.Btn_open_MSBBP1110.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBBP_WrkReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBBP_WrkReg p){
		p.Hdr_wrk_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wrk_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_st_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_end_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_term_cond.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_budget_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_wrk_sts_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wrk_sts_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_slo_acc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_slo_acc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wrk_ar_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wrk_ap_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_slo_rsn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_fail_rsn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wrk_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wrk_desc.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Hdr_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr3(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlTab(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtab1(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[HdrDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[NDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_NDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[MidDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_MidDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Wdtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Wdtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Edtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Edtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Sdtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Sdtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtab2(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl1(MSBBP_WrkReg p){
		p.columnDtl1_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_cst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_cst_sundry_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_capital.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_emp_num.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Btm1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btm1(MSBBP_WrkReg p){
		p.Btm1_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btm1_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btm1_rcopy.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl2(MSBBP_WrkReg p){
		p.columnDtl2_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_hist_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_act_sts_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_act_sts_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_act_hist.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_act_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_act_schd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_act_act_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_act_act.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Btm2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btm2(MSBBP_WrkReg p){
		p.Btm2_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btm2_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btm2_rcopy.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl3(MSBBP_WrkReg p){
		p.columnDtl3_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl3_comp_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl3_comp_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_comp_info.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Btm3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btm3(MSBBP_WrkReg p){
		p.Btm3_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btm3_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btm3_rcopy.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl4(MSBBP_WrkReg p){
		p.columnDtl4_qtn_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_qtn_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_valid_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl4_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl5(MSBBP_WrkReg p){
		p.columnDtl5_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl5_num_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_sno1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_qtn_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_slo_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl5_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Btm5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btm5(MSBBP_WrkReg p){
		p.Btm5_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btm5_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btm5_rcopy.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBBP_WrkReg p){
		p.Btn_open_MSBBP1110.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_WrkReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBBP_WrkReg p){
		p.Hdr_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_st_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_end_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_term_cond.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_budget_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_wrk_sts_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wrk_sts_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_slo_acc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_slo_acc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wrk_ar_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wrk_ap_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_slo_rsn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_fail_rsn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wrk_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wrk_desc.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Hdr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr3(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlTab(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtab1(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[HdrDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[NDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_NDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[MidDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_MidDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Wdtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Wdtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Edtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Edtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Sdtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Sdtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtab2(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1(MSBBP_WrkReg p){
		p.columnDtl1_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_cst_sundry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_capital.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_emp_num.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btm1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btm1(MSBBP_WrkReg p){
		p.Btm1_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btm1_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btm1_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2(MSBBP_WrkReg p){
		p.columnDtl2_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_hist_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_act_sts_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_sts_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_hist.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_schd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_act_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_act.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btm2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btm2(MSBBP_WrkReg p){
		p.Btm2_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btm2_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btm2_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl3(MSBBP_WrkReg p){
		p.columnDtl3_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl3_comp_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl3_comp_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_comp_info.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btm3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btm3(MSBBP_WrkReg p){
		p.Btm3_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btm3_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btm3_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl4(MSBBP_WrkReg p){
		p.columnDtl4_qtn_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_qtn_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_valid_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl4_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl5(MSBBP_WrkReg p){
		p.columnDtl5_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl5_num_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_sno1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_qtn_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_slo_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl5_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btm5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btm5(MSBBP_WrkReg p){
		p.Btm5_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btm5_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btm5_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_WrkReg p){
		p.Btn_open_MSBBP1110.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBBP_WrkReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBBP_WrkReg p){
		p.Hdr_wrk_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wrk_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_st_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_end_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_term_cond.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_budget_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_wrk_sts_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wrk_sts_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_slo_acc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_slo_acc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wrk_ar_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wrk_ap_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_slo_rsn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_fail_rsn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wrk_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wrk_desc.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Hdr_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr3(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlTab(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtab1(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[HdrDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[NDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_NDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[MidDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_MidDtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Wdtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Wdtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Edtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Edtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Sdtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Sdtl(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtab2(MSBBP_WrkReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1(MSBBP_WrkReg p){
		p.columnDtl1_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_cst_sundry_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_cst_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_capital.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_emp_num.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btm1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btm1(MSBBP_WrkReg p){
		p.Btm1_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btm1_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btm1_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2(MSBBP_WrkReg p){
		p.columnDtl2_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_hist_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_act_sts_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_sts_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_hist.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_schd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_act_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_act.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btm2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btm2(MSBBP_WrkReg p){
		p.Btm2_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btm2_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btm2_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl3(MSBBP_WrkReg p){
		p.columnDtl3_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl3_comp_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl3_comp_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_comp_info.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btm3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btm3(MSBBP_WrkReg p){
		p.Btm3_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btm3_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btm3_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl4(MSBBP_WrkReg p){
		p.columnDtl4_qtn_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_qtn_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_qtn_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_valid_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_rcpt_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_qtn_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl4_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl5(MSBBP_WrkReg p){
		p.columnDtl5_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl5_num_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_sno1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_qtn_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_slo_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl5_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btm5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btm5(MSBBP_WrkReg p){
		p.Btm5_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btm5_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btm5_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBBP_WrkReg p){
		p.Btn_open_MSBBP1110.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBBP_WrkReg p){

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
		MSBBP_WrkReg_MC.setTableConfigDtl1((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.setTableConfigDtl2((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.setTableConfigDtl3((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.setTableConfigDtl4((MSBBP_WrkReg)this);
		MSBBP_WrkReg_MC.setTableConfigDtl5((MSBBP_WrkReg)this);
	}

	/**
	 * [Dtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl1(MSBBP_WrkReg p) {
		p.columnDtl1_wrk_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.wrk_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_wrk_no);
		p.columnDtl1_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.cst_cd_META);
		p.columnDtl1_cst_cd.setListType(MCListType.STRICT);
		p.columnDtl1_cst_cd.addLinkBeans(p.columnDtl1_cst_nm,p.columnDtl1_cst_sundry_flg,p.columnDtl1_zip_cd,p.columnDtl1_addr1,p.columnDtl1_addr2,p.columnDtl1_addr3,p.columnDtl1_addr4,p.columnDtl1_cst_cntct_dpt,p.columnDtl1_cst_cntct_psn,p.columnDtl1_tel,p.columnDtl1_fax);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_cd);
		p.columnDtl1_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.cst_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_nm);
		p.columnDtl1_cst_sundry_flg.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.cst_sundry_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_sundry_flg);
		p.Dtl1Table.addTable(p.Dtl1_cst_addr_p_PPanel.AddrTable);
		p.columnDtl1_capital.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.capital_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_capital);
		p.columnDtl1_emp_num.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.emp_num_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_emp_num);
		p.columnDtl1_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.sub_char1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char1);
		p.columnDtl1_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.sub_char2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char2);
		p.columnDtl1_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.sub_char3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char3);
		p.columnDtl1_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.ins_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_id);
		p.columnDtl1_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.ins_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_nm);
		p.columnDtl1_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.ins_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_id);
		p.columnDtl1_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.ins_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_nm);
		p.columnDtl1_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.ins_ts_META);
		p.columnDtl1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_ts);
		p.columnDtl1_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.upd_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_id);
		p.columnDtl1_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.upd_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_nm);
		p.columnDtl1_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.upd_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_id);
		p.columnDtl1_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.upd_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_nm);
		p.columnDtl1_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.upd_ts_META);
		p.columnDtl1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_ts);
		p.columnDtl1_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl1R.upd_srv_req_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_srv_req_no);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MSBBP_WrkReg p) {
		p.columnDtl2_wrk_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.wrk_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_wrk_no);
		p.columnDtl2_hist_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.hist_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_hist_no);
		p.columnDtl2_act_sts_cd.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.act_sts_cd_META);
		p.columnDtl2_act_sts_cd.addLinkBeans(p.columnDtl2_act_sts_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_sts_cd);
		p.columnDtl2_act_sts_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.act_sts_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_sts_nm);
		p.columnDtl2_act_hist.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.act_hist_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_hist);
		p.columnDtl2_act_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.act_schd_dt_META);
		p.columnDtl2_act_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_schd_dt);
		p.columnDtl2_act_schd.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.act_schd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_schd);
		p.columnDtl2_act_act_dt.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.act_act_dt_META);
		p.columnDtl2_act_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_act_dt);
		p.columnDtl2_act_act.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.act_act_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_act);
		p.columnDtl2_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.sub_char1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char1);
		p.columnDtl2_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.sub_char2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char2);
		p.columnDtl2_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.sub_char3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char3);
		p.columnDtl2_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.ins_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_id);
		p.columnDtl2_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.ins_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_nm);
		p.columnDtl2_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.ins_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_id);
		p.columnDtl2_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.ins_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_nm);
		p.columnDtl2_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.ins_ts_META);
		p.columnDtl2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_ts);
		p.columnDtl2_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.upd_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_id);
		p.columnDtl2_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.upd_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_nm);
		p.columnDtl2_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.upd_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_id);
		p.columnDtl2_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.upd_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_nm);
		p.columnDtl2_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.upd_ts_META);
		p.columnDtl2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_ts);
		p.columnDtl2_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl2R.upd_srv_req_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_srv_req_no);
	}

	/**
	 * [Dtl3]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl3(MSBBP_WrkReg p) {
		p.columnDtl3_wrk_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.wrk_no_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_wrk_no);
		p.columnDtl3_comp_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.comp_no_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_comp_no);
		p.columnDtl3_comp_dt.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.comp_dt_META);
		p.columnDtl3_comp_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_comp_dt);
		p.columnDtl3_comp_info.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.comp_info_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_comp_info);
		p.columnDtl3_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.sub_char1_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_sub_char1);
		p.columnDtl3_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.sub_char2_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_sub_char2);
		p.columnDtl3_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.sub_char3_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_sub_char3);
		p.columnDtl3_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.ins_usr_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_usr_id);
		p.columnDtl3_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.ins_usr_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_usr_nm);
		p.columnDtl3_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.ins_func_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_func_id);
		p.columnDtl3_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.ins_func_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_func_nm);
		p.columnDtl3_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.ins_ts_META);
		p.columnDtl3_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_ts);
		p.columnDtl3_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.upd_usr_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_usr_id);
		p.columnDtl3_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.upd_usr_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_usr_nm);
		p.columnDtl3_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.upd_func_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_func_id);
		p.columnDtl3_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.upd_func_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_func_nm);
		p.columnDtl3_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.upd_ts_META);
		p.columnDtl3_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_ts);
		p.columnDtl3_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl3R.upd_srv_req_no_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_srv_req_no);
	}

	/**
	 * [Dtl4]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl4(MSBBP_WrkReg p) {
		p.columnDtl4_qtn_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.qtn_no_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_qtn_no);
		p.columnDtl4_qtn_rev.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.qtn_rev_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_qtn_rev);
		p.columnDtl4_qtn_typ.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.qtn_typ_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_qtn_typ);
		p.columnDtl4_qtn_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.qtn_typ_nm_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_qtn_typ_nm);
		p.columnDtl4_qtn_dt.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.qtn_dt_META);
		p.columnDtl4_qtn_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_qtn_dt);
		p.columnDtl4_valid_dt.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.valid_dt_META);
		p.columnDtl4_valid_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_valid_dt);
		p.columnDtl4_rcpt_dt.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.rcpt_dt_META);
		p.columnDtl4_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_rcpt_dt);
		p.columnDtl4_rcpt_usr_cd.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.rcpt_usr_cd_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_rcpt_usr_cd);
		p.columnDtl4_rcpt_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.rcpt_usr_nm_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_rcpt_usr_nm);
		p.columnDtl4_qtn_rmrks.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.qtn_rmrks_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_qtn_rmrks);
		p.columnDtl4_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.ins_usr_id_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_ins_usr_id);
		p.columnDtl4_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.ins_usr_nm_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_ins_usr_nm);
		p.columnDtl4_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.ins_func_id_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_ins_func_id);
		p.columnDtl4_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.ins_func_nm_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_ins_func_nm);
		p.columnDtl4_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.ins_ts_META);
		p.columnDtl4_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_ins_ts);
		p.columnDtl4_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.upd_usr_id_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_upd_usr_id);
		p.columnDtl4_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.upd_usr_nm_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_upd_usr_nm);
		p.columnDtl4_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.upd_func_id_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_upd_func_id);
		p.columnDtl4_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.upd_func_nm_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_upd_func_nm);
		p.columnDtl4_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.upd_ts_META);
		p.columnDtl4_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_upd_ts);
		p.columnDtl4_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl4R.upd_srv_req_no_META);
		p.Dtl4Table.addColumnConfig(p.columnDtl4_upd_srv_req_no);
	}

	/**
	 * [Dtl5]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl5(MSBBP_WrkReg p) {
		p.columnDtl5_wrk_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.wrk_no_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_wrk_no);
		p.columnDtl5_num_flg.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.num_flg_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_num_flg);
		p.columnDtl5_sno1.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.sno1_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_sno1);
		p.columnDtl5_qtn_flg.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.qtn_flg_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_qtn_flg);
		p.columnDtl5_slo_flg.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.slo_flg_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_slo_flg);
		p.columnDtl5_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.ins_usr_id_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_ins_usr_id);
		p.columnDtl5_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.ins_usr_nm_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_ins_usr_nm);
		p.columnDtl5_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.ins_func_id_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_ins_func_id);
		p.columnDtl5_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.ins_func_nm_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_ins_func_nm);
		p.columnDtl5_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.ins_ts_META);
		p.columnDtl5_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_ins_ts);
		p.columnDtl5_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.upd_usr_id_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_upd_usr_id);
		p.columnDtl5_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.upd_usr_nm_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_upd_usr_nm);
		p.columnDtl5_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.upd_func_id_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_upd_func_id);
		p.columnDtl5_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.upd_func_nm_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_upd_func_nm);
		p.columnDtl5_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.upd_ts_META);
		p.columnDtl5_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_upd_ts);
		p.columnDtl5_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1030.Dtl5R.upd_srv_req_no_META);
		p.Dtl5Table.addColumnConfig(p.columnDtl5_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_cur_cd.getListConfig().setPutter(getHdr_cur_cd_ListPutter());
		Hdr_wrk_sts_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_wrk_sts_cd.getListConfig().setPutter(getHdr_wrk_sts_cd_ListPutter());
		Hdr_slo_acc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_slo_acc_cd.getListConfig().setPutter(getHdr_slo_acc_cd_ListPutter());
		columnDtl1_cst_cd.getListConfig().setPutter(getDtl1_cst_cd_ListPutter());
		columnDtl2_act_sts_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_act_sts_cd.getListConfig().setPutter(getDtl2_act_sts_cd_ListPutter());
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
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
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
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
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
	}

	/**
	 * [Hdr_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr_wrk_sts_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_wrk_sts_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkSts");
		return lp;
	}
	 
	/**
	 * [Hdr_slo_acc_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_slo_acc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SloAcc");
		return lp;
	}
	 
	/**
	 * [Dtl1_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl2_act_sts_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_act_sts_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.ActSts");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_cur_cd) return getHdr_cur_cd(row, info);
		if(combo == Hdr_wrk_sts_cd) return getHdr_wrk_sts_cd(row, info);
		if(combo == Hdr_slo_acc_cd) return getHdr_slo_acc_cd(row, info);
		if(combo == columnDtl1_cst_cd) return getDtl1_cst_cd(row, info);
		if(combo == columnDtl2_act_sts_cd) return getDtl2_act_sts_cd(row, info);
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
		else if (ap == Btm1_radd) doBtm1_radd(info);
		else if (ap == Btm1_rdel) doBtm1_rdel(info);
		else if (ap == Btm1_rcopy) doBtm1_rcopy(info);
		else if (ap == Btm2_radd) doBtm2_radd(info);
		else if (ap == Btm2_rdel) doBtm2_rdel(info);
		else if (ap == Btm2_rcopy) doBtm2_rcopy(info);
		else if (ap == Btm3_radd) doBtm3_radd(info);
		else if (ap == Btm3_rdel) doBtm3_rdel(info);
		else if (ap == Btm3_rcopy) doBtm3_rcopy(info);
		else if (ap == Btm5_radd) doBtm5_radd(info);
		else if (ap == Btm5_rdel) doBtm5_rdel(info);
		else if (ap == Btm5_rcopy) doBtm5_rcopy(info);
		else if (ap == Btn_open_MSBBP1110) doBtn_open_MSBBP1110(info);
		else if (ap == Btn_open_MSBBP1210) doBtn_open_MSBBP1210(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btm1]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm1_radd(MCEventInfo info);

	/**
	 * [Btm1]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm1_rdel(MCEventInfo info);

	/**
	 * [Btm1]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm1_rcopy(MCEventInfo info);

	/**
	 * [Btm2]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm2_radd(MCEventInfo info);

	/**
	 * [Btm2]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm2_rdel(MCEventInfo info);

	/**
	 * [Btm2]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm2_rcopy(MCEventInfo info);

	/**
	 * [Btm3]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm3_radd(MCEventInfo info);

	/**
	 * [Btm3]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm3_rdel(MCEventInfo info);

	/**
	 * [Btm3]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm3_rcopy(MCEventInfo info);

	/**
	 * [Btm5]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm5_radd(MCEventInfo info);

	/**
	 * [Btm5]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm5_rdel(MCEventInfo info);

	/**
	 * [Btm5]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtm5_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1110(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1210(MCEventInfo info);

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
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == Dtl1Table) return doDtl1_VC(info);
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Dtl3Table) return doDtl3_VC(info);
		if (vc == Dtl4Table) return doDtl4_VC(info);
		if (vc == Dtl5Table) return doDtl5_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_wrk_no) return doCnd_wrk_no_VC(info);
		if (vc == Hdr_wrk_no) return doHdr_wrk_no_VC(info);
		if (vc == Hdr_wrk_nm) return doHdr_wrk_nm_VC(info);
		if (vc == Hdr_st_dt) return doHdr_st_dt_VC(info);
		if (vc == Hdr_end_dt) return doHdr_end_dt_VC(info);
		if (vc == Hdr_term_cond) return doHdr_term_cond_VC(info);
		if (vc == Hdr_cur_cd) return doHdr_cur_cd_VC(info);
		if (vc == Hdr_cur_nm) return doHdr_cur_nm_VC(info);
		if (vc == Hdr_amt_dec_place) return doHdr_amt_dec_place_VC(info);
		if (vc == Hdr_wrk_sts_cd) return doHdr_wrk_sts_cd_VC(info);
		if (vc == Hdr_wrk_sts_nm) return doHdr_wrk_sts_nm_VC(info);
		if (vc == Hdr_slo_acc_cd) return doHdr_slo_acc_cd_VC(info);
		if (vc == Hdr_slo_acc_nm) return doHdr_slo_acc_nm_VC(info);
		if (vc == Hdr_wrk_ar_flg) return doHdr_wrk_ar_flg_VC(info);
		if (vc == Hdr_wrk_ap_flg) return doHdr_wrk_ap_flg_VC(info);
		if (vc == Hdr_slo_rsn) return doHdr_slo_rsn_VC(info);
		if (vc == Hdr_fail_rsn) return doHdr_fail_rsn_VC(info);
		if (vc == Hdr_wrk_rmrks) return doHdr_wrk_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_wrk_desc) return doHdr_wrk_desc_VC(info);
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
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == columnDtl1_wrk_no) return doDtl1_wrk_no_VC(info);
		if (vc == columnDtl1_cst_cd) return doDtl1_cst_cd_VC(info);
		if (vc == columnDtl1_cst_nm) return doDtl1_cst_nm_VC(info);
		if (vc == columnDtl1_cst_sundry_flg) return doDtl1_cst_sundry_flg_VC(info);
		if (vc == columnDtl1_capital) return doDtl1_capital_VC(info);
		if (vc == columnDtl1_emp_num) return doDtl1_emp_num_VC(info);
		if (vc == columnDtl1_sub_char1) return doDtl1_sub_char1_VC(info);
		if (vc == columnDtl1_sub_char2) return doDtl1_sub_char2_VC(info);
		if (vc == columnDtl1_sub_char3) return doDtl1_sub_char3_VC(info);
		if (vc == columnDtl1_ins_usr_id) return doDtl1_ins_usr_id_VC(info);
		if (vc == columnDtl1_ins_usr_nm) return doDtl1_ins_usr_nm_VC(info);
		if (vc == columnDtl1_ins_func_id) return doDtl1_ins_func_id_VC(info);
		if (vc == columnDtl1_ins_func_nm) return doDtl1_ins_func_nm_VC(info);
		if (vc == columnDtl1_ins_ts) return doDtl1_ins_ts_VC(info);
		if (vc == columnDtl1_upd_usr_id) return doDtl1_upd_usr_id_VC(info);
		if (vc == columnDtl1_upd_usr_nm) return doDtl1_upd_usr_nm_VC(info);
		if (vc == columnDtl1_upd_func_id) return doDtl1_upd_func_id_VC(info);
		if (vc == columnDtl1_upd_func_nm) return doDtl1_upd_func_nm_VC(info);
		if (vc == columnDtl1_upd_ts) return doDtl1_upd_ts_VC(info);
		if (vc == columnDtl1_upd_srv_req_no) return doDtl1_upd_srv_req_no_VC(info);
		if (vc == columnDtl2_wrk_no) return doDtl2_wrk_no_VC(info);
		if (vc == columnDtl2_hist_no) return doDtl2_hist_no_VC(info);
		if (vc == columnDtl2_act_sts_cd) return doDtl2_act_sts_cd_VC(info);
		if (vc == columnDtl2_act_sts_nm) return doDtl2_act_sts_nm_VC(info);
		if (vc == columnDtl2_act_hist) return doDtl2_act_hist_VC(info);
		if (vc == columnDtl2_act_schd_dt) return doDtl2_act_schd_dt_VC(info);
		if (vc == columnDtl2_act_schd) return doDtl2_act_schd_VC(info);
		if (vc == columnDtl2_act_act_dt) return doDtl2_act_act_dt_VC(info);
		if (vc == columnDtl2_act_act) return doDtl2_act_act_VC(info);
		if (vc == columnDtl2_sub_char1) return doDtl2_sub_char1_VC(info);
		if (vc == columnDtl2_sub_char2) return doDtl2_sub_char2_VC(info);
		if (vc == columnDtl2_sub_char3) return doDtl2_sub_char3_VC(info);
		if (vc == columnDtl2_ins_usr_id) return doDtl2_ins_usr_id_VC(info);
		if (vc == columnDtl2_ins_usr_nm) return doDtl2_ins_usr_nm_VC(info);
		if (vc == columnDtl2_ins_func_id) return doDtl2_ins_func_id_VC(info);
		if (vc == columnDtl2_ins_func_nm) return doDtl2_ins_func_nm_VC(info);
		if (vc == columnDtl2_ins_ts) return doDtl2_ins_ts_VC(info);
		if (vc == columnDtl2_upd_usr_id) return doDtl2_upd_usr_id_VC(info);
		if (vc == columnDtl2_upd_usr_nm) return doDtl2_upd_usr_nm_VC(info);
		if (vc == columnDtl2_upd_func_id) return doDtl2_upd_func_id_VC(info);
		if (vc == columnDtl2_upd_func_nm) return doDtl2_upd_func_nm_VC(info);
		if (vc == columnDtl2_upd_ts) return doDtl2_upd_ts_VC(info);
		if (vc == columnDtl2_upd_srv_req_no) return doDtl2_upd_srv_req_no_VC(info);
		if (vc == columnDtl3_wrk_no) return doDtl3_wrk_no_VC(info);
		if (vc == columnDtl3_comp_no) return doDtl3_comp_no_VC(info);
		if (vc == columnDtl3_comp_dt) return doDtl3_comp_dt_VC(info);
		if (vc == columnDtl3_comp_info) return doDtl3_comp_info_VC(info);
		if (vc == columnDtl3_sub_char1) return doDtl3_sub_char1_VC(info);
		if (vc == columnDtl3_sub_char2) return doDtl3_sub_char2_VC(info);
		if (vc == columnDtl3_sub_char3) return doDtl3_sub_char3_VC(info);
		if (vc == columnDtl3_ins_usr_id) return doDtl3_ins_usr_id_VC(info);
		if (vc == columnDtl3_ins_usr_nm) return doDtl3_ins_usr_nm_VC(info);
		if (vc == columnDtl3_ins_func_id) return doDtl3_ins_func_id_VC(info);
		if (vc == columnDtl3_ins_func_nm) return doDtl3_ins_func_nm_VC(info);
		if (vc == columnDtl3_ins_ts) return doDtl3_ins_ts_VC(info);
		if (vc == columnDtl3_upd_usr_id) return doDtl3_upd_usr_id_VC(info);
		if (vc == columnDtl3_upd_usr_nm) return doDtl3_upd_usr_nm_VC(info);
		if (vc == columnDtl3_upd_func_id) return doDtl3_upd_func_id_VC(info);
		if (vc == columnDtl3_upd_func_nm) return doDtl3_upd_func_nm_VC(info);
		if (vc == columnDtl3_upd_ts) return doDtl3_upd_ts_VC(info);
		if (vc == columnDtl3_upd_srv_req_no) return doDtl3_upd_srv_req_no_VC(info);
		if (vc == columnDtl4_qtn_no) return doDtl4_qtn_no_VC(info);
		if (vc == columnDtl4_qtn_rev) return doDtl4_qtn_rev_VC(info);
		if (vc == columnDtl4_qtn_typ) return doDtl4_qtn_typ_VC(info);
		if (vc == columnDtl4_qtn_typ_nm) return doDtl4_qtn_typ_nm_VC(info);
		if (vc == columnDtl4_qtn_dt) return doDtl4_qtn_dt_VC(info);
		if (vc == columnDtl4_valid_dt) return doDtl4_valid_dt_VC(info);
		if (vc == columnDtl4_rcpt_dt) return doDtl4_rcpt_dt_VC(info);
		if (vc == columnDtl4_rcpt_usr_cd) return doDtl4_rcpt_usr_cd_VC(info);
		if (vc == columnDtl4_rcpt_usr_nm) return doDtl4_rcpt_usr_nm_VC(info);
		if (vc == columnDtl4_qtn_rmrks) return doDtl4_qtn_rmrks_VC(info);
		if (vc == columnDtl4_ins_usr_id) return doDtl4_ins_usr_id_VC(info);
		if (vc == columnDtl4_ins_usr_nm) return doDtl4_ins_usr_nm_VC(info);
		if (vc == columnDtl4_ins_func_id) return doDtl4_ins_func_id_VC(info);
		if (vc == columnDtl4_ins_func_nm) return doDtl4_ins_func_nm_VC(info);
		if (vc == columnDtl4_ins_ts) return doDtl4_ins_ts_VC(info);
		if (vc == columnDtl4_upd_usr_id) return doDtl4_upd_usr_id_VC(info);
		if (vc == columnDtl4_upd_usr_nm) return doDtl4_upd_usr_nm_VC(info);
		if (vc == columnDtl4_upd_func_id) return doDtl4_upd_func_id_VC(info);
		if (vc == columnDtl4_upd_func_nm) return doDtl4_upd_func_nm_VC(info);
		if (vc == columnDtl4_upd_ts) return doDtl4_upd_ts_VC(info);
		if (vc == columnDtl4_upd_srv_req_no) return doDtl4_upd_srv_req_no_VC(info);
		if (vc == columnDtl5_wrk_no) return doDtl5_wrk_no_VC(info);
		if (vc == columnDtl5_num_flg) return doDtl5_num_flg_VC(info);
		if (vc == columnDtl5_sno1) return doDtl5_sno1_VC(info);
		if (vc == columnDtl5_qtn_flg) return doDtl5_qtn_flg_VC(info);
		if (vc == columnDtl5_slo_flg) return doDtl5_slo_flg_VC(info);
		if (vc == columnDtl5_ins_usr_id) return doDtl5_ins_usr_id_VC(info);
		if (vc == columnDtl5_ins_usr_nm) return doDtl5_ins_usr_nm_VC(info);
		if (vc == columnDtl5_ins_func_id) return doDtl5_ins_func_id_VC(info);
		if (vc == columnDtl5_ins_func_nm) return doDtl5_ins_func_nm_VC(info);
		if (vc == columnDtl5_ins_ts) return doDtl5_ins_ts_VC(info);
		if (vc == columnDtl5_upd_usr_id) return doDtl5_upd_usr_id_VC(info);
		if (vc == columnDtl5_upd_usr_nm) return doDtl5_upd_usr_nm_VC(info);
		if (vc == columnDtl5_upd_func_id) return doDtl5_upd_func_id_VC(info);
		if (vc == columnDtl5_upd_func_nm) return doDtl5_upd_func_nm_VC(info);
		if (vc == columnDtl5_upd_ts) return doDtl5_upd_ts_VC(info);
		if (vc == columnDtl5_upd_srv_req_no) return doDtl5_upd_srv_req_no_VC(info);
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
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[term_cond]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_term_cond_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wrk_sts_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wrk_sts_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wrk_sts_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wrk_sts_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[slo_acc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_slo_acc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[slo_acc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_slo_acc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wrk_ar_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wrk_ar_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wrk_ap_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wrk_ap_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[slo_rsn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_slo_rsn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[fail_rsn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_fail_rsn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wrk_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wrk_rmrks_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wrk_desc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wrk_desc_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[capital]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_capital_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[emp_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_emp_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[hist_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_hist_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_sts_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_sts_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_sts_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_sts_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_hist]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_hist_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_schd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_schd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_act]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_act_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[comp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_comp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[comp_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_comp_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[comp_info]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_comp_info_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[qtn_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_qtn_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[qtn_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_qtn_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[qtn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_qtn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[qtn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_qtn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[qtn_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_qtn_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[valid_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_valid_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_rcpt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_rcpt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[qtn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_qtn_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl4]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl4_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[num_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_num_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[qtn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_qtn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl5]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl5_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == Dtl1Table) doDtl1_NC(info);
		else if (nc == Dtl2Table) doDtl2_NC(info);
		else if (nc == Dtl3Table) doDtl3_NC(info);
		else if (nc == Dtl4Table) doDtl4_NC(info);
		else if (nc == Dtl5Table) doDtl5_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_wrk_no) doCnd_wrk_no_NC(info);
		else if (nc == Hdr_wrk_no) doHdr_wrk_no_NC(info);
		else if (nc == Hdr_wrk_nm) doHdr_wrk_nm_NC(info);
		else if (nc == Hdr_st_dt) doHdr_st_dt_NC(info);
		else if (nc == Hdr_end_dt) doHdr_end_dt_NC(info);
		else if (nc == Hdr_term_cond) doHdr_term_cond_NC(info);
		else if (nc == Hdr_cur_cd) doHdr_cur_cd_NC(info);
		else if (nc == Hdr_cur_nm) doHdr_cur_nm_NC(info);
		else if (nc == Hdr_amt_dec_place) doHdr_amt_dec_place_NC(info);
		else if (nc == Hdr_wrk_sts_cd) doHdr_wrk_sts_cd_NC(info);
		else if (nc == Hdr_wrk_sts_nm) doHdr_wrk_sts_nm_NC(info);
		else if (nc == Hdr_slo_acc_cd) doHdr_slo_acc_cd_NC(info);
		else if (nc == Hdr_slo_acc_nm) doHdr_slo_acc_nm_NC(info);
		else if (nc == Hdr_wrk_ar_flg) doHdr_wrk_ar_flg_NC(info);
		else if (nc == Hdr_wrk_ap_flg) doHdr_wrk_ap_flg_NC(info);
		else if (nc == Hdr_slo_rsn) doHdr_slo_rsn_NC(info);
		else if (nc == Hdr_fail_rsn) doHdr_fail_rsn_NC(info);
		else if (nc == Hdr_wrk_rmrks) doHdr_wrk_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_wrk_desc) doHdr_wrk_desc_NC(info);
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
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == columnDtl1_wrk_no) doDtl1_wrk_no_NC(info);
		else if (nc == columnDtl1_cst_cd) doDtl1_cst_cd_NC(info);
		else if (nc == columnDtl1_cst_nm) doDtl1_cst_nm_NC(info);
		else if (nc == columnDtl1_cst_sundry_flg) doDtl1_cst_sundry_flg_NC(info);
		else if (nc == columnDtl1_capital) doDtl1_capital_NC(info);
		else if (nc == columnDtl1_emp_num) doDtl1_emp_num_NC(info);
		else if (nc == columnDtl1_sub_char1) doDtl1_sub_char1_NC(info);
		else if (nc == columnDtl1_sub_char2) doDtl1_sub_char2_NC(info);
		else if (nc == columnDtl1_sub_char3) doDtl1_sub_char3_NC(info);
		else if (nc == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NC(info);
		else if (nc == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NC(info);
		else if (nc == columnDtl1_ins_func_id) doDtl1_ins_func_id_NC(info);
		else if (nc == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NC(info);
		else if (nc == columnDtl1_ins_ts) doDtl1_ins_ts_NC(info);
		else if (nc == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NC(info);
		else if (nc == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NC(info);
		else if (nc == columnDtl1_upd_func_id) doDtl1_upd_func_id_NC(info);
		else if (nc == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NC(info);
		else if (nc == columnDtl1_upd_ts) doDtl1_upd_ts_NC(info);
		else if (nc == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NC(info);
		else if (nc == columnDtl2_wrk_no) doDtl2_wrk_no_NC(info);
		else if (nc == columnDtl2_hist_no) doDtl2_hist_no_NC(info);
		else if (nc == columnDtl2_act_sts_cd) doDtl2_act_sts_cd_NC(info);
		else if (nc == columnDtl2_act_sts_nm) doDtl2_act_sts_nm_NC(info);
		else if (nc == columnDtl2_act_hist) doDtl2_act_hist_NC(info);
		else if (nc == columnDtl2_act_schd_dt) doDtl2_act_schd_dt_NC(info);
		else if (nc == columnDtl2_act_schd) doDtl2_act_schd_NC(info);
		else if (nc == columnDtl2_act_act_dt) doDtl2_act_act_dt_NC(info);
		else if (nc == columnDtl2_act_act) doDtl2_act_act_NC(info);
		else if (nc == columnDtl2_sub_char1) doDtl2_sub_char1_NC(info);
		else if (nc == columnDtl2_sub_char2) doDtl2_sub_char2_NC(info);
		else if (nc == columnDtl2_sub_char3) doDtl2_sub_char3_NC(info);
		else if (nc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NC(info);
		else if (nc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NC(info);
		else if (nc == columnDtl2_ins_func_id) doDtl2_ins_func_id_NC(info);
		else if (nc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NC(info);
		else if (nc == columnDtl2_ins_ts) doDtl2_ins_ts_NC(info);
		else if (nc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NC(info);
		else if (nc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NC(info);
		else if (nc == columnDtl2_upd_func_id) doDtl2_upd_func_id_NC(info);
		else if (nc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NC(info);
		else if (nc == columnDtl2_upd_ts) doDtl2_upd_ts_NC(info);
		else if (nc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NC(info);
		else if (nc == columnDtl3_wrk_no) doDtl3_wrk_no_NC(info);
		else if (nc == columnDtl3_comp_no) doDtl3_comp_no_NC(info);
		else if (nc == columnDtl3_comp_dt) doDtl3_comp_dt_NC(info);
		else if (nc == columnDtl3_comp_info) doDtl3_comp_info_NC(info);
		else if (nc == columnDtl3_sub_char1) doDtl3_sub_char1_NC(info);
		else if (nc == columnDtl3_sub_char2) doDtl3_sub_char2_NC(info);
		else if (nc == columnDtl3_sub_char3) doDtl3_sub_char3_NC(info);
		else if (nc == columnDtl3_ins_usr_id) doDtl3_ins_usr_id_NC(info);
		else if (nc == columnDtl3_ins_usr_nm) doDtl3_ins_usr_nm_NC(info);
		else if (nc == columnDtl3_ins_func_id) doDtl3_ins_func_id_NC(info);
		else if (nc == columnDtl3_ins_func_nm) doDtl3_ins_func_nm_NC(info);
		else if (nc == columnDtl3_ins_ts) doDtl3_ins_ts_NC(info);
		else if (nc == columnDtl3_upd_usr_id) doDtl3_upd_usr_id_NC(info);
		else if (nc == columnDtl3_upd_usr_nm) doDtl3_upd_usr_nm_NC(info);
		else if (nc == columnDtl3_upd_func_id) doDtl3_upd_func_id_NC(info);
		else if (nc == columnDtl3_upd_func_nm) doDtl3_upd_func_nm_NC(info);
		else if (nc == columnDtl3_upd_ts) doDtl3_upd_ts_NC(info);
		else if (nc == columnDtl3_upd_srv_req_no) doDtl3_upd_srv_req_no_NC(info);
		else if (nc == columnDtl4_qtn_no) doDtl4_qtn_no_NC(info);
		else if (nc == columnDtl4_qtn_rev) doDtl4_qtn_rev_NC(info);
		else if (nc == columnDtl4_qtn_typ) doDtl4_qtn_typ_NC(info);
		else if (nc == columnDtl4_qtn_typ_nm) doDtl4_qtn_typ_nm_NC(info);
		else if (nc == columnDtl4_qtn_dt) doDtl4_qtn_dt_NC(info);
		else if (nc == columnDtl4_valid_dt) doDtl4_valid_dt_NC(info);
		else if (nc == columnDtl4_rcpt_dt) doDtl4_rcpt_dt_NC(info);
		else if (nc == columnDtl4_rcpt_usr_cd) doDtl4_rcpt_usr_cd_NC(info);
		else if (nc == columnDtl4_rcpt_usr_nm) doDtl4_rcpt_usr_nm_NC(info);
		else if (nc == columnDtl4_qtn_rmrks) doDtl4_qtn_rmrks_NC(info);
		else if (nc == columnDtl4_ins_usr_id) doDtl4_ins_usr_id_NC(info);
		else if (nc == columnDtl4_ins_usr_nm) doDtl4_ins_usr_nm_NC(info);
		else if (nc == columnDtl4_ins_func_id) doDtl4_ins_func_id_NC(info);
		else if (nc == columnDtl4_ins_func_nm) doDtl4_ins_func_nm_NC(info);
		else if (nc == columnDtl4_ins_ts) doDtl4_ins_ts_NC(info);
		else if (nc == columnDtl4_upd_usr_id) doDtl4_upd_usr_id_NC(info);
		else if (nc == columnDtl4_upd_usr_nm) doDtl4_upd_usr_nm_NC(info);
		else if (nc == columnDtl4_upd_func_id) doDtl4_upd_func_id_NC(info);
		else if (nc == columnDtl4_upd_func_nm) doDtl4_upd_func_nm_NC(info);
		else if (nc == columnDtl4_upd_ts) doDtl4_upd_ts_NC(info);
		else if (nc == columnDtl4_upd_srv_req_no) doDtl4_upd_srv_req_no_NC(info);
		else if (nc == columnDtl5_wrk_no) doDtl5_wrk_no_NC(info);
		else if (nc == columnDtl5_num_flg) doDtl5_num_flg_NC(info);
		else if (nc == columnDtl5_sno1) doDtl5_sno1_NC(info);
		else if (nc == columnDtl5_qtn_flg) doDtl5_qtn_flg_NC(info);
		else if (nc == columnDtl5_slo_flg) doDtl5_slo_flg_NC(info);
		else if (nc == columnDtl5_ins_usr_id) doDtl5_ins_usr_id_NC(info);
		else if (nc == columnDtl5_ins_usr_nm) doDtl5_ins_usr_nm_NC(info);
		else if (nc == columnDtl5_ins_func_id) doDtl5_ins_func_id_NC(info);
		else if (nc == columnDtl5_ins_func_nm) doDtl5_ins_func_nm_NC(info);
		else if (nc == columnDtl5_ins_ts) doDtl5_ins_ts_NC(info);
		else if (nc == columnDtl5_upd_usr_id) doDtl5_upd_usr_id_NC(info);
		else if (nc == columnDtl5_upd_usr_nm) doDtl5_upd_usr_nm_NC(info);
		else if (nc == columnDtl5_upd_func_id) doDtl5_upd_func_id_NC(info);
		else if (nc == columnDtl5_upd_func_nm) doDtl5_upd_func_nm_NC(info);
		else if (nc == columnDtl5_upd_ts) doDtl5_upd_ts_NC(info);
		else if (nc == columnDtl5_upd_srv_req_no) doDtl5_upd_srv_req_no_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term_cond]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_cond_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_sts_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_sts_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_sts_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_sts_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_acc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_acc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_acc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_acc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_ar_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_ar_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_ap_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_ap_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_rsn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_rsn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fail_rsn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fail_rsn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_rmrks_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_desc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_desc_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[capital]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_capital_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[emp_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_emp_num_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[hist_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_hist_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_sts_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_sts_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_sts_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_sts_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_hist]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_hist_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_schd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_schd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_act]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_act_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_info]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_info_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[valid_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_valid_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[num_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_num_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[qtn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_qtn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == Dtl1Table) doDtl1_NE(info);
		else if (ne == Dtl2Table) doDtl2_NE(info);
		else if (ne == Dtl3Table) doDtl3_NE(info);
		else if (ne == Dtl4Table) doDtl4_NE(info);
		else if (ne == Dtl5Table) doDtl5_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_wrk_no) doCnd_wrk_no_NE(info);
		else if (ne == Hdr_wrk_no) doHdr_wrk_no_NE(info);
		else if (ne == Hdr_wrk_nm) doHdr_wrk_nm_NE(info);
		else if (ne == Hdr_st_dt) doHdr_st_dt_NE(info);
		else if (ne == Hdr_end_dt) doHdr_end_dt_NE(info);
		else if (ne == Hdr_term_cond) doHdr_term_cond_NE(info);
		else if (ne == Hdr_cur_cd) doHdr_cur_cd_NE(info);
		else if (ne == Hdr_cur_nm) doHdr_cur_nm_NE(info);
		else if (ne == Hdr_amt_dec_place) doHdr_amt_dec_place_NE(info);
		else if (ne == Hdr_wrk_sts_cd) doHdr_wrk_sts_cd_NE(info);
		else if (ne == Hdr_wrk_sts_nm) doHdr_wrk_sts_nm_NE(info);
		else if (ne == Hdr_slo_acc_cd) doHdr_slo_acc_cd_NE(info);
		else if (ne == Hdr_slo_acc_nm) doHdr_slo_acc_nm_NE(info);
		else if (ne == Hdr_wrk_ar_flg) doHdr_wrk_ar_flg_NE(info);
		else if (ne == Hdr_wrk_ap_flg) doHdr_wrk_ap_flg_NE(info);
		else if (ne == Hdr_slo_rsn) doHdr_slo_rsn_NE(info);
		else if (ne == Hdr_fail_rsn) doHdr_fail_rsn_NE(info);
		else if (ne == Hdr_wrk_rmrks) doHdr_wrk_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_wrk_desc) doHdr_wrk_desc_NE(info);
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
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == columnDtl1_wrk_no) doDtl1_wrk_no_NE(info);
		else if (ne == columnDtl1_cst_cd) doDtl1_cst_cd_NE(info);
		else if (ne == columnDtl1_cst_nm) doDtl1_cst_nm_NE(info);
		else if (ne == columnDtl1_cst_sundry_flg) doDtl1_cst_sundry_flg_NE(info);
		else if (ne == columnDtl1_capital) doDtl1_capital_NE(info);
		else if (ne == columnDtl1_emp_num) doDtl1_emp_num_NE(info);
		else if (ne == columnDtl1_sub_char1) doDtl1_sub_char1_NE(info);
		else if (ne == columnDtl1_sub_char2) doDtl1_sub_char2_NE(info);
		else if (ne == columnDtl1_sub_char3) doDtl1_sub_char3_NE(info);
		else if (ne == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NE(info);
		else if (ne == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NE(info);
		else if (ne == columnDtl1_ins_func_id) doDtl1_ins_func_id_NE(info);
		else if (ne == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NE(info);
		else if (ne == columnDtl1_ins_ts) doDtl1_ins_ts_NE(info);
		else if (ne == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NE(info);
		else if (ne == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NE(info);
		else if (ne == columnDtl1_upd_func_id) doDtl1_upd_func_id_NE(info);
		else if (ne == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NE(info);
		else if (ne == columnDtl1_upd_ts) doDtl1_upd_ts_NE(info);
		else if (ne == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NE(info);
		else if (ne == columnDtl2_wrk_no) doDtl2_wrk_no_NE(info);
		else if (ne == columnDtl2_hist_no) doDtl2_hist_no_NE(info);
		else if (ne == columnDtl2_act_sts_cd) doDtl2_act_sts_cd_NE(info);
		else if (ne == columnDtl2_act_sts_nm) doDtl2_act_sts_nm_NE(info);
		else if (ne == columnDtl2_act_hist) doDtl2_act_hist_NE(info);
		else if (ne == columnDtl2_act_schd_dt) doDtl2_act_schd_dt_NE(info);
		else if (ne == columnDtl2_act_schd) doDtl2_act_schd_NE(info);
		else if (ne == columnDtl2_act_act_dt) doDtl2_act_act_dt_NE(info);
		else if (ne == columnDtl2_act_act) doDtl2_act_act_NE(info);
		else if (ne == columnDtl2_sub_char1) doDtl2_sub_char1_NE(info);
		else if (ne == columnDtl2_sub_char2) doDtl2_sub_char2_NE(info);
		else if (ne == columnDtl2_sub_char3) doDtl2_sub_char3_NE(info);
		else if (ne == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NE(info);
		else if (ne == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NE(info);
		else if (ne == columnDtl2_ins_func_id) doDtl2_ins_func_id_NE(info);
		else if (ne == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NE(info);
		else if (ne == columnDtl2_ins_ts) doDtl2_ins_ts_NE(info);
		else if (ne == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NE(info);
		else if (ne == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NE(info);
		else if (ne == columnDtl2_upd_func_id) doDtl2_upd_func_id_NE(info);
		else if (ne == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NE(info);
		else if (ne == columnDtl2_upd_ts) doDtl2_upd_ts_NE(info);
		else if (ne == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NE(info);
		else if (ne == columnDtl3_wrk_no) doDtl3_wrk_no_NE(info);
		else if (ne == columnDtl3_comp_no) doDtl3_comp_no_NE(info);
		else if (ne == columnDtl3_comp_dt) doDtl3_comp_dt_NE(info);
		else if (ne == columnDtl3_comp_info) doDtl3_comp_info_NE(info);
		else if (ne == columnDtl3_sub_char1) doDtl3_sub_char1_NE(info);
		else if (ne == columnDtl3_sub_char2) doDtl3_sub_char2_NE(info);
		else if (ne == columnDtl3_sub_char3) doDtl3_sub_char3_NE(info);
		else if (ne == columnDtl3_ins_usr_id) doDtl3_ins_usr_id_NE(info);
		else if (ne == columnDtl3_ins_usr_nm) doDtl3_ins_usr_nm_NE(info);
		else if (ne == columnDtl3_ins_func_id) doDtl3_ins_func_id_NE(info);
		else if (ne == columnDtl3_ins_func_nm) doDtl3_ins_func_nm_NE(info);
		else if (ne == columnDtl3_ins_ts) doDtl3_ins_ts_NE(info);
		else if (ne == columnDtl3_upd_usr_id) doDtl3_upd_usr_id_NE(info);
		else if (ne == columnDtl3_upd_usr_nm) doDtl3_upd_usr_nm_NE(info);
		else if (ne == columnDtl3_upd_func_id) doDtl3_upd_func_id_NE(info);
		else if (ne == columnDtl3_upd_func_nm) doDtl3_upd_func_nm_NE(info);
		else if (ne == columnDtl3_upd_ts) doDtl3_upd_ts_NE(info);
		else if (ne == columnDtl3_upd_srv_req_no) doDtl3_upd_srv_req_no_NE(info);
		else if (ne == columnDtl4_qtn_no) doDtl4_qtn_no_NE(info);
		else if (ne == columnDtl4_qtn_rev) doDtl4_qtn_rev_NE(info);
		else if (ne == columnDtl4_qtn_typ) doDtl4_qtn_typ_NE(info);
		else if (ne == columnDtl4_qtn_typ_nm) doDtl4_qtn_typ_nm_NE(info);
		else if (ne == columnDtl4_qtn_dt) doDtl4_qtn_dt_NE(info);
		else if (ne == columnDtl4_valid_dt) doDtl4_valid_dt_NE(info);
		else if (ne == columnDtl4_rcpt_dt) doDtl4_rcpt_dt_NE(info);
		else if (ne == columnDtl4_rcpt_usr_cd) doDtl4_rcpt_usr_cd_NE(info);
		else if (ne == columnDtl4_rcpt_usr_nm) doDtl4_rcpt_usr_nm_NE(info);
		else if (ne == columnDtl4_qtn_rmrks) doDtl4_qtn_rmrks_NE(info);
		else if (ne == columnDtl4_ins_usr_id) doDtl4_ins_usr_id_NE(info);
		else if (ne == columnDtl4_ins_usr_nm) doDtl4_ins_usr_nm_NE(info);
		else if (ne == columnDtl4_ins_func_id) doDtl4_ins_func_id_NE(info);
		else if (ne == columnDtl4_ins_func_nm) doDtl4_ins_func_nm_NE(info);
		else if (ne == columnDtl4_ins_ts) doDtl4_ins_ts_NE(info);
		else if (ne == columnDtl4_upd_usr_id) doDtl4_upd_usr_id_NE(info);
		else if (ne == columnDtl4_upd_usr_nm) doDtl4_upd_usr_nm_NE(info);
		else if (ne == columnDtl4_upd_func_id) doDtl4_upd_func_id_NE(info);
		else if (ne == columnDtl4_upd_func_nm) doDtl4_upd_func_nm_NE(info);
		else if (ne == columnDtl4_upd_ts) doDtl4_upd_ts_NE(info);
		else if (ne == columnDtl4_upd_srv_req_no) doDtl4_upd_srv_req_no_NE(info);
		else if (ne == columnDtl5_wrk_no) doDtl5_wrk_no_NE(info);
		else if (ne == columnDtl5_num_flg) doDtl5_num_flg_NE(info);
		else if (ne == columnDtl5_sno1) doDtl5_sno1_NE(info);
		else if (ne == columnDtl5_qtn_flg) doDtl5_qtn_flg_NE(info);
		else if (ne == columnDtl5_slo_flg) doDtl5_slo_flg_NE(info);
		else if (ne == columnDtl5_ins_usr_id) doDtl5_ins_usr_id_NE(info);
		else if (ne == columnDtl5_ins_usr_nm) doDtl5_ins_usr_nm_NE(info);
		else if (ne == columnDtl5_ins_func_id) doDtl5_ins_func_id_NE(info);
		else if (ne == columnDtl5_ins_func_nm) doDtl5_ins_func_nm_NE(info);
		else if (ne == columnDtl5_ins_ts) doDtl5_ins_ts_NE(info);
		else if (ne == columnDtl5_upd_usr_id) doDtl5_upd_usr_id_NE(info);
		else if (ne == columnDtl5_upd_usr_nm) doDtl5_upd_usr_nm_NE(info);
		else if (ne == columnDtl5_upd_func_id) doDtl5_upd_func_id_NE(info);
		else if (ne == columnDtl5_upd_func_nm) doDtl5_upd_func_nm_NE(info);
		else if (ne == columnDtl5_upd_ts) doDtl5_upd_ts_NE(info);
		else if (ne == columnDtl5_upd_srv_req_no) doDtl5_upd_srv_req_no_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term_cond]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_cond_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_sts_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_sts_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_sts_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_sts_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_acc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_acc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_acc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_acc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_ar_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_ar_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_ap_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_ap_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_rsn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_rsn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fail_rsn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fail_rsn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_rmrks_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_desc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_desc_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[capital]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_capital_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[emp_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_emp_num_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[hist_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_hist_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_sts_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_sts_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_sts_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_sts_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_hist]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_hist_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_schd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_schd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_act]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_act_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_info]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_info_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[valid_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_valid_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[num_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_num_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[qtn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_qtn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == Dtl1Table) doDtl1_NX(info);
		else if (nx == Dtl2Table) doDtl2_NX(info);
		else if (nx == Dtl3Table) doDtl3_NX(info);
		else if (nx == Dtl4Table) doDtl4_NX(info);
		else if (nx == Dtl5Table) doDtl5_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_wrk_no) doCnd_wrk_no_NX(info);
		else if (nx == Hdr_wrk_no) doHdr_wrk_no_NX(info);
		else if (nx == Hdr_wrk_nm) doHdr_wrk_nm_NX(info);
		else if (nx == Hdr_st_dt) doHdr_st_dt_NX(info);
		else if (nx == Hdr_end_dt) doHdr_end_dt_NX(info);
		else if (nx == Hdr_term_cond) doHdr_term_cond_NX(info);
		else if (nx == Hdr_cur_cd) doHdr_cur_cd_NX(info);
		else if (nx == Hdr_cur_nm) doHdr_cur_nm_NX(info);
		else if (nx == Hdr_amt_dec_place) doHdr_amt_dec_place_NX(info);
		else if (nx == Hdr_wrk_sts_cd) doHdr_wrk_sts_cd_NX(info);
		else if (nx == Hdr_wrk_sts_nm) doHdr_wrk_sts_nm_NX(info);
		else if (nx == Hdr_slo_acc_cd) doHdr_slo_acc_cd_NX(info);
		else if (nx == Hdr_slo_acc_nm) doHdr_slo_acc_nm_NX(info);
		else if (nx == Hdr_wrk_ar_flg) doHdr_wrk_ar_flg_NX(info);
		else if (nx == Hdr_wrk_ap_flg) doHdr_wrk_ap_flg_NX(info);
		else if (nx == Hdr_slo_rsn) doHdr_slo_rsn_NX(info);
		else if (nx == Hdr_fail_rsn) doHdr_fail_rsn_NX(info);
		else if (nx == Hdr_wrk_rmrks) doHdr_wrk_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_wrk_desc) doHdr_wrk_desc_NX(info);
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
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == columnDtl1_wrk_no) doDtl1_wrk_no_NX(info);
		else if (nx == columnDtl1_cst_cd) doDtl1_cst_cd_NX(info);
		else if (nx == columnDtl1_cst_nm) doDtl1_cst_nm_NX(info);
		else if (nx == columnDtl1_cst_sundry_flg) doDtl1_cst_sundry_flg_NX(info);
		else if (nx == columnDtl1_capital) doDtl1_capital_NX(info);
		else if (nx == columnDtl1_emp_num) doDtl1_emp_num_NX(info);
		else if (nx == columnDtl1_sub_char1) doDtl1_sub_char1_NX(info);
		else if (nx == columnDtl1_sub_char2) doDtl1_sub_char2_NX(info);
		else if (nx == columnDtl1_sub_char3) doDtl1_sub_char3_NX(info);
		else if (nx == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NX(info);
		else if (nx == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NX(info);
		else if (nx == columnDtl1_ins_func_id) doDtl1_ins_func_id_NX(info);
		else if (nx == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NX(info);
		else if (nx == columnDtl1_ins_ts) doDtl1_ins_ts_NX(info);
		else if (nx == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NX(info);
		else if (nx == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NX(info);
		else if (nx == columnDtl1_upd_func_id) doDtl1_upd_func_id_NX(info);
		else if (nx == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NX(info);
		else if (nx == columnDtl1_upd_ts) doDtl1_upd_ts_NX(info);
		else if (nx == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NX(info);
		else if (nx == columnDtl2_wrk_no) doDtl2_wrk_no_NX(info);
		else if (nx == columnDtl2_hist_no) doDtl2_hist_no_NX(info);
		else if (nx == columnDtl2_act_sts_cd) doDtl2_act_sts_cd_NX(info);
		else if (nx == columnDtl2_act_sts_nm) doDtl2_act_sts_nm_NX(info);
		else if (nx == columnDtl2_act_hist) doDtl2_act_hist_NX(info);
		else if (nx == columnDtl2_act_schd_dt) doDtl2_act_schd_dt_NX(info);
		else if (nx == columnDtl2_act_schd) doDtl2_act_schd_NX(info);
		else if (nx == columnDtl2_act_act_dt) doDtl2_act_act_dt_NX(info);
		else if (nx == columnDtl2_act_act) doDtl2_act_act_NX(info);
		else if (nx == columnDtl2_sub_char1) doDtl2_sub_char1_NX(info);
		else if (nx == columnDtl2_sub_char2) doDtl2_sub_char2_NX(info);
		else if (nx == columnDtl2_sub_char3) doDtl2_sub_char3_NX(info);
		else if (nx == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NX(info);
		else if (nx == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NX(info);
		else if (nx == columnDtl2_ins_func_id) doDtl2_ins_func_id_NX(info);
		else if (nx == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NX(info);
		else if (nx == columnDtl2_ins_ts) doDtl2_ins_ts_NX(info);
		else if (nx == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NX(info);
		else if (nx == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NX(info);
		else if (nx == columnDtl2_upd_func_id) doDtl2_upd_func_id_NX(info);
		else if (nx == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NX(info);
		else if (nx == columnDtl2_upd_ts) doDtl2_upd_ts_NX(info);
		else if (nx == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NX(info);
		else if (nx == columnDtl3_wrk_no) doDtl3_wrk_no_NX(info);
		else if (nx == columnDtl3_comp_no) doDtl3_comp_no_NX(info);
		else if (nx == columnDtl3_comp_dt) doDtl3_comp_dt_NX(info);
		else if (nx == columnDtl3_comp_info) doDtl3_comp_info_NX(info);
		else if (nx == columnDtl3_sub_char1) doDtl3_sub_char1_NX(info);
		else if (nx == columnDtl3_sub_char2) doDtl3_sub_char2_NX(info);
		else if (nx == columnDtl3_sub_char3) doDtl3_sub_char3_NX(info);
		else if (nx == columnDtl3_ins_usr_id) doDtl3_ins_usr_id_NX(info);
		else if (nx == columnDtl3_ins_usr_nm) doDtl3_ins_usr_nm_NX(info);
		else if (nx == columnDtl3_ins_func_id) doDtl3_ins_func_id_NX(info);
		else if (nx == columnDtl3_ins_func_nm) doDtl3_ins_func_nm_NX(info);
		else if (nx == columnDtl3_ins_ts) doDtl3_ins_ts_NX(info);
		else if (nx == columnDtl3_upd_usr_id) doDtl3_upd_usr_id_NX(info);
		else if (nx == columnDtl3_upd_usr_nm) doDtl3_upd_usr_nm_NX(info);
		else if (nx == columnDtl3_upd_func_id) doDtl3_upd_func_id_NX(info);
		else if (nx == columnDtl3_upd_func_nm) doDtl3_upd_func_nm_NX(info);
		else if (nx == columnDtl3_upd_ts) doDtl3_upd_ts_NX(info);
		else if (nx == columnDtl3_upd_srv_req_no) doDtl3_upd_srv_req_no_NX(info);
		else if (nx == columnDtl4_qtn_no) doDtl4_qtn_no_NX(info);
		else if (nx == columnDtl4_qtn_rev) doDtl4_qtn_rev_NX(info);
		else if (nx == columnDtl4_qtn_typ) doDtl4_qtn_typ_NX(info);
		else if (nx == columnDtl4_qtn_typ_nm) doDtl4_qtn_typ_nm_NX(info);
		else if (nx == columnDtl4_qtn_dt) doDtl4_qtn_dt_NX(info);
		else if (nx == columnDtl4_valid_dt) doDtl4_valid_dt_NX(info);
		else if (nx == columnDtl4_rcpt_dt) doDtl4_rcpt_dt_NX(info);
		else if (nx == columnDtl4_rcpt_usr_cd) doDtl4_rcpt_usr_cd_NX(info);
		else if (nx == columnDtl4_rcpt_usr_nm) doDtl4_rcpt_usr_nm_NX(info);
		else if (nx == columnDtl4_qtn_rmrks) doDtl4_qtn_rmrks_NX(info);
		else if (nx == columnDtl4_ins_usr_id) doDtl4_ins_usr_id_NX(info);
		else if (nx == columnDtl4_ins_usr_nm) doDtl4_ins_usr_nm_NX(info);
		else if (nx == columnDtl4_ins_func_id) doDtl4_ins_func_id_NX(info);
		else if (nx == columnDtl4_ins_func_nm) doDtl4_ins_func_nm_NX(info);
		else if (nx == columnDtl4_ins_ts) doDtl4_ins_ts_NX(info);
		else if (nx == columnDtl4_upd_usr_id) doDtl4_upd_usr_id_NX(info);
		else if (nx == columnDtl4_upd_usr_nm) doDtl4_upd_usr_nm_NX(info);
		else if (nx == columnDtl4_upd_func_id) doDtl4_upd_func_id_NX(info);
		else if (nx == columnDtl4_upd_func_nm) doDtl4_upd_func_nm_NX(info);
		else if (nx == columnDtl4_upd_ts) doDtl4_upd_ts_NX(info);
		else if (nx == columnDtl4_upd_srv_req_no) doDtl4_upd_srv_req_no_NX(info);
		else if (nx == columnDtl5_wrk_no) doDtl5_wrk_no_NX(info);
		else if (nx == columnDtl5_num_flg) doDtl5_num_flg_NX(info);
		else if (nx == columnDtl5_sno1) doDtl5_sno1_NX(info);
		else if (nx == columnDtl5_qtn_flg) doDtl5_qtn_flg_NX(info);
		else if (nx == columnDtl5_slo_flg) doDtl5_slo_flg_NX(info);
		else if (nx == columnDtl5_ins_usr_id) doDtl5_ins_usr_id_NX(info);
		else if (nx == columnDtl5_ins_usr_nm) doDtl5_ins_usr_nm_NX(info);
		else if (nx == columnDtl5_ins_func_id) doDtl5_ins_func_id_NX(info);
		else if (nx == columnDtl5_ins_func_nm) doDtl5_ins_func_nm_NX(info);
		else if (nx == columnDtl5_ins_ts) doDtl5_ins_ts_NX(info);
		else if (nx == columnDtl5_upd_usr_id) doDtl5_upd_usr_id_NX(info);
		else if (nx == columnDtl5_upd_usr_nm) doDtl5_upd_usr_nm_NX(info);
		else if (nx == columnDtl5_upd_func_id) doDtl5_upd_func_id_NX(info);
		else if (nx == columnDtl5_upd_func_nm) doDtl5_upd_func_nm_NX(info);
		else if (nx == columnDtl5_upd_ts) doDtl5_upd_ts_NX(info);
		else if (nx == columnDtl5_upd_srv_req_no) doDtl5_upd_srv_req_no_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term_cond]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_cond_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_sts_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_sts_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_sts_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_sts_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_acc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_acc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_acc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_acc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_ar_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_ar_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_ap_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_ap_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_rsn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_rsn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fail_rsn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fail_rsn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_rmrks_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_desc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_desc_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[capital]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_capital_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[emp_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_emp_num_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[hist_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_hist_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_sts_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_sts_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_sts_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_sts_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_hist]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_hist_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_schd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_schd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_act]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_act_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_info]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_info_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[valid_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_valid_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[num_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_num_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[qtn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_qtn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_wrk_no) doCnd_wrk_no_LC(info);
		else if (lc == Hdr_wrk_no) doHdr_wrk_no_LC(info);
		else if (lc == Hdr_wrk_nm) doHdr_wrk_nm_LC(info);
		else if (lc == Hdr_st_dt) doHdr_st_dt_LC(info);
		else if (lc == Hdr_end_dt) doHdr_end_dt_LC(info);
		else if (lc == Hdr_term_cond) doHdr_term_cond_LC(info);
		else if (lc == Hdr_cur_cd) doHdr_cur_cd_LC(info);
		else if (lc == Hdr_cur_nm) doHdr_cur_nm_LC(info);
		else if (lc == Hdr_amt_dec_place) doHdr_amt_dec_place_LC(info);
		else if (lc == Hdr_wrk_sts_cd) doHdr_wrk_sts_cd_LC(info);
		else if (lc == Hdr_wrk_sts_nm) doHdr_wrk_sts_nm_LC(info);
		else if (lc == Hdr_slo_acc_cd) doHdr_slo_acc_cd_LC(info);
		else if (lc == Hdr_slo_acc_nm) doHdr_slo_acc_nm_LC(info);
		else if (lc == Hdr_slo_rsn) doHdr_slo_rsn_LC(info);
		else if (lc == Hdr_fail_rsn) doHdr_fail_rsn_LC(info);
		else if (lc == Hdr_wrk_rmrks) doHdr_wrk_rmrks_LC(info);
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
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == columnDtl1_wrk_no) doDtl1_wrk_no_LC(info);
		else if (lc == columnDtl1_cst_cd) doDtl1_cst_cd_LC(info);
		else if (lc == columnDtl1_cst_nm) doDtl1_cst_nm_LC(info);
		else if (lc == columnDtl1_capital) doDtl1_capital_LC(info);
		else if (lc == columnDtl1_emp_num) doDtl1_emp_num_LC(info);
		else if (lc == columnDtl1_sub_char1) doDtl1_sub_char1_LC(info);
		else if (lc == columnDtl1_sub_char2) doDtl1_sub_char2_LC(info);
		else if (lc == columnDtl1_sub_char3) doDtl1_sub_char3_LC(info);
		else if (lc == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_LC(info);
		else if (lc == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_LC(info);
		else if (lc == columnDtl1_ins_func_id) doDtl1_ins_func_id_LC(info);
		else if (lc == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_LC(info);
		else if (lc == columnDtl1_ins_ts) doDtl1_ins_ts_LC(info);
		else if (lc == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_LC(info);
		else if (lc == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_LC(info);
		else if (lc == columnDtl1_upd_func_id) doDtl1_upd_func_id_LC(info);
		else if (lc == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_LC(info);
		else if (lc == columnDtl1_upd_ts) doDtl1_upd_ts_LC(info);
		else if (lc == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_LC(info);
		else if (lc == columnDtl2_wrk_no) doDtl2_wrk_no_LC(info);
		else if (lc == columnDtl2_hist_no) doDtl2_hist_no_LC(info);
		else if (lc == columnDtl2_act_sts_cd) doDtl2_act_sts_cd_LC(info);
		else if (lc == columnDtl2_act_sts_nm) doDtl2_act_sts_nm_LC(info);
		else if (lc == columnDtl2_act_hist) doDtl2_act_hist_LC(info);
		else if (lc == columnDtl2_act_schd_dt) doDtl2_act_schd_dt_LC(info);
		else if (lc == columnDtl2_act_schd) doDtl2_act_schd_LC(info);
		else if (lc == columnDtl2_act_act_dt) doDtl2_act_act_dt_LC(info);
		else if (lc == columnDtl2_act_act) doDtl2_act_act_LC(info);
		else if (lc == columnDtl2_sub_char1) doDtl2_sub_char1_LC(info);
		else if (lc == columnDtl2_sub_char2) doDtl2_sub_char2_LC(info);
		else if (lc == columnDtl2_sub_char3) doDtl2_sub_char3_LC(info);
		else if (lc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_LC(info);
		else if (lc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_LC(info);
		else if (lc == columnDtl2_ins_func_id) doDtl2_ins_func_id_LC(info);
		else if (lc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_LC(info);
		else if (lc == columnDtl2_ins_ts) doDtl2_ins_ts_LC(info);
		else if (lc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_LC(info);
		else if (lc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_LC(info);
		else if (lc == columnDtl2_upd_func_id) doDtl2_upd_func_id_LC(info);
		else if (lc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_LC(info);
		else if (lc == columnDtl2_upd_ts) doDtl2_upd_ts_LC(info);
		else if (lc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_LC(info);
		else if (lc == columnDtl3_wrk_no) doDtl3_wrk_no_LC(info);
		else if (lc == columnDtl3_comp_no) doDtl3_comp_no_LC(info);
		else if (lc == columnDtl3_comp_dt) doDtl3_comp_dt_LC(info);
		else if (lc == columnDtl3_comp_info) doDtl3_comp_info_LC(info);
		else if (lc == columnDtl3_sub_char1) doDtl3_sub_char1_LC(info);
		else if (lc == columnDtl3_sub_char2) doDtl3_sub_char2_LC(info);
		else if (lc == columnDtl3_sub_char3) doDtl3_sub_char3_LC(info);
		else if (lc == columnDtl3_ins_usr_id) doDtl3_ins_usr_id_LC(info);
		else if (lc == columnDtl3_ins_usr_nm) doDtl3_ins_usr_nm_LC(info);
		else if (lc == columnDtl3_ins_func_id) doDtl3_ins_func_id_LC(info);
		else if (lc == columnDtl3_ins_func_nm) doDtl3_ins_func_nm_LC(info);
		else if (lc == columnDtl3_ins_ts) doDtl3_ins_ts_LC(info);
		else if (lc == columnDtl3_upd_usr_id) doDtl3_upd_usr_id_LC(info);
		else if (lc == columnDtl3_upd_usr_nm) doDtl3_upd_usr_nm_LC(info);
		else if (lc == columnDtl3_upd_func_id) doDtl3_upd_func_id_LC(info);
		else if (lc == columnDtl3_upd_func_nm) doDtl3_upd_func_nm_LC(info);
		else if (lc == columnDtl3_upd_ts) doDtl3_upd_ts_LC(info);
		else if (lc == columnDtl3_upd_srv_req_no) doDtl3_upd_srv_req_no_LC(info);
		else if (lc == columnDtl4_qtn_no) doDtl4_qtn_no_LC(info);
		else if (lc == columnDtl4_qtn_rev) doDtl4_qtn_rev_LC(info);
		else if (lc == columnDtl4_qtn_typ) doDtl4_qtn_typ_LC(info);
		else if (lc == columnDtl4_qtn_typ_nm) doDtl4_qtn_typ_nm_LC(info);
		else if (lc == columnDtl4_qtn_dt) doDtl4_qtn_dt_LC(info);
		else if (lc == columnDtl4_valid_dt) doDtl4_valid_dt_LC(info);
		else if (lc == columnDtl4_rcpt_dt) doDtl4_rcpt_dt_LC(info);
		else if (lc == columnDtl4_rcpt_usr_cd) doDtl4_rcpt_usr_cd_LC(info);
		else if (lc == columnDtl4_rcpt_usr_nm) doDtl4_rcpt_usr_nm_LC(info);
		else if (lc == columnDtl4_qtn_rmrks) doDtl4_qtn_rmrks_LC(info);
		else if (lc == columnDtl4_ins_usr_id) doDtl4_ins_usr_id_LC(info);
		else if (lc == columnDtl4_ins_usr_nm) doDtl4_ins_usr_nm_LC(info);
		else if (lc == columnDtl4_ins_func_id) doDtl4_ins_func_id_LC(info);
		else if (lc == columnDtl4_ins_func_nm) doDtl4_ins_func_nm_LC(info);
		else if (lc == columnDtl4_ins_ts) doDtl4_ins_ts_LC(info);
		else if (lc == columnDtl4_upd_usr_id) doDtl4_upd_usr_id_LC(info);
		else if (lc == columnDtl4_upd_usr_nm) doDtl4_upd_usr_nm_LC(info);
		else if (lc == columnDtl4_upd_func_id) doDtl4_upd_func_id_LC(info);
		else if (lc == columnDtl4_upd_func_nm) doDtl4_upd_func_nm_LC(info);
		else if (lc == columnDtl4_upd_ts) doDtl4_upd_ts_LC(info);
		else if (lc == columnDtl4_upd_srv_req_no) doDtl4_upd_srv_req_no_LC(info);
		else if (lc == columnDtl5_wrk_no) doDtl5_wrk_no_LC(info);
		else if (lc == columnDtl5_sno1) doDtl5_sno1_LC(info);
		else if (lc == columnDtl5_ins_usr_id) doDtl5_ins_usr_id_LC(info);
		else if (lc == columnDtl5_ins_usr_nm) doDtl5_ins_usr_nm_LC(info);
		else if (lc == columnDtl5_ins_func_id) doDtl5_ins_func_id_LC(info);
		else if (lc == columnDtl5_ins_func_nm) doDtl5_ins_func_nm_LC(info);
		else if (lc == columnDtl5_ins_ts) doDtl5_ins_ts_LC(info);
		else if (lc == columnDtl5_upd_usr_id) doDtl5_upd_usr_id_LC(info);
		else if (lc == columnDtl5_upd_usr_nm) doDtl5_upd_usr_nm_LC(info);
		else if (lc == columnDtl5_upd_func_id) doDtl5_upd_func_id_LC(info);
		else if (lc == columnDtl5_upd_func_nm) doDtl5_upd_func_nm_LC(info);
		else if (lc == columnDtl5_upd_ts) doDtl5_upd_ts_LC(info);
		else if (lc == columnDtl5_upd_srv_req_no) doDtl5_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term_cond]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_cond_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_sts_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_sts_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_sts_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_sts_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_acc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_acc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_acc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_acc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_rsn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_rsn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fail_rsn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fail_rsn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wrk_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wrk_rmrks_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[capital]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_capital_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[emp_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_emp_num_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[hist_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_hist_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_sts_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_sts_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_sts_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_sts_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_hist]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_hist_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_schd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_schd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_act]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_act_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[comp_info]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_comp_info_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[valid_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_valid_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[rcpt_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_rcpt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[qtn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_qtn_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl4]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl4_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl5]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl5_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_cur_cd]の作成メソッド
	 */
	public MCList getHdr_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_wrk_sts_cd]の作成メソッド
	 */
	public MCList getHdr_wrk_sts_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkSts(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_slo_acc_cd]の作成メソッド
	 */
	public MCList getHdr_slo_acc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSloAcc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_cst_cd]の作成メソッド
	 */
	public MCList getDtl1_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_act_sts_cd]の作成メソッド
	 */
	public MCList getDtl2_act_sts_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getActSts(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1030.Srch01")) {
			return new MS_MSBBL1030_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1030.Ins01")) {
			return new MS_MSBBL1030_Ins01Bridge();
		}
		if (id.equals("MS.MSBBL1030.Upd01")) {
			return new MS_MSBBL1030_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL1030.Del01")) {
			return new MS_MSBBL1030_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1030_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1030_Srch01Bridge() {
			p_MS_MSBBL1030_Srch01 = new MCParam(PDef.MS_MSBBL1030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1030.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1030.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl2R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl3R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl4R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class));

			p_MS_MSBBL1030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1030.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1030.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP1030.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1030.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R>)down(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R>)down(2);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R> down3() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R>)down(3);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl4R> down4() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl4R>)down(4);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> down5() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R>)down(5);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1030_Srch01.addDownBlock(mcframe.clientMSBB.MSBBP1030.HdrR.create());
			p_MS_MSBBL1030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl1R.class));
			p_MS_MSBBL1030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl2R.class));
			p_MS_MSBBL1030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl3R.class));
			p_MS_MSBBL1030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl4R.class));
			p_MS_MSBBL1030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1030_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1030.HdrR)p_MS_MSBBL1030_Srch01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R>)p_MS_MSBBL1030_Srch01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R>)p_MS_MSBBL1030_Srch01.getContainerParam().getDownBlock(2));
			setDtl3L((MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R>)p_MS_MSBBL1030_Srch01.getContainerParam().getDownBlock(3));
			setDtl4L((MCList<mcframe.clientMSBB.MSBBP1030.Dtl4R>)p_MS_MSBBL1030_Srch01.getContainerParam().getDownBlock(4));
			setDtl5L((MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R>)p_MS_MSBBL1030_Srch01.getContainerParam().getDownBlock(5));
		}

		protected void clear() {
			getHdrR().clear();
			getDtl1L().clear();
			getDtl2L().clear();
			getDtl3L().clear();
			getDtl4L().clear();
			getDtl5L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtl1L());
			result.add(getDtl2L());
			result.add(getDtl3L());
			result.add(getDtl4L());
			result.add(getDtl5L());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1030_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1030_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1030_Ins01;

		/** コンストラクタ */
		protected MS_MSBBL1030_Ins01Bridge() {
			p_MS_MSBBL1030_Ins01 = new MCParam(PDef.MS_MSBBL1030_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1030_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1030.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl2R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl3R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1030.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class));

			p_MS_MSBBL1030_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1030_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1030_Ins01.addUpBlock(getHdrR());
			p_MS_MSBBL1030_Ins01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBBL1030_Ins01.addUpBlock(getDtl2L().shallowClone());
			p_MS_MSBBL1030_Ins01.addUpBlock(getDtl3L().shallowClone());
			p_MS_MSBBL1030_Ins01.addUpBlock(getDtl5L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1030_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1030_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1030.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1030.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R>)up(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R>)up(2);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R> up3() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R>)up(3);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> up4() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R>)up(4);
		}

		protected mcframe.clientMSBB.MSBBP1030.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1030.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1030_Ins01.addDownBlock(mcframe.clientMSBB.MSBBP1030.HdrR.create());
			p_MS_MSBBL1030_Ins01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1030_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1030.HdrR)p_MS_MSBBL1030_Ins01.getContainerParam().getDownBlock(0));
			setDtl5L((MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R>)p_MS_MSBBL1030_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtl5L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtl1L());
			result.add(getDtl2L());
			result.add(getDtl3L());
			result.add(getDtl5L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtl5L());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1030_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1030_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1030_Upd01Bridge() {
			p_MS_MSBBL1030_Upd01 = new MCParam(PDef.MS_MSBBL1030_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1030_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1030.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl2R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl3R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class));

			p_MS_MSBBL1030_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1030_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1030_Upd01.addUpBlock(getHdrR());
			p_MS_MSBBL1030_Upd01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBBL1030_Upd01.addUpBlock(getDtl2L().shallowClone());
			p_MS_MSBBL1030_Upd01.addUpBlock(getDtl3L().shallowClone());
			p_MS_MSBBL1030_Upd01.addUpBlock(getDtl5L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1030_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1030_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1030.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1030.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl1R>)up(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl2R>)up(2);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R> up3() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl3R>)up(3);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> up4() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R>)up(4);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1030_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1030.Dtl5R.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1030_Upd01;
		}

		protected void show() {
			setDtl5L((MCList<mcframe.clientMSBB.MSBBP1030.Dtl5R>)p_MS_MSBBL1030_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl5L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtl1L());
			result.add(getDtl2L());
			result.add(getDtl3L());
			result.add(getDtl5L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl5L());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1030_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1030_Del01;

		/** コンストラクタ */
		protected MS_MSBBL1030_Del01Bridge() {
			p_MS_MSBBL1030_Del01 = new MCParam(PDef.MS_MSBBL1030_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1030_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1030.HdrR.create());
			// Down

			p_MS_MSBBL1030_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1030_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1030_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1030_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1030_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1030.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1030.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBBL1030_Del01;
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