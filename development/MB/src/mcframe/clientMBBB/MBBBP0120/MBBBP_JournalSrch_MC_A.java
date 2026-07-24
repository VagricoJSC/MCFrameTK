package mcframe.clientMBBB.MBBBP0120;

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
import mcframe.clientMBBB.MBBBP0120.MBBBP_JournalSrch_MC.MB_MBBBL0120_Srch01Caller;

/**
 * 画面"MBBBP_JournalSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_JournalSrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBBP0120";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_jnl_grp_no_Label = null;
	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public MCTextComboBox Cnd_jnl_grp_no = null;
	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public MCTextField Cnd_jnl_rmrks = null;
	public MCLabel Cnd_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym = null;
	public MCLabel Cnd_ac_if_typ_Label = null;
	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_if_typ = null;
	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_if_typ_nm = null;
	public MCLabel Cnd_slip_cnt_id_Label = null;
	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public MCTextField Cnd_slip_cnt_id = null;
	public MCLabel Cnd_jnl_no_Label = null;
	/**
	 * Journal slip No. 仕訳伝票ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_jnl_no = null;
	public MCLabel Cnd_ac_cd_Label = null;
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ac_cd = null;
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public MCTextField Cnd_ac_nm = null;
	public MCLabel Cnd_sub_ac_cd_Label = null;
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sub_ac_cd = null;
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public MCTextField Cnd_sub_ac_nm = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Cnd_bp_nm = null;
	public MCLabel Cnd_tax_cd_Label = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCTextField Cnd_tax_nm = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_PPanel;
	public MCLabel Cnd_bp_grp_lab1;	// [Cnd]の[bp_grp.bp_grp_lab1]を[Cnd_bp_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg1;	// [Cnd]の[bp_grp.bp_grp_flg1]を[Cnd_bp_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd1;	// [Cnd]の[bp_grp.bp_grp_cd1]を[Cnd_bp_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm1;	// [Cnd]の[bp_grp.bp_grp_nm1]を[Cnd_bp_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab2;	// [Cnd]の[bp_grp.bp_grp_lab2]を[Cnd_bp_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg2;	// [Cnd]の[bp_grp.bp_grp_flg2]を[Cnd_bp_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd2;	// [Cnd]の[bp_grp.bp_grp_cd2]を[Cnd_bp_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm2;	// [Cnd]の[bp_grp.bp_grp_nm2]を[Cnd_bp_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab3;	// [Cnd]の[bp_grp.bp_grp_lab3]を[Cnd_bp_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg3;	// [Cnd]の[bp_grp.bp_grp_flg3]を[Cnd_bp_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd3;	// [Cnd]の[bp_grp.bp_grp_cd3]を[Cnd_bp_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm3;	// [Cnd]の[bp_grp.bp_grp_nm3]を[Cnd_bp_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab4;	// [Cnd]の[bp_grp.bp_grp_lab4]を[Cnd_bp_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg4;	// [Cnd]の[bp_grp.bp_grp_flg4]を[Cnd_bp_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd4;	// [Cnd]の[bp_grp.bp_grp_cd4]を[Cnd_bp_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm4;	// [Cnd]の[bp_grp.bp_grp_nm4]を[Cnd_bp_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab5;	// [Cnd]の[bp_grp.bp_grp_lab5]を[Cnd_bp_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg5;	// [Cnd]の[bp_grp.bp_grp_flg5]を[Cnd_bp_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd5;	// [Cnd]の[bp_grp.bp_grp_cd5]を[Cnd_bp_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm5;	// [Cnd]の[bp_grp.bp_grp_nm5]を[Cnd_bp_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab6;	// [Cnd]の[bp_grp.bp_grp_lab6]を[Cnd_bp_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg6;	// [Cnd]の[bp_grp.bp_grp_flg6]を[Cnd_bp_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd6;	// [Cnd]の[bp_grp.bp_grp_cd6]を[Cnd_bp_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm6;	// [Cnd]の[bp_grp.bp_grp_nm6]を[Cnd_bp_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab7;	// [Cnd]の[bp_grp.bp_grp_lab7]を[Cnd_bp_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg7;	// [Cnd]の[bp_grp.bp_grp_flg7]を[Cnd_bp_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd7;	// [Cnd]の[bp_grp.bp_grp_cd7]を[Cnd_bp_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm7;	// [Cnd]の[bp_grp.bp_grp_nm7]を[Cnd_bp_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab8;	// [Cnd]の[bp_grp.bp_grp_lab8]を[Cnd_bp_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg8;	// [Cnd]の[bp_grp.bp_grp_flg8]を[Cnd_bp_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd8;	// [Cnd]の[bp_grp.bp_grp_cd8]を[Cnd_bp_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm8;	// [Cnd]の[bp_grp.bp_grp_nm8]を[Cnd_bp_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab9;	// [Cnd]の[bp_grp.bp_grp_lab9]を[Cnd_bp_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg9;	// [Cnd]の[bp_grp.bp_grp_flg9]を[Cnd_bp_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd9;	// [Cnd]の[bp_grp.bp_grp_cd9]を[Cnd_bp_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm9;	// [Cnd]の[bp_grp.bp_grp_nm9]を[Cnd_bp_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab10;	// [Cnd]の[bp_grp.bp_grp_lab10]を[Cnd_bp_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg10;	// [Cnd]の[bp_grp.bp_grp_flg10]を[Cnd_bp_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd10;	// [Cnd]の[bp_grp.bp_grp_cd10]を[Cnd_bp_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm10;	// [Cnd]の[bp_grp.bp_grp_nm10]を[Cnd_bp_grp_nm10]としてエイリアス定義。
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBB.MBBBP0120.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_grp_no = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_if_typ = null;
	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_if_typ_nm = null;
	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_cnt_id = null;
	/**
	 * Journal slip No. 仕訳伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_no = null;
	/**
	 * Journal slip details number 仕訳伝票明細番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_no_seq = null;
	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dc_typ = null;
	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dc_typ_nm = null;
	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_slip_dt = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_no = null;
	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_seq_no = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_cd = null;
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_nm = null;
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_ac_cd = null;
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_ac_nm = null;
	/**
	 * Project cd. プロジェクトＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_project_cd = null;
	/**
	 * Aggregated cd. 0 集計ＣＤ０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_summary_cd0 = null;
	/**
	 * Aggregated cd. 1 集計ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_summary_cd1 = null;
	/**
	 * Aggregated cd. 2 集計ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_summary_cd2 = null;
	/**
	 * Aggregated cd. 3 集計ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_summary_cd3 = null;
	/**
	 * Aggregated cd. 4 集計ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_summary_cd4 = null;
	/**
	 * Aggregated cd. 5 集計ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_summary_cd5 = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_typ = null;
	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_typ_nm = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_qty = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_upri = null;
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_sum_amt = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_tax_amt = null;
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
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_upri = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_sum_amt = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_tax_amt = null;
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
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_upri = null;
	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_sum_amt = null;
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_amt = null;
	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_tax_amt = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_nm = null;
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_typ = null;
	/**
	 * Tax type name 税区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_typ_nm = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_nm = null;
	/**
	 * Foreign currency 外貨.<p>
	 *
	 */
	public MCColumnConfig columnRslt_foreign_flg = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_cd = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_nm = null;
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate = null;
	/**
	 * Taxpaying exchange rate cd. 納税為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate_cd = null;
	/**
	 * Tax exchange rate name 納税為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate_nm = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Billing/payment No. 請求／支払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_no = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * Closing entry type 決算仕訳区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cls_jnl_typ = null;
	/**
	 * Closing entry type name 決算仕訳区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cls_jnl_typ_nm = null;
	/**
	 * Allocation journal 配賦仕訳.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_jnl_flg = null;
	/**
	 * Settlement per transaction 都度精算.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spot_flg = null;
	/**
	 * Scheduled settlement date 決済予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sttl_schd_dt = null;
	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sttl_cd = null;
	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sttl_nm = null;
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_nm = null;
	/**
	 * Counterpart account cd. 相手勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_other_ac_cd = null;
	/**
	 * Counterpart account name 相手勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_other_ac_nm = null;
	/**
	 * Counterpart subsidiary account cd. 相手補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_other_sub_ac_cd = null;
	/**
	 * Counterpart subsidiary account name 相手補助勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_other_sub_ac_nm = null;
	/**
	 * Counterpart dept. cd. 相手部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_other_dpt_cd = null;
	/**
	 * Counterpart dept. name 相手部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_other_dpt_nm = null;
	/**
	 * Abstract 1 摘要１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abstract1 = null;
	/**
	 * Abstract 2 摘要２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abstract2 = null;
	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char4 = null;
	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char5 = null;
	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char6 = null;
	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char7 = null;
	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char8 = null;
	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char9 = null;
	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char10 = null;
	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num1 = null;
	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num2 = null;
	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num3 = null;
	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt1 = null;
	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt2 = null;
	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt3 = null;
	/**
	 * Export 送信.<p>
	 *
	 */
	public MCColumnConfig columnRslt_send_flg = null;
	/**
	 * Journal pattern 仕訳パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_ptn = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
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
	
	/** [MB_MBBBL0120_Srch01]のCallerの作成 */
	protected MBBBP_JournalSrch_MC.MB_MBBBL0120_Srch01Caller createMB_MBBBL0120_Srch01() {
		MBBBP_JournalSrch_MC.MB_MBBBL0120_Srch01Caller<MBBBP_JournalSrch, MB_MBBBL0120_Srch01Bridge>
		caller = ((MBBBP_JournalSrch_MC)this).new MB_MBBBL0120_Srch01Caller<MBBBP_JournalSrch, MB_MBBBL0120_Srch01Bridge>(
					(MBBBP_JournalSrch)this, new MB_MBBBL0120_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBBL0120_Srch01]の呼び出し */
	protected void callMB_MBBBL0120_Srch01() {
		MCCaller caller = createMB_MBBBL0120_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0120.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBB.MBBBP0120.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0120.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0120.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBB.MBBBP0120.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0120.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBB.MBBBP0120.RsltR createRsltR() {
		return mcframe.clientMBBB.MBBBP0120.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0120.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBB.MBBBP0120.RsltR.class);
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
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_JournalSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBBP_JournalSrch_MC_A(String name) {
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
		MBBBP_JournalSrch_MC.jbCreateTop((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbCreateFold((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbCreateTab1((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbCreateTab2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbCreateCnd((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbCreateCnd2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbCreateCtrl((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbCreateRslt((MBBBP_JournalSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBBP_JournalSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBBP_JournalSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MBBBP_JournalSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MBBBP_JournalSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_JournalSrch p) {
		p.Cnd_bp_grp_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bp_grp());
		p.Cnd_bp_grp_PPanel.setName("Cnd.bp_grp");
		p.Cnd_bp_grp_lab1 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bp_grp_lab1.addAliasName("Cnd.bp_grp_lab1", p);
		p.Cnd_bp_grp_flg1 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bp_grp_flg1.addAliasName("Cnd.bp_grp_flg1", p);
		p.Cnd_bp_grp_cd1 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bp_grp_cd1.addAliasName("Cnd.bp_grp_cd1", p);
		p.Cnd_bp_grp_nm1 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bp_grp_nm1.addAliasName("Cnd.bp_grp_nm1", p);
		p.Cnd_bp_grp_lab2 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bp_grp_lab2.addAliasName("Cnd.bp_grp_lab2", p);
		p.Cnd_bp_grp_flg2 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bp_grp_flg2.addAliasName("Cnd.bp_grp_flg2", p);
		p.Cnd_bp_grp_cd2 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bp_grp_cd2.addAliasName("Cnd.bp_grp_cd2", p);
		p.Cnd_bp_grp_nm2 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bp_grp_nm2.addAliasName("Cnd.bp_grp_nm2", p);
		p.Cnd_bp_grp_lab3 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bp_grp_lab3.addAliasName("Cnd.bp_grp_lab3", p);
		p.Cnd_bp_grp_flg3 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bp_grp_flg3.addAliasName("Cnd.bp_grp_flg3", p);
		p.Cnd_bp_grp_cd3 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bp_grp_cd3.addAliasName("Cnd.bp_grp_cd3", p);
		p.Cnd_bp_grp_nm3 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bp_grp_nm3.addAliasName("Cnd.bp_grp_nm3", p);
		p.Cnd_bp_grp_lab4 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bp_grp_lab4.addAliasName("Cnd.bp_grp_lab4", p);
		p.Cnd_bp_grp_flg4 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bp_grp_flg4.addAliasName("Cnd.bp_grp_flg4", p);
		p.Cnd_bp_grp_cd4 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bp_grp_cd4.addAliasName("Cnd.bp_grp_cd4", p);
		p.Cnd_bp_grp_nm4 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bp_grp_nm4.addAliasName("Cnd.bp_grp_nm4", p);
		p.Cnd_bp_grp_lab5 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bp_grp_lab5.addAliasName("Cnd.bp_grp_lab5", p);
		p.Cnd_bp_grp_flg5 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bp_grp_flg5.addAliasName("Cnd.bp_grp_flg5", p);
		p.Cnd_bp_grp_cd5 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bp_grp_cd5.addAliasName("Cnd.bp_grp_cd5", p);
		p.Cnd_bp_grp_nm5 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bp_grp_nm5.addAliasName("Cnd.bp_grp_nm5", p);
		p.Cnd_bp_grp_lab6 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bp_grp_lab6.addAliasName("Cnd.bp_grp_lab6", p);
		p.Cnd_bp_grp_flg6 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bp_grp_flg6.addAliasName("Cnd.bp_grp_flg6", p);
		p.Cnd_bp_grp_cd6 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bp_grp_cd6.addAliasName("Cnd.bp_grp_cd6", p);
		p.Cnd_bp_grp_nm6 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bp_grp_nm6.addAliasName("Cnd.bp_grp_nm6", p);
		p.Cnd_bp_grp_lab7 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bp_grp_lab7.addAliasName("Cnd.bp_grp_lab7", p);
		p.Cnd_bp_grp_flg7 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bp_grp_flg7.addAliasName("Cnd.bp_grp_flg7", p);
		p.Cnd_bp_grp_cd7 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bp_grp_cd7.addAliasName("Cnd.bp_grp_cd7", p);
		p.Cnd_bp_grp_nm7 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bp_grp_nm7.addAliasName("Cnd.bp_grp_nm7", p);
		p.Cnd_bp_grp_lab8 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bp_grp_lab8.addAliasName("Cnd.bp_grp_lab8", p);
		p.Cnd_bp_grp_flg8 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bp_grp_flg8.addAliasName("Cnd.bp_grp_flg8", p);
		p.Cnd_bp_grp_cd8 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bp_grp_cd8.addAliasName("Cnd.bp_grp_cd8", p);
		p.Cnd_bp_grp_nm8 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bp_grp_nm8.addAliasName("Cnd.bp_grp_nm8", p);
		p.Cnd_bp_grp_lab9 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bp_grp_lab9.addAliasName("Cnd.bp_grp_lab9", p);
		p.Cnd_bp_grp_flg9 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bp_grp_flg9.addAliasName("Cnd.bp_grp_flg9", p);
		p.Cnd_bp_grp_cd9 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bp_grp_cd9.addAliasName("Cnd.bp_grp_cd9", p);
		p.Cnd_bp_grp_nm9 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bp_grp_nm9.addAliasName("Cnd.bp_grp_nm9", p);
		p.Cnd_bp_grp_lab10 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bp_grp_lab10.addAliasName("Cnd.bp_grp_lab10", p);
		p.Cnd_bp_grp_flg10 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bp_grp_flg10.addAliasName("Cnd.bp_grp_flg10", p);
		p.Cnd_bp_grp_cd10 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bp_grp_cd10.addAliasName("Cnd.bp_grp_cd10", p);
		p.Cnd_bp_grp_nm10 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bp_grp_nm10.addAliasName("Cnd.bp_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MBBBP_JournalSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBBP_JournalSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBBP_JournalSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMBBB.MBBBP0120.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
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

	
	/** [Cnd_jnl_grp_no_ListPutter]の定義 */
	private MCListPutter Cnd_jnl_grp_no_p = null;

	/**
	 * [Cnd_jnl_grp_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_jnl_grp_no_ListPutter() {
		if (Cnd_jnl_grp_no_p == null) {
			Cnd_jnl_grp_no_p = createCnd_jnl_grp_no_ListPutter(Cnd_jnl_grp_no, "jnl_grp_no", "jnl_rmrks");

		}
		return Cnd_jnl_grp_no_p;
	}
	
	
	/** [Cnd_ac_if_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_if_typ_p = null;

	/**
	 * [Cnd_ac_if_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_if_typ_ListPutter() {
		if (Cnd_ac_if_typ_p == null) {
			Cnd_ac_if_typ_p = createCnd_ac_if_typ_ListPutter(Cnd_ac_if_typ, "ac_if_typ", "ac_if_typ_nm");

		}
		return Cnd_ac_if_typ_p;
	}
	
	
	/** [Cnd_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ac_cd_p = null;

	/**
	 * [Cnd_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_cd_ListPutter() {
		if (Cnd_ac_cd_p == null) {
			Cnd_ac_cd_p = createCnd_ac_cd_ListPutter(Cnd_ac_cd, "ac_cd", "ac_nm");

		}
		return Cnd_ac_cd_p;
	}
	
	
	/** [Cnd_sub_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sub_ac_cd_p = null;

	/**
	 * [Cnd_sub_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sub_ac_cd_ListPutter() {
		if (Cnd_sub_ac_cd_p == null) {
			Cnd_sub_ac_cd_p = createCnd_sub_ac_cd_ListPutter(Cnd_sub_ac_cd, "sub_ac_cd", "sub_ac_nm");

		}
		return Cnd_sub_ac_cd_p;
	}
	
	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
	}
	
	
	/** [Cnd_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bp_cd_p = null;

	/**
	 * [Cnd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_cd_ListPutter() {
		if (Cnd_bp_cd_p == null) {
			Cnd_bp_cd_p = createCnd_bp_cd_ListPutter(Cnd_bp_cd, "bp_cd", "bp_nm");

		}
		return Cnd_bp_cd_p;
	}
	
	
	/** [Cnd_tax_cd_ListPutter]の定義 */
	private MCListPutter Cnd_tax_cd_p = null;

	/**
	 * [Cnd_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tax_cd_ListPutter() {
		if (Cnd_tax_cd_p == null) {
			Cnd_tax_cd_p = createCnd_tax_cd_ListPutter(Cnd_tax_cd, "tax_cd", "tax_nm");

		}
		return Cnd_tax_cd_p;
	}
	
	
	/** [Rslt_xrate_cd_ListPutter]の定義 */
	private MCListPutter Rslt_xrate_cd_p = null;

	/**
	 * [Rslt_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_xrate_cd_ListPutter() {
		if (Rslt_xrate_cd_p == null) {
			Rslt_xrate_cd_p = createRslt_xrate_cd_ListPutter(columnRslt_xrate_cd, "xrate_cd");

		}
		return Rslt_xrate_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_JournalSrch create(){
		MBBBP_JournalSrch p = new MBBBP_JournalSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_JournalSrch create(String name){
		MBBBP_JournalSrch p = new MBBBP_JournalSrch(name);
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
		MBBBP_JournalSrch_MC.jbfInitTop((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbfInitFold((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbfInitTab1((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbfInitTab2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbfInitCnd((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbfInitCnd2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbfInitCtrl((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbfInitRslt((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbInitTop((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbInitFold((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbInitTab1((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbInitTab2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbInitCnd((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbInitCnd2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbInitCtrl((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.jbInitRslt((MBBBP_JournalSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBBP_JournalSrch p) {
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
	protected static void jbfInitTab1(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_jnl_grp_no_Label = p.beansFactory.createLabel("Cnd.jnl_grp_no_Label");
		p.Cnd_jnl_grp_no = p.beansFactory.createTextComboBox("Cnd.jnl_grp_no");
		p.Cnd_jnl_grp_no.setLabel(p.Cnd_jnl_grp_no_Label);
		p.Cnd_jnl_rmrks = p.beansFactory.createTextField("Cnd.jnl_rmrks");
		p.Cnd_ac_ym_Label = p.beansFactory.createLabel("Cnd.ac_ym_Label");
		p.Cnd_ac_ym = p.beansFactory.createDateField("Cnd.ac_ym");
		p.Cnd_ac_ym.setLabel(p.Cnd_ac_ym_Label);
		p.Cnd_ac_if_typ_Label = p.beansFactory.createLabel("Cnd.ac_if_typ_Label");
		p.Cnd_ac_if_typ = p.beansFactory.createTextComboBox("Cnd.ac_if_typ");
		p.Cnd_ac_if_typ.setLabel(p.Cnd_ac_if_typ_Label);
		p.Cnd_ac_if_typ_nm = p.beansFactory.createTextField("Cnd.ac_if_typ_nm");
		p.Cnd_slip_cnt_id_Label = p.beansFactory.createLabel("Cnd.slip_cnt_id_Label");
		p.Cnd_slip_cnt_id = p.beansFactory.createTextField("Cnd.slip_cnt_id");
		p.Cnd_slip_cnt_id.setLabel(p.Cnd_slip_cnt_id_Label);
		p.Cnd_jnl_no_Label = p.beansFactory.createLabel("Cnd.jnl_no_Label");
		p.Cnd_jnl_no = p.beansFactory.createTextField("Cnd.jnl_no");
		p.Cnd_jnl_no.setLabel(p.Cnd_jnl_no_Label);
		p.Cnd_ac_cd_Label = p.beansFactory.createLabel("Cnd.ac_cd_Label");
		p.Cnd_ac_cd = p.beansFactory.createTextField("Cnd.ac_cd");
		p.Cnd_ac_cd.setLabel(p.Cnd_ac_cd_Label);
		p.Cnd_ac_nm = p.beansFactory.createTextField("Cnd.ac_nm");
		p.Cnd_sub_ac_cd_Label = p.beansFactory.createLabel("Cnd.sub_ac_cd_Label");
		p.Cnd_sub_ac_cd = p.beansFactory.createTextComboBox("Cnd.sub_ac_cd");
		p.Cnd_sub_ac_cd.setLabel(p.Cnd_sub_ac_cd_Label);
		p.Cnd_sub_ac_nm = p.beansFactory.createTextField("Cnd.sub_ac_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_tax_cd_Label = p.beansFactory.createLabel("Cnd.tax_cd_Label");
		p.Cnd_tax_cd = p.beansFactory.createTextComboBox("Cnd.tax_cd");
		p.Cnd_tax_cd.setLabel(p.Cnd_tax_cd_Label);
		p.Cnd_tax_nm = p.beansFactory.createTextField("Cnd.tax_nm");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_jnl_grp_no = p.beansFactory.createTableColumn("Rslt.jnl_grp_no", MCColumnType.TEXT);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_if_typ = p.beansFactory.createTableColumn("Rslt.ac_if_typ", MCColumnType.TEXT);
		p.columnRslt_ac_if_typ_nm = p.beansFactory.createTableColumn("Rslt.ac_if_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slip_cnt_id = p.beansFactory.createTableColumn("Rslt.slip_cnt_id", MCColumnType.TEXT);
		p.columnRslt_jnl_no = p.beansFactory.createTableColumn("Rslt.jnl_no", MCColumnType.TEXT);
		p.columnRslt_jnl_no_seq = p.beansFactory.createTableColumn("Rslt.jnl_no_seq", MCColumnType.NUMBER);
		p.columnRslt_dc_typ = p.beansFactory.createTableColumn("Rslt.dc_typ", MCColumnType.TEXT);
		p.columnRslt_dc_typ_nm = p.beansFactory.createTableColumn("Rslt.dc_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ac_slip_dt = p.beansFactory.createTableColumn("Rslt.ac_slip_dt", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_slip_no = p.beansFactory.createTableColumn("Rslt.slip_no", MCColumnType.TEXT);
		p.columnRslt_slip_seq_no = p.beansFactory.createTableColumn("Rslt.slip_seq_no", MCColumnType.NUMBER);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ac_cd = p.beansFactory.createTableColumn("Rslt.ac_cd", MCColumnType.TEXT);
		p.columnRslt_ac_nm = p.beansFactory.createTableColumn("Rslt.ac_nm", MCColumnType.TEXT);
		p.columnRslt_sub_ac_cd = p.beansFactory.createTableColumn("Rslt.sub_ac_cd", MCColumnType.TEXT);
		p.columnRslt_sub_ac_nm = p.beansFactory.createTableColumn("Rslt.sub_ac_nm", MCColumnType.TEXT);
		p.columnRslt_project_cd = p.beansFactory.createTableColumn("Rslt.project_cd", MCColumnType.TEXT);
		p.columnRslt_summary_cd0 = p.beansFactory.createTableColumn("Rslt.summary_cd0", MCColumnType.TEXT);
		p.columnRslt_summary_cd1 = p.beansFactory.createTableColumn("Rslt.summary_cd1", MCColumnType.TEXT);
		p.columnRslt_summary_cd2 = p.beansFactory.createTableColumn("Rslt.summary_cd2", MCColumnType.TEXT);
		p.columnRslt_summary_cd3 = p.beansFactory.createTableColumn("Rslt.summary_cd3", MCColumnType.TEXT);
		p.columnRslt_summary_cd4 = p.beansFactory.createTableColumn("Rslt.summary_cd4", MCColumnType.TEXT);
		p.columnRslt_summary_cd5 = p.beansFactory.createTableColumn("Rslt.summary_cd5", MCColumnType.TEXT);
		p.columnRslt_bp_typ = p.beansFactory.createTableColumn("Rslt.bp_typ", MCColumnType.TEXT);
		p.columnRslt_bp_typ_nm = p.beansFactory.createTableColumn("Rslt.bp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_qty = p.beansFactory.createTableColumn("Rslt.base_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_upri = p.beansFactory.createTableColumn("Rslt.base_cur_upri", MCColumnType.NUMBER);
		p.columnRslt_base_cur_sum_amt = p.beansFactory.createTableColumn("Rslt.base_cur_sum_amt", MCColumnType.NUMBER);
		p.columnRslt_base_cur_amt = p.beansFactory.createTableColumn("Rslt.base_cur_amt", MCColumnType.NUMBER);
		p.columnRslt_base_cur_tax_amt = p.beansFactory.createTableColumn("Rslt.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_upri = p.beansFactory.createTableColumn("Rslt.trd_cur_upri", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_sum_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_sum_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_tax_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_upri = p.beansFactory.createTableColumn("Rslt.ptax_cur_upri", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_sum_amt = p.beansFactory.createTableColumn("Rslt.ptax_cur_sum_amt", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_amt = p.beansFactory.createTableColumn("Rslt.ptax_cur_amt", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_tax_amt = p.beansFactory.createTableColumn("Rslt.ptax_cur_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_tax_typ = p.beansFactory.createTableColumn("Rslt.tax_typ", MCColumnType.TEXT);
		p.columnRslt_tax_typ_nm = p.beansFactory.createTableColumn("Rslt.tax_typ_nm", MCColumnType.TEXT);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_foreign_flg = p.beansFactory.createTableColumn("Rslt.foreign_flg", MCColumnType.CHECK);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_xrate_cd = p.beansFactory.createTableColumn("Rslt.xrate_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_xrate_nm = p.beansFactory.createTableColumn("Rslt.xrate_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_xrate = p.beansFactory.createTableColumn("Rslt.ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate_cd = p.beansFactory.createTableColumn("Rslt.ptax_xrate_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_xrate_nm = p.beansFactory.createTableColumn("Rslt.ptax_xrate_nm", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_bill_no = p.beansFactory.createTableColumn("Rslt.bill_no", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_cls_jnl_typ = p.beansFactory.createTableColumn("Rslt.cls_jnl_typ", MCColumnType.TEXT);
		p.columnRslt_cls_jnl_typ_nm = p.beansFactory.createTableColumn("Rslt.cls_jnl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_jnl_flg = p.beansFactory.createTableColumn("Rslt.alloc_jnl_flg", MCColumnType.CHECK);
		p.columnRslt_spot_flg = p.beansFactory.createTableColumn("Rslt.spot_flg", MCColumnType.CHECK);
		p.columnRslt_sttl_schd_dt = p.beansFactory.createTableColumn("Rslt.sttl_schd_dt", MCColumnType.DATE);
		p.columnRslt_sttl_cd = p.beansFactory.createTableColumn("Rslt.sttl_cd", MCColumnType.TEXT);
		p.columnRslt_sttl_nm = p.beansFactory.createTableColumn("Rslt.sttl_nm", MCColumnType.TEXT);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_other_ac_cd = p.beansFactory.createTableColumn("Rslt.other_ac_cd", MCColumnType.TEXT);
		p.columnRslt_other_ac_nm = p.beansFactory.createTableColumn("Rslt.other_ac_nm", MCColumnType.TEXT);
		p.columnRslt_other_sub_ac_cd = p.beansFactory.createTableColumn("Rslt.other_sub_ac_cd", MCColumnType.TEXT);
		p.columnRslt_other_sub_ac_nm = p.beansFactory.createTableColumn("Rslt.other_sub_ac_nm", MCColumnType.TEXT);
		p.columnRslt_other_dpt_cd = p.beansFactory.createTableColumn("Rslt.other_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_other_dpt_nm = p.beansFactory.createTableColumn("Rslt.other_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_abstract1 = p.beansFactory.createTableColumn("Rslt.abstract1", MCColumnType.TEXT);
		p.columnRslt_abstract2 = p.beansFactory.createTableColumn("Rslt.abstract2", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_sub_char4 = p.beansFactory.createTableColumn("Rslt.sub_char4", MCColumnType.TEXT);
		p.columnRslt_sub_char5 = p.beansFactory.createTableColumn("Rslt.sub_char5", MCColumnType.TEXT);
		p.columnRslt_sub_char6 = p.beansFactory.createTableColumn("Rslt.sub_char6", MCColumnType.TEXT);
		p.columnRslt_sub_char7 = p.beansFactory.createTableColumn("Rslt.sub_char7", MCColumnType.TEXT);
		p.columnRslt_sub_char8 = p.beansFactory.createTableColumn("Rslt.sub_char8", MCColumnType.TEXT);
		p.columnRslt_sub_char9 = p.beansFactory.createTableColumn("Rslt.sub_char9", MCColumnType.TEXT);
		p.columnRslt_sub_char10 = p.beansFactory.createTableColumn("Rslt.sub_char10", MCColumnType.TEXT);
		p.columnRslt_sub_num1 = p.beansFactory.createTableColumn("Rslt.sub_num1", MCColumnType.NUMBER);
		p.columnRslt_sub_num2 = p.beansFactory.createTableColumn("Rslt.sub_num2", MCColumnType.NUMBER);
		p.columnRslt_sub_num3 = p.beansFactory.createTableColumn("Rslt.sub_num3", MCColumnType.NUMBER);
		p.columnRslt_sub_dt1 = p.beansFactory.createTableColumn("Rslt.sub_dt1", MCColumnType.DATE);
		p.columnRslt_sub_dt2 = p.beansFactory.createTableColumn("Rslt.sub_dt2", MCColumnType.DATE);
		p.columnRslt_sub_dt3 = p.beansFactory.createTableColumn("Rslt.sub_dt3", MCColumnType.DATE);
		p.columnRslt_send_flg = p.beansFactory.createTableColumn("Rslt.send_flg", MCColumnType.CHECK);
		p.columnRslt_jnl_ptn = p.beansFactory.createTableColumn("Rslt.jnl_ptn", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setValueCheck(false);
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
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MBBBP_JournalSrch p) {
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
	protected static void jbInitTab1(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_jnl_grp_no.setListType(MCListType.STRICT);
		p.Cnd_jnl_grp_no.setLinkBeans(p.Cnd_jnl_rmrks);
		p.CndPanel.add(p.Cnd_jnl_grp_no_Label);
		p.CndPanel.add(p.Cnd_jnl_grp_no);
		p.CndPanel.setLastBeans(p.Cnd_jnl_grp_no);
		p.Cnd_jnl_grp_no.setNextBeans(p.Cnd_jnl_rmrks);
		p.Cnd_jnl_grp_no.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.jnl_grp_no_META);
		p.CndPanel.add(p.Cnd_jnl_rmrks);
		p.Cnd_jnl_rmrks.setNextBeans(p.Cnd_ac_ym);
		p.Cnd_jnl_rmrks.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.jnl_rmrks_META);
		p.CndPanel.add(p.Cnd_ac_ym_Label);
		p.CndPanel.add(p.Cnd_ac_ym);
		p.Cnd_ac_ym.setNextBeans(p.Cnd_ac_if_typ);
		p.Cnd_ac_ym.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.ac_ym_META);
		p.Cnd_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_ac_if_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_if_typ, true);
		p.Cnd_ac_if_typ.setLinkBeans(p.Cnd_ac_if_typ_nm);
		p.CndPanel.add(p.Cnd_ac_if_typ_Label);
		p.CndPanel.add(p.Cnd_ac_if_typ);
		p.Cnd_ac_if_typ.setNextBeans(p.Cnd_ac_if_typ_nm);
		p.Cnd_ac_if_typ.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.ac_if_typ_META);
		p.CndPanel.add(p.Cnd_ac_if_typ_nm);
		p.Cnd_ac_if_typ_nm.setNextBeans(p.Cnd_slip_cnt_id);
		p.Cnd_ac_if_typ_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.ac_if_typ_nm_META);
		p.CndPanel.add(p.Cnd_slip_cnt_id_Label);
		p.CndPanel.add(p.Cnd_slip_cnt_id);
		p.Cnd_slip_cnt_id.setNextBeans(p.Cnd_jnl_no);
		p.Cnd_slip_cnt_id.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.slip_cnt_id_META);
		p.setPluralValueEnable(p.Cnd_slip_cnt_id, true);
		p.CndPanel.add(p.Cnd_jnl_no_Label);
		p.CndPanel.add(p.Cnd_jnl_no);
		p.Cnd_jnl_no.setNextBeans(p.Cnd_ac_cd);
		p.Cnd_jnl_no.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.jnl_no_META);
		p.setPluralValueEnable(p.Cnd_jnl_no, true);
		p.CndPanel.add(p.Cnd_ac_cd_Label);
		p.CndPanel.add(p.Cnd_ac_cd);
		p.Cnd_ac_cd.setNextBeans(p.Cnd_ac_nm);
		p.Cnd_ac_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.ac_cd_META);
		p.Cnd_ac_cd.addLinkBeans(p.Cnd_ac_nm);
		p.Cnd_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_cd, true);
		p.CndPanel.add(p.Cnd_ac_nm);
		p.Cnd_ac_nm.setNextBeans(p.Cnd_sub_ac_cd);
		p.Cnd_ac_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.ac_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_nm, true);
		p.Cnd_sub_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sub_ac_cd, true);
		p.Cnd_sub_ac_cd.setLinkBeans(p.Cnd_sub_ac_nm);
		p.CndPanel.add(p.Cnd_sub_ac_cd_Label);
		p.CndPanel.add(p.Cnd_sub_ac_cd);
		p.Cnd_sub_ac_cd.setNextBeans(p.Cnd_sub_ac_nm);
		p.Cnd_sub_ac_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.sub_ac_cd_META);
		p.CndPanel.add(p.Cnd_sub_ac_nm);
		p.Cnd_sub_ac_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_sub_ac_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.sub_ac_nm_META);
		p.setPluralValueEnable(p.Cnd_sub_ac_nm, true);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_tax_cd);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Cnd_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tax_cd, true);
		p.Cnd_tax_cd.setLinkBeans(p.Cnd_tax_nm);
		p.CndPanel.add(p.Cnd_tax_cd_Label);
		p.CndPanel.add(p.Cnd_tax_cd);
		p.Cnd_tax_cd.setNextBeans(p.Cnd_tax_nm);
		p.Cnd_tax_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.tax_cd_META);
		p.CndPanel.add(p.Cnd_tax_nm);
		p.Cnd_tax_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0120.CndR.tax_nm_META);
		p.setPluralValueEnable(p.Cnd_tax_nm, true);
		p.Cnd2Panel.add(p.Cnd_bp_grp_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_bp_grp_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBBP_JournalSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
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
		MBBBP_JournalSrch_MC.mcInitTop((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.mcInitFold((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.mcInitTab1((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.mcInitTab2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.mcInitCnd((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.mcInitCnd2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.mcInitCtrl((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.mcInitRslt((MBBBP_JournalSrch)this);

		// [SRCH]ステータスのモードの設定
		MBBBP_JournalSrch_MC.statusInitSRCH_Top((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitSRCH_Fold((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitSRCH_Tab1((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitSRCH_Tab2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitSRCH_Cnd((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitSRCH_Cnd2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitSRCH_Ctrl((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitSRCH_Rslt((MBBBP_JournalSrch)this);

		// [REF]ステータスのモードの設定
		MBBBP_JournalSrch_MC.statusInitREF_Top((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitREF_Fold((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitREF_Tab1((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitREF_Tab2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitREF_Cnd((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitREF_Cnd2((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitREF_Ctrl((MBBBP_JournalSrch)this);
		MBBBP_JournalSrch_MC.statusInitREF_Rslt((MBBBP_JournalSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBBP_JournalSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBBP_JournalSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MBBBP_JournalSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MBBBP_JournalSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_JournalSrch p) {
		p.Cnd_jnl_grp_no.setListListener(p);
		p.Cnd_jnl_grp_no.addAllListener(p);
		p.Cnd_jnl_rmrks.setListListener(p);
		p.Cnd_jnl_rmrks.addAllListener(p);
		p.Cnd_ac_ym.setListListener(p);
		p.Cnd_ac_ym.addAllListener(p);
		p.Cnd_ac_if_typ.setListListener(p);
		p.Cnd_ac_if_typ.addAllListener(p);
		p.Cnd_ac_if_typ_nm.setListListener(p);
		p.Cnd_ac_if_typ_nm.addAllListener(p);
		p.Cnd_slip_cnt_id.setListListener(p);
		p.Cnd_slip_cnt_id.addAllListener(p);
		p.Cnd_jnl_no.setListListener(p);
		p.Cnd_jnl_no.addAllListener(p);
		p.Cnd_ac_cd.setListListener(p);
		p.Cnd_ac_cd.addAllListener(p);
		p.Cnd_ac_nm.setListListener(p);
		p.Cnd_ac_nm.addAllListener(p);
		p.Cnd_sub_ac_cd.setListListener(p);
		p.Cnd_sub_ac_cd.addAllListener(p);
		p.Cnd_sub_ac_nm.setListListener(p);
		p.Cnd_sub_ac_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_tax_cd.setListListener(p);
		p.Cnd_tax_cd.addAllListener(p);
		p.Cnd_tax_nm.setListListener(p);
		p.Cnd_tax_nm.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MBBBP_JournalSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBBP_JournalSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBBP_JournalSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_jnl_grp_no.addAllListener(p);
		p.columnRslt_jnl_grp_no.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_if_typ.addAllListener(p);
		p.columnRslt_ac_if_typ.setListListener(p);
		p.columnRslt_ac_if_typ_nm.addAllListener(p);
		p.columnRslt_ac_if_typ_nm.setListListener(p);
		p.columnRslt_slip_cnt_id.addAllListener(p);
		p.columnRslt_slip_cnt_id.setListListener(p);
		p.columnRslt_jnl_no.addAllListener(p);
		p.columnRslt_jnl_no.setListListener(p);
		p.columnRslt_jnl_no_seq.addAllListener(p);
		p.columnRslt_jnl_no_seq.setListListener(p);
		p.columnRslt_dc_typ.addAllListener(p);
		p.columnRslt_dc_typ.setListListener(p);
		p.columnRslt_dc_typ_nm.addAllListener(p);
		p.columnRslt_dc_typ_nm.setListListener(p);
		p.columnRslt_ac_slip_dt.addAllListener(p);
		p.columnRslt_ac_slip_dt.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_slip_no.addAllListener(p);
		p.columnRslt_slip_no.setListListener(p);
		p.columnRslt_slip_seq_no.addAllListener(p);
		p.columnRslt_slip_seq_no.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_ac_cd.addAllListener(p);
		p.columnRslt_ac_cd.setListListener(p);
		p.columnRslt_ac_nm.addAllListener(p);
		p.columnRslt_ac_nm.setListListener(p);
		p.columnRslt_sub_ac_cd.addAllListener(p);
		p.columnRslt_sub_ac_cd.setListListener(p);
		p.columnRslt_sub_ac_nm.addAllListener(p);
		p.columnRslt_sub_ac_nm.setListListener(p);
		p.columnRslt_project_cd.addAllListener(p);
		p.columnRslt_project_cd.setListListener(p);
		p.columnRslt_summary_cd0.addAllListener(p);
		p.columnRslt_summary_cd0.setListListener(p);
		p.columnRslt_summary_cd1.addAllListener(p);
		p.columnRslt_summary_cd1.setListListener(p);
		p.columnRslt_summary_cd2.addAllListener(p);
		p.columnRslt_summary_cd2.setListListener(p);
		p.columnRslt_summary_cd3.addAllListener(p);
		p.columnRslt_summary_cd3.setListListener(p);
		p.columnRslt_summary_cd4.addAllListener(p);
		p.columnRslt_summary_cd4.setListListener(p);
		p.columnRslt_summary_cd5.addAllListener(p);
		p.columnRslt_summary_cd5.setListListener(p);
		p.columnRslt_bp_typ.addAllListener(p);
		p.columnRslt_bp_typ.setListListener(p);
		p.columnRslt_bp_typ_nm.addAllListener(p);
		p.columnRslt_bp_typ_nm.setListListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_base_unit_qty.addAllListener(p);
		p.columnRslt_base_unit_qty.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_cur_upri.addAllListener(p);
		p.columnRslt_base_cur_upri.setListListener(p);
		p.columnRslt_base_cur_sum_amt.addAllListener(p);
		p.columnRslt_base_cur_sum_amt.setListListener(p);
		p.columnRslt_base_cur_amt.addAllListener(p);
		p.columnRslt_base_cur_amt.setListListener(p);
		p.columnRslt_base_cur_tax_amt.addAllListener(p);
		p.columnRslt_base_cur_tax_amt.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_upri.addAllListener(p);
		p.columnRslt_trd_cur_upri.setListListener(p);
		p.columnRslt_trd_cur_sum_amt.addAllListener(p);
		p.columnRslt_trd_cur_sum_amt.setListListener(p);
		p.columnRslt_trd_cur_amt.addAllListener(p);
		p.columnRslt_trd_cur_amt.setListListener(p);
		p.columnRslt_trd_cur_tax_amt.addAllListener(p);
		p.columnRslt_trd_cur_tax_amt.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_ptax_cur_upri.addAllListener(p);
		p.columnRslt_ptax_cur_upri.setListListener(p);
		p.columnRslt_ptax_cur_sum_amt.addAllListener(p);
		p.columnRslt_ptax_cur_sum_amt.setListListener(p);
		p.columnRslt_ptax_cur_amt.addAllListener(p);
		p.columnRslt_ptax_cur_amt.setListListener(p);
		p.columnRslt_ptax_cur_tax_amt.addAllListener(p);
		p.columnRslt_ptax_cur_tax_amt.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_ptax_cur_nm.addAllListener(p);
		p.columnRslt_ptax_cur_nm.setListListener(p);
		p.columnRslt_tax_typ.addAllListener(p);
		p.columnRslt_tax_typ.setListListener(p);
		p.columnRslt_tax_typ_nm.addAllListener(p);
		p.columnRslt_tax_typ_nm.setListListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_foreign_flg.addAllListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_xrate_cd.addAllListener(p);
		p.columnRslt_xrate_cd.setListListener(p);
		p.columnRslt_xrate_nm.addAllListener(p);
		p.columnRslt_xrate_nm.setListListener(p);
		p.columnRslt_ptax_xrate.addAllListener(p);
		p.columnRslt_ptax_xrate.setListListener(p);
		p.columnRslt_ptax_xrate_cd.addAllListener(p);
		p.columnRslt_ptax_xrate_cd.setListListener(p);
		p.columnRslt_ptax_xrate_nm.addAllListener(p);
		p.columnRslt_ptax_xrate_nm.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_bill_no.addAllListener(p);
		p.columnRslt_bill_no.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_cls_jnl_typ.addAllListener(p);
		p.columnRslt_cls_jnl_typ.setListListener(p);
		p.columnRslt_cls_jnl_typ_nm.addAllListener(p);
		p.columnRslt_cls_jnl_typ_nm.setListListener(p);
		p.columnRslt_alloc_jnl_flg.addAllListener(p);
		p.columnRslt_spot_flg.addAllListener(p);
		p.columnRslt_sttl_schd_dt.addAllListener(p);
		p.columnRslt_sttl_schd_dt.setListListener(p);
		p.columnRslt_sttl_cd.addAllListener(p);
		p.columnRslt_sttl_cd.setListListener(p);
		p.columnRslt_sttl_nm.addAllListener(p);
		p.columnRslt_sttl_nm.setListListener(p);
		p.columnRslt_bank_ac_cd.addAllListener(p);
		p.columnRslt_bank_ac_cd.setListListener(p);
		p.columnRslt_bank_ac_nm.addAllListener(p);
		p.columnRslt_bank_ac_nm.setListListener(p);
		p.columnRslt_other_ac_cd.addAllListener(p);
		p.columnRslt_other_ac_cd.setListListener(p);
		p.columnRslt_other_ac_nm.addAllListener(p);
		p.columnRslt_other_ac_nm.setListListener(p);
		p.columnRslt_other_sub_ac_cd.addAllListener(p);
		p.columnRslt_other_sub_ac_cd.setListListener(p);
		p.columnRslt_other_sub_ac_nm.addAllListener(p);
		p.columnRslt_other_sub_ac_nm.setListListener(p);
		p.columnRslt_other_dpt_cd.addAllListener(p);
		p.columnRslt_other_dpt_cd.setListListener(p);
		p.columnRslt_other_dpt_nm.addAllListener(p);
		p.columnRslt_other_dpt_nm.setListListener(p);
		p.columnRslt_abstract1.addAllListener(p);
		p.columnRslt_abstract1.setListListener(p);
		p.columnRslt_abstract2.addAllListener(p);
		p.columnRslt_abstract2.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_sub_char4.addAllListener(p);
		p.columnRslt_sub_char4.setListListener(p);
		p.columnRslt_sub_char5.addAllListener(p);
		p.columnRslt_sub_char5.setListListener(p);
		p.columnRslt_sub_char6.addAllListener(p);
		p.columnRslt_sub_char6.setListListener(p);
		p.columnRslt_sub_char7.addAllListener(p);
		p.columnRslt_sub_char7.setListListener(p);
		p.columnRslt_sub_char8.addAllListener(p);
		p.columnRslt_sub_char8.setListListener(p);
		p.columnRslt_sub_char9.addAllListener(p);
		p.columnRslt_sub_char9.setListListener(p);
		p.columnRslt_sub_char10.addAllListener(p);
		p.columnRslt_sub_char10.setListListener(p);
		p.columnRslt_sub_num1.addAllListener(p);
		p.columnRslt_sub_num1.setListListener(p);
		p.columnRslt_sub_num2.addAllListener(p);
		p.columnRslt_sub_num2.setListListener(p);
		p.columnRslt_sub_num3.addAllListener(p);
		p.columnRslt_sub_num3.setListListener(p);
		p.columnRslt_sub_dt1.addAllListener(p);
		p.columnRslt_sub_dt1.setListListener(p);
		p.columnRslt_sub_dt2.addAllListener(p);
		p.columnRslt_sub_dt2.setListListener(p);
		p.columnRslt_sub_dt3.addAllListener(p);
		p.columnRslt_sub_dt3.setListListener(p);
		p.columnRslt_send_flg.addAllListener(p);
		p.columnRslt_jnl_ptn.addAllListener(p);
		p.columnRslt_jnl_ptn.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBBP_JournalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBBP_JournalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MBBBP_JournalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MBBBP_JournalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBBP_JournalSrch p){
		p.Cnd_jnl_grp_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_jnl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_ym.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_if_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_if_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_slip_cnt_id.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_jnl_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MBBBP_JournalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBBP_JournalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBBP_JournalSrch p){
		p.columnRslt_jnl_grp_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_if_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_if_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_no_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slip_seq_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_project_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_summary_cd0.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_summary_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_summary_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_summary_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_summary_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_summary_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_sum_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_sum_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_sum_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cls_jnl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cls_jnl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alloc_jnl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_spot_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sttl_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_other_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_other_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_other_sub_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_other_sub_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_other_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_other_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_abstract1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_abstract2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_send_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBBP_JournalSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBBP_JournalSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MBBBP_JournalSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MBBBP_JournalSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBBP_JournalSrch p){
		p.Cnd_jnl_grp_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_jnl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ac_ym.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_if_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_if_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_slip_cnt_id.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_jnl_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MBBBP_JournalSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBBP_JournalSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBBP_JournalSrch p){
		p.columnRslt_jnl_grp_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_if_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_if_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_no_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_seq_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_project_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_summary_cd0.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_summary_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_summary_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_summary_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_summary_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_summary_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_sum_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_sum_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_sum_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cls_jnl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cls_jnl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_jnl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_spot_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sttl_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_other_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_other_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_other_sub_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_other_sub_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_other_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_other_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_abstract1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_abstract2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_send_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

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
		MBBBP_JournalSrch_MC.setTableConfigRslt((MBBBP_JournalSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBBP_JournalSrch p) {
		p.columnRslt_jnl_grp_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.jnl_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_grp_no);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_if_typ.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ac_if_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_if_typ);
		p.columnRslt_ac_if_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ac_if_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_if_typ_nm);
		p.columnRslt_slip_cnt_id.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.slip_cnt_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_cnt_id);
		p.columnRslt_jnl_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.jnl_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_no);
		p.columnRslt_jnl_no_seq.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.jnl_no_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_no_seq);
		p.columnRslt_dc_typ.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.dc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dc_typ);
		p.columnRslt_dc_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.dc_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dc_typ_nm);
		p.columnRslt_ac_slip_dt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ac_slip_dt_META);
		p.columnRslt_ac_slip_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_slip_dt);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_slip_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_no);
		p.columnRslt_slip_seq_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.slip_seq_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_seq_no);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_cd);
		p.columnRslt_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_nm);
		p.columnRslt_sub_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_ac_cd);
		p.columnRslt_sub_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_ac_nm);
		p.columnRslt_project_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.project_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_project_cd);
		p.columnRslt_summary_cd0.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.summary_cd0_META);
		p.RsltTable.addColumnConfig(p.columnRslt_summary_cd0);
		p.columnRslt_summary_cd1.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.summary_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_summary_cd1);
		p.columnRslt_summary_cd2.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.summary_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_summary_cd2);
		p.columnRslt_summary_cd3.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.summary_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_summary_cd3);
		p.columnRslt_summary_cd4.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.summary_cd4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_summary_cd4);
		p.columnRslt_summary_cd5.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.summary_cd5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_summary_cd5);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_bp_typ.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.bp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_typ);
		p.columnRslt_bp_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.bp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_typ_nm);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_base_unit_qty.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_qty);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_cur_upri.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_cur_upri_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_upri);
		p.columnRslt_base_cur_sum_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_cur_sum_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_sum_amt);
		p.columnRslt_base_cur_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_cur_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt);
		p.columnRslt_base_cur_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_cur_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_tax_amt);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_trd_cur_upri.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.trd_cur_upri_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_upri);
		p.columnRslt_trd_cur_sum_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.trd_cur_sum_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_sum_amt);
		p.columnRslt_trd_cur_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.trd_cur_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt);
		p.columnRslt_trd_cur_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.trd_cur_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_tax_amt);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_ptax_cur_upri.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_cur_upri_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_upri);
		p.columnRslt_ptax_cur_sum_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_cur_sum_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_sum_amt);
		p.columnRslt_ptax_cur_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_cur_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_amt);
		p.columnRslt_ptax_cur_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_cur_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_tax_amt);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_tax_typ.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.tax_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_typ);
		p.columnRslt_tax_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.tax_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_typ_nm);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_foreign_flg.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.foreign_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_foreign_flg);
		p.columnRslt_xrate.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_xrate_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_cd);
		p.columnRslt_xrate_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.xrate_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_nm);
		p.columnRslt_ptax_xrate.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate);
		p.columnRslt_ptax_xrate_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_cd);
		p.columnRslt_ptax_xrate_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ptax_xrate_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_nm);
		p.columnRslt_iv_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_bill_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_no);
		p.columnRslt_slo_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_cls_jnl_typ.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.cls_jnl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cls_jnl_typ);
		p.columnRslt_cls_jnl_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.cls_jnl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cls_jnl_typ_nm);
		p.columnRslt_alloc_jnl_flg.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.alloc_jnl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_jnl_flg);
		p.columnRslt_spot_flg.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.spot_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spot_flg);
		p.columnRslt_sttl_schd_dt.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sttl_schd_dt_META);
		p.columnRslt_sttl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sttl_schd_dt);
		p.columnRslt_sttl_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sttl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sttl_cd);
		p.columnRslt_sttl_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sttl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sttl_nm);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_other_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.other_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_other_ac_cd);
		p.columnRslt_other_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.other_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_other_ac_nm);
		p.columnRslt_other_sub_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.other_sub_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_other_sub_ac_cd);
		p.columnRslt_other_sub_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.other_sub_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_other_sub_ac_nm);
		p.columnRslt_other_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.other_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_other_dpt_cd);
		p.columnRslt_other_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.other_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_other_dpt_nm);
		p.columnRslt_abstract1.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.abstract1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abstract1);
		p.columnRslt_abstract2.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.abstract2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abstract2);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_sub_char4.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char4);
		p.columnRslt_sub_char5.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char5);
		p.columnRslt_sub_char6.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char6);
		p.columnRslt_sub_char7.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char7);
		p.columnRslt_sub_char8.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char8);
		p.columnRslt_sub_char9.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char9);
		p.columnRslt_sub_char10.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_char10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char10);
		p.columnRslt_sub_num1.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_num1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num1);
		p.columnRslt_sub_num2.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_num2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num2);
		p.columnRslt_sub_num3.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_num3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num3);
		p.columnRslt_sub_dt1.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_dt1_META);
		p.columnRslt_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt1);
		p.columnRslt_sub_dt2.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_dt2_META);
		p.columnRslt_sub_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt2);
		p.columnRslt_sub_dt3.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.sub_dt3_META);
		p.columnRslt_sub_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt3);
		p.columnRslt_send_flg.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.send_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_send_flg);
		p.columnRslt_jnl_ptn.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.jnl_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_ptn);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBB.MBBBP0120.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_jnl_grp_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_grp_no.getListConfig().setPutter(getCnd_jnl_grp_no_ListPutter());
		Cnd_ac_if_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_if_typ.getListConfig().setPutter(getCnd_ac_if_typ_ListPutter());
		Cnd_ac_cd.getListConfig().setPutter(getCnd_ac_cd_ListPutter());
		Cnd_sub_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sub_ac_cd.getListConfig().setPutter(getCnd_sub_ac_cd_ListPutter());
		Cnd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tax_cd.getListConfig().setPutter(getCnd_tax_cd_ListPutter());
		columnRslt_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_xrate_cd.getListConfig().setPutter(getRslt_xrate_cd_ListPutter());
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
	 * [Cnd_jnl_grp_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_jnl_grp_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.JnlGrpNo");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_if_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_if_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcIfTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Account");
		return lp;
	}
	 
	/**
	 * [Cnd_sub_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sub_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SubAccount");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcTax");
		return lp;
	}
	 
	/**
	 * [Rslt_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_jnl_grp_no) return getCnd_jnl_grp_no(row, info);
		if(combo == Cnd_ac_if_typ) return getCnd_ac_if_typ(row, info);
		if(combo == Cnd_ac_cd) return getCnd_ac_cd(row, info);
		if(combo == Cnd_sub_ac_cd) return getCnd_sub_ac_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_tax_cd) return getCnd_tax_cd(row, info);
		if(combo == columnRslt_xrate_cd) return getRslt_xrate_cd(row, info);
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
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == Cnd_jnl_grp_no) return doCnd_jnl_grp_no_VC(info);
		if (vc == Cnd_jnl_rmrks) return doCnd_jnl_rmrks_VC(info);
		if (vc == Cnd_ac_ym) return doCnd_ac_ym_VC(info);
		if (vc == Cnd_ac_if_typ) return doCnd_ac_if_typ_VC(info);
		if (vc == Cnd_ac_if_typ_nm) return doCnd_ac_if_typ_nm_VC(info);
		if (vc == Cnd_slip_cnt_id) return doCnd_slip_cnt_id_VC(info);
		if (vc == Cnd_jnl_no) return doCnd_jnl_no_VC(info);
		if (vc == Cnd_ac_cd) return doCnd_ac_cd_VC(info);
		if (vc == Cnd_ac_nm) return doCnd_ac_nm_VC(info);
		if (vc == Cnd_sub_ac_cd) return doCnd_sub_ac_cd_VC(info);
		if (vc == Cnd_sub_ac_nm) return doCnd_sub_ac_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_tax_cd) return doCnd_tax_cd_VC(info);
		if (vc == Cnd_tax_nm) return doCnd_tax_nm_VC(info);
		if (vc == columnRslt_jnl_grp_no) return doRslt_jnl_grp_no_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_if_typ) return doRslt_ac_if_typ_VC(info);
		if (vc == columnRslt_ac_if_typ_nm) return doRslt_ac_if_typ_nm_VC(info);
		if (vc == columnRslt_slip_cnt_id) return doRslt_slip_cnt_id_VC(info);
		if (vc == columnRslt_jnl_no) return doRslt_jnl_no_VC(info);
		if (vc == columnRslt_jnl_no_seq) return doRslt_jnl_no_seq_VC(info);
		if (vc == columnRslt_dc_typ) return doRslt_dc_typ_VC(info);
		if (vc == columnRslt_dc_typ_nm) return doRslt_dc_typ_nm_VC(info);
		if (vc == columnRslt_ac_slip_dt) return doRslt_ac_slip_dt_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_slip_no) return doRslt_slip_no_VC(info);
		if (vc == columnRslt_slip_seq_no) return doRslt_slip_seq_no_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_ac_cd) return doRslt_ac_cd_VC(info);
		if (vc == columnRslt_ac_nm) return doRslt_ac_nm_VC(info);
		if (vc == columnRslt_sub_ac_cd) return doRslt_sub_ac_cd_VC(info);
		if (vc == columnRslt_sub_ac_nm) return doRslt_sub_ac_nm_VC(info);
		if (vc == columnRslt_project_cd) return doRslt_project_cd_VC(info);
		if (vc == columnRslt_summary_cd0) return doRslt_summary_cd0_VC(info);
		if (vc == columnRslt_summary_cd1) return doRslt_summary_cd1_VC(info);
		if (vc == columnRslt_summary_cd2) return doRslt_summary_cd2_VC(info);
		if (vc == columnRslt_summary_cd3) return doRslt_summary_cd3_VC(info);
		if (vc == columnRslt_summary_cd4) return doRslt_summary_cd4_VC(info);
		if (vc == columnRslt_summary_cd5) return doRslt_summary_cd5_VC(info);
		if (vc == columnRslt_bp_typ) return doRslt_bp_typ_VC(info);
		if (vc == columnRslt_bp_typ_nm) return doRslt_bp_typ_nm_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_base_unit_qty) return doRslt_base_unit_qty_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_cur_upri) return doRslt_base_cur_upri_VC(info);
		if (vc == columnRslt_base_cur_sum_amt) return doRslt_base_cur_sum_amt_VC(info);
		if (vc == columnRslt_base_cur_amt) return doRslt_base_cur_amt_VC(info);
		if (vc == columnRslt_base_cur_tax_amt) return doRslt_base_cur_tax_amt_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_upri) return doRslt_trd_cur_upri_VC(info);
		if (vc == columnRslt_trd_cur_sum_amt) return doRslt_trd_cur_sum_amt_VC(info);
		if (vc == columnRslt_trd_cur_amt) return doRslt_trd_cur_amt_VC(info);
		if (vc == columnRslt_trd_cur_tax_amt) return doRslt_trd_cur_tax_amt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_ptax_cur_upri) return doRslt_ptax_cur_upri_VC(info);
		if (vc == columnRslt_ptax_cur_sum_amt) return doRslt_ptax_cur_sum_amt_VC(info);
		if (vc == columnRslt_ptax_cur_amt) return doRslt_ptax_cur_amt_VC(info);
		if (vc == columnRslt_ptax_cur_tax_amt) return doRslt_ptax_cur_tax_amt_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_tax_typ) return doRslt_tax_typ_VC(info);
		if (vc == columnRslt_tax_typ_nm) return doRslt_tax_typ_nm_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_foreign_flg) return doRslt_foreign_flg_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_xrate_cd) return doRslt_xrate_cd_VC(info);
		if (vc == columnRslt_xrate_nm) return doRslt_xrate_nm_VC(info);
		if (vc == columnRslt_ptax_xrate) return doRslt_ptax_xrate_VC(info);
		if (vc == columnRslt_ptax_xrate_cd) return doRslt_ptax_xrate_cd_VC(info);
		if (vc == columnRslt_ptax_xrate_nm) return doRslt_ptax_xrate_nm_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_bill_no) return doRslt_bill_no_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_cls_jnl_typ) return doRslt_cls_jnl_typ_VC(info);
		if (vc == columnRslt_cls_jnl_typ_nm) return doRslt_cls_jnl_typ_nm_VC(info);
		if (vc == columnRslt_alloc_jnl_flg) return doRslt_alloc_jnl_flg_VC(info);
		if (vc == columnRslt_spot_flg) return doRslt_spot_flg_VC(info);
		if (vc == columnRslt_sttl_schd_dt) return doRslt_sttl_schd_dt_VC(info);
		if (vc == columnRslt_sttl_cd) return doRslt_sttl_cd_VC(info);
		if (vc == columnRslt_sttl_nm) return doRslt_sttl_nm_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_other_ac_cd) return doRslt_other_ac_cd_VC(info);
		if (vc == columnRslt_other_ac_nm) return doRslt_other_ac_nm_VC(info);
		if (vc == columnRslt_other_sub_ac_cd) return doRslt_other_sub_ac_cd_VC(info);
		if (vc == columnRslt_other_sub_ac_nm) return doRslt_other_sub_ac_nm_VC(info);
		if (vc == columnRslt_other_dpt_cd) return doRslt_other_dpt_cd_VC(info);
		if (vc == columnRslt_other_dpt_nm) return doRslt_other_dpt_nm_VC(info);
		if (vc == columnRslt_abstract1) return doRslt_abstract1_VC(info);
		if (vc == columnRslt_abstract2) return doRslt_abstract2_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_sub_char4) return doRslt_sub_char4_VC(info);
		if (vc == columnRslt_sub_char5) return doRslt_sub_char5_VC(info);
		if (vc == columnRslt_sub_char6) return doRslt_sub_char6_VC(info);
		if (vc == columnRslt_sub_char7) return doRslt_sub_char7_VC(info);
		if (vc == columnRslt_sub_char8) return doRslt_sub_char8_VC(info);
		if (vc == columnRslt_sub_char9) return doRslt_sub_char9_VC(info);
		if (vc == columnRslt_sub_char10) return doRslt_sub_char10_VC(info);
		if (vc == columnRslt_sub_num1) return doRslt_sub_num1_VC(info);
		if (vc == columnRslt_sub_num2) return doRslt_sub_num2_VC(info);
		if (vc == columnRslt_sub_num3) return doRslt_sub_num3_VC(info);
		if (vc == columnRslt_sub_dt1) return doRslt_sub_dt1_VC(info);
		if (vc == columnRslt_sub_dt2) return doRslt_sub_dt2_VC(info);
		if (vc == columnRslt_sub_dt3) return doRslt_sub_dt3_VC(info);
		if (vc == columnRslt_send_flg) return doRslt_send_flg_VC(info);
		if (vc == columnRslt_jnl_ptn) return doRslt_jnl_ptn_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
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
	 * [Cnd]パネルの[jnl_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_if_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_if_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slip_cnt_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slip_cnt_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_if_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_if_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_if_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_cnt_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_no_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_no_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_slip_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_seq_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_seq_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[project_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_project_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[summary_cd0]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_summary_cd0_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[summary_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_summary_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[summary_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_summary_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[summary_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_summary_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[summary_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_summary_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[summary_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_summary_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_sum_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_sum_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_tax_amt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_sum_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_sum_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_tax_amt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_sum_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_sum_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cls_jnl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cls_jnl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_jnl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_jnl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sttl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sttl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sttl_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[other_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_other_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[other_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_other_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_other_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_other_sub_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[other_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_other_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[other_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_other_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[abstract1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_abstract1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[abstract2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_abstract2_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[send_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_send_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_ptn_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
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
		else if (nc == Cnd_jnl_grp_no) doCnd_jnl_grp_no_NC(info);
		else if (nc == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NC(info);
		else if (nc == Cnd_ac_ym) doCnd_ac_ym_NC(info);
		else if (nc == Cnd_ac_if_typ) doCnd_ac_if_typ_NC(info);
		else if (nc == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NC(info);
		else if (nc == Cnd_slip_cnt_id) doCnd_slip_cnt_id_NC(info);
		else if (nc == Cnd_jnl_no) doCnd_jnl_no_NC(info);
		else if (nc == Cnd_ac_cd) doCnd_ac_cd_NC(info);
		else if (nc == Cnd_ac_nm) doCnd_ac_nm_NC(info);
		else if (nc == Cnd_sub_ac_cd) doCnd_sub_ac_cd_NC(info);
		else if (nc == Cnd_sub_ac_nm) doCnd_sub_ac_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_tax_cd) doCnd_tax_cd_NC(info);
		else if (nc == Cnd_tax_nm) doCnd_tax_nm_NC(info);
		else if (nc == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_if_typ) doRslt_ac_if_typ_NC(info);
		else if (nc == columnRslt_ac_if_typ_nm) doRslt_ac_if_typ_nm_NC(info);
		else if (nc == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NC(info);
		else if (nc == columnRslt_jnl_no) doRslt_jnl_no_NC(info);
		else if (nc == columnRslt_jnl_no_seq) doRslt_jnl_no_seq_NC(info);
		else if (nc == columnRslt_dc_typ) doRslt_dc_typ_NC(info);
		else if (nc == columnRslt_dc_typ_nm) doRslt_dc_typ_nm_NC(info);
		else if (nc == columnRslt_ac_slip_dt) doRslt_ac_slip_dt_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_slip_no) doRslt_slip_no_NC(info);
		else if (nc == columnRslt_slip_seq_no) doRslt_slip_seq_no_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_ac_cd) doRslt_ac_cd_NC(info);
		else if (nc == columnRslt_ac_nm) doRslt_ac_nm_NC(info);
		else if (nc == columnRslt_sub_ac_cd) doRslt_sub_ac_cd_NC(info);
		else if (nc == columnRslt_sub_ac_nm) doRslt_sub_ac_nm_NC(info);
		else if (nc == columnRslt_project_cd) doRslt_project_cd_NC(info);
		else if (nc == columnRslt_summary_cd0) doRslt_summary_cd0_NC(info);
		else if (nc == columnRslt_summary_cd1) doRslt_summary_cd1_NC(info);
		else if (nc == columnRslt_summary_cd2) doRslt_summary_cd2_NC(info);
		else if (nc == columnRslt_summary_cd3) doRslt_summary_cd3_NC(info);
		else if (nc == columnRslt_summary_cd4) doRslt_summary_cd4_NC(info);
		else if (nc == columnRslt_summary_cd5) doRslt_summary_cd5_NC(info);
		else if (nc == columnRslt_bp_typ) doRslt_bp_typ_NC(info);
		else if (nc == columnRslt_bp_typ_nm) doRslt_bp_typ_nm_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_base_unit_qty) doRslt_base_unit_qty_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_cur_upri) doRslt_base_cur_upri_NC(info);
		else if (nc == columnRslt_base_cur_sum_amt) doRslt_base_cur_sum_amt_NC(info);
		else if (nc == columnRslt_base_cur_amt) doRslt_base_cur_amt_NC(info);
		else if (nc == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_upri) doRslt_trd_cur_upri_NC(info);
		else if (nc == columnRslt_trd_cur_sum_amt) doRslt_trd_cur_sum_amt_NC(info);
		else if (nc == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NC(info);
		else if (nc == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_cur_upri) doRslt_ptax_cur_upri_NC(info);
		else if (nc == columnRslt_ptax_cur_sum_amt) doRslt_ptax_cur_sum_amt_NC(info);
		else if (nc == columnRslt_ptax_cur_amt) doRslt_ptax_cur_amt_NC(info);
		else if (nc == columnRslt_ptax_cur_tax_amt) doRslt_ptax_cur_tax_amt_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_tax_typ) doRslt_tax_typ_NC(info);
		else if (nc == columnRslt_tax_typ_nm) doRslt_tax_typ_nm_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_foreign_flg) doRslt_foreign_flg_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_xrate_cd) doRslt_xrate_cd_NC(info);
		else if (nc == columnRslt_xrate_nm) doRslt_xrate_nm_NC(info);
		else if (nc == columnRslt_ptax_xrate) doRslt_ptax_xrate_NC(info);
		else if (nc == columnRslt_ptax_xrate_cd) doRslt_ptax_xrate_cd_NC(info);
		else if (nc == columnRslt_ptax_xrate_nm) doRslt_ptax_xrate_nm_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_bill_no) doRslt_bill_no_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_cls_jnl_typ) doRslt_cls_jnl_typ_NC(info);
		else if (nc == columnRslt_cls_jnl_typ_nm) doRslt_cls_jnl_typ_nm_NC(info);
		else if (nc == columnRslt_alloc_jnl_flg) doRslt_alloc_jnl_flg_NC(info);
		else if (nc == columnRslt_spot_flg) doRslt_spot_flg_NC(info);
		else if (nc == columnRslt_sttl_schd_dt) doRslt_sttl_schd_dt_NC(info);
		else if (nc == columnRslt_sttl_cd) doRslt_sttl_cd_NC(info);
		else if (nc == columnRslt_sttl_nm) doRslt_sttl_nm_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_other_ac_cd) doRslt_other_ac_cd_NC(info);
		else if (nc == columnRslt_other_ac_nm) doRslt_other_ac_nm_NC(info);
		else if (nc == columnRslt_other_sub_ac_cd) doRslt_other_sub_ac_cd_NC(info);
		else if (nc == columnRslt_other_sub_ac_nm) doRslt_other_sub_ac_nm_NC(info);
		else if (nc == columnRslt_other_dpt_cd) doRslt_other_dpt_cd_NC(info);
		else if (nc == columnRslt_other_dpt_nm) doRslt_other_dpt_nm_NC(info);
		else if (nc == columnRslt_abstract1) doRslt_abstract1_NC(info);
		else if (nc == columnRslt_abstract2) doRslt_abstract2_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_sub_char4) doRslt_sub_char4_NC(info);
		else if (nc == columnRslt_sub_char5) doRslt_sub_char5_NC(info);
		else if (nc == columnRslt_sub_char6) doRslt_sub_char6_NC(info);
		else if (nc == columnRslt_sub_char7) doRslt_sub_char7_NC(info);
		else if (nc == columnRslt_sub_char8) doRslt_sub_char8_NC(info);
		else if (nc == columnRslt_sub_char9) doRslt_sub_char9_NC(info);
		else if (nc == columnRslt_sub_char10) doRslt_sub_char10_NC(info);
		else if (nc == columnRslt_sub_num1) doRslt_sub_num1_NC(info);
		else if (nc == columnRslt_sub_num2) doRslt_sub_num2_NC(info);
		else if (nc == columnRslt_sub_num3) doRslt_sub_num3_NC(info);
		else if (nc == columnRslt_sub_dt1) doRslt_sub_dt1_NC(info);
		else if (nc == columnRslt_sub_dt2) doRslt_sub_dt2_NC(info);
		else if (nc == columnRslt_sub_dt3) doRslt_sub_dt3_NC(info);
		else if (nc == columnRslt_send_flg) doRslt_send_flg_NC(info);
		else if (nc == columnRslt_jnl_ptn) doRslt_jnl_ptn_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
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
	 * [Cnd]パネルの[jnl_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_cnt_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_no_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_no_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_seq_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_seq_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[project_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_project_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd0]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd0_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_sum_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_sum_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_sum_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_sum_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_sum_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_sum_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cls_jnl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cls_jnl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_jnl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_jnl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[other_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abstract1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abstract1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abstract2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abstract2_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[send_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_send_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
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
		else if (ne == Cnd_jnl_grp_no) doCnd_jnl_grp_no_NE(info);
		else if (ne == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NE(info);
		else if (ne == Cnd_ac_ym) doCnd_ac_ym_NE(info);
		else if (ne == Cnd_ac_if_typ) doCnd_ac_if_typ_NE(info);
		else if (ne == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NE(info);
		else if (ne == Cnd_slip_cnt_id) doCnd_slip_cnt_id_NE(info);
		else if (ne == Cnd_jnl_no) doCnd_jnl_no_NE(info);
		else if (ne == Cnd_ac_cd) doCnd_ac_cd_NE(info);
		else if (ne == Cnd_ac_nm) doCnd_ac_nm_NE(info);
		else if (ne == Cnd_sub_ac_cd) doCnd_sub_ac_cd_NE(info);
		else if (ne == Cnd_sub_ac_nm) doCnd_sub_ac_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_tax_cd) doCnd_tax_cd_NE(info);
		else if (ne == Cnd_tax_nm) doCnd_tax_nm_NE(info);
		else if (ne == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_if_typ) doRslt_ac_if_typ_NE(info);
		else if (ne == columnRslt_ac_if_typ_nm) doRslt_ac_if_typ_nm_NE(info);
		else if (ne == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NE(info);
		else if (ne == columnRslt_jnl_no) doRslt_jnl_no_NE(info);
		else if (ne == columnRslt_jnl_no_seq) doRslt_jnl_no_seq_NE(info);
		else if (ne == columnRslt_dc_typ) doRslt_dc_typ_NE(info);
		else if (ne == columnRslt_dc_typ_nm) doRslt_dc_typ_nm_NE(info);
		else if (ne == columnRslt_ac_slip_dt) doRslt_ac_slip_dt_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_slip_no) doRslt_slip_no_NE(info);
		else if (ne == columnRslt_slip_seq_no) doRslt_slip_seq_no_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_ac_cd) doRslt_ac_cd_NE(info);
		else if (ne == columnRslt_ac_nm) doRslt_ac_nm_NE(info);
		else if (ne == columnRslt_sub_ac_cd) doRslt_sub_ac_cd_NE(info);
		else if (ne == columnRslt_sub_ac_nm) doRslt_sub_ac_nm_NE(info);
		else if (ne == columnRslt_project_cd) doRslt_project_cd_NE(info);
		else if (ne == columnRslt_summary_cd0) doRslt_summary_cd0_NE(info);
		else if (ne == columnRslt_summary_cd1) doRslt_summary_cd1_NE(info);
		else if (ne == columnRslt_summary_cd2) doRslt_summary_cd2_NE(info);
		else if (ne == columnRslt_summary_cd3) doRslt_summary_cd3_NE(info);
		else if (ne == columnRslt_summary_cd4) doRslt_summary_cd4_NE(info);
		else if (ne == columnRslt_summary_cd5) doRslt_summary_cd5_NE(info);
		else if (ne == columnRslt_bp_typ) doRslt_bp_typ_NE(info);
		else if (ne == columnRslt_bp_typ_nm) doRslt_bp_typ_nm_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_base_unit_qty) doRslt_base_unit_qty_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_cur_upri) doRslt_base_cur_upri_NE(info);
		else if (ne == columnRslt_base_cur_sum_amt) doRslt_base_cur_sum_amt_NE(info);
		else if (ne == columnRslt_base_cur_amt) doRslt_base_cur_amt_NE(info);
		else if (ne == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_upri) doRslt_trd_cur_upri_NE(info);
		else if (ne == columnRslt_trd_cur_sum_amt) doRslt_trd_cur_sum_amt_NE(info);
		else if (ne == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NE(info);
		else if (ne == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_cur_upri) doRslt_ptax_cur_upri_NE(info);
		else if (ne == columnRslt_ptax_cur_sum_amt) doRslt_ptax_cur_sum_amt_NE(info);
		else if (ne == columnRslt_ptax_cur_amt) doRslt_ptax_cur_amt_NE(info);
		else if (ne == columnRslt_ptax_cur_tax_amt) doRslt_ptax_cur_tax_amt_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_tax_typ) doRslt_tax_typ_NE(info);
		else if (ne == columnRslt_tax_typ_nm) doRslt_tax_typ_nm_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_foreign_flg) doRslt_foreign_flg_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_xrate_cd) doRslt_xrate_cd_NE(info);
		else if (ne == columnRslt_xrate_nm) doRslt_xrate_nm_NE(info);
		else if (ne == columnRslt_ptax_xrate) doRslt_ptax_xrate_NE(info);
		else if (ne == columnRslt_ptax_xrate_cd) doRslt_ptax_xrate_cd_NE(info);
		else if (ne == columnRslt_ptax_xrate_nm) doRslt_ptax_xrate_nm_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_bill_no) doRslt_bill_no_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_cls_jnl_typ) doRslt_cls_jnl_typ_NE(info);
		else if (ne == columnRslt_cls_jnl_typ_nm) doRslt_cls_jnl_typ_nm_NE(info);
		else if (ne == columnRslt_alloc_jnl_flg) doRslt_alloc_jnl_flg_NE(info);
		else if (ne == columnRslt_spot_flg) doRslt_spot_flg_NE(info);
		else if (ne == columnRslt_sttl_schd_dt) doRslt_sttl_schd_dt_NE(info);
		else if (ne == columnRslt_sttl_cd) doRslt_sttl_cd_NE(info);
		else if (ne == columnRslt_sttl_nm) doRslt_sttl_nm_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_other_ac_cd) doRslt_other_ac_cd_NE(info);
		else if (ne == columnRslt_other_ac_nm) doRslt_other_ac_nm_NE(info);
		else if (ne == columnRslt_other_sub_ac_cd) doRslt_other_sub_ac_cd_NE(info);
		else if (ne == columnRslt_other_sub_ac_nm) doRslt_other_sub_ac_nm_NE(info);
		else if (ne == columnRslt_other_dpt_cd) doRslt_other_dpt_cd_NE(info);
		else if (ne == columnRslt_other_dpt_nm) doRslt_other_dpt_nm_NE(info);
		else if (ne == columnRslt_abstract1) doRslt_abstract1_NE(info);
		else if (ne == columnRslt_abstract2) doRslt_abstract2_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_sub_char4) doRslt_sub_char4_NE(info);
		else if (ne == columnRslt_sub_char5) doRslt_sub_char5_NE(info);
		else if (ne == columnRslt_sub_char6) doRslt_sub_char6_NE(info);
		else if (ne == columnRslt_sub_char7) doRslt_sub_char7_NE(info);
		else if (ne == columnRslt_sub_char8) doRslt_sub_char8_NE(info);
		else if (ne == columnRslt_sub_char9) doRslt_sub_char9_NE(info);
		else if (ne == columnRslt_sub_char10) doRslt_sub_char10_NE(info);
		else if (ne == columnRslt_sub_num1) doRslt_sub_num1_NE(info);
		else if (ne == columnRslt_sub_num2) doRslt_sub_num2_NE(info);
		else if (ne == columnRslt_sub_num3) doRslt_sub_num3_NE(info);
		else if (ne == columnRslt_sub_dt1) doRslt_sub_dt1_NE(info);
		else if (ne == columnRslt_sub_dt2) doRslt_sub_dt2_NE(info);
		else if (ne == columnRslt_sub_dt3) doRslt_sub_dt3_NE(info);
		else if (ne == columnRslt_send_flg) doRslt_send_flg_NE(info);
		else if (ne == columnRslt_jnl_ptn) doRslt_jnl_ptn_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
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
	 * [Cnd]パネルの[jnl_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_cnt_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_no_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_no_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_seq_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_seq_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[project_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_project_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd0]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd0_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_sum_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_sum_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_sum_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_sum_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_sum_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_sum_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cls_jnl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cls_jnl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_jnl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_jnl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[other_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abstract1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abstract1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abstract2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abstract2_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[send_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_send_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
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
		else if (nx == Cnd_jnl_grp_no) doCnd_jnl_grp_no_NX(info);
		else if (nx == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NX(info);
		else if (nx == Cnd_ac_ym) doCnd_ac_ym_NX(info);
		else if (nx == Cnd_ac_if_typ) doCnd_ac_if_typ_NX(info);
		else if (nx == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NX(info);
		else if (nx == Cnd_slip_cnt_id) doCnd_slip_cnt_id_NX(info);
		else if (nx == Cnd_jnl_no) doCnd_jnl_no_NX(info);
		else if (nx == Cnd_ac_cd) doCnd_ac_cd_NX(info);
		else if (nx == Cnd_ac_nm) doCnd_ac_nm_NX(info);
		else if (nx == Cnd_sub_ac_cd) doCnd_sub_ac_cd_NX(info);
		else if (nx == Cnd_sub_ac_nm) doCnd_sub_ac_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_tax_cd) doCnd_tax_cd_NX(info);
		else if (nx == Cnd_tax_nm) doCnd_tax_nm_NX(info);
		else if (nx == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_if_typ) doRslt_ac_if_typ_NX(info);
		else if (nx == columnRslt_ac_if_typ_nm) doRslt_ac_if_typ_nm_NX(info);
		else if (nx == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NX(info);
		else if (nx == columnRslt_jnl_no) doRslt_jnl_no_NX(info);
		else if (nx == columnRslt_jnl_no_seq) doRslt_jnl_no_seq_NX(info);
		else if (nx == columnRslt_dc_typ) doRslt_dc_typ_NX(info);
		else if (nx == columnRslt_dc_typ_nm) doRslt_dc_typ_nm_NX(info);
		else if (nx == columnRslt_ac_slip_dt) doRslt_ac_slip_dt_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_slip_no) doRslt_slip_no_NX(info);
		else if (nx == columnRslt_slip_seq_no) doRslt_slip_seq_no_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_ac_cd) doRslt_ac_cd_NX(info);
		else if (nx == columnRslt_ac_nm) doRslt_ac_nm_NX(info);
		else if (nx == columnRslt_sub_ac_cd) doRslt_sub_ac_cd_NX(info);
		else if (nx == columnRslt_sub_ac_nm) doRslt_sub_ac_nm_NX(info);
		else if (nx == columnRslt_project_cd) doRslt_project_cd_NX(info);
		else if (nx == columnRslt_summary_cd0) doRslt_summary_cd0_NX(info);
		else if (nx == columnRslt_summary_cd1) doRslt_summary_cd1_NX(info);
		else if (nx == columnRslt_summary_cd2) doRslt_summary_cd2_NX(info);
		else if (nx == columnRslt_summary_cd3) doRslt_summary_cd3_NX(info);
		else if (nx == columnRslt_summary_cd4) doRslt_summary_cd4_NX(info);
		else if (nx == columnRslt_summary_cd5) doRslt_summary_cd5_NX(info);
		else if (nx == columnRslt_bp_typ) doRslt_bp_typ_NX(info);
		else if (nx == columnRslt_bp_typ_nm) doRslt_bp_typ_nm_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_base_unit_qty) doRslt_base_unit_qty_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_cur_upri) doRslt_base_cur_upri_NX(info);
		else if (nx == columnRslt_base_cur_sum_amt) doRslt_base_cur_sum_amt_NX(info);
		else if (nx == columnRslt_base_cur_amt) doRslt_base_cur_amt_NX(info);
		else if (nx == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_upri) doRslt_trd_cur_upri_NX(info);
		else if (nx == columnRslt_trd_cur_sum_amt) doRslt_trd_cur_sum_amt_NX(info);
		else if (nx == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NX(info);
		else if (nx == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_cur_upri) doRslt_ptax_cur_upri_NX(info);
		else if (nx == columnRslt_ptax_cur_sum_amt) doRslt_ptax_cur_sum_amt_NX(info);
		else if (nx == columnRslt_ptax_cur_amt) doRslt_ptax_cur_amt_NX(info);
		else if (nx == columnRslt_ptax_cur_tax_amt) doRslt_ptax_cur_tax_amt_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_tax_typ) doRslt_tax_typ_NX(info);
		else if (nx == columnRslt_tax_typ_nm) doRslt_tax_typ_nm_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_foreign_flg) doRslt_foreign_flg_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_xrate_cd) doRslt_xrate_cd_NX(info);
		else if (nx == columnRslt_xrate_nm) doRslt_xrate_nm_NX(info);
		else if (nx == columnRslt_ptax_xrate) doRslt_ptax_xrate_NX(info);
		else if (nx == columnRslt_ptax_xrate_cd) doRslt_ptax_xrate_cd_NX(info);
		else if (nx == columnRslt_ptax_xrate_nm) doRslt_ptax_xrate_nm_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_bill_no) doRslt_bill_no_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_cls_jnl_typ) doRslt_cls_jnl_typ_NX(info);
		else if (nx == columnRslt_cls_jnl_typ_nm) doRslt_cls_jnl_typ_nm_NX(info);
		else if (nx == columnRslt_alloc_jnl_flg) doRslt_alloc_jnl_flg_NX(info);
		else if (nx == columnRslt_spot_flg) doRslt_spot_flg_NX(info);
		else if (nx == columnRslt_sttl_schd_dt) doRslt_sttl_schd_dt_NX(info);
		else if (nx == columnRslt_sttl_cd) doRslt_sttl_cd_NX(info);
		else if (nx == columnRslt_sttl_nm) doRslt_sttl_nm_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_other_ac_cd) doRslt_other_ac_cd_NX(info);
		else if (nx == columnRslt_other_ac_nm) doRslt_other_ac_nm_NX(info);
		else if (nx == columnRslt_other_sub_ac_cd) doRslt_other_sub_ac_cd_NX(info);
		else if (nx == columnRslt_other_sub_ac_nm) doRslt_other_sub_ac_nm_NX(info);
		else if (nx == columnRslt_other_dpt_cd) doRslt_other_dpt_cd_NX(info);
		else if (nx == columnRslt_other_dpt_nm) doRslt_other_dpt_nm_NX(info);
		else if (nx == columnRslt_abstract1) doRslt_abstract1_NX(info);
		else if (nx == columnRslt_abstract2) doRslt_abstract2_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_sub_char4) doRslt_sub_char4_NX(info);
		else if (nx == columnRslt_sub_char5) doRslt_sub_char5_NX(info);
		else if (nx == columnRslt_sub_char6) doRslt_sub_char6_NX(info);
		else if (nx == columnRslt_sub_char7) doRslt_sub_char7_NX(info);
		else if (nx == columnRslt_sub_char8) doRslt_sub_char8_NX(info);
		else if (nx == columnRslt_sub_char9) doRslt_sub_char9_NX(info);
		else if (nx == columnRslt_sub_char10) doRslt_sub_char10_NX(info);
		else if (nx == columnRslt_sub_num1) doRslt_sub_num1_NX(info);
		else if (nx == columnRslt_sub_num2) doRslt_sub_num2_NX(info);
		else if (nx == columnRslt_sub_num3) doRslt_sub_num3_NX(info);
		else if (nx == columnRslt_sub_dt1) doRslt_sub_dt1_NX(info);
		else if (nx == columnRslt_sub_dt2) doRslt_sub_dt2_NX(info);
		else if (nx == columnRslt_sub_dt3) doRslt_sub_dt3_NX(info);
		else if (nx == columnRslt_send_flg) doRslt_send_flg_NX(info);
		else if (nx == columnRslt_jnl_ptn) doRslt_jnl_ptn_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
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
	 * [Cnd]パネルの[jnl_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_cnt_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_no_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_no_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_seq_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_seq_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[project_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_project_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd0]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd0_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_sum_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_sum_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_sum_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_sum_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_sum_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_sum_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cls_jnl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cls_jnl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_jnl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_jnl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[other_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abstract1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abstract1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abstract2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abstract2_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[send_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_send_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
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
		if (lc == Cnd_jnl_grp_no) doCnd_jnl_grp_no_LC(info);
		else if (lc == Cnd_jnl_rmrks) doCnd_jnl_rmrks_LC(info);
		else if (lc == Cnd_ac_ym) doCnd_ac_ym_LC(info);
		else if (lc == Cnd_ac_if_typ) doCnd_ac_if_typ_LC(info);
		else if (lc == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_LC(info);
		else if (lc == Cnd_slip_cnt_id) doCnd_slip_cnt_id_LC(info);
		else if (lc == Cnd_jnl_no) doCnd_jnl_no_LC(info);
		else if (lc == Cnd_ac_cd) doCnd_ac_cd_LC(info);
		else if (lc == Cnd_ac_nm) doCnd_ac_nm_LC(info);
		else if (lc == Cnd_sub_ac_cd) doCnd_sub_ac_cd_LC(info);
		else if (lc == Cnd_sub_ac_nm) doCnd_sub_ac_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_tax_cd) doCnd_tax_cd_LC(info);
		else if (lc == Cnd_tax_nm) doCnd_tax_nm_LC(info);
		else if (lc == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_if_typ) doRslt_ac_if_typ_LC(info);
		else if (lc == columnRslt_ac_if_typ_nm) doRslt_ac_if_typ_nm_LC(info);
		else if (lc == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_LC(info);
		else if (lc == columnRslt_jnl_no) doRslt_jnl_no_LC(info);
		else if (lc == columnRslt_jnl_no_seq) doRslt_jnl_no_seq_LC(info);
		else if (lc == columnRslt_dc_typ) doRslt_dc_typ_LC(info);
		else if (lc == columnRslt_dc_typ_nm) doRslt_dc_typ_nm_LC(info);
		else if (lc == columnRslt_ac_slip_dt) doRslt_ac_slip_dt_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_slip_no) doRslt_slip_no_LC(info);
		else if (lc == columnRslt_slip_seq_no) doRslt_slip_seq_no_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_ac_cd) doRslt_ac_cd_LC(info);
		else if (lc == columnRslt_ac_nm) doRslt_ac_nm_LC(info);
		else if (lc == columnRslt_sub_ac_cd) doRslt_sub_ac_cd_LC(info);
		else if (lc == columnRslt_sub_ac_nm) doRslt_sub_ac_nm_LC(info);
		else if (lc == columnRslt_project_cd) doRslt_project_cd_LC(info);
		else if (lc == columnRslt_summary_cd0) doRslt_summary_cd0_LC(info);
		else if (lc == columnRslt_summary_cd1) doRslt_summary_cd1_LC(info);
		else if (lc == columnRslt_summary_cd2) doRslt_summary_cd2_LC(info);
		else if (lc == columnRslt_summary_cd3) doRslt_summary_cd3_LC(info);
		else if (lc == columnRslt_summary_cd4) doRslt_summary_cd4_LC(info);
		else if (lc == columnRslt_summary_cd5) doRslt_summary_cd5_LC(info);
		else if (lc == columnRslt_bp_typ) doRslt_bp_typ_LC(info);
		else if (lc == columnRslt_bp_typ_nm) doRslt_bp_typ_nm_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_base_unit_qty) doRslt_base_unit_qty_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_cur_upri) doRslt_base_cur_upri_LC(info);
		else if (lc == columnRslt_base_cur_sum_amt) doRslt_base_cur_sum_amt_LC(info);
		else if (lc == columnRslt_base_cur_amt) doRslt_base_cur_amt_LC(info);
		else if (lc == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_upri) doRslt_trd_cur_upri_LC(info);
		else if (lc == columnRslt_trd_cur_sum_amt) doRslt_trd_cur_sum_amt_LC(info);
		else if (lc == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_LC(info);
		else if (lc == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_cur_upri) doRslt_ptax_cur_upri_LC(info);
		else if (lc == columnRslt_ptax_cur_sum_amt) doRslt_ptax_cur_sum_amt_LC(info);
		else if (lc == columnRslt_ptax_cur_amt) doRslt_ptax_cur_amt_LC(info);
		else if (lc == columnRslt_ptax_cur_tax_amt) doRslt_ptax_cur_tax_amt_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_tax_typ) doRslt_tax_typ_LC(info);
		else if (lc == columnRslt_tax_typ_nm) doRslt_tax_typ_nm_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_xrate_cd) doRslt_xrate_cd_LC(info);
		else if (lc == columnRslt_xrate_nm) doRslt_xrate_nm_LC(info);
		else if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		else if (lc == columnRslt_ptax_xrate_cd) doRslt_ptax_xrate_cd_LC(info);
		else if (lc == columnRslt_ptax_xrate_nm) doRslt_ptax_xrate_nm_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_bill_no) doRslt_bill_no_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_cls_jnl_typ) doRslt_cls_jnl_typ_LC(info);
		else if (lc == columnRslt_cls_jnl_typ_nm) doRslt_cls_jnl_typ_nm_LC(info);
		else if (lc == columnRslt_sttl_schd_dt) doRslt_sttl_schd_dt_LC(info);
		else if (lc == columnRslt_sttl_cd) doRslt_sttl_cd_LC(info);
		else if (lc == columnRslt_sttl_nm) doRslt_sttl_nm_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_other_ac_cd) doRslt_other_ac_cd_LC(info);
		else if (lc == columnRslt_other_ac_nm) doRslt_other_ac_nm_LC(info);
		else if (lc == columnRslt_other_sub_ac_cd) doRslt_other_sub_ac_cd_LC(info);
		else if (lc == columnRslt_other_sub_ac_nm) doRslt_other_sub_ac_nm_LC(info);
		else if (lc == columnRslt_other_dpt_cd) doRslt_other_dpt_cd_LC(info);
		else if (lc == columnRslt_other_dpt_nm) doRslt_other_dpt_nm_LC(info);
		else if (lc == columnRslt_abstract1) doRslt_abstract1_LC(info);
		else if (lc == columnRslt_abstract2) doRslt_abstract2_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_sub_char4) doRslt_sub_char4_LC(info);
		else if (lc == columnRslt_sub_char5) doRslt_sub_char5_LC(info);
		else if (lc == columnRslt_sub_char6) doRslt_sub_char6_LC(info);
		else if (lc == columnRslt_sub_char7) doRslt_sub_char7_LC(info);
		else if (lc == columnRslt_sub_char8) doRslt_sub_char8_LC(info);
		else if (lc == columnRslt_sub_char9) doRslt_sub_char9_LC(info);
		else if (lc == columnRslt_sub_char10) doRslt_sub_char10_LC(info);
		else if (lc == columnRslt_sub_num1) doRslt_sub_num1_LC(info);
		else if (lc == columnRslt_sub_num2) doRslt_sub_num2_LC(info);
		else if (lc == columnRslt_sub_num3) doRslt_sub_num3_LC(info);
		else if (lc == columnRslt_sub_dt1) doRslt_sub_dt1_LC(info);
		else if (lc == columnRslt_sub_dt2) doRslt_sub_dt2_LC(info);
		else if (lc == columnRslt_sub_dt3) doRslt_sub_dt3_LC(info);
		else if (lc == columnRslt_jnl_ptn) doRslt_jnl_ptn_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[jnl_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_cnt_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_no_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_no_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_seq_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_seq_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[project_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_project_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd0]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd0_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[summary_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_summary_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_sum_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_sum_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_sum_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_sum_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_sum_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_sum_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cls_jnl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cls_jnl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cls_jnl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sttl_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[other_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abstract1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abstract1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abstract2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abstract2_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_jnl_grp_no]の作成メソッド
	 */
	public MCList getCnd_jnl_grp_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getJnlGrpNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_if_typ]の作成メソッド
	 */
	public MCList getCnd_ac_if_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcIfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_cd]の作成メソッド
	 */
	public MCList getCnd_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAccount(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sub_ac_cd]の作成メソッド
	 */
	public MCList getCnd_sub_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSubAccount(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tax_cd]の作成メソッド
	 */
	public MCList getCnd_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_xrate_cd]の作成メソッド
	 */
	public MCList getRslt_xrate_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0120.Srch01")) {
			return new MB_MBBBL0120_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0120_Srch01;

		/** コンストラクタ */
		protected MB_MBBBL0120_Srch01Bridge() {
			p_MB_MBBBL0120_Srch01 = new MCParam(PDef.MB_MBBBL0120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0120.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0120.RsltR.class));

			p_MB_MBBBL0120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0120.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0120.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0120.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0120.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0120_Srch01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0120.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0120_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0120.RsltR>)p_MB_MBBBL0120_Srch01.getContainerParam().getDownBlock(0));
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