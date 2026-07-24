package mcframe.clientMSBD.MSBDP0210;

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
import mcframe.clientMSBD.MSBDP0210.MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Srch01Caller;
import mcframe.clientMSBD.MSBDP0210.MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Srch02Caller;
import mcframe.clientMSBD.MSBDP0210.MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Upd01Caller;
import mcframe.clientMSBD.MSBDP0210.MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Upd02Caller;
import mcframe.clientMSBD.MSBDP0210.MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Imp01Caller;
import mcframe.clientMSBD.MSBDP0210.MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Del01Caller;
import mcframe.clientMSBD.MSBDP0210.MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Del02Caller;
import mcframe.clientMSBD.MSBDP0210.MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Prnt01Caller;

/**
 * 画面"MSBDP_PurcFrcstReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PurcFrcstReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBDP0210";

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
	// [DispUnit]ブロック関連のField定義
	public MCPanel DispUnitPanel = null;
	public MCTitledBorder DispUnitTitledBorder = null;
	// [DispUnit]ブロックの項目のField定義
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
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [FixSts]ブロック関連のField定義
	public MCPanel FixStsPanel = null;
	public MCTitledBorder FixStsTitledBorder = null;
	// [FixSts]ブロックの項目のField定義
	// [DelSts]ブロック関連のField定義
	public MCPanel DelStsPanel = null;
	public MCTitledBorder DelStsTitledBorder = null;
	// [DelSts]ブロックの項目のField定義
	// [RptSts]ブロック関連のField定義
	public MCPanel RptStsPanel = null;
	public MCTitledBorder RptStsTitledBorder = null;
	// [RptSts]ブロックの項目のField定義
	// [SubconTgt]ブロック関連のField定義
	public MCPanel SubconTgtPanel = null;
	public MCTitledBorder SubconTgtTitledBorder = null;
	// [SubconTgt]ブロックの項目のField定義
	// [PurcCommitTgt]ブロック関連のField定義
	public MCPanel PurcCommitTgtPanel = null;
	public MCTitledBorder PurcCommitTgtTitledBorder = null;
	// [PurcCommitTgt]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Modify;DEL,Cancel;DEL_CAN,Revert cancellation;RPT,Issue report;REF,View UPD,訂正する;DEL,取り消す;DEL_CAN,取り消し戻す;RPT,帳票発行;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_DEL_CAN = null;
	public MCRadioButton Cnd_ope_RPT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * HDR,Header;DTL,Details HDR,ヘッダ;DTL,明細.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_ope_Group = null;
	public MCRadioButton Cnd_disp_ope_HDR = null;
	public MCRadioButton Cnd_disp_ope_DTL = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_f_flg = null;
	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_t_flg = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_rpt_f_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_rpt_t_flg = null;
	/**
	 * Valid 有効.<p>
	 *
	 */
	public MCCheckBox Cnd_del_f_flg = null;
	/**
	 * Invalid 無効.<p>
	 *
	 */
	public MCCheckBox Cnd_del_t_flg = null;
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public MCCheckBox Cnd_subcon_t_flg = null;
	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_subcon_f_flg = null;
	/**
	 * For pickup responsibility 引取責任対象.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_commit_t_flg = null;
	/**
	 * Not for pickup responsibility 引取責任対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_commit_f_flg = null;
	public MCLabel Cnd_pf_dt_fr_Label = null;
	/**
	 * Forecast date FROM 内示日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pf_dt_fr = null;
	public MCLabel Cnd_pf_dt_to_Label = null;
	/**
	 * Forecast date TO 内示日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pf_dt_to = null;
	/**
	 * Latest only 最新のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
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
	public MCLabel Cnd_pf_usr_cd_Label = null;
	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pf_usr_cd = null;
	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public MCTextField Cnd_pf_usr_nm = null;
	public MCLabel Cnd_pf_dpt_cd_Label = null;
	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pf_dpt_cd = null;
	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public MCTextField Cnd_pf_dpt_nm = null;
	public MCLabel Cnd_pf_wg_cd_Label = null;
	/**
	 * Forecast dept. WG cd. 内示部門ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pf_wg_cd = null;
	/**
	 * Forecast dept. WG name 内示部門ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_pf_wg_nm = null;
	public MCLabel Cnd_pf_rpt_no_Label = null;
	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pf_rpt_no = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_hdr_rpt_rmrks_Label = null;
	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public MCTextField Cnd_hdr_rpt_rmrks = null;
	public MCLabel Cnd_hdr_intr_rmrks_Label = null;
	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public MCTextField Cnd_hdr_intr_rmrks = null;
	public MCLabel Cnd_hdr_sub_char1_Label = null;
	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public MCTextField Cnd_hdr_sub_char1 = null;
	public MCLabel Cnd_hdr_sub_char2_Label = null;
	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public MCTextField Cnd_hdr_sub_char2 = null;
	public MCLabel Cnd_hdr_sub_char3_Label = null;
	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public MCTextField Cnd_hdr_sub_char3 = null;
	public MCLabel Cnd_dtl_rpt_rmrks_Label = null;
	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public MCTextField Cnd_dtl_rpt_rmrks = null;
	public MCLabel Cnd_dtl_intr_rmrks_Label = null;
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public MCTextField Cnd_dtl_intr_rmrks = null;
	public MCLabel Cnd_dtl_sub_char1_Label = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char1 = null;
	public MCLabel Cnd_dtl_sub_char2_Label = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char2 = null;
	public MCLabel Cnd_dtl_sub_char3_Label = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char3 = null;
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
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
	/**
	 * Display last 前回表示.<p>
	 *
	 */
	public MCCheckBox Cnd_show_pre_flg = null;
	/**
	 * Display base unit 基準単位表示.<p>
	 *
	 */
	public MCCheckBox Cnd_show_base_unit_flg = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
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
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_pf_usr_cd_Label = null;
	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public MCTextField BulkSet_pf_usr_cd = null;
	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public MCTextField BulkSet_pf_usr_nm = null;
	public MCLabel BulkSet_pf_dpt_cd_Label = null;
	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public MCTextField BulkSet_pf_dpt_cd = null;
	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public MCTextField BulkSet_pf_dpt_nm = null;
	/**
	 * Apply 反映.<p>
	 *
	 */
	public MCButton BulkSet_setting = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0210.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_flg = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_del_flg = null;
	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_commit_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_period_typ = null;
	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_period_typ_nm = null;
	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_period_st_dt = null;
	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_period_end_dt = null;
	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_period_flg = null;
	/**
	 * Last firmed period 前回確定期間.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_fix_period_flg = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_schd_qty;// [Rslt]の[trd_unit_schd_qty_p.qty]を[columnRslt_trd_unit_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_pf_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_pf_qty;// [Rslt]の[trd_unit_pf_qty_p.qty]を[columnRslt_trd_unit_pf_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_prms_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_prms_qty;// [Rslt]の[trd_unit_prms_qty_p.qty]を[columnRslt_trd_unit_prms_qty]としてエイリアス定義。
	/**
	 * Last unit cd. 前回単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_trd_unit_cd = null;
	/**
	 * Last unit name 前回単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_trd_unit_nm = null;
	/**
	 * Last unit number of decimal places 前回単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_trd_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pre_trd_unit_pf_qty_p_PPanel;
	public MCColumnConfig columnRslt_pre_trd_unit_pf_qty;// [Rslt]の[pre_trd_unit_pf_qty_p.qty]を[columnRslt_pre_trd_unit_pf_qty]としてエイリアス定義。
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
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_schd_qty;// [Rslt]の[base_unit_schd_qty_p.qty]を[columnRslt_base_unit_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_pf_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_pf_qty;// [Rslt]の[base_unit_pf_qty_p.qty]を[columnRslt_base_unit_pf_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_prms_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_prms_qty;// [Rslt]の[base_unit_prms_qty_p.qty]を[columnRslt_base_unit_prms_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pre_base_unit_pf_qty_p_PPanel;
	public MCColumnConfig columnRslt_pre_base_unit_pf_qty;// [Rslt]の[pre_base_unit_pf_qty_p.qty]を[columnRslt_pre_base_unit_pf_qty]としてエイリアス定義。
	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_rpt_rmrks = null;
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_intr_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_sub_char3 = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCColumnConfig columnRslt_latest_flg = null;
	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_dt = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_subcon_flg = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_pf_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_pf_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_pf_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_pf_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_pf_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_pf_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_pf_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_pf_dpt_nm]としてエイリアス定義。
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_rpt_flg = null;
	/**
	 * Issue date and time 発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_rpt_dt = null;
	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pf_rpt_no = null;
	/**
	 * Cancel issued 取消発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_del_pf_rpt_flg = null;
	/**
	 * Cancellation issue date and time 取消発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_del_pf_rpt_dt = null;
	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_hdr_rpt_rmrks = null;
	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_hdr_intr_rmrks = null;
	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_hdr_sub_char1 = null;
	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_hdr_sub_char2 = null;
	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_hdr_sub_char3 = null;
	/**
	 * Last forecast date 前回内示日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_pf_dt = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rtn_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rtn_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_sppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_sppl_grp_cd1;// [Rslt]の[sppl_grp_p.bp_grp_cd1]を[columnRslt_sppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm1;// [Rslt]の[sppl_grp_p.bp_grp_nm1]を[columnRslt_sppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd2;// [Rslt]の[sppl_grp_p.bp_grp_cd2]を[columnRslt_sppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm2;// [Rslt]の[sppl_grp_p.bp_grp_nm2]を[columnRslt_sppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd3;// [Rslt]の[sppl_grp_p.bp_grp_cd3]を[columnRslt_sppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm3;// [Rslt]の[sppl_grp_p.bp_grp_nm3]を[columnRslt_sppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd4;// [Rslt]の[sppl_grp_p.bp_grp_cd4]を[columnRslt_sppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm4;// [Rslt]の[sppl_grp_p.bp_grp_nm4]を[columnRslt_sppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd5;// [Rslt]の[sppl_grp_p.bp_grp_cd5]を[columnRslt_sppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm5;// [Rslt]の[sppl_grp_p.bp_grp_nm5]を[columnRslt_sppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd6;// [Rslt]の[sppl_grp_p.bp_grp_cd6]を[columnRslt_sppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm6;// [Rslt]の[sppl_grp_p.bp_grp_nm6]を[columnRslt_sppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd7;// [Rslt]の[sppl_grp_p.bp_grp_cd7]を[columnRslt_sppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm7;// [Rslt]の[sppl_grp_p.bp_grp_nm7]を[columnRslt_sppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd8;// [Rslt]の[sppl_grp_p.bp_grp_cd8]を[columnRslt_sppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm8;// [Rslt]の[sppl_grp_p.bp_grp_nm8]を[columnRslt_sppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd9;// [Rslt]の[sppl_grp_p.bp_grp_cd9]を[columnRslt_sppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm9;// [Rslt]の[sppl_grp_p.bp_grp_nm9]を[columnRslt_sppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd10;// [Rslt]の[sppl_grp_p.bp_grp_cd10]を[columnRslt_sppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm10;// [Rslt]の[sppl_grp_p.bp_grp_nm10]を[columnRslt_sppl_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt_itm_grp_cd1;// [Rslt]の[itm_grp_p.itm_grp_cd1]を[columnRslt_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm1;// [Rslt]の[itm_grp_p.itm_grp_nm1]を[columnRslt_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd2;// [Rslt]の[itm_grp_p.itm_grp_cd2]を[columnRslt_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm2;// [Rslt]の[itm_grp_p.itm_grp_nm2]を[columnRslt_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd3;// [Rslt]の[itm_grp_p.itm_grp_cd3]を[columnRslt_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm3;// [Rslt]の[itm_grp_p.itm_grp_nm3]を[columnRslt_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd4;// [Rslt]の[itm_grp_p.itm_grp_cd4]を[columnRslt_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm4;// [Rslt]の[itm_grp_p.itm_grp_nm4]を[columnRslt_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd5;// [Rslt]の[itm_grp_p.itm_grp_cd5]を[columnRslt_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm5;// [Rslt]の[itm_grp_p.itm_grp_nm5]を[columnRslt_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd6;// [Rslt]の[itm_grp_p.itm_grp_cd6]を[columnRslt_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm6;// [Rslt]の[itm_grp_p.itm_grp_nm6]を[columnRslt_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd7;// [Rslt]の[itm_grp_p.itm_grp_cd7]を[columnRslt_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm7;// [Rslt]の[itm_grp_p.itm_grp_nm7]を[columnRslt_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd8;// [Rslt]の[itm_grp_p.itm_grp_cd8]を[columnRslt_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm8;// [Rslt]の[itm_grp_p.itm_grp_nm8]を[columnRslt_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd9;// [Rslt]の[itm_grp_p.itm_grp_cd9]を[columnRslt_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm9;// [Rslt]の[itm_grp_p.itm_grp_nm9]を[columnRslt_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd10;// [Rslt]の[itm_grp_p.itm_grp_cd10]を[columnRslt_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm10;// [Rslt]の[itm_grp_p.itm_grp_nm10]を[columnRslt_itm_grp_nm10]としてエイリアス定義。
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
	 * GR/GI schedule 受払予定一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0090 = null;
	/**
	 * PO schedule list entry 発注予定一登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0030 = null;
	/**
	 * Order status update オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0050 = null;
	/**
	 * Long LT order status update 先行手配オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0130 = null;
	/**
	 * Forecast list 内示書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCLabel Btn_label_check = null;
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
	 * Firm 確定.<p>
	 *
	 */
	public MCLabel Btn_label_fix = null;
	/**
	 * All firm 全確定.<p>
	 *
	 */
	public MCButton Btn_fix_all = null;
	/**
	 * All unfirm 全確定解除.<p>
	 *
	 */
	public MCButton Btn_unfix_all = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_prnt_flg = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [HDR_SRCH_UPD]モードを表す定数 */
	public static final String HDR_SRCH_UPD = "HDR_SRCH_UPD";
	/** [HDR_UPD]モードを表す定数 */
	public static final String HDR_UPD = "HDR_UPD";
	/** [HDR_SRCH_DEL]モードを表す定数 */
	public static final String HDR_SRCH_DEL = "HDR_SRCH_DEL";
	/** [HDR_DEL]モードを表す定数 */
	public static final String HDR_DEL = "HDR_DEL";
	/** [HDR_SRCH_DEL_CAN]モードを表す定数 */
	public static final String HDR_SRCH_DEL_CAN = "HDR_SRCH_DEL_CAN";
	/** [HDR_DEL_CAN]モードを表す定数 */
	public static final String HDR_DEL_CAN = "HDR_DEL_CAN";
	/** [SRCH_RPT]モードを表す定数 */
	public static final String SRCH_RPT = "SRCH_RPT";
	/** [RPT]モードを表す定数 */
	public static final String RPT = "RPT";
	/** [HDR_SRCH]モードを表す定数 */
	public static final String HDR_SRCH = "HDR_SRCH";
	/** [HDR_REF]モードを表す定数 */
	public static final String HDR_REF = "HDR_REF";
	/** [DTL_SRCH_UPD]モードを表す定数 */
	public static final String DTL_SRCH_UPD = "DTL_SRCH_UPD";
	/** [DTL_UPD]モードを表す定数 */
	public static final String DTL_UPD = "DTL_UPD";
	/** [DTL_FIX_U]モードを表す定数 */
	public static final String DTL_FIX_U = "DTL_FIX_U";
	/** [DTL_SRCH]モードを表す定数 */
	public static final String DTL_SRCH = "DTL_SRCH";
	/** [DTL_REF]モードを表す定数 */
	public static final String DTL_REF = "DTL_REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{HDR_SRCH_UPD, HDR_UPD, HDR_SRCH_DEL, HDR_DEL, HDR_SRCH_DEL_CAN, HDR_DEL_CAN, SRCH_RPT, RPT, HDR_SRCH, HDR_REF, DTL_SRCH_UPD, DTL_UPD, DTL_FIX_U, DTL_SRCH, DTL_REF};
	
	/** [MS_MSBDL0210_Srch01]のCallerの作成 */
	protected MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Srch01Caller createMS_MSBDL0210_Srch01() {
		MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Srch01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Srch01Bridge>
		caller = ((MSBDP_PurcFrcstReg_MC)this).new MS_MSBDL0210_Srch01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Srch01Bridge>(
					(MSBDP_PurcFrcstReg)this, new MS_MSBDL0210_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0210_Srch01]の呼び出し */
	protected void callMS_MSBDL0210_Srch01() {
		MCCaller caller = createMS_MSBDL0210_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0210_Srch02]のCallerの作成 */
	protected MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Srch02Caller createMS_MSBDL0210_Srch02() {
		MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Srch02Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Srch02Bridge>
		caller = ((MSBDP_PurcFrcstReg_MC)this).new MS_MSBDL0210_Srch02Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Srch02Bridge>(
					(MSBDP_PurcFrcstReg)this, new MS_MSBDL0210_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBDL0210_Srch02]の呼び出し */
	protected void callMS_MSBDL0210_Srch02() {
		MCCaller caller = createMS_MSBDL0210_Srch02();
		caller.exec();
	}
	/** [MS_MSBDL0210_Upd01]のCallerの作成 */
	protected MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Upd01Caller createMS_MSBDL0210_Upd01() {
		MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Upd01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Upd01Bridge>
		caller = ((MSBDP_PurcFrcstReg_MC)this).new MS_MSBDL0210_Upd01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Upd01Bridge>(
					(MSBDP_PurcFrcstReg)this, new MS_MSBDL0210_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBDL0210_Upd01]の呼び出し */
	protected void callMS_MSBDL0210_Upd01() {
		MCCaller caller = createMS_MSBDL0210_Upd01();
		caller.exec();
	}
	/** [MS_MSBDL0210_Upd02]のCallerの作成 */
	protected MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Upd02Caller createMS_MSBDL0210_Upd02() {
		MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Upd02Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Upd02Bridge>
		caller = ((MSBDP_PurcFrcstReg_MC)this).new MS_MSBDL0210_Upd02Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Upd02Bridge>(
					(MSBDP_PurcFrcstReg)this, new MS_MSBDL0210_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBDL0210_Upd02]の呼び出し */
	protected void callMS_MSBDL0210_Upd02() {
		MCCaller caller = createMS_MSBDL0210_Upd02();
		caller.exec();
	}
	/** [MS_MSBDL0210_Imp01]のCallerの作成 */
	protected MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Imp01Caller createMS_MSBDL0210_Imp01() {
		MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Imp01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Imp01Bridge>
		caller = ((MSBDP_PurcFrcstReg_MC)this).new MS_MSBDL0210_Imp01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Imp01Bridge>(
					(MSBDP_PurcFrcstReg)this, new MS_MSBDL0210_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBDL0210_Imp01]の呼び出し */
	protected void callMS_MSBDL0210_Imp01() {
		MCCaller caller = createMS_MSBDL0210_Imp01();
		caller.exec();
	}
	/** [MS_MSBDL0210_Del01]のCallerの作成 */
	protected MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Del01Caller createMS_MSBDL0210_Del01() {
		MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Del01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Del01Bridge>
		caller = ((MSBDP_PurcFrcstReg_MC)this).new MS_MSBDL0210_Del01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Del01Bridge>(
					(MSBDP_PurcFrcstReg)this, new MS_MSBDL0210_Del01Bridge());
		return caller;
	}
	/** [MS_MSBDL0210_Del01]の呼び出し */
	protected void callMS_MSBDL0210_Del01() {
		MCCaller caller = createMS_MSBDL0210_Del01();
		caller.exec();
	}
	/** [MS_MSBDL0210_Del02]のCallerの作成 */
	protected MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Del02Caller createMS_MSBDL0210_Del02() {
		MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Del02Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Del02Bridge>
		caller = ((MSBDP_PurcFrcstReg_MC)this).new MS_MSBDL0210_Del02Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Del02Bridge>(
					(MSBDP_PurcFrcstReg)this, new MS_MSBDL0210_Del02Bridge());
		return caller;
	}
	/** [MS_MSBDL0210_Del02]の呼び出し */
	protected void callMS_MSBDL0210_Del02() {
		MCCaller caller = createMS_MSBDL0210_Del02();
		caller.exec();
	}
	/** [MS_MSBDL0210_Prnt01]のCallerの作成 */
	protected MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Prnt01Caller createMS_MSBDL0210_Prnt01() {
		MSBDP_PurcFrcstReg_MC.MS_MSBDL0210_Prnt01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Prnt01Bridge>
		caller = ((MSBDP_PurcFrcstReg_MC)this).new MS_MSBDL0210_Prnt01Caller<MSBDP_PurcFrcstReg, MS_MSBDL0210_Prnt01Bridge>(
					(MSBDP_PurcFrcstReg)this, new MS_MSBDL0210_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0210_Prnt01]の呼び出し */
	protected void callMS_MSBDL0210_Prnt01() {
		MCCaller caller = createMS_MSBDL0210_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0210.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0210.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0210.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0210.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0210.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0210.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0210.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0210.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBD.MSBDP0210.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBD.MSBDP0210.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBD.MSBDP0210.BulkSetR createBulkSetR() {
		return mcframe.clientMSBD.MSBDP0210.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBD.MSBDP0210.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0210.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBD.MSBDP0210.RsltR createRsltR() {
		return mcframe.clientMSBD.MSBDP0210.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0210.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class);
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
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBD.MSBDP0210.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0210.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0210.BtnR createBtnR() {
		return mcframe.clientMSBD.MSBDP0210.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("Rslt")) return getRsltL();
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
		ret.add(DispUnitPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(FixStsPanel);
		ret.add(DelStsPanel);
		ret.add(RptStsPanel);
		ret.add(SubconTgtPanel);
		ret.add(PurcCommitTgtPanel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcFrcstReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PurcFrcstReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PurcFrcstReg_MC.jbCreateScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateDispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateTop((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateFold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateTab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateTab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateTab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateFixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateDelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateRptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateSubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreatePurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateCnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateCnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateCnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateLPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateCtrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateRPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateBulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateRslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateBtn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbCreateEastBtn((MSBDP_PurcFrcstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [FixSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFixSts(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [DelSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDelSts(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [RptSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRptSts(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [SubconTgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSubconTgt(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [PurcCommitTgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePurcCommitTgt(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PurcFrcstReg p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
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
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBDP_PurcFrcstReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBDP_PurcFrcstReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$itm_p);
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
		p.Rslt_trd_unit_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$trd_unit_schd_qty_p);
		p.Rslt_trd_unit_schd_qty_p_PPanel.setName("Rslt.trd_unit_schd_qty_p");
		p.columnRslt_trd_unit_schd_qty = p.Rslt_trd_unit_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_schd_qty.addAliasName("Rslt.trd_unit_schd_qty", p);
		p.Rslt_trd_unit_pf_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$trd_unit_pf_qty_p);
		p.Rslt_trd_unit_pf_qty_p_PPanel.setName("Rslt.trd_unit_pf_qty_p");
		p.columnRslt_trd_unit_pf_qty = p.Rslt_trd_unit_pf_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_pf_qty.addAliasName("Rslt.trd_unit_pf_qty", p);
		p.Rslt_trd_unit_prms_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$trd_unit_prms_qty_p);
		p.Rslt_trd_unit_prms_qty_p_PPanel.setName("Rslt.trd_unit_prms_qty_p");
		p.columnRslt_trd_unit_prms_qty = p.Rslt_trd_unit_prms_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_prms_qty.addAliasName("Rslt.trd_unit_prms_qty", p);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$pre_trd_unit_pf_qty_p);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.setName("Rslt.pre_trd_unit_pf_qty_p");
		p.columnRslt_pre_trd_unit_pf_qty = p.Rslt_pre_trd_unit_pf_qty_p_PPanel.columnQty_qty;
		p.columnRslt_pre_trd_unit_pf_qty.addAliasName("Rslt.pre_trd_unit_pf_qty", p);
		p.Rslt_base_unit_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$base_unit_schd_qty_p);
		p.Rslt_base_unit_schd_qty_p_PPanel.setName("Rslt.base_unit_schd_qty_p");
		p.columnRslt_base_unit_schd_qty = p.Rslt_base_unit_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_schd_qty.addAliasName("Rslt.base_unit_schd_qty", p);
		p.Rslt_base_unit_pf_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$base_unit_pf_qty_p);
		p.Rslt_base_unit_pf_qty_p_PPanel.setName("Rslt.base_unit_pf_qty_p");
		p.columnRslt_base_unit_pf_qty = p.Rslt_base_unit_pf_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_pf_qty.addAliasName("Rslt.base_unit_pf_qty", p);
		p.Rslt_base_unit_prms_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$base_unit_prms_qty_p);
		p.Rslt_base_unit_prms_qty_p_PPanel.setName("Rslt.base_unit_prms_qty_p");
		p.columnRslt_base_unit_prms_qty = p.Rslt_base_unit_prms_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_prms_qty.addAliasName("Rslt.base_unit_prms_qty", p);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$pre_base_unit_pf_qty_p);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.setName("Rslt.pre_base_unit_pf_qty_p");
		p.columnRslt_pre_base_unit_pf_qty = p.Rslt_pre_base_unit_pf_qty_p_PPanel.columnQty_qty;
		p.columnRslt_pre_base_unit_pf_qty.addAliasName("Rslt.pre_base_unit_pf_qty", p);
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_pf_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_pf_usr_cd.addAliasName("Rslt.pf_usr_cd", p);
		p.columnRslt_pf_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_pf_usr_nm.addAliasName("Rslt.pf_usr_nm", p);
		p.columnRslt_pf_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_pf_dpt_cd.addAliasName("Rslt.pf_dpt_cd", p);
		p.columnRslt_pf_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_pf_dpt_nm.addAliasName("Rslt.pf_dpt_nm", p);
		p.Rslt_rtn_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$rtn_msg_p);
		p.Rslt_rtn_msg_p_PPanel.setName("Rslt.rtn_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rtn_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$sppl_grp_p);
		p.Rslt_sppl_grp_p_PPanel.setName("Rslt.sppl_grp_p");
		p.columnRslt_sppl_grp_cd1 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_sppl_grp_cd1.addAliasName("Rslt.sppl_grp_cd1", p);
		p.columnRslt_sppl_grp_nm1 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_sppl_grp_nm1.addAliasName("Rslt.sppl_grp_nm1", p);
		p.columnRslt_sppl_grp_cd2 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_sppl_grp_cd2.addAliasName("Rslt.sppl_grp_cd2", p);
		p.columnRslt_sppl_grp_nm2 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_sppl_grp_nm2.addAliasName("Rslt.sppl_grp_nm2", p);
		p.columnRslt_sppl_grp_cd3 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_sppl_grp_cd3.addAliasName("Rslt.sppl_grp_cd3", p);
		p.columnRslt_sppl_grp_nm3 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_sppl_grp_nm3.addAliasName("Rslt.sppl_grp_nm3", p);
		p.columnRslt_sppl_grp_cd4 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_sppl_grp_cd4.addAliasName("Rslt.sppl_grp_cd4", p);
		p.columnRslt_sppl_grp_nm4 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_sppl_grp_nm4.addAliasName("Rslt.sppl_grp_nm4", p);
		p.columnRslt_sppl_grp_cd5 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_sppl_grp_cd5.addAliasName("Rslt.sppl_grp_cd5", p);
		p.columnRslt_sppl_grp_nm5 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_sppl_grp_nm5.addAliasName("Rslt.sppl_grp_nm5", p);
		p.columnRslt_sppl_grp_cd6 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_sppl_grp_cd6.addAliasName("Rslt.sppl_grp_cd6", p);
		p.columnRslt_sppl_grp_nm6 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_sppl_grp_nm6.addAliasName("Rslt.sppl_grp_nm6", p);
		p.columnRslt_sppl_grp_cd7 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_sppl_grp_cd7.addAliasName("Rslt.sppl_grp_cd7", p);
		p.columnRslt_sppl_grp_nm7 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_sppl_grp_nm7.addAliasName("Rslt.sppl_grp_nm7", p);
		p.columnRslt_sppl_grp_cd8 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_sppl_grp_cd8.addAliasName("Rslt.sppl_grp_cd8", p);
		p.columnRslt_sppl_grp_nm8 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_sppl_grp_nm8.addAliasName("Rslt.sppl_grp_nm8", p);
		p.columnRslt_sppl_grp_cd9 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_sppl_grp_cd9.addAliasName("Rslt.sppl_grp_cd9", p);
		p.columnRslt_sppl_grp_nm9 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_sppl_grp_nm9.addAliasName("Rslt.sppl_grp_nm9", p);
		p.columnRslt_sppl_grp_cd10 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_sppl_grp_cd10.addAliasName("Rslt.sppl_grp_cd10", p);
		p.columnRslt_sppl_grp_nm10 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_sppl_grp_nm10.addAliasName("Rslt.sppl_grp_nm10", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBD.MSBDP0210.RsltR.$itm_grp_p);
		p.Rslt_itm_grp_p_PPanel.setName("Rslt.itm_grp_p");
		p.columnRslt_itm_grp_cd1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt_itm_grp_cd1.addAliasName("Rslt.itm_grp_cd1", p);
		p.columnRslt_itm_grp_nm1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt_itm_grp_nm1.addAliasName("Rslt.itm_grp_nm1", p);
		p.columnRslt_itm_grp_cd2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt_itm_grp_cd2.addAliasName("Rslt.itm_grp_cd2", p);
		p.columnRslt_itm_grp_nm2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt_itm_grp_nm2.addAliasName("Rslt.itm_grp_nm2", p);
		p.columnRslt_itm_grp_cd3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt_itm_grp_cd3.addAliasName("Rslt.itm_grp_cd3", p);
		p.columnRslt_itm_grp_nm3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt_itm_grp_nm3.addAliasName("Rslt.itm_grp_nm3", p);
		p.columnRslt_itm_grp_cd4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt_itm_grp_cd4.addAliasName("Rslt.itm_grp_cd4", p);
		p.columnRslt_itm_grp_nm4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt_itm_grp_nm4.addAliasName("Rslt.itm_grp_nm4", p);
		p.columnRslt_itm_grp_cd5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt_itm_grp_cd5.addAliasName("Rslt.itm_grp_cd5", p);
		p.columnRslt_itm_grp_nm5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt_itm_grp_nm5.addAliasName("Rslt.itm_grp_nm5", p);
		p.columnRslt_itm_grp_cd6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt_itm_grp_cd6.addAliasName("Rslt.itm_grp_cd6", p);
		p.columnRslt_itm_grp_nm6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt_itm_grp_nm6.addAliasName("Rslt.itm_grp_nm6", p);
		p.columnRslt_itm_grp_cd7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt_itm_grp_cd7.addAliasName("Rslt.itm_grp_cd7", p);
		p.columnRslt_itm_grp_nm7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt_itm_grp_nm7.addAliasName("Rslt.itm_grp_nm7", p);
		p.columnRslt_itm_grp_cd8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt_itm_grp_cd8.addAliasName("Rslt.itm_grp_cd8", p);
		p.columnRslt_itm_grp_nm8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt_itm_grp_nm8.addAliasName("Rslt.itm_grp_nm8", p);
		p.columnRslt_itm_grp_cd9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt_itm_grp_cd9.addAliasName("Rslt.itm_grp_cd9", p);
		p.columnRslt_itm_grp_nm9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt_itm_grp_nm9.addAliasName("Rslt.itm_grp_nm9", p);
		p.columnRslt_itm_grp_cd10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt_itm_grp_cd10.addAliasName("Rslt.itm_grp_cd10", p);
		p.columnRslt_itm_grp_nm10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt_itm_grp_nm10.addAliasName("Rslt.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBDP_PurcFrcstReg p) {
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

	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
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
	
	
	/** [Cnd_pf_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pf_usr_cd_p = null;

	/**
	 * [Cnd_pf_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pf_usr_cd_ListPutter() {
		if (Cnd_pf_usr_cd_p == null) {
			Cnd_pf_usr_cd_p = createCnd_pf_usr_cd_ListPutter(Cnd_pf_usr_cd, "pf_usr_cd", "pf_usr_nm");

		}
		return Cnd_pf_usr_cd_p;
	}
	
	
	/** [Cnd_pf_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pf_dpt_cd_p = null;

	/**
	 * [Cnd_pf_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pf_dpt_cd_ListPutter() {
		if (Cnd_pf_dpt_cd_p == null) {
			Cnd_pf_dpt_cd_p = createCnd_pf_dpt_cd_ListPutter(Cnd_pf_dpt_cd, "pf_dpt_cd", "pf_dpt_nm");

		}
		return Cnd_pf_dpt_cd_p;
	}
	
	
	/** [Cnd_pf_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pf_wg_cd_p = null;

	/**
	 * [Cnd_pf_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pf_wg_cd_ListPutter() {
		if (Cnd_pf_wg_cd_p == null) {
			Cnd_pf_wg_cd_p = createCnd_pf_wg_cd_ListPutter(Cnd_pf_wg_cd, "pf_wg_cd", "pf_wg_nm");

		}
		return Cnd_pf_wg_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [BulkSet_pf_usr_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_pf_usr_cd_p = null;

	/**
	 * [BulkSet_pf_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_pf_usr_cd_ListPutter() {
		if (BulkSet_pf_usr_cd_p == null) {
			BulkSet_pf_usr_cd_p = createBulkSet_pf_usr_cd_ListPutter(BulkSet_pf_usr_cd, "pf_usr_cd", "pf_usr_nm","pf_dpt_cd");

		}
		return BulkSet_pf_usr_cd_p;
	}
	
	
	/** [BulkSet_pf_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_pf_dpt_cd_p = null;

	/**
	 * [BulkSet_pf_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_pf_dpt_cd_ListPutter() {
		if (BulkSet_pf_dpt_cd_p == null) {
			BulkSet_pf_dpt_cd_p = createBulkSet_pf_dpt_cd_ListPutter(BulkSet_pf_dpt_cd, "pf_dpt_cd", "pf_dpt_nm");

		}
		return BulkSet_pf_dpt_cd_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "pf_dpt_cd", "pf_dpt_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcFrcstReg create(){
		MSBDP_PurcFrcstReg p = new MSBDP_PurcFrcstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcFrcstReg create(String name){
		MSBDP_PurcFrcstReg p = new MSBDP_PurcFrcstReg(name);
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
		MSBDP_PurcFrcstReg_MC.jbfInitScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitDispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitTop((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitFold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitTab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitTab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitTab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitFixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitDelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitRptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitSubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitPurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitCnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitCnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitCnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitLPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitCtrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitRPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitBulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitRslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitBtn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbfInitEastBtn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitDispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitTop((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitFold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitTab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitTab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitTab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitFixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitDelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitRptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitSubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitPurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitCnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitCnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitCnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitLPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitCtrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitRPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitBulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitRslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitBtn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.jbInitEastBtn((MSBDP_PurcFrcstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBDP_PurcFrcstReg p) {
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
	protected static void jbfInitTab1(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [FixSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFixSts(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.FixStsPanel = p.beansFactory.createPanel("FixSts");
		p.FixStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DelSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDelSts(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.DelStsPanel = p.beansFactory.createPanel("DelSts");
		p.DelStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RptSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRptSts(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.RptStsPanel = p.beansFactory.createPanel("RptSts");
		p.RptStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SubconTgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSubconTgt(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.SubconTgtPanel = p.beansFactory.createPanel("SubconTgt");
		p.SubconTgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PurcCommitTgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPurcCommitTgt(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.PurcCommitTgtPanel = p.beansFactory.createPanel("PurcCommitTgt");
		p.PurcCommitTgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_DEL_CAN = p.beansFactory.createRadioButton("Cnd.ope_DEL_CAN");
		p.Cnd_ope_RPT = p.beansFactory.createRadioButton("Cnd.ope_RPT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_disp_ope_Group = p.beansFactory.createButtonGroup("Cnd.disp_ope");
		p.Cnd_disp_ope_HDR = p.beansFactory.createRadioButton("Cnd.disp_ope_HDR");
		p.Cnd_disp_ope_DTL = p.beansFactory.createRadioButton("Cnd.disp_ope_DTL");
		p.Cnd_fix_f_flg = p.beansFactory.createCheckBox("Cnd.fix_f_flg");
		p.Cnd_fix_t_flg = p.beansFactory.createCheckBox("Cnd.fix_t_flg");
		p.Cnd_rpt_f_flg = p.beansFactory.createCheckBox("Cnd.rpt_f_flg");
		p.Cnd_rpt_t_flg = p.beansFactory.createCheckBox("Cnd.rpt_t_flg");
		p.Cnd_del_f_flg = p.beansFactory.createCheckBox("Cnd.del_f_flg");
		p.Cnd_del_t_flg = p.beansFactory.createCheckBox("Cnd.del_t_flg");
		p.Cnd_subcon_t_flg = p.beansFactory.createCheckBox("Cnd.subcon_t_flg");
		p.Cnd_subcon_f_flg = p.beansFactory.createCheckBox("Cnd.subcon_f_flg");
		p.Cnd_purc_commit_t_flg = p.beansFactory.createCheckBox("Cnd.purc_commit_t_flg");
		p.Cnd_purc_commit_f_flg = p.beansFactory.createCheckBox("Cnd.purc_commit_f_flg");
		p.Cnd_pf_dt_fr_Label = p.beansFactory.createLabel("Cnd.pf_dt_fr_Label");
		p.Cnd_pf_dt_fr = p.beansFactory.createDateField("Cnd.pf_dt_fr");
		p.Cnd_pf_dt_fr.setLabel(p.Cnd_pf_dt_fr_Label);
		p.Cnd_pf_dt_to_Label = p.beansFactory.createLabel("Cnd.pf_dt_to_Label");
		p.Cnd_pf_dt_to = p.beansFactory.createDateField("Cnd.pf_dt_to");
		p.Cnd_pf_dt_to.setLabel(p.Cnd_pf_dt_to_Label);
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_pf_usr_cd_Label = p.beansFactory.createLabel("Cnd.pf_usr_cd_Label");
		p.Cnd_pf_usr_cd = p.beansFactory.createTextField("Cnd.pf_usr_cd");
		p.Cnd_pf_usr_cd.setLabel(p.Cnd_pf_usr_cd_Label);
		p.Cnd_pf_usr_nm = p.beansFactory.createTextField("Cnd.pf_usr_nm");
		p.Cnd_pf_dpt_cd_Label = p.beansFactory.createLabel("Cnd.pf_dpt_cd_Label");
		p.Cnd_pf_dpt_cd = p.beansFactory.createTextField("Cnd.pf_dpt_cd");
		p.Cnd_pf_dpt_cd.setLabel(p.Cnd_pf_dpt_cd_Label);
		p.Cnd_pf_dpt_nm = p.beansFactory.createTextField("Cnd.pf_dpt_nm");
		p.Cnd_pf_wg_cd_Label = p.beansFactory.createLabel("Cnd.pf_wg_cd_Label");
		p.Cnd_pf_wg_cd = p.beansFactory.createTextComboBox("Cnd.pf_wg_cd");
		p.Cnd_pf_wg_cd.setLabel(p.Cnd_pf_wg_cd_Label);
		p.Cnd_pf_wg_nm = p.beansFactory.createTextField("Cnd.pf_wg_nm");
		p.Cnd_pf_rpt_no_Label = p.beansFactory.createLabel("Cnd.pf_rpt_no_Label");
		p.Cnd_pf_rpt_no = p.beansFactory.createTextField("Cnd.pf_rpt_no");
		p.Cnd_pf_rpt_no.setLabel(p.Cnd_pf_rpt_no_Label);
		p.Cnd_hdr_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.hdr_rpt_rmrks_Label");
		p.Cnd_hdr_rpt_rmrks = p.beansFactory.createTextField("Cnd.hdr_rpt_rmrks");
		p.Cnd_hdr_rpt_rmrks.setLabel(p.Cnd_hdr_rpt_rmrks_Label);
		p.Cnd_hdr_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.hdr_intr_rmrks_Label");
		p.Cnd_hdr_intr_rmrks = p.beansFactory.createTextField("Cnd.hdr_intr_rmrks");
		p.Cnd_hdr_intr_rmrks.setLabel(p.Cnd_hdr_intr_rmrks_Label);
		p.Cnd_hdr_sub_char1_Label = p.beansFactory.createLabel("Cnd.hdr_sub_char1_Label");
		p.Cnd_hdr_sub_char1 = p.beansFactory.createTextField("Cnd.hdr_sub_char1");
		p.Cnd_hdr_sub_char1.setLabel(p.Cnd_hdr_sub_char1_Label);
		p.Cnd_hdr_sub_char2_Label = p.beansFactory.createLabel("Cnd.hdr_sub_char2_Label");
		p.Cnd_hdr_sub_char2 = p.beansFactory.createTextField("Cnd.hdr_sub_char2");
		p.Cnd_hdr_sub_char2.setLabel(p.Cnd_hdr_sub_char2_Label);
		p.Cnd_hdr_sub_char3_Label = p.beansFactory.createLabel("Cnd.hdr_sub_char3_Label");
		p.Cnd_hdr_sub_char3 = p.beansFactory.createTextField("Cnd.hdr_sub_char3");
		p.Cnd_hdr_sub_char3.setLabel(p.Cnd_hdr_sub_char3_Label);
		p.Cnd_dtl_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.dtl_rpt_rmrks_Label");
		p.Cnd_dtl_rpt_rmrks = p.beansFactory.createTextField("Cnd.dtl_rpt_rmrks");
		p.Cnd_dtl_rpt_rmrks.setLabel(p.Cnd_dtl_rpt_rmrks_Label);
		p.Cnd_dtl_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.dtl_intr_rmrks_Label");
		p.Cnd_dtl_intr_rmrks = p.beansFactory.createTextField("Cnd.dtl_intr_rmrks");
		p.Cnd_dtl_intr_rmrks.setLabel(p.Cnd_dtl_intr_rmrks_Label);
		p.Cnd_dtl_sub_char1_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char1_Label");
		p.Cnd_dtl_sub_char1 = p.beansFactory.createTextField("Cnd.dtl_sub_char1");
		p.Cnd_dtl_sub_char1.setLabel(p.Cnd_dtl_sub_char1_Label);
		p.Cnd_dtl_sub_char2_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char2_Label");
		p.Cnd_dtl_sub_char2 = p.beansFactory.createTextField("Cnd.dtl_sub_char2");
		p.Cnd_dtl_sub_char2.setLabel(p.Cnd_dtl_sub_char2_Label);
		p.Cnd_dtl_sub_char3_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char3_Label");
		p.Cnd_dtl_sub_char3 = p.beansFactory.createTextField("Cnd.dtl_sub_char3");
		p.Cnd_dtl_sub_char3.setLabel(p.Cnd_dtl_sub_char3_Label);
		p.Cnd_show_pre_flg = p.beansFactory.createCheckBox("Cnd.show_pre_flg");
		p.Cnd_show_base_unit_flg = p.beansFactory.createCheckBox("Cnd.show_base_unit_flg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_pf_usr_cd_Label = p.beansFactory.createLabel("BulkSet.pf_usr_cd_Label");
		p.BulkSet_pf_usr_cd = p.beansFactory.createTextField("BulkSet.pf_usr_cd");
		p.BulkSet_pf_usr_cd.setLabel(p.BulkSet_pf_usr_cd_Label);
		p.BulkSet_pf_usr_nm = p.beansFactory.createTextField("BulkSet.pf_usr_nm");
		p.BulkSet_pf_dpt_cd_Label = p.beansFactory.createLabel("BulkSet.pf_dpt_cd_Label");
		p.BulkSet_pf_dpt_cd = p.beansFactory.createTextField("BulkSet.pf_dpt_cd");
		p.BulkSet_pf_dpt_cd.setLabel(p.BulkSet_pf_dpt_cd_Label);
		p.BulkSet_pf_dpt_nm = p.beansFactory.createTextField("BulkSet.pf_dpt_nm");
		p.BulkSet_setting = p.beansFactory.createButton("BulkSet.setting");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_fix_flg = p.beansFactory.createTableColumn("Rslt.fix_flg", MCColumnType.CHECK);
		p.columnRslt_del_flg = p.beansFactory.createTableColumn("Rslt.del_flg", MCColumnType.CHECK);
		p.columnRslt_purc_commit_flg = p.beansFactory.createTableColumn("Rslt.purc_commit_flg", MCColumnType.CHECK);
		p.columnRslt_pf_period_typ = p.beansFactory.createTableColumn("Rslt.pf_period_typ", MCColumnType.TEXT);
		p.columnRslt_pf_period_typ_nm = p.beansFactory.createTableColumn("Rslt.pf_period_typ_nm", MCColumnType.TEXT);
		p.columnRslt_pf_period_st_dt = p.beansFactory.createTableColumn("Rslt.pf_period_st_dt", MCColumnType.DATE);
		p.columnRslt_pf_period_end_dt = p.beansFactory.createTableColumn("Rslt.pf_period_end_dt", MCColumnType.DATE);
		p.columnRslt_fix_period_flg = p.beansFactory.createTableColumn("Rslt.fix_period_flg", MCColumnType.CHECK);
		p.columnRslt_pre_fix_period_flg = p.beansFactory.createTableColumn("Rslt.pre_fix_period_flg", MCColumnType.CHECK);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_pre_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.pre_trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_pre_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.pre_trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_pre_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.pre_trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_dtl_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.dtl_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_dtl_intr_rmrks = p.beansFactory.createTableColumn("Rslt.dtl_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char1 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char1", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char2 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char2", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char3 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char3", MCColumnType.TEXT);
		p.columnRslt_latest_flg = p.beansFactory.createTableColumn("Rslt.latest_flg", MCColumnType.CHECK);
		p.columnRslt_pf_dt = p.beansFactory.createTableColumn("Rslt.pf_dt", MCColumnType.DATE);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_subcon_flg = p.beansFactory.createTableColumn("Rslt.subcon_flg", MCColumnType.CHECK);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_pf_rpt_flg = p.beansFactory.createTableColumn("Rslt.pf_rpt_flg", MCColumnType.CHECK);
		p.columnRslt_pf_rpt_dt = p.beansFactory.createTableColumn("Rslt.pf_rpt_dt", MCColumnType.DATE);
		p.columnRslt_pf_rpt_no = p.beansFactory.createTableColumn("Rslt.pf_rpt_no", MCColumnType.TEXT);
		p.columnRslt_del_pf_rpt_flg = p.beansFactory.createTableColumn("Rslt.del_pf_rpt_flg", MCColumnType.CHECK);
		p.columnRslt_del_pf_rpt_dt = p.beansFactory.createTableColumn("Rslt.del_pf_rpt_dt", MCColumnType.DATE);
		p.columnRslt_hdr_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.hdr_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_hdr_intr_rmrks = p.beansFactory.createTableColumn("Rslt.hdr_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_hdr_sub_char1 = p.beansFactory.createTableColumn("Rslt.hdr_sub_char1", MCColumnType.TEXT);
		p.columnRslt_hdr_sub_char2 = p.beansFactory.createTableColumn("Rslt.hdr_sub_char2", MCColumnType.TEXT);
		p.columnRslt_hdr_sub_char3 = p.beansFactory.createTableColumn("Rslt.hdr_sub_char3", MCColumnType.TEXT);
		p.columnRslt_pre_pf_dt = p.beansFactory.createTableColumn("Rslt.pre_pf_dt", MCColumnType.DATE);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0090 = p.beansFactory.createButton("Btn.open_MSBEP0090", "open");
		p.Btn_open_MSBDP0030 = p.beansFactory.createButton("Btn.open_MSBDP0030", "open");
		p.Btn_open_MSBCP0050 = p.beansFactory.createButton("Btn.open_MSBCP0050", "open");
		p.Btn_open_MSBCP0130 = p.beansFactory.createButton("Btn.open_MSBCP0130", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_label_check = p.beansFactory.createLabel("Btn.label_check");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_label_fix = p.beansFactory.createLabel("Btn.label_fix");
		p.Btn_fix_all = p.beansFactory.createButton("Btn.fix_all", "no_border");
		p.Btn_unfix_all = p.beansFactory.createButton("Btn.unfix_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_prnt_flg = p.beansFactory.createCheckBox("Btn.prnt_flg");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.DispUnitPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispUnit(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel.setBorder(p.DispUnitTitledBorder);
		p.add(p.DispUnitPanel);
		p.DispUnitPanel.setNextBeans(p.TopPanel);
		p.DispUnitPanel.setValueCheck(false);
		p.DispUnitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnitPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BulkSetPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBDP_PurcFrcstReg p) {
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
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.FoldTab.add(p.Tab3Panel, "Fold.tab3");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.FixStsPanel, null);
		p.Tab1Panel.setLastBeans(p.FixStsPanel);
		p.FixStsPanel.setNextBeans(p.RptStsPanel);
		p.Tab1Panel.add(p.RptStsPanel, null);
		p.RptStsPanel.setNextBeans(p.DelStsPanel);
		p.Tab1Panel.add(p.DelStsPanel, null);
		p.DelStsPanel.setNextBeans(p.SubconTgtPanel);
		p.Tab1Panel.add(p.SubconTgtPanel, null);
		p.SubconTgtPanel.setNextBeans(p.PurcCommitTgtPanel);
		p.Tab1Panel.add(p.PurcCommitTgtPanel, null);
		p.PurcCommitTgtPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [FixSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFixSts(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.FixStsPanel.setBorder(p.FixStsTitledBorder);
		p.FixStsPanel.setValueCheck(false);
		p.FixStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FixStsPanel.setLayoutPosition("CNW");
		// ブロックの項目の初期化
	}

	/**
	 * [DelSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDelSts(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.DelStsPanel.setBorder(p.DelStsTitledBorder);
		p.DelStsPanel.setValueCheck(false);
		p.DelStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DelStsPanel.setLayoutPosition("CNWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [RptSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRptSts(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.RptStsPanel.setBorder(p.RptStsTitledBorder);
		p.RptStsPanel.setValueCheck(false);
		p.RptStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RptStsPanel.setLayoutPosition("CNWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [SubconTgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSubconTgt(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.SubconTgtPanel.setBorder(p.SubconTgtTitledBorder);
		p.SubconTgtPanel.setValueCheck(false);
		p.SubconTgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SubconTgtPanel.setLayoutPosition("CNWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PurcCommitTgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPurcCommitTgt(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.PurcCommitTgtPanel.setBorder(p.PurcCommitTgtTitledBorder);
		p.PurcCommitTgtPanel.setValueCheck(false);
		p.PurcCommitTgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PurcCommitTgtPanel.setLayoutPosition("CNWXCXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_DEL_CAN);
		p.Cnd_ope_DEL_CAN.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_CAN);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_CAN);
		p.Cnd_ope_DEL_CAN.setNextBeans(p.Cnd_ope_RPT);
		p.Cnd_ope_RPT.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_RPT);
		p.ScreenOpePanel.add(p.Cnd_ope_RPT);
		p.Cnd_ope_RPT.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.ope_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_disp_ope_Group);
		p.Cnd_disp_ope_Group.setFirstBeans(p.Cnd_disp_ope_HDR);
		p.Cnd_disp_ope_HDR.setActionCommand("0");
		p.Cnd_disp_ope_Group.add(p.Cnd_disp_ope_HDR);
		p.DispUnitPanel.add(p.Cnd_disp_ope_HDR);
		p.Cnd_disp_ope_HDR.setNextBeans(p.Cnd_disp_ope_DTL);
		p.Cnd_disp_ope_DTL.setActionCommand("1");
		p.Cnd_disp_ope_Group.add(p.Cnd_disp_ope_DTL);
		p.DispUnitPanel.add(p.Cnd_disp_ope_DTL);
		p.Cnd_disp_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.disp_ope_META);
		p.FixStsPanel.add(p.Cnd_fix_f_flg);
		p.FixStsPanel.setLastBeans(p.Cnd_fix_f_flg);
		p.Cnd_fix_f_flg.setNextBeans(p.Cnd_fix_t_flg);
		p.Cnd_fix_f_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.fix_f_flg_META);
		p.FixStsPanel.add(p.Cnd_fix_t_flg);
		p.Cnd_fix_t_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.fix_t_flg_META);
		p.RptStsPanel.add(p.Cnd_rpt_f_flg);
		p.RptStsPanel.setLastBeans(p.Cnd_rpt_f_flg);
		p.Cnd_rpt_f_flg.setNextBeans(p.Cnd_rpt_t_flg);
		p.Cnd_rpt_f_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.rpt_f_flg_META);
		p.RptStsPanel.add(p.Cnd_rpt_t_flg);
		p.Cnd_rpt_t_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.rpt_t_flg_META);
		p.DelStsPanel.add(p.Cnd_del_f_flg);
		p.DelStsPanel.setLastBeans(p.Cnd_del_f_flg);
		p.Cnd_del_f_flg.setNextBeans(p.Cnd_del_t_flg);
		p.Cnd_del_f_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.del_f_flg_META);
		p.DelStsPanel.add(p.Cnd_del_t_flg);
		p.Cnd_del_t_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.del_t_flg_META);
		p.SubconTgtPanel.add(p.Cnd_subcon_t_flg);
		p.SubconTgtPanel.setLastBeans(p.Cnd_subcon_t_flg);
		p.Cnd_subcon_t_flg.setNextBeans(p.Cnd_subcon_f_flg);
		p.Cnd_subcon_t_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.subcon_t_flg_META);
		p.SubconTgtPanel.add(p.Cnd_subcon_f_flg);
		p.Cnd_subcon_f_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.subcon_f_flg_META);
		p.PurcCommitTgtPanel.add(p.Cnd_purc_commit_t_flg);
		p.PurcCommitTgtPanel.setLastBeans(p.Cnd_purc_commit_t_flg);
		p.Cnd_purc_commit_t_flg.setNextBeans(p.Cnd_purc_commit_f_flg);
		p.Cnd_purc_commit_t_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.purc_commit_t_flg_META);
		p.PurcCommitTgtPanel.add(p.Cnd_purc_commit_f_flg);
		p.Cnd_purc_commit_f_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.purc_commit_f_flg_META);
		p.CndPanel.add(p.Cnd_pf_dt_fr_Label);
		p.CndPanel.add(p.Cnd_pf_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_pf_dt_fr);
		p.Cnd_pf_dt_fr.setNextBeans(p.Cnd_pf_dt_to);
		p.Cnd_pf_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_dt_fr_META);
		p.Cnd_pf_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pf_dt_to_Label);
		p.CndPanel.add(p.Cnd_pf_dt_to);
		p.Cnd_pf_dt_to.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_pf_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_dt_to_META);
		p.Cnd_pf_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.latest_flg_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_pf_usr_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_pf_usr_cd_Label);
		p.CndPanel.add(p.Cnd_pf_usr_cd);
		p.Cnd_pf_usr_cd.setNextBeans(p.Cnd_pf_usr_nm);
		p.Cnd_pf_usr_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_usr_cd_META);
		p.Cnd_pf_usr_cd.addLinkBeans(p.Cnd_pf_usr_nm);
		p.Cnd_pf_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pf_usr_cd, true);
		p.CndPanel.add(p.Cnd_pf_usr_nm);
		p.Cnd_pf_usr_nm.setNextBeans(p.Cnd_pf_dpt_cd);
		p.Cnd_pf_usr_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_pf_usr_nm, true);
		p.CndPanel.add(p.Cnd_pf_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_pf_dpt_cd);
		p.Cnd_pf_dpt_cd.setNextBeans(p.Cnd_pf_dpt_nm);
		p.Cnd_pf_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_dpt_cd_META);
		p.Cnd_pf_dpt_cd.addLinkBeans(p.Cnd_pf_dpt_nm);
		p.Cnd_pf_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pf_dpt_cd, true);
		p.CndPanel.add(p.Cnd_pf_dpt_nm);
		p.Cnd_pf_dpt_nm.setNextBeans(p.Cnd_pf_wg_cd);
		p.Cnd_pf_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_pf_dpt_nm, true);
		p.Cnd_pf_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pf_wg_cd, true);
		p.Cnd_pf_wg_cd.setLinkBeans(p.Cnd_pf_wg_nm);
		p.CndPanel.add(p.Cnd_pf_wg_cd_Label);
		p.CndPanel.add(p.Cnd_pf_wg_cd);
		p.Cnd_pf_wg_cd.setNextBeans(p.Cnd_pf_wg_nm);
		p.Cnd_pf_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_wg_cd_META);
		p.CndPanel.add(p.Cnd_pf_wg_nm);
		p.Cnd_pf_wg_nm.setNextBeans(p.Cnd_pf_rpt_no);
		p.Cnd_pf_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_pf_wg_nm, true);
		p.CndPanel.add(p.Cnd_pf_rpt_no_Label);
		p.CndPanel.add(p.Cnd_pf_rpt_no);
		p.Cnd_pf_rpt_no.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_pf_rpt_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.pf_rpt_no_META);
		p.setPluralValueEnable(p.Cnd_pf_rpt_no, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_hdr_rpt_rmrks);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_hdr_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_hdr_rpt_rmrks);
		p.Cnd_hdr_rpt_rmrks.setNextBeans(p.Cnd_hdr_intr_rmrks);
		p.Cnd_hdr_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.hdr_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_hdr_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_hdr_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_hdr_intr_rmrks);
		p.Cnd_hdr_intr_rmrks.setNextBeans(p.Cnd_hdr_sub_char1);
		p.Cnd_hdr_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.hdr_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_hdr_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_hdr_sub_char1_Label);
		p.CndPanel.add(p.Cnd_hdr_sub_char1);
		p.Cnd_hdr_sub_char1.setNextBeans(p.Cnd_hdr_sub_char2);
		p.Cnd_hdr_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.hdr_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_hdr_sub_char1, true);
		p.CndPanel.add(p.Cnd_hdr_sub_char2_Label);
		p.CndPanel.add(p.Cnd_hdr_sub_char2);
		p.Cnd_hdr_sub_char2.setNextBeans(p.Cnd_hdr_sub_char3);
		p.Cnd_hdr_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.hdr_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_hdr_sub_char2, true);
		p.CndPanel.add(p.Cnd_hdr_sub_char3_Label);
		p.CndPanel.add(p.Cnd_hdr_sub_char3);
		p.Cnd_hdr_sub_char3.setNextBeans(p.Cnd_dtl_rpt_rmrks);
		p.Cnd_hdr_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.hdr_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_hdr_sub_char3, true);
		p.CndPanel.add(p.Cnd_dtl_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_dtl_rpt_rmrks);
		p.Cnd_dtl_rpt_rmrks.setNextBeans(p.Cnd_dtl_intr_rmrks);
		p.Cnd_dtl_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.dtl_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dtl_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_dtl_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_dtl_intr_rmrks);
		p.Cnd_dtl_intr_rmrks.setNextBeans(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.dtl_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dtl_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char1_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_sub_char1.setNextBeans(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.dtl_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char1, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char2_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char2.setNextBeans(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.dtl_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char2, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char3_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.dtl_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_sppl_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_sppl_grp_p_PPanel);
		p.Cnd3Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.LPnlPanel.add(p.Cnd_show_pre_flg);
		p.LPnlPanel.setLastBeans(p.Cnd_show_pre_flg);
		p.Cnd_show_pre_flg.setNextBeans(p.Cnd_show_base_unit_flg);
		p.Cnd_show_pre_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.show_pre_flg_META);
		p.LPnlPanel.add(p.Cnd_show_base_unit_flg);
		p.Cnd_show_base_unit_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0210.CndR.show_base_unit_flg_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBDP_PurcFrcstReg p) {
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
	protected static void jbInitRPnl(MSBDP_PurcFrcstReg p) {
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
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_pf_usr_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_pf_usr_cd);
		p.BulkSetPanel.setLastBeans(p.BulkSet_pf_usr_cd);
		p.BulkSet_pf_usr_cd.setNextBeans(p.BulkSet_pf_usr_nm);
		p.BulkSet_pf_usr_cd.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0210.BulkSetR.pf_usr_cd_META);
		p.BulkSet_pf_usr_cd.addLinkBeans(p.BulkSet_pf_usr_nm,p.BulkSet_pf_dpt_cd);
		p.BulkSet_pf_usr_cd.setListType(MCListType.STRICT);
		p.BulkSetPanel.add(p.BulkSet_pf_usr_nm);
		p.BulkSet_pf_usr_nm.setNextBeans(p.BulkSet_pf_dpt_cd);
		p.BulkSet_pf_usr_nm.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0210.BulkSetR.pf_usr_nm_META);
		p.BulkSetPanel.add(p.BulkSet_pf_dpt_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_pf_dpt_cd);
		p.BulkSet_pf_dpt_cd.setNextBeans(p.BulkSet_pf_dpt_nm);
		p.BulkSet_pf_dpt_cd.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0210.BulkSetR.pf_dpt_cd_META);
		p.BulkSet_pf_dpt_cd.addLinkBeans(p.BulkSet_pf_dpt_nm);
		p.BulkSet_pf_dpt_cd.setListType(MCListType.FREE);
		p.BulkSetPanel.add(p.BulkSet_pf_dpt_nm);
		p.BulkSet_pf_dpt_nm.setNextBeans(p.BulkSet_setting);
		p.BulkSet_pf_dpt_nm.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0210.BulkSetR.pf_dpt_nm_META);
		p.BulkSet_setting.setFunctionKey(MCFunctionKey.F5);
		p.BulkSetPanel.add(p.BulkSet_setting);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBDP_PurcFrcstReg p) {
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
	protected static void jbInitBtn(MSBDP_PurcFrcstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0090.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP0090);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP0090);
		p.Btn_open_MSBEP0090.setNextBeans(p.Btn_open_MSBDP0030);
		p.Btn_open_MSBDP0030.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBDP0030);
		p.Btn_open_MSBDP0030.setNextBeans(p.Btn_open_MSBCP0050);
		p.Btn_open_MSBCP0050.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBCP0050);
		p.Btn_open_MSBCP0050.setNextBeans(p.Btn_open_MSBCP0130);
		p.Btn_open_MSBCP0130.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBCP0130);
		p.Btn_open_MSBCP0130.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_all);
		p.BtnPanel.add(p.Btn_label_check);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_fix_all);
		p.BtnPanel.add(p.Btn_label_fix);
		p.Btn_fix_all.setIcon("SELECT_ALL");
		p.Btn_fix_all.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_fix_all);
		p.Btn_fix_all.setNextBeans(p.Btn_unfix_all);
		p.Btn_unfix_all.setIcon("DESELECT_ALL");
		p.Btn_unfix_all.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_unfix_all);
		p.Btn_unfix_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_prnt_flg);
		p.BtnPanel.add(p.Btn_prnt_flg);
		p.Btn_prnt_flg.setNextBeans(p.Btn_indiv_prnt_flg);
		p.Btn_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBD.MSBDP0210.BtnR.prnt_flg_META);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBD.MSBDP0210.BtnR.indiv_prnt_flg_META);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBDP_PurcFrcstReg p) {
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
		MSBDP_PurcFrcstReg_MC.mcInitScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitDispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitTop((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitFold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitTab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitTab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitTab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitFixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitDelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitRptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitSubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitPurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitCnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitCnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitCnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitLPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitCtrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitRPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitBulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitRslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitBtn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.mcInitEastBtn((MSBDP_PurcFrcstReg)this);

		// [HDR_SRCH_UPD]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__UPD_EastBtn((MSBDP_PurcFrcstReg)this);

		// [HDR_UPD]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__UPD_EastBtn((MSBDP_PurcFrcstReg)this);

		// [HDR_SRCH_DEL]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL_EastBtn((MSBDP_PurcFrcstReg)this);

		// [HDR_DEL]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL_EastBtn((MSBDP_PurcFrcstReg)this);

		// [HDR_SRCH_DEL_CAN]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH__DEL__CAN_EastBtn((MSBDP_PurcFrcstReg)this);

		// [HDR_DEL_CAN]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__DEL__CAN_EastBtn((MSBDP_PurcFrcstReg)this);

		// [SRCH_RPT]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitSRCH__RPT_EastBtn((MSBDP_PurcFrcstReg)this);

		// [RPT]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitRPT_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitRPT_EastBtn((MSBDP_PurcFrcstReg)this);

		// [HDR_SRCH]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__SRCH_EastBtn((MSBDP_PurcFrcstReg)this);

		// [HDR_REF]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitHDR__REF_EastBtn((MSBDP_PurcFrcstReg)this);

		// [DTL_SRCH_UPD]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH__UPD_EastBtn((MSBDP_PurcFrcstReg)this);

		// [DTL_UPD]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__UPD_EastBtn((MSBDP_PurcFrcstReg)this);

		// [DTL_FIX_U]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__FIX__U_EastBtn((MSBDP_PurcFrcstReg)this);

		// [DTL_SRCH]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__SRCH_EastBtn((MSBDP_PurcFrcstReg)this);

		// [DTL_REF]ステータスのモードの設定
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_ScreenOpe((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_DispUnit((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Top((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Fold((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Tab1((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Tab2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Tab3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_FixSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_DelSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_RptSts((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_SubconTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_PurcCommitTgt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Cnd((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Cnd2((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Cnd3((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_LPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Ctrl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_RPnl((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_BulkSet((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Rslt((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_Btn((MSBDP_PurcFrcstReg)this);
		MSBDP_PurcFrcstReg_MC.statusInitDTL__REF_EastBtn((MSBDP_PurcFrcstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBDP_PurcFrcstReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [FixSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFixSts(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [DelSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDelSts(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [RptSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRptSts(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [SubconTgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSubconTgt(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [PurcCommitTgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPurcCommitTgt(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PurcFrcstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_DEL_CAN.addAllListener(p);
		p.Cnd_ope_RPT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_disp_ope_Group.addAllListener(p);
		p.Cnd_disp_ope_HDR.addAllListener(p);
		p.Cnd_disp_ope_DTL.addAllListener(p);
		p.Cnd_fix_f_flg.addAllListener(p);
		p.Cnd_fix_t_flg.addAllListener(p);
		p.Cnd_rpt_f_flg.addAllListener(p);
		p.Cnd_rpt_t_flg.addAllListener(p);
		p.Cnd_del_f_flg.addAllListener(p);
		p.Cnd_del_t_flg.addAllListener(p);
		p.Cnd_subcon_t_flg.addAllListener(p);
		p.Cnd_subcon_f_flg.addAllListener(p);
		p.Cnd_purc_commit_t_flg.addAllListener(p);
		p.Cnd_purc_commit_f_flg.addAllListener(p);
		p.Cnd_pf_dt_fr.setListListener(p);
		p.Cnd_pf_dt_fr.addAllListener(p);
		p.Cnd_pf_dt_to.setListListener(p);
		p.Cnd_pf_dt_to.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_pf_usr_cd.setListListener(p);
		p.Cnd_pf_usr_cd.addAllListener(p);
		p.Cnd_pf_usr_nm.setListListener(p);
		p.Cnd_pf_usr_nm.addAllListener(p);
		p.Cnd_pf_dpt_cd.setListListener(p);
		p.Cnd_pf_dpt_cd.addAllListener(p);
		p.Cnd_pf_dpt_nm.setListListener(p);
		p.Cnd_pf_dpt_nm.addAllListener(p);
		p.Cnd_pf_wg_cd.setListListener(p);
		p.Cnd_pf_wg_cd.addAllListener(p);
		p.Cnd_pf_wg_nm.setListListener(p);
		p.Cnd_pf_wg_nm.addAllListener(p);
		p.Cnd_pf_rpt_no.setListListener(p);
		p.Cnd_pf_rpt_no.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_hdr_rpt_rmrks.setListListener(p);
		p.Cnd_hdr_rpt_rmrks.addAllListener(p);
		p.Cnd_hdr_intr_rmrks.setListListener(p);
		p.Cnd_hdr_intr_rmrks.addAllListener(p);
		p.Cnd_hdr_sub_char1.setListListener(p);
		p.Cnd_hdr_sub_char1.addAllListener(p);
		p.Cnd_hdr_sub_char2.setListListener(p);
		p.Cnd_hdr_sub_char2.addAllListener(p);
		p.Cnd_hdr_sub_char3.setListListener(p);
		p.Cnd_hdr_sub_char3.addAllListener(p);
		p.Cnd_dtl_rpt_rmrks.setListListener(p);
		p.Cnd_dtl_rpt_rmrks.addAllListener(p);
		p.Cnd_dtl_intr_rmrks.setListListener(p);
		p.Cnd_dtl_intr_rmrks.addAllListener(p);
		p.Cnd_dtl_sub_char1.setListListener(p);
		p.Cnd_dtl_sub_char1.addAllListener(p);
		p.Cnd_dtl_sub_char2.setListListener(p);
		p.Cnd_dtl_sub_char2.addAllListener(p);
		p.Cnd_dtl_sub_char3.setListListener(p);
		p.Cnd_dtl_sub_char3.addAllListener(p);
		p.Cnd_show_pre_flg.addAllListener(p);
		p.Cnd_show_base_unit_flg.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBDP_PurcFrcstReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBDP_PurcFrcstReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBDP_PurcFrcstReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBDP_PurcFrcstReg p) {
		p.BulkSet_pf_usr_cd.setListListener(p);
		p.BulkSet_pf_usr_cd.addAllListener(p);
		p.BulkSet_pf_usr_nm.setListListener(p);
		p.BulkSet_pf_usr_nm.addAllListener(p);
		p.BulkSet_pf_dpt_cd.setListListener(p);
		p.BulkSet_pf_dpt_cd.addAllListener(p);
		p.BulkSet_pf_dpt_nm.setListListener(p);
		p.BulkSet_pf_dpt_nm.addAllListener(p);
		p.BulkSet_setting.addAllListener(p);
		p.BulkSet_setting.setAPMethodName("doBulkSet_setting");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBDP_PurcFrcstReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_fix_flg.addAllListener(p);
		p.columnRslt_del_flg.addAllListener(p);
		p.columnRslt_purc_commit_flg.addAllListener(p);
		p.columnRslt_pf_period_typ.addAllListener(p);
		p.columnRslt_pf_period_typ.setListListener(p);
		p.columnRslt_pf_period_typ_nm.addAllListener(p);
		p.columnRslt_pf_period_typ_nm.setListListener(p);
		p.columnRslt_pf_period_st_dt.addAllListener(p);
		p.columnRslt_pf_period_st_dt.setListListener(p);
		p.columnRslt_pf_period_end_dt.addAllListener(p);
		p.columnRslt_pf_period_end_dt.setListListener(p);
		p.columnRslt_fix_period_flg.addAllListener(p);
		p.columnRslt_pre_fix_period_flg.addAllListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_qty.setListListener(p);
		p.columnRslt_pre_trd_unit_cd.addAllListener(p);
		p.columnRslt_pre_trd_unit_cd.setListListener(p);
		p.columnRslt_pre_trd_unit_nm.addAllListener(p);
		p.columnRslt_pre_trd_unit_nm.setListListener(p);
		p.columnRslt_pre_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_pre_trd_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_dtl_rpt_rmrks.addAllListener(p);
		p.columnRslt_dtl_rpt_rmrks.setListListener(p);
		p.columnRslt_dtl_intr_rmrks.addAllListener(p);
		p.columnRslt_dtl_intr_rmrks.setListListener(p);
		p.columnRslt_dtl_sub_char1.addAllListener(p);
		p.columnRslt_dtl_sub_char1.setListListener(p);
		p.columnRslt_dtl_sub_char2.addAllListener(p);
		p.columnRslt_dtl_sub_char2.setListListener(p);
		p.columnRslt_dtl_sub_char3.addAllListener(p);
		p.columnRslt_dtl_sub_char3.setListListener(p);
		p.columnRslt_latest_flg.addAllListener(p);
		p.columnRslt_pf_dt.addAllListener(p);
		p.columnRslt_pf_dt.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_subcon_flg.addAllListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_pf_rpt_flg.addAllListener(p);
		p.columnRslt_pf_rpt_dt.addAllListener(p);
		p.columnRslt_pf_rpt_dt.setListListener(p);
		p.columnRslt_pf_rpt_no.addAllListener(p);
		p.columnRslt_pf_rpt_no.setListListener(p);
		p.columnRslt_del_pf_rpt_flg.addAllListener(p);
		p.columnRslt_del_pf_rpt_dt.addAllListener(p);
		p.columnRslt_del_pf_rpt_dt.setListListener(p);
		p.columnRslt_hdr_rpt_rmrks.addAllListener(p);
		p.columnRslt_hdr_rpt_rmrks.setListListener(p);
		p.columnRslt_hdr_intr_rmrks.addAllListener(p);
		p.columnRslt_hdr_intr_rmrks.setListListener(p);
		p.columnRslt_hdr_sub_char1.addAllListener(p);
		p.columnRslt_hdr_sub_char1.setListListener(p);
		p.columnRslt_hdr_sub_char2.addAllListener(p);
		p.columnRslt_hdr_sub_char2.setListListener(p);
		p.columnRslt_hdr_sub_char3.addAllListener(p);
		p.columnRslt_hdr_sub_char3.setListListener(p);
		p.columnRslt_pre_pf_dt.addAllListener(p);
		p.columnRslt_pre_pf_dt.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
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
	protected static void mcInitBtn(MSBDP_PurcFrcstReg p) {
		p.Btn_open_MSBEP0090.addAllListener(p);
		p.Btn_open_MSBEP0090.setAPMethodName("doBtn_open_MSBEP0090");
		p.Btn_open_MSBDP0030.addAllListener(p);
		p.Btn_open_MSBDP0030.setAPMethodName("doBtn_open_MSBDP0030");
		p.Btn_open_MSBCP0050.addAllListener(p);
		p.Btn_open_MSBCP0050.setAPMethodName("doBtn_open_MSBCP0050");
		p.Btn_open_MSBCP0130.addAllListener(p);
		p.Btn_open_MSBCP0130.setAPMethodName("doBtn_open_MSBCP0130");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_fix_all.addAllListener(p);
		p.Btn_fix_all.setAPMethodName("doBtn_fix_all");
		p.Btn_unfix_all.addAllListener(p);
		p.Btn_unfix_all.setAPMethodName("doBtn_unfix_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_prnt_flg.addAllListener(p);
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBDP_PurcFrcstReg p) {
	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.BulkSet_pf_usr_nm.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, HDR_SRCH_UPD, MCMode.ENABLE);
		p.BulkSet_pf_dpt_nm.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR_SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR_SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR_SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, HDR_SRCH_UPD, MCMode.REQUIRED);
		p.Btn_del.putMode(p, HDR_SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [HDR_SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__UPD_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, HDR_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, HDR_UPD, MCMode.ENABLE);

	}

	/**
	 * [HDR_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.BulkSet_pf_usr_nm.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.BulkSet_pf_dpt_nm.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, HDR_UPD, MCMode.ENABLE);

	}

	/**
	 * [HDR_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.columnRslt_fix_flg.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_pf_rpt_flg.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.columnRslt_hdr_intr_rmrks.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char1.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char2.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char3.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.columnRslt_pre_pf_dt.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR_UPD, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, HDR_UPD, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, HDR_UPD, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, HDR_UPD, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, HDR_UPD, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, HDR_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Btn_fix_all.putMode(p, HDR_UPD, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, HDR_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, HDR_UPD, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, HDR_UPD, MCMode.REQUIRED);
		p.Btn_del.putMode(p, HDR_UPD, MCMode.DISABLE);

	}

	/**
	 * [HDR_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__UPD_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_fix_f_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_del_t_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_subcon_t_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, HDR_SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, HDR_SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR_SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR_SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, HDR_SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, HDR_SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [HDR_SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Cnd_fix_f_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Cnd_del_t_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Cnd_subcon_t_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, HDR_DEL, MCMode.ENABLE);

	}

	/**
	 * [HDR_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, HDR_DEL, MCMode.ENABLE);

	}

	/**
	 * [HDR_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.columnRslt_fix_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char1.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char2.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char3.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.columnRslt_pre_pf_dt.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR_DEL, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, HDR_DEL, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, HDR_DEL, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, HDR_DEL, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, HDR_DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, HDR_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, HDR_DEL, MCMode.ENABLE);
		p.Btn_fix_all.putMode(p, HDR_DEL, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, HDR_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, HDR_DEL, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, HDR_DEL, MCMode.REQUIRED);
		p.Btn_del.putMode(p, HDR_DEL, MCMode.ENABLE);

	}

	/**
	 * [HDR_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_fix_f_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_del_t_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_subcon_t_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, HDR_SRCH_DEL_CAN, MCMode.ENABLE);

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR_SRCH_DEL_CAN, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_upd.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, HDR_SRCH_DEL_CAN, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, HDR_SRCH_DEL_CAN, MCMode.DISABLE);

	}

	/**
	 * [HDR_SRCH_DEL_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH__DEL__CAN_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_fix_f_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_del_t_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_subcon_t_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, HDR_DEL_CAN, MCMode.REQUIRED);
		p.columnRslt_fix_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char1.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char2.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.columnRslt_hdr_sub_char3.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.columnRslt_pre_pf_dt.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR_DEL_CAN, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR_DEL_CAN, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);
		p.Btn_fix_all.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);
		p.Btn_upd.putMode(p, HDR_DEL_CAN, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, HDR_DEL_CAN, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, HDR_DEL_CAN, MCMode.ENABLE);

	}

	/**
	 * [HDR_DEL_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__DEL__CAN_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Cnd_fix_f_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, SRCH_RPT, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, SRCH_RPT, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_RPT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [SRCH_RPT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, SRCH_RPT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_RPT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, SRCH_RPT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_RPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_RPT, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_RPT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_RPT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_RPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_RPT, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_RPT, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_RPT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_RPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RPT_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitRPT_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitRPT_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitRPT_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitRPT_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitRPT_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitRPT_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitRPT_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, RPT, MCMode.READ_ONLY);
		p.Cnd_fix_f_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, RPT, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, RPT, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, RPT, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, RPT, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, RPT, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, RPT, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, RPT, MCMode.READ_ONLY);

	}

	/**
	 * [RPT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitRPT_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [RPT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitRPT_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, RPT, MCMode.ENABLE);

	}

	/**
	 * [RPT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitRPT_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, RPT, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, RPT, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, RPT, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, RPT, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, RPT, MCMode.ENABLE);

	}

	/**
	 * [RPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, RPT, MCMode.REQUIRED);
		p.columnRslt_fix_flg.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, RPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, RPT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, RPT, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, RPT, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, RPT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, RPT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, RPT, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(RPT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, RPT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, RPT, MCMode.READ_ONLY);

	}

	/**
	 * [RPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitRPT_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, RPT, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, RPT, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, RPT, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, RPT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, RPT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, RPT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, RPT, MCMode.ENABLE);
		p.Btn_fix_all.putMode(p, RPT, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, RPT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, RPT, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, RPT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, RPT, MCMode.REQUIRED);
		p.Btn_del.putMode(p, RPT, MCMode.DISABLE);

	}

	/**
	 * [RPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitRPT_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, HDR_SRCH, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, HDR_SRCH, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, HDR_SRCH, MCMode.ENABLE);

	}

	/**
	 * [HDR_SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, HDR_SRCH, MCMode.DISABLE);

	}

	/**
	 * [HDR_SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_fix_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR_SRCH, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR_SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, HDR_SRCH, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, HDR_SRCH, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, HDR_SRCH, MCMode.DISABLE);

	}

	/**
	 * [HDR_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__SRCH_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_hdr_rpt_rmrks.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, HDR_REF, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_show_pre_flg.putMode(p, HDR_REF, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [HDR_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, HDR_REF, MCMode.ENABLE);

	}

	/**
	 * [HDR_REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, HDR_REF, MCMode.DISABLE);

	}

	/**
	 * [HDR_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_fix_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_pf_period_typ.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_pf_period_typ_nm.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_pf_period_st_dt.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_pf_period_end_dt.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_fix_period_flg.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_pre_fix_period_flg.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_nm.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_latest_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR_REF, MCMode.INVISIBLE);
		p.Rslt_rtn_msg_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR_REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR_REF, MCMode.READ_ONLY);

	}

	/**
	 * [HDR_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, HDR_REF, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, HDR_REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, HDR_REF, MCMode.DISABLE);

	}

	/**
	 * [HDR_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitHDR__REF_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_hdr_rpt_rmrks.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_show_pre_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, DTL_SRCH_UPD, MCMode.REQUIRED);

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, DTL_SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_pf_period_typ.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_period_typ_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_period_st_dt.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_period_end_dt.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_fix_period_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_fix_period_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, DTL_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, DTL_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, DTL_SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pre_trd_unit_cd.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, DTL_SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DTL_SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DTL_SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_latest_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DTL_SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, DTL_SRCH_UPD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DTL_SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [DTL_SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH__UPD_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_hdr_rpt_rmrks.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_show_pre_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);

	}

	/**
	 * [DTL_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, DTL_UPD, MCMode.ENABLE);

	}

	/**
	 * [DTL_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, DTL_UPD, MCMode.DISABLE);

	}

	/**
	 * [DTL_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.columnRslt_fix_flg.putMode(p, DTL_UPD, MCMode.REQUIRED);
		p.columnRslt_del_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_pf_period_typ.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_period_typ_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_period_st_dt.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_period_end_dt.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_fix_period_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_fix_period_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, DTL_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, DTL_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, DTL_UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnRslt_pre_trd_unit_cd.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, DTL_UPD, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DTL_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DTL_UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char1.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char2.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char3.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.columnRslt_latest_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DTL_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DTL_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [DTL_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_open_MSBDP0030.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_open_MSBCP0050.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_open_MSBCP0130.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, DTL_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_fix_all.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_unfix_all.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DTL_UPD, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, DTL_UPD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DTL_UPD, MCMode.DISABLE);

	}

	/**
	 * [DTL_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__UPD_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_hdr_rpt_rmrks.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, DTL_FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_show_pre_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, DTL_FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [DTL_FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, DTL_FIX_U, MCMode.ENABLE);

	}

	/**
	 * [DTL_FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, DTL_FIX_U, MCMode.DISABLE);

	}

	/**
	 * [DTL_FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_pf_period_typ.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pf_period_typ_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pf_period_st_dt.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pf_period_end_dt.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_fix_period_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_fix_period_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, DTL_FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, DTL_FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, DTL_FIX_U, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pre_trd_unit_cd.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, DTL_FIX_U, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DTL_FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DTL_FIX_U, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_latest_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DTL_FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [DTL_FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DTL_FIX_U, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, DTL_FIX_U, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DTL_FIX_U, MCMode.DISABLE);

	}

	/**
	 * [DTL_FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__FIX__U_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_hdr_rpt_rmrks.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, DTL_SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_show_pre_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, DTL_SRCH, MCMode.REQUIRED);

	}

	/**
	 * [DTL_SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, DTL_SRCH, MCMode.ENABLE);

	}

	/**
	 * [DTL_SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, DTL_SRCH, MCMode.DISABLE);

	}

	/**
	 * [DTL_SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, DTL_SRCH, MCMode.INVISIBLE);
		p.columnRslt_fix_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_pf_period_typ.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_period_typ_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_period_st_dt.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_period_end_dt.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_fix_period_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_fix_period_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, DTL_SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, DTL_SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, DTL_SRCH, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pre_trd_unit_cd.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, DTL_SRCH, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DTL_SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DTL_SRCH, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_latest_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DTL_SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DTL_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [DTL_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBDP0030.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DTL_SRCH, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, DTL_SRCH, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DTL_SRCH, MCMode.DISABLE);

	}

	/**
	 * [DTL_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__SRCH_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_ScreenOpe(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_DispUnit(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Top(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Fold(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Tab1(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Tab2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Tab3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[FixSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_FixSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[DelSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_DelSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[RptSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_RptSts(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[SubconTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_SubconTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[PurcCommitTgt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_PurcCommitTgt(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Cnd(MSBDP_PurcFrcstReg p){
		p.Cnd_ope_Group.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_disp_ope_Group.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_rpt_f_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_rpt_t_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_del_f_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_del_t_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_subcon_t_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_subcon_f_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_purc_commit_t_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_purc_commit_f_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_pf_dt_fr.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_pf_dt_to.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_pf_usr_cd.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_pf_usr_nm.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_pf_dpt_cd.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_pf_dpt_nm.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_pf_wg_cd.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_pf_wg_nm.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_pf_rpt_no.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_hdr_rpt_rmrks.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_hdr_intr_rmrks.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_hdr_sub_char1.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_hdr_sub_char2.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_hdr_sub_char3.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_dtl_rpt_rmrks.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_show_pre_flg.putMode(p, DTL_REF, MCMode.REQUIRED);
		p.Cnd_show_base_unit_flg.putMode(p, DTL_REF, MCMode.REQUIRED);

	}

	/**
	 * [DTL_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Cnd2(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Cnd3(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_LPnl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Ctrl(MSBDP_PurcFrcstReg p){

	}

	/**
	 * [DTL_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_RPnl(MSBDP_PurcFrcstReg p){
		p.RPnl_dwnld.putMode(p, DTL_REF, MCMode.ENABLE);

	}

	/**
	 * [DTL_REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_BulkSet(MSBDP_PurcFrcstReg p){
		p.BulkSet_pf_usr_cd.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.BulkSet_pf_usr_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_cd.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.BulkSet_pf_dpt_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, DTL_REF, MCMode.DISABLE);

	}

	/**
	 * [DTL_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Rslt(MSBDP_PurcFrcstReg p){
		p.columnRslt_check.putMode(p, DTL_REF, MCMode.INVISIBLE);
		p.columnRslt_fix_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_del_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_purc_commit_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_pf_period_typ.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_period_typ_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_period_st_dt.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_period_end_dt.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_fix_period_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_fix_period_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, DTL_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, DTL_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, DTL_REF, MCMode.INVISIBLE);
		p.Rslt_trd_unit_schd_qty_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_pf_qty_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pre_trd_unit_cd.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_trd_unit_dec_place.putMode(p, DTL_REF, MCMode.INVISIBLE);
		p.Rslt_pre_trd_unit_pf_qty_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DTL_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DTL_REF, MCMode.INVISIBLE);
		p.Rslt_base_unit_schd_qty_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_pf_qty_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_prms_qty_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pre_base_unit_pf_qty_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dtl_rpt_rmrks.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_latest_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_dt.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_pf_rpt_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_dt.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pf_rpt_no.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_del_pf_rpt_dt.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_rpt_rmrks.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_intr_rmrks.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char1.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char2.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_hdr_sub_char3.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_pf_dt.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DTL_REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DTL_REF, MCMode.READ_ONLY);

	}

	/**
	 * [DTL_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_Btn(MSBDP_PurcFrcstReg p){
		p.Btn_open_MSBEP0090.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Btn_open_MSBDP0030.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0050.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0130.putMode(p, DTL_REF, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, DTL_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DTL_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DTL_REF, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, DTL_REF, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, DTL_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DTL_REF, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, DTL_REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DTL_REF, MCMode.DISABLE);

	}

	/**
	 * [DTL_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDTL__REF_EastBtn(MSBDP_PurcFrcstReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return HDR_SRCH_UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBDP_PurcFrcstReg_MC.setTableConfigRslt((MSBDP_PurcFrcstReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBDP_PurcFrcstReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_fix_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_flg);
		p.columnRslt_del_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.del_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_del_flg);
		p.columnRslt_purc_commit_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.purc_commit_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_commit_flg);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_pf_period_typ.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pf_period_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_period_typ);
		p.columnRslt_pf_period_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pf_period_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_period_typ_nm);
		p.columnRslt_pf_period_st_dt.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pf_period_st_dt_META);
		p.columnRslt_pf_period_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_period_st_dt);
		p.columnRslt_pf_period_end_dt.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pf_period_end_dt_META);
		p.columnRslt_pf_period_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_period_end_dt);
		p.columnRslt_fix_period_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.fix_period_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_period_flg);
		p.columnRslt_pre_fix_period_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pre_fix_period_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_fix_period_flg);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_base_qty);
		p.columnRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_qty);
		p.RsltTable.addTable(p.Rslt_trd_unit_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_unit_pf_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_unit_prms_qty_p_PPanel.QtyTable);
		p.columnRslt_pre_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pre_trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_trd_unit_cd);
		p.columnRslt_pre_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pre_trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_trd_unit_nm);
		p.columnRslt_pre_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pre_trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_trd_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_pre_trd_unit_pf_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_base_unit_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_pf_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_prms_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_pre_base_unit_pf_qty_p_PPanel.QtyTable);
		p.columnRslt_dtl_rpt_rmrks.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.dtl_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_rpt_rmrks);
		p.columnRslt_dtl_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.dtl_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_intr_rmrks);
		p.columnRslt_dtl_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.dtl_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char1);
		p.columnRslt_dtl_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.dtl_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char2);
		p.columnRslt_dtl_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.dtl_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char3);
		p.columnRslt_latest_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.latest_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_latest_flg);
		p.columnRslt_pf_dt.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pf_dt_META);
		p.columnRslt_pf_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_dt);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_subcon_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.subcon_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_subcon_flg);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_pf_dpt_nm);
		p.columnRslt_pf_rpt_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pf_rpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_rpt_flg);
		p.columnRslt_pf_rpt_dt.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pf_rpt_dt_META);
		p.columnRslt_pf_rpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_rpt_dt);
		p.columnRslt_pf_rpt_no.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pf_rpt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pf_rpt_no);
		p.columnRslt_del_pf_rpt_flg.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.del_pf_rpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_del_pf_rpt_flg);
		p.columnRslt_del_pf_rpt_dt.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.del_pf_rpt_dt_META);
		p.columnRslt_del_pf_rpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_del_pf_rpt_dt);
		p.columnRslt_hdr_rpt_rmrks.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.hdr_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_hdr_rpt_rmrks);
		p.columnRslt_hdr_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.hdr_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_hdr_intr_rmrks);
		p.columnRslt_hdr_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.hdr_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_hdr_sub_char1);
		p.columnRslt_hdr_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.hdr_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_hdr_sub_char2);
		p.columnRslt_hdr_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.hdr_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_hdr_sub_char3);
		p.columnRslt_pre_pf_dt.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.pre_pf_dt_META);
		p.columnRslt_pre_pf_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_pf_dt);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rtn_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_sppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0210.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_pf_usr_cd.getListConfig().setPutter(getCnd_pf_usr_cd_ListPutter());
		Cnd_pf_dpt_cd.getListConfig().setPutter(getCnd_pf_dpt_cd_ListPutter());
		Cnd_pf_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pf_wg_cd.getListConfig().setPutter(getCnd_pf_wg_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		BulkSet_pf_usr_cd.getListConfig().setPutter(getBulkSet_pf_usr_cd_ListPutter());
		BulkSet_pf_dpt_cd.getListConfig().setPutter(getBulkSet_pf_dpt_cd_ListPutter());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[HDR_SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDR_SRCH_UPDStatus() {
		status = HDR_SRCH_UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[HDR_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDR_UPDStatus() {
		status = HDR_UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[HDR_SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDR_SRCH_DELStatus() {
		status = HDR_SRCH_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[HDR_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDR_DELStatus() {
		status = HDR_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[HDR_SRCH_DEL_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDR_SRCH_DEL_CANStatus() {
		status = HDR_SRCH_DEL_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[HDR_DEL_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDR_DEL_CANStatus() {
		status = HDR_DEL_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_RPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_RPTStatus() {
		status = SRCH_RPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[RPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setRPTStatus() {
		status = RPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[HDR_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDR_SRCHStatus() {
		status = HDR_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[HDR_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDR_REFStatus() {
		status = HDR_REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[DTL_SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDTL_SRCH_UPDStatus() {
		status = DTL_SRCH_UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[DTL_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDTL_UPDStatus() {
		status = DTL_UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[DTL_FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDTL_FIX_UStatus() {
		status = DTL_FIX_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[DTL_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDTL_SRCHStatus() {
		status = DTL_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[DTL_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDTL_REFStatus() {
		status = DTL_REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (HDR_SRCH_UPD.equals(status)) {
			setHDR_SRCH_UPDStatus();
		}
		else if (HDR_UPD.equals(status)) {
			setHDR_UPDStatus();
		}
		else if (HDR_SRCH_DEL.equals(status)) {
			setHDR_SRCH_DELStatus();
		}
		else if (HDR_DEL.equals(status)) {
			setHDR_DELStatus();
		}
		else if (HDR_SRCH_DEL_CAN.equals(status)) {
			setHDR_SRCH_DEL_CANStatus();
		}
		else if (HDR_DEL_CAN.equals(status)) {
			setHDR_DEL_CANStatus();
		}
		else if (SRCH_RPT.equals(status)) {
			setSRCH_RPTStatus();
		}
		else if (RPT.equals(status)) {
			setRPTStatus();
		}
		else if (HDR_SRCH.equals(status)) {
			setHDR_SRCHStatus();
		}
		else if (HDR_REF.equals(status)) {
			setHDR_REFStatus();
		}
		else if (DTL_SRCH_UPD.equals(status)) {
			setDTL_SRCH_UPDStatus();
		}
		else if (DTL_UPD.equals(status)) {
			setDTL_UPDStatus();
		}
		else if (DTL_FIX_U.equals(status)) {
			setDTL_FIX_UStatus();
		}
		else if (DTL_SRCH.equals(status)) {
			setDTL_SRCHStatus();
		}
		else if (DTL_REF.equals(status)) {
			setDTL_REFStatus();
		}
	}

	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcWg");
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
	 * [Cnd_pf_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pf_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_pf_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pf_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_pf_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pf_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcWg");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [BulkSet_pf_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_pf_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [BulkSet_pf_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_pf_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_pf_usr_cd) return getCnd_pf_usr_cd(row, info);
		if(combo == Cnd_pf_dpt_cd) return getCnd_pf_dpt_cd(row, info);
		if(combo == Cnd_pf_wg_cd) return getCnd_pf_wg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == BulkSet_pf_usr_cd) return getBulkSet_pf_usr_cd(row, info);
		if(combo == BulkSet_pf_dpt_cd) return getBulkSet_pf_dpt_cd(row, info);
		if(combo == Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
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
		else if (ap == BulkSet_setting) doBulkSet_setting(info);
		else if (ap == Btn_open_MSBEP0090) doBtn_open_MSBEP0090(info);
		else if (ap == Btn_open_MSBDP0030) doBtn_open_MSBDP0030(info);
		else if (ap == Btn_open_MSBCP0050) doBtn_open_MSBCP0050(info);
		else if (ap == Btn_open_MSBCP0130) doBtn_open_MSBCP0130(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_fix_all) doBtn_fix_all(info);
		else if (ap == Btn_unfix_all) doBtn_unfix_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
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
	 * [BulkSet]パネルの[setting]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_setting(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0090(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBDP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0130(MCEventInfo info);

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
	 * [Btn]パネルの[fix_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_fix_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[unfix_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_unfix_all(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_disp_ope_Group) return doCnd_disp_ope_VC(info);
		if (vc == Cnd_fix_f_flg) return doCnd_fix_f_flg_VC(info);
		if (vc == Cnd_fix_t_flg) return doCnd_fix_t_flg_VC(info);
		if (vc == Cnd_rpt_f_flg) return doCnd_rpt_f_flg_VC(info);
		if (vc == Cnd_rpt_t_flg) return doCnd_rpt_t_flg_VC(info);
		if (vc == Cnd_del_f_flg) return doCnd_del_f_flg_VC(info);
		if (vc == Cnd_del_t_flg) return doCnd_del_t_flg_VC(info);
		if (vc == Cnd_subcon_t_flg) return doCnd_subcon_t_flg_VC(info);
		if (vc == Cnd_subcon_f_flg) return doCnd_subcon_f_flg_VC(info);
		if (vc == Cnd_purc_commit_t_flg) return doCnd_purc_commit_t_flg_VC(info);
		if (vc == Cnd_purc_commit_f_flg) return doCnd_purc_commit_f_flg_VC(info);
		if (vc == Cnd_pf_dt_fr) return doCnd_pf_dt_fr_VC(info);
		if (vc == Cnd_pf_dt_to) return doCnd_pf_dt_to_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_pf_usr_cd) return doCnd_pf_usr_cd_VC(info);
		if (vc == Cnd_pf_usr_nm) return doCnd_pf_usr_nm_VC(info);
		if (vc == Cnd_pf_dpt_cd) return doCnd_pf_dpt_cd_VC(info);
		if (vc == Cnd_pf_dpt_nm) return doCnd_pf_dpt_nm_VC(info);
		if (vc == Cnd_pf_wg_cd) return doCnd_pf_wg_cd_VC(info);
		if (vc == Cnd_pf_wg_nm) return doCnd_pf_wg_nm_VC(info);
		if (vc == Cnd_pf_rpt_no) return doCnd_pf_rpt_no_VC(info);
		if (vc == Cnd_hdr_rpt_rmrks) return doCnd_hdr_rpt_rmrks_VC(info);
		if (vc == Cnd_hdr_intr_rmrks) return doCnd_hdr_intr_rmrks_VC(info);
		if (vc == Cnd_hdr_sub_char1) return doCnd_hdr_sub_char1_VC(info);
		if (vc == Cnd_hdr_sub_char2) return doCnd_hdr_sub_char2_VC(info);
		if (vc == Cnd_hdr_sub_char3) return doCnd_hdr_sub_char3_VC(info);
		if (vc == Cnd_dtl_rpt_rmrks) return doCnd_dtl_rpt_rmrks_VC(info);
		if (vc == Cnd_dtl_intr_rmrks) return doCnd_dtl_intr_rmrks_VC(info);
		if (vc == Cnd_dtl_sub_char1) return doCnd_dtl_sub_char1_VC(info);
		if (vc == Cnd_dtl_sub_char2) return doCnd_dtl_sub_char2_VC(info);
		if (vc == Cnd_dtl_sub_char3) return doCnd_dtl_sub_char3_VC(info);
		if (vc == Cnd_show_pre_flg) return doCnd_show_pre_flg_VC(info);
		if (vc == Cnd_show_base_unit_flg) return doCnd_show_base_unit_flg_VC(info);
		if (vc == BulkSet_pf_usr_cd) return doBulkSet_pf_usr_cd_VC(info);
		if (vc == BulkSet_pf_usr_nm) return doBulkSet_pf_usr_nm_VC(info);
		if (vc == BulkSet_pf_dpt_cd) return doBulkSet_pf_dpt_cd_VC(info);
		if (vc == BulkSet_pf_dpt_nm) return doBulkSet_pf_dpt_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_fix_flg) return doRslt_fix_flg_VC(info);
		if (vc == columnRslt_del_flg) return doRslt_del_flg_VC(info);
		if (vc == columnRslt_purc_commit_flg) return doRslt_purc_commit_flg_VC(info);
		if (vc == columnRslt_pf_period_typ) return doRslt_pf_period_typ_VC(info);
		if (vc == columnRslt_pf_period_typ_nm) return doRslt_pf_period_typ_nm_VC(info);
		if (vc == columnRslt_pf_period_st_dt) return doRslt_pf_period_st_dt_VC(info);
		if (vc == columnRslt_pf_period_end_dt) return doRslt_pf_period_end_dt_VC(info);
		if (vc == columnRslt_fix_period_flg) return doRslt_fix_period_flg_VC(info);
		if (vc == columnRslt_pre_fix_period_flg) return doRslt_pre_fix_period_flg_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_conv_base_qty) return doRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_trd_unit_conv_qty) return doRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_pre_trd_unit_cd) return doRslt_pre_trd_unit_cd_VC(info);
		if (vc == columnRslt_pre_trd_unit_nm) return doRslt_pre_trd_unit_nm_VC(info);
		if (vc == columnRslt_pre_trd_unit_dec_place) return doRslt_pre_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_dtl_rpt_rmrks) return doRslt_dtl_rpt_rmrks_VC(info);
		if (vc == columnRslt_dtl_intr_rmrks) return doRslt_dtl_intr_rmrks_VC(info);
		if (vc == columnRslt_dtl_sub_char1) return doRslt_dtl_sub_char1_VC(info);
		if (vc == columnRslt_dtl_sub_char2) return doRslt_dtl_sub_char2_VC(info);
		if (vc == columnRslt_dtl_sub_char3) return doRslt_dtl_sub_char3_VC(info);
		if (vc == columnRslt_latest_flg) return doRslt_latest_flg_VC(info);
		if (vc == columnRslt_pf_dt) return doRslt_pf_dt_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_subcon_flg) return doRslt_subcon_flg_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_pf_rpt_flg) return doRslt_pf_rpt_flg_VC(info);
		if (vc == columnRslt_pf_rpt_dt) return doRslt_pf_rpt_dt_VC(info);
		if (vc == columnRslt_pf_rpt_no) return doRslt_pf_rpt_no_VC(info);
		if (vc == columnRslt_del_pf_rpt_flg) return doRslt_del_pf_rpt_flg_VC(info);
		if (vc == columnRslt_del_pf_rpt_dt) return doRslt_del_pf_rpt_dt_VC(info);
		if (vc == columnRslt_hdr_rpt_rmrks) return doRslt_hdr_rpt_rmrks_VC(info);
		if (vc == columnRslt_hdr_intr_rmrks) return doRslt_hdr_intr_rmrks_VC(info);
		if (vc == columnRslt_hdr_sub_char1) return doRslt_hdr_sub_char1_VC(info);
		if (vc == columnRslt_hdr_sub_char2) return doRslt_hdr_sub_char2_VC(info);
		if (vc == columnRslt_hdr_sub_char3) return doRslt_hdr_sub_char3_VC(info);
		if (vc == columnRslt_pre_pf_dt) return doRslt_pre_pf_dt_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
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
		if (vc == Btn_prnt_flg) return doBtn_prnt_flg_VC(info);
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
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[del_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_del_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[del_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_del_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[subcon_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_subcon_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[subcon_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_subcon_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_commit_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_commit_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_commit_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_commit_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pf_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pf_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pf_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pf_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pf_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pf_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pf_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pf_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pf_rpt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pf_rpt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[hdr_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_hdr_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[hdr_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_hdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_hdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_hdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_hdr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[show_pre_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_show_pre_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[show_base_unit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_show_base_unit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[pf_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_pf_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[pf_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_pf_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_pf_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_pf_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_commit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_commit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_period_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_period_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_period_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_period_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_period_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_period_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_period_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_fix_period_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_fix_period_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_trd_unit_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dtl_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_rpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_rpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_rpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_rpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pf_rpt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pf_rpt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_del_pf_rpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_del_pf_rpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[hdr_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_hdr_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[hdr_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_hdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_hdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_hdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_hdr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_pf_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_pf_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_nm_VC(MCEventInfo info){
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
	 * [Btn]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_prnt_flg_VC(MCEventInfo info){
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
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_disp_ope_Group) doCnd_disp_ope_NC(info);
		else if (nc == Cnd_fix_f_flg) doCnd_fix_f_flg_NC(info);
		else if (nc == Cnd_fix_t_flg) doCnd_fix_t_flg_NC(info);
		else if (nc == Cnd_rpt_f_flg) doCnd_rpt_f_flg_NC(info);
		else if (nc == Cnd_rpt_t_flg) doCnd_rpt_t_flg_NC(info);
		else if (nc == Cnd_del_f_flg) doCnd_del_f_flg_NC(info);
		else if (nc == Cnd_del_t_flg) doCnd_del_t_flg_NC(info);
		else if (nc == Cnd_subcon_t_flg) doCnd_subcon_t_flg_NC(info);
		else if (nc == Cnd_subcon_f_flg) doCnd_subcon_f_flg_NC(info);
		else if (nc == Cnd_purc_commit_t_flg) doCnd_purc_commit_t_flg_NC(info);
		else if (nc == Cnd_purc_commit_f_flg) doCnd_purc_commit_f_flg_NC(info);
		else if (nc == Cnd_pf_dt_fr) doCnd_pf_dt_fr_NC(info);
		else if (nc == Cnd_pf_dt_to) doCnd_pf_dt_to_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_pf_usr_cd) doCnd_pf_usr_cd_NC(info);
		else if (nc == Cnd_pf_usr_nm) doCnd_pf_usr_nm_NC(info);
		else if (nc == Cnd_pf_dpt_cd) doCnd_pf_dpt_cd_NC(info);
		else if (nc == Cnd_pf_dpt_nm) doCnd_pf_dpt_nm_NC(info);
		else if (nc == Cnd_pf_wg_cd) doCnd_pf_wg_cd_NC(info);
		else if (nc == Cnd_pf_wg_nm) doCnd_pf_wg_nm_NC(info);
		else if (nc == Cnd_pf_rpt_no) doCnd_pf_rpt_no_NC(info);
		else if (nc == Cnd_hdr_rpt_rmrks) doCnd_hdr_rpt_rmrks_NC(info);
		else if (nc == Cnd_hdr_intr_rmrks) doCnd_hdr_intr_rmrks_NC(info);
		else if (nc == Cnd_hdr_sub_char1) doCnd_hdr_sub_char1_NC(info);
		else if (nc == Cnd_hdr_sub_char2) doCnd_hdr_sub_char2_NC(info);
		else if (nc == Cnd_hdr_sub_char3) doCnd_hdr_sub_char3_NC(info);
		else if (nc == Cnd_dtl_rpt_rmrks) doCnd_dtl_rpt_rmrks_NC(info);
		else if (nc == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NC(info);
		else if (nc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NC(info);
		else if (nc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NC(info);
		else if (nc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NC(info);
		else if (nc == Cnd_show_pre_flg) doCnd_show_pre_flg_NC(info);
		else if (nc == Cnd_show_base_unit_flg) doCnd_show_base_unit_flg_NC(info);
		else if (nc == BulkSet_pf_usr_cd) doBulkSet_pf_usr_cd_NC(info);
		else if (nc == BulkSet_pf_usr_nm) doBulkSet_pf_usr_nm_NC(info);
		else if (nc == BulkSet_pf_dpt_cd) doBulkSet_pf_dpt_cd_NC(info);
		else if (nc == BulkSet_pf_dpt_nm) doBulkSet_pf_dpt_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_fix_flg) doRslt_fix_flg_NC(info);
		else if (nc == columnRslt_del_flg) doRslt_del_flg_NC(info);
		else if (nc == columnRslt_purc_commit_flg) doRslt_purc_commit_flg_NC(info);
		else if (nc == columnRslt_pf_period_typ) doRslt_pf_period_typ_NC(info);
		else if (nc == columnRslt_pf_period_typ_nm) doRslt_pf_period_typ_nm_NC(info);
		else if (nc == columnRslt_pf_period_st_dt) doRslt_pf_period_st_dt_NC(info);
		else if (nc == columnRslt_pf_period_end_dt) doRslt_pf_period_end_dt_NC(info);
		else if (nc == columnRslt_fix_period_flg) doRslt_fix_period_flg_NC(info);
		else if (nc == columnRslt_pre_fix_period_flg) doRslt_pre_fix_period_flg_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_pre_trd_unit_cd) doRslt_pre_trd_unit_cd_NC(info);
		else if (nc == columnRslt_pre_trd_unit_nm) doRslt_pre_trd_unit_nm_NC(info);
		else if (nc == columnRslt_pre_trd_unit_dec_place) doRslt_pre_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_dtl_rpt_rmrks) doRslt_dtl_rpt_rmrks_NC(info);
		else if (nc == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NC(info);
		else if (nc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NC(info);
		else if (nc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NC(info);
		else if (nc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NC(info);
		else if (nc == columnRslt_latest_flg) doRslt_latest_flg_NC(info);
		else if (nc == columnRslt_pf_dt) doRslt_pf_dt_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_subcon_flg) doRslt_subcon_flg_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_pf_rpt_flg) doRslt_pf_rpt_flg_NC(info);
		else if (nc == columnRslt_pf_rpt_dt) doRslt_pf_rpt_dt_NC(info);
		else if (nc == columnRslt_pf_rpt_no) doRslt_pf_rpt_no_NC(info);
		else if (nc == columnRslt_del_pf_rpt_flg) doRslt_del_pf_rpt_flg_NC(info);
		else if (nc == columnRslt_del_pf_rpt_dt) doRslt_del_pf_rpt_dt_NC(info);
		else if (nc == columnRslt_hdr_rpt_rmrks) doRslt_hdr_rpt_rmrks_NC(info);
		else if (nc == columnRslt_hdr_intr_rmrks) doRslt_hdr_intr_rmrks_NC(info);
		else if (nc == columnRslt_hdr_sub_char1) doRslt_hdr_sub_char1_NC(info);
		else if (nc == columnRslt_hdr_sub_char2) doRslt_hdr_sub_char2_NC(info);
		else if (nc == columnRslt_hdr_sub_char3) doRslt_hdr_sub_char3_NC(info);
		else if (nc == columnRslt_pre_pf_dt) doRslt_pre_pf_dt_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
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
		else if (nc == Btn_prnt_flg) doBtn_prnt_flg_NC(info);
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
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_commit_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_commit_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_commit_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_commit_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pf_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_rpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_rpt_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_pre_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_pre_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_base_unit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_base_unit_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_commit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_commit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_period_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_period_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_fix_period_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_fix_period_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_pf_rpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_pf_rpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_pf_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_pf_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NC(MCEventInfo info){
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
	 * [Btn]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NC(MCEventInfo info){
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
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_disp_ope_Group) doCnd_disp_ope_NE(info);
		else if (ne == Cnd_fix_f_flg) doCnd_fix_f_flg_NE(info);
		else if (ne == Cnd_fix_t_flg) doCnd_fix_t_flg_NE(info);
		else if (ne == Cnd_rpt_f_flg) doCnd_rpt_f_flg_NE(info);
		else if (ne == Cnd_rpt_t_flg) doCnd_rpt_t_flg_NE(info);
		else if (ne == Cnd_del_f_flg) doCnd_del_f_flg_NE(info);
		else if (ne == Cnd_del_t_flg) doCnd_del_t_flg_NE(info);
		else if (ne == Cnd_subcon_t_flg) doCnd_subcon_t_flg_NE(info);
		else if (ne == Cnd_subcon_f_flg) doCnd_subcon_f_flg_NE(info);
		else if (ne == Cnd_purc_commit_t_flg) doCnd_purc_commit_t_flg_NE(info);
		else if (ne == Cnd_purc_commit_f_flg) doCnd_purc_commit_f_flg_NE(info);
		else if (ne == Cnd_pf_dt_fr) doCnd_pf_dt_fr_NE(info);
		else if (ne == Cnd_pf_dt_to) doCnd_pf_dt_to_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_pf_usr_cd) doCnd_pf_usr_cd_NE(info);
		else if (ne == Cnd_pf_usr_nm) doCnd_pf_usr_nm_NE(info);
		else if (ne == Cnd_pf_dpt_cd) doCnd_pf_dpt_cd_NE(info);
		else if (ne == Cnd_pf_dpt_nm) doCnd_pf_dpt_nm_NE(info);
		else if (ne == Cnd_pf_wg_cd) doCnd_pf_wg_cd_NE(info);
		else if (ne == Cnd_pf_wg_nm) doCnd_pf_wg_nm_NE(info);
		else if (ne == Cnd_pf_rpt_no) doCnd_pf_rpt_no_NE(info);
		else if (ne == Cnd_hdr_rpt_rmrks) doCnd_hdr_rpt_rmrks_NE(info);
		else if (ne == Cnd_hdr_intr_rmrks) doCnd_hdr_intr_rmrks_NE(info);
		else if (ne == Cnd_hdr_sub_char1) doCnd_hdr_sub_char1_NE(info);
		else if (ne == Cnd_hdr_sub_char2) doCnd_hdr_sub_char2_NE(info);
		else if (ne == Cnd_hdr_sub_char3) doCnd_hdr_sub_char3_NE(info);
		else if (ne == Cnd_dtl_rpt_rmrks) doCnd_dtl_rpt_rmrks_NE(info);
		else if (ne == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NE(info);
		else if (ne == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NE(info);
		else if (ne == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NE(info);
		else if (ne == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NE(info);
		else if (ne == Cnd_show_pre_flg) doCnd_show_pre_flg_NE(info);
		else if (ne == Cnd_show_base_unit_flg) doCnd_show_base_unit_flg_NE(info);
		else if (ne == BulkSet_pf_usr_cd) doBulkSet_pf_usr_cd_NE(info);
		else if (ne == BulkSet_pf_usr_nm) doBulkSet_pf_usr_nm_NE(info);
		else if (ne == BulkSet_pf_dpt_cd) doBulkSet_pf_dpt_cd_NE(info);
		else if (ne == BulkSet_pf_dpt_nm) doBulkSet_pf_dpt_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_fix_flg) doRslt_fix_flg_NE(info);
		else if (ne == columnRslt_del_flg) doRslt_del_flg_NE(info);
		else if (ne == columnRslt_purc_commit_flg) doRslt_purc_commit_flg_NE(info);
		else if (ne == columnRslt_pf_period_typ) doRslt_pf_period_typ_NE(info);
		else if (ne == columnRslt_pf_period_typ_nm) doRslt_pf_period_typ_nm_NE(info);
		else if (ne == columnRslt_pf_period_st_dt) doRslt_pf_period_st_dt_NE(info);
		else if (ne == columnRslt_pf_period_end_dt) doRslt_pf_period_end_dt_NE(info);
		else if (ne == columnRslt_fix_period_flg) doRslt_fix_period_flg_NE(info);
		else if (ne == columnRslt_pre_fix_period_flg) doRslt_pre_fix_period_flg_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_pre_trd_unit_cd) doRslt_pre_trd_unit_cd_NE(info);
		else if (ne == columnRslt_pre_trd_unit_nm) doRslt_pre_trd_unit_nm_NE(info);
		else if (ne == columnRslt_pre_trd_unit_dec_place) doRslt_pre_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_dtl_rpt_rmrks) doRslt_dtl_rpt_rmrks_NE(info);
		else if (ne == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NE(info);
		else if (ne == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NE(info);
		else if (ne == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NE(info);
		else if (ne == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NE(info);
		else if (ne == columnRslt_latest_flg) doRslt_latest_flg_NE(info);
		else if (ne == columnRslt_pf_dt) doRslt_pf_dt_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_subcon_flg) doRslt_subcon_flg_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_pf_rpt_flg) doRslt_pf_rpt_flg_NE(info);
		else if (ne == columnRslt_pf_rpt_dt) doRslt_pf_rpt_dt_NE(info);
		else if (ne == columnRslt_pf_rpt_no) doRslt_pf_rpt_no_NE(info);
		else if (ne == columnRslt_del_pf_rpt_flg) doRslt_del_pf_rpt_flg_NE(info);
		else if (ne == columnRslt_del_pf_rpt_dt) doRslt_del_pf_rpt_dt_NE(info);
		else if (ne == columnRslt_hdr_rpt_rmrks) doRslt_hdr_rpt_rmrks_NE(info);
		else if (ne == columnRslt_hdr_intr_rmrks) doRslt_hdr_intr_rmrks_NE(info);
		else if (ne == columnRslt_hdr_sub_char1) doRslt_hdr_sub_char1_NE(info);
		else if (ne == columnRslt_hdr_sub_char2) doRslt_hdr_sub_char2_NE(info);
		else if (ne == columnRslt_hdr_sub_char3) doRslt_hdr_sub_char3_NE(info);
		else if (ne == columnRslt_pre_pf_dt) doRslt_pre_pf_dt_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
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
		else if (ne == Btn_prnt_flg) doBtn_prnt_flg_NE(info);
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
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_commit_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_commit_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_commit_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_commit_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pf_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_rpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_rpt_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_pre_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_pre_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_base_unit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_base_unit_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_commit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_commit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_period_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_period_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_fix_period_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_fix_period_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_pf_rpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_pf_rpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_pf_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_pf_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NE(MCEventInfo info){
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
	 * [Btn]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NE(MCEventInfo info){
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
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_disp_ope_Group) doCnd_disp_ope_NX(info);
		else if (nx == Cnd_fix_f_flg) doCnd_fix_f_flg_NX(info);
		else if (nx == Cnd_fix_t_flg) doCnd_fix_t_flg_NX(info);
		else if (nx == Cnd_rpt_f_flg) doCnd_rpt_f_flg_NX(info);
		else if (nx == Cnd_rpt_t_flg) doCnd_rpt_t_flg_NX(info);
		else if (nx == Cnd_del_f_flg) doCnd_del_f_flg_NX(info);
		else if (nx == Cnd_del_t_flg) doCnd_del_t_flg_NX(info);
		else if (nx == Cnd_subcon_t_flg) doCnd_subcon_t_flg_NX(info);
		else if (nx == Cnd_subcon_f_flg) doCnd_subcon_f_flg_NX(info);
		else if (nx == Cnd_purc_commit_t_flg) doCnd_purc_commit_t_flg_NX(info);
		else if (nx == Cnd_purc_commit_f_flg) doCnd_purc_commit_f_flg_NX(info);
		else if (nx == Cnd_pf_dt_fr) doCnd_pf_dt_fr_NX(info);
		else if (nx == Cnd_pf_dt_to) doCnd_pf_dt_to_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_pf_usr_cd) doCnd_pf_usr_cd_NX(info);
		else if (nx == Cnd_pf_usr_nm) doCnd_pf_usr_nm_NX(info);
		else if (nx == Cnd_pf_dpt_cd) doCnd_pf_dpt_cd_NX(info);
		else if (nx == Cnd_pf_dpt_nm) doCnd_pf_dpt_nm_NX(info);
		else if (nx == Cnd_pf_wg_cd) doCnd_pf_wg_cd_NX(info);
		else if (nx == Cnd_pf_wg_nm) doCnd_pf_wg_nm_NX(info);
		else if (nx == Cnd_pf_rpt_no) doCnd_pf_rpt_no_NX(info);
		else if (nx == Cnd_hdr_rpt_rmrks) doCnd_hdr_rpt_rmrks_NX(info);
		else if (nx == Cnd_hdr_intr_rmrks) doCnd_hdr_intr_rmrks_NX(info);
		else if (nx == Cnd_hdr_sub_char1) doCnd_hdr_sub_char1_NX(info);
		else if (nx == Cnd_hdr_sub_char2) doCnd_hdr_sub_char2_NX(info);
		else if (nx == Cnd_hdr_sub_char3) doCnd_hdr_sub_char3_NX(info);
		else if (nx == Cnd_dtl_rpt_rmrks) doCnd_dtl_rpt_rmrks_NX(info);
		else if (nx == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NX(info);
		else if (nx == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NX(info);
		else if (nx == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NX(info);
		else if (nx == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NX(info);
		else if (nx == Cnd_show_pre_flg) doCnd_show_pre_flg_NX(info);
		else if (nx == Cnd_show_base_unit_flg) doCnd_show_base_unit_flg_NX(info);
		else if (nx == BulkSet_pf_usr_cd) doBulkSet_pf_usr_cd_NX(info);
		else if (nx == BulkSet_pf_usr_nm) doBulkSet_pf_usr_nm_NX(info);
		else if (nx == BulkSet_pf_dpt_cd) doBulkSet_pf_dpt_cd_NX(info);
		else if (nx == BulkSet_pf_dpt_nm) doBulkSet_pf_dpt_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_fix_flg) doRslt_fix_flg_NX(info);
		else if (nx == columnRslt_del_flg) doRslt_del_flg_NX(info);
		else if (nx == columnRslt_purc_commit_flg) doRslt_purc_commit_flg_NX(info);
		else if (nx == columnRslt_pf_period_typ) doRslt_pf_period_typ_NX(info);
		else if (nx == columnRslt_pf_period_typ_nm) doRslt_pf_period_typ_nm_NX(info);
		else if (nx == columnRslt_pf_period_st_dt) doRslt_pf_period_st_dt_NX(info);
		else if (nx == columnRslt_pf_period_end_dt) doRslt_pf_period_end_dt_NX(info);
		else if (nx == columnRslt_fix_period_flg) doRslt_fix_period_flg_NX(info);
		else if (nx == columnRslt_pre_fix_period_flg) doRslt_pre_fix_period_flg_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_pre_trd_unit_cd) doRslt_pre_trd_unit_cd_NX(info);
		else if (nx == columnRslt_pre_trd_unit_nm) doRslt_pre_trd_unit_nm_NX(info);
		else if (nx == columnRslt_pre_trd_unit_dec_place) doRslt_pre_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_dtl_rpt_rmrks) doRslt_dtl_rpt_rmrks_NX(info);
		else if (nx == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NX(info);
		else if (nx == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NX(info);
		else if (nx == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NX(info);
		else if (nx == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NX(info);
		else if (nx == columnRslt_latest_flg) doRslt_latest_flg_NX(info);
		else if (nx == columnRslt_pf_dt) doRslt_pf_dt_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_subcon_flg) doRslt_subcon_flg_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_pf_rpt_flg) doRslt_pf_rpt_flg_NX(info);
		else if (nx == columnRslt_pf_rpt_dt) doRslt_pf_rpt_dt_NX(info);
		else if (nx == columnRslt_pf_rpt_no) doRslt_pf_rpt_no_NX(info);
		else if (nx == columnRslt_del_pf_rpt_flg) doRslt_del_pf_rpt_flg_NX(info);
		else if (nx == columnRslt_del_pf_rpt_dt) doRslt_del_pf_rpt_dt_NX(info);
		else if (nx == columnRslt_hdr_rpt_rmrks) doRslt_hdr_rpt_rmrks_NX(info);
		else if (nx == columnRslt_hdr_intr_rmrks) doRslt_hdr_intr_rmrks_NX(info);
		else if (nx == columnRslt_hdr_sub_char1) doRslt_hdr_sub_char1_NX(info);
		else if (nx == columnRslt_hdr_sub_char2) doRslt_hdr_sub_char2_NX(info);
		else if (nx == columnRslt_hdr_sub_char3) doRslt_hdr_sub_char3_NX(info);
		else if (nx == columnRslt_pre_pf_dt) doRslt_pre_pf_dt_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
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
		else if (nx == Btn_prnt_flg) doBtn_prnt_flg_NX(info);
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
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_commit_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_commit_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_commit_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_commit_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pf_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_rpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_rpt_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_pre_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_pre_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_base_unit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_base_unit_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_commit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_commit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_period_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_period_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_fix_period_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_fix_period_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_pf_rpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_pf_rpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_pf_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_pf_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NX(MCEventInfo info){
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
	 * [Btn]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_pf_dt_fr) doCnd_pf_dt_fr_LC(info);
		else if (lc == Cnd_pf_dt_to) doCnd_pf_dt_to_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_pf_usr_cd) doCnd_pf_usr_cd_LC(info);
		else if (lc == Cnd_pf_usr_nm) doCnd_pf_usr_nm_LC(info);
		else if (lc == Cnd_pf_dpt_cd) doCnd_pf_dpt_cd_LC(info);
		else if (lc == Cnd_pf_dpt_nm) doCnd_pf_dpt_nm_LC(info);
		else if (lc == Cnd_pf_wg_cd) doCnd_pf_wg_cd_LC(info);
		else if (lc == Cnd_pf_wg_nm) doCnd_pf_wg_nm_LC(info);
		else if (lc == Cnd_pf_rpt_no) doCnd_pf_rpt_no_LC(info);
		else if (lc == Cnd_hdr_rpt_rmrks) doCnd_hdr_rpt_rmrks_LC(info);
		else if (lc == Cnd_hdr_intr_rmrks) doCnd_hdr_intr_rmrks_LC(info);
		else if (lc == Cnd_hdr_sub_char1) doCnd_hdr_sub_char1_LC(info);
		else if (lc == Cnd_hdr_sub_char2) doCnd_hdr_sub_char2_LC(info);
		else if (lc == Cnd_hdr_sub_char3) doCnd_hdr_sub_char3_LC(info);
		else if (lc == Cnd_dtl_rpt_rmrks) doCnd_dtl_rpt_rmrks_LC(info);
		else if (lc == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_LC(info);
		else if (lc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_LC(info);
		else if (lc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_LC(info);
		else if (lc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_LC(info);
		else if (lc == BulkSet_pf_usr_cd) doBulkSet_pf_usr_cd_LC(info);
		else if (lc == BulkSet_pf_usr_nm) doBulkSet_pf_usr_nm_LC(info);
		else if (lc == BulkSet_pf_dpt_cd) doBulkSet_pf_dpt_cd_LC(info);
		else if (lc == BulkSet_pf_dpt_nm) doBulkSet_pf_dpt_nm_LC(info);
		else if (lc == columnRslt_pf_period_typ) doRslt_pf_period_typ_LC(info);
		else if (lc == columnRslt_pf_period_typ_nm) doRslt_pf_period_typ_nm_LC(info);
		else if (lc == columnRslt_pf_period_st_dt) doRslt_pf_period_st_dt_LC(info);
		else if (lc == columnRslt_pf_period_end_dt) doRslt_pf_period_end_dt_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_pre_trd_unit_cd) doRslt_pre_trd_unit_cd_LC(info);
		else if (lc == columnRslt_pre_trd_unit_nm) doRslt_pre_trd_unit_nm_LC(info);
		else if (lc == columnRslt_pre_trd_unit_dec_place) doRslt_pre_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_dtl_rpt_rmrks) doRslt_dtl_rpt_rmrks_LC(info);
		else if (lc == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_LC(info);
		else if (lc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_LC(info);
		else if (lc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_LC(info);
		else if (lc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_LC(info);
		else if (lc == columnRslt_pf_dt) doRslt_pf_dt_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_pf_rpt_dt) doRslt_pf_rpt_dt_LC(info);
		else if (lc == columnRslt_pf_rpt_no) doRslt_pf_rpt_no_LC(info);
		else if (lc == columnRslt_del_pf_rpt_dt) doRslt_del_pf_rpt_dt_LC(info);
		else if (lc == columnRslt_hdr_rpt_rmrks) doRslt_hdr_rpt_rmrks_LC(info);
		else if (lc == columnRslt_hdr_intr_rmrks) doRslt_hdr_intr_rmrks_LC(info);
		else if (lc == columnRslt_hdr_sub_char1) doRslt_hdr_sub_char1_LC(info);
		else if (lc == columnRslt_hdr_sub_char2) doRslt_hdr_sub_char2_LC(info);
		else if (lc == columnRslt_hdr_sub_char3) doRslt_hdr_sub_char3_LC(info);
		else if (lc == columnRslt_pre_pf_dt) doRslt_pre_pf_dt_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
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
	 * [Cnd]パネルの[pf_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pf_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pf_rpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pf_rpt_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pf_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pf_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_period_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_period_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_trd_unit_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pf_rpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pf_rpt_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_pf_rpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_pf_rpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hdr_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hdr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_pf_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_pf_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pf_usr_cd]の作成メソッド
	 */
	public MCList getCnd_pf_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pf_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_pf_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pf_wg_cd]の作成メソッド
	 */
	public MCList getCnd_pf_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_pf_usr_cd]の作成メソッド
	 */
	public MCList getBulkSet_pf_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_pf_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_pf_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBDL0210.Srch01")) {
			return new MS_MSBDL0210_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0210.Srch02")) {
			return new MS_MSBDL0210_Srch02Bridge();
		}
		if (id.equals("MS.MSBDL0210.Upd01")) {
			return new MS_MSBDL0210_Upd01Bridge();
		}
		if (id.equals("MS.MSBDL0210.Upd02")) {
			return new MS_MSBDL0210_Upd02Bridge();
		}
		if (id.equals("MS.MSBDL0210.Imp01")) {
			return new MS_MSBDL0210_Imp01Bridge();
		}
		if (id.equals("MS.MSBDL0210.Del01")) {
			return new MS_MSBDL0210_Del01Bridge();
		}
		if (id.equals("MS.MSBDL0210.Del02")) {
			return new MS_MSBDL0210_Del02Bridge();
		}
		if (id.equals("MS.MSBDL0210.Prnt01")) {
			return new MS_MSBDL0210_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0210_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0210_Srch01Bridge() {
			p_MS_MSBDL0210_Srch01 = new MCParam(PDef.MS_MSBDL0210_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0210_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0210.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));

			p_MS_MSBDL0210_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0210_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0210_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0210_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0210_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0210.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0210.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0210_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0210_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)p_MS_MSBDL0210_Srch01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MS_MSBDL0210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0210_Srch02;

		/** コンストラクタ */
		protected MS_MSBDL0210_Srch02Bridge() {
			p_MS_MSBDL0210_Srch02 = new MCParam(PDef.MS_MSBDL0210_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0210_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0210.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));

			p_MS_MSBDL0210_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0210_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0210_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0210_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0210_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0210.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0210.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0210_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0210_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)p_MS_MSBDL0210_Srch02.getContainerParam().getDownBlock(0));
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
	/**
	 * [MS_MSBDL0210_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0210_Upd01;

		/** コンストラクタ */
		protected MS_MSBDL0210_Upd01Bridge() {
			p_MS_MSBDL0210_Upd01 = new MCParam(PDef.MS_MSBDL0210_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0210_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0210.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));

			p_MS_MSBDL0210_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0210_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0210_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0210_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0210_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0210_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0210.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0210.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0210_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0210_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)p_MS_MSBDL0210_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0210_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0210_Upd02;

		/** コンストラクタ */
		protected MS_MSBDL0210_Upd02Bridge() {
			p_MS_MSBDL0210_Upd02 = new MCParam(PDef.MS_MSBDL0210_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0210_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));

			p_MS_MSBDL0210_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0210_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0210_Upd02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0210_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0210_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0210_Upd02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0210_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)p_MS_MSBDL0210_Upd02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0210_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0210_Imp01;

		/** コンストラクタ */
		protected MS_MSBDL0210_Imp01Bridge() {
			p_MS_MSBDL0210_Imp01 = new MCParam(PDef.MS_MSBDL0210_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0210_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));

			p_MS_MSBDL0210_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0210_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0210_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0210_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0210_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0210_Imp01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0210_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)p_MS_MSBDL0210_Imp01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0210_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0210_Del01;

		/** コンストラクタ */
		protected MS_MSBDL0210_Del01Bridge() {
			p_MS_MSBDL0210_Del01 = new MCParam(PDef.MS_MSBDL0210_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0210_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0210.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));

			p_MS_MSBDL0210_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0210_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0210_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0210_Del01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0210_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0210_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0210.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0210.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0210_Del01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0210_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)p_MS_MSBDL0210_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0210_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0210_Del02;

		/** コンストラクタ */
		protected MS_MSBDL0210_Del02Bridge() {
			p_MS_MSBDL0210_Del02 = new MCParam(PDef.MS_MSBDL0210_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0210_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));

			p_MS_MSBDL0210_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0210_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0210_Del02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0210_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0210_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0210_Del02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0210_Del02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)p_MS_MSBDL0210_Del02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0210_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0210_Prnt01;

		/** コンストラクタ */
		protected MS_MSBDL0210_Prnt01Bridge() {
			p_MS_MSBDL0210_Prnt01 = new MCParam(PDef.MS_MSBDL0210_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0210_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0210.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));

			p_MS_MSBDL0210_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0210_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0210_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0210_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0210_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0210_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0210.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0210.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0210.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0210_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0210.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0210_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0210.RsltR>)p_MS_MSBDL0210_Prnt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}