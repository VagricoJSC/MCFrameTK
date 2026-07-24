package mcframe.clientMSBH.MSBHP0170;

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
import mcframe.clientMSBH.MSBHP0170.MSBHP_BillRcptSrch_MC.MS_MSBHL0170_Srch01Caller;

/**
 * 画面"MSBHP_BillRcptSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_BillRcptSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBHP0170";

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
	// [BillCnd]ブロック関連のField定義
	public MCPanel BillCndPanel = null;
	// [BillCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_bill_cl_dt_from_Label = null;
	/**
	 * Billing closing day FROM 請求締年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_bill_cl_dt_from = null;
	public MCLabel Cnd_bill_cl_dt_to_Label = null;
	/**
	 * Billing closing day TO 請求締年月日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_bill_cl_dt_to = null;
	public MCLabel Cnd_bill_rcpt_no_Label = null;
	/**
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_rcpt_no = null;
	public MCLabel Cnd_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_no = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_bill_src_cd_Label = null;
	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bill_src_cd = null;
	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public MCTextField Cnd_bill_src_nm = null;
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	public MCLabel Cnd_pay_schd_dt_from_Label = null;
	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pay_schd_dt_from = null;
	public MCLabel Cnd_pay_schd_dt_to_Label = null;
	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pay_schd_dt_to = null;
	/**
	 * Include invalid 無効含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_invalid_flg = null;
	/**
	 * Include records not to be billed 請求対象外含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_not_bill_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_billGrp_p_PPanel;
	public MCLabel Cnd_bp_grp_lab1;	// [Cnd]の[billGrp_p.bp_grp_lab1]を[Cnd_bp_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg1;	// [Cnd]の[billGrp_p.bp_grp_flg1]を[Cnd_bp_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd1;	// [Cnd]の[billGrp_p.bp_grp_cd1]を[Cnd_bp_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm1;	// [Cnd]の[billGrp_p.bp_grp_nm1]を[Cnd_bp_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab2;	// [Cnd]の[billGrp_p.bp_grp_lab2]を[Cnd_bp_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg2;	// [Cnd]の[billGrp_p.bp_grp_flg2]を[Cnd_bp_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd2;	// [Cnd]の[billGrp_p.bp_grp_cd2]を[Cnd_bp_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm2;	// [Cnd]の[billGrp_p.bp_grp_nm2]を[Cnd_bp_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab3;	// [Cnd]の[billGrp_p.bp_grp_lab3]を[Cnd_bp_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg3;	// [Cnd]の[billGrp_p.bp_grp_flg3]を[Cnd_bp_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd3;	// [Cnd]の[billGrp_p.bp_grp_cd3]を[Cnd_bp_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm3;	// [Cnd]の[billGrp_p.bp_grp_nm3]を[Cnd_bp_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab4;	// [Cnd]の[billGrp_p.bp_grp_lab4]を[Cnd_bp_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg4;	// [Cnd]の[billGrp_p.bp_grp_flg4]を[Cnd_bp_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd4;	// [Cnd]の[billGrp_p.bp_grp_cd4]を[Cnd_bp_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm4;	// [Cnd]の[billGrp_p.bp_grp_nm4]を[Cnd_bp_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab5;	// [Cnd]の[billGrp_p.bp_grp_lab5]を[Cnd_bp_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg5;	// [Cnd]の[billGrp_p.bp_grp_flg5]を[Cnd_bp_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd5;	// [Cnd]の[billGrp_p.bp_grp_cd5]を[Cnd_bp_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm5;	// [Cnd]の[billGrp_p.bp_grp_nm5]を[Cnd_bp_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab6;	// [Cnd]の[billGrp_p.bp_grp_lab6]を[Cnd_bp_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg6;	// [Cnd]の[billGrp_p.bp_grp_flg6]を[Cnd_bp_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd6;	// [Cnd]の[billGrp_p.bp_grp_cd6]を[Cnd_bp_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm6;	// [Cnd]の[billGrp_p.bp_grp_nm6]を[Cnd_bp_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab7;	// [Cnd]の[billGrp_p.bp_grp_lab7]を[Cnd_bp_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg7;	// [Cnd]の[billGrp_p.bp_grp_flg7]を[Cnd_bp_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd7;	// [Cnd]の[billGrp_p.bp_grp_cd7]を[Cnd_bp_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm7;	// [Cnd]の[billGrp_p.bp_grp_nm7]を[Cnd_bp_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab8;	// [Cnd]の[billGrp_p.bp_grp_lab8]を[Cnd_bp_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg8;	// [Cnd]の[billGrp_p.bp_grp_flg8]を[Cnd_bp_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd8;	// [Cnd]の[billGrp_p.bp_grp_cd8]を[Cnd_bp_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm8;	// [Cnd]の[billGrp_p.bp_grp_nm8]を[Cnd_bp_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab9;	// [Cnd]の[billGrp_p.bp_grp_lab9]を[Cnd_bp_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg9;	// [Cnd]の[billGrp_p.bp_grp_flg9]を[Cnd_bp_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd9;	// [Cnd]の[billGrp_p.bp_grp_cd9]を[Cnd_bp_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm9;	// [Cnd]の[billGrp_p.bp_grp_nm9]を[Cnd_bp_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab10;	// [Cnd]の[billGrp_p.bp_grp_lab10]を[Cnd_bp_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg10;	// [Cnd]の[billGrp_p.bp_grp_flg10]を[Cnd_bp_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd10;	// [Cnd]の[billGrp_p.bp_grp_cd10]を[Cnd_bp_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm10;	// [Cnd]の[billGrp_p.bp_grp_nm10]を[Cnd_bp_grp_nm10]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Ctrl2]ブロック関連のField定義
	public MCPanel Ctrl2Panel = null;
	// [Ctrl2]ブロックの項目のField定義
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton Ctrl2_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0170.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_rcpt_no = null;
	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_cl_dt = null;
	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_dt = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_no = null;
	/**
	 * Invalid flg. 無効ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_invalid_flg = null;
	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_bill_no = null;
	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_bill_dt = null;
	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_st_dt = null;
	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_end_dt = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
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
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_cd = null;
	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_nm = null;
	/**
	 * Billing source corporation No. 請求元法人番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_ein = null;
	/**
	 * Billing source business No. 請求元事業者ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_biz_co_no = null;
	/**
	 * Billing source zip code 請求元郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_zip_cd = null;
	/**
	 * Billing source address 1 請求元住所１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_addr1 = null;
	/**
	 * Billing source address 2 請求元住所２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_addr2 = null;
	/**
	 * Billing source address 3 請求元住所３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_addr3 = null;
	/**
	 * Billing source address 4 請求元住所４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_addr4 = null;
	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_dpt = null;
	/**
	 * Billing source TEL 請求元ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_src_tel = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_billGrp_p_PPanel;
	public MCColumnConfig columnRslt_bp_grp_cd1;// [Rslt]の[billGrp_p.bp_grp_cd1]を[columnRslt_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm1;// [Rslt]の[billGrp_p.bp_grp_nm1]を[columnRslt_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd2;// [Rslt]の[billGrp_p.bp_grp_cd2]を[columnRslt_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm2;// [Rslt]の[billGrp_p.bp_grp_nm2]を[columnRslt_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd3;// [Rslt]の[billGrp_p.bp_grp_cd3]を[columnRslt_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm3;// [Rslt]の[billGrp_p.bp_grp_nm3]を[columnRslt_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd4;// [Rslt]の[billGrp_p.bp_grp_cd4]を[columnRslt_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm4;// [Rslt]の[billGrp_p.bp_grp_nm4]を[columnRslt_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd5;// [Rslt]の[billGrp_p.bp_grp_cd5]を[columnRslt_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm5;// [Rslt]の[billGrp_p.bp_grp_nm5]を[columnRslt_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd6;// [Rslt]の[billGrp_p.bp_grp_cd6]を[columnRslt_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm6;// [Rslt]の[billGrp_p.bp_grp_nm6]を[columnRslt_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd7;// [Rslt]の[billGrp_p.bp_grp_cd7]を[columnRslt_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm7;// [Rslt]の[billGrp_p.bp_grp_nm7]を[columnRslt_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd8;// [Rslt]の[billGrp_p.bp_grp_cd8]を[columnRslt_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm8;// [Rslt]の[billGrp_p.bp_grp_nm8]を[columnRslt_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd9;// [Rslt]の[billGrp_p.bp_grp_cd9]を[columnRslt_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm9;// [Rslt]の[billGrp_p.bp_grp_nm9]を[columnRslt_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd10;// [Rslt]の[billGrp_p.bp_grp_cd10]を[columnRslt_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm10;// [Rslt]の[billGrp_p.bp_grp_nm10]を[columnRslt_bp_grp_nm10]としてエイリアス定義。
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_xrate = null;
	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_bill_amt = null;
	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_amt = null;
	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_amt = null;
	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bfw_amt = null;
	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_amt = null;
	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_amt = null;
	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_amt = null;
	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_setoff_amt = null;
	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_amt = null;
	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_amt = null;
	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_amt = null;
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_cd = null;
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_nm = null;
	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_no = null;
	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_typ = null;
	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_holder = null;
	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_holder_sub = null;
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_cd = null;
	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_nm = null;
	/**
	 * Branch cd. 支店ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_branch_cd = null;
	/**
	 * Branch name 支店名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_branch_nm = null;
	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate1 = null;
	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt1 = null;
	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt1 = null;
	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt1 = null;
	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate2 = null;
	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt2 = null;
	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt2 = null;
	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt2 = null;
	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate3 = null;
	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt3 = null;
	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt3 = null;
	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt3 = null;
	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate4 = null;
	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt4 = null;
	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt4 = null;
	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt4 = null;
	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate5 = null;
	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt5 = null;
	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt5 = null;
	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt5 = null;
	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate6 = null;
	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt6 = null;
	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt6 = null;
	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt6 = null;
	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate7 = null;
	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt7 = null;
	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt7 = null;
	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt7 = null;
	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate8 = null;
	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt8 = null;
	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt8 = null;
	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt8 = null;
	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate9 = null;
	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt9 = null;
	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt9 = null;
	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt9 = null;
	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate10 = null;
	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_sls_amt10 = null;
	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_tax_amt10 = null;
	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate_base_tax_amt10 = null;
	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_amt_bal = null;
	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_amt = null;
	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_setoff_amt = null;
	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_setoff_tax_amt = null;
	/**
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt1 = null;
	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt1 = null;
	/**
	 * Payment method cd. 1 支払方法ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd1 = null;
	/**
	 * Payment method name 1 支払方法名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm1 = null;
	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt2 = null;
	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt2 = null;
	/**
	 * Payment method cd. 2 支払方法ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd2 = null;
	/**
	 * Payment method name 2 支払方法名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm2 = null;
	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt3 = null;
	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt3 = null;
	/**
	 * Payment method cd. 3 支払方法ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd3 = null;
	/**
	 * Payment method name 3 支払方法名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm3 = null;
	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt4 = null;
	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt4 = null;
	/**
	 * Payment method cd. 4 支払方法ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd4 = null;
	/**
	 * Payment method name 4 支払方法名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm4 = null;
	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt5 = null;
	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt5 = null;
	/**
	 * Payment method cd. 5 支払方法ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd5 = null;
	/**
	 * Payment method name 5 支払方法名５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm5 = null;
	/**
	 * Scheduled payment date 6 支払予定日６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt6 = null;
	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt6 = null;
	/**
	 * Payment method cd. 6 支払方法ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd6 = null;
	/**
	 * Payment method name 6 支払方法名６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm6 = null;
	/**
	 * Scheduled payment date 7 支払予定日７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt7 = null;
	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt7 = null;
	/**
	 * Payment method cd. 7 支払方法ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd7 = null;
	/**
	 * Payment method name 7 支払方法名７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm7 = null;
	/**
	 * Scheduled payment date 8 支払予定日８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt8 = null;
	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt8 = null;
	/**
	 * Payment method cd. 8 支払方法ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd8 = null;
	/**
	 * Payment method name 8 支払方法名８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm8 = null;
	/**
	 * Scheduled payment date 9 支払予定日９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt9 = null;
	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt9 = null;
	/**
	 * Payment method cd. 9 支払方法ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd9 = null;
	/**
	 * Payment method name 9 支払方法名９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm9 = null;
	/**
	 * Scheduled payment date 10 支払予定日１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt10 = null;
	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_amt10 = null;
	/**
	 * Payment method cd. 10 支払方法ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_cd10 = null;
	/**
	 * Payment method name 10 支払方法名１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_nm10 = null;
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_bcst_nm = null;
	/**
	 * Invoice send-to corporation No. 請求書送付法人番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_ein = null;
	/**
	 * Invoice send-to business No. 請求書送付事業者ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_biz_co_no = null;
	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_zip_cd = null;
	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_addr1 = null;
	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_addr2 = null;
	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_addr3 = null;
	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_addr4 = null;
	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_bcst_dpt = null;
	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_tel = null;
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
	 * Billing Receipt Details List 請求受領明細照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0180 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MS_MSBHL0170_Srch01]のCallerの作成 */
	protected MSBHP_BillRcptSrch_MC.MS_MSBHL0170_Srch01Caller createMS_MSBHL0170_Srch01() {
		MSBHP_BillRcptSrch_MC.MS_MSBHL0170_Srch01Caller<MSBHP_BillRcptSrch, MS_MSBHL0170_Srch01Bridge>
		caller = ((MSBHP_BillRcptSrch_MC)this).new MS_MSBHL0170_Srch01Caller<MSBHP_BillRcptSrch, MS_MSBHL0170_Srch01Bridge>(
					(MSBHP_BillRcptSrch)this, new MS_MSBHL0170_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0170_Srch01]の呼び出し */
	protected void callMS_MSBHL0170_Srch01() {
		MCCaller caller = createMS_MSBHL0170_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0170.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0170.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0170.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0170.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0170.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0170.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBH.MSBHP0170.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0170.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBH.MSBHP0170.RsltR createRsltR() {
		return mcframe.clientMSBH.MSBHP0170.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0170.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0170.RsltR.class);
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
		ret.add(BillCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(Ctrl2Panel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_BillRcptSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_BillRcptSrch_MC_A(String name) {
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
		MSBHP_BillRcptSrch_MC.jbCreateTop((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateFold((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateTab1((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateTab2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateBillCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateCtrl((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateCtrl2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateRslt((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbCreateBtn((MSBHP_BillRcptSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_BillRcptSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBHP_BillRcptSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBHP_BillRcptSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBHP_BillRcptSrch p) {
	}

	/**
	 * [BillCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBillCnd(MSBHP_BillRcptSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_BillRcptSrch p) {
		p.Cnd_billGrp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().billGrp_p());
		p.Cnd_billGrp_p_PPanel.setName("Cnd.billGrp_p");
		p.Cnd_bp_grp_lab1 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bp_grp_lab1.addAliasName("Cnd.bp_grp_lab1", p);
		p.Cnd_bp_grp_flg1 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bp_grp_flg1.addAliasName("Cnd.bp_grp_flg1", p);
		p.Cnd_bp_grp_cd1 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bp_grp_cd1.addAliasName("Cnd.bp_grp_cd1", p);
		p.Cnd_bp_grp_nm1 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bp_grp_nm1.addAliasName("Cnd.bp_grp_nm1", p);
		p.Cnd_bp_grp_lab2 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bp_grp_lab2.addAliasName("Cnd.bp_grp_lab2", p);
		p.Cnd_bp_grp_flg2 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bp_grp_flg2.addAliasName("Cnd.bp_grp_flg2", p);
		p.Cnd_bp_grp_cd2 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bp_grp_cd2.addAliasName("Cnd.bp_grp_cd2", p);
		p.Cnd_bp_grp_nm2 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bp_grp_nm2.addAliasName("Cnd.bp_grp_nm2", p);
		p.Cnd_bp_grp_lab3 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bp_grp_lab3.addAliasName("Cnd.bp_grp_lab3", p);
		p.Cnd_bp_grp_flg3 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bp_grp_flg3.addAliasName("Cnd.bp_grp_flg3", p);
		p.Cnd_bp_grp_cd3 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bp_grp_cd3.addAliasName("Cnd.bp_grp_cd3", p);
		p.Cnd_bp_grp_nm3 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bp_grp_nm3.addAliasName("Cnd.bp_grp_nm3", p);
		p.Cnd_bp_grp_lab4 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bp_grp_lab4.addAliasName("Cnd.bp_grp_lab4", p);
		p.Cnd_bp_grp_flg4 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bp_grp_flg4.addAliasName("Cnd.bp_grp_flg4", p);
		p.Cnd_bp_grp_cd4 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bp_grp_cd4.addAliasName("Cnd.bp_grp_cd4", p);
		p.Cnd_bp_grp_nm4 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bp_grp_nm4.addAliasName("Cnd.bp_grp_nm4", p);
		p.Cnd_bp_grp_lab5 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bp_grp_lab5.addAliasName("Cnd.bp_grp_lab5", p);
		p.Cnd_bp_grp_flg5 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bp_grp_flg5.addAliasName("Cnd.bp_grp_flg5", p);
		p.Cnd_bp_grp_cd5 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bp_grp_cd5.addAliasName("Cnd.bp_grp_cd5", p);
		p.Cnd_bp_grp_nm5 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bp_grp_nm5.addAliasName("Cnd.bp_grp_nm5", p);
		p.Cnd_bp_grp_lab6 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bp_grp_lab6.addAliasName("Cnd.bp_grp_lab6", p);
		p.Cnd_bp_grp_flg6 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bp_grp_flg6.addAliasName("Cnd.bp_grp_flg6", p);
		p.Cnd_bp_grp_cd6 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bp_grp_cd6.addAliasName("Cnd.bp_grp_cd6", p);
		p.Cnd_bp_grp_nm6 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bp_grp_nm6.addAliasName("Cnd.bp_grp_nm6", p);
		p.Cnd_bp_grp_lab7 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bp_grp_lab7.addAliasName("Cnd.bp_grp_lab7", p);
		p.Cnd_bp_grp_flg7 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bp_grp_flg7.addAliasName("Cnd.bp_grp_flg7", p);
		p.Cnd_bp_grp_cd7 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bp_grp_cd7.addAliasName("Cnd.bp_grp_cd7", p);
		p.Cnd_bp_grp_nm7 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bp_grp_nm7.addAliasName("Cnd.bp_grp_nm7", p);
		p.Cnd_bp_grp_lab8 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bp_grp_lab8.addAliasName("Cnd.bp_grp_lab8", p);
		p.Cnd_bp_grp_flg8 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bp_grp_flg8.addAliasName("Cnd.bp_grp_flg8", p);
		p.Cnd_bp_grp_cd8 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bp_grp_cd8.addAliasName("Cnd.bp_grp_cd8", p);
		p.Cnd_bp_grp_nm8 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bp_grp_nm8.addAliasName("Cnd.bp_grp_nm8", p);
		p.Cnd_bp_grp_lab9 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bp_grp_lab9.addAliasName("Cnd.bp_grp_lab9", p);
		p.Cnd_bp_grp_flg9 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bp_grp_flg9.addAliasName("Cnd.bp_grp_flg9", p);
		p.Cnd_bp_grp_cd9 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bp_grp_cd9.addAliasName("Cnd.bp_grp_cd9", p);
		p.Cnd_bp_grp_nm9 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bp_grp_nm9.addAliasName("Cnd.bp_grp_nm9", p);
		p.Cnd_bp_grp_lab10 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bp_grp_lab10.addAliasName("Cnd.bp_grp_lab10", p);
		p.Cnd_bp_grp_flg10 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bp_grp_flg10.addAliasName("Cnd.bp_grp_flg10", p);
		p.Cnd_bp_grp_cd10 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bp_grp_cd10.addAliasName("Cnd.bp_grp_cd10", p);
		p.Cnd_bp_grp_nm10 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bp_grp_nm10.addAliasName("Cnd.bp_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBHP_BillRcptSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Ctrl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl2(MSBHP_BillRcptSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBHP_BillRcptSrch p) {
		p.Rslt_billGrp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0170.RsltR.$billGrp_p);
		p.Rslt_billGrp_p_PPanel.setName("Rslt.billGrp_p");
		p.columnRslt_bp_grp_cd1 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bp_grp_cd1.addAliasName("Rslt.bp_grp_cd1", p);
		p.columnRslt_bp_grp_nm1 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bp_grp_nm1.addAliasName("Rslt.bp_grp_nm1", p);
		p.columnRslt_bp_grp_cd2 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bp_grp_cd2.addAliasName("Rslt.bp_grp_cd2", p);
		p.columnRslt_bp_grp_nm2 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bp_grp_nm2.addAliasName("Rslt.bp_grp_nm2", p);
		p.columnRslt_bp_grp_cd3 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bp_grp_cd3.addAliasName("Rslt.bp_grp_cd3", p);
		p.columnRslt_bp_grp_nm3 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bp_grp_nm3.addAliasName("Rslt.bp_grp_nm3", p);
		p.columnRslt_bp_grp_cd4 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bp_grp_cd4.addAliasName("Rslt.bp_grp_cd4", p);
		p.columnRslt_bp_grp_nm4 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bp_grp_nm4.addAliasName("Rslt.bp_grp_nm4", p);
		p.columnRslt_bp_grp_cd5 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bp_grp_cd5.addAliasName("Rslt.bp_grp_cd5", p);
		p.columnRslt_bp_grp_nm5 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bp_grp_nm5.addAliasName("Rslt.bp_grp_nm5", p);
		p.columnRslt_bp_grp_cd6 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bp_grp_cd6.addAliasName("Rslt.bp_grp_cd6", p);
		p.columnRslt_bp_grp_nm6 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bp_grp_nm6.addAliasName("Rslt.bp_grp_nm6", p);
		p.columnRslt_bp_grp_cd7 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bp_grp_cd7.addAliasName("Rslt.bp_grp_cd7", p);
		p.columnRslt_bp_grp_nm7 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bp_grp_nm7.addAliasName("Rslt.bp_grp_nm7", p);
		p.columnRslt_bp_grp_cd8 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bp_grp_cd8.addAliasName("Rslt.bp_grp_cd8", p);
		p.columnRslt_bp_grp_nm8 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bp_grp_nm8.addAliasName("Rslt.bp_grp_nm8", p);
		p.columnRslt_bp_grp_cd9 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bp_grp_cd9.addAliasName("Rslt.bp_grp_cd9", p);
		p.columnRslt_bp_grp_nm9 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bp_grp_nm9.addAliasName("Rslt.bp_grp_nm9", p);
		p.columnRslt_bp_grp_cd10 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bp_grp_cd10.addAliasName("Rslt.bp_grp_cd10", p);
		p.columnRslt_bp_grp_nm10 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bp_grp_nm10.addAliasName("Rslt.bp_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBHP_BillRcptSrch p) {
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

	
	/** [Cnd_bill_src_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bill_src_cd_p = null;

	/**
	 * [Cnd_bill_src_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bill_src_cd_ListPutter() {
		if (Cnd_bill_src_cd_p == null) {
			Cnd_bill_src_cd_p = createCnd_bill_src_cd_ListPutter(Cnd_bill_src_cd, "bill_src_cd", "bill_src_nm");

		}
		return Cnd_bill_src_cd_p;
	}
	
	
	/** [Cnd_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cur_cd_p = null;

	/**
	 * [Cnd_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cur_cd_ListPutter() {
		if (Cnd_trd_cur_cd_p == null) {
			Cnd_trd_cur_cd_p = createCnd_trd_cur_cd_ListPutter(Cnd_trd_cur_cd, "trd_cur_cd", "trd_cur_nm");

		}
		return Cnd_trd_cur_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_BillRcptSrch create(){
		MSBHP_BillRcptSrch p = new MSBHP_BillRcptSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_BillRcptSrch create(String name){
		MSBHP_BillRcptSrch p = new MSBHP_BillRcptSrch(name);
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
		MSBHP_BillRcptSrch_MC.jbfInitTop((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitFold((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitTab1((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitTab2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitBillCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitCtrl((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitCtrl2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitRslt((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbfInitBtn((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitTop((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitFold((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitTab1((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitTab2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitBillCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitCtrl((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitCtrl2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitRslt((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.jbInitBtn((MSBHP_BillRcptSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBHP_BillRcptSrch p) {
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
	protected static void jbfInitTab1(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [BillCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBillCnd(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.BillCndPanel = p.beansFactory.createPanel("BillCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_bill_cl_dt_from_Label = p.beansFactory.createLabel("Cnd.bill_cl_dt_from_Label");
		p.Cnd_bill_cl_dt_from = p.beansFactory.createDateField("Cnd.bill_cl_dt_from");
		p.Cnd_bill_cl_dt_from.setLabel(p.Cnd_bill_cl_dt_from_Label);
		p.Cnd_bill_cl_dt_to_Label = p.beansFactory.createLabel("Cnd.bill_cl_dt_to_Label");
		p.Cnd_bill_cl_dt_to = p.beansFactory.createDateField("Cnd.bill_cl_dt_to");
		p.Cnd_bill_cl_dt_to.setLabel(p.Cnd_bill_cl_dt_to_Label);
		p.Cnd_bill_rcpt_no_Label = p.beansFactory.createLabel("Cnd.bill_rcpt_no_Label");
		p.Cnd_bill_rcpt_no = p.beansFactory.createTextField("Cnd.bill_rcpt_no");
		p.Cnd_bill_rcpt_no.setLabel(p.Cnd_bill_rcpt_no_Label);
		p.Cnd_bill_no_Label = p.beansFactory.createLabel("Cnd.bill_no_Label");
		p.Cnd_bill_no = p.beansFactory.createTextField("Cnd.bill_no");
		p.Cnd_bill_no.setLabel(p.Cnd_bill_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_bill_src_cd_Label = p.beansFactory.createLabel("Cnd.bill_src_cd_Label");
		p.Cnd_bill_src_cd = p.beansFactory.createTextField("Cnd.bill_src_cd");
		p.Cnd_bill_src_cd.setLabel(p.Cnd_bill_src_cd_Label);
		p.Cnd_bill_src_nm = p.beansFactory.createTextField("Cnd.bill_src_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_pay_schd_dt_from_Label = p.beansFactory.createLabel("Cnd.pay_schd_dt_from_Label");
		p.Cnd_pay_schd_dt_from = p.beansFactory.createDateField("Cnd.pay_schd_dt_from");
		p.Cnd_pay_schd_dt_from.setLabel(p.Cnd_pay_schd_dt_from_Label);
		p.Cnd_pay_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.pay_schd_dt_to_Label");
		p.Cnd_pay_schd_dt_to = p.beansFactory.createDateField("Cnd.pay_schd_dt_to");
		p.Cnd_pay_schd_dt_to.setLabel(p.Cnd_pay_schd_dt_to_Label);
		p.Cnd_inc_invalid_flg = p.beansFactory.createCheckBox("Cnd.inc_invalid_flg");
		p.Cnd_inc_not_bill_flg = p.beansFactory.createCheckBox("Cnd.inc_not_bill_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl2(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.Ctrl2Panel = p.beansFactory.createPanel("Ctrl2");
		// ブロックの項目の初期化
		p.Ctrl2_dwnld = p.beansFactory.createButton("Ctrl2.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_bill_rcpt_no = p.beansFactory.createTableColumn("Rslt.bill_rcpt_no", MCColumnType.TEXT);
		p.columnRslt_bill_cl_dt = p.beansFactory.createTableColumn("Rslt.bill_cl_dt", MCColumnType.DATE);
		p.columnRslt_bill_dt = p.beansFactory.createTableColumn("Rslt.bill_dt", MCColumnType.DATE);
		p.columnRslt_bill_no = p.beansFactory.createTableColumn("Rslt.bill_no", MCColumnType.TEXT);
		p.columnRslt_invalid_flg = p.beansFactory.createTableColumn("Rslt.invalid_flg", MCColumnType.CHECK);
		p.columnRslt_pre_bill_no = p.beansFactory.createTableColumn("Rslt.pre_bill_no", MCColumnType.TEXT);
		p.columnRslt_pre_bill_dt = p.beansFactory.createTableColumn("Rslt.pre_bill_dt", MCColumnType.DATE);
		p.columnRslt_bill_st_dt = p.beansFactory.createTableColumn("Rslt.bill_st_dt", MCColumnType.DATE);
		p.columnRslt_bill_end_dt = p.beansFactory.createTableColumn("Rslt.bill_end_dt", MCColumnType.DATE);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_wrk_no = p.beansFactory.createTableColumn("Rslt.wrk_no", MCColumnType.TEXT);
		p.columnRslt_wrk_nm = p.beansFactory.createTableColumn("Rslt.wrk_nm", MCColumnType.TEXT);
		p.columnRslt_bill_src_cd = p.beansFactory.createTableColumn("Rslt.bill_src_cd", MCColumnType.TEXT);
		p.columnRslt_bill_src_nm = p.beansFactory.createTableColumn("Rslt.bill_src_nm", MCColumnType.TEXT);
		p.columnRslt_bill_src_ein = p.beansFactory.createTableColumn("Rslt.bill_src_ein", MCColumnType.TEXT);
		p.columnRslt_bill_src_biz_co_no = p.beansFactory.createTableColumn("Rslt.bill_src_biz_co_no", MCColumnType.TEXT);
		p.columnRslt_bill_src_zip_cd = p.beansFactory.createTableColumn("Rslt.bill_src_zip_cd", MCColumnType.TEXT);
		p.columnRslt_bill_src_addr1 = p.beansFactory.createTableColumn("Rslt.bill_src_addr1", MCColumnType.TEXT);
		p.columnRslt_bill_src_addr2 = p.beansFactory.createTableColumn("Rslt.bill_src_addr2", MCColumnType.TEXT);
		p.columnRslt_bill_src_addr3 = p.beansFactory.createTableColumn("Rslt.bill_src_addr3", MCColumnType.TEXT);
		p.columnRslt_bill_src_addr4 = p.beansFactory.createTableColumn("Rslt.bill_src_addr4", MCColumnType.TEXT);
		p.columnRslt_bill_src_dpt = p.beansFactory.createTableColumn("Rslt.bill_src_dpt", MCColumnType.TEXT);
		p.columnRslt_bill_src_tel = p.beansFactory.createTableColumn("Rslt.bill_src_tel", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_bill_xrate = p.beansFactory.createTableColumn("Rslt.bill_xrate", MCColumnType.NUMBER);
		p.columnRslt_last_bill_amt = p.beansFactory.createTableColumn("Rslt.last_bill_amt", MCColumnType.NUMBER);
		p.columnRslt_rcv_amt = p.beansFactory.createTableColumn("Rslt.rcv_amt", MCColumnType.NUMBER);
		p.columnRslt_sw_amt = p.beansFactory.createTableColumn("Rslt.sw_amt", MCColumnType.NUMBER);
		p.columnRslt_bfw_amt = p.beansFactory.createTableColumn("Rslt.bfw_amt", MCColumnType.NUMBER);
		p.columnRslt_sls_amt = p.beansFactory.createTableColumn("Rslt.sls_amt", MCColumnType.NUMBER);
		p.columnRslt_dscnt_amt = p.beansFactory.createTableColumn("Rslt.dscnt_amt", MCColumnType.NUMBER);
		p.columnRslt_ret_amt = p.beansFactory.createTableColumn("Rslt.ret_amt", MCColumnType.NUMBER);
		p.columnRslt_setoff_amt = p.beansFactory.createTableColumn("Rslt.setoff_amt", MCColumnType.NUMBER);
		p.columnRslt_tax_amt = p.beansFactory.createTableColumn("Rslt.tax_amt", MCColumnType.NUMBER);
		p.columnRslt_sw_to_amt = p.beansFactory.createTableColumn("Rslt.sw_to_amt", MCColumnType.NUMBER);
		p.columnRslt_bill_amt = p.beansFactory.createTableColumn("Rslt.bill_amt", MCColumnType.NUMBER);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_bank_ac_no = p.beansFactory.createTableColumn("Rslt.bank_ac_no", MCColumnType.TEXT);
		p.columnRslt_bank_ac_typ = p.beansFactory.createTableColumn("Rslt.bank_ac_typ", MCColumnType.TEXT);
		p.columnRslt_bank_ac_holder = p.beansFactory.createTableColumn("Rslt.bank_ac_holder", MCColumnType.TEXT);
		p.columnRslt_bank_ac_holder_sub = p.beansFactory.createTableColumn("Rslt.bank_ac_holder_sub", MCColumnType.TEXT);
		p.columnRslt_bank_cd = p.beansFactory.createTableColumn("Rslt.bank_cd", MCColumnType.TEXT);
		p.columnRslt_bank_nm = p.beansFactory.createTableColumn("Rslt.bank_nm", MCColumnType.TEXT);
		p.columnRslt_branch_cd = p.beansFactory.createTableColumn("Rslt.branch_cd", MCColumnType.TEXT);
		p.columnRslt_branch_nm = p.beansFactory.createTableColumn("Rslt.branch_nm", MCColumnType.TEXT);
		p.columnRslt_tax_rate1 = p.beansFactory.createTableColumn("Rslt.tax_rate1", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt1 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt1", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt1 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt1", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt1 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt1", MCColumnType.NUMBER);
		p.columnRslt_tax_rate2 = p.beansFactory.createTableColumn("Rslt.tax_rate2", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt2 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt2", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt2 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt2", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt2 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt2", MCColumnType.NUMBER);
		p.columnRslt_tax_rate3 = p.beansFactory.createTableColumn("Rslt.tax_rate3", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt3 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt3", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt3 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt3", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt3 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt3", MCColumnType.NUMBER);
		p.columnRslt_tax_rate4 = p.beansFactory.createTableColumn("Rslt.tax_rate4", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt4 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt4", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt4 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt4", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt4 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt4", MCColumnType.NUMBER);
		p.columnRslt_tax_rate5 = p.beansFactory.createTableColumn("Rslt.tax_rate5", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt5 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt5", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt5 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt5", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt5 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt5", MCColumnType.NUMBER);
		p.columnRslt_tax_rate6 = p.beansFactory.createTableColumn("Rslt.tax_rate6", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt6 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt6", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt6 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt6", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt6 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt6", MCColumnType.NUMBER);
		p.columnRslt_tax_rate7 = p.beansFactory.createTableColumn("Rslt.tax_rate7", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt7 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt7", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt7 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt7", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt7 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt7", MCColumnType.NUMBER);
		p.columnRslt_tax_rate8 = p.beansFactory.createTableColumn("Rslt.tax_rate8", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt8 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt8", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt8 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt8", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt8 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt8", MCColumnType.NUMBER);
		p.columnRslt_tax_rate9 = p.beansFactory.createTableColumn("Rslt.tax_rate9", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt9 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt9", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt9 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt9", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt9 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt9", MCColumnType.NUMBER);
		p.columnRslt_tax_rate10 = p.beansFactory.createTableColumn("Rslt.tax_rate10", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_sls_amt10 = p.beansFactory.createTableColumn("Rslt.tax_rate_sls_amt10", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_tax_amt10 = p.beansFactory.createTableColumn("Rslt.tax_rate_tax_amt10", MCColumnType.NUMBER);
		p.columnRslt_tax_rate_base_tax_amt10 = p.beansFactory.createTableColumn("Rslt.tax_rate_base_tax_amt10", MCColumnType.NUMBER);
		p.columnRslt_adv_amt_bal = p.beansFactory.createTableColumn("Rslt.adv_amt_bal", MCColumnType.NUMBER);
		p.columnRslt_adv_amt = p.beansFactory.createTableColumn("Rslt.adv_amt", MCColumnType.NUMBER);
		p.columnRslt_adv_setoff_amt = p.beansFactory.createTableColumn("Rslt.adv_setoff_amt", MCColumnType.NUMBER);
		p.columnRslt_adv_setoff_tax_amt = p.beansFactory.createTableColumn("Rslt.adv_setoff_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_pay_schd_dt1 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt1", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt1 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt1", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd1 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd1", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm1 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm1", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt2 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt2", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt2 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt2", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd2 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd2", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm2 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm2", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt3 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt3", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt3 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt3", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd3 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd3", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm3 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm3", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt4 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt4", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt4 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt4", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd4 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd4", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm4 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm4", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt5 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt5", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt5 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt5", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd5 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd5", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm5 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm5", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt6 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt6", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt6 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt6", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd6 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd6", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm6 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm6", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt7 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt7", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt7 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt7", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd7 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd7", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm7 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm7", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt8 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt8", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt8 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt8", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd8 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd8", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm8 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm8", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt9 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt9", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt9 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt9", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd9 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd9", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm9 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm9", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt10 = p.beansFactory.createTableColumn("Rslt.pay_schd_dt10", MCColumnType.DATE);
		p.columnRslt_pay_schd_amt10 = p.beansFactory.createTableColumn("Rslt.pay_schd_amt10", MCColumnType.NUMBER);
		p.columnRslt_pay_mtd_cd10 = p.beansFactory.createTableColumn("Rslt.pay_mtd_cd10", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_nm10 = p.beansFactory.createTableColumn("Rslt.pay_mtd_nm10", MCColumnType.TEXT);
		p.columnRslt_bill_bcst_nm = p.beansFactory.createTableColumn("Rslt.bill_bcst_nm", MCColumnType.TEXT);
		p.columnRslt_bill_ein = p.beansFactory.createTableColumn("Rslt.bill_ein", MCColumnType.TEXT);
		p.columnRslt_bill_biz_co_no = p.beansFactory.createTableColumn("Rslt.bill_biz_co_no", MCColumnType.TEXT);
		p.columnRslt_bill_zip_cd = p.beansFactory.createTableColumn("Rslt.bill_zip_cd", MCColumnType.TEXT);
		p.columnRslt_bill_addr1 = p.beansFactory.createTableColumn("Rslt.bill_addr1", MCColumnType.TEXT);
		p.columnRslt_bill_addr2 = p.beansFactory.createTableColumn("Rslt.bill_addr2", MCColumnType.TEXT);
		p.columnRslt_bill_addr3 = p.beansFactory.createTableColumn("Rslt.bill_addr3", MCColumnType.TEXT);
		p.columnRslt_bill_addr4 = p.beansFactory.createTableColumn("Rslt.bill_addr4", MCColumnType.TEXT);
		p.columnRslt_bill_bcst_dpt = p.beansFactory.createTableColumn("Rslt.bill_bcst_dpt", MCColumnType.TEXT);
		p.columnRslt_bill_tel = p.beansFactory.createTableColumn("Rslt.bill_tel", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0180 = p.beansFactory.createButton("Btn.open_MSBHP0180", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBHP_BillRcptSrch p) {
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
		p.CtrlPanel.setNextBeans(p.Ctrl2Panel);
		p.TopPanel.add(p.Ctrl2Panel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBHP_BillRcptSrch p) {
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
	protected static void jbInitTab1(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.BillCndPanel, null);
		p.Tab2Panel.setLastBeans(p.BillCndPanel);
	}

	/**
	 * [BillCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBillCnd(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.BillCndPanel.setValueCheck(false);
		p.BillCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BillCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_bill_cl_dt_from_Label);
		p.CndPanel.add(p.Cnd_bill_cl_dt_from);
		p.CndPanel.setLastBeans(p.Cnd_bill_cl_dt_from);
		p.Cnd_bill_cl_dt_from.setNextBeans(p.Cnd_bill_cl_dt_to);
		p.Cnd_bill_cl_dt_from.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.bill_cl_dt_from_META);
		p.Cnd_bill_cl_dt_from.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bill_cl_dt_to_Label);
		p.CndPanel.add(p.Cnd_bill_cl_dt_to);
		p.Cnd_bill_cl_dt_to.setNextBeans(p.Cnd_bill_rcpt_no);
		p.Cnd_bill_cl_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.bill_cl_dt_to_META);
		p.Cnd_bill_cl_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bill_rcpt_no_Label);
		p.CndPanel.add(p.Cnd_bill_rcpt_no);
		p.Cnd_bill_rcpt_no.setNextBeans(p.Cnd_bill_no);
		p.Cnd_bill_rcpt_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.bill_rcpt_no_META);
		p.setPluralValueEnable(p.Cnd_bill_rcpt_no, true);
		p.CndPanel.add(p.Cnd_bill_no_Label);
		p.CndPanel.add(p.Cnd_bill_no);
		p.Cnd_bill_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_bill_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.bill_no_META);
		p.setPluralValueEnable(p.Cnd_bill_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_bill_src_cd);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_bill_src_cd_Label);
		p.CndPanel.add(p.Cnd_bill_src_cd);
		p.Cnd_bill_src_cd.setNextBeans(p.Cnd_bill_src_nm);
		p.Cnd_bill_src_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.bill_src_cd_META);
		p.Cnd_bill_src_cd.addLinkBeans(p.Cnd_bill_src_nm);
		p.Cnd_bill_src_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_src_cd, true);
		p.CndPanel.add(p.Cnd_bill_src_nm);
		p.Cnd_bill_src_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_bill_src_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.bill_src_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_src_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_pay_schd_dt_from);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_pay_schd_dt_from_Label);
		p.CndPanel.add(p.Cnd_pay_schd_dt_from);
		p.Cnd_pay_schd_dt_from.setNextBeans(p.Cnd_pay_schd_dt_to);
		p.Cnd_pay_schd_dt_from.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.pay_schd_dt_from_META);
		p.Cnd_pay_schd_dt_from.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pay_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_pay_schd_dt_to);
		p.Cnd_pay_schd_dt_to.setNextBeans(p.Cnd_inc_invalid_flg);
		p.Cnd_pay_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.pay_schd_dt_to_META);
		p.Cnd_pay_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_inc_invalid_flg);
		p.Cnd_inc_invalid_flg.setNextBeans(p.Cnd_inc_not_bill_flg);
		p.Cnd_inc_invalid_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.inc_invalid_flg_META);
		p.CndPanel.add(p.Cnd_inc_not_bill_flg);
		p.Cnd_inc_not_bill_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0170.CndR.inc_not_bill_flg_META);
		p.BillCndPanel.add(p.Cnd_billGrp_p_PPanel);
		p.BillCndPanel.setLastBeans(p.Cnd_billGrp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Ctrl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl2(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.Ctrl2Panel.setValueCheck(false);
		p.Ctrl2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Ctrl2Panel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.Ctrl2_dwnld.setIcon("DWNLD");
		p.Ctrl2_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.Ctrl2Panel.add(p.Ctrl2_dwnld);
		p.Ctrl2Panel.setLastBeans(p.Ctrl2_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBHP_BillRcptSrch p) {
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
	protected static void jbInitBtn(MSBHP_BillRcptSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0180.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBHP0180);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBHP0180);
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
		MSBHP_BillRcptSrch_MC.mcInitTop((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitFold((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitTab1((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitTab2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitBillCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitCtrl((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitCtrl2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitRslt((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.mcInitBtn((MSBHP_BillRcptSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Top((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Fold((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Tab1((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Tab2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_BillCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Cnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Ctrl((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Ctrl2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Rslt((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitSRCH_Btn((MSBHP_BillRcptSrch)this);

		// [REF]ステータスのモードの設定
		MSBHP_BillRcptSrch_MC.statusInitREF_Top((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_Fold((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_Tab1((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_Tab2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_BillCnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_Cnd((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_Ctrl((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_Ctrl2((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_Rslt((MSBHP_BillRcptSrch)this);
		MSBHP_BillRcptSrch_MC.statusInitREF_Btn((MSBHP_BillRcptSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_BillRcptSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBHP_BillRcptSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBHP_BillRcptSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBHP_BillRcptSrch p) {
	}

	/**
	 *  [BillCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBillCnd(MSBHP_BillRcptSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_BillRcptSrch p) {
		p.Cnd_bill_cl_dt_from.setListListener(p);
		p.Cnd_bill_cl_dt_from.addAllListener(p);
		p.Cnd_bill_cl_dt_to.setListListener(p);
		p.Cnd_bill_cl_dt_to.addAllListener(p);
		p.Cnd_bill_rcpt_no.setListListener(p);
		p.Cnd_bill_rcpt_no.addAllListener(p);
		p.Cnd_bill_no.setListListener(p);
		p.Cnd_bill_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_bill_src_cd.setListListener(p);
		p.Cnd_bill_src_cd.addAllListener(p);
		p.Cnd_bill_src_nm.setListListener(p);
		p.Cnd_bill_src_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_pay_schd_dt_from.setListListener(p);
		p.Cnd_pay_schd_dt_from.addAllListener(p);
		p.Cnd_pay_schd_dt_to.setListListener(p);
		p.Cnd_pay_schd_dt_to.addAllListener(p);
		p.Cnd_inc_invalid_flg.addAllListener(p);
		p.Cnd_inc_not_bill_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_BillRcptSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Ctrl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl2(MSBHP_BillRcptSrch p) {
		p.Ctrl2_dwnld.addAllListener(p);
		p.Ctrl2_dwnld.setAPMethodName("doCtrl2_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBHP_BillRcptSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_bill_rcpt_no.addAllListener(p);
		p.columnRslt_bill_rcpt_no.setListListener(p);
		p.columnRslt_bill_cl_dt.addAllListener(p);
		p.columnRslt_bill_cl_dt.setListListener(p);
		p.columnRslt_bill_dt.addAllListener(p);
		p.columnRslt_bill_dt.setListListener(p);
		p.columnRslt_bill_no.addAllListener(p);
		p.columnRslt_bill_no.setListListener(p);
		p.columnRslt_invalid_flg.addAllListener(p);
		p.columnRslt_pre_bill_no.addAllListener(p);
		p.columnRslt_pre_bill_no.setListListener(p);
		p.columnRslt_pre_bill_dt.addAllListener(p);
		p.columnRslt_pre_bill_dt.setListListener(p);
		p.columnRslt_bill_st_dt.addAllListener(p);
		p.columnRslt_bill_st_dt.setListListener(p);
		p.columnRslt_bill_end_dt.addAllListener(p);
		p.columnRslt_bill_end_dt.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_wrk_no.addAllListener(p);
		p.columnRslt_wrk_no.setListListener(p);
		p.columnRslt_wrk_nm.addAllListener(p);
		p.columnRslt_wrk_nm.setListListener(p);
		p.columnRslt_bill_src_cd.addAllListener(p);
		p.columnRslt_bill_src_cd.setListListener(p);
		p.columnRslt_bill_src_nm.addAllListener(p);
		p.columnRslt_bill_src_nm.setListListener(p);
		p.columnRslt_bill_src_ein.addAllListener(p);
		p.columnRslt_bill_src_ein.setListListener(p);
		p.columnRslt_bill_src_biz_co_no.addAllListener(p);
		p.columnRslt_bill_src_biz_co_no.setListListener(p);
		p.columnRslt_bill_src_zip_cd.addAllListener(p);
		p.columnRslt_bill_src_zip_cd.setListListener(p);
		p.columnRslt_bill_src_addr1.addAllListener(p);
		p.columnRslt_bill_src_addr1.setListListener(p);
		p.columnRslt_bill_src_addr2.addAllListener(p);
		p.columnRslt_bill_src_addr2.setListListener(p);
		p.columnRslt_bill_src_addr3.addAllListener(p);
		p.columnRslt_bill_src_addr3.setListListener(p);
		p.columnRslt_bill_src_addr4.addAllListener(p);
		p.columnRslt_bill_src_addr4.setListListener(p);
		p.columnRslt_bill_src_dpt.addAllListener(p);
		p.columnRslt_bill_src_dpt.setListListener(p);
		p.columnRslt_bill_src_tel.addAllListener(p);
		p.columnRslt_bill_src_tel.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_bill_xrate.addAllListener(p);
		p.columnRslt_bill_xrate.setListListener(p);
		p.columnRslt_last_bill_amt.addAllListener(p);
		p.columnRslt_last_bill_amt.setListListener(p);
		p.columnRslt_rcv_amt.addAllListener(p);
		p.columnRslt_rcv_amt.setListListener(p);
		p.columnRslt_sw_amt.addAllListener(p);
		p.columnRslt_sw_amt.setListListener(p);
		p.columnRslt_bfw_amt.addAllListener(p);
		p.columnRslt_bfw_amt.setListListener(p);
		p.columnRslt_sls_amt.addAllListener(p);
		p.columnRslt_sls_amt.setListListener(p);
		p.columnRslt_dscnt_amt.addAllListener(p);
		p.columnRslt_dscnt_amt.setListListener(p);
		p.columnRslt_ret_amt.addAllListener(p);
		p.columnRslt_ret_amt.setListListener(p);
		p.columnRslt_setoff_amt.addAllListener(p);
		p.columnRslt_setoff_amt.setListListener(p);
		p.columnRslt_tax_amt.addAllListener(p);
		p.columnRslt_tax_amt.setListListener(p);
		p.columnRslt_sw_to_amt.addAllListener(p);
		p.columnRslt_sw_to_amt.setListListener(p);
		p.columnRslt_bill_amt.addAllListener(p);
		p.columnRslt_bill_amt.setListListener(p);
		p.columnRslt_bank_ac_cd.addAllListener(p);
		p.columnRslt_bank_ac_cd.setListListener(p);
		p.columnRslt_bank_ac_nm.addAllListener(p);
		p.columnRslt_bank_ac_nm.setListListener(p);
		p.columnRslt_bank_ac_no.addAllListener(p);
		p.columnRslt_bank_ac_no.setListListener(p);
		p.columnRslt_bank_ac_typ.addAllListener(p);
		p.columnRslt_bank_ac_typ.setListListener(p);
		p.columnRslt_bank_ac_holder.addAllListener(p);
		p.columnRslt_bank_ac_holder.setListListener(p);
		p.columnRslt_bank_ac_holder_sub.addAllListener(p);
		p.columnRslt_bank_ac_holder_sub.setListListener(p);
		p.columnRslt_bank_cd.addAllListener(p);
		p.columnRslt_bank_cd.setListListener(p);
		p.columnRslt_bank_nm.addAllListener(p);
		p.columnRslt_bank_nm.setListListener(p);
		p.columnRslt_branch_cd.addAllListener(p);
		p.columnRslt_branch_cd.setListListener(p);
		p.columnRslt_branch_nm.addAllListener(p);
		p.columnRslt_branch_nm.setListListener(p);
		p.columnRslt_tax_rate1.addAllListener(p);
		p.columnRslt_tax_rate1.setListListener(p);
		p.columnRslt_tax_rate_sls_amt1.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt1.setListListener(p);
		p.columnRslt_tax_rate_tax_amt1.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt1.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt1.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt1.setListListener(p);
		p.columnRslt_tax_rate2.addAllListener(p);
		p.columnRslt_tax_rate2.setListListener(p);
		p.columnRslt_tax_rate_sls_amt2.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt2.setListListener(p);
		p.columnRslt_tax_rate_tax_amt2.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt2.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt2.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt2.setListListener(p);
		p.columnRslt_tax_rate3.addAllListener(p);
		p.columnRslt_tax_rate3.setListListener(p);
		p.columnRslt_tax_rate_sls_amt3.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt3.setListListener(p);
		p.columnRslt_tax_rate_tax_amt3.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt3.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt3.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt3.setListListener(p);
		p.columnRslt_tax_rate4.addAllListener(p);
		p.columnRslt_tax_rate4.setListListener(p);
		p.columnRslt_tax_rate_sls_amt4.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt4.setListListener(p);
		p.columnRslt_tax_rate_tax_amt4.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt4.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt4.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt4.setListListener(p);
		p.columnRslt_tax_rate5.addAllListener(p);
		p.columnRslt_tax_rate5.setListListener(p);
		p.columnRslt_tax_rate_sls_amt5.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt5.setListListener(p);
		p.columnRslt_tax_rate_tax_amt5.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt5.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt5.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt5.setListListener(p);
		p.columnRslt_tax_rate6.addAllListener(p);
		p.columnRslt_tax_rate6.setListListener(p);
		p.columnRslt_tax_rate_sls_amt6.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt6.setListListener(p);
		p.columnRslt_tax_rate_tax_amt6.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt6.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt6.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt6.setListListener(p);
		p.columnRslt_tax_rate7.addAllListener(p);
		p.columnRslt_tax_rate7.setListListener(p);
		p.columnRslt_tax_rate_sls_amt7.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt7.setListListener(p);
		p.columnRslt_tax_rate_tax_amt7.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt7.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt7.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt7.setListListener(p);
		p.columnRslt_tax_rate8.addAllListener(p);
		p.columnRslt_tax_rate8.setListListener(p);
		p.columnRslt_tax_rate_sls_amt8.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt8.setListListener(p);
		p.columnRslt_tax_rate_tax_amt8.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt8.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt8.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt8.setListListener(p);
		p.columnRslt_tax_rate9.addAllListener(p);
		p.columnRslt_tax_rate9.setListListener(p);
		p.columnRslt_tax_rate_sls_amt9.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt9.setListListener(p);
		p.columnRslt_tax_rate_tax_amt9.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt9.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt9.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt9.setListListener(p);
		p.columnRslt_tax_rate10.addAllListener(p);
		p.columnRslt_tax_rate10.setListListener(p);
		p.columnRslt_tax_rate_sls_amt10.addAllListener(p);
		p.columnRslt_tax_rate_sls_amt10.setListListener(p);
		p.columnRslt_tax_rate_tax_amt10.addAllListener(p);
		p.columnRslt_tax_rate_tax_amt10.setListListener(p);
		p.columnRslt_tax_rate_base_tax_amt10.addAllListener(p);
		p.columnRslt_tax_rate_base_tax_amt10.setListListener(p);
		p.columnRslt_adv_amt_bal.addAllListener(p);
		p.columnRslt_adv_amt_bal.setListListener(p);
		p.columnRslt_adv_amt.addAllListener(p);
		p.columnRslt_adv_amt.setListListener(p);
		p.columnRslt_adv_setoff_amt.addAllListener(p);
		p.columnRslt_adv_setoff_amt.setListListener(p);
		p.columnRslt_adv_setoff_tax_amt.addAllListener(p);
		p.columnRslt_adv_setoff_tax_amt.setListListener(p);
		p.columnRslt_pay_schd_dt1.addAllListener(p);
		p.columnRslt_pay_schd_dt1.setListListener(p);
		p.columnRslt_pay_schd_amt1.addAllListener(p);
		p.columnRslt_pay_schd_amt1.setListListener(p);
		p.columnRslt_pay_mtd_cd1.addAllListener(p);
		p.columnRslt_pay_mtd_cd1.setListListener(p);
		p.columnRslt_pay_mtd_nm1.addAllListener(p);
		p.columnRslt_pay_mtd_nm1.setListListener(p);
		p.columnRslt_pay_schd_dt2.addAllListener(p);
		p.columnRslt_pay_schd_dt2.setListListener(p);
		p.columnRslt_pay_schd_amt2.addAllListener(p);
		p.columnRslt_pay_schd_amt2.setListListener(p);
		p.columnRslt_pay_mtd_cd2.addAllListener(p);
		p.columnRslt_pay_mtd_cd2.setListListener(p);
		p.columnRslt_pay_mtd_nm2.addAllListener(p);
		p.columnRslt_pay_mtd_nm2.setListListener(p);
		p.columnRslt_pay_schd_dt3.addAllListener(p);
		p.columnRslt_pay_schd_dt3.setListListener(p);
		p.columnRslt_pay_schd_amt3.addAllListener(p);
		p.columnRslt_pay_schd_amt3.setListListener(p);
		p.columnRslt_pay_mtd_cd3.addAllListener(p);
		p.columnRslt_pay_mtd_cd3.setListListener(p);
		p.columnRslt_pay_mtd_nm3.addAllListener(p);
		p.columnRslt_pay_mtd_nm3.setListListener(p);
		p.columnRslt_pay_schd_dt4.addAllListener(p);
		p.columnRslt_pay_schd_dt4.setListListener(p);
		p.columnRslt_pay_schd_amt4.addAllListener(p);
		p.columnRslt_pay_schd_amt4.setListListener(p);
		p.columnRslt_pay_mtd_cd4.addAllListener(p);
		p.columnRslt_pay_mtd_cd4.setListListener(p);
		p.columnRslt_pay_mtd_nm4.addAllListener(p);
		p.columnRslt_pay_mtd_nm4.setListListener(p);
		p.columnRslt_pay_schd_dt5.addAllListener(p);
		p.columnRslt_pay_schd_dt5.setListListener(p);
		p.columnRslt_pay_schd_amt5.addAllListener(p);
		p.columnRslt_pay_schd_amt5.setListListener(p);
		p.columnRslt_pay_mtd_cd5.addAllListener(p);
		p.columnRslt_pay_mtd_cd5.setListListener(p);
		p.columnRslt_pay_mtd_nm5.addAllListener(p);
		p.columnRslt_pay_mtd_nm5.setListListener(p);
		p.columnRslt_pay_schd_dt6.addAllListener(p);
		p.columnRslt_pay_schd_dt6.setListListener(p);
		p.columnRslt_pay_schd_amt6.addAllListener(p);
		p.columnRslt_pay_schd_amt6.setListListener(p);
		p.columnRslt_pay_mtd_cd6.addAllListener(p);
		p.columnRslt_pay_mtd_cd6.setListListener(p);
		p.columnRslt_pay_mtd_nm6.addAllListener(p);
		p.columnRslt_pay_mtd_nm6.setListListener(p);
		p.columnRslt_pay_schd_dt7.addAllListener(p);
		p.columnRslt_pay_schd_dt7.setListListener(p);
		p.columnRslt_pay_schd_amt7.addAllListener(p);
		p.columnRslt_pay_schd_amt7.setListListener(p);
		p.columnRslt_pay_mtd_cd7.addAllListener(p);
		p.columnRslt_pay_mtd_cd7.setListListener(p);
		p.columnRslt_pay_mtd_nm7.addAllListener(p);
		p.columnRslt_pay_mtd_nm7.setListListener(p);
		p.columnRslt_pay_schd_dt8.addAllListener(p);
		p.columnRslt_pay_schd_dt8.setListListener(p);
		p.columnRslt_pay_schd_amt8.addAllListener(p);
		p.columnRslt_pay_schd_amt8.setListListener(p);
		p.columnRslt_pay_mtd_cd8.addAllListener(p);
		p.columnRslt_pay_mtd_cd8.setListListener(p);
		p.columnRslt_pay_mtd_nm8.addAllListener(p);
		p.columnRslt_pay_mtd_nm8.setListListener(p);
		p.columnRslt_pay_schd_dt9.addAllListener(p);
		p.columnRslt_pay_schd_dt9.setListListener(p);
		p.columnRslt_pay_schd_amt9.addAllListener(p);
		p.columnRslt_pay_schd_amt9.setListListener(p);
		p.columnRslt_pay_mtd_cd9.addAllListener(p);
		p.columnRslt_pay_mtd_cd9.setListListener(p);
		p.columnRslt_pay_mtd_nm9.addAllListener(p);
		p.columnRslt_pay_mtd_nm9.setListListener(p);
		p.columnRslt_pay_schd_dt10.addAllListener(p);
		p.columnRslt_pay_schd_dt10.setListListener(p);
		p.columnRslt_pay_schd_amt10.addAllListener(p);
		p.columnRslt_pay_schd_amt10.setListListener(p);
		p.columnRslt_pay_mtd_cd10.addAllListener(p);
		p.columnRslt_pay_mtd_cd10.setListListener(p);
		p.columnRslt_pay_mtd_nm10.addAllListener(p);
		p.columnRslt_pay_mtd_nm10.setListListener(p);
		p.columnRslt_bill_bcst_nm.addAllListener(p);
		p.columnRslt_bill_bcst_nm.setListListener(p);
		p.columnRslt_bill_ein.addAllListener(p);
		p.columnRslt_bill_ein.setListListener(p);
		p.columnRslt_bill_biz_co_no.addAllListener(p);
		p.columnRslt_bill_biz_co_no.setListListener(p);
		p.columnRslt_bill_zip_cd.addAllListener(p);
		p.columnRslt_bill_zip_cd.setListListener(p);
		p.columnRslt_bill_addr1.addAllListener(p);
		p.columnRslt_bill_addr1.setListListener(p);
		p.columnRslt_bill_addr2.addAllListener(p);
		p.columnRslt_bill_addr2.setListListener(p);
		p.columnRslt_bill_addr3.addAllListener(p);
		p.columnRslt_bill_addr3.setListListener(p);
		p.columnRslt_bill_addr4.addAllListener(p);
		p.columnRslt_bill_addr4.setListListener(p);
		p.columnRslt_bill_bcst_dpt.addAllListener(p);
		p.columnRslt_bill_bcst_dpt.setListListener(p);
		p.columnRslt_bill_tel.addAllListener(p);
		p.columnRslt_bill_tel.setListListener(p);
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
	protected static void mcInitBtn(MSBHP_BillRcptSrch p) {
		p.Btn_open_MSBHP0180.addAllListener(p);
		p.Btn_open_MSBHP0180.setAPMethodName("doBtn_open_MSBHP0180");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBHP_BillRcptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBHP_BillRcptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBHP_BillRcptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBHP_BillRcptSrch p){

	}

	/**
	 * [SRCH]ステータスの[BillCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BillCnd(MSBHP_BillRcptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_BillRcptSrch p){
		p.Cnd_bill_cl_dt_from.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_cl_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_rcpt_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_src_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_src_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_from.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inc_invalid_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inc_not_bill_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_billGrp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBHP_BillRcptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl2(MSBHP_BillRcptSrch p){
		p.Ctrl2_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBHP_BillRcptSrch p){
		p.columnRslt_bill_rcpt_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_ein.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_biz_co_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_src_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_last_bill_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sw_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bfw_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ret_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_setoff_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sw_to_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_holder.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_holder_sub.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_branch_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_branch_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_adv_amt_bal.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_adv_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_adv_setoff_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_adv_setoff_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_ein.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_biz_co_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_bcst_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBHP_BillRcptSrch p){
		p.Btn_open_MSBHP0180.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBHP_BillRcptSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBHP_BillRcptSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBHP_BillRcptSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBHP_BillRcptSrch p){

	}

	/**
	 * [REF]ステータスの[BillCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_BillCnd(MSBHP_BillRcptSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBHP_BillRcptSrch p){
		p.Cnd_bill_cl_dt_from.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_cl_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_rcpt_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_src_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_src_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_from.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inc_invalid_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inc_not_bill_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_billGrp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBHP_BillRcptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl2(MSBHP_BillRcptSrch p){
		p.Ctrl2_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBHP_BillRcptSrch p){
		p.columnRslt_bill_rcpt_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_ein.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_biz_co_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_src_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_last_bill_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sw_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bfw_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dscnt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ret_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_setoff_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_holder.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_holder_sub.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_branch_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_branch_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_sls_amt10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_tax_amt10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate_base_tax_amt10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adv_amt_bal.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adv_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adv_setoff_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adv_setoff_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_amt10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_ein.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_biz_co_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_bcst_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBHP_BillRcptSrch p){
		p.Btn_open_MSBHP0180.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBHP_BillRcptSrch_MC.setTableConfigRslt((MSBHP_BillRcptSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBHP_BillRcptSrch p) {
		p.columnRslt_bill_rcpt_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_rcpt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_rcpt_no);
		p.columnRslt_bill_cl_dt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_cl_dt_META);
		p.columnRslt_bill_cl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_dt);
		p.columnRslt_bill_dt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_dt_META);
		p.columnRslt_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dt);
		p.columnRslt_bill_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_no);
		p.columnRslt_invalid_flg.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.invalid_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_invalid_flg);
		p.columnRslt_pre_bill_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pre_bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_bill_no);
		p.columnRslt_pre_bill_dt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pre_bill_dt_META);
		p.columnRslt_pre_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_bill_dt);
		p.columnRslt_bill_st_dt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_st_dt_META);
		p.columnRslt_bill_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_st_dt);
		p.columnRslt_bill_end_dt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_end_dt_META);
		p.columnRslt_bill_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_end_dt);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_wrk_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_no);
		p.columnRslt_wrk_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.wrk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_nm);
		p.columnRslt_bill_src_cd.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_cd);
		p.columnRslt_bill_src_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_nm);
		p.columnRslt_bill_src_ein.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_ein_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_ein);
		p.columnRslt_bill_src_biz_co_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_biz_co_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_biz_co_no);
		p.columnRslt_bill_src_zip_cd.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_zip_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_zip_cd);
		p.columnRslt_bill_src_addr1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_addr1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_addr1);
		p.columnRslt_bill_src_addr2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_addr2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_addr2);
		p.columnRslt_bill_src_addr3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_addr3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_addr3);
		p.columnRslt_bill_src_addr4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_addr4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_addr4);
		p.columnRslt_bill_src_dpt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_dpt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_dpt);
		p.columnRslt_bill_src_tel.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_src_tel_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_src_tel);
		p.RsltTable.addTable(p.Rslt_billGrp_p_PPanel.BpGrpTable);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_bill_xrate.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_xrate);
		p.columnRslt_last_bill_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.last_bill_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_last_bill_amt);
		p.columnRslt_rcv_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.rcv_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_amt);
		p.columnRslt_sw_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.sw_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_amt);
		p.columnRslt_bfw_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bfw_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bfw_amt);
		p.columnRslt_sls_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.sls_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_amt);
		p.columnRslt_dscnt_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.dscnt_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_amt);
		p.columnRslt_ret_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.ret_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_amt);
		p.columnRslt_setoff_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.setoff_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_setoff_amt);
		p.columnRslt_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_amt);
		p.columnRslt_sw_to_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.sw_to_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_amt);
		p.columnRslt_bill_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_amt);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_bank_ac_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bank_ac_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_no);
		p.columnRslt_bank_ac_typ.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bank_ac_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_typ);
		p.columnRslt_bank_ac_holder.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bank_ac_holder_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_holder);
		p.columnRslt_bank_ac_holder_sub.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bank_ac_holder_sub_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_holder_sub);
		p.columnRslt_bank_cd.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bank_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_cd);
		p.columnRslt_bank_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bank_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_nm);
		p.columnRslt_branch_cd.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.branch_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_branch_cd);
		p.columnRslt_branch_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.branch_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_branch_nm);
		p.columnRslt_tax_rate1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate1);
		p.columnRslt_tax_rate_sls_amt1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt1);
		p.columnRslt_tax_rate_tax_amt1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt1);
		p.columnRslt_tax_rate_base_tax_amt1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt1);
		p.columnRslt_tax_rate2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate2);
		p.columnRslt_tax_rate_sls_amt2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt2);
		p.columnRslt_tax_rate_tax_amt2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt2);
		p.columnRslt_tax_rate_base_tax_amt2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt2);
		p.columnRslt_tax_rate3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate3);
		p.columnRslt_tax_rate_sls_amt3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt3);
		p.columnRslt_tax_rate_tax_amt3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt3);
		p.columnRslt_tax_rate_base_tax_amt3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt3);
		p.columnRslt_tax_rate4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate4);
		p.columnRslt_tax_rate_sls_amt4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt4);
		p.columnRslt_tax_rate_tax_amt4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt4);
		p.columnRslt_tax_rate_base_tax_amt4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt4);
		p.columnRslt_tax_rate5.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate5);
		p.columnRslt_tax_rate_sls_amt5.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt5);
		p.columnRslt_tax_rate_tax_amt5.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt5);
		p.columnRslt_tax_rate_base_tax_amt5.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt5);
		p.columnRslt_tax_rate6.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate6);
		p.columnRslt_tax_rate_sls_amt6.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt6);
		p.columnRslt_tax_rate_tax_amt6.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt6);
		p.columnRslt_tax_rate_base_tax_amt6.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt6);
		p.columnRslt_tax_rate7.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate7);
		p.columnRslt_tax_rate_sls_amt7.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt7);
		p.columnRslt_tax_rate_tax_amt7.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt7);
		p.columnRslt_tax_rate_base_tax_amt7.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt7);
		p.columnRslt_tax_rate8.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate8);
		p.columnRslt_tax_rate_sls_amt8.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt8);
		p.columnRslt_tax_rate_tax_amt8.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt8);
		p.columnRslt_tax_rate_base_tax_amt8.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt8);
		p.columnRslt_tax_rate9.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate9);
		p.columnRslt_tax_rate_sls_amt9.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt9);
		p.columnRslt_tax_rate_tax_amt9.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt9);
		p.columnRslt_tax_rate_base_tax_amt9.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt9);
		p.columnRslt_tax_rate10.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate10);
		p.columnRslt_tax_rate_sls_amt10.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_sls_amt10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_sls_amt10);
		p.columnRslt_tax_rate_tax_amt10.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_tax_amt10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_tax_amt10);
		p.columnRslt_tax_rate_base_tax_amt10.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.tax_rate_base_tax_amt10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate_base_tax_amt10);
		p.columnRslt_adv_amt_bal.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.adv_amt_bal_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_amt_bal);
		p.columnRslt_adv_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.adv_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_amt);
		p.columnRslt_adv_setoff_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.adv_setoff_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_setoff_amt);
		p.columnRslt_adv_setoff_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.adv_setoff_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_setoff_tax_amt);
		p.columnRslt_pay_schd_dt1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt1_META);
		p.columnRslt_pay_schd_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt1);
		p.columnRslt_pay_schd_amt1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt1);
		p.columnRslt_pay_mtd_cd1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd1);
		p.columnRslt_pay_mtd_nm1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm1);
		p.columnRslt_pay_schd_dt2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt2_META);
		p.columnRslt_pay_schd_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt2);
		p.columnRslt_pay_schd_amt2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt2);
		p.columnRslt_pay_mtd_cd2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd2);
		p.columnRslt_pay_mtd_nm2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm2);
		p.columnRslt_pay_schd_dt3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt3_META);
		p.columnRslt_pay_schd_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt3);
		p.columnRslt_pay_schd_amt3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt3);
		p.columnRslt_pay_mtd_cd3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd3);
		p.columnRslt_pay_mtd_nm3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm3);
		p.columnRslt_pay_schd_dt4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt4_META);
		p.columnRslt_pay_schd_dt4.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt4);
		p.columnRslt_pay_schd_amt4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt4);
		p.columnRslt_pay_mtd_cd4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd4);
		p.columnRslt_pay_mtd_nm4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm4);
		p.columnRslt_pay_schd_dt5.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt5_META);
		p.columnRslt_pay_schd_dt5.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt5);
		p.columnRslt_pay_schd_amt5.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt5);
		p.columnRslt_pay_mtd_cd5.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd5);
		p.columnRslt_pay_mtd_nm5.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm5);
		p.columnRslt_pay_schd_dt6.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt6_META);
		p.columnRslt_pay_schd_dt6.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt6);
		p.columnRslt_pay_schd_amt6.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt6);
		p.columnRslt_pay_mtd_cd6.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd6);
		p.columnRslt_pay_mtd_nm6.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm6);
		p.columnRslt_pay_schd_dt7.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt7_META);
		p.columnRslt_pay_schd_dt7.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt7);
		p.columnRslt_pay_schd_amt7.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt7);
		p.columnRslt_pay_mtd_cd7.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd7);
		p.columnRslt_pay_mtd_nm7.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm7);
		p.columnRslt_pay_schd_dt8.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt8_META);
		p.columnRslt_pay_schd_dt8.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt8);
		p.columnRslt_pay_schd_amt8.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt8);
		p.columnRslt_pay_mtd_cd8.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd8);
		p.columnRslt_pay_mtd_nm8.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm8);
		p.columnRslt_pay_schd_dt9.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt9_META);
		p.columnRslt_pay_schd_dt9.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt9);
		p.columnRslt_pay_schd_amt9.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt9);
		p.columnRslt_pay_mtd_cd9.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd9);
		p.columnRslt_pay_mtd_nm9.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm9);
		p.columnRslt_pay_schd_dt10.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_dt10_META);
		p.columnRslt_pay_schd_dt10.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt10);
		p.columnRslt_pay_schd_amt10.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_schd_amt10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_amt10);
		p.columnRslt_pay_mtd_cd10.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_cd10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_cd10);
		p.columnRslt_pay_mtd_nm10.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.pay_mtd_nm10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_nm10);
		p.columnRslt_bill_bcst_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_bcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_bcst_nm);
		p.columnRslt_bill_ein.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_ein_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_ein);
		p.columnRslt_bill_biz_co_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_biz_co_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_biz_co_no);
		p.columnRslt_bill_zip_cd.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_zip_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_zip_cd);
		p.columnRslt_bill_addr1.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_addr1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_addr1);
		p.columnRslt_bill_addr2.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_addr2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_addr2);
		p.columnRslt_bill_addr3.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_addr3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_addr3);
		p.columnRslt_bill_addr4.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_addr4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_addr4);
		p.columnRslt_bill_bcst_dpt.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_bcst_dpt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_bcst_dpt);
		p.columnRslt_bill_tel.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.bill_tel_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_tel);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0170.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bill_src_cd.getListConfig().setPutter(getCnd_bill_src_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
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
	}

	/**
	 * [Cnd_bill_src_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bill_src_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_bill_src_cd) return getCnd_bill_src_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
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
		else if (ap == Ctrl2_dwnld) doCtrl2_dwnld(info);
		else if (ap == Btn_open_MSBHP0180) doBtn_open_MSBHP0180(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Ctrl2]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl2_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBHP0180]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0180(MCEventInfo info);

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
		if (vc == Cnd_bill_cl_dt_from) return doCnd_bill_cl_dt_from_VC(info);
		if (vc == Cnd_bill_cl_dt_to) return doCnd_bill_cl_dt_to_VC(info);
		if (vc == Cnd_bill_rcpt_no) return doCnd_bill_rcpt_no_VC(info);
		if (vc == Cnd_bill_no) return doCnd_bill_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_bill_src_cd) return doCnd_bill_src_cd_VC(info);
		if (vc == Cnd_bill_src_nm) return doCnd_bill_src_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_pay_schd_dt_from) return doCnd_pay_schd_dt_from_VC(info);
		if (vc == Cnd_pay_schd_dt_to) return doCnd_pay_schd_dt_to_VC(info);
		if (vc == Cnd_inc_invalid_flg) return doCnd_inc_invalid_flg_VC(info);
		if (vc == Cnd_inc_not_bill_flg) return doCnd_inc_not_bill_flg_VC(info);
		if (vc == columnRslt_bill_rcpt_no) return doRslt_bill_rcpt_no_VC(info);
		if (vc == columnRslt_bill_cl_dt) return doRslt_bill_cl_dt_VC(info);
		if (vc == columnRslt_bill_dt) return doRslt_bill_dt_VC(info);
		if (vc == columnRslt_bill_no) return doRslt_bill_no_VC(info);
		if (vc == columnRslt_invalid_flg) return doRslt_invalid_flg_VC(info);
		if (vc == columnRslt_pre_bill_no) return doRslt_pre_bill_no_VC(info);
		if (vc == columnRslt_pre_bill_dt) return doRslt_pre_bill_dt_VC(info);
		if (vc == columnRslt_bill_st_dt) return doRslt_bill_st_dt_VC(info);
		if (vc == columnRslt_bill_end_dt) return doRslt_bill_end_dt_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_wrk_no) return doRslt_wrk_no_VC(info);
		if (vc == columnRslt_wrk_nm) return doRslt_wrk_nm_VC(info);
		if (vc == columnRslt_bill_src_cd) return doRslt_bill_src_cd_VC(info);
		if (vc == columnRslt_bill_src_nm) return doRslt_bill_src_nm_VC(info);
		if (vc == columnRslt_bill_src_ein) return doRslt_bill_src_ein_VC(info);
		if (vc == columnRslt_bill_src_biz_co_no) return doRslt_bill_src_biz_co_no_VC(info);
		if (vc == columnRslt_bill_src_zip_cd) return doRslt_bill_src_zip_cd_VC(info);
		if (vc == columnRslt_bill_src_addr1) return doRslt_bill_src_addr1_VC(info);
		if (vc == columnRslt_bill_src_addr2) return doRslt_bill_src_addr2_VC(info);
		if (vc == columnRslt_bill_src_addr3) return doRslt_bill_src_addr3_VC(info);
		if (vc == columnRslt_bill_src_addr4) return doRslt_bill_src_addr4_VC(info);
		if (vc == columnRslt_bill_src_dpt) return doRslt_bill_src_dpt_VC(info);
		if (vc == columnRslt_bill_src_tel) return doRslt_bill_src_tel_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_bill_xrate) return doRslt_bill_xrate_VC(info);
		if (vc == columnRslt_last_bill_amt) return doRslt_last_bill_amt_VC(info);
		if (vc == columnRslt_rcv_amt) return doRslt_rcv_amt_VC(info);
		if (vc == columnRslt_sw_amt) return doRslt_sw_amt_VC(info);
		if (vc == columnRslt_bfw_amt) return doRslt_bfw_amt_VC(info);
		if (vc == columnRslt_sls_amt) return doRslt_sls_amt_VC(info);
		if (vc == columnRslt_dscnt_amt) return doRslt_dscnt_amt_VC(info);
		if (vc == columnRslt_ret_amt) return doRslt_ret_amt_VC(info);
		if (vc == columnRslt_setoff_amt) return doRslt_setoff_amt_VC(info);
		if (vc == columnRslt_tax_amt) return doRslt_tax_amt_VC(info);
		if (vc == columnRslt_sw_to_amt) return doRslt_sw_to_amt_VC(info);
		if (vc == columnRslt_bill_amt) return doRslt_bill_amt_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_bank_ac_no) return doRslt_bank_ac_no_VC(info);
		if (vc == columnRslt_bank_ac_typ) return doRslt_bank_ac_typ_VC(info);
		if (vc == columnRslt_bank_ac_holder) return doRslt_bank_ac_holder_VC(info);
		if (vc == columnRslt_bank_ac_holder_sub) return doRslt_bank_ac_holder_sub_VC(info);
		if (vc == columnRslt_bank_cd) return doRslt_bank_cd_VC(info);
		if (vc == columnRslt_bank_nm) return doRslt_bank_nm_VC(info);
		if (vc == columnRslt_branch_cd) return doRslt_branch_cd_VC(info);
		if (vc == columnRslt_branch_nm) return doRslt_branch_nm_VC(info);
		if (vc == columnRslt_tax_rate1) return doRslt_tax_rate1_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt1) return doRslt_tax_rate_sls_amt1_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt1) return doRslt_tax_rate_tax_amt1_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt1) return doRslt_tax_rate_base_tax_amt1_VC(info);
		if (vc == columnRslt_tax_rate2) return doRslt_tax_rate2_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt2) return doRslt_tax_rate_sls_amt2_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt2) return doRslt_tax_rate_tax_amt2_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt2) return doRslt_tax_rate_base_tax_amt2_VC(info);
		if (vc == columnRslt_tax_rate3) return doRslt_tax_rate3_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt3) return doRslt_tax_rate_sls_amt3_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt3) return doRslt_tax_rate_tax_amt3_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt3) return doRslt_tax_rate_base_tax_amt3_VC(info);
		if (vc == columnRslt_tax_rate4) return doRslt_tax_rate4_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt4) return doRslt_tax_rate_sls_amt4_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt4) return doRslt_tax_rate_tax_amt4_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt4) return doRslt_tax_rate_base_tax_amt4_VC(info);
		if (vc == columnRslt_tax_rate5) return doRslt_tax_rate5_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt5) return doRslt_tax_rate_sls_amt5_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt5) return doRslt_tax_rate_tax_amt5_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt5) return doRslt_tax_rate_base_tax_amt5_VC(info);
		if (vc == columnRslt_tax_rate6) return doRslt_tax_rate6_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt6) return doRslt_tax_rate_sls_amt6_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt6) return doRslt_tax_rate_tax_amt6_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt6) return doRslt_tax_rate_base_tax_amt6_VC(info);
		if (vc == columnRslt_tax_rate7) return doRslt_tax_rate7_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt7) return doRslt_tax_rate_sls_amt7_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt7) return doRslt_tax_rate_tax_amt7_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt7) return doRslt_tax_rate_base_tax_amt7_VC(info);
		if (vc == columnRslt_tax_rate8) return doRslt_tax_rate8_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt8) return doRslt_tax_rate_sls_amt8_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt8) return doRslt_tax_rate_tax_amt8_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt8) return doRslt_tax_rate_base_tax_amt8_VC(info);
		if (vc == columnRslt_tax_rate9) return doRslt_tax_rate9_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt9) return doRslt_tax_rate_sls_amt9_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt9) return doRslt_tax_rate_tax_amt9_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt9) return doRslt_tax_rate_base_tax_amt9_VC(info);
		if (vc == columnRslt_tax_rate10) return doRslt_tax_rate10_VC(info);
		if (vc == columnRslt_tax_rate_sls_amt10) return doRslt_tax_rate_sls_amt10_VC(info);
		if (vc == columnRslt_tax_rate_tax_amt10) return doRslt_tax_rate_tax_amt10_VC(info);
		if (vc == columnRslt_tax_rate_base_tax_amt10) return doRslt_tax_rate_base_tax_amt10_VC(info);
		if (vc == columnRslt_adv_amt_bal) return doRslt_adv_amt_bal_VC(info);
		if (vc == columnRslt_adv_amt) return doRslt_adv_amt_VC(info);
		if (vc == columnRslt_adv_setoff_amt) return doRslt_adv_setoff_amt_VC(info);
		if (vc == columnRslt_adv_setoff_tax_amt) return doRslt_adv_setoff_tax_amt_VC(info);
		if (vc == columnRslt_pay_schd_dt1) return doRslt_pay_schd_dt1_VC(info);
		if (vc == columnRslt_pay_schd_amt1) return doRslt_pay_schd_amt1_VC(info);
		if (vc == columnRslt_pay_mtd_cd1) return doRslt_pay_mtd_cd1_VC(info);
		if (vc == columnRslt_pay_mtd_nm1) return doRslt_pay_mtd_nm1_VC(info);
		if (vc == columnRslt_pay_schd_dt2) return doRslt_pay_schd_dt2_VC(info);
		if (vc == columnRslt_pay_schd_amt2) return doRslt_pay_schd_amt2_VC(info);
		if (vc == columnRslt_pay_mtd_cd2) return doRslt_pay_mtd_cd2_VC(info);
		if (vc == columnRslt_pay_mtd_nm2) return doRslt_pay_mtd_nm2_VC(info);
		if (vc == columnRslt_pay_schd_dt3) return doRslt_pay_schd_dt3_VC(info);
		if (vc == columnRslt_pay_schd_amt3) return doRslt_pay_schd_amt3_VC(info);
		if (vc == columnRslt_pay_mtd_cd3) return doRslt_pay_mtd_cd3_VC(info);
		if (vc == columnRslt_pay_mtd_nm3) return doRslt_pay_mtd_nm3_VC(info);
		if (vc == columnRslt_pay_schd_dt4) return doRslt_pay_schd_dt4_VC(info);
		if (vc == columnRslt_pay_schd_amt4) return doRslt_pay_schd_amt4_VC(info);
		if (vc == columnRslt_pay_mtd_cd4) return doRslt_pay_mtd_cd4_VC(info);
		if (vc == columnRslt_pay_mtd_nm4) return doRslt_pay_mtd_nm4_VC(info);
		if (vc == columnRslt_pay_schd_dt5) return doRslt_pay_schd_dt5_VC(info);
		if (vc == columnRslt_pay_schd_amt5) return doRslt_pay_schd_amt5_VC(info);
		if (vc == columnRslt_pay_mtd_cd5) return doRslt_pay_mtd_cd5_VC(info);
		if (vc == columnRslt_pay_mtd_nm5) return doRslt_pay_mtd_nm5_VC(info);
		if (vc == columnRslt_pay_schd_dt6) return doRslt_pay_schd_dt6_VC(info);
		if (vc == columnRslt_pay_schd_amt6) return doRslt_pay_schd_amt6_VC(info);
		if (vc == columnRslt_pay_mtd_cd6) return doRslt_pay_mtd_cd6_VC(info);
		if (vc == columnRslt_pay_mtd_nm6) return doRslt_pay_mtd_nm6_VC(info);
		if (vc == columnRslt_pay_schd_dt7) return doRslt_pay_schd_dt7_VC(info);
		if (vc == columnRslt_pay_schd_amt7) return doRslt_pay_schd_amt7_VC(info);
		if (vc == columnRslt_pay_mtd_cd7) return doRslt_pay_mtd_cd7_VC(info);
		if (vc == columnRslt_pay_mtd_nm7) return doRslt_pay_mtd_nm7_VC(info);
		if (vc == columnRslt_pay_schd_dt8) return doRslt_pay_schd_dt8_VC(info);
		if (vc == columnRslt_pay_schd_amt8) return doRslt_pay_schd_amt8_VC(info);
		if (vc == columnRslt_pay_mtd_cd8) return doRslt_pay_mtd_cd8_VC(info);
		if (vc == columnRslt_pay_mtd_nm8) return doRslt_pay_mtd_nm8_VC(info);
		if (vc == columnRslt_pay_schd_dt9) return doRslt_pay_schd_dt9_VC(info);
		if (vc == columnRslt_pay_schd_amt9) return doRslt_pay_schd_amt9_VC(info);
		if (vc == columnRslt_pay_mtd_cd9) return doRslt_pay_mtd_cd9_VC(info);
		if (vc == columnRslt_pay_mtd_nm9) return doRslt_pay_mtd_nm9_VC(info);
		if (vc == columnRslt_pay_schd_dt10) return doRslt_pay_schd_dt10_VC(info);
		if (vc == columnRslt_pay_schd_amt10) return doRslt_pay_schd_amt10_VC(info);
		if (vc == columnRslt_pay_mtd_cd10) return doRslt_pay_mtd_cd10_VC(info);
		if (vc == columnRslt_pay_mtd_nm10) return doRslt_pay_mtd_nm10_VC(info);
		if (vc == columnRslt_bill_bcst_nm) return doRslt_bill_bcst_nm_VC(info);
		if (vc == columnRslt_bill_ein) return doRslt_bill_ein_VC(info);
		if (vc == columnRslt_bill_biz_co_no) return doRslt_bill_biz_co_no_VC(info);
		if (vc == columnRslt_bill_zip_cd) return doRslt_bill_zip_cd_VC(info);
		if (vc == columnRslt_bill_addr1) return doRslt_bill_addr1_VC(info);
		if (vc == columnRslt_bill_addr2) return doRslt_bill_addr2_VC(info);
		if (vc == columnRslt_bill_addr3) return doRslt_bill_addr3_VC(info);
		if (vc == columnRslt_bill_addr4) return doRslt_bill_addr4_VC(info);
		if (vc == columnRslt_bill_bcst_dpt) return doRslt_bill_bcst_dpt_VC(info);
		if (vc == columnRslt_bill_tel) return doRslt_bill_tel_VC(info);
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
	 * [Cnd]パネルの[bill_cl_dt_from]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_cl_dt_from_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_cl_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_cl_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_rcpt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_src_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_src_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_src_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_src_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_from]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_dt_from_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_not_bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_not_bill_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_rcpt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_rcpt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_cl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_cl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_src_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_ein]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_ein_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_biz_co_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_biz_co_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_src_tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_src_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_bill_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_bill_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bfw_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bfw_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[setoff_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_setoff_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_holder_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder_sub]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_holder_sub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[branch_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_branch_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[branch_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_branch_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_sls_amt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_tax_amt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_base_tax_amt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_amt_bal]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_amt_bal_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_setoff_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_setoff_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_setoff_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_setoff_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_amt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_ein]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_ein_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_biz_co_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_biz_co_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_bcst_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_bcst_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_tel_VC(MCEventInfo info){
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
		else if (nc == Cnd_bill_cl_dt_from) doCnd_bill_cl_dt_from_NC(info);
		else if (nc == Cnd_bill_cl_dt_to) doCnd_bill_cl_dt_to_NC(info);
		else if (nc == Cnd_bill_rcpt_no) doCnd_bill_rcpt_no_NC(info);
		else if (nc == Cnd_bill_no) doCnd_bill_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_bill_src_cd) doCnd_bill_src_cd_NC(info);
		else if (nc == Cnd_bill_src_nm) doCnd_bill_src_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_pay_schd_dt_from) doCnd_pay_schd_dt_from_NC(info);
		else if (nc == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NC(info);
		else if (nc == Cnd_inc_invalid_flg) doCnd_inc_invalid_flg_NC(info);
		else if (nc == Cnd_inc_not_bill_flg) doCnd_inc_not_bill_flg_NC(info);
		else if (nc == columnRslt_bill_rcpt_no) doRslt_bill_rcpt_no_NC(info);
		else if (nc == columnRslt_bill_cl_dt) doRslt_bill_cl_dt_NC(info);
		else if (nc == columnRslt_bill_dt) doRslt_bill_dt_NC(info);
		else if (nc == columnRslt_bill_no) doRslt_bill_no_NC(info);
		else if (nc == columnRslt_invalid_flg) doRslt_invalid_flg_NC(info);
		else if (nc == columnRslt_pre_bill_no) doRslt_pre_bill_no_NC(info);
		else if (nc == columnRslt_pre_bill_dt) doRslt_pre_bill_dt_NC(info);
		else if (nc == columnRslt_bill_st_dt) doRslt_bill_st_dt_NC(info);
		else if (nc == columnRslt_bill_end_dt) doRslt_bill_end_dt_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_wrk_no) doRslt_wrk_no_NC(info);
		else if (nc == columnRslt_wrk_nm) doRslt_wrk_nm_NC(info);
		else if (nc == columnRslt_bill_src_cd) doRslt_bill_src_cd_NC(info);
		else if (nc == columnRslt_bill_src_nm) doRslt_bill_src_nm_NC(info);
		else if (nc == columnRslt_bill_src_ein) doRslt_bill_src_ein_NC(info);
		else if (nc == columnRslt_bill_src_biz_co_no) doRslt_bill_src_biz_co_no_NC(info);
		else if (nc == columnRslt_bill_src_zip_cd) doRslt_bill_src_zip_cd_NC(info);
		else if (nc == columnRslt_bill_src_addr1) doRslt_bill_src_addr1_NC(info);
		else if (nc == columnRslt_bill_src_addr2) doRslt_bill_src_addr2_NC(info);
		else if (nc == columnRslt_bill_src_addr3) doRslt_bill_src_addr3_NC(info);
		else if (nc == columnRslt_bill_src_addr4) doRslt_bill_src_addr4_NC(info);
		else if (nc == columnRslt_bill_src_dpt) doRslt_bill_src_dpt_NC(info);
		else if (nc == columnRslt_bill_src_tel) doRslt_bill_src_tel_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_bill_xrate) doRslt_bill_xrate_NC(info);
		else if (nc == columnRslt_last_bill_amt) doRslt_last_bill_amt_NC(info);
		else if (nc == columnRslt_rcv_amt) doRslt_rcv_amt_NC(info);
		else if (nc == columnRslt_sw_amt) doRslt_sw_amt_NC(info);
		else if (nc == columnRslt_bfw_amt) doRslt_bfw_amt_NC(info);
		else if (nc == columnRslt_sls_amt) doRslt_sls_amt_NC(info);
		else if (nc == columnRslt_dscnt_amt) doRslt_dscnt_amt_NC(info);
		else if (nc == columnRslt_ret_amt) doRslt_ret_amt_NC(info);
		else if (nc == columnRslt_setoff_amt) doRslt_setoff_amt_NC(info);
		else if (nc == columnRslt_tax_amt) doRslt_tax_amt_NC(info);
		else if (nc == columnRslt_sw_to_amt) doRslt_sw_to_amt_NC(info);
		else if (nc == columnRslt_bill_amt) doRslt_bill_amt_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_bank_ac_no) doRslt_bank_ac_no_NC(info);
		else if (nc == columnRslt_bank_ac_typ) doRslt_bank_ac_typ_NC(info);
		else if (nc == columnRslt_bank_ac_holder) doRslt_bank_ac_holder_NC(info);
		else if (nc == columnRslt_bank_ac_holder_sub) doRslt_bank_ac_holder_sub_NC(info);
		else if (nc == columnRslt_bank_cd) doRslt_bank_cd_NC(info);
		else if (nc == columnRslt_bank_nm) doRslt_bank_nm_NC(info);
		else if (nc == columnRslt_branch_cd) doRslt_branch_cd_NC(info);
		else if (nc == columnRslt_branch_nm) doRslt_branch_nm_NC(info);
		else if (nc == columnRslt_tax_rate1) doRslt_tax_rate1_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt1) doRslt_tax_rate_sls_amt1_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt1) doRslt_tax_rate_tax_amt1_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt1) doRslt_tax_rate_base_tax_amt1_NC(info);
		else if (nc == columnRslt_tax_rate2) doRslt_tax_rate2_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt2) doRslt_tax_rate_sls_amt2_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt2) doRslt_tax_rate_tax_amt2_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt2) doRslt_tax_rate_base_tax_amt2_NC(info);
		else if (nc == columnRslt_tax_rate3) doRslt_tax_rate3_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt3) doRslt_tax_rate_sls_amt3_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt3) doRslt_tax_rate_tax_amt3_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt3) doRslt_tax_rate_base_tax_amt3_NC(info);
		else if (nc == columnRslt_tax_rate4) doRslt_tax_rate4_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt4) doRslt_tax_rate_sls_amt4_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt4) doRslt_tax_rate_tax_amt4_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt4) doRslt_tax_rate_base_tax_amt4_NC(info);
		else if (nc == columnRslt_tax_rate5) doRslt_tax_rate5_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt5) doRslt_tax_rate_sls_amt5_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt5) doRslt_tax_rate_tax_amt5_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt5) doRslt_tax_rate_base_tax_amt5_NC(info);
		else if (nc == columnRslt_tax_rate6) doRslt_tax_rate6_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt6) doRslt_tax_rate_sls_amt6_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt6) doRslt_tax_rate_tax_amt6_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt6) doRslt_tax_rate_base_tax_amt6_NC(info);
		else if (nc == columnRslt_tax_rate7) doRslt_tax_rate7_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt7) doRslt_tax_rate_sls_amt7_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt7) doRslt_tax_rate_tax_amt7_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt7) doRslt_tax_rate_base_tax_amt7_NC(info);
		else if (nc == columnRslt_tax_rate8) doRslt_tax_rate8_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt8) doRslt_tax_rate_sls_amt8_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt8) doRslt_tax_rate_tax_amt8_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt8) doRslt_tax_rate_base_tax_amt8_NC(info);
		else if (nc == columnRslt_tax_rate9) doRslt_tax_rate9_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt9) doRslt_tax_rate_sls_amt9_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt9) doRslt_tax_rate_tax_amt9_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt9) doRslt_tax_rate_base_tax_amt9_NC(info);
		else if (nc == columnRslt_tax_rate10) doRslt_tax_rate10_NC(info);
		else if (nc == columnRslt_tax_rate_sls_amt10) doRslt_tax_rate_sls_amt10_NC(info);
		else if (nc == columnRslt_tax_rate_tax_amt10) doRslt_tax_rate_tax_amt10_NC(info);
		else if (nc == columnRslt_tax_rate_base_tax_amt10) doRslt_tax_rate_base_tax_amt10_NC(info);
		else if (nc == columnRslt_adv_amt_bal) doRslt_adv_amt_bal_NC(info);
		else if (nc == columnRslt_adv_amt) doRslt_adv_amt_NC(info);
		else if (nc == columnRslt_adv_setoff_amt) doRslt_adv_setoff_amt_NC(info);
		else if (nc == columnRslt_adv_setoff_tax_amt) doRslt_adv_setoff_tax_amt_NC(info);
		else if (nc == columnRslt_pay_schd_dt1) doRslt_pay_schd_dt1_NC(info);
		else if (nc == columnRslt_pay_schd_amt1) doRslt_pay_schd_amt1_NC(info);
		else if (nc == columnRslt_pay_mtd_cd1) doRslt_pay_mtd_cd1_NC(info);
		else if (nc == columnRslt_pay_mtd_nm1) doRslt_pay_mtd_nm1_NC(info);
		else if (nc == columnRslt_pay_schd_dt2) doRslt_pay_schd_dt2_NC(info);
		else if (nc == columnRslt_pay_schd_amt2) doRslt_pay_schd_amt2_NC(info);
		else if (nc == columnRslt_pay_mtd_cd2) doRslt_pay_mtd_cd2_NC(info);
		else if (nc == columnRslt_pay_mtd_nm2) doRslt_pay_mtd_nm2_NC(info);
		else if (nc == columnRslt_pay_schd_dt3) doRslt_pay_schd_dt3_NC(info);
		else if (nc == columnRslt_pay_schd_amt3) doRslt_pay_schd_amt3_NC(info);
		else if (nc == columnRslt_pay_mtd_cd3) doRslt_pay_mtd_cd3_NC(info);
		else if (nc == columnRslt_pay_mtd_nm3) doRslt_pay_mtd_nm3_NC(info);
		else if (nc == columnRslt_pay_schd_dt4) doRslt_pay_schd_dt4_NC(info);
		else if (nc == columnRslt_pay_schd_amt4) doRslt_pay_schd_amt4_NC(info);
		else if (nc == columnRslt_pay_mtd_cd4) doRslt_pay_mtd_cd4_NC(info);
		else if (nc == columnRslt_pay_mtd_nm4) doRslt_pay_mtd_nm4_NC(info);
		else if (nc == columnRslt_pay_schd_dt5) doRslt_pay_schd_dt5_NC(info);
		else if (nc == columnRslt_pay_schd_amt5) doRslt_pay_schd_amt5_NC(info);
		else if (nc == columnRslt_pay_mtd_cd5) doRslt_pay_mtd_cd5_NC(info);
		else if (nc == columnRslt_pay_mtd_nm5) doRslt_pay_mtd_nm5_NC(info);
		else if (nc == columnRslt_pay_schd_dt6) doRslt_pay_schd_dt6_NC(info);
		else if (nc == columnRslt_pay_schd_amt6) doRslt_pay_schd_amt6_NC(info);
		else if (nc == columnRslt_pay_mtd_cd6) doRslt_pay_mtd_cd6_NC(info);
		else if (nc == columnRslt_pay_mtd_nm6) doRslt_pay_mtd_nm6_NC(info);
		else if (nc == columnRslt_pay_schd_dt7) doRslt_pay_schd_dt7_NC(info);
		else if (nc == columnRslt_pay_schd_amt7) doRslt_pay_schd_amt7_NC(info);
		else if (nc == columnRslt_pay_mtd_cd7) doRslt_pay_mtd_cd7_NC(info);
		else if (nc == columnRslt_pay_mtd_nm7) doRslt_pay_mtd_nm7_NC(info);
		else if (nc == columnRslt_pay_schd_dt8) doRslt_pay_schd_dt8_NC(info);
		else if (nc == columnRslt_pay_schd_amt8) doRslt_pay_schd_amt8_NC(info);
		else if (nc == columnRslt_pay_mtd_cd8) doRslt_pay_mtd_cd8_NC(info);
		else if (nc == columnRslt_pay_mtd_nm8) doRslt_pay_mtd_nm8_NC(info);
		else if (nc == columnRslt_pay_schd_dt9) doRslt_pay_schd_dt9_NC(info);
		else if (nc == columnRslt_pay_schd_amt9) doRslt_pay_schd_amt9_NC(info);
		else if (nc == columnRslt_pay_mtd_cd9) doRslt_pay_mtd_cd9_NC(info);
		else if (nc == columnRslt_pay_mtd_nm9) doRslt_pay_mtd_nm9_NC(info);
		else if (nc == columnRslt_pay_schd_dt10) doRslt_pay_schd_dt10_NC(info);
		else if (nc == columnRslt_pay_schd_amt10) doRslt_pay_schd_amt10_NC(info);
		else if (nc == columnRslt_pay_mtd_cd10) doRslt_pay_mtd_cd10_NC(info);
		else if (nc == columnRslt_pay_mtd_nm10) doRslt_pay_mtd_nm10_NC(info);
		else if (nc == columnRslt_bill_bcst_nm) doRslt_bill_bcst_nm_NC(info);
		else if (nc == columnRslt_bill_ein) doRslt_bill_ein_NC(info);
		else if (nc == columnRslt_bill_biz_co_no) doRslt_bill_biz_co_no_NC(info);
		else if (nc == columnRslt_bill_zip_cd) doRslt_bill_zip_cd_NC(info);
		else if (nc == columnRslt_bill_addr1) doRslt_bill_addr1_NC(info);
		else if (nc == columnRslt_bill_addr2) doRslt_bill_addr2_NC(info);
		else if (nc == columnRslt_bill_addr3) doRslt_bill_addr3_NC(info);
		else if (nc == columnRslt_bill_addr4) doRslt_bill_addr4_NC(info);
		else if (nc == columnRslt_bill_bcst_dpt) doRslt_bill_bcst_dpt_NC(info);
		else if (nc == columnRslt_bill_tel) doRslt_bill_tel_NC(info);
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
	 * [Cnd]パネルの[bill_cl_dt_from]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_dt_from_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rcpt_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_src_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_src_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_src_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_src_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_from]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_from_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_bill_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_rcpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_rcpt_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_src_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_ein]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_ein_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_biz_co_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_biz_co_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_tel_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_bill_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_bill_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bfw_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bfw_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_holder_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder_sub]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_holder_sub_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_amt_bal]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_amt_bal_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_setoff_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_setoff_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_setoff_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_setoff_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_ein]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_ein_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_biz_co_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_biz_co_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_bcst_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_bcst_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_tel_NC(MCEventInfo info){
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
		else if (ne == Cnd_bill_cl_dt_from) doCnd_bill_cl_dt_from_NE(info);
		else if (ne == Cnd_bill_cl_dt_to) doCnd_bill_cl_dt_to_NE(info);
		else if (ne == Cnd_bill_rcpt_no) doCnd_bill_rcpt_no_NE(info);
		else if (ne == Cnd_bill_no) doCnd_bill_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_bill_src_cd) doCnd_bill_src_cd_NE(info);
		else if (ne == Cnd_bill_src_nm) doCnd_bill_src_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_pay_schd_dt_from) doCnd_pay_schd_dt_from_NE(info);
		else if (ne == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NE(info);
		else if (ne == Cnd_inc_invalid_flg) doCnd_inc_invalid_flg_NE(info);
		else if (ne == Cnd_inc_not_bill_flg) doCnd_inc_not_bill_flg_NE(info);
		else if (ne == columnRslt_bill_rcpt_no) doRslt_bill_rcpt_no_NE(info);
		else if (ne == columnRslt_bill_cl_dt) doRslt_bill_cl_dt_NE(info);
		else if (ne == columnRslt_bill_dt) doRslt_bill_dt_NE(info);
		else if (ne == columnRslt_bill_no) doRslt_bill_no_NE(info);
		else if (ne == columnRslt_invalid_flg) doRslt_invalid_flg_NE(info);
		else if (ne == columnRslt_pre_bill_no) doRslt_pre_bill_no_NE(info);
		else if (ne == columnRslt_pre_bill_dt) doRslt_pre_bill_dt_NE(info);
		else if (ne == columnRslt_bill_st_dt) doRslt_bill_st_dt_NE(info);
		else if (ne == columnRslt_bill_end_dt) doRslt_bill_end_dt_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_wrk_no) doRslt_wrk_no_NE(info);
		else if (ne == columnRslt_wrk_nm) doRslt_wrk_nm_NE(info);
		else if (ne == columnRslt_bill_src_cd) doRslt_bill_src_cd_NE(info);
		else if (ne == columnRslt_bill_src_nm) doRslt_bill_src_nm_NE(info);
		else if (ne == columnRslt_bill_src_ein) doRslt_bill_src_ein_NE(info);
		else if (ne == columnRslt_bill_src_biz_co_no) doRslt_bill_src_biz_co_no_NE(info);
		else if (ne == columnRslt_bill_src_zip_cd) doRslt_bill_src_zip_cd_NE(info);
		else if (ne == columnRslt_bill_src_addr1) doRslt_bill_src_addr1_NE(info);
		else if (ne == columnRslt_bill_src_addr2) doRslt_bill_src_addr2_NE(info);
		else if (ne == columnRslt_bill_src_addr3) doRslt_bill_src_addr3_NE(info);
		else if (ne == columnRslt_bill_src_addr4) doRslt_bill_src_addr4_NE(info);
		else if (ne == columnRslt_bill_src_dpt) doRslt_bill_src_dpt_NE(info);
		else if (ne == columnRslt_bill_src_tel) doRslt_bill_src_tel_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_bill_xrate) doRslt_bill_xrate_NE(info);
		else if (ne == columnRslt_last_bill_amt) doRslt_last_bill_amt_NE(info);
		else if (ne == columnRslt_rcv_amt) doRslt_rcv_amt_NE(info);
		else if (ne == columnRslt_sw_amt) doRslt_sw_amt_NE(info);
		else if (ne == columnRslt_bfw_amt) doRslt_bfw_amt_NE(info);
		else if (ne == columnRslt_sls_amt) doRslt_sls_amt_NE(info);
		else if (ne == columnRslt_dscnt_amt) doRslt_dscnt_amt_NE(info);
		else if (ne == columnRslt_ret_amt) doRslt_ret_amt_NE(info);
		else if (ne == columnRslt_setoff_amt) doRslt_setoff_amt_NE(info);
		else if (ne == columnRslt_tax_amt) doRslt_tax_amt_NE(info);
		else if (ne == columnRslt_sw_to_amt) doRslt_sw_to_amt_NE(info);
		else if (ne == columnRslt_bill_amt) doRslt_bill_amt_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_bank_ac_no) doRslt_bank_ac_no_NE(info);
		else if (ne == columnRslt_bank_ac_typ) doRslt_bank_ac_typ_NE(info);
		else if (ne == columnRslt_bank_ac_holder) doRslt_bank_ac_holder_NE(info);
		else if (ne == columnRslt_bank_ac_holder_sub) doRslt_bank_ac_holder_sub_NE(info);
		else if (ne == columnRslt_bank_cd) doRslt_bank_cd_NE(info);
		else if (ne == columnRslt_bank_nm) doRslt_bank_nm_NE(info);
		else if (ne == columnRslt_branch_cd) doRslt_branch_cd_NE(info);
		else if (ne == columnRslt_branch_nm) doRslt_branch_nm_NE(info);
		else if (ne == columnRslt_tax_rate1) doRslt_tax_rate1_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt1) doRslt_tax_rate_sls_amt1_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt1) doRslt_tax_rate_tax_amt1_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt1) doRslt_tax_rate_base_tax_amt1_NE(info);
		else if (ne == columnRslt_tax_rate2) doRslt_tax_rate2_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt2) doRslt_tax_rate_sls_amt2_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt2) doRslt_tax_rate_tax_amt2_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt2) doRslt_tax_rate_base_tax_amt2_NE(info);
		else if (ne == columnRslt_tax_rate3) doRslt_tax_rate3_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt3) doRslt_tax_rate_sls_amt3_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt3) doRslt_tax_rate_tax_amt3_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt3) doRslt_tax_rate_base_tax_amt3_NE(info);
		else if (ne == columnRslt_tax_rate4) doRslt_tax_rate4_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt4) doRslt_tax_rate_sls_amt4_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt4) doRslt_tax_rate_tax_amt4_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt4) doRslt_tax_rate_base_tax_amt4_NE(info);
		else if (ne == columnRslt_tax_rate5) doRslt_tax_rate5_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt5) doRslt_tax_rate_sls_amt5_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt5) doRslt_tax_rate_tax_amt5_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt5) doRslt_tax_rate_base_tax_amt5_NE(info);
		else if (ne == columnRslt_tax_rate6) doRslt_tax_rate6_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt6) doRslt_tax_rate_sls_amt6_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt6) doRslt_tax_rate_tax_amt6_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt6) doRslt_tax_rate_base_tax_amt6_NE(info);
		else if (ne == columnRslt_tax_rate7) doRslt_tax_rate7_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt7) doRslt_tax_rate_sls_amt7_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt7) doRslt_tax_rate_tax_amt7_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt7) doRslt_tax_rate_base_tax_amt7_NE(info);
		else if (ne == columnRslt_tax_rate8) doRslt_tax_rate8_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt8) doRslt_tax_rate_sls_amt8_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt8) doRslt_tax_rate_tax_amt8_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt8) doRslt_tax_rate_base_tax_amt8_NE(info);
		else if (ne == columnRslt_tax_rate9) doRslt_tax_rate9_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt9) doRslt_tax_rate_sls_amt9_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt9) doRslt_tax_rate_tax_amt9_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt9) doRslt_tax_rate_base_tax_amt9_NE(info);
		else if (ne == columnRslt_tax_rate10) doRslt_tax_rate10_NE(info);
		else if (ne == columnRslt_tax_rate_sls_amt10) doRslt_tax_rate_sls_amt10_NE(info);
		else if (ne == columnRslt_tax_rate_tax_amt10) doRslt_tax_rate_tax_amt10_NE(info);
		else if (ne == columnRslt_tax_rate_base_tax_amt10) doRslt_tax_rate_base_tax_amt10_NE(info);
		else if (ne == columnRslt_adv_amt_bal) doRslt_adv_amt_bal_NE(info);
		else if (ne == columnRslt_adv_amt) doRslt_adv_amt_NE(info);
		else if (ne == columnRslt_adv_setoff_amt) doRslt_adv_setoff_amt_NE(info);
		else if (ne == columnRslt_adv_setoff_tax_amt) doRslt_adv_setoff_tax_amt_NE(info);
		else if (ne == columnRslt_pay_schd_dt1) doRslt_pay_schd_dt1_NE(info);
		else if (ne == columnRslt_pay_schd_amt1) doRslt_pay_schd_amt1_NE(info);
		else if (ne == columnRslt_pay_mtd_cd1) doRslt_pay_mtd_cd1_NE(info);
		else if (ne == columnRslt_pay_mtd_nm1) doRslt_pay_mtd_nm1_NE(info);
		else if (ne == columnRslt_pay_schd_dt2) doRslt_pay_schd_dt2_NE(info);
		else if (ne == columnRslt_pay_schd_amt2) doRslt_pay_schd_amt2_NE(info);
		else if (ne == columnRslt_pay_mtd_cd2) doRslt_pay_mtd_cd2_NE(info);
		else if (ne == columnRslt_pay_mtd_nm2) doRslt_pay_mtd_nm2_NE(info);
		else if (ne == columnRslt_pay_schd_dt3) doRslt_pay_schd_dt3_NE(info);
		else if (ne == columnRslt_pay_schd_amt3) doRslt_pay_schd_amt3_NE(info);
		else if (ne == columnRslt_pay_mtd_cd3) doRslt_pay_mtd_cd3_NE(info);
		else if (ne == columnRslt_pay_mtd_nm3) doRslt_pay_mtd_nm3_NE(info);
		else if (ne == columnRslt_pay_schd_dt4) doRslt_pay_schd_dt4_NE(info);
		else if (ne == columnRslt_pay_schd_amt4) doRslt_pay_schd_amt4_NE(info);
		else if (ne == columnRslt_pay_mtd_cd4) doRslt_pay_mtd_cd4_NE(info);
		else if (ne == columnRslt_pay_mtd_nm4) doRslt_pay_mtd_nm4_NE(info);
		else if (ne == columnRslt_pay_schd_dt5) doRslt_pay_schd_dt5_NE(info);
		else if (ne == columnRslt_pay_schd_amt5) doRslt_pay_schd_amt5_NE(info);
		else if (ne == columnRslt_pay_mtd_cd5) doRslt_pay_mtd_cd5_NE(info);
		else if (ne == columnRslt_pay_mtd_nm5) doRslt_pay_mtd_nm5_NE(info);
		else if (ne == columnRslt_pay_schd_dt6) doRslt_pay_schd_dt6_NE(info);
		else if (ne == columnRslt_pay_schd_amt6) doRslt_pay_schd_amt6_NE(info);
		else if (ne == columnRslt_pay_mtd_cd6) doRslt_pay_mtd_cd6_NE(info);
		else if (ne == columnRslt_pay_mtd_nm6) doRslt_pay_mtd_nm6_NE(info);
		else if (ne == columnRslt_pay_schd_dt7) doRslt_pay_schd_dt7_NE(info);
		else if (ne == columnRslt_pay_schd_amt7) doRslt_pay_schd_amt7_NE(info);
		else if (ne == columnRslt_pay_mtd_cd7) doRslt_pay_mtd_cd7_NE(info);
		else if (ne == columnRslt_pay_mtd_nm7) doRslt_pay_mtd_nm7_NE(info);
		else if (ne == columnRslt_pay_schd_dt8) doRslt_pay_schd_dt8_NE(info);
		else if (ne == columnRslt_pay_schd_amt8) doRslt_pay_schd_amt8_NE(info);
		else if (ne == columnRslt_pay_mtd_cd8) doRslt_pay_mtd_cd8_NE(info);
		else if (ne == columnRslt_pay_mtd_nm8) doRslt_pay_mtd_nm8_NE(info);
		else if (ne == columnRslt_pay_schd_dt9) doRslt_pay_schd_dt9_NE(info);
		else if (ne == columnRslt_pay_schd_amt9) doRslt_pay_schd_amt9_NE(info);
		else if (ne == columnRslt_pay_mtd_cd9) doRslt_pay_mtd_cd9_NE(info);
		else if (ne == columnRslt_pay_mtd_nm9) doRslt_pay_mtd_nm9_NE(info);
		else if (ne == columnRslt_pay_schd_dt10) doRslt_pay_schd_dt10_NE(info);
		else if (ne == columnRslt_pay_schd_amt10) doRslt_pay_schd_amt10_NE(info);
		else if (ne == columnRslt_pay_mtd_cd10) doRslt_pay_mtd_cd10_NE(info);
		else if (ne == columnRslt_pay_mtd_nm10) doRslt_pay_mtd_nm10_NE(info);
		else if (ne == columnRslt_bill_bcst_nm) doRslt_bill_bcst_nm_NE(info);
		else if (ne == columnRslt_bill_ein) doRslt_bill_ein_NE(info);
		else if (ne == columnRslt_bill_biz_co_no) doRslt_bill_biz_co_no_NE(info);
		else if (ne == columnRslt_bill_zip_cd) doRslt_bill_zip_cd_NE(info);
		else if (ne == columnRslt_bill_addr1) doRslt_bill_addr1_NE(info);
		else if (ne == columnRslt_bill_addr2) doRslt_bill_addr2_NE(info);
		else if (ne == columnRslt_bill_addr3) doRslt_bill_addr3_NE(info);
		else if (ne == columnRslt_bill_addr4) doRslt_bill_addr4_NE(info);
		else if (ne == columnRslt_bill_bcst_dpt) doRslt_bill_bcst_dpt_NE(info);
		else if (ne == columnRslt_bill_tel) doRslt_bill_tel_NE(info);
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
	 * [Cnd]パネルの[bill_cl_dt_from]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_dt_from_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rcpt_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_src_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_src_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_src_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_src_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_from]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_from_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_bill_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_rcpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_rcpt_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_src_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_ein]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_ein_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_biz_co_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_biz_co_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_tel_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_bill_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_bill_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bfw_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bfw_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_holder_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder_sub]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_holder_sub_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_amt_bal]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_amt_bal_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_setoff_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_setoff_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_setoff_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_setoff_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_ein]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_ein_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_biz_co_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_biz_co_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_bcst_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_bcst_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_tel_NE(MCEventInfo info){
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
		else if (nx == Cnd_bill_cl_dt_from) doCnd_bill_cl_dt_from_NX(info);
		else if (nx == Cnd_bill_cl_dt_to) doCnd_bill_cl_dt_to_NX(info);
		else if (nx == Cnd_bill_rcpt_no) doCnd_bill_rcpt_no_NX(info);
		else if (nx == Cnd_bill_no) doCnd_bill_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_bill_src_cd) doCnd_bill_src_cd_NX(info);
		else if (nx == Cnd_bill_src_nm) doCnd_bill_src_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_pay_schd_dt_from) doCnd_pay_schd_dt_from_NX(info);
		else if (nx == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NX(info);
		else if (nx == Cnd_inc_invalid_flg) doCnd_inc_invalid_flg_NX(info);
		else if (nx == Cnd_inc_not_bill_flg) doCnd_inc_not_bill_flg_NX(info);
		else if (nx == columnRslt_bill_rcpt_no) doRslt_bill_rcpt_no_NX(info);
		else if (nx == columnRslt_bill_cl_dt) doRslt_bill_cl_dt_NX(info);
		else if (nx == columnRslt_bill_dt) doRslt_bill_dt_NX(info);
		else if (nx == columnRslt_bill_no) doRslt_bill_no_NX(info);
		else if (nx == columnRslt_invalid_flg) doRslt_invalid_flg_NX(info);
		else if (nx == columnRslt_pre_bill_no) doRslt_pre_bill_no_NX(info);
		else if (nx == columnRslt_pre_bill_dt) doRslt_pre_bill_dt_NX(info);
		else if (nx == columnRslt_bill_st_dt) doRslt_bill_st_dt_NX(info);
		else if (nx == columnRslt_bill_end_dt) doRslt_bill_end_dt_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_wrk_no) doRslt_wrk_no_NX(info);
		else if (nx == columnRslt_wrk_nm) doRslt_wrk_nm_NX(info);
		else if (nx == columnRslt_bill_src_cd) doRslt_bill_src_cd_NX(info);
		else if (nx == columnRslt_bill_src_nm) doRslt_bill_src_nm_NX(info);
		else if (nx == columnRslt_bill_src_ein) doRslt_bill_src_ein_NX(info);
		else if (nx == columnRslt_bill_src_biz_co_no) doRslt_bill_src_biz_co_no_NX(info);
		else if (nx == columnRslt_bill_src_zip_cd) doRslt_bill_src_zip_cd_NX(info);
		else if (nx == columnRslt_bill_src_addr1) doRslt_bill_src_addr1_NX(info);
		else if (nx == columnRslt_bill_src_addr2) doRslt_bill_src_addr2_NX(info);
		else if (nx == columnRslt_bill_src_addr3) doRslt_bill_src_addr3_NX(info);
		else if (nx == columnRslt_bill_src_addr4) doRslt_bill_src_addr4_NX(info);
		else if (nx == columnRslt_bill_src_dpt) doRslt_bill_src_dpt_NX(info);
		else if (nx == columnRslt_bill_src_tel) doRslt_bill_src_tel_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_bill_xrate) doRslt_bill_xrate_NX(info);
		else if (nx == columnRslt_last_bill_amt) doRslt_last_bill_amt_NX(info);
		else if (nx == columnRslt_rcv_amt) doRslt_rcv_amt_NX(info);
		else if (nx == columnRslt_sw_amt) doRslt_sw_amt_NX(info);
		else if (nx == columnRslt_bfw_amt) doRslt_bfw_amt_NX(info);
		else if (nx == columnRslt_sls_amt) doRslt_sls_amt_NX(info);
		else if (nx == columnRslt_dscnt_amt) doRslt_dscnt_amt_NX(info);
		else if (nx == columnRslt_ret_amt) doRslt_ret_amt_NX(info);
		else if (nx == columnRslt_setoff_amt) doRslt_setoff_amt_NX(info);
		else if (nx == columnRslt_tax_amt) doRslt_tax_amt_NX(info);
		else if (nx == columnRslt_sw_to_amt) doRslt_sw_to_amt_NX(info);
		else if (nx == columnRslt_bill_amt) doRslt_bill_amt_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_bank_ac_no) doRslt_bank_ac_no_NX(info);
		else if (nx == columnRslt_bank_ac_typ) doRslt_bank_ac_typ_NX(info);
		else if (nx == columnRslt_bank_ac_holder) doRslt_bank_ac_holder_NX(info);
		else if (nx == columnRslt_bank_ac_holder_sub) doRslt_bank_ac_holder_sub_NX(info);
		else if (nx == columnRslt_bank_cd) doRslt_bank_cd_NX(info);
		else if (nx == columnRslt_bank_nm) doRslt_bank_nm_NX(info);
		else if (nx == columnRslt_branch_cd) doRslt_branch_cd_NX(info);
		else if (nx == columnRslt_branch_nm) doRslt_branch_nm_NX(info);
		else if (nx == columnRslt_tax_rate1) doRslt_tax_rate1_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt1) doRslt_tax_rate_sls_amt1_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt1) doRslt_tax_rate_tax_amt1_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt1) doRslt_tax_rate_base_tax_amt1_NX(info);
		else if (nx == columnRslt_tax_rate2) doRslt_tax_rate2_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt2) doRslt_tax_rate_sls_amt2_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt2) doRslt_tax_rate_tax_amt2_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt2) doRslt_tax_rate_base_tax_amt2_NX(info);
		else if (nx == columnRslt_tax_rate3) doRslt_tax_rate3_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt3) doRslt_tax_rate_sls_amt3_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt3) doRslt_tax_rate_tax_amt3_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt3) doRslt_tax_rate_base_tax_amt3_NX(info);
		else if (nx == columnRslt_tax_rate4) doRslt_tax_rate4_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt4) doRslt_tax_rate_sls_amt4_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt4) doRslt_tax_rate_tax_amt4_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt4) doRslt_tax_rate_base_tax_amt4_NX(info);
		else if (nx == columnRslt_tax_rate5) doRslt_tax_rate5_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt5) doRslt_tax_rate_sls_amt5_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt5) doRslt_tax_rate_tax_amt5_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt5) doRslt_tax_rate_base_tax_amt5_NX(info);
		else if (nx == columnRslt_tax_rate6) doRslt_tax_rate6_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt6) doRslt_tax_rate_sls_amt6_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt6) doRslt_tax_rate_tax_amt6_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt6) doRslt_tax_rate_base_tax_amt6_NX(info);
		else if (nx == columnRslt_tax_rate7) doRslt_tax_rate7_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt7) doRslt_tax_rate_sls_amt7_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt7) doRslt_tax_rate_tax_amt7_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt7) doRslt_tax_rate_base_tax_amt7_NX(info);
		else if (nx == columnRslt_tax_rate8) doRslt_tax_rate8_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt8) doRslt_tax_rate_sls_amt8_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt8) doRslt_tax_rate_tax_amt8_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt8) doRslt_tax_rate_base_tax_amt8_NX(info);
		else if (nx == columnRslt_tax_rate9) doRslt_tax_rate9_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt9) doRslt_tax_rate_sls_amt9_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt9) doRslt_tax_rate_tax_amt9_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt9) doRslt_tax_rate_base_tax_amt9_NX(info);
		else if (nx == columnRslt_tax_rate10) doRslt_tax_rate10_NX(info);
		else if (nx == columnRslt_tax_rate_sls_amt10) doRslt_tax_rate_sls_amt10_NX(info);
		else if (nx == columnRslt_tax_rate_tax_amt10) doRslt_tax_rate_tax_amt10_NX(info);
		else if (nx == columnRslt_tax_rate_base_tax_amt10) doRslt_tax_rate_base_tax_amt10_NX(info);
		else if (nx == columnRslt_adv_amt_bal) doRslt_adv_amt_bal_NX(info);
		else if (nx == columnRslt_adv_amt) doRslt_adv_amt_NX(info);
		else if (nx == columnRslt_adv_setoff_amt) doRslt_adv_setoff_amt_NX(info);
		else if (nx == columnRslt_adv_setoff_tax_amt) doRslt_adv_setoff_tax_amt_NX(info);
		else if (nx == columnRslt_pay_schd_dt1) doRslt_pay_schd_dt1_NX(info);
		else if (nx == columnRslt_pay_schd_amt1) doRslt_pay_schd_amt1_NX(info);
		else if (nx == columnRslt_pay_mtd_cd1) doRslt_pay_mtd_cd1_NX(info);
		else if (nx == columnRslt_pay_mtd_nm1) doRslt_pay_mtd_nm1_NX(info);
		else if (nx == columnRslt_pay_schd_dt2) doRslt_pay_schd_dt2_NX(info);
		else if (nx == columnRslt_pay_schd_amt2) doRslt_pay_schd_amt2_NX(info);
		else if (nx == columnRslt_pay_mtd_cd2) doRslt_pay_mtd_cd2_NX(info);
		else if (nx == columnRslt_pay_mtd_nm2) doRslt_pay_mtd_nm2_NX(info);
		else if (nx == columnRslt_pay_schd_dt3) doRslt_pay_schd_dt3_NX(info);
		else if (nx == columnRslt_pay_schd_amt3) doRslt_pay_schd_amt3_NX(info);
		else if (nx == columnRslt_pay_mtd_cd3) doRslt_pay_mtd_cd3_NX(info);
		else if (nx == columnRslt_pay_mtd_nm3) doRslt_pay_mtd_nm3_NX(info);
		else if (nx == columnRslt_pay_schd_dt4) doRslt_pay_schd_dt4_NX(info);
		else if (nx == columnRslt_pay_schd_amt4) doRslt_pay_schd_amt4_NX(info);
		else if (nx == columnRslt_pay_mtd_cd4) doRslt_pay_mtd_cd4_NX(info);
		else if (nx == columnRslt_pay_mtd_nm4) doRslt_pay_mtd_nm4_NX(info);
		else if (nx == columnRslt_pay_schd_dt5) doRslt_pay_schd_dt5_NX(info);
		else if (nx == columnRslt_pay_schd_amt5) doRslt_pay_schd_amt5_NX(info);
		else if (nx == columnRslt_pay_mtd_cd5) doRslt_pay_mtd_cd5_NX(info);
		else if (nx == columnRslt_pay_mtd_nm5) doRslt_pay_mtd_nm5_NX(info);
		else if (nx == columnRslt_pay_schd_dt6) doRslt_pay_schd_dt6_NX(info);
		else if (nx == columnRslt_pay_schd_amt6) doRslt_pay_schd_amt6_NX(info);
		else if (nx == columnRslt_pay_mtd_cd6) doRslt_pay_mtd_cd6_NX(info);
		else if (nx == columnRslt_pay_mtd_nm6) doRslt_pay_mtd_nm6_NX(info);
		else if (nx == columnRslt_pay_schd_dt7) doRslt_pay_schd_dt7_NX(info);
		else if (nx == columnRslt_pay_schd_amt7) doRslt_pay_schd_amt7_NX(info);
		else if (nx == columnRslt_pay_mtd_cd7) doRslt_pay_mtd_cd7_NX(info);
		else if (nx == columnRslt_pay_mtd_nm7) doRslt_pay_mtd_nm7_NX(info);
		else if (nx == columnRslt_pay_schd_dt8) doRslt_pay_schd_dt8_NX(info);
		else if (nx == columnRslt_pay_schd_amt8) doRslt_pay_schd_amt8_NX(info);
		else if (nx == columnRslt_pay_mtd_cd8) doRslt_pay_mtd_cd8_NX(info);
		else if (nx == columnRslt_pay_mtd_nm8) doRslt_pay_mtd_nm8_NX(info);
		else if (nx == columnRslt_pay_schd_dt9) doRslt_pay_schd_dt9_NX(info);
		else if (nx == columnRslt_pay_schd_amt9) doRslt_pay_schd_amt9_NX(info);
		else if (nx == columnRslt_pay_mtd_cd9) doRslt_pay_mtd_cd9_NX(info);
		else if (nx == columnRslt_pay_mtd_nm9) doRslt_pay_mtd_nm9_NX(info);
		else if (nx == columnRslt_pay_schd_dt10) doRslt_pay_schd_dt10_NX(info);
		else if (nx == columnRslt_pay_schd_amt10) doRslt_pay_schd_amt10_NX(info);
		else if (nx == columnRslt_pay_mtd_cd10) doRslt_pay_mtd_cd10_NX(info);
		else if (nx == columnRslt_pay_mtd_nm10) doRslt_pay_mtd_nm10_NX(info);
		else if (nx == columnRslt_bill_bcst_nm) doRslt_bill_bcst_nm_NX(info);
		else if (nx == columnRslt_bill_ein) doRslt_bill_ein_NX(info);
		else if (nx == columnRslt_bill_biz_co_no) doRslt_bill_biz_co_no_NX(info);
		else if (nx == columnRslt_bill_zip_cd) doRslt_bill_zip_cd_NX(info);
		else if (nx == columnRslt_bill_addr1) doRslt_bill_addr1_NX(info);
		else if (nx == columnRslt_bill_addr2) doRslt_bill_addr2_NX(info);
		else if (nx == columnRslt_bill_addr3) doRslt_bill_addr3_NX(info);
		else if (nx == columnRslt_bill_addr4) doRslt_bill_addr4_NX(info);
		else if (nx == columnRslt_bill_bcst_dpt) doRslt_bill_bcst_dpt_NX(info);
		else if (nx == columnRslt_bill_tel) doRslt_bill_tel_NX(info);
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
	 * [Cnd]パネルの[bill_cl_dt_from]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_dt_from_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rcpt_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_src_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_src_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_src_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_src_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_from]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_from_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_bill_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_rcpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_rcpt_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_src_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_ein]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_ein_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_biz_co_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_biz_co_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_tel_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_bill_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_bill_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bfw_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bfw_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_holder_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder_sub]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_holder_sub_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_amt_bal]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_amt_bal_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_setoff_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_setoff_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_setoff_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_setoff_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_ein]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_ein_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_biz_co_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_biz_co_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_bcst_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_bcst_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_tel_NX(MCEventInfo info){
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
		if (lc == Cnd_bill_cl_dt_from) doCnd_bill_cl_dt_from_LC(info);
		else if (lc == Cnd_bill_cl_dt_to) doCnd_bill_cl_dt_to_LC(info);
		else if (lc == Cnd_bill_rcpt_no) doCnd_bill_rcpt_no_LC(info);
		else if (lc == Cnd_bill_no) doCnd_bill_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_bill_src_cd) doCnd_bill_src_cd_LC(info);
		else if (lc == Cnd_bill_src_nm) doCnd_bill_src_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_pay_schd_dt_from) doCnd_pay_schd_dt_from_LC(info);
		else if (lc == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_LC(info);
		else if (lc == columnRslt_bill_rcpt_no) doRslt_bill_rcpt_no_LC(info);
		else if (lc == columnRslt_bill_cl_dt) doRslt_bill_cl_dt_LC(info);
		else if (lc == columnRslt_bill_dt) doRslt_bill_dt_LC(info);
		else if (lc == columnRslt_bill_no) doRslt_bill_no_LC(info);
		else if (lc == columnRslt_pre_bill_no) doRslt_pre_bill_no_LC(info);
		else if (lc == columnRslt_pre_bill_dt) doRslt_pre_bill_dt_LC(info);
		else if (lc == columnRslt_bill_st_dt) doRslt_bill_st_dt_LC(info);
		else if (lc == columnRslt_bill_end_dt) doRslt_bill_end_dt_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_wrk_no) doRslt_wrk_no_LC(info);
		else if (lc == columnRslt_wrk_nm) doRslt_wrk_nm_LC(info);
		else if (lc == columnRslt_bill_src_cd) doRslt_bill_src_cd_LC(info);
		else if (lc == columnRslt_bill_src_nm) doRslt_bill_src_nm_LC(info);
		else if (lc == columnRslt_bill_src_ein) doRslt_bill_src_ein_LC(info);
		else if (lc == columnRslt_bill_src_biz_co_no) doRslt_bill_src_biz_co_no_LC(info);
		else if (lc == columnRslt_bill_src_zip_cd) doRslt_bill_src_zip_cd_LC(info);
		else if (lc == columnRslt_bill_src_addr1) doRslt_bill_src_addr1_LC(info);
		else if (lc == columnRslt_bill_src_addr2) doRslt_bill_src_addr2_LC(info);
		else if (lc == columnRslt_bill_src_addr3) doRslt_bill_src_addr3_LC(info);
		else if (lc == columnRslt_bill_src_addr4) doRslt_bill_src_addr4_LC(info);
		else if (lc == columnRslt_bill_src_dpt) doRslt_bill_src_dpt_LC(info);
		else if (lc == columnRslt_bill_src_tel) doRslt_bill_src_tel_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_bill_xrate) doRslt_bill_xrate_LC(info);
		else if (lc == columnRslt_last_bill_amt) doRslt_last_bill_amt_LC(info);
		else if (lc == columnRslt_rcv_amt) doRslt_rcv_amt_LC(info);
		else if (lc == columnRslt_sw_amt) doRslt_sw_amt_LC(info);
		else if (lc == columnRslt_bfw_amt) doRslt_bfw_amt_LC(info);
		else if (lc == columnRslt_sls_amt) doRslt_sls_amt_LC(info);
		else if (lc == columnRslt_dscnt_amt) doRslt_dscnt_amt_LC(info);
		else if (lc == columnRslt_ret_amt) doRslt_ret_amt_LC(info);
		else if (lc == columnRslt_setoff_amt) doRslt_setoff_amt_LC(info);
		else if (lc == columnRslt_tax_amt) doRslt_tax_amt_LC(info);
		else if (lc == columnRslt_sw_to_amt) doRslt_sw_to_amt_LC(info);
		else if (lc == columnRslt_bill_amt) doRslt_bill_amt_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_bank_ac_no) doRslt_bank_ac_no_LC(info);
		else if (lc == columnRslt_bank_ac_typ) doRslt_bank_ac_typ_LC(info);
		else if (lc == columnRslt_bank_ac_holder) doRslt_bank_ac_holder_LC(info);
		else if (lc == columnRslt_bank_ac_holder_sub) doRslt_bank_ac_holder_sub_LC(info);
		else if (lc == columnRslt_bank_cd) doRslt_bank_cd_LC(info);
		else if (lc == columnRslt_bank_nm) doRslt_bank_nm_LC(info);
		else if (lc == columnRslt_branch_cd) doRslt_branch_cd_LC(info);
		else if (lc == columnRslt_branch_nm) doRslt_branch_nm_LC(info);
		else if (lc == columnRslt_tax_rate1) doRslt_tax_rate1_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt1) doRslt_tax_rate_sls_amt1_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt1) doRslt_tax_rate_tax_amt1_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt1) doRslt_tax_rate_base_tax_amt1_LC(info);
		else if (lc == columnRslt_tax_rate2) doRslt_tax_rate2_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt2) doRslt_tax_rate_sls_amt2_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt2) doRslt_tax_rate_tax_amt2_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt2) doRslt_tax_rate_base_tax_amt2_LC(info);
		else if (lc == columnRslt_tax_rate3) doRslt_tax_rate3_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt3) doRslt_tax_rate_sls_amt3_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt3) doRslt_tax_rate_tax_amt3_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt3) doRslt_tax_rate_base_tax_amt3_LC(info);
		else if (lc == columnRslt_tax_rate4) doRslt_tax_rate4_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt4) doRslt_tax_rate_sls_amt4_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt4) doRslt_tax_rate_tax_amt4_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt4) doRslt_tax_rate_base_tax_amt4_LC(info);
		else if (lc == columnRslt_tax_rate5) doRslt_tax_rate5_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt5) doRslt_tax_rate_sls_amt5_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt5) doRslt_tax_rate_tax_amt5_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt5) doRslt_tax_rate_base_tax_amt5_LC(info);
		else if (lc == columnRslt_tax_rate6) doRslt_tax_rate6_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt6) doRslt_tax_rate_sls_amt6_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt6) doRslt_tax_rate_tax_amt6_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt6) doRslt_tax_rate_base_tax_amt6_LC(info);
		else if (lc == columnRslt_tax_rate7) doRslt_tax_rate7_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt7) doRslt_tax_rate_sls_amt7_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt7) doRslt_tax_rate_tax_amt7_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt7) doRslt_tax_rate_base_tax_amt7_LC(info);
		else if (lc == columnRslt_tax_rate8) doRslt_tax_rate8_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt8) doRslt_tax_rate_sls_amt8_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt8) doRslt_tax_rate_tax_amt8_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt8) doRslt_tax_rate_base_tax_amt8_LC(info);
		else if (lc == columnRslt_tax_rate9) doRslt_tax_rate9_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt9) doRslt_tax_rate_sls_amt9_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt9) doRslt_tax_rate_tax_amt9_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt9) doRslt_tax_rate_base_tax_amt9_LC(info);
		else if (lc == columnRslt_tax_rate10) doRslt_tax_rate10_LC(info);
		else if (lc == columnRslt_tax_rate_sls_amt10) doRslt_tax_rate_sls_amt10_LC(info);
		else if (lc == columnRslt_tax_rate_tax_amt10) doRslt_tax_rate_tax_amt10_LC(info);
		else if (lc == columnRslt_tax_rate_base_tax_amt10) doRslt_tax_rate_base_tax_amt10_LC(info);
		else if (lc == columnRslt_adv_amt_bal) doRslt_adv_amt_bal_LC(info);
		else if (lc == columnRslt_adv_amt) doRslt_adv_amt_LC(info);
		else if (lc == columnRslt_adv_setoff_amt) doRslt_adv_setoff_amt_LC(info);
		else if (lc == columnRslt_adv_setoff_tax_amt) doRslt_adv_setoff_tax_amt_LC(info);
		else if (lc == columnRslt_pay_schd_dt1) doRslt_pay_schd_dt1_LC(info);
		else if (lc == columnRslt_pay_schd_amt1) doRslt_pay_schd_amt1_LC(info);
		else if (lc == columnRslt_pay_mtd_cd1) doRslt_pay_mtd_cd1_LC(info);
		else if (lc == columnRslt_pay_mtd_nm1) doRslt_pay_mtd_nm1_LC(info);
		else if (lc == columnRslt_pay_schd_dt2) doRslt_pay_schd_dt2_LC(info);
		else if (lc == columnRslt_pay_schd_amt2) doRslt_pay_schd_amt2_LC(info);
		else if (lc == columnRslt_pay_mtd_cd2) doRslt_pay_mtd_cd2_LC(info);
		else if (lc == columnRslt_pay_mtd_nm2) doRslt_pay_mtd_nm2_LC(info);
		else if (lc == columnRslt_pay_schd_dt3) doRslt_pay_schd_dt3_LC(info);
		else if (lc == columnRslt_pay_schd_amt3) doRslt_pay_schd_amt3_LC(info);
		else if (lc == columnRslt_pay_mtd_cd3) doRslt_pay_mtd_cd3_LC(info);
		else if (lc == columnRslt_pay_mtd_nm3) doRslt_pay_mtd_nm3_LC(info);
		else if (lc == columnRslt_pay_schd_dt4) doRslt_pay_schd_dt4_LC(info);
		else if (lc == columnRslt_pay_schd_amt4) doRslt_pay_schd_amt4_LC(info);
		else if (lc == columnRslt_pay_mtd_cd4) doRslt_pay_mtd_cd4_LC(info);
		else if (lc == columnRslt_pay_mtd_nm4) doRslt_pay_mtd_nm4_LC(info);
		else if (lc == columnRslt_pay_schd_dt5) doRslt_pay_schd_dt5_LC(info);
		else if (lc == columnRslt_pay_schd_amt5) doRslt_pay_schd_amt5_LC(info);
		else if (lc == columnRslt_pay_mtd_cd5) doRslt_pay_mtd_cd5_LC(info);
		else if (lc == columnRslt_pay_mtd_nm5) doRslt_pay_mtd_nm5_LC(info);
		else if (lc == columnRslt_pay_schd_dt6) doRslt_pay_schd_dt6_LC(info);
		else if (lc == columnRslt_pay_schd_amt6) doRslt_pay_schd_amt6_LC(info);
		else if (lc == columnRslt_pay_mtd_cd6) doRslt_pay_mtd_cd6_LC(info);
		else if (lc == columnRslt_pay_mtd_nm6) doRslt_pay_mtd_nm6_LC(info);
		else if (lc == columnRslt_pay_schd_dt7) doRslt_pay_schd_dt7_LC(info);
		else if (lc == columnRslt_pay_schd_amt7) doRslt_pay_schd_amt7_LC(info);
		else if (lc == columnRslt_pay_mtd_cd7) doRslt_pay_mtd_cd7_LC(info);
		else if (lc == columnRslt_pay_mtd_nm7) doRslt_pay_mtd_nm7_LC(info);
		else if (lc == columnRslt_pay_schd_dt8) doRslt_pay_schd_dt8_LC(info);
		else if (lc == columnRslt_pay_schd_amt8) doRslt_pay_schd_amt8_LC(info);
		else if (lc == columnRslt_pay_mtd_cd8) doRslt_pay_mtd_cd8_LC(info);
		else if (lc == columnRslt_pay_mtd_nm8) doRslt_pay_mtd_nm8_LC(info);
		else if (lc == columnRslt_pay_schd_dt9) doRslt_pay_schd_dt9_LC(info);
		else if (lc == columnRslt_pay_schd_amt9) doRslt_pay_schd_amt9_LC(info);
		else if (lc == columnRslt_pay_mtd_cd9) doRslt_pay_mtd_cd9_LC(info);
		else if (lc == columnRslt_pay_mtd_nm9) doRslt_pay_mtd_nm9_LC(info);
		else if (lc == columnRslt_pay_schd_dt10) doRslt_pay_schd_dt10_LC(info);
		else if (lc == columnRslt_pay_schd_amt10) doRslt_pay_schd_amt10_LC(info);
		else if (lc == columnRslt_pay_mtd_cd10) doRslt_pay_mtd_cd10_LC(info);
		else if (lc == columnRslt_pay_mtd_nm10) doRslt_pay_mtd_nm10_LC(info);
		else if (lc == columnRslt_bill_bcst_nm) doRslt_bill_bcst_nm_LC(info);
		else if (lc == columnRslt_bill_ein) doRslt_bill_ein_LC(info);
		else if (lc == columnRslt_bill_biz_co_no) doRslt_bill_biz_co_no_LC(info);
		else if (lc == columnRslt_bill_zip_cd) doRslt_bill_zip_cd_LC(info);
		else if (lc == columnRslt_bill_addr1) doRslt_bill_addr1_LC(info);
		else if (lc == columnRslt_bill_addr2) doRslt_bill_addr2_LC(info);
		else if (lc == columnRslt_bill_addr3) doRslt_bill_addr3_LC(info);
		else if (lc == columnRslt_bill_addr4) doRslt_bill_addr4_LC(info);
		else if (lc == columnRslt_bill_bcst_dpt) doRslt_bill_bcst_dpt_LC(info);
		else if (lc == columnRslt_bill_tel) doRslt_bill_tel_LC(info);
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
	 * [Cnd]パネルの[bill_cl_dt_from]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_dt_from_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rcpt_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_src_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_src_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_src_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_src_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_from]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_from_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_rcpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_rcpt_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_src_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_ein]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_ein_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_biz_co_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_biz_co_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_src_tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_src_tel_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_bill_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_bill_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bfw_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bfw_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_holder_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_holder_sub]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_holder_sub_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[branch_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_branch_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_sls_amt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_sls_amt10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_tax_amt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_tax_amt10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate_base_tax_amt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_base_tax_amt10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_amt_bal]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_amt_bal_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_setoff_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_setoff_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_setoff_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_setoff_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_amt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_amt10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_ein]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_ein_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_biz_co_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_biz_co_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_bcst_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_bcst_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_tel_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_bill_src_cd]の作成メソッド
	 */
	public MCList getCnd_bill_src_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0170.Srch01")) {
			return new MS_MSBHL0170_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0170_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0170_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0170_Srch01Bridge() {
			p_MS_MSBHL0170_Srch01 = new MCParam(PDef.MS_MSBHL0170_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0170_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0170.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0170.RsltR.class));

			p_MS_MSBHL0170_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0170_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0170_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0170_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0170_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0170.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0170.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0170.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0170.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0170_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0170.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0170_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0170.RsltR>)p_MS_MSBHL0170_Srch01.getContainerParam().getDownBlock(0));
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