package mcframe.clientMSBB.MSBBP1040;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
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
import mcframe.clientMSBB.MSBBP1040.MSBBP_WrkSrch_MC.MS_MSBBL1040_Srch01Caller;

/**
 * 画面"MSBBP_WrkSrch"パネルクラスです。<p>
 *
 * 案件情報を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_WrkSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [BpCnd]ブロック関連のField定義
	public MCPanel BpCndPanel = null;
	// [BpCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_st_dt_fr_Label = null;
	/**
	 * Sales project start date FROM 案件開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_st_dt_fr = null;
	public MCLabel Cnd_st_dt_to_Label = null;
	/**
	 * Sales project start date TO 案件開始日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_st_dt_to = null;
	public MCLabel Cnd_end_dt_fr_Label = null;
	/**
	 * Sales project end date FROM 案件終了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_end_dt_fr = null;
	public MCLabel Cnd_end_dt_to_Label = null;
	/**
	 * Sales project end date TO 案件終了日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_end_dt_to = null;
	public MCLabel Cnd_wrk_sts_cd_Label = null;
	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wrk_sts_cd = null;
	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public MCTextField Cnd_wrk_sts_nm = null;
	public MCLabel Cnd_slo_acc_cd_Label = null;
	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_slo_acc_cd = null;
	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public MCTextField Cnd_slo_acc_nm = null;
	public MCLabel Cnd_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_cst_nm = null;
	public MCLabel Cnd_wrk_no_Label = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCTextField Cnd_wrk_nm = null;
	public MCLabel Cnd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_cur_nm = null;
	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public MCNumberField Cnd_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Cnd_budget_fr_p_PPanel;
	public MCNumberField Cnd_budget_fr;	// [Cnd]の[budget_fr_p.amt]を[Cnd_budget_fr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Cnd_budget_to_p_PPanel;
	public MCNumberField Cnd_budget_to;	// [Cnd]の[budget_to_p.amt]を[Cnd_budget_to]としてエイリアス定義。
	public MCLabel Cnd_slo_rsn_Label = null;
	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public MCTextField Cnd_slo_rsn = null;
	public MCLabel Cnd_fail_rsn_Label = null;
	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public MCTextField Cnd_fail_rsn = null;
	public MCLabel Cnd_wrk_rmrks_Label = null;
	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public MCTextField Cnd_wrk_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_p_PPanel;
	public MCLabel Cnd_cst_grp_lab1;	// [Cnd]の[bp_grp_p.bp_grp_lab1]を[Cnd_cst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg1;	// [Cnd]の[bp_grp_p.bp_grp_flg1]を[Cnd_cst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd1;	// [Cnd]の[bp_grp_p.bp_grp_cd1]を[Cnd_cst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm1;	// [Cnd]の[bp_grp_p.bp_grp_nm1]を[Cnd_cst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab2;	// [Cnd]の[bp_grp_p.bp_grp_lab2]を[Cnd_cst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg2;	// [Cnd]の[bp_grp_p.bp_grp_flg2]を[Cnd_cst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd2;	// [Cnd]の[bp_grp_p.bp_grp_cd2]を[Cnd_cst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm2;	// [Cnd]の[bp_grp_p.bp_grp_nm2]を[Cnd_cst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab3;	// [Cnd]の[bp_grp_p.bp_grp_lab3]を[Cnd_cst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg3;	// [Cnd]の[bp_grp_p.bp_grp_flg3]を[Cnd_cst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd3;	// [Cnd]の[bp_grp_p.bp_grp_cd3]を[Cnd_cst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm3;	// [Cnd]の[bp_grp_p.bp_grp_nm3]を[Cnd_cst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab4;	// [Cnd]の[bp_grp_p.bp_grp_lab4]を[Cnd_cst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg4;	// [Cnd]の[bp_grp_p.bp_grp_flg4]を[Cnd_cst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd4;	// [Cnd]の[bp_grp_p.bp_grp_cd4]を[Cnd_cst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm4;	// [Cnd]の[bp_grp_p.bp_grp_nm4]を[Cnd_cst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab5;	// [Cnd]の[bp_grp_p.bp_grp_lab5]を[Cnd_cst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg5;	// [Cnd]の[bp_grp_p.bp_grp_flg5]を[Cnd_cst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd5;	// [Cnd]の[bp_grp_p.bp_grp_cd5]を[Cnd_cst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm5;	// [Cnd]の[bp_grp_p.bp_grp_nm5]を[Cnd_cst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab6;	// [Cnd]の[bp_grp_p.bp_grp_lab6]を[Cnd_cst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg6;	// [Cnd]の[bp_grp_p.bp_grp_flg6]を[Cnd_cst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd6;	// [Cnd]の[bp_grp_p.bp_grp_cd6]を[Cnd_cst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm6;	// [Cnd]の[bp_grp_p.bp_grp_nm6]を[Cnd_cst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab7;	// [Cnd]の[bp_grp_p.bp_grp_lab7]を[Cnd_cst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg7;	// [Cnd]の[bp_grp_p.bp_grp_flg7]を[Cnd_cst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd7;	// [Cnd]の[bp_grp_p.bp_grp_cd7]を[Cnd_cst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm7;	// [Cnd]の[bp_grp_p.bp_grp_nm7]を[Cnd_cst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab8;	// [Cnd]の[bp_grp_p.bp_grp_lab8]を[Cnd_cst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg8;	// [Cnd]の[bp_grp_p.bp_grp_flg8]を[Cnd_cst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd8;	// [Cnd]の[bp_grp_p.bp_grp_cd8]を[Cnd_cst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm8;	// [Cnd]の[bp_grp_p.bp_grp_nm8]を[Cnd_cst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab9;	// [Cnd]の[bp_grp_p.bp_grp_lab9]を[Cnd_cst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg9;	// [Cnd]の[bp_grp_p.bp_grp_flg9]を[Cnd_cst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd9;	// [Cnd]の[bp_grp_p.bp_grp_cd9]を[Cnd_cst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm9;	// [Cnd]の[bp_grp_p.bp_grp_nm9]を[Cnd_cst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab10;	// [Cnd]の[bp_grp_p.bp_grp_lab10]を[Cnd_cst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg10;	// [Cnd]の[bp_grp_p.bp_grp_flg10]を[Cnd_cst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd10;	// [Cnd]の[bp_grp_p.bp_grp_cd10]を[Cnd_cst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm10;	// [Cnd]の[bp_grp_p.bp_grp_nm10]を[Cnd_cst_grp_nm10]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton RPnl_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1040.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_nm = null;
	/**
	 * Sales project start date 案件開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_dt = null;
	/**
	 * Sales project end date 案件終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_dt = null;
	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_sts_cd = null;
	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_sts_nm = null;
	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_acc_cd = null;
	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_acc_nm = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_nm = null;
	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_dec_place = null;
	/**
	 * Contract terms 契約条件.<p>
	 *
	 */
	public MCColumnConfig columnRslt_term_cond = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_budget_p_PPanel;
	public MCColumnConfig columnRslt_budget;// [Rslt]の[budget_p.amt]を[columnRslt_budget]としてエイリアス定義。
	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_rsn = null;
	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fail_rsn = null;
	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_rmrks = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Sales project entry 案件登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1030 = null;
	/** [SRCH_HDR]モードを表す定数 */
	public static final String SRCH_HDR = "SRCH_HDR";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_HDR};
	
	/** [MS_MSBBL1040_Srch01]のCallerの作成 */
	protected MSBBP_WrkSrch_MC.MS_MSBBL1040_Srch01Caller createMS_MSBBL1040_Srch01() {
		MSBBP_WrkSrch_MC.MS_MSBBL1040_Srch01Caller<MSBBP_WrkSrch, MS_MSBBL1040_Srch01Bridge>
		caller = ((MSBBP_WrkSrch_MC)this).new MS_MSBBL1040_Srch01Caller<MSBBP_WrkSrch, MS_MSBBL1040_Srch01Bridge>(
					(MSBBP_WrkSrch)this, new MS_MSBBL1040_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1040_Srch01]の呼び出し */
	protected void callMS_MSBBL1040_Srch01() {
		MCCaller caller = createMS_MSBBL1040_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1040.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1040.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1040.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1040.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP1040.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1040.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP1040.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP1040.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1040.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1040.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
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
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("Rslt")) return getRsltL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(BpCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_WrkSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_WrkSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_WrkSrch_MC.jbCreateTop((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateFold((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateTab1((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateTab2((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateBpCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateCtrl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateRPnl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateRslt((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbCreateBtn((MSBBP_WrkSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_WrkSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_WrkSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_WrkSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_WrkSrch p) {
	}

	/**
	 * [BpCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBpCnd(MSBBP_WrkSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_WrkSrch p) {
		p.Cnd_budget_fr_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getCndR().budget_fr_p());
		p.Cnd_budget_fr_p_PPanel.setName("Cnd.budget_fr_p");
		p.Cnd_budget_fr = p.Cnd_budget_fr_p_PPanel.Amt_amt;
		p.Cnd_budget_fr.addAliasName("Cnd.budget_fr", p);
		p.Cnd_budget_to_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getCndR().budget_to_p());
		p.Cnd_budget_to_p_PPanel.setName("Cnd.budget_to_p");
		p.Cnd_budget_to = p.Cnd_budget_to_p_PPanel.Amt_amt;
		p.Cnd_budget_to.addAliasName("Cnd.budget_to", p);
		p.Cnd_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bp_grp_p());
		p.Cnd_bp_grp_p_PPanel.setName("Cnd.bp_grp_p");
		p.Cnd_cst_grp_lab1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_cst_grp_lab1.addAliasName("Cnd.cst_grp_lab1", p);
		p.Cnd_cst_grp_flg1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_cst_grp_flg1.addAliasName("Cnd.cst_grp_flg1", p);
		p.Cnd_cst_grp_cd1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_cst_grp_cd1.addAliasName("Cnd.cst_grp_cd1", p);
		p.Cnd_cst_grp_nm1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_cst_grp_nm1.addAliasName("Cnd.cst_grp_nm1", p);
		p.Cnd_cst_grp_lab2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_cst_grp_lab2.addAliasName("Cnd.cst_grp_lab2", p);
		p.Cnd_cst_grp_flg2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_cst_grp_flg2.addAliasName("Cnd.cst_grp_flg2", p);
		p.Cnd_cst_grp_cd2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_cst_grp_cd2.addAliasName("Cnd.cst_grp_cd2", p);
		p.Cnd_cst_grp_nm2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_cst_grp_nm2.addAliasName("Cnd.cst_grp_nm2", p);
		p.Cnd_cst_grp_lab3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_cst_grp_lab3.addAliasName("Cnd.cst_grp_lab3", p);
		p.Cnd_cst_grp_flg3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_cst_grp_flg3.addAliasName("Cnd.cst_grp_flg3", p);
		p.Cnd_cst_grp_cd3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_cst_grp_cd3.addAliasName("Cnd.cst_grp_cd3", p);
		p.Cnd_cst_grp_nm3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_cst_grp_nm3.addAliasName("Cnd.cst_grp_nm3", p);
		p.Cnd_cst_grp_lab4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_cst_grp_lab4.addAliasName("Cnd.cst_grp_lab4", p);
		p.Cnd_cst_grp_flg4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_cst_grp_flg4.addAliasName("Cnd.cst_grp_flg4", p);
		p.Cnd_cst_grp_cd4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_cst_grp_cd4.addAliasName("Cnd.cst_grp_cd4", p);
		p.Cnd_cst_grp_nm4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_cst_grp_nm4.addAliasName("Cnd.cst_grp_nm4", p);
		p.Cnd_cst_grp_lab5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_cst_grp_lab5.addAliasName("Cnd.cst_grp_lab5", p);
		p.Cnd_cst_grp_flg5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_cst_grp_flg5.addAliasName("Cnd.cst_grp_flg5", p);
		p.Cnd_cst_grp_cd5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_cst_grp_cd5.addAliasName("Cnd.cst_grp_cd5", p);
		p.Cnd_cst_grp_nm5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_cst_grp_nm5.addAliasName("Cnd.cst_grp_nm5", p);
		p.Cnd_cst_grp_lab6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_cst_grp_lab6.addAliasName("Cnd.cst_grp_lab6", p);
		p.Cnd_cst_grp_flg6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_cst_grp_flg6.addAliasName("Cnd.cst_grp_flg6", p);
		p.Cnd_cst_grp_cd6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_cst_grp_cd6.addAliasName("Cnd.cst_grp_cd6", p);
		p.Cnd_cst_grp_nm6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_cst_grp_nm6.addAliasName("Cnd.cst_grp_nm6", p);
		p.Cnd_cst_grp_lab7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_cst_grp_lab7.addAliasName("Cnd.cst_grp_lab7", p);
		p.Cnd_cst_grp_flg7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_cst_grp_flg7.addAliasName("Cnd.cst_grp_flg7", p);
		p.Cnd_cst_grp_cd7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_cst_grp_cd7.addAliasName("Cnd.cst_grp_cd7", p);
		p.Cnd_cst_grp_nm7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_cst_grp_nm7.addAliasName("Cnd.cst_grp_nm7", p);
		p.Cnd_cst_grp_lab8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_cst_grp_lab8.addAliasName("Cnd.cst_grp_lab8", p);
		p.Cnd_cst_grp_flg8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_cst_grp_flg8.addAliasName("Cnd.cst_grp_flg8", p);
		p.Cnd_cst_grp_cd8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_cst_grp_cd8.addAliasName("Cnd.cst_grp_cd8", p);
		p.Cnd_cst_grp_nm8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_cst_grp_nm8.addAliasName("Cnd.cst_grp_nm8", p);
		p.Cnd_cst_grp_lab9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_cst_grp_lab9.addAliasName("Cnd.cst_grp_lab9", p);
		p.Cnd_cst_grp_flg9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_cst_grp_flg9.addAliasName("Cnd.cst_grp_flg9", p);
		p.Cnd_cst_grp_cd9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_cst_grp_cd9.addAliasName("Cnd.cst_grp_cd9", p);
		p.Cnd_cst_grp_nm9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_cst_grp_nm9.addAliasName("Cnd.cst_grp_nm9", p);
		p.Cnd_cst_grp_lab10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_cst_grp_lab10.addAliasName("Cnd.cst_grp_lab10", p);
		p.Cnd_cst_grp_flg10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_cst_grp_flg10.addAliasName("Cnd.cst_grp_flg10", p);
		p.Cnd_cst_grp_cd10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_cst_grp_cd10.addAliasName("Cnd.cst_grp_cd10", p);
		p.Cnd_cst_grp_nm10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_cst_grp_nm10.addAliasName("Cnd.cst_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_WrkSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBBP_WrkSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_WrkSrch p) {
		p.Rslt_budget_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1040.RsltR.$budget_p);
		p.Rslt_budget_p_PPanel.setName("Rslt.budget_p");
		p.columnRslt_budget = p.Rslt_budget_p_PPanel.columnAmt_amt;
		p.columnRslt_budget.addAliasName("Rslt.budget", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_WrkSrch p) {
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

	
	/** [Cnd_wrk_sts_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wrk_sts_cd_p = null;

	/**
	 * [Cnd_wrk_sts_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wrk_sts_cd_ListPutter() {
		if (Cnd_wrk_sts_cd_p == null) {
			Cnd_wrk_sts_cd_p = createCnd_wrk_sts_cd_ListPutter(Cnd_wrk_sts_cd, "wrk_sts_cd", "wrk_sts_nm");

		}
		return Cnd_wrk_sts_cd_p;
	}
	
	
	/** [Cnd_slo_acc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_slo_acc_cd_p = null;

	/**
	 * [Cnd_slo_acc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_slo_acc_cd_ListPutter() {
		if (Cnd_slo_acc_cd_p == null) {
			Cnd_slo_acc_cd_p = createCnd_slo_acc_cd_ListPutter(Cnd_slo_acc_cd, "slo_acc_cd", "slo_acc_nm");

		}
		return Cnd_slo_acc_cd_p;
	}
	
	
	/** [Cnd_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_cd_p = null;

	/**
	 * [Cnd_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_cd_ListPutter() {
		if (Cnd_cst_cd_p == null) {
			Cnd_cst_cd_p = createCnd_cst_cd_ListPutter(Cnd_cst_cd, "cst_cd", "cst_nm");

		}
		return Cnd_cst_cd_p;
	}
	
	
	/** [Cnd_wrk_no_ListPutter]の定義 */
	private MCListPutter Cnd_wrk_no_p = null;

	/**
	 * [Cnd_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wrk_no_ListPutter() {
		if (Cnd_wrk_no_p == null) {
			Cnd_wrk_no_p = createCnd_wrk_no_ListPutter(Cnd_wrk_no, "wrk_no", "wrk_nm");

		}
		return Cnd_wrk_no_p;
	}
	
	
	/** [Cnd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cur_cd_p = null;

	/**
	 * [Cnd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cur_cd_ListPutter() {
		if (Cnd_cur_cd_p == null) {
			Cnd_cur_cd_p = createCnd_cur_cd_ListPutter(Cnd_cur_cd, "cur_cd", "cur_nm","amt_dec_place");

		}
		return Cnd_cur_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_WrkSrch create(){
		MSBBP_WrkSrch p = new MSBBP_WrkSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_WrkSrch create(String name){
		MSBBP_WrkSrch p = new MSBBP_WrkSrch(name);
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
		MSBBP_WrkSrch_MC.jbfInitTop((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitFold((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitTab1((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitTab2((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitBpCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitCtrl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitRPnl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitRslt((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbfInitBtn((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitTop((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitFold((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitTab1((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitTab2((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitBpCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitCtrl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitRPnl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitRslt((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.jbInitBtn((MSBBP_WrkSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [BpCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBpCnd(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.BpCndPanel = p.beansFactory.createPanel("BpCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_st_dt_fr_Label = p.beansFactory.createLabel("Cnd.st_dt_fr_Label");
		p.Cnd_st_dt_fr = p.beansFactory.createDateField("Cnd.st_dt_fr");
		p.Cnd_st_dt_fr.setLabel(p.Cnd_st_dt_fr_Label);
		p.Cnd_st_dt_to_Label = p.beansFactory.createLabel("Cnd.st_dt_to_Label");
		p.Cnd_st_dt_to = p.beansFactory.createDateField("Cnd.st_dt_to");
		p.Cnd_st_dt_to.setLabel(p.Cnd_st_dt_to_Label);
		p.Cnd_end_dt_fr_Label = p.beansFactory.createLabel("Cnd.end_dt_fr_Label");
		p.Cnd_end_dt_fr = p.beansFactory.createDateField("Cnd.end_dt_fr");
		p.Cnd_end_dt_fr.setLabel(p.Cnd_end_dt_fr_Label);
		p.Cnd_end_dt_to_Label = p.beansFactory.createLabel("Cnd.end_dt_to_Label");
		p.Cnd_end_dt_to = p.beansFactory.createDateField("Cnd.end_dt_to");
		p.Cnd_end_dt_to.setLabel(p.Cnd_end_dt_to_Label);
		p.Cnd_wrk_sts_cd_Label = p.beansFactory.createLabel("Cnd.wrk_sts_cd_Label");
		p.Cnd_wrk_sts_cd = p.beansFactory.createTextComboBox("Cnd.wrk_sts_cd");
		p.Cnd_wrk_sts_cd.setLabel(p.Cnd_wrk_sts_cd_Label);
		p.Cnd_wrk_sts_nm = p.beansFactory.createTextField("Cnd.wrk_sts_nm");
		p.Cnd_slo_acc_cd_Label = p.beansFactory.createLabel("Cnd.slo_acc_cd_Label");
		p.Cnd_slo_acc_cd = p.beansFactory.createTextComboBox("Cnd.slo_acc_cd");
		p.Cnd_slo_acc_cd.setLabel(p.Cnd_slo_acc_cd_Label);
		p.Cnd_slo_acc_nm = p.beansFactory.createTextField("Cnd.slo_acc_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_wrk_no_Label = p.beansFactory.createLabel("Cnd.wrk_no_Label");
		p.Cnd_wrk_no = p.beansFactory.createTextField("Cnd.wrk_no");
		p.Cnd_wrk_no.setLabel(p.Cnd_wrk_no_Label);
		p.Cnd_wrk_nm = p.beansFactory.createTextField("Cnd.wrk_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_amt_dec_place = p.beansFactory.createNumberField("Cnd.amt_dec_place");
		p.Cnd_slo_rsn_Label = p.beansFactory.createLabel("Cnd.slo_rsn_Label");
		p.Cnd_slo_rsn = p.beansFactory.createTextField("Cnd.slo_rsn");
		p.Cnd_slo_rsn.setLabel(p.Cnd_slo_rsn_Label);
		p.Cnd_fail_rsn_Label = p.beansFactory.createLabel("Cnd.fail_rsn_Label");
		p.Cnd_fail_rsn = p.beansFactory.createTextField("Cnd.fail_rsn");
		p.Cnd_fail_rsn.setLabel(p.Cnd_fail_rsn_Label);
		p.Cnd_wrk_rmrks_Label = p.beansFactory.createLabel("Cnd.wrk_rmrks_Label");
		p.Cnd_wrk_rmrks = p.beansFactory.createTextField("Cnd.wrk_rmrks");
		p.Cnd_wrk_rmrks.setLabel(p.Cnd_wrk_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_wrk_no = p.beansFactory.createTableColumn("Rslt.wrk_no", MCColumnType.TEXT);
		p.columnRslt_wrk_nm = p.beansFactory.createTableColumn("Rslt.wrk_nm", MCColumnType.TEXT);
		p.columnRslt_st_dt = p.beansFactory.createTableColumn("Rslt.st_dt", MCColumnType.DATE);
		p.columnRslt_end_dt = p.beansFactory.createTableColumn("Rslt.end_dt", MCColumnType.DATE);
		p.columnRslt_wrk_sts_cd = p.beansFactory.createTableColumn("Rslt.wrk_sts_cd", MCColumnType.TEXT);
		p.columnRslt_wrk_sts_nm = p.beansFactory.createTableColumn("Rslt.wrk_sts_nm", MCColumnType.TEXT);
		p.columnRslt_slo_acc_cd = p.beansFactory.createTableColumn("Rslt.slo_acc_cd", MCColumnType.TEXT);
		p.columnRslt_slo_acc_nm = p.beansFactory.createTableColumn("Rslt.slo_acc_nm", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_term_cond = p.beansFactory.createTableColumn("Rslt.term_cond", MCColumnType.TEXT);
		p.columnRslt_slo_rsn = p.beansFactory.createTableColumn("Rslt.slo_rsn", MCColumnType.TEXT);
		p.columnRslt_fail_rsn = p.beansFactory.createTableColumn("Rslt.fail_rsn", MCColumnType.TEXT);
		p.columnRslt_wrk_rmrks = p.beansFactory.createTableColumn("Rslt.wrk_rmrks", MCColumnType.TEXT);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1030 = p.beansFactory.createButton("Btn.open_MSBBP1030", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.BpCndPanel, null);
		p.Tab2Panel.setLastBeans(p.BpCndPanel);
	}

	/**
	 * [BpCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBpCnd(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.BpCndPanel.setValueCheck(false);
		p.BpCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BpCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_st_dt_fr_Label);
		p.CndPanel.add(p.Cnd_st_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_st_dt_fr);
		p.Cnd_st_dt_fr.setNextBeans(p.Cnd_st_dt_to);
		p.Cnd_st_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.st_dt_fr_META);
		p.Cnd_st_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_st_dt_to_Label);
		p.CndPanel.add(p.Cnd_st_dt_to);
		p.Cnd_st_dt_to.setNextBeans(p.Cnd_end_dt_fr);
		p.Cnd_st_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.st_dt_to_META);
		p.Cnd_st_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_end_dt_fr_Label);
		p.CndPanel.add(p.Cnd_end_dt_fr);
		p.Cnd_end_dt_fr.setNextBeans(p.Cnd_end_dt_to);
		p.Cnd_end_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.end_dt_fr_META);
		p.Cnd_end_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_end_dt_to_Label);
		p.CndPanel.add(p.Cnd_end_dt_to);
		p.Cnd_end_dt_to.setNextBeans(p.Cnd_wrk_sts_cd);
		p.Cnd_end_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.end_dt_to_META);
		p.Cnd_end_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_wrk_sts_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wrk_sts_cd, true);
		p.Cnd_wrk_sts_cd.setLinkBeans(p.Cnd_wrk_sts_nm);
		p.CndPanel.add(p.Cnd_wrk_sts_cd_Label);
		p.CndPanel.add(p.Cnd_wrk_sts_cd);
		p.Cnd_wrk_sts_cd.setNextBeans(p.Cnd_wrk_sts_nm);
		p.Cnd_wrk_sts_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.wrk_sts_cd_META);
		p.CndPanel.add(p.Cnd_wrk_sts_nm);
		p.Cnd_wrk_sts_nm.setNextBeans(p.Cnd_slo_acc_cd);
		p.Cnd_wrk_sts_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.wrk_sts_nm_META);
		p.setPluralValueEnable(p.Cnd_wrk_sts_nm, true);
		p.Cnd_slo_acc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_slo_acc_cd, true);
		p.Cnd_slo_acc_cd.setLinkBeans(p.Cnd_slo_acc_nm);
		p.CndPanel.add(p.Cnd_slo_acc_cd_Label);
		p.CndPanel.add(p.Cnd_slo_acc_cd);
		p.Cnd_slo_acc_cd.setNextBeans(p.Cnd_slo_acc_nm);
		p.Cnd_slo_acc_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.slo_acc_cd_META);
		p.CndPanel.add(p.Cnd_slo_acc_nm);
		p.Cnd_slo_acc_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_slo_acc_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.slo_acc_nm_META);
		p.setPluralValueEnable(p.Cnd_slo_acc_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_wrk_no);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_wrk_no_Label);
		p.CndPanel.add(p.Cnd_wrk_no);
		p.Cnd_wrk_no.setNextBeans(p.Cnd_wrk_nm);
		p.Cnd_wrk_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.wrk_no_META);
		p.Cnd_wrk_no.addLinkBeans(p.Cnd_wrk_nm);
		p.Cnd_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wrk_no, true);
		p.CndPanel.add(p.Cnd_wrk_nm);
		p.Cnd_wrk_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_wrk_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.wrk_nm_META);
		p.setPluralValueEnable(p.Cnd_wrk_nm, true);
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm,p.Cnd_amt_dec_place);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_amt_dec_place);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.cur_nm_META);
		p.setPluralValueEnable(p.Cnd_cur_nm, true);
		p.CndPanel.add(p.Cnd_amt_dec_place);
		p.Cnd_amt_dec_place.setNextBeans(p.Cnd_budget_fr_p_PPanel);
		p.Cnd_amt_dec_place.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.amt_dec_place_META);
		p.CndPanel.add(p.Cnd_budget_fr_p_PPanel);
		p.Cnd_budget_fr_p_PPanel.setNextBeans(p.Cnd_budget_to_p_PPanel);
		p.CndPanel.add(p.Cnd_budget_to_p_PPanel);
		p.Cnd_budget_to_p_PPanel.setNextBeans(p.Cnd_slo_rsn);
		p.CndPanel.add(p.Cnd_slo_rsn_Label);
		p.CndPanel.add(p.Cnd_slo_rsn);
		p.Cnd_slo_rsn.setNextBeans(p.Cnd_fail_rsn);
		p.Cnd_slo_rsn.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.slo_rsn_META);
		p.setPluralValueEnable(p.Cnd_slo_rsn, true);
		p.CndPanel.add(p.Cnd_fail_rsn_Label);
		p.CndPanel.add(p.Cnd_fail_rsn);
		p.Cnd_fail_rsn.setNextBeans(p.Cnd_wrk_rmrks);
		p.Cnd_fail_rsn.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.fail_rsn_META);
		p.setPluralValueEnable(p.Cnd_fail_rsn, true);
		p.CndPanel.add(p.Cnd_wrk_rmrks_Label);
		p.CndPanel.add(p.Cnd_wrk_rmrks);
		p.Cnd_wrk_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_wrk_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.wrk_rmrks_META);
		p.setPluralValueEnable(p.Cnd_wrk_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1040.CndR.inc_can_flg_META);
		p.BpCndPanel.add(p.Cnd_bp_grp_p_PPanel);
		p.BpCndPanel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnl_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_WrkSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP1030);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1030);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBBP_WrkSrch_MC.mcInitTop((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitFold((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitTab1((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitTab2((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitBpCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitCtrl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitRPnl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitRslt((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.mcInitBtn((MSBBP_WrkSrch)this);

		// [SRCH_HDR]ステータスのモードの設定
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_Top((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_Fold((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_Tab1((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_Tab2((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_BpCnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_Cnd((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_Ctrl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_RPnl((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_Rslt((MSBBP_WrkSrch)this);
		MSBBP_WrkSrch_MC.statusInitSRCH__HDR_Btn((MSBBP_WrkSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_WrkSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_WrkSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_WrkSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_WrkSrch p) {
	}

	/**
	 *  [BpCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBpCnd(MSBBP_WrkSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_WrkSrch p) {
		p.Cnd_st_dt_fr.setListListener(p);
		p.Cnd_st_dt_fr.addAllListener(p);
		p.Cnd_st_dt_to.setListListener(p);
		p.Cnd_st_dt_to.addAllListener(p);
		p.Cnd_end_dt_fr.setListListener(p);
		p.Cnd_end_dt_fr.addAllListener(p);
		p.Cnd_end_dt_to.setListListener(p);
		p.Cnd_end_dt_to.addAllListener(p);
		p.Cnd_wrk_sts_cd.setListListener(p);
		p.Cnd_wrk_sts_cd.addAllListener(p);
		p.Cnd_wrk_sts_nm.setListListener(p);
		p.Cnd_wrk_sts_nm.addAllListener(p);
		p.Cnd_slo_acc_cd.setListListener(p);
		p.Cnd_slo_acc_cd.addAllListener(p);
		p.Cnd_slo_acc_nm.setListListener(p);
		p.Cnd_slo_acc_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_wrk_no.setListListener(p);
		p.Cnd_wrk_no.addAllListener(p);
		p.Cnd_wrk_nm.setListListener(p);
		p.Cnd_wrk_nm.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_amt_dec_place.setListListener(p);
		p.Cnd_amt_dec_place.addAllListener(p);
		p.Cnd_slo_rsn.setListListener(p);
		p.Cnd_slo_rsn.addAllListener(p);
		p.Cnd_fail_rsn.setListListener(p);
		p.Cnd_fail_rsn.addAllListener(p);
		p.Cnd_wrk_rmrks.setListListener(p);
		p.Cnd_wrk_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_WrkSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBBP_WrkSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_WrkSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_wrk_no.addAllListener(p);
		p.columnRslt_wrk_no.setListListener(p);
		p.columnRslt_wrk_nm.addAllListener(p);
		p.columnRslt_wrk_nm.setListListener(p);
		p.columnRslt_st_dt.addAllListener(p);
		p.columnRslt_st_dt.setListListener(p);
		p.columnRslt_end_dt.addAllListener(p);
		p.columnRslt_end_dt.setListListener(p);
		p.columnRslt_wrk_sts_cd.addAllListener(p);
		p.columnRslt_wrk_sts_cd.setListListener(p);
		p.columnRslt_wrk_sts_nm.addAllListener(p);
		p.columnRslt_wrk_sts_nm.setListListener(p);
		p.columnRslt_slo_acc_cd.addAllListener(p);
		p.columnRslt_slo_acc_cd.setListListener(p);
		p.columnRslt_slo_acc_nm.addAllListener(p);
		p.columnRslt_slo_acc_nm.setListListener(p);
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_term_cond.addAllListener(p);
		p.columnRslt_term_cond.setListListener(p);
		p.columnRslt_slo_rsn.addAllListener(p);
		p.columnRslt_slo_rsn.setListListener(p);
		p.columnRslt_fail_rsn.addAllListener(p);
		p.columnRslt_fail_rsn.setListListener(p);
		p.columnRslt_wrk_rmrks.addAllListener(p);
		p.columnRslt_wrk_rmrks.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_WrkSrch p) {
		p.Btn_open_MSBBP1030.addAllListener(p);
		p.Btn_open_MSBBP1030.setAPMethodName("doBtn_open_MSBBP1030");
	}

	/**
	 * [SRCH_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Top(MSBBP_WrkSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Fold(MSBBP_WrkSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab1(MSBBP_WrkSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab2(MSBBP_WrkSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[BpCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_BpCnd(MSBBP_WrkSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Cnd(MSBBP_WrkSrch p){
		p.Cnd_st_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_st_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_end_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_end_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wrk_sts_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wrk_sts_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_slo_acc_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_slo_acc_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wrk_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wrk_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Cnd_budget_fr_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Cnd_budget_to_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Cnd_slo_rsn.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_fail_rsn.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wrk_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Ctrl(MSBBP_WrkSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_RPnl(MSBBP_WrkSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Rslt(MSBBP_WrkSrch p){
		p.columnRslt_wrk_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_wrk_sts_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_wrk_sts_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_slo_acc_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_slo_acc_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_term_cond.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Rslt_budget_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_slo_rsn.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_fail_rsn.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_wrk_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Btn(MSBBP_WrkSrch p){
		p.Btn_open_MSBBP1030.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_HDR;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_WrkSrch_MC.setTableConfigRslt((MSBBP_WrkSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBP_WrkSrch p) {
		p.columnRslt_wrk_no.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_no);
		p.columnRslt_wrk_nm.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.wrk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_nm);
		p.columnRslt_st_dt.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.st_dt_META);
		p.columnRslt_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_dt);
		p.columnRslt_end_dt.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.end_dt_META);
		p.columnRslt_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_dt);
		p.columnRslt_wrk_sts_cd.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.wrk_sts_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_sts_cd);
		p.columnRslt_wrk_sts_nm.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.wrk_sts_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_sts_nm);
		p.columnRslt_slo_acc_cd.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.slo_acc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_acc_cd);
		p.columnRslt_slo_acc_nm.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.slo_acc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_acc_nm);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.columnRslt_term_cond.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.term_cond_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term_cond);
		p.RsltTable.addTable(p.Rslt_budget_p_PPanel.AmtTable);
		p.columnRslt_slo_rsn.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.slo_rsn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_rsn);
		p.columnRslt_fail_rsn.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.fail_rsn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fail_rsn);
		p.columnRslt_wrk_rmrks.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.wrk_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_rmrks);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1040.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wrk_sts_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wrk_sts_cd.getListConfig().setPutter(getCnd_wrk_sts_cd_ListPutter());
		Cnd_slo_acc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_slo_acc_cd.getListConfig().setPutter(getCnd_slo_acc_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_wrk_no.getListConfig().setPutter(getCnd_wrk_no_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_HDRStatus() {
		status = SRCH_HDR;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_HDR.equals(status)) {
			setSRCH_HDRStatus();
		}
	}

	/**
	 * [Cnd_wrk_sts_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wrk_sts_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkSts");
		return lp;
	}
	 
	/**
	 * [Cnd_slo_acc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_slo_acc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SloAcc");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}
	 
	/**
	 * [Cnd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wrk_sts_cd) return getCnd_wrk_sts_cd(row, info);
		if(combo == Cnd_slo_acc_cd) return getCnd_slo_acc_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_wrk_no) return getCnd_wrk_no(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_open_MSBBP1030) doBtn_open_MSBBP1030(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1030(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_st_dt_fr) return doCnd_st_dt_fr_VC(info);
		if (vc == Cnd_st_dt_to) return doCnd_st_dt_to_VC(info);
		if (vc == Cnd_end_dt_fr) return doCnd_end_dt_fr_VC(info);
		if (vc == Cnd_end_dt_to) return doCnd_end_dt_to_VC(info);
		if (vc == Cnd_wrk_sts_cd) return doCnd_wrk_sts_cd_VC(info);
		if (vc == Cnd_wrk_sts_nm) return doCnd_wrk_sts_nm_VC(info);
		if (vc == Cnd_slo_acc_cd) return doCnd_slo_acc_cd_VC(info);
		if (vc == Cnd_slo_acc_nm) return doCnd_slo_acc_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_wrk_no) return doCnd_wrk_no_VC(info);
		if (vc == Cnd_wrk_nm) return doCnd_wrk_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Cnd_amt_dec_place) return doCnd_amt_dec_place_VC(info);
		if (vc == Cnd_slo_rsn) return doCnd_slo_rsn_VC(info);
		if (vc == Cnd_fail_rsn) return doCnd_fail_rsn_VC(info);
		if (vc == Cnd_wrk_rmrks) return doCnd_wrk_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == columnRslt_wrk_no) return doRslt_wrk_no_VC(info);
		if (vc == columnRslt_wrk_nm) return doRslt_wrk_nm_VC(info);
		if (vc == columnRslt_st_dt) return doRslt_st_dt_VC(info);
		if (vc == columnRslt_end_dt) return doRslt_end_dt_VC(info);
		if (vc == columnRslt_wrk_sts_cd) return doRslt_wrk_sts_cd_VC(info);
		if (vc == columnRslt_wrk_sts_nm) return doRslt_wrk_sts_nm_VC(info);
		if (vc == columnRslt_slo_acc_cd) return doRslt_slo_acc_cd_VC(info);
		if (vc == columnRslt_slo_acc_nm) return doRslt_slo_acc_nm_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_term_cond) return doRslt_term_cond_VC(info);
		if (vc == columnRslt_slo_rsn) return doRslt_slo_rsn_VC(info);
		if (vc == columnRslt_fail_rsn) return doRslt_fail_rsn_VC(info);
		if (vc == columnRslt_wrk_rmrks) return doRslt_wrk_rmrks_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[st_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[st_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wrk_sts_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wrk_sts_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wrk_sts_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wrk_sts_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_acc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_acc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_acc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_acc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_rsn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_rsn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fail_rsn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fail_rsn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wrk_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wrk_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_sts_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_sts_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_sts_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_sts_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_acc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_acc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_acc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_acc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term_cond]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term_cond_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_rsn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_rsn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fail_rsn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fail_rsn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_st_dt_fr) doCnd_st_dt_fr_NC(info);
		else if (nc == Cnd_st_dt_to) doCnd_st_dt_to_NC(info);
		else if (nc == Cnd_end_dt_fr) doCnd_end_dt_fr_NC(info);
		else if (nc == Cnd_end_dt_to) doCnd_end_dt_to_NC(info);
		else if (nc == Cnd_wrk_sts_cd) doCnd_wrk_sts_cd_NC(info);
		else if (nc == Cnd_wrk_sts_nm) doCnd_wrk_sts_nm_NC(info);
		else if (nc == Cnd_slo_acc_cd) doCnd_slo_acc_cd_NC(info);
		else if (nc == Cnd_slo_acc_nm) doCnd_slo_acc_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_wrk_no) doCnd_wrk_no_NC(info);
		else if (nc == Cnd_wrk_nm) doCnd_wrk_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Cnd_amt_dec_place) doCnd_amt_dec_place_NC(info);
		else if (nc == Cnd_slo_rsn) doCnd_slo_rsn_NC(info);
		else if (nc == Cnd_fail_rsn) doCnd_fail_rsn_NC(info);
		else if (nc == Cnd_wrk_rmrks) doCnd_wrk_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == columnRslt_wrk_no) doRslt_wrk_no_NC(info);
		else if (nc == columnRslt_wrk_nm) doRslt_wrk_nm_NC(info);
		else if (nc == columnRslt_st_dt) doRslt_st_dt_NC(info);
		else if (nc == columnRslt_end_dt) doRslt_end_dt_NC(info);
		else if (nc == columnRslt_wrk_sts_cd) doRslt_wrk_sts_cd_NC(info);
		else if (nc == columnRslt_wrk_sts_nm) doRslt_wrk_sts_nm_NC(info);
		else if (nc == columnRslt_slo_acc_cd) doRslt_slo_acc_cd_NC(info);
		else if (nc == columnRslt_slo_acc_nm) doRslt_slo_acc_nm_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_term_cond) doRslt_term_cond_NC(info);
		else if (nc == columnRslt_slo_rsn) doRslt_slo_rsn_NC(info);
		else if (nc == columnRslt_fail_rsn) doRslt_fail_rsn_NC(info);
		else if (nc == columnRslt_wrk_rmrks) doRslt_wrk_rmrks_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_sts_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_sts_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_sts_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_sts_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_acc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_acc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_acc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_acc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fail_rsn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fail_rsn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_sts_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_sts_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_sts_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_sts_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_acc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_acc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_acc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_acc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_cond]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_cond_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_rsn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_rsn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fail_rsn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fail_rsn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_st_dt_fr) doCnd_st_dt_fr_NE(info);
		else if (ne == Cnd_st_dt_to) doCnd_st_dt_to_NE(info);
		else if (ne == Cnd_end_dt_fr) doCnd_end_dt_fr_NE(info);
		else if (ne == Cnd_end_dt_to) doCnd_end_dt_to_NE(info);
		else if (ne == Cnd_wrk_sts_cd) doCnd_wrk_sts_cd_NE(info);
		else if (ne == Cnd_wrk_sts_nm) doCnd_wrk_sts_nm_NE(info);
		else if (ne == Cnd_slo_acc_cd) doCnd_slo_acc_cd_NE(info);
		else if (ne == Cnd_slo_acc_nm) doCnd_slo_acc_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_wrk_no) doCnd_wrk_no_NE(info);
		else if (ne == Cnd_wrk_nm) doCnd_wrk_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Cnd_amt_dec_place) doCnd_amt_dec_place_NE(info);
		else if (ne == Cnd_slo_rsn) doCnd_slo_rsn_NE(info);
		else if (ne == Cnd_fail_rsn) doCnd_fail_rsn_NE(info);
		else if (ne == Cnd_wrk_rmrks) doCnd_wrk_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == columnRslt_wrk_no) doRslt_wrk_no_NE(info);
		else if (ne == columnRslt_wrk_nm) doRslt_wrk_nm_NE(info);
		else if (ne == columnRslt_st_dt) doRslt_st_dt_NE(info);
		else if (ne == columnRslt_end_dt) doRslt_end_dt_NE(info);
		else if (ne == columnRslt_wrk_sts_cd) doRslt_wrk_sts_cd_NE(info);
		else if (ne == columnRslt_wrk_sts_nm) doRslt_wrk_sts_nm_NE(info);
		else if (ne == columnRslt_slo_acc_cd) doRslt_slo_acc_cd_NE(info);
		else if (ne == columnRslt_slo_acc_nm) doRslt_slo_acc_nm_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_term_cond) doRslt_term_cond_NE(info);
		else if (ne == columnRslt_slo_rsn) doRslt_slo_rsn_NE(info);
		else if (ne == columnRslt_fail_rsn) doRslt_fail_rsn_NE(info);
		else if (ne == columnRslt_wrk_rmrks) doRslt_wrk_rmrks_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_sts_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_sts_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_sts_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_sts_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_acc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_acc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_acc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_acc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fail_rsn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fail_rsn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_sts_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_sts_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_sts_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_sts_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_acc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_acc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_acc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_acc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_cond]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_cond_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_rsn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_rsn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fail_rsn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fail_rsn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_st_dt_fr) doCnd_st_dt_fr_NX(info);
		else if (nx == Cnd_st_dt_to) doCnd_st_dt_to_NX(info);
		else if (nx == Cnd_end_dt_fr) doCnd_end_dt_fr_NX(info);
		else if (nx == Cnd_end_dt_to) doCnd_end_dt_to_NX(info);
		else if (nx == Cnd_wrk_sts_cd) doCnd_wrk_sts_cd_NX(info);
		else if (nx == Cnd_wrk_sts_nm) doCnd_wrk_sts_nm_NX(info);
		else if (nx == Cnd_slo_acc_cd) doCnd_slo_acc_cd_NX(info);
		else if (nx == Cnd_slo_acc_nm) doCnd_slo_acc_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_wrk_no) doCnd_wrk_no_NX(info);
		else if (nx == Cnd_wrk_nm) doCnd_wrk_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Cnd_amt_dec_place) doCnd_amt_dec_place_NX(info);
		else if (nx == Cnd_slo_rsn) doCnd_slo_rsn_NX(info);
		else if (nx == Cnd_fail_rsn) doCnd_fail_rsn_NX(info);
		else if (nx == Cnd_wrk_rmrks) doCnd_wrk_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == columnRslt_wrk_no) doRslt_wrk_no_NX(info);
		else if (nx == columnRslt_wrk_nm) doRslt_wrk_nm_NX(info);
		else if (nx == columnRslt_st_dt) doRslt_st_dt_NX(info);
		else if (nx == columnRslt_end_dt) doRslt_end_dt_NX(info);
		else if (nx == columnRslt_wrk_sts_cd) doRslt_wrk_sts_cd_NX(info);
		else if (nx == columnRslt_wrk_sts_nm) doRslt_wrk_sts_nm_NX(info);
		else if (nx == columnRslt_slo_acc_cd) doRslt_slo_acc_cd_NX(info);
		else if (nx == columnRslt_slo_acc_nm) doRslt_slo_acc_nm_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_term_cond) doRslt_term_cond_NX(info);
		else if (nx == columnRslt_slo_rsn) doRslt_slo_rsn_NX(info);
		else if (nx == columnRslt_fail_rsn) doRslt_fail_rsn_NX(info);
		else if (nx == columnRslt_wrk_rmrks) doRslt_wrk_rmrks_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_sts_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_sts_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_sts_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_sts_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_acc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_acc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_acc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_acc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fail_rsn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fail_rsn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_sts_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_sts_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_sts_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_sts_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_acc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_acc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_acc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_acc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_cond]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_cond_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_rsn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_rsn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fail_rsn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fail_rsn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_st_dt_fr) doCnd_st_dt_fr_LC(info);
		else if (lc == Cnd_st_dt_to) doCnd_st_dt_to_LC(info);
		else if (lc == Cnd_end_dt_fr) doCnd_end_dt_fr_LC(info);
		else if (lc == Cnd_end_dt_to) doCnd_end_dt_to_LC(info);
		else if (lc == Cnd_wrk_sts_cd) doCnd_wrk_sts_cd_LC(info);
		else if (lc == Cnd_wrk_sts_nm) doCnd_wrk_sts_nm_LC(info);
		else if (lc == Cnd_slo_acc_cd) doCnd_slo_acc_cd_LC(info);
		else if (lc == Cnd_slo_acc_nm) doCnd_slo_acc_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_wrk_no) doCnd_wrk_no_LC(info);
		else if (lc == Cnd_wrk_nm) doCnd_wrk_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Cnd_amt_dec_place) doCnd_amt_dec_place_LC(info);
		else if (lc == Cnd_slo_rsn) doCnd_slo_rsn_LC(info);
		else if (lc == Cnd_fail_rsn) doCnd_fail_rsn_LC(info);
		else if (lc == Cnd_wrk_rmrks) doCnd_wrk_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_wrk_no) doRslt_wrk_no_LC(info);
		else if (lc == columnRslt_wrk_nm) doRslt_wrk_nm_LC(info);
		else if (lc == columnRslt_st_dt) doRslt_st_dt_LC(info);
		else if (lc == columnRslt_end_dt) doRslt_end_dt_LC(info);
		else if (lc == columnRslt_wrk_sts_cd) doRslt_wrk_sts_cd_LC(info);
		else if (lc == columnRslt_wrk_sts_nm) doRslt_wrk_sts_nm_LC(info);
		else if (lc == columnRslt_slo_acc_cd) doRslt_slo_acc_cd_LC(info);
		else if (lc == columnRslt_slo_acc_nm) doRslt_slo_acc_nm_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_term_cond) doRslt_term_cond_LC(info);
		else if (lc == columnRslt_slo_rsn) doRslt_slo_rsn_LC(info);
		else if (lc == columnRslt_fail_rsn) doRslt_fail_rsn_LC(info);
		else if (lc == columnRslt_wrk_rmrks) doRslt_wrk_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[st_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_sts_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_sts_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_sts_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_sts_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_acc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_acc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_acc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_acc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rsn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rsn_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fail_rsn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fail_rsn_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_sts_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_sts_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_sts_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_sts_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_acc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_acc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_acc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_acc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_cond]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_cond_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_rsn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_rsn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fail_rsn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fail_rsn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wrk_sts_cd]の作成メソッド
	 */
	public MCList getCnd_wrk_sts_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkSts(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_slo_acc_cd]の作成メソッド
	 */
	public MCList getCnd_slo_acc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSloAcc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wrk_no]の作成メソッド
	 */
	public MCList getCnd_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1040.Srch01")) {
			return new MS_MSBBL1040_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1040_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1040_Srch01Bridge() {
			p_MS_MSBBL1040_Srch01 = new MCParam(PDef.MS_MSBBL1040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1040.RsltR.class));

			p_MS_MSBBL1040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1040.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1040.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1040.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1040.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1040.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1040_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1040.RsltR>)p_MS_MSBBL1040_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}