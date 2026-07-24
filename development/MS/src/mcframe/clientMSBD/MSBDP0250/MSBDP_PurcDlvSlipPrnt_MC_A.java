package mcframe.clientMSBD.MSBDP0250;

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
import mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt_MC.MS_MSBDL0250_Srch01Caller;
import mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt_MC.MS_MSBDL0250_Prnt01Caller;

/**
 * 画面"MSBDP_PurcDlvSlipPrnt"パネルクラスです。<p>
 *
 * 購買納品書を発行します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PurcDlvSlipPrnt_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBDP0250";

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
	// [DlvPrnt]ブロック関連のField定義
	public MCPanel DlvPrntPanel = null;
	public MCTitledBorder DlvPrntTitledBorder = null;
	// [DlvPrnt]ブロックの項目のField定義
	// [TOP]ブロック関連のField定義
	public MCPanel TOPPanel = null;
	// [TOP]ブロックの項目のField定義
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
	// [SpplCnd]ブロック関連のField定義
	public MCPanel SpplCndPanel = null;
	// [SpplCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * DLVSLIP,Issue delivery note,0;PURCDDLVSLIP,Issue direct delivery delivery note,1; DLVSLIP,納品書発行,0;PURCDDLVSLIP,仕入直送納品書発行,1;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_DLVSLIP = null;
	public MCRadioButton Cnd_ope_PURCDDLVSLIP = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_not_dlv_prnt_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_prnt_flg = null;
	public MCLabel Cnd_dlv_rqst_dt_fr_Label = null;
	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dlv_rqst_dt_fr = null;
	public MCLabel Cnd_dlv_rqst_dt_to_Label = null;
	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dlv_rqst_dt_to = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_po_rev = null;
	public MCLabel Cnd_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_no = null;
	public MCLabel Cnd_dlv_slip_seq_Label = null;
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumberField Cnd_dlv_slip_seq = null;
	public MCLabel Cnd_purc_dlv_slip_src_typ_Label = null;
	/**
	 * Delivery note creating source type 納品書作成元区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_purc_dlv_slip_src_typ = null;
	/**
	 * Delivery note creating source type name 納品書作成元区分名.<p>
	 *
	 */
	public MCTextField Cnd_purc_dlv_slip_src_typ_nm = null;
	public MCLabel Cnd_purc_ddlv_dlv_slip_no_Label = null;
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_ddlv_dlv_slip_no = null;
	public MCLabel Cnd_purc_usr_cd_Label = null;
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCTextField Cnd_purc_usr_nm = null;
	public MCLabel Cnd_purc_dpt_cd_Label = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCTextField Cnd_purc_dpt_nm = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	/**
	 * Latest only 最新のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inv_can_flg = null;
	/**
	 * Include not to issue 発行対象外含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inv_non_prnt_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_sppl_grp_p_PPanel;
	public MCLabel Cnd_sppl_grp_lab1;	// [Cnd]の[sppl_grp_p.bp_grp_lab1]を[Cnd_sppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg1;	// [Cnd]の[sppl_grp_p.bp_grp_flg1]を[Cnd_sppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd1;	// [Cnd]の[sppl_grp_p.bp_grp_cd1]を[Cnd_sppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm1;	// [Cnd]の[sppl_grp_p.bp_grp_nm1]を[Cnd_sppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab2;	// [Cnd]の[sppl_grp_p.bp_grp_lab2]を[Cnd_sppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg2;	// [Cnd]の[sppl_grp_p.bp_grp_flg2]を[Cnd_sppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd2;	// [Cnd]の[sppl_grp_p.bp_grp_cd2]を[Cnd_sppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm2;	// [Cnd]の[sppl_grp_p.bp_grp_nm2]を[Cnd_sppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab3;	// [Cnd]の[sppl_grp_p.bp_grp_lab3]を[Cnd_sppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg3;	// [Cnd]の[sppl_grp_p.bp_grp_flg3]を[Cnd_sppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd3;	// [Cnd]の[sppl_grp_p.bp_grp_cd3]を[Cnd_sppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm3;	// [Cnd]の[sppl_grp_p.bp_grp_nm3]を[Cnd_sppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab4;	// [Cnd]の[sppl_grp_p.bp_grp_lab4]を[Cnd_sppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg4;	// [Cnd]の[sppl_grp_p.bp_grp_flg4]を[Cnd_sppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd4;	// [Cnd]の[sppl_grp_p.bp_grp_cd4]を[Cnd_sppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm4;	// [Cnd]の[sppl_grp_p.bp_grp_nm4]を[Cnd_sppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab5;	// [Cnd]の[sppl_grp_p.bp_grp_lab5]を[Cnd_sppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg5;	// [Cnd]の[sppl_grp_p.bp_grp_flg5]を[Cnd_sppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd5;	// [Cnd]の[sppl_grp_p.bp_grp_cd5]を[Cnd_sppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm5;	// [Cnd]の[sppl_grp_p.bp_grp_nm5]を[Cnd_sppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab6;	// [Cnd]の[sppl_grp_p.bp_grp_lab6]を[Cnd_sppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg6;	// [Cnd]の[sppl_grp_p.bp_grp_flg6]を[Cnd_sppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd6;	// [Cnd]の[sppl_grp_p.bp_grp_cd6]を[Cnd_sppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm6;	// [Cnd]の[sppl_grp_p.bp_grp_nm6]を[Cnd_sppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab7;	// [Cnd]の[sppl_grp_p.bp_grp_lab7]を[Cnd_sppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg7;	// [Cnd]の[sppl_grp_p.bp_grp_flg7]を[Cnd_sppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd7;	// [Cnd]の[sppl_grp_p.bp_grp_cd7]を[Cnd_sppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm7;	// [Cnd]の[sppl_grp_p.bp_grp_nm7]を[Cnd_sppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab8;	// [Cnd]の[sppl_grp_p.bp_grp_lab8]を[Cnd_sppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg8;	// [Cnd]の[sppl_grp_p.bp_grp_flg8]を[Cnd_sppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd8;	// [Cnd]の[sppl_grp_p.bp_grp_cd8]を[Cnd_sppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm8;	// [Cnd]の[sppl_grp_p.bp_grp_nm8]を[Cnd_sppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab9;	// [Cnd]の[sppl_grp_p.bp_grp_lab9]を[Cnd_sppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg9;	// [Cnd]の[sppl_grp_p.bp_grp_flg9]を[Cnd_sppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd9;	// [Cnd]の[sppl_grp_p.bp_grp_cd9]を[Cnd_sppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm9;	// [Cnd]の[sppl_grp_p.bp_grp_nm9]を[Cnd_sppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab10;	// [Cnd]の[sppl_grp_p.bp_grp_lab10]を[Cnd_sppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg10;	// [Cnd]の[sppl_grp_p.bp_grp_flg10]を[Cnd_sppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd10;	// [Cnd]の[sppl_grp_p.bp_grp_cd10]を[Cnd_sppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm10;	// [Cnd]の[sppl_grp_p.bp_grp_nm10]を[Cnd_sppl_grp_nm10]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0250.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slip_prnt_flg = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCColumnConfig columnDtl_latest_flg = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slip_sts_typ = null;
	/**
	 * Slips status name 伝票状況名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slip_sts_typ_nm = null;
	/**
	 * Delivery note creating source type 納品書作成元区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dlv_slip_src_typ = null;
	/**
	 * Delivery note creating source type name 納品書作成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dlv_slip_src_typ_nm = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_no = null;
	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_rev = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_no = null;
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_seq = null;
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_rev = null;
	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_mng_no = null;
	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_mng_seq = null;
	/**
	 * Delivery order G No. 納入指示ＧＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_inst_grp_no = null;
	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prms_rcpt_grp_no = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_rqst_dt = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_nm = null;
	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cntct_dpt = null;
	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cntct_psn = null;
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_usr_nm = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dpt_nm = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_rmrks = null;
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_dlv_slip_no = null;
	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_dlv_slip_seq = null;
	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_dlv_slip_rev = null;
	/**
	 * Multiple direct delivery delivery notes 仕入直送納品書複数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_dlv_slip_multi_flg = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_bp_grp_p_PPanel;
	public MCColumnConfig columnDtl_bp_grp_cd1;// [Dtl]の[bp_grp_p.bp_grp_cd1]を[columnDtl_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm1;// [Dtl]の[bp_grp_p.bp_grp_nm1]を[columnDtl_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd2;// [Dtl]の[bp_grp_p.bp_grp_cd2]を[columnDtl_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm2;// [Dtl]の[bp_grp_p.bp_grp_nm2]を[columnDtl_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd3;// [Dtl]の[bp_grp_p.bp_grp_cd3]を[columnDtl_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm3;// [Dtl]の[bp_grp_p.bp_grp_nm3]を[columnDtl_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd4;// [Dtl]の[bp_grp_p.bp_grp_cd4]を[columnDtl_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm4;// [Dtl]の[bp_grp_p.bp_grp_nm4]を[columnDtl_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd5;// [Dtl]の[bp_grp_p.bp_grp_cd5]を[columnDtl_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm5;// [Dtl]の[bp_grp_p.bp_grp_nm5]を[columnDtl_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd6;// [Dtl]の[bp_grp_p.bp_grp_cd6]を[columnDtl_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm6;// [Dtl]の[bp_grp_p.bp_grp_nm6]を[columnDtl_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd7;// [Dtl]の[bp_grp_p.bp_grp_cd7]を[columnDtl_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm7;// [Dtl]の[bp_grp_p.bp_grp_nm7]を[columnDtl_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd8;// [Dtl]の[bp_grp_p.bp_grp_cd8]を[columnDtl_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm8;// [Dtl]の[bp_grp_p.bp_grp_nm8]を[columnDtl_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd9;// [Dtl]の[bp_grp_p.bp_grp_cd9]を[columnDtl_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm9;// [Dtl]の[bp_grp_p.bp_grp_nm9]を[columnDtl_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd10;// [Dtl]の[bp_grp_p.bp_grp_cd10]を[columnDtl_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm10;// [Dtl]の[bp_grp_p.bp_grp_nm10]を[columnDtl_bp_grp_nm10]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Issue report 帳票発行.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [PRNT_DLV_SLIP]モードを表す定数 */
	public static final String PRNT_DLV_SLIP = "PRNT_DLV_SLIP";
	/** [PRNT_PURC_DDLV_SLIP]モードを表す定数 */
	public static final String PRNT_PURC_DDLV_SLIP = "PRNT_PURC_DDLV_SLIP";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, PRNT_DLV_SLIP, PRNT_PURC_DDLV_SLIP};
	
	/** [MS_MSBDL0250_Srch01]のCallerの作成 */
	protected MSBDP_PurcDlvSlipPrnt_MC.MS_MSBDL0250_Srch01Caller createMS_MSBDL0250_Srch01() {
		MSBDP_PurcDlvSlipPrnt_MC.MS_MSBDL0250_Srch01Caller<MSBDP_PurcDlvSlipPrnt, MS_MSBDL0250_Srch01Bridge>
		caller = ((MSBDP_PurcDlvSlipPrnt_MC)this).new MS_MSBDL0250_Srch01Caller<MSBDP_PurcDlvSlipPrnt, MS_MSBDL0250_Srch01Bridge>(
					(MSBDP_PurcDlvSlipPrnt)this, new MS_MSBDL0250_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0250_Srch01]の呼び出し */
	protected void callMS_MSBDL0250_Srch01() {
		MCCaller caller = createMS_MSBDL0250_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0250_Prnt01]のCallerの作成 */
	protected MSBDP_PurcDlvSlipPrnt_MC.MS_MSBDL0250_Prnt01Caller createMS_MSBDL0250_Prnt01() {
		MSBDP_PurcDlvSlipPrnt_MC.MS_MSBDL0250_Prnt01Caller<MSBDP_PurcDlvSlipPrnt, MS_MSBDL0250_Prnt01Bridge>
		caller = ((MSBDP_PurcDlvSlipPrnt_MC)this).new MS_MSBDL0250_Prnt01Caller<MSBDP_PurcDlvSlipPrnt, MS_MSBDL0250_Prnt01Bridge>(
					(MSBDP_PurcDlvSlipPrnt)this, new MS_MSBDL0250_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0250_Prnt01]の呼び出し */
	protected void callMS_MSBDL0250_Prnt01() {
		MCCaller caller = createMS_MSBDL0250_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0250.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0250.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0250.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0250.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0250.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0250.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0250.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBD.MSBDP0250.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0250.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBD.MSBDP0250.DtlR createDtlR() {
		return mcframe.clientMSBD.MSBDP0250.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0250.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0250.DtlR.class);
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
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBD.MSBDP0250.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0250.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0250.BtnR createBtnR() {
		return mcframe.clientMSBD.MSBDP0250.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Btn")) return getBtnR();
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
		ret.add(DlvPrntPanel);
		ret.add(TOPPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(SpplCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcDlvSlipPrnt_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PurcDlvSlipPrnt_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateScreenOpe((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateDlvPrnt((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateTOP((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateFold((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateTab1((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateTab2((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateSpplCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateCtrl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateDtl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbCreateBtn((MSBDP_PurcDlvSlipPrnt)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 * [DlvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvPrnt(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 * [TOP]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTOP(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 * [SpplCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplCnd(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PurcDlvSlipPrnt p) {
		p.Cnd_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().sppl_grp_p());
		p.Cnd_sppl_grp_p_PPanel.setName("Cnd.sppl_grp_p");
		p.Cnd_sppl_grp_lab1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_sppl_grp_lab1.addAliasName("Cnd.sppl_grp_lab1", p);
		p.Cnd_sppl_grp_flg1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_sppl_grp_flg1.addAliasName("Cnd.sppl_grp_flg1", p);
		p.Cnd_sppl_grp_cd1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_sppl_grp_cd1.addAliasName("Cnd.sppl_grp_cd1", p);
		p.Cnd_sppl_grp_nm1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_sppl_grp_nm1.addAliasName("Cnd.sppl_grp_nm1", p);
		p.Cnd_sppl_grp_lab2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_sppl_grp_lab2.addAliasName("Cnd.sppl_grp_lab2", p);
		p.Cnd_sppl_grp_flg2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_sppl_grp_flg2.addAliasName("Cnd.sppl_grp_flg2", p);
		p.Cnd_sppl_grp_cd2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_sppl_grp_cd2.addAliasName("Cnd.sppl_grp_cd2", p);
		p.Cnd_sppl_grp_nm2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_sppl_grp_nm2.addAliasName("Cnd.sppl_grp_nm2", p);
		p.Cnd_sppl_grp_lab3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_sppl_grp_lab3.addAliasName("Cnd.sppl_grp_lab3", p);
		p.Cnd_sppl_grp_flg3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_sppl_grp_flg3.addAliasName("Cnd.sppl_grp_flg3", p);
		p.Cnd_sppl_grp_cd3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_sppl_grp_cd3.addAliasName("Cnd.sppl_grp_cd3", p);
		p.Cnd_sppl_grp_nm3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_sppl_grp_nm3.addAliasName("Cnd.sppl_grp_nm3", p);
		p.Cnd_sppl_grp_lab4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_sppl_grp_lab4.addAliasName("Cnd.sppl_grp_lab4", p);
		p.Cnd_sppl_grp_flg4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_sppl_grp_flg4.addAliasName("Cnd.sppl_grp_flg4", p);
		p.Cnd_sppl_grp_cd4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_sppl_grp_cd4.addAliasName("Cnd.sppl_grp_cd4", p);
		p.Cnd_sppl_grp_nm4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_sppl_grp_nm4.addAliasName("Cnd.sppl_grp_nm4", p);
		p.Cnd_sppl_grp_lab5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_sppl_grp_lab5.addAliasName("Cnd.sppl_grp_lab5", p);
		p.Cnd_sppl_grp_flg5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_sppl_grp_flg5.addAliasName("Cnd.sppl_grp_flg5", p);
		p.Cnd_sppl_grp_cd5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_sppl_grp_cd5.addAliasName("Cnd.sppl_grp_cd5", p);
		p.Cnd_sppl_grp_nm5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_sppl_grp_nm5.addAliasName("Cnd.sppl_grp_nm5", p);
		p.Cnd_sppl_grp_lab6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_sppl_grp_lab6.addAliasName("Cnd.sppl_grp_lab6", p);
		p.Cnd_sppl_grp_flg6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_sppl_grp_flg6.addAliasName("Cnd.sppl_grp_flg6", p);
		p.Cnd_sppl_grp_cd6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_sppl_grp_cd6.addAliasName("Cnd.sppl_grp_cd6", p);
		p.Cnd_sppl_grp_nm6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_sppl_grp_nm6.addAliasName("Cnd.sppl_grp_nm6", p);
		p.Cnd_sppl_grp_lab7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_sppl_grp_lab7.addAliasName("Cnd.sppl_grp_lab7", p);
		p.Cnd_sppl_grp_flg7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_sppl_grp_flg7.addAliasName("Cnd.sppl_grp_flg7", p);
		p.Cnd_sppl_grp_cd7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_sppl_grp_cd7.addAliasName("Cnd.sppl_grp_cd7", p);
		p.Cnd_sppl_grp_nm7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_sppl_grp_nm7.addAliasName("Cnd.sppl_grp_nm7", p);
		p.Cnd_sppl_grp_lab8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_sppl_grp_lab8.addAliasName("Cnd.sppl_grp_lab8", p);
		p.Cnd_sppl_grp_flg8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_sppl_grp_flg8.addAliasName("Cnd.sppl_grp_flg8", p);
		p.Cnd_sppl_grp_cd8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_sppl_grp_cd8.addAliasName("Cnd.sppl_grp_cd8", p);
		p.Cnd_sppl_grp_nm8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_sppl_grp_nm8.addAliasName("Cnd.sppl_grp_nm8", p);
		p.Cnd_sppl_grp_lab9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_sppl_grp_lab9.addAliasName("Cnd.sppl_grp_lab9", p);
		p.Cnd_sppl_grp_flg9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_sppl_grp_flg9.addAliasName("Cnd.sppl_grp_flg9", p);
		p.Cnd_sppl_grp_cd9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_sppl_grp_cd9.addAliasName("Cnd.sppl_grp_cd9", p);
		p.Cnd_sppl_grp_nm9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_sppl_grp_nm9.addAliasName("Cnd.sppl_grp_nm9", p);
		p.Cnd_sppl_grp_lab10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_sppl_grp_lab10.addAliasName("Cnd.sppl_grp_lab10", p);
		p.Cnd_sppl_grp_flg10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_sppl_grp_flg10.addAliasName("Cnd.sppl_grp_flg10", p);
		p.Cnd_sppl_grp_cd10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_sppl_grp_cd10.addAliasName("Cnd.sppl_grp_cd10", p);
		p.Cnd_sppl_grp_nm10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_sppl_grp_nm10.addAliasName("Cnd.sppl_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBDP_PurcDlvSlipPrnt p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBDP_PurcDlvSlipPrnt p) {
		p.Dtl_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBD.MSBDP0250.DtlR.$bp_grp_p);
		p.Dtl_bp_grp_p_PPanel.setName("Dtl.bp_grp_p");
		p.columnDtl_bp_grp_cd1 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_bp_grp_cd1.addAliasName("Dtl.bp_grp_cd1", p);
		p.columnDtl_bp_grp_nm1 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_bp_grp_nm1.addAliasName("Dtl.bp_grp_nm1", p);
		p.columnDtl_bp_grp_cd2 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_bp_grp_cd2.addAliasName("Dtl.bp_grp_cd2", p);
		p.columnDtl_bp_grp_nm2 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_bp_grp_nm2.addAliasName("Dtl.bp_grp_nm2", p);
		p.columnDtl_bp_grp_cd3 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_bp_grp_cd3.addAliasName("Dtl.bp_grp_cd3", p);
		p.columnDtl_bp_grp_nm3 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_bp_grp_nm3.addAliasName("Dtl.bp_grp_nm3", p);
		p.columnDtl_bp_grp_cd4 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_bp_grp_cd4.addAliasName("Dtl.bp_grp_cd4", p);
		p.columnDtl_bp_grp_nm4 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_bp_grp_nm4.addAliasName("Dtl.bp_grp_nm4", p);
		p.columnDtl_bp_grp_cd5 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_bp_grp_cd5.addAliasName("Dtl.bp_grp_cd5", p);
		p.columnDtl_bp_grp_nm5 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_bp_grp_nm5.addAliasName("Dtl.bp_grp_nm5", p);
		p.columnDtl_bp_grp_cd6 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_bp_grp_cd6.addAliasName("Dtl.bp_grp_cd6", p);
		p.columnDtl_bp_grp_nm6 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_bp_grp_nm6.addAliasName("Dtl.bp_grp_nm6", p);
		p.columnDtl_bp_grp_cd7 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_bp_grp_cd7.addAliasName("Dtl.bp_grp_cd7", p);
		p.columnDtl_bp_grp_nm7 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_bp_grp_nm7.addAliasName("Dtl.bp_grp_nm7", p);
		p.columnDtl_bp_grp_cd8 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_bp_grp_cd8.addAliasName("Dtl.bp_grp_cd8", p);
		p.columnDtl_bp_grp_nm8 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_bp_grp_nm8.addAliasName("Dtl.bp_grp_nm8", p);
		p.columnDtl_bp_grp_cd9 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_bp_grp_cd9.addAliasName("Dtl.bp_grp_cd9", p);
		p.columnDtl_bp_grp_nm9 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_bp_grp_nm9.addAliasName("Dtl.bp_grp_nm9", p);
		p.columnDtl_bp_grp_cd10 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_bp_grp_cd10.addAliasName("Dtl.bp_grp_cd10", p);
		p.columnDtl_bp_grp_nm10 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_bp_grp_nm10.addAliasName("Dtl.bp_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PurcDlvSlipPrnt p) {
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

	
	/** [Cnd_purc_dlv_slip_src_typ_ListPutter]の定義 */
	private MCListPutter Cnd_purc_dlv_slip_src_typ_p = null;

	/**
	 * [Cnd_purc_dlv_slip_src_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_dlv_slip_src_typ_ListPutter() {
		if (Cnd_purc_dlv_slip_src_typ_p == null) {
			Cnd_purc_dlv_slip_src_typ_p = createCnd_purc_dlv_slip_src_typ_ListPutter(Cnd_purc_dlv_slip_src_typ, "purc_dlv_slip_src_typ", "purc_dlv_slip_src_typ_nm");

		}
		return Cnd_purc_dlv_slip_src_typ_p;
	}
	
	
	/** [Cnd_purc_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_usr_cd_p = null;

	/**
	 * [Cnd_purc_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_usr_cd_ListPutter() {
		if (Cnd_purc_usr_cd_p == null) {
			Cnd_purc_usr_cd_p = createCnd_purc_usr_cd_ListPutter(Cnd_purc_usr_cd, "purc_usr_cd", "purc_usr_nm");

		}
		return Cnd_purc_usr_cd_p;
	}
	
	
	/** [Cnd_purc_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_dpt_cd_p = null;

	/**
	 * [Cnd_purc_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_dpt_cd_ListPutter() {
		if (Cnd_purc_dpt_cd_p == null) {
			Cnd_purc_dpt_cd_p = createCnd_purc_dpt_cd_ListPutter(Cnd_purc_dpt_cd, "purc_dpt_cd", "purc_dpt_nm");

		}
		return Cnd_purc_dpt_cd_p;
	}
	
	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcDlvSlipPrnt create(){
		MSBDP_PurcDlvSlipPrnt p = new MSBDP_PurcDlvSlipPrnt();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcDlvSlipPrnt create(String name){
		MSBDP_PurcDlvSlipPrnt p = new MSBDP_PurcDlvSlipPrnt(name);
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
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitScreenOpe((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitDlvPrnt((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitTOP((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitFold((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitTab1((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitTab2((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitSpplCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitCtrl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitDtl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbfInitBtn((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitScreenOpe((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitDlvPrnt((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitTOP((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitFold((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitTab1((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitTab2((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitSpplCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitCtrl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitDtl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.jbInitBtn((MSBDP_PurcDlvSlipPrnt)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DlvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvPrnt(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.DlvPrntPanel = p.beansFactory.createPanel("DlvPrnt");
		p.DlvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTOP(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.TOPPanel = p.beansFactory.createPanel("TOP");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBDP_PurcDlvSlipPrnt p) {
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
	protected static void jbfInitTab1(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplCnd(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.SpplCndPanel = p.beansFactory.createPanel("SpplCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_DLVSLIP = p.beansFactory.createRadioButton("Cnd.ope_DLVSLIP");
		p.Cnd_ope_PURCDDLVSLIP = p.beansFactory.createRadioButton("Cnd.ope_PURCDDLVSLIP");
		p.Cnd_not_dlv_prnt_flg = p.beansFactory.createCheckBox("Cnd.not_dlv_prnt_flg");
		p.Cnd_dlv_prnt_flg = p.beansFactory.createCheckBox("Cnd.dlv_prnt_flg");
		p.Cnd_dlv_rqst_dt_fr_Label = p.beansFactory.createLabel("Cnd.dlv_rqst_dt_fr_Label");
		p.Cnd_dlv_rqst_dt_fr = p.beansFactory.createDateField("Cnd.dlv_rqst_dt_fr");
		p.Cnd_dlv_rqst_dt_fr.setLabel(p.Cnd_dlv_rqst_dt_fr_Label);
		p.Cnd_dlv_rqst_dt_to_Label = p.beansFactory.createLabel("Cnd.dlv_rqst_dt_to_Label");
		p.Cnd_dlv_rqst_dt_to = p.beansFactory.createDateField("Cnd.dlv_rqst_dt_to");
		p.Cnd_dlv_rqst_dt_to.setLabel(p.Cnd_dlv_rqst_dt_to_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_po_rev = p.beansFactory.createNumberField("Cnd.po_rev");
		p.Cnd_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_no_Label");
		p.Cnd_dlv_slip_no = p.beansFactory.createTextField("Cnd.dlv_slip_no");
		p.Cnd_dlv_slip_no.setLabel(p.Cnd_dlv_slip_no_Label);
		p.Cnd_dlv_slip_seq_Label = p.beansFactory.createLabel("Cnd.dlv_slip_seq_Label");
		p.Cnd_dlv_slip_seq = p.beansFactory.createNumberField("Cnd.dlv_slip_seq");
		p.Cnd_dlv_slip_seq.setLabel(p.Cnd_dlv_slip_seq_Label);
		p.Cnd_purc_dlv_slip_src_typ_Label = p.beansFactory.createLabel("Cnd.purc_dlv_slip_src_typ_Label");
		p.Cnd_purc_dlv_slip_src_typ = p.beansFactory.createTextComboBox("Cnd.purc_dlv_slip_src_typ");
		p.Cnd_purc_dlv_slip_src_typ.setLabel(p.Cnd_purc_dlv_slip_src_typ_Label);
		p.Cnd_purc_dlv_slip_src_typ_nm = p.beansFactory.createTextField("Cnd.purc_dlv_slip_src_typ_nm");
		p.Cnd_purc_ddlv_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.purc_ddlv_dlv_slip_no_Label");
		p.Cnd_purc_ddlv_dlv_slip_no = p.beansFactory.createTextField("Cnd.purc_ddlv_dlv_slip_no");
		p.Cnd_purc_ddlv_dlv_slip_no.setLabel(p.Cnd_purc_ddlv_dlv_slip_no_Label);
		p.Cnd_purc_usr_cd_Label = p.beansFactory.createLabel("Cnd.purc_usr_cd_Label");
		p.Cnd_purc_usr_cd = p.beansFactory.createTextField("Cnd.purc_usr_cd");
		p.Cnd_purc_usr_cd.setLabel(p.Cnd_purc_usr_cd_Label);
		p.Cnd_purc_usr_nm = p.beansFactory.createTextField("Cnd.purc_usr_nm");
		p.Cnd_purc_dpt_cd_Label = p.beansFactory.createLabel("Cnd.purc_dpt_cd_Label");
		p.Cnd_purc_dpt_cd = p.beansFactory.createTextField("Cnd.purc_dpt_cd");
		p.Cnd_purc_dpt_cd.setLabel(p.Cnd_purc_dpt_cd_Label);
		p.Cnd_purc_dpt_nm = p.beansFactory.createTextField("Cnd.purc_dpt_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_inv_can_flg = p.beansFactory.createCheckBox("Cnd.inv_can_flg");
		p.Cnd_inv_non_prnt_flg = p.beansFactory.createCheckBox("Cnd.inv_non_prnt_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_slip_prnt_flg = p.beansFactory.createTableColumn("Dtl.slip_prnt_flg", MCColumnType.CHECK);
		p.columnDtl_latest_flg = p.beansFactory.createTableColumn("Dtl.latest_flg", MCColumnType.CHECK);
		p.columnDtl_slip_sts_typ = p.beansFactory.createTableColumn("Dtl.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtl_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_purc_dlv_slip_src_typ = p.beansFactory.createTableColumn("Dtl.purc_dlv_slip_src_typ", MCColumnType.TEXT);
		p.columnDtl_purc_dlv_slip_src_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_dlv_slip_src_typ_nm", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_po_rev = p.beansFactory.createTableColumn("Dtl.po_rev", MCColumnType.NUMBER);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_seq = p.beansFactory.createTableColumn("Dtl.dlv_slip_seq", MCColumnType.NUMBER);
		p.columnDtl_dlv_slip_rev = p.beansFactory.createTableColumn("Dtl.dlv_slip_rev", MCColumnType.NUMBER);
		p.columnDtl_dlv_slip_mng_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_mng_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_mng_seq = p.beansFactory.createTableColumn("Dtl.dlv_slip_mng_seq", MCColumnType.NUMBER);
		p.columnDtl_dlv_inst_grp_no = p.beansFactory.createTableColumn("Dtl.dlv_inst_grp_no", MCColumnType.TEXT);
		p.columnDtl_prms_rcpt_grp_no = p.beansFactory.createTableColumn("Dtl.prms_rcpt_grp_no", MCColumnType.TEXT);
		p.columnDtl_dlv_rqst_dt = p.beansFactory.createTableColumn("Dtl.dlv_rqst_dt", MCColumnType.DATE);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_cntct_dpt = p.beansFactory.createTableColumn("Dtl.sppl_cntct_dpt", MCColumnType.TEXT);
		p.columnDtl_sppl_cntct_psn = p.beansFactory.createTableColumn("Dtl.sppl_cntct_psn", MCColumnType.TEXT);
		p.columnDtl_purc_usr_cd = p.beansFactory.createTableColumn("Dtl.purc_usr_cd", MCColumnType.TEXT);
		p.columnDtl_purc_usr_nm = p.beansFactory.createTableColumn("Dtl.purc_usr_nm", MCColumnType.TEXT);
		p.columnDtl_purc_dpt_cd = p.beansFactory.createTableColumn("Dtl.purc_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_purc_dpt_nm = p.beansFactory.createTableColumn("Dtl.purc_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_trd_rmrks = p.beansFactory.createTableColumn("Dtl.trd_rmrks", MCColumnType.TEXT);
		p.columnDtl_purc_ddlv_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.purc_ddlv_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_purc_ddlv_dlv_slip_seq = p.beansFactory.createTableColumn("Dtl.purc_ddlv_dlv_slip_seq", MCColumnType.NUMBER);
		p.columnDtl_purc_ddlv_dlv_slip_rev = p.beansFactory.createTableColumn("Dtl.purc_ddlv_dlv_slip_rev", MCColumnType.NUMBER);
		p.columnDtl_purc_ddlv_dlv_slip_multi_flg = p.beansFactory.createTableColumn("Dtl.purc_ddlv_dlv_slip_multi_flg", MCColumnType.CHECK);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.DlvPrntPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvPrnt(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.DlvPrntPanel.setBorder(p.DlvPrntTitledBorder);
		p.add(p.DlvPrntPanel);
		p.DlvPrntPanel.setNextBeans(p.TOPPanel);
		p.DlvPrntPanel.setValueCheck(false);
		p.DlvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvPrntPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTOP(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.add(p.TOPPanel);
		p.TOPPanel.setNextBeans(p.DtlPanel);
		p.TOPPanel.setValueCheck(false);
		p.TOPPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TOPPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TOPPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TOPPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TOPPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBDP_PurcDlvSlipPrnt p) {
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
	protected static void jbInitTab1(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.SpplCndPanel, null);
		p.Tab2Panel.setLastBeans(p.SpplCndPanel);
	}

	/**
	 * [SpplCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplCnd(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.SpplCndPanel.setValueCheck(false);
		p.SpplCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SpplCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_DLVSLIP);
		p.Cnd_ope_DLVSLIP.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_DLVSLIP);
		p.ScreenOpePanel.add(p.Cnd_ope_DLVSLIP);
		p.Cnd_ope_DLVSLIP.setNextBeans(p.Cnd_ope_PURCDDLVSLIP);
		p.Cnd_ope_PURCDDLVSLIP.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_PURCDDLVSLIP);
		p.ScreenOpePanel.add(p.Cnd_ope_PURCDDLVSLIP);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.ope_META);
		p.DlvPrntPanel.add(p.Cnd_not_dlv_prnt_flg);
		p.DlvPrntPanel.setLastBeans(p.Cnd_not_dlv_prnt_flg);
		p.Cnd_not_dlv_prnt_flg.setNextBeans(p.Cnd_dlv_prnt_flg);
		p.Cnd_not_dlv_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.not_dlv_prnt_flg_META);
		p.DlvPrntPanel.add(p.Cnd_dlv_prnt_flg);
		p.Cnd_dlv_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.dlv_prnt_flg_META);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_dlv_rqst_dt_fr);
		p.Cnd_dlv_rqst_dt_fr.setNextBeans(p.Cnd_dlv_rqst_dt_to);
		p.Cnd_dlv_rqst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.dlv_rqst_dt_fr_META);
		p.Cnd_dlv_rqst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_to_Label);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_to);
		p.Cnd_dlv_rqst_dt_to.setNextBeans(p.Cnd_po_no);
		p.Cnd_dlv_rqst_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.dlv_rqst_dt_to_META);
		p.Cnd_dlv_rqst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_po_rev);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_po_rev);
		p.Cnd_po_rev.setNextBeans(p.Cnd_dlv_slip_no);
		p.Cnd_po_rev.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.po_rev_META);
		p.CndPanel.add(p.Cnd_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_no);
		p.Cnd_dlv_slip_no.setNextBeans(p.Cnd_dlv_slip_seq);
		p.Cnd_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_dlv_slip_seq_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_seq);
		p.Cnd_dlv_slip_seq.setNextBeans(p.Cnd_purc_dlv_slip_src_typ);
		p.Cnd_dlv_slip_seq.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.dlv_slip_seq_META);
		p.Cnd_purc_dlv_slip_src_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_dlv_slip_src_typ, true);
		p.Cnd_purc_dlv_slip_src_typ.setLinkBeans(p.Cnd_purc_dlv_slip_src_typ_nm);
		p.CndPanel.add(p.Cnd_purc_dlv_slip_src_typ_Label);
		p.CndPanel.add(p.Cnd_purc_dlv_slip_src_typ);
		p.Cnd_purc_dlv_slip_src_typ.setNextBeans(p.Cnd_purc_dlv_slip_src_typ_nm);
		p.Cnd_purc_dlv_slip_src_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.purc_dlv_slip_src_typ_META);
		p.CndPanel.add(p.Cnd_purc_dlv_slip_src_typ_nm);
		p.Cnd_purc_dlv_slip_src_typ_nm.setNextBeans(p.Cnd_purc_ddlv_dlv_slip_no);
		p.Cnd_purc_dlv_slip_src_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.purc_dlv_slip_src_typ_nm_META);
		p.CndPanel.add(p.Cnd_purc_ddlv_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_purc_ddlv_dlv_slip_no);
		p.Cnd_purc_ddlv_dlv_slip_no.setNextBeans(p.Cnd_purc_usr_cd);
		p.Cnd_purc_ddlv_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.purc_ddlv_dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_purc_ddlv_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_purc_usr_cd_Label);
		p.CndPanel.add(p.Cnd_purc_usr_cd);
		p.Cnd_purc_usr_cd.setNextBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.purc_usr_cd_META);
		p.Cnd_purc_usr_cd.addLinkBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_usr_cd, true);
		p.CndPanel.add(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_nm.setNextBeans(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_usr_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.purc_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_usr_nm, true);
		p.CndPanel.add(p.Cnd_purc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_dpt_cd.setNextBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.purc_dpt_cd_META);
		p.Cnd_purc_dpt_cd.addLinkBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_dpt_cd, true);
		p.CndPanel.add(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_purc_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.purc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_dpt_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.trd_rmrks_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_inv_can_flg);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.latest_flg_META);
		p.CndPanel.add(p.Cnd_inv_can_flg);
		p.Cnd_inv_can_flg.setNextBeans(p.Cnd_inv_non_prnt_flg);
		p.Cnd_inv_can_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.inv_can_flg_META);
		p.CndPanel.add(p.Cnd_inv_non_prnt_flg);
		p.Cnd_inv_non_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0250.CndR.inv_non_prnt_flg_META);
		p.SpplCndPanel.add(p.Cnd_sppl_grp_p_PPanel);
		p.SpplCndPanel.setLastBeans(p.Cnd_sppl_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBDP_PurcDlvSlipPrnt p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setNextBeans(p.Btn_select_all);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBD.MSBDP0250.BtnR.indiv_prnt_flg_META);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
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
		MSBDP_PurcDlvSlipPrnt_MC.mcInitScreenOpe((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitDlvPrnt((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitTOP((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitFold((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitTab1((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitTab2((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitSpplCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitCtrl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitDtl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.mcInitBtn((MSBDP_PurcDlvSlipPrnt)this);

		// [SRCH]ステータスのモードの設定
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_ScreenOpe((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_DlvPrnt((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_TOP((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_Fold((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_Tab1((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_Tab2((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_SpplCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_Cnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_Ctrl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_Dtl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitSRCH_Btn((MSBDP_PurcDlvSlipPrnt)this);

		// [PRNT_DLV_SLIP]ステータスのモードの設定
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_ScreenOpe((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_DlvPrnt((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_TOP((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_Fold((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_Tab1((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_Tab2((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_SpplCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_Cnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_Ctrl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_Dtl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__DLV__SLIP_Btn((MSBDP_PurcDlvSlipPrnt)this);

		// [PRNT_PURC_DDLV_SLIP]ステータスのモードの設定
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_ScreenOpe((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_DlvPrnt((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_TOP((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_Fold((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_Tab1((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_Tab2((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_SpplCnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_Cnd((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_Ctrl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_Dtl((MSBDP_PurcDlvSlipPrnt)this);
		MSBDP_PurcDlvSlipPrnt_MC.statusInitPRNT__PURC__DDLV__SLIP_Btn((MSBDP_PurcDlvSlipPrnt)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 *  [DlvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvPrnt(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 *  [TOP]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTOP(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBDP_PurcDlvSlipPrnt p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 *  [SpplCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplCnd(MSBDP_PurcDlvSlipPrnt p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PurcDlvSlipPrnt p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_DLVSLIP.addAllListener(p);
		p.Cnd_ope_PURCDDLVSLIP.addAllListener(p);
		p.Cnd_not_dlv_prnt_flg.addAllListener(p);
		p.Cnd_dlv_prnt_flg.addAllListener(p);
		p.Cnd_dlv_rqst_dt_fr.setListListener(p);
		p.Cnd_dlv_rqst_dt_fr.addAllListener(p);
		p.Cnd_dlv_rqst_dt_to.setListListener(p);
		p.Cnd_dlv_rqst_dt_to.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_po_rev.setListListener(p);
		p.Cnd_po_rev.addAllListener(p);
		p.Cnd_dlv_slip_no.setListListener(p);
		p.Cnd_dlv_slip_no.addAllListener(p);
		p.Cnd_dlv_slip_seq.setListListener(p);
		p.Cnd_dlv_slip_seq.addAllListener(p);
		p.Cnd_purc_dlv_slip_src_typ.setListListener(p);
		p.Cnd_purc_dlv_slip_src_typ.addAllListener(p);
		p.Cnd_purc_dlv_slip_src_typ_nm.setListListener(p);
		p.Cnd_purc_dlv_slip_src_typ_nm.addAllListener(p);
		p.Cnd_purc_ddlv_dlv_slip_no.setListListener(p);
		p.Cnd_purc_ddlv_dlv_slip_no.addAllListener(p);
		p.Cnd_purc_usr_cd.setListListener(p);
		p.Cnd_purc_usr_cd.addAllListener(p);
		p.Cnd_purc_usr_nm.setListListener(p);
		p.Cnd_purc_usr_nm.addAllListener(p);
		p.Cnd_purc_dpt_cd.setListListener(p);
		p.Cnd_purc_dpt_cd.addAllListener(p);
		p.Cnd_purc_dpt_nm.setListListener(p);
		p.Cnd_purc_dpt_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_inv_can_flg.addAllListener(p);
		p.Cnd_inv_non_prnt_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBDP_PurcDlvSlipPrnt p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBDP_PurcDlvSlipPrnt p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_slip_prnt_flg.addAllListener(p);
		p.columnDtl_latest_flg.addAllListener(p);
		p.columnDtl_slip_sts_typ.addAllListener(p);
		p.columnDtl_slip_sts_typ.setListListener(p);
		p.columnDtl_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl_slip_sts_typ_nm.setListListener(p);
		p.columnDtl_purc_dlv_slip_src_typ.addAllListener(p);
		p.columnDtl_purc_dlv_slip_src_typ.setListListener(p);
		p.columnDtl_purc_dlv_slip_src_typ_nm.addAllListener(p);
		p.columnDtl_purc_dlv_slip_src_typ_nm.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
		p.columnDtl_po_rev.addAllListener(p);
		p.columnDtl_po_rev.setListListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_seq.addAllListener(p);
		p.columnDtl_dlv_slip_seq.setListListener(p);
		p.columnDtl_dlv_slip_rev.addAllListener(p);
		p.columnDtl_dlv_slip_rev.setListListener(p);
		p.columnDtl_dlv_slip_mng_no.addAllListener(p);
		p.columnDtl_dlv_slip_mng_no.setListListener(p);
		p.columnDtl_dlv_slip_mng_seq.addAllListener(p);
		p.columnDtl_dlv_slip_mng_seq.setListListener(p);
		p.columnDtl_dlv_inst_grp_no.addAllListener(p);
		p.columnDtl_dlv_inst_grp_no.setListListener(p);
		p.columnDtl_prms_rcpt_grp_no.addAllListener(p);
		p.columnDtl_prms_rcpt_grp_no.setListListener(p);
		p.columnDtl_dlv_rqst_dt.addAllListener(p);
		p.columnDtl_dlv_rqst_dt.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.columnDtl_sppl_cntct_dpt.addAllListener(p);
		p.columnDtl_sppl_cntct_dpt.setListListener(p);
		p.columnDtl_sppl_cntct_psn.addAllListener(p);
		p.columnDtl_sppl_cntct_psn.setListListener(p);
		p.columnDtl_purc_usr_cd.addAllListener(p);
		p.columnDtl_purc_usr_cd.setListListener(p);
		p.columnDtl_purc_usr_nm.addAllListener(p);
		p.columnDtl_purc_usr_nm.setListListener(p);
		p.columnDtl_purc_dpt_cd.addAllListener(p);
		p.columnDtl_purc_dpt_cd.setListListener(p);
		p.columnDtl_purc_dpt_nm.addAllListener(p);
		p.columnDtl_purc_dpt_nm.setListListener(p);
		p.columnDtl_trd_rmrks.addAllListener(p);
		p.columnDtl_trd_rmrks.setListListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_no.addAllListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_no.setListListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_seq.addAllListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_seq.setListListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_rev.addAllListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_rev.setListListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_multi_flg.addAllListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBDP_PurcDlvSlipPrnt p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [SRCH]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvPrnt(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [SRCH]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TOP(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [SRCH]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SpplCnd(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBDP_PurcDlvSlipPrnt p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_not_dlv_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_po_rev.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_slip_seq.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_dlv_slip_src_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_dlv_slip_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inv_can_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inv_non_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBDP_PurcDlvSlipPrnt p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBDP_PurcDlvSlipPrnt p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slip_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_dlv_slip_src_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_dlv_slip_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prms_rcpt_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_dlv_slip_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBDP_PurcDlvSlipPrnt p){
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_ScreenOpe(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_DlvPrnt(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_TOP(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_Fold(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_Tab1(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_Tab2(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_SpplCnd(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_Cnd(MSBDP_PurcDlvSlipPrnt p){
		p.Cnd_ope_Group.putMode(p, PRNT_DLV_SLIP, MCMode.REQUIRED);
		p.Cnd_not_dlv_prnt_flg.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_prnt_flg.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_fr.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_to.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_po_rev.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_slip_seq.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_dlv_slip_src_typ.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_dlv_slip_src_typ_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_inv_can_flg.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_inv_non_prnt_flg.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(PRNT_DLV_SLIP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_Ctrl(MSBDP_PurcDlvSlipPrnt p){
		p.Ctrl_ctrl_PPanel.putStatus(PRNT_DLV_SLIP, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_Dtl(MSBDP_PurcDlvSlipPrnt p){
		p.columnDtl_check.putMode(p, PRNT_DLV_SLIP, MCMode.REQUIRED);
		p.columnDtl_slip_prnt_flg.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_latest_flg.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_dlv_slip_src_typ.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_dlv_slip_src_typ_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_po_rev.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_rev.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, PRNT_DLV_SLIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, PRNT_DLV_SLIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_grp_no.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_prms_rcpt_grp_no.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_dpt.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_usr_cd.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_usr_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_cd.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_seq.putMode(p, PRNT_DLV_SLIP, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_dlv_slip_rev.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_multi_flg.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(PRNT_DLV_SLIP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, PRNT_DLV_SLIP, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT_DLV_SLIP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV__SLIP_Btn(MSBDP_PurcDlvSlipPrnt p){
		p.Btn_prnt.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_DLV_SLIP, MCMode.ENABLE);

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_ScreenOpe(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_DlvPrnt(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_TOP(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_Fold(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_Tab1(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_Tab2(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_SpplCnd(MSBDP_PurcDlvSlipPrnt p){

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_Cnd(MSBDP_PurcDlvSlipPrnt p){
		p.Cnd_ope_Group.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.REQUIRED);
		p.Cnd_not_dlv_prnt_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_prnt_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_fr.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_to.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_po_rev.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_slip_seq.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_dlv_slip_src_typ.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_dlv_slip_src_typ_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_inv_can_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_inv_non_prnt_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(PRNT_PURC_DDLV_SLIP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_Ctrl(MSBDP_PurcDlvSlipPrnt p){
		p.Ctrl_ctrl_PPanel.putStatus(PRNT_PURC_DDLV_SLIP, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_Dtl(MSBDP_PurcDlvSlipPrnt p){
		p.columnDtl_check.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.REQUIRED);
		p.columnDtl_slip_prnt_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_latest_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_dlv_slip_src_typ.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_dlv_slip_src_typ_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_po_rev.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_rev.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_grp_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_prms_rcpt_grp_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_dpt.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_usr_cd.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_usr_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_cd.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_seq.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_dlv_slip_rev.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_multi_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.INVISIBLE);
		p.Dtl_bp_grp_p_PPanel.putStatus(PRNT_PURC_DDLV_SLIP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT_PURC_DDLV_SLIP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__PURC__DDLV__SLIP_Btn(MSBDP_PurcDlvSlipPrnt p){
		p.Btn_prnt.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_PURC_DDLV_SLIP, MCMode.ENABLE);

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
		MSBDP_PurcDlvSlipPrnt_MC.setTableConfigDtl((MSBDP_PurcDlvSlipPrnt)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBDP_PurcDlvSlipPrnt p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_slip_prnt_flg.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.slip_prnt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_prnt_flg);
		p.columnDtl_latest_flg.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.latest_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_latest_flg);
		p.columnDtl_slip_sts_typ.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.slip_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_sts_typ);
		p.columnDtl_slip_sts_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.slip_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_sts_typ_nm);
		p.columnDtl_purc_dlv_slip_src_typ.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_dlv_slip_src_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dlv_slip_src_typ);
		p.columnDtl_purc_dlv_slip_src_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_dlv_slip_src_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dlv_slip_src_typ_nm);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.columnDtl_po_rev.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.po_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_rev);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_dlv_slip_seq.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.dlv_slip_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_seq);
		p.columnDtl_dlv_slip_rev.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.dlv_slip_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_rev);
		p.columnDtl_dlv_slip_mng_no.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.dlv_slip_mng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_mng_no);
		p.columnDtl_dlv_slip_mng_seq.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.dlv_slip_mng_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_mng_seq);
		p.columnDtl_dlv_inst_grp_no.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.dlv_inst_grp_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_inst_grp_no);
		p.columnDtl_prms_rcpt_grp_no.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.prms_rcpt_grp_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prms_rcpt_grp_no);
		p.columnDtl_dlv_rqst_dt.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.dlv_rqst_dt_META);
		p.columnDtl_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_rqst_dt);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.columnDtl_sppl_cntct_dpt.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.sppl_cntct_dpt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cntct_dpt);
		p.columnDtl_sppl_cntct_psn.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.sppl_cntct_psn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cntct_psn);
		p.columnDtl_purc_usr_cd.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_usr_cd);
		p.columnDtl_purc_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_usr_nm);
		p.columnDtl_purc_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dpt_cd);
		p.columnDtl_purc_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dpt_nm);
		p.columnDtl_trd_rmrks.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.trd_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_rmrks);
		p.columnDtl_purc_ddlv_dlv_slip_no.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_ddlv_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_dlv_slip_no);
		p.columnDtl_purc_ddlv_dlv_slip_seq.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_ddlv_dlv_slip_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_dlv_slip_seq);
		p.columnDtl_purc_ddlv_dlv_slip_rev.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_ddlv_dlv_slip_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_dlv_slip_rev);
		p.columnDtl_purc_ddlv_dlv_slip_multi_flg.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.purc_ddlv_dlv_slip_multi_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_dlv_slip_multi_flg);
		p.DtlTable.addTable(p.Dtl_bp_grp_p_PPanel.BpGrpTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0250.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_purc_dlv_slip_src_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_purc_dlv_slip_src_typ.getListConfig().setPutter(getCnd_purc_dlv_slip_src_typ_ListPutter());
		Cnd_purc_usr_cd.getListConfig().setPutter(getCnd_purc_usr_cd_ListPutter());
		Cnd_purc_dpt_cd.getListConfig().setPutter(getCnd_purc_dpt_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
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
	 * この画面を[PRNT_DLV_SLIP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_DLV_SLIPStatus() {
		status = PRNT_DLV_SLIP;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT_PURC_DDLV_SLIP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_PURC_DDLV_SLIPStatus() {
		status = PRNT_PURC_DDLV_SLIP;
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
		else if (PRNT_DLV_SLIP.equals(status)) {
			setPRNT_DLV_SLIPStatus();
		}
		else if (PRNT_PURC_DDLV_SLIP.equals(status)) {
			setPRNT_PURC_DDLV_SLIPStatus();
		}
	}

	/**
	 * [Cnd_purc_dlv_slip_src_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_dlv_slip_src_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0050.PurcDlvSlipSrcTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_purc_dlv_slip_src_typ) return getCnd_purc_dlv_slip_src_typ(row, info);
		if(combo == Cnd_purc_usr_cd) return getCnd_purc_usr_cd(row, info);
		if(combo == Cnd_purc_dpt_cd) return getCnd_purc_dpt_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
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
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_not_dlv_prnt_flg) return doCnd_not_dlv_prnt_flg_VC(info);
		if (vc == Cnd_dlv_prnt_flg) return doCnd_dlv_prnt_flg_VC(info);
		if (vc == Cnd_dlv_rqst_dt_fr) return doCnd_dlv_rqst_dt_fr_VC(info);
		if (vc == Cnd_dlv_rqst_dt_to) return doCnd_dlv_rqst_dt_to_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_po_rev) return doCnd_po_rev_VC(info);
		if (vc == Cnd_dlv_slip_no) return doCnd_dlv_slip_no_VC(info);
		if (vc == Cnd_dlv_slip_seq) return doCnd_dlv_slip_seq_VC(info);
		if (vc == Cnd_purc_dlv_slip_src_typ) return doCnd_purc_dlv_slip_src_typ_VC(info);
		if (vc == Cnd_purc_dlv_slip_src_typ_nm) return doCnd_purc_dlv_slip_src_typ_nm_VC(info);
		if (vc == Cnd_purc_ddlv_dlv_slip_no) return doCnd_purc_ddlv_dlv_slip_no_VC(info);
		if (vc == Cnd_purc_usr_cd) return doCnd_purc_usr_cd_VC(info);
		if (vc == Cnd_purc_usr_nm) return doCnd_purc_usr_nm_VC(info);
		if (vc == Cnd_purc_dpt_cd) return doCnd_purc_dpt_cd_VC(info);
		if (vc == Cnd_purc_dpt_nm) return doCnd_purc_dpt_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Cnd_inv_can_flg) return doCnd_inv_can_flg_VC(info);
		if (vc == Cnd_inv_non_prnt_flg) return doCnd_inv_non_prnt_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_slip_prnt_flg) return doDtl_slip_prnt_flg_VC(info);
		if (vc == columnDtl_latest_flg) return doDtl_latest_flg_VC(info);
		if (vc == columnDtl_slip_sts_typ) return doDtl_slip_sts_typ_VC(info);
		if (vc == columnDtl_slip_sts_typ_nm) return doDtl_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl_purc_dlv_slip_src_typ) return doDtl_purc_dlv_slip_src_typ_VC(info);
		if (vc == columnDtl_purc_dlv_slip_src_typ_nm) return doDtl_purc_dlv_slip_src_typ_nm_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_po_rev) return doDtl_po_rev_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_seq) return doDtl_dlv_slip_seq_VC(info);
		if (vc == columnDtl_dlv_slip_rev) return doDtl_dlv_slip_rev_VC(info);
		if (vc == columnDtl_dlv_slip_mng_no) return doDtl_dlv_slip_mng_no_VC(info);
		if (vc == columnDtl_dlv_slip_mng_seq) return doDtl_dlv_slip_mng_seq_VC(info);
		if (vc == columnDtl_dlv_inst_grp_no) return doDtl_dlv_inst_grp_no_VC(info);
		if (vc == columnDtl_prms_rcpt_grp_no) return doDtl_prms_rcpt_grp_no_VC(info);
		if (vc == columnDtl_dlv_rqst_dt) return doDtl_dlv_rqst_dt_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_sppl_cntct_dpt) return doDtl_sppl_cntct_dpt_VC(info);
		if (vc == columnDtl_sppl_cntct_psn) return doDtl_sppl_cntct_psn_VC(info);
		if (vc == columnDtl_purc_usr_cd) return doDtl_purc_usr_cd_VC(info);
		if (vc == columnDtl_purc_usr_nm) return doDtl_purc_usr_nm_VC(info);
		if (vc == columnDtl_purc_dpt_cd) return doDtl_purc_dpt_cd_VC(info);
		if (vc == columnDtl_purc_dpt_nm) return doDtl_purc_dpt_nm_VC(info);
		if (vc == columnDtl_trd_rmrks) return doDtl_trd_rmrks_VC(info);
		if (vc == columnDtl_purc_ddlv_dlv_slip_no) return doDtl_purc_ddlv_dlv_slip_no_VC(info);
		if (vc == columnDtl_purc_ddlv_dlv_slip_seq) return doDtl_purc_ddlv_dlv_slip_seq_VC(info);
		if (vc == columnDtl_purc_ddlv_dlv_slip_rev) return doDtl_purc_ddlv_dlv_slip_rev_VC(info);
		if (vc == columnDtl_purc_ddlv_dlv_slip_multi_flg) return doDtl_purc_ddlv_dlv_slip_multi_flg_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == Btn_indiv_prnt_flg) return doBtn_indiv_prnt_flg_VC(info);
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
	 * [Cnd]パネルの[not_dlv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_dlv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_rqst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_rqst_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_slip_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dlv_slip_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dlv_slip_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ddlv_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inv_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inv_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inv_non_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inv_non_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slip_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slip_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dlv_slip_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dlv_slip_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_mng_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_inst_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_inst_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prms_rcpt_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prms_rcpt_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cntct_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_dlv_slip_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_dlv_slip_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_dlv_slip_multi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_indiv_prnt_flg_VC(MCEventInfo info){
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
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_not_dlv_prnt_flg) doCnd_not_dlv_prnt_flg_NC(info);
		else if (nc == Cnd_dlv_prnt_flg) doCnd_dlv_prnt_flg_NC(info);
		else if (nc == Cnd_dlv_rqst_dt_fr) doCnd_dlv_rqst_dt_fr_NC(info);
		else if (nc == Cnd_dlv_rqst_dt_to) doCnd_dlv_rqst_dt_to_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_po_rev) doCnd_po_rev_NC(info);
		else if (nc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NC(info);
		else if (nc == Cnd_dlv_slip_seq) doCnd_dlv_slip_seq_NC(info);
		else if (nc == Cnd_purc_dlv_slip_src_typ) doCnd_purc_dlv_slip_src_typ_NC(info);
		else if (nc == Cnd_purc_dlv_slip_src_typ_nm) doCnd_purc_dlv_slip_src_typ_nm_NC(info);
		else if (nc == Cnd_purc_ddlv_dlv_slip_no) doCnd_purc_ddlv_dlv_slip_no_NC(info);
		else if (nc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NC(info);
		else if (nc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NC(info);
		else if (nc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NC(info);
		else if (nc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Cnd_inv_can_flg) doCnd_inv_can_flg_NC(info);
		else if (nc == Cnd_inv_non_prnt_flg) doCnd_inv_non_prnt_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_slip_prnt_flg) doDtl_slip_prnt_flg_NC(info);
		else if (nc == columnDtl_latest_flg) doDtl_latest_flg_NC(info);
		else if (nc == columnDtl_slip_sts_typ) doDtl_slip_sts_typ_NC(info);
		else if (nc == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl_purc_dlv_slip_src_typ) doDtl_purc_dlv_slip_src_typ_NC(info);
		else if (nc == columnDtl_purc_dlv_slip_src_typ_nm) doDtl_purc_dlv_slip_src_typ_nm_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_po_rev) doDtl_po_rev_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_seq) doDtl_dlv_slip_seq_NC(info);
		else if (nc == columnDtl_dlv_slip_rev) doDtl_dlv_slip_rev_NC(info);
		else if (nc == columnDtl_dlv_slip_mng_no) doDtl_dlv_slip_mng_no_NC(info);
		else if (nc == columnDtl_dlv_slip_mng_seq) doDtl_dlv_slip_mng_seq_NC(info);
		else if (nc == columnDtl_dlv_inst_grp_no) doDtl_dlv_inst_grp_no_NC(info);
		else if (nc == columnDtl_prms_rcpt_grp_no) doDtl_prms_rcpt_grp_no_NC(info);
		else if (nc == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_sppl_cntct_dpt) doDtl_sppl_cntct_dpt_NC(info);
		else if (nc == columnDtl_sppl_cntct_psn) doDtl_sppl_cntct_psn_NC(info);
		else if (nc == columnDtl_purc_usr_cd) doDtl_purc_usr_cd_NC(info);
		else if (nc == columnDtl_purc_usr_nm) doDtl_purc_usr_nm_NC(info);
		else if (nc == columnDtl_purc_dpt_cd) doDtl_purc_dpt_cd_NC(info);
		else if (nc == columnDtl_purc_dpt_nm) doDtl_purc_dpt_nm_NC(info);
		else if (nc == columnDtl_trd_rmrks) doDtl_trd_rmrks_NC(info);
		else if (nc == columnDtl_purc_ddlv_dlv_slip_no) doDtl_purc_ddlv_dlv_slip_no_NC(info);
		else if (nc == columnDtl_purc_ddlv_dlv_slip_seq) doDtl_purc_ddlv_dlv_slip_seq_NC(info);
		else if (nc == columnDtl_purc_ddlv_dlv_slip_rev) doDtl_purc_ddlv_dlv_slip_rev_NC(info);
		else if (nc == columnDtl_purc_ddlv_dlv_slip_multi_flg) doDtl_purc_ddlv_dlv_slip_multi_flg_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_dlv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_seq_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dlv_slip_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dlv_slip_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ddlv_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inv_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inv_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inv_non_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inv_non_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prms_rcpt_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prms_rcpt_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_multi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NC(MCEventInfo info){
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
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_not_dlv_prnt_flg) doCnd_not_dlv_prnt_flg_NE(info);
		else if (ne == Cnd_dlv_prnt_flg) doCnd_dlv_prnt_flg_NE(info);
		else if (ne == Cnd_dlv_rqst_dt_fr) doCnd_dlv_rqst_dt_fr_NE(info);
		else if (ne == Cnd_dlv_rqst_dt_to) doCnd_dlv_rqst_dt_to_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_po_rev) doCnd_po_rev_NE(info);
		else if (ne == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NE(info);
		else if (ne == Cnd_dlv_slip_seq) doCnd_dlv_slip_seq_NE(info);
		else if (ne == Cnd_purc_dlv_slip_src_typ) doCnd_purc_dlv_slip_src_typ_NE(info);
		else if (ne == Cnd_purc_dlv_slip_src_typ_nm) doCnd_purc_dlv_slip_src_typ_nm_NE(info);
		else if (ne == Cnd_purc_ddlv_dlv_slip_no) doCnd_purc_ddlv_dlv_slip_no_NE(info);
		else if (ne == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NE(info);
		else if (ne == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NE(info);
		else if (ne == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NE(info);
		else if (ne == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Cnd_inv_can_flg) doCnd_inv_can_flg_NE(info);
		else if (ne == Cnd_inv_non_prnt_flg) doCnd_inv_non_prnt_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_slip_prnt_flg) doDtl_slip_prnt_flg_NE(info);
		else if (ne == columnDtl_latest_flg) doDtl_latest_flg_NE(info);
		else if (ne == columnDtl_slip_sts_typ) doDtl_slip_sts_typ_NE(info);
		else if (ne == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl_purc_dlv_slip_src_typ) doDtl_purc_dlv_slip_src_typ_NE(info);
		else if (ne == columnDtl_purc_dlv_slip_src_typ_nm) doDtl_purc_dlv_slip_src_typ_nm_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_po_rev) doDtl_po_rev_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_seq) doDtl_dlv_slip_seq_NE(info);
		else if (ne == columnDtl_dlv_slip_rev) doDtl_dlv_slip_rev_NE(info);
		else if (ne == columnDtl_dlv_slip_mng_no) doDtl_dlv_slip_mng_no_NE(info);
		else if (ne == columnDtl_dlv_slip_mng_seq) doDtl_dlv_slip_mng_seq_NE(info);
		else if (ne == columnDtl_dlv_inst_grp_no) doDtl_dlv_inst_grp_no_NE(info);
		else if (ne == columnDtl_prms_rcpt_grp_no) doDtl_prms_rcpt_grp_no_NE(info);
		else if (ne == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_sppl_cntct_dpt) doDtl_sppl_cntct_dpt_NE(info);
		else if (ne == columnDtl_sppl_cntct_psn) doDtl_sppl_cntct_psn_NE(info);
		else if (ne == columnDtl_purc_usr_cd) doDtl_purc_usr_cd_NE(info);
		else if (ne == columnDtl_purc_usr_nm) doDtl_purc_usr_nm_NE(info);
		else if (ne == columnDtl_purc_dpt_cd) doDtl_purc_dpt_cd_NE(info);
		else if (ne == columnDtl_purc_dpt_nm) doDtl_purc_dpt_nm_NE(info);
		else if (ne == columnDtl_trd_rmrks) doDtl_trd_rmrks_NE(info);
		else if (ne == columnDtl_purc_ddlv_dlv_slip_no) doDtl_purc_ddlv_dlv_slip_no_NE(info);
		else if (ne == columnDtl_purc_ddlv_dlv_slip_seq) doDtl_purc_ddlv_dlv_slip_seq_NE(info);
		else if (ne == columnDtl_purc_ddlv_dlv_slip_rev) doDtl_purc_ddlv_dlv_slip_rev_NE(info);
		else if (ne == columnDtl_purc_ddlv_dlv_slip_multi_flg) doDtl_purc_ddlv_dlv_slip_multi_flg_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[not_dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_dlv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_seq_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dlv_slip_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dlv_slip_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ddlv_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inv_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inv_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inv_non_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inv_non_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prms_rcpt_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prms_rcpt_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_multi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NE(MCEventInfo info){
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
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_not_dlv_prnt_flg) doCnd_not_dlv_prnt_flg_NX(info);
		else if (nx == Cnd_dlv_prnt_flg) doCnd_dlv_prnt_flg_NX(info);
		else if (nx == Cnd_dlv_rqst_dt_fr) doCnd_dlv_rqst_dt_fr_NX(info);
		else if (nx == Cnd_dlv_rqst_dt_to) doCnd_dlv_rqst_dt_to_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_po_rev) doCnd_po_rev_NX(info);
		else if (nx == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NX(info);
		else if (nx == Cnd_dlv_slip_seq) doCnd_dlv_slip_seq_NX(info);
		else if (nx == Cnd_purc_dlv_slip_src_typ) doCnd_purc_dlv_slip_src_typ_NX(info);
		else if (nx == Cnd_purc_dlv_slip_src_typ_nm) doCnd_purc_dlv_slip_src_typ_nm_NX(info);
		else if (nx == Cnd_purc_ddlv_dlv_slip_no) doCnd_purc_ddlv_dlv_slip_no_NX(info);
		else if (nx == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NX(info);
		else if (nx == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NX(info);
		else if (nx == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NX(info);
		else if (nx == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Cnd_inv_can_flg) doCnd_inv_can_flg_NX(info);
		else if (nx == Cnd_inv_non_prnt_flg) doCnd_inv_non_prnt_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_slip_prnt_flg) doDtl_slip_prnt_flg_NX(info);
		else if (nx == columnDtl_latest_flg) doDtl_latest_flg_NX(info);
		else if (nx == columnDtl_slip_sts_typ) doDtl_slip_sts_typ_NX(info);
		else if (nx == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl_purc_dlv_slip_src_typ) doDtl_purc_dlv_slip_src_typ_NX(info);
		else if (nx == columnDtl_purc_dlv_slip_src_typ_nm) doDtl_purc_dlv_slip_src_typ_nm_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_po_rev) doDtl_po_rev_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_seq) doDtl_dlv_slip_seq_NX(info);
		else if (nx == columnDtl_dlv_slip_rev) doDtl_dlv_slip_rev_NX(info);
		else if (nx == columnDtl_dlv_slip_mng_no) doDtl_dlv_slip_mng_no_NX(info);
		else if (nx == columnDtl_dlv_slip_mng_seq) doDtl_dlv_slip_mng_seq_NX(info);
		else if (nx == columnDtl_dlv_inst_grp_no) doDtl_dlv_inst_grp_no_NX(info);
		else if (nx == columnDtl_prms_rcpt_grp_no) doDtl_prms_rcpt_grp_no_NX(info);
		else if (nx == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_sppl_cntct_dpt) doDtl_sppl_cntct_dpt_NX(info);
		else if (nx == columnDtl_sppl_cntct_psn) doDtl_sppl_cntct_psn_NX(info);
		else if (nx == columnDtl_purc_usr_cd) doDtl_purc_usr_cd_NX(info);
		else if (nx == columnDtl_purc_usr_nm) doDtl_purc_usr_nm_NX(info);
		else if (nx == columnDtl_purc_dpt_cd) doDtl_purc_dpt_cd_NX(info);
		else if (nx == columnDtl_purc_dpt_nm) doDtl_purc_dpt_nm_NX(info);
		else if (nx == columnDtl_trd_rmrks) doDtl_trd_rmrks_NX(info);
		else if (nx == columnDtl_purc_ddlv_dlv_slip_no) doDtl_purc_ddlv_dlv_slip_no_NX(info);
		else if (nx == columnDtl_purc_ddlv_dlv_slip_seq) doDtl_purc_ddlv_dlv_slip_seq_NX(info);
		else if (nx == columnDtl_purc_ddlv_dlv_slip_rev) doDtl_purc_ddlv_dlv_slip_rev_NX(info);
		else if (nx == columnDtl_purc_ddlv_dlv_slip_multi_flg) doDtl_purc_ddlv_dlv_slip_multi_flg_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[not_dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_dlv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_seq_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dlv_slip_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dlv_slip_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ddlv_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inv_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inv_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inv_non_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inv_non_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prms_rcpt_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prms_rcpt_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_multi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_dlv_rqst_dt_fr) doCnd_dlv_rqst_dt_fr_LC(info);
		else if (lc == Cnd_dlv_rqst_dt_to) doCnd_dlv_rqst_dt_to_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_po_rev) doCnd_po_rev_LC(info);
		else if (lc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_LC(info);
		else if (lc == Cnd_dlv_slip_seq) doCnd_dlv_slip_seq_LC(info);
		else if (lc == Cnd_purc_dlv_slip_src_typ) doCnd_purc_dlv_slip_src_typ_LC(info);
		else if (lc == Cnd_purc_dlv_slip_src_typ_nm) doCnd_purc_dlv_slip_src_typ_nm_LC(info);
		else if (lc == Cnd_purc_ddlv_dlv_slip_no) doCnd_purc_ddlv_dlv_slip_no_LC(info);
		else if (lc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_LC(info);
		else if (lc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_LC(info);
		else if (lc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_LC(info);
		else if (lc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == columnDtl_slip_sts_typ) doDtl_slip_sts_typ_LC(info);
		else if (lc == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl_purc_dlv_slip_src_typ) doDtl_purc_dlv_slip_src_typ_LC(info);
		else if (lc == columnDtl_purc_dlv_slip_src_typ_nm) doDtl_purc_dlv_slip_src_typ_nm_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_po_rev) doDtl_po_rev_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_seq) doDtl_dlv_slip_seq_LC(info);
		else if (lc == columnDtl_dlv_slip_rev) doDtl_dlv_slip_rev_LC(info);
		else if (lc == columnDtl_dlv_slip_mng_no) doDtl_dlv_slip_mng_no_LC(info);
		else if (lc == columnDtl_dlv_slip_mng_seq) doDtl_dlv_slip_mng_seq_LC(info);
		else if (lc == columnDtl_dlv_inst_grp_no) doDtl_dlv_inst_grp_no_LC(info);
		else if (lc == columnDtl_prms_rcpt_grp_no) doDtl_prms_rcpt_grp_no_LC(info);
		else if (lc == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_sppl_cntct_dpt) doDtl_sppl_cntct_dpt_LC(info);
		else if (lc == columnDtl_sppl_cntct_psn) doDtl_sppl_cntct_psn_LC(info);
		else if (lc == columnDtl_purc_usr_cd) doDtl_purc_usr_cd_LC(info);
		else if (lc == columnDtl_purc_usr_nm) doDtl_purc_usr_nm_LC(info);
		else if (lc == columnDtl_purc_dpt_cd) doDtl_purc_dpt_cd_LC(info);
		else if (lc == columnDtl_purc_dpt_nm) doDtl_purc_dpt_nm_LC(info);
		else if (lc == columnDtl_trd_rmrks) doDtl_trd_rmrks_LC(info);
		else if (lc == columnDtl_purc_ddlv_dlv_slip_no) doDtl_purc_ddlv_dlv_slip_no_LC(info);
		else if (lc == columnDtl_purc_ddlv_dlv_slip_seq) doDtl_purc_ddlv_dlv_slip_seq_LC(info);
		else if (lc == columnDtl_purc_ddlv_dlv_slip_rev) doDtl_purc_ddlv_dlv_slip_rev_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_rev_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_seq_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dlv_slip_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dlv_slip_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dlv_slip_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ddlv_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prms_rcpt_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prms_rcpt_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_dlv_slip_src_typ]の作成メソッド
	 */
	public MCList getCnd_purc_dlv_slip_src_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0050.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0050.MSUAP_List", this)).getPurcDlvSlipSrcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_usr_cd]の作成メソッド
	 */
	public MCList getCnd_purc_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_purc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBDL0250.Srch01")) {
			return new MS_MSBDL0250_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0250.Prnt01")) {
			return new MS_MSBDL0250_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0250_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0250_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0250_Srch01Bridge() {
			p_MS_MSBDL0250_Srch01 = new MCParam(PDef.MS_MSBDL0250_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0250_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0250.DtlR.class));

			p_MS_MSBDL0250_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0250_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0250_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0250_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0250_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0250.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0250.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0250.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0250.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0250_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0250.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0250_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0250.DtlR>)p_MS_MSBDL0250_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0250_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0250_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0250_Prnt01;

		/** コンストラクタ */
		protected MS_MSBDL0250_Prnt01Bridge() {
			p_MS_MSBDL0250_Prnt01 = new MCParam(PDef.MS_MSBDL0250_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0250_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0250.DtlR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0250.BtnR.create());
			// Down

			p_MS_MSBDL0250_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0250_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0250_Prnt01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBDL0250_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0250_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0250_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0250.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0250.DtlR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0250.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0250.BtnR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBDL0250_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}